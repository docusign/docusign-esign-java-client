package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.EmailSettings;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.Notification;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EnvelopeTemplateResult   {
  
  private String allowMarkup = null;
  private String allowReassign = null;
  private String asynchronous = null;
  private String attachmentsUri = null;
  private String authoritativeCopy = null;
  private String autoNavigation = null;
  private String brandId = null;
  private String brandLock = null;
  private String certificateUri = null;
  private String completedDateTime = null;
  private String createdDateTime = null;
  private CustomFields customFields = null;
  private String customFieldsUri = null;
  private String declinedDateTime = null;
  private String deletedDateTime = null;
  private String deliveredDateTime = null;
  private String description = null;
  private java.util.List<Document> documents = new java.util.ArrayList<Document>();
  private String documentsCombinedUri = null;
  private String documentsUri = null;
  private String emailBlurb = null;
  private EmailSettings emailSettings = null;
  private String emailSubject = null;
  private String enableWetSign = null;
  private String enforceSignerVisibility = null;
  private String envelopeId = null;
  private String envelopeIdStamping = null;
  private String envelopeUri = null;
  private String folderId = null;
  private String folderName = null;
  private String folderUri = null;
  private String initialSentDateTime = null;
  private String is21CFRPart11 = null;
  private String isSignatureProviderEnvelope = null;
  private String lastModified = null;
  private String lastModifiedDateTime = null;
  private LockInformation lockInformation = null;
  private String messageLock = null;
  private String name = null;
  private Notification notification = null;
  private String notificationUri = null;
  private UserInfo owner = null;
  private Integer pageCount = null;
  private String parentFolderUri = null;
  private String password = null;
  private String purgeState = null;
  private Recipients recipients = null;
  private String recipientsLock = null;
  private String recipientsUri = null;
  private String sentDateTime = null;
  private String shared = null;
  private String signingLocation = null;
  private String status = null;
  private String statusChangedDateTime = null;
  private String templateId = null;
  private String templatesUri = null;
  private String transactionId = null;
  private String uri = null;
  private String useDisclosure = null;
  private String voidedDateTime = null;
  private String voidedReason = null;

  
  /**
   * When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this
   **/
  
  @ApiModelProperty(value = "When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this")
  @JsonProperty("allowMarkup")
  public String getAllowMarkup() {
    return allowMarkup;
  }
  public void setAllowMarkup(String allowMarkup) {
    this.allowMarkup = allowMarkup;
  }

  
  /**
   * When set to **true**, the recipient can redirect an envelope to a more appropriate recipient.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the recipient can redirect an envelope to a more appropriate recipient.")
  @JsonProperty("allowReassign")
  public String getAllowReassign() {
    return allowReassign;
  }
  public void setAllowReassign(String allowReassign) {
    this.allowReassign = allowReassign;
  }

  
  /**
   * When set to **true**, the envelope is queued for processing and the value of the `status` property is set to 'Processing'. Additionally, get status calls return 'Processing' until completed.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the envelope is queued for processing and the value of the `status` property is set to 'Processing'. Additionally, get status calls return 'Processing' until completed.")
  @JsonProperty("asynchronous")
  public String getAsynchronous() {
    return asynchronous;
  }
  public void setAsynchronous(String asynchronous) {
    this.asynchronous = asynchronous;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attachmentsUri")
  public String getAttachmentsUri() {
    return attachmentsUri;
  }
  public void setAttachmentsUri(String attachmentsUri) {
    this.attachmentsUri = attachmentsUri;
  }

  
  /**
   * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.
   **/
  
  @ApiModelProperty(value = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
  @JsonProperty("authoritativeCopy")
  public String getAuthoritativeCopy() {
    return authoritativeCopy;
  }
  public void setAuthoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("autoNavigation")
  public String getAutoNavigation() {
    return autoNavigation;
  }
  public void setAutoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("brandId")
  public String getBrandId() {
    return brandId;
  }
  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("brandLock")
  public String getBrandLock() {
    return brandLock;
  }
  public void setBrandLock(String brandLock) {
    this.brandLock = brandLock;
  }

  
  /**
   * Retrieves a URI for an endpoint that allows you to easily retrieve certificate information.
   **/
  
  @ApiModelProperty(value = "Retrieves a URI for an endpoint that allows you to easily retrieve certificate information.")
  @JsonProperty("certificateUri")
  public String getCertificateUri() {
    return certificateUri;
  }
  public void setCertificateUri(String certificateUri) {
    this.certificateUri = certificateUri;
  }

  
  /**
   * Specifies the date and time this item was completed.
   **/
  
  @ApiModelProperty(value = "Specifies the date and time this item was completed.")
  @JsonProperty("completedDateTime")
  public String getCompletedDateTime() {
    return completedDateTime;
  }
  public void setCompletedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
  }

  
  /**
   * Indicates the date and time the item was created.
   **/
  
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  @JsonProperty("createdDateTime")
  public String getCreatedDateTime() {
    return createdDateTime;
  }
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customFields")
  public CustomFields getCustomFields() {
    return customFields;
  }
  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }

  
  /**
   * Contains a URI for an endpoint that you can use to retrieve the custom fields.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the custom fields.")
  @JsonProperty("customFieldsUri")
  public String getCustomFieldsUri() {
    return customFieldsUri;
  }
  public void setCustomFieldsUri(String customFieldsUri) {
    this.customFieldsUri = customFieldsUri;
  }

  
  /**
   * The date and time the recipient declined the document.
   **/
  
  @ApiModelProperty(value = "The date and time the recipient declined the document.")
  @JsonProperty("declinedDateTime")
  public String getDeclinedDateTime() {
    return declinedDateTime;
  }
  public void setDeclinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
  }

  
  /**
   * Specifies the data and time the item was deleted.
   **/
  
  @ApiModelProperty(value = "Specifies the data and time the item was deleted.")
  @JsonProperty("deletedDateTime")
  public String getDeletedDateTime() {
    return deletedDateTime;
  }
  public void setDeletedDateTime(String deletedDateTime) {
    this.deletedDateTime = deletedDateTime;
  }

  
  /**
   * Reserved: For DocuSign use only.
   **/
  
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  @JsonProperty("deliveredDateTime")
  public String getDeliveredDateTime() {
    return deliveredDateTime;
  }
  public void setDeliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Complex element contains the details on the documents in the envelope.
   **/
  
  @ApiModelProperty(value = "Complex element contains the details on the documents in the envelope.")
  @JsonProperty("documents")
  public java.util.List<Document> getDocuments() {
    return documents;
  }
  public void setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documentsCombinedUri")
  public String getDocumentsCombinedUri() {
    return documentsCombinedUri;
  }
  public void setDocumentsCombinedUri(String documentsCombinedUri) {
    this.documentsCombinedUri = documentsCombinedUri;
  }

  
  /**
   * Contains a URI for an endpoint that you can use to retrieve the documents.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the documents.")
  @JsonProperty("documentsUri")
  public String getDocumentsUri() {
    return documentsUri;
  }
  public void setDocumentsUri(String documentsUri) {
    this.documentsUri = documentsUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailBlurb")
  public String getEmailBlurb() {
    return emailBlurb;
  }
  public void setEmailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailSettings")
  public EmailSettings getEmailSettings() {
    return emailSettings;
  }
  public void setEmailSettings(EmailSettings emailSettings) {
    this.emailSettings = emailSettings;
  }

  
  /**
   * Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.
   **/
  
  @ApiModelProperty(value = "Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  @JsonProperty("emailSubject")
  public String getEmailSubject() {
    return emailSubject;
  }
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  
  /**
   * When set to **true**, the signer is allowed to print the document and sign it on paper.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the signer is allowed to print the document and sign it on paper.")
  @JsonProperty("enableWetSign")
  public String getEnableWetSign() {
    return enableWetSign;
  }
  public void setEnableWetSign(String enableWetSign) {
    this.enableWetSign = enableWetSign;
  }

  
  /**
   * When set to **true**, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.\n\nYour account must have Document Visibility enabled to use this.
   **/
  
  @ApiModelProperty(value = "When set to **true**, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.\n\nYour account must have Document Visibility enabled to use this.")
  @JsonProperty("enforceSignerVisibility")
  public String getEnforceSignerVisibility() {
    return enforceSignerVisibility;
  }
  public void setEnforceSignerVisibility(String enforceSignerVisibility) {
    this.enforceSignerVisibility = enforceSignerVisibility;
  }

  
  /**
   * The envelope ID of the envelope status that failed to post.
   **/
  
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  @JsonProperty("envelopeId")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  
  /**
   * When set to **true**, Envelope ID Stamping is enabled.
   **/
  
  @ApiModelProperty(value = "When set to **true**, Envelope ID Stamping is enabled.")
  @JsonProperty("envelopeIdStamping")
  public String getEnvelopeIdStamping() {
    return envelopeIdStamping;
  }
  public void setEnvelopeIdStamping(String envelopeIdStamping) {
    this.envelopeIdStamping = envelopeIdStamping;
  }

  
  /**
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  @JsonProperty("envelopeUri")
  public String getEnvelopeUri() {
    return envelopeUri;
  }
  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("folderId")
  public String getFolderId() {
    return folderId;
  }
  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("folderName")
  public String getFolderName() {
    return folderName;
  }
  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("folderUri")
  public String getFolderUri() {
    return folderUri;
  }
  public void setFolderUri(String folderUri) {
    this.folderUri = folderUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("initialSentDateTime")
  public String getInitialSentDateTime() {
    return initialSentDateTime;
  }
  public void setInitialSentDateTime(String initialSentDateTime) {
    this.initialSentDateTime = initialSentDateTime;
  }

  
  /**
   * When set to **true**, indicates that this module is enabled on the account.
   **/
  
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  @JsonProperty("is21CFRPart11")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }
  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isSignatureProviderEnvelope")
  public String getIsSignatureProviderEnvelope() {
    return isSignatureProviderEnvelope;
  }
  public void setIsSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastModified")
  public String getLastModified() {
    return lastModified;
  }
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * The date and time the item was last modified.
   **/
  
  @ApiModelProperty(value = "The date and time the item was last modified.")
  @JsonProperty("lastModifiedDateTime")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }
  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lockInformation")
  public LockInformation getLockInformation() {
    return lockInformation;
  }
  public void setLockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
  }

  
  /**
   * When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope. \n\nAdditionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes. \n\nHowever, if the `messageLock` node is set to true**** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.
   **/
  
  @ApiModelProperty(value = "When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope. \n\nAdditionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes. \n\nHowever, if the `messageLock` node is set to true**** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.")
  @JsonProperty("messageLock")
  public String getMessageLock() {
    return messageLock;
  }
  public void setMessageLock(String messageLock) {
    this.messageLock = messageLock;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notification")
  public Notification getNotification() {
    return notification;
  }
  public void setNotification(Notification notification) {
    this.notification = notification;
  }

  
  /**
   * Contains a URI for an endpoint that you can use to retrieve the notifications.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the notifications.")
  @JsonProperty("notificationUri")
  public String getNotificationUri() {
    return notificationUri;
  }
  public void setNotificationUri(String notificationUri) {
    this.notificationUri = notificationUri;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  public UserInfo getOwner() {
    return owner;
  }
  public void setOwner(UserInfo owner) {
    this.owner = owner;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentFolderUri")
  public String getParentFolderUri() {
    return parentFolderUri;
  }
  public void setParentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purgeState")
  public String getPurgeState() {
    return purgeState;
  }
  public void setPurgeState(String purgeState) {
    this.purgeState = purgeState;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipients")
  public Recipients getRecipients() {
    return recipients;
  }
  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }

  
  /**
   * When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.
   **/
  
  @ApiModelProperty(value = "When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.")
  @JsonProperty("recipientsLock")
  public String getRecipientsLock() {
    return recipientsLock;
  }
  public void setRecipientsLock(String recipientsLock) {
    this.recipientsLock = recipientsLock;
  }

  
  /**
   * Contains a URI for an endpoint that you can use to retrieve the recipients.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the recipients.")
  @JsonProperty("recipientsUri")
  public String getRecipientsUri() {
    return recipientsUri;
  }
  public void setRecipientsUri(String recipientsUri) {
    this.recipientsUri = recipientsUri;
  }

  
  /**
   * The date and time the envelope was sent.
   **/
  
  @ApiModelProperty(value = "The date and time the envelope was sent.")
  @JsonProperty("sentDateTime")
  public String getSentDateTime() {
    return sentDateTime;
  }
  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }

  
  /**
   * When set to **true**, this custom tab is shared.
   **/
  
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  @JsonProperty("shared")
  public String getShared() {
    return shared;
  }
  public void setShared(String shared) {
    this.shared = shared;
  }

  
  /**
   * Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.
   **/
  
  @ApiModelProperty(value = "Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.")
  @JsonProperty("signingLocation")
  public String getSigningLocation() {
    return signingLocation;
  }
  public void setSigningLocation(String signingLocation) {
    this.signingLocation = signingLocation;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * The data and time the status changed.
   **/
  
  @ApiModelProperty(value = "The data and time the status changed.")
  @JsonProperty("statusChangedDateTime")
  public String getStatusChangedDateTime() {
    return statusChangedDateTime;
  }
  public void setStatusChangedDateTime(String statusChangedDateTime) {
    this.statusChangedDateTime = statusChangedDateTime;
  }

  
  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
   **/
  
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value.")
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  
  /**
   * Contains a URI for an endpoint which you can use to retrieve the templates.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint which you can use to retrieve the templates.")
  @JsonProperty("templatesUri")
  public String getTemplatesUri() {
    return templatesUri;
  }
  public void setTemplatesUri(String templatesUri) {
    this.templatesUri = templatesUri;
  }

  
  /**
   * Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
   **/
  
  @ApiModelProperty(value = "Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * When set to **true**, the disclosure is shown to recipients in accordance with the account’s Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients. \n\nIf the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the disclosure is shown to recipients in accordance with the account’s Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients. \n\nIf the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information.")
  @JsonProperty("useDisclosure")
  public String getUseDisclosure() {
    return useDisclosure;
  }
  public void setUseDisclosure(String useDisclosure) {
    this.useDisclosure = useDisclosure;
  }

  
  /**
   * The date and time the envelope or template was voided.
   **/
  
  @ApiModelProperty(value = "The date and time the envelope or template was voided.")
  @JsonProperty("voidedDateTime")
  public String getVoidedDateTime() {
    return voidedDateTime;
  }
  public void setVoidedDateTime(String voidedDateTime) {
    this.voidedDateTime = voidedDateTime;
  }

  
  /**
   * The reason the envelope or template was voided.
   **/
  
  @ApiModelProperty(value = "The reason the envelope or template was voided.")
  @JsonProperty("voidedReason")
  public String getVoidedReason() {
    return voidedReason;
  }
  public void setVoidedReason(String voidedReason) {
    this.voidedReason = voidedReason;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeTemplateResult envelopeTemplateResult = (EnvelopeTemplateResult) o;

    return true && Objects.equals(allowMarkup, envelopeTemplateResult.allowMarkup) &&
        Objects.equals(allowReassign, envelopeTemplateResult.allowReassign) &&
        Objects.equals(asynchronous, envelopeTemplateResult.asynchronous) &&
        Objects.equals(attachmentsUri, envelopeTemplateResult.attachmentsUri) &&
        Objects.equals(authoritativeCopy, envelopeTemplateResult.authoritativeCopy) &&
        Objects.equals(autoNavigation, envelopeTemplateResult.autoNavigation) &&
        Objects.equals(brandId, envelopeTemplateResult.brandId) &&
        Objects.equals(brandLock, envelopeTemplateResult.brandLock) &&
        Objects.equals(certificateUri, envelopeTemplateResult.certificateUri) &&
        Objects.equals(completedDateTime, envelopeTemplateResult.completedDateTime) &&
        Objects.equals(createdDateTime, envelopeTemplateResult.createdDateTime) &&
        Objects.equals(customFields, envelopeTemplateResult.customFields) &&
        Objects.equals(customFieldsUri, envelopeTemplateResult.customFieldsUri) &&
        Objects.equals(declinedDateTime, envelopeTemplateResult.declinedDateTime) &&
        Objects.equals(deletedDateTime, envelopeTemplateResult.deletedDateTime) &&
        Objects.equals(deliveredDateTime, envelopeTemplateResult.deliveredDateTime) &&
        Objects.equals(description, envelopeTemplateResult.description) &&
        Objects.equals(documents, envelopeTemplateResult.documents) &&
        Objects.equals(documentsCombinedUri, envelopeTemplateResult.documentsCombinedUri) &&
        Objects.equals(documentsUri, envelopeTemplateResult.documentsUri) &&
        Objects.equals(emailBlurb, envelopeTemplateResult.emailBlurb) &&
        Objects.equals(emailSettings, envelopeTemplateResult.emailSettings) &&
        Objects.equals(emailSubject, envelopeTemplateResult.emailSubject) &&
        Objects.equals(enableWetSign, envelopeTemplateResult.enableWetSign) &&
        Objects.equals(enforceSignerVisibility, envelopeTemplateResult.enforceSignerVisibility) &&
        Objects.equals(envelopeId, envelopeTemplateResult.envelopeId) &&
        Objects.equals(envelopeIdStamping, envelopeTemplateResult.envelopeIdStamping) &&
        Objects.equals(envelopeUri, envelopeTemplateResult.envelopeUri) &&
        Objects.equals(folderId, envelopeTemplateResult.folderId) &&
        Objects.equals(folderName, envelopeTemplateResult.folderName) &&
        Objects.equals(folderUri, envelopeTemplateResult.folderUri) &&
        Objects.equals(initialSentDateTime, envelopeTemplateResult.initialSentDateTime) &&
        Objects.equals(is21CFRPart11, envelopeTemplateResult.is21CFRPart11) &&
        Objects.equals(isSignatureProviderEnvelope, envelopeTemplateResult.isSignatureProviderEnvelope) &&
        Objects.equals(lastModified, envelopeTemplateResult.lastModified) &&
        Objects.equals(lastModifiedDateTime, envelopeTemplateResult.lastModifiedDateTime) &&
        Objects.equals(lockInformation, envelopeTemplateResult.lockInformation) &&
        Objects.equals(messageLock, envelopeTemplateResult.messageLock) &&
        Objects.equals(name, envelopeTemplateResult.name) &&
        Objects.equals(notification, envelopeTemplateResult.notification) &&
        Objects.equals(notificationUri, envelopeTemplateResult.notificationUri) &&
        Objects.equals(owner, envelopeTemplateResult.owner) &&
        Objects.equals(pageCount, envelopeTemplateResult.pageCount) &&
        Objects.equals(parentFolderUri, envelopeTemplateResult.parentFolderUri) &&
        Objects.equals(password, envelopeTemplateResult.password) &&
        Objects.equals(purgeState, envelopeTemplateResult.purgeState) &&
        Objects.equals(recipients, envelopeTemplateResult.recipients) &&
        Objects.equals(recipientsLock, envelopeTemplateResult.recipientsLock) &&
        Objects.equals(recipientsUri, envelopeTemplateResult.recipientsUri) &&
        Objects.equals(sentDateTime, envelopeTemplateResult.sentDateTime) &&
        Objects.equals(shared, envelopeTemplateResult.shared) &&
        Objects.equals(signingLocation, envelopeTemplateResult.signingLocation) &&
        Objects.equals(status, envelopeTemplateResult.status) &&
        Objects.equals(statusChangedDateTime, envelopeTemplateResult.statusChangedDateTime) &&
        Objects.equals(templateId, envelopeTemplateResult.templateId) &&
        Objects.equals(templatesUri, envelopeTemplateResult.templatesUri) &&
        Objects.equals(transactionId, envelopeTemplateResult.transactionId) &&
        Objects.equals(uri, envelopeTemplateResult.uri) &&
        Objects.equals(useDisclosure, envelopeTemplateResult.useDisclosure) &&
        Objects.equals(voidedDateTime, envelopeTemplateResult.voidedDateTime) &&
        Objects.equals(voidedReason, envelopeTemplateResult.voidedReason)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMarkup, allowReassign, asynchronous, attachmentsUri, authoritativeCopy, autoNavigation, brandId, brandLock, certificateUri, completedDateTime, createdDateTime, customFields, customFieldsUri, declinedDateTime, deletedDateTime, deliveredDateTime, description, documents, documentsCombinedUri, documentsUri, emailBlurb, emailSettings, emailSubject, enableWetSign, enforceSignerVisibility, envelopeId, envelopeIdStamping, envelopeUri, folderId, folderName, folderUri, initialSentDateTime, is21CFRPart11, isSignatureProviderEnvelope, lastModified, lastModifiedDateTime, lockInformation, messageLock, name, notification, notificationUri, owner, pageCount, parentFolderUri, password, purgeState, recipients, recipientsLock, recipientsUri, sentDateTime, shared, signingLocation, status, statusChangedDateTime, templateId, templatesUri, transactionId, uri, useDisclosure, voidedDateTime, voidedReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTemplateResult {\n");
    
    if (allowMarkup != null)
      sb.append("    allowMarkup: ").append(toIndentedString(allowMarkup)).append("\n");
    if (allowReassign != null)
      sb.append("    allowReassign: ").append(toIndentedString(allowReassign)).append("\n");
    if (asynchronous != null)
      sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    if (attachmentsUri != null)
      sb.append("    attachmentsUri: ").append(toIndentedString(attachmentsUri)).append("\n");
    if (authoritativeCopy != null)
      sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
    if (autoNavigation != null)
      sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
    if (brandId != null)
      sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    if (brandLock != null)
      sb.append("    brandLock: ").append(toIndentedString(brandLock)).append("\n");
    if (certificateUri != null)
      sb.append("    certificateUri: ").append(toIndentedString(certificateUri)).append("\n");
    if (completedDateTime != null)
      sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
    if (createdDateTime != null)
      sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    if (customFields != null)
      sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    if (customFieldsUri != null)
      sb.append("    customFieldsUri: ").append(toIndentedString(customFieldsUri)).append("\n");
    if (declinedDateTime != null)
      sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    if (deletedDateTime != null)
      sb.append("    deletedDateTime: ").append(toIndentedString(deletedDateTime)).append("\n");
    if (deliveredDateTime != null)
      sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    if (description != null)
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
    if (documents != null)
      sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    if (documentsCombinedUri != null)
      sb.append("    documentsCombinedUri: ").append(toIndentedString(documentsCombinedUri)).append("\n");
    if (documentsUri != null)
      sb.append("    documentsUri: ").append(toIndentedString(documentsUri)).append("\n");
    if (emailBlurb != null)
      sb.append("    emailBlurb: ").append(toIndentedString(emailBlurb)).append("\n");
    if (emailSettings != null)
      sb.append("    emailSettings: ").append(toIndentedString(emailSettings)).append("\n");
    if (emailSubject != null)
      sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    if (enableWetSign != null)
      sb.append("    enableWetSign: ").append(toIndentedString(enableWetSign)).append("\n");
    if (enforceSignerVisibility != null)
      sb.append("    enforceSignerVisibility: ").append(toIndentedString(enforceSignerVisibility)).append("\n");
    if (envelopeId != null)
      sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    if (envelopeIdStamping != null)
      sb.append("    envelopeIdStamping: ").append(toIndentedString(envelopeIdStamping)).append("\n");
    if (envelopeUri != null)
      sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    if (folderId != null)
      sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    if (folderName != null)
      sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
    if (folderUri != null)
      sb.append("    folderUri: ").append(toIndentedString(folderUri)).append("\n");
    if (initialSentDateTime != null)
      sb.append("    initialSentDateTime: ").append(toIndentedString(initialSentDateTime)).append("\n");
    if (is21CFRPart11 != null)
      sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    if (isSignatureProviderEnvelope != null)
      sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
    if (lastModified != null)
      sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    if (lastModifiedDateTime != null)
      sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    if (lockInformation != null)
      sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
    if (messageLock != null)
      sb.append("    messageLock: ").append(toIndentedString(messageLock)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (notification != null)
      sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    if (notificationUri != null)
      sb.append("    notificationUri: ").append(toIndentedString(notificationUri)).append("\n");
    if (owner != null)
      sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    if (pageCount != null)
      sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    if (parentFolderUri != null)
      sb.append("    parentFolderUri: ").append(toIndentedString(parentFolderUri)).append("\n");
    if (password != null)
      sb.append("    password: ").append(toIndentedString(password)).append("\n");
    if (purgeState != null)
      sb.append("    purgeState: ").append(toIndentedString(purgeState)).append("\n");
    if (recipients != null)
      sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    if (recipientsLock != null)
      sb.append("    recipientsLock: ").append(toIndentedString(recipientsLock)).append("\n");
    if (recipientsUri != null)
      sb.append("    recipientsUri: ").append(toIndentedString(recipientsUri)).append("\n");
    if (sentDateTime != null)
      sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    if (shared != null)
      sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    if (signingLocation != null)
      sb.append("    signingLocation: ").append(toIndentedString(signingLocation)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (statusChangedDateTime != null)
      sb.append("    statusChangedDateTime: ").append(toIndentedString(statusChangedDateTime)).append("\n");
    if (templateId != null)
      sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    if (templatesUri != null)
      sb.append("    templatesUri: ").append(toIndentedString(templatesUri)).append("\n");
    if (transactionId != null)
      sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    if (uri != null)
      sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    if (useDisclosure != null)
      sb.append("    useDisclosure: ").append(toIndentedString(useDisclosure)).append("\n");
    if (voidedDateTime != null)
      sb.append("    voidedDateTime: ").append(toIndentedString(voidedDateTime)).append("\n");
    if (voidedReason != null)
      sb.append("    voidedReason: ").append(toIndentedString(voidedReason)).append("\n");
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

