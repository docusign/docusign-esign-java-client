package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EnvelopeEvent;
import com.docusign.esign.model.RecipientEvent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This optional complex element allows a message to be sent a specified URL when the envelope or recipient changes status. It is similar to DocuSign Connect. For example, if an envelope changes from \&quot;Sent\&quot; to \&quot;Delivered\&quot;, a message containing the updated envelope status and optionally the documents is sent to the URL. When an eventNotification is attached to an envelope using the API, it only applies to the envelope (treating the envelope as the sender). This is different from envelopes created through the console user interface, where the user is treated as the sender.
 */
@ApiModel(description = "This optional complex element allows a message to be sent a specified URL when the envelope or recipient changes status. It is similar to DocuSign Connect. For example, if an envelope changes from \"Sent\" to \"Delivered\", a message containing the updated envelope status and optionally the documents is sent to the URL. When an eventNotification is attached to an envelope using the API, it only applies to the envelope (treating the envelope as the sender). This is different from envelopes created through the console user interface, where the user is treated as the sender.")

public class EventNotification {
  @JsonProperty("envelopeEvents")
  private java.util.List<EnvelopeEvent> envelopeEvents = new java.util.ArrayList<EnvelopeEvent>();

  @JsonProperty("includeCertificateOfCompletion")
  private String includeCertificateOfCompletion = null;

  @JsonProperty("includeCertificateWithSoap")
  private String includeCertificateWithSoap = null;

  @JsonProperty("includeDocumentFields")
  private String includeDocumentFields = null;

  @JsonProperty("includeDocuments")
  private String includeDocuments = null;

  @JsonProperty("includeEnvelopeVoidReason")
  private String includeEnvelopeVoidReason = null;

  @JsonProperty("includeSenderAccountAsCustomField")
  private String includeSenderAccountAsCustomField = null;

  @JsonProperty("includeTimeZone")
  private String includeTimeZone = null;

  @JsonProperty("loggingEnabled")
  private String loggingEnabled = null;

  @JsonProperty("recipientEvents")
  private java.util.List<RecipientEvent> recipientEvents = new java.util.ArrayList<RecipientEvent>();

  @JsonProperty("requireAcknowledgment")
  private String requireAcknowledgment = null;

  @JsonProperty("signMessageWithX509Cert")
  private String signMessageWithX509Cert = null;

  @JsonProperty("soapNameSpace")
  private String soapNameSpace = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("useSoapInterface")
  private String useSoapInterface = null;

  public EventNotification envelopeEvents(java.util.List<EnvelopeEvent> envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
    return this;
  }

  public EventNotification addEnvelopeEventsItem(EnvelopeEvent envelopeEventsItem) {
    this.envelopeEvents.add(envelopeEventsItem);
    return this;
  }

   /**
   * A list of envelope-level event statuses that will trigger Connect to send updates to the endpoint specified in the `url` property.   To receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.
   * @return envelopeEvents
  **/
  @ApiModelProperty(example = "null", value = "A list of envelope-level event statuses that will trigger Connect to send updates to the endpoint specified in the `url` property.   To receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.")
  public java.util.List<EnvelopeEvent> getEnvelopeEvents() {
    return envelopeEvents;
  }

  public void setEnvelopeEvents(java.util.List<EnvelopeEvent> envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
  }

  public EventNotification includeCertificateOfCompletion(String includeCertificateOfCompletion) {
    this.includeCertificateOfCompletion = includeCertificateOfCompletion;
    return this;
  }

