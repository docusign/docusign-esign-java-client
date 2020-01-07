package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ConnectSalesforceObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectCustomConfiguration
 */

public class ConnectCustomConfiguration {
  @JsonProperty("allowEnvelopePublish")
  private String allowEnvelopePublish = null;

  @JsonProperty("allowSalesforcePublish")
  private String allowSalesforcePublish = null;

  @JsonProperty("allUsers")
  private String allUsers = null;

  @JsonProperty("configurationType")
  private String configurationType = null;

  @JsonProperty("connectId")
  private String connectId = null;

  @JsonProperty("enableLog")
  private String enableLog = null;

  @JsonProperty("envelopeEvents")
  private java.util.List<String> envelopeEvents = new java.util.ArrayList<String>();

  @JsonProperty("externalFolderId")
  private String externalFolderId = null;

  @JsonProperty("externalFolderLabel")
  private String externalFolderLabel = null;

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

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("recipientEvents")
  private java.util.List<String> recipientEvents = new java.util.ArrayList<String>();

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
  private java.util.List<String> senderSelectableItems = new java.util.ArrayList<String>();

  @JsonProperty("sfObjects")
  private java.util.List<ConnectSalesforceObject> sfObjects = new java.util.ArrayList<ConnectSalesforceObject>();

  @JsonProperty("signMessageWithX509Certificate")
  private String signMessageWithX509Certificate = null;

  @JsonProperty("soapNamespace")
  private String soapNamespace = null;

  @JsonProperty("urlToPublishTo")
  private String urlToPublishTo = null;

  @JsonProperty("userIds")
  private java.util.List<String> userIds = new java.util.ArrayList<String>();

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("useSoapInterface")
  private String useSoapInterface = null;

  public ConnectCustomConfiguration allowEnvelopePublish(String allowEnvelopePublish) {
    this.allowEnvelopePublish = allowEnvelopePublish;
    return this;
  }

   /**
   * When set to **true**, data is sent to the urlToPublishTo web address. This option can be set to false to stop sending data while maintaining the Connect configuration information.
   * @return allowEnvelopePublish
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, data is sent to the urlToPublishTo web address. This option can be set to false to stop sending data while maintaining the Connect configuration information.")
  public String getAllowEnvelopePublish() {
    return allowEnvelopePublish;
  }

  public void setAllowEnvelopePublish(String allowEnvelopePublish) {
    this.allowEnvelopePublish = allowEnvelopePublish;
  }

  public ConnectCustomConfiguration allowSalesforcePublish(String allowSalesforcePublish) {
    this.allowSalesforcePublish = allowSalesforcePublish;
    return this;
  }

   /**
   * 
   * @return allowSalesforcePublish
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowSalesforcePublish() {
    return allowSalesforcePublish;
  }

  public void setAllowSalesforcePublish(String allowSalesforcePublish) {
    this.allowSalesforcePublish = allowSalesforcePublish;
  }

  public ConnectCustomConfiguration allUsers(String allUsers) {
    this.allUsers = allUsers;
    return this;
  }

   /**
   * When set to **true**, the tracked envelope and recipient events for all users, including users that are added a later time, are sent through Connect.
   * @return allUsers
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the tracked envelope and recipient events for all users, including users that are added a later time, are sent through Connect.")
  public String getAllUsers() {
    return allUsers;
  }

  public void setAllUsers(String allUsers) {
    this.allUsers = allUsers;
  }

  public ConnectCustomConfiguration configurationType(String configurationType) {
    this.configurationType = configurationType;
    return this;
  }

   /**
   * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.
   * @return configurationType
  **/
  @ApiModelProperty(example = "null", value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
  public String getConfigurationType() {
    return configurationType;
  }

  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }

  public ConnectCustomConfiguration connectId(String connectId) {
    this.connectId = connectId;
    return this;
  }

