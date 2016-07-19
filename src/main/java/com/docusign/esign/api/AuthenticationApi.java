package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.LoginInformation;


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

  

  
  /// <summary>
  /// Gets login information for a specified user. Retrieves login information for a specified user. Each account that is associated with the login credentials is listed. You can use the returned information to determine whether a user is authenticated and select an account to use in future operations.  \n\nThe `baseUrl` property, returned in the response, is used in all future API calls as the base of the request URL. The `baseUrl` property contains the DocuSign server, the API version, and the `accountId` property that is used for the login. This request uses your DocuSign credentials to retrieve the account information.
  /// </summary>
  public class LoginOptions
  {
    
    private String loginSettings = null;
    
    private String embedAccountIdGuid = null;
    
    private String apiPassword = null;
    
    private String includeAccountIdGuid = null;
    
    
    /*
     * Determines whether login settings are returned in the response.\n\nValid Values:\n\n* all -  All the login settings are returned. \n* none - no login settings are returned. 
     */
    public void setLoginSettings(String loginSettings) {
      this.loginSettings = loginSettings;
    }

    public String getLoginSettings() {
      return this.loginSettings;
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
     * When set to **true**, shows the account API password in the response. 
     */
    public void setApiPassword(String apiPassword) {
      this.apiPassword = apiPassword;
    }

    public String getApiPassword() {
      return this.apiPassword;
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
   
   * AuthenticationApi.LoginOptions Options for modifying the method behavior.
   * @return LoginInformation
   * @throws ApiException if fails to make API call
   */
  public LoginInformation login(AuthenticationApi.LoginOptions options) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/login_information".replaceAll("\\{format\\}","json");

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "login_settings", options.loginSettings));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "embed_account_id_guid", options.embedAccountIdGuid));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "api_password", options.apiPassword));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_account_id_guid", options.includeAccountIdGuid));
    
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<LoginInformation> localVarReturnType = new GenericType<LoginInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
