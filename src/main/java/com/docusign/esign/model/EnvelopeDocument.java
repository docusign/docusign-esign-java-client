package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DocGenFormField;
import com.docusign.esign.model.DocGenSyntaxError;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.Page;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.SignatureType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This object contains details about the envelope document..
 *
 */
@Schema(description = "This object contains details about the envelope document.")

public class EnvelopeDocument {
  @JsonProperty("addedRecipientIds")
  private java.util.List<String> addedRecipientIds = null;

  @JsonProperty("attachmentTabId")
  private String attachmentTabId = null;

  @JsonProperty("authoritativeCopy")
  private String authoritativeCopy = null;

  @JsonProperty("authoritativeCopyMetadata")
  private PropertyMetadata authoritativeCopyMetadata = null;

  @JsonProperty("availableDocumentTypes")
  private java.util.List<SignatureType> availableDocumentTypes = null;

  @JsonProperty("containsPdfFormFields")
  private String containsPdfFormFields = null;

  @JsonProperty("display")
  private String display = null;

  @JsonProperty("displayMetadata")
  private PropertyMetadata displayMetadata = null;

  @JsonProperty("docGenDocumentStatus")
  private String docGenDocumentStatus = null;

  @JsonProperty("docGenErrors")
  private java.util.List<DocGenSyntaxError> docGenErrors = null;

  @JsonProperty("docGenFormFields")
  private java.util.List<DocGenFormField> docGenFormFields = null;

  @JsonProperty("documentBase64")
  private String documentBase64 = null;

  @JsonProperty("documentFields")
  private java.util.List<NameValue> documentFields = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentIdGuid")
  private String documentIdGuid = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("includeInDownload")
  private String includeInDownload = null;

  @JsonProperty("includeInDownloadMetadata")
  private PropertyMetadata includeInDownloadMetadata = null;

  @JsonProperty("isDocGenDocument")
  private String isDocGenDocument = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameMetadata")
  private PropertyMetadata nameMetadata = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("pages")
  private java.util.List<Page> pages = null;

  @JsonProperty("signerMustAcknowledge")
  private String signerMustAcknowledge = null;

  @JsonProperty("signerMustAcknowledgeMetadata")
  private PropertyMetadata signerMustAcknowledgeMetadata = null;

  @JsonProperty("sizeBytes")
  private String sizeBytes = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uri")
  private String uri = null;


  /**
   * addedRecipientIds.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument addedRecipientIds(java.util.List<String> addedRecipientIds) {
    this.addedRecipientIds = addedRecipientIds;
    return this;
  }
  
  /**
   * addAddedRecipientIdsItem.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument addAddedRecipientIdsItem(String addedRecipientIdsItem) {
    if (this.addedRecipientIds == null) {
      this.addedRecipientIds = new java.util.ArrayList<>();
    }
    this.addedRecipientIds.add(addedRecipientIdsItem);
    return this;
  }

  /**
   * .
   * @return addedRecipientIds
   **/
  @Schema(description = "")
  public java.util.List<String> getAddedRecipientIds() {
    return addedRecipientIds;
  }

  /**
   * setAddedRecipientIds.
   **/
  public void setAddedRecipientIds(java.util.List<String> addedRecipientIds) {
    this.addedRecipientIds = addedRecipientIds;
  }


  /**
   * attachmentTabId.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument attachmentTabId(String attachmentTabId) {
    this.attachmentTabId = attachmentTabId;
    return this;
  }

  /**
   * .
   * @return attachmentTabId
   **/
  @Schema(description = "")
  public String getAttachmentTabId() {
    return attachmentTabId;
  }

  /**
   * setAttachmentTabId.
   **/
  public void setAttachmentTabId(String attachmentTabId) {
    this.attachmentTabId = attachmentTabId;
  }


  /**
   * authoritativeCopy.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument authoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
    return this;
  }

  /**
   * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled..
   * @return authoritativeCopy
   **/
  @Schema(description = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
  public String getAuthoritativeCopy() {
    return authoritativeCopy;
  }

  /**
   * setAuthoritativeCopy.
   **/
  public void setAuthoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
  }


  /**
   * authoritativeCopyMetadata.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument authoritativeCopyMetadata(PropertyMetadata authoritativeCopyMetadata) {
    this.authoritativeCopyMetadata = authoritativeCopyMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the sender can edit the `authoritativeCopy` property. Not applicable for template documents..
   * @return authoritativeCopyMetadata
   **/
  @Schema(description = "Metadata that indicates if the sender can edit the `authoritativeCopy` property. Not applicable for template documents.")
  public PropertyMetadata getAuthoritativeCopyMetadata() {
    return authoritativeCopyMetadata;
  }