   /**
   * When set to **true**, the Connect Service includes the Certificate of Completion with completed envelopes. 
   * @return includeCertificateOfCompletion
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the Connect Service includes the Certificate of Completion with completed envelopes. ")
  public String getIncludeCertificateOfCompletion() {
    return includeCertificateOfCompletion;
  }

  public void setIncludeCertificateOfCompletion(String includeCertificateOfCompletion) {
    this.includeCertificateOfCompletion = includeCertificateOfCompletion;
  }

  public EventNotification includeCertificateWithSoap(String includeCertificateWithSoap) {
    this.includeCertificateWithSoap = includeCertificateWithSoap;
    return this;
  }

   /**
   * When set to **true**, this tells the Connect service to send the DocuSign signedby certificate as part of the outgoing SOAP xml. This appears in the XML as wsse:BinarySecurityToken.
   * @return includeCertificateWithSoap
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, this tells the Connect service to send the DocuSign signedby certificate as part of the outgoing SOAP xml. This appears in the XML as wsse:BinarySecurityToken.")
  public String getIncludeCertificateWithSoap() {
    return includeCertificateWithSoap;
  }

  public void setIncludeCertificateWithSoap(String includeCertificateWithSoap) {
    this.includeCertificateWithSoap = includeCertificateWithSoap;
  }

  public EventNotification includeDocumentFields(String includeDocumentFields) {
    this.includeDocumentFields = includeDocumentFields;
    return this;
  }

   /**
   * When set to **true**, the Document Fields associated with envelope documents are included in the data. Document Fields are optional custom name-value pairs added to documents using the API. 
   * @return includeDocumentFields
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the Document Fields associated with envelope documents are included in the data. Document Fields are optional custom name-value pairs added to documents using the API. ")
  public String getIncludeDocumentFields() {
    return includeDocumentFields;
  }

  public void setIncludeDocumentFields(String includeDocumentFields) {
    this.includeDocumentFields = includeDocumentFields;
  }

  public EventNotification includeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
    return this;
  }

   /**
   * When set to **true**, the PDF documents are included in the message along with the updated XML. 
   * @return includeDocuments
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the PDF documents are included in the message along with the updated XML. ")
  public String getIncludeDocuments() {
    return includeDocuments;
  }

  public void setIncludeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
  }

  public EventNotification includeEnvelopeVoidReason(String includeEnvelopeVoidReason) {
    this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
    return this;
  }

   /**
   * When set to **true**, this tells the Connect Service to include the void reason, as entered by the person that voided the envelope, in the message. 
   * @return includeEnvelopeVoidReason
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, this tells the Connect Service to include the void reason, as entered by the person that voided the envelope, in the message. ")
  public String getIncludeEnvelopeVoidReason() {
    return includeEnvelopeVoidReason;
  }

  public void setIncludeEnvelopeVoidReason(String includeEnvelopeVoidReason) {
    this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
  }

  public EventNotification includeSenderAccountAsCustomField(String includeSenderAccountAsCustomField) {
    this.includeSenderAccountAsCustomField = includeSenderAccountAsCustomField;
    return this;
  }

   /**
   * When set to **true**, the sender account ID is included as a envelope custom field in the data. 
   * @return includeSenderAccountAsCustomField
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender account ID is included as a envelope custom field in the data. ")
  public String getIncludeSenderAccountAsCustomField() {
    return includeSenderAccountAsCustomField;
  }

  public void setIncludeSenderAccountAsCustomField(String includeSenderAccountAsCustomField) {
    this.includeSenderAccountAsCustomField = includeSenderAccountAsCustomField;
  }

  public EventNotification includeTimeZone(String includeTimeZone) {
    this.includeTimeZone = includeTimeZone;
    return this;
  }

   /**
   * When set to **true**, the envelope time zone information is included in the message. 
   * @return includeTimeZone
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the envelope time zone information is included in the message. ")
  public String getIncludeTimeZone() {
    return includeTimeZone;
  }

  public void setIncludeTimeZone(String includeTimeZone) {
    this.includeTimeZone = includeTimeZone;
  }

  public EventNotification loggingEnabled(String loggingEnabled) {
    this.loggingEnabled = loggingEnabled;
    return this;
  }

   /**
   * When set to **true**, logging is turned on for envelope events on the Web Console Connect page. 
   * @return loggingEnabled
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, logging is turned on for envelope events on the Web Console Connect page. ")
  public String getLoggingEnabled() {
    return loggingEnabled;
  }

  public void setLoggingEnabled(String loggingEnabled) {
    this.loggingEnabled = loggingEnabled;
  }

  public EventNotification recipientEvents(java.util.List<RecipientEvent> recipientEvents) {
    this.recipientEvents = recipientEvents;
    return this;
  }

  public EventNotification addRecipientEventsItem(RecipientEvent recipientEventsItem) {
    this.recipientEvents.add(recipientEventsItem);
    return this;
  }

   /**
   * A list of recipient event statuses that will trigger Connect to send updates to   the endpoint specified in the url property.  To receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.
   * @return recipientEvents
  **/
  @ApiModelProperty(example = "null", value = "A list of recipient event statuses that will trigger Connect to send updates to   the endpoint specified in the url property.  To receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.")
  public java.util.List<RecipientEvent> getRecipientEvents() {
    return recipientEvents;
  }

  public void setRecipientEvents(java.util.List<RecipientEvent> recipientEvents) {
    this.recipientEvents = recipientEvents;
  }

  public EventNotification requireAcknowledgment(String requireAcknowledgment) {
    this.requireAcknowledgment = requireAcknowledgment;
    return this;
  }

   /**
   * When set to **true**, the DocuSign Connect service checks that the message was received and retries on failures. 
   * @return requireAcknowledgment
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the DocuSign Connect service checks that the message was received and retries on failures. ")
  public String getRequireAcknowledgment() {
    return requireAcknowledgment;
  }

  public void setRequireAcknowledgment(String requireAcknowledgment) {
    this.requireAcknowledgment = requireAcknowledgment;
  }

  public EventNotification signMessageWithX509Cert(String signMessageWithX509Cert) {
    this.signMessageWithX509Cert = signMessageWithX509Cert;
    return this;
  }

   /**
   * When set to **true**, messages are signed with an X509 certificate. This provides support for 2-way SSL in the envelope. 
   * @return signMessageWithX509Cert
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, messages are signed with an X509 certificate. This provides support for 2-way SSL in the envelope. ")
  public String getSignMessageWithX509Cert() {
    return signMessageWithX509Cert;
  }

  public void setSignMessageWithX509Cert(String signMessageWithX509Cert) {
    this.signMessageWithX509Cert = signMessageWithX509Cert;
  }

  public EventNotification soapNameSpace(String soapNameSpace) {
    this.soapNameSpace = soapNameSpace;
    return this;
  }

   /**
   * This lists the namespace in the SOAP listener provided.
   * @return soapNameSpace
  **/
  @ApiModelProperty(example = "null", value = "This lists the namespace in the SOAP listener provided.")
  public String getSoapNameSpace() {
    return soapNameSpace;
  }

