package com.docusign.esign.api;

import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;
import com.docusign.esign.model.*;
import javax.ws.rs.core.GenericType;

/** BulkEnvelopesApi class. */
public class BulkEnvelopesApi {
  private ApiClient apiClient;

  /** BulkEnvelopesApi. */
  public BulkEnvelopesApi() {
    this(Configuration.getDefaultApiClient());
  }

  /** BulkEnvelopesApi. */
  public BulkEnvelopesApi(ApiClient apiClient) {
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
   * Creates a new bulk send list.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendingList (optional)
   * @return BulkSendingList
   * @throws ApiException if fails to make API call
   */
  public BulkSendingList createBulkSendList(String accountId, BulkSendingList bulkSendingList)
      throws ApiException {
    Object localVarPostBody = bulkSendingList;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling createBulkSendList");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_lists"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    GenericType<BulkSendingList> localVarReturnType = new GenericType<BulkSendingList>() {};
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
   * Uses the specified bulk send list to send the envelope specified in the payload.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendListId (required)
   * @param bulkSendRequest (optional)
   * @return BulkSendResponse
   * @throws ApiException if fails to make API call
   */
  public BulkSendResponse createBulkSendRequest(
      String accountId, String bulkSendListId, BulkSendRequest bulkSendRequest)
      throws ApiException {
    Object localVarPostBody = bulkSendRequest;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling createBulkSendRequest");
    }

    // verify the required parameter 'bulkSendListId' is set
    if (bulkSendListId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'bulkSendListId' when calling createBulkSendRequest");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_lists/{bulkSendListId}/send"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "bulkSendListId" + "\\}",
                apiClient.escapeString(bulkSendListId.toString()));

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

    GenericType<BulkSendResponse> localVarReturnType = new GenericType<BulkSendResponse>() {};
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
   * Tests whether the specified bulk sending list can be used to send an envelope.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendListId (required)
   * @param bulkSendRequest (optional)
   * @return BulkSendTestResponse
   * @throws ApiException if fails to make API call
   */
  public BulkSendTestResponse createBulkSendTestRequest(
      String accountId, String bulkSendListId, BulkSendRequest bulkSendRequest)
      throws ApiException {
    Object localVarPostBody = bulkSendRequest;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling createBulkSendTestRequest");
    }

    // verify the required parameter 'bulkSendListId' is set
    if (bulkSendListId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'bulkSendListId' when calling createBulkSendTestRequest");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_lists/{bulkSendListId}/test"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "bulkSendListId" + "\\}",
                apiClient.escapeString(bulkSendListId.toString()));

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

    GenericType<BulkSendTestResponse> localVarReturnType =
        new GenericType<BulkSendTestResponse>() {};
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
   * Deletes an existing bulk send list.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendListId (required)
   * @return BulkSendingListSummaries
   * @throws ApiException if fails to make API call
   */
  public BulkSendingListSummaries deleteBulkSendList(String accountId, String bulkSendListId)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling deleteBulkSendList");
    }

    // verify the required parameter 'bulkSendListId' is set
    if (bulkSendListId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'bulkSendListId' when calling deleteBulkSendList");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_lists/{bulkSendListId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "bulkSendListId" + "\\}",
                apiClient.escapeString(bulkSendListId.toString()));

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

    GenericType<BulkSendingListSummaries> localVarReturnType =
        new GenericType<BulkSendingListSummaries>() {};
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
  /// <summary>
  /// Gets envelopes from a specific bulk send batch
  /// </summary>

  /** GetBulkSendBatchEnvelopesOptions Class. */
  public class GetBulkSendBatchEnvelopesOptions {
    private String count = null;
    private String include = null;
    private String order = null;
    private String orderBy = null;
    private String searchText = null;
    private String startPosition = null;
    private String status = null;

    /** setCount method. */
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

    /** setInclude method. */
    public void setInclude(String include) {
      this.include = include;
    }

    /**
     * getInclude method.
     *
     * @return String
     */
    public String getInclude() {
      return this.include;
    }

    /** setOrder method. */
    public void setOrder(String order) {
      this.order = order;
    }

    /**
     * getOrder method.
     *
     * @return String
     */
    public String getOrder() {
      return this.order;
    }

    /** setOrderBy method. */
    public void setOrderBy(String orderBy) {
      this.orderBy = orderBy;
    }

    /**
     * getOrderBy method.
     *
     * @return String
     */
    public String getOrderBy() {
      return this.orderBy;
    }

    /** setSearchText method. */
    public void setSearchText(String searchText) {
      this.searchText = searchText;
    }

    /**
     * getSearchText method.
     *
     * @return String
     */
    public String getSearchText() {
      return this.searchText;
    }

    /** setStartPosition method. */
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

