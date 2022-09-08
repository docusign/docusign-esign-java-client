
package com.docusign.esign.api;

import javax.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * EmailArchiveApi class.
 *
 **/
public class EmailArchiveApi {
  private ApiClient apiClient;

 /**
  * EmailArchiveApi.
  *
  **/
  public EmailArchiveApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * EmailArchiveApi.
  *
  **/
  public EmailArchiveApi(ApiClient apiClient) {
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


  /**
   * Creates a blind carbon copy email archive entry.
   * This method creates a BCC email archive configuration for an account (adds a BCC email address to the account for archiving the emails that DocuSign generates).  The only property that you must set in the request body is the BCC email address that you want to use.  **Note:** An account can have up to five active and pending email archive addresses combined, but you must use this method to add them to the account one at a time. Each email address is considered a separate BCC email archive configuration. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bccEmailArchive  (optional)
   * @return BccEmailArchive
   * @throws ApiException if fails to make API call
   */
  public BccEmailArchive createBCCEmailArchive(String accountId, BccEmailArchive bccEmailArchive) throws ApiException {
    ApiResponse<BccEmailArchive> localVarResponse = createBCCEmailArchiveWithHttpInfo(accountId, bccEmailArchive);
    return localVarResponse.getData();
  }

  /**
   * Creates a blind carbon copy email archive entry
   * This method creates a BCC email archive configuration for an account (adds a BCC email address to the account for archiving the emails that DocuSign generates).  The only property that you must set in the request body is the BCC email address that you want to use.  **Note:** An account can have up to five active and pending email archive addresses combined, but you must use this method to add them to the account one at a time. Each email address is considered a separate BCC email archive configuration. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bccEmailArchive  (optional)
   * @return BccEmailArchive
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BccEmailArchive > createBCCEmailArchiveWithHttpInfo(String accountId, BccEmailArchive bccEmailArchive) throws ApiException {
    Object localVarPostBody = bccEmailArchive;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createBCCEmailArchive");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/bcc_email_archives"
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
    
    GenericType<BccEmailArchive> localVarReturnType = new GenericType<BccEmailArchive>() {};
    BccEmailArchive localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<BccEmailArchive>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Delete a blind carbon copy email archive for an account..
   * This method deletes a BCC email archive configuration from an account.  When you use this method, the status of the BCC email archive configuration switches to &#x60;closed&#x60; and the BCC email address is no longer used to archive DocuSign-generated email messages. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bccEmailArchiveId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBCCEmailArchive(String accountId, String bccEmailArchiveId) throws ApiException {
    deleteBCCEmailArchiveWithHttpInfo(accountId, bccEmailArchiveId);
  }

  /**
   * Delete a blind carbon copy email archive for an account.
   * This method deletes a BCC email archive configuration from an account.  When you use this method, the status of the BCC email archive configuration switches to &#x60;closed&#x60; and the BCC email address is no longer used to archive DocuSign-generated email messages. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bccEmailArchiveId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteBCCEmailArchiveWithHttpInfo(String accountId, String bccEmailArchiveId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBCCEmailArchive");
    }
    
    // verify the required parameter 'bccEmailArchiveId' is set
    if (bccEmailArchiveId == null) {
      throw new ApiException(400, "Missing the required parameter 'bccEmailArchiveId' when calling deleteBCCEmailArchive");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/bcc_email_archives/{bccEmailArchiveId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "bccEmailArchiveId" + "\\}", apiClient.escapeString(bccEmailArchiveId.toString()));

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
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }
  /// <summary>
  /// Get the blind carbon copy email archive history entries for the specified archive This method returns a specific BCC email archive configuration for an account, as well as the history of changes to the email address.
  /// </summary>

 /**
  * GetBCCEmailArchiveHistoryListOptions Class.
  *
  **/
  public class GetBCCEmailArchiveHistoryListOptions
  {
  private String count = null;
  private String startPosition = null;
  
 /**
  * setCount method.
  */
  public void setCount(String count) {
    this.count = count;
  }

 /**
  * getCount method.
  *
  * @return String
  */
  public String getCount() {
    return this.count;
  }
  
 /**
  * setStartPosition method.
  */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

 /**
  * getStartPosition method.
  *
  * @return String
  */
  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Get the blind carbon copy email archive history entries for the specified archive.
   * This method returns a specific BCC email archive configuration for an account, as well as the history of changes to the email address.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bccEmailArchiveId  (required)
   * @return BccEmailArchiveHistoryList
   */ 
  public BccEmailArchiveHistoryList getBCCEmailArchiveHistoryList(String accountId, String bccEmailArchiveId) throws ApiException {
    return getBCCEmailArchiveHistoryList(accountId, bccEmailArchiveId, null);
  }

  /**
   * Get the blind carbon copy email archive history entries for the specified archive.
   * This method returns a specific BCC email archive configuration for an account, as well as the history of changes to the email address.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bccEmailArchiveId  (required)
   * @param options for modifying the method behavior.
   * @return BccEmailArchiveHistoryList
   * @throws ApiException if fails to make API call
   */
  public BccEmailArchiveHistoryList getBCCEmailArchiveHistoryList(String accountId, String bccEmailArchiveId, EmailArchiveApi.GetBCCEmailArchiveHistoryListOptions options) throws ApiException {
    ApiResponse<BccEmailArchiveHistoryList> localVarResponse = getBCCEmailArchiveHistoryListWithHttpInfo(accountId, bccEmailArchiveId, options);
    return localVarResponse.getData();
  }

  /**
   * Get the blind carbon copy email archive history entries for the specified archive
   * This method returns a specific BCC email archive configuration for an account, as well as the history of changes to the email address.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bccEmailArchiveId  (required)
   * @param options for modifying the method behavior.
   * @return BccEmailArchiveHistoryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BccEmailArchiveHistoryList > getBCCEmailArchiveHistoryListWithHttpInfo(String accountId, String bccEmailArchiveId, EmailArchiveApi.GetBCCEmailArchiveHistoryListOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBCCEmailArchiveHistoryList");
    }
    
    // verify the required parameter 'bccEmailArchiveId' is set
    if (bccEmailArchiveId == null) {
      throw new ApiException(400, "Missing the required parameter 'bccEmailArchiveId' when calling getBCCEmailArchiveHistoryList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/bcc_email_archives/{bccEmailArchiveId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "bccEmailArchiveId" + "\\}", apiClient.escapeString(bccEmailArchiveId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<BccEmailArchiveHistoryList> localVarReturnType = new GenericType<BccEmailArchiveHistoryList>() {};
    BccEmailArchiveHistoryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<BccEmailArchiveHistoryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Get the blind carbon copy email archive entries owned by the specified account This method retrieves all of the BCC email archive configurations associated with an account.
  /// </summary>

 /**
  * GetBCCEmailArchiveListOptions Class.
  *
  **/
  public class GetBCCEmailArchiveListOptions
  {
  private String count = null;
  private String startPosition = null;
  
 /**
  * setCount method.
  */
  public void setCount(String count) {
    this.count = count;
  }

 /**
  * getCount method.
  *
  * @return String
  */
  public String getCount() {
    return this.count;
  }
  
 /**
  * setStartPosition method.
  */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

 /**
  * getStartPosition method.
  *
  * @return String
  */
  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Get the blind carbon copy email archive entries owned by the specified account.
   * This method retrieves all of the BCC email archive configurations associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BccEmailArchiveList
   */ 
  public BccEmailArchiveList getBCCEmailArchiveList(String accountId) throws ApiException {
    return getBCCEmailArchiveList(accountId, null);
  }

  /**
   * Get the blind carbon copy email archive entries owned by the specified account.
   * This method retrieves all of the BCC email archive configurations associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BccEmailArchiveList
   * @throws ApiException if fails to make API call
   */
  public BccEmailArchiveList getBCCEmailArchiveList(String accountId, EmailArchiveApi.GetBCCEmailArchiveListOptions options) throws ApiException {
    ApiResponse<BccEmailArchiveList> localVarResponse = getBCCEmailArchiveListWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Get the blind carbon copy email archive entries owned by the specified account
   * This method retrieves all of the BCC email archive configurations associated with an account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BccEmailArchiveList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BccEmailArchiveList > getBCCEmailArchiveListWithHttpInfo(String accountId, EmailArchiveApi.GetBCCEmailArchiveListOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBCCEmailArchiveList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/bcc_email_archives"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<BccEmailArchiveList> localVarReturnType = new GenericType<BccEmailArchiveList>() {};
    BccEmailArchiveList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<BccEmailArchiveList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
