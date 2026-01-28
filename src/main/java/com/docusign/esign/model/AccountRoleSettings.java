package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountManagementGranular;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * This object defines account permissions for users who are associated with the account permission profile. .
 *
 */
@Schema(description = "This object defines account permissions for users who are associated with the account permission profile. ")

public class AccountRoleSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accountAgreementsAccessType")
  private String accountAgreementsAccessType = null;

  @JsonProperty("accountAgreementsAccessTypeMetadata")
  private SettingsMetadata accountAgreementsAccessTypeMetadata = null;

  @JsonProperty("accountManagementGranular")
  private AccountManagementGranular accountManagementGranular = null;

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

  @JsonProperty("allowAutoTagging")
  private String allowAutoTagging = null;

  @JsonProperty("allowAutoTaggingMetadata")
  private SettingsMetadata allowAutoTaggingMetadata = null;

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

  @JsonProperty("allowedClickwrapsAccess")
  private String allowedClickwrapsAccess = null;

  @JsonProperty("allowedClickwrapsAccessMetadata")
  private SettingsMetadata allowedClickwrapsAccessMetadata = null;

  @JsonProperty("allowedDocumentTemplateLibraryAccess")
  private String allowedDocumentTemplateLibraryAccess = null;

  @JsonProperty("allowedDocumentTemplateLibraryAccessMetadata")
  private SettingsMetadata allowedDocumentTemplateLibraryAccessMetadata = null;

  @JsonProperty("allowedOrchestrationAccess")
  private String allowedOrchestrationAccess = null;

  @JsonProperty("allowedOrchestrationAccessMetadata")
  private SettingsMetadata allowedOrchestrationAccessMetadata = null;

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

  @JsonProperty("allowTransactions")
  private String allowTransactions = null;

  @JsonProperty("allowTransactionsMetadata")
  private SettingsMetadata allowTransactionsMetadata = null;

  @JsonProperty("allowVaulting")
  private String allowVaulting = null;

  @JsonProperty("allowVaultingMetadata")
  private SettingsMetadata allowVaultingMetadata = null;

  @JsonProperty("allowWetSigningOverride")
  private String allowWetSigningOverride = null;

  @JsonProperty("allowWetSigningOverrideMetadata")
  private SettingsMetadata allowWetSigningOverrideMetadata = null;

  @JsonProperty("canBulkUploadAgreements")
  private String canBulkUploadAgreements = null;

  @JsonProperty("canBulkUploadAgreementsMetadata")
  private SettingsMetadata canBulkUploadAgreementsMetadata = null;

  @JsonProperty("canCreateTransaction")
  private String canCreateTransaction = null;

  @JsonProperty("canCreateTransactionMetadata")
  private SettingsMetadata canCreateTransactionMetadata = null;

  @JsonProperty("canCreateWorkspaces")
  private String canCreateWorkspaces = null;

  @JsonProperty("canCreateWorkspacesMetadata")
  private SettingsMetadata canCreateWorkspacesMetadata = null;

  @JsonProperty("canDeleteDocumentsInTransaction")
  private String canDeleteDocumentsInTransaction = null;

  @JsonProperty("canDeleteDocumentsInTransactionMetadata")
  private SettingsMetadata canDeleteDocumentsInTransactionMetadata = null;

  @JsonProperty("canDeleteTransaction")
  private String canDeleteTransaction = null;

  @JsonProperty("canDeleteTransactionMetadata")
  private SettingsMetadata canDeleteTransactionMetadata = null;

  @JsonProperty("canManageAgreementDeskRequest")
  private String canManageAgreementDeskRequest = null;

  @JsonProperty("canManageAgreementDeskRequestMetadata")
  private SettingsMetadata canManageAgreementDeskRequestMetadata = null;

  @JsonProperty("canManageAgreementDeskRequestSetting")
  private String canManageAgreementDeskRequestSetting = null;

  @JsonProperty("canManageAgreementDeskRequestSettingMetadata")
  private SettingsMetadata canManageAgreementDeskRequestSettingMetadata = null;

  @JsonProperty("canSendEnvelopesViaSMS")
  private String canSendEnvelopesViaSMS = null;

  @JsonProperty("canSendEnvelopesViaSMSMetadata")
  private SettingsMetadata canSendEnvelopesViaSMSMetadata = null;

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

  @JsonProperty("enableKeyTermsSuggestionsByDocumentType")
  private String enableKeyTermsSuggestionsByDocumentType = null;

  @JsonProperty("enableKeyTermsSuggestionsByDocumentTypeMetadata")
  private SettingsMetadata enableKeyTermsSuggestionsByDocumentTypeMetadata = null;

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

  @JsonProperty("playbookAccess")
  private String playbookAccess = null;

  @JsonProperty("playbookAccessMetadata")
  private SettingsMetadata playbookAccessMetadata = null;

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

  @JsonProperty("webForms")
  private String webForms = null;

  @JsonProperty("webFormsMetadata")
  private SettingsMetadata webFormsMetadata = null;


  /**
   * accountAgreementsAccessType.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings accountAgreementsAccessType(String accountAgreementsAccessType) {
    this.accountAgreementsAccessType = accountAgreementsAccessType;
    return this;
  }

  /**
   * .
   * @return accountAgreementsAccessType
   **/
  @Schema(description = "")
  public String getAccountAgreementsAccessType() {
    return accountAgreementsAccessType;
  }

  /**
   * setAccountAgreementsAccessType.
   **/
  public void setAccountAgreementsAccessType(String accountAgreementsAccessType) {
    this.accountAgreementsAccessType = accountAgreementsAccessType;
  }


  /**
   * accountAgreementsAccessTypeMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings accountAgreementsAccessTypeMetadata(SettingsMetadata accountAgreementsAccessTypeMetadata) {
    this.accountAgreementsAccessTypeMetadata = accountAgreementsAccessTypeMetadata;
    return this;
  }

  /**
   * .
   * @return accountAgreementsAccessTypeMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAccountAgreementsAccessTypeMetadata() {
    return accountAgreementsAccessTypeMetadata;
  }

  /**
   * setAccountAgreementsAccessTypeMetadata.
   **/
  public void setAccountAgreementsAccessTypeMetadata(SettingsMetadata accountAgreementsAccessTypeMetadata) {
    this.accountAgreementsAccessTypeMetadata = accountAgreementsAccessTypeMetadata;
  }


  /**
   * accountManagementGranular.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings accountManagementGranular(AccountManagementGranular accountManagementGranular) {
    this.accountManagementGranular = accountManagementGranular;
    return this;
  }

  /**
   * .
   * @return accountManagementGranular
   **/
  @Schema(description = "")
  public AccountManagementGranular getAccountManagementGranular() {
    return accountManagementGranular;
  }

  /**
   * setAccountManagementGranular.
   **/
  public void setAccountManagementGranular(AccountManagementGranular accountManagementGranular) {
    this.accountManagementGranular = accountManagementGranular;
  }


  /**
   * allowAccountManagement.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowAccountManagement(String allowAccountManagement) {
    this.allowAccountManagement = allowAccountManagement;
    return this;
  }

  /**
   * .
   * @return allowAccountManagement
   **/
  @Schema(description = "")
  public String getAllowAccountManagement() {
    return allowAccountManagement;
  }

  /**
   * setAllowAccountManagement.
   **/
  public void setAllowAccountManagement(String allowAccountManagement) {
    this.allowAccountManagement = allowAccountManagement;
  }


  /**
   * allowAccountManagementMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowAccountManagementMetadata(SettingsMetadata allowAccountManagementMetadata) {
    this.allowAccountManagementMetadata = allowAccountManagementMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowAccountManagement` property is editable. .
   * @return allowAccountManagementMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowAccountManagement` property is editable. ")
  public SettingsMetadata getAllowAccountManagementMetadata() {
    return allowAccountManagementMetadata;
  }

  /**
   * setAllowAccountManagementMetadata.
   **/
  public void setAllowAccountManagementMetadata(SettingsMetadata allowAccountManagementMetadata) {
    this.allowAccountManagementMetadata = allowAccountManagementMetadata;
  }


  /**
   * allowApiAccess.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowApiAccess(String allowApiAccess) {
    this.allowApiAccess = allowApiAccess;
    return this;
  }

  /**
   * .
   * @return allowApiAccess
   **/
  @Schema(description = "")
  public String getAllowApiAccess() {
    return allowApiAccess;
  }

  /**
   * setAllowApiAccess.
   **/
  public void setAllowApiAccess(String allowApiAccess) {
    this.allowApiAccess = allowApiAccess;
  }


  /**
   * allowApiAccessMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowApiAccessMetadata(SettingsMetadata allowApiAccessMetadata) {
    this.allowApiAccessMetadata = allowApiAccessMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowApiAccess` property is editable. .
   * @return allowApiAccessMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowApiAccess` property is editable. ")
  public SettingsMetadata getAllowApiAccessMetadata() {
    return allowApiAccessMetadata;
  }

  /**
   * setAllowApiAccessMetadata.
   **/
  public void setAllowApiAccessMetadata(SettingsMetadata allowApiAccessMetadata) {
    this.allowApiAccessMetadata = allowApiAccessMetadata;
  }


  /**
   * allowApiAccessToAccount.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowApiAccessToAccount(String allowApiAccessToAccount) {
    this.allowApiAccessToAccount = allowApiAccessToAccount;
    return this;
  }

  /**
   * .
   * @return allowApiAccessToAccount
   **/
  @Schema(description = "")
  public String getAllowApiAccessToAccount() {
    return allowApiAccessToAccount;
  }

  /**
   * setAllowApiAccessToAccount.
   **/
  public void setAllowApiAccessToAccount(String allowApiAccessToAccount) {
    this.allowApiAccessToAccount = allowApiAccessToAccount;
  }


  /**
   * allowApiAccessToAccountMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowApiAccessToAccountMetadata(SettingsMetadata allowApiAccessToAccountMetadata) {
    this.allowApiAccessToAccountMetadata = allowApiAccessToAccountMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowApiAccessToAccount` property is editable. .
   * @return allowApiAccessToAccountMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowApiAccessToAccount` property is editable. ")
  public SettingsMetadata getAllowApiAccessToAccountMetadata() {
    return allowApiAccessToAccountMetadata;
  }

  /**
   * setAllowApiAccessToAccountMetadata.
   **/
  public void setAllowApiAccessToAccountMetadata(SettingsMetadata allowApiAccessToAccountMetadata) {
    this.allowApiAccessToAccountMetadata = allowApiAccessToAccountMetadata;
  }


  /**
   * allowApiSendingOnBehalfOfOthers.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowApiSendingOnBehalfOfOthers(String allowApiSendingOnBehalfOfOthers) {
    this.allowApiSendingOnBehalfOfOthers = allowApiSendingOnBehalfOfOthers;
    return this;
  }

  /**
   * .
   * @return allowApiSendingOnBehalfOfOthers
   **/
  @Schema(description = "")
  public String getAllowApiSendingOnBehalfOfOthers() {
    return allowApiSendingOnBehalfOfOthers;
  }

  /**
   * setAllowApiSendingOnBehalfOfOthers.
   **/
  public void setAllowApiSendingOnBehalfOfOthers(String allowApiSendingOnBehalfOfOthers) {
    this.allowApiSendingOnBehalfOfOthers = allowApiSendingOnBehalfOfOthers;
  }


  /**
   * allowApiSendingOnBehalfOfOthersMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowApiSendingOnBehalfOfOthersMetadata(SettingsMetadata allowApiSendingOnBehalfOfOthersMetadata) {
    this.allowApiSendingOnBehalfOfOthersMetadata = allowApiSendingOnBehalfOfOthersMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowApiSendingOnBehalfOfOthers` property is editable. .
   * @return allowApiSendingOnBehalfOfOthersMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowApiSendingOnBehalfOfOthers` property is editable. ")
  public SettingsMetadata getAllowApiSendingOnBehalfOfOthersMetadata() {
    return allowApiSendingOnBehalfOfOthersMetadata;
  }

  /**
   * setAllowApiSendingOnBehalfOfOthersMetadata.
   **/
  public void setAllowApiSendingOnBehalfOfOthersMetadata(SettingsMetadata allowApiSendingOnBehalfOfOthersMetadata) {
    this.allowApiSendingOnBehalfOfOthersMetadata = allowApiSendingOnBehalfOfOthersMetadata;
  }


  /**
   * allowApiSequentialSigning.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowApiSequentialSigning(String allowApiSequentialSigning) {
    this.allowApiSequentialSigning = allowApiSequentialSigning;
    return this;
  }

  /**
   * .
   * @return allowApiSequentialSigning
   **/
  @Schema(description = "")
  public String getAllowApiSequentialSigning() {
    return allowApiSequentialSigning;
  }

  /**
   * setAllowApiSequentialSigning.
   **/
  public void setAllowApiSequentialSigning(String allowApiSequentialSigning) {
    this.allowApiSequentialSigning = allowApiSequentialSigning;
  }


  /**
   * allowApiSequentialSigningMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowApiSequentialSigningMetadata(SettingsMetadata allowApiSequentialSigningMetadata) {
    this.allowApiSequentialSigningMetadata = allowApiSequentialSigningMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowApiSequentialSigning` property is editable. .
   * @return allowApiSequentialSigningMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowApiSequentialSigning` property is editable. ")
  public SettingsMetadata getAllowApiSequentialSigningMetadata() {
    return allowApiSequentialSigningMetadata;
  }

  /**
   * setAllowApiSequentialSigningMetadata.
   **/
  public void setAllowApiSequentialSigningMetadata(SettingsMetadata allowApiSequentialSigningMetadata) {
    this.allowApiSequentialSigningMetadata = allowApiSequentialSigningMetadata;
  }


  /**
   * allowAutoTagging.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowAutoTagging(String allowAutoTagging) {
    this.allowAutoTagging = allowAutoTagging;
    return this;
  }

  /**
   * .
   * @return allowAutoTagging
   **/
  @Schema(description = "")
  public String getAllowAutoTagging() {
    return allowAutoTagging;
  }

  /**
   * setAllowAutoTagging.
   **/
  public void setAllowAutoTagging(String allowAutoTagging) {
    this.allowAutoTagging = allowAutoTagging;
  }


  /**
   * allowAutoTaggingMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowAutoTaggingMetadata(SettingsMetadata allowAutoTaggingMetadata) {
    this.allowAutoTaggingMetadata = allowAutoTaggingMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowAutoTagging` property is editable..
   * @return allowAutoTaggingMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowAutoTagging` property is editable.")
  public SettingsMetadata getAllowAutoTaggingMetadata() {
    return allowAutoTaggingMetadata;
  }

  /**
   * setAllowAutoTaggingMetadata.
   **/
  public void setAllowAutoTaggingMetadata(SettingsMetadata allowAutoTaggingMetadata) {
    this.allowAutoTaggingMetadata = allowAutoTaggingMetadata;
  }


  /**
   * allowBulkSending.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowBulkSending(String allowBulkSending) {
    this.allowBulkSending = allowBulkSending;
    return this;
  }

  /**
   * .
   * @return allowBulkSending
   **/
  @Schema(description = "")
  public String getAllowBulkSending() {
    return allowBulkSending;
  }

  /**
   * setAllowBulkSending.
   **/
  public void setAllowBulkSending(String allowBulkSending) {
    this.allowBulkSending = allowBulkSending;
  }


  /**
   * allowBulkSendingMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowBulkSendingMetadata(SettingsMetadata allowBulkSendingMetadata) {
    this.allowBulkSendingMetadata = allowBulkSendingMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowBulkSending` property is editable. .
   * @return allowBulkSendingMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowBulkSending` property is editable. ")
  public SettingsMetadata getAllowBulkSendingMetadata() {
    return allowBulkSendingMetadata;
  }

  /**
   * setAllowBulkSendingMetadata.
   **/
  public void setAllowBulkSendingMetadata(SettingsMetadata allowBulkSendingMetadata) {
    this.allowBulkSendingMetadata = allowBulkSendingMetadata;
  }


  /**
   * allowDocuSignDesktopClient.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowDocuSignDesktopClient(String allowDocuSignDesktopClient) {
    this.allowDocuSignDesktopClient = allowDocuSignDesktopClient;
    return this;
  }

  /**
   * .
   * @return allowDocuSignDesktopClient
   **/
  @Schema(description = "")
  public String getAllowDocuSignDesktopClient() {
    return allowDocuSignDesktopClient;
  }

  /**
   * setAllowDocuSignDesktopClient.
   **/
  public void setAllowDocuSignDesktopClient(String allowDocuSignDesktopClient) {
    this.allowDocuSignDesktopClient = allowDocuSignDesktopClient;
  }


  /**
   * allowDocuSignDesktopClientMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowDocuSignDesktopClientMetadata(SettingsMetadata allowDocuSignDesktopClientMetadata) {
    this.allowDocuSignDesktopClientMetadata = allowDocuSignDesktopClientMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowDocuSignDesktopClient` property is editable. .
   * @return allowDocuSignDesktopClientMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowDocuSignDesktopClient` property is editable. ")
  public SettingsMetadata getAllowDocuSignDesktopClientMetadata() {
    return allowDocuSignDesktopClientMetadata;
  }

  /**
   * setAllowDocuSignDesktopClientMetadata.
   **/
  public void setAllowDocuSignDesktopClientMetadata(SettingsMetadata allowDocuSignDesktopClientMetadata) {
    this.allowDocuSignDesktopClientMetadata = allowDocuSignDesktopClientMetadata;
  }


  /**
   * allowedAddressBookAccess.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedAddressBookAccess(String allowedAddressBookAccess) {
    this.allowedAddressBookAccess = allowedAddressBookAccess;
    return this;
  }

  /**
   * .
   * @return allowedAddressBookAccess
   **/
  @Schema(description = "")
  public String getAllowedAddressBookAccess() {
    return allowedAddressBookAccess;
  }

  /**
   * setAllowedAddressBookAccess.
   **/
  public void setAllowedAddressBookAccess(String allowedAddressBookAccess) {
    this.allowedAddressBookAccess = allowedAddressBookAccess;
  }


  /**
   * allowedAddressBookAccessMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedAddressBookAccessMetadata(SettingsMetadata allowedAddressBookAccessMetadata) {
    this.allowedAddressBookAccessMetadata = allowedAddressBookAccessMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowedAddressBookAccess` property is editable. .
   * @return allowedAddressBookAccessMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowedAddressBookAccess` property is editable. ")
  public SettingsMetadata getAllowedAddressBookAccessMetadata() {
    return allowedAddressBookAccessMetadata;
  }

  /**
   * setAllowedAddressBookAccessMetadata.
   **/
  public void setAllowedAddressBookAccessMetadata(SettingsMetadata allowedAddressBookAccessMetadata) {
    this.allowedAddressBookAccessMetadata = allowedAddressBookAccessMetadata;
  }


  /**
   * allowedClickwrapsAccess.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedClickwrapsAccess(String allowedClickwrapsAccess) {
    this.allowedClickwrapsAccess = allowedClickwrapsAccess;
    return this;
  }

  /**
   * .
   * @return allowedClickwrapsAccess
   **/
  @Schema(description = "")
  public String getAllowedClickwrapsAccess() {
    return allowedClickwrapsAccess;
  }

  /**
   * setAllowedClickwrapsAccess.
   **/
  public void setAllowedClickwrapsAccess(String allowedClickwrapsAccess) {
    this.allowedClickwrapsAccess = allowedClickwrapsAccess;
  }


  /**
   * allowedClickwrapsAccessMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedClickwrapsAccessMetadata(SettingsMetadata allowedClickwrapsAccessMetadata) {
    this.allowedClickwrapsAccessMetadata = allowedClickwrapsAccessMetadata;
    return this;
  }

  /**
   * .
   * @return allowedClickwrapsAccessMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowedClickwrapsAccessMetadata() {
    return allowedClickwrapsAccessMetadata;
  }

  /**
   * setAllowedClickwrapsAccessMetadata.
   **/
  public void setAllowedClickwrapsAccessMetadata(SettingsMetadata allowedClickwrapsAccessMetadata) {
    this.allowedClickwrapsAccessMetadata = allowedClickwrapsAccessMetadata;
  }


  /**
   * allowedDocumentTemplateLibraryAccess.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedDocumentTemplateLibraryAccess(String allowedDocumentTemplateLibraryAccess) {
    this.allowedDocumentTemplateLibraryAccess = allowedDocumentTemplateLibraryAccess;
    return this;
  }

  /**
   * .
   * @return allowedDocumentTemplateLibraryAccess
   **/
  @Schema(description = "")
  public String getAllowedDocumentTemplateLibraryAccess() {
    return allowedDocumentTemplateLibraryAccess;
  }

  /**
   * setAllowedDocumentTemplateLibraryAccess.
   **/
  public void setAllowedDocumentTemplateLibraryAccess(String allowedDocumentTemplateLibraryAccess) {
    this.allowedDocumentTemplateLibraryAccess = allowedDocumentTemplateLibraryAccess;
  }


  /**
   * allowedDocumentTemplateLibraryAccessMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedDocumentTemplateLibraryAccessMetadata(SettingsMetadata allowedDocumentTemplateLibraryAccessMetadata) {
    this.allowedDocumentTemplateLibraryAccessMetadata = allowedDocumentTemplateLibraryAccessMetadata;
    return this;
  }

  /**
   * .
   * @return allowedDocumentTemplateLibraryAccessMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowedDocumentTemplateLibraryAccessMetadata() {
    return allowedDocumentTemplateLibraryAccessMetadata;
  }

  /**
   * setAllowedDocumentTemplateLibraryAccessMetadata.
   **/
  public void setAllowedDocumentTemplateLibraryAccessMetadata(SettingsMetadata allowedDocumentTemplateLibraryAccessMetadata) {
    this.allowedDocumentTemplateLibraryAccessMetadata = allowedDocumentTemplateLibraryAccessMetadata;
  }


  /**
   * allowedOrchestrationAccess.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedOrchestrationAccess(String allowedOrchestrationAccess) {
    this.allowedOrchestrationAccess = allowedOrchestrationAccess;
    return this;
  }

  /**
   * .
   * @return allowedOrchestrationAccess
   **/
  @Schema(description = "")
  public String getAllowedOrchestrationAccess() {
    return allowedOrchestrationAccess;
  }

  /**
   * setAllowedOrchestrationAccess.
   **/
  public void setAllowedOrchestrationAccess(String allowedOrchestrationAccess) {
    this.allowedOrchestrationAccess = allowedOrchestrationAccess;
  }


  /**
   * allowedOrchestrationAccessMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedOrchestrationAccessMetadata(SettingsMetadata allowedOrchestrationAccessMetadata) {
    this.allowedOrchestrationAccessMetadata = allowedOrchestrationAccessMetadata;
    return this;
  }

  /**
   * .
   * @return allowedOrchestrationAccessMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowedOrchestrationAccessMetadata() {
    return allowedOrchestrationAccessMetadata;
  }

  /**
   * setAllowedOrchestrationAccessMetadata.
   **/
  public void setAllowedOrchestrationAccessMetadata(SettingsMetadata allowedOrchestrationAccessMetadata) {
    this.allowedOrchestrationAccessMetadata = allowedOrchestrationAccessMetadata;
  }


  /**
   * allowedTemplateAccess.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedTemplateAccess(String allowedTemplateAccess) {
    this.allowedTemplateAccess = allowedTemplateAccess;
    return this;
  }

  /**
   * .
   * @return allowedTemplateAccess
   **/
  @Schema(description = "")
  public String getAllowedTemplateAccess() {
    return allowedTemplateAccess;
  }

  /**
   * setAllowedTemplateAccess.
   **/
  public void setAllowedTemplateAccess(String allowedTemplateAccess) {
    this.allowedTemplateAccess = allowedTemplateAccess;
  }


  /**
   * allowedTemplateAccessMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedTemplateAccessMetadata(SettingsMetadata allowedTemplateAccessMetadata) {
    this.allowedTemplateAccessMetadata = allowedTemplateAccessMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowedTemplateAccess` property is editable. .
   * @return allowedTemplateAccessMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowedTemplateAccess` property is editable. ")
  public SettingsMetadata getAllowedTemplateAccessMetadata() {
    return allowedTemplateAccessMetadata;
  }

  /**
   * setAllowedTemplateAccessMetadata.
   **/
  public void setAllowedTemplateAccessMetadata(SettingsMetadata allowedTemplateAccessMetadata) {
    this.allowedTemplateAccessMetadata = allowedTemplateAccessMetadata;
  }


  /**
   * allowedToBeEnvelopeTransferRecipient.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedToBeEnvelopeTransferRecipient(String allowedToBeEnvelopeTransferRecipient) {
    this.allowedToBeEnvelopeTransferRecipient = allowedToBeEnvelopeTransferRecipient;
    return this;
  }

  /**
   * .
   * @return allowedToBeEnvelopeTransferRecipient
   **/
  @Schema(description = "")
  public String getAllowedToBeEnvelopeTransferRecipient() {
    return allowedToBeEnvelopeTransferRecipient;
  }

  /**
   * setAllowedToBeEnvelopeTransferRecipient.
   **/
  public void setAllowedToBeEnvelopeTransferRecipient(String allowedToBeEnvelopeTransferRecipient) {
    this.allowedToBeEnvelopeTransferRecipient = allowedToBeEnvelopeTransferRecipient;
  }


  /**
   * allowedToBeEnvelopeTransferRecipientMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowedToBeEnvelopeTransferRecipientMetadata(SettingsMetadata allowedToBeEnvelopeTransferRecipientMetadata) {
    this.allowedToBeEnvelopeTransferRecipientMetadata = allowedToBeEnvelopeTransferRecipientMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowedToBeEnvelopeTransferRecipient` property is editable. .
   * @return allowedToBeEnvelopeTransferRecipientMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowedToBeEnvelopeTransferRecipient` property is editable. ")
  public SettingsMetadata getAllowedToBeEnvelopeTransferRecipientMetadata() {
    return allowedToBeEnvelopeTransferRecipientMetadata;
  }

  /**
   * setAllowedToBeEnvelopeTransferRecipientMetadata.
   **/
  public void setAllowedToBeEnvelopeTransferRecipientMetadata(SettingsMetadata allowedToBeEnvelopeTransferRecipientMetadata) {
    this.allowedToBeEnvelopeTransferRecipientMetadata = allowedToBeEnvelopeTransferRecipientMetadata;
  }


  /**
   * allowEnvelopeSending.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowEnvelopeSending(String allowEnvelopeSending) {
    this.allowEnvelopeSending = allowEnvelopeSending;
    return this;
  }

  /**
   * .
   * @return allowEnvelopeSending
   **/
  @Schema(description = "")
  public String getAllowEnvelopeSending() {
    return allowEnvelopeSending;
  }

  /**
   * setAllowEnvelopeSending.
   **/
  public void setAllowEnvelopeSending(String allowEnvelopeSending) {
    this.allowEnvelopeSending = allowEnvelopeSending;
  }


  /**
   * allowEnvelopeSendingMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowEnvelopeSendingMetadata(SettingsMetadata allowEnvelopeSendingMetadata) {
    this.allowEnvelopeSendingMetadata = allowEnvelopeSendingMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowEnvelopeSending` property is editable. .
   * @return allowEnvelopeSendingMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowEnvelopeSending` property is editable. ")
  public SettingsMetadata getAllowEnvelopeSendingMetadata() {
    return allowEnvelopeSendingMetadata;
  }

  /**
   * setAllowEnvelopeSendingMetadata.
   **/
  public void setAllowEnvelopeSendingMetadata(SettingsMetadata allowEnvelopeSendingMetadata) {
    this.allowEnvelopeSendingMetadata = allowEnvelopeSendingMetadata;
  }


  /**
   * allowESealRecipients.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowESealRecipients(String allowESealRecipients) {
    this.allowESealRecipients = allowESealRecipients;
    return this;
  }

  /**
   * .
   * @return allowESealRecipients
   **/
  @Schema(description = "")
  public String getAllowESealRecipients() {
    return allowESealRecipients;
  }

  /**
   * setAllowESealRecipients.
   **/
  public void setAllowESealRecipients(String allowESealRecipients) {
    this.allowESealRecipients = allowESealRecipients;
  }


  /**
   * allowESealRecipientsMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowESealRecipientsMetadata(SettingsMetadata allowESealRecipientsMetadata) {
    this.allowESealRecipientsMetadata = allowESealRecipientsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowESealRecipients` property is editable..
   * @return allowESealRecipientsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowESealRecipients` property is editable.")
  public SettingsMetadata getAllowESealRecipientsMetadata() {
    return allowESealRecipientsMetadata;
  }

  /**
   * setAllowESealRecipientsMetadata.
   **/
  public void setAllowESealRecipientsMetadata(SettingsMetadata allowESealRecipientsMetadata) {
    this.allowESealRecipientsMetadata = allowESealRecipientsMetadata;
  }


  /**
   * allowPowerFormsAdminToAccessAllPowerFormEnvelopes.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowPowerFormsAdminToAccessAllPowerFormEnvelopes(String allowPowerFormsAdminToAccessAllPowerFormEnvelopes) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopes = allowPowerFormsAdminToAccessAllPowerFormEnvelopes;
    return this;
  }

  /**
   * .
   * @return allowPowerFormsAdminToAccessAllPowerFormEnvelopes
   **/
  @Schema(description = "")
  public String getAllowPowerFormsAdminToAccessAllPowerFormEnvelopes() {
    return allowPowerFormsAdminToAccessAllPowerFormEnvelopes;
  }

  /**
   * setAllowPowerFormsAdminToAccessAllPowerFormEnvelopes.
   **/
  public void setAllowPowerFormsAdminToAccessAllPowerFormEnvelopes(String allowPowerFormsAdminToAccessAllPowerFormEnvelopes) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopes = allowPowerFormsAdminToAccessAllPowerFormEnvelopes;
  }


  /**
   * allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata(SettingsMetadata allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata = allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowPowerFormsAdminToAccessAllPowerFormEnvelopes` property is editable..
   * @return allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowPowerFormsAdminToAccessAllPowerFormEnvelopes` property is editable.")
  public SettingsMetadata getAllowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata() {
    return allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata;
  }

  /**
   * setAllowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata.
   **/
  public void setAllowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata(SettingsMetadata allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata = allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata;
  }


  /**
   * allowSendersToSetRecipientEmailLanguage.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowSendersToSetRecipientEmailLanguage(String allowSendersToSetRecipientEmailLanguage) {
    this.allowSendersToSetRecipientEmailLanguage = allowSendersToSetRecipientEmailLanguage;
    return this;
  }

  /**
   * .
   * @return allowSendersToSetRecipientEmailLanguage
   **/
  @Schema(description = "")
  public String getAllowSendersToSetRecipientEmailLanguage() {
    return allowSendersToSetRecipientEmailLanguage;
  }

  /**
   * setAllowSendersToSetRecipientEmailLanguage.
   **/
  public void setAllowSendersToSetRecipientEmailLanguage(String allowSendersToSetRecipientEmailLanguage) {
    this.allowSendersToSetRecipientEmailLanguage = allowSendersToSetRecipientEmailLanguage;
  }


  /**
   * allowSendersToSetRecipientEmailLanguageMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowSendersToSetRecipientEmailLanguageMetadata(SettingsMetadata allowSendersToSetRecipientEmailLanguageMetadata) {
    this.allowSendersToSetRecipientEmailLanguageMetadata = allowSendersToSetRecipientEmailLanguageMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowSendersToSetRecipientEmailLanguage` property is editable. .
   * @return allowSendersToSetRecipientEmailLanguageMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowSendersToSetRecipientEmailLanguage` property is editable. ")
  public SettingsMetadata getAllowSendersToSetRecipientEmailLanguageMetadata() {
    return allowSendersToSetRecipientEmailLanguageMetadata;
  }

  /**
   * setAllowSendersToSetRecipientEmailLanguageMetadata.
   **/
  public void setAllowSendersToSetRecipientEmailLanguageMetadata(SettingsMetadata allowSendersToSetRecipientEmailLanguageMetadata) {
    this.allowSendersToSetRecipientEmailLanguageMetadata = allowSendersToSetRecipientEmailLanguageMetadata;
  }


  /**
   * allowSignerAttachments.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowSignerAttachments(String allowSignerAttachments) {
    this.allowSignerAttachments = allowSignerAttachments;
    return this;
  }

  /**
   * .
   * @return allowSignerAttachments
   **/
  @Schema(description = "")
  public String getAllowSignerAttachments() {
    return allowSignerAttachments;
  }

  /**
   * setAllowSignerAttachments.
   **/
  public void setAllowSignerAttachments(String allowSignerAttachments) {
    this.allowSignerAttachments = allowSignerAttachments;
  }


  /**
   * allowSignerAttachmentsMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowSignerAttachmentsMetadata(SettingsMetadata allowSignerAttachmentsMetadata) {
    this.allowSignerAttachmentsMetadata = allowSignerAttachmentsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowSignerAttachments` property is editable. .
   * @return allowSignerAttachmentsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowSignerAttachments` property is editable. ")
  public SettingsMetadata getAllowSignerAttachmentsMetadata() {
    return allowSignerAttachmentsMetadata;
  }

  /**
   * setAllowSignerAttachmentsMetadata.
   **/
  public void setAllowSignerAttachmentsMetadata(SettingsMetadata allowSignerAttachmentsMetadata) {
    this.allowSignerAttachmentsMetadata = allowSignerAttachmentsMetadata;
  }


  /**
   * allowSupplementalDocuments.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowSupplementalDocuments(String allowSupplementalDocuments) {
    this.allowSupplementalDocuments = allowSupplementalDocuments;
    return this;
  }

  /**
   * .
   * @return allowSupplementalDocuments
   **/
  @Schema(description = "")
  public String getAllowSupplementalDocuments() {
    return allowSupplementalDocuments;
  }

  /**
   * setAllowSupplementalDocuments.
   **/
  public void setAllowSupplementalDocuments(String allowSupplementalDocuments) {
    this.allowSupplementalDocuments = allowSupplementalDocuments;
  }


  /**
   * allowSupplementalDocumentsMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowSupplementalDocumentsMetadata(SettingsMetadata allowSupplementalDocumentsMetadata) {
    this.allowSupplementalDocumentsMetadata = allowSupplementalDocumentsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowSupplementalDocuments` property is editable..
   * @return allowSupplementalDocumentsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowSupplementalDocuments` property is editable.")
  public SettingsMetadata getAllowSupplementalDocumentsMetadata() {
    return allowSupplementalDocumentsMetadata;
  }

  /**
   * setAllowSupplementalDocumentsMetadata.
   **/
  public void setAllowSupplementalDocumentsMetadata(SettingsMetadata allowSupplementalDocumentsMetadata) {
    this.allowSupplementalDocumentsMetadata = allowSupplementalDocumentsMetadata;
  }


  /**
   * allowTaggingInSendAndCorrect.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowTaggingInSendAndCorrect(String allowTaggingInSendAndCorrect) {
    this.allowTaggingInSendAndCorrect = allowTaggingInSendAndCorrect;
    return this;
  }

  /**
   * .
   * @return allowTaggingInSendAndCorrect
   **/
  @Schema(description = "")
  public String getAllowTaggingInSendAndCorrect() {
    return allowTaggingInSendAndCorrect;
  }

  /**
   * setAllowTaggingInSendAndCorrect.
   **/
  public void setAllowTaggingInSendAndCorrect(String allowTaggingInSendAndCorrect) {
    this.allowTaggingInSendAndCorrect = allowTaggingInSendAndCorrect;
  }


  /**
   * allowTaggingInSendAndCorrectMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowTaggingInSendAndCorrectMetadata(SettingsMetadata allowTaggingInSendAndCorrectMetadata) {
    this.allowTaggingInSendAndCorrectMetadata = allowTaggingInSendAndCorrectMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowTaggingInSendAndCorrect` property is editable. .
   * @return allowTaggingInSendAndCorrectMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowTaggingInSendAndCorrect` property is editable. ")
  public SettingsMetadata getAllowTaggingInSendAndCorrectMetadata() {
    return allowTaggingInSendAndCorrectMetadata;
  }

  /**
   * setAllowTaggingInSendAndCorrectMetadata.
   **/
  public void setAllowTaggingInSendAndCorrectMetadata(SettingsMetadata allowTaggingInSendAndCorrectMetadata) {
    this.allowTaggingInSendAndCorrectMetadata = allowTaggingInSendAndCorrectMetadata;
  }


  /**
   * allowTransactions.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowTransactions(String allowTransactions) {
    this.allowTransactions = allowTransactions;
    return this;
  }

  /**
   * .
   * @return allowTransactions
   **/
  @Schema(description = "")
  public String getAllowTransactions() {
    return allowTransactions;
  }

  /**
   * setAllowTransactions.
   **/
  public void setAllowTransactions(String allowTransactions) {
    this.allowTransactions = allowTransactions;
  }


  /**
   * allowTransactionsMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowTransactionsMetadata(SettingsMetadata allowTransactionsMetadata) {
    this.allowTransactionsMetadata = allowTransactionsMetadata;
    return this;
  }

  /**
   * .
   * @return allowTransactionsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowTransactionsMetadata() {
    return allowTransactionsMetadata;
  }

  /**
   * setAllowTransactionsMetadata.
   **/
  public void setAllowTransactionsMetadata(SettingsMetadata allowTransactionsMetadata) {
    this.allowTransactionsMetadata = allowTransactionsMetadata;
  }


  /**
   * allowVaulting.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowVaulting(String allowVaulting) {
    this.allowVaulting = allowVaulting;
    return this;
  }

  /**
   * .
   * @return allowVaulting
   **/
  @Schema(description = "")
  public String getAllowVaulting() {
    return allowVaulting;
  }

  /**
   * setAllowVaulting.
   **/
  public void setAllowVaulting(String allowVaulting) {
    this.allowVaulting = allowVaulting;
  }


  /**
   * allowVaultingMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowVaultingMetadata(SettingsMetadata allowVaultingMetadata) {
    this.allowVaultingMetadata = allowVaultingMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return allowVaultingMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getAllowVaultingMetadata() {
    return allowVaultingMetadata;
  }

  /**
   * setAllowVaultingMetadata.
   **/
  public void setAllowVaultingMetadata(SettingsMetadata allowVaultingMetadata) {
    this.allowVaultingMetadata = allowVaultingMetadata;
  }


  /**
   * allowWetSigningOverride.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowWetSigningOverride(String allowWetSigningOverride) {
    this.allowWetSigningOverride = allowWetSigningOverride;
    return this;
  }

  /**
   * .
   * @return allowWetSigningOverride
   **/
  @Schema(description = "")
  public String getAllowWetSigningOverride() {
    return allowWetSigningOverride;
  }

  /**
   * setAllowWetSigningOverride.
   **/
  public void setAllowWetSigningOverride(String allowWetSigningOverride) {
    this.allowWetSigningOverride = allowWetSigningOverride;
  }


  /**
   * allowWetSigningOverrideMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings allowWetSigningOverrideMetadata(SettingsMetadata allowWetSigningOverrideMetadata) {
    this.allowWetSigningOverrideMetadata = allowWetSigningOverrideMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `allowWetSigningOverride` property is editable. .
   * @return allowWetSigningOverrideMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `allowWetSigningOverride` property is editable. ")
  public SettingsMetadata getAllowWetSigningOverrideMetadata() {
    return allowWetSigningOverrideMetadata;
  }

  /**
   * setAllowWetSigningOverrideMetadata.
   **/
  public void setAllowWetSigningOverrideMetadata(SettingsMetadata allowWetSigningOverrideMetadata) {
    this.allowWetSigningOverrideMetadata = allowWetSigningOverrideMetadata;
  }


  /**
   * canBulkUploadAgreements.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canBulkUploadAgreements(String canBulkUploadAgreements) {
    this.canBulkUploadAgreements = canBulkUploadAgreements;
    return this;
  }

  /**
   * .
   * @return canBulkUploadAgreements
   **/
  @Schema(description = "")
  public String getCanBulkUploadAgreements() {
    return canBulkUploadAgreements;
  }

  /**
   * setCanBulkUploadAgreements.
   **/
  public void setCanBulkUploadAgreements(String canBulkUploadAgreements) {
    this.canBulkUploadAgreements = canBulkUploadAgreements;
  }


  /**
   * canBulkUploadAgreementsMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canBulkUploadAgreementsMetadata(SettingsMetadata canBulkUploadAgreementsMetadata) {
    this.canBulkUploadAgreementsMetadata = canBulkUploadAgreementsMetadata;
    return this;
  }

  /**
   * .
   * @return canBulkUploadAgreementsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCanBulkUploadAgreementsMetadata() {
    return canBulkUploadAgreementsMetadata;
  }

  /**
   * setCanBulkUploadAgreementsMetadata.
   **/
  public void setCanBulkUploadAgreementsMetadata(SettingsMetadata canBulkUploadAgreementsMetadata) {
    this.canBulkUploadAgreementsMetadata = canBulkUploadAgreementsMetadata;
  }


  /**
   * canCreateTransaction.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canCreateTransaction(String canCreateTransaction) {
    this.canCreateTransaction = canCreateTransaction;
    return this;
  }

  /**
   * .
   * @return canCreateTransaction
   **/
  @Schema(description = "")
  public String getCanCreateTransaction() {
    return canCreateTransaction;
  }

  /**
   * setCanCreateTransaction.
   **/
  public void setCanCreateTransaction(String canCreateTransaction) {
    this.canCreateTransaction = canCreateTransaction;
  }


  /**
   * canCreateTransactionMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canCreateTransactionMetadata(SettingsMetadata canCreateTransactionMetadata) {
    this.canCreateTransactionMetadata = canCreateTransactionMetadata;
    return this;
  }

  /**
   * .
   * @return canCreateTransactionMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCanCreateTransactionMetadata() {
    return canCreateTransactionMetadata;
  }

  /**
   * setCanCreateTransactionMetadata.
   **/
  public void setCanCreateTransactionMetadata(SettingsMetadata canCreateTransactionMetadata) {
    this.canCreateTransactionMetadata = canCreateTransactionMetadata;
  }


  /**
   * canCreateWorkspaces.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canCreateWorkspaces(String canCreateWorkspaces) {
    this.canCreateWorkspaces = canCreateWorkspaces;
    return this;
  }

  /**
   * .
   * @return canCreateWorkspaces
   **/
  @Schema(description = "")
  public String getCanCreateWorkspaces() {
    return canCreateWorkspaces;
  }

  /**
   * setCanCreateWorkspaces.
   **/
  public void setCanCreateWorkspaces(String canCreateWorkspaces) {
    this.canCreateWorkspaces = canCreateWorkspaces;
  }


  /**
   * canCreateWorkspacesMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canCreateWorkspacesMetadata(SettingsMetadata canCreateWorkspacesMetadata) {
    this.canCreateWorkspacesMetadata = canCreateWorkspacesMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return canCreateWorkspacesMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getCanCreateWorkspacesMetadata() {
    return canCreateWorkspacesMetadata;
  }

  /**
   * setCanCreateWorkspacesMetadata.
   **/
  public void setCanCreateWorkspacesMetadata(SettingsMetadata canCreateWorkspacesMetadata) {
    this.canCreateWorkspacesMetadata = canCreateWorkspacesMetadata;
  }


  /**
   * canDeleteDocumentsInTransaction.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canDeleteDocumentsInTransaction(String canDeleteDocumentsInTransaction) {
    this.canDeleteDocumentsInTransaction = canDeleteDocumentsInTransaction;
    return this;
  }

  /**
   * .
   * @return canDeleteDocumentsInTransaction
   **/
  @Schema(description = "")
  public String getCanDeleteDocumentsInTransaction() {
    return canDeleteDocumentsInTransaction;
  }

  /**
   * setCanDeleteDocumentsInTransaction.
   **/
  public void setCanDeleteDocumentsInTransaction(String canDeleteDocumentsInTransaction) {
    this.canDeleteDocumentsInTransaction = canDeleteDocumentsInTransaction;
  }


  /**
   * canDeleteDocumentsInTransactionMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canDeleteDocumentsInTransactionMetadata(SettingsMetadata canDeleteDocumentsInTransactionMetadata) {
    this.canDeleteDocumentsInTransactionMetadata = canDeleteDocumentsInTransactionMetadata;
    return this;
  }

  /**
   * .
   * @return canDeleteDocumentsInTransactionMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCanDeleteDocumentsInTransactionMetadata() {
    return canDeleteDocumentsInTransactionMetadata;
  }

  /**
   * setCanDeleteDocumentsInTransactionMetadata.
   **/
  public void setCanDeleteDocumentsInTransactionMetadata(SettingsMetadata canDeleteDocumentsInTransactionMetadata) {
    this.canDeleteDocumentsInTransactionMetadata = canDeleteDocumentsInTransactionMetadata;
  }


  /**
   * canDeleteTransaction.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canDeleteTransaction(String canDeleteTransaction) {
    this.canDeleteTransaction = canDeleteTransaction;
    return this;
  }

  /**
   * .
   * @return canDeleteTransaction
   **/
  @Schema(description = "")
  public String getCanDeleteTransaction() {
    return canDeleteTransaction;
  }

  /**
   * setCanDeleteTransaction.
   **/
  public void setCanDeleteTransaction(String canDeleteTransaction) {
    this.canDeleteTransaction = canDeleteTransaction;
  }


  /**
   * canDeleteTransactionMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canDeleteTransactionMetadata(SettingsMetadata canDeleteTransactionMetadata) {
    this.canDeleteTransactionMetadata = canDeleteTransactionMetadata;
    return this;
  }

  /**
   * .
   * @return canDeleteTransactionMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCanDeleteTransactionMetadata() {
    return canDeleteTransactionMetadata;
  }

  /**
   * setCanDeleteTransactionMetadata.
   **/
  public void setCanDeleteTransactionMetadata(SettingsMetadata canDeleteTransactionMetadata) {
    this.canDeleteTransactionMetadata = canDeleteTransactionMetadata;
  }


  /**
   * canManageAgreementDeskRequest.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canManageAgreementDeskRequest(String canManageAgreementDeskRequest) {
    this.canManageAgreementDeskRequest = canManageAgreementDeskRequest;
    return this;
  }

  /**
   * .
   * @return canManageAgreementDeskRequest
   **/
  @Schema(description = "")
  public String getCanManageAgreementDeskRequest() {
    return canManageAgreementDeskRequest;
  }

  /**
   * setCanManageAgreementDeskRequest.
   **/
  public void setCanManageAgreementDeskRequest(String canManageAgreementDeskRequest) {
    this.canManageAgreementDeskRequest = canManageAgreementDeskRequest;
  }


  /**
   * canManageAgreementDeskRequestMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canManageAgreementDeskRequestMetadata(SettingsMetadata canManageAgreementDeskRequestMetadata) {
    this.canManageAgreementDeskRequestMetadata = canManageAgreementDeskRequestMetadata;
    return this;
  }

  /**
   * .
   * @return canManageAgreementDeskRequestMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCanManageAgreementDeskRequestMetadata() {
    return canManageAgreementDeskRequestMetadata;
  }

  /**
   * setCanManageAgreementDeskRequestMetadata.
   **/
  public void setCanManageAgreementDeskRequestMetadata(SettingsMetadata canManageAgreementDeskRequestMetadata) {
    this.canManageAgreementDeskRequestMetadata = canManageAgreementDeskRequestMetadata;
  }


  /**
   * canManageAgreementDeskRequestSetting.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canManageAgreementDeskRequestSetting(String canManageAgreementDeskRequestSetting) {
    this.canManageAgreementDeskRequestSetting = canManageAgreementDeskRequestSetting;
    return this;
  }

  /**
   * .
   * @return canManageAgreementDeskRequestSetting
   **/
  @Schema(description = "")
  public String getCanManageAgreementDeskRequestSetting() {
    return canManageAgreementDeskRequestSetting;
  }

  /**
   * setCanManageAgreementDeskRequestSetting.
   **/
  public void setCanManageAgreementDeskRequestSetting(String canManageAgreementDeskRequestSetting) {
    this.canManageAgreementDeskRequestSetting = canManageAgreementDeskRequestSetting;
  }


  /**
   * canManageAgreementDeskRequestSettingMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canManageAgreementDeskRequestSettingMetadata(SettingsMetadata canManageAgreementDeskRequestSettingMetadata) {
    this.canManageAgreementDeskRequestSettingMetadata = canManageAgreementDeskRequestSettingMetadata;
    return this;
  }

  /**
   * .
   * @return canManageAgreementDeskRequestSettingMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCanManageAgreementDeskRequestSettingMetadata() {
    return canManageAgreementDeskRequestSettingMetadata;
  }

  /**
   * setCanManageAgreementDeskRequestSettingMetadata.
   **/
  public void setCanManageAgreementDeskRequestSettingMetadata(SettingsMetadata canManageAgreementDeskRequestSettingMetadata) {
    this.canManageAgreementDeskRequestSettingMetadata = canManageAgreementDeskRequestSettingMetadata;
  }


  /**
   * canSendEnvelopesViaSMS.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canSendEnvelopesViaSMS(String canSendEnvelopesViaSMS) {
    this.canSendEnvelopesViaSMS = canSendEnvelopesViaSMS;
    return this;
  }

  /**
   * .
   * @return canSendEnvelopesViaSMS
   **/
  @Schema(description = "")
  public String getCanSendEnvelopesViaSMS() {
    return canSendEnvelopesViaSMS;
  }

  /**
   * setCanSendEnvelopesViaSMS.
   **/
  public void setCanSendEnvelopesViaSMS(String canSendEnvelopesViaSMS) {
    this.canSendEnvelopesViaSMS = canSendEnvelopesViaSMS;
  }


  /**
   * canSendEnvelopesViaSMSMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings canSendEnvelopesViaSMSMetadata(SettingsMetadata canSendEnvelopesViaSMSMetadata) {
    this.canSendEnvelopesViaSMSMetadata = canSendEnvelopesViaSMSMetadata;
    return this;
  }

  /**
   * .
   * @return canSendEnvelopesViaSMSMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCanSendEnvelopesViaSMSMetadata() {
    return canSendEnvelopesViaSMSMetadata;
  }

  /**
   * setCanSendEnvelopesViaSMSMetadata.
   **/
  public void setCanSendEnvelopesViaSMSMetadata(SettingsMetadata canSendEnvelopesViaSMSMetadata) {
    this.canSendEnvelopesViaSMSMetadata = canSendEnvelopesViaSMSMetadata;
  }


  /**
   * disableDocumentUpload.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings disableDocumentUpload(String disableDocumentUpload) {
    this.disableDocumentUpload = disableDocumentUpload;
    return this;
  }

  /**
   * .
   * @return disableDocumentUpload
   **/
  @Schema(description = "")
  public String getDisableDocumentUpload() {
    return disableDocumentUpload;
  }

  /**
   * setDisableDocumentUpload.
   **/
  public void setDisableDocumentUpload(String disableDocumentUpload) {
    this.disableDocumentUpload = disableDocumentUpload;
  }


  /**
   * disableDocumentUploadMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings disableDocumentUploadMetadata(SettingsMetadata disableDocumentUploadMetadata) {
    this.disableDocumentUploadMetadata = disableDocumentUploadMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `disableDocumentUpload` property is editable. .
   * @return disableDocumentUploadMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `disableDocumentUpload` property is editable. ")
  public SettingsMetadata getDisableDocumentUploadMetadata() {
    return disableDocumentUploadMetadata;
  }

  /**
   * setDisableDocumentUploadMetadata.
   **/
  public void setDisableDocumentUploadMetadata(SettingsMetadata disableDocumentUploadMetadata) {
    this.disableDocumentUploadMetadata = disableDocumentUploadMetadata;
  }


  /**
   * disableOtherActions.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings disableOtherActions(String disableOtherActions) {
    this.disableOtherActions = disableOtherActions;
    return this;
  }

  /**
   * .
   * @return disableOtherActions
   **/
  @Schema(description = "")
  public String getDisableOtherActions() {
    return disableOtherActions;
  }

  /**
   * setDisableOtherActions.
   **/
  public void setDisableOtherActions(String disableOtherActions) {
    this.disableOtherActions = disableOtherActions;
  }


  /**
   * disableOtherActionsMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings disableOtherActionsMetadata(SettingsMetadata disableOtherActionsMetadata) {
    this.disableOtherActionsMetadata = disableOtherActionsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `disableOtherActions` property is editable. .
   * @return disableOtherActionsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `disableOtherActions` property is editable. ")
  public SettingsMetadata getDisableOtherActionsMetadata() {
    return disableOtherActionsMetadata;
  }

  /**
   * setDisableOtherActionsMetadata.
   **/
  public void setDisableOtherActionsMetadata(SettingsMetadata disableOtherActionsMetadata) {
    this.disableOtherActionsMetadata = disableOtherActionsMetadata;
  }


  /**
   * enableApiRequestLogging.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings enableApiRequestLogging(String enableApiRequestLogging) {
    this.enableApiRequestLogging = enableApiRequestLogging;
    return this;
  }

  /**
   * .
   * @return enableApiRequestLogging
   **/
  @Schema(description = "")
  public String getEnableApiRequestLogging() {
    return enableApiRequestLogging;
  }

  /**
   * setEnableApiRequestLogging.
   **/
  public void setEnableApiRequestLogging(String enableApiRequestLogging) {
    this.enableApiRequestLogging = enableApiRequestLogging;
  }


  /**
   * enableApiRequestLoggingMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings enableApiRequestLoggingMetadata(SettingsMetadata enableApiRequestLoggingMetadata) {
    this.enableApiRequestLoggingMetadata = enableApiRequestLoggingMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `enableApiRequestLogging` property is editable. .
   * @return enableApiRequestLoggingMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `enableApiRequestLogging` property is editable. ")
  public SettingsMetadata getEnableApiRequestLoggingMetadata() {
    return enableApiRequestLoggingMetadata;
  }

  /**
   * setEnableApiRequestLoggingMetadata.
   **/
  public void setEnableApiRequestLoggingMetadata(SettingsMetadata enableApiRequestLoggingMetadata) {
    this.enableApiRequestLoggingMetadata = enableApiRequestLoggingMetadata;
  }


  /**
   * enableKeyTermsSuggestionsByDocumentType.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings enableKeyTermsSuggestionsByDocumentType(String enableKeyTermsSuggestionsByDocumentType) {
    this.enableKeyTermsSuggestionsByDocumentType = enableKeyTermsSuggestionsByDocumentType;
    return this;
  }

  /**
   * .
   * @return enableKeyTermsSuggestionsByDocumentType
   **/
  @Schema(description = "")
  public String getEnableKeyTermsSuggestionsByDocumentType() {
    return enableKeyTermsSuggestionsByDocumentType;
  }

  /**
   * setEnableKeyTermsSuggestionsByDocumentType.
   **/
  public void setEnableKeyTermsSuggestionsByDocumentType(String enableKeyTermsSuggestionsByDocumentType) {
    this.enableKeyTermsSuggestionsByDocumentType = enableKeyTermsSuggestionsByDocumentType;
  }


  /**
   * enableKeyTermsSuggestionsByDocumentTypeMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings enableKeyTermsSuggestionsByDocumentTypeMetadata(SettingsMetadata enableKeyTermsSuggestionsByDocumentTypeMetadata) {
    this.enableKeyTermsSuggestionsByDocumentTypeMetadata = enableKeyTermsSuggestionsByDocumentTypeMetadata;
    return this;
  }

  /**
   * .
   * @return enableKeyTermsSuggestionsByDocumentTypeMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getEnableKeyTermsSuggestionsByDocumentTypeMetadata() {
    return enableKeyTermsSuggestionsByDocumentTypeMetadata;
  }

  /**
   * setEnableKeyTermsSuggestionsByDocumentTypeMetadata.
   **/
  public void setEnableKeyTermsSuggestionsByDocumentTypeMetadata(SettingsMetadata enableKeyTermsSuggestionsByDocumentTypeMetadata) {
    this.enableKeyTermsSuggestionsByDocumentTypeMetadata = enableKeyTermsSuggestionsByDocumentTypeMetadata;
  }


  /**
   * enableRecipientViewingNotifications.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings enableRecipientViewingNotifications(String enableRecipientViewingNotifications) {
    this.enableRecipientViewingNotifications = enableRecipientViewingNotifications;
    return this;
  }

  /**
   * .
   * @return enableRecipientViewingNotifications
   **/
  @Schema(description = "")
  public String getEnableRecipientViewingNotifications() {
    return enableRecipientViewingNotifications;
  }

  /**
   * setEnableRecipientViewingNotifications.
   **/
  public void setEnableRecipientViewingNotifications(String enableRecipientViewingNotifications) {
    this.enableRecipientViewingNotifications = enableRecipientViewingNotifications;
  }


  /**
   * enableRecipientViewingNotificationsMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings enableRecipientViewingNotificationsMetadata(SettingsMetadata enableRecipientViewingNotificationsMetadata) {
    this.enableRecipientViewingNotificationsMetadata = enableRecipientViewingNotificationsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `enableRecipientViewingNotifications` property is editable. .
   * @return enableRecipientViewingNotificationsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `enableRecipientViewingNotifications` property is editable. ")
  public SettingsMetadata getEnableRecipientViewingNotificationsMetadata() {
    return enableRecipientViewingNotificationsMetadata;
  }

  /**
   * setEnableRecipientViewingNotificationsMetadata.
   **/
  public void setEnableRecipientViewingNotificationsMetadata(SettingsMetadata enableRecipientViewingNotificationsMetadata) {
    this.enableRecipientViewingNotificationsMetadata = enableRecipientViewingNotificationsMetadata;
  }


  /**
   * enableSequentialSigningInterface.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings enableSequentialSigningInterface(String enableSequentialSigningInterface) {
    this.enableSequentialSigningInterface = enableSequentialSigningInterface;
    return this;
  }

  /**
   * .
   * @return enableSequentialSigningInterface
   **/
  @Schema(description = "")
  public String getEnableSequentialSigningInterface() {
    return enableSequentialSigningInterface;
  }

  /**
   * setEnableSequentialSigningInterface.
   **/
  public void setEnableSequentialSigningInterface(String enableSequentialSigningInterface) {
    this.enableSequentialSigningInterface = enableSequentialSigningInterface;
  }


  /**
   * enableSequentialSigningInterfaceMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings enableSequentialSigningInterfaceMetadata(SettingsMetadata enableSequentialSigningInterfaceMetadata) {
    this.enableSequentialSigningInterfaceMetadata = enableSequentialSigningInterfaceMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `enableSequentialSigningInterface` property is editable. .
   * @return enableSequentialSigningInterfaceMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `enableSequentialSigningInterface` property is editable. ")
  public SettingsMetadata getEnableSequentialSigningInterfaceMetadata() {
    return enableSequentialSigningInterfaceMetadata;
  }

  /**
   * setEnableSequentialSigningInterfaceMetadata.
   **/
  public void setEnableSequentialSigningInterfaceMetadata(SettingsMetadata enableSequentialSigningInterfaceMetadata) {
    this.enableSequentialSigningInterfaceMetadata = enableSequentialSigningInterfaceMetadata;
  }


  /**
   * enableTransactionPointIntegration.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings enableTransactionPointIntegration(String enableTransactionPointIntegration) {
    this.enableTransactionPointIntegration = enableTransactionPointIntegration;
    return this;
  }

  /**
   * .
   * @return enableTransactionPointIntegration
   **/
  @Schema(description = "")
  public String getEnableTransactionPointIntegration() {
    return enableTransactionPointIntegration;
  }

  /**
   * setEnableTransactionPointIntegration.
   **/
  public void setEnableTransactionPointIntegration(String enableTransactionPointIntegration) {
    this.enableTransactionPointIntegration = enableTransactionPointIntegration;
  }


  /**
   * enableTransactionPointIntegrationMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings enableTransactionPointIntegrationMetadata(SettingsMetadata enableTransactionPointIntegrationMetadata) {
    this.enableTransactionPointIntegrationMetadata = enableTransactionPointIntegrationMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return enableTransactionPointIntegrationMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getEnableTransactionPointIntegrationMetadata() {
    return enableTransactionPointIntegrationMetadata;
  }

  /**
   * setEnableTransactionPointIntegrationMetadata.
   **/
  public void setEnableTransactionPointIntegrationMetadata(SettingsMetadata enableTransactionPointIntegrationMetadata) {
    this.enableTransactionPointIntegrationMetadata = enableTransactionPointIntegrationMetadata;
  }


  /**
   * playbookAccess.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings playbookAccess(String playbookAccess) {
    this.playbookAccess = playbookAccess;
    return this;
  }

  /**
   * .
   * @return playbookAccess
   **/
  @Schema(description = "")
  public String getPlaybookAccess() {
    return playbookAccess;
  }

  /**
   * setPlaybookAccess.
   **/
  public void setPlaybookAccess(String playbookAccess) {
    this.playbookAccess = playbookAccess;
  }


  /**
   * playbookAccessMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings playbookAccessMetadata(SettingsMetadata playbookAccessMetadata) {
    this.playbookAccessMetadata = playbookAccessMetadata;
    return this;
  }

  /**
   * .
   * @return playbookAccessMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getPlaybookAccessMetadata() {
    return playbookAccessMetadata;
  }

  /**
   * setPlaybookAccessMetadata.
   **/
  public void setPlaybookAccessMetadata(SettingsMetadata playbookAccessMetadata) {
    this.playbookAccessMetadata = playbookAccessMetadata;
  }


  /**
   * powerFormRole.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings powerFormRole(String powerFormRole) {
    this.powerFormRole = powerFormRole;
    return this;
  }

  /**
   * .
   * @return powerFormRole
   **/
  @Schema(description = "")
  public String getPowerFormRole() {
    return powerFormRole;
  }

  /**
   * setPowerFormRole.
   **/
  public void setPowerFormRole(String powerFormRole) {
    this.powerFormRole = powerFormRole;
  }


  /**
   * powerFormRoleMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings powerFormRoleMetadata(SettingsMetadata powerFormRoleMetadata) {
    this.powerFormRoleMetadata = powerFormRoleMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `powerFormRole` property is editable. .
   * @return powerFormRoleMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `powerFormRole` property is editable. ")
  public SettingsMetadata getPowerFormRoleMetadata() {
    return powerFormRoleMetadata;
  }

  /**
   * setPowerFormRoleMetadata.
   **/
  public void setPowerFormRoleMetadata(SettingsMetadata powerFormRoleMetadata) {
    this.powerFormRoleMetadata = powerFormRoleMetadata;
  }


  /**
   * receiveCompletedSelfSignedDocumentsAsEmailLinks.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings receiveCompletedSelfSignedDocumentsAsEmailLinks(String receiveCompletedSelfSignedDocumentsAsEmailLinks) {
    this.receiveCompletedSelfSignedDocumentsAsEmailLinks = receiveCompletedSelfSignedDocumentsAsEmailLinks;
    return this;
  }

  /**
   * .
   * @return receiveCompletedSelfSignedDocumentsAsEmailLinks
   **/
  @Schema(description = "")
  public String getReceiveCompletedSelfSignedDocumentsAsEmailLinks() {
    return receiveCompletedSelfSignedDocumentsAsEmailLinks;
  }

  /**
   * setReceiveCompletedSelfSignedDocumentsAsEmailLinks.
   **/
  public void setReceiveCompletedSelfSignedDocumentsAsEmailLinks(String receiveCompletedSelfSignedDocumentsAsEmailLinks) {
    this.receiveCompletedSelfSignedDocumentsAsEmailLinks = receiveCompletedSelfSignedDocumentsAsEmailLinks;
  }


  /**
   * receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata(SettingsMetadata receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata) {
    this.receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata = receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `receiveCompletedSelfSignedDocumentsAsEmailLinks` property is editable. .
   * @return receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `receiveCompletedSelfSignedDocumentsAsEmailLinks` property is editable. ")
  public SettingsMetadata getReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata() {
    return receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata;
  }

  /**
   * setReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata.
   **/
  public void setReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata(SettingsMetadata receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata) {
    this.receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata = receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata;
  }


  /**
   * signingUiVersionMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings signingUiVersionMetadata(SettingsMetadata signingUiVersionMetadata) {
    this.signingUiVersionMetadata = signingUiVersionMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return signingUiVersionMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getSigningUiVersionMetadata() {
    return signingUiVersionMetadata;
  }

  /**
   * setSigningUiVersionMetadata.
   **/
  public void setSigningUiVersionMetadata(SettingsMetadata signingUiVersionMetadata) {
    this.signingUiVersionMetadata = signingUiVersionMetadata;
  }


  /**
   * supplementalDocumentsMustAccept.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings supplementalDocumentsMustAccept(String supplementalDocumentsMustAccept) {
    this.supplementalDocumentsMustAccept = supplementalDocumentsMustAccept;
    return this;
  }

  /**
   * .
   * @return supplementalDocumentsMustAccept
   **/
  @Schema(description = "")
  public String getSupplementalDocumentsMustAccept() {
    return supplementalDocumentsMustAccept;
  }

  /**
   * setSupplementalDocumentsMustAccept.
   **/
  public void setSupplementalDocumentsMustAccept(String supplementalDocumentsMustAccept) {
    this.supplementalDocumentsMustAccept = supplementalDocumentsMustAccept;
  }


  /**
   * supplementalDocumentsMustAcceptMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings supplementalDocumentsMustAcceptMetadata(SettingsMetadata supplementalDocumentsMustAcceptMetadata) {
    this.supplementalDocumentsMustAcceptMetadata = supplementalDocumentsMustAcceptMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `supplementalDocumentsMustAccept` property is editable. .
   * @return supplementalDocumentsMustAcceptMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `supplementalDocumentsMustAccept` property is editable. ")
  public SettingsMetadata getSupplementalDocumentsMustAcceptMetadata() {
    return supplementalDocumentsMustAcceptMetadata;
  }

  /**
   * setSupplementalDocumentsMustAcceptMetadata.
   **/
  public void setSupplementalDocumentsMustAcceptMetadata(SettingsMetadata supplementalDocumentsMustAcceptMetadata) {
    this.supplementalDocumentsMustAcceptMetadata = supplementalDocumentsMustAcceptMetadata;
  }


  /**
   * supplementalDocumentsMustRead.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings supplementalDocumentsMustRead(String supplementalDocumentsMustRead) {
    this.supplementalDocumentsMustRead = supplementalDocumentsMustRead;
    return this;
  }

  /**
   * .
   * @return supplementalDocumentsMustRead
   **/
  @Schema(description = "")
  public String getSupplementalDocumentsMustRead() {
    return supplementalDocumentsMustRead;
  }

  /**
   * setSupplementalDocumentsMustRead.
   **/
  public void setSupplementalDocumentsMustRead(String supplementalDocumentsMustRead) {
    this.supplementalDocumentsMustRead = supplementalDocumentsMustRead;
  }


  /**
   * supplementalDocumentsMustReadMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings supplementalDocumentsMustReadMetadata(SettingsMetadata supplementalDocumentsMustReadMetadata) {
    this.supplementalDocumentsMustReadMetadata = supplementalDocumentsMustReadMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `supplementalDocumentsMustRead` property is editable. .
   * @return supplementalDocumentsMustReadMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `supplementalDocumentsMustRead` property is editable. ")
  public SettingsMetadata getSupplementalDocumentsMustReadMetadata() {
    return supplementalDocumentsMustReadMetadata;
  }

  /**
   * setSupplementalDocumentsMustReadMetadata.
   **/
  public void setSupplementalDocumentsMustReadMetadata(SettingsMetadata supplementalDocumentsMustReadMetadata) {
    this.supplementalDocumentsMustReadMetadata = supplementalDocumentsMustReadMetadata;
  }


  /**
   * supplementalDocumentsMustView.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings supplementalDocumentsMustView(String supplementalDocumentsMustView) {
    this.supplementalDocumentsMustView = supplementalDocumentsMustView;
    return this;
  }

  /**
   * .
   * @return supplementalDocumentsMustView
   **/
  @Schema(description = "")
  public String getSupplementalDocumentsMustView() {
    return supplementalDocumentsMustView;
  }

  /**
   * setSupplementalDocumentsMustView.
   **/
  public void setSupplementalDocumentsMustView(String supplementalDocumentsMustView) {
    this.supplementalDocumentsMustView = supplementalDocumentsMustView;
  }


  /**
   * supplementalDocumentsMustViewMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings supplementalDocumentsMustViewMetadata(SettingsMetadata supplementalDocumentsMustViewMetadata) {
    this.supplementalDocumentsMustViewMetadata = supplementalDocumentsMustViewMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `supplementalDocumentsMustView` property is editable. .
   * @return supplementalDocumentsMustViewMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `supplementalDocumentsMustView` property is editable. ")
  public SettingsMetadata getSupplementalDocumentsMustViewMetadata() {
    return supplementalDocumentsMustViewMetadata;
  }

  /**
   * setSupplementalDocumentsMustViewMetadata.
   **/
  public void setSupplementalDocumentsMustViewMetadata(SettingsMetadata supplementalDocumentsMustViewMetadata) {
    this.supplementalDocumentsMustViewMetadata = supplementalDocumentsMustViewMetadata;
  }


  /**
   * useNewDocuSignExperienceInterface.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings useNewDocuSignExperienceInterface(String useNewDocuSignExperienceInterface) {
    this.useNewDocuSignExperienceInterface = useNewDocuSignExperienceInterface;
    return this;
  }

  /**
   * .
   * @return useNewDocuSignExperienceInterface
   **/
  @Schema(description = "")
  public String getUseNewDocuSignExperienceInterface() {
    return useNewDocuSignExperienceInterface;
  }

  /**
   * setUseNewDocuSignExperienceInterface.
   **/
  public void setUseNewDocuSignExperienceInterface(String useNewDocuSignExperienceInterface) {
    this.useNewDocuSignExperienceInterface = useNewDocuSignExperienceInterface;
  }


  /**
   * useNewDocuSignExperienceInterfaceMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings useNewDocuSignExperienceInterfaceMetadata(SettingsMetadata useNewDocuSignExperienceInterfaceMetadata) {
    this.useNewDocuSignExperienceInterfaceMetadata = useNewDocuSignExperienceInterfaceMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return useNewDocuSignExperienceInterfaceMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getUseNewDocuSignExperienceInterfaceMetadata() {
    return useNewDocuSignExperienceInterfaceMetadata;
  }

  /**
   * setUseNewDocuSignExperienceInterfaceMetadata.
   **/
  public void setUseNewDocuSignExperienceInterfaceMetadata(SettingsMetadata useNewDocuSignExperienceInterfaceMetadata) {
    this.useNewDocuSignExperienceInterfaceMetadata = useNewDocuSignExperienceInterfaceMetadata;
  }


  /**
   * useNewSendingInterface.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings useNewSendingInterface(String useNewSendingInterface) {
    this.useNewSendingInterface = useNewSendingInterface;
    return this;
  }

  /**
   * .
   * @return useNewSendingInterface
   **/
  @Schema(description = "")
  public String getUseNewSendingInterface() {
    return useNewSendingInterface;
  }

  /**
   * setUseNewSendingInterface.
   **/
  public void setUseNewSendingInterface(String useNewSendingInterface) {
    this.useNewSendingInterface = useNewSendingInterface;
  }


  /**
   * useNewSendingInterfaceMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings useNewSendingInterfaceMetadata(SettingsMetadata useNewSendingInterfaceMetadata) {
    this.useNewSendingInterfaceMetadata = useNewSendingInterfaceMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return useNewSendingInterfaceMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getUseNewSendingInterfaceMetadata() {
    return useNewSendingInterfaceMetadata;
  }

  /**
   * setUseNewSendingInterfaceMetadata.
   **/
  public void setUseNewSendingInterfaceMetadata(SettingsMetadata useNewSendingInterfaceMetadata) {
    this.useNewSendingInterfaceMetadata = useNewSendingInterfaceMetadata;
  }


  /**
   * vaultingMode.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings vaultingMode(String vaultingMode) {
    this.vaultingMode = vaultingMode;
    return this;
  }

  /**
   * .
   * @return vaultingMode
   **/
  @Schema(description = "")
  public String getVaultingMode() {
    return vaultingMode;
  }

  /**
   * setVaultingMode.
   **/
  public void setVaultingMode(String vaultingMode) {
    this.vaultingMode = vaultingMode;
  }


  /**
   * vaultingModeMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings vaultingModeMetadata(SettingsMetadata vaultingModeMetadata) {
    this.vaultingModeMetadata = vaultingModeMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return vaultingModeMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getVaultingModeMetadata() {
    return vaultingModeMetadata;
  }

  /**
   * setVaultingModeMetadata.
   **/
  public void setVaultingModeMetadata(SettingsMetadata vaultingModeMetadata) {
    this.vaultingModeMetadata = vaultingModeMetadata;
  }


  /**
   * webForms.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings webForms(String webForms) {
    this.webForms = webForms;
    return this;
  }

  /**
   * .
   * @return webForms
   **/
  @Schema(description = "")
  public String getWebForms() {
    return webForms;
  }

  /**
   * setWebForms.
   **/
  public void setWebForms(String webForms) {
    this.webForms = webForms;
  }


  /**
   * webFormsMetadata.
   *
   * @return AccountRoleSettings
   **/
  public AccountRoleSettings webFormsMetadata(SettingsMetadata webFormsMetadata) {
    this.webFormsMetadata = webFormsMetadata;
    return this;
  }

  /**
   * .
   * @return webFormsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getWebFormsMetadata() {
    return webFormsMetadata;
  }

  /**
   * setWebFormsMetadata.
   **/
  public void setWebFormsMetadata(SettingsMetadata webFormsMetadata) {
    this.webFormsMetadata = webFormsMetadata;
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
    AccountRoleSettings accountRoleSettings = (AccountRoleSettings) o;
    return Objects.equals(this.accountAgreementsAccessType, accountRoleSettings.accountAgreementsAccessType) &&
        Objects.equals(this.accountAgreementsAccessTypeMetadata, accountRoleSettings.accountAgreementsAccessTypeMetadata) &&
        Objects.equals(this.accountManagementGranular, accountRoleSettings.accountManagementGranular) &&
        Objects.equals(this.allowAccountManagement, accountRoleSettings.allowAccountManagement) &&
        Objects.equals(this.allowAccountManagementMetadata, accountRoleSettings.allowAccountManagementMetadata) &&
        Objects.equals(this.allowApiAccess, accountRoleSettings.allowApiAccess) &&
        Objects.equals(this.allowApiAccessMetadata, accountRoleSettings.allowApiAccessMetadata) &&
        Objects.equals(this.allowApiAccessToAccount, accountRoleSettings.allowApiAccessToAccount) &&
        Objects.equals(this.allowApiAccessToAccountMetadata, accountRoleSettings.allowApiAccessToAccountMetadata) &&
        Objects.equals(this.allowApiSendingOnBehalfOfOthers, accountRoleSettings.allowApiSendingOnBehalfOfOthers) &&
        Objects.equals(this.allowApiSendingOnBehalfOfOthersMetadata, accountRoleSettings.allowApiSendingOnBehalfOfOthersMetadata) &&
        Objects.equals(this.allowApiSequentialSigning, accountRoleSettings.allowApiSequentialSigning) &&
        Objects.equals(this.allowApiSequentialSigningMetadata, accountRoleSettings.allowApiSequentialSigningMetadata) &&
        Objects.equals(this.allowAutoTagging, accountRoleSettings.allowAutoTagging) &&
        Objects.equals(this.allowAutoTaggingMetadata, accountRoleSettings.allowAutoTaggingMetadata) &&
        Objects.equals(this.allowBulkSending, accountRoleSettings.allowBulkSending) &&
        Objects.equals(this.allowBulkSendingMetadata, accountRoleSettings.allowBulkSendingMetadata) &&
        Objects.equals(this.allowDocuSignDesktopClient, accountRoleSettings.allowDocuSignDesktopClient) &&
        Objects.equals(this.allowDocuSignDesktopClientMetadata, accountRoleSettings.allowDocuSignDesktopClientMetadata) &&
        Objects.equals(this.allowedAddressBookAccess, accountRoleSettings.allowedAddressBookAccess) &&
        Objects.equals(this.allowedAddressBookAccessMetadata, accountRoleSettings.allowedAddressBookAccessMetadata) &&
        Objects.equals(this.allowedClickwrapsAccess, accountRoleSettings.allowedClickwrapsAccess) &&
        Objects.equals(this.allowedClickwrapsAccessMetadata, accountRoleSettings.allowedClickwrapsAccessMetadata) &&
        Objects.equals(this.allowedDocumentTemplateLibraryAccess, accountRoleSettings.allowedDocumentTemplateLibraryAccess) &&
        Objects.equals(this.allowedDocumentTemplateLibraryAccessMetadata, accountRoleSettings.allowedDocumentTemplateLibraryAccessMetadata) &&
        Objects.equals(this.allowedOrchestrationAccess, accountRoleSettings.allowedOrchestrationAccess) &&
        Objects.equals(this.allowedOrchestrationAccessMetadata, accountRoleSettings.allowedOrchestrationAccessMetadata) &&
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
        Objects.equals(this.allowTransactions, accountRoleSettings.allowTransactions) &&
        Objects.equals(this.allowTransactionsMetadata, accountRoleSettings.allowTransactionsMetadata) &&
        Objects.equals(this.allowVaulting, accountRoleSettings.allowVaulting) &&
        Objects.equals(this.allowVaultingMetadata, accountRoleSettings.allowVaultingMetadata) &&
        Objects.equals(this.allowWetSigningOverride, accountRoleSettings.allowWetSigningOverride) &&
        Objects.equals(this.allowWetSigningOverrideMetadata, accountRoleSettings.allowWetSigningOverrideMetadata) &&
        Objects.equals(this.canBulkUploadAgreements, accountRoleSettings.canBulkUploadAgreements) &&
        Objects.equals(this.canBulkUploadAgreementsMetadata, accountRoleSettings.canBulkUploadAgreementsMetadata) &&
        Objects.equals(this.canCreateTransaction, accountRoleSettings.canCreateTransaction) &&
        Objects.equals(this.canCreateTransactionMetadata, accountRoleSettings.canCreateTransactionMetadata) &&
        Objects.equals(this.canCreateWorkspaces, accountRoleSettings.canCreateWorkspaces) &&
        Objects.equals(this.canCreateWorkspacesMetadata, accountRoleSettings.canCreateWorkspacesMetadata) &&
        Objects.equals(this.canDeleteDocumentsInTransaction, accountRoleSettings.canDeleteDocumentsInTransaction) &&
        Objects.equals(this.canDeleteDocumentsInTransactionMetadata, accountRoleSettings.canDeleteDocumentsInTransactionMetadata) &&
        Objects.equals(this.canDeleteTransaction, accountRoleSettings.canDeleteTransaction) &&
        Objects.equals(this.canDeleteTransactionMetadata, accountRoleSettings.canDeleteTransactionMetadata) &&
        Objects.equals(this.canManageAgreementDeskRequest, accountRoleSettings.canManageAgreementDeskRequest) &&
        Objects.equals(this.canManageAgreementDeskRequestMetadata, accountRoleSettings.canManageAgreementDeskRequestMetadata) &&
        Objects.equals(this.canManageAgreementDeskRequestSetting, accountRoleSettings.canManageAgreementDeskRequestSetting) &&
        Objects.equals(this.canManageAgreementDeskRequestSettingMetadata, accountRoleSettings.canManageAgreementDeskRequestSettingMetadata) &&
        Objects.equals(this.canSendEnvelopesViaSMS, accountRoleSettings.canSendEnvelopesViaSMS) &&
        Objects.equals(this.canSendEnvelopesViaSMSMetadata, accountRoleSettings.canSendEnvelopesViaSMSMetadata) &&
        Objects.equals(this.disableDocumentUpload, accountRoleSettings.disableDocumentUpload) &&
        Objects.equals(this.disableDocumentUploadMetadata, accountRoleSettings.disableDocumentUploadMetadata) &&
        Objects.equals(this.disableOtherActions, accountRoleSettings.disableOtherActions) &&
        Objects.equals(this.disableOtherActionsMetadata, accountRoleSettings.disableOtherActionsMetadata) &&
        Objects.equals(this.enableApiRequestLogging, accountRoleSettings.enableApiRequestLogging) &&
        Objects.equals(this.enableApiRequestLoggingMetadata, accountRoleSettings.enableApiRequestLoggingMetadata) &&
        Objects.equals(this.enableKeyTermsSuggestionsByDocumentType, accountRoleSettings.enableKeyTermsSuggestionsByDocumentType) &&
        Objects.equals(this.enableKeyTermsSuggestionsByDocumentTypeMetadata, accountRoleSettings.enableKeyTermsSuggestionsByDocumentTypeMetadata) &&
        Objects.equals(this.enableRecipientViewingNotifications, accountRoleSettings.enableRecipientViewingNotifications) &&
        Objects.equals(this.enableRecipientViewingNotificationsMetadata, accountRoleSettings.enableRecipientViewingNotificationsMetadata) &&
        Objects.equals(this.enableSequentialSigningInterface, accountRoleSettings.enableSequentialSigningInterface) &&
        Objects.equals(this.enableSequentialSigningInterfaceMetadata, accountRoleSettings.enableSequentialSigningInterfaceMetadata) &&
        Objects.equals(this.enableTransactionPointIntegration, accountRoleSettings.enableTransactionPointIntegration) &&
        Objects.equals(this.enableTransactionPointIntegrationMetadata, accountRoleSettings.enableTransactionPointIntegrationMetadata) &&
        Objects.equals(this.playbookAccess, accountRoleSettings.playbookAccess) &&
        Objects.equals(this.playbookAccessMetadata, accountRoleSettings.playbookAccessMetadata) &&
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
        Objects.equals(this.vaultingModeMetadata, accountRoleSettings.vaultingModeMetadata) &&
        Objects.equals(this.webForms, accountRoleSettings.webForms) &&
        Objects.equals(this.webFormsMetadata, accountRoleSettings.webFormsMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountAgreementsAccessType, accountAgreementsAccessTypeMetadata, accountManagementGranular, allowAccountManagement, allowAccountManagementMetadata, allowApiAccess, allowApiAccessMetadata, allowApiAccessToAccount, allowApiAccessToAccountMetadata, allowApiSendingOnBehalfOfOthers, allowApiSendingOnBehalfOfOthersMetadata, allowApiSequentialSigning, allowApiSequentialSigningMetadata, allowAutoTagging, allowAutoTaggingMetadata, allowBulkSending, allowBulkSendingMetadata, allowDocuSignDesktopClient, allowDocuSignDesktopClientMetadata, allowedAddressBookAccess, allowedAddressBookAccessMetadata, allowedClickwrapsAccess, allowedClickwrapsAccessMetadata, allowedDocumentTemplateLibraryAccess, allowedDocumentTemplateLibraryAccessMetadata, allowedOrchestrationAccess, allowedOrchestrationAccessMetadata, allowedTemplateAccess, allowedTemplateAccessMetadata, allowedToBeEnvelopeTransferRecipient, allowedToBeEnvelopeTransferRecipientMetadata, allowEnvelopeSending, allowEnvelopeSendingMetadata, allowESealRecipients, allowESealRecipientsMetadata, allowPowerFormsAdminToAccessAllPowerFormEnvelopes, allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata, allowSendersToSetRecipientEmailLanguage, allowSendersToSetRecipientEmailLanguageMetadata, allowSignerAttachments, allowSignerAttachmentsMetadata, allowSupplementalDocuments, allowSupplementalDocumentsMetadata, allowTaggingInSendAndCorrect, allowTaggingInSendAndCorrectMetadata, allowTransactions, allowTransactionsMetadata, allowVaulting, allowVaultingMetadata, allowWetSigningOverride, allowWetSigningOverrideMetadata, canBulkUploadAgreements, canBulkUploadAgreementsMetadata, canCreateTransaction, canCreateTransactionMetadata, canCreateWorkspaces, canCreateWorkspacesMetadata, canDeleteDocumentsInTransaction, canDeleteDocumentsInTransactionMetadata, canDeleteTransaction, canDeleteTransactionMetadata, canManageAgreementDeskRequest, canManageAgreementDeskRequestMetadata, canManageAgreementDeskRequestSetting, canManageAgreementDeskRequestSettingMetadata, canSendEnvelopesViaSMS, canSendEnvelopesViaSMSMetadata, disableDocumentUpload, disableDocumentUploadMetadata, disableOtherActions, disableOtherActionsMetadata, enableApiRequestLogging, enableApiRequestLoggingMetadata, enableKeyTermsSuggestionsByDocumentType, enableKeyTermsSuggestionsByDocumentTypeMetadata, enableRecipientViewingNotifications, enableRecipientViewingNotificationsMetadata, enableSequentialSigningInterface, enableSequentialSigningInterfaceMetadata, enableTransactionPointIntegration, enableTransactionPointIntegrationMetadata, playbookAccess, playbookAccessMetadata, powerFormRole, powerFormRoleMetadata, receiveCompletedSelfSignedDocumentsAsEmailLinks, receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata, signingUiVersionMetadata, supplementalDocumentsMustAccept, supplementalDocumentsMustAcceptMetadata, supplementalDocumentsMustRead, supplementalDocumentsMustReadMetadata, supplementalDocumentsMustView, supplementalDocumentsMustViewMetadata, useNewDocuSignExperienceInterface, useNewDocuSignExperienceInterfaceMetadata, useNewSendingInterface, useNewSendingInterfaceMetadata, vaultingMode, vaultingModeMetadata, webForms, webFormsMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRoleSettings {\n");
    
    sb.append("    accountAgreementsAccessType: ").append(toIndentedString(accountAgreementsAccessType)).append("\n");
    sb.append("    accountAgreementsAccessTypeMetadata: ").append(toIndentedString(accountAgreementsAccessTypeMetadata)).append("\n");
    sb.append("    accountManagementGranular: ").append(toIndentedString(accountManagementGranular)).append("\n");
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
    sb.append("    allowAutoTagging: ").append(toIndentedString(allowAutoTagging)).append("\n");
    sb.append("    allowAutoTaggingMetadata: ").append(toIndentedString(allowAutoTaggingMetadata)).append("\n");
    sb.append("    allowBulkSending: ").append(toIndentedString(allowBulkSending)).append("\n");
    sb.append("    allowBulkSendingMetadata: ").append(toIndentedString(allowBulkSendingMetadata)).append("\n");
    sb.append("    allowDocuSignDesktopClient: ").append(toIndentedString(allowDocuSignDesktopClient)).append("\n");
    sb.append("    allowDocuSignDesktopClientMetadata: ").append(toIndentedString(allowDocuSignDesktopClientMetadata)).append("\n");
    sb.append("    allowedAddressBookAccess: ").append(toIndentedString(allowedAddressBookAccess)).append("\n");
    sb.append("    allowedAddressBookAccessMetadata: ").append(toIndentedString(allowedAddressBookAccessMetadata)).append("\n");
    sb.append("    allowedClickwrapsAccess: ").append(toIndentedString(allowedClickwrapsAccess)).append("\n");
    sb.append("    allowedClickwrapsAccessMetadata: ").append(toIndentedString(allowedClickwrapsAccessMetadata)).append("\n");
    sb.append("    allowedDocumentTemplateLibraryAccess: ").append(toIndentedString(allowedDocumentTemplateLibraryAccess)).append("\n");
    sb.append("    allowedDocumentTemplateLibraryAccessMetadata: ").append(toIndentedString(allowedDocumentTemplateLibraryAccessMetadata)).append("\n");
    sb.append("    allowedOrchestrationAccess: ").append(toIndentedString(allowedOrchestrationAccess)).append("\n");
    sb.append("    allowedOrchestrationAccessMetadata: ").append(toIndentedString(allowedOrchestrationAccessMetadata)).append("\n");
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
    sb.append("    allowTransactions: ").append(toIndentedString(allowTransactions)).append("\n");
    sb.append("    allowTransactionsMetadata: ").append(toIndentedString(allowTransactionsMetadata)).append("\n");
    sb.append("    allowVaulting: ").append(toIndentedString(allowVaulting)).append("\n");
    sb.append("    allowVaultingMetadata: ").append(toIndentedString(allowVaultingMetadata)).append("\n");
    sb.append("    allowWetSigningOverride: ").append(toIndentedString(allowWetSigningOverride)).append("\n");
    sb.append("    allowWetSigningOverrideMetadata: ").append(toIndentedString(allowWetSigningOverrideMetadata)).append("\n");
    sb.append("    canBulkUploadAgreements: ").append(toIndentedString(canBulkUploadAgreements)).append("\n");
    sb.append("    canBulkUploadAgreementsMetadata: ").append(toIndentedString(canBulkUploadAgreementsMetadata)).append("\n");
    sb.append("    canCreateTransaction: ").append(toIndentedString(canCreateTransaction)).append("\n");
    sb.append("    canCreateTransactionMetadata: ").append(toIndentedString(canCreateTransactionMetadata)).append("\n");
    sb.append("    canCreateWorkspaces: ").append(toIndentedString(canCreateWorkspaces)).append("\n");
    sb.append("    canCreateWorkspacesMetadata: ").append(toIndentedString(canCreateWorkspacesMetadata)).append("\n");
    sb.append("    canDeleteDocumentsInTransaction: ").append(toIndentedString(canDeleteDocumentsInTransaction)).append("\n");
    sb.append("    canDeleteDocumentsInTransactionMetadata: ").append(toIndentedString(canDeleteDocumentsInTransactionMetadata)).append("\n");
    sb.append("    canDeleteTransaction: ").append(toIndentedString(canDeleteTransaction)).append("\n");
    sb.append("    canDeleteTransactionMetadata: ").append(toIndentedString(canDeleteTransactionMetadata)).append("\n");
    sb.append("    canManageAgreementDeskRequest: ").append(toIndentedString(canManageAgreementDeskRequest)).append("\n");
    sb.append("    canManageAgreementDeskRequestMetadata: ").append(toIndentedString(canManageAgreementDeskRequestMetadata)).append("\n");
    sb.append("    canManageAgreementDeskRequestSetting: ").append(toIndentedString(canManageAgreementDeskRequestSetting)).append("\n");
    sb.append("    canManageAgreementDeskRequestSettingMetadata: ").append(toIndentedString(canManageAgreementDeskRequestSettingMetadata)).append("\n");
    sb.append("    canSendEnvelopesViaSMS: ").append(toIndentedString(canSendEnvelopesViaSMS)).append("\n");
    sb.append("    canSendEnvelopesViaSMSMetadata: ").append(toIndentedString(canSendEnvelopesViaSMSMetadata)).append("\n");
    sb.append("    disableDocumentUpload: ").append(toIndentedString(disableDocumentUpload)).append("\n");
    sb.append("    disableDocumentUploadMetadata: ").append(toIndentedString(disableDocumentUploadMetadata)).append("\n");
    sb.append("    disableOtherActions: ").append(toIndentedString(disableOtherActions)).append("\n");
    sb.append("    disableOtherActionsMetadata: ").append(toIndentedString(disableOtherActionsMetadata)).append("\n");
    sb.append("    enableApiRequestLogging: ").append(toIndentedString(enableApiRequestLogging)).append("\n");
    sb.append("    enableApiRequestLoggingMetadata: ").append(toIndentedString(enableApiRequestLoggingMetadata)).append("\n");
    sb.append("    enableKeyTermsSuggestionsByDocumentType: ").append(toIndentedString(enableKeyTermsSuggestionsByDocumentType)).append("\n");
    sb.append("    enableKeyTermsSuggestionsByDocumentTypeMetadata: ").append(toIndentedString(enableKeyTermsSuggestionsByDocumentTypeMetadata)).append("\n");
    sb.append("    enableRecipientViewingNotifications: ").append(toIndentedString(enableRecipientViewingNotifications)).append("\n");
    sb.append("    enableRecipientViewingNotificationsMetadata: ").append(toIndentedString(enableRecipientViewingNotificationsMetadata)).append("\n");
    sb.append("    enableSequentialSigningInterface: ").append(toIndentedString(enableSequentialSigningInterface)).append("\n");
    sb.append("    enableSequentialSigningInterfaceMetadata: ").append(toIndentedString(enableSequentialSigningInterfaceMetadata)).append("\n");
    sb.append("    enableTransactionPointIntegration: ").append(toIndentedString(enableTransactionPointIntegration)).append("\n");
    sb.append("    enableTransactionPointIntegrationMetadata: ").append(toIndentedString(enableTransactionPointIntegrationMetadata)).append("\n");
    sb.append("    playbookAccess: ").append(toIndentedString(playbookAccess)).append("\n");
    sb.append("    playbookAccessMetadata: ").append(toIndentedString(playbookAccessMetadata)).append("\n");
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
    sb.append("    webForms: ").append(toIndentedString(webForms)).append("\n");
    sb.append("    webFormsMetadata: ").append(toIndentedString(webFormsMetadata)).append("\n");
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

