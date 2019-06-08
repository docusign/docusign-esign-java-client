package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.EnvelopePurgeConfiguration;
import com.docusign.esign.model.ErrorDetails;




  public class EnvelopePurgeConfigurationApi {
  private ApiClient apiClient;

  public EnvelopePurgeConfigurationApi() {
  this(Configuration.getDefaultApiClient());
  }

  public EnvelopePurgeConfigurationApi(ApiClient apiClient) {
  this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
  return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
  this.apiClient = apiClient;
  }


  /**
   * Select envelope purge configuration.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return EnvelopePurgeConfiguration
   * @throws ApiException if fails to make API call
   */
  public EnvelopePurgeConfiguration getEnvelopePurgeConfiguration(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopePurgeConfiguration");
      }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/envelope_purge_configuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

        GenericType<EnvelopePurgeConfiguration> localVarReturnType = new GenericType<EnvelopePurgeConfiguration>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Updates envelope purge configuration.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopePurgeConfiguration  (optional)
   * @return EnvelopePurgeConfiguration
   * @throws ApiException if fails to make API call
   */
  public EnvelopePurgeConfiguration updateEnvelopePurgeConfiguration(String accountId, EnvelopePurgeConfiguration envelopePurgeConfiguration) throws ApiException {
    Object localVarPostBody = envelopePurgeConfiguration;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopePurgeConfiguration");
      }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/envelope_purge_configuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

        GenericType<EnvelopePurgeConfiguration> localVarReturnType = new GenericType<EnvelopePurgeConfiguration>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
    }
