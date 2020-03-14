package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.DocumentVisibility;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.FeatureAvailableMetadata;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.RecipientAttachment;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.RecipientSMSAuthentication;
import com.docusign.esign.model.SocialAuthentication;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NotaryHost
 */

public class NotaryHost {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("accessCodeMetadata")
  private PropertyMetadata accessCodeMetadata = null;

  @JsonProperty("addAccessCodeToEmail")
  private String addAccessCodeToEmail = null;

  @JsonProperty("allowSystemOverrideForLockedRecipient")
  private String allowSystemOverrideForLockedRecipient = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("completedCount")
  private String completedCount = null;

  @JsonProperty("customFields")
  private java.util.List<String> customFields = new java.util.ArrayList<String>();

  @JsonProperty("declinedDateTime")
  private String declinedDateTime = null;

  @JsonProperty("declinedReason")
  private String declinedReason = null;

  @JsonProperty("deliveredDateTime")
  private String deliveredDateTime = null;

  @JsonProperty("deliveryMethod")
  private String deliveryMethod = null;

  @JsonProperty("deliveryMethodMetadata")
  private PropertyMetadata deliveryMethodMetadata = null;

  @JsonProperty("designatorId")
  private String designatorId = null;

  @JsonProperty("designatorIdGuid")
  private String designatorIdGuid = null;

  @JsonProperty("documentVisibility")
  private java.util.List<DocumentVisibility> documentVisibility = new java.util.ArrayList<DocumentVisibility>();

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("emailMetadata")
  private PropertyMetadata emailMetadata = null;

  @JsonProperty("emailNotification")
  private RecipientEmailNotification emailNotification = null;

  @JsonProperty("embeddedRecipientStartURL")
  private String embeddedRecipientStartURL = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("faxNumber")
  private String faxNumber = null;

  @JsonProperty("faxNumberMetadata")
  private PropertyMetadata faxNumberMetadata = null;

  @JsonProperty("hostRecipientId")
  private String hostRecipientId = null;

  @JsonProperty("idCheckConfigurationName")
  private String idCheckConfigurationName = null;

  @JsonProperty("idCheckConfigurationNameMetadata")
  private PropertyMetadata idCheckConfigurationNameMetadata = null;

  @JsonProperty("idCheckInformationInput")
  private IdCheckInformationInput idCheckInformationInput = null;

  @JsonProperty("inheritEmailNotificationConfiguration")
  private String inheritEmailNotificationConfiguration = null;

  @JsonProperty("lockedRecipientPhoneAuthEditable")
  private String lockedRecipientPhoneAuthEditable = null;

  @JsonProperty("lockedRecipientSmsEditable")
  private String lockedRecipientSmsEditable = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameMetadata")
  private PropertyMetadata nameMetadata = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("noteMetadata")
  private PropertyMetadata noteMetadata = null;

  @JsonProperty("phoneAuthentication")
  private RecipientPhoneAuthentication phoneAuthentication = null;

  @JsonProperty("recipientAttachments")
  private java.util.List<RecipientAttachment> recipientAttachments = new java.util.ArrayList<RecipientAttachment>();

  @JsonProperty("recipientAuthenticationStatus")
  private AuthenticationStatus recipientAuthenticationStatus = null;

  @JsonProperty("recipientFeatureMetadata")
  private java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata = new java.util.ArrayList<FeatureAvailableMetadata>();

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdGuid")
  private String recipientIdGuid = null;

  @JsonProperty("recipientType")
  private String recipientType = null;

  @JsonProperty("recipientTypeMetadata")
  private PropertyMetadata recipientTypeMetadata = null;

  @JsonProperty("requireIdLookup")
  private String requireIdLookup = null;

  @JsonProperty("requireIdLookupMetadata")
  private PropertyMetadata requireIdLookupMetadata = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("routingOrder")
  private String routingOrder = null;

  @JsonProperty("routingOrderMetadata")
  private PropertyMetadata routingOrderMetadata = null;

  @JsonProperty("sentDateTime")
  private String sentDateTime = null;

  @JsonProperty("signedDateTime")
  private String signedDateTime = null;

