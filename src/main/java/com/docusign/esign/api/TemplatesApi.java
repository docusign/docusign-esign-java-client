
package com.docusign.esign.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * TemplatesApi class.
 *
 **/
public class TemplatesApi {
  private ApiClient apiClient;

 /**
  * TemplatesApi.
  *
  **/
  public TemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * TemplatesApi.
  *
  **/
  public TemplatesApi(ApiClient apiClient) {
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
   * Creates custom document fields in an existing template document..
   * Creates custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateCustomFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields createCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
    ApiResponse<CustomFields> localVarResponse = createCustomFieldsWithHttpInfo(accountId, templateId, templateCustomFields);
    return localVarResponse.getData();
  }

  /**
   * Creates custom document fields in an existing template document.
   * Creates custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateCustomFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomFields > createCustomFieldsWithHttpInfo(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
    Object localVarPostBody = templateCustomFields;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createCustomFields");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    CustomFields localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CustomFields>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Creates custom document fields in an existing template document..
   * Creates custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation createDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    ApiResponse<DocumentFieldsInformation> localVarResponse = createDocumentFieldsWithHttpInfo(accountId, templateId, documentId, documentFieldsInformation);
    return localVarResponse.getData();
  }

  /**
   * Creates custom document fields in an existing template document.
   * Creates custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentFieldsInformation > createDocumentFieldsWithHttpInfo(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    Object localVarPostBody = documentFieldsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createDocumentFields");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling createDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    DocumentFieldsInformation localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentFieldsInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Provides a URL to start an edit view of the Template UI.
   * This method returns a URL for starting an edit view of a template that uses the DocuSign Template UI.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createEditView(String accountId, String templateId, TemplateViewRequest templateViewRequest) throws ApiException {
    ApiResponse<ViewUrl> localVarResponse = createEditViewWithHttpInfo(accountId, templateId, templateViewRequest);
    return localVarResponse.getData();
  }

  /**
   * Provides a URL to start an edit view of the Template UI
   * This method returns a URL for starting an edit view of a template that uses the DocuSign Template UI.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ViewUrl > createEditViewWithHttpInfo(String accountId, String templateId, TemplateViewRequest templateViewRequest) throws ApiException {
    Object localVarPostBody = templateViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEditView");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createEditView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/views/edit"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    ViewUrl localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ViewUrl>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Lock a template..
   * Locks the specified template, and sets the time until the lock expires, to prevent other users or recipients from accessing and changing the template.  ###### Note: Users must have envelope locking capability enabled to use this function (the userSetting property &#x60;canLockEnvelopes&#x60; must be set to **true** for the user).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation createLock(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
    ApiResponse<LockInformation> localVarResponse = createLockWithHttpInfo(accountId, templateId, lockRequest);
    return localVarResponse.getData();
  }

  /**
   * Lock a template.
   * Locks the specified template, and sets the time until the lock expires, to prevent other users or recipients from accessing and changing the template.  ###### Note: Users must have envelope locking capability enabled to use this function (the userSetting property &#x60;canLockEnvelopes&#x60; must be set to **true** for the user).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LockInformation > createLockWithHttpInfo(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
    Object localVarPostBody = lockRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createLock");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    LockInformation localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<LockInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Adds tabs for a recipient. Adds one or more recipients to a template.
  /// </summary>

 /**
  * CreateRecipientsOptions Class.
  *
  **/
  public class CreateRecipientsOptions
  {
  private String resendEnvelope = null;
  
 /**
  * setResendEnvelope method.
  */
  public void setResendEnvelope(String resendEnvelope) {
    this.resendEnvelope = resendEnvelope;
  }

 /**
  * getResendEnvelope method.
  *
  * @return String
  */
  public String getResendEnvelope() {
    return this.resendEnvelope;
  }
  }

   /**
   * Adds tabs for a recipient..
   * Adds one or more recipients to a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateRecipients  (optional)
   * @return Recipients
   */ 
  public Recipients createRecipients(String accountId, String templateId, TemplateRecipients templateRecipients) throws ApiException {
    return createRecipients(accountId, templateId, templateRecipients, null);
  }

  /**
   * Adds tabs for a recipient..
   * Adds one or more recipients to a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateRecipients  (optional)
   * @param options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients createRecipients(String accountId, String templateId, TemplateRecipients templateRecipients, TemplatesApi.CreateRecipientsOptions options) throws ApiException {
    ApiResponse<Recipients> localVarResponse = createRecipientsWithHttpInfo(accountId, templateId, templateRecipients, options);
    return localVarResponse.getData();
  }

  /**
   * Adds tabs for a recipient.
   * Adds one or more recipients to a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateRecipients  (optional)
   * @param options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recipients > createRecipientsWithHttpInfo(String accountId, String templateId, TemplateRecipients templateRecipients, TemplatesApi.CreateRecipientsOptions options) throws ApiException {
    Object localVarPostBody = templateRecipients;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipients");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createRecipients");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("resend_envelope", options.resendEnvelope));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    Recipients localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Recipients>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Adds tabs for a recipient..
   * Adds one or more tabs for a recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs createTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = createTabsWithHttpInfo(accountId, templateId, recipientId, templateTabs);
    return localVarResponse.getData();
  }

  /**
   * Adds tabs for a recipient.
   * Adds one or more tabs for a recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > createTabsWithHttpInfo(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
    Object localVarPostBody = templateTabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTabs");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling createTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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
    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    Tabs localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Tabs>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Creates an envelope from a template..
   * Creates a template definition using a multipart request.  ###Template Email Subject Merge Fields  Call this endpoint to insert a recipient name and email address merge fields into the email subject line when creating or sending from a template.  The merge fields, based on the recipient&#39;s role name, are added to the &#x60;emailSubject&#x60; property when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.  Both the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient. ###### Note: If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.  To add a recipient&#39;s name in the subject line add the following text in the &#x60;emailSubject&#x60; property when creating the template or when sending an envelope from a template:  [[&lt;roleName&gt;_UserName]]  Example:  &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,&#x60;  To add a recipient&#39;s email address in the subject line add the following text in the &#x60;emailSubject&#x60; property when creating the template or when sending an envelope from a template:  [[&lt;roleName&gt;_Email]]  Example:  &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,&#x60;   In both cases the &lt;roleName&gt; is the recipient&#39;s contents of the &#x60;roleName&#x60; property in the template.  For cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTemplate  (optional)
   * @return TemplateSummary
   * @throws ApiException if fails to make API call
   */
  public TemplateSummary createTemplate(String accountId, EnvelopeTemplate envelopeTemplate) throws ApiException {
    ApiResponse<TemplateSummary> localVarResponse = createTemplateWithHttpInfo(accountId, envelopeTemplate);
    return localVarResponse.getData();
  }

