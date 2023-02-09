package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectEventData;
import com.docusign.esign.model.ConnectSalesforceObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The &#x60;connectCustomConfiguration&#x60; object describes how Connect is configured for your account..
 *
 */
@ApiModel(description = "The `connectCustomConfiguration` object describes how Connect is configured for your account.")

public class ConnectCustomConfiguration {
  @JsonProperty("allowEnvelopePublish")
  private String allowEnvelopePublish = null;

  @JsonProperty("allowSalesforcePublish")
  private String allowSalesforcePublish = null;

  @JsonProperty("allUsers")
  private String allUsers = null;

  @JsonProperty("allUsersExcept")
  private String allUsersExcept = null;

  @JsonProperty("configurationType")
  private String configurationType = null;

  @JsonProperty("connectId")
  private String connectId = null;

  @JsonProperty("deliveryMode")
  private String deliveryMode = null;

  @JsonProperty("disabledBy")
  private String disabledBy = null;

  @JsonProperty("enableLog")
  private String enableLog = null;

  @JsonProperty("envelopeEvents")
  private java.util.List<String> envelopeEvents = null;

  @JsonProperty("eventData")
  private ConnectEventData eventData = null;

  @JsonProperty("events")
  private java.util.List<String> events = null;

  @JsonProperty("externalFolderId")
  private String externalFolderId = null;

  @JsonProperty("externalFolderLabel")
  private String externalFolderLabel = null;

  @JsonProperty("groupIds")
  private java.util.List<String> groupIds = null;

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

  @JsonProperty("includeOAuth")
  private String includeOAuth = null;

  @JsonProperty("includeSenderAccountasCustomField")
  private String includeSenderAccountasCustomField = null;

  @JsonProperty("includeTimeZoneInformation")
  private String includeTimeZoneInformation = null;

  @JsonProperty("integratorManaged")
  private String integratorManaged = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("recipientEvents")
  private java.util.List<String> recipientEvents = null;

  @JsonProperty("requireMutualTls")
  private String requireMutualTls = null;

  @JsonProperty("requiresAcknowledgement")
  private String requiresAcknowledgement = null;

  @JsonProperty("salesforceApiVersion")
  private String salesforceApiVersion = null;

  @JsonProperty("salesforceAuthcode")
  private String salesforceAuthcode = null;

  @JsonProperty("salesforceCallBackUrl")
  private String salesforceCallBackUrl = null;

  @JsonProperty("salesforceDocumentsAsContentFiles")
  private String salesforceDocumentsAsContentFiles = null;

  @JsonProperty("senderOverride")
  private String senderOverride = null;

  @JsonProperty("senderSelectableItems")
  private java.util.List<String> senderSelectableItems = null;

  @JsonProperty("sfObjects")
  private java.util.List<ConnectSalesforceObject> sfObjects = null;

  @JsonProperty("signMessageWithX509Certificate")
  private String signMessageWithX509Certificate = null;

  @JsonProperty("soapNamespace")
  private String soapNamespace = null;

  @JsonProperty("urlToPublishTo")
  private String urlToPublishTo = null;

  @JsonProperty("userIds")
  private java.util.List<String> userIds = null;

  @JsonProperty("userName")
  private String userName = null;

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
   * allowSalesforcePublish.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration allowSalesforcePublish(String allowSalesforcePublish) {
    this.allowSalesforcePublish = allowSalesforcePublish;
    return this;
  }

  /**
   * .
   * @return allowSalesforcePublish
   **/
  @ApiModelProperty(value = "")
  public String getAllowSalesforcePublish() {
    return allowSalesforcePublish;
  }

