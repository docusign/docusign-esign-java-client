package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ChunkedUploadRequest;
import com.docusign.esign.model.ChunkedUploadResponse;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.EnvelopesInformation;
import com.docusign.esign.model.EnvelopeSummary;
import com.docusign.esign.model.EnvelopeDefinition;
import com.docusign.esign.model.EnvelopeIdsRequest;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.EnvelopeUpdateSummary;
import com.docusign.esign.model.EnvelopeAttachmentsResult;
import com.docusign.esign.model.EnvelopeAttachmentsRequest;
import com.docusign.esign.model.Attachment;
import com.docusign.esign.model.EnvelopeAuditEventResponse;
import com.docusign.esign.model.CustomFieldsEnvelope;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.EnvelopeDocumentsResult;
import com.docusign.esign.model.DocumentFieldsInformation;
import com.docusign.esign.model.PageRequest;
import com.docusign.esign.model.TemplateInformation;
import com.docusign.esign.model.DocumentTemplateList;
import com.docusign.esign.model.EmailSettings;
import com.docusign.esign.model.EnvelopeFormData;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.LockRequest;
import com.docusign.esign.model.Notification;
import com.docusign.esign.model.EnvelopeNotificationRequest;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.RecipientsUpdateSummary;
import com.docusign.esign.model.DocumentVisibilityList;
import com.docusign.esign.model.ConsumerDisclosure;
import com.docusign.esign.model.UserSignature;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.ViewUrl;
import com.docusign.esign.model.CorrectViewRequest;
import com.docusign.esign.model.ReturnUrlRequest;
import com.docusign.esign.model.RecipientViewRequest;
import com.docusign.esign.model.ViewLinkRequest;
import com.docusign.esign.model.TemplateDocumentVisibilityList;
import com.docusign.esign.model.ConsoleViewRequest;


public class EnvelopesApi {
  private ApiClient apiClient;

  public EnvelopesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EnvelopesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  
  
