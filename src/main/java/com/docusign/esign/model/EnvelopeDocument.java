package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.SignatureType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EnvelopeDocument   {
  
  private String attachmentTabId = null;
  private java.util.List<SignatureType> availableDocumentTypes = new java.util.ArrayList<SignatureType>();
  private String containsPdfFormFields = null;
  private String display = null;
  private java.util.List<NameValue> documentFields = new java.util.ArrayList<NameValue>();
  private String documentGroup = null;
  private String documentId = null;
  private ErrorDetails errorDetails = null;
  private String includeInDownload = null;
  private String name = null;
  private String order = null;
  private String pages = null;
  private String signerMustAcknowledge = null;
  private String templateLocked = null;
  private String templateRequired = null;
  private String type = null;
  private String uri = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attachmentTabId")
  public String getAttachmentTabId() {
    return attachmentTabId;
  }
  public void setAttachmentTabId(String attachmentTabId) {
    this.attachmentTabId = attachmentTabId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documentGroup")
  public String getDocumentGroup() {
    return documentGroup;
  }
  public void setDocumentGroup(String documentGroup) {
    this.documentGroup = documentGroup;
  }

  
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("includeInDownload")
  public String getIncludeInDownload() {
    return includeInDownload;
  }
  public void setIncludeInDownload(String includeInDownload) {
    this.includeInDownload = includeInDownload;
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
  @JsonProperty("signerMustAcknowledge")
  public String getSignerMustAcknowledge() {
    return signerMustAcknowledge;
  }
  public void setSignerMustAcknowledge(String signerMustAcknowledge) {
    this.signerMustAcknowledge = signerMustAcknowledge;
  }

  
  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.")
  @JsonProperty("templateLocked")
  public String getTemplateLocked() {
    return templateLocked;
  }
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  
  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  @JsonProperty("templateRequired")
  public String getTemplateRequired() {
    return templateRequired;
  }
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeDocument envelopeDocument = (EnvelopeDocument) o;

    return true && Objects.equals(attachmentTabId, envelopeDocument.attachmentTabId) &&
        Objects.equals(availableDocumentTypes, envelopeDocument.availableDocumentTypes) &&
        Objects.equals(containsPdfFormFields, envelopeDocument.containsPdfFormFields) &&
        Objects.equals(display, envelopeDocument.display) &&
        Objects.equals(documentFields, envelopeDocument.documentFields) &&
        Objects.equals(documentGroup, envelopeDocument.documentGroup) &&
        Objects.equals(documentId, envelopeDocument.documentId) &&
        Objects.equals(errorDetails, envelopeDocument.errorDetails) &&
        Objects.equals(includeInDownload, envelopeDocument.includeInDownload) &&
        Objects.equals(name, envelopeDocument.name) &&
        Objects.equals(order, envelopeDocument.order) &&
        Objects.equals(pages, envelopeDocument.pages) &&
        Objects.equals(signerMustAcknowledge, envelopeDocument.signerMustAcknowledge) &&
        Objects.equals(templateLocked, envelopeDocument.templateLocked) &&
        Objects.equals(templateRequired, envelopeDocument.templateRequired) &&
        Objects.equals(type, envelopeDocument.type) &&
        Objects.equals(uri, envelopeDocument.uri)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentTabId, availableDocumentTypes, containsPdfFormFields, display, documentFields, documentGroup, documentId, errorDetails, includeInDownload, name, order, pages, signerMustAcknowledge, templateLocked, templateRequired, type, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocument {\n");
    
    if (attachmentTabId != null)
      sb.append("    attachmentTabId: ").append(toIndentedString(attachmentTabId)).append("\n");
    if (availableDocumentTypes != null)
      sb.append("    availableDocumentTypes: ").append(toIndentedString(availableDocumentTypes)).append("\n");
    if (containsPdfFormFields != null)
      sb.append("    containsPdfFormFields: ").append(toIndentedString(containsPdfFormFields)).append("\n");
    if (display != null)
      sb.append("    display: ").append(toIndentedString(display)).append("\n");
    if (documentFields != null)
      sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
    if (documentGroup != null)
      sb.append("    documentGroup: ").append(toIndentedString(documentGroup)).append("\n");
    if (documentId != null)
      sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (includeInDownload != null)
      sb.append("    includeInDownload: ").append(toIndentedString(includeInDownload)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (order != null)
      sb.append("    order: ").append(toIndentedString(order)).append("\n");
    if (pages != null)
      sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    if (signerMustAcknowledge != null)
      sb.append("    signerMustAcknowledge: ").append(toIndentedString(signerMustAcknowledge)).append("\n");
    if (templateLocked != null)
      sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    if (templateRequired != null)
      sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    if (type != null)
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (uri != null)
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

