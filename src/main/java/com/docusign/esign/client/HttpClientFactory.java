package com.docusign.esign.client;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.glassfish.jersey.client.spi.Connector;
import org.glassfish.jersey.client.spi.ConnectorProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

import javax.net.ssl.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.io.IOException;
import java.net.*;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.function.Consumer;

/** Handles {@link Client} instance initialization. */
final class HttpClientFactory {
  private static final SSLContext sslContext;

  static {
    // Setup the SSLContext object to use for HTTPS connections to the API
    try {
      System.setProperty("https.protocols", "TLSv1.2"); // Force TLS v1.2
      sslContext = SSLContext.getInstance("TLSv1.2");
      sslContext.init(null, new TrustManager[]{new SecureTrustManager()}, new SecureRandom());
    } catch (final Exception ex) {
      throw new RuntimeException("failed to initialize SSL context", ex);
    }
    HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
  }

  static Client buildHttpClient(boolean debugging, JSON json, Consumer<ClientConfig> configurer) {
    final ClientConfig clientConfig = new ClientConfig();
    clientConfig.register(MultiPartFeature.class);
    clientConfig.register(json);
    clientConfig.register(JacksonFeature.class);
    clientConfig.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true);
    // turn off compliance validation to be able to send payloads with DELETE calls
    clientConfig.property(ClientProperties.SUPPRESS_HTTP_COMPLIANCE_VALIDATION, true);
    if (debugging) {
      clientConfig.register(new LoggingFeature(java.util.logging.Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME), java.util.logging.Level.INFO, LoggingFeature.Verbosity.PAYLOAD_ANY, 1024 * 50 /* Log payloads up to 50K */));
      clientConfig.property(LoggingFeature.LOGGING_FEATURE_VERBOSITY, LoggingFeature.Verbosity.PAYLOAD_ANY);
      // Set logger to ALL
      java.util.logging.Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME).setLevel(java.util.logging.Level.ALL);
    } else {
      // suppress warnings for payloads with DELETE calls:
      java.util.logging.Logger.getLogger("org.glassfish.jersey.client").setLevel(java.util.logging.Level.SEVERE);
    }

    configurer.accept(clientConfig);

    clientConfig.connectorProvider(new ConnectorProvider() {
      Proxy p = null;

      /*
       * Returns whether the host is part of the list of hosts that should be accessed without going through the proxy
       */
      private boolean isNonProxyHost(String host, String nonProxyHosts) {
        if (null == host || null == nonProxyHosts) {
          return false;
        }

        for (String spec : nonProxyHosts.split("\\|")) {
          int length = spec.length();
          StringBuilder sb = new StringBuilder(length);
          for (int i = 0; i < length; i++) {
            char c = spec.charAt(i);
            switch (c) {
              case '*':
                sb.append(".*");
                break;
              case '.':
                sb.append("\\.");
                break;
              default:
                sb.append(c);
            }
          }
          if (host.matches(sb.toString())) return true;
        }

        return false;
      }

      @Override
      public Connector getConnector(Client client, javax.ws.rs.core.Configuration configuration) {
        HttpUrlConnectorProvider customConnProv = new HttpUrlConnectorProvider();
        customConnProv.connectionFactory(new HttpUrlConnectorProvider.ConnectionFactory() {
          @Override
          public HttpURLConnection getConnection(java.net.URL url) throws IOException {
            if (url == null) {
              return null;
            }

            if (isNonProxyHost(url.getHost(), System.getProperty("http.nonProxyHosts"))) {
              HttpsURLConnection connection = (HttpsURLConnection) url.openConnection(Proxy.NO_PROXY);
              connection.setSSLSocketFactory(sslContext.getSocketFactory());
              return connection;
            }

            // set up the proxy/no-proxy settings
            if (p == null) {
              if (System.getProperty("https.proxyHost") != null) {
                // set up the proxy host and port
                final String host = System.getProperty("https.proxyHost");
                final Integer port = Integer.getInteger("https.proxyPort");
                if (host != null && port != null) {
                  p = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
                }
                // set up optional proxy authentication credentials
                final String user = System.getProperty("https.proxyUser");
                final String password = System.getProperty("https.proxyPassword");
                if (user != null && password != null) {
                  Authenticator.setDefault(new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                      if (getRequestorType() == RequestorType.PROXY && getRequestingHost().equalsIgnoreCase(host) && port == getRequestingPort()) {
                        return new PasswordAuthentication(user, password.toCharArray());
                      }
                      return null;
                    }
                  });
                }
              } else if (System.getProperty("http.proxyHost") != null) {
                // set up the proxy host and port
                final String host = System.getProperty("http.proxyHost");
                final Integer port = Integer.getInteger("http.proxyPort");
                if (host != null && port != null) {
                  p = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
                }
                // set up optional proxy authentication credentials
                final String user = System.getProperty("http.proxyUser");
                final String password = System.getProperty("http.proxyPassword");
                if (user != null && password != null) {
                  Authenticator.setDefault(new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                      if (getRequestorType() == RequestorType.PROXY && getRequestingHost().equalsIgnoreCase(host) && port == getRequestingPort()) {
                        return new PasswordAuthentication(user, password.toCharArray());
                      }
                      return null;
                    }
                  });
                }
              }
              // no-proxy fallback if the proxy settings are misconfigured in the system properties
              if (p == null) {
                p = Proxy.NO_PROXY;
              }
            }

            HostnameVerifier allHostsValid = new InsecureHostnameVerifier();
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection(p);
            connection.setSSLSocketFactory(sslContext.getSocketFactory());
            connection.setHostnameVerifier(allHostsValid);
            return connection;
          }
        });
        return customConnProv.getConnector(client, configuration);
      }
    });

    return ClientBuilder.newBuilder().
            sslContext(sslContext).
            withConfig(clientConfig).build();
  }

  private static class InsecureHostnameVerifier implements HostnameVerifier {
    @Override
    public boolean verify(String hostname, SSLSession session) {
      return true;
    }
  }

  private static class SecureTrustManager implements X509TrustManager {

    @Override
    public void checkClientTrusted(X509Certificate[] arg0, String arg1)
            throws CertificateException {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] arg0, String arg1)
            throws CertificateException {
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
      return new X509Certificate[0];
    }

    public boolean isClientTrusted(X509Certificate[] arg0) {
      return true;
    }

    public boolean isServerTrusted(X509Certificate[] arg0) {
      return true;
    }

  }
}
