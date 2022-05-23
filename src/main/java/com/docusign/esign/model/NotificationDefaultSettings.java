package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NotificationDefaultSettings. */
public class NotificationDefaultSettings {
  @JsonProperty("senderEmailNotifications")
  private SenderEmailNotifications senderEmailNotifications = null;

  @JsonProperty("signerEmailNotifications")
  private SignerEmailNotifications signerEmailNotifications = null;

  /**
   * senderEmailNotifications.
   *
   * @return NotificationDefaultSettings
   */
  public NotificationDefaultSettings senderEmailNotifications(
      SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
    return this;
  }

  /**
   * Get senderEmailNotifications.
   *
   * @return senderEmailNotifications
   */
  @ApiModelProperty(value = "")
  public SenderEmailNotifications getSenderEmailNotifications() {
    return senderEmailNotifications;
  }

  /** setSenderEmailNotifications. */
  public void setSenderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
  }

  /**
   * signerEmailNotifications.
   *
   * @return NotificationDefaultSettings
   */
  public NotificationDefaultSettings signerEmailNotifications(
      SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
    return this;
  }

  /**
   * Get signerEmailNotifications.
   *
   * @return signerEmailNotifications
   */
  @ApiModelProperty(value = "")
  public SignerEmailNotifications getSignerEmailNotifications() {
    return signerEmailNotifications;
  }

  /** setSignerEmailNotifications. */
  public void setSignerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
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
    NotificationDefaultSettings notificationDefaultSettings = (NotificationDefaultSettings) o;
    return Objects.equals(
            this.senderEmailNotifications, notificationDefaultSettings.senderEmailNotifications)
        && Objects.equals(
            this.signerEmailNotifications, notificationDefaultSettings.signerEmailNotifications);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(senderEmailNotifications, signerEmailNotifications);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationDefaultSettings {\n");

    sb.append("    senderEmailNotifications: ")
        .append(toIndentedString(senderEmailNotifications))
        .append("\n");
    sb.append("    signerEmailNotifications: ")
        .append(toIndentedString(signerEmailNotifications))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
