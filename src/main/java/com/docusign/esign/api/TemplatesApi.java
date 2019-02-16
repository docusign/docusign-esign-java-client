package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.BulkRecipientsRequest;
import com.docusign.esign.model.BulkRecipientsResponse;
import com.docusign.esign.model.BulkRecipientsSummaryResponse;
import com.docusign.esign.model.BulkRecipientsUpdateResponse;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.DocumentFieldsInformation;
import com.docusign.esign.model.DocumentHtmlDefinition;
import com.docusign.esign.model.DocumentHtmlDefinitionOriginals;
import com.docusign.esign.model.DocumentHtmlDefinitions;
import com.docusign.esign.model.EnvelopeDefinition;
import com.docusign.esign.model.EnvelopeDocument;
import com.docusign.esign.model.EnvelopeTemplate;
import com.docusign.esign.model.EnvelopeTemplateResults;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.GroupInformation;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.LockRequest;
import com.docusign.esign.model.Notification;
import com.docusign.esign.model.PageImages;
import com.docusign.esign.model.PageRequest;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.RecipientsUpdateSummary;
import com.docusign.esign.model.ReturnUrlRequest;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.TemplateCustomFields;
import com.docusign.esign.model.TemplateDocumentsResult;
import com.docusign.esign.model.TemplateNotificationRequest;
import com.docusign.esign.model.TemplateRecipients;
import com.docusign.esign.model.TemplateSummary;
import com.docusign.esign.model.TemplateTabs;
import com.docusign.esign.model.TemplateUpdateSummary;
import com.docusign.esign.model.ViewUrl;




  public class TemplatesApi {
  private ApiClient apiClient;

  public TemplatesApi() {
  this(Configuration.getDefaultApiClient());
  }

  public TemplatesApi(ApiClient apiClient) {
  this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
  return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
  this.apiClient = apiClient;
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
  public CustomFields createCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public DocumentFieldsInformation createDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

        GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Provides a URL to start an edit view of the Template UI
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param returnUrlRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createEditView(String accountId, String templateId, ReturnUrlRequest returnUrlRequest) throws ApiException {
    Object localVarPostBody = returnUrlRequest;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEditView");
      }
    
      // verify the required parameter 'templateId' is set
      if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createEditView");
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public LockInformation createLock(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/lock".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Adds tabs for a recipient. Adds one or more recipients to a template.
  /// </summary>
  public class CreateRecipientsOptions
  {
  private String resendEnvelope = null;
  /*
   * 
   */
  public void setResendEnvelope(String resendEnvelope) {
    this.resendEnvelope = resendEnvelope;
  }
  
  public String getResendEnvelope() {
    return this.resendEnvelope;
  }
  }

   /**
   * Adds tabs for a recipient.
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
   * Adds tabs for a recipient.
   * Adds one or more recipients to a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateRecipients  (optional)
   * @param options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients createRecipients(String accountId, String templateId, TemplateRecipients templateRecipients, TemplatesApi.CreateRecipientsOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "resend_envelope", options.resendEnvelope));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public Tabs createTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

        GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Creates an envelope from a template.
   * Creates a template definition using a multipart request.  ###Template Email Subject Merge Fields  Call this endpoint to insert a recipient name and email address merge fields into the email subject line when creating or sending from a template.  The merge fields, based on the recipient&#39;s role name, are added to the &#x60;emailSubject&#x60; property when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.  Both the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient. ###### Note: If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.  To add a recipient&#39;s name in the subject line add the following text in the &#x60;emailSubject&#x60; property when creating the template or when sending an envelope from a template:  [[&lt;roleName&gt;_UserName]]  Example:  &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,&#x60;  To add a recipient&#39;s email address in the subject line add the following text in the &#x60;emailSubject&#x60; property when creating the template or when sending an envelope from a template:  [[&lt;roleName&gt;_Email]]  Example:  &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,&#x60;   In both cases the &lt;roleName&gt; is the recipient&#39;s contents of the &#x60;roleName&#x60; property in the template.  For cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTemplate  (optional)
   * @return TemplateSummary
   * @throws ApiException if fails to make API call
   */
  public TemplateSummary createTemplate(String accountId, EnvelopeTemplate envelopeTemplate) throws ApiException {
    Object localVarPostBody = envelopeTemplate;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTemplate");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/templates".replaceAll("\\{format\\}","json")
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

        GenericType<TemplateSummary> localVarReturnType = new GenericType<TemplateSummary>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Post Responsive HTML Preview for a document in a template.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitions createTemplateDocumentResponsiveHtmlPreview(String accountId, String templateId, String documentId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/responsive_html_preview".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

        GenericType<DocumentHtmlDefinitions> localVarReturnType = new GenericType<DocumentHtmlDefinitions>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Get Responsive HTML Preview for all documents in a template.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitions createTemplateResponsiveHtmlPreview(String accountId, String templateId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/responsive_html_preview".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<DocumentHtmlDefinitions> localVarReturnType = new GenericType<DocumentHtmlDefinitions>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Deletes the bulk recipient list on a template.
   * Deletes the bulk recipient list on a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return BulkRecipientsUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public BulkRecipientsUpdateResponse deleteBulkRecipients(String accountId, String templateId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBulkRecipients");
      }
    
      // verify the required parameter 'templateId' is set
      if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteBulkRecipients");
      }
    
      // verify the required parameter 'recipientId' is set
      if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteBulkRecipients");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

        GenericType<BulkRecipientsUpdateResponse> localVarReturnType = new GenericType<BulkRecipientsUpdateResponse>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public CustomFields deleteCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public DocumentFieldsInformation deleteDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

        GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public void deleteDocumentPage(String accountId, String templateId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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


      apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
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
  public TemplateDocumentsResult deleteDocuments(String accountId, String templateId, EnvelopeDefinition envelopeDefinition) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<TemplateDocumentsResult> localVarReturnType = new GenericType<TemplateDocumentsResult>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public GroupInformation deleteGroupShare(String accountId, String templateId, String templatePart, GroupInformation groupInformation) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/{templatePart}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "templatePart" + "\\}", apiClient.escapeString(templatePart.toString()));

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

        GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public LockInformation deleteLock(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/lock".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public Recipients deleteRecipient(String accountId, String templateId, String recipientId, TemplateRecipients templateRecipients) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

        GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public Recipients deleteRecipients(String accountId, String templateId, TemplateRecipients templateRecipients) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public Tabs deleteTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

        GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets a list of templates for a specified account. Retrieves the definition of the specified template.
  /// </summary>
  public class GetOptions
  {
  private String include = null;
  /*
   * 
   */
  public void setInclude(String include) {
    this.include = include;
  }
  
  public String getInclude() {
    return this.include;
  }
  }

   /**
   * Gets a list of templates for a specified account.
   * Retrieves the definition of the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return EnvelopeTemplate
   */ 
  public EnvelopeTemplate get(String accountId, String templateId) throws ApiException {
    return get(accountId, templateId, null);
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
  public EnvelopeTemplate get(String accountId, String templateId, TemplatesApi.GetOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<EnvelopeTemplate> localVarReturnType = new GenericType<EnvelopeTemplate>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets PDF documents from a template. Retrieves one or more PDF documents from the specified template.  You can specify the ID of the document to retrieve or can specify &#x60;combined&#x60; to retrieve all documents in the template as one pdf.
  /// </summary>
  public class GetDocumentOptions
  {
  private String encrypt = null;
  private String showChanges = null;
  /*
   * 
   */
  public void setEncrypt(String encrypt) {
    this.encrypt = encrypt;
  }
  
  public String getEncrypt() {
    return this.encrypt;
  }
  /*
   * 
   */
  public void setShowChanges(String showChanges) {
    this.showChanges = showChanges;
  }
  
  public String getShowChanges() {
    return this.showChanges;
  }
  }

   /**
   * Gets PDF documents from a template.
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
   * Gets PDF documents from a template.
   * Retrieves one or more PDF documents from the specified template.  You can specify the ID of the document to retrieve or can specify &#x60;combined&#x60; to retrieve all documents in the template as one pdf.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getDocument(String accountId, String templateId, String documentId, TemplatesApi.GetDocumentOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "encrypt", options.encrypt));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_changes", options.showChanges));
    }
    
    
      final String[] localVarAccepts = {
    "application/pdf"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets a page image from a template for display. Retrieves a page image for display from the specified template.
  /// </summary>
  public class GetDocumentPageImageOptions
  {
  private String dpi = null;
  private String maxHeight = null;
  private String maxWidth = null;
  private String showChanges = null;
  /*
   * 
   */
  public void setDpi(String dpi) {
    this.dpi = dpi;
  }
  
  public String getDpi() {
    return this.dpi;
  }
  /*
   * 
   */
  public void setMaxHeight(String maxHeight) {
    this.maxHeight = maxHeight;
  }
  
  public String getMaxHeight() {
    return this.maxHeight;
  }
  /*
   * 
   */
  public void setMaxWidth(String maxWidth) {
    this.maxWidth = maxWidth;
  }
  
  public String getMaxWidth() {
    return this.maxWidth;
  }
  /*
   * 
   */
  public void setShowChanges(String showChanges) {
    this.showChanges = showChanges;
  }
  
  public String getShowChanges() {
    return this.showChanges;
  }
  }

   /**
   * Gets a page image from a template for display.
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
  public byte[] getDocumentPageImage(String accountId, String templateId, String documentId, String pageNumber, TemplatesApi.GetDocumentPageImageOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}/page_image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "dpi", options.dpi));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "max_height", options.maxHeight));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "max_width", options.maxWidth));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_changes", options.showChanges));
    }
    
    
      final String[] localVarAccepts = {
    "image/png"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Returns tabs on the document. 
  /// </summary>
  public class GetDocumentTabsOptions
  {
  private String pageNumbers = null;
  /*
   * 
   */
  public void setPageNumbers(String pageNumbers) {
    this.pageNumbers = pageNumbers;
  }
  
  public String getPageNumbers() {
    return this.pageNumbers;
  }
  }

   /**
   * Returns tabs on the document.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return Tabs
   */ 
  public Tabs getDocumentTabs(String accountId, String templateId, String documentId) throws ApiException {
    return getDocumentTabs(accountId, templateId, documentId, null);
  }

  /**
   * Returns tabs on the document.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs getDocumentTabs(String accountId, String templateId, String documentId, TemplatesApi.GetDocumentTabsOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_numbers", options.pageNumbers));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Gets template lock information.
   * Retrieves general information about the template lock.  If the call is made by the user who has the lock and the request has the same integrator key as original, then the &#x60;X-DocuSign-Edit&#x60; header  field and additional lock information is included in the response. This allows users to recover a lost editing session token and the &#x60;X-DocuSign-Edit&#x60; header.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation getLock(String accountId, String templateId) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/lock".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Gets template notification information.
   * Retrieves the envelope notification, reminders and expirations, information for an existing template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public Notification getNotificationSettings(String accountId, String templateId) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/notification".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<Notification> localVarReturnType = new GenericType<Notification>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Returns tabs on the specified page.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs getPageTabs(String accountId, String templateId, String documentId, String pageNumber) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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

        GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Returns document page image(s) based on input. 
  /// </summary>
  public class GetPagesOptions
  {
  private String count = null;
  private String dpi = null;
  private String maxHeight = null;
  private String maxWidth = null;
  private String nocache = null;
  private String showChanges = null;
  private String startPosition = null;
  /*
   * 
   */
  public void setCount(String count) {
    this.count = count;
  }
  
  public String getCount() {
    return this.count;
  }
  /*
   * 
   */
  public void setDpi(String dpi) {
    this.dpi = dpi;
  }
  
  public String getDpi() {
    return this.dpi;
  }
  /*
   * 
   */
  public void setMaxHeight(String maxHeight) {
    this.maxHeight = maxHeight;
  }
  
  public String getMaxHeight() {
    return this.maxHeight;
  }
  /*
   * 
   */
  public void setMaxWidth(String maxWidth) {
    this.maxWidth = maxWidth;
  }
  
  public String getMaxWidth() {
    return this.maxWidth;
  }
  /*
   * 
   */
  public void setNocache(String nocache) {
    this.nocache = nocache;
  }
  
  public String getNocache() {
    return this.nocache;
  }
  /*
   * 
   */
  public void setShowChanges(String showChanges) {
    this.showChanges = showChanges;
  }
  
  public String getShowChanges() {
    return this.showChanges;
  }
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
   * Returns document page image(s) based on input.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return PageImages
   */ 
  public PageImages getPages(String accountId, String templateId, String documentId) throws ApiException {
    return getPages(accountId, templateId, documentId, null);
  }

  /**
   * Returns document page image(s) based on input.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return PageImages
   * @throws ApiException if fails to make API call
   */
  public PageImages getPages(String accountId, String templateId, String documentId, TemplatesApi.GetPagesOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "dpi", options.dpi));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "max_height", options.maxHeight));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "max_width", options.maxWidth));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "nocache", options.nocache));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_changes", options.showChanges));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<PageImages> localVarReturnType = new GenericType<PageImages>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public DocumentHtmlDefinitionOriginals getTemplateDocumentHtmlDefinitions(String accountId, String templateId, String documentId) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/html_definitions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

        GenericType<DocumentHtmlDefinitionOriginals> localVarReturnType = new GenericType<DocumentHtmlDefinitionOriginals>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Get the Original HTML Definition used to generate the Responsive HTML for the template.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return DocumentHtmlDefinitionOriginals
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitionOriginals getTemplateHtmlDefinitions(String accountId, String templateId) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/html_definitions".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<DocumentHtmlDefinitionOriginals> localVarReturnType = new GenericType<DocumentHtmlDefinitionOriginals>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets the bulk recipient file from a template. Retrieves the bulk recipient file information from a template that has a bulk recipient.
  /// </summary>
  public class ListBulkRecipientsOptions
  {
  private String includeTabs = null;
  private String startPosition = null;
  /*
   * 
   */
  public void setIncludeTabs(String includeTabs) {
    this.includeTabs = includeTabs;
  }
  
  public String getIncludeTabs() {
    return this.includeTabs;
  }
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
   * Gets the bulk recipient file from a template.
   * Retrieves the bulk recipient file information from a template that has a bulk recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return BulkRecipientsResponse
   */ 
  public BulkRecipientsResponse listBulkRecipients(String accountId, String templateId, String recipientId) throws ApiException {
    return listBulkRecipients(accountId, templateId, recipientId, null);
  }

  /**
   * Gets the bulk recipient file from a template.
   * Retrieves the bulk recipient file information from a template that has a bulk recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return BulkRecipientsResponse
   * @throws ApiException if fails to make API call
   */
  public BulkRecipientsResponse listBulkRecipients(String accountId, String templateId, String recipientId, TemplatesApi.ListBulkRecipientsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listBulkRecipients");
      }
    
      // verify the required parameter 'templateId' is set
      if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling listBulkRecipients");
      }
    
      // verify the required parameter 'recipientId' is set
      if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling listBulkRecipients");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_tabs", options.includeTabs));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<BulkRecipientsResponse> localVarReturnType = new GenericType<BulkRecipientsResponse>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Gets the custom document fields from a template.
   * Retrieves the custom document field information from an existing template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields listCustomFields(String accountId, String templateId) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public DocumentFieldsInformation listDocumentFields(String accountId, String templateId, String documentId) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

        GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Gets a list of documents associated with a template.
   * Retrieves a list of documents associated with the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return TemplateDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public TemplateDocumentsResult listDocuments(String accountId, String templateId) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<TemplateDocumentsResult> localVarReturnType = new GenericType<TemplateDocumentsResult>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets recipient information from a template. Retrieves the information for all recipients in the specified template.
  /// </summary>
  public class ListRecipientsOptions
  {
  private String includeAnchorTabLocations = null;
  private String includeExtended = null;
  private String includeTabs = null;
  /*
   *  When set to **true** and &#x60;include_tabs&#x60; is set to **true**, all tabs with anchor tab properties are included in the response.  
   */
  public void setIncludeAnchorTabLocations(String includeAnchorTabLocations) {
    this.includeAnchorTabLocations = includeAnchorTabLocations;
  }
  
  public String getIncludeAnchorTabLocations() {
    return this.includeAnchorTabLocations;
  }
  /*
   *  When set to **true**, the extended properties are included in the response.  
   */
  public void setIncludeExtended(String includeExtended) {
    this.includeExtended = includeExtended;
  }
  
  public String getIncludeExtended() {
    return this.includeExtended;
  }
  /*
   * When set to **true**, the tab information associated with the recipient is included in the response. 
   */
  public void setIncludeTabs(String includeTabs) {
    this.includeTabs = includeTabs;
  }
  
  public String getIncludeTabs() {
    return this.includeTabs;
  }
  }

   /**
   * Gets recipient information from a template.
   * Retrieves the information for all recipients in the specified template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return Recipients
   */ 
  public Recipients listRecipients(String accountId, String templateId) throws ApiException {
    return listRecipients(accountId, templateId, null);
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
  public Recipients listRecipients(String accountId, String templateId, TemplatesApi.ListRecipientsOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_anchor_tab_locations", options.includeAnchorTabLocations));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_extended", options.includeExtended));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_tabs", options.includeTabs));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets the tabs information for a signer or sign-in-person recipient in a template. Gets the tabs information for a signer or sign-in-person recipient in a template.
  /// </summary>
  public class ListTabsOptions
  {
  private String includeAnchorTabLocations = null;
  private String includeMetadata = null;
  /*
   * When set to **true**, all tabs with anchor tab properties are included in the response.  
   */
  public void setIncludeAnchorTabLocations(String includeAnchorTabLocations) {
    this.includeAnchorTabLocations = includeAnchorTabLocations;
  }
  
  public String getIncludeAnchorTabLocations() {
    return this.includeAnchorTabLocations;
  }
  /*
   * 
   */
  public void setIncludeMetadata(String includeMetadata) {
    this.includeMetadata = includeMetadata;
  }
  
  public String getIncludeMetadata() {
    return this.includeMetadata;
  }
  }

   /**
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
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
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs listTabs(String accountId, String templateId, String recipientId, TemplatesApi.ListTabsOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_anchor_tab_locations", options.includeAnchorTabLocations));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_metadata", options.includeMetadata));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Gets the definition of a template. Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
  /// </summary>
  public class ListTemplatesOptions
  {
  private String count = null;
  private String folder = null;
  private String folderIds = null;
  private String fromDate = null;
  private String include = null;
  private String modifiedFromDate = null;
  private String modifiedToDate = null;
  private String order = null;
  private String orderBy = null;
  private String searchText = null;
  private String sharedByMe = null;
  private String startPosition = null;
  private String toDate = null;
  private String usedFromDate = null;
  private String usedToDate = null;
  private String userFilter = null;
  private String userId = null;
  /*
   * Number of records to return in the cache. 
   */
  public void setCount(String count) {
    this.count = count;
  }
  
  public String getCount() {
    return this.count;
  }
  /*
   * The query value can be a folder name or folder ID. The response will only return templates in the specified folder. 
   */
  public void setFolder(String folder) {
    this.folder = folder;
  }
  
  public String getFolder() {
    return this.folder;
  }
  /*
   * A comma separated list of folder ID GUIDs. 
   */
  public void setFolderIds(String folderIds) {
    this.folderIds = folderIds;
  }
  
  public String getFolderIds() {
    return this.folderIds;
  }
  /*
   * Start of the search date range. Only returns templates created on or after this date/time. If no value is specified, there is no limit on the earliest date created. 
   */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }
  
  public String getFromDate() {
    return this.fromDate;
  }
  /*
   * A comma separated list of additional template attributes to include in the response. Valid values are: recipients, folders, documents, custom_fields, and notifications. 
   */
  public void setInclude(String include) {
    this.include = include;
  }
  
  public String getInclude() {
    return this.include;
  }
  /*
   * 
   */
  public void setModifiedFromDate(String modifiedFromDate) {
    this.modifiedFromDate = modifiedFromDate;
  }
  
  public String getModifiedFromDate() {
    return this.modifiedFromDate;
  }
  /*
   * 
   */
  public void setModifiedToDate(String modifiedToDate) {
    this.modifiedToDate = modifiedToDate;
  }
  
  public String getModifiedToDate() {
    return this.modifiedToDate;
  }
  /*
   * Sets the direction order used to sort the list. Valid values are: -asc &#x3D; ascending sort order (a to z)  -desc &#x3D; descending sort order (z to a) 
   */
  public void setOrder(String order) {
    this.order = order;
  }
  
  public String getOrder() {
    return this.order;
  }
  /*
   * Sets the file attribute used to sort the list. Valid values are:  -name: template name  -modified: date/time template was last modified.  -used: date/time the template was last used. 
   */
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }
  
  public String getOrderBy() {
    return this.orderBy;
  }
  /*
   * The search text used to search the names of templates. 
   */
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }
  
  public String getSearchText() {
    return this.searchText;
  }
  /*
   * If true, the response only includes templates shared by the user. If false, the response only returns template not shared by the user. If not specified, the response is not affected. 
   */
  public void setSharedByMe(String sharedByMe) {
    this.sharedByMe = sharedByMe;
  }
  
  public String getSharedByMe() {
    return this.sharedByMe;
  }
  /*
   * The starting index for the first template shown in the response. This must be greater than or equal to 0 (zero). 
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }
  
  public String getStartPosition() {
    return this.startPosition;
  }
  /*
   * End of the search date range. Only returns templates created up to this date/time. If no value is provided, this defaults to the current date. 
   */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }
  
  public String getToDate() {
    return this.toDate;
  }
  /*
   * Start of the search date range. Only returns templates used or edited on or after this date/time. If no value is specified, there is no limit on the earliest date used. 
   */
  public void setUsedFromDate(String usedFromDate) {
    this.usedFromDate = usedFromDate;
  }
  
  public String getUsedFromDate() {
    return this.usedFromDate;
  }
  /*
   * End of the search date range. Only returns templates used or edited up to this date/time. If no value is provided, this defaults to the current date. 
   */
  public void setUsedToDate(String usedToDate) {
    this.usedToDate = usedToDate;
  }
  
  public String getUsedToDate() {
    return this.usedToDate;
  }
  /*
   * Sets if the templates shown in the response Valid values are:  -owned_by_me: only shows templates the user owns.  -shared_with_me: only shows templates that are shared with the user.  -all: shows all templates owned or shared with the user. 
   */
  public void setUserFilter(String userFilter) {
    this.userFilter = userFilter;
  }
  
  public String getUserFilter() {
    return this.userFilter;
  }
  /*
   * 
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }
  
  public String getUserId() {
    return this.userId;
  }
  }

   /**
   * Gets the definition of a template.
   * Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return EnvelopeTemplateResults
   */ 
  public EnvelopeTemplateResults listTemplates(String accountId) throws ApiException {
    return listTemplates(accountId, null);
  }

  /**
   * Gets the definition of a template.
   * Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopeTemplateResults
   * @throws ApiException if fails to make API call
   */
  public EnvelopeTemplateResults listTemplates(String accountId, TemplatesApi.ListTemplatesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTemplates");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/templates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", options.folder));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder_ids", options.folderIds));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "modified_from_date", options.modifiedFromDate));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "modified_to_date", options.modifiedToDate));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_text", options.searchText));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "shared_by_me", options.sharedByMe));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_date", options.toDate));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "used_from_date", options.usedFromDate));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "used_to_date", options.usedToDate));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_filter", options.userFilter));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", options.userId));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<EnvelopeTemplateResults> localVarReturnType = new GenericType<EnvelopeTemplateResults>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public void rotateDocumentPage(String accountId, String templateId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}/page_image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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


      apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
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
  public TemplateUpdateSummary update(String accountId, String templateId, EnvelopeTemplate envelopeTemplate) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<TemplateUpdateSummary> localVarReturnType = new GenericType<TemplateUpdateSummary>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Adds or replaces the bulk recipients list in a template.
   * Updates the bulk recipients in a template using a file upload. The Content-Type supported for uploading a bulk recipient file is CSV (text/csv).  The REST API does not support modifying individual rows or values in the bulk recipients file. It only allows the entire file to be added or replaced with a new file.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param bulkRecipientsRequest  (optional)
   * @return BulkRecipientsSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public BulkRecipientsSummaryResponse updateBulkRecipients(String accountId, String templateId, String recipientId, BulkRecipientsRequest bulkRecipientsRequest) throws ApiException {
    Object localVarPostBody = bulkRecipientsRequest;
    
      // verify the required parameter 'accountId' is set
      if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBulkRecipients");
      }
    
      // verify the required parameter 'templateId' is set
      if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateBulkRecipients");
      }
    
      // verify the required parameter 'recipientId' is set
      if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateBulkRecipients");
      }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/bulk_recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

        GenericType<BulkRecipientsSummaryResponse> localVarReturnType = new GenericType<BulkRecipientsSummaryResponse>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public CustomFields updateCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Adds a document to a template document. Adds the specified document to an existing template document.
  /// </summary>
  public class UpdateDocumentOptions
  {
  private String applyDocumentFields = null;
  private String isEnvelopeDefinition = null;
  /*
   * 
   */
  public void setApplyDocumentFields(String applyDocumentFields) {
    this.applyDocumentFields = applyDocumentFields;
  }
  
  public String getApplyDocumentFields() {
    return this.applyDocumentFields;
  }
  /*
   * 
   */
  public void setIsEnvelopeDefinition(String isEnvelopeDefinition) {
    this.isEnvelopeDefinition = isEnvelopeDefinition;
  }
  
  public String getIsEnvelopeDefinition() {
    return this.isEnvelopeDefinition;
  }
  }

   /**
   * Adds a document to a template document.
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
  public EnvelopeDocument updateDocument(String accountId, String templateId, String documentId, EnvelopeDefinition envelopeDefinition, TemplatesApi.UpdateDocumentOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "apply_document_fields", options.applyDocumentFields));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_envelope_definition", options.isEnvelopeDefinition));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<EnvelopeDocument> localVarReturnType = new GenericType<EnvelopeDocument>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public DocumentFieldsInformation updateDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

        GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Adds documents to a template document. Adds one or more documents to an existing template document.
  /// </summary>
  public class UpdateDocumentsOptions
  {
  private String applyDocumentFields = null;
  private String persistTabs = null;
  /*
   * 
   */
  public void setApplyDocumentFields(String applyDocumentFields) {
    this.applyDocumentFields = applyDocumentFields;
  }
  
  public String getApplyDocumentFields() {
    return this.applyDocumentFields;
  }
  /*
   * 
   */
  public void setPersistTabs(String persistTabs) {
    this.persistTabs = persistTabs;
  }
  
  public String getPersistTabs() {
    return this.persistTabs;
  }
  }

   /**
   * Adds documents to a template document.
   * Adds one or more documents to an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return TemplateDocumentsResult
   */ 
  public TemplateDocumentsResult updateDocuments(String accountId, String templateId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    return updateDocuments(accountId, templateId, envelopeDefinition, null);
  }

  /**
   * Adds documents to a template document.
   * Adds one or more documents to an existing template document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return TemplateDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public TemplateDocumentsResult updateDocuments(String accountId, String templateId, EnvelopeDefinition envelopeDefinition, TemplatesApi.UpdateDocumentsOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "apply_document_fields", options.applyDocumentFields));
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "persist_tabs", options.persistTabs));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<TemplateDocumentsResult> localVarReturnType = new GenericType<TemplateDocumentsResult>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public GroupInformation updateGroupShare(String accountId, String templateId, String templatePart, GroupInformation groupInformation) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/{templatePart}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "templatePart" + "\\}", apiClient.escapeString(templatePart.toString()));

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

        GenericType<GroupInformation> localVarReturnType = new GenericType<GroupInformation>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public LockInformation updateLock(String accountId, String templateId, LockRequest lockRequest) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/lock".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public Notification updateNotificationSettings(String accountId, String templateId, TemplateNotificationRequest templateNotificationRequest) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/notification".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<Notification> localVarReturnType = new GenericType<Notification>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /// <summary>
  /// Updates recipients in a template. Updates recipients in a template.   You can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.
  /// </summary>
  public class UpdateRecipientsOptions
  {
  private String resendEnvelope = null;
  /*
   * 
   */
  public void setResendEnvelope(String resendEnvelope) {
    this.resendEnvelope = resendEnvelope;
  }
  
  public String getResendEnvelope() {
    return this.resendEnvelope;
  }
  }

   /**
   * Updates recipients in a template.
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
   * Updates recipients in a template.
   * Updates recipients in a template.   You can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateRecipients  (optional)
   * @param options for modifying the method behavior.
   * @return RecipientsUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public RecipientsUpdateSummary updateRecipients(String accountId, String templateId, TemplateRecipients templateRecipients, TemplatesApi.UpdateRecipientsOptions options) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "resend_envelope", options.resendEnvelope));
    }
    
    
      final String[] localVarAccepts = {
    "application/json"
      };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
    
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[] { "docusignAccessCode" }; //{  };

        GenericType<RecipientsUpdateSummary> localVarReturnType = new GenericType<RecipientsUpdateSummary>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
  public Tabs updateTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
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
    String localVarPath = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

        GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
    }
