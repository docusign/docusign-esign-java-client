package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SenderEmailNotifications.
 *
 */

public class SenderEmailNotifications {
  @JsonProperty("changedSigner")
  private String changedSigner = null;

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
  @ApiModelProperty(value = "When set to **true**, the sender receives notification if the signer changes.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "When set to **true**, the sender receives notification if the delivery of the envelope fails.")
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
  @ApiModelProperty(value = "When set to **true**, the user receives notification that the envelope has been completed.")
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
  @ApiModelProperty(value = "When set to **true**, the user receives notification if the offline signing failed.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "When set to **true**, the sender receives notification that the recipient viewed the enveloper.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "When set to **true**, the user receives notification if consent is withdrawn.")
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
        Objects.equals(this.commentsOnlyPrivateAndMention, senderEmailNotifications.commentsOnlyPrivateAndMention) &&
        Objects.equals(this.commentsReceiveAll, senderEmailNotifications.commentsReceiveAll) &&
        Objects.equals(this.deliveryFailed, senderEmailNotifications.deliveryFailed) &&
        Objects.equals(this.envelopeComplete, senderEmailNotifications.envelopeComplete) &&
        Objects.equals(this.offlineSigningFailed, senderEmailNotifications.offlineSigningFailed) &&
        Objects.equals(this.powerformResponsesLimitNotificationEmail, senderEmailNotifications.powerformResponsesLimitNotificationEmail) &&
        Objects.equals(this.recipientViewed, senderEmailNotifications.recipientViewed) &&
        Objects.equals(this.senderEnvelopeDeclined, senderEmailNotifications.senderEnvelopeDeclined) &&
        Objects.equals(this.withdrawnConsent, senderEmailNotifications.withdrawnConsent);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(changedSigner, commentsOnlyPrivateAndMention, commentsReceiveAll, deliveryFailed, envelopeComplete, offlineSigningFailed, powerformResponsesLimitNotificationEmail, recipientViewed, senderEnvelopeDeclined, withdrawnConsent);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderEmailNotifications {\n");
    
    sb.append("    changedSigner: ").append(toIndentedString(changedSigner)).append("\n");
    sb.append("    commentsOnlyPrivateAndMention: ").append(toIndentedString(commentsOnlyPrivateAndMention)).append("\n");
    sb.append("    commentsReceiveAll: ").append(toIndentedString(commentsReceiveAll)).append("\n");
    sb.append("    deliveryFailed: ").append(toIndentedString(deliveryFailed)).append("\n");
    sb.append("    envelopeComplete: ").append(toIndentedString(envelopeComplete)).append("\n");
    sb.append("    offlineSigningFailed: ").append(toIndentedString(offlineSigningFailed)).append("\n");
    sb.append("    powerformResponsesLimitNotificationEmail: ").append(toIndentedString(powerformResponsesLimitNotificationEmail)).append("\n");
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

