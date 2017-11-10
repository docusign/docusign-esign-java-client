package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created.
 */
@ApiModel(description = "An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created.")

public class SignerEmailNotifications {
  @JsonProperty("agentNotification")
  private String agentNotification = null;

  @JsonProperty("carbonCopyNotification")
  private String carbonCopyNotification = null;

  @JsonProperty("certifiedDeliveryNotification")
  private String certifiedDeliveryNotification = null;

  @JsonProperty("commentsOnlyPrivateAndMention")
  private String commentsOnlyPrivateAndMention = null;

  @JsonProperty("commentsReceiveAll")
  private String commentsReceiveAll = null;

  @JsonProperty("documentMarkupActivation")
  private String documentMarkupActivation = null;

  @JsonProperty("envelopeActivation")
  private String envelopeActivation = null;

  @JsonProperty("envelopeComplete")
  private String envelopeComplete = null;

  @JsonProperty("envelopeCorrected")
  private String envelopeCorrected = null;

  @JsonProperty("envelopeDeclined")
  private String envelopeDeclined = null;

  @JsonProperty("envelopeVoided")
  private String envelopeVoided = null;

  @JsonProperty("faxReceived")
  private String faxReceived = null;

  @JsonProperty("offlineSigningFailed")
  private String offlineSigningFailed = null;

  @JsonProperty("purgeDocuments")
  private String purgeDocuments = null;

  @JsonProperty("reassignedSigner")
  private String reassignedSigner = null;

  @JsonProperty("whenSigningGroupMember")
  private String whenSigningGroupMember = null;

  public SignerEmailNotifications agentNotification(String agentNotification) {
    this.agentNotification = agentNotification;
    return this;
  }

