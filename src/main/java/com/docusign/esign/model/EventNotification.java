package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectEventData;
import com.docusign.esign.model.EnvelopeEvent;
import com.docusign.esign.model.RecipientEvent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This optional complex element allows a message to be sent a specified URL when the envelope or recipient changes status. It is similar to DocuSign Connect. For example, if an envelope changes from \&quot;Sent\&quot; to \&quot;Delivered\&quot;, a message containing the updated envelope status and optionally the documents is sent to the URL. When an eventNotification is attached to an envelope using the API, it only applies to the envelope (treating the envelope as the sender). This is different from envelopes created through the console user interface, where the user is treated as the sender..
 *
 */
@ApiModel(description = "This optional complex element allows a message to be sent a specified URL when the envelope or recipient changes status. It is similar to DocuSign Connect. For example, if an envelope changes from \"Sent\" to \"Delivered\", a message containing the updated envelope status and optionally the documents is sent to the URL. When an eventNotification is attached to an envelope using the API, it only applies to the envelope (treating the envelope as the sender). This is different from envelopes created through the console user interface, where the user is treated as the sender.")

public class EventNotification {
  @JsonProperty("deliveryMode")
  private String deliveryMode = null;

  @JsonProperty("envelopeEvents")
  private java.util.List<EnvelopeEvent> envelopeEvents = null;

  @JsonProperty("eventData")
  private ConnectEventData eventData = null;

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

  @JsonProperty("includeHMAC")
  private String includeHMAC = null;

  @JsonProperty("includeSenderAccountAsCustomField")
  private String includeSenderAccountAsCustomField = null;

  @JsonProperty("includeTimeZone")
  private String includeTimeZone = null;

  @JsonProperty("loggingEnabled")
  private String loggingEnabled = null;

  @JsonProperty("recipientEvents")
  private java.util.List<RecipientEvent> recipientEvents = null;

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


  /**
   * deliveryMode.
   *
   * @return EventNotification
   **/
  public EventNotification deliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  /**
   * .
   * @return deliveryMode
   **/
  @ApiModelProperty(value = "")
  public String getDeliveryMode() {
    return deliveryMode;
  }

  /**
   * setDeliveryMode.
   **/
  public void setDeliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  /**
   * envelopeEvents.
   *
   * @return EventNotification
   **/
  public EventNotification envelopeEvents(java.util.List<EnvelopeEvent> envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
    return this;
  }
  
  /**
   * addEnvelopeEventsItem.
   *
   * @return EventNotification
   **/
  public EventNotification addEnvelopeEventsItem(EnvelopeEvent envelopeEventsItem) {
    if (this.envelopeEvents == null) {
      this.envelopeEvents = new java.util.ArrayList<EnvelopeEvent>();
    }
    this.envelopeEvents.add(envelopeEventsItem);
    return this;
  }

  /**
   * A list of envelope-level event statuses that will trigger Connect to send updates to the endpoint specified in the `url` property.   To receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both..
   * @return envelopeEvents
   **/
  @ApiModelProperty(value = "A list of envelope-level event statuses that will trigger Connect to send updates to the endpoint specified in the `url` property.   To receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.")
  public java.util.List<EnvelopeEvent> getEnvelopeEvents() {
    return envelopeEvents;
  }

  /**
   * setEnvelopeEvents.
   **/
  public void setEnvelopeEvents(java.util.List<EnvelopeEvent> envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
  }


  /**
   * eventData.
   *
   * @return EventNotification
   **/
  public EventNotification eventData(ConnectEventData eventData) {
    this.eventData = eventData;
    return this;
  }

  /**
   * Get eventData.
   * @return eventData
   **/
  @ApiModelProperty(value = "")
  public ConnectEventData getEventData() {
    return eventData;
  }

  /**
   * setEventData.
   **/
  public void setEventData(ConnectEventData eventData) {
    this.eventData = eventData;
  }


  /**
   * includeCertificateOfCompletion.
   *
   * @return EventNotification
   **/
  public EventNotification includeCertificateOfCompletion(String includeCertificateOfCompletion) {
    this.includeCertificateOfCompletion = includeCertificateOfCompletion;
    return this;
  }

  /**
   * When set to **true**, the Connect Service includes the Certificate of Completion with completed envelopes. .
   * @return includeCertificateOfCompletion
   **/
  @ApiModelProperty(value = "When set to **true**, the Connect Service includes the Certificate of Completion with completed envelopes. ")
  public String getIncludeCertificateOfCompletion() {
    return includeCertificateOfCompletion;
  }

