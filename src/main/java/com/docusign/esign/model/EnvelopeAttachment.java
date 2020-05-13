package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeAttachment
 */

public class EnvelopeAttachment {
  @JsonProperty("accessControl")
  private String accessControl = null;

  @JsonProperty("attachmentId")
  private String attachmentId = null;

  @JsonProperty("attachmentType")
  private String attachmentType = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("name")
  private String name = null;

  public EnvelopeAttachment accessControl(String accessControl) {
    this.accessControl = accessControl;
    return this;
  }

   /**
   * 
   * @return accessControl
  **/
  @ApiModelProperty(value = "")
  public String getAccessControl() {
    return accessControl;
  }

  public void setAccessControl(String accessControl) {
    this.accessControl = accessControl;
  }

  public EnvelopeAttachment attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * 
   * @return attachmentId
  **/
  @ApiModelProperty(value = "")
  public String getAttachmentId() {
    return attachmentId;
  }

  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  public EnvelopeAttachment attachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

   /**
   * 
   * @return attachmentType
  **/
  @ApiModelProperty(value = "")
  public String getAttachmentType() {
    return attachmentType;
  }

  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }

  public EnvelopeAttachment errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public EnvelopeAttachment label(String label) {
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public EnvelopeAttachment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeAttachment envelopeAttachment = (EnvelopeAttachment) o;
    return Objects.equals(this.accessControl, envelopeAttachment.accessControl) &&
        Objects.equals(this.attachmentId, envelopeAttachment.attachmentId) &&
        Objects.equals(this.attachmentType, envelopeAttachment.attachmentType) &&
        Objects.equals(this.errorDetails, envelopeAttachment.errorDetails) &&
        Objects.equals(this.label, envelopeAttachment.label) &&
        Objects.equals(this.name, envelopeAttachment.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControl, attachmentId, attachmentType, errorDetails, label, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAttachment {\n");
    
    sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

