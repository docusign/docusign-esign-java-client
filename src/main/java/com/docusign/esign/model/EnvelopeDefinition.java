package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Attachment;
import com.docusign.esign.model.CompositeTemplate;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.EmailSettings;
import com.docusign.esign.model.EventNotification;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.Notification;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.TemplateRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeDefinition.
 *
 */

public class EnvelopeDefinition {
  @JsonProperty("accessibility")
  private String accessibility = null;

  @JsonProperty("allowMarkup")
  private String allowMarkup = null;

  @JsonProperty("allowReassign")
  private String allowReassign = null;

  @JsonProperty("allowRecipientRecursion")
  private String allowRecipientRecursion = null;

  @JsonProperty("allowViewHistory")
  private String allowViewHistory = null;

  @JsonProperty("asynchronous")
  private String asynchronous = null;

  @JsonProperty("attachments")
  private java.util.List<Attachment> attachments = null;

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

  @JsonProperty("compositeTemplates")
  private java.util.List<CompositeTemplate> compositeTemplates = null;

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

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("envelopeIdStamping")
  private String envelopeIdStamping = null;

  @JsonProperty("envelopeUri")
  private String envelopeUri = null;

  @JsonProperty("eventNotification")
  private EventNotification eventNotification = null;

  @JsonProperty("initialSentDateTime")
  private String initialSentDateTime = null;

  @JsonProperty("is21CFRPart11")
  private String is21CFRPart11 = null;

  @JsonProperty("isSignatureProviderEnvelope")
  private String isSignatureProviderEnvelope = null;

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  @JsonProperty("lockInformation")
  private LockInformation lockInformation = null;

  @JsonProperty("messageLock")
  private String messageLock = null;

  @JsonProperty("notification")
  private Notification notification = null;

  @JsonProperty("notificationUri")
  private String notificationUri = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("purgeState")
  private String purgeState = null;

  @JsonProperty("recipients")
  private Recipients recipients = null;

  @JsonProperty("recipientsLock")
  private String recipientsLock = null;

  @JsonProperty("recipientsUri")
  private String recipientsUri = null;

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

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("templateRoles")
  private java.util.List<TemplateRole> templateRoles = null;

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


  /**
   * accessibility.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition accessibility(String accessibility) {
    this.accessibility = accessibility;
    return this;
  }

  /**
   * Sets the document reading zones for screen reader applications.  This element can only be used if Document Accessibility is enabled for the account.   ###### Note: This information is currently generated from the DocuSign web console by setting the reading zones when creating a template, exporting the reading zone string information, and adding it here..
   * @return accessibility
   **/
  @ApiModelProperty(value = "Sets the document reading zones for screen reader applications.  This element can only be used if Document Accessibility is enabled for the account.   ###### Note: This information is currently generated from the DocuSign web console by setting the reading zones when creating a template, exporting the reading zone string information, and adding it here.")
  public String getAccessibility() {
    return accessibility;
  }

  /**
   * setAccessibility.
   **/
  public void setAccessibility(String accessibility) {
    this.accessibility = accessibility;
  }


  /**
   * allowMarkup.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition allowMarkup(String allowMarkup) {
    this.allowMarkup = allowMarkup;
    return this;
  }

  /**
   * When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this.
   * @return allowMarkup
   **/
  @ApiModelProperty(value = "When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this")
  public String getAllowMarkup() {
    return allowMarkup;
  }

  /**
   * setAllowMarkup.
   **/
  public void setAllowMarkup(String allowMarkup) {
    this.allowMarkup = allowMarkup;
  }


  /**
   * allowReassign.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition allowReassign(String allowReassign) {
    this.allowReassign = allowReassign;
    return this;
  }

  /**
   * When set to **true**, the recipient can redirect an envelope to a more appropriate recipient..
   * @return allowReassign
   **/
  @ApiModelProperty(value = "When set to **true**, the recipient can redirect an envelope to a more appropriate recipient.")
  public String getAllowReassign() {
    return allowReassign;
  }

  /**
   * setAllowReassign.
   **/
  public void setAllowReassign(String allowReassign) {
    this.allowReassign = allowReassign;
  }


  /**
   * allowRecipientRecursion.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition allowRecipientRecursion(String allowRecipientRecursion) {
    this.allowRecipientRecursion = allowRecipientRecursion;
    return this;
  }

  /**
   * When set to **true**, this enables the Recursive Recipients feature and allows a recipient to appear more than once in the routing order..
   * @return allowRecipientRecursion
   **/
  @ApiModelProperty(value = "When set to **true**, this enables the Recursive Recipients feature and allows a recipient to appear more than once in the routing order.")
  public String getAllowRecipientRecursion() {
    return allowRecipientRecursion;
  }

  /**
   * setAllowRecipientRecursion.
   **/
  public void setAllowRecipientRecursion(String allowRecipientRecursion) {
    this.allowRecipientRecursion = allowRecipientRecursion;
  }


  /**
   * allowViewHistory.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition allowViewHistory(String allowViewHistory) {
    this.allowViewHistory = allowViewHistory;
    return this;
  }

  /**
   * .
   * @return allowViewHistory
   **/
  @ApiModelProperty(value = "")
  public String getAllowViewHistory() {
    return allowViewHistory;
  }

  /**
   * setAllowViewHistory.
   **/
  public void setAllowViewHistory(String allowViewHistory) {
    this.allowViewHistory = allowViewHistory;
  }


