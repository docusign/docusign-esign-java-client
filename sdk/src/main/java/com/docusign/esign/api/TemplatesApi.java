package com.docusign.esign.api;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.TypeRef;

import com.docusign.esign.model.EnvelopeTemplateResults;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.TemplateSummary;
import com.docusign.esign.model.EnvelopeTemplate;
import com.docusign.esign.model.TemplateUpdateSummary;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.TemplateCustomFields;
import com.docusign.esign.model.TemplateDocumentsResult;
import com.docusign.esign.model.EnvelopeDefinition;
import com.docusign.esign.model.DocumentFieldsInformation;
import com.docusign.esign.model.PageRequest;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.Notification;
import com.docusign.esign.model.TemplateNotificationRequest;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.RecipientsUpdateSummary;
import com.docusign.esign.model.TemplateRecipients;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.TemplateTabs;
import com.docusign.esign.model.GroupInformation;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
   * Gets the definition of a template.
   * Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
   * @param accountId The external account number (int) or account ID Guid.
   * TemplatesApi.ListTemplatesOptions Options for modifying the method behavior.
   * @return EnvelopeTemplateResults
   */
  public EnvelopeTemplateResults listTemplates(String accountId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTemplates");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates".replaceAll("\\{format\\}","json")
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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<EnvelopeTemplateResults>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Creates an envelope from a template.
   * Creates a template definition using a multipart request.\n\n###Template Email Subject Merge Fields\n\nCall this endpoint to insert a recipient name and email address merge fields into the email subject line when creating or sending from a template.\n\nThe merge fields, based on the recipient’s role name, are added to the `emailSubject` property when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.\n\nBoth the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.\n### Note: If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.\n\nTo add a recipient’s name in the subject line add the following text in the `emailSubject` property when creating the template or when sending an envelope from a template:\n\n[[&lt;roleName&gt;_UserName]]\n\nExample:\n\n`\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,`\n\nTo add a recipient’s email address in the subject line add the following text in the `emailSubject` property when creating the template or when sending an envelope from a template:\n\n[[&lt;roleName&gt;_Email]]\n\nExample:\n\n`\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,`\n\n\nIn both cases the &lt;roleName&gt; is the recipient&#39;s contents of the `roleName` property in the template.\n\nFor cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.
   * @param accountId The external account number (int) or account ID Guid.
   * TemplatesApi.CreateTemplateOptions Options for modifying the method behavior.
   * @return TemplateSummary
   */
  public TemplateSummary createTemplate(String accountId, EnvelopeTemplate envelopeTemplate) throws ApiException {
  
     Object postBody = envelopeTemplate;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTemplate");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates".replaceAll("\\{format\\}","json")
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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<TemplateSummary>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets a list of templates for a specified account.
   * Retrieves the definition of the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.GetOptions Options for modifying the method behavior.
   * @return EnvelopeTemplate
   */
  public EnvelopeTemplate get(String accountId, String templateId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling get");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling get");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<EnvelopeTemplate>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Updates an existing template.
   * Updates an existing template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.UpdateOptions Options for modifying the method behavior.
   * @return TemplateUpdateSummary
   */
  public TemplateUpdateSummary update(String accountId, String templateId, EnvelopeTemplate envelopeTemplate) throws ApiException {
  
     Object postBody = envelopeTemplate;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling update");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling update");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<TemplateUpdateSummary>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets the custom document fields from a template.
   * Retrieves the custom document field information from an existing template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.ListCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields listCustomFields(String accountId, String templateId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling listCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<CustomFields>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Updates envelope custom fields in a template.
   * Updates the custom fields in a template.\n\nEach custom field used in a template must have a unique name.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.UpdateCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields updateCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
  
     Object postBody = templateCustomFields;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateCustomFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<CustomFields>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Creates custom document fields in an existing template document.
   * Creates custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.CreateCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields createCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
  
     Object postBody = templateCustomFields;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createCustomFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling createCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<CustomFields>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Deletes envelope custom fields in a template.
   * Deletes envelope custom fields in a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.DeleteCustomFieldsOptions Options for modifying the method behavior.
   * @return CustomFields
   */
  public CustomFields deleteCustomFields(String accountId, String templateId, TemplateCustomFields templateCustomFields) throws ApiException {
  
     Object postBody = templateCustomFields;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCustomFields");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteCustomFields");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/custom_fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<CustomFields>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets a list of documents associated with a template.
   * Retrieves a list of documents associated with the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.ListDocumentsOptions Options for modifying the method behavior.
   * @return TemplateDocumentsResult
   */
  public TemplateDocumentsResult listDocuments(String accountId, String templateId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocuments");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling listDocuments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<TemplateDocumentsResult>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Adds documents to a template document.
   * Adds one or more documents to an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.UpdateDocumentsOptions Options for modifying the method behavior.
   * @return TemplateDocumentsResult
   */
  public TemplateDocumentsResult updateDocuments(String accountId, String templateId, EnvelopeDefinition envelopeDefinition) throws ApiException {
  
     Object postBody = envelopeDefinition;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocuments");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateDocuments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<TemplateDocumentsResult>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Deletes documents from a template.
   * Deletes one or more documents from an existing template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.DeleteDocumentsOptions Options for modifying the method behavior.
   * @return TemplateDocumentsResult
   */
  public TemplateDocumentsResult deleteDocuments(String accountId, String templateId, EnvelopeDefinition envelopeDefinition) throws ApiException {
  
     Object postBody = envelopeDefinition;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocuments");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteDocuments");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<TemplateDocumentsResult>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets PDF documents from a template.
   * Retrieves one or more PDF documents from the specified template.\n\nYou can specify the ID of the document to retrieve or can specify `combined` to retrieve all documents in the template as one pdf.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * TemplatesApi.GetDocumentOptions Options for modifying the method behavior.
   * @return byte[]
   */
  public byte[] getDocument(String accountId, String templateId, String documentId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> queryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> headerParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> formParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/pdf"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    byte[] fileBytes = apiClient.invokeBinaryAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames);
    return fileBytes;
    
    
    
	
  }
  
  


  
  
  
  /**
   * Gets the custom document fields for a an existing template document.
   * Retrieves the custom document fields for an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * TemplatesApi.ListDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation listDocumentFields(String accountId, String templateId, String documentId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Updates existing custom document fields in an existing template document.
   * Updates existing custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * TemplatesApi.UpdateDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation updateDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
  
     Object postBody = documentFieldsInformation;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Creates custom document fields in an existing template document.
   * Creates custom document fields in an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * TemplatesApi.CreateDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation createDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
  
     Object postBody = documentFieldsInformation;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Deletes custom document fields from an existing template document.
   * Deletes custom document fields from an existing template document.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * TemplatesApi.DeleteDocumentFieldsOptions Options for modifying the method behavior.
   * @return DocumentFieldsInformation
   */
  public DocumentFieldsInformation deleteDocumentFields(String accountId, String templateId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
  
     Object postBody = documentFieldsInformation;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Deletes a page from a document in an template.
   * Deletes a page from a document in a template based on the page number.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param documentId The ID of the document being accessed.
   * @param pageNumber The page number being accessed.
   * TemplatesApi.DeleteDocumentPageOptions Options for modifying the method behavior.
   * @return void
   */
  public void deleteDocumentPage(String accountId, String templateId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
  
     Object postBody = pageRequest;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets template lock information.
   * Retrieves general information about the template lock.\n\nIf the call is made by the locked by user and the request has the same integrator key as original, then the `X-DocuSign-Edit` header and additional lock information is included in the response. This allows users to recover a lost editing session token and the `X-DocuSign-Edit` header.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.GetLockOptions Options for modifying the method behavior.
   * @return LockInformation
   */
  public LockInformation getLock(String accountId, String templateId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getLock");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling getLock");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/lock".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<LockInformation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets template notification information.
   * Retrieves the envelope notification, reminders and expirations, information for an existing template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.GetNotificationSettingsOptions Options for modifying the method behavior.
   * @return Notification
   */
  public Notification getNotificationSettings(String accountId, String templateId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling getNotificationSettings");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling getNotificationSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/notification".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Notification>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Updates the notification  structure for an existing template.
   * Updates the notification structure for an existing template. Use this endpoint to set reminder and expiration notifications.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.UpdateNotificationSettingsOptions Options for modifying the method behavior.
   * @return Notification
   */
  public Notification updateNotificationSettings(String accountId, String templateId, TemplateNotificationRequest templateNotificationRequest) throws ApiException {
  
     Object postBody = templateNotificationRequest;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateNotificationSettings");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateNotificationSettings");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/notification".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Notification>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets recipient information from a template.
   * Retrieves the information for all recipients in the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.ListRecipientsOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients listRecipients(String accountId, String templateId) throws ApiException {
  
     Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling listRecipients");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling listRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Recipients>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Updates recipients in a template.
   * Updates recipients in a template. \n\nYou can edit the following properties: `email`, `userName`, `routingOrder`, `faxNumber`, `deliveryMethod`, `accessCode`, and `requireIdLookup`.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.UpdateRecipientsOptions Options for modifying the method behavior.
   * @return RecipientsUpdateSummary
   */
  public RecipientsUpdateSummary updateRecipients(String accountId, String templateId, TemplateRecipients templateRecipients) throws ApiException {
  
     Object postBody = templateRecipients;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipients");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<RecipientsUpdateSummary>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Adds tabs for a recipient.
   * Adds one or more recipients to a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.CreateRecipientsOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients createRecipients(String accountId, String templateId, TemplateRecipients templateRecipients) throws ApiException {
  
     Object postBody = templateRecipients;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipients");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling createRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Recipients>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Deletes recipients from a template.
   * Deletes one or more recipients from a template. Recipients to be deleted are listed in the request, with the `recipientId` being used as the key for deleting recipients.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * TemplatesApi.DeleteRecipientsOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients deleteRecipients(String accountId, String templateId, TemplateRecipients templateRecipients) throws ApiException {
  
     Object postBody = templateRecipients;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'accountId' is set
     if (accountId == null) {
        throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipients");
     }
     
     // verify the required parameter 'templateId' is set
     if (templateId == null) {
        throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteRecipients");
     }
     
    // create path and map variables
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Recipients>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Deletes the specified recipient file from a template.
   * Deletes the specified recipient file from the specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * TemplatesApi.DeleteRecipientOptions Options for modifying the method behavior.
   * @return Recipients
   */
  public Recipients deleteRecipient(String accountId, String templateId, String recipientId, TemplateRecipients templateRecipients) throws ApiException {
  
     Object postBody = templateRecipients;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Recipients>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * Gets the tabs information for a signer or sign-in-person recipient in a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * TemplatesApi.ListTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs listTabs(String accountId, String templateId, String recipientId, Tabs tabs) throws ApiException {
  
     Object postBody = tabs;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Tabs>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Updates the tabs for a recipient.
   * Updates one or more tabs for a recipient in a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * TemplatesApi.UpdateTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs updateTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
  
     Object postBody = templateTabs;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Tabs>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Adds tabs for a recipient.
   * Adds one or more tabs for a recipient.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * TemplatesApi.CreateTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs createTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
  
     Object postBody = templateTabs;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Tabs>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Deletes the tabs associated with a recipient in a template.
   * Deletes one or more tabs associated with a recipient in a template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param recipientId The ID of the recipient being accessed.
   * TemplatesApi.DeleteTabsOptions Options for modifying the method behavior.
   * @return Tabs
   */
  public Tabs deleteTabs(String accountId, String templateId, String recipientId, TemplateTabs templateTabs) throws ApiException {
  
     Object postBody = templateTabs;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Tabs>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Shares a template with a group
   * Shares a template with the specified members group.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param templatePart Currently, the only defined part is **groups**.
   * TemplatesApi.UpdateGroupShareOptions Options for modifying the method behavior.
   * @return GroupInformation
   */
  public GroupInformation updateGroupShare(String accountId, String templateId, String templatePart, GroupInformation groupInformation) throws ApiException {
  
     Object postBody = groupInformation;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/{templatePart}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "templatePart" + "\\}", apiClient.escapeString(templatePart.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<GroupInformation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
  


  
  
  
  /**
   * Removes a member group&#39;s sharing permissions for a template.
   * Removes a member group&#39;s sharing permissions for a specified template.
   * @param accountId The external account number (int) or account ID Guid.
   * @param templateId The ID of the template being accessed.
   * @param templatePart Currently, the only defined part is **groups**.
   * TemplatesApi.DeleteGroupShareOptions Options for modifying the method behavior.
   * @return GroupInformation
   */
  public GroupInformation deleteGroupShare(String accountId, String templateId, String templatePart, GroupInformation groupInformation) throws ApiException {
  
     Object postBody = groupInformation;
    byte[] postBinaryBody = null;
    
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
    String path = "/v2/accounts/{accountId}/templates/{templateId}/{templatePart}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "templatePart" + "\\}", apiClient.escapeString(templatePart.toString()));

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<GroupInformation>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    
	
  }
  
}
