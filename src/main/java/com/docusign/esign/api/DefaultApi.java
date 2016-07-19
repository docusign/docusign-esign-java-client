package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ViewUrl;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.ReturnUrlRequest;


public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  

  

  /**
   * Provides a URL to start an edit view of the Template UI
   * 
      * @param accountId The external account number (int) or account ID Guid.
      * @param templateId The ID of the template being accessed.
   
   * DefaultApi.TemplateEditViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl templateEditView(String accountId, String templateId, ReturnUrlRequest returnUrlRequest) throws ApiException {
    Object localVarPostBody = returnUrlRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling templateEditView");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling templateEditView");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/views/edit".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
