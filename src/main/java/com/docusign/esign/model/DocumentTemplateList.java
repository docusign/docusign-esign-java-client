package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.DocumentTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class DocumentTemplateList   {
  
  private java.util.List<DocumentTemplate> documentTemplates = new java.util.ArrayList<DocumentTemplate>();

  
  /**
   * 
   **/
  public DocumentTemplateList documentTemplates(java.util.List<DocumentTemplate> documentTemplates) {
    this.documentTemplates = documentTemplates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentTemplates")
  public java.util.List<DocumentTemplate> getDocumentTemplates() {
    return documentTemplates;
  }
  public void setDocumentTemplates(java.util.List<DocumentTemplate> documentTemplates) {
    this.documentTemplates = documentTemplates;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTemplateList documentTemplateList = (DocumentTemplateList) o;
    return Objects.equals(this.documentTemplates, documentTemplateList.documentTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTemplateList {\n");
    
    sb.append("    documentTemplates: ").append(toIndentedString(documentTemplates)).append("\n");
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

