package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Attachment;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.EmailSettings;
import com.docusign.esign.model.EnvelopeDocument;
import com.docusign.esign.model.EnvelopeMetadata;
import com.docusign.esign.model.Folder;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.Notification;
import com.docusign.esign.model.PowerForm;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.UserInfo;
import com.docusign.esign.model.Workflow;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeTemplate
 */

public class EnvelopeTemplate {
  @JsonProperty("accessControlListBase64")
  private String accessControlListBase64 = null;

  @JsonProperty("allowComments")
  private String allowComments = null;

  @JsonProperty("allowMarkup")
  private String allowMarkup = null;

  @JsonProperty("allowReassign")
  private String allowReassign = null;

  @JsonProperty("allowViewHistory")
  private String allowViewHistory = null;

  @JsonProperty("anySigner")
  private String anySigner = null;

  @JsonProperty("asynchronous")
  private String asynchronous = null;

  @JsonProperty("attachmentsUri")
  private String attachmentsUri = null;

  @JsonProperty("authoritativeCopy")
  private String authoritativeCopy = null;

  @JsonProperty("authoritativeCopyDefault")
  private String authoritativeCopyDefault = null;

  @JsonProperty("autoMatch")
  private String autoMatch = null;

  @JsonProperty("autoMatchSpecifiedByUser")
  private String autoMatchSpecifiedByUser = null;

  @JsonProperty("autoNavigation")
  private String autoNavigation = null;

  @JsonProperty("brandId")
  private String brandId = null;

  @JsonProperty("brandLock")
  private String brandLock = null;

  @JsonProperty("certificateUri")
  private String certificateUri = null;

  @JsonProperty("completedDateTime")
  private String completedDateTime = null;

  @JsonProperty("copyRecipientData")
  private String copyRecipientData = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("customFields")
  private CustomFields customFields = null;

  @JsonProperty("customFieldsUri")
  private String customFieldsUri = null;

  @JsonProperty("declinedDateTime")
  private String declinedDateTime = null;

  @JsonProperty("deletedDateTime")
  private String deletedDateTime = null;

  @JsonProperty("deliveredDateTime")
  private String deliveredDateTime = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("disableResponsiveDocument")
  private String disableResponsiveDocument = null;

  @JsonProperty("documents")
  private java.util.List<Document> documents = null;

  @JsonProperty("documentsCombinedUri")
  private String documentsCombinedUri = null;

  @JsonProperty("documentsUri")
  private String documentsUri = null;

  @JsonProperty("emailBlurb")
  private String emailBlurb = null;

  @JsonProperty("emailSettings")
  private EmailSettings emailSettings = null;

  @JsonProperty("emailSubject")
  private String emailSubject = null;

  @JsonProperty("enableWetSign")
  private String enableWetSign = null;

  @JsonProperty("enforceSignerVisibility")
  private String enforceSignerVisibility = null;

  @JsonProperty("envelopeAttachments")
  private java.util.List<Attachment> envelopeAttachments = null;

  @JsonProperty("envelopeDocuments")
  private java.util.List<EnvelopeDocument> envelopeDocuments = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("envelopeIdStamping")
  private String envelopeIdStamping = null;

  @JsonProperty("envelopeLocation")
  private String envelopeLocation = null;

  @JsonProperty("envelopeMetadata")
  private EnvelopeMetadata envelopeMetadata = null;

  @JsonProperty("envelopeUri")
  private String envelopeUri = null;

  @JsonProperty("expireAfter")
  private String expireAfter = null;

  @JsonProperty("expireDateTime")
  private String expireDateTime = null;

  @JsonProperty("expireEnabled")
  private String expireEnabled = null;

  @JsonProperty("externalEnvelopeId")
  private String externalEnvelopeId = null;

  @JsonProperty("favoritedByMe")
  private String favoritedByMe = null;

  @JsonProperty("folderId")
  private String folderId = null;

  @JsonProperty("folderIds")
  private java.util.List<String> folderIds = null;

  @JsonProperty("folderName")
  private String folderName = null;

  @JsonProperty("folders")
  private java.util.List<Folder> folders = null;

  @JsonProperty("hasComments")
  private String hasComments = null;

  @JsonProperty("hasFormDataChanged")
  private String hasFormDataChanged = null;

  @JsonProperty("hasWavFile")
  private String hasWavFile = null;

  @JsonProperty("holder")
  private String holder = null;

  @JsonProperty("initialSentDateTime")
  private String initialSentDateTime = null;

  @JsonProperty("is21CFRPart11")
  private String is21CFRPart11 = null;

  @JsonProperty("isDynamicEnvelope")
  private String isDynamicEnvelope = null;

  @JsonProperty("isSignatureProviderEnvelope")
  private String isSignatureProviderEnvelope = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("lastModifiedBy")
  private UserInfo lastModifiedBy = null;

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  @JsonProperty("lastUsed")
  private String lastUsed = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("lockInformation")
  private LockInformation lockInformation = null;

  @JsonProperty("messageLock")
  private String messageLock = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("newPassword")
  private String newPassword = null;

  @JsonProperty("notification")
  private Notification notification = null;

  @JsonProperty("notificationUri")
  private String notificationUri = null;

  @JsonProperty("owner")
  private UserInfo owner = null;

  @JsonProperty("pageCount")
  private String pageCount = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("passwordProtected")
  private String passwordProtected = null;

  @JsonProperty("powerForm")
  private PowerForm powerForm = null;

  @JsonProperty("powerForms")
  private java.util.List<PowerForm> powerForms = null;

  @JsonProperty("purgeCompletedDate")
  private String purgeCompletedDate = null;

  @JsonProperty("purgeRequestDate")
  private String purgeRequestDate = null;

  @JsonProperty("purgeState")
  private String purgeState = null;

  @JsonProperty("recipients")
  private Recipients recipients = null;

  @JsonProperty("recipientsLock")
  private String recipientsLock = null;

  @JsonProperty("recipientsUri")
  private String recipientsUri = null;

  @JsonProperty("sender")
  private UserInfo sender = null;

  @JsonProperty("sentDateTime")
  private String sentDateTime = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("signerCanSignOnMobile")
  private String signerCanSignOnMobile = null;

  @JsonProperty("signingLocation")
  private String signingLocation = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusChangedDateTime")
  private String statusChangedDateTime = null;

  @JsonProperty("statusDateTime")
  private String statusDateTime = null;

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("templatesUri")
  private String templatesUri = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("useDisclosure")
  private String useDisclosure = null;

  @JsonProperty("voidedDateTime")
  private String voidedDateTime = null;

  @JsonProperty("voidedReason")
  private String voidedReason = null;

  @JsonProperty("workflow")
  private Workflow workflow = null;

  public EnvelopeTemplate accessControlListBase64(String accessControlListBase64) {
    this.accessControlListBase64 = accessControlListBase64;
    return this;
  }

   /**
   * 
   * @return accessControlListBase64
  **/
  @ApiModelProperty(value = "")
  public String getAccessControlListBase64() {
    return accessControlListBase64;
  }

  public void setAccessControlListBase64(String accessControlListBase64) {
    this.accessControlListBase64 = accessControlListBase64;
  }

