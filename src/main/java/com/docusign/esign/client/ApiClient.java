package com.docusign.esign.client;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.datatype.joda.*;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.migcomponents.migbase64.Base64;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.client.urlconnection.HTTPSProperties;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.client.urlconnection.URLConnectionClientHandler;
import com.sun.jersey.client.urlconnection.HttpURLConnectionFactory;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.core.Response.Status.Family;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilderException;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import java.net.URI;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.net.URL;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.docusign.esign.client.auth.Authentication;
import com.docusign.esign.client.auth.HttpBasicAuth;
import com.docusign.esign.client.auth.JWTUtils;
import com.docusign.esign.client.auth.ApiKeyAuth;
import com.docusign.esign.client.auth.OAuth;
import com.docusign.esign.client.auth.AccessTokenListener;
import com.docusign.esign.client.auth.OAuthFlow;


public class ApiClient {
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  // Rest API base path constants
  /** live/production base path */
  public final static String PRODUCTION_REST_BASEPATH = "https://www.docusign.net/restapi";
  /** sandbox/demo base path */
  public final static String DEMO_REST_BASEPATH = "https://demo.docusign.net/restapi";
  /** stage base path */
  public final static String STAGE_REST_BASEPATH = "https://stage.docusign.net/restapi";

  private String basePath = PRODUCTION_REST_BASEPATH;
  private String oAuthBasePath = OAuth.PRODUCTION_OAUTH_BASEPATH;
  private boolean debugging = false;
  private int connectionTimeout = 0;
  private int readTimeout = 0;

  private Client httpClient;
  private ObjectMapper mapper;

  private Map<String, Authentication> authentications;

  private int statusCode;
  private Map<String, List<String>> responseHeaders;

  private DateFormat dateFormat;
  private SSLContext sslContext = null;

  public ApiClient() {
    mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
    mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
    mapper.registerModule(new JodaModule());
    httpClient = buildHttpClient(debugging);

    // Use RFC3339 format for date and datetime.
    // See http://xml2rfc.ietf.org/public/rfc/html/rfc3339.html#anchor14
    dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    // Use UTC as the default time zone.
    dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

    mapper.setDateFormat((DateFormat) dateFormat.clone());

    // Set default User-Agent.
    setUserAgent("Swagger-Codegen/2.10.0-RC2/java");

    // Setup authentications (key: authentication name, value: authentication).
    authentications = new HashMap<String, Authentication>();
    authentications.put("docusignAccessCode", new OAuth(null, null, null));

    // Derive the OAuth base path from the Rest API base url
    this.deriveOAuthBasePathFromRestBasePath();

    rebuildHttpClient();
  }

  public ApiClient(String basePath) {
    this();
    this.basePath = basePath;
    this.deriveOAuthBasePathFromRestBasePath();
  }

  public ApiClient(String oAuthBasePath, String[] authNames) {
    this();
    this.setOAuthBasePath(oAuthBasePath);
    for(String authName : authNames) {
      Authentication auth;
      if ("docusignAccessCode".equals(authName)) {
        auth = new OAuth(httpClient, OAuthFlow.accessCode, oAuthBasePath + "/oauth/auth", oAuthBasePath + "/oauth/token", "all");
      } else if ("docusignApiKey".equals(authName)) {
        auth = new ApiKeyAuth("header", "docusignApiKey");
      } else {
        throw new RuntimeException("auth name \"" + authName + "\" not found in available auth names");
      }
      addAuthorization(authName, auth);
    }
  }

  /**
   * Basic constructor for single auth name
   * @param authName
   */
  public ApiClient(String oAuthBasePath, String authName) {
    this(oAuthBasePath, new String[]{authName});
  }

  /**
   * Helper constructor for OAuth2
   * @param oAuthBasePath The API base path
   * @param authName the authentication method name ("oauth" or "api_key")
   * @param clientId OAuth2 Client ID
   * @param secret OAuth2 Client secret
   */
  public ApiClient(String oAuthBasePath, String authName, String clientId, String secret) {
     this(oAuthBasePath, authName);
     this.getTokenEndPoint()
            .setClientId(clientId)
            .setClientSecret(secret);
  }

  /**
   * Build the Client used to make HTTP requests with the latest settings,
   * i.e. mapper and debugging.
   * TODO: better to use the Builder Pattern?
   * @return API client
   */
  public ApiClient rebuildHttpClient() {
    // Add the JSON serialization support to Jersey
    JacksonJsonProvider jsonProvider = new JacksonJsonProvider(mapper);
    DefaultClientConfig conf = new DefaultClientConfig();
    conf.getSingletons().add(jsonProvider);
    Client client = Client.create(conf);
    if (debugging) {
      client.addFilter(new LoggingFilter());
    }
    this.httpClient = client;
    return this;
  }

  /**
   * Returns the current object mapper used for JSON serialization/deserialization.
   * <p>
   * Note: If you make changes to the object mapper, remember to set it back via
   * <code>setObjectMapper</code> in order to trigger HTTP client rebuilding.
   * </p>
   * @return Object mapper
   */
  public ObjectMapper getObjectMapper() {
    return mapper;
  }

  public ApiClient setObjectMapper(ObjectMapper mapper) {
    this.mapper = mapper;
    // Need to rebuild the Client as it depends on object mapper.
    rebuildHttpClient();
    return this;
  }