  /**
   * setIncludeCertificateOfCompletion.
   **/
  public void setIncludeCertificateOfCompletion(String includeCertificateOfCompletion) {
    this.includeCertificateOfCompletion = includeCertificateOfCompletion;
  }


  /**
   * includeCertificateWithSoap.
   *
   * @return EventNotification
   **/
  public EventNotification includeCertificateWithSoap(String includeCertificateWithSoap) {
    this.includeCertificateWithSoap = includeCertificateWithSoap;
    return this;
  }

  /**
   * When set to **true**, this tells the Connect service to send the DocuSign signedby certificate as part of the outgoing SOAP xml. This appears in the XML as wsse:BinarySecurityToken..
   * @return includeCertificateWithSoap
   **/
  @ApiModelProperty(value = "When set to **true**, this tells the Connect service to send the DocuSign signedby certificate as part of the outgoing SOAP xml. This appears in the XML as wsse:BinarySecurityToken.")
  public String getIncludeCertificateWithSoap() {
    return includeCertificateWithSoap;
  }

  /**
   * setIncludeCertificateWithSoap.
   **/
  public void setIncludeCertificateWithSoap(String includeCertificateWithSoap) {
    this.includeCertificateWithSoap = includeCertificateWithSoap;
  }


  /**
   * includeDocumentFields.
   *
   * @return EventNotification
   **/
  public EventNotification includeDocumentFields(String includeDocumentFields) {
    this.includeDocumentFields = includeDocumentFields;
    return this;
  }

  /**
   * When set to **true**, the Document Fields associated with envelope documents are included in the data. Document Fields are optional custom name-value pairs added to documents using the API. .
   * @return includeDocumentFields
   **/
  @ApiModelProperty(value = "When set to **true**, the Document Fields associated with envelope documents are included in the data. Document Fields are optional custom name-value pairs added to documents using the API. ")
  public String getIncludeDocumentFields() {
    return includeDocumentFields;
  }

  /**
   * setIncludeDocumentFields.
   **/
  public void setIncludeDocumentFields(String includeDocumentFields) {
    this.includeDocumentFields = includeDocumentFields;
  }


