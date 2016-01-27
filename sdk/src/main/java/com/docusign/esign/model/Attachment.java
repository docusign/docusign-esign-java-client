package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-18T16:25:36.433-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;

    return true && Objects.equals(label, attachment.label) &&
        Objects.equals(attachmentType, attachment.attachmentType)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, attachmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
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

