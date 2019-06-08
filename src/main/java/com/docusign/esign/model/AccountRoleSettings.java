package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountRoleSettings
 */

public class AccountRoleSettings {
  @JsonProperty("allowAccountManagement")
  private String allowAccountManagement = null;

  @JsonProperty("allowAccountManagementMetadata")
  private SettingsMetadata allowAccountManagementMetadata = null;

  @JsonProperty("allowApiAccess")
  private String allowApiAccess = null;

  @JsonProperty("allowApiAccessMetadata")
  private SettingsMetadata allowApiAccessMetadata = null;

  @JsonProperty("allowApiAccessToAccount")
  private String allowApiAccessToAccount = null;

  @JsonProperty("allowApiAccessToAccountMetadata")
  private SettingsMetadata allowApiAccessToAccountMetadata = null;

  @JsonProperty("allowApiSendingOnBehalfOfOthers")
  private String allowApiSendingOnBehalfOfOthers = null;

  @JsonProperty("allowApiSendingOnBehalfOfOthersMetadata")
  private SettingsMetadata allowApiSendingOnBehalfOfOthersMetadata = null;

  @JsonProperty("allowApiSequentialSigning")
  private String allowApiSequentialSigning = null;

  @JsonProperty("allowApiSequentialSigningMetadata")
  private SettingsMetadata allowApiSequentialSigningMetadata = null;

  @JsonProperty("allowBulkSending")
  private String allowBulkSending = null;

  @JsonProperty("allowBulkSendingMetadata")
  private SettingsMetadata allowBulkSendingMetadata = null;

  @JsonProperty("allowDocuSignDesktopClient")
  private String allowDocuSignDesktopClient = null;

  @JsonProperty("allowDocuSignDesktopClientMetadata")
  private SettingsMetadata allowDocuSignDesktopClientMetadata = null;

  @JsonProperty("allowedAddressBookAccess")
  private String allowedAddressBookAccess = null;

  @JsonProperty("allowedAddressBookAccessMetadata")
  private SettingsMetadata allowedAddressBookAccessMetadata = null;

  @JsonProperty("allowedTemplateAccess")
  private String allowedTemplateAccess = null;

  @JsonProperty("allowedTemplateAccessMetadata")
  private SettingsMetadata allowedTemplateAccessMetadata = null;

  @JsonProperty("allowedToBeEnvelopeTransferRecipient")
  private String allowedToBeEnvelopeTransferRecipient = null;

  @JsonProperty("allowedToBeEnvelopeTransferRecipientMetadata")
  private SettingsMetadata allowedToBeEnvelopeTransferRecipientMetadata = null;

  @JsonProperty("allowEnvelopeSending")
  private String allowEnvelopeSending = null;

  @JsonProperty("allowEnvelopeSendingMetadata")
  private SettingsMetadata allowEnvelopeSendingMetadata = null;

  @JsonProperty("allowESealRecipients")
  private String allowESealRecipients = null;

  @JsonProperty("allowESealRecipientsMetadata")
  private SettingsMetadata allowESealRecipientsMetadata = null;

  @JsonProperty("allowPowerFormsAdminToAccessAllPowerFormEnvelopes")
  private String allowPowerFormsAdminToAccessAllPowerFormEnvelopes = null;

  @JsonProperty("allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata")
  private SettingsMetadata allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata = null;

  @JsonProperty("allowSendersToSetRecipientEmailLanguage")
  private String allowSendersToSetRecipientEmailLanguage = null;

  @JsonProperty("allowSendersToSetRecipientEmailLanguageMetadata")
  private SettingsMetadata allowSendersToSetRecipientEmailLanguageMetadata = null;

  @JsonProperty("allowSignerAttachments")
  private String allowSignerAttachments = null;

  @JsonProperty("allowSignerAttachmentsMetadata")
  private SettingsMetadata allowSignerAttachmentsMetadata = null;

  @JsonProperty("allowSupplementalDocuments")
  private String allowSupplementalDocuments = null;

  @JsonProperty("allowSupplementalDocumentsMetadata")
  private SettingsMetadata allowSupplementalDocumentsMetadata = null;

  @JsonProperty("allowTaggingInSendAndCorrect")
  private String allowTaggingInSendAndCorrect = null;

  @JsonProperty("allowTaggingInSendAndCorrectMetadata")
  private SettingsMetadata allowTaggingInSendAndCorrectMetadata = null;

  @JsonProperty("allowVaulting")
  private String allowVaulting = null;

  @JsonProperty("allowVaultingMetadata")
  private SettingsMetadata allowVaultingMetadata = null;

  @JsonProperty("allowWetSigningOverride")
  private String allowWetSigningOverride = null;

  @JsonProperty("allowWetSigningOverrideMetadata")
  private SettingsMetadata allowWetSigningOverrideMetadata = null;

  @JsonProperty("canCreateWorkspaces")
  private String canCreateWorkspaces = null;

  @JsonProperty("canCreateWorkspacesMetadata")
  private SettingsMetadata canCreateWorkspacesMetadata = null;

  @JsonProperty("disableDocumentUpload")
  private String disableDocumentUpload = null;

  @JsonProperty("disableDocumentUploadMetadata")
  private SettingsMetadata disableDocumentUploadMetadata = null;

  @JsonProperty("disableOtherActions")
  private String disableOtherActions = null;

  @JsonProperty("disableOtherActionsMetadata")
  private SettingsMetadata disableOtherActionsMetadata = null;

  @JsonProperty("enableApiRequestLogging")
  private String enableApiRequestLogging = null;

  @JsonProperty("enableApiRequestLoggingMetadata")
  private SettingsMetadata enableApiRequestLoggingMetadata = null;

  @JsonProperty("enableRecipientViewingNotifications")
  private String enableRecipientViewingNotifications = null;

  @JsonProperty("enableRecipientViewingNotificationsMetadata")
  private SettingsMetadata enableRecipientViewingNotificationsMetadata = null;

  @JsonProperty("enableSequentialSigningInterface")
  private String enableSequentialSigningInterface = null;

  @JsonProperty("enableSequentialSigningInterfaceMetadata")
  private SettingsMetadata enableSequentialSigningInterfaceMetadata = null;

  @JsonProperty("enableTransactionPointIntegration")
  private String enableTransactionPointIntegration = null;

  @JsonProperty("enableTransactionPointIntegrationMetadata")
  private SettingsMetadata enableTransactionPointIntegrationMetadata = null;

  @JsonProperty("powerFormRole")
  private String powerFormRole = null;

  @JsonProperty("powerFormRoleMetadata")
  private SettingsMetadata powerFormRoleMetadata = null;

  @JsonProperty("receiveCompletedSelfSignedDocumentsAsEmailLinks")
  private String receiveCompletedSelfSignedDocumentsAsEmailLinks = null;

  @JsonProperty("receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata")
  private SettingsMetadata receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata = null;

  @JsonProperty("signingUiVersionMetadata")
  private SettingsMetadata signingUiVersionMetadata = null;

  @JsonProperty("supplementalDocumentsMustAccept")
  private String supplementalDocumentsMustAccept = null;

  @JsonProperty("supplementalDocumentsMustAcceptMetadata")
  private SettingsMetadata supplementalDocumentsMustAcceptMetadata = null;

  @JsonProperty("supplementalDocumentsMustRead")
  private String supplementalDocumentsMustRead = null;

  @JsonProperty("supplementalDocumentsMustReadMetadata")
  private SettingsMetadata supplementalDocumentsMustReadMetadata = null;

  @JsonProperty("supplementalDocumentsMustView")
  private String supplementalDocumentsMustView = null;

  @JsonProperty("supplementalDocumentsMustViewMetadata")
  private SettingsMetadata supplementalDocumentsMustViewMetadata = null;

  @JsonProperty("useNewDocuSignExperienceInterface")
  private String useNewDocuSignExperienceInterface = null;

  @JsonProperty("useNewDocuSignExperienceInterfaceMetadata")
  private SettingsMetadata useNewDocuSignExperienceInterfaceMetadata = null;

  @JsonProperty("useNewSendingInterface")
  private String useNewSendingInterface = null;

  @JsonProperty("useNewSendingInterfaceMetadata")
  private SettingsMetadata useNewSendingInterfaceMetadata = null;

  @JsonProperty("vaultingMode")
  private String vaultingMode = null;

  @JsonProperty("vaultingModeMetadata")
  private SettingsMetadata vaultingModeMetadata = null;

  public AccountRoleSettings allowAccountManagement(String allowAccountManagement) {
    this.allowAccountManagement = allowAccountManagement;
    return this;
  }

