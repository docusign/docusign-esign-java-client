package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.ConsentDetails;
import com.docusign.esign.model.DelegationInfo;
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
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A complex type containing information about a witness recipient. Witnesses are recipients whose signatures affirm that the identified signers have signed the documents in the envelope..
 *
 */
@Schema(description = "A complex type containing information about a witness recipient. Witnesses are recipients whose signatures affirm that the identified signers have signed the documents in the envelope.")

public class Witness {
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

  @JsonProperty("bulkSendV2Recipient")
  private String bulkSendV2Recipient = null;

  @JsonProperty("canSignOffline")
  private String canSignOffline = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("completedCount")
  private String completedCount = null;

  @JsonProperty("consentDetailsList")
  private java.util.List<ConsentDetails> consentDetailsList = null;

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

  @JsonProperty("delegatedBy")
  private DelegationInfo delegatedBy = null;

  @JsonProperty("delegatedTo")
  private java.util.List<DelegationInfo> delegatedTo = null;

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

  @JsonProperty("emailRecipientPostSigningURL")
  private String emailRecipientPostSigningURL = null;

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

  @JsonProperty("notarySignerEmailSent")
  private String notarySignerEmailSent = null;

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

  @JsonProperty("witnessFor")
  private String witnessFor = null;

  @JsonProperty("witnessForGuid")
  private String witnessForGuid = null;


  /**
   * accessCode.
   *
   * @return Witness
   **/
  public Witness accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required..
   * @return accessCode
   **/
  @Schema(description = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
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
   * @return Witness
   **/
  public Witness accessCodeMetadata(PropertyMetadata accessCodeMetadata) {
    this.accessCodeMetadata = accessCodeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `accessCode` property is editable. This property is read-only..
   * @return accessCodeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `accessCode` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness addAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
    return this;
  }

  /**
   * This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient..
   * @return addAccessCodeToEmail
   **/
  @Schema(description = "This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.")
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
   * @return Witness
   **/
  public Witness additionalNotifications(java.util.List<RecipientAdditionalNotification> additionalNotifications) {
    this.additionalNotifications = additionalNotifications;
    return this;
  }
  
  /**
   * addAdditionalNotificationsItem.
   *
   * @return Witness
   **/
  public Witness addAdditionalNotificationsItem(RecipientAdditionalNotification additionalNotificationsItem) {
    if (this.additionalNotifications == null) {
      this.additionalNotifications = new java.util.ArrayList<>();
    }
    this.additionalNotifications.add(additionalNotificationsItem);
    return this;
  }

  /**
   * .
   * @return additionalNotifications
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness agentCanEditEmail(String agentCanEditEmail) {
    this.agentCanEditEmail = agentCanEditEmail;
    return this;
  }

  /**
   * .
   * @return agentCanEditEmail
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness agentCanEditName(String agentCanEditName) {
    this.agentCanEditName = agentCanEditName;
    return this;
  }

  /**
   * .
   * @return agentCanEditName
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness allowSystemOverrideForLockedRecipient(String allowSystemOverrideForLockedRecipient) {
    this.allowSystemOverrideForLockedRecipient = allowSystemOverrideForLockedRecipient;
    return this;
  }

  /**
   * .
   * @return allowSystemOverrideForLockedRecipient
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness autoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
    return this;
  }

  /**
   * .
   * @return autoNavigation
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness autoRespondedReason(String autoRespondedReason) {
    this.autoRespondedReason = autoRespondedReason;
    return this;
  }

  /**
   * .
   * @return autoRespondedReason
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness bulkRecipientsUri(String bulkRecipientsUri) {
    this.bulkRecipientsUri = bulkRecipientsUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information..
   * @return bulkRecipientsUri
   **/
  @Schema(description = "Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information.")
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
   * bulkSendV2Recipient.
   *
   * @return Witness
   **/
  public Witness bulkSendV2Recipient(String bulkSendV2Recipient) {
    this.bulkSendV2Recipient = bulkSendV2Recipient;
    return this;
  }

  /**
   * .
   * @return bulkSendV2Recipient
   **/
  @Schema(description = "")
  public String getBulkSendV2Recipient() {
    return bulkSendV2Recipient;
  }

  /**
   * setBulkSendV2Recipient.
   **/
  public void setBulkSendV2Recipient(String bulkSendV2Recipient) {
    this.bulkSendV2Recipient = bulkSendV2Recipient;
  }


  /**
   * canSignOffline.
   *
   * @return Witness
   **/
  public Witness canSignOffline(String canSignOffline) {
    this.canSignOffline = canSignOffline;
    return this;
  }

  /**
   * When set to **true**, specifies that the signer can perform the signing ceremony offline..
   * @return canSignOffline
   **/
  @Schema(description = "When set to **true**, specifies that the signer can perform the signing ceremony offline.")
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
   * @return Witness
   **/
  public Witness clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

  /**
   * Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. .
   * @return clientUserId
   **/
  @Schema(description = "Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. ")
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
   * @return Witness
   **/
  public Witness completedCount(String completedCount) {
    this.completedCount = completedCount;
    return this;
  }

  /**
   * .
   * @return completedCount
   **/
  @Schema(description = "")
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
   * consentDetailsList.
   *
   * @return Witness
   **/
  public Witness consentDetailsList(java.util.List<ConsentDetails> consentDetailsList) {
    this.consentDetailsList = consentDetailsList;
    return this;
  }
  
  /**
   * addConsentDetailsListItem.
   *
   * @return Witness
   **/
  public Witness addConsentDetailsListItem(ConsentDetails consentDetailsListItem) {
    if (this.consentDetailsList == null) {
      this.consentDetailsList = new java.util.ArrayList<>();
    }
    this.consentDetailsList.add(consentDetailsListItem);
    return this;
  }

  /**
   * .
   * @return consentDetailsList
   **/
  @Schema(description = "")
  public java.util.List<ConsentDetails> getConsentDetailsList() {
    return consentDetailsList;
  }

  /**
   * setConsentDetailsList.
   **/
  public void setConsentDetailsList(java.util.List<ConsentDetails> consentDetailsList) {
    this.consentDetailsList = consentDetailsList;
  }


  /**
   * creationReason.
   *
   * @return Witness
   **/
  public Witness creationReason(String creationReason) {
    this.creationReason = creationReason;
    return this;
  }

  /**
   * .
   * @return creationReason
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness customFields(java.util.List<String> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  /**
   * addCustomFieldsItem.
   *
   * @return Witness
   **/
  public Witness addCustomFieldsItem(String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new java.util.ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters..
   * @return customFields
   **/
  @Schema(description = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
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
   * @return Witness
   **/
  public Witness declinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
    return this;
  }

  /**
   * The date and time the recipient declined the document..
   * @return declinedDateTime
   **/
  @Schema(description = "The date and time the recipient declined the document.")
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
   * @return Witness
   **/
  public Witness declinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
    return this;
  }

  /**
   * The reason the recipient declined the document..
   * @return declinedReason
   **/
  @Schema(description = "The reason the recipient declined the document.")
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
   * @return Witness
   **/
  public Witness defaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
    return this;
  }

