package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.EmailSettings;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.UserInfo;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.Notification;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class EnvelopeTemplateResult   {
  
  private String templateId = null;
  private String name = null;
  private String shared = null;
  private String password = null;
  private String description = null;
  private String lastModified = null;
  private Integer pageCount = null;
  private String uri = null;
  private String folderName = null;
  private String folderId = null;
  private String folderUri = null;
  private String parentFolderUri = null;
  private UserInfo owner = null;
  private java.util.List<Document> documents = new java.util.ArrayList<Document>();
  private Recipients recipients = null;
  private String transactionId = null;
  private String status = null;
  private String documentsUri = null;
  private String recipientsUri = null;
  private String asynchronous = null;
  private String envelopeUri = null;
  private String emailSubject = null;
  private String emailBlurb = null;
  private String envelopeId = null;
  private String signingLocation = null;
  private String customFieldsUri = null;
  private String envelopeIdStamping = null;
  private String authoritativeCopy = null;
  private Notification notification = null;
  private String notificationUri = null;
  private String enforceSignerVisibility = null;
  private String enableWetSign = null;
  private String allowMarkup = null;
  private String allowReassign = null;
  private String createdDateTime = null;
  private String lastModifiedDateTime = null;
  private String deliveredDateTime = null;
  private String sentDateTime = null;
  private String completedDateTime = null;
  private String voidedDateTime = null;
  private String voidedReason = null;
  private String deletedDateTime = null;
  private String declinedDateTime = null;
  private String statusChangedDateTime = null;
  private String documentsCombinedUri = null;
  private String certificateUri = null;
  private String templatesUri = null;
  private String messageLock = null;
  private String recipientsLock = null;
  private String useDisclosure = null;
  private EmailSettings emailSettings = null;
  private String purgeState = null;
  private LockInformation lockInformation = null;
  private String is21CFRPart11 = null;

  
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
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
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
  @JsonProperty("parentFolderUri")
  public String getParentFolderUri() {
    return parentFolderUri;
  }
  public void setParentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
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
   * Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine if an envelope status (i.e. was created or not) for cases where an internet connection was lost before the envelope status could be returned.
   **/
  @ApiModelProperty(value = "Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine if an envelope status (i.e. was created or not) for cases where an internet connection was lost before the envelope status could be returned.")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
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
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("allowReassign")
  public String getAllowReassign() {
    return allowReassign;
  }
  public void setAllowReassign(String allowReassign) {
    this.allowReassign = allowReassign;
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
  @JsonProperty("lockInformation")
  public LockInformation getLockInformation() {
    return lockInformation;
  }
  public void setLockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeTemplateResult envelopeTemplateResult = (EnvelopeTemplateResult) o;
    return Objects.equals(templateId, envelopeTemplateResult.templateId) &&
        Objects.equals(name, envelopeTemplateResult.name) &&
        Objects.equals(shared, envelopeTemplateResult.shared) &&
        Objects.equals(password, envelopeTemplateResult.password) &&
        Objects.equals(description, envelopeTemplateResult.description) &&
        Objects.equals(lastModified, envelopeTemplateResult.lastModified) &&
        Objects.equals(pageCount, envelopeTemplateResult.pageCount) &&
        Objects.equals(uri, envelopeTemplateResult.uri) &&
        Objects.equals(folderName, envelopeTemplateResult.folderName) &&
        Objects.equals(folderId, envelopeTemplateResult.folderId) &&
        Objects.equals(folderUri, envelopeTemplateResult.folderUri) &&
        Objects.equals(parentFolderUri, envelopeTemplateResult.parentFolderUri) &&
        Objects.equals(owner, envelopeTemplateResult.owner) &&
        Objects.equals(documents, envelopeTemplateResult.documents) &&
        Objects.equals(recipients, envelopeTemplateResult.recipients) &&
        Objects.equals(transactionId, envelopeTemplateResult.transactionId) &&
        Objects.equals(status, envelopeTemplateResult.status) &&
        Objects.equals(documentsUri, envelopeTemplateResult.documentsUri) &&
        Objects.equals(recipientsUri, envelopeTemplateResult.recipientsUri) &&
        Objects.equals(asynchronous, envelopeTemplateResult.asynchronous) &&
        Objects.equals(envelopeUri, envelopeTemplateResult.envelopeUri) &&
        Objects.equals(emailSubject, envelopeTemplateResult.emailSubject) &&
        Objects.equals(emailBlurb, envelopeTemplateResult.emailBlurb) &&
        Objects.equals(envelopeId, envelopeTemplateResult.envelopeId) &&
        Objects.equals(signingLocation, envelopeTemplateResult.signingLocation) &&
        Objects.equals(customFieldsUri, envelopeTemplateResult.customFieldsUri) &&
        Objects.equals(envelopeIdStamping, envelopeTemplateResult.envelopeIdStamping) &&
        Objects.equals(authoritativeCopy, envelopeTemplateResult.authoritativeCopy) &&
        Objects.equals(notification, envelopeTemplateResult.notification) &&
        Objects.equals(notificationUri, envelopeTemplateResult.notificationUri) &&
        Objects.equals(enforceSignerVisibility, envelopeTemplateResult.enforceSignerVisibility) &&
        Objects.equals(enableWetSign, envelopeTemplateResult.enableWetSign) &&
        Objects.equals(allowMarkup, envelopeTemplateResult.allowMarkup) &&
        Objects.equals(allowReassign, envelopeTemplateResult.allowReassign) &&
        Objects.equals(createdDateTime, envelopeTemplateResult.createdDateTime) &&
        Objects.equals(lastModifiedDateTime, envelopeTemplateResult.lastModifiedDateTime) &&
        Objects.equals(deliveredDateTime, envelopeTemplateResult.deliveredDateTime) &&
        Objects.equals(sentDateTime, envelopeTemplateResult.sentDateTime) &&
        Objects.equals(completedDateTime, envelopeTemplateResult.completedDateTime) &&
        Objects.equals(voidedDateTime, envelopeTemplateResult.voidedDateTime) &&
        Objects.equals(voidedReason, envelopeTemplateResult.voidedReason) &&
        Objects.equals(deletedDateTime, envelopeTemplateResult.deletedDateTime) &&
        Objects.equals(declinedDateTime, envelopeTemplateResult.declinedDateTime) &&
        Objects.equals(statusChangedDateTime, envelopeTemplateResult.statusChangedDateTime) &&
        Objects.equals(documentsCombinedUri, envelopeTemplateResult.documentsCombinedUri) &&
        Objects.equals(certificateUri, envelopeTemplateResult.certificateUri) &&
        Objects.equals(templatesUri, envelopeTemplateResult.templatesUri) &&
        Objects.equals(messageLock, envelopeTemplateResult.messageLock) &&
        Objects.equals(recipientsLock, envelopeTemplateResult.recipientsLock) &&
        Objects.equals(useDisclosure, envelopeTemplateResult.useDisclosure) &&
        Objects.equals(emailSettings, envelopeTemplateResult.emailSettings) &&
        Objects.equals(purgeState, envelopeTemplateResult.purgeState) &&
        Objects.equals(lockInformation, envelopeTemplateResult.lockInformation) &&
        Objects.equals(is21CFRPart11, envelopeTemplateResult.is21CFRPart11);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, name, shared, password, description, lastModified, pageCount, uri, folderName, folderId, folderUri, parentFolderUri, owner, documents, recipients, transactionId, status, documentsUri, recipientsUri, asynchronous, envelopeUri, emailSubject, emailBlurb, envelopeId, signingLocation, customFieldsUri, envelopeIdStamping, authoritativeCopy, notification, notificationUri, enforceSignerVisibility, enableWetSign, allowMarkup, allowReassign, createdDateTime, lastModifiedDateTime, deliveredDateTime, sentDateTime, completedDateTime, voidedDateTime, voidedReason, deletedDateTime, declinedDateTime, statusChangedDateTime, documentsCombinedUri, certificateUri, templatesUri, messageLock, recipientsLock, useDisclosure, emailSettings, purgeState, lockInformation, is21CFRPart11);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTemplateResult {\n");
    
    sb.append("    templateId: ").append(StringUtil.toIndentedString(templateId)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    shared: ").append(StringUtil.toIndentedString(shared)).append("\n");
    sb.append("    password: ").append(StringUtil.toIndentedString(password)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    lastModified: ").append(StringUtil.toIndentedString(lastModified)).append("\n");
    sb.append("    pageCount: ").append(StringUtil.toIndentedString(pageCount)).append("\n");
    sb.append("    uri: ").append(StringUtil.toIndentedString(uri)).append("\n");
    sb.append("    folderName: ").append(StringUtil.toIndentedString(folderName)).append("\n");
    sb.append("    folderId: ").append(StringUtil.toIndentedString(folderId)).append("\n");
    sb.append("    folderUri: ").append(StringUtil.toIndentedString(folderUri)).append("\n");
    sb.append("    parentFolderUri: ").append(StringUtil.toIndentedString(parentFolderUri)).append("\n");
    sb.append("    owner: ").append(StringUtil.toIndentedString(owner)).append("\n");
    sb.append("    documents: ").append(StringUtil.toIndentedString(documents)).append("\n");
    sb.append("    recipients: ").append(StringUtil.toIndentedString(recipients)).append("\n");
    sb.append("    transactionId: ").append(StringUtil.toIndentedString(transactionId)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    documentsUri: ").append(StringUtil.toIndentedString(documentsUri)).append("\n");
    sb.append("    recipientsUri: ").append(StringUtil.toIndentedString(recipientsUri)).append("\n");
    sb.append("    asynchronous: ").append(StringUtil.toIndentedString(asynchronous)).append("\n");
    sb.append("    envelopeUri: ").append(StringUtil.toIndentedString(envelopeUri)).append("\n");
    sb.append("    emailSubject: ").append(StringUtil.toIndentedString(emailSubject)).append("\n");
    sb.append("    emailBlurb: ").append(StringUtil.toIndentedString(emailBlurb)).append("\n");
    sb.append("    envelopeId: ").append(StringUtil.toIndentedString(envelopeId)).append("\n");
    sb.append("    signingLocation: ").append(StringUtil.toIndentedString(signingLocation)).append("\n");
    sb.append("    customFieldsUri: ").append(StringUtil.toIndentedString(customFieldsUri)).append("\n");
    sb.append("    envelopeIdStamping: ").append(StringUtil.toIndentedString(envelopeIdStamping)).append("\n");
    sb.append("    authoritativeCopy: ").append(StringUtil.toIndentedString(authoritativeCopy)).append("\n");
    sb.append("    notification: ").append(StringUtil.toIndentedString(notification)).append("\n");
    sb.append("    notificationUri: ").append(StringUtil.toIndentedString(notificationUri)).append("\n");
    sb.append("    enforceSignerVisibility: ").append(StringUtil.toIndentedString(enforceSignerVisibility)).append("\n");
    sb.append("    enableWetSign: ").append(StringUtil.toIndentedString(enableWetSign)).append("\n");
    sb.append("    allowMarkup: ").append(StringUtil.toIndentedString(allowMarkup)).append("\n");
    sb.append("    allowReassign: ").append(StringUtil.toIndentedString(allowReassign)).append("\n");
    sb.append("    createdDateTime: ").append(StringUtil.toIndentedString(createdDateTime)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(StringUtil.toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    deliveredDateTime: ").append(StringUtil.toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    sentDateTime: ").append(StringUtil.toIndentedString(sentDateTime)).append("\n");
    sb.append("    completedDateTime: ").append(StringUtil.toIndentedString(completedDateTime)).append("\n");
    sb.append("    voidedDateTime: ").append(StringUtil.toIndentedString(voidedDateTime)).append("\n");
    sb.append("    voidedReason: ").append(StringUtil.toIndentedString(voidedReason)).append("\n");
    sb.append("    deletedDateTime: ").append(StringUtil.toIndentedString(deletedDateTime)).append("\n");
    sb.append("    declinedDateTime: ").append(StringUtil.toIndentedString(declinedDateTime)).append("\n");
    sb.append("    statusChangedDateTime: ").append(StringUtil.toIndentedString(statusChangedDateTime)).append("\n");
    sb.append("    documentsCombinedUri: ").append(StringUtil.toIndentedString(documentsCombinedUri)).append("\n");
    sb.append("    certificateUri: ").append(StringUtil.toIndentedString(certificateUri)).append("\n");
    sb.append("    templatesUri: ").append(StringUtil.toIndentedString(templatesUri)).append("\n");
    sb.append("    messageLock: ").append(StringUtil.toIndentedString(messageLock)).append("\n");
    sb.append("    recipientsLock: ").append(StringUtil.toIndentedString(recipientsLock)).append("\n");
    sb.append("    useDisclosure: ").append(StringUtil.toIndentedString(useDisclosure)).append("\n");
    sb.append("    emailSettings: ").append(StringUtil.toIndentedString(emailSettings)).append("\n");
    sb.append("    purgeState: ").append(StringUtil.toIndentedString(purgeState)).append("\n");
    sb.append("    lockInformation: ").append(StringUtil.toIndentedString(lockInformation)).append("\n");
    sb.append("    is21CFRPart11: ").append(StringUtil.toIndentedString(is21CFRPart11)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
