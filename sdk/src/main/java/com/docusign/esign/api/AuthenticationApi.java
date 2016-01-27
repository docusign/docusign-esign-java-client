package com.docusign.esign.api;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.TypeRef;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.LoginInformation;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
   */
  public LoginInformation login(AuthenticationApi.LoginOptions options) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/v2/login_information".replaceAll("\\{format\\}","json");

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "login_settings", options.loginSettings));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "api_password", options.apiPassword));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_account_id_guid", options.includeAccountIdGuid));
	 
    }

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<LoginInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
}
