package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.MatchBox;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class Document   {
  
  private String documentId = null;
  private String uri = null;
  private String remoteUrl = null;
  private String name = null;
  private String password = null;
  private String transformPdfFields = null;
  private String fileExtension = null;
  private java.util.List<MatchBox> matchBoxes = new java.util.ArrayList<MatchBox>();
  private String order = null;
  private String pages = null;
  private java.util.List<NameValue> documentFields = new java.util.ArrayList<NameValue>();
  private String encryptedWithKeyManager = null;
  private String documentBase64 = null;
  private String applyAnchorTabs = null;

  
  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   **/
  public Document documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  
  /**
   * 
   **/
  public Document uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * The file id from the cloud storage service where the document is located. This information is returned using [ML:GET /folders] or [ML:/folders/{folderid}]. 
   **/
  public Document remoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The file id from the cloud storage service where the document is located. This information is returned using [ML:GET /folders] or [ML:/folders/{folderid}]. ")
  @JsonProperty("remoteUrl")
  public String getRemoteUrl() {
    return remoteUrl;
  }
  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }

  
  /**
   * 
   **/
  public Document name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 
   **/
  public Document password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * When set to **true**, PDF form field data is transformed into document tab values when the PDF form field name matches the DocuSign custom tab tabLabel. The resulting PDF form data is also returned in the PDF meta data when requesting the document PDF. See the [ML:Transform PDF Fields] section for more information about how fields are transformed into DocuSign tabs. 
   **/
  public Document transformPdfFields(String transformPdfFields) {
    this.transformPdfFields = transformPdfFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, PDF form field data is transformed into document tab values when the PDF form field name matches the DocuSign custom tab tabLabel. The resulting PDF form data is also returned in the PDF meta data when requesting the document PDF. See the [ML:Transform PDF Fields] section for more information about how fields are transformed into DocuSign tabs. ")
  @JsonProperty("transformPdfFields")
  public String getTransformPdfFields() {
    return transformPdfFields;
  }
  public void setTransformPdfFields(String transformPdfFields) {
    this.transformPdfFields = transformPdfFields;
  }

  
  /**
   * The file extension type of the document. If the document is not a PDF it is converted to a PDF.\n 
   **/
  public Document fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The file extension type of the document. If the document is not a PDF it is converted to a PDF.\n ")
  @JsonProperty("fileExtension")
  public String getFileExtension() {
    return fileExtension;
  }
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  
  /**
   * Matchboxes define areas in a document for document matching when you are creating envelopes. They are only used when you upload and edit a template. \n\nA matchbox consists of 5 elements:\n\n* pageNumber - The document page number  on which the matchbox will appear. \n* xPosition - The x position of the matchbox on a page. \n* yPosition - The y position of the matchbox on a page.\n* width - The width of the matchbox. \n* height - The height of the matchbox. \n
   **/
  public Document matchBoxes(java.util.List<MatchBox> matchBoxes) {
    this.matchBoxes = matchBoxes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Matchboxes define areas in a document for document matching when you are creating envelopes. They are only used when you upload and edit a template. \n\nA matchbox consists of 5 elements:\n\n* pageNumber - The document page number  on which the matchbox will appear. \n* xPosition - The x position of the matchbox on a page. \n* yPosition - The y position of the matchbox on a page.\n* width - The width of the matchbox. \n* height - The height of the matchbox. \n")
  @JsonProperty("matchBoxes")
  public java.util.List<MatchBox> getMatchBoxes() {
    return matchBoxes;
  }
  public void setMatchBoxes(java.util.List<MatchBox> matchBoxes) {
    this.matchBoxes = matchBoxes;
  }

  
  /**
   * 
   **/
  public Document order(String order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  
  /**
   * 
   **/
  public Document pages(String pages) {
    this.pages = pages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pages")
  public String getPages() {
    return pages;
  }
  public void setPages(String pages) {
    this.pages = pages;
  }

  
  /**
   * 
   **/
  public Document documentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentFields")
  public java.util.List<NameValue> getDocumentFields() {
    return documentFields;
  }
  public void setDocumentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
  }

  
  /**
   * When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.\n 
   **/
  public Document encryptedWithKeyManager(String encryptedWithKeyManager) {
    this.encryptedWithKeyManager = encryptedWithKeyManager;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.\n ")
  @JsonProperty("encryptedWithKeyManager")
  public String getEncryptedWithKeyManager() {
    return encryptedWithKeyManager;
  }
  public void setEncryptedWithKeyManager(String encryptedWithKeyManager) {
    this.encryptedWithKeyManager = encryptedWithKeyManager;
  }

  
  /**
   * The document\u2019s bytes. This field can be used to include a base64 version of the document bytes within an envelope definition instead of sending the document using a multi-part HTTP request. The maximum document size is smaller if this field is used due to the overhead of the base64 encoding.
   **/
  public Document documentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The document\u2019s bytes. This field can be used to include a base64 version of the document bytes within an envelope definition instead of sending the document using a multi-part HTTP request. The maximum document size is smaller if this field is used due to the overhead of the base64 encoding.")
  @JsonProperty("documentBase64")
  public String getDocumentBase64() {
    return documentBase64;
  }
  public void setDocumentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
  }

  
  /**
   * Reserved: TBD
   **/
  public Document applyAnchorTabs(String applyAnchorTabs) {
    this.applyAnchorTabs = applyAnchorTabs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  @JsonProperty("applyAnchorTabs")
  public String getApplyAnchorTabs() {
    return applyAnchorTabs;
  }
  public void setApplyAnchorTabs(String applyAnchorTabs) {
    this.applyAnchorTabs = applyAnchorTabs;
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
    return Objects.equals(this.documentId, document.documentId) &&
        Objects.equals(this.uri, document.uri) &&
        Objects.equals(this.remoteUrl, document.remoteUrl) &&
        Objects.equals(this.name, document.name) &&
        Objects.equals(this.password, document.password) &&
        Objects.equals(this.transformPdfFields, document.transformPdfFields) &&
        Objects.equals(this.fileExtension, document.fileExtension) &&
        Objects.equals(this.matchBoxes, document.matchBoxes) &&
        Objects.equals(this.order, document.order) &&
        Objects.equals(this.pages, document.pages) &&
        Objects.equals(this.documentFields, document.documentFields) &&
        Objects.equals(this.encryptedWithKeyManager, document.encryptedWithKeyManager) &&
        Objects.equals(this.documentBase64, document.documentBase64) &&
        Objects.equals(this.applyAnchorTabs, document.applyAnchorTabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, uri, remoteUrl, name, password, transformPdfFields, fileExtension, matchBoxes, order, pages, documentFields, encryptedWithKeyManager, documentBase64, applyAnchorTabs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    transformPdfFields: ").append(toIndentedString(transformPdfFields)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    matchBoxes: ").append(toIndentedString(matchBoxes)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
    sb.append("    encryptedWithKeyManager: ").append(toIndentedString(encryptedWithKeyManager)).append("\n");
    sb.append("    documentBase64: ").append(toIndentedString(documentBase64)).append("\n");
    sb.append("    applyAnchorTabs: ").append(toIndentedString(applyAnchorTabs)).append("\n");
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

