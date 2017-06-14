package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.FoldersResponse;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.FolderItemsResponse;
import com.docusign.esign.model.FoldersRequest;
import com.docusign.esign.model.FolderItemResponse;


public class FoldersApi {
  private ApiClient apiClient;

  public FoldersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FoldersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  
  /// <summary>
  /// Gets a list of the folders for the account. Retrieves a list of the folders for the account, including the folder hierarchy. You can specify whether to return just the template folder or template folder and normal folders by setting the `template` query string parameter.
  /// </summary>
  public class ListOptions
  {
	
	private String include = null;
	
	private String includeItems = null;
	
	private String startPosition = null;
	
	private String template = null;
	
	private String userFilter = null;
	
	
	/*
	 * 
	 */
	public void setInclude(String include) {
		this.include = include;
	}
	
	public String getInclude() {
		return this.include;
	}
	
	/*
	 * 
	 */
	public void setIncludeItems(String includeItems) {
		this.includeItems = includeItems;
	}
	
	public String getIncludeItems() {
		return this.includeItems;
	}
	
	/*
	 * 
	 */
	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}
	
	public String getStartPosition() {
		return this.startPosition;
	}
	
	/*
	 * Specifies the items that are returned. Valid values are: \n\n* include - The folder list will return normal folders plus template folders. \n* only - Only the list of template folders are returned. 
	 */
	public void setTemplate(String template) {
		this.template = template;
	}
	
	public String getTemplate() {
		return this.template;
	}
	
	/*
	 * 
	 */
	public void setUserFilter(String userFilter) {
		this.userFilter = userFilter;
	}
	
