package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Agent;
import com.docusign.esign.model.CarbonCopy;
import com.docusign.esign.model.CertifiedDelivery;
import com.docusign.esign.model.Editor;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.InPersonSigner;
import com.docusign.esign.model.Intermediary;
import com.docusign.esign.model.SealSign;
import com.docusign.esign.model.Signer;
import com.docusign.esign.model.Witness;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Specifies the envelope recipients.
 */
@ApiModel(description = "Specifies the envelope recipients.")

public class Recipients {
  @JsonProperty("agents")
  private java.util.List<Agent> agents = new java.util.ArrayList<Agent>();

  @JsonProperty("carbonCopies")
  private java.util.List<CarbonCopy> carbonCopies = new java.util.ArrayList<CarbonCopy>();

  @JsonProperty("certifiedDeliveries")
  private java.util.List<CertifiedDelivery> certifiedDeliveries = new java.util.ArrayList<CertifiedDelivery>();

  @JsonProperty("currentRoutingOrder")
  private String currentRoutingOrder = null;

  @JsonProperty("editors")
  private java.util.List<Editor> editors = new java.util.ArrayList<Editor>();

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("inPersonSigners")
  private java.util.List<InPersonSigner> inPersonSigners = new java.util.ArrayList<InPersonSigner>();

  @JsonProperty("intermediaries")
  private java.util.List<Intermediary> intermediaries = new java.util.ArrayList<Intermediary>();

  @JsonProperty("recipientCount")
  private String recipientCount = null;

  @JsonProperty("seals")
  private java.util.List<SealSign> seals = new java.util.ArrayList<SealSign>();

  @JsonProperty("signers")
  private java.util.List<Signer> signers = new java.util.ArrayList<Signer>();

  @JsonProperty("witnesses")
  private java.util.List<Witness> witnesses = new java.util.ArrayList<Witness>();

  public Recipients agents(java.util.List<Agent> agents) {
    this.agents = agents;
    return this;
  }

