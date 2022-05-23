package com.docusign.esign.api;

import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;
import com.docusign.esign.model.*;
import javax.ws.rs.core.GenericType;

/** FoldersApi class. */
public class FoldersApi {
  private ApiClient apiClient;

  /** FoldersApi. */
  public FoldersApi() {
    this(Configuration.getDefaultApiClient());
  }

  /** FoldersApi. */
  public FoldersApi(ApiClient apiClient) {
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

  /// <summary>
  /// Gets a list of the folders for the account. Retrieves a list of the folders for the account,
  // including the folder hierarchy. You can specify whether to return just the template folder or
  // template folder and normal folders by setting the &#x60;template&#x60; query string parameter.
  /// </summary>

  /** CallListOptions Class. */
  public class CallListOptions {
    private String include = null;
    private String includeItems = null;
    private String startPosition = null;
    private String template = null;
    private String userFilter = null;

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

    /** setIncludeItems method. */
    public void setIncludeItems(String includeItems) {
      this.includeItems = includeItems;
    }

    /**
     * getIncludeItems method.
     *
     * @return String
     */
    public String getIncludeItems() {
      return this.includeItems;
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

    /** setTemplate method. */
    public void setTemplate(String template) {
      this.template = template;
    }

    /**
     * getTemplate method.
     *
     * @return String
     */
    public String getTemplate() {
      return this.template;
    }

    /** setUserFilter method. */
    public void setUserFilter(String userFilter) {
      this.userFilter = userFilter;
    }

    /**
     * getUserFilter method.
     *
     * @return String
     */
    public String getUserFilter() {
      return this.userFilter;
    }
  }

  /**
   * Gets a list of the folders for the account.. Retrieves a list of the folders for the account,
   * including the folder hierarchy. You can specify whether to return just the template folder or
   * template folder and normal folders by setting the &#x60;template&#x60; query string parameter.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return FoldersResponse
   */
  public FoldersResponse callList(String accountId) throws ApiException {
    return callList(accountId, null);
  }

  /**
   * Gets a list of the folders for the account.. Retrieves a list of the folders for the account,
   * including the folder hierarchy. You can specify whether to return just the template folder or
   * template folder and normal folders by setting the &#x60;template&#x60; query string parameter.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return FoldersResponse
   * @throws ApiException if fails to make API call
   */
  public FoldersResponse callList(String accountId, FoldersApi.CallListOptions options)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling callList");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/folders"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_items", options.includeItems));
    }
    if (options != null) {
      localVarQueryParams.addAll(
          apiClient.parameterToPair("start_position", options.startPosition));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("template", options.template));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_filter", options.userFilter));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<FoldersResponse> localVarReturnType = new GenericType<FoldersResponse>() {};
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
  /// Gets a list of the envelopes in the specified folder. Retrieves a list of the envelopes in the
  // specified folder. You can narrow the query by specifying search criteria in the query string
  // parameters.
  /// </summary>

  /** ListItemsOptions Class. */
  public class ListItemsOptions {
    private String fromDate = null;
    private String includeItems = null;
    private String ownerEmail = null;
    private String ownerName = null;
    private String searchText = null;
    private String startPosition = null;
    private String status = null;
    private String toDate = null;

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

    /** setIncludeItems method. */
    public void setIncludeItems(String includeItems) {
      this.includeItems = includeItems;
    }

    /**
     * getIncludeItems method.
     *
     * @return String
     */
    public String getIncludeItems() {
      return this.includeItems;
    }

    /** setOwnerEmail method. */
    public void setOwnerEmail(String ownerEmail) {
      this.ownerEmail = ownerEmail;
    }

    /**
     * getOwnerEmail method.
     *
     * @return String
     */
    public String getOwnerEmail() {
      return this.ownerEmail;
    }

    /** setOwnerName method. */
    public void setOwnerName(String ownerName) {
      this.ownerName = ownerName;
    }

    /**
     * getOwnerName method.
     *
     * @return String
     */
    public String getOwnerName() {
      return this.ownerName;
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
  }

  /**
   * Gets a list of the envelopes in the specified folder.. Retrieves a list of the envelopes in the
   * specified folder. You can narrow the query by specifying search criteria in the query string
   * parameters.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @return FolderItemsResponse
   */
  public FolderItemsResponse listItems(String accountId, String folderId) throws ApiException {
    return listItems(accountId, folderId, null);
  }

  /**
   * Gets a list of the envelopes in the specified folder.. Retrieves a list of the envelopes in the
   * specified folder. You can narrow the query by specifying search criteria in the query string
   * parameters.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param options for modifying the method behavior.
   * @return FolderItemsResponse
   * @throws ApiException if fails to make API call
   */
  public FolderItemsResponse listItems(
      String accountId, String folderId, FoldersApi.ListItemsOptions options) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling listItems");
    }

    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'folderId' when calling listItems");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/folders/{folderId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_items", options.includeItems));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("owner_email", options.ownerEmail));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("owner_name", options.ownerName));
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

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<FolderItemsResponse> localVarReturnType = new GenericType<FolderItemsResponse>() {};
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
   * Moves an envelope from its current folder to the specified folder.. Moves envelopes to the
   * specified folder.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param folderId The ID of the folder being accessed. (required)
   * @param foldersRequest (optional)
   * @return FoldersResponse
   * @throws ApiException if fails to make API call
   */
  public FoldersResponse moveEnvelopes(
      String accountId, String folderId, FoldersRequest foldersRequest) throws ApiException {
    Object localVarPostBody = foldersRequest;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling moveEnvelopes");
    }

    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'folderId' when calling moveEnvelopes");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/folders/{folderId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

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

    GenericType<FoldersResponse> localVarReturnType = new GenericType<FoldersResponse>() {};
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
  /// <summary>
  /// Gets a list of envelopes in folders matching the specified criteria. Retrieves a list of
  // envelopes that match the criteria specified in the query.  If the user ID of the user making
  // the call is the same as the user ID for any returned recipient, then the userId property is
  // added to the returned information for those recipients.
  /// </summary>

  /** SearchOptions Class. */
  public class SearchOptions {
    private String all = null;
    private String count = null;
    private String fromDate = null;
    private String includeRecipients = null;
    private String order = null;
    private String orderBy = null;
    private String startPosition = null;
    private String toDate = null;

    /** setAll method. */
    public void setAll(String all) {
      this.all = all;
    }

    /**
     * getAll method.
     *
     * @return String
     */
    public String getAll() {
      return this.all;
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

    /** setIncludeRecipients method. */
    public void setIncludeRecipients(String includeRecipients) {
      this.includeRecipients = includeRecipients;
    }

    /**
     * getIncludeRecipients method.
     *
     * @return String
     */
    public String getIncludeRecipients() {
      return this.includeRecipients;
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
  }

  /**
   * Gets a list of envelopes in folders matching the specified criteria.. Retrieves a list of
   * envelopes that match the criteria specified in the query. If the user ID of the user making the
   * call is the same as the user ID for any returned recipient, then the userId property is added
   * to the returned information for those recipients.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param searchFolderId Specifies the envelope group that is searched by the request. These are
   *     logical groupings, not actual folder names. Valid values are: drafts,
   *     awaiting_my_signature, completed, out_for_signature. (required)
   * @return FolderItemResponse
   */
  public FolderItemResponse search(String accountId, String searchFolderId) throws ApiException {
    return search(accountId, searchFolderId, null);
  }

  /**
   * Gets a list of envelopes in folders matching the specified criteria.. Retrieves a list of
   * envelopes that match the criteria specified in the query. If the user ID of the user making the
   * call is the same as the user ID for any returned recipient, then the userId property is added
   * to the returned information for those recipients.
   *
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param searchFolderId Specifies the envelope group that is searched by the request. These are
   *     logical groupings, not actual folder names. Valid values are: drafts,
   *     awaiting_my_signature, completed, out_for_signature. (required)
   * @param options for modifying the method behavior.
   * @return FolderItemResponse
   * @throws ApiException if fails to make API call
   */
  public FolderItemResponse search(
      String accountId, String searchFolderId, FoldersApi.SearchOptions options)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling search");
    }

    // verify the required parameter 'searchFolderId' is set
    if (searchFolderId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'searchFolderId' when calling search");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/accounts/{accountId}/search_folders/{searchFolderId}"
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
            .replaceAll(
                "\\{" + "searchFolderId" + "\\}",
                apiClient.escapeString(searchFolderId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("all", options.all));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }
    if (options != null) {
      localVarQueryParams.addAll(
          apiClient.parameterToPair("include_recipients", options.includeRecipients));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order", options.order));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order_by", options.orderBy));
    }
    if (options != null) {
      localVarQueryParams.addAll(
          apiClient.parameterToPair("start_position", options.startPosition));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<FolderItemResponse> localVarReturnType = new GenericType<FolderItemResponse>() {};
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
}
