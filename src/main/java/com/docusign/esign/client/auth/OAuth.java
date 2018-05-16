package com.docusign.esign.client.auth;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.ws.rs.core.Response;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.apache.oltu.oauth2.common.token.BasicOAuthToken;

import com.docusign.esign.client.Pair;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;

import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
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

	private volatile String accessToken;
	private Long expirationTimeMillis;
	private OAuthClient oauthClient;
	private TokenRequestBuilder tokenRequestBuilder;
	private AuthenticationRequestBuilder authenticationRequestBuilder;
	private AccessTokenListener accessTokenListener;

	public OAuth(Client client, TokenRequestBuilder tokenRequestBuilder, AuthenticationRequestBuilder authenticationRequestBuilder) {
		this.oauthClient = new OAuthClient(new OAuthJerseyClient(client));
		this.tokenRequestBuilder = tokenRequestBuilder;
		this.authenticationRequestBuilder = authenticationRequestBuilder;
	}

	public OAuth(Client client, OAuthFlow flow, String authorizationUrl, String tokenUrl, String scopes) {
		this(client, OAuthClientRequest.tokenLocation(tokenUrl).setScope(scopes), OAuthClientRequest.authorizationLocation(authorizationUrl).setScope(scopes));

		switch (flow) {
		case accessCode:
			tokenRequestBuilder.setGrantType(GrantType.AUTHORIZATION_CODE);
			authenticationRequestBuilder.setResponseType(OAuth.CODE);
			break;
		case implicit:
			tokenRequestBuilder.setGrantType(GrantType.IMPLICIT);
			authenticationRequestBuilder.setResponseType(OAuth.TOKEN);
			break;
		case password:
			tokenRequestBuilder.setGrantType(GrantType.PASSWORD);
			break;
		case application:
			tokenRequestBuilder.setGrantType(GrantType.CLIENT_CREDENTIALS);
			break;
		default:
			break;
		}
	}

	public OAuth(OAuthFlow flow, String authorizationUrl, String tokenUrl, String scopes) {
		this(new Client(null, null), flow, authorizationUrl, tokenUrl, scopes);
	}

	@Override
	public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
		// If the request already have an authorization (eg. Basic auth), do
		// nothing
		if (headerParams.containsKey("Authorization")) {
			return;
		}
		// If first time, get the token
		if (expirationTimeMillis == null || System.currentTimeMillis() >= expirationTimeMillis) {
			updateAccessToken();
		}
		if (accessToken != null) {
			headerParams.put("Authorization", "Bearer " + accessToken);
		}
	}

	public synchronized void updateAccessToken() {
		OAuthJSONAccessTokenResponse accessTokenResponse;
		try {
			accessTokenResponse = oauthClient.accessToken(tokenRequestBuilder.buildBodyMessage());
		} catch (Exception e) {
			throw new ClientHandlerException(e.getMessage(), e);
		}
		if (accessTokenResponse != null)
		{
			// FIXME: This does not work in case of non HTTP 200 :-( oauthClient needs to return the plain HTTP resonse
			if (accessTokenResponse.getResponseCode() != Response.Status.OK.getStatusCode())
			{
				throw new ClientHandlerException("Error while requesting an access token, received HTTP code: " + accessTokenResponse.getResponseCode());
			}
		
			if (accessTokenResponse.getAccessToken() == null) {
				throw new ClientHandlerException("Error while requesting an access token. No 'access_token' found.");
			}
			if (accessTokenResponse.getExpiresIn() == null) {
				throw new ClientHandlerException("Error while requesting an access token. No 'expires_in' found.");
			}
		
			setAccessToken(accessTokenResponse.getAccessToken(), accessTokenResponse.getExpiresIn());
			if (this.accessTokenListener != null) {
				this.accessTokenListener.notify((BasicOAuthToken)accessTokenResponse.getOAuthToken());
			}
		} else {
			// in case of HTTP error codes accessTokenResponse is null, thus no check of accessTokenResponse.getResponseCode() possible :-(
			throw new ClientHandlerException("Error while requesting an access token. No accessTokenResponse object recieved, maybe a non HTTP 200 received?");
		}
	}

	public synchronized void registerAccessTokenListener(AccessTokenListener accessTokenListener) {
		this.accessTokenListener = accessTokenListener;
	}

	public synchronized String getAccessToken() {
		return accessToken;
	}

	public synchronized void setAccessToken(String accessToken, Long expiresIn) {
		this.accessToken = accessToken;
		this.expirationTimeMillis = System.currentTimeMillis() + expiresIn * MILLIS_PER_SECOND;
	}

	public TokenRequestBuilder getTokenRequestBuilder() {
		return tokenRequestBuilder;
	}

	public void setTokenRequestBuilder(TokenRequestBuilder tokenRequestBuilder) {
		this.tokenRequestBuilder = tokenRequestBuilder;
	}

	public AuthenticationRequestBuilder getAuthenticationRequestBuilder() {
		return authenticationRequestBuilder;
	}

	public void setAuthenticationRequestBuilder(AuthenticationRequestBuilder authenticationRequestBuilder) {
		this.authenticationRequestBuilder = authenticationRequestBuilder;
	}

	public OAuthClient getOauthClient() {
		return oauthClient;
	}

	public void setOauthClient(OAuthClient oauthClient) {
		this.oauthClient = oauthClient;
	}

	public void setOauthClient(Client client) {
		this.oauthClient = new OAuthClient(new OAuthJerseyClient(client));
	}
	
	/**
	 * 
	 * OAuthToken model with the following properties:
	 * <br><b>accessToken</b>: the token you will use in the Authorization header of calls to the DocuSign API.
	 * <br><b>tokenType</b>: this is the type of the accessToken. It is usually "Bearer".
	 * <br><b>refreshToken</b>: a token you can use to get a new accessToken without requiring user interaction.
	 * <br><b>expiresIn</b>: the number of seconds before the accessToken expires.
	 *
	 */
	public static class OAuthToken {
		@JsonProperty("access_token")
		private String accessToken = null;

		@JsonProperty("token_type")
		private String tokenType = null;

		@JsonProperty("refresh_token")
		private String refreshToken = null;

		@JsonProperty("expires_in")
		private Long expiresIn = 0L;

		public OAuthToken accessToken(String accessToken) {
			this.accessToken = accessToken;
			return this;
		}

		/**
		 * Get accessToken
		 *
		 * @return accessToken
		 **/
		@ApiModelProperty(example = "null", value = "")
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
		 * Get tokenType
		 *
		 * @return tokenType
		 **/
		@ApiModelProperty(example = "null", value = "")
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
		 * Get refreshToken
		 * 
		 * @return refreshToken
		 **/
		@ApiModelProperty(example = "null", value = "")
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
		 * Get expiresIn
		 * 
		 * @return expiresIn
		 **/
		@ApiModelProperty(example = "3600L", value = "0L")
		public Long getExpiresIn() {
			return expiresIn;
		}

		public void setExpiresIn(Long expiresIn) {
			this.expiresIn = expiresIn;
		}

		@Override
		public boolean equals(java.lang.Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			OAuthToken account = (OAuthToken) o;
			return Objects.equals(this.accessToken, account.accessToken)
					&& Objects.equals(this.tokenType, account.tokenType)
					&& Objects.equals(this.refreshToken, account.refreshToken)
					&& Objects.equals(this.expiresIn, account.expiresIn);
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
	 * UserInfo model with the following properties:
	 * <br><b>sub</b>: the user ID GUID.
	 * <br><b>accounts</b>: this is list of DocuSign accounts associated with the current user.
	 * <br><b>name</b>: the user's full name.
	 * <br><b>givenName</b>: the user's given name.
	 * <br><b>familyName</b>: the user's family name.
	 * <br><b>email</b>: the user's email address.
	 * <br><b>created</b>: the UTC DateTime when the user login was created.
	 *
	 * @see Account
	 *
	 */
	public static class UserInfo {
		/**
		 * 
		 * Account model with the following properties:
		 * <br><b>accountId</b>: the account ID GUID.
		 * <br><b>isDefault</b>: whether this is the default account, when the user has access to multiple accounts.
		 * <br><b>accountName</b>: the human-readable name of the account.
		 * <br><b>baseUri</b>: the base URI associated with this account.
		 * It also tells which DocuSign data center the account is hosted on.
		 *
		 */
		public static class Account {
			@JsonProperty("account_id")
			private String accountId = null;

			@JsonProperty("is_default")
			private String isDefault = null;

			@JsonProperty("account_name")
			private String accountName = null;

			@JsonProperty("base_uri")
			private String baseUri = null;

			public Account accountId(String accountId) {
				this.accountId = accountId;
				return this;
			}

			/**
			 * Get accountId
			 *
			 * @return accountId
			 **/
			@ApiModelProperty(example = "null", value = "")
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
			 * Get isDefault
			 *
			 * @return isDefault
			 **/
			@ApiModelProperty(example = "null", value = "")
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
			 * Get accountName
			 * 
			 * @return accountName
			 **/
			@ApiModelProperty(example = "null", value = "")
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
			 * Get baseUri
			 * 
			 * @return baseUri
			 **/
			@ApiModelProperty(example = "null", value = "")
			public String getBaseUri() {
				return baseUri;
			}

			public void setBaseUri(String baseUri) {
				this.baseUri = baseUri;
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
						&& Objects.equals(this.baseUri, account.baseUri);
			}

			@Override
			public int hashCode() {
				return Objects.hash(accountId, isDefault, accountName, baseUri);
			}

			@Override
			public String toString() {
				StringBuilder sb = new StringBuilder();
				sb.append("class Account {\n");

				sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
				sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
				sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
				sb.append("    baseUri: ").append(toIndentedString(baseUri)).append("\n");
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
		 * Get sub
		 *
		 * @return sub
		 **/
		@ApiModelProperty(example = "null", value = "")
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
		 * Get email
		 *
		 * @return email
		 **/
		@ApiModelProperty(example = "null", value = "")
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
		 * Get accounts
		 * 
		 * @return accounts
		 **/
		@ApiModelProperty(example = "null", value = "")
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
		 * Get name
		 *
		 * @return name
		 **/
		@ApiModelProperty(example = "null", value = "")
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
		 * Get givenName
		 *
		 * @return givenName
		 **/
		@ApiModelProperty(example = "null", value = "")
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
		 * Get familyName
		 *
		 * @return familyName
		 **/
		@ApiModelProperty(example = "null", value = "")
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
		 * Get created
		 *
		 * @return created
		 **/
		@ApiModelProperty(example = "null", value = "")
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
