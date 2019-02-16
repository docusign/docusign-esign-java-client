package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;




  public class CommentsApi {
  private ApiClient apiClient;

  public CommentsApi() {
  this(Configuration.getDefaultApiClient());
  }

  public CommentsApi(ApiClient apiClient) {
  this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
  return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
  this.apiClient = apiClient;
  }

  /// <summary>
  /// Gets comment transcript for envelope and user 
  /// </summary>
  public class GetCommentsTranscriptOptions
  {
  private String encoding = null;
  /*
   * 
   */
  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }
  
  public String getEncoding() {
    return this.encoding;
  }
  }

   /**
   * Gets comment transcript for envelope and user
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getCommentsTranscript(String accountId, String envelopeId) throws ApiException {
    return getCommentsTranscript(accountId, envelopeId, null);
  }

  /**
   * Gets comment transcript for envelope and user
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getCommentsTranscript(String accountId, String envelopeId, CommentsApi.GetCommentsTranscriptOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getCommentsTranscript");
      }
    
      // verify the required parameter 'envelopeId' is set
      if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getCommentsTranscript");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/comments/transcript".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "encoding", options.encoding));
    }
    
    
      final String[] localVarAccepts = {
    "application/pdf"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
    }
