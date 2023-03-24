package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created..
 *
 */
@Schema(description = "An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created.")

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


  /**
   * agentNotification.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications agentNotification(String agentNotification) {
    this.agentNotification = agentNotification;
    return this;
  }

  /**
   * When set to **true**, the user receives agent notification emails..
   * @return agentNotification
   **/
  @Schema(description = "When set to **true**, the user receives agent notification emails.")
  public String getAgentNotification() {
    return agentNotification;
  }

  /**
   * setAgentNotification.
   **/
  public void setAgentNotification(String agentNotification) {
    this.agentNotification = agentNotification;
  }


  /**
   * carbonCopyNotification.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications carbonCopyNotification(String carbonCopyNotification) {
    this.carbonCopyNotification = carbonCopyNotification;
    return this;
  }

  /**
   * When set to **true**, the user receives notifications of carbon copy deliveries..
   * @return carbonCopyNotification
   **/
  @Schema(description = "When set to **true**, the user receives notifications of carbon copy deliveries.")
  public String getCarbonCopyNotification() {
    return carbonCopyNotification;
  }

  /**
   * setCarbonCopyNotification.
   **/
  public void setCarbonCopyNotification(String carbonCopyNotification) {
    this.carbonCopyNotification = carbonCopyNotification;
  }


  /**
   * certifiedDeliveryNotification.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications certifiedDeliveryNotification(String certifiedDeliveryNotification) {
    this.certifiedDeliveryNotification = certifiedDeliveryNotification;
    return this;
  }

  /**
   * When set to **true**, the user receives notifications of certified deliveries..
   * @return certifiedDeliveryNotification
   **/
  @Schema(description = "When set to **true**, the user receives notifications of certified deliveries.")
  public String getCertifiedDeliveryNotification() {
    return certifiedDeliveryNotification;
  }

  /**
   * setCertifiedDeliveryNotification.
   **/
  public void setCertifiedDeliveryNotification(String certifiedDeliveryNotification) {
    this.certifiedDeliveryNotification = certifiedDeliveryNotification;
  }


  /**
   * commentsOnlyPrivateAndMention.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications commentsOnlyPrivateAndMention(String commentsOnlyPrivateAndMention) {
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
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications commentsReceiveAll(String commentsReceiveAll) {
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
   * documentMarkupActivation.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications documentMarkupActivation(String documentMarkupActivation) {
    this.documentMarkupActivation = documentMarkupActivation;
    return this;
  }

  /**
   * When set to **true**, the user receives notification that document markup has been activated..
   * @return documentMarkupActivation
   **/
  @Schema(description = "When set to **true**, the user receives notification that document markup has been activated.")
  public String getDocumentMarkupActivation() {
    return documentMarkupActivation;
  }

  /**
   * setDocumentMarkupActivation.
   **/
  public void setDocumentMarkupActivation(String documentMarkupActivation) {
    this.documentMarkupActivation = documentMarkupActivation;
  }


  /**
   * envelopeActivation.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications envelopeActivation(String envelopeActivation) {
    this.envelopeActivation = envelopeActivation;
    return this;
  }

  /**
   * When set to **true**, the user receives notification that the envelope has been activated..
   * @return envelopeActivation
   **/
  @Schema(description = "When set to **true**, the user receives notification that the envelope has been activated.")
  public String getEnvelopeActivation() {
    return envelopeActivation;
  }

  /**
   * setEnvelopeActivation.
   **/
  public void setEnvelopeActivation(String envelopeActivation) {
    this.envelopeActivation = envelopeActivation;
  }


  /**
   * envelopeComplete.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications envelopeComplete(String envelopeComplete) {
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
   * envelopeCorrected.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications envelopeCorrected(String envelopeCorrected) {
    this.envelopeCorrected = envelopeCorrected;
    return this;
  }

  /**
   * When set to **true**, the user receives notification that the envelope has been corrected..
   * @return envelopeCorrected
   **/
  @Schema(description = "When set to **true**, the user receives notification that the envelope has been corrected.")
  public String getEnvelopeCorrected() {
    return envelopeCorrected;
  }

  /**
   * setEnvelopeCorrected.
   **/
  public void setEnvelopeCorrected(String envelopeCorrected) {
    this.envelopeCorrected = envelopeCorrected;
  }


  /**
   * envelopeDeclined.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications envelopeDeclined(String envelopeDeclined) {
    this.envelopeDeclined = envelopeDeclined;
    return this;
  }

  /**
   * When set to **true**, the user receives notification that the envelope has been declined..
   * @return envelopeDeclined
   **/
  @Schema(description = "When set to **true**, the user receives notification that the envelope has been declined.")
  public String getEnvelopeDeclined() {
    return envelopeDeclined;
  }

  /**
   * setEnvelopeDeclined.
   **/
  public void setEnvelopeDeclined(String envelopeDeclined) {
    this.envelopeDeclined = envelopeDeclined;
  }


  /**
   * envelopeVoided.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications envelopeVoided(String envelopeVoided) {
    this.envelopeVoided = envelopeVoided;
    return this;
  }

  /**
   * When set to **true**, the user receives notification that the envelope has been voided..
   * @return envelopeVoided
   **/
  @Schema(description = "When set to **true**, the user receives notification that the envelope has been voided.")
  public String getEnvelopeVoided() {
    return envelopeVoided;
  }

  /**
   * setEnvelopeVoided.
   **/
  public void setEnvelopeVoided(String envelopeVoided) {
    this.envelopeVoided = envelopeVoided;
  }


  /**
   * faxReceived.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications faxReceived(String faxReceived) {
    this.faxReceived = faxReceived;
    return this;
  }

  /**
   * Reserved:.
   * @return faxReceived
   **/
  @Schema(description = "Reserved:")
  public String getFaxReceived() {
    return faxReceived;
  }

  /**
   * setFaxReceived.
   **/
  public void setFaxReceived(String faxReceived) {
    this.faxReceived = faxReceived;
  }


  /**
   * offlineSigningFailed.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications offlineSigningFailed(String offlineSigningFailed) {
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
   * purgeDocuments.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications purgeDocuments(String purgeDocuments) {
    this.purgeDocuments = purgeDocuments;
    return this;
  }

  /**
   * When set to **true**, the user receives notification of document purges..
   * @return purgeDocuments
   **/
  @Schema(description = "When set to **true**, the user receives notification of document purges.")
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
   * reassignedSigner.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications reassignedSigner(String reassignedSigner) {
    this.reassignedSigner = reassignedSigner;
    return this;
  }

  /**
   * When set to **true**, the user receives notification that the envelope has been reassigned..
   * @return reassignedSigner
   **/
  @Schema(description = "When set to **true**, the user receives notification that the envelope has been reassigned.")
  public String getReassignedSigner() {
    return reassignedSigner;
  }

  /**
   * setReassignedSigner.
   **/
  public void setReassignedSigner(String reassignedSigner) {
    this.reassignedSigner = reassignedSigner;
  }


  /**
   * whenSigningGroupMember.
   *
   * @return SignerEmailNotifications
   **/
  public SignerEmailNotifications whenSigningGroupMember(String whenSigningGroupMember) {
    this.whenSigningGroupMember = whenSigningGroupMember;
    return this;
  }

  /**
   * .
   * @return whenSigningGroupMember
   **/
  @Schema(description = "")
  public String getWhenSigningGroupMember() {
    return whenSigningGroupMember;
  }

  /**
   * setWhenSigningGroupMember.
   **/
  public void setWhenSigningGroupMember(String whenSigningGroupMember) {
    this.whenSigningGroupMember = whenSigningGroupMember;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(agentNotification, carbonCopyNotification, certifiedDeliveryNotification, commentsOnlyPrivateAndMention, commentsReceiveAll, documentMarkupActivation, envelopeActivation, envelopeComplete, envelopeCorrected, envelopeDeclined, envelopeVoided, faxReceived, offlineSigningFailed, purgeDocuments, reassignedSigner, whenSigningGroupMember);
  }


  /**
   * Converts the given object to string.
   */
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

