package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectCustomConfiguration.
 *
 */

public class ConnectCustomConfiguration {
  @JsonProperty("allowEnvelopePublish")
  private String allowEnvelopePublish = null;

  @JsonProperty("allUsers")
  private String allUsers = null;

  @JsonProperty("configurationType")
  private String configurationType = null;

  @JsonProperty("connectId")
  private String connectId = null;

  @JsonProperty("enableLog")
  private String enableLog = null;

  @JsonProperty("envelopeEvents")
  private String envelopeEvents = null;

  @JsonProperty("includeCertificateOfCompletion")
  private String includeCertificateOfCompletion = null;

  @JsonProperty("includeCertSoapHeader")
  private String includeCertSoapHeader = null;

  @JsonProperty("includeDocumentFields")
  private String includeDocumentFields = null;

  @JsonProperty("includeDocuments")
  private String includeDocuments = null;

  @JsonProperty("includeEnvelopeVoidReason")
  private String includeEnvelopeVoidReason = null;

  @JsonProperty("includeHMAC")
  private String includeHMAC = null;

  @JsonProperty("includeSenderAccountasCustomField")
  private String includeSenderAccountasCustomField = null;

  @JsonProperty("includeTimeZoneInformation")
  private String includeTimeZoneInformation = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recipientEvents")
  private String recipientEvents = null;

  @JsonProperty("requiresAcknowledgement")
  private String requiresAcknowledgement = null;

  @JsonProperty("signMessageWithX509Certificate")
  private String signMessageWithX509Certificate = null;

  @JsonProperty("soapNamespace")
  private String soapNamespace = null;

  @JsonProperty("urlToPublishTo")
  private String urlToPublishTo = null;

  @JsonProperty("userIds")
  private String userIds = null;

  @JsonProperty("useSoapInterface")
  private String useSoapInterface = null;


  /**
   * allowEnvelopePublish.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration allowEnvelopePublish(String allowEnvelopePublish) {
    this.allowEnvelopePublish = allowEnvelopePublish;
    return this;
  }

  /**
   * When set to **true**, data is sent to the urlToPublishTo web address. This option can be set to false to stop sending data while maintaining the Connect configuration information..
   * @return allowEnvelopePublish
   **/
  @ApiModelProperty(value = "When set to **true**, data is sent to the urlToPublishTo web address. This option can be set to false to stop sending data while maintaining the Connect configuration information.")
  public String getAllowEnvelopePublish() {
    return allowEnvelopePublish;
  }

  /**
   * setAllowEnvelopePublish.
   **/
  public void setAllowEnvelopePublish(String allowEnvelopePublish) {
    this.allowEnvelopePublish = allowEnvelopePublish;
  }


  /**
   * allUsers.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration allUsers(String allUsers) {
    this.allUsers = allUsers;
    return this;
  }

  /**
   * When set to **true**, the tracked envelope and recipient events for all users, including users that are added a later time, are sent through Connect..
   * @return allUsers
   **/
  @ApiModelProperty(value = "When set to **true**, the tracked envelope and recipient events for all users, including users that are added a later time, are sent through Connect.")
  public String getAllUsers() {
    return allUsers;
  }

  /**
   * setAllUsers.
   **/
  public void setAllUsers(String allUsers) {
    this.allUsers = allUsers;
  }


  /**
   * configurationType.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration configurationType(String configurationType) {
    this.configurationType = configurationType;
    return this;
  }

  /**
   * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**..
   * @return configurationType
   **/
  @ApiModelProperty(value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
  public String getConfigurationType() {
    return configurationType;
  }

  /**
   * setConfigurationType.
   **/
  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }


  /**
   * connectId.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration connectId(String connectId) {
    this.connectId = connectId;
    return this;
  }

  /**
   *  Specifies the DocuSign generated ID for the Connect configuration.  .
   * @return connectId
   **/
  @ApiModelProperty(value = " Specifies the DocuSign generated ID for the Connect configuration.  ")
  public String getConnectId() {
    return connectId;
  }

  /**
   * setConnectId.
   **/
  public void setConnectId(String connectId) {
    this.connectId = connectId;
  }


  /**
   * enableLog.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration enableLog(String enableLog) {
    this.enableLog = enableLog;
    return this;
  }

  /**
   * This turns Connect logging on or off. When set to **true**, logging is turned on..
   * @return enableLog
   **/
  @ApiModelProperty(value = "This turns Connect logging on or off. When set to **true**, logging is turned on.")
  public String getEnableLog() {
    return enableLog;
  }

  /**
   * setEnableLog.
   **/
  public void setEnableLog(String enableLog) {
    this.enableLog = enableLog;
  }


