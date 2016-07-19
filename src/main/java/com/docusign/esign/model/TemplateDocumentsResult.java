package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EnvelopeDocument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class TemplateDocumentsResult   {
  
  private String templateId = null;
  private java.util.List<EnvelopeDocument> templateDocuments = new java.util.ArrayList<EnvelopeDocument>();

  
  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   **/
  public TemplateDocumentsResult templateId(String templateId) {
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
  public TemplateDocumentsResult templateDocuments(java.util.List<EnvelopeDocument> templateDocuments) {
    this.templateDocuments = templateDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("templateDocuments")
  public java.util.List<EnvelopeDocument> getTemplateDocuments() {
    return templateDocuments;
  }
  public void setTemplateDocuments(java.util.List<EnvelopeDocument> templateDocuments) {
    this.templateDocuments = templateDocuments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateDocumentsResult templateDocumentsResult = (TemplateDocumentsResult) o;
    return Objects.equals(this.templateId, templateDocumentsResult.templateId) &&
        Objects.equals(this.templateDocuments, templateDocumentsResult.templateDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, templateDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDocumentsResult {\n");
    
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateDocuments: ").append(toIndentedString(templateDocuments)).append("\n");
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

