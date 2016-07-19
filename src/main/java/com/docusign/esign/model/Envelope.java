package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.EmailSettings;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.Notification;
import com.docusign.esign.model.Recipients;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class Envelope   {
  
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
  private CustomFields customFields = null;
  private String autoNavigation = null;
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
  private String initialSentDateTime = null;
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
  private Recipients recipients = null;
  private String brandLock = null;
  private String brandId = null;
  private String useDisclosure = null;
  private EmailSettings emailSettings = null;
  private String purgeState = null;
  private LockInformation lockInformation = null;
  private String is21CFRPart11 = null;
  private String isSignatureProviderEnvelope = null;

  
  /**
   *  Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
   **/
  public Envelope transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n*created - The envelope is saved as a draft and can be modified and sent later.
   **/
  public Envelope status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n*created - The envelope is saved as a draft and can be modified and sent later.")
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
  public Envelope documentsUri(String documentsUri) {
    this.documentsUri = documentsUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint that you can use to retrieve the documents.")
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
  public Envelope recipientsUri(String recipientsUri) {
    this.recipientsUri = recipientsUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint that you can use to retrieve the recipients.")
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
  public Envelope asynchronous(String asynchronous) {
    this.asynchronous = asynchronous;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the envelope is queued for processing and the value of the `status` property is set to 'Processing'. Additionally, get status calls return 'Processing' until completed.")
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
  public Envelope envelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
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
  public Envelope emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  @JsonProperty("emailSubject")
  public String getEmailSubject() {
    return emailSubject;
  }
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  
  /**
   * This is the same as the email body. If specified it is included in email body for all envelope recipients.
   **/
  public Envelope emailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the same as the email body. If specified it is included in email body for all envelope recipients.")
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
  public Envelope envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The envelope ID of the envelope status that failed to post.")
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
  public Envelope signingLocation(String signingLocation) {
    this.signingLocation = signingLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.")
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
  public Envelope customFieldsUri(String customFieldsUri) {
    this.customFieldsUri = customFieldsUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint that you can use to retrieve the custom fields.")
  @JsonProperty("customFieldsUri")
  public String getCustomFieldsUri() {
    return customFieldsUri;
  }
  public void setCustomFieldsUri(String customFieldsUri) {
    this.customFieldsUri = customFieldsUri;
  }

  
  /**
   **/
  public Envelope customFields(CustomFields customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customFields")
  public CustomFields getCustomFields() {
    return customFields;
  }
  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }

  
  /**
   * 
   **/
  public Envelope autoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("autoNavigation")
  public String getAutoNavigation() {
    return autoNavigation;
  }
  public void setAutoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
  }

  
  /**
   * When set to **true**, Envelope ID Stamping is enabled.
   **/
  public Envelope envelopeIdStamping(String envelopeIdStamping) {
    this.envelopeIdStamping = envelopeIdStamping;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, Envelope ID Stamping is enabled.")
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
  public Envelope authoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
  @JsonProperty("authoritativeCopy")
  public String getAuthoritativeCopy() {
    return authoritativeCopy;
  }
  public void setAuthoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
  }

  
  /**
   **/
  public Envelope notification(Notification notification) {
    this.notification = notification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Envelope notificationUri(String notificationUri) {
    this.notificationUri = notificationUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint that you can use to retrieve the notifications.")
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
  public Envelope enforceSignerVisibility(String enforceSignerVisibility) {
    this.enforceSignerVisibility = enforceSignerVisibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.\n\nYour account must have Document Visibility enabled to use this.")
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
  public Envelope enableWetSign(String enableWetSign) {
    this.enableWetSign = enableWetSign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the signer is allowed to print the document and sign it on paper.")
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
  public Envelope allowMarkup(String allowMarkup) {
    this.allowMarkup = allowMarkup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this")
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
  public Envelope allowReassign(String allowReassign) {
    this.allowReassign = allowReassign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the recipient can redirect an envelope to a more appropriate recipient.")
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
  public Envelope createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the date and time the item was created.")
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
  public Envelope lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time the item was last modified.")
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
  public Envelope deliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only.")
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
  public Envelope initialSentDateTime(String initialSentDateTime) {
    this.initialSentDateTime = initialSentDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initialSentDateTime")
  public String getInitialSentDateTime() {
    return initialSentDateTime;
  }
  public void setInitialSentDateTime(String initialSentDateTime) {
    this.initialSentDateTime = initialSentDateTime;
  }

  
  /**
   * The date and time the envelope was sent.
   **/
  public Envelope sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time the envelope was sent.")
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
  public Envelope completedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the date and time this item was completed.")
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
  public Envelope voidedDateTime(String voidedDateTime) {
    this.voidedDateTime = voidedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time the envelope or template was voided.")
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
  public Envelope voidedReason(String voidedReason) {
    this.voidedReason = voidedReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason the envelope or template was voided.")
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
  public Envelope deletedDateTime(String deletedDateTime) {
    this.deletedDateTime = deletedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the data and time the item was deleted.")
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
  public Envelope declinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time the recipient declined the document.")
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
  public Envelope statusChangedDateTime(String statusChangedDateTime) {
    this.statusChangedDateTime = statusChangedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The data and time the status changed.")
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
  public Envelope documentsCombinedUri(String documentsCombinedUri) {
    this.documentsCombinedUri = documentsCombinedUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Envelope certificateUri(String certificateUri) {
    this.certificateUri = certificateUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Retrieves a URI for an endpoint that allows you to easily retrieve certificate information.")
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
  public Envelope templatesUri(String templatesUri) {
    this.templatesUri = templatesUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint which you can use to retrieve the templates.")
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
  public Envelope messageLock(String messageLock) {
    this.messageLock = messageLock;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope. \n\nAdditionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes. \n\nHowever, if the `messageLock` node is set to true**** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.")
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
  public Envelope recipientsLock(String recipientsLock) {
    this.recipientsLock = recipientsLock;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.")
  @JsonProperty("recipientsLock")
  public String getRecipientsLock() {
    return recipientsLock;
  }
  public void setRecipientsLock(String recipientsLock) {
    this.recipientsLock = recipientsLock;
  }

  
  /**
   **/
  public Envelope recipients(Recipients recipients) {
    this.recipients = recipients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipients")
  public Recipients getRecipients() {
    return recipients;
  }
  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }

  
  /**
   * 
   **/
  public Envelope brandLock(String brandLock) {
    this.brandLock = brandLock;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("brandLock")
  public String getBrandLock() {
    return brandLock;
  }
  public void setBrandLock(String brandLock) {
    this.brandLock = brandLock;
  }

  
  /**
   * 
   **/
  public Envelope brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("brandId")
  public String getBrandId() {
    return brandId;
  }
  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  
  /**
   * When set to **true**, the disclosure is shown to recipients in accordance with the account\u2019s Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients. \n\nIf the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information.
   **/
  public Envelope useDisclosure(String useDisclosure) {
    this.useDisclosure = useDisclosure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the disclosure is shown to recipients in accordance with the account\u2019s Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients. \n\nIf the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information.")
  @JsonProperty("useDisclosure")
  public String getUseDisclosure() {
    return useDisclosure;
  }
  public void setUseDisclosure(String useDisclosure) {
    this.useDisclosure = useDisclosure;
  }

  
  /**
   **/
  public Envelope emailSettings(EmailSettings emailSettings) {
    this.emailSettings = emailSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Envelope purgeState(String purgeState) {
    this.purgeState = purgeState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("purgeState")
  public String getPurgeState() {
    return purgeState;
  }
  public void setPurgeState(String purgeState) {
    this.purgeState = purgeState;
  }

  
  /**
   **/
  public Envelope lockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Envelope is21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, indicates that this module is enabled on the account.")
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
  public Envelope isSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isSignatureProviderEnvelope")
  public String getIsSignatureProviderEnvelope() {
    return isSignatureProviderEnvelope;
  }
  public void setIsSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
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
    return Objects.equals(this.transactionId, envelope.transactionId) &&
        Objects.equals(this.status, envelope.status) &&
        Objects.equals(this.documentsUri, envelope.documentsUri) &&
        Objects.equals(this.recipientsUri, envelope.recipientsUri) &&
        Objects.equals(this.asynchronous, envelope.asynchronous) &&
        Objects.equals(this.envelopeUri, envelope.envelopeUri) &&
        Objects.equals(this.emailSubject, envelope.emailSubject) &&
        Objects.equals(this.emailBlurb, envelope.emailBlurb) &&
        Objects.equals(this.envelopeId, envelope.envelopeId) &&
        Objects.equals(this.signingLocation, envelope.signingLocation) &&
        Objects.equals(this.customFieldsUri, envelope.customFieldsUri) &&
        Objects.equals(this.customFields, envelope.customFields) &&
        Objects.equals(this.autoNavigation, envelope.autoNavigation) &&
        Objects.equals(this.envelopeIdStamping, envelope.envelopeIdStamping) &&
        Objects.equals(this.authoritativeCopy, envelope.authoritativeCopy) &&
        Objects.equals(this.notification, envelope.notification) &&
        Objects.equals(this.notificationUri, envelope.notificationUri) &&
        Objects.equals(this.enforceSignerVisibility, envelope.enforceSignerVisibility) &&
        Objects.equals(this.enableWetSign, envelope.enableWetSign) &&
        Objects.equals(this.allowMarkup, envelope.allowMarkup) &&
        Objects.equals(this.allowReassign, envelope.allowReassign) &&
        Objects.equals(this.createdDateTime, envelope.createdDateTime) &&
        Objects.equals(this.lastModifiedDateTime, envelope.lastModifiedDateTime) &&
        Objects.equals(this.deliveredDateTime, envelope.deliveredDateTime) &&
        Objects.equals(this.initialSentDateTime, envelope.initialSentDateTime) &&
        Objects.equals(this.sentDateTime, envelope.sentDateTime) &&
        Objects.equals(this.completedDateTime, envelope.completedDateTime) &&
        Objects.equals(this.voidedDateTime, envelope.voidedDateTime) &&
        Objects.equals(this.voidedReason, envelope.voidedReason) &&
        Objects.equals(this.deletedDateTime, envelope.deletedDateTime) &&
        Objects.equals(this.declinedDateTime, envelope.declinedDateTime) &&
        Objects.equals(this.statusChangedDateTime, envelope.statusChangedDateTime) &&
        Objects.equals(this.documentsCombinedUri, envelope.documentsCombinedUri) &&
        Objects.equals(this.certificateUri, envelope.certificateUri) &&
        Objects.equals(this.templatesUri, envelope.templatesUri) &&
        Objects.equals(this.messageLock, envelope.messageLock) &&
        Objects.equals(this.recipientsLock, envelope.recipientsLock) &&
        Objects.equals(this.recipients, envelope.recipients) &&
        Objects.equals(this.brandLock, envelope.brandLock) &&
        Objects.equals(this.brandId, envelope.brandId) &&
        Objects.equals(this.useDisclosure, envelope.useDisclosure) &&
        Objects.equals(this.emailSettings, envelope.emailSettings) &&
        Objects.equals(this.purgeState, envelope.purgeState) &&
        Objects.equals(this.lockInformation, envelope.lockInformation) &&
        Objects.equals(this.is21CFRPart11, envelope.is21CFRPart11) &&
        Objects.equals(this.isSignatureProviderEnvelope, envelope.isSignatureProviderEnvelope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, status, documentsUri, recipientsUri, asynchronous, envelopeUri, emailSubject, emailBlurb, envelopeId, signingLocation, customFieldsUri, customFields, autoNavigation, envelopeIdStamping, authoritativeCopy, notification, notificationUri, enforceSignerVisibility, enableWetSign, allowMarkup, allowReassign, createdDateTime, lastModifiedDateTime, deliveredDateTime, initialSentDateTime, sentDateTime, completedDateTime, voidedDateTime, voidedReason, deletedDateTime, declinedDateTime, statusChangedDateTime, documentsCombinedUri, certificateUri, templatesUri, messageLock, recipientsLock, recipients, brandLock, brandId, useDisclosure, emailSettings, purgeState, lockInformation, is21CFRPart11, isSignatureProviderEnvelope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Envelope {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    documentsUri: ").append(toIndentedString(documentsUri)).append("\n");
    sb.append("    recipientsUri: ").append(toIndentedString(recipientsUri)).append("\n");
    sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    emailBlurb: ").append(toIndentedString(emailBlurb)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    signingLocation: ").append(toIndentedString(signingLocation)).append("\n");
    sb.append("    customFieldsUri: ").append(toIndentedString(customFieldsUri)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
    sb.append("    envelopeIdStamping: ").append(toIndentedString(envelopeIdStamping)).append("\n");
    sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    notificationUri: ").append(toIndentedString(notificationUri)).append("\n");
    sb.append("    enforceSignerVisibility: ").append(toIndentedString(enforceSignerVisibility)).append("\n");
    sb.append("    enableWetSign: ").append(toIndentedString(enableWetSign)).append("\n");
    sb.append("    allowMarkup: ").append(toIndentedString(allowMarkup)).append("\n");
    sb.append("    allowReassign: ").append(toIndentedString(allowReassign)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    initialSentDateTime: ").append(toIndentedString(initialSentDateTime)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
    sb.append("    voidedDateTime: ").append(toIndentedString(voidedDateTime)).append("\n");
    sb.append("    voidedReason: ").append(toIndentedString(voidedReason)).append("\n");
    sb.append("    deletedDateTime: ").append(toIndentedString(deletedDateTime)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    statusChangedDateTime: ").append(toIndentedString(statusChangedDateTime)).append("\n");
    sb.append("    documentsCombinedUri: ").append(toIndentedString(documentsCombinedUri)).append("\n");
    sb.append("    certificateUri: ").append(toIndentedString(certificateUri)).append("\n");
    sb.append("    templatesUri: ").append(toIndentedString(templatesUri)).append("\n");
    sb.append("    messageLock: ").append(toIndentedString(messageLock)).append("\n");
    sb.append("    recipientsLock: ").append(toIndentedString(recipientsLock)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    brandLock: ").append(toIndentedString(brandLock)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    useDisclosure: ").append(toIndentedString(useDisclosure)).append("\n");
    sb.append("    emailSettings: ").append(toIndentedString(emailSettings)).append("\n");
    sb.append("    purgeState: ").append(toIndentedString(purgeState)).append("\n");
    sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
    sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
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