   /**
   *  Specifies the DocuSign generated ID for the Connect configuration.  
   * @return connectId
  **/
  @ApiModelProperty(example = "null", value = " Specifies the DocuSign generated ID for the Connect configuration.  ")
  public String getConnectId() {
    return connectId;
  }

  public void setConnectId(String connectId) {
    this.connectId = connectId;
  }

  public ConnectCustomConfiguration enableLog(String enableLog) {
    this.enableLog = enableLog;
    return this;
  }

   /**
   * This turns Connect logging on or off. When set to **true**, logging is turned on.
   * @return enableLog
  **/
  @ApiModelProperty(example = "null", value = "This turns Connect logging on or off. When set to **true**, logging is turned on.")
  public String getEnableLog() {
    return enableLog;
  }

  public void setEnableLog(String enableLog) {
    this.enableLog = enableLog;
  }

  public ConnectCustomConfiguration envelopeEvents(java.util.List<String> envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
    return this;
  }

  public ConnectCustomConfiguration addEnvelopeEventsItem(String envelopeEventsItem) {
    this.envelopeEvents.add(envelopeEventsItem);
    return this;
  }

   /**
   * A comma separated list of Ã¯Â¿Â½EnvelopeÃ¯Â¿Â½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, and Voided.
   * @return envelopeEvents
  **/
  @ApiModelProperty(example = "null", value = "A comma separated list of Ã¯Â¿Â½EnvelopeÃ¯Â¿Â½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, and Voided.")
  public java.util.List<String> getEnvelopeEvents() {
    return envelopeEvents;
  }

  public void setEnvelopeEvents(java.util.List<String> envelopeEvents) {
    this.envelopeEvents = envelopeEvents;
  }

  public ConnectCustomConfiguration externalFolderId(String externalFolderId) {
    this.externalFolderId = externalFolderId;
    return this;
  }

