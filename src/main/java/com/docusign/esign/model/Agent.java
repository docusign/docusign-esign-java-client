package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.ConsentDetails;
import com.docusign.esign.model.DocumentVisibility;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.FeatureAvailableMetadata;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.RecipientAdditionalNotification;
import com.docusign.esign.model.RecipientAttachment;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientIdentityVerification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.RecipientPhoneNumber;
import com.docusign.esign.model.RecipientSMSAuthentication;
import com.docusign.esign.model.SocialAuthentication;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains information about agent recipients..
 *
 */
@Schema(description = "Contains information about agent recipients.")

public class Agent {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("accessCodeMetadata")
  private PropertyMetadata accessCodeMetadata = null;

  @JsonProperty("addAccessCodeToEmail")
  private String addAccessCodeToEmail = null;

  @JsonProperty("additionalNotifications")
  private java.util.List<RecipientAdditionalNotification> additionalNotifications = null;

  @JsonProperty("allowSystemOverrideForLockedRecipient")
  private String allowSystemOverrideForLockedRecipient = null;

  @JsonProperty("autoRespondedReason")
  private String autoRespondedReason = null;

  @JsonProperty("bulkSendV2Recipient")
  private String bulkSendV2Recipient = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("completedCount")
  private String completedCount = null;

  @JsonProperty("consentDetailsList")
  private java.util.List<ConsentDetails> consentDetailsList = null;

  @JsonProperty("customFields")
  private java.util.List<String> customFields = null;

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

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("noteMetadata")
  private PropertyMetadata noteMetadata = null;

  @JsonProperty("phoneAuthentication")
  private RecipientPhoneAuthentication phoneAuthentication = null;

