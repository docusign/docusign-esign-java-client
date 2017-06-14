package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.BulkEnvelopesResponse;
import com.docusign.esign.model.BulkEnvelopeStatus;
import com.docusign.esign.model.BulkRecipientsResponse;
import com.docusign.esign.model.BulkRecipientsRequest;
import com.docusign.esign.model.BulkRecipientsSummaryResponse;
import com.docusign.esign.model.BulkRecipientsUpdateResponse;


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

  
  
  /// <summary>
  /// Gets status information about bulk recipient batches. Retrieves status information about all the bulk recipient batches. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file. The response includes general information about each bulk recipient batch. \n\nThe response returns information about the envelopes sent with bulk recipient batches, including the `batchId` property, which can be used to retrieve a more detailed status of individual bulk recipient batches.
  /// </summary>
  public class ListOptions
  {
	
	private String count = null;
	
	private String include = null;
	
	private String startPosition = null;
	
	
	/*
	 * The number of results to return. This can be 1 to 20. 
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
	public void setInclude(String include) {
		this.include = include;
	}
	
	public String getInclude() {
		return this.include;
	}
	
	/*
	 * The position of the bulk envelope items in the response. This is used for repeated calls, when the number of bulk envelopes returned is too large for one return. The default value is 0. 
	 */
	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}
	
	public String getStartPosition() {
		return this.startPosition;
	}
	
  }

   /**
   * Gets status information about bulk recipient batches.
   * Retrieves status information about all the bulk recipient batches. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file. The response includes general information about each bulk recipient batch. \n\nThe response returns information about the envelopes sent with bulk recipient batches, including the `batchId` property, which can be used to retrieve a more detailed status of individual bulk recipient batches.
   * @param accountId The external account number (int) or account ID Guid.
   * @return BulkEnvelopesResponse
   */ 
  public BulkEnvelopesResponse list(String accountId) throws ApiException {
    return list(accountId, null);
  }
  
  
  /**
   * Gets status information about bulk recipient batches.
   * Retrieves status information about all the bulk recipient batches. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file. The response includes general information about each bulk recipient batch. \n\nThe response returns information about the envelopes sent with bulk recipient batches, including the `batchId` property, which can be used to retrieve a more detailed status of individual bulk recipient batches.
   * @param accountId The external account number (int) or account ID Guid.
   * @param BulkEnvelopesApi.ListOptions Options for modifying the method behavior.
   * @return BulkEnvelopesResponse
   */
  public BulkEnvelopesResponse list(String accountId, BulkEnvelopesApi.ListOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling list");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/bulk_envelopes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<BulkEnvelopesResponse> returnType = new GenericType<BulkEnvelopesResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the status of a specified bulk send operation. Retrieves the status information of a single bulk recipient batch. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file.
  /// </summary>
  public class GetOptions
  {
	
	private String count = null;
	
	private String include = null;
	
	private String startPosition = null;
	
	
	/*
	 * Specifies the number of entries to return. 
	 */
	public void setCount(String count) {
		this.count = count;
	}
	
	public String getCount() {
		return this.count;
	}
	
	/*
	 * Specifies which entries are included in the response. Multiple entries can be included by using commas in the query string (example: ?include=”failed,queued”) \n\nValid values are: \n\n* all - Returns all entries. If present, overrides all other query settings. This is the default if no query string is provided.\n* failed - This only returns entries with a failed status.\n* queued - This only returns entries with a queued status.\n* sent – This only returns entries with a sent status. 
	 */
	public void setInclude(String include) {
		this.include = include;
	}
	
	public String getInclude() {
		return this.include;
	}
	
	/*
	 * Specifies the location in the list of envelopes from which to start. 
	 */
	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}
	
	public String getStartPosition() {
		return this.startPosition;
	}
	
  }

   /**
   * Gets the status of a specified bulk send operation.
   * Retrieves the status information of a single bulk recipient batch. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file.
   * @param accountId The external account number (int) or account ID Guid.
   * @param batchId 
   * @return BulkEnvelopeStatus
   */ 
  public BulkEnvelopeStatus get(String accountId, String batchId) throws ApiException {
    return get(accountId, batchId, null);
  }
  
  
  /**
   * Gets the status of a specified bulk send operation.
   * Retrieves the status information of a single bulk recipient batch. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file.
   * @param accountId The external account number (int) or account ID Guid.
   * @param batchId 
   * @param BulkEnvelopesApi.GetOptions Options for modifying the method behavior.
   * @return BulkEnvelopeStatus
   */
  public BulkEnvelopeStatus get(String accountId, String batchId, BulkEnvelopesApi.GetOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling get");
     }
     
     // verify the required parameter 'batchId' is set
     if (batchId == null) {
        throw new ApiException(400, "Missing the required parameter 'batchId' when calling get");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/bulk_envelopes/{batchId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "batchId" + "\\}", apiClient.escapeString(batchId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<BulkEnvelopeStatus> returnType = new GenericType<BulkEnvelopeStatus>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the bulk recipient file from an envelope. Retrieves the bulk recipient file information from an envelope that has a bulk recipient.
  /// </summary>
  public class GetRecipientsOptions
  {
	
	private String includeTabs = null;
	
	private String startPosition = null;
	
	
	/*
	 * 
	 */
	public void setIncludeTabs(String includeTabs) {
		this.includeTabs = includeTabs;
	}
	
	public String getIncludeTabs() {
		return this.includeTabs;
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
	
  }

   /**
   * Gets the bulk recipient file from an envelope.
   * Retrieves the bulk recipient file information from an envelope that has a bulk recipient.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @return BulkRecipientsResponse
   */ 
  public BulkRecipientsResponse getRecipients(String accountId, String envelopeId, String recipientId) throws ApiException {
    return getRecipients(accountId, envelopeId, recipientId, null);
  }
  
  
  /**
   * Gets the bulk recipient file from an envelope.
   * Retrieves the bulk recipient file information from an envelope that has a bulk recipient.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param BulkEnvelopesApi.GetRecipientsOptions Options for modifying the method behavior.
   * @return BulkRecipientsResponse
   */
  public BulkRecipientsResponse getRecipients(String accountId, String envelopeId, String recipientId, BulkEnvelopesApi.GetRecipientsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipients");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipients");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include_tabs", options.includeTabs));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<BulkRecipientsResponse> returnType = new GenericType<BulkRecipientsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Adds or replaces envelope bulk recipients.
   * Updates the bulk recipients in a draft envelope using a file upload. The Content-Type supported for uploading a bulk recipient file is CSV (text/csv).\n\nThe REST API does not support modifying individual rows or values in the bulk recipients file. It only allows the entire file to be added or replaced with a new file.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param BulkEnvelopesApi.UpdateRecipientsOptions Options for modifying the method behavior.
   * @return BulkRecipientsSummaryResponse
   */
  public BulkRecipientsSummaryResponse updateRecipients(String accountId, String envelopeId, String recipientId, BulkRecipientsRequest bulkRecipientsRequest) throws ApiException {
  
    Object postBody = bulkRecipientsRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipients");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipients");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    
    GenericType<BulkRecipientsSummaryResponse> returnType = new GenericType<BulkRecipientsSummaryResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes the bulk recipient file from an envelope.
   * Deletes the bulk recipient file from an envelope. This cannot be used if the envelope has been sent.\n\nAfter using this, the `bulkRecipientsUri` property is not returned in subsequent GET calls for the envelope, but the recipient will remain as a bulk recipient.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param BulkEnvelopesApi.DeleteRecipientsOptions Options for modifying the method behavior.
   * @return BulkRecipientsUpdateResponse
   */
  public BulkRecipientsUpdateResponse deleteRecipients(String accountId, String envelopeId, String recipientId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipients");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteRecipients");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    
    GenericType<BulkRecipientsUpdateResponse> returnType = new GenericType<BulkRecipientsUpdateResponse>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