   /**
   * 
   * @return externalFolderId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExternalFolderId() {
    return externalFolderId;
  }

  public void setExternalFolderId(String externalFolderId) {
    this.externalFolderId = externalFolderId;
  }

  public ConnectCustomConfiguration externalFolderLabel(String externalFolderLabel) {
    this.externalFolderLabel = externalFolderLabel;
    return this;
  }

   /**
   * 
   * @return externalFolderLabel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExternalFolderLabel() {
    return externalFolderLabel;
  }

  public void setExternalFolderLabel(String externalFolderLabel) {
    this.externalFolderLabel = externalFolderLabel;
  }

  public ConnectCustomConfiguration includeCertificateOfCompletion(String includeCertificateOfCompletion) {
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

  public ConnectCustomConfiguration includeCertSoapHeader(String includeCertSoapHeader) {
    this.includeCertSoapHeader = includeCertSoapHeader;
    return this;
  }

   /**
   * 
   * @return includeCertSoapHeader
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIncludeCertSoapHeader() {
    return includeCertSoapHeader;
  }

  public void setIncludeCertSoapHeader(String includeCertSoapHeader) {
    this.includeCertSoapHeader = includeCertSoapHeader;
  }

  public ConnectCustomConfiguration includeDocumentFields(String includeDocumentFields) {
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

  public ConnectCustomConfiguration includeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
    return this;
  }

   /**
   * When set to **true**, Connect will send the PDF document along with the update XML.
   * @return includeDocuments
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, Connect will send the PDF document along with the update XML.")
  public String getIncludeDocuments() {
    return includeDocuments;
  }

  public void setIncludeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
  }

  public ConnectCustomConfiguration includeEnvelopeVoidReason(String includeEnvelopeVoidReason) {
    this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
    return this;
  }

   /**
   * When set to **true**, Connect will include the voidedReason for voided envelopes.
   * @return includeEnvelopeVoidReason
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, Connect will include the voidedReason for voided envelopes.")
  public String getIncludeEnvelopeVoidReason() {
    return includeEnvelopeVoidReason;
  }

  public void setIncludeEnvelopeVoidReason(String includeEnvelopeVoidReason) {
    this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
  }

  public ConnectCustomConfiguration includeHMAC(String includeHMAC) {
    this.includeHMAC = includeHMAC;
    return this;
  }

   /**
   * 
   * @return includeHMAC
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIncludeHMAC() {
    return includeHMAC;
  }

  public void setIncludeHMAC(String includeHMAC) {
    this.includeHMAC = includeHMAC;
  }

  public ConnectCustomConfiguration includeSenderAccountasCustomField(String includeSenderAccountasCustomField) {
    this.includeSenderAccountasCustomField = includeSenderAccountasCustomField;
    return this;
  }

   /**
   * When set to **true**, Connect will include the sender account as Custom Field in the data.
   * @return includeSenderAccountasCustomField
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, Connect will include the sender account as Custom Field in the data.")
  public String getIncludeSenderAccountasCustomField() {
    return includeSenderAccountasCustomField;
  }

  public void setIncludeSenderAccountasCustomField(String includeSenderAccountasCustomField) {
    this.includeSenderAccountasCustomField = includeSenderAccountasCustomField;
  }

  public ConnectCustomConfiguration includeTimeZoneInformation(String includeTimeZoneInformation) {
    this.includeTimeZoneInformation = includeTimeZoneInformation;
    return this;
  }

   /**
   * When set to **true**, Connect will include the envelope time zone information.
   * @return includeTimeZoneInformation
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, Connect will include the envelope time zone information.")
  public String getIncludeTimeZoneInformation() {
    return includeTimeZoneInformation;
  }

  public void setIncludeTimeZoneInformation(String includeTimeZoneInformation) {
    this.includeTimeZoneInformation = includeTimeZoneInformation;
  }

  public ConnectCustomConfiguration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Connect configuration. The name helps identify the configuration in the list.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the Connect configuration. The name helps identify the configuration in the list.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConnectCustomConfiguration password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ConnectCustomConfiguration recipientEvents(java.util.List<String> recipientEvents) {
    this.recipientEvents = recipientEvents;
    return this;
  }

  public ConnectCustomConfiguration addRecipientEventsItem(String recipientEventsItem) {
    this.recipientEvents.add(recipientEventsItem);
    return this;
  }

   /**
   * A comma separated list of Ã¯Â¿Â½RecipientÃ¯Â¿Â½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.
   * @return recipientEvents
  **/
  @ApiModelProperty(example = "null", value = "A comma separated list of Ã¯Â¿Â½RecipientÃ¯Â¿Â½ related events that are tracked through Connect. The possible event values are: Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.")
  public java.util.List<String> getRecipientEvents() {
    return recipientEvents;
  }

  public void setRecipientEvents(java.util.List<String> recipientEvents) {
    this.recipientEvents = recipientEvents;
  }

  public ConnectCustomConfiguration requireMutualTls(String requireMutualTls) {
    this.requireMutualTls = requireMutualTls;
    return this;
  }

