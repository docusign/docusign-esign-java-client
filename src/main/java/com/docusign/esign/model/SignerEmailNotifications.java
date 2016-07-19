package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class SignerEmailNotifications   {
  
  private String envelopeActivation = null;
  private String envelopeComplete = null;
  private String carbonCopyNotification = null;
  private String certifiedDeliveryNotification = null;
  private String envelopeDeclined = null;
  private String envelopeVoided = null;
  private String envelopeCorrected = null;
  private String reassignedSigner = null;
  private String purgeDocuments = null;
  private String faxReceived = null;
  private String documentMarkupActivation = null;
  private String agentNotification = null;
  private String offlineSigningFailed = null;

  
  /**
   * When set to **true**, the user receives notification that the envelope has been activated.
   **/
  public SignerEmailNotifications envelopeActivation(String envelopeActivation) {
    this.envelopeActivation = envelopeActivation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been activated.")
  @JsonProperty("envelopeActivation")
  public String getEnvelopeActivation() {
    return envelopeActivation;
  }
  public void setEnvelopeActivation(String envelopeActivation) {
    this.envelopeActivation = envelopeActivation;
  }

  
  /**
   * When set to **true**, the user receives notification that the envelope has been completed.
   **/
  public SignerEmailNotifications envelopeComplete(String envelopeComplete) {
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
   * When set to **true**, the user receives notifications of carbon copy deliveries.
   **/
  public SignerEmailNotifications carbonCopyNotification(String carbonCopyNotification) {
    this.carbonCopyNotification = carbonCopyNotification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notifications of carbon copy deliveries.")
  @JsonProperty("carbonCopyNotification")
  public String getCarbonCopyNotification() {
    return carbonCopyNotification;
  }
  public void setCarbonCopyNotification(String carbonCopyNotification) {
    this.carbonCopyNotification = carbonCopyNotification;
  }

  
  /**
   * When set to **true**, the user receives notifications of certified deliveries.
   **/
  public SignerEmailNotifications certifiedDeliveryNotification(String certifiedDeliveryNotification) {
    this.certifiedDeliveryNotification = certifiedDeliveryNotification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notifications of certified deliveries.")
  @JsonProperty("certifiedDeliveryNotification")
  public String getCertifiedDeliveryNotification() {
    return certifiedDeliveryNotification;
  }
  public void setCertifiedDeliveryNotification(String certifiedDeliveryNotification) {
    this.certifiedDeliveryNotification = certifiedDeliveryNotification;
  }

  
  /**
   * When set to **true**, the user receives notification that the envelope has been declined.
   **/
  public SignerEmailNotifications envelopeDeclined(String envelopeDeclined) {
    this.envelopeDeclined = envelopeDeclined;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been declined.")
  @JsonProperty("envelopeDeclined")
  public String getEnvelopeDeclined() {
    return envelopeDeclined;
  }
  public void setEnvelopeDeclined(String envelopeDeclined) {
    this.envelopeDeclined = envelopeDeclined;
  }

  
  /**
   * When set to **true**, the user receives notification that the envelope has been voided.
   **/
  public SignerEmailNotifications envelopeVoided(String envelopeVoided) {
    this.envelopeVoided = envelopeVoided;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been voided.")
  @JsonProperty("envelopeVoided")
  public String getEnvelopeVoided() {
    return envelopeVoided;
  }
  public void setEnvelopeVoided(String envelopeVoided) {
    this.envelopeVoided = envelopeVoided;
  }

  
  /**
   * When set to **true**, the user receives notification that the envelope has been corrected.
   **/
  public SignerEmailNotifications envelopeCorrected(String envelopeCorrected) {
    this.envelopeCorrected = envelopeCorrected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been corrected.")
  @JsonProperty("envelopeCorrected")
  public String getEnvelopeCorrected() {
    return envelopeCorrected;
  }
  public void setEnvelopeCorrected(String envelopeCorrected) {
    this.envelopeCorrected = envelopeCorrected;
  }

  
  /**
   * When set to **true**, the user receives notification that the envelope has been reassigned.
   **/
  public SignerEmailNotifications reassignedSigner(String reassignedSigner) {
    this.reassignedSigner = reassignedSigner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that the envelope has been reassigned.")
  @JsonProperty("reassignedSigner")
  public String getReassignedSigner() {
    return reassignedSigner;
  }
  public void setReassignedSigner(String reassignedSigner) {
    this.reassignedSigner = reassignedSigner;
  }

  
  /**
   * When set to **true**, the user receives notification of document purges.
   **/
  public SignerEmailNotifications purgeDocuments(String purgeDocuments) {
    this.purgeDocuments = purgeDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification of document purges.")
  @JsonProperty("purgeDocuments")
  public String getPurgeDocuments() {
    return purgeDocuments;
  }
  public void setPurgeDocuments(String purgeDocuments) {
    this.purgeDocuments = purgeDocuments;
  }

  
  /**
   * Reserved:
   **/
  public SignerEmailNotifications faxReceived(String faxReceived) {
    this.faxReceived = faxReceived;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved:")
  @JsonProperty("faxReceived")
  public String getFaxReceived() {
    return faxReceived;
  }
  public void setFaxReceived(String faxReceived) {
    this.faxReceived = faxReceived;
  }

  
  /**
   * When set to **true**, the user receives notification that document markup has been activated.
   **/
  public SignerEmailNotifications documentMarkupActivation(String documentMarkupActivation) {
    this.documentMarkupActivation = documentMarkupActivation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives notification that document markup has been activated.")
  @JsonProperty("documentMarkupActivation")
  public String getDocumentMarkupActivation() {
    return documentMarkupActivation;
  }
  public void setDocumentMarkupActivation(String documentMarkupActivation) {
    this.documentMarkupActivation = documentMarkupActivation;
  }

  
  /**
   * When set to **true**, the user receives agent notification emails.
   **/
  public SignerEmailNotifications agentNotification(String agentNotification) {
    this.agentNotification = agentNotification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the user receives agent notification emails.")
  @JsonProperty("agentNotification")
  public String getAgentNotification() {
    return agentNotification;
  }
  public void setAgentNotification(String agentNotification) {
    this.agentNotification = agentNotification;
  }

  
  /**
   * When set to **true**, the user receives notification if the offline signing failed.
   **/
  public SignerEmailNotifications offlineSigningFailed(String offlineSigningFailed) {
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
    SignerEmailNotifications signerEmailNotifications = (SignerEmailNotifications) o;
    return Objects.equals(this.envelopeActivation, signerEmailNotifications.envelopeActivation) &&
        Objects.equals(this.envelopeComplete, signerEmailNotifications.envelopeComplete) &&
        Objects.equals(this.carbonCopyNotification, signerEmailNotifications.carbonCopyNotification) &&
        Objects.equals(this.certifiedDeliveryNotification, signerEmailNotifications.certifiedDeliveryNotification) &&
        Objects.equals(this.envelopeDeclined, signerEmailNotifications.envelopeDeclined) &&
        Objects.equals(this.envelopeVoided, signerEmailNotifications.envelopeVoided) &&
        Objects.equals(this.envelopeCorrected, signerEmailNotifications.envelopeCorrected) &&
        Objects.equals(this.reassignedSigner, signerEmailNotifications.reassignedSigner) &&
        Objects.equals(this.purgeDocuments, signerEmailNotifications.purgeDocuments) &&
        Objects.equals(this.faxReceived, signerEmailNotifications.faxReceived) &&
        Objects.equals(this.documentMarkupActivation, signerEmailNotifications.documentMarkupActivation) &&
        Objects.equals(this.agentNotification, signerEmailNotifications.agentNotification) &&
        Objects.equals(this.offlineSigningFailed, signerEmailNotifications.offlineSigningFailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeActivation, envelopeComplete, carbonCopyNotification, certifiedDeliveryNotification, envelopeDeclined, envelopeVoided, envelopeCorrected, reassignedSigner, purgeDocuments, faxReceived, documentMarkupActivation, agentNotification, offlineSigningFailed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignerEmailNotifications {\n");
    
    sb.append("    envelopeActivation: ").append(toIndentedString(envelopeActivation)).append("\n");
    sb.append("    envelopeComplete: ").append(toIndentedString(envelopeComplete)).append("\n");
    sb.append("    carbonCopyNotification: ").append(toIndentedString(carbonCopyNotification)).append("\n");
    sb.append("    certifiedDeliveryNotification: ").append(toIndentedString(certifiedDeliveryNotification)).append("\n");
    sb.append("    envelopeDeclined: ").append(toIndentedString(envelopeDeclined)).append("\n");
    sb.append("    envelopeVoided: ").append(toIndentedString(envelopeVoided)).append("\n");
    sb.append("    envelopeCorrected: ").append(toIndentedString(envelopeCorrected)).append("\n");
    sb.append("    reassignedSigner: ").append(toIndentedString(reassignedSigner)).append("\n");
    sb.append("    purgeDocuments: ").append(toIndentedString(purgeDocuments)).append("\n");
    sb.append("    faxReceived: ").append(toIndentedString(faxReceived)).append("\n");
    sb.append("    documentMarkupActivation: ").append(toIndentedString(documentMarkupActivation)).append("\n");
    sb.append("    agentNotification: ").append(toIndentedString(agentNotification)).append("\n");
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

