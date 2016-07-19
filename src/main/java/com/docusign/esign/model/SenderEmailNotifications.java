package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
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
  public SenderEmailNotifications envelopeComplete(String envelopeComplete) {
    this.envelopeComplete = envelopeComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been completed.")
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
  public SenderEmailNotifications changedSigner(String changedSigner) {
    this.changedSigner = changedSigner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender receives notification if the signer changes.")
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
  public SenderEmailNotifications senderEnvelopeDeclined(String senderEnvelopeDeclined) {
    this.senderEnvelopeDeclined = senderEnvelopeDeclined;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public SenderEmailNotifications withdrawnConsent(String withdrawnConsent) {
    this.withdrawnConsent = withdrawnConsent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification if consent is withdrawn.")
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
  public SenderEmailNotifications recipientViewed(String recipientViewed) {
    this.recipientViewed = recipientViewed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender receives notification that the recipient viewed the enveloper.")
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
  public SenderEmailNotifications deliveryFailed(String deliveryFailed) {
    this.deliveryFailed = deliveryFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender receives notification if the delivery of the envelope fails.")
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
  public SenderEmailNotifications offlineSigningFailed(String offlineSigningFailed) {
    this.offlineSigningFailed = offlineSigningFailed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification if the offline signing failed.")
  @JsonProperty("offlineSigningFailed")
  public String getOfflineSigningFailed() {
    return offlineSigningFailed;
  }
  public void setOfflineSigningFailed(String offlineSigningFailed) {
    this.offlineSigningFailed = offlineSigningFailed;
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
    return Objects.equals(this.envelopeComplete, senderEmailNotifications.envelopeComplete) &&
        Objects.equals(this.changedSigner, senderEmailNotifications.changedSigner) &&
        Objects.equals(this.senderEnvelopeDeclined, senderEmailNotifications.senderEnvelopeDeclined) &&
        Objects.equals(this.withdrawnConsent, senderEmailNotifications.withdrawnConsent) &&
        Objects.equals(this.recipientViewed, senderEmailNotifications.recipientViewed) &&
        Objects.equals(this.deliveryFailed, senderEmailNotifications.deliveryFailed) &&
        Objects.equals(this.offlineSigningFailed, senderEmailNotifications.offlineSigningFailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeComplete, changedSigner, senderEnvelopeDeclined, withdrawnConsent, recipientViewed, deliveryFailed, offlineSigningFailed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderEmailNotifications {\n");
    
    sb.append("    envelopeComplete: ").append(toIndentedString(envelopeComplete)).append("\n");
    sb.append("    changedSigner: ").append(toIndentedString(changedSigner)).append("\n");
    sb.append("    senderEnvelopeDeclined: ").append(toIndentedString(senderEnvelopeDeclined)).append("\n");
    sb.append("    withdrawnConsent: ").append(toIndentedString(withdrawnConsent)).append("\n");
    sb.append("    recipientViewed: ").append(toIndentedString(recipientViewed)).append("\n");
    sb.append("    deliveryFailed: ").append(toIndentedString(deliveryFailed)).append("\n");
    sb.append("    offlineSigningFailed: ").append(toIndentedString(offlineSigningFailed)).append("\n");
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

