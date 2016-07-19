package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.TemplateSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class TemplateInformation   {
  
  private java.util.List<TemplateSummary> templates = new java.util.ArrayList<TemplateSummary>();

  
  /**
   * 
   **/
  public TemplateInformation templates(java.util.List<TemplateSummary> templates) {
    this.templates = templates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.templates, templateInformation.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateInformation {\n");
    
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

