package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SenderEmailNotifications;
import com.docusign.esign.model.SignerEmailNotifications;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains details about the default notification settings for the envelope notifications that senders and signers receive..
 *
 */
@Schema(description = "Contains details about the default notification settings for the envelope notifications that senders and signers receive.")

public class NotificationDefaultSettings {
  @JsonProperty("senderEmailNotifications")
  private SenderEmailNotifications senderEmailNotifications = null;

  @JsonProperty("signerEmailNotifications")
  private SignerEmailNotifications signerEmailNotifications = null;


  /**
   * senderEmailNotifications.
   *
   * @return NotificationDefaultSettings
   **/
  public NotificationDefaultSettings senderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
    return this;
  }

  /**
   *   An array of email notifications that sets the email the user receives when they are a sender. When the specific email notification is set to true, the user will receive those types of email notifications from DocuSign.   The user inherits the default account sender email notification settings when the user is created. The email notifications are:  * envelopeComplete * changedSigner  * senderEnvelopeDeclined  * withdrawnConsent  * recipientViewed  * deliveryFailed   .
   * @return senderEmailNotifications
   **/
  @Schema(description = "  An array of email notifications that sets the email the user receives when they are a sender. When the specific email notification is set to true, the user will receive those types of email notifications from DocuSign.   The user inherits the default account sender email notification settings when the user is created. The email notifications are:  * envelopeComplete * changedSigner  * senderEnvelopeDeclined  * withdrawnConsent  * recipientViewed  * deliveryFailed   ")
  public SenderEmailNotifications getSenderEmailNotifications() {
    return senderEmailNotifications;
  }

  /**
   * setSenderEmailNotifications.
   **/
  public void setSenderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
  }


  /**
   * signerEmailNotifications.
   *
   * @return NotificationDefaultSettings
   **/
  public NotificationDefaultSettings signerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
    return this;
  }

  /**
   * An array of email notifications that specifies the email the user receives when they are a recipient. When the specific email notification is set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account email notification settings when the user is created. .
   * @return signerEmailNotifications
   **/
  @Schema(description = "An array of email notifications that specifies the email the user receives when they are a recipient. When the specific email notification is set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account email notification settings when the user is created. ")
  public SignerEmailNotifications getSignerEmailNotifications() {
    return signerEmailNotifications;
  }

  /**
   * setSignerEmailNotifications.
   **/
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
    return Objects.equals(this.senderEmailNotifications, notificationDefaultSettings.senderEmailNotifications) &&
        Objects.equals(this.signerEmailNotifications, notificationDefaultSettings.signerEmailNotifications);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(senderEmailNotifications, signerEmailNotifications);
  }


  /**
   * Converts the given object to string.
   */
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

