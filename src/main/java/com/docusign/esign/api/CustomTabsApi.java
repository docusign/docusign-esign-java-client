package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.TabMetadataList;
import com.docusign.esign.model.TabMetadata;


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
   * @param CustomTabsApi.ListOptions Options for modifying the method behavior.
   * @return TabMetadataList
   */
  public TabMetadataList list(String accountId, CustomTabsApi.ListOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling list");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/tab_definitions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "custom_tab_only", options.customTabOnly));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<TabMetadataList> returnType = new GenericType<TabMetadataList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Creates a custom tab.
   * Creates a tab with pre-defined properties, such as a text tab with a certain font type and validation pattern. Users can access the custom tabs when sending documents through the DocuSign web application.\n\nCustom tabs can be created for approve, checkbox, company, date, date signed, decline, email, email address, envelope ID, first name, formula, full name, initial here, last name, list, note, number, radio, sign here, signer attachment, SSN, text, title, and zip tabs.
   * @param accountId The external account number (int) or account ID Guid.
   * @param CustomTabsApi.CreateOptions Options for modifying the method behavior.
   * @return TabMetadata
   */
  public TabMetadata create(String accountId, TabMetadata tabMetadata) throws ApiException {
  
    Object postBody = tabMetadata;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling create");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/tab_definitions".replaceAll("\\{format\\}","json")
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

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<TabMetadata> returnType = new GenericType<TabMetadata>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets custom tab information.
   * Retrieves information about the requested custom tab on the specified account.
   * @param accountId The external account number (int) or account ID Guid.
   * @param customTabId 
   * @param CustomTabsApi.GetOptions Options for modifying the method behavior.
   * @return TabMetadata
   */
  public TabMetadata get(String accountId, String customTabId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling get");
     }
     
     // verify the required parameter 'customTabId' is set
     if (customTabId == null) {
        throw new ApiException(400, "Missing the required parameter 'customTabId' when calling get");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/tab_definitions/{customTabId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customTabId" + "\\}", apiClient.escapeString(customTabId.toString()));

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

    
    GenericType<TabMetadata> returnType = new GenericType<TabMetadata>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates custom tab information.
   * Updates the information in a custom tab for the specified account.
   * @param accountId The external account number (int) or account ID Guid.
   * @param customTabId 
   * @param CustomTabsApi.UpdateOptions Options for modifying the method behavior.
   * @return TabMetadata
   */
  public TabMetadata update(String accountId, String customTabId, TabMetadata tabMetadata) throws ApiException {
  
    Object postBody = tabMetadata;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling update");
     }
     
     // verify the required parameter 'customTabId' is set
     if (customTabId == null) {
        throw new ApiException(400, "Missing the required parameter 'customTabId' when calling update");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/tab_definitions/{customTabId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customTabId" + "\\}", apiClient.escapeString(customTabId.toString()));

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

    
    GenericType<TabMetadata> returnType = new GenericType<TabMetadata>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes custom tab information.
   * Deletes the custom from the specified account.
   * @param accountId The external account number (int) or account ID Guid.
   * @param customTabId 
   * @param CustomTabsApi.DeleteOptions Options for modifying the method behavior.
   * @return void
   */
  public void delete(String accountId, String customTabId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling delete");
     }
     
     // verify the required parameter 'customTabId' is set
     if (customTabId == null) {
        throw new ApiException(400, "Missing the required parameter 'customTabId' when calling delete");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/tab_definitions/{customTabId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customTabId" + "\\}", apiClient.escapeString(customTabId.toString()));

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
  
}
