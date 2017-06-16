package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.PowerFormsResponse;
import com.docusign.esign.model.PowerForm;
import com.docusign.esign.model.PowerFormsRequest;
import com.docusign.esign.model.PowerFormSendersResponse;
import com.docusign.esign.model.PowerFormsFormDataResponse;


public class PowerFormsApi {
  private ApiClient apiClient;

  public PowerFormsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PowerFormsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  
  /// <summary>
  /// Returns the list of PowerForms available to the user. 
  /// </summary>
  public class ListPowerFormsOptions
  {
	
	private String fromDate = null;
	
	private String order = null;
	
	private String orderBy = null;
	
	private String toDate = null;
	
	
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
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public String getToDate() {
		return this.toDate;
	}
	
  }

   /**
   * Returns the list of PowerForms available to the user.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @return PowerFormsResponse
   */ 
  public PowerFormsResponse listPowerForms(String accountId) throws ApiException {
    return listPowerForms(accountId, null);
  }
  
  
  /**
   * Returns the list of PowerForms available to the user.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param PowerFormsApi.ListPowerFormsOptions Options for modifying the method behavior.
   * @return PowerFormsResponse
   */
  public PowerFormsResponse listPowerForms(String accountId, PowerFormsApi.ListPowerFormsOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listPowerForms");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/powerforms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
	 
       queryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
	 
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

    
    GenericType<PowerFormsResponse> returnType = new GenericType<PowerFormsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Creates a new PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param PowerFormsApi.CreatePowerFormOptions Options for modifying the method behavior.
   * @return PowerForm
   */
  public PowerForm createPowerForm(String accountId, PowerForm powerForm) throws ApiException {
  
    Object postBody = powerForm;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createPowerForm");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/powerforms".replaceAll("\\{format\\}","json")
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

    
    GenericType<PowerForm> returnType = new GenericType<PowerForm>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Deletes one or more PowerForms
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param PowerFormsApi.DeletePowerFormsOptions Options for modifying the method behavior.
   * @return PowerFormsResponse
   */
  public PowerFormsResponse deletePowerForms(String accountId, PowerFormsRequest powerFormsRequest) throws ApiException {
  
    Object postBody = powerFormsRequest;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deletePowerForms");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/powerforms".replaceAll("\\{format\\}","json")
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

    
    GenericType<PowerFormsResponse> returnType = new GenericType<PowerFormsResponse>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  /// <summary>
  /// Returns the list of PowerForms available to the user. 
  /// </summary>
  public class ListPowerFormSendersOptions
  {
	
	private String startPosition = null;
	
	
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
   * Returns the list of PowerForms available to the user.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @return PowerFormSendersResponse
   */ 
  public PowerFormSendersResponse listPowerFormSenders(String accountId) throws ApiException {
    return listPowerFormSenders(accountId, null);
  }
  
  
  /**
   * Returns the list of PowerForms available to the user.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param PowerFormsApi.ListPowerFormSendersOptions Options for modifying the method behavior.
   * @return PowerFormSendersResponse
   */
  public PowerFormSendersResponse listPowerFormSenders(String accountId, PowerFormsApi.ListPowerFormSendersOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listPowerFormSenders");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/powerforms/senders".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
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

    
    GenericType<PowerFormSendersResponse> returnType = new GenericType<PowerFormSendersResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Returns a single PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param powerFormId 
   * @param PowerFormsApi.GetPowerFormOptions Options for modifying the method behavior.
   * @return PowerForm
   */
  public PowerForm getPowerForm(String accountId, String powerFormId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPowerForm");
     }
     
     // verify the required parameter 'powerFormId' is set
     if (powerFormId == null) {
        throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling getPowerForm");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/powerforms/{powerFormId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

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

    
    GenericType<PowerForm> returnType = new GenericType<PowerForm>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Creates a new PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param powerFormId 
   * @param PowerFormsApi.UpdatePowerFormOptions Options for modifying the method behavior.
   * @return PowerForm
   */
  public PowerForm updatePowerForm(String accountId, String powerFormId, PowerForm powerForm) throws ApiException {
  
    Object postBody = powerForm;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePowerForm");
     }
     
     // verify the required parameter 'powerFormId' is set
     if (powerFormId == null) {
        throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling updatePowerForm");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/powerforms/{powerFormId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

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

    
    GenericType<PowerForm> returnType = new GenericType<PowerForm>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  
  
  /**
   * Delete a PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param powerFormId 
   * @param PowerFormsApi.DeletePowerFormOptions Options for modifying the method behavior.
   * @return void
   */
  public void deletePowerForm(String accountId, String powerFormId) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deletePowerForm");
     }
     
     // verify the required parameter 'powerFormId' is set
     if (powerFormId == null) {
        throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling deletePowerForm");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/powerforms/{powerFormId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

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
  /// Returns the form data associated with the usage of a PowerForm. 
  /// </summary>
  public class GetPowerFormDataOptions
  {
	
	private String fromDate = null;
	
	private String toDate = null;
	
	
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
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public String getToDate() {
		return this.toDate;
	}
	
  }

   /**
   * Returns the form data associated with the usage of a PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param powerFormId 
   * @return PowerFormsFormDataResponse
   */ 
  public PowerFormsFormDataResponse getPowerFormData(String accountId, String powerFormId) throws ApiException {
    return getPowerFormData(accountId, powerFormId, null);
  }
  
  
  /**
   * Returns the form data associated with the usage of a PowerForm.
   * 
   * @param accountId The external account number (int) or account ID Guid.
   * @param powerFormId 
   * @param PowerFormsApi.GetPowerFormDataOptions Options for modifying the method behavior.
   * @return PowerFormsFormDataResponse
   */
  public PowerFormsFormDataResponse getPowerFormData(String accountId, String powerFormId, PowerFormsApi.GetPowerFormDataOptions options) throws ApiException {
  
    Object postBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPowerFormData");
     }
     
     // verify the required parameter 'powerFormId' is set
     if (powerFormId == null) {
        throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling getPowerFormData");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/powerforms/{powerFormId}/form_data".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       queryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
	 
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

    
    GenericType<PowerFormsFormDataResponse> returnType = new GenericType<PowerFormsFormDataResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
