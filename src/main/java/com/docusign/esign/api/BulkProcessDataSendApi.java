
package com.docusign.esign.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * BulkProcessDataSendApi class.
 *
 **/
public class BulkProcessDataSendApi {
  private ApiClient apiClient;

 /**
  * BulkProcessDataSendApi.
  *
  **/
  public BulkProcessDataSendApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * BulkProcessDataSendApi.
  *
  **/
  public BulkProcessDataSendApi(ApiClient apiClient) {
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
   * Uses the specified bulk envelopes list to update the envelopes specified in the payload.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction  (required)
   * @param bulkProcessListId  (required)
   * @param bulkProcessRequest  (optional)
   * @return BulkProcessResponse
   * @throws ApiException if fails to make API call
   */
  public BulkProcessResponse createBulkProcessRequestToQueue(String accountId, String processAction, String bulkProcessListId, BulkProcessRequest bulkProcessRequest) throws ApiException {
    ApiResponse<BulkProcessResponse> localVarResponse = createBulkProcessRequestToQueueWithHttpInfo(accountId, processAction, bulkProcessListId, bulkProcessRequest);
    return localVarResponse.getData();
  }

  /**
   * Uses the specified bulk envelopes list to update the envelopes specified in the payload
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction  (required)
   * @param bulkProcessListId  (required)
   * @param bulkProcessRequest  (optional)
   * @return BulkProcessResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BulkProcessResponse > createBulkProcessRequestToQueueWithHttpInfo(String accountId, String processAction, String bulkProcessListId, BulkProcessRequest bulkProcessRequest) throws ApiException {
    Object localVarPostBody = bulkProcessRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createBulkProcessRequestToQueue");
    }
    
    // verify the required parameter 'processAction' is set
    if (processAction == null) {
      throw new ApiException(400, "Missing the required parameter 'processAction' when calling createBulkProcessRequestToQueue");
    }
    
    // verify the required parameter 'bulkProcessListId' is set
    if (bulkProcessListId == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkProcessListId' when calling createBulkProcessRequestToQueue");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_process_data/actions/{processAction}/{bulkProcessListId}/send"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "processAction" + "\\}", apiClient.escapeString(processAction.toString()))
      .replaceAll("\\{" + "bulkProcessListId" + "\\}", apiClient.escapeString(bulkProcessListId.toString()));

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
    
    GenericType<BulkProcessResponse> localVarReturnType = new GenericType<BulkProcessResponse>() {};
    BulkProcessResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<BulkProcessResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes a specific bulk process list.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction  (required)
   * @param bulkProcessListId  (required)
   * @return BulkProcessResult
   * @throws ApiException if fails to make API call
   */
  public BulkProcessResult deleteBulkProcessList(String accountId, String processAction, String bulkProcessListId) throws ApiException {
    ApiResponse<BulkProcessResult> localVarResponse = deleteBulkProcessListWithHttpInfo(accountId, processAction, bulkProcessListId);
    return localVarResponse.getData();
  }

  /**
   * Deletes a specific bulk process list
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction  (required)
   * @param bulkProcessListId  (required)
   * @return BulkProcessResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BulkProcessResult > deleteBulkProcessListWithHttpInfo(String accountId, String processAction, String bulkProcessListId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBulkProcessList");
    }
    
    // verify the required parameter 'processAction' is set
    if (processAction == null) {
      throw new ApiException(400, "Missing the required parameter 'processAction' when calling deleteBulkProcessList");
    }
    
    // verify the required parameter 'bulkProcessListId' is set
    if (bulkProcessListId == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkProcessListId' when calling deleteBulkProcessList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_process_data/actions/{processAction}/{bulkProcessListId}/send"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "processAction" + "\\}", apiClient.escapeString(processAction.toString()))
      .replaceAll("\\{" + "bulkProcessListId" + "\\}", apiClient.escapeString(bulkProcessListId.toString()));

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
    
    GenericType<BulkProcessResult> localVarReturnType = new GenericType<BulkProcessResult>() {};
    BulkProcessResult localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<BulkProcessResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets a specific bulk process list.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction  (required)
   * @param bulkProcessListId  (required)
   * @throws ApiException if fails to make API call
   */
  public void getBulkProcessList(String accountId, String processAction, String bulkProcessListId) throws ApiException {
    getBulkProcessListWithHttpInfo(accountId, processAction, bulkProcessListId);
  }

  /**
   * Gets a specific bulk process list
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction  (required)
   * @param bulkProcessListId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getBulkProcessListWithHttpInfo(String accountId, String processAction, String bulkProcessListId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBulkProcessList");
    }
    
    // verify the required parameter 'processAction' is set
    if (processAction == null) {
      throw new ApiException(400, "Missing the required parameter 'processAction' when calling getBulkProcessList");
    }
    
    // verify the required parameter 'bulkProcessListId' is set
    if (bulkProcessListId == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkProcessListId' when calling getBulkProcessList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_process_data/actions/{processAction}/{bulkProcessListId}/send"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "processAction" + "\\}", apiClient.escapeString(processAction.toString()))
      .replaceAll("\\{" + "bulkProcessListId" + "\\}", apiClient.escapeString(bulkProcessListId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Updates a specific bulk process list.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction  (required)
   * @param bulkProcessListId  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBulkProcessList(String accountId, String processAction, String bulkProcessListId) throws ApiException {
    updateBulkProcessListWithHttpInfo(accountId, processAction, bulkProcessListId);
  }

  /**
   * Updates a specific bulk process list
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction  (required)
   * @param bulkProcessListId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> updateBulkProcessListWithHttpInfo(String accountId, String processAction, String bulkProcessListId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBulkProcessList");
    }
    
    // verify the required parameter 'processAction' is set
    if (processAction == null) {
      throw new ApiException(400, "Missing the required parameter 'processAction' when calling updateBulkProcessList");
    }
    
    // verify the required parameter 'bulkProcessListId' is set
    if (bulkProcessListId == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkProcessListId' when calling updateBulkProcessList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_process_data/actions/{processAction}/{bulkProcessListId}/send"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "processAction" + "\\}", apiClient.escapeString(processAction.toString()))
      .replaceAll("\\{" + "bulkProcessListId" + "\\}", apiClient.escapeString(bulkProcessListId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }
}