  /**
   * setAuthoritativeCopyMetadata.
   **/
  public void setAuthoritativeCopyMetadata(PropertyMetadata authoritativeCopyMetadata) {
    this.authoritativeCopyMetadata = authoritativeCopyMetadata;
  }


  /**
   * availableDocumentTypes.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument availableDocumentTypes(java.util.List<SignatureType> availableDocumentTypes) {
    this.availableDocumentTypes = availableDocumentTypes;
    return this;
  }
  
  /**
   * addAvailableDocumentTypesItem.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument addAvailableDocumentTypesItem(SignatureType availableDocumentTypesItem) {
    if (this.availableDocumentTypes == null) {
      this.availableDocumentTypes = new java.util.ArrayList<>();
    }
    this.availableDocumentTypes.add(availableDocumentTypesItem);
    return this;
  }

  /**
   * .
   * @return availableDocumentTypes
   **/
  @Schema(description = "")
  public java.util.List<SignatureType> getAvailableDocumentTypes() {
    return availableDocumentTypes;
  }

  /**
   * setAvailableDocumentTypes.
   **/
  public void setAvailableDocumentTypes(java.util.List<SignatureType> availableDocumentTypes) {
    this.availableDocumentTypes = availableDocumentTypes;
  }


  /**
   * containsPdfFormFields.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument containsPdfFormFields(String containsPdfFormFields) {
    this.containsPdfFormFields = containsPdfFormFields;
    return this;
  }

  /**
   * .
   * @return containsPdfFormFields
   **/
  @Schema(description = "")
  public String getContainsPdfFormFields() {
    return containsPdfFormFields;
  }

  /**
   * setContainsPdfFormFields.
   **/
  public void setContainsPdfFormFields(String containsPdfFormFields) {
    this.containsPdfFormFields = containsPdfFormFields;
  }


  /**
   * display.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument display(String display) {
    this.display = display;
    return this;
  }

  /**
   * .
   * @return display
   **/
  @Schema(description = "")
  public String getDisplay() {
    return display;
  }

  /**
   * setDisplay.
   **/
  public void setDisplay(String display) {
    this.display = display;
  }


  /**
   * displayMetadata.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument displayMetadata(PropertyMetadata displayMetadata) {
    this.displayMetadata = displayMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the sender can edit the `display` property. Not applicable for template documents..
   * @return displayMetadata
   **/
  @Schema(description = "Metadata that indicates if the sender can edit the `display` property. Not applicable for template documents.")
  public PropertyMetadata getDisplayMetadata() {
    return displayMetadata;
  }

  /**
   * setDisplayMetadata.
   **/
  public void setDisplayMetadata(PropertyMetadata displayMetadata) {
    this.displayMetadata = displayMetadata;
  }


  /**
   * docGenDocumentStatus.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument docGenDocumentStatus(String docGenDocumentStatus) {
    this.docGenDocumentStatus = docGenDocumentStatus;
    return this;
  }

  /**
   * .
   * @return docGenDocumentStatus
   **/
  @Schema(description = "")
  public String getDocGenDocumentStatus() {
    return docGenDocumentStatus;
  }

  /**
   * setDocGenDocumentStatus.
   **/
  public void setDocGenDocumentStatus(String docGenDocumentStatus) {
    this.docGenDocumentStatus = docGenDocumentStatus;
  }


  /**
   * docGenErrors.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument docGenErrors(java.util.List<DocGenSyntaxError> docGenErrors) {
    this.docGenErrors = docGenErrors;
    return this;
  }
  
  /**
   * addDocGenErrorsItem.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument addDocGenErrorsItem(DocGenSyntaxError docGenErrorsItem) {
    if (this.docGenErrors == null) {
      this.docGenErrors = new java.util.ArrayList<>();
    }
    this.docGenErrors.add(docGenErrorsItem);
    return this;
  }

  /**
   * .
   * @return docGenErrors
   **/
  @Schema(description = "")
  public java.util.List<DocGenSyntaxError> getDocGenErrors() {
    return docGenErrors;
  }

