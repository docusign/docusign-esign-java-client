
package com.docusign.esign.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




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
   * This method creates a new PowerForm.  You create a PowerForm from an existing DocuSign [template](/docs/esign-rest-api/reference/templates/templates/create/), based on the &#x60;templateId&#x60; in the request body.   PowerForms that you create from a template are referred to as *web PowerForms*.  **Note:** The DocuSign Admin console also supports creating a PowerForm by uploading a PDF file that has active form fields (referred to as a *PDF PowerForm*). However, PDF PowerForms are deprecated and are not supported in the API.  **Note:** A PowerForm can have only one sender. (Because PowerForms are not necessarily sent by email, this user is also referred to as the PowerForm *initiator*.) If you need to associate multiple senders with a PowerForm, create multiple copies of the PowerForm by using the same template (one copy for each sender). By default, the sender is the PowerForm Administrator who creates the PowerForm.   ### Signing modes  You can use one of the following signing modes for a PowerForm:  **&#x60;email&#x60;**  This mode verifies the recipient&#39;s identity by using email authentication before the recipient can sign a document. The recipient enters their email address on the landing page and then clicks **Begin Signing** to begin the signing process. The system then sends an email message with a validation code to the recipient. If the recipient does not provide a valid email address, they do not receive the email message containing the access code and are not able to open and sign the document.  Alternatively, you can make the process easier for signers by using email authentication only and omitting the access code. To do this, you append the &#x60;activateonly&#x60; flag to the PowerForm URL and set it to true by passing in the value &#x60;1&#x60;.  When the flag is active, the first recipient receives an email with a link that initiates the signing session without having to enter access code.  Example: &#x60;activateonly&#x3D;1&#x60;  **&#x60;direct&#x60;**  This mode does not require any verification. After a recipient enters their email address on the landing page and clicks **Begin Signing,** a new browser tab opens and the recipient can immediately begin the signing process.  Because the &#x60;direct&#x60; signing mode does not verify the recipient&#39;s identity by using email authentication, we strongly recommend that you use this mode only when the PowerForm is accessible behind a secure portal where the recipient&#39;s identity is already authenticated, or where another form of authentication is specified for the recipient in the DocuSign template (for example, an access code, phone authentication, or ID check).  **Note:** In the account settings, &#x60;enablePowerFormDirect&#x60; must be **true** to use &#x60;direct&#x60; as the &#x60;signingMode&#x60;.  ### Redirect URLs  You can control the URL to which signers are redirected after signing your PowerForm. However, the URL is specified elsewhere, outside of the PowerForm creation process. For details, see [How do I specify a URL to redirect to when a PowerForm is completed?](https://support.docusign.com/en/articles/How-do-I-specify-a-URL-to-redirect-to-when-a-Powerform-is-completed).  ### More information  For more information about creating PowerForms, see [Create a PowerForm](https://support.docusign.com/en/guides/ndse-user-guide-create-a-powerform).  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerForm  (optional)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public PowerForm createPowerForm(String accountId, PowerForm powerForm) throws ApiException {
    ApiResponse<PowerForm> localVarResponse = createPowerFormWithHttpInfo(accountId, powerForm);
    return localVarResponse.getData();
  }

  /**
   * Creates a new PowerForm.
   * This method creates a new PowerForm.  You create a PowerForm from an existing DocuSign [template](/docs/esign-rest-api/reference/templates/templates/create/), based on the &#x60;templateId&#x60; in the request body.   PowerForms that you create from a template are referred to as *web PowerForms*.  **Note:** The DocuSign Admin console also supports creating a PowerForm by uploading a PDF file that has active form fields (referred to as a *PDF PowerForm*). However, PDF PowerForms are deprecated and are not supported in the API.  **Note:** A PowerForm can have only one sender. (Because PowerForms are not necessarily sent by email, this user is also referred to as the PowerForm *initiator*.) If you need to associate multiple senders with a PowerForm, create multiple copies of the PowerForm by using the same template (one copy for each sender). By default, the sender is the PowerForm Administrator who creates the PowerForm.   ### Signing modes  You can use one of the following signing modes for a PowerForm:  **&#x60;email&#x60;**  This mode verifies the recipient&#39;s identity by using email authentication before the recipient can sign a document. The recipient enters their email address on the landing page and then clicks **Begin Signing** to begin the signing process. The system then sends an email message with a validation code to the recipient. If the recipient does not provide a valid email address, they do not receive the email message containing the access code and are not able to open and sign the document.  Alternatively, you can make the process easier for signers by using email authentication only and omitting the access code. To do this, you append the &#x60;activateonly&#x60; flag to the PowerForm URL and set it to true by passing in the value &#x60;1&#x60;.  When the flag is active, the first recipient receives an email with a link that initiates the signing session without having to enter access code.  Example: &#x60;activateonly&#x3D;1&#x60;  **&#x60;direct&#x60;**  This mode does not require any verification. After a recipient enters their email address on the landing page and clicks **Begin Signing,** a new browser tab opens and the recipient can immediately begin the signing process.  Because the &#x60;direct&#x60; signing mode does not verify the recipient&#39;s identity by using email authentication, we strongly recommend that you use this mode only when the PowerForm is accessible behind a secure portal where the recipient&#39;s identity is already authenticated, or where another form of authentication is specified for the recipient in the DocuSign template (for example, an access code, phone authentication, or ID check).  **Note:** In the account settings, &#x60;enablePowerFormDirect&#x60; must be **true** to use &#x60;direct&#x60; as the &#x60;signingMode&#x60;.  ### Redirect URLs  You can control the URL to which signers are redirected after signing your PowerForm. However, the URL is specified elsewhere, outside of the PowerForm creation process. For details, see [How do I specify a URL to redirect to when a PowerForm is completed?](https://support.docusign.com/en/articles/How-do-I-specify-a-URL-to-redirect-to-when-a-Powerform-is-completed).  ### More information  For more information about creating PowerForms, see [Create a PowerForm](https://support.docusign.com/en/guides/ndse-user-guide-create-a-powerform).  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerForm  (optional)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PowerForm > createPowerFormWithHttpInfo(String accountId, PowerForm powerForm) throws ApiException {
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
    PowerForm localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PowerForm>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Delete a PowerForm..
   * This method deletes a PowerForm.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePowerForm(String accountId, String powerFormId) throws ApiException {
    deletePowerFormWithHttpInfo(accountId, powerFormId);
  }

  /**
   * Delete a PowerForm.
   * This method deletes a PowerForm.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deletePowerFormWithHttpInfo(String accountId, String powerFormId) throws ApiException {
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
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Deletes one or more PowerForms.
   * This method deletes one or more PowerForms. The request body takes an array of PowerForm objects that are deleted based on the &#x60;powerFormId&#x60;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormsRequest  (optional)
   * @return PowerFormsResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormsResponse deletePowerForms(String accountId, PowerFormsRequest powerFormsRequest) throws ApiException {
    ApiResponse<PowerFormsResponse> localVarResponse = deletePowerFormsWithHttpInfo(accountId, powerFormsRequest);
    return localVarResponse.getData();
  }

  /**
   * Deletes one or more PowerForms
   * This method deletes one or more PowerForms. The request body takes an array of PowerForm objects that are deleted based on the &#x60;powerFormId&#x60;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormsRequest  (optional)
   * @return PowerFormsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PowerFormsResponse > deletePowerFormsWithHttpInfo(String accountId, PowerFormsRequest powerFormsRequest) throws ApiException {
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
    PowerFormsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PowerFormsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns a single PowerForm..
   * This method returns detailed information about a specific PowerForm.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public PowerForm getPowerForm(String accountId, String powerFormId) throws ApiException {
    ApiResponse<PowerForm> localVarResponse = getPowerFormWithHttpInfo(accountId, powerFormId);
    return localVarResponse.getData();
  }

  /**
   * Returns a single PowerForm.
   * This method returns detailed information about a specific PowerForm.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PowerForm > getPowerFormWithHttpInfo(String accountId, String powerFormId) throws ApiException {
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
    PowerForm localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PowerForm>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Returns the form data associated with the usage of a PowerForm. This method enables Powerform Administrators or the sender of a PowerForm to download the data that recipients have entered into a PowerForm.  You specify the format in which you want to retrieve the data in the &#x60;Accept&#x60; header. This header accepts the following values:   - &#x60;application/json&#x60;: JSON format - &#x60;application/xml&#x60;: XML format - &#x60;text/csv&#x60;: Comma-separated value (CSV) format  **Note:** Only PowerForm Administrators or the PowerForm Sender can download the data associated with a PowerForm.
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
   * This method enables Powerform Administrators or the sender of a PowerForm to download the data that recipients have entered into a PowerForm.  You specify the format in which you want to retrieve the data in the &#x60;Accept&#x60; header. This header accepts the following values:   - &#x60;application/json&#x60;: JSON format - &#x60;application/xml&#x60;: XML format - &#x60;text/csv&#x60;: Comma-separated value (CSV) format  **Note:** Only PowerForm Administrators or the PowerForm Sender can download the data associated with a PowerForm.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @return PowerFormsFormDataResponse
   */ 
  public PowerFormsFormDataResponse getPowerFormData(String accountId, String powerFormId) throws ApiException {
    return getPowerFormData(accountId, powerFormId, null);
  }

  /**
   * Returns the form data associated with the usage of a PowerForm..
   * This method enables Powerform Administrators or the sender of a PowerForm to download the data that recipients have entered into a PowerForm.  You specify the format in which you want to retrieve the data in the &#x60;Accept&#x60; header. This header accepts the following values:   - &#x60;application/json&#x60;: JSON format - &#x60;application/xml&#x60;: XML format - &#x60;text/csv&#x60;: Comma-separated value (CSV) format  **Note:** Only PowerForm Administrators or the PowerForm Sender can download the data associated with a PowerForm.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @param options for modifying the method behavior.
   * @return PowerFormsFormDataResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormsFormDataResponse getPowerFormData(String accountId, String powerFormId, PowerFormsApi.GetPowerFormDataOptions options) throws ApiException {
    ApiResponse<PowerFormsFormDataResponse> localVarResponse = getPowerFormDataWithHttpInfo(accountId, powerFormId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns the form data associated with the usage of a PowerForm.
   * This method enables Powerform Administrators or the sender of a PowerForm to download the data that recipients have entered into a PowerForm.  You specify the format in which you want to retrieve the data in the &#x60;Accept&#x60; header. This header accepts the following values:   - &#x60;application/json&#x60;: JSON format - &#x60;application/xml&#x60;: XML format - &#x60;text/csv&#x60;: Comma-separated value (CSV) format  **Note:** Only PowerForm Administrators or the PowerForm Sender can download the data associated with a PowerForm.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @param options for modifying the method behavior.
   * @return PowerFormsFormDataResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PowerFormsFormDataResponse > getPowerFormDataWithHttpInfo(String accountId, String powerFormId, PowerFormsApi.GetPowerFormDataOptions options) throws ApiException {
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
    PowerFormsFormDataResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PowerFormsFormDataResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Returns the list of PowerForms available to the user. This method returns a list of users who have sent PowerForms.
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
   * This method returns a list of users who have sent PowerForms.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return PowerFormSendersResponse
   */ 
  public PowerFormSendersResponse listPowerFormSenders(String accountId) throws ApiException {
    return listPowerFormSenders(accountId, null);
  }

  /**
   * Returns the list of PowerForms available to the user..
   * This method returns a list of users who have sent PowerForms.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return PowerFormSendersResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormSendersResponse listPowerFormSenders(String accountId, PowerFormsApi.ListPowerFormSendersOptions options) throws ApiException {
    ApiResponse<PowerFormSendersResponse> localVarResponse = listPowerFormSendersWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns the list of PowerForms available to the user.
   * This method returns a list of users who have sent PowerForms.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return PowerFormSendersResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PowerFormSendersResponse > listPowerFormSendersWithHttpInfo(String accountId, PowerFormsApi.ListPowerFormSendersOptions options) throws ApiException {
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
    PowerFormSendersResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PowerFormSendersResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Returns the list of PowerForms available to the user. This method returns a list of PowerForms that are available to the user.
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
   * This method returns a list of PowerForms that are available to the user.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return PowerFormsResponse
   */ 
  public PowerFormsResponse listPowerForms(String accountId) throws ApiException {
    return listPowerForms(accountId, null);
  }

  /**
   * Returns the list of PowerForms available to the user..
   * This method returns a list of PowerForms that are available to the user.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return PowerFormsResponse
   * @throws ApiException if fails to make API call
   */
  public PowerFormsResponse listPowerForms(String accountId, PowerFormsApi.ListPowerFormsOptions options) throws ApiException {
    ApiResponse<PowerFormsResponse> localVarResponse = listPowerFormsWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns the list of PowerForms available to the user.
   * This method returns a list of PowerForms that are available to the user.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return PowerFormsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PowerFormsResponse > listPowerFormsWithHttpInfo(String accountId, PowerFormsApi.ListPowerFormsOptions options) throws ApiException {
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
    PowerFormsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PowerFormsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Creates a new PowerForm..
   * This method updates an existing PowerForm.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @param powerForm  (optional)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public PowerForm updatePowerForm(String accountId, String powerFormId, PowerForm powerForm) throws ApiException {
    ApiResponse<PowerForm> localVarResponse = updatePowerFormWithHttpInfo(accountId, powerFormId, powerForm);
    return localVarResponse.getData();
  }

  /**
   * Creates a new PowerForm.
   * This method updates an existing PowerForm.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param powerFormId  (required)
   * @param powerForm  (optional)
   * @return PowerForm
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PowerForm > updatePowerFormWithHttpInfo(String accountId, String powerFormId, PowerForm powerForm) throws ApiException {
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
    PowerForm localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PowerForm>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