  /**
   * Initiate a new ChunkedUpload.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param EnvelopesApi.CreateChunkedUploadOptions Options for modifying the method behavior.
   * @return ChunkedUploadResponse
   */
  public ChunkedUploadResponse createChunkedUpload(String accountId, ChunkedUploadRequest chunkedUploadRequest) throws ApiException {
  
    Object postBody = chunkedUploadRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createChunkedUpload");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/chunked_uploads".replaceAll("\\{format\\}","json")
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

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ChunkedUploadResponse> returnType = new GenericType<ChunkedUploadResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Retrieves the current metadata of a ChunkedUpload. 
  /// </summary>
  public class GetChunkedUploadOptions
  {
	
	private String include = null;
	
	
	/*
	 * 
	 */
	public void setInclude(String include) {
		this.include = include;
	}
	
	public String getInclude() {
		return this.include;
	}
	
  }

   /**
   * Retrieves the current metadata of a ChunkedUpload.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param chunkedUploadId 
   * @return ChunkedUploadResponse
   */ 
  public ChunkedUploadResponse getChunkedUpload(String accountId, String chunkedUploadId) throws ApiException {
    return getChunkedUpload(accountId, chunkedUploadId, null);
  }
  
  
  /**
   * Retrieves the current metadata of a ChunkedUpload.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param chunkedUploadId 
   * @param EnvelopesApi.GetChunkedUploadOptions Options for modifying the method behavior.
   * @return ChunkedUploadResponse
   */
  public ChunkedUploadResponse getChunkedUpload(String accountId, String chunkedUploadId, EnvelopesApi.GetChunkedUploadOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getChunkedUpload");
     }
     
     // verify the required parameter 'chunkedUploadId' is set
     if (chunkedUploadId == null) {
        throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling getChunkedUpload");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/chunked_uploads/{chunkedUploadId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ChunkedUploadResponse> returnType = new GenericType<ChunkedUploadResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Integrity-Check and Commit a ChunkedUpload, readying it for use elsewhere. 
  /// </summary>
  public class UpdateChunkedUploadOptions
  {
	
	private String action = null;
	
	
	/*
	 * 
	 */
	public void setAction(String action) {
		this.action = action;
	}
	
	public String getAction() {
		return this.action;
	}
	
  }

   /**
   * Integrity-Check and Commit a ChunkedUpload, readying it for use elsewhere.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param chunkedUploadId 
   * @return ChunkedUploadResponse
   */ 
  public ChunkedUploadResponse updateChunkedUpload(String accountId, String chunkedUploadId) throws ApiException {
    return updateChunkedUpload(accountId, chunkedUploadId, null);
  }
  
  
  /**
   * Integrity-Check and Commit a ChunkedUpload, readying it for use elsewhere.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param chunkedUploadId 
   * @param EnvelopesApi.UpdateChunkedUploadOptions Options for modifying the method behavior.
   * @return ChunkedUploadResponse
   */
  public ChunkedUploadResponse updateChunkedUpload(String accountId, String chunkedUploadId, EnvelopesApi.UpdateChunkedUploadOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateChunkedUpload");
     }
     
     // verify the required parameter 'chunkedUploadId' is set
     if (chunkedUploadId == null) {
        throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling updateChunkedUpload");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/chunked_uploads/{chunkedUploadId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "action", options.action));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ChunkedUploadResponse> returnType = new GenericType<ChunkedUploadResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Delete an existing ChunkedUpload.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param chunkedUploadId 
   * @param EnvelopesApi.DeleteChunkedUploadOptions Options for modifying the method behavior.
   * @return ChunkedUploadResponse
   */
  public ChunkedUploadResponse deleteChunkedUpload(String accountId, String chunkedUploadId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteChunkedUpload");
     }
     
     // verify the required parameter 'chunkedUploadId' is set
     if (chunkedUploadId == null) {
        throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling deleteChunkedUpload");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/chunked_uploads/{chunkedUploadId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()));

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

    
    GenericType<ChunkedUploadResponse> returnType = new GenericType<ChunkedUploadResponse>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Add a chunk, a chunk &#39;part&#39;, to an existing ChunkedUpload.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param chunkedUploadId 
   * @param chunkedUploadPartSeq 
   * @param EnvelopesApi.UpdateChunkedUploadPartOptions Options for modifying the method behavior.
   * @return ChunkedUploadResponse
   */
  public ChunkedUploadResponse updateChunkedUploadPart(String accountId, String chunkedUploadId, String chunkedUploadPartSeq, ChunkedUploadRequest chunkedUploadRequest) throws ApiException {
  
    Object postBody = chunkedUploadRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateChunkedUploadPart");
     }
     
     // verify the required parameter 'chunkedUploadId' is set
     if (chunkedUploadId == null) {
        throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling updateChunkedUploadPart");
     }
     
     // verify the required parameter 'chunkedUploadPartSeq' is set
     if (chunkedUploadPartSeq == null) {
        throw new ApiException(400, "Missing the required parameter 'chunkedUploadPartSeq' when calling updateChunkedUploadPart");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/chunked_uploads/{chunkedUploadId}/{chunkedUploadPartSeq}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()))
      .replaceAll("\\{" + "chunkedUploadPartSeq" + "\\}", apiClient.escapeString(chunkedUploadPartSeq.toString()));

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

    
    GenericType<ChunkedUploadResponse> returnType = new GenericType<ChunkedUploadResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets status changes for one or more envelopes. Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.\n\n### Important: Unless you are requesting the status for specific envelopes (using the `envelopeIds` or `transactionIds` properties), you must add a set the `from_date` property in the request.\n\nGetting envelope status using `transactionIds` is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.\n\n### Request Envelope Status Notes ###\n\nThe REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (`from_to_status`) set to `Delivered` &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.\n\nTo avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.\n\nFor example, a request with a status qualifier (from_to_status) of `Delivered` and a status of \&quot;`Created`,`Sent`\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of `Created` or `Sent`, and since an envelope that has been delivered can never have a status of `Created` or `Sent`, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.\n\nClient applications should check that the statuses they are requesting make sense for a given status qualifier.
  /// </summary>
  public class ListStatusChangesOptions
  {
	
	private String acStatus = null;
	
	private String block = null;
	
	private String count = null;
	
	private String customField = null;
	
	private String email = null;
	
	private String envelopeIds = null;
	
	private String exclude = null;
	
	private String folderIds = null;
	
	private String folderTypes = null;
	
	private String fromDate = null;
	
	private String fromToStatus = null;
	
	private String include = null;
	
	private String intersectingFolderIds = null;
	
	private String order = null;
	
	private String orderBy = null;
	
	private String powerformids = null;
	
	private String searchText = null;
	
	private String startPosition = null;
	
	private String status = null;
	
	private String toDate = null;
	
	private String transactionIds = null;
	
	private String userFilter = null;
	
	private String userId = null;
	
	private String userName = null;
	
	
	/*
	 * Specifies the Authoritative Copy Status for the envelopes. The possible values are: Unknown, Original, Transferred, AuthoritativeCopy, AuthoritativeCopyExportPending, AuthoritativeCopyExported, DepositPending, Deposited, DepositedEO, or DepositFailed. 
	 */
	public void setAcStatus(String acStatus) {
		this.acStatus = acStatus;
	}
	
	public String getAcStatus() {
		return this.acStatus;
	}
	
	/*
	 * 
	 */
	public void setBlock(String block) {
		this.block = block;
	}
	
	public String getBlock() {
		return this.block;
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
	 * This specifies the envelope custom field name and value searched for in the envelope information. The value portion of the query can use partial strings by adding &#39;%&#39; (percent sign) around the custom field query value. \n\nExample 1: If you have an envelope custom field called \&quot;Region\&quot; and you want to search for all envelopes where the value is \&quot;West\&quot; you would use the query: `?custom_field=Region=West`. \n\nExample 2: To search for envelopes where the `ApplicationID` custom field has the value or partial value of \&quot;DocuSign\&quot; in field, the query would be: `?custom_field=ApplicationId=%DocuSign%` This would find envelopes where the custom field value is \&quot;DocuSign for Salesforce\&quot; or \&quot;DocuSign envelope.\&quot; 
	 */
	public void setCustomField(String customField) {
		this.customField = customField;
	}
	
	public String getCustomField() {
		return this.customField;
	}
	
	/*
	 * 
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	/*
	 * 
	 */
	public void setEnvelopeIds(String envelopeIds) {
		this.envelopeIds = envelopeIds;
	}
	
	public String getEnvelopeIds() {
		return this.envelopeIds;
	}
	
	/*
	 * 
	 */
	public void setExclude(String exclude) {
		this.exclude = exclude;
	}
	
	public String getExclude() {
		return this.exclude;
	}
	
	/*
	 * 
	 */
	public void setFolderIds(String folderIds) {
		this.folderIds = folderIds;
	}
	
	public String getFolderIds() {
		return this.folderIds;
	}
	
	/*
	 * 
	 */
	public void setFolderTypes(String folderTypes) {
		this.folderTypes = folderTypes;
	}
	
	public String getFolderTypes() {
		return this.folderTypes;
	}
	
	/*
	 * The date/time setting that specifies the date/time when the request begins checking for status changes for envelopes in the account.\n\nThis is required unless &#39;envelopeId&#39;s are used. 
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	public String getFromDate() {
		return this.fromDate;
	}
	
	/*
	 * This is the status type checked for in the `from_date`/`to_date` period. If `changed` is specified, then envelopes that changed status during the period are found. If for example, `created` is specified, then envelopes created during the period are found. Default is `changed`. \n\nPossible values are: Voided, Changed, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut and Processing. 
	 */
	public void setFromToStatus(String fromToStatus) {
		this.fromToStatus = fromToStatus;
	}
	
	public String getFromToStatus() {
		return this.fromToStatus;
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
	 * 
	 */
	public void setIntersectingFolderIds(String intersectingFolderIds) {
		this.intersectingFolderIds = intersectingFolderIds;
	}
	
	public String getIntersectingFolderIds() {
		return this.intersectingFolderIds;
	}
	
	/*
	 * 
	 */
	public void setOrder(String order) {
		this.order = order;
	}
	
	public String getOrder() {
		return this.order;
	}
	
	/*
	 * 
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	public String getOrderBy() {
		return this.orderBy;
	}
	
	/*
	 * 
	 */
	public void setPowerformids(String powerformids) {
		this.powerformids = powerformids;
	}
	
	public String getPowerformids() {
		return this.powerformids;
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
	 * The list of current statuses to include in the response. By default, all envelopes found are returned. If values are specified, then of the envelopes found, only those with the current status specified are returned in the results. \n\nPossible values are: Voided, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut and Processing. 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	/*
	 * Optional date/time setting that specifies the date/time when the request stops for status changes for envelopes in the account. If no entry, the system uses the time of the call as the `to_date`. 
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public String getToDate() {
		return this.toDate;
	}
	
	/*
	 * If included in the query string, this is a comma separated list of envelope `transactionId`s. \n\nIf included in the `request_body`, this is a list of envelope `transactionId`s. \n\n###### Note: `transactionId`s are only valid in the DocuSign system for seven days. 
	 */
	public void setTransactionIds(String transactionIds) {
		this.transactionIds = transactionIds;
	}
	
	public String getTransactionIds() {
		return this.transactionIds;
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
	
	/*
	 * 
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	/*
	 * 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
  }

   /**
   * Gets status changes for one or more envelopes.
   * Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.\n\n### Important: Unless you are requesting the status for specific envelopes (using the `envelopeIds` or `transactionIds` properties), you must add a set the `from_date` property in the request.\n\nGetting envelope status using `transactionIds` is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.\n\n### Request Envelope Status Notes ###\n\nThe REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (`from_to_status`) set to `Delivered` &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.\n\nTo avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.\n\nFor example, a request with a status qualifier (from_to_status) of `Delivered` and a status of \&quot;`Created`,`Sent`\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of `Created` or `Sent`, and since an envelope that has been delivered can never have a status of `Created` or `Sent`, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.\n\nClient applications should check that the statuses they are requesting make sense for a given status qualifier.
   * @param accountId The external account number (int) or account ID Guid.
   * @return EnvelopesInformation
   */ 
  public EnvelopesInformation listStatusChanges(String accountId) throws ApiException {
    return listStatusChanges(accountId, null);
  }
  
  
  /**
   * Gets status changes for one or more envelopes.
   * Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.\n\n### Important: Unless you are requesting the status for specific envelopes (using the `envelopeIds` or `transactionIds` properties), you must add a set the `from_date` property in the request.\n\nGetting envelope status using `transactionIds` is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.\n\n### Request Envelope Status Notes ###\n\nThe REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (`from_to_status`) set to `Delivered` &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.\n\nTo avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.\n\nFor example, a request with a status qualifier (from_to_status) of `Delivered` and a status of \&quot;`Created`,`Sent`\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of `Created` or `Sent`, and since an envelope that has been delivered can never have a status of `Created` or `Sent`, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.\n\nClient applications should check that the statuses they are requesting make sense for a given status qualifier.
   * @param accountId The external account number (int) or account ID Guid.
   * @param EnvelopesApi.ListStatusChangesOptions Options for modifying the method behavior.
   * @return EnvelopesInformation
   */
  public EnvelopesInformation listStatusChanges(String accountId, EnvelopesApi.ListStatusChangesOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listStatusChanges");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "ac_status", options.acStatus));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "block", options.block));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "custom_field", options.customField));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "email", options.email));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "envelope_ids", options.envelopeIds));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "exclude", options.exclude));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "folder_ids", options.folderIds));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "folder_types", options.folderTypes));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "from_to_status", options.fromToStatus));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "intersecting_folder_ids", options.intersectingFolderIds));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "powerformids", options.powerformids));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "search_text", options.searchText));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "status", options.status));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "to_date", options.toDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "transaction_ids", options.transactionIds));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "user_filter", options.userFilter));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "user_id", options.userId));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "user_name", options.userName));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<EnvelopesInformation> returnType = new GenericType<EnvelopesInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Creates an envelope. Creates an envelope. \n\nUsing this function you can:\n* Create an envelope and send it.\n* Create an envelope from an existing template and send it.\n\nIn either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request’s `status` property to `created` instead of `sent`.\n\n## Sending Envelopes\n\nDocuments can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the `documentBase64` field of the [`document` object](#/definitions/document)\n\n### Recipient Types\nAn [`envelopeDefinition` object](#/definitions/envelopeDefinition) is used as the method’s body. Envelope recipients can be defined in the envelope or in templates. The `envelopeDefinition` object’s `recipients` field is an [`EnvelopeRecipients` resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:\n\nRecipient type | Object definition\n-------------- | -----------------\nagent (can add name and email information for later recipients/signers) | [`agent`](#/definitions/agent)\ncarbon copy (receives a copy of the documents) | [`carbonCopy`](#/definitions/carbonCopy)\ncertified delivery  (receives a copy of the documents and must acknowledge receipt) | [`certifiedDelivery`](#/definitions/certifiedDelivery)\neditor (can change recipients and document fields for later recipients/signers) | [`editor`](#/definitions/editor)\nin-person signer (“hosts” someone who signs in-person) | [`inPersonSigner`](#/definitions/inPersonSigner)\nintermediary (can add name and email information for some later recipients/signers.) | [`intermediary`](#/definitions/intermediary)\nsigner (signs and/or updates document fields) | [`signer`](#/definitions/signer)\n\nAdditional information about the different types of recipients is available from the [`EnvelopeRecipients` resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)\n\n### Tabs\nTabs (also referred to as `tags` and as `fields` in the web sending user interface), can be defined in the `envelopeDefinition`, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).\n\nDefining tabs: the `inPersonSigner`, and `signer` recipient objects include a `tabs` field. It is an [`EnvelopeTabs` resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [`EnvelopeTabs` resource](../../EnvelopeTabs) for more information.\n\n## Using Templates\nEnvelopes use specific people or groups as recipients. Templates can specify a role, eg `account_manager.` When a template is used in an envelope, the roles must be replaced with specific people or groups.\n\nWhen you create an envelope using a `templateId`, the different recipient type objects within the [`EnvelopeRecipients` object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template’s roles via the `roleName` property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.\n\n### Message Lock\nWhen a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field `messageLock` is used to lock the email subject and message.\n\nIf an email subject or message is entered before adding or applying a template with `messageLock` **true**, the email subject and message is overwritten with the locked email subject and message from the template.\n\n## Envelope Status\nThe status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope’s status changes. DocuSign limits polling to once every 15 minutes or less frequently.\n\nWhen a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message. \n\nSee the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.\n\n## Webhook Options\nThe two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client. \n\n### eventNotification Webhooks\nThe Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.\n\n### Connect Webhooks\nConnect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc. \n\nConnect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting “Go to Admin” from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.\n\nConnect is available for some DocuSign account types. Please contact DocuSign Sales for more information.\n\n## Composite Templates\n\nThe Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.\n\nEach Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.\n\n* The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the `compositeTemplateId` to which the document should be added. If `compositeTemplateId` is not specified in the content-disposition, the document is applied based on the `documentId` only. If no document object is specified, the composite template inherits the first document.\n\n* Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.\n\nPDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set `transformPdfFields` to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.\n\n* PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.\n\n### Compositing the definitions\nEach Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:\n\n* Templates are overlaid in the order of their Sequence value.\n* If Document is not passed into the Composite Template’s `document` field, the *first* template’s document (based on the template’s Sequence value) is used.\n* Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.\n\nFor example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.\n\n* Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.\n\n* If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.\n\n* Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.\n\nFor example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.\n\n* roleName and tabLabel matching is case sensitive.\n\n* The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.\n\n* You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with “\*” and then the system matches tabs that start with the label.\n\n* If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)\n\n### Including the Document Content for Composite Templates\nDocument content can be supplied inline, using the `documentBase64` or can be included in a multi-part HTTP message. \nIf a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the `compositeTemplateId` to which the document should be added. Using the `compositeTemplateId` sets which documents are associated with particular composite templates. An example of this usage is:\n\n```\n   --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d\n   Content-Type: application/pdf\n   Content-Disposition: file; filename=\&quot;eula.pdf\&quot;; documentId=1; compositeTemplateId=\&quot;1\&quot;\n   Content-Transfer-Encoding: base64\n```\n\n### PDF Form Field Transformation\nOnly the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text\n\nField Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.\n\nWhen transforming a *PDF Form Digital Signature Field,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\n\nAny other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab\n\nWhen transforming *PDF Form Text Fields,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\nDocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID\nDocuSignCompany or eSignCompany | Company\nDocuSignDateSigned or eSignDateSigned | Date Signed\nDocuSignTitle or eSignTitle | Title\nDocuSignFullName or eSignFullName |  Full Name\nDocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment\n\nAny other PDF Form Text Field will be transformed to a DocuSign data (text) tab.\n\nPDF Form Field Names that include “DocuSignIgnoreTransform” or “eSignIgnoreTransform” will not be transformed.\n\nPDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.\n\n## Template Email Subject Merge Fields\nThis feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.\n\nThe merge fields, based on the recipient’s `roleName`, are added to the `emailSubject` when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.\n\nBoth the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.\n\nIf merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.\n\n* To add a recipient’s name in the subject line add the following text in the `emailSubject` when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_UserName]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,`\n\n* To add a recipient’s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_Email]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,`\n\nIn both cases the &lt;roleName&gt; is the recipient’s `roleName` in the template.\n\nFor cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.\n\n## Branding an envelope\nThe following rules are used to determine the `brandId` used in an envelope:\n\n* If a `brandId` is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope.\n* If more than one template is used in an envelope and more than one `brandId` is specified, the first `brandId` specified is used throughout the envelope.\n* In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account’s default signing brand is used.\n* For envelopes that do not meet any of the previous criteria, the account’s default signing brand is used for the envelope.\n\n## BCC Email address feature \nThe BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don’t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.\n\n## Merge Recipient Roles for Draft Envelopes\nWhen an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.\n\nTo prevent this, the query parameter `merge_roles_on_draft` should be added when posting a draft envelope (status=created) with multiple templates. Doing this will merge template roles and remove empty recipients.\n\n###### Note: DocuSign recommends that the `merge_roles_on_draft` query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
  /// </summary>
  public class CreateEnvelopeOptions
  {
	
	private String cdseMode = null;
	
	private String completedDocumentsOnly = null;
	
	private String mergeRolesOnDraft = null;
	
	
	/*
	 * 
	 */
	public void setCdseMode(String cdseMode) {
		this.cdseMode = cdseMode;
	}
	
	public String getCdseMode() {
		return this.cdseMode;
	}
	
	/*
	 * If set to true then we want to set the sourceEnvelopeId to indicate that this is a\&quot;forward\&quot; envelope action 
	 */
	public void setCompletedDocumentsOnly(String completedDocumentsOnly) {
		this.completedDocumentsOnly = completedDocumentsOnly;
	}
	
	public String getCompletedDocumentsOnly() {
		return this.completedDocumentsOnly;
	}
	
	/*
	 * When set to **true**, merges template roles and remove empty recipients when you create an envelope with multiple templates. 
	 */
	public void setMergeRolesOnDraft(String mergeRolesOnDraft) {
		this.mergeRolesOnDraft = mergeRolesOnDraft;
	}
	
	public String getMergeRolesOnDraft() {
		return this.mergeRolesOnDraft;
	}
	
  }

   /**
   * Creates an envelope.
   * Creates an envelope. \n\nUsing this function you can:\n* Create an envelope and send it.\n* Create an envelope from an existing template and send it.\n\nIn either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request’s `status` property to `created` instead of `sent`.\n\n## Sending Envelopes\n\nDocuments can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the `documentBase64` field of the [`document` object](#/definitions/document)\n\n### Recipient Types\nAn [`envelopeDefinition` object](#/definitions/envelopeDefinition) is used as the method’s body. Envelope recipients can be defined in the envelope or in templates. The `envelopeDefinition` object’s `recipients` field is an [`EnvelopeRecipients` resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:\n\nRecipient type | Object definition\n-------------- | -----------------\nagent (can add name and email information for later recipients/signers) | [`agent`](#/definitions/agent)\ncarbon copy (receives a copy of the documents) | [`carbonCopy`](#/definitions/carbonCopy)\ncertified delivery  (receives a copy of the documents and must acknowledge receipt) | [`certifiedDelivery`](#/definitions/certifiedDelivery)\neditor (can change recipients and document fields for later recipients/signers) | [`editor`](#/definitions/editor)\nin-person signer (“hosts” someone who signs in-person) | [`inPersonSigner`](#/definitions/inPersonSigner)\nintermediary (can add name and email information for some later recipients/signers.) | [`intermediary`](#/definitions/intermediary)\nsigner (signs and/or updates document fields) | [`signer`](#/definitions/signer)\n\nAdditional information about the different types of recipients is available from the [`EnvelopeRecipients` resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)\n\n### Tabs\nTabs (also referred to as `tags` and as `fields` in the web sending user interface), can be defined in the `envelopeDefinition`, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).\n\nDefining tabs: the `inPersonSigner`, and `signer` recipient objects include a `tabs` field. It is an [`EnvelopeTabs` resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [`EnvelopeTabs` resource](../../EnvelopeTabs) for more information.\n\n## Using Templates\nEnvelopes use specific people or groups as recipients. Templates can specify a role, eg `account_manager.` When a template is used in an envelope, the roles must be replaced with specific people or groups.\n\nWhen you create an envelope using a `templateId`, the different recipient type objects within the [`EnvelopeRecipients` object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template’s roles via the `roleName` property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.\n\n### Message Lock\nWhen a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field `messageLock` is used to lock the email subject and message.\n\nIf an email subject or message is entered before adding or applying a template with `messageLock` **true**, the email subject and message is overwritten with the locked email subject and message from the template.\n\n## Envelope Status\nThe status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope’s status changes. DocuSign limits polling to once every 15 minutes or less frequently.\n\nWhen a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message. \n\nSee the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.\n\n## Webhook Options\nThe two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client. \n\n### eventNotification Webhooks\nThe Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.\n\n### Connect Webhooks\nConnect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc. \n\nConnect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting “Go to Admin” from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.\n\nConnect is available for some DocuSign account types. Please contact DocuSign Sales for more information.\n\n## Composite Templates\n\nThe Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.\n\nEach Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.\n\n* The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the `compositeTemplateId` to which the document should be added. If `compositeTemplateId` is not specified in the content-disposition, the document is applied based on the `documentId` only. If no document object is specified, the composite template inherits the first document.\n\n* Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.\n\nPDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set `transformPdfFields` to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.\n\n* PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.\n\n### Compositing the definitions\nEach Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:\n\n* Templates are overlaid in the order of their Sequence value.\n* If Document is not passed into the Composite Template’s `document` field, the *first* template’s document (based on the template’s Sequence value) is used.\n* Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.\n\nFor example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.\n\n* Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.\n\n* If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.\n\n* Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.\n\nFor example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.\n\n* roleName and tabLabel matching is case sensitive.\n\n* The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.\n\n* You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with “\*” and then the system matches tabs that start with the label.\n\n* If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)\n\n### Including the Document Content for Composite Templates\nDocument content can be supplied inline, using the `documentBase64` or can be included in a multi-part HTTP message. \nIf a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the `compositeTemplateId` to which the document should be added. Using the `compositeTemplateId` sets which documents are associated with particular composite templates. An example of this usage is:\n\n```\n   --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d\n   Content-Type: application/pdf\n   Content-Disposition: file; filename=\&quot;eula.pdf\&quot;; documentId=1; compositeTemplateId=\&quot;1\&quot;\n   Content-Transfer-Encoding: base64\n```\n\n### PDF Form Field Transformation\nOnly the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text\n\nField Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.\n\nWhen transforming a *PDF Form Digital Signature Field,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\n\nAny other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab\n\nWhen transforming *PDF Form Text Fields,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\nDocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID\nDocuSignCompany or eSignCompany | Company\nDocuSignDateSigned or eSignDateSigned | Date Signed\nDocuSignTitle or eSignTitle | Title\nDocuSignFullName or eSignFullName |  Full Name\nDocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment\n\nAny other PDF Form Text Field will be transformed to a DocuSign data (text) tab.\n\nPDF Form Field Names that include “DocuSignIgnoreTransform” or “eSignIgnoreTransform” will not be transformed.\n\nPDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.\n\n## Template Email Subject Merge Fields\nThis feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.\n\nThe merge fields, based on the recipient’s `roleName`, are added to the `emailSubject` when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.\n\nBoth the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.\n\nIf merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.\n\n* To add a recipient’s name in the subject line add the following text in the `emailSubject` when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_UserName]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,`\n\n* To add a recipient’s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_Email]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,`\n\nIn both cases the &lt;roleName&gt; is the recipient’s `roleName` in the template.\n\nFor cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.\n\n## Branding an envelope\nThe following rules are used to determine the `brandId` used in an envelope:\n\n* If a `brandId` is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope.\n* If more than one template is used in an envelope and more than one `brandId` is specified, the first `brandId` specified is used throughout the envelope.\n* In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account’s default signing brand is used.\n* For envelopes that do not meet any of the previous criteria, the account’s default signing brand is used for the envelope.\n\n## BCC Email address feature \nThe BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don’t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.\n\n## Merge Recipient Roles for Draft Envelopes\nWhen an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.\n\nTo prevent this, the query parameter `merge_roles_on_draft` should be added when posting a draft envelope (status=created) with multiple templates. Doing this will merge template roles and remove empty recipients.\n\n###### Note: DocuSign recommends that the `merge_roles_on_draft` query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
   * @param accountId The external account number (int) or account ID Guid.
   * @return EnvelopeSummary
   */ 
  public EnvelopeSummary createEnvelope(String accountId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    return createEnvelope(accountId, envelopeDefinition, null);
  }
  
  
  /**
   * Creates an envelope.
   * Creates an envelope. \n\nUsing this function you can:\n* Create an envelope and send it.\n* Create an envelope from an existing template and send it.\n\nIn either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request’s `status` property to `created` instead of `sent`.\n\n## Sending Envelopes\n\nDocuments can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the `documentBase64` field of the [`document` object](#/definitions/document)\n\n### Recipient Types\nAn [`envelopeDefinition` object](#/definitions/envelopeDefinition) is used as the method’s body. Envelope recipients can be defined in the envelope or in templates. The `envelopeDefinition` object’s `recipients` field is an [`EnvelopeRecipients` resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:\n\nRecipient type | Object definition\n-------------- | -----------------\nagent (can add name and email information for later recipients/signers) | [`agent`](#/definitions/agent)\ncarbon copy (receives a copy of the documents) | [`carbonCopy`](#/definitions/carbonCopy)\ncertified delivery  (receives a copy of the documents and must acknowledge receipt) | [`certifiedDelivery`](#/definitions/certifiedDelivery)\neditor (can change recipients and document fields for later recipients/signers) | [`editor`](#/definitions/editor)\nin-person signer (“hosts” someone who signs in-person) | [`inPersonSigner`](#/definitions/inPersonSigner)\nintermediary (can add name and email information for some later recipients/signers.) | [`intermediary`](#/definitions/intermediary)\nsigner (signs and/or updates document fields) | [`signer`](#/definitions/signer)\n\nAdditional information about the different types of recipients is available from the [`EnvelopeRecipients` resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)\n\n### Tabs\nTabs (also referred to as `tags` and as `fields` in the web sending user interface), can be defined in the `envelopeDefinition`, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).\n\nDefining tabs: the `inPersonSigner`, and `signer` recipient objects include a `tabs` field. It is an [`EnvelopeTabs` resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [`EnvelopeTabs` resource](../../EnvelopeTabs) for more information.\n\n## Using Templates\nEnvelopes use specific people or groups as recipients. Templates can specify a role, eg `account_manager.` When a template is used in an envelope, the roles must be replaced with specific people or groups.\n\nWhen you create an envelope using a `templateId`, the different recipient type objects within the [`EnvelopeRecipients` object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template’s roles via the `roleName` property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.\n\n### Message Lock\nWhen a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field `messageLock` is used to lock the email subject and message.\n\nIf an email subject or message is entered before adding or applying a template with `messageLock` **true**, the email subject and message is overwritten with the locked email subject and message from the template.\n\n## Envelope Status\nThe status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope’s status changes. DocuSign limits polling to once every 15 minutes or less frequently.\n\nWhen a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message. \n\nSee the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.\n\n## Webhook Options\nThe two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client. \n\n### eventNotification Webhooks\nThe Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.\n\n### Connect Webhooks\nConnect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc. \n\nConnect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting “Go to Admin” from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.\n\nConnect is available for some DocuSign account types. Please contact DocuSign Sales for more information.\n\n## Composite Templates\n\nThe Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.\n\nEach Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.\n\n* The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the `compositeTemplateId` to which the document should be added. If `compositeTemplateId` is not specified in the content-disposition, the document is applied based on the `documentId` only. If no document object is specified, the composite template inherits the first document.\n\n* Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.\n\nPDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set `transformPdfFields` to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.\n\n* PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.\n\n### Compositing the definitions\nEach Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:\n\n* Templates are overlaid in the order of their Sequence value.\n* If Document is not passed into the Composite Template’s `document` field, the *first* template’s document (based on the template’s Sequence value) is used.\n* Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.\n\nFor example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.\n\n* Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.\n\n* If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.\n\n* Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.\n\nFor example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.\n\n* roleName and tabLabel matching is case sensitive.\n\n* The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.\n\n* You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with “\*” and then the system matches tabs that start with the label.\n\n* If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)\n\n### Including the Document Content for Composite Templates\nDocument content can be supplied inline, using the `documentBase64` or can be included in a multi-part HTTP message. \nIf a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the `compositeTemplateId` to which the document should be added. Using the `compositeTemplateId` sets which documents are associated with particular composite templates. An example of this usage is:\n\n```\n   --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d\n   Content-Type: application/pdf\n   Content-Disposition: file; filename=\&quot;eula.pdf\&quot;; documentId=1; compositeTemplateId=\&quot;1\&quot;\n   Content-Transfer-Encoding: base64\n```\n\n### PDF Form Field Transformation\nOnly the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text\n\nField Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.\n\nWhen transforming a *PDF Form Digital Signature Field,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\n\nAny other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab\n\nWhen transforming *PDF Form Text Fields,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\nDocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID\nDocuSignCompany or eSignCompany | Company\nDocuSignDateSigned or eSignDateSigned | Date Signed\nDocuSignTitle or eSignTitle | Title\nDocuSignFullName or eSignFullName |  Full Name\nDocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment\n\nAny other PDF Form Text Field will be transformed to a DocuSign data (text) tab.\n\nPDF Form Field Names that include “DocuSignIgnoreTransform” or “eSignIgnoreTransform” will not be transformed.\n\nPDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.\n\n## Template Email Subject Merge Fields\nThis feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.\n\nThe merge fields, based on the recipient’s `roleName`, are added to the `emailSubject` when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.\n\nBoth the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.\n\nIf merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.\n\n* To add a recipient’s name in the subject line add the following text in the `emailSubject` when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_UserName]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,`\n\n* To add a recipient’s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_Email]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,`\n\nIn both cases the &lt;roleName&gt; is the recipient’s `roleName` in the template.\n\nFor cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.\n\n## Branding an envelope\nThe following rules are used to determine the `brandId` used in an envelope:\n\n* If a `brandId` is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope.\n* If more than one template is used in an envelope and more than one `brandId` is specified, the first `brandId` specified is used throughout the envelope.\n* In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account’s default signing brand is used.\n* For envelopes that do not meet any of the previous criteria, the account’s default signing brand is used for the envelope.\n\n## BCC Email address feature \nThe BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don’t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.\n\n## Merge Recipient Roles for Draft Envelopes\nWhen an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.\n\nTo prevent this, the query parameter `merge_roles_on_draft` should be added when posting a draft envelope (status=created) with multiple templates. Doing this will merge template roles and remove empty recipients.\n\n###### Note: DocuSign recommends that the `merge_roles_on_draft` query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
   * @param accountId The external account number (int) or account ID Guid.
   * @param EnvelopesApi.CreateEnvelopeOptions Options for modifying the method behavior.
   * @return EnvelopeSummary
   */
  public EnvelopeSummary createEnvelope(String accountId, EnvelopeDefinition envelopeDefinition, EnvelopesApi.CreateEnvelopeOptions options) throws ApiException {
  
    Object postBody = envelopeDefinition;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelope");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "cdse_mode", options.cdseMode));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "completed_documents_only", options.completedDocumentsOnly));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "merge_roles_on_draft", options.mergeRolesOnDraft));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<EnvelopeSummary> returnType = new GenericType<EnvelopeSummary>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the envelope status for the specified envelopes. Retrieves the envelope status for the specified envelopes.
  /// </summary>
  public class ListStatusOptions
  {
	
	private String email = null;
	
	private String fromDate = null;
	
	private String startPosition = null;
	
	private String toDate = null;
	
	
	/*
	 * 
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	/*
	 * 
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
	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}
	
	public String getStartPosition() {
		return this.startPosition;
	}
	
	/*
	 * 
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public String getToDate() {
		return this.toDate;
	}
	
  }

   /**
   * Gets the envelope status for the specified envelopes.
   * Retrieves the envelope status for the specified envelopes.
   * @param accountId The external account number (int) or account ID Guid.
   * @return EnvelopesInformation
   */ 
  public EnvelopesInformation listStatus(String accountId, EnvelopeIdsRequest envelopeIdsRequest) throws ApiException {
    return listStatus(accountId, envelopeIdsRequest, null);
  }
  
  
  /**
   * Gets the envelope status for the specified envelopes.
   * Retrieves the envelope status for the specified envelopes.
   * @param accountId The external account number (int) or account ID Guid.
   * @param EnvelopesApi.ListStatusOptions Options for modifying the method behavior.
   * @return EnvelopesInformation
   */
  public EnvelopesInformation listStatus(String accountId, EnvelopeIdsRequest envelopeIdsRequest, EnvelopesApi.ListStatusOptions options) throws ApiException {
  
    Object postBody = envelopeIdsRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listStatus");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "email", options.email));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
	 
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

    
    GenericType<EnvelopesInformation> returnType = new GenericType<EnvelopesInformation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the status of a envelope. Retrieves the overall status for the specified envelope.
  /// </summary>
  public class GetEnvelopeOptions
  {
	
	private String advancedUpdate = null;
	
	private String include = null;
	
	
	/*
	 * When true, envelope information can be added or modified. 
	 */
	public void setAdvancedUpdate(String advancedUpdate) {
		this.advancedUpdate = advancedUpdate;
	}
	
	public String getAdvancedUpdate() {
		return this.advancedUpdate;
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
	
  }

   /**
   * Gets the status of a envelope.
   * Retrieves the overall status for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @return Envelope
   */ 
  public Envelope getEnvelope(String accountId, String envelopeId) throws ApiException {
    return getEnvelope(accountId, envelopeId, null);
  }
  
  
  /**
   * Gets the status of a envelope.
   * Retrieves the overall status for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.GetEnvelopeOptions Options for modifying the method behavior.
   * @return Envelope
   */
  public Envelope getEnvelope(String accountId, String envelopeId, EnvelopesApi.GetEnvelopeOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelope");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelope");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "advanced_update", options.advancedUpdate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<Envelope> returnType = new GenericType<Envelope>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft The Put Envelopes endpoint provides the following functionality:\n\n* Sends the specified single draft envelope.\nAdd {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.\n\n* Voids the specified in-process envelope.\nAdd {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.\n\n* Replaces the current email subject and message for a draft envelope.\nAdd {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.\n\n* Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system.\nAdd {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.\n\n*Additional information on purging documents*\n\nThe purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).\n\n###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period. \n###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents. \n###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.\n\nWhen the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.\n\nIf `purgeState=\&quot;documents_queued\&quot;` is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If `purgeState= \&quot;documents_and_metadata_queued\&quot;` is used in the request, then the documents, attachments, and tabs are deleted.
  /// </summary>
  public class UpdateOptions
  {
	
	private String advancedUpdate = null;
	
	private String resendEnvelope = null;
	
	
	/*
	 * When set to **true**, allows the caller to update recipients, tabs, custom fields, notification, email settings and other envelope attributes. 
	 */
	public void setAdvancedUpdate(String advancedUpdate) {
		this.advancedUpdate = advancedUpdate;
	}
	
	public String getAdvancedUpdate() {
		return this.advancedUpdate;
	}
	
	/*
	 * When set to **true**, sends the specified envelope again. 
	 */
	public void setResendEnvelope(String resendEnvelope) {
		this.resendEnvelope = resendEnvelope;
	}
	
	public String getResendEnvelope() {
		return this.resendEnvelope;
	}
	
  }

   /**
   * Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft
   * The Put Envelopes endpoint provides the following functionality:\n\n* Sends the specified single draft envelope.\nAdd {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.\n\n* Voids the specified in-process envelope.\nAdd {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.\n\n* Replaces the current email subject and message for a draft envelope.\nAdd {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.\n\n* Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system.\nAdd {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.\n\n*Additional information on purging documents*\n\nThe purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).\n\n###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period. \n###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents. \n###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.\n\nWhen the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.\n\nIf `purgeState=\&quot;documents_queued\&quot;` is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If `purgeState= \&quot;documents_and_metadata_queued\&quot;` is used in the request, then the documents, attachments, and tabs are deleted.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @return EnvelopeUpdateSummary
   */ 
  public EnvelopeUpdateSummary update(String accountId, String envelopeId, Envelope envelope) throws ApiException {
    return update(accountId, envelopeId, envelope, null);
  }
  
  
  /**
   * Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft
   * The Put Envelopes endpoint provides the following functionality:\n\n* Sends the specified single draft envelope.\nAdd {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.\n\n* Voids the specified in-process envelope.\nAdd {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.\n\n* Replaces the current email subject and message for a draft envelope.\nAdd {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.\n\n* Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system.\nAdd {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.\n\n*Additional information on purging documents*\n\nThe purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).\n\n###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period. \n###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents. \n###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.\n\nWhen the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.\n\nIf `purgeState=\&quot;documents_queued\&quot;` is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If `purgeState= \&quot;documents_and_metadata_queued\&quot;` is used in the request, then the documents, attachments, and tabs are deleted.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.UpdateOptions Options for modifying the method behavior.
   * @return EnvelopeUpdateSummary
   */
  public EnvelopeUpdateSummary update(String accountId, String envelopeId, Envelope envelope, EnvelopesApi.UpdateOptions options) throws ApiException {
  
    Object postBody = envelope;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling update");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling update");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "advanced_update", options.advancedUpdate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "resend_envelope", options.resendEnvelope));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<EnvelopeUpdateSummary> returnType = new GenericType<EnvelopeUpdateSummary>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Returns a list of attachments associated with the specified envelope
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.GetAttachmentsOptions Options for modifying the method behavior.
   * @return EnvelopeAttachmentsResult
   */
  public EnvelopeAttachmentsResult getAttachments(String accountId, String envelopeId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAttachments");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getAttachments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/attachments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EnvelopeAttachmentsResult> returnType = new GenericType<EnvelopeAttachmentsResult>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Add one or more attachments to a DRAFT or IN-PROCESS envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.PutAttachmentsOptions Options for modifying the method behavior.
   * @return EnvelopeAttachmentsResult
   */
  public EnvelopeAttachmentsResult putAttachments(String accountId, String envelopeId, EnvelopeAttachmentsRequest envelopeAttachmentsRequest) throws ApiException {
  
    Object postBody = envelopeAttachmentsRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling putAttachments");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling putAttachments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/attachments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EnvelopeAttachmentsResult> returnType = new GenericType<EnvelopeAttachmentsResult>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Delete one or more attachments from a DRAFT envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.DeleteAttachmentsOptions Options for modifying the method behavior.
   * @return EnvelopeAttachmentsResult
   */
  public EnvelopeAttachmentsResult deleteAttachments(String accountId, String envelopeId, EnvelopeAttachmentsRequest envelopeAttachmentsRequest) throws ApiException {
  
    Object postBody = envelopeAttachmentsRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAttachments");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteAttachments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/attachments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EnvelopeAttachmentsResult> returnType = new GenericType<EnvelopeAttachmentsResult>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Retrieves an attachment from the envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param attachmentId 
   * @param EnvelopesApi.GetAttachmentOptions Options for modifying the method behavior.
   * @return void
   */
  public void getAttachment(String accountId, String envelopeId, String attachmentId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAttachment");
     }
     
     // verify the required parameter 'attachmentId' is set
     if (attachmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling getAttachment");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getAttachment");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/attachments/{attachmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

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

    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Add an attachment to a DRAFT or IN-PROCESS envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param attachmentId 
   * @param EnvelopesApi.PutAttachmentOptions Options for modifying the method behavior.
   * @return EnvelopeAttachmentsResult
   */
  public EnvelopeAttachmentsResult putAttachment(String accountId, String envelopeId, String attachmentId, Attachment attachment) throws ApiException {
  
    Object postBody = attachment;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling putAttachment");
     }
     
     // verify the required parameter 'attachmentId' is set
     if (attachmentId == null) {
        throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling putAttachment");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling putAttachment");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/attachments/{attachmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

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

    
    GenericType<EnvelopeAttachmentsResult> returnType = new GenericType<EnvelopeAttachmentsResult>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets the envelope audit events for an envelope.
   * Gets the envelope audit events for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.ListAuditEventsOptions Options for modifying the method behavior.
   * @return EnvelopeAuditEventResponse
   */
  public EnvelopeAuditEventResponse listAuditEvents(String accountId, String envelopeId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listAuditEvents");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listAuditEvents");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/audit_events".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EnvelopeAuditEventResponse> returnType = new GenericType<EnvelopeAuditEventResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets the custom field information for the specified envelope.
   * Retrieves the custom field information for the specified envelope. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes, and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.\n\nThere are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. With a list custom field, the sender selects the value of the field from a pre-made list.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.ListCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFieldsEnvelope
   */
  public CustomFieldsEnvelope listCustomFields(String accountId, String envelopeId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomFields");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<CustomFieldsEnvelope> returnType = new GenericType<CustomFieldsEnvelope>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates envelope custom fields in an envelope.
   * Updates the envelope custom fields in draft and in-process envelopes.\n\nEach custom field used in an envelope must have a unique name.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.UpdateCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields updateCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
  
    Object postBody = customFields;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateCustomFields");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<CustomFields> returnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates envelope custom fields for an envelope.
   * Updates the envelope custom fields for draft and in-process envelopes.\n\nEach custom field used in an envelope must have a unique name.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.CreateCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields createCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
  
    Object postBody = customFields;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createCustomFields");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<CustomFields> returnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes envelope custom fields for draft and in-process envelopes.
   * Deletes envelope custom fields for draft and in-process envelopes.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.DeleteCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields deleteCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
  
    Object postBody = customFields;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCustomFields");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<CustomFields> returnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets a list of envelope documents. Retrieves a list of documents associated with the specified envelope.
  /// </summary>
  public class ListDocumentsOptions
  {
	
	private String includeMetadata = null;
	
	
	/*
	 * 
	 */
	public void setIncludeMetadata(String includeMetadata) {
		this.includeMetadata = includeMetadata;
	}
	
	public String getIncludeMetadata() {
		return this.includeMetadata;
	}
	
  }

   /**
   * Gets a list of envelope documents.
   * Retrieves a list of documents associated with the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @return EnvelopeDocumentsResult
   */ 
  public EnvelopeDocumentsResult listDocuments(String accountId, String envelopeId) throws ApiException {
    return listDocuments(accountId, envelopeId, null);
  }
  
  
  /**
   * Gets a list of envelope documents.
   * Retrieves a list of documents associated with the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.ListDocumentsOptions Options for modifying the method behavior.
   * @return EnvelopeDocumentsResult
   */
  public EnvelopeDocumentsResult listDocuments(String accountId, String envelopeId, EnvelopesApi.ListDocumentsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocuments");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listDocuments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include_metadata", options.includeMetadata));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<EnvelopeDocumentsResult> returnType = new GenericType<EnvelopeDocumentsResult>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Adds one or more documents to an existing envelope document. Adds one or more documents to an existing envelope document.
  /// </summary>
  public class UpdateDocumentsOptions
  {
	
	private String applyDocumentFields = null;
	
	
	/*
	 * When true, Document fields can be added or modified while adding or modifying envelope documents. 
	 */
	public void setApplyDocumentFields(String applyDocumentFields) {
		this.applyDocumentFields = applyDocumentFields;
	}
	
	public String getApplyDocumentFields() {
		return this.applyDocumentFields;
	}
	
  }

   /**
   * Adds one or more documents to an existing envelope document.
   * Adds one or more documents to an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @return EnvelopeDocumentsResult
   */ 
  public EnvelopeDocumentsResult updateDocuments(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    return updateDocuments(accountId, envelopeId, envelopeDefinition, null);
  }
  
  
  /**
   * Adds one or more documents to an existing envelope document.
   * Adds one or more documents to an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.UpdateDocumentsOptions Options for modifying the method behavior.
   * @return EnvelopeDocumentsResult
   */
  public EnvelopeDocumentsResult updateDocuments(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition, EnvelopesApi.UpdateDocumentsOptions options) throws ApiException {
  
    Object postBody = envelopeDefinition;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocuments");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocuments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "apply_document_fields", options.applyDocumentFields));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<EnvelopeDocumentsResult> returnType = new GenericType<EnvelopeDocumentsResult>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes documents from a draft envelope.
   * Deletes one or more documents from an existing draft envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.DeleteDocumentsOptions Options for modifying the method behavior.
   * @return EnvelopeDocumentsResult
   */
  public EnvelopeDocumentsResult deleteDocuments(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition) throws ApiException {
  
    Object postBody = envelopeDefinition;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocuments");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocuments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EnvelopeDocumentsResult> returnType = new GenericType<EnvelopeDocumentsResult>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets a document from an envelope. Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.\n\nYou can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted. \n\nTo retrieve the combined content replace the `{documentId}` parameter in the endpoint with `combined`.\n/accounts/{accountId}/envelopes/{envelopeId}/documents/combined
  /// </summary>
  public class GetDocumentOptions
  {
	
	private String certificate = null;
	
	private String encoding = null;
	
	private String encrypt = null;
	
	private String language = null;
	
	private String recipientId = null;
	
	private String showChanges = null;
	
	private String watermark = null;
	
	
	/*
	 * When set to **false**, the envelope signing certificate is removed from the download. 
	 */
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
	public String getCertificate() {
		return this.certificate;
	}
	
	/*
	 * 
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	
	public String getEncoding() {
		return this.encoding;
	}
	
	/*
	 * When set to **true**, the PDF bytes returned in the response are encrypted for all the key managers configured on your DocuSign account. The documents can be decrypted with the KeyManager Decrypt Document API. 
	 */
	public void setEncrypt(String encrypt) {
		this.encrypt = encrypt;
	}
	
	public String getEncrypt() {
		return this.encrypt;
	}
	
	/*
	 * Specifies the language for the Certificate of Completion in the response. The supported languages, with the language value shown in parenthesis, are: Chinese Simplified (zh_CN), , Chinese Traditional (zh_TW), Dutch (nl), English US (en), French (fr), German (de), Italian (it), Japanese (ja), Korean (ko), Portuguese (pt), Portuguese (Brazil) (pt_BR), Russian (ru), Spanish (es). 
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	/*
	 * 
	 */
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}
	
	public String getRecipientId() {
		return this.recipientId;
	}
	
	/*
	 * When set to **true**, any changed fields for the returned PDF are highlighted in yellow and optional signatures or initials outlined in red. 
	 */
	public void setShowChanges(String showChanges) {
		this.showChanges = showChanges;
	}
	
	public String getShowChanges() {
		return this.showChanges;
	}
	
	/*
	 * When set to **true**, the account has the watermark feature enabled, and the envelope is not complete, the watermark for the account is added to the PDF documents. This option can remove the watermark. 
	 */
	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}
	
	public String getWatermark() {
		return this.watermark;
	}
	
  }

   /**
   * Gets a document from an envelope.
   * Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.\n\nYou can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted. \n\nTo retrieve the combined content replace the `{documentId}` parameter in the endpoint with `combined`.\n/accounts/{accountId}/envelopes/{envelopeId}/documents/combined
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @return byte[]
   */ 
  public byte[] getDocument(String accountId, String envelopeId, String documentId) throws ApiException {
    return getDocument(accountId, envelopeId, documentId, null);
  }
  
  
  /**
   * Gets a document from an envelope.
   * Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.\n\nYou can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted. \n\nTo retrieve the combined content replace the `{documentId}` parameter in the endpoint with `combined`.\n/accounts/{accountId}/envelopes/{envelopeId}/documents/combined
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param EnvelopesApi.GetDocumentOptions Options for modifying the method behavior.
   * @return byte[]
   */
  public byte[] getDocument(String accountId, String envelopeId, String documentId, EnvelopesApi.GetDocumentOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocument");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocument");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getDocument");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "certificate", options.certificate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "encoding", options.encoding));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "encrypt", options.encrypt));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "language", options.language));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "recipient_id", options.recipientId));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "show_changes", options.showChanges));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "watermark", options.watermark));
	 
    }

    final String[] accepts = {
      "application/pdf"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<byte[]> returnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Adds a document to an existing draft envelope. Adds a document to an existing draft envelope.
  /// </summary>
  public class UpdateDocumentOptions
  {
	
	private String applyDocumentFields = null;
	
	
	/*
	 * 
	 */
	public void setApplyDocumentFields(String applyDocumentFields) {
		this.applyDocumentFields = applyDocumentFields;
	}
	
	public String getApplyDocumentFields() {
		return this.applyDocumentFields;
	}
	
  }

   /**
   * Adds a document to an existing draft envelope.
   * Adds a document to an existing draft envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @return void
   */ 
  public void updateDocument(String accountId, String envelopeId, String documentId) throws ApiException {
  updateDocument(accountId, envelopeId, documentId, null);
  }
  
  
  /**
   * Adds a document to an existing draft envelope.
   * Adds a document to an existing draft envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param EnvelopesApi.UpdateDocumentOptions Options for modifying the method behavior.
   * @return void
   */
  public void updateDocument(String accountId, String envelopeId, String documentId, EnvelopesApi.UpdateDocumentOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocument");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocument");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocument");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "apply_document_fields", options.applyDocumentFields));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Gets the custom document fields from an  existing envelope document.
   * Retrieves the custom document field information from an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param EnvelopesApi.ListDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation listDocumentFields(String accountId, String envelopeId, String documentId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocumentFields");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling listDocumentFields");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listDocumentFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    
    GenericType<DocumentFieldsInformation> returnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates existing custom document fields in an existing envelope document.
   * Updates existing custom document fields in an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param EnvelopesApi.UpdateDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation updateDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
  
    Object postBody = documentFieldsInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocumentFields");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocumentFields");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocumentFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    
    GenericType<DocumentFieldsInformation> returnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Creates custom document fields in an existing envelope document.
   * Creates custom document fields in an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param EnvelopesApi.CreateDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation createDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
  
    Object postBody = documentFieldsInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createDocumentFields");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling createDocumentFields");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createDocumentFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    
    GenericType<DocumentFieldsInformation> returnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes custom document fields from an existing envelope document.
   * Deletes custom document fields from an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param EnvelopesApi.DeleteDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation deleteDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
  
    Object postBody = documentFieldsInformation;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentFields");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocumentFields");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocumentFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    
    GenericType<DocumentFieldsInformation> returnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes a page from a document in an envelope.
   * Deletes a page from a document in an envelope based on the page number.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param pageNumber The page number being accessed.
   * @param EnvelopesApi.DeleteDocumentPageOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteDocumentPage(String accountId, String envelopeId, String documentId, String pageNumber) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentPage");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocumentPage");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocumentPage");
     }
     
     // verify the required parameter 'pageNumber' is set
     if (pageNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling deleteDocumentPage");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  /// <summary>
  /// Gets a page image from an envelope for display. Retrieves a page image for display from the specified envelope.
  /// </summary>
  public class GetDocumentPageImageOptions
  {
	
	private String dpi = null;
	
	private String maxHeight = null;
	
	private String maxWidth = null;
	
	private String showChanges = null;
	
	
	/*
	 * Sets the dpi for the image. 
	 */
	public void setDpi(String dpi) {
		this.dpi = dpi;
	}
	
	public String getDpi() {
		return this.dpi;
	}
	
	/*
	 * Sets the maximum height for the page image in pixels. The dpi is recalculated based on this setting. 
	 */
	public void setMaxHeight(String maxHeight) {
		this.maxHeight = maxHeight;
	}
	
	public String getMaxHeight() {
		return this.maxHeight;
	}
	
	/*
	 * Sets the maximum width for the page image in pixels. The dpi is recalculated based on this setting. 
	 */
	public void setMaxWidth(String maxWidth) {
		this.maxWidth = maxWidth;
	}
	
	public String getMaxWidth() {
		return this.maxWidth;
	}
	
	/*
	 * 
	 */
	public void setShowChanges(String showChanges) {
		this.showChanges = showChanges;
	}
	
	public String getShowChanges() {
		return this.showChanges;
	}
	
  }

   /**
   * Gets a page image from an envelope for display.
   * Retrieves a page image for display from the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param pageNumber The page number being accessed.
   * @return byte[]
   */ 
  public byte[] getDocumentPageImage(String accountId, String envelopeId, String documentId, String pageNumber) throws ApiException {
    return getDocumentPageImage(accountId, envelopeId, documentId, pageNumber, null);
  }
  
  
  /**
   * Gets a page image from an envelope for display.
   * Retrieves a page image for display from the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param pageNumber The page number being accessed.
   * @param EnvelopesApi.GetDocumentPageImageOptions Options for modifying the method behavior.
   * @return byte[]
   */
  public byte[] getDocumentPageImage(String accountId, String envelopeId, String documentId, String pageNumber, EnvelopesApi.GetDocumentPageImageOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocumentPageImage");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocumentPageImage");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getDocumentPageImage");
     }
     
     // verify the required parameter 'pageNumber' is set
     if (pageNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling getDocumentPageImage");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}/page_image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "dpi", options.dpi));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "max_height", options.maxHeight));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "max_width", options.maxWidth));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "show_changes", options.showChanges));
	 
    }

    final String[] accepts = {
      "image/png"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<byte[]> returnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Rotates page image from an envelope for display.
   * Rotates page image from an envelope for display. The page image can be rotated to the left or right.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param pageNumber The page number being accessed.
   * @param EnvelopesApi.RotateDocumentPageOptions Options for modifying the method behavior.
   * @return void
   */
  public void rotateDocumentPage(String accountId, String envelopeId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
  
    Object postBody = pageRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling rotateDocumentPage");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling rotateDocumentPage");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling rotateDocumentPage");
     }
     
     // verify the required parameter 'pageNumber' is set
     if (pageNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling rotateDocumentPage");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}/page_image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  /// <summary>
  /// Gets the templates associated with a document in an existing envelope. Retrieves the templates associated with a document in the specified envelope.
  /// </summary>
  public class ListTemplatesForDocumentOptions
  {
	
	private String include = null;
	
	
	/*
	 * 
	 */
	public void setInclude(String include) {
		this.include = include;
	}
	
	public String getInclude() {
		return this.include;
	}
	
  }

   /**
   * Gets the templates associated with a document in an existing envelope.
   * Retrieves the templates associated with a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @return TemplateInformation
   */ 
  public TemplateInformation listTemplatesForDocument(String accountId, String envelopeId, String documentId) throws ApiException {
    return listTemplatesForDocument(accountId, envelopeId, documentId, null);
  }
  
  
  /**
   * Gets the templates associated with a document in an existing envelope.
   * Retrieves the templates associated with a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param EnvelopesApi.ListTemplatesForDocumentOptions Options for modifying the method behavior.
   * @return TemplateInformation
   */
  public TemplateInformation listTemplatesForDocument(String accountId, String envelopeId, String documentId, EnvelopesApi.ListTemplatesForDocumentOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTemplatesForDocument");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling listTemplatesForDocument");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listTemplatesForDocument");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<TemplateInformation> returnType = new GenericType<TemplateInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Adds templates to a document in an  envelope.
   * Adds templates to a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param EnvelopesApi.ApplyTemplateToDocumentOptions Options for modifying the method behavior.
   * @return DocumentTemplateList
   */
  public DocumentTemplateList applyTemplateToDocument(String accountId, String envelopeId, String documentId, DocumentTemplateList documentTemplateList) throws ApiException {
  
    Object postBody = documentTemplateList;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling applyTemplateToDocument");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling applyTemplateToDocument");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling applyTemplateToDocument");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    
    GenericType<DocumentTemplateList> returnType = new GenericType<DocumentTemplateList>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes a template from a document in an existing envelope.
   * Deletes the specified template from a document in an existing envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param documentId The ID of the document being accessed.
   * @param templateId The ID of the template being accessed.
   * @param EnvelopesApi.DeleteTemplatesFromDocumentOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteTemplatesFromDocument(String accountId, String envelopeId, String documentId, String templateId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTemplatesFromDocument");
     }
     
     // verify the required parameter 'documentId' is set
     if (documentId == null) {
        throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteTemplatesFromDocument");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteTemplatesFromDocument");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplatesFromDocument");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Gets the email setting overrides for an envelope.
   * Retrieves the email override settings for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.GetEmailSettingsOptions Options for modifying the method behavior.
   * @return EmailSettings
   */
  public EmailSettings getEmailSettings(String accountId, String envelopeId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEmailSettings");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEmailSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EmailSettings> returnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates the email setting overrides for an envelope.
   * Updates the existing email override settings for the specified envelope. Note that modifying email settings will only affect email communications that occur after the modification was made.\n\nThis can also be used to delete an individual email override setting by using an empty string for the value to be deleted.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.UpdateEmailSettingsOptions Options for modifying the method behavior.
   * @return EmailSettings
   */
  public EmailSettings updateEmailSettings(String accountId, String envelopeId, EmailSettings emailSettings) throws ApiException {
  
    Object postBody = emailSettings;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEmailSettings");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateEmailSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EmailSettings> returnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Adds email setting overrides to an envelope.
   * Adds email override settings, changing the email address to reply to an email address, name, or the BCC for email archive information, for the envelope. Note that adding email settings will only affect email communications that occur after the addition was made.\n\n### Important: The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, use a Carbon Copies or Certified Deliveries Recipient Type.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.CreateEmailSettingsOptions Options for modifying the method behavior.
   * @return EmailSettings
   */
  public EmailSettings createEmailSettings(String accountId, String envelopeId, EmailSettings emailSettings) throws ApiException {
  
    Object postBody = emailSettings;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEmailSettings");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEmailSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EmailSettings> returnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes the email setting overrides for an envelope.
   * Deletes all existing email override settings for the envelope. If you want to delete an individual email override setting, use the PUT and set the value to an empty string. Note that deleting email settings will only affect email communications that occur after the deletion and the normal account email settings are used for future email communications.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.DeleteEmailSettingsOptions Options for modifying the method behavior.
   * @return EmailSettings
   */
  public EmailSettings deleteEmailSettings(String accountId, String envelopeId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEmailSettings");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteEmailSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EmailSettings> returnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Returns envelope form data for an existing envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.GetFormDataOptions Options for modifying the method behavior.
   * @return EnvelopeFormData
   */
  public EnvelopeFormData getFormData(String accountId, String envelopeId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFormData");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getFormData");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/form_data".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EnvelopeFormData> returnType = new GenericType<EnvelopeFormData>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets envelope lock information.
   * Retrieves general information about the envelope lock.\n\nIf the call is made by the locked by user and the request has the same integrator key as original, then the `X-DocuSign-Edit` header and additional lock information is included in the response. This allows users to recover a lost editing session token and the `X-DocuSign-Edit` header.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.GetLockOptions Options for modifying the method behavior.
   * @return LockInformation
   */
  public LockInformation getLock(String accountId, String envelopeId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getLock");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getLock");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<LockInformation> returnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates an envelope lock.
   * Updates the lock duration time or update the `lockedByApp` property information for the specified envelope. The user and integrator key must match the user specified by the `lockByUser` property and integrator key information and the `X-DocuSign-Edit` header must be included or an error will be generated.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.UpdateLockOptions Options for modifying the method behavior.
   * @return LockInformation
   */
  public LockInformation updateLock(String accountId, String envelopeId, LockRequest lockRequest) throws ApiException {
  
    Object postBody = lockRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateLock");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateLock");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<LockInformation> returnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Lock an envelope.
   * Locks the specified envelope, and sets the time until the lock expires, to prevent other users or recipients from accessing and changing the envelope.\n\n###### Note: Users must have envelope locking capability enabled to use this function (userSetting `canLockEnvelopes` must be  set to true for the user).
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.CreateLockOptions Options for modifying the method behavior.
   * @return LockInformation
   */
  public LockInformation createLock(String accountId, String envelopeId, LockRequest lockRequest) throws ApiException {
  
    Object postBody = lockRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createLock");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createLock");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<LockInformation> returnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes an envelope lock.
   * Deletes the lock from the specified envelope. The `X-DocuSign-Edit` header must be included in the request.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.DeleteLockOptions Options for modifying the method behavior.
   * @return LockInformation
   */
  public LockInformation deleteLock(String accountId, String envelopeId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteLock");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteLock");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<LockInformation> returnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Gets envelope notification information.
   * Retrieves the envelope notification, reminders and expirations, information for an existing envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.GetNotificationSettingsOptions Options for modifying the method behavior.
   * @return Notification
   */
  public Notification getNotificationSettings(String accountId, String envelopeId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getNotificationSettings");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getNotificationSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/notification".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<Notification> returnType = new GenericType<Notification>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Sets envelope notification (Reminders/Expirations) structure for an existing envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.UpdateNotificationSettingsOptions Options for modifying the method behavior.
   * @return Notification
   */
  public Notification updateNotificationSettings(String accountId, String envelopeId, EnvelopeNotificationRequest envelopeNotificationRequest) throws ApiException {
  
    Object postBody = envelopeNotificationRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateNotificationSettings");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateNotificationSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/notification".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<Notification> returnType = new GenericType<Notification>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the status of recipients for an envelope. Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list. \n\nThe `currentRoutingOrder` property of the response contains the `routingOrder` value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
  /// </summary>
  public class ListRecipientsOptions
  {
	
	private String includeAnchorTabLocations = null;
	
	private String includeExtended = null;
	
	private String includeMetadata = null;
	
	private String includeTabs = null;
	
	
	/*
	 * When set to **true** and `include_tabs` is set to **true**, all tabs with anchor tab properties are included in the response. 
	 */
	public void setIncludeAnchorTabLocations(String includeAnchorTabLocations) {
		this.includeAnchorTabLocations = includeAnchorTabLocations;
	}
	
	public String getIncludeAnchorTabLocations() {
		return this.includeAnchorTabLocations;
	}
	
	/*
	 * When set to **true**, the extended properties are included in the response. 
	 */
	public void setIncludeExtended(String includeExtended) {
		this.includeExtended = includeExtended;
	}
	
	public String getIncludeExtended() {
		return this.includeExtended;
	}
	
	/*
	 * 
	 */
	public void setIncludeMetadata(String includeMetadata) {
		this.includeMetadata = includeMetadata;
	}
	
	public String getIncludeMetadata() {
		return this.includeMetadata;
	}
	
	/*
	 * When set to **true**, the tab information associated with the recipient is included in the response. 
	 */
	public void setIncludeTabs(String includeTabs) {
		this.includeTabs = includeTabs;
	}
	
	public String getIncludeTabs() {
		return this.includeTabs;
	}
	
  }

   /**
   * Gets the status of recipients for an envelope.
   * Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list. \n\nThe `currentRoutingOrder` property of the response contains the `routingOrder` value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @return Recipients
   */ 
  public Recipients listRecipients(String accountId, String envelopeId) throws ApiException {
    return listRecipients(accountId, envelopeId, null);
  }
  
  
  /**
   * Gets the status of recipients for an envelope.
   * Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list. \n\nThe `currentRoutingOrder` property of the response contains the `routingOrder` value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.ListRecipientsOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients listRecipients(String accountId, String envelopeId, EnvelopesApi.ListRecipientsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listRecipients");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include_anchor_tab_locations", options.includeAnchorTabLocations));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_extended", options.includeExtended));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_metadata", options.includeMetadata));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_tabs", options.includeTabs));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<Recipients> returnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Updates recipients in a draft envelope or corrects recipient information for an in process envelope. Updates recipients in a draft envelope or corrects recipient information for an in process envelope. \n\nFor draft envelopes, you can edit the following properties: `email`, `userName`, `routingOrder`, `faxNumber`, `deliveryMethod`, `accessCode`, and `requireIdLookup`.\n\nOnce an envelope has been sent, you can only edit: `email`, `userName`, `signerName`, `routingOrder`, `faxNumber`, and `deliveryMethod`. You can also select to resend an envelope by using the `resend_envelope` option.\n\nIf you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
  /// </summary>
  public class UpdateRecipientsOptions
  {
	
	private String resendEnvelope = null;
	
	
	/*
	 * When set to **true**, resends the   envelope if the new recipient&#39;s routing order is before or the same as the envelope’s next recipient. 
	 */
	public void setResendEnvelope(String resendEnvelope) {
		this.resendEnvelope = resendEnvelope;
	}
	
	public String getResendEnvelope() {
		return this.resendEnvelope;
	}
	
  }

   /**
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope. \n\nFor draft envelopes, you can edit the following properties: `email`, `userName`, `routingOrder`, `faxNumber`, `deliveryMethod`, `accessCode`, and `requireIdLookup`.\n\nOnce an envelope has been sent, you can only edit: `email`, `userName`, `signerName`, `routingOrder`, `faxNumber`, and `deliveryMethod`. You can also select to resend an envelope by using the `resend_envelope` option.\n\nIf you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @return RecipientsUpdateSummary
   */ 
  public RecipientsUpdateSummary updateRecipients(String accountId, String envelopeId, Recipients recipients) throws ApiException {
    return updateRecipients(accountId, envelopeId, recipients, null);
  }
  
  
  /**
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope. \n\nFor draft envelopes, you can edit the following properties: `email`, `userName`, `routingOrder`, `faxNumber`, `deliveryMethod`, `accessCode`, and `requireIdLookup`.\n\nOnce an envelope has been sent, you can only edit: `email`, `userName`, `signerName`, `routingOrder`, `faxNumber`, and `deliveryMethod`. You can also select to resend an envelope by using the `resend_envelope` option.\n\nIf you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.UpdateRecipientsOptions Options for modifying the method behavior.
   * @return RecipientsUpdateSummary
   */
  public RecipientsUpdateSummary updateRecipients(String accountId, String envelopeId, Recipients recipients, EnvelopesApi.UpdateRecipientsOptions options) throws ApiException {
  
    Object postBody = recipients;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipients");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "resend_envelope", options.resendEnvelope));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<RecipientsUpdateSummary> returnType = new GenericType<RecipientsUpdateSummary>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Adds one or more recipients to an envelope. Adds one or more recipients to an envelope.\n\nFor an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional `resend_envelope` query string is set to **true**.
  /// </summary>
  public class CreateRecipientOptions
  {
	
	private String resendEnvelope = null;
	
	
	/*
	 * When set to **true**, resends the   envelope if the new recipient&#39;s routing order is before or the same as the envelope’s next recipient. 
	 */
	public void setResendEnvelope(String resendEnvelope) {
		this.resendEnvelope = resendEnvelope;
	}
	
	public String getResendEnvelope() {
		return this.resendEnvelope;
	}
	
  }

   /**
   * Adds one or more recipients to an envelope.
   * Adds one or more recipients to an envelope.\n\nFor an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional `resend_envelope` query string is set to **true**.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @return Recipients
   */ 
  public Recipients createRecipient(String accountId, String envelopeId, Recipients recipients) throws ApiException {
    return createRecipient(accountId, envelopeId, recipients, null);
  }
  
  
  /**
   * Adds one or more recipients to an envelope.
   * Adds one or more recipients to an envelope.\n\nFor an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional `resend_envelope` query string is set to **true**.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.CreateRecipientOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients createRecipient(String accountId, String envelopeId, Recipients recipients, EnvelopesApi.CreateRecipientOptions options) throws ApiException {
  
    Object postBody = recipients;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipient");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipient");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "resend_envelope", options.resendEnvelope));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<Recipients> returnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes recipients from an envelope.
   * Deletes one or more recipients from a draft or sent envelope. Recipients to be deleted are listed in the request, with the `recipientId` being used as the key for deleting recipients.\n\nIf the envelope is `In Process`, meaning that it has been sent and has not  been completed or voided, recipients that have completed their actions cannot be deleted.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.DeleteRecipientsOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients deleteRecipients(String accountId, String envelopeId, Recipients recipients) throws ApiException {
  
    Object postBody = recipients;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipients");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<Recipients> returnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.UpdateRecipientsDocumentVisibilityOptions Options for modifying the method behavior.
   * @return DocumentVisibilityList
   */
  public DocumentVisibilityList updateRecipientsDocumentVisibility(String accountId, String envelopeId, DocumentVisibilityList documentVisibilityList) throws ApiException {
  
    Object postBody = documentVisibilityList;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientsDocumentVisibility");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientsDocumentVisibility");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/document_visibility".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<DocumentVisibilityList> returnType = new GenericType<DocumentVisibilityList>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes a recipient from an envelope.
   * Deletes the specified recipient file from the specified envelope. This cannot be used if the envelope has been sent.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.DeleteRecipientOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients deleteRecipient(String accountId, String envelopeId, String recipientId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipient");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteRecipient");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteRecipient");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}".replaceAll("\\{format\\}","json")
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

    
    GenericType<Recipients> returnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the Electronic Record and Signature Disclosure associated with the account. Retrieves the Electronic Record and Signature Disclosure, with html formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
  /// </summary>
  public class GetConsumerDisclosureDefaultOptions
  {
	
	private String langCode = null;
	
	
	/*
	 * 
	 */
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}
	
	public String getLangCode() {
		return this.langCode;
	}
	
  }

   /**
   * Gets the Electronic Record and Signature Disclosure associated with the account.
   * Retrieves the Electronic Record and Signature Disclosure, with html formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @return ConsumerDisclosure
   */ 
  public ConsumerDisclosure getConsumerDisclosureDefault(String accountId, String envelopeId, String recipientId) throws ApiException {
    return getConsumerDisclosureDefault(accountId, envelopeId, recipientId, null);
  }
  
  
  /**
   * Gets the Electronic Record and Signature Disclosure associated with the account.
   * Retrieves the Electronic Record and Signature Disclosure, with html formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.GetConsumerDisclosureDefaultOptions Options for modifying the method behavior.
   * @return ConsumerDisclosure
   */
  public ConsumerDisclosure getConsumerDisclosureDefault(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetConsumerDisclosureDefaultOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConsumerDisclosureDefault");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getConsumerDisclosureDefault");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getConsumerDisclosureDefault");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/consumer_disclosure".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "langCode", options.langCode));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ConsumerDisclosure> returnType = new GenericType<ConsumerDisclosure>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Reserved: Gets the Electronic Record and Signature Disclosure associated with the account. Reserved: Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account.
  /// </summary>
  public class GetConsumerDisclosureOptions
  {
	
	private String langCode2 = null;
	
	
	/*
	 * 
	 */
	public void setLangCode2(String langCode2) {
		this.langCode2 = langCode2;
	}
	
	public String getLangCode2() {
		return this.langCode2;
	}
	
  }

   /**
   * Reserved: Gets the Electronic Record and Signature Disclosure associated with the account.
   * Reserved: Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to �browser� to automatically detect the browser language being used by the viewer and display the disclosure in that language.
   * @return ConsumerDisclosure
   */ 
  public ConsumerDisclosure getConsumerDisclosure(String accountId, String envelopeId, String recipientId, String langCode) throws ApiException {
    return getConsumerDisclosure(accountId, envelopeId, recipientId, langCode, null);
  }
  
  
  /**
   * Reserved: Gets the Electronic Record and Signature Disclosure associated with the account.
   * Reserved: Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to �browser� to automatically detect the browser language being used by the viewer and display the disclosure in that language.
   * @param EnvelopesApi.GetConsumerDisclosureOptions Options for modifying the method behavior.
   * @return ConsumerDisclosure
   */
  public ConsumerDisclosure getConsumerDisclosure(String accountId, String envelopeId, String recipientId, String langCode, EnvelopesApi.GetConsumerDisclosureOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConsumerDisclosure");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getConsumerDisclosure");
     }
     
     // verify the required parameter 'langCode' is set
     if (langCode == null) {
        throw new ApiException(400, "Missing the required parameter 'langCode' when calling getConsumerDisclosure");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getConsumerDisclosure");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/consumer_disclosure/{langCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()))
      .replaceAll("\\{" + "langCode" + "\\}", apiClient.escapeString(langCode.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "langCode", options.langCode2));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ConsumerDisclosure> returnType = new GenericType<ConsumerDisclosure>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Returns document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.GetRecipientDocumentVisibilityOptions Options for modifying the method behavior.
   * @return DocumentVisibilityList
   */
  public DocumentVisibilityList getRecipientDocumentVisibility(String accountId, String envelopeId, String recipientId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientDocumentVisibility");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientDocumentVisibility");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientDocumentVisibility");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/document_visibility".replaceAll("\\{format\\}","json")
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

    
    GenericType<DocumentVisibilityList> returnType = new GenericType<DocumentVisibilityList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.UpdateRecipientDocumentVisibilityOptions Options for modifying the method behavior.
   * @return DocumentVisibilityList
   */
  public DocumentVisibilityList updateRecipientDocumentVisibility(String accountId, String envelopeId, String recipientId, DocumentVisibilityList documentVisibilityList) throws ApiException {
  
    Object postBody = documentVisibilityList;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientDocumentVisibility");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientDocumentVisibility");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateRecipientDocumentVisibility");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/document_visibility".replaceAll("\\{format\\}","json")
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

    
    GenericType<DocumentVisibilityList> returnType = new GenericType<DocumentVisibilityList>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Gets the initials image for a user. Retrieves the initials image for the specified user. The image is returned in the same format as it was uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.\n\nThe userId specified in the endpoint must match the authenticated user&#39;s user id and the user must be a member of the account.\n\nThe `signatureIdOrName` paramter accepts signature ID or signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that do not properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint. \n\nFor example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;\n\nOlder envelopes might only contain chromed images. If getting the non-chromed image fails, try getting the chromed image.
  /// </summary>
  public class GetRecipientInitialsImageOptions
  {
	
	private String includeChrome = null;
	
	
	/*
	 * The added line and identifier around the initial image. Note: Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image. 
	 */
	public void setIncludeChrome(String includeChrome) {
		this.includeChrome = includeChrome;
	}
	
	public String getIncludeChrome() {
		return this.includeChrome;
	}
	
  }

   /**
   * Gets the initials image for a user.
   * Retrieves the initials image for the specified user. The image is returned in the same format as it was uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.\n\nThe userId specified in the endpoint must match the authenticated user&#39;s user id and the user must be a member of the account.\n\nThe `signatureIdOrName` paramter accepts signature ID or signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that do not properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint. \n\nFor example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;\n\nOlder envelopes might only contain chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @return byte[]
   */ 
  public byte[] getRecipientInitialsImage(String accountId, String envelopeId, String recipientId) throws ApiException {
    return getRecipientInitialsImage(accountId, envelopeId, recipientId, null);
  }
  
  
  /**
   * Gets the initials image for a user.
   * Retrieves the initials image for the specified user. The image is returned in the same format as it was uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.\n\nThe userId specified in the endpoint must match the authenticated user&#39;s user id and the user must be a member of the account.\n\nThe `signatureIdOrName` paramter accepts signature ID or signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that do not properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint. \n\nFor example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;\n\nOlder envelopes might only contain chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.GetRecipientInitialsImageOptions Options for modifying the method behavior.
   * @return byte[]
   */
  public byte[] getRecipientInitialsImage(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetRecipientInitialsImageOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientInitialsImage");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientInitialsImage");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientInitialsImage");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/initials_image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include_chrome", options.includeChrome));
	 
    }

    final String[] accepts = {
      "image/gif"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<byte[]> returnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Sets the initials image for an accountless signer.
   * Updates the initials image for a signer that does not have a DocuSign account. The supported image formats for this file are: gif, png, jpeg, and bmp. The file size must be less than 200K.\n\nFor the Authentication/Authorization for this call, the credentials must match the sender of the envelope, the recipient must be an accountless signer or in person signer. The account must have the `CanSendEnvelope` property set to **true** and the `ExpressSendOnly` property in `SendingUser` structure must be set to **false**.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.UpdateRecipientInitialsImageOptions Options for modifying the method behavior.
   * @return void
   */
  public void updateRecipientInitialsImage(String accountId, String envelopeId, String recipientId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientInitialsImage");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientInitialsImage");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateRecipientInitialsImage");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/initials_image".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Gets signature information for a signer or sign-in-person recipient.
   * Retrieves signature information for a signer or sign-in-person recipient.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.GetRecipientSignatureOptions Options for modifying the method behavior.
   * @return UserSignature
   */
  public UserSignature getRecipientSignature(String accountId, String envelopeId, String recipientId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientSignature");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientSignature");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientSignature");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature".replaceAll("\\{format\\}","json")
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

    
    GenericType<UserSignature> returnType = new GenericType<UserSignature>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Retrieve signature image information for a signer/sign-in-person recipient. Retrieves the specified user signature image. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.\n\nThe userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.\n\nThe `signatureIdOrName` parameter accepts signature ID or signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that don&#39;t properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint. \n\nFor example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;\n\nOlder envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
  /// </summary>
  public class GetRecipientSignatureImageOptions
  {
	
	private String includeChrome = null;
	
	
	/*
	 * When set to **true**, indicates the chromed version of the signature image should be retrieved. 
	 */
	public void setIncludeChrome(String includeChrome) {
		this.includeChrome = includeChrome;
	}
	
	public String getIncludeChrome() {
		return this.includeChrome;
	}
	
  }

   /**
   * Retrieve signature image information for a signer/sign-in-person recipient.
   * Retrieves the specified user signature image. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.\n\nThe userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.\n\nThe `signatureIdOrName` parameter accepts signature ID or signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that don&#39;t properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint. \n\nFor example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;\n\nOlder envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @return byte[]
   */ 
  public byte[] getRecipientSignatureImage(String accountId, String envelopeId, String recipientId) throws ApiException {
    return getRecipientSignatureImage(accountId, envelopeId, recipientId, null);
  }
  
  
  /**
   * Retrieve signature image information for a signer/sign-in-person recipient.
   * Retrieves the specified user signature image. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.\n\nThe userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.\n\nThe `signatureIdOrName` parameter accepts signature ID or signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that don&#39;t properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint. \n\nFor example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;\n\nOlder envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.GetRecipientSignatureImageOptions Options for modifying the method behavior.
   * @return byte[]
   */
  public byte[] getRecipientSignatureImage(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetRecipientSignatureImageOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientSignatureImage");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientSignatureImage");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientSignatureImage");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature_image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include_chrome", options.includeChrome));
	 
    }

    final String[] accepts = {
      "image/gif"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<byte[]> returnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Sets the signature image for an accountless signer.
   * Updates the signature image for an accountless signer. The supported image formats for this file are: gif, png, jpeg, and bmp. The file size must be less than 200K.\n\nFor the Authentication/Authorization for this call, the credentials must match the sender of the envelope, the recipient must be an accountless signer or in person signer. The account must have the `CanSendEnvelope` property set to **true** and the `ExpressSendOnly` property in `SendingUser` structure must be set to **false**.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.UpdateRecipientSignatureImageOptions Options for modifying the method behavior.
   * @return void
   */
  public void updateRecipientSignatureImage(String accountId, String envelopeId, String recipientId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientSignatureImage");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientSignatureImage");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateRecipientSignatureImage");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature_image".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  /// <summary>
  /// Gets the tabs information for a signer or sign-in-person recipient in an envelope. Retrieves information about the tabs associated with a recipient in a draft envelope.
  /// </summary>
  public class ListTabsOptions
  {
	
	private String includeAnchorTabLocations = null;
	
	private String includeMetadata = null;
	
	
	/*
	 * When set to **true**, all tabs with anchor tab properties are included in the response. 
	 */
	public void setIncludeAnchorTabLocations(String includeAnchorTabLocations) {
		this.includeAnchorTabLocations = includeAnchorTabLocations;
	}
	
	public String getIncludeAnchorTabLocations() {
		return this.includeAnchorTabLocations;
	}
	
	/*
	 * 
	 */
	public void setIncludeMetadata(String includeMetadata) {
		this.includeMetadata = includeMetadata;
	}
	
	public String getIncludeMetadata() {
		return this.includeMetadata;
	}
	
  }

   /**
   * Gets the tabs information for a signer or sign-in-person recipient in an envelope.
   * Retrieves information about the tabs associated with a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @return Tabs
   */ 
  public Tabs listTabs(String accountId, String envelopeId, String recipientId) throws ApiException {
    return listTabs(accountId, envelopeId, recipientId, null);
  }
  
  
  /**
   * Gets the tabs information for a signer or sign-in-person recipient in an envelope.
   * Retrieves information about the tabs associated with a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.ListTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs listTabs(String accountId, String envelopeId, String recipientId, EnvelopesApi.ListTabsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTabs");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listTabs");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling listTabs");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include_anchor_tab_locations", options.includeAnchorTabLocations));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "include_metadata", options.includeMetadata));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<Tabs> returnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates the tabs for a recipient.
   * Updates one or more tabs for a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.UpdateTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs updateTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
  
    Object postBody = tabs;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTabs");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateTabs");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateTabs");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
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

    
    GenericType<Tabs> returnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Adds tabs for a recipient.
   * Adds one or more tabs for a recipient.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.CreateTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs createTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
  
    Object postBody = tabs;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTabs");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createTabs");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling createTabs");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
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

    
    GenericType<Tabs> returnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes the tabs associated with a recipient.
   * Deletes one or more tabs associated with a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.DeleteTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs deleteTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
  
    Object postBody = tabs;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTabs");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteTabs");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteTabs");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
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

    
    GenericType<Tabs> returnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Get List of Templates used in an Envelope This returns a list of the server-side templates, their name and ID, used in an envelope.
  /// </summary>
  public class ListTemplatesOptions
  {
	
	private String include = null;
	
	
	/*
	 * The possible values are:  matching_applied – This returns template matching information for the template. 
	 */
	public void setInclude(String include) {
		this.include = include;
	}
	
	public String getInclude() {
		return this.include;
	}
	
  }

   /**
   * Get List of Templates used in an Envelope
   * This returns a list of the server-side templates, their name and ID, used in an envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @return TemplateInformation
   */ 
  public TemplateInformation listTemplates(String accountId, String envelopeId) throws ApiException {
    return listTemplates(accountId, envelopeId, null);
  }
  
  
  /**
   * Get List of Templates used in an Envelope
   * This returns a list of the server-side templates, their name and ID, used in an envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.ListTemplatesOptions Options for modifying the method behavior.
   * @return TemplateInformation
   */
  public TemplateInformation listTemplates(String accountId, String envelopeId, EnvelopesApi.ListTemplatesOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTemplates");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listTemplates");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/templates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
	 
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<TemplateInformation> returnType = new GenericType<TemplateInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Adds templates to an envelope.
   * Adds templates to the specified envelope.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.ApplyTemplateOptions Options for modifying the method behavior.
   * @return DocumentTemplateList
   */
  public DocumentTemplateList applyTemplate(String accountId, String envelopeId, DocumentTemplateList documentTemplateList) throws ApiException {
  
    Object postBody = documentTemplateList;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling applyTemplate");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling applyTemplate");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/templates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<DocumentTemplateList> returnType = new GenericType<DocumentTemplateList>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Returns a URL to the envelope correction UI.
   * Returns a URL that allows you to embed the envelope correction view of the DocuSign UI in your applications.\n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.CreateCorrectViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   */
  public ViewUrl createCorrectView(String accountId, String envelopeId, CorrectViewRequest correctViewRequest) throws ApiException {
  
    Object postBody = correctViewRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createCorrectView");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createCorrectView");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/correct".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<ViewUrl> returnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Returns a URL to the edit view UI.
   * Returns a URL that allows you to embed the edit view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign editing view. \n\nUpon sending completion, the user is returned to the return URL provided by the API application.\n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.CreateEditViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   */
  public ViewUrl createEditView(String accountId, String envelopeId, ReturnUrlRequest returnUrlRequest) throws ApiException {
  
    Object postBody = returnUrlRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEditView");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEditView");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/edit".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<ViewUrl> returnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Returns a URL to the recipient view UI.
   * Returns a URL that allows you to embed the recipient view of the DocuSign UI in your applications. This call cannot be used to view draft envelopes, since those envelopes have not been sent. \n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. \n\nAn entry is added into the Security Level section of the DocuSign Certificate of Completion that reflects the `securityDomain` and `authenticationMethod` properties used to verify the user identity.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.CreateRecipientViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   */
  public ViewUrl createRecipientView(String accountId, String envelopeId, RecipientViewRequest recipientViewRequest) throws ApiException {
  
    Object postBody = recipientViewRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipientView");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipientView");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/recipient".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<ViewUrl> returnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Returns a URL to the sender view UI.
   * Returns a URL that allows you to embed the sender view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign sending view. \n\nUpon sending completion, the user is returned to the return URL provided by the API application.\n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.CreateSenderViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   */
  public ViewUrl createSenderView(String accountId, String envelopeId, ReturnUrlRequest returnUrlRequest) throws ApiException {
  
    Object postBody = returnUrlRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createSenderView");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createSenderView");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/sender".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<ViewUrl> returnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Reserved: Returns a URL to the secure link view UI.
   * Reserved: Returns a URL that allows you to embed the secure link view of the DocuSign UI in your applications.
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.CreateViewLinkOptions Options for modifying the method behavior.
   * @return ViewUrl
   */
  public ViewUrl createViewLink(String accountId, String envelopeId, ViewLinkRequest viewLinkRequest) throws ApiException {
  
    Object postBody = viewLinkRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createViewLink");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createViewLink");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/viewlink".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<ViewUrl> returnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Reserved: Expires a secure view link.
   * Reserved: Expires a secure view link
   * @param accountId The external account number (int) or account ID Guid.
   * @param envelopeId The envelopeId Guid of the envelope being accessed.
   * @param EnvelopesApi.DeleteViewLinkOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteViewLink(String accountId, String envelopeId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteViewLink");
     }
     
     // verify the required parameter 'envelopeId' is set
     if (envelopeId == null) {
        throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteViewLink");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/viewlink".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  
  
  /**
   * Updates document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param EnvelopesApi.UpdateTemplateRecipientsDocumentVisibilityOptions Options for modifying the method behavior.
   * @return TemplateDocumentVisibilityList
   */
  public TemplateDocumentVisibilityList updateTemplateRecipientsDocumentVisibility(String accountId, String templateId, TemplateDocumentVisibilityList templateDocumentVisibilityList) throws ApiException {
  
    Object postBody = templateDocumentVisibilityList;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateRecipientsDocumentVisibility");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateRecipientsDocumentVisibility");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/document_visibility".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    
    GenericType<TemplateDocumentVisibilityList> returnType = new GenericType<TemplateDocumentVisibilityList>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Returns document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.GetTemplateRecipientDocumentVisibilityOptions Options for modifying the method behavior.
   * @return DocumentVisibilityList
   */
  public DocumentVisibilityList getTemplateRecipientDocumentVisibility(String accountId, String templateId, String recipientId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTemplateRecipientDocumentVisibility");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getTemplateRecipientDocumentVisibility");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateRecipientDocumentVisibility");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/document_visibility".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
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

    
    GenericType<DocumentVisibilityList> returnType = new GenericType<DocumentVisibilityList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Updates document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * @param EnvelopesApi.UpdateTemplateRecipientDocumentVisibilityOptions Options for modifying the method behavior.
   * @return TemplateDocumentVisibilityList
   */
  public TemplateDocumentVisibilityList updateTemplateRecipientDocumentVisibility(String accountId, String templateId, String recipientId, TemplateDocumentVisibilityList templateDocumentVisibilityList) throws ApiException {
  
    Object postBody = templateDocumentVisibilityList;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateRecipientDocumentVisibility");
     }
     
     // verify the required parameter 'recipientId' is set
     if (recipientId == null) {
        throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateTemplateRecipientDocumentVisibility");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateRecipientDocumentVisibility");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/document_visibility".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
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

    
    GenericType<TemplateDocumentVisibilityList> returnType = new GenericType<TemplateDocumentVisibilityList>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Returns a URL to the authentication view UI.
   * Returns a URL that allows you to embed the authentication view of the DocuSign UI in your applications.
   * @param accountId The external account number (int) or account ID Guid.
   * @param EnvelopesApi.CreateConsoleViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   */
  public ViewUrl createConsoleView(String accountId, ConsoleViewRequest consoleViewRequest) throws ApiException {
  
    Object postBody = consoleViewRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createConsoleView");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/views/console".replaceAll("\\{format\\}","json")
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

    String[] authNames = new String[] { "docusignAccessCode" };

    
    GenericType<ViewUrl> returnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
