package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.UserSocialIdResult;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.SocialAccountInformation;
import com.docusign.esign.model.LoginInformation;
import com.docusign.esign.model.UserPasswordInformation;
import com.docusign.esign.model.OauthAccess;


public class AuthenticationApi {
  private ApiClient apiClient;

  public AuthenticationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthenticationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  
  
  /**
   * Gets a list of a user&#39;s social accounts.
   * Retrieves a list of social accounts linked to a user&#39;s account.
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param AuthenticationApi.ListSocialLoginsOptions Options for modifying the method behavior.
   * @return UserSocialIdResult
   */
  public UserSocialIdResult listSocialLogins(String accountId, String userId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSocialLogins");
     }
     
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling listSocialLogins");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/users/{userId}/social".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<UserSocialIdResult> returnType = new GenericType<UserSocialIdResult>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Adds social account for a user.
   * Adds a new social account to a user&#39;s account.
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param AuthenticationApi.UpdateSocialLoginOptions Options for modifying the method behavior.
   * @return void
   */
  public void updateSocialLogin(String accountId, String userId, SocialAccountInformation socialAccountInformation) throws ApiException {
  
    Object postBody = socialAccountInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSocialLogin");
     }
     
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling updateSocialLogin");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/users/{userId}/social".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Deletes user&#39;s social account.
   * Deletes a social account from a use&#39;s account.
   * @param accountId The external account number (int) or account ID Guid.
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing.
   * @param AuthenticationApi.DeleteSocialLoginOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteSocialLogin(String accountId, String userId, SocialAccountInformation socialAccountInformation) throws ApiException {
  
    Object postBody = socialAccountInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteSocialLogin");
     }
     
     // verify the required parameter 'userId' is set
     if (userId == null) {
        throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteSocialLogin");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/users/{userId}/social".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  /// <summary>
  /// Gets login information for a specified user. Retrieves login information for a specified user. Each account that is associated with the login credentials is listed. You can use the returned information to determine whether a user is authenticated and select an account to use in future operations.  \n\nThe `baseUrl` property, returned in the response, is used in all future API calls as the base of the request URL. The `baseUrl` property contains the DocuSign server, the API version, and the `accountId` property that is used for the login. This request uses your DocuSign credentials to retrieve the account information.
  /// </summary>
  public class LoginOptions
  {
	
	private String apiPassword = null;
	
	private String embedAccountIdGuid = null;
	
	private String includeAccountIdGuid = null;
	
	private String loginSettings = null;
	
	
	/*
	 * When set to **true**, shows the account API password in the response. 
	 */
	public void setApiPassword(String apiPassword) {
		this.apiPassword = apiPassword;
	}
	
	public String getApiPassword() {
		return this.apiPassword;
	}
	
	/*
	 * 
	 */
	public void setEmbedAccountIdGuid(String embedAccountIdGuid) {
		this.embedAccountIdGuid = embedAccountIdGuid;
	}
	
	public String getEmbedAccountIdGuid() {
		return this.embedAccountIdGuid;
	}
	
	/*
	 * When set to **true**, shows the account ID GUID in the response. 
	 */
	public void setIncludeAccountIdGuid(String includeAccountIdGuid) {
		this.includeAccountIdGuid = includeAccountIdGuid;
	}
	
	public String getIncludeAccountIdGuid() {
		return this.includeAccountIdGuid;
	}
	
	/*
	 * Determines whether login settings are returned in the response.\n\nValid Values:\n\n* all -  All the login settings are returned. \n* none - no login settings are returned. 
	 */
	public void setLoginSettings(String loginSettings) {
		this.loginSettings = loginSettings;
	}
	
	public String getLoginSettings() {
		return this.loginSettings;
	}
	
  }

   /**
   * Gets login information for a specified user.
   * Retrieves login information for a specified user. Each account that is associated with the login credentials is listed. You can use the returned information to determine whether a user is authenticated and select an account to use in future operations.  \n\nThe `baseUrl` property, returned in the response, is used in all future API calls as the base of the request URL. The `baseUrl` property contains the DocuSign server, the API version, and the `accountId` property that is used for the login. This request uses your DocuSign credentials to retrieve the account information.
   * @return LoginInformation
   */ 
  public LoginInformation login() throws ApiException {
    return login(null);
  }
  
  
  /**
   * Gets login information for a specified user.
   * Retrieves login information for a specified user. Each account that is associated with the login credentials is listed. You can use the returned information to determine whether a user is authenticated and select an account to use in future operations.  \n\nThe `baseUrl` property, returned in the response, is used in all future API calls as the base of the request URL. The `baseUrl` property contains the DocuSign server, the API version, and the `accountId` property that is used for the login. This request uses your DocuSign credentials to retrieve the account information.
   * @param AuthenticationApi.LoginOptions Options for modifying the method behavior.
   * @return LoginInformation
   */
  public LoginInformation login(AuthenticationApi.LoginOptions options) throws ApiException {
  
    Object postBody = null;
    
    // create path and map variables
    String path = "/v2/login_information".replaceAll("\\{format\\}","json");

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "api_password", options.apiPassword));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "embed_account_id_guid", options.embedAccountIdGuid));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_account_id_guid", options.includeAccountIdGuid));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "login_settings", options.loginSettings));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<LoginInformation> returnType = new GenericType<LoginInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates the password for a specified user.
   * Updates the password for a specified user.
   * @param loginPart Currently, only the value **password** is supported.
   * @param AuthenticationApi.UpdatePasswordOptions Options for modifying the method behavior.
   * @return void
   */
  public void updatePassword(String loginPart, UserPasswordInformation userPasswordInformation) throws ApiException {
  
    Object postBody = userPasswordInformation;
    
     // verify the required parameter 'loginPart' is set
     if (loginPart == null) {
        throw new ApiException(400, "Missing the required parameter 'loginPart' when calling updatePassword");
     }
     
    // create path and map variables
    String path = "/v2/login_information/{loginPart}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "loginPart" + "\\}", apiClient.escapeString(loginPart.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Revokes an authorization token.
   * Revokes an OAuth2 authorization server token. After the revocation is complete, a caller must re-authenticate to restore access.
   * @param AuthenticationApi.RevokeOAuthTokenOptions Options for modifying the method behavior.
   * @return void
   */
  public void revokeOAuthToken() throws ApiException {
  
    Object postBody = null;
    
    // create path and map variables
    String path = "/v2/oauth2/revoke".replaceAll("\\{format\\}","json");

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Creates an authorization token.
   * Creates an OAuth2 authorization server token endpoint.
   * @param AuthenticationApi.GetOAuthTokenOptions Options for modifying the method behavior.
   * @return OauthAccess
   */
  public OauthAccess getOAuthToken() throws ApiException {
  
    Object postBody = null;
    
    // create path and map variables
    String path = "/v2/oauth2/token".replaceAll("\\{format\\}","json");

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<OauthAccess> returnType = new GenericType<OauthAccess>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
