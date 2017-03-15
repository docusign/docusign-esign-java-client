package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Attachment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EnvelopeAttachmentsRequest   {
  
  private java.util.List<Attachment> attachments = new java.util.ArrayList<Attachment>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attachments")
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

    return true && Objects.equals(attachments, envelopeAttachmentsRequest.attachments)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAttachmentsRequest {\n");
    
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

