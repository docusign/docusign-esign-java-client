package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SenderEmailNotifications
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

  @JsonProperty("purgeDocuments")
  private String purgeDocuments = null;

  @JsonProperty("recipientViewed")
  private String recipientViewed = null;

  @JsonProperty("senderEnvelopeDeclined")
  private String senderEnvelopeDeclined = null;

  @JsonProperty("withdrawnConsent")
  private String withdrawnConsent = null;

  public SenderEmailNotifications changedSigner(String changedSigner) {
    this.changedSigner = changedSigner;
    return this;
  }

   /**
   * When set to **true**, the sender receives notification if the signer changes.
   * @return changedSigner
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender receives notification if the signer changes.")
  public String getChangedSigner() {
    return changedSigner;
  }

  public void setChangedSigner(String changedSigner) {
    this.changedSigner = changedSigner;
  }

  public SenderEmailNotifications commentsOnlyPrivateAndMention(String commentsOnlyPrivateAndMention) {
    this.commentsOnlyPrivateAndMention = commentsOnlyPrivateAndMention;
    return this;
  }

   /**
   * 
   * @return commentsOnlyPrivateAndMention
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCommentsOnlyPrivateAndMention() {
    return commentsOnlyPrivateAndMention;
  }

  public void setCommentsOnlyPrivateAndMention(String commentsOnlyPrivateAndMention) {
    this.commentsOnlyPrivateAndMention = commentsOnlyPrivateAndMention;
  }

  public SenderEmailNotifications commentsReceiveAll(String commentsReceiveAll) {
    this.commentsReceiveAll = commentsReceiveAll;
    return this;
  }

   /**
   * 
   * @return commentsReceiveAll
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCommentsReceiveAll() {
    return commentsReceiveAll;
  }

  public void setCommentsReceiveAll(String commentsReceiveAll) {
    this.commentsReceiveAll = commentsReceiveAll;
  }

  public SenderEmailNotifications deliveryFailed(String deliveryFailed) {
    this.deliveryFailed = deliveryFailed;
    return this;
  }

   /**
   * When set to **true**, the sender receives notification if the delivery of the envelope fails.
   * @return deliveryFailed
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender receives notification if the delivery of the envelope fails.")
  public String getDeliveryFailed() {
    return deliveryFailed;
  }

  public void setDeliveryFailed(String deliveryFailed) {
    this.deliveryFailed = deliveryFailed;
  }

  public SenderEmailNotifications envelopeComplete(String envelopeComplete) {
    this.envelopeComplete = envelopeComplete;
    return this;
  }

   /**
   * When set to **true**, the user receives notification that the envelope has been completed.
   * @return envelopeComplete
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been completed.")
  public String getEnvelopeComplete() {
    return envelopeComplete;
  }

  public void setEnvelopeComplete(String envelopeComplete) {
    this.envelopeComplete = envelopeComplete;
  }

  public SenderEmailNotifications offlineSigningFailed(String offlineSigningFailed) {
    this.offlineSigningFailed = offlineSigningFailed;
    return this;
  }

   /**
   * When set to **true**, the user receives notification if the offline signing failed.
   * @return offlineSigningFailed
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification if the offline signing failed.")
  public String getOfflineSigningFailed() {
    return offlineSigningFailed;
  }

  public void setOfflineSigningFailed(String offlineSigningFailed) {
    this.offlineSigningFailed = offlineSigningFailed;
  }

  public SenderEmailNotifications purgeDocuments(String purgeDocuments) {
    this.purgeDocuments = purgeDocuments;
    return this;
  }

   /**
   * 
   * @return purgeDocuments
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPurgeDocuments() {
    return purgeDocuments;
  }

  public void setPurgeDocuments(String purgeDocuments) {
    this.purgeDocuments = purgeDocuments;
  }

  public SenderEmailNotifications recipientViewed(String recipientViewed) {
    this.recipientViewed = recipientViewed;
    return this;
  }

   /**
   * When set to **true**, the sender receives notification that the recipient viewed the enveloper.
   * @return recipientViewed
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender receives notification that the recipient viewed the enveloper.")
  public String getRecipientViewed() {
    return recipientViewed;
  }

  public void setRecipientViewed(String recipientViewed) {
    this.recipientViewed = recipientViewed;
  }

  public SenderEmailNotifications senderEnvelopeDeclined(String senderEnvelopeDeclined) {
    this.senderEnvelopeDeclined = senderEnvelopeDeclined;
    return this;
  }

   /**
   * 
   * @return senderEnvelopeDeclined
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSenderEnvelopeDeclined() {
    return senderEnvelopeDeclined;
  }

  public void setSenderEnvelopeDeclined(String senderEnvelopeDeclined) {
    this.senderEnvelopeDeclined = senderEnvelopeDeclined;
  }

  public SenderEmailNotifications withdrawnConsent(String withdrawnConsent) {
    this.withdrawnConsent = withdrawnConsent;
    return this;
  }

   /**
   * When set to **true**, the user receives notification if consent is withdrawn.
   * @return withdrawnConsent
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification if consent is withdrawn.")
  public String getWithdrawnConsent() {
    return withdrawnConsent;
  }

  public void setWithdrawnConsent(String withdrawnConsent) {
    this.withdrawnConsent = withdrawnConsent;
  }


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
        Objects.equals(this.purgeDocuments, senderEmailNotifications.purgeDocuments) &&
        Objects.equals(this.recipientViewed, senderEmailNotifications.recipientViewed) &&
        Objects.equals(this.senderEnvelopeDeclined, senderEmailNotifications.senderEnvelopeDeclined) &&
        Objects.equals(this.withdrawnConsent, senderEmailNotifications.withdrawnConsent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedSigner, commentsOnlyPrivateAndMention, commentsReceiveAll, deliveryFailed, envelopeComplete, offlineSigningFailed, purgeDocuments, recipientViewed, senderEnvelopeDeclined, withdrawnConsent);
  }


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

