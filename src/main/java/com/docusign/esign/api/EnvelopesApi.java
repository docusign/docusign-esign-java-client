
package com.docusign.esign.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;
import com.docusign.esign.client.ApiResponse;




/**
 * EnvelopesApi class.
 *
 **/
public class EnvelopesApi {
  private ApiClient apiClient;

 /**
  * EnvelopesApi.
  *
  **/
  public EnvelopesApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * EnvelopesApi.
  *
  **/
  public EnvelopesApi(ApiClient apiClient) {
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

  /// <summary>
  /// Adds templates to an envelope. Adds templates to the specified envelope.
  /// </summary>

 /**
  * ApplyTemplateOptions Class.
  *
  **/
  public class ApplyTemplateOptions
  {
  private String preserveTemplateRecipient = null;
  
 /**
  * setPreserveTemplateRecipient method.
  */
  public void setPreserveTemplateRecipient(String preserveTemplateRecipient) {
    this.preserveTemplateRecipient = preserveTemplateRecipient;
  }

 /**
  * getPreserveTemplateRecipient method.
  *
  * @return String
  */
  public String getPreserveTemplateRecipient() {
    return this.preserveTemplateRecipient;
  }
  }

   /**
   * Adds templates to an envelope..
   * Adds templates to the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentTemplateList  (optional)
   * @return DocumentTemplateList
   */ 
  public DocumentTemplateList applyTemplate(String accountId, String envelopeId, DocumentTemplateList documentTemplateList) throws ApiException {
    return applyTemplate(accountId, envelopeId, documentTemplateList, null);
  }

  /**
   * Adds templates to an envelope..
   * Adds templates to the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentTemplateList  (optional)
   * @param options for modifying the method behavior.
   * @return DocumentTemplateList
   * @throws ApiException if fails to make API call
   */
  public DocumentTemplateList applyTemplate(String accountId, String envelopeId, DocumentTemplateList documentTemplateList, EnvelopesApi.ApplyTemplateOptions options) throws ApiException {
    ApiResponse<DocumentTemplateList> localVarResponse = applyTemplateWithHttpInfo(accountId, envelopeId, documentTemplateList, options);
    return localVarResponse.getData();
  }

  /**
   * Adds templates to an envelope.
   * Adds templates to the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentTemplateList  (optional)
   * @param options for modifying the method behavior.
   * @return DocumentTemplateList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentTemplateList > applyTemplateWithHttpInfo(String accountId, String envelopeId, DocumentTemplateList documentTemplateList, EnvelopesApi.ApplyTemplateOptions options) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("preserve_template_recipient", options.preserveTemplateRecipient));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<DocumentTemplateList> localVarReturnType = new GenericType<DocumentTemplateList>() {};
    DocumentTemplateList localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentTemplateList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Adds templates to a document in an  envelope. Adds templates to a document in the specified envelope.
  /// </summary>

 /**
  * ApplyTemplateToDocumentOptions Class.
  *
  **/
  public class ApplyTemplateToDocumentOptions
  {
  private String preserveTemplateRecipient = null;
  
 /**
  * setPreserveTemplateRecipient method.
  */
  public void setPreserveTemplateRecipient(String preserveTemplateRecipient) {
    this.preserveTemplateRecipient = preserveTemplateRecipient;
  }

 /**
  * getPreserveTemplateRecipient method.
  *
  * @return String
  */
  public String getPreserveTemplateRecipient() {
    return this.preserveTemplateRecipient;
  }
  }

   /**
   * Adds templates to a document in an  envelope..
   * Adds templates to a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentTemplateList  (optional)
   * @return DocumentTemplateList
   */ 
  public DocumentTemplateList applyTemplateToDocument(String accountId, String envelopeId, String documentId, DocumentTemplateList documentTemplateList) throws ApiException {
    return applyTemplateToDocument(accountId, envelopeId, documentId, documentTemplateList, null);
  }

  /**
   * Adds templates to a document in an  envelope..
   * Adds templates to a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentTemplateList  (optional)
   * @param options for modifying the method behavior.
   * @return DocumentTemplateList
   * @throws ApiException if fails to make API call
   */
  public DocumentTemplateList applyTemplateToDocument(String accountId, String envelopeId, String documentId, DocumentTemplateList documentTemplateList, EnvelopesApi.ApplyTemplateToDocumentOptions options) throws ApiException {
    ApiResponse<DocumentTemplateList> localVarResponse = applyTemplateToDocumentWithHttpInfo(accountId, envelopeId, documentId, documentTemplateList, options);
    return localVarResponse.getData();
  }

  /**
   * Adds templates to a document in an  envelope.
   * Adds templates to a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentTemplateList  (optional)
   * @param options for modifying the method behavior.
   * @return DocumentTemplateList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentTemplateList > applyTemplateToDocumentWithHttpInfo(String accountId, String envelopeId, String documentId, DocumentTemplateList documentTemplateList, EnvelopesApi.ApplyTemplateToDocumentOptions options) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("preserve_template_recipient", options.preserveTemplateRecipient));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<DocumentTemplateList> localVarReturnType = new GenericType<DocumentTemplateList>() {};
    DocumentTemplateList localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentTemplateList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Initiate a new ChunkedUpload..
   * This method initiates a new chunked upload with the first part of the content.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadRequest  (optional)
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadResponse createChunkedUpload(String accountId, ChunkedUploadRequest chunkedUploadRequest) throws ApiException {
    ApiResponse<ChunkedUploadResponse> localVarResponse = createChunkedUploadWithHttpInfo(accountId, chunkedUploadRequest);
    return localVarResponse.getData();
  }

  /**
   * Initiate a new ChunkedUpload.
   * This method initiates a new chunked upload with the first part of the content.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadRequest  (optional)
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChunkedUploadResponse > createChunkedUploadWithHttpInfo(String accountId, ChunkedUploadRequest chunkedUploadRequest) throws ApiException {
    Object localVarPostBody = chunkedUploadRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createChunkedUpload");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/chunked_uploads"
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
    
    GenericType<ChunkedUploadResponse> localVarReturnType = new GenericType<ChunkedUploadResponse>() {};
    ChunkedUploadResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ChunkedUploadResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns a URL to the authentication view UI..
   * Returns a URL that allows you to embed the authentication view of the DocuSign UI in your applications.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param consoleViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createConsoleView(String accountId, ConsoleViewRequest consoleViewRequest) throws ApiException {
    ApiResponse<ViewUrl> localVarResponse = createConsoleViewWithHttpInfo(accountId, consoleViewRequest);
    return localVarResponse.getData();
  }

  /**
   * Returns a URL to the authentication view UI.
   * Returns a URL that allows you to embed the authentication view of the DocuSign UI in your applications.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param consoleViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ViewUrl > createConsoleViewWithHttpInfo(String accountId, ConsoleViewRequest consoleViewRequest) throws ApiException {
    Object localVarPostBody = consoleViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createConsoleView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/views/console"
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
    
    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    ViewUrl localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ViewUrl>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns a URL to the envelope correction UI..
   * Returns a URL that allows you to embed the envelope correction view of the DocuSign UI in your applications.  Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param correctViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createCorrectView(String accountId, String envelopeId, CorrectViewRequest correctViewRequest) throws ApiException {
    ApiResponse<ViewUrl> localVarResponse = createCorrectViewWithHttpInfo(accountId, envelopeId, correctViewRequest);
    return localVarResponse.getData();
  }

  /**
   * Returns a URL to the envelope correction UI.
   * Returns a URL that allows you to embed the envelope correction view of the DocuSign UI in your applications.  Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param correctViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ViewUrl > createCorrectViewWithHttpInfo(String accountId, String envelopeId, CorrectViewRequest correctViewRequest) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/correct"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Updates envelope custom fields for an envelope..
   * Updates the envelope custom fields for draft and in-process envelopes.  Each custom field used in an envelope must have a unique name.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param customFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields createCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
    ApiResponse<CustomFields> localVarResponse = createCustomFieldsWithHttpInfo(accountId, envelopeId, customFields);
    return localVarResponse.getData();
  }

  /**
   * Updates envelope custom fields for an envelope.
   * Updates the envelope custom fields for draft and in-process envelopes.  Each custom field used in an envelope must have a unique name.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param customFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomFields > createCustomFieldsWithHttpInfo(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Creates custom document fields in an existing envelope document..
   * Creates custom document fields in an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation createDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    ApiResponse<DocumentFieldsInformation> localVarResponse = createDocumentFieldsWithHttpInfo(accountId, envelopeId, documentId, documentFieldsInformation);
    return localVarResponse.getData();
  }

  /**
   * Creates custom document fields in an existing envelope document.
   * Creates custom document fields in an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentFieldsInformation > createDocumentFieldsWithHttpInfo(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Get Responsive HTML Preview for a document in an envelope..
   * Creates a preview of the [responsive](/docs/esign-rest-api/esign101/concepts/responsive/) HTML version of a specific document. This method enables you to preview a PDF document conversion to responsive HTML across device types prior to sending.  The request body is a &#x60;documentHtmlDefinition&#x60; object, which holds the responsive signing parameters that define how to generate the HTML version of the signing document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitions createDocumentResponsiveHtmlPreview(String accountId, String envelopeId, String documentId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
    ApiResponse<DocumentHtmlDefinitions> localVarResponse = createDocumentResponsiveHtmlPreviewWithHttpInfo(accountId, envelopeId, documentId, documentHtmlDefinition);
    return localVarResponse.getData();
  }

  /**
   * Get Responsive HTML Preview for a document in an envelope.
   * Creates a preview of the [responsive](/docs/esign-rest-api/esign101/concepts/responsive/) HTML version of a specific document. This method enables you to preview a PDF document conversion to responsive HTML across device types prior to sending.  The request body is a &#x60;documentHtmlDefinition&#x60; object, which holds the responsive signing parameters that define how to generate the HTML version of the signing document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentHtmlDefinitions > createDocumentResponsiveHtmlPreviewWithHttpInfo(String accountId, String envelopeId, String documentId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
    Object localVarPostBody = documentHtmlDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createDocumentResponsiveHtmlPreview");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createDocumentResponsiveHtmlPreview");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling createDocumentResponsiveHtmlPreview");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/responsive_html_preview"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Adds the tabs to an envelope document.
   * Adds tabs to the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;.  In the request body, you only need to specify the tabs that your are adding. For example, to add a text [prefill tab](/docs/esign-rest-api/reference/envelopes/envelopedocumenttabs/create/#definition__tabs_prefilltabs), your request body might look like this:  &#x60;&#x60;&#x60; {   \&quot;prefillTabs\&quot;: {     \&quot;textTabs\&quot;: [       {         \&quot;value\&quot;: \&quot;a prefill text tab\&quot;,         \&quot;pageNumber\&quot;: \&quot;1\&quot;,         \&quot;documentId\&quot;: \&quot;1\&quot;,         \&quot;xPosition\&quot;: 316,         \&quot;yPosition\&quot;: 97       }     ]   } } &#x60;&#x60;&#x60; 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs createDocumentTabs(String accountId, String envelopeId, String documentId, Tabs tabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = createDocumentTabsWithHttpInfo(accountId, envelopeId, documentId, tabs);
    return localVarResponse.getData();
  }

  /**
   * Adds the tabs to an envelope document
   * Adds tabs to the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;.  In the request body, you only need to specify the tabs that your are adding. For example, to add a text [prefill tab](/docs/esign-rest-api/reference/envelopes/envelopedocumenttabs/create/#definition__tabs_prefilltabs), your request body might look like this:  &#x60;&#x60;&#x60; {   \&quot;prefillTabs\&quot;: {     \&quot;textTabs\&quot;: [       {         \&quot;value\&quot;: \&quot;a prefill text tab\&quot;,         \&quot;pageNumber\&quot;: \&quot;1\&quot;,         \&quot;documentId\&quot;: \&quot;1\&quot;,         \&quot;xPosition\&quot;: 316,         \&quot;yPosition\&quot;: 97       }     ]   } } &#x60;&#x60;&#x60; 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > createDocumentTabsWithHttpInfo(String accountId, String envelopeId, String documentId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createDocumentTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling createDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Returns a URL to the edit view UI..
   * Returns a URL that allows you to embed the edit view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign editing view.   Upon sending completion, the user is returned to the return URL provided by the API application.  Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param returnUrlRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createEditView(String accountId, String envelopeId, ReturnUrlRequest returnUrlRequest) throws ApiException {
    ApiResponse<ViewUrl> localVarResponse = createEditViewWithHttpInfo(accountId, envelopeId, returnUrlRequest);
    return localVarResponse.getData();
  }

  /**
   * Returns a URL to the edit view UI.
   * Returns a URL that allows you to embed the edit view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign editing view.   Upon sending completion, the user is returned to the return URL provided by the API application.  Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param returnUrlRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ViewUrl > createEditViewWithHttpInfo(String accountId, String envelopeId, ReturnUrlRequest returnUrlRequest) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/edit"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Adds email setting overrides to an envelope..
   * Adds email override settings, changing the email address to reply to an email address, name, or the BCC for email archive information, for the envelope. Note that adding email settings will only affect email communications that occur after the addition was made.  ### Important: The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, use a Carbon Copies or Certified Deliveries Recipient Type.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param emailSettings  (optional)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings createEmailSettings(String accountId, String envelopeId, EmailSettings emailSettings) throws ApiException {
    ApiResponse<EmailSettings> localVarResponse = createEmailSettingsWithHttpInfo(accountId, envelopeId, emailSettings);
    return localVarResponse.getData();
  }

  /**
   * Adds email setting overrides to an envelope.
   * Adds email override settings, changing the email address to reply to an email address, name, or the BCC for email archive information, for the envelope. Note that adding email settings will only affect email communications that occur after the addition was made.  ### Important: The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, use a Carbon Copies or Certified Deliveries Recipient Type.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param emailSettings  (optional)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailSettings > createEmailSettingsWithHttpInfo(String accountId, String envelopeId, EmailSettings emailSettings) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/email_settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    EmailSettings localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EmailSettings>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Creates an envelope. Creates an envelope.   Using this function you can: * Create an envelope and send it. * Create an envelope from an existing template and send it.  In either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request&#39;s &#x60;status&#x60; property to &#x60;created&#x60; instead of &#x60;sent&#x60;.  ## Sending Envelopes  Documents can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the &#x60;documentBase64&#x60; field of the [&#x60;document&#x60; object](#/definitions/document)  ### Recipient Types An [&#x60;envelopeDefinition&#x60; object](#/definitions/envelopeDefinition) is used as the method&#39;s body. Envelope recipients can be defined in the envelope or in templates. The &#x60;envelopeDefinition&#x60; object&#39;s &#x60;recipients&#x60; field is an [&#x60;EnvelopeRecipients&#x60; resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:  Recipient type | Object definition -------------- | ----------------- agent (can add name and email information for later recipients/signers) | [&#x60;agent&#x60;](#/definitions/agent) carbon copy (receives a copy of the documents) | [&#x60;carbonCopy&#x60;](#/definitions/carbonCopy) certified delivery  (receives a copy of the documents and must acknowledge receipt) | [&#x60;certifiedDelivery&#x60;](#/definitions/certifiedDelivery) editor (can change recipients and document fields for later recipients/signers) | [&#x60;editor&#x60;](#/definitions/editor) in-person signer (\&quot;hosts\&quot; someone who signs in-person) | [&#x60;inPersonSigner&#x60;](#/definitions/inPersonSigner) intermediary (can add name and email information for some later recipients/signers.) | [&#x60;intermediary&#x60;](#/definitions/intermediary) signer (signs and/or updates document fields) | [&#x60;signer&#x60;](#/definitions/signer)  Additional information about the different types of recipients is available from the [&#x60;EnvelopeRecipients&#x60; resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)  ### Tabs Tabs (also referred to as &#x60;tags&#x60; and as &#x60;fields&#x60; in the web sending user interface), can be defined in the &#x60;envelopeDefinition&#x60;, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).  Defining tabs: the &#x60;inPersonSigner&#x60;, and &#x60;signer&#x60; recipient objects include a &#x60;tabs&#x60; field. It is an [&#x60;EnvelopeTabs&#x60; resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [&#x60;EnvelopeTabs&#x60; resource](../../EnvelopeTabs) for more information.  ## Using Templates Envelopes use specific people or groups as recipients. Templates can specify a role, eg &#x60;account_manager.&#x60; When a template is used in an envelope, the roles must be replaced with specific people or groups.  When you create an envelope using a &#x60;templateId&#x60;, the different recipient type objects within the [&#x60;EnvelopeRecipients&#x60; object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template&#39;s roles via the &#x60;roleName&#x60; property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.  ### Message Lock When a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field &#x60;messageLock&#x60; is used to lock the email subject and message.  If an email subject or message is entered before adding or applying a template with &#x60;messageLock&#x60; **true**, the email subject and message is overwritten with the locked email subject and message from the template.  ## Envelope Status The status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope&#39;s status changes. DocuSign limits polling to once every 15 minutes or less frequently.  When a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message.   See the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.  ## Webhook Options The two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client.   ### eventNotification Webhooks The Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.  ### Connect Webhooks Connect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc.   Connect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting \&quot;Go to Admin\&quot; from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.  Connect is available for some DocuSign account types. Please contact DocuSign Sales for more information.  ## Composite Templates  The Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.  Each Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.  * The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the &#x60;compositeTemplateId&#x60; to which the document should be added. If &#x60;compositeTemplateId&#x60; is not specified in the content-disposition, the document is applied based on the &#x60;documentId&#x60; only. If no document object is specified, the composite template inherits the first document.  * Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.  * Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.  * Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.  PDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set &#x60;transformPdfFields&#x60; to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.  * PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.  ### Compositing the definitions Each Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:  * Templates are overlaid in the order of their Sequence value. * If Document is not passed into the Composite Template&#39;s &#x60;document&#x60; field, the *first* template&#39;s document (based on the template&#39;s Sequence value) is used. * Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.  For example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.  * Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.  * If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.  * Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.  For example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.  * roleName and tabLabel matching is case sensitive.  * The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.  * You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with \&quot;\\*\&quot; and then the system matches tabs that start with the label.  * If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)  ### Including the Document Content for Composite Templates Document content can be supplied inline, using the &#x60;documentBase64&#x60; or can be included in a multi-part HTTP message.  If a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the &#x60;compositeTemplateId&#x60; to which the document should be added. Using the &#x60;compositeTemplateId&#x60; sets which documents are associated with particular composite templates. An example of this usage is:  &#x60;&#x60;&#x60;    --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d    Content-Type: application/pdf    Content-Disposition: file; filename&#x3D;\&quot;eula.pdf\&quot;; documentId&#x3D;1; compositeTemplateId&#x3D;\&quot;1\&quot;    Content-Transfer-Encoding: base64 &#x60;&#x60;&#x60;  ### PDF Form Field Transformation Only the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text  Field Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.  When transforming a *PDF Form Digital Signature Field,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials  Any other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab  When transforming *PDF Form Text Fields,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials DocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID DocuSignCompany or eSignCompany | Company DocuSignDateSigned or eSignDateSigned | Date Signed DocuSignTitle or eSignTitle | Title DocuSignFullName or eSignFullName |  Full Name DocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment  Any other PDF Form Text Field will be transformed to a DocuSign data (text) tab.  PDF Form Field Names that include \&quot;DocuSignIgnoreTransform\&quot; or \&quot;eSignIgnoreTransform\&quot; will not be transformed.  PDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.  ## Template Email Subject Merge Fields This feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.  The merge fields, based on the recipient&#39;s &#x60;roleName&#x60;, are added to the &#x60;emailSubject&#x60; when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.  Both the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.  If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.  * To add a recipient&#39;s name in the subject line add the following text in the &#x60;emailSubject&#x60; when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_UserName]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,&#x60;  * To add a recipient&#39;s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_Email]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,&#x60;  In both cases the &lt;roleName&gt; is the recipient&#39;s &#x60;roleName&#x60; in the template.  For cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.  ## Branding an envelope The following rules are used to determine the &#x60;brandId&#x60; used in an envelope:  * If a &#x60;brandId&#x60; is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope. * If more than one template is used in an envelope and more than one &#x60;brandId&#x60; is specified, the first &#x60;brandId&#x60; specified is used throughout the envelope. * In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account&#39;s default signing brand is used. * For envelopes that do not meet any of the previous criteria, the account&#39;s default signing brand is used for the envelope.  ## BCC Email address feature  The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don&#39;t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.  ## Merge Recipient Roles for Draft Envelopes When an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.  To prevent this, the query parameter &#x60;merge_roles_on_draft&#x60; should be added when posting a draft envelope (status&#x3D;created) with multiple templates. Doing this will merge template roles and remove empty recipients.  ###### Note: DocuSign recommends that the &#x60;merge_roles_on_draft&#x60; query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
  /// </summary>

 /**
  * CreateEnvelopeOptions Class.
  *
  **/
  public class CreateEnvelopeOptions
  {
  private String cdseMode = null;
  private String changeRoutingOrder = null;
  private String completedDocumentsOnly = null;
  private String mergeRolesOnDraft = null;
  private String tabLabelExactMatches = null;
  
 /**
  * setCdseMode method.
  */
  public void setCdseMode(String cdseMode) {
    this.cdseMode = cdseMode;
  }

 /**
  * getCdseMode method.
  *
  * @return String
  */
  public String getCdseMode() {
    return this.cdseMode;
  }
  
 /**
  * setChangeRoutingOrder method.
  */
  public void setChangeRoutingOrder(String changeRoutingOrder) {
    this.changeRoutingOrder = changeRoutingOrder;
  }

 /**
  * getChangeRoutingOrder method.
  *
  * @return String
  */
  public String getChangeRoutingOrder() {
    return this.changeRoutingOrder;
  }
  
 /**
  * setCompletedDocumentsOnly method.
  */
  public void setCompletedDocumentsOnly(String completedDocumentsOnly) {
    this.completedDocumentsOnly = completedDocumentsOnly;
  }

 /**
  * getCompletedDocumentsOnly method.
  *
  * @return String
  */
  public String getCompletedDocumentsOnly() {
    return this.completedDocumentsOnly;
  }
  
 /**
  * setMergeRolesOnDraft method.
  */
  public void setMergeRolesOnDraft(String mergeRolesOnDraft) {
    this.mergeRolesOnDraft = mergeRolesOnDraft;
  }

 /**
  * getMergeRolesOnDraft method.
  *
  * @return String
  */
  public String getMergeRolesOnDraft() {
    return this.mergeRolesOnDraft;
  }
  
 /**
  * setTabLabelExactMatches method.
  */
  public void setTabLabelExactMatches(String tabLabelExactMatches) {
    this.tabLabelExactMatches = tabLabelExactMatches;
  }

 /**
  * getTabLabelExactMatches method.
  *
  * @return String
  */
  public String getTabLabelExactMatches() {
    return this.tabLabelExactMatches;
  }
  }

   /**
   * Creates an envelope..
   * Creates an envelope.   Using this function you can: * Create an envelope and send it. * Create an envelope from an existing template and send it.  In either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request&#39;s &#x60;status&#x60; property to &#x60;created&#x60; instead of &#x60;sent&#x60;.  ## Sending Envelopes  Documents can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the &#x60;documentBase64&#x60; field of the [&#x60;document&#x60; object](#/definitions/document)  ### Recipient Types An [&#x60;envelopeDefinition&#x60; object](#/definitions/envelopeDefinition) is used as the method&#39;s body. Envelope recipients can be defined in the envelope or in templates. The &#x60;envelopeDefinition&#x60; object&#39;s &#x60;recipients&#x60; field is an [&#x60;EnvelopeRecipients&#x60; resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:  Recipient type | Object definition -------------- | ----------------- agent (can add name and email information for later recipients/signers) | [&#x60;agent&#x60;](#/definitions/agent) carbon copy (receives a copy of the documents) | [&#x60;carbonCopy&#x60;](#/definitions/carbonCopy) certified delivery  (receives a copy of the documents and must acknowledge receipt) | [&#x60;certifiedDelivery&#x60;](#/definitions/certifiedDelivery) editor (can change recipients and document fields for later recipients/signers) | [&#x60;editor&#x60;](#/definitions/editor) in-person signer (\&quot;hosts\&quot; someone who signs in-person) | [&#x60;inPersonSigner&#x60;](#/definitions/inPersonSigner) intermediary (can add name and email information for some later recipients/signers.) | [&#x60;intermediary&#x60;](#/definitions/intermediary) signer (signs and/or updates document fields) | [&#x60;signer&#x60;](#/definitions/signer)  Additional information about the different types of recipients is available from the [&#x60;EnvelopeRecipients&#x60; resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)  ### Tabs Tabs (also referred to as &#x60;tags&#x60; and as &#x60;fields&#x60; in the web sending user interface), can be defined in the &#x60;envelopeDefinition&#x60;, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).  Defining tabs: the &#x60;inPersonSigner&#x60;, and &#x60;signer&#x60; recipient objects include a &#x60;tabs&#x60; field. It is an [&#x60;EnvelopeTabs&#x60; resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [&#x60;EnvelopeTabs&#x60; resource](../../EnvelopeTabs) for more information.  ## Using Templates Envelopes use specific people or groups as recipients. Templates can specify a role, eg &#x60;account_manager.&#x60; When a template is used in an envelope, the roles must be replaced with specific people or groups.  When you create an envelope using a &#x60;templateId&#x60;, the different recipient type objects within the [&#x60;EnvelopeRecipients&#x60; object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template&#39;s roles via the &#x60;roleName&#x60; property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.  ### Message Lock When a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field &#x60;messageLock&#x60; is used to lock the email subject and message.  If an email subject or message is entered before adding or applying a template with &#x60;messageLock&#x60; **true**, the email subject and message is overwritten with the locked email subject and message from the template.  ## Envelope Status The status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope&#39;s status changes. DocuSign limits polling to once every 15 minutes or less frequently.  When a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message.   See the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.  ## Webhook Options The two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client.   ### eventNotification Webhooks The Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.  ### Connect Webhooks Connect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc.   Connect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting \&quot;Go to Admin\&quot; from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.  Connect is available for some DocuSign account types. Please contact DocuSign Sales for more information.  ## Composite Templates  The Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.  Each Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.  * The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the &#x60;compositeTemplateId&#x60; to which the document should be added. If &#x60;compositeTemplateId&#x60; is not specified in the content-disposition, the document is applied based on the &#x60;documentId&#x60; only. If no document object is specified, the composite template inherits the first document.  * Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.  * Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.  * Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.  PDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set &#x60;transformPdfFields&#x60; to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.  * PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.  ### Compositing the definitions Each Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:  * Templates are overlaid in the order of their Sequence value. * If Document is not passed into the Composite Template&#39;s &#x60;document&#x60; field, the *first* template&#39;s document (based on the template&#39;s Sequence value) is used. * Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.  For example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.  * Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.  * If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.  * Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.  For example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.  * roleName and tabLabel matching is case sensitive.  * The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.  * You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with \&quot;\\*\&quot; and then the system matches tabs that start with the label.  * If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)  ### Including the Document Content for Composite Templates Document content can be supplied inline, using the &#x60;documentBase64&#x60; or can be included in a multi-part HTTP message.  If a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the &#x60;compositeTemplateId&#x60; to which the document should be added. Using the &#x60;compositeTemplateId&#x60; sets which documents are associated with particular composite templates. An example of this usage is:  &#x60;&#x60;&#x60;    --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d    Content-Type: application/pdf    Content-Disposition: file; filename&#x3D;\&quot;eula.pdf\&quot;; documentId&#x3D;1; compositeTemplateId&#x3D;\&quot;1\&quot;    Content-Transfer-Encoding: base64 &#x60;&#x60;&#x60;  ### PDF Form Field Transformation Only the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text  Field Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.  When transforming a *PDF Form Digital Signature Field,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials  Any other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab  When transforming *PDF Form Text Fields,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials DocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID DocuSignCompany or eSignCompany | Company DocuSignDateSigned or eSignDateSigned | Date Signed DocuSignTitle or eSignTitle | Title DocuSignFullName or eSignFullName |  Full Name DocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment  Any other PDF Form Text Field will be transformed to a DocuSign data (text) tab.  PDF Form Field Names that include \&quot;DocuSignIgnoreTransform\&quot; or \&quot;eSignIgnoreTransform\&quot; will not be transformed.  PDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.  ## Template Email Subject Merge Fields This feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.  The merge fields, based on the recipient&#39;s &#x60;roleName&#x60;, are added to the &#x60;emailSubject&#x60; when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.  Both the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.  If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.  * To add a recipient&#39;s name in the subject line add the following text in the &#x60;emailSubject&#x60; when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_UserName]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,&#x60;  * To add a recipient&#39;s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_Email]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,&#x60;  In both cases the &lt;roleName&gt; is the recipient&#39;s &#x60;roleName&#x60; in the template.  For cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.  ## Branding an envelope The following rules are used to determine the &#x60;brandId&#x60; used in an envelope:  * If a &#x60;brandId&#x60; is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope. * If more than one template is used in an envelope and more than one &#x60;brandId&#x60; is specified, the first &#x60;brandId&#x60; specified is used throughout the envelope. * In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account&#39;s default signing brand is used. * For envelopes that do not meet any of the previous criteria, the account&#39;s default signing brand is used for the envelope.  ## BCC Email address feature  The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don&#39;t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.  ## Merge Recipient Roles for Draft Envelopes When an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.  To prevent this, the query parameter &#x60;merge_roles_on_draft&#x60; should be added when posting a draft envelope (status&#x3D;created) with multiple templates. Doing this will merge template roles and remove empty recipients.  ###### Note: DocuSign recommends that the &#x60;merge_roles_on_draft&#x60; query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeDefinition  (optional)
   * @return EnvelopeSummary
   */ 
  public EnvelopeSummary createEnvelope(String accountId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    return createEnvelope(accountId, envelopeDefinition, null);
  }

  /**
   * Creates an envelope..
   * Creates an envelope.   Using this function you can: * Create an envelope and send it. * Create an envelope from an existing template and send it.  In either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request&#39;s &#x60;status&#x60; property to &#x60;created&#x60; instead of &#x60;sent&#x60;.  ## Sending Envelopes  Documents can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the &#x60;documentBase64&#x60; field of the [&#x60;document&#x60; object](#/definitions/document)  ### Recipient Types An [&#x60;envelopeDefinition&#x60; object](#/definitions/envelopeDefinition) is used as the method&#39;s body. Envelope recipients can be defined in the envelope or in templates. The &#x60;envelopeDefinition&#x60; object&#39;s &#x60;recipients&#x60; field is an [&#x60;EnvelopeRecipients&#x60; resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:  Recipient type | Object definition -------------- | ----------------- agent (can add name and email information for later recipients/signers) | [&#x60;agent&#x60;](#/definitions/agent) carbon copy (receives a copy of the documents) | [&#x60;carbonCopy&#x60;](#/definitions/carbonCopy) certified delivery  (receives a copy of the documents and must acknowledge receipt) | [&#x60;certifiedDelivery&#x60;](#/definitions/certifiedDelivery) editor (can change recipients and document fields for later recipients/signers) | [&#x60;editor&#x60;](#/definitions/editor) in-person signer (\&quot;hosts\&quot; someone who signs in-person) | [&#x60;inPersonSigner&#x60;](#/definitions/inPersonSigner) intermediary (can add name and email information for some later recipients/signers.) | [&#x60;intermediary&#x60;](#/definitions/intermediary) signer (signs and/or updates document fields) | [&#x60;signer&#x60;](#/definitions/signer)  Additional information about the different types of recipients is available from the [&#x60;EnvelopeRecipients&#x60; resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)  ### Tabs Tabs (also referred to as &#x60;tags&#x60; and as &#x60;fields&#x60; in the web sending user interface), can be defined in the &#x60;envelopeDefinition&#x60;, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).  Defining tabs: the &#x60;inPersonSigner&#x60;, and &#x60;signer&#x60; recipient objects include a &#x60;tabs&#x60; field. It is an [&#x60;EnvelopeTabs&#x60; resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [&#x60;EnvelopeTabs&#x60; resource](../../EnvelopeTabs) for more information.  ## Using Templates Envelopes use specific people or groups as recipients. Templates can specify a role, eg &#x60;account_manager.&#x60; When a template is used in an envelope, the roles must be replaced with specific people or groups.  When you create an envelope using a &#x60;templateId&#x60;, the different recipient type objects within the [&#x60;EnvelopeRecipients&#x60; object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template&#39;s roles via the &#x60;roleName&#x60; property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.  ### Message Lock When a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field &#x60;messageLock&#x60; is used to lock the email subject and message.  If an email subject or message is entered before adding or applying a template with &#x60;messageLock&#x60; **true**, the email subject and message is overwritten with the locked email subject and message from the template.  ## Envelope Status The status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope&#39;s status changes. DocuSign limits polling to once every 15 minutes or less frequently.  When a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message.   See the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.  ## Webhook Options The two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client.   ### eventNotification Webhooks The Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.  ### Connect Webhooks Connect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc.   Connect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting \&quot;Go to Admin\&quot; from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.  Connect is available for some DocuSign account types. Please contact DocuSign Sales for more information.  ## Composite Templates  The Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.  Each Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.  * The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the &#x60;compositeTemplateId&#x60; to which the document should be added. If &#x60;compositeTemplateId&#x60; is not specified in the content-disposition, the document is applied based on the &#x60;documentId&#x60; only. If no document object is specified, the composite template inherits the first document.  * Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.  * Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.  * Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.  PDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set &#x60;transformPdfFields&#x60; to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.  * PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.  ### Compositing the definitions Each Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:  * Templates are overlaid in the order of their Sequence value. * If Document is not passed into the Composite Template&#39;s &#x60;document&#x60; field, the *first* template&#39;s document (based on the template&#39;s Sequence value) is used. * Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.  For example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.  * Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.  * If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.  * Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.  For example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.  * roleName and tabLabel matching is case sensitive.  * The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.  * You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with \&quot;\\*\&quot; and then the system matches tabs that start with the label.  * If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)  ### Including the Document Content for Composite Templates Document content can be supplied inline, using the &#x60;documentBase64&#x60; or can be included in a multi-part HTTP message.  If a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the &#x60;compositeTemplateId&#x60; to which the document should be added. Using the &#x60;compositeTemplateId&#x60; sets which documents are associated with particular composite templates. An example of this usage is:  &#x60;&#x60;&#x60;    --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d    Content-Type: application/pdf    Content-Disposition: file; filename&#x3D;\&quot;eula.pdf\&quot;; documentId&#x3D;1; compositeTemplateId&#x3D;\&quot;1\&quot;    Content-Transfer-Encoding: base64 &#x60;&#x60;&#x60;  ### PDF Form Field Transformation Only the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text  Field Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.  When transforming a *PDF Form Digital Signature Field,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials  Any other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab  When transforming *PDF Form Text Fields,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials DocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID DocuSignCompany or eSignCompany | Company DocuSignDateSigned or eSignDateSigned | Date Signed DocuSignTitle or eSignTitle | Title DocuSignFullName or eSignFullName |  Full Name DocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment  Any other PDF Form Text Field will be transformed to a DocuSign data (text) tab.  PDF Form Field Names that include \&quot;DocuSignIgnoreTransform\&quot; or \&quot;eSignIgnoreTransform\&quot; will not be transformed.  PDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.  ## Template Email Subject Merge Fields This feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.  The merge fields, based on the recipient&#39;s &#x60;roleName&#x60;, are added to the &#x60;emailSubject&#x60; when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.  Both the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.  If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.  * To add a recipient&#39;s name in the subject line add the following text in the &#x60;emailSubject&#x60; when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_UserName]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,&#x60;  * To add a recipient&#39;s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_Email]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,&#x60;  In both cases the &lt;roleName&gt; is the recipient&#39;s &#x60;roleName&#x60; in the template.  For cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.  ## Branding an envelope The following rules are used to determine the &#x60;brandId&#x60; used in an envelope:  * If a &#x60;brandId&#x60; is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope. * If more than one template is used in an envelope and more than one &#x60;brandId&#x60; is specified, the first &#x60;brandId&#x60; specified is used throughout the envelope. * In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account&#39;s default signing brand is used. * For envelopes that do not meet any of the previous criteria, the account&#39;s default signing brand is used for the envelope.  ## BCC Email address feature  The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don&#39;t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.  ## Merge Recipient Roles for Draft Envelopes When an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.  To prevent this, the query parameter &#x60;merge_roles_on_draft&#x60; should be added when posting a draft envelope (status&#x3D;created) with multiple templates. Doing this will merge template roles and remove empty recipients.  ###### Note: DocuSign recommends that the &#x60;merge_roles_on_draft&#x60; query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return EnvelopeSummary
   * @throws ApiException if fails to make API call
   */
  public EnvelopeSummary createEnvelope(String accountId, EnvelopeDefinition envelopeDefinition, EnvelopesApi.CreateEnvelopeOptions options) throws ApiException {
    ApiResponse<EnvelopeSummary> localVarResponse = createEnvelopeWithHttpInfo(accountId, envelopeDefinition, options);
    return localVarResponse.getData();
  }

  /**
   * Creates an envelope.
   * Creates an envelope.   Using this function you can: * Create an envelope and send it. * Create an envelope from an existing template and send it.  In either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request&#39;s &#x60;status&#x60; property to &#x60;created&#x60; instead of &#x60;sent&#x60;.  ## Sending Envelopes  Documents can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the &#x60;documentBase64&#x60; field of the [&#x60;document&#x60; object](#/definitions/document)  ### Recipient Types An [&#x60;envelopeDefinition&#x60; object](#/definitions/envelopeDefinition) is used as the method&#39;s body. Envelope recipients can be defined in the envelope or in templates. The &#x60;envelopeDefinition&#x60; object&#39;s &#x60;recipients&#x60; field is an [&#x60;EnvelopeRecipients&#x60; resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:  Recipient type | Object definition -------------- | ----------------- agent (can add name and email information for later recipients/signers) | [&#x60;agent&#x60;](#/definitions/agent) carbon copy (receives a copy of the documents) | [&#x60;carbonCopy&#x60;](#/definitions/carbonCopy) certified delivery  (receives a copy of the documents and must acknowledge receipt) | [&#x60;certifiedDelivery&#x60;](#/definitions/certifiedDelivery) editor (can change recipients and document fields for later recipients/signers) | [&#x60;editor&#x60;](#/definitions/editor) in-person signer (\&quot;hosts\&quot; someone who signs in-person) | [&#x60;inPersonSigner&#x60;](#/definitions/inPersonSigner) intermediary (can add name and email information for some later recipients/signers.) | [&#x60;intermediary&#x60;](#/definitions/intermediary) signer (signs and/or updates document fields) | [&#x60;signer&#x60;](#/definitions/signer)  Additional information about the different types of recipients is available from the [&#x60;EnvelopeRecipients&#x60; resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)  ### Tabs Tabs (also referred to as &#x60;tags&#x60; and as &#x60;fields&#x60; in the web sending user interface), can be defined in the &#x60;envelopeDefinition&#x60;, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).  Defining tabs: the &#x60;inPersonSigner&#x60;, and &#x60;signer&#x60; recipient objects include a &#x60;tabs&#x60; field. It is an [&#x60;EnvelopeTabs&#x60; resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [&#x60;EnvelopeTabs&#x60; resource](../../EnvelopeTabs) for more information.  ## Using Templates Envelopes use specific people or groups as recipients. Templates can specify a role, eg &#x60;account_manager.&#x60; When a template is used in an envelope, the roles must be replaced with specific people or groups.  When you create an envelope using a &#x60;templateId&#x60;, the different recipient type objects within the [&#x60;EnvelopeRecipients&#x60; object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template&#39;s roles via the &#x60;roleName&#x60; property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.  ### Message Lock When a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field &#x60;messageLock&#x60; is used to lock the email subject and message.  If an email subject or message is entered before adding or applying a template with &#x60;messageLock&#x60; **true**, the email subject and message is overwritten with the locked email subject and message from the template.  ## Envelope Status The status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope&#39;s status changes. DocuSign limits polling to once every 15 minutes or less frequently.  When a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message.   See the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.  ## Webhook Options The two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client.   ### eventNotification Webhooks The Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.  ### Connect Webhooks Connect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc.   Connect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting \&quot;Go to Admin\&quot; from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.  Connect is available for some DocuSign account types. Please contact DocuSign Sales for more information.  ## Composite Templates  The Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.  Each Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.  * The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the &#x60;compositeTemplateId&#x60; to which the document should be added. If &#x60;compositeTemplateId&#x60; is not specified in the content-disposition, the document is applied based on the &#x60;documentId&#x60; only. If no document object is specified, the composite template inherits the first document.  * Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.  * Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.  * Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.  PDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set &#x60;transformPdfFields&#x60; to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.  * PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.  ### Compositing the definitions Each Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:  * Templates are overlaid in the order of their Sequence value. * If Document is not passed into the Composite Template&#39;s &#x60;document&#x60; field, the *first* template&#39;s document (based on the template&#39;s Sequence value) is used. * Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.  For example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.  * Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.  * If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.  * Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.  For example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.  * roleName and tabLabel matching is case sensitive.  * The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.  * You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with \&quot;\\*\&quot; and then the system matches tabs that start with the label.  * If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)  ### Including the Document Content for Composite Templates Document content can be supplied inline, using the &#x60;documentBase64&#x60; or can be included in a multi-part HTTP message.  If a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the &#x60;compositeTemplateId&#x60; to which the document should be added. Using the &#x60;compositeTemplateId&#x60; sets which documents are associated with particular composite templates. An example of this usage is:  &#x60;&#x60;&#x60;    --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d    Content-Type: application/pdf    Content-Disposition: file; filename&#x3D;\&quot;eula.pdf\&quot;; documentId&#x3D;1; compositeTemplateId&#x3D;\&quot;1\&quot;    Content-Transfer-Encoding: base64 &#x60;&#x60;&#x60;  ### PDF Form Field Transformation Only the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text  Field Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.  When transforming a *PDF Form Digital Signature Field,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials  Any other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab  When transforming *PDF Form Text Fields,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials DocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID DocuSignCompany or eSignCompany | Company DocuSignDateSigned or eSignDateSigned | Date Signed DocuSignTitle or eSignTitle | Title DocuSignFullName or eSignFullName |  Full Name DocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment  Any other PDF Form Text Field will be transformed to a DocuSign data (text) tab.  PDF Form Field Names that include \&quot;DocuSignIgnoreTransform\&quot; or \&quot;eSignIgnoreTransform\&quot; will not be transformed.  PDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.  ## Template Email Subject Merge Fields This feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.  The merge fields, based on the recipient&#39;s &#x60;roleName&#x60;, are added to the &#x60;emailSubject&#x60; when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.  Both the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.  If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.  * To add a recipient&#39;s name in the subject line add the following text in the &#x60;emailSubject&#x60; when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_UserName]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,&#x60;  * To add a recipient&#39;s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_Email]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,&#x60;  In both cases the &lt;roleName&gt; is the recipient&#39;s &#x60;roleName&#x60; in the template.  For cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.  ## Branding an envelope The following rules are used to determine the &#x60;brandId&#x60; used in an envelope:  * If a &#x60;brandId&#x60; is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope. * If more than one template is used in an envelope and more than one &#x60;brandId&#x60; is specified, the first &#x60;brandId&#x60; specified is used throughout the envelope. * In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account&#39;s default signing brand is used. * For envelopes that do not meet any of the previous criteria, the account&#39;s default signing brand is used for the envelope.  ## BCC Email address feature  The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don&#39;t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.  ## Merge Recipient Roles for Draft Envelopes When an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.  To prevent this, the query parameter &#x60;merge_roles_on_draft&#x60; should be added when posting a draft envelope (status&#x3D;created) with multiple templates. Doing this will merge template roles and remove empty recipients.  ###### Note: DocuSign recommends that the &#x60;merge_roles_on_draft&#x60; query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return EnvelopeSummary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeSummary > createEnvelopeWithHttpInfo(String accountId, EnvelopeDefinition envelopeDefinition, EnvelopesApi.CreateEnvelopeOptions options) throws ApiException {
    Object localVarPostBody = envelopeDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelope");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("cdse_mode", options.cdseMode));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("change_routing_order", options.changeRoutingOrder));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("completed_documents_only", options.completedDocumentsOnly));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("merge_roles_on_draft", options.mergeRolesOnDraft));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("tab_label_exact_matches", options.tabLabelExactMatches));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<EnvelopeSummary> localVarReturnType = new GenericType<EnvelopeSummary>() {};
    EnvelopeSummary localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeSummary>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Posts a list of comments for authorized user.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param commentsPublish  (optional)
   * @return CommentHistoryResult
   * @throws ApiException if fails to make API call
   */
  public CommentHistoryResult createEnvelopeComments(String accountId, String envelopeId, CommentsPublish commentsPublish) throws ApiException {
    ApiResponse<CommentHistoryResult> localVarResponse = createEnvelopeCommentsWithHttpInfo(accountId, envelopeId, commentsPublish);
    return localVarResponse.getData();
  }

  /**
   * Posts a list of comments for authorized user
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param commentsPublish  (optional)
   * @return CommentHistoryResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CommentHistoryResult > createEnvelopeCommentsWithHttpInfo(String accountId, String envelopeId, CommentsPublish commentsPublish) throws ApiException {
    Object localVarPostBody = commentsPublish;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelopeComments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEnvelopeComments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/comments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<CommentHistoryResult> localVarReturnType = new GenericType<CommentHistoryResult>() {};
    CommentHistoryResult localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CommentHistoryResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Provides a URL to start a recipient view of the Envelope UI.
   * This method returns a URL for an envelope recipient preview  in the DocuSign UI that you can embed in your application. You use this method to enable the sender to preview the recipients&#39; experience.  For more information, see [Preview and Send](https://support.docusign.com/en/guides/ndse-user-guide-send-your-documents).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientPreviewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createEnvelopeRecipientPreview(String accountId, String envelopeId, RecipientPreviewRequest recipientPreviewRequest) throws ApiException {
    ApiResponse<ViewUrl> localVarResponse = createEnvelopeRecipientPreviewWithHttpInfo(accountId, envelopeId, recipientPreviewRequest);
    return localVarResponse.getData();
  }

  /**
   * Provides a URL to start a recipient view of the Envelope UI
   * This method returns a URL for an envelope recipient preview  in the DocuSign UI that you can embed in your application. You use this method to enable the sender to preview the recipients&#39; experience.  For more information, see [Preview and Send](https://support.docusign.com/en/guides/ndse-user-guide-send-your-documents).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientPreviewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ViewUrl > createEnvelopeRecipientPreviewWithHttpInfo(String accountId, String envelopeId, RecipientPreviewRequest recipientPreviewRequest) throws ApiException {
    Object localVarPostBody = recipientPreviewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelopeRecipientPreview");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEnvelopeRecipientPreview");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/recipient_preview"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Provides a URL to start a shared recipient view of the Envelope UI.
   * Returns a URL that enables you to embed the DocuSign UI recipient view of a [shared envelope](https://support.docusign.com/en/guides/ndse-admin-guide-share-envelopes) in your applications. This is the view that a user sees of an envelope that a recipient on the same account has shared with them.  Due to screen space issues, do not use an &#x60;&lt;iframe&gt;&#x60; for embedded operations on mobile devices. For iOS devices, DocuSign recommends using a WebView.  ### Revoking the URL  You can revoke this URL by making a DELETE HTTP request to the URL with no request body.  ### Related topics  - [Embedded signing and sending](/docs/esign-rest-api/esign101/concepts/embedding/) - [How to send an envelope via your app](/docs/esign-rest-api/how-to/embedded-sending/) - [How to embed the DocuSign UI in your app](/docs/esign-rest-api/how-to/embed-ui/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createEnvelopeRecipientSharedView(String accountId, String envelopeId, RecipientViewRequest recipientViewRequest) throws ApiException {
    ApiResponse<ViewUrl> localVarResponse = createEnvelopeRecipientSharedViewWithHttpInfo(accountId, envelopeId, recipientViewRequest);
    return localVarResponse.getData();
  }

  /**
   * Provides a URL to start a shared recipient view of the Envelope UI
   * Returns a URL that enables you to embed the DocuSign UI recipient view of a [shared envelope](https://support.docusign.com/en/guides/ndse-admin-guide-share-envelopes) in your applications. This is the view that a user sees of an envelope that a recipient on the same account has shared with them.  Due to screen space issues, do not use an &#x60;&lt;iframe&gt;&#x60; for embedded operations on mobile devices. For iOS devices, DocuSign recommends using a WebView.  ### Revoking the URL  You can revoke this URL by making a DELETE HTTP request to the URL with no request body.  ### Related topics  - [Embedded signing and sending](/docs/esign-rest-api/esign101/concepts/embedding/) - [How to send an envelope via your app](/docs/esign-rest-api/how-to/embedded-sending/) - [How to embed the DocuSign UI in your app](/docs/esign-rest-api/how-to/embed-ui/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ViewUrl > createEnvelopeRecipientSharedViewWithHttpInfo(String accountId, String envelopeId, RecipientViewRequest recipientViewRequest) throws ApiException {
    Object localVarPostBody = recipientViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelopeRecipientSharedView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEnvelopeRecipientSharedView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/shared"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Add envelope transfer rules to an account..
   * This method creates an envelope transfer rule.  When you create an envelope transfer rule, you specify the following properties:   - &#x60;eventType&#x60; - &#x60;fromGroups&#x60; - &#x60;toUser&#x60; - &#x60;toFolder&#x60; - &#x60;carbonCopyOriginalOwner&#x60; - &#x60;enabled&#x60;  **Note:** Only Administrators can create envelope transfer rules. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleRequest  (optional)
   * @return EnvelopeTransferRuleInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopeTransferRuleInformation createEnvelopeTransferRules(String accountId, EnvelopeTransferRuleRequest envelopeTransferRuleRequest) throws ApiException {
    ApiResponse<EnvelopeTransferRuleInformation> localVarResponse = createEnvelopeTransferRulesWithHttpInfo(accountId, envelopeTransferRuleRequest);
    return localVarResponse.getData();
  }

  /**
   * Add envelope transfer rules to an account.
   * This method creates an envelope transfer rule.  When you create an envelope transfer rule, you specify the following properties:   - &#x60;eventType&#x60; - &#x60;fromGroups&#x60; - &#x60;toUser&#x60; - &#x60;toFolder&#x60; - &#x60;carbonCopyOriginalOwner&#x60; - &#x60;enabled&#x60;  **Note:** Only Administrators can create envelope transfer rules. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleRequest  (optional)
   * @return EnvelopeTransferRuleInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeTransferRuleInformation > createEnvelopeTransferRulesWithHttpInfo(String accountId, EnvelopeTransferRuleRequest envelopeTransferRuleRequest) throws ApiException {
    Object localVarPostBody = envelopeTransferRuleRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelopeTransferRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/transfer_rules"
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
    
    GenericType<EnvelopeTransferRuleInformation> localVarReturnType = new GenericType<EnvelopeTransferRuleInformation>() {};
    EnvelopeTransferRuleInformation localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeTransferRuleInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Creates and adds a new workflow step definition for an envelope&#39;s workflow.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStep  (optional)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public WorkflowStep createEnvelopeWorkflowStepDefinition(String accountId, String envelopeId, WorkflowStep workflowStep) throws ApiException {
    ApiResponse<WorkflowStep> localVarResponse = createEnvelopeWorkflowStepDefinitionWithHttpInfo(accountId, envelopeId, workflowStep);
    return localVarResponse.getData();
  }

  /**
   * Creates and adds a new workflow step definition for an envelope&#39;s workflow
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStep  (optional)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkflowStep > createEnvelopeWorkflowStepDefinitionWithHttpInfo(String accountId, String envelopeId, WorkflowStep workflowStep) throws ApiException {
    Object localVarPostBody = workflowStep;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelopeWorkflowStepDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEnvelopeWorkflowStepDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow/steps"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<WorkflowStep> localVarReturnType = new GenericType<WorkflowStep>() {};
    WorkflowStep localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkflowStep>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Submits a batch of historical envelopes for republish to an adhoc config..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param connectHistoricalEnvelopeRepublish  (optional)
   * @return EnvelopePublishTransaction
   * @throws ApiException if fails to make API call
   */
  public EnvelopePublishTransaction createHistoricalEnvelopePublishTransaction(String accountId, ConnectHistoricalEnvelopeRepublish connectHistoricalEnvelopeRepublish) throws ApiException {
    ApiResponse<EnvelopePublishTransaction> localVarResponse = createHistoricalEnvelopePublishTransactionWithHttpInfo(accountId, connectHistoricalEnvelopeRepublish);
    return localVarResponse.getData();
  }

  /**
   * Submits a batch of historical envelopes for republish to an adhoc config.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param connectHistoricalEnvelopeRepublish  (optional)
   * @return EnvelopePublishTransaction
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopePublishTransaction > createHistoricalEnvelopePublishTransactionWithHttpInfo(String accountId, ConnectHistoricalEnvelopeRepublish connectHistoricalEnvelopeRepublish) throws ApiException {
    Object localVarPostBody = connectHistoricalEnvelopeRepublish;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createHistoricalEnvelopePublishTransaction");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/connect/envelopes/publish/historical"
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
    
    GenericType<EnvelopePublishTransaction> localVarReturnType = new GenericType<EnvelopePublishTransaction>() {};
    EnvelopePublishTransaction localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopePublishTransaction>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Lock an envelope..
   * Locks the specified envelope, and sets the time until the lock expires, to prevent other users or recipients from accessing and changing the envelope.  ###### Note: Users must have envelope locking capability enabled to use this function (userSetting &#x60;canLockEnvelopes&#x60; must be  set to true for the user).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation createLock(String accountId, String envelopeId, LockRequest lockRequest) throws ApiException {
    ApiResponse<LockInformation> localVarResponse = createLockWithHttpInfo(accountId, envelopeId, lockRequest);
    return localVarResponse.getData();
  }

  /**
   * Lock an envelope.
   * Locks the specified envelope, and sets the time until the lock expires, to prevent other users or recipients from accessing and changing the envelope.  ###### Note: Users must have envelope locking capability enabled to use this function (userSetting &#x60;canLockEnvelopes&#x60; must be  set to true for the user).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LockInformation > createLockWithHttpInfo(String accountId, String envelopeId, LockRequest lockRequest) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
  /// Adds one or more recipients to an envelope. Adds one or more recipients to an envelope.  For an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional &#x60;resend_envelope&#x60; query string is set to **true**.
  /// </summary>

 /**
  * CreateRecipientOptions Class.
  *
  **/
  public class CreateRecipientOptions
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
   * Adds one or more recipients to an envelope..
   * Adds one or more recipients to an envelope.  For an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional &#x60;resend_envelope&#x60; query string is set to **true**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @return Recipients
   */ 
  public Recipients createRecipient(String accountId, String envelopeId, Recipients recipients) throws ApiException {
    return createRecipient(accountId, envelopeId, recipients, null);
  }

  /**
   * Adds one or more recipients to an envelope..
   * Adds one or more recipients to an envelope.  For an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional &#x60;resend_envelope&#x60; query string is set to **true**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @param options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients createRecipient(String accountId, String envelopeId, Recipients recipients, EnvelopesApi.CreateRecipientOptions options) throws ApiException {
    ApiResponse<Recipients> localVarResponse = createRecipientWithHttpInfo(accountId, envelopeId, recipients, options);
    return localVarResponse.getData();
  }

  /**
   * Adds one or more recipients to an envelope.
   * Adds one or more recipients to an envelope.  For an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional &#x60;resend_envelope&#x60; query string is set to **true**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @param options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recipients > createRecipientWithHttpInfo(String accountId, String envelopeId, Recipients recipients, EnvelopesApi.CreateRecipientOptions options) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Provides a link to access the Identity manual review related to a recipient..
   * This method returns the URL of the page that allows a sender to [manually review](https://support.docusign.com/en/guides/ndse-user-guide-send-documents-with-id-verification) the ID of a recipient. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createRecipientManualReviewView(String accountId, String envelopeId, String recipientId) throws ApiException {
    ApiResponse<ViewUrl> localVarResponse = createRecipientManualReviewViewWithHttpInfo(accountId, envelopeId, recipientId);
    return localVarResponse.getData();
  }

  /**
   * Provides a link to access the Identity manual review related to a recipient.
   * This method returns the URL of the page that allows a sender to [manually review](https://support.docusign.com/en/guides/ndse-user-guide-send-documents-with-id-verification) the ID of a recipient. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ViewUrl > createRecipientManualReviewViewWithHttpInfo(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipientManualReviewView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipientManualReviewView");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling createRecipientManualReviewView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/views/identity_manual_review"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
    
    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    ViewUrl localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ViewUrl>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns a link to access to the identity events stored in the proof service related to this recipient..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return IdEvidenceViewLink
   * @throws ApiException if fails to make API call
   */
  public IdEvidenceViewLink createRecipientProofFileLink(String accountId, String envelopeId, String recipientId) throws ApiException {
    ApiResponse<IdEvidenceViewLink> localVarResponse = createRecipientProofFileLinkWithHttpInfo(accountId, envelopeId, recipientId);
    return localVarResponse.getData();
  }

  /**
   * Returns a link to access to the identity events stored in the proof service related to this recipient.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return IdEvidenceViewLink
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdEvidenceViewLink > createRecipientProofFileLinkWithHttpInfo(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipientProofFileLink");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipientProofFileLink");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling createRecipientProofFileLink");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/identity_proof"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
    
    GenericType<IdEvidenceViewLink> localVarReturnType = new GenericType<IdEvidenceViewLink>() {};
    IdEvidenceViewLink localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<IdEvidenceViewLink>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns a resource token to get access to the identity events stored in the proof service related to this recipient..
   * Creates a resource token for a sender. This token allows a sender to return identification data for a recipient using the [ID Evidence API](/docs/idevidence-api/).
   * @param tokenScopes  (required)
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return IdEvidenceResourceToken
   * @throws ApiException if fails to make API call
   */
  public IdEvidenceResourceToken createRecipientProofFileResourceToken(String tokenScopes, String accountId, String envelopeId, String recipientId) throws ApiException {
    ApiResponse<IdEvidenceResourceToken> localVarResponse = createRecipientProofFileResourceTokenWithHttpInfo(tokenScopes, accountId, envelopeId, recipientId);
    return localVarResponse.getData();
  }

  /**
   * Returns a resource token to get access to the identity events stored in the proof service related to this recipient.
   * Creates a resource token for a sender. This token allows a sender to return identification data for a recipient using the [ID Evidence API](/docs/idevidence-api/).
   * @param tokenScopes  (required)
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return IdEvidenceResourceToken
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdEvidenceResourceToken > createRecipientProofFileResourceTokenWithHttpInfo(String tokenScopes, String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'tokenScopes' is set
    if (tokenScopes == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenScopes' when calling createRecipientProofFileResourceToken");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipientProofFileResourceToken");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipientProofFileResourceToken");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling createRecipientProofFileResourceToken");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/identity_proof_token"
      .replaceAll("\\{" + "token_scopes" + "\\}", apiClient.escapeString(tokenScopes.toString()))
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
    
    GenericType<IdEvidenceResourceToken> localVarReturnType = new GenericType<IdEvidenceResourceToken>() {};
    IdEvidenceResourceToken localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<IdEvidenceResourceToken>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns a URL to the recipient view UI..
   * Returns a URL that allows you to embed the recipient view of the DocuSign UI in your applications. This call cannot be used to view draft envelopes, since those envelopes have not been sent.   Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView.   An entry is added into the Security Level section of the DocuSign Certificate of Completion that reflects the &#x60;securityDomain&#x60; and &#x60;authenticationMethod&#x60; properties used to verify the user identity.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createRecipientView(String accountId, String envelopeId, RecipientViewRequest recipientViewRequest) throws ApiException {
    ApiResponse<ViewUrl> localVarResponse = createRecipientViewWithHttpInfo(accountId, envelopeId, recipientViewRequest);
    return localVarResponse.getData();
  }

  /**
   * Returns a URL to the recipient view UI.
   * Returns a URL that allows you to embed the recipient view of the DocuSign UI in your applications. This call cannot be used to view draft envelopes, since those envelopes have not been sent.   Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView.   An entry is added into the Security Level section of the DocuSign Certificate of Completion that reflects the &#x60;securityDomain&#x60; and &#x60;authenticationMethod&#x60; properties used to verify the user identity.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ViewUrl > createRecipientViewWithHttpInfo(String accountId, String envelopeId, RecipientViewRequest recipientViewRequest) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/recipient"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Get Responsive HTML Preview for all documents in an envelope..
   * Creates a preview of the [responsive](/docs/esign-rest-api/esign101/concepts/responsive/), HTML versions of all of the documents in an envelope. This method enables you to preview the PDF document conversions to responsive HTML across device types prior to sending.  The request body is a &#x60;documentHtmlDefinition&#x60; object, which holds the responsive signing parameters that define how to generate the HTML version of the documents. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitions createResponsiveHtmlPreview(String accountId, String envelopeId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
    ApiResponse<DocumentHtmlDefinitions> localVarResponse = createResponsiveHtmlPreviewWithHttpInfo(accountId, envelopeId, documentHtmlDefinition);
    return localVarResponse.getData();
  }

  /**
   * Get Responsive HTML Preview for all documents in an envelope.
   * Creates a preview of the [responsive](/docs/esign-rest-api/esign101/concepts/responsive/), HTML versions of all of the documents in an envelope. This method enables you to preview the PDF document conversions to responsive HTML across device types prior to sending.  The request body is a &#x60;documentHtmlDefinition&#x60; object, which holds the responsive signing parameters that define how to generate the HTML version of the documents. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentHtmlDefinitions > createResponsiveHtmlPreviewWithHttpInfo(String accountId, String envelopeId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
    Object localVarPostBody = documentHtmlDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createResponsiveHtmlPreview");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createResponsiveHtmlPreview");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/responsive_html_preview"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Returns a URL to the sender view UI..
   * Returns a URL that allows you to embed the sender view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign sending view.   Upon sending completion, the user is returned to the return URL provided by the API application.  Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param returnUrlRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createSenderView(String accountId, String envelopeId, ReturnUrlRequest returnUrlRequest) throws ApiException {
    ApiResponse<ViewUrl> localVarResponse = createSenderViewWithHttpInfo(accountId, envelopeId, returnUrlRequest);
    return localVarResponse.getData();
  }

  /**
   * Returns a URL to the sender view UI.
   * Returns a URL that allows you to embed the sender view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign sending view.   Upon sending completion, the user is returned to the return URL provided by the API application.  Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param returnUrlRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ViewUrl > createSenderViewWithHttpInfo(String accountId, String envelopeId, ReturnUrlRequest returnUrlRequest) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/sender"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Adds tabs for a recipient..
   * Adds one or more tabs for a recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs createTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = createTabsWithHttpInfo(accountId, envelopeId, recipientId, tabs);
    return localVarResponse.getData();
  }

  /**
   * Adds tabs for a recipient.
   * Adds one or more tabs for a recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > createTabsWithHttpInfo(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Creates and adds a new workflow step definition for a template&#39;s workflow.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStep  (optional)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public WorkflowStep createTemplateWorkflowStepDefinition(String accountId, String templateId, WorkflowStep workflowStep) throws ApiException {
    ApiResponse<WorkflowStep> localVarResponse = createTemplateWorkflowStepDefinitionWithHttpInfo(accountId, templateId, workflowStep);
    return localVarResponse.getData();
  }

  /**
   * Creates and adds a new workflow step definition for a template&#39;s workflow
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStep  (optional)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkflowStep > createTemplateWorkflowStepDefinitionWithHttpInfo(String accountId, String templateId, WorkflowStep workflowStep) throws ApiException {
    Object localVarPostBody = workflowStep;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTemplateWorkflowStepDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createTemplateWorkflowStepDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow/steps"
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
    
    GenericType<WorkflowStep> localVarReturnType = new GenericType<WorkflowStep>() {};
    WorkflowStep localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkflowStep>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Delete one or more attachments from a DRAFT envelope..
   * Deletes one or more attachments from a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeAttachmentsRequest  (optional)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeAttachmentsResult deleteAttachments(String accountId, String envelopeId, EnvelopeAttachmentsRequest envelopeAttachmentsRequest) throws ApiException {
    ApiResponse<EnvelopeAttachmentsResult> localVarResponse = deleteAttachmentsWithHttpInfo(accountId, envelopeId, envelopeAttachmentsRequest);
    return localVarResponse.getData();
  }

  /**
   * Delete one or more attachments from a DRAFT envelope.
   * Deletes one or more attachments from a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeAttachmentsRequest  (optional)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeAttachmentsResult > deleteAttachmentsWithHttpInfo(String accountId, String envelopeId, EnvelopeAttachmentsRequest envelopeAttachmentsRequest) throws ApiException {
    Object localVarPostBody = envelopeAttachmentsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAttachments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteAttachments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/attachments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<EnvelopeAttachmentsResult> localVarReturnType = new GenericType<EnvelopeAttachmentsResult>() {};
    EnvelopeAttachmentsResult localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeAttachmentsResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Delete an existing ChunkedUpload..
   * Deletes a chunked upload that has been committed but not yet consumed.  This method cannot be used to delete the following types of chunked uploads, which the system deletes automatically:   - Chunked uploads that have been consumed by use in another API call. - Expired chunked uploads.  **Note:** If you are aware of a chunked upload that can be discarded, the best practice is to explicitly delete it. If you wait for the system to automatically delete it after it expires, the chunked upload will continue to count against your quota.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadResponse deleteChunkedUpload(String accountId, String chunkedUploadId) throws ApiException {
    ApiResponse<ChunkedUploadResponse> localVarResponse = deleteChunkedUploadWithHttpInfo(accountId, chunkedUploadId);
    return localVarResponse.getData();
  }

  /**
   * Delete an existing ChunkedUpload.
   * Deletes a chunked upload that has been committed but not yet consumed.  This method cannot be used to delete the following types of chunked uploads, which the system deletes automatically:   - Chunked uploads that have been consumed by use in another API call. - Expired chunked uploads.  **Note:** If you are aware of a chunked upload that can be discarded, the best practice is to explicitly delete it. If you wait for the system to automatically delete it after it expires, the chunked upload will continue to count against your quota.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChunkedUploadResponse > deleteChunkedUploadWithHttpInfo(String accountId, String chunkedUploadId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteChunkedUpload");
    }
    
    // verify the required parameter 'chunkedUploadId' is set
    if (chunkedUploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling deleteChunkedUpload");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()));

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
    
    GenericType<ChunkedUploadResponse> localVarReturnType = new GenericType<ChunkedUploadResponse>() {};
    ChunkedUploadResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ChunkedUploadResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes envelope custom fields for draft and in-process envelopes..
   * Deletes envelope custom fields for draft and in-process envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param customFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields deleteCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
    ApiResponse<CustomFields> localVarResponse = deleteCustomFieldsWithHttpInfo(accountId, envelopeId, customFields);
    return localVarResponse.getData();
  }

  /**
   * Deletes envelope custom fields for draft and in-process envelopes.
   * Deletes envelope custom fields for draft and in-process envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param customFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomFields > deleteCustomFieldsWithHttpInfo(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Deletes custom document fields from an existing envelope document..
   * Deletes custom document fields from an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation deleteDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    ApiResponse<DocumentFieldsInformation> localVarResponse = deleteDocumentFieldsWithHttpInfo(accountId, envelopeId, documentId, documentFieldsInformation);
    return localVarResponse.getData();
  }

  /**
   * Deletes custom document fields from an existing envelope document.
   * Deletes custom document fields from an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentFieldsInformation > deleteDocumentFieldsWithHttpInfo(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Deletes a page from a document in an envelope..
   * Deletes a page from a document in an envelope based on the page number.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDocumentPage(String accountId, String envelopeId, String documentId, String pageNumber) throws ApiException {
    deleteDocumentPageWithHttpInfo(accountId, envelopeId, documentId, pageNumber);
  }

  /**
   * Deletes a page from a document in an envelope.
   * Deletes a page from a document in an envelope based on the page number.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteDocumentPageWithHttpInfo(String accountId, String envelopeId, String documentId, String pageNumber) throws ApiException {
    Object localVarPostBody = "{}";
    
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Deletes tabs from an envelope document.
   * Deletes tabs from the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs deleteDocumentTabs(String accountId, String envelopeId, String documentId, Tabs tabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = deleteDocumentTabsWithHttpInfo(accountId, envelopeId, documentId, tabs);
    return localVarResponse.getData();
  }

  /**
   * Deletes tabs from an envelope document
   * Deletes tabs from the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > deleteDocumentTabsWithHttpInfo(String accountId, String envelopeId, String documentId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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

  /**
   * Deletes documents from a draft envelope..
   * Deletes one or more documents from an existing draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocumentsResult deleteDocuments(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    ApiResponse<EnvelopeDocumentsResult> localVarResponse = deleteDocumentsWithHttpInfo(accountId, envelopeId, envelopeDefinition);
    return localVarResponse.getData();
  }

  /**
   * Deletes documents from a draft envelope.
   * Deletes one or more documents from an existing draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeDocumentsResult > deleteDocumentsWithHttpInfo(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<EnvelopeDocumentsResult> localVarReturnType = new GenericType<EnvelopeDocumentsResult>() {};
    EnvelopeDocumentsResult localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeDocumentsResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes the email setting overrides for an envelope..
   * Deletes all existing email override settings for the envelope. If you want to delete an individual email override setting, use the PUT and set the value to an empty string. Note that deleting email settings will only affect email communications that occur after the deletion and the normal account email settings are used for future email communications.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings deleteEmailSettings(String accountId, String envelopeId) throws ApiException {
    ApiResponse<EmailSettings> localVarResponse = deleteEmailSettingsWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Deletes the email setting overrides for an envelope.
   * Deletes all existing email override settings for the envelope. If you want to delete an individual email override setting, use the PUT and set the value to an empty string. Note that deleting email settings will only affect email communications that occur after the deletion and the normal account email settings are used for future email communications.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailSettings > deleteEmailSettingsWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEmailSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteEmailSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/email_settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    EmailSettings localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EmailSettings>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Revokes the correction view URL to the Envelope UI.
   * Revokes the correction view URL to the Envelope UI.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param correctViewRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteEnvelopeCorrectView(String accountId, String envelopeId, CorrectViewRequest correctViewRequest) throws ApiException {
    deleteEnvelopeCorrectViewWithHttpInfo(accountId, envelopeId, correctViewRequest);
  }

  /**
   * Revokes the correction view URL to the Envelope UI
   * Revokes the correction view URL to the Envelope UI.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param correctViewRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteEnvelopeCorrectViewWithHttpInfo(String accountId, String envelopeId, CorrectViewRequest correctViewRequest) throws ApiException {
    Object localVarPostBody = correctViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEnvelopeCorrectView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteEnvelopeCorrectView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/correct"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Deletes the delayed routing rules for the specified envelope workflow step..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteEnvelopeDelayedRoutingDefinition(String accountId, String envelopeId, String workflowStepId) throws ApiException {
    deleteEnvelopeDelayedRoutingDefinitionWithHttpInfo(accountId, envelopeId, workflowStepId);
  }

  /**
   * Deletes the delayed routing rules for the specified envelope workflow step.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteEnvelopeDelayedRoutingDefinitionWithHttpInfo(String accountId, String envelopeId, String workflowStepId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEnvelopeDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteEnvelopeDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling deleteEnvelopeDelayedRoutingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow/steps/{workflowStepId}/delayedRouting"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
   * Deletes the scheduled sending rules for the envelope&#39;s workflow..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteEnvelopeScheduledSendingDefinition(String accountId, String envelopeId) throws ApiException {
    deleteEnvelopeScheduledSendingDefinitionWithHttpInfo(accountId, envelopeId);
  }

  /**
   * Deletes the scheduled sending rules for the envelope&#39;s workflow.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteEnvelopeScheduledSendingDefinitionWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEnvelopeScheduledSendingDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteEnvelopeScheduledSendingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow/scheduledSending"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Delete envelope transfer rules for an account..
   * This method deletes an envelope transfer rule.  **Note:** Only Administrators can delete envelope transfer rules. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteEnvelopeTransferRules(String accountId, String envelopeTransferRuleId) throws ApiException {
    deleteEnvelopeTransferRulesWithHttpInfo(accountId, envelopeTransferRuleId);
  }

  /**
   * Delete envelope transfer rules for an account.
   * This method deletes an envelope transfer rule.  **Note:** Only Administrators can delete envelope transfer rules. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteEnvelopeTransferRulesWithHttpInfo(String accountId, String envelopeTransferRuleId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEnvelopeTransferRules");
    }
    
    // verify the required parameter 'envelopeTransferRuleId' is set
    if (envelopeTransferRuleId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeTransferRuleId' when calling deleteEnvelopeTransferRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/transfer_rules/{envelopeTransferRuleId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeTransferRuleId" + "\\}", apiClient.escapeString(envelopeTransferRuleId.toString()));

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
   * Delete the workflow definition for an envelope..
   * Deletes the specified envelope&#39;s workflow definition if it has one. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteEnvelopeWorkflowDefinition(String accountId, String envelopeId) throws ApiException {
    deleteEnvelopeWorkflowDefinitionWithHttpInfo(accountId, envelopeId);
  }

  /**
   * Delete the workflow definition for an envelope.
   * Deletes the specified envelope&#39;s workflow definition if it has one. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteEnvelopeWorkflowDefinitionWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEnvelopeWorkflowDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteEnvelopeWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Deletes the envelope workflow step definition for an envelope&#39;s workflow by step id..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteEnvelopeWorkflowStepDefinition(String accountId, String envelopeId, String workflowStepId) throws ApiException {
    deleteEnvelopeWorkflowStepDefinitionWithHttpInfo(accountId, envelopeId, workflowStepId);
  }

  /**
   * Deletes the envelope workflow step definition for an envelope&#39;s workflow by step id.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteEnvelopeWorkflowStepDefinitionWithHttpInfo(String accountId, String envelopeId, String workflowStepId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEnvelopeWorkflowStepDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteEnvelopeWorkflowStepDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling deleteEnvelopeWorkflowStepDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow/steps/{workflowStepId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
   * Deletes an envelope lock..
   * Deletes the lock from the specified envelope. The &#x60;X-DocuSign-Edit&#x60; header must be included in the request.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation deleteLock(String accountId, String envelopeId) throws ApiException {
    ApiResponse<LockInformation> localVarResponse = deleteLockWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Deletes an envelope lock.
   * Deletes the lock from the specified envelope. The &#x60;X-DocuSign-Edit&#x60; header must be included in the request.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LockInformation > deleteLockWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteLock");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Deletes a recipient from an envelope..
   * Deletes the specified recipient file from the specified envelope. This cannot be used if the envelope has been sent.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients deleteRecipient(String accountId, String envelopeId, String recipientId) throws ApiException {
    ApiResponse<Recipients> localVarResponse = deleteRecipientWithHttpInfo(accountId, envelopeId, recipientId);
    return localVarResponse.getData();
  }

  /**
   * Deletes a recipient from an envelope.
   * Deletes the specified recipient file from the specified envelope. This cannot be used if the envelope has been sent.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recipients > deleteRecipientWithHttpInfo(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Deletes recipients from an envelope..
   * Deletes one or more recipients from a draft or sent envelope. Recipients to be deleted are listed in the request, with the &#x60;recipientId&#x60; being used as the key for deleting recipients.  If the envelope is &#x60;In Process&#x60;, meaning that it has been sent and has not  been completed or voided, recipients that have completed their actions cannot be deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients deleteRecipients(String accountId, String envelopeId, Recipients recipients) throws ApiException {
    ApiResponse<Recipients> localVarResponse = deleteRecipientsWithHttpInfo(accountId, envelopeId, recipients);
    return localVarResponse.getData();
  }

  /**
   * Deletes recipients from an envelope.
   * Deletes one or more recipients from a draft or sent envelope. Recipients to be deleted are listed in the request, with the &#x60;recipientId&#x60; being used as the key for deleting recipients.  If the envelope is &#x60;In Process&#x60;, meaning that it has been sent and has not  been completed or voided, recipients that have completed their actions cannot be deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recipients > deleteRecipientsWithHttpInfo(String accountId, String envelopeId, Recipients recipients) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Deletes the tabs associated with a recipient..
   * Deletes one or more tabs associated with a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs deleteTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = deleteTabsWithHttpInfo(accountId, envelopeId, recipientId, tabs);
    return localVarResponse.getData();
  }

  /**
   * Deletes the tabs associated with a recipient.
   * Deletes one or more tabs associated with a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > deleteTabsWithHttpInfo(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Deletes the delayed routing rules for the specified template workflow step..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplateDelayedRoutingDefinition(String accountId, String templateId, String workflowStepId) throws ApiException {
    deleteTemplateDelayedRoutingDefinitionWithHttpInfo(accountId, templateId, workflowStepId);
  }

  /**
   * Deletes the delayed routing rules for the specified template workflow step.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteTemplateDelayedRoutingDefinitionWithHttpInfo(String accountId, String templateId, String workflowStepId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTemplateDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplateDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling deleteTemplateDelayedRoutingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow/steps/{workflowStepId}/delayedRouting"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
   * Deletes the scheduled sending rules for the template&#39;s workflow..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplateScheduledSendingDefinition(String accountId, String templateId) throws ApiException {
    deleteTemplateScheduledSendingDefinitionWithHttpInfo(accountId, templateId);
  }

  /**
   * Deletes the scheduled sending rules for the template&#39;s workflow.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteTemplateScheduledSendingDefinitionWithHttpInfo(String accountId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTemplateScheduledSendingDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplateScheduledSendingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow/scheduledSending"
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
    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Delete the workflow definition for a template..
   * Deletes the specified template&#39;s workflow definition if it has one.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplateWorkflowDefinition(String accountId, String templateId) throws ApiException {
    deleteTemplateWorkflowDefinitionWithHttpInfo(accountId, templateId);
  }

  /**
   * Delete the workflow definition for a template.
   * Deletes the specified template&#39;s workflow definition if it has one.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteTemplateWorkflowDefinitionWithHttpInfo(String accountId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTemplateWorkflowDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplateWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow"
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
    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Deletes the workflow step definition for an template&#39;s workflow by step id..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplateWorkflowStepDefinition(String accountId, String templateId, String workflowStepId) throws ApiException {
    deleteTemplateWorkflowStepDefinitionWithHttpInfo(accountId, templateId, workflowStepId);
  }

  /**
   * Deletes the workflow step definition for an template&#39;s workflow by step id.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteTemplateWorkflowStepDefinitionWithHttpInfo(String accountId, String templateId, String workflowStepId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTemplateWorkflowStepDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplateWorkflowStepDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling deleteTemplateWorkflowStepDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow/steps/{workflowStepId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
   * Deletes a template from a document in an existing envelope..
   * Deletes the specified template from a document in an existing envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplatesFromDocument(String accountId, String envelopeId, String documentId, String templateId) throws ApiException {
    deleteTemplatesFromDocumentWithHttpInfo(accountId, envelopeId, documentId, templateId);
  }

  /**
   * Deletes a template from a document in an existing envelope.
   * Deletes the specified template from a document in an existing envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteTemplatesFromDocumentWithHttpInfo(String accountId, String envelopeId, String documentId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates/{templateId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
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
    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Retrieves an attachment from the envelope..
   * Retrieves an attachment from an envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param attachmentId  (required)
   * @throws ApiException if fails to make API call
   */
  public void getAttachment(String accountId, String envelopeId, String attachmentId) throws ApiException {
    getAttachmentWithHttpInfo(accountId, envelopeId, attachmentId);
  }

  /**
   * Retrieves an attachment from the envelope.
   * Retrieves an attachment from an envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param attachmentId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getAttachmentWithHttpInfo(String accountId, String envelopeId, String attachmentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAttachment");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getAttachment");
    }
    
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling getAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/attachments/{attachmentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Returns a list of attachments associated with the specified envelope.
   * Returns a list of attachments associated with a specified envelope
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeAttachmentsResult getAttachments(String accountId, String envelopeId) throws ApiException {
    ApiResponse<EnvelopeAttachmentsResult> localVarResponse = getAttachmentsWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Returns a list of attachments associated with the specified envelope
   * Returns a list of attachments associated with a specified envelope
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeAttachmentsResult > getAttachmentsWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAttachments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getAttachments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/attachments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<EnvelopeAttachmentsResult> localVarReturnType = new GenericType<EnvelopeAttachmentsResult>() {};
    EnvelopeAttachmentsResult localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeAttachmentsResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Retrieves the current metadata of a ChunkedUpload. Returns the details (but not the content) about a chunked upload.  **Note:** You cannot obtain details about a chunked upload that has expired, been deleted, or consumed by other actions.
  /// </summary>

 /**
  * GetChunkedUploadOptions Class.
  *
  **/
  public class GetChunkedUploadOptions
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
   * Retrieves the current metadata of a ChunkedUpload..
   * Returns the details (but not the content) about a chunked upload.  **Note:** You cannot obtain details about a chunked upload that has expired, been deleted, or consumed by other actions.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @return ChunkedUploadResponse
   */ 
  public ChunkedUploadResponse getChunkedUpload(String accountId, String chunkedUploadId) throws ApiException {
    return getChunkedUpload(accountId, chunkedUploadId, null);
  }

  /**
   * Retrieves the current metadata of a ChunkedUpload..
   * Returns the details (but not the content) about a chunked upload.  **Note:** You cannot obtain details about a chunked upload that has expired, been deleted, or consumed by other actions.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @param options for modifying the method behavior.
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadResponse getChunkedUpload(String accountId, String chunkedUploadId, EnvelopesApi.GetChunkedUploadOptions options) throws ApiException {
    ApiResponse<ChunkedUploadResponse> localVarResponse = getChunkedUploadWithHttpInfo(accountId, chunkedUploadId, options);
    return localVarResponse.getData();
  }

  /**
   * Retrieves the current metadata of a ChunkedUpload.
   * Returns the details (but not the content) about a chunked upload.  **Note:** You cannot obtain details about a chunked upload that has expired, been deleted, or consumed by other actions.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @param options for modifying the method behavior.
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChunkedUploadResponse > getChunkedUploadWithHttpInfo(String accountId, String chunkedUploadId, EnvelopesApi.GetChunkedUploadOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getChunkedUpload");
    }
    
    // verify the required parameter 'chunkedUploadId' is set
    if (chunkedUploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling getChunkedUpload");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()));

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
    
    GenericType<ChunkedUploadResponse> localVarReturnType = new GenericType<ChunkedUploadResponse>() {};
    ChunkedUploadResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ChunkedUploadResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets comment transcript for envelope and user Retrieves a PDF file containing all of the comments that senders and recipients have added to the documents in an envelope.  The response body of this method is the PDF file as a byte stream.   **Note:** Comments are disabled by default. To use the comments feature, an account administrator must enable comments on the account (in the &#x60;accountSettingsInformation&#x60; object, set the &#x60;enableSigningExtensionComments&#x60; property to **true**). 
  /// </summary>

 /**
  * GetCommentsTranscriptOptions Class.
  *
  **/
  public class GetCommentsTranscriptOptions
  {
  private String encoding = null;
  
 /**
  * setEncoding method.
  */
  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

 /**
  * getEncoding method.
  *
  * @return String
  */
  public String getEncoding() {
    return this.encoding;
  }
  }

   /**
   * Gets comment transcript for envelope and user.
   * Retrieves a PDF file containing all of the comments that senders and recipients have added to the documents in an envelope.  The response body of this method is the PDF file as a byte stream.   **Note:** Comments are disabled by default. To use the comments feature, an account administrator must enable comments on the account (in the &#x60;accountSettingsInformation&#x60; object, set the &#x60;enableSigningExtensionComments&#x60; property to **true**). 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getCommentsTranscript(String accountId, String envelopeId) throws ApiException {
    return getCommentsTranscript(accountId, envelopeId, null);
  }

  /**
   * Gets comment transcript for envelope and user.
   * Retrieves a PDF file containing all of the comments that senders and recipients have added to the documents in an envelope.  The response body of this method is the PDF file as a byte stream.   **Note:** Comments are disabled by default. To use the comments feature, an account administrator must enable comments on the account (in the &#x60;accountSettingsInformation&#x60; object, set the &#x60;enableSigningExtensionComments&#x60; property to **true**). 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getCommentsTranscript(String accountId, String envelopeId, EnvelopesApi.GetCommentsTranscriptOptions options) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getCommentsTranscriptWithHttpInfo(accountId, envelopeId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets comment transcript for envelope and user
   * Retrieves a PDF file containing all of the comments that senders and recipients have added to the documents in an envelope.  The response body of this method is the PDF file as a byte stream.   **Note:** Comments are disabled by default. To use the comments feature, an account administrator must enable comments on the account (in the &#x60;accountSettingsInformation&#x60; object, set the &#x60;enableSigningExtensionComments&#x60; property to **true**). 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getCommentsTranscriptWithHttpInfo(String accountId, String envelopeId, EnvelopesApi.GetCommentsTranscriptOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getCommentsTranscript");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getCommentsTranscript");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/comments/transcript"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("encoding", options.encoding));
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
  /// Reserved: Gets the Electronic Record and Signature Disclosure associated with the account. Reserved: Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account.
  /// </summary>

 /**
  * GetConsumerDisclosureOptions Class.
  *
  **/
  public class GetConsumerDisclosureOptions
  {
  private String langCode2 = null;
  
 /**
  * setLangCode2 method.
  */
  public void setLangCode2(String langCode2) {
    this.langCode2 = langCode2;
  }

 /**
  * getLangCode2 method.
  *
  * @return String
  */
  public String getLangCode2() {
    return this.langCode2;
  }
  }

   /**
   * Reserved: Gets the Electronic Record and Signature Disclosure associated with the account..
   * Reserved: Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to ï¿½browserï¿½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @return ConsumerDisclosure
   */ 
  public ConsumerDisclosure getConsumerDisclosure(String accountId, String envelopeId, String recipientId, String langCode) throws ApiException {
    return getConsumerDisclosure(accountId, envelopeId, recipientId, langCode, null);
  }

  /**
   * Reserved: Gets the Electronic Record and Signature Disclosure associated with the account..
   * Reserved: Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to ï¿½browserï¿½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ConsumerDisclosure getConsumerDisclosure(String accountId, String envelopeId, String recipientId, String langCode, EnvelopesApi.GetConsumerDisclosureOptions options) throws ApiException {
    ApiResponse<ConsumerDisclosure> localVarResponse = getConsumerDisclosureWithHttpInfo(accountId, envelopeId, recipientId, langCode, options);
    return localVarResponse.getData();
  }

  /**
   * Reserved: Gets the Electronic Record and Signature Disclosure associated with the account.
   * Reserved: Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to ï¿½browserï¿½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsumerDisclosure > getConsumerDisclosureWithHttpInfo(String accountId, String envelopeId, String recipientId, String langCode, EnvelopesApi.GetConsumerDisclosureOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConsumerDisclosure");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getConsumerDisclosure");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getConsumerDisclosure");
    }
    
    // verify the required parameter 'langCode' is set
    if (langCode == null) {
      throw new ApiException(400, "Missing the required parameter 'langCode' when calling getConsumerDisclosure");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/consumer_disclosure/{langCode}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()))
      .replaceAll("\\{" + "langCode" + "\\}", apiClient.escapeString(langCode.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("langCode", options.langCode2));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ConsumerDisclosure> localVarReturnType = new GenericType<ConsumerDisclosure>() {};
    ConsumerDisclosure localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ConsumerDisclosure>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the Electronic Record and Signature Disclosure associated with the account. Retrieves the Electronic Record and Signature Disclosure, with html formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
  /// </summary>

 /**
  * GetConsumerDisclosureDefaultOptions Class.
  *
  **/
  public class GetConsumerDisclosureDefaultOptions
  {
  private String langCode = null;
  
 /**
  * setLangCode method.
  */
  public void setLangCode(String langCode) {
    this.langCode = langCode;
  }

 /**
  * getLangCode method.
  *
  * @return String
  */
  public String getLangCode() {
    return this.langCode;
  }
  }

   /**
   * Gets the Electronic Record and Signature Disclosure associated with the account..
   * Retrieves the Electronic Record and Signature Disclosure, with html formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return ConsumerDisclosure
   */ 
  public ConsumerDisclosure getConsumerDisclosureDefault(String accountId, String envelopeId, String recipientId) throws ApiException {
    return getConsumerDisclosureDefault(accountId, envelopeId, recipientId, null);
  }

  /**
   * Gets the Electronic Record and Signature Disclosure associated with the account..
   * Retrieves the Electronic Record and Signature Disclosure, with html formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ConsumerDisclosure getConsumerDisclosureDefault(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetConsumerDisclosureDefaultOptions options) throws ApiException {
    ApiResponse<ConsumerDisclosure> localVarResponse = getConsumerDisclosureDefaultWithHttpInfo(accountId, envelopeId, recipientId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the Electronic Record and Signature Disclosure associated with the account.
   * Retrieves the Electronic Record and Signature Disclosure, with html formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsumerDisclosure > getConsumerDisclosureDefaultWithHttpInfo(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetConsumerDisclosureDefaultOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConsumerDisclosureDefault");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getConsumerDisclosureDefault");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getConsumerDisclosureDefault");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/consumer_disclosure"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("langCode", options.langCode));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ConsumerDisclosure> localVarReturnType = new GenericType<ConsumerDisclosure>() {};
    ConsumerDisclosure localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ConsumerDisclosure>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets a document from an envelope. Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.  You can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.   To retrieve the combined content replace the &#x60;{documentId}&#x60; parameter in the endpoint with &#x60;combined&#x60;. /accounts/{accountId}/envelopes/{envelopeId}/documents/combined
  /// </summary>

 /**
  * GetDocumentOptions Class.
  *
  **/
  public class GetDocumentOptions
  {
  private String certificate = null;
  private String documentsByUserid = null;
  private String encoding = null;
  private String encrypt = null;
  private String language = null;
  private String recipientId = null;
  private String sharedUserId = null;
  private String showChanges = null;
  private String watermark = null;
  
 /**
  * setCertificate method.
  */
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

 /**
  * getCertificate method.
  *
  * @return String
  */
  public String getCertificate() {
    return this.certificate;
  }
  
 /**
  * setDocumentsByUserid method.
  */
  public void setDocumentsByUserid(String documentsByUserid) {
    this.documentsByUserid = documentsByUserid;
  }

 /**
  * getDocumentsByUserid method.
  *
  * @return String
  */
  public String getDocumentsByUserid() {
    return this.documentsByUserid;
  }
  
 /**
  * setEncoding method.
  */
  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

 /**
  * getEncoding method.
  *
  * @return String
  */
  public String getEncoding() {
    return this.encoding;
  }
  
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
  * setLanguage method.
  */
  public void setLanguage(String language) {
    this.language = language;
  }

 /**
  * getLanguage method.
  *
  * @return String
  */
  public String getLanguage() {
    return this.language;
  }
  
 /**
  * setRecipientId method.
  */
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

 /**
  * getRecipientId method.
  *
  * @return String
  */
  public String getRecipientId() {
    return this.recipientId;
  }
  
 /**
  * setSharedUserId method.
  */
  public void setSharedUserId(String sharedUserId) {
    this.sharedUserId = sharedUserId;
  }

 /**
  * getSharedUserId method.
  *
  * @return String
  */
  public String getSharedUserId() {
    return this.sharedUserId;
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
  * setWatermark method.
  */
  public void setWatermark(String watermark) {
    this.watermark = watermark;
  }

 /**
  * getWatermark method.
  *
  * @return String
  */
  public String getWatermark() {
    return this.watermark;
  }
  }

   /**
   * Gets a document from an envelope..
   * Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.  You can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.   To retrieve the combined content replace the &#x60;{documentId}&#x60; parameter in the endpoint with &#x60;combined&#x60;. /accounts/{accountId}/envelopes/{envelopeId}/documents/combined
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getDocument(String accountId, String envelopeId, String documentId) throws ApiException {
    return getDocument(accountId, envelopeId, documentId, null);
  }

  /**
   * Gets a document from an envelope..
   * Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.  You can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.   To retrieve the combined content replace the &#x60;{documentId}&#x60; parameter in the endpoint with &#x60;combined&#x60;. /accounts/{accountId}/envelopes/{envelopeId}/documents/combined
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getDocument(String accountId, String envelopeId, String documentId, EnvelopesApi.GetDocumentOptions options) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getDocumentWithHttpInfo(accountId, envelopeId, documentId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a document from an envelope.
   * Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.  You can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.   To retrieve the combined content replace the &#x60;{documentId}&#x60; parameter in the endpoint with &#x60;combined&#x60;. /accounts/{accountId}/envelopes/{envelopeId}/documents/combined
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getDocumentWithHttpInfo(String accountId, String envelopeId, String documentId, EnvelopesApi.GetDocumentOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("certificate", options.certificate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("documents_by_userid", options.documentsByUserid));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("encoding", options.encoding));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("encrypt", options.encrypt));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("language", options.language));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("recipient_id", options.recipientId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("shared_user_id", options.sharedUserId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("show_changes", options.showChanges));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("watermark", options.watermark));
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
  /// Gets a page image from an envelope for display. Retrieves a page image for display from the specified envelope.
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
   * Gets a page image from an envelope for display..
   * Retrieves a page image for display from the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getDocumentPageImage(String accountId, String envelopeId, String documentId, String pageNumber) throws ApiException {
    return getDocumentPageImage(accountId, envelopeId, documentId, pageNumber, null);
  }

  /**
   * Gets a page image from an envelope for display..
   * Retrieves a page image for display from the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getDocumentPageImage(String accountId, String envelopeId, String documentId, String pageNumber, EnvelopesApi.GetDocumentPageImageOptions options) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getDocumentPageImageWithHttpInfo(accountId, envelopeId, documentId, pageNumber, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a page image from an envelope for display.
   * Retrieves a page image for display from the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getDocumentPageImageWithHttpInfo(String accountId, String envelopeId, String documentId, String pageNumber, EnvelopesApi.GetDocumentPageImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocumentPageImage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getDocumentPageImage");
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}/page_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
  /// Returns tabs on the document. Returns the tabs on the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;. 
  /// </summary>

 /**
  * GetDocumentTabsOptions Class.
  *
  **/
  public class GetDocumentTabsOptions
  {
  private String includeMetadata = null;
  private String pageNumbers = null;
  
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
   * Returns the tabs on the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return Tabs
   */ 
  public Tabs getDocumentTabs(String accountId, String envelopeId, String documentId) throws ApiException {
    return getDocumentTabs(accountId, envelopeId, documentId, null);
  }

  /**
   * Returns tabs on the document..
   * Returns the tabs on the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs getDocumentTabs(String accountId, String envelopeId, String documentId, EnvelopesApi.GetDocumentTabsOptions options) throws ApiException {
    ApiResponse<Tabs> localVarResponse = getDocumentTabsWithHttpInfo(accountId, envelopeId, documentId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns tabs on the document.
   * Returns the tabs on the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > getDocumentTabsWithHttpInfo(String accountId, String envelopeId, String documentId, EnvelopesApi.GetDocumentTabsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocumentTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_metadata", options.includeMetadata));
    }if (options != null) {
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
   * Gets the email setting overrides for an envelope..
   * Retrieves the email override settings for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings getEmailSettings(String accountId, String envelopeId) throws ApiException {
    ApiResponse<EmailSettings> localVarResponse = getEmailSettingsWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Gets the email setting overrides for an envelope.
   * Retrieves the email override settings for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailSettings > getEmailSettingsWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEmailSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEmailSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/email_settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    EmailSettings localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EmailSettings>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the status of a envelope. Retrieves the overall status for the specified envelope.
  /// </summary>

 /**
  * GetEnvelopeOptions Class.
  *
  **/
  public class GetEnvelopeOptions
  {
  private String advancedUpdate = null;
  private String include = null;
  
 /**
  * setAdvancedUpdate method.
  */
  public void setAdvancedUpdate(String advancedUpdate) {
    this.advancedUpdate = advancedUpdate;
  }

 /**
  * getAdvancedUpdate method.
  *
  * @return String
  */
  public String getAdvancedUpdate() {
    return this.advancedUpdate;
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
  }

   /**
   * Gets the status of a envelope..
   * Retrieves the overall status for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return Envelope
   */ 
  public Envelope getEnvelope(String accountId, String envelopeId) throws ApiException {
    return getEnvelope(accountId, envelopeId, null);
  }

  /**
   * Gets the status of a envelope..
   * Retrieves the overall status for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Envelope
   * @throws ApiException if fails to make API call
   */
  public Envelope getEnvelope(String accountId, String envelopeId, EnvelopesApi.GetEnvelopeOptions options) throws ApiException {
    ApiResponse<Envelope> localVarResponse = getEnvelopeWithHttpInfo(accountId, envelopeId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the status of a envelope.
   * Retrieves the overall status for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Envelope
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Envelope > getEnvelopeWithHttpInfo(String accountId, String envelopeId, EnvelopesApi.GetEnvelopeOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelope");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelope");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("advanced_update", options.advancedUpdate));
    }if (options != null) {
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
    
    GenericType<Envelope> localVarReturnType = new GenericType<Envelope>() {};
    Envelope localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Envelope>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns the delayed routing rules for an envelope&#39;s workflow step definition..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @return DelayedRouting
   * @throws ApiException if fails to make API call
   */
  public DelayedRouting getEnvelopeDelayedRoutingDefinition(String accountId, String envelopeId, String workflowStepId) throws ApiException {
    ApiResponse<DelayedRouting> localVarResponse = getEnvelopeDelayedRoutingDefinitionWithHttpInfo(accountId, envelopeId, workflowStepId);
    return localVarResponse.getData();
  }

  /**
   * Returns the delayed routing rules for an envelope&#39;s workflow step definition.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @return DelayedRouting
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DelayedRouting > getEnvelopeDelayedRoutingDefinitionWithHttpInfo(String accountId, String envelopeId, String workflowStepId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopeDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelopeDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling getEnvelopeDelayedRoutingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow/steps/{workflowStepId}/delayedRouting"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
    
    GenericType<DelayedRouting> localVarReturnType = new GenericType<DelayedRouting>() {};
    DelayedRouting localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DelayedRouting>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get the Original HTML Definition used to generate the Responsive HTML for a given document..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return DocumentHtmlDefinitionOriginals
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitionOriginals getEnvelopeDocumentHtmlDefinitions(String accountId, String envelopeId, String documentId) throws ApiException {
    ApiResponse<DocumentHtmlDefinitionOriginals> localVarResponse = getEnvelopeDocumentHtmlDefinitionsWithHttpInfo(accountId, envelopeId, documentId);
    return localVarResponse.getData();
  }

  /**
   * Get the Original HTML Definition used to generate the Responsive HTML for a given document.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return DocumentHtmlDefinitionOriginals
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentHtmlDefinitionOriginals > getEnvelopeDocumentHtmlDefinitionsWithHttpInfo(String accountId, String envelopeId, String documentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopeDocumentHtmlDefinitions");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelopeDocumentHtmlDefinitions");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getEnvelopeDocumentHtmlDefinitions");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/html_definitions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Get the Original HTML Definition used to generate the Responsive HTML for the envelope..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DocumentHtmlDefinitionOriginals
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitionOriginals getEnvelopeHtmlDefinitions(String accountId, String envelopeId) throws ApiException {
    ApiResponse<DocumentHtmlDefinitionOriginals> localVarResponse = getEnvelopeHtmlDefinitionsWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Get the Original HTML Definition used to generate the Responsive HTML for the envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DocumentHtmlDefinitionOriginals
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentHtmlDefinitionOriginals > getEnvelopeHtmlDefinitionsWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopeHtmlDefinitions");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelopeHtmlDefinitions");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/html_definitions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Returns the scheduled sending rules for an envelope&#39;s workflow definition..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return ScheduledSending
   * @throws ApiException if fails to make API call
   */
  public ScheduledSending getEnvelopeScheduledSendingDefinition(String accountId, String envelopeId) throws ApiException {
    ApiResponse<ScheduledSending> localVarResponse = getEnvelopeScheduledSendingDefinitionWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Returns the scheduled sending rules for an envelope&#39;s workflow definition.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return ScheduledSending
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ScheduledSending > getEnvelopeScheduledSendingDefinitionWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopeScheduledSendingDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelopeScheduledSendingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow/scheduledSending"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<ScheduledSending> localVarReturnType = new GenericType<ScheduledSending>() {};
    ScheduledSending localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ScheduledSending>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Returns a list of envelope transfer rules in the specified account. This method retrieves a list of envelope transfer rules associated with an account.  **Note:** Only Administrators can create and use envelope transfer rules. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
  /// </summary>

 /**
  * GetEnvelopeTransferRulesOptions Class.
  *
  **/
  public class GetEnvelopeTransferRulesOptions
  {
  private String count = null;
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
   * Returns a list of envelope transfer rules in the specified account..
   * This method retrieves a list of envelope transfer rules associated with an account.  **Note:** Only Administrators can create and use envelope transfer rules. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return EnvelopeTransferRuleInformation
   */ 
  public EnvelopeTransferRuleInformation getEnvelopeTransferRules(String accountId) throws ApiException {
    return getEnvelopeTransferRules(accountId, null);
  }

  /**
   * Returns a list of envelope transfer rules in the specified account..
   * This method retrieves a list of envelope transfer rules associated with an account.  **Note:** Only Administrators can create and use envelope transfer rules. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopeTransferRuleInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopeTransferRuleInformation getEnvelopeTransferRules(String accountId, EnvelopesApi.GetEnvelopeTransferRulesOptions options) throws ApiException {
    ApiResponse<EnvelopeTransferRuleInformation> localVarResponse = getEnvelopeTransferRulesWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns a list of envelope transfer rules in the specified account.
   * This method retrieves a list of envelope transfer rules associated with an account.  **Note:** Only Administrators can create and use envelope transfer rules. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopeTransferRuleInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeTransferRuleInformation > getEnvelopeTransferRulesWithHttpInfo(String accountId, EnvelopesApi.GetEnvelopeTransferRulesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopeTransferRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/transfer_rules"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
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
    
    GenericType<EnvelopeTransferRuleInformation> localVarReturnType = new GenericType<EnvelopeTransferRuleInformation>() {};
    EnvelopeTransferRuleInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeTransferRuleInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns the workflow definition for an envelope..
   * Returns an envelope&#39;s workflow definition if the envelope specified by &#x60;envelopeId&#x60; has one.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public Workflow getEnvelopeWorkflowDefinition(String accountId, String envelopeId) throws ApiException {
    ApiResponse<Workflow> localVarResponse = getEnvelopeWorkflowDefinitionWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Returns the workflow definition for an envelope.
   * Returns an envelope&#39;s workflow definition if the envelope specified by &#x60;envelopeId&#x60; has one.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workflow > getEnvelopeWorkflowDefinitionWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopeWorkflowDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelopeWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<Workflow> localVarReturnType = new GenericType<Workflow>() {};
    Workflow localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Workflow>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns the workflow step definition for an envelope by step id..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public WorkflowStep getEnvelopeWorkflowStepDefinition(String accountId, String envelopeId, String workflowStepId) throws ApiException {
    ApiResponse<WorkflowStep> localVarResponse = getEnvelopeWorkflowStepDefinitionWithHttpInfo(accountId, envelopeId, workflowStepId);
    return localVarResponse.getData();
  }

  /**
   * Returns the workflow step definition for an envelope by step id.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkflowStep > getEnvelopeWorkflowStepDefinitionWithHttpInfo(String accountId, String envelopeId, String workflowStepId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopeWorkflowStepDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelopeWorkflowStepDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling getEnvelopeWorkflowStepDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow/steps/{workflowStepId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
    
    GenericType<WorkflowStep> localVarReturnType = new GenericType<WorkflowStep>() {};
    WorkflowStep localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkflowStep>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns envelope form data for an existing envelope..
   * This method downloads the envelope and tab data (also called form data) from any in-process, completed, or canceled envelope that you sent or that is shared with you. Recipients who are also full administrators on an account can view form data for any envelopes that another user on the account has sent to them.  **Note:** To use this feature, the Sending Setting \&quot;Allow sender to download form data\&quot; must be enabled for the account.  ### Related topics  - [How to get envelope tab values](/docs/esign-rest-api/how-to/get-envelope-tab-values/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EnvelopeFormData
   * @throws ApiException if fails to make API call
   */
  public EnvelopeFormData getFormData(String accountId, String envelopeId) throws ApiException {
    ApiResponse<EnvelopeFormData> localVarResponse = getFormDataWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Returns envelope form data for an existing envelope.
   * This method downloads the envelope and tab data (also called form data) from any in-process, completed, or canceled envelope that you sent or that is shared with you. Recipients who are also full administrators on an account can view form data for any envelopes that another user on the account has sent to them.  **Note:** To use this feature, the Sending Setting \&quot;Allow sender to download form data\&quot; must be enabled for the account.  ### Related topics  - [How to get envelope tab values](/docs/esign-rest-api/how-to/get-envelope-tab-values/) 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EnvelopeFormData
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeFormData > getFormDataWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFormData");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getFormData");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/form_data"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<EnvelopeFormData> localVarReturnType = new GenericType<EnvelopeFormData>() {};
    EnvelopeFormData localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeFormData>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets envelope lock information..
   * Retrieves general information about the envelope lock.  If the call is made by the locked by user and the request has the same integrator key as original, then the &#x60;X-DocuSign-Edit&#x60; header and additional lock information is included in the response. This allows users to recover a lost editing session token and the &#x60;X-DocuSign-Edit&#x60; header.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation getLock(String accountId, String envelopeId) throws ApiException {
    ApiResponse<LockInformation> localVarResponse = getLockWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Gets envelope lock information.
   * Retrieves general information about the envelope lock.  If the call is made by the locked by user and the request has the same integrator key as original, then the &#x60;X-DocuSign-Edit&#x60; header and additional lock information is included in the response. This allows users to recover a lost editing session token and the &#x60;X-DocuSign-Edit&#x60; header.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LockInformation > getLockWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getLock");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Gets envelope notification information..
   * Retrieves the envelope notification, reminders and expirations, information for an existing envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public Notification getNotificationSettings(String accountId, String envelopeId) throws ApiException {
    ApiResponse<Notification> localVarResponse = getNotificationSettingsWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Gets envelope notification information.
   * Retrieves the envelope notification, reminders and expirations, information for an existing envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Notification > getNotificationSettingsWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getNotificationSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getNotificationSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/notification"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Returns the tabs from the page specified by &#x60;pageNumber&#x60; of the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs getPageTabs(String accountId, String envelopeId, String documentId, String pageNumber) throws ApiException {
    ApiResponse<Tabs> localVarResponse = getPageTabsWithHttpInfo(accountId, envelopeId, documentId, pageNumber);
    return localVarResponse.getData();
  }

  /**
   * Returns tabs on the specified page.
   * Returns the tabs from the page specified by &#x60;pageNumber&#x60; of the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > getPageTabsWithHttpInfo(String accountId, String envelopeId, String documentId, String pageNumber) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPageTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getPageTabs");
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
  /// Returns document page image(s) based on input. Returns images of the pages in a document for display based on the parameters that you specify.
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
   * Returns images of the pages in a document for display based on the parameters that you specify.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return PageImages
   */ 
  public PageImages getPages(String accountId, String envelopeId, String documentId) throws ApiException {
    return getPages(accountId, envelopeId, documentId, null);
  }

  /**
   * Returns document page image(s) based on input..
   * Returns images of the pages in a document for display based on the parameters that you specify.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return PageImages
   * @throws ApiException if fails to make API call
   */
  public PageImages getPages(String accountId, String envelopeId, String documentId, EnvelopesApi.GetPagesOptions options) throws ApiException {
    ApiResponse<PageImages> localVarResponse = getPagesWithHttpInfo(accountId, envelopeId, documentId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns document page image(s) based on input.
   * Returns images of the pages in a document for display based on the parameters that you specify.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return PageImages
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PageImages > getPagesWithHttpInfo(String accountId, String envelopeId, String documentId, EnvelopesApi.GetPagesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPages");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getPages");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getPages");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Returns document visibility for the recipients.
   * This method returns information about document visibility for a recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public DocumentVisibilityList getRecipientDocumentVisibility(String accountId, String envelopeId, String recipientId) throws ApiException {
    ApiResponse<DocumentVisibilityList> localVarResponse = getRecipientDocumentVisibilityWithHttpInfo(accountId, envelopeId, recipientId);
    return localVarResponse.getData();
  }

  /**
   * Returns document visibility for the recipients
   * This method returns information about document visibility for a recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentVisibilityList > getRecipientDocumentVisibilityWithHttpInfo(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/document_visibility"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
    
    GenericType<DocumentVisibilityList> localVarReturnType = new GenericType<DocumentVisibilityList>() {};
    DocumentVisibilityList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentVisibilityList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the initials image for a user. Retrieves the initials image for the specified user. The image is returned in the same format as it was uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user id and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; paramter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only contain chromed images. If getting the non-chromed image fails, try getting the chromed image.
  /// </summary>

 /**
  * GetRecipientInitialsImageOptions Class.
  *
  **/
  public class GetRecipientInitialsImageOptions
  {
  private String includeChrome = null;
  
 /**
  * setIncludeChrome method.
  */
  public void setIncludeChrome(String includeChrome) {
    this.includeChrome = includeChrome;
  }

 /**
  * getIncludeChrome method.
  *
  * @return String
  */
  public String getIncludeChrome() {
    return this.includeChrome;
  }
  }

   /**
   * Gets the initials image for a user..
   * Retrieves the initials image for the specified user. The image is returned in the same format as it was uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user id and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; paramter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only contain chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getRecipientInitialsImage(String accountId, String envelopeId, String recipientId) throws ApiException {
    return getRecipientInitialsImage(accountId, envelopeId, recipientId, null);
  }

  /**
   * Gets the initials image for a user..
   * Retrieves the initials image for the specified user. The image is returned in the same format as it was uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user id and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; paramter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only contain chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getRecipientInitialsImage(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetRecipientInitialsImageOptions options) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getRecipientInitialsImageWithHttpInfo(accountId, envelopeId, recipientId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the initials image for a user.
   * Retrieves the initials image for the specified user. The image is returned in the same format as it was uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user id and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; paramter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only contain chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getRecipientInitialsImageWithHttpInfo(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetRecipientInitialsImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientInitialsImage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientInitialsImage");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientInitialsImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/initials_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_chrome", options.includeChrome));
    }

    

    

    final String[] localVarAccepts = {
      "image/gif"
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

  /**
   * Gets signature information for a signer or sign-in-person recipient..
   * Retrieves signature information for a signer or sign-in-person recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public UserSignature getRecipientSignature(String accountId, String envelopeId, String recipientId) throws ApiException {
    ApiResponse<UserSignature> localVarResponse = getRecipientSignatureWithHttpInfo(accountId, envelopeId, recipientId);
    return localVarResponse.getData();
  }

  /**
   * Gets signature information for a signer or sign-in-person recipient.
   * Retrieves signature information for a signer or sign-in-person recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSignature > getRecipientSignatureWithHttpInfo(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientSignature");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientSignature");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientSignature");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
    
    GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};
    UserSignature localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserSignature>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Retrieve signature image information for a signer/sign-in-person recipient. Retrieves the specified user signature image. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; parameter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that don&#39;t properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
  /// </summary>

 /**
  * GetRecipientSignatureImageOptions Class.
  *
  **/
  public class GetRecipientSignatureImageOptions
  {
  private String includeChrome = null;
  
 /**
  * setIncludeChrome method.
  */
  public void setIncludeChrome(String includeChrome) {
    this.includeChrome = includeChrome;
  }

 /**
  * getIncludeChrome method.
  *
  * @return String
  */
  public String getIncludeChrome() {
    return this.includeChrome;
  }
  }

   /**
   * Retrieve signature image information for a signer/sign-in-person recipient..
   * Retrieves the specified user signature image. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; parameter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that don&#39;t properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getRecipientSignatureImage(String accountId, String envelopeId, String recipientId) throws ApiException {
    return getRecipientSignatureImage(accountId, envelopeId, recipientId, null);
  }

  /**
   * Retrieve signature image information for a signer/sign-in-person recipient..
   * Retrieves the specified user signature image. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; parameter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that don&#39;t properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getRecipientSignatureImage(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetRecipientSignatureImageOptions options) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getRecipientSignatureImageWithHttpInfo(accountId, envelopeId, recipientId, options);
    return localVarResponse.getData();
  }

  /**
   * Retrieve signature image information for a signer/sign-in-person recipient.
   * Retrieves the specified user signature image. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; parameter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that don&#39;t properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getRecipientSignatureImageWithHttpInfo(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetRecipientSignatureImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientSignatureImage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientSignatureImage");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_chrome", options.includeChrome));
    }

    

    

    final String[] localVarAccepts = {
      "image/gif"
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

  /**
   * Get encrypted tabs for envelope..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void getTabsBlob(String accountId, String envelopeId) throws ApiException {
    getTabsBlobWithHttpInfo(accountId, envelopeId);
  }

  /**
   * Get encrypted tabs for envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getTabsBlobWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTabsBlob");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getTabsBlob");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/tabs_blob"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Returns the delayed routing rules for a template&#39;s workflow step definition..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @return DelayedRouting
   * @throws ApiException if fails to make API call
   */
  public DelayedRouting getTemplateDelayedRoutingDefinition(String accountId, String templateId, String workflowStepId) throws ApiException {
    ApiResponse<DelayedRouting> localVarResponse = getTemplateDelayedRoutingDefinitionWithHttpInfo(accountId, templateId, workflowStepId);
    return localVarResponse.getData();
  }

  /**
   * Returns the delayed routing rules for a template&#39;s workflow step definition.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @return DelayedRouting
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DelayedRouting > getTemplateDelayedRoutingDefinitionWithHttpInfo(String accountId, String templateId, String workflowStepId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTemplateDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling getTemplateDelayedRoutingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow/steps/{workflowStepId}/delayedRouting"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
    
    GenericType<DelayedRouting> localVarReturnType = new GenericType<DelayedRouting>() {};
    DelayedRouting localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DelayedRouting>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns document visibility for the recipients.
   * This method returns information about document visibility for a template recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public DocumentVisibilityList getTemplateRecipientDocumentVisibility(String accountId, String templateId, String recipientId) throws ApiException {
    ApiResponse<DocumentVisibilityList> localVarResponse = getTemplateRecipientDocumentVisibilityWithHttpInfo(accountId, templateId, recipientId);
    return localVarResponse.getData();
  }

  /**
   * Returns document visibility for the recipients
   * This method returns information about document visibility for a template recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentVisibilityList > getTemplateRecipientDocumentVisibilityWithHttpInfo(String accountId, String templateId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTemplateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getTemplateRecipientDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/document_visibility"
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
    
    GenericType<DocumentVisibilityList> localVarReturnType = new GenericType<DocumentVisibilityList>() {};
    DocumentVisibilityList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentVisibilityList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns the scheduled sending rules for a template&#39;s workflow definition..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return ScheduledSending
   * @throws ApiException if fails to make API call
   */
  public ScheduledSending getTemplateScheduledSendingDefinition(String accountId, String templateId) throws ApiException {
    ApiResponse<ScheduledSending> localVarResponse = getTemplateScheduledSendingDefinitionWithHttpInfo(accountId, templateId);
    return localVarResponse.getData();
  }

  /**
   * Returns the scheduled sending rules for a template&#39;s workflow definition.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return ScheduledSending
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ScheduledSending > getTemplateScheduledSendingDefinitionWithHttpInfo(String accountId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTemplateScheduledSendingDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateScheduledSendingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow/scheduledSending"
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
    
    GenericType<ScheduledSending> localVarReturnType = new GenericType<ScheduledSending>() {};
    ScheduledSending localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ScheduledSending>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns the workflow definition for a template..
   * Returns template&#39;s workflow definition if the template specified by &#x60;templateId&#x60; has one.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public Workflow getTemplateWorkflowDefinition(String accountId, String templateId) throws ApiException {
    ApiResponse<Workflow> localVarResponse = getTemplateWorkflowDefinitionWithHttpInfo(accountId, templateId);
    return localVarResponse.getData();
  }

  /**
   * Returns the workflow definition for a template.
   * Returns template&#39;s workflow definition if the template specified by &#x60;templateId&#x60; has one.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workflow > getTemplateWorkflowDefinitionWithHttpInfo(String accountId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTemplateWorkflowDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow"
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
    
    GenericType<Workflow> localVarReturnType = new GenericType<Workflow>() {};
    Workflow localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Workflow>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns the workflow step definition for a template by step id..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public WorkflowStep getTemplateWorkflowStepDefinition(String accountId, String templateId, String workflowStepId) throws ApiException {
    ApiResponse<WorkflowStep> localVarResponse = getTemplateWorkflowStepDefinitionWithHttpInfo(accountId, templateId, workflowStepId);
    return localVarResponse.getData();
  }

  /**
   * Returns the workflow step definition for a template by step id.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkflowStep > getTemplateWorkflowStepDefinitionWithHttpInfo(String accountId, String templateId, String workflowStepId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTemplateWorkflowStepDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateWorkflowStepDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling getTemplateWorkflowStepDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow/steps/{workflowStepId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
    
    GenericType<WorkflowStep> localVarReturnType = new GenericType<WorkflowStep>() {};
    WorkflowStep localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkflowStep>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets the envelope audit events for an envelope..
   * Gets the envelope audit events for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EnvelopeAuditEventResponse
   * @throws ApiException if fails to make API call
   */
  public EnvelopeAuditEventResponse listAuditEvents(String accountId, String envelopeId) throws ApiException {
    ApiResponse<EnvelopeAuditEventResponse> localVarResponse = listAuditEventsWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Gets the envelope audit events for an envelope.
   * Gets the envelope audit events for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EnvelopeAuditEventResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeAuditEventResponse > listAuditEventsWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listAuditEvents");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listAuditEvents");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/audit_events"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<EnvelopeAuditEventResponse> localVarReturnType = new GenericType<EnvelopeAuditEventResponse>() {};
    EnvelopeAuditEventResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeAuditEventResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets the custom field information for the specified envelope..
   * Retrieves the custom field information for the specified envelope. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes, and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.  There are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. With a list custom field, the sender selects the value of the field from a pre-made list.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return CustomFieldsEnvelope
   * @throws ApiException if fails to make API call
   */
  public CustomFieldsEnvelope listCustomFields(String accountId, String envelopeId) throws ApiException {
    ApiResponse<CustomFieldsEnvelope> localVarResponse = listCustomFieldsWithHttpInfo(accountId, envelopeId);
    return localVarResponse.getData();
  }

  /**
   * Gets the custom field information for the specified envelope.
   * Retrieves the custom field information for the specified envelope. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes, and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.  There are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. With a list custom field, the sender selects the value of the field from a pre-made list.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return CustomFieldsEnvelope
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomFieldsEnvelope > listCustomFieldsWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<CustomFieldsEnvelope> localVarReturnType = new GenericType<CustomFieldsEnvelope>() {};
    CustomFieldsEnvelope localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CustomFieldsEnvelope>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets the custom document fields from an  existing envelope document..
   * Retrieves the custom document field information from an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation listDocumentFields(String accountId, String envelopeId, String documentId) throws ApiException {
    ApiResponse<DocumentFieldsInformation> localVarResponse = listDocumentFieldsWithHttpInfo(accountId, envelopeId, documentId);
    return localVarResponse.getData();
  }

  /**
   * Gets the custom document fields from an  existing envelope document.
   * Retrieves the custom document field information from an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentFieldsInformation > listDocumentFieldsWithHttpInfo(String accountId, String envelopeId, String documentId) throws ApiException {
    Object localVarPostBody = "{}";
    
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
  /// Gets a list of envelope documents. Retrieves a list of documents associated with the specified envelope.
  /// </summary>

 /**
  * ListDocumentsOptions Class.
  *
  **/
  public class ListDocumentsOptions
  {
  private String documentsByUserid = null;
  private String includeDocgenFormfields = null;
  private String includeDocumentSize = null;
  private String includeMetadata = null;
  private String includeTabs = null;
  private String recipientId = null;
  private String sharedUserId = null;
  
 /**
  * setDocumentsByUserid method.
  */
  public void setDocumentsByUserid(String documentsByUserid) {
    this.documentsByUserid = documentsByUserid;
  }

 /**
  * getDocumentsByUserid method.
  *
  * @return String
  */
  public String getDocumentsByUserid() {
    return this.documentsByUserid;
  }
  
 /**
  * setIncludeDocgenFormfields method.
  */
  public void setIncludeDocgenFormfields(String includeDocgenFormfields) {
    this.includeDocgenFormfields = includeDocgenFormfields;
  }

 /**
  * getIncludeDocgenFormfields method.
  *
  * @return String
  */
  public String getIncludeDocgenFormfields() {
    return this.includeDocgenFormfields;
  }
  
 /**
  * setIncludeDocumentSize method.
  */
  public void setIncludeDocumentSize(String includeDocumentSize) {
    this.includeDocumentSize = includeDocumentSize;
  }

 /**
  * getIncludeDocumentSize method.
  *
  * @return String
  */
  public String getIncludeDocumentSize() {
    return this.includeDocumentSize;
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
  
 /**
  * setRecipientId method.
  */
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

 /**
  * getRecipientId method.
  *
  * @return String
  */
  public String getRecipientId() {
    return this.recipientId;
  }
  
 /**
  * setSharedUserId method.
  */
  public void setSharedUserId(String sharedUserId) {
    this.sharedUserId = sharedUserId;
  }

 /**
  * getSharedUserId method.
  *
  * @return String
  */
  public String getSharedUserId() {
    return this.sharedUserId;
  }
  }

   /**
   * Gets a list of envelope documents..
   * Retrieves a list of documents associated with the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EnvelopeDocumentsResult
   */ 
  public EnvelopeDocumentsResult listDocuments(String accountId, String envelopeId) throws ApiException {
    return listDocuments(accountId, envelopeId, null);
  }

  /**
   * Gets a list of envelope documents..
   * Retrieves a list of documents associated with the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocumentsResult listDocuments(String accountId, String envelopeId, EnvelopesApi.ListDocumentsOptions options) throws ApiException {
    ApiResponse<EnvelopeDocumentsResult> localVarResponse = listDocumentsWithHttpInfo(accountId, envelopeId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets a list of envelope documents.
   * Retrieves a list of documents associated with the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeDocumentsResult > listDocumentsWithHttpInfo(String accountId, String envelopeId, EnvelopesApi.ListDocumentsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocuments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("documents_by_userid", options.documentsByUserid));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_docgen_formfields", options.includeDocgenFormfields));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_document_size", options.includeDocumentSize));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_metadata", options.includeMetadata));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_tabs", options.includeTabs));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("recipient_id", options.recipientId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("shared_user_id", options.sharedUserId));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<EnvelopeDocumentsResult> localVarReturnType = new GenericType<EnvelopeDocumentsResult>() {};
    EnvelopeDocumentsResult localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeDocumentsResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the status of recipients for an envelope. Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list.   The &#x60;currentRoutingOrder&#x60; property of the response contains the &#x60;routingOrder&#x60; value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
  /// </summary>

 /**
  * ListRecipientsOptions Class.
  *
  **/
  public class ListRecipientsOptions
  {
  private String includeAnchorTabLocations = null;
  private String includeExtended = null;
  private String includeMetadata = null;
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
   * Gets the status of recipients for an envelope..
   * Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list.   The &#x60;currentRoutingOrder&#x60; property of the response contains the &#x60;routingOrder&#x60; value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return Recipients
   */ 
  public Recipients listRecipients(String accountId, String envelopeId) throws ApiException {
    return listRecipients(accountId, envelopeId, null);
  }

  /**
   * Gets the status of recipients for an envelope..
   * Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list.   The &#x60;currentRoutingOrder&#x60; property of the response contains the &#x60;routingOrder&#x60; value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients listRecipients(String accountId, String envelopeId, EnvelopesApi.ListRecipientsOptions options) throws ApiException {
    ApiResponse<Recipients> localVarResponse = listRecipientsWithHttpInfo(accountId, envelopeId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the status of recipients for an envelope.
   * Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list.   The &#x60;currentRoutingOrder&#x60; property of the response contains the &#x60;routingOrder&#x60; value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recipients > listRecipientsWithHttpInfo(String accountId, String envelopeId, EnvelopesApi.ListRecipientsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listRecipients");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listRecipients");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
      localVarQueryParams.addAll(apiClient.parameterToPair("include_metadata", options.includeMetadata));
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
  /// Gets the envelope status for the specified envelopes. Retrieves the envelope status for the specified envelopes.
  /// </summary>

 /**
  * ListStatusOptions Class.
  *
  **/
  public class ListStatusOptions
  {
  private String acStatus = null;
  private String block = null;
  private String count = null;
  private String email = null;
  private String envelopeIds = null;
  private String fromDate = null;
  private String fromToStatus = null;
  private String startPosition = null;
  private String status = null;
  private String toDate = null;
  private String transactionIds = null;
  private String userName = null;
  
 /**
  * setAcStatus method.
  */
  public void setAcStatus(String acStatus) {
    this.acStatus = acStatus;
  }

 /**
  * getAcStatus method.
  *
  * @return String
  */
  public String getAcStatus() {
    return this.acStatus;
  }
  
 /**
  * setBlock method.
  */
  public void setBlock(String block) {
    this.block = block;
  }

 /**
  * getBlock method.
  *
  * @return String
  */
  public String getBlock() {
    return this.block;
  }
  
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
  * setEmail method.
  */
  public void setEmail(String email) {
    this.email = email;
  }

 /**
  * getEmail method.
  *
  * @return String
  */
  public String getEmail() {
    return this.email;
  }
  
 /**
  * setEnvelopeIds method.
  */
  public void setEnvelopeIds(String envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

 /**
  * getEnvelopeIds method.
  *
  * @return String
  */
  public String getEnvelopeIds() {
    return this.envelopeIds;
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
  * setFromToStatus method.
  */
  public void setFromToStatus(String fromToStatus) {
    this.fromToStatus = fromToStatus;
  }

 /**
  * getFromToStatus method.
  *
  * @return String
  */
  public String getFromToStatus() {
    return this.fromToStatus;
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
  * setStatus method.
  */
  public void setStatus(String status) {
    this.status = status;
  }

 /**
  * getStatus method.
  *
  * @return String
  */
  public String getStatus() {
    return this.status;
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
  * setTransactionIds method.
  */
  public void setTransactionIds(String transactionIds) {
    this.transactionIds = transactionIds;
  }

 /**
  * getTransactionIds method.
  *
  * @return String
  */
  public String getTransactionIds() {
    return this.transactionIds;
  }
  
 /**
  * setUserName method.
  */
  public void setUserName(String userName) {
    this.userName = userName;
  }

 /**
  * getUserName method.
  *
  * @return String
  */
  public String getUserName() {
    return this.userName;
  }
  }

   /**
   * Gets the envelope status for the specified envelopes..
   * Retrieves the envelope status for the specified envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeIdsRequest  (optional)
   * @return EnvelopesInformation
   */ 
  public EnvelopesInformation listStatus(String accountId, EnvelopeIdsRequest envelopeIdsRequest) throws ApiException {
    return listStatus(accountId, envelopeIdsRequest, null);
  }

  /**
   * Gets the envelope status for the specified envelopes..
   * Retrieves the envelope status for the specified envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeIdsRequest  (optional)
   * @param options for modifying the method behavior.
   * @return EnvelopesInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopesInformation listStatus(String accountId, EnvelopeIdsRequest envelopeIdsRequest, EnvelopesApi.ListStatusOptions options) throws ApiException {
    ApiResponse<EnvelopesInformation> localVarResponse = listStatusWithHttpInfo(accountId, envelopeIdsRequest, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the envelope status for the specified envelopes.
   * Retrieves the envelope status for the specified envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeIdsRequest  (optional)
   * @param options for modifying the method behavior.
   * @return EnvelopesInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopesInformation > listStatusWithHttpInfo(String accountId, EnvelopeIdsRequest envelopeIdsRequest, EnvelopesApi.ListStatusOptions options) throws ApiException {
    Object localVarPostBody = envelopeIdsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listStatus");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/status"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("ac_status", options.acStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("block", options.block));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email", options.email));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("envelope_ids", options.envelopeIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_to_status", options.fromToStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("transaction_ids", options.transactionIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_name", options.userName));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<EnvelopesInformation> localVarReturnType = new GenericType<EnvelopesInformation>() {};
    EnvelopesInformation localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopesInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets status changes for one or more envelopes. Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.  ### Important: Unless you are requesting the status for specific envelopes (using the &#x60;envelopeIds&#x60; or &#x60;transactionIds&#x60; properties), you must add a set the &#x60;from_date&#x60; property in the request.  Getting envelope status using &#x60;transactionIds&#x60; is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.  ### Request Envelope Status Notes ###  The REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (&#x60;from_to_status&#x60;) set to &#x60;Delivered&#x60; &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.  To avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.  For example, a request with a status qualifier (from_to_status) of &#x60;Delivered&#x60; and a status of \&quot;&#x60;Created&#x60;,&#x60;Sent&#x60;\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of &#x60;Created&#x60; or &#x60;Sent&#x60;, and since an envelope that has been delivered can never have a status of &#x60;Created&#x60; or &#x60;Sent&#x60;, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.  Client applications should check that the statuses they are requesting make sense for a given status qualifier.
  /// </summary>

 /**
  * ListStatusChangesOptions Class.
  *
  **/
  public class ListStatusChangesOptions
  {
  private String acStatus = null;
  private String block = null;
  private String cdseMode = null;
  private String continuationToken = null;
  private String count = null;
  private String customField = null;
  private String email = null;
  private String envelopeIds = null;
  private String exclude = null;
  private String folderIds = null;
  private String folderTypes = null;
  private String fromDate = null;
  private String fromToStatus = null;
  private String include = null;
  private String includePurgeInformation = null;
  private String intersectingFolderIds = null;
  private String lastQueriedDate = null;
  private String order = null;
  private String orderBy = null;
  private String powerformids = null;
  private String queryBudget = null;
  private String requesterDateFormat = null;
  private String searchText = null;
  private String startPosition = null;
  private String status = null;
  private String toDate = null;
  private String transactionIds = null;
  private String userFilter = null;
  private String userId = null;
  private String userName = null;
  
 /**
  * setAcStatus method.
  */
  public void setAcStatus(String acStatus) {
    this.acStatus = acStatus;
  }

 /**
  * getAcStatus method.
  *
  * @return String
  */
  public String getAcStatus() {
    return this.acStatus;
  }
  
 /**
  * setBlock method.
  */
  public void setBlock(String block) {
    this.block = block;
  }

 /**
  * getBlock method.
  *
  * @return String
  */
  public String getBlock() {
    return this.block;
  }
  
 /**
  * setCdseMode method.
  */
  public void setCdseMode(String cdseMode) {
    this.cdseMode = cdseMode;
  }

 /**
  * getCdseMode method.
  *
  * @return String
  */
  public String getCdseMode() {
    return this.cdseMode;
  }
  
 /**
  * setContinuationToken method.
  */
  public void setContinuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
  }

 /**
  * getContinuationToken method.
  *
  * @return String
  */
  public String getContinuationToken() {
    return this.continuationToken;
  }
  
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
  * setCustomField method.
  */
  public void setCustomField(String customField) {
    this.customField = customField;
  }

 /**
  * getCustomField method.
  *
  * @return String
  */
  public String getCustomField() {
    return this.customField;
  }
  
 /**
  * setEmail method.
  */
  public void setEmail(String email) {
    this.email = email;
  }

 /**
  * getEmail method.
  *
  * @return String
  */
  public String getEmail() {
    return this.email;
  }
  
 /**
  * setEnvelopeIds method.
  */
  public void setEnvelopeIds(String envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

 /**
  * getEnvelopeIds method.
  *
  * @return String
  */
  public String getEnvelopeIds() {
    return this.envelopeIds;
  }
  
 /**
  * setExclude method.
  */
  public void setExclude(String exclude) {
    this.exclude = exclude;
  }

 /**
  * getExclude method.
  *
  * @return String
  */
  public String getExclude() {
    return this.exclude;
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
  * setFromToStatus method.
  */
  public void setFromToStatus(String fromToStatus) {
    this.fromToStatus = fromToStatus;
  }

 /**
  * getFromToStatus method.
  *
  * @return String
  */
  public String getFromToStatus() {
    return this.fromToStatus;
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
  * setIncludePurgeInformation method.
  */
  public void setIncludePurgeInformation(String includePurgeInformation) {
    this.includePurgeInformation = includePurgeInformation;
  }

 /**
  * getIncludePurgeInformation method.
  *
  * @return String
  */
  public String getIncludePurgeInformation() {
    return this.includePurgeInformation;
  }
  
 /**
  * setIntersectingFolderIds method.
  */
  public void setIntersectingFolderIds(String intersectingFolderIds) {
    this.intersectingFolderIds = intersectingFolderIds;
  }

 /**
  * getIntersectingFolderIds method.
  *
  * @return String
  */
  public String getIntersectingFolderIds() {
    return this.intersectingFolderIds;
  }
  
 /**
  * setLastQueriedDate method.
  */
  public void setLastQueriedDate(String lastQueriedDate) {
    this.lastQueriedDate = lastQueriedDate;
  }

 /**
  * getLastQueriedDate method.
  *
  * @return String
  */
  public String getLastQueriedDate() {
    return this.lastQueriedDate;
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
  * setPowerformids method.
  */
  public void setPowerformids(String powerformids) {
    this.powerformids = powerformids;
  }

 /**
  * getPowerformids method.
  *
  * @return String
  */
  public String getPowerformids() {
    return this.powerformids;
  }
  
 /**
  * setQueryBudget method.
  */
  public void setQueryBudget(String queryBudget) {
    this.queryBudget = queryBudget;
  }

 /**
  * getQueryBudget method.
  *
  * @return String
  */
  public String getQueryBudget() {
    return this.queryBudget;
  }
  
 /**
  * setRequesterDateFormat method.
  */
  public void setRequesterDateFormat(String requesterDateFormat) {
    this.requesterDateFormat = requesterDateFormat;
  }

 /**
  * getRequesterDateFormat method.
  *
  * @return String
  */
  public String getRequesterDateFormat() {
    return this.requesterDateFormat;
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
  * setStatus method.
  */
  public void setStatus(String status) {
    this.status = status;
  }

 /**
  * getStatus method.
  *
  * @return String
  */
  public String getStatus() {
    return this.status;
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
  * setTransactionIds method.
  */
  public void setTransactionIds(String transactionIds) {
    this.transactionIds = transactionIds;
  }

 /**
  * getTransactionIds method.
  *
  * @return String
  */
  public String getTransactionIds() {
    return this.transactionIds;
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
  
 /**
  * setUserName method.
  */
  public void setUserName(String userName) {
    this.userName = userName;
  }

 /**
  * getUserName method.
  *
  * @return String
  */
  public String getUserName() {
    return this.userName;
  }
  }

   /**
   * Gets status changes for one or more envelopes..
   * Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.  ### Important: Unless you are requesting the status for specific envelopes (using the &#x60;envelopeIds&#x60; or &#x60;transactionIds&#x60; properties), you must add a set the &#x60;from_date&#x60; property in the request.  Getting envelope status using &#x60;transactionIds&#x60; is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.  ### Request Envelope Status Notes ###  The REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (&#x60;from_to_status&#x60;) set to &#x60;Delivered&#x60; &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.  To avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.  For example, a request with a status qualifier (from_to_status) of &#x60;Delivered&#x60; and a status of \&quot;&#x60;Created&#x60;,&#x60;Sent&#x60;\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of &#x60;Created&#x60; or &#x60;Sent&#x60;, and since an envelope that has been delivered can never have a status of &#x60;Created&#x60; or &#x60;Sent&#x60;, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.  Client applications should check that the statuses they are requesting make sense for a given status qualifier.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return EnvelopesInformation
   */ 
  public EnvelopesInformation listStatusChanges(String accountId) throws ApiException {
    return listStatusChanges(accountId, null);
  }

  /**
   * Gets status changes for one or more envelopes..
   * Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.  ### Important: Unless you are requesting the status for specific envelopes (using the &#x60;envelopeIds&#x60; or &#x60;transactionIds&#x60; properties), you must add a set the &#x60;from_date&#x60; property in the request.  Getting envelope status using &#x60;transactionIds&#x60; is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.  ### Request Envelope Status Notes ###  The REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (&#x60;from_to_status&#x60;) set to &#x60;Delivered&#x60; &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.  To avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.  For example, a request with a status qualifier (from_to_status) of &#x60;Delivered&#x60; and a status of \&quot;&#x60;Created&#x60;,&#x60;Sent&#x60;\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of &#x60;Created&#x60; or &#x60;Sent&#x60;, and since an envelope that has been delivered can never have a status of &#x60;Created&#x60; or &#x60;Sent&#x60;, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.  Client applications should check that the statuses they are requesting make sense for a given status qualifier.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopesInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopesInformation listStatusChanges(String accountId, EnvelopesApi.ListStatusChangesOptions options) throws ApiException {
    ApiResponse<EnvelopesInformation> localVarResponse = listStatusChangesWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets status changes for one or more envelopes.
   * Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.  ### Important: Unless you are requesting the status for specific envelopes (using the &#x60;envelopeIds&#x60; or &#x60;transactionIds&#x60; properties), you must add a set the &#x60;from_date&#x60; property in the request.  Getting envelope status using &#x60;transactionIds&#x60; is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.  ### Request Envelope Status Notes ###  The REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (&#x60;from_to_status&#x60;) set to &#x60;Delivered&#x60; &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.  To avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.  For example, a request with a status qualifier (from_to_status) of &#x60;Delivered&#x60; and a status of \&quot;&#x60;Created&#x60;,&#x60;Sent&#x60;\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of &#x60;Created&#x60; or &#x60;Sent&#x60;, and since an envelope that has been delivered can never have a status of &#x60;Created&#x60; or &#x60;Sent&#x60;, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.  Client applications should check that the statuses they are requesting make sense for a given status qualifier.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopesInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopesInformation > listStatusChangesWithHttpInfo(String accountId, EnvelopesApi.ListStatusChangesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listStatusChanges");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("ac_status", options.acStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("block", options.block));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("cdse_mode", options.cdseMode));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("continuation_token", options.continuationToken));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("custom_field", options.customField));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email", options.email));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("envelope_ids", options.envelopeIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("exclude", options.exclude));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("folder_ids", options.folderIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("folder_types", options.folderTypes));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_to_status", options.fromToStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_purge_information", options.includePurgeInformation));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("intersecting_folder_ids", options.intersectingFolderIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("last_queried_date", options.lastQueriedDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order", options.order));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order_by", options.orderBy));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("powerformids", options.powerformids));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("query_budget", options.queryBudget));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("requester_date_format", options.requesterDateFormat));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_text", options.searchText));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("transaction_ids", options.transactionIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_filter", options.userFilter));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_id", options.userId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_name", options.userName));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<EnvelopesInformation> localVarReturnType = new GenericType<EnvelopesInformation>() {};
    EnvelopesInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopesInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the tabs information for a signer or sign-in-person recipient in an envelope. Retrieves information about the tabs associated with a recipient in a draft envelope.
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
   * Gets the tabs information for a signer or sign-in-person recipient in an envelope..
   * Retrieves information about the tabs associated with a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return Tabs
   */ 
  public Tabs listTabs(String accountId, String envelopeId, String recipientId) throws ApiException {
    return listTabs(accountId, envelopeId, recipientId, null);
  }

  /**
   * Gets the tabs information for a signer or sign-in-person recipient in an envelope..
   * Retrieves information about the tabs associated with a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs listTabs(String accountId, String envelopeId, String recipientId, EnvelopesApi.ListTabsOptions options) throws ApiException {
    ApiResponse<Tabs> localVarResponse = listTabsWithHttpInfo(accountId, envelopeId, recipientId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the tabs information for a signer or sign-in-person recipient in an envelope.
   * Retrieves information about the tabs associated with a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > listTabsWithHttpInfo(String accountId, String envelopeId, String recipientId, EnvelopesApi.ListTabsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
  /// Get List of Templates used in an Envelope This returns a list of the server-side templates, their name and ID, used in an envelope. 
  /// </summary>

 /**
  * ListTemplatesOptions Class.
  *
  **/
  public class ListTemplatesOptions
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
   * Get List of Templates used in an Envelope.
   * This returns a list of the server-side templates, their name and ID, used in an envelope. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return TemplateInformation
   */ 
  public TemplateInformation listTemplates(String accountId, String envelopeId) throws ApiException {
    return listTemplates(accountId, envelopeId, null);
  }

  /**
   * Get List of Templates used in an Envelope.
   * This returns a list of the server-side templates, their name and ID, used in an envelope. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return TemplateInformation
   * @throws ApiException if fails to make API call
   */
  public TemplateInformation listTemplates(String accountId, String envelopeId, EnvelopesApi.ListTemplatesOptions options) throws ApiException {
    ApiResponse<TemplateInformation> localVarResponse = listTemplatesWithHttpInfo(accountId, envelopeId, options);
    return localVarResponse.getData();
  }

  /**
   * Get List of Templates used in an Envelope
   * This returns a list of the server-side templates, their name and ID, used in an envelope. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return TemplateInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TemplateInformation > listTemplatesWithHttpInfo(String accountId, String envelopeId, EnvelopesApi.ListTemplatesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTemplates");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<TemplateInformation> localVarReturnType = new GenericType<TemplateInformation>() {};
    TemplateInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TemplateInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the templates associated with a document in an existing envelope. Retrieves the templates associated with a document in the specified envelope.
  /// </summary>

 /**
  * ListTemplatesForDocumentOptions Class.
  *
  **/
  public class ListTemplatesForDocumentOptions
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
   * Gets the templates associated with a document in an existing envelope..
   * Retrieves the templates associated with a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return TemplateInformation
   */ 
  public TemplateInformation listTemplatesForDocument(String accountId, String envelopeId, String documentId) throws ApiException {
    return listTemplatesForDocument(accountId, envelopeId, documentId, null);
  }

  /**
   * Gets the templates associated with a document in an existing envelope..
   * Retrieves the templates associated with a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return TemplateInformation
   * @throws ApiException if fails to make API call
   */
  public TemplateInformation listTemplatesForDocument(String accountId, String envelopeId, String documentId, EnvelopesApi.ListTemplatesForDocumentOptions options) throws ApiException {
    ApiResponse<TemplateInformation> localVarResponse = listTemplatesForDocumentWithHttpInfo(accountId, envelopeId, documentId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the templates associated with a document in an existing envelope.
   * Retrieves the templates associated with a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return TemplateInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TemplateInformation > listTemplatesForDocumentWithHttpInfo(String accountId, String envelopeId, String documentId, EnvelopesApi.ListTemplatesForDocumentOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    
    GenericType<TemplateInformation> localVarReturnType = new GenericType<TemplateInformation>() {};
    TemplateInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TemplateInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Add an attachment to a DRAFT or IN-PROCESS envelope..
   * Adds an attachment to a draft or in-process envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param attachmentId  (required)
   * @param attachment  (optional)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeAttachmentsResult putAttachment(String accountId, String envelopeId, String attachmentId, Attachment attachment) throws ApiException {
    ApiResponse<EnvelopeAttachmentsResult> localVarResponse = putAttachmentWithHttpInfo(accountId, envelopeId, attachmentId, attachment);
    return localVarResponse.getData();
  }

  /**
   * Add an attachment to a DRAFT or IN-PROCESS envelope.
   * Adds an attachment to a draft or in-process envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param attachmentId  (required)
   * @param attachment  (optional)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeAttachmentsResult > putAttachmentWithHttpInfo(String accountId, String envelopeId, String attachmentId, Attachment attachment) throws ApiException {
    Object localVarPostBody = attachment;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling putAttachment");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling putAttachment");
    }
    
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling putAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/attachments/{attachmentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

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
    
    GenericType<EnvelopeAttachmentsResult> localVarReturnType = new GenericType<EnvelopeAttachmentsResult>() {};
    EnvelopeAttachmentsResult localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeAttachmentsResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Add one or more attachments to a DRAFT or IN-PROCESS envelope..
   * Adds one or more attachments to a draft or in-process envelope.  Envelope attachments are files that an application can include in an envelope. They are not converted to PDF. Envelope attachments are available only through the API. There is no user interface in the DocuSign web application for them.  For a list of supported file formats, see [Supported File Formats](https://support.docusign.com/guides/ndse-user-guide-supported-file-formats).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeAttachmentsRequest  (optional)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeAttachmentsResult putAttachments(String accountId, String envelopeId, EnvelopeAttachmentsRequest envelopeAttachmentsRequest) throws ApiException {
    ApiResponse<EnvelopeAttachmentsResult> localVarResponse = putAttachmentsWithHttpInfo(accountId, envelopeId, envelopeAttachmentsRequest);
    return localVarResponse.getData();
  }

  /**
   * Add one or more attachments to a DRAFT or IN-PROCESS envelope.
   * Adds one or more attachments to a draft or in-process envelope.  Envelope attachments are files that an application can include in an envelope. They are not converted to PDF. Envelope attachments are available only through the API. There is no user interface in the DocuSign web application for them.  For a list of supported file formats, see [Supported File Formats](https://support.docusign.com/guides/ndse-user-guide-supported-file-formats).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeAttachmentsRequest  (optional)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeAttachmentsResult > putAttachmentsWithHttpInfo(String accountId, String envelopeId, EnvelopeAttachmentsRequest envelopeAttachmentsRequest) throws ApiException {
    Object localVarPostBody = envelopeAttachmentsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling putAttachments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling putAttachments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/attachments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<EnvelopeAttachmentsResult> localVarReturnType = new GenericType<EnvelopeAttachmentsResult>() {};
    EnvelopeAttachmentsResult localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeAttachmentsResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Rotates page image from an envelope for display..
   * Rotates page image from an envelope for display. The page image can be rotated to the left or right.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param pageRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public void rotateDocumentPage(String accountId, String envelopeId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
    rotateDocumentPageWithHttpInfo(accountId, envelopeId, documentId, pageNumber, pageRequest);
  }

  /**
   * Rotates page image from an envelope for display.
   * Rotates page image from an envelope for display. The page image can be rotated to the left or right.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param pageRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> rotateDocumentPageWithHttpInfo(String accountId, String envelopeId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
    Object localVarPostBody = pageRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling rotateDocumentPage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling rotateDocumentPage");
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}/page_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
  /// <summary>
  /// Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft The Put Envelopes endpoint provides the following functionality:  * Sends the specified single draft envelope. Add {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.  * Voids the specified in-process envelope. Add {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.  * Replaces the current email subject and message for a draft envelope. Add {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.  * Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system. Add {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.  *Additional information on purging documents*  The purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).  ###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period.  ###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents.  ###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.  When the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.  If &#x60;purgeState&#x3D;\&quot;documents_queued\&quot;&#x60; is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If &#x60;purgeState&#x3D; \&quot;documents_and_metadata_queued\&quot;&#x60; is used in the request, then the documents, attachments, and tabs are deleted.
  /// </summary>

 /**
  * UpdateOptions Class.
  *
  **/
  public class UpdateOptions
  {
  private String advancedUpdate = null;
  private String resendEnvelope = null;
  
 /**
  * setAdvancedUpdate method.
  */
  public void setAdvancedUpdate(String advancedUpdate) {
    this.advancedUpdate = advancedUpdate;
  }

 /**
  * getAdvancedUpdate method.
  *
  * @return String
  */
  public String getAdvancedUpdate() {
    return this.advancedUpdate;
  }
  
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
   * Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft.
   * The Put Envelopes endpoint provides the following functionality:  * Sends the specified single draft envelope. Add {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.  * Voids the specified in-process envelope. Add {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.  * Replaces the current email subject and message for a draft envelope. Add {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.  * Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system. Add {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.  *Additional information on purging documents*  The purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).  ###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period.  ###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents.  ###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.  When the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.  If &#x60;purgeState&#x3D;\&quot;documents_queued\&quot;&#x60; is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If &#x60;purgeState&#x3D; \&quot;documents_and_metadata_queued\&quot;&#x60; is used in the request, then the documents, attachments, and tabs are deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelope  (optional)
   * @return EnvelopeUpdateSummary
   */ 
  public EnvelopeUpdateSummary update(String accountId, String envelopeId, Envelope envelope) throws ApiException {
    return update(accountId, envelopeId, envelope, null);
  }

  /**
   * Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft.
   * The Put Envelopes endpoint provides the following functionality:  * Sends the specified single draft envelope. Add {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.  * Voids the specified in-process envelope. Add {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.  * Replaces the current email subject and message for a draft envelope. Add {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.  * Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system. Add {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.  *Additional information on purging documents*  The purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).  ###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period.  ###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents.  ###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.  When the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.  If &#x60;purgeState&#x3D;\&quot;documents_queued\&quot;&#x60; is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If &#x60;purgeState&#x3D; \&quot;documents_and_metadata_queued\&quot;&#x60; is used in the request, then the documents, attachments, and tabs are deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelope  (optional)
   * @param options for modifying the method behavior.
   * @return EnvelopeUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public EnvelopeUpdateSummary update(String accountId, String envelopeId, Envelope envelope, EnvelopesApi.UpdateOptions options) throws ApiException {
    ApiResponse<EnvelopeUpdateSummary> localVarResponse = updateWithHttpInfo(accountId, envelopeId, envelope, options);
    return localVarResponse.getData();
  }

  /**
   * Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft
   * The Put Envelopes endpoint provides the following functionality:  * Sends the specified single draft envelope. Add {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.  * Voids the specified in-process envelope. Add {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.  * Replaces the current email subject and message for a draft envelope. Add {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.  * Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system. Add {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.  *Additional information on purging documents*  The purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).  ###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period.  ###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents.  ###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.  When the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.  If &#x60;purgeState&#x3D;\&quot;documents_queued\&quot;&#x60; is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If &#x60;purgeState&#x3D; \&quot;documents_and_metadata_queued\&quot;&#x60; is used in the request, then the documents, attachments, and tabs are deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelope  (optional)
   * @param options for modifying the method behavior.
   * @return EnvelopeUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeUpdateSummary > updateWithHttpInfo(String accountId, String envelopeId, Envelope envelope, EnvelopesApi.UpdateOptions options) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("advanced_update", options.advancedUpdate));
    }if (options != null) {
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
    
    GenericType<EnvelopeUpdateSummary> localVarReturnType = new GenericType<EnvelopeUpdateSummary>() {};
    EnvelopeUpdateSummary localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeUpdateSummary>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Integrity-Check and Commit a ChunkedUpload, readying it for use elsewhere. This method checks the integrity of a chunked upload and then commits it. When this request is successful, the chunked upload is then ready to be referenced in other API calls.  If the request is unsuccessful, ensure that you have uploaded all of the parts by using the Update method.  **Note:** After you commit a chunked upload, it no longer accepts additional parts.
  /// </summary>

 /**
  * UpdateChunkedUploadOptions Class.
  *
  **/
  public class UpdateChunkedUploadOptions
  {
  private String action = null;
  
 /**
  * setAction method.
  */
  public void setAction(String action) {
    this.action = action;
  }

 /**
  * getAction method.
  *
  * @return String
  */
  public String getAction() {
    return this.action;
  }
  }

   /**
   * Integrity-Check and Commit a ChunkedUpload, readying it for use elsewhere..
   * This method checks the integrity of a chunked upload and then commits it. When this request is successful, the chunked upload is then ready to be referenced in other API calls.  If the request is unsuccessful, ensure that you have uploaded all of the parts by using the Update method.  **Note:** After you commit a chunked upload, it no longer accepts additional parts.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @return ChunkedUploadResponse
   */ 
  public ChunkedUploadResponse updateChunkedUpload(String accountId, String chunkedUploadId) throws ApiException {
    return updateChunkedUpload(accountId, chunkedUploadId, null);
  }

  /**
   * Integrity-Check and Commit a ChunkedUpload, readying it for use elsewhere..
   * This method checks the integrity of a chunked upload and then commits it. When this request is successful, the chunked upload is then ready to be referenced in other API calls.  If the request is unsuccessful, ensure that you have uploaded all of the parts by using the Update method.  **Note:** After you commit a chunked upload, it no longer accepts additional parts.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @param options for modifying the method behavior.
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadResponse updateChunkedUpload(String accountId, String chunkedUploadId, EnvelopesApi.UpdateChunkedUploadOptions options) throws ApiException {
    ApiResponse<ChunkedUploadResponse> localVarResponse = updateChunkedUploadWithHttpInfo(accountId, chunkedUploadId, options);
    return localVarResponse.getData();
  }

  /**
   * Integrity-Check and Commit a ChunkedUpload, readying it for use elsewhere.
   * This method checks the integrity of a chunked upload and then commits it. When this request is successful, the chunked upload is then ready to be referenced in other API calls.  If the request is unsuccessful, ensure that you have uploaded all of the parts by using the Update method.  **Note:** After you commit a chunked upload, it no longer accepts additional parts.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @param options for modifying the method behavior.
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChunkedUploadResponse > updateChunkedUploadWithHttpInfo(String accountId, String chunkedUploadId, EnvelopesApi.UpdateChunkedUploadOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateChunkedUpload");
    }
    
    // verify the required parameter 'chunkedUploadId' is set
    if (chunkedUploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling updateChunkedUpload");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("action", options.action));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ChunkedUploadResponse> localVarReturnType = new GenericType<ChunkedUploadResponse>() {};
    ChunkedUploadResponse localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ChunkedUploadResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Add a chunk, a chunk &#39;part&#39;, to an existing ChunkedUpload..
   * Adds a chunk or part to an existing chunked upload. After you use the Create method to initiate a new chunked upload and upload the first part,  use this method to upload subsequent parts.  For simplicity, DocuSign recommends that you upload the parts in their sequential order ( 1,2, 3, 4, etc.). The Create method adds the first part and assigns it the &#x60;sequence&#x60; value &#x60;0&#x60;. As a result, DocuSign recommends that you start with a &#x60;sequence&#x60; value of &#x60;1&#x60; when you use this method, and continue uploading parts contiguously until you have uploaded the entirety of the original content to DocuSign.  Example:   &#x60;&#x60;&#x60; PUT /v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}/1 PUT /v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}/2 PUT /v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}/3 &#x60;&#x60;&#x60;  **Note:** You cannot replace a part that DocuSign has already received, or add parts to a chunked upload that is already successfully committed.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @param chunkedUploadPartSeq  (required)
   * @param chunkedUploadRequest  (optional)
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadResponse updateChunkedUploadPart(String accountId, String chunkedUploadId, String chunkedUploadPartSeq, ChunkedUploadRequest chunkedUploadRequest) throws ApiException {
    ApiResponse<ChunkedUploadResponse> localVarResponse = updateChunkedUploadPartWithHttpInfo(accountId, chunkedUploadId, chunkedUploadPartSeq, chunkedUploadRequest);
    return localVarResponse.getData();
  }

  /**
   * Add a chunk, a chunk &#39;part&#39;, to an existing ChunkedUpload.
   * Adds a chunk or part to an existing chunked upload. After you use the Create method to initiate a new chunked upload and upload the first part,  use this method to upload subsequent parts.  For simplicity, DocuSign recommends that you upload the parts in their sequential order ( 1,2, 3, 4, etc.). The Create method adds the first part and assigns it the &#x60;sequence&#x60; value &#x60;0&#x60;. As a result, DocuSign recommends that you start with a &#x60;sequence&#x60; value of &#x60;1&#x60; when you use this method, and continue uploading parts contiguously until you have uploaded the entirety of the original content to DocuSign.  Example:   &#x60;&#x60;&#x60; PUT /v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}/1 PUT /v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}/2 PUT /v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}/3 &#x60;&#x60;&#x60;  **Note:** You cannot replace a part that DocuSign has already received, or add parts to a chunked upload that is already successfully committed.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @param chunkedUploadPartSeq  (required)
   * @param chunkedUploadRequest  (optional)
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChunkedUploadResponse > updateChunkedUploadPartWithHttpInfo(String accountId, String chunkedUploadId, String chunkedUploadPartSeq, ChunkedUploadRequest chunkedUploadRequest) throws ApiException {
    Object localVarPostBody = chunkedUploadRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateChunkedUploadPart");
    }
    
    // verify the required parameter 'chunkedUploadId' is set
    if (chunkedUploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling updateChunkedUploadPart");
    }
    
    // verify the required parameter 'chunkedUploadPartSeq' is set
    if (chunkedUploadPartSeq == null) {
      throw new ApiException(400, "Missing the required parameter 'chunkedUploadPartSeq' when calling updateChunkedUploadPart");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}/{chunkedUploadPartSeq}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()))
      .replaceAll("\\{" + "chunkedUploadPartSeq" + "\\}", apiClient.escapeString(chunkedUploadPartSeq.toString()));

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
    
    GenericType<ChunkedUploadResponse> localVarReturnType = new GenericType<ChunkedUploadResponse>() {};
    ChunkedUploadResponse localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ChunkedUploadResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates envelope custom fields in an envelope..
   * Updates the envelope custom fields in draft and in-process envelopes.  Each custom field used in an envelope must have a unique name. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param customFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields updateCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
    ApiResponse<CustomFields> localVarResponse = updateCustomFieldsWithHttpInfo(accountId, envelopeId, customFields);
    return localVarResponse.getData();
  }

  /**
   * Updates envelope custom fields in an envelope.
   * Updates the envelope custom fields in draft and in-process envelopes.  Each custom field used in an envelope must have a unique name. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param customFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomFields > updateCustomFieldsWithHttpInfo(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

  /**
   * Adds a document to an existing draft envelope..
   * Adds a document to an existing draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFileBytes Updated document content. (required)
   * @return EnvelopeDocument
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocument updateDocument(String accountId, String envelopeId, String documentId, byte[] documentFileBytes) throws ApiException {
    ApiResponse<EnvelopeDocument> localVarResponse = updateDocumentWithHttpInfo(accountId, envelopeId, documentId, documentFileBytes);
    return localVarResponse.getData();
  }

  /**
   * Adds a document to an existing draft envelope.
   * Adds a document to an existing draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFileBytes Updated document content. (required)
   * @return EnvelopeDocument
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeDocument > updateDocumentWithHttpInfo(String accountId, String envelopeId, String documentId, byte[] documentFileBytes) throws ApiException {
    Object localVarPostBody = documentFileBytes;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocument");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocument");
    }
    
    // verify the required parameter 'documentFileBytes' is set
    if (documentFileBytes == null) {
      throw new ApiException(400, "Missing the required parameter 'documentFileBytes' when calling updateDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
      "application/pdf"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<EnvelopeDocument> localVarReturnType = new GenericType<EnvelopeDocument>() {};
    EnvelopeDocument localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeDocument>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates existing custom document fields in an existing envelope document..
   * Updates existing custom document fields in an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation updateDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    ApiResponse<DocumentFieldsInformation> localVarResponse = updateDocumentFieldsWithHttpInfo(accountId, envelopeId, documentId, documentFieldsInformation);
    return localVarResponse.getData();
  }

  /**
   * Updates existing custom document fields in an existing envelope document.
   * Updates existing custom document fields in an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentFieldsInformation > updateDocumentFieldsWithHttpInfo(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Updates the tabs for an envelope document.
   * Updates tabs in the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs updateDocumentTabs(String accountId, String envelopeId, String documentId, Tabs tabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = updateDocumentTabsWithHttpInfo(accountId, envelopeId, documentId, tabs);
    return localVarResponse.getData();
  }

  /**
   * Updates the tabs for an envelope document
   * Updates tabs in the document specified by &#x60;documentId&#x60; in the envelope specified by &#x60;envelopeId&#x60;. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > updateDocumentTabsWithHttpInfo(String accountId, String envelopeId, String documentId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocumentTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Adds one or more documents to an existing envelope document..
   * Adds one or more documents to an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocumentsResult updateDocuments(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    ApiResponse<EnvelopeDocumentsResult> localVarResponse = updateDocumentsWithHttpInfo(accountId, envelopeId, envelopeDefinition);
    return localVarResponse.getData();
  }

  /**
   * Adds one or more documents to an existing envelope document.
   * Adds one or more documents to an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeDocumentsResult > updateDocumentsWithHttpInfo(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<EnvelopeDocumentsResult> localVarReturnType = new GenericType<EnvelopeDocumentsResult>() {};
    EnvelopeDocumentsResult localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeDocumentsResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the email setting overrides for an envelope..
   * Updates the existing email override settings for the specified envelope. Note that modifying email settings will only affect email communications that occur after the modification was made.  This can also be used to delete an individual email override setting by using an empty string for the value to be deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param emailSettings  (optional)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings updateEmailSettings(String accountId, String envelopeId, EmailSettings emailSettings) throws ApiException {
    ApiResponse<EmailSettings> localVarResponse = updateEmailSettingsWithHttpInfo(accountId, envelopeId, emailSettings);
    return localVarResponse.getData();
  }

  /**
   * Updates the email setting overrides for an envelope.
   * Updates the existing email override settings for the specified envelope. Note that modifying email settings will only affect email communications that occur after the modification was made.  This can also be used to delete an individual email override setting by using an empty string for the value to be deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param emailSettings  (optional)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailSettings > updateEmailSettingsWithHttpInfo(String accountId, String envelopeId, EmailSettings emailSettings) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/email_settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    EmailSettings localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EmailSettings>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the delayed routing rules for an envelope&#39;s workflow step definition..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @param delayedRouting  (optional)
   * @return DelayedRouting
   * @throws ApiException if fails to make API call
   */
  public DelayedRouting updateEnvelopeDelayedRoutingDefinition(String accountId, String envelopeId, String workflowStepId, DelayedRouting delayedRouting) throws ApiException {
    ApiResponse<DelayedRouting> localVarResponse = updateEnvelopeDelayedRoutingDefinitionWithHttpInfo(accountId, envelopeId, workflowStepId, delayedRouting);
    return localVarResponse.getData();
  }

  /**
   * Updates the delayed routing rules for an envelope&#39;s workflow step definition.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @param delayedRouting  (optional)
   * @return DelayedRouting
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DelayedRouting > updateEnvelopeDelayedRoutingDefinitionWithHttpInfo(String accountId, String envelopeId, String workflowStepId, DelayedRouting delayedRouting) throws ApiException {
    Object localVarPostBody = delayedRouting;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopeDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateEnvelopeDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling updateEnvelopeDelayedRoutingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow/steps/{workflowStepId}/delayedRouting"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
    
    GenericType<DelayedRouting> localVarReturnType = new GenericType<DelayedRouting>() {};
    DelayedRouting localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DelayedRouting>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the scheduled sending rules for an envelope&#39;s workflow definition..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param scheduledSending  (optional)
   * @return ScheduledSending
   * @throws ApiException if fails to make API call
   */
  public ScheduledSending updateEnvelopeScheduledSendingDefinition(String accountId, String envelopeId, ScheduledSending scheduledSending) throws ApiException {
    ApiResponse<ScheduledSending> localVarResponse = updateEnvelopeScheduledSendingDefinitionWithHttpInfo(accountId, envelopeId, scheduledSending);
    return localVarResponse.getData();
  }

  /**
   * Updates the scheduled sending rules for an envelope&#39;s workflow definition.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param scheduledSending  (optional)
   * @return ScheduledSending
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ScheduledSending > updateEnvelopeScheduledSendingDefinitionWithHttpInfo(String accountId, String envelopeId, ScheduledSending scheduledSending) throws ApiException {
    Object localVarPostBody = scheduledSending;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopeScheduledSendingDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateEnvelopeScheduledSendingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow/scheduledSending"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<ScheduledSending> localVarReturnType = new GenericType<ScheduledSending>() {};
    ScheduledSending localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ScheduledSending>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Update an envelope transfer rule for an account..
   * This method changes the status of an envelope transfer rule. You use this method to change whether or not the rule is enabled.  You must include the &#x60;envelopeTransferRuleId&#x60; both as a query parameter, and in the request body.  **Note:** You cannot change any other information about the envelope transfer rule. Only Administrators can update an envelope transfer rule. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleId  (required)
   * @param envelopeTransferRule  (optional)
   * @return EnvelopeTransferRule
   * @throws ApiException if fails to make API call
   */
  public EnvelopeTransferRule updateEnvelopeTransferRule(String accountId, String envelopeTransferRuleId, EnvelopeTransferRule envelopeTransferRule) throws ApiException {
    ApiResponse<EnvelopeTransferRule> localVarResponse = updateEnvelopeTransferRuleWithHttpInfo(accountId, envelopeTransferRuleId, envelopeTransferRule);
    return localVarResponse.getData();
  }

  /**
   * Update an envelope transfer rule for an account.
   * This method changes the status of an envelope transfer rule. You use this method to change whether or not the rule is enabled.  You must include the &#x60;envelopeTransferRuleId&#x60; both as a query parameter, and in the request body.  **Note:** You cannot change any other information about the envelope transfer rule. Only Administrators can update an envelope transfer rule. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleId  (required)
   * @param envelopeTransferRule  (optional)
   * @return EnvelopeTransferRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeTransferRule > updateEnvelopeTransferRuleWithHttpInfo(String accountId, String envelopeTransferRuleId, EnvelopeTransferRule envelopeTransferRule) throws ApiException {
    Object localVarPostBody = envelopeTransferRule;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopeTransferRule");
    }
    
    // verify the required parameter 'envelopeTransferRuleId' is set
    if (envelopeTransferRuleId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeTransferRuleId' when calling updateEnvelopeTransferRule");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/transfer_rules/{envelopeTransferRuleId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeTransferRuleId" + "\\}", apiClient.escapeString(envelopeTransferRuleId.toString()));

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
    
    GenericType<EnvelopeTransferRule> localVarReturnType = new GenericType<EnvelopeTransferRule>() {};
    EnvelopeTransferRule localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeTransferRule>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Update envelope transfer rules for an account..
   * This method changes the status for one or more envelope transfer rules based on the &#x60;envelopeTransferRuleId&#x60;s in the request body. You use this method to change whether or not the rules are enabled.  **Note:** You cannot change any other information about the envelope transfer rule. Only Administrators can update envelope transfer rules. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleInformation  (optional)
   * @return EnvelopeTransferRuleInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopeTransferRuleInformation updateEnvelopeTransferRules(String accountId, EnvelopeTransferRuleInformation envelopeTransferRuleInformation) throws ApiException {
    ApiResponse<EnvelopeTransferRuleInformation> localVarResponse = updateEnvelopeTransferRulesWithHttpInfo(accountId, envelopeTransferRuleInformation);
    return localVarResponse.getData();
  }

  /**
   * Update envelope transfer rules for an account.
   * This method changes the status for one or more envelope transfer rules based on the &#x60;envelopeTransferRuleId&#x60;s in the request body. You use this method to change whether or not the rules are enabled.  **Note:** You cannot change any other information about the envelope transfer rule. Only Administrators can update envelope transfer rules. In addition, to use envelope transfer rules, the **Transfer Custody** feature must be enabled for your account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleInformation  (optional)
   * @return EnvelopeTransferRuleInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnvelopeTransferRuleInformation > updateEnvelopeTransferRulesWithHttpInfo(String accountId, EnvelopeTransferRuleInformation envelopeTransferRuleInformation) throws ApiException {
    Object localVarPostBody = envelopeTransferRuleInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopeTransferRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/transfer_rules"
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
    
    GenericType<EnvelopeTransferRuleInformation> localVarReturnType = new GenericType<EnvelopeTransferRuleInformation>() {};
    EnvelopeTransferRuleInformation localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<EnvelopeTransferRuleInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the envelope workflow definition for an envelope..
   * Updates the specified envelope&#39;s workflow definition if  it has one.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflow  (optional)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public Workflow updateEnvelopeWorkflowDefinition(String accountId, String envelopeId, Workflow workflow) throws ApiException {
    ApiResponse<Workflow> localVarResponse = updateEnvelopeWorkflowDefinitionWithHttpInfo(accountId, envelopeId, workflow);
    return localVarResponse.getData();
  }

  /**
   * Updates the envelope workflow definition for an envelope.
   * Updates the specified envelope&#39;s workflow definition if  it has one.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflow  (optional)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workflow > updateEnvelopeWorkflowDefinitionWithHttpInfo(String accountId, String envelopeId, Workflow workflow) throws ApiException {
    Object localVarPostBody = workflow;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopeWorkflowDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateEnvelopeWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<Workflow> localVarReturnType = new GenericType<Workflow>() {};
    Workflow localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Workflow>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the envelope workflow step definition for an envelope..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @param workflowStep  (optional)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public WorkflowStep updateEnvelopeWorkflowStepDefinition(String accountId, String envelopeId, String workflowStepId, WorkflowStep workflowStep) throws ApiException {
    ApiResponse<WorkflowStep> localVarResponse = updateEnvelopeWorkflowStepDefinitionWithHttpInfo(accountId, envelopeId, workflowStepId, workflowStep);
    return localVarResponse.getData();
  }

  /**
   * Updates the envelope workflow step definition for an envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflowStepId  (required)
   * @param workflowStep  (optional)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkflowStep > updateEnvelopeWorkflowStepDefinitionWithHttpInfo(String accountId, String envelopeId, String workflowStepId, WorkflowStep workflowStep) throws ApiException {
    Object localVarPostBody = workflowStep;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopeWorkflowStepDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateEnvelopeWorkflowStepDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling updateEnvelopeWorkflowStepDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow/steps/{workflowStepId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
    
    GenericType<WorkflowStep> localVarReturnType = new GenericType<WorkflowStep>() {};
    WorkflowStep localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkflowStep>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates an envelope lock..
   * Updates the lock duration time or update the &#x60;lockedByApp&#x60; property information for the specified envelope. The user and integrator key must match the user specified by the &#x60;lockByUser&#x60; property and integrator key information and the &#x60;X-DocuSign-Edit&#x60; header must be included or an error will be generated.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation updateLock(String accountId, String envelopeId, LockRequest lockRequest) throws ApiException {
    ApiResponse<LockInformation> localVarResponse = updateLockWithHttpInfo(accountId, envelopeId, lockRequest);
    return localVarResponse.getData();
  }

  /**
   * Updates an envelope lock.
   * Updates the lock duration time or update the &#x60;lockedByApp&#x60; property information for the specified envelope. The user and integrator key must match the user specified by the &#x60;lockByUser&#x60; property and integrator key information and the &#x60;X-DocuSign-Edit&#x60; header must be included or an error will be generated.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LockInformation > updateLockWithHttpInfo(String accountId, String envelopeId, LockRequest lockRequest) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Sets envelope notification (Reminders/Expirations) structure for an existing envelope..
   * This method sets the notifications (reminders and expirations) for an existing envelope. The request body sends a structure containing reminders and expirations settings. It also specifies whether to use the settings specified in the request, or the account default notification settings for the envelope.  Note that this request only specifies when notifications are sent; it does not initiate sending of email messages.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeNotificationRequest  (optional)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public Notification updateNotificationSettings(String accountId, String envelopeId, EnvelopeNotificationRequest envelopeNotificationRequest) throws ApiException {
    ApiResponse<Notification> localVarResponse = updateNotificationSettingsWithHttpInfo(accountId, envelopeId, envelopeNotificationRequest);
    return localVarResponse.getData();
  }

  /**
   * Sets envelope notification (Reminders/Expirations) structure for an existing envelope.
   * This method sets the notifications (reminders and expirations) for an existing envelope. The request body sends a structure containing reminders and expirations settings. It also specifies whether to use the settings specified in the request, or the account default notification settings for the envelope.  Note that this request only specifies when notifications are sent; it does not initiate sending of email messages.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeNotificationRequest  (optional)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Notification > updateNotificationSettingsWithHttpInfo(String accountId, String envelopeId, EnvelopeNotificationRequest envelopeNotificationRequest) throws ApiException {
    Object localVarPostBody = envelopeNotificationRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateNotificationSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateNotificationSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/notification"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

  /**
   * Updates document visibility for the recipients.
   * This method updates document visibility for a recipient.  **Note:** A document cannot be hidden from a recipient if the recipient has tabs assigned to them on the document. Carbon Copy, Certified Delivery (Needs to Sign), Editor, and Agent recipients can always see all documents.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param documentVisibilityList  (optional)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public DocumentVisibilityList updateRecipientDocumentVisibility(String accountId, String envelopeId, String recipientId, DocumentVisibilityList documentVisibilityList) throws ApiException {
    ApiResponse<DocumentVisibilityList> localVarResponse = updateRecipientDocumentVisibilityWithHttpInfo(accountId, envelopeId, recipientId, documentVisibilityList);
    return localVarResponse.getData();
  }

  /**
   * Updates document visibility for the recipients
   * This method updates document visibility for a recipient.  **Note:** A document cannot be hidden from a recipient if the recipient has tabs assigned to them on the document. Carbon Copy, Certified Delivery (Needs to Sign), Editor, and Agent recipients can always see all documents.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param documentVisibilityList  (optional)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentVisibilityList > updateRecipientDocumentVisibilityWithHttpInfo(String accountId, String envelopeId, String recipientId, DocumentVisibilityList documentVisibilityList) throws ApiException {
    Object localVarPostBody = documentVisibilityList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateRecipientDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/document_visibility"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
    
    GenericType<DocumentVisibilityList> localVarReturnType = new GenericType<DocumentVisibilityList>() {};
    DocumentVisibilityList localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentVisibilityList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Sets the initials image for an accountless signer..
   * Updates the initials image for a signer that does not have a DocuSign account. The supported image formats for this file are: gif, png, jpeg, and bmp. The file size must be less than 200K.  For the Authentication/Authorization for this call, the credentials must match the sender of the envelope, the recipient must be an accountless signer or in person signer. The account must have the &#x60;CanSendEnvelope&#x60; property set to **true** and the &#x60;ExpressSendOnly&#x60; property in &#x60;SendingUser&#x60; structure must be set to **false**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateRecipientInitialsImage(String accountId, String envelopeId, String recipientId) throws ApiException {
    updateRecipientInitialsImageWithHttpInfo(accountId, envelopeId, recipientId);
  }

  /**
   * Sets the initials image for an accountless signer.
   * Updates the initials image for a signer that does not have a DocuSign account. The supported image formats for this file are: gif, png, jpeg, and bmp. The file size must be less than 200K.  For the Authentication/Authorization for this call, the credentials must match the sender of the envelope, the recipient must be an accountless signer or in person signer. The account must have the &#x60;CanSendEnvelope&#x60; property set to **true** and the &#x60;ExpressSendOnly&#x60; property in &#x60;SendingUser&#x60; structure must be set to **false**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> updateRecipientInitialsImageWithHttpInfo(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientInitialsImage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientInitialsImage");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateRecipientInitialsImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/initials_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
      "image/gif"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Sets the signature image for an accountless signer..
   * Updates the signature image for an accountless signer. The supported image formats for this file are: gif, png, jpeg, and bmp. The file size must be less than 200K.  For the Authentication/Authorization for this call, the credentials must match the sender of the envelope, the recipient must be an accountless signer or in person signer. The account must have the &#x60;CanSendEnvelope&#x60; property set to **true** and the &#x60;ExpressSendOnly&#x60; property in &#x60;SendingUser&#x60; structure must be set to **false**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateRecipientSignatureImage(String accountId, String envelopeId, String recipientId) throws ApiException {
    updateRecipientSignatureImageWithHttpInfo(accountId, envelopeId, recipientId);
  }

  /**
   * Sets the signature image for an accountless signer.
   * Updates the signature image for an accountless signer. The supported image formats for this file are: gif, png, jpeg, and bmp. The file size must be less than 200K.  For the Authentication/Authorization for this call, the credentials must match the sender of the envelope, the recipient must be an accountless signer or in person signer. The account must have the &#x60;CanSendEnvelope&#x60; property set to **true** and the &#x60;ExpressSendOnly&#x60; property in &#x60;SendingUser&#x60; structure must be set to **false**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> updateRecipientSignatureImageWithHttpInfo(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientSignatureImage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientSignatureImage");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateRecipientSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
      "image/gif"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }
  /// <summary>
  /// Updates recipients in a draft envelope or corrects recipient information for an in process envelope. Updates recipients in a draft envelope or corrects recipient information for an in process envelope.   For draft envelopes, you can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.  Once an envelope has been sent, you can only edit: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;signerName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, and &#x60;deliveryMethod&#x60;. You can also select to resend an envelope by using the &#x60;resend_envelope&#x60; option.  If you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
  /// </summary>

 /**
  * UpdateRecipientsOptions Class.
  *
  **/
  public class UpdateRecipientsOptions
  {
  private String combineSameOrderRecipients = null;
  private String offlineSigning = null;
  private String resendEnvelope = null;
  
 /**
  * setCombineSameOrderRecipients method.
  */
  public void setCombineSameOrderRecipients(String combineSameOrderRecipients) {
    this.combineSameOrderRecipients = combineSameOrderRecipients;
  }

 /**
  * getCombineSameOrderRecipients method.
  *
  * @return String
  */
  public String getCombineSameOrderRecipients() {
    return this.combineSameOrderRecipients;
  }
  
 /**
  * setOfflineSigning method.
  */
  public void setOfflineSigning(String offlineSigning) {
    this.offlineSigning = offlineSigning;
  }

 /**
  * getOfflineSigning method.
  *
  * @return String
  */
  public String getOfflineSigning() {
    return this.offlineSigning;
  }
  
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
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope..
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.   For draft envelopes, you can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.  Once an envelope has been sent, you can only edit: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;signerName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, and &#x60;deliveryMethod&#x60;. You can also select to resend an envelope by using the &#x60;resend_envelope&#x60; option.  If you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @return RecipientsUpdateSummary
   */ 
  public RecipientsUpdateSummary updateRecipients(String accountId, String envelopeId, Recipients recipients) throws ApiException {
    return updateRecipients(accountId, envelopeId, recipients, null);
  }

  /**
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope..
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.   For draft envelopes, you can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.  Once an envelope has been sent, you can only edit: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;signerName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, and &#x60;deliveryMethod&#x60;. You can also select to resend an envelope by using the &#x60;resend_envelope&#x60; option.  If you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @param options for modifying the method behavior.
   * @return RecipientsUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public RecipientsUpdateSummary updateRecipients(String accountId, String envelopeId, Recipients recipients, EnvelopesApi.UpdateRecipientsOptions options) throws ApiException {
    ApiResponse<RecipientsUpdateSummary> localVarResponse = updateRecipientsWithHttpInfo(accountId, envelopeId, recipients, options);
    return localVarResponse.getData();
  }

  /**
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.   For draft envelopes, you can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.  Once an envelope has been sent, you can only edit: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;signerName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, and &#x60;deliveryMethod&#x60;. You can also select to resend an envelope by using the &#x60;resend_envelope&#x60; option.  If you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @param options for modifying the method behavior.
   * @return RecipientsUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RecipientsUpdateSummary > updateRecipientsWithHttpInfo(String accountId, String envelopeId, Recipients recipients, EnvelopesApi.UpdateRecipientsOptions options) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("combine_same_order_recipients", options.combineSameOrderRecipients));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("offline_signing", options.offlineSigning));
    }if (options != null) {
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
   * Updates document visibility for the recipients.
   * This method updates document visibility for one or more recipients based on the &#x60;recipientId&#x60; and &#x60;visible&#x60; values that you include in the request body.  **Note:** A document cannot be hidden from a recipient if the recipient has tabs assigned to them on the document. Carbon Copy, Certified Delivery (Needs to Sign), Editor, and Agent recipients can always see all documents.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentVisibilityList  (optional)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public DocumentVisibilityList updateRecipientsDocumentVisibility(String accountId, String envelopeId, DocumentVisibilityList documentVisibilityList) throws ApiException {
    ApiResponse<DocumentVisibilityList> localVarResponse = updateRecipientsDocumentVisibilityWithHttpInfo(accountId, envelopeId, documentVisibilityList);
    return localVarResponse.getData();
  }

  /**
   * Updates document visibility for the recipients
   * This method updates document visibility for one or more recipients based on the &#x60;recipientId&#x60; and &#x60;visible&#x60; values that you include in the request body.  **Note:** A document cannot be hidden from a recipient if the recipient has tabs assigned to them on the document. Carbon Copy, Certified Delivery (Needs to Sign), Editor, and Agent recipients can always see all documents.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentVisibilityList  (optional)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentVisibilityList > updateRecipientsDocumentVisibilityWithHttpInfo(String accountId, String envelopeId, DocumentVisibilityList documentVisibilityList) throws ApiException {
    Object localVarPostBody = documentVisibilityList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientsDocumentVisibility");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientsDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/document_visibility"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    
    GenericType<DocumentVisibilityList> localVarReturnType = new GenericType<DocumentVisibilityList>() {};
    DocumentVisibilityList localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DocumentVisibilityList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the tabs for a recipient.  .
   * Updates one or more tabs for a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs updateTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
    ApiResponse<Tabs> localVarResponse = updateTabsWithHttpInfo(accountId, envelopeId, recipientId, tabs);
    return localVarResponse.getData();
  }

  /**
   * Updates the tabs for a recipient.  
   * Updates one or more tabs for a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tabs > updateTabsWithHttpInfo(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
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
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
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
   * Update encrypted tabs for envelope..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateTabsBlob(String accountId, String envelopeId) throws ApiException {
    updateTabsBlobWithHttpInfo(accountId, envelopeId);
  }

  /**
   * Update encrypted tabs for envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> updateTabsBlobWithHttpInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTabsBlob");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateTabsBlob");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/tabs_blob"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Updates the delayed routing rules for a template&#39;s workflow step definition..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @param delayedRouting  (optional)
   * @return DelayedRouting
   * @throws ApiException if fails to make API call
   */
  public DelayedRouting updateTemplateDelayedRoutingDefinition(String accountId, String templateId, String workflowStepId, DelayedRouting delayedRouting) throws ApiException {
    ApiResponse<DelayedRouting> localVarResponse = updateTemplateDelayedRoutingDefinitionWithHttpInfo(accountId, templateId, workflowStepId, delayedRouting);
    return localVarResponse.getData();
  }

  /**
   * Updates the delayed routing rules for a template&#39;s workflow step definition.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @param delayedRouting  (optional)
   * @return DelayedRouting
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DelayedRouting > updateTemplateDelayedRoutingDefinitionWithHttpInfo(String accountId, String templateId, String workflowStepId, DelayedRouting delayedRouting) throws ApiException {
    Object localVarPostBody = delayedRouting;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateDelayedRoutingDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling updateTemplateDelayedRoutingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow/steps/{workflowStepId}/delayedRouting"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
    
    GenericType<DelayedRouting> localVarReturnType = new GenericType<DelayedRouting>() {};
    DelayedRouting localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DelayedRouting>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates document visibility for the recipients.
   * This method updates the document visibility for a template recipient.  **Note:** A document cannot be hidden from a recipient if the recipient has tabs assigned to them on the document. Carbon Copy, Certified Delivery (Needs to Sign), Editor, and Agent recipients can always see all documents.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param templateDocumentVisibilityList  (optional)
   * @return TemplateDocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public TemplateDocumentVisibilityList updateTemplateRecipientDocumentVisibility(String accountId, String templateId, String recipientId, TemplateDocumentVisibilityList templateDocumentVisibilityList) throws ApiException {
    ApiResponse<TemplateDocumentVisibilityList> localVarResponse = updateTemplateRecipientDocumentVisibilityWithHttpInfo(accountId, templateId, recipientId, templateDocumentVisibilityList);
    return localVarResponse.getData();
  }

  /**
   * Updates document visibility for the recipients
   * This method updates the document visibility for a template recipient.  **Note:** A document cannot be hidden from a recipient if the recipient has tabs assigned to them on the document. Carbon Copy, Certified Delivery (Needs to Sign), Editor, and Agent recipients can always see all documents.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param templateDocumentVisibilityList  (optional)
   * @return TemplateDocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TemplateDocumentVisibilityList > updateTemplateRecipientDocumentVisibilityWithHttpInfo(String accountId, String templateId, String recipientId, TemplateDocumentVisibilityList templateDocumentVisibilityList) throws ApiException {
    Object localVarPostBody = templateDocumentVisibilityList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateTemplateRecipientDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/document_visibility"
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
    
    GenericType<TemplateDocumentVisibilityList> localVarReturnType = new GenericType<TemplateDocumentVisibilityList>() {};
    TemplateDocumentVisibilityList localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TemplateDocumentVisibilityList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates document visibility for the recipients.
   * This method updates document visibility for one or more template recipients based on the &#x60;recipientId&#x60; and &#x60;visible&#x60; values that you include in the request body.   **Note:** A document cannot be hidden from a recipient if the recipient has tabs assigned to them on the document. Carbon Copy, Certified Delivery (Needs to Sign), Editor, and Agent recipients can always see all documents.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateDocumentVisibilityList  (optional)
   * @return TemplateDocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public TemplateDocumentVisibilityList updateTemplateRecipientsDocumentVisibility(String accountId, String templateId, TemplateDocumentVisibilityList templateDocumentVisibilityList) throws ApiException {
    ApiResponse<TemplateDocumentVisibilityList> localVarResponse = updateTemplateRecipientsDocumentVisibilityWithHttpInfo(accountId, templateId, templateDocumentVisibilityList);
    return localVarResponse.getData();
  }

  /**
   * Updates document visibility for the recipients
   * This method updates document visibility for one or more template recipients based on the &#x60;recipientId&#x60; and &#x60;visible&#x60; values that you include in the request body.   **Note:** A document cannot be hidden from a recipient if the recipient has tabs assigned to them on the document. Carbon Copy, Certified Delivery (Needs to Sign), Editor, and Agent recipients can always see all documents.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateDocumentVisibilityList  (optional)
   * @return TemplateDocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TemplateDocumentVisibilityList > updateTemplateRecipientsDocumentVisibilityWithHttpInfo(String accountId, String templateId, TemplateDocumentVisibilityList templateDocumentVisibilityList) throws ApiException {
    Object localVarPostBody = templateDocumentVisibilityList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateRecipientsDocumentVisibility");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateRecipientsDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients/document_visibility"
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
    
    GenericType<TemplateDocumentVisibilityList> localVarReturnType = new GenericType<TemplateDocumentVisibilityList>() {};
    TemplateDocumentVisibilityList localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TemplateDocumentVisibilityList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the scheduled sending rules for a template&#39;s workflow definition..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param scheduledSending  (optional)
   * @return ScheduledSending
   * @throws ApiException if fails to make API call
   */
  public ScheduledSending updateTemplateScheduledSendingDefinition(String accountId, String templateId, ScheduledSending scheduledSending) throws ApiException {
    ApiResponse<ScheduledSending> localVarResponse = updateTemplateScheduledSendingDefinitionWithHttpInfo(accountId, templateId, scheduledSending);
    return localVarResponse.getData();
  }

  /**
   * Updates the scheduled sending rules for a template&#39;s workflow definition.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param scheduledSending  (optional)
   * @return ScheduledSending
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ScheduledSending > updateTemplateScheduledSendingDefinitionWithHttpInfo(String accountId, String templateId, ScheduledSending scheduledSending) throws ApiException {
    Object localVarPostBody = scheduledSending;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateScheduledSendingDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateScheduledSendingDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow/scheduledSending"
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
    
    GenericType<ScheduledSending> localVarReturnType = new GenericType<ScheduledSending>() {};
    ScheduledSending localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ScheduledSending>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the workflow definition for a template..
   * Updates the specified template&#39;s workflow definition if  it has one.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflow  (optional)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public Workflow updateTemplateWorkflowDefinition(String accountId, String templateId, Workflow workflow) throws ApiException {
    ApiResponse<Workflow> localVarResponse = updateTemplateWorkflowDefinitionWithHttpInfo(accountId, templateId, workflow);
    return localVarResponse.getData();
  }

  /**
   * Updates the workflow definition for a template.
   * Updates the specified template&#39;s workflow definition if  it has one.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflow  (optional)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workflow > updateTemplateWorkflowDefinitionWithHttpInfo(String accountId, String templateId, Workflow workflow) throws ApiException {
    Object localVarPostBody = workflow;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateWorkflowDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow"
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
    
    GenericType<Workflow> localVarReturnType = new GenericType<Workflow>() {};
    Workflow localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Workflow>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates the template workflow step definition for an envelope..
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @param workflowStep  (optional)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public WorkflowStep updateTemplateWorkflowStepDefinition(String accountId, String templateId, String workflowStepId, WorkflowStep workflowStep) throws ApiException {
    ApiResponse<WorkflowStep> localVarResponse = updateTemplateWorkflowStepDefinitionWithHttpInfo(accountId, templateId, workflowStepId, workflowStep);
    return localVarResponse.getData();
  }

  /**
   * Updates the template workflow step definition for an envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflowStepId  (required)
   * @param workflowStep  (optional)
   * @return WorkflowStep
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkflowStep > updateTemplateWorkflowStepDefinitionWithHttpInfo(String accountId, String templateId, String workflowStepId, WorkflowStep workflowStep) throws ApiException {
    Object localVarPostBody = workflowStep;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateWorkflowStepDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateWorkflowStepDefinition");
    }
    
    // verify the required parameter 'workflowStepId' is set
    if (workflowStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowStepId' when calling updateTemplateWorkflowStepDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow/steps/{workflowStepId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "workflowStepId" + "\\}", apiClient.escapeString(workflowStepId.toString()));

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
    
    GenericType<WorkflowStep> localVarReturnType = new GenericType<WorkflowStep>() {};
    WorkflowStep localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkflowStep>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