  /**
   * Creates an envelope from a template.
   * Creates a template definition using a multipart request.  ###Template Email Subject Merge Fields  Call this endpoint to insert a recipient name and email address merge fields into the email subject line when creating or sending from a template.  The merge fields, based on the recipient&#39;s role name, are added to the &#x60;emailSubject&#x60; property when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.  Both the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient. ###### Note: If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.  To add a recipient&#39;s name in the subject line add the following text in the &#x60;emailSubject&#x60; property when creating the template or when sending an envelope from a template:  [[&lt;roleName&gt;_UserName]]  Example:  &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,&#x60;  To add a recipient&#39;s email address in the subject line add the following text in the &#x60;emailSubject&#x60; property when creating the template or when sending an envelope from a template:  [[&lt;roleName&gt;_Email]]  Example:  &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,&#x60;   In both cases the &lt;roleName&gt; is the recipient&#39;s contents of the &#x60;roleName&#x60; property in the template.  For cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTemplate  (optional)
   * @return TemplateSummary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TemplateSummary > createTemplateWithHttpInfo(String accountId, EnvelopeTemplate envelopeTemplate) throws ApiException {
    Object localVarPostBody = envelopeTemplate;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates"
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
    
    GenericType<TemplateSummary> localVarReturnType = new GenericType<TemplateSummary>() {};
    TemplateSummary localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TemplateSummary>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Post Responsive HTML Preview for a document in a template..
   * Creates a preview of the [responsive](/docs/esign-rest-api/esign101/concepts/responsive/), HTML version of a specific template document. This method enables you to preview a PDF document conversion to responsive HTML across device types prior to sending.  The request body is a &#x60;documentHtmlDefinition&#x60; object, which holds the responsive signing parameters that define how to generate the HTML version of the signing document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitions createTemplateDocumentResponsiveHtmlPreview(String accountId, String templateId, String documentId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
    ApiResponse<DocumentHtmlDefinitions> localVarResponse = createTemplateDocumentResponsiveHtmlPreviewWithHttpInfo(accountId, templateId, documentId, documentHtmlDefinition);
    return localVarResponse.getData();
  }

  /**
   * Post Responsive HTML Preview for a document in a template.
   * Creates a preview of the [responsive](/docs/esign-rest-api/esign101/concepts/responsive/), HTML version of a specific template document. This method enables you to preview a PDF document conversion to responsive HTML across device types prior to sending.  The request body is a &#x60;documentHtmlDefinition&#x60; object, which holds the responsive signing parameters that define how to generate the HTML version of the signing document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentHtmlDefinitions > createTemplateDocumentResponsiveHtmlPreviewWithHttpInfo(String accountId, String templateId, String documentId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
    Object localVarPostBody = documentHtmlDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTemplateDocumentResponsiveHtmlPreview");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createTemplateDocumentResponsiveHtmlPreview");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling createTemplateDocumentResponsiveHtmlPreview");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/responsive_html_preview"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    GenericType<DocumentHtmlDefinitions> localVarReturnType = new GenericType<DocumentHtmlDefinitions>() {};
    DocumentHtmlDefinitions localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentHtmlDefinitions>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Adds the tabs to a tempate.
   * Adds tabs to the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;.  In the request body, you only need to specify the tabs that your are adding. For example, to add a text [prefill tab](/docs/esign-rest-api/reference/templates/templatedocumenttabs/create/#definition__templatetabs_prefilltabs), your request body might look like this:  &#x60;&#x60;&#x60; {   \&quot;prefillTabs\&quot;: {     \&quot;textTabs\&quot;: [       {         \&quot;value\&quot;: \&quot;a prefill text tab\&quot;,         \&quot;pageNumber\&quot;: \&quot;1\&quot;,         \&quot;documentId\&quot;: \&quot;1\&quot;,         \&quot;xPosition\&quot;: 316,         \&quot;yPosition\&quot;: 97       }     ]   } } &#x60;&#x60;&#x60; 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs createTemplateDocumentTabs(String accountId, String templateId, String documentId, TemplateTabs templateTabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = createTemplateDocumentTabsWithHttpInfo(accountId, templateId, documentId, templateTabs);
    return localVarResponse.getData();
  }

  /**
   * Adds the tabs to a tempate
   * Adds tabs to the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;.  In the request body, you only need to specify the tabs that your are adding. For example, to add a text [prefill tab](/docs/esign-rest-api/reference/templates/templatedocumenttabs/create/#definition__templatetabs_prefilltabs), your request body might look like this:  &#x60;&#x60;&#x60; {   \&quot;prefillTabs\&quot;: {     \&quot;textTabs\&quot;: [       {         \&quot;value\&quot;: \&quot;a prefill text tab\&quot;,         \&quot;pageNumber\&quot;: \&quot;1\&quot;,         \&quot;documentId\&quot;: \&quot;1\&quot;,         \&quot;xPosition\&quot;: 316,         \&quot;yPosition\&quot;: 97       }     ]   } } &#x60;&#x60;&#x60; 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > createTemplateDocumentTabsWithHttpInfo(String accountId, String templateId, String documentId, TemplateTabs templateTabs) throws ApiException {
    Object localVarPostBody = templateTabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTemplateDocumentTabs");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createTemplateDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling createTemplateDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    Tabs localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Tabs>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Provides a URL to start a recipient view of the Envelope UI.
   * This method returns a URL for a template recipient preview  in the DocuSign UI that you can embed in your application. You use this method to enable the sender to preview the recipients&#39; experience.  For more information, see [Preview and Send](https://support.docusign.com/en/guides/ndse-user-guide-send-your-documents).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientPreviewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createTemplateRecipientPreview(String accountId, String templateId, RecipientPreviewRequest recipientPreviewRequest) throws ApiException {
    ApiResponse<ViewUrl> localVarResponse = createTemplateRecipientPreviewWithHttpInfo(accountId, templateId, recipientPreviewRequest);
    return localVarResponse.getData();
  }

  /**
   * Provides a URL to start a recipient view of the Envelope UI
   * This method returns a URL for a template recipient preview  in the DocuSign UI that you can embed in your application. You use this method to enable the sender to preview the recipients&#39; experience.  For more information, see [Preview and Send](https://support.docusign.com/en/guides/ndse-user-guide-send-your-documents).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientPreviewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ViewUrl > createTemplateRecipientPreviewWithHttpInfo(String accountId, String templateId, RecipientPreviewRequest recipientPreviewRequest) throws ApiException {
    Object localVarPostBody = recipientPreviewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTemplateRecipientPreview");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createTemplateRecipientPreview");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/views/recipient_preview"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    ViewUrl localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ViewUrl>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get Responsive HTML Preview for all documents in a template..
   * Creates a preview of the [responsive](/docs/esign-rest-api/esign101/concepts/responsive/), HTML versions of all of the documents associated with a template. This method enables you to preview the PDF document conversions to responsive HTML across device types prior to sending.  The request body is a &#x60;documentHtmlDefinition&#x60; object, which holds the responsive signing parameters that define how to generate the HTML version of the documents.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitions createTemplateResponsiveHtmlPreview(String accountId, String templateId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
    ApiResponse<DocumentHtmlDefinitions> localVarResponse = createTemplateResponsiveHtmlPreviewWithHttpInfo(accountId, templateId, documentHtmlDefinition);
    return localVarResponse.getData();
  }

  /**
   * Get Responsive HTML Preview for all documents in a template.
   * Creates a preview of the [responsive](/docs/esign-rest-api/esign101/concepts/responsive/), HTML versions of all of the documents associated with a template. This method enables you to preview the PDF document conversions to responsive HTML across device types prior to sending.  The request body is a &#x60;documentHtmlDefinition&#x60; object, which holds the responsive signing parameters that define how to generate the HTML version of the documents.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentHtmlDefinitions > createTemplateResponsiveHtmlPreviewWithHttpInfo(String accountId, String templateId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
    Object localVarPostBody = documentHtmlDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTemplateResponsiveHtmlPreview");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createTemplateResponsiveHtmlPreview");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/responsive_html_preview"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<DocumentHtmlDefinitions> localVarReturnType = new GenericType<DocumentHtmlDefinitions>() {};
    DocumentHtmlDefinitions localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentHtmlDefinitions>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes envelope custom fields in a template..
   * Deletes envelope custom fields in a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateCustomFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields deleteCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
    ApiResponse<CustomFields> localVarResponse = deleteCustomFieldsWithHttpInfo(accountId, templateId, templateCustomFields);
    return localVarResponse.getData();
  }

  /**
   * Deletes envelope custom fields in a template.
   * Deletes envelope custom fields in a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateCustomFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomFields > deleteCustomFieldsWithHttpInfo(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
    Object localVarPostBody = templateCustomFields;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCustomFields");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    CustomFields localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CustomFields>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes custom document fields from an existing template document..
   * Deletes custom document fields from an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation deleteDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    ApiResponse<DocumentFieldsInformation> localVarResponse = deleteDocumentFieldsWithHttpInfo(accountId, templateId, documentId, documentFieldsInformation);
    return localVarResponse.getData();
  }

  /**
   * Deletes custom document fields from an existing template document.
   * Deletes custom document fields from an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentFieldsInformation > deleteDocumentFieldsWithHttpInfo(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    Object localVarPostBody = documentFieldsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentFields");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    DocumentFieldsInformation localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentFieldsInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes a page from a document in an template..
   * Deletes a page from a document in a template based on the page number.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param pageRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteDocumentPage(String accountId, String templateId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
    deleteDocumentPageWithHttpInfo(accountId, templateId, documentId, pageNumber, pageRequest);
  }

  /**
   * Deletes a page from a document in an template.
   * Deletes a page from a document in a template based on the page number.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param pageRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteDocumentPageWithHttpInfo(String accountId, String templateId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
    Object localVarPostBody = pageRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentPage");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteDocumentPage");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocumentPage");
    }
    
    // verify the required parameter 'pageNumber' is set
    if (pageNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling deleteDocumentPage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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
   * Deletes documents from a template..
   * Deletes one or more documents from an existing template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return TemplateDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public TemplateDocumentsResult deleteDocuments(String accountId, String templateId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    ApiResponse<TemplateDocumentsResult> localVarResponse = deleteDocumentsWithHttpInfo(accountId, templateId, envelopeDefinition);
    return localVarResponse.getData();
  }

  /**
   * Deletes documents from a template.
   * Deletes one or more documents from an existing template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return TemplateDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TemplateDocumentsResult > deleteDocumentsWithHttpInfo(String accountId, String templateId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    Object localVarPostBody = envelopeDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocuments");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<TemplateDocumentsResult> localVarReturnType = new GenericType<TemplateDocumentsResult>() {};
    TemplateDocumentsResult localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TemplateDocumentsResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Removes a member group&#39;s sharing permissions for a template..
   * Removes a member group&#39;s sharing permissions for a specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templatePart Currently, the only defined part is **groups**. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public GroupInformation deleteGroupShare(String accountId, String templateId, String templatePart, GroupInformation groupInformation) throws ApiException {
    ApiResponse<GroupInformation> localVarResponse = deleteGroupShareWithHttpInfo(accountId, templateId, templatePart, groupInformation);
    return localVarResponse.getData();
  }

  /**
   * Removes a member group&#39;s sharing permissions for a template.
   * Removes a member group&#39;s sharing permissions for a specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templatePart Currently, the only defined part is **groups**. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupInformation > deleteGroupShareWithHttpInfo(String accountId, String templateId, String templatePart, GroupInformation groupInformation) throws ApiException {
    Object localVarPostBody = groupInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteGroupShare");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteGroupShare");
    }
    
    // verify the required parameter 'templatePart' is set
    if (templatePart == null) {
      throw new ApiException(400, "Missing the required parameter 'templatePart' when calling deleteGroupShare");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/{templatePart}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "templatePart" + "\\}", apiClient.escapeString(templatePart.toString()));

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
    
    GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
    GroupInformation localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GroupInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes a template lock..
   * Deletes the lock from the specified template. The &#x60;X-DocuSign-Edit&#x60; header must be included in the request.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation deleteLock(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
    ApiResponse<LockInformation> localVarResponse = deleteLockWithHttpInfo(accountId, templateId, lockRequest);
    return localVarResponse.getData();
  }

  /**
   * Deletes a template lock.
   * Deletes the lock from the specified template. The &#x60;X-DocuSign-Edit&#x60; header must be included in the request.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LockInformation > deleteLockWithHttpInfo(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
    Object localVarPostBody = lockRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteLock");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    LockInformation localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<LockInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes the specified recipient file from a template..
   * Deletes the specified recipient file from the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param templateRecipients  (optional)
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients deleteRecipient(String accountId, String templateId, String recipientId, TemplateRecipients templateRecipients) throws ApiException {
    ApiResponse<Recipients> localVarResponse = deleteRecipientWithHttpInfo(accountId, templateId, recipientId, templateRecipients);
    return localVarResponse.getData();
  }

  /**
   * Deletes the specified recipient file from a template.
   * Deletes the specified recipient file from the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param templateRecipients  (optional)
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recipients > deleteRecipientWithHttpInfo(String accountId, String templateId, String recipientId, TemplateRecipients templateRecipients) throws ApiException {
    Object localVarPostBody = templateRecipients;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipient");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteRecipient");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteRecipient");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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
    
    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    Recipients localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Recipients>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes recipients from a template..
   * Deletes one or more recipients from a template. Recipients to be deleted are listed in the request, with the &#x60;recipientId&#x60; being used as the key for deleting recipients.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateRecipients  (optional)
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients deleteRecipients(String accountId, String templateId, TemplateRecipients templateRecipients) throws ApiException {
    ApiResponse<Recipients> localVarResponse = deleteRecipientsWithHttpInfo(accountId, templateId, templateRecipients);
    return localVarResponse.getData();
  }

  /**
   * Deletes recipients from a template.
   * Deletes one or more recipients from a template. Recipients to be deleted are listed in the request, with the &#x60;recipientId&#x60; being used as the key for deleting recipients.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateRecipients  (optional)
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recipients > deleteRecipientsWithHttpInfo(String accountId, String templateId, TemplateRecipients templateRecipients) throws ApiException {
    Object localVarPostBody = templateRecipients;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipients");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteRecipients");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    Recipients localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Recipients>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes the tabs associated with a recipient in a template..
   * Deletes one or more tabs associated with a recipient in a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs deleteTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = deleteTabsWithHttpInfo(accountId, templateId, recipientId, templateTabs);
    return localVarResponse.getData();
  }

  /**
   * Deletes the tabs associated with a recipient in a template.
   * Deletes one or more tabs associated with a recipient in a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > deleteTabsWithHttpInfo(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
    Object localVarPostBody = templateTabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTabs");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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
    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    Tabs localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Tabs>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes tabs from an envelope document.
   * Deletes tabs from the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs deleteTemplateDocumentTabs(String accountId, String templateId, String documentId, TemplateTabs templateTabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = deleteTemplateDocumentTabsWithHttpInfo(accountId, templateId, documentId, templateTabs);
    return localVarResponse.getData();
  }

  /**
   * Deletes tabs from an envelope document
   * Deletes tabs from the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > deleteTemplateDocumentTabsWithHttpInfo(String accountId, String templateId, String documentId, TemplateTabs templateTabs) throws ApiException {
    Object localVarPostBody = templateTabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTemplateDocumentTabs");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplateDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteTemplateDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    Tabs localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Tabs>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets a list of templates for a specified account. Retrieves the definition of the specified template.
  /// </summary>

 /**
  * GetOptions Class.
  *
  **/
  public class GetOptions
  {
  private String include = null;
  
