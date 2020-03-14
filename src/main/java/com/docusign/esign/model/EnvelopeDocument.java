package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.SignatureType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeDocument
 */

public class EnvelopeDocument {
  @JsonProperty("attachmentTabId")
  private String attachmentTabId = null;

  @JsonProperty("authoritativeCopy")
  private String authoritativeCopy = null;

  @JsonProperty("availableDocumentTypes")
  private java.util.List<SignatureType> availableDocumentTypes = new java.util.ArrayList<SignatureType>();

  @JsonProperty("containsPdfFormFields")
  private String containsPdfFormFields = null;

  @JsonProperty("display")
  private String display = null;

  @JsonProperty("documentFields")
  private java.util.List<NameValue> documentFields = new java.util.ArrayList<NameValue>();

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("includeInDownload")
  private String includeInDownload = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("pages")
  private String pages = null;

  @JsonProperty("signerMustAcknowledge")
  private String signerMustAcknowledge = null;

  @JsonProperty("sizeBytes")
  private String sizeBytes = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uri")
  private String uri = null;

  public EnvelopeDocument attachmentTabId(String attachmentTabId) {
    this.attachmentTabId = attachmentTabId;
    return this;
  }

   /**
   * 
   * @return attachmentTabId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAttachmentTabId() {
    return attachmentTabId;
  }

  public void setAttachmentTabId(String attachmentTabId) {
    this.attachmentTabId = attachmentTabId;
  }

  public EnvelopeDocument authoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
    return this;
  }

   /**
   * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.
   * @return authoritativeCopy
  **/
  @ApiModelProperty(example = "null", value = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
  public String getAuthoritativeCopy() {
    return authoritativeCopy;
  }

  public void setAuthoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
  }

  public EnvelopeDocument availableDocumentTypes(java.util.List<SignatureType> availableDocumentTypes) {
    this.availableDocumentTypes = availableDocumentTypes;
    return this;
  }

  public EnvelopeDocument addAvailableDocumentTypesItem(SignatureType availableDocumentTypesItem) {
    this.availableDocumentTypes.add(availableDocumentTypesItem);
    return this;
  }

   /**
   * 
   * @return availableDocumentTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<SignatureType> getAvailableDocumentTypes() {
    return availableDocumentTypes;
  }

  public void setAvailableDocumentTypes(java.util.List<SignatureType> availableDocumentTypes) {
    this.availableDocumentTypes = availableDocumentTypes;
  }

  public EnvelopeDocument containsPdfFormFields(String containsPdfFormFields) {
    this.containsPdfFormFields = containsPdfFormFields;
    return this;
  }

   /**
   * 
   * @return containsPdfFormFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContainsPdfFormFields() {
    return containsPdfFormFields;
  }

  public void setContainsPdfFormFields(String containsPdfFormFields) {
    this.containsPdfFormFields = containsPdfFormFields;
  }

  public EnvelopeDocument display(String display) {
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

  public EnvelopeDocument documentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
    return this;
  }

  public EnvelopeDocument addDocumentFieldsItem(NameValue documentFieldsItem) {
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

  public EnvelopeDocument documentId(String documentId) {
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

  public EnvelopeDocument errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public EnvelopeDocument includeInDownload(String includeInDownload) {
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

  public EnvelopeDocument name(String name) {
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

  public EnvelopeDocument order(String order) {
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

  public EnvelopeDocument pages(String pages) {
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

  public EnvelopeDocument signerMustAcknowledge(String signerMustAcknowledge) {
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

  public EnvelopeDocument sizeBytes(String sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

   /**
   * 
   * @return sizeBytes
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(String sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  public EnvelopeDocument type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EnvelopeDocument uri(String uri) {
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
    EnvelopeDocument envelopeDocument = (EnvelopeDocument) o;
    return Objects.equals(this.attachmentTabId, envelopeDocument.attachmentTabId) &&
        Objects.equals(this.authoritativeCopy, envelopeDocument.authoritativeCopy) &&
        Objects.equals(this.availableDocumentTypes, envelopeDocument.availableDocumentTypes) &&
        Objects.equals(this.containsPdfFormFields, envelopeDocument.containsPdfFormFields) &&
        Objects.equals(this.display, envelopeDocument.display) &&
        Objects.equals(this.documentFields, envelopeDocument.documentFields) &&
        Objects.equals(this.documentId, envelopeDocument.documentId) &&
        Objects.equals(this.errorDetails, envelopeDocument.errorDetails) &&
        Objects.equals(this.includeInDownload, envelopeDocument.includeInDownload) &&
        Objects.equals(this.name, envelopeDocument.name) &&
        Objects.equals(this.order, envelopeDocument.order) &&
        Objects.equals(this.pages, envelopeDocument.pages) &&
        Objects.equals(this.signerMustAcknowledge, envelopeDocument.signerMustAcknowledge) &&
        Objects.equals(this.sizeBytes, envelopeDocument.sizeBytes) &&
        Objects.equals(this.type, envelopeDocument.type) &&
        Objects.equals(this.uri, envelopeDocument.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentTabId, authoritativeCopy, availableDocumentTypes, containsPdfFormFields, display, documentFields, documentId, errorDetails, includeInDownload, name, order, pages, signerMustAcknowledge, sizeBytes, type, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocument {\n");
    
    sb.append("    attachmentTabId: ").append(toIndentedString(attachmentTabId)).append("\n");
    sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
    sb.append("    availableDocumentTypes: ").append(toIndentedString(availableDocumentTypes)).append("\n");
    sb.append("    containsPdfFormFields: ").append(toIndentedString(containsPdfFormFields)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    includeInDownload: ").append(toIndentedString(includeInDownload)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    signerMustAcknowledge: ").append(toIndentedString(signerMustAcknowledge)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
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

