package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ServerTemplate.
 *
 */

public class ServerTemplate {
  @JsonProperty("sequence")
  private String sequence = null;

  @JsonProperty("templateId")
  private String templateId = null;


  /**
   * sequence.
   *
   * @return ServerTemplate
   **/
  public ServerTemplate sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * .
   * @return sequence
   **/
  @ApiModelProperty(value = "")
  public String getSequence() {
    return sequence;
  }

  /**
   * setSequence.
   **/
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  /**
   * templateId.
   *
   * @return ServerTemplate
   **/
  public ServerTemplate templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. .
   * @return templateId
   **/
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  /**
   * setTemplateId.
   **/
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(sequence, templateId);
  }


  /**
   * Converts the given object to string.
   */
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