  /**
   * envelopeEvents.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration envelopeEvents(String envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
    return this;
  }

  /**
   * A comma separated list of ï¿½Envelopeï¿½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, and Voided..
   * @return envelopeEvents
   **/
  @ApiModelProperty(value = "A comma separated list of ï¿½Envelopeï¿½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, and Voided.")
  public String getEnvelopeEvents() {
    return envelopeEvents;
  }

  /**
   * setEnvelopeEvents.
   **/
  public void setEnvelopeEvents(String envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
  }


  /**
   * includeCertificateOfCompletion.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration includeCertificateOfCompletion(String includeCertificateOfCompletion) {
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
   * includeCertSoapHeader.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration includeCertSoapHeader(String includeCertSoapHeader) {
    this.includeCertSoapHeader = includeCertSoapHeader;
    return this;
  }

  /**
   * .
   * @return includeCertSoapHeader
   **/
  @ApiModelProperty(value = "")
  public String getIncludeCertSoapHeader() {
    return includeCertSoapHeader;
  }

  /**
   * setIncludeCertSoapHeader.
   **/
  public void setIncludeCertSoapHeader(String includeCertSoapHeader) {
    this.includeCertSoapHeader = includeCertSoapHeader;
  }


  /**
   * includeDocumentFields.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration includeDocumentFields(String includeDocumentFields) {
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
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration includeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
    return this;
  }

  /**
   * When set to **true**, Connect will send the PDF document along with the update XML..
   * @return includeDocuments
   **/
  @ApiModelProperty(value = "When set to **true**, Connect will send the PDF document along with the update XML.")
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
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration includeEnvelopeVoidReason(String includeEnvelopeVoidReason) {
    this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
    return this;
  }

