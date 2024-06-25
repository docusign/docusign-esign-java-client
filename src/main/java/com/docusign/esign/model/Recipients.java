package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Agent;
import com.docusign.esign.model.CarbonCopy;
import com.docusign.esign.model.CertifiedDelivery;
import com.docusign.esign.model.Editor;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.InPersonSigner;
import com.docusign.esign.model.Intermediary;
import com.docusign.esign.model.NotaryRecipient;
import com.docusign.esign.model.Participant;
import com.docusign.esign.model.SealSign;
import com.docusign.esign.model.Signer;
import com.docusign.esign.model.Witness;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Specifies the envelope recipients..
 *
 */
@Schema(description = "Specifies the envelope recipients.")

public class Recipients implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("agents")
  private java.util.List<Agent> agents = null;

  @JsonProperty("carbonCopies")
  private java.util.List<CarbonCopy> carbonCopies = null;

  @JsonProperty("certifiedDeliveries")
  private java.util.List<CertifiedDelivery> certifiedDeliveries = null;

  @JsonProperty("currentRoutingOrder")
  private String currentRoutingOrder = null;

  @JsonProperty("editors")
  private java.util.List<Editor> editors = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("inPersonSigners")
  private java.util.List<InPersonSigner> inPersonSigners = null;

  @JsonProperty("intermediaries")
  private java.util.List<Intermediary> intermediaries = null;

  @JsonProperty("notaries")
  private java.util.List<NotaryRecipient> notaries = null;

  @JsonProperty("participants")
  private java.util.List<Participant> participants = null;

  @JsonProperty("recipientCount")
  private String recipientCount = null;

  @JsonProperty("seals")
  private java.util.List<SealSign> seals = null;

  @JsonProperty("signers")
  private java.util.List<Signer> signers = null;

  @JsonProperty("witnesses")
  private java.util.List<Witness> witnesses = null;


  /**
   * agents.
   *
   * @return Recipients
   **/
  public Recipients agents(java.util.List<Agent> agents) {
    this.agents = agents;
    return this;
  }
  
  /**
   * addAgentsItem.
   *
   * @return Recipients
   **/
  public Recipients addAgentsItem(Agent agentsItem) {
    if (this.agents == null) {
      this.agents = new java.util.ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

  /**
   * A complex type defining the management and access rights of a recipient assigned assigned as an agent on the document..
   * @return agents
   **/
  @Schema(description = "A complex type defining the management and access rights of a recipient assigned assigned as an agent on the document.")
  public java.util.List<Agent> getAgents() {
    return agents;
  }

  /**
   * setAgents.
   **/
  public void setAgents(java.util.List<Agent> agents) {
    this.agents = agents;
  }


  /**
   * carbonCopies.
   *
   * @return Recipients
   **/
  public Recipients carbonCopies(java.util.List<CarbonCopy> carbonCopies) {
    this.carbonCopies = carbonCopies;
    return this;
  }
  
  /**
   * addCarbonCopiesItem.
   *
   * @return Recipients
   **/
  public Recipients addCarbonCopiesItem(CarbonCopy carbonCopiesItem) {
    if (this.carbonCopies == null) {
      this.carbonCopies = new java.util.ArrayList<>();
    }
    this.carbonCopies.add(carbonCopiesItem);
    return this;
  }

  /**
   * A complex type containing information about recipients who should receive a copy of the envelope, but does not need to sign it..
   * @return carbonCopies
   **/
  @Schema(description = "A complex type containing information about recipients who should receive a copy of the envelope, but does not need to sign it.")
  public java.util.List<CarbonCopy> getCarbonCopies() {
    return carbonCopies;
  }

  /**
   * setCarbonCopies.
   **/
  public void setCarbonCopies(java.util.List<CarbonCopy> carbonCopies) {
    this.carbonCopies = carbonCopies;
  }


  /**
   * certifiedDeliveries.
   *
   * @return Recipients
   **/
  public Recipients certifiedDeliveries(java.util.List<CertifiedDelivery> certifiedDeliveries) {
    this.certifiedDeliveries = certifiedDeliveries;
    return this;
  }
  
  /**
   * addCertifiedDeliveriesItem.
   *
   * @return Recipients
   **/
  public Recipients addCertifiedDeliveriesItem(CertifiedDelivery certifiedDeliveriesItem) {
    if (this.certifiedDeliveries == null) {
      this.certifiedDeliveries = new java.util.ArrayList<>();
    }
    this.certifiedDeliveries.add(certifiedDeliveriesItem);
    return this;
  }

  /**
   * A complex type containing information on a recipient the must receive the completed documents for the envelope to be completed, but the recipient does not need to sign, initial, date, or add information to any of the documents..
   * @return certifiedDeliveries
   **/
  @Schema(description = "A complex type containing information on a recipient the must receive the completed documents for the envelope to be completed, but the recipient does not need to sign, initial, date, or add information to any of the documents.")
  public java.util.List<CertifiedDelivery> getCertifiedDeliveries() {
    return certifiedDeliveries;
  }

  /**
   * setCertifiedDeliveries.
   **/
  public void setCertifiedDeliveries(java.util.List<CertifiedDelivery> certifiedDeliveries) {
    this.certifiedDeliveries = certifiedDeliveries;
  }


  /**
   * currentRoutingOrder.
   *
   * @return Recipients
   **/
  public Recipients currentRoutingOrder(String currentRoutingOrder) {
    this.currentRoutingOrder = currentRoutingOrder;
    return this;
  }

  /**
   * .
   * @return currentRoutingOrder
   **/
  @Schema(description = "")
  public String getCurrentRoutingOrder() {
    return currentRoutingOrder;
  }

  /**
   * setCurrentRoutingOrder.
   **/
  public void setCurrentRoutingOrder(String currentRoutingOrder) {
    this.currentRoutingOrder = currentRoutingOrder;
  }


  /**
   * editors.
   *
   * @return Recipients
   **/
  public Recipients editors(java.util.List<Editor> editors) {
    this.editors = editors;
    return this;
  }
  
  /**
   * addEditorsItem.
   *
   * @return Recipients
   **/
  public Recipients addEditorsItem(Editor editorsItem) {
    if (this.editors == null) {
      this.editors = new java.util.ArrayList<>();
    }
    this.editors.add(editorsItem);
    return this;
  }

  /**
   * A complex type defining the management and access rights of a recipient assigned assigned as an editor on the document..
   * @return editors
   **/
  @Schema(description = "A complex type defining the management and access rights of a recipient assigned assigned as an editor on the document.")
  public java.util.List<Editor> getEditors() {
    return editors;
  }

  /**
   * setEditors.
   **/
  public void setEditors(java.util.List<Editor> editors) {
    this.editors = editors;
  }


  /**
   * errorDetails.
   *
   * @return Recipients
   **/
  public Recipients errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * inPersonSigners.
   *
   * @return Recipients
   **/
  public Recipients inPersonSigners(java.util.List<InPersonSigner> inPersonSigners) {
    this.inPersonSigners = inPersonSigners;
    return this;
  }
  
  /**
   * addInPersonSignersItem.
   *
   * @return Recipients
   **/
  public Recipients addInPersonSignersItem(InPersonSigner inPersonSignersItem) {
    if (this.inPersonSigners == null) {
      this.inPersonSigners = new java.util.ArrayList<>();
    }
    this.inPersonSigners.add(inPersonSignersItem);
    return this;
  }

  /**
   * Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction. The recipient added is the Signing Host and new separate Signer Name field appears after Sign in person is selected..
   * @return inPersonSigners
   **/
  @Schema(description = "Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction. The recipient added is the Signing Host and new separate Signer Name field appears after Sign in person is selected.")
  public java.util.List<InPersonSigner> getInPersonSigners() {
    return inPersonSigners;
  }

  /**
   * setInPersonSigners.
   **/
  public void setInPersonSigners(java.util.List<InPersonSigner> inPersonSigners) {
    this.inPersonSigners = inPersonSigners;
  }


  /**
   * intermediaries.
   *
   * @return Recipients
   **/
  public Recipients intermediaries(java.util.List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
    return this;
  }
  
  /**
   * addIntermediariesItem.
   *
   * @return Recipients
   **/
  public Recipients addIntermediariesItem(Intermediary intermediariesItem) {
    if (this.intermediaries == null) {
      this.intermediaries = new java.util.ArrayList<>();
    }
    this.intermediaries.add(intermediariesItem);
    return this;
  }

  /**
   * Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the routing order (until subsequent Agents, Editors or Intermediaries recipient types are added)..
   * @return intermediaries
   **/
  @Schema(description = "Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the routing order (until subsequent Agents, Editors or Intermediaries recipient types are added).")
  public java.util.List<Intermediary> getIntermediaries() {
    return intermediaries;
  }

  /**
   * setIntermediaries.
   **/
  public void setIntermediaries(java.util.List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
  }


  /**
   * notaries.
   *
   * @return Recipients
   **/
  public Recipients notaries(java.util.List<NotaryRecipient> notaries) {
    this.notaries = notaries;
    return this;
  }
  
  /**
   * addNotariesItem.
   *
   * @return Recipients
   **/
  public Recipients addNotariesItem(NotaryRecipient notariesItem) {
    if (this.notaries == null) {
      this.notaries = new java.util.ArrayList<>();
    }
    this.notaries.add(notariesItem);
    return this;
  }

  /**
   * .
   * @return notaries
   **/
  @Schema(description = "")
  public java.util.List<NotaryRecipient> getNotaries() {
    return notaries;
  }

  /**
   * setNotaries.
   **/
  public void setNotaries(java.util.List<NotaryRecipient> notaries) {
    this.notaries = notaries;
  }


  /**
   * participants.
   *
   * @return Recipients
   **/
  public Recipients participants(java.util.List<Participant> participants) {
    this.participants = participants;
    return this;
  }
  
  /**
   * addParticipantsItem.
   *
   * @return Recipients
   **/
  public Recipients addParticipantsItem(Participant participantsItem) {
    if (this.participants == null) {
      this.participants = new java.util.ArrayList<>();
    }
    this.participants.add(participantsItem);
    return this;
  }

  /**
   * .
   * @return participants
   **/
  @Schema(description = "")
  public java.util.List<Participant> getParticipants() {
    return participants;
  }

  /**
   * setParticipants.
   **/
  public void setParticipants(java.util.List<Participant> participants) {
    this.participants = participants;
  }


  /**
   * recipientCount.
   *
   * @return Recipients
   **/
  public Recipients recipientCount(String recipientCount) {
    this.recipientCount = recipientCount;
    return this;
  }

  /**
   * .
   * @return recipientCount
   **/
  @Schema(description = "")
  public String getRecipientCount() {
    return recipientCount;
  }

  /**
   * setRecipientCount.
   **/
  public void setRecipientCount(String recipientCount) {
    this.recipientCount = recipientCount;
  }


  /**
   * seals.
   *
   * @return Recipients
   **/
  public Recipients seals(java.util.List<SealSign> seals) {
    this.seals = seals;
    return this;
  }
  
  /**
   * addSealsItem.
   *
   * @return Recipients
   **/
  public Recipients addSealsItem(SealSign sealsItem) {
    if (this.seals == null) {
      this.seals = new java.util.ArrayList<>();
    }
    this.seals.add(sealsItem);
    return this;
  }

  /**
   * .
   * @return seals
   **/
  @Schema(description = "")
  public java.util.List<SealSign> getSeals() {
    return seals;
  }

  /**
   * setSeals.
   **/
  public void setSeals(java.util.List<SealSign> seals) {
    this.seals = seals;
  }


  /**
   * signers.
   *
   * @return Recipients
   **/
  public Recipients signers(java.util.List<Signer> signers) {
    this.signers = signers;
    return this;
  }
  
  /**
   * addSignersItem.
   *
   * @return Recipients
   **/
  public Recipients addSignersItem(Signer signersItem) {
    if (this.signers == null) {
      this.signers = new java.util.ArrayList<>();
    }
    this.signers.add(signersItem);
    return this;
  }

  /**
   * A complex type containing information about the Signer recipient..
   * @return signers
   **/
  @Schema(description = "A complex type containing information about the Signer recipient.")
  public java.util.List<Signer> getSigners() {
    return signers;
  }

  /**
   * setSigners.
   **/
  public void setSigners(java.util.List<Signer> signers) {
    this.signers = signers;
  }


  /**
   * witnesses.
   *
   * @return Recipients
   **/
  public Recipients witnesses(java.util.List<Witness> witnesses) {
    this.witnesses = witnesses;
    return this;
  }
  
  /**
   * addWitnessesItem.
   *
   * @return Recipients
   **/
  public Recipients addWitnessesItem(Witness witnessesItem) {
    if (this.witnesses == null) {
      this.witnesses = new java.util.ArrayList<>();
    }
    this.witnesses.add(witnessesItem);
    return this;
  }

  /**
   * .
   * @return witnesses
   **/
  @Schema(description = "")
  public java.util.List<Witness> getWitnesses() {
    return witnesses;
  }

  /**
   * setWitnesses.
   **/
  public void setWitnesses(java.util.List<Witness> witnesses) {
    this.witnesses = witnesses;
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
    Recipients recipients = (Recipients) o;
    return Objects.equals(this.agents, recipients.agents) &&
        Objects.equals(this.carbonCopies, recipients.carbonCopies) &&
        Objects.equals(this.certifiedDeliveries, recipients.certifiedDeliveries) &&
        Objects.equals(this.currentRoutingOrder, recipients.currentRoutingOrder) &&
        Objects.equals(this.editors, recipients.editors) &&
        Objects.equals(this.errorDetails, recipients.errorDetails) &&
        Objects.equals(this.inPersonSigners, recipients.inPersonSigners) &&
        Objects.equals(this.intermediaries, recipients.intermediaries) &&
        Objects.equals(this.notaries, recipients.notaries) &&
        Objects.equals(this.participants, recipients.participants) &&
        Objects.equals(this.recipientCount, recipients.recipientCount) &&
        Objects.equals(this.seals, recipients.seals) &&
        Objects.equals(this.signers, recipients.signers) &&
        Objects.equals(this.witnesses, recipients.witnesses);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(agents, carbonCopies, certifiedDeliveries, currentRoutingOrder, editors, errorDetails, inPersonSigners, intermediaries, notaries, participants, recipientCount, seals, signers, witnesses);
  }


  /**
   * Converts the given object to string.
   */
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
    sb.append("    notaries: ").append(toIndentedString(notaries)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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

