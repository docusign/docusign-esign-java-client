package com.docusign.esign.client;



import com.docusign.esign.client.auth.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.migcomponents.migbase64.Base64;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.glassfish.jersey.client.spi.Connector;
import org.glassfish.jersey.client.spi.ConnectorProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.media.multipart.*;

import javax.net.ssl.*;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response.Status.Family;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.*;

import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.glassfish.jersey.logging.LoggingFeature;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ApiClient {
  protected Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  // Rest API base path constants
  /** live/production base path */
  public final static String PRODUCTION_REST_BASEPATH = "https://www.docusign.net/restapi";
  /** sandbox/demo base path */
  public final static String DEMO_REST_BASEPATH = "https://demo.docusign.net/restapi";
  /** stage base path */
  public final static String STAGE_REST_BASEPATH = "https://stage.docusign.net/restapi";

  private String basePath = PRODUCTION_REST_BASEPATH;
  private String oAuthBasePath = OAuth.PRODUCTION_OAUTH_BASEPATH;
  protected boolean debugging = false;
  protected int connectionTimeout = 0;
  private int readTimeout = 0;

  protected Client httpClient;
  protected JSON json;
  protected String tempFolderPath = null;

  protected Map<String, Authentication> authentications;

  private int statusCode;
  private Map<String, List<String>> responseHeaders;

  protected DateFormat dateFormat;
  private SSLContext sslContext = null;

  public ApiClient() {
    json = new JSON();
    httpClient = buildHttpClient(debugging);

    this.dateFormat = new RFC3339DateFormat();

    // Set default User-Agent.
    setUserAgent("Swagger-Codegen/2.20.0/java");

    // Setup authentications (key: authentication name, value: authentication).
    authentications = new HashMap<String, Authentication>();
    authentications.put("docusignAccessCode", new OAuth());

    // Derive the OAuth base path from the Rest API base url
    this.deriveOAuthBasePathFromRestBasePath();
  }

  public static DateFormat buildDefaultDateFormat() {
    return new RFC3339DateFormat();
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
   * i.e. objectMapper and debugging.
   * TODO: better to use the Builder Pattern?
   * @return API client
   */
  public ApiClient rebuildHttpClient() {
    return setDebugging(debugging);
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
    return json.getObjectMapper();
  }

  public ApiClient setObjectMapper(ObjectMapper objectMapper) {
    json.setObjectMapper(objectMapper);
    // Need to rebuild the Client as it depends on object mapper.
    rebuildHttpClient();
    return this;
  }

  /**
   * Gets the JSON instance to do JSON serialization and deserialization.
   * @return JSON
   */
  public JSON getJSON() {
    return json;
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
   * @return Map of authentication object
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
   */
  public void updateAccessToken() {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        try {
          ((OAuth) auth).updateAccessToken();
        } catch (ApiException e) { 
          throw new RuntimeException(e.getMessage());
        }
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
   * @param userAgent Http user agent
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
   * @return True if debugging is switched on
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
    // Rebuild HTTP Client according to the new "debugging" value.
    this.httpClient = buildHttpClient(debugging);
    return this;
  }

  /**
   * The path of temporary folder used to store downloaded files from endpoints
   * with file response. The default value is <code>null</code>, i.e. using
   * the system's default tempopary folder.
   *
   * @return Temp folder path
   */
  public String getTempFolderPath() {
    return tempFolderPath;
  }

  /**
   * Set temp folder path
   * @param tempFolderPath Temp folder path
   * @return API client
   */
  public ApiClient setTempFolderPath(String tempFolderPath) {
    this.tempFolderPath = tempFolderPath;
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
    httpClient.property(ClientProperties.CONNECT_TIMEOUT, connectionTimeout);
    return this;
  }

  /**
   * read timeout (in milliseconds).
   * @return Read timeout
   */
  public int getReadTimeout() {
    return readTimeout;
  }
  
  /**
   * Set the read timeout (in milliseconds).
   * A value of 0 means no timeout, otherwise values must be between 1 and
   * {@link Integer#MAX_VALUE}.
   * @param readTimeout Read timeout in milliseconds
   * @return API client
   */
  public ApiClient setReadTimeout(int readTimeout) {
    this.readTimeout = readTimeout;
    httpClient.property(ClientProperties.READ_TIMEOUT, readTimeout);
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
    // also set the date format for model (de)serialization with Date properties
    this.json.setDateFormat((DateFormat) dateFormat.clone());
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
   * Sets the OAuth base path. Values include {@link OAuth#PRODUCTION_OAUTH_BASEPATH}, {@link OAuth#DEMO_OAUTH_BASEPATH} and custom (e.g. "account-s.docusign.com")
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
    String clientStr = (clientId == null ? "" : clientId) + ":" + (clientSecret == null ? "" : clientSecret);
      java.util.Map<String, Object> form = new java.util.HashMap<>();
      form.put("code", code);
      form.put("grant_type", "authorization_code");

      Client client = buildHttpClient(debugging);
      WebTarget target = client.target("https://" + getOAuthBasePath() + "/oauth/token");
      
      Invocation.Builder invocationBuilder = target.request();
      invocationBuilder = invocationBuilder
              .header("Authorization", "Basic " + Base64.encodeToString(clientStr.getBytes("UTF-8"), false))
              .header("Cache-Control", "no-store")
              .header("Pragma", "no-cache");

    Entity<?> entity = serialize(null, form, MediaType.APPLICATION_FORM_URLENCODED);

    Response response = null;

    try {
      response = invocationBuilder.post(entity);

      if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
        String message = "error";
        String respBody = null;
        if (response.hasEntity()) {
          try {
            respBody = String.valueOf(response.readEntity(String.class));
            message = "Error while requesting server, received a non successful HTTP code " + response.getStatusInfo().getStatusCode() + " with response Body: '" + respBody + "'";
          } catch (RuntimeException e) {
            // e.printStackTrace();
          }
        }
        throw new ApiException(
          response.getStatusInfo().getStatusCode(),
          message,
          buildResponseHeaders(response),
          respBody);
      }

      GenericType<OAuth.OAuthToken> returnType = new GenericType<OAuth.OAuthToken>() {};
      return deserialize(response, returnType);
    } finally {
      try {
        if (response != null) {
          response.close();
        }
      } catch (Exception e) {
        // it's not critical, since the response object is local in method invokeAPI; that's fine, just continue
      }
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
    if (accessToken == null || "".equals(accessToken)) {
      throw new IllegalArgumentException("Cannot find a valid access token. Make sure OAuth is configured before you try again.");
    }

    Client client = buildHttpClient(debugging);
    WebTarget target = client.target("https://" + getOAuthBasePath() + "/oauth/userinfo");
    Invocation.Builder invocationBuilder = target.request();
    invocationBuilder = invocationBuilder
        .header("Authorization", "Bearer " + accessToken)
        .header("Cache-Control", "no-store")
        .header("Pragma", "no-cache");

    Response response = null;

    try {
      response = invocationBuilder.get();

      if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
        String message = "error";
        String respBody = null;
        if (response.hasEntity()) {
          try {
            respBody = String.valueOf(response.readEntity(String.class));
            message = "Error while requesting server, received a non successful HTTP code " + response.getStatusInfo().getStatusCode() + " with response Body: '" + respBody + "'";
          } catch (RuntimeException e) {
            // e.printStackTrace();
          }
        }
        throw new ApiException(
          response.getStatusInfo().getStatusCode(),
          message,
          buildResponseHeaders(response),
          respBody);
      }

      GenericType<OAuth.UserInfo> returnType = new GenericType<OAuth.UserInfo>() {};
      return deserialize(response, returnType);
    } finally {
      try {
        if (response != null) {
          response.close();
        }
      } catch (Exception e) {
        // it's not critical, since the response object is local in method invokeAPI; that's fine, just continue
      }
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
   * @throws ApiException if there is an error while exchanging the JWT with an access token
   * @throws IOException if there is an issue with either the public or private file
   * @deprecated  As of release 2.7.0, replaced by {@link #requestJWTUserToken(String, String, List, byte[], long)} ()} and {@link #requestJWTApplicationToken(String, List, byte[], long)}
   */
  @Deprecated public void configureJWTAuthorizationFlow(String publicKeyFilename, String privateKeyFilename, String oAuthBasePath, String clientId, String userId, long expiresIn) throws ApiException, IOException {
    String assertion = JWTUtils.generateJWTAssertion(publicKeyFilename, privateKeyFilename, oAuthBasePath, clientId, userId, expiresIn);
    java.util.Map<String, Object> form = new java.util.HashMap<>();
    form.put("assertion", assertion);
    form.put("grant_type", OAuth.GRANT_TYPE_JWT);

    Client client = buildHttpClient(debugging);
    WebTarget target = client.target("https://" + oAuthBasePath + "/oauth/token");
    Invocation.Builder invocationBuilder = target.request();
    invocationBuilder = invocationBuilder
            .header("Cache-Control", "no-store")
            .header("Pragma", "no-cache");

    Entity<?> entity = serialize(null, form, MediaType.APPLICATION_FORM_URLENCODED);
  
    Response response = null;
  
    try {
      response = invocationBuilder.post(entity);
  
      if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
        String message = "error";
        String respBody = null;
        if (response.hasEntity()) {
          try {
            respBody = String.valueOf(response.readEntity(String.class));
            message = "Error while requesting server, received a non successful HTTP code " + response.getStatusInfo().getStatusCode() + " with response Body: '" + respBody + "'";
          } catch (RuntimeException e) {
            // e.printStackTrace();
          }
        }
        throw new ApiException(
          response.getStatusInfo().getStatusCode(),
          message,
          buildResponseHeaders(response),
          respBody);
      }

      GenericType<JsonNode> returnType = new GenericType<JsonNode>() {};
      JsonNode responseJson = deserialize(response, returnType);
      if (!responseJson.has("access_token") || !responseJson.has("expires_in")) {
        throw new ApiException("Error while requesting an access token: " + responseJson);
      }
      String accessToken = responseJson.get("access_token").asText();
      expiresIn = responseJson.get("expires_in").asLong();
      setAccessToken(accessToken, expiresIn);
    } finally {
      try {
        if (response != null) {
          response.close();
        }
      } catch (Exception e) {
        // it's not critical, since the response object is local in method invokeAPI; that's fine, just continue
      }
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
   * @throws ApiException if there is an error while exchanging the JWT with an access token
   * @throws IOException if there is an issue with either the public or private file
   */
  public OAuth.OAuthToken requestJWTUserToken(String clientId, String userId, java.util.List<String>scopes, byte[] rsaPrivateKey, long expiresIn) throws IllegalArgumentException, ApiException, IOException {
    String formattedScopes = (scopes == null || scopes.size() < 1) ? "" : scopes.get(0);
    StringBuilder sb = new StringBuilder(formattedScopes);
    for (int i = 1; i < scopes.size(); i++) {
      sb.append(" " + scopes.get(i));
    }

    String assertion = JWTUtils.generateJWTAssertionFromByteArray(rsaPrivateKey, getOAuthBasePath(), clientId, userId, expiresIn, sb.toString());
    java.util.Map<String, Object> form = new java.util.HashMap<>();
    form.put("assertion", assertion);
    form.put("grant_type", OAuth.GRANT_TYPE_JWT);

    Client client = buildHttpClient(debugging);
    WebTarget target = client.target("https://" + getOAuthBasePath() + "/oauth/token");
    Invocation.Builder invocationBuilder = target.request();
    invocationBuilder = invocationBuilder
            .header("Cache-Control", "no-store")
            .header("Pragma", "no-cache");

    Entity<?> entity = serialize(null, form, MediaType.APPLICATION_FORM_URLENCODED);

    Response response = null;

    try {
      response = invocationBuilder.post(entity);

      if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
        String message = "error";
        String respBody = null;
        if (response.hasEntity()) {
          try {
            respBody = String.valueOf(response.readEntity(String.class));
            message = "Error while requesting server, received a non successful HTTP code " + response.getStatusInfo().getStatusCode() + " with response Body: '" + respBody + "'";
          } catch (RuntimeException e) {
            // e.printStackTrace();
          }
        }
        throw new ApiException(
          response.getStatusInfo().getStatusCode(),
          message,
          buildResponseHeaders(response),
          respBody);
      }

      GenericType<OAuth.OAuthToken> returnType = new GenericType<OAuth.OAuthToken>() {};
      OAuth.OAuthToken oAuthToken =  deserialize(response, returnType);
      if (oAuthToken.getAccessToken() == null || "".equals(oAuthToken.getAccessToken()) || oAuthToken.getExpiresIn() <= 0) {
        throw new ApiException("Error while requesting an access token: " + response.toString());
      }
      return oAuthToken;
    } finally {
      try {
        if (response != null) {
          response.close();
        }
      } catch (Exception e) {
        // it's not critical, since the response object is local in method invokeAPI; that's fine, just continue
      }
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
      for(Object o : (Collection)param) {
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

  /**
   * Formats the specified query parameter to a list containing a single {@code Pair} object.
   *
   * Note that {@code value} must not be a collection.
   *
   * @param name The name of the parameter.
   * @param value The value of the parameter.
   * @return A list containing a single {@code Pair} object.
   */
  public List<Pair> parameterToPair(String name, Object value) {
    List<Pair> params = new ArrayList<Pair>();

    // preconditions
    if (name == null || name.isEmpty() || value == null || value instanceof Collection) return params;

    params.add(new Pair(name, parameterToString(value)));
    return params;
  }

  /**
   * Formats the specified collection query parameters to a list of {@code Pair} objects.
   *
   * Note that the values of each of the returned Pair objects are percent-encoded.
   *
   * @param collectionFormat The collection format of the parameter.
   * @param name The name of the parameter.
   * @param value The value of the parameter.
   * @return A list of {@code Pair} objects.
   */
  public List<Pair> parameterToPairs(String collectionFormat, String name, Collection value) {
    List<Pair> params = new ArrayList<Pair>();

    // preconditions
    if (name == null || name.isEmpty() || value == null) {
      return params;
    }

    // create the params based on the collection format
    if ("multi".equals(collectionFormat)) {
      for (Object item : value) {
        params.add(new Pair(name, escapeString(parameterToString(item))));
      }
      return params;
    }

    // collectionFormat is assumed to be "csv" by default
    String delimiter = ",";

    // escape all delimiters except commas, which are URI reserved
    // characters
    if ("ssv".equals(collectionFormat)) {
      delimiter = escapeString(" ");
    } else if ("tsv".equals(collectionFormat)) {
      delimiter = escapeString("\t");
    } else if ("pipes".equals(collectionFormat)) {
      delimiter = escapeString("|");
    }

    StringBuilder sb = new StringBuilder() ;
    for (Object item : value) {
      sb.append(delimiter);
      sb.append(escapeString(parameterToString(item)));
    }

    params.add(new Pair(name, sb.substring(delimiter.length())));

    return params;
  }
  
  /*
   * Format to {@code Pair} objects.
   * @param collectionFormat Collection format
   * @param name Name
   * @param value Value
   * @return List of pairs
   */
  public List<Pair> parameterToPairs(String collectionFormat, String name, Object value){
    List<Pair> params = new ArrayList<Pair>();

    // preconditions
    if (name == null || name.isEmpty() || value == null) return params;

    Collection valueCollection;
    if (value instanceof Collection) {
      valueCollection = (Collection) value;
    } else {
      params.add(new Pair(name, parameterToString(value)));
      return params;
    }

    if (valueCollection.isEmpty()){
      return params;
    }

    // get the collection format (default: csv)
    String format = (collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat);

    // create the params based on the collection format
    if ("multi".equals(format)) {
      for (Object item : valueCollection) {
        params.add(new Pair(name, parameterToString(item)));
      }

      return params;
    }

    String delimiter = ",";

    if ("csv".equals(format)) {
      delimiter = ",";
    } else if ("ssv".equals(format)) {
      delimiter = " ";
    } else if ("tsv".equals(format)) {
      delimiter = "\t";
    } else if ("pipes".equals(format)) {
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
   *   application/vnd.company+json
   * "* / *" is also default to JSON
   * @param mime MIME
   * @return True if the MIME type is JSON
   */
  public boolean isJsonMime(String mime) {
    String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
    return mime != null && (mime.matches(jsonMime) || mime.equals("*/*"));
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
    if (contentTypes.length == 0 || contentTypes[0].equals("*/*")) {
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
    return serialize(obj, formParams, contentType).getEntity();
  }

  /**
   * Serialize the given Java object into string entity according the given
   * Content-Type (only JSON is supported for now).
   * @param obj Object
   * @param formParams Form parameters
   * @param contentType Context type
   * @return Entity
   * @throws ApiException API exception
   */
  public Entity<?> serialize(Object obj, Map<String, Object> formParams, String contentType) throws ApiException {
    Entity<?> entity;
    if (contentType.startsWith("multipart/form-data")) {
      MultiPart multiPart = new MultiPart();
      for (Entry<String, Object> param: formParams.entrySet()) {
        if (param.getValue() instanceof byte[]) {
          byte[] bytes = (byte[]) param.getValue();	
          FormDataContentDisposition contentDisp = FormDataContentDisposition.name(param.getKey())
              .fileName(param.getKey()).size(bytes.length).build();	

          multiPart.bodyPart(new FormDataBodyPart(contentDisp, bytes, MediaType.APPLICATION_OCTET_STREAM_TYPE));	
        } else if (param.getValue() instanceof File) {
          File file = (File) param.getValue();
          FormDataContentDisposition contentDisp = FormDataContentDisposition.name(param.getKey())
              .fileName(file.getName()).size(file.length()).build();
          multiPart.bodyPart(new FormDataBodyPart(contentDisp, file, MediaType.APPLICATION_OCTET_STREAM_TYPE));
        } else {
          FormDataContentDisposition contentDisp = FormDataContentDisposition.name(param.getKey()).build();
          multiPart.bodyPart(new FormDataBodyPart(contentDisp, parameterToString(param.getValue())));
        }
      }
      entity = Entity.entity(multiPart, MediaType.MULTIPART_FORM_DATA_TYPE);
    } else if (contentType.startsWith("application/x-www-form-urlencoded")) {
      Form form = new Form();
      for (Entry<String, Object> param: formParams.entrySet()) {
        form.param(param.getKey(), parameterToString(param.getValue()));
      }
      entity = Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE);
    } else if (contentType.startsWith("text/csv")) {
      return this.serializeToCsv(obj);
    } else {
      // We let jersey handle the serialization
      entity = Entity.entity(obj, contentType);
    }
    return entity;
  }

  /**
   * Deserialize response body to Java object according to the Content-Type.
   * @param <T> Type
   * @param response Response
   * @param returnType Return type
   * @return Deserialize object
   * @throws ApiException API exception
   */
  @SuppressWarnings("unchecked")
  public <T> T deserialize(Response response, GenericType<T> returnType) throws ApiException {
    if (response == null || returnType == null) {
      return null;
    }

    if ("byte[]".equals(returnType.toString())) {
      // Handle binary response (byte array).
      return (T) response.readEntity(byte[].class);
    } else if (returnType.getRawType() == File.class) {
      // Handle file downloading.
      T file = (T) downloadFileFromResponse(response);
      return file;
    }

    String contentType = null;
    List<Object> contentTypes = response.getHeaders().get("Content-Type");
    if (contentTypes != null && !contentTypes.isEmpty())
      contentType = String.valueOf(contentTypes.get(0));

    return response.readEntity(returnType);
  }

  /**
   * Download file from the given response.
   * @param response Response
   * @return File
   * @throws ApiException If fail to read file content from response and write to disk
   */
  public File downloadFileFromResponse(Response response) throws ApiException {
    try {
      File file = prepareDownloadFile(response);
      Files.copy(response.readEntity(InputStream.class), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
      return file;
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  public File prepareDownloadFile(Response response) throws IOException {
    String filename = null;
    String contentDisposition = (String) response.getHeaders().getFirst("Content-Disposition");
    if (contentDisposition != null && !"".equals(contentDisposition)) {
      // Get filename from the Content-Disposition header.
      Pattern pattern = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
      Matcher matcher = pattern.matcher(contentDisposition);
      if (matcher.find())
        filename = matcher.group(1);
    }

    String prefix;
    String suffix = null;
    if (filename == null) {
      prefix = "download-";
      suffix = "";
    } else {
      int pos = filename.lastIndexOf('.');
      if (pos == -1) {
        prefix = filename + "-";
      } else {
        prefix = filename.substring(0, pos) + "-";
        suffix = filename.substring(pos);
      }
      // File.createTempFile requires the prefix to be at least three characters long
      if (prefix.length() < 3)
        prefix = "download-";
    }

    if (tempFolderPath == null)
      return File.createTempFile(prefix, suffix);
    else
      return File.createTempFile(prefix, suffix, new File(tempFolderPath));
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   *
   * @param <T> Type
   * @param path The sub-path of the HTTP URL
   * @param method The request method, one of "GET", "POST", "PUT", "HEAD" and "DELETE"
   * @param queryParams The query parameters
   * @param collectionQueryParams The collection query parameters
   * @param body The request body object
   * @param headerParams The header parameters
   * @param formParams The form parameters
   * @param accept The request's Accept header
   * @param contentType The request's Content-Type header
   * @param authNames The authentications to apply
   * @param returnType The return type into which to deserialize the response
   * @return The response body in type of string
   * @throws ApiException API exception
   */
  public <T> T invokeAPI(String path, String method, List<Pair> queryParams, List<Pair> collectionQueryParams, Object
                            body, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames, GenericType<T> returnType) throws ApiException {
    updateParamsForAuth(authNames, queryParams, headerParams);

    // Not using `.target(this.basePath).path(path)` below,
    // to support (constant) query string in `path`, e.g. "/posts?draft=1"
    WebTarget target = httpClient.target(this.basePath + path);

    if (queryParams != null) {
      for (Pair queryParam : queryParams) {
        if (queryParam.getValue() != null) {
          target = target.queryParam(queryParam.getName(), queryParam.getValue());
        }
      }
    }

	  if (collectionQueryParams != null) {
      for (Pair param : collectionQueryParams) {
        if (param.getValue() != null) {
          target = target.queryParam(param.getName(), param.getValue());
        }
      }
    }

    Invocation.Builder invocationBuilder = target.request().accept(accept);

    for (Entry<String, String> entry : headerParams.entrySet()) {
      String value = entry.getValue();
      if (value != null) {
        invocationBuilder = invocationBuilder.header(entry.getKey(), value);
      }
    }

    for (Entry<String, String> entry : defaultHeaderMap.entrySet()) {
      String key = entry.getKey();
      if (!headerParams.containsKey(key)) {
        String value = entry.getValue();
        if (value != null) {
          invocationBuilder = invocationBuilder.header(key, value);
        }
      }
    }

    Entity<?> entity = (body == null && formParams.isEmpty()) ? Entity.json("{}") : serialize(body, formParams, contentType);

    // Generate and add Content-Disposition header as per RFC 6266	
    if (contentType.startsWith("multipart/form-data")) {	
      for (Entry<String, Object> param : formParams.entrySet()) {	
        if (param.getValue() instanceof byte[]) {	
          MultiPart mp = ((MultiPart) entity.getEntity());	
          List<BodyPart> bodyParts = mp.getBodyParts();	
          if (!bodyParts.isEmpty()) {	
            BodyPart bodyPart = bodyParts.get(0);	
            if (bodyPart.getContentDisposition() != null) {	
              String contentDispositionValue = bodyPart.getContentDisposition().toString();	
              invocationBuilder = invocationBuilder.header("Content-Disposition", contentDispositionValue);	
              entity = Entity.entity(param.getValue(), "application/octet-stream");	
            }	
          }	
        }	
      }	
    }

    // Add DocuSign Tracking Header
    invocationBuilder = invocationBuilder.header("X-DocuSign-SDK", "Java");

    if (body == null && formParams.isEmpty()) {
        invocationBuilder = invocationBuilder.header("Content-Length", "0");	
    }	

    Response response = null;
    String message = "error";
    String respBody = null;

    try {
      if ("GET".equals(method)) {
        response = invocationBuilder.get();
      } else if ("POST".equals(method)) {
        response = invocationBuilder.post(entity);
      } else if ("PUT".equals(method)) {
        response = invocationBuilder.put(entity);
      } else if ("DELETE".equals(method)) {
        response = invocationBuilder.method("DELETE", entity);
      } else if ("PATCH".equals(method)) {
        response = invocationBuilder.method("PATCH", entity);
      } else if ("HEAD".equals(method)) {
        response = invocationBuilder.head();
      } else {
        throw new ApiException(500, "unknown method type " + method);
      }

      statusCode = response.getStatusInfo().getStatusCode();
      responseHeaders = buildResponseHeaders(response);

      if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
        if (response.hasEntity()) {
          try {
            respBody = String.valueOf(response.readEntity(String.class));
            message = "Error while requesting server, received a non successful HTTP code " + response.getStatusInfo().getStatusCode() + " with response Body: '" + respBody + "'";
          } catch (RuntimeException e) {
            // e.printStackTrace();
          }
        }
        throw new ApiException(
          response.getStatusInfo().getStatusCode(),
          message,
          buildResponseHeaders(response),
          respBody);
      }

      if (response.getStatus() == Status.NO_CONTENT.getStatusCode()) {
        return null;
      } else if (response.getStatusInfo().getFamily() == Status.Family.SUCCESSFUL) {
        if (returnType == null)
          return null;
        else
          return deserialize(response, returnType);
      } else {
        if (response.hasEntity()) {
          try {
            respBody = String.valueOf(response.readEntity(String.class));
            message = respBody;
          } catch (RuntimeException e) {
            // e.printStackTrace();
          }
        }
        throw new ApiException(
          response.getStatus(),
          message,
          buildResponseHeaders(response),
          respBody);
      }
    } finally {
      try {
        response.close();
      } catch (Exception e) {
        // it's not critical, since the response object is local in method invokeAPI; that's fine, just continue
      }
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
  private Entity<?> serializeToCsv(Object obj) {
    if(obj == null) {
      return Entity.text("");
    } else if (obj.getClass() == byte[].class) {
      return Entity.entity(new String((byte[]) obj), new MediaType("text", "csv"));
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
            return Entity.entity(StringUtil.join(stringList.toArray(new String[0]), ""), new MediaType("text", "csv"));
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

    return Entity.entity("", new MediaType("text", "csv"));
  }

  /**
   * Build the Client used to make HTTP requests.
   * @param debugging Debug setting
   * @return Client
   */
  protected Client buildHttpClient(boolean debugging) {
    final ClientConfig clientConfig = new ClientConfig();
    clientConfig.register(MultiPartFeature.class);
    clientConfig.register(json);
    clientConfig.register(JacksonFeature.class);
    clientConfig.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true);
    // turn off compliance validation to be able to send payloads with DELETE calls
    clientConfig.property(ClientProperties.SUPPRESS_HTTP_COMPLIANCE_VALIDATION, true);
    if (debugging) {
      clientConfig.register(new LoggingFeature(java.util.logging.Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME), java.util.logging.Level.INFO, LoggingFeature.Verbosity.PAYLOAD_ANY, 1024*50 /* Log payloads up to 50K */));
      clientConfig.property(LoggingFeature.LOGGING_FEATURE_VERBOSITY, LoggingFeature.Verbosity.PAYLOAD_ANY);
      // Set logger to ALL
      java.util.logging.Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME).setLevel(java.util.logging.Level.ALL);
    } else {
      // suppress warnings for payloads with DELETE calls:
      java.util.logging.Logger.getLogger("org.glassfish.jersey.client").setLevel(java.util.logging.Level.SEVERE);
    }
    performAdditionalClientConfiguration(clientConfig);

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
	    HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
    }

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
        HttpUrlConnectorProvider customConnProv =  new HttpUrlConnectorProvider();
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

  protected void performAdditionalClientConfiguration(ClientConfig clientConfig) {
    // No-op extension point
  }
  
  class InsecureHostnameVerifier implements HostnameVerifier {
    @Override
    public boolean verify(String hostname, SSLSession session) {
        return true;
    }
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

  protected Map<String, List<String>> buildResponseHeaders(Response response) {
    Map<String, List<String>> responseHeaders = new HashMap<String, List<String>>();
    for (Entry<String, List<Object>> entry: response.getHeaders().entrySet()) {
      List<Object> values = entry.getValue();
      List<String> headers = new ArrayList<String>();
      for (Object o : values) {
        headers.add(String.valueOf(o));
      }
      responseHeaders.put(entry.getKey(), headers);
    }
    return responseHeaders;
  }

  /**
   * Update query and header parameters based on authentication settings.
   *
   * @param authNames The authentications to apply
   */
  protected void updateParamsForAuth(String[] authNames, List<Pair> queryParams, Map<String, String> headerParams) {
    for (String authName : authNames) {
      Authentication auth = authentications.get(authName);
      if (auth == null) throw new RuntimeException("Authentication undefined: " + authName);
      auth.applyToParams(queryParams, headerParams);
    }
  }
}
