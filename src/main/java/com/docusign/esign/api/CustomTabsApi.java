package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.TabMetadata;
import com.docusign.esign.model.TabMetadataList;


public class CustomTabsApi {
  private ApiClient apiClient;

  public CustomTabsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomTabsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  

  

  /**
   * Creates a custom tab.
   * Creates a tab with pre-defined properties, such as a text tab with a certain font type and validation pattern. Users can access the custom tabs when sending documents through the DocuSign web application.\n\nCustom tabs can be created for approve, checkbox, company, date, date signed, decline, email, email address, envelope ID, first name, formula, full name, initial here, last name, list, note, number, radio, sign here, signer attachment, SSN, text, title, and zip tabs.
      * @param accountId The external account number (int) or account ID Guid.
   
   * CustomTabsApi.CreateOptions Options for modifying the method behavior.
   * @return TabMetadata
   * @throws ApiException if fails to make API call
   */
  public TabMetadata create(String accountId, TabMetadata tabMetadata) throws ApiException {
    Object localVarPostBody = tabMetadata;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling create");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/tab_definitions".replaceAll("\\{format\\}","json")
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

    
    GenericType<TabMetadata> localVarReturnType = new GenericType<TabMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Deletes custom tab information.
   * Deletes the custom from the specified account.
      * @param accountId The external account number (int) or account ID Guid.
      * @param customTabId 
   
   * CustomTabsApi.DeleteOptions Options for modifying the method behavior.
   * @return void
   * @throws ApiException if fails to make API call
   */
  public void delete(String accountId, String customTabId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling delete");
    }
    
    // verify the required parameter 'customTabId' is set
    if (customTabId == null) {
      throw new ApiException(400, "Missing the required parameter 'customTabId' when calling delete");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/tab_definitions/{customTabId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customTabId" + "\\}", apiClient.escapeString(customTabId.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  

  

  /**
   * Gets custom tab information.
   * Retrieves information about the requested custom tab on the specified account.
      * @param accountId The external account number (int) or account ID Guid.
      * @param customTabId 
   
   * CustomTabsApi.GetOptions Options for modifying the method behavior.
   * @return TabMetadata
   * @throws ApiException if fails to make API call
   */
  public TabMetadata get(String accountId, String customTabId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling get");
    }
    
    // verify the required parameter 'customTabId' is set
    if (customTabId == null) {
      throw new ApiException(400, "Missing the required parameter 'customTabId' when calling get");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/tab_definitions/{customTabId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customTabId" + "\\}", apiClient.escapeString(customTabId.toString()));

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

    
    GenericType<TabMetadata> localVarReturnType = new GenericType<TabMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  
  /// <summary>
  /// Gets a list of all account tabs. Retrieves a list of all tabs associated with the account.
  /// </summary>
  public class ListOptions
  {
    
    private String customTabOnly = null;
    
    
    /*
     * When set to **true**, only custom tabs are returned in the response.  
     */
    public void setCustomTabOnly(String customTabOnly) {
      this.customTabOnly = customTabOnly;
    }

    public String getCustomTabOnly() {
      return this.customTabOnly;
    }
    
  }

  /**
   * Gets a list of all account tabs.
   * Retrieves a list of all tabs associated with the account.
     * @param accountId The external account number (int) or account ID Guid.
     * @return TabMetadataList
   */ 
  public TabMetadataList list(String accountId) throws ApiException {
    return list(accountId, null);
  }
  

  /**
   * Gets a list of all account tabs.
   * Retrieves a list of all tabs associated with the account.
      * @param accountId The external account number (int) or account ID Guid.
   
   * CustomTabsApi.ListOptions Options for modifying the method behavior.
   * @return TabMetadataList
   * @throws ApiException if fails to make API call
   */
  public TabMetadataList list(String accountId, CustomTabsApi.ListOptions options) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling list");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/tab_definitions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_tab_only", options.customTabOnly));
    
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<TabMetadataList> localVarReturnType = new GenericType<TabMetadataList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Updates custom tab information.\n\n
   * Updates the information in a custom tab for the specified account.
      * @param accountId The external account number (int) or account ID Guid.
      * @param customTabId 
   
   * CustomTabsApi.UpdateOptions Options for modifying the method behavior.
   * @return TabMetadata
   * @throws ApiException if fails to make API call
   */
  public TabMetadata update(String accountId, String customTabId, TabMetadata tabMetadata) throws ApiException {
    Object localVarPostBody = tabMetadata;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling update");
    }
    
    // verify the required parameter 'customTabId' is set
    if (customTabId == null) {
      throw new ApiException(400, "Missing the required parameter 'customTabId' when calling update");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/tab_definitions/{customTabId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customTabId" + "\\}", apiClient.escapeString(customTabId.toString()));

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

    
    GenericType<TabMetadata> localVarReturnType = new GenericType<TabMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
