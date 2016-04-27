package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.AccountInformation;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.AccountSettingsInformation;
import com.docusign.esign.model.AccountSharedAccess;
import com.docusign.esign.model.FileTypeList;


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
    
    private String op = null;
    
    private String includeAccountSettings = null;
    
    
    /*
     * 
     */
    public void setOp(String op) {
      this.op = op;
    }

    public String getOp() {
      return this.op;
    }
    
    /*
     * When set to **true**, includes the account settings for the account in the response. 
     */
    public void setIncludeAccountSettings(String includeAccountSettings) {
      this.includeAccountSettings = includeAccountSettings;
    }

    public String getIncludeAccountSettings() {
      return this.includeAccountSettings;
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
   * @throws ApiException if fails to make API call
   */
  public AccountInformation getAccountInformation(String accountId, AccountsApi.GetAccountInformationOptions options) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountInformation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "op", options.op));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_account_settings", options.includeAccountSettings));
    
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<AccountInformation> localVarReturnType = new GenericType<AccountInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets a list of custom fields associated with the account.
   * Retrieves a list of envelope custom fields associated with the account. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.\n\nThere are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. The list custom field lets the sender select the value of the field from a list you provide.
      * @param accountId The external account number (int) or account ID Guid.
   
   * AccountsApi.ListCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields listCustomFields(String accountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets account settings information.
   * Retrieves the account settings information for the specified account.
      * @param accountId The external account number (int) or account ID Guid.
   
   * AccountsApi.ListSettingsOptions Options for modifying the method behavior.
   * @return AccountSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public AccountSettingsInformation listSettings(String accountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<AccountSettingsInformation> localVarReturnType = new GenericType<AccountSettingsInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Reserved: Gets the shared item status for one or more users.
   * Reserved: Retrieves shared item status for one or more users and types of items.\n\nUsers with account administration privileges can retrieve shared access information for all account users. Users without account administrator privileges can only retrieve shared access information for themselves and the returned information is limited to the retrieving the status of all members of the account that are sharing their folders to the user. This is equivalent to setting the shared=shared_from.
      * @param accountId The external account number (int) or account ID Guid.
   
   * AccountsApi.ListSharedAccessOptions Options for modifying the method behavior.
   * @return AccountSharedAccess
   * @throws ApiException if fails to make API call
   */
  public AccountSharedAccess listSharedAccess(String accountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSharedAccess");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/shared_access".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<AccountSharedAccess> localVarReturnType = new GenericType<AccountSharedAccess>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets a list of unsupported file types.
   * Retrieves a list of file types (mime-types and file-extensions) that are not supported for upload through the DocuSign system.
      * @param accountId The external account number (int) or account ID Guid.
   
   * AccountsApi.ListUnsupportedFileTypesOptions Options for modifying the method behavior.
   * @return FileTypeList
   * @throws ApiException if fails to make API call
   */
  public FileTypeList listUnsupportedFileTypes(String accountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listUnsupportedFileTypes");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/unsupported_file_types".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FileTypeList> localVarReturnType = new GenericType<FileTypeList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Updates the account settings for an account.
   * Updates the account settings for the specified account.
      * @param accountId The external account number (int) or account ID Guid.
   
   * AccountsApi.UpdateSettingsOptions Options for modifying the method behavior.
   * @return void
   * @throws ApiException if fails to make API call
   */
  public void updateSettings(String accountId, AccountSettingsInformation accountSettingsInformation) throws ApiException {
    Object localVarPostBody = accountSettingsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