  public void setSoapNameSpace(String soapNameSpace) {
    this.soapNameSpace = soapNameSpace;
  }

  public EventNotification url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Specifies the endpoint to which envelope updates are sent. Udpates are sent as XML unless `useSoapInterface` property is set to **true**.
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "Specifies the endpoint to which envelope updates are sent. Udpates are sent as XML unless `useSoapInterface` property is set to **true**.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public EventNotification useSoapInterface(String useSoapInterface) {
    this.useSoapInterface = useSoapInterface;
    return this;
  }

   /**
   * When set to **true**, this tells the Connect service that the user's endpoint has implemented a SOAP interface. 
   * @return useSoapInterface
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, this tells the Connect service that the user's endpoint has implemented a SOAP interface. ")
  public String getUseSoapInterface() {
    return useSoapInterface;
  }

  public void setUseSoapInterface(String useSoapInterface) {
    this.useSoapInterface = useSoapInterface;
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
    return Objects.equals(this.envelopeEvents, eventNotification.envelopeEvents) &&
        Objects.equals(this.includeCertificateOfCompletion, eventNotification.includeCertificateOfCompletion) &&
        Objects.equals(this.includeCertificateWithSoap, eventNotification.includeCertificateWithSoap) &&
        Objects.equals(this.includeDocumentFields, eventNotification.includeDocumentFields) &&
        Objects.equals(this.includeDocuments, eventNotification.includeDocuments) &&
        Objects.equals(this.includeEnvelopeVoidReason, eventNotification.includeEnvelopeVoidReason) &&
        Objects.equals(this.includeSenderAccountAsCustomField, eventNotification.includeSenderAccountAsCustomField) &&
        Objects.equals(this.includeTimeZone, eventNotification.includeTimeZone) &&
        Objects.equals(this.loggingEnabled, eventNotification.loggingEnabled) &&
        Objects.equals(this.recipientEvents, eventNotification.recipientEvents) &&
        Objects.equals(this.requireAcknowledgment, eventNotification.requireAcknowledgment) &&
        Objects.equals(this.signMessageWithX509Cert, eventNotification.signMessageWithX509Cert) &&
        Objects.equals(this.soapNameSpace, eventNotification.soapNameSpace) &&
        Objects.equals(this.url, eventNotification.url) &&
        Objects.equals(this.useSoapInterface, eventNotification.useSoapInterface);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeEvents, includeCertificateOfCompletion, includeCertificateWithSoap, includeDocumentFields, includeDocuments, includeEnvelopeVoidReason, includeSenderAccountAsCustomField, includeTimeZone, loggingEnabled, recipientEvents, requireAcknowledgment, signMessageWithX509Cert, soapNameSpace, url, useSoapInterface);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotification {\n");
    
    sb.append("    envelopeEvents: ").append(toIndentedString(envelopeEvents)).append("\n");
    sb.append("    includeCertificateOfCompletion: ").append(toIndentedString(includeCertificateOfCompletion)).append("\n");
    sb.append("    includeCertificateWithSoap: ").append(toIndentedString(includeCertificateWithSoap)).append("\n");
    sb.append("    includeDocumentFields: ").append(toIndentedString(includeDocumentFields)).append("\n");
    sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
    sb.append("    includeEnvelopeVoidReason: ").append(toIndentedString(includeEnvelopeVoidReason)).append("\n");
    sb.append("    includeSenderAccountAsCustomField: ").append(toIndentedString(includeSenderAccountAsCustomField)).append("\n");
    sb.append("    includeTimeZone: ").append(toIndentedString(includeTimeZone)).append("\n");
    sb.append("    loggingEnabled: ").append(toIndentedString(loggingEnabled)).append("\n");
    sb.append("    recipientEvents: ").append(toIndentedString(recipientEvents)).append("\n");
    sb.append("    requireAcknowledgment: ").append(toIndentedString(requireAcknowledgment)).append("\n");
    sb.append("    signMessageWithX509Cert: ").append(toIndentedString(signMessageWithX509Cert)).append("\n");
    sb.append("    soapNameSpace: ").append(toIndentedString(soapNameSpace)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useSoapInterface: ").append(toIndentedString(useSoapInterface)).append("\n");
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

