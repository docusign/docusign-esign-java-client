package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.EnvelopeDocument;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class TemplateDocumentsResult   {
  
  private String templateId = null;
  private java.util.List<EnvelopeDocument> templateDocuments = new java.util.ArrayList<EnvelopeDocument>();

  
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
  @JsonProperty("templateDocuments")
  public java.util.List<EnvelopeDocument> getTemplateDocuments() {
    return templateDocuments;
  }
  public void setTemplateDocuments(java.util.List<EnvelopeDocument> templateDocuments) {
    this.templateDocuments = templateDocuments;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateDocumentsResult templateDocumentsResult = (TemplateDocumentsResult) o;
    return Objects.equals(templateId, templateDocumentsResult.templateId) &&
        Objects.equals(templateDocuments, templateDocumentsResult.templateDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, templateDocuments);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDocumentsResult {\n");
    
    sb.append("    templateId: ").append(StringUtil.toIndentedString(templateId)).append("\n");
    sb.append("    templateDocuments: ").append(StringUtil.toIndentedString(templateDocuments)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
