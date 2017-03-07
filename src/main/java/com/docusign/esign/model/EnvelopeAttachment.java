package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EnvelopeAttachment   {
  
  private String accessControl = null;
  private String attachmentId = null;
  private String attachmentType = null;
  private ErrorDetails errorDetails = null;
  private String label = null;
  private String name = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accessControl")
  public String getAccessControl() {
    return accessControl;
  }
  public void setAccessControl(String accessControl) {
    this.accessControl = accessControl;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attachmentId")
  public String getAttachmentId() {
    return attachmentId;
  }
  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attachmentType")
  public String getAttachmentType() {
    return attachmentType;
  }
  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
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

    return true && Objects.equals(accessControl, envelopeAttachment.accessControl) &&
        Objects.equals(attachmentId, envelopeAttachment.attachmentId) &&
        Objects.equals(attachmentType, envelopeAttachment.attachmentType) &&
        Objects.equals(errorDetails, envelopeAttachment.errorDetails) &&
        Objects.equals(label, envelopeAttachment.label) &&
        Objects.equals(name, envelopeAttachment.name)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControl, attachmentId, attachmentType, errorDetails, label, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeAttachment {\n");
    
    if (accessControl != null)
      sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
    if (attachmentId != null)
      sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    if (attachmentType != null)
      sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (label != null)
      sb.append("    label: ").append(toIndentedString(label)).append("\n");
    if (name != null)
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