  /**
   * .
   * @return defaultRecipient
   **/
  @Schema(description = "")
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
   * delegatedBy.
   *
   * @return Witness
   **/
  public Witness delegatedBy(DelegationInfo delegatedBy) {
    this.delegatedBy = delegatedBy;
    return this;
  }

  /**
   * .
   * @return delegatedBy
   **/
  @Schema(description = "")
  public DelegationInfo getDelegatedBy() {
    return delegatedBy;
  }

  /**
   * setDelegatedBy.
   **/
  public void setDelegatedBy(DelegationInfo delegatedBy) {
    this.delegatedBy = delegatedBy;
  }


  /**
   * delegatedTo.
   *
   * @return Witness
   **/
  public Witness delegatedTo(java.util.List<DelegationInfo> delegatedTo) {
    this.delegatedTo = delegatedTo;
    return this;
  }
  
  /**
   * addDelegatedToItem.
   *
   * @return Witness
   **/
  public Witness addDelegatedToItem(DelegationInfo delegatedToItem) {
    if (this.delegatedTo == null) {
      this.delegatedTo = new java.util.ArrayList<>();
    }
    this.delegatedTo.add(delegatedToItem);
    return this;
  }

  /**
   * .
   * @return delegatedTo
   **/
  @Schema(description = "")
  public java.util.List<DelegationInfo> getDelegatedTo() {
    return delegatedTo;
  }

  /**
   * setDelegatedTo.
   **/
  public void setDelegatedTo(java.util.List<DelegationInfo> delegatedTo) {
    this.delegatedTo = delegatedTo;
  }


