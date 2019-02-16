package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.DocumentHtmlDefinition;
import com.docusign.esign.model.MatchBox;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Document
 */

public class Document {
  @JsonProperty("applyAnchorTabs")
  private String applyAnchorTabs = null;

  @JsonProperty("authoritativeCopy")
  private Boolean authoritativeCopy = null;

  @JsonProperty("display")
  private String display = null;

  @JsonProperty("documentBase64")
  private String documentBase64 = null;

  @JsonProperty("documentFields")
  private java.util.List<NameValue> documentFields = new java.util.ArrayList<NameValue>();

  @JsonProperty("documentGroup")
  private String documentGroup = null;

  @JsonProperty("documentId")
  private String documentId = null;

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

  @JsonProperty("matchBoxes")
  private java.util.List<MatchBox> matchBoxes = new java.util.ArrayList<MatchBox>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("pages")
  private String pages = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("remoteUrl")
  private String remoteUrl = null;

  @JsonProperty("signerMustAcknowledge")
  private String signerMustAcknowledge = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("transformPdfFields")
  private String transformPdfFields = null;

  @JsonProperty("uri")
  private String uri = null;

  public Document applyAnchorTabs(String applyAnchorTabs) {
    this.applyAnchorTabs = applyAnchorTabs;
    return this;
  }

   /**
   * Reserved: TBD
   * @return applyAnchorTabs
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getApplyAnchorTabs() {
    return applyAnchorTabs;
  }

  public void setApplyAnchorTabs(String applyAnchorTabs) {
    this.applyAnchorTabs = applyAnchorTabs;
  }

  public Document authoritativeCopy(Boolean authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
    return this;
  }

   /**
   * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.
   * @return authoritativeCopy
  **/
  @ApiModelProperty(example = "null", value = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
  public Boolean getAuthoritativeCopy() {
    return authoritativeCopy;
  }

  public void setAuthoritativeCopy(Boolean authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
  }

  public Document display(String display) {
    this.display = display;
    return this;
  }

   /**
   * 
   * @return display
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public Document documentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
    return this;
  }

   /**
   * The document's bytes. This field can be used to include a base64 version of the document bytes within an envelope definition instead of sending the document using a multi-part HTTP request. The maximum document size is smaller if this field is used due to the overhead of the base64 encoding.
   * @return documentBase64
  **/
  @ApiModelProperty(example = "null", value = "The document's bytes. This field can be used to include a base64 version of the document bytes within an envelope definition instead of sending the document using a multi-part HTTP request. The maximum document size is smaller if this field is used due to the overhead of the base64 encoding.")
  public String getDocumentBase64() {
    return documentBase64;
  }

  public void setDocumentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
  }

