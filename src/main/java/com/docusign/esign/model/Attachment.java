package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about an attachment.
 **/

@ApiModel(description = "Contains information about an attachment.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Attachment   {
  
  private String accessControl = null;
  private String attachmentId = null;
  private String attachmentType = null;
  private String data = null;
  private String label = null;
  private String name = null;
  private String remoteUrl = null;

  
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

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
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

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("remoteUrl")
  public String getRemoteUrl() {
    return remoteUrl;
  }
  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
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

    return true && Objects.equals(accessControl, attachment.accessControl) &&
        Objects.equals(attachmentId, attachment.attachmentId) &&
        Objects.equals(attachmentType, attachment.attachmentType) &&
        Objects.equals(data, attachment.data) &&
        Objects.equals(label, attachment.label) &&
        Objects.equals(name, attachment.name) &&
        Objects.equals(remoteUrl, attachment.remoteUrl)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControl, attachmentId, attachmentType, data, label, name, remoteUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    if (accessControl != null)
      sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
    if (attachmentId != null)
      sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    if (attachmentType != null)
      sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    if (data != null)
      sb.append("    data: ").append(toIndentedString(data)).append("\n");
    if (label != null)
      sb.append("    label: ").append(toIndentedString(label)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (remoteUrl != null)
      sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
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