  /**
   * deliveredDateTime.
   *
   * @return Witness
   **/
  public Witness deliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
    return this;
  }

  /**
   * Reserved: For DocuSign use only..
   * @return deliveredDateTime
   **/
  @Schema(description = "Reserved: For DocuSign use only.")
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
   * @return Witness
   **/
  public Witness deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * Reserved: For DocuSign use only..
   * @return deliveryMethod
   **/
  @Schema(description = "Reserved: For DocuSign use only.")
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
   * @return Witness
   **/
  public Witness deliveryMethodMetadata(PropertyMetadata deliveryMethodMetadata) {
    this.deliveryMethodMetadata = deliveryMethodMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return deliveryMethodMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
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
   * @return Witness
   **/
  public Witness designatorId(String designatorId) {
    this.designatorId = designatorId;
    return this;
  }

  /**
   * .
   * @return designatorId
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness designatorIdGuid(String designatorIdGuid) {
    this.designatorIdGuid = designatorIdGuid;
    return this;
  }

  /**
   * .
   * @return designatorIdGuid
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness documentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }
  
  /**
   * addDocumentVisibilityItem.
   *
   * @return Witness
   **/
  public Witness addDocumentVisibilityItem(DocumentVisibility documentVisibilityItem) {
    if (this.documentVisibility == null) {
      this.documentVisibility = new java.util.ArrayList<>();
    }
    this.documentVisibility.add(documentVisibilityItem);
    return this;
  }

  /**
   * .
   * @return documentVisibility
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness emailMetadata(PropertyMetadata emailMetadata) {
    this.emailMetadata = emailMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `email` property is editable. This property is read-only..
   * @return emailMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `email` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness emailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
    return this;
  }

  /**
   * A complex type that contains information sets the language of the recipient's email information.   **IMPORTANT**: If you enable email notification for one recipient, you must enable email notification for all recipients as it overrides the Envelope Subject and `EmailBlurb` property settings. .
   * @return emailNotification
   **/
  @Schema(description = "A complex type that contains information sets the language of the recipient's email information.   **IMPORTANT**: If you enable email notification for one recipient, you must enable email notification for all recipients as it overrides the Envelope Subject and `EmailBlurb` property settings. ")
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
   * emailRecipientPostSigningURL.
   *
   * @return Witness
   **/
  public Witness emailRecipientPostSigningURL(String emailRecipientPostSigningURL) {
    this.emailRecipientPostSigningURL = emailRecipientPostSigningURL;
    return this;
  }

  /**
   * .
   * @return emailRecipientPostSigningURL
   **/
  @Schema(description = "")
  public String getEmailRecipientPostSigningURL() {
    return emailRecipientPostSigningURL;
  }

  /**
   * setEmailRecipientPostSigningURL.
   **/
  public void setEmailRecipientPostSigningURL(String emailRecipientPostSigningURL) {
    this.emailRecipientPostSigningURL = emailRecipientPostSigningURL;
  }


  /**
   * embeddedRecipientStartURL.
   *
   * @return Witness
   **/
  public Witness embeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    return this;
  }

  /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` .
   * @return embeddedRecipientStartURL
   **/
  @Schema(description = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
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
   * @return Witness
   **/
  public Witness errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
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
   * @return Witness
   **/
  public Witness excludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
    return this;
  }
  
  /**
   * addExcludedDocumentsItem.
   *
   * @return Witness
   **/
  public Witness addExcludedDocumentsItem(String excludedDocumentsItem) {
    if (this.excludedDocuments == null) {
      this.excludedDocuments = new java.util.ArrayList<>();
    }
    this.excludedDocuments.add(excludedDocumentsItem);
    return this;
  }

  /**
   * Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent..
   * @return excludedDocuments
   **/
  @Schema(description = "Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.")
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
   * @return Witness
   **/
  public Witness faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Reserved:.
   * @return faxNumber
   **/
  @Schema(description = "Reserved:")
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
   * @return Witness
   **/
  public Witness faxNumberMetadata(PropertyMetadata faxNumberMetadata) {
    this.faxNumberMetadata = faxNumberMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return faxNumberMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
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
   * @return Witness
   **/
  public Witness firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The user's first name.  Maximum Length: 50 characters..
   * @return firstName
   **/
  @Schema(description = "The user's first name.  Maximum Length: 50 characters.")
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
   * @return Witness
   **/
  public Witness firstNameMetadata(PropertyMetadata firstNameMetadata) {
    this.firstNameMetadata = firstNameMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `firstName` property is editable. This property is read-only..
   * @return firstNameMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `firstName` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * .
   * @return fullName
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness fullNameMetadata(PropertyMetadata fullNameMetadata) {
    this.fullNameMetadata = fullNameMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return fullNameMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
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
   * @return Witness
   **/
  public Witness idCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
    return this;
  }

  /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node..
   * @return idCheckConfigurationName
   **/
  @Schema(description = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
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
   * @return Witness
   **/
  public Witness idCheckConfigurationNameMetadata(PropertyMetadata idCheckConfigurationNameMetadata) {
    this.idCheckConfigurationNameMetadata = idCheckConfigurationNameMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `idCheckConfigurationName` property is editable. This property is read-only..
   * @return idCheckConfigurationNameMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `idCheckConfigurationName` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness idCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
    return this;
  }

  /**
   * An object that contains input information related to a recipient ID check..
   * @return idCheckInformationInput
   **/
  @Schema(description = "An object that contains input information related to a recipient ID check.")
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
   * @return Witness
   **/
  public Witness identityVerification(RecipientIdentityVerification identityVerification) {
    this.identityVerification = identityVerification;
    return this;
  }

  /**
   * Specifies the ID Verification workflow applied on an envelope by workflow ID. <br/>See the [list](/docs/esign-rest-api/reference/accounts/identityverifications/list/) method in the [IdentityVerifications](/docs/esign-rest-api/reference/accounts/identityverifications/) resource for more information on how to retrieve workflow IDs available for an account. <br/>This can be used in addition to other [recipient authentication](https://support.docusign.com/en/guides/ndse-user-guide-recipient-authentication) methods. <br/>Note that ID Verification and ID Check are two distinct methods. ID Verification checks recipients' identity by verifying their ID while ID Check relies on data available on public records (such as current and former address)..
   * @return identityVerification
   **/
  @Schema(description = "Specifies the ID Verification workflow applied on an envelope by workflow ID. <br/>See the [list](/docs/esign-rest-api/reference/accounts/identityverifications/list/) method in the [IdentityVerifications](/docs/esign-rest-api/reference/accounts/identityverifications/) resource for more information on how to retrieve workflow IDs available for an account. <br/>This can be used in addition to other [recipient authentication](https://support.docusign.com/en/guides/ndse-user-guide-recipient-authentication) methods. <br/>Note that ID Verification and ID Check are two distinct methods. ID Verification checks recipients' identity by verifying their ID while ID Check relies on data available on public records (such as current and former address).")
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
   * @return Witness
   **/
  public Witness inheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
    return this;
  }

  /**
   * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. .
   * @return inheritEmailNotificationConfiguration
   **/
  @Schema(description = "When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. ")
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
   * @return Witness
   **/
  public Witness isBulkRecipient(String isBulkRecipient) {
    this.isBulkRecipient = isBulkRecipient;
    return this;
  }

  /**
   * .
   * @return isBulkRecipient
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness isBulkRecipientMetadata(PropertyMetadata isBulkRecipientMetadata) {
    this.isBulkRecipientMetadata = isBulkRecipientMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return isBulkRecipientMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
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
   * @return Witness
   **/
  public Witness lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * .
   * @return lastName
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness lastNameMetadata(PropertyMetadata lastNameMetadata) {
    this.lastNameMetadata = lastNameMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `lastName` property is editable. This property is read-only..
   * @return lastNameMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `lastName` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness lockedRecipientPhoneAuthEditable(String lockedRecipientPhoneAuthEditable) {
    this.lockedRecipientPhoneAuthEditable = lockedRecipientPhoneAuthEditable;
    return this;
  }

  /**
   * .
   * @return lockedRecipientPhoneAuthEditable
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness lockedRecipientSmsEditable(String lockedRecipientSmsEditable) {
    this.lockedRecipientSmsEditable = lockedRecipientSmsEditable;
    return this;
  }

  /**
   * .
   * @return lockedRecipientSmsEditable
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `name` property is editable. This property is read-only..
   * @return nameMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `name` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness notaryId(String notaryId) {
    this.notaryId = notaryId;
    return this;
  }

  /**
   * .
   * @return notaryId
   **/
  @Schema(description = "")
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
   * notarySignerEmailSent.
   *
   * @return Witness
   **/
  public Witness notarySignerEmailSent(String notarySignerEmailSent) {
    this.notarySignerEmailSent = notarySignerEmailSent;
    return this;
  }

  /**
   * .
   * @return notarySignerEmailSent
   **/
  @Schema(description = "")
  public String getNotarySignerEmailSent() {
    return notarySignerEmailSent;
  }

  /**
   * setNotarySignerEmailSent.
   **/
  public void setNotarySignerEmailSent(String notarySignerEmailSent) {
    this.notarySignerEmailSent = notarySignerEmailSent;
  }


  /**
   * note.
   *
   * @return Witness
   **/
  public Witness note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters..
   * @return note
   **/
  @Schema(description = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.")
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
   * @return Witness
   **/
  public Witness noteMetadata(PropertyMetadata noteMetadata) {
    this.noteMetadata = noteMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `note` property is editable. This property is read-only..
   * @return noteMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `note` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness offlineAttributes(OfflineAttributes offlineAttributes) {
    this.offlineAttributes = offlineAttributes;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return offlineAttributes
   **/
  @Schema(description = "Reserved for DocuSign.")
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
   * @return Witness
   **/
  public Witness phoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
    return this;
  }

  /**
   * When `idCheckConfigurationName` is set to `Phone Auth $`, you use this complex type to provide the recipient authentication method details. It contains the following elements:  * `recipMayProvideNumber`: Boolean. When **true,** the recipient can use whatever phone number they choose. * `senderProvidedNumbers`: ArrayOfStrings.  A list of phone numbers the recipient can use. * `recordVoicePrint`: Reserved for DocuSign. * `validateRecipProvidedNumber`: Reserved for DocuSign.  .
   * @return phoneAuthentication
   **/
  @Schema(description = "When `idCheckConfigurationName` is set to `Phone Auth $`, you use this complex type to provide the recipient authentication method details. It contains the following elements:  * `recipMayProvideNumber`: Boolean. When **true,** the recipient can use whatever phone number they choose. * `senderProvidedNumbers`: ArrayOfStrings.  A list of phone numbers the recipient can use. * `recordVoicePrint`: Reserved for DocuSign. * `validateRecipProvidedNumber`: Reserved for DocuSign.  ")
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
   * @return Witness
   **/
  public Witness phoneNumber(RecipientPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Describes the recipient phone number..
   * @return phoneNumber
   **/
  @Schema(description = "Describes the recipient phone number.")
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
   * @return Witness
   **/
  public Witness proofFile(RecipientProofFile proofFile) {
    this.proofFile = proofFile;
    return this;
  }

  /**
   * The proof file of the recipient..
   * @return proofFile
   **/
  @Schema(description = "The proof file of the recipient.")
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
   * @return Witness
   **/
  public Witness recipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
    return this;
  }
  
  /**
   * addRecipientAttachmentsItem.
   *
   * @return Witness
   **/
  public Witness addRecipientAttachmentsItem(RecipientAttachment recipientAttachmentsItem) {
    if (this.recipientAttachments == null) {
      this.recipientAttachments = new java.util.ArrayList<>();
    }
    this.recipientAttachments.add(recipientAttachmentsItem);
    return this;
  }

  /**
   * Reserved:.
   * @return recipientAttachments
   **/
  @Schema(description = "Reserved:")
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
   * @return Witness
   **/
  public Witness recipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
    return this;
  }

  /**
   * Information about the recipient's authentication status. This property is read-only..
   * @return recipientAuthenticationStatus
   **/
  @Schema(description = "Information about the recipient's authentication status. This property is read-only.")
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
   * @return Witness
   **/
  public Witness recipientFeatureMetadata(java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata) {
    this.recipientFeatureMetadata = recipientFeatureMetadata;
    return this;
  }
  
  /**
   * addRecipientFeatureMetadataItem.
   *
   * @return Witness
   **/
  public Witness addRecipientFeatureMetadataItem(FeatureAvailableMetadata recipientFeatureMetadataItem) {
    if (this.recipientFeatureMetadata == null) {
      this.recipientFeatureMetadata = new java.util.ArrayList<>();
    }
    this.recipientFeatureMetadata.add(recipientFeatureMetadataItem);
    return this;
  }

  /**
   * .
   * @return recipientFeatureMetadata
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document..
   * @return recipientId
   **/
  @Schema(description = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
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
   * @return Witness
   **/
  public Witness recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

  /**
   * .
   * @return recipientIdGuid
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness recipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
    return this;
  }
  
  /**
   * addRecipientSignatureProvidersItem.
   *
   * @return Witness
   **/
  public Witness addRecipientSignatureProvidersItem(RecipientSignatureProvider recipientSignatureProvidersItem) {
    if (this.recipientSignatureProviders == null) {
      this.recipientSignatureProviders = new java.util.ArrayList<>();
    }
    this.recipientSignatureProviders.add(recipientSignatureProvidersItem);
    return this;
  }

  /**
   * .
   * @return recipientSignatureProviders
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness recipientSuppliesTabs(String recipientSuppliesTabs) {
    this.recipientSuppliesTabs = recipientSuppliesTabs;
    return this;
  }

  /**
   * .
   * @return recipientSuppliesTabs
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  /**
   * .
   * @return recipientType
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness recipientTypeMetadata(PropertyMetadata recipientTypeMetadata) {
    this.recipientTypeMetadata = recipientTypeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `recipientType` property is editable. This property is read-only..
   * @return recipientTypeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `recipientType` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness requireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
    return this;
  }

  /**
   * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. .
   * @return requireIdLookup
   **/
  @Schema(description = "When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. ")
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
   * @return Witness
   **/
  public Witness requireIdLookupMetadata(PropertyMetadata requireIdLookupMetadata) {
    this.requireIdLookupMetadata = requireIdLookupMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `requireIdLookup` property is editable. This property is read-only..
   * @return requireIdLookupMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `requireIdLookup` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness requireSignerCertificate(String requireSignerCertificate) {
    this.requireSignerCertificate = requireSignerCertificate;
    return this;
  }

  /**
   * .
   * @return requireSignerCertificate
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness requireSignOnPaper(String requireSignOnPaper) {
    this.requireSignOnPaper = requireSignOnPaper;
    return this;
  }

  /**
   * .
   * @return requireSignOnPaper
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness requireUploadSignature(String requireUploadSignature) {
    this.requireUploadSignature = requireUploadSignature;
    return this;
  }

  /**
   * .
   * @return requireUploadSignature
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients..
   * @return roleName
   **/
  @Schema(description = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
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
   * @return Witness
   **/
  public Witness routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

  /**
   * Specifies the routing order of the recipient in the envelope. .
   * @return routingOrder
   **/
  @Schema(description = "Specifies the routing order of the recipient in the envelope. ")
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
   * @return Witness
   **/
  public Witness routingOrderMetadata(PropertyMetadata routingOrderMetadata) {
    this.routingOrderMetadata = routingOrderMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `routingOrder` property is editable. This property is read-only..
   * @return routingOrderMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `routingOrder` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

  /**
   * The date and time the envelope was sent..
   * @return sentDateTime
   **/
  @Schema(description = "The date and time the envelope was sent.")
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
   * @return Witness
   **/
  public Witness signatureInfo(RecipientSignatureInformation signatureInfo) {
    this.signatureInfo = signatureInfo;
    return this;
  }

  /**
   * Allows the sender to pre-specify the signature name, signature initials and signature font used in the signature stamp for the recipient.  Used only with recipient types In Person Signers and Signers..
   * @return signatureInfo
   **/
  @Schema(description = "Allows the sender to pre-specify the signature name, signature initials and signature font used in the signature stamp for the recipient.  Used only with recipient types In Person Signers and Signers.")
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
   * @return Witness
   **/
  public Witness signedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
    return this;
  }

  /**
   * Reserved: For DocuSign use only. .
   * @return signedDateTime
   **/
  @Schema(description = "Reserved: For DocuSign use only. ")
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
   * @return Witness
   **/
  public Witness signInEachLocation(String signInEachLocation) {
    this.signInEachLocation = signInEachLocation;
    return this;
  }

  /**
   * When set to **true**, specifies that the signer must sign in all locations..
   * @return signInEachLocation
   **/
  @Schema(description = "When set to **true**, specifies that the signer must sign in all locations.")
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
   * @return Witness
   **/
  public Witness signInEachLocationMetadata(PropertyMetadata signInEachLocationMetadata) {
    this.signInEachLocationMetadata = signInEachLocationMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `signInEachLocation` property is editable. This property is read-only..
   * @return signInEachLocationMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `signInEachLocation` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once)..
   * @return signingGroupId
   **/
  @Schema(description = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
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
   * @return Witness
   **/
  public Witness signingGroupIdMetadata(PropertyMetadata signingGroupIdMetadata) {
    this.signingGroupIdMetadata = signingGroupIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `signingGroupId` property is editable. This property is read-only..
   * @return signingGroupIdMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `signingGroupId` property is editable. This property is read-only.")
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
   * @return Witness
   **/
  public Witness signingGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
    return this;
  }

  /**
   * The display name for the signing group.   Maximum Length: 100 characters. .
   * @return signingGroupName
   **/
  @Schema(description = "The display name for the signing group.   Maximum Length: 100 characters. ")
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
   * @return Witness
   **/
  public Witness signingGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
    return this;
  }
  
  /**
   * addSigningGroupUsersItem.
   *
   * @return Witness
   **/
  public Witness addSigningGroupUsersItem(UserInfo signingGroupUsersItem) {
    if (this.signingGroupUsers == null) {
      this.signingGroupUsers = new java.util.ArrayList<>();
    }
    this.signingGroupUsers.add(signingGroupUsersItem);
    return this;
  }

  /**
   * A complex type that contains information about users in the signing group..
   * @return signingGroupUsers
   **/
  @Schema(description = "A complex type that contains information about users in the signing group.")
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
   * @return Witness
   **/
  public Witness smsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
    return this;
  }

  /**
   * When `idCheckConfigurationName` is set to `SMS Auth $`, you use this complex type to provide the recipient authentication method details. It contains the element `senderProvidedNumbers`, which is an array of phone numbers that the recipient can use for SMS text authentication.   .
   * @return smsAuthentication
   **/
  @Schema(description = "When `idCheckConfigurationName` is set to `SMS Auth $`, you use this complex type to provide the recipient authentication method details. It contains the element `senderProvidedNumbers`, which is an array of phone numbers that the recipient can use for SMS text authentication.   ")
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
   * @return Witness
   **/
  public Witness socialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
    return this;
  }
  
  /**
   * addSocialAuthenticationsItem.
   *
   * @return Witness
   **/
  public Witness addSocialAuthenticationsItem(SocialAuthentication socialAuthenticationsItem) {
    if (this.socialAuthentications == null) {
      this.socialAuthentications = new java.util.ArrayList<>();
    }
    this.socialAuthentications.add(socialAuthenticationsItem);
    return this;
  }

  /**
   *  Lists the social ID type that can be used for recipient authentication..
   * @return socialAuthentications
   **/
  @Schema(description = " Lists the social ID type that can be used for recipient authentication.")
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
   * @return Witness
   **/
  public Witness status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @Schema(description = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
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
   * @return Witness
   **/
  public Witness statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * .
   * @return statusCode
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness suppressEmails(String suppressEmails) {
    this.suppressEmails = suppressEmails;
    return this;
  }

  /**
   * .
   * @return suppressEmails
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }

  /**
   * A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data. They may also display data to the recipients..
   * @return tabs
   **/
  @Schema(description = "A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data. They may also display data to the recipients.")
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
   * @return Witness
   **/
  public Witness templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. .
   * @return templateLocked
   **/
  @Schema(description = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
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
   * @return Witness
   **/
  public Witness templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients..
   * @return templateRequired
   **/
  @Schema(description = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
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
   * @return Witness
   **/
  public Witness totalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
    return this;
  }

  /**
   * .
   * @return totalTabCount
   **/
  @Schema(description = "")
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
   * @return Witness
   **/
  public Witness userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * .
   * @return userId
   **/
  @Schema(description = "")
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
   * witnessFor.
   *
   * @return Witness
   **/
  public Witness witnessFor(String witnessFor) {
    this.witnessFor = witnessFor;
    return this;
  }

  /**
   * .
   * @return witnessFor
   **/
  @Schema(description = "")
  public String getWitnessFor() {
    return witnessFor;
  }

  /**
   * setWitnessFor.
   **/
  public void setWitnessFor(String witnessFor) {
    this.witnessFor = witnessFor;
  }


  /**
   * witnessForGuid.
   *
   * @return Witness
   **/
  public Witness witnessForGuid(String witnessForGuid) {
    this.witnessForGuid = witnessForGuid;
    return this;
  }

  /**
   * .
   * @return witnessForGuid
   **/
  @Schema(description = "")
  public String getWitnessForGuid() {
    return witnessForGuid;
  }

  /**
   * setWitnessForGuid.
   **/
  public void setWitnessForGuid(String witnessForGuid) {
    this.witnessForGuid = witnessForGuid;
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
    Witness witness = (Witness) o;
    return Objects.equals(this.accessCode, witness.accessCode) &&
        Objects.equals(this.accessCodeMetadata, witness.accessCodeMetadata) &&
        Objects.equals(this.addAccessCodeToEmail, witness.addAccessCodeToEmail) &&
        Objects.equals(this.additionalNotifications, witness.additionalNotifications) &&
        Objects.equals(this.agentCanEditEmail, witness.agentCanEditEmail) &&
        Objects.equals(this.agentCanEditName, witness.agentCanEditName) &&
        Objects.equals(this.allowSystemOverrideForLockedRecipient, witness.allowSystemOverrideForLockedRecipient) &&
        Objects.equals(this.autoNavigation, witness.autoNavigation) &&
        Objects.equals(this.autoRespondedReason, witness.autoRespondedReason) &&
        Objects.equals(this.bulkRecipientsUri, witness.bulkRecipientsUri) &&
        Objects.equals(this.bulkSendV2Recipient, witness.bulkSendV2Recipient) &&
        Objects.equals(this.canSignOffline, witness.canSignOffline) &&
        Objects.equals(this.clientUserId, witness.clientUserId) &&
        Objects.equals(this.completedCount, witness.completedCount) &&
        Objects.equals(this.consentDetailsList, witness.consentDetailsList) &&
        Objects.equals(this.creationReason, witness.creationReason) &&
        Objects.equals(this.customFields, witness.customFields) &&
        Objects.equals(this.declinedDateTime, witness.declinedDateTime) &&
        Objects.equals(this.declinedReason, witness.declinedReason) &&
        Objects.equals(this.defaultRecipient, witness.defaultRecipient) &&
        Objects.equals(this.delegatedBy, witness.delegatedBy) &&
        Objects.equals(this.delegatedTo, witness.delegatedTo) &&
        Objects.equals(this.deliveredDateTime, witness.deliveredDateTime) &&
        Objects.equals(this.deliveryMethod, witness.deliveryMethod) &&
        Objects.equals(this.deliveryMethodMetadata, witness.deliveryMethodMetadata) &&
        Objects.equals(this.designatorId, witness.designatorId) &&
        Objects.equals(this.designatorIdGuid, witness.designatorIdGuid) &&
        Objects.equals(this.documentVisibility, witness.documentVisibility) &&
        Objects.equals(this.email, witness.email) &&
        Objects.equals(this.emailMetadata, witness.emailMetadata) &&
        Objects.equals(this.emailNotification, witness.emailNotification) &&
        Objects.equals(this.emailRecipientPostSigningURL, witness.emailRecipientPostSigningURL) &&
        Objects.equals(this.embeddedRecipientStartURL, witness.embeddedRecipientStartURL) &&
        Objects.equals(this.errorDetails, witness.errorDetails) &&
        Objects.equals(this.excludedDocuments, witness.excludedDocuments) &&
        Objects.equals(this.faxNumber, witness.faxNumber) &&
        Objects.equals(this.faxNumberMetadata, witness.faxNumberMetadata) &&
        Objects.equals(this.firstName, witness.firstName) &&
        Objects.equals(this.firstNameMetadata, witness.firstNameMetadata) &&
        Objects.equals(this.fullName, witness.fullName) &&
        Objects.equals(this.fullNameMetadata, witness.fullNameMetadata) &&
        Objects.equals(this.idCheckConfigurationName, witness.idCheckConfigurationName) &&
        Objects.equals(this.idCheckConfigurationNameMetadata, witness.idCheckConfigurationNameMetadata) &&
        Objects.equals(this.idCheckInformationInput, witness.idCheckInformationInput) &&
        Objects.equals(this.identityVerification, witness.identityVerification) &&
        Objects.equals(this.inheritEmailNotificationConfiguration, witness.inheritEmailNotificationConfiguration) &&
        Objects.equals(this.isBulkRecipient, witness.isBulkRecipient) &&
        Objects.equals(this.isBulkRecipientMetadata, witness.isBulkRecipientMetadata) &&
        Objects.equals(this.lastName, witness.lastName) &&
        Objects.equals(this.lastNameMetadata, witness.lastNameMetadata) &&
        Objects.equals(this.lockedRecipientPhoneAuthEditable, witness.lockedRecipientPhoneAuthEditable) &&
        Objects.equals(this.lockedRecipientSmsEditable, witness.lockedRecipientSmsEditable) &&
        Objects.equals(this.name, witness.name) &&
        Objects.equals(this.nameMetadata, witness.nameMetadata) &&
        Objects.equals(this.notaryId, witness.notaryId) &&
        Objects.equals(this.notarySignerEmailSent, witness.notarySignerEmailSent) &&
        Objects.equals(this.note, witness.note) &&
        Objects.equals(this.noteMetadata, witness.noteMetadata) &&
        Objects.equals(this.offlineAttributes, witness.offlineAttributes) &&
        Objects.equals(this.phoneAuthentication, witness.phoneAuthentication) &&
        Objects.equals(this.phoneNumber, witness.phoneNumber) &&
        Objects.equals(this.proofFile, witness.proofFile) &&
        Objects.equals(this.recipientAttachments, witness.recipientAttachments) &&
        Objects.equals(this.recipientAuthenticationStatus, witness.recipientAuthenticationStatus) &&
        Objects.equals(this.recipientFeatureMetadata, witness.recipientFeatureMetadata) &&
        Objects.equals(this.recipientId, witness.recipientId) &&
        Objects.equals(this.recipientIdGuid, witness.recipientIdGuid) &&
        Objects.equals(this.recipientSignatureProviders, witness.recipientSignatureProviders) &&
        Objects.equals(this.recipientSuppliesTabs, witness.recipientSuppliesTabs) &&
        Objects.equals(this.recipientType, witness.recipientType) &&
        Objects.equals(this.recipientTypeMetadata, witness.recipientTypeMetadata) &&
        Objects.equals(this.requireIdLookup, witness.requireIdLookup) &&
        Objects.equals(this.requireIdLookupMetadata, witness.requireIdLookupMetadata) &&
        Objects.equals(this.requireSignerCertificate, witness.requireSignerCertificate) &&
        Objects.equals(this.requireSignOnPaper, witness.requireSignOnPaper) &&
        Objects.equals(this.requireUploadSignature, witness.requireUploadSignature) &&
        Objects.equals(this.roleName, witness.roleName) &&
        Objects.equals(this.routingOrder, witness.routingOrder) &&
        Objects.equals(this.routingOrderMetadata, witness.routingOrderMetadata) &&
        Objects.equals(this.sentDateTime, witness.sentDateTime) &&
        Objects.equals(this.signatureInfo, witness.signatureInfo) &&
        Objects.equals(this.signedDateTime, witness.signedDateTime) &&
        Objects.equals(this.signInEachLocation, witness.signInEachLocation) &&
        Objects.equals(this.signInEachLocationMetadata, witness.signInEachLocationMetadata) &&
        Objects.equals(this.signingGroupId, witness.signingGroupId) &&
        Objects.equals(this.signingGroupIdMetadata, witness.signingGroupIdMetadata) &&
        Objects.equals(this.signingGroupName, witness.signingGroupName) &&
        Objects.equals(this.signingGroupUsers, witness.signingGroupUsers) &&
        Objects.equals(this.smsAuthentication, witness.smsAuthentication) &&
        Objects.equals(this.socialAuthentications, witness.socialAuthentications) &&
        Objects.equals(this.status, witness.status) &&
        Objects.equals(this.statusCode, witness.statusCode) &&
        Objects.equals(this.suppressEmails, witness.suppressEmails) &&
        Objects.equals(this.tabs, witness.tabs) &&
        Objects.equals(this.templateLocked, witness.templateLocked) &&
        Objects.equals(this.templateRequired, witness.templateRequired) &&
        Objects.equals(this.totalTabCount, witness.totalTabCount) &&
        Objects.equals(this.userId, witness.userId) &&
        Objects.equals(this.witnessFor, witness.witnessFor) &&
        Objects.equals(this.witnessForGuid, witness.witnessForGuid);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessCode, accessCodeMetadata, addAccessCodeToEmail, additionalNotifications, agentCanEditEmail, agentCanEditName, allowSystemOverrideForLockedRecipient, autoNavigation, autoRespondedReason, bulkRecipientsUri, bulkSendV2Recipient, canSignOffline, clientUserId, completedCount, consentDetailsList, creationReason, customFields, declinedDateTime, declinedReason, defaultRecipient, delegatedBy, delegatedTo, deliveredDateTime, deliveryMethod, deliveryMethodMetadata, designatorId, designatorIdGuid, documentVisibility, email, emailMetadata, emailNotification, emailRecipientPostSigningURL, embeddedRecipientStartURL, errorDetails, excludedDocuments, faxNumber, faxNumberMetadata, firstName, firstNameMetadata, fullName, fullNameMetadata, idCheckConfigurationName, idCheckConfigurationNameMetadata, idCheckInformationInput, identityVerification, inheritEmailNotificationConfiguration, isBulkRecipient, isBulkRecipientMetadata, lastName, lastNameMetadata, lockedRecipientPhoneAuthEditable, lockedRecipientSmsEditable, name, nameMetadata, notaryId, notarySignerEmailSent, note, noteMetadata, offlineAttributes, phoneAuthentication, phoneNumber, proofFile, recipientAttachments, recipientAuthenticationStatus, recipientFeatureMetadata, recipientId, recipientIdGuid, recipientSignatureProviders, recipientSuppliesTabs, recipientType, recipientTypeMetadata, requireIdLookup, requireIdLookupMetadata, requireSignerCertificate, requireSignOnPaper, requireUploadSignature, roleName, routingOrder, routingOrderMetadata, sentDateTime, signatureInfo, signedDateTime, signInEachLocation, signInEachLocationMetadata, signingGroupId, signingGroupIdMetadata, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, statusCode, suppressEmails, tabs, templateLocked, templateRequired, totalTabCount, userId, witnessFor, witnessForGuid);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Witness {\n");
    
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
    sb.append("    bulkSendV2Recipient: ").append(toIndentedString(bulkSendV2Recipient)).append("\n");
    sb.append("    canSignOffline: ").append(toIndentedString(canSignOffline)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    completedCount: ").append(toIndentedString(completedCount)).append("\n");
    sb.append("    consentDetailsList: ").append(toIndentedString(consentDetailsList)).append("\n");
    sb.append("    creationReason: ").append(toIndentedString(creationReason)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
    sb.append("    defaultRecipient: ").append(toIndentedString(defaultRecipient)).append("\n");
    sb.append("    delegatedBy: ").append(toIndentedString(delegatedBy)).append("\n");
    sb.append("    delegatedTo: ").append(toIndentedString(delegatedTo)).append("\n");
    sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    deliveryMethodMetadata: ").append(toIndentedString(deliveryMethodMetadata)).append("\n");
    sb.append("    designatorId: ").append(toIndentedString(designatorId)).append("\n");
    sb.append("    designatorIdGuid: ").append(toIndentedString(designatorIdGuid)).append("\n");
    sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailMetadata: ").append(toIndentedString(emailMetadata)).append("\n");
    sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
    sb.append("    emailRecipientPostSigningURL: ").append(toIndentedString(emailRecipientPostSigningURL)).append("\n");
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
    sb.append("    notarySignerEmailSent: ").append(toIndentedString(notarySignerEmailSent)).append("\n");
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
    sb.append("    witnessFor: ").append(toIndentedString(witnessFor)).append("\n");
    sb.append("    witnessForGuid: ").append(toIndentedString(witnessForGuid)).append("\n");
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

