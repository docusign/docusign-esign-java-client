package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.TemplateMatch;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TemplateSummary
 */

public class TemplateSummary {
  @JsonProperty("applied")
  private String applied = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentName")
  private String documentName = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("templateMatch")
  private TemplateMatch templateMatch = null;

  @JsonProperty("uri")
  private String uri = null;

  public TemplateSummary applied(String applied) {
    this.applied = applied;
    return this;
  }

   /**
   * Reserved: TBD
   * @return applied
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public String getApplied() {
    return applied;
  }

  public void setApplied(String applied) {
    this.applied = applied;
  }

  public TemplateSummary documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   * @return documentId
  **/
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public TemplateSummary documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

   /**
   * 
   * @return documentName
  **/
  @ApiModelProperty(value = "")
  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public TemplateSummary errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public TemplateSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TemplateSummary templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   * @return templateId
  **/
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public TemplateSummary templateMatch(TemplateMatch templateMatch) {
    this.templateMatch = templateMatch;
    return this;
  }

   /**
   * Get templateMatch
   * @return templateMatch
  **/
  @ApiModelProperty(value = "")
  public TemplateMatch getTemplateMatch() {
    return templateMatch;
  }

  public void setTemplateMatch(TemplateMatch templateMatch) {
    this.templateMatch = templateMatch;
  }

  public TemplateSummary uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(value = "")
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
    TemplateSummary templateSummary = (TemplateSummary) o;
    return Objects.equals(this.applied, templateSummary.applied) &&
        Objects.equals(this.documentId, templateSummary.documentId) &&
        Objects.equals(this.documentName, templateSummary.documentName) &&
        Objects.equals(this.errorDetails, templateSummary.errorDetails) &&
        Objects.equals(this.name, templateSummary.name) &&
        Objects.equals(this.templateId, templateSummary.templateId) &&
        Objects.equals(this.templateMatch, templateSummary.templateMatch) &&
        Objects.equals(this.uri, templateSummary.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applied, documentId, documentName, errorDetails, name, templateId, templateMatch, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSummary {\n");
    
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateMatch: ").append(toIndentedString(templateMatch)).append("\n");
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

