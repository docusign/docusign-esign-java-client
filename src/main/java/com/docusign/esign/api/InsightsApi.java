
package com.docusign.esign.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * InsightsApi class.
 *
 **/
public class InsightsApi {
  private ApiClient apiClient;

 /**
  * InsightsApi.
  *
  **/
  public InsightsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * InsightsApi.
  *
  **/
  public InsightsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

 /**
  * getApiClient Method.
  *
  * @return ApiClient
  **/
  public ApiClient getApiClient() {
    return apiClient;
  }

 /**
  * setApiClient Method.
  *
  **/
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Sets recommendations for an envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param type  (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recommendationsListRequest  (optional)
   * @return RecommendationsListResponse
   * @throws ApiException if fails to make API call
   */
  public RecommendationsListResponse createRecommendationsIntent(String accountId, String type, String envelopeId, RecommendationsListRequest recommendationsListRequest) throws ApiException {
    ApiResponse<RecommendationsListResponse> localVarResponse = createRecommendationsIntentWithHttpInfo(accountId, type, envelopeId, recommendationsListRequest);
    return localVarResponse.getData();
  }

  /**
   * Sets recommendations for an envelope
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param type  (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recommendationsListRequest  (optional)
   * @return RecommendationsListResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RecommendationsListResponse > createRecommendationsIntentWithHttpInfo(String accountId, String type, String envelopeId, RecommendationsListRequest recommendationsListRequest) throws ApiException {
    Object localVarPostBody = recommendationsListRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecommendationsIntent");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling createRecommendationsIntent");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecommendationsIntent");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/recommendations/{type}/{envelopeId}/intent"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<RecommendationsListResponse> localVarReturnType = new GenericType<RecommendationsListResponse>() {};
    RecommendationsListResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RecommendationsListResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets Recommendations associated with an envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param type  (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return RecommendationsListResponse
   * @throws ApiException if fails to make API call
   */
  public RecommendationsListResponse getRecommendationsIntent(String accountId, String type, String envelopeId) throws ApiException {
    ApiResponse<RecommendationsListResponse> localVarResponse = getRecommendationsIntentWithHttpInfo(accountId, type, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Gets Recommendations associated with an envelope
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param type  (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return RecommendationsListResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RecommendationsListResponse > getRecommendationsIntentWithHttpInfo(String accountId, String type, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecommendationsIntent");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getRecommendationsIntent");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecommendationsIntent");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/recommendations/{type}/{envelopeId}/intent"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<RecommendationsListResponse> localVarReturnType = new GenericType<RecommendationsListResponse>() {};
    RecommendationsListResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RecommendationsListResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets available Recommendations.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param type  (required)
   * @return RecommendationsListResponse
   * @throws ApiException if fails to make API call
   */
  public RecommendationsListResponse getRecommendationsList(String accountId, String type) throws ApiException {
    ApiResponse<RecommendationsListResponse> localVarResponse = getRecommendationsListWithHttpInfo(accountId, type);
    return localVarResponse.getData();
  }

  /**
   * Gets available Recommendations
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param type  (required)
   * @return RecommendationsListResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RecommendationsListResponse > getRecommendationsListWithHttpInfo(String accountId, String type) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecommendationsList");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getRecommendationsList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/recommendations/{type}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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
    
    GenericType<RecommendationsListResponse> localVarReturnType = new GenericType<RecommendationsListResponse>() {};
    RecommendationsListResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RecommendationsListResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
