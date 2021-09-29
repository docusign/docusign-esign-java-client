package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.DocumentVisibility;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.FeatureAvailableMetadata;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.OfflineAttributes;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.RecipientAdditionalNotification;
import com.docusign.esign.model.RecipientAttachment;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientIdentityVerification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.RecipientPhoneNumber;
import com.docusign.esign.model.RecipientProofFile;
import com.docusign.esign.model.RecipientSMSAuthentication;
import com.docusign.esign.model.RecipientSignatureInformation;
import com.docusign.esign.model.RecipientSignatureProvider;
import com.docusign.esign.model.SocialAuthentication;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Signer.
 *
 */

public class Signer {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("accessCodeMetadata")
  private PropertyMetadata accessCodeMetadata = null;

  @JsonProperty("addAccessCodeToEmail")
  private String addAccessCodeToEmail = null;

  @JsonProperty("additionalNotifications")
  private java.util.List<RecipientAdditionalNotification> additionalNotifications = null;

  @JsonProperty("agentCanEditEmail")
  private String agentCanEditEmail = null;

  @JsonProperty("agentCanEditName")
  private String agentCanEditName = null;

  @JsonProperty("allowSystemOverrideForLockedRecipient")
  private String allowSystemOverrideForLockedRecipient = null;

  @JsonProperty("autoNavigation")
  private String autoNavigation = null;

  @JsonProperty("autoRespondedReason")
  private String autoRespondedReason = null;

  @JsonProperty("bulkRecipientsUri")
  private String bulkRecipientsUri = null;

  @JsonProperty("canSignOffline")
  private String canSignOffline = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("completedCount")
  private String completedCount = null;

  @JsonProperty("creationReason")
  private String creationReason = null;

  @JsonProperty("customFields")
  private java.util.List<String> customFields = null;

  @JsonProperty("declinedDateTime")
  private String declinedDateTime = null;

  @JsonProperty("declinedReason")
  private String declinedReason = null;

  @JsonProperty("defaultRecipient")
  private String defaultRecipient = null;

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
  private java.util.List<DocumentVisibility> documentVisibility = null;

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

  @JsonProperty("excludedDocuments")
  private java.util.List<String> excludedDocuments = null;

  @JsonProperty("faxNumber")
  private String faxNumber = null;

  @JsonProperty("faxNumberMetadata")
  private PropertyMetadata faxNumberMetadata = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("firstNameMetadata")
  private PropertyMetadata firstNameMetadata = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("fullNameMetadata")
  private PropertyMetadata fullNameMetadata = null;

  @JsonProperty("idCheckConfigurationName")
  private String idCheckConfigurationName = null;

  @JsonProperty("idCheckConfigurationNameMetadata")
  private PropertyMetadata idCheckConfigurationNameMetadata = null;

  @JsonProperty("idCheckInformationInput")
  private IdCheckInformationInput idCheckInformationInput = null;

  @JsonProperty("identityVerification")
  private RecipientIdentityVerification identityVerification = null;

  @JsonProperty("inheritEmailNotificationConfiguration")
  private String inheritEmailNotificationConfiguration = null;

  @JsonProperty("isBulkRecipient")
  private String isBulkRecipient = null;

  @JsonProperty("isBulkRecipientMetadata")
  private PropertyMetadata isBulkRecipientMetadata = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("lastNameMetadata")
  private PropertyMetadata lastNameMetadata = null;

  @JsonProperty("lockedRecipientPhoneAuthEditable")
  private String lockedRecipientPhoneAuthEditable = null;

  @JsonProperty("lockedRecipientSmsEditable")
  private String lockedRecipientSmsEditable = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameMetadata")
  private PropertyMetadata nameMetadata = null;

  @JsonProperty("notaryId")
  private String notaryId = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("noteMetadata")
  private PropertyMetadata noteMetadata = null;

  @JsonProperty("offlineAttributes")
  private OfflineAttributes offlineAttributes = null;

  @JsonProperty("phoneAuthentication")
  private RecipientPhoneAuthentication phoneAuthentication = null;

  @JsonProperty("phoneNumber")
  private RecipientPhoneNumber phoneNumber = null;

  @JsonProperty("proofFile")
  private RecipientProofFile proofFile = null;

  @JsonProperty("recipientAttachments")
  private java.util.List<RecipientAttachment> recipientAttachments = null;

  @JsonProperty("recipientAuthenticationStatus")
  private AuthenticationStatus recipientAuthenticationStatus = null;

  @JsonProperty("recipientFeatureMetadata")
  private java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdGuid")
  private String recipientIdGuid = null;

  @JsonProperty("recipientSignatureProviders")
  private java.util.List<RecipientSignatureProvider> recipientSignatureProviders = null;

  @JsonProperty("recipientSuppliesTabs")
  private String recipientSuppliesTabs = null;

  @JsonProperty("recipientType")
  private String recipientType = null;

  @JsonProperty("recipientTypeMetadata")
  private PropertyMetadata recipientTypeMetadata = null;

  @JsonProperty("requireIdLookup")
  private String requireIdLookup = null;

  @JsonProperty("requireIdLookupMetadata")
  private PropertyMetadata requireIdLookupMetadata = null;

  @JsonProperty("requireSignerCertificate")
  private String requireSignerCertificate = null;

  @JsonProperty("requireSignOnPaper")
  private String requireSignOnPaper = null;

  @JsonProperty("requireUploadSignature")
  private String requireUploadSignature = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("routingOrder")
  private String routingOrder = null;

  @JsonProperty("routingOrderMetadata")
  private PropertyMetadata routingOrderMetadata = null;

  @JsonProperty("sentDateTime")
  private String sentDateTime = null;

  @JsonProperty("signatureInfo")
  private RecipientSignatureInformation signatureInfo = null;

  @JsonProperty("signedDateTime")
  private String signedDateTime = null;

  @JsonProperty("signInEachLocation")
  private String signInEachLocation = null;

  @JsonProperty("signInEachLocationMetadata")
  private PropertyMetadata signInEachLocationMetadata = null;

  @JsonProperty("signingGroupId")
  private String signingGroupId = null;

  @JsonProperty("signingGroupIdMetadata")
  private PropertyMetadata signingGroupIdMetadata = null;

  @JsonProperty("signingGroupName")
  private String signingGroupName = null;

  @JsonProperty("signingGroupUsers")
  private java.util.List<UserInfo> signingGroupUsers = null;

  @JsonProperty("smsAuthentication")
  private RecipientSMSAuthentication smsAuthentication = null;

  @JsonProperty("socialAuthentications")
  private java.util.List<SocialAuthentication> socialAuthentications = null;

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


  /**
   * accessCode.
   *
   * @return Signer
   **/
  public Signer accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required..
   * @return accessCode
   **/
  @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
  public String getAccessCode() {
    return accessCode;
  }

  /**
   * setAccessCode.
   **/
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  /**
   * accessCodeMetadata.
   *
   * @return Signer
   **/
  public Signer accessCodeMetadata(PropertyMetadata accessCodeMetadata) {
    this.accessCodeMetadata = accessCodeMetadata;
    return this;
  }

  /**
   * Get accessCodeMetadata.
   * @return accessCodeMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAccessCodeMetadata() {
    return accessCodeMetadata;
  }

  /**
   * setAccessCodeMetadata.
   **/
  public void setAccessCodeMetadata(PropertyMetadata accessCodeMetadata) {
    this.accessCodeMetadata = accessCodeMetadata;
  }


