package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EnvelopeEvent;
import com.docusign.esign.model.RecipientEvent;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class EventNotification   {
  
  private String url = null;
  private String loggingEnabled = null;
  private String requireAcknowledgment = null;
  private java.util.List<EnvelopeEvent> envelopeEvents = new java.util.ArrayList<EnvelopeEvent>();
  private java.util.List<RecipientEvent> recipientEvents = new java.util.ArrayList<RecipientEvent>();
  private String useSoapInterface = null;
  private String soapNameSpace = null;
  private String includeCertificateWithSoap = null;
  private String signMessageWithX509Cert = null;
  private String includeDocuments = null;
  private String includeEnvelopeVoidReason = null;
  private String includeTimeZone = null;
  private String includeSenderAccountAsCustomField = null;
  private String includeDocumentFields = null;
  private String includeCertificateOfCompletion = null;

  
  /**
   * Specifies the endpoint to which envelope updates are sent. Udpates are sent as XML unless `useSoapInterface` property is set to **true**.
   **/
  public EventNotification url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the endpoint to which envelope updates are sent. Udpates are sent as XML unless `useSoapInterface` property is set to **true**.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * When set to **true**, logging is turned on for envelope events on the Web Console Connect page. 
   **/
  public EventNotification loggingEnabled(String loggingEnabled) {
    this.loggingEnabled = loggingEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, logging is turned on for envelope events on the Web Console Connect page. ")
  @JsonProperty("loggingEnabled")
  public String getLoggingEnabled() {
    return loggingEnabled;
  }
  public void setLoggingEnabled(String loggingEnabled) {
    this.loggingEnabled = loggingEnabled;
  }

  
  /**
   * When set to **true**, the DocuSign Connect service checks that the message was received and retries on failures. 
   **/
  public EventNotification requireAcknowledgment(String requireAcknowledgment) {
    this.requireAcknowledgment = requireAcknowledgment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the DocuSign Connect service checks that the message was received and retries on failures. ")
  @JsonProperty("requireAcknowledgment")
  public String getRequireAcknowledgment() {
    return requireAcknowledgment;
  }
  public void setRequireAcknowledgment(String requireAcknowledgment) {
    this.requireAcknowledgment = requireAcknowledgment;
  }

  
  /**
   * A list of envelope-level event statuses that will trigger Connect to send updates to the endpoint specified in the `url` property. \n\nTo receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.
   **/
  public EventNotification envelopeEvents(java.util.List<EnvelopeEvent> envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of envelope-level event statuses that will trigger Connect to send updates to the endpoint specified in the `url` property. \n\nTo receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.")
  @JsonProperty("envelopeEvents")
  public java.util.List<EnvelopeEvent> getEnvelopeEvents() {
    return envelopeEvents;
  }
  public void setEnvelopeEvents(java.util.List<EnvelopeEvent> envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
  }

  
  /**
   * A list of recipient event statuses that will trigger Connect to send updates to   the endpoint specified in the url property.\n\nTo receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.
   **/
  public EventNotification recipientEvents(java.util.List<RecipientEvent> recipientEvents) {
    this.recipientEvents = recipientEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of recipient event statuses that will trigger Connect to send updates to   the endpoint specified in the url property.\n\nTo receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.")
  @JsonProperty("recipientEvents")
  public java.util.List<RecipientEvent> getRecipientEvents() {
    return recipientEvents;
  }
  public void setRecipientEvents(java.util.List<RecipientEvent> recipientEvents) {
    this.recipientEvents = recipientEvents;
  }

  
  /**
   * When set to **true**, this tells the Connect service that the user's endpoint has implemented a SOAP interface. 
   **/
  public EventNotification useSoapInterface(String useSoapInterface) {
    this.useSoapInterface = useSoapInterface;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, this tells the Connect service that the user's endpoint has implemented a SOAP interface. ")
  @JsonProperty("useSoapInterface")
  public String getUseSoapInterface() {
    return useSoapInterface;
  }
  public void setUseSoapInterface(String useSoapInterface) {
    this.useSoapInterface = useSoapInterface;
  }

  
  /**
   * This lists the namespace in the SOAP listener provided.
   **/
  public EventNotification soapNameSpace(String soapNameSpace) {
    this.soapNameSpace = soapNameSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This lists the namespace in the SOAP listener provided.")
  @JsonProperty("soapNameSpace")
  public String getSoapNameSpace() {
    return soapNameSpace;
  }
  public void setSoapNameSpace(String soapNameSpace) {
    this.soapNameSpace = soapNameSpace;
  }

  
  /**
   * When set to **true**, this tells the Connect service to send the DocuSign signedby certificate as part of the outgoing SOAP xml. This appears in the XML as wsse:BinarySecurityToken.
   **/
  public EventNotification includeCertificateWithSoap(String includeCertificateWithSoap) {
    this.includeCertificateWithSoap = includeCertificateWithSoap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, this tells the Connect service to send the DocuSign signedby certificate as part of the outgoing SOAP xml. This appears in the XML as wsse:BinarySecurityToken.")
  @JsonProperty("includeCertificateWithSoap")
  public String getIncludeCertificateWithSoap() {
    return includeCertificateWithSoap;
  }
  public void setIncludeCertificateWithSoap(String includeCertificateWithSoap) {
    this.includeCertificateWithSoap = includeCertificateWithSoap;
  }

  
  /**
   * When set to **true**, messages are signed with an X509 certificate. This provides support for 2-way SSL in the envelope. 
   **/
  public EventNotification signMessageWithX509Cert(String signMessageWithX509Cert) {
    this.signMessageWithX509Cert = signMessageWithX509Cert;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, messages are signed with an X509 certificate. This provides support for 2-way SSL in the envelope. ")
  @JsonProperty("signMessageWithX509Cert")
  public String getSignMessageWithX509Cert() {
    return signMessageWithX509Cert;
  }
  public void setSignMessageWithX509Cert(String signMessageWithX509Cert) {
    this.signMessageWithX509Cert = signMessageWithX509Cert;
  }

  
  /**
   * When set to **true**, the PDF documents are included in the message along with the updated XML. 
   **/
  public EventNotification includeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the PDF documents are included in the message along with the updated XML. ")
  @JsonProperty("includeDocuments")
  public String getIncludeDocuments() {
    return includeDocuments;
  }
  public void setIncludeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
  }

  
  /**
   * When set to **true**, this tells the Connect Service to include the void reason, as entered by the person that voided the envelope, in the message. 
   **/
  public EventNotification includeEnvelopeVoidReason(String includeEnvelopeVoidReason) {
    this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, this tells the Connect Service to include the void reason, as entered by the person that voided the envelope, in the message. ")
  @JsonProperty("includeEnvelopeVoidReason")
  public String getIncludeEnvelopeVoidReason() {
    return includeEnvelopeVoidReason;
  }
  public void setIncludeEnvelopeVoidReason(String includeEnvelopeVoidReason) {
    this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
  }

  
  /**
   * When set to **true**, the envelope time zone information is included in the message. 
   **/
  public EventNotification includeTimeZone(String includeTimeZone) {
    this.includeTimeZone = includeTimeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the envelope time zone information is included in the message. ")
  @JsonProperty("includeTimeZone")
  public String getIncludeTimeZone() {
    return includeTimeZone;
  }
  public void setIncludeTimeZone(String includeTimeZone) {
    this.includeTimeZone = includeTimeZone;
  }

  
  /**
   * When set to **true**, the sender account ID is included as a envelope custom field in the data. 
   **/
  public EventNotification includeSenderAccountAsCustomField(String includeSenderAccountAsCustomField) {
    this.includeSenderAccountAsCustomField = includeSenderAccountAsCustomField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender account ID is included as a envelope custom field in the data. ")
  @JsonProperty("includeSenderAccountAsCustomField")
  public String getIncludeSenderAccountAsCustomField() {
    return includeSenderAccountAsCustomField;
  }
  public void setIncludeSenderAccountAsCustomField(String includeSenderAccountAsCustomField) {
    this.includeSenderAccountAsCustomField = includeSenderAccountAsCustomField;
  }

  
  /**
   * When set to **true**, the Document Fields associated with envelope documents are included in the data. Document Fields are optional custom name-value pairs added to documents using the API. 
   **/
  public EventNotification includeDocumentFields(String includeDocumentFields) {
    this.includeDocumentFields = includeDocumentFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the Document Fields associated with envelope documents are included in the data. Document Fields are optional custom name-value pairs added to documents using the API. ")
  @JsonProperty("includeDocumentFields")
  public String getIncludeDocumentFields() {
    return includeDocumentFields;
  }
  public void setIncludeDocumentFields(String includeDocumentFields) {
    this.includeDocumentFields = includeDocumentFields;
  }

  
  /**
   * When set to **true**, the Connect Service includes the Certificate of Completion with completed envelopes. 
   **/
  public EventNotification includeCertificateOfCompletion(String includeCertificateOfCompletion) {
    this.includeCertificateOfCompletion = includeCertificateOfCompletion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the Connect Service includes the Certificate of Completion with completed envelopes. ")
  @JsonProperty("includeCertificateOfCompletion")
  public String getIncludeCertificateOfCompletion() {
    return includeCertificateOfCompletion;
  }
  public void setIncludeCertificateOfCompletion(String includeCertificateOfCompletion) {
    this.includeCertificateOfCompletion = includeCertificateOfCompletion;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventNotification eventNotification = (EventNotification) o;
    return Objects.equals(this.url, eventNotification.url) &&
        Objects.equals(this.loggingEnabled, eventNotification.loggingEnabled) &&
        Objects.equals(this.requireAcknowledgment, eventNotification.requireAcknowledgment) &&
        Objects.equals(this.envelopeEvents, eventNotification.envelopeEvents) &&
        Objects.equals(this.recipientEvents, eventNotification.recipientEvents) &&
        Objects.equals(this.useSoapInterface, eventNotification.useSoapInterface) &&
        Objects.equals(this.soapNameSpace, eventNotification.soapNameSpace) &&
        Objects.equals(this.includeCertificateWithSoap, eventNotification.includeCertificateWithSoap) &&
        Objects.equals(this.signMessageWithX509Cert, eventNotification.signMessageWithX509Cert) &&
        Objects.equals(this.includeDocuments, eventNotification.includeDocuments) &&
        Objects.equals(this.includeEnvelopeVoidReason, eventNotification.includeEnvelopeVoidReason) &&
        Objects.equals(this.includeTimeZone, eventNotification.includeTimeZone) &&
        Objects.equals(this.includeSenderAccountAsCustomField, eventNotification.includeSenderAccountAsCustomField) &&
        Objects.equals(this.includeDocumentFields, eventNotification.includeDocumentFields) &&
        Objects.equals(this.includeCertificateOfCompletion, eventNotification.includeCertificateOfCompletion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, loggingEnabled, requireAcknowledgment, envelopeEvents, recipientEvents, useSoapInterface, soapNameSpace, includeCertificateWithSoap, signMessageWithX509Cert, includeDocuments, includeEnvelopeVoidReason, includeTimeZone, includeSenderAccountAsCustomField, includeDocumentFields, includeCertificateOfCompletion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotification {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    loggingEnabled: ").append(toIndentedString(loggingEnabled)).append("\n");
    sb.append("    requireAcknowledgment: ").append(toIndentedString(requireAcknowledgment)).append("\n");
    sb.append("    envelopeEvents: ").append(toIndentedString(envelopeEvents)).append("\n");
    sb.append("    recipientEvents: ").append(toIndentedString(recipientEvents)).append("\n");
    sb.append("    useSoapInterface: ").append(toIndentedString(useSoapInterface)).append("\n");
    sb.append("    soapNameSpace: ").append(toIndentedString(soapNameSpace)).append("\n");
    sb.append("    includeCertificateWithSoap: ").append(toIndentedString(includeCertificateWithSoap)).append("\n");
    sb.append("    signMessageWithX509Cert: ").append(toIndentedString(signMessageWithX509Cert)).append("\n");
    sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
    sb.append("    includeEnvelopeVoidReason: ").append(toIndentedString(includeEnvelopeVoidReason)).append("\n");
    sb.append("    includeTimeZone: ").append(toIndentedString(includeTimeZone)).append("\n");
    sb.append("    includeSenderAccountAsCustomField: ").append(toIndentedString(includeSenderAccountAsCustomField)).append("\n");
    sb.append("    includeDocumentFields: ").append(toIndentedString(includeDocumentFields)).append("\n");
    sb.append("    includeCertificateOfCompletion: ").append(toIndentedString(includeCertificateOfCompletion)).append("\n");
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

