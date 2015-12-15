package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.ErrorDetails;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class EnvelopeDocument   {
  
  private String documentId = null;
  private String name = null;
  private String type = null;
  private String uri = null;
  private String order = null;
  private String pages = null;
  private String containsPdfFormFields = null;
  private ErrorDetails errorDetails = null;

  
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
  @ApiModelProperty(value = "")
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
  @JsonProperty("containsPdfFormFields")
  public String getContainsPdfFormFields() {
    return containsPdfFormFields;
  }
  public void setContainsPdfFormFields(String containsPdfFormFields) {
    this.containsPdfFormFields = containsPdfFormFields;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeDocument envelopeDocument = (EnvelopeDocument) o;
    return Objects.equals(documentId, envelopeDocument.documentId) &&
        Objects.equals(name, envelopeDocument.name) &&
        Objects.equals(type, envelopeDocument.type) &&
        Objects.equals(uri, envelopeDocument.uri) &&
        Objects.equals(order, envelopeDocument.order) &&
        Objects.equals(pages, envelopeDocument.pages) &&
        Objects.equals(containsPdfFormFields, envelopeDocument.containsPdfFormFields) &&
        Objects.equals(errorDetails, envelopeDocument.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, name, type, uri, order, pages, containsPdfFormFields, errorDetails);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocument {\n");
    
    sb.append("    documentId: ").append(StringUtil.toIndentedString(documentId)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(StringUtil.toIndentedString(uri)).append("\n");
    sb.append("    order: ").append(StringUtil.toIndentedString(order)).append("\n");
    sb.append("    pages: ").append(StringUtil.toIndentedString(pages)).append("\n");
    sb.append("    containsPdfFormFields: ").append(StringUtil.toIndentedString(containsPdfFormFields)).append("\n");
    sb.append("    errorDetails: ").append(StringUtil.toIndentedString(errorDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
