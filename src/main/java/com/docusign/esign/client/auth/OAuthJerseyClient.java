package com.docusign.esign.client.auth;

import com.migcomponents.migbase64.Base64;
import java.util.Map;

import javax.ws.rs.core.Response.Status.Family;
import org.apache.oltu.oauth2.client.HttpClient;
import org.apache.oltu.oauth2.client.response.OAuthClientResponse;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthClientResponseFactory;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class OAuthJerseyClient implements HttpClient {

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
		
		String grantType = null, code = null, clientId = null, clientSecret = null, refreshToken = null;
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
			} else if ("refresh_token".equals(key)) {
				refreshToken = value;
			}
		}

		if (grantType == null) {
			throw new OAuthSystemException("Missing grant_type");
		}
		if (!grantType.equals(GrantType.REFRESH_TOKEN.toString()) && code == null) {
			throw new OAuthSystemException("Missing code for grant_type="+grantType);
		}
		if (grantType.equals(GrantType.REFRESH_TOKEN.toString()) && refreshToken == null) {
			throw new OAuthSystemException("Missing refresh_token for grant_type="+grantType);
		}

		body = "grant_type=" + grantType;
		if (code != null) {
			body = body + "&code=" + code;
		}
		if (refreshToken != null) {
			body = body + "&refresh_token=" + refreshToken;
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
