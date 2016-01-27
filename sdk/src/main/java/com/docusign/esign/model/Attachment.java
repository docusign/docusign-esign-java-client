package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class Attachment   {
  
  private String label = null;
  private String attachmentType = null;

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * Specifies the type of the attachment for the recipient.
   **/
  @ApiModelProperty(value = "Specifies the type of the attachment for the recipient.")
  @JsonProperty("attachmentType")
  public String getAttachmentType() {
    return attachmentType;
  }
  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(label, attachment.label) &&
        Objects.equals(attachmentType, attachment.attachmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, attachmentType);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    label: ").append(StringUtil.toIndentedString(label)).append("\n");
    sb.append("    attachmentType: ").append(StringUtil.toIndentedString(attachmentType)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