  /**
   * setDocGenErrors.
   **/
  public void setDocGenErrors(java.util.List<DocGenSyntaxError> docGenErrors) {
    this.docGenErrors = docGenErrors;
  }


  /**
   * docGenFormFields.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument docGenFormFields(java.util.List<DocGenFormField> docGenFormFields) {
    this.docGenFormFields = docGenFormFields;
    return this;
  }
  
  /**
   * addDocGenFormFieldsItem.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument addDocGenFormFieldsItem(DocGenFormField docGenFormFieldsItem) {
    if (this.docGenFormFields == null) {
      this.docGenFormFields = new java.util.ArrayList<>();
    }
    this.docGenFormFields.add(docGenFormFieldsItem);
    return this;
  }

  /**
   * .
   * @return docGenFormFields
   **/
  @Schema(description = "")
  public java.util.List<DocGenFormField> getDocGenFormFields() {
    return docGenFormFields;
  }

  /**
   * setDocGenFormFields.
   **/
  public void setDocGenFormFields(java.util.List<DocGenFormField> docGenFormFields) {
    this.docGenFormFields = docGenFormFields;
  }


  /**
   * documentBase64.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument documentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
    return this;
  }

  /**
   * .
   * @return documentBase64
   **/
  @Schema(description = "")
  public String getDocumentBase64() {
    return documentBase64;
  }

