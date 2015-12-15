package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.TemplateMatch;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("applied")
  public String getApplied() {
    return applied;
  }
  public void setApplied(String applied) {
    this.applied = applied;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSummary templateSummary = (TemplateSummary) o;
    return Objects.equals(templateId, templateSummary.templateId) &&
        Objects.equals(name, templateSummary.name) &&
        Objects.equals(documentId, templateSummary.documentId) &&
        Objects.equals(documentName, templateSummary.documentName) &&
        Objects.equals(applied, templateSummary.applied) &&
        Objects.equals(templateMatch, templateSummary.templateMatch) &&
        Objects.equals(uri, templateSummary.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, name, documentId, documentName, applied, templateMatch, uri);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSummary {\n");
    
    sb.append("    templateId: ").append(StringUtil.toIndentedString(templateId)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    documentId: ").append(StringUtil.toIndentedString(documentId)).append("\n");
    sb.append("    documentName: ").append(StringUtil.toIndentedString(documentName)).append("\n");
    sb.append("    applied: ").append(StringUtil.toIndentedString(applied)).append("\n");
    sb.append("    templateMatch: ").append(StringUtil.toIndentedString(templateMatch)).append("\n");
    sb.append("    uri: ").append(StringUtil.toIndentedString(uri)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
