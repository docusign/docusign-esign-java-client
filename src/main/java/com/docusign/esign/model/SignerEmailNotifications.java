package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives notification that the envelope has been activated.")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives notification that the envelope has been completed.")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives notifications of carbon copy deliveries.")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives notifications of certified deliveries.")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives notification that the envelope has been declined.")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives notification that the envelope has been voided.")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives notification that the envelope has been corrected.")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives notification that the envelope has been reassigned.")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives notification of document purges.")
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
  
  @ApiModelProperty(value = "Reserved:")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives notification that document markup has been activated.")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives agent notification emails.")
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
  
  @ApiModelProperty(value = "When set to **true**, the user receives notification if the offline signing failed.")
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

    return true && Objects.equals(envelopeActivation, signerEmailNotifications.envelopeActivation) &&
        Objects.equals(envelopeComplete, signerEmailNotifications.envelopeComplete) &&
        Objects.equals(carbonCopyNotification, signerEmailNotifications.carbonCopyNotification) &&
        Objects.equals(certifiedDeliveryNotification, signerEmailNotifications.certifiedDeliveryNotification) &&
        Objects.equals(envelopeDeclined, signerEmailNotifications.envelopeDeclined) &&
        Objects.equals(envelopeVoided, signerEmailNotifications.envelopeVoided) &&
        Objects.equals(envelopeCorrected, signerEmailNotifications.envelopeCorrected) &&
        Objects.equals(reassignedSigner, signerEmailNotifications.reassignedSigner) &&
        Objects.equals(purgeDocuments, signerEmailNotifications.purgeDocuments) &&
        Objects.equals(faxReceived, signerEmailNotifications.faxReceived) &&
        Objects.equals(documentMarkupActivation, signerEmailNotifications.documentMarkupActivation) &&
        Objects.equals(agentNotification, signerEmailNotifications.agentNotification) &&
        Objects.equals(offlineSigningFailed, signerEmailNotifications.offlineSigningFailed)
    ;
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

