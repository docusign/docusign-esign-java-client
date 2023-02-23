
package com.docusign.esign.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * TrustServiceProvidersApi class.
 *
 **/
public class TrustServiceProvidersApi {
  private ApiClient apiClient;

 /**
  * TrustServiceProvidersApi.
  *
  **/
  public TrustServiceProvidersApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * TrustServiceProvidersApi.
  *
  **/
  public TrustServiceProvidersApi(ApiClient apiClient) {
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
   * Returns Account available seals for specified account..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSeals
   * @throws ApiException if fails to make API call
   */
  public AccountSeals getSealProviders(String accountId) throws ApiException {
    ApiResponse<AccountSeals> localVarResponse = getSealProvidersWithHttpInfo(accountId);
    return localVarResponse.getData();
  }

  /**
   * Returns Account available seals for specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSeals
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountSeals > getSealProvidersWithHttpInfo(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getSealProviders");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/seals"
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
    
    GenericType<AccountSeals> localVarReturnType = new GenericType<AccountSeals>() {};
    AccountSeals localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AccountSeals>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
