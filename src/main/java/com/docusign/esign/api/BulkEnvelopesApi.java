
package com.docusign.esign.api;

import javax.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;



public class BulkEnvelopesApi {
  private ApiClient apiClient;

  public BulkEnvelopesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BulkEnvelopesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Creates a new bulk send list
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendingList  (optional)
   * @return BulkSendingList
   * @throws ApiException if fails to make API call
   */
  public BulkSendingList createBulkSendList(String accountId, BulkSendingList bulkSendingList) throws ApiException {
    Object localVarPostBody = bulkSendingList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createBulkSendList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_send_lists"
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

    GenericType<BulkSendingList> localVarReturnType = new GenericType<BulkSendingList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Uses the specified bulk send list to send the envelope specified in the payload
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendListId  (required)
   * @param bulkSendRequest  (optional)
   * @return BulkSendResponse
   * @throws ApiException if fails to make API call
   */
  public BulkSendResponse createBulkSendRequest(String accountId, String bulkSendListId, BulkSendRequest bulkSendRequest) throws ApiException {
    Object localVarPostBody = bulkSendRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createBulkSendRequest");
    }
    
    // verify the required parameter 'bulkSendListId' is set
    if (bulkSendListId == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkSendListId' when calling createBulkSendRequest");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_send_lists/{bulkSendListId}/send"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "bulkSendListId" + "\\}", apiClient.escapeString(bulkSendListId.toString()));

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

    GenericType<BulkSendResponse> localVarReturnType = new GenericType<BulkSendResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Tests whether the specified bulk sending list can be used to send an envelope
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendListId  (required)
   * @param bulkSendRequest  (optional)
   * @return BulkSendTestResponse
   * @throws ApiException if fails to make API call
   */
  public BulkSendTestResponse createBulkSendTestRequest(String accountId, String bulkSendListId, BulkSendRequest bulkSendRequest) throws ApiException {
    Object localVarPostBody = bulkSendRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createBulkSendTestRequest");
    }
    
    // verify the required parameter 'bulkSendListId' is set
    if (bulkSendListId == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkSendListId' when calling createBulkSendTestRequest");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_send_lists/{bulkSendListId}/test"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "bulkSendListId" + "\\}", apiClient.escapeString(bulkSendListId.toString()));

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

    GenericType<BulkSendTestResponse> localVarReturnType = new GenericType<BulkSendTestResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes an existing bulk send list
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendListId  (required)
   * @return BulkSendingListSummaries
   * @throws ApiException if fails to make API call
   */
  public BulkSendingListSummaries deleteBulkSendList(String accountId, String bulkSendListId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBulkSendList");
    }
    
    // verify the required parameter 'bulkSendListId' is set
    if (bulkSendListId == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkSendListId' when calling deleteBulkSendList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_send_lists/{bulkSendListId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "bulkSendListId" + "\\}", apiClient.escapeString(bulkSendListId.toString()));

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

    GenericType<BulkSendingListSummaries> localVarReturnType = new GenericType<BulkSendingListSummaries>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets a specific bulk send batch status
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendBatchId  (required)
   * @return BulkSendBatchStatus
   * @throws ApiException if fails to make API call
   */
  public BulkSendBatchStatus getBulkSendBatchStatus(String accountId, String bulkSendBatchId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBulkSendBatchStatus");
    }
    
    // verify the required parameter 'bulkSendBatchId' is set
    if (bulkSendBatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkSendBatchId' when calling getBulkSendBatchStatus");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_send_batch/{bulkSendBatchId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "bulkSendBatchId" + "\\}", apiClient.escapeString(bulkSendBatchId.toString()));

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

    GenericType<BulkSendBatchStatus> localVarReturnType = new GenericType<BulkSendBatchStatus>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Returns a list of bulk send batch satuses initiated by account. 
  /// </summary>
  public class GetBulkSendBatchesOptions
  {
  private String batchIds = null;
  private String count = null;
  private String searchText = null;
  private String startPosition = null;
  private String status = null;
  /*
   * 
   */
  public void setBatchIds(String batchIds) {
    this.batchIds = batchIds;
  }

  public String getBatchIds() {
    return this.batchIds;
  }
  /*
   * 
   */
  public void setCount(String count) {
    this.count = count;
  }

  public String getCount() {
    return this.count;
  }
  /*
   * 
   */
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  public String getSearchText() {
    return this.searchText;
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
   * 
   */
  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
  }

   /**
   * Returns a list of bulk send batch satuses initiated by account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BulkSendBatchSummaries
   */ 
  public BulkSendBatchSummaries getBulkSendBatches(String accountId) throws ApiException {
    return getBulkSendBatches(accountId, null);
  }

  /**
   * Returns a list of bulk send batch satuses initiated by account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BulkSendBatchSummaries
   * @throws ApiException if fails to make API call
   */
  public BulkSendBatchSummaries getBulkSendBatches(String accountId, BulkEnvelopesApi.GetBulkSendBatchesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBulkSendBatches");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_send_batch"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("batch_ids", options.batchIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_text", options.searchText));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<BulkSendBatchSummaries> localVarReturnType = new GenericType<BulkSendBatchSummaries>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets a specific bulk send list
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendListId  (required)
   * @return BulkSendingList
   * @throws ApiException if fails to make API call
   */
  public BulkSendingList getBulkSendList(String accountId, String bulkSendListId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBulkSendList");
    }
    
    // verify the required parameter 'bulkSendListId' is set
    if (bulkSendListId == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkSendListId' when calling getBulkSendList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_send_lists/{bulkSendListId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "bulkSendListId" + "\\}", apiClient.escapeString(bulkSendListId.toString()));

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

    GenericType<BulkSendingList> localVarReturnType = new GenericType<BulkSendingList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Lists top-level details for all bulk send lists visible to the current user
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BulkSendingListSummaries
   * @throws ApiException if fails to make API call
   */
  public BulkSendingListSummaries getBulkSendLists(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBulkSendLists");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_send_lists"
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

    GenericType<BulkSendingListSummaries> localVarReturnType = new GenericType<BulkSendingListSummaries>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Put/Update a specific bulk send batch status
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendBatchId  (required)
   * @param bulkSendBatchRequest  (optional)
   * @return BulkSendBatchStatus
   * @throws ApiException if fails to make API call
   */
  public BulkSendBatchStatus updateBulkSendBatchStatus(String accountId, String bulkSendBatchId, BulkSendBatchRequest bulkSendBatchRequest) throws ApiException {
    Object localVarPostBody = bulkSendBatchRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBulkSendBatchStatus");
    }
    
    // verify the required parameter 'bulkSendBatchId' is set
    if (bulkSendBatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkSendBatchId' when calling updateBulkSendBatchStatus");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_send_batch/{bulkSendBatchId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "bulkSendBatchId" + "\\}", apiClient.escapeString(bulkSendBatchId.toString()));

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

    GenericType<BulkSendBatchStatus> localVarReturnType = new GenericType<BulkSendBatchStatus>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates an existing bulk send list.  If send_envelope query string value is provided, will accept an empty payload and try to send the specified envelope
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param bulkSendListId  (required)
   * @param bulkSendingList  (optional)
   * @return BulkSendingList
   * @throws ApiException if fails to make API call
   */
  public BulkSendingList updateBulkSendList(String accountId, String bulkSendListId, BulkSendingList bulkSendingList) throws ApiException {
    Object localVarPostBody = bulkSendingList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBulkSendList");
    }
    
    // verify the required parameter 'bulkSendListId' is set
    if (bulkSendListId == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkSendListId' when calling updateBulkSendList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/bulk_send_lists/{bulkSendListId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "bulkSendListId" + "\\}", apiClient.escapeString(bulkSendListId.toString()));

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

    GenericType<BulkSendingList> localVarReturnType = new GenericType<BulkSendingList>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
