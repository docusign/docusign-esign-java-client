package com.docusign.esign.api;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.TypeRef;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.AccountInformation;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.AccountSettingsInformation;
import com.docusign.esign.model.AccountSharedAccess;
import com.docusign.esign.model.FileTypeList;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class AccountsApi {
  private ApiClient apiClient;

  public AccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  


  
  
  /// <summary>
  /// Retrieves the account information for the specified account. Retrieves the account information for the specified account.\n\n**Response**\nThe `canUpgrade` property contains is a Boolean that indicates whether the account can be upgraded through the API.
  /// </summary>
  public class GetAccountInformationOptions
  {
	
	private String includeAccountSettings = null;
	
	private String op = null;
	
	
	/*
	 * When set to **true**, includes the account settings for the account in the response. 
	 */
	public void setIncludeAccountSettings(String includeAccountSettings) {
		this.includeAccountSettings = includeAccountSettings;
	}
	
	public String getIncludeAccountSettings() {
		return this.includeAccountSettings;
	}
	
	/*
	 * 
	 */
	public void setOp(String op) {
		this.op = op;
	}
	
	public String getOp() {
		return this.op;
	}
	
  }

   /**
   * Retrieves the account information for the specified account.
   * Retrieves the account information for the specified account.\n\n**Response**\nThe `canUpgrade` property contains is a Boolean that indicates whether the account can be upgraded through the API.
   * @param accountId The external account number (int) or account ID Guid.
   * @return AccountInformation
   */ 
  public AccountInformation getAccountInformation(String accountId) throws ApiException {
    return getAccountInformation(accountId, null);
  }
  
  
  /**
   * Retrieves the account information for the specified account.
   * Retrieves the account information for the specified account.\n\n**Response**\nThe `canUpgrade` property contains is a Boolean that indicates whether the account can be upgraded through the API.
   * @param accountId The external account number (int) or account ID Guid.
   * AccountsApi.GetAccountInformationOptions Options for modifying the method behavior.
   * @return AccountInformation
   */
  public AccountInformation getAccountInformation(String accountId, AccountsApi.GetAccountInformationOptions options) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountInformation");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include_account_settings", options.includeAccountSettings));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "op", options.op));
	 
    }

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<AccountInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets a list of custom fields associated with the account.
   * Retrieves a list of envelope custom fields associated with the account. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.\n\nThere are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. The list custom field lets the sender select the value of the field from a list you provide.
   * @param accountId The external account number (int) or account ID Guid.
   * AccountsApi.ListCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields listCustomFields(String accountId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<CustomFields>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets account settings information.
   * Retrieves the account settings information for the specified account.
   * @param accountId The external account number (int) or account ID Guid.
   * AccountsApi.ListSettingsOptions Options for modifying the method behavior.
   * @return AccountSettingsInformation
   */
  public AccountSettingsInformation listSettings(String accountId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<AccountSettingsInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Updates the account settings for an account.
   * Updates the account settings for the specified account.
   * @param accountId The external account number (int) or account ID Guid.
   * AccountsApi.UpdateSettingsOptions Options for modifying the method behavior.
   * @return void
   */
  public void updateSettings(String accountId, AccountSettingsInformation accountSettingsInformation) throws ApiException {
  
     Object postBody = accountSettingsInformation;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    
	
  }
  
  


  
  
  
  /**
   * Reserved: Gets the shared item status for one or more users.
   * Reserved: Retrieves shared item status for one or more users and types of items.\n\nUsers with account administration privileges can retrieve shared access information for all account users. Users without account administrator privileges can only retrieve shared access information for themselves and the returned information is limited to the retrieving the status of all members of the account that are sharing their folders to the user. This is equivalent to setting the shared=shared_from.
   * @param accountId The external account number (int) or account ID Guid.
   * AccountsApi.ListSharedAccessOptions Options for modifying the method behavior.
   * @return AccountSharedAccess
   */
  public AccountSharedAccess listSharedAccess(String accountId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSharedAccess");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/shared_access".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<AccountSharedAccess>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets a list of unsupported file types.
   * Retrieves a list of file types (mime-types and file-extensions) that are not supported for upload through the DocuSign system.
   * @param accountId The external account number (int) or account ID Guid.
   * AccountsApi.ListUnsupportedFileTypesOptions Options for modifying the method behavior.
   * @return FileTypeList
   */
  public FileTypeList listUnsupportedFileTypes(String accountId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listUnsupportedFileTypes");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/unsupported_file_types".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<FileTypeList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
}