  @JsonProperty("phoneNumber")
  private RecipientPhoneNumber phoneNumber = null;

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
   * @return Agent
   **/
  public Agent accessCode(String accessCode) {
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
   * @return Agent
   **/
  public Agent accessCodeMetadata(PropertyMetadata accessCodeMetadata) {
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
   * @return Agent
   **/
  public Agent addAccessCodeToEmail(String addAccessCodeToEmail) {
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
   * @return Agent
   **/
  public Agent additionalNotifications(java.util.List<RecipientAdditionalNotification> additionalNotifications) {
    this.additionalNotifications = additionalNotifications;
    return this;
  }
  
  /**
   * addAdditionalNotificationsItem.
   *
   * @return Agent
   **/
  public Agent addAdditionalNotificationsItem(RecipientAdditionalNotification additionalNotificationsItem) {
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
   * allowSystemOverrideForLockedRecipient.
   *
   * @return Agent
   **/
  public Agent allowSystemOverrideForLockedRecipient(String allowSystemOverrideForLockedRecipient) {
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
   * autoRespondedReason.
   *
   * @return Agent
   **/
  public Agent autoRespondedReason(String autoRespondedReason) {
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
   * @return Agent
   **/
  public Agent bulkSendV2Recipient(String bulkSendV2Recipient) {
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
   * clientUserId.
   *
   * @return Agent
   **/
  public Agent clientUserId(String clientUserId) {
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
   * @return Agent
   **/
  public Agent completedCount(String completedCount) {
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
   * @return Agent
   **/
  public Agent consentDetailsList(java.util.List<ConsentDetails> consentDetailsList) {
    this.consentDetailsList = consentDetailsList;
    return this;
  }
  
  /**
   * addConsentDetailsListItem.
   *
   * @return Agent
   **/
  public Agent addConsentDetailsListItem(ConsentDetails consentDetailsListItem) {
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
   * customFields.
   *
   * @return Agent
   **/
  public Agent customFields(java.util.List<String> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  /**
   * addCustomFieldsItem.
   *
   * @return Agent
   **/
  public Agent addCustomFieldsItem(String customFieldsItem) {
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
   * @return Agent
   **/
  public Agent declinedDateTime(String declinedDateTime) {
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
   * @return Agent
   **/
  public Agent declinedReason(String declinedReason) {
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
   * deliveredDateTime.
   *
   * @return Agent
   **/
  public Agent deliveredDateTime(String deliveredDateTime) {
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
   * @return Agent
   **/
  public Agent deliveryMethod(String deliveryMethod) {
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
   * @return Agent
   **/
  public Agent deliveryMethodMetadata(PropertyMetadata deliveryMethodMetadata) {
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
   * @return Agent
   **/
  public Agent designatorId(String designatorId) {
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
   * @return Agent
   **/
  public Agent designatorIdGuid(String designatorIdGuid) {
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
   * @return Agent
   **/
  public Agent documentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }
  
  /**
   * addDocumentVisibilityItem.
   *
   * @return Agent
   **/
  public Agent addDocumentVisibilityItem(DocumentVisibility documentVisibilityItem) {
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
   * @return Agent
   **/
  public Agent email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email id of the recipient. Notification of the document to sign is sent to this email id.   Maximum length: 100 characters. .
   * @return email
   **/
  @Schema(description = "Email id of the recipient. Notification of the document to sign is sent to this email id.   Maximum length: 100 characters. ")
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
   * @return Agent
   **/
  public Agent emailMetadata(PropertyMetadata emailMetadata) {
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
   * @return Agent
   **/
  public Agent emailNotification(RecipientEmailNotification emailNotification) {
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
   * @return Agent
   **/
  public Agent emailRecipientPostSigningURL(String emailRecipientPostSigningURL) {
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
   * @return Agent
   **/
  public Agent embeddedRecipientStartURL(String embeddedRecipientStartURL) {
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
   * @return Agent
   **/
  public Agent errorDetails(ErrorDetails errorDetails) {
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
   * @return Agent
   **/
  public Agent excludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
    return this;
  }
  
  /**
   * addExcludedDocumentsItem.
   *
   * @return Agent
   **/
  public Agent addExcludedDocumentsItem(String excludedDocumentsItem) {
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
   * @return Agent
   **/
  public Agent faxNumber(String faxNumber) {
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
   * @return Agent
   **/
  public Agent faxNumberMetadata(PropertyMetadata faxNumberMetadata) {
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
   * @return Agent
   **/
  public Agent firstName(String firstName) {
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
   * @return Agent
   **/
  public Agent firstNameMetadata(PropertyMetadata firstNameMetadata) {
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
   * @return Agent
   **/
  public Agent fullName(String fullName) {
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
   * @return Agent
   **/
  public Agent fullNameMetadata(PropertyMetadata fullNameMetadata) {
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
   * @return Agent
   **/
  public Agent idCheckConfigurationName(String idCheckConfigurationName) {
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
   * @return Agent
   **/
  public Agent idCheckConfigurationNameMetadata(PropertyMetadata idCheckConfigurationNameMetadata) {
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
   * @return Agent
   **/
  public Agent idCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
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
   * @return Agent
   **/
  public Agent identityVerification(RecipientIdentityVerification identityVerification) {
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
   * @return Agent
   **/
  public Agent inheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
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
   * lastName.
   *
   * @return Agent
   **/
  public Agent lastName(String lastName) {
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
   * @return Agent
   **/
  public Agent lastNameMetadata(PropertyMetadata lastNameMetadata) {
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
   * @return Agent
   **/
  public Agent lockedRecipientPhoneAuthEditable(String lockedRecipientPhoneAuthEditable) {
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
   * @return Agent
   **/
  public Agent lockedRecipientSmsEditable(String lockedRecipientSmsEditable) {
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
   * @return Agent
   **/
  public Agent name(String name) {
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
   * @return Agent
   **/
  public Agent nameMetadata(PropertyMetadata nameMetadata) {
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
   * note.
   *
   * @return Agent
   **/
  public Agent note(String note) {
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
   * @return Agent
   **/
  public Agent noteMetadata(PropertyMetadata noteMetadata) {
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
   * phoneAuthentication.
   *
   * @return Agent
   **/
  public Agent phoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
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
   * @return Agent
   **/
  public Agent phoneNumber(RecipientPhoneNumber phoneNumber) {
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
   * recipientAttachments.
   *
   * @return Agent
   **/
  public Agent recipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
    return this;
  }
  
  /**
   * addRecipientAttachmentsItem.
   *
   * @return Agent
   **/
  public Agent addRecipientAttachmentsItem(RecipientAttachment recipientAttachmentsItem) {
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
   * @return Agent
   **/
  public Agent recipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
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
   * @return Agent
   **/
  public Agent recipientFeatureMetadata(java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata) {
    this.recipientFeatureMetadata = recipientFeatureMetadata;
    return this;
  }
  
  /**
   * addRecipientFeatureMetadataItem.
   *
   * @return Agent
   **/
  public Agent addRecipientFeatureMetadataItem(FeatureAvailableMetadata recipientFeatureMetadataItem) {
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
   * @return Agent
   **/
  public Agent recipientId(String recipientId) {
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
   * @return Agent
   **/
  public Agent recipientIdGuid(String recipientIdGuid) {
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
   * recipientType.
   *
   * @return Agent
   **/
  public Agent recipientType(String recipientType) {
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
   * @return Agent
   **/
  public Agent recipientTypeMetadata(PropertyMetadata recipientTypeMetadata) {
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
   * @return Agent
   **/
  public Agent requireIdLookup(String requireIdLookup) {
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
   * @return Agent
   **/
  public Agent requireIdLookupMetadata(PropertyMetadata requireIdLookupMetadata) {
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
   * roleName.
   *
   * @return Agent
   **/
  public Agent roleName(String roleName) {
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
   * @return Agent
   **/
  public Agent routingOrder(String routingOrder) {
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
   * @return Agent
   **/
  public Agent routingOrderMetadata(PropertyMetadata routingOrderMetadata) {
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
   * @return Agent
   **/
  public Agent sentDateTime(String sentDateTime) {
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
   * signedDateTime.
   *
   * @return Agent
   **/
  public Agent signedDateTime(String signedDateTime) {
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
   * signingGroupId.
   *
   * @return Agent
   **/
  public Agent signingGroupId(String signingGroupId) {
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
   * @return Agent
   **/
  public Agent signingGroupIdMetadata(PropertyMetadata signingGroupIdMetadata) {
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
   * @return Agent
   **/
  public Agent signingGroupName(String signingGroupName) {
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
   * @return Agent
   **/
  public Agent signingGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
    return this;
  }
  
  /**
   * addSigningGroupUsersItem.
   *
   * @return Agent
   **/
  public Agent addSigningGroupUsersItem(UserInfo signingGroupUsersItem) {
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
   * @return Agent
   **/
  public Agent smsAuthentication(RecipientSMSAuthentication smsAuthentication) {
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
   * @return Agent
   **/
  public Agent socialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
    return this;
  }
  
  /**
   * addSocialAuthenticationsItem.
   *
   * @return Agent
   **/
  public Agent addSocialAuthenticationsItem(SocialAuthentication socialAuthenticationsItem) {
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
   * @return Agent
   **/
  public Agent status(String status) {
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
   * @return Agent
   **/
  public Agent statusCode(String statusCode) {
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
   * @return Agent
   **/
  public Agent suppressEmails(String suppressEmails) {
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
   * templateLocked.
   *
   * @return Agent
   **/
  public Agent templateLocked(String templateLocked) {
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
   * @return Agent
   **/
  public Agent templateRequired(String templateRequired) {
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
   * @return Agent
   **/
  public Agent totalTabCount(String totalTabCount) {
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
   * @return Agent
   **/
  public Agent userId(String userId) {
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
    Agent agent = (Agent) o;
    return Objects.equals(this.accessCode, agent.accessCode) &&
        Objects.equals(this.accessCodeMetadata, agent.accessCodeMetadata) &&
        Objects.equals(this.addAccessCodeToEmail, agent.addAccessCodeToEmail) &&
        Objects.equals(this.additionalNotifications, agent.additionalNotifications) &&
        Objects.equals(this.allowSystemOverrideForLockedRecipient, agent.allowSystemOverrideForLockedRecipient) &&
        Objects.equals(this.autoRespondedReason, agent.autoRespondedReason) &&
        Objects.equals(this.bulkSendV2Recipient, agent.bulkSendV2Recipient) &&
        Objects.equals(this.clientUserId, agent.clientUserId) &&
        Objects.equals(this.completedCount, agent.completedCount) &&
        Objects.equals(this.consentDetailsList, agent.consentDetailsList) &&
        Objects.equals(this.customFields, agent.customFields) &&
        Objects.equals(this.declinedDateTime, agent.declinedDateTime) &&
        Objects.equals(this.declinedReason, agent.declinedReason) &&
        Objects.equals(this.deliveredDateTime, agent.deliveredDateTime) &&
        Objects.equals(this.deliveryMethod, agent.deliveryMethod) &&
        Objects.equals(this.deliveryMethodMetadata, agent.deliveryMethodMetadata) &&
        Objects.equals(this.designatorId, agent.designatorId) &&
        Objects.equals(this.designatorIdGuid, agent.designatorIdGuid) &&
        Objects.equals(this.documentVisibility, agent.documentVisibility) &&
        Objects.equals(this.email, agent.email) &&
        Objects.equals(this.emailMetadata, agent.emailMetadata) &&
        Objects.equals(this.emailNotification, agent.emailNotification) &&
        Objects.equals(this.emailRecipientPostSigningURL, agent.emailRecipientPostSigningURL) &&
        Objects.equals(this.embeddedRecipientStartURL, agent.embeddedRecipientStartURL) &&
        Objects.equals(this.errorDetails, agent.errorDetails) &&
        Objects.equals(this.excludedDocuments, agent.excludedDocuments) &&
        Objects.equals(this.faxNumber, agent.faxNumber) &&
        Objects.equals(this.faxNumberMetadata, agent.faxNumberMetadata) &&
        Objects.equals(this.firstName, agent.firstName) &&
        Objects.equals(this.firstNameMetadata, agent.firstNameMetadata) &&
        Objects.equals(this.fullName, agent.fullName) &&
        Objects.equals(this.fullNameMetadata, agent.fullNameMetadata) &&
        Objects.equals(this.idCheckConfigurationName, agent.idCheckConfigurationName) &&
        Objects.equals(this.idCheckConfigurationNameMetadata, agent.idCheckConfigurationNameMetadata) &&
        Objects.equals(this.idCheckInformationInput, agent.idCheckInformationInput) &&
        Objects.equals(this.identityVerification, agent.identityVerification) &&
        Objects.equals(this.inheritEmailNotificationConfiguration, agent.inheritEmailNotificationConfiguration) &&
        Objects.equals(this.lastName, agent.lastName) &&
        Objects.equals(this.lastNameMetadata, agent.lastNameMetadata) &&
        Objects.equals(this.lockedRecipientPhoneAuthEditable, agent.lockedRecipientPhoneAuthEditable) &&
        Objects.equals(this.lockedRecipientSmsEditable, agent.lockedRecipientSmsEditable) &&
        Objects.equals(this.name, agent.name) &&
        Objects.equals(this.nameMetadata, agent.nameMetadata) &&
        Objects.equals(this.note, agent.note) &&
        Objects.equals(this.noteMetadata, agent.noteMetadata) &&
        Objects.equals(this.phoneAuthentication, agent.phoneAuthentication) &&
        Objects.equals(this.phoneNumber, agent.phoneNumber) &&
        Objects.equals(this.recipientAttachments, agent.recipientAttachments) &&
        Objects.equals(this.recipientAuthenticationStatus, agent.recipientAuthenticationStatus) &&
        Objects.equals(this.recipientFeatureMetadata, agent.recipientFeatureMetadata) &&
        Objects.equals(this.recipientId, agent.recipientId) &&
        Objects.equals(this.recipientIdGuid, agent.recipientIdGuid) &&
        Objects.equals(this.recipientType, agent.recipientType) &&
        Objects.equals(this.recipientTypeMetadata, agent.recipientTypeMetadata) &&
        Objects.equals(this.requireIdLookup, agent.requireIdLookup) &&
        Objects.equals(this.requireIdLookupMetadata, agent.requireIdLookupMetadata) &&
        Objects.equals(this.roleName, agent.roleName) &&
        Objects.equals(this.routingOrder, agent.routingOrder) &&
        Objects.equals(this.routingOrderMetadata, agent.routingOrderMetadata) &&
        Objects.equals(this.sentDateTime, agent.sentDateTime) &&
        Objects.equals(this.signedDateTime, agent.signedDateTime) &&
        Objects.equals(this.signingGroupId, agent.signingGroupId) &&
        Objects.equals(this.signingGroupIdMetadata, agent.signingGroupIdMetadata) &&
        Objects.equals(this.signingGroupName, agent.signingGroupName) &&
        Objects.equals(this.signingGroupUsers, agent.signingGroupUsers) &&
        Objects.equals(this.smsAuthentication, agent.smsAuthentication) &&
        Objects.equals(this.socialAuthentications, agent.socialAuthentications) &&
        Objects.equals(this.status, agent.status) &&
        Objects.equals(this.statusCode, agent.statusCode) &&
        Objects.equals(this.suppressEmails, agent.suppressEmails) &&
        Objects.equals(this.templateLocked, agent.templateLocked) &&
        Objects.equals(this.templateRequired, agent.templateRequired) &&
        Objects.equals(this.totalTabCount, agent.totalTabCount) &&
        Objects.equals(this.userId, agent.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessCode, accessCodeMetadata, addAccessCodeToEmail, additionalNotifications, allowSystemOverrideForLockedRecipient, autoRespondedReason, bulkSendV2Recipient, clientUserId, completedCount, consentDetailsList, customFields, declinedDateTime, declinedReason, deliveredDateTime, deliveryMethod, deliveryMethodMetadata, designatorId, designatorIdGuid, documentVisibility, email, emailMetadata, emailNotification, emailRecipientPostSigningURL, embeddedRecipientStartURL, errorDetails, excludedDocuments, faxNumber, faxNumberMetadata, firstName, firstNameMetadata, fullName, fullNameMetadata, idCheckConfigurationName, idCheckConfigurationNameMetadata, idCheckInformationInput, identityVerification, inheritEmailNotificationConfiguration, lastName, lastNameMetadata, lockedRecipientPhoneAuthEditable, lockedRecipientSmsEditable, name, nameMetadata, note, noteMetadata, phoneAuthentication, phoneNumber, recipientAttachments, recipientAuthenticationStatus, recipientFeatureMetadata, recipientId, recipientIdGuid, recipientType, recipientTypeMetadata, requireIdLookup, requireIdLookupMetadata, roleName, routingOrder, routingOrderMetadata, sentDateTime, signedDateTime, signingGroupId, signingGroupIdMetadata, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, statusCode, suppressEmails, templateLocked, templateRequired, totalTabCount, userId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    accessCodeMetadata: ").append(toIndentedString(accessCodeMetadata)).append("\n");
    sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
    sb.append("    additionalNotifications: ").append(toIndentedString(additionalNotifications)).append("\n");
    sb.append("    allowSystemOverrideForLockedRecipient: ").append(toIndentedString(allowSystemOverrideForLockedRecipient)).append("\n");
    sb.append("    autoRespondedReason: ").append(toIndentedString(autoRespondedReason)).append("\n");
    sb.append("    bulkSendV2Recipient: ").append(toIndentedString(bulkSendV2Recipient)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    completedCount: ").append(toIndentedString(completedCount)).append("\n");
    sb.append("    consentDetailsList: ").append(toIndentedString(consentDetailsList)).append("\n");
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
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    lastNameMetadata: ").append(toIndentedString(lastNameMetadata)).append("\n");
    sb.append("    lockedRecipientPhoneAuthEditable: ").append(toIndentedString(lockedRecipientPhoneAuthEditable)).append("\n");
    sb.append("    lockedRecipientSmsEditable: ").append(toIndentedString(lockedRecipientSmsEditable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    noteMetadata: ").append(toIndentedString(noteMetadata)).append("\n");
    sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

