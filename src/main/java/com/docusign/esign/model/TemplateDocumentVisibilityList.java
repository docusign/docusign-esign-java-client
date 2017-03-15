package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.DocumentVisibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class TemplateDocumentVisibilityList   {
  
  private java.util.List<DocumentVisibility> documentVisibility = new java.util.ArrayList<DocumentVisibility>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documentVisibility")
  public java.util.List<DocumentVisibility> getDocumentVisibility() {
    return documentVisibility;
  }
  public void setDocumentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateDocumentVisibilityList templateDocumentVisibilityList = (TemplateDocumentVisibilityList) o;

    return true && Objects.equals(documentVisibility, templateDocumentVisibilityList.documentVisibility)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentVisibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDocumentVisibilityList {\n");
    
    if (documentVisibility != null)
      sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
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

