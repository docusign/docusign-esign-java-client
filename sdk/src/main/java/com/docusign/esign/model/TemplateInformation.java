package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.TemplateSummary;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateInformation templateInformation = (TemplateInformation) o;
    return Objects.equals(templates, templateInformation.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateInformation {\n");
    
    sb.append("    templates: ").append(StringUtil.toIndentedString(templates)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
