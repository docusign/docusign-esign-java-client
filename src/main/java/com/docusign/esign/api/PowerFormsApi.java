
package com.docusign.esign.api;

import javax.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;




/**
 * PowerFormsApi class.
 *
 **/
public class PowerFormsApi {
  private ApiClient apiClient;

 /**
  * PowerFormsApi.
  *
  **/
  public PowerFormsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * PowerFormsApi.
  *
  **/
  public PowerFormsApi(ApiClient apiClient) {
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
   * Creates a new PowerForm..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerForm  (optional)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public PowerForm createPowerForm(String accountId, PowerForm powerForm) throws ApiException {
    Object localVarPostBody = powerForm;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createPowerForm");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/powerforms"
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

    GenericType<PowerForm> localVarReturnType = new GenericType<PowerForm>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete a PowerForm..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePowerForm(String accountId, String powerFormId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deletePowerForm");
    }
    
    // verify the required parameter 'powerFormId' is set
    if (powerFormId == null) {
      throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling deletePowerForm");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/powerforms/{powerFormId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Deletes one or more PowerForms.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormsRequest  (optional)
   * @return PowerFormsResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormsResponse deletePowerForms(String accountId, PowerFormsRequest powerFormsRequest) throws ApiException {
    Object localVarPostBody = powerFormsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deletePowerForms");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/powerforms"
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

    GenericType<PowerFormsResponse> localVarReturnType = new GenericType<PowerFormsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns a single PowerForm..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public PowerForm getPowerForm(String accountId, String powerFormId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPowerForm");
    }
    
    // verify the required parameter 'powerFormId' is set
    if (powerFormId == null) {
      throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling getPowerForm");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/powerforms/{powerFormId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

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

    GenericType<PowerForm> localVarReturnType = new GenericType<PowerForm>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Returns the form data associated with the usage of a PowerForm. 
  /// </summary>

 /**
  * GetPowerFormDataOptions Class.
  *
  **/
  public class GetPowerFormDataOptions
  {
  private String dataLayout = null;
  private String fromDate = null;
  private String toDate = null;
  
 /**
  * setDataLayout method.
  */
  public void setDataLayout(String dataLayout) {
    this.dataLayout = dataLayout;
  }

 /**
  * getDataLayout method.
  *
  * @return String
  */
  public String getDataLayout() {
    return this.dataLayout;
  }
  
 /**
  * setFromDate method.
  */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

 /**
  * getFromDate method.
  *
  * @return String
  */
  public String getFromDate() {
    return this.fromDate;
  }
  
 /**
  * setToDate method.
  */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

 /**
  * getToDate method.
  *
  * @return String
  */
  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Returns the form data associated with the usage of a PowerForm..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @return PowerFormsFormDataResponse
   */ 
  public PowerFormsFormDataResponse getPowerFormData(String accountId, String powerFormId) throws ApiException {
    return getPowerFormData(accountId, powerFormId, null);
  }

  /**
   * Returns the form data associated with the usage of a PowerForm..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @param options for modifying the method behavior.
   * @return PowerFormsFormDataResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormsFormDataResponse getPowerFormData(String accountId, String powerFormId, PowerFormsApi.GetPowerFormDataOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPowerFormData");
    }
    
    // verify the required parameter 'powerFormId' is set
    if (powerFormId == null) {
      throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling getPowerFormData");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/powerforms/{powerFormId}/form_data"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("data_layout", options.dataLayout));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<PowerFormsFormDataResponse> localVarReturnType = new GenericType<PowerFormsFormDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Returns the list of PowerForms available to the user. 
  /// </summary>

 /**
  * ListPowerFormSendersOptions Class.
  *
  **/
  public class ListPowerFormSendersOptions
  {
  private String startPosition = null;
  
 /**
  * setStartPosition method.
  */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

 /**
  * getStartPosition method.
  *
  * @return String
  */
  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Returns the list of PowerForms available to the user..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return PowerFormSendersResponse
   */ 
  public PowerFormSendersResponse listPowerFormSenders(String accountId) throws ApiException {
    return listPowerFormSenders(accountId, null);
  }

  /**
   * Returns the list of PowerForms available to the user..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return PowerFormSendersResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormSendersResponse listPowerFormSenders(String accountId, PowerFormsApi.ListPowerFormSendersOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listPowerFormSenders");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/powerforms/senders"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<PowerFormSendersResponse> localVarReturnType = new GenericType<PowerFormSendersResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Returns the list of PowerForms available to the user. 
  /// </summary>

 /**
  * ListPowerFormsOptions Class.
  *
  **/
  public class ListPowerFormsOptions
  {
  private String fromDate = null;
  private String order = null;
  private String orderBy = null;
  private String searchFields = null;
  private String searchText = null;
  private String toDate = null;
  
 /**
  * setFromDate method.
  */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

 /**
  * getFromDate method.
  *
  * @return String
  */
  public String getFromDate() {
    return this.fromDate;
  }
  
 /**
  * setOrder method.
  */
  public void setOrder(String order) {
    this.order = order;
  }

 /**
  * getOrder method.
  *
  * @return String
  */
  public String getOrder() {
    return this.order;
  }
  
 /**
  * setOrderBy method.
  */
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

 /**
  * getOrderBy method.
  *
  * @return String
  */
  public String getOrderBy() {
    return this.orderBy;
  }
  
 /**
  * setSearchFields method.
  */
  public void setSearchFields(String searchFields) {
    this.searchFields = searchFields;
  }

 /**
  * getSearchFields method.
  *
  * @return String
  */
  public String getSearchFields() {
    return this.searchFields;
  }
  
 /**
  * setSearchText method.
  */
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

 /**
  * getSearchText method.
  *
  * @return String
  */
  public String getSearchText() {
    return this.searchText;
  }
  
 /**
  * setToDate method.
  */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

 /**
  * getToDate method.
  *
  * @return String
  */
  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Returns the list of PowerForms available to the user..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return PowerFormsResponse
   */ 
  public PowerFormsResponse listPowerForms(String accountId) throws ApiException {
    return listPowerForms(accountId, null);
  }

  /**
   * Returns the list of PowerForms available to the user..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return PowerFormsResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormsResponse listPowerForms(String accountId, PowerFormsApi.ListPowerFormsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listPowerForms");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/powerforms"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order", options.order));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order_by", options.orderBy));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_fields", options.searchFields));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_text", options.searchText));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<PowerFormsResponse> localVarReturnType = new GenericType<PowerFormsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Creates a new PowerForm..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @param powerForm  (optional)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public PowerForm updatePowerForm(String accountId, String powerFormId, PowerForm powerForm) throws ApiException {
    Object localVarPostBody = powerForm;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePowerForm");
    }
    
    // verify the required parameter 'powerFormId' is set
    if (powerFormId == null) {
      throw new ApiException(400, "Missing the required parameter 'powerFormId' when calling updatePowerForm");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/powerforms/{powerFormId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "powerFormId" + "\\}", apiClient.escapeString(powerFormId.toString()));

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

    GenericType<PowerForm> localVarReturnType = new GenericType<PowerForm>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
