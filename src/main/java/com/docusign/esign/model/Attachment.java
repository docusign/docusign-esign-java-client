package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about an attachment.
 */
@ApiModel(description = "Contains information about an attachment.")

public class Attachment {
  @JsonProperty("accessControl")
  private String accessControl = null;

  @JsonProperty("attachmentId")
  private String attachmentId = null;

  @JsonProperty("attachmentType")
  private String attachmentType = null;

  @JsonProperty("data")
  private String data = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("remoteUrl")
  private String remoteUrl = null;

  public Attachment accessControl(String accessControl) {
    this.accessControl = accessControl;
    return this;
  }

   /**
   * 
   * @return accessControl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAccessControl() {
    return accessControl;
  }

  public void setAccessControl(String accessControl) {
    this.accessControl = accessControl;
  }

  public Attachment attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * 
   * @return attachmentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAttachmentId() {
    return attachmentId;
  }

  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  public Attachment attachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

   /**
   * Specifies the type of the attachment for the recipient.
   * @return attachmentType
  **/
  @ApiModelProperty(example = "null", value = "Specifies the type of the attachment for the recipient.")
  public String getAttachmentType() {
    return attachmentType;
  }

  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }

  public Attachment data(String data) {
    this.data = data;
    return this;
  }

   /**
   * 
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Attachment label(String label) {
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Attachment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Attachment remoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
    return this;
  }

   /**
   * 
   * @return remoteUrl
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.accessControl, attachment.accessControl) &&
        Objects.equals(this.attachmentId, attachment.attachmentId) &&
        Objects.equals(this.attachmentType, attachment.attachmentType) &&
        Objects.equals(this.data, attachment.data) &&
        Objects.equals(this.label, attachment.label) &&
        Objects.equals(this.name, attachment.name) &&
        Objects.equals(this.remoteUrl, attachment.remoteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControl, attachmentId, attachmentType, data, label, name, remoteUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

