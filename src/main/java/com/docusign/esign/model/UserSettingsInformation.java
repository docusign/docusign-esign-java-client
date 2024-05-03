package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.LocalePolicy;
import com.docusign.esign.model.SealIdentifier;
import com.docusign.esign.model.SenderEmailNotifications;
import com.docusign.esign.model.SettingsMetadata;
import com.docusign.esign.model.SignerEmailNotifications;
import com.docusign.esign.model.UserAccountManagementGranularInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Properties that configure the settings for a user. Some elements of this object have a &#x60;metadata&#x60; property, which includes the following: - &#x60;rights&#x60;: The calling users permissions to edit this setting (can be &#x60;editable&#x60; or &#x60;read_only&#x60;) - &#x60;uiHint&#x60;: Internally used to build UIs (can be &#x60;available&#x60; or &#x60;hidden&#x60;) - &#x60;options&#x60;: The values supported for this setting (not all settings have this element).
 *
 */
@Schema(description = "Properties that configure the settings for a user. Some elements of this object have a `metadata` property, which includes the following: - `rights`: The calling users permissions to edit this setting (can be `editable` or `read_only`) - `uiHint`: Internally used to build UIs (can be `available` or `hidden`) - `options`: The values supported for this setting (not all settings have this element)")

public class UserSettingsInformation {
  @JsonProperty("accountAgreementsAccessType")
  private String accountAgreementsAccessType = null;

  @JsonProperty("accountAgreementsAccessTypeMetadata")
  private SettingsMetadata accountAgreementsAccessTypeMetadata = null;

  @JsonProperty("accountManagementGranular")
  private UserAccountManagementGranularInformation accountManagementGranular = null;

  @JsonProperty("adminOnly")
  private String adminOnly = null;

  @JsonProperty("adminOnlyMetadata")
  private SettingsMetadata adminOnlyMetadata = null;

  @JsonProperty("allowAccessToAllAccountAgreements")
  private String allowAccessToAllAccountAgreements = null;

  @JsonProperty("allowAccessToAllAccountAgreementsMetadata")
  private SettingsMetadata allowAccessToAllAccountAgreementsMetadata = null;

  @JsonProperty("allowAutoTagging")
  private String allowAutoTagging = null;

  @JsonProperty("allowedOrchestrationAccess")
  private String allowedOrchestrationAccess = null;

  @JsonProperty("allowedOrchestrationAccessMetadata")
  private SettingsMetadata allowedOrchestrationAccessMetadata = null;

  @JsonProperty("allowEnvelopeTransferTo")
  private String allowEnvelopeTransferTo = null;

  @JsonProperty("allowEnvelopeTransferToMetadata")
  private SettingsMetadata allowEnvelopeTransferToMetadata = null;

  @JsonProperty("allowEsealRecipients")
  private String allowEsealRecipients = null;

  @JsonProperty("allowEsealRecipientsMetadata")
  private SettingsMetadata allowEsealRecipientsMetadata = null;

  @JsonProperty("allowPowerFormsAdminToAccessAllPowerFormEnvelope")
  private String allowPowerFormsAdminToAccessAllPowerFormEnvelope = null;

  @JsonProperty("allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata")
  private SettingsMetadata allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata = null;

  @JsonProperty("allowRecipientLanguageSelection")
  private String allowRecipientLanguageSelection = null;

  @JsonProperty("allowRecipientLanguageSelectionMetadata")
  private SettingsMetadata allowRecipientLanguageSelectionMetadata = null;

  @JsonProperty("allowSendOnBehalfOf")
  private String allowSendOnBehalfOf = null;

  @JsonProperty("allowSendOnBehalfOfMetadata")
  private SettingsMetadata allowSendOnBehalfOfMetadata = null;

  @JsonProperty("allowSupplementalDocuments")
  private String allowSupplementalDocuments = null;

  @JsonProperty("allowSupplementalDocumentsMetadata")
  private SettingsMetadata allowSupplementalDocumentsMetadata = null;

  @JsonProperty("allowTransactions")
  private String allowTransactions = null;

  @JsonProperty("allowTransactionsMetadata")
  private SettingsMetadata allowTransactionsMetadata = null;

  @JsonProperty("anchorTagVersionedPlacementEnabled")
  private String anchorTagVersionedPlacementEnabled = null;

  @JsonProperty("apiAccountWideAccess")
  private String apiAccountWideAccess = null;

  @JsonProperty("apiAccountWideAccessMetadata")
  private SettingsMetadata apiAccountWideAccessMetadata = null;

  @JsonProperty("apiCanExportAC")
  private String apiCanExportAC = null;

  @JsonProperty("apiCanExportACMetadata")
  private SettingsMetadata apiCanExportACMetadata = null;

  @JsonProperty("bulkSend")
  private String bulkSend = null;

  @JsonProperty("bulkSendMetadata")
  private SettingsMetadata bulkSendMetadata = null;

  @JsonProperty("canBulkUploadAgreements")
  private String canBulkUploadAgreements = null;

  @JsonProperty("canBulkUploadAgreementsMetadata")
  private SettingsMetadata canBulkUploadAgreementsMetadata = null;

  @JsonProperty("canChargeAccount")
  private String canChargeAccount = null;

  @JsonProperty("canChargeAccountMetadata")
  private SettingsMetadata canChargeAccountMetadata = null;

  @JsonProperty("canCreateTransaction")
  private String canCreateTransaction = null;

  @JsonProperty("canCreateTransactionMetadata")
  private SettingsMetadata canCreateTransactionMetadata = null;

  @JsonProperty("canDeleteDocumentsInTransaction")
  private String canDeleteDocumentsInTransaction = null;

  @JsonProperty("canDeleteDocumentsInTransactionMetadata")
  private SettingsMetadata canDeleteDocumentsInTransactionMetadata = null;

  @JsonProperty("canDeleteTransaction")
  private String canDeleteTransaction = null;

  @JsonProperty("canDeleteTransactionMetadata")
  private SettingsMetadata canDeleteTransactionMetadata = null;

  @JsonProperty("canEditSharedAddressbook")
  private String canEditSharedAddressbook = null;

  @JsonProperty("canEditSharedAddressbookMetadata")
  private SettingsMetadata canEditSharedAddressbookMetadata = null;

  @JsonProperty("canLockEnvelopes")
  private String canLockEnvelopes = null;

  @JsonProperty("canLockEnvelopesMetadata")
  private SettingsMetadata canLockEnvelopesMetadata = null;

  @JsonProperty("canManageAccount")
  private String canManageAccount = null;

  @JsonProperty("canManageAccountMetadata")
  private SettingsMetadata canManageAccountMetadata = null;

  @JsonProperty("canManageAgreementParties")
  private String canManageAgreementParties = null;

  @JsonProperty("canManageAgreementPartiesMetadata")
  private SettingsMetadata canManageAgreementPartiesMetadata = null;

  @JsonProperty("canManageDistributor")
  private String canManageDistributor = null;

  @JsonProperty("canManageDistributorMetadata")
  private SettingsMetadata canManageDistributorMetadata = null;

  @JsonProperty("canManageTemplates")
  private String canManageTemplates = null;

  @JsonProperty("canManageTemplatesMetadata")
  private SettingsMetadata canManageTemplatesMetadata = null;

  @JsonProperty("canSendAPIRequests")
  private String canSendAPIRequests = null;

  @JsonProperty("canSendAPIRequestsMetadata")
  private SettingsMetadata canSendAPIRequestsMetadata = null;

  @JsonProperty("canSendEnvelope")
  private String canSendEnvelope = null;

  @JsonProperty("canSendEnvelopeMetadata")
  private SettingsMetadata canSendEnvelopeMetadata = null;

  @JsonProperty("canSendEnvelopesViaSMS")
  private String canSendEnvelopesViaSMS = null;

  @JsonProperty("canSendEnvelopesViaSMSMetadata")
  private SettingsMetadata canSendEnvelopesViaSMSMetadata = null;

  @JsonProperty("canSignEnvelope")
  private String canSignEnvelope = null;

  @JsonProperty("canSignEnvelopeMetadata")
  private SettingsMetadata canSignEnvelopeMetadata = null;

  @JsonProperty("canUseScratchpad")
  private String canUseScratchpad = null;

  @JsonProperty("canUseScratchpadMetadata")
  private SettingsMetadata canUseScratchpadMetadata = null;

  @JsonProperty("canUseSmartContracts")
  private String canUseSmartContracts = null;

  @JsonProperty("canUseSmartContractsMetadata")
  private SettingsMetadata canUseSmartContractsMetadata = null;

  @JsonProperty("disableDocumentUpload")
  private String disableDocumentUpload = null;

  @JsonProperty("disableDocumentUploadMetadata")
  private SettingsMetadata disableDocumentUploadMetadata = null;

  @JsonProperty("disableOtherActions")
  private String disableOtherActions = null;

  @JsonProperty("disableOtherActionsMetadata")
  private SettingsMetadata disableOtherActionsMetadata = null;

  @JsonProperty("enableDSPro")
  private String enableDSPro = null;

  @JsonProperty("enableDSProMetadata")
  private SettingsMetadata enableDSProMetadata = null;

  @JsonProperty("enableKeyTermsSuggestionsByDocumentType")
  private String enableKeyTermsSuggestionsByDocumentType = null;

  @JsonProperty("enableKeyTermsSuggestionsByDocumentTypeMetadata")
  private SettingsMetadata enableKeyTermsSuggestionsByDocumentTypeMetadata = null;

  @JsonProperty("enableSequentialSigningAPI")
  private String enableSequentialSigningAPI = null;

  @JsonProperty("enableSequentialSigningAPIMetadata")
  private SettingsMetadata enableSequentialSigningAPIMetadata = null;

  @JsonProperty("enableSequentialSigningUI")
  private String enableSequentialSigningUI = null;

  @JsonProperty("enableSequentialSigningUIMetadata")
  private SettingsMetadata enableSequentialSigningUIMetadata = null;

  @JsonProperty("enableSignerAttachments")
  private String enableSignerAttachments = null;

  @JsonProperty("enableSignerAttachmentsMetadata")
  private SettingsMetadata enableSignerAttachmentsMetadata = null;

  @JsonProperty("enableSignOnPaperOverride")
  private String enableSignOnPaperOverride = null;

  @JsonProperty("enableSignOnPaperOverrideMetadata")
  private SettingsMetadata enableSignOnPaperOverrideMetadata = null;

  @JsonProperty("enableTransactionPoint")
  private String enableTransactionPoint = null;

  @JsonProperty("enableTransactionPointMetadata")
  private SettingsMetadata enableTransactionPointMetadata = null;

  @JsonProperty("enableVaulting")
  private String enableVaulting = null;

  @JsonProperty("enableVaultingMetadata")
  private SettingsMetadata enableVaultingMetadata = null;

  @JsonProperty("expressSendOnly")
  private String expressSendOnly = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("localeMetadata")
  private SettingsMetadata localeMetadata = null;

  @JsonProperty("localePolicy")
  private LocalePolicy localePolicy = null;

  @JsonProperty("manageClickwrapsMode")
  private String manageClickwrapsMode = null;

  @JsonProperty("manageClickwrapsModeMetadata")
  private SettingsMetadata manageClickwrapsModeMetadata = null;

  @JsonProperty("modifiedBy")
  private String modifiedBy = null;

  @JsonProperty("modifiedByMetadata")
  private SettingsMetadata modifiedByMetadata = null;

  @JsonProperty("modifiedDate")
  private String modifiedDate = null;

  @JsonProperty("modifiedDateMetadata")
  private SettingsMetadata modifiedDateMetadata = null;

  @JsonProperty("modifiedPage")
  private String modifiedPage = null;

  @JsonProperty("modifiedPageMetadata")
  private SettingsMetadata modifiedPageMetadata = null;

  @JsonProperty("newSendUI")
  private String newSendUI = null;

  @JsonProperty("newSendUIMetadata")
  private SettingsMetadata newSendUIMetadata = null;

  @JsonProperty("powerFormMode")
  private String powerFormMode = null;

  @JsonProperty("powerFormModeMetadata")
  private SettingsMetadata powerFormModeMetadata = null;

  @JsonProperty("recipientViewedNotification")
  private String recipientViewedNotification = null;

  @JsonProperty("recipientViewedNotificationMetadata")
  private SettingsMetadata recipientViewedNotificationMetadata = null;

  @JsonProperty("sealIdentifiers")
  private java.util.List<SealIdentifier> sealIdentifiers = null;

  @JsonProperty("selfSignedRecipientEmailDocument")
  private String selfSignedRecipientEmailDocument = null;

  @JsonProperty("selfSignedRecipientEmailDocumentMetadata")
  private SettingsMetadata selfSignedRecipientEmailDocumentMetadata = null;

  @JsonProperty("senderEmailNotifications")
  private SenderEmailNotifications senderEmailNotifications = null;

  @JsonProperty("signerEmailNotifications")
  private SignerEmailNotifications signerEmailNotifications = null;

  @JsonProperty("supplementalDocumentIncludeInDownload")
  private String supplementalDocumentIncludeInDownload = null;

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

  @JsonProperty("templateActiveCreation")
  private String templateActiveCreation = null;

  @JsonProperty("templateActiveCreationMetadata")
  private SettingsMetadata templateActiveCreationMetadata = null;

  @JsonProperty("templateApplyNotify")
  private String templateApplyNotify = null;

  @JsonProperty("templateApplyNotifyMetadata")
  private SettingsMetadata templateApplyNotifyMetadata = null;

  @JsonProperty("templateAutoMatching")
  private String templateAutoMatching = null;

  @JsonProperty("templateAutoMatchingMetadata")
  private SettingsMetadata templateAutoMatchingMetadata = null;

  @JsonProperty("templateMatchingSensitivity")
  private String templateMatchingSensitivity = null;

  @JsonProperty("templateMatchingSensitivityMetadata")
  private SettingsMetadata templateMatchingSensitivityMetadata = null;

  @JsonProperty("templatePageLevelMatching")
  private String templatePageLevelMatching = null;

  @JsonProperty("templatePageLevelMatchingMetadata")
  private SettingsMetadata templatePageLevelMatchingMetadata = null;

  @JsonProperty("timezoneDST")
  private String timezoneDST = null;

  @JsonProperty("timezoneDSTMetadata")
  private SettingsMetadata timezoneDSTMetadata = null;

  @JsonProperty("timezoneMask")
  private String timezoneMask = null;

  @JsonProperty("timezoneMaskMetadata")
  private SettingsMetadata timezoneMaskMetadata = null;

  @JsonProperty("timezoneOffset")
  private String timezoneOffset = null;

  @JsonProperty("timezoneOffsetMetadata")
  private SettingsMetadata timezoneOffsetMetadata = null;

  @JsonProperty("timezoneSendingPref")
  private String timezoneSendingPref = null;

  @JsonProperty("timezoneSendingPrefMetadata")
  private SettingsMetadata timezoneSendingPrefMetadata = null;

  @JsonProperty("timezoneSigningPref")
  private String timezoneSigningPref = null;

  @JsonProperty("timezoneSigningPrefMetadata")
  private SettingsMetadata timezoneSigningPrefMetadata = null;

  @JsonProperty("transactionPointSiteNameURL")
  private String transactionPointSiteNameURL = null;

  @JsonProperty("transactionPointSiteNameURLMetadata")
  private SettingsMetadata transactionPointSiteNameURLMetadata = null;

  @JsonProperty("transactionPointUserName")
  private String transactionPointUserName = null;

