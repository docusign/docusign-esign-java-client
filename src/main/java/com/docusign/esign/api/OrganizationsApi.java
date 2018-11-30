package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;




  public class OrganizationsApi {
  private ApiClient apiClient;

  public OrganizationsApi() {
  this(Configuration.getDefaultApiClient());
  }

  public OrganizationsApi(ApiClient apiClient) {
  this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
  return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
  this.apiClient = apiClient;
  }


  /**
   * Retrieves an account settings comparison.
   * 
   * @param organizationId  (required)
   * @param resultId  (required)
   * @throws ApiException if fails to make API call
   */
  public void getAccountSettingsExport(String organizationId, String resultId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'organizationId' is set
      if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getAccountSettingsExport");
      }
    
      // verify the required parameter 'resultId' is set
      if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling getAccountSettingsExport");
      }
    
    // create path and map variables
    String localVarPath = "/v2/organization_exports/{organizationId}/account_settings/{resultId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "resultId" + "\\}", apiClient.escapeString(resultId.toString()));

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


      apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
      }

  /**
   * Retrieves an attachment from the envelope.
   * 
   * @param organizationId  (required)
   * @param resultId  (required)
   * @throws ApiException if fails to make API call
   */
  public void getUserListExport(String organizationId, String resultId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'organizationId' is set
      if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getUserListExport");
      }
    
      // verify the required parameter 'resultId' is set
      if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling getUserListExport");
      }
    
    // create path and map variables
    String localVarPath = "/v2/organization_exports/{organizationId}/user_list/{resultId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "resultId" + "\\}", apiClient.escapeString(resultId.toString()));

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


      apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
      }
    }