  /**
   * setDocumentBase64.
   **/
  public void setDocumentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
  }


  /**
   * documentFields.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument documentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
    return this;
  }
  
  /**
   * addDocumentFieldsItem.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument addDocumentFieldsItem(NameValue documentFieldsItem) {
    if (this.documentFields == null) {
      this.documentFields = new java.util.ArrayList<>();
    }
    this.documentFields.add(documentFieldsItem);
    return this;
  }

  /**
   * .
   * @return documentFields
   **/
  @Schema(description = "")
  public java.util.List<NameValue> getDocumentFields() {
    return documentFields;
  }

  /**
   * setDocumentFields.
   **/
  public void setDocumentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
  }


  /**
   * documentId.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute..
   * @return documentId
   **/
  @Schema(description = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  /**
   * setDocumentId.
   **/
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  /**
   * documentIdGuid.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument documentIdGuid(String documentIdGuid) {
    this.documentIdGuid = documentIdGuid;
    return this;
  }

  /**
   * .
   * @return documentIdGuid
   **/
  @Schema(description = "")
  public String getDocumentIdGuid() {
    return documentIdGuid;
  }

  /**
   * setDocumentIdGuid.
   **/
  public void setDocumentIdGuid(String documentIdGuid) {
    this.documentIdGuid = documentIdGuid;
  }


  /**
   * errorDetails.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * includeInDownload.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument includeInDownload(String includeInDownload) {
    this.includeInDownload = includeInDownload;
    return this;
  }

  /**
   * .
   * @return includeInDownload
   **/
  @Schema(description = "")
  public String getIncludeInDownload() {
    return includeInDownload;
  }

  /**
   * setIncludeInDownload.
   **/
  public void setIncludeInDownload(String includeInDownload) {
    this.includeInDownload = includeInDownload;
  }


  /**
   * includeInDownloadMetadata.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument includeInDownloadMetadata(PropertyMetadata includeInDownloadMetadata) {
    this.includeInDownloadMetadata = includeInDownloadMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the sender can edit the `includeInDownload` property. Not applicable for template documents..
   * @return includeInDownloadMetadata
   **/
  @Schema(description = "Metadata that indicates if the sender can edit the `includeInDownload` property. Not applicable for template documents.")
  public PropertyMetadata getIncludeInDownloadMetadata() {
    return includeInDownloadMetadata;
  }

  /**
   * setIncludeInDownloadMetadata.
   **/
  public void setIncludeInDownloadMetadata(PropertyMetadata includeInDownloadMetadata) {
    this.includeInDownloadMetadata = includeInDownloadMetadata;
  }


  /**
   * isDocGenDocument.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument isDocGenDocument(String isDocGenDocument) {
    this.isDocGenDocument = isDocGenDocument;
    return this;
  }

  /**
   * .
   * @return isDocGenDocument
   **/
  @Schema(description = "")
  public String getIsDocGenDocument() {
    return isDocGenDocument;
  }

  /**
   * setIsDocGenDocument.
   **/
  public void setIsDocGenDocument(String isDocGenDocument) {
    this.isDocGenDocument = isDocGenDocument;
  }


  /**
   * name.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * nameMetadata.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the sender can edit the `name` property. Not applicable for template documents..
   * @return nameMetadata
   **/
  @Schema(description = "Metadata that indicates if the sender can edit the `name` property. Not applicable for template documents.")
  public PropertyMetadata getNameMetadata() {
    return nameMetadata;
  }

  /**
   * setNameMetadata.
   **/
  public void setNameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
  }


  /**
   * order.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument order(String order) {
    this.order = order;
    return this;
  }

  /**
   * .
   * @return order
   **/
  @Schema(description = "")
  public String getOrder() {
    return order;
  }

  /**
   * setOrder.
   **/
  public void setOrder(String order) {
    this.order = order;
  }


  /**
   * pages.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument pages(java.util.List<Page> pages) {
    this.pages = pages;
    return this;
  }
  
  /**
   * addPagesItem.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument addPagesItem(Page pagesItem) {
    if (this.pages == null) {
      this.pages = new java.util.ArrayList<>();
    }
    this.pages.add(pagesItem);
    return this;
  }

  /**
   * .
   * @return pages
   **/
  @Schema(description = "")
  public java.util.List<Page> getPages() {
    return pages;
  }

  /**
   * setPages.
   **/
  public void setPages(java.util.List<Page> pages) {
    this.pages = pages;
  }


  /**
   * signerMustAcknowledge.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument signerMustAcknowledge(String signerMustAcknowledge) {
    this.signerMustAcknowledge = signerMustAcknowledge;
    return this;
  }

  /**
   * .
   * @return signerMustAcknowledge
   **/
  @Schema(description = "")
  public String getSignerMustAcknowledge() {
    return signerMustAcknowledge;
  }

  /**
   * setSignerMustAcknowledge.
   **/
  public void setSignerMustAcknowledge(String signerMustAcknowledge) {
    this.signerMustAcknowledge = signerMustAcknowledge;
  }


  /**
   * signerMustAcknowledgeMetadata.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument signerMustAcknowledgeMetadata(PropertyMetadata signerMustAcknowledgeMetadata) {
    this.signerMustAcknowledgeMetadata = signerMustAcknowledgeMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the sender can edit the `signerMustAcknowledge` property. Not applicable for template documents..
   * @return signerMustAcknowledgeMetadata
   **/
  @Schema(description = "Metadata that indicates if the sender can edit the `signerMustAcknowledge` property. Not applicable for template documents.")
  public PropertyMetadata getSignerMustAcknowledgeMetadata() {
    return signerMustAcknowledgeMetadata;
  }

  /**
   * setSignerMustAcknowledgeMetadata.
   **/
  public void setSignerMustAcknowledgeMetadata(PropertyMetadata signerMustAcknowledgeMetadata) {
    this.signerMustAcknowledgeMetadata = signerMustAcknowledgeMetadata;
  }


  /**
   * sizeBytes.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument sizeBytes(String sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * .
   * @return sizeBytes
   **/
  @Schema(description = "")
  public String getSizeBytes() {
    return sizeBytes;
  }

  /**
   * setSizeBytes.
   **/
  public void setSizeBytes(String sizeBytes) {
    this.sizeBytes = sizeBytes;
  }


  /**
   * templateLocked.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. .
   * @return templateLocked
   **/
  @Schema(description = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  /**
   * setTemplateLocked.
   **/
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }


  /**
   * templateRequired.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients..
   * @return templateRequired
   **/
  @Schema(description = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  /**
   * setTemplateRequired.
   **/
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }


  /**
   * type.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument type(String type) {
    this.type = type;
    return this;
  }

  /**
   * .
   * @return type
   **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(String type) {
    this.type = type;
  }


  /**
   * uri.
   *
   * @return EnvelopeDocument
   **/
  public EnvelopeDocument uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  /**
   * setUri.
   **/
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeDocument envelopeDocument = (EnvelopeDocument) o;
    return Objects.equals(this.addedRecipientIds, envelopeDocument.addedRecipientIds) &&
        Objects.equals(this.attachmentTabId, envelopeDocument.attachmentTabId) &&
        Objects.equals(this.authoritativeCopy, envelopeDocument.authoritativeCopy) &&
        Objects.equals(this.authoritativeCopyMetadata, envelopeDocument.authoritativeCopyMetadata) &&
        Objects.equals(this.availableDocumentTypes, envelopeDocument.availableDocumentTypes) &&
        Objects.equals(this.containsPdfFormFields, envelopeDocument.containsPdfFormFields) &&
        Objects.equals(this.display, envelopeDocument.display) &&
        Objects.equals(this.displayMetadata, envelopeDocument.displayMetadata) &&
        Objects.equals(this.docGenDocumentStatus, envelopeDocument.docGenDocumentStatus) &&
        Objects.equals(this.docGenErrors, envelopeDocument.docGenErrors) &&
        Objects.equals(this.docGenFormFields, envelopeDocument.docGenFormFields) &&
        Objects.equals(this.documentBase64, envelopeDocument.documentBase64) &&
        Objects.equals(this.documentFields, envelopeDocument.documentFields) &&
        Objects.equals(this.documentId, envelopeDocument.documentId) &&
        Objects.equals(this.documentIdGuid, envelopeDocument.documentIdGuid) &&
        Objects.equals(this.errorDetails, envelopeDocument.errorDetails) &&
        Objects.equals(this.includeInDownload, envelopeDocument.includeInDownload) &&
        Objects.equals(this.includeInDownloadMetadata, envelopeDocument.includeInDownloadMetadata) &&
        Objects.equals(this.isDocGenDocument, envelopeDocument.isDocGenDocument) &&
        Objects.equals(this.name, envelopeDocument.name) &&
        Objects.equals(this.nameMetadata, envelopeDocument.nameMetadata) &&
        Objects.equals(this.order, envelopeDocument.order) &&
        Objects.equals(this.pages, envelopeDocument.pages) &&
        Objects.equals(this.signerMustAcknowledge, envelopeDocument.signerMustAcknowledge) &&
        Objects.equals(this.signerMustAcknowledgeMetadata, envelopeDocument.signerMustAcknowledgeMetadata) &&
        Objects.equals(this.sizeBytes, envelopeDocument.sizeBytes) &&
        Objects.equals(this.templateLocked, envelopeDocument.templateLocked) &&
        Objects.equals(this.templateRequired, envelopeDocument.templateRequired) &&
        Objects.equals(this.type, envelopeDocument.type) &&
        Objects.equals(this.uri, envelopeDocument.uri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(addedRecipientIds, attachmentTabId, authoritativeCopy, authoritativeCopyMetadata, availableDocumentTypes, containsPdfFormFields, display, displayMetadata, docGenDocumentStatus, docGenErrors, docGenFormFields, documentBase64, documentFields, documentId, documentIdGuid, errorDetails, includeInDownload, includeInDownloadMetadata, isDocGenDocument, name, nameMetadata, order, pages, signerMustAcknowledge, signerMustAcknowledgeMetadata, sizeBytes, templateLocked, templateRequired, type, uri);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocument {\n");
    
    sb.append("    addedRecipientIds: ").append(toIndentedString(addedRecipientIds)).append("\n");
    sb.append("    attachmentTabId: ").append(toIndentedString(attachmentTabId)).append("\n");
    sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
    sb.append("    authoritativeCopyMetadata: ").append(toIndentedString(authoritativeCopyMetadata)).append("\n");
    sb.append("    availableDocumentTypes: ").append(toIndentedString(availableDocumentTypes)).append("\n");
    sb.append("    containsPdfFormFields: ").append(toIndentedString(containsPdfFormFields)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    displayMetadata: ").append(toIndentedString(displayMetadata)).append("\n");
    sb.append("    docGenDocumentStatus: ").append(toIndentedString(docGenDocumentStatus)).append("\n");
    sb.append("    docGenErrors: ").append(toIndentedString(docGenErrors)).append("\n");
    sb.append("    docGenFormFields: ").append(toIndentedString(docGenFormFields)).append("\n");
    sb.append("    documentBase64: ").append(toIndentedString(documentBase64)).append("\n");
    sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentIdGuid: ").append(toIndentedString(documentIdGuid)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    includeInDownload: ").append(toIndentedString(includeInDownload)).append("\n");
    sb.append("    includeInDownloadMetadata: ").append(toIndentedString(includeInDownloadMetadata)).append("\n");
    sb.append("    isDocGenDocument: ").append(toIndentedString(isDocGenDocument)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    signerMustAcknowledge: ").append(toIndentedString(signerMustAcknowledge)).append("\n");
    sb.append("    signerMustAcknowledgeMetadata: ").append(toIndentedString(signerMustAcknowledgeMetadata)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

