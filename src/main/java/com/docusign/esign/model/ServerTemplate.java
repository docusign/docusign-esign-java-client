package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ServerTemplate
 */

public class ServerTemplate {
  @JsonProperty("sequence")
  private String sequence = null;

  @JsonProperty("templateId")
  private String templateId = null;

  public ServerTemplate sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * 
   * @return sequence
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public ServerTemplate templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   * @return templateId
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerTemplate serverTemplate = (ServerTemplate) o;
    return Objects.equals(this.sequence, serverTemplate.sequence) &&
        Objects.equals(this.templateId, serverTemplate.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerTemplate {\n");
    
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

