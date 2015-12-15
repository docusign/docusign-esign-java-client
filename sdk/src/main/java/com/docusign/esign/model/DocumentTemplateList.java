package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.DocumentTemplate;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class DocumentTemplateList   {
  
  private java.util.List<DocumentTemplate> documentTemplates = new java.util.ArrayList<DocumentTemplate>();

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("documentTemplates")
  public java.util.List<DocumentTemplate> getDocumentTemplates() {
    return documentTemplates;
  }
  public void setDocumentTemplates(java.util.List<DocumentTemplate> documentTemplates) {
    this.documentTemplates = documentTemplates;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTemplateList documentTemplateList = (DocumentTemplateList) o;
    return Objects.equals(documentTemplates, documentTemplateList.documentTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentTemplates);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTemplateList {\n");
    
    sb.append("    documentTemplates: ").append(StringUtil.toIndentedString(documentTemplates)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