  @JsonProperty("signingGroupId")
  private String signingGroupId = null;

  @JsonProperty("signingGroupIdMetadata")
  private PropertyMetadata signingGroupIdMetadata = null;

  @JsonProperty("signingGroupName")
  private String signingGroupName = null;

  @JsonProperty("signingGroupUsers")
  private java.util.List<UserInfo> signingGroupUsers = new java.util.ArrayList<UserInfo>();

  @JsonProperty("smsAuthentication")
  private RecipientSMSAuthentication smsAuthentication = null;

  @JsonProperty("socialAuthentications")
  private java.util.List<SocialAuthentication> socialAuthentications = new java.util.ArrayList<SocialAuthentication>();

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("suppressEmails")
  private String suppressEmails = null;

  @JsonProperty("tabs")
  private Tabs tabs = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("totalTabCount")
  private String totalTabCount = null;

  @JsonProperty("userId")
  private String userId = null;

  public NotaryHost accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.
   * @return accessCode
  **/
  @ApiModelProperty(example = "null", value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  public NotaryHost accessCodeMetadata(PropertyMetadata accessCodeMetadata) {
    this.accessCodeMetadata = accessCodeMetadata;
    return this;
  }

   /**
   * Get accessCodeMetadata
   * @return accessCodeMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAccessCodeMetadata() {
    return accessCodeMetadata;
  }

  public void setAccessCodeMetadata(PropertyMetadata accessCodeMetadata) {
    this.accessCodeMetadata = accessCodeMetadata;
  }

  public NotaryHost addAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
    return this;
  }

   /**
   * This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.
   * @return addAccessCodeToEmail
  **/
  @ApiModelProperty(example = "null", value = "This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.")
  public String getAddAccessCodeToEmail() {
    return addAccessCodeToEmail;
  }

  public void setAddAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
  }

  public NotaryHost allowSystemOverrideForLockedRecipient(String allowSystemOverrideForLockedRecipient) {
    this.allowSystemOverrideForLockedRecipient = allowSystemOverrideForLockedRecipient;
    return this;
  }

   /**
   * 
   * @return allowSystemOverrideForLockedRecipient
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowSystemOverrideForLockedRecipient() {
    return allowSystemOverrideForLockedRecipient;
  }

  public void setAllowSystemOverrideForLockedRecipient(String allowSystemOverrideForLockedRecipient) {
    this.allowSystemOverrideForLockedRecipient = allowSystemOverrideForLockedRecipient;
  }

  public NotaryHost clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. 
   * @return clientUserId
  **/
  @ApiModelProperty(example = "null", value = "Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. ")
  public String getClientUserId() {
    return clientUserId;
  }

  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  public NotaryHost completedCount(String completedCount) {
    this.completedCount = completedCount;
    return this;
  }

   /**
   * 
   * @return completedCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompletedCount() {
    return completedCount;
  }

  public void setCompletedCount(String completedCount) {
    this.completedCount = completedCount;
  }

  public NotaryHost customFields(java.util.List<String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public NotaryHost addCustomFieldsItem(String customFieldsItem) {
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
   * @return customFields
  **/
  @ApiModelProperty(example = "null", value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  public java.util.List<String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(java.util.List<String> customFields) {
    this.customFields = customFields;
  }

  public NotaryHost declinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
    return this;
  }

   /**
   * The date and time the recipient declined the document.
   * @return declinedDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the recipient declined the document.")
  public String getDeclinedDateTime() {
    return declinedDateTime;
  }

  public void setDeclinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
  }

  public NotaryHost declinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
    return this;
  }

   /**
   * The reason the recipient declined the document.
   * @return declinedReason
  **/
  @ApiModelProperty(example = "null", value = "The reason the recipient declined the document.")
  public String getDeclinedReason() {
    return declinedReason;
  }

