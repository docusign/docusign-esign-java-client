package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class ServerTemplate   {
  
  private String sequence = null;
  private String templateId = null;

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sequence")
  public String getSequence() {
    return sequence;
  }
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerTemplate serverTemplate = (ServerTemplate) o;
    return Objects.equals(sequence, serverTemplate.sequence) &&
        Objects.equals(templateId, serverTemplate.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, templateId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerTemplate {\n");
    
    sb.append("    sequence: ").append(StringUtil.toIndentedString(sequence)).append("\n");
    sb.append("    templateId: ").append(StringUtil.toIndentedString(templateId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
