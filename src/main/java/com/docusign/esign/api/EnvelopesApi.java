package com.docusign.esign.api;

import com.sun.jersey.api.client.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;

import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.DocumentTemplateList;
import com.docusign.esign.model.ViewUrl;
import com.docusign.esign.model.ConsoleViewRequest;
import com.docusign.esign.model.CorrectViewRequest;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.DocumentFieldsInformation;
import com.docusign.esign.model.ReturnUrlRequest;
import com.docusign.esign.model.EmailSettings;
import com.docusign.esign.model.EnvelopeSummary;
import com.docusign.esign.model.EnvelopeDefinition;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.LockRequest;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.RecipientViewRequest;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.ViewLinkRequest;
import com.docusign.esign.model.EnvelopeDocumentsResult;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.Notification;
import com.docusign.esign.model.EnvelopeAuditEventResponse;
import com.docusign.esign.model.CustomFieldsEnvelope;
import com.docusign.esign.model.EnvelopesInformation;
import com.docusign.esign.model.EnvelopeIdsRequest;
import com.docusign.esign.model.TemplateInformation;
import com.docusign.esign.model.EnvelopeUpdateSummary;
import com.docusign.esign.model.RecipientsUpdateSummary;


public class EnvelopesApi {
  private ApiClient apiClient;

  public EnvelopesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EnvelopesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  

  

