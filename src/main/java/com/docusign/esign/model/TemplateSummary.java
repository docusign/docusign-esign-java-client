package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.TemplateMatch;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSummary templateSummary = (TemplateSummary) o;

    return true && Objects.equals(templateId, templateSummary.templateId) &&
        Objects.equals(name, templateSummary.name) &&
        Objects.equals(documentId, templateSummary.documentId) &&
        Objects.equals(documentName, templateSummary.documentName) &&
        Objects.equals(applied, templateSummary.applied) &&
        Objects.equals(templateMatch, templateSummary.templateMatch) &&
        Objects.equals(uri, templateSummary.uri)
    ;
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

