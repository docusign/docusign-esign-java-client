package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Attachment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * EnvelopeAttachmentsRequest.
 *
 */

public class EnvelopeAttachmentsRequest {
  @JsonProperty("attachments")
  private java.util.List<Attachment> attachments = null;


  /**
   * attachments.
   *
   * @return EnvelopeAttachmentsRequest
   **/
  public EnvelopeAttachmentsRequest attachments(java.util.List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
  
  /**
   * addAttachmentsItem.
   *
   * @return EnvelopeAttachmentsRequest
   **/
  public EnvelopeAttachmentsRequest addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new java.util.ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * .
   * @return attachments
   **/
  @Schema(description = "")
  public java.util.List<Attachment> getAttachments() {
    return attachments;
  }

  /**
   * setAttachments.
   **/
  public void setAttachments(java.util.List<Attachment> attachments) {
    this.attachments = attachments;
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
    EnvelopeAttachmentsRequest envelopeAttachmentsRequest = (EnvelopeAttachmentsRequest) o;
    return Objects.equals(this.attachments, envelopeAttachmentsRequest.attachments);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(attachments);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAttachmentsRequest {\n");
    
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

