package com.docusign.esign.client.auth;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.util.*;

import com.docusign.esign.client.RFC3339DateFormat;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import com.docusign.esign.client.ApiException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.docusign.esign.client.Pair;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * OAuth class.
 *
 */
public class OAuth implements Authentication {
    static final int MILLIS_PER_SECOND = 1000;

	// OAuth Scope constants
	/** create and send envelopes, and obtain links for starting signing sessions. */
	public final static String Scope_SIGNATURE = "signature";
	/** obtain a refresh token with an extended lifetime. */
	public final static String Scope_EXTENDED = "extended";
	/** obtain access to the user’s account when the user is not present. */
	public final static String Scope_IMPERSONATION = "impersonation";

	// OAuth ResponseType constants
	/** used by public/native client applications. */
	public final static String CODE = "code";
	/** used by private/trusted client application. */
	public final static String TOKEN = "token";

	// OAuth base path constants
	/** live/production base path. */
	public final static String PRODUCTION_OAUTH_BASEPATH = "account.docusign.com";
	/** sandbox/demo base path. */
	public final static String DEMO_OAUTH_BASEPATH = "account-d.docusign.com";

	// OAuth grant types
	/** JWT grant type. */
	public final static String GRANT_TYPE_JWT = "urn:ietf:params:oauth:grant-type:jwt-bearer";

    // Client ID and secret for oauth
    private String clientId = null;
    private String clientSecret = null;

    // auth, token and redirect urls
    private String authorizationUrl = null;
    private String tokenUrl = null;
    private String redirectURI = null;

    // scopes and grant type
    private String scope = null;
    private OAuthFlow grantType = null;

    private volatile String accessToken;
    private volatile String refreshToken;
    private volatile String authCode;
    private volatile String jwtAssertion;

    private Long expirationTimeMillis;
    private AccessTokenListener accessTokenListener;

    private Client httpClient;


    /**
    * OAuth constructor.
    *
    */
    public OAuth() { }

    public OAuth(Client httpClient) {
        this.httpClient = httpClient;
    }

   /**
    * OAuth constructor.
    * 
    * @param client The client to use
    * @param flow The OAuth flow
    * @param authorizationUrl The auth url
    * @param tokenUrl The token URL
    * @param scopes The scopes to use
    */
    public OAuth(Client client, OAuthFlow flow, String authorizationUrl, String tokenUrl, String scopes) {
        this.httpClient = client;
        setScope(scopes);
        setGrantType(flow);
        setAuthorizationUrl(authorizationUrl);
        setTokenUrl(tokenUrl);
    }

   /**
    * OAuth constructor.
    * 
    * @param flow The OAuth flow
    * @param authorizationUrl The auth url
    * @param tokenUrl The token URL
    * @param scopes The scopes to use
    */
    public OAuth(OAuthFlow flow, String authorizationUrl, String tokenUrl, String scopes) {
        this(ClientBuilder.newBuilder().build(), flow, authorizationUrl, tokenUrl, scopes);
    }