  /**
   * includeDocuments.
   *
   * @return EventNotification
   **/
  public EventNotification includeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
    return this;
  }

  /**
   * When set to **true**, the PDF documents are included in the message along with the updated XML. .
   * @return includeDocuments
   **/
  @ApiModelProperty(value = "When set to **true**, the PDF documents are included in the message along with the updated XML. ")
  public String getIncludeDocuments() {
    return includeDocuments;
  }

  /**
   * setIncludeDocuments.
   **/
  public void setIncludeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
  }


  /**
   * includeEnvelopeVoidReason.
   *
   * @return EventNotification
   **/
  public EventNotification includeEnvelopeVoidReason(String includeEnvelopeVoidReason) {
    this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
    return this;
  }

  /**
   * When set to **true**, this tells the Connect Service to include the void reason, as entered by the person that voided the envelope, in the message. .
   * @return includeEnvelopeVoidReason
   **/
  @ApiModelProperty(value = "When set to **true**, this tells the Connect Service to include the void reason, as entered by the person that voided the envelope, in the message. ")
  public String getIncludeEnvelopeVoidReason() {
    return includeEnvelopeVoidReason;
  }

  /**
   * setIncludeEnvelopeVoidReason.
   **/
  public void setIncludeEnvelopeVoidReason(String includeEnvelopeVoidReason) {
    this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
  }


  /**
   * includeHMAC.
   *
   * @return EventNotification
   **/
  public EventNotification includeHMAC(String includeHMAC) {
    this.includeHMAC = includeHMAC;
    return this;
  }

  /**
   * .
   * @return includeHMAC
   **/
  @ApiModelProperty(value = "")
  public String getIncludeHMAC() {
    return includeHMAC;
  }

  /**
   * setIncludeHMAC.
   **/
  public void setIncludeHMAC(String includeHMAC) {
    this.includeHMAC = includeHMAC;
  }


  /**
   * includeSenderAccountAsCustomField.
   *
   * @return EventNotification
   **/
  public EventNotification includeSenderAccountAsCustomField(String includeSenderAccountAsCustomField) {
    this.includeSenderAccountAsCustomField = includeSenderAccountAsCustomField;
    return this;
  }

  /**
   * When set to **true**, the sender account ID is included as a envelope custom field in the data. .
   * @return includeSenderAccountAsCustomField
   **/
  @ApiModelProperty(value = "When set to **true**, the sender account ID is included as a envelope custom field in the data. ")
  public String getIncludeSenderAccountAsCustomField() {
    return includeSenderAccountAsCustomField;
  }

  /**
   * setIncludeSenderAccountAsCustomField.
   **/
  public void setIncludeSenderAccountAsCustomField(String includeSenderAccountAsCustomField) {
    this.includeSenderAccountAsCustomField = includeSenderAccountAsCustomField;
  }


  /**
   * includeTimeZone.
   *
   * @return EventNotification
   **/
  public EventNotification includeTimeZone(String includeTimeZone) {
    this.includeTimeZone = includeTimeZone;
    return this;
  }

  /**
   * When set to **true**, the envelope time zone information is included in the message. .
   * @return includeTimeZone
   **/
  @ApiModelProperty(value = "When set to **true**, the envelope time zone information is included in the message. ")
  public String getIncludeTimeZone() {
    return includeTimeZone;
  }

  /**
   * setIncludeTimeZone.
   **/
  public void setIncludeTimeZone(String includeTimeZone) {
    this.includeTimeZone = includeTimeZone;
  }


  /**
   * loggingEnabled.
   *
   * @return EventNotification
   **/
  public EventNotification loggingEnabled(String loggingEnabled) {
    this.loggingEnabled = loggingEnabled;
    return this;
  }

  /**
   * When set to **true**, logging is turned on for envelope events on the Web Console Connect page. .
   * @return loggingEnabled
   **/
  @ApiModelProperty(value = "When set to **true**, logging is turned on for envelope events on the Web Console Connect page. ")
  public String getLoggingEnabled() {
    return loggingEnabled;
  }

  /**
   * setLoggingEnabled.
   **/
  public void setLoggingEnabled(String loggingEnabled) {
    this.loggingEnabled = loggingEnabled;
  }


  /**
   * recipientEvents.
   *
   * @return EventNotification
   **/
  public EventNotification recipientEvents(java.util.List<RecipientEvent> recipientEvents) {
    this.recipientEvents = recipientEvents;
    return this;
  }
  
  /**
   * addRecipientEventsItem.
   *
   * @return EventNotification
   **/
  public EventNotification addRecipientEventsItem(RecipientEvent recipientEventsItem) {
    if (this.recipientEvents == null) {
      this.recipientEvents = new java.util.ArrayList<RecipientEvent>();
    }
    this.recipientEvents.add(recipientEventsItem);
    return this;
  }

  /**
   * A list of recipient event statuses that will trigger Connect to send updates to   the endpoint specified in the url property.  To receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both..
   * @return recipientEvents
   **/
  @ApiModelProperty(value = "A list of recipient event statuses that will trigger Connect to send updates to   the endpoint specified in the url property.  To receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.")
  public java.util.List<RecipientEvent> getRecipientEvents() {
    return recipientEvents;
  }

  /**
   * setRecipientEvents.
   **/
  public void setRecipientEvents(java.util.List<RecipientEvent> recipientEvents) {
    this.recipientEvents = recipientEvents;
  }


  /**
   * requireAcknowledgment.
   *
   * @return EventNotification
   **/
  public EventNotification requireAcknowledgment(String requireAcknowledgment) {
    this.requireAcknowledgment = requireAcknowledgment;
    return this;
  }

  /**
   * When set to **true**, the DocuSign Connect service checks that the message was received and retries on failures. .
   * @return requireAcknowledgment
   **/
  @ApiModelProperty(value = "When set to **true**, the DocuSign Connect service checks that the message was received and retries on failures. ")
  public String getRequireAcknowledgment() {
    return requireAcknowledgment;
  }

  /**
   * setRequireAcknowledgment.
   **/
  public void setRequireAcknowledgment(String requireAcknowledgment) {
    this.requireAcknowledgment = requireAcknowledgment;
  }


  /**
   * signMessageWithX509Cert.
   *
   * @return EventNotification
   **/
  public EventNotification signMessageWithX509Cert(String signMessageWithX509Cert) {
    this.signMessageWithX509Cert = signMessageWithX509Cert;
    return this;
  }

  /**
   * When set to **true**, messages are signed with an X509 certificate. This provides support for 2-way SSL in the envelope. .
   * @return signMessageWithX509Cert
   **/
  @ApiModelProperty(value = "When set to **true**, messages are signed with an X509 certificate. This provides support for 2-way SSL in the envelope. ")
  public String getSignMessageWithX509Cert() {
    return signMessageWithX509Cert;
  }

  /**
   * setSignMessageWithX509Cert.
   **/
  public void setSignMessageWithX509Cert(String signMessageWithX509Cert) {
    this.signMessageWithX509Cert = signMessageWithX509Cert;
  }


  /**
   * soapNameSpace.
   *
   * @return EventNotification
   **/
  public EventNotification soapNameSpace(String soapNameSpace) {
    this.soapNameSpace = soapNameSpace;
    return this;
  }

  /**
   * This lists the namespace in the SOAP listener provided..
   * @return soapNameSpace
   **/
  @ApiModelProperty(value = "This lists the namespace in the SOAP listener provided.")
  public String getSoapNameSpace() {
    return soapNameSpace;
  }

  /**
   * setSoapNameSpace.
   **/
  public void setSoapNameSpace(String soapNameSpace) {
    this.soapNameSpace = soapNameSpace;
  }


  /**
   * url.
   *
   * @return EventNotification
   **/
  public EventNotification url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Specifies the endpoint to which envelope updates are sent. Udpates are sent as XML unless `useSoapInterface` property is set to **true**..
   * @return url
   **/
  @ApiModelProperty(value = "Specifies the endpoint to which envelope updates are sent. Udpates are sent as XML unless `useSoapInterface` property is set to **true**.")
  public String getUrl() {
    return url;
  }

  /**
   * setUrl.
   **/
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * useSoapInterface.
   *
   * @return EventNotification
   **/
  public EventNotification useSoapInterface(String useSoapInterface) {
    this.useSoapInterface = useSoapInterface;
    return this;
  }

  /**
   * When set to **true**, this tells the Connect service that the user's endpoint has implemented a SOAP interface. .
   * @return useSoapInterface
   **/
  @ApiModelProperty(value = "When set to **true**, this tells the Connect service that the user's endpoint has implemented a SOAP interface. ")
  public String getUseSoapInterface() {
    return useSoapInterface;
  }

  /**
   * setUseSoapInterface.
   **/
  public void setUseSoapInterface(String useSoapInterface) {
    this.useSoapInterface = useSoapInterface;
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
    EventNotification eventNotification = (EventNotification) o;
    return Objects.equals(this.deliveryMode, eventNotification.deliveryMode) &&
        Objects.equals(this.envelopeEvents, eventNotification.envelopeEvents) &&
        Objects.equals(this.eventData, eventNotification.eventData) &&
        Objects.equals(this.includeCertificateOfCompletion, eventNotification.includeCertificateOfCompletion) &&
        Objects.equals(this.includeCertificateWithSoap, eventNotification.includeCertificateWithSoap) &&
        Objects.equals(this.includeDocumentFields, eventNotification.includeDocumentFields) &&
        Objects.equals(this.includeDocuments, eventNotification.includeDocuments) &&
        Objects.equals(this.includeEnvelopeVoidReason, eventNotification.includeEnvelopeVoidReason) &&
        Objects.equals(this.includeHMAC, eventNotification.includeHMAC) &&
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(deliveryMode, envelopeEvents, eventData, includeCertificateOfCompletion, includeCertificateWithSoap, includeDocumentFields, includeDocuments, includeEnvelopeVoidReason, includeHMAC, includeSenderAccountAsCustomField, includeTimeZone, loggingEnabled, recipientEvents, requireAcknowledgment, signMessageWithX509Cert, soapNameSpace, url, useSoapInterface);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotification {\n");
    
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    envelopeEvents: ").append(toIndentedString(envelopeEvents)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
    sb.append("    includeCertificateOfCompletion: ").append(toIndentedString(includeCertificateOfCompletion)).append("\n");
    sb.append("    includeCertificateWithSoap: ").append(toIndentedString(includeCertificateWithSoap)).append("\n");
    sb.append("    includeDocumentFields: ").append(toIndentedString(includeDocumentFields)).append("\n");
    sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
    sb.append("    includeEnvelopeVoidReason: ").append(toIndentedString(includeEnvelopeVoidReason)).append("\n");
    sb.append("    includeHMAC: ").append(toIndentedString(includeHMAC)).append("\n");
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

