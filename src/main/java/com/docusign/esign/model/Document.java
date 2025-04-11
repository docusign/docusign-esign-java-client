package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DocGenFormField;
import com.docusign.esign.model.DocumentHtmlDefinition;
import com.docusign.esign.model.MatchBox;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.Tabs;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * A document object..
 *
 */
@Schema(description = "A document object.")

public class Document implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("applyAnchorTabs")
  private String applyAnchorTabs = null;

  @JsonProperty("assignTabsToRecipientId")
  private String assignTabsToRecipientId = null;

  @JsonProperty("authoritativeCopy")
  private Boolean authoritativeCopy = null;

  @JsonProperty("display")
  private String display = null;

  @JsonProperty("docGenFormFields")
  private java.util.List<DocGenFormField> docGenFormFields = null;

  @JsonProperty("documentBase64")
  private String documentBase64 = null;

  @JsonProperty("documentFields")
  private java.util.List<NameValue> documentFields = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentTemplateAgreementTypeId")
  private String documentTemplateAgreementTypeId = null;

  @JsonProperty("documentTemplateId")
  private String documentTemplateId = null;

  @JsonProperty("encryptedWithKeyManager")
  private String encryptedWithKeyManager = null;

  @JsonProperty("fileExtension")
  private String fileExtension = null;

  @JsonProperty("fileFormatHint")
  private String fileFormatHint = null;

  @JsonProperty("htmlDefinition")
  private DocumentHtmlDefinition htmlDefinition = null;

  @JsonProperty("includeInDownload")
  private String includeInDownload = null;

  @JsonProperty("isDocGenDocument")
  private String isDocGenDocument = null;

  @JsonProperty("matchBoxes")
  private java.util.List<MatchBox> matchBoxes = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("pages")
  private String pages = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("pdfFormFieldOption")
  private String pdfFormFieldOption = null;

  @JsonProperty("remoteUrl")
  private String remoteUrl = null;

  @JsonProperty("signerMustAcknowledge")
  private String signerMustAcknowledge = null;

  @JsonProperty("signerMustAcknowledgeUseAccountDefault")
  private Boolean signerMustAcknowledgeUseAccountDefault = null;

  @JsonProperty("tabs")
  private Tabs tabs = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("transformPdfFields")
  private String transformPdfFields = null;

  @JsonProperty("uri")
  private String uri = null;


  /**
   * applyAnchorTabs.
   *
   * @return Document
   **/
  public Document applyAnchorTabs(String applyAnchorTabs) {
    this.applyAnchorTabs = applyAnchorTabs;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return applyAnchorTabs
   **/
  @Schema(description = "Reserved: TBD")
  public String getApplyAnchorTabs() {
    return applyAnchorTabs;
  }

  /**
   * setApplyAnchorTabs.
   **/
  public void setApplyAnchorTabs(String applyAnchorTabs) {
    this.applyAnchorTabs = applyAnchorTabs;
  }


  /**
   * assignTabsToRecipientId.
   *
   * @return Document
   **/
  public Document assignTabsToRecipientId(String assignTabsToRecipientId) {
    this.assignTabsToRecipientId = assignTabsToRecipientId;
    return this;
  }

  /**
   * .
   * @return assignTabsToRecipientId
   **/
  @Schema(description = "")
  public String getAssignTabsToRecipientId() {
    return assignTabsToRecipientId;
  }

  /**
   * setAssignTabsToRecipientId.
   **/
  public void setAssignTabsToRecipientId(String assignTabsToRecipientId) {
    this.assignTabsToRecipientId = assignTabsToRecipientId;
  }


  /**
   * authoritativeCopy.
   *
   * @return Document
   **/
  public Document authoritativeCopy(Boolean authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
    return this;
  }

  /**
   * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled..
   * @return authoritativeCopy
   **/
  @Schema(description = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
  public Boolean isAuthoritativeCopy() {
    return authoritativeCopy;
  }

  /**
   * setAuthoritativeCopy.
   **/
  public void setAuthoritativeCopy(Boolean authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
  }


  /**
   * display.
   *
   * @return Document
   **/
  public Document display(String display) {
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
   * docGenFormFields.
   *
   * @return Document
   **/
  public Document docGenFormFields(java.util.List<DocGenFormField> docGenFormFields) {
    this.docGenFormFields = docGenFormFields;
    return this;
  }
  
  /**
   * addDocGenFormFieldsItem.
   *
   * @return Document
   **/
  public Document addDocGenFormFieldsItem(DocGenFormField docGenFormFieldsItem) {
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
   * @return Document
   **/
  public Document documentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
    return this;
  }

  /**
   * The document's bytes. This field can be used to include a base64 version of the document bytes within an envelope definition instead of sending the document using a multi-part HTTP request. The maximum document size is smaller if this field is used due to the overhead of the base64 encoding..
   * @return documentBase64
   **/
  @Schema(description = "The document's bytes. This field can be used to include a base64 version of the document bytes within an envelope definition instead of sending the document using a multi-part HTTP request. The maximum document size is smaller if this field is used due to the overhead of the base64 encoding.")
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
   * @return Document
   **/
  public Document documentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
    return this;
  }
  
  /**
   * addDocumentFieldsItem.
   *
   * @return Document
   **/
  public Document addDocumentFieldsItem(NameValue documentFieldsItem) {
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
   * @return Document
   **/
  public Document documentId(String documentId) {
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
   * documentTemplateAgreementTypeId.
   *
   * @return Document
   **/
  public Document documentTemplateAgreementTypeId(String documentTemplateAgreementTypeId) {
    this.documentTemplateAgreementTypeId = documentTemplateAgreementTypeId;
    return this;
  }

  /**
   * .
   * @return documentTemplateAgreementTypeId
   **/
  @Schema(description = "")
  public String getDocumentTemplateAgreementTypeId() {
    return documentTemplateAgreementTypeId;
  }

  /**
   * setDocumentTemplateAgreementTypeId.
   **/
  public void setDocumentTemplateAgreementTypeId(String documentTemplateAgreementTypeId) {
    this.documentTemplateAgreementTypeId = documentTemplateAgreementTypeId;
  }


  /**
   * documentTemplateId.
   *
   * @return Document
   **/
  public Document documentTemplateId(String documentTemplateId) {
    this.documentTemplateId = documentTemplateId;
    return this;
  }

  /**
   * .
   * @return documentTemplateId
   **/
  @Schema(description = "")
  public String getDocumentTemplateId() {
    return documentTemplateId;
  }

  /**
   * setDocumentTemplateId.
   **/
  public void setDocumentTemplateId(String documentTemplateId) {
    this.documentTemplateId = documentTemplateId;
  }


  /**
   * encryptedWithKeyManager.
   *
   * @return Document
   **/
  public Document encryptedWithKeyManager(String encryptedWithKeyManager) {
    this.encryptedWithKeyManager = encryptedWithKeyManager;
    return this;
  }

  /**
   * When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.  .
   * @return encryptedWithKeyManager
   **/
  @Schema(description = "When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.  ")
  public String getEncryptedWithKeyManager() {
    return encryptedWithKeyManager;
  }

  /**
   * setEncryptedWithKeyManager.
   **/
  public void setEncryptedWithKeyManager(String encryptedWithKeyManager) {
    this.encryptedWithKeyManager = encryptedWithKeyManager;
  }


  /**
   * fileExtension.
   *
   * @return Document
   **/
  public Document fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * The file extension type of the document. If the document is not a PDF it is converted to a PDF.  .
   * @return fileExtension
   **/
  @Schema(description = "The file extension type of the document. If the document is not a PDF it is converted to a PDF.  ")
  public String getFileExtension() {
    return fileExtension;
  }

  /**
   * setFileExtension.
   **/
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }


  /**
   * fileFormatHint.
   *
   * @return Document
   **/
  public Document fileFormatHint(String fileFormatHint) {
    this.fileFormatHint = fileFormatHint;
    return this;
  }

  /**
   * .
   * @return fileFormatHint
   **/
  @Schema(description = "")
  public String getFileFormatHint() {
    return fileFormatHint;
  }

  /**
   * setFileFormatHint.
   **/
  public void setFileFormatHint(String fileFormatHint) {
    this.fileFormatHint = fileFormatHint;
  }


  /**
   * htmlDefinition.
   *
   * @return Document
   **/
  public Document htmlDefinition(DocumentHtmlDefinition htmlDefinition) {
    this.htmlDefinition = htmlDefinition;
    return this;
  }

  /**
   * Defines how to generate the responsive-formatted HTML for the document. See [Responsive signing](/docs/esign-rest-api/esign101/concepts/responsive/) in the [eSignature concepts guide](/docs/esign-rest-api/esign101/concepts/)..
   * @return htmlDefinition
   **/
  @Schema(description = "Defines how to generate the responsive-formatted HTML for the document. See [Responsive signing](/docs/esign-rest-api/esign101/concepts/responsive/) in the [eSignature concepts guide](/docs/esign-rest-api/esign101/concepts/).")
  public DocumentHtmlDefinition getHtmlDefinition() {
    return htmlDefinition;
  }

  /**
   * setHtmlDefinition.
   **/
  public void setHtmlDefinition(DocumentHtmlDefinition htmlDefinition) {
    this.htmlDefinition = htmlDefinition;
  }


  /**
   * includeInDownload.
   *
   * @return Document
   **/
  public Document includeInDownload(String includeInDownload) {
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
   * isDocGenDocument.
   *
   * @return Document
   **/
  public Document isDocGenDocument(String isDocGenDocument) {
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
   * matchBoxes.
   *
   * @return Document
   **/
  public Document matchBoxes(java.util.List<MatchBox> matchBoxes) {
    this.matchBoxes = matchBoxes;
    return this;
  }
  
  /**
   * addMatchBoxesItem.
   *
   * @return Document
   **/
  public Document addMatchBoxesItem(MatchBox matchBoxesItem) {
    if (this.matchBoxes == null) {
      this.matchBoxes = new java.util.ArrayList<>();
    }
    this.matchBoxes.add(matchBoxesItem);
    return this;
  }

  /**
   * Matchboxes define areas in a document for document matching when you are creating envelopes. They are only used when you upload and edit a template.   A matchbox consists of 5 elements:  * pageNumber - The document page number  on which the matchbox will appear.  * xPosition - The x position of the matchbox on a page.  * yPosition - The y position of the matchbox on a page. * width - The width of the matchbox.  * height - The height of the matchbox.  .
   * @return matchBoxes
   **/
  @Schema(description = "Matchboxes define areas in a document for document matching when you are creating envelopes. They are only used when you upload and edit a template.   A matchbox consists of 5 elements:  * pageNumber - The document page number  on which the matchbox will appear.  * xPosition - The x position of the matchbox on a page.  * yPosition - The y position of the matchbox on a page. * width - The width of the matchbox.  * height - The height of the matchbox.  ")
  public java.util.List<MatchBox> getMatchBoxes() {
    return matchBoxes;
  }

  /**
   * setMatchBoxes.
   **/
  public void setMatchBoxes(java.util.List<MatchBox> matchBoxes) {
    this.matchBoxes = matchBoxes;
  }


  /**
   * name.
   *
   * @return Document
   **/
  public Document name(String name) {
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
   * order.
   *
   * @return Document
   **/
  public Document order(String order) {
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
   * @return Document
   **/
  public Document pages(String pages) {
    this.pages = pages;
    return this;
  }

  /**
   * .
   * @return pages
   **/
  @Schema(description = "")
  public String getPages() {
    return pages;
  }

  /**
   * setPages.
   **/
  public void setPages(String pages) {
    this.pages = pages;
  }


  /**
   * password.
   *
   * @return Document
   **/
  public Document password(String password) {
    this.password = password;
    return this;
  }

  /**
   * .
   * @return password
   **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  /**
   * setPassword.
   **/
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * pdfFormFieldOption.
   *
   * @return Document
   **/
  public Document pdfFormFieldOption(String pdfFormFieldOption) {
    this.pdfFormFieldOption = pdfFormFieldOption;
    return this;
  }

  /**
   * .
   * @return pdfFormFieldOption
   **/
  @Schema(description = "")
  public String getPdfFormFieldOption() {
    return pdfFormFieldOption;
  }

  /**
   * setPdfFormFieldOption.
   **/
  public void setPdfFormFieldOption(String pdfFormFieldOption) {
    this.pdfFormFieldOption = pdfFormFieldOption;
  }


  /**
   * remoteUrl.
   *
   * @return Document
   **/
  public Document remoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
    return this;
  }

  /**
   * The file id from the cloud storage service where the document is located. This information is returned using [ML:GET /folders] or [ML:/folders/{folderid}]. .
   * @return remoteUrl
   **/
  @Schema(description = "The file id from the cloud storage service where the document is located. This information is returned using [ML:GET /folders] or [ML:/folders/{folderid}]. ")
  public String getRemoteUrl() {
    return remoteUrl;
  }

  /**
   * setRemoteUrl.
   **/
  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }


  /**
   * signerMustAcknowledge.
   *
   * @return Document
   **/
  public Document signerMustAcknowledge(String signerMustAcknowledge) {
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
   * signerMustAcknowledgeUseAccountDefault.
   *
   * @return Document
   **/
  public Document signerMustAcknowledgeUseAccountDefault(Boolean signerMustAcknowledgeUseAccountDefault) {
    this.signerMustAcknowledgeUseAccountDefault = signerMustAcknowledgeUseAccountDefault;
    return this;
  }

  /**
   * .
   * @return signerMustAcknowledgeUseAccountDefault
   **/
  @Schema(description = "")
  public Boolean isSignerMustAcknowledgeUseAccountDefault() {
    return signerMustAcknowledgeUseAccountDefault;
  }

  /**
   * setSignerMustAcknowledgeUseAccountDefault.
   **/
  public void setSignerMustAcknowledgeUseAccountDefault(Boolean signerMustAcknowledgeUseAccountDefault) {
    this.signerMustAcknowledgeUseAccountDefault = signerMustAcknowledgeUseAccountDefault;
  }


  /**
   * tabs.
   *
   * @return Document
   **/
  public Document tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }

  /**
   * A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data. They may also display data to the recipients..
   * @return tabs
   **/
  @Schema(description = "A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data. They may also display data to the recipients.")
  public Tabs getTabs() {
    return tabs;
  }

  /**
   * setTabs.
   **/
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }


  /**
   * templateLocked.
   *
   * @return Document
   **/
  public Document templateLocked(String templateLocked) {
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
   * @return Document
   **/
  public Document templateRequired(String templateRequired) {
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
   * transformPdfFields.
   *
   * @return Document
   **/
  public Document transformPdfFields(String transformPdfFields) {
    this.transformPdfFields = transformPdfFields;
    return this;
  }

  /**
   * When set to **true**, PDF form field data is transformed into document tab values when the PDF form field name matches the DocuSign custom tab tabLabel. The resulting PDF form data is also returned in the PDF meta data when requesting the document PDF. See the [ML:Transform PDF Fields] section for more information about how fields are transformed into DocuSign tabs. .
   * @return transformPdfFields
   **/
  @Schema(description = "When set to **true**, PDF form field data is transformed into document tab values when the PDF form field name matches the DocuSign custom tab tabLabel. The resulting PDF form data is also returned in the PDF meta data when requesting the document PDF. See the [ML:Transform PDF Fields] section for more information about how fields are transformed into DocuSign tabs. ")
  public String getTransformPdfFields() {
    return transformPdfFields;
  }

  /**
   * setTransformPdfFields.
   **/
  public void setTransformPdfFields(String transformPdfFields) {
    this.transformPdfFields = transformPdfFields;
  }


  /**
   * uri.
   *
   * @return Document
   **/
  public Document uri(String uri) {
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
    Document document = (Document) o;
    return Objects.equals(this.applyAnchorTabs, document.applyAnchorTabs) &&
        Objects.equals(this.assignTabsToRecipientId, document.assignTabsToRecipientId) &&
        Objects.equals(this.authoritativeCopy, document.authoritativeCopy) &&
        Objects.equals(this.display, document.display) &&
        Objects.equals(this.docGenFormFields, document.docGenFormFields) &&
        Objects.equals(this.documentBase64, document.documentBase64) &&
        Objects.equals(this.documentFields, document.documentFields) &&
        Objects.equals(this.documentId, document.documentId) &&
        Objects.equals(this.documentTemplateAgreementTypeId, document.documentTemplateAgreementTypeId) &&
        Objects.equals(this.documentTemplateId, document.documentTemplateId) &&
        Objects.equals(this.encryptedWithKeyManager, document.encryptedWithKeyManager) &&
        Objects.equals(this.fileExtension, document.fileExtension) &&
        Objects.equals(this.fileFormatHint, document.fileFormatHint) &&
        Objects.equals(this.htmlDefinition, document.htmlDefinition) &&
        Objects.equals(this.includeInDownload, document.includeInDownload) &&
        Objects.equals(this.isDocGenDocument, document.isDocGenDocument) &&
        Objects.equals(this.matchBoxes, document.matchBoxes) &&
        Objects.equals(this.name, document.name) &&
        Objects.equals(this.order, document.order) &&
        Objects.equals(this.pages, document.pages) &&
        Objects.equals(this.password, document.password) &&
        Objects.equals(this.pdfFormFieldOption, document.pdfFormFieldOption) &&
        Objects.equals(this.remoteUrl, document.remoteUrl) &&
        Objects.equals(this.signerMustAcknowledge, document.signerMustAcknowledge) &&
        Objects.equals(this.signerMustAcknowledgeUseAccountDefault, document.signerMustAcknowledgeUseAccountDefault) &&
        Objects.equals(this.tabs, document.tabs) &&
        Objects.equals(this.templateLocked, document.templateLocked) &&
        Objects.equals(this.templateRequired, document.templateRequired) &&
        Objects.equals(this.transformPdfFields, document.transformPdfFields) &&
        Objects.equals(this.uri, document.uri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(applyAnchorTabs, assignTabsToRecipientId, authoritativeCopy, display, docGenFormFields, documentBase64, documentFields, documentId, documentTemplateAgreementTypeId, documentTemplateId, encryptedWithKeyManager, fileExtension, fileFormatHint, htmlDefinition, includeInDownload, isDocGenDocument, matchBoxes, name, order, pages, password, pdfFormFieldOption, remoteUrl, signerMustAcknowledge, signerMustAcknowledgeUseAccountDefault, tabs, templateLocked, templateRequired, transformPdfFields, uri);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    applyAnchorTabs: ").append(toIndentedString(applyAnchorTabs)).append("\n");
    sb.append("    assignTabsToRecipientId: ").append(toIndentedString(assignTabsToRecipientId)).append("\n");
    sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    docGenFormFields: ").append(toIndentedString(docGenFormFields)).append("\n");
    sb.append("    documentBase64: ").append(toIndentedString(documentBase64)).append("\n");
    sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentTemplateAgreementTypeId: ").append(toIndentedString(documentTemplateAgreementTypeId)).append("\n");
    sb.append("    documentTemplateId: ").append(toIndentedString(documentTemplateId)).append("\n");
    sb.append("    encryptedWithKeyManager: ").append(toIndentedString(encryptedWithKeyManager)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    fileFormatHint: ").append(toIndentedString(fileFormatHint)).append("\n");
    sb.append("    htmlDefinition: ").append(toIndentedString(htmlDefinition)).append("\n");
    sb.append("    includeInDownload: ").append(toIndentedString(includeInDownload)).append("\n");
    sb.append("    isDocGenDocument: ").append(toIndentedString(isDocGenDocument)).append("\n");
    sb.append("    matchBoxes: ").append(toIndentedString(matchBoxes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pdfFormFieldOption: ").append(toIndentedString(pdfFormFieldOption)).append("\n");
    sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
    sb.append("    signerMustAcknowledge: ").append(toIndentedString(signerMustAcknowledge)).append("\n");
    sb.append("    signerMustAcknowledgeUseAccountDefault: ").append(toIndentedString(signerMustAcknowledgeUseAccountDefault)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    transformPdfFields: ").append(toIndentedString(transformPdfFields)).append("\n");
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

