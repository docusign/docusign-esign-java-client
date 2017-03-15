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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class TemplateRecipients   {
  
  private java.util.List<Agent> agents = new java.util.ArrayList<Agent>();
  private java.util.List<CarbonCopy> carbonCopies = new java.util.ArrayList<CarbonCopy>();
  private java.util.List<CertifiedDelivery> certifiedDeliveries = new java.util.ArrayList<CertifiedDelivery>();
  private String currentRoutingOrder = null;
  private java.util.List<Editor> editors = new java.util.ArrayList<Editor>();
  private ErrorDetails errorDetails = null;
  private java.util.List<InPersonSigner> inPersonSigners = new java.util.ArrayList<InPersonSigner>();
  private java.util.List<Intermediary> intermediaries = new java.util.ArrayList<Intermediary>();
  private String recipientCount = null;
  private java.util.List<Signer> signers = new java.util.ArrayList<Signer>();

  
  /**
   * A complex type defining the management and access rights of a recipient assigned assigned as an agent on the document.
   **/
  
  @ApiModelProperty(value = "A complex type defining the management and access rights of a recipient assigned assigned as an agent on the document.")
  @JsonProperty("agents")
  public java.util.List<Agent> getAgents() {
    return agents;
  }
  public void setAgents(java.util.List<Agent> agents) {
    this.agents = agents;
  }

  
  /**
   * A complex type containing information about recipients who should receive a copy of the envelope, but does not need to sign it.
   **/
  
  @ApiModelProperty(value = "A complex type containing information about recipients who should receive a copy of the envelope, but does not need to sign it.")
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
  
  @ApiModelProperty(value = "A complex type containing information on a recipient the must receive the completed documents for the envelope to be completed, but the recipient does not need to sign, initial, date, or add information to any of the documents.")
  @JsonProperty("certifiedDeliveries")
  public java.util.List<CertifiedDelivery> getCertifiedDeliveries() {
    return certifiedDeliveries;
  }
  public void setCertifiedDeliveries(java.util.List<CertifiedDelivery> certifiedDeliveries) {
    this.certifiedDeliveries = certifiedDeliveries;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentRoutingOrder")
  public String getCurrentRoutingOrder() {
    return currentRoutingOrder;
  }
  public void setCurrentRoutingOrder(String currentRoutingOrder) {
    this.currentRoutingOrder = currentRoutingOrder;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("editors")
  public java.util.List<Editor> getEditors() {
    return editors;
  }
  public void setEditors(java.util.List<Editor> editors) {
    this.editors = editors;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction. The recipient added is the Signing Host and new separate Signer Name field appears after Sign in person is selected.
   **/
  
  @ApiModelProperty(value = "Specifies a signer that is in the same physical location as a DocuSign user who will act as a Signing Host for the transaction. The recipient added is the Signing Host and new separate Signer Name field appears after Sign in person is selected.")
  @JsonProperty("inPersonSigners")
  public java.util.List<InPersonSigner> getInPersonSigners() {
    return inPersonSigners;
  }
  public void setInPersonSigners(java.util.List<InPersonSigner> inPersonSigners) {
    this.inPersonSigners = inPersonSigners;
  }

  
  /**
   * Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the routing order (until subsequent Agents, Editors or Intermediaries recipient types are added).
   **/
  
  @ApiModelProperty(value = "Identifies a recipient that can, but is not required to, add name and email information for recipients at the same or subsequent level in the routing order (until subsequent Agents, Editors or Intermediaries recipient types are added).")
  @JsonProperty("intermediaries")
  public java.util.List<Intermediary> getIntermediaries() {
    return intermediaries;
  }
  public void setIntermediaries(java.util.List<Intermediary> intermediaries) {
    this.intermediaries = intermediaries;
  }

  
  /**
   * The list of recipient event statuses that will trigger Connect to send updates to the url. It can be a two-part list with:\n\n* recipientEventStatusCode - The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.\n* includeDocuments - When set to **true**, the envelope time zone information is included in the message.
   **/
  
  @ApiModelProperty(value = "The list of recipient event statuses that will trigger Connect to send updates to the url. It can be a two-part list with:\n\n* recipientEventStatusCode - The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.\n* includeDocuments - When set to **true**, the envelope time zone information is included in the message.")
  @JsonProperty("recipientCount")
  public String getRecipientCount() {
    return recipientCount;
  }
  public void setRecipientCount(String recipientCount) {
    this.recipientCount = recipientCount;
  }

  
  /**
   * A complex type containing information about the Signer recipient.
   **/
  
  @ApiModelProperty(value = "A complex type containing information about the Signer recipient.")
  @JsonProperty("signers")
  public java.util.List<Signer> getSigners() {
    return signers;
  }
  public void setSigners(java.util.List<Signer> signers) {
    this.signers = signers;
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

    return true && Objects.equals(agents, templateRecipients.agents) &&
        Objects.equals(carbonCopies, templateRecipients.carbonCopies) &&
        Objects.equals(certifiedDeliveries, templateRecipients.certifiedDeliveries) &&
        Objects.equals(currentRoutingOrder, templateRecipients.currentRoutingOrder) &&
        Objects.equals(editors, templateRecipients.editors) &&
        Objects.equals(errorDetails, templateRecipients.errorDetails) &&
        Objects.equals(inPersonSigners, templateRecipients.inPersonSigners) &&
        Objects.equals(intermediaries, templateRecipients.intermediaries) &&
        Objects.equals(recipientCount, templateRecipients.recipientCount) &&
        Objects.equals(signers, templateRecipients.signers)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(agents, carbonCopies, certifiedDeliveries, currentRoutingOrder, editors, errorDetails, inPersonSigners, intermediaries, recipientCount, signers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRecipients {\n");
    
    if (agents != null)
      sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    if (carbonCopies != null)
      sb.append("    carbonCopies: ").append(toIndentedString(carbonCopies)).append("\n");
    if (certifiedDeliveries != null)
      sb.append("    certifiedDeliveries: ").append(toIndentedString(certifiedDeliveries)).append("\n");
    if (currentRoutingOrder != null)
      sb.append("    currentRoutingOrder: ").append(toIndentedString(currentRoutingOrder)).append("\n");
    if (editors != null)
      sb.append("    editors: ").append(toIndentedString(editors)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (inPersonSigners != null)
      sb.append("    inPersonSigners: ").append(toIndentedString(inPersonSigners)).append("\n");
    if (intermediaries != null)
      sb.append("    intermediaries: ").append(toIndentedString(intermediaries)).append("\n");
    if (recipientCount != null)
      sb.append("    recipientCount: ").append(toIndentedString(recipientCount)).append("\n");
    if (signers != null)
      sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
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