 /**
  * setInclude method.
  */
  public void setInclude(String include) {
    this.include = include;
  }

 /**
  * getInclude method.
  *
  * @return String
  */
  public String getInclude() {
    return this.include;
  }
  }

   /**
   * Gets a list of templates for a specified account..
   * Retrieves the definition of the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return EnvelopeTemplate
   */ 
  public EnvelopeTemplate get(String accountId, String templateId) throws ApiException {
    return get(accountId, templateId, null);
  }

  /**
   * Gets a list of templates for a specified account..
   * Retrieves the definition of the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopeTemplate
   * @throws ApiException if fails to make API call
   */
  public EnvelopeTemplate get(String accountId, String templateId, TemplatesApi.GetOptions options) throws ApiException {
    ApiResponse<EnvelopeTemplate> localVarResponse = getWithHttpInfo(accountId, templateId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a list of templates for a specified account.
   * Retrieves the definition of the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopeTemplate
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeTemplate > getWithHttpInfo(String accountId, String templateId, TemplatesApi.GetOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling get");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling get");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<EnvelopeTemplate> localVarReturnType = new GenericType<EnvelopeTemplate>() {};
    EnvelopeTemplate localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeTemplate>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets PDF documents from a template. Retrieves one or more PDF documents from the specified template.  You can specify the ID of the document to retrieve or can specify &#x60;combined&#x60; to retrieve all documents in the template as one pdf.
  /// </summary>

 /**
  * GetDocumentOptions Class.
  *
  **/
  public class GetDocumentOptions
  {
  private String encrypt = null;
  private String fileType = null;
  private String showChanges = null;
  
 /**
  * setEncrypt method.
  */
  public void setEncrypt(String encrypt) {
    this.encrypt = encrypt;
  }

 /**
  * getEncrypt method.
  *
  * @return String
  */
  public String getEncrypt() {
    return this.encrypt;
  }
  
 /**
  * setFileType method.
  */
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

 /**
  * getFileType method.
  *
  * @return String
  */
  public String getFileType() {
    return this.fileType;
  }
  
 /**
  * setShowChanges method.
  */
  public void setShowChanges(String showChanges) {
    this.showChanges = showChanges;
  }

 /**
  * getShowChanges method.
  *
  * @return String
  */
  public String getShowChanges() {
    return this.showChanges;
  }
  }

   /**
   * Gets PDF documents from a template..
   * Retrieves one or more PDF documents from the specified template.  You can specify the ID of the document to retrieve or can specify &#x60;combined&#x60; to retrieve all documents in the template as one pdf.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getDocument(String accountId, String templateId, String documentId) throws ApiException {
    return getDocument(accountId, templateId, documentId, null);
  }

  /**
   * Gets PDF documents from a template..
   * Retrieves one or more PDF documents from the specified template.  You can specify the ID of the document to retrieve or can specify &#x60;combined&#x60; to retrieve all documents in the template as one pdf.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getDocument(String accountId, String templateId, String documentId, TemplatesApi.GetDocumentOptions options) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getDocumentWithHttpInfo(accountId, templateId, documentId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets PDF documents from a template.
   * Retrieves one or more PDF documents from the specified template.  You can specify the ID of the document to retrieve or can specify &#x60;combined&#x60; to retrieve all documents in the template as one pdf.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getDocumentWithHttpInfo(String accountId, String templateId, String documentId, TemplatesApi.GetDocumentOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocument");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("encrypt", options.encrypt));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("file_type", options.fileType));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("show_changes", options.showChanges));
    }

    

    

    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    byte[] localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<byte[]>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets a page image from a template for display. Retrieves a page image for display from the specified template.
  /// </summary>

 /**
  * GetDocumentPageImageOptions Class.
  *
  **/
  public class GetDocumentPageImageOptions
  {
  private String dpi = null;
  private String maxHeight = null;
  private String maxWidth = null;
  private String showChanges = null;
  
 /**
  * setDpi method.
  */
  public void setDpi(String dpi) {
    this.dpi = dpi;
  }

 /**
  * getDpi method.
  *
  * @return String
  */
  public String getDpi() {
    return this.dpi;
  }
  
 /**
  * setMaxHeight method.
  */
  public void setMaxHeight(String maxHeight) {
    this.maxHeight = maxHeight;
  }

 /**
  * getMaxHeight method.
  *
  * @return String
  */
  public String getMaxHeight() {
    return this.maxHeight;
  }
  
 /**
  * setMaxWidth method.
  */
  public void setMaxWidth(String maxWidth) {
    this.maxWidth = maxWidth;
  }

 /**
  * getMaxWidth method.
  *
  * @return String
  */
  public String getMaxWidth() {
    return this.maxWidth;
  }
  
 /**
  * setShowChanges method.
  */
  public void setShowChanges(String showChanges) {
    this.showChanges = showChanges;
  }

 /**
  * getShowChanges method.
  *
  * @return String
  */
  public String getShowChanges() {
    return this.showChanges;
  }
  }

   /**
   * Gets a page image from a template for display..
   * Retrieves a page image for display from the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getDocumentPageImage(String accountId, String templateId, String documentId, String pageNumber) throws ApiException {
    return getDocumentPageImage(accountId, templateId, documentId, pageNumber, null);
  }

  /**
   * Gets a page image from a template for display..
   * Retrieves a page image for display from the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getDocumentPageImage(String accountId, String templateId, String documentId, String pageNumber, TemplatesApi.GetDocumentPageImageOptions options) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getDocumentPageImageWithHttpInfo(accountId, templateId, documentId, pageNumber, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a page image from a template for display.
   * Retrieves a page image for display from the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getDocumentPageImageWithHttpInfo(String accountId, String templateId, String documentId, String pageNumber, TemplatesApi.GetDocumentPageImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocumentPageImage");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getDocumentPageImage");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocumentPageImage");
    }
    
    // verify the required parameter 'pageNumber' is set
    if (pageNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling getDocumentPageImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}/page_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("dpi", options.dpi));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("max_height", options.maxHeight));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("max_width", options.maxWidth));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("show_changes", options.showChanges));
    }

    

    

    final String[] localVarAccepts = {
      "image/png"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    byte[] localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<byte[]>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Returns tabs on the document. Returns the tabs on the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;.  
  /// </summary>

 /**
  * GetDocumentTabsOptions Class.
  *
  **/
  public class GetDocumentTabsOptions
  {
  private String pageNumbers = null;
  
 /**
  * setPageNumbers method.
  */
  public void setPageNumbers(String pageNumbers) {
    this.pageNumbers = pageNumbers;
  }

 /**
  * getPageNumbers method.
  *
  * @return String
  */
  public String getPageNumbers() {
    return this.pageNumbers;
  }
  }

   /**
   * Returns tabs on the document..
   * Returns the tabs on the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;.  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return Tabs
   */ 
  public Tabs getDocumentTabs(String accountId, String templateId, String documentId) throws ApiException {
    return getDocumentTabs(accountId, templateId, documentId, null);
  }

  /**
   * Returns tabs on the document..
   * Returns the tabs on the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;.  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs getDocumentTabs(String accountId, String templateId, String documentId, TemplatesApi.GetDocumentTabsOptions options) throws ApiException {
    ApiResponse<Tabs> localVarResponse = getDocumentTabsWithHttpInfo(accountId, templateId, documentId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns tabs on the document.
   * Returns the tabs on the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;.  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > getDocumentTabsWithHttpInfo(String accountId, String templateId, String documentId, TemplatesApi.GetDocumentTabsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocumentTabs");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page_numbers", options.pageNumbers));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    Tabs localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Tabs>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets template lock information..
   * Retrieves general information about the template lock.  If the call is made by the user who has the lock and the request has the same integrator key as original, then the &#x60;X-DocuSign-Edit&#x60; header  field and additional lock information is included in the response. This allows users to recover a lost editing session token and the &#x60;X-DocuSign-Edit&#x60; header.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation getLock(String accountId, String templateId) throws ApiException {
    ApiResponse<LockInformation> localVarResponse = getLockWithHttpInfo(accountId, templateId);
    return localVarResponse.getData();
  }

  /**
   * Gets template lock information.
   * Retrieves general information about the template lock.  If the call is made by the user who has the lock and the request has the same integrator key as original, then the &#x60;X-DocuSign-Edit&#x60; header  field and additional lock information is included in the response. This allows users to recover a lost editing session token and the &#x60;X-DocuSign-Edit&#x60; header.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LockInformation > getLockWithHttpInfo(String accountId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getLock");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    LockInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<LockInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets template notification information..
   * Retrieves the envelope notification, reminders and expirations, information for an existing template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public Notification getNotificationSettings(String accountId, String templateId) throws ApiException {
    ApiResponse<Notification> localVarResponse = getNotificationSettingsWithHttpInfo(accountId, templateId);
    return localVarResponse.getData();
  }

  /**
   * Gets template notification information.
   * Retrieves the envelope notification, reminders and expirations, information for an existing template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Notification > getNotificationSettingsWithHttpInfo(String accountId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getNotificationSettings");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getNotificationSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/notification"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<Notification> localVarReturnType = new GenericType<Notification>() {};
    Notification localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Notification>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns tabs on the specified page..
   * Returns the tabs from the page specified by &#x60;pageNumber&#x60; of the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs getPageTabs(String accountId, String templateId, String documentId, String pageNumber) throws ApiException {
    ApiResponse<Tabs> localVarResponse = getPageTabsWithHttpInfo(accountId, templateId, documentId, pageNumber);
    return localVarResponse.getData();
  }

  /**
   * Returns tabs on the specified page.
   * Returns the tabs from the page specified by &#x60;pageNumber&#x60; of the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > getPageTabsWithHttpInfo(String accountId, String templateId, String documentId, String pageNumber) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPageTabs");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getPageTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getPageTabs");
    }
    
    // verify the required parameter 'pageNumber' is set
    if (pageNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling getPageTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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
    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    Tabs localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Tabs>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Returns document page image(s) based on input. Returns images of the pages in a template document for display based on the parameters that you specify.
  /// </summary>

 /**
  * GetPagesOptions Class.
  *
  **/
  public class GetPagesOptions
  {
  private String count = null;
  private String dpi = null;
  private String maxHeight = null;
  private String maxWidth = null;
  private String nocache = null;
  private String showChanges = null;
  private String startPosition = null;
  
 /**
  * setCount method.
  */
  public void setCount(String count) {
    this.count = count;
  }

 /**
  * getCount method.
  *
  * @return String
  */
  public String getCount() {
    return this.count;
  }
  
 /**
  * setDpi method.
  */
  public void setDpi(String dpi) {
    this.dpi = dpi;
  }

 /**
  * getDpi method.
  *
  * @return String
  */
  public String getDpi() {
    return this.dpi;
  }
  
 /**
  * setMaxHeight method.
  */
  public void setMaxHeight(String maxHeight) {
    this.maxHeight = maxHeight;
  }

 /**
  * getMaxHeight method.
  *
  * @return String
  */
  public String getMaxHeight() {
    return this.maxHeight;
  }
  
 /**
  * setMaxWidth method.
  */
  public void setMaxWidth(String maxWidth) {
    this.maxWidth = maxWidth;
  }

 /**
  * getMaxWidth method.
  *
  * @return String
  */
  public String getMaxWidth() {
    return this.maxWidth;
  }
  
 /**
  * setNocache method.
  */
  public void setNocache(String nocache) {
    this.nocache = nocache;
  }

 /**
  * getNocache method.
  *
  * @return String
  */
  public String getNocache() {
    return this.nocache;
  }
  
 /**
  * setShowChanges method.
  */
  public void setShowChanges(String showChanges) {
    this.showChanges = showChanges;
  }

 /**
  * getShowChanges method.
  *
  * @return String
  */
  public String getShowChanges() {
    return this.showChanges;
  }
  
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
   * Returns document page image(s) based on input..
   * Returns images of the pages in a template document for display based on the parameters that you specify.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return PageImages
   */ 
  public PageImages getPages(String accountId, String templateId, String documentId) throws ApiException {
    return getPages(accountId, templateId, documentId, null);
  }

  /**
   * Returns document page image(s) based on input..
   * Returns images of the pages in a template document for display based on the parameters that you specify.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return PageImages
   * @throws ApiException if fails to make API call
   */
  public PageImages getPages(String accountId, String templateId, String documentId, TemplatesApi.GetPagesOptions options) throws ApiException {
    ApiResponse<PageImages> localVarResponse = getPagesWithHttpInfo(accountId, templateId, documentId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns document page image(s) based on input.
   * Returns images of the pages in a template document for display based on the parameters that you specify.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return PageImages
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PageImages > getPagesWithHttpInfo(String accountId, String templateId, String documentId, TemplatesApi.GetPagesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPages");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getPages");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getPages");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("dpi", options.dpi));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("max_height", options.maxHeight));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("max_width", options.maxWidth));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("nocache", options.nocache));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("show_changes", options.showChanges));
    }if (options != null) {
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
    
    GenericType<PageImages> localVarReturnType = new GenericType<PageImages>() {};
    PageImages localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PageImages>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get the Original HTML Definition used to generate the Responsive HTML for a given document in a template..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return DocumentHtmlDefinitionOriginals
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitionOriginals getTemplateDocumentHtmlDefinitions(String accountId, String templateId, String documentId) throws ApiException {
    ApiResponse<DocumentHtmlDefinitionOriginals> localVarResponse = getTemplateDocumentHtmlDefinitionsWithHttpInfo(accountId, templateId, documentId);
    return localVarResponse.getData();
  }

  /**
   * Get the Original HTML Definition used to generate the Responsive HTML for a given document in a template.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return DocumentHtmlDefinitionOriginals
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentHtmlDefinitionOriginals > getTemplateDocumentHtmlDefinitionsWithHttpInfo(String accountId, String templateId, String documentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTemplateDocumentHtmlDefinitions");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateDocumentHtmlDefinitions");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getTemplateDocumentHtmlDefinitions");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/html_definitions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    GenericType<DocumentHtmlDefinitionOriginals> localVarReturnType = new GenericType<DocumentHtmlDefinitionOriginals>() {};
    DocumentHtmlDefinitionOriginals localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentHtmlDefinitionOriginals>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get the Original HTML Definition used to generate the Responsive HTML for the template..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return DocumentHtmlDefinitionOriginals
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitionOriginals getTemplateHtmlDefinitions(String accountId, String templateId) throws ApiException {
    ApiResponse<DocumentHtmlDefinitionOriginals> localVarResponse = getTemplateHtmlDefinitionsWithHttpInfo(accountId, templateId);
    return localVarResponse.getData();
  }

  /**
   * Get the Original HTML Definition used to generate the Responsive HTML for the template.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return DocumentHtmlDefinitionOriginals
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentHtmlDefinitionOriginals > getTemplateHtmlDefinitionsWithHttpInfo(String accountId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTemplateHtmlDefinitions");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateHtmlDefinitions");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/html_definitions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<DocumentHtmlDefinitionOriginals> localVarReturnType = new GenericType<DocumentHtmlDefinitionOriginals>() {};
    DocumentHtmlDefinitionOriginals localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentHtmlDefinitionOriginals>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets the custom document fields from a template..
   * Retrieves the custom document field information from an existing template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields listCustomFields(String accountId, String templateId) throws ApiException {
    ApiResponse<CustomFields> localVarResponse = listCustomFieldsWithHttpInfo(accountId, templateId);
    return localVarResponse.getData();
  }

  /**
   * Gets the custom document fields from a template.
   * Retrieves the custom document field information from an existing template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomFields > listCustomFieldsWithHttpInfo(String accountId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomFields");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling listCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    CustomFields localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CustomFields>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets the custom document fields for a an existing template document..
   * Retrieves the custom document fields for an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation listDocumentFields(String accountId, String templateId, String documentId) throws ApiException {
    ApiResponse<DocumentFieldsInformation> localVarResponse = listDocumentFieldsWithHttpInfo(accountId, templateId, documentId);
    return localVarResponse.getData();
  }

  /**
   * Gets the custom document fields for a an existing template document.
   * Retrieves the custom document fields for an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentFieldsInformation > listDocumentFieldsWithHttpInfo(String accountId, String templateId, String documentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocumentFields");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling listDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling listDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    DocumentFieldsInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentFieldsInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets a list of documents associated with a template. Retrieves a list of documents associated with the specified template.
  /// </summary>

 /**
  * ListDocumentsOptions Class.
  *
  **/
  public class ListDocumentsOptions
  {
  private String includeTabs = null;
  
 /**
  * setIncludeTabs method.
  */
  public void setIncludeTabs(String includeTabs) {
    this.includeTabs = includeTabs;
  }

 /**
  * getIncludeTabs method.
  *
  * @return String
  */
  public String getIncludeTabs() {
    return this.includeTabs;
  }
  }

   /**
   * Gets a list of documents associated with a template..
   * Retrieves a list of documents associated with the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return TemplateDocumentsResult
   */ 
  public TemplateDocumentsResult listDocuments(String accountId, String templateId) throws ApiException {
    return listDocuments(accountId, templateId, null);
  }

  /**
   * Gets a list of documents associated with a template..
   * Retrieves a list of documents associated with the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param options for modifying the method behavior.
   * @return TemplateDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public TemplateDocumentsResult listDocuments(String accountId, String templateId, TemplatesApi.ListDocumentsOptions options) throws ApiException {
    ApiResponse<TemplateDocumentsResult> localVarResponse = listDocumentsWithHttpInfo(accountId, templateId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a list of documents associated with a template.
   * Retrieves a list of documents associated with the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param options for modifying the method behavior.
   * @return TemplateDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TemplateDocumentsResult > listDocumentsWithHttpInfo(String accountId, String templateId, TemplatesApi.ListDocumentsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocuments");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling listDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_tabs", options.includeTabs));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<TemplateDocumentsResult> localVarReturnType = new GenericType<TemplateDocumentsResult>() {};
    TemplateDocumentsResult localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TemplateDocumentsResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets recipient information from a template. Retrieves the information for all recipients in the specified template.
  /// </summary>

 /**
  * ListRecipientsOptions Class.
  *
  **/
  public class ListRecipientsOptions
  {
  private String includeAnchorTabLocations = null;
  private String includeExtended = null;
  private String includeTabs = null;
  
 /**
  * setIncludeAnchorTabLocations method.
  */
  public void setIncludeAnchorTabLocations(String includeAnchorTabLocations) {
    this.includeAnchorTabLocations = includeAnchorTabLocations;
  }

 /**
  * getIncludeAnchorTabLocations method.
  *
  * @return String
  */
  public String getIncludeAnchorTabLocations() {
    return this.includeAnchorTabLocations;
  }
  
 /**
  * setIncludeExtended method.
  */
  public void setIncludeExtended(String includeExtended) {
    this.includeExtended = includeExtended;
  }

 /**
  * getIncludeExtended method.
  *
  * @return String
  */
  public String getIncludeExtended() {
    return this.includeExtended;
  }
  
 /**
  * setIncludeTabs method.
  */
  public void setIncludeTabs(String includeTabs) {
    this.includeTabs = includeTabs;
  }

 /**
  * getIncludeTabs method.
  *
  * @return String
  */
  public String getIncludeTabs() {
    return this.includeTabs;
  }
  }

   /**
   * Gets recipient information from a template..
   * Retrieves the information for all recipients in the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return Recipients
   */ 
  public Recipients listRecipients(String accountId, String templateId) throws ApiException {
    return listRecipients(accountId, templateId, null);
  }

  /**
   * Gets recipient information from a template..
   * Retrieves the information for all recipients in the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients listRecipients(String accountId, String templateId, TemplatesApi.ListRecipientsOptions options) throws ApiException {
    ApiResponse<Recipients> localVarResponse = listRecipientsWithHttpInfo(accountId, templateId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets recipient information from a template.
   * Retrieves the information for all recipients in the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recipients > listRecipientsWithHttpInfo(String accountId, String templateId, TemplatesApi.ListRecipientsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listRecipients");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling listRecipients");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_anchor_tab_locations", options.includeAnchorTabLocations));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_extended", options.includeExtended));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_tabs", options.includeTabs));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    Recipients localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Recipients>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the tabs information for a signer or sign-in-person recipient in a template. Gets the tabs information for a signer or sign-in-person recipient in a template.
  /// </summary>

 /**
  * ListTabsOptions Class.
  *
  **/
  public class ListTabsOptions
  {
  private String includeAnchorTabLocations = null;
  private String includeMetadata = null;
  
 /**
  * setIncludeAnchorTabLocations method.
  */
  public void setIncludeAnchorTabLocations(String includeAnchorTabLocations) {
    this.includeAnchorTabLocations = includeAnchorTabLocations;
  }

 /**
  * getIncludeAnchorTabLocations method.
  *
  * @return String
  */
  public String getIncludeAnchorTabLocations() {
    return this.includeAnchorTabLocations;
  }
  
 /**
  * setIncludeMetadata method.
  */
  public void setIncludeMetadata(String includeMetadata) {
    this.includeMetadata = includeMetadata;
  }

 /**
  * getIncludeMetadata method.
  *
  * @return String
  */
  public String getIncludeMetadata() {
    return this.includeMetadata;
  }
  }

   /**
   * Gets the tabs information for a signer or sign-in-person recipient in a template..
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return Tabs
   */ 
  public Tabs listTabs(String accountId, String templateId, String recipientId) throws ApiException {
    return listTabs(accountId, templateId, recipientId, null);
  }

  /**
   * Gets the tabs information for a signer or sign-in-person recipient in a template..
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs listTabs(String accountId, String templateId, String recipientId, TemplatesApi.ListTabsOptions options) throws ApiException {
    ApiResponse<Tabs> localVarResponse = listTabsWithHttpInfo(accountId, templateId, recipientId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > listTabsWithHttpInfo(String accountId, String templateId, String recipientId, TemplatesApi.ListTabsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTabs");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling listTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling listTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_anchor_tab_locations", options.includeAnchorTabLocations));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_metadata", options.includeMetadata));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    Tabs localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Tabs>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the definition of a template. Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
  /// </summary>

 /**
  * ListTemplatesOptions Class.
  *
  **/
  public class ListTemplatesOptions
  {
  private String count = null;
  private String createdFromDate = null;
  private String createdToDate = null;
  private String folderIds = null;
  private String folderTypes = null;
  private String fromDate = null;
  private String include = null;
  private String isDeletedTemplateOnly = null;
  private String isDownload = null;
  private String modifiedFromDate = null;
  private String modifiedToDate = null;
  private String order = null;
  private String orderBy = null;
  private String searchFields = null;
  private String searchText = null;
  private String sharedByMe = null;
  private String startPosition = null;
  private String templateIds = null;
  private String toDate = null;
  private String usedFromDate = null;
  private String usedToDate = null;
  private String userFilter = null;
  private String userId = null;
  
 /**
  * setCount method.
  */
  public void setCount(String count) {
    this.count = count;
  }

 /**
  * getCount method.
  *
  * @return String
  */
  public String getCount() {
    return this.count;
  }
  
 /**
  * setCreatedFromDate method.
  */
  public void setCreatedFromDate(String createdFromDate) {
    this.createdFromDate = createdFromDate;
  }

 /**
  * getCreatedFromDate method.
  *
  * @return String
  */
  public String getCreatedFromDate() {
    return this.createdFromDate;
  }
  
 /**
  * setCreatedToDate method.
  */
  public void setCreatedToDate(String createdToDate) {
    this.createdToDate = createdToDate;
  }

 /**
  * getCreatedToDate method.
  *
  * @return String
  */
  public String getCreatedToDate() {
    return this.createdToDate;
  }
  
 /**
  * setFolderIds method.
  */
  public void setFolderIds(String folderIds) {
    this.folderIds = folderIds;
  }

 /**
  * getFolderIds method.
  *
  * @return String
  */
  public String getFolderIds() {
    return this.folderIds;
  }
  
 /**
  * setFolderTypes method.
  */
  public void setFolderTypes(String folderTypes) {
    this.folderTypes = folderTypes;
  }

 /**
  * getFolderTypes method.
  *
  * @return String
  */
  public String getFolderTypes() {
    return this.folderTypes;
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
  * setInclude method.
  */
  public void setInclude(String include) {
    this.include = include;
  }

 /**
  * getInclude method.
  *
  * @return String
  */
  public String getInclude() {
    return this.include;
  }
  
 /**
  * setIsDeletedTemplateOnly method.
  */
  public void setIsDeletedTemplateOnly(String isDeletedTemplateOnly) {
    this.isDeletedTemplateOnly = isDeletedTemplateOnly;
  }

 /**
  * getIsDeletedTemplateOnly method.
  *
  * @return String
  */
  public String getIsDeletedTemplateOnly() {
    return this.isDeletedTemplateOnly;
  }
  
 /**
  * setIsDownload method.
  */
  public void setIsDownload(String isDownload) {
    this.isDownload = isDownload;
  }

 /**
  * getIsDownload method.
  *
  * @return String
  */
  public String getIsDownload() {
    return this.isDownload;
  }
  
 /**
  * setModifiedFromDate method.
  */
  public void setModifiedFromDate(String modifiedFromDate) {
    this.modifiedFromDate = modifiedFromDate;
  }

 /**
  * getModifiedFromDate method.
  *
  * @return String
  */
  public String getModifiedFromDate() {
    return this.modifiedFromDate;
  }
  
 /**
  * setModifiedToDate method.
  */
  public void setModifiedToDate(String modifiedToDate) {
    this.modifiedToDate = modifiedToDate;
  }

 /**
  * getModifiedToDate method.
  *
  * @return String
  */
  public String getModifiedToDate() {
    return this.modifiedToDate;
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
  * setSharedByMe method.
  */
  public void setSharedByMe(String sharedByMe) {
    this.sharedByMe = sharedByMe;
  }

 /**
  * getSharedByMe method.
  *
  * @return String
  */
  public String getSharedByMe() {
    return this.sharedByMe;
  }
  
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
  
 /**
  * setTemplateIds method.
  */
  public void setTemplateIds(String templateIds) {
    this.templateIds = templateIds;
  }

 /**
  * getTemplateIds method.
  *
  * @return String
  */
  public String getTemplateIds() {
    return this.templateIds;
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
  
 /**
  * setUsedFromDate method.
  */
  public void setUsedFromDate(String usedFromDate) {
    this.usedFromDate = usedFromDate;
  }

 /**
  * getUsedFromDate method.
  *
  * @return String
  */
  public String getUsedFromDate() {
    return this.usedFromDate;
  }
  
 /**
  * setUsedToDate method.
  */
  public void setUsedToDate(String usedToDate) {
    this.usedToDate = usedToDate;
  }

 /**
  * getUsedToDate method.
  *
  * @return String
  */
  public String getUsedToDate() {
    return this.usedToDate;
  }
  
 /**
  * setUserFilter method.
  */
  public void setUserFilter(String userFilter) {
    this.userFilter = userFilter;
  }

 /**
  * getUserFilter method.
  *
  * @return String
  */
  public String getUserFilter() {
    return this.userFilter;
  }
  
 /**
  * setUserId method.
  */
  public void setUserId(String userId) {
    this.userId = userId;
  }

 /**
  * getUserId method.
  *
  * @return String
  */
  public String getUserId() {
    return this.userId;
  }
  }

   /**
   * Gets the definition of a template..
   * Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return EnvelopeTemplateResults
   */ 
  public EnvelopeTemplateResults listTemplates(String accountId) throws ApiException {
    return listTemplates(accountId, null);
  }

  /**
   * Gets the definition of a template..
   * Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopeTemplateResults
   * @throws ApiException if fails to make API call
   */
  public EnvelopeTemplateResults listTemplates(String accountId, TemplatesApi.ListTemplatesOptions options) throws ApiException {
    ApiResponse<EnvelopeTemplateResults> localVarResponse = listTemplatesWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the definition of a template.
   * Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopeTemplateResults
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeTemplateResults > listTemplatesWithHttpInfo(String accountId, TemplatesApi.ListTemplatesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("created_from_date", options.createdFromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("created_to_date", options.createdToDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("folder_ids", options.folderIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("folder_types", options.folderTypes));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("is_deleted_template_only", options.isDeletedTemplateOnly));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("is_download", options.isDownload));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("modified_from_date", options.modifiedFromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("modified_to_date", options.modifiedToDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order", options.order));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order_by", options.orderBy));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_fields", options.searchFields));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_text", options.searchText));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("shared_by_me", options.sharedByMe));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("template_ids", options.templateIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("used_from_date", options.usedFromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("used_to_date", options.usedToDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_filter", options.userFilter));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_id", options.userId));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<EnvelopeTemplateResults> localVarReturnType = new GenericType<EnvelopeTemplateResults>() {};
    EnvelopeTemplateResults localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeTemplateResults>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Rotates page image from a template for display..
   * Rotates page image from a template for display. The page image can be rotated to the left or right.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param pageRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public void rotateDocumentPage(String accountId, String templateId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
    rotateDocumentPageWithHttpInfo(accountId, templateId, documentId, pageNumber, pageRequest);
  }

  /**
   * Rotates page image from a template for display.
   * Rotates page image from a template for display. The page image can be rotated to the left or right.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param pageRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> rotateDocumentPageWithHttpInfo(String accountId, String templateId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
    Object localVarPostBody = pageRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling rotateDocumentPage");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling rotateDocumentPage");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling rotateDocumentPage");
    }
    
    // verify the required parameter 'pageNumber' is set
    if (pageNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling rotateDocumentPage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}/page_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Updates an existing template..
   * Updates an existing template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param envelopeTemplate  (optional)
   * @return TemplateUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public TemplateUpdateSummary update(String accountId, String templateId, EnvelopeTemplate envelopeTemplate) throws ApiException {
    ApiResponse<TemplateUpdateSummary> localVarResponse = updateWithHttpInfo(accountId, templateId, envelopeTemplate);
    return localVarResponse.getData();
  }

  /**
   * Updates an existing template.
   * Updates an existing template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param envelopeTemplate  (optional)
   * @return TemplateUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TemplateUpdateSummary > updateWithHttpInfo(String accountId, String templateId, EnvelopeTemplate envelopeTemplate) throws ApiException {
    Object localVarPostBody = envelopeTemplate;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling update");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling update");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<TemplateUpdateSummary> localVarReturnType = new GenericType<TemplateUpdateSummary>() {};
    TemplateUpdateSummary localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TemplateUpdateSummary>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates envelope custom fields in a template..
   * Updates the custom fields in a template.  Each custom field used in a template must have a unique name.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateCustomFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields updateCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
    ApiResponse<CustomFields> localVarResponse = updateCustomFieldsWithHttpInfo(accountId, templateId, templateCustomFields);
    return localVarResponse.getData();
  }

  /**
   * Updates envelope custom fields in a template.
   * Updates the custom fields in a template.  Each custom field used in a template must have a unique name.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateCustomFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomFields > updateCustomFieldsWithHttpInfo(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
    Object localVarPostBody = templateCustomFields;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateCustomFields");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    CustomFields localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CustomFields>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Adds a document to a template document. Adds the specified document to an existing template document.
  /// </summary>

 /**
  * UpdateDocumentOptions Class.
  *
  **/
  public class UpdateDocumentOptions
  {
  private String isEnvelopeDefinition = null;
  
 /**
  * setIsEnvelopeDefinition method.
  */
  public void setIsEnvelopeDefinition(String isEnvelopeDefinition) {
    this.isEnvelopeDefinition = isEnvelopeDefinition;
  }

 /**
  * getIsEnvelopeDefinition method.
  *
  * @return String
  */
  public String getIsEnvelopeDefinition() {
    return this.isEnvelopeDefinition;
  }
  }

   /**
   * Adds a document to a template document..
   * Adds the specified document to an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return EnvelopeDocument
   */ 
  public EnvelopeDocument updateDocument(String accountId, String templateId, String documentId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    return updateDocument(accountId, templateId, documentId, envelopeDefinition, null);
  }

  /**
   * Adds a document to a template document..
   * Adds the specified document to an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return EnvelopeDocument
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocument updateDocument(String accountId, String templateId, String documentId, EnvelopeDefinition envelopeDefinition, TemplatesApi.UpdateDocumentOptions options) throws ApiException {
    ApiResponse<EnvelopeDocument> localVarResponse = updateDocumentWithHttpInfo(accountId, templateId, documentId, envelopeDefinition, options);
    return localVarResponse.getData();
  }

  /**
   * Adds a document to a template document.
   * Adds the specified document to an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return EnvelopeDocument
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeDocument > updateDocumentWithHttpInfo(String accountId, String templateId, String documentId, EnvelopeDefinition envelopeDefinition, TemplatesApi.UpdateDocumentOptions options) throws ApiException {
    Object localVarPostBody = envelopeDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocument");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("is_envelope_definition", options.isEnvelopeDefinition));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<EnvelopeDocument> localVarReturnType = new GenericType<EnvelopeDocument>() {};
    EnvelopeDocument localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeDocument>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates existing custom document fields in an existing template document..
   * Updates existing custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation updateDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    ApiResponse<DocumentFieldsInformation> localVarResponse = updateDocumentFieldsWithHttpInfo(accountId, templateId, documentId, documentFieldsInformation);
    return localVarResponse.getData();
  }

  /**
   * Updates existing custom document fields in an existing template document.
   * Updates existing custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentFieldsInformation > updateDocumentFieldsWithHttpInfo(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    Object localVarPostBody = documentFieldsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocumentFields");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    DocumentFieldsInformation localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentFieldsInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Adds documents to a template document..
   * Adds one or more documents to an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return TemplateDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public TemplateDocumentsResult updateDocuments(String accountId, String templateId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    ApiResponse<TemplateDocumentsResult> localVarResponse = updateDocumentsWithHttpInfo(accountId, templateId, envelopeDefinition);
    return localVarResponse.getData();
  }

  /**
   * Adds documents to a template document.
   * Adds one or more documents to an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return TemplateDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TemplateDocumentsResult > updateDocumentsWithHttpInfo(String accountId, String templateId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    Object localVarPostBody = envelopeDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocuments");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<TemplateDocumentsResult> localVarReturnType = new GenericType<TemplateDocumentsResult>() {};
    TemplateDocumentsResult localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TemplateDocumentsResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Shares a template with a group.
   * Shares a template with the specified members group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templatePart Currently, the only defined part is **groups**. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public GroupInformation updateGroupShare(String accountId, String templateId, String templatePart, GroupInformation groupInformation) throws ApiException {
    ApiResponse<GroupInformation> localVarResponse = updateGroupShareWithHttpInfo(accountId, templateId, templatePart, groupInformation);
    return localVarResponse.getData();
  }

  /**
   * Shares a template with a group
   * Shares a template with the specified members group.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templatePart Currently, the only defined part is **groups**. (required)
   * @param groupInformation  (optional)
   * @return GroupInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupInformation > updateGroupShareWithHttpInfo(String accountId, String templateId, String templatePart, GroupInformation groupInformation) throws ApiException {
    Object localVarPostBody = groupInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateGroupShare");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateGroupShare");
    }
    
    // verify the required parameter 'templatePart' is set
    if (templatePart == null) {
      throw new ApiException(400, "Missing the required parameter 'templatePart' when calling updateGroupShare");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/{templatePart}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "templatePart" + "\\}", apiClient.escapeString(templatePart.toString()));

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
    
    GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
    GroupInformation localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GroupInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates a template lock..
   * Updates the lock duration time or update the &#x60;lockedByApp&#x60; property information for the specified template. The user and integrator key must match the user specified by the &#x60;lockByUser&#x60; property and integrator key information and the &#x60;X-DocuSign-Edit&#x60; header must be included or an error will be generated.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation updateLock(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
    ApiResponse<LockInformation> localVarResponse = updateLockWithHttpInfo(accountId, templateId, lockRequest);
    return localVarResponse.getData();
  }

  /**
   * Updates a template lock.
   * Updates the lock duration time or update the &#x60;lockedByApp&#x60; property information for the specified template. The user and integrator key must match the user specified by the &#x60;lockByUser&#x60; property and integrator key information and the &#x60;X-DocuSign-Edit&#x60; header must be included or an error will be generated.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LockInformation > updateLockWithHttpInfo(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
    Object localVarPostBody = lockRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateLock");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    LockInformation localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<LockInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the notification  structure for an existing template..
   * Updates the notification structure for an existing template. Use this endpoint to set reminder and expiration notifications.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateNotificationRequest  (optional)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public Notification updateNotificationSettings(String accountId, String templateId, TemplateNotificationRequest templateNotificationRequest) throws ApiException {
    ApiResponse<Notification> localVarResponse = updateNotificationSettingsWithHttpInfo(accountId, templateId, templateNotificationRequest);
    return localVarResponse.getData();
  }

  /**
   * Updates the notification  structure for an existing template.
   * Updates the notification structure for an existing template. Use this endpoint to set reminder and expiration notifications.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateNotificationRequest  (optional)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Notification > updateNotificationSettingsWithHttpInfo(String accountId, String templateId, TemplateNotificationRequest templateNotificationRequest) throws ApiException {
    Object localVarPostBody = templateNotificationRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateNotificationSettings");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateNotificationSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/notification"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
    
    GenericType<Notification> localVarReturnType = new GenericType<Notification>() {};
    Notification localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Notification>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Updates recipients in a template. Updates recipients in a template.   You can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.
  /// </summary>

 /**
  * UpdateRecipientsOptions Class.
  *
  **/
  public class UpdateRecipientsOptions
  {
  private String resendEnvelope = null;
  
 /**
  * setResendEnvelope method.
  */
  public void setResendEnvelope(String resendEnvelope) {
    this.resendEnvelope = resendEnvelope;
  }

 /**
  * getResendEnvelope method.
  *
  * @return String
  */
  public String getResendEnvelope() {
    return this.resendEnvelope;
  }
  }

   /**
   * Updates recipients in a template..
   * Updates recipients in a template.   You can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateRecipients  (optional)
   * @return RecipientsUpdateSummary
   */ 
  public RecipientsUpdateSummary updateRecipients(String accountId, String templateId, TemplateRecipients templateRecipients) throws ApiException {
    return updateRecipients(accountId, templateId, templateRecipients, null);
  }

  /**
   * Updates recipients in a template..
   * Updates recipients in a template.   You can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateRecipients  (optional)
   * @param options for modifying the method behavior.
   * @return RecipientsUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public RecipientsUpdateSummary updateRecipients(String accountId, String templateId, TemplateRecipients templateRecipients, TemplatesApi.UpdateRecipientsOptions options) throws ApiException {
    ApiResponse<RecipientsUpdateSummary> localVarResponse = updateRecipientsWithHttpInfo(accountId, templateId, templateRecipients, options);
    return localVarResponse.getData();
  }

  /**
   * Updates recipients in a template.
   * Updates recipients in a template.   You can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateRecipients  (optional)
   * @param options for modifying the method behavior.
   * @return RecipientsUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RecipientsUpdateSummary > updateRecipientsWithHttpInfo(String accountId, String templateId, TemplateRecipients templateRecipients, TemplatesApi.UpdateRecipientsOptions options) throws ApiException {
    Object localVarPostBody = templateRecipients;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipients");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateRecipients");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("resend_envelope", options.resendEnvelope));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<RecipientsUpdateSummary> localVarReturnType = new GenericType<RecipientsUpdateSummary>() {};
    RecipientsUpdateSummary localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RecipientsUpdateSummary>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the tabs for a recipient..
   * Updates one or more tabs for a recipient in a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs updateTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = updateTabsWithHttpInfo(accountId, templateId, recipientId, templateTabs);
    return localVarResponse.getData();
  }

  /**
   * Updates the tabs for a recipient.
   * Updates one or more tabs for a recipient in a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > updateTabsWithHttpInfo(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
    Object localVarPostBody = templateTabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTabs");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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
    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    Tabs localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Tabs>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the tabs for a template.
   * Updates tabs in the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs updateTemplateDocumentTabs(String accountId, String templateId, String documentId, TemplateTabs templateTabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = updateTemplateDocumentTabsWithHttpInfo(accountId, templateId, documentId, templateTabs);
    return localVarResponse.getData();
  }

  /**
   * Updates the tabs for a template
   * Updates tabs in the document specified by &#x60;documentId&#x60; in the template specified by &#x60;templateId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param templateTabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > updateTemplateDocumentTabsWithHttpInfo(String accountId, String templateId, String documentId, TemplateTabs templateTabs) throws ApiException {
    Object localVarPostBody = templateTabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateDocumentTabs");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateTemplateDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    Tabs localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Tabs>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Update template autoMatch setting..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateAutoMatchList  (optional)
   * @return TemplateAutoMatchList
   * @throws ApiException if fails to make API call
   */
  public TemplateAutoMatchList updateTemplates(String accountId, TemplateAutoMatchList templateAutoMatchList) throws ApiException {
    ApiResponse<TemplateAutoMatchList> localVarResponse = updateTemplatesWithHttpInfo(accountId, templateAutoMatchList);
    return localVarResponse.getData();
  }

  /**
   * Update template autoMatch setting.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateAutoMatchList  (optional)
   * @return TemplateAutoMatchList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TemplateAutoMatchList > updateTemplatesWithHttpInfo(String accountId, TemplateAutoMatchList templateAutoMatchList) throws ApiException {
    Object localVarPostBody = templateAutoMatchList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates"
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
    
    GenericType<TemplateAutoMatchList> localVarReturnType = new GenericType<TemplateAutoMatchList>() {};
    TemplateAutoMatchList localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TemplateAutoMatchList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Update template autoMatch setting..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateAutoMatchList  (optional)
   * @return TemplateAutoMatchList
   * @throws ApiException if fails to make API call
   */
  public TemplateAutoMatchList updateTemplatesAutoMatch(String accountId, TemplateAutoMatchList templateAutoMatchList) throws ApiException {
    ApiResponse<TemplateAutoMatchList> localVarResponse = updateTemplatesAutoMatchWithHttpInfo(accountId, templateAutoMatchList);
    return localVarResponse.getData();
  }

  /**
   * Update template autoMatch setting.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateAutoMatchList  (optional)
   * @return TemplateAutoMatchList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TemplateAutoMatchList > updateTemplatesAutoMatchWithHttpInfo(String accountId, TemplateAutoMatchList templateAutoMatchList) throws ApiException {
    Object localVarPostBody = templateAutoMatchList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplatesAutoMatch");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/auto_match"
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
    
    GenericType<TemplateAutoMatchList> localVarReturnType = new GenericType<TemplateAutoMatchList>() {};
    TemplateAutoMatchList localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TemplateAutoMatchList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