  @JsonProperty("transactionPointUserNameMetadata")
  private SettingsMetadata transactionPointUserNameMetadata = null;

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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation accountAgreementsAccessType(String accountAgreementsAccessType) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation accountAgreementsAccessTypeMetadata(SettingsMetadata accountAgreementsAccessTypeMetadata) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation accountManagementGranular(UserAccountManagementGranularInformation accountManagementGranular) {
    this.accountManagementGranular = accountManagementGranular;
    return this;
  }

  /**
   * Describes which account management capabilities a user has..
   * @return accountManagementGranular
   **/
  @Schema(description = "Describes which account management capabilities a user has.")
  public UserAccountManagementGranularInformation getAccountManagementGranular() {
    return accountManagementGranular;
  }

  /**
   * setAccountManagementGranular.
   **/
  public void setAccountManagementGranular(UserAccountManagementGranularInformation accountManagementGranular) {
    this.accountManagementGranular = accountManagementGranular;
  }


  /**
   * adminOnly.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation adminOnly(String adminOnly) {
    this.adminOnly = adminOnly;
    return this;
  }

  /**
   * .
   * @return adminOnly
   **/
  @Schema(description = "")
  public String getAdminOnly() {
    return adminOnly;
  }

  /**
   * setAdminOnly.
   **/
  public void setAdminOnly(String adminOnly) {
    this.adminOnly = adminOnly;
  }


  /**
   * adminOnlyMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation adminOnlyMetadata(SettingsMetadata adminOnlyMetadata) {
    this.adminOnlyMetadata = adminOnlyMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return adminOnlyMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getAdminOnlyMetadata() {
    return adminOnlyMetadata;
  }

  /**
   * setAdminOnlyMetadata.
   **/
  public void setAdminOnlyMetadata(SettingsMetadata adminOnlyMetadata) {
    this.adminOnlyMetadata = adminOnlyMetadata;
  }


  /**
   * allowAccessToAllAccountAgreements.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowAccessToAllAccountAgreements(String allowAccessToAllAccountAgreements) {
    this.allowAccessToAllAccountAgreements = allowAccessToAllAccountAgreements;
    return this;
  }

  /**
   * .
   * @return allowAccessToAllAccountAgreements
   **/
  @Schema(description = "")
  public String getAllowAccessToAllAccountAgreements() {
    return allowAccessToAllAccountAgreements;
  }

  /**
   * setAllowAccessToAllAccountAgreements.
   **/
  public void setAllowAccessToAllAccountAgreements(String allowAccessToAllAccountAgreements) {
    this.allowAccessToAllAccountAgreements = allowAccessToAllAccountAgreements;
  }


  /**
   * allowAccessToAllAccountAgreementsMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowAccessToAllAccountAgreementsMetadata(SettingsMetadata allowAccessToAllAccountAgreementsMetadata) {
    this.allowAccessToAllAccountAgreementsMetadata = allowAccessToAllAccountAgreementsMetadata;
    return this;
  }

  /**
   * .
   * @return allowAccessToAllAccountAgreementsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowAccessToAllAccountAgreementsMetadata() {
    return allowAccessToAllAccountAgreementsMetadata;
  }

  /**
   * setAllowAccessToAllAccountAgreementsMetadata.
   **/
  public void setAllowAccessToAllAccountAgreementsMetadata(SettingsMetadata allowAccessToAllAccountAgreementsMetadata) {
    this.allowAccessToAllAccountAgreementsMetadata = allowAccessToAllAccountAgreementsMetadata;
  }


  /**
   * allowAutoTagging.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowAutoTagging(String allowAutoTagging) {
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
   * allowedOrchestrationAccess.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowedOrchestrationAccess(String allowedOrchestrationAccess) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowedOrchestrationAccessMetadata(SettingsMetadata allowedOrchestrationAccessMetadata) {
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
   * allowEnvelopeTransferTo.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowEnvelopeTransferTo(String allowEnvelopeTransferTo) {
    this.allowEnvelopeTransferTo = allowEnvelopeTransferTo;
    return this;
  }

  /**
   * .
   * @return allowEnvelopeTransferTo
   **/
  @Schema(description = "")
  public String getAllowEnvelopeTransferTo() {
    return allowEnvelopeTransferTo;
  }

  /**
   * setAllowEnvelopeTransferTo.
   **/
  public void setAllowEnvelopeTransferTo(String allowEnvelopeTransferTo) {
    this.allowEnvelopeTransferTo = allowEnvelopeTransferTo;
  }


  /**
   * allowEnvelopeTransferToMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowEnvelopeTransferToMetadata(SettingsMetadata allowEnvelopeTransferToMetadata) {
    this.allowEnvelopeTransferToMetadata = allowEnvelopeTransferToMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return allowEnvelopeTransferToMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getAllowEnvelopeTransferToMetadata() {
    return allowEnvelopeTransferToMetadata;
  }

  /**
   * setAllowEnvelopeTransferToMetadata.
   **/
  public void setAllowEnvelopeTransferToMetadata(SettingsMetadata allowEnvelopeTransferToMetadata) {
    this.allowEnvelopeTransferToMetadata = allowEnvelopeTransferToMetadata;
  }


  /**
   * allowEsealRecipients.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowEsealRecipients(String allowEsealRecipients) {
    this.allowEsealRecipients = allowEsealRecipients;
    return this;
  }

  /**
   * .
   * @return allowEsealRecipients
   **/
  @Schema(description = "")
  public String getAllowEsealRecipients() {
    return allowEsealRecipients;
  }

  /**
   * setAllowEsealRecipients.
   **/
  public void setAllowEsealRecipients(String allowEsealRecipients) {
    this.allowEsealRecipients = allowEsealRecipients;
  }


  /**
   * allowEsealRecipientsMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowEsealRecipientsMetadata(SettingsMetadata allowEsealRecipientsMetadata) {
    this.allowEsealRecipientsMetadata = allowEsealRecipientsMetadata;
    return this;
  }

  /**
   * Metadata about the `allowEsealRecipientsMetadata` property..
   * @return allowEsealRecipientsMetadata
   **/
  @Schema(description = "Metadata about the `allowEsealRecipientsMetadata` property.")
  public SettingsMetadata getAllowEsealRecipientsMetadata() {
    return allowEsealRecipientsMetadata;
  }

  /**
   * setAllowEsealRecipientsMetadata.
   **/
  public void setAllowEsealRecipientsMetadata(SettingsMetadata allowEsealRecipientsMetadata) {
    this.allowEsealRecipientsMetadata = allowEsealRecipientsMetadata;
  }


  /**
   * allowPowerFormsAdminToAccessAllPowerFormEnvelope.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowPowerFormsAdminToAccessAllPowerFormEnvelope(String allowPowerFormsAdminToAccessAllPowerFormEnvelope) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelope = allowPowerFormsAdminToAccessAllPowerFormEnvelope;
    return this;
  }

  /**
   * .
   * @return allowPowerFormsAdminToAccessAllPowerFormEnvelope
   **/
  @Schema(description = "")
  public String getAllowPowerFormsAdminToAccessAllPowerFormEnvelope() {
    return allowPowerFormsAdminToAccessAllPowerFormEnvelope;
  }

