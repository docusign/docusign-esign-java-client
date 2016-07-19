package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.TemplateMatch;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class TemplateSummary   {
  
  private String templateId = null;
  private String name = null;
  private String documentId = null;
  private String documentName = null;
  private String applied = null;
  private TemplateMatch templateMatch = null;
  private String uri = null;

  
  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   **/
  public TemplateSummary templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  
  /**
   * 
   **/
  public TemplateSummary name(String name) {
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
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   **/
  public TemplateSummary documentId(String documentId) {
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
  public TemplateSummary documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentName")
  public String getDocumentName() {
    return documentName;
  }
  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  
  /**
   * Reserved: TBD
   **/
  public TemplateSummary applied(String applied) {
    this.applied = applied;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  @JsonProperty("applied")
  public String getApplied() {
    return applied;
  }
  public void setApplied(String applied) {
    this.applied = applied;
  }

  
  /**
   **/
  public TemplateSummary templateMatch(TemplateMatch templateMatch) {
    this.templateMatch = templateMatch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("templateMatch")
  public TemplateMatch getTemplateMatch() {
    return templateMatch;
  }
  public void setTemplateMatch(TemplateMatch templateMatch) {
    this.templateMatch = templateMatch;
  }

  
  /**
   * 
   **/
  public TemplateSummary uri(String uri) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSummary templateSummary = (TemplateSummary) o;
    return Objects.equals(this.templateId, templateSummary.templateId) &&
        Objects.equals(this.name, templateSummary.name) &&
        Objects.equals(this.documentId, templateSummary.documentId) &&
        Objects.equals(this.documentName, templateSummary.documentName) &&
        Objects.equals(this.applied, templateSummary.applied) &&
        Objects.equals(this.templateMatch, templateSummary.templateMatch) &&
        Objects.equals(this.uri, templateSummary.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, name, documentId, documentName, applied, templateMatch, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSummary {\n");
    
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
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