  public void setDeclinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
  }

  public NotaryHost deliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
    return this;
  }

   /**
   * Reserved: For DocuSign use only.
   * @return deliveredDateTime
  **/
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only.")
  public String getDeliveredDateTime() {
    return deliveredDateTime;
  }

  public void setDeliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
  }

  public NotaryHost deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

   /**
   * Reserved: For DocuSign use only.
   * @return deliveryMethod
  **/
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only.")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public NotaryHost deliveryMethodMetadata(PropertyMetadata deliveryMethodMetadata) {
    this.deliveryMethodMetadata = deliveryMethodMetadata;
    return this;
  }

   /**
   * Get deliveryMethodMetadata
   * @return deliveryMethodMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getDeliveryMethodMetadata() {
    return deliveryMethodMetadata;
  }

  public void setDeliveryMethodMetadata(PropertyMetadata deliveryMethodMetadata) {
    this.deliveryMethodMetadata = deliveryMethodMetadata;
  }

  public NotaryHost designatorId(String designatorId) {
    this.designatorId = designatorId;
    return this;
  }

   /**
   * 
   * @return designatorId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDesignatorId() {
    return designatorId;
  }

  public void setDesignatorId(String designatorId) {
    this.designatorId = designatorId;
  }

  public NotaryHost designatorIdGuid(String designatorIdGuid) {
    this.designatorIdGuid = designatorIdGuid;
    return this;
  }

   /**
   * 
   * @return designatorIdGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDesignatorIdGuid() {
    return designatorIdGuid;
  }

  public void setDesignatorIdGuid(String designatorIdGuid) {
    this.designatorIdGuid = designatorIdGuid;
  }

  public NotaryHost documentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }

  public NotaryHost addDocumentVisibilityItem(DocumentVisibility documentVisibilityItem) {
    this.documentVisibility.add(documentVisibilityItem);
    return this;
  }

   /**
   * 
   * @return documentVisibility
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<DocumentVisibility> getDocumentVisibility() {
    return documentVisibility;
  }

  public void setDocumentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
  }

  public NotaryHost email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public NotaryHost emailMetadata(PropertyMetadata emailMetadata) {
    this.emailMetadata = emailMetadata;
    return this;
  }

   /**
   * Get emailMetadata
   * @return emailMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getEmailMetadata() {
    return emailMetadata;
  }

  public void setEmailMetadata(PropertyMetadata emailMetadata) {
    this.emailMetadata = emailMetadata;
  }

  public NotaryHost emailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
    return this;
  }

   /**
   * Get emailNotification
   * @return emailNotification
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }

  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }

  public NotaryHost embeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    return this;
  }

   /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` 
   * @return embeddedRecipientStartURL
  **/
  @ApiModelProperty(example = "null", value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }

  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }

  public NotaryHost errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public NotaryHost faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Reserved:
   * @return faxNumber
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public NotaryHost faxNumberMetadata(PropertyMetadata faxNumberMetadata) {
    this.faxNumberMetadata = faxNumberMetadata;
    return this;
  }

   /**
   * Get faxNumberMetadata
   * @return faxNumberMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getFaxNumberMetadata() {
    return faxNumberMetadata;
  }

  public void setFaxNumberMetadata(PropertyMetadata faxNumberMetadata) {
    this.faxNumberMetadata = faxNumberMetadata;
  }

  public NotaryHost hostRecipientId(String hostRecipientId) {
    this.hostRecipientId = hostRecipientId;
    return this;
  }

   /**
   * 
   * @return hostRecipientId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHostRecipientId() {
    return hostRecipientId;
  }

  public void setHostRecipientId(String hostRecipientId) {
    this.hostRecipientId = hostRecipientId;
  }

  public NotaryHost idCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
    return this;
  }

   /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
   * @return idCheckConfigurationName
  **/
  @ApiModelProperty(example = "null", value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }

  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }

  public NotaryHost idCheckConfigurationNameMetadata(PropertyMetadata idCheckConfigurationNameMetadata) {
    this.idCheckConfigurationNameMetadata = idCheckConfigurationNameMetadata;
    return this;
  }

   /**
   * Get idCheckConfigurationNameMetadata
   * @return idCheckConfigurationNameMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getIdCheckConfigurationNameMetadata() {
    return idCheckConfigurationNameMetadata;
  }

  public void setIdCheckConfigurationNameMetadata(PropertyMetadata idCheckConfigurationNameMetadata) {
    this.idCheckConfigurationNameMetadata = idCheckConfigurationNameMetadata;
  }

  public NotaryHost idCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
    return this;
  }

   /**
   * Get idCheckInformationInput
   * @return idCheckInformationInput
  **/
  @ApiModelProperty(example = "null", value = "")
  public IdCheckInformationInput getIdCheckInformationInput() {
    return idCheckInformationInput;
  }

  public void setIdCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
  }

  public NotaryHost inheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
    return this;
  }

   /**
   * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. 
   * @return inheritEmailNotificationConfiguration
  **/
  @ApiModelProperty(example = "null", value = "When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. ")
  public String getInheritEmailNotificationConfiguration() {
    return inheritEmailNotificationConfiguration;
  }

  public void setInheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
  }

  public NotaryHost lockedRecipientPhoneAuthEditable(String lockedRecipientPhoneAuthEditable) {
    this.lockedRecipientPhoneAuthEditable = lockedRecipientPhoneAuthEditable;
    return this;
  }

   /**
   * 
   * @return lockedRecipientPhoneAuthEditable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLockedRecipientPhoneAuthEditable() {
    return lockedRecipientPhoneAuthEditable;
  }

  public void setLockedRecipientPhoneAuthEditable(String lockedRecipientPhoneAuthEditable) {
    this.lockedRecipientPhoneAuthEditable = lockedRecipientPhoneAuthEditable;
  }

  public NotaryHost lockedRecipientSmsEditable(String lockedRecipientSmsEditable) {
    this.lockedRecipientSmsEditable = lockedRecipientSmsEditable;
    return this;
  }

   /**
   * 
   * @return lockedRecipientSmsEditable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLockedRecipientSmsEditable() {
    return lockedRecipientSmsEditable;
  }

  public void setLockedRecipientSmsEditable(String lockedRecipientSmsEditable) {
    this.lockedRecipientSmsEditable = lockedRecipientSmsEditable;
  }

  public NotaryHost name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotaryHost nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

   /**
   * Get nameMetadata
   * @return nameMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getNameMetadata() {
    return nameMetadata;
  }

  public void setNameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
  }

  public NotaryHost note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public NotaryHost noteMetadata(PropertyMetadata noteMetadata) {
    this.noteMetadata = noteMetadata;
    return this;
  }

   /**
   * Get noteMetadata
   * @return noteMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getNoteMetadata() {
    return noteMetadata;
  }

  public void setNoteMetadata(PropertyMetadata noteMetadata) {
    this.noteMetadata = noteMetadata;
  }

  public NotaryHost phoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
    return this;
  }

   /**
   * Get phoneAuthentication
   * @return phoneAuthentication
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientPhoneAuthentication getPhoneAuthentication() {
    return phoneAuthentication;
  }

  public void setPhoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
  }

  public NotaryHost recipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
    return this;
  }

  public NotaryHost addRecipientAttachmentsItem(RecipientAttachment recipientAttachmentsItem) {
    this.recipientAttachments.add(recipientAttachmentsItem);
    return this;
  }

   /**
   * Reserved:
   * @return recipientAttachments
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public java.util.List<RecipientAttachment> getRecipientAttachments() {
    return recipientAttachments;
  }

  public void setRecipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
  }

  public NotaryHost recipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
    return this;
  }

   /**
   * Get recipientAuthenticationStatus
   * @return recipientAuthenticationStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public AuthenticationStatus getRecipientAuthenticationStatus() {
    return recipientAuthenticationStatus;
  }

  public void setRecipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
  }

  public NotaryHost recipientFeatureMetadata(java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata) {
    this.recipientFeatureMetadata = recipientFeatureMetadata;
    return this;
  }

  public NotaryHost addRecipientFeatureMetadataItem(FeatureAvailableMetadata recipientFeatureMetadataItem) {
    this.recipientFeatureMetadata.add(recipientFeatureMetadataItem);
    return this;
  }

   /**
   * 
   * @return recipientFeatureMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<FeatureAvailableMetadata> getRecipientFeatureMetadata() {
    return recipientFeatureMetadata;
  }

  public void setRecipientFeatureMetadata(java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata) {
    this.recipientFeatureMetadata = recipientFeatureMetadata;
  }

  public NotaryHost recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public NotaryHost recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

   /**
   * 
   * @return recipientIdGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  public NotaryHost recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

   /**
   * 
   * @return recipientType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  public NotaryHost recipientTypeMetadata(PropertyMetadata recipientTypeMetadata) {
    this.recipientTypeMetadata = recipientTypeMetadata;
    return this;
  }

   /**
   * Get recipientTypeMetadata
   * @return recipientTypeMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getRecipientTypeMetadata() {
    return recipientTypeMetadata;
  }

  public void setRecipientTypeMetadata(PropertyMetadata recipientTypeMetadata) {
    this.recipientTypeMetadata = recipientTypeMetadata;
  }

  public NotaryHost requireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
    return this;
  }

   /**
   * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. 
   * @return requireIdLookup
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. ")
  public String getRequireIdLookup() {
    return requireIdLookup;
  }

  public void setRequireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
  }

  public NotaryHost requireIdLookupMetadata(PropertyMetadata requireIdLookupMetadata) {
    this.requireIdLookupMetadata = requireIdLookupMetadata;
    return this;
  }

   /**
   * Get requireIdLookupMetadata
   * @return requireIdLookupMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getRequireIdLookupMetadata() {
    return requireIdLookupMetadata;
  }

  public void setRequireIdLookupMetadata(PropertyMetadata requireIdLookupMetadata) {
    this.requireIdLookupMetadata = requireIdLookupMetadata;
  }

  public NotaryHost roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
   * @return roleName
  **/
  @ApiModelProperty(example = "null", value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public NotaryHost routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

   /**
   * Specifies the routing order of the recipient in the envelope. 
   * @return routingOrder
  **/
  @ApiModelProperty(example = "null", value = "Specifies the routing order of the recipient in the envelope. ")
  public String getRoutingOrder() {
    return routingOrder;
  }

  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }

  public NotaryHost routingOrderMetadata(PropertyMetadata routingOrderMetadata) {
    this.routingOrderMetadata = routingOrderMetadata;
    return this;
  }

   /**
   * Get routingOrderMetadata
   * @return routingOrderMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getRoutingOrderMetadata() {
    return routingOrderMetadata;
  }

  public void setRoutingOrderMetadata(PropertyMetadata routingOrderMetadata) {
    this.routingOrderMetadata = routingOrderMetadata;
  }

  public NotaryHost sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

   /**
   * The date and time the envelope was sent.
   * @return sentDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the envelope was sent.")
  public String getSentDateTime() {
    return sentDateTime;
  }

  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }

  public NotaryHost signedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
    return this;
  }

   /**
   * Reserved: For DocuSign use only. 
   * @return signedDateTime
  **/
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only. ")
  public String getSignedDateTime() {
    return signedDateTime;
  }

  public void setSignedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
  }

  public NotaryHost signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

   /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   * @return signingGroupId
  **/
  @ApiModelProperty(example = "null", value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }

  public NotaryHost signingGroupIdMetadata(PropertyMetadata signingGroupIdMetadata) {
    this.signingGroupIdMetadata = signingGroupIdMetadata;
    return this;
  }

   /**
   * Get signingGroupIdMetadata
   * @return signingGroupIdMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getSigningGroupIdMetadata() {
    return signingGroupIdMetadata;
  }

  public void setSigningGroupIdMetadata(PropertyMetadata signingGroupIdMetadata) {
    this.signingGroupIdMetadata = signingGroupIdMetadata;
  }

  public NotaryHost signingGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
    return this;
  }

   /**
   * The display name for the signing group.   Maximum Length: 100 characters. 
   * @return signingGroupName
  **/
  @ApiModelProperty(example = "null", value = "The display name for the signing group.   Maximum Length: 100 characters. ")
  public String getSigningGroupName() {
    return signingGroupName;
  }

  public void setSigningGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
  }

  public NotaryHost signingGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
    return this;
  }

  public NotaryHost addSigningGroupUsersItem(UserInfo signingGroupUsersItem) {
    this.signingGroupUsers.add(signingGroupUsersItem);
    return this;
  }

   /**
   * A complex type that contains information about users in the signing group.
   * @return signingGroupUsers
  **/
  @ApiModelProperty(example = "null", value = "A complex type that contains information about users in the signing group.")
  public java.util.List<UserInfo> getSigningGroupUsers() {
    return signingGroupUsers;
  }

  public void setSigningGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
  }

  public NotaryHost smsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
    return this;
  }

   /**
   * Get smsAuthentication
   * @return smsAuthentication
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientSMSAuthentication getSmsAuthentication() {
    return smsAuthentication;
  }

  public void setSmsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
  }

  public NotaryHost socialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
    return this;
  }

  public NotaryHost addSocialAuthenticationsItem(SocialAuthentication socialAuthenticationsItem) {
    this.socialAuthentications.add(socialAuthenticationsItem);
    return this;
  }

   /**
   *  Lists the social ID type that can be used for recipient authentication.
   * @return socialAuthentications
  **/
  @ApiModelProperty(example = "null", value = " Lists the social ID type that can be used for recipient authentication.")
  public java.util.List<SocialAuthentication> getSocialAuthentications() {
    return socialAuthentications;
  }

  public void setSocialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
  }

  public NotaryHost status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NotaryHost statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * 
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public NotaryHost suppressEmails(String suppressEmails) {
    this.suppressEmails = suppressEmails;
    return this;
  }

   /**
   * 
   * @return suppressEmails
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSuppressEmails() {
    return suppressEmails;
  }

  public void setSuppressEmails(String suppressEmails) {
    this.suppressEmails = suppressEmails;
  }

  public NotaryHost tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }

   /**
   * Get tabs
   * @return tabs
  **/
  @ApiModelProperty(example = "null", value = "")
  public Tabs getTabs() {
    return tabs;
  }

  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }

  public NotaryHost templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

   /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. 
   * @return templateLocked
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  public NotaryHost templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

   /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   * @return templateRequired
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  public NotaryHost totalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
    return this;
  }

   /**
   * 
   * @return totalTabCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTotalTabCount() {
    return totalTabCount;
  }

  public void setTotalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
  }

  public NotaryHost userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
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
    NotaryHost notaryHost = (NotaryHost) o;
    return Objects.equals(this.accessCode, notaryHost.accessCode) &&
        Objects.equals(this.accessCodeMetadata, notaryHost.accessCodeMetadata) &&
        Objects.equals(this.addAccessCodeToEmail, notaryHost.addAccessCodeToEmail) &&
        Objects.equals(this.allowSystemOverrideForLockedRecipient, notaryHost.allowSystemOverrideForLockedRecipient) &&
        Objects.equals(this.clientUserId, notaryHost.clientUserId) &&
        Objects.equals(this.completedCount, notaryHost.completedCount) &&
        Objects.equals(this.customFields, notaryHost.customFields) &&
        Objects.equals(this.declinedDateTime, notaryHost.declinedDateTime) &&
        Objects.equals(this.declinedReason, notaryHost.declinedReason) &&
        Objects.equals(this.deliveredDateTime, notaryHost.deliveredDateTime) &&
        Objects.equals(this.deliveryMethod, notaryHost.deliveryMethod) &&
        Objects.equals(this.deliveryMethodMetadata, notaryHost.deliveryMethodMetadata) &&
        Objects.equals(this.designatorId, notaryHost.designatorId) &&
        Objects.equals(this.designatorIdGuid, notaryHost.designatorIdGuid) &&
        Objects.equals(this.documentVisibility, notaryHost.documentVisibility) &&
        Objects.equals(this.email, notaryHost.email) &&
        Objects.equals(this.emailMetadata, notaryHost.emailMetadata) &&
        Objects.equals(this.emailNotification, notaryHost.emailNotification) &&
        Objects.equals(this.embeddedRecipientStartURL, notaryHost.embeddedRecipientStartURL) &&
        Objects.equals(this.errorDetails, notaryHost.errorDetails) &&
        Objects.equals(this.faxNumber, notaryHost.faxNumber) &&
        Objects.equals(this.faxNumberMetadata, notaryHost.faxNumberMetadata) &&
        Objects.equals(this.hostRecipientId, notaryHost.hostRecipientId) &&
        Objects.equals(this.idCheckConfigurationName, notaryHost.idCheckConfigurationName) &&
        Objects.equals(this.idCheckConfigurationNameMetadata, notaryHost.idCheckConfigurationNameMetadata) &&
        Objects.equals(this.idCheckInformationInput, notaryHost.idCheckInformationInput) &&
        Objects.equals(this.inheritEmailNotificationConfiguration, notaryHost.inheritEmailNotificationConfiguration) &&
        Objects.equals(this.lockedRecipientPhoneAuthEditable, notaryHost.lockedRecipientPhoneAuthEditable) &&
        Objects.equals(this.lockedRecipientSmsEditable, notaryHost.lockedRecipientSmsEditable) &&
        Objects.equals(this.name, notaryHost.name) &&
        Objects.equals(this.nameMetadata, notaryHost.nameMetadata) &&
        Objects.equals(this.note, notaryHost.note) &&
        Objects.equals(this.noteMetadata, notaryHost.noteMetadata) &&
        Objects.equals(this.phoneAuthentication, notaryHost.phoneAuthentication) &&
        Objects.equals(this.recipientAttachments, notaryHost.recipientAttachments) &&
        Objects.equals(this.recipientAuthenticationStatus, notaryHost.recipientAuthenticationStatus) &&
        Objects.equals(this.recipientFeatureMetadata, notaryHost.recipientFeatureMetadata) &&
        Objects.equals(this.recipientId, notaryHost.recipientId) &&
        Objects.equals(this.recipientIdGuid, notaryHost.recipientIdGuid) &&
        Objects.equals(this.recipientType, notaryHost.recipientType) &&
        Objects.equals(this.recipientTypeMetadata, notaryHost.recipientTypeMetadata) &&
        Objects.equals(this.requireIdLookup, notaryHost.requireIdLookup) &&
        Objects.equals(this.requireIdLookupMetadata, notaryHost.requireIdLookupMetadata) &&
        Objects.equals(this.roleName, notaryHost.roleName) &&
        Objects.equals(this.routingOrder, notaryHost.routingOrder) &&
        Objects.equals(this.routingOrderMetadata, notaryHost.routingOrderMetadata) &&
        Objects.equals(this.sentDateTime, notaryHost.sentDateTime) &&
        Objects.equals(this.signedDateTime, notaryHost.signedDateTime) &&
        Objects.equals(this.signingGroupId, notaryHost.signingGroupId) &&
        Objects.equals(this.signingGroupIdMetadata, notaryHost.signingGroupIdMetadata) &&
        Objects.equals(this.signingGroupName, notaryHost.signingGroupName) &&
        Objects.equals(this.signingGroupUsers, notaryHost.signingGroupUsers) &&
        Objects.equals(this.smsAuthentication, notaryHost.smsAuthentication) &&
        Objects.equals(this.socialAuthentications, notaryHost.socialAuthentications) &&
        Objects.equals(this.status, notaryHost.status) &&
        Objects.equals(this.statusCode, notaryHost.statusCode) &&
        Objects.equals(this.suppressEmails, notaryHost.suppressEmails) &&
        Objects.equals(this.tabs, notaryHost.tabs) &&
        Objects.equals(this.templateLocked, notaryHost.templateLocked) &&
        Objects.equals(this.templateRequired, notaryHost.templateRequired) &&
        Objects.equals(this.totalTabCount, notaryHost.totalTabCount) &&
        Objects.equals(this.userId, notaryHost.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, accessCodeMetadata, addAccessCodeToEmail, allowSystemOverrideForLockedRecipient, clientUserId, completedCount, customFields, declinedDateTime, declinedReason, deliveredDateTime, deliveryMethod, deliveryMethodMetadata, designatorId, designatorIdGuid, documentVisibility, email, emailMetadata, emailNotification, embeddedRecipientStartURL, errorDetails, faxNumber, faxNumberMetadata, hostRecipientId, idCheckConfigurationName, idCheckConfigurationNameMetadata, idCheckInformationInput, inheritEmailNotificationConfiguration, lockedRecipientPhoneAuthEditable, lockedRecipientSmsEditable, name, nameMetadata, note, noteMetadata, phoneAuthentication, recipientAttachments, recipientAuthenticationStatus, recipientFeatureMetadata, recipientId, recipientIdGuid, recipientType, recipientTypeMetadata, requireIdLookup, requireIdLookupMetadata, roleName, routingOrder, routingOrderMetadata, sentDateTime, signedDateTime, signingGroupId, signingGroupIdMetadata, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, statusCode, suppressEmails, tabs, templateLocked, templateRequired, totalTabCount, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotaryHost {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    accessCodeMetadata: ").append(toIndentedString(accessCodeMetadata)).append("\n");
    sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
    sb.append("    allowSystemOverrideForLockedRecipient: ").append(toIndentedString(allowSystemOverrideForLockedRecipient)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    completedCount: ").append(toIndentedString(completedCount)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
    sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    deliveryMethodMetadata: ").append(toIndentedString(deliveryMethodMetadata)).append("\n");
    sb.append("    designatorId: ").append(toIndentedString(designatorId)).append("\n");
    sb.append("    designatorIdGuid: ").append(toIndentedString(designatorIdGuid)).append("\n");
    sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailMetadata: ").append(toIndentedString(emailMetadata)).append("\n");
    sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
    sb.append("    embeddedRecipientStartURL: ").append(toIndentedString(embeddedRecipientStartURL)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    faxNumberMetadata: ").append(toIndentedString(faxNumberMetadata)).append("\n");
    sb.append("    hostRecipientId: ").append(toIndentedString(hostRecipientId)).append("\n");
    sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    sb.append("    idCheckConfigurationNameMetadata: ").append(toIndentedString(idCheckConfigurationNameMetadata)).append("\n");
    sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
    sb.append("    inheritEmailNotificationConfiguration: ").append(toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
    sb.append("    lockedRecipientPhoneAuthEditable: ").append(toIndentedString(lockedRecipientPhoneAuthEditable)).append("\n");
    sb.append("    lockedRecipientSmsEditable: ").append(toIndentedString(lockedRecipientSmsEditable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    noteMetadata: ").append(toIndentedString(noteMetadata)).append("\n");
    sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
    sb.append("    recipientAttachments: ").append(toIndentedString(recipientAttachments)).append("\n");
    sb.append("    recipientAuthenticationStatus: ").append(toIndentedString(recipientAuthenticationStatus)).append("\n");
    sb.append("    recipientFeatureMetadata: ").append(toIndentedString(recipientFeatureMetadata)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    recipientTypeMetadata: ").append(toIndentedString(recipientTypeMetadata)).append("\n");
    sb.append("    requireIdLookup: ").append(toIndentedString(requireIdLookup)).append("\n");
    sb.append("    requireIdLookupMetadata: ").append(toIndentedString(requireIdLookupMetadata)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    routingOrderMetadata: ").append(toIndentedString(routingOrderMetadata)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    signedDateTime: ").append(toIndentedString(signedDateTime)).append("\n");
    sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
    sb.append("    signingGroupIdMetadata: ").append(toIndentedString(signingGroupIdMetadata)).append("\n");
    sb.append("    signingGroupName: ").append(toIndentedString(signingGroupName)).append("\n");
    sb.append("    signingGroupUsers: ").append(toIndentedString(signingGroupUsers)).append("\n");
    sb.append("    smsAuthentication: ").append(toIndentedString(smsAuthentication)).append("\n");
    sb.append("    socialAuthentications: ").append(toIndentedString(socialAuthentications)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    suppressEmails: ").append(toIndentedString(suppressEmails)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    totalTabCount: ").append(toIndentedString(totalTabCount)).append("\n");
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

