
package com.docusign.esign.api;

import javax.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;




/**
 * CustomTabsApi class.
 *
 **/
public class CustomTabsApi {
  private ApiClient apiClient;

 /**
  * CustomTabsApi.
  *
  **/
  public CustomTabsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * CustomTabsApi.
  *
  **/
  public CustomTabsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

 /**
  * getApiClient Method.
  *
  * @return ApiClient
  **/
  public ApiClient getApiClient() {
    return apiClient;
  }

 /**
  * setApiClient Method.
  *
  **/
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /// <summary>
  /// Gets a list of all account tabs. Retrieves a list of all tabs associated with the account.
  /// </summary>

 /**
  * CallListOptions Class.
  *
  **/
  public class CallListOptions
  {
  private String customTabOnly = null;
  
 /**
  * setCustomTabOnly method.
  */
  public void setCustomTabOnly(String customTabOnly) {
    this.customTabOnly = customTabOnly;
  }

 /**
  * getCustomTabOnly method.
  *
  * @return String
  */
  public String getCustomTabOnly() {
    return this.customTabOnly;
  }
  }

   /**
   * Gets a list of all account tabs..
   * Retrieves a list of all tabs associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return TabMetadataList
   */ 
  public TabMetadataList callList(String accountId) throws ApiException {
    return callList(accountId, null);
  }

  /**
   * Gets a list of all account tabs..
   * Retrieves a list of all tabs associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return TabMetadataList
   * @throws ApiException if fails to make API call
   */
  public TabMetadataList callList(String accountId, CustomTabsApi.CallListOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling callList");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/tab_definitions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("custom_tab_only", options.customTabOnly));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<TabMetadataList> localVarReturnType = new GenericType<TabMetadataList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Creates a custom tab..
   * Creates a tab with pre-defined properties, such as a text tab with a certain font type and validation pattern. Users can access the custom tabs when sending documents through the DocuSign web application.  Custom tabs can be created for approve, checkbox, company, date, date signed, decline, email, email address, envelope ID, first name, formula, full name, initial here, last name, list, note, number, radio, sign here, signer attachment, SSN, text, title, and zip tabs.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param tabMetadata  (optional)
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
    String localVarPath = "/v2/accounts/{accountId}/tab_definitions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<TabMetadata> localVarReturnType = new GenericType<TabMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes custom tab information..
   * Deletes the custom from the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customTabId  (required)
   * @throws ApiException if fails to make API call
   */
  public void delete(String accountId, String customTabId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling delete");
    }
    
    // verify the required parameter 'customTabId' is set
    if (customTabId == null) {
      throw new ApiException(400, "Missing the required parameter 'customTabId' when calling delete");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/tab_definitions/{customTabId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customTabId" + "\\}", apiClient.escapeString(customTabId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Gets custom tab information..
   * Retrieves information about the requested custom tab on the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customTabId  (required)
   * @return TabMetadata
   * @throws ApiException if fails to make API call
   */
  public TabMetadata get(String accountId, String customTabId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling get");
    }
    
    // verify the required parameter 'customTabId' is set
    if (customTabId == null) {
      throw new ApiException(400, "Missing the required parameter 'customTabId' when calling get");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/tab_definitions/{customTabId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customTabId" + "\\}", apiClient.escapeString(customTabId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<TabMetadata> localVarReturnType = new GenericType<TabMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates custom tab information.  .
   * Updates the information in a custom tab for the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customTabId  (required)
   * @param tabMetadata  (optional)
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
    String localVarPath = "/v2/accounts/{accountId}/tab_definitions/{customTabId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customTabId" + "\\}", apiClient.escapeString(customTabId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<TabMetadata> localVarReturnType = new GenericType<TabMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
