package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.TemplateSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class TemplateInformation   {
  
  private java.util.List<TemplateSummary> templates = new java.util.ArrayList<TemplateSummary>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("templates")
  public java.util.List<TemplateSummary> getTemplates() {
    return templates;
  }
  public void setTemplates(java.util.List<TemplateSummary> templates) {
    this.templates = templates;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateInformation templateInformation = (TemplateInformation) o;

    return true && Objects.equals(templates, templateInformation.templates)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateInformation {\n");
    
    if (templates != null)
      sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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

