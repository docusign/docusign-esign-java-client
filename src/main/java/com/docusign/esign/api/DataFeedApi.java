
package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;



public class DataFeedApi {
  private ApiClient apiClient;

  public DataFeedApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataFeedApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Retrieves a Datafeed element by Id.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param dataFeedElementId  (required)
   * @throws ApiException if fails to make API call
   */
  public void getDataFeedElement(String accountId, String dataFeedElementId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDataFeedElement");
    }
    
    // verify the required parameter 'dataFeedElementId' is set
    if (dataFeedElementId == null) {
      throw new ApiException(400, "Missing the required parameter 'dataFeedElementId' when calling getDataFeedElement");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/data_feeds/data/{dataFeedElementId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "dataFeedElementId" + "\\}", apiClient.escapeString(dataFeedElementId.toString()));

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


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
