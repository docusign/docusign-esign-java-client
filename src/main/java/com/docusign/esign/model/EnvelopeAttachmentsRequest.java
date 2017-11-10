package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Attachment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeAttachmentsRequest
 */

public class EnvelopeAttachmentsRequest {
  @JsonProperty("attachments")
  private java.util.List<Attachment> attachments = new java.util.ArrayList<Attachment>();

  public EnvelopeAttachmentsRequest attachments(java.util.List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public EnvelopeAttachmentsRequest addAttachmentsItem(Attachment attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * 
   * @return attachments
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(java.util.List<Attachment> attachments) {
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
    EnvelopeAttachmentsRequest envelopeAttachmentsRequest = (EnvelopeAttachmentsRequest) o;
    return Objects.equals(this.attachments, envelopeAttachmentsRequest.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments);
  }


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

