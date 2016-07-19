package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Attachment;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.OfflineAttributes;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.RecipientSAMLAuthentication;
import com.docusign.esign.model.RecipientSMSAuthentication;
import com.docusign.esign.model.RecipientSignatureInformation;
import com.docusign.esign.model.SocialAuthentication;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class InPersonSigner   {
  
  private String hostName = null;
  private String hostEmail = null;
  private String signerName = null;
  private String signerEmail = null;
  private RecipientSignatureInformation signatureInfo = null;
  private String autoNavigation = null;
  private String defaultRecipient = null;
  private OfflineAttributes offlineAttributes = null;
  private Tabs tabs = null;
  private String signInEachLocation = null;
  private String requireSignerCertificate = null;
  private String requireSignOnPaper = null;
  private String canSignOffline = null;
  private String recipientSuppliesTabs = null;
  private String signingGroupId = null;
  private String signingGroupName = null;
  private java.util.List<UserInfo> signingGroupUsers = new java.util.ArrayList<UserInfo>();
  private String recipientId = null;
  private String recipientIdGuid = null;
  private String accessCode = null;
  private String addAccessCodeToEmail = null;
  private String requireIdLookup = null;
  private String idCheckConfigurationName = null;
  private java.util.List<SocialAuthentication> socialAuthentications = new java.util.ArrayList<SocialAuthentication>();
  private RecipientPhoneAuthentication phoneAuthentication = null;
  private RecipientSAMLAuthentication samlAuthentication = null;
  private RecipientSMSAuthentication smsAuthentication = null;
  private String userId = null;
  private String clientUserId = null;
  private String embeddedRecipientStartURL = null;
  private java.util.List<String> customFields = new java.util.ArrayList<String>();
  private String routingOrder = null;
  private IdCheckInformationInput idCheckInformationInput = null;
  private java.util.List<Attachment> recipientAttachments = new java.util.ArrayList<Attachment>();
  private String note = null;
  private String roleName = null;
  private String status = null;
  private String signedDateTime = null;
  private String deliveredDateTime = null;
  private String declinedDateTime = null;
  private String sentDateTime = null;
  private String declinedReason = null;
  private String deliveryMethod = null;
  private String faxNumber = null;
  private String templateLocked = null;
  private String templateRequired = null;
  private RecipientEmailNotification emailNotification = null;
  private String inheritEmailNotificationConfiguration = null;
  private ErrorDetails errorDetails = null;
  private AuthenticationStatus recipientAuthenticationStatus = null;
  private String totalTabCount = null;

  
  /**
   * Specifies the name of the signing host. It is a required element for In Person Signers recipient Type. \nMaximum Length: 100 characters.
   **/
  public InPersonSigner hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the name of the signing host. It is a required element for In Person Signers recipient Type. \nMaximum Length: 100 characters.")
  @JsonProperty("hostName")
  public String getHostName() {
    return hostName;
  }
  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  
  /**
   * 
   **/
  public InPersonSigner hostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hostEmail")
  public String getHostEmail() {
    return hostEmail;
  }
  public void setHostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
  }

  
  /**
   * Required. The full legal name of a signer for the envelope. \n\nMaximum Length: 100 characters.\n\n\n
   **/
  public InPersonSigner signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required. The full legal name of a signer for the envelope. \n\nMaximum Length: 100 characters.\n\n\n")
  @JsonProperty("signerName")
  public String getSignerName() {
    return signerName;
  }
  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }

  
  /**
   * The email address for an InPersonSigner recipient Type. \n\nMaximum Length: 100 characters. 
   **/
  public InPersonSigner signerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email address for an InPersonSigner recipient Type. \n\nMaximum Length: 100 characters. ")
  @JsonProperty("signerEmail")
  public String getSignerEmail() {
    return signerEmail;
  }
  public void setSignerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
  }

  
  /**
   **/
  public InPersonSigner signatureInfo(RecipientSignatureInformation signatureInfo) {
    this.signatureInfo = signatureInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("signatureInfo")
  public RecipientSignatureInformation getSignatureInfo() {
    return signatureInfo;
  }
  public void setSignatureInfo(RecipientSignatureInformation signatureInfo) {
    this.signatureInfo = signatureInfo;
  }

  
  /**
   * 
   **/
  public InPersonSigner autoNavigation(String autoNavigation) {
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
   * 
   **/
  public InPersonSigner defaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultRecipient")
  public String getDefaultRecipient() {
    return defaultRecipient;
  }
  public void setDefaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
  }

  
  /**
   **/
  public InPersonSigner offlineAttributes(OfflineAttributes offlineAttributes) {
    this.offlineAttributes = offlineAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("offlineAttributes")
  public OfflineAttributes getOfflineAttributes() {
    return offlineAttributes;
  }
  public void setOfflineAttributes(OfflineAttributes offlineAttributes) {
    this.offlineAttributes = offlineAttributes;
  }

  
  /**
   **/
  public InPersonSigner tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tabs")
  public Tabs getTabs() {
    return tabs;
  }
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }

  
  /**
   * When set to **true**, specifies that the signer must sign in all locations.
   **/
  public InPersonSigner signInEachLocation(String signInEachLocation) {
    this.signInEachLocation = signInEachLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, specifies that the signer must sign in all locations.")
  @JsonProperty("signInEachLocation")
  public String getSignInEachLocation() {
    return signInEachLocation;
  }
  public void setSignInEachLocation(String signInEachLocation) {
    this.signInEachLocation = signInEachLocation;
  }

  
  /**
   * 
   **/
  public InPersonSigner requireSignerCertificate(String requireSignerCertificate) {
    this.requireSignerCertificate = requireSignerCertificate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requireSignerCertificate")
  public String getRequireSignerCertificate() {
    return requireSignerCertificate;
  }
  public void setRequireSignerCertificate(String requireSignerCertificate) {
    this.requireSignerCertificate = requireSignerCertificate;
  }

  
  /**
   * 
   **/
  public InPersonSigner requireSignOnPaper(String requireSignOnPaper) {
    this.requireSignOnPaper = requireSignOnPaper;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requireSignOnPaper")
  public String getRequireSignOnPaper() {
    return requireSignOnPaper;
  }
  public void setRequireSignOnPaper(String requireSignOnPaper) {
    this.requireSignOnPaper = requireSignOnPaper;
  }

  
  /**
   * When set to **true**, specifies that the signer can perform the signing ceremony offline.
   **/
  public InPersonSigner canSignOffline(String canSignOffline) {
    this.canSignOffline = canSignOffline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, specifies that the signer can perform the signing ceremony offline.")
  @JsonProperty("canSignOffline")
  public String getCanSignOffline() {
    return canSignOffline;
  }
  public void setCanSignOffline(String canSignOffline) {
    this.canSignOffline = canSignOffline;
  }

  
  /**
   * 
   **/
  public InPersonSigner recipientSuppliesTabs(String recipientSuppliesTabs) {
    this.recipientSuppliesTabs = recipientSuppliesTabs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipientSuppliesTabs")
  public String getRecipientSuppliesTabs() {
    return recipientSuppliesTabs;
  }
  public void setRecipientSuppliesTabs(String recipientSuppliesTabs) {
    this.recipientSuppliesTabs = recipientSuppliesTabs;
  }

  
  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   **/
  public InPersonSigner signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
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
  public InPersonSigner signingGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The display name for the signing group. \n\nMaximum Length: 100 characters. ")
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
  public InPersonSigner signingGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A complex type that contains information about users in the signing group.")
  @JsonProperty("signingGroupUsers")
  public java.util.List<UserInfo> getSigningGroupUsers() {
    return signingGroupUsers;
  }
  public void setSigningGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
  }

  
  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   **/
  public InPersonSigner recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
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
  public InPersonSigner recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipientIdGuid")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }
  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  
  /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account\u2019s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.
   **/
  public InPersonSigner accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account\u2019s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.")
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
  public InPersonSigner addAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.")
  @JsonProperty("addAccessCodeToEmail")
  public String getAddAccessCodeToEmail() {
    return addAccessCodeToEmail;
  }
  public void setAddAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
  }

  
  /**
   * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. 
   **/
  public InPersonSigner requireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. ")
  @JsonProperty("requireIdLookup")
  public String getRequireIdLookup() {
    return requireIdLookup;
  }
  public void setRequireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
  }

  
  /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
   **/
  public InPersonSigner idCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  @JsonProperty("idCheckConfigurationName")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }
  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }

  
  /**
   *  Lists the social ID type that can be used for recipient authentication.
   **/
  public InPersonSigner socialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " Lists the social ID type that can be used for recipient authentication.")
  @JsonProperty("socialAuthentications")
  public java.util.List<SocialAuthentication> getSocialAuthentications() {
    return socialAuthentications;
  }
  public void setSocialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
  }

  
  /**
   **/
  public InPersonSigner phoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneAuthentication")
  public RecipientPhoneAuthentication getPhoneAuthentication() {
    return phoneAuthentication;
  }
  public void setPhoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
  }

  
  /**
   **/
  public InPersonSigner samlAuthentication(RecipientSAMLAuthentication samlAuthentication) {
    this.samlAuthentication = samlAuthentication;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("samlAuthentication")
  public RecipientSAMLAuthentication getSamlAuthentication() {
    return samlAuthentication;
  }
  public void setSamlAuthentication(RecipientSAMLAuthentication samlAuthentication) {
    this.samlAuthentication = samlAuthentication;
  }

  
  /**
   **/
  public InPersonSigner smsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("smsAuthentication")
  public RecipientSMSAuthentication getSmsAuthentication() {
    return smsAuthentication;
  }
  public void setSmsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
  }

  
  /**
   * 
   **/
  public InPersonSigner userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters. 
   **/
  public InPersonSigner clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters. ")
  @JsonProperty("clientUserId")
  public String getClientUserId() {
    return clientUserId;
  }
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  
  /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender\u2019s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient\u2019s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` 
   **/
  public InPersonSigner embeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender\u2019s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient\u2019s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
  @JsonProperty("embeddedRecipientStartURL")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }
  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }

  
  /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
   **/
  public InPersonSigner customFields(java.util.List<String> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  @JsonProperty("customFields")
  public java.util.List<String> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(java.util.List<String> customFields) {
    this.customFields = customFields;
  }

  
  /**
   * Specifies the routing order of the recipient in the envelope. 
   **/
  public InPersonSigner routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the routing order of the recipient in the envelope. ")
  @JsonProperty("routingOrder")
  public String getRoutingOrder() {
    return routingOrder;
  }
  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }

  
  /**
   **/
  public InPersonSigner idCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idCheckInformationInput")
  public IdCheckInformationInput getIdCheckInformationInput() {
    return idCheckInformationInput;
  }
  public void setIdCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
  }

  
  /**
   * Reserved:
   **/
  public InPersonSigner recipientAttachments(java.util.List<Attachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved:")
  @JsonProperty("recipientAttachments")
  public java.util.List<Attachment> getRecipientAttachments() {
    return recipientAttachments;
  }
  public void setRecipientAttachments(java.util.List<Attachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
  }

  
  /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.\n\nMaximum Length: 1000 characters.
   **/
  public InPersonSigner note(String note) {
    this.note = note;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.\n\nMaximum Length: 1000 characters.")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  
  /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
   **/
  public InPersonSigner roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  @JsonProperty("roleName")
  public String getRoleName() {
    return roleName;
  }
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  public InPersonSigner status(String status) {
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
   * Reserved: For DocuSign use only. 
   **/
  public InPersonSigner signedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only. ")
  @JsonProperty("signedDateTime")
  public String getSignedDateTime() {
    return signedDateTime;
  }
  public void setSignedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
  }

  
  /**
   * Reserved: For DocuSign use only.
   **/
  public InPersonSigner deliveredDateTime(String deliveredDateTime) {
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
   * The date and time the recipient declined the document.
   **/
  public InPersonSigner declinedDateTime(String declinedDateTime) {
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
   * The date and time the envelope was sent.
   **/
  public InPersonSigner sentDateTime(String sentDateTime) {
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
   * The reason the recipient declined the document.
   **/
  public InPersonSigner declinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason the recipient declined the document.")
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
  public InPersonSigner deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only.")
  @JsonProperty("deliveryMethod")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }
  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  
  /**
   * Reserved:
   **/
  public InPersonSigner faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved:")
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  
  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. 
   **/
  public InPersonSigner templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
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
  public InPersonSigner templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  @JsonProperty("templateRequired")
  public String getTemplateRequired() {
    return templateRequired;
  }
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  
  /**
   **/
  public InPersonSigner emailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emailNotification")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }
  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }

  
  /**
   * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. 
   **/
  public InPersonSigner inheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. ")
  @JsonProperty("inheritEmailNotificationConfiguration")
  public String getInheritEmailNotificationConfiguration() {
    return inheritEmailNotificationConfiguration;
  }
  public void setInheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
  }

  
  /**
   **/
  public InPersonSigner errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   **/
  public InPersonSigner recipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipientAuthenticationStatus")
  public AuthenticationStatus getRecipientAuthenticationStatus() {
    return recipientAuthenticationStatus;
  }
  public void setRecipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
  }

  
  /**
   * 
   **/
  public InPersonSigner totalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalTabCount")
  public String getTotalTabCount() {
    return totalTabCount;
  }
  public void setTotalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InPersonSigner inPersonSigner = (InPersonSigner) o;
    return Objects.equals(this.hostName, inPersonSigner.hostName) &&
        Objects.equals(this.hostEmail, inPersonSigner.hostEmail) &&
        Objects.equals(this.signerName, inPersonSigner.signerName) &&
        Objects.equals(this.signerEmail, inPersonSigner.signerEmail) &&
        Objects.equals(this.signatureInfo, inPersonSigner.signatureInfo) &&
        Objects.equals(this.autoNavigation, inPersonSigner.autoNavigation) &&
        Objects.equals(this.defaultRecipient, inPersonSigner.defaultRecipient) &&
        Objects.equals(this.offlineAttributes, inPersonSigner.offlineAttributes) &&
        Objects.equals(this.tabs, inPersonSigner.tabs) &&
        Objects.equals(this.signInEachLocation, inPersonSigner.signInEachLocation) &&
        Objects.equals(this.requireSignerCertificate, inPersonSigner.requireSignerCertificate) &&
        Objects.equals(this.requireSignOnPaper, inPersonSigner.requireSignOnPaper) &&
        Objects.equals(this.canSignOffline, inPersonSigner.canSignOffline) &&
        Objects.equals(this.recipientSuppliesTabs, inPersonSigner.recipientSuppliesTabs) &&
        Objects.equals(this.signingGroupId, inPersonSigner.signingGroupId) &&
        Objects.equals(this.signingGroupName, inPersonSigner.signingGroupName) &&
        Objects.equals(this.signingGroupUsers, inPersonSigner.signingGroupUsers) &&
        Objects.equals(this.recipientId, inPersonSigner.recipientId) &&
        Objects.equals(this.recipientIdGuid, inPersonSigner.recipientIdGuid) &&
        Objects.equals(this.accessCode, inPersonSigner.accessCode) &&
        Objects.equals(this.addAccessCodeToEmail, inPersonSigner.addAccessCodeToEmail) &&
        Objects.equals(this.requireIdLookup, inPersonSigner.requireIdLookup) &&
        Objects.equals(this.idCheckConfigurationName, inPersonSigner.idCheckConfigurationName) &&
        Objects.equals(this.socialAuthentications, inPersonSigner.socialAuthentications) &&
        Objects.equals(this.phoneAuthentication, inPersonSigner.phoneAuthentication) &&
        Objects.equals(this.samlAuthentication, inPersonSigner.samlAuthentication) &&
        Objects.equals(this.smsAuthentication, inPersonSigner.smsAuthentication) &&
        Objects.equals(this.userId, inPersonSigner.userId) &&
        Objects.equals(this.clientUserId, inPersonSigner.clientUserId) &&
        Objects.equals(this.embeddedRecipientStartURL, inPersonSigner.embeddedRecipientStartURL) &&
        Objects.equals(this.customFields, inPersonSigner.customFields) &&
        Objects.equals(this.routingOrder, inPersonSigner.routingOrder) &&
        Objects.equals(this.idCheckInformationInput, inPersonSigner.idCheckInformationInput) &&
        Objects.equals(this.recipientAttachments, inPersonSigner.recipientAttachments) &&
        Objects.equals(this.note, inPersonSigner.note) &&
        Objects.equals(this.roleName, inPersonSigner.roleName) &&
        Objects.equals(this.status, inPersonSigner.status) &&
        Objects.equals(this.signedDateTime, inPersonSigner.signedDateTime) &&
        Objects.equals(this.deliveredDateTime, inPersonSigner.deliveredDateTime) &&
        Objects.equals(this.declinedDateTime, inPersonSigner.declinedDateTime) &&
        Objects.equals(this.sentDateTime, inPersonSigner.sentDateTime) &&
        Objects.equals(this.declinedReason, inPersonSigner.declinedReason) &&
        Objects.equals(this.deliveryMethod, inPersonSigner.deliveryMethod) &&
        Objects.equals(this.faxNumber, inPersonSigner.faxNumber) &&
        Objects.equals(this.templateLocked, inPersonSigner.templateLocked) &&
        Objects.equals(this.templateRequired, inPersonSigner.templateRequired) &&
        Objects.equals(this.emailNotification, inPersonSigner.emailNotification) &&
        Objects.equals(this.inheritEmailNotificationConfiguration, inPersonSigner.inheritEmailNotificationConfiguration) &&
        Objects.equals(this.errorDetails, inPersonSigner.errorDetails) &&
        Objects.equals(this.recipientAuthenticationStatus, inPersonSigner.recipientAuthenticationStatus) &&
        Objects.equals(this.totalTabCount, inPersonSigner.totalTabCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostName, hostEmail, signerName, signerEmail, signatureInfo, autoNavigation, defaultRecipient, offlineAttributes, tabs, signInEachLocation, requireSignerCertificate, requireSignOnPaper, canSignOffline, recipientSuppliesTabs, signingGroupId, signingGroupName, signingGroupUsers, recipientId, recipientIdGuid, accessCode, addAccessCodeToEmail, requireIdLookup, idCheckConfigurationName, socialAuthentications, phoneAuthentication, samlAuthentication, smsAuthentication, userId, clientUserId, embeddedRecipientStartURL, customFields, routingOrder, idCheckInformationInput, recipientAttachments, note, roleName, status, signedDateTime, deliveredDateTime, declinedDateTime, sentDateTime, declinedReason, deliveryMethod, faxNumber, templateLocked, templateRequired, emailNotification, inheritEmailNotificationConfiguration, errorDetails, recipientAuthenticationStatus, totalTabCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InPersonSigner {\n");
    
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    hostEmail: ").append(toIndentedString(hostEmail)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    signerEmail: ").append(toIndentedString(signerEmail)).append("\n");
    sb.append("    signatureInfo: ").append(toIndentedString(signatureInfo)).append("\n");
    sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
    sb.append("    defaultRecipient: ").append(toIndentedString(defaultRecipient)).append("\n");
    sb.append("    offlineAttributes: ").append(toIndentedString(offlineAttributes)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    signInEachLocation: ").append(toIndentedString(signInEachLocation)).append("\n");
    sb.append("    requireSignerCertificate: ").append(toIndentedString(requireSignerCertificate)).append("\n");
    sb.append("    requireSignOnPaper: ").append(toIndentedString(requireSignOnPaper)).append("\n");
    sb.append("    canSignOffline: ").append(toIndentedString(canSignOffline)).append("\n");
    sb.append("    recipientSuppliesTabs: ").append(toIndentedString(recipientSuppliesTabs)).append("\n");
    sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
    sb.append("    signingGroupName: ").append(toIndentedString(signingGroupName)).append("\n");
    sb.append("    signingGroupUsers: ").append(toIndentedString(signingGroupUsers)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
    sb.append("    requireIdLookup: ").append(toIndentedString(requireIdLookup)).append("\n");
    sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    sb.append("    socialAuthentications: ").append(toIndentedString(socialAuthentications)).append("\n");
    sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
    sb.append("    samlAuthentication: ").append(toIndentedString(samlAuthentication)).append("\n");
    sb.append("    smsAuthentication: ").append(toIndentedString(smsAuthentication)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    embeddedRecipientStartURL: ").append(toIndentedString(embeddedRecipientStartURL)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
    sb.append("    recipientAttachments: ").append(toIndentedString(recipientAttachments)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    signedDateTime: ").append(toIndentedString(signedDateTime)).append("\n");
    sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
    sb.append("    inheritEmailNotificationConfiguration: ").append(toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    recipientAuthenticationStatus: ").append(toIndentedString(recipientAuthenticationStatus)).append("\n");
    sb.append("    totalTabCount: ").append(toIndentedString(totalTabCount)).append("\n");
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

