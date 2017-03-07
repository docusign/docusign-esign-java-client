package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ConnectCustomConfiguration   {
  
  private String allowEnvelopePublish = null;
  private String allUsers = null;
  private String configurationType = null;
  private String connectId = null;
  private String enableLog = null;
  private String envelopeEvents = null;
  private String includeCertificateOfCompletion = null;
  private String includeCertSoapHeader = null;
  private String includeDocumentFields = null;
  private String includeDocuments = null;
  private String includeEnvelopeVoidReason = null;
  private String includeSenderAccountasCustomField = null;
  private String includeTimeZoneInformation = null;
  private String name = null;
  private String recipientEvents = null;
  private String requiresAcknowledgement = null;
  private String signMessageWithX509Certificate = null;
  private String soapNamespace = null;
  private String urlToPublishTo = null;
  private String userIds = null;
  private String useSoapInterface = null;

  
  /**
   * When set to **true**, data is sent to the urlToPublishTo web address. This option can be set to false to stop sending data while maintaining the Connect configuration information.
   **/
  
  @ApiModelProperty(value = "When set to **true**, data is sent to the urlToPublishTo web address. This option can be set to false to stop sending data while maintaining the Connect configuration information.")
  @JsonProperty("allowEnvelopePublish")
  public String getAllowEnvelopePublish() {
    return allowEnvelopePublish;
  }
  public void setAllowEnvelopePublish(String allowEnvelopePublish) {
    this.allowEnvelopePublish = allowEnvelopePublish;
  }

  
  /**
   * When set to **true**, the tracked envelope and recipient events for all users, including users that are added a later time, are sent through Connect.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the tracked envelope and recipient events for all users, including users that are added a later time, are sent through Connect.")
  @JsonProperty("allUsers")
  public String getAllUsers() {
    return allUsers;
  }
  public void setAllUsers(String allUsers) {
    this.allUsers = allUsers;
  }

  
  /**
   * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.
   **/
  
  @ApiModelProperty(value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
  @JsonProperty("configurationType")
  public String getConfigurationType() {
    return configurationType;
  }
  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }

  
  /**
   * Specifies the DocuSign generated ID for the Connect configuration.
   **/
  
  @ApiModelProperty(value = "Specifies the DocuSign generated ID for the Connect configuration.")
  @JsonProperty("connectId")
  public String getConnectId() {
    return connectId;
  }
  public void setConnectId(String connectId) {
    this.connectId = connectId;
  }

  
  /**
   * This turns Connect logging on or off. When set to **true**, logging is turned on.
   **/
  
  @ApiModelProperty(value = "This turns Connect logging on or off. When set to **true**, logging is turned on.")
  @JsonProperty("enableLog")
  public String getEnableLog() {
    return enableLog;
  }
  public void setEnableLog(String enableLog) {
    this.enableLog = enableLog;
  }

  
  /**
   * A comma separated list of �Envelope� related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, and Voided.
   **/
  
  @ApiModelProperty(value = "A comma separated list of �Envelope� related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, and Voided.")
  @JsonProperty("envelopeEvents")
  public String getEnvelopeEvents() {
    return envelopeEvents;
  }
  public void setEnvelopeEvents(String envelopeEvents) {
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("includeCertSoapHeader")
  public String getIncludeCertSoapHeader() {
    return includeCertSoapHeader;
  }
  public void setIncludeCertSoapHeader(String includeCertSoapHeader) {
    this.includeCertSoapHeader = includeCertSoapHeader;
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
   * When set to **true**, Connect will send the PDF document along with the update XML.
   **/
  
  @ApiModelProperty(value = "When set to **true**, Connect will send the PDF document along with the update XML.")
  @JsonProperty("includeDocuments")
  public String getIncludeDocuments() {
    return includeDocuments;
  }
  public void setIncludeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
  }

  
  /**
   * When set to **true**, Connect will include the voidedReason for voided envelopes.
   **/
  
  @ApiModelProperty(value = "When set to **true**, Connect will include the voidedReason for voided envelopes.")
  @JsonProperty("includeEnvelopeVoidReason")
  public String getIncludeEnvelopeVoidReason() {
    return includeEnvelopeVoidReason;
  }
  public void setIncludeEnvelopeVoidReason(String includeEnvelopeVoidReason) {
    this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
  }

  
  /**
   * When set to **true**, Connect will include the sender account as Custom Field in the data.
   **/
  
  @ApiModelProperty(value = "When set to **true**, Connect will include the sender account as Custom Field in the data.")
  @JsonProperty("includeSenderAccountasCustomField")
  public String getIncludeSenderAccountasCustomField() {
    return includeSenderAccountasCustomField;
  }
  public void setIncludeSenderAccountasCustomField(String includeSenderAccountasCustomField) {
    this.includeSenderAccountasCustomField = includeSenderAccountasCustomField;
  }

  
  /**
   * When set to **true**, Connect will include the envelope time zone information.
   **/
  
  @ApiModelProperty(value = "When set to **true**, Connect will include the envelope time zone information.")
  @JsonProperty("includeTimeZoneInformation")
  public String getIncludeTimeZoneInformation() {
    return includeTimeZoneInformation;
  }
  public void setIncludeTimeZoneInformation(String includeTimeZoneInformation) {
    this.includeTimeZoneInformation = includeTimeZoneInformation;
  }

  
  /**
   * The name of the Connect configuration. The name helps identify the configuration in the list.
   **/
  
  @ApiModelProperty(value = "The name of the Connect configuration. The name helps identify the configuration in the list.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A comma separated list of �Recipient� related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.
   **/
  
  @ApiModelProperty(value = "A comma separated list of �Recipient� related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.")
  @JsonProperty("recipientEvents")
  public String getRecipientEvents() {
    return recipientEvents;
  }
  public void setRecipientEvents(String recipientEvents) {
    this.recipientEvents = recipientEvents;
  }

  
  /**
   * When set to **true**, and a publication message fails to be acknowledged, the message goes back into the queue and the system will retry delivery after a successful acknowledgement is received. If the delivery fails a second time, the message is not returned to the queue for sending until Connect receives a successful acknowledgement and it has been at least 24 hours since the previous retry. There is a maximum of ten retries Alternately, you can use Republish Connect Information to manually republish the envelope information.
   **/
  
  @ApiModelProperty(value = "When set to **true**, and a publication message fails to be acknowledged, the message goes back into the queue and the system will retry delivery after a successful acknowledgement is received. If the delivery fails a second time, the message is not returned to the queue for sending until Connect receives a successful acknowledgement and it has been at least 24 hours since the previous retry. There is a maximum of ten retries Alternately, you can use Republish Connect Information to manually republish the envelope information.")
  @JsonProperty("requiresAcknowledgement")
  public String getRequiresAcknowledgement() {
    return requiresAcknowledgement;
  }
  public void setRequiresAcknowledgement(String requiresAcknowledgement) {
    this.requiresAcknowledgement = requiresAcknowledgement;
  }

  
  /**
   * When set to **true**, Connect messages are signed with an X509 certificate. This provides support for 2-way SSL.
   **/
  
  @ApiModelProperty(value = "When set to **true**, Connect messages are signed with an X509 certificate. This provides support for 2-way SSL.")
  @JsonProperty("signMessageWithX509Certificate")
  public String getSignMessageWithX509Certificate() {
    return signMessageWithX509Certificate;
  }
  public void setSignMessageWithX509Certificate(String signMessageWithX509Certificate) {
    this.signMessageWithX509Certificate = signMessageWithX509Certificate;
  }

  
  /**
   * The namespace of the SOAP interface.\n\nThe namespace value must be set if useSoapInterface is set to true.
   **/
  
  @ApiModelProperty(value = "The namespace of the SOAP interface.\n\nThe namespace value must be set if useSoapInterface is set to true.")
  @JsonProperty("soapNamespace")
  public String getSoapNamespace() {
    return soapNamespace;
  }
  public void setSoapNamespace(String soapNamespace) {
    this.soapNamespace = soapNamespace;
  }

  
  /**
   * This is the web address and name of your listener or Retrieving Service endpoint. You need to include HTTPS:// in the web address.
   **/
  
  @ApiModelProperty(value = "This is the web address and name of your listener or Retrieving Service endpoint. You need to include HTTPS:// in the web address.")
  @JsonProperty("urlToPublishTo")
  public String getUrlToPublishTo() {
    return urlToPublishTo;
  }
  public void setUrlToPublishTo(String urlToPublishTo) {
    this.urlToPublishTo = urlToPublishTo;
  }

  
  /**
   * A comma separated list of userIds. This sets the users associated with the tracked envelope and recipient events. When one of the event occurs for a set user, the information is sent through Connect. \n\n###### Note: If allUsers is set to �false� then you must provide a list of user id�s.
   **/
  
  @ApiModelProperty(value = "A comma separated list of userIds. This sets the users associated with the tracked envelope and recipient events. When one of the event occurs for a set user, the information is sent through Connect. \n\n###### Note: If allUsers is set to �false� then you must provide a list of user id�s.")
  @JsonProperty("userIds")
  public String getUserIds() {
    return userIds;
  }
  public void setUserIds(String userIds) {
    this.userIds = userIds;
  }

  
  /**
   * When set to **true**, indicates that the `urlToPublishTo` property contains a SOAP endpoint.
   **/
  
  @ApiModelProperty(value = "When set to **true**, indicates that the `urlToPublishTo` property contains a SOAP endpoint.")
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
    ConnectCustomConfiguration connectCustomConfiguration = (ConnectCustomConfiguration) o;

    return true && Objects.equals(allowEnvelopePublish, connectCustomConfiguration.allowEnvelopePublish) &&
        Objects.equals(allUsers, connectCustomConfiguration.allUsers) &&
        Objects.equals(configurationType, connectCustomConfiguration.configurationType) &&
        Objects.equals(connectId, connectCustomConfiguration.connectId) &&
        Objects.equals(enableLog, connectCustomConfiguration.enableLog) &&
        Objects.equals(envelopeEvents, connectCustomConfiguration.envelopeEvents) &&
        Objects.equals(includeCertificateOfCompletion, connectCustomConfiguration.includeCertificateOfCompletion) &&
        Objects.equals(includeCertSoapHeader, connectCustomConfiguration.includeCertSoapHeader) &&
        Objects.equals(includeDocumentFields, connectCustomConfiguration.includeDocumentFields) &&
        Objects.equals(includeDocuments, connectCustomConfiguration.includeDocuments) &&
        Objects.equals(includeEnvelopeVoidReason, connectCustomConfiguration.includeEnvelopeVoidReason) &&
        Objects.equals(includeSenderAccountasCustomField, connectCustomConfiguration.includeSenderAccountasCustomField) &&
        Objects.equals(includeTimeZoneInformation, connectCustomConfiguration.includeTimeZoneInformation) &&
        Objects.equals(name, connectCustomConfiguration.name) &&
        Objects.equals(recipientEvents, connectCustomConfiguration.recipientEvents) &&
        Objects.equals(requiresAcknowledgement, connectCustomConfiguration.requiresAcknowledgement) &&
        Objects.equals(signMessageWithX509Certificate, connectCustomConfiguration.signMessageWithX509Certificate) &&
        Objects.equals(soapNamespace, connectCustomConfiguration.soapNamespace) &&
        Objects.equals(urlToPublishTo, connectCustomConfiguration.urlToPublishTo) &&
        Objects.equals(userIds, connectCustomConfiguration.userIds) &&
        Objects.equals(useSoapInterface, connectCustomConfiguration.useSoapInterface)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEnvelopePublish, allUsers, configurationType, connectId, enableLog, envelopeEvents, includeCertificateOfCompletion, includeCertSoapHeader, includeDocumentFields, includeDocuments, includeEnvelopeVoidReason, includeSenderAccountasCustomField, includeTimeZoneInformation, name, recipientEvents, requiresAcknowledgement, signMessageWithX509Certificate, soapNamespace, urlToPublishTo, userIds, useSoapInterface);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectCustomConfiguration {\n");
    
    if (allowEnvelopePublish != null)
      sb.append("    allowEnvelopePublish: ").append(toIndentedString(allowEnvelopePublish)).append("\n");
    if (allUsers != null)
      sb.append("    allUsers: ").append(toIndentedString(allUsers)).append("\n");
    if (configurationType != null)
      sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    if (connectId != null)
      sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
    if (enableLog != null)
      sb.append("    enableLog: ").append(toIndentedString(enableLog)).append("\n");
    if (envelopeEvents != null)
      sb.append("    envelopeEvents: ").append(toIndentedString(envelopeEvents)).append("\n");
    if (includeCertificateOfCompletion != null)
      sb.append("    includeCertificateOfCompletion: ").append(toIndentedString(includeCertificateOfCompletion)).append("\n");
    if (includeCertSoapHeader != null)
      sb.append("    includeCertSoapHeader: ").append(toIndentedString(includeCertSoapHeader)).append("\n");
    if (includeDocumentFields != null)
      sb.append("    includeDocumentFields: ").append(toIndentedString(includeDocumentFields)).append("\n");
    if (includeDocuments != null)
      sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
    if (includeEnvelopeVoidReason != null)
      sb.append("    includeEnvelopeVoidReason: ").append(toIndentedString(includeEnvelopeVoidReason)).append("\n");
    if (includeSenderAccountasCustomField != null)
      sb.append("    includeSenderAccountasCustomField: ").append(toIndentedString(includeSenderAccountasCustomField)).append("\n");
    if (includeTimeZoneInformation != null)
      sb.append("    includeTimeZoneInformation: ").append(toIndentedString(includeTimeZoneInformation)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (recipientEvents != null)
      sb.append("    recipientEvents: ").append(toIndentedString(recipientEvents)).append("\n");
    if (requiresAcknowledgement != null)
      sb.append("    requiresAcknowledgement: ").append(toIndentedString(requiresAcknowledgement)).append("\n");
    if (signMessageWithX509Certificate != null)
      sb.append("    signMessageWithX509Certificate: ").append(toIndentedString(signMessageWithX509Certificate)).append("\n");
    if (soapNamespace != null)
      sb.append("    soapNamespace: ").append(toIndentedString(soapNamespace)).append("\n");
    if (urlToPublishTo != null)
      sb.append("    urlToPublishTo: ").append(toIndentedString(urlToPublishTo)).append("\n");
    if (userIds != null)
      sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

