package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.DocumentVisibility;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.RecipientAttachment;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.RecipientSAMLAuthentication;
import com.docusign.esign.model.RecipientSMSAuthentication;
import com.docusign.esign.model.SocialAuthentication;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Editor   {
  
  private String accessCode = null;
  private String addAccessCodeToEmail = null;
  private String clientUserId = null;
  private java.util.List<String> customFields = new java.util.ArrayList<String>();
  private String declinedDateTime = null;
  private String declinedReason = null;
  private String deliveredDateTime = null;
  private String deliveryMethod = null;
  private java.util.List<DocumentVisibility> documentVisibility = new java.util.ArrayList<DocumentVisibility>();
  private String email = null;
  private RecipientEmailNotification emailNotification = null;
  private String emailRecipientPostSigningURL = null;
  private String embeddedRecipientStartURL = null;
  private ErrorDetails errorDetails = null;
  private String faxNumber = null;
  private String idCheckConfigurationName = null;
  private IdCheckInformationInput idCheckInformationInput = null;
  private String inheritEmailNotificationConfiguration = null;
  private String name = null;
  private String note = null;
  private RecipientPhoneAuthentication phoneAuthentication = null;
  private java.util.List<RecipientAttachment> recipientAttachments = new java.util.ArrayList<RecipientAttachment>();
  private AuthenticationStatus recipientAuthenticationStatus = null;
  private String recipientId = null;
  private String recipientIdGuid = null;
  private String requireIdLookup = null;
  private String roleName = null;
  private String routingOrder = null;
  private RecipientSAMLAuthentication samlAuthentication = null;
  private String sentDateTime = null;
  private String signedDateTime = null;
  private String signingGroupId = null;
  private String signingGroupName = null;
  private java.util.List<UserInfo> signingGroupUsers = new java.util.ArrayList<UserInfo>();
  private RecipientSMSAuthentication smsAuthentication = null;
  private java.util.List<SocialAuthentication> socialAuthentications = new java.util.ArrayList<SocialAuthentication>();
  private String status = null;
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
   * legal name of the recipient.\n\nMaximum Length: 100 characters.
   **/
  
  @ApiModelProperty(value = "legal name of the recipient.\n\nMaximum Length: 100 characters.")
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
    Editor editor = (Editor) o;

    return true && Objects.equals(accessCode, editor.accessCode) &&
        Objects.equals(addAccessCodeToEmail, editor.addAccessCodeToEmail) &&
        Objects.equals(clientUserId, editor.clientUserId) &&
        Objects.equals(customFields, editor.customFields) &&
        Objects.equals(declinedDateTime, editor.declinedDateTime) &&
        Objects.equals(declinedReason, editor.declinedReason) &&
        Objects.equals(deliveredDateTime, editor.deliveredDateTime) &&
        Objects.equals(deliveryMethod, editor.deliveryMethod) &&
        Objects.equals(documentVisibility, editor.documentVisibility) &&
        Objects.equals(email, editor.email) &&
        Objects.equals(emailNotification, editor.emailNotification) &&
        Objects.equals(emailRecipientPostSigningURL, editor.emailRecipientPostSigningURL) &&
        Objects.equals(embeddedRecipientStartURL, editor.embeddedRecipientStartURL) &&
        Objects.equals(errorDetails, editor.errorDetails) &&
        Objects.equals(faxNumber, editor.faxNumber) &&
        Objects.equals(idCheckConfigurationName, editor.idCheckConfigurationName) &&
        Objects.equals(idCheckInformationInput, editor.idCheckInformationInput) &&
        Objects.equals(inheritEmailNotificationConfiguration, editor.inheritEmailNotificationConfiguration) &&
        Objects.equals(name, editor.name) &&
        Objects.equals(note, editor.note) &&
        Objects.equals(phoneAuthentication, editor.phoneAuthentication) &&
        Objects.equals(recipientAttachments, editor.recipientAttachments) &&
        Objects.equals(recipientAuthenticationStatus, editor.recipientAuthenticationStatus) &&
        Objects.equals(recipientId, editor.recipientId) &&
        Objects.equals(recipientIdGuid, editor.recipientIdGuid) &&
        Objects.equals(requireIdLookup, editor.requireIdLookup) &&
        Objects.equals(roleName, editor.roleName) &&
        Objects.equals(routingOrder, editor.routingOrder) &&
        Objects.equals(samlAuthentication, editor.samlAuthentication) &&
        Objects.equals(sentDateTime, editor.sentDateTime) &&
        Objects.equals(signedDateTime, editor.signedDateTime) &&
        Objects.equals(signingGroupId, editor.signingGroupId) &&
        Objects.equals(signingGroupName, editor.signingGroupName) &&
        Objects.equals(signingGroupUsers, editor.signingGroupUsers) &&
        Objects.equals(smsAuthentication, editor.smsAuthentication) &&
        Objects.equals(socialAuthentications, editor.socialAuthentications) &&
        Objects.equals(status, editor.status) &&
        Objects.equals(templateLocked, editor.templateLocked) &&
        Objects.equals(templateRequired, editor.templateRequired) &&
        Objects.equals(totalTabCount, editor.totalTabCount) &&
        Objects.equals(userId, editor.userId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, addAccessCodeToEmail, clientUserId, customFields, declinedDateTime, declinedReason, deliveredDateTime, deliveryMethod, documentVisibility, email, emailNotification, emailRecipientPostSigningURL, embeddedRecipientStartURL, errorDetails, faxNumber, idCheckConfigurationName, idCheckInformationInput, inheritEmailNotificationConfiguration, name, note, phoneAuthentication, recipientAttachments, recipientAuthenticationStatus, recipientId, recipientIdGuid, requireIdLookup, roleName, routingOrder, samlAuthentication, sentDateTime, signedDateTime, signingGroupId, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, templateLocked, templateRequired, totalTabCount, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Editor {\n");
    
    if (accessCode != null)
      sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    if (addAccessCodeToEmail != null)
      sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
    if (clientUserId != null)
      sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    if (customFields != null)
      sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    if (declinedDateTime != null)
      sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    if (declinedReason != null)
      sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
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
    if (faxNumber != null)
      sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    if (idCheckConfigurationName != null)
      sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    if (idCheckInformationInput != null)
      sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
    if (inheritEmailNotificationConfiguration != null)
      sb.append("    inheritEmailNotificationConfiguration: ").append(toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (note != null)
      sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
    if (requireIdLookup != null)
      sb.append("    requireIdLookup: ").append(toIndentedString(requireIdLookup)).append("\n");
    if (roleName != null)
      sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    if (routingOrder != null)
      sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    if (samlAuthentication != null)
      sb.append("    samlAuthentication: ").append(toIndentedString(samlAuthentication)).append("\n");
    if (sentDateTime != null)
      sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    if (signedDateTime != null)
      sb.append("    signedDateTime: ").append(toIndentedString(signedDateTime)).append("\n");
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

