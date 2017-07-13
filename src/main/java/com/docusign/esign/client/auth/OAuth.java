package com.docusign.esign.client.auth;

import com.migcomponents.migbase64.Base64;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response.Status.Family;

import org.apache.oltu.oauth2.client.HttpClient;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.apache.oltu.oauth2.client.response.OAuthClientResponse;
import org.apache.oltu.oauth2.client.response.OAuthClientResponseFactory;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.apache.oltu.oauth2.common.message.types.ResponseType;
import org.apache.oltu.oauth2.common.token.BasicOAuthToken;

import com.docusign.esign.client.Pair;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;

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

	public static class OAuthJerseyClient implements HttpClient {

		private Client client;

		public OAuthJerseyClient() {
			this.client = new Client(null, null);
		}

		public OAuthJerseyClient(Client client) {
			this.client = client;
		}

		public <T extends OAuthClientResponse> T execute(OAuthClientRequest request, Map<String, String> headers,
				String requestMethod, Class<T> responseClass) throws OAuthSystemException, OAuthProblemException {
			String contentType = headers.get("Content-Type");
			String url = request.getLocationUri();
			String body = request.getBody();
			Builder builder = this.client.resource(url).getRequestBuilder();

			for (String key : headers.keySet()) {
				builder = builder.header(key, headers.get(key));
			}
			
			String grantType = null, code = null, clientId = null, clientSecret = null;
			for (String entry : body.split("&")) {
				String key = entry.split("=")[0];
				String value = entry.split("=")[1];
				if ("grant_type".equals(key)) {
					grantType = value;
				} else if ("code".equals(key)) {
					code = value;
				} else if ("client_id".equals(key)) {
					clientId = value;
				} else if ("client_secret".equals(key)) {
					clientSecret = value;
				}
			}
			
			if (grantType == null || code == null) {
				throw new OAuthSystemException("Missing grant_type/code");
			} else {
				body = "grant_type=" + grantType + "&code=" + code;
			}
			
			if (clientId == null || clientSecret == null) {
				throw new OAuthSystemException("Missing clientId/secret");
			} else {
				byte[] bytes = (clientId + ":" + clientSecret).getBytes();
				builder.header("Authorization", "Basic " + Base64.encodeToString(bytes, false));
			}

			ClientResponse response = null;

			if ("GET".equals(requestMethod)) {
				response = (ClientResponse) builder.get(ClientResponse.class);
			} else if ("POST".equals(requestMethod)) {
				response = builder.type(contentType).post(ClientResponse.class, body);
			} else if ("PUT".equals(requestMethod)) {
				response = builder.type(contentType).put(ClientResponse.class, body);
			} else if ("DELETE".equals(requestMethod)) {
				response = builder.type(contentType).delete(ClientResponse.class, body);
			}

			if(response.getStatusInfo() == ClientResponse.Status.NO_CONTENT) {
		      return null;
		    } else if (response.getStatusInfo().getFamily() == Family.SUCCESSFUL) {
		      if (responseClass == null)
		        return null;
		      else {
		    	String respBody = response.getEntity(String.class);
		        return OAuthClientResponseFactory.createCustomResponse(
		        		respBody,
	                    contentType,
	                    response.getStatus(),
	                    response.getHeaders(),
	                    responseClass
	            );
		      }
		    } else {
		      String message = "error";
		      String respBody = null;
		      if (response.hasEntity()) {
		        try {
		          respBody = response.getEntity(String.class);
		          message = respBody;
		          System.err.println(message);
		        } catch (RuntimeException e) {
		          e.printStackTrace();
		        }
		      }
		    }
			return null;
		}

		public void shutdown() {
			// Nothing to do here
		}
	}
}