  /**
   * setAllowPowerFormsAdminToAccessAllPowerFormEnvelope.
   **/
  public void setAllowPowerFormsAdminToAccessAllPowerFormEnvelope(String allowPowerFormsAdminToAccessAllPowerFormEnvelope) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelope = allowPowerFormsAdminToAccessAllPowerFormEnvelope;
  }


  /**
   * allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata(SettingsMetadata allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata = allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata;
    return this;
  }

  /**
   * Metadata about the `allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata` property..
   * @return allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata
   **/
  @Schema(description = "Metadata about the `allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata` property.")
  public SettingsMetadata getAllowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata() {
    return allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata;
  }

  /**
   * setAllowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata.
   **/
  public void setAllowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata(SettingsMetadata allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata = allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata;
  }


  /**
   * allowRecipientLanguageSelection.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowRecipientLanguageSelection(String allowRecipientLanguageSelection) {
    this.allowRecipientLanguageSelection = allowRecipientLanguageSelection;
    return this;
  }

  /**
   * .
   * @return allowRecipientLanguageSelection
   **/
  @Schema(description = "")
  public String getAllowRecipientLanguageSelection() {
    return allowRecipientLanguageSelection;
  }

  /**
   * setAllowRecipientLanguageSelection.
   **/
  public void setAllowRecipientLanguageSelection(String allowRecipientLanguageSelection) {
    this.allowRecipientLanguageSelection = allowRecipientLanguageSelection;
  }


  /**
   * allowRecipientLanguageSelectionMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowRecipientLanguageSelectionMetadata(SettingsMetadata allowRecipientLanguageSelectionMetadata) {
    this.allowRecipientLanguageSelectionMetadata = allowRecipientLanguageSelectionMetadata;
    return this;
  }

  /**
   * Metadata for allowRecipientLanguageSelection..
   * @return allowRecipientLanguageSelectionMetadata
   **/
  @Schema(description = "Metadata for allowRecipientLanguageSelection.")
  public SettingsMetadata getAllowRecipientLanguageSelectionMetadata() {
    return allowRecipientLanguageSelectionMetadata;
  }

  /**
   * setAllowRecipientLanguageSelectionMetadata.
   **/
  public void setAllowRecipientLanguageSelectionMetadata(SettingsMetadata allowRecipientLanguageSelectionMetadata) {
    this.allowRecipientLanguageSelectionMetadata = allowRecipientLanguageSelectionMetadata;
  }


  /**
   * allowSendOnBehalfOf.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowSendOnBehalfOf(String allowSendOnBehalfOf) {
    this.allowSendOnBehalfOf = allowSendOnBehalfOf;
    return this;
  }

  /**
   * .
   * @return allowSendOnBehalfOf
   **/
  @Schema(description = "")
  public String getAllowSendOnBehalfOf() {
    return allowSendOnBehalfOf;
  }

  /**
   * setAllowSendOnBehalfOf.
   **/
  public void setAllowSendOnBehalfOf(String allowSendOnBehalfOf) {
    this.allowSendOnBehalfOf = allowSendOnBehalfOf;
  }


  /**
   * allowSendOnBehalfOfMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowSendOnBehalfOfMetadata(SettingsMetadata allowSendOnBehalfOfMetadata) {
    this.allowSendOnBehalfOfMetadata = allowSendOnBehalfOfMetadata;
    return this;
  }

  /**
   * Metadata for allowSendOnBehalfOf..
   * @return allowSendOnBehalfOfMetadata
   **/
  @Schema(description = "Metadata for allowSendOnBehalfOf.")
  public SettingsMetadata getAllowSendOnBehalfOfMetadata() {
    return allowSendOnBehalfOfMetadata;
  }

  /**
   * setAllowSendOnBehalfOfMetadata.
   **/
  public void setAllowSendOnBehalfOfMetadata(SettingsMetadata allowSendOnBehalfOfMetadata) {
    this.allowSendOnBehalfOfMetadata = allowSendOnBehalfOfMetadata;
  }


  /**
   * allowSupplementalDocuments.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowSupplementalDocuments(String allowSupplementalDocuments) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowSupplementalDocumentsMetadata(SettingsMetadata allowSupplementalDocumentsMetadata) {
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
   * allowTransactions.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowTransactions(String allowTransactions) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation allowTransactionsMetadata(SettingsMetadata allowTransactionsMetadata) {
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
   * anchorTagVersionedPlacementEnabled.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation anchorTagVersionedPlacementEnabled(String anchorTagVersionedPlacementEnabled) {
    this.anchorTagVersionedPlacementEnabled = anchorTagVersionedPlacementEnabled;
    return this;
  }

  /**
   * .
   * @return anchorTagVersionedPlacementEnabled
   **/
  @Schema(description = "")
  public String getAnchorTagVersionedPlacementEnabled() {
    return anchorTagVersionedPlacementEnabled;
  }

  /**
   * setAnchorTagVersionedPlacementEnabled.
   **/
  public void setAnchorTagVersionedPlacementEnabled(String anchorTagVersionedPlacementEnabled) {
    this.anchorTagVersionedPlacementEnabled = anchorTagVersionedPlacementEnabled;
  }


  /**
   * apiAccountWideAccess.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation apiAccountWideAccess(String apiAccountWideAccess) {
    this.apiAccountWideAccess = apiAccountWideAccess;
    return this;
  }

  /**
   * .
   * @return apiAccountWideAccess
   **/
  @Schema(description = "")
  public String getApiAccountWideAccess() {
    return apiAccountWideAccess;
  }

  /**
   * setApiAccountWideAccess.
   **/
  public void setApiAccountWideAccess(String apiAccountWideAccess) {
    this.apiAccountWideAccess = apiAccountWideAccess;
  }


  /**
   * apiAccountWideAccessMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation apiAccountWideAccessMetadata(SettingsMetadata apiAccountWideAccessMetadata) {
    this.apiAccountWideAccessMetadata = apiAccountWideAccessMetadata;
    return this;
  }

  /**
   * Metadata for apiAccountWideAccess..
   * @return apiAccountWideAccessMetadata
   **/
  @Schema(description = "Metadata for apiAccountWideAccess.")
  public SettingsMetadata getApiAccountWideAccessMetadata() {
    return apiAccountWideAccessMetadata;
  }

  /**
   * setApiAccountWideAccessMetadata.
   **/
  public void setApiAccountWideAccessMetadata(SettingsMetadata apiAccountWideAccessMetadata) {
    this.apiAccountWideAccessMetadata = apiAccountWideAccessMetadata;
  }


  /**
   * apiCanExportAC.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation apiCanExportAC(String apiCanExportAC) {
    this.apiCanExportAC = apiCanExportAC;
    return this;
  }

  /**
   * .
   * @return apiCanExportAC
   **/
  @Schema(description = "")
  public String getApiCanExportAC() {
    return apiCanExportAC;
  }

  /**
   * setApiCanExportAC.
   **/
  public void setApiCanExportAC(String apiCanExportAC) {
    this.apiCanExportAC = apiCanExportAC;
  }


  /**
   * apiCanExportACMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation apiCanExportACMetadata(SettingsMetadata apiCanExportACMetadata) {
    this.apiCanExportACMetadata = apiCanExportACMetadata;
    return this;
  }

  /**
   * Metadata about the `apiCanExportACMetadata` property..
   * @return apiCanExportACMetadata
   **/
  @Schema(description = "Metadata about the `apiCanExportACMetadata` property.")
  public SettingsMetadata getApiCanExportACMetadata() {
    return apiCanExportACMetadata;
  }

  /**
   * setApiCanExportACMetadata.
   **/
  public void setApiCanExportACMetadata(SettingsMetadata apiCanExportACMetadata) {
    this.apiCanExportACMetadata = apiCanExportACMetadata;
  }


  /**
   * bulkSend.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation bulkSend(String bulkSend) {
    this.bulkSend = bulkSend;
    return this;
  }

  /**
   * .
   * @return bulkSend
   **/
  @Schema(description = "")
  public String getBulkSend() {
    return bulkSend;
  }

  /**
   * setBulkSend.
   **/
  public void setBulkSend(String bulkSend) {
    this.bulkSend = bulkSend;
  }


  /**
   * bulkSendMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation bulkSendMetadata(SettingsMetadata bulkSendMetadata) {
    this.bulkSendMetadata = bulkSendMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `bulkSend` property is editable. .
   * @return bulkSendMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `bulkSend` property is editable. ")
  public SettingsMetadata getBulkSendMetadata() {
    return bulkSendMetadata;
  }

  /**
   * setBulkSendMetadata.
   **/
  public void setBulkSendMetadata(SettingsMetadata bulkSendMetadata) {
    this.bulkSendMetadata = bulkSendMetadata;
  }


  /**
   * canBulkUploadAgreements.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canBulkUploadAgreements(String canBulkUploadAgreements) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canBulkUploadAgreementsMetadata(SettingsMetadata canBulkUploadAgreementsMetadata) {
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
   * canChargeAccount.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canChargeAccount(String canChargeAccount) {
    this.canChargeAccount = canChargeAccount;
    return this;
  }

  /**
   * .
   * @return canChargeAccount
   **/
  @Schema(description = "")
  public String getCanChargeAccount() {
    return canChargeAccount;
  }

  /**
   * setCanChargeAccount.
   **/
  public void setCanChargeAccount(String canChargeAccount) {
    this.canChargeAccount = canChargeAccount;
  }


  /**
   * canChargeAccountMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canChargeAccountMetadata(SettingsMetadata canChargeAccountMetadata) {
    this.canChargeAccountMetadata = canChargeAccountMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return canChargeAccountMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getCanChargeAccountMetadata() {
    return canChargeAccountMetadata;
  }

  /**
   * setCanChargeAccountMetadata.
   **/
  public void setCanChargeAccountMetadata(SettingsMetadata canChargeAccountMetadata) {
    this.canChargeAccountMetadata = canChargeAccountMetadata;
  }


  /**
   * canCreateTransaction.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canCreateTransaction(String canCreateTransaction) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canCreateTransactionMetadata(SettingsMetadata canCreateTransactionMetadata) {
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
   * canDeleteDocumentsInTransaction.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canDeleteDocumentsInTransaction(String canDeleteDocumentsInTransaction) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canDeleteDocumentsInTransactionMetadata(SettingsMetadata canDeleteDocumentsInTransactionMetadata) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canDeleteTransaction(String canDeleteTransaction) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canDeleteTransactionMetadata(SettingsMetadata canDeleteTransactionMetadata) {
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
   * canEditSharedAddressbook.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canEditSharedAddressbook(String canEditSharedAddressbook) {
    this.canEditSharedAddressbook = canEditSharedAddressbook;
    return this;
  }

  /**
   * .
   * @return canEditSharedAddressbook
   **/
  @Schema(description = "")
  public String getCanEditSharedAddressbook() {
    return canEditSharedAddressbook;
  }

  /**
   * setCanEditSharedAddressbook.
   **/
  public void setCanEditSharedAddressbook(String canEditSharedAddressbook) {
    this.canEditSharedAddressbook = canEditSharedAddressbook;
  }


  /**
   * canEditSharedAddressbookMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canEditSharedAddressbookMetadata(SettingsMetadata canEditSharedAddressbookMetadata) {
    this.canEditSharedAddressbookMetadata = canEditSharedAddressbookMetadata;
    return this;
  }

  /**
   * Metadata about the `canEditSharedAddressbookMetadata` property..
   * @return canEditSharedAddressbookMetadata
   **/
  @Schema(description = "Metadata about the `canEditSharedAddressbookMetadata` property.")
  public SettingsMetadata getCanEditSharedAddressbookMetadata() {
    return canEditSharedAddressbookMetadata;
  }

  /**
   * setCanEditSharedAddressbookMetadata.
   **/
  public void setCanEditSharedAddressbookMetadata(SettingsMetadata canEditSharedAddressbookMetadata) {
    this.canEditSharedAddressbookMetadata = canEditSharedAddressbookMetadata;
  }


  /**
   * canLockEnvelopes.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canLockEnvelopes(String canLockEnvelopes) {
    this.canLockEnvelopes = canLockEnvelopes;
    return this;
  }

  /**
   * .
   * @return canLockEnvelopes
   **/
  @Schema(description = "")
  public String getCanLockEnvelopes() {
    return canLockEnvelopes;
  }

  /**
   * setCanLockEnvelopes.
   **/
  public void setCanLockEnvelopes(String canLockEnvelopes) {
    this.canLockEnvelopes = canLockEnvelopes;
  }


  /**
   * canLockEnvelopesMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canLockEnvelopesMetadata(SettingsMetadata canLockEnvelopesMetadata) {
    this.canLockEnvelopesMetadata = canLockEnvelopesMetadata;
    return this;
  }

  /**
   * Metadata about the `canLockEnvelopes` property..
   * @return canLockEnvelopesMetadata
   **/
  @Schema(description = "Metadata about the `canLockEnvelopes` property.")
  public SettingsMetadata getCanLockEnvelopesMetadata() {
    return canLockEnvelopesMetadata;
  }

  /**
   * setCanLockEnvelopesMetadata.
   **/
  public void setCanLockEnvelopesMetadata(SettingsMetadata canLockEnvelopesMetadata) {
    this.canLockEnvelopesMetadata = canLockEnvelopesMetadata;
  }


  /**
   * canManageAccount.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canManageAccount(String canManageAccount) {
    this.canManageAccount = canManageAccount;
    return this;
  }

  /**
   * .
   * @return canManageAccount
   **/
  @Schema(description = "")
  public String getCanManageAccount() {
    return canManageAccount;
  }

  /**
   * setCanManageAccount.
   **/
  public void setCanManageAccount(String canManageAccount) {
    this.canManageAccount = canManageAccount;
  }


  /**
   * canManageAccountMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canManageAccountMetadata(SettingsMetadata canManageAccountMetadata) {
    this.canManageAccountMetadata = canManageAccountMetadata;
    return this;
  }

  /**
   * Metadata about the `canManageAccountMetadata` property..
   * @return canManageAccountMetadata
   **/
  @Schema(description = "Metadata about the `canManageAccountMetadata` property.")
  public SettingsMetadata getCanManageAccountMetadata() {
    return canManageAccountMetadata;
  }

  /**
   * setCanManageAccountMetadata.
   **/
  public void setCanManageAccountMetadata(SettingsMetadata canManageAccountMetadata) {
    this.canManageAccountMetadata = canManageAccountMetadata;
  }


  /**
   * canManageAgreementParties.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canManageAgreementParties(String canManageAgreementParties) {
    this.canManageAgreementParties = canManageAgreementParties;
    return this;
  }

  /**
   * .
   * @return canManageAgreementParties
   **/
  @Schema(description = "")
  public String getCanManageAgreementParties() {
    return canManageAgreementParties;
  }

  /**
   * setCanManageAgreementParties.
   **/
  public void setCanManageAgreementParties(String canManageAgreementParties) {
    this.canManageAgreementParties = canManageAgreementParties;
  }


  /**
   * canManageAgreementPartiesMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canManageAgreementPartiesMetadata(SettingsMetadata canManageAgreementPartiesMetadata) {
    this.canManageAgreementPartiesMetadata = canManageAgreementPartiesMetadata;
    return this;
  }

  /**
   * .
   * @return canManageAgreementPartiesMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCanManageAgreementPartiesMetadata() {
    return canManageAgreementPartiesMetadata;
  }

  /**
   * setCanManageAgreementPartiesMetadata.
   **/
  public void setCanManageAgreementPartiesMetadata(SettingsMetadata canManageAgreementPartiesMetadata) {
    this.canManageAgreementPartiesMetadata = canManageAgreementPartiesMetadata;
  }


  /**
   * canManageDistributor.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canManageDistributor(String canManageDistributor) {
    this.canManageDistributor = canManageDistributor;
    return this;
  }

  /**
   * .
   * @return canManageDistributor
   **/
  @Schema(description = "")
  public String getCanManageDistributor() {
    return canManageDistributor;
  }

  /**
   * setCanManageDistributor.
   **/
  public void setCanManageDistributor(String canManageDistributor) {
    this.canManageDistributor = canManageDistributor;
  }


  /**
   * canManageDistributorMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canManageDistributorMetadata(SettingsMetadata canManageDistributorMetadata) {
    this.canManageDistributorMetadata = canManageDistributorMetadata;
    return this;
  }

  /**
   * Metadata about the `canManageDistributor` property..
   * @return canManageDistributorMetadata
   **/
  @Schema(description = "Metadata about the `canManageDistributor` property.")
  public SettingsMetadata getCanManageDistributorMetadata() {
    return canManageDistributorMetadata;
  }

  /**
   * setCanManageDistributorMetadata.
   **/
  public void setCanManageDistributorMetadata(SettingsMetadata canManageDistributorMetadata) {
    this.canManageDistributorMetadata = canManageDistributorMetadata;
  }


  /**
   * canManageTemplates.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canManageTemplates(String canManageTemplates) {
    this.canManageTemplates = canManageTemplates;
    return this;
  }

  /**
   * .
   * @return canManageTemplates
   **/
  @Schema(description = "")
  public String getCanManageTemplates() {
    return canManageTemplates;
  }

  /**
   * setCanManageTemplates.
   **/
  public void setCanManageTemplates(String canManageTemplates) {
    this.canManageTemplates = canManageTemplates;
  }


  /**
   * canManageTemplatesMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canManageTemplatesMetadata(SettingsMetadata canManageTemplatesMetadata) {
    this.canManageTemplatesMetadata = canManageTemplatesMetadata;
    return this;
  }

  /**
   * Metadata about the `canManageTemplates` property..
   * @return canManageTemplatesMetadata
   **/
  @Schema(description = "Metadata about the `canManageTemplates` property.")
  public SettingsMetadata getCanManageTemplatesMetadata() {
    return canManageTemplatesMetadata;
  }

  /**
   * setCanManageTemplatesMetadata.
   **/
  public void setCanManageTemplatesMetadata(SettingsMetadata canManageTemplatesMetadata) {
    this.canManageTemplatesMetadata = canManageTemplatesMetadata;
  }


  /**
   * canSendAPIRequests.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canSendAPIRequests(String canSendAPIRequests) {
    this.canSendAPIRequests = canSendAPIRequests;
    return this;
  }

  /**
   * .
   * @return canSendAPIRequests
   **/
  @Schema(description = "")
  public String getCanSendAPIRequests() {
    return canSendAPIRequests;
  }

  /**
   * setCanSendAPIRequests.
   **/
  public void setCanSendAPIRequests(String canSendAPIRequests) {
    this.canSendAPIRequests = canSendAPIRequests;
  }


  /**
   * canSendAPIRequestsMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canSendAPIRequestsMetadata(SettingsMetadata canSendAPIRequestsMetadata) {
    this.canSendAPIRequestsMetadata = canSendAPIRequestsMetadata;
    return this;
  }

  /**
   * Metadata about the `canSendAPIRequests` property..
   * @return canSendAPIRequestsMetadata
   **/
  @Schema(description = "Metadata about the `canSendAPIRequests` property.")
  public SettingsMetadata getCanSendAPIRequestsMetadata() {
    return canSendAPIRequestsMetadata;
  }

  /**
   * setCanSendAPIRequestsMetadata.
   **/
  public void setCanSendAPIRequestsMetadata(SettingsMetadata canSendAPIRequestsMetadata) {
    this.canSendAPIRequestsMetadata = canSendAPIRequestsMetadata;
  }


  /**
   * canSendEnvelope.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canSendEnvelope(String canSendEnvelope) {
    this.canSendEnvelope = canSendEnvelope;
    return this;
  }

  /**
   * .
   * @return canSendEnvelope
   **/
  @Schema(description = "")
  public String getCanSendEnvelope() {
    return canSendEnvelope;
  }

  /**
   * setCanSendEnvelope.
   **/
  public void setCanSendEnvelope(String canSendEnvelope) {
    this.canSendEnvelope = canSendEnvelope;
  }


  /**
   * canSendEnvelopeMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canSendEnvelopeMetadata(SettingsMetadata canSendEnvelopeMetadata) {
    this.canSendEnvelopeMetadata = canSendEnvelopeMetadata;
    return this;
  }

  /**
   * Metadata about the `canSendEnvelope` property..
   * @return canSendEnvelopeMetadata
   **/
  @Schema(description = "Metadata about the `canSendEnvelope` property.")
  public SettingsMetadata getCanSendEnvelopeMetadata() {
    return canSendEnvelopeMetadata;
  }

  /**
   * setCanSendEnvelopeMetadata.
   **/
  public void setCanSendEnvelopeMetadata(SettingsMetadata canSendEnvelopeMetadata) {
    this.canSendEnvelopeMetadata = canSendEnvelopeMetadata;
  }


  /**
   * canSendEnvelopesViaSMS.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canSendEnvelopesViaSMS(String canSendEnvelopesViaSMS) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canSendEnvelopesViaSMSMetadata(SettingsMetadata canSendEnvelopesViaSMSMetadata) {
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
   * canSignEnvelope.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canSignEnvelope(String canSignEnvelope) {
    this.canSignEnvelope = canSignEnvelope;
    return this;
  }

  /**
   * .
   * @return canSignEnvelope
   **/
  @Schema(description = "")
  public String getCanSignEnvelope() {
    return canSignEnvelope;
  }

  /**
   * setCanSignEnvelope.
   **/
  public void setCanSignEnvelope(String canSignEnvelope) {
    this.canSignEnvelope = canSignEnvelope;
  }


  /**
   * canSignEnvelopeMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canSignEnvelopeMetadata(SettingsMetadata canSignEnvelopeMetadata) {
    this.canSignEnvelopeMetadata = canSignEnvelopeMetadata;
    return this;
  }

  /**
   * Metadata about the `canSignEnvelope` property..
   * @return canSignEnvelopeMetadata
   **/
  @Schema(description = "Metadata about the `canSignEnvelope` property.")
  public SettingsMetadata getCanSignEnvelopeMetadata() {
    return canSignEnvelopeMetadata;
  }

  /**
   * setCanSignEnvelopeMetadata.
   **/
  public void setCanSignEnvelopeMetadata(SettingsMetadata canSignEnvelopeMetadata) {
    this.canSignEnvelopeMetadata = canSignEnvelopeMetadata;
  }


  /**
   * canUseScratchpad.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canUseScratchpad(String canUseScratchpad) {
    this.canUseScratchpad = canUseScratchpad;
    return this;
  }

  /**
   * .
   * @return canUseScratchpad
   **/
  @Schema(description = "")
  public String getCanUseScratchpad() {
    return canUseScratchpad;
  }

  /**
   * setCanUseScratchpad.
   **/
  public void setCanUseScratchpad(String canUseScratchpad) {
    this.canUseScratchpad = canUseScratchpad;
  }


  /**
   * canUseScratchpadMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canUseScratchpadMetadata(SettingsMetadata canUseScratchpadMetadata) {
    this.canUseScratchpadMetadata = canUseScratchpadMetadata;
    return this;
  }

  /**
   * Metadata about the `canUseScratchpad` property..
   * @return canUseScratchpadMetadata
   **/
  @Schema(description = "Metadata about the `canUseScratchpad` property.")
  public SettingsMetadata getCanUseScratchpadMetadata() {
    return canUseScratchpadMetadata;
  }

  /**
   * setCanUseScratchpadMetadata.
   **/
  public void setCanUseScratchpadMetadata(SettingsMetadata canUseScratchpadMetadata) {
    this.canUseScratchpadMetadata = canUseScratchpadMetadata;
  }


  /**
   * canUseSmartContracts.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canUseSmartContracts(String canUseSmartContracts) {
    this.canUseSmartContracts = canUseSmartContracts;
    return this;
  }

  /**
   * .
   * @return canUseSmartContracts
   **/
  @Schema(description = "")
  public String getCanUseSmartContracts() {
    return canUseSmartContracts;
  }

  /**
   * setCanUseSmartContracts.
   **/
  public void setCanUseSmartContracts(String canUseSmartContracts) {
    this.canUseSmartContracts = canUseSmartContracts;
  }


  /**
   * canUseSmartContractsMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation canUseSmartContractsMetadata(SettingsMetadata canUseSmartContractsMetadata) {
    this.canUseSmartContractsMetadata = canUseSmartContractsMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return canUseSmartContractsMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getCanUseSmartContractsMetadata() {
    return canUseSmartContractsMetadata;
  }

  /**
   * setCanUseSmartContractsMetadata.
   **/
  public void setCanUseSmartContractsMetadata(SettingsMetadata canUseSmartContractsMetadata) {
    this.canUseSmartContractsMetadata = canUseSmartContractsMetadata;
  }


  /**
   * disableDocumentUpload.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation disableDocumentUpload(String disableDocumentUpload) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation disableDocumentUploadMetadata(SettingsMetadata disableDocumentUploadMetadata) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation disableOtherActions(String disableOtherActions) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation disableOtherActionsMetadata(SettingsMetadata disableOtherActionsMetadata) {
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
   * enableDSPro.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableDSPro(String enableDSPro) {
    this.enableDSPro = enableDSPro;
    return this;
  }

  /**
   * .
   * @return enableDSPro
   **/
  @Schema(description = "")
  public String getEnableDSPro() {
    return enableDSPro;
  }

  /**
   * setEnableDSPro.
   **/
  public void setEnableDSPro(String enableDSPro) {
    this.enableDSPro = enableDSPro;
  }


  /**
   * enableDSProMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableDSProMetadata(SettingsMetadata enableDSProMetadata) {
    this.enableDSProMetadata = enableDSProMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `enableDSPro` property is editable. .
   * @return enableDSProMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `enableDSPro` property is editable. ")
  public SettingsMetadata getEnableDSProMetadata() {
    return enableDSProMetadata;
  }

  /**
   * setEnableDSProMetadata.
   **/
  public void setEnableDSProMetadata(SettingsMetadata enableDSProMetadata) {
    this.enableDSProMetadata = enableDSProMetadata;
  }


  /**
   * enableKeyTermsSuggestionsByDocumentType.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableKeyTermsSuggestionsByDocumentType(String enableKeyTermsSuggestionsByDocumentType) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableKeyTermsSuggestionsByDocumentTypeMetadata(SettingsMetadata enableKeyTermsSuggestionsByDocumentTypeMetadata) {
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
   * enableSequentialSigningAPI.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableSequentialSigningAPI(String enableSequentialSigningAPI) {
    this.enableSequentialSigningAPI = enableSequentialSigningAPI;
    return this;
  }

  /**
   * .
   * @return enableSequentialSigningAPI
   **/
  @Schema(description = "")
  public String getEnableSequentialSigningAPI() {
    return enableSequentialSigningAPI;
  }

  /**
   * setEnableSequentialSigningAPI.
   **/
  public void setEnableSequentialSigningAPI(String enableSequentialSigningAPI) {
    this.enableSequentialSigningAPI = enableSequentialSigningAPI;
  }


  /**
   * enableSequentialSigningAPIMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableSequentialSigningAPIMetadata(SettingsMetadata enableSequentialSigningAPIMetadata) {
    this.enableSequentialSigningAPIMetadata = enableSequentialSigningAPIMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `enableSequentialSigningAPI` property is editable. .
   * @return enableSequentialSigningAPIMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `enableSequentialSigningAPI` property is editable. ")
  public SettingsMetadata getEnableSequentialSigningAPIMetadata() {
    return enableSequentialSigningAPIMetadata;
  }

  /**
   * setEnableSequentialSigningAPIMetadata.
   **/
  public void setEnableSequentialSigningAPIMetadata(SettingsMetadata enableSequentialSigningAPIMetadata) {
    this.enableSequentialSigningAPIMetadata = enableSequentialSigningAPIMetadata;
  }


  /**
   * enableSequentialSigningUI.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableSequentialSigningUI(String enableSequentialSigningUI) {
    this.enableSequentialSigningUI = enableSequentialSigningUI;
    return this;
  }

  /**
   * .
   * @return enableSequentialSigningUI
   **/
  @Schema(description = "")
  public String getEnableSequentialSigningUI() {
    return enableSequentialSigningUI;
  }

  /**
   * setEnableSequentialSigningUI.
   **/
  public void setEnableSequentialSigningUI(String enableSequentialSigningUI) {
    this.enableSequentialSigningUI = enableSequentialSigningUI;
  }


  /**
   * enableSequentialSigningUIMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableSequentialSigningUIMetadata(SettingsMetadata enableSequentialSigningUIMetadata) {
    this.enableSequentialSigningUIMetadata = enableSequentialSigningUIMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `enableSequentialSigningUI` property is editable. .
   * @return enableSequentialSigningUIMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `enableSequentialSigningUI` property is editable. ")
  public SettingsMetadata getEnableSequentialSigningUIMetadata() {
    return enableSequentialSigningUIMetadata;
  }

  /**
   * setEnableSequentialSigningUIMetadata.
   **/
  public void setEnableSequentialSigningUIMetadata(SettingsMetadata enableSequentialSigningUIMetadata) {
    this.enableSequentialSigningUIMetadata = enableSequentialSigningUIMetadata;
  }


  /**
   * enableSignerAttachments.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableSignerAttachments(String enableSignerAttachments) {
    this.enableSignerAttachments = enableSignerAttachments;
    return this;
  }

  /**
   * .
   * @return enableSignerAttachments
   **/
  @Schema(description = "")
  public String getEnableSignerAttachments() {
    return enableSignerAttachments;
  }

  /**
   * setEnableSignerAttachments.
   **/
  public void setEnableSignerAttachments(String enableSignerAttachments) {
    this.enableSignerAttachments = enableSignerAttachments;
  }


  /**
   * enableSignerAttachmentsMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableSignerAttachmentsMetadata(SettingsMetadata enableSignerAttachmentsMetadata) {
    this.enableSignerAttachmentsMetadata = enableSignerAttachmentsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `enableSignerAttachments` property is editable. .
   * @return enableSignerAttachmentsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `enableSignerAttachments` property is editable. ")
  public SettingsMetadata getEnableSignerAttachmentsMetadata() {
    return enableSignerAttachmentsMetadata;
  }

  /**
   * setEnableSignerAttachmentsMetadata.
   **/
  public void setEnableSignerAttachmentsMetadata(SettingsMetadata enableSignerAttachmentsMetadata) {
    this.enableSignerAttachmentsMetadata = enableSignerAttachmentsMetadata;
  }


  /**
   * enableSignOnPaperOverride.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableSignOnPaperOverride(String enableSignOnPaperOverride) {
    this.enableSignOnPaperOverride = enableSignOnPaperOverride;
    return this;
  }

  /**
   * .
   * @return enableSignOnPaperOverride
   **/
  @Schema(description = "")
  public String getEnableSignOnPaperOverride() {
    return enableSignOnPaperOverride;
  }

  /**
   * setEnableSignOnPaperOverride.
   **/
  public void setEnableSignOnPaperOverride(String enableSignOnPaperOverride) {
    this.enableSignOnPaperOverride = enableSignOnPaperOverride;
  }


  /**
   * enableSignOnPaperOverrideMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableSignOnPaperOverrideMetadata(SettingsMetadata enableSignOnPaperOverrideMetadata) {
    this.enableSignOnPaperOverrideMetadata = enableSignOnPaperOverrideMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `enableSignOnPaperOverride` property is editable. .
   * @return enableSignOnPaperOverrideMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `enableSignOnPaperOverride` property is editable. ")
  public SettingsMetadata getEnableSignOnPaperOverrideMetadata() {
    return enableSignOnPaperOverrideMetadata;
  }

  /**
   * setEnableSignOnPaperOverrideMetadata.
   **/
  public void setEnableSignOnPaperOverrideMetadata(SettingsMetadata enableSignOnPaperOverrideMetadata) {
    this.enableSignOnPaperOverrideMetadata = enableSignOnPaperOverrideMetadata;
  }


  /**
   * enableTransactionPoint.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableTransactionPoint(String enableTransactionPoint) {
    this.enableTransactionPoint = enableTransactionPoint;
    return this;
  }

  /**
   * .
   * @return enableTransactionPoint
   **/
  @Schema(description = "")
  public String getEnableTransactionPoint() {
    return enableTransactionPoint;
  }

  /**
   * setEnableTransactionPoint.
   **/
  public void setEnableTransactionPoint(String enableTransactionPoint) {
    this.enableTransactionPoint = enableTransactionPoint;
  }


  /**
   * enableTransactionPointMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableTransactionPointMetadata(SettingsMetadata enableTransactionPointMetadata) {
    this.enableTransactionPointMetadata = enableTransactionPointMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return enableTransactionPointMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getEnableTransactionPointMetadata() {
    return enableTransactionPointMetadata;
  }

  /**
   * setEnableTransactionPointMetadata.
   **/
  public void setEnableTransactionPointMetadata(SettingsMetadata enableTransactionPointMetadata) {
    this.enableTransactionPointMetadata = enableTransactionPointMetadata;
  }


  /**
   * enableVaulting.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableVaulting(String enableVaulting) {
    this.enableVaulting = enableVaulting;
    return this;
  }

  /**
   * .
   * @return enableVaulting
   **/
  @Schema(description = "")
  public String getEnableVaulting() {
    return enableVaulting;
  }

  /**
   * setEnableVaulting.
   **/
  public void setEnableVaulting(String enableVaulting) {
    this.enableVaulting = enableVaulting;
  }


  /**
   * enableVaultingMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation enableVaultingMetadata(SettingsMetadata enableVaultingMetadata) {
    this.enableVaultingMetadata = enableVaultingMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `enableVaulting` property is editable. .
   * @return enableVaultingMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `enableVaulting` property is editable. ")
  public SettingsMetadata getEnableVaultingMetadata() {
    return enableVaultingMetadata;
  }

  /**
   * setEnableVaultingMetadata.
   **/
  public void setEnableVaultingMetadata(SettingsMetadata enableVaultingMetadata) {
    this.enableVaultingMetadata = enableVaultingMetadata;
  }


  /**
   * expressSendOnly.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation expressSendOnly(String expressSendOnly) {
    this.expressSendOnly = expressSendOnly;
    return this;
  }

  /**
   * .
   * @return expressSendOnly
   **/
  @Schema(description = "")
  public String getExpressSendOnly() {
    return expressSendOnly;
  }

  /**
   * setExpressSendOnly.
   **/
  public void setExpressSendOnly(String expressSendOnly) {
    this.expressSendOnly = expressSendOnly;
  }


  /**
   * locale.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * .
   * @return locale
   **/
  @Schema(description = "")
  public String getLocale() {
    return locale;
  }

  /**
   * setLocale.
   **/
  public void setLocale(String locale) {
    this.locale = locale;
  }


  /**
   * localeMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation localeMetadata(SettingsMetadata localeMetadata) {
    this.localeMetadata = localeMetadata;
    return this;
  }

  /**
   * Metadata about the `locale` property..
   * @return localeMetadata
   **/
  @Schema(description = "Metadata about the `locale` property.")
  public SettingsMetadata getLocaleMetadata() {
    return localeMetadata;
  }

  /**
   * setLocaleMetadata.
   **/
  public void setLocaleMetadata(SettingsMetadata localeMetadata) {
    this.localeMetadata = localeMetadata;
  }


  /**
   * localePolicy.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation localePolicy(LocalePolicy localePolicy) {
    this.localePolicy = localePolicy;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return localePolicy
   **/
  @Schema(description = "Reserved for DocuSign.")
  public LocalePolicy getLocalePolicy() {
    return localePolicy;
  }

  /**
   * setLocalePolicy.
   **/
  public void setLocalePolicy(LocalePolicy localePolicy) {
    this.localePolicy = localePolicy;
  }


  /**
   * manageClickwrapsMode.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation manageClickwrapsMode(String manageClickwrapsMode) {
    this.manageClickwrapsMode = manageClickwrapsMode;
    return this;
  }

  /**
   * .
   * @return manageClickwrapsMode
   **/
  @Schema(description = "")
  public String getManageClickwrapsMode() {
    return manageClickwrapsMode;
  }

  /**
   * setManageClickwrapsMode.
   **/
  public void setManageClickwrapsMode(String manageClickwrapsMode) {
    this.manageClickwrapsMode = manageClickwrapsMode;
  }


  /**
   * manageClickwrapsModeMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation manageClickwrapsModeMetadata(SettingsMetadata manageClickwrapsModeMetadata) {
    this.manageClickwrapsModeMetadata = manageClickwrapsModeMetadata;
    return this;
  }

  /**
   * Metadata about the `manageClickwrapsMode` property..
   * @return manageClickwrapsModeMetadata
   **/
  @Schema(description = "Metadata about the `manageClickwrapsMode` property.")
  public SettingsMetadata getManageClickwrapsModeMetadata() {
    return manageClickwrapsModeMetadata;
  }

  /**
   * setManageClickwrapsModeMetadata.
   **/
  public void setManageClickwrapsModeMetadata(SettingsMetadata manageClickwrapsModeMetadata) {
    this.manageClickwrapsModeMetadata = manageClickwrapsModeMetadata;
  }


  /**
   * modifiedBy.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * .
   * @return modifiedBy
   **/
  @Schema(description = "")
  public String getModifiedBy() {
    return modifiedBy;
  }

  /**
   * setModifiedBy.
   **/
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * modifiedByMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation modifiedByMetadata(SettingsMetadata modifiedByMetadata) {
    this.modifiedByMetadata = modifiedByMetadata;
    return this;
  }

  /**
   * Metadata about the `modifiedBy` property..
   * @return modifiedByMetadata
   **/
  @Schema(description = "Metadata about the `modifiedBy` property.")
  public SettingsMetadata getModifiedByMetadata() {
    return modifiedByMetadata;
  }

  /**
   * setModifiedByMetadata.
   **/
  public void setModifiedByMetadata(SettingsMetadata modifiedByMetadata) {
    this.modifiedByMetadata = modifiedByMetadata;
  }


  /**
   * modifiedDate.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation modifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * .
   * @return modifiedDate
   **/
  @Schema(description = "")
  public String getModifiedDate() {
    return modifiedDate;
  }

  /**
   * setModifiedDate.
   **/
  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  /**
   * modifiedDateMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation modifiedDateMetadata(SettingsMetadata modifiedDateMetadata) {
    this.modifiedDateMetadata = modifiedDateMetadata;
    return this;
  }

  /**
   * Metadata about the `modifiedDate` property..
   * @return modifiedDateMetadata
   **/
  @Schema(description = "Metadata about the `modifiedDate` property.")
  public SettingsMetadata getModifiedDateMetadata() {
    return modifiedDateMetadata;
  }

  /**
   * setModifiedDateMetadata.
   **/
  public void setModifiedDateMetadata(SettingsMetadata modifiedDateMetadata) {
    this.modifiedDateMetadata = modifiedDateMetadata;
  }


  /**
   * modifiedPage.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation modifiedPage(String modifiedPage) {
    this.modifiedPage = modifiedPage;
    return this;
  }

  /**
   * .
   * @return modifiedPage
   **/
  @Schema(description = "")
  public String getModifiedPage() {
    return modifiedPage;
  }

  /**
   * setModifiedPage.
   **/
  public void setModifiedPage(String modifiedPage) {
    this.modifiedPage = modifiedPage;
  }


  /**
   * modifiedPageMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation modifiedPageMetadata(SettingsMetadata modifiedPageMetadata) {
    this.modifiedPageMetadata = modifiedPageMetadata;
    return this;
  }

  /**
   * Metadata about the `modifiedPage` property..
   * @return modifiedPageMetadata
   **/
  @Schema(description = "Metadata about the `modifiedPage` property.")
  public SettingsMetadata getModifiedPageMetadata() {
    return modifiedPageMetadata;
  }

  /**
   * setModifiedPageMetadata.
   **/
  public void setModifiedPageMetadata(SettingsMetadata modifiedPageMetadata) {
    this.modifiedPageMetadata = modifiedPageMetadata;
  }


  /**
   * newSendUI.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation newSendUI(String newSendUI) {
    this.newSendUI = newSendUI;
    return this;
  }

  /**
   * .
   * @return newSendUI
   **/
  @Schema(description = "")
  public String getNewSendUI() {
    return newSendUI;
  }

  /**
   * setNewSendUI.
   **/
  public void setNewSendUI(String newSendUI) {
    this.newSendUI = newSendUI;
  }


  /**
   * newSendUIMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation newSendUIMetadata(SettingsMetadata newSendUIMetadata) {
    this.newSendUIMetadata = newSendUIMetadata;
    return this;
  }

  /**
   * Metadata about the `newSendUI` property..
   * @return newSendUIMetadata
   **/
  @Schema(description = "Metadata about the `newSendUI` property.")
  public SettingsMetadata getNewSendUIMetadata() {
    return newSendUIMetadata;
  }

  /**
   * setNewSendUIMetadata.
   **/
  public void setNewSendUIMetadata(SettingsMetadata newSendUIMetadata) {
    this.newSendUIMetadata = newSendUIMetadata;
  }


  /**
   * powerFormMode.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation powerFormMode(String powerFormMode) {
    this.powerFormMode = powerFormMode;
    return this;
  }

  /**
   * .
   * @return powerFormMode
   **/
  @Schema(description = "")
  public String getPowerFormMode() {
    return powerFormMode;
  }

  /**
   * setPowerFormMode.
   **/
  public void setPowerFormMode(String powerFormMode) {
    this.powerFormMode = powerFormMode;
  }


  /**
   * powerFormModeMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation powerFormModeMetadata(SettingsMetadata powerFormModeMetadata) {
    this.powerFormModeMetadata = powerFormModeMetadata;
    return this;
  }

  /**
   * Metadata about the `powerFormMode` property..
   * @return powerFormModeMetadata
   **/
  @Schema(description = "Metadata about the `powerFormMode` property.")
  public SettingsMetadata getPowerFormModeMetadata() {
    return powerFormModeMetadata;
  }

  /**
   * setPowerFormModeMetadata.
   **/
  public void setPowerFormModeMetadata(SettingsMetadata powerFormModeMetadata) {
    this.powerFormModeMetadata = powerFormModeMetadata;
  }


  /**
   * recipientViewedNotification.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation recipientViewedNotification(String recipientViewedNotification) {
    this.recipientViewedNotification = recipientViewedNotification;
    return this;
  }

  /**
   * .
   * @return recipientViewedNotification
   **/
  @Schema(description = "")
  public String getRecipientViewedNotification() {
    return recipientViewedNotification;
  }

  /**
   * setRecipientViewedNotification.
   **/
  public void setRecipientViewedNotification(String recipientViewedNotification) {
    this.recipientViewedNotification = recipientViewedNotification;
  }


  /**
   * recipientViewedNotificationMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation recipientViewedNotificationMetadata(SettingsMetadata recipientViewedNotificationMetadata) {
    this.recipientViewedNotificationMetadata = recipientViewedNotificationMetadata;
    return this;
  }

  /**
   * Metadata about the `recipientViewedNotification` property..
   * @return recipientViewedNotificationMetadata
   **/
  @Schema(description = "Metadata about the `recipientViewedNotification` property.")
  public SettingsMetadata getRecipientViewedNotificationMetadata() {
    return recipientViewedNotificationMetadata;
  }

  /**
   * setRecipientViewedNotificationMetadata.
   **/
  public void setRecipientViewedNotificationMetadata(SettingsMetadata recipientViewedNotificationMetadata) {
    this.recipientViewedNotificationMetadata = recipientViewedNotificationMetadata;
  }


  /**
   * sealIdentifiers.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation sealIdentifiers(java.util.List<SealIdentifier> sealIdentifiers) {
    this.sealIdentifiers = sealIdentifiers;
    return this;
  }
  
  /**
   * addSealIdentifiersItem.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation addSealIdentifiersItem(SealIdentifier sealIdentifiersItem) {
    if (this.sealIdentifiers == null) {
      this.sealIdentifiers = new java.util.ArrayList<>();
    }
    this.sealIdentifiers.add(sealIdentifiersItem);
    return this;
  }

  /**
   * .
   * @return sealIdentifiers
   **/
  @Schema(description = "")
  public java.util.List<SealIdentifier> getSealIdentifiers() {
    return sealIdentifiers;
  }

  /**
   * setSealIdentifiers.
   **/
  public void setSealIdentifiers(java.util.List<SealIdentifier> sealIdentifiers) {
    this.sealIdentifiers = sealIdentifiers;
  }


  /**
   * selfSignedRecipientEmailDocument.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation selfSignedRecipientEmailDocument(String selfSignedRecipientEmailDocument) {
    this.selfSignedRecipientEmailDocument = selfSignedRecipientEmailDocument;
    return this;
  }

  /**
   * .
   * @return selfSignedRecipientEmailDocument
   **/
  @Schema(description = "")
  public String getSelfSignedRecipientEmailDocument() {
    return selfSignedRecipientEmailDocument;
  }

  /**
   * setSelfSignedRecipientEmailDocument.
   **/
  public void setSelfSignedRecipientEmailDocument(String selfSignedRecipientEmailDocument) {
    this.selfSignedRecipientEmailDocument = selfSignedRecipientEmailDocument;
  }


  /**
   * selfSignedRecipientEmailDocumentMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation selfSignedRecipientEmailDocumentMetadata(SettingsMetadata selfSignedRecipientEmailDocumentMetadata) {
    this.selfSignedRecipientEmailDocumentMetadata = selfSignedRecipientEmailDocumentMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `selfSignedRecipientEmailDocument` property is editable. .
   * @return selfSignedRecipientEmailDocumentMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `selfSignedRecipientEmailDocument` property is editable. ")
  public SettingsMetadata getSelfSignedRecipientEmailDocumentMetadata() {
    return selfSignedRecipientEmailDocumentMetadata;
  }

  /**
   * setSelfSignedRecipientEmailDocumentMetadata.
   **/
  public void setSelfSignedRecipientEmailDocumentMetadata(SettingsMetadata selfSignedRecipientEmailDocumentMetadata) {
    this.selfSignedRecipientEmailDocumentMetadata = selfSignedRecipientEmailDocumentMetadata;
  }


  /**
   * senderEmailNotifications.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation senderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
    return this;
  }

  /**
   *   An array of email notifications that sets the email the user receives when they are a sender. When the specific email notification is set to true, the user will receive those types of email notifications from DocuSign.   The user inherits the default account sender email notification settings when the user is created. The email notifications are:  * envelopeComplete * changedSigner  * senderEnvelopeDeclined  * withdrawnConsent  * recipientViewed  * deliveryFailed   .
   * @return senderEmailNotifications
   **/
  @Schema(description = "  An array of email notifications that sets the email the user receives when they are a sender. When the specific email notification is set to true, the user will receive those types of email notifications from DocuSign.   The user inherits the default account sender email notification settings when the user is created. The email notifications are:  * envelopeComplete * changedSigner  * senderEnvelopeDeclined  * withdrawnConsent  * recipientViewed  * deliveryFailed   ")
  public SenderEmailNotifications getSenderEmailNotifications() {
    return senderEmailNotifications;
  }

  /**
   * setSenderEmailNotifications.
   **/
  public void setSenderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
  }


  /**
   * signerEmailNotifications.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation signerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
    return this;
  }

  /**
   * An array of email notifications that specifies the email the user receives when they are a recipient. When the specific email notification is set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account email notification settings when the user is created. .
   * @return signerEmailNotifications
   **/
  @Schema(description = "An array of email notifications that specifies the email the user receives when they are a recipient. When the specific email notification is set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account email notification settings when the user is created. ")
  public SignerEmailNotifications getSignerEmailNotifications() {
    return signerEmailNotifications;
  }

  /**
   * setSignerEmailNotifications.
   **/
  public void setSignerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
  }


  /**
   * supplementalDocumentIncludeInDownload.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation supplementalDocumentIncludeInDownload(String supplementalDocumentIncludeInDownload) {
    this.supplementalDocumentIncludeInDownload = supplementalDocumentIncludeInDownload;
    return this;
  }

  /**
   * .
   * @return supplementalDocumentIncludeInDownload
   **/
  @Schema(description = "")
  public String getSupplementalDocumentIncludeInDownload() {
    return supplementalDocumentIncludeInDownload;
  }

  /**
   * setSupplementalDocumentIncludeInDownload.
   **/
  public void setSupplementalDocumentIncludeInDownload(String supplementalDocumentIncludeInDownload) {
    this.supplementalDocumentIncludeInDownload = supplementalDocumentIncludeInDownload;
  }


  /**
   * supplementalDocumentsMustAccept.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation supplementalDocumentsMustAccept(String supplementalDocumentsMustAccept) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation supplementalDocumentsMustAcceptMetadata(SettingsMetadata supplementalDocumentsMustAcceptMetadata) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation supplementalDocumentsMustRead(String supplementalDocumentsMustRead) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation supplementalDocumentsMustReadMetadata(SettingsMetadata supplementalDocumentsMustReadMetadata) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation supplementalDocumentsMustView(String supplementalDocumentsMustView) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation supplementalDocumentsMustViewMetadata(SettingsMetadata supplementalDocumentsMustViewMetadata) {
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
   * templateActiveCreation.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation templateActiveCreation(String templateActiveCreation) {
    this.templateActiveCreation = templateActiveCreation;
    return this;
  }

  /**
   * .
   * @return templateActiveCreation
   **/
  @Schema(description = "")
  public String getTemplateActiveCreation() {
    return templateActiveCreation;
  }

  /**
   * setTemplateActiveCreation.
   **/
  public void setTemplateActiveCreation(String templateActiveCreation) {
    this.templateActiveCreation = templateActiveCreation;
  }


  /**
   * templateActiveCreationMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation templateActiveCreationMetadata(SettingsMetadata templateActiveCreationMetadata) {
    this.templateActiveCreationMetadata = templateActiveCreationMetadata;
    return this;
  }

  /**
   * Metadata about the `templateActiveCreation` property..
   * @return templateActiveCreationMetadata
   **/
  @Schema(description = "Metadata about the `templateActiveCreation` property.")
  public SettingsMetadata getTemplateActiveCreationMetadata() {
    return templateActiveCreationMetadata;
  }

  /**
   * setTemplateActiveCreationMetadata.
   **/
  public void setTemplateActiveCreationMetadata(SettingsMetadata templateActiveCreationMetadata) {
    this.templateActiveCreationMetadata = templateActiveCreationMetadata;
  }


  /**
   * templateApplyNotify.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation templateApplyNotify(String templateApplyNotify) {
    this.templateApplyNotify = templateApplyNotify;
    return this;
  }

  /**
   * .
   * @return templateApplyNotify
   **/
  @Schema(description = "")
  public String getTemplateApplyNotify() {
    return templateApplyNotify;
  }

  /**
   * setTemplateApplyNotify.
   **/
  public void setTemplateApplyNotify(String templateApplyNotify) {
    this.templateApplyNotify = templateApplyNotify;
  }


  /**
   * templateApplyNotifyMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation templateApplyNotifyMetadata(SettingsMetadata templateApplyNotifyMetadata) {
    this.templateApplyNotifyMetadata = templateApplyNotifyMetadata;
    return this;
  }

  /**
   * Metadata about the `templateApplyNotify` property..
   * @return templateApplyNotifyMetadata
   **/
  @Schema(description = "Metadata about the `templateApplyNotify` property.")
  public SettingsMetadata getTemplateApplyNotifyMetadata() {
    return templateApplyNotifyMetadata;
  }

  /**
   * setTemplateApplyNotifyMetadata.
   **/
  public void setTemplateApplyNotifyMetadata(SettingsMetadata templateApplyNotifyMetadata) {
    this.templateApplyNotifyMetadata = templateApplyNotifyMetadata;
  }


  /**
   * templateAutoMatching.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation templateAutoMatching(String templateAutoMatching) {
    this.templateAutoMatching = templateAutoMatching;
    return this;
  }

  /**
   * .
   * @return templateAutoMatching
   **/
  @Schema(description = "")
  public String getTemplateAutoMatching() {
    return templateAutoMatching;
  }

  /**
   * setTemplateAutoMatching.
   **/
  public void setTemplateAutoMatching(String templateAutoMatching) {
    this.templateAutoMatching = templateAutoMatching;
  }


  /**
   * templateAutoMatchingMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation templateAutoMatchingMetadata(SettingsMetadata templateAutoMatchingMetadata) {
    this.templateAutoMatchingMetadata = templateAutoMatchingMetadata;
    return this;
  }

  /**
   * Metadata about the `templateAutoMatching` property..
   * @return templateAutoMatchingMetadata
   **/
  @Schema(description = "Metadata about the `templateAutoMatching` property.")
  public SettingsMetadata getTemplateAutoMatchingMetadata() {
    return templateAutoMatchingMetadata;
  }

  /**
   * setTemplateAutoMatchingMetadata.
   **/
  public void setTemplateAutoMatchingMetadata(SettingsMetadata templateAutoMatchingMetadata) {
    this.templateAutoMatchingMetadata = templateAutoMatchingMetadata;
  }


  /**
   * templateMatchingSensitivity.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation templateMatchingSensitivity(String templateMatchingSensitivity) {
    this.templateMatchingSensitivity = templateMatchingSensitivity;
    return this;
  }

  /**
   * .
   * @return templateMatchingSensitivity
   **/
  @Schema(description = "")
  public String getTemplateMatchingSensitivity() {
    return templateMatchingSensitivity;
  }

  /**
   * setTemplateMatchingSensitivity.
   **/
  public void setTemplateMatchingSensitivity(String templateMatchingSensitivity) {
    this.templateMatchingSensitivity = templateMatchingSensitivity;
  }


  /**
   * templateMatchingSensitivityMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation templateMatchingSensitivityMetadata(SettingsMetadata templateMatchingSensitivityMetadata) {
    this.templateMatchingSensitivityMetadata = templateMatchingSensitivityMetadata;
    return this;
  }

  /**
   * Metadata about the `tempalteMatchingSensitivity` property..
   * @return templateMatchingSensitivityMetadata
   **/
  @Schema(description = "Metadata about the `tempalteMatchingSensitivity` property.")
  public SettingsMetadata getTemplateMatchingSensitivityMetadata() {
    return templateMatchingSensitivityMetadata;
  }

  /**
   * setTemplateMatchingSensitivityMetadata.
   **/
  public void setTemplateMatchingSensitivityMetadata(SettingsMetadata templateMatchingSensitivityMetadata) {
    this.templateMatchingSensitivityMetadata = templateMatchingSensitivityMetadata;
  }


  /**
   * templatePageLevelMatching.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation templatePageLevelMatching(String templatePageLevelMatching) {
    this.templatePageLevelMatching = templatePageLevelMatching;
    return this;
  }

  /**
   * .
   * @return templatePageLevelMatching
   **/
  @Schema(description = "")
  public String getTemplatePageLevelMatching() {
    return templatePageLevelMatching;
  }

  /**
   * setTemplatePageLevelMatching.
   **/
  public void setTemplatePageLevelMatching(String templatePageLevelMatching) {
    this.templatePageLevelMatching = templatePageLevelMatching;
  }


  /**
   * templatePageLevelMatchingMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation templatePageLevelMatchingMetadata(SettingsMetadata templatePageLevelMatchingMetadata) {
    this.templatePageLevelMatchingMetadata = templatePageLevelMatchingMetadata;
    return this;
  }

  /**
   * Metadata about the `templatePageLevelMatching` property..
   * @return templatePageLevelMatchingMetadata
   **/
  @Schema(description = "Metadata about the `templatePageLevelMatching` property.")
  public SettingsMetadata getTemplatePageLevelMatchingMetadata() {
    return templatePageLevelMatchingMetadata;
  }

  /**
   * setTemplatePageLevelMatchingMetadata.
   **/
  public void setTemplatePageLevelMatchingMetadata(SettingsMetadata templatePageLevelMatchingMetadata) {
    this.templatePageLevelMatchingMetadata = templatePageLevelMatchingMetadata;
  }


  /**
   * timezoneDST.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation timezoneDST(String timezoneDST) {
    this.timezoneDST = timezoneDST;
    return this;
  }

  /**
   * .
   * @return timezoneDST
   **/
  @Schema(description = "")
  public String getTimezoneDST() {
    return timezoneDST;
  }

  /**
   * setTimezoneDST.
   **/
  public void setTimezoneDST(String timezoneDST) {
    this.timezoneDST = timezoneDST;
  }


  /**
   * timezoneDSTMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation timezoneDSTMetadata(SettingsMetadata timezoneDSTMetadata) {
    this.timezoneDSTMetadata = timezoneDSTMetadata;
    return this;
  }

  /**
   * Metadata about the `timezoneDST` property..
   * @return timezoneDSTMetadata
   **/
  @Schema(description = "Metadata about the `timezoneDST` property.")
  public SettingsMetadata getTimezoneDSTMetadata() {
    return timezoneDSTMetadata;
  }

  /**
   * setTimezoneDSTMetadata.
   **/
  public void setTimezoneDSTMetadata(SettingsMetadata timezoneDSTMetadata) {
    this.timezoneDSTMetadata = timezoneDSTMetadata;
  }


  /**
   * timezoneMask.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation timezoneMask(String timezoneMask) {
    this.timezoneMask = timezoneMask;
    return this;
  }

  /**
   * .
   * @return timezoneMask
   **/
  @Schema(description = "")
  public String getTimezoneMask() {
    return timezoneMask;
  }

  /**
   * setTimezoneMask.
   **/
  public void setTimezoneMask(String timezoneMask) {
    this.timezoneMask = timezoneMask;
  }


  /**
   * timezoneMaskMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation timezoneMaskMetadata(SettingsMetadata timezoneMaskMetadata) {
    this.timezoneMaskMetadata = timezoneMaskMetadata;
    return this;
  }

  /**
   * Metadata about the `timezoneMask` property..
   * @return timezoneMaskMetadata
   **/
  @Schema(description = "Metadata about the `timezoneMask` property.")
  public SettingsMetadata getTimezoneMaskMetadata() {
    return timezoneMaskMetadata;
  }

  /**
   * setTimezoneMaskMetadata.
   **/
  public void setTimezoneMaskMetadata(SettingsMetadata timezoneMaskMetadata) {
    this.timezoneMaskMetadata = timezoneMaskMetadata;
  }


  /**
   * timezoneOffset.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation timezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

  /**
   * .
   * @return timezoneOffset
   **/
  @Schema(description = "")
  public String getTimezoneOffset() {
    return timezoneOffset;
  }

  /**
   * setTimezoneOffset.
   **/
  public void setTimezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }


  /**
   * timezoneOffsetMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation timezoneOffsetMetadata(SettingsMetadata timezoneOffsetMetadata) {
    this.timezoneOffsetMetadata = timezoneOffsetMetadata;
    return this;
  }

  /**
   * Metadata about the `timezoneOffset` property..
   * @return timezoneOffsetMetadata
   **/
  @Schema(description = "Metadata about the `timezoneOffset` property.")
  public SettingsMetadata getTimezoneOffsetMetadata() {
    return timezoneOffsetMetadata;
  }

  /**
   * setTimezoneOffsetMetadata.
   **/
  public void setTimezoneOffsetMetadata(SettingsMetadata timezoneOffsetMetadata) {
    this.timezoneOffsetMetadata = timezoneOffsetMetadata;
  }


  /**
   * timezoneSendingPref.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation timezoneSendingPref(String timezoneSendingPref) {
    this.timezoneSendingPref = timezoneSendingPref;
    return this;
  }

  /**
   * .
   * @return timezoneSendingPref
   **/
  @Schema(description = "")
  public String getTimezoneSendingPref() {
    return timezoneSendingPref;
  }

  /**
   * setTimezoneSendingPref.
   **/
  public void setTimezoneSendingPref(String timezoneSendingPref) {
    this.timezoneSendingPref = timezoneSendingPref;
  }


  /**
   * timezoneSendingPrefMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation timezoneSendingPrefMetadata(SettingsMetadata timezoneSendingPrefMetadata) {
    this.timezoneSendingPrefMetadata = timezoneSendingPrefMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return timezoneSendingPrefMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getTimezoneSendingPrefMetadata() {
    return timezoneSendingPrefMetadata;
  }

  /**
   * setTimezoneSendingPrefMetadata.
   **/
  public void setTimezoneSendingPrefMetadata(SettingsMetadata timezoneSendingPrefMetadata) {
    this.timezoneSendingPrefMetadata = timezoneSendingPrefMetadata;
  }


  /**
   * timezoneSigningPref.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation timezoneSigningPref(String timezoneSigningPref) {
    this.timezoneSigningPref = timezoneSigningPref;
    return this;
  }

  /**
   * .
   * @return timezoneSigningPref
   **/
  @Schema(description = "")
  public String getTimezoneSigningPref() {
    return timezoneSigningPref;
  }

  /**
   * setTimezoneSigningPref.
   **/
  public void setTimezoneSigningPref(String timezoneSigningPref) {
    this.timezoneSigningPref = timezoneSigningPref;
  }


  /**
   * timezoneSigningPrefMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation timezoneSigningPrefMetadata(SettingsMetadata timezoneSigningPrefMetadata) {
    this.timezoneSigningPrefMetadata = timezoneSigningPrefMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return timezoneSigningPrefMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getTimezoneSigningPrefMetadata() {
    return timezoneSigningPrefMetadata;
  }

  /**
   * setTimezoneSigningPrefMetadata.
   **/
  public void setTimezoneSigningPrefMetadata(SettingsMetadata timezoneSigningPrefMetadata) {
    this.timezoneSigningPrefMetadata = timezoneSigningPrefMetadata;
  }


  /**
   * transactionPointSiteNameURL.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation transactionPointSiteNameURL(String transactionPointSiteNameURL) {
    this.transactionPointSiteNameURL = transactionPointSiteNameURL;
    return this;
  }

  /**
   * .
   * @return transactionPointSiteNameURL
   **/
  @Schema(description = "")
  public String getTransactionPointSiteNameURL() {
    return transactionPointSiteNameURL;
  }

  /**
   * setTransactionPointSiteNameURL.
   **/
  public void setTransactionPointSiteNameURL(String transactionPointSiteNameURL) {
    this.transactionPointSiteNameURL = transactionPointSiteNameURL;
  }


  /**
   * transactionPointSiteNameURLMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation transactionPointSiteNameURLMetadata(SettingsMetadata transactionPointSiteNameURLMetadata) {
    this.transactionPointSiteNameURLMetadata = transactionPointSiteNameURLMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return transactionPointSiteNameURLMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getTransactionPointSiteNameURLMetadata() {
    return transactionPointSiteNameURLMetadata;
  }

  /**
   * setTransactionPointSiteNameURLMetadata.
   **/
  public void setTransactionPointSiteNameURLMetadata(SettingsMetadata transactionPointSiteNameURLMetadata) {
    this.transactionPointSiteNameURLMetadata = transactionPointSiteNameURLMetadata;
  }


  /**
   * transactionPointUserName.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation transactionPointUserName(String transactionPointUserName) {
    this.transactionPointUserName = transactionPointUserName;
    return this;
  }

  /**
   * .
   * @return transactionPointUserName
   **/
  @Schema(description = "")
  public String getTransactionPointUserName() {
    return transactionPointUserName;
  }

  /**
   * setTransactionPointUserName.
   **/
  public void setTransactionPointUserName(String transactionPointUserName) {
    this.transactionPointUserName = transactionPointUserName;
  }


  /**
   * transactionPointUserNameMetadata.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation transactionPointUserNameMetadata(SettingsMetadata transactionPointUserNameMetadata) {
    this.transactionPointUserNameMetadata = transactionPointUserNameMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return transactionPointUserNameMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SettingsMetadata getTransactionPointUserNameMetadata() {
    return transactionPointUserNameMetadata;
  }

  /**
   * setTransactionPointUserNameMetadata.
   **/
  public void setTransactionPointUserNameMetadata(SettingsMetadata transactionPointUserNameMetadata) {
    this.transactionPointUserNameMetadata = transactionPointUserNameMetadata;
  }


  /**
   * vaultingMode.
   *
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation vaultingMode(String vaultingMode) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation vaultingModeMetadata(SettingsMetadata vaultingModeMetadata) {
    this.vaultingModeMetadata = vaultingModeMetadata;
    return this;
  }

  /**
   * Metadata about the `vaultingMode` property..
   * @return vaultingModeMetadata
   **/
  @Schema(description = "Metadata about the `vaultingMode` property.")
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation webForms(String webForms) {
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
   * @return UserSettingsInformation
   **/
  public UserSettingsInformation webFormsMetadata(SettingsMetadata webFormsMetadata) {
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
    UserSettingsInformation userSettingsInformation = (UserSettingsInformation) o;
    return Objects.equals(this.accountAgreementsAccessType, userSettingsInformation.accountAgreementsAccessType) &&
        Objects.equals(this.accountAgreementsAccessTypeMetadata, userSettingsInformation.accountAgreementsAccessTypeMetadata) &&
        Objects.equals(this.accountManagementGranular, userSettingsInformation.accountManagementGranular) &&
        Objects.equals(this.adminOnly, userSettingsInformation.adminOnly) &&
        Objects.equals(this.adminOnlyMetadata, userSettingsInformation.adminOnlyMetadata) &&
        Objects.equals(this.allowAccessToAllAccountAgreements, userSettingsInformation.allowAccessToAllAccountAgreements) &&
        Objects.equals(this.allowAccessToAllAccountAgreementsMetadata, userSettingsInformation.allowAccessToAllAccountAgreementsMetadata) &&
        Objects.equals(this.allowAutoTagging, userSettingsInformation.allowAutoTagging) &&
        Objects.equals(this.allowedOrchestrationAccess, userSettingsInformation.allowedOrchestrationAccess) &&
        Objects.equals(this.allowedOrchestrationAccessMetadata, userSettingsInformation.allowedOrchestrationAccessMetadata) &&
        Objects.equals(this.allowEnvelopeTransferTo, userSettingsInformation.allowEnvelopeTransferTo) &&
        Objects.equals(this.allowEnvelopeTransferToMetadata, userSettingsInformation.allowEnvelopeTransferToMetadata) &&
        Objects.equals(this.allowEsealRecipients, userSettingsInformation.allowEsealRecipients) &&
        Objects.equals(this.allowEsealRecipientsMetadata, userSettingsInformation.allowEsealRecipientsMetadata) &&
        Objects.equals(this.allowPowerFormsAdminToAccessAllPowerFormEnvelope, userSettingsInformation.allowPowerFormsAdminToAccessAllPowerFormEnvelope) &&
        Objects.equals(this.allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata, userSettingsInformation.allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata) &&
        Objects.equals(this.allowRecipientLanguageSelection, userSettingsInformation.allowRecipientLanguageSelection) &&
        Objects.equals(this.allowRecipientLanguageSelectionMetadata, userSettingsInformation.allowRecipientLanguageSelectionMetadata) &&
        Objects.equals(this.allowSendOnBehalfOf, userSettingsInformation.allowSendOnBehalfOf) &&
        Objects.equals(this.allowSendOnBehalfOfMetadata, userSettingsInformation.allowSendOnBehalfOfMetadata) &&
        Objects.equals(this.allowSupplementalDocuments, userSettingsInformation.allowSupplementalDocuments) &&
        Objects.equals(this.allowSupplementalDocumentsMetadata, userSettingsInformation.allowSupplementalDocumentsMetadata) &&
        Objects.equals(this.allowTransactions, userSettingsInformation.allowTransactions) &&
        Objects.equals(this.allowTransactionsMetadata, userSettingsInformation.allowTransactionsMetadata) &&
        Objects.equals(this.anchorTagVersionedPlacementEnabled, userSettingsInformation.anchorTagVersionedPlacementEnabled) &&
        Objects.equals(this.apiAccountWideAccess, userSettingsInformation.apiAccountWideAccess) &&
        Objects.equals(this.apiAccountWideAccessMetadata, userSettingsInformation.apiAccountWideAccessMetadata) &&
        Objects.equals(this.apiCanExportAC, userSettingsInformation.apiCanExportAC) &&
        Objects.equals(this.apiCanExportACMetadata, userSettingsInformation.apiCanExportACMetadata) &&
        Objects.equals(this.bulkSend, userSettingsInformation.bulkSend) &&
        Objects.equals(this.bulkSendMetadata, userSettingsInformation.bulkSendMetadata) &&
        Objects.equals(this.canBulkUploadAgreements, userSettingsInformation.canBulkUploadAgreements) &&
        Objects.equals(this.canBulkUploadAgreementsMetadata, userSettingsInformation.canBulkUploadAgreementsMetadata) &&
        Objects.equals(this.canChargeAccount, userSettingsInformation.canChargeAccount) &&
        Objects.equals(this.canChargeAccountMetadata, userSettingsInformation.canChargeAccountMetadata) &&
        Objects.equals(this.canCreateTransaction, userSettingsInformation.canCreateTransaction) &&
        Objects.equals(this.canCreateTransactionMetadata, userSettingsInformation.canCreateTransactionMetadata) &&
        Objects.equals(this.canDeleteDocumentsInTransaction, userSettingsInformation.canDeleteDocumentsInTransaction) &&
        Objects.equals(this.canDeleteDocumentsInTransactionMetadata, userSettingsInformation.canDeleteDocumentsInTransactionMetadata) &&
        Objects.equals(this.canDeleteTransaction, userSettingsInformation.canDeleteTransaction) &&
        Objects.equals(this.canDeleteTransactionMetadata, userSettingsInformation.canDeleteTransactionMetadata) &&
        Objects.equals(this.canEditSharedAddressbook, userSettingsInformation.canEditSharedAddressbook) &&
        Objects.equals(this.canEditSharedAddressbookMetadata, userSettingsInformation.canEditSharedAddressbookMetadata) &&
        Objects.equals(this.canLockEnvelopes, userSettingsInformation.canLockEnvelopes) &&
        Objects.equals(this.canLockEnvelopesMetadata, userSettingsInformation.canLockEnvelopesMetadata) &&
        Objects.equals(this.canManageAccount, userSettingsInformation.canManageAccount) &&
        Objects.equals(this.canManageAccountMetadata, userSettingsInformation.canManageAccountMetadata) &&
        Objects.equals(this.canManageAgreementParties, userSettingsInformation.canManageAgreementParties) &&
        Objects.equals(this.canManageAgreementPartiesMetadata, userSettingsInformation.canManageAgreementPartiesMetadata) &&
        Objects.equals(this.canManageDistributor, userSettingsInformation.canManageDistributor) &&
        Objects.equals(this.canManageDistributorMetadata, userSettingsInformation.canManageDistributorMetadata) &&
        Objects.equals(this.canManageTemplates, userSettingsInformation.canManageTemplates) &&
        Objects.equals(this.canManageTemplatesMetadata, userSettingsInformation.canManageTemplatesMetadata) &&
        Objects.equals(this.canSendAPIRequests, userSettingsInformation.canSendAPIRequests) &&
        Objects.equals(this.canSendAPIRequestsMetadata, userSettingsInformation.canSendAPIRequestsMetadata) &&
        Objects.equals(this.canSendEnvelope, userSettingsInformation.canSendEnvelope) &&
        Objects.equals(this.canSendEnvelopeMetadata, userSettingsInformation.canSendEnvelopeMetadata) &&
        Objects.equals(this.canSendEnvelopesViaSMS, userSettingsInformation.canSendEnvelopesViaSMS) &&
        Objects.equals(this.canSendEnvelopesViaSMSMetadata, userSettingsInformation.canSendEnvelopesViaSMSMetadata) &&
        Objects.equals(this.canSignEnvelope, userSettingsInformation.canSignEnvelope) &&
        Objects.equals(this.canSignEnvelopeMetadata, userSettingsInformation.canSignEnvelopeMetadata) &&
        Objects.equals(this.canUseScratchpad, userSettingsInformation.canUseScratchpad) &&
        Objects.equals(this.canUseScratchpadMetadata, userSettingsInformation.canUseScratchpadMetadata) &&
        Objects.equals(this.canUseSmartContracts, userSettingsInformation.canUseSmartContracts) &&
        Objects.equals(this.canUseSmartContractsMetadata, userSettingsInformation.canUseSmartContractsMetadata) &&
        Objects.equals(this.disableDocumentUpload, userSettingsInformation.disableDocumentUpload) &&
        Objects.equals(this.disableDocumentUploadMetadata, userSettingsInformation.disableDocumentUploadMetadata) &&
        Objects.equals(this.disableOtherActions, userSettingsInformation.disableOtherActions) &&
        Objects.equals(this.disableOtherActionsMetadata, userSettingsInformation.disableOtherActionsMetadata) &&
        Objects.equals(this.enableDSPro, userSettingsInformation.enableDSPro) &&
        Objects.equals(this.enableDSProMetadata, userSettingsInformation.enableDSProMetadata) &&
        Objects.equals(this.enableKeyTermsSuggestionsByDocumentType, userSettingsInformation.enableKeyTermsSuggestionsByDocumentType) &&
        Objects.equals(this.enableKeyTermsSuggestionsByDocumentTypeMetadata, userSettingsInformation.enableKeyTermsSuggestionsByDocumentTypeMetadata) &&
        Objects.equals(this.enableSequentialSigningAPI, userSettingsInformation.enableSequentialSigningAPI) &&
        Objects.equals(this.enableSequentialSigningAPIMetadata, userSettingsInformation.enableSequentialSigningAPIMetadata) &&
        Objects.equals(this.enableSequentialSigningUI, userSettingsInformation.enableSequentialSigningUI) &&
        Objects.equals(this.enableSequentialSigningUIMetadata, userSettingsInformation.enableSequentialSigningUIMetadata) &&
        Objects.equals(this.enableSignerAttachments, userSettingsInformation.enableSignerAttachments) &&
        Objects.equals(this.enableSignerAttachmentsMetadata, userSettingsInformation.enableSignerAttachmentsMetadata) &&
        Objects.equals(this.enableSignOnPaperOverride, userSettingsInformation.enableSignOnPaperOverride) &&
        Objects.equals(this.enableSignOnPaperOverrideMetadata, userSettingsInformation.enableSignOnPaperOverrideMetadata) &&
        Objects.equals(this.enableTransactionPoint, userSettingsInformation.enableTransactionPoint) &&
        Objects.equals(this.enableTransactionPointMetadata, userSettingsInformation.enableTransactionPointMetadata) &&
        Objects.equals(this.enableVaulting, userSettingsInformation.enableVaulting) &&
        Objects.equals(this.enableVaultingMetadata, userSettingsInformation.enableVaultingMetadata) &&
        Objects.equals(this.expressSendOnly, userSettingsInformation.expressSendOnly) &&
        Objects.equals(this.locale, userSettingsInformation.locale) &&
        Objects.equals(this.localeMetadata, userSettingsInformation.localeMetadata) &&
        Objects.equals(this.localePolicy, userSettingsInformation.localePolicy) &&
        Objects.equals(this.manageClickwrapsMode, userSettingsInformation.manageClickwrapsMode) &&
        Objects.equals(this.manageClickwrapsModeMetadata, userSettingsInformation.manageClickwrapsModeMetadata) &&
        Objects.equals(this.modifiedBy, userSettingsInformation.modifiedBy) &&
        Objects.equals(this.modifiedByMetadata, userSettingsInformation.modifiedByMetadata) &&
        Objects.equals(this.modifiedDate, userSettingsInformation.modifiedDate) &&
        Objects.equals(this.modifiedDateMetadata, userSettingsInformation.modifiedDateMetadata) &&
        Objects.equals(this.modifiedPage, userSettingsInformation.modifiedPage) &&
        Objects.equals(this.modifiedPageMetadata, userSettingsInformation.modifiedPageMetadata) &&
        Objects.equals(this.newSendUI, userSettingsInformation.newSendUI) &&
        Objects.equals(this.newSendUIMetadata, userSettingsInformation.newSendUIMetadata) &&
        Objects.equals(this.powerFormMode, userSettingsInformation.powerFormMode) &&
        Objects.equals(this.powerFormModeMetadata, userSettingsInformation.powerFormModeMetadata) &&
        Objects.equals(this.recipientViewedNotification, userSettingsInformation.recipientViewedNotification) &&
        Objects.equals(this.recipientViewedNotificationMetadata, userSettingsInformation.recipientViewedNotificationMetadata) &&
        Objects.equals(this.sealIdentifiers, userSettingsInformation.sealIdentifiers) &&
        Objects.equals(this.selfSignedRecipientEmailDocument, userSettingsInformation.selfSignedRecipientEmailDocument) &&
        Objects.equals(this.selfSignedRecipientEmailDocumentMetadata, userSettingsInformation.selfSignedRecipientEmailDocumentMetadata) &&
        Objects.equals(this.senderEmailNotifications, userSettingsInformation.senderEmailNotifications) &&
        Objects.equals(this.signerEmailNotifications, userSettingsInformation.signerEmailNotifications) &&
        Objects.equals(this.supplementalDocumentIncludeInDownload, userSettingsInformation.supplementalDocumentIncludeInDownload) &&
        Objects.equals(this.supplementalDocumentsMustAccept, userSettingsInformation.supplementalDocumentsMustAccept) &&
        Objects.equals(this.supplementalDocumentsMustAcceptMetadata, userSettingsInformation.supplementalDocumentsMustAcceptMetadata) &&
        Objects.equals(this.supplementalDocumentsMustRead, userSettingsInformation.supplementalDocumentsMustRead) &&
        Objects.equals(this.supplementalDocumentsMustReadMetadata, userSettingsInformation.supplementalDocumentsMustReadMetadata) &&
        Objects.equals(this.supplementalDocumentsMustView, userSettingsInformation.supplementalDocumentsMustView) &&
        Objects.equals(this.supplementalDocumentsMustViewMetadata, userSettingsInformation.supplementalDocumentsMustViewMetadata) &&
        Objects.equals(this.templateActiveCreation, userSettingsInformation.templateActiveCreation) &&
        Objects.equals(this.templateActiveCreationMetadata, userSettingsInformation.templateActiveCreationMetadata) &&
        Objects.equals(this.templateApplyNotify, userSettingsInformation.templateApplyNotify) &&
        Objects.equals(this.templateApplyNotifyMetadata, userSettingsInformation.templateApplyNotifyMetadata) &&
        Objects.equals(this.templateAutoMatching, userSettingsInformation.templateAutoMatching) &&
        Objects.equals(this.templateAutoMatchingMetadata, userSettingsInformation.templateAutoMatchingMetadata) &&
        Objects.equals(this.templateMatchingSensitivity, userSettingsInformation.templateMatchingSensitivity) &&
        Objects.equals(this.templateMatchingSensitivityMetadata, userSettingsInformation.templateMatchingSensitivityMetadata) &&
        Objects.equals(this.templatePageLevelMatching, userSettingsInformation.templatePageLevelMatching) &&
        Objects.equals(this.templatePageLevelMatchingMetadata, userSettingsInformation.templatePageLevelMatchingMetadata) &&
        Objects.equals(this.timezoneDST, userSettingsInformation.timezoneDST) &&
        Objects.equals(this.timezoneDSTMetadata, userSettingsInformation.timezoneDSTMetadata) &&
        Objects.equals(this.timezoneMask, userSettingsInformation.timezoneMask) &&
        Objects.equals(this.timezoneMaskMetadata, userSettingsInformation.timezoneMaskMetadata) &&
        Objects.equals(this.timezoneOffset, userSettingsInformation.timezoneOffset) &&
        Objects.equals(this.timezoneOffsetMetadata, userSettingsInformation.timezoneOffsetMetadata) &&
        Objects.equals(this.timezoneSendingPref, userSettingsInformation.timezoneSendingPref) &&
        Objects.equals(this.timezoneSendingPrefMetadata, userSettingsInformation.timezoneSendingPrefMetadata) &&
        Objects.equals(this.timezoneSigningPref, userSettingsInformation.timezoneSigningPref) &&
        Objects.equals(this.timezoneSigningPrefMetadata, userSettingsInformation.timezoneSigningPrefMetadata) &&
        Objects.equals(this.transactionPointSiteNameURL, userSettingsInformation.transactionPointSiteNameURL) &&
        Objects.equals(this.transactionPointSiteNameURLMetadata, userSettingsInformation.transactionPointSiteNameURLMetadata) &&
        Objects.equals(this.transactionPointUserName, userSettingsInformation.transactionPointUserName) &&
        Objects.equals(this.transactionPointUserNameMetadata, userSettingsInformation.transactionPointUserNameMetadata) &&
        Objects.equals(this.vaultingMode, userSettingsInformation.vaultingMode) &&
        Objects.equals(this.vaultingModeMetadata, userSettingsInformation.vaultingModeMetadata) &&
        Objects.equals(this.webForms, userSettingsInformation.webForms) &&
        Objects.equals(this.webFormsMetadata, userSettingsInformation.webFormsMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountAgreementsAccessType, accountAgreementsAccessTypeMetadata, accountManagementGranular, adminOnly, adminOnlyMetadata, allowAccessToAllAccountAgreements, allowAccessToAllAccountAgreementsMetadata, allowAutoTagging, allowedOrchestrationAccess, allowedOrchestrationAccessMetadata, allowEnvelopeTransferTo, allowEnvelopeTransferToMetadata, allowEsealRecipients, allowEsealRecipientsMetadata, allowPowerFormsAdminToAccessAllPowerFormEnvelope, allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata, allowRecipientLanguageSelection, allowRecipientLanguageSelectionMetadata, allowSendOnBehalfOf, allowSendOnBehalfOfMetadata, allowSupplementalDocuments, allowSupplementalDocumentsMetadata, allowTransactions, allowTransactionsMetadata, anchorTagVersionedPlacementEnabled, apiAccountWideAccess, apiAccountWideAccessMetadata, apiCanExportAC, apiCanExportACMetadata, bulkSend, bulkSendMetadata, canBulkUploadAgreements, canBulkUploadAgreementsMetadata, canChargeAccount, canChargeAccountMetadata, canCreateTransaction, canCreateTransactionMetadata, canDeleteDocumentsInTransaction, canDeleteDocumentsInTransactionMetadata, canDeleteTransaction, canDeleteTransactionMetadata, canEditSharedAddressbook, canEditSharedAddressbookMetadata, canLockEnvelopes, canLockEnvelopesMetadata, canManageAccount, canManageAccountMetadata, canManageAgreementParties, canManageAgreementPartiesMetadata, canManageDistributor, canManageDistributorMetadata, canManageTemplates, canManageTemplatesMetadata, canSendAPIRequests, canSendAPIRequestsMetadata, canSendEnvelope, canSendEnvelopeMetadata, canSendEnvelopesViaSMS, canSendEnvelopesViaSMSMetadata, canSignEnvelope, canSignEnvelopeMetadata, canUseScratchpad, canUseScratchpadMetadata, canUseSmartContracts, canUseSmartContractsMetadata, disableDocumentUpload, disableDocumentUploadMetadata, disableOtherActions, disableOtherActionsMetadata, enableDSPro, enableDSProMetadata, enableKeyTermsSuggestionsByDocumentType, enableKeyTermsSuggestionsByDocumentTypeMetadata, enableSequentialSigningAPI, enableSequentialSigningAPIMetadata, enableSequentialSigningUI, enableSequentialSigningUIMetadata, enableSignerAttachments, enableSignerAttachmentsMetadata, enableSignOnPaperOverride, enableSignOnPaperOverrideMetadata, enableTransactionPoint, enableTransactionPointMetadata, enableVaulting, enableVaultingMetadata, expressSendOnly, locale, localeMetadata, localePolicy, manageClickwrapsMode, manageClickwrapsModeMetadata, modifiedBy, modifiedByMetadata, modifiedDate, modifiedDateMetadata, modifiedPage, modifiedPageMetadata, newSendUI, newSendUIMetadata, powerFormMode, powerFormModeMetadata, recipientViewedNotification, recipientViewedNotificationMetadata, sealIdentifiers, selfSignedRecipientEmailDocument, selfSignedRecipientEmailDocumentMetadata, senderEmailNotifications, signerEmailNotifications, supplementalDocumentIncludeInDownload, supplementalDocumentsMustAccept, supplementalDocumentsMustAcceptMetadata, supplementalDocumentsMustRead, supplementalDocumentsMustReadMetadata, supplementalDocumentsMustView, supplementalDocumentsMustViewMetadata, templateActiveCreation, templateActiveCreationMetadata, templateApplyNotify, templateApplyNotifyMetadata, templateAutoMatching, templateAutoMatchingMetadata, templateMatchingSensitivity, templateMatchingSensitivityMetadata, templatePageLevelMatching, templatePageLevelMatchingMetadata, timezoneDST, timezoneDSTMetadata, timezoneMask, timezoneMaskMetadata, timezoneOffset, timezoneOffsetMetadata, timezoneSendingPref, timezoneSendingPrefMetadata, timezoneSigningPref, timezoneSigningPrefMetadata, transactionPointSiteNameURL, transactionPointSiteNameURLMetadata, transactionPointUserName, transactionPointUserNameMetadata, vaultingMode, vaultingModeMetadata, webForms, webFormsMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettingsInformation {\n");
    
    sb.append("    accountAgreementsAccessType: ").append(toIndentedString(accountAgreementsAccessType)).append("\n");
    sb.append("    accountAgreementsAccessTypeMetadata: ").append(toIndentedString(accountAgreementsAccessTypeMetadata)).append("\n");
    sb.append("    accountManagementGranular: ").append(toIndentedString(accountManagementGranular)).append("\n");
    sb.append("    adminOnly: ").append(toIndentedString(adminOnly)).append("\n");
    sb.append("    adminOnlyMetadata: ").append(toIndentedString(adminOnlyMetadata)).append("\n");
    sb.append("    allowAccessToAllAccountAgreements: ").append(toIndentedString(allowAccessToAllAccountAgreements)).append("\n");
    sb.append("    allowAccessToAllAccountAgreementsMetadata: ").append(toIndentedString(allowAccessToAllAccountAgreementsMetadata)).append("\n");
    sb.append("    allowAutoTagging: ").append(toIndentedString(allowAutoTagging)).append("\n");
    sb.append("    allowedOrchestrationAccess: ").append(toIndentedString(allowedOrchestrationAccess)).append("\n");
    sb.append("    allowedOrchestrationAccessMetadata: ").append(toIndentedString(allowedOrchestrationAccessMetadata)).append("\n");
    sb.append("    allowEnvelopeTransferTo: ").append(toIndentedString(allowEnvelopeTransferTo)).append("\n");
    sb.append("    allowEnvelopeTransferToMetadata: ").append(toIndentedString(allowEnvelopeTransferToMetadata)).append("\n");
    sb.append("    allowEsealRecipients: ").append(toIndentedString(allowEsealRecipients)).append("\n");
    sb.append("    allowEsealRecipientsMetadata: ").append(toIndentedString(allowEsealRecipientsMetadata)).append("\n");
    sb.append("    allowPowerFormsAdminToAccessAllPowerFormEnvelope: ").append(toIndentedString(allowPowerFormsAdminToAccessAllPowerFormEnvelope)).append("\n");
    sb.append("    allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata: ").append(toIndentedString(allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata)).append("\n");
    sb.append("    allowRecipientLanguageSelection: ").append(toIndentedString(allowRecipientLanguageSelection)).append("\n");
    sb.append("    allowRecipientLanguageSelectionMetadata: ").append(toIndentedString(allowRecipientLanguageSelectionMetadata)).append("\n");
    sb.append("    allowSendOnBehalfOf: ").append(toIndentedString(allowSendOnBehalfOf)).append("\n");
    sb.append("    allowSendOnBehalfOfMetadata: ").append(toIndentedString(allowSendOnBehalfOfMetadata)).append("\n");
    sb.append("    allowSupplementalDocuments: ").append(toIndentedString(allowSupplementalDocuments)).append("\n");
    sb.append("    allowSupplementalDocumentsMetadata: ").append(toIndentedString(allowSupplementalDocumentsMetadata)).append("\n");
    sb.append("    allowTransactions: ").append(toIndentedString(allowTransactions)).append("\n");
    sb.append("    allowTransactionsMetadata: ").append(toIndentedString(allowTransactionsMetadata)).append("\n");
    sb.append("    anchorTagVersionedPlacementEnabled: ").append(toIndentedString(anchorTagVersionedPlacementEnabled)).append("\n");
    sb.append("    apiAccountWideAccess: ").append(toIndentedString(apiAccountWideAccess)).append("\n");
    sb.append("    apiAccountWideAccessMetadata: ").append(toIndentedString(apiAccountWideAccessMetadata)).append("\n");
    sb.append("    apiCanExportAC: ").append(toIndentedString(apiCanExportAC)).append("\n");
    sb.append("    apiCanExportACMetadata: ").append(toIndentedString(apiCanExportACMetadata)).append("\n");
    sb.append("    bulkSend: ").append(toIndentedString(bulkSend)).append("\n");
    sb.append("    bulkSendMetadata: ").append(toIndentedString(bulkSendMetadata)).append("\n");
    sb.append("    canBulkUploadAgreements: ").append(toIndentedString(canBulkUploadAgreements)).append("\n");
    sb.append("    canBulkUploadAgreementsMetadata: ").append(toIndentedString(canBulkUploadAgreementsMetadata)).append("\n");
    sb.append("    canChargeAccount: ").append(toIndentedString(canChargeAccount)).append("\n");
    sb.append("    canChargeAccountMetadata: ").append(toIndentedString(canChargeAccountMetadata)).append("\n");
    sb.append("    canCreateTransaction: ").append(toIndentedString(canCreateTransaction)).append("\n");
    sb.append("    canCreateTransactionMetadata: ").append(toIndentedString(canCreateTransactionMetadata)).append("\n");
    sb.append("    canDeleteDocumentsInTransaction: ").append(toIndentedString(canDeleteDocumentsInTransaction)).append("\n");
    sb.append("    canDeleteDocumentsInTransactionMetadata: ").append(toIndentedString(canDeleteDocumentsInTransactionMetadata)).append("\n");
    sb.append("    canDeleteTransaction: ").append(toIndentedString(canDeleteTransaction)).append("\n");
    sb.append("    canDeleteTransactionMetadata: ").append(toIndentedString(canDeleteTransactionMetadata)).append("\n");
    sb.append("    canEditSharedAddressbook: ").append(toIndentedString(canEditSharedAddressbook)).append("\n");
    sb.append("    canEditSharedAddressbookMetadata: ").append(toIndentedString(canEditSharedAddressbookMetadata)).append("\n");
    sb.append("    canLockEnvelopes: ").append(toIndentedString(canLockEnvelopes)).append("\n");
    sb.append("    canLockEnvelopesMetadata: ").append(toIndentedString(canLockEnvelopesMetadata)).append("\n");
    sb.append("    canManageAccount: ").append(toIndentedString(canManageAccount)).append("\n");
    sb.append("    canManageAccountMetadata: ").append(toIndentedString(canManageAccountMetadata)).append("\n");
    sb.append("    canManageAgreementParties: ").append(toIndentedString(canManageAgreementParties)).append("\n");
    sb.append("    canManageAgreementPartiesMetadata: ").append(toIndentedString(canManageAgreementPartiesMetadata)).append("\n");
    sb.append("    canManageDistributor: ").append(toIndentedString(canManageDistributor)).append("\n");
    sb.append("    canManageDistributorMetadata: ").append(toIndentedString(canManageDistributorMetadata)).append("\n");
    sb.append("    canManageTemplates: ").append(toIndentedString(canManageTemplates)).append("\n");
    sb.append("    canManageTemplatesMetadata: ").append(toIndentedString(canManageTemplatesMetadata)).append("\n");
    sb.append("    canSendAPIRequests: ").append(toIndentedString(canSendAPIRequests)).append("\n");
    sb.append("    canSendAPIRequestsMetadata: ").append(toIndentedString(canSendAPIRequestsMetadata)).append("\n");
    sb.append("    canSendEnvelope: ").append(toIndentedString(canSendEnvelope)).append("\n");
    sb.append("    canSendEnvelopeMetadata: ").append(toIndentedString(canSendEnvelopeMetadata)).append("\n");
    sb.append("    canSendEnvelopesViaSMS: ").append(toIndentedString(canSendEnvelopesViaSMS)).append("\n");
    sb.append("    canSendEnvelopesViaSMSMetadata: ").append(toIndentedString(canSendEnvelopesViaSMSMetadata)).append("\n");
    sb.append("    canSignEnvelope: ").append(toIndentedString(canSignEnvelope)).append("\n");
    sb.append("    canSignEnvelopeMetadata: ").append(toIndentedString(canSignEnvelopeMetadata)).append("\n");
    sb.append("    canUseScratchpad: ").append(toIndentedString(canUseScratchpad)).append("\n");
    sb.append("    canUseScratchpadMetadata: ").append(toIndentedString(canUseScratchpadMetadata)).append("\n");
    sb.append("    canUseSmartContracts: ").append(toIndentedString(canUseSmartContracts)).append("\n");
    sb.append("    canUseSmartContractsMetadata: ").append(toIndentedString(canUseSmartContractsMetadata)).append("\n");
    sb.append("    disableDocumentUpload: ").append(toIndentedString(disableDocumentUpload)).append("\n");
    sb.append("    disableDocumentUploadMetadata: ").append(toIndentedString(disableDocumentUploadMetadata)).append("\n");
    sb.append("    disableOtherActions: ").append(toIndentedString(disableOtherActions)).append("\n");
    sb.append("    disableOtherActionsMetadata: ").append(toIndentedString(disableOtherActionsMetadata)).append("\n");
    sb.append("    enableDSPro: ").append(toIndentedString(enableDSPro)).append("\n");
    sb.append("    enableDSProMetadata: ").append(toIndentedString(enableDSProMetadata)).append("\n");
    sb.append("    enableKeyTermsSuggestionsByDocumentType: ").append(toIndentedString(enableKeyTermsSuggestionsByDocumentType)).append("\n");
    sb.append("    enableKeyTermsSuggestionsByDocumentTypeMetadata: ").append(toIndentedString(enableKeyTermsSuggestionsByDocumentTypeMetadata)).append("\n");
    sb.append("    enableSequentialSigningAPI: ").append(toIndentedString(enableSequentialSigningAPI)).append("\n");
    sb.append("    enableSequentialSigningAPIMetadata: ").append(toIndentedString(enableSequentialSigningAPIMetadata)).append("\n");
    sb.append("    enableSequentialSigningUI: ").append(toIndentedString(enableSequentialSigningUI)).append("\n");
    sb.append("    enableSequentialSigningUIMetadata: ").append(toIndentedString(enableSequentialSigningUIMetadata)).append("\n");
    sb.append("    enableSignerAttachments: ").append(toIndentedString(enableSignerAttachments)).append("\n");
    sb.append("    enableSignerAttachmentsMetadata: ").append(toIndentedString(enableSignerAttachmentsMetadata)).append("\n");
    sb.append("    enableSignOnPaperOverride: ").append(toIndentedString(enableSignOnPaperOverride)).append("\n");
    sb.append("    enableSignOnPaperOverrideMetadata: ").append(toIndentedString(enableSignOnPaperOverrideMetadata)).append("\n");
    sb.append("    enableTransactionPoint: ").append(toIndentedString(enableTransactionPoint)).append("\n");
    sb.append("    enableTransactionPointMetadata: ").append(toIndentedString(enableTransactionPointMetadata)).append("\n");
    sb.append("    enableVaulting: ").append(toIndentedString(enableVaulting)).append("\n");
    sb.append("    enableVaultingMetadata: ").append(toIndentedString(enableVaultingMetadata)).append("\n");
    sb.append("    expressSendOnly: ").append(toIndentedString(expressSendOnly)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    localeMetadata: ").append(toIndentedString(localeMetadata)).append("\n");
    sb.append("    localePolicy: ").append(toIndentedString(localePolicy)).append("\n");
    sb.append("    manageClickwrapsMode: ").append(toIndentedString(manageClickwrapsMode)).append("\n");
    sb.append("    manageClickwrapsModeMetadata: ").append(toIndentedString(manageClickwrapsModeMetadata)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedByMetadata: ").append(toIndentedString(modifiedByMetadata)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedDateMetadata: ").append(toIndentedString(modifiedDateMetadata)).append("\n");
    sb.append("    modifiedPage: ").append(toIndentedString(modifiedPage)).append("\n");
    sb.append("    modifiedPageMetadata: ").append(toIndentedString(modifiedPageMetadata)).append("\n");
    sb.append("    newSendUI: ").append(toIndentedString(newSendUI)).append("\n");
    sb.append("    newSendUIMetadata: ").append(toIndentedString(newSendUIMetadata)).append("\n");
    sb.append("    powerFormMode: ").append(toIndentedString(powerFormMode)).append("\n");
    sb.append("    powerFormModeMetadata: ").append(toIndentedString(powerFormModeMetadata)).append("\n");
    sb.append("    recipientViewedNotification: ").append(toIndentedString(recipientViewedNotification)).append("\n");
    sb.append("    recipientViewedNotificationMetadata: ").append(toIndentedString(recipientViewedNotificationMetadata)).append("\n");
    sb.append("    sealIdentifiers: ").append(toIndentedString(sealIdentifiers)).append("\n");
    sb.append("    selfSignedRecipientEmailDocument: ").append(toIndentedString(selfSignedRecipientEmailDocument)).append("\n");
    sb.append("    selfSignedRecipientEmailDocumentMetadata: ").append(toIndentedString(selfSignedRecipientEmailDocumentMetadata)).append("\n");
    sb.append("    senderEmailNotifications: ").append(toIndentedString(senderEmailNotifications)).append("\n");
    sb.append("    signerEmailNotifications: ").append(toIndentedString(signerEmailNotifications)).append("\n");
    sb.append("    supplementalDocumentIncludeInDownload: ").append(toIndentedString(supplementalDocumentIncludeInDownload)).append("\n");
    sb.append("    supplementalDocumentsMustAccept: ").append(toIndentedString(supplementalDocumentsMustAccept)).append("\n");
    sb.append("    supplementalDocumentsMustAcceptMetadata: ").append(toIndentedString(supplementalDocumentsMustAcceptMetadata)).append("\n");
    sb.append("    supplementalDocumentsMustRead: ").append(toIndentedString(supplementalDocumentsMustRead)).append("\n");
    sb.append("    supplementalDocumentsMustReadMetadata: ").append(toIndentedString(supplementalDocumentsMustReadMetadata)).append("\n");
    sb.append("    supplementalDocumentsMustView: ").append(toIndentedString(supplementalDocumentsMustView)).append("\n");
    sb.append("    supplementalDocumentsMustViewMetadata: ").append(toIndentedString(supplementalDocumentsMustViewMetadata)).append("\n");
    sb.append("    templateActiveCreation: ").append(toIndentedString(templateActiveCreation)).append("\n");
    sb.append("    templateActiveCreationMetadata: ").append(toIndentedString(templateActiveCreationMetadata)).append("\n");
    sb.append("    templateApplyNotify: ").append(toIndentedString(templateApplyNotify)).append("\n");
    sb.append("    templateApplyNotifyMetadata: ").append(toIndentedString(templateApplyNotifyMetadata)).append("\n");
    sb.append("    templateAutoMatching: ").append(toIndentedString(templateAutoMatching)).append("\n");
    sb.append("    templateAutoMatchingMetadata: ").append(toIndentedString(templateAutoMatchingMetadata)).append("\n");
    sb.append("    templateMatchingSensitivity: ").append(toIndentedString(templateMatchingSensitivity)).append("\n");
    sb.append("    templateMatchingSensitivityMetadata: ").append(toIndentedString(templateMatchingSensitivityMetadata)).append("\n");
    sb.append("    templatePageLevelMatching: ").append(toIndentedString(templatePageLevelMatching)).append("\n");
    sb.append("    templatePageLevelMatchingMetadata: ").append(toIndentedString(templatePageLevelMatchingMetadata)).append("\n");
    sb.append("    timezoneDST: ").append(toIndentedString(timezoneDST)).append("\n");
    sb.append("    timezoneDSTMetadata: ").append(toIndentedString(timezoneDSTMetadata)).append("\n");
    sb.append("    timezoneMask: ").append(toIndentedString(timezoneMask)).append("\n");
    sb.append("    timezoneMaskMetadata: ").append(toIndentedString(timezoneMaskMetadata)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    timezoneOffsetMetadata: ").append(toIndentedString(timezoneOffsetMetadata)).append("\n");
    sb.append("    timezoneSendingPref: ").append(toIndentedString(timezoneSendingPref)).append("\n");
    sb.append("    timezoneSendingPrefMetadata: ").append(toIndentedString(timezoneSendingPrefMetadata)).append("\n");
    sb.append("    timezoneSigningPref: ").append(toIndentedString(timezoneSigningPref)).append("\n");
    sb.append("    timezoneSigningPrefMetadata: ").append(toIndentedString(timezoneSigningPrefMetadata)).append("\n");
    sb.append("    transactionPointSiteNameURL: ").append(toIndentedString(transactionPointSiteNameURL)).append("\n");
    sb.append("    transactionPointSiteNameURLMetadata: ").append(toIndentedString(transactionPointSiteNameURLMetadata)).append("\n");
    sb.append("    transactionPointUserName: ").append(toIndentedString(transactionPointUserName)).append("\n");
    sb.append("    transactionPointUserNameMetadata: ").append(toIndentedString(transactionPointUserNameMetadata)).append("\n");
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

