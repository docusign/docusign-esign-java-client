package com.docusign.esign.api;

import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;
import com.docusign.esign.model.*;
import javax.ws.rs.core.GenericType;

/** BulkProcessDataApi class. */
public class BulkProcessDataApi {
  private ApiClient apiClient;

  /** BulkProcessDataApi. */
  public BulkProcessDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  /** BulkProcessDataApi. */
  public BulkProcessDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getApiClient Method.
   *
   * @return ApiClient
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /** setApiClient Method. */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Uses the specified bulk envelopes list to update the envelopes specified in the payload.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction (required)
   * @throws ApiException if fails to make API call
   */
  public void createBulkProcessRequest(String accountId, String processAction) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling createBulkProcessRequest");
    }

    // verify the required parameter 'processAction' is set
    if (processAction == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'processAction' when calling createBulkProcessRequest");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_process_data/actions/{processAction}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "processAction" + "\\}", apiClient.escapeString(processAction.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }

  /**
   * Uses the specified bulk envelopes list to update the envelopes specified in the payload.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction (required)
   * @param bulkProcessListId (required)
   * @param bulkProcessRequest (optional)
   * @return BulkProcessResponse
   * @throws ApiException if fails to make API call
   */
  public BulkProcessResponse createBulkProcessRequestToQueue(
      String accountId,
      String processAction,
      String bulkProcessListId,
      BulkProcessRequest bulkProcessRequest)
      throws ApiException {
    Object localVarPostBody = bulkProcessRequest;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling createBulkProcessRequestToQueue");
    }

    // verify the required parameter 'processAction' is set
    if (processAction == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'processAction' when calling createBulkProcessRequestToQueue");
    }

    // verify the required parameter 'bulkProcessListId' is set
    if (bulkProcessListId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'bulkProcessListId' when calling createBulkProcessRequestToQueue");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_process_data/actions/{processAction}/{bulkProcessListId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "processAction" + "\\}", apiClient.escapeString(processAction.toString()))
            .replaceAll(
                "\\{" + "bulkProcessListId" + "\\}",
                apiClient.escapeString(bulkProcessListId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<BulkProcessResponse> localVarReturnType = new GenericType<BulkProcessResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Deletes a specific bulk process list.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction (required)
   * @param bulkProcessListId (required)
   * @return BulkProcessResult
   * @throws ApiException if fails to make API call
   */
  public BulkProcessResult deleteBulkProcessList(
      String accountId, String processAction, String bulkProcessListId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling deleteBulkProcessList");
    }

    // verify the required parameter 'processAction' is set
    if (processAction == null) {
      throw new ApiException(
          400, "Missing the required parameter 'processAction' when calling deleteBulkProcessList");
    }

    // verify the required parameter 'bulkProcessListId' is set
    if (bulkProcessListId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'bulkProcessListId' when calling deleteBulkProcessList");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_process_data/actions/{processAction}/{bulkProcessListId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "processAction" + "\\}", apiClient.escapeString(processAction.toString()))
            .replaceAll(
                "\\{" + "bulkProcessListId" + "\\}",
                apiClient.escapeString(bulkProcessListId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<BulkProcessResult> localVarReturnType = new GenericType<BulkProcessResult>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Deletes a specific bulk process list.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction (required)
   * @param bulkProcessingLists (optional)
   * @return BulkProcessResult
   * @throws ApiException if fails to make API call
   */
  public BulkProcessResult deleteBulkProcessLists(
      String accountId, String processAction, BulkProcessingLists bulkProcessingLists)
      throws ApiException {
    Object localVarPostBody = bulkProcessingLists;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling deleteBulkProcessLists");
    }

    // verify the required parameter 'processAction' is set
    if (processAction == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'processAction' when calling deleteBulkProcessLists");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_process_data/actions/{processAction}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "processAction" + "\\}", apiClient.escapeString(processAction.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<BulkProcessResult> localVarReturnType = new GenericType<BulkProcessResult>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Gets a specific bulk process list.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction (required)
   * @param bulkProcessListId (required)
   * @throws ApiException if fails to make API call
   */
  public void getBulkProcessList(String accountId, String processAction, String bulkProcessListId)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getBulkProcessList");
    }

    // verify the required parameter 'processAction' is set
    if (processAction == null) {
      throw new ApiException(
          400, "Missing the required parameter 'processAction' when calling getBulkProcessList");
    }

    // verify the required parameter 'bulkProcessListId' is set
    if (bulkProcessListId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'bulkProcessListId' when calling getBulkProcessList");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_process_data/actions/{processAction}/{bulkProcessListId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "processAction" + "\\}", apiClient.escapeString(processAction.toString()))
            .replaceAll(
                "\\{" + "bulkProcessListId" + "\\}",
                apiClient.escapeString(bulkProcessListId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }

  /**
   * Lists top-level details for all bulk process lists visible to the current user.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction (required)
   * @return BulkProcessingListSummaries
   * @throws ApiException if fails to make API call
   */
  public BulkProcessingListSummaries getBulkProcessLists(String accountId, String processAction)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getBulkProcessLists");
    }

    // verify the required parameter 'processAction' is set
    if (processAction == null) {
      throw new ApiException(
          400, "Missing the required parameter 'processAction' when calling getBulkProcessLists");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_process_data/actions/{processAction}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "processAction" + "\\}", apiClient.escapeString(processAction.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<BulkProcessingListSummaries> localVarReturnType =
        new GenericType<BulkProcessingListSummaries>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Updates a specific bulk process list.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param processAction (required)
   * @param bulkProcessListId (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBulkProcessList(
      String accountId, String processAction, String bulkProcessListId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling updateBulkProcessList");
    }

    // verify the required parameter 'processAction' is set
    if (processAction == null) {
      throw new ApiException(
          400, "Missing the required parameter 'processAction' when calling updateBulkProcessList");
    }

    // verify the required parameter 'bulkProcessListId' is set
    if (bulkProcessListId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'bulkProcessListId' when calling updateBulkProcessList");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_process_data/actions/{processAction}/{bulkProcessListId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "processAction" + "\\}", apiClient.escapeString(processAction.toString()))
            .replaceAll(
                "\\{" + "bulkProcessListId" + "\\}",
                apiClient.escapeString(bulkProcessListId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
}