   /**
   * 
   * @return requireMutualTls
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRequireMutualTls() {
    return requireMutualTls;
  }

  public void setRequireMutualTls(String requireMutualTls) {
    this.requireMutualTls = requireMutualTls;
  }

  public ConnectCustomConfiguration requiresAcknowledgement(String requiresAcknowledgement) {
    this.requiresAcknowledgement = requiresAcknowledgement;
    return this;
  }

   /**
   * When set to **true**, and a publication message fails to be acknowledged, the message goes back into the queue and the system will retry delivery after a successful acknowledgement is received. If the delivery fails a second time, the message is not returned to the queue for sending until Connect receives a successful acknowledgement and it has been at least 24 hours since the previous retry. There is a maximum of ten retries Alternately, you can use Republish Connect Information to manually republish the envelope information.
   * @return requiresAcknowledgement
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, and a publication message fails to be acknowledged, the message goes back into the queue and the system will retry delivery after a successful acknowledgement is received. If the delivery fails a second time, the message is not returned to the queue for sending until Connect receives a successful acknowledgement and it has been at least 24 hours since the previous retry. There is a maximum of ten retries Alternately, you can use Republish Connect Information to manually republish the envelope information.")
  public String getRequiresAcknowledgement() {
    return requiresAcknowledgement;
  }

  public void setRequiresAcknowledgement(String requiresAcknowledgement) {
    this.requiresAcknowledgement = requiresAcknowledgement;
  }

  public ConnectCustomConfiguration salesforceApiVersion(String salesforceApiVersion) {
    this.salesforceApiVersion = salesforceApiVersion;
    return this;
  }

   /**
   * 
   * @return salesforceApiVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSalesforceApiVersion() {
    return salesforceApiVersion;
  }

  public void setSalesforceApiVersion(String salesforceApiVersion) {
    this.salesforceApiVersion = salesforceApiVersion;
  }

  public ConnectCustomConfiguration salesforceAuthcode(String salesforceAuthcode) {
    this.salesforceAuthcode = salesforceAuthcode;
    return this;
  }

   /**
   * 
   * @return salesforceAuthcode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSalesforceAuthcode() {
    return salesforceAuthcode;
  }

  public void setSalesforceAuthcode(String salesforceAuthcode) {
    this.salesforceAuthcode = salesforceAuthcode;
  }

  public ConnectCustomConfiguration salesforceCallBackUrl(String salesforceCallBackUrl) {
    this.salesforceCallBackUrl = salesforceCallBackUrl;
    return this;
  }

   /**
   * 
   * @return salesforceCallBackUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSalesforceCallBackUrl() {
    return salesforceCallBackUrl;
  }

  public void setSalesforceCallBackUrl(String salesforceCallBackUrl) {
    this.salesforceCallBackUrl = salesforceCallBackUrl;
  }

  public ConnectCustomConfiguration salesforceDocumentsAsContentFiles(String salesforceDocumentsAsContentFiles) {
    this.salesforceDocumentsAsContentFiles = salesforceDocumentsAsContentFiles;
    return this;
  }

   /**
   * 
   * @return salesforceDocumentsAsContentFiles
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSalesforceDocumentsAsContentFiles() {
    return salesforceDocumentsAsContentFiles;
  }

  public void setSalesforceDocumentsAsContentFiles(String salesforceDocumentsAsContentFiles) {
    this.salesforceDocumentsAsContentFiles = salesforceDocumentsAsContentFiles;
  }

  public ConnectCustomConfiguration senderOverride(String senderOverride) {
    this.senderOverride = senderOverride;
    return this;
  }

   /**
   * 
   * @return senderOverride
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSenderOverride() {
    return senderOverride;
  }

  public void setSenderOverride(String senderOverride) {
    this.senderOverride = senderOverride;
  }

  public ConnectCustomConfiguration senderSelectableItems(java.util.List<String> senderSelectableItems) {
    this.senderSelectableItems = senderSelectableItems;
    return this;
  }

  public ConnectCustomConfiguration addSenderSelectableItemsItem(String senderSelectableItemsItem) {
    this.senderSelectableItems.add(senderSelectableItemsItem);
    return this;
  }

   /**
   * 
   * @return senderSelectableItems
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getSenderSelectableItems() {
    return senderSelectableItems;
  }

  public void setSenderSelectableItems(java.util.List<String> senderSelectableItems) {
    this.senderSelectableItems = senderSelectableItems;
  }

  public ConnectCustomConfiguration sfObjects(java.util.List<ConnectSalesforceObject> sfObjects) {
    this.sfObjects = sfObjects;
    return this;
  }

  public ConnectCustomConfiguration addSfObjectsItem(ConnectSalesforceObject sfObjectsItem) {
    this.sfObjects.add(sfObjectsItem);
    return this;
  }

   /**
   * 
   * @return sfObjects
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<ConnectSalesforceObject> getSfObjects() {
    return sfObjects;
  }

  public void setSfObjects(java.util.List<ConnectSalesforceObject> sfObjects) {
    this.sfObjects = sfObjects;
  }

  public ConnectCustomConfiguration signMessageWithX509Certificate(String signMessageWithX509Certificate) {
    this.signMessageWithX509Certificate = signMessageWithX509Certificate;
    return this;
  }

   /**
   * When set to **true**, Connect messages are signed with an X509 certificate. This provides support for 2-way SSL.
   * @return signMessageWithX509Certificate
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, Connect messages are signed with an X509 certificate. This provides support for 2-way SSL.")
  public String getSignMessageWithX509Certificate() {
    return signMessageWithX509Certificate;
  }

  public void setSignMessageWithX509Certificate(String signMessageWithX509Certificate) {
    this.signMessageWithX509Certificate = signMessageWithX509Certificate;
  }

  public ConnectCustomConfiguration soapNamespace(String soapNamespace) {
    this.soapNamespace = soapNamespace;
    return this;
  }

   /**
   * The namespace of the SOAP interface.  The namespace value must be set if useSoapInterface is set to true.
   * @return soapNamespace
  **/
  @ApiModelProperty(example = "null", value = "The namespace of the SOAP interface.  The namespace value must be set if useSoapInterface is set to true.")
  public String getSoapNamespace() {
    return soapNamespace;
  }

