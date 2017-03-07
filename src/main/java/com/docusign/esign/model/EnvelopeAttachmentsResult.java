package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EnvelopeAttachment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EnvelopeAttachmentsResult   {
  
  private java.util.List<EnvelopeAttachment> attachments = new java.util.ArrayList<EnvelopeAttachment>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attachments")
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

    return true && Objects.equals(attachments, envelopeAttachmentsResult.attachments)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAttachmentsResult {\n");
    
    if (attachments != null)
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

