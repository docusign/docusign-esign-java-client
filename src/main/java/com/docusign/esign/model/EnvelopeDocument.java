package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.SignatureType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class EnvelopeDocument   {
  
  private String documentId = null;
  private String name = null;
  private String type = null;
  private String uri = null;
  private String order = null;
  private String pages = null;
  private String containsPdfFormFields = null;
  private java.util.List<NameValue> documentFields = new java.util.ArrayList<NameValue>();
  private java.util.List<SignatureType> availableDocumentTypes = new java.util.ArrayList<SignatureType>();
  private String attachmentTabId = null;
  private ErrorDetails errorDetails = null;

  
  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   **/
  public EnvelopeDocument documentId(String documentId) {
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
  public EnvelopeDocument name(String name) {
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
  public EnvelopeDocument type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * 
   **/
  public EnvelopeDocument uri(String uri) {
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
   * 
   **/
  public EnvelopeDocument order(String order) {
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
  public EnvelopeDocument pages(String pages) {
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
  public EnvelopeDocument containsPdfFormFields(String containsPdfFormFields) {
    this.containsPdfFormFields = containsPdfFormFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("containsPdfFormFields")
  public String getContainsPdfFormFields() {
    return containsPdfFormFields;
  }
  public void setContainsPdfFormFields(String containsPdfFormFields) {
    this.containsPdfFormFields = containsPdfFormFields;
  }

  
  /**
   * 
   **/
  public EnvelopeDocument documentFields(java.util.List<NameValue> documentFields) {
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
   * 
   **/
  public EnvelopeDocument availableDocumentTypes(java.util.List<SignatureType> availableDocumentTypes) {
    this.availableDocumentTypes = availableDocumentTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("availableDocumentTypes")
  public java.util.List<SignatureType> getAvailableDocumentTypes() {
    return availableDocumentTypes;
  }
  public void setAvailableDocumentTypes(java.util.List<SignatureType> availableDocumentTypes) {
    this.availableDocumentTypes = availableDocumentTypes;
  }

  
  /**
   * 
   **/
  public EnvelopeDocument attachmentTabId(String attachmentTabId) {
    this.attachmentTabId = attachmentTabId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attachmentTabId")
  public String getAttachmentTabId() {
    return attachmentTabId;
  }
  public void setAttachmentTabId(String attachmentTabId) {
    this.attachmentTabId = attachmentTabId;
  }

  
  /**
   **/
  public EnvelopeDocument errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
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
    return Objects.equals(this.documentId, envelopeDocument.documentId) &&
        Objects.equals(this.name, envelopeDocument.name) &&
        Objects.equals(this.type, envelopeDocument.type) &&
        Objects.equals(this.uri, envelopeDocument.uri) &&
        Objects.equals(this.order, envelopeDocument.order) &&
        Objects.equals(this.pages, envelopeDocument.pages) &&
        Objects.equals(this.containsPdfFormFields, envelopeDocument.containsPdfFormFields) &&
        Objects.equals(this.documentFields, envelopeDocument.documentFields) &&
        Objects.equals(this.availableDocumentTypes, envelopeDocument.availableDocumentTypes) &&
        Objects.equals(this.attachmentTabId, envelopeDocument.attachmentTabId) &&
        Objects.equals(this.errorDetails, envelopeDocument.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, name, type, uri, order, pages, containsPdfFormFields, documentFields, availableDocumentTypes, attachmentTabId, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocument {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    containsPdfFormFields: ").append(toIndentedString(containsPdfFormFields)).append("\n");
    sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
    sb.append("    availableDocumentTypes: ").append(toIndentedString(availableDocumentTypes)).append("\n");
    sb.append("    attachmentTabId: ").append(toIndentedString(attachmentTabId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