  /**
   * setAllowSalesforcePublish.
   **/
  public void setAllowSalesforcePublish(String allowSalesforcePublish) {
    this.allowSalesforcePublish = allowSalesforcePublish;
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
   * allUsersExcept.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration allUsersExcept(String allUsersExcept) {
    this.allUsersExcept = allUsersExcept;
    return this;
  }

  /**
   * .
   * @return allUsersExcept
   **/
  @ApiModelProperty(value = "")
  public String getAllUsersExcept() {
    return allUsersExcept;
  }

  /**
   * setAllUsersExcept.
   **/
  public void setAllUsersExcept(String allUsersExcept) {
    this.allUsersExcept = allUsersExcept;
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
   * deliveryMode.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration deliveryMode(String deliveryMode) {
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
   * disabledBy.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration disabledBy(String disabledBy) {
    this.disabledBy = disabledBy;
    return this;
  }

  /**
   * .
   * @return disabledBy
   **/
  @ApiModelProperty(value = "")
  public String getDisabledBy() {
    return disabledBy;
  }

  /**
   * setDisabledBy.
   **/
  public void setDisabledBy(String disabledBy) {
    this.disabledBy = disabledBy;
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
  public ConnectCustomConfiguration envelopeEvents(java.util.List<String> envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
    return this;
  }
  
  /**
   * addEnvelopeEventsItem.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration addEnvelopeEventsItem(String envelopeEventsItem) {
    if (this.envelopeEvents == null) {
      this.envelopeEvents = new java.util.ArrayList<>();
    }
    this.envelopeEvents.add(envelopeEventsItem);
    return this;
  }

  /**
   * A comma separated list of ï¿½Envelopeï¿½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, and Voided..
   * @return envelopeEvents
   **/
  @ApiModelProperty(value = "A comma separated list of ï¿½Envelopeï¿½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, and Voided.")
  public java.util.List<String> getEnvelopeEvents() {
    return envelopeEvents;
  }

  /**
   * setEnvelopeEvents.
   **/
  public void setEnvelopeEvents(java.util.List<String> envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
  }


  /**
   * eventData.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration eventData(ConnectEventData eventData) {
    this.eventData = eventData;
    return this;
  }

  /**
   * Allows you to specify the format of the information the Connect webhooks returns. For more information, see [Connect webhooks with JSON notifications](https://www.docusign.com/blog/developers/connect-webhooks-json-notifications).
   * @return eventData
   **/
  @ApiModelProperty(value = "Allows you to specify the format of the information the Connect webhooks returns. For more information, see [Connect webhooks with JSON notifications](https://www.docusign.com/blog/developers/connect-webhooks-json-notifications)")
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
   * events.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration events(java.util.List<String> events) {
    this.events = events;
    return this;
  }
  
  /**
   * addEventsItem.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new java.util.ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * .
   * @return events
   **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getEvents() {
    return events;
  }

  /**
   * setEvents.
   **/
  public void setEvents(java.util.List<String> events) {
    this.events = events;
  }


  /**
   * externalFolderId.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration externalFolderId(String externalFolderId) {
    this.externalFolderId = externalFolderId;
    return this;
  }

  /**
   * .
   * @return externalFolderId
   **/
  @ApiModelProperty(value = "")
  public String getExternalFolderId() {
    return externalFolderId;
  }

  /**
   * setExternalFolderId.
   **/
  public void setExternalFolderId(String externalFolderId) {
    this.externalFolderId = externalFolderId;
  }


  /**
   * externalFolderLabel.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration externalFolderLabel(String externalFolderLabel) {
    this.externalFolderLabel = externalFolderLabel;
    return this;
  }

  /**
   * .
   * @return externalFolderLabel
   **/
  @ApiModelProperty(value = "")
  public String getExternalFolderLabel() {
    return externalFolderLabel;
  }

  /**
   * setExternalFolderLabel.
   **/
  public void setExternalFolderLabel(String externalFolderLabel) {
    this.externalFolderLabel = externalFolderLabel;
  }


  /**
   * groupIds.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration groupIds(java.util.List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }
  
  /**
   * addGroupIdsItem.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new java.util.ArrayList<>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

  /**
   * .
   * @return groupIds
   **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getGroupIds() {
    return groupIds;
  }

  /**
   * setGroupIds.
   **/
  public void setGroupIds(java.util.List<String> groupIds) {
    this.groupIds = groupIds;
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
   * includeOAuth.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration includeOAuth(String includeOAuth) {
    this.includeOAuth = includeOAuth;
    return this;
  }

  /**
   * .
   * @return includeOAuth
   **/
  @ApiModelProperty(value = "")
  public String getIncludeOAuth() {
    return includeOAuth;
  }

  /**
   * setIncludeOAuth.
   **/
  public void setIncludeOAuth(String includeOAuth) {
    this.includeOAuth = includeOAuth;
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
   * integratorManaged.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration integratorManaged(String integratorManaged) {
    this.integratorManaged = integratorManaged;
    return this;
  }

  /**
   * .
   * @return integratorManaged
   **/
  @ApiModelProperty(value = "")
  public String getIntegratorManaged() {
    return integratorManaged;
  }

  /**
   * setIntegratorManaged.
   **/
  public void setIntegratorManaged(String integratorManaged) {
    this.integratorManaged = integratorManaged;
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
   * password.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration password(String password) {
    this.password = password;
    return this;
  }

  /**
   * .
   * @return password
   **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  /**
   * setPassword.
   **/
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * recipientEvents.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration recipientEvents(java.util.List<String> recipientEvents) {
    this.recipientEvents = recipientEvents;
    return this;
  }
  
  /**
   * addRecipientEventsItem.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration addRecipientEventsItem(String recipientEventsItem) {
    if (this.recipientEvents == null) {
      this.recipientEvents = new java.util.ArrayList<>();
    }
    this.recipientEvents.add(recipientEventsItem);
    return this;
  }

  /**
   * A comma separated list of ï¿½Recipientï¿½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded..
   * @return recipientEvents
   **/
  @ApiModelProperty(value = "A comma separated list of ï¿½Recipientï¿½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.")
  public java.util.List<String> getRecipientEvents() {
    return recipientEvents;
  }

  /**
   * setRecipientEvents.
   **/
  public void setRecipientEvents(java.util.List<String> recipientEvents) {
    this.recipientEvents = recipientEvents;
  }


  /**
   * requireMutualTls.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration requireMutualTls(String requireMutualTls) {
    this.requireMutualTls = requireMutualTls;
    return this;
  }

  /**
   * .
   * @return requireMutualTls
   **/
  @ApiModelProperty(value = "")
  public String getRequireMutualTls() {
    return requireMutualTls;
  }

  /**
   * setRequireMutualTls.
   **/
  public void setRequireMutualTls(String requireMutualTls) {
    this.requireMutualTls = requireMutualTls;
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
   * salesforceApiVersion.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration salesforceApiVersion(String salesforceApiVersion) {
    this.salesforceApiVersion = salesforceApiVersion;
    return this;
  }

  /**
   * .
   * @return salesforceApiVersion
   **/
  @ApiModelProperty(value = "")
  public String getSalesforceApiVersion() {
    return salesforceApiVersion;
  }

  /**
   * setSalesforceApiVersion.
   **/
  public void setSalesforceApiVersion(String salesforceApiVersion) {
    this.salesforceApiVersion = salesforceApiVersion;
  }


  /**
   * salesforceAuthcode.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration salesforceAuthcode(String salesforceAuthcode) {
    this.salesforceAuthcode = salesforceAuthcode;
    return this;
  }

  /**
   * .
   * @return salesforceAuthcode
   **/
  @ApiModelProperty(value = "")
  public String getSalesforceAuthcode() {
    return salesforceAuthcode;
  }

  /**
   * setSalesforceAuthcode.
   **/
  public void setSalesforceAuthcode(String salesforceAuthcode) {
    this.salesforceAuthcode = salesforceAuthcode;
  }


  /**
   * salesforceCallBackUrl.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration salesforceCallBackUrl(String salesforceCallBackUrl) {
    this.salesforceCallBackUrl = salesforceCallBackUrl;
    return this;
  }

  /**
   * .
   * @return salesforceCallBackUrl
   **/
  @ApiModelProperty(value = "")
  public String getSalesforceCallBackUrl() {
    return salesforceCallBackUrl;
  }

  /**
   * setSalesforceCallBackUrl.
   **/
  public void setSalesforceCallBackUrl(String salesforceCallBackUrl) {
    this.salesforceCallBackUrl = salesforceCallBackUrl;
  }


  /**
   * salesforceDocumentsAsContentFiles.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration salesforceDocumentsAsContentFiles(String salesforceDocumentsAsContentFiles) {
    this.salesforceDocumentsAsContentFiles = salesforceDocumentsAsContentFiles;
    return this;
  }

  /**
   * .
   * @return salesforceDocumentsAsContentFiles
   **/
  @ApiModelProperty(value = "")
  public String getSalesforceDocumentsAsContentFiles() {
    return salesforceDocumentsAsContentFiles;
  }

  /**
   * setSalesforceDocumentsAsContentFiles.
   **/
  public void setSalesforceDocumentsAsContentFiles(String salesforceDocumentsAsContentFiles) {
    this.salesforceDocumentsAsContentFiles = salesforceDocumentsAsContentFiles;
  }


  /**
   * senderOverride.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration senderOverride(String senderOverride) {
    this.senderOverride = senderOverride;
    return this;
  }

  /**
   * .
   * @return senderOverride
   **/
  @ApiModelProperty(value = "")
  public String getSenderOverride() {
    return senderOverride;
  }

  /**
   * setSenderOverride.
   **/
  public void setSenderOverride(String senderOverride) {
    this.senderOverride = senderOverride;
  }


  /**
   * senderSelectableItems.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration senderSelectableItems(java.util.List<String> senderSelectableItems) {
    this.senderSelectableItems = senderSelectableItems;
    return this;
  }
  
  /**
   * addSenderSelectableItemsItem.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration addSenderSelectableItemsItem(String senderSelectableItemsItem) {
    if (this.senderSelectableItems == null) {
      this.senderSelectableItems = new java.util.ArrayList<>();
    }
    this.senderSelectableItems.add(senderSelectableItemsItem);
    return this;
  }

  /**
   * .
   * @return senderSelectableItems
   **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getSenderSelectableItems() {
    return senderSelectableItems;
  }

  /**
   * setSenderSelectableItems.
   **/
  public void setSenderSelectableItems(java.util.List<String> senderSelectableItems) {
    this.senderSelectableItems = senderSelectableItems;
  }


  /**
   * sfObjects.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration sfObjects(java.util.List<ConnectSalesforceObject> sfObjects) {
    this.sfObjects = sfObjects;
    return this;
  }
  
  /**
   * addSfObjectsItem.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration addSfObjectsItem(ConnectSalesforceObject sfObjectsItem) {
    if (this.sfObjects == null) {
      this.sfObjects = new java.util.ArrayList<>();
    }
    this.sfObjects.add(sfObjectsItem);
    return this;
  }

  /**
   * .
   * @return sfObjects
   **/
  @ApiModelProperty(value = "")
  public java.util.List<ConnectSalesforceObject> getSfObjects() {
    return sfObjects;
  }

  /**
   * setSfObjects.
   **/
  public void setSfObjects(java.util.List<ConnectSalesforceObject> sfObjects) {
    this.sfObjects = sfObjects;
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
  public ConnectCustomConfiguration userIds(java.util.List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  /**
   * addUserIdsItem.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new java.util.ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

  /**
   * A comma separated list of userIds. This sets the users associated with the tracked envelope and recipient events. When one of the event occurs for a set user, the information is sent through Connect.   ###### Note: If allUsers is set to ï¿½falseï¿½ then you must provide a list of user idï¿½s..
   * @return userIds
   **/
  @ApiModelProperty(value = "A comma separated list of userIds. This sets the users associated with the tracked envelope and recipient events. When one of the event occurs for a set user, the information is sent through Connect.   ###### Note: If allUsers is set to ï¿½falseï¿½ then you must provide a list of user idï¿½s.")
  public java.util.List<String> getUserIds() {
    return userIds;
  }

  /**
   * setUserIds.
   **/
  public void setUserIds(java.util.List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * userName.
   *
   * @return ConnectCustomConfiguration
   **/
  public ConnectCustomConfiguration userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * .
   * @return userName
   **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  /**
   * setUserName.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
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
        Objects.equals(this.allowSalesforcePublish, connectCustomConfiguration.allowSalesforcePublish) &&
        Objects.equals(this.allUsers, connectCustomConfiguration.allUsers) &&
        Objects.equals(this.allUsersExcept, connectCustomConfiguration.allUsersExcept) &&
        Objects.equals(this.configurationType, connectCustomConfiguration.configurationType) &&
        Objects.equals(this.connectId, connectCustomConfiguration.connectId) &&
        Objects.equals(this.deliveryMode, connectCustomConfiguration.deliveryMode) &&
        Objects.equals(this.disabledBy, connectCustomConfiguration.disabledBy) &&
        Objects.equals(this.enableLog, connectCustomConfiguration.enableLog) &&
        Objects.equals(this.envelopeEvents, connectCustomConfiguration.envelopeEvents) &&
        Objects.equals(this.eventData, connectCustomConfiguration.eventData) &&
        Objects.equals(this.events, connectCustomConfiguration.events) &&
        Objects.equals(this.externalFolderId, connectCustomConfiguration.externalFolderId) &&
        Objects.equals(this.externalFolderLabel, connectCustomConfiguration.externalFolderLabel) &&
        Objects.equals(this.groupIds, connectCustomConfiguration.groupIds) &&
        Objects.equals(this.includeCertificateOfCompletion, connectCustomConfiguration.includeCertificateOfCompletion) &&
        Objects.equals(this.includeCertSoapHeader, connectCustomConfiguration.includeCertSoapHeader) &&
        Objects.equals(this.includeDocumentFields, connectCustomConfiguration.includeDocumentFields) &&
        Objects.equals(this.includeDocuments, connectCustomConfiguration.includeDocuments) &&
        Objects.equals(this.includeEnvelopeVoidReason, connectCustomConfiguration.includeEnvelopeVoidReason) &&
        Objects.equals(this.includeHMAC, connectCustomConfiguration.includeHMAC) &&
        Objects.equals(this.includeOAuth, connectCustomConfiguration.includeOAuth) &&
        Objects.equals(this.includeSenderAccountasCustomField, connectCustomConfiguration.includeSenderAccountasCustomField) &&
        Objects.equals(this.includeTimeZoneInformation, connectCustomConfiguration.includeTimeZoneInformation) &&
        Objects.equals(this.integratorManaged, connectCustomConfiguration.integratorManaged) &&
        Objects.equals(this.name, connectCustomConfiguration.name) &&
        Objects.equals(this.password, connectCustomConfiguration.password) &&
        Objects.equals(this.recipientEvents, connectCustomConfiguration.recipientEvents) &&
        Objects.equals(this.requireMutualTls, connectCustomConfiguration.requireMutualTls) &&
        Objects.equals(this.requiresAcknowledgement, connectCustomConfiguration.requiresAcknowledgement) &&
        Objects.equals(this.salesforceApiVersion, connectCustomConfiguration.salesforceApiVersion) &&
        Objects.equals(this.salesforceAuthcode, connectCustomConfiguration.salesforceAuthcode) &&
        Objects.equals(this.salesforceCallBackUrl, connectCustomConfiguration.salesforceCallBackUrl) &&
        Objects.equals(this.salesforceDocumentsAsContentFiles, connectCustomConfiguration.salesforceDocumentsAsContentFiles) &&
        Objects.equals(this.senderOverride, connectCustomConfiguration.senderOverride) &&
        Objects.equals(this.senderSelectableItems, connectCustomConfiguration.senderSelectableItems) &&
        Objects.equals(this.sfObjects, connectCustomConfiguration.sfObjects) &&
        Objects.equals(this.signMessageWithX509Certificate, connectCustomConfiguration.signMessageWithX509Certificate) &&
        Objects.equals(this.soapNamespace, connectCustomConfiguration.soapNamespace) &&
        Objects.equals(this.urlToPublishTo, connectCustomConfiguration.urlToPublishTo) &&
        Objects.equals(this.userIds, connectCustomConfiguration.userIds) &&
        Objects.equals(this.userName, connectCustomConfiguration.userName) &&
        Objects.equals(this.useSoapInterface, connectCustomConfiguration.useSoapInterface);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(allowEnvelopePublish, allowSalesforcePublish, allUsers, allUsersExcept, configurationType, connectId, deliveryMode, disabledBy, enableLog, envelopeEvents, eventData, events, externalFolderId, externalFolderLabel, groupIds, includeCertificateOfCompletion, includeCertSoapHeader, includeDocumentFields, includeDocuments, includeEnvelopeVoidReason, includeHMAC, includeOAuth, includeSenderAccountasCustomField, includeTimeZoneInformation, integratorManaged, name, password, recipientEvents, requireMutualTls, requiresAcknowledgement, salesforceApiVersion, salesforceAuthcode, salesforceCallBackUrl, salesforceDocumentsAsContentFiles, senderOverride, senderSelectableItems, sfObjects, signMessageWithX509Certificate, soapNamespace, urlToPublishTo, userIds, userName, useSoapInterface);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectCustomConfiguration {\n");
    
    sb.append("    allowEnvelopePublish: ").append(toIndentedString(allowEnvelopePublish)).append("\n");
    sb.append("    allowSalesforcePublish: ").append(toIndentedString(allowSalesforcePublish)).append("\n");
    sb.append("    allUsers: ").append(toIndentedString(allUsers)).append("\n");
    sb.append("    allUsersExcept: ").append(toIndentedString(allUsersExcept)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    disabledBy: ").append(toIndentedString(disabledBy)).append("\n");
    sb.append("    enableLog: ").append(toIndentedString(enableLog)).append("\n");
    sb.append("    envelopeEvents: ").append(toIndentedString(envelopeEvents)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    externalFolderId: ").append(toIndentedString(externalFolderId)).append("\n");
    sb.append("    externalFolderLabel: ").append(toIndentedString(externalFolderLabel)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    includeCertificateOfCompletion: ").append(toIndentedString(includeCertificateOfCompletion)).append("\n");
    sb.append("    includeCertSoapHeader: ").append(toIndentedString(includeCertSoapHeader)).append("\n");
    sb.append("    includeDocumentFields: ").append(toIndentedString(includeDocumentFields)).append("\n");
    sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
    sb.append("    includeEnvelopeVoidReason: ").append(toIndentedString(includeEnvelopeVoidReason)).append("\n");
    sb.append("    includeHMAC: ").append(toIndentedString(includeHMAC)).append("\n");
    sb.append("    includeOAuth: ").append(toIndentedString(includeOAuth)).append("\n");
    sb.append("    includeSenderAccountasCustomField: ").append(toIndentedString(includeSenderAccountasCustomField)).append("\n");
    sb.append("    includeTimeZoneInformation: ").append(toIndentedString(includeTimeZoneInformation)).append("\n");
    sb.append("    integratorManaged: ").append(toIndentedString(integratorManaged)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    recipientEvents: ").append(toIndentedString(recipientEvents)).append("\n");
    sb.append("    requireMutualTls: ").append(toIndentedString(requireMutualTls)).append("\n");
    sb.append("    requiresAcknowledgement: ").append(toIndentedString(requiresAcknowledgement)).append("\n");
    sb.append("    salesforceApiVersion: ").append(toIndentedString(salesforceApiVersion)).append("\n");
    sb.append("    salesforceAuthcode: ").append(toIndentedString(salesforceAuthcode)).append("\n");
    sb.append("    salesforceCallBackUrl: ").append(toIndentedString(salesforceCallBackUrl)).append("\n");
    sb.append("    salesforceDocumentsAsContentFiles: ").append(toIndentedString(salesforceDocumentsAsContentFiles)).append("\n");
    sb.append("    senderOverride: ").append(toIndentedString(senderOverride)).append("\n");
    sb.append("    senderSelectableItems: ").append(toIndentedString(senderSelectableItems)).append("\n");
    sb.append("    sfObjects: ").append(toIndentedString(sfObjects)).append("\n");
    sb.append("    signMessageWithX509Certificate: ").append(toIndentedString(signMessageWithX509Certificate)).append("\n");
    sb.append("    soapNamespace: ").append(toIndentedString(soapNamespace)).append("\n");
    sb.append("    urlToPublishTo: ").append(toIndentedString(urlToPublishTo)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