  public EnvelopeTemplate allowComments(String allowComments) {
    this.allowComments = allowComments;
    return this;
  }

   /**
   * 
   * @return allowComments
  **/
  @ApiModelProperty(value = "")
  public String getAllowComments() {
    return allowComments;
  }

  public void setAllowComments(String allowComments) {
    this.allowComments = allowComments;
  }

  public EnvelopeTemplate allowMarkup(String allowMarkup) {
    this.allowMarkup = allowMarkup;
    return this;
  }

   /**
   * When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this
   * @return allowMarkup
  **/
  @ApiModelProperty(value = "When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this")
  public String getAllowMarkup() {
    return allowMarkup;
  }

  public void setAllowMarkup(String allowMarkup) {
    this.allowMarkup = allowMarkup;
  }

  public EnvelopeTemplate allowReassign(String allowReassign) {
    this.allowReassign = allowReassign;
    return this;
  }

   /**
   * When set to **true**, the recipient can redirect an envelope to a more appropriate recipient.
   * @return allowReassign
  **/
  @ApiModelProperty(value = "When set to **true**, the recipient can redirect an envelope to a more appropriate recipient.")
  public String getAllowReassign() {
    return allowReassign;
  }

  public void setAllowReassign(String allowReassign) {
    this.allowReassign = allowReassign;
  }

  public EnvelopeTemplate allowViewHistory(String allowViewHistory) {
    this.allowViewHistory = allowViewHistory;
    return this;
  }

   /**
   * 
   * @return allowViewHistory
  **/
  @ApiModelProperty(value = "")
  public String getAllowViewHistory() {
    return allowViewHistory;
  }

  public void setAllowViewHistory(String allowViewHistory) {
    this.allowViewHistory = allowViewHistory;
  }

  public EnvelopeTemplate anySigner(String anySigner) {
    this.anySigner = anySigner;
    return this;
  }

   /**
   * 
   * @return anySigner
  **/
  @ApiModelProperty(value = "")
  public String getAnySigner() {
    return anySigner;
  }

  public void setAnySigner(String anySigner) {
    this.anySigner = anySigner;
  }

  public EnvelopeTemplate asynchronous(String asynchronous) {
    this.asynchronous = asynchronous;
    return this;
  }

   /**
   * When set to **true**, the envelope is queued for processing and the value of the `status` property is set to 'Processing'. Additionally, get status calls return 'Processing' until completed.
   * @return asynchronous
  **/
  @ApiModelProperty(value = "When set to **true**, the envelope is queued for processing and the value of the `status` property is set to 'Processing'. Additionally, get status calls return 'Processing' until completed.")
  public String getAsynchronous() {
    return asynchronous;
  }

  public void setAsynchronous(String asynchronous) {
    this.asynchronous = asynchronous;
  }

  public EnvelopeTemplate attachmentsUri(String attachmentsUri) {
    this.attachmentsUri = attachmentsUri;
    return this;
  }

   /**
   * 
   * @return attachmentsUri
  **/
  @ApiModelProperty(value = "")
  public String getAttachmentsUri() {
    return attachmentsUri;
  }

  public void setAttachmentsUri(String attachmentsUri) {
    this.attachmentsUri = attachmentsUri;
  }

