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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserSettingsInformation
 */

public class UserSettingsInformation {
  @JsonProperty("accountManagementGranular")
  private UserAccountManagementGranularInformation accountManagementGranular = null;

  @JsonProperty("adminOnly")
  private String adminOnly = null;

  @JsonProperty("adminOnlyMetadata")
  private SettingsMetadata adminOnlyMetadata = null;

  @JsonProperty("allowAutoTagging")
  private String allowAutoTagging = null;

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

  @JsonProperty("canChargeAccount")
  private String canChargeAccount = null;

  @JsonProperty("canChargeAccountMetadata")
  private SettingsMetadata canChargeAccountMetadata = null;

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

  public UserSettingsInformation accountManagementGranular(UserAccountManagementGranularInformation accountManagementGranular) {
    this.accountManagementGranular = accountManagementGranular;
    return this;
  }

   /**
   * Get accountManagementGranular
   * @return accountManagementGranular
  **/
  @ApiModelProperty(value = "")
  public UserAccountManagementGranularInformation getAccountManagementGranular() {
    return accountManagementGranular;
  }

  public void setAccountManagementGranular(UserAccountManagementGranularInformation accountManagementGranular) {
    this.accountManagementGranular = accountManagementGranular;
  }

  public UserSettingsInformation adminOnly(String adminOnly) {
    this.adminOnly = adminOnly;
    return this;
  }

   /**
   * 
   * @return adminOnly
  **/
  @ApiModelProperty(value = "")
  public String getAdminOnly() {
    return adminOnly;
  }

  public void setAdminOnly(String adminOnly) {
    this.adminOnly = adminOnly;
  }

  public UserSettingsInformation adminOnlyMetadata(SettingsMetadata adminOnlyMetadata) {
    this.adminOnlyMetadata = adminOnlyMetadata;
    return this;
  }

   /**
   * Get adminOnlyMetadata
   * @return adminOnlyMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAdminOnlyMetadata() {
    return adminOnlyMetadata;
  }

  public void setAdminOnlyMetadata(SettingsMetadata adminOnlyMetadata) {
    this.adminOnlyMetadata = adminOnlyMetadata;
  }

  public UserSettingsInformation allowAutoTagging(String allowAutoTagging) {
    this.allowAutoTagging = allowAutoTagging;
    return this;
  }

   /**
   * 
   * @return allowAutoTagging
  **/
  @ApiModelProperty(value = "")
  public String getAllowAutoTagging() {
    return allowAutoTagging;
  }

  public void setAllowAutoTagging(String allowAutoTagging) {
    this.allowAutoTagging = allowAutoTagging;
  }

  public UserSettingsInformation allowEnvelopeTransferTo(String allowEnvelopeTransferTo) {
    this.allowEnvelopeTransferTo = allowEnvelopeTransferTo;
    return this;
  }

   /**
   * 
   * @return allowEnvelopeTransferTo
  **/
  @ApiModelProperty(value = "")
  public String getAllowEnvelopeTransferTo() {
    return allowEnvelopeTransferTo;
  }

  public void setAllowEnvelopeTransferTo(String allowEnvelopeTransferTo) {
    this.allowEnvelopeTransferTo = allowEnvelopeTransferTo;
  }

  public UserSettingsInformation allowEnvelopeTransferToMetadata(SettingsMetadata allowEnvelopeTransferToMetadata) {
    this.allowEnvelopeTransferToMetadata = allowEnvelopeTransferToMetadata;
    return this;
  }

   /**
   * Get allowEnvelopeTransferToMetadata
   * @return allowEnvelopeTransferToMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowEnvelopeTransferToMetadata() {
    return allowEnvelopeTransferToMetadata;
  }

  public void setAllowEnvelopeTransferToMetadata(SettingsMetadata allowEnvelopeTransferToMetadata) {
    this.allowEnvelopeTransferToMetadata = allowEnvelopeTransferToMetadata;
  }

  public UserSettingsInformation allowEsealRecipients(String allowEsealRecipients) {
    this.allowEsealRecipients = allowEsealRecipients;
    return this;
  }

   /**
   * 
   * @return allowEsealRecipients
  **/
  @ApiModelProperty(value = "")
  public String getAllowEsealRecipients() {
    return allowEsealRecipients;
  }

  public void setAllowEsealRecipients(String allowEsealRecipients) {
    this.allowEsealRecipients = allowEsealRecipients;
  }

  public UserSettingsInformation allowEsealRecipientsMetadata(SettingsMetadata allowEsealRecipientsMetadata) {
    this.allowEsealRecipientsMetadata = allowEsealRecipientsMetadata;
    return this;
  }

   /**
   * Get allowEsealRecipientsMetadata
   * @return allowEsealRecipientsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowEsealRecipientsMetadata() {
    return allowEsealRecipientsMetadata;
  }

  public void setAllowEsealRecipientsMetadata(SettingsMetadata allowEsealRecipientsMetadata) {
    this.allowEsealRecipientsMetadata = allowEsealRecipientsMetadata;
  }

  public UserSettingsInformation allowPowerFormsAdminToAccessAllPowerFormEnvelope(String allowPowerFormsAdminToAccessAllPowerFormEnvelope) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelope = allowPowerFormsAdminToAccessAllPowerFormEnvelope;
    return this;
  }

   /**
   * 
   * @return allowPowerFormsAdminToAccessAllPowerFormEnvelope
  **/
  @ApiModelProperty(value = "")
  public String getAllowPowerFormsAdminToAccessAllPowerFormEnvelope() {
    return allowPowerFormsAdminToAccessAllPowerFormEnvelope;
  }