   /**
    * applyToParams method.
    *
    * @param queryParams The query params
    * @param headerParams The header params
    */
    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
        // If first time, get the token
        if (expirationTimeMillis == null || System.currentTimeMillis() >= expirationTimeMillis) {
            try {
                updateAccessToken();
            } catch (ApiException e) {
                accessToken = null;
            }
        }
        if (accessToken != null) {
            headerParams.put("Authorization", "Bearer " + accessToken);
        }
    }

   /**
    * updateAccessToken method.
    *
    */
    public synchronized void updateAccessToken() throws ApiException {
        OAuthToken oauthToken = null;
        try {
            switch (getGrantType()) {
                case accessCode: // Authorization Grant
                    oauthToken = generateAccessToken();
                    break;
                case jwt: // JWT Grant
                    oauthToken = requestJWTUserToken();
                    break;
                default: // Implicit Grant - token will already be set by consuming app using setAccessToken()
                    break;
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
        if (oauthToken != null)
        {
            if (oauthToken.getAccessToken() == null) {
                throw new ApiException("Error while requesting an access token. No 'access_token' found.");
            }
            if (oauthToken.getExpiresIn() == null) {
                throw new ApiException("Error while requesting an access token. No 'expires_in' found.");
            }

            setAccessToken(oauthToken.getAccessToken(), Long.valueOf(oauthToken.getExpiresIn()));
            if (this.accessTokenListener != null) {
                this.accessTokenListener.notify(oauthToken);
            }
        } else {
            // in case of HTTP error codes accessTokenResponse is null, thus no check of accessTokenResponse.getResponseCode() possible :-(
            throw new ApiException("Error while requesting an access token. No accessTokenResponse object recieved, maybe a non HTTP 200 received?");
        }
    }


    /**
     * Configures the current instance of ApiClient with a fresh OAuth JWT access token from DocuSign.
     * @return OAuth.OAuthToken object.
     * @throws IllegalArgumentException if one of the arguments is invalid
     * @throws ApiException if there is an error while exchanging the JWT with an access token
     * @throws IOException if there is an issue with either the public or private file
     */
    public OAuth.OAuthToken requestJWTUserToken() throws IllegalArgumentException, ApiException, IOException {
        java.util.Map<String, Object> form = new java.util.HashMap<>();
        form.put("assertion", getJwtAssertion());
        form.put("grant_type", OAuth.GRANT_TYPE_JWT);

        WebTarget target = httpClient.target(getTokenUrl());
        Invocation.Builder invocationBuilder = target.request();
        invocationBuilder = invocationBuilder
                .header("Cache-Control", "no-store")
                .header("Pragma", "no-cache");

        Entity<?> entity = serialize(null, form, MediaType.APPLICATION_FORM_URLENCODED);

        Response response = null;

        try {
            response = invocationBuilder.post(entity);

            if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
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

            GenericType<OAuthToken> returnType = new GenericType<OAuth.OAuthToken>() {};
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
     * Helper method to configure the OAuth accessCode/implicit flow parameters.
     *
     * @return OAuth.OAuthToken object.
     * @throws ApiException if the HTTP call status is different than 2xx.
     * @throws IOException  if there is a problem while parsing the reponse object.
     * @see OAuth.OAuthToken
     */
    public OAuth.OAuthToken generateAccessToken() throws ApiException, IOException {
        String clientId = getClientId();
        String clientSecret = getClientSecret();
        String code = getAuthCode();
        String clientStr = (clientId == null ? "" : clientId) + ":" + (clientSecret == null ? "" : clientSecret);
        java.util.Map<String, Object> form = new java.util.HashMap<>();
        form.put("code", code);
        form.put("grant_type", "authorization_code");

        WebTarget target = httpClient.target(getTokenUrl());

        Invocation.Builder invocationBuilder = target.request();
        invocationBuilder = invocationBuilder
                .header("Authorization", "Basic " + Base64.getEncoder().encodeToString(clientStr.getBytes(StandardCharsets.UTF_8)))
                .header("Cache-Control", "no-store")
                .header("Pragma", "no-cache");

        Entity<?> entity = serialize(null, form, MediaType.APPLICATION_FORM_URLENCODED);

        Response response = null;

        try {
            response = invocationBuilder.post(entity);

            if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
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
    * registerAccessTokenListener method.
    *
    * @param accessTokenListener The access token listener
    */
    public synchronized void registerAccessTokenListener(AccessTokenListener accessTokenListener) {
        this.accessTokenListener = accessTokenListener;
    }

   /**
    * getAccessToken method.
    *
    * @return String
    */
    public synchronized String getAccessToken() {
        return accessToken;
    }

    public Long getExpirationTimeMillis() {
        return expirationTimeMillis;
    }

    public void setExpirationTimeMillis(Long expirationTimeMillis) {
        this.expirationTimeMillis = expirationTimeMillis;
    }

    public synchronized void setAccessToken(String accessToken, Long expiresIn) {
        this.accessToken = accessToken;
        this.expirationTimeMillis = System.currentTimeMillis() + expiresIn * MILLIS_PER_SECOND;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getAuthorizationUrl() {
        return authorizationUrl;
    }

    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public String getRedirectURI() {
        return redirectURI;
    }

    public void setRedirectURI(String redirectURI) {
        this.redirectURI = redirectURI;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public OAuthFlow getGrantType() {
        return grantType;
    }

    public void setGrantType(OAuthFlow grantType) {
        this.grantType = grantType;
    }

    public String getJwtAssertion() {
        return jwtAssertion;
    }

    public void setJwtAssertion(String jwtAssertion) {
        this.jwtAssertion = jwtAssertion;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }


    protected Map<String, List<String>> buildResponseHeaders(Response response) {
        Map<String, List<String>> responseHeaders = new HashMap<String, List<String>>();
        for (Map.Entry<String, List<Object>> entry: response.getHeaders().entrySet()) {
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
        if (contentType.startsWith("application/x-www-form-urlencoded")) {
            Form form = new Form();
            for (Map.Entry<String, Object> param: formParams.entrySet()) {
                form.param(param.getKey(), parameterToString(param.getValue()));
            }
            entity = Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE);
        } else {
            // We let jersey handle the serialization
            entity = Entity.entity(obj, contentType);
        }
        return entity;
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
            DateFormat dateFormat = new RFC3339DateFormat();
            return dateFormat.format((Date) param);
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

        String contentType = null;
        List<Object> contentTypes = response.getHeaders().get("Content-Type");
        if (contentTypes != null && !contentTypes.isEmpty()) {
            contentType = String.valueOf(contentTypes.get(0));
        }

        return response.readEntity(returnType);
    }

    /**
     *
     * OAuthToken model with the following properties.
     * <br><b>accessToken</b>: the token you will use in the Authorization header of calls to the Docusign API.
     * <br><b>tokenType</b>: this is the type of the accessToken. It is usually "Bearer".
     * <br><b>refreshToken</b>: a token you can use to get a new accessToken without requiring user interaction.
     * <br><b>expiresIn</b>: the number of seconds before the accessToken expires.
     *
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class OAuthToken {
        @JsonProperty("access_token")
        private String accessToken = null;

        @JsonProperty("token_type")
        private String tokenType = null;

        @JsonProperty("refresh_token")
        private String refreshToken = null;

        @JsonProperty("expires_in")
        private Long expiresIn = 0L;

        @JsonProperty("scope")
        private String scope = null;

        public OAuthToken accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Get accessToken.
         *
         * @return accessToken
         **/
        @Schema(example = "null", description = "")
        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public OAuthToken isTokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        /**
         * Get tokenType.
         *
         * @return tokenType
         **/
        @Schema(example = "null", description = "")
        public String getTokenType() {
            return tokenType;
        }

        public void setTokenType(String tokenType) {
            this.tokenType = tokenType;
        }

        public OAuthToken refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * Get refreshToken.
         *
         * @return refreshToken
         **/
        @Schema(example = "null", description = "")
        public String getRefreshToken() {
            return refreshToken;
        }

        public void setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
        }

        public OAuthToken expiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * Get expiresIn.
         *
         * @return expiresIn
         **/
        @Schema(example = "3600L", description = "0L")
        public Long getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
        }

        /**
         * Get scope.
         *
         * @return scope
         **/
        @Schema(example = "null", description = "")
        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            OAuthToken oAuthToken = (OAuthToken) o;
            return Objects.equals(this.accessToken, oAuthToken.accessToken)
                    && Objects.equals(this.tokenType, oAuthToken.tokenType)
                    && Objects.equals(this.refreshToken, oAuthToken.refreshToken)
                    && Objects.equals(this.expiresIn, oAuthToken.expiresIn);
        }

        @Override
        public int hashCode() {
            return Objects.hash(accessToken, tokenType, refreshToken, expiresIn);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OAuthToken {\n");

            sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
            sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
            sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
            sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4
         * spaces (except the first line).
         */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }

    /**
     *
     * Link model with the below properties.
     * <br><b>rel</b>: currently the only value is "self".
     * <br><b>href</b>: the direct link of the organization.
     *
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Link {
        @JsonProperty("rel")
        private String rel = null;

        @JsonProperty("href")
        private String href = null;

        public Link rel(String rel) {
            this.rel = rel;
            return this;
        }

        /**
         * Get rel.
         *
         * @return rel
         **/
        @Schema(example = "null", description = "")
        public String getRel() {
            return rel;
        }

        public void setRel(String rel) {
            this.rel = rel;
        }

        public Link href(String href) {
            this.href = href;
            return this;
        }

        /**
         * Get href.
         *
         * @return href
         **/
        @Schema(example = "null", description = "")
        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Link link = (Link) o;
            return Objects.equals(this.rel, link.rel)
                    && Objects.equals(this.href, link.href);
        }

        @Override
        public int hashCode() {
            return Objects.hash(rel, href);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Link {\n");

            sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
            sb.append("    href: ").append(toIndentedString(href)).append("\n");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4
         * spaces (except the first line).
         */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }

    /**
     *
     * Organization model with the below properties.
     * <br><b>organizationId</b>: the organization ID GUID if Docusign Org Admin is enabled.
     * <br><b>links</b>: this is list of organization direct links associated with the Docusign account.
     *
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Organization {
        @JsonProperty("organization_id")
        private String organizationId = null;

        @JsonProperty("links")
        private java.util.List<Link> links = new java.util.ArrayList<Link>();

        public Organization organizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        /**
         * Get organizationId.
         *
         * @return organizationId
         **/
        @Schema(example = "null", description = "")
        public String getOrganizationId() {
            return organizationId;
        }

        public void setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
        }

        public Organization links(java.util.List<Link> links) {
            this.links = links;
            return this;
        }

        public Organization addLinksItem(Link linksItem) {
            this.links.add(linksItem);
            return this;
        }

        /**
         * Get links.
         *
         * @return links
         **/
        @Schema(example = "null", description = "")
        public java.util.List<Link> getLinks() {
            return links;
        }

        public void setLinks(java.util.List<Link> links) {
            this.links = links;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Organization organization = (Organization) o;
            return Objects.equals(this.organizationId, organization.organizationId)
                    && Objects.equals(this.links, organization.links);
        }

        @Override
        public int hashCode() {
            return Objects.hash(organizationId, links);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Organization {\n");

            sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4
         * spaces (except the first line).
         */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }

    /**
     *
     * Account model with the below properties.
     * <br><b>accountId</b>: the account ID GUID.
     * <br><b>isDefault</b>: whether this is the default account, when the user has access to multiple accounts.
     * <br><b>accountName</b>: the human-readable name of the account.
     * <br><b>baseUri</b>: the base URI associated with this account.
     * It also tells which Docusign data center the account is hosted on.
     * <br><b>organization</b>: If Docusign Org Admin is enabled on this account,
     * this property contains the organization information.
     *
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Account {
        @JsonProperty("account_id")
        private String accountId = null;

        @JsonProperty("is_default")
        private String isDefault = null;

        @JsonProperty("account_name")
        private String accountName = null;

        @JsonProperty("base_uri")
        private String baseUri = null;

        @JsonProperty("organization")
        private Organization organization = new Organization();

        public Account accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Get accountId.
         *
         * @return accountId
         **/
        @Schema(example = "null", description = "")
        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public Account isDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * Get isDefault.
         *
         * @return isDefault
         **/
        @Schema(example = "null", description = "")
        public String getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(String isDefault) {
            this.isDefault = isDefault;
        }

        public Account accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * Get accountName.
         *
         * @return accountName
         **/
        @Schema(example = "null", description = "")
        public String getAccountName() {
            return accountName;
        }

        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        public Account baseUri(String baseUri) {
            this.baseUri = baseUri;
            return this;
        }

        /**
         * Get baseUri.
         *
         * @return baseUri
         **/
        @Schema(example = "null", description = "")
        public String getBaseUri() {
            return baseUri;
        }

        public void setBaseUri(String baseUri) {
            this.baseUri = baseUri;
        }

        public Account organization(Organization organization) {
            this.organization = organization;
            return this;
        }

        /**
         * Get organization.
         *
         * @return organization
         **/
        @Schema(example = "null", description = "")
        public Organization getOrganization() {
            return organization;
        }

        public void setOrganization(Organization organization) {
            this.organization = organization;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Account account = (Account) o;
            return Objects.equals(this.accountId, account.accountId)
                    && Objects.equals(this.isDefault, account.isDefault)
                    && Objects.equals(this.accountName, account.accountName)
                    && Objects.equals(this.baseUri, account.baseUri)
                    && Objects.equals(this.organization, account.organization);
        }

        @Override
        public int hashCode() {
            return Objects.hash(accountId, isDefault, accountName, baseUri, organization);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Account {\n");

            sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
            sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
            sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
            sb.append("    baseUri: ").append(toIndentedString(baseUri)).append("\n");
            sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4
         * spaces (except the first line).
         */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }

    /**
     *
     * UserInfo model with the below properties.
     * <br><b>sub</b>: the user ID GUID.
     * <br><b>accounts</b>: this is list of Docusign accounts associated with the current user.
     * <br><b>name</b>: the user's full name.
     * <br><b>givenName</b>: the user's given name.
     * <br><b>familyName</b>: the user's family name.
     * <br><b>email</b>: the user's email address.
     * <br><b>created</b>: the UTC DateTime when the user login was created.
     *
     * @see Account
     *
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UserInfo {

        @JsonProperty("sub")
        private String sub = null;

        @JsonProperty("email")
        private String email = null;

        @JsonProperty("accounts")
        private java.util.List<Account> accounts = new java.util.ArrayList<Account>();

        @JsonProperty("name")
        private String name = null;

        @JsonProperty("given_name")
        private String givenName = null;

        @JsonProperty("family_name")
        private String familyName = null;

        @JsonProperty("created")
        private String created = null;

        public UserInfo sub(String sub) {
            this.sub = sub;
            return this;
        }

        /**
         * Get sub.
         *
         * @return sub
         **/
        @Schema(example = "null", description = "")
        public String getSub() {
            return sub;
        }

        public void setSub(String sub) {
            this.sub = sub;
        }

        public UserInfo email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Get email.
         *
         * @return email
         **/
        @Schema(example = "null", description = "")
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public UserInfo accounts(java.util.List<Account> accounts) {
            this.accounts = accounts;
            return this;
        }

        public UserInfo addAccountsItem(Account accountsItem) {
            this.accounts.add(accountsItem);
            return this;
        }

        /**
         * Get accounts.
         *
         * @return accounts
         **/
        @Schema(example = "null", description = "")
        public java.util.List<Account> getAccounts() {
            return accounts;
        }

        public void setAccounts(java.util.List<Account> accounts) {
            this.accounts = accounts;
        }

        public UserInfo name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Get name.
         *
         * @return name
         **/
        @Schema(example = "null", description = "")
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public UserInfo givenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        /**
         * Get givenName.
         *
         * @return givenName
         **/
        @Schema(example = "null", description = "")
        public String getGivenName() {
            return givenName;
        }

        public void setGivenName(String givenName) {
            this.givenName = givenName;
        }

        public UserInfo familyName(String familyName) {
            this.familyName = familyName;
            return this;
        }

        /**
         * Get familyName.
         *
         * @return familyName
         **/
        @Schema(example = "null", description = "")
        public String getFamilyName() {
            return familyName;
        }

        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }

        public UserInfo created(String created) {
            this.created = created;
            return this;
        }

        /**
         * Get created.
         *
         * @return created
         **/
        @Schema(example = "null", description = "")
        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            UserInfo userInfo = (UserInfo) o;
            return Objects.equals(this.sub, userInfo.sub) && Objects.equals(this.email, userInfo.email)
                    && Objects.equals(this.accounts, userInfo.accounts) && Objects.equals(this.name, userInfo.name)
                    && Objects.equals(this.givenName, userInfo.givenName) && Objects.equals(this.familyName, userInfo.familyName)
                    && Objects.equals(this.created, userInfo.created);
        }

        @Override
        public int hashCode() {
            return Objects.hash(sub, email, accounts, name, givenName, familyName, created);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UserInfo {\n");

            sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
            sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
            sb.append("    created: ").append(toIndentedString(created)).append("\n");
            sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }

    }
}