  public Recipients addAgentsItem(Agent agentsItem) {
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * A complex type defining the management and access rights of a recipient assigned assigned as an agent on the document.
   * @return agents
  **/
  @ApiModelProperty(example = "null", value = "A complex type defining the management and access rights of a recipient assigned assigned as an agent on the document.")
  public java.util.List<Agent> getAgents() {
    return agents;
  }

  public void setAgents(java.util.List<Agent> agents) {
    this.agents = agents;
  }

  public Recipients carbonCopies(java.util.List<CarbonCopy> carbonCopies) {
    this.carbonCopies = carbonCopies;
    return this;
  }

  public Recipients addCarbonCopiesItem(CarbonCopy carbonCopiesItem) {
    this.carbonCopies.add(carbonCopiesItem);
    return this;
  }

   /**
   * A complex type containing information about recipients who should receive a copy of the envelope, but does not need to sign it.
   * @return carbonCopies
  **/
  @ApiModelProperty(example = "null", value = "A complex type containing information about recipients who should receive a copy of the envelope, but does not need to sign it.")
  public java.util.List<CarbonCopy> getCarbonCopies() {
    return carbonCopies;
  }

  public void setCarbonCopies(java.util.List<CarbonCopy> carbonCopies) {
    this.carbonCopies = carbonCopies;
  }

  public Recipients certifiedDeliveries(java.util.List<CertifiedDelivery> certifiedDeliveries) {
    this.certifiedDeliveries = certifiedDeliveries;
    return this;
  }

  public Recipients addCertifiedDeliveriesItem(CertifiedDelivery certifiedDeliveriesItem) {
    this.certifiedDeliveries.add(certifiedDeliveriesItem);
    return this;
  }

   /**
   * A complex type containing information on a recipient the must receive the completed documents for the envelope to be completed, but the recipient does not need to sign, initial, date, or add information to any of the documents.
   * @return certifiedDeliveries
  **/
  @ApiModelProperty(example = "null", value = "A complex type containing information on a recipient the must receive the completed documents for the envelope to be completed, but the recipient does not need to sign, initial, date, or add information to any of the documents.")
  public java.util.List<CertifiedDelivery> getCertifiedDeliveries() {
    return certifiedDeliveries;
  }

  public void setCertifiedDeliveries(java.util.List<CertifiedDelivery> certifiedDeliveries) {
    this.certifiedDeliveries = certifiedDeliveries;
  }

  public Recipients currentRoutingOrder(String currentRoutingOrder) {
    this.currentRoutingOrder = currentRoutingOrder;
    return this;
  }

   /**
   * 
   * @return currentRoutingOrder
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrentRoutingOrder() {
    return currentRoutingOrder;
  }

  public void setCurrentRoutingOrder(String currentRoutingOrder) {
    this.currentRoutingOrder = currentRoutingOrder;
  }

  public Recipients editors(java.util.List<Editor> editors) {
    this.editors = editors;
    return this;
  }

  public Recipients addEditorsItem(Editor editorsItem) {
    this.editors.add(editorsItem);
    return this;
  }

   /**
   * A complex type defining the management and access rights of a recipient assigned assigned as an editor on the document.
   * @return editors
  **/
  @ApiModelProperty(example = "null", value = "A complex type defining the management and access rights of a recipient assigned assigned as an editor on the document.")
  public java.util.List<Editor> getEditors() {
    return editors;
  }

  public void setEditors(java.util.List<Editor> editors) {
    this.editors = editors;
  }

  public Recipients errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public Recipients inPersonSigners(java.util.List<InPersonSigner> inPersonSigners) {
    this.inPersonSigners = inPersonSigners;
    return this;
  }

  public Recipients addInPersonSignersItem(InPersonSigner inPersonSignersItem) {
    this.inPersonSigners.add(inPersonSignersItem);
    return this;
  }

   /**
   * Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction. The recipient added is the Signing Host and new separate Signer Name field appears after Sign in person is selected.
   * @return inPersonSigners
  **/
  @ApiModelProperty(example = "null", value = "Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction. The recipient added is the Signing Host and new separate Signer Name field appears after Sign in person is selected.")
  public java.util.List<InPersonSigner> getInPersonSigners() {
    return inPersonSigners;
  }

  public void setInPersonSigners(java.util.List<InPersonSigner> inPersonSigners) {
    this.inPersonSigners = inPersonSigners;
  }

  public Recipients intermediaries(java.util.List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
    return this;
  }

  public Recipients addIntermediariesItem(Intermediary intermediariesItem) {
    this.intermediaries.add(intermediariesItem);
    return this;
  }

   /**
   * Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the routing order (until subsequent Agents, Editors or Intermediaries recipient types are added).
   * @return intermediaries
  **/
  @ApiModelProperty(example = "null", value = "Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the routing order (until subsequent Agents, Editors or Intermediaries recipient types are added).")
  public java.util.List<Intermediary> getIntermediaries() {
    return intermediaries;
  }

  public void setIntermediaries(java.util.List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
  }

  public Recipients recipientCount(String recipientCount) {
    this.recipientCount = recipientCount;
    return this;
  }

   /**
   * 
   * @return recipientCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecipientCount() {
    return recipientCount;
  }

  public void setRecipientCount(String recipientCount) {
    this.recipientCount = recipientCount;
  }

  public Recipients seals(java.util.List<SealSign> seals) {
    this.seals = seals;
    return this;
  }

  public Recipients addSealsItem(SealSign sealsItem) {
    this.seals.add(sealsItem);
    return this;
  }

   /**
   * 
   * @return seals
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<SealSign> getSeals() {
    return seals;
  }

  public void setSeals(java.util.List<SealSign> seals) {
    this.seals = seals;
  }

  public Recipients signers(java.util.List<Signer> signers) {
    this.signers = signers;
    return this;
  }

  public Recipients addSignersItem(Signer signersItem) {
    this.signers.add(signersItem);
    return this;
  }

   /**
   * A complex type containing information about the Signer recipient.
   * @return signers
  **/
  @ApiModelProperty(example = "null", value = "A complex type containing information about the Signer recipient.")
  public java.util.List<Signer> getSigners() {
    return signers;
  }

  public void setSigners(java.util.List<Signer> signers) {
    this.signers = signers;
  }

  public Recipients witnesses(java.util.List<Witness> witnesses) {
    this.witnesses = witnesses;
    return this;
  }

  public Recipients addWitnessesItem(Witness witnessesItem) {
    this.witnesses.add(witnessesItem);
    return this;
  }

   /**
   * 
   * @return witnesses
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<Witness> getWitnesses() {
    return witnesses;
  }

  public void setWitnesses(java.util.List<Witness> witnesses) {
    this.witnesses = witnesses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipients recipients = (Recipients) o;
    return Objects.equals(this.agents, recipients.agents) &&
        Objects.equals(this.carbonCopies, recipients.carbonCopies) &&
        Objects.equals(this.certifiedDeliveries, recipients.certifiedDeliveries) &&
        Objects.equals(this.currentRoutingOrder, recipients.currentRoutingOrder) &&
        Objects.equals(this.editors, recipients.editors) &&
        Objects.equals(this.errorDetails, recipients.errorDetails) &&
        Objects.equals(this.inPersonSigners, recipients.inPersonSigners) &&
        Objects.equals(this.intermediaries, recipients.intermediaries) &&
        Objects.equals(this.recipientCount, recipients.recipientCount) &&
        Objects.equals(this.seals, recipients.seals) &&
        Objects.equals(this.signers, recipients.signers) &&
        Objects.equals(this.witnesses, recipients.witnesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agents, carbonCopies, certifiedDeliveries, currentRoutingOrder, editors, errorDetails, inPersonSigners, intermediaries, recipientCount, seals, signers, witnesses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipients {\n");
    
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    carbonCopies: ").append(toIndentedString(carbonCopies)).append("\n");
    sb.append("    certifiedDeliveries: ").append(toIndentedString(certifiedDeliveries)).append("\n");
    sb.append("    currentRoutingOrder: ").append(toIndentedString(currentRoutingOrder)).append("\n");
    sb.append("    editors: ").append(toIndentedString(editors)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    inPersonSigners: ").append(toIndentedString(inPersonSigners)).append("\n");
    sb.append("    intermediaries: ").append(toIndentedString(intermediaries)).append("\n");
    sb.append("    recipientCount: ").append(toIndentedString(recipientCount)).append("\n");
    sb.append("    seals: ").append(toIndentedString(seals)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    witnesses: ").append(toIndentedString(witnesses)).append("\n");
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

