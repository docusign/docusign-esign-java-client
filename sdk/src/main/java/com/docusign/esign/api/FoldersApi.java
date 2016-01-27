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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-18T16:25:36.433-08:00")
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

  
  


  
  
  
  /**
   * Gets a list of the folders for the account.
   * Retrieves a list of the folders for the account, including the folder hierarchy. You can specify whether to return just the template folder or template folder and normal folders by setting the `template` query string parameter.
   * @param accountId The external account number (int) or account ID Guid.
   * FoldersApi.ListOptions Options for modifying the method behavior.
   * @return FoldersResponse
   */
  public FoldersResponse list(String accountId) throws ApiException {
  
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

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    GenericType<FoldersResponse> returnType = new GenericType<FoldersResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets a list of the envelopes in the specified folder.
   * Retrieves a list of the envelopes in the specified folder. You can narrow the query by specifying search criteria in the query string parameters.
   * @param accountId The external account number (int) or account ID Guid.
   * @param folderId The ID of the folder being accessed.
   * FoldersApi.ListItemsOptions Options for modifying the method behavior.
   * @return FolderItemsResponse
   */
  public FolderItemsResponse listItems(String accountId, String folderId) throws ApiException {
  
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

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    GenericType<FolderItemsResponse> returnType = new GenericType<FolderItemsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Moves an envelope from its current folder to the specified folder.
   * Moves an envelope from its current folder to the specified folder.\n\n### Note: You can use this endpoint to delete envelopes by specifying `recyclebin&#39; in the `folderId` parameter of the endpoint. Placing an in process envelope (envelope status of `sent` or `delivered`) in the recycle bin voids the envelope. You can also use this endpoint to delete templates by specifying a template ID instead of an envelope ID in the &#39;envelopeIds&#39; property and specifying `recyclebin` in the `folderId` parameter.
   * @param accountId The external account number (int) or account ID Guid.
   * @param folderId The ID of the folder being accessed.
   * FoldersApi.MoveEnvelopesOptions Options for modifying the method behavior.
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

    String[] authNames = new String[] {  };

    

    
    
    GenericType<FoldersResponse> returnType = new GenericType<FoldersResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  /// <summary>
  /// Gets a list of envelopes in folders matching the specified criteria. Retrieves a list of envelopes that match the criteria specified in the query.\n\nIf the user ID of the user making the call is the same as the user ID for any returned recipient, then the userId property is added to the returned information for those recipients.
  /// </summary>
  public class SearchOptions
  {
	
	private String orderBy = null;
	
	private String startPosition = null;
	
	private String toDate = null;
	
	private String fromDate = null;
	
	private String order = null;
	
	private String includeRecipients = null;
	
	private String all = null;
	
	private String count = null;
	
	
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
	 * Specifies the order in which the list is returned. Valid values are: `asc` for ascending order, and `desc` for descending order. 
	 */
	public void setOrder(String order) {
		this.order = order;
	}
	
	public String getOrder() {
		return this.order;
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
   * FoldersApi.SearchOptions Options for modifying the method behavior.
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
     
       queryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "to_date", options.toDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_recipients", options.includeRecipients));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "all", options.all));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
	 
    }

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    GenericType<FolderItemResponse> returnType = new GenericType<FolderItemResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
}