	public String getUserFilter() {
		return this.userFilter;
	}
	
  }

   /**
   * Gets a list of the folders for the account.
   * Retrieves a list of the folders for the account, including the folder hierarchy. You can specify whether to return just the template folder or template folder and normal folders by setting the `template` query string parameter.
   * @param accountId The external account number (int) or account ID Guid.
   * @return FoldersResponse
   */ 
  public FoldersResponse list(String accountId) throws ApiException {
    return list(accountId, null);
  }
  
  
  /**
   * Gets a list of the folders for the account.
   * Retrieves a list of the folders for the account, including the folder hierarchy. You can specify whether to return just the template folder or template folder and normal folders by setting the `template` query string parameter.
   * @param accountId The external account number (int) or account ID Guid.
   * @param FoldersApi.ListOptions Options for modifying the method behavior.
   * @return FoldersResponse
   */
  public FoldersResponse list(String accountId, FoldersApi.ListOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling list");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/folders".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_items", options.includeItems));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "template", options.template));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "user_filter", options.userFilter));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<FoldersResponse> returnType = new GenericType<FoldersResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets a list of the envelopes in the specified folder. Retrieves a list of the envelopes in the specified folder. You can narrow the query by specifying search criteria in the query string parameters.
  /// </summary>
  public class ListItemsOptions
  {
	
	private String fromDate = null;
	
	private String includeItems = null;
	
	private String ownerEmail = null;
	
	private String ownerName = null;
	
	private String searchText = null;
	
	private String startPosition = null;
	
	private String status = null;
	
	private String toDate = null;
	
	
	/*
	 * Only return items on or after this date. If no value is provided, the default search is the previous 30 days. 
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	public String getFromDate() {
		return this.fromDate;
	}
	
	/*
	 * 
	 */
	public void setIncludeItems(String includeItems) {
		this.includeItems = includeItems;
	}
	
	public String getIncludeItems() {
		return this.includeItems;
	}
	
	/*
	 * The email of the folder owner. 
	 */
	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}
	
	public String getOwnerEmail() {
		return this.ownerEmail;
	}
	
	/*
	 * The name of the folder owner. 
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	
	/*
	 * The search text used to search the items of the envelope. The search looks at recipient names and emails, envelope custom fields, sender name, and subject. 
	 */
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	
	public String getSearchText() {
		return this.searchText;
	}
	
	/*
	 * The position of the folder items to return. This is used for repeated calls, when the number of envelopes returned is too much for one return (calls return 100 envelopes at a time). The default value is 0. 
	 */
	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}
	
	public String getStartPosition() {
		return this.startPosition;
	}
	
	/*
	 * The current status of the envelope. If no value is provided, the default search is all/any status. 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	/*
	 * Only return items up to this date. If no value is provided, the default search is to the current date. 
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public String getToDate() {
		return this.toDate;
	}
	
  }

   /**
   * Gets a list of the envelopes in the specified folder.
   * Retrieves a list of the envelopes in the specified folder. You can narrow the query by specifying search criteria in the query string parameters.
   * @param accountId The external account number (int) or account ID Guid.
   * @param folderId The ID of the folder being accessed.
   * @return FolderItemsResponse
   */ 
  public FolderItemsResponse listItems(String accountId, String folderId) throws ApiException {
    return listItems(accountId, folderId, null);
  }
  
  
  /**
   * Gets a list of the envelopes in the specified folder.
   * Retrieves a list of the envelopes in the specified folder. You can narrow the query by specifying search criteria in the query string parameters.
   * @param accountId The external account number (int) or account ID Guid.
   * @param folderId The ID of the folder being accessed.
   * @param FoldersApi.ListItemsOptions Options for modifying the method behavior.
   * @return FolderItemsResponse
   */
  public FolderItemsResponse listItems(String accountId, String folderId, FoldersApi.ListItemsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listItems");
     }
     
     // verify the required parameter 'folderId' is set
     if (folderId == null) {
        throw new ApiException(400, "Missing the required parameter 'folderId' when calling listItems");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/folders/{folderId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_items", options.includeItems));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "owner_email", options.ownerEmail));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "owner_name", options.ownerName));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "search_text", options.searchText));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "status", options.status));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "to_date", options.toDate));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<FolderItemsResponse> returnType = new GenericType<FolderItemsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Moves an envelope from its current folder to the specified folder.
   * Moves envelopes to the specified folder.
   * @param accountId The external account number (int) or account ID Guid.
   * @param folderId The ID of the folder being accessed.
   * @param FoldersApi.MoveEnvelopesOptions Options for modifying the method behavior.
   * @return FoldersResponse
   */
  public FoldersResponse moveEnvelopes(String accountId, String folderId, FoldersRequest foldersRequest) throws ApiException {
  
    Object postBody = foldersRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling moveEnvelopes");
     }
     
     // verify the required parameter 'folderId' is set
     if (folderId == null) {
        throw new ApiException(400, "Missing the required parameter 'folderId' when calling moveEnvelopes");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/folders/{folderId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

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

    
    GenericType<FoldersResponse> returnType = new GenericType<FoldersResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets a list of envelopes in folders matching the specified criteria. Retrieves a list of envelopes that match the criteria specified in the query.\n\nIf the user ID of the user making the call is the same as the user ID for any returned recipient, then the userId property is added to the returned information for those recipients.
  /// </summary>
  public class SearchOptions
  {
	
	private String all = null;
	
	private String count = null;
	
	private String fromDate = null;
	
	private String includeRecipients = null;
	
	private String order = null;
	
	private String orderBy = null;
	
	private String startPosition = null;
	
	private String toDate = null;
	
	
	/*
	 * Specifies that all envelopes that match the criteria are returned. 
	 */
	public void setAll(String all) {
		this.all = all;
	}
	
	public String getAll() {
		return this.all;
	}
	
	/*
	 * Specifies the number of records returned in the cache. The number must be greater than 0 and less than or equal to 100. 
	 */
	public void setCount(String count) {
		this.count = count;
	}
	
	public String getCount() {
		return this.count;
	}
	
	/*
	 * Specifies the start of the date range to return. If no value is provided, the default search is the previous 30 days. 
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	public String getFromDate() {
		return this.fromDate;
	}
	
	/*
	 * When set to **true**, the recipient information is returned in the response. 
	 */
	public void setIncludeRecipients(String includeRecipients) {
		this.includeRecipients = includeRecipients;
	}
	
	public String getIncludeRecipients() {
		return this.includeRecipients;
	}
	
	/*
	 * Specifies the order in which the list is returned. Valid values are: `asc` for ascending order, and `desc` for descending order. 
	 */
	public void setOrder(String order) {
		this.order = order;
	}
	
	public String getOrder() {
		return this.order;
	}
	
	/*
	 * Specifies the property used to sort the list. Valid values are: `action_required`, `created`, `completed`, `sent`, `signer_list`, `status`, or `subject`. 
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	public String getOrderBy() {
		return this.orderBy;
	}
	
	/*
	 * Specifies the the starting location in the result set of the items that are returned. 
	 */
	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}
	
	public String getStartPosition() {
		return this.startPosition;
	}
	
	/*
	 * Specifies the end of the date range to return. 
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public String getToDate() {
		return this.toDate;
	}
	
  }

   /**
   * Gets a list of envelopes in folders matching the specified criteria.
   * Retrieves a list of envelopes that match the criteria specified in the query.\n\nIf the user ID of the user making the call is the same as the user ID for any returned recipient, then the userId property is added to the returned information for those recipients.
   * @param accountId The external account number (int) or account ID Guid.
   * @param searchFolderId Specifies the envelope group that is searched by the request. These are logical groupings, not actual folder names. Valid values are: drafts, awaiting_my_signature, completed, out_for_signature.
   * @return FolderItemResponse
   */ 
  public FolderItemResponse search(String accountId, String searchFolderId) throws ApiException {
    return search(accountId, searchFolderId, null);
  }
  
  
  /**
   * Gets a list of envelopes in folders matching the specified criteria.
   * Retrieves a list of envelopes that match the criteria specified in the query.\n\nIf the user ID of the user making the call is the same as the user ID for any returned recipient, then the userId property is added to the returned information for those recipients.
   * @param accountId The external account number (int) or account ID Guid.
   * @param searchFolderId Specifies the envelope group that is searched by the request. These are logical groupings, not actual folder names. Valid values are: drafts, awaiting_my_signature, completed, out_for_signature.
   * @param FoldersApi.SearchOptions Options for modifying the method behavior.
   * @return FolderItemResponse
   */
  public FolderItemResponse search(String accountId, String searchFolderId, FoldersApi.SearchOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling search");
     }
     
     // verify the required parameter 'searchFolderId' is set
     if (searchFolderId == null) {
        throw new ApiException(400, "Missing the required parameter 'searchFolderId' when calling search");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/search_folders/{searchFolderId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "searchFolderId" + "\\}", apiClient.escapeString(searchFolderId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "all", options.all));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_recipients", options.includeRecipients));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "to_date", options.toDate));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<FolderItemResponse> returnType = new GenericType<FolderItemResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
