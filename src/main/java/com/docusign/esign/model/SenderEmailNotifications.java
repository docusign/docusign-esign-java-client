package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class SenderEmailNotifications   {
  
  private String changedSigner = null;
  private String deliveryFailed = null;
  private String envelopeComplete = null;
  private String offlineSigningFailed = null;
  private String recipientViewed = null;
  private String senderEnvelopeDeclined = null;
  private String withdrawnConsent = null;

  
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenderEmailNotifications senderEmailNotifications = (SenderEmailNotifications) o;

    return true && Objects.equals(changedSigner, senderEmailNotifications.changedSigner) &&
        Objects.equals(deliveryFailed, senderEmailNotifications.deliveryFailed) &&
        Objects.equals(envelopeComplete, senderEmailNotifications.envelopeComplete) &&
        Objects.equals(offlineSigningFailed, senderEmailNotifications.offlineSigningFailed) &&
        Objects.equals(recipientViewed, senderEmailNotifications.recipientViewed) &&
        Objects.equals(senderEnvelopeDeclined, senderEmailNotifications.senderEnvelopeDeclined) &&
        Objects.equals(withdrawnConsent, senderEmailNotifications.withdrawnConsent)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedSigner, deliveryFailed, envelopeComplete, offlineSigningFailed, recipientViewed, senderEnvelopeDeclined, withdrawnConsent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderEmailNotifications {\n");
    
    if (changedSigner != null)
      sb.append("    changedSigner: ").append(toIndentedString(changedSigner)).append("\n");
    if (deliveryFailed != null)
      sb.append("    deliveryFailed: ").append(toIndentedString(deliveryFailed)).append("\n");
    if (envelopeComplete != null)
      sb.append("    envelopeComplete: ").append(toIndentedString(envelopeComplete)).append("\n");
    if (offlineSigningFailed != null)
      sb.append("    offlineSigningFailed: ").append(toIndentedString(offlineSigningFailed)).append("\n");
    if (recipientViewed != null)
      sb.append("    recipientViewed: ").append(toIndentedString(recipientViewed)).append("\n");
    if (senderEnvelopeDeclined != null)
      sb.append("    senderEnvelopeDeclined: ").append(toIndentedString(senderEnvelopeDeclined)).append("\n");
    if (withdrawnConsent != null)
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

