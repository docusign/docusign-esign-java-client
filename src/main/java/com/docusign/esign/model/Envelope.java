package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Attachment;
import com.docusign.esign.model.CustomFields;
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
 * Envelope
 */

public class Envelope {
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

  @JsonProperty("disableResponsiveDocument")
  private String disableResponsiveDocument = null;

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

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("lockInformation")
  private LockInformation lockInformation = null;

  @JsonProperty("messageLock")
  private String messageLock = null;

  @JsonProperty("notification")
  private Notification notification = null;

  @JsonProperty("notificationUri")
  private String notificationUri = null;

  @JsonProperty("powerForm")
  private PowerForm powerForm = null;

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

  @JsonProperty("templatesUri")
  private String templatesUri = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("useDisclosure")
  private String useDisclosure = null;

  @JsonProperty("voidedDateTime")
  private String voidedDateTime = null;

  @JsonProperty("voidedReason")
  private String voidedReason = null;

  @JsonProperty("workflow")
  private Workflow workflow = null;

  public Envelope accessControlListBase64(String accessControlListBase64) {
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

  public Envelope allowComments(String allowComments) {
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

  public Envelope allowMarkup(String allowMarkup) {
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

  public Envelope allowReassign(String allowReassign) {
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

  public Envelope allowViewHistory(String allowViewHistory) {
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

  public Envelope anySigner(String anySigner) {
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

  public Envelope asynchronous(String asynchronous) {
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

  public Envelope attachmentsUri(String attachmentsUri) {
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

  public Envelope authoritativeCopy(String authoritativeCopy) {
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

  public Envelope authoritativeCopyDefault(String authoritativeCopyDefault) {
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

  public Envelope autoNavigation(String autoNavigation) {
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

  public Envelope brandId(String brandId) {
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

  public Envelope brandLock(String brandLock) {
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

  public Envelope certificateUri(String certificateUri) {
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

  public Envelope completedDateTime(String completedDateTime) {
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

  public Envelope copyRecipientData(String copyRecipientData) {
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

  public Envelope createdDateTime(String createdDateTime) {
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

  public Envelope customFields(CustomFields customFields) {
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

  public Envelope customFieldsUri(String customFieldsUri) {
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

  public Envelope declinedDateTime(String declinedDateTime) {
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

  public Envelope deletedDateTime(String deletedDateTime) {
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

  public Envelope deliveredDateTime(String deliveredDateTime) {
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

  public Envelope disableResponsiveDocument(String disableResponsiveDocument) {
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

  public Envelope documentsCombinedUri(String documentsCombinedUri) {
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

  public Envelope documentsUri(String documentsUri) {
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

  public Envelope emailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
    return this;
  }

   /**
   * This is the same as the email body. If specified it is included in email body for all envelope recipients.
   * @return emailBlurb
  **/
  @ApiModelProperty(value = "This is the same as the email body. If specified it is included in email body for all envelope recipients.")
  public String getEmailBlurb() {
    return emailBlurb;
  }

  public void setEmailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
  }

  public Envelope emailSettings(EmailSettings emailSettings) {
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

  public Envelope emailSubject(String emailSubject) {
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

  public Envelope enableWetSign(String enableWetSign) {
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

  public Envelope enforceSignerVisibility(String enforceSignerVisibility) {
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

  public Envelope envelopeAttachments(java.util.List<Attachment> envelopeAttachments) {
    this.envelopeAttachments = envelopeAttachments;
    return this;
  }

  public Envelope addEnvelopeAttachmentsItem(Attachment envelopeAttachmentsItem) {
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

  public Envelope envelopeDocuments(java.util.List<EnvelopeDocument> envelopeDocuments) {
    this.envelopeDocuments = envelopeDocuments;
    return this;
  }

  public Envelope addEnvelopeDocumentsItem(EnvelopeDocument envelopeDocumentsItem) {
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

  public Envelope envelopeId(String envelopeId) {
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

  public Envelope envelopeIdStamping(String envelopeIdStamping) {
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

  public Envelope envelopeLocation(String envelopeLocation) {
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

  public Envelope envelopeMetadata(EnvelopeMetadata envelopeMetadata) {
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

  public Envelope envelopeUri(String envelopeUri) {
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

  public Envelope expireAfter(String expireAfter) {
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

  public Envelope expireDateTime(String expireDateTime) {
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

  public Envelope expireEnabled(String expireEnabled) {
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

  public Envelope externalEnvelopeId(String externalEnvelopeId) {
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

  public Envelope folders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }

  public Envelope addFoldersItem(Folder foldersItem) {
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

  public Envelope hasComments(String hasComments) {
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

  public Envelope hasFormDataChanged(String hasFormDataChanged) {
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

  public Envelope hasWavFile(String hasWavFile) {
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

  public Envelope holder(String holder) {
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

  public Envelope initialSentDateTime(String initialSentDateTime) {
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

  public Envelope is21CFRPart11(String is21CFRPart11) {
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

  public Envelope isDynamicEnvelope(String isDynamicEnvelope) {
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

  public Envelope isSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
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

  public Envelope lastModifiedDateTime(String lastModifiedDateTime) {
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

  public Envelope location(String location) {
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

  public Envelope lockInformation(LockInformation lockInformation) {
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

  public Envelope messageLock(String messageLock) {
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

  public Envelope notification(Notification notification) {
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

  public Envelope notificationUri(String notificationUri) {
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

  public Envelope powerForm(PowerForm powerForm) {
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

  public Envelope purgeCompletedDate(String purgeCompletedDate) {
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

  public Envelope purgeRequestDate(String purgeRequestDate) {
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

  public Envelope purgeState(String purgeState) {
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

  public Envelope recipients(Recipients recipients) {
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

  public Envelope recipientsLock(String recipientsLock) {
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

  public Envelope recipientsUri(String recipientsUri) {
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

  public Envelope sender(UserInfo sender) {
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

  public Envelope sentDateTime(String sentDateTime) {
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

  public Envelope signerCanSignOnMobile(String signerCanSignOnMobile) {
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

  public Envelope signingLocation(String signingLocation) {
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

  public Envelope status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  *created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  *created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Envelope statusChangedDateTime(String statusChangedDateTime) {
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

  public Envelope statusDateTime(String statusDateTime) {
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

  public Envelope templatesUri(String templatesUri) {
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

  public Envelope transactionId(String transactionId) {
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

  public Envelope useDisclosure(String useDisclosure) {
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

  public Envelope voidedDateTime(String voidedDateTime) {
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

  public Envelope voidedReason(String voidedReason) {
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

  public Envelope workflow(Workflow workflow) {
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
    Envelope envelope = (Envelope) o;
    return Objects.equals(this.accessControlListBase64, envelope.accessControlListBase64) &&
        Objects.equals(this.allowComments, envelope.allowComments) &&
        Objects.equals(this.allowMarkup, envelope.allowMarkup) &&
        Objects.equals(this.allowReassign, envelope.allowReassign) &&
        Objects.equals(this.allowViewHistory, envelope.allowViewHistory) &&
        Objects.equals(this.anySigner, envelope.anySigner) &&
        Objects.equals(this.asynchronous, envelope.asynchronous) &&
        Objects.equals(this.attachmentsUri, envelope.attachmentsUri) &&
        Objects.equals(this.authoritativeCopy, envelope.authoritativeCopy) &&
        Objects.equals(this.authoritativeCopyDefault, envelope.authoritativeCopyDefault) &&
        Objects.equals(this.autoNavigation, envelope.autoNavigation) &&
        Objects.equals(this.brandId, envelope.brandId) &&
        Objects.equals(this.brandLock, envelope.brandLock) &&
        Objects.equals(this.certificateUri, envelope.certificateUri) &&
        Objects.equals(this.completedDateTime, envelope.completedDateTime) &&
        Objects.equals(this.copyRecipientData, envelope.copyRecipientData) &&
        Objects.equals(this.createdDateTime, envelope.createdDateTime) &&
        Objects.equals(this.customFields, envelope.customFields) &&
        Objects.equals(this.customFieldsUri, envelope.customFieldsUri) &&
        Objects.equals(this.declinedDateTime, envelope.declinedDateTime) &&
        Objects.equals(this.deletedDateTime, envelope.deletedDateTime) &&
        Objects.equals(this.deliveredDateTime, envelope.deliveredDateTime) &&
        Objects.equals(this.disableResponsiveDocument, envelope.disableResponsiveDocument) &&
        Objects.equals(this.documentsCombinedUri, envelope.documentsCombinedUri) &&
        Objects.equals(this.documentsUri, envelope.documentsUri) &&
        Objects.equals(this.emailBlurb, envelope.emailBlurb) &&
        Objects.equals(this.emailSettings, envelope.emailSettings) &&
        Objects.equals(this.emailSubject, envelope.emailSubject) &&
        Objects.equals(this.enableWetSign, envelope.enableWetSign) &&
        Objects.equals(this.enforceSignerVisibility, envelope.enforceSignerVisibility) &&
        Objects.equals(this.envelopeAttachments, envelope.envelopeAttachments) &&
        Objects.equals(this.envelopeDocuments, envelope.envelopeDocuments) &&
        Objects.equals(this.envelopeId, envelope.envelopeId) &&
        Objects.equals(this.envelopeIdStamping, envelope.envelopeIdStamping) &&
        Objects.equals(this.envelopeLocation, envelope.envelopeLocation) &&
        Objects.equals(this.envelopeMetadata, envelope.envelopeMetadata) &&
        Objects.equals(this.envelopeUri, envelope.envelopeUri) &&
        Objects.equals(this.expireAfter, envelope.expireAfter) &&
        Objects.equals(this.expireDateTime, envelope.expireDateTime) &&
        Objects.equals(this.expireEnabled, envelope.expireEnabled) &&
        Objects.equals(this.externalEnvelopeId, envelope.externalEnvelopeId) &&
        Objects.equals(this.folders, envelope.folders) &&
        Objects.equals(this.hasComments, envelope.hasComments) &&
        Objects.equals(this.hasFormDataChanged, envelope.hasFormDataChanged) &&
        Objects.equals(this.hasWavFile, envelope.hasWavFile) &&
        Objects.equals(this.holder, envelope.holder) &&
        Objects.equals(this.initialSentDateTime, envelope.initialSentDateTime) &&
        Objects.equals(this.is21CFRPart11, envelope.is21CFRPart11) &&
        Objects.equals(this.isDynamicEnvelope, envelope.isDynamicEnvelope) &&
        Objects.equals(this.isSignatureProviderEnvelope, envelope.isSignatureProviderEnvelope) &&
        Objects.equals(this.lastModifiedDateTime, envelope.lastModifiedDateTime) &&
        Objects.equals(this.location, envelope.location) &&
        Objects.equals(this.lockInformation, envelope.lockInformation) &&
        Objects.equals(this.messageLock, envelope.messageLock) &&
        Objects.equals(this.notification, envelope.notification) &&
        Objects.equals(this.notificationUri, envelope.notificationUri) &&
        Objects.equals(this.powerForm, envelope.powerForm) &&
        Objects.equals(this.purgeCompletedDate, envelope.purgeCompletedDate) &&
        Objects.equals(this.purgeRequestDate, envelope.purgeRequestDate) &&
        Objects.equals(this.purgeState, envelope.purgeState) &&
        Objects.equals(this.recipients, envelope.recipients) &&
        Objects.equals(this.recipientsLock, envelope.recipientsLock) &&
        Objects.equals(this.recipientsUri, envelope.recipientsUri) &&
        Objects.equals(this.sender, envelope.sender) &&
        Objects.equals(this.sentDateTime, envelope.sentDateTime) &&
        Objects.equals(this.signerCanSignOnMobile, envelope.signerCanSignOnMobile) &&
        Objects.equals(this.signingLocation, envelope.signingLocation) &&
        Objects.equals(this.status, envelope.status) &&
        Objects.equals(this.statusChangedDateTime, envelope.statusChangedDateTime) &&
        Objects.equals(this.statusDateTime, envelope.statusDateTime) &&
        Objects.equals(this.templatesUri, envelope.templatesUri) &&
        Objects.equals(this.transactionId, envelope.transactionId) &&
        Objects.equals(this.useDisclosure, envelope.useDisclosure) &&
        Objects.equals(this.voidedDateTime, envelope.voidedDateTime) &&
        Objects.equals(this.voidedReason, envelope.voidedReason) &&
        Objects.equals(this.workflow, envelope.workflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlListBase64, allowComments, allowMarkup, allowReassign, allowViewHistory, anySigner, asynchronous, attachmentsUri, authoritativeCopy, authoritativeCopyDefault, autoNavigation, brandId, brandLock, certificateUri, completedDateTime, copyRecipientData, createdDateTime, customFields, customFieldsUri, declinedDateTime, deletedDateTime, deliveredDateTime, disableResponsiveDocument, documentsCombinedUri, documentsUri, emailBlurb, emailSettings, emailSubject, enableWetSign, enforceSignerVisibility, envelopeAttachments, envelopeDocuments, envelopeId, envelopeIdStamping, envelopeLocation, envelopeMetadata, envelopeUri, expireAfter, expireDateTime, expireEnabled, externalEnvelopeId, folders, hasComments, hasFormDataChanged, hasWavFile, holder, initialSentDateTime, is21CFRPart11, isDynamicEnvelope, isSignatureProviderEnvelope, lastModifiedDateTime, location, lockInformation, messageLock, notification, notificationUri, powerForm, purgeCompletedDate, purgeRequestDate, purgeState, recipients, recipientsLock, recipientsUri, sender, sentDateTime, signerCanSignOnMobile, signingLocation, status, statusChangedDateTime, statusDateTime, templatesUri, transactionId, useDisclosure, voidedDateTime, voidedReason, workflow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Envelope {\n");
    
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
    sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandLock: ").append(toIndentedString(brandLock)).append("\n");
    sb.append("    certificateUri: ").append(toIndentedString(certificateUri)).append("\n");
    sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
    sb.append("    copyRecipientData: ").append(toIndentedString(copyRecipientData)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    customFieldsUri: ").append(toIndentedString(customFieldsUri)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    deletedDateTime: ").append(toIndentedString(deletedDateTime)).append("\n");
    sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    disableResponsiveDocument: ").append(toIndentedString(disableResponsiveDocument)).append("\n");
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
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    hasComments: ").append(toIndentedString(hasComments)).append("\n");
    sb.append("    hasFormDataChanged: ").append(toIndentedString(hasFormDataChanged)).append("\n");
    sb.append("    hasWavFile: ").append(toIndentedString(hasWavFile)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    initialSentDateTime: ").append(toIndentedString(initialSentDateTime)).append("\n");
    sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    sb.append("    isDynamicEnvelope: ").append(toIndentedString(isDynamicEnvelope)).append("\n");
    sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
    sb.append("    messageLock: ").append(toIndentedString(messageLock)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    notificationUri: ").append(toIndentedString(notificationUri)).append("\n");
    sb.append("    powerForm: ").append(toIndentedString(powerForm)).append("\n");
    sb.append("    purgeCompletedDate: ").append(toIndentedString(purgeCompletedDate)).append("\n");
    sb.append("    purgeRequestDate: ").append(toIndentedString(purgeRequestDate)).append("\n");
    sb.append("    purgeState: ").append(toIndentedString(purgeState)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    recipientsLock: ").append(toIndentedString(recipientsLock)).append("\n");
    sb.append("    recipientsUri: ").append(toIndentedString(recipientsUri)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    signerCanSignOnMobile: ").append(toIndentedString(signerCanSignOnMobile)).append("\n");
    sb.append("    signingLocation: ").append(toIndentedString(signingLocation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangedDateTime: ").append(toIndentedString(statusChangedDateTime)).append("\n");
    sb.append("    statusDateTime: ").append(toIndentedString(statusDateTime)).append("\n");
    sb.append("    templatesUri: ").append(toIndentedString(templatesUri)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

