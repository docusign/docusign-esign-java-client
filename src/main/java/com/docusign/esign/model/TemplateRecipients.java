package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Agent;
import com.docusign.esign.model.CarbonCopy;
import com.docusign.esign.model.CertifiedDelivery;
import com.docusign.esign.model.Editor;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.InPersonSigner;
import com.docusign.esign.model.Intermediary;
import com.docusign.esign.model.Signer;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class TemplateRecipients   {
  
  private java.util.List<Signer> signers = new java.util.ArrayList<Signer>();
  private java.util.List<Agent> agents = new java.util.ArrayList<Agent>();
  private java.util.List<Editor> editors = new java.util.ArrayList<Editor>();
  private java.util.List<Intermediary> intermediaries = new java.util.ArrayList<Intermediary>();
  private java.util.List<CarbonCopy> carbonCopies = new java.util.ArrayList<CarbonCopy>();
  private java.util.List<CertifiedDelivery> certifiedDeliveries = new java.util.ArrayList<CertifiedDelivery>();
  private java.util.List<InPersonSigner> inPersonSigners = new java.util.ArrayList<InPersonSigner>();
  private String recipientCount = null;
  private String currentRoutingOrder = null;
  private ErrorDetails errorDetails = null;

  
  /**
   * A complex type containing information about the Signer recipient.
   **/
  public TemplateRecipients signers(java.util.List<Signer> signers) {
    this.signers = signers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A complex type containing information about the Signer recipient.")
  @JsonProperty("signers")
  public java.util.List<Signer> getSigners() {
    return signers;
  }
  public void setSigners(java.util.List<Signer> signers) {
    this.signers = signers;
  }

  
  /**
   * A complex type defining the management and access rights of a recipient assigned assigned as an agent on the document.
   **/
  public TemplateRecipients agents(java.util.List<Agent> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A complex type defining the management and access rights of a recipient assigned assigned as an agent on the document.")
  @JsonProperty("agents")
  public java.util.List<Agent> getAgents() {
    return agents;
  }
  public void setAgents(java.util.List<Agent> agents) {
    this.agents = agents;
  }

  
  /**
   * 
   **/
  public TemplateRecipients editors(java.util.List<Editor> editors) {
    this.editors = editors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("editors")
  public java.util.List<Editor> getEditors() {
    return editors;
  }
  public void setEditors(java.util.List<Editor> editors) {
    this.editors = editors;
  }

  
  /**
   * Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the routing order (until subsequent Agents, Editors or Intermediaries recipient types are added).
   **/
  public TemplateRecipients intermediaries(java.util.List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the routing order (until subsequent Agents, Editors or Intermediaries recipient types are added).")
  @JsonProperty("intermediaries")
  public java.util.List<Intermediary> getIntermediaries() {
    return intermediaries;
  }
  public void setIntermediaries(java.util.List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
  }

  
  /**
   * A complex type containing information about recipients who should receive a copy of the envelope, but does not need to sign it.
   **/
  public TemplateRecipients carbonCopies(java.util.List<CarbonCopy> carbonCopies) {
    this.carbonCopies = carbonCopies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A complex type containing information about recipients who should receive a copy of the envelope, but does not need to sign it.")
  @JsonProperty("carbonCopies")
  public java.util.List<CarbonCopy> getCarbonCopies() {
    return carbonCopies;
  }
  public void setCarbonCopies(java.util.List<CarbonCopy> carbonCopies) {
    this.carbonCopies = carbonCopies;
  }

  
  /**
   * A complex type containing information on a recipient the must receive the completed documents for the envelope to be completed, but the recipient does not need to sign, initial, date, or add information to any of the documents.
   **/
  public TemplateRecipients certifiedDeliveries(java.util.List<CertifiedDelivery> certifiedDeliveries) {
    this.certifiedDeliveries = certifiedDeliveries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A complex type containing information on a recipient the must receive the completed documents for the envelope to be completed, but the recipient does not need to sign, initial, date, or add information to any of the documents.")
  @JsonProperty("certifiedDeliveries")
  public java.util.List<CertifiedDelivery> getCertifiedDeliveries() {
    return certifiedDeliveries;
  }
  public void setCertifiedDeliveries(java.util.List<CertifiedDelivery> certifiedDeliveries) {
    this.certifiedDeliveries = certifiedDeliveries;
  }

  
  /**
   * Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction. The recipient added is the Signing Host and new separate Signer Name field appears after Sign in person is selected.
   **/
  public TemplateRecipients inPersonSigners(java.util.List<InPersonSigner> inPersonSigners) {
    this.inPersonSigners = inPersonSigners;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction. The recipient added is the Signing Host and new separate Signer Name field appears after Sign in person is selected.")
  @JsonProperty("inPersonSigners")
  public java.util.List<InPersonSigner> getInPersonSigners() {
    return inPersonSigners;
  }
  public void setInPersonSigners(java.util.List<InPersonSigner> inPersonSigners) {
    this.inPersonSigners = inPersonSigners;
  }

  
  /**
   * The list of recipient event statuses that will trigger Connect to send updates to the url. It can be a two-part list with:\n\n* recipientEventStatusCode - The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.\n* includeDocuments - When set to **true**, the envelope time zone information is included in the message.
   **/
  public TemplateRecipients recipientCount(String recipientCount) {
    this.recipientCount = recipientCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of recipient event statuses that will trigger Connect to send updates to the url. It can be a two-part list with:\n\n* recipientEventStatusCode - The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.\n* includeDocuments - When set to **true**, the envelope time zone information is included in the message.")
  @JsonProperty("recipientCount")
  public String getRecipientCount() {
    return recipientCount;
  }
  public void setRecipientCount(String recipientCount) {
    this.recipientCount = recipientCount;
  }

  
  /**
   * 
   **/
  public TemplateRecipients currentRoutingOrder(String currentRoutingOrder) {
    this.currentRoutingOrder = currentRoutingOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentRoutingOrder")
  public String getCurrentRoutingOrder() {
    return currentRoutingOrder;
  }
  public void setCurrentRoutingOrder(String currentRoutingOrder) {
    this.currentRoutingOrder = currentRoutingOrder;
  }

  
  /**
   **/
  public TemplateRecipients errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateRecipients templateRecipients = (TemplateRecipients) o;
    return Objects.equals(this.signers, templateRecipients.signers) &&
        Objects.equals(this.agents, templateRecipients.agents) &&
        Objects.equals(this.editors, templateRecipients.editors) &&
        Objects.equals(this.intermediaries, templateRecipients.intermediaries) &&
        Objects.equals(this.carbonCopies, templateRecipients.carbonCopies) &&
        Objects.equals(this.certifiedDeliveries, templateRecipients.certifiedDeliveries) &&
        Objects.equals(this.inPersonSigners, templateRecipients.inPersonSigners) &&
        Objects.equals(this.recipientCount, templateRecipients.recipientCount) &&
        Objects.equals(this.currentRoutingOrder, templateRecipients.currentRoutingOrder) &&
        Objects.equals(this.errorDetails, templateRecipients.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signers, agents, editors, intermediaries, carbonCopies, certifiedDeliveries, inPersonSigners, recipientCount, currentRoutingOrder, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRecipients {\n");
    
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    editors: ").append(toIndentedString(editors)).append("\n");
    sb.append("    intermediaries: ").append(toIndentedString(intermediaries)).append("\n");
    sb.append("    carbonCopies: ").append(toIndentedString(carbonCopies)).append("\n");
    sb.append("    certifiedDeliveries: ").append(toIndentedString(certifiedDeliveries)).append("\n");
    sb.append("    inPersonSigners: ").append(toIndentedString(inPersonSigners)).append("\n");
    sb.append("    recipientCount: ").append(toIndentedString(recipientCount)).append("\n");
    sb.append("    currentRoutingOrder: ").append(toIndentedString(currentRoutingOrder)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