  /**
   * addAccessCodeToEmail.
   *
   * @return Signer
   **/
  public Signer addAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
    return this;
  }

  /**
   * This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient..
   * @return addAccessCodeToEmail
   **/
  @ApiModelProperty(value = "This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.")
  public String getAddAccessCodeToEmail() {
    return addAccessCodeToEmail;
  }

  /**
   * setAddAccessCodeToEmail.
   **/
  public void setAddAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
  }


  /**
   * additionalNotifications.
   *
   * @return Signer
   **/
  public Signer additionalNotifications(java.util.List<RecipientAdditionalNotification> additionalNotifications) {
    this.additionalNotifications = additionalNotifications;
    return this;
  }
  
  /**
   * addAdditionalNotificationsItem.
   *
   * @return Signer
   **/
  public Signer addAdditionalNotificationsItem(RecipientAdditionalNotification additionalNotificationsItem) {
    if (this.additionalNotifications == null) {
      this.additionalNotifications = new java.util.ArrayList<RecipientAdditionalNotification>();
    }
    this.additionalNotifications.add(additionalNotificationsItem);
    return this;
  }

  /**
   * .
   * @return additionalNotifications
   **/
  @ApiModelProperty(value = "")
  public java.util.List<RecipientAdditionalNotification> getAdditionalNotifications() {
    return additionalNotifications;
  }

  /**
   * setAdditionalNotifications.
   **/
  public void setAdditionalNotifications(java.util.List<RecipientAdditionalNotification> additionalNotifications) {
    this.additionalNotifications = additionalNotifications;
  }


  /**
   * agentCanEditEmail.
   *
   * @return Signer
   **/
  public Signer agentCanEditEmail(String agentCanEditEmail) {
    this.agentCanEditEmail = agentCanEditEmail;
    return this;
  }

  /**
   * .
   * @return agentCanEditEmail
   **/
  @ApiModelProperty(value = "")
  public String getAgentCanEditEmail() {
    return agentCanEditEmail;
  }

  /**
   * setAgentCanEditEmail.
   **/
  public void setAgentCanEditEmail(String agentCanEditEmail) {
    this.agentCanEditEmail = agentCanEditEmail;
  }


  /**
   * agentCanEditName.
   *
   * @return Signer
   **/
  public Signer agentCanEditName(String agentCanEditName) {
    this.agentCanEditName = agentCanEditName;
    return this;
  }

  /**
   * .
   * @return agentCanEditName
   **/
  @ApiModelProperty(value = "")
  public String getAgentCanEditName() {
    return agentCanEditName;
  }

  /**
   * setAgentCanEditName.
   **/
  public void setAgentCanEditName(String agentCanEditName) {
    this.agentCanEditName = agentCanEditName;
  }


  /**
   * allowSystemOverrideForLockedRecipient.
   *
   * @return Signer
   **/
  public Signer allowSystemOverrideForLockedRecipient(String allowSystemOverrideForLockedRecipient) {
    this.allowSystemOverrideForLockedRecipient = allowSystemOverrideForLockedRecipient;
    return this;
  }

  /**
   * .
   * @return allowSystemOverrideForLockedRecipient
   **/
  @ApiModelProperty(value = "")
  public String getAllowSystemOverrideForLockedRecipient() {
    return allowSystemOverrideForLockedRecipient;
  }

  /**
   * setAllowSystemOverrideForLockedRecipient.
   **/
  public void setAllowSystemOverrideForLockedRecipient(String allowSystemOverrideForLockedRecipient) {
    this.allowSystemOverrideForLockedRecipient = allowSystemOverrideForLockedRecipient;
  }


  /**
   * autoNavigation.
   *
   * @return Signer
   **/
  public Signer autoNavigation(String autoNavigation) {
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
   * autoRespondedReason.
   *
   * @return Signer
   **/
  public Signer autoRespondedReason(String autoRespondedReason) {
    this.autoRespondedReason = autoRespondedReason;
    return this;
  }

  /**
   * .
   * @return autoRespondedReason
   **/
  @ApiModelProperty(value = "")
  public String getAutoRespondedReason() {
    return autoRespondedReason;
  }

  /**
   * setAutoRespondedReason.
   **/
  public void setAutoRespondedReason(String autoRespondedReason) {
    this.autoRespondedReason = autoRespondedReason;
  }


  /**
   * bulkRecipientsUri.
   *
   * @return Signer
   **/
  public Signer bulkRecipientsUri(String bulkRecipientsUri) {
    this.bulkRecipientsUri = bulkRecipientsUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information..
   * @return bulkRecipientsUri
   **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information.")
  public String getBulkRecipientsUri() {
    return bulkRecipientsUri;
  }

  /**
   * setBulkRecipientsUri.
   **/
  public void setBulkRecipientsUri(String bulkRecipientsUri) {
    this.bulkRecipientsUri = bulkRecipientsUri;
  }


  /**
   * canSignOffline.
   *
   * @return Signer
   **/
  public Signer canSignOffline(String canSignOffline) {
    this.canSignOffline = canSignOffline;
    return this;
  }

  /**
   * When set to **true**, specifies that the signer can perform the signing ceremony offline..
   * @return canSignOffline
   **/
  @ApiModelProperty(value = "When set to **true**, specifies that the signer can perform the signing ceremony offline.")
  public String getCanSignOffline() {
    return canSignOffline;
  }

  /**
   * setCanSignOffline.
   **/
  public void setCanSignOffline(String canSignOffline) {
    this.canSignOffline = canSignOffline;
  }


  /**
   * clientUserId.
   *
   * @return Signer
   **/
  public Signer clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

  /**
   * Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. .
   * @return clientUserId
   **/
  @ApiModelProperty(value = "Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. ")
  public String getClientUserId() {
    return clientUserId;
  }

  /**
   * setClientUserId.
   **/
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  /**
   * completedCount.
   *
   * @return Signer
   **/
  public Signer completedCount(String completedCount) {
    this.completedCount = completedCount;
    return this;
  }

  /**
   * .
   * @return completedCount
   **/
  @ApiModelProperty(value = "")
  public String getCompletedCount() {
    return completedCount;
  }

  /**
   * setCompletedCount.
   **/
  public void setCompletedCount(String completedCount) {
    this.completedCount = completedCount;
  }


  /**
   * creationReason.
   *
   * @return Signer
   **/
  public Signer creationReason(String creationReason) {
    this.creationReason = creationReason;
    return this;
  }

  /**
   * .
   * @return creationReason
   **/
  @ApiModelProperty(value = "")
  public String getCreationReason() {
    return creationReason;
  }

  /**
   * setCreationReason.
   **/
  public void setCreationReason(String creationReason) {
    this.creationReason = creationReason;
  }


  /**
   * customFields.
   *
   * @return Signer
   **/
  public Signer customFields(java.util.List<String> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  /**
   * addCustomFieldsItem.
   *
   * @return Signer
   **/
  public Signer addCustomFieldsItem(String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new java.util.ArrayList<String>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters..
   * @return customFields
   **/
  @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  public java.util.List<String> getCustomFields() {
    return customFields;
  }

  /**
   * setCustomFields.
   **/
  public void setCustomFields(java.util.List<String> customFields) {
    this.customFields = customFields;
  }


  /**
   * declinedDateTime.
   *
   * @return Signer
   **/
  public Signer declinedDateTime(String declinedDateTime) {
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
   * declinedReason.
   *
   * @return Signer
   **/
  public Signer declinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
    return this;
  }

  /**
   * The reason the recipient declined the document..
   * @return declinedReason
   **/
  @ApiModelProperty(value = "The reason the recipient declined the document.")
  public String getDeclinedReason() {
    return declinedReason;
  }

  /**
   * setDeclinedReason.
   **/
  public void setDeclinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
  }


  /**
   * defaultRecipient.
   *
   * @return Signer
   **/
  public Signer defaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
    return this;
  }

  /**
   * .
   * @return defaultRecipient
   **/
  @ApiModelProperty(value = "")
  public String getDefaultRecipient() {
    return defaultRecipient;
  }

  /**
   * setDefaultRecipient.
   **/
  public void setDefaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
  }


  /**
   * deliveredDateTime.
   *
   * @return Signer
   **/
  public Signer deliveredDateTime(String deliveredDateTime) {
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
   * deliveryMethod.
   *
   * @return Signer
   **/
  public Signer deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * Reserved: For DocuSign use only..
   * @return deliveryMethod
   **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }

  /**
   * setDeliveryMethod.
   **/
  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }


  /**
   * deliveryMethodMetadata.
   *
   * @return Signer
   **/
  public Signer deliveryMethodMetadata(PropertyMetadata deliveryMethodMetadata) {
    this.deliveryMethodMetadata = deliveryMethodMetadata;
    return this;
  }

  /**
   * Get deliveryMethodMetadata.
   * @return deliveryMethodMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getDeliveryMethodMetadata() {
    return deliveryMethodMetadata;
  }

  /**
   * setDeliveryMethodMetadata.
   **/
  public void setDeliveryMethodMetadata(PropertyMetadata deliveryMethodMetadata) {
    this.deliveryMethodMetadata = deliveryMethodMetadata;
  }


  /**
   * designatorId.
   *
   * @return Signer
   **/
  public Signer designatorId(String designatorId) {
    this.designatorId = designatorId;
    return this;
  }

  /**
   * .
   * @return designatorId
   **/
  @ApiModelProperty(value = "")
  public String getDesignatorId() {
    return designatorId;
  }

  /**
   * setDesignatorId.
   **/
  public void setDesignatorId(String designatorId) {
    this.designatorId = designatorId;
  }


  /**
   * designatorIdGuid.
   *
   * @return Signer
   **/
  public Signer designatorIdGuid(String designatorIdGuid) {
    this.designatorIdGuid = designatorIdGuid;
    return this;
  }

  /**
   * .
   * @return designatorIdGuid
   **/
  @ApiModelProperty(value = "")
  public String getDesignatorIdGuid() {
    return designatorIdGuid;
  }

  /**
   * setDesignatorIdGuid.
   **/
  public void setDesignatorIdGuid(String designatorIdGuid) {
    this.designatorIdGuid = designatorIdGuid;
  }


  /**
   * documentVisibility.
   *
   * @return Signer
   **/
  public Signer documentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }
  
  /**
   * addDocumentVisibilityItem.
   *
   * @return Signer
   **/
  public Signer addDocumentVisibilityItem(DocumentVisibility documentVisibilityItem) {
    if (this.documentVisibility == null) {
      this.documentVisibility = new java.util.ArrayList<DocumentVisibility>();
    }
    this.documentVisibility.add(documentVisibilityItem);
    return this;
  }

  /**
   * .
   * @return documentVisibility
   **/
  @ApiModelProperty(value = "")
  public java.util.List<DocumentVisibility> getDocumentVisibility() {
    return documentVisibility;
  }

  /**
   * setDocumentVisibility.
   **/
  public void setDocumentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
  }


  /**
   * email.
   *
   * @return Signer
   **/
  public Signer email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email id of the recipient. Notification of the document to sign is sent to this email id.   Maximum length: 100 characters. .
   * @return email
   **/
  @ApiModelProperty(value = "Email id of the recipient. Notification of the document to sign is sent to this email id.   Maximum length: 100 characters. ")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * emailMetadata.
   *
   * @return Signer
   **/
  public Signer emailMetadata(PropertyMetadata emailMetadata) {
    this.emailMetadata = emailMetadata;
    return this;
  }

  /**
   * Get emailMetadata.
   * @return emailMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getEmailMetadata() {
    return emailMetadata;
  }

  /**
   * setEmailMetadata.
   **/
  public void setEmailMetadata(PropertyMetadata emailMetadata) {
    this.emailMetadata = emailMetadata;
  }


  /**
   * emailNotification.
   *
   * @return Signer
   **/
  public Signer emailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
    return this;
  }

  /**
   * Get emailNotification.
   * @return emailNotification
   **/
  @ApiModelProperty(value = "")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }

  /**
   * setEmailNotification.
   **/
  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }


  /**
   * embeddedRecipientStartURL.
   *
   * @return Signer
   **/
  public Signer embeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    return this;
  }

  /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` .
   * @return embeddedRecipientStartURL
   **/
  @ApiModelProperty(value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }

  /**
   * setEmbeddedRecipientStartURL.
   **/
  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }


  /**
   * errorDetails.
   *
   * @return Signer
   **/
  public Signer errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * excludedDocuments.
   *
   * @return Signer
   **/
  public Signer excludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
    return this;
  }
  
  /**
   * addExcludedDocumentsItem.
   *
   * @return Signer
   **/
  public Signer addExcludedDocumentsItem(String excludedDocumentsItem) {
    if (this.excludedDocuments == null) {
      this.excludedDocuments = new java.util.ArrayList<String>();
    }
    this.excludedDocuments.add(excludedDocumentsItem);
    return this;
  }

  /**
   * Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent..
   * @return excludedDocuments
   **/
  @ApiModelProperty(value = "Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.")
  public java.util.List<String> getExcludedDocuments() {
    return excludedDocuments;
  }

  /**
   * setExcludedDocuments.
   **/
  public void setExcludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
  }


  /**
   * faxNumber.
   *
   * @return Signer
   **/
  public Signer faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Reserved:.
   * @return faxNumber
   **/
  @ApiModelProperty(value = "Reserved:")
  public String getFaxNumber() {
    return faxNumber;
  }

  /**
   * setFaxNumber.
   **/
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }


  /**
   * faxNumberMetadata.
   *
   * @return Signer
   **/
  public Signer faxNumberMetadata(PropertyMetadata faxNumberMetadata) {
    this.faxNumberMetadata = faxNumberMetadata;
    return this;
  }

  /**
   * Get faxNumberMetadata.
   * @return faxNumberMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getFaxNumberMetadata() {
    return faxNumberMetadata;
  }

  /**
   * setFaxNumberMetadata.
   **/
  public void setFaxNumberMetadata(PropertyMetadata faxNumberMetadata) {
    this.faxNumberMetadata = faxNumberMetadata;
  }


  /**
   * firstName.
   *
   * @return Signer
   **/
  public Signer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The user's first name.  Maximum Length: 50 characters..
   * @return firstName
   **/
  @ApiModelProperty(value = "The user's first name.  Maximum Length: 50 characters.")
  public String getFirstName() {
    return firstName;
  }

  /**
   * setFirstName.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * firstNameMetadata.
   *
   * @return Signer
   **/
  public Signer firstNameMetadata(PropertyMetadata firstNameMetadata) {
    this.firstNameMetadata = firstNameMetadata;
    return this;
  }

  /**
   * Get firstNameMetadata.
   * @return firstNameMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getFirstNameMetadata() {
    return firstNameMetadata;
  }

  /**
   * setFirstNameMetadata.
   **/
  public void setFirstNameMetadata(PropertyMetadata firstNameMetadata) {
    this.firstNameMetadata = firstNameMetadata;
  }


  /**
   * fullName.
   *
   * @return Signer
   **/
  public Signer fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * .
   * @return fullName
   **/
  @ApiModelProperty(value = "")
  public String getFullName() {
    return fullName;
  }

  /**
   * setFullName.
   **/
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  /**
   * fullNameMetadata.
   *
   * @return Signer
   **/
  public Signer fullNameMetadata(PropertyMetadata fullNameMetadata) {
    this.fullNameMetadata = fullNameMetadata;
    return this;
  }

  /**
   * Get fullNameMetadata.
   * @return fullNameMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getFullNameMetadata() {
    return fullNameMetadata;
  }

  /**
   * setFullNameMetadata.
   **/
  public void setFullNameMetadata(PropertyMetadata fullNameMetadata) {
    this.fullNameMetadata = fullNameMetadata;
  }


  /**
   * idCheckConfigurationName.
   *
   * @return Signer
   **/
  public Signer idCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
    return this;
  }

  /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node..
   * @return idCheckConfigurationName
   **/
  @ApiModelProperty(value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }

  /**
   * setIdCheckConfigurationName.
   **/
  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }


  /**
   * idCheckConfigurationNameMetadata.
   *
   * @return Signer
   **/
  public Signer idCheckConfigurationNameMetadata(PropertyMetadata idCheckConfigurationNameMetadata) {
    this.idCheckConfigurationNameMetadata = idCheckConfigurationNameMetadata;
    return this;
  }

  /**
   * Get idCheckConfigurationNameMetadata.
   * @return idCheckConfigurationNameMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getIdCheckConfigurationNameMetadata() {
    return idCheckConfigurationNameMetadata;
  }

  /**
   * setIdCheckConfigurationNameMetadata.
   **/
  public void setIdCheckConfigurationNameMetadata(PropertyMetadata idCheckConfigurationNameMetadata) {
    this.idCheckConfigurationNameMetadata = idCheckConfigurationNameMetadata;
  }


  /**
   * idCheckInformationInput.
   *
   * @return Signer
   **/
  public Signer idCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
    return this;
  }

  /**
   * Get idCheckInformationInput.
   * @return idCheckInformationInput
   **/
  @ApiModelProperty(value = "")
  public IdCheckInformationInput getIdCheckInformationInput() {
    return idCheckInformationInput;
  }

  /**
   * setIdCheckInformationInput.
   **/
  public void setIdCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
  }


  /**
   * identityVerification.
   *
   * @return Signer
   **/
  public Signer identityVerification(RecipientIdentityVerification identityVerification) {
    this.identityVerification = identityVerification;
    return this;
  }

  /**
   * Get identityVerification.
   * @return identityVerification
   **/
  @ApiModelProperty(value = "")
  public RecipientIdentityVerification getIdentityVerification() {
    return identityVerification;
  }

  /**
   * setIdentityVerification.
   **/
  public void setIdentityVerification(RecipientIdentityVerification identityVerification) {
    this.identityVerification = identityVerification;
  }


  /**
   * inheritEmailNotificationConfiguration.
   *
   * @return Signer
   **/
  public Signer inheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
    return this;
  }

  /**
   * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. .
   * @return inheritEmailNotificationConfiguration
   **/
  @ApiModelProperty(value = "When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. ")
  public String getInheritEmailNotificationConfiguration() {
    return inheritEmailNotificationConfiguration;
  }

  /**
   * setInheritEmailNotificationConfiguration.
   **/
  public void setInheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
  }


  /**
   * isBulkRecipient.
   *
   * @return Signer
   **/
  public Signer isBulkRecipient(String isBulkRecipient) {
    this.isBulkRecipient = isBulkRecipient;
    return this;
  }

  /**
   * When set to **true**, this signer is a bulk recipient and the recipient information is contained in a bulk recipient file.   Note that when this is true the email and name for the recipient becomes bulk@recipient.com and \"Bulk Recipient\". These fields can not be changed for the bulk recipient.  .
   * @return isBulkRecipient
   **/
  @ApiModelProperty(value = "When set to **true**, this signer is a bulk recipient and the recipient information is contained in a bulk recipient file.   Note that when this is true the email and name for the recipient becomes bulk@recipient.com and \"Bulk Recipient\". These fields can not be changed for the bulk recipient.  ")
  public String getIsBulkRecipient() {
    return isBulkRecipient;
  }

  /**
   * setIsBulkRecipient.
   **/
  public void setIsBulkRecipient(String isBulkRecipient) {
    this.isBulkRecipient = isBulkRecipient;
  }


  /**
   * isBulkRecipientMetadata.
   *
   * @return Signer
   **/
  public Signer isBulkRecipientMetadata(PropertyMetadata isBulkRecipientMetadata) {
    this.isBulkRecipientMetadata = isBulkRecipientMetadata;
    return this;
  }

  /**
   * Get isBulkRecipientMetadata.
   * @return isBulkRecipientMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getIsBulkRecipientMetadata() {
    return isBulkRecipientMetadata;
  }

  /**
   * setIsBulkRecipientMetadata.
   **/
  public void setIsBulkRecipientMetadata(PropertyMetadata isBulkRecipientMetadata) {
    this.isBulkRecipientMetadata = isBulkRecipientMetadata;
  }


  /**
   * lastName.
   *
   * @return Signer
   **/
  public Signer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * .
   * @return lastName
   **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  /**
   * setLastName.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * lastNameMetadata.
   *
   * @return Signer
   **/
  public Signer lastNameMetadata(PropertyMetadata lastNameMetadata) {
    this.lastNameMetadata = lastNameMetadata;
    return this;
  }

  /**
   * Get lastNameMetadata.
   * @return lastNameMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getLastNameMetadata() {
    return lastNameMetadata;
  }

  /**
   * setLastNameMetadata.
   **/
  public void setLastNameMetadata(PropertyMetadata lastNameMetadata) {
    this.lastNameMetadata = lastNameMetadata;
  }


  /**
   * lockedRecipientPhoneAuthEditable.
   *
   * @return Signer
   **/
  public Signer lockedRecipientPhoneAuthEditable(String lockedRecipientPhoneAuthEditable) {
    this.lockedRecipientPhoneAuthEditable = lockedRecipientPhoneAuthEditable;
    return this;
  }

  /**
   * .
   * @return lockedRecipientPhoneAuthEditable
   **/
  @ApiModelProperty(value = "")
  public String getLockedRecipientPhoneAuthEditable() {
    return lockedRecipientPhoneAuthEditable;
  }

  /**
   * setLockedRecipientPhoneAuthEditable.
   **/
  public void setLockedRecipientPhoneAuthEditable(String lockedRecipientPhoneAuthEditable) {
    this.lockedRecipientPhoneAuthEditable = lockedRecipientPhoneAuthEditable;
  }


  /**
   * lockedRecipientSmsEditable.
   *
   * @return Signer
   **/
  public Signer lockedRecipientSmsEditable(String lockedRecipientSmsEditable) {
    this.lockedRecipientSmsEditable = lockedRecipientSmsEditable;
    return this;
  }

  /**
   * .
   * @return lockedRecipientSmsEditable
   **/
  @ApiModelProperty(value = "")
  public String getLockedRecipientSmsEditable() {
    return lockedRecipientSmsEditable;
  }

  /**
   * setLockedRecipientSmsEditable.
   **/
  public void setLockedRecipientSmsEditable(String lockedRecipientSmsEditable) {
    this.lockedRecipientSmsEditable = lockedRecipientSmsEditable;
  }


  /**
   * name.
   *
   * @return Signer
   **/
  public Signer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * nameMetadata.
   *
   * @return Signer
   **/
  public Signer nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

  /**
   * Get nameMetadata.
   * @return nameMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getNameMetadata() {
    return nameMetadata;
  }

  /**
   * setNameMetadata.
   **/
  public void setNameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
  }


  /**
   * notaryId.
   *
   * @return Signer
   **/
  public Signer notaryId(String notaryId) {
    this.notaryId = notaryId;
    return this;
  }

  /**
   * .
   * @return notaryId
   **/
  @ApiModelProperty(value = "")
  public String getNotaryId() {
    return notaryId;
  }

  /**
   * setNotaryId.
   **/
  public void setNotaryId(String notaryId) {
    this.notaryId = notaryId;
  }


  /**
   * note.
   *
   * @return Signer
   **/
  public Signer note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters..
   * @return note
   **/
  @ApiModelProperty(value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.")
  public String getNote() {
    return note;
  }

  /**
   * setNote.
   **/
  public void setNote(String note) {
    this.note = note;
  }


  /**
   * noteMetadata.
   *
   * @return Signer
   **/
  public Signer noteMetadata(PropertyMetadata noteMetadata) {
    this.noteMetadata = noteMetadata;
    return this;
  }

  /**
   * Get noteMetadata.
   * @return noteMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getNoteMetadata() {
    return noteMetadata;
  }

  /**
   * setNoteMetadata.
   **/
  public void setNoteMetadata(PropertyMetadata noteMetadata) {
    this.noteMetadata = noteMetadata;
  }


  /**
   * offlineAttributes.
   *
   * @return Signer
   **/
  public Signer offlineAttributes(OfflineAttributes offlineAttributes) {
    this.offlineAttributes = offlineAttributes;
    return this;
  }

  /**
   * Get offlineAttributes.
   * @return offlineAttributes
   **/
  @ApiModelProperty(value = "")
  public OfflineAttributes getOfflineAttributes() {
    return offlineAttributes;
  }

  /**
   * setOfflineAttributes.
   **/
  public void setOfflineAttributes(OfflineAttributes offlineAttributes) {
    this.offlineAttributes = offlineAttributes;
  }


  /**
   * phoneAuthentication.
   *
   * @return Signer
   **/
  public Signer phoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
    return this;
  }

  /**
   * Get phoneAuthentication.
   * @return phoneAuthentication
   **/
  @ApiModelProperty(value = "")
  public RecipientPhoneAuthentication getPhoneAuthentication() {
    return phoneAuthentication;
  }

  /**
   * setPhoneAuthentication.
   **/
  public void setPhoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
  }


  /**
   * phoneNumber.
   *
   * @return Signer
   **/
  public Signer phoneNumber(RecipientPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber.
   * @return phoneNumber
   **/
  @ApiModelProperty(value = "")
  public RecipientPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * setPhoneNumber.
   **/
  public void setPhoneNumber(RecipientPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * proofFile.
   *
   * @return Signer
   **/
  public Signer proofFile(RecipientProofFile proofFile) {
    this.proofFile = proofFile;
    return this;
  }

  /**
   * Get proofFile.
   * @return proofFile
   **/
  @ApiModelProperty(value = "")
  public RecipientProofFile getProofFile() {
    return proofFile;
  }

  /**
   * setProofFile.
   **/
  public void setProofFile(RecipientProofFile proofFile) {
    this.proofFile = proofFile;
  }


  /**
   * recipientAttachments.
   *
   * @return Signer
   **/
  public Signer recipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
    return this;
  }
  
  /**
   * addRecipientAttachmentsItem.
   *
   * @return Signer
   **/
  public Signer addRecipientAttachmentsItem(RecipientAttachment recipientAttachmentsItem) {
    if (this.recipientAttachments == null) {
      this.recipientAttachments = new java.util.ArrayList<RecipientAttachment>();
    }
    this.recipientAttachments.add(recipientAttachmentsItem);
    return this;
  }

  /**
   * Reserved:.
   * @return recipientAttachments
   **/
  @ApiModelProperty(value = "Reserved:")
  public java.util.List<RecipientAttachment> getRecipientAttachments() {
    return recipientAttachments;
  }

  /**
   * setRecipientAttachments.
   **/
  public void setRecipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
  }


  /**
   * recipientAuthenticationStatus.
   *
   * @return Signer
   **/
  public Signer recipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
    return this;
  }

  /**
   * Get recipientAuthenticationStatus.
   * @return recipientAuthenticationStatus
   **/
  @ApiModelProperty(value = "")
  public AuthenticationStatus getRecipientAuthenticationStatus() {
    return recipientAuthenticationStatus;
  }

  /**
   * setRecipientAuthenticationStatus.
   **/
  public void setRecipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
  }


  /**
   * recipientFeatureMetadata.
   *
   * @return Signer
   **/
  public Signer recipientFeatureMetadata(java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata) {
    this.recipientFeatureMetadata = recipientFeatureMetadata;
    return this;
  }
  
  /**
   * addRecipientFeatureMetadataItem.
   *
   * @return Signer
   **/
  public Signer addRecipientFeatureMetadataItem(FeatureAvailableMetadata recipientFeatureMetadataItem) {
    if (this.recipientFeatureMetadata == null) {
      this.recipientFeatureMetadata = new java.util.ArrayList<FeatureAvailableMetadata>();
    }
    this.recipientFeatureMetadata.add(recipientFeatureMetadataItem);
    return this;
  }

  /**
   * .
   * @return recipientFeatureMetadata
   **/
  @ApiModelProperty(value = "")
  public java.util.List<FeatureAvailableMetadata> getRecipientFeatureMetadata() {
    return recipientFeatureMetadata;
  }

  /**
   * setRecipientFeatureMetadata.
   **/
  public void setRecipientFeatureMetadata(java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata) {
    this.recipientFeatureMetadata = recipientFeatureMetadata;
  }


  /**
   * recipientId.
   *
   * @return Signer
   **/
  public Signer recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document..
   * @return recipientId
   **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  /**
   * setRecipientId.
   **/
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  /**
   * recipientIdGuid.
   *
   * @return Signer
   **/
  public Signer recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

  /**
   * .
   * @return recipientIdGuid
   **/
  @ApiModelProperty(value = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  /**
   * setRecipientIdGuid.
   **/
  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }


  /**
   * recipientSignatureProviders.
   *
   * @return Signer
   **/
  public Signer recipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
    return this;
  }
  
  /**
   * addRecipientSignatureProvidersItem.
   *
   * @return Signer
   **/
  public Signer addRecipientSignatureProvidersItem(RecipientSignatureProvider recipientSignatureProvidersItem) {
    if (this.recipientSignatureProviders == null) {
      this.recipientSignatureProviders = new java.util.ArrayList<RecipientSignatureProvider>();
    }
    this.recipientSignatureProviders.add(recipientSignatureProvidersItem);
    return this;
  }

  /**
   * .
   * @return recipientSignatureProviders
   **/
  @ApiModelProperty(value = "")
  public java.util.List<RecipientSignatureProvider> getRecipientSignatureProviders() {
    return recipientSignatureProviders;
  }

  /**
   * setRecipientSignatureProviders.
   **/
  public void setRecipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
  }


  /**
   * recipientSuppliesTabs.
   *
   * @return Signer
   **/
  public Signer recipientSuppliesTabs(String recipientSuppliesTabs) {
    this.recipientSuppliesTabs = recipientSuppliesTabs;
    return this;
  }

  /**
   * .
   * @return recipientSuppliesTabs
   **/
  @ApiModelProperty(value = "")
  public String getRecipientSuppliesTabs() {
    return recipientSuppliesTabs;
  }

  /**
   * setRecipientSuppliesTabs.
   **/
  public void setRecipientSuppliesTabs(String recipientSuppliesTabs) {
    this.recipientSuppliesTabs = recipientSuppliesTabs;
  }


  /**
   * recipientType.
   *
   * @return Signer
   **/
  public Signer recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  /**
   * .
   * @return recipientType
   **/
  @ApiModelProperty(value = "")
  public String getRecipientType() {
    return recipientType;
  }

  /**
   * setRecipientType.
   **/
  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }


  /**
   * recipientTypeMetadata.
   *
   * @return Signer
   **/
  public Signer recipientTypeMetadata(PropertyMetadata recipientTypeMetadata) {
    this.recipientTypeMetadata = recipientTypeMetadata;
    return this;
  }

  /**
   * Get recipientTypeMetadata.
   * @return recipientTypeMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getRecipientTypeMetadata() {
    return recipientTypeMetadata;
  }

  /**
   * setRecipientTypeMetadata.
   **/
  public void setRecipientTypeMetadata(PropertyMetadata recipientTypeMetadata) {
    this.recipientTypeMetadata = recipientTypeMetadata;
  }


  /**
   * requireIdLookup.
   *
   * @return Signer
   **/
  public Signer requireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
    return this;
  }

  /**
   * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. .
   * @return requireIdLookup
   **/
  @ApiModelProperty(value = "When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. ")
  public String getRequireIdLookup() {
    return requireIdLookup;
  }

  /**
   * setRequireIdLookup.
   **/
  public void setRequireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
  }


  /**
   * requireIdLookupMetadata.
   *
   * @return Signer
   **/
  public Signer requireIdLookupMetadata(PropertyMetadata requireIdLookupMetadata) {
    this.requireIdLookupMetadata = requireIdLookupMetadata;
    return this;
  }

  /**
   * Get requireIdLookupMetadata.
   * @return requireIdLookupMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getRequireIdLookupMetadata() {
    return requireIdLookupMetadata;
  }

  /**
   * setRequireIdLookupMetadata.
   **/
  public void setRequireIdLookupMetadata(PropertyMetadata requireIdLookupMetadata) {
    this.requireIdLookupMetadata = requireIdLookupMetadata;
  }


  /**
   * requireSignerCertificate.
   *
   * @return Signer
   **/
  public Signer requireSignerCertificate(String requireSignerCertificate) {
    this.requireSignerCertificate = requireSignerCertificate;
    return this;
  }

  /**
   * Sets the type of signer certificate required for signing. If left blank, no certificate is required. Only one type of certificate can be set for a signer. The possible values are:  * docusign_express - Requires a DocuSign Express certificate. * safe - Requires a SAFE-BioPharma certificate. * open_trust - Requires an OpenTrust certificate.   **Important**: There are certain rules and restrictions that must be followed when requiring OpenTrust digital signatures. See [ML:OpenTrust Rules and Restrictions] for more information.   .
   * @return requireSignerCertificate
   **/
  @ApiModelProperty(value = "Sets the type of signer certificate required for signing. If left blank, no certificate is required. Only one type of certificate can be set for a signer. The possible values are:  * docusign_express - Requires a DocuSign Express certificate. * safe - Requires a SAFE-BioPharma certificate. * open_trust - Requires an OpenTrust certificate.   **Important**: There are certain rules and restrictions that must be followed when requiring OpenTrust digital signatures. See [ML:OpenTrust Rules and Restrictions] for more information.   ")
  public String getRequireSignerCertificate() {
    return requireSignerCertificate;
  }

  /**
   * setRequireSignerCertificate.
   **/
  public void setRequireSignerCertificate(String requireSignerCertificate) {
    this.requireSignerCertificate = requireSignerCertificate;
  }


  /**
   * requireSignOnPaper.
   *
   * @return Signer
   **/
  public Signer requireSignOnPaper(String requireSignOnPaper) {
    this.requireSignOnPaper = requireSignOnPaper;
    return this;
  }

  /**
   * When set to **true**, the signer must print, sign, and upload or fax the signed documents to DocuSign..
   * @return requireSignOnPaper
   **/
  @ApiModelProperty(value = "When set to **true**, the signer must print, sign, and upload or fax the signed documents to DocuSign.")
  public String getRequireSignOnPaper() {
    return requireSignOnPaper;
  }

  /**
   * setRequireSignOnPaper.
   **/
  public void setRequireSignOnPaper(String requireSignOnPaper) {
    this.requireSignOnPaper = requireSignOnPaper;
  }


  /**
   * requireUploadSignature.
   *
   * @return Signer
   **/
  public Signer requireUploadSignature(String requireUploadSignature) {
    this.requireUploadSignature = requireUploadSignature;
    return this;
  }

  /**
   * .
   * @return requireUploadSignature
   **/
  @ApiModelProperty(value = "")
  public String getRequireUploadSignature() {
    return requireUploadSignature;
  }

  /**
   * setRequireUploadSignature.
   **/
  public void setRequireUploadSignature(String requireUploadSignature) {
    this.requireUploadSignature = requireUploadSignature;
  }


  /**
   * roleName.
   *
   * @return Signer
   **/
  public Signer roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients..
   * @return roleName
   **/
  @ApiModelProperty(value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  public String getRoleName() {
    return roleName;
  }

  /**
   * setRoleName.
   **/
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  /**
   * routingOrder.
   *
   * @return Signer
   **/
  public Signer routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

  /**
   * Specifies the routing order of the recipient in the envelope. .
   * @return routingOrder
   **/
  @ApiModelProperty(value = "Specifies the routing order of the recipient in the envelope. ")
  public String getRoutingOrder() {
    return routingOrder;
  }

  /**
   * setRoutingOrder.
   **/
  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }


  /**
   * routingOrderMetadata.
   *
   * @return Signer
   **/
  public Signer routingOrderMetadata(PropertyMetadata routingOrderMetadata) {
    this.routingOrderMetadata = routingOrderMetadata;
    return this;
  }

  /**
   * Get routingOrderMetadata.
   * @return routingOrderMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getRoutingOrderMetadata() {
    return routingOrderMetadata;
  }

  /**
   * setRoutingOrderMetadata.
   **/
  public void setRoutingOrderMetadata(PropertyMetadata routingOrderMetadata) {
    this.routingOrderMetadata = routingOrderMetadata;
  }


  /**
   * sentDateTime.
   *
   * @return Signer
   **/
  public Signer sentDateTime(String sentDateTime) {
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
   * signatureInfo.
   *
   * @return Signer
   **/
  public Signer signatureInfo(RecipientSignatureInformation signatureInfo) {
    this.signatureInfo = signatureInfo;
    return this;
  }

  /**
   * Get signatureInfo.
   * @return signatureInfo
   **/
  @ApiModelProperty(value = "")
  public RecipientSignatureInformation getSignatureInfo() {
    return signatureInfo;
  }

  /**
   * setSignatureInfo.
   **/
  public void setSignatureInfo(RecipientSignatureInformation signatureInfo) {
    this.signatureInfo = signatureInfo;
  }


  /**
   * signedDateTime.
   *
   * @return Signer
   **/
  public Signer signedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
    return this;
  }

  /**
   * Reserved: For DocuSign use only. .
   * @return signedDateTime
   **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only. ")
  public String getSignedDateTime() {
    return signedDateTime;
  }

  /**
   * setSignedDateTime.
   **/
  public void setSignedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
  }


  /**
   * signInEachLocation.
   *
   * @return Signer
   **/
  public Signer signInEachLocation(String signInEachLocation) {
    this.signInEachLocation = signInEachLocation;
    return this;
  }

  /**
   * When set to **true**, specifies that the signer must sign in all locations..
   * @return signInEachLocation
   **/
  @ApiModelProperty(value = "When set to **true**, specifies that the signer must sign in all locations.")
  public String getSignInEachLocation() {
    return signInEachLocation;
  }

  /**
   * setSignInEachLocation.
   **/
  public void setSignInEachLocation(String signInEachLocation) {
    this.signInEachLocation = signInEachLocation;
  }


  /**
   * signInEachLocationMetadata.
   *
   * @return Signer
   **/
  public Signer signInEachLocationMetadata(PropertyMetadata signInEachLocationMetadata) {
    this.signInEachLocationMetadata = signInEachLocationMetadata;
    return this;
  }

  /**
   * Get signInEachLocationMetadata.
   * @return signInEachLocationMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getSignInEachLocationMetadata() {
    return signInEachLocationMetadata;
  }

  /**
   * setSignInEachLocationMetadata.
   **/
  public void setSignInEachLocationMetadata(PropertyMetadata signInEachLocationMetadata) {
    this.signInEachLocationMetadata = signInEachLocationMetadata;
  }


  /**
   * signingGroupId.
   *
   * @return Signer
   **/
  public Signer signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once)..
   * @return signingGroupId
   **/
  @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  /**
   * setSigningGroupId.
   **/
  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }


  /**
   * signingGroupIdMetadata.
   *
   * @return Signer
   **/
  public Signer signingGroupIdMetadata(PropertyMetadata signingGroupIdMetadata) {
    this.signingGroupIdMetadata = signingGroupIdMetadata;
    return this;
  }

  /**
   * Get signingGroupIdMetadata.
   * @return signingGroupIdMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getSigningGroupIdMetadata() {
    return signingGroupIdMetadata;
  }

  /**
   * setSigningGroupIdMetadata.
   **/
  public void setSigningGroupIdMetadata(PropertyMetadata signingGroupIdMetadata) {
    this.signingGroupIdMetadata = signingGroupIdMetadata;
  }


  /**
   * signingGroupName.
   *
   * @return Signer
   **/
  public Signer signingGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
    return this;
  }

  /**
   * The display name for the signing group.   Maximum Length: 100 characters. .
   * @return signingGroupName
   **/
  @ApiModelProperty(value = "The display name for the signing group.   Maximum Length: 100 characters. ")
  public String getSigningGroupName() {
    return signingGroupName;
  }

  /**
   * setSigningGroupName.
   **/
  public void setSigningGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
  }


  /**
   * signingGroupUsers.
   *
   * @return Signer
   **/
  public Signer signingGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
    return this;
  }
  
  /**
   * addSigningGroupUsersItem.
   *
   * @return Signer
   **/
  public Signer addSigningGroupUsersItem(UserInfo signingGroupUsersItem) {
    if (this.signingGroupUsers == null) {
      this.signingGroupUsers = new java.util.ArrayList<UserInfo>();
    }
    this.signingGroupUsers.add(signingGroupUsersItem);
    return this;
  }

  /**
   * A complex type that contains information about users in the signing group..
   * @return signingGroupUsers
   **/
  @ApiModelProperty(value = "A complex type that contains information about users in the signing group.")
  public java.util.List<UserInfo> getSigningGroupUsers() {
    return signingGroupUsers;
  }

  /**
   * setSigningGroupUsers.
   **/
  public void setSigningGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
  }


  /**
   * smsAuthentication.
   *
   * @return Signer
   **/
  public Signer smsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
    return this;
  }

  /**
   * Get smsAuthentication.
   * @return smsAuthentication
   **/
  @ApiModelProperty(value = "")
  public RecipientSMSAuthentication getSmsAuthentication() {
    return smsAuthentication;
  }

  /**
   * setSmsAuthentication.
   **/
  public void setSmsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
  }


  /**
   * socialAuthentications.
   *
   * @return Signer
   **/
  public Signer socialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
    return this;
  }
  
  /**
   * addSocialAuthenticationsItem.
   *
   * @return Signer
   **/
  public Signer addSocialAuthenticationsItem(SocialAuthentication socialAuthenticationsItem) {
    if (this.socialAuthentications == null) {
      this.socialAuthentications = new java.util.ArrayList<SocialAuthentication>();
    }
    this.socialAuthentications.add(socialAuthenticationsItem);
    return this;
  }

  /**
   *  Lists the social ID type that can be used for recipient authentication..
   * @return socialAuthentications
   **/
  @ApiModelProperty(value = " Lists the social ID type that can be used for recipient authentication.")
  public java.util.List<SocialAuthentication> getSocialAuthentications() {
    return socialAuthentications;
  }

  /**
   * setSocialAuthentications.
   **/
  public void setSocialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
  }


  /**
   * status.
   *
   * @return Signer
   **/
  public Signer status(String status) {
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
   * statusCode.
   *
   * @return Signer
   **/
  public Signer statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * .
   * @return statusCode
   **/
  @ApiModelProperty(value = "")
  public String getStatusCode() {
    return statusCode;
  }

  /**
   * setStatusCode.
   **/
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  /**
   * suppressEmails.
   *
   * @return Signer
   **/
  public Signer suppressEmails(String suppressEmails) {
    this.suppressEmails = suppressEmails;
    return this;
  }

  /**
   * .
   * @return suppressEmails
   **/
  @ApiModelProperty(value = "")
  public String getSuppressEmails() {
    return suppressEmails;
  }

  /**
   * setSuppressEmails.
   **/
  public void setSuppressEmails(String suppressEmails) {
    this.suppressEmails = suppressEmails;
  }


  /**
   * tabs.
   *
   * @return Signer
   **/
  public Signer tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }

  /**
   * Get tabs.
   * @return tabs
   **/
  @ApiModelProperty(value = "")
  public Tabs getTabs() {
    return tabs;
  }

  /**
   * setTabs.
   **/
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }


  /**
   * templateLocked.
   *
   * @return Signer
   **/
  public Signer templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. .
   * @return templateLocked
   **/
  @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  /**
   * setTemplateLocked.
   **/
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }


  /**
   * templateRequired.
   *
   * @return Signer
   **/
  public Signer templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients..
   * @return templateRequired
   **/
  @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  /**
   * setTemplateRequired.
   **/
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }


  /**
   * totalTabCount.
   *
   * @return Signer
   **/
  public Signer totalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
    return this;
  }

  /**
   * .
   * @return totalTabCount
   **/
  @ApiModelProperty(value = "")
  public String getTotalTabCount() {
    return totalTabCount;
  }

  /**
   * setTotalTabCount.
   **/
  public void setTotalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
  }


  /**
   * userId.
   *
   * @return Signer
   **/
  public Signer userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * .
   * @return userId
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
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
    Signer signer = (Signer) o;
    return Objects.equals(this.accessCode, signer.accessCode) &&
        Objects.equals(this.accessCodeMetadata, signer.accessCodeMetadata) &&
        Objects.equals(this.addAccessCodeToEmail, signer.addAccessCodeToEmail) &&
        Objects.equals(this.additionalNotifications, signer.additionalNotifications) &&
        Objects.equals(this.agentCanEditEmail, signer.agentCanEditEmail) &&
        Objects.equals(this.agentCanEditName, signer.agentCanEditName) &&
        Objects.equals(this.allowSystemOverrideForLockedRecipient, signer.allowSystemOverrideForLockedRecipient) &&
        Objects.equals(this.autoNavigation, signer.autoNavigation) &&
        Objects.equals(this.autoRespondedReason, signer.autoRespondedReason) &&
        Objects.equals(this.bulkRecipientsUri, signer.bulkRecipientsUri) &&
        Objects.equals(this.canSignOffline, signer.canSignOffline) &&
        Objects.equals(this.clientUserId, signer.clientUserId) &&
        Objects.equals(this.completedCount, signer.completedCount) &&
        Objects.equals(this.creationReason, signer.creationReason) &&
        Objects.equals(this.customFields, signer.customFields) &&
        Objects.equals(this.declinedDateTime, signer.declinedDateTime) &&
        Objects.equals(this.declinedReason, signer.declinedReason) &&
        Objects.equals(this.defaultRecipient, signer.defaultRecipient) &&
        Objects.equals(this.deliveredDateTime, signer.deliveredDateTime) &&
        Objects.equals(this.deliveryMethod, signer.deliveryMethod) &&
        Objects.equals(this.deliveryMethodMetadata, signer.deliveryMethodMetadata) &&
        Objects.equals(this.designatorId, signer.designatorId) &&
        Objects.equals(this.designatorIdGuid, signer.designatorIdGuid) &&
        Objects.equals(this.documentVisibility, signer.documentVisibility) &&
        Objects.equals(this.email, signer.email) &&
        Objects.equals(this.emailMetadata, signer.emailMetadata) &&
        Objects.equals(this.emailNotification, signer.emailNotification) &&
        Objects.equals(this.embeddedRecipientStartURL, signer.embeddedRecipientStartURL) &&
        Objects.equals(this.errorDetails, signer.errorDetails) &&
        Objects.equals(this.excludedDocuments, signer.excludedDocuments) &&
        Objects.equals(this.faxNumber, signer.faxNumber) &&
        Objects.equals(this.faxNumberMetadata, signer.faxNumberMetadata) &&
        Objects.equals(this.firstName, signer.firstName) &&
        Objects.equals(this.firstNameMetadata, signer.firstNameMetadata) &&
        Objects.equals(this.fullName, signer.fullName) &&
        Objects.equals(this.fullNameMetadata, signer.fullNameMetadata) &&
        Objects.equals(this.idCheckConfigurationName, signer.idCheckConfigurationName) &&
        Objects.equals(this.idCheckConfigurationNameMetadata, signer.idCheckConfigurationNameMetadata) &&
        Objects.equals(this.idCheckInformationInput, signer.idCheckInformationInput) &&
        Objects.equals(this.identityVerification, signer.identityVerification) &&
        Objects.equals(this.inheritEmailNotificationConfiguration, signer.inheritEmailNotificationConfiguration) &&
        Objects.equals(this.isBulkRecipient, signer.isBulkRecipient) &&
        Objects.equals(this.isBulkRecipientMetadata, signer.isBulkRecipientMetadata) &&
        Objects.equals(this.lastName, signer.lastName) &&
        Objects.equals(this.lastNameMetadata, signer.lastNameMetadata) &&
        Objects.equals(this.lockedRecipientPhoneAuthEditable, signer.lockedRecipientPhoneAuthEditable) &&
        Objects.equals(this.lockedRecipientSmsEditable, signer.lockedRecipientSmsEditable) &&
        Objects.equals(this.name, signer.name) &&
        Objects.equals(this.nameMetadata, signer.nameMetadata) &&
        Objects.equals(this.notaryId, signer.notaryId) &&
        Objects.equals(this.note, signer.note) &&
        Objects.equals(this.noteMetadata, signer.noteMetadata) &&
        Objects.equals(this.offlineAttributes, signer.offlineAttributes) &&
        Objects.equals(this.phoneAuthentication, signer.phoneAuthentication) &&
        Objects.equals(this.phoneNumber, signer.phoneNumber) &&
        Objects.equals(this.proofFile, signer.proofFile) &&
        Objects.equals(this.recipientAttachments, signer.recipientAttachments) &&
        Objects.equals(this.recipientAuthenticationStatus, signer.recipientAuthenticationStatus) &&
        Objects.equals(this.recipientFeatureMetadata, signer.recipientFeatureMetadata) &&
        Objects.equals(this.recipientId, signer.recipientId) &&
        Objects.equals(this.recipientIdGuid, signer.recipientIdGuid) &&
        Objects.equals(this.recipientSignatureProviders, signer.recipientSignatureProviders) &&
        Objects.equals(this.recipientSuppliesTabs, signer.recipientSuppliesTabs) &&
        Objects.equals(this.recipientType, signer.recipientType) &&
        Objects.equals(this.recipientTypeMetadata, signer.recipientTypeMetadata) &&
        Objects.equals(this.requireIdLookup, signer.requireIdLookup) &&
        Objects.equals(this.requireIdLookupMetadata, signer.requireIdLookupMetadata) &&
        Objects.equals(this.requireSignerCertificate, signer.requireSignerCertificate) &&
        Objects.equals(this.requireSignOnPaper, signer.requireSignOnPaper) &&
        Objects.equals(this.requireUploadSignature, signer.requireUploadSignature) &&
        Objects.equals(this.roleName, signer.roleName) &&
        Objects.equals(this.routingOrder, signer.routingOrder) &&
        Objects.equals(this.routingOrderMetadata, signer.routingOrderMetadata) &&
        Objects.equals(this.sentDateTime, signer.sentDateTime) &&
        Objects.equals(this.signatureInfo, signer.signatureInfo) &&
        Objects.equals(this.signedDateTime, signer.signedDateTime) &&
        Objects.equals(this.signInEachLocation, signer.signInEachLocation) &&
        Objects.equals(this.signInEachLocationMetadata, signer.signInEachLocationMetadata) &&
        Objects.equals(this.signingGroupId, signer.signingGroupId) &&
        Objects.equals(this.signingGroupIdMetadata, signer.signingGroupIdMetadata) &&
        Objects.equals(this.signingGroupName, signer.signingGroupName) &&
        Objects.equals(this.signingGroupUsers, signer.signingGroupUsers) &&
        Objects.equals(this.smsAuthentication, signer.smsAuthentication) &&
        Objects.equals(this.socialAuthentications, signer.socialAuthentications) &&
        Objects.equals(this.status, signer.status) &&
        Objects.equals(this.statusCode, signer.statusCode) &&
        Objects.equals(this.suppressEmails, signer.suppressEmails) &&
        Objects.equals(this.tabs, signer.tabs) &&
        Objects.equals(this.templateLocked, signer.templateLocked) &&
        Objects.equals(this.templateRequired, signer.templateRequired) &&
        Objects.equals(this.totalTabCount, signer.totalTabCount) &&
        Objects.equals(this.userId, signer.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessCode, accessCodeMetadata, addAccessCodeToEmail, additionalNotifications, agentCanEditEmail, agentCanEditName, allowSystemOverrideForLockedRecipient, autoNavigation, autoRespondedReason, bulkRecipientsUri, canSignOffline, clientUserId, completedCount, creationReason, customFields, declinedDateTime, declinedReason, defaultRecipient, deliveredDateTime, deliveryMethod, deliveryMethodMetadata, designatorId, designatorIdGuid, documentVisibility, email, emailMetadata, emailNotification, embeddedRecipientStartURL, errorDetails, excludedDocuments, faxNumber, faxNumberMetadata, firstName, firstNameMetadata, fullName, fullNameMetadata, idCheckConfigurationName, idCheckConfigurationNameMetadata, idCheckInformationInput, identityVerification, inheritEmailNotificationConfiguration, isBulkRecipient, isBulkRecipientMetadata, lastName, lastNameMetadata, lockedRecipientPhoneAuthEditable, lockedRecipientSmsEditable, name, nameMetadata, notaryId, note, noteMetadata, offlineAttributes, phoneAuthentication, phoneNumber, proofFile, recipientAttachments, recipientAuthenticationStatus, recipientFeatureMetadata, recipientId, recipientIdGuid, recipientSignatureProviders, recipientSuppliesTabs, recipientType, recipientTypeMetadata, requireIdLookup, requireIdLookupMetadata, requireSignerCertificate, requireSignOnPaper, requireUploadSignature, roleName, routingOrder, routingOrderMetadata, sentDateTime, signatureInfo, signedDateTime, signInEachLocation, signInEachLocationMetadata, signingGroupId, signingGroupIdMetadata, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, statusCode, suppressEmails, tabs, templateLocked, templateRequired, totalTabCount, userId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signer {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    accessCodeMetadata: ").append(toIndentedString(accessCodeMetadata)).append("\n");
    sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
    sb.append("    additionalNotifications: ").append(toIndentedString(additionalNotifications)).append("\n");
    sb.append("    agentCanEditEmail: ").append(toIndentedString(agentCanEditEmail)).append("\n");
    sb.append("    agentCanEditName: ").append(toIndentedString(agentCanEditName)).append("\n");
    sb.append("    allowSystemOverrideForLockedRecipient: ").append(toIndentedString(allowSystemOverrideForLockedRecipient)).append("\n");
    sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
    sb.append("    autoRespondedReason: ").append(toIndentedString(autoRespondedReason)).append("\n");
    sb.append("    bulkRecipientsUri: ").append(toIndentedString(bulkRecipientsUri)).append("\n");
    sb.append("    canSignOffline: ").append(toIndentedString(canSignOffline)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    completedCount: ").append(toIndentedString(completedCount)).append("\n");
    sb.append("    creationReason: ").append(toIndentedString(creationReason)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
    sb.append("    defaultRecipient: ").append(toIndentedString(defaultRecipient)).append("\n");
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
    sb.append("    excludedDocuments: ").append(toIndentedString(excludedDocuments)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    faxNumberMetadata: ").append(toIndentedString(faxNumberMetadata)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    firstNameMetadata: ").append(toIndentedString(firstNameMetadata)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    fullNameMetadata: ").append(toIndentedString(fullNameMetadata)).append("\n");
    sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    sb.append("    idCheckConfigurationNameMetadata: ").append(toIndentedString(idCheckConfigurationNameMetadata)).append("\n");
    sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
    sb.append("    identityVerification: ").append(toIndentedString(identityVerification)).append("\n");
    sb.append("    inheritEmailNotificationConfiguration: ").append(toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
    sb.append("    isBulkRecipient: ").append(toIndentedString(isBulkRecipient)).append("\n");
    sb.append("    isBulkRecipientMetadata: ").append(toIndentedString(isBulkRecipientMetadata)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    lastNameMetadata: ").append(toIndentedString(lastNameMetadata)).append("\n");
    sb.append("    lockedRecipientPhoneAuthEditable: ").append(toIndentedString(lockedRecipientPhoneAuthEditable)).append("\n");
    sb.append("    lockedRecipientSmsEditable: ").append(toIndentedString(lockedRecipientSmsEditable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    notaryId: ").append(toIndentedString(notaryId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    noteMetadata: ").append(toIndentedString(noteMetadata)).append("\n");
    sb.append("    offlineAttributes: ").append(toIndentedString(offlineAttributes)).append("\n");
    sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    proofFile: ").append(toIndentedString(proofFile)).append("\n");
    sb.append("    recipientAttachments: ").append(toIndentedString(recipientAttachments)).append("\n");
    sb.append("    recipientAuthenticationStatus: ").append(toIndentedString(recipientAuthenticationStatus)).append("\n");
    sb.append("    recipientFeatureMetadata: ").append(toIndentedString(recipientFeatureMetadata)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    recipientSignatureProviders: ").append(toIndentedString(recipientSignatureProviders)).append("\n");
    sb.append("    recipientSuppliesTabs: ").append(toIndentedString(recipientSuppliesTabs)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    recipientTypeMetadata: ").append(toIndentedString(recipientTypeMetadata)).append("\n");
    sb.append("    requireIdLookup: ").append(toIndentedString(requireIdLookup)).append("\n");
    sb.append("    requireIdLookupMetadata: ").append(toIndentedString(requireIdLookupMetadata)).append("\n");
    sb.append("    requireSignerCertificate: ").append(toIndentedString(requireSignerCertificate)).append("\n");
    sb.append("    requireSignOnPaper: ").append(toIndentedString(requireSignOnPaper)).append("\n");
    sb.append("    requireUploadSignature: ").append(toIndentedString(requireUploadSignature)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    routingOrderMetadata: ").append(toIndentedString(routingOrderMetadata)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    signatureInfo: ").append(toIndentedString(signatureInfo)).append("\n");
    sb.append("    signedDateTime: ").append(toIndentedString(signedDateTime)).append("\n");
    sb.append("    signInEachLocation: ").append(toIndentedString(signInEachLocation)).append("\n");
    sb.append("    signInEachLocationMetadata: ").append(toIndentedString(signInEachLocationMetadata)).append("\n");
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

