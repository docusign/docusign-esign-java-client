package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.MatchBox;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "The file id from the cloud storage service where the document is located. This information is returned using [ML:GET /folders] or [ML:/folders/{folderid}].")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "When set to **true**, PDF form field data is transformed into document tab values when the PDF form field name matches the DocuSign custom tab tabLabel. The resulting PDF form data is also returned in the PDF meta data when requesting the document PDF. See the [ML:Transform PDF Fields] section for more information about how fields are transformed into DocuSign tabs.")
  @JsonProperty("transformPdfFields")
  public String getTransformPdfFields() {
    return transformPdfFields;
  }
  public void setTransformPdfFields(String transformPdfFields) {
    this.transformPdfFields = transformPdfFields;
  }

  
  /**
   * The file extension type of the document. If the document is not a PDF it is converted to a PDF.
   **/
  @ApiModelProperty(value = "The file extension type of the document. If the document is not a PDF it is converted to a PDF.")
  @JsonProperty("fileExtension")
  public String getFileExtension() {
    return fileExtension;
  }
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  
  /**
   * Matchboxes define areas in a document for document matching when you are creating envelopes. They are only used when you upload and edit a template. \n\nA matchbox consists of 5 elements:\n\n* pageNumber - The document page number  on which the matchbox will appear. \n* xPosition - The x position of the matchbox on a page. \n* yPosition - The y position of the matchbox on a page.\n* width - The width of the matchbox. \n* height - The height of the matchbox.
   **/
  @ApiModelProperty(value = "Matchboxes define areas in a document for document matching when you are creating envelopes. They are only used when you upload and edit a template. \n\nA matchbox consists of 5 elements:\n\n* pageNumber - The document page number  on which the matchbox will appear. \n* xPosition - The x position of the matchbox on a page. \n* yPosition - The y position of the matchbox on a page.\n* width - The width of the matchbox. \n* height - The height of the matchbox.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  @JsonProperty("documentFields")
  public java.util.List<NameValue> getDocumentFields() {
    return documentFields;
  }
  public void setDocumentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
  }

  
  /**
   * When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.
   **/
  @ApiModelProperty(value = "When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.")
  @JsonProperty("encryptedWithKeyManager")
  public String getEncryptedWithKeyManager() {
    return encryptedWithKeyManager;
  }
  public void setEncryptedWithKeyManager(String encryptedWithKeyManager) {
    this.encryptedWithKeyManager = encryptedWithKeyManager;
  }

  
  /**
   * The document byte stream. This allows putting a base64 version of document bytes into an envelope.
   **/
  @ApiModelProperty(value = "The document byte stream. This allows putting a base64 version of document bytes into an envelope.")
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
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("applyAnchorTabs")
  public String getApplyAnchorTabs() {
    return applyAnchorTabs;
  }
  public void setApplyAnchorTabs(String applyAnchorTabs) {
    this.applyAnchorTabs = applyAnchorTabs;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(documentId, document.documentId) &&
        Objects.equals(uri, document.uri) &&
        Objects.equals(remoteUrl, document.remoteUrl) &&
        Objects.equals(name, document.name) &&
        Objects.equals(password, document.password) &&
        Objects.equals(transformPdfFields, document.transformPdfFields) &&
        Objects.equals(fileExtension, document.fileExtension) &&
        Objects.equals(matchBoxes, document.matchBoxes) &&
        Objects.equals(order, document.order) &&
        Objects.equals(pages, document.pages) &&
        Objects.equals(documentFields, document.documentFields) &&
        Objects.equals(encryptedWithKeyManager, document.encryptedWithKeyManager) &&
        Objects.equals(documentBase64, document.documentBase64) &&
        Objects.equals(applyAnchorTabs, document.applyAnchorTabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, uri, remoteUrl, name, password, transformPdfFields, fileExtension, matchBoxes, order, pages, documentFields, encryptedWithKeyManager, documentBase64, applyAnchorTabs);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    documentId: ").append(StringUtil.toIndentedString(documentId)).append("\n");
    sb.append("    uri: ").append(StringUtil.toIndentedString(uri)).append("\n");
    sb.append("    remoteUrl: ").append(StringUtil.toIndentedString(remoteUrl)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    password: ").append(StringUtil.toIndentedString(password)).append("\n");
    sb.append("    transformPdfFields: ").append(StringUtil.toIndentedString(transformPdfFields)).append("\n");
    sb.append("    fileExtension: ").append(StringUtil.toIndentedString(fileExtension)).append("\n");
    sb.append("    matchBoxes: ").append(StringUtil.toIndentedString(matchBoxes)).append("\n");
    sb.append("    order: ").append(StringUtil.toIndentedString(order)).append("\n");
    sb.append("    pages: ").append(StringUtil.toIndentedString(pages)).append("\n");
    sb.append("    documentFields: ").append(StringUtil.toIndentedString(documentFields)).append("\n");
    sb.append("    encryptedWithKeyManager: ").append(StringUtil.toIndentedString(encryptedWithKeyManager)).append("\n");
    sb.append("    documentBase64: ").append(StringUtil.toIndentedString(documentBase64)).append("\n");
    sb.append("    applyAnchorTabs: ").append(StringUtil.toIndentedString(applyAnchorTabs)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
