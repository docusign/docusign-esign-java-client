package com.docusign.esign.model;

import java.util.Objects;
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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EnvelopeDefinition   {
  
  private String accessibility = null;
  private String allowMarkup = null;
  private String allowReassign = null;
  private String allowRecipientRecursion = null;
  private String asynchronous = null;
  private java.util.List<Attachment> attachments = new java.util.ArrayList<Attachment>();
  private String attachmentsUri = null;
  private String authoritativeCopy = null;
  private String autoNavigation = null;
  private String brandId = null;
  private String brandLock = null;
  private String certificateUri = null;
  private String completedDateTime = null;
  private java.util.List<CompositeTemplate> compositeTemplates = new java.util.ArrayList<CompositeTemplate>();
  private String createdDateTime = null;
  private CustomFields customFields = null;
  private String customFieldsUri = null;
  private String declinedDateTime = null;
  private String deletedDateTime = null;
  private String deliveredDateTime = null;
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
  private EventNotification eventNotification = null;
  private String initialSentDateTime = null;
  private String is21CFRPart11 = null;
  private String isSignatureProviderEnvelope = null;
  private String lastModifiedDateTime = null;
  private LockInformation lockInformation = null;
  private String messageLock = null;
  private Notification notification = null;
  private String notificationUri = null;
  private String password = null;
  private String purgeState = null;
  private Recipients recipients = null;
  private String recipientsLock = null;
  private String recipientsUri = null;
  private String sentDateTime = null;
  private String signingLocation = null;
  private String status = null;
  private String statusChangedDateTime = null;
  private String templateId = null;
  private java.util.List<TemplateRole> templateRoles = new java.util.ArrayList<TemplateRole>();
  private String templatesUri = null;
  private String transactionId = null;
  private String useDisclosure = null;
  private String voidedDateTime = null;
  private String voidedReason = null;

  
  /**
   * Sets the document reading zones for screen reader applications.  This element can only be used if Document Accessibility is enabled for the account. \n\n###### Note: This information is currently generated from the DocuSign web console by setting the reading zones when creating a template, exporting the reading zone string information, and adding it here.
   **/
  
  @ApiModelProperty(value = "Sets the document reading zones for screen reader applications.  This element can only be used if Document Accessibility is enabled for the account. \n\n###### Note: This information is currently generated from the DocuSign web console by setting the reading zones when creating a template, exporting the reading zone string information, and adding it here.")
  @JsonProperty("accessibility")
  public String getAccessibility() {
    return accessibility;
  }
  public void setAccessibility(String accessibility) {
    this.accessibility = accessibility;
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
   * When set to **true**, this enables the Recursive Recipients feature and allows a recipient to appear more than once in the routing order.
   **/
  
  @ApiModelProperty(value = "When set to **true**, this enables the Recursive Recipients feature and allows a recipient to appear more than once in the routing order.")
  @JsonProperty("allowRecipientRecursion")
  public String getAllowRecipientRecursion() {
    return allowRecipientRecursion;
  }
  public void setAllowRecipientRecursion(String allowRecipientRecursion) {
    this.allowRecipientRecursion = allowRecipientRecursion;
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
  @JsonProperty("attachments")
  public java.util.List<Attachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(java.util.List<Attachment> attachments) {
    this.attachments = attachments;
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
   * This sets the brand profile format used for the envelope. The value in the string is the brandId associated with the profile. Account branding must be enabled for the account to use this option.
   **/
  
  @ApiModelProperty(value = "This sets the brand profile format used for the envelope. The value in the string is the brandId associated with the profile. Account branding must be enabled for the account to use this option.")
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
   * A complex type that can be added to create envelopes from a combination of DocuSign templates and PDF forms. The basic envelope remains the same, while the Composite Template adds new document and template overlays into the envelope. There can be any number of Composite Template structures in the envelope.
   **/
  
  @ApiModelProperty(value = "A complex type that can be added to create envelopes from a combination of DocuSign templates and PDF forms. The basic envelope remains the same, while the Composite Template adds new document and template overlays into the envelope. There can be any number of Composite Template structures in the envelope.")
  @JsonProperty("compositeTemplates")
  public java.util.List<CompositeTemplate> getCompositeTemplates() {
    return compositeTemplates;
  }
  public void setCompositeTemplates(java.util.List<CompositeTemplate> compositeTemplates) {
    this.compositeTemplates = compositeTemplates;
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
   * Optional element. This is the same as the email body. If specified it is included in email body for all envelope recipients. This can be a maximum of 10000 characters
   **/
  
  @ApiModelProperty(value = "Optional element. This is the same as the email body. If specified it is included in email body for all envelope recipients. This can be a maximum of 10000 characters")
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eventNotification")
  public EventNotification getEventNotification() {
    return eventNotification;
  }
  public void setEventNotification(EventNotification eventNotification) {
    this.eventNotification = eventNotification;
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
   * Initiates a purge request. Valid values are:\n* documents_queued: Places envelope documents in the purge queue.\n* documents_and_metadata_queued: Places envelope documents and metadata in the purge queue.
   **/
  
  @ApiModelProperty(value = "Initiates a purge request. Valid values are:\n* documents_queued: Places envelope documents in the purge queue.\n* documents_and_metadata_queued: Places envelope documents and metadata in the purge queue.")
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
   * Specifies the template recipients. Each roleName in the template must have a recipient assigned to it. This is made up elements:\n\n* email - The recipient’s email address.\n* name - The recipient’s name.\n* roleName - The template roleName associated with the recipient.\n* clientUserId - Optional, this sets if the signer is This specifies if the recipient is embedded or remote. If the clientUserId is not null then the recipient is embedded. Note that if a ClientUserId is used and the account settings SignerMustHaveAccount or SignerMustLoginToSign are true, an error is generated on sending.\n* defaultRecipient - Optional, When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient.\n* routingOrder - This specifies the routing order of the recipient in the envelope.\n* accessCode - This optional element specifies the access code a recipient has to enter to validate the identity. This can be a maximum of 50 characters.\n* inPersonSignerName - Optional, if the template role is an in person signer, this is the full legal name of the signer. This can be a maximum of 100 characters.\n* emailNotification - This is an optional complex element that has a role specific emailSubject, emailBody, and language. It follows the same format as the emailNotification node for Recipients.\n* tabs - This allows the tab values to be specified for matching to tabs in the template.
   **/
  
  @ApiModelProperty(value = "Specifies the template recipients. Each roleName in the template must have a recipient assigned to it. This is made up elements:\n\n* email - The recipient’s email address.\n* name - The recipient’s name.\n* roleName - The template roleName associated with the recipient.\n* clientUserId - Optional, this sets if the signer is This specifies if the recipient is embedded or remote. If the clientUserId is not null then the recipient is embedded. Note that if a ClientUserId is used and the account settings SignerMustHaveAccount or SignerMustLoginToSign are true, an error is generated on sending.\n* defaultRecipient - Optional, When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient.\n* routingOrder - This specifies the routing order of the recipient in the envelope.\n* accessCode - This optional element specifies the access code a recipient has to enter to validate the identity. This can be a maximum of 50 characters.\n* inPersonSignerName - Optional, if the template role is an in person signer, this is the full legal name of the signer. This can be a maximum of 100 characters.\n* emailNotification - This is an optional complex element that has a role specific emailSubject, emailBody, and language. It follows the same format as the emailNotification node for Recipients.\n* tabs - This allows the tab values to be specified for matching to tabs in the template.")
  @JsonProperty("templateRoles")
  public java.util.List<TemplateRole> getTemplateRoles() {
    return templateRoles;
  }
  public void setTemplateRoles(java.util.List<TemplateRole> templateRoles) {
    this.templateRoles = templateRoles;
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
    EnvelopeDefinition envelopeDefinition = (EnvelopeDefinition) o;

    return true && Objects.equals(accessibility, envelopeDefinition.accessibility) &&
        Objects.equals(allowMarkup, envelopeDefinition.allowMarkup) &&
        Objects.equals(allowReassign, envelopeDefinition.allowReassign) &&
        Objects.equals(allowRecipientRecursion, envelopeDefinition.allowRecipientRecursion) &&
        Objects.equals(asynchronous, envelopeDefinition.asynchronous) &&
        Objects.equals(attachments, envelopeDefinition.attachments) &&
        Objects.equals(attachmentsUri, envelopeDefinition.attachmentsUri) &&
        Objects.equals(authoritativeCopy, envelopeDefinition.authoritativeCopy) &&
        Objects.equals(autoNavigation, envelopeDefinition.autoNavigation) &&
        Objects.equals(brandId, envelopeDefinition.brandId) &&
        Objects.equals(brandLock, envelopeDefinition.brandLock) &&
        Objects.equals(certificateUri, envelopeDefinition.certificateUri) &&
        Objects.equals(completedDateTime, envelopeDefinition.completedDateTime) &&
        Objects.equals(compositeTemplates, envelopeDefinition.compositeTemplates) &&
        Objects.equals(createdDateTime, envelopeDefinition.createdDateTime) &&
        Objects.equals(customFields, envelopeDefinition.customFields) &&
        Objects.equals(customFieldsUri, envelopeDefinition.customFieldsUri) &&
        Objects.equals(declinedDateTime, envelopeDefinition.declinedDateTime) &&
        Objects.equals(deletedDateTime, envelopeDefinition.deletedDateTime) &&
        Objects.equals(deliveredDateTime, envelopeDefinition.deliveredDateTime) &&
        Objects.equals(documents, envelopeDefinition.documents) &&
        Objects.equals(documentsCombinedUri, envelopeDefinition.documentsCombinedUri) &&
        Objects.equals(documentsUri, envelopeDefinition.documentsUri) &&
        Objects.equals(emailBlurb, envelopeDefinition.emailBlurb) &&
        Objects.equals(emailSettings, envelopeDefinition.emailSettings) &&
        Objects.equals(emailSubject, envelopeDefinition.emailSubject) &&
        Objects.equals(enableWetSign, envelopeDefinition.enableWetSign) &&
        Objects.equals(enforceSignerVisibility, envelopeDefinition.enforceSignerVisibility) &&
        Objects.equals(envelopeId, envelopeDefinition.envelopeId) &&
        Objects.equals(envelopeIdStamping, envelopeDefinition.envelopeIdStamping) &&
        Objects.equals(envelopeUri, envelopeDefinition.envelopeUri) &&
        Objects.equals(eventNotification, envelopeDefinition.eventNotification) &&
        Objects.equals(initialSentDateTime, envelopeDefinition.initialSentDateTime) &&
        Objects.equals(is21CFRPart11, envelopeDefinition.is21CFRPart11) &&
        Objects.equals(isSignatureProviderEnvelope, envelopeDefinition.isSignatureProviderEnvelope) &&
        Objects.equals(lastModifiedDateTime, envelopeDefinition.lastModifiedDateTime) &&
        Objects.equals(lockInformation, envelopeDefinition.lockInformation) &&
        Objects.equals(messageLock, envelopeDefinition.messageLock) &&
        Objects.equals(notification, envelopeDefinition.notification) &&
        Objects.equals(notificationUri, envelopeDefinition.notificationUri) &&
        Objects.equals(password, envelopeDefinition.password) &&
        Objects.equals(purgeState, envelopeDefinition.purgeState) &&
        Objects.equals(recipients, envelopeDefinition.recipients) &&
        Objects.equals(recipientsLock, envelopeDefinition.recipientsLock) &&
        Objects.equals(recipientsUri, envelopeDefinition.recipientsUri) &&
        Objects.equals(sentDateTime, envelopeDefinition.sentDateTime) &&
        Objects.equals(signingLocation, envelopeDefinition.signingLocation) &&
        Objects.equals(status, envelopeDefinition.status) &&
        Objects.equals(statusChangedDateTime, envelopeDefinition.statusChangedDateTime) &&
        Objects.equals(templateId, envelopeDefinition.templateId) &&
        Objects.equals(templateRoles, envelopeDefinition.templateRoles) &&
        Objects.equals(templatesUri, envelopeDefinition.templatesUri) &&
        Objects.equals(transactionId, envelopeDefinition.transactionId) &&
        Objects.equals(useDisclosure, envelopeDefinition.useDisclosure) &&
        Objects.equals(voidedDateTime, envelopeDefinition.voidedDateTime) &&
        Objects.equals(voidedReason, envelopeDefinition.voidedReason)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibility, allowMarkup, allowReassign, allowRecipientRecursion, asynchronous, attachments, attachmentsUri, authoritativeCopy, autoNavigation, brandId, brandLock, certificateUri, completedDateTime, compositeTemplates, createdDateTime, customFields, customFieldsUri, declinedDateTime, deletedDateTime, deliveredDateTime, documents, documentsCombinedUri, documentsUri, emailBlurb, emailSettings, emailSubject, enableWetSign, enforceSignerVisibility, envelopeId, envelopeIdStamping, envelopeUri, eventNotification, initialSentDateTime, is21CFRPart11, isSignatureProviderEnvelope, lastModifiedDateTime, lockInformation, messageLock, notification, notificationUri, password, purgeState, recipients, recipientsLock, recipientsUri, sentDateTime, signingLocation, status, statusChangedDateTime, templateId, templateRoles, templatesUri, transactionId, useDisclosure, voidedDateTime, voidedReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDefinition {\n");
    
    if (accessibility != null)
      sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    if (allowMarkup != null)
      sb.append("    allowMarkup: ").append(toIndentedString(allowMarkup)).append("\n");
    if (allowReassign != null)
      sb.append("    allowReassign: ").append(toIndentedString(allowReassign)).append("\n");
    if (allowRecipientRecursion != null)
      sb.append("    allowRecipientRecursion: ").append(toIndentedString(allowRecipientRecursion)).append("\n");
    if (asynchronous != null)
      sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    if (attachments != null)
      sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
    if (compositeTemplates != null)
      sb.append("    compositeTemplates: ").append(toIndentedString(compositeTemplates)).append("\n");
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
    if (eventNotification != null)
      sb.append("    eventNotification: ").append(toIndentedString(eventNotification)).append("\n");
    if (initialSentDateTime != null)
      sb.append("    initialSentDateTime: ").append(toIndentedString(initialSentDateTime)).append("\n");
    if (is21CFRPart11 != null)
      sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    if (isSignatureProviderEnvelope != null)
      sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
    if (lastModifiedDateTime != null)
      sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    if (lockInformation != null)
      sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
    if (messageLock != null)
      sb.append("    messageLock: ").append(toIndentedString(messageLock)).append("\n");
    if (notification != null)
      sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    if (notificationUri != null)
      sb.append("    notificationUri: ").append(toIndentedString(notificationUri)).append("\n");
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
    if (signingLocation != null)
      sb.append("    signingLocation: ").append(toIndentedString(signingLocation)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (statusChangedDateTime != null)
      sb.append("    statusChangedDateTime: ").append(toIndentedString(statusChangedDateTime)).append("\n");
    if (templateId != null)
      sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    if (templateRoles != null)
      sb.append("    templateRoles: ").append(toIndentedString(templateRoles)).append("\n");
    if (templatesUri != null)
      sb.append("    templatesUri: ").append(toIndentedString(templatesUri)).append("\n");
    if (transactionId != null)
      sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

