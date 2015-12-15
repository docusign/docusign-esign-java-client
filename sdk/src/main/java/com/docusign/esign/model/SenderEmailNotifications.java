package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class SenderEmailNotifications   {
  
  private String envelopeComplete = null;
  private String changedSigner = null;
  private String senderEnvelopeDeclined = null;
  private String withdrawnConsent = null;
  private String recipientViewed = null;
  private String deliveryFailed = null;
  private String offlineSigningFailed = null;

  
  /**
   * When set to **true**, the user receives notification that the envelope has been completed.
   **/
  @ApiModelProperty(value = "When set to **true**, the user receives notification that the envelope has been completed.")
  @JsonProperty("envelopeComplete")
  public String getEnvelopeComplete() {
    return envelopeComplete;
  }
  public void setEnvelopeComplete(String envelopeComplete) {
    this.envelopeComplete = envelopeComplete;
  }

  
  /**
   * When set to **true**, the sender receives notification if the signer changes.
   **/
  @ApiModelProperty(value = "When set to **true**, the sender receives notification if the signer changes.")
  @JsonProperty("changedSigner")
  public String getChangedSigner() {
    return changedSigner;
  }
  public void setChangedSigner(String changedSigner) {
    this.changedSigner = changedSigner;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("senderEnvelopeDeclined")
  public String getSenderEnvelopeDeclined() {
    return senderEnvelopeDeclined;
  }
  public void setSenderEnvelopeDeclined(String senderEnvelopeDeclined) {
    this.senderEnvelopeDeclined = senderEnvelopeDeclined;
  }

  
  /**
   * When set to **true**, the user receives notification if consent is withdrawn.
   **/
  @ApiModelProperty(value = "When set to **true**, the user receives notification if consent is withdrawn.")
  @JsonProperty("withdrawnConsent")
  public String getWithdrawnConsent() {
    return withdrawnConsent;
  }
  public void setWithdrawnConsent(String withdrawnConsent) {
    this.withdrawnConsent = withdrawnConsent;
  }

  
  /**
   * When set to **true**, the sender receives notification that the recipient viewed the enveloper.
   **/
  @ApiModelProperty(value = "When set to **true**, the sender receives notification that the recipient viewed the enveloper.")
  @JsonProperty("recipientViewed")
  public String getRecipientViewed() {
    return recipientViewed;
  }
  public void setRecipientViewed(String recipientViewed) {
    this.recipientViewed = recipientViewed;
  }

  
  /**
   * When set to **true**, the sender receives notification if the delivery of the envelope fails.
   **/
  @ApiModelProperty(value = "When set to **true**, the sender receives notification if the delivery of the envelope fails.")
  @JsonProperty("deliveryFailed")
  public String getDeliveryFailed() {
    return deliveryFailed;
  }
  public void setDeliveryFailed(String deliveryFailed) {
    this.deliveryFailed = deliveryFailed;
  }

  
  /**
   * When set to **true**, the user receives notification if the offline signing failed.
   **/
  @ApiModelProperty(value = "When set to **true**, the user receives notification if the offline signing failed.")
  @JsonProperty("offlineSigningFailed")
  public String getOfflineSigningFailed() {
    return offlineSigningFailed;
  }
  public void setOfflineSigningFailed(String offlineSigningFailed) {
    this.offlineSigningFailed = offlineSigningFailed;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenderEmailNotifications senderEmailNotifications = (SenderEmailNotifications) o;
    return Objects.equals(envelopeComplete, senderEmailNotifications.envelopeComplete) &&
        Objects.equals(changedSigner, senderEmailNotifications.changedSigner) &&
        Objects.equals(senderEnvelopeDeclined, senderEmailNotifications.senderEnvelopeDeclined) &&
        Objects.equals(withdrawnConsent, senderEmailNotifications.withdrawnConsent) &&
        Objects.equals(recipientViewed, senderEmailNotifications.recipientViewed) &&
        Objects.equals(deliveryFailed, senderEmailNotifications.deliveryFailed) &&
        Objects.equals(offlineSigningFailed, senderEmailNotifications.offlineSigningFailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeComplete, changedSigner, senderEnvelopeDeclined, withdrawnConsent, recipientViewed, deliveryFailed, offlineSigningFailed);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderEmailNotifications {\n");
    
    sb.append("    envelopeComplete: ").append(StringUtil.toIndentedString(envelopeComplete)).append("\n");
    sb.append("    changedSigner: ").append(StringUtil.toIndentedString(changedSigner)).append("\n");
    sb.append("    senderEnvelopeDeclined: ").append(StringUtil.toIndentedString(senderEnvelopeDeclined)).append("\n");
    sb.append("    withdrawnConsent: ").append(StringUtil.toIndentedString(withdrawnConsent)).append("\n");
    sb.append("    recipientViewed: ").append(StringUtil.toIndentedString(recipientViewed)).append("\n");
    sb.append("    deliveryFailed: ").append(StringUtil.toIndentedString(deliveryFailed)).append("\n");
    sb.append("    offlineSigningFailed: ").append(StringUtil.toIndentedString(offlineSigningFailed)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
