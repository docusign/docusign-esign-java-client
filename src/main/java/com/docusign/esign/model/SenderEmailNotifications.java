package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Contains the settings for the email notifications that senders receive about the envelopes that they send..
 *
 */
@Schema(description = "Contains the settings for the email notifications that senders receive about the envelopes that they send.")

public class SenderEmailNotifications implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("changedSigner")
  private String changedSigner = null;

  @JsonProperty("clickwrapResponsesLimitNotificationEmail")
  private String clickwrapResponsesLimitNotificationEmail = null;

  @JsonProperty("commentsOnlyPrivateAndMention")
  private String commentsOnlyPrivateAndMention = null;

  @JsonProperty("commentsReceiveAll")
  private String commentsReceiveAll = null;

  @JsonProperty("deliveryFailed")
  private String deliveryFailed = null;

  @JsonProperty("envelopeComplete")
  private String envelopeComplete = null;

  @JsonProperty("offlineSigningFailed")
  private String offlineSigningFailed = null;

  @JsonProperty("powerformResponsesLimitNotificationEmail")
  private String powerformResponsesLimitNotificationEmail = null;

  @JsonProperty("purgeDocuments")
  private String purgeDocuments = null;

  @JsonProperty("recipientViewed")
  private String recipientViewed = null;

  @JsonProperty("senderEnvelopeDeclined")
  private String senderEnvelopeDeclined = null;

  @JsonProperty("withdrawnConsent")
  private String withdrawnConsent = null;


  /**
   * changedSigner.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications changedSigner(String changedSigner) {
    this.changedSigner = changedSigner;
    return this;
  }

  /**
   * When set to **true**, the sender receives notification if the signer changes..
   * @return changedSigner
   **/
  @Schema(description = "When set to **true**, the sender receives notification if the signer changes.")
  public String getChangedSigner() {
    return changedSigner;
  }

  /**
   * setChangedSigner.
   **/
  public void setChangedSigner(String changedSigner) {
    this.changedSigner = changedSigner;
  }


  /**
   * clickwrapResponsesLimitNotificationEmail.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications clickwrapResponsesLimitNotificationEmail(String clickwrapResponsesLimitNotificationEmail) {
    this.clickwrapResponsesLimitNotificationEmail = clickwrapResponsesLimitNotificationEmail;
    return this;
  }

  /**
   * .
   * @return clickwrapResponsesLimitNotificationEmail
   **/
  @Schema(description = "")
  public String getClickwrapResponsesLimitNotificationEmail() {
    return clickwrapResponsesLimitNotificationEmail;
  }

  /**
   * setClickwrapResponsesLimitNotificationEmail.
   **/
  public void setClickwrapResponsesLimitNotificationEmail(String clickwrapResponsesLimitNotificationEmail) {
    this.clickwrapResponsesLimitNotificationEmail = clickwrapResponsesLimitNotificationEmail;
  }


  /**
   * commentsOnlyPrivateAndMention.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications commentsOnlyPrivateAndMention(String commentsOnlyPrivateAndMention) {
    this.commentsOnlyPrivateAndMention = commentsOnlyPrivateAndMention;
    return this;
  }

  /**
   * .
   * @return commentsOnlyPrivateAndMention
   **/
  @Schema(description = "")
  public String getCommentsOnlyPrivateAndMention() {
    return commentsOnlyPrivateAndMention;
  }

  /**
   * setCommentsOnlyPrivateAndMention.
   **/
  public void setCommentsOnlyPrivateAndMention(String commentsOnlyPrivateAndMention) {
    this.commentsOnlyPrivateAndMention = commentsOnlyPrivateAndMention;
  }


  /**
   * commentsReceiveAll.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications commentsReceiveAll(String commentsReceiveAll) {
    this.commentsReceiveAll = commentsReceiveAll;
    return this;
  }

  /**
   * .
   * @return commentsReceiveAll
   **/
  @Schema(description = "")
  public String getCommentsReceiveAll() {
    return commentsReceiveAll;
  }

  /**
   * setCommentsReceiveAll.
   **/
  public void setCommentsReceiveAll(String commentsReceiveAll) {
    this.commentsReceiveAll = commentsReceiveAll;
  }


  /**
   * deliveryFailed.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications deliveryFailed(String deliveryFailed) {
    this.deliveryFailed = deliveryFailed;
    return this;
  }

  /**
   * When set to **true**, the sender receives notification if the delivery of the envelope fails..
   * @return deliveryFailed
   **/
  @Schema(description = "When set to **true**, the sender receives notification if the delivery of the envelope fails.")
  public String getDeliveryFailed() {
    return deliveryFailed;
  }

  /**
   * setDeliveryFailed.
   **/
  public void setDeliveryFailed(String deliveryFailed) {
    this.deliveryFailed = deliveryFailed;
  }


  /**
   * envelopeComplete.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications envelopeComplete(String envelopeComplete) {
    this.envelopeComplete = envelopeComplete;
    return this;
  }

  /**
   * When set to **true**, the user receives notification that the envelope has been completed..
   * @return envelopeComplete
   **/
  @Schema(description = "When set to **true**, the user receives notification that the envelope has been completed.")
  public String getEnvelopeComplete() {
    return envelopeComplete;
  }

  /**
   * setEnvelopeComplete.
   **/
  public void setEnvelopeComplete(String envelopeComplete) {
    this.envelopeComplete = envelopeComplete;
  }


  /**
   * offlineSigningFailed.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications offlineSigningFailed(String offlineSigningFailed) {
    this.offlineSigningFailed = offlineSigningFailed;
    return this;
  }

  /**
   * When set to **true**, the user receives notification if the offline signing failed..
   * @return offlineSigningFailed
   **/
  @Schema(description = "When set to **true**, the user receives notification if the offline signing failed.")
  public String getOfflineSigningFailed() {
    return offlineSigningFailed;
  }

  /**
   * setOfflineSigningFailed.
   **/
  public void setOfflineSigningFailed(String offlineSigningFailed) {
    this.offlineSigningFailed = offlineSigningFailed;
  }


  /**
   * powerformResponsesLimitNotificationEmail.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications powerformResponsesLimitNotificationEmail(String powerformResponsesLimitNotificationEmail) {
    this.powerformResponsesLimitNotificationEmail = powerformResponsesLimitNotificationEmail;
    return this;
  }

  /**
   * .
   * @return powerformResponsesLimitNotificationEmail
   **/
  @Schema(description = "")
  public String getPowerformResponsesLimitNotificationEmail() {
    return powerformResponsesLimitNotificationEmail;
  }

  /**
   * setPowerformResponsesLimitNotificationEmail.
   **/
  public void setPowerformResponsesLimitNotificationEmail(String powerformResponsesLimitNotificationEmail) {
    this.powerformResponsesLimitNotificationEmail = powerformResponsesLimitNotificationEmail;
  }


  /**
   * purgeDocuments.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications purgeDocuments(String purgeDocuments) {
    this.purgeDocuments = purgeDocuments;
    return this;
  }

  /**
   * .
   * @return purgeDocuments
   **/
  @Schema(description = "")
  public String getPurgeDocuments() {
    return purgeDocuments;
  }

  /**
   * setPurgeDocuments.
   **/
  public void setPurgeDocuments(String purgeDocuments) {
    this.purgeDocuments = purgeDocuments;
  }


  /**
   * recipientViewed.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications recipientViewed(String recipientViewed) {
    this.recipientViewed = recipientViewed;
    return this;
  }

  /**
   * When set to **true**, the sender receives notification that the recipient viewed the enveloper..
   * @return recipientViewed
   **/
  @Schema(description = "When set to **true**, the sender receives notification that the recipient viewed the enveloper.")
  public String getRecipientViewed() {
    return recipientViewed;
  }

  /**
   * setRecipientViewed.
   **/
  public void setRecipientViewed(String recipientViewed) {
    this.recipientViewed = recipientViewed;
  }


  /**
   * senderEnvelopeDeclined.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications senderEnvelopeDeclined(String senderEnvelopeDeclined) {
    this.senderEnvelopeDeclined = senderEnvelopeDeclined;
    return this;
  }

  /**
   * .
   * @return senderEnvelopeDeclined
   **/
  @Schema(description = "")
  public String getSenderEnvelopeDeclined() {
    return senderEnvelopeDeclined;
  }

  /**
   * setSenderEnvelopeDeclined.
   **/
  public void setSenderEnvelopeDeclined(String senderEnvelopeDeclined) {
    this.senderEnvelopeDeclined = senderEnvelopeDeclined;
  }


  /**
   * withdrawnConsent.
   *
   * @return SenderEmailNotifications
   **/
  public SenderEmailNotifications withdrawnConsent(String withdrawnConsent) {
    this.withdrawnConsent = withdrawnConsent;
    return this;
  }

  /**
   * When set to **true**, the user receives notification if consent is withdrawn..
   * @return withdrawnConsent
   **/
  @Schema(description = "When set to **true**, the user receives notification if consent is withdrawn.")
  public String getWithdrawnConsent() {
    return withdrawnConsent;
  }

  /**
   * setWithdrawnConsent.
   **/
  public void setWithdrawnConsent(String withdrawnConsent) {
    this.withdrawnConsent = withdrawnConsent;
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
    SenderEmailNotifications senderEmailNotifications = (SenderEmailNotifications) o;
    return Objects.equals(this.changedSigner, senderEmailNotifications.changedSigner) &&
        Objects.equals(this.clickwrapResponsesLimitNotificationEmail, senderEmailNotifications.clickwrapResponsesLimitNotificationEmail) &&
        Objects.equals(this.commentsOnlyPrivateAndMention, senderEmailNotifications.commentsOnlyPrivateAndMention) &&
        Objects.equals(this.commentsReceiveAll, senderEmailNotifications.commentsReceiveAll) &&
        Objects.equals(this.deliveryFailed, senderEmailNotifications.deliveryFailed) &&
        Objects.equals(this.envelopeComplete, senderEmailNotifications.envelopeComplete) &&
        Objects.equals(this.offlineSigningFailed, senderEmailNotifications.offlineSigningFailed) &&
        Objects.equals(this.powerformResponsesLimitNotificationEmail, senderEmailNotifications.powerformResponsesLimitNotificationEmail) &&
        Objects.equals(this.purgeDocuments, senderEmailNotifications.purgeDocuments) &&
        Objects.equals(this.recipientViewed, senderEmailNotifications.recipientViewed) &&
        Objects.equals(this.senderEnvelopeDeclined, senderEmailNotifications.senderEnvelopeDeclined) &&
        Objects.equals(this.withdrawnConsent, senderEmailNotifications.withdrawnConsent);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(changedSigner, clickwrapResponsesLimitNotificationEmail, commentsOnlyPrivateAndMention, commentsReceiveAll, deliveryFailed, envelopeComplete, offlineSigningFailed, powerformResponsesLimitNotificationEmail, purgeDocuments, recipientViewed, senderEnvelopeDeclined, withdrawnConsent);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderEmailNotifications {\n");
    
    sb.append("    changedSigner: ").append(toIndentedString(changedSigner)).append("\n");
    sb.append("    clickwrapResponsesLimitNotificationEmail: ").append(toIndentedString(clickwrapResponsesLimitNotificationEmail)).append("\n");
    sb.append("    commentsOnlyPrivateAndMention: ").append(toIndentedString(commentsOnlyPrivateAndMention)).append("\n");
    sb.append("    commentsReceiveAll: ").append(toIndentedString(commentsReceiveAll)).append("\n");
    sb.append("    deliveryFailed: ").append(toIndentedString(deliveryFailed)).append("\n");
    sb.append("    envelopeComplete: ").append(toIndentedString(envelopeComplete)).append("\n");
    sb.append("    offlineSigningFailed: ").append(toIndentedString(offlineSigningFailed)).append("\n");
    sb.append("    powerformResponsesLimitNotificationEmail: ").append(toIndentedString(powerformResponsesLimitNotificationEmail)).append("\n");
    sb.append("    purgeDocuments: ").append(toIndentedString(purgeDocuments)).append("\n");
    sb.append("    recipientViewed: ").append(toIndentedString(recipientViewed)).append("\n");
    sb.append("    senderEnvelopeDeclined: ").append(toIndentedString(senderEnvelopeDeclined)).append("\n");
    sb.append("    withdrawnConsent: ").append(toIndentedString(withdrawnConsent)).append("\n");
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

