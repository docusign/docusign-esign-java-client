package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.DocumentVisibility;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.OfflineAttributes;
import com.docusign.esign.model.RecipientAttachment;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.RecipientSAMLAuthentication;
import com.docusign.esign.model.RecipientSMSAuthentication;
import com.docusign.esign.model.RecipientSignatureInformation;
import com.docusign.esign.model.RecipientSignatureProvider;
import com.docusign.esign.model.SocialAuthentication;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Signer   {
  
  private String accessCode = null;
  private String addAccessCodeToEmail = null;
  private String autoNavigation = null;
  private String bulkRecipientsUri = null;
  private String canSignOffline = null;
  private String clientUserId = null;
  private String creationReason = null;
  private java.util.List<String> customFields = new java.util.ArrayList<String>();
  private String declinedDateTime = null;
  private String declinedReason = null;
  private String defaultRecipient = null;
  private String deliveredDateTime = null;
  private String deliveryMethod = null;
  private java.util.List<DocumentVisibility> documentVisibility = new java.util.ArrayList<DocumentVisibility>();
  private String email = null;
  private RecipientEmailNotification emailNotification = null;
  private String emailRecipientPostSigningURL = null;
  private String embeddedRecipientStartURL = null;
  private ErrorDetails errorDetails = null;
  private java.util.List<String> excludedDocuments = new java.util.ArrayList<String>();
  private String faxNumber = null;
  private String idCheckConfigurationName = null;
  private IdCheckInformationInput idCheckInformationInput = null;
  private String inheritEmailNotificationConfiguration = null;
  private String isBulkRecipient = null;
  private String name = null;
  private String note = null;
  private OfflineAttributes offlineAttributes = null;
  private RecipientPhoneAuthentication phoneAuthentication = null;
  private java.util.List<RecipientAttachment> recipientAttachments = new java.util.ArrayList<RecipientAttachment>();
  private AuthenticationStatus recipientAuthenticationStatus = null;
  private String recipientId = null;
  private String recipientIdGuid = null;
  private java.util.List<RecipientSignatureProvider> recipientSignatureProviders = new java.util.ArrayList<RecipientSignatureProvider>();
  private String recipientSuppliesTabs = null;
  private String requireIdLookup = null;
  private String requireSignerCertificate = null;
  private String requireSignOnPaper = null;
  private String roleName = null;
  private String routingOrder = null;
  private RecipientSAMLAuthentication samlAuthentication = null;
  private String sentDateTime = null;
  private RecipientSignatureInformation signatureInfo = null;
  private String signedDateTime = null;
  private String signInEachLocation = null;
  private String signingGroupId = null;
  private String signingGroupName = null;
  private java.util.List<UserInfo> signingGroupUsers = new java.util.ArrayList<UserInfo>();
  private RecipientSMSAuthentication smsAuthentication = null;
  private java.util.List<SocialAuthentication> socialAuthentications = new java.util.ArrayList<SocialAuthentication>();
  private String status = null;
  private Tabs tabs = null;
  private String templateLocked = null;
  private String templateRequired = null;
  private String totalTabCount = null;
  private String userId = null;

  
  /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account’s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.
   **/
  
  @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account’s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.")
  @JsonProperty("accessCode")
  public String getAccessCode() {
    return accessCode;
  }
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  
  /**
   * This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.
   **/
  
  @ApiModelProperty(value = "This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.")
  @JsonProperty("addAccessCodeToEmail")
  public String getAddAccessCodeToEmail() {
    return addAccessCodeToEmail;
  }
  public void setAddAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
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
   * Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information.")
  @JsonProperty("bulkRecipientsUri")
  public String getBulkRecipientsUri() {
    return bulkRecipientsUri;
  }
  public void setBulkRecipientsUri(String bulkRecipientsUri) {
    this.bulkRecipientsUri = bulkRecipientsUri;
  }

  
  /**
   * When set to **true**, specifies that the signer can perform the signing ceremony offline.
   **/
  
  @ApiModelProperty(value = "When set to **true**, specifies that the signer can perform the signing ceremony offline.")
  @JsonProperty("canSignOffline")
  public String getCanSignOffline() {
    return canSignOffline;
  }
  public void setCanSignOffline(String canSignOffline) {
    this.canSignOffline = canSignOffline;
  }

  
  /**
   * Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters.
   **/
  
  @ApiModelProperty(value = "Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters.")
  @JsonProperty("clientUserId")
  public String getClientUserId() {
    return clientUserId;
  }
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creationReason")
  public String getCreationReason() {
    return creationReason;
  }
  public void setCreationReason(String creationReason) {
    this.creationReason = creationReason;
  }

  
  /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
   **/
  
  @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  @JsonProperty("customFields")
  public java.util.List<String> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(java.util.List<String> customFields) {
    this.customFields = customFields;
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
   * The reason the recipient declined the document.
   **/
  
  @ApiModelProperty(value = "The reason the recipient declined the document.")
  @JsonProperty("declinedReason")
  public String getDeclinedReason() {
    return declinedReason;
  }
  public void setDeclinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultRecipient")
  public String getDefaultRecipient() {
    return defaultRecipient;
  }
  public void setDefaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
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
   * Reserved: For DocuSign use only.
   **/
  
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  @JsonProperty("deliveryMethod")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }
  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documentVisibility")
  public java.util.List<DocumentVisibility> getDocumentVisibility() {
    return documentVisibility;
  }
  public void setDocumentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
  }

  
  /**
   * Email id of the recipient. Notification of the document to sign is sent to this email id. \n\nMaximum length: 100 characters.
   **/
  
  @ApiModelProperty(value = "Email id of the recipient. Notification of the document to sign is sent to this email id. \n\nMaximum length: 100 characters.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailNotification")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }
  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailRecipientPostSigningURL")
  public String getEmailRecipientPostSigningURL() {
    return emailRecipientPostSigningURL;
  }
  public void setEmailRecipientPostSigningURL(String emailRecipientPostSigningURL) {
    this.emailRecipientPostSigningURL = emailRecipientPostSigningURL;
  }

  
  /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender’s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient’s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]`
   **/
  
  @ApiModelProperty(value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender’s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient’s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]`")
  @JsonProperty("embeddedRecipientStartURL")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }
  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.\n\nWhen enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.
   **/
  
  @ApiModelProperty(value = "Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.\n\nWhen enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.")
  @JsonProperty("excludedDocuments")
  public java.util.List<String> getExcludedDocuments() {
    return excludedDocuments;
  }
  public void setExcludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
  }

  
  /**
   * Reserved:
   **/
  
  @ApiModelProperty(value = "Reserved:")
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  
  /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
   **/
  
  @ApiModelProperty(value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  @JsonProperty("idCheckConfigurationName")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }
  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idCheckInformationInput")
  public IdCheckInformationInput getIdCheckInformationInput() {
    return idCheckInformationInput;
  }
  public void setIdCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
  }

  
  /**
   * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account.
   **/
  
  @ApiModelProperty(value = "When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account.")
  @JsonProperty("inheritEmailNotificationConfiguration")
  public String getInheritEmailNotificationConfiguration() {
    return inheritEmailNotificationConfiguration;
  }
  public void setInheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
  }

  
  /**
   * When set to **true**, this signer is a bulk recipient and the recipient information is contained in a bulk recipient file. \n\nNote that when this is true the email and name for the recipient becomes bulk@recipient.com and \"Bulk Recipient\". These fields can not be changed for the bulk recipient.
   **/
  
  @ApiModelProperty(value = "When set to **true**, this signer is a bulk recipient and the recipient information is contained in a bulk recipient file. \n\nNote that when this is true the email and name for the recipient becomes bulk@recipient.com and \"Bulk Recipient\". These fields can not be changed for the bulk recipient.")
  @JsonProperty("isBulkRecipient")
  public String getIsBulkRecipient() {
    return isBulkRecipient;
  }
  public void setIsBulkRecipient(String isBulkRecipient) {
    this.isBulkRecipient = isBulkRecipient;
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
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.\n\nMaximum Length: 1000 characters.
   **/
  
  @ApiModelProperty(value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.\n\nMaximum Length: 1000 characters.")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offlineAttributes")
  public OfflineAttributes getOfflineAttributes() {
    return offlineAttributes;
  }
  public void setOfflineAttributes(OfflineAttributes offlineAttributes) {
    this.offlineAttributes = offlineAttributes;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("phoneAuthentication")
  public RecipientPhoneAuthentication getPhoneAuthentication() {
    return phoneAuthentication;
  }
  public void setPhoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
  }

  
  /**
   * Reserved:
   **/
  
  @ApiModelProperty(value = "Reserved:")
  @JsonProperty("recipientAttachments")
  public java.util.List<RecipientAttachment> getRecipientAttachments() {
    return recipientAttachments;
  }
  public void setRecipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipientAuthenticationStatus")
  public AuthenticationStatus getRecipientAuthenticationStatus() {
    return recipientAuthenticationStatus;
  }
  public void setRecipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
  }

  
  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   **/
  
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  @JsonProperty("recipientId")
  public String getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipientIdGuid")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }
  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipientSignatureProviders")
  public java.util.List<RecipientSignatureProvider> getRecipientSignatureProviders() {
    return recipientSignatureProviders;
  }
  public void setRecipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipientSuppliesTabs")
  public String getRecipientSuppliesTabs() {
    return recipientSuppliesTabs;
  }
  public void setRecipientSuppliesTabs(String recipientSuppliesTabs) {
    this.recipientSuppliesTabs = recipientSuppliesTabs;
  }

  
  /**
   * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity.")
  @JsonProperty("requireIdLookup")
  public String getRequireIdLookup() {
    return requireIdLookup;
  }
  public void setRequireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
  }

  
  /**
   * Sets the type of signer certificate required for signing. If left blank, no certificate is required. Only one type of certificate can be set for a signer. The possible values are:\n\n* docusign_express – Requires a DocuSign Express certificate.\n* safe – Requires a SAFE-BioPharma certificate.\n* open_trust – Requires an OpenTrust certificate. \n\n**Important**: There are certain rules and restrictions that must be followed when requiring OpenTrust digital signatures. See [ML:OpenTrust Rules and Restrictions] for more information.
   **/
  
  @ApiModelProperty(value = "Sets the type of signer certificate required for signing. If left blank, no certificate is required. Only one type of certificate can be set for a signer. The possible values are:\n\n* docusign_express – Requires a DocuSign Express certificate.\n* safe – Requires a SAFE-BioPharma certificate.\n* open_trust – Requires an OpenTrust certificate. \n\n**Important**: There are certain rules and restrictions that must be followed when requiring OpenTrust digital signatures. See [ML:OpenTrust Rules and Restrictions] for more information.")
  @JsonProperty("requireSignerCertificate")
  public String getRequireSignerCertificate() {
    return requireSignerCertificate;
  }
  public void setRequireSignerCertificate(String requireSignerCertificate) {
    this.requireSignerCertificate = requireSignerCertificate;
  }

  
  /**
   * When set to **true**, the signer must print, sign, and upload or fax the signed documents to DocuSign.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the signer must print, sign, and upload or fax the signed documents to DocuSign.")
  @JsonProperty("requireSignOnPaper")
  public String getRequireSignOnPaper() {
    return requireSignOnPaper;
  }
  public void setRequireSignOnPaper(String requireSignOnPaper) {
    this.requireSignOnPaper = requireSignOnPaper;
  }

  
  /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
   **/
  
  @ApiModelProperty(value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  @JsonProperty("roleName")
  public String getRoleName() {
    return roleName;
  }
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  
  /**
   * Specifies the routing order of the recipient in the envelope.
   **/
  
  @ApiModelProperty(value = "Specifies the routing order of the recipient in the envelope.")
  @JsonProperty("routingOrder")
  public String getRoutingOrder() {
    return routingOrder;
  }
  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("samlAuthentication")
  public RecipientSAMLAuthentication getSamlAuthentication() {
    return samlAuthentication;
  }
  public void setSamlAuthentication(RecipientSAMLAuthentication samlAuthentication) {
    this.samlAuthentication = samlAuthentication;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureInfo")
  public RecipientSignatureInformation getSignatureInfo() {
    return signatureInfo;
  }
  public void setSignatureInfo(RecipientSignatureInformation signatureInfo) {
    this.signatureInfo = signatureInfo;
  }

  
  /**
   * Reserved: For DocuSign use only.
   **/
  
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  @JsonProperty("signedDateTime")
  public String getSignedDateTime() {
    return signedDateTime;
  }
  public void setSignedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
  }

  
  /**
   * When set to **true**, specifies that the signer must sign in all locations.
   **/
  
  @ApiModelProperty(value = "When set to **true**, specifies that the signer must sign in all locations.")
  @JsonProperty("signInEachLocation")
  public String getSignInEachLocation() {
    return signInEachLocation;
  }
  public void setSignInEachLocation(String signInEachLocation) {
    this.signInEachLocation = signInEachLocation;
  }

  
  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   **/
  
  @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  @JsonProperty("signingGroupId")
  public String getSigningGroupId() {
    return signingGroupId;
  }
  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }

  
  /**
   * The display name for the signing group. \n\nMaximum Length: 100 characters.
   **/
  
  @ApiModelProperty(value = "The display name for the signing group. \n\nMaximum Length: 100 characters.")
  @JsonProperty("signingGroupName")
  public String getSigningGroupName() {
    return signingGroupName;
  }
  public void setSigningGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
  }

  
  /**
   * A complex type that contains information about users in the signing group.
   **/
  
  @ApiModelProperty(value = "A complex type that contains information about users in the signing group.")
  @JsonProperty("signingGroupUsers")
  public java.util.List<UserInfo> getSigningGroupUsers() {
    return signingGroupUsers;
  }
  public void setSigningGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("smsAuthentication")
  public RecipientSMSAuthentication getSmsAuthentication() {
    return smsAuthentication;
  }
  public void setSmsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
  }

  
  /**
   * Lists the social ID type that can be used for recipient authentication.
   **/
  
  @ApiModelProperty(value = "Lists the social ID type that can be used for recipient authentication.")
  @JsonProperty("socialAuthentications")
  public java.util.List<SocialAuthentication> getSocialAuthentications() {
    return socialAuthentications;
  }
  public void setSocialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabs")
  public Tabs getTabs() {
    return tabs;
  }
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }

  
  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.")
  @JsonProperty("templateLocked")
  public String getTemplateLocked() {
    return templateLocked;
  }
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  
  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  @JsonProperty("templateRequired")
  public String getTemplateRequired() {
    return templateRequired;
  }
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalTabCount")
  public String getTotalTabCount() {
    return totalTabCount;
  }
  public void setTotalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signer signer = (Signer) o;

    return true && Objects.equals(accessCode, signer.accessCode) &&
        Objects.equals(addAccessCodeToEmail, signer.addAccessCodeToEmail) &&
        Objects.equals(autoNavigation, signer.autoNavigation) &&
        Objects.equals(bulkRecipientsUri, signer.bulkRecipientsUri) &&
        Objects.equals(canSignOffline, signer.canSignOffline) &&
        Objects.equals(clientUserId, signer.clientUserId) &&
        Objects.equals(creationReason, signer.creationReason) &&
        Objects.equals(customFields, signer.customFields) &&
        Objects.equals(declinedDateTime, signer.declinedDateTime) &&
        Objects.equals(declinedReason, signer.declinedReason) &&
        Objects.equals(defaultRecipient, signer.defaultRecipient) &&
        Objects.equals(deliveredDateTime, signer.deliveredDateTime) &&
        Objects.equals(deliveryMethod, signer.deliveryMethod) &&
        Objects.equals(documentVisibility, signer.documentVisibility) &&
        Objects.equals(email, signer.email) &&
        Objects.equals(emailNotification, signer.emailNotification) &&
        Objects.equals(emailRecipientPostSigningURL, signer.emailRecipientPostSigningURL) &&
        Objects.equals(embeddedRecipientStartURL, signer.embeddedRecipientStartURL) &&
        Objects.equals(errorDetails, signer.errorDetails) &&
        Objects.equals(excludedDocuments, signer.excludedDocuments) &&
        Objects.equals(faxNumber, signer.faxNumber) &&
        Objects.equals(idCheckConfigurationName, signer.idCheckConfigurationName) &&
        Objects.equals(idCheckInformationInput, signer.idCheckInformationInput) &&
        Objects.equals(inheritEmailNotificationConfiguration, signer.inheritEmailNotificationConfiguration) &&
        Objects.equals(isBulkRecipient, signer.isBulkRecipient) &&
        Objects.equals(name, signer.name) &&
        Objects.equals(note, signer.note) &&
        Objects.equals(offlineAttributes, signer.offlineAttributes) &&
        Objects.equals(phoneAuthentication, signer.phoneAuthentication) &&
        Objects.equals(recipientAttachments, signer.recipientAttachments) &&
        Objects.equals(recipientAuthenticationStatus, signer.recipientAuthenticationStatus) &&
        Objects.equals(recipientId, signer.recipientId) &&
        Objects.equals(recipientIdGuid, signer.recipientIdGuid) &&
        Objects.equals(recipientSignatureProviders, signer.recipientSignatureProviders) &&
        Objects.equals(recipientSuppliesTabs, signer.recipientSuppliesTabs) &&
        Objects.equals(requireIdLookup, signer.requireIdLookup) &&
        Objects.equals(requireSignerCertificate, signer.requireSignerCertificate) &&
        Objects.equals(requireSignOnPaper, signer.requireSignOnPaper) &&
        Objects.equals(roleName, signer.roleName) &&
        Objects.equals(routingOrder, signer.routingOrder) &&
        Objects.equals(samlAuthentication, signer.samlAuthentication) &&
        Objects.equals(sentDateTime, signer.sentDateTime) &&
        Objects.equals(signatureInfo, signer.signatureInfo) &&
        Objects.equals(signedDateTime, signer.signedDateTime) &&
        Objects.equals(signInEachLocation, signer.signInEachLocation) &&
        Objects.equals(signingGroupId, signer.signingGroupId) &&
        Objects.equals(signingGroupName, signer.signingGroupName) &&
        Objects.equals(signingGroupUsers, signer.signingGroupUsers) &&
        Objects.equals(smsAuthentication, signer.smsAuthentication) &&
        Objects.equals(socialAuthentications, signer.socialAuthentications) &&
        Objects.equals(status, signer.status) &&
        Objects.equals(tabs, signer.tabs) &&
        Objects.equals(templateLocked, signer.templateLocked) &&
        Objects.equals(templateRequired, signer.templateRequired) &&
        Objects.equals(totalTabCount, signer.totalTabCount) &&
        Objects.equals(userId, signer.userId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, addAccessCodeToEmail, autoNavigation, bulkRecipientsUri, canSignOffline, clientUserId, creationReason, customFields, declinedDateTime, declinedReason, defaultRecipient, deliveredDateTime, deliveryMethod, documentVisibility, email, emailNotification, emailRecipientPostSigningURL, embeddedRecipientStartURL, errorDetails, excludedDocuments, faxNumber, idCheckConfigurationName, idCheckInformationInput, inheritEmailNotificationConfiguration, isBulkRecipient, name, note, offlineAttributes, phoneAuthentication, recipientAttachments, recipientAuthenticationStatus, recipientId, recipientIdGuid, recipientSignatureProviders, recipientSuppliesTabs, requireIdLookup, requireSignerCertificate, requireSignOnPaper, roleName, routingOrder, samlAuthentication, sentDateTime, signatureInfo, signedDateTime, signInEachLocation, signingGroupId, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, tabs, templateLocked, templateRequired, totalTabCount, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signer {\n");
    
    if (accessCode != null)
      sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    if (addAccessCodeToEmail != null)
      sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
    if (autoNavigation != null)
      sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
    if (bulkRecipientsUri != null)
      sb.append("    bulkRecipientsUri: ").append(toIndentedString(bulkRecipientsUri)).append("\n");
    if (canSignOffline != null)
      sb.append("    canSignOffline: ").append(toIndentedString(canSignOffline)).append("\n");
    if (clientUserId != null)
      sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    if (creationReason != null)
      sb.append("    creationReason: ").append(toIndentedString(creationReason)).append("\n");
    if (customFields != null)
      sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    if (declinedDateTime != null)
      sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    if (declinedReason != null)
      sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
    if (defaultRecipient != null)
      sb.append("    defaultRecipient: ").append(toIndentedString(defaultRecipient)).append("\n");
    if (deliveredDateTime != null)
      sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    if (deliveryMethod != null)
      sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    if (documentVisibility != null)
      sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (emailNotification != null)
      sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
    if (emailRecipientPostSigningURL != null)
      sb.append("    emailRecipientPostSigningURL: ").append(toIndentedString(emailRecipientPostSigningURL)).append("\n");
    if (embeddedRecipientStartURL != null)
      sb.append("    embeddedRecipientStartURL: ").append(toIndentedString(embeddedRecipientStartURL)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (excludedDocuments != null)
      sb.append("    excludedDocuments: ").append(toIndentedString(excludedDocuments)).append("\n");
    if (faxNumber != null)
      sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    if (idCheckConfigurationName != null)
      sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    if (idCheckInformationInput != null)
      sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
    if (inheritEmailNotificationConfiguration != null)
      sb.append("    inheritEmailNotificationConfiguration: ").append(toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
    if (isBulkRecipient != null)
      sb.append("    isBulkRecipient: ").append(toIndentedString(isBulkRecipient)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (note != null)
      sb.append("    note: ").append(toIndentedString(note)).append("\n");
    if (offlineAttributes != null)
      sb.append("    offlineAttributes: ").append(toIndentedString(offlineAttributes)).append("\n");
    if (phoneAuthentication != null)
      sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
    if (recipientAttachments != null)
      sb.append("    recipientAttachments: ").append(toIndentedString(recipientAttachments)).append("\n");
    if (recipientAuthenticationStatus != null)
      sb.append("    recipientAuthenticationStatus: ").append(toIndentedString(recipientAuthenticationStatus)).append("\n");
    if (recipientId != null)
      sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    if (recipientIdGuid != null)
      sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    if (recipientSignatureProviders != null)
      sb.append("    recipientSignatureProviders: ").append(toIndentedString(recipientSignatureProviders)).append("\n");
    if (recipientSuppliesTabs != null)
      sb.append("    recipientSuppliesTabs: ").append(toIndentedString(recipientSuppliesTabs)).append("\n");
    if (requireIdLookup != null)
      sb.append("    requireIdLookup: ").append(toIndentedString(requireIdLookup)).append("\n");
    if (requireSignerCertificate != null)
      sb.append("    requireSignerCertificate: ").append(toIndentedString(requireSignerCertificate)).append("\n");
    if (requireSignOnPaper != null)
      sb.append("    requireSignOnPaper: ").append(toIndentedString(requireSignOnPaper)).append("\n");
    if (roleName != null)
      sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    if (routingOrder != null)
      sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    if (samlAuthentication != null)
      sb.append("    samlAuthentication: ").append(toIndentedString(samlAuthentication)).append("\n");
    if (sentDateTime != null)
      sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    if (signatureInfo != null)
      sb.append("    signatureInfo: ").append(toIndentedString(signatureInfo)).append("\n");
    if (signedDateTime != null)
      sb.append("    signedDateTime: ").append(toIndentedString(signedDateTime)).append("\n");
    if (signInEachLocation != null)
      sb.append("    signInEachLocation: ").append(toIndentedString(signInEachLocation)).append("\n");
    if (signingGroupId != null)
      sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
    if (signingGroupName != null)
      sb.append("    signingGroupName: ").append(toIndentedString(signingGroupName)).append("\n");
    if (signingGroupUsers != null)
      sb.append("    signingGroupUsers: ").append(toIndentedString(signingGroupUsers)).append("\n");
    if (smsAuthentication != null)
      sb.append("    smsAuthentication: ").append(toIndentedString(smsAuthentication)).append("\n");
    if (socialAuthentications != null)
      sb.append("    socialAuthentications: ").append(toIndentedString(socialAuthentications)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (tabs != null)
      sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    if (templateLocked != null)
      sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    if (templateRequired != null)
      sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    if (totalTabCount != null)
      sb.append("    totalTabCount: ").append(toIndentedString(totalTabCount)).append("\n");
    if (userId != null)
      sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