  public void setAllowPowerFormsAdminToAccessAllPowerFormEnvelope(String allowPowerFormsAdminToAccessAllPowerFormEnvelope) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelope = allowPowerFormsAdminToAccessAllPowerFormEnvelope;
  }

  public UserSettingsInformation allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata(SettingsMetadata allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata = allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata;
    return this;
  }

   /**
   * Get allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata
   * @return allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata() {
    return allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata;
  }

  public void setAllowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata(SettingsMetadata allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata) {
    this.allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata = allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata;
  }

  public UserSettingsInformation allowRecipientLanguageSelection(String allowRecipientLanguageSelection) {
    this.allowRecipientLanguageSelection = allowRecipientLanguageSelection;
    return this;
  }

   /**
   * 
   * @return allowRecipientLanguageSelection
  **/
  @ApiModelProperty(value = "")
  public String getAllowRecipientLanguageSelection() {
    return allowRecipientLanguageSelection;
  }

  public void setAllowRecipientLanguageSelection(String allowRecipientLanguageSelection) {
    this.allowRecipientLanguageSelection = allowRecipientLanguageSelection;
  }

  public UserSettingsInformation allowRecipientLanguageSelectionMetadata(SettingsMetadata allowRecipientLanguageSelectionMetadata) {
    this.allowRecipientLanguageSelectionMetadata = allowRecipientLanguageSelectionMetadata;
    return this;
  }

   /**
   * Get allowRecipientLanguageSelectionMetadata
   * @return allowRecipientLanguageSelectionMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowRecipientLanguageSelectionMetadata() {
    return allowRecipientLanguageSelectionMetadata;
  }

  public void setAllowRecipientLanguageSelectionMetadata(SettingsMetadata allowRecipientLanguageSelectionMetadata) {
    this.allowRecipientLanguageSelectionMetadata = allowRecipientLanguageSelectionMetadata;
  }

  public UserSettingsInformation allowSendOnBehalfOf(String allowSendOnBehalfOf) {
    this.allowSendOnBehalfOf = allowSendOnBehalfOf;
    return this;
  }

   /**
   * 
   * @return allowSendOnBehalfOf
  **/
  @ApiModelProperty(value = "")
  public String getAllowSendOnBehalfOf() {
    return allowSendOnBehalfOf;
  }

  public void setAllowSendOnBehalfOf(String allowSendOnBehalfOf) {
    this.allowSendOnBehalfOf = allowSendOnBehalfOf;
  }

  public UserSettingsInformation allowSendOnBehalfOfMetadata(SettingsMetadata allowSendOnBehalfOfMetadata) {
    this.allowSendOnBehalfOfMetadata = allowSendOnBehalfOfMetadata;
    return this;
  }

   /**
   * Get allowSendOnBehalfOfMetadata
   * @return allowSendOnBehalfOfMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSendOnBehalfOfMetadata() {
    return allowSendOnBehalfOfMetadata;
  }

  public void setAllowSendOnBehalfOfMetadata(SettingsMetadata allowSendOnBehalfOfMetadata) {
    this.allowSendOnBehalfOfMetadata = allowSendOnBehalfOfMetadata;
  }

  public UserSettingsInformation allowSupplementalDocuments(String allowSupplementalDocuments) {
    this.allowSupplementalDocuments = allowSupplementalDocuments;
    return this;
  }

   /**
   * 
   * @return allowSupplementalDocuments
  **/
  @ApiModelProperty(value = "")
  public String getAllowSupplementalDocuments() {
    return allowSupplementalDocuments;
  }

  public void setAllowSupplementalDocuments(String allowSupplementalDocuments) {
    this.allowSupplementalDocuments = allowSupplementalDocuments;
  }

  public UserSettingsInformation allowSupplementalDocumentsMetadata(SettingsMetadata allowSupplementalDocumentsMetadata) {
    this.allowSupplementalDocumentsMetadata = allowSupplementalDocumentsMetadata;
    return this;
  }

   /**
   * Get allowSupplementalDocumentsMetadata
   * @return allowSupplementalDocumentsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSupplementalDocumentsMetadata() {
    return allowSupplementalDocumentsMetadata;
  }

  public void setAllowSupplementalDocumentsMetadata(SettingsMetadata allowSupplementalDocumentsMetadata) {
    this.allowSupplementalDocumentsMetadata = allowSupplementalDocumentsMetadata;
  }

  public UserSettingsInformation anchorTagVersionedPlacementEnabled(String anchorTagVersionedPlacementEnabled) {
    this.anchorTagVersionedPlacementEnabled = anchorTagVersionedPlacementEnabled;
    return this;
  }

   /**
   * 
   * @return anchorTagVersionedPlacementEnabled
  **/
  @ApiModelProperty(value = "")
  public String getAnchorTagVersionedPlacementEnabled() {
    return anchorTagVersionedPlacementEnabled;
  }

  public void setAnchorTagVersionedPlacementEnabled(String anchorTagVersionedPlacementEnabled) {
    this.anchorTagVersionedPlacementEnabled = anchorTagVersionedPlacementEnabled;
  }

  public UserSettingsInformation apiAccountWideAccess(String apiAccountWideAccess) {
    this.apiAccountWideAccess = apiAccountWideAccess;
    return this;
  }

   /**
   * 
   * @return apiAccountWideAccess
  **/
  @ApiModelProperty(value = "")
  public String getApiAccountWideAccess() {
    return apiAccountWideAccess;
  }

  public void setApiAccountWideAccess(String apiAccountWideAccess) {
    this.apiAccountWideAccess = apiAccountWideAccess;
  }

  public UserSettingsInformation apiAccountWideAccessMetadata(SettingsMetadata apiAccountWideAccessMetadata) {
    this.apiAccountWideAccessMetadata = apiAccountWideAccessMetadata;
    return this;
  }

   /**
   * Get apiAccountWideAccessMetadata
   * @return apiAccountWideAccessMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getApiAccountWideAccessMetadata() {
    return apiAccountWideAccessMetadata;
  }

  public void setApiAccountWideAccessMetadata(SettingsMetadata apiAccountWideAccessMetadata) {
    this.apiAccountWideAccessMetadata = apiAccountWideAccessMetadata;
  }

  public UserSettingsInformation apiCanExportAC(String apiCanExportAC) {
    this.apiCanExportAC = apiCanExportAC;
    return this;
  }

   /**
   * 
   * @return apiCanExportAC
  **/
  @ApiModelProperty(value = "")
  public String getApiCanExportAC() {
    return apiCanExportAC;
  }

  public void setApiCanExportAC(String apiCanExportAC) {
    this.apiCanExportAC = apiCanExportAC;
  }

  public UserSettingsInformation apiCanExportACMetadata(SettingsMetadata apiCanExportACMetadata) {
    this.apiCanExportACMetadata = apiCanExportACMetadata;
    return this;
  }

   /**
   * Get apiCanExportACMetadata
   * @return apiCanExportACMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getApiCanExportACMetadata() {
    return apiCanExportACMetadata;
  }

  public void setApiCanExportACMetadata(SettingsMetadata apiCanExportACMetadata) {
    this.apiCanExportACMetadata = apiCanExportACMetadata;
  }

  public UserSettingsInformation bulkSend(String bulkSend) {
    this.bulkSend = bulkSend;
    return this;
  }

   /**
   * 
   * @return bulkSend
  **/
  @ApiModelProperty(value = "")
  public String getBulkSend() {
    return bulkSend;
  }

  public void setBulkSend(String bulkSend) {
    this.bulkSend = bulkSend;
  }

  public UserSettingsInformation bulkSendMetadata(SettingsMetadata bulkSendMetadata) {
    this.bulkSendMetadata = bulkSendMetadata;
    return this;
  }

   /**
   * Get bulkSendMetadata
   * @return bulkSendMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getBulkSendMetadata() {
    return bulkSendMetadata;
  }

  public void setBulkSendMetadata(SettingsMetadata bulkSendMetadata) {
    this.bulkSendMetadata = bulkSendMetadata;
  }

  public UserSettingsInformation canChargeAccount(String canChargeAccount) {
    this.canChargeAccount = canChargeAccount;
    return this;
  }

   /**
   * 
   * @return canChargeAccount
  **/
  @ApiModelProperty(value = "")
  public String getCanChargeAccount() {
    return canChargeAccount;
  }

  public void setCanChargeAccount(String canChargeAccount) {
    this.canChargeAccount = canChargeAccount;
  }

  public UserSettingsInformation canChargeAccountMetadata(SettingsMetadata canChargeAccountMetadata) {
    this.canChargeAccountMetadata = canChargeAccountMetadata;
    return this;
  }

   /**
   * Get canChargeAccountMetadata
   * @return canChargeAccountMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanChargeAccountMetadata() {
    return canChargeAccountMetadata;
  }

  public void setCanChargeAccountMetadata(SettingsMetadata canChargeAccountMetadata) {
    this.canChargeAccountMetadata = canChargeAccountMetadata;
  }

  public UserSettingsInformation canEditSharedAddressbook(String canEditSharedAddressbook) {
    this.canEditSharedAddressbook = canEditSharedAddressbook;
    return this;
  }

   /**
   * 
   * @return canEditSharedAddressbook
  **/
  @ApiModelProperty(value = "")
  public String getCanEditSharedAddressbook() {
    return canEditSharedAddressbook;
  }

  public void setCanEditSharedAddressbook(String canEditSharedAddressbook) {
    this.canEditSharedAddressbook = canEditSharedAddressbook;
  }

  public UserSettingsInformation canEditSharedAddressbookMetadata(SettingsMetadata canEditSharedAddressbookMetadata) {
    this.canEditSharedAddressbookMetadata = canEditSharedAddressbookMetadata;
    return this;
  }

   /**
   * Get canEditSharedAddressbookMetadata
   * @return canEditSharedAddressbookMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanEditSharedAddressbookMetadata() {
    return canEditSharedAddressbookMetadata;
  }

  public void setCanEditSharedAddressbookMetadata(SettingsMetadata canEditSharedAddressbookMetadata) {
    this.canEditSharedAddressbookMetadata = canEditSharedAddressbookMetadata;
  }

  public UserSettingsInformation canLockEnvelopes(String canLockEnvelopes) {
    this.canLockEnvelopes = canLockEnvelopes;
    return this;
  }

   /**
   * 
   * @return canLockEnvelopes
  **/
  @ApiModelProperty(value = "")
  public String getCanLockEnvelopes() {
    return canLockEnvelopes;
  }

  public void setCanLockEnvelopes(String canLockEnvelopes) {
    this.canLockEnvelopes = canLockEnvelopes;
  }

  public UserSettingsInformation canLockEnvelopesMetadata(SettingsMetadata canLockEnvelopesMetadata) {
    this.canLockEnvelopesMetadata = canLockEnvelopesMetadata;
    return this;
  }

   /**
   * Get canLockEnvelopesMetadata
   * @return canLockEnvelopesMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanLockEnvelopesMetadata() {
    return canLockEnvelopesMetadata;
  }

  public void setCanLockEnvelopesMetadata(SettingsMetadata canLockEnvelopesMetadata) {
    this.canLockEnvelopesMetadata = canLockEnvelopesMetadata;
  }

  public UserSettingsInformation canManageAccount(String canManageAccount) {
    this.canManageAccount = canManageAccount;
    return this;
  }

   /**
   * 
   * @return canManageAccount
  **/
  @ApiModelProperty(value = "")
  public String getCanManageAccount() {
    return canManageAccount;
  }

  public void setCanManageAccount(String canManageAccount) {
    this.canManageAccount = canManageAccount;
  }

  public UserSettingsInformation canManageAccountMetadata(SettingsMetadata canManageAccountMetadata) {
    this.canManageAccountMetadata = canManageAccountMetadata;
    return this;
  }

   /**
   * Get canManageAccountMetadata
   * @return canManageAccountMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageAccountMetadata() {
    return canManageAccountMetadata;
  }

  public void setCanManageAccountMetadata(SettingsMetadata canManageAccountMetadata) {
    this.canManageAccountMetadata = canManageAccountMetadata;
  }

  public UserSettingsInformation canManageDistributor(String canManageDistributor) {
    this.canManageDistributor = canManageDistributor;
    return this;
  }

   /**
   * 
   * @return canManageDistributor
  **/
  @ApiModelProperty(value = "")
  public String getCanManageDistributor() {
    return canManageDistributor;
  }

  public void setCanManageDistributor(String canManageDistributor) {
    this.canManageDistributor = canManageDistributor;
  }

  public UserSettingsInformation canManageDistributorMetadata(SettingsMetadata canManageDistributorMetadata) {
    this.canManageDistributorMetadata = canManageDistributorMetadata;
    return this;
  }

   /**
   * Get canManageDistributorMetadata
   * @return canManageDistributorMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageDistributorMetadata() {
    return canManageDistributorMetadata;
  }

  public void setCanManageDistributorMetadata(SettingsMetadata canManageDistributorMetadata) {
    this.canManageDistributorMetadata = canManageDistributorMetadata;
  }

  public UserSettingsInformation canManageTemplates(String canManageTemplates) {
    this.canManageTemplates = canManageTemplates;
    return this;
  }

   /**
   * 
   * @return canManageTemplates
  **/
  @ApiModelProperty(value = "")
  public String getCanManageTemplates() {
    return canManageTemplates;
  }

  public void setCanManageTemplates(String canManageTemplates) {
    this.canManageTemplates = canManageTemplates;
  }

  public UserSettingsInformation canManageTemplatesMetadata(SettingsMetadata canManageTemplatesMetadata) {
    this.canManageTemplatesMetadata = canManageTemplatesMetadata;
    return this;
  }

   /**
   * Get canManageTemplatesMetadata
   * @return canManageTemplatesMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageTemplatesMetadata() {
    return canManageTemplatesMetadata;
  }

  public void setCanManageTemplatesMetadata(SettingsMetadata canManageTemplatesMetadata) {
    this.canManageTemplatesMetadata = canManageTemplatesMetadata;
  }

  public UserSettingsInformation canSendAPIRequests(String canSendAPIRequests) {
    this.canSendAPIRequests = canSendAPIRequests;
    return this;
  }

   /**
   * 
   * @return canSendAPIRequests
  **/
  @ApiModelProperty(value = "")
  public String getCanSendAPIRequests() {
    return canSendAPIRequests;
  }

  public void setCanSendAPIRequests(String canSendAPIRequests) {
    this.canSendAPIRequests = canSendAPIRequests;
  }

  public UserSettingsInformation canSendAPIRequestsMetadata(SettingsMetadata canSendAPIRequestsMetadata) {
    this.canSendAPIRequestsMetadata = canSendAPIRequestsMetadata;
    return this;
  }

   /**
   * Get canSendAPIRequestsMetadata
   * @return canSendAPIRequestsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanSendAPIRequestsMetadata() {
    return canSendAPIRequestsMetadata;
  }

  public void setCanSendAPIRequestsMetadata(SettingsMetadata canSendAPIRequestsMetadata) {
    this.canSendAPIRequestsMetadata = canSendAPIRequestsMetadata;
  }

  public UserSettingsInformation canSendEnvelope(String canSendEnvelope) {
    this.canSendEnvelope = canSendEnvelope;
    return this;
  }

   /**
   * 
   * @return canSendEnvelope
  **/
  @ApiModelProperty(value = "")
  public String getCanSendEnvelope() {
    return canSendEnvelope;
  }

  public void setCanSendEnvelope(String canSendEnvelope) {
    this.canSendEnvelope = canSendEnvelope;
  }

  public UserSettingsInformation canSendEnvelopeMetadata(SettingsMetadata canSendEnvelopeMetadata) {
    this.canSendEnvelopeMetadata = canSendEnvelopeMetadata;
    return this;
  }

   /**
   * Get canSendEnvelopeMetadata
   * @return canSendEnvelopeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanSendEnvelopeMetadata() {
    return canSendEnvelopeMetadata;
  }

  public void setCanSendEnvelopeMetadata(SettingsMetadata canSendEnvelopeMetadata) {
    this.canSendEnvelopeMetadata = canSendEnvelopeMetadata;
  }

  public UserSettingsInformation canSendEnvelopesViaSMS(String canSendEnvelopesViaSMS) {
    this.canSendEnvelopesViaSMS = canSendEnvelopesViaSMS;
    return this;
  }

   /**
   * 
   * @return canSendEnvelopesViaSMS
  **/
  @ApiModelProperty(value = "")
  public String getCanSendEnvelopesViaSMS() {
    return canSendEnvelopesViaSMS;
  }

  public void setCanSendEnvelopesViaSMS(String canSendEnvelopesViaSMS) {
    this.canSendEnvelopesViaSMS = canSendEnvelopesViaSMS;
  }

  public UserSettingsInformation canSendEnvelopesViaSMSMetadata(SettingsMetadata canSendEnvelopesViaSMSMetadata) {
    this.canSendEnvelopesViaSMSMetadata = canSendEnvelopesViaSMSMetadata;
    return this;
  }

   /**
   * Get canSendEnvelopesViaSMSMetadata
   * @return canSendEnvelopesViaSMSMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanSendEnvelopesViaSMSMetadata() {
    return canSendEnvelopesViaSMSMetadata;
  }

  public void setCanSendEnvelopesViaSMSMetadata(SettingsMetadata canSendEnvelopesViaSMSMetadata) {
    this.canSendEnvelopesViaSMSMetadata = canSendEnvelopesViaSMSMetadata;
  }

  public UserSettingsInformation canSignEnvelope(String canSignEnvelope) {
    this.canSignEnvelope = canSignEnvelope;
    return this;
  }

   /**
   * 
   * @return canSignEnvelope
  **/
  @ApiModelProperty(value = "")
  public String getCanSignEnvelope() {
    return canSignEnvelope;
  }

  public void setCanSignEnvelope(String canSignEnvelope) {
    this.canSignEnvelope = canSignEnvelope;
  }

  public UserSettingsInformation canSignEnvelopeMetadata(SettingsMetadata canSignEnvelopeMetadata) {
    this.canSignEnvelopeMetadata = canSignEnvelopeMetadata;
    return this;
  }

   /**
   * Get canSignEnvelopeMetadata
   * @return canSignEnvelopeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanSignEnvelopeMetadata() {
    return canSignEnvelopeMetadata;
  }

  public void setCanSignEnvelopeMetadata(SettingsMetadata canSignEnvelopeMetadata) {
    this.canSignEnvelopeMetadata = canSignEnvelopeMetadata;
  }

  public UserSettingsInformation canUseScratchpad(String canUseScratchpad) {
    this.canUseScratchpad = canUseScratchpad;
    return this;
  }

   /**
   * 
   * @return canUseScratchpad
  **/
  @ApiModelProperty(value = "")
  public String getCanUseScratchpad() {
    return canUseScratchpad;
  }

  public void setCanUseScratchpad(String canUseScratchpad) {
    this.canUseScratchpad = canUseScratchpad;
  }

  public UserSettingsInformation canUseScratchpadMetadata(SettingsMetadata canUseScratchpadMetadata) {
    this.canUseScratchpadMetadata = canUseScratchpadMetadata;
    return this;
  }

   /**
   * Get canUseScratchpadMetadata
   * @return canUseScratchpadMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanUseScratchpadMetadata() {
    return canUseScratchpadMetadata;
  }

  public void setCanUseScratchpadMetadata(SettingsMetadata canUseScratchpadMetadata) {
    this.canUseScratchpadMetadata = canUseScratchpadMetadata;
  }

  public UserSettingsInformation canUseSmartContracts(String canUseSmartContracts) {
    this.canUseSmartContracts = canUseSmartContracts;
    return this;
  }

   /**
   * 
   * @return canUseSmartContracts
  **/
  @ApiModelProperty(value = "")
  public String getCanUseSmartContracts() {
    return canUseSmartContracts;
  }

  public void setCanUseSmartContracts(String canUseSmartContracts) {
    this.canUseSmartContracts = canUseSmartContracts;
  }

  public UserSettingsInformation canUseSmartContractsMetadata(SettingsMetadata canUseSmartContractsMetadata) {
    this.canUseSmartContractsMetadata = canUseSmartContractsMetadata;
    return this;
  }

   /**
   * Get canUseSmartContractsMetadata
   * @return canUseSmartContractsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanUseSmartContractsMetadata() {
    return canUseSmartContractsMetadata;
  }

  public void setCanUseSmartContractsMetadata(SettingsMetadata canUseSmartContractsMetadata) {
    this.canUseSmartContractsMetadata = canUseSmartContractsMetadata;
  }

  public UserSettingsInformation disableDocumentUpload(String disableDocumentUpload) {
    this.disableDocumentUpload = disableDocumentUpload;
    return this;
  }

   /**
   * 
   * @return disableDocumentUpload
  **/
  @ApiModelProperty(value = "")
  public String getDisableDocumentUpload() {
    return disableDocumentUpload;
  }

  public void setDisableDocumentUpload(String disableDocumentUpload) {
    this.disableDocumentUpload = disableDocumentUpload;
  }

  public UserSettingsInformation disableDocumentUploadMetadata(SettingsMetadata disableDocumentUploadMetadata) {
    this.disableDocumentUploadMetadata = disableDocumentUploadMetadata;
    return this;
  }

   /**
   * Get disableDocumentUploadMetadata
   * @return disableDocumentUploadMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisableDocumentUploadMetadata() {
    return disableDocumentUploadMetadata;
  }

  public void setDisableDocumentUploadMetadata(SettingsMetadata disableDocumentUploadMetadata) {
    this.disableDocumentUploadMetadata = disableDocumentUploadMetadata;
  }

  public UserSettingsInformation disableOtherActions(String disableOtherActions) {
    this.disableOtherActions = disableOtherActions;
    return this;
  }

   /**
   * 
   * @return disableOtherActions
  **/
  @ApiModelProperty(value = "")
  public String getDisableOtherActions() {
    return disableOtherActions;
  }

  public void setDisableOtherActions(String disableOtherActions) {
    this.disableOtherActions = disableOtherActions;
  }

  public UserSettingsInformation disableOtherActionsMetadata(SettingsMetadata disableOtherActionsMetadata) {
    this.disableOtherActionsMetadata = disableOtherActionsMetadata;
    return this;
  }

   /**
   * Get disableOtherActionsMetadata
   * @return disableOtherActionsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisableOtherActionsMetadata() {
    return disableOtherActionsMetadata;
  }

  public void setDisableOtherActionsMetadata(SettingsMetadata disableOtherActionsMetadata) {
    this.disableOtherActionsMetadata = disableOtherActionsMetadata;
  }

  public UserSettingsInformation enableDSPro(String enableDSPro) {
    this.enableDSPro = enableDSPro;
    return this;
  }

   /**
   * 
   * @return enableDSPro
  **/
  @ApiModelProperty(value = "")
  public String getEnableDSPro() {
    return enableDSPro;
  }

  public void setEnableDSPro(String enableDSPro) {
    this.enableDSPro = enableDSPro;
  }

  public UserSettingsInformation enableDSProMetadata(SettingsMetadata enableDSProMetadata) {
    this.enableDSProMetadata = enableDSProMetadata;
    return this;
  }

   /**
   * Get enableDSProMetadata
   * @return enableDSProMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableDSProMetadata() {
    return enableDSProMetadata;
  }

  public void setEnableDSProMetadata(SettingsMetadata enableDSProMetadata) {
    this.enableDSProMetadata = enableDSProMetadata;
  }

  public UserSettingsInformation enableSequentialSigningAPI(String enableSequentialSigningAPI) {
    this.enableSequentialSigningAPI = enableSequentialSigningAPI;
    return this;
  }

   /**
   * 
   * @return enableSequentialSigningAPI
  **/
  @ApiModelProperty(value = "")
  public String getEnableSequentialSigningAPI() {
    return enableSequentialSigningAPI;
  }

  public void setEnableSequentialSigningAPI(String enableSequentialSigningAPI) {
    this.enableSequentialSigningAPI = enableSequentialSigningAPI;
  }

  public UserSettingsInformation enableSequentialSigningAPIMetadata(SettingsMetadata enableSequentialSigningAPIMetadata) {
    this.enableSequentialSigningAPIMetadata = enableSequentialSigningAPIMetadata;
    return this;
  }

   /**
   * Get enableSequentialSigningAPIMetadata
   * @return enableSequentialSigningAPIMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSequentialSigningAPIMetadata() {
    return enableSequentialSigningAPIMetadata;
  }

  public void setEnableSequentialSigningAPIMetadata(SettingsMetadata enableSequentialSigningAPIMetadata) {
    this.enableSequentialSigningAPIMetadata = enableSequentialSigningAPIMetadata;
  }

  public UserSettingsInformation enableSequentialSigningUI(String enableSequentialSigningUI) {
    this.enableSequentialSigningUI = enableSequentialSigningUI;
    return this;
  }

   /**
   * 
   * @return enableSequentialSigningUI
  **/
  @ApiModelProperty(value = "")
  public String getEnableSequentialSigningUI() {
    return enableSequentialSigningUI;
  }

  public void setEnableSequentialSigningUI(String enableSequentialSigningUI) {
    this.enableSequentialSigningUI = enableSequentialSigningUI;
  }

  public UserSettingsInformation enableSequentialSigningUIMetadata(SettingsMetadata enableSequentialSigningUIMetadata) {
    this.enableSequentialSigningUIMetadata = enableSequentialSigningUIMetadata;
    return this;
  }

   /**
   * Get enableSequentialSigningUIMetadata
   * @return enableSequentialSigningUIMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSequentialSigningUIMetadata() {
    return enableSequentialSigningUIMetadata;
  }

  public void setEnableSequentialSigningUIMetadata(SettingsMetadata enableSequentialSigningUIMetadata) {
    this.enableSequentialSigningUIMetadata = enableSequentialSigningUIMetadata;
  }

  public UserSettingsInformation enableSignerAttachments(String enableSignerAttachments) {
    this.enableSignerAttachments = enableSignerAttachments;
    return this;
  }

   /**
   * 
   * @return enableSignerAttachments
  **/
  @ApiModelProperty(value = "")
  public String getEnableSignerAttachments() {
    return enableSignerAttachments;
  }

  public void setEnableSignerAttachments(String enableSignerAttachments) {
    this.enableSignerAttachments = enableSignerAttachments;
  }

  public UserSettingsInformation enableSignerAttachmentsMetadata(SettingsMetadata enableSignerAttachmentsMetadata) {
    this.enableSignerAttachmentsMetadata = enableSignerAttachmentsMetadata;
    return this;
  }

   /**
   * Get enableSignerAttachmentsMetadata
   * @return enableSignerAttachmentsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSignerAttachmentsMetadata() {
    return enableSignerAttachmentsMetadata;
  }

  public void setEnableSignerAttachmentsMetadata(SettingsMetadata enableSignerAttachmentsMetadata) {
    this.enableSignerAttachmentsMetadata = enableSignerAttachmentsMetadata;
  }

  public UserSettingsInformation enableSignOnPaperOverride(String enableSignOnPaperOverride) {
    this.enableSignOnPaperOverride = enableSignOnPaperOverride;
    return this;
  }

   /**
   * 
   * @return enableSignOnPaperOverride
  **/
  @ApiModelProperty(value = "")
  public String getEnableSignOnPaperOverride() {
    return enableSignOnPaperOverride;
  }

  public void setEnableSignOnPaperOverride(String enableSignOnPaperOverride) {
    this.enableSignOnPaperOverride = enableSignOnPaperOverride;
  }

  public UserSettingsInformation enableSignOnPaperOverrideMetadata(SettingsMetadata enableSignOnPaperOverrideMetadata) {
    this.enableSignOnPaperOverrideMetadata = enableSignOnPaperOverrideMetadata;
    return this;
  }

   /**
   * Get enableSignOnPaperOverrideMetadata
   * @return enableSignOnPaperOverrideMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSignOnPaperOverrideMetadata() {
    return enableSignOnPaperOverrideMetadata;
  }

  public void setEnableSignOnPaperOverrideMetadata(SettingsMetadata enableSignOnPaperOverrideMetadata) {
    this.enableSignOnPaperOverrideMetadata = enableSignOnPaperOverrideMetadata;
  }

  public UserSettingsInformation enableTransactionPoint(String enableTransactionPoint) {
    this.enableTransactionPoint = enableTransactionPoint;
    return this;
  }

   /**
   * 
   * @return enableTransactionPoint
  **/
  @ApiModelProperty(value = "")
  public String getEnableTransactionPoint() {
    return enableTransactionPoint;
  }

  public void setEnableTransactionPoint(String enableTransactionPoint) {
    this.enableTransactionPoint = enableTransactionPoint;
  }

  public UserSettingsInformation enableTransactionPointMetadata(SettingsMetadata enableTransactionPointMetadata) {
    this.enableTransactionPointMetadata = enableTransactionPointMetadata;
    return this;
  }

   /**
   * Get enableTransactionPointMetadata
   * @return enableTransactionPointMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableTransactionPointMetadata() {
    return enableTransactionPointMetadata;
  }

  public void setEnableTransactionPointMetadata(SettingsMetadata enableTransactionPointMetadata) {
    this.enableTransactionPointMetadata = enableTransactionPointMetadata;
  }

  public UserSettingsInformation enableVaulting(String enableVaulting) {
    this.enableVaulting = enableVaulting;
    return this;
  }

   /**
   * 
   * @return enableVaulting
  **/
  @ApiModelProperty(value = "")
  public String getEnableVaulting() {
    return enableVaulting;
  }

  public void setEnableVaulting(String enableVaulting) {
    this.enableVaulting = enableVaulting;
  }

  public UserSettingsInformation enableVaultingMetadata(SettingsMetadata enableVaultingMetadata) {
    this.enableVaultingMetadata = enableVaultingMetadata;
    return this;
  }

   /**
   * Get enableVaultingMetadata
   * @return enableVaultingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableVaultingMetadata() {
    return enableVaultingMetadata;
  }

  public void setEnableVaultingMetadata(SettingsMetadata enableVaultingMetadata) {
    this.enableVaultingMetadata = enableVaultingMetadata;
  }

  public UserSettingsInformation expressSendOnly(String expressSendOnly) {
    this.expressSendOnly = expressSendOnly;
    return this;
  }

   /**
   * 
   * @return expressSendOnly
  **/
  @ApiModelProperty(value = "")
  public String getExpressSendOnly() {
    return expressSendOnly;
  }

  public void setExpressSendOnly(String expressSendOnly) {
    this.expressSendOnly = expressSendOnly;
  }

  public UserSettingsInformation locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * 
   * @return locale
  **/
  @ApiModelProperty(value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public UserSettingsInformation localeMetadata(SettingsMetadata localeMetadata) {
    this.localeMetadata = localeMetadata;
    return this;
  }

   /**
   * Get localeMetadata
   * @return localeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getLocaleMetadata() {
    return localeMetadata;
  }

  public void setLocaleMetadata(SettingsMetadata localeMetadata) {
    this.localeMetadata = localeMetadata;
  }

  public UserSettingsInformation localePolicy(LocalePolicy localePolicy) {
    this.localePolicy = localePolicy;
    return this;
  }

   /**
   * Get localePolicy
   * @return localePolicy
  **/
  @ApiModelProperty(value = "")
  public LocalePolicy getLocalePolicy() {
    return localePolicy;
  }

  public void setLocalePolicy(LocalePolicy localePolicy) {
    this.localePolicy = localePolicy;
  }

  public UserSettingsInformation manageClickwrapsMode(String manageClickwrapsMode) {
    this.manageClickwrapsMode = manageClickwrapsMode;
    return this;
  }

   /**
   * 
   * @return manageClickwrapsMode
  **/
  @ApiModelProperty(value = "")
  public String getManageClickwrapsMode() {
    return manageClickwrapsMode;
  }

  public void setManageClickwrapsMode(String manageClickwrapsMode) {
    this.manageClickwrapsMode = manageClickwrapsMode;
  }

  public UserSettingsInformation manageClickwrapsModeMetadata(SettingsMetadata manageClickwrapsModeMetadata) {
    this.manageClickwrapsModeMetadata = manageClickwrapsModeMetadata;
    return this;
  }

   /**
   * Get manageClickwrapsModeMetadata
   * @return manageClickwrapsModeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getManageClickwrapsModeMetadata() {
    return manageClickwrapsModeMetadata;
  }

  public void setManageClickwrapsModeMetadata(SettingsMetadata manageClickwrapsModeMetadata) {
    this.manageClickwrapsModeMetadata = manageClickwrapsModeMetadata;
  }

  public UserSettingsInformation modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * 
   * @return modifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public UserSettingsInformation modifiedByMetadata(SettingsMetadata modifiedByMetadata) {
    this.modifiedByMetadata = modifiedByMetadata;
    return this;
  }

   /**
   * Get modifiedByMetadata
   * @return modifiedByMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getModifiedByMetadata() {
    return modifiedByMetadata;
  }

  public void setModifiedByMetadata(SettingsMetadata modifiedByMetadata) {
    this.modifiedByMetadata = modifiedByMetadata;
  }

  public UserSettingsInformation modifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * 
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "")
  public String getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public UserSettingsInformation modifiedDateMetadata(SettingsMetadata modifiedDateMetadata) {
    this.modifiedDateMetadata = modifiedDateMetadata;
    return this;
  }

   /**
   * Get modifiedDateMetadata
   * @return modifiedDateMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getModifiedDateMetadata() {
    return modifiedDateMetadata;
  }

  public void setModifiedDateMetadata(SettingsMetadata modifiedDateMetadata) {
    this.modifiedDateMetadata = modifiedDateMetadata;
  }

  public UserSettingsInformation modifiedPage(String modifiedPage) {
    this.modifiedPage = modifiedPage;
    return this;
  }

   /**
   * 
   * @return modifiedPage
  **/
  @ApiModelProperty(value = "")
  public String getModifiedPage() {
    return modifiedPage;
  }

  public void setModifiedPage(String modifiedPage) {
    this.modifiedPage = modifiedPage;
  }

  public UserSettingsInformation modifiedPageMetadata(SettingsMetadata modifiedPageMetadata) {
    this.modifiedPageMetadata = modifiedPageMetadata;
    return this;
  }

   /**
   * Get modifiedPageMetadata
   * @return modifiedPageMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getModifiedPageMetadata() {
    return modifiedPageMetadata;
  }

  public void setModifiedPageMetadata(SettingsMetadata modifiedPageMetadata) {
    this.modifiedPageMetadata = modifiedPageMetadata;
  }

  public UserSettingsInformation newSendUI(String newSendUI) {
    this.newSendUI = newSendUI;
    return this;
  }

   /**
   * 
   * @return newSendUI
  **/
  @ApiModelProperty(value = "")
  public String getNewSendUI() {
    return newSendUI;
  }

  public void setNewSendUI(String newSendUI) {
    this.newSendUI = newSendUI;
  }

  public UserSettingsInformation newSendUIMetadata(SettingsMetadata newSendUIMetadata) {
    this.newSendUIMetadata = newSendUIMetadata;
    return this;
  }

   /**
   * Get newSendUIMetadata
   * @return newSendUIMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getNewSendUIMetadata() {
    return newSendUIMetadata;
  }

  public void setNewSendUIMetadata(SettingsMetadata newSendUIMetadata) {
    this.newSendUIMetadata = newSendUIMetadata;
  }

  public UserSettingsInformation powerFormMode(String powerFormMode) {
    this.powerFormMode = powerFormMode;
    return this;
  }

   /**
   * 
   * @return powerFormMode
  **/
  @ApiModelProperty(value = "")
  public String getPowerFormMode() {
    return powerFormMode;
  }

  public void setPowerFormMode(String powerFormMode) {
    this.powerFormMode = powerFormMode;
  }

  public UserSettingsInformation powerFormModeMetadata(SettingsMetadata powerFormModeMetadata) {
    this.powerFormModeMetadata = powerFormModeMetadata;
    return this;
  }

   /**
   * Get powerFormModeMetadata
   * @return powerFormModeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getPowerFormModeMetadata() {
    return powerFormModeMetadata;
  }

  public void setPowerFormModeMetadata(SettingsMetadata powerFormModeMetadata) {
    this.powerFormModeMetadata = powerFormModeMetadata;
  }

  public UserSettingsInformation recipientViewedNotification(String recipientViewedNotification) {
    this.recipientViewedNotification = recipientViewedNotification;
    return this;
  }

   /**
   * 
   * @return recipientViewedNotification
  **/
  @ApiModelProperty(value = "")
  public String getRecipientViewedNotification() {
    return recipientViewedNotification;
  }

  public void setRecipientViewedNotification(String recipientViewedNotification) {
    this.recipientViewedNotification = recipientViewedNotification;
  }

  public UserSettingsInformation recipientViewedNotificationMetadata(SettingsMetadata recipientViewedNotificationMetadata) {
    this.recipientViewedNotificationMetadata = recipientViewedNotificationMetadata;
    return this;
  }

   /**
   * Get recipientViewedNotificationMetadata
   * @return recipientViewedNotificationMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getRecipientViewedNotificationMetadata() {
    return recipientViewedNotificationMetadata;
  }

  public void setRecipientViewedNotificationMetadata(SettingsMetadata recipientViewedNotificationMetadata) {
    this.recipientViewedNotificationMetadata = recipientViewedNotificationMetadata;
  }

  public UserSettingsInformation sealIdentifiers(java.util.List<SealIdentifier> sealIdentifiers) {
    this.sealIdentifiers = sealIdentifiers;
    return this;
  }

  public UserSettingsInformation addSealIdentifiersItem(SealIdentifier sealIdentifiersItem) {
    if (this.sealIdentifiers == null) {
      this.sealIdentifiers = new java.util.ArrayList<SealIdentifier>();
    }
    this.sealIdentifiers.add(sealIdentifiersItem);
    return this;
  }

   /**
   * 
   * @return sealIdentifiers
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SealIdentifier> getSealIdentifiers() {
    return sealIdentifiers;
  }

  public void setSealIdentifiers(java.util.List<SealIdentifier> sealIdentifiers) {
    this.sealIdentifiers = sealIdentifiers;
  }

  public UserSettingsInformation selfSignedRecipientEmailDocument(String selfSignedRecipientEmailDocument) {
    this.selfSignedRecipientEmailDocument = selfSignedRecipientEmailDocument;
    return this;
  }

   /**
   * 
   * @return selfSignedRecipientEmailDocument
  **/
  @ApiModelProperty(value = "")
  public String getSelfSignedRecipientEmailDocument() {
    return selfSignedRecipientEmailDocument;
  }

  public void setSelfSignedRecipientEmailDocument(String selfSignedRecipientEmailDocument) {
    this.selfSignedRecipientEmailDocument = selfSignedRecipientEmailDocument;
  }

  public UserSettingsInformation selfSignedRecipientEmailDocumentMetadata(SettingsMetadata selfSignedRecipientEmailDocumentMetadata) {
    this.selfSignedRecipientEmailDocumentMetadata = selfSignedRecipientEmailDocumentMetadata;
    return this;
  }

   /**
   * Get selfSignedRecipientEmailDocumentMetadata
   * @return selfSignedRecipientEmailDocumentMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSelfSignedRecipientEmailDocumentMetadata() {
    return selfSignedRecipientEmailDocumentMetadata;
  }

  public void setSelfSignedRecipientEmailDocumentMetadata(SettingsMetadata selfSignedRecipientEmailDocumentMetadata) {
    this.selfSignedRecipientEmailDocumentMetadata = selfSignedRecipientEmailDocumentMetadata;
  }

  public UserSettingsInformation senderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
    return this;
  }

   /**
   * Get senderEmailNotifications
   * @return senderEmailNotifications
  **/
  @ApiModelProperty(value = "")
  public SenderEmailNotifications getSenderEmailNotifications() {
    return senderEmailNotifications;
  }

  public void setSenderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
    this.senderEmailNotifications = senderEmailNotifications;
  }

  public UserSettingsInformation signerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
    return this;
  }

   /**
   * Get signerEmailNotifications
   * @return signerEmailNotifications
  **/
  @ApiModelProperty(value = "")
  public SignerEmailNotifications getSignerEmailNotifications() {
    return signerEmailNotifications;
  }

  public void setSignerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
    this.signerEmailNotifications = signerEmailNotifications;
  }

  public UserSettingsInformation supplementalDocumentIncludeInDownload(String supplementalDocumentIncludeInDownload) {
    this.supplementalDocumentIncludeInDownload = supplementalDocumentIncludeInDownload;
    return this;
  }

   /**
   * 
   * @return supplementalDocumentIncludeInDownload
  **/
  @ApiModelProperty(value = "")
  public String getSupplementalDocumentIncludeInDownload() {
    return supplementalDocumentIncludeInDownload;
  }

  public void setSupplementalDocumentIncludeInDownload(String supplementalDocumentIncludeInDownload) {
    this.supplementalDocumentIncludeInDownload = supplementalDocumentIncludeInDownload;
  }

  public UserSettingsInformation supplementalDocumentsMustAccept(String supplementalDocumentsMustAccept) {
    this.supplementalDocumentsMustAccept = supplementalDocumentsMustAccept;
    return this;
  }

   /**
   * 
   * @return supplementalDocumentsMustAccept
  **/
  @ApiModelProperty(value = "")
  public String getSupplementalDocumentsMustAccept() {
    return supplementalDocumentsMustAccept;
  }

  public void setSupplementalDocumentsMustAccept(String supplementalDocumentsMustAccept) {
    this.supplementalDocumentsMustAccept = supplementalDocumentsMustAccept;
  }

  public UserSettingsInformation supplementalDocumentsMustAcceptMetadata(SettingsMetadata supplementalDocumentsMustAcceptMetadata) {
    this.supplementalDocumentsMustAcceptMetadata = supplementalDocumentsMustAcceptMetadata;
    return this;
  }

   /**
   * Get supplementalDocumentsMustAcceptMetadata
   * @return supplementalDocumentsMustAcceptMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSupplementalDocumentsMustAcceptMetadata() {
    return supplementalDocumentsMustAcceptMetadata;
  }

  public void setSupplementalDocumentsMustAcceptMetadata(SettingsMetadata supplementalDocumentsMustAcceptMetadata) {
    this.supplementalDocumentsMustAcceptMetadata = supplementalDocumentsMustAcceptMetadata;
  }

  public UserSettingsInformation supplementalDocumentsMustRead(String supplementalDocumentsMustRead) {
    this.supplementalDocumentsMustRead = supplementalDocumentsMustRead;
    return this;
  }

   /**
   * 
   * @return supplementalDocumentsMustRead
  **/
  @ApiModelProperty(value = "")
  public String getSupplementalDocumentsMustRead() {
    return supplementalDocumentsMustRead;
  }

  public void setSupplementalDocumentsMustRead(String supplementalDocumentsMustRead) {
    this.supplementalDocumentsMustRead = supplementalDocumentsMustRead;
  }

  public UserSettingsInformation supplementalDocumentsMustReadMetadata(SettingsMetadata supplementalDocumentsMustReadMetadata) {
    this.supplementalDocumentsMustReadMetadata = supplementalDocumentsMustReadMetadata;
    return this;
  }

   /**
   * Get supplementalDocumentsMustReadMetadata
   * @return supplementalDocumentsMustReadMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSupplementalDocumentsMustReadMetadata() {
    return supplementalDocumentsMustReadMetadata;
  }

  public void setSupplementalDocumentsMustReadMetadata(SettingsMetadata supplementalDocumentsMustReadMetadata) {
    this.supplementalDocumentsMustReadMetadata = supplementalDocumentsMustReadMetadata;
  }

  public UserSettingsInformation supplementalDocumentsMustView(String supplementalDocumentsMustView) {
    this.supplementalDocumentsMustView = supplementalDocumentsMustView;
    return this;
  }

   /**
   * 
   * @return supplementalDocumentsMustView
  **/
  @ApiModelProperty(value = "")
  public String getSupplementalDocumentsMustView() {
    return supplementalDocumentsMustView;
  }

  public void setSupplementalDocumentsMustView(String supplementalDocumentsMustView) {
    this.supplementalDocumentsMustView = supplementalDocumentsMustView;
  }

  public UserSettingsInformation supplementalDocumentsMustViewMetadata(SettingsMetadata supplementalDocumentsMustViewMetadata) {
    this.supplementalDocumentsMustViewMetadata = supplementalDocumentsMustViewMetadata;
    return this;
  }

   /**
   * Get supplementalDocumentsMustViewMetadata
   * @return supplementalDocumentsMustViewMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSupplementalDocumentsMustViewMetadata() {
    return supplementalDocumentsMustViewMetadata;
  }

  public void setSupplementalDocumentsMustViewMetadata(SettingsMetadata supplementalDocumentsMustViewMetadata) {
    this.supplementalDocumentsMustViewMetadata = supplementalDocumentsMustViewMetadata;
  }

  public UserSettingsInformation templateActiveCreation(String templateActiveCreation) {
    this.templateActiveCreation = templateActiveCreation;
    return this;
  }

   /**
   * 
   * @return templateActiveCreation
  **/
  @ApiModelProperty(value = "")
  public String getTemplateActiveCreation() {
    return templateActiveCreation;
  }

  public void setTemplateActiveCreation(String templateActiveCreation) {
    this.templateActiveCreation = templateActiveCreation;
  }

  public UserSettingsInformation templateActiveCreationMetadata(SettingsMetadata templateActiveCreationMetadata) {
    this.templateActiveCreationMetadata = templateActiveCreationMetadata;
    return this;
  }

   /**
   * Get templateActiveCreationMetadata
   * @return templateActiveCreationMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTemplateActiveCreationMetadata() {
    return templateActiveCreationMetadata;
  }

  public void setTemplateActiveCreationMetadata(SettingsMetadata templateActiveCreationMetadata) {
    this.templateActiveCreationMetadata = templateActiveCreationMetadata;
  }

  public UserSettingsInformation templateApplyNotify(String templateApplyNotify) {
    this.templateApplyNotify = templateApplyNotify;
    return this;
  }

   /**
   * 
   * @return templateApplyNotify
  **/
  @ApiModelProperty(value = "")
  public String getTemplateApplyNotify() {
    return templateApplyNotify;
  }

  public void setTemplateApplyNotify(String templateApplyNotify) {
    this.templateApplyNotify = templateApplyNotify;
  }

  public UserSettingsInformation templateApplyNotifyMetadata(SettingsMetadata templateApplyNotifyMetadata) {
    this.templateApplyNotifyMetadata = templateApplyNotifyMetadata;
    return this;
  }

   /**
   * Get templateApplyNotifyMetadata
   * @return templateApplyNotifyMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTemplateApplyNotifyMetadata() {
    return templateApplyNotifyMetadata;
  }

  public void setTemplateApplyNotifyMetadata(SettingsMetadata templateApplyNotifyMetadata) {
    this.templateApplyNotifyMetadata = templateApplyNotifyMetadata;
  }

  public UserSettingsInformation templateAutoMatching(String templateAutoMatching) {
    this.templateAutoMatching = templateAutoMatching;
    return this;
  }

   /**
   * 
   * @return templateAutoMatching
  **/
  @ApiModelProperty(value = "")
  public String getTemplateAutoMatching() {
    return templateAutoMatching;
  }

  public void setTemplateAutoMatching(String templateAutoMatching) {
    this.templateAutoMatching = templateAutoMatching;
  }

  public UserSettingsInformation templateAutoMatchingMetadata(SettingsMetadata templateAutoMatchingMetadata) {
    this.templateAutoMatchingMetadata = templateAutoMatchingMetadata;
    return this;
  }

   /**
   * Get templateAutoMatchingMetadata
   * @return templateAutoMatchingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTemplateAutoMatchingMetadata() {
    return templateAutoMatchingMetadata;
  }

  public void setTemplateAutoMatchingMetadata(SettingsMetadata templateAutoMatchingMetadata) {
    this.templateAutoMatchingMetadata = templateAutoMatchingMetadata;
  }

  public UserSettingsInformation templateMatchingSensitivity(String templateMatchingSensitivity) {
    this.templateMatchingSensitivity = templateMatchingSensitivity;
    return this;
  }

   /**
   * 
   * @return templateMatchingSensitivity
  **/
  @ApiModelProperty(value = "")
  public String getTemplateMatchingSensitivity() {
    return templateMatchingSensitivity;
  }

  public void setTemplateMatchingSensitivity(String templateMatchingSensitivity) {
    this.templateMatchingSensitivity = templateMatchingSensitivity;
  }

  public UserSettingsInformation templateMatchingSensitivityMetadata(SettingsMetadata templateMatchingSensitivityMetadata) {
    this.templateMatchingSensitivityMetadata = templateMatchingSensitivityMetadata;
    return this;
  }

   /**
   * Get templateMatchingSensitivityMetadata
   * @return templateMatchingSensitivityMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTemplateMatchingSensitivityMetadata() {
    return templateMatchingSensitivityMetadata;
  }

  public void setTemplateMatchingSensitivityMetadata(SettingsMetadata templateMatchingSensitivityMetadata) {
    this.templateMatchingSensitivityMetadata = templateMatchingSensitivityMetadata;
  }

  public UserSettingsInformation templatePageLevelMatching(String templatePageLevelMatching) {
    this.templatePageLevelMatching = templatePageLevelMatching;
    return this;
  }

   /**
   * 
   * @return templatePageLevelMatching
  **/
  @ApiModelProperty(value = "")
  public String getTemplatePageLevelMatching() {
    return templatePageLevelMatching;
  }

  public void setTemplatePageLevelMatching(String templatePageLevelMatching) {
    this.templatePageLevelMatching = templatePageLevelMatching;
  }

  public UserSettingsInformation templatePageLevelMatchingMetadata(SettingsMetadata templatePageLevelMatchingMetadata) {
    this.templatePageLevelMatchingMetadata = templatePageLevelMatchingMetadata;
    return this;
  }

   /**
   * Get templatePageLevelMatchingMetadata
   * @return templatePageLevelMatchingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTemplatePageLevelMatchingMetadata() {
    return templatePageLevelMatchingMetadata;
  }

  public void setTemplatePageLevelMatchingMetadata(SettingsMetadata templatePageLevelMatchingMetadata) {
    this.templatePageLevelMatchingMetadata = templatePageLevelMatchingMetadata;
  }

  public UserSettingsInformation timezoneDST(String timezoneDST) {
    this.timezoneDST = timezoneDST;
    return this;
  }

   /**
   * 
   * @return timezoneDST
  **/
  @ApiModelProperty(value = "")
  public String getTimezoneDST() {
    return timezoneDST;
  }

  public void setTimezoneDST(String timezoneDST) {
    this.timezoneDST = timezoneDST;
  }

  public UserSettingsInformation timezoneDSTMetadata(SettingsMetadata timezoneDSTMetadata) {
    this.timezoneDSTMetadata = timezoneDSTMetadata;
    return this;
  }

   /**
   * Get timezoneDSTMetadata
   * @return timezoneDSTMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTimezoneDSTMetadata() {
    return timezoneDSTMetadata;
  }

  public void setTimezoneDSTMetadata(SettingsMetadata timezoneDSTMetadata) {
    this.timezoneDSTMetadata = timezoneDSTMetadata;
  }

  public UserSettingsInformation timezoneMask(String timezoneMask) {
    this.timezoneMask = timezoneMask;
    return this;
  }

   /**
   * 
   * @return timezoneMask
  **/
  @ApiModelProperty(value = "")
  public String getTimezoneMask() {
    return timezoneMask;
  }

  public void setTimezoneMask(String timezoneMask) {
    this.timezoneMask = timezoneMask;
  }

  public UserSettingsInformation timezoneMaskMetadata(SettingsMetadata timezoneMaskMetadata) {
    this.timezoneMaskMetadata = timezoneMaskMetadata;
    return this;
  }

   /**
   * Get timezoneMaskMetadata
   * @return timezoneMaskMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTimezoneMaskMetadata() {
    return timezoneMaskMetadata;
  }

  public void setTimezoneMaskMetadata(SettingsMetadata timezoneMaskMetadata) {
    this.timezoneMaskMetadata = timezoneMaskMetadata;
  }

  public UserSettingsInformation timezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

   /**
   * 
   * @return timezoneOffset
  **/
  @ApiModelProperty(value = "")
  public String getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }

  public UserSettingsInformation timezoneOffsetMetadata(SettingsMetadata timezoneOffsetMetadata) {
    this.timezoneOffsetMetadata = timezoneOffsetMetadata;
    return this;
  }

   /**
   * Get timezoneOffsetMetadata
   * @return timezoneOffsetMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTimezoneOffsetMetadata() {
    return timezoneOffsetMetadata;
  }

  public void setTimezoneOffsetMetadata(SettingsMetadata timezoneOffsetMetadata) {
    this.timezoneOffsetMetadata = timezoneOffsetMetadata;
  }

  public UserSettingsInformation timezoneSendingPref(String timezoneSendingPref) {
    this.timezoneSendingPref = timezoneSendingPref;
    return this;
  }

   /**
   * 
   * @return timezoneSendingPref
  **/
  @ApiModelProperty(value = "")
  public String getTimezoneSendingPref() {
    return timezoneSendingPref;
  }

  public void setTimezoneSendingPref(String timezoneSendingPref) {
    this.timezoneSendingPref = timezoneSendingPref;
  }

  public UserSettingsInformation timezoneSendingPrefMetadata(SettingsMetadata timezoneSendingPrefMetadata) {
    this.timezoneSendingPrefMetadata = timezoneSendingPrefMetadata;
    return this;
  }

   /**
   * Get timezoneSendingPrefMetadata
   * @return timezoneSendingPrefMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTimezoneSendingPrefMetadata() {
    return timezoneSendingPrefMetadata;
  }

  public void setTimezoneSendingPrefMetadata(SettingsMetadata timezoneSendingPrefMetadata) {
    this.timezoneSendingPrefMetadata = timezoneSendingPrefMetadata;
  }

  public UserSettingsInformation timezoneSigningPref(String timezoneSigningPref) {
    this.timezoneSigningPref = timezoneSigningPref;
    return this;
  }

   /**
   * 
   * @return timezoneSigningPref
  **/
  @ApiModelProperty(value = "")
  public String getTimezoneSigningPref() {
    return timezoneSigningPref;
  }

  public void setTimezoneSigningPref(String timezoneSigningPref) {
    this.timezoneSigningPref = timezoneSigningPref;
  }

  public UserSettingsInformation timezoneSigningPrefMetadata(SettingsMetadata timezoneSigningPrefMetadata) {
    this.timezoneSigningPrefMetadata = timezoneSigningPrefMetadata;
    return this;
  }

   /**
   * Get timezoneSigningPrefMetadata
   * @return timezoneSigningPrefMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTimezoneSigningPrefMetadata() {
    return timezoneSigningPrefMetadata;
  }

  public void setTimezoneSigningPrefMetadata(SettingsMetadata timezoneSigningPrefMetadata) {
    this.timezoneSigningPrefMetadata = timezoneSigningPrefMetadata;
  }

  public UserSettingsInformation transactionPointSiteNameURL(String transactionPointSiteNameURL) {
    this.transactionPointSiteNameURL = transactionPointSiteNameURL;
    return this;
  }

   /**
   * 
   * @return transactionPointSiteNameURL
  **/
  @ApiModelProperty(value = "")
  public String getTransactionPointSiteNameURL() {
    return transactionPointSiteNameURL;
  }

  public void setTransactionPointSiteNameURL(String transactionPointSiteNameURL) {
    this.transactionPointSiteNameURL = transactionPointSiteNameURL;
  }

  public UserSettingsInformation transactionPointSiteNameURLMetadata(SettingsMetadata transactionPointSiteNameURLMetadata) {
    this.transactionPointSiteNameURLMetadata = transactionPointSiteNameURLMetadata;
    return this;
  }

   /**
   * Get transactionPointSiteNameURLMetadata
   * @return transactionPointSiteNameURLMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTransactionPointSiteNameURLMetadata() {
    return transactionPointSiteNameURLMetadata;
  }

  public void setTransactionPointSiteNameURLMetadata(SettingsMetadata transactionPointSiteNameURLMetadata) {
    this.transactionPointSiteNameURLMetadata = transactionPointSiteNameURLMetadata;
  }

  public UserSettingsInformation transactionPointUserName(String transactionPointUserName) {
    this.transactionPointUserName = transactionPointUserName;
    return this;
  }

   /**
   * 
   * @return transactionPointUserName
  **/
  @ApiModelProperty(value = "")
  public String getTransactionPointUserName() {
    return transactionPointUserName;
  }

  public void setTransactionPointUserName(String transactionPointUserName) {
    this.transactionPointUserName = transactionPointUserName;
  }

  public UserSettingsInformation transactionPointUserNameMetadata(SettingsMetadata transactionPointUserNameMetadata) {
    this.transactionPointUserNameMetadata = transactionPointUserNameMetadata;
    return this;
  }

   /**
   * Get transactionPointUserNameMetadata
   * @return transactionPointUserNameMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTransactionPointUserNameMetadata() {
    return transactionPointUserNameMetadata;
  }

  public void setTransactionPointUserNameMetadata(SettingsMetadata transactionPointUserNameMetadata) {
    this.transactionPointUserNameMetadata = transactionPointUserNameMetadata;
  }

  public UserSettingsInformation vaultingMode(String vaultingMode) {
    this.vaultingMode = vaultingMode;
    return this;
  }

   /**
   * 
   * @return vaultingMode
  **/
  @ApiModelProperty(value = "")
  public String getVaultingMode() {
    return vaultingMode;
  }

  public void setVaultingMode(String vaultingMode) {
    this.vaultingMode = vaultingMode;
  }

  public UserSettingsInformation vaultingModeMetadata(SettingsMetadata vaultingModeMetadata) {
    this.vaultingModeMetadata = vaultingModeMetadata;
    return this;
  }

   /**
   * Get vaultingModeMetadata
   * @return vaultingModeMetadata
  **/
  @ApiModelProperty(value = "")
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
    UserSettingsInformation userSettingsInformation = (UserSettingsInformation) o;
    return Objects.equals(this.accountManagementGranular, userSettingsInformation.accountManagementGranular) &&
        Objects.equals(this.adminOnly, userSettingsInformation.adminOnly) &&
        Objects.equals(this.adminOnlyMetadata, userSettingsInformation.adminOnlyMetadata) &&
        Objects.equals(this.allowAutoTagging, userSettingsInformation.allowAutoTagging) &&
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
        Objects.equals(this.anchorTagVersionedPlacementEnabled, userSettingsInformation.anchorTagVersionedPlacementEnabled) &&
        Objects.equals(this.apiAccountWideAccess, userSettingsInformation.apiAccountWideAccess) &&
        Objects.equals(this.apiAccountWideAccessMetadata, userSettingsInformation.apiAccountWideAccessMetadata) &&
        Objects.equals(this.apiCanExportAC, userSettingsInformation.apiCanExportAC) &&
        Objects.equals(this.apiCanExportACMetadata, userSettingsInformation.apiCanExportACMetadata) &&
        Objects.equals(this.bulkSend, userSettingsInformation.bulkSend) &&
        Objects.equals(this.bulkSendMetadata, userSettingsInformation.bulkSendMetadata) &&
        Objects.equals(this.canChargeAccount, userSettingsInformation.canChargeAccount) &&
        Objects.equals(this.canChargeAccountMetadata, userSettingsInformation.canChargeAccountMetadata) &&
        Objects.equals(this.canEditSharedAddressbook, userSettingsInformation.canEditSharedAddressbook) &&
        Objects.equals(this.canEditSharedAddressbookMetadata, userSettingsInformation.canEditSharedAddressbookMetadata) &&
        Objects.equals(this.canLockEnvelopes, userSettingsInformation.canLockEnvelopes) &&
        Objects.equals(this.canLockEnvelopesMetadata, userSettingsInformation.canLockEnvelopesMetadata) &&
        Objects.equals(this.canManageAccount, userSettingsInformation.canManageAccount) &&
        Objects.equals(this.canManageAccountMetadata, userSettingsInformation.canManageAccountMetadata) &&
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
        Objects.equals(this.vaultingModeMetadata, userSettingsInformation.vaultingModeMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountManagementGranular, adminOnly, adminOnlyMetadata, allowAutoTagging, allowEnvelopeTransferTo, allowEnvelopeTransferToMetadata, allowEsealRecipients, allowEsealRecipientsMetadata, allowPowerFormsAdminToAccessAllPowerFormEnvelope, allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata, allowRecipientLanguageSelection, allowRecipientLanguageSelectionMetadata, allowSendOnBehalfOf, allowSendOnBehalfOfMetadata, allowSupplementalDocuments, allowSupplementalDocumentsMetadata, anchorTagVersionedPlacementEnabled, apiAccountWideAccess, apiAccountWideAccessMetadata, apiCanExportAC, apiCanExportACMetadata, bulkSend, bulkSendMetadata, canChargeAccount, canChargeAccountMetadata, canEditSharedAddressbook, canEditSharedAddressbookMetadata, canLockEnvelopes, canLockEnvelopesMetadata, canManageAccount, canManageAccountMetadata, canManageDistributor, canManageDistributorMetadata, canManageTemplates, canManageTemplatesMetadata, canSendAPIRequests, canSendAPIRequestsMetadata, canSendEnvelope, canSendEnvelopeMetadata, canSendEnvelopesViaSMS, canSendEnvelopesViaSMSMetadata, canSignEnvelope, canSignEnvelopeMetadata, canUseScratchpad, canUseScratchpadMetadata, canUseSmartContracts, canUseSmartContractsMetadata, disableDocumentUpload, disableDocumentUploadMetadata, disableOtherActions, disableOtherActionsMetadata, enableDSPro, enableDSProMetadata, enableSequentialSigningAPI, enableSequentialSigningAPIMetadata, enableSequentialSigningUI, enableSequentialSigningUIMetadata, enableSignerAttachments, enableSignerAttachmentsMetadata, enableSignOnPaperOverride, enableSignOnPaperOverrideMetadata, enableTransactionPoint, enableTransactionPointMetadata, enableVaulting, enableVaultingMetadata, expressSendOnly, locale, localeMetadata, localePolicy, manageClickwrapsMode, manageClickwrapsModeMetadata, modifiedBy, modifiedByMetadata, modifiedDate, modifiedDateMetadata, modifiedPage, modifiedPageMetadata, newSendUI, newSendUIMetadata, powerFormMode, powerFormModeMetadata, recipientViewedNotification, recipientViewedNotificationMetadata, sealIdentifiers, selfSignedRecipientEmailDocument, selfSignedRecipientEmailDocumentMetadata, senderEmailNotifications, signerEmailNotifications, supplementalDocumentIncludeInDownload, supplementalDocumentsMustAccept, supplementalDocumentsMustAcceptMetadata, supplementalDocumentsMustRead, supplementalDocumentsMustReadMetadata, supplementalDocumentsMustView, supplementalDocumentsMustViewMetadata, templateActiveCreation, templateActiveCreationMetadata, templateApplyNotify, templateApplyNotifyMetadata, templateAutoMatching, templateAutoMatchingMetadata, templateMatchingSensitivity, templateMatchingSensitivityMetadata, templatePageLevelMatching, templatePageLevelMatchingMetadata, timezoneDST, timezoneDSTMetadata, timezoneMask, timezoneMaskMetadata, timezoneOffset, timezoneOffsetMetadata, timezoneSendingPref, timezoneSendingPrefMetadata, timezoneSigningPref, timezoneSigningPrefMetadata, transactionPointSiteNameURL, transactionPointSiteNameURLMetadata, transactionPointUserName, transactionPointUserNameMetadata, vaultingMode, vaultingModeMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettingsInformation {\n");
    
    sb.append("    accountManagementGranular: ").append(toIndentedString(accountManagementGranular)).append("\n");
    sb.append("    adminOnly: ").append(toIndentedString(adminOnly)).append("\n");
    sb.append("    adminOnlyMetadata: ").append(toIndentedString(adminOnlyMetadata)).append("\n");
    sb.append("    allowAutoTagging: ").append(toIndentedString(allowAutoTagging)).append("\n");
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
    sb.append("    anchorTagVersionedPlacementEnabled: ").append(toIndentedString(anchorTagVersionedPlacementEnabled)).append("\n");
    sb.append("    apiAccountWideAccess: ").append(toIndentedString(apiAccountWideAccess)).append("\n");
    sb.append("    apiAccountWideAccessMetadata: ").append(toIndentedString(apiAccountWideAccessMetadata)).append("\n");
    sb.append("    apiCanExportAC: ").append(toIndentedString(apiCanExportAC)).append("\n");
    sb.append("    apiCanExportACMetadata: ").append(toIndentedString(apiCanExportACMetadata)).append("\n");
    sb.append("    bulkSend: ").append(toIndentedString(bulkSend)).append("\n");
    sb.append("    bulkSendMetadata: ").append(toIndentedString(bulkSendMetadata)).append("\n");
    sb.append("    canChargeAccount: ").append(toIndentedString(canChargeAccount)).append("\n");
    sb.append("    canChargeAccountMetadata: ").append(toIndentedString(canChargeAccountMetadata)).append("\n");
    sb.append("    canEditSharedAddressbook: ").append(toIndentedString(canEditSharedAddressbook)).append("\n");
    sb.append("    canEditSharedAddressbookMetadata: ").append(toIndentedString(canEditSharedAddressbookMetadata)).append("\n");
    sb.append("    canLockEnvelopes: ").append(toIndentedString(canLockEnvelopes)).append("\n");
    sb.append("    canLockEnvelopesMetadata: ").append(toIndentedString(canLockEnvelopesMetadata)).append("\n");
    sb.append("    canManageAccount: ").append(toIndentedString(canManageAccount)).append("\n");
    sb.append("    canManageAccountMetadata: ").append(toIndentedString(canManageAccountMetadata)).append("\n");
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