  /**
   * Adds templates to an envelope.
   * Adds templates to the specified envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.ApplyTemplateOptions Options for modifying the method behavior.
   * @return DocumentTemplateList
   * @throws ApiException if fails to make API call
   */
  public DocumentTemplateList applyTemplate(String accountId, String envelopeId, DocumentTemplateList documentTemplateList) throws ApiException {
    Object localVarPostBody = documentTemplateList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling applyTemplate");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling applyTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/templates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<DocumentTemplateList> localVarReturnType = new GenericType<DocumentTemplateList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Adds templates to a document in an  envelope.
   * Adds templates to a document in the specified envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param documentId The ID of the document being accessed.
   
   * EnvelopesApi.ApplyTemplateToDocumentOptions Options for modifying the method behavior.
   * @return DocumentTemplateList
   * @throws ApiException if fails to make API call
   */
  public DocumentTemplateList applyTemplateToDocument(String accountId, String envelopeId, String documentId, DocumentTemplateList documentTemplateList) throws ApiException {
    Object localVarPostBody = documentTemplateList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling applyTemplateToDocument");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling applyTemplateToDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling applyTemplateToDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<DocumentTemplateList> localVarReturnType = new GenericType<DocumentTemplateList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Returns a URL to the authentication view UI.
   * Returns a URL that allows you to embed the authentication view of the DocuSign UI in your applications.
      * @param accountId The external account number (int) or account ID Guid.
   
   * EnvelopesApi.CreateConsoleViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createConsoleView(String accountId, ConsoleViewRequest consoleViewRequest) throws ApiException {
    Object localVarPostBody = consoleViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createConsoleView");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/views/console".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Returns a URL to the envelope correction UI.
   * Returns a URL that allows you to embed the envelope correction view of the DocuSign UI in your applications.\n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.CreateCorrectViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createCorrectView(String accountId, String envelopeId, CorrectViewRequest correctViewRequest) throws ApiException {
    Object localVarPostBody = correctViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createCorrectView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createCorrectView");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/correct".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
  

  

  /**
   * Updates envelope custom fields for an envelope.
   * Updates the envelope custom fields for draft and in-process envelopes.\n\nEach custom field used in an envelope must have a unique name.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.CreateCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields createCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
    Object localVarPostBody = customFields;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createCustomFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Creates custom document fields in an existing envelope document.
   * Creates custom document fields in an existing envelope document.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param documentId The ID of the document being accessed.
   
   * EnvelopesApi.CreateDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation createDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    Object localVarPostBody = documentFieldsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createDocumentFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling createDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Returns a URL to the edit view UI.
   * Returns a URL that allows you to embed the edit view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign editing view. \n\nUpon sending completion, the user is returned to the return URL provided by the API application.\n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.CreateEditViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createEditView(String accountId, String envelopeId, ReturnUrlRequest returnUrlRequest) throws ApiException {
    Object localVarPostBody = returnUrlRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEditView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEditView");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/edit".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
  

  

  /**
   * Adds email setting overrides to an envelope.
   * Adds email override settings, changing the email address to reply to an email address, name, or the BCC for email archive information, for the envelope. Note that adding email settings will only affect email communications that occur after the addition was made.\n\n### Important: The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, use a Carbon Copies or Certified Deliveries Recipient Type.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.CreateEmailSettingsOptions Options for modifying the method behavior.
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings createEmailSettings(String accountId, String envelopeId, EmailSettings emailSettings) throws ApiException {
    Object localVarPostBody = emailSettings;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEmailSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEmailSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  
  /// <summary>
  /// Creates an envelope. Creates an envelope. \n\nUsing this function you can:\n* Create an envelope and send it.\n* Create an envelope from an existing template and send it.\n\nIn either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request\u2019s `status` property to `created` instead of `sent`.\n\n## Sending Envelopes\n\nDocuments can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the `documentBase64` field of the [`document` object](#/definitions/document)\n\n### Recipient Types\nAn [`envelopeDefinition` object](#/definitions/envelopeDefinition) is used as the method\u2019s body. Envelope recipients can be defined in the envelope or in templates. The `envelopeDefinition` object\u2019s `recipients` field is an [`EnvelopeRecipients` resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:\n\nRecipient type | Object definition\n-------------- | -----------------\nagent (can add name and email information for later recipients/signers) | [`agent`](#/definitions/agent)\ncarbon copy (receives a copy of the documents) | [`carbonCopy`](#/definitions/carbonCopy)\ncertified delivery  (receives a copy of the documents and must acknowledge receipt) | [`certifiedDelivery`](#/definitions/certifiedDelivery)\neditor (can change recipients and document fields for later recipients/signers) | [`editor`](#/definitions/editor)\nin-person signer (\u201Chosts\u201D someone who signs in-person) | [`inPersonSigner`](#/definitions/inPersonSigner)\nintermediary (can add name and email information for some later recipients/signers.) | [`intermediary`](#/definitions/intermediary)\nsigner (signs and/or updates document fields) | [`signer`](#/definitions/signer)\n\nAdditional information about the different types of recipients is available from the [`EnvelopeRecipients` resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)\n\n### Tabs\nTabs (also referred to as `tags` and as `fields` in the web sending user interface), can be defined in the `envelopeDefinition`, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).\n\nDefining tabs: the `inPersonSigner`, and `signer` recipient objects include a `tabs` field. It is an [`EnvelopeTabs` resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [`EnvelopeTabs` resource](../../EnvelopeTabs) for more information.\n\n## Using Templates\nEnvelopes use specific people or groups as recipients. Templates can specify a role, eg `account_manager.` When a template is used in an envelope, the roles must be replaced with specific people or groups.\n\nWhen you create an envelope using a `templateId`, the different recipient type objects within the [`EnvelopeRecipients` object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template\u2019s roles via the `roleName` property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.\n\n### Message Lock\nWhen a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field `messageLock` is used to lock the email subject and message.\n\nIf an email subject or message is entered before adding or applying a template with `messageLock` **true**, the email subject and message is overwritten with the locked email subject and message from the template.\n\n## Envelope Status\nThe status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope\u2019s status changes. DocuSign limits polling to once every 15 minutes or less frequently.\n\nWhen a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message. \n\nSee the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.\n\n## Webhook Options\nThe two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client. \n\n### eventNotification Webhooks\nThe Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.\n\n### Connect Webhooks\nConnect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc. \n\nConnect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting \u201CGo to Admin\u201D from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.\n\nConnect is available for some DocuSign account types. Please contact DocuSign Sales for more information.\n\n## Composite Templates\n\nThe Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.\n\nEach Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.\n\n* The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the `compositeTemplateId` to which the document should be added. If `compositeTemplateId` is not specified in the content-disposition, the document is applied based on the `documentId` only. If no document object is specified, the composite template inherits the first document.\n\n* Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.\n\nPDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set `transformPdfFields` to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.\n\n* PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.\n\n### Compositing the definitions\nEach Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:\n\n* Templates are overlaid in the order of their Sequence value.\n* If Document is not passed into the Composite Template\u2019s `document` field, the *first* template\u2019s document (based on the template\u2019s Sequence value) is used.\n* Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.\n\nFor example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.\n\n* Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.\n\n* If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.\n\n* Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.\n\nFor example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.\n\n* roleName and tabLabel matching is case sensitive.\n\n* The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.\n\n* You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with \u201C\\*\u201D and then the system matches tabs that start with the label.\n\n* If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)\n\n### Including the Document Content for Composite Templates\nDocument content can be supplied inline, using the `documentBase64` or can be included in a multi-part HTTP message. \nIf a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the `compositeTemplateId` to which the document should be added. Using the `compositeTemplateId` sets which documents are associated with particular composite templates. An example of this usage is:\n\n```\n   --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d\n   Content-Type: application/pdf\n   Content-Disposition: file; filename=\&quot;eula.pdf\&quot;; documentId=1; compositeTemplateId=\&quot;1\&quot;\n   Content-Transfer-Encoding: base64\n```\n\n### PDF Form Field Transformation\nOnly the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text\n\nField Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.\n\nWhen transforming a *PDF Form Digital Signature Field,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\n\nAny other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab\n\nWhen transforming *PDF Form Text Fields,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\nDocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID\nDocuSignCompany or eSignCompany | Company\nDocuSignDateSigned or eSignDateSigned | Date Signed\nDocuSignTitle or eSignTitle | Title\nDocuSignFullName or eSignFullName |  Full Name\nDocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment\n\nAny other PDF Form Text Field will be transformed to a DocuSign data (text) tab.\n\nPDF Form Field Names that include \u201CDocuSignIgnoreTransform\u201D or \u201CeSignIgnoreTransform\u201D will not be transformed.\n\nPDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.\n\n## Template Email Subject Merge Fields\nThis feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.\n\nThe merge fields, based on the recipient\u2019s `roleName`, are added to the `emailSubject` when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.\n\nBoth the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.\n\nIf merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.\n\n* To add a recipient\u2019s name in the subject line add the following text in the `emailSubject` when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_UserName]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,`\n\n* To add a recipient\u2019s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_Email]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,`\n\nIn both cases the &lt;roleName&gt; is the recipient\u2019s `roleName` in the template.\n\nFor cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.\n\n## Branding an envelope\nThe following rules are used to determine the `brandId` used in an envelope:\n\n* If a `brandId` is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope.\n* If more than one template is used in an envelope and more than one `brandId` is specified, the first `brandId` specified is used throughout the envelope.\n* In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account\u2019s default signing brand is used.\n* For envelopes that do not meet any of the previous criteria, the account\u2019s default signing brand is used for the envelope.\n\n## BCC Email address feature \nThe BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don\u2019t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.\n\n## Merge Recipient Roles for Draft Envelopes\nWhen an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.\n\nTo prevent this, the query parameter `merge_roles_on_draft` should be added when posting a draft envelope (status=created) with multiple templates. Doing this will merge template roles and remove empty recipients.\n\n###### Note: DocuSign recommends that the `merge_roles_on_draft` query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
  /// </summary>
  public class CreateEnvelopeOptions
  {
    
    private String completedDocumentsOnly = null;
    
    private String mergeRolesOnDraft = null;
    
    private String cdseMode = null;
    
    
    /*
     * 
     */
    public void setCompletedDocumentsOnly(String completedDocumentsOnly) {
      this.completedDocumentsOnly = completedDocumentsOnly;
    }

    public String getCompletedDocumentsOnly() {
      return this.completedDocumentsOnly;
    }
    
    /*
     * When set to **true**, merges template roles and remove empty recipients when you create an envelope with multiple templates. 
     */
    public void setMergeRolesOnDraft(String mergeRolesOnDraft) {
      this.mergeRolesOnDraft = mergeRolesOnDraft;
    }

    public String getMergeRolesOnDraft() {
      return this.mergeRolesOnDraft;
    }
    
    /*
     * 
     */
    public void setCdseMode(String cdseMode) {
      this.cdseMode = cdseMode;
    }

    public String getCdseMode() {
      return this.cdseMode;
    }
    
  }

  /**
   * Creates an envelope.
   * Creates an envelope. \n\nUsing this function you can:\n* Create an envelope and send it.\n* Create an envelope from an existing template and send it.\n\nIn either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request\u2019s `status` property to `created` instead of `sent`.\n\n## Sending Envelopes\n\nDocuments can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the `documentBase64` field of the [`document` object](#/definitions/document)\n\n### Recipient Types\nAn [`envelopeDefinition` object](#/definitions/envelopeDefinition) is used as the method\u2019s body. Envelope recipients can be defined in the envelope or in templates. The `envelopeDefinition` object\u2019s `recipients` field is an [`EnvelopeRecipients` resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:\n\nRecipient type | Object definition\n-------------- | -----------------\nagent (can add name and email information for later recipients/signers) | [`agent`](#/definitions/agent)\ncarbon copy (receives a copy of the documents) | [`carbonCopy`](#/definitions/carbonCopy)\ncertified delivery  (receives a copy of the documents and must acknowledge receipt) | [`certifiedDelivery`](#/definitions/certifiedDelivery)\neditor (can change recipients and document fields for later recipients/signers) | [`editor`](#/definitions/editor)\nin-person signer (\u201Chosts\u201D someone who signs in-person) | [`inPersonSigner`](#/definitions/inPersonSigner)\nintermediary (can add name and email information for some later recipients/signers.) | [`intermediary`](#/definitions/intermediary)\nsigner (signs and/or updates document fields) | [`signer`](#/definitions/signer)\n\nAdditional information about the different types of recipients is available from the [`EnvelopeRecipients` resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)\n\n### Tabs\nTabs (also referred to as `tags` and as `fields` in the web sending user interface), can be defined in the `envelopeDefinition`, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).\n\nDefining tabs: the `inPersonSigner`, and `signer` recipient objects include a `tabs` field. It is an [`EnvelopeTabs` resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [`EnvelopeTabs` resource](../../EnvelopeTabs) for more information.\n\n## Using Templates\nEnvelopes use specific people or groups as recipients. Templates can specify a role, eg `account_manager.` When a template is used in an envelope, the roles must be replaced with specific people or groups.\n\nWhen you create an envelope using a `templateId`, the different recipient type objects within the [`EnvelopeRecipients` object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template\u2019s roles via the `roleName` property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.\n\n### Message Lock\nWhen a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field `messageLock` is used to lock the email subject and message.\n\nIf an email subject or message is entered before adding or applying a template with `messageLock` **true**, the email subject and message is overwritten with the locked email subject and message from the template.\n\n## Envelope Status\nThe status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope\u2019s status changes. DocuSign limits polling to once every 15 minutes or less frequently.\n\nWhen a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message. \n\nSee the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.\n\n## Webhook Options\nThe two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client. \n\n### eventNotification Webhooks\nThe Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.\n\n### Connect Webhooks\nConnect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc. \n\nConnect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting \u201CGo to Admin\u201D from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.\n\nConnect is available for some DocuSign account types. Please contact DocuSign Sales for more information.\n\n## Composite Templates\n\nThe Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.\n\nEach Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.\n\n* The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the `compositeTemplateId` to which the document should be added. If `compositeTemplateId` is not specified in the content-disposition, the document is applied based on the `documentId` only. If no document object is specified, the composite template inherits the first document.\n\n* Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.\n\nPDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set `transformPdfFields` to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.\n\n* PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.\n\n### Compositing the definitions\nEach Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:\n\n* Templates are overlaid in the order of their Sequence value.\n* If Document is not passed into the Composite Template\u2019s `document` field, the *first* template\u2019s document (based on the template\u2019s Sequence value) is used.\n* Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.\n\nFor example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.\n\n* Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.\n\n* If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.\n\n* Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.\n\nFor example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.\n\n* roleName and tabLabel matching is case sensitive.\n\n* The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.\n\n* You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with \u201C\\*\u201D and then the system matches tabs that start with the label.\n\n* If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)\n\n### Including the Document Content for Composite Templates\nDocument content can be supplied inline, using the `documentBase64` or can be included in a multi-part HTTP message. \nIf a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the `compositeTemplateId` to which the document should be added. Using the `compositeTemplateId` sets which documents are associated with particular composite templates. An example of this usage is:\n\n```\n   --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d\n   Content-Type: application/pdf\n   Content-Disposition: file; filename=\&quot;eula.pdf\&quot;; documentId=1; compositeTemplateId=\&quot;1\&quot;\n   Content-Transfer-Encoding: base64\n```\n\n### PDF Form Field Transformation\nOnly the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text\n\nField Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.\n\nWhen transforming a *PDF Form Digital Signature Field,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\n\nAny other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab\n\nWhen transforming *PDF Form Text Fields,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\nDocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID\nDocuSignCompany or eSignCompany | Company\nDocuSignDateSigned or eSignDateSigned | Date Signed\nDocuSignTitle or eSignTitle | Title\nDocuSignFullName or eSignFullName |  Full Name\nDocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment\n\nAny other PDF Form Text Field will be transformed to a DocuSign data (text) tab.\n\nPDF Form Field Names that include \u201CDocuSignIgnoreTransform\u201D or \u201CeSignIgnoreTransform\u201D will not be transformed.\n\nPDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.\n\n## Template Email Subject Merge Fields\nThis feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.\n\nThe merge fields, based on the recipient\u2019s `roleName`, are added to the `emailSubject` when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.\n\nBoth the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.\n\nIf merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.\n\n* To add a recipient\u2019s name in the subject line add the following text in the `emailSubject` when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_UserName]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,`\n\n* To add a recipient\u2019s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_Email]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,`\n\nIn both cases the &lt;roleName&gt; is the recipient\u2019s `roleName` in the template.\n\nFor cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.\n\n## Branding an envelope\nThe following rules are used to determine the `brandId` used in an envelope:\n\n* If a `brandId` is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope.\n* If more than one template is used in an envelope and more than one `brandId` is specified, the first `brandId` specified is used throughout the envelope.\n* In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account\u2019s default signing brand is used.\n* For envelopes that do not meet any of the previous criteria, the account\u2019s default signing brand is used for the envelope.\n\n## BCC Email address feature \nThe BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don\u2019t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.\n\n## Merge Recipient Roles for Draft Envelopes\nWhen an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.\n\nTo prevent this, the query parameter `merge_roles_on_draft` should be added when posting a draft envelope (status=created) with multiple templates. Doing this will merge template roles and remove empty recipients.\n\n###### Note: DocuSign recommends that the `merge_roles_on_draft` query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
     * @param accountId The external account number (int) or account ID Guid.
     * @return EnvelopeSummary
   */ 
  public EnvelopeSummary createEnvelope(String accountId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    return createEnvelope(accountId, envelopeDefinition, null);
  }
  

  /**
   * Creates an envelope.
   * Creates an envelope. \n\nUsing this function you can:\n* Create an envelope and send it.\n* Create an envelope from an existing template and send it.\n\nIn either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request\u2019s `status` property to `created` instead of `sent`.\n\n## Sending Envelopes\n\nDocuments can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the `documentBase64` field of the [`document` object](#/definitions/document)\n\n### Recipient Types\nAn [`envelopeDefinition` object](#/definitions/envelopeDefinition) is used as the method\u2019s body. Envelope recipients can be defined in the envelope or in templates. The `envelopeDefinition` object\u2019s `recipients` field is an [`EnvelopeRecipients` resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:\n\nRecipient type | Object definition\n-------------- | -----------------\nagent (can add name and email information for later recipients/signers) | [`agent`](#/definitions/agent)\ncarbon copy (receives a copy of the documents) | [`carbonCopy`](#/definitions/carbonCopy)\ncertified delivery  (receives a copy of the documents and must acknowledge receipt) | [`certifiedDelivery`](#/definitions/certifiedDelivery)\neditor (can change recipients and document fields for later recipients/signers) | [`editor`](#/definitions/editor)\nin-person signer (\u201Chosts\u201D someone who signs in-person) | [`inPersonSigner`](#/definitions/inPersonSigner)\nintermediary (can add name and email information for some later recipients/signers.) | [`intermediary`](#/definitions/intermediary)\nsigner (signs and/or updates document fields) | [`signer`](#/definitions/signer)\n\nAdditional information about the different types of recipients is available from the [`EnvelopeRecipients` resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)\n\n### Tabs\nTabs (also referred to as `tags` and as `fields` in the web sending user interface), can be defined in the `envelopeDefinition`, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).\n\nDefining tabs: the `inPersonSigner`, and `signer` recipient objects include a `tabs` field. It is an [`EnvelopeTabs` resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [`EnvelopeTabs` resource](../../EnvelopeTabs) for more information.\n\n## Using Templates\nEnvelopes use specific people or groups as recipients. Templates can specify a role, eg `account_manager.` When a template is used in an envelope, the roles must be replaced with specific people or groups.\n\nWhen you create an envelope using a `templateId`, the different recipient type objects within the [`EnvelopeRecipients` object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template\u2019s roles via the `roleName` property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.\n\n### Message Lock\nWhen a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field `messageLock` is used to lock the email subject and message.\n\nIf an email subject or message is entered before adding or applying a template with `messageLock` **true**, the email subject and message is overwritten with the locked email subject and message from the template.\n\n## Envelope Status\nThe status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope\u2019s status changes. DocuSign limits polling to once every 15 minutes or less frequently.\n\nWhen a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message. \n\nSee the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.\n\n## Webhook Options\nThe two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client. \n\n### eventNotification Webhooks\nThe Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.\n\n### Connect Webhooks\nConnect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc. \n\nConnect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting \u201CGo to Admin\u201D from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.\n\nConnect is available for some DocuSign account types. Please contact DocuSign Sales for more information.\n\n## Composite Templates\n\nThe Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.\n\nEach Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.\n\n* The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the `compositeTemplateId` to which the document should be added. If `compositeTemplateId` is not specified in the content-disposition, the document is applied based on the `documentId` only. If no document object is specified, the composite template inherits the first document.\n\n* Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.\n\nPDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set `transformPdfFields` to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.\n\n* PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.\n\n### Compositing the definitions\nEach Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:\n\n* Templates are overlaid in the order of their Sequence value.\n* If Document is not passed into the Composite Template\u2019s `document` field, the *first* template\u2019s document (based on the template\u2019s Sequence value) is used.\n* Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.\n\nFor example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.\n\n* Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.\n\n* If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.\n\n* Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.\n\nFor example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.\n\n* roleName and tabLabel matching is case sensitive.\n\n* The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.\n\n* You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with \u201C\\*\u201D and then the system matches tabs that start with the label.\n\n* If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)\n\n### Including the Document Content for Composite Templates\nDocument content can be supplied inline, using the `documentBase64` or can be included in a multi-part HTTP message. \nIf a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the `compositeTemplateId` to which the document should be added. Using the `compositeTemplateId` sets which documents are associated with particular composite templates. An example of this usage is:\n\n```\n   --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d\n   Content-Type: application/pdf\n   Content-Disposition: file; filename=\&quot;eula.pdf\&quot;; documentId=1; compositeTemplateId=\&quot;1\&quot;\n   Content-Transfer-Encoding: base64\n```\n\n### PDF Form Field Transformation\nOnly the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text\n\nField Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.\n\nWhen transforming a *PDF Form Digital Signature Field,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\n\nAny other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab\n\nWhen transforming *PDF Form Text Fields,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\nDocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID\nDocuSignCompany or eSignCompany | Company\nDocuSignDateSigned or eSignDateSigned | Date Signed\nDocuSignTitle or eSignTitle | Title\nDocuSignFullName or eSignFullName |  Full Name\nDocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment\n\nAny other PDF Form Text Field will be transformed to a DocuSign data (text) tab.\n\nPDF Form Field Names that include \u201CDocuSignIgnoreTransform\u201D or \u201CeSignIgnoreTransform\u201D will not be transformed.\n\nPDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.\n\n## Template Email Subject Merge Fields\nThis feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.\n\nThe merge fields, based on the recipient\u2019s `roleName`, are added to the `emailSubject` when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.\n\nBoth the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.\n\nIf merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.\n\n* To add a recipient\u2019s name in the subject line add the following text in the `emailSubject` when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_UserName]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,`\n\n* To add a recipient\u2019s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_Email]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,`\n\nIn both cases the &lt;roleName&gt; is the recipient\u2019s `roleName` in the template.\n\nFor cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.\n\n## Branding an envelope\nThe following rules are used to determine the `brandId` used in an envelope:\n\n* If a `brandId` is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope.\n* If more than one template is used in an envelope and more than one `brandId` is specified, the first `brandId` specified is used throughout the envelope.\n* In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account\u2019s default signing brand is used.\n* For envelopes that do not meet any of the previous criteria, the account\u2019s default signing brand is used for the envelope.\n\n## BCC Email address feature \nThe BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don\u2019t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.\n\n## Merge Recipient Roles for Draft Envelopes\nWhen an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.\n\nTo prevent this, the query parameter `merge_roles_on_draft` should be added when posting a draft envelope (status=created) with multiple templates. Doing this will merge template roles and remove empty recipients.\n\n###### Note: DocuSign recommends that the `merge_roles_on_draft` query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
      * @param accountId The external account number (int) or account ID Guid.
   
   * EnvelopesApi.CreateEnvelopeOptions Options for modifying the method behavior.
   * @return EnvelopeSummary
   * @throws ApiException if fails to make API call
   */
  public EnvelopeSummary createEnvelope(String accountId, EnvelopeDefinition envelopeDefinition, EnvelopesApi.CreateEnvelopeOptions options) throws ApiException {
    Object localVarPostBody = envelopeDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelope");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "completed_documents_only", options.completedDocumentsOnly));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "merge_roles_on_draft", options.mergeRolesOnDraft));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "cdse_mode", options.cdseMode));
    
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<EnvelopeSummary> localVarReturnType = new GenericType<EnvelopeSummary>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Lock an envelope.
   * Locks the specified envelope, and sets the time until the lock expires, to prevent other users or recipients from accessing and changing the envelope.\n\n###### Note: Users must have envelope locking capability enabled to use this function (userSetting `canLockEnvelopes` must be  set to true for the user).
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.CreateLockOptions Options for modifying the method behavior.
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation createLock(String accountId, String envelopeId, LockRequest lockRequest) throws ApiException {
    Object localVarPostBody = lockRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createLock");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Adds one or more recipients to an envelope.
   * Adds one or more recipients to an envelope.\n\nFor an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional `resend_envelope` query string is set to **true**.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.CreateRecipientOptions Options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients createRecipient(String accountId, String envelopeId, Recipients recipients) throws ApiException {
    Object localVarPostBody = recipients;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipient");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipient");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Returns a URL to the recipient view UI.
   * Returns a URL that allows you to embed the recipient view of the DocuSign UI in your applications. This call cannot be used to view draft envelopes, since those envelopes have not been sent. \n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. \n\nAn entry is added into the Security Level section of the DocuSign Certificate of Completion that reflects the `securityDomain` and `authenticationMethod` properties used to verify the user identity.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.CreateRecipientViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createRecipientView(String accountId, String envelopeId, RecipientViewRequest recipientViewRequest) throws ApiException {
    Object localVarPostBody = recipientViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipientView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipientView");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/recipient".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
  

  

  /**
   * Returns a URL to the sender view UI.
   * Returns a URL that allows you to embed the sender view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign sending view. \n\nUpon sending completion, the user is returned to the return URL provided by the API application.\n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.CreateSenderViewOptions Options for modifying the method behavior.
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createSenderView(String accountId, String envelopeId, ReturnUrlRequest returnUrlRequest) throws ApiException {
    Object localVarPostBody = returnUrlRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createSenderView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createSenderView");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/sender".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
  

  

  /**
   * Adds tabs for a recipient.
   * Adds one or more tabs for a recipient.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param recipientId The ID of the recipient being accessed.
   
   * EnvelopesApi.CreateTabsOptions Options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs createTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling createTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Reserved: Returns a URL to the secure link view UI.
   * Reserved: Returns a URL that allows you to embed the secure link view of the DocuSign UI in your applications.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.CreateViewLinkOptions Options for modifying the method behavior.
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createViewLink(String accountId, String envelopeId, ViewLinkRequest viewLinkRequest) throws ApiException {
    Object localVarPostBody = viewLinkRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createViewLink");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createViewLink");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/viewlink".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
  

  

  /**
   * Deletes envelope custom fields for draft and in-process envelopes.
   * Deletes envelope custom fields for draft and in-process envelopes.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.DeleteCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields deleteCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
    Object localVarPostBody = customFields;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCustomFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Deletes custom document fields from an existing envelope document.
   * Deletes custom document fields from an existing envelope document.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param documentId The ID of the document being accessed.
   
   * EnvelopesApi.DeleteDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation deleteDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    Object localVarPostBody = documentFieldsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Deletes a page from a document in an envelope.
   * Deletes a page from a document in an envelope based on the page number.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param documentId The ID of the document being accessed.
      * @param pageNumber The page number being accessed.
   
   * EnvelopesApi.DeleteDocumentPageOptions Options for modifying the method behavior.
   * @return void
   * @throws ApiException if fails to make API call
   */
  public void deleteDocumentPage(String accountId, String envelopeId, String documentId, String pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentPage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocumentPage");
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
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  

  

  /**
   * Deletes documents from a draft envelope.
   * Deletes one or more documents from an existing draft envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.DeleteDocumentsOptions Options for modifying the method behavior.
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocumentsResult deleteDocuments(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    Object localVarPostBody = envelopeDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocuments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EnvelopeDocumentsResult> localVarReturnType = new GenericType<EnvelopeDocumentsResult>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Deletes the email setting overrides for an envelope.
   * Deletes all existing email override settings for the envelope. If you want to delete an individual email override setting, use the PUT and set the value to an empty string. Note that deleting email settings will only affect email communications that occur after the deletion and the normal account email settings are used for future email communications.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.DeleteEmailSettingsOptions Options for modifying the method behavior.
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings deleteEmailSettings(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEmailSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteEmailSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Deletes an envelope lock.
   * Deletes the lock from the specified envelope. The `X-DocuSign-Edit` header must be included in the request.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.DeleteLockOptions Options for modifying the method behavior.
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation deleteLock(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteLock");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Deletes a recipient from an envelope.
   * Deletes the specified recipient file from the specified envelope. This cannot be used if the envelope has been sent.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param recipientId The ID of the recipient being accessed.
   
   * EnvelopesApi.DeleteRecipientOptions Options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients deleteRecipient(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipient");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteRecipient");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteRecipient");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Deletes recipients from an envelope.
   * Deletes one or more recipients from a draft or sent envelope. Recipients to be deleted are listed in the request, with the `recipientId` being used as the key for deleting recipients.\n\nIf the envelope is `In Process`, meaning that it has been sent and has not  been completed or voided, recipients that have completed their actions cannot be deleted.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.DeleteRecipientsOptions Options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients deleteRecipients(String accountId, String envelopeId, Recipients recipients) throws ApiException {
    Object localVarPostBody = recipients;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipients");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteRecipients");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Deletes the tabs associated with a recipient.
   * Deletes one or more tabs associated with a recipient in a draft envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param recipientId The ID of the recipient being accessed.
   
   * EnvelopesApi.DeleteTabsOptions Options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs deleteTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Deletes a template from a document in an existing envelope.
   * Deletes the specified template from a document in an existing envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param documentId The ID of the document being accessed.
      * @param templateId The ID of the template being accessed.
   
   * EnvelopesApi.DeleteTemplatesFromDocumentOptions Options for modifying the method behavior.
   * @return void
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplatesFromDocument(String accountId, String envelopeId, String documentId, String templateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTemplatesFromDocument");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteTemplatesFromDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteTemplatesFromDocument");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplatesFromDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  

  

  /**
   * Reserved: Expires a secure view link.
   * Reserved: Expires a secure view link
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.DeleteViewLinkOptions Options for modifying the method behavior.
   * @return void
   * @throws ApiException if fails to make API call
   */
  public void deleteViewLink(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteViewLink");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteViewLink");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/views/viewlink".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  

  
  /// <summary>
  /// Gets a document from an envelope. Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.\n\nYou can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted. \n\nTo retrieve the combined content replace the `{documentId}` parameter in the endpoint with `combined`.\n/accounts/{accountId}/envelopes/{envelopeId}/documents/combined
  /// </summary>
  public class GetDocumentOptions
  {
    
    private String watermark = null;
    
    private String recipientId = null;
    
    private String encoding = null;
    
    private String certificate = null;
    
    private String language = null;
    
    private String encrypt = null;
    
    private String showChanges = null;
    
    
    /*
     * When set to **true**, the account has the watermark feature enabled, and the envelope is not complete, the watermark for the account is added to the PDF documents. This option can remove the watermark.  
     */
    public void setWatermark(String watermark) {
      this.watermark = watermark;
    }

    public String getWatermark() {
      return this.watermark;
    }
    
    /*
     * 
     */
    public void setRecipientId(String recipientId) {
      this.recipientId = recipientId;
    }

    public String getRecipientId() {
      return this.recipientId;
    }
    
    /*
     * 
     */
    public void setEncoding(String encoding) {
      this.encoding = encoding;
    }

    public String getEncoding() {
      return this.encoding;
    }
    
    /*
     * When set to **false**, the envelope signing certificate is removed from the download. 
     */
    public void setCertificate(String certificate) {
      this.certificate = certificate;
    }

    public String getCertificate() {
      return this.certificate;
    }
    
    /*
     * Specifies the language for the Certificate of Completion in the response. The supported languages, with the language value shown in parenthesis, are: Chinese Simplified (zh_CN), , Chinese Traditional (zh_TW), Dutch (nl), English US (en), French (fr), German (de), Italian (it), Japanese (ja), Korean (ko), Portuguese (pt), Portuguese (Brazil) (pt_BR), Russian (ru), Spanish (es).  
     */
    public void setLanguage(String language) {
      this.language = language;
    }

    public String getLanguage() {
      return this.language;
    }
    
    /*
     * When set to **true**, the PDF bytes returned in the response are encrypted for all the key managers configured on your DocuSign account. The documents can be decrypted with the KeyManager Decrypt Document API. 
     */
    public void setEncrypt(String encrypt) {
      this.encrypt = encrypt;
    }

    public String getEncrypt() {
      return this.encrypt;
    }
    
    /*
     * When set to **true**, any changed fields for the returned PDF are highlighted in yellow and optional signatures or initials outlined in red.  
     */
    public void setShowChanges(String showChanges) {
      this.showChanges = showChanges;
    }

    public String getShowChanges() {
      return this.showChanges;
    }
    
  }

  /**
   * Gets a document from an envelope.
   * Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.\n\nYou can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted. \n\nTo retrieve the combined content replace the `{documentId}` parameter in the endpoint with `combined`.\n/accounts/{accountId}/envelopes/{envelopeId}/documents/combined
     * @param accountId The external account number (int) or account ID Guid.
     * @param envelopeId The envelopeId Guid of the envelope being accessed.
     * @param documentId The ID of the document being accessed.
     * @return byte[]
   */ 
  public byte[] getDocument(String accountId, String envelopeId, String documentId) throws ApiException {
    return getDocument(accountId, envelopeId, documentId, null);
  }
  

  /**
   * Gets a document from an envelope.
   * Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.\n\nYou can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted. \n\nTo retrieve the combined content replace the `{documentId}` parameter in the endpoint with `combined`.\n/accounts/{accountId}/envelopes/{envelopeId}/documents/combined
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param documentId The ID of the document being accessed.
   
   * EnvelopesApi.GetDocumentOptions Options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getDocument(String accountId, String envelopeId, String documentId, EnvelopesApi.GetDocumentOptions options) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocument");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "watermark", options.watermark));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipient_id", options.recipientId));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "encoding", options.encoding));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "certificate", options.certificate));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", options.language));
    
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets the email setting overrides for an envelope.
   * Retrieves the email override settings for the specified envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.GetEmailSettingsOptions Options for modifying the method behavior.
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings getEmailSettings(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEmailSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEmailSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  
  /// <summary>
  /// Gets the status of a envelope. Retrieves the overall status for the specified envelope.
  /// </summary>
  public class GetEnvelopeOptions
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
   * Gets the status of a envelope.
   * Retrieves the overall status for the specified envelope.
     * @param accountId The external account number (int) or account ID Guid.
     * @param envelopeId The envelopeId Guid of the envelope being accessed.
     * @return Envelope
   */ 
  public Envelope getEnvelope(String accountId, String envelopeId) throws ApiException {
    return getEnvelope(accountId, envelopeId, null);
  }
  

  /**
   * Gets the status of a envelope.
   * Retrieves the overall status for the specified envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.GetEnvelopeOptions Options for modifying the method behavior.
   * @return Envelope
   * @throws ApiException if fails to make API call
   */
  public Envelope getEnvelope(String accountId, String envelopeId, EnvelopesApi.GetEnvelopeOptions options) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelope");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelope");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Envelope> localVarReturnType = new GenericType<Envelope>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets envelope lock information.
   * Retrieves general information about the envelope lock.\n\nIf the call is made by the locked by user and the request has the same integrator key as original, then the `X-DocuSign-Edit` header and additional lock information is included in the response. This allows users to recover a lost editing session token and the `X-DocuSign-Edit` header.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.GetLockOptions Options for modifying the method behavior.
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation getLock(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getLock");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets envelope notification information.
   * Retrieves the envelope notification, reminders and expirations, information for an existing envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.GetNotificationSettingsOptions Options for modifying the method behavior.
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public Notification getNotificationSettings(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getNotificationSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getNotificationSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/notification".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<Notification> localVarReturnType = new GenericType<Notification>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets the envelope audit events for an envelope.
   * Gets the envelope audit events for the specified envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.ListAuditEventsOptions Options for modifying the method behavior.
   * @return EnvelopeAuditEventResponse
   * @throws ApiException if fails to make API call
   */
  public EnvelopeAuditEventResponse listAuditEvents(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listAuditEvents");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listAuditEvents");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/audit_events".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EnvelopeAuditEventResponse> localVarReturnType = new GenericType<EnvelopeAuditEventResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets the custom field information for the specified envelope.
   * Retrieves the custom field information for the specified envelope. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes, and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.\n\nThere are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. With a list custom field, the sender selects the value of the field from a pre-made list.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.ListCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFieldsEnvelope
   * @throws ApiException if fails to make API call
   */
  public CustomFieldsEnvelope listCustomFields(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<CustomFieldsEnvelope> localVarReturnType = new GenericType<CustomFieldsEnvelope>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets the custom document fields from an  existing envelope document.
   * Retrieves the custom document field information from an existing envelope document.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param documentId The ID of the document being accessed.
   
   * EnvelopesApi.ListDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation listDocumentFields(String accountId, String envelopeId, String documentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocumentFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling listDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets a list of envelope documents.
   * Retrieves a list of documents associated with the specified envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.ListDocumentsOptions Options for modifying the method behavior.
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocumentsResult listDocuments(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocuments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EnvelopeDocumentsResult> localVarReturnType = new GenericType<EnvelopeDocumentsResult>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  
  /// <summary>
  /// Gets the status of recipients for an envelope. Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list. \n\nThe `currentRoutingOrder` property of the response contains the `routingOrder` value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
  /// </summary>
  public class ListRecipientsOptions
  {
    
    private String includeMetadata = null;
    
    private String includeTabs = null;
    
    
    /*
     * 
     */
    public void setIncludeMetadata(String includeMetadata) {
      this.includeMetadata = includeMetadata;
    }

    public String getIncludeMetadata() {
      return this.includeMetadata;
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
   * Gets the status of recipients for an envelope.
   * Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list. \n\nThe `currentRoutingOrder` property of the response contains the `routingOrder` value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
     * @param accountId The external account number (int) or account ID Guid.
     * @param envelopeId The envelopeId Guid of the envelope being accessed.
     * @return Recipients
   */ 
  public Recipients listRecipients(String accountId, String envelopeId) throws ApiException {
    return listRecipients(accountId, envelopeId, null);
  }
  

  /**
   * Gets the status of recipients for an envelope.
   * Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list. \n\nThe `currentRoutingOrder` property of the response contains the `routingOrder` value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.ListRecipientsOptions Options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients listRecipients(String accountId, String envelopeId, EnvelopesApi.ListRecipientsOptions options) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listRecipients");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listRecipients");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_metadata", options.includeMetadata));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_tabs", options.includeTabs));
    
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets the envelope status for the specified envelopes.
   * Retrieves the envelope status for the specified envelopes.
      * @param accountId The external account number (int) or account ID Guid.
   
   * EnvelopesApi.ListStatusOptions Options for modifying the method behavior.
   * @return EnvelopesInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopesInformation listStatus(String accountId, EnvelopeIdsRequest envelopeIdsRequest) throws ApiException {
    Object localVarPostBody = envelopeIdsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listStatus");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/status".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<EnvelopesInformation> localVarReturnType = new GenericType<EnvelopesInformation>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  
  /// <summary>
  /// Gets status changes for one or more envelopes. Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.\n\n### Important: Unless you are requesting the status for specific envelopes (using the `envelopeIds` or `transactionIds` properties), you must add a set the `from_date` property in the request.\n\nGetting envelope status using `transactionIds` is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.\n\n### Request Envelope Status Notes ###\n\nThe REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (`from_to_status`) set to `Delivered` &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.\n\nTo avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.\n\nFor example, a request with a status qualifier (from_to_status) of `Delivered` and a status of \&quot;`Created`,`Sent`\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of `Created` or `Sent`, and since an envelope that has been delivered can never have a status of `Created` or `Sent`, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.\n\nClient applications should check that the statuses they are requesting make sense for a given status qualifier.
  /// </summary>
  public class ListStatusChangesOptions
  {
    
    private String transactionIds = null;
    
    private String folderIds = null;
    
    private String envelopeIds = null;
    
    private String powerformids = null;
    
    private String startPosition = null;
    
    private String status = null;
    
    private String fromToStatus = null;
    
    private String order = null;
    
    private String userFilter = null;
    
    private String userId = null;
    
    private String userName = null;
    
    private String count = null;
    
    private String customField = null;
    
    private String email = null;
    
    private String toDate = null;
    
    private String searchText = null;
    
    private String exclude = null;
    
    private String acStatus = null;
    
    private String orderBy = null;
    
    private String folderTypes = null;
    
    private String block = null;
    
    private String include = null;
    
    private String intersectingFolderIds = null;
    
    private String fromDate = null;
    
    
    /*
     * If included in the query string, this is a comma separated list of envelope `transactionId`s. \n\nIf included in the `request_body`, this is a list of envelope `transactionId`s. \n\n###### Note: `transactionId`s are only valid in the DocuSign system for seven days.\n 
     */
    public void setTransactionIds(String transactionIds) {
      this.transactionIds = transactionIds;
    }

    public String getTransactionIds() {
      return this.transactionIds;
    }
    
    /*
     * 
     */
    public void setFolderIds(String folderIds) {
      this.folderIds = folderIds;
    }

    public String getFolderIds() {
      return this.folderIds;
    }
    
    /*
     * 
     */
    public void setEnvelopeIds(String envelopeIds) {
      this.envelopeIds = envelopeIds;
    }

    public String getEnvelopeIds() {
      return this.envelopeIds;
    }
    
    /*
     * 
     */
    public void setPowerformids(String powerformids) {
      this.powerformids = powerformids;
    }

    public String getPowerformids() {
      return this.powerformids;
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
    
    /*
     * The list of current statuses to include in the response. By default, all envelopes found are returned. If values are specified, then of the envelopes found, only those with the current status specified are returned in the results. \n\nPossible values are: Voided, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut and Processing. 
     */
    public void setStatus(String status) {
      this.status = status;
    }

    public String getStatus() {
      return this.status;
    }
    
    /*
     * This is the status type checked for in the `from_date`/`to_date` period. If `changed` is specified, then envelopes that changed status during the period are found. If for example, `created` is specified, then envelopes created during the period are found. Default is `changed`. \n\nPossible values are: Voided, Changed, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut and Processing. 
     */
    public void setFromToStatus(String fromToStatus) {
      this.fromToStatus = fromToStatus;
    }

    public String getFromToStatus() {
      return this.fromToStatus;
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
    
    /*
     * 
     */
    public void setUserName(String userName) {
      this.userName = userName;
    }

    public String getUserName() {
      return this.userName;
    }
    
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
     * This specifies the envelope custom field name and value searched for in the envelope information. The value portion of the query can use partial strings by adding &#39;%&#39; (percent sign) around the custom field query value. \n\nExample 1: If you have an envelope custom field called \&quot;Region\&quot; and you want to search for all envelopes where the value is \&quot;West\&quot; you would use the query: `?custom_field=Region=West`. \n\nExample 2: To search for envelopes where the `ApplicationID` custom field has the value or partial value of \&quot;DocuSign\&quot; in field, the query would be: `?custom_field=ApplicationId=%DocuSign%` This would find envelopes where the custom field value is \&quot;DocuSign for Salesforce\&quot; or \&quot;DocuSign envelope.\&quot; \n 
     */
    public void setCustomField(String customField) {
      this.customField = customField;
    }

    public String getCustomField() {
      return this.customField;
    }
    
    /*
     * 
     */
    public void setEmail(String email) {
      this.email = email;
    }

    public String getEmail() {
      return this.email;
    }
    
    /*
     * Optional date/time setting that specifies the date/time when the request stops for status changes for envelopes in the account. If no entry, the system uses the time of the call as the `to_date`.  
     */
    public void setToDate(String toDate) {
      this.toDate = toDate;
    }

    public String getToDate() {
      return this.toDate;
    }
    
    /*
     * 
     */
    public void setSearchText(String searchText) {
      this.searchText = searchText;
    }

    public String getSearchText() {
      return this.searchText;
    }
    
    /*
     * 
     */
    public void setExclude(String exclude) {
      this.exclude = exclude;
    }

    public String getExclude() {
      return this.exclude;
    }
    
    /*
     * Specifies the Authoritative Copy Status for the envelopes. The possible values are: Unknown, Original, Transferred, AuthoritativeCopy, AuthoritativeCopyExportPending, AuthoritativeCopyExported, DepositPending, Deposited, DepositedEO, or DepositFailed. 
     */
    public void setAcStatus(String acStatus) {
      this.acStatus = acStatus;
    }

    public String getAcStatus() {
      return this.acStatus;
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
    public void setFolderTypes(String folderTypes) {
      this.folderTypes = folderTypes;
    }

    public String getFolderTypes() {
      return this.folderTypes;
    }
    
    /*
     * 
     */
    public void setBlock(String block) {
      this.block = block;
    }

    public String getBlock() {
      return this.block;
    }
    
    /*
     * 
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
    public void setIntersectingFolderIds(String intersectingFolderIds) {
      this.intersectingFolderIds = intersectingFolderIds;
    }

    public String getIntersectingFolderIds() {
      return this.intersectingFolderIds;
    }
    
    /*
     * The date/time setting that specifies the date/time when the request begins checking for status changes for envelopes in the account.\n\nThis is required unless &#39;envelopeId&#39;s are used. 
     */
    public void setFromDate(String fromDate) {
      this.fromDate = fromDate;
    }

    public String getFromDate() {
      return this.fromDate;
    }
    
  }

  /**
   * Gets status changes for one or more envelopes.
   * Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.\n\n### Important: Unless you are requesting the status for specific envelopes (using the `envelopeIds` or `transactionIds` properties), you must add a set the `from_date` property in the request.\n\nGetting envelope status using `transactionIds` is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.\n\n### Request Envelope Status Notes ###\n\nThe REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (`from_to_status`) set to `Delivered` &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.\n\nTo avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.\n\nFor example, a request with a status qualifier (from_to_status) of `Delivered` and a status of \&quot;`Created`,`Sent`\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of `Created` or `Sent`, and since an envelope that has been delivered can never have a status of `Created` or `Sent`, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.\n\nClient applications should check that the statuses they are requesting make sense for a given status qualifier.
     * @param accountId The external account number (int) or account ID Guid.
     * @return EnvelopesInformation
   */ 
  public EnvelopesInformation listStatusChanges(String accountId) throws ApiException {
    return listStatusChanges(accountId, null);
  }
  

  /**
   * Gets status changes for one or more envelopes.
   * Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.\n\n### Important: Unless you are requesting the status for specific envelopes (using the `envelopeIds` or `transactionIds` properties), you must add a set the `from_date` property in the request.\n\nGetting envelope status using `transactionIds` is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.\n\n### Request Envelope Status Notes ###\n\nThe REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (`from_to_status`) set to `Delivered` &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.\n\nTo avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.\n\nFor example, a request with a status qualifier (from_to_status) of `Delivered` and a status of \&quot;`Created`,`Sent`\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of `Created` or `Sent`, and since an envelope that has been delivered can never have a status of `Created` or `Sent`, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.\n\nClient applications should check that the statuses they are requesting make sense for a given status qualifier.
      * @param accountId The external account number (int) or account ID Guid.
   
   * EnvelopesApi.ListStatusChangesOptions Options for modifying the method behavior.
   * @return EnvelopesInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopesInformation listStatusChanges(String accountId, EnvelopesApi.ListStatusChangesOptions options) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listStatusChanges");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "transaction_ids", options.transactionIds));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder_ids", options.folderIds));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "envelope_ids", options.envelopeIds));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "powerformids", options.powerformids));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_position", options.startPosition));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", options.status));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_to_status", options.fromToStatus));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", options.order));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_filter", options.userFilter));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", options.userId));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_name", options.userName));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", options.count));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_field", options.customField));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", options.email));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_date", options.toDate));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_text", options.searchText));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "exclude", options.exclude));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "ac_status", options.acStatus));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_by", options.orderBy));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder_types", options.folderTypes));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "block", options.block));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", options.include));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "intersecting_folder_ids", options.intersectingFolderIds));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_date", options.fromDate));
    
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<EnvelopesInformation> localVarReturnType = new GenericType<EnvelopesInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  
  /// <summary>
  /// Gets the tabs information for a signer or sign-in-person recipient in an envelope. Retrieves information about the tabs associated with a recipient in a draft envelope.
  /// </summary>
  public class ListTabsOptions
  {
    
    private String includeMetadata = null;
    
    
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
   * Gets the tabs information for a signer or sign-in-person recipient in an envelope.
   * Retrieves information about the tabs associated with a recipient in a draft envelope.
     * @param accountId The external account number (int) or account ID Guid.
     * @param envelopeId The envelopeId Guid of the envelope being accessed.
     * @param recipientId The ID of the recipient being accessed.
     * @return Tabs
   */ 
  public Tabs listTabs(String accountId, String envelopeId, String recipientId) throws ApiException {
    return listTabs(accountId, envelopeId, recipientId, null);
  }
  

  /**
   * Gets the tabs information for a signer or sign-in-person recipient in an envelope.
   * Retrieves information about the tabs associated with a recipient in a draft envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param recipientId The ID of the recipient being accessed.
   
   * EnvelopesApi.ListTabsOptions Options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs listTabs(String accountId, String envelopeId, String recipientId, EnvelopesApi.ListTabsOptions options) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling listTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_metadata", options.includeMetadata));
    
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Get List of Templates used in an Envelope
   * This returns a list of the server-side templates, their name and ID, used in an envelope.\n
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.ListTemplatesOptions Options for modifying the method behavior.
   * @return TemplateInformation
   * @throws ApiException if fails to make API call
   */
  public TemplateInformation listTemplates(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTemplates");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/templates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<TemplateInformation> localVarReturnType = new GenericType<TemplateInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Gets the templates associated with a document in an existing envelope.
   * Retrieves the templates associated with a document in the specified envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param documentId The ID of the document being accessed.
   
   * EnvelopesApi.ListTemplatesForDocumentOptions Options for modifying the method behavior.
   * @return TemplateInformation
   * @throws ApiException if fails to make API call
   */
  public TemplateInformation listTemplatesForDocument(String accountId, String envelopeId, String documentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTemplatesForDocument");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listTemplatesForDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling listTemplatesForDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<TemplateInformation> localVarReturnType = new GenericType<TemplateInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  
  /// <summary>
  /// Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft The Put Envelopes endpoint provides the following functionality:\n\n* Sends the specified single draft envelope.\nAdd {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.\n\n* Voids the specified in-process envelope.\nAdd {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.\n\n* Replaces the current email subject and message for a draft envelope.\nAdd {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.\n\n* Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system.\nAdd {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.\n\n*Additional information on purging documents*\n\nThe purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).\n\n###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period. \n###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents. \n###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.\n\nWhen the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.\n\nIf `purgeState=\&quot;documents_queued\&quot;` is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If `purgeState= \&quot;documents_and_metadata_queued\&quot;` is used in the request, then the documents, attachments, and tabs are deleted.
  /// </summary>
  public class UpdateOptions
  {
    
    private String advancedUpdate = null;
    
    private String resendEnvelope = null;
    
    
    /*
     * When set to **true**, allows the caller to update recipients, tabs, custom fields, notification, email settings and other envelope attributes. 
     */
    public void setAdvancedUpdate(String advancedUpdate) {
      this.advancedUpdate = advancedUpdate;
    }

    public String getAdvancedUpdate() {
      return this.advancedUpdate;
    }
    
    /*
     * When set to **true**, sends the specified envelope again. 
     */
    public void setResendEnvelope(String resendEnvelope) {
      this.resendEnvelope = resendEnvelope;
    }

    public String getResendEnvelope() {
      return this.resendEnvelope;
    }
    
  }

  /**
   * Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft
   * The Put Envelopes endpoint provides the following functionality:\n\n* Sends the specified single draft envelope.\nAdd {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.\n\n* Voids the specified in-process envelope.\nAdd {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.\n\n* Replaces the current email subject and message for a draft envelope.\nAdd {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.\n\n* Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system.\nAdd {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.\n\n*Additional information on purging documents*\n\nThe purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).\n\n###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period. \n###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents. \n###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.\n\nWhen the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.\n\nIf `purgeState=\&quot;documents_queued\&quot;` is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If `purgeState= \&quot;documents_and_metadata_queued\&quot;` is used in the request, then the documents, attachments, and tabs are deleted.
     * @param accountId The external account number (int) or account ID Guid.
     * @param envelopeId The envelopeId Guid of the envelope being accessed.
     * @return EnvelopeUpdateSummary
   */ 
  public EnvelopeUpdateSummary update(String accountId, String envelopeId, Envelope envelope) throws ApiException {
    return update(accountId, envelopeId, envelope, null);
  }
  

  /**
   * Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft
   * The Put Envelopes endpoint provides the following functionality:\n\n* Sends the specified single draft envelope.\nAdd {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.\n\n* Voids the specified in-process envelope.\nAdd {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.\n\n* Replaces the current email subject and message for a draft envelope.\nAdd {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.\n\n* Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system.\nAdd {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.\n\n*Additional information on purging documents*\n\nThe purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).\n\n###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period. \n###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents. \n###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.\n\nWhen the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.\n\nIf `purgeState=\&quot;documents_queued\&quot;` is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If `purgeState= \&quot;documents_and_metadata_queued\&quot;` is used in the request, then the documents, attachments, and tabs are deleted.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.UpdateOptions Options for modifying the method behavior.
   * @return EnvelopeUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public EnvelopeUpdateSummary update(String accountId, String envelopeId, Envelope envelope, EnvelopesApi.UpdateOptions options) throws ApiException {
    Object localVarPostBody = envelope;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling update");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling update");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "advanced_update", options.advancedUpdate));
    
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "resend_envelope", options.resendEnvelope));
    
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<EnvelopeUpdateSummary> localVarReturnType = new GenericType<EnvelopeUpdateSummary>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Updates envelope custom fields in an envelope.
   * Updates the envelope custom fields in draft and in-process envelopes.\n\nEach custom field used in an envelope must have a unique name.\n
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.UpdateCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields updateCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
    Object localVarPostBody = customFields;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateCustomFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Updates existing custom document fields in an existing envelope document.
   * Updates existing custom document fields in an existing envelope document.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param documentId The ID of the document being accessed.
   
   * EnvelopesApi.UpdateDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation updateDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    Object localVarPostBody = documentFieldsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocumentFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  
  /// <summary>
  /// Adds one or more documents to an existing envelope document. Adds one or more documents to an existing envelope document.
  /// </summary>
  public class UpdateDocumentsOptions
  {
    
    private String applyDocumentFields = null;
    
    
    /*
     * 
     */
    public void setApplyDocumentFields(String applyDocumentFields) {
      this.applyDocumentFields = applyDocumentFields;
    }

    public String getApplyDocumentFields() {
      return this.applyDocumentFields;
    }
    
  }

  /**
   * Adds one or more documents to an existing envelope document.
   * Adds one or more documents to an existing envelope document.
     * @param accountId The external account number (int) or account ID Guid.
     * @param envelopeId The envelopeId Guid of the envelope being accessed.
     * @return EnvelopeDocumentsResult
   */ 
  public EnvelopeDocumentsResult updateDocuments(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    return updateDocuments(accountId, envelopeId, envelopeDefinition, null);
  }
  

  /**
   * Adds one or more documents to an existing envelope document.
   * Adds one or more documents to an existing envelope document.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.UpdateDocumentsOptions Options for modifying the method behavior.
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocumentsResult updateDocuments(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition, EnvelopesApi.UpdateDocumentsOptions options) throws ApiException {
    Object localVarPostBody = envelopeDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocuments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
     
       localVarQueryParams.addAll(apiClient.parameterToPairs("", "apply_document_fields", options.applyDocumentFields));
    
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<EnvelopeDocumentsResult> localVarReturnType = new GenericType<EnvelopeDocumentsResult>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Updates the email setting overrides for an envelope.
   * Updates the existing email override settings for the specified envelope. Note that modifying email settings will only affect email communications that occur after the modification was made.\n\nThis can also be used to delete an individual email override setting by using an empty string for the value to be deleted.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.UpdateEmailSettingsOptions Options for modifying the method behavior.
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings updateEmailSettings(String accountId, String envelopeId, EmailSettings emailSettings) throws ApiException {
    Object localVarPostBody = emailSettings;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEmailSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateEmailSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Updates an envelope lock.
   * Updates the lock duration time or update the `lockedByApp` property information for the specified envelope. The user and integrator key must match the user specified by the `lockByUser` property and integrator key information and the `X-DocuSign-Edit` header must be included or an error will be generated.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.UpdateLockOptions Options for modifying the method behavior.
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation updateLock(String accountId, String envelopeId, LockRequest lockRequest) throws ApiException {
    Object localVarPostBody = lockRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateLock");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope. \n\nFor draft envelopes, you can edit the following properties: `email`, `userName`, `routingOrder`, `faxNumber`, `deliveryMethod`, `accessCode`, and `requireIdLookup`.\n\nOnce an envelope has been sent, you can only edit: `email`, `userName`, `signerName`, `routingOrder`, `faxNumber`, and `deliveryMethod`. You can also select to resend an envelope by using the `resend_envelope` option.\n\nIf you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
   
   * EnvelopesApi.UpdateRecipientsOptions Options for modifying the method behavior.
   * @return RecipientsUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public RecipientsUpdateSummary updateRecipients(String accountId, String envelopeId, Recipients recipients) throws ApiException {
    Object localVarPostBody = recipients;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipients");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipients");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    
    GenericType<RecipientsUpdateSummary> localVarReturnType = new GenericType<RecipientsUpdateSummary>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  

  

  /**
   * Updates the tabs for a recipient.\n\n
   * Updates one or more tabs for a recipient in a draft envelope.
      * @param accountId The external account number (int) or account ID Guid.
      * @param envelopeId The envelopeId Guid of the envelope being accessed.
      * @param recipientId The ID of the recipient being accessed.
   
   * EnvelopesApi.UpdateTabsOptions Options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs updateTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