    /** setStatus method. */
    public void setStatus(String status) {
      this.status = status;
    }

    /**
     * getStatus method.
     *
     * @return String
     */
    public String getStatus() {
      return this.status;
    }
  }

  /**
   * Gets envelopes from a specific bulk send batch.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendBatchId (required)
   * @return EnvelopesInformation
   */
  public EnvelopesInformation getBulkSendBatchEnvelopes(String accountId, String bulkSendBatchId)
      throws ApiException {
    return getBulkSendBatchEnvelopes(accountId, bulkSendBatchId, null);
  }

  /**
   * Gets envelopes from a specific bulk send batch.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendBatchId (required)
   * @param options for modifying the method behavior.
   * @return EnvelopesInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopesInformation getBulkSendBatchEnvelopes(
      String accountId,
      String bulkSendBatchId,
      BulkEnvelopesApi.GetBulkSendBatchEnvelopesOptions options)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getBulkSendBatchEnvelopes");
    }

    // verify the required parameter 'bulkSendBatchId' is set
    if (bulkSendBatchId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'bulkSendBatchId' when calling getBulkSendBatchEnvelopes");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_batch/{bulkSendBatchId}/envelopes"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "bulkSendBatchId" + "\\}",
                apiClient.escapeString(bulkSendBatchId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order", options.order));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order_by", options.orderBy));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_text", options.searchText));
    }
    if (options != null) {
      localVarQueryParams.addAll(
          apiClient.parameterToPair("start_position", options.startPosition));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<EnvelopesInformation> localVarReturnType =
        new GenericType<EnvelopesInformation>() {};
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
   * Gets a specific bulk send batch status.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendBatchId (required)
   * @return BulkSendBatchStatus
   * @throws ApiException if fails to make API call
   */
  public BulkSendBatchStatus getBulkSendBatchStatus(String accountId, String bulkSendBatchId)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getBulkSendBatchStatus");
    }

    // verify the required parameter 'bulkSendBatchId' is set
    if (bulkSendBatchId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'bulkSendBatchId' when calling getBulkSendBatchStatus");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_batch/{bulkSendBatchId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "bulkSendBatchId" + "\\}",
                apiClient.escapeString(bulkSendBatchId.toString()));

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

    GenericType<BulkSendBatchStatus> localVarReturnType = new GenericType<BulkSendBatchStatus>() {};
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
  /// <summary>
  /// Returns a list of bulk send batch satuses initiated by account.
  /// </summary>

  /** GetBulkSendBatchesOptions Class. */
  public class GetBulkSendBatchesOptions {
    private String batchIds = null;
    private String count = null;
    private String fromDate = null;
    private String searchText = null;
    private String startPosition = null;
    private String status = null;
    private String toDate = null;
    private String userId = null;

    /** setBatchIds method. */
    public void setBatchIds(String batchIds) {
      this.batchIds = batchIds;
    }

    /**
     * getBatchIds method.
     *
     * @return String
     */
    public String getBatchIds() {
      return this.batchIds;
    }

    /** setCount method. */
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

    /** setFromDate method. */
    public void setFromDate(String fromDate) {
      this.fromDate = fromDate;
    }

    /**
     * getFromDate method.
     *
     * @return String
     */
    public String getFromDate() {
      return this.fromDate;
    }

    /** setSearchText method. */
    public void setSearchText(String searchText) {
      this.searchText = searchText;
    }

    /**
     * getSearchText method.
     *
     * @return String
     */
    public String getSearchText() {
      return this.searchText;
    }

    /** setStartPosition method. */
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

    /** setStatus method. */
    public void setStatus(String status) {
      this.status = status;
    }

    /**
     * getStatus method.
     *
     * @return String
     */
    public String getStatus() {
      return this.status;
    }

    /** setToDate method. */
    public void setToDate(String toDate) {
      this.toDate = toDate;
    }

    /**
     * getToDate method.
     *
     * @return String
     */
    public String getToDate() {
      return this.toDate;
    }

    /** setUserId method. */
    public void setUserId(String userId) {
      this.userId = userId;
    }

    /**
     * getUserId method.
     *
     * @return String
     */
    public String getUserId() {
      return this.userId;
    }
  }

  /**
   * Returns a list of bulk send batch satuses initiated by account..
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries getBulkSendBatches(String accountId) throws ApiException {
    return getBulkSendBatches(accountId, null);
  }

  /**
   * Returns a list of bulk send batch satuses initiated by account..
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BulkSendBatchSummaries
   * @throws ApiException if fails to make API call
   */
  public BulkSendBatchSummaries getBulkSendBatches(
      String accountId, BulkEnvelopesApi.GetBulkSendBatchesOptions options) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getBulkSendBatches");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_batch"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("batch_ids", options.batchIds));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_text", options.searchText));
    }
    if (options != null) {
      localVarQueryParams.addAll(
          apiClient.parameterToPair("start_position", options.startPosition));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_id", options.userId));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<BulkSendBatchSummaries> localVarReturnType =
        new GenericType<BulkSendBatchSummaries>() {};
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
   * Gets a specific bulk send list.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendListId (required)
   * @return BulkSendingList
   * @throws ApiException if fails to make API call
   */
  public BulkSendingList getBulkSendList(String accountId, String bulkSendListId)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getBulkSendList");
    }

    // verify the required parameter 'bulkSendListId' is set
    if (bulkSendListId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'bulkSendListId' when calling getBulkSendList");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_lists/{bulkSendListId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "bulkSendListId" + "\\}",
                apiClient.escapeString(bulkSendListId.toString()));

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

    GenericType<BulkSendingList> localVarReturnType = new GenericType<BulkSendingList>() {};
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
   * Lists top-level details for all bulk send lists visible to the current user.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BulkSendingListSummaries
   * @throws ApiException if fails to make API call
   */
  public BulkSendingListSummaries getBulkSendLists(String accountId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling getBulkSendLists");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_lists"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    GenericType<BulkSendingListSummaries> localVarReturnType =
        new GenericType<BulkSendingListSummaries>() {};
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
   * Initiate a specific bulk send batch action.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendBatchId (required)
   * @param bulkAction (required)
   * @param bulkSendBatchActionRequest (optional)
   * @return BulkSendBatchStatus
   * @throws ApiException if fails to make API call
   */
  public BulkSendBatchStatus updateBulkSendBatchAction(
      String accountId,
      String bulkSendBatchId,
      String bulkAction,
      BulkSendBatchActionRequest bulkSendBatchActionRequest)
      throws ApiException {
    Object localVarPostBody = bulkSendBatchActionRequest;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling updateBulkSendBatchAction");
    }

    // verify the required parameter 'bulkSendBatchId' is set
    if (bulkSendBatchId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'bulkSendBatchId' when calling updateBulkSendBatchAction");
    }

    // verify the required parameter 'bulkAction' is set
    if (bulkAction == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'bulkAction' when calling updateBulkSendBatchAction");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_batch/{bulkSendBatchId}/{bulkAction}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "bulkSendBatchId" + "\\}",
                apiClient.escapeString(bulkSendBatchId.toString()))
            .replaceAll(
                "\\{" + "bulkAction" + "\\}", apiClient.escapeString(bulkAction.toString()));

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

    GenericType<BulkSendBatchStatus> localVarReturnType = new GenericType<BulkSendBatchStatus>() {};
    return apiClient.invokeAPI(
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
        localVarReturnType);
  }

  /**
   * Put/Update a specific bulk send batch status.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendBatchId (required)
   * @param bulkSendBatchRequest (optional)
   * @return BulkSendBatchStatus
   * @throws ApiException if fails to make API call
   */
  public BulkSendBatchStatus updateBulkSendBatchStatus(
      String accountId, String bulkSendBatchId, BulkSendBatchRequest bulkSendBatchRequest)
      throws ApiException {
    Object localVarPostBody = bulkSendBatchRequest;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling updateBulkSendBatchStatus");
    }

    // verify the required parameter 'bulkSendBatchId' is set
    if (bulkSendBatchId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'bulkSendBatchId' when calling updateBulkSendBatchStatus");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_batch/{bulkSendBatchId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "bulkSendBatchId" + "\\}",
                apiClient.escapeString(bulkSendBatchId.toString()));

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

    GenericType<BulkSendBatchStatus> localVarReturnType = new GenericType<BulkSendBatchStatus>() {};
    return apiClient.invokeAPI(
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
        localVarReturnType);
  }

  /**
   * Updates an existing bulk send list. If send_envelope query string value is provided, will
   * accept an empty payload and try to send the specified envelope.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendListId (required)
   * @param bulkSendingList (optional)
   * @return BulkSendingList
   * @throws ApiException if fails to make API call
   */
  public BulkSendingList updateBulkSendList(
      String accountId, String bulkSendListId, BulkSendingList bulkSendingList)
      throws ApiException {
    Object localVarPostBody = bulkSendingList;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling updateBulkSendList");
    }

    // verify the required parameter 'bulkSendListId' is set
    if (bulkSendListId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'bulkSendListId' when calling updateBulkSendList");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/bulk_send_lists/{bulkSendListId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "bulkSendListId" + "\\}",
                apiClient.escapeString(bulkSendListId.toString()));

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

    GenericType<BulkSendingList> localVarReturnType = new GenericType<BulkSendingList>() {};
    return apiClient.invokeAPI(
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
        localVarReturnType);
  }
}
