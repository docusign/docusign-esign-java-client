package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EnvelopeAttachment. */
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

  /**
   * accessControl.
   *
   * @return EnvelopeAttachment
   */
  public EnvelopeAttachment accessControl(String accessControl) {
    this.accessControl = accessControl;
    return this;
  }

  /**
   * .
   *
   * @return accessControl
   */
  @ApiModelProperty(value = "")
  public String getAccessControl() {
    return accessControl;
  }

  /** setAccessControl. */
  public void setAccessControl(String accessControl) {
    this.accessControl = accessControl;
  }

  /**
   * attachmentId.
   *
   * @return EnvelopeAttachment
   */
  public EnvelopeAttachment attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  /**
   * .
   *
   * @return attachmentId
   */
  @ApiModelProperty(value = "")
  public String getAttachmentId() {
    return attachmentId;
  }

  /** setAttachmentId. */
  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  /**
   * attachmentType.
   *
   * @return EnvelopeAttachment
   */
  public EnvelopeAttachment attachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

  /**
   * .
   *
   * @return attachmentType
   */
  @ApiModelProperty(value = "")
  public String getAttachmentType() {
    return attachmentType;
  }

  /** setAttachmentType. */
  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }

  /**
   * errorDetails.
   *
   * @return EnvelopeAttachment
   */
  public EnvelopeAttachment errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   *
   * @return errorDetails
   */
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /** setErrorDetails. */
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  /**
   * label.
   *
   * @return EnvelopeAttachment
   */
  public EnvelopeAttachment label(String label) {
    this.label = label;
    return this;
  }

  /**
   * .
   *
   * @return label
   */
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  /** setLabel. */
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * name.
   *
   * @return EnvelopeAttachment
   */
  public EnvelopeAttachment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /** setName. */
  public void setName(String name) {
    this.name = name;
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
    EnvelopeAttachment envelopeAttachment = (EnvelopeAttachment) o;
    return Objects.equals(this.accessControl, envelopeAttachment.accessControl)
        && Objects.equals(this.attachmentId, envelopeAttachment.attachmentId)
        && Objects.equals(this.attachmentType, envelopeAttachment.attachmentType)
        && Objects.equals(this.errorDetails, envelopeAttachment.errorDetails)
        && Objects.equals(this.label, envelopeAttachment.label)
        && Objects.equals(this.name, envelopeAttachment.name);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(accessControl, attachmentId, attachmentType, errorDetails, label, name);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