  /**
   * When set to **true**, Connect will include the voidedReason for voided envelopes..
   * @return includeEnvelopeVoidReason
   **/
  @ApiModelProperty(value = "When set to **true**, Connect will include the voidedReason for voided envelopes.")
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
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration includeHMAC(String includeHMAC) {
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
   * includeSenderAccountasCustomField.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration includeSenderAccountasCustomField(String includeSenderAccountasCustomField) {
    this.includeSenderAccountasCustomField = includeSenderAccountasCustomField;
    return this;
  }

  /**
   * When set to **true**, Connect will include the sender account as Custom Field in the data..
   * @return includeSenderAccountasCustomField
   **/
  @ApiModelProperty(value = "When set to **true**, Connect will include the sender account as Custom Field in the data.")
  public String getIncludeSenderAccountasCustomField() {
    return includeSenderAccountasCustomField;
  }

  /**
   * setIncludeSenderAccountasCustomField.
   **/
  public void setIncludeSenderAccountasCustomField(String includeSenderAccountasCustomField) {
    this.includeSenderAccountasCustomField = includeSenderAccountasCustomField;
  }


  /**
   * includeTimeZoneInformation.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration includeTimeZoneInformation(String includeTimeZoneInformation) {
    this.includeTimeZoneInformation = includeTimeZoneInformation;
    return this;
  }

  /**
   * When set to **true**, Connect will include the envelope time zone information..
   * @return includeTimeZoneInformation
   **/
  @ApiModelProperty(value = "When set to **true**, Connect will include the envelope time zone information.")
  public String getIncludeTimeZoneInformation() {
    return includeTimeZoneInformation;
  }

  /**
   * setIncludeTimeZoneInformation.
   **/
  public void setIncludeTimeZoneInformation(String includeTimeZoneInformation) {
    this.includeTimeZoneInformation = includeTimeZoneInformation;
  }


  /**
   * name.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Connect configuration. The name helps identify the configuration in the list..
   * @return name
   **/
  @ApiModelProperty(value = "The name of the Connect configuration. The name helps identify the configuration in the list.")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * recipientEvents.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration recipientEvents(String recipientEvents) {
    this.recipientEvents = recipientEvents;
    return this;
  }

  /**
   * A comma separated list of ï¿½Recipientï¿½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded..
   * @return recipientEvents
   **/
  @ApiModelProperty(value = "A comma separated list of ï¿½Recipientï¿½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.")
  public String getRecipientEvents() {
    return recipientEvents;
  }

  /**
   * setRecipientEvents.
   **/
  public void setRecipientEvents(String recipientEvents) {
    this.recipientEvents = recipientEvents;
  }


  /**
   * requiresAcknowledgement.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration requiresAcknowledgement(String requiresAcknowledgement) {
    this.requiresAcknowledgement = requiresAcknowledgement;
    return this;
  }

  /**
   * When set to **true**, and a publication message fails to be acknowledged, the message goes back into the queue and the system will retry delivery after a successful acknowledgement is received. If the delivery fails a second time, the message is not returned to the queue for sending until Connect receives a successful acknowledgement and it has been at least 24 hours since the previous retry. There is a maximum of ten retries Alternately, you can use Republish Connect Information to manually republish the envelope information..
   * @return requiresAcknowledgement
   **/
  @ApiModelProperty(value = "When set to **true**, and a publication message fails to be acknowledged, the message goes back into the queue and the system will retry delivery after a successful acknowledgement is received. If the delivery fails a second time, the message is not returned to the queue for sending until Connect receives a successful acknowledgement and it has been at least 24 hours since the previous retry. There is a maximum of ten retries Alternately, you can use Republish Connect Information to manually republish the envelope information.")
  public String getRequiresAcknowledgement() {
    return requiresAcknowledgement;
  }

  /**
   * setRequiresAcknowledgement.
   **/
  public void setRequiresAcknowledgement(String requiresAcknowledgement) {
    this.requiresAcknowledgement = requiresAcknowledgement;
  }


  /**
   * signMessageWithX509Certificate.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration signMessageWithX509Certificate(String signMessageWithX509Certificate) {
    this.signMessageWithX509Certificate = signMessageWithX509Certificate;
    return this;
  }

  /**
   * When set to **true**, Connect messages are signed with an X509 certificate. This provides support for 2-way SSL..
   * @return signMessageWithX509Certificate
   **/
  @ApiModelProperty(value = "When set to **true**, Connect messages are signed with an X509 certificate. This provides support for 2-way SSL.")
  public String getSignMessageWithX509Certificate() {
    return signMessageWithX509Certificate;
  }

  /**
   * setSignMessageWithX509Certificate.
   **/
  public void setSignMessageWithX509Certificate(String signMessageWithX509Certificate) {
    this.signMessageWithX509Certificate = signMessageWithX509Certificate;
  }


  /**
   * soapNamespace.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration soapNamespace(String soapNamespace) {
    this.soapNamespace = soapNamespace;
    return this;
  }

  /**
   * The namespace of the SOAP interface.  The namespace value must be set if useSoapInterface is set to true..
   * @return soapNamespace
   **/
  @ApiModelProperty(value = "The namespace of the SOAP interface.  The namespace value must be set if useSoapInterface is set to true.")
  public String getSoapNamespace() {
    return soapNamespace;
  }

  /**
   * setSoapNamespace.
   **/
  public void setSoapNamespace(String soapNamespace) {
    this.soapNamespace = soapNamespace;
  }


  /**
   * urlToPublishTo.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration urlToPublishTo(String urlToPublishTo) {
    this.urlToPublishTo = urlToPublishTo;
    return this;
  }

  /**
   * This is the web address and name of your listener or Retrieving Service endpoint. You need to include HTTPS:// in the web address..
   * @return urlToPublishTo
   **/
  @ApiModelProperty(value = "This is the web address and name of your listener or Retrieving Service endpoint. You need to include HTTPS:// in the web address.")
  public String getUrlToPublishTo() {
    return urlToPublishTo;
  }

  /**
   * setUrlToPublishTo.
   **/
  public void setUrlToPublishTo(String urlToPublishTo) {
    this.urlToPublishTo = urlToPublishTo;
  }


  /**
   * userIds.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration userIds(String userIds) {
    this.userIds = userIds;
    return this;
  }

  /**
   * A comma separated list of userIds. This sets the users associated with the tracked envelope and recipient events. When one of the event occurs for a set user, the information is sent through Connect.   ###### Note: If allUsers is set to ï¿½falseï¿½ then you must provide a list of user idï¿½s..
   * @return userIds
   **/
  @ApiModelProperty(value = "A comma separated list of userIds. This sets the users associated with the tracked envelope and recipient events. When one of the event occurs for a set user, the information is sent through Connect.   ###### Note: If allUsers is set to ï¿½falseï¿½ then you must provide a list of user idï¿½s.")
  public String getUserIds() {
    return userIds;
  }

  /**
   * setUserIds.
   **/
  public void setUserIds(String userIds) {
    this.userIds = userIds;
  }


  /**
   * useSoapInterface.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration useSoapInterface(String useSoapInterface) {
    this.useSoapInterface = useSoapInterface;
    return this;
  }

  /**
   * When set to **true**, indicates that the `urlToPublishTo` property contains a SOAP endpoint..
   * @return useSoapInterface
   **/
  @ApiModelProperty(value = "When set to **true**, indicates that the `urlToPublishTo` property contains a SOAP endpoint.")
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
    ConnectCustomConfiguration connectCustomConfiguration = (ConnectCustomConfiguration) o;
    return Objects.equals(this.allowEnvelopePublish, connectCustomConfiguration.allowEnvelopePublish) &&
        Objects.equals(this.allUsers, connectCustomConfiguration.allUsers) &&
        Objects.equals(this.configurationType, connectCustomConfiguration.configurationType) &&
        Objects.equals(this.connectId, connectCustomConfiguration.connectId) &&
        Objects.equals(this.enableLog, connectCustomConfiguration.enableLog) &&
        Objects.equals(this.envelopeEvents, connectCustomConfiguration.envelopeEvents) &&
        Objects.equals(this.includeCertificateOfCompletion, connectCustomConfiguration.includeCertificateOfCompletion) &&
        Objects.equals(this.includeCertSoapHeader, connectCustomConfiguration.includeCertSoapHeader) &&
        Objects.equals(this.includeDocumentFields, connectCustomConfiguration.includeDocumentFields) &&
        Objects.equals(this.includeDocuments, connectCustomConfiguration.includeDocuments) &&
        Objects.equals(this.includeEnvelopeVoidReason, connectCustomConfiguration.includeEnvelopeVoidReason) &&
        Objects.equals(this.includeHMAC, connectCustomConfiguration.includeHMAC) &&
        Objects.equals(this.includeSenderAccountasCustomField, connectCustomConfiguration.includeSenderAccountasCustomField) &&
        Objects.equals(this.includeTimeZoneInformation, connectCustomConfiguration.includeTimeZoneInformation) &&
        Objects.equals(this.name, connectCustomConfiguration.name) &&
        Objects.equals(this.recipientEvents, connectCustomConfiguration.recipientEvents) &&
        Objects.equals(this.requiresAcknowledgement, connectCustomConfiguration.requiresAcknowledgement) &&
        Objects.equals(this.signMessageWithX509Certificate, connectCustomConfiguration.signMessageWithX509Certificate) &&
        Objects.equals(this.soapNamespace, connectCustomConfiguration.soapNamespace) &&
        Objects.equals(this.urlToPublishTo, connectCustomConfiguration.urlToPublishTo) &&
        Objects.equals(this.userIds, connectCustomConfiguration.userIds) &&
        Objects.equals(this.useSoapInterface, connectCustomConfiguration.useSoapInterface);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(allowEnvelopePublish, allUsers, configurationType, connectId, enableLog, envelopeEvents, includeCertificateOfCompletion, includeCertSoapHeader, includeDocumentFields, includeDocuments, includeEnvelopeVoidReason, includeHMAC, includeSenderAccountasCustomField, includeTimeZoneInformation, name, recipientEvents, requiresAcknowledgement, signMessageWithX509Certificate, soapNamespace, urlToPublishTo, userIds, useSoapInterface);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectCustomConfiguration {\n");
    
    sb.append("    allowEnvelopePublish: ").append(toIndentedString(allowEnvelopePublish)).append("\n");
    sb.append("    allUsers: ").append(toIndentedString(allUsers)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
    sb.append("    enableLog: ").append(toIndentedString(enableLog)).append("\n");
    sb.append("    envelopeEvents: ").append(toIndentedString(envelopeEvents)).append("\n");
    sb.append("    includeCertificateOfCompletion: ").append(toIndentedString(includeCertificateOfCompletion)).append("\n");
    sb.append("    includeCertSoapHeader: ").append(toIndentedString(includeCertSoapHeader)).append("\n");
    sb.append("    includeDocumentFields: ").append(toIndentedString(includeDocumentFields)).append("\n");
    sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
    sb.append("    includeEnvelopeVoidReason: ").append(toIndentedString(includeEnvelopeVoidReason)).append("\n");
    sb.append("    includeHMAC: ").append(toIndentedString(includeHMAC)).append("\n");
    sb.append("    includeSenderAccountasCustomField: ").append(toIndentedString(includeSenderAccountasCustomField)).append("\n");
    sb.append("    includeTimeZoneInformation: ").append(toIndentedString(includeTimeZoneInformation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipientEvents: ").append(toIndentedString(recipientEvents)).append("\n");
    sb.append("    requiresAcknowledgement: ").append(toIndentedString(requiresAcknowledgement)).append("\n");
    sb.append("    signMessageWithX509Certificate: ").append(toIndentedString(signMessageWithX509Certificate)).append("\n");
    sb.append("    soapNamespace: ").append(toIndentedString(soapNamespace)).append("\n");
    sb.append("    urlToPublishTo: ").append(toIndentedString(urlToPublishTo)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

