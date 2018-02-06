package com.docusign.esign.client.auth;

import java.util.List;
import java.util.Map;

import org.apache.oltu.oauth2.client.HttpClient;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.apache.oltu.oauth2.common.message.types.ResponseType;
import org.apache.oltu.oauth2.common.token.BasicOAuthToken;

import com.docusign.esign.client.Pair;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class OAuth implements Authentication {
	static final int MILLIS_PER_SECOND = 1000;

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
			authenticationRequestBuilder.setResponseType(ResponseType.CODE.name().toLowerCase());
			break;
		case implicit:
			tokenRequestBuilder.setGrantType(GrantType.IMPLICIT);
			authenticationRequestBuilder.setResponseType(ResponseType.TOKEN.name().toLowerCase());
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
		if (accessTokenResponse != null && accessTokenResponse.getAccessToken() != null) {
			if ((accessTokenResponse.getAccessToken() == null || (accessTokenResponse.getExpiresIn() == null)) {
				throw new ClientHandlerException("Error while requesting an access token: " + accessTokenResponse);
			}
			setAccessToken(accessTokenResponse.getAccessToken(), accessTokenResponse.getExpiresIn());
			if (accessTokenListener != null) {
				accessTokenListener.notify((BasicOAuthToken) accessTokenResponse.getOAuthToken());
			}
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
}