   /**
   * 
   * @return allowAccountManagement
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowAccountManagement() {
    return allowAccountManagement;
  }

  public void setAllowAccountManagement(String allowAccountManagement) {
    this.allowAccountManagement = allowAccountManagement;
  }

  public AccountRoleSettings allowAccountManagementMetadata(SettingsMetadata allowAccountManagementMetadata) {
    this.allowAccountManagementMetadata = allowAccountManagementMetadata;
    return this;
  }

   /**
   * Get allowAccountManagementMetadata
   * @return allowAccountManagementMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowAccountManagementMetadata() {
    return allowAccountManagementMetadata;
  }

  public void setAllowAccountManagementMetadata(SettingsMetadata allowAccountManagementMetadata) {
    this.allowAccountManagementMetadata = allowAccountManagementMetadata;
  }

  public AccountRoleSettings allowApiAccess(String allowApiAccess) {
    this.allowApiAccess = allowApiAccess;
    return this;
  }

   /**
   * 
   * @return allowApiAccess
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowApiAccess() {
    return allowApiAccess;
  }

  public void setAllowApiAccess(String allowApiAccess) {
    this.allowApiAccess = allowApiAccess;
  }

  public AccountRoleSettings allowApiAccessMetadata(SettingsMetadata allowApiAccessMetadata) {
    this.allowApiAccessMetadata = allowApiAccessMetadata;
    return this;
  }

   /**
   * Get allowApiAccessMetadata
   * @return allowApiAccessMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowApiAccessMetadata() {
    return allowApiAccessMetadata;
  }

  public void setAllowApiAccessMetadata(SettingsMetadata allowApiAccessMetadata) {
    this.allowApiAccessMetadata = allowApiAccessMetadata;
  }

  public AccountRoleSettings allowApiAccessToAccount(String allowApiAccessToAccount) {
    this.allowApiAccessToAccount = allowApiAccessToAccount;
    return this;
  }

   /**
   * 
   * @return allowApiAccessToAccount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowApiAccessToAccount() {
    return allowApiAccessToAccount;
  }

  public void setAllowApiAccessToAccount(String allowApiAccessToAccount) {
    this.allowApiAccessToAccount = allowApiAccessToAccount;
  }

  public AccountRoleSettings allowApiAccessToAccountMetadata(SettingsMetadata allowApiAccessToAccountMetadata) {
    this.allowApiAccessToAccountMetadata = allowApiAccessToAccountMetadata;
    return this;
  }

   /**
   * Get allowApiAccessToAccountMetadata
   * @return allowApiAccessToAccountMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowApiAccessToAccountMetadata() {
    return allowApiAccessToAccountMetadata;
  }

  public void setAllowApiAccessToAccountMetadata(SettingsMetadata allowApiAccessToAccountMetadata) {
    this.allowApiAccessToAccountMetadata = allowApiAccessToAccountMetadata;
  }

  public AccountRoleSettings allowApiSendingOnBehalfOfOthers(String allowApiSendingOnBehalfOfOthers) {
    this.allowApiSendingOnBehalfOfOthers = allowApiSendingOnBehalfOfOthers;
    return this;
  }

   /**
   * 
   * @return allowApiSendingOnBehalfOfOthers
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowApiSendingOnBehalfOfOthers() {
    return allowApiSendingOnBehalfOfOthers;
  }

  public void setAllowApiSendingOnBehalfOfOthers(String allowApiSendingOnBehalfOfOthers) {
    this.allowApiSendingOnBehalfOfOthers = allowApiSendingOnBehalfOfOthers;
  }

  public AccountRoleSettings allowApiSendingOnBehalfOfOthersMetadata(SettingsMetadata allowApiSendingOnBehalfOfOthersMetadata) {
    this.allowApiSendingOnBehalfOfOthersMetadata = allowApiSendingOnBehalfOfOthersMetadata;
    return this;
  }

   /**
   * Get allowApiSendingOnBehalfOfOthersMetadata
   * @return allowApiSendingOnBehalfOfOthersMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowApiSendingOnBehalfOfOthersMetadata() {
    return allowApiSendingOnBehalfOfOthersMetadata;
  }

  public void setAllowApiSendingOnBehalfOfOthersMetadata(SettingsMetadata allowApiSendingOnBehalfOfOthersMetadata) {
    this.allowApiSendingOnBehalfOfOthersMetadata = allowApiSendingOnBehalfOfOthersMetadata;
  }

  public AccountRoleSettings allowApiSequentialSigning(String allowApiSequentialSigning) {
    this.allowApiSequentialSigning = allowApiSequentialSigning;
    return this;
  }

   /**
   * 
   * @return allowApiSequentialSigning
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowApiSequentialSigning() {
    return allowApiSequentialSigning;
  }

  public void setAllowApiSequentialSigning(String allowApiSequentialSigning) {
    this.allowApiSequentialSigning = allowApiSequentialSigning;
  }

  public AccountRoleSettings allowApiSequentialSigningMetadata(SettingsMetadata allowApiSequentialSigningMetadata) {
    this.allowApiSequentialSigningMetadata = allowApiSequentialSigningMetadata;
    return this;
  }

   /**
   * Get allowApiSequentialSigningMetadata
   * @return allowApiSequentialSigningMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowApiSequentialSigningMetadata() {
    return allowApiSequentialSigningMetadata;
  }

  public void setAllowApiSequentialSigningMetadata(SettingsMetadata allowApiSequentialSigningMetadata) {
    this.allowApiSequentialSigningMetadata = allowApiSequentialSigningMetadata;
  }

  public AccountRoleSettings allowBulkSending(String allowBulkSending) {
    this.allowBulkSending = allowBulkSending;
    return this;
  }

   /**
   * 
   * @return allowBulkSending
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowBulkSending() {
    return allowBulkSending;
  }

  public void setAllowBulkSending(String allowBulkSending) {
    this.allowBulkSending = allowBulkSending;
  }

  public AccountRoleSettings allowBulkSendingMetadata(SettingsMetadata allowBulkSendingMetadata) {
    this.allowBulkSendingMetadata = allowBulkSendingMetadata;
    return this;
  }

   /**
   * Get allowBulkSendingMetadata
   * @return allowBulkSendingMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowBulkSendingMetadata() {
    return allowBulkSendingMetadata;
  }

  public void setAllowBulkSendingMetadata(SettingsMetadata allowBulkSendingMetadata) {
    this.allowBulkSendingMetadata = allowBulkSendingMetadata;
  }

  public AccountRoleSettings allowDocuSignDesktopClient(String allowDocuSignDesktopClient) {
    this.allowDocuSignDesktopClient = allowDocuSignDesktopClient;
    return this;
  }

   /**
   * 
   * @return allowDocuSignDesktopClient
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowDocuSignDesktopClient() {
    return allowDocuSignDesktopClient;
  }

  public void setAllowDocuSignDesktopClient(String allowDocuSignDesktopClient) {
    this.allowDocuSignDesktopClient = allowDocuSignDesktopClient;
  }

  public AccountRoleSettings allowDocuSignDesktopClientMetadata(SettingsMetadata allowDocuSignDesktopClientMetadata) {
    this.allowDocuSignDesktopClientMetadata = allowDocuSignDesktopClientMetadata;
    return this;
  }

   /**
   * Get allowDocuSignDesktopClientMetadata
   * @return allowDocuSignDesktopClientMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowDocuSignDesktopClientMetadata() {
    return allowDocuSignDesktopClientMetadata;
  }

  public void setAllowDocuSignDesktopClientMetadata(SettingsMetadata allowDocuSignDesktopClientMetadata) {
    this.allowDocuSignDesktopClientMetadata = allowDocuSignDesktopClientMetadata;
  }

  public AccountRoleSettings allowedAddressBookAccess(String allowedAddressBookAccess) {
    this.allowedAddressBookAccess = allowedAddressBookAccess;
    return this;
  }

   /**
   * 
   * @return allowedAddressBookAccess
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowedAddressBookAccess() {
    return allowedAddressBookAccess;
  }

  public void setAllowedAddressBookAccess(String allowedAddressBookAccess) {
    this.allowedAddressBookAccess = allowedAddressBookAccess;
  }

  public AccountRoleSettings allowedAddressBookAccessMetadata(SettingsMetadata allowedAddressBookAccessMetadata) {
    this.allowedAddressBookAccessMetadata = allowedAddressBookAccessMetadata;
    return this;
  }

   /**
   * Get allowedAddressBookAccessMetadata
   * @return allowedAddressBookAccessMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowedAddressBookAccessMetadata() {
    return allowedAddressBookAccessMetadata;
  }

  public void setAllowedAddressBookAccessMetadata(SettingsMetadata allowedAddressBookAccessMetadata) {
    this.allowedAddressBookAccessMetadata = allowedAddressBookAccessMetadata;
  }

  public AccountRoleSettings allowedTemplateAccess(String allowedTemplateAccess) {
    this.allowedTemplateAccess = allowedTemplateAccess;
    return this;
  }

   /**
   * 
   * @return allowedTemplateAccess
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowedTemplateAccess() {
    return allowedTemplateAccess;
  }

  public void setAllowedTemplateAccess(String allowedTemplateAccess) {
    this.allowedTemplateAccess = allowedTemplateAccess;
  }

  public AccountRoleSettings allowedTemplateAccessMetadata(SettingsMetadata allowedTemplateAccessMetadata) {
    this.allowedTemplateAccessMetadata = allowedTemplateAccessMetadata;
    return this;
  }

   /**
   * Get allowedTemplateAccessMetadata
   * @return allowedTemplateAccessMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowedTemplateAccessMetadata() {
    return allowedTemplateAccessMetadata;
  }

  public void setAllowedTemplateAccessMetadata(SettingsMetadata allowedTemplateAccessMetadata) {
    this.allowedTemplateAccessMetadata = allowedTemplateAccessMetadata;
  }

  public AccountRoleSettings allowedToBeEnvelopeTransferRecipient(String allowedToBeEnvelopeTransferRecipient) {
    this.allowedToBeEnvelopeTransferRecipient = allowedToBeEnvelopeTransferRecipient;
    return this;
  }

   /**
   * 
   * @return allowedToBeEnvelopeTransferRecipient
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowedToBeEnvelopeTransferRecipient() {
    return allowedToBeEnvelopeTransferRecipient;
  }

  public void setAllowedToBeEnvelopeTransferRecipient(String allowedToBeEnvelopeTransferRecipient) {
    this.allowedToBeEnvelopeTransferRecipient = allowedToBeEnvelopeTransferRecipient;
  }

  public AccountRoleSettings allowedToBeEnvelopeTransferRecipientMetadata(SettingsMetadata allowedToBeEnvelopeTransferRecipientMetadata) {
    this.allowedToBeEnvelopeTransferRecipientMetadata = allowedToBeEnvelopeTransferRecipientMetadata;
    return this;
  }

   /**
   * Get allowedToBeEnvelopeTransferRecipientMetadata
   * @return allowedToBeEnvelopeTransferRecipientMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowedToBeEnvelopeTransferRecipientMetadata() {
    return allowedToBeEnvelopeTransferRecipientMetadata;
  }

  public void setAllowedToBeEnvelopeTransferRecipientMetadata(SettingsMetadata allowedToBeEnvelopeTransferRecipientMetadata) {
    this.allowedToBeEnvelopeTransferRecipientMetadata = allowedToBeEnvelopeTransferRecipientMetadata;
  }

  public AccountRoleSettings allowEnvelopeSending(String allowEnvelopeSending) {
    this.allowEnvelopeSending = allowEnvelopeSending;
    return this;
  }

   /**
   * 
   * @return allowEnvelopeSending
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowEnvelopeSending() {
    return allowEnvelopeSending;
  }

  public void setAllowEnvelopeSending(String allowEnvelopeSending) {
    this.allowEnvelopeSending = allowEnvelopeSending;
  }

  public AccountRoleSettings allowEnvelopeSendingMetadata(SettingsMetadata allowEnvelopeSendingMetadata) {
    this.allowEnvelopeSendingMetadata = allowEnvelopeSendingMetadata;
    return this;
  }

   /**
   * Get allowEnvelopeSendingMetadata
   * @return allowEnvelopeSendingMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowEnvelopeSendingMetadata() {
    return allowEnvelopeSendingMetadata;
  }

  public void setAllowEnvelopeSendingMetadata(SettingsMetadata allowEnvelopeSendingMetadata) {
    this.allowEnvelopeSendingMetadata = allowEnvelopeSendingMetadata;
  }

  public AccountRoleSettings allowESealRecipients(String allowESealRecipients) {
    this.allowESealRecipients = allowESealRecipients;
    return this;
  }

   /**
   * 
   * @return allowESealRecipients
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowESealRecipients() {
    return allowESealRecipients;
  }

  public void setAllowESealRecipients(String allowESealRecipients) {
    this.allowESealRecipients = allowESealRecipients;
  }

  public AccountRoleSettings allowESealRecipientsMetadata(SettingsMetadata allowESealRecipientsMetadata) {
    this.allowESealRecipientsMetadata = allowESealRecipientsMetadata;
    return this;
  }

   /**
   * Get allowESealRecipientsMetadata
   * @return allowESealRecipientsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowESealRecipientsMetadata() {
    return allowESealRecipientsMetadata;
  }

  public void setAllowESealRecipientsMetadata(SettingsMetadata allowESealRecipientsMetadata) {
    this.allowESealRecipientsMetadata = allowESealRecipientsMetadata;
  }

  public AccountRoleSettings allowPowerFormsAdminToAccessAllPowerFormEnvelopes(String allowPowerFormsAdminToAccessAllPowerFormEnvelopes) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopes = allowPowerFormsAdminToAccessAllPowerFormEnvelopes;
    return this;
  }

   /**
   * 
   * @return allowPowerFormsAdminToAccessAllPowerFormEnvelopes
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowPowerFormsAdminToAccessAllPowerFormEnvelopes() {
    return allowPowerFormsAdminToAccessAllPowerFormEnvelopes;
  }

  public void setAllowPowerFormsAdminToAccessAllPowerFormEnvelopes(String allowPowerFormsAdminToAccessAllPowerFormEnvelopes) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopes = allowPowerFormsAdminToAccessAllPowerFormEnvelopes;
  }

  public AccountRoleSettings allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata(SettingsMetadata allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata = allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata;
    return this;
  }

   /**
   * Get allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata
   * @return allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata() {
    return allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata;
  }

  public void setAllowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata(SettingsMetadata allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata = allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata;
  }

  public AccountRoleSettings allowSendersToSetRecipientEmailLanguage(String allowSendersToSetRecipientEmailLanguage) {
    this.allowSendersToSetRecipientEmailLanguage = allowSendersToSetRecipientEmailLanguage;
    return this;
  }

   /**
   * 
   * @return allowSendersToSetRecipientEmailLanguage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowSendersToSetRecipientEmailLanguage() {
    return allowSendersToSetRecipientEmailLanguage;
  }

  public void setAllowSendersToSetRecipientEmailLanguage(String allowSendersToSetRecipientEmailLanguage) {
    this.allowSendersToSetRecipientEmailLanguage = allowSendersToSetRecipientEmailLanguage;
  }

  public AccountRoleSettings allowSendersToSetRecipientEmailLanguageMetadata(SettingsMetadata allowSendersToSetRecipientEmailLanguageMetadata) {
    this.allowSendersToSetRecipientEmailLanguageMetadata = allowSendersToSetRecipientEmailLanguageMetadata;
    return this;
  }

   /**
   * Get allowSendersToSetRecipientEmailLanguageMetadata
   * @return allowSendersToSetRecipientEmailLanguageMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowSendersToSetRecipientEmailLanguageMetadata() {
    return allowSendersToSetRecipientEmailLanguageMetadata;
  }

  public void setAllowSendersToSetRecipientEmailLanguageMetadata(SettingsMetadata allowSendersToSetRecipientEmailLanguageMetadata) {
    this.allowSendersToSetRecipientEmailLanguageMetadata = allowSendersToSetRecipientEmailLanguageMetadata;
  }

  public AccountRoleSettings allowSignerAttachments(String allowSignerAttachments) {
    this.allowSignerAttachments = allowSignerAttachments;
    return this;
  }

   /**
   * 
   * @return allowSignerAttachments
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowSignerAttachments() {
    return allowSignerAttachments;
  }

  public void setAllowSignerAttachments(String allowSignerAttachments) {
    this.allowSignerAttachments = allowSignerAttachments;
  }

  public AccountRoleSettings allowSignerAttachmentsMetadata(SettingsMetadata allowSignerAttachmentsMetadata) {
    this.allowSignerAttachmentsMetadata = allowSignerAttachmentsMetadata;
    return this;
  }

   /**
   * Get allowSignerAttachmentsMetadata
   * @return allowSignerAttachmentsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowSignerAttachmentsMetadata() {
    return allowSignerAttachmentsMetadata;
  }

  public void setAllowSignerAttachmentsMetadata(SettingsMetadata allowSignerAttachmentsMetadata) {
    this.allowSignerAttachmentsMetadata = allowSignerAttachmentsMetadata;
  }

  public AccountRoleSettings allowSupplementalDocuments(String allowSupplementalDocuments) {
    this.allowSupplementalDocuments = allowSupplementalDocuments;
    return this;
  }

   /**
   * 
   * @return allowSupplementalDocuments
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowSupplementalDocuments() {
    return allowSupplementalDocuments;
  }

  public void setAllowSupplementalDocuments(String allowSupplementalDocuments) {
    this.allowSupplementalDocuments = allowSupplementalDocuments;
  }

  public AccountRoleSettings allowSupplementalDocumentsMetadata(SettingsMetadata allowSupplementalDocumentsMetadata) {
    this.allowSupplementalDocumentsMetadata = allowSupplementalDocumentsMetadata;
    return this;
  }

   /**
   * Get allowSupplementalDocumentsMetadata
   * @return allowSupplementalDocumentsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowSupplementalDocumentsMetadata() {
    return allowSupplementalDocumentsMetadata;
  }

  public void setAllowSupplementalDocumentsMetadata(SettingsMetadata allowSupplementalDocumentsMetadata) {
    this.allowSupplementalDocumentsMetadata = allowSupplementalDocumentsMetadata;
  }

  public AccountRoleSettings allowTaggingInSendAndCorrect(String allowTaggingInSendAndCorrect) {
    this.allowTaggingInSendAndCorrect = allowTaggingInSendAndCorrect;
    return this;
  }

   /**
   * 
   * @return allowTaggingInSendAndCorrect
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowTaggingInSendAndCorrect() {
    return allowTaggingInSendAndCorrect;
  }

  public void setAllowTaggingInSendAndCorrect(String allowTaggingInSendAndCorrect) {
    this.allowTaggingInSendAndCorrect = allowTaggingInSendAndCorrect;
  }

  public AccountRoleSettings allowTaggingInSendAndCorrectMetadata(SettingsMetadata allowTaggingInSendAndCorrectMetadata) {
    this.allowTaggingInSendAndCorrectMetadata = allowTaggingInSendAndCorrectMetadata;
    return this;
  }

   /**
   * Get allowTaggingInSendAndCorrectMetadata
   * @return allowTaggingInSendAndCorrectMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowTaggingInSendAndCorrectMetadata() {
    return allowTaggingInSendAndCorrectMetadata;
  }

  public void setAllowTaggingInSendAndCorrectMetadata(SettingsMetadata allowTaggingInSendAndCorrectMetadata) {
    this.allowTaggingInSendAndCorrectMetadata = allowTaggingInSendAndCorrectMetadata;
  }

  public AccountRoleSettings allowVaulting(String allowVaulting) {
    this.allowVaulting = allowVaulting;
    return this;
  }

   /**
   * 
   * @return allowVaulting
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowVaulting() {
    return allowVaulting;
  }

  public void setAllowVaulting(String allowVaulting) {
    this.allowVaulting = allowVaulting;
  }

  public AccountRoleSettings allowVaultingMetadata(SettingsMetadata allowVaultingMetadata) {
    this.allowVaultingMetadata = allowVaultingMetadata;
    return this;
  }

   /**
   * Get allowVaultingMetadata
   * @return allowVaultingMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowVaultingMetadata() {
    return allowVaultingMetadata;
  }

  public void setAllowVaultingMetadata(SettingsMetadata allowVaultingMetadata) {
    this.allowVaultingMetadata = allowVaultingMetadata;
  }

  public AccountRoleSettings allowWetSigningOverride(String allowWetSigningOverride) {
    this.allowWetSigningOverride = allowWetSigningOverride;
    return this;
  }

   /**
   * 
   * @return allowWetSigningOverride
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowWetSigningOverride() {
    return allowWetSigningOverride;
  }

  public void setAllowWetSigningOverride(String allowWetSigningOverride) {
    this.allowWetSigningOverride = allowWetSigningOverride;
  }

  public AccountRoleSettings allowWetSigningOverrideMetadata(SettingsMetadata allowWetSigningOverrideMetadata) {
    this.allowWetSigningOverrideMetadata = allowWetSigningOverrideMetadata;
    return this;
  }

   /**
   * Get allowWetSigningOverrideMetadata
   * @return allowWetSigningOverrideMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAllowWetSigningOverrideMetadata() {
    return allowWetSigningOverrideMetadata;
  }

  public void setAllowWetSigningOverrideMetadata(SettingsMetadata allowWetSigningOverrideMetadata) {
    this.allowWetSigningOverrideMetadata = allowWetSigningOverrideMetadata;
  }

  public AccountRoleSettings canCreateWorkspaces(String canCreateWorkspaces) {
    this.canCreateWorkspaces = canCreateWorkspaces;
    return this;
  }

   /**
   * 
   * @return canCreateWorkspaces
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCanCreateWorkspaces() {
    return canCreateWorkspaces;
  }

  public void setCanCreateWorkspaces(String canCreateWorkspaces) {
    this.canCreateWorkspaces = canCreateWorkspaces;
  }

  public AccountRoleSettings canCreateWorkspacesMetadata(SettingsMetadata canCreateWorkspacesMetadata) {
    this.canCreateWorkspacesMetadata = canCreateWorkspacesMetadata;
    return this;
  }

   /**
   * Get canCreateWorkspacesMetadata
   * @return canCreateWorkspacesMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getCanCreateWorkspacesMetadata() {
    return canCreateWorkspacesMetadata;
  }

  public void setCanCreateWorkspacesMetadata(SettingsMetadata canCreateWorkspacesMetadata) {
    this.canCreateWorkspacesMetadata = canCreateWorkspacesMetadata;
  }

  public AccountRoleSettings disableDocumentUpload(String disableDocumentUpload) {
    this.disableDocumentUpload = disableDocumentUpload;
    return this;
  }

   /**
   * 
   * @return disableDocumentUpload
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisableDocumentUpload() {
    return disableDocumentUpload;
  }

  public void setDisableDocumentUpload(String disableDocumentUpload) {
    this.disableDocumentUpload = disableDocumentUpload;
  }

  public AccountRoleSettings disableDocumentUploadMetadata(SettingsMetadata disableDocumentUploadMetadata) {
    this.disableDocumentUploadMetadata = disableDocumentUploadMetadata;
    return this;
  }

   /**
   * Get disableDocumentUploadMetadata
   * @return disableDocumentUploadMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getDisableDocumentUploadMetadata() {
    return disableDocumentUploadMetadata;
  }

  public void setDisableDocumentUploadMetadata(SettingsMetadata disableDocumentUploadMetadata) {
    this.disableDocumentUploadMetadata = disableDocumentUploadMetadata;
  }

  public AccountRoleSettings disableOtherActions(String disableOtherActions) {
    this.disableOtherActions = disableOtherActions;
    return this;
  }

   /**
   * 
   * @return disableOtherActions
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisableOtherActions() {
    return disableOtherActions;
  }

  public void setDisableOtherActions(String disableOtherActions) {
    this.disableOtherActions = disableOtherActions;
  }

  public AccountRoleSettings disableOtherActionsMetadata(SettingsMetadata disableOtherActionsMetadata) {
    this.disableOtherActionsMetadata = disableOtherActionsMetadata;
    return this;
  }

   /**
   * Get disableOtherActionsMetadata
   * @return disableOtherActionsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getDisableOtherActionsMetadata() {
    return disableOtherActionsMetadata;
  }

  public void setDisableOtherActionsMetadata(SettingsMetadata disableOtherActionsMetadata) {
    this.disableOtherActionsMetadata = disableOtherActionsMetadata;
  }

  public AccountRoleSettings enableApiRequestLogging(String enableApiRequestLogging) {
    this.enableApiRequestLogging = enableApiRequestLogging;
    return this;
  }

   /**
   * 
   * @return enableApiRequestLogging
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnableApiRequestLogging() {
    return enableApiRequestLogging;
  }

  public void setEnableApiRequestLogging(String enableApiRequestLogging) {
    this.enableApiRequestLogging = enableApiRequestLogging;
  }

  public AccountRoleSettings enableApiRequestLoggingMetadata(SettingsMetadata enableApiRequestLoggingMetadata) {
    this.enableApiRequestLoggingMetadata = enableApiRequestLoggingMetadata;
    return this;
  }

   /**
   * Get enableApiRequestLoggingMetadata
   * @return enableApiRequestLoggingMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getEnableApiRequestLoggingMetadata() {
    return enableApiRequestLoggingMetadata;
  }

  public void setEnableApiRequestLoggingMetadata(SettingsMetadata enableApiRequestLoggingMetadata) {
    this.enableApiRequestLoggingMetadata = enableApiRequestLoggingMetadata;
  }

  public AccountRoleSettings enableRecipientViewingNotifications(String enableRecipientViewingNotifications) {
    this.enableRecipientViewingNotifications = enableRecipientViewingNotifications;
    return this;
  }

   /**
   * 
   * @return enableRecipientViewingNotifications
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnableRecipientViewingNotifications() {
    return enableRecipientViewingNotifications;
  }

  public void setEnableRecipientViewingNotifications(String enableRecipientViewingNotifications) {
    this.enableRecipientViewingNotifications = enableRecipientViewingNotifications;
  }

  public AccountRoleSettings enableRecipientViewingNotificationsMetadata(SettingsMetadata enableRecipientViewingNotificationsMetadata) {
    this.enableRecipientViewingNotificationsMetadata = enableRecipientViewingNotificationsMetadata;
    return this;
  }

   /**
   * Get enableRecipientViewingNotificationsMetadata
   * @return enableRecipientViewingNotificationsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getEnableRecipientViewingNotificationsMetadata() {
    return enableRecipientViewingNotificationsMetadata;
  }

  public void setEnableRecipientViewingNotificationsMetadata(SettingsMetadata enableRecipientViewingNotificationsMetadata) {
    this.enableRecipientViewingNotificationsMetadata = enableRecipientViewingNotificationsMetadata;
  }

  public AccountRoleSettings enableSequentialSigningInterface(String enableSequentialSigningInterface) {
    this.enableSequentialSigningInterface = enableSequentialSigningInterface;
    return this;
  }

   /**
   * 
   * @return enableSequentialSigningInterface
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnableSequentialSigningInterface() {
    return enableSequentialSigningInterface;
  }

  public void setEnableSequentialSigningInterface(String enableSequentialSigningInterface) {
    this.enableSequentialSigningInterface = enableSequentialSigningInterface;
  }

  public AccountRoleSettings enableSequentialSigningInterfaceMetadata(SettingsMetadata enableSequentialSigningInterfaceMetadata) {
    this.enableSequentialSigningInterfaceMetadata = enableSequentialSigningInterfaceMetadata;
    return this;
  }

   /**
   * Get enableSequentialSigningInterfaceMetadata
   * @return enableSequentialSigningInterfaceMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getEnableSequentialSigningInterfaceMetadata() {
    return enableSequentialSigningInterfaceMetadata;
  }

  public void setEnableSequentialSigningInterfaceMetadata(SettingsMetadata enableSequentialSigningInterfaceMetadata) {
    this.enableSequentialSigningInterfaceMetadata = enableSequentialSigningInterfaceMetadata;
  }

  public AccountRoleSettings enableTransactionPointIntegration(String enableTransactionPointIntegration) {
    this.enableTransactionPointIntegration = enableTransactionPointIntegration;
    return this;
  }

   /**
   * 
   * @return enableTransactionPointIntegration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnableTransactionPointIntegration() {
    return enableTransactionPointIntegration;
  }

  public void setEnableTransactionPointIntegration(String enableTransactionPointIntegration) {
    this.enableTransactionPointIntegration = enableTransactionPointIntegration;
  }

  public AccountRoleSettings enableTransactionPointIntegrationMetadata(SettingsMetadata enableTransactionPointIntegrationMetadata) {
    this.enableTransactionPointIntegrationMetadata = enableTransactionPointIntegrationMetadata;
    return this;
  }

   /**
   * Get enableTransactionPointIntegrationMetadata
   * @return enableTransactionPointIntegrationMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getEnableTransactionPointIntegrationMetadata() {
    return enableTransactionPointIntegrationMetadata;
  }

  public void setEnableTransactionPointIntegrationMetadata(SettingsMetadata enableTransactionPointIntegrationMetadata) {
    this.enableTransactionPointIntegrationMetadata = enableTransactionPointIntegrationMetadata;
  }

  public AccountRoleSettings powerFormRole(String powerFormRole) {
    this.powerFormRole = powerFormRole;
    return this;
  }

   /**
   * 
   * @return powerFormRole
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPowerFormRole() {
    return powerFormRole;
  }

  public void setPowerFormRole(String powerFormRole) {
    this.powerFormRole = powerFormRole;
  }

  public AccountRoleSettings powerFormRoleMetadata(SettingsMetadata powerFormRoleMetadata) {
    this.powerFormRoleMetadata = powerFormRoleMetadata;
    return this;
  }

   /**
   * Get powerFormRoleMetadata
   * @return powerFormRoleMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getPowerFormRoleMetadata() {
    return powerFormRoleMetadata;
  }

  public void setPowerFormRoleMetadata(SettingsMetadata powerFormRoleMetadata) {
    this.powerFormRoleMetadata = powerFormRoleMetadata;
  }

  public AccountRoleSettings receiveCompletedSelfSignedDocumentsAsEmailLinks(String receiveCompletedSelfSignedDocumentsAsEmailLinks) {
    this.receiveCompletedSelfSignedDocumentsAsEmailLinks = receiveCompletedSelfSignedDocumentsAsEmailLinks;
    return this;
  }

   /**
   * 
   * @return receiveCompletedSelfSignedDocumentsAsEmailLinks
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReceiveCompletedSelfSignedDocumentsAsEmailLinks() {
    return receiveCompletedSelfSignedDocumentsAsEmailLinks;
  }

  public void setReceiveCompletedSelfSignedDocumentsAsEmailLinks(String receiveCompletedSelfSignedDocumentsAsEmailLinks) {
    this.receiveCompletedSelfSignedDocumentsAsEmailLinks = receiveCompletedSelfSignedDocumentsAsEmailLinks;
  }

  public AccountRoleSettings receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata(SettingsMetadata receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata) {
    this.receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata = receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata;
    return this;
  }

   /**
   * Get receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata
   * @return receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata() {
    return receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata;
  }

  public void setReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata(SettingsMetadata receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata) {
    this.receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata = receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata;
  }

  public AccountRoleSettings signingUiVersionMetadata(SettingsMetadata signingUiVersionMetadata) {
    this.signingUiVersionMetadata = signingUiVersionMetadata;
    return this;
  }

   /**
   * Get signingUiVersionMetadata
   * @return signingUiVersionMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getSigningUiVersionMetadata() {
    return signingUiVersionMetadata;
  }

  public void setSigningUiVersionMetadata(SettingsMetadata signingUiVersionMetadata) {
    this.signingUiVersionMetadata = signingUiVersionMetadata;
  }

  public AccountRoleSettings supplementalDocumentsMustAccept(String supplementalDocumentsMustAccept) {
    this.supplementalDocumentsMustAccept = supplementalDocumentsMustAccept;
    return this;
  }

   /**
   * 
   * @return supplementalDocumentsMustAccept
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSupplementalDocumentsMustAccept() {
    return supplementalDocumentsMustAccept;
  }

  public void setSupplementalDocumentsMustAccept(String supplementalDocumentsMustAccept) {
    this.supplementalDocumentsMustAccept = supplementalDocumentsMustAccept;
  }

  public AccountRoleSettings supplementalDocumentsMustAcceptMetadata(SettingsMetadata supplementalDocumentsMustAcceptMetadata) {
    this.supplementalDocumentsMustAcceptMetadata = supplementalDocumentsMustAcceptMetadata;
    return this;
  }

   /**
   * Get supplementalDocumentsMustAcceptMetadata
   * @return supplementalDocumentsMustAcceptMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getSupplementalDocumentsMustAcceptMetadata() {
    return supplementalDocumentsMustAcceptMetadata;
  }

  public void setSupplementalDocumentsMustAcceptMetadata(SettingsMetadata supplementalDocumentsMustAcceptMetadata) {
    this.supplementalDocumentsMustAcceptMetadata = supplementalDocumentsMustAcceptMetadata;
  }

  public AccountRoleSettings supplementalDocumentsMustRead(String supplementalDocumentsMustRead) {
    this.supplementalDocumentsMustRead = supplementalDocumentsMustRead;
    return this;
  }

   /**
   * 
   * @return supplementalDocumentsMustRead
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSupplementalDocumentsMustRead() {
    return supplementalDocumentsMustRead;
  }

  public void setSupplementalDocumentsMustRead(String supplementalDocumentsMustRead) {
    this.supplementalDocumentsMustRead = supplementalDocumentsMustRead;
  }

  public AccountRoleSettings supplementalDocumentsMustReadMetadata(SettingsMetadata supplementalDocumentsMustReadMetadata) {
    this.supplementalDocumentsMustReadMetadata = supplementalDocumentsMustReadMetadata;
    return this;
  }

   /**
   * Get supplementalDocumentsMustReadMetadata
   * @return supplementalDocumentsMustReadMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getSupplementalDocumentsMustReadMetadata() {
    return supplementalDocumentsMustReadMetadata;
  }

  public void setSupplementalDocumentsMustReadMetadata(SettingsMetadata supplementalDocumentsMustReadMetadata) {
    this.supplementalDocumentsMustReadMetadata = supplementalDocumentsMustReadMetadata;
  }

  public AccountRoleSettings supplementalDocumentsMustView(String supplementalDocumentsMustView) {
    this.supplementalDocumentsMustView = supplementalDocumentsMustView;
    return this;
  }

   /**
   * 
   * @return supplementalDocumentsMustView
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSupplementalDocumentsMustView() {
    return supplementalDocumentsMustView;
  }

  public void setSupplementalDocumentsMustView(String supplementalDocumentsMustView) {
    this.supplementalDocumentsMustView = supplementalDocumentsMustView;
  }

  public AccountRoleSettings supplementalDocumentsMustViewMetadata(SettingsMetadata supplementalDocumentsMustViewMetadata) {
    this.supplementalDocumentsMustViewMetadata = supplementalDocumentsMustViewMetadata;
    return this;
  }

   /**
   * Get supplementalDocumentsMustViewMetadata
   * @return supplementalDocumentsMustViewMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getSupplementalDocumentsMustViewMetadata() {
    return supplementalDocumentsMustViewMetadata;
  }

  public void setSupplementalDocumentsMustViewMetadata(SettingsMetadata supplementalDocumentsMustViewMetadata) {
    this.supplementalDocumentsMustViewMetadata = supplementalDocumentsMustViewMetadata;
  }

  public AccountRoleSettings useNewDocuSignExperienceInterface(String useNewDocuSignExperienceInterface) {
    this.useNewDocuSignExperienceInterface = useNewDocuSignExperienceInterface;
    return this;
  }

   /**
   * 
   * @return useNewDocuSignExperienceInterface
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUseNewDocuSignExperienceInterface() {
    return useNewDocuSignExperienceInterface;
  }

  public void setUseNewDocuSignExperienceInterface(String useNewDocuSignExperienceInterface) {
    this.useNewDocuSignExperienceInterface = useNewDocuSignExperienceInterface;
  }

  public AccountRoleSettings useNewDocuSignExperienceInterfaceMetadata(SettingsMetadata useNewDocuSignExperienceInterfaceMetadata) {
    this.useNewDocuSignExperienceInterfaceMetadata = useNewDocuSignExperienceInterfaceMetadata;
    return this;
  }

   /**
   * Get useNewDocuSignExperienceInterfaceMetadata
   * @return useNewDocuSignExperienceInterfaceMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getUseNewDocuSignExperienceInterfaceMetadata() {
    return useNewDocuSignExperienceInterfaceMetadata;
  }

  public void setUseNewDocuSignExperienceInterfaceMetadata(SettingsMetadata useNewDocuSignExperienceInterfaceMetadata) {
    this.useNewDocuSignExperienceInterfaceMetadata = useNewDocuSignExperienceInterfaceMetadata;
  }

  public AccountRoleSettings useNewSendingInterface(String useNewSendingInterface) {
    this.useNewSendingInterface = useNewSendingInterface;
    return this;
  }

   /**
   * 
   * @return useNewSendingInterface
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUseNewSendingInterface() {
    return useNewSendingInterface;
  }

  public void setUseNewSendingInterface(String useNewSendingInterface) {
    this.useNewSendingInterface = useNewSendingInterface;
  }

  public AccountRoleSettings useNewSendingInterfaceMetadata(SettingsMetadata useNewSendingInterfaceMetadata) {
    this.useNewSendingInterfaceMetadata = useNewSendingInterfaceMetadata;
    return this;
  }

   /**
   * Get useNewSendingInterfaceMetadata
   * @return useNewSendingInterfaceMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getUseNewSendingInterfaceMetadata() {
    return useNewSendingInterfaceMetadata;
  }

  public void setUseNewSendingInterfaceMetadata(SettingsMetadata useNewSendingInterfaceMetadata) {
    this.useNewSendingInterfaceMetadata = useNewSendingInterfaceMetadata;
  }

  public AccountRoleSettings vaultingMode(String vaultingMode) {
    this.vaultingMode = vaultingMode;
    return this;
  }

   /**
   * 
   * @return vaultingMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVaultingMode() {
    return vaultingMode;
  }

  public void setVaultingMode(String vaultingMode) {
    this.vaultingMode = vaultingMode;
  }

  public AccountRoleSettings vaultingModeMetadata(SettingsMetadata vaultingModeMetadata) {
    this.vaultingModeMetadata = vaultingModeMetadata;
    return this;
  }

   /**
   * Get vaultingModeMetadata
   * @return vaultingModeMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getVaultingModeMetadata() {
    return vaultingModeMetadata;
  }

  public void setVaultingModeMetadata(SettingsMetadata vaultingModeMetadata) {
    this.vaultingModeMetadata = vaultingModeMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRoleSettings accountRoleSettings = (AccountRoleSettings) o;
    return Objects.equals(this.allowAccountManagement, accountRoleSettings.allowAccountManagement) &&
        Objects.equals(this.allowAccountManagementMetadata, accountRoleSettings.allowAccountManagementMetadata) &&
        Objects.equals(this.allowApiAccess, accountRoleSettings.allowApiAccess) &&
        Objects.equals(this.allowApiAccessMetadata, accountRoleSettings.allowApiAccessMetadata) &&
        Objects.equals(this.allowApiAccessToAccount, accountRoleSettings.allowApiAccessToAccount) &&
        Objects.equals(this.allowApiAccessToAccountMetadata, accountRoleSettings.allowApiAccessToAccountMetadata) &&
        Objects.equals(this.allowApiSendingOnBehalfOfOthers, accountRoleSettings.allowApiSendingOnBehalfOfOthers) &&
        Objects.equals(this.allowApiSendingOnBehalfOfOthersMetadata, accountRoleSettings.allowApiSendingOnBehalfOfOthersMetadata) &&
        Objects.equals(this.allowApiSequentialSigning, accountRoleSettings.allowApiSequentialSigning) &&
        Objects.equals(this.allowApiSequentialSigningMetadata, accountRoleSettings.allowApiSequentialSigningMetadata) &&
        Objects.equals(this.allowBulkSending, accountRoleSettings.allowBulkSending) &&
        Objects.equals(this.allowBulkSendingMetadata, accountRoleSettings.allowBulkSendingMetadata) &&
        Objects.equals(this.allowDocuSignDesktopClient, accountRoleSettings.allowDocuSignDesktopClient) &&
        Objects.equals(this.allowDocuSignDesktopClientMetadata, accountRoleSettings.allowDocuSignDesktopClientMetadata) &&
        Objects.equals(this.allowedAddressBookAccess, accountRoleSettings.allowedAddressBookAccess) &&
        Objects.equals(this.allowedAddressBookAccessMetadata, accountRoleSettings.allowedAddressBookAccessMetadata) &&
        Objects.equals(this.allowedTemplateAccess, accountRoleSettings.allowedTemplateAccess) &&
        Objects.equals(this.allowedTemplateAccessMetadata, accountRoleSettings.allowedTemplateAccessMetadata) &&
        Objects.equals(this.allowedToBeEnvelopeTransferRecipient, accountRoleSettings.allowedToBeEnvelopeTransferRecipient) &&
        Objects.equals(this.allowedToBeEnvelopeTransferRecipientMetadata, accountRoleSettings.allowedToBeEnvelopeTransferRecipientMetadata) &&
        Objects.equals(this.allowEnvelopeSending, accountRoleSettings.allowEnvelopeSending) &&
        Objects.equals(this.allowEnvelopeSendingMetadata, accountRoleSettings.allowEnvelopeSendingMetadata) &&
        Objects.equals(this.allowESealRecipients, accountRoleSettings.allowESealRecipients) &&
        Objects.equals(this.allowESealRecipientsMetadata, accountRoleSettings.allowESealRecipientsMetadata) &&
        Objects.equals(this.allowPowerFormsAdminToAccessAllPowerFormEnvelopes, accountRoleSettings.allowPowerFormsAdminToAccessAllPowerFormEnvelopes) &&
        Objects.equals(this.allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata, accountRoleSettings.allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata) &&
        Objects.equals(this.allowSendersToSetRecipientEmailLanguage, accountRoleSettings.allowSendersToSetRecipientEmailLanguage) &&
        Objects.equals(this.allowSendersToSetRecipientEmailLanguageMetadata, accountRoleSettings.allowSendersToSetRecipientEmailLanguageMetadata) &&
        Objects.equals(this.allowSignerAttachments, accountRoleSettings.allowSignerAttachments) &&
        Objects.equals(this.allowSignerAttachmentsMetadata, accountRoleSettings.allowSignerAttachmentsMetadata) &&
        Objects.equals(this.allowSupplementalDocuments, accountRoleSettings.allowSupplementalDocuments) &&
        Objects.equals(this.allowSupplementalDocumentsMetadata, accountRoleSettings.allowSupplementalDocumentsMetadata) &&
        Objects.equals(this.allowTaggingInSendAndCorrect, accountRoleSettings.allowTaggingInSendAndCorrect) &&
        Objects.equals(this.allowTaggingInSendAndCorrectMetadata, accountRoleSettings.allowTaggingInSendAndCorrectMetadata) &&
        Objects.equals(this.allowVaulting, accountRoleSettings.allowVaulting) &&
        Objects.equals(this.allowVaultingMetadata, accountRoleSettings.allowVaultingMetadata) &&
        Objects.equals(this.allowWetSigningOverride, accountRoleSettings.allowWetSigningOverride) &&
        Objects.equals(this.allowWetSigningOverrideMetadata, accountRoleSettings.allowWetSigningOverrideMetadata) &&
        Objects.equals(this.canCreateWorkspaces, accountRoleSettings.canCreateWorkspaces) &&
        Objects.equals(this.canCreateWorkspacesMetadata, accountRoleSettings.canCreateWorkspacesMetadata) &&
        Objects.equals(this.disableDocumentUpload, accountRoleSettings.disableDocumentUpload) &&
        Objects.equals(this.disableDocumentUploadMetadata, accountRoleSettings.disableDocumentUploadMetadata) &&
        Objects.equals(this.disableOtherActions, accountRoleSettings.disableOtherActions) &&
        Objects.equals(this.disableOtherActionsMetadata, accountRoleSettings.disableOtherActionsMetadata) &&
        Objects.equals(this.enableApiRequestLogging, accountRoleSettings.enableApiRequestLogging) &&
        Objects.equals(this.enableApiRequestLoggingMetadata, accountRoleSettings.enableApiRequestLoggingMetadata) &&
        Objects.equals(this.enableRecipientViewingNotifications, accountRoleSettings.enableRecipientViewingNotifications) &&
        Objects.equals(this.enableRecipientViewingNotificationsMetadata, accountRoleSettings.enableRecipientViewingNotificationsMetadata) &&
        Objects.equals(this.enableSequentialSigningInterface, accountRoleSettings.enableSequentialSigningInterface) &&
        Objects.equals(this.enableSequentialSigningInterfaceMetadata, accountRoleSettings.enableSequentialSigningInterfaceMetadata) &&
        Objects.equals(this.enableTransactionPointIntegration, accountRoleSettings.enableTransactionPointIntegration) &&
        Objects.equals(this.enableTransactionPointIntegrationMetadata, accountRoleSettings.enableTransactionPointIntegrationMetadata) &&
        Objects.equals(this.powerFormRole, accountRoleSettings.powerFormRole) &&
        Objects.equals(this.powerFormRoleMetadata, accountRoleSettings.powerFormRoleMetadata) &&
        Objects.equals(this.receiveCompletedSelfSignedDocumentsAsEmailLinks, accountRoleSettings.receiveCompletedSelfSignedDocumentsAsEmailLinks) &&
        Objects.equals(this.receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata, accountRoleSettings.receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata) &&
        Objects.equals(this.signingUiVersionMetadata, accountRoleSettings.signingUiVersionMetadata) &&
        Objects.equals(this.supplementalDocumentsMustAccept, accountRoleSettings.supplementalDocumentsMustAccept) &&
        Objects.equals(this.supplementalDocumentsMustAcceptMetadata, accountRoleSettings.supplementalDocumentsMustAcceptMetadata) &&
        Objects.equals(this.supplementalDocumentsMustRead, accountRoleSettings.supplementalDocumentsMustRead) &&
        Objects.equals(this.supplementalDocumentsMustReadMetadata, accountRoleSettings.supplementalDocumentsMustReadMetadata) &&
        Objects.equals(this.supplementalDocumentsMustView, accountRoleSettings.supplementalDocumentsMustView) &&
        Objects.equals(this.supplementalDocumentsMustViewMetadata, accountRoleSettings.supplementalDocumentsMustViewMetadata) &&
        Objects.equals(this.useNewDocuSignExperienceInterface, accountRoleSettings.useNewDocuSignExperienceInterface) &&
        Objects.equals(this.useNewDocuSignExperienceInterfaceMetadata, accountRoleSettings.useNewDocuSignExperienceInterfaceMetadata) &&
        Objects.equals(this.useNewSendingInterface, accountRoleSettings.useNewSendingInterface) &&
        Objects.equals(this.useNewSendingInterfaceMetadata, accountRoleSettings.useNewSendingInterfaceMetadata) &&
        Objects.equals(this.vaultingMode, accountRoleSettings.vaultingMode) &&
        Objects.equals(this.vaultingModeMetadata, accountRoleSettings.vaultingModeMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAccountManagement, allowAccountManagementMetadata, allowApiAccess, allowApiAccessMetadata, allowApiAccessToAccount, allowApiAccessToAccountMetadata, allowApiSendingOnBehalfOfOthers, allowApiSendingOnBehalfOfOthersMetadata, allowApiSequentialSigning, allowApiSequentialSigningMetadata, allowBulkSending, allowBulkSendingMetadata, allowDocuSignDesktopClient, allowDocuSignDesktopClientMetadata, allowedAddressBookAccess, allowedAddressBookAccessMetadata, allowedTemplateAccess, allowedTemplateAccessMetadata, allowedToBeEnvelopeTransferRecipient, allowedToBeEnvelopeTransferRecipientMetadata, allowEnvelopeSending, allowEnvelopeSendingMetadata, allowESealRecipients, allowESealRecipientsMetadata, allowPowerFormsAdminToAccessAllPowerFormEnvelopes, allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata, allowSendersToSetRecipientEmailLanguage, allowSendersToSetRecipientEmailLanguageMetadata, allowSignerAttachments, allowSignerAttachmentsMetadata, allowSupplementalDocuments, allowSupplementalDocumentsMetadata, allowTaggingInSendAndCorrect, allowTaggingInSendAndCorrectMetadata, allowVaulting, allowVaultingMetadata, allowWetSigningOverride, allowWetSigningOverrideMetadata, canCreateWorkspaces, canCreateWorkspacesMetadata, disableDocumentUpload, disableDocumentUploadMetadata, disableOtherActions, disableOtherActionsMetadata, enableApiRequestLogging, enableApiRequestLoggingMetadata, enableRecipientViewingNotifications, enableRecipientViewingNotificationsMetadata, enableSequentialSigningInterface, enableSequentialSigningInterfaceMetadata, enableTransactionPointIntegration, enableTransactionPointIntegrationMetadata, powerFormRole, powerFormRoleMetadata, receiveCompletedSelfSignedDocumentsAsEmailLinks, receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata, signingUiVersionMetadata, supplementalDocumentsMustAccept, supplementalDocumentsMustAcceptMetadata, supplementalDocumentsMustRead, supplementalDocumentsMustReadMetadata, supplementalDocumentsMustView, supplementalDocumentsMustViewMetadata, useNewDocuSignExperienceInterface, useNewDocuSignExperienceInterfaceMetadata, useNewSendingInterface, useNewSendingInterfaceMetadata, vaultingMode, vaultingModeMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRoleSettings {\n");
    
    sb.append("    allowAccountManagement: ").append(toIndentedString(allowAccountManagement)).append("\n");
    sb.append("    allowAccountManagementMetadata: ").append(toIndentedString(allowAccountManagementMetadata)).append("\n");
    sb.append("    allowApiAccess: ").append(toIndentedString(allowApiAccess)).append("\n");
    sb.append("    allowApiAccessMetadata: ").append(toIndentedString(allowApiAccessMetadata)).append("\n");
    sb.append("    allowApiAccessToAccount: ").append(toIndentedString(allowApiAccessToAccount)).append("\n");
    sb.append("    allowApiAccessToAccountMetadata: ").append(toIndentedString(allowApiAccessToAccountMetadata)).append("\n");
    sb.append("    allowApiSendingOnBehalfOfOthers: ").append(toIndentedString(allowApiSendingOnBehalfOfOthers)).append("\n");
    sb.append("    allowApiSendingOnBehalfOfOthersMetadata: ").append(toIndentedString(allowApiSendingOnBehalfOfOthersMetadata)).append("\n");
    sb.append("    allowApiSequentialSigning: ").append(toIndentedString(allowApiSequentialSigning)).append("\n");
    sb.append("    allowApiSequentialSigningMetadata: ").append(toIndentedString(allowApiSequentialSigningMetadata)).append("\n");
    sb.append("    allowBulkSending: ").append(toIndentedString(allowBulkSending)).append("\n");
    sb.append("    allowBulkSendingMetadata: ").append(toIndentedString(allowBulkSendingMetadata)).append("\n");
    sb.append("    allowDocuSignDesktopClient: ").append(toIndentedString(allowDocuSignDesktopClient)).append("\n");
    sb.append("    allowDocuSignDesktopClientMetadata: ").append(toIndentedString(allowDocuSignDesktopClientMetadata)).append("\n");
    sb.append("    allowedAddressBookAccess: ").append(toIndentedString(allowedAddressBookAccess)).append("\n");
    sb.append("    allowedAddressBookAccessMetadata: ").append(toIndentedString(allowedAddressBookAccessMetadata)).append("\n");
    sb.append("    allowedTemplateAccess: ").append(toIndentedString(allowedTemplateAccess)).append("\n");
    sb.append("    allowedTemplateAccessMetadata: ").append(toIndentedString(allowedTemplateAccessMetadata)).append("\n");
    sb.append("    allowedToBeEnvelopeTransferRecipient: ").append(toIndentedString(allowedToBeEnvelopeTransferRecipient)).append("\n");
    sb.append("    allowedToBeEnvelopeTransferRecipientMetadata: ").append(toIndentedString(allowedToBeEnvelopeTransferRecipientMetadata)).append("\n");
    sb.append("    allowEnvelopeSending: ").append(toIndentedString(allowEnvelopeSending)).append("\n");
    sb.append("    allowEnvelopeSendingMetadata: ").append(toIndentedString(allowEnvelopeSendingMetadata)).append("\n");
    sb.append("    allowESealRecipients: ").append(toIndentedString(allowESealRecipients)).append("\n");
    sb.append("    allowESealRecipientsMetadata: ").append(toIndentedString(allowESealRecipientsMetadata)).append("\n");
    sb.append("    allowPowerFormsAdminToAccessAllPowerFormEnvelopes: ").append(toIndentedString(allowPowerFormsAdminToAccessAllPowerFormEnvelopes)).append("\n");
    sb.append("    allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata: ").append(toIndentedString(allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata)).append("\n");
    sb.append("    allowSendersToSetRecipientEmailLanguage: ").append(toIndentedString(allowSendersToSetRecipientEmailLanguage)).append("\n");
    sb.append("    allowSendersToSetRecipientEmailLanguageMetadata: ").append(toIndentedString(allowSendersToSetRecipientEmailLanguageMetadata)).append("\n");
    sb.append("    allowSignerAttachments: ").append(toIndentedString(allowSignerAttachments)).append("\n");
    sb.append("    allowSignerAttachmentsMetadata: ").append(toIndentedString(allowSignerAttachmentsMetadata)).append("\n");
    sb.append("    allowSupplementalDocuments: ").append(toIndentedString(allowSupplementalDocuments)).append("\n");
    sb.append("    allowSupplementalDocumentsMetadata: ").append(toIndentedString(allowSupplementalDocumentsMetadata)).append("\n");
    sb.append("    allowTaggingInSendAndCorrect: ").append(toIndentedString(allowTaggingInSendAndCorrect)).append("\n");
    sb.append("    allowTaggingInSendAndCorrectMetadata: ").append(toIndentedString(allowTaggingInSendAndCorrectMetadata)).append("\n");
    sb.append("    allowVaulting: ").append(toIndentedString(allowVaulting)).append("\n");
    sb.append("    allowVaultingMetadata: ").append(toIndentedString(allowVaultingMetadata)).append("\n");
    sb.append("    allowWetSigningOverride: ").append(toIndentedString(allowWetSigningOverride)).append("\n");
    sb.append("    allowWetSigningOverrideMetadata: ").append(toIndentedString(allowWetSigningOverrideMetadata)).append("\n");
    sb.append("    canCreateWorkspaces: ").append(toIndentedString(canCreateWorkspaces)).append("\n");
    sb.append("    canCreateWorkspacesMetadata: ").append(toIndentedString(canCreateWorkspacesMetadata)).append("\n");
    sb.append("    disableDocumentUpload: ").append(toIndentedString(disableDocumentUpload)).append("\n");
    sb.append("    disableDocumentUploadMetadata: ").append(toIndentedString(disableDocumentUploadMetadata)).append("\n");
    sb.append("    disableOtherActions: ").append(toIndentedString(disableOtherActions)).append("\n");
    sb.append("    disableOtherActionsMetadata: ").append(toIndentedString(disableOtherActionsMetadata)).append("\n");
    sb.append("    enableApiRequestLogging: ").append(toIndentedString(enableApiRequestLogging)).append("\n");
    sb.append("    enableApiRequestLoggingMetadata: ").append(toIndentedString(enableApiRequestLoggingMetadata)).append("\n");
    sb.append("    enableRecipientViewingNotifications: ").append(toIndentedString(enableRecipientViewingNotifications)).append("\n");
    sb.append("    enableRecipientViewingNotificationsMetadata: ").append(toIndentedString(enableRecipientViewingNotificationsMetadata)).append("\n");
    sb.append("    enableSequentialSigningInterface: ").append(toIndentedString(enableSequentialSigningInterface)).append("\n");
    sb.append("    enableSequentialSigningInterfaceMetadata: ").append(toIndentedString(enableSequentialSigningInterfaceMetadata)).append("\n");
    sb.append("    enableTransactionPointIntegration: ").append(toIndentedString(enableTransactionPointIntegration)).append("\n");
    sb.append("    enableTransactionPointIntegrationMetadata: ").append(toIndentedString(enableTransactionPointIntegrationMetadata)).append("\n");
    sb.append("    powerFormRole: ").append(toIndentedString(powerFormRole)).append("\n");
    sb.append("    powerFormRoleMetadata: ").append(toIndentedString(powerFormRoleMetadata)).append("\n");
    sb.append("    receiveCompletedSelfSignedDocumentsAsEmailLinks: ").append(toIndentedString(receiveCompletedSelfSignedDocumentsAsEmailLinks)).append("\n");
    sb.append("    receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata: ").append(toIndentedString(receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata)).append("\n");
    sb.append("    signingUiVersionMetadata: ").append(toIndentedString(signingUiVersionMetadata)).append("\n");
    sb.append("    supplementalDocumentsMustAccept: ").append(toIndentedString(supplementalDocumentsMustAccept)).append("\n");
    sb.append("    supplementalDocumentsMustAcceptMetadata: ").append(toIndentedString(supplementalDocumentsMustAcceptMetadata)).append("\n");
    sb.append("    supplementalDocumentsMustRead: ").append(toIndentedString(supplementalDocumentsMustRead)).append("\n");
    sb.append("    supplementalDocumentsMustReadMetadata: ").append(toIndentedString(supplementalDocumentsMustReadMetadata)).append("\n");
    sb.append("    supplementalDocumentsMustView: ").append(toIndentedString(supplementalDocumentsMustView)).append("\n");
    sb.append("    supplementalDocumentsMustViewMetadata: ").append(toIndentedString(supplementalDocumentsMustViewMetadata)).append("\n");
    sb.append("    useNewDocuSignExperienceInterface: ").append(toIndentedString(useNewDocuSignExperienceInterface)).append("\n");
    sb.append("    useNewDocuSignExperienceInterfaceMetadata: ").append(toIndentedString(useNewDocuSignExperienceInterfaceMetadata)).append("\n");
    sb.append("    useNewSendingInterface: ").append(toIndentedString(useNewSendingInterface)).append("\n");
    sb.append("    useNewSendingInterfaceMetadata: ").append(toIndentedString(useNewSendingInterfaceMetadata)).append("\n");
    sb.append("    vaultingMode: ").append(toIndentedString(vaultingMode)).append("\n");
    sb.append("    vaultingModeMetadata: ").append(toIndentedString(vaultingModeMetadata)).append("\n");
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

