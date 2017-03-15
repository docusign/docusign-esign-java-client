package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EnvelopeEvent;
import com.docusign.esign.model.RecipientEvent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * This optional complex element allows a message to be sent a specified URL when the envelope or recipient changes status. It is similar to DocuSign Connect. For example, if an envelope changes from \&quot;Sent\&quot; to \&quot;Delivered\&quot;, a message containing the updated envelope status and optionally the documents is sent to the URL. When an eventNotification is attached to an envelope using the API, it only applies to the envelope (treating the envelope as the sender). This is different from envelopes created through the console user interface, where the user is treated as the sender.
 **/

@ApiModel(description = "This optional complex element allows a message to be sent a specified URL when the envelope or recipient changes status. It is similar to DocuSign Connect. For example, if an envelope changes from \"Sent\" to \"Delivered\", a message containing the updated envelope status and optionally the documents is sent to the URL. When an eventNotification is attached to an envelope using the API, it only applies to the envelope (treating the envelope as the sender). This is different from envelopes created through the console user interface, where the user is treated as the sender.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EventNotification   {
  
  private java.util.List<EnvelopeEvent> envelopeEvents = new java.util.ArrayList<EnvelopeEvent>();
  private String includeCertificateOfCompletion = null;
  private String includeCertificateWithSoap = null;
  private String includeDocumentFields = null;
  private String includeDocuments = null;
  private String includeEnvelopeVoidReason = null;
  private String includeSenderAccountAsCustomField = null;
  private String includeTimeZone = null;
  private String loggingEnabled = null;
  private java.util.List<RecipientEvent> recipientEvents = new java.util.ArrayList<RecipientEvent>();
  private String requireAcknowledgment = null;
  private String signMessageWithX509Cert = null;
  private String soapNameSpace = null;
  private String url = null;
  private String useSoapInterface = null;

  
  /**
   * A list of envelope-level event statuses that will trigger Connect to send updates to the endpoint specified in the `url` property. \n\nTo receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.
   **/
  
  @ApiModelProperty(value = "A list of envelope-level event statuses that will trigger Connect to send updates to the endpoint specified in the `url` property. \n\nTo receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.")
  @JsonProperty("envelopeEvents")
  public java.util.List<EnvelopeEvent> getEnvelopeEvents() {
    return envelopeEvents;
  }
  public void setEnvelopeEvents(java.util.List<EnvelopeEvent> envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
  }

  
  /**
   * When set to **true**, the Connect Service includes the Certificate of Completion with completed envelopes.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the Connect Service includes the Certificate of Completion with completed envelopes.")
  @JsonProperty("includeCertificateOfCompletion")
  public String getIncludeCertificateOfCompletion() {
    return includeCertificateOfCompletion;
  }
  public void setIncludeCertificateOfCompletion(String includeCertificateOfCompletion) {
    this.includeCertificateOfCompletion = includeCertificateOfCompletion;
  }

  
  /**
   * When set to **true**, this tells the Connect service to send the DocuSign signedby certificate as part of the outgoing SOAP xml. This appears in the XML as wsse:BinarySecurityToken.
   **/
  
  @ApiModelProperty(value = "When set to **true**, this tells the Connect service to send the DocuSign signedby certificate as part of the outgoing SOAP xml. This appears in the XML as wsse:BinarySecurityToken.")
  @JsonProperty("includeCertificateWithSoap")
  public String getIncludeCertificateWithSoap() {
    return includeCertificateWithSoap;
  }
  public void setIncludeCertificateWithSoap(String includeCertificateWithSoap) {
    this.includeCertificateWithSoap = includeCertificateWithSoap;
  }

  
  /**
   * When set to **true**, the Document Fields associated with envelope documents are included in the data. Document Fields are optional custom name-value pairs added to documents using the API.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the Document Fields associated with envelope documents are included in the data. Document Fields are optional custom name-value pairs added to documents using the API.")
  @JsonProperty("includeDocumentFields")
  public String getIncludeDocumentFields() {
    return includeDocumentFields;
  }
  public void setIncludeDocumentFields(String includeDocumentFields) {
    this.includeDocumentFields = includeDocumentFields;
  }

  
  /**
   * When set to **true**, the PDF documents are included in the message along with the updated XML.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the PDF documents are included in the message along with the updated XML.")
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
  
  @ApiModelProperty(value = "When set to **true**, this tells the Connect Service to include the void reason, as entered by the person that voided the envelope, in the message.")
  @JsonProperty("includeEnvelopeVoidReason")
  public String getIncludeEnvelopeVoidReason() {
    return includeEnvelopeVoidReason;
  }
  public void setIncludeEnvelopeVoidReason(String includeEnvelopeVoidReason) {
    this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
  }

  
  /**
   * When set to **true**, the sender account ID is included as a envelope custom field in the data.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the sender account ID is included as a envelope custom field in the data.")
  @JsonProperty("includeSenderAccountAsCustomField")
  public String getIncludeSenderAccountAsCustomField() {
    return includeSenderAccountAsCustomField;
  }
  public void setIncludeSenderAccountAsCustomField(String includeSenderAccountAsCustomField) {
    this.includeSenderAccountAsCustomField = includeSenderAccountAsCustomField;
  }

  
  /**
   * When set to **true**, the envelope time zone information is included in the message.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the envelope time zone information is included in the message.")
  @JsonProperty("includeTimeZone")
  public String getIncludeTimeZone() {
    return includeTimeZone;
  }
  public void setIncludeTimeZone(String includeTimeZone) {
    this.includeTimeZone = includeTimeZone;
  }

  
  /**
   * When set to **true**, logging is turned on for envelope events on the Web Console Connect page.
   **/
  
  @ApiModelProperty(value = "When set to **true**, logging is turned on for envelope events on the Web Console Connect page.")
  @JsonProperty("loggingEnabled")
  public String getLoggingEnabled() {
    return loggingEnabled;
  }
  public void setLoggingEnabled(String loggingEnabled) {
    this.loggingEnabled = loggingEnabled;
  }

  
  /**
   * A list of recipient event statuses that will trigger Connect to send updates to   the endpoint specified in the url property.\n\nTo receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.
   **/
  
  @ApiModelProperty(value = "A list of recipient event statuses that will trigger Connect to send updates to   the endpoint specified in the url property.\n\nTo receive notifications, you must include either an `envelopeEvents` node or a `recipientEvents` node. You do not need to specify both.")
  @JsonProperty("recipientEvents")
  public java.util.List<RecipientEvent> getRecipientEvents() {
    return recipientEvents;
  }
  public void setRecipientEvents(java.util.List<RecipientEvent> recipientEvents) {
    this.recipientEvents = recipientEvents;
  }

  
  /**
   * When set to **true**, the DocuSign Connect service checks that the message was received and retries on failures.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the DocuSign Connect service checks that the message was received and retries on failures.")
  @JsonProperty("requireAcknowledgment")
  public String getRequireAcknowledgment() {
    return requireAcknowledgment;
  }
  public void setRequireAcknowledgment(String requireAcknowledgment) {
    this.requireAcknowledgment = requireAcknowledgment;
  }

  
  /**
   * When set to **true**, messages are signed with an X509 certificate. This provides support for 2-way SSL in the envelope.
   **/
  
  @ApiModelProperty(value = "When set to **true**, messages are signed with an X509 certificate. This provides support for 2-way SSL in the envelope.")
  @JsonProperty("signMessageWithX509Cert")
  public String getSignMessageWithX509Cert() {
    return signMessageWithX509Cert;
  }
  public void setSignMessageWithX509Cert(String signMessageWithX509Cert) {
    this.signMessageWithX509Cert = signMessageWithX509Cert;
  }

  
  /**
   * This lists the namespace in the SOAP listener provided.
   **/
  
  @ApiModelProperty(value = "This lists the namespace in the SOAP listener provided.")
  @JsonProperty("soapNameSpace")
  public String getSoapNameSpace() {
    return soapNameSpace;
  }
  public void setSoapNameSpace(String soapNameSpace) {
    this.soapNameSpace = soapNameSpace;
  }

  
  /**
   * Specifies the endpoint to which envelope updates are sent. Udpates are sent as XML unless `useSoapInterface` property is set to **true**.
   **/
  
  @ApiModelProperty(value = "Specifies the endpoint to which envelope updates are sent. Udpates are sent as XML unless `useSoapInterface` property is set to **true**.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * When set to **true**, this tells the Connect service that the user's endpoint has implemented a SOAP interface.
   **/
  
  @ApiModelProperty(value = "When set to **true**, this tells the Connect service that the user's endpoint has implemented a SOAP interface.")
  @JsonProperty("useSoapInterface")
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

    return true && Objects.equals(envelopeEvents, eventNotification.envelopeEvents) &&
        Objects.equals(includeCertificateOfCompletion, eventNotification.includeCertificateOfCompletion) &&
        Objects.equals(includeCertificateWithSoap, eventNotification.includeCertificateWithSoap) &&
        Objects.equals(includeDocumentFields, eventNotification.includeDocumentFields) &&
        Objects.equals(includeDocuments, eventNotification.includeDocuments) &&
        Objects.equals(includeEnvelopeVoidReason, eventNotification.includeEnvelopeVoidReason) &&
        Objects.equals(includeSenderAccountAsCustomField, eventNotification.includeSenderAccountAsCustomField) &&
        Objects.equals(includeTimeZone, eventNotification.includeTimeZone) &&
        Objects.equals(loggingEnabled, eventNotification.loggingEnabled) &&
        Objects.equals(recipientEvents, eventNotification.recipientEvents) &&
        Objects.equals(requireAcknowledgment, eventNotification.requireAcknowledgment) &&
        Objects.equals(signMessageWithX509Cert, eventNotification.signMessageWithX509Cert) &&
        Objects.equals(soapNameSpace, eventNotification.soapNameSpace) &&
        Objects.equals(url, eventNotification.url) &&
        Objects.equals(useSoapInterface, eventNotification.useSoapInterface)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeEvents, includeCertificateOfCompletion, includeCertificateWithSoap, includeDocumentFields, includeDocuments, includeEnvelopeVoidReason, includeSenderAccountAsCustomField, includeTimeZone, loggingEnabled, recipientEvents, requireAcknowledgment, signMessageWithX509Cert, soapNameSpace, url, useSoapInterface);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotification {\n");
    
    if (envelopeEvents != null)
      sb.append("    envelopeEvents: ").append(toIndentedString(envelopeEvents)).append("\n");
    if (includeCertificateOfCompletion != null)
      sb.append("    includeCertificateOfCompletion: ").append(toIndentedString(includeCertificateOfCompletion)).append("\n");
    if (includeCertificateWithSoap != null)
      sb.append("    includeCertificateWithSoap: ").append(toIndentedString(includeCertificateWithSoap)).append("\n");
    if (includeDocumentFields != null)
      sb.append("    includeDocumentFields: ").append(toIndentedString(includeDocumentFields)).append("\n");
    if (includeDocuments != null)
      sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
    if (includeEnvelopeVoidReason != null)
      sb.append("    includeEnvelopeVoidReason: ").append(toIndentedString(includeEnvelopeVoidReason)).append("\n");
    if (includeSenderAccountAsCustomField != null)
      sb.append("    includeSenderAccountAsCustomField: ").append(toIndentedString(includeSenderAccountAsCustomField)).append("\n");
    if (includeTimeZone != null)
      sb.append("    includeTimeZone: ").append(toIndentedString(includeTimeZone)).append("\n");
    if (loggingEnabled != null)
      sb.append("    loggingEnabled: ").append(toIndentedString(loggingEnabled)).append("\n");
    if (recipientEvents != null)
      sb.append("    recipientEvents: ").append(toIndentedString(recipientEvents)).append("\n");
    if (requireAcknowledgment != null)
      sb.append("    requireAcknowledgment: ").append(toIndentedString(requireAcknowledgment)).append("\n");
    if (signMessageWithX509Cert != null)
      sb.append("    signMessageWithX509Cert: ").append(toIndentedString(signMessageWithX509Cert)).append("\n");
    if (soapNameSpace != null)
      sb.append("    soapNameSpace: ").append(toIndentedString(soapNameSpace)).append("\n");
    if (url != null)
      sb.append("    url: ").append(toIndentedString(url)).append("\n");
    if (useSoapInterface != null)
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