  public void setSoapNamespace(String soapNamespace) {
    this.soapNamespace = soapNamespace;
  }

  public ConnectCustomConfiguration urlToPublishTo(String urlToPublishTo) {
    this.urlToPublishTo = urlToPublishTo;
    return this;
  }

   /**
   * This is the web address and name of your listener or Retrieving Service endpoint. You need to include HTTPS:// in the web address.
   * @return urlToPublishTo
  **/
  @ApiModelProperty(example = "null", value = "This is the web address and name of your listener or Retrieving Service endpoint. You need to include HTTPS:// in the web address.")
  public String getUrlToPublishTo() {
    return urlToPublishTo;
  }

  public void setUrlToPublishTo(String urlToPublishTo) {
    this.urlToPublishTo = urlToPublishTo;
  }

  public ConnectCustomConfiguration userIds(java.util.List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public ConnectCustomConfiguration addUserIdsItem(String userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * A comma separated list of userIds. This sets the users associated with the tracked envelope and recipient events. When one of the event occurs for a set user, the information is sent through Connect.   ###### Note: If allUsers is set to Ã¯Â¿Â½falseÃ¯Â¿Â½ then you must provide a list of user idÃ¯Â¿Â½s.
   * @return userIds
  **/
  @ApiModelProperty(example = "null", value = "A comma separated list of userIds. This sets the users associated with the tracked envelope and recipient events. When one of the event occurs for a set user, the information is sent through Connect.   ###### Note: If allUsers is set to Ã¯Â¿Â½falseÃ¯Â¿Â½ then you must provide a list of user idÃ¯Â¿Â½s.")
  public java.util.List<String> getUserIds() {
    return userIds;
  }

  public void setUserIds(java.util.List<String> userIds) {
    this.userIds = userIds;
  }

  public ConnectCustomConfiguration userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ConnectCustomConfiguration useSoapInterface(String useSoapInterface) {
    this.useSoapInterface = useSoapInterface;
    return this;
  }

   /**
   * When set to **true**, indicates that the `urlToPublishTo` property contains a SOAP endpoint.
   * @return useSoapInterface
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, indicates that the `urlToPublishTo` property contains a SOAP endpoint.")
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
    return Objects.equals(this.allowEnvelopePublish, connectCustomConfiguration.allowEnvelopePublish) &&
        Objects.equals(this.allowSalesforcePublish, connectCustomConfiguration.allowSalesforcePublish) &&
        Objects.equals(this.allUsers, connectCustomConfiguration.allUsers) &&
        Objects.equals(this.configurationType, connectCustomConfiguration.configurationType) &&
        Objects.equals(this.connectId, connectCustomConfiguration.connectId) &&
        Objects.equals(this.enableLog, connectCustomConfiguration.enableLog) &&
        Objects.equals(this.envelopeEvents, connectCustomConfiguration.envelopeEvents) &&
        Objects.equals(this.externalFolderId, connectCustomConfiguration.externalFolderId) &&
        Objects.equals(this.externalFolderLabel, connectCustomConfiguration.externalFolderLabel) &&
        Objects.equals(this.includeCertificateOfCompletion, connectCustomConfiguration.includeCertificateOfCompletion) &&
        Objects.equals(this.includeCertSoapHeader, connectCustomConfiguration.includeCertSoapHeader) &&
        Objects.equals(this.includeDocumentFields, connectCustomConfiguration.includeDocumentFields) &&
        Objects.equals(this.includeDocuments, connectCustomConfiguration.includeDocuments) &&
        Objects.equals(this.includeEnvelopeVoidReason, connectCustomConfiguration.includeEnvelopeVoidReason) &&
        Objects.equals(this.includeHMAC, connectCustomConfiguration.includeHMAC) &&
        Objects.equals(this.includeSenderAccountasCustomField, connectCustomConfiguration.includeSenderAccountasCustomField) &&
        Objects.equals(this.includeTimeZoneInformation, connectCustomConfiguration.includeTimeZoneInformation) &&
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

  @Override
  public int hashCode() {
    return Objects.hash(allowEnvelopePublish, allowSalesforcePublish, allUsers, configurationType, connectId, enableLog, envelopeEvents, externalFolderId, externalFolderLabel, includeCertificateOfCompletion, includeCertSoapHeader, includeDocumentFields, includeDocuments, includeEnvelopeVoidReason, includeHMAC, includeSenderAccountasCustomField, includeTimeZoneInformation, name, password, recipientEvents, requireMutualTls, requiresAcknowledgement, salesforceApiVersion, salesforceAuthcode, salesforceCallBackUrl, salesforceDocumentsAsContentFiles, senderOverride, senderSelectableItems, sfObjects, signMessageWithX509Certificate, soapNamespace, urlToPublishTo, userIds, userName, useSoapInterface);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectCustomConfiguration {\n");
    
    sb.append("    allowEnvelopePublish: ").append(toIndentedString(allowEnvelopePublish)).append("\n");
    sb.append("    allowSalesforcePublish: ").append(toIndentedString(allowSalesforcePublish)).append("\n");
    sb.append("    allUsers: ").append(toIndentedString(allUsers)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
    sb.append("    enableLog: ").append(toIndentedString(enableLog)).append("\n");
    sb.append("    envelopeEvents: ").append(toIndentedString(envelopeEvents)).append("\n");
    sb.append("    externalFolderId: ").append(toIndentedString(externalFolderId)).append("\n");
    sb.append("    externalFolderLabel: ").append(toIndentedString(externalFolderLabel)).append("\n");
    sb.append("    includeCertificateOfCompletion: ").append(toIndentedString(includeCertificateOfCompletion)).append("\n");
    sb.append("    includeCertSoapHeader: ").append(toIndentedString(includeCertSoapHeader)).append("\n");
    sb.append("    includeDocumentFields: ").append(toIndentedString(includeDocumentFields)).append("\n");
    sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
    sb.append("    includeEnvelopeVoidReason: ").append(toIndentedString(includeEnvelopeVoidReason)).append("\n");
    sb.append("    includeHMAC: ").append(toIndentedString(includeHMAC)).append("\n");
    sb.append("    includeSenderAccountasCustomField: ").append(toIndentedString(includeSenderAccountasCustomField)).append("\n");
    sb.append("    includeTimeZoneInformation: ").append(toIndentedString(includeTimeZoneInformation)).append("\n");
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