  /**
   * asynchronous.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition asynchronous(String asynchronous) {
    this.asynchronous = asynchronous;
    return this;
  }

  /**
   * When set to **true**, the envelope is queued for processing and the value of the `status` property is set to 'Processing'. Additionally, get status calls return 'Processing' until completed..
   * @return asynchronous
   **/
  @ApiModelProperty(value = "When set to **true**, the envelope is queued for processing and the value of the `status` property is set to 'Processing'. Additionally, get status calls return 'Processing' until completed.")
  public String getAsynchronous() {
    return asynchronous;
  }

  /**
   * setAsynchronous.
   **/
  public void setAsynchronous(String asynchronous) {
    this.asynchronous = asynchronous;
  }


  /**
   * attachments.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition attachments(java.util.List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
  
  /**
   * addAttachmentsItem.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new java.util.ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * .
   * @return attachments
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Attachment> getAttachments() {
    return attachments;
  }

  /**
   * setAttachments.
   **/
  public void setAttachments(java.util.List<Attachment> attachments) {
    this.attachments = attachments;
  }


  /**
   * attachmentsUri.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition attachmentsUri(String attachmentsUri) {
    this.attachmentsUri = attachmentsUri;
    return this;
  }

  /**
   * .
   * @return attachmentsUri
   **/
  @ApiModelProperty(value = "")
  public String getAttachmentsUri() {
    return attachmentsUri;
  }

  /**
   * setAttachmentsUri.
   **/
  public void setAttachmentsUri(String attachmentsUri) {
    this.attachmentsUri = attachmentsUri;
  }


  /**
   * authoritativeCopy.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition authoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
    return this;
  }

  /**
   * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled..
   * @return authoritativeCopy
   **/
  @ApiModelProperty(value = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
  public String getAuthoritativeCopy() {
    return authoritativeCopy;
  }

  /**
   * setAuthoritativeCopy.
   **/
  public void setAuthoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
  }


  /**
   * authoritativeCopyDefault.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition authoritativeCopyDefault(String authoritativeCopyDefault) {
    this.authoritativeCopyDefault = authoritativeCopyDefault;
    return this;
  }

  /**
   * .
   * @return authoritativeCopyDefault
   **/
  @ApiModelProperty(value = "")
  public String getAuthoritativeCopyDefault() {
    return authoritativeCopyDefault;
  }

  /**
   * setAuthoritativeCopyDefault.
   **/
  public void setAuthoritativeCopyDefault(String authoritativeCopyDefault) {
    this.authoritativeCopyDefault = authoritativeCopyDefault;
  }


  /**
   * autoNavigation.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition autoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
    return this;
  }

  /**
   * .
   * @return autoNavigation
   **/
  @ApiModelProperty(value = "")
  public String getAutoNavigation() {
    return autoNavigation;
  }

