package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.BulkEnvelopeStatus;
import com.docusign.esign.model.BulkEnvelopesResponse;
import com.docusign.esign.model.BulkRecipientsRequest;
import com.docusign.esign.model.BulkRecipientsResponse;
import com.docusign.esign.model.BulkRecipientsSummaryResponse;
import com.docusign.esign.model.BulkRecipientsUpdateResponse;
import com.docusign.esign.model.ErrorDetails;




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
   * Deletes the bulk recipient file from an envelope.
   * Deletes the bulk recipient file from an envelope. This cannot be used if the envelope has been sent.  After using this, the &#x60;bulkRecipientsUri&#x60; property is not returned in subsequent GET calls for the envelope, but the recipient will remain as a bulk recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return BulkRecipientsUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public BulkRecipientsUpdateResponse deleteRecipients(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
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
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BulkRecipientsUpdateResponse> localVarReturnType = new GenericType<BulkRecipientsUpdateResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * Specifies which entries are included in the response. Multiple entries can be included by using commas in the query string (example: ?include&#x3D;\&quot;failed,queued\&quot;)   Valid values are:   * all - Returns all entries. If present, overrides all other query settings. This is the default if no query string is provided. * failed - This only returns entries with a failed status. * queued - This only returns entries with a queued status. * sent - This only returns entries with a sent status.   
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
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param batchId  (required)
   * @return BulkEnvelopeStatus
   */ 
  public BulkEnvelopeStatus get(String accountId, String batchId) throws ApiException {
    return get(accountId, batchId, null);
  }

  /**
   * Gets the status of a specified bulk send operation.
   * Retrieves the status information of a single bulk recipient batch. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param batchId  (required)
   * @param options for modifying the method behavior.
   * @return BulkEnvelopeStatus
   * @throws ApiException if fails to make API call
   */
  public BulkEnvelopeStatus get(String accountId, String batchId, BulkEnvelopesApi.GetOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling get");
      }
    
      // verify the required parameter 'batchId' is set
      if (batchId == null) {
      throw new ApiException(400, "Missing the required parameter 'batchId' when calling get");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/bulk_envelopes/{batchId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "batchId" + "\\}", apiClient.escapeString(batchId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BulkEnvelopeStatus> localVarReturnType = new GenericType<BulkEnvelopeStatus>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return BulkRecipientsResponse
   */ 
  public BulkRecipientsResponse getRecipients(String accountId, String envelopeId, String recipientId) throws ApiException {
    return getRecipients(accountId, envelopeId, recipientId, null);
  }

  /**
   * Gets the bulk recipient file from an envelope.
   * Retrieves the bulk recipient file information from an envelope that has a bulk recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return BulkRecipientsResponse
   * @throws ApiException if fails to make API call
   */
  public BulkRecipientsResponse getRecipients(String accountId, String envelopeId, String recipientId, BulkEnvelopesApi.GetRecipientsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
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
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_tabs", options.includeTabs));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BulkRecipientsResponse> localVarReturnType = new GenericType<BulkRecipientsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets status information about bulk recipient batches. Retrieves status information about all the bulk recipient batches. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file. The response includes general information about each bulk recipient batch.   The response returns information about the envelopes sent with bulk recipient batches, including the &#x60;batchId&#x60; property, which can be used to retrieve a more detailed status of individual bulk recipient batches.
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
   * Retrieves status information about all the bulk recipient batches. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file. The response includes general information about each bulk recipient batch.   The response returns information about the envelopes sent with bulk recipient batches, including the &#x60;batchId&#x60; property, which can be used to retrieve a more detailed status of individual bulk recipient batches.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BulkEnvelopesResponse
   */ 
  public BulkEnvelopesResponse list(String accountId) throws ApiException {
    return list(accountId, null);
  }

  /**
   * Gets status information about bulk recipient batches.
   * Retrieves status information about all the bulk recipient batches. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file. The response includes general information about each bulk recipient batch.   The response returns information about the envelopes sent with bulk recipient batches, including the &#x60;batchId&#x60; property, which can be used to retrieve a more detailed status of individual bulk recipient batches.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BulkEnvelopesResponse
   * @throws ApiException if fails to make API call
   */
  public BulkEnvelopesResponse list(String accountId, BulkEnvelopesApi.ListOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling list");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/bulk_envelopes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BulkEnvelopesResponse> localVarReturnType = new GenericType<BulkEnvelopesResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Adds or replaces envelope bulk recipients.
   * Updates the bulk recipients in a draft envelope using a file upload. The Content-Type supported for uploading a bulk recipient file is CSV (text/csv).  The REST API does not support modifying individual rows or values in the bulk recipients file. It only allows the entire file to be added or replaced with a new file.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param bulkRecipientsRequest  (optional)
   * @return BulkRecipientsSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public BulkRecipientsSummaryResponse updateRecipients(String accountId, String envelopeId, String recipientId, BulkRecipientsRequest bulkRecipientsRequest) throws ApiException {
    Object localVarPostBody = bulkRecipientsRequest;
    
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
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    "text/csv"
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BulkRecipientsSummaryResponse> localVarReturnType = new GenericType<BulkRecipientsSummaryResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
    }