  public Document documentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
    return this;
  }

  public Document addDocumentFieldsItem(NameValue documentFieldsItem) {
    this.documentFields.add(documentFieldsItem);
    return this;
  }

   /**
   * 
   * @return documentFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<NameValue> getDocumentFields() {
    return documentFields;
  }

  public void setDocumentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
  }

  public Document documentGroup(String documentGroup) {
    this.documentGroup = documentGroup;
    return this;
  }

   /**
   * 
   * @return documentGroup
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentGroup() {
    return documentGroup;
  }

  public void setDocumentGroup(String documentGroup) {
    this.documentGroup = documentGroup;
  }

  public Document documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Document encryptedWithKeyManager(String encryptedWithKeyManager) {
    this.encryptedWithKeyManager = encryptedWithKeyManager;
    return this;
  }

   /**
   * When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.  
   * @return encryptedWithKeyManager
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.  ")
  public String getEncryptedWithKeyManager() {
    return encryptedWithKeyManager;
  }

  public void setEncryptedWithKeyManager(String encryptedWithKeyManager) {
    this.encryptedWithKeyManager = encryptedWithKeyManager;
  }

  public Document fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

   /**
   * The file extension type of the document. If the document is not a PDF it is converted to a PDF.  
   * @return fileExtension
  **/
  @ApiModelProperty(example = "null", value = "The file extension type of the document. If the document is not a PDF it is converted to a PDF.  ")
  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public Document fileFormatHint(String fileFormatHint) {
    this.fileFormatHint = fileFormatHint;
    return this;
  }

   /**
   * 
   * @return fileFormatHint
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFileFormatHint() {
    return fileFormatHint;
  }

  public void setFileFormatHint(String fileFormatHint) {
    this.fileFormatHint = fileFormatHint;
  }

  public Document htmlDefinition(DocumentHtmlDefinition htmlDefinition) {
    this.htmlDefinition = htmlDefinition;
    return this;
  }

   /**
   * Get htmlDefinition
   * @return htmlDefinition
  **/
  @ApiModelProperty(example = "null", value = "")
  public DocumentHtmlDefinition getHtmlDefinition() {
    return htmlDefinition;
  }

  public void setHtmlDefinition(DocumentHtmlDefinition htmlDefinition) {
    this.htmlDefinition = htmlDefinition;
  }

  public Document includeInDownload(String includeInDownload) {
    this.includeInDownload = includeInDownload;
    return this;
  }

   /**
   * 
   * @return includeInDownload
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIncludeInDownload() {
    return includeInDownload;
  }

  public void setIncludeInDownload(String includeInDownload) {
    this.includeInDownload = includeInDownload;
  }

  public Document matchBoxes(java.util.List<MatchBox> matchBoxes) {
    this.matchBoxes = matchBoxes;
    return this;
  }

  public Document addMatchBoxesItem(MatchBox matchBoxesItem) {
    this.matchBoxes.add(matchBoxesItem);
    return this;
  }

   /**
   * Matchboxes define areas in a document for document matching when you are creating envelopes. They are only used when you upload and edit a template.   A matchbox consists of 5 elements:  * pageNumber - The document page number  on which the matchbox will appear.  * xPosition - The x position of the matchbox on a page.  * yPosition - The y position of the matchbox on a page. * width - The width of the matchbox.  * height - The height of the matchbox.  
   * @return matchBoxes
  **/
  @ApiModelProperty(example = "null", value = "Matchboxes define areas in a document for document matching when you are creating envelopes. They are only used when you upload and edit a template.   A matchbox consists of 5 elements:  * pageNumber - The document page number  on which the matchbox will appear.  * xPosition - The x position of the matchbox on a page.  * yPosition - The y position of the matchbox on a page. * width - The width of the matchbox.  * height - The height of the matchbox.  ")
  public java.util.List<MatchBox> getMatchBoxes() {
    return matchBoxes;
  }

  public void setMatchBoxes(java.util.List<MatchBox> matchBoxes) {
    this.matchBoxes = matchBoxes;
  }

  public Document name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Document order(String order) {
    this.order = order;
    return this;
  }

   /**
   * 
   * @return order
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public Document pages(String pages) {
    this.pages = pages;
    return this;
  }

   /**
   * 
   * @return pages
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPages() {
    return pages;
  }

  public void setPages(String pages) {
    this.pages = pages;
  }

  public Document password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Document remoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
    return this;
  }

   /**
   * The file id from the cloud storage service where the document is located. This information is returned using [ML:GET /folders] or [ML:/folders/{folderid}]. 
   * @return remoteUrl
  **/
  @ApiModelProperty(example = "null", value = "The file id from the cloud storage service where the document is located. This information is returned using [ML:GET /folders] or [ML:/folders/{folderid}]. ")
  public String getRemoteUrl() {
    return remoteUrl;
  }

  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }

  public Document signerMustAcknowledge(String signerMustAcknowledge) {
    this.signerMustAcknowledge = signerMustAcknowledge;
    return this;
  }

   /**
   * 
   * @return signerMustAcknowledge
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignerMustAcknowledge() {
    return signerMustAcknowledge;
  }

  public void setSignerMustAcknowledge(String signerMustAcknowledge) {
    this.signerMustAcknowledge = signerMustAcknowledge;
  }

  public Document templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

   /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. 
   * @return templateLocked
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  public Document templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

   /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   * @return templateRequired
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  public Document transformPdfFields(String transformPdfFields) {
    this.transformPdfFields = transformPdfFields;
    return this;
  }

   /**
   * When set to **true**, PDF form field data is transformed into document tab values when the PDF form field name matches the DocuSign custom tab tabLabel. The resulting PDF form data is also returned in the PDF meta data when requesting the document PDF. See the [ML:Transform PDF Fields] section for more information about how fields are transformed into DocuSign tabs. 
   * @return transformPdfFields
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, PDF form field data is transformed into document tab values when the PDF form field name matches the DocuSign custom tab tabLabel. The resulting PDF form data is also returned in the PDF meta data when requesting the document PDF. See the [ML:Transform PDF Fields] section for more information about how fields are transformed into DocuSign tabs. ")
  public String getTransformPdfFields() {
    return transformPdfFields;
  }

  public void setTransformPdfFields(String transformPdfFields) {
    this.transformPdfFields = transformPdfFields;
  }

  public Document uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


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
        Objects.equals(this.authoritativeCopy, document.authoritativeCopy) &&
        Objects.equals(this.display, document.display) &&
        Objects.equals(this.documentBase64, document.documentBase64) &&
        Objects.equals(this.documentFields, document.documentFields) &&
        Objects.equals(this.documentGroup, document.documentGroup) &&
        Objects.equals(this.documentId, document.documentId) &&
        Objects.equals(this.encryptedWithKeyManager, document.encryptedWithKeyManager) &&
        Objects.equals(this.fileExtension, document.fileExtension) &&
        Objects.equals(this.fileFormatHint, document.fileFormatHint) &&
        Objects.equals(this.htmlDefinition, document.htmlDefinition) &&
        Objects.equals(this.includeInDownload, document.includeInDownload) &&
        Objects.equals(this.matchBoxes, document.matchBoxes) &&
        Objects.equals(this.name, document.name) &&
        Objects.equals(this.order, document.order) &&
        Objects.equals(this.pages, document.pages) &&
        Objects.equals(this.password, document.password) &&
        Objects.equals(this.remoteUrl, document.remoteUrl) &&
        Objects.equals(this.signerMustAcknowledge, document.signerMustAcknowledge) &&
        Objects.equals(this.templateLocked, document.templateLocked) &&
        Objects.equals(this.templateRequired, document.templateRequired) &&
        Objects.equals(this.transformPdfFields, document.transformPdfFields) &&
        Objects.equals(this.uri, document.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyAnchorTabs, authoritativeCopy, display, documentBase64, documentFields, documentGroup, documentId, encryptedWithKeyManager, fileExtension, fileFormatHint, htmlDefinition, includeInDownload, matchBoxes, name, order, pages, password, remoteUrl, signerMustAcknowledge, templateLocked, templateRequired, transformPdfFields, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    applyAnchorTabs: ").append(toIndentedString(applyAnchorTabs)).append("\n");
    sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    documentBase64: ").append(toIndentedString(documentBase64)).append("\n");
    sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
    sb.append("    documentGroup: ").append(toIndentedString(documentGroup)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    encryptedWithKeyManager: ").append(toIndentedString(encryptedWithKeyManager)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    fileFormatHint: ").append(toIndentedString(fileFormatHint)).append("\n");
    sb.append("    htmlDefinition: ").append(toIndentedString(htmlDefinition)).append("\n");
    sb.append("    includeInDownload: ").append(toIndentedString(includeInDownload)).append("\n");
    sb.append("    matchBoxes: ").append(toIndentedString(matchBoxes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
    sb.append("    signerMustAcknowledge: ").append(toIndentedString(signerMustAcknowledge)).append("\n");
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

