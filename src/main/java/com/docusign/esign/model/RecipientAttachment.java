package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class RecipientAttachment   {
  
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
    RecipientAttachment recipientAttachment = (RecipientAttachment) o;

    return true && Objects.equals(attachmentId, recipientAttachment.attachmentId) &&
        Objects.equals(attachmentType, recipientAttachment.attachmentType) &&
        Objects.equals(data, recipientAttachment.data) &&
        Objects.equals(label, recipientAttachment.label) &&
        Objects.equals(name, recipientAttachment.name) &&
        Objects.equals(remoteUrl, recipientAttachment.remoteUrl)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, attachmentType, data, label, name, remoteUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientAttachment {\n");
    
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