  public EnvelopeTemplate authoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
    return this;
  }

   /**
   * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.
   * @return authoritativeCopy
  **/
  @ApiModelProperty(value = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
  public String getAuthoritativeCopy() {
    return authoritativeCopy;
  }

  public void setAuthoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
  }

  public EnvelopeTemplate authoritativeCopyDefault(String authoritativeCopyDefault) {
    this.authoritativeCopyDefault = authoritativeCopyDefault;
    return this;
  }

   /**
   * 
   * @return authoritativeCopyDefault
  **/
  @ApiModelProperty(value = "")
  public String getAuthoritativeCopyDefault() {
    return authoritativeCopyDefault;
  }

  public void setAuthoritativeCopyDefault(String authoritativeCopyDefault) {
    this.authoritativeCopyDefault = authoritativeCopyDefault;
  }

  public EnvelopeTemplate autoMatch(String autoMatch) {
    this.autoMatch = autoMatch;
    return this;
  }

   /**
   * 
   * @return autoMatch
  **/
  @ApiModelProperty(value = "")
  public String getAutoMatch() {
    return autoMatch;
  }

  public void setAutoMatch(String autoMatch) {
    this.autoMatch = autoMatch;
  }

  public EnvelopeTemplate autoMatchSpecifiedByUser(String autoMatchSpecifiedByUser) {
    this.autoMatchSpecifiedByUser = autoMatchSpecifiedByUser;
    return this;
  }

   /**
   * 
   * @return autoMatchSpecifiedByUser
  **/
  @ApiModelProperty(value = "")
  public String getAutoMatchSpecifiedByUser() {
    return autoMatchSpecifiedByUser;
  }

  public void setAutoMatchSpecifiedByUser(String autoMatchSpecifiedByUser) {
    this.autoMatchSpecifiedByUser = autoMatchSpecifiedByUser;
  }

  public EnvelopeTemplate autoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
    return this;
  }

   /**
   * 
   * @return autoNavigation
  **/
  @ApiModelProperty(value = "")
  public String getAutoNavigation() {
    return autoNavigation;
  }

  public void setAutoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
  }

  public EnvelopeTemplate brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * 
   * @return brandId
  **/
  @ApiModelProperty(value = "")
  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  public EnvelopeTemplate brandLock(String brandLock) {
    this.brandLock = brandLock;
    return this;
  }

   /**
   * 
   * @return brandLock
  **/
  @ApiModelProperty(value = "")
  public String getBrandLock() {
    return brandLock;
  }

  public void setBrandLock(String brandLock) {
    this.brandLock = brandLock;
  }

  public EnvelopeTemplate certificateUri(String certificateUri) {
    this.certificateUri = certificateUri;
    return this;
  }

   /**
   * Retrieves a URI for an endpoint that allows you to easily retrieve certificate information.
   * @return certificateUri
  **/
  @ApiModelProperty(value = "Retrieves a URI for an endpoint that allows you to easily retrieve certificate information.")
  public String getCertificateUri() {
    return certificateUri;
  }

  public void setCertificateUri(String certificateUri) {
    this.certificateUri = certificateUri;
  }

  public EnvelopeTemplate completedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
    return this;
  }

   /**
   * Specifies the date and time this item was completed.
   * @return completedDateTime
  **/
  @ApiModelProperty(value = "Specifies the date and time this item was completed.")
  public String getCompletedDateTime() {
    return completedDateTime;
  }

  public void setCompletedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
  }

  public EnvelopeTemplate copyRecipientData(String copyRecipientData) {
    this.copyRecipientData = copyRecipientData;
    return this;
  }

   /**
   * 
   * @return copyRecipientData
  **/
  @ApiModelProperty(value = "")
  public String getCopyRecipientData() {
    return copyRecipientData;
  }

  public void setCopyRecipientData(String copyRecipientData) {
    this.copyRecipientData = copyRecipientData;
  }

  public EnvelopeTemplate created(String created) {
    this.created = created;
    return this;
  }

   /**
   * 
   * @return created
  **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public EnvelopeTemplate createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Indicates the date and time the item was created.
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public EnvelopeTemplate customFields(CustomFields customFields) {
    this.customFields = customFields;
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public CustomFields getCustomFields() {
    return customFields;
  }

  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }

  public EnvelopeTemplate customFieldsUri(String customFieldsUri) {
    this.customFieldsUri = customFieldsUri;
    return this;
  }

   /**
   * Contains a URI for an endpoint that you can use to retrieve the custom fields.
   * @return customFieldsUri
  **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the custom fields.")
  public String getCustomFieldsUri() {
    return customFieldsUri;
  }

  public void setCustomFieldsUri(String customFieldsUri) {
    this.customFieldsUri = customFieldsUri;
  }

  public EnvelopeTemplate declinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
    return this;
  }

   /**
   * The date and time the recipient declined the document.
   * @return declinedDateTime
  **/
  @ApiModelProperty(value = "The date and time the recipient declined the document.")
  public String getDeclinedDateTime() {
    return declinedDateTime;
  }

  public void setDeclinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
  }

  public EnvelopeTemplate deletedDateTime(String deletedDateTime) {
    this.deletedDateTime = deletedDateTime;
    return this;
  }

   /**
   * Specifies the data and time the item was deleted.
   * @return deletedDateTime
  **/
  @ApiModelProperty(value = "Specifies the data and time the item was deleted.")
  public String getDeletedDateTime() {
    return deletedDateTime;
  }

  public void setDeletedDateTime(String deletedDateTime) {
    this.deletedDateTime = deletedDateTime;
  }

  public EnvelopeTemplate deliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
    return this;
  }

   /**
   * Reserved: For DocuSign use only.
   * @return deliveredDateTime
  **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  public String getDeliveredDateTime() {
    return deliveredDateTime;
  }

  public void setDeliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
  }

  public EnvelopeTemplate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EnvelopeTemplate disableResponsiveDocument(String disableResponsiveDocument) {
    this.disableResponsiveDocument = disableResponsiveDocument;
    return this;
  }

   /**
   * 
   * @return disableResponsiveDocument
  **/
  @ApiModelProperty(value = "")
  public String getDisableResponsiveDocument() {
    return disableResponsiveDocument;
  }

  public void setDisableResponsiveDocument(String disableResponsiveDocument) {
    this.disableResponsiveDocument = disableResponsiveDocument;
  }

  public EnvelopeTemplate documents(java.util.List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public EnvelopeTemplate addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new java.util.ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Complex element contains the details on the documents in the envelope.
   * @return documents
  **/
  @ApiModelProperty(value = "Complex element contains the details on the documents in the envelope.")
  public java.util.List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
  }

  public EnvelopeTemplate documentsCombinedUri(String documentsCombinedUri) {
    this.documentsCombinedUri = documentsCombinedUri;
    return this;
  }

   /**
   * 
   * @return documentsCombinedUri
  **/
  @ApiModelProperty(value = "")
  public String getDocumentsCombinedUri() {
    return documentsCombinedUri;
  }

  public void setDocumentsCombinedUri(String documentsCombinedUri) {
    this.documentsCombinedUri = documentsCombinedUri;
  }

  public EnvelopeTemplate documentsUri(String documentsUri) {
    this.documentsUri = documentsUri;
    return this;
  }

   /**
   * Contains a URI for an endpoint that you can use to retrieve the documents.
   * @return documentsUri
  **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the documents.")
  public String getDocumentsUri() {
    return documentsUri;
  }

  public void setDocumentsUri(String documentsUri) {
    this.documentsUri = documentsUri;
  }

  public EnvelopeTemplate emailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
    return this;
  }

   /**
   * 
   * @return emailBlurb
  **/
  @ApiModelProperty(value = "")
  public String getEmailBlurb() {
    return emailBlurb;
  }

  public void setEmailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
  }

  public EnvelopeTemplate emailSettings(EmailSettings emailSettings) {
    this.emailSettings = emailSettings;
    return this;
  }

   /**
   * Get emailSettings
   * @return emailSettings
  **/
  @ApiModelProperty(value = "")
  public EmailSettings getEmailSettings() {
    return emailSettings;
  }

  public void setEmailSettings(EmailSettings emailSettings) {
    this.emailSettings = emailSettings;
  }

  public EnvelopeTemplate emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.
   * @return emailSubject
  **/
  @ApiModelProperty(value = "Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  public String getEmailSubject() {
    return emailSubject;
  }

  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  public EnvelopeTemplate enableWetSign(String enableWetSign) {
    this.enableWetSign = enableWetSign;
    return this;
  }

   /**
   * When set to **true**, the signer is allowed to print the document and sign it on paper.
   * @return enableWetSign
  **/
  @ApiModelProperty(value = "When set to **true**, the signer is allowed to print the document and sign it on paper.")
  public String getEnableWetSign() {
    return enableWetSign;
  }

  public void setEnableWetSign(String enableWetSign) {
    this.enableWetSign = enableWetSign;
  }

  public EnvelopeTemplate enforceSignerVisibility(String enforceSignerVisibility) {
    this.enforceSignerVisibility = enforceSignerVisibility;
    return this;
  }

   /**
   * When set to **true**, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.  Your account must have Document Visibility enabled to use this.
   * @return enforceSignerVisibility
  **/
  @ApiModelProperty(value = "When set to **true**, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.  Your account must have Document Visibility enabled to use this.")
  public String getEnforceSignerVisibility() {
    return enforceSignerVisibility;
  }

  public void setEnforceSignerVisibility(String enforceSignerVisibility) {
    this.enforceSignerVisibility = enforceSignerVisibility;
  }

  public EnvelopeTemplate envelopeAttachments(java.util.List<Attachment> envelopeAttachments) {
    this.envelopeAttachments = envelopeAttachments;
    return this;
  }

  public EnvelopeTemplate addEnvelopeAttachmentsItem(Attachment envelopeAttachmentsItem) {
    if (this.envelopeAttachments == null) {
      this.envelopeAttachments = new java.util.ArrayList<Attachment>();
    }
    this.envelopeAttachments.add(envelopeAttachmentsItem);
    return this;
  }

   /**
   * 
   * @return envelopeAttachments
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Attachment> getEnvelopeAttachments() {
    return envelopeAttachments;
  }

  public void setEnvelopeAttachments(java.util.List<Attachment> envelopeAttachments) {
    this.envelopeAttachments = envelopeAttachments;
  }

  public EnvelopeTemplate envelopeDocuments(java.util.List<EnvelopeDocument> envelopeDocuments) {
    this.envelopeDocuments = envelopeDocuments;
    return this;
  }

  public EnvelopeTemplate addEnvelopeDocumentsItem(EnvelopeDocument envelopeDocumentsItem) {
    if (this.envelopeDocuments == null) {
      this.envelopeDocuments = new java.util.ArrayList<EnvelopeDocument>();
    }
    this.envelopeDocuments.add(envelopeDocumentsItem);
    return this;
  }

   /**
   * 
   * @return envelopeDocuments
  **/
  @ApiModelProperty(value = "")
  public java.util.List<EnvelopeDocument> getEnvelopeDocuments() {
    return envelopeDocuments;
  }

  public void setEnvelopeDocuments(java.util.List<EnvelopeDocument> envelopeDocuments) {
    this.envelopeDocuments = envelopeDocuments;
  }

  public EnvelopeTemplate envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public EnvelopeTemplate envelopeIdStamping(String envelopeIdStamping) {
    this.envelopeIdStamping = envelopeIdStamping;
    return this;
  }

   /**
   * When set to **true**, Envelope ID Stamping is enabled.
   * @return envelopeIdStamping
  **/
  @ApiModelProperty(value = "When set to **true**, Envelope ID Stamping is enabled.")
  public String getEnvelopeIdStamping() {
    return envelopeIdStamping;
  }

  public void setEnvelopeIdStamping(String envelopeIdStamping) {
    this.envelopeIdStamping = envelopeIdStamping;
  }

  public EnvelopeTemplate envelopeLocation(String envelopeLocation) {
    this.envelopeLocation = envelopeLocation;
    return this;
  }

   /**
   * 
   * @return envelopeLocation
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeLocation() {
    return envelopeLocation;
  }

  public void setEnvelopeLocation(String envelopeLocation) {
    this.envelopeLocation = envelopeLocation;
  }

  public EnvelopeTemplate envelopeMetadata(EnvelopeMetadata envelopeMetadata) {
    this.envelopeMetadata = envelopeMetadata;
    return this;
  }

   /**
   * Get envelopeMetadata
   * @return envelopeMetadata
  **/
  @ApiModelProperty(value = "")
  public EnvelopeMetadata getEnvelopeMetadata() {
    return envelopeMetadata;
  }

  public void setEnvelopeMetadata(EnvelopeMetadata envelopeMetadata) {
    this.envelopeMetadata = envelopeMetadata;
  }

  public EnvelopeTemplate envelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
    return this;
  }

   /**
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
   * @return envelopeUri
  **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  public String getEnvelopeUri() {
    return envelopeUri;
  }

  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }

  public EnvelopeTemplate expireAfter(String expireAfter) {
    this.expireAfter = expireAfter;
    return this;
  }

   /**
   * 
   * @return expireAfter
  **/
  @ApiModelProperty(value = "")
  public String getExpireAfter() {
    return expireAfter;
  }

  public void setExpireAfter(String expireAfter) {
    this.expireAfter = expireAfter;
  }

  public EnvelopeTemplate expireDateTime(String expireDateTime) {
    this.expireDateTime = expireDateTime;
    return this;
  }

   /**
   * 
   * @return expireDateTime
  **/
  @ApiModelProperty(value = "")
  public String getExpireDateTime() {
    return expireDateTime;
  }

  public void setExpireDateTime(String expireDateTime) {
    this.expireDateTime = expireDateTime;
  }

  public EnvelopeTemplate expireEnabled(String expireEnabled) {
    this.expireEnabled = expireEnabled;
    return this;
  }

   /**
   * 
   * @return expireEnabled
  **/
  @ApiModelProperty(value = "")
  public String getExpireEnabled() {
    return expireEnabled;
  }

  public void setExpireEnabled(String expireEnabled) {
    this.expireEnabled = expireEnabled;
  }

  public EnvelopeTemplate externalEnvelopeId(String externalEnvelopeId) {
    this.externalEnvelopeId = externalEnvelopeId;
    return this;
  }

   /**
   * 
   * @return externalEnvelopeId
  **/
  @ApiModelProperty(value = "")
  public String getExternalEnvelopeId() {
    return externalEnvelopeId;
  }

  public void setExternalEnvelopeId(String externalEnvelopeId) {
    this.externalEnvelopeId = externalEnvelopeId;
  }

  public EnvelopeTemplate favoritedByMe(String favoritedByMe) {
    this.favoritedByMe = favoritedByMe;
    return this;
  }

   /**
   * 
   * @return favoritedByMe
  **/
  @ApiModelProperty(value = "")
  public String getFavoritedByMe() {
    return favoritedByMe;
  }

  public void setFavoritedByMe(String favoritedByMe) {
    this.favoritedByMe = favoritedByMe;
  }

  public EnvelopeTemplate folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * 
   * @return folderId
  **/
  @ApiModelProperty(value = "")
  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  public EnvelopeTemplate folderIds(java.util.List<String> folderIds) {
    this.folderIds = folderIds;
    return this;
  }

  public EnvelopeTemplate addFolderIdsItem(String folderIdsItem) {
    if (this.folderIds == null) {
      this.folderIds = new java.util.ArrayList<String>();
    }
    this.folderIds.add(folderIdsItem);
    return this;
  }

   /**
   * 
   * @return folderIds
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getFolderIds() {
    return folderIds;
  }

  public void setFolderIds(java.util.List<String> folderIds) {
    this.folderIds = folderIds;
  }

  public EnvelopeTemplate folderName(String folderName) {
    this.folderName = folderName;
    return this;
  }

   /**
   * 
   * @return folderName
  **/
  @ApiModelProperty(value = "")
  public String getFolderName() {
    return folderName;
  }

  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }

  public EnvelopeTemplate folders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }

  public EnvelopeTemplate addFoldersItem(Folder foldersItem) {
    if (this.folders == null) {
      this.folders = new java.util.ArrayList<Folder>();
    }
    this.folders.add(foldersItem);
    return this;
  }

   /**
   * 
   * @return folders
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Folder> getFolders() {
    return folders;
  }

  public void setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
  }

  public EnvelopeTemplate hasComments(String hasComments) {
    this.hasComments = hasComments;
    return this;
  }

   /**
   * 
   * @return hasComments
  **/
  @ApiModelProperty(value = "")
  public String getHasComments() {
    return hasComments;
  }

  public void setHasComments(String hasComments) {
    this.hasComments = hasComments;
  }

  public EnvelopeTemplate hasFormDataChanged(String hasFormDataChanged) {
    this.hasFormDataChanged = hasFormDataChanged;
    return this;
  }

   /**
   * 
   * @return hasFormDataChanged
  **/
  @ApiModelProperty(value = "")
  public String getHasFormDataChanged() {
    return hasFormDataChanged;
  }

  public void setHasFormDataChanged(String hasFormDataChanged) {
    this.hasFormDataChanged = hasFormDataChanged;
  }

  public EnvelopeTemplate hasWavFile(String hasWavFile) {
    this.hasWavFile = hasWavFile;
    return this;
  }

   /**
   * 
   * @return hasWavFile
  **/
  @ApiModelProperty(value = "")
  public String getHasWavFile() {
    return hasWavFile;
  }

  public void setHasWavFile(String hasWavFile) {
    this.hasWavFile = hasWavFile;
  }

  public EnvelopeTemplate holder(String holder) {
    this.holder = holder;
    return this;
  }

   /**
   * 
   * @return holder
  **/
  @ApiModelProperty(value = "")
  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public EnvelopeTemplate initialSentDateTime(String initialSentDateTime) {
    this.initialSentDateTime = initialSentDateTime;
    return this;
  }

   /**
   * 
   * @return initialSentDateTime
  **/
  @ApiModelProperty(value = "")
  public String getInitialSentDateTime() {
    return initialSentDateTime;
  }

  public void setInitialSentDateTime(String initialSentDateTime) {
    this.initialSentDateTime = initialSentDateTime;
  }

  public EnvelopeTemplate is21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
    return this;
  }

   /**
   * When set to **true**, indicates that this module is enabled on the account.
   * @return is21CFRPart11
  **/
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }

  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }

  public EnvelopeTemplate isDynamicEnvelope(String isDynamicEnvelope) {
    this.isDynamicEnvelope = isDynamicEnvelope;
    return this;
  }

   /**
   * 
   * @return isDynamicEnvelope
  **/
  @ApiModelProperty(value = "")
  public String getIsDynamicEnvelope() {
    return isDynamicEnvelope;
  }

  public void setIsDynamicEnvelope(String isDynamicEnvelope) {
    this.isDynamicEnvelope = isDynamicEnvelope;
  }

  public EnvelopeTemplate isSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
    return this;
  }

   /**
   * 
   * @return isSignatureProviderEnvelope
  **/
  @ApiModelProperty(value = "")
  public String getIsSignatureProviderEnvelope() {
    return isSignatureProviderEnvelope;
  }

  public void setIsSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
  }

  public EnvelopeTemplate lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * 
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public EnvelopeTemplate lastModifiedBy(UserInfo lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public UserInfo getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(UserInfo lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public EnvelopeTemplate lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * The date and time the item was last modified.
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "The date and time the item was last modified.")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public EnvelopeTemplate lastUsed(String lastUsed) {
    this.lastUsed = lastUsed;
    return this;
  }

   /**
   * 
   * @return lastUsed
  **/
  @ApiModelProperty(value = "")
  public String getLastUsed() {
    return lastUsed;
  }

  public void setLastUsed(String lastUsed) {
    this.lastUsed = lastUsed;
  }

  public EnvelopeTemplate location(String location) {
    this.location = location;
    return this;
  }

   /**
   * 
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public EnvelopeTemplate lockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
    return this;
  }

   /**
   * Get lockInformation
   * @return lockInformation
  **/
  @ApiModelProperty(value = "")
  public LockInformation getLockInformation() {
    return lockInformation;
  }

  public void setLockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
  }

  public EnvelopeTemplate messageLock(String messageLock) {
    this.messageLock = messageLock;
    return this;
  }

   /**
   * When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope.   Additionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes.   However, if the `messageLock` node is set to true**** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.
   * @return messageLock
  **/
  @ApiModelProperty(value = "When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope.   Additionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes.   However, if the `messageLock` node is set to true**** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.")
  public String getMessageLock() {
    return messageLock;
  }

  public void setMessageLock(String messageLock) {
    this.messageLock = messageLock;
  }

  public EnvelopeTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnvelopeTemplate newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * 
   * @return newPassword
  **/
  @ApiModelProperty(value = "")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public EnvelopeTemplate notification(Notification notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @ApiModelProperty(value = "")
  public Notification getNotification() {
    return notification;
  }

  public void setNotification(Notification notification) {
    this.notification = notification;
  }

  public EnvelopeTemplate notificationUri(String notificationUri) {
    this.notificationUri = notificationUri;
    return this;
  }

   /**
   * Contains a URI for an endpoint that you can use to retrieve the notifications.
   * @return notificationUri
  **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the notifications.")
  public String getNotificationUri() {
    return notificationUri;
  }

  public void setNotificationUri(String notificationUri) {
    this.notificationUri = notificationUri;
  }

  public EnvelopeTemplate owner(UserInfo owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public UserInfo getOwner() {
    return owner;
  }

  public void setOwner(UserInfo owner) {
    this.owner = owner;
  }

  public EnvelopeTemplate pageCount(String pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * 
   * @return pageCount
  **/
  @ApiModelProperty(value = "")
  public String getPageCount() {
    return pageCount;
  }

  public void setPageCount(String pageCount) {
    this.pageCount = pageCount;
  }

  public EnvelopeTemplate password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public EnvelopeTemplate passwordProtected(String passwordProtected) {
    this.passwordProtected = passwordProtected;
    return this;
  }

   /**
   * 
   * @return passwordProtected
  **/
  @ApiModelProperty(value = "")
  public String getPasswordProtected() {
    return passwordProtected;
  }

  public void setPasswordProtected(String passwordProtected) {
    this.passwordProtected = passwordProtected;
  }

  public EnvelopeTemplate powerForm(PowerForm powerForm) {
    this.powerForm = powerForm;
    return this;
  }

   /**
   * Get powerForm
   * @return powerForm
  **/
  @ApiModelProperty(value = "")
  public PowerForm getPowerForm() {
    return powerForm;
  }

  public void setPowerForm(PowerForm powerForm) {
    this.powerForm = powerForm;
  }

  public EnvelopeTemplate powerForms(java.util.List<PowerForm> powerForms) {
    this.powerForms = powerForms;
    return this;
  }

  public EnvelopeTemplate addPowerFormsItem(PowerForm powerFormsItem) {
    if (this.powerForms == null) {
      this.powerForms = new java.util.ArrayList<PowerForm>();
    }
    this.powerForms.add(powerFormsItem);
    return this;
  }

   /**
   * 
   * @return powerForms
  **/
  @ApiModelProperty(value = "")
  public java.util.List<PowerForm> getPowerForms() {
    return powerForms;
  }

  public void setPowerForms(java.util.List<PowerForm> powerForms) {
    this.powerForms = powerForms;
  }

  public EnvelopeTemplate purgeCompletedDate(String purgeCompletedDate) {
    this.purgeCompletedDate = purgeCompletedDate;
    return this;
  }

   /**
   * 
   * @return purgeCompletedDate
  **/
  @ApiModelProperty(value = "")
  public String getPurgeCompletedDate() {
    return purgeCompletedDate;
  }

  public void setPurgeCompletedDate(String purgeCompletedDate) {
    this.purgeCompletedDate = purgeCompletedDate;
  }

  public EnvelopeTemplate purgeRequestDate(String purgeRequestDate) {
    this.purgeRequestDate = purgeRequestDate;
    return this;
  }

   /**
   * 
   * @return purgeRequestDate
  **/
  @ApiModelProperty(value = "")
  public String getPurgeRequestDate() {
    return purgeRequestDate;
  }

  public void setPurgeRequestDate(String purgeRequestDate) {
    this.purgeRequestDate = purgeRequestDate;
  }

  public EnvelopeTemplate purgeState(String purgeState) {
    this.purgeState = purgeState;
    return this;
  }

   /**
   * 
   * @return purgeState
  **/
  @ApiModelProperty(value = "")
  public String getPurgeState() {
    return purgeState;
  }

  public void setPurgeState(String purgeState) {
    this.purgeState = purgeState;
  }

  public EnvelopeTemplate recipients(Recipients recipients) {
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @ApiModelProperty(value = "")
  public Recipients getRecipients() {
    return recipients;
  }

  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }

  public EnvelopeTemplate recipientsLock(String recipientsLock) {
    this.recipientsLock = recipientsLock;
    return this;
  }

   /**
   * When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.
   * @return recipientsLock
  **/
  @ApiModelProperty(value = "When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.")
  public String getRecipientsLock() {
    return recipientsLock;
  }

  public void setRecipientsLock(String recipientsLock) {
    this.recipientsLock = recipientsLock;
  }

  public EnvelopeTemplate recipientsUri(String recipientsUri) {
    this.recipientsUri = recipientsUri;
    return this;
  }

   /**
   * Contains a URI for an endpoint that you can use to retrieve the recipients.
   * @return recipientsUri
  **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the recipients.")
  public String getRecipientsUri() {
    return recipientsUri;
  }

  public void setRecipientsUri(String recipientsUri) {
    this.recipientsUri = recipientsUri;
  }

  public EnvelopeTemplate sender(UserInfo sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")
  public UserInfo getSender() {
    return sender;
  }

  public void setSender(UserInfo sender) {
    this.sender = sender;
  }

  public EnvelopeTemplate sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

   /**
   * The date and time the envelope was sent.
   * @return sentDateTime
  **/
  @ApiModelProperty(value = "The date and time the envelope was sent.")
  public String getSentDateTime() {
    return sentDateTime;
  }

  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }

  public EnvelopeTemplate shared(String shared) {
    this.shared = shared;
    return this;
  }

   /**
   * When set to **true**, this custom tab is shared.
   * @return shared
  **/
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  public void setShared(String shared) {
    this.shared = shared;
  }

  public EnvelopeTemplate signerCanSignOnMobile(String signerCanSignOnMobile) {
    this.signerCanSignOnMobile = signerCanSignOnMobile;
    return this;
  }

   /**
   * 
   * @return signerCanSignOnMobile
  **/
  @ApiModelProperty(value = "")
  public String getSignerCanSignOnMobile() {
    return signerCanSignOnMobile;
  }

  public void setSignerCanSignOnMobile(String signerCanSignOnMobile) {
    this.signerCanSignOnMobile = signerCanSignOnMobile;
  }

  public EnvelopeTemplate signingLocation(String signingLocation) {
    this.signingLocation = signingLocation;
    return this;
  }

   /**
   * Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.
   * @return signingLocation
  **/
  @ApiModelProperty(value = "Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.")
  public String getSigningLocation() {
    return signingLocation;
  }

  public void setSigningLocation(String signingLocation) {
    this.signingLocation = signingLocation;
  }

  public EnvelopeTemplate status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public EnvelopeTemplate statusChangedDateTime(String statusChangedDateTime) {
    this.statusChangedDateTime = statusChangedDateTime;
    return this;
  }

   /**
   * The data and time the status changed.
   * @return statusChangedDateTime
  **/
  @ApiModelProperty(value = "The data and time the status changed.")
  public String getStatusChangedDateTime() {
    return statusChangedDateTime;
  }

  public void setStatusChangedDateTime(String statusChangedDateTime) {
    this.statusChangedDateTime = statusChangedDateTime;
  }

  public EnvelopeTemplate statusDateTime(String statusDateTime) {
    this.statusDateTime = statusDateTime;
    return this;
  }

   /**
   * 
   * @return statusDateTime
  **/
  @ApiModelProperty(value = "")
  public String getStatusDateTime() {
    return statusDateTime;
  }

  public void setStatusDateTime(String statusDateTime) {
    this.statusDateTime = statusDateTime;
  }

  public EnvelopeTemplate templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   * @return templateId
  **/
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public EnvelopeTemplate templatesUri(String templatesUri) {
    this.templatesUri = templatesUri;
    return this;
  }

   /**
   * Contains a URI for an endpoint which you can use to retrieve the templates.
   * @return templatesUri
  **/
  @ApiModelProperty(value = "Contains a URI for an endpoint which you can use to retrieve the templates.")
  public String getTemplatesUri() {
    return templatesUri;
  }

  public void setTemplatesUri(String templatesUri) {
    this.templatesUri = templatesUri;
  }

  public EnvelopeTemplate transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   *  Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
   * @return transactionId
  **/
  @ApiModelProperty(value = " Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public EnvelopeTemplate uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public EnvelopeTemplate useDisclosure(String useDisclosure) {
    this.useDisclosure = useDisclosure;
    return this;
  }

   /**
   * When set to **true**, the disclosure is shown to recipients in accordance with the account's Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients.   If the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information.
   * @return useDisclosure
  **/
  @ApiModelProperty(value = "When set to **true**, the disclosure is shown to recipients in accordance with the account's Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients.   If the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information.")
  public String getUseDisclosure() {
    return useDisclosure;
  }

  public void setUseDisclosure(String useDisclosure) {
    this.useDisclosure = useDisclosure;
  }

  public EnvelopeTemplate voidedDateTime(String voidedDateTime) {
    this.voidedDateTime = voidedDateTime;
    return this;
  }

   /**
   * The date and time the envelope or template was voided.
   * @return voidedDateTime
  **/
  @ApiModelProperty(value = "The date and time the envelope or template was voided.")
  public String getVoidedDateTime() {
    return voidedDateTime;
  }

  public void setVoidedDateTime(String voidedDateTime) {
    this.voidedDateTime = voidedDateTime;
  }

  public EnvelopeTemplate voidedReason(String voidedReason) {
    this.voidedReason = voidedReason;
    return this;
  }

   /**
   * The reason the envelope or template was voided.
   * @return voidedReason
  **/
  @ApiModelProperty(value = "The reason the envelope or template was voided.")
  public String getVoidedReason() {
    return voidedReason;
  }

  public void setVoidedReason(String voidedReason) {
    this.voidedReason = voidedReason;
  }

  public EnvelopeTemplate workflow(Workflow workflow) {
    this.workflow = workflow;
    return this;
  }

   /**
   * Get workflow
   * @return workflow
  **/
  @ApiModelProperty(value = "")
  public Workflow getWorkflow() {
    return workflow;
  }

  public void setWorkflow(Workflow workflow) {
    this.workflow = workflow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeTemplate envelopeTemplate = (EnvelopeTemplate) o;
    return Objects.equals(this.accessControlListBase64, envelopeTemplate.accessControlListBase64) &&
        Objects.equals(this.allowComments, envelopeTemplate.allowComments) &&
        Objects.equals(this.allowMarkup, envelopeTemplate.allowMarkup) &&
        Objects.equals(this.allowReassign, envelopeTemplate.allowReassign) &&
        Objects.equals(this.allowViewHistory, envelopeTemplate.allowViewHistory) &&
        Objects.equals(this.anySigner, envelopeTemplate.anySigner) &&
        Objects.equals(this.asynchronous, envelopeTemplate.asynchronous) &&
        Objects.equals(this.attachmentsUri, envelopeTemplate.attachmentsUri) &&
        Objects.equals(this.authoritativeCopy, envelopeTemplate.authoritativeCopy) &&
        Objects.equals(this.authoritativeCopyDefault, envelopeTemplate.authoritativeCopyDefault) &&
        Objects.equals(this.autoMatch, envelopeTemplate.autoMatch) &&
        Objects.equals(this.autoMatchSpecifiedByUser, envelopeTemplate.autoMatchSpecifiedByUser) &&
        Objects.equals(this.autoNavigation, envelopeTemplate.autoNavigation) &&
        Objects.equals(this.brandId, envelopeTemplate.brandId) &&
        Objects.equals(this.brandLock, envelopeTemplate.brandLock) &&
        Objects.equals(this.certificateUri, envelopeTemplate.certificateUri) &&
        Objects.equals(this.completedDateTime, envelopeTemplate.completedDateTime) &&
        Objects.equals(this.copyRecipientData, envelopeTemplate.copyRecipientData) &&
        Objects.equals(this.created, envelopeTemplate.created) &&
        Objects.equals(this.createdDateTime, envelopeTemplate.createdDateTime) &&
        Objects.equals(this.customFields, envelopeTemplate.customFields) &&
        Objects.equals(this.customFieldsUri, envelopeTemplate.customFieldsUri) &&
        Objects.equals(this.declinedDateTime, envelopeTemplate.declinedDateTime) &&
        Objects.equals(this.deletedDateTime, envelopeTemplate.deletedDateTime) &&
        Objects.equals(this.deliveredDateTime, envelopeTemplate.deliveredDateTime) &&
        Objects.equals(this.description, envelopeTemplate.description) &&
        Objects.equals(this.disableResponsiveDocument, envelopeTemplate.disableResponsiveDocument) &&
        Objects.equals(this.documents, envelopeTemplate.documents) &&
        Objects.equals(this.documentsCombinedUri, envelopeTemplate.documentsCombinedUri) &&
        Objects.equals(this.documentsUri, envelopeTemplate.documentsUri) &&
        Objects.equals(this.emailBlurb, envelopeTemplate.emailBlurb) &&
        Objects.equals(this.emailSettings, envelopeTemplate.emailSettings) &&
        Objects.equals(this.emailSubject, envelopeTemplate.emailSubject) &&
        Objects.equals(this.enableWetSign, envelopeTemplate.enableWetSign) &&
        Objects.equals(this.enforceSignerVisibility, envelopeTemplate.enforceSignerVisibility) &&
        Objects.equals(this.envelopeAttachments, envelopeTemplate.envelopeAttachments) &&
        Objects.equals(this.envelopeDocuments, envelopeTemplate.envelopeDocuments) &&
        Objects.equals(this.envelopeId, envelopeTemplate.envelopeId) &&
        Objects.equals(this.envelopeIdStamping, envelopeTemplate.envelopeIdStamping) &&
        Objects.equals(this.envelopeLocation, envelopeTemplate.envelopeLocation) &&
        Objects.equals(this.envelopeMetadata, envelopeTemplate.envelopeMetadata) &&
        Objects.equals(this.envelopeUri, envelopeTemplate.envelopeUri) &&
        Objects.equals(this.expireAfter, envelopeTemplate.expireAfter) &&
        Objects.equals(this.expireDateTime, envelopeTemplate.expireDateTime) &&
        Objects.equals(this.expireEnabled, envelopeTemplate.expireEnabled) &&
        Objects.equals(this.externalEnvelopeId, envelopeTemplate.externalEnvelopeId) &&
        Objects.equals(this.favoritedByMe, envelopeTemplate.favoritedByMe) &&
        Objects.equals(this.folderId, envelopeTemplate.folderId) &&
        Objects.equals(this.folderIds, envelopeTemplate.folderIds) &&
        Objects.equals(this.folderName, envelopeTemplate.folderName) &&
        Objects.equals(this.folders, envelopeTemplate.folders) &&
        Objects.equals(this.hasComments, envelopeTemplate.hasComments) &&
        Objects.equals(this.hasFormDataChanged, envelopeTemplate.hasFormDataChanged) &&
        Objects.equals(this.hasWavFile, envelopeTemplate.hasWavFile) &&
        Objects.equals(this.holder, envelopeTemplate.holder) &&
        Objects.equals(this.initialSentDateTime, envelopeTemplate.initialSentDateTime) &&
        Objects.equals(this.is21CFRPart11, envelopeTemplate.is21CFRPart11) &&
        Objects.equals(this.isDynamicEnvelope, envelopeTemplate.isDynamicEnvelope) &&
        Objects.equals(this.isSignatureProviderEnvelope, envelopeTemplate.isSignatureProviderEnvelope) &&
        Objects.equals(this.lastModified, envelopeTemplate.lastModified) &&
        Objects.equals(this.lastModifiedBy, envelopeTemplate.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDateTime, envelopeTemplate.lastModifiedDateTime) &&
        Objects.equals(this.lastUsed, envelopeTemplate.lastUsed) &&
        Objects.equals(this.location, envelopeTemplate.location) &&
        Objects.equals(this.lockInformation, envelopeTemplate.lockInformation) &&
        Objects.equals(this.messageLock, envelopeTemplate.messageLock) &&
        Objects.equals(this.name, envelopeTemplate.name) &&
        Objects.equals(this.newPassword, envelopeTemplate.newPassword) &&
        Objects.equals(this.notification, envelopeTemplate.notification) &&
        Objects.equals(this.notificationUri, envelopeTemplate.notificationUri) &&
        Objects.equals(this.owner, envelopeTemplate.owner) &&
        Objects.equals(this.pageCount, envelopeTemplate.pageCount) &&
        Objects.equals(this.password, envelopeTemplate.password) &&
        Objects.equals(this.passwordProtected, envelopeTemplate.passwordProtected) &&
        Objects.equals(this.powerForm, envelopeTemplate.powerForm) &&
        Objects.equals(this.powerForms, envelopeTemplate.powerForms) &&
        Objects.equals(this.purgeCompletedDate, envelopeTemplate.purgeCompletedDate) &&
        Objects.equals(this.purgeRequestDate, envelopeTemplate.purgeRequestDate) &&
        Objects.equals(this.purgeState, envelopeTemplate.purgeState) &&
        Objects.equals(this.recipients, envelopeTemplate.recipients) &&
        Objects.equals(this.recipientsLock, envelopeTemplate.recipientsLock) &&
        Objects.equals(this.recipientsUri, envelopeTemplate.recipientsUri) &&
        Objects.equals(this.sender, envelopeTemplate.sender) &&
        Objects.equals(this.sentDateTime, envelopeTemplate.sentDateTime) &&
        Objects.equals(this.shared, envelopeTemplate.shared) &&
        Objects.equals(this.signerCanSignOnMobile, envelopeTemplate.signerCanSignOnMobile) &&
        Objects.equals(this.signingLocation, envelopeTemplate.signingLocation) &&
        Objects.equals(this.status, envelopeTemplate.status) &&
        Objects.equals(this.statusChangedDateTime, envelopeTemplate.statusChangedDateTime) &&
        Objects.equals(this.statusDateTime, envelopeTemplate.statusDateTime) &&
        Objects.equals(this.templateId, envelopeTemplate.templateId) &&
        Objects.equals(this.templatesUri, envelopeTemplate.templatesUri) &&
        Objects.equals(this.transactionId, envelopeTemplate.transactionId) &&
        Objects.equals(this.uri, envelopeTemplate.uri) &&
        Objects.equals(this.useDisclosure, envelopeTemplate.useDisclosure) &&
        Objects.equals(this.voidedDateTime, envelopeTemplate.voidedDateTime) &&
        Objects.equals(this.voidedReason, envelopeTemplate.voidedReason) &&
        Objects.equals(this.workflow, envelopeTemplate.workflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlListBase64, allowComments, allowMarkup, allowReassign, allowViewHistory, anySigner, asynchronous, attachmentsUri, authoritativeCopy, authoritativeCopyDefault, autoMatch, autoMatchSpecifiedByUser, autoNavigation, brandId, brandLock, certificateUri, completedDateTime, copyRecipientData, created, createdDateTime, customFields, customFieldsUri, declinedDateTime, deletedDateTime, deliveredDateTime, description, disableResponsiveDocument, documents, documentsCombinedUri, documentsUri, emailBlurb, emailSettings, emailSubject, enableWetSign, enforceSignerVisibility, envelopeAttachments, envelopeDocuments, envelopeId, envelopeIdStamping, envelopeLocation, envelopeMetadata, envelopeUri, expireAfter, expireDateTime, expireEnabled, externalEnvelopeId, favoritedByMe, folderId, folderIds, folderName, folders, hasComments, hasFormDataChanged, hasWavFile, holder, initialSentDateTime, is21CFRPart11, isDynamicEnvelope, isSignatureProviderEnvelope, lastModified, lastModifiedBy, lastModifiedDateTime, lastUsed, location, lockInformation, messageLock, name, newPassword, notification, notificationUri, owner, pageCount, password, passwordProtected, powerForm, powerForms, purgeCompletedDate, purgeRequestDate, purgeState, recipients, recipientsLock, recipientsUri, sender, sentDateTime, shared, signerCanSignOnMobile, signingLocation, status, statusChangedDateTime, statusDateTime, templateId, templatesUri, transactionId, uri, useDisclosure, voidedDateTime, voidedReason, workflow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTemplate {\n");
    
    sb.append("    accessControlListBase64: ").append(toIndentedString(accessControlListBase64)).append("\n");
    sb.append("    allowComments: ").append(toIndentedString(allowComments)).append("\n");
    sb.append("    allowMarkup: ").append(toIndentedString(allowMarkup)).append("\n");
    sb.append("    allowReassign: ").append(toIndentedString(allowReassign)).append("\n");
    sb.append("    allowViewHistory: ").append(toIndentedString(allowViewHistory)).append("\n");
    sb.append("    anySigner: ").append(toIndentedString(anySigner)).append("\n");
    sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    sb.append("    attachmentsUri: ").append(toIndentedString(attachmentsUri)).append("\n");
    sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
    sb.append("    authoritativeCopyDefault: ").append(toIndentedString(authoritativeCopyDefault)).append("\n");
    sb.append("    autoMatch: ").append(toIndentedString(autoMatch)).append("\n");
    sb.append("    autoMatchSpecifiedByUser: ").append(toIndentedString(autoMatchSpecifiedByUser)).append("\n");
    sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandLock: ").append(toIndentedString(brandLock)).append("\n");
    sb.append("    certificateUri: ").append(toIndentedString(certificateUri)).append("\n");
    sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
    sb.append("    copyRecipientData: ").append(toIndentedString(copyRecipientData)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    customFieldsUri: ").append(toIndentedString(customFieldsUri)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    deletedDateTime: ").append(toIndentedString(deletedDateTime)).append("\n");
    sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disableResponsiveDocument: ").append(toIndentedString(disableResponsiveDocument)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    documentsCombinedUri: ").append(toIndentedString(documentsCombinedUri)).append("\n");
    sb.append("    documentsUri: ").append(toIndentedString(documentsUri)).append("\n");
    sb.append("    emailBlurb: ").append(toIndentedString(emailBlurb)).append("\n");
    sb.append("    emailSettings: ").append(toIndentedString(emailSettings)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    enableWetSign: ").append(toIndentedString(enableWetSign)).append("\n");
    sb.append("    enforceSignerVisibility: ").append(toIndentedString(enforceSignerVisibility)).append("\n");
    sb.append("    envelopeAttachments: ").append(toIndentedString(envelopeAttachments)).append("\n");
    sb.append("    envelopeDocuments: ").append(toIndentedString(envelopeDocuments)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeIdStamping: ").append(toIndentedString(envelopeIdStamping)).append("\n");
    sb.append("    envelopeLocation: ").append(toIndentedString(envelopeLocation)).append("\n");
    sb.append("    envelopeMetadata: ").append(toIndentedString(envelopeMetadata)).append("\n");
    sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    sb.append("    expireAfter: ").append(toIndentedString(expireAfter)).append("\n");
    sb.append("    expireDateTime: ").append(toIndentedString(expireDateTime)).append("\n");
    sb.append("    expireEnabled: ").append(toIndentedString(expireEnabled)).append("\n");
    sb.append("    externalEnvelopeId: ").append(toIndentedString(externalEnvelopeId)).append("\n");
    sb.append("    favoritedByMe: ").append(toIndentedString(favoritedByMe)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    folderIds: ").append(toIndentedString(folderIds)).append("\n");
    sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    hasComments: ").append(toIndentedString(hasComments)).append("\n");
    sb.append("    hasFormDataChanged: ").append(toIndentedString(hasFormDataChanged)).append("\n");
    sb.append("    hasWavFile: ").append(toIndentedString(hasWavFile)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    initialSentDateTime: ").append(toIndentedString(initialSentDateTime)).append("\n");
    sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    sb.append("    isDynamicEnvelope: ").append(toIndentedString(isDynamicEnvelope)).append("\n");
    sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
    sb.append("    messageLock: ").append(toIndentedString(messageLock)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    notificationUri: ").append(toIndentedString(notificationUri)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordProtected: ").append(toIndentedString(passwordProtected)).append("\n");
    sb.append("    powerForm: ").append(toIndentedString(powerForm)).append("\n");
    sb.append("    powerForms: ").append(toIndentedString(powerForms)).append("\n");
    sb.append("    purgeCompletedDate: ").append(toIndentedString(purgeCompletedDate)).append("\n");
    sb.append("    purgeRequestDate: ").append(toIndentedString(purgeRequestDate)).append("\n");
    sb.append("    purgeState: ").append(toIndentedString(purgeState)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    recipientsLock: ").append(toIndentedString(recipientsLock)).append("\n");
    sb.append("    recipientsUri: ").append(toIndentedString(recipientsUri)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    signerCanSignOnMobile: ").append(toIndentedString(signerCanSignOnMobile)).append("\n");
    sb.append("    signingLocation: ").append(toIndentedString(signingLocation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangedDateTime: ").append(toIndentedString(statusChangedDateTime)).append("\n");
    sb.append("    statusDateTime: ").append(toIndentedString(statusDateTime)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templatesUri: ").append(toIndentedString(templatesUri)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    useDisclosure: ").append(toIndentedString(useDisclosure)).append("\n");
    sb.append("    voidedDateTime: ").append(toIndentedString(voidedDateTime)).append("\n");
    sb.append("    voidedReason: ").append(toIndentedString(voidedReason)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
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

