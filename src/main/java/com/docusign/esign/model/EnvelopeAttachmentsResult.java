package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopeAttachment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeAttachmentsResult
 */

public class EnvelopeAttachmentsResult {
  @JsonProperty("attachments")
  private java.util.List<EnvelopeAttachment> attachments = null;

  public EnvelopeAttachmentsResult attachments(java.util.List<EnvelopeAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public EnvelopeAttachmentsResult addAttachmentsItem(EnvelopeAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new java.util.ArrayList<EnvelopeAttachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * 
   * @return attachments
  **/
  @ApiModelProperty(value = "")
  public java.util.List<EnvelopeAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(java.util.List<EnvelopeAttachment> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeAttachmentsResult envelopeAttachmentsResult = (EnvelopeAttachmentsResult) o;
    return Objects.equals(this.attachments, envelopeAttachmentsResult.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAttachmentsResult {\n");
    
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