   /**
   * When set to **true**, the user receives agent notification emails.
   * @return agentNotification
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives agent notification emails.")
  public String getAgentNotification() {
    return agentNotification;
  }

  public void setAgentNotification(String agentNotification) {
    this.agentNotification = agentNotification;
  }

  public SignerEmailNotifications carbonCopyNotification(String carbonCopyNotification) {
    this.carbonCopyNotification = carbonCopyNotification;
    return this;
  }

   /**
   * When set to **true**, the user receives notifications of carbon copy deliveries.
   * @return carbonCopyNotification
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notifications of carbon copy deliveries.")
  public String getCarbonCopyNotification() {
    return carbonCopyNotification;
  }

  public void setCarbonCopyNotification(String carbonCopyNotification) {
    this.carbonCopyNotification = carbonCopyNotification;
  }

  public SignerEmailNotifications certifiedDeliveryNotification(String certifiedDeliveryNotification) {
    this.certifiedDeliveryNotification = certifiedDeliveryNotification;
    return this;
  }

   /**
   * When set to **true**, the user receives notifications of certified deliveries.
   * @return certifiedDeliveryNotification
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notifications of certified deliveries.")
  public String getCertifiedDeliveryNotification() {
    return certifiedDeliveryNotification;
  }

  public void setCertifiedDeliveryNotification(String certifiedDeliveryNotification) {
    this.certifiedDeliveryNotification = certifiedDeliveryNotification;
  }

  public SignerEmailNotifications commentsOnlyPrivateAndMention(String commentsOnlyPrivateAndMention) {
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

  public SignerEmailNotifications commentsReceiveAll(String commentsReceiveAll) {
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

  public SignerEmailNotifications documentMarkupActivation(String documentMarkupActivation) {
    this.documentMarkupActivation = documentMarkupActivation;
    return this;
  }

   /**
   * When set to **true**, the user receives notification that document markup has been activated.
   * @return documentMarkupActivation
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that document markup has been activated.")
  public String getDocumentMarkupActivation() {
    return documentMarkupActivation;
  }

  public void setDocumentMarkupActivation(String documentMarkupActivation) {
    this.documentMarkupActivation = documentMarkupActivation;
  }

  public SignerEmailNotifications envelopeActivation(String envelopeActivation) {
    this.envelopeActivation = envelopeActivation;
    return this;
  }

   /**
   * When set to **true**, the user receives notification that the envelope has been activated.
   * @return envelopeActivation
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been activated.")
  public String getEnvelopeActivation() {
    return envelopeActivation;
  }

  public void setEnvelopeActivation(String envelopeActivation) {
    this.envelopeActivation = envelopeActivation;
  }

  public SignerEmailNotifications envelopeComplete(String envelopeComplete) {
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

  public SignerEmailNotifications envelopeCorrected(String envelopeCorrected) {
    this.envelopeCorrected = envelopeCorrected;
    return this;
  }

   /**
   * When set to **true**, the user receives notification that the envelope has been corrected.
   * @return envelopeCorrected
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been corrected.")
  public String getEnvelopeCorrected() {
    return envelopeCorrected;
  }

  public void setEnvelopeCorrected(String envelopeCorrected) {
    this.envelopeCorrected = envelopeCorrected;
  }

  public SignerEmailNotifications envelopeDeclined(String envelopeDeclined) {
    this.envelopeDeclined = envelopeDeclined;
    return this;
  }

   /**
   * When set to **true**, the user receives notification that the envelope has been declined.
   * @return envelopeDeclined
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been declined.")
  public String getEnvelopeDeclined() {
    return envelopeDeclined;
  }

  public void setEnvelopeDeclined(String envelopeDeclined) {
    this.envelopeDeclined = envelopeDeclined;
  }

  public SignerEmailNotifications envelopeVoided(String envelopeVoided) {
    this.envelopeVoided = envelopeVoided;
    return this;
  }

   /**
   * When set to **true**, the user receives notification that the envelope has been voided.
   * @return envelopeVoided
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been voided.")
  public String getEnvelopeVoided() {
    return envelopeVoided;
  }

  public void setEnvelopeVoided(String envelopeVoided) {
    this.envelopeVoided = envelopeVoided;
  }

  public SignerEmailNotifications faxReceived(String faxReceived) {
    this.faxReceived = faxReceived;
    return this;
  }

   /**
   * Reserved:
   * @return faxReceived
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public String getFaxReceived() {
    return faxReceived;
  }

  public void setFaxReceived(String faxReceived) {
    this.faxReceived = faxReceived;
  }

  public SignerEmailNotifications offlineSigningFailed(String offlineSigningFailed) {
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

  public SignerEmailNotifications purgeDocuments(String purgeDocuments) {
    this.purgeDocuments = purgeDocuments;
    return this;
  }

   /**
   * When set to **true**, the user receives notification of document purges.
   * @return purgeDocuments
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification of document purges.")
  public String getPurgeDocuments() {
    return purgeDocuments;
  }

  public void setPurgeDocuments(String purgeDocuments) {
    this.purgeDocuments = purgeDocuments;
  }

  public SignerEmailNotifications reassignedSigner(String reassignedSigner) {
    this.reassignedSigner = reassignedSigner;
    return this;
  }

   /**
   * When set to **true**, the user receives notification that the envelope has been reassigned.
   * @return reassignedSigner
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been reassigned.")
  public String getReassignedSigner() {
    return reassignedSigner;
  }

  public void setReassignedSigner(String reassignedSigner) {
    this.reassignedSigner = reassignedSigner;
  }

  public SignerEmailNotifications whenSigningGroupMember(String whenSigningGroupMember) {
    this.whenSigningGroupMember = whenSigningGroupMember;
    return this;
  }

   /**
   * 
   * @return whenSigningGroupMember
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWhenSigningGroupMember() {
    return whenSigningGroupMember;
  }

  public void setWhenSigningGroupMember(String whenSigningGroupMember) {
    this.whenSigningGroupMember = whenSigningGroupMember;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignerEmailNotifications signerEmailNotifications = (SignerEmailNotifications) o;
    return Objects.equals(this.agentNotification, signerEmailNotifications.agentNotification) &&
        Objects.equals(this.carbonCopyNotification, signerEmailNotifications.carbonCopyNotification) &&
        Objects.equals(this.certifiedDeliveryNotification, signerEmailNotifications.certifiedDeliveryNotification) &&
        Objects.equals(this.commentsOnlyPrivateAndMention, signerEmailNotifications.commentsOnlyPrivateAndMention) &&
        Objects.equals(this.commentsReceiveAll, signerEmailNotifications.commentsReceiveAll) &&
        Objects.equals(this.documentMarkupActivation, signerEmailNotifications.documentMarkupActivation) &&
        Objects.equals(this.envelopeActivation, signerEmailNotifications.envelopeActivation) &&
        Objects.equals(this.envelopeComplete, signerEmailNotifications.envelopeComplete) &&
        Objects.equals(this.envelopeCorrected, signerEmailNotifications.envelopeCorrected) &&
        Objects.equals(this.envelopeDeclined, signerEmailNotifications.envelopeDeclined) &&
        Objects.equals(this.envelopeVoided, signerEmailNotifications.envelopeVoided) &&
        Objects.equals(this.faxReceived, signerEmailNotifications.faxReceived) &&
        Objects.equals(this.offlineSigningFailed, signerEmailNotifications.offlineSigningFailed) &&
        Objects.equals(this.purgeDocuments, signerEmailNotifications.purgeDocuments) &&
        Objects.equals(this.reassignedSigner, signerEmailNotifications.reassignedSigner) &&
        Objects.equals(this.whenSigningGroupMember, signerEmailNotifications.whenSigningGroupMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentNotification, carbonCopyNotification, certifiedDeliveryNotification, commentsOnlyPrivateAndMention, commentsReceiveAll, documentMarkupActivation, envelopeActivation, envelopeComplete, envelopeCorrected, envelopeDeclined, envelopeVoided, faxReceived, offlineSigningFailed, purgeDocuments, reassignedSigner, whenSigningGroupMember);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignerEmailNotifications {\n");
    
    sb.append("    agentNotification: ").append(toIndentedString(agentNotification)).append("\n");
    sb.append("    carbonCopyNotification: ").append(toIndentedString(carbonCopyNotification)).append("\n");
    sb.append("    certifiedDeliveryNotification: ").append(toIndentedString(certifiedDeliveryNotification)).append("\n");
    sb.append("    commentsOnlyPrivateAndMention: ").append(toIndentedString(commentsOnlyPrivateAndMention)).append("\n");
    sb.append("    commentsReceiveAll: ").append(toIndentedString(commentsReceiveAll)).append("\n");
    sb.append("    documentMarkupActivation: ").append(toIndentedString(documentMarkupActivation)).append("\n");
    sb.append("    envelopeActivation: ").append(toIndentedString(envelopeActivation)).append("\n");
    sb.append("    envelopeComplete: ").append(toIndentedString(envelopeComplete)).append("\n");
    sb.append("    envelopeCorrected: ").append(toIndentedString(envelopeCorrected)).append("\n");
    sb.append("    envelopeDeclined: ").append(toIndentedString(envelopeDeclined)).append("\n");
    sb.append("    envelopeVoided: ").append(toIndentedString(envelopeVoided)).append("\n");
    sb.append("    faxReceived: ").append(toIndentedString(faxReceived)).append("\n");
    sb.append("    offlineSigningFailed: ").append(toIndentedString(offlineSigningFailed)).append("\n");
    sb.append("    purgeDocuments: ").append(toIndentedString(purgeDocuments)).append("\n");
    sb.append("    reassignedSigner: ").append(toIndentedString(reassignedSigner)).append("\n");
    sb.append("    whenSigningGroupMember: ").append(toIndentedString(whenSigningGroupMember)).append("\n");
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