  /**
   * setAutoNavigation.
   **/
  public void setAutoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
  }


  /**
   * brandId.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * This sets the brand profile format used for the envelope. The value in the string is the brandId associated with the profile. Account branding must be enabled for the account to use this option..
   * @return brandId
   **/
  @ApiModelProperty(value = "This sets the brand profile format used for the envelope. The value in the string is the brandId associated with the profile. Account branding must be enabled for the account to use this option.")
  public String getBrandId() {
    return brandId;
  }

  /**
   * setBrandId.
   **/
  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  /**
   * brandLock.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition brandLock(String brandLock) {
    this.brandLock = brandLock;
    return this;
  }

  /**
   * .
   * @return brandLock
   **/
  @ApiModelProperty(value = "")
  public String getBrandLock() {
    return brandLock;
  }

  /**
   * setBrandLock.
   **/
  public void setBrandLock(String brandLock) {
    this.brandLock = brandLock;
  }


  /**
   * certificateUri.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition certificateUri(String certificateUri) {
    this.certificateUri = certificateUri;
    return this;
  }

  /**
   * Retrieves a URI for an endpoint that allows you to easily retrieve certificate information..
   * @return certificateUri
   **/
  @ApiModelProperty(value = "Retrieves a URI for an endpoint that allows you to easily retrieve certificate information.")
  public String getCertificateUri() {
    return certificateUri;
  }

  /**
   * setCertificateUri.
   **/
  public void setCertificateUri(String certificateUri) {
    this.certificateUri = certificateUri;
  }


  /**
   * completedDateTime.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition completedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
    return this;
  }

  /**
   * Specifies the date and time this item was completed..
   * @return completedDateTime
   **/
  @ApiModelProperty(value = "Specifies the date and time this item was completed.")
  public String getCompletedDateTime() {
    return completedDateTime;
  }

  /**
   * setCompletedDateTime.
   **/
  public void setCompletedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
  }


  /**
   * compositeTemplates.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition compositeTemplates(java.util.List<CompositeTemplate> compositeTemplates) {
    this.compositeTemplates = compositeTemplates;
    return this;
  }
  
  /**
   * addCompositeTemplatesItem.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition addCompositeTemplatesItem(CompositeTemplate compositeTemplatesItem) {
    if (this.compositeTemplates == null) {
      this.compositeTemplates = new java.util.ArrayList<CompositeTemplate>();
    }
    this.compositeTemplates.add(compositeTemplatesItem);
    return this;
  }

  /**
   * A complex type that can be added to create envelopes from a combination of DocuSign templates and PDF forms. The basic envelope remains the same, while the Composite Template adds new document and template overlays into the envelope. There can be any number of Composite Template structures in the envelope..
   * @return compositeTemplates
   **/
  @ApiModelProperty(value = "A complex type that can be added to create envelopes from a combination of DocuSign templates and PDF forms. The basic envelope remains the same, while the Composite Template adds new document and template overlays into the envelope. There can be any number of Composite Template structures in the envelope.")
  public java.util.List<CompositeTemplate> getCompositeTemplates() {
    return compositeTemplates;
  }

  /**
   * setCompositeTemplates.
   **/
  public void setCompositeTemplates(java.util.List<CompositeTemplate> compositeTemplates) {
    this.compositeTemplates = compositeTemplates;
  }


  /**
   * copyRecipientData.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition copyRecipientData(String copyRecipientData) {
    this.copyRecipientData = copyRecipientData;
    return this;
  }

  /**
   * .
   * @return copyRecipientData
   **/
  @ApiModelProperty(value = "")
  public String getCopyRecipientData() {
    return copyRecipientData;
  }

  /**
   * setCopyRecipientData.
   **/
  public void setCopyRecipientData(String copyRecipientData) {
    this.copyRecipientData = copyRecipientData;
  }


  /**
   * createdDateTime.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Indicates the date and time the item was created..
   * @return createdDateTime
   **/
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  /**
   * setCreatedDateTime.
   **/
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  /**
   * customFields.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition customFields(CustomFields customFields) {
    this.customFields = customFields;
    return this;
  }

  /**
   * Get customFields.
   * @return customFields
   **/
  @ApiModelProperty(value = "")
  public CustomFields getCustomFields() {
    return customFields;
  }

  /**
   * setCustomFields.
   **/
  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }


  /**
   * customFieldsUri.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition customFieldsUri(String customFieldsUri) {
    this.customFieldsUri = customFieldsUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that you can use to retrieve the custom fields..
   * @return customFieldsUri
   **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the custom fields.")
  public String getCustomFieldsUri() {
    return customFieldsUri;
  }

  /**
   * setCustomFieldsUri.
   **/
  public void setCustomFieldsUri(String customFieldsUri) {
    this.customFieldsUri = customFieldsUri;
  }


  /**
   * declinedDateTime.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition declinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
    return this;
  }

  /**
   * The date and time the recipient declined the document..
   * @return declinedDateTime
   **/
  @ApiModelProperty(value = "The date and time the recipient declined the document.")
  public String getDeclinedDateTime() {
    return declinedDateTime;
  }

  /**
   * setDeclinedDateTime.
   **/
  public void setDeclinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
  }


  /**
   * deletedDateTime.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition deletedDateTime(String deletedDateTime) {
    this.deletedDateTime = deletedDateTime;
    return this;
  }

  /**
   * Specifies the data and time the item was deleted..
   * @return deletedDateTime
   **/
  @ApiModelProperty(value = "Specifies the data and time the item was deleted.")
  public String getDeletedDateTime() {
    return deletedDateTime;
  }

  /**
   * setDeletedDateTime.
   **/
  public void setDeletedDateTime(String deletedDateTime) {
    this.deletedDateTime = deletedDateTime;
  }


  /**
   * deliveredDateTime.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition deliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
    return this;
  }

  /**
   * Reserved: For DocuSign use only..
   * @return deliveredDateTime
   **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  public String getDeliveredDateTime() {
    return deliveredDateTime;
  }

  /**
   * setDeliveredDateTime.
   **/
  public void setDeliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
  }


  /**
   * disableResponsiveDocument.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition disableResponsiveDocument(String disableResponsiveDocument) {
    this.disableResponsiveDocument = disableResponsiveDocument;
    return this;
  }

  /**
   * .
   * @return disableResponsiveDocument
   **/
  @ApiModelProperty(value = "")
  public String getDisableResponsiveDocument() {
    return disableResponsiveDocument;
  }

  /**
   * setDisableResponsiveDocument.
   **/
  public void setDisableResponsiveDocument(String disableResponsiveDocument) {
    this.disableResponsiveDocument = disableResponsiveDocument;
  }


  /**
   * documents.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition documents(java.util.List<Document> documents) {
    this.documents = documents;
    return this;
  }
  
  /**
   * addDocumentsItem.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new java.util.ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Complex element contains the details on the documents in the envelope..
   * @return documents
   **/
  @ApiModelProperty(value = "Complex element contains the details on the documents in the envelope.")
  public java.util.List<Document> getDocuments() {
    return documents;
  }

  /**
   * setDocuments.
   **/
  public void setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
  }


  /**
   * documentsCombinedUri.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition documentsCombinedUri(String documentsCombinedUri) {
    this.documentsCombinedUri = documentsCombinedUri;
    return this;
  }

  /**
   * .
   * @return documentsCombinedUri
   **/
  @ApiModelProperty(value = "")
  public String getDocumentsCombinedUri() {
    return documentsCombinedUri;
  }

  /**
   * setDocumentsCombinedUri.
   **/
  public void setDocumentsCombinedUri(String documentsCombinedUri) {
    this.documentsCombinedUri = documentsCombinedUri;
  }


  /**
   * documentsUri.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition documentsUri(String documentsUri) {
    this.documentsUri = documentsUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that you can use to retrieve the documents..
   * @return documentsUri
   **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the documents.")
  public String getDocumentsUri() {
    return documentsUri;
  }

  /**
   * setDocumentsUri.
   **/
  public void setDocumentsUri(String documentsUri) {
    this.documentsUri = documentsUri;
  }


  /**
   * emailBlurb.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition emailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
    return this;
  }

  /**
   * Optional element. This is the same as the email body. If specified it is included in email body for all envelope recipients. This can be a maximum of 10000 characters.
   * @return emailBlurb
   **/
  @ApiModelProperty(value = "Optional element. This is the same as the email body. If specified it is included in email body for all envelope recipients. This can be a maximum of 10000 characters")
  public String getEmailBlurb() {
    return emailBlurb;
  }

  /**
   * setEmailBlurb.
   **/
  public void setEmailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
  }


  /**
   * emailSettings.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition emailSettings(EmailSettings emailSettings) {
    this.emailSettings = emailSettings;
    return this;
  }

  /**
   * Get emailSettings.
   * @return emailSettings
   **/
  @ApiModelProperty(value = "")
  public EmailSettings getEmailSettings() {
    return emailSettings;
  }

  /**
   * setEmailSettings.
   **/
  public void setEmailSettings(EmailSettings emailSettings) {
    this.emailSettings = emailSettings;
  }


  /**
   * emailSubject.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

  /**
   * Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject..
   * @return emailSubject
   **/
  @ApiModelProperty(value = "Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  public String getEmailSubject() {
    return emailSubject;
  }

  /**
   * setEmailSubject.
   **/
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }


  /**
   * enableWetSign.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition enableWetSign(String enableWetSign) {
    this.enableWetSign = enableWetSign;
    return this;
  }

  /**
   * When set to **true**, the signer is allowed to print the document and sign it on paper..
   * @return enableWetSign
   **/
  @ApiModelProperty(value = "When set to **true**, the signer is allowed to print the document and sign it on paper.")
  public String getEnableWetSign() {
    return enableWetSign;
  }

  /**
   * setEnableWetSign.
   **/
  public void setEnableWetSign(String enableWetSign) {
    this.enableWetSign = enableWetSign;
  }


  /**
   * enforceSignerVisibility.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition enforceSignerVisibility(String enforceSignerVisibility) {
    this.enforceSignerVisibility = enforceSignerVisibility;
    return this;
  }

  /**
   * When set to **true**, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.  Your account must have Document Visibility enabled to use this..
   * @return enforceSignerVisibility
   **/
  @ApiModelProperty(value = "When set to **true**, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.  Your account must have Document Visibility enabled to use this.")
  public String getEnforceSignerVisibility() {
    return enforceSignerVisibility;
  }

  /**
   * setEnforceSignerVisibility.
   **/
  public void setEnforceSignerVisibility(String enforceSignerVisibility) {
    this.enforceSignerVisibility = enforceSignerVisibility;
  }


  /**
   * envelopeId.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   * @return envelopeId
   **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  /**
   * setEnvelopeId.
   **/
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }


  /**
   * envelopeIdStamping.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition envelopeIdStamping(String envelopeIdStamping) {
    this.envelopeIdStamping = envelopeIdStamping;
    return this;
  }

  /**
   * When set to **true**, Envelope ID Stamping is enabled..
   * @return envelopeIdStamping
   **/
  @ApiModelProperty(value = "When set to **true**, Envelope ID Stamping is enabled.")
  public String getEnvelopeIdStamping() {
    return envelopeIdStamping;
  }

  /**
   * setEnvelopeIdStamping.
   **/
  public void setEnvelopeIdStamping(String envelopeIdStamping) {
    this.envelopeIdStamping = envelopeIdStamping;
  }


  /**
   * envelopeUri.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition envelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes..
   * @return envelopeUri
   **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  public String getEnvelopeUri() {
    return envelopeUri;
  }

  /**
   * setEnvelopeUri.
   **/
  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }


  /**
   * eventNotification.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition eventNotification(EventNotification eventNotification) {
    this.eventNotification = eventNotification;
    return this;
  }

  /**
   * Get eventNotification.
   * @return eventNotification
   **/
  @ApiModelProperty(value = "")
  public EventNotification getEventNotification() {
    return eventNotification;
  }

  /**
   * setEventNotification.
   **/
  public void setEventNotification(EventNotification eventNotification) {
    this.eventNotification = eventNotification;
  }


  /**
   * initialSentDateTime.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition initialSentDateTime(String initialSentDateTime) {
    this.initialSentDateTime = initialSentDateTime;
    return this;
  }

  /**
   * .
   * @return initialSentDateTime
   **/
  @ApiModelProperty(value = "")
  public String getInitialSentDateTime() {
    return initialSentDateTime;
  }

  /**
   * setInitialSentDateTime.
   **/
  public void setInitialSentDateTime(String initialSentDateTime) {
    this.initialSentDateTime = initialSentDateTime;
  }


  /**
   * is21CFRPart11.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition is21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
    return this;
  }

  /**
   * When set to **true**, indicates that this module is enabled on the account..
   * @return is21CFRPart11
   **/
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }

  /**
   * setIs21CFRPart11.
   **/
  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }


  /**
   * isSignatureProviderEnvelope.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition isSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
    return this;
  }

  /**
   * .
   * @return isSignatureProviderEnvelope
   **/
  @ApiModelProperty(value = "")
  public String getIsSignatureProviderEnvelope() {
    return isSignatureProviderEnvelope;
  }

  /**
   * setIsSignatureProviderEnvelope.
   **/
  public void setIsSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
  }


  /**
   * lastModifiedDateTime.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

  /**
   * The date and time the item was last modified..
   * @return lastModifiedDateTime
   **/
  @ApiModelProperty(value = "The date and time the item was last modified.")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  /**
   * setLastModifiedDateTime.
   **/
  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }


  /**
   * lockInformation.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition lockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
    return this;
  }

  /**
   * Get lockInformation.
   * @return lockInformation
   **/
  @ApiModelProperty(value = "")
  public LockInformation getLockInformation() {
    return lockInformation;
  }

  /**
   * setLockInformation.
   **/
  public void setLockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
  }


  /**
   * messageLock.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition messageLock(String messageLock) {
    this.messageLock = messageLock;
    return this;
  }

  /**
   * When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope.   Additionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes.   However, if the `messageLock` node is set to true**** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope..
   * @return messageLock
   **/
  @ApiModelProperty(value = "When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope.   Additionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes.   However, if the `messageLock` node is set to true**** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.")
  public String getMessageLock() {
    return messageLock;
  }

  /**
   * setMessageLock.
   **/
  public void setMessageLock(String messageLock) {
    this.messageLock = messageLock;
  }


  /**
   * notification.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition notification(Notification notification) {
    this.notification = notification;
    return this;
  }

  /**
   * Get notification.
   * @return notification
   **/
  @ApiModelProperty(value = "")
  public Notification getNotification() {
    return notification;
  }

  /**
   * setNotification.
   **/
  public void setNotification(Notification notification) {
    this.notification = notification;
  }


  /**
   * notificationUri.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition notificationUri(String notificationUri) {
    this.notificationUri = notificationUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that you can use to retrieve the notifications..
   * @return notificationUri
   **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the notifications.")
  public String getNotificationUri() {
    return notificationUri;
  }

  /**
   * setNotificationUri.
   **/
  public void setNotificationUri(String notificationUri) {
    this.notificationUri = notificationUri;
  }


  /**
   * password.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition password(String password) {
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
   * purgeState.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition purgeState(String purgeState) {
    this.purgeState = purgeState;
    return this;
  }

  /**
   * Initiates a purge request. Valid values are: * documents_queued: Places envelope documents in the purge queue. * documents_and_metadata_queued: Places envelope documents and metadata in the purge queue. .
   * @return purgeState
   **/
  @ApiModelProperty(value = "Initiates a purge request. Valid values are: * documents_queued: Places envelope documents in the purge queue. * documents_and_metadata_queued: Places envelope documents and metadata in the purge queue. ")
  public String getPurgeState() {
    return purgeState;
  }

  /**
   * setPurgeState.
   **/
  public void setPurgeState(String purgeState) {
    this.purgeState = purgeState;
  }


  /**
   * recipients.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition recipients(Recipients recipients) {
    this.recipients = recipients;
    return this;
  }

  /**
   * Get recipients.
   * @return recipients
   **/
  @ApiModelProperty(value = "")
  public Recipients getRecipients() {
    return recipients;
  }

  /**
   * setRecipients.
   **/
  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }


  /**
   * recipientsLock.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition recipientsLock(String recipientsLock) {
    this.recipientsLock = recipientsLock;
    return this;
  }

  /**
   * When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope..
   * @return recipientsLock
   **/
  @ApiModelProperty(value = "When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.")
  public String getRecipientsLock() {
    return recipientsLock;
  }

  /**
   * setRecipientsLock.
   **/
  public void setRecipientsLock(String recipientsLock) {
    this.recipientsLock = recipientsLock;
  }


  /**
   * recipientsUri.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition recipientsUri(String recipientsUri) {
    this.recipientsUri = recipientsUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that you can use to retrieve the recipients..
   * @return recipientsUri
   **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the recipients.")
  public String getRecipientsUri() {
    return recipientsUri;
  }

  /**
   * setRecipientsUri.
   **/
  public void setRecipientsUri(String recipientsUri) {
    this.recipientsUri = recipientsUri;
  }


  /**
   * sentDateTime.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

  /**
   * The date and time the envelope was sent..
   * @return sentDateTime
   **/
  @ApiModelProperty(value = "The date and time the envelope was sent.")
  public String getSentDateTime() {
    return sentDateTime;
  }

  /**
   * setSentDateTime.
   **/
  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }


  /**
   * signerCanSignOnMobile.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition signerCanSignOnMobile(String signerCanSignOnMobile) {
    this.signerCanSignOnMobile = signerCanSignOnMobile;
    return this;
  }

  /**
   * .
   * @return signerCanSignOnMobile
   **/
  @ApiModelProperty(value = "")
  public String getSignerCanSignOnMobile() {
    return signerCanSignOnMobile;
  }

  /**
   * setSignerCanSignOnMobile.
   **/
  public void setSignerCanSignOnMobile(String signerCanSignOnMobile) {
    this.signerCanSignOnMobile = signerCanSignOnMobile;
  }


  /**
   * signingLocation.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition signingLocation(String signingLocation) {
    this.signingLocation = signingLocation;
    return this;
  }

  /**
   * Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online..
   * @return signingLocation
   **/
  @ApiModelProperty(value = "Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.")
  public String getSigningLocation() {
    return signingLocation;
  }

  /**
   * setSigningLocation.
   **/
  public void setSigningLocation(String signingLocation) {
    this.signingLocation = signingLocation;
  }


  /**
   * status.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * statusChangedDateTime.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition statusChangedDateTime(String statusChangedDateTime) {
    this.statusChangedDateTime = statusChangedDateTime;
    return this;
  }

  /**
   * The data and time the status changed..
   * @return statusChangedDateTime
   **/
  @ApiModelProperty(value = "The data and time the status changed.")
  public String getStatusChangedDateTime() {
    return statusChangedDateTime;
  }

  /**
   * setStatusChangedDateTime.
   **/
  public void setStatusChangedDateTime(String statusChangedDateTime) {
    this.statusChangedDateTime = statusChangedDateTime;
  }


  /**
   * templateId.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. .
   * @return templateId
   **/
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  /**
   * setTemplateId.
   **/
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  /**
   * templateRoles.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition templateRoles(java.util.List<TemplateRole> templateRoles) {
    this.templateRoles = templateRoles;
    return this;
  }
  
  /**
   * addTemplateRolesItem.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition addTemplateRolesItem(TemplateRole templateRolesItem) {
    if (this.templateRoles == null) {
      this.templateRoles = new java.util.ArrayList<TemplateRole>();
    }
    this.templateRoles.add(templateRolesItem);
    return this;
  }

  /**
   * Specifies the template recipients. Each roleName in the template must have a recipient assigned to it. This is made up elements:  * email - The recipient's email address. * name - The recipient's name. * roleName - The template roleName associated with the recipient. * clientUserId - Optional, this sets if the signer is This specifies if the recipient is embedded or remote. If the clientUserId is not null then the recipient is embedded. Note that if a ClientUserId is used and the account settings SignerMustHaveAccount or SignerMustLoginToSign are true, an error is generated on sending. * defaultRecipient - Optional, When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient. * routingOrder - This specifies the routing order of the recipient in the envelope. * accessCode - This optional element specifies the access code a recipient has to enter to validate the identity. This can be a maximum of 50 characters. * inPersonSignerName - Optional, if the template role is an in person signer, this is the full legal name of the signer. This can be a maximum of 100 characters. * emailNotification - This is an optional complex element that has a role specific emailSubject, emailBody, and language. It follows the same format as the emailNotification node for Recipients. * tabs - This allows the tab values to be specified for matching to tabs in the template. .
   * @return templateRoles
   **/
  @ApiModelProperty(value = "Specifies the template recipients. Each roleName in the template must have a recipient assigned to it. This is made up elements:  * email - The recipient's email address. * name - The recipient's name. * roleName - The template roleName associated with the recipient. * clientUserId - Optional, this sets if the signer is This specifies if the recipient is embedded or remote. If the clientUserId is not null then the recipient is embedded. Note that if a ClientUserId is used and the account settings SignerMustHaveAccount or SignerMustLoginToSign are true, an error is generated on sending. * defaultRecipient - Optional, When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient. * routingOrder - This specifies the routing order of the recipient in the envelope. * accessCode - This optional element specifies the access code a recipient has to enter to validate the identity. This can be a maximum of 50 characters. * inPersonSignerName - Optional, if the template role is an in person signer, this is the full legal name of the signer. This can be a maximum of 100 characters. * emailNotification - This is an optional complex element that has a role specific emailSubject, emailBody, and language. It follows the same format as the emailNotification node for Recipients. * tabs - This allows the tab values to be specified for matching to tabs in the template. ")
  public java.util.List<TemplateRole> getTemplateRoles() {
    return templateRoles;
  }

  /**
   * setTemplateRoles.
   **/
  public void setTemplateRoles(java.util.List<TemplateRole> templateRoles) {
    this.templateRoles = templateRoles;
  }


  /**
   * templatesUri.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition templatesUri(String templatesUri) {
    this.templatesUri = templatesUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint which you can use to retrieve the templates..
   * @return templatesUri
   **/
  @ApiModelProperty(value = "Contains a URI for an endpoint which you can use to retrieve the templates.")
  public String getTemplatesUri() {
    return templatesUri;
  }

  /**
   * setTemplatesUri.
   **/
  public void setTemplatesUri(String templatesUri) {
    this.templatesUri = templatesUri;
  }


  /**
   * transactionId.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   *  Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned..
   * @return transactionId
   **/
  @ApiModelProperty(value = " Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
  public String getTransactionId() {
    return transactionId;
  }

  /**
   * setTransactionId.
   **/
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  /**
   * useDisclosure.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition useDisclosure(String useDisclosure) {
    this.useDisclosure = useDisclosure;
    return this;
  }

  /**
   * When set to **true**, the disclosure is shown to recipients in accordance with the account's Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients.   If the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information..
   * @return useDisclosure
   **/
  @ApiModelProperty(value = "When set to **true**, the disclosure is shown to recipients in accordance with the account's Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients.   If the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information.")
  public String getUseDisclosure() {
    return useDisclosure;
  }

  /**
   * setUseDisclosure.
   **/
  public void setUseDisclosure(String useDisclosure) {
    this.useDisclosure = useDisclosure;
  }


  /**
   * voidedDateTime.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition voidedDateTime(String voidedDateTime) {
    this.voidedDateTime = voidedDateTime;
    return this;
  }

  /**
   * The date and time the envelope or template was voided..
   * @return voidedDateTime
   **/
  @ApiModelProperty(value = "The date and time the envelope or template was voided.")
  public String getVoidedDateTime() {
    return voidedDateTime;
  }

  /**
   * setVoidedDateTime.
   **/
  public void setVoidedDateTime(String voidedDateTime) {
    this.voidedDateTime = voidedDateTime;
  }


  /**
   * voidedReason.
   *
   * @return EnvelopeDefinition
   **/
  public EnvelopeDefinition voidedReason(String voidedReason) {
    this.voidedReason = voidedReason;
    return this;
  }

  /**
   * The reason the envelope or template was voided..
   * @return voidedReason
   **/
  @ApiModelProperty(value = "The reason the envelope or template was voided.")
  public String getVoidedReason() {
    return voidedReason;
  }

  /**
   * setVoidedReason.
   **/
  public void setVoidedReason(String voidedReason) {
    this.voidedReason = voidedReason;
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
    EnvelopeDefinition envelopeDefinition = (EnvelopeDefinition) o;
    return Objects.equals(this.accessibility, envelopeDefinition.accessibility) &&
        Objects.equals(this.allowMarkup, envelopeDefinition.allowMarkup) &&
        Objects.equals(this.allowReassign, envelopeDefinition.allowReassign) &&
        Objects.equals(this.allowRecipientRecursion, envelopeDefinition.allowRecipientRecursion) &&
        Objects.equals(this.allowViewHistory, envelopeDefinition.allowViewHistory) &&
        Objects.equals(this.asynchronous, envelopeDefinition.asynchronous) &&
        Objects.equals(this.attachments, envelopeDefinition.attachments) &&
        Objects.equals(this.attachmentsUri, envelopeDefinition.attachmentsUri) &&
        Objects.equals(this.authoritativeCopy, envelopeDefinition.authoritativeCopy) &&
        Objects.equals(this.authoritativeCopyDefault, envelopeDefinition.authoritativeCopyDefault) &&
        Objects.equals(this.autoNavigation, envelopeDefinition.autoNavigation) &&
        Objects.equals(this.brandId, envelopeDefinition.brandId) &&
        Objects.equals(this.brandLock, envelopeDefinition.brandLock) &&
        Objects.equals(this.certificateUri, envelopeDefinition.certificateUri) &&
        Objects.equals(this.completedDateTime, envelopeDefinition.completedDateTime) &&
        Objects.equals(this.compositeTemplates, envelopeDefinition.compositeTemplates) &&
        Objects.equals(this.copyRecipientData, envelopeDefinition.copyRecipientData) &&
        Objects.equals(this.createdDateTime, envelopeDefinition.createdDateTime) &&
        Objects.equals(this.customFields, envelopeDefinition.customFields) &&
        Objects.equals(this.customFieldsUri, envelopeDefinition.customFieldsUri) &&
        Objects.equals(this.declinedDateTime, envelopeDefinition.declinedDateTime) &&
        Objects.equals(this.deletedDateTime, envelopeDefinition.deletedDateTime) &&
        Objects.equals(this.deliveredDateTime, envelopeDefinition.deliveredDateTime) &&
        Objects.equals(this.disableResponsiveDocument, envelopeDefinition.disableResponsiveDocument) &&
        Objects.equals(this.documents, envelopeDefinition.documents) &&
        Objects.equals(this.documentsCombinedUri, envelopeDefinition.documentsCombinedUri) &&
        Objects.equals(this.documentsUri, envelopeDefinition.documentsUri) &&
        Objects.equals(this.emailBlurb, envelopeDefinition.emailBlurb) &&
        Objects.equals(this.emailSettings, envelopeDefinition.emailSettings) &&
        Objects.equals(this.emailSubject, envelopeDefinition.emailSubject) &&
        Objects.equals(this.enableWetSign, envelopeDefinition.enableWetSign) &&
        Objects.equals(this.enforceSignerVisibility, envelopeDefinition.enforceSignerVisibility) &&
        Objects.equals(this.envelopeId, envelopeDefinition.envelopeId) &&
        Objects.equals(this.envelopeIdStamping, envelopeDefinition.envelopeIdStamping) &&
        Objects.equals(this.envelopeUri, envelopeDefinition.envelopeUri) &&
        Objects.equals(this.eventNotification, envelopeDefinition.eventNotification) &&
        Objects.equals(this.initialSentDateTime, envelopeDefinition.initialSentDateTime) &&
        Objects.equals(this.is21CFRPart11, envelopeDefinition.is21CFRPart11) &&
        Objects.equals(this.isSignatureProviderEnvelope, envelopeDefinition.isSignatureProviderEnvelope) &&
        Objects.equals(this.lastModifiedDateTime, envelopeDefinition.lastModifiedDateTime) &&
        Objects.equals(this.lockInformation, envelopeDefinition.lockInformation) &&
        Objects.equals(this.messageLock, envelopeDefinition.messageLock) &&
        Objects.equals(this.notification, envelopeDefinition.notification) &&
        Objects.equals(this.notificationUri, envelopeDefinition.notificationUri) &&
        Objects.equals(this.password, envelopeDefinition.password) &&
        Objects.equals(this.purgeState, envelopeDefinition.purgeState) &&
        Objects.equals(this.recipients, envelopeDefinition.recipients) &&
        Objects.equals(this.recipientsLock, envelopeDefinition.recipientsLock) &&
        Objects.equals(this.recipientsUri, envelopeDefinition.recipientsUri) &&
        Objects.equals(this.sentDateTime, envelopeDefinition.sentDateTime) &&
        Objects.equals(this.signerCanSignOnMobile, envelopeDefinition.signerCanSignOnMobile) &&
        Objects.equals(this.signingLocation, envelopeDefinition.signingLocation) &&
        Objects.equals(this.status, envelopeDefinition.status) &&
        Objects.equals(this.statusChangedDateTime, envelopeDefinition.statusChangedDateTime) &&
        Objects.equals(this.templateId, envelopeDefinition.templateId) &&
        Objects.equals(this.templateRoles, envelopeDefinition.templateRoles) &&
        Objects.equals(this.templatesUri, envelopeDefinition.templatesUri) &&
        Objects.equals(this.transactionId, envelopeDefinition.transactionId) &&
        Objects.equals(this.useDisclosure, envelopeDefinition.useDisclosure) &&
        Objects.equals(this.voidedDateTime, envelopeDefinition.voidedDateTime) &&
        Objects.equals(this.voidedReason, envelopeDefinition.voidedReason);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessibility, allowMarkup, allowReassign, allowRecipientRecursion, allowViewHistory, asynchronous, attachments, attachmentsUri, authoritativeCopy, authoritativeCopyDefault, autoNavigation, brandId, brandLock, certificateUri, completedDateTime, compositeTemplates, copyRecipientData, createdDateTime, customFields, customFieldsUri, declinedDateTime, deletedDateTime, deliveredDateTime, disableResponsiveDocument, documents, documentsCombinedUri, documentsUri, emailBlurb, emailSettings, emailSubject, enableWetSign, enforceSignerVisibility, envelopeId, envelopeIdStamping, envelopeUri, eventNotification, initialSentDateTime, is21CFRPart11, isSignatureProviderEnvelope, lastModifiedDateTime, lockInformation, messageLock, notification, notificationUri, password, purgeState, recipients, recipientsLock, recipientsUri, sentDateTime, signerCanSignOnMobile, signingLocation, status, statusChangedDateTime, templateId, templateRoles, templatesUri, transactionId, useDisclosure, voidedDateTime, voidedReason);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDefinition {\n");
    
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    allowMarkup: ").append(toIndentedString(allowMarkup)).append("\n");
    sb.append("    allowReassign: ").append(toIndentedString(allowReassign)).append("\n");
    sb.append("    allowRecipientRecursion: ").append(toIndentedString(allowRecipientRecursion)).append("\n");
    sb.append("    allowViewHistory: ").append(toIndentedString(allowViewHistory)).append("\n");
    sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    attachmentsUri: ").append(toIndentedString(attachmentsUri)).append("\n");
    sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
    sb.append("    authoritativeCopyDefault: ").append(toIndentedString(authoritativeCopyDefault)).append("\n");
    sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandLock: ").append(toIndentedString(brandLock)).append("\n");
    sb.append("    certificateUri: ").append(toIndentedString(certificateUri)).append("\n");
    sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
    sb.append("    compositeTemplates: ").append(toIndentedString(compositeTemplates)).append("\n");
    sb.append("    copyRecipientData: ").append(toIndentedString(copyRecipientData)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    customFieldsUri: ").append(toIndentedString(customFieldsUri)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    deletedDateTime: ").append(toIndentedString(deletedDateTime)).append("\n");
    sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    disableResponsiveDocument: ").append(toIndentedString(disableResponsiveDocument)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    documentsCombinedUri: ").append(toIndentedString(documentsCombinedUri)).append("\n");
    sb.append("    documentsUri: ").append(toIndentedString(documentsUri)).append("\n");
    sb.append("    emailBlurb: ").append(toIndentedString(emailBlurb)).append("\n");
    sb.append("    emailSettings: ").append(toIndentedString(emailSettings)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    enableWetSign: ").append(toIndentedString(enableWetSign)).append("\n");
    sb.append("    enforceSignerVisibility: ").append(toIndentedString(enforceSignerVisibility)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeIdStamping: ").append(toIndentedString(envelopeIdStamping)).append("\n");
    sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    sb.append("    eventNotification: ").append(toIndentedString(eventNotification)).append("\n");
    sb.append("    initialSentDateTime: ").append(toIndentedString(initialSentDateTime)).append("\n");
    sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
    sb.append("    messageLock: ").append(toIndentedString(messageLock)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    notificationUri: ").append(toIndentedString(notificationUri)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    purgeState: ").append(toIndentedString(purgeState)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    recipientsLock: ").append(toIndentedString(recipientsLock)).append("\n");
    sb.append("    recipientsUri: ").append(toIndentedString(recipientsUri)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    signerCanSignOnMobile: ").append(toIndentedString(signerCanSignOnMobile)).append("\n");
    sb.append("    signingLocation: ").append(toIndentedString(signingLocation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangedDateTime: ").append(toIndentedString(statusChangedDateTime)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateRoles: ").append(toIndentedString(templateRoles)).append("\n");
    sb.append("    templatesUri: ").append(toIndentedString(templatesUri)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    useDisclosure: ").append(toIndentedString(useDisclosure)).append("\n");
    sb.append("    voidedDateTime: ").append(toIndentedString(voidedDateTime)).append("\n");
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

