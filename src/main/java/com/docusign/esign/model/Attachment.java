package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Contains information about an attachment..
 *
 */
@Schema(description = "Contains information about an attachment.")

public class Attachment implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * accessControl.
   *
   * @return Attachment
   **/
  public Attachment accessControl(String accessControl) {
    this.accessControl = accessControl;
    return this;
  }

  /**
   * .
   * @return accessControl
   **/
  @Schema(description = "")
  public String getAccessControl() {
    return accessControl;
  }

  /**
   * setAccessControl.
   **/
  public void setAccessControl(String accessControl) {
    this.accessControl = accessControl;
  }


  /**
   * attachmentId.
   *
   * @return Attachment
   **/
  public Attachment attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  /**
   * .
   * @return attachmentId
   **/
  @Schema(description = "")
  public String getAttachmentId() {
    return attachmentId;
  }

  /**
   * setAttachmentId.
   **/
  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }


  /**
   * attachmentType.
   *
   * @return Attachment
   **/
  public Attachment attachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

  /**
   * Specifies the type of the attachment for the recipient..
   * @return attachmentType
   **/
  @Schema(description = "Specifies the type of the attachment for the recipient.")
  public String getAttachmentType() {
    return attachmentType;
  }

  /**
   * setAttachmentType.
   **/
  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }


  /**
   * data.
   *
   * @return Attachment
   **/
  public Attachment data(String data) {
    this.data = data;
    return this;
  }

  /**
   * .
   * @return data
   **/
  @Schema(description = "")
  public String getData() {
    return data;
  }

  /**
   * setData.
   **/
  public void setData(String data) {
    this.data = data;
  }


  /**
   * label.
   *
   * @return Attachment
   **/
  public Attachment label(String label) {
    this.label = label;
    return this;
  }

  /**
   * .
   * @return label
   **/
  @Schema(description = "")
  public String getLabel() {
    return label;
  }

  /**
   * setLabel.
   **/
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * name.
   *
   * @return Attachment
   **/
  public Attachment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * remoteUrl.
   *
   * @return Attachment
   **/
  public Attachment remoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
    return this;
  }

  /**
   * .
   * @return remoteUrl
   **/
  @Schema(description = "")
  public String getRemoteUrl() {
    return remoteUrl;
  }

  /**
   * setRemoteUrl.
   **/
  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
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
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.accessControl, attachment.accessControl) &&
        Objects.equals(this.attachmentId, attachment.attachmentId) &&
        Objects.equals(this.attachmentType, attachment.attachmentType) &&
        Objects.equals(this.data, attachment.data) &&
        Objects.equals(this.label, attachment.label) &&
        Objects.equals(this.name, attachment.name) &&
        Objects.equals(this.remoteUrl, attachment.remoteUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessControl, attachmentId, attachmentType, data, label, name, remoteUrl);
  }


  /**
   * Converts the given object to string.
   */
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

