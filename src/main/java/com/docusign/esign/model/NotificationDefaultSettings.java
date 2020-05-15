package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SenderEmailNotifications;
import com.docusign.esign.model.SignerEmailNotifications;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotificationDefaultSettings
 */

public class NotificationDefaultSettings {
  @JsonProperty("senderEmailNotifications")
  private SenderEmailNotifications senderEmailNotifications = null;

  @JsonProperty("signerEmailNotifications")
  private SignerEmailNotifications signerEmailNotifications = null;

  public NotificationDefaultSettings senderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
    return this;
  }

   /**
   * Get senderEmailNotifications
   * @return senderEmailNotifications
  **/
  @ApiModelProperty(value = "")
  public SenderEmailNotifications getSenderEmailNotifications() {
    return senderEmailNotifications;
  }

  public void setSenderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
  }

  public NotificationDefaultSettings signerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
    return this;
  }

   /**
   * Get signerEmailNotifications
   * @return signerEmailNotifications
  **/
  @ApiModelProperty(value = "")
  public SignerEmailNotifications getSignerEmailNotifications() {
    return signerEmailNotifications;
  }

  public void setSignerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationDefaultSettings notificationDefaultSettings = (NotificationDefaultSettings) o;
    return Objects.equals(this.senderEmailNotifications, notificationDefaultSettings.senderEmailNotifications) &&
        Objects.equals(this.signerEmailNotifications, notificationDefaultSettings.signerEmailNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderEmailNotifications, signerEmailNotifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationDefaultSettings {\n");
    
    sb.append("    senderEmailNotifications: ").append(toIndentedString(senderEmailNotifications)).append("\n");
    sb.append("    signerEmailNotifications: ").append(toIndentedString(signerEmailNotifications)).append("\n");
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