  public Client getHttpClient() {
    return httpClient;
  }

  public ApiClient setHttpClient(Client httpClient) {
    this.httpClient = httpClient;
    return this;
  }

  public String getBasePath() {
    return basePath;
  }

  public ApiClient setBasePath(String basePath) {
    this.basePath = basePath;
    this.deriveOAuthBasePathFromRestBasePath();
    return this;
  }

  /**
   * Gets the status code of the previous request
   * @return Status code
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * Gets the response headers of the previous request
   * @return Response headers
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get authentications (key: authentication name, value: authentication).
   * @return Map of authentication
   */
  public Map<String, Authentication> getAuthentications() {
    return authentications;
  }

  /**
   * Get authentication for the given name.
   *
   * @param authName The authentication name
   * @return The authentication, null if not found
   */
  public Authentication getAuthentication(String authName) {
    return authentications.get(authName);
  }

  public void addAuthorization(String authName, Authentication auth) {
    authentications.put(authName, auth);
  }

  /**
   * Helper method to set username for the first HTTP basic authentication.
   * @param username Username
   */
  public void setUsername(String username) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setUsername(username);
        return;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set password for the first HTTP basic authentication.
   * @param password Password
   */
  public void setPassword(String password) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setPassword(password);
        return;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set API key value for the first API key authentication.
   * @param apiKey API key
   */
  public void setApiKey(String apiKey) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKey(apiKey);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Helper method to set API key prefix for the first API key authentication.
   * @param apiKeyPrefix API key prefix
   */
  public void setApiKeyPrefix(String apiKeyPrefix) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKeyPrefix(apiKeyPrefix);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Helper method to set access token for the first OAuth2 authentication.
   * @param accessToken Access token
   */
  public void updateAccessToken() {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        ((OAuth) auth).updateAccessToken();
        return;
      }
    }
    throw new RuntimeException("No OAuth2 authentication configured!");
  }

  /**
   * Helper method to preset the OAuth access token of the first OAuth found in the apiAuthorizations (there should be only one)
   * @param accessToken OAuth access token
   * @param expiresIn Validity period of the access token in seconds
   */
  public void setAccessToken(final String accessToken, final Long expiresIn) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        ((OAuth) auth).setAccessToken(accessToken, expiresIn);
        return;
      }
    }
    OAuth oAuth = new OAuth(null, null, null);
    oAuth.setAccessToken(accessToken, expiresIn);
    addAuthorization("docusignAccessCode", oAuth);
  }

  public String getAccessToken() {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        return ((OAuth) auth).getAccessToken();
      }
    }
    return null;
  }

  /**
   * Set the User-Agent header's value (by adding to the default header map).
   * @param userAgent User agent
   * @return API client
   */
  public ApiClient setUserAgent(String userAgent) {
    addDefaultHeader("User-Agent", userAgent);
    return this;
  }

  /**
   * Add a default header.
   *
   * @param key The header's key
   * @param value The header's value
   * @return API client
   */
  public ApiClient addDefaultHeader(String key, String value) {
    defaultHeaderMap.put(key, value);
    return this;
  }

  /**
   * Check that whether debugging is enabled for this API client.
   * @return True if debugging is on
   */
  public boolean isDebugging() {
    return debugging;
  }

  /**
   * Enable/disable debugging for this API client.
   *
   * @param debugging To enable (true) or disable (false) debugging
   * @return API client
   */
  public ApiClient setDebugging(boolean debugging) {
    this.debugging = debugging;
    // Need to rebuild the Client as it depends on the value of debugging.
    this.httpClient = buildHttpClient(debugging);
    return this;
  }

  /**
   * Connect timeout (in milliseconds).
   * @return Connection timeout
   */
  public int getConnectTimeout() {
    return connectionTimeout;
  }

  /**
   * Set the connect timeout (in milliseconds).
   * A value of 0 means no timeout, otherwise values must be between 1 and
   * {@link Integer#MAX_VALUE}.
   * @param connectionTimeout Connection timeout in milliseconds
   * @return API client
   */
   public ApiClient setConnectTimeout(int connectionTimeout) {
     this.connectionTimeout = connectionTimeout;
     httpClient.setConnectTimeout(connectionTimeout);
     return this;
   }

  /**
   * Read timeout (in milliseconds).
   */
  public int getReadTimeout() {
    return readTimeout;
  }

  /**
   * Set the read timeout (in milliseconds).
   * A value of 0 means no timeout, otherwise values must be between 1 and
   * {@link Integer#MAX_VALUE}.
   */
   public ApiClient setReadTimeout(int readTimeout) {
     this.readTimeout = readTimeout;
     httpClient.setReadTimeout(readTimeout);
     return this;
   }

  /**
   * Get the date format used to parse/format date parameters.
   * @return Date format
   */
  public DateFormat getDateFormat() {
    return dateFormat;
  }

  /**
   * Set the date format used to parse/format date parameters.
   * @param dateFormat Date format
   * @return API client
   */
  public ApiClient setDateFormat(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
    // Also set the date format for model (de)serialization with Date properties.
    this.mapper.setDateFormat((DateFormat) dateFormat.clone());
    // Need to rebuild the Client as mapper changes.
    rebuildHttpClient();
    return this;
  }

  /**
   * Helper method to configure the token endpoint of the first oauth found in the authentications (there should be only one)
   * @return
   */
  public TokenRequestBuilder getTokenEndPoint() {
    for(Authentication auth : getAuthentications().values()) {
      if (auth instanceof OAuth) {
        OAuth oauth = (OAuth) auth;
        return oauth.getTokenRequestBuilder();
      }
    }
    return null;
  }


  /**
    * Helper method to configure authorization endpoint of the first oauth found in the authentications (there should be only one)
    * @return
    */
  public AuthenticationRequestBuilder getAuthorizationEndPoint() {
    for(Authentication auth : authentications.values()) {
     if (auth instanceof OAuth) {
        OAuth oauth = (OAuth) auth;
        return oauth.getAuthenticationRequestBuilder();
      }
    }
    return null;
  }

  /**
   * Helper method to configure the OAuth accessCode/implicit flow parameters
   * @param clientId OAuth2 client ID
   * @param clientSecret OAuth2 client secret
   * @param redirectURI OAuth2 redirect uri
   */
  public void configureAuthorizationFlow(String clientId, String clientSecret, String redirectURI) {
    for(Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        OAuth oauth = (OAuth) auth;
        oauth.getTokenRequestBuilder()
              .setClientId(clientId)
              .setClientSecret(clientSecret)
              .setRedirectURI(redirectURI);
        oauth.getAuthenticationRequestBuilder()
              .setClientId(clientId)
              .setRedirectURI(redirectURI);
        return;
      }
    }
  }

  public String getAuthorizationUri() throws OAuthSystemException {
  	return getAuthorizationEndPoint().buildQueryMessage().getLocationUri();
  }

  /**
   * Helper method to configure the OAuth accessCode/implicit flow parameters
   * @param clientId OAuth2 client ID: Identifies the client making the request.
   * Client applications may be scoped to a limited set of system access.
   * @param scopes the list of requested scopes. Values include {@link OAuth#Scope_SIGNATURE}, {@link OAuth#Scope_EXTENDED}, {@link OAuth#Scope_IMPERSONATION}. You can also pass any advanced scope.
   * @param redirectUri this determines where to deliver the response containing the authorization code or access token.
   * @param responseType determines the response type of the authorization request.
   * <br><i>Note</i>: these response types are mutually exclusive for a client application.
   * A public/native client application may only request a response type of "token";
   * a private/trusted client application may only request a response type of "code".
   * @param state Allows for arbitrary state that may be useful to your application.
   * The value in this parameter will be round-tripped along with the response so you can make sure it didn't change.
   */
  public URI getAuthorizationUri(String clientId, java.util.List<String> scopes, String redirectUri, String responseType, String state) throws IllegalArgumentException, UriBuilderException {
    String formattedScopes = (scopes == null || scopes.size() < 1) ? "" : scopes.get(0);
    StringBuilder sb = new StringBuilder(formattedScopes);
    for (int i = 1; i < scopes.size(); i++) {
      sb.append("%20" + scopes.get(i));
    }

    UriBuilder builder = UriBuilder.fromUri(getOAuthBasePath())
            .scheme("https")
            .path("/oauth/auth")
            .queryParam("response_type", responseType)
            .queryParam("scope", sb.toString())
            .queryParam("client_id", clientId)
            .queryParam("redirect_uri", redirectUri);
    if (state != null) {
      builder = builder.queryParam("state", state);
    }
    return builder.build();
  }

  /**
   * Helper method to configure the OAuth accessCode/implicit flow parameters
   * @param clientId OAuth2 client ID: Identifies the client making the request.
   * Client applications may be scoped to a limited set of system access.
   * @param scopes the list of requested scopes. Values include {@link OAuth#Scope_SIGNATURE}, {@link OAuth#Scope_EXTENDED}, {@link OAuth#Scope_IMPERSONATION}. You can also pass any advanced scope.
   * @param redirectUri this determines where to deliver the response containing the authorization code or access token.
   * @param responseType determines the response type of the authorization request.
   * <br><i>Note</i>: these response types are mutually exclusive for a client application.
   * A public/native client application may only request a response type of "token";
   * a private/trusted client application may only request a response type of "code".
   */
  public URI getAuthorizationUri(String clientId, java.util.List<String> scopes, String redirectUri, String responseType) throws IllegalArgumentException, UriBuilderException {
    return this.getAuthorizationUri(clientId, scopes, redirectUri, responseType, null);
  }

  private void deriveOAuthBasePathFromRestBasePath() {
    if (this.basePath == null) { // this case should not happen but just in case
      this.oAuthBasePath = OAuth.PRODUCTION_OAUTH_BASEPATH;
    } else if (this.basePath.startsWith("https://demo") || this.basePath.startsWith("http://demo")) {
      this.oAuthBasePath = OAuth.DEMO_OAUTH_BASEPATH;
    } else if (this.basePath.startsWith("https://stage") || this.basePath.startsWith("http://stage")) {
      this.oAuthBasePath = OAuth.STAGE_OAUTH_BASEPATH;
    } else {
      this.oAuthBasePath = OAuth.PRODUCTION_OAUTH_BASEPATH;
    }
  }

  private String getOAuthBasePath() {
    return this.oAuthBasePath;
  }

  /**
   * Sets the OAuth base path. Values include {@link OAuth#PRODUCTION_BASEPATH}, {@link OAuth#DEMO_BASEPATH} and custom (e.g. "account-s.docusign.com")
   * @param oAuthBasePath the new value for the OAuth base path
   * @return this instance of the ApiClient updated with the new OAuth base path
   */
  public ApiClient setOAuthBasePath(String oAuthBasePath) {
    this.oAuthBasePath = oAuthBasePath;
    return this;
  }

  /**
   *
   * @param clientId OAuth2 client ID: Identifies the client making the request.
   * Client applications may be scoped to a limited set of system access.
   * @param clientSecret the secret key you generated when you set up the integration in DocuSign Admin console.
   * @param code The authorization code that you received from the <i>getAuthorizationUri</i> callback.
   * @return OAuth.OAuthToken object.
   * @throws ApiException if the HTTP call status is different than 2xx.
   * @throws IOException  if there is a problem while parsing the reponse object.
   * @see OAuth.OAuthToken
   */
  public OAuth.OAuthToken generateAccessToken(String clientId, String clientSecret, String code) throws ApiException, IOException {
    try {
      String clientStr = (clientId == null ? "" : clientId) + ":" + (clientSecret == null ? "" : clientSecret);
      MultivaluedMap<String, String> form = new MultivaluedMapImpl();
      form.add("code", code);
      form.add("grant_type", "authorization_code");

      Client client = buildHttpClient(debugging);
      WebResource webResource = client.resource("https://" + getOAuthBasePath() + "/oauth/token");
      ClientResponse response = webResource
              .type(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
              .header("Authorization", "Basic " + Base64.encodeToString(clientStr.getBytes("UTF-8"), false))
              .header("Cache-Control", "no-store")
              .header("Pragma", "no-cache")
              .post(ClientResponse.class, form);

      if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
        String respBody = response.getEntity(String.class);
        throw new ApiException(
              response.getStatusInfo().getStatusCode(),
              "Error while requesting server, received a non successful HTTP code " + response.getStatusInfo().getStatusCode() + " with response Body: '" + respBody + "'",
              response.getHeaders(),
              respBody);
      }
      ObjectMapper mapper = new ObjectMapper();
      mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      OAuth.OAuthToken oAuthToken = mapper.readValue(response.getEntityInputStream(), OAuth.OAuthToken.class);
      return oAuthToken;
    } catch (JsonParseException e) {
      throw new ApiException("Error while parsing the response for the access token: " + e.getMessage());
    } catch (JsonMappingException e) {
      throw e;
    } catch (IOException e) {
      throw e;
    }
  }

  /**
   *
   * @param accessToken the bearer token to use to authenticate for this call.
   * @return OAuth UserInfo model
   * @throws ApiException if the HTTP call status is different than 2xx.
   * @see OAuth.UserInfo
   */
  public OAuth.UserInfo getUserInfo(String accessToken) throws IllegalArgumentException, ApiException {
    try {
      if (accessToken == null || "".equals(accessToken)) {
        throw new IllegalArgumentException("Cannot find a valid access token. Make sure OAuth is configured before you try again.");
      }

      Client client = buildHttpClient(debugging);
      WebResource webResource = client.resource("https://" + getOAuthBasePath() + "/oauth/userinfo");
      ClientResponse response = webResource
          .header("Authorization", "Bearer " + accessToken)
          .header("Cache-Control", "no-store")
          .header("Pragma", "no-cache")
          .get(ClientResponse.class);
      if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
        String respBody = response.getEntity(String.class);
        throw new ApiException(
                response.getStatusInfo().getStatusCode(),
                "Error while requesting server, received a non successful HTTP code " + response.getStatusInfo().getStatusCode() + " with response Body: '" + respBody + "'",
                response.getHeaders(),
                respBody);
      }
      ObjectMapper mapper = new ObjectMapper();
      mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      OAuth.UserInfo userInfo = mapper.readValue(response.getEntityInputStream(), OAuth.UserInfo.class);

      // TODO "auto-assign base uri of the default account" is coming in next versions
      /*for (OAuth.UserInfo.Account account: userInfo.getAccounts()) {
          if ("true".equals(account.getIsDefault())) {
              setBasePath(account.getBaseUri() + "/restapi");
              Configuration.setDefaultApiClient(this);
              return userInfo;
          }
      }*/
      return userInfo;
    } catch (Exception e) {
      throw new ApiException("Error while fetching user info: " + e.getMessage());
    }
  }

  /**
   * Configures a listener which is notified when a new access token is received.
   * @param accessTokenListener
   */
  public void registerAccessTokenListener(AccessTokenListener accessTokenListener) {
    for(Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        OAuth oauth = (OAuth) auth;
        oauth.registerAccessTokenListener(accessTokenListener);
        return;
      }
    }
  }

  /**
   * Helper method to build the OAuth JWT grant uri (used once to get a user consent for impersonation)
   * @param clientId OAuth2 client ID
   * @param redirectURI OAuth2 redirect uri
   * @return the OAuth JWT grant uri as a String
   */
  public String getJWTUri(String clientId, String redirectURI, String oAuthBasePath) {
    return UriBuilder.fromUri(oAuthBasePath)
    .scheme("https")
    .path("/oauth/auth")
    .queryParam("response_type", "code")
    .queryParam("scope", "signature%20impersonation")
    .queryParam("client_id", clientId)
    .queryParam("redirect_uri", redirectURI)
    .build().toString();
  }

  /**
   * Configures the current instance of ApiClient with a fresh OAuth JWT access token from DocuSign
   * @param publicKeyFilename the filename of the RSA public key
   * @param privateKeyFilename the filename of the RSA private key
   * @param oAuthBasePath DocuSign OAuth base path (account-d.docusign.com for the developer sandbox
 			and account.docusign.com for the production platform)
   * @param clientId DocuSign OAuth Client Id (AKA Integrator Key)
   * @param userId DocuSign user Id to be impersonated (This is a UUID)
   * @param expiresIn number of seconds remaining before the JWT assertion is considered as invalid
   * @throws IOException if there is an issue with either the public or private file
   * @throws ApiException if there is an error while exchanging the JWT with an access token
   * @deprecated  As of release 2.7.0, replaced by {@link #requestJWTUserToken()} and {@link #requestJWTApplicationToken()}
   */
  @Deprecated public void configureJWTAuthorizationFlow(String publicKeyFilename, String privateKeyFilename, String oAuthBasePath, String clientId, String userId, long expiresIn) throws IOException, ApiException {
    try {
      String assertion = JWTUtils.generateJWTAssertion(publicKeyFilename, privateKeyFilename, oAuthBasePath, clientId, userId, expiresIn);
      MultivaluedMap<String, String> form = new MultivaluedMapImpl();
      form.add("assertion", assertion);
      form.add("grant_type", OAuth.GRANT_TYPE_JWT);

      Client client = buildHttpClient(debugging);
      WebResource webResource = client.resource("https://" + oAuthBasePath + "/oauth/token");
      ClientResponse response = webResource
              .type(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
              .header("Cache-Control", "no-store")
              .header("Pragma", "no-cache")
              .post(ClientResponse.class, form);

      ObjectMapper mapper = new ObjectMapper();
      mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      JsonNode responseJson = mapper.readValue(response.getEntityInputStream(), JsonNode.class);
      if (!responseJson.has("access_token") || !responseJson.has("expires_in")) {
        throw new ApiException("Error while requesting an access token: " + responseJson);
      }
      String accessToken = responseJson.get("access_token").asText();
      expiresIn = responseJson.get("expires_in").asLong();
      setAccessToken(accessToken, expiresIn);
    } catch (JsonParseException e) {
      throw new ApiException("Error while parsing the response for the access token.");
    } catch (JsonMappingException e) {
      throw e;
    } catch (IOException e) {
      throw e;
    }
  }

  /**
   * Configures the current instance of ApiClient with a fresh OAuth JWT access token from DocuSign
   * @param clientId DocuSign OAuth Client Id (AKA Integrator Key)
   * @param userId DocuSign user Id to be impersonated (This is a UUID)
   * @param scopes the list of requested scopes. Values include {@link OAuth#Scope_SIGNATURE}, {@link OAuth#Scope_EXTENDED}, {@link OAuth#Scope_IMPERSONATION}. You can also pass any advanced scope.
   * @param rsaPrivateKey the byte contents of the RSA private key
   * @param expiresIn number of seconds remaining before the JWT assertion is considered as invalid
   * @return OAuth.OAuthToken object.
   * @throws IllegalArgumentException if one of the arguments is invalid
   * @throws IOException if there is an issue with either the public or private file
   * @throws ApiException if there is an error while exchanging the JWT with an access token
   */
  public OAuth.OAuthToken requestJWTUserToken(String clientId, String userId, java.util.List<String>scopes, byte[] rsaPrivateKey, long expiresIn) throws IllegalArgumentException, IOException, ApiException {
    String formattedScopes = (scopes == null || scopes.size() < 1) ? "" : scopes.get(0);
    StringBuilder sb = new StringBuilder(formattedScopes);
    for (int i = 1; i < scopes.size(); i++) {
      sb.append(" " + scopes.get(i));
    }

    try {
      String assertion = JWTUtils.generateJWTAssertionFromByteArray(rsaPrivateKey, getOAuthBasePath(), clientId, userId, expiresIn, sb.toString());
      MultivaluedMap<String, String> form = new MultivaluedMapImpl();
      form.add("assertion", assertion);
      form.add("grant_type", OAuth.GRANT_TYPE_JWT);

      Client client = buildHttpClient(debugging);
      WebResource webResource = client.resource("https://" + getOAuthBasePath() + "/oauth/token");
      ClientResponse response = webResource
              .type(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
              .header("Cache-Control", "no-store")
              .header("Pragma", "no-cache")
              .post(ClientResponse.class, form);

      ObjectMapper mapper = new ObjectMapper();
      mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      OAuth.OAuthToken oAuthToken = mapper.readValue(response.getEntityInputStream(), OAuth.OAuthToken.class);
      if (oAuthToken.getAccessToken() == null || "".equals(oAuthToken.getAccessToken()) || oAuthToken.getExpiresIn() <= 0) {
        throw new ApiException("Error while requesting an access token: " + response.toString());
      }
      return oAuthToken;
    } catch (JsonParseException e) {
      throw new ApiException("Error while parsing the response for the access token: " + e);
    } catch (JsonMappingException e) {
      throw e;
    } catch (IOException e) {
      throw e;
    }
  }

  /**
   * <b>RESERVED FOR PARTNERS</b> Request JWT Application Token
   * Configures the current instance of ApiClient with a fresh OAuth JWT access token from DocuSign
   * @param clientId DocuSign OAuth Client Id (AKA Integrator Key)
   * @param scopes the list of requested scopes. Values include {@link OAuth#Scope_SIGNATURE}, {@link OAuth#Scope_EXTENDED}, {@link OAuth#Scope_IMPERSONATION}. You can also pass any advanced scope.
   * @param rsaPrivateKey the byte contents of the RSA private key
   * @param expiresIn number of seconds remaining before the JWT assertion is considered as invalid
   * @return OAuth.OAuthToken object.
   * @throws IllegalArgumentException if one of the arguments is invalid
   * @throws IOException if there is an issue with either the public or private file
   * @throws ApiException if there is an error while exchanging the JWT with an access token
   */
  public OAuth.OAuthToken requestJWTApplicationToken(String clientId, java.util.List<String>scopes, byte[] rsaPrivateKey, long expiresIn) throws IllegalArgumentException, IOException, ApiException {
    return this.requestJWTUserToken(clientId, null, scopes, rsaPrivateKey, expiresIn);
  }

  /**
   * Parse the given string into Date object.
   * @param str String
   * @return Date
   */
  public Date parseDate(String str) {
    try {
      return dateFormat.parse(str);
    } catch (java.text.ParseException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Format the given Date object into string.
   * @param date Date
   * @return Date in string format
   */
  public String formatDate(Date date) {
    return dateFormat.format(date);
  }

  /**
   * Format the given parameter object into string.
   * @param param Object
   * @return Object in string format
   */
  public String parameterToString(Object param) {
    if (param == null) {
      return "";
    } else if (param instanceof Date) {
      return formatDate((Date) param);
    } else if (param instanceof Collection) {
      StringBuilder b = new StringBuilder();
      for(Object o : (Collection<?>)param) {
        if(b.length() > 0) {
          b.append(',');
        }
        b.append(String.valueOf(o));
      }
      return b.toString();
    } else {
      return String.valueOf(param);
    }
  }

  /*
   * Format to {@code Pair} objects.
   * @param collectionFormat Collection format
   * @param name Name
   * @param value Value
   * @return List of pair
   */
  public List<Pair> parameterToPairs(String collectionFormat, String name, Object value){
    List<Pair> params = new ArrayList<Pair>();

    // preconditions
    if (name == null || name.isEmpty() || value == null) return params;

    Collection<?> valueCollection = null;
    if (value instanceof Collection<?>) {
      valueCollection = (Collection<?>) value;
    } else {
      params.add(new Pair(name, parameterToString(value)));
      return params;
    }

    if (valueCollection.isEmpty()){
      return params;
    }

    // get the collection format
    collectionFormat = (collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat); // default: csv

    // create the params based on the collection format
    if ("multi".equals(collectionFormat)) {
      for (Object item : valueCollection) {
        params.add(new Pair(name, parameterToString(item)));
      }

      return params;
    }

    String delimiter = ",";

    if ("csv".equals(collectionFormat)) {
      delimiter = ",";
    } else if ("ssv".equals(collectionFormat)) {
      delimiter = " ";
    } else if ("tsv".equals(collectionFormat)) {
      delimiter = "\t";
    } else if ("pipes".equals(collectionFormat)) {
      delimiter = "|";
    }

    StringBuilder sb = new StringBuilder() ;
    for (Object item : valueCollection) {
      sb.append(delimiter);
      sb.append(parameterToString(item));
    }

    params.add(new Pair(name, sb.substring(1)));

    return params;
  }

  /**
   * Check if the given MIME is a JSON MIME.
   * JSON MIME examples:
   *   application/json
   *   application/json; charset=UTF8
   *   APPLICATION/JSON
   * @param mime MIME
   * @return True if MIME type is boolean
   */
  public boolean isJsonMime(String mime) {
    return mime != null && mime.matches("(?i)application\\/json(;.*)?");
  }

  /**
   * Select the Accept header's value from the given accepts array:
   *   if JSON exists in the given array, use it;
   *   otherwise use all of them (joining into a string)
   *
   * @param accepts The accepts array to select from
   * @return The Accept header to use. If the given array is empty,
   *   null will be returned (not to set the Accept header explicitly).
   */
  public String selectHeaderAccept(String[] accepts) {
    if (accepts.length == 0) {
      return null;
    }
    for (String accept : accepts) {
      if (isJsonMime(accept)) {
        return accept;
      }
    }
    return StringUtil.join(accepts, ",");
  }

  /**
   * Select the Content-Type header's value from the given array:
   *   if JSON exists in the given array, use it;
   *   otherwise use the first one of the array.
   *
   * @param contentTypes The Content-Type array to select from
   * @return The Content-Type header to use. If the given array is empty,
   *   JSON will be used.
   */
  public String selectHeaderContentType(String[] contentTypes) {
    if (contentTypes.length == 0) {
      return "application/json";
    }
    for (String contentType : contentTypes) {
      if (isJsonMime(contentType)) {
        return contentType;
      }
    }
    return contentTypes[0];
  }

  /**
   * Escape the given string to be used as URL query value.
   * @param str String
   * @return Escaped string
   */
  public String escapeString(String str) {
    try {
      return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }

  /**
   * Serialize the given Java object into string according the given
   * Content-Type (only JSON is supported for now).
   * @param obj Object
   * @param contentType Content type
   * @param formParams Form parameters
   * @return Object
   * @throws ApiException API exception
   */
  public Object serialize(Object obj, String contentType, Map<String, Object> formParams) throws ApiException {
    if (contentType.startsWith("multipart/form-data")) {
      FormDataMultiPart mp = new FormDataMultiPart();
      for (Entry<String, Object> param: formParams.entrySet()) {
        if( param.getValue() instanceof List && !( ( List ) param.getValue() ).isEmpty()
                  && ( ( List ) param.getValue() ).get( 0 ) instanceof File ) {
            @SuppressWarnings( "unchecked" )
            List<File> files = ( List<File> ) param.getValue();
            for( File file : files ) {
              mp.bodyPart( new FileDataBodyPart( param.getKey(), file, MediaType.MULTIPART_FORM_DATA_TYPE ) );
            }
        } else if (param.getValue() instanceof File) {
          File file = (File) param.getValue();
          mp.bodyPart(new FileDataBodyPart(param.getKey(), file, MediaType.MULTIPART_FORM_DATA_TYPE));
        } else {
          mp.field(param.getKey(), parameterToString(param.getValue()), MediaType.MULTIPART_FORM_DATA_TYPE);
        }
      }
      return mp;
    } else if (contentType.startsWith("application/x-www-form-urlencoded")) {
      return this.getXWWWFormUrlencodedParams(formParams);
    } else if (contentType.startsWith("text/csv")) {
      return this.serializeToCsv(obj);
    } else {
      // We let Jersey attempt to serialize the body
      return obj;
    }
  }

  /**
   * Build full URL by concatenating base path, the given sub path and query parameters.
   *
   * @param path The sub path
   * @param queryParams The query parameters
   * @return The full URL
   */
  private String buildUrl(String path, List<Pair> queryParams) {
    final StringBuilder url = new StringBuilder();
    url.append(basePath).append(path);

    if (queryParams != null && !queryParams.isEmpty()) {
      // support (constant) query string in `path`, e.g. "/posts?draft=1"
      String prefix = path.contains("?") ? "&" : "?";
      for (Pair param : queryParams) {
        if (param.getValue() != null) {
          if (prefix != null) {
            url.append(prefix);
            prefix = null;
          } else {
            url.append("&");
          }
          String value = parameterToString(param.getValue());
          url.append(escapeString(param.getName())).append("=").append(escapeString(value));
        }
      }
    }

    return url.toString();
  }

  private ClientResponse getAPIResponse(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames) throws ApiException {
    if (body != null && !formParams.isEmpty()) {
      throw new ApiException(500, "Cannot have body and form params");
    }

    updateParamsForAuth(authNames, queryParams, headerParams);

    final String url = buildUrl(path, queryParams);
    Builder builder;
    if (accept == null) {
      builder = httpClient.resource(url).getRequestBuilder();
    } else {
      builder = httpClient.resource(url).accept(accept);
    }

    for (String key : headerParams.keySet()) {
      builder = builder.header(key, headerParams.get(key));
    }
    for (String key : defaultHeaderMap.keySet()) {
      if (!headerParams.containsKey(key)) {
        builder = builder.header(key, defaultHeaderMap.get(key));
      }
    }

    // Add DocuSign Tracking Header
    builder = builder.header("X-DocuSign-SDK", "Java");

    if (body == null) {
        builder = builder.header("Content-Length", "0");
    }

    ClientResponse response = null;

    if ("GET".equals(method)) {
      response = (ClientResponse) builder.get(ClientResponse.class);
    } else if ("POST".equals(method)) {
      response = builder.type(contentType).post(ClientResponse.class, serialize(body, contentType, formParams));
    } else if ("PUT".equals(method)) {
      response = builder.type(contentType).put(ClientResponse.class, serialize(body, contentType, formParams));
    } else if ("DELETE".equals(method)) {
      response = builder.type(contentType).delete(ClientResponse.class, serialize(body, contentType, formParams));
    } else if ("PATCH".equals(method)) {
      response = builder.type(contentType).header("X-HTTP-Method-Override", "PATCH").post(ClientResponse.class, serialize(body, contentType, formParams));
    }
    else {
      throw new ApiException(500, "unknown method type " + method);
    }
    return response;
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   *
   * @param <T> Type
   * @param path The sub-path of the HTTP URL
   * @param method The request method, one of "GET", "POST", "PUT", and "DELETE"
   * @param queryParams The query parameters
   * @param body The request body object - if it is not binary, otherwise null
   * @param headerParams The header parameters
   * @param formParams The form parameters
   * @param accept The request's Accept header
   * @param contentType The request's Content-Type header
   * @param authNames The authentications to apply
   * @param returnType Return type
   * @return The response body in type of string
   * @throws ApiException API exception
   */
   public <T> T invokeAPI(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames, GenericType<T> returnType) throws ApiException {

    ClientResponse response = getAPIResponse(path, method, queryParams, body, headerParams, formParams, accept, contentType, authNames);

    if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
        String respBody = response.getEntity(String.class);
        throw new ApiException(
            response.getStatusInfo().getStatusCode(),
            "Error while requesting server, received a non successful HTTP code " + response.getStatusInfo().getStatusCode() + " with response Body: '" + respBody + "'",
            response.getHeaders(),
            respBody);
    }

    statusCode = response.getStatusInfo().getStatusCode();
    responseHeaders = response.getHeaders();

    if(response.getStatusInfo() == ClientResponse.Status.NO_CONTENT) {
      return null;
    } else if (response.getStatusInfo().getFamily() == Family.SUCCESSFUL) {
      if (returnType == null)
        return null;
      else
        return response.getEntity(returnType);
    } else {
      String message = "error";
      String respBody = null;
      if (response.hasEntity()) {
        try {
          respBody = response.getEntity(String.class);
          message = respBody;
        } catch (RuntimeException e) {
          // e.printStackTrace();
        }
      }
      throw new ApiException(
        response.getStatusInfo().getStatusCode(),
        message,
        response.getHeaders(),
        respBody);
    }
  }

  /**
   * Update query and header parameters based on authentication settings.
   *
   * @param authNames The authentications to apply
   * @param queryParams Query parameters
   * @param headerParams Header parameters
   */
  private void updateParamsForAuth(String[] authNames, List<Pair> queryParams, Map<String, String> headerParams) {
    for (String authName : authNames) {
      Authentication auth = authentications.get(authName);
      if (auth == null) continue;
      auth.applyToParams(queryParams, headerParams);
    }
  }

  /**
   * Encode the given form parameters as request body.
   * @param formParams Form parameters
   * @return HTTP form encoded parameters
   */
  private String getXWWWFormUrlencodedParams(Map<String, Object> formParams) {
    StringBuilder formParamBuilder = new StringBuilder();

    for (Entry<String, Object> param : formParams.entrySet()) {
      String valueStr = parameterToString(param.getValue());
      try {
        formParamBuilder.append(URLEncoder.encode(param.getKey(), "utf8"))
            .append("=")
            .append(URLEncoder.encode(valueStr, "utf8"));
        formParamBuilder.append("&");
      } catch (UnsupportedEncodingException e) {
        // move on to next
      }
    }

    String encodedFormParams = formParamBuilder.toString();
    if (encodedFormParams.endsWith("&")) {
      encodedFormParams = encodedFormParams.substring(0, encodedFormParams.length() - 1);
    }

    return encodedFormParams;
  }

  /**
   * Encode the given request object in CSV format.
   */
  private <T> String serializeToCsv(T obj) {
	  if(obj == null) {
	        return "";
	  }

	  for (Method method: obj.getClass().getMethods()) {
		  if ("java.util.List".equals(method.getReturnType().getName())) {
			  try {
		          @SuppressWarnings("rawtypes")
				  java.util.List itemList = (java.util.List) method.invoke(obj);
		          Object entry = itemList.get(0);

		          List<String> stringList = new ArrayList<String>();
		          char delimiter = ',';
				  String lineSep = "\n";

				  CsvMapper mapper = new CsvMapper();
				  mapper.enable(JsonGenerator.Feature.IGNORE_UNKNOWN);
				  CsvSchema schema = mapper.schemaFor(entry.getClass());
				  for (int i = 0; i < itemList.size(); i++) {
					  if (i == 0) {
						  schema = schema.withHeader();
					  } else {
						  schema = schema.withoutHeader();
					  }
					  String csv = mapper.writer(schema
			                .withColumnSeparator(delimiter)
			                .withoutQuoteChar()
			                .withLineSeparator(lineSep)).writeValueAsString(itemList.get(i));

					  stringList.add(csv);
				  }
				  return StringUtil.join(stringList.toArray(new String[0]), "");
		  	  } catch (JsonProcessingException e) {
		          System.out.println(e);
		  	  } catch (IllegalAccessException e) {
		          System.out.println(e);
			} catch (IllegalArgumentException e) {
		          System.out.println(e);
			} catch (InvocationTargetException e) {
		          System.out.println(e);
			}
		  }
	  }

	  return "";
  }

  /**
   * Build the Client used to make HTTP requests.
   */
  private Client buildHttpClient(boolean debugging) {
    final ClientConfig conf = new DefaultClientConfig();
    // Add the JSON serialization support to Jersey
    JacksonJsonProvider jsonProvider = new JacksonJsonProvider(mapper);
    conf.getSingletons().add(jsonProvider);

    // Force TLS v1.2
    try {
    	System.setProperty("https.protocols", "TLSv1.2");
    } catch (SecurityException se) {
        System.err.println("failed to set https.protocols property");
    }

    // Setup the SSLContext object to use for HTTPS connections to the API
    if (sslContext == null) {
	    try {
	    	sslContext = SSLContext.getInstance("TLSv1.2");
	    	sslContext.init(null, new TrustManager[] { new SecureTrustManager() }, new SecureRandom());
	    } catch (final Exception ex) {
	      System.err.println("failed to initialize SSL context");
	    }

		conf.getProperties().put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES, new HTTPSProperties(new HostnameVerifier() {
			@Override
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		}, sslContext));
	    HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
    }

    Client client = new Client(new URLConnectionClientHandler(new HttpURLConnectionFactory() {
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
      public HttpURLConnection getHttpURLConnection(URL url) throws IOException {
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
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection(p);
        connection.setSSLSocketFactory(sslContext.getSocketFactory());
        return connection;
      }
    }), conf);

    if (debugging) {
      client.addFilter(new LoggingFilter());
    }
    return client;
  }

  class SecureTrustManager implements X509TrustManager {

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
