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
 * TemplateSummary.
 *
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


  /**
   * applied.
   *
   * @return TemplateSummary
   **/
  public TemplateSummary applied(String applied) {
    this.applied = applied;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return applied
   **/
  @ApiModelProperty(value = "Reserved: TBD")
  public String getApplied() {
    return applied;
  }

  /**
   * setApplied.
   **/
  public void setApplied(String applied) {
    this.applied = applied;
  }


  /**
   * documentId.
   *
   * @return TemplateSummary
   **/
  public TemplateSummary documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute..
   * @return documentId
   **/
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
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
   * documentName.
   *
   * @return TemplateSummary
   **/
  public TemplateSummary documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * .
   * @return documentName
   **/
  @ApiModelProperty(value = "")
  public String getDocumentName() {
    return documentName;
  }

  /**
   * setDocumentName.
   **/
  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }


  /**
   * errorDetails.
   *
   * @return TemplateSummary
   **/
  public TemplateSummary errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @ApiModelProperty(value = "")
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
   * name.
   *
   * @return TemplateSummary
   **/
  public TemplateSummary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @ApiModelProperty(value = "")
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
   * templateId.
   *
   * @return TemplateSummary
   **/
  public TemplateSummary templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. .
   * @return templateId
   **/
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  /**
   * setTemplateId.
   **/
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  /**
   * templateMatch.
   *
   * @return TemplateSummary
   **/
  public TemplateSummary templateMatch(TemplateMatch templateMatch) {
    this.templateMatch = templateMatch;
    return this;
  }

  /**
   * Get templateMatch.
   * @return templateMatch
   **/
  @ApiModelProperty(value = "")
  public TemplateMatch getTemplateMatch() {
    return templateMatch;
  }

  /**
   * setTemplateMatch.
   **/
  public void setTemplateMatch(TemplateMatch templateMatch) {
    this.templateMatch = templateMatch;
  }


  /**
   * uri.
   *
   * @return TemplateSummary
   **/
  public TemplateSummary uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @ApiModelProperty(value = "")
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(applied, documentId, documentName, errorDetails, name, templateId, templateMatch, uri);
  }


  /**
   * Converts the given object to string.
   */
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

