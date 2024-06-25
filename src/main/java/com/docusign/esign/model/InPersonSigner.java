package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.DocumentVisibility;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.FeatureAvailableMetadata;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.NotaryHost;
import com.docusign.esign.model.OfflineAttributes;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.RecipientAttachment;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientIdentityVerification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
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
import java.io.Serializable;

/**
 * Contains information about an in-person recipient. This is a DocuSign user, acting as a Signing Host, who is in the same physical location as the signer. To learn about the fields used for the eNotary feature, see the [recipients resource][resource].  [resource]: /docs/esign-rest-api/reference/envelopes/enveloperecipients/#in-person-signer-recipient .
 *
 */
@Schema(description = "Contains information about an in-person recipient. This is a DocuSign user, acting as a Signing Host, who is in the same physical location as the signer. To learn about the fields used for the eNotary feature, see the [recipients resource][resource].  [resource]: /docs/esign-rest-api/reference/envelopes/enveloperecipients/#in-person-signer-recipient ")

public class InPersonSigner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("accessCodeMetadata")
  private PropertyMetadata accessCodeMetadata = null;

  @JsonProperty("addAccessCodeToEmail")
  private String addAccessCodeToEmail = null;

  @JsonProperty("allowSystemOverrideForLockedRecipient")
  private String allowSystemOverrideForLockedRecipient = null;

  @JsonProperty("autoNavigation")
  private String autoNavigation = null;

  @JsonProperty("autoRespondedReason")
  private String autoRespondedReason = null;

  @JsonProperty("bulkSendV2Recipient")
  private String bulkSendV2Recipient = null;

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

  @JsonProperty("hostEmail")
  private String hostEmail = null;

  @JsonProperty("hostEmailMetadata")
  private PropertyMetadata hostEmailMetadata = null;

  @JsonProperty("hostName")
  private String hostName = null;

  @JsonProperty("hostNameMetadata")
  private PropertyMetadata hostNameMetadata = null;

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

  @JsonProperty("inPersonSigningType")
  private String inPersonSigningType = null;

  @JsonProperty("inPersonSigningTypeMetadata")
  private PropertyMetadata inPersonSigningTypeMetadata = null;

  @JsonProperty("lockedRecipientPhoneAuthEditable")
  private String lockedRecipientPhoneAuthEditable = null;

  @JsonProperty("lockedRecipientSmsEditable")
  private String lockedRecipientSmsEditable = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameMetadata")
  private PropertyMetadata nameMetadata = null;

  @JsonProperty("notaryHost")
  private NotaryHost notaryHost = null;

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

  @JsonProperty("signerEmail")
  private String signerEmail = null;

  @JsonProperty("signerEmailMetadata")
  private PropertyMetadata signerEmailMetadata = null;

  @JsonProperty("signerFirstName")
  private String signerFirstName = null;

  @JsonProperty("signerFirstNameMetadata")
  private PropertyMetadata signerFirstNameMetadata = null;

  @JsonProperty("signerLastName")
  private String signerLastName = null;

  @JsonProperty("signerLastNameMetadata")
  private PropertyMetadata signerLastNameMetadata = null;

  @JsonProperty("signerName")
  private String signerName = null;

  @JsonProperty("signerNameMetadata")
  private PropertyMetadata signerNameMetadata = null;

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
   * @return InPersonSigner
   **/
  public InPersonSigner accessCode(String accessCode) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner accessCodeMetadata(PropertyMetadata accessCodeMetadata) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner addAccessCodeToEmail(String addAccessCodeToEmail) {
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
   * allowSystemOverrideForLockedRecipient.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner allowSystemOverrideForLockedRecipient(String allowSystemOverrideForLockedRecipient) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner autoNavigation(String autoNavigation) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner autoRespondedReason(String autoRespondedReason) {
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
   * bulkSendV2Recipient.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner bulkSendV2Recipient(String bulkSendV2Recipient) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner canSignOffline(String canSignOffline) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner clientUserId(String clientUserId) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner completedCount(String completedCount) {
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
   * creationReason.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner creationReason(String creationReason) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner customFields(java.util.List<String> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  /**
   * addCustomFieldsItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addCustomFieldsItem(String customFieldsItem) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner declinedDateTime(String declinedDateTime) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner declinedReason(String declinedReason) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner defaultRecipient(String defaultRecipient) {
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
   * deliveredDateTime.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner deliveredDateTime(String deliveredDateTime) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner deliveryMethod(String deliveryMethod) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner deliveryMethodMetadata(PropertyMetadata deliveryMethodMetadata) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner designatorId(String designatorId) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner designatorIdGuid(String designatorIdGuid) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner documentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }
  
  /**
   * addDocumentVisibilityItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addDocumentVisibilityItem(DocumentVisibility documentVisibilityItem) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner email(String email) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner emailMetadata(PropertyMetadata emailMetadata) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner emailNotification(RecipientEmailNotification emailNotification) {
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
   * embeddedRecipientStartURL.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner embeddedRecipientStartURL(String embeddedRecipientStartURL) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner errorDetails(ErrorDetails errorDetails) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner excludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
    return this;
  }
  
  /**
   * addExcludedDocumentsItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addExcludedDocumentsItem(String excludedDocumentsItem) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner faxNumber(String faxNumber) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner faxNumberMetadata(PropertyMetadata faxNumberMetadata) {
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
   * hostEmail.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner hostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
    return this;
  }

  /**
   * .
   * @return hostEmail
   **/
  @Schema(description = "")
  public String getHostEmail() {
    return hostEmail;
  }

  /**
   * setHostEmail.
   **/
  public void setHostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
  }


  /**
   * hostEmailMetadata.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner hostEmailMetadata(PropertyMetadata hostEmailMetadata) {
    this.hostEmailMetadata = hostEmailMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `hostEmail` property is editable..
   * @return hostEmailMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `hostEmail` property is editable.")
  public PropertyMetadata getHostEmailMetadata() {
    return hostEmailMetadata;
  }

  /**
   * setHostEmailMetadata.
   **/
  public void setHostEmailMetadata(PropertyMetadata hostEmailMetadata) {
    this.hostEmailMetadata = hostEmailMetadata;
  }


  /**
   * hostName.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

  /**
   * Specifies the name of the signing host. It is a required element for In Person Signers recipient Type.  Maximum Length: 100 characters..
   * @return hostName
   **/
  @Schema(description = "Specifies the name of the signing host. It is a required element for In Person Signers recipient Type.  Maximum Length: 100 characters.")
  public String getHostName() {
    return hostName;
  }

  /**
   * setHostName.
   **/
  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  /**
   * hostNameMetadata.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner hostNameMetadata(PropertyMetadata hostNameMetadata) {
    this.hostNameMetadata = hostNameMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `hostName` property is editable..
   * @return hostNameMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `hostName` property is editable.")
  public PropertyMetadata getHostNameMetadata() {
    return hostNameMetadata;
  }

  /**
   * setHostNameMetadata.
   **/
  public void setHostNameMetadata(PropertyMetadata hostNameMetadata) {
    this.hostNameMetadata = hostNameMetadata;
  }


  /**
   * idCheckConfigurationName.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner idCheckConfigurationName(String idCheckConfigurationName) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner idCheckConfigurationNameMetadata(PropertyMetadata idCheckConfigurationNameMetadata) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner idCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner identityVerification(RecipientIdentityVerification identityVerification) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner inheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
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
   * inPersonSigningType.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner inPersonSigningType(String inPersonSigningType) {
    this.inPersonSigningType = inPersonSigningType;
    return this;
  }

  /**
   * .
   * @return inPersonSigningType
   **/
  @Schema(description = "")
  public String getInPersonSigningType() {
    return inPersonSigningType;
  }

  /**
   * setInPersonSigningType.
   **/
  public void setInPersonSigningType(String inPersonSigningType) {
    this.inPersonSigningType = inPersonSigningType;
  }


  /**
   * inPersonSigningTypeMetadata.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner inPersonSigningTypeMetadata(PropertyMetadata inPersonSigningTypeMetadata) {
    this.inPersonSigningTypeMetadata = inPersonSigningTypeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `inPersonSigningType` property is editable..
   * @return inPersonSigningTypeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `inPersonSigningType` property is editable.")
  public PropertyMetadata getInPersonSigningTypeMetadata() {
    return inPersonSigningTypeMetadata;
  }

  /**
   * setInPersonSigningTypeMetadata.
   **/
  public void setInPersonSigningTypeMetadata(PropertyMetadata inPersonSigningTypeMetadata) {
    this.inPersonSigningTypeMetadata = inPersonSigningTypeMetadata;
  }


  /**
   * lockedRecipientPhoneAuthEditable.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner lockedRecipientPhoneAuthEditable(String lockedRecipientPhoneAuthEditable) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner lockedRecipientSmsEditable(String lockedRecipientSmsEditable) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner name(String name) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner nameMetadata(PropertyMetadata nameMetadata) {
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
   * notaryHost.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner notaryHost(NotaryHost notaryHost) {
    this.notaryHost = notaryHost;
    return this;
  }

  /**
   * Information about the notary host. The following information is required when using the eNotary in-person signing flow:  - `name`: The name of the notary. - `email`: The email address of the notary. - `recipientId`: A unique ID number for the notary signing host..
   * @return notaryHost
   **/
  @Schema(description = "Information about the notary host. The following information is required when using the eNotary in-person signing flow:  - `name`: The name of the notary. - `email`: The email address of the notary. - `recipientId`: A unique ID number for the notary signing host.")
  public NotaryHost getNotaryHost() {
    return notaryHost;
  }

  /**
   * setNotaryHost.
   **/
  public void setNotaryHost(NotaryHost notaryHost) {
    this.notaryHost = notaryHost;
  }


  /**
   * notaryId.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner notaryId(String notaryId) {
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
   * note.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner note(String note) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner noteMetadata(PropertyMetadata noteMetadata) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner offlineAttributes(OfflineAttributes offlineAttributes) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner phoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
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
   * recipientAttachments.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner recipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
    return this;
  }
  
  /**
   * addRecipientAttachmentsItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addRecipientAttachmentsItem(RecipientAttachment recipientAttachmentsItem) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner recipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner recipientFeatureMetadata(java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata) {
    this.recipientFeatureMetadata = recipientFeatureMetadata;
    return this;
  }
  
  /**
   * addRecipientFeatureMetadataItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addRecipientFeatureMetadataItem(FeatureAvailableMetadata recipientFeatureMetadataItem) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner recipientId(String recipientId) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner recipientIdGuid(String recipientIdGuid) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner recipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
    return this;
  }
  
  /**
   * addRecipientSignatureProvidersItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addRecipientSignatureProvidersItem(RecipientSignatureProvider recipientSignatureProvidersItem) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner recipientSuppliesTabs(String recipientSuppliesTabs) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner recipientType(String recipientType) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner recipientTypeMetadata(PropertyMetadata recipientTypeMetadata) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner requireIdLookup(String requireIdLookup) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner requireIdLookupMetadata(PropertyMetadata requireIdLookupMetadata) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner requireSignerCertificate(String requireSignerCertificate) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner requireSignOnPaper(String requireSignOnPaper) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner requireUploadSignature(String requireUploadSignature) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner roleName(String roleName) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner routingOrder(String routingOrder) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner routingOrderMetadata(PropertyMetadata routingOrderMetadata) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner sentDateTime(String sentDateTime) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner signatureInfo(RecipientSignatureInformation signatureInfo) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner signedDateTime(String signedDateTime) {
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
   * signerEmail.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
    return this;
  }

  /**
   * The email address for an InPersonSigner recipient Type.   Maximum Length: 100 characters. .
   * @return signerEmail
   **/
  @Schema(description = "The email address for an InPersonSigner recipient Type.   Maximum Length: 100 characters. ")
  public String getSignerEmail() {
    return signerEmail;
  }

  /**
   * setSignerEmail.
   **/
  public void setSignerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
  }


  /**
   * signerEmailMetadata.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signerEmailMetadata(PropertyMetadata signerEmailMetadata) {
    this.signerEmailMetadata = signerEmailMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the sender can edit the in-person signer's email address..
   * @return signerEmailMetadata
   **/
  @Schema(description = "Metadata that indicates if the sender can edit the in-person signer's email address.")
  public PropertyMetadata getSignerEmailMetadata() {
    return signerEmailMetadata;
  }

  /**
   * setSignerEmailMetadata.
   **/
  public void setSignerEmailMetadata(PropertyMetadata signerEmailMetadata) {
    this.signerEmailMetadata = signerEmailMetadata;
  }


  /**
   * signerFirstName.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signerFirstName(String signerFirstName) {
    this.signerFirstName = signerFirstName;
    return this;
  }

  /**
   * .
   * @return signerFirstName
   **/
  @Schema(description = "")
  public String getSignerFirstName() {
    return signerFirstName;
  }

  /**
   * setSignerFirstName.
   **/
  public void setSignerFirstName(String signerFirstName) {
    this.signerFirstName = signerFirstName;
  }


  /**
   * signerFirstNameMetadata.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signerFirstNameMetadata(PropertyMetadata signerFirstNameMetadata) {
    this.signerFirstNameMetadata = signerFirstNameMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the `signerFirstName` property is editable..
   * @return signerFirstNameMetadata
   **/
  @Schema(description = "Metadata that indicates if the `signerFirstName` property is editable.")
  public PropertyMetadata getSignerFirstNameMetadata() {
    return signerFirstNameMetadata;
  }

  /**
   * setSignerFirstNameMetadata.
   **/
  public void setSignerFirstNameMetadata(PropertyMetadata signerFirstNameMetadata) {
    this.signerFirstNameMetadata = signerFirstNameMetadata;
  }


  /**
   * signerLastName.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signerLastName(String signerLastName) {
    this.signerLastName = signerLastName;
    return this;
  }

  /**
   * .
   * @return signerLastName
   **/
  @Schema(description = "")
  public String getSignerLastName() {
    return signerLastName;
  }

  /**
   * setSignerLastName.
   **/
  public void setSignerLastName(String signerLastName) {
    this.signerLastName = signerLastName;
  }


  /**
   * signerLastNameMetadata.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signerLastNameMetadata(PropertyMetadata signerLastNameMetadata) {
    this.signerLastNameMetadata = signerLastNameMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `signerLastName` property is editable..
   * @return signerLastNameMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `signerLastName` property is editable.")
  public PropertyMetadata getSignerLastNameMetadata() {
    return signerLastNameMetadata;
  }

  /**
   * setSignerLastNameMetadata.
   **/
  public void setSignerLastNameMetadata(PropertyMetadata signerLastNameMetadata) {
    this.signerLastNameMetadata = signerLastNameMetadata;
  }


  /**
   * signerName.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }

  /**
   * Required. The full legal name of a signer for the envelope.   Maximum Length: 100 characters.   .
   * @return signerName
   **/
  @Schema(description = "Required. The full legal name of a signer for the envelope.   Maximum Length: 100 characters.   ")
  public String getSignerName() {
    return signerName;
  }

  /**
   * setSignerName.
   **/
  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }


  /**
   * signerNameMetadata.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signerNameMetadata(PropertyMetadata signerNameMetadata) {
    this.signerNameMetadata = signerNameMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `signerName` property is editable..
   * @return signerNameMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `signerName` property is editable.")
  public PropertyMetadata getSignerNameMetadata() {
    return signerNameMetadata;
  }

  /**
   * setSignerNameMetadata.
   **/
  public void setSignerNameMetadata(PropertyMetadata signerNameMetadata) {
    this.signerNameMetadata = signerNameMetadata;
  }


  /**
   * signInEachLocation.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signInEachLocation(String signInEachLocation) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner signInEachLocationMetadata(PropertyMetadata signInEachLocationMetadata) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner signingGroupId(String signingGroupId) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner signingGroupIdMetadata(PropertyMetadata signingGroupIdMetadata) {
    this.signingGroupIdMetadata = signingGroupIdMetadata;
    return this;
  }

  /**
   * Not applicable..
   * @return signingGroupIdMetadata
   **/
  @Schema(description = "Not applicable.")
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
   * @return InPersonSigner
   **/
  public InPersonSigner signingGroupName(String signingGroupName) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner signingGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
    return this;
  }
  
  /**
   * addSigningGroupUsersItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addSigningGroupUsersItem(UserInfo signingGroupUsersItem) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner smsAuthentication(RecipientSMSAuthentication smsAuthentication) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner socialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
    return this;
  }
  
  /**
   * addSocialAuthenticationsItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addSocialAuthenticationsItem(SocialAuthentication socialAuthenticationsItem) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner status(String status) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner statusCode(String statusCode) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner suppressEmails(String suppressEmails) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner tabs(Tabs tabs) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner templateLocked(String templateLocked) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner templateRequired(String templateRequired) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner totalTabCount(String totalTabCount) {
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
   * @return InPersonSigner
   **/
  public InPersonSigner userId(String userId) {
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
    InPersonSigner inPersonSigner = (InPersonSigner) o;
    return Objects.equals(this.accessCode, inPersonSigner.accessCode) &&
        Objects.equals(this.accessCodeMetadata, inPersonSigner.accessCodeMetadata) &&
        Objects.equals(this.addAccessCodeToEmail, inPersonSigner.addAccessCodeToEmail) &&
        Objects.equals(this.allowSystemOverrideForLockedRecipient, inPersonSigner.allowSystemOverrideForLockedRecipient) &&
        Objects.equals(this.autoNavigation, inPersonSigner.autoNavigation) &&
        Objects.equals(this.autoRespondedReason, inPersonSigner.autoRespondedReason) &&
        Objects.equals(this.bulkSendV2Recipient, inPersonSigner.bulkSendV2Recipient) &&
        Objects.equals(this.canSignOffline, inPersonSigner.canSignOffline) &&
        Objects.equals(this.clientUserId, inPersonSigner.clientUserId) &&
        Objects.equals(this.completedCount, inPersonSigner.completedCount) &&
        Objects.equals(this.creationReason, inPersonSigner.creationReason) &&
        Objects.equals(this.customFields, inPersonSigner.customFields) &&
        Objects.equals(this.declinedDateTime, inPersonSigner.declinedDateTime) &&
        Objects.equals(this.declinedReason, inPersonSigner.declinedReason) &&
        Objects.equals(this.defaultRecipient, inPersonSigner.defaultRecipient) &&
        Objects.equals(this.deliveredDateTime, inPersonSigner.deliveredDateTime) &&
        Objects.equals(this.deliveryMethod, inPersonSigner.deliveryMethod) &&
        Objects.equals(this.deliveryMethodMetadata, inPersonSigner.deliveryMethodMetadata) &&
        Objects.equals(this.designatorId, inPersonSigner.designatorId) &&
        Objects.equals(this.designatorIdGuid, inPersonSigner.designatorIdGuid) &&
        Objects.equals(this.documentVisibility, inPersonSigner.documentVisibility) &&
        Objects.equals(this.email, inPersonSigner.email) &&
        Objects.equals(this.emailMetadata, inPersonSigner.emailMetadata) &&
        Objects.equals(this.emailNotification, inPersonSigner.emailNotification) &&
        Objects.equals(this.embeddedRecipientStartURL, inPersonSigner.embeddedRecipientStartURL) &&
        Objects.equals(this.errorDetails, inPersonSigner.errorDetails) &&
        Objects.equals(this.excludedDocuments, inPersonSigner.excludedDocuments) &&
        Objects.equals(this.faxNumber, inPersonSigner.faxNumber) &&
        Objects.equals(this.faxNumberMetadata, inPersonSigner.faxNumberMetadata) &&
        Objects.equals(this.hostEmail, inPersonSigner.hostEmail) &&
        Objects.equals(this.hostEmailMetadata, inPersonSigner.hostEmailMetadata) &&
        Objects.equals(this.hostName, inPersonSigner.hostName) &&
        Objects.equals(this.hostNameMetadata, inPersonSigner.hostNameMetadata) &&
        Objects.equals(this.idCheckConfigurationName, inPersonSigner.idCheckConfigurationName) &&
        Objects.equals(this.idCheckConfigurationNameMetadata, inPersonSigner.idCheckConfigurationNameMetadata) &&
        Objects.equals(this.idCheckInformationInput, inPersonSigner.idCheckInformationInput) &&
        Objects.equals(this.identityVerification, inPersonSigner.identityVerification) &&
        Objects.equals(this.inheritEmailNotificationConfiguration, inPersonSigner.inheritEmailNotificationConfiguration) &&
        Objects.equals(this.inPersonSigningType, inPersonSigner.inPersonSigningType) &&
        Objects.equals(this.inPersonSigningTypeMetadata, inPersonSigner.inPersonSigningTypeMetadata) &&
        Objects.equals(this.lockedRecipientPhoneAuthEditable, inPersonSigner.lockedRecipientPhoneAuthEditable) &&
        Objects.equals(this.lockedRecipientSmsEditable, inPersonSigner.lockedRecipientSmsEditable) &&
        Objects.equals(this.name, inPersonSigner.name) &&
        Objects.equals(this.nameMetadata, inPersonSigner.nameMetadata) &&
        Objects.equals(this.notaryHost, inPersonSigner.notaryHost) &&
        Objects.equals(this.notaryId, inPersonSigner.notaryId) &&
        Objects.equals(this.note, inPersonSigner.note) &&
        Objects.equals(this.noteMetadata, inPersonSigner.noteMetadata) &&
        Objects.equals(this.offlineAttributes, inPersonSigner.offlineAttributes) &&
        Objects.equals(this.phoneAuthentication, inPersonSigner.phoneAuthentication) &&
        Objects.equals(this.recipientAttachments, inPersonSigner.recipientAttachments) &&
        Objects.equals(this.recipientAuthenticationStatus, inPersonSigner.recipientAuthenticationStatus) &&
        Objects.equals(this.recipientFeatureMetadata, inPersonSigner.recipientFeatureMetadata) &&
        Objects.equals(this.recipientId, inPersonSigner.recipientId) &&
        Objects.equals(this.recipientIdGuid, inPersonSigner.recipientIdGuid) &&
        Objects.equals(this.recipientSignatureProviders, inPersonSigner.recipientSignatureProviders) &&
        Objects.equals(this.recipientSuppliesTabs, inPersonSigner.recipientSuppliesTabs) &&
        Objects.equals(this.recipientType, inPersonSigner.recipientType) &&
        Objects.equals(this.recipientTypeMetadata, inPersonSigner.recipientTypeMetadata) &&
        Objects.equals(this.requireIdLookup, inPersonSigner.requireIdLookup) &&
        Objects.equals(this.requireIdLookupMetadata, inPersonSigner.requireIdLookupMetadata) &&
        Objects.equals(this.requireSignerCertificate, inPersonSigner.requireSignerCertificate) &&
        Objects.equals(this.requireSignOnPaper, inPersonSigner.requireSignOnPaper) &&
        Objects.equals(this.requireUploadSignature, inPersonSigner.requireUploadSignature) &&
        Objects.equals(this.roleName, inPersonSigner.roleName) &&
        Objects.equals(this.routingOrder, inPersonSigner.routingOrder) &&
        Objects.equals(this.routingOrderMetadata, inPersonSigner.routingOrderMetadata) &&
        Objects.equals(this.sentDateTime, inPersonSigner.sentDateTime) &&
        Objects.equals(this.signatureInfo, inPersonSigner.signatureInfo) &&
        Objects.equals(this.signedDateTime, inPersonSigner.signedDateTime) &&
        Objects.equals(this.signerEmail, inPersonSigner.signerEmail) &&
        Objects.equals(this.signerEmailMetadata, inPersonSigner.signerEmailMetadata) &&
        Objects.equals(this.signerFirstName, inPersonSigner.signerFirstName) &&
        Objects.equals(this.signerFirstNameMetadata, inPersonSigner.signerFirstNameMetadata) &&
        Objects.equals(this.signerLastName, inPersonSigner.signerLastName) &&
        Objects.equals(this.signerLastNameMetadata, inPersonSigner.signerLastNameMetadata) &&
        Objects.equals(this.signerName, inPersonSigner.signerName) &&
        Objects.equals(this.signerNameMetadata, inPersonSigner.signerNameMetadata) &&
        Objects.equals(this.signInEachLocation, inPersonSigner.signInEachLocation) &&
        Objects.equals(this.signInEachLocationMetadata, inPersonSigner.signInEachLocationMetadata) &&
        Objects.equals(this.signingGroupId, inPersonSigner.signingGroupId) &&
        Objects.equals(this.signingGroupIdMetadata, inPersonSigner.signingGroupIdMetadata) &&
        Objects.equals(this.signingGroupName, inPersonSigner.signingGroupName) &&
        Objects.equals(this.signingGroupUsers, inPersonSigner.signingGroupUsers) &&
        Objects.equals(this.smsAuthentication, inPersonSigner.smsAuthentication) &&
        Objects.equals(this.socialAuthentications, inPersonSigner.socialAuthentications) &&
        Objects.equals(this.status, inPersonSigner.status) &&
        Objects.equals(this.statusCode, inPersonSigner.statusCode) &&
        Objects.equals(this.suppressEmails, inPersonSigner.suppressEmails) &&
        Objects.equals(this.tabs, inPersonSigner.tabs) &&
        Objects.equals(this.templateLocked, inPersonSigner.templateLocked) &&
        Objects.equals(this.templateRequired, inPersonSigner.templateRequired) &&
        Objects.equals(this.totalTabCount, inPersonSigner.totalTabCount) &&
        Objects.equals(this.userId, inPersonSigner.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessCode, accessCodeMetadata, addAccessCodeToEmail, allowSystemOverrideForLockedRecipient, autoNavigation, autoRespondedReason, bulkSendV2Recipient, canSignOffline, clientUserId, completedCount, creationReason, customFields, declinedDateTime, declinedReason, defaultRecipient, deliveredDateTime, deliveryMethod, deliveryMethodMetadata, designatorId, designatorIdGuid, documentVisibility, email, emailMetadata, emailNotification, embeddedRecipientStartURL, errorDetails, excludedDocuments, faxNumber, faxNumberMetadata, hostEmail, hostEmailMetadata, hostName, hostNameMetadata, idCheckConfigurationName, idCheckConfigurationNameMetadata, idCheckInformationInput, identityVerification, inheritEmailNotificationConfiguration, inPersonSigningType, inPersonSigningTypeMetadata, lockedRecipientPhoneAuthEditable, lockedRecipientSmsEditable, name, nameMetadata, notaryHost, notaryId, note, noteMetadata, offlineAttributes, phoneAuthentication, recipientAttachments, recipientAuthenticationStatus, recipientFeatureMetadata, recipientId, recipientIdGuid, recipientSignatureProviders, recipientSuppliesTabs, recipientType, recipientTypeMetadata, requireIdLookup, requireIdLookupMetadata, requireSignerCertificate, requireSignOnPaper, requireUploadSignature, roleName, routingOrder, routingOrderMetadata, sentDateTime, signatureInfo, signedDateTime, signerEmail, signerEmailMetadata, signerFirstName, signerFirstNameMetadata, signerLastName, signerLastNameMetadata, signerName, signerNameMetadata, signInEachLocation, signInEachLocationMetadata, signingGroupId, signingGroupIdMetadata, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, statusCode, suppressEmails, tabs, templateLocked, templateRequired, totalTabCount, userId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InPersonSigner {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    accessCodeMetadata: ").append(toIndentedString(accessCodeMetadata)).append("\n");
    sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
    sb.append("    allowSystemOverrideForLockedRecipient: ").append(toIndentedString(allowSystemOverrideForLockedRecipient)).append("\n");
    sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
    sb.append("    autoRespondedReason: ").append(toIndentedString(autoRespondedReason)).append("\n");
    sb.append("    bulkSendV2Recipient: ").append(toIndentedString(bulkSendV2Recipient)).append("\n");
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
    sb.append("    hostEmail: ").append(toIndentedString(hostEmail)).append("\n");
    sb.append("    hostEmailMetadata: ").append(toIndentedString(hostEmailMetadata)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    hostNameMetadata: ").append(toIndentedString(hostNameMetadata)).append("\n");
    sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    sb.append("    idCheckConfigurationNameMetadata: ").append(toIndentedString(idCheckConfigurationNameMetadata)).append("\n");
    sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
    sb.append("    identityVerification: ").append(toIndentedString(identityVerification)).append("\n");
    sb.append("    inheritEmailNotificationConfiguration: ").append(toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
    sb.append("    inPersonSigningType: ").append(toIndentedString(inPersonSigningType)).append("\n");
    sb.append("    inPersonSigningTypeMetadata: ").append(toIndentedString(inPersonSigningTypeMetadata)).append("\n");
    sb.append("    lockedRecipientPhoneAuthEditable: ").append(toIndentedString(lockedRecipientPhoneAuthEditable)).append("\n");
    sb.append("    lockedRecipientSmsEditable: ").append(toIndentedString(lockedRecipientSmsEditable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    notaryHost: ").append(toIndentedString(notaryHost)).append("\n");
    sb.append("    notaryId: ").append(toIndentedString(notaryId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    noteMetadata: ").append(toIndentedString(noteMetadata)).append("\n");
    sb.append("    offlineAttributes: ").append(toIndentedString(offlineAttributes)).append("\n");
    sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
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
    sb.append("    signerEmail: ").append(toIndentedString(signerEmail)).append("\n");
    sb.append("    signerEmailMetadata: ").append(toIndentedString(signerEmailMetadata)).append("\n");
    sb.append("    signerFirstName: ").append(toIndentedString(signerFirstName)).append("\n");
    sb.append("    signerFirstNameMetadata: ").append(toIndentedString(signerFirstNameMetadata)).append("\n");
    sb.append("    signerLastName: ").append(toIndentedString(signerLastName)).append("\n");
    sb.append("    signerLastNameMetadata: ").append(toIndentedString(signerLastNameMetadata)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    signerNameMetadata: ").append(toIndentedString(signerNameMetadata)).append("\n");
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

