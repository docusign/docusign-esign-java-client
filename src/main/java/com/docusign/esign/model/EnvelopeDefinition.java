package com.docusign.esign.model;

import java.util.Objects;
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class EnvelopeDefinition   {
  
  private java.util.List<Document> documents = new java.util.ArrayList<Document>();
  private EventNotification eventNotification = null;
  private String allowRecipientRecursion = null;
  private String templateId = null;
  private String password = null;
  private java.util.List<TemplateRole> templateRoles = new java.util.ArrayList<TemplateRole>();
  private java.util.List<CompositeTemplate> compositeTemplates = new java.util.ArrayList<CompositeTemplate>();
  private String accessibility = null;
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
   * Complex element contains the details on the documents in the envelope.
   **/
  public EnvelopeDefinition documents(java.util.List<Document> documents) {
    this.documents = documents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Complex element contains the details on the documents in the envelope.")
  @JsonProperty("documents")
  public java.util.List<Document> getDocuments() {
    return documents;
  }
  public void setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
  }

  
  /**
   **/
  public EnvelopeDefinition eventNotification(EventNotification eventNotification) {
    this.eventNotification = eventNotification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventNotification")
  public EventNotification getEventNotification() {
    return eventNotification;
  }
  public void setEventNotification(EventNotification eventNotification) {
    this.eventNotification = eventNotification;
  }

  
  /**
   * When set to **true**, this enables the Recursive Recipients feature and allows a recipient to appear more than once in the routing order.
   **/
  public EnvelopeDefinition allowRecipientRecursion(String allowRecipientRecursion) {
    this.allowRecipientRecursion = allowRecipientRecursion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, this enables the Recursive Recipients feature and allows a recipient to appear more than once in the routing order.")
  @JsonProperty("allowRecipientRecursion")
  public String getAllowRecipientRecursion() {
    return allowRecipientRecursion;
  }
  public void setAllowRecipientRecursion(String allowRecipientRecursion) {
    this.allowRecipientRecursion = allowRecipientRecursion;
  }

  
  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   **/
  public EnvelopeDefinition templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
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
  public EnvelopeDefinition password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Specifies the template recipients. Each roleName in the template must have a recipient assigned to it. This is made up elements:\n\n* email - The recipient\u2019s email address.\n* name - The recipient\u2019s name.\n* roleName - The template roleName associated with the recipient.\n* clientUserId - Optional, this sets if the signer is This specifies if the recipient is embedded or remote. If the clientUserId is not null then the recipient is embedded. Note that if a ClientUserId is used and the account settings SignerMustHaveAccount or SignerMustLoginToSign are true, an error is generated on sending.\n* defaultRecipient - Optional, When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient.\n* routingOrder - This specifies the routing order of the recipient in the envelope.\n* accessCode - This optional element specifies the access code a recipient has to enter to validate the identity. This can be a maximum of 50 characters.\n* inPersonSignerName - Optional, if the template role is an in person signer, this is the full legal name of the signer. This can be a maximum of 100 characters.\n* emailNotification - This is an optional complex element that has a role specific emailSubject, emailBody, and language. It follows the same format as the emailNotification node for Recipients.\n* tabs - This allows the tab values to be specified for matching to tabs in the template.\n
   **/
  public EnvelopeDefinition templateRoles(java.util.List<TemplateRole> templateRoles) {
    this.templateRoles = templateRoles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the template recipients. Each roleName in the template must have a recipient assigned to it. This is made up elements:\n\n* email - The recipient\u2019s email address.\n* name - The recipient\u2019s name.\n* roleName - The template roleName associated with the recipient.\n* clientUserId - Optional, this sets if the signer is This specifies if the recipient is embedded or remote. If the clientUserId is not null then the recipient is embedded. Note that if a ClientUserId is used and the account settings SignerMustHaveAccount or SignerMustLoginToSign are true, an error is generated on sending.\n* defaultRecipient - Optional, When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient.\n* routingOrder - This specifies the routing order of the recipient in the envelope.\n* accessCode - This optional element specifies the access code a recipient has to enter to validate the identity. This can be a maximum of 50 characters.\n* inPersonSignerName - Optional, if the template role is an in person signer, this is the full legal name of the signer. This can be a maximum of 100 characters.\n* emailNotification - This is an optional complex element that has a role specific emailSubject, emailBody, and language. It follows the same format as the emailNotification node for Recipients.\n* tabs - This allows the tab values to be specified for matching to tabs in the template.\n")
  @JsonProperty("templateRoles")
  public java.util.List<TemplateRole> getTemplateRoles() {
    return templateRoles;
  }
  public void setTemplateRoles(java.util.List<TemplateRole> templateRoles) {
    this.templateRoles = templateRoles;
  }

  
  /**
   * A complex type that can be added to create envelopes from a combination of DocuSign templates and PDF forms. The basic envelope remains the same, while the Composite Template adds new document and template overlays into the envelope. There can be any number of Composite Template structures in the envelope.
   **/
  public EnvelopeDefinition compositeTemplates(java.util.List<CompositeTemplate> compositeTemplates) {
    this.compositeTemplates = compositeTemplates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A complex type that can be added to create envelopes from a combination of DocuSign templates and PDF forms. The basic envelope remains the same, while the Composite Template adds new document and template overlays into the envelope. There can be any number of Composite Template structures in the envelope.")
  @JsonProperty("compositeTemplates")
  public java.util.List<CompositeTemplate> getCompositeTemplates() {
    return compositeTemplates;
  }
  public void setCompositeTemplates(java.util.List<CompositeTemplate> compositeTemplates) {
    this.compositeTemplates = compositeTemplates;
  }

  
  /**
   * Sets the document reading zones for screen reader applications.  This element can only be used if Document Accessibility is enabled for the account. \n\n###### Note: This information is currently generated from the DocuSign web console by setting the reading zones when creating a template, exporting the reading zone string information, and adding it here.
   **/
  public EnvelopeDefinition accessibility(String accessibility) {
    this.accessibility = accessibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sets the document reading zones for screen reader applications.  This element can only be used if Document Accessibility is enabled for the account. \n\n###### Note: This information is currently generated from the DocuSign web console by setting the reading zones when creating a template, exporting the reading zone string information, and adding it here.")
  @JsonProperty("accessibility")
  public String getAccessibility() {
    return accessibility;
  }
  public void setAccessibility(String accessibility) {
    this.accessibility = accessibility;
  }

  
  /**
   *  Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
   **/
  public EnvelopeDefinition transactionId(String transactionId) {
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
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  public EnvelopeDefinition status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
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
  public EnvelopeDefinition documentsUri(String documentsUri) {
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
  public EnvelopeDefinition recipientsUri(String recipientsUri) {
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
  public EnvelopeDefinition asynchronous(String asynchronous) {
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
  public EnvelopeDefinition envelopeUri(String envelopeUri) {
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
  public EnvelopeDefinition emailSubject(String emailSubject) {
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
   * Optional element. This is the same as the email body. If specified it is included in email body for all envelope recipients. This can be a maximum of 10000 characters
   **/
  public EnvelopeDefinition emailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional element. This is the same as the email body. If specified it is included in email body for all envelope recipients. This can be a maximum of 10000 characters")
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
  public EnvelopeDefinition envelopeId(String envelopeId) {
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
  public EnvelopeDefinition signingLocation(String signingLocation) {
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
  public EnvelopeDefinition customFieldsUri(String customFieldsUri) {
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
  public EnvelopeDefinition customFields(CustomFields customFields) {
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
  public EnvelopeDefinition autoNavigation(String autoNavigation) {
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
  public EnvelopeDefinition envelopeIdStamping(String envelopeIdStamping) {
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
  public EnvelopeDefinition authoritativeCopy(String authoritativeCopy) {
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
  public EnvelopeDefinition notification(Notification notification) {
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
  public EnvelopeDefinition notificationUri(String notificationUri) {
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
  public EnvelopeDefinition enforceSignerVisibility(String enforceSignerVisibility) {
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
  public EnvelopeDefinition enableWetSign(String enableWetSign) {
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
  public EnvelopeDefinition allowMarkup(String allowMarkup) {
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
  public EnvelopeDefinition allowReassign(String allowReassign) {
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
  public EnvelopeDefinition createdDateTime(String createdDateTime) {
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
  public EnvelopeDefinition lastModifiedDateTime(String lastModifiedDateTime) {
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
  public EnvelopeDefinition deliveredDateTime(String deliveredDateTime) {
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
  public EnvelopeDefinition initialSentDateTime(String initialSentDateTime) {
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
  public EnvelopeDefinition sentDateTime(String sentDateTime) {
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
  public EnvelopeDefinition completedDateTime(String completedDateTime) {
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
  public EnvelopeDefinition voidedDateTime(String voidedDateTime) {
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
  public EnvelopeDefinition voidedReason(String voidedReason) {
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
  public EnvelopeDefinition deletedDateTime(String deletedDateTime) {
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
  public EnvelopeDefinition declinedDateTime(String declinedDateTime) {
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
  public EnvelopeDefinition statusChangedDateTime(String statusChangedDateTime) {
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
  public EnvelopeDefinition documentsCombinedUri(String documentsCombinedUri) {
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
  public EnvelopeDefinition certificateUri(String certificateUri) {
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
  public EnvelopeDefinition templatesUri(String templatesUri) {
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
  public EnvelopeDefinition messageLock(String messageLock) {
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
  public EnvelopeDefinition recipientsLock(String recipientsLock) {
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
  public EnvelopeDefinition recipients(Recipients recipients) {
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
  public EnvelopeDefinition brandLock(String brandLock) {
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
   * This sets the brand profile format used for the envelope. The value in the string is the brandId associated with the profile. Account branding must be enabled for the account to use this option.
   **/
  public EnvelopeDefinition brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This sets the brand profile format used for the envelope. The value in the string is the brandId associated with the profile. Account branding must be enabled for the account to use this option.")
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
  public EnvelopeDefinition useDisclosure(String useDisclosure) {
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
  public EnvelopeDefinition emailSettings(EmailSettings emailSettings) {
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
   * Initiates a purge request. Valid values are:\n* documents_queued: Places envelope documents in the purge queue.\n* documents_and_metadata_queued: Places envelope documents and metadata in the purge queue.\n
   **/
  public EnvelopeDefinition purgeState(String purgeState) {
    this.purgeState = purgeState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Initiates a purge request. Valid values are:\n* documents_queued: Places envelope documents in the purge queue.\n* documents_and_metadata_queued: Places envelope documents and metadata in the purge queue.\n")
  @JsonProperty("purgeState")
  public String getPurgeState() {
    return purgeState;
  }
  public void setPurgeState(String purgeState) {
    this.purgeState = purgeState;
  }

  
  /**
   **/
  public EnvelopeDefinition lockInformation(LockInformation lockInformation) {
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
  public EnvelopeDefinition is21CFRPart11(String is21CFRPart11) {
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
  public EnvelopeDefinition isSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
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
    EnvelopeDefinition envelopeDefinition = (EnvelopeDefinition) o;
    return Objects.equals(this.documents, envelopeDefinition.documents) &&
        Objects.equals(this.eventNotification, envelopeDefinition.eventNotification) &&
        Objects.equals(this.allowRecipientRecursion, envelopeDefinition.allowRecipientRecursion) &&
        Objects.equals(this.templateId, envelopeDefinition.templateId) &&
        Objects.equals(this.password, envelopeDefinition.password) &&
        Objects.equals(this.templateRoles, envelopeDefinition.templateRoles) &&
        Objects.equals(this.compositeTemplates, envelopeDefinition.compositeTemplates) &&
        Objects.equals(this.accessibility, envelopeDefinition.accessibility) &&
        Objects.equals(this.transactionId, envelopeDefinition.transactionId) &&
        Objects.equals(this.status, envelopeDefinition.status) &&
        Objects.equals(this.documentsUri, envelopeDefinition.documentsUri) &&
        Objects.equals(this.recipientsUri, envelopeDefinition.recipientsUri) &&
        Objects.equals(this.asynchronous, envelopeDefinition.asynchronous) &&
        Objects.equals(this.envelopeUri, envelopeDefinition.envelopeUri) &&
        Objects.equals(this.emailSubject, envelopeDefinition.emailSubject) &&
        Objects.equals(this.emailBlurb, envelopeDefinition.emailBlurb) &&
        Objects.equals(this.envelopeId, envelopeDefinition.envelopeId) &&
        Objects.equals(this.signingLocation, envelopeDefinition.signingLocation) &&
        Objects.equals(this.customFieldsUri, envelopeDefinition.customFieldsUri) &&
        Objects.equals(this.customFields, envelopeDefinition.customFields) &&
        Objects.equals(this.autoNavigation, envelopeDefinition.autoNavigation) &&
        Objects.equals(this.envelopeIdStamping, envelopeDefinition.envelopeIdStamping) &&
        Objects.equals(this.authoritativeCopy, envelopeDefinition.authoritativeCopy) &&
        Objects.equals(this.notification, envelopeDefinition.notification) &&
        Objects.equals(this.notificationUri, envelopeDefinition.notificationUri) &&
        Objects.equals(this.enforceSignerVisibility, envelopeDefinition.enforceSignerVisibility) &&
        Objects.equals(this.enableWetSign, envelopeDefinition.enableWetSign) &&
        Objects.equals(this.allowMarkup, envelopeDefinition.allowMarkup) &&
        Objects.equals(this.allowReassign, envelopeDefinition.allowReassign) &&
        Objects.equals(this.createdDateTime, envelopeDefinition.createdDateTime) &&
        Objects.equals(this.lastModifiedDateTime, envelopeDefinition.lastModifiedDateTime) &&
        Objects.equals(this.deliveredDateTime, envelopeDefinition.deliveredDateTime) &&
        Objects.equals(this.initialSentDateTime, envelopeDefinition.initialSentDateTime) &&
        Objects.equals(this.sentDateTime, envelopeDefinition.sentDateTime) &&
        Objects.equals(this.completedDateTime, envelopeDefinition.completedDateTime) &&
        Objects.equals(this.voidedDateTime, envelopeDefinition.voidedDateTime) &&
        Objects.equals(this.voidedReason, envelopeDefinition.voidedReason) &&
        Objects.equals(this.deletedDateTime, envelopeDefinition.deletedDateTime) &&
        Objects.equals(this.declinedDateTime, envelopeDefinition.declinedDateTime) &&
        Objects.equals(this.statusChangedDateTime, envelopeDefinition.statusChangedDateTime) &&
        Objects.equals(this.documentsCombinedUri, envelopeDefinition.documentsCombinedUri) &&
        Objects.equals(this.certificateUri, envelopeDefinition.certificateUri) &&
        Objects.equals(this.templatesUri, envelopeDefinition.templatesUri) &&
        Objects.equals(this.messageLock, envelopeDefinition.messageLock) &&
        Objects.equals(this.recipientsLock, envelopeDefinition.recipientsLock) &&
        Objects.equals(this.recipients, envelopeDefinition.recipients) &&
        Objects.equals(this.brandLock, envelopeDefinition.brandLock) &&
        Objects.equals(this.brandId, envelopeDefinition.brandId) &&
        Objects.equals(this.useDisclosure, envelopeDefinition.useDisclosure) &&
        Objects.equals(this.emailSettings, envelopeDefinition.emailSettings) &&
        Objects.equals(this.purgeState, envelopeDefinition.purgeState) &&
        Objects.equals(this.lockInformation, envelopeDefinition.lockInformation) &&
        Objects.equals(this.is21CFRPart11, envelopeDefinition.is21CFRPart11) &&
        Objects.equals(this.isSignatureProviderEnvelope, envelopeDefinition.isSignatureProviderEnvelope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents, eventNotification, allowRecipientRecursion, templateId, password, templateRoles, compositeTemplates, accessibility, transactionId, status, documentsUri, recipientsUri, asynchronous, envelopeUri, emailSubject, emailBlurb, envelopeId, signingLocation, customFieldsUri, customFields, autoNavigation, envelopeIdStamping, authoritativeCopy, notification, notificationUri, enforceSignerVisibility, enableWetSign, allowMarkup, allowReassign, createdDateTime, lastModifiedDateTime, deliveredDateTime, initialSentDateTime, sentDateTime, completedDateTime, voidedDateTime, voidedReason, deletedDateTime, declinedDateTime, statusChangedDateTime, documentsCombinedUri, certificateUri, templatesUri, messageLock, recipientsLock, recipients, brandLock, brandId, useDisclosure, emailSettings, purgeState, lockInformation, is21CFRPart11, isSignatureProviderEnvelope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDefinition {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    eventNotification: ").append(toIndentedString(eventNotification)).append("\n");
    sb.append("    allowRecipientRecursion: ").append(toIndentedString(allowRecipientRecursion)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    templateRoles: ").append(toIndentedString(templateRoles)).append("\n");
    sb.append("    compositeTemplates: ").append(toIndentedString(compositeTemplates)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
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

