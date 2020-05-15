package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccessCodeFormat;
import com.docusign.esign.model.AccountIdentityVerificationWorkflow;
import com.docusign.esign.model.AccountNotification;
import com.docusign.esign.model.AccountUISettings;
import com.docusign.esign.model.AddressInformation;
import com.docusign.esign.model.ExternalDocumentSources;
import com.docusign.esign.model.IdCheckConfiguration;
import com.docusign.esign.model.SettingsMetadata;
import com.docusign.esign.model.TabAccountSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains account settings information.
 */
@ApiModel(description = "Contains account settings information.")

public class AccountSettingsInformation {
  @JsonProperty("accessCodeFormat")
  private AccessCodeFormat accessCodeFormat = null;

  @JsonProperty("accountDateTimeFormat")
  private String accountDateTimeFormat = null;

  @JsonProperty("accountDateTimeFormatMetadata")
  private SettingsMetadata accountDateTimeFormatMetadata = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("accountNameMetadata")
  private SettingsMetadata accountNameMetadata = null;

  @JsonProperty("accountNotification")
  private AccountNotification accountNotification = null;

  @JsonProperty("accountUISettings")
  private AccountUISettings accountUISettings = null;

  @JsonProperty("adoptSigConfig")
  private String adoptSigConfig = null;

  @JsonProperty("adoptSigConfigMetadata")
  private SettingsMetadata adoptSigConfigMetadata = null;

  @JsonProperty("advancedCorrect")
  private String advancedCorrect = null;

  @JsonProperty("advancedCorrectMetadata")
  private SettingsMetadata advancedCorrectMetadata = null;

  @JsonProperty("allowAccessCodeFormat")
  private String allowAccessCodeFormat = null;

  @JsonProperty("allowAccessCodeFormatMetadata")
  private SettingsMetadata allowAccessCodeFormatMetadata = null;

  @JsonProperty("allowAccountManagementGranular")
  private String allowAccountManagementGranular = null;

  @JsonProperty("allowAccountManagementGranularMetadata")
  private SettingsMetadata allowAccountManagementGranularMetadata = null;

  @JsonProperty("allowAccountMemberNameChange")
  private String allowAccountMemberNameChange = null;

  @JsonProperty("allowAccountMemberNameChangeMetadata")
  private SettingsMetadata allowAccountMemberNameChangeMetadata = null;

  @JsonProperty("allowAdvancedRecipientRoutingConditional")
  private String allowAdvancedRecipientRoutingConditional = null;

  @JsonProperty("allowAdvancedRecipientRoutingConditionalMetadata")
  private SettingsMetadata allowAdvancedRecipientRoutingConditionalMetadata = null;

  @JsonProperty("allowAgentNameEmailEdit")
  private String allowAgentNameEmailEdit = null;

  @JsonProperty("allowAgentNameEmailEditMetadata")
  private SettingsMetadata allowAgentNameEmailEditMetadata = null;

  @JsonProperty("allowAgreementActions")
  private String allowAgreementActions = null;

  @JsonProperty("allowAgreementActionsMetadata")
  private SettingsMetadata allowAgreementActionsMetadata = null;

  @JsonProperty("allowAutoNavSettings")
  private String allowAutoNavSettings = null;

  @JsonProperty("allowAutoNavSettingsMetadata")
  private SettingsMetadata allowAutoNavSettingsMetadata = null;

  @JsonProperty("allowAutoTagging")
  private String allowAutoTagging = null;

  @JsonProperty("allowAutoTaggingMetadata")
  private SettingsMetadata allowAutoTaggingMetadata = null;

  @JsonProperty("allowBulkSend")
  private String allowBulkSend = null;

  @JsonProperty("allowBulkSendMetadata")
  private SettingsMetadata allowBulkSendMetadata = null;

  @JsonProperty("allowCDWithdraw")
  private String allowCDWithdraw = null;

  @JsonProperty("allowCDWithdrawMetadata")
  private SettingsMetadata allowCDWithdrawMetadata = null;

  @JsonProperty("allowConnectHttpListenerConfigs")
  private String allowConnectHttpListenerConfigs = null;

  @JsonProperty("allowConnectSendFinishLater")
  private String allowConnectSendFinishLater = null;

  @JsonProperty("allowConnectSendFinishLaterMetadata")
  private SettingsMetadata allowConnectSendFinishLaterMetadata = null;

  @JsonProperty("allowConsumerDisclosureOverride")
  private String allowConsumerDisclosureOverride = null;

  @JsonProperty("allowConsumerDisclosureOverrideMetadata")
  private SettingsMetadata allowConsumerDisclosureOverrideMetadata = null;

  @JsonProperty("allowDataDownload")
  private String allowDataDownload = null;

  @JsonProperty("allowDataDownloadMetadata")
  private SettingsMetadata allowDataDownloadMetadata = null;

  @JsonProperty("allowDocumentDisclosures")
  private String allowDocumentDisclosures = null;

  @JsonProperty("allowDocumentDisclosuresMetadata")
  private SettingsMetadata allowDocumentDisclosuresMetadata = null;

  @JsonProperty("allowDocumentsOnSignedEnvelopes")
  private String allowDocumentsOnSignedEnvelopes = null;

  @JsonProperty("allowDocumentsOnSignedEnvelopesMetadata")
  private SettingsMetadata allowDocumentsOnSignedEnvelopesMetadata = null;

  @JsonProperty("allowDocumentVisibility")
  private String allowDocumentVisibility = null;

  @JsonProperty("allowDocumentVisibilityMetadata")
  private SettingsMetadata allowDocumentVisibilityMetadata = null;

  @JsonProperty("allowEHankoStamps")
  private String allowEHankoStamps = null;

  @JsonProperty("allowEHankoStampsMetadata")
  private SettingsMetadata allowEHankoStampsMetadata = null;

  @JsonProperty("allowENoteEOriginal")
  private String allowENoteEOriginal = null;

  @JsonProperty("allowENoteEOriginalMetadata")
  private SettingsMetadata allowENoteEOriginalMetadata = null;

  @JsonProperty("allowEnvelopeCorrect")
  private String allowEnvelopeCorrect = null;

  @JsonProperty("allowEnvelopeCorrectMetadata")
  private SettingsMetadata allowEnvelopeCorrectMetadata = null;

  @JsonProperty("allowEnvelopeCustodyTransfer")
  private String allowEnvelopeCustodyTransfer = null;

  @JsonProperty("allowEnvelopeCustodyTransferMetadata")
  private SettingsMetadata allowEnvelopeCustodyTransferMetadata = null;

  @JsonProperty("allowEnvelopeCustomFields")
  private String allowEnvelopeCustomFields = null;

  @JsonProperty("allowEnvelopeCustomFieldsMetadata")
  private SettingsMetadata allowEnvelopeCustomFieldsMetadata = null;

  @JsonProperty("allowEnvelopePublishReporting")
  private String allowEnvelopePublishReporting = null;

  @JsonProperty("allowEnvelopePublishReportingMetadata")
  private SettingsMetadata allowEnvelopePublishReportingMetadata = null;

  @JsonProperty("allowEnvelopeReporting")
  private String allowEnvelopeReporting = null;

  @JsonProperty("allowEnvelopeReportingMetadata")
  private SettingsMetadata allowEnvelopeReportingMetadata = null;

  @JsonProperty("allowExpression")
  private String allowExpression = null;

  @JsonProperty("allowExpressionMetadata")
  private SettingsMetadata allowExpressionMetadata = null;

  @JsonProperty("allowExpressSignerCertificate")
  private String allowExpressSignerCertificate = null;

  @JsonProperty("allowExpressSignerCertificateMetadata")
  private SettingsMetadata allowExpressSignerCertificateMetadata = null;

  @JsonProperty("allowExtendedSendingResourceFile")
  private String allowExtendedSendingResourceFile = null;

  @JsonProperty("allowExtendedSendingResourceFileMetadata")
  private SettingsMetadata allowExtendedSendingResourceFileMetadata = null;

  @JsonProperty("allowExternalSignaturePad")
  private String allowExternalSignaturePad = null;

  @JsonProperty("allowExternalSignaturePadMetadata")
  private SettingsMetadata allowExternalSignaturePadMetadata = null;

  @JsonProperty("allowIDVLevel1")
  private String allowIDVLevel1 = null;

  @JsonProperty("allowIDVLevel1Metadata")
  private SettingsMetadata allowIDVLevel1Metadata = null;

  @JsonProperty("allowIDVPlatform")
  private String allowIDVPlatform = null;

  @JsonProperty("allowIDVPlatformMetadata")
  private SettingsMetadata allowIDVPlatformMetadata = null;

  @JsonProperty("allowInPerson")
  private String allowInPerson = null;

  @JsonProperty("allowInPersonMetadata")
  private SettingsMetadata allowInPersonMetadata = null;

  @JsonProperty("allowManagedStamps")
  private String allowManagedStamps = null;

  @JsonProperty("allowManagedStampsMetadata")
  private SettingsMetadata allowManagedStampsMetadata = null;

  @JsonProperty("allowMarkup")
  private String allowMarkup = null;

  @JsonProperty("allowMarkupMetadata")
  private SettingsMetadata allowMarkupMetadata = null;

  @JsonProperty("allowMemberTimeZone")
  private String allowMemberTimeZone = null;

  @JsonProperty("allowMemberTimeZoneMetadata")
  private SettingsMetadata allowMemberTimeZoneMetadata = null;

  @JsonProperty("allowMergeFields")
  private String allowMergeFields = null;

  @JsonProperty("allowMergeFieldsMetadata")
  private SettingsMetadata allowMergeFieldsMetadata = null;

  @JsonProperty("allowMultipleBrandProfiles")
  private String allowMultipleBrandProfiles = null;

  @JsonProperty("allowMultipleBrandProfilesMetadata")
  private SettingsMetadata allowMultipleBrandProfilesMetadata = null;

  @JsonProperty("allowMultipleSignerAttachments")
  private String allowMultipleSignerAttachments = null;

  @JsonProperty("allowMultipleSignerAttachmentsMetadata")
  private SettingsMetadata allowMultipleSignerAttachmentsMetadata = null;

  @JsonProperty("allowNonUSPhoneAuth")
  private String allowNonUSPhoneAuth = null;

  @JsonProperty("allowNonUSPhoneAuthMetadata")
  private SettingsMetadata allowNonUSPhoneAuthMetadata = null;

  @JsonProperty("allowOcrOfEnvelopeDocuments")
  private String allowOcrOfEnvelopeDocuments = null;

  @JsonProperty("allowOcrOfEnvelopeDocumentsMetadata")
  private SettingsMetadata allowOcrOfEnvelopeDocumentsMetadata = null;

  @JsonProperty("allowOfflineSigning")
  private String allowOfflineSigning = null;

  @JsonProperty("allowOfflineSigningMetadata")
  private SettingsMetadata allowOfflineSigningMetadata = null;

  @JsonProperty("allowOpenTrustSignerCertificate")
  private String allowOpenTrustSignerCertificate = null;

  @JsonProperty("allowOpenTrustSignerCertificateMetadata")
  private SettingsMetadata allowOpenTrustSignerCertificateMetadata = null;

  @JsonProperty("allowOrganizations")
  private String allowOrganizations = null;

  @JsonProperty("allowOrganizationsMetadata")
  private SettingsMetadata allowOrganizationsMetadata = null;

  @JsonProperty("allowPaymentProcessing")
  private String allowPaymentProcessing = null;

  @JsonProperty("allowPaymentProcessingMetadata")
  private SettingsMetadata allowPaymentProcessingMetadata = null;

  @JsonProperty("allowPersonalSignerCertificate")
  private String allowPersonalSignerCertificate = null;

  @JsonProperty("allowPersonalSignerCertificateMetadata")
  private SettingsMetadata allowPersonalSignerCertificateMetadata = null;

  @JsonProperty("allowPhoneAuthentication")
  private String allowPhoneAuthentication = null;

  @JsonProperty("allowPhoneAuthenticationMetadata")
  private SettingsMetadata allowPhoneAuthenticationMetadata = null;

  @JsonProperty("allowPhoneAuthOverride")
  private String allowPhoneAuthOverride = null;

  @JsonProperty("allowPhoneAuthOverrideMetadata")
  private SettingsMetadata allowPhoneAuthOverrideMetadata = null;

  @JsonProperty("allowPrivateSigningGroups")
  private String allowPrivateSigningGroups = null;

  @JsonProperty("allowPrivateSigningGroupsMetadata")
  private SettingsMetadata allowPrivateSigningGroupsMetadata = null;

  @JsonProperty("allowReminders")
  private String allowReminders = null;

  @JsonProperty("allowRemindersMetadata")
  private SettingsMetadata allowRemindersMetadata = null;

  @JsonProperty("allowResourceFileBranding")
  private String allowResourceFileBranding = null;

  @JsonProperty("allowResourceFileBrandingMetadata")
  private SettingsMetadata allowResourceFileBrandingMetadata = null;

  @JsonProperty("allowSafeBioPharmaSignerCertificate")
  private String allowSafeBioPharmaSignerCertificate = null;

  @JsonProperty("allowSafeBioPharmaSignerCertificateMetadata")
  private SettingsMetadata allowSafeBioPharmaSignerCertificateMetadata = null;

  @JsonProperty("allowSecurityAppliance")
  private String allowSecurityAppliance = null;

  @JsonProperty("allowSecurityApplianceMetadata")
  private SettingsMetadata allowSecurityApplianceMetadata = null;

  @JsonProperty("allowSendToCertifiedDelivery")
  private String allowSendToCertifiedDelivery = null;

  @JsonProperty("allowSendToCertifiedDeliveryMetadata")
  private SettingsMetadata allowSendToCertifiedDeliveryMetadata = null;

  @JsonProperty("allowSendToIntermediary")
  private String allowSendToIntermediary = null;

  @JsonProperty("allowSendToIntermediaryMetadata")
  private SettingsMetadata allowSendToIntermediaryMetadata = null;

  @JsonProperty("allowServerTemplates")
  private String allowServerTemplates = null;

  @JsonProperty("allowServerTemplatesMetadata")
  private SettingsMetadata allowServerTemplatesMetadata = null;

  @JsonProperty("allowSetEmbeddedRecipientStartURL")
  private String allowSetEmbeddedRecipientStartURL = null;

  @JsonProperty("allowSetEmbeddedRecipientStartURLMetadata")
  private SettingsMetadata allowSetEmbeddedRecipientStartURLMetadata = null;

  @JsonProperty("allowSharedTabs")
  private String allowSharedTabs = null;

  @JsonProperty("allowSharedTabsMetadata")
  private SettingsMetadata allowSharedTabsMetadata = null;

  @JsonProperty("allowSignatureStamps")
  private String allowSignatureStamps = null;

  @JsonProperty("allowSignatureStampsMetadata")
  private SettingsMetadata allowSignatureStampsMetadata = null;

  @JsonProperty("allowSignDocumentFromHomePage")
  private String allowSignDocumentFromHomePage = null;

  @JsonProperty("allowSignDocumentFromHomePageMetadata")
  private SettingsMetadata allowSignDocumentFromHomePageMetadata = null;

  @JsonProperty("allowSignerReassign")
  private String allowSignerReassign = null;

  @JsonProperty("allowSignerReassignMetadata")
  private SettingsMetadata allowSignerReassignMetadata = null;

  @JsonProperty("allowSignerReassignOverride")
  private String allowSignerReassignOverride = null;

  @JsonProperty("allowSignerReassignOverrideMetadata")
  private SettingsMetadata allowSignerReassignOverrideMetadata = null;

  @JsonProperty("allowSigningExtensions")
  private String allowSigningExtensions = null;

  @JsonProperty("allowSigningExtensionsMetadata")
  private SettingsMetadata allowSigningExtensionsMetadata = null;

  @JsonProperty("allowSigningGroups")
  private String allowSigningGroups = null;

  @JsonProperty("allowSigningGroupsMetadata")
  private SettingsMetadata allowSigningGroupsMetadata = null;

  @JsonProperty("allowSigningRadioDeselect")
  private String allowSigningRadioDeselect = null;

  @JsonProperty("allowSigningRadioDeselectMetadata")
  private SettingsMetadata allowSigningRadioDeselectMetadata = null;

  @JsonProperty("allowSignNow")
  private String allowSignNow = null;

  @JsonProperty("allowSignNowMetadata")
  private String allowSignNowMetadata = null;

  @JsonProperty("allowSMSDelivery")
  private String allowSMSDelivery = null;

  @JsonProperty("allowSMSDeliveryMetadata")
  private SettingsMetadata allowSMSDeliveryMetadata = null;

  @JsonProperty("allowSocialIdLogin")
  private String allowSocialIdLogin = null;

  @JsonProperty("allowSocialIdLoginMetadata")
  private SettingsMetadata allowSocialIdLoginMetadata = null;

  @JsonProperty("allowSupplementalDocuments")
  private String allowSupplementalDocuments = null;

  @JsonProperty("allowSupplementalDocumentsMetadata")
  private SettingsMetadata allowSupplementalDocumentsMetadata = null;

  @JsonProperty("allowUsersToAccessDirectory")
  private String allowUsersToAccessDirectory = null;

  @JsonProperty("allowUsersToAccessDirectoryMetadata")
  private SettingsMetadata allowUsersToAccessDirectoryMetadata = null;

  @JsonProperty("allowValueInsights")
  private String allowValueInsights = null;

  @JsonProperty("allowValueInsightsMetadata")
  private SettingsMetadata allowValueInsightsMetadata = null;

  @JsonProperty("anchorPopulationScope")
  private String anchorPopulationScope = null;

  @JsonProperty("anchorPopulationScopeMetadata")
  private SettingsMetadata anchorPopulationScopeMetadata = null;

  @JsonProperty("anchorTagVersionedPlacementEnabled")
  private String anchorTagVersionedPlacementEnabled = null;

  @JsonProperty("anchorTagVersionedPlacementMetadataEnabled")
  private SettingsMetadata anchorTagVersionedPlacementMetadataEnabled = null;

  @JsonProperty("attachCompletedEnvelope")
  private String attachCompletedEnvelope = null;

  @JsonProperty("attachCompletedEnvelopeMetadata")
  private SettingsMetadata attachCompletedEnvelopeMetadata = null;

  @JsonProperty("authenticationCheck")
  private String authenticationCheck = null;

  @JsonProperty("authenticationCheckMetadata")
  private SettingsMetadata authenticationCheckMetadata = null;

  @JsonProperty("autoNavRule")
  private String autoNavRule = null;

  @JsonProperty("autoNavRuleMetadata")
  private SettingsMetadata autoNavRuleMetadata = null;

  @JsonProperty("autoProvisionSignerAccount")
  private String autoProvisionSignerAccount = null;

  @JsonProperty("autoProvisionSignerAccountMetadata")
  private SettingsMetadata autoProvisionSignerAccountMetadata = null;

  @JsonProperty("bccEmailArchive")
  private String bccEmailArchive = null;

  @JsonProperty("bccEmailArchiveMetadata")
  private SettingsMetadata bccEmailArchiveMetadata = null;

  @JsonProperty("betaSwitchConfiguration")
  private String betaSwitchConfiguration = null;

  @JsonProperty("betaSwitchConfigurationMetadata")
  private SettingsMetadata betaSwitchConfigurationMetadata = null;

  @JsonProperty("billingAddress")
  private AddressInformation billingAddress = null;

  @JsonProperty("billingAddressMetadata")
  private SettingsMetadata billingAddressMetadata = null;

  @JsonProperty("bulkSend")
  private String bulkSend = null;

  @JsonProperty("bulkSendMaxCopiesInBatch")
  private String bulkSendMaxCopiesInBatch = null;

  @JsonProperty("bulkSendMaxUnprocessedEnvelopesCount")
  private String bulkSendMaxUnprocessedEnvelopesCount = null;

  @JsonProperty("bulkSendMetadata")
  private SettingsMetadata bulkSendMetadata = null;

  @JsonProperty("canSelfBrandSend")
  private String canSelfBrandSend = null;

  @JsonProperty("canSelfBrandSendMetadata")
  private SettingsMetadata canSelfBrandSendMetadata = null;

  @JsonProperty("canSelfBrandSign")
  private String canSelfBrandSign = null;

  @JsonProperty("canSelfBrandSignMetadata")
  private SettingsMetadata canSelfBrandSignMetadata = null;

  @JsonProperty("canUseSalesforceOAuth")
  private String canUseSalesforceOAuth = null;

  @JsonProperty("canUseSalesforceOAuthMetadata")
  private SettingsMetadata canUseSalesforceOAuthMetadata = null;

  @JsonProperty("captureVoiceRecording")
  private String captureVoiceRecording = null;

  @JsonProperty("captureVoiceRecordingMetadata")
  private SettingsMetadata captureVoiceRecordingMetadata = null;

  @JsonProperty("cfrUseWideImage")
  private String cfrUseWideImage = null;

  @JsonProperty("cfrUseWideImageMetadata")
  private SettingsMetadata cfrUseWideImageMetadata = null;

  @JsonProperty("checkForMultipleAdminsOnAccount")
  private String checkForMultipleAdminsOnAccount = null;

  @JsonProperty("checkForMultipleAdminsOnAccountMetadata")
  private SettingsMetadata checkForMultipleAdminsOnAccountMetadata = null;

  @JsonProperty("chromeSignatureEnabled")
  private String chromeSignatureEnabled = null;

  @JsonProperty("chromeSignatureEnabledMetadata")
  private SettingsMetadata chromeSignatureEnabledMetadata = null;

  @JsonProperty("commentEmailShowMessageText")
  private String commentEmailShowMessageText = null;

  @JsonProperty("commentEmailShowMessageTextMetadata")
  private SettingsMetadata commentEmailShowMessageTextMetadata = null;

  @JsonProperty("commentsAllowEnvelopeOverride")
  private String commentsAllowEnvelopeOverride = null;

  @JsonProperty("commentsAllowEnvelopeOverrideMetadata")
  private SettingsMetadata commentsAllowEnvelopeOverrideMetadata = null;

  @JsonProperty("conditionalFieldsEnabled")
  private String conditionalFieldsEnabled = null;

  @JsonProperty("conditionalFieldsEnabledMetadata")
  private SettingsMetadata conditionalFieldsEnabledMetadata = null;

  @JsonProperty("consumerDisclosureFrequency")
  private String consumerDisclosureFrequency = null;

  @JsonProperty("consumerDisclosureFrequencyMetadata")
  private SettingsMetadata consumerDisclosureFrequencyMetadata = null;

  @JsonProperty("convertPdfFields")
  private String convertPdfFields = null;

  @JsonProperty("convertPdfFieldsMetadata")
  private SettingsMetadata convertPdfFieldsMetadata = null;

  @JsonProperty("dataPopulationScope")
  private String dataPopulationScope = null;

  @JsonProperty("dataPopulationScopeMetadata")
  private SettingsMetadata dataPopulationScopeMetadata = null;

  @JsonProperty("disableMobileApp")
  private String disableMobileApp = null;

  @JsonProperty("disableMobileAppMetadata")
  private SettingsMetadata disableMobileAppMetadata = null;

  @JsonProperty("disableMobilePushNotifications")
  private String disableMobilePushNotifications = null;

  @JsonProperty("disableMobilePushNotificationsMetadata")
  private SettingsMetadata disableMobilePushNotificationsMetadata = null;

  @JsonProperty("disableMobileSending")
  private String disableMobileSending = null;

  @JsonProperty("disableMobileSendingMetadata")
  private SettingsMetadata disableMobileSendingMetadata = null;

  @JsonProperty("disableMultipleSessions")
  private String disableMultipleSessions = null;

  @JsonProperty("disableMultipleSessionsMetadata")
  private SettingsMetadata disableMultipleSessionsMetadata = null;

  @JsonProperty("disablePurgeNotificationsForSenderMetadata")
  private SettingsMetadata disablePurgeNotificationsForSenderMetadata = null;

  @JsonProperty("disableSignerCertView")
  private String disableSignerCertView = null;

  @JsonProperty("disableSignerCertViewMetadata")
  private SettingsMetadata disableSignerCertViewMetadata = null;

  @JsonProperty("disableSignerHistoryView")
  private String disableSignerHistoryView = null;

  @JsonProperty("disableSignerHistoryViewMetadata")
  private SettingsMetadata disableSignerHistoryViewMetadata = null;

  @JsonProperty("disableStyleSignature")
  private String disableStyleSignature = null;

  @JsonProperty("disableStyleSignatureMetadata")
  private SettingsMetadata disableStyleSignatureMetadata = null;

  @JsonProperty("disableUploadSignature")
  private String disableUploadSignature = null;

  @JsonProperty("disableUploadSignatureMetadata")
  private SettingsMetadata disableUploadSignatureMetadata = null;

  @JsonProperty("disableUserSharing")
  private String disableUserSharing = null;

  @JsonProperty("disableUserSharingMetadata")
  private SettingsMetadata disableUserSharingMetadata = null;

  @JsonProperty("displayBetaSwitch")
  private String displayBetaSwitch = null;

  @JsonProperty("displayBetaSwitchMetadata")
  private SettingsMetadata displayBetaSwitchMetadata = null;

  @JsonProperty("documentConversionRestrictions")
  private String documentConversionRestrictions = null;

  @JsonProperty("documentConversionRestrictionsMetadata")
  private SettingsMetadata documentConversionRestrictionsMetadata = null;

  @JsonProperty("documentRetention")
  private String documentRetention = null;

  @JsonProperty("documentRetentionMetadata")
  private SettingsMetadata documentRetentionMetadata = null;

  @JsonProperty("documentRetentionPurgeTabs")
  private String documentRetentionPurgeTabs = null;

  @JsonProperty("documentVisibility")
  private String documentVisibility = null;

  @JsonProperty("documentVisibilityMetadata")
  private SettingsMetadata documentVisibilityMetadata = null;

  @JsonProperty("emailTemplateVersion")
  private String emailTemplateVersion = null;

  @JsonProperty("emailTemplateVersionMetadata")
  private SettingsMetadata emailTemplateVersionMetadata = null;

  @JsonProperty("enableAccessCodeGenerator")
  private String enableAccessCodeGenerator = null;

  @JsonProperty("enableAccessCodeGeneratorMetadata")
  private SettingsMetadata enableAccessCodeGeneratorMetadata = null;

  @JsonProperty("enableAdvancedPayments")
  private String enableAdvancedPayments = null;

  @JsonProperty("enableAdvancedPaymentsMetadata")
  private SettingsMetadata enableAdvancedPaymentsMetadata = null;

  @JsonProperty("enableAdvancedPowerForms")
  private String enableAdvancedPowerForms = null;

  @JsonProperty("enableAdvancedPowerFormsMetadata")
  private SettingsMetadata enableAdvancedPowerFormsMetadata = null;

  @JsonProperty("enableAutoNav")
  private String enableAutoNav = null;

  @JsonProperty("enableAutoNavMetadata")
  private SettingsMetadata enableAutoNavMetadata = null;

  @JsonProperty("enableCalculatedFields")
  private String enableCalculatedFields = null;

  @JsonProperty("enableCalculatedFieldsMetadata")
  private SettingsMetadata enableCalculatedFieldsMetadata = null;

  @JsonProperty("enableClickwraps")
  private String enableClickwraps = null;

  @JsonProperty("enableClickwrapsMetadata")
  private SettingsMetadata enableClickwrapsMetadata = null;

  @JsonProperty("enableCommentsHistoryDownloadInSigning")
  private String enableCommentsHistoryDownloadInSigning = null;

  @JsonProperty("enableCommentsHistoryDownloadInSigningMetadata")
  private SettingsMetadata enableCommentsHistoryDownloadInSigningMetadata = null;

  @JsonProperty("enableCustomerSatisfactionMetricTracking")
  private String enableCustomerSatisfactionMetricTracking = null;

  @JsonProperty("enableCustomerSatisfactionMetricTrackingMetadata")
  private SettingsMetadata enableCustomerSatisfactionMetricTrackingMetadata = null;

  @JsonProperty("enableDSPro")
  private String enableDSPro = null;

  @JsonProperty("enableDSProMetadata")
  private SettingsMetadata enableDSProMetadata = null;

  @JsonProperty("enableEnvelopeStampingByAccountAdmin")
  private String enableEnvelopeStampingByAccountAdmin = null;

  @JsonProperty("enableEnvelopeStampingByAccountAdminMetadata")
  private SettingsMetadata enableEnvelopeStampingByAccountAdminMetadata = null;

  @JsonProperty("enableEnvelopeStampingByDSAdmin")
  private String enableEnvelopeStampingByDSAdmin = null;

  @JsonProperty("enableEnvelopeStampingByDSAdminMetadata")
  private SettingsMetadata enableEnvelopeStampingByDSAdminMetadata = null;

  @JsonProperty("enableInBrowserEditor")
  private String enableInBrowserEditor = null;

  @JsonProperty("enableInBrowserEditorMetadata")
  private SettingsMetadata enableInBrowserEditorMetadata = null;

  @JsonProperty("enablePaymentProcessing")
  private String enablePaymentProcessing = null;

  @JsonProperty("enablePaymentProcessingMetadata")
  private SettingsMetadata enablePaymentProcessingMetadata = null;

  @JsonProperty("enablePowerForm")
  private String enablePowerForm = null;

  @JsonProperty("enablePowerFormDirect")
  private String enablePowerFormDirect = null;

  @JsonProperty("enablePowerFormDirectMetadata")
  private SettingsMetadata enablePowerFormDirectMetadata = null;

  @JsonProperty("enablePowerFormMetadata")
  private SettingsMetadata enablePowerFormMetadata = null;

  @JsonProperty("enableRecipientDomainValidation")
  private String enableRecipientDomainValidation = null;

  @JsonProperty("enableRecipientDomainValidationMetadata")
  private SettingsMetadata enableRecipientDomainValidationMetadata = null;

  @JsonProperty("enableReportLinks")
  private String enableReportLinks = null;

  @JsonProperty("enableReportLinksMetadata")
  private SettingsMetadata enableReportLinksMetadata = null;

  @JsonProperty("enableRequireSignOnPaper")
  private String enableRequireSignOnPaper = null;

  @JsonProperty("enableRequireSignOnPaperMetadata")
  private SettingsMetadata enableRequireSignOnPaperMetadata = null;

  @JsonProperty("enableReservedDomain")
  private String enableReservedDomain = null;

  @JsonProperty("enableReservedDomainMetadata")
  private SettingsMetadata enableReservedDomainMetadata = null;

  @JsonProperty("enableResponsiveSigning")
  private String enableResponsiveSigning = null;

  @JsonProperty("enableResponsiveSigningMetadata")
  private SettingsMetadata enableResponsiveSigningMetadata = null;

  @JsonProperty("enableScheduledRelease")
  private String enableScheduledRelease = null;

  @JsonProperty("enableScheduledReleaseMetadata")
  private SettingsMetadata enableScheduledReleaseMetadata = null;

  @JsonProperty("enableSearchUI")
  private String enableSearchUI = null;

  @JsonProperty("enableSearchUIMetadata")
  private SettingsMetadata enableSearchUIMetadata = null;

  @JsonProperty("enableSendingTagsFontSettings")
  private String enableSendingTagsFontSettings = null;

  @JsonProperty("enableSendingTagsFontSettingsMetadata")
  private SettingsMetadata enableSendingTagsFontSettingsMetadata = null;

  @JsonProperty("enableSendToAgent")
  private String enableSendToAgent = null;

  @JsonProperty("enableSendToAgentMetadata")
  private SettingsMetadata enableSendToAgentMetadata = null;

  @JsonProperty("enableSendToIntermediary")
  private String enableSendToIntermediary = null;

  @JsonProperty("enableSendToIntermediaryMetadata")
  private SettingsMetadata enableSendToIntermediaryMetadata = null;

  @JsonProperty("enableSendToManage")
  private String enableSendToManage = null;

  @JsonProperty("enableSendToManageMetadata")
  private SettingsMetadata enableSendToManageMetadata = null;

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

  @JsonProperty("enableSigningExtensionComments")
  private String enableSigningExtensionComments = null;

  @JsonProperty("enableSigningExtensionCommentsMetadata")
  private SettingsMetadata enableSigningExtensionCommentsMetadata = null;

  @JsonProperty("enableSigningExtensionConversations")
  private String enableSigningExtensionConversations = null;

  @JsonProperty("enableSigningExtensionConversationsMetadata")
  private SettingsMetadata enableSigningExtensionConversationsMetadata = null;

  @JsonProperty("enableSigningOrderSettingsForAccount")
  private String enableSigningOrderSettingsForAccount = null;

  @JsonProperty("enableSigningOrderSettingsForAccountMetadata")
  private SettingsMetadata enableSigningOrderSettingsForAccountMetadata = null;

  @JsonProperty("enableSignOnPaper")
  private String enableSignOnPaper = null;

  @JsonProperty("enableSignOnPaperMetadata")
  private SettingsMetadata enableSignOnPaperMetadata = null;

  @JsonProperty("enableSignOnPaperOverride")
  private String enableSignOnPaperOverride = null;

  @JsonProperty("enableSignOnPaperOverrideMetadata")
  private SettingsMetadata enableSignOnPaperOverrideMetadata = null;

  @JsonProperty("enableSignWithNotary")
  private String enableSignWithNotary = null;

  @JsonProperty("enableSignWithNotaryMetadata")
  private SettingsMetadata enableSignWithNotaryMetadata = null;

  @JsonProperty("enableSmartContracts")
  private String enableSmartContracts = null;

  @JsonProperty("enableSmartContractsMetadata")
  private SettingsMetadata enableSmartContractsMetadata = null;

  @JsonProperty("enableSMSAuthentication")
  private String enableSMSAuthentication = null;

  @JsonProperty("enableSMSAuthenticationMetadata")
  private SettingsMetadata enableSMSAuthenticationMetadata = null;

  @JsonProperty("enableSocialIdLogin")
  private String enableSocialIdLogin = null;

  @JsonProperty("enableSocialIdLoginMetadata")
  private SettingsMetadata enableSocialIdLoginMetadata = null;

  @JsonProperty("enableStrikeThrough")
  private String enableStrikeThrough = null;

  @JsonProperty("enableStrikeThroughMetadata")
  private SettingsMetadata enableStrikeThroughMetadata = null;

  @JsonProperty("enableTransactionPoint")
  private String enableTransactionPoint = null;

  @JsonProperty("enableTransactionPointMetadata")
  private SettingsMetadata enableTransactionPointMetadata = null;

  @JsonProperty("enableVaulting")
  private String enableVaulting = null;

  @JsonProperty("enableVaultingMetadata")
  private SettingsMetadata enableVaultingMetadata = null;

  @JsonProperty("enableWitnessing")
  private String enableWitnessing = null;

  @JsonProperty("enableWitnessingMetadata")
  private SettingsMetadata enableWitnessingMetadata = null;

  @JsonProperty("enforceTemplateNameUniqueness")
  private String enforceTemplateNameUniqueness = null;

  @JsonProperty("enforceTemplateNameUniquenessMetadata")
  private SettingsMetadata enforceTemplateNameUniquenessMetadata = null;

  @JsonProperty("envelopeIntegrationAllowed")
  private String envelopeIntegrationAllowed = null;

  @JsonProperty("envelopeIntegrationAllowedMetadata")
  private SettingsMetadata envelopeIntegrationAllowedMetadata = null;

  @JsonProperty("envelopeIntegrationEnabled")
  private String envelopeIntegrationEnabled = null;

  @JsonProperty("envelopeIntegrationEnabledMetadata")
  private SettingsMetadata envelopeIntegrationEnabledMetadata = null;

  @JsonProperty("envelopeStampingDefaultValue")
  private String envelopeStampingDefaultValue = null;

  @JsonProperty("envelopeStampingDefaultValueMetadata")
  private SettingsMetadata envelopeStampingDefaultValueMetadata = null;

  @JsonProperty("expressSend")
  private String expressSend = null;

  @JsonProperty("expressSendAllowTabs")
  private String expressSendAllowTabs = null;

  @JsonProperty("expressSendAllowTabsMetadata")
  private SettingsMetadata expressSendAllowTabsMetadata = null;

  @JsonProperty("expressSendMetadata")
  private SettingsMetadata expressSendMetadata = null;

  @JsonProperty("externalDocumentSources")
  private ExternalDocumentSources externalDocumentSources = null;

  @JsonProperty("externalSignaturePadType")
  private String externalSignaturePadType = null;

  @JsonProperty("externalSignaturePadTypeMetadata")
  private SettingsMetadata externalSignaturePadTypeMetadata = null;

  @JsonProperty("faxOutEnabled")
  private String faxOutEnabled = null;

  @JsonProperty("faxOutEnabledMetadata")
  private SettingsMetadata faxOutEnabledMetadata = null;

  @JsonProperty("guidedFormsHtmlAllowed")
  private String guidedFormsHtmlAllowed = null;

  @JsonProperty("guidedFormsHtmlAllowedMetadata")
  private SettingsMetadata guidedFormsHtmlAllowedMetadata = null;

  @JsonProperty("hideAccountAddressInCoC")
  private String hideAccountAddressInCoC = null;

  @JsonProperty("hideAccountAddressInCoCMetadata")
  private SettingsMetadata hideAccountAddressInCoCMetadata = null;

  @JsonProperty("hidePricing")
  private String hidePricing = null;

  @JsonProperty("hidePricingMetadata")
  private SettingsMetadata hidePricingMetadata = null;

  @JsonProperty("idCheckConfigurations")
  private java.util.List<IdCheckConfiguration> idCheckConfigurations = null;

  @JsonProperty("idCheckExpire")
  private String idCheckExpire = null;

  @JsonProperty("idCheckExpireDays")
  private String idCheckExpireDays = null;

  @JsonProperty("idCheckExpireDaysMetadata")
  private SettingsMetadata idCheckExpireDaysMetadata = null;

  @JsonProperty("idCheckExpireMetadata")
  private SettingsMetadata idCheckExpireMetadata = null;

  @JsonProperty("idCheckExpireMinutes")
  private String idCheckExpireMinutes = null;

  @JsonProperty("idCheckExpireMinutesMetadata")
  private SettingsMetadata idCheckExpireMinutesMetadata = null;

  @JsonProperty("idCheckRequired")
  private String idCheckRequired = null;

  @JsonProperty("idCheckRequiredMetadata")
  private SettingsMetadata idCheckRequiredMetadata = null;

  @JsonProperty("identityVerification")
  private java.util.List<AccountIdentityVerificationWorkflow> identityVerification = null;

  @JsonProperty("identityVerificationMetadata")
  private SettingsMetadata identityVerificationMetadata = null;

  @JsonProperty("ignoreErrorIfAnchorTabNotFound")
  private String ignoreErrorIfAnchorTabNotFound = null;

  @JsonProperty("ignoreErrorIfAnchorTabNotFoundMetadataEnabled")
  private SettingsMetadata ignoreErrorIfAnchorTabNotFoundMetadataEnabled = null;

  @JsonProperty("inPersonIDCheckQuestion")
  private String inPersonIDCheckQuestion = null;

  @JsonProperty("inPersonIDCheckQuestionMetadata")
  private SettingsMetadata inPersonIDCheckQuestionMetadata = null;

  @JsonProperty("inPersonSigningEnabled")
  private String inPersonSigningEnabled = null;

  @JsonProperty("inPersonSigningEnabledMetadata")
  private SettingsMetadata inPersonSigningEnabledMetadata = null;

  @JsonProperty("inSessionEnabled")
  private String inSessionEnabled = null;

  @JsonProperty("inSessionEnabledMetadata")
  private SettingsMetadata inSessionEnabledMetadata = null;

  @JsonProperty("inSessionSuppressEmails")
  private String inSessionSuppressEmails = null;

  @JsonProperty("inSessionSuppressEmailsMetadata")
  private SettingsMetadata inSessionSuppressEmailsMetadata = null;

  @JsonProperty("maximumSigningGroups")
  private String maximumSigningGroups = null;

  @JsonProperty("maximumSigningGroupsMetadata")
  private SettingsMetadata maximumSigningGroupsMetadata = null;

  @JsonProperty("maximumUsersPerSigningGroup")
  private String maximumUsersPerSigningGroup = null;

  @JsonProperty("maximumUsersPerSigningGroupMetadata")
  private SettingsMetadata maximumUsersPerSigningGroupMetadata = null;

  @JsonProperty("maxNumberOfCustomStamps")
  private String maxNumberOfCustomStamps = null;

  @JsonProperty("mobileSessionTimeout")
  private String mobileSessionTimeout = null;

  @JsonProperty("mobileSessionTimeoutMetadata")
  private SettingsMetadata mobileSessionTimeoutMetadata = null;

  @JsonProperty("numberOfActiveCustomStamps")
  private String numberOfActiveCustomStamps = null;

  @JsonProperty("optInMobileSigningV02")
  private String optInMobileSigningV02 = null;

  @JsonProperty("optInMobileSigningV02Metadata")
  private SettingsMetadata optInMobileSigningV02Metadata = null;

  @JsonProperty("optOutAutoNavTextAndTabColorUpdates")
  private String optOutAutoNavTextAndTabColorUpdates = null;

  @JsonProperty("optOutAutoNavTextAndTabColorUpdatesMetadata")
  private SettingsMetadata optOutAutoNavTextAndTabColorUpdatesMetadata = null;

  @JsonProperty("optOutNewPlatformSeal")
  private String optOutNewPlatformSeal = null;

  @JsonProperty("optOutNewPlatformSealPlatformMetadata")
  private SettingsMetadata optOutNewPlatformSealPlatformMetadata = null;

  @JsonProperty("phoneAuthRecipientMayProvidePhoneNumber")
  private String phoneAuthRecipientMayProvidePhoneNumber = null;

  @JsonProperty("phoneAuthRecipientMayProvidePhoneNumberMetadata")
  private SettingsMetadata phoneAuthRecipientMayProvidePhoneNumberMetadata = null;

  @JsonProperty("pkiSignDownloadedPDFDocs")
  private String pkiSignDownloadedPDFDocs = null;

  @JsonProperty("pkiSignDownloadedPDFDocsMetadata")
  private SettingsMetadata pkiSignDownloadedPDFDocsMetadata = null;

  @JsonProperty("recipientsCanSignOffline")
  private String recipientsCanSignOffline = null;

  @JsonProperty("recipientsCanSignOfflineMetadata")
  private SettingsMetadata recipientsCanSignOfflineMetadata = null;

  @JsonProperty("recipientSigningAutoNavigationControl")
  private String recipientSigningAutoNavigationControl = null;

  @JsonProperty("recipientSigningAutoNavigationControlMetadata")
  private SettingsMetadata recipientSigningAutoNavigationControlMetadata = null;

  @JsonProperty("require21CFRpt11Compliance")
  private String require21CFRpt11Compliance = null;

  @JsonProperty("require21CFRpt11ComplianceMetadata")
  private SettingsMetadata require21CFRpt11ComplianceMetadata = null;

  @JsonProperty("requireDeclineReason")
  private String requireDeclineReason = null;

  @JsonProperty("requireDeclineReasonMetadata")
  private SettingsMetadata requireDeclineReasonMetadata = null;

  @JsonProperty("requireExternalUserManagement")
  private String requireExternalUserManagement = null;

  @JsonProperty("requireExternalUserManagementMetadata")
  private SettingsMetadata requireExternalUserManagementMetadata = null;

  @JsonProperty("requireSignerCertificateType")
  private String requireSignerCertificateType = null;

  @JsonProperty("requireSignerCertificateTypeMetadata")
  private SettingsMetadata requireSignerCertificateTypeMetadata = null;

  @JsonProperty("rsaVeridAccountName")
  private String rsaVeridAccountName = null;

  @JsonProperty("rsaVeridPassword")
  private String rsaVeridPassword = null;

  @JsonProperty("rsaVeridRuleset")
  private String rsaVeridRuleset = null;

  @JsonProperty("rsaVeridUserId")
  private String rsaVeridUserId = null;

  @JsonProperty("selfSignedRecipientEmailDocument")
  private String selfSignedRecipientEmailDocument = null;

  @JsonProperty("selfSignedRecipientEmailDocumentMetadata")
  private SettingsMetadata selfSignedRecipientEmailDocumentMetadata = null;

  @JsonProperty("selfSignedRecipientEmailDocumentUserOverride")
  private String selfSignedRecipientEmailDocumentUserOverride = null;

  @JsonProperty("selfSignedRecipientEmailDocumentUserOverrideMetadata")
  private SettingsMetadata selfSignedRecipientEmailDocumentUserOverrideMetadata = null;

  @JsonProperty("senderCanSignInEachLocation")
  private String senderCanSignInEachLocation = null;

  @JsonProperty("senderCanSignInEachLocationMetadata")
  private SettingsMetadata senderCanSignInEachLocationMetadata = null;

  @JsonProperty("senderMustAuthenticateSigning")
  private String senderMustAuthenticateSigning = null;

  @JsonProperty("senderMustAuthenticateSigningMetadata")
  private SettingsMetadata senderMustAuthenticateSigningMetadata = null;

  @JsonProperty("sendingTagsFontColor")
  private String sendingTagsFontColor = null;

  @JsonProperty("sendingTagsFontColorMetadata")
  private SettingsMetadata sendingTagsFontColorMetadata = null;

  @JsonProperty("sendingTagsFontName")
  private String sendingTagsFontName = null;

  @JsonProperty("sendingTagsFontNameMetadata")
  private SettingsMetadata sendingTagsFontNameMetadata = null;

  @JsonProperty("sendingTagsFontSize")
  private String sendingTagsFontSize = null;

  @JsonProperty("sendingTagsFontSizeMetadata")
  private SettingsMetadata sendingTagsFontSizeMetadata = null;

  @JsonProperty("sendToCertifiedDeliveryEnabled")
  private String sendToCertifiedDeliveryEnabled = null;

  @JsonProperty("sendToCertifiedDeliveryEnabledMetadata")
  private SettingsMetadata sendToCertifiedDeliveryEnabledMetadata = null;

  @JsonProperty("sessionTimeout")
  private String sessionTimeout = null;

  @JsonProperty("sessionTimeoutMetadata")
  private SettingsMetadata sessionTimeoutMetadata = null;

  @JsonProperty("setRecipEmailLang")
  private String setRecipEmailLang = null;

  @JsonProperty("setRecipEmailLangMetadata")
  private SettingsMetadata setRecipEmailLangMetadata = null;

  @JsonProperty("setRecipSignLang")
  private String setRecipSignLang = null;

  @JsonProperty("setRecipSignLangMetadata")
  private SettingsMetadata setRecipSignLangMetadata = null;

  @JsonProperty("sharedTemplateFolders")
  private String sharedTemplateFolders = null;

  @JsonProperty("sharedTemplateFoldersMetadata")
  private SettingsMetadata sharedTemplateFoldersMetadata = null;

  @JsonProperty("showCompleteDialogInEmbeddedSession")
  private String showCompleteDialogInEmbeddedSession = null;

  @JsonProperty("showCompleteDialogInEmbeddedSessionMetadata")
  private SettingsMetadata showCompleteDialogInEmbeddedSessionMetadata = null;

  @JsonProperty("showConditionalRoutingOnSend")
  private String showConditionalRoutingOnSend = null;

  @JsonProperty("showConditionalRoutingOnSendMetadata")
  private SettingsMetadata showConditionalRoutingOnSendMetadata = null;

  @JsonProperty("showInitialConditionalFields")
  private String showInitialConditionalFields = null;

  @JsonProperty("showInitialConditionalFieldsMetadata")
  private SettingsMetadata showInitialConditionalFieldsMetadata = null;

  @JsonProperty("showLocalizedWatermarks")
  private String showLocalizedWatermarks = null;

  @JsonProperty("showLocalizedWatermarksMetadata")
  private SettingsMetadata showLocalizedWatermarksMetadata = null;

  @JsonProperty("showTutorials")
  private String showTutorials = null;

  @JsonProperty("showTutorialsMetadata")
  private SettingsMetadata showTutorialsMetadata = null;

  @JsonProperty("signatureProviders")
  private java.util.List<String> signatureProviders = null;

  @JsonProperty("signatureProvidersMetadata")
  private SettingsMetadata signatureProvidersMetadata = null;

  @JsonProperty("signDateFormat")
  private String signDateFormat = null;

  @JsonProperty("signDateFormatMetadata")
  private SettingsMetadata signDateFormatMetadata = null;

  @JsonProperty("signerAttachCertificateToEnvelopePDF")
  private String signerAttachCertificateToEnvelopePDF = null;

  @JsonProperty("signerAttachCertificateToEnvelopePDFMetadata")
  private SettingsMetadata signerAttachCertificateToEnvelopePDFMetadata = null;

  @JsonProperty("signerAttachConcat")
  private String signerAttachConcat = null;

  @JsonProperty("signerAttachConcatMetadata")
  private SettingsMetadata signerAttachConcatMetadata = null;

  @JsonProperty("signerCanCreateAccount")
  private String signerCanCreateAccount = null;

  @JsonProperty("signerCanCreateAccountMetadata")
  private SettingsMetadata signerCanCreateAccountMetadata = null;

  @JsonProperty("signerCanSignOnMobile")
  private String signerCanSignOnMobile = null;

  @JsonProperty("signerCanSignOnMobileMetadata")
  private SettingsMetadata signerCanSignOnMobileMetadata = null;

  @JsonProperty("signerInSessionUseEnvelopeCompleteEmail")
  private String signerInSessionUseEnvelopeCompleteEmail = null;

  @JsonProperty("signerInSessionUseEnvelopeCompleteEmailMetadata")
  private SettingsMetadata signerInSessionUseEnvelopeCompleteEmailMetadata = null;

  @JsonProperty("signerLoginRequirements")
  private String signerLoginRequirements = null;

  @JsonProperty("signerLoginRequirementsMetadata")
  private SettingsMetadata signerLoginRequirementsMetadata = null;

  @JsonProperty("signerMustHaveAccount")
  private String signerMustHaveAccount = null;

  @JsonProperty("signerMustHaveAccountMetadata")
  private SettingsMetadata signerMustHaveAccountMetadata = null;

  @JsonProperty("signerMustLoginToSign")
  private String signerMustLoginToSign = null;

  @JsonProperty("signerMustLoginToSignMetadata")
  private SettingsMetadata signerMustLoginToSignMetadata = null;

  @JsonProperty("signerShowSecureFieldInitialValues")
  private String signerShowSecureFieldInitialValues = null;

  @JsonProperty("signerShowSecureFieldInitialValuesMetadata")
  private SettingsMetadata signerShowSecureFieldInitialValuesMetadata = null;

  @JsonProperty("signingSessionTimeout")
  private String signingSessionTimeout = null;

  @JsonProperty("signingSessionTimeoutMetadata")
  private SettingsMetadata signingSessionTimeoutMetadata = null;

  @JsonProperty("signingUiVersion")
  private String signingUiVersion = null;

  @JsonProperty("signingUiVersionMetadata")
  private SettingsMetadata signingUiVersionMetadata = null;

  @JsonProperty("signTimeFormat")
  private String signTimeFormat = null;

  @JsonProperty("signTimeFormatMetadata")
  private SettingsMetadata signTimeFormatMetadata = null;

  @JsonProperty("signTimeShowAmPm")
  private String signTimeShowAmPm = null;

  @JsonProperty("signTimeShowAmPmMetadata")
  private SettingsMetadata signTimeShowAmPmMetadata = null;

  @JsonProperty("simplifiedSendingEnabled")
  private String simplifiedSendingEnabled = null;

  @JsonProperty("simplifiedSendingEnabledMetadata")
  private SettingsMetadata simplifiedSendingEnabledMetadata = null;

  @JsonProperty("singleSignOnEnabled")
  private String singleSignOnEnabled = null;

  @JsonProperty("singleSignOnEnabledMetadata")
  private SettingsMetadata singleSignOnEnabledMetadata = null;

  @JsonProperty("skipAuthCompletedEnvelopes")
  private String skipAuthCompletedEnvelopes = null;

  @JsonProperty("skipAuthCompletedEnvelopesMetadata")
  private SettingsMetadata skipAuthCompletedEnvelopesMetadata = null;

  @JsonProperty("socialIdRecipAuth")
  private String socialIdRecipAuth = null;

  @JsonProperty("socialIdRecipAuthMetadata")
  private SettingsMetadata socialIdRecipAuthMetadata = null;

  @JsonProperty("specifyDocumentVisibility")
  private String specifyDocumentVisibility = null;

  @JsonProperty("specifyDocumentVisibilityMetadata")
  private SettingsMetadata specifyDocumentVisibilityMetadata = null;

  @JsonProperty("startInAdvancedCorrect")
  private String startInAdvancedCorrect = null;

  @JsonProperty("startInAdvancedCorrectMetadata")
  private SettingsMetadata startInAdvancedCorrectMetadata = null;

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

  @JsonProperty("suppressCertificateEnforcement")
  private String suppressCertificateEnforcement = null;

  @JsonProperty("suppressCertificateEnforcementMetadata")
  private SettingsMetadata suppressCertificateEnforcementMetadata = null;

  @JsonProperty("tabAccountSettings")
  private TabAccountSettings tabAccountSettings = null;

  @JsonProperty("timezoneOffsetAPI")
  private String timezoneOffsetAPI = null;

  @JsonProperty("timezoneOffsetAPIMetadata")
  private SettingsMetadata timezoneOffsetAPIMetadata = null;

  @JsonProperty("timezoneOffsetUI")
  private String timezoneOffsetUI = null;

  @JsonProperty("timezoneOffsetUIMetadata")
  private SettingsMetadata timezoneOffsetUIMetadata = null;

  @JsonProperty("universalSignatureOptIn")
  private String universalSignatureOptIn = null;

  @JsonProperty("useAccountLevelEmail")
  private String useAccountLevelEmail = null;

  @JsonProperty("useAccountLevelEmailMetadata")
  private SettingsMetadata useAccountLevelEmailMetadata = null;

  @JsonProperty("useConsumerDisclosure")
  private String useConsumerDisclosure = null;

  @JsonProperty("useConsumerDisclosureMetadata")
  private SettingsMetadata useConsumerDisclosureMetadata = null;

  @JsonProperty("useConsumerDisclosureWithinAccount")
  private String useConsumerDisclosureWithinAccount = null;

  @JsonProperty("useConsumerDisclosureWithinAccountMetadata")
  private SettingsMetadata useConsumerDisclosureWithinAccountMetadata = null;

  @JsonProperty("useDerivedKeys")
  private String useDerivedKeys = null;

  @JsonProperty("useDerivedKeysMetadata")
  private SettingsMetadata useDerivedKeysMetadata = null;

  @JsonProperty("useDocuSignExpressSignerCertificate")
  private String useDocuSignExpressSignerCertificate = null;

  @JsonProperty("useDocuSignExpressSignerCertificateMetadata")
  private SettingsMetadata useDocuSignExpressSignerCertificateMetadata = null;

  @JsonProperty("useMultiAppGroupsData")
  private String useMultiAppGroupsData = null;

  @JsonProperty("useMultiAppGroupsDataMetadata")
  private SettingsMetadata useMultiAppGroupsDataMetadata = null;

  @JsonProperty("useNewBlobForPdf")
  private String useNewBlobForPdf = null;

  @JsonProperty("useNewBlobForPdfMetadata")
  private SettingsMetadata useNewBlobForPdfMetadata = null;

  @JsonProperty("useSAFESignerCertificates")
  private String useSAFESignerCertificates = null;

  @JsonProperty("useSAFESignerCertificatesMetadata")
  private SettingsMetadata useSAFESignerCertificatesMetadata = null;

  @JsonProperty("usesAPI")
  private String usesAPI = null;

  @JsonProperty("usesAPIMetadata")
  private SettingsMetadata usesAPIMetadata = null;

  @JsonProperty("useSignatureProviderPlatform")
  private String useSignatureProviderPlatform = null;

  @JsonProperty("useSignatureProviderPlatformMetadata")
  private SettingsMetadata useSignatureProviderPlatformMetadata = null;

  @JsonProperty("validationsAllowed")
  private String validationsAllowed = null;

  @JsonProperty("validationsAllowedMetadata")
  private SettingsMetadata validationsAllowedMetadata = null;

  @JsonProperty("validationsBrand")
  private String validationsBrand = null;

  @JsonProperty("validationsBrandMetadata")
  private SettingsMetadata validationsBrandMetadata = null;

  @JsonProperty("validationsCadence")
  private String validationsCadence = null;

  @JsonProperty("validationsCadenceMetadata")
  private SettingsMetadata validationsCadenceMetadata = null;

  @JsonProperty("validationsEnabled")
  private String validationsEnabled = null;

  @JsonProperty("validationsEnabledMetadata")
  private SettingsMetadata validationsEnabledMetadata = null;

  @JsonProperty("validationsReport")
  private String validationsReport = null;

  @JsonProperty("validationsReportMetadata")
  private SettingsMetadata validationsReportMetadata = null;

  @JsonProperty("waterMarkEnabled")
  private String waterMarkEnabled = null;

  @JsonProperty("waterMarkEnabledMetadata")
  private SettingsMetadata waterMarkEnabledMetadata = null;

  @JsonProperty("writeReminderToEnvelopeHistory")
  private String writeReminderToEnvelopeHistory = null;

  @JsonProperty("writeReminderToEnvelopeHistoryMetadata")
  private SettingsMetadata writeReminderToEnvelopeHistoryMetadata = null;

  @JsonProperty("wurflMinAllowableScreenSize")
  private String wurflMinAllowableScreenSize = null;

  @JsonProperty("wurflMinAllowableScreenSizeMetadata")
  private SettingsMetadata wurflMinAllowableScreenSizeMetadata = null;

  public AccountSettingsInformation accessCodeFormat(AccessCodeFormat accessCodeFormat) {
    this.accessCodeFormat = accessCodeFormat;
    return this;
  }

   /**
   * Get accessCodeFormat
   * @return accessCodeFormat
  **/
  @ApiModelProperty(value = "")
  public AccessCodeFormat getAccessCodeFormat() {
    return accessCodeFormat;
  }

  public void setAccessCodeFormat(AccessCodeFormat accessCodeFormat) {
    this.accessCodeFormat = accessCodeFormat;
  }

  public AccountSettingsInformation accountDateTimeFormat(String accountDateTimeFormat) {
    this.accountDateTimeFormat = accountDateTimeFormat;
    return this;
  }

   /**
   * 
   * @return accountDateTimeFormat
  **/
  @ApiModelProperty(value = "")
  public String getAccountDateTimeFormat() {
    return accountDateTimeFormat;
  }

  public void setAccountDateTimeFormat(String accountDateTimeFormat) {
    this.accountDateTimeFormat = accountDateTimeFormat;
  }

  public AccountSettingsInformation accountDateTimeFormatMetadata(SettingsMetadata accountDateTimeFormatMetadata) {
    this.accountDateTimeFormatMetadata = accountDateTimeFormatMetadata;
    return this;
  }

   /**
   * Get accountDateTimeFormatMetadata
   * @return accountDateTimeFormatMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAccountDateTimeFormatMetadata() {
    return accountDateTimeFormatMetadata;
  }

  public void setAccountDateTimeFormatMetadata(SettingsMetadata accountDateTimeFormatMetadata) {
    this.accountDateTimeFormatMetadata = accountDateTimeFormatMetadata;
  }

  public AccountSettingsInformation accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * 
   * @return accountName
  **/
  @ApiModelProperty(value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public AccountSettingsInformation accountNameMetadata(SettingsMetadata accountNameMetadata) {
    this.accountNameMetadata = accountNameMetadata;
    return this;
  }

   /**
   * Get accountNameMetadata
   * @return accountNameMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAccountNameMetadata() {
    return accountNameMetadata;
  }

  public void setAccountNameMetadata(SettingsMetadata accountNameMetadata) {
    this.accountNameMetadata = accountNameMetadata;
  }

  public AccountSettingsInformation accountNotification(AccountNotification accountNotification) {
    this.accountNotification = accountNotification;
    return this;
  }

   /**
   * Get accountNotification
   * @return accountNotification
  **/
  @ApiModelProperty(value = "")
  public AccountNotification getAccountNotification() {
    return accountNotification;
  }

  public void setAccountNotification(AccountNotification accountNotification) {
    this.accountNotification = accountNotification;
  }

  public AccountSettingsInformation accountUISettings(AccountUISettings accountUISettings) {
    this.accountUISettings = accountUISettings;
    return this;
  }

   /**
   * Get accountUISettings
   * @return accountUISettings
  **/
  @ApiModelProperty(value = "")
  public AccountUISettings getAccountUISettings() {
    return accountUISettings;
  }

  public void setAccountUISettings(AccountUISettings accountUISettings) {
    this.accountUISettings = accountUISettings;
  }

  public AccountSettingsInformation adoptSigConfig(String adoptSigConfig) {
    this.adoptSigConfig = adoptSigConfig;
    return this;
  }

   /**
   * 
   * @return adoptSigConfig
  **/
  @ApiModelProperty(value = "")
  public String getAdoptSigConfig() {
    return adoptSigConfig;
  }

  public void setAdoptSigConfig(String adoptSigConfig) {
    this.adoptSigConfig = adoptSigConfig;
  }

  public AccountSettingsInformation adoptSigConfigMetadata(SettingsMetadata adoptSigConfigMetadata) {
    this.adoptSigConfigMetadata = adoptSigConfigMetadata;
    return this;
  }

   /**
   * Get adoptSigConfigMetadata
   * @return adoptSigConfigMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAdoptSigConfigMetadata() {
    return adoptSigConfigMetadata;
  }

  public void setAdoptSigConfigMetadata(SettingsMetadata adoptSigConfigMetadata) {
    this.adoptSigConfigMetadata = adoptSigConfigMetadata;
  }

  public AccountSettingsInformation advancedCorrect(String advancedCorrect) {
    this.advancedCorrect = advancedCorrect;
    return this;
  }

   /**
   * 
   * @return advancedCorrect
  **/
  @ApiModelProperty(value = "")
  public String getAdvancedCorrect() {
    return advancedCorrect;
  }

  public void setAdvancedCorrect(String advancedCorrect) {
    this.advancedCorrect = advancedCorrect;
  }

  public AccountSettingsInformation advancedCorrectMetadata(SettingsMetadata advancedCorrectMetadata) {
    this.advancedCorrectMetadata = advancedCorrectMetadata;
    return this;
  }

   /**
   * Get advancedCorrectMetadata
   * @return advancedCorrectMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAdvancedCorrectMetadata() {
    return advancedCorrectMetadata;
  }

  public void setAdvancedCorrectMetadata(SettingsMetadata advancedCorrectMetadata) {
    this.advancedCorrectMetadata = advancedCorrectMetadata;
  }

  public AccountSettingsInformation allowAccessCodeFormat(String allowAccessCodeFormat) {
    this.allowAccessCodeFormat = allowAccessCodeFormat;
    return this;
  }

   /**
   * 
   * @return allowAccessCodeFormat
  **/
  @ApiModelProperty(value = "")
  public String getAllowAccessCodeFormat() {
    return allowAccessCodeFormat;
  }

  public void setAllowAccessCodeFormat(String allowAccessCodeFormat) {
    this.allowAccessCodeFormat = allowAccessCodeFormat;
  }

  public AccountSettingsInformation allowAccessCodeFormatMetadata(SettingsMetadata allowAccessCodeFormatMetadata) {
    this.allowAccessCodeFormatMetadata = allowAccessCodeFormatMetadata;
    return this;
  }

   /**
   * Get allowAccessCodeFormatMetadata
   * @return allowAccessCodeFormatMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowAccessCodeFormatMetadata() {
    return allowAccessCodeFormatMetadata;
  }

  public void setAllowAccessCodeFormatMetadata(SettingsMetadata allowAccessCodeFormatMetadata) {
    this.allowAccessCodeFormatMetadata = allowAccessCodeFormatMetadata;
  }

  public AccountSettingsInformation allowAccountManagementGranular(String allowAccountManagementGranular) {
    this.allowAccountManagementGranular = allowAccountManagementGranular;
    return this;
  }

   /**
   * 
   * @return allowAccountManagementGranular
  **/
  @ApiModelProperty(value = "")
  public String getAllowAccountManagementGranular() {
    return allowAccountManagementGranular;
  }

  public void setAllowAccountManagementGranular(String allowAccountManagementGranular) {
    this.allowAccountManagementGranular = allowAccountManagementGranular;
  }

  public AccountSettingsInformation allowAccountManagementGranularMetadata(SettingsMetadata allowAccountManagementGranularMetadata) {
    this.allowAccountManagementGranularMetadata = allowAccountManagementGranularMetadata;
    return this;
  }

   /**
   * Get allowAccountManagementGranularMetadata
   * @return allowAccountManagementGranularMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowAccountManagementGranularMetadata() {
    return allowAccountManagementGranularMetadata;
  }

  public void setAllowAccountManagementGranularMetadata(SettingsMetadata allowAccountManagementGranularMetadata) {
    this.allowAccountManagementGranularMetadata = allowAccountManagementGranularMetadata;
  }

  public AccountSettingsInformation allowAccountMemberNameChange(String allowAccountMemberNameChange) {
    this.allowAccountMemberNameChange = allowAccountMemberNameChange;
    return this;
  }

   /**
   * 
   * @return allowAccountMemberNameChange
  **/
  @ApiModelProperty(value = "")
  public String getAllowAccountMemberNameChange() {
    return allowAccountMemberNameChange;
  }

  public void setAllowAccountMemberNameChange(String allowAccountMemberNameChange) {
    this.allowAccountMemberNameChange = allowAccountMemberNameChange;
  }

  public AccountSettingsInformation allowAccountMemberNameChangeMetadata(SettingsMetadata allowAccountMemberNameChangeMetadata) {
    this.allowAccountMemberNameChangeMetadata = allowAccountMemberNameChangeMetadata;
    return this;
  }

   /**
   * Get allowAccountMemberNameChangeMetadata
   * @return allowAccountMemberNameChangeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowAccountMemberNameChangeMetadata() {
    return allowAccountMemberNameChangeMetadata;
  }

  public void setAllowAccountMemberNameChangeMetadata(SettingsMetadata allowAccountMemberNameChangeMetadata) {
    this.allowAccountMemberNameChangeMetadata = allowAccountMemberNameChangeMetadata;
  }

  public AccountSettingsInformation allowAdvancedRecipientRoutingConditional(String allowAdvancedRecipientRoutingConditional) {
    this.allowAdvancedRecipientRoutingConditional = allowAdvancedRecipientRoutingConditional;
    return this;
  }

   /**
   * 
   * @return allowAdvancedRecipientRoutingConditional
  **/
  @ApiModelProperty(value = "")
  public String getAllowAdvancedRecipientRoutingConditional() {
    return allowAdvancedRecipientRoutingConditional;
  }

  public void setAllowAdvancedRecipientRoutingConditional(String allowAdvancedRecipientRoutingConditional) {
    this.allowAdvancedRecipientRoutingConditional = allowAdvancedRecipientRoutingConditional;
  }

  public AccountSettingsInformation allowAdvancedRecipientRoutingConditionalMetadata(SettingsMetadata allowAdvancedRecipientRoutingConditionalMetadata) {
    this.allowAdvancedRecipientRoutingConditionalMetadata = allowAdvancedRecipientRoutingConditionalMetadata;
    return this;
  }

   /**
   * Get allowAdvancedRecipientRoutingConditionalMetadata
   * @return allowAdvancedRecipientRoutingConditionalMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowAdvancedRecipientRoutingConditionalMetadata() {
    return allowAdvancedRecipientRoutingConditionalMetadata;
  }

  public void setAllowAdvancedRecipientRoutingConditionalMetadata(SettingsMetadata allowAdvancedRecipientRoutingConditionalMetadata) {
    this.allowAdvancedRecipientRoutingConditionalMetadata = allowAdvancedRecipientRoutingConditionalMetadata;
  }

  public AccountSettingsInformation allowAgentNameEmailEdit(String allowAgentNameEmailEdit) {
    this.allowAgentNameEmailEdit = allowAgentNameEmailEdit;
    return this;
  }

   /**
   * 
   * @return allowAgentNameEmailEdit
  **/
  @ApiModelProperty(value = "")
  public String getAllowAgentNameEmailEdit() {
    return allowAgentNameEmailEdit;
  }

  public void setAllowAgentNameEmailEdit(String allowAgentNameEmailEdit) {
    this.allowAgentNameEmailEdit = allowAgentNameEmailEdit;
  }

  public AccountSettingsInformation allowAgentNameEmailEditMetadata(SettingsMetadata allowAgentNameEmailEditMetadata) {
    this.allowAgentNameEmailEditMetadata = allowAgentNameEmailEditMetadata;
    return this;
  }

   /**
   * Get allowAgentNameEmailEditMetadata
   * @return allowAgentNameEmailEditMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowAgentNameEmailEditMetadata() {
    return allowAgentNameEmailEditMetadata;
  }

  public void setAllowAgentNameEmailEditMetadata(SettingsMetadata allowAgentNameEmailEditMetadata) {
    this.allowAgentNameEmailEditMetadata = allowAgentNameEmailEditMetadata;
  }

  public AccountSettingsInformation allowAgreementActions(String allowAgreementActions) {
    this.allowAgreementActions = allowAgreementActions;
    return this;
  }

   /**
   * 
   * @return allowAgreementActions
  **/
  @ApiModelProperty(value = "")
  public String getAllowAgreementActions() {
    return allowAgreementActions;
  }

  public void setAllowAgreementActions(String allowAgreementActions) {
    this.allowAgreementActions = allowAgreementActions;
  }

  public AccountSettingsInformation allowAgreementActionsMetadata(SettingsMetadata allowAgreementActionsMetadata) {
    this.allowAgreementActionsMetadata = allowAgreementActionsMetadata;
    return this;
  }

   /**
   * Get allowAgreementActionsMetadata
   * @return allowAgreementActionsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowAgreementActionsMetadata() {
    return allowAgreementActionsMetadata;
  }

  public void setAllowAgreementActionsMetadata(SettingsMetadata allowAgreementActionsMetadata) {
    this.allowAgreementActionsMetadata = allowAgreementActionsMetadata;
  }

  public AccountSettingsInformation allowAutoNavSettings(String allowAutoNavSettings) {
    this.allowAutoNavSettings = allowAutoNavSettings;
    return this;
  }

   /**
   * 
   * @return allowAutoNavSettings
  **/
  @ApiModelProperty(value = "")
  public String getAllowAutoNavSettings() {
    return allowAutoNavSettings;
  }

  public void setAllowAutoNavSettings(String allowAutoNavSettings) {
    this.allowAutoNavSettings = allowAutoNavSettings;
  }

  public AccountSettingsInformation allowAutoNavSettingsMetadata(SettingsMetadata allowAutoNavSettingsMetadata) {
    this.allowAutoNavSettingsMetadata = allowAutoNavSettingsMetadata;
    return this;
  }

   /**
   * Get allowAutoNavSettingsMetadata
   * @return allowAutoNavSettingsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowAutoNavSettingsMetadata() {
    return allowAutoNavSettingsMetadata;
  }

  public void setAllowAutoNavSettingsMetadata(SettingsMetadata allowAutoNavSettingsMetadata) {
    this.allowAutoNavSettingsMetadata = allowAutoNavSettingsMetadata;
  }

  public AccountSettingsInformation allowAutoTagging(String allowAutoTagging) {
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

  public AccountSettingsInformation allowAutoTaggingMetadata(SettingsMetadata allowAutoTaggingMetadata) {
    this.allowAutoTaggingMetadata = allowAutoTaggingMetadata;
    return this;
  }

   /**
   * Get allowAutoTaggingMetadata
   * @return allowAutoTaggingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowAutoTaggingMetadata() {
    return allowAutoTaggingMetadata;
  }

  public void setAllowAutoTaggingMetadata(SettingsMetadata allowAutoTaggingMetadata) {
    this.allowAutoTaggingMetadata = allowAutoTaggingMetadata;
  }

  public AccountSettingsInformation allowBulkSend(String allowBulkSend) {
    this.allowBulkSend = allowBulkSend;
    return this;
  }

   /**
   * 
   * @return allowBulkSend
  **/
  @ApiModelProperty(value = "")
  public String getAllowBulkSend() {
    return allowBulkSend;
  }

  public void setAllowBulkSend(String allowBulkSend) {
    this.allowBulkSend = allowBulkSend;
  }

  public AccountSettingsInformation allowBulkSendMetadata(SettingsMetadata allowBulkSendMetadata) {
    this.allowBulkSendMetadata = allowBulkSendMetadata;
    return this;
  }

   /**
   * Get allowBulkSendMetadata
   * @return allowBulkSendMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowBulkSendMetadata() {
    return allowBulkSendMetadata;
  }

  public void setAllowBulkSendMetadata(SettingsMetadata allowBulkSendMetadata) {
    this.allowBulkSendMetadata = allowBulkSendMetadata;
  }

  public AccountSettingsInformation allowCDWithdraw(String allowCDWithdraw) {
    this.allowCDWithdraw = allowCDWithdraw;
    return this;
  }

   /**
   * 
   * @return allowCDWithdraw
  **/
  @ApiModelProperty(value = "")
  public String getAllowCDWithdraw() {
    return allowCDWithdraw;
  }

  public void setAllowCDWithdraw(String allowCDWithdraw) {
    this.allowCDWithdraw = allowCDWithdraw;
  }

  public AccountSettingsInformation allowCDWithdrawMetadata(SettingsMetadata allowCDWithdrawMetadata) {
    this.allowCDWithdrawMetadata = allowCDWithdrawMetadata;
    return this;
  }

   /**
   * Get allowCDWithdrawMetadata
   * @return allowCDWithdrawMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowCDWithdrawMetadata() {
    return allowCDWithdrawMetadata;
  }

  public void setAllowCDWithdrawMetadata(SettingsMetadata allowCDWithdrawMetadata) {
    this.allowCDWithdrawMetadata = allowCDWithdrawMetadata;
  }

  public AccountSettingsInformation allowConnectHttpListenerConfigs(String allowConnectHttpListenerConfigs) {
    this.allowConnectHttpListenerConfigs = allowConnectHttpListenerConfigs;
    return this;
  }

   /**
   * 
   * @return allowConnectHttpListenerConfigs
  **/
  @ApiModelProperty(value = "")
  public String getAllowConnectHttpListenerConfigs() {
    return allowConnectHttpListenerConfigs;
  }

  public void setAllowConnectHttpListenerConfigs(String allowConnectHttpListenerConfigs) {
    this.allowConnectHttpListenerConfigs = allowConnectHttpListenerConfigs;
  }

  public AccountSettingsInformation allowConnectSendFinishLater(String allowConnectSendFinishLater) {
    this.allowConnectSendFinishLater = allowConnectSendFinishLater;
    return this;
  }

   /**
   * 
   * @return allowConnectSendFinishLater
  **/
  @ApiModelProperty(value = "")
  public String getAllowConnectSendFinishLater() {
    return allowConnectSendFinishLater;
  }

  public void setAllowConnectSendFinishLater(String allowConnectSendFinishLater) {
    this.allowConnectSendFinishLater = allowConnectSendFinishLater;
  }

  public AccountSettingsInformation allowConnectSendFinishLaterMetadata(SettingsMetadata allowConnectSendFinishLaterMetadata) {
    this.allowConnectSendFinishLaterMetadata = allowConnectSendFinishLaterMetadata;
    return this;
  }

   /**
   * Get allowConnectSendFinishLaterMetadata
   * @return allowConnectSendFinishLaterMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowConnectSendFinishLaterMetadata() {
    return allowConnectSendFinishLaterMetadata;
  }

  public void setAllowConnectSendFinishLaterMetadata(SettingsMetadata allowConnectSendFinishLaterMetadata) {
    this.allowConnectSendFinishLaterMetadata = allowConnectSendFinishLaterMetadata;
  }

  public AccountSettingsInformation allowConsumerDisclosureOverride(String allowConsumerDisclosureOverride) {
    this.allowConsumerDisclosureOverride = allowConsumerDisclosureOverride;
    return this;
  }

   /**
   * 
   * @return allowConsumerDisclosureOverride
  **/
  @ApiModelProperty(value = "")
  public String getAllowConsumerDisclosureOverride() {
    return allowConsumerDisclosureOverride;
  }

  public void setAllowConsumerDisclosureOverride(String allowConsumerDisclosureOverride) {
    this.allowConsumerDisclosureOverride = allowConsumerDisclosureOverride;
  }

  public AccountSettingsInformation allowConsumerDisclosureOverrideMetadata(SettingsMetadata allowConsumerDisclosureOverrideMetadata) {
    this.allowConsumerDisclosureOverrideMetadata = allowConsumerDisclosureOverrideMetadata;
    return this;
  }

   /**
   * Get allowConsumerDisclosureOverrideMetadata
   * @return allowConsumerDisclosureOverrideMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowConsumerDisclosureOverrideMetadata() {
    return allowConsumerDisclosureOverrideMetadata;
  }

  public void setAllowConsumerDisclosureOverrideMetadata(SettingsMetadata allowConsumerDisclosureOverrideMetadata) {
    this.allowConsumerDisclosureOverrideMetadata = allowConsumerDisclosureOverrideMetadata;
  }

  public AccountSettingsInformation allowDataDownload(String allowDataDownload) {
    this.allowDataDownload = allowDataDownload;
    return this;
  }

   /**
   * 
   * @return allowDataDownload
  **/
  @ApiModelProperty(value = "")
  public String getAllowDataDownload() {
    return allowDataDownload;
  }

  public void setAllowDataDownload(String allowDataDownload) {
    this.allowDataDownload = allowDataDownload;
  }

  public AccountSettingsInformation allowDataDownloadMetadata(SettingsMetadata allowDataDownloadMetadata) {
    this.allowDataDownloadMetadata = allowDataDownloadMetadata;
    return this;
  }

   /**
   * Get allowDataDownloadMetadata
   * @return allowDataDownloadMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowDataDownloadMetadata() {
    return allowDataDownloadMetadata;
  }

  public void setAllowDataDownloadMetadata(SettingsMetadata allowDataDownloadMetadata) {
    this.allowDataDownloadMetadata = allowDataDownloadMetadata;
  }

  public AccountSettingsInformation allowDocumentDisclosures(String allowDocumentDisclosures) {
    this.allowDocumentDisclosures = allowDocumentDisclosures;
    return this;
  }

   /**
   * 
   * @return allowDocumentDisclosures
  **/
  @ApiModelProperty(value = "")
  public String getAllowDocumentDisclosures() {
    return allowDocumentDisclosures;
  }

  public void setAllowDocumentDisclosures(String allowDocumentDisclosures) {
    this.allowDocumentDisclosures = allowDocumentDisclosures;
  }

  public AccountSettingsInformation allowDocumentDisclosuresMetadata(SettingsMetadata allowDocumentDisclosuresMetadata) {
    this.allowDocumentDisclosuresMetadata = allowDocumentDisclosuresMetadata;
    return this;
  }

   /**
   * Get allowDocumentDisclosuresMetadata
   * @return allowDocumentDisclosuresMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowDocumentDisclosuresMetadata() {
    return allowDocumentDisclosuresMetadata;
  }

  public void setAllowDocumentDisclosuresMetadata(SettingsMetadata allowDocumentDisclosuresMetadata) {
    this.allowDocumentDisclosuresMetadata = allowDocumentDisclosuresMetadata;
  }

  public AccountSettingsInformation allowDocumentsOnSignedEnvelopes(String allowDocumentsOnSignedEnvelopes) {
    this.allowDocumentsOnSignedEnvelopes = allowDocumentsOnSignedEnvelopes;
    return this;
  }

   /**
   * 
   * @return allowDocumentsOnSignedEnvelopes
  **/
  @ApiModelProperty(value = "")
  public String getAllowDocumentsOnSignedEnvelopes() {
    return allowDocumentsOnSignedEnvelopes;
  }

  public void setAllowDocumentsOnSignedEnvelopes(String allowDocumentsOnSignedEnvelopes) {
    this.allowDocumentsOnSignedEnvelopes = allowDocumentsOnSignedEnvelopes;
  }

  public AccountSettingsInformation allowDocumentsOnSignedEnvelopesMetadata(SettingsMetadata allowDocumentsOnSignedEnvelopesMetadata) {
    this.allowDocumentsOnSignedEnvelopesMetadata = allowDocumentsOnSignedEnvelopesMetadata;
    return this;
  }

   /**
   * Get allowDocumentsOnSignedEnvelopesMetadata
   * @return allowDocumentsOnSignedEnvelopesMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowDocumentsOnSignedEnvelopesMetadata() {
    return allowDocumentsOnSignedEnvelopesMetadata;
  }

  public void setAllowDocumentsOnSignedEnvelopesMetadata(SettingsMetadata allowDocumentsOnSignedEnvelopesMetadata) {
    this.allowDocumentsOnSignedEnvelopesMetadata = allowDocumentsOnSignedEnvelopesMetadata;
  }

  public AccountSettingsInformation allowDocumentVisibility(String allowDocumentVisibility) {
    this.allowDocumentVisibility = allowDocumentVisibility;
    return this;
  }

   /**
   * 
   * @return allowDocumentVisibility
  **/
  @ApiModelProperty(value = "")
  public String getAllowDocumentVisibility() {
    return allowDocumentVisibility;
  }

  public void setAllowDocumentVisibility(String allowDocumentVisibility) {
    this.allowDocumentVisibility = allowDocumentVisibility;
  }

  public AccountSettingsInformation allowDocumentVisibilityMetadata(SettingsMetadata allowDocumentVisibilityMetadata) {
    this.allowDocumentVisibilityMetadata = allowDocumentVisibilityMetadata;
    return this;
  }

   /**
   * Get allowDocumentVisibilityMetadata
   * @return allowDocumentVisibilityMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowDocumentVisibilityMetadata() {
    return allowDocumentVisibilityMetadata;
  }

  public void setAllowDocumentVisibilityMetadata(SettingsMetadata allowDocumentVisibilityMetadata) {
    this.allowDocumentVisibilityMetadata = allowDocumentVisibilityMetadata;
  }

  public AccountSettingsInformation allowEHankoStamps(String allowEHankoStamps) {
    this.allowEHankoStamps = allowEHankoStamps;
    return this;
  }

   /**
   * 
   * @return allowEHankoStamps
  **/
  @ApiModelProperty(value = "")
  public String getAllowEHankoStamps() {
    return allowEHankoStamps;
  }

  public void setAllowEHankoStamps(String allowEHankoStamps) {
    this.allowEHankoStamps = allowEHankoStamps;
  }

  public AccountSettingsInformation allowEHankoStampsMetadata(SettingsMetadata allowEHankoStampsMetadata) {
    this.allowEHankoStampsMetadata = allowEHankoStampsMetadata;
    return this;
  }

   /**
   * Get allowEHankoStampsMetadata
   * @return allowEHankoStampsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowEHankoStampsMetadata() {
    return allowEHankoStampsMetadata;
  }

  public void setAllowEHankoStampsMetadata(SettingsMetadata allowEHankoStampsMetadata) {
    this.allowEHankoStampsMetadata = allowEHankoStampsMetadata;
  }

  public AccountSettingsInformation allowENoteEOriginal(String allowENoteEOriginal) {
    this.allowENoteEOriginal = allowENoteEOriginal;
    return this;
  }

   /**
   * 
   * @return allowENoteEOriginal
  **/
  @ApiModelProperty(value = "")
  public String getAllowENoteEOriginal() {
    return allowENoteEOriginal;
  }

  public void setAllowENoteEOriginal(String allowENoteEOriginal) {
    this.allowENoteEOriginal = allowENoteEOriginal;
  }

  public AccountSettingsInformation allowENoteEOriginalMetadata(SettingsMetadata allowENoteEOriginalMetadata) {
    this.allowENoteEOriginalMetadata = allowENoteEOriginalMetadata;
    return this;
  }

   /**
   * Get allowENoteEOriginalMetadata
   * @return allowENoteEOriginalMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowENoteEOriginalMetadata() {
    return allowENoteEOriginalMetadata;
  }

  public void setAllowENoteEOriginalMetadata(SettingsMetadata allowENoteEOriginalMetadata) {
    this.allowENoteEOriginalMetadata = allowENoteEOriginalMetadata;
  }

  public AccountSettingsInformation allowEnvelopeCorrect(String allowEnvelopeCorrect) {
    this.allowEnvelopeCorrect = allowEnvelopeCorrect;
    return this;
  }

   /**
   * 
   * @return allowEnvelopeCorrect
  **/
  @ApiModelProperty(value = "")
  public String getAllowEnvelopeCorrect() {
    return allowEnvelopeCorrect;
  }

  public void setAllowEnvelopeCorrect(String allowEnvelopeCorrect) {
    this.allowEnvelopeCorrect = allowEnvelopeCorrect;
  }

  public AccountSettingsInformation allowEnvelopeCorrectMetadata(SettingsMetadata allowEnvelopeCorrectMetadata) {
    this.allowEnvelopeCorrectMetadata = allowEnvelopeCorrectMetadata;
    return this;
  }

   /**
   * Get allowEnvelopeCorrectMetadata
   * @return allowEnvelopeCorrectMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowEnvelopeCorrectMetadata() {
    return allowEnvelopeCorrectMetadata;
  }

  public void setAllowEnvelopeCorrectMetadata(SettingsMetadata allowEnvelopeCorrectMetadata) {
    this.allowEnvelopeCorrectMetadata = allowEnvelopeCorrectMetadata;
  }

  public AccountSettingsInformation allowEnvelopeCustodyTransfer(String allowEnvelopeCustodyTransfer) {
    this.allowEnvelopeCustodyTransfer = allowEnvelopeCustodyTransfer;
    return this;
  }

   /**
   * 
   * @return allowEnvelopeCustodyTransfer
  **/
  @ApiModelProperty(value = "")
  public String getAllowEnvelopeCustodyTransfer() {
    return allowEnvelopeCustodyTransfer;
  }

  public void setAllowEnvelopeCustodyTransfer(String allowEnvelopeCustodyTransfer) {
    this.allowEnvelopeCustodyTransfer = allowEnvelopeCustodyTransfer;
  }

  public AccountSettingsInformation allowEnvelopeCustodyTransferMetadata(SettingsMetadata allowEnvelopeCustodyTransferMetadata) {
    this.allowEnvelopeCustodyTransferMetadata = allowEnvelopeCustodyTransferMetadata;
    return this;
  }

   /**
   * Get allowEnvelopeCustodyTransferMetadata
   * @return allowEnvelopeCustodyTransferMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowEnvelopeCustodyTransferMetadata() {
    return allowEnvelopeCustodyTransferMetadata;
  }

  public void setAllowEnvelopeCustodyTransferMetadata(SettingsMetadata allowEnvelopeCustodyTransferMetadata) {
    this.allowEnvelopeCustodyTransferMetadata = allowEnvelopeCustodyTransferMetadata;
  }

  public AccountSettingsInformation allowEnvelopeCustomFields(String allowEnvelopeCustomFields) {
    this.allowEnvelopeCustomFields = allowEnvelopeCustomFields;
    return this;
  }

   /**
   * 
   * @return allowEnvelopeCustomFields
  **/
  @ApiModelProperty(value = "")
  public String getAllowEnvelopeCustomFields() {
    return allowEnvelopeCustomFields;
  }

  public void setAllowEnvelopeCustomFields(String allowEnvelopeCustomFields) {
    this.allowEnvelopeCustomFields = allowEnvelopeCustomFields;
  }

  public AccountSettingsInformation allowEnvelopeCustomFieldsMetadata(SettingsMetadata allowEnvelopeCustomFieldsMetadata) {
    this.allowEnvelopeCustomFieldsMetadata = allowEnvelopeCustomFieldsMetadata;
    return this;
  }

   /**
   * Get allowEnvelopeCustomFieldsMetadata
   * @return allowEnvelopeCustomFieldsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowEnvelopeCustomFieldsMetadata() {
    return allowEnvelopeCustomFieldsMetadata;
  }

  public void setAllowEnvelopeCustomFieldsMetadata(SettingsMetadata allowEnvelopeCustomFieldsMetadata) {
    this.allowEnvelopeCustomFieldsMetadata = allowEnvelopeCustomFieldsMetadata;
  }

  public AccountSettingsInformation allowEnvelopePublishReporting(String allowEnvelopePublishReporting) {
    this.allowEnvelopePublishReporting = allowEnvelopePublishReporting;
    return this;
  }

   /**
   * 
   * @return allowEnvelopePublishReporting
  **/
  @ApiModelProperty(value = "")
  public String getAllowEnvelopePublishReporting() {
    return allowEnvelopePublishReporting;
  }

  public void setAllowEnvelopePublishReporting(String allowEnvelopePublishReporting) {
    this.allowEnvelopePublishReporting = allowEnvelopePublishReporting;
  }

  public AccountSettingsInformation allowEnvelopePublishReportingMetadata(SettingsMetadata allowEnvelopePublishReportingMetadata) {
    this.allowEnvelopePublishReportingMetadata = allowEnvelopePublishReportingMetadata;
    return this;
  }

   /**
   * Get allowEnvelopePublishReportingMetadata
   * @return allowEnvelopePublishReportingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowEnvelopePublishReportingMetadata() {
    return allowEnvelopePublishReportingMetadata;
  }

  public void setAllowEnvelopePublishReportingMetadata(SettingsMetadata allowEnvelopePublishReportingMetadata) {
    this.allowEnvelopePublishReportingMetadata = allowEnvelopePublishReportingMetadata;
  }

  public AccountSettingsInformation allowEnvelopeReporting(String allowEnvelopeReporting) {
    this.allowEnvelopeReporting = allowEnvelopeReporting;
    return this;
  }

   /**
   * 
   * @return allowEnvelopeReporting
  **/
  @ApiModelProperty(value = "")
  public String getAllowEnvelopeReporting() {
    return allowEnvelopeReporting;
  }

  public void setAllowEnvelopeReporting(String allowEnvelopeReporting) {
    this.allowEnvelopeReporting = allowEnvelopeReporting;
  }

  public AccountSettingsInformation allowEnvelopeReportingMetadata(SettingsMetadata allowEnvelopeReportingMetadata) {
    this.allowEnvelopeReportingMetadata = allowEnvelopeReportingMetadata;
    return this;
  }

   /**
   * Get allowEnvelopeReportingMetadata
   * @return allowEnvelopeReportingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowEnvelopeReportingMetadata() {
    return allowEnvelopeReportingMetadata;
  }

  public void setAllowEnvelopeReportingMetadata(SettingsMetadata allowEnvelopeReportingMetadata) {
    this.allowEnvelopeReportingMetadata = allowEnvelopeReportingMetadata;
  }

  public AccountSettingsInformation allowExpression(String allowExpression) {
    this.allowExpression = allowExpression;
    return this;
  }

   /**
   * 
   * @return allowExpression
  **/
  @ApiModelProperty(value = "")
  public String getAllowExpression() {
    return allowExpression;
  }

  public void setAllowExpression(String allowExpression) {
    this.allowExpression = allowExpression;
  }

  public AccountSettingsInformation allowExpressionMetadata(SettingsMetadata allowExpressionMetadata) {
    this.allowExpressionMetadata = allowExpressionMetadata;
    return this;
  }

   /**
   * Get allowExpressionMetadata
   * @return allowExpressionMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowExpressionMetadata() {
    return allowExpressionMetadata;
  }

  public void setAllowExpressionMetadata(SettingsMetadata allowExpressionMetadata) {
    this.allowExpressionMetadata = allowExpressionMetadata;
  }

  public AccountSettingsInformation allowExpressSignerCertificate(String allowExpressSignerCertificate) {
    this.allowExpressSignerCertificate = allowExpressSignerCertificate;
    return this;
  }

   /**
   * 
   * @return allowExpressSignerCertificate
  **/
  @ApiModelProperty(value = "")
  public String getAllowExpressSignerCertificate() {
    return allowExpressSignerCertificate;
  }

  public void setAllowExpressSignerCertificate(String allowExpressSignerCertificate) {
    this.allowExpressSignerCertificate = allowExpressSignerCertificate;
  }

  public AccountSettingsInformation allowExpressSignerCertificateMetadata(SettingsMetadata allowExpressSignerCertificateMetadata) {
    this.allowExpressSignerCertificateMetadata = allowExpressSignerCertificateMetadata;
    return this;
  }

   /**
   * Get allowExpressSignerCertificateMetadata
   * @return allowExpressSignerCertificateMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowExpressSignerCertificateMetadata() {
    return allowExpressSignerCertificateMetadata;
  }

  public void setAllowExpressSignerCertificateMetadata(SettingsMetadata allowExpressSignerCertificateMetadata) {
    this.allowExpressSignerCertificateMetadata = allowExpressSignerCertificateMetadata;
  }

  public AccountSettingsInformation allowExtendedSendingResourceFile(String allowExtendedSendingResourceFile) {
    this.allowExtendedSendingResourceFile = allowExtendedSendingResourceFile;
    return this;
  }

   /**
   * 
   * @return allowExtendedSendingResourceFile
  **/
  @ApiModelProperty(value = "")
  public String getAllowExtendedSendingResourceFile() {
    return allowExtendedSendingResourceFile;
  }

  public void setAllowExtendedSendingResourceFile(String allowExtendedSendingResourceFile) {
    this.allowExtendedSendingResourceFile = allowExtendedSendingResourceFile;
  }

  public AccountSettingsInformation allowExtendedSendingResourceFileMetadata(SettingsMetadata allowExtendedSendingResourceFileMetadata) {
    this.allowExtendedSendingResourceFileMetadata = allowExtendedSendingResourceFileMetadata;
    return this;
  }

   /**
   * Get allowExtendedSendingResourceFileMetadata
   * @return allowExtendedSendingResourceFileMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowExtendedSendingResourceFileMetadata() {
    return allowExtendedSendingResourceFileMetadata;
  }

  public void setAllowExtendedSendingResourceFileMetadata(SettingsMetadata allowExtendedSendingResourceFileMetadata) {
    this.allowExtendedSendingResourceFileMetadata = allowExtendedSendingResourceFileMetadata;
  }

  public AccountSettingsInformation allowExternalSignaturePad(String allowExternalSignaturePad) {
    this.allowExternalSignaturePad = allowExternalSignaturePad;
    return this;
  }

   /**
   * 
   * @return allowExternalSignaturePad
  **/
  @ApiModelProperty(value = "")
  public String getAllowExternalSignaturePad() {
    return allowExternalSignaturePad;
  }

  public void setAllowExternalSignaturePad(String allowExternalSignaturePad) {
    this.allowExternalSignaturePad = allowExternalSignaturePad;
  }

  public AccountSettingsInformation allowExternalSignaturePadMetadata(SettingsMetadata allowExternalSignaturePadMetadata) {
    this.allowExternalSignaturePadMetadata = allowExternalSignaturePadMetadata;
    return this;
  }

   /**
   * Get allowExternalSignaturePadMetadata
   * @return allowExternalSignaturePadMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowExternalSignaturePadMetadata() {
    return allowExternalSignaturePadMetadata;
  }

  public void setAllowExternalSignaturePadMetadata(SettingsMetadata allowExternalSignaturePadMetadata) {
    this.allowExternalSignaturePadMetadata = allowExternalSignaturePadMetadata;
  }

  public AccountSettingsInformation allowIDVLevel1(String allowIDVLevel1) {
    this.allowIDVLevel1 = allowIDVLevel1;
    return this;
  }

   /**
   * 
   * @return allowIDVLevel1
  **/
  @ApiModelProperty(value = "")
  public String getAllowIDVLevel1() {
    return allowIDVLevel1;
  }

  public void setAllowIDVLevel1(String allowIDVLevel1) {
    this.allowIDVLevel1 = allowIDVLevel1;
  }

  public AccountSettingsInformation allowIDVLevel1Metadata(SettingsMetadata allowIDVLevel1Metadata) {
    this.allowIDVLevel1Metadata = allowIDVLevel1Metadata;
    return this;
  }

   /**
   * Get allowIDVLevel1Metadata
   * @return allowIDVLevel1Metadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowIDVLevel1Metadata() {
    return allowIDVLevel1Metadata;
  }

  public void setAllowIDVLevel1Metadata(SettingsMetadata allowIDVLevel1Metadata) {
    this.allowIDVLevel1Metadata = allowIDVLevel1Metadata;
  }

  public AccountSettingsInformation allowIDVPlatform(String allowIDVPlatform) {
    this.allowIDVPlatform = allowIDVPlatform;
    return this;
  }

   /**
   * 
   * @return allowIDVPlatform
  **/
  @ApiModelProperty(value = "")
  public String getAllowIDVPlatform() {
    return allowIDVPlatform;
  }

  public void setAllowIDVPlatform(String allowIDVPlatform) {
    this.allowIDVPlatform = allowIDVPlatform;
  }

  public AccountSettingsInformation allowIDVPlatformMetadata(SettingsMetadata allowIDVPlatformMetadata) {
    this.allowIDVPlatformMetadata = allowIDVPlatformMetadata;
    return this;
  }

   /**
   * Get allowIDVPlatformMetadata
   * @return allowIDVPlatformMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowIDVPlatformMetadata() {
    return allowIDVPlatformMetadata;
  }

  public void setAllowIDVPlatformMetadata(SettingsMetadata allowIDVPlatformMetadata) {
    this.allowIDVPlatformMetadata = allowIDVPlatformMetadata;
  }

  public AccountSettingsInformation allowInPerson(String allowInPerson) {
    this.allowInPerson = allowInPerson;
    return this;
  }

   /**
   * 
   * @return allowInPerson
  **/
  @ApiModelProperty(value = "")
  public String getAllowInPerson() {
    return allowInPerson;
  }

  public void setAllowInPerson(String allowInPerson) {
    this.allowInPerson = allowInPerson;
  }

  public AccountSettingsInformation allowInPersonMetadata(SettingsMetadata allowInPersonMetadata) {
    this.allowInPersonMetadata = allowInPersonMetadata;
    return this;
  }

   /**
   * Get allowInPersonMetadata
   * @return allowInPersonMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowInPersonMetadata() {
    return allowInPersonMetadata;
  }

  public void setAllowInPersonMetadata(SettingsMetadata allowInPersonMetadata) {
    this.allowInPersonMetadata = allowInPersonMetadata;
  }

  public AccountSettingsInformation allowManagedStamps(String allowManagedStamps) {
    this.allowManagedStamps = allowManagedStamps;
    return this;
  }

   /**
   * 
   * @return allowManagedStamps
  **/
  @ApiModelProperty(value = "")
  public String getAllowManagedStamps() {
    return allowManagedStamps;
  }

  public void setAllowManagedStamps(String allowManagedStamps) {
    this.allowManagedStamps = allowManagedStamps;
  }

  public AccountSettingsInformation allowManagedStampsMetadata(SettingsMetadata allowManagedStampsMetadata) {
    this.allowManagedStampsMetadata = allowManagedStampsMetadata;
    return this;
  }

   /**
   * Get allowManagedStampsMetadata
   * @return allowManagedStampsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowManagedStampsMetadata() {
    return allowManagedStampsMetadata;
  }

  public void setAllowManagedStampsMetadata(SettingsMetadata allowManagedStampsMetadata) {
    this.allowManagedStampsMetadata = allowManagedStampsMetadata;
  }

  public AccountSettingsInformation allowMarkup(String allowMarkup) {
    this.allowMarkup = allowMarkup;
    return this;
  }

   /**
   * When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this
   * @return allowMarkup
  **/
  @ApiModelProperty(value = "When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this")
  public String getAllowMarkup() {
    return allowMarkup;
  }

  public void setAllowMarkup(String allowMarkup) {
    this.allowMarkup = allowMarkup;
  }

  public AccountSettingsInformation allowMarkupMetadata(SettingsMetadata allowMarkupMetadata) {
    this.allowMarkupMetadata = allowMarkupMetadata;
    return this;
  }

   /**
   * Get allowMarkupMetadata
   * @return allowMarkupMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowMarkupMetadata() {
    return allowMarkupMetadata;
  }

  public void setAllowMarkupMetadata(SettingsMetadata allowMarkupMetadata) {
    this.allowMarkupMetadata = allowMarkupMetadata;
  }

  public AccountSettingsInformation allowMemberTimeZone(String allowMemberTimeZone) {
    this.allowMemberTimeZone = allowMemberTimeZone;
    return this;
  }

   /**
   * 
   * @return allowMemberTimeZone
  **/
  @ApiModelProperty(value = "")
  public String getAllowMemberTimeZone() {
    return allowMemberTimeZone;
  }

  public void setAllowMemberTimeZone(String allowMemberTimeZone) {
    this.allowMemberTimeZone = allowMemberTimeZone;
  }

  public AccountSettingsInformation allowMemberTimeZoneMetadata(SettingsMetadata allowMemberTimeZoneMetadata) {
    this.allowMemberTimeZoneMetadata = allowMemberTimeZoneMetadata;
    return this;
  }

   /**
   * Get allowMemberTimeZoneMetadata
   * @return allowMemberTimeZoneMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowMemberTimeZoneMetadata() {
    return allowMemberTimeZoneMetadata;
  }

  public void setAllowMemberTimeZoneMetadata(SettingsMetadata allowMemberTimeZoneMetadata) {
    this.allowMemberTimeZoneMetadata = allowMemberTimeZoneMetadata;
  }

  public AccountSettingsInformation allowMergeFields(String allowMergeFields) {
    this.allowMergeFields = allowMergeFields;
    return this;
  }

   /**
   * 
   * @return allowMergeFields
  **/
  @ApiModelProperty(value = "")
  public String getAllowMergeFields() {
    return allowMergeFields;
  }

  public void setAllowMergeFields(String allowMergeFields) {
    this.allowMergeFields = allowMergeFields;
  }

  public AccountSettingsInformation allowMergeFieldsMetadata(SettingsMetadata allowMergeFieldsMetadata) {
    this.allowMergeFieldsMetadata = allowMergeFieldsMetadata;
    return this;
  }

   /**
   * Get allowMergeFieldsMetadata
   * @return allowMergeFieldsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowMergeFieldsMetadata() {
    return allowMergeFieldsMetadata;
  }

  public void setAllowMergeFieldsMetadata(SettingsMetadata allowMergeFieldsMetadata) {
    this.allowMergeFieldsMetadata = allowMergeFieldsMetadata;
  }

  public AccountSettingsInformation allowMultipleBrandProfiles(String allowMultipleBrandProfiles) {
    this.allowMultipleBrandProfiles = allowMultipleBrandProfiles;
    return this;
  }

   /**
   * 
   * @return allowMultipleBrandProfiles
  **/
  @ApiModelProperty(value = "")
  public String getAllowMultipleBrandProfiles() {
    return allowMultipleBrandProfiles;
  }

  public void setAllowMultipleBrandProfiles(String allowMultipleBrandProfiles) {
    this.allowMultipleBrandProfiles = allowMultipleBrandProfiles;
  }

  public AccountSettingsInformation allowMultipleBrandProfilesMetadata(SettingsMetadata allowMultipleBrandProfilesMetadata) {
    this.allowMultipleBrandProfilesMetadata = allowMultipleBrandProfilesMetadata;
    return this;
  }

   /**
   * Get allowMultipleBrandProfilesMetadata
   * @return allowMultipleBrandProfilesMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowMultipleBrandProfilesMetadata() {
    return allowMultipleBrandProfilesMetadata;
  }

  public void setAllowMultipleBrandProfilesMetadata(SettingsMetadata allowMultipleBrandProfilesMetadata) {
    this.allowMultipleBrandProfilesMetadata = allowMultipleBrandProfilesMetadata;
  }

  public AccountSettingsInformation allowMultipleSignerAttachments(String allowMultipleSignerAttachments) {
    this.allowMultipleSignerAttachments = allowMultipleSignerAttachments;
    return this;
  }

   /**
   * 
   * @return allowMultipleSignerAttachments
  **/
  @ApiModelProperty(value = "")
  public String getAllowMultipleSignerAttachments() {
    return allowMultipleSignerAttachments;
  }

  public void setAllowMultipleSignerAttachments(String allowMultipleSignerAttachments) {
    this.allowMultipleSignerAttachments = allowMultipleSignerAttachments;
  }

  public AccountSettingsInformation allowMultipleSignerAttachmentsMetadata(SettingsMetadata allowMultipleSignerAttachmentsMetadata) {
    this.allowMultipleSignerAttachmentsMetadata = allowMultipleSignerAttachmentsMetadata;
    return this;
  }

   /**
   * Get allowMultipleSignerAttachmentsMetadata
   * @return allowMultipleSignerAttachmentsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowMultipleSignerAttachmentsMetadata() {
    return allowMultipleSignerAttachmentsMetadata;
  }

  public void setAllowMultipleSignerAttachmentsMetadata(SettingsMetadata allowMultipleSignerAttachmentsMetadata) {
    this.allowMultipleSignerAttachmentsMetadata = allowMultipleSignerAttachmentsMetadata;
  }

  public AccountSettingsInformation allowNonUSPhoneAuth(String allowNonUSPhoneAuth) {
    this.allowNonUSPhoneAuth = allowNonUSPhoneAuth;
    return this;
  }

   /**
   * 
   * @return allowNonUSPhoneAuth
  **/
  @ApiModelProperty(value = "")
  public String getAllowNonUSPhoneAuth() {
    return allowNonUSPhoneAuth;
  }

  public void setAllowNonUSPhoneAuth(String allowNonUSPhoneAuth) {
    this.allowNonUSPhoneAuth = allowNonUSPhoneAuth;
  }

  public AccountSettingsInformation allowNonUSPhoneAuthMetadata(SettingsMetadata allowNonUSPhoneAuthMetadata) {
    this.allowNonUSPhoneAuthMetadata = allowNonUSPhoneAuthMetadata;
    return this;
  }

   /**
   * Get allowNonUSPhoneAuthMetadata
   * @return allowNonUSPhoneAuthMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowNonUSPhoneAuthMetadata() {
    return allowNonUSPhoneAuthMetadata;
  }

  public void setAllowNonUSPhoneAuthMetadata(SettingsMetadata allowNonUSPhoneAuthMetadata) {
    this.allowNonUSPhoneAuthMetadata = allowNonUSPhoneAuthMetadata;
  }

  public AccountSettingsInformation allowOcrOfEnvelopeDocuments(String allowOcrOfEnvelopeDocuments) {
    this.allowOcrOfEnvelopeDocuments = allowOcrOfEnvelopeDocuments;
    return this;
  }

   /**
   * 
   * @return allowOcrOfEnvelopeDocuments
  **/
  @ApiModelProperty(value = "")
  public String getAllowOcrOfEnvelopeDocuments() {
    return allowOcrOfEnvelopeDocuments;
  }

  public void setAllowOcrOfEnvelopeDocuments(String allowOcrOfEnvelopeDocuments) {
    this.allowOcrOfEnvelopeDocuments = allowOcrOfEnvelopeDocuments;
  }

  public AccountSettingsInformation allowOcrOfEnvelopeDocumentsMetadata(SettingsMetadata allowOcrOfEnvelopeDocumentsMetadata) {
    this.allowOcrOfEnvelopeDocumentsMetadata = allowOcrOfEnvelopeDocumentsMetadata;
    return this;
  }

   /**
   * Get allowOcrOfEnvelopeDocumentsMetadata
   * @return allowOcrOfEnvelopeDocumentsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowOcrOfEnvelopeDocumentsMetadata() {
    return allowOcrOfEnvelopeDocumentsMetadata;
  }

  public void setAllowOcrOfEnvelopeDocumentsMetadata(SettingsMetadata allowOcrOfEnvelopeDocumentsMetadata) {
    this.allowOcrOfEnvelopeDocumentsMetadata = allowOcrOfEnvelopeDocumentsMetadata;
  }

  public AccountSettingsInformation allowOfflineSigning(String allowOfflineSigning) {
    this.allowOfflineSigning = allowOfflineSigning;
    return this;
  }

   /**
   * 
   * @return allowOfflineSigning
  **/
  @ApiModelProperty(value = "")
  public String getAllowOfflineSigning() {
    return allowOfflineSigning;
  }

  public void setAllowOfflineSigning(String allowOfflineSigning) {
    this.allowOfflineSigning = allowOfflineSigning;
  }

  public AccountSettingsInformation allowOfflineSigningMetadata(SettingsMetadata allowOfflineSigningMetadata) {
    this.allowOfflineSigningMetadata = allowOfflineSigningMetadata;
    return this;
  }

   /**
   * Get allowOfflineSigningMetadata
   * @return allowOfflineSigningMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowOfflineSigningMetadata() {
    return allowOfflineSigningMetadata;
  }

  public void setAllowOfflineSigningMetadata(SettingsMetadata allowOfflineSigningMetadata) {
    this.allowOfflineSigningMetadata = allowOfflineSigningMetadata;
  }

  public AccountSettingsInformation allowOpenTrustSignerCertificate(String allowOpenTrustSignerCertificate) {
    this.allowOpenTrustSignerCertificate = allowOpenTrustSignerCertificate;
    return this;
  }

   /**
   * 
   * @return allowOpenTrustSignerCertificate
  **/
  @ApiModelProperty(value = "")
  public String getAllowOpenTrustSignerCertificate() {
    return allowOpenTrustSignerCertificate;
  }

  public void setAllowOpenTrustSignerCertificate(String allowOpenTrustSignerCertificate) {
    this.allowOpenTrustSignerCertificate = allowOpenTrustSignerCertificate;
  }

  public AccountSettingsInformation allowOpenTrustSignerCertificateMetadata(SettingsMetadata allowOpenTrustSignerCertificateMetadata) {
    this.allowOpenTrustSignerCertificateMetadata = allowOpenTrustSignerCertificateMetadata;
    return this;
  }

   /**
   * Get allowOpenTrustSignerCertificateMetadata
   * @return allowOpenTrustSignerCertificateMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowOpenTrustSignerCertificateMetadata() {
    return allowOpenTrustSignerCertificateMetadata;
  }

  public void setAllowOpenTrustSignerCertificateMetadata(SettingsMetadata allowOpenTrustSignerCertificateMetadata) {
    this.allowOpenTrustSignerCertificateMetadata = allowOpenTrustSignerCertificateMetadata;
  }

  public AccountSettingsInformation allowOrganizations(String allowOrganizations) {
    this.allowOrganizations = allowOrganizations;
    return this;
  }

   /**
   * 
   * @return allowOrganizations
  **/
  @ApiModelProperty(value = "")
  public String getAllowOrganizations() {
    return allowOrganizations;
  }

  public void setAllowOrganizations(String allowOrganizations) {
    this.allowOrganizations = allowOrganizations;
  }

  public AccountSettingsInformation allowOrganizationsMetadata(SettingsMetadata allowOrganizationsMetadata) {
    this.allowOrganizationsMetadata = allowOrganizationsMetadata;
    return this;
  }

   /**
   * Get allowOrganizationsMetadata
   * @return allowOrganizationsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowOrganizationsMetadata() {
    return allowOrganizationsMetadata;
  }

  public void setAllowOrganizationsMetadata(SettingsMetadata allowOrganizationsMetadata) {
    this.allowOrganizationsMetadata = allowOrganizationsMetadata;
  }

  public AccountSettingsInformation allowPaymentProcessing(String allowPaymentProcessing) {
    this.allowPaymentProcessing = allowPaymentProcessing;
    return this;
  }

   /**
   * 
   * @return allowPaymentProcessing
  **/
  @ApiModelProperty(value = "")
  public String getAllowPaymentProcessing() {
    return allowPaymentProcessing;
  }

  public void setAllowPaymentProcessing(String allowPaymentProcessing) {
    this.allowPaymentProcessing = allowPaymentProcessing;
  }

  public AccountSettingsInformation allowPaymentProcessingMetadata(SettingsMetadata allowPaymentProcessingMetadata) {
    this.allowPaymentProcessingMetadata = allowPaymentProcessingMetadata;
    return this;
  }

   /**
   * Get allowPaymentProcessingMetadata
   * @return allowPaymentProcessingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowPaymentProcessingMetadata() {
    return allowPaymentProcessingMetadata;
  }

  public void setAllowPaymentProcessingMetadata(SettingsMetadata allowPaymentProcessingMetadata) {
    this.allowPaymentProcessingMetadata = allowPaymentProcessingMetadata;
  }

  public AccountSettingsInformation allowPersonalSignerCertificate(String allowPersonalSignerCertificate) {
    this.allowPersonalSignerCertificate = allowPersonalSignerCertificate;
    return this;
  }

   /**
   * 
   * @return allowPersonalSignerCertificate
  **/
  @ApiModelProperty(value = "")
  public String getAllowPersonalSignerCertificate() {
    return allowPersonalSignerCertificate;
  }

  public void setAllowPersonalSignerCertificate(String allowPersonalSignerCertificate) {
    this.allowPersonalSignerCertificate = allowPersonalSignerCertificate;
  }

  public AccountSettingsInformation allowPersonalSignerCertificateMetadata(SettingsMetadata allowPersonalSignerCertificateMetadata) {
    this.allowPersonalSignerCertificateMetadata = allowPersonalSignerCertificateMetadata;
    return this;
  }

   /**
   * Get allowPersonalSignerCertificateMetadata
   * @return allowPersonalSignerCertificateMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowPersonalSignerCertificateMetadata() {
    return allowPersonalSignerCertificateMetadata;
  }

  public void setAllowPersonalSignerCertificateMetadata(SettingsMetadata allowPersonalSignerCertificateMetadata) {
    this.allowPersonalSignerCertificateMetadata = allowPersonalSignerCertificateMetadata;
  }

  public AccountSettingsInformation allowPhoneAuthentication(String allowPhoneAuthentication) {
    this.allowPhoneAuthentication = allowPhoneAuthentication;
    return this;
  }

   /**
   * 
   * @return allowPhoneAuthentication
  **/
  @ApiModelProperty(value = "")
  public String getAllowPhoneAuthentication() {
    return allowPhoneAuthentication;
  }

  public void setAllowPhoneAuthentication(String allowPhoneAuthentication) {
    this.allowPhoneAuthentication = allowPhoneAuthentication;
  }

  public AccountSettingsInformation allowPhoneAuthenticationMetadata(SettingsMetadata allowPhoneAuthenticationMetadata) {
    this.allowPhoneAuthenticationMetadata = allowPhoneAuthenticationMetadata;
    return this;
  }

   /**
   * Get allowPhoneAuthenticationMetadata
   * @return allowPhoneAuthenticationMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowPhoneAuthenticationMetadata() {
    return allowPhoneAuthenticationMetadata;
  }

  public void setAllowPhoneAuthenticationMetadata(SettingsMetadata allowPhoneAuthenticationMetadata) {
    this.allowPhoneAuthenticationMetadata = allowPhoneAuthenticationMetadata;
  }

  public AccountSettingsInformation allowPhoneAuthOverride(String allowPhoneAuthOverride) {
    this.allowPhoneAuthOverride = allowPhoneAuthOverride;
    return this;
  }

   /**
   * 
   * @return allowPhoneAuthOverride
  **/
  @ApiModelProperty(value = "")
  public String getAllowPhoneAuthOverride() {
    return allowPhoneAuthOverride;
  }

  public void setAllowPhoneAuthOverride(String allowPhoneAuthOverride) {
    this.allowPhoneAuthOverride = allowPhoneAuthOverride;
  }

  public AccountSettingsInformation allowPhoneAuthOverrideMetadata(SettingsMetadata allowPhoneAuthOverrideMetadata) {
    this.allowPhoneAuthOverrideMetadata = allowPhoneAuthOverrideMetadata;
    return this;
  }

   /**
   * Get allowPhoneAuthOverrideMetadata
   * @return allowPhoneAuthOverrideMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowPhoneAuthOverrideMetadata() {
    return allowPhoneAuthOverrideMetadata;
  }

  public void setAllowPhoneAuthOverrideMetadata(SettingsMetadata allowPhoneAuthOverrideMetadata) {
    this.allowPhoneAuthOverrideMetadata = allowPhoneAuthOverrideMetadata;
  }

  public AccountSettingsInformation allowPrivateSigningGroups(String allowPrivateSigningGroups) {
    this.allowPrivateSigningGroups = allowPrivateSigningGroups;
    return this;
  }

   /**
   * 
   * @return allowPrivateSigningGroups
  **/
  @ApiModelProperty(value = "")
  public String getAllowPrivateSigningGroups() {
    return allowPrivateSigningGroups;
  }

  public void setAllowPrivateSigningGroups(String allowPrivateSigningGroups) {
    this.allowPrivateSigningGroups = allowPrivateSigningGroups;
  }

  public AccountSettingsInformation allowPrivateSigningGroupsMetadata(SettingsMetadata allowPrivateSigningGroupsMetadata) {
    this.allowPrivateSigningGroupsMetadata = allowPrivateSigningGroupsMetadata;
    return this;
  }

   /**
   * Get allowPrivateSigningGroupsMetadata
   * @return allowPrivateSigningGroupsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowPrivateSigningGroupsMetadata() {
    return allowPrivateSigningGroupsMetadata;
  }

  public void setAllowPrivateSigningGroupsMetadata(SettingsMetadata allowPrivateSigningGroupsMetadata) {
    this.allowPrivateSigningGroupsMetadata = allowPrivateSigningGroupsMetadata;
  }

  public AccountSettingsInformation allowReminders(String allowReminders) {
    this.allowReminders = allowReminders;
    return this;
  }

   /**
   * 
   * @return allowReminders
  **/
  @ApiModelProperty(value = "")
  public String getAllowReminders() {
    return allowReminders;
  }

  public void setAllowReminders(String allowReminders) {
    this.allowReminders = allowReminders;
  }

  public AccountSettingsInformation allowRemindersMetadata(SettingsMetadata allowRemindersMetadata) {
    this.allowRemindersMetadata = allowRemindersMetadata;
    return this;
  }

   /**
   * Get allowRemindersMetadata
   * @return allowRemindersMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowRemindersMetadata() {
    return allowRemindersMetadata;
  }

  public void setAllowRemindersMetadata(SettingsMetadata allowRemindersMetadata) {
    this.allowRemindersMetadata = allowRemindersMetadata;
  }

  public AccountSettingsInformation allowResourceFileBranding(String allowResourceFileBranding) {
    this.allowResourceFileBranding = allowResourceFileBranding;
    return this;
  }

   /**
   * 
   * @return allowResourceFileBranding
  **/
  @ApiModelProperty(value = "")
  public String getAllowResourceFileBranding() {
    return allowResourceFileBranding;
  }

  public void setAllowResourceFileBranding(String allowResourceFileBranding) {
    this.allowResourceFileBranding = allowResourceFileBranding;
  }

  public AccountSettingsInformation allowResourceFileBrandingMetadata(SettingsMetadata allowResourceFileBrandingMetadata) {
    this.allowResourceFileBrandingMetadata = allowResourceFileBrandingMetadata;
    return this;
  }

   /**
   * Get allowResourceFileBrandingMetadata
   * @return allowResourceFileBrandingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowResourceFileBrandingMetadata() {
    return allowResourceFileBrandingMetadata;
  }

  public void setAllowResourceFileBrandingMetadata(SettingsMetadata allowResourceFileBrandingMetadata) {
    this.allowResourceFileBrandingMetadata = allowResourceFileBrandingMetadata;
  }

  public AccountSettingsInformation allowSafeBioPharmaSignerCertificate(String allowSafeBioPharmaSignerCertificate) {
    this.allowSafeBioPharmaSignerCertificate = allowSafeBioPharmaSignerCertificate;
    return this;
  }

   /**
   * 
   * @return allowSafeBioPharmaSignerCertificate
  **/
  @ApiModelProperty(value = "")
  public String getAllowSafeBioPharmaSignerCertificate() {
    return allowSafeBioPharmaSignerCertificate;
  }

  public void setAllowSafeBioPharmaSignerCertificate(String allowSafeBioPharmaSignerCertificate) {
    this.allowSafeBioPharmaSignerCertificate = allowSafeBioPharmaSignerCertificate;
  }

  public AccountSettingsInformation allowSafeBioPharmaSignerCertificateMetadata(SettingsMetadata allowSafeBioPharmaSignerCertificateMetadata) {
    this.allowSafeBioPharmaSignerCertificateMetadata = allowSafeBioPharmaSignerCertificateMetadata;
    return this;
  }

   /**
   * Get allowSafeBioPharmaSignerCertificateMetadata
   * @return allowSafeBioPharmaSignerCertificateMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSafeBioPharmaSignerCertificateMetadata() {
    return allowSafeBioPharmaSignerCertificateMetadata;
  }

  public void setAllowSafeBioPharmaSignerCertificateMetadata(SettingsMetadata allowSafeBioPharmaSignerCertificateMetadata) {
    this.allowSafeBioPharmaSignerCertificateMetadata = allowSafeBioPharmaSignerCertificateMetadata;
  }

  public AccountSettingsInformation allowSecurityAppliance(String allowSecurityAppliance) {
    this.allowSecurityAppliance = allowSecurityAppliance;
    return this;
  }

   /**
   * 
   * @return allowSecurityAppliance
  **/
  @ApiModelProperty(value = "")
  public String getAllowSecurityAppliance() {
    return allowSecurityAppliance;
  }

  public void setAllowSecurityAppliance(String allowSecurityAppliance) {
    this.allowSecurityAppliance = allowSecurityAppliance;
  }

  public AccountSettingsInformation allowSecurityApplianceMetadata(SettingsMetadata allowSecurityApplianceMetadata) {
    this.allowSecurityApplianceMetadata = allowSecurityApplianceMetadata;
    return this;
  }

   /**
   * Get allowSecurityApplianceMetadata
   * @return allowSecurityApplianceMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSecurityApplianceMetadata() {
    return allowSecurityApplianceMetadata;
  }

  public void setAllowSecurityApplianceMetadata(SettingsMetadata allowSecurityApplianceMetadata) {
    this.allowSecurityApplianceMetadata = allowSecurityApplianceMetadata;
  }

  public AccountSettingsInformation allowSendToCertifiedDelivery(String allowSendToCertifiedDelivery) {
    this.allowSendToCertifiedDelivery = allowSendToCertifiedDelivery;
    return this;
  }

   /**
   * 
   * @return allowSendToCertifiedDelivery
  **/
  @ApiModelProperty(value = "")
  public String getAllowSendToCertifiedDelivery() {
    return allowSendToCertifiedDelivery;
  }

  public void setAllowSendToCertifiedDelivery(String allowSendToCertifiedDelivery) {
    this.allowSendToCertifiedDelivery = allowSendToCertifiedDelivery;
  }

  public AccountSettingsInformation allowSendToCertifiedDeliveryMetadata(SettingsMetadata allowSendToCertifiedDeliveryMetadata) {
    this.allowSendToCertifiedDeliveryMetadata = allowSendToCertifiedDeliveryMetadata;
    return this;
  }

   /**
   * Get allowSendToCertifiedDeliveryMetadata
   * @return allowSendToCertifiedDeliveryMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSendToCertifiedDeliveryMetadata() {
    return allowSendToCertifiedDeliveryMetadata;
  }

  public void setAllowSendToCertifiedDeliveryMetadata(SettingsMetadata allowSendToCertifiedDeliveryMetadata) {
    this.allowSendToCertifiedDeliveryMetadata = allowSendToCertifiedDeliveryMetadata;
  }

  public AccountSettingsInformation allowSendToIntermediary(String allowSendToIntermediary) {
    this.allowSendToIntermediary = allowSendToIntermediary;
    return this;
  }

   /**
   * 
   * @return allowSendToIntermediary
  **/
  @ApiModelProperty(value = "")
  public String getAllowSendToIntermediary() {
    return allowSendToIntermediary;
  }

  public void setAllowSendToIntermediary(String allowSendToIntermediary) {
    this.allowSendToIntermediary = allowSendToIntermediary;
  }

  public AccountSettingsInformation allowSendToIntermediaryMetadata(SettingsMetadata allowSendToIntermediaryMetadata) {
    this.allowSendToIntermediaryMetadata = allowSendToIntermediaryMetadata;
    return this;
  }

   /**
   * Get allowSendToIntermediaryMetadata
   * @return allowSendToIntermediaryMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSendToIntermediaryMetadata() {
    return allowSendToIntermediaryMetadata;
  }

  public void setAllowSendToIntermediaryMetadata(SettingsMetadata allowSendToIntermediaryMetadata) {
    this.allowSendToIntermediaryMetadata = allowSendToIntermediaryMetadata;
  }

  public AccountSettingsInformation allowServerTemplates(String allowServerTemplates) {
    this.allowServerTemplates = allowServerTemplates;
    return this;
  }

   /**
   * 
   * @return allowServerTemplates
  **/
  @ApiModelProperty(value = "")
  public String getAllowServerTemplates() {
    return allowServerTemplates;
  }

  public void setAllowServerTemplates(String allowServerTemplates) {
    this.allowServerTemplates = allowServerTemplates;
  }

  public AccountSettingsInformation allowServerTemplatesMetadata(SettingsMetadata allowServerTemplatesMetadata) {
    this.allowServerTemplatesMetadata = allowServerTemplatesMetadata;
    return this;
  }

   /**
   * Get allowServerTemplatesMetadata
   * @return allowServerTemplatesMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowServerTemplatesMetadata() {
    return allowServerTemplatesMetadata;
  }

  public void setAllowServerTemplatesMetadata(SettingsMetadata allowServerTemplatesMetadata) {
    this.allowServerTemplatesMetadata = allowServerTemplatesMetadata;
  }

  public AccountSettingsInformation allowSetEmbeddedRecipientStartURL(String allowSetEmbeddedRecipientStartURL) {
    this.allowSetEmbeddedRecipientStartURL = allowSetEmbeddedRecipientStartURL;
    return this;
  }

   /**
   * 
   * @return allowSetEmbeddedRecipientStartURL
  **/
  @ApiModelProperty(value = "")
  public String getAllowSetEmbeddedRecipientStartURL() {
    return allowSetEmbeddedRecipientStartURL;
  }

  public void setAllowSetEmbeddedRecipientStartURL(String allowSetEmbeddedRecipientStartURL) {
    this.allowSetEmbeddedRecipientStartURL = allowSetEmbeddedRecipientStartURL;
  }

  public AccountSettingsInformation allowSetEmbeddedRecipientStartURLMetadata(SettingsMetadata allowSetEmbeddedRecipientStartURLMetadata) {
    this.allowSetEmbeddedRecipientStartURLMetadata = allowSetEmbeddedRecipientStartURLMetadata;
    return this;
  }

   /**
   * Get allowSetEmbeddedRecipientStartURLMetadata
   * @return allowSetEmbeddedRecipientStartURLMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSetEmbeddedRecipientStartURLMetadata() {
    return allowSetEmbeddedRecipientStartURLMetadata;
  }

  public void setAllowSetEmbeddedRecipientStartURLMetadata(SettingsMetadata allowSetEmbeddedRecipientStartURLMetadata) {
    this.allowSetEmbeddedRecipientStartURLMetadata = allowSetEmbeddedRecipientStartURLMetadata;
  }

  public AccountSettingsInformation allowSharedTabs(String allowSharedTabs) {
    this.allowSharedTabs = allowSharedTabs;
    return this;
  }

   /**
   * 
   * @return allowSharedTabs
  **/
  @ApiModelProperty(value = "")
  public String getAllowSharedTabs() {
    return allowSharedTabs;
  }

  public void setAllowSharedTabs(String allowSharedTabs) {
    this.allowSharedTabs = allowSharedTabs;
  }

  public AccountSettingsInformation allowSharedTabsMetadata(SettingsMetadata allowSharedTabsMetadata) {
    this.allowSharedTabsMetadata = allowSharedTabsMetadata;
    return this;
  }

   /**
   * Get allowSharedTabsMetadata
   * @return allowSharedTabsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSharedTabsMetadata() {
    return allowSharedTabsMetadata;
  }

  public void setAllowSharedTabsMetadata(SettingsMetadata allowSharedTabsMetadata) {
    this.allowSharedTabsMetadata = allowSharedTabsMetadata;
  }

  public AccountSettingsInformation allowSignatureStamps(String allowSignatureStamps) {
    this.allowSignatureStamps = allowSignatureStamps;
    return this;
  }

   /**
   * 
   * @return allowSignatureStamps
  **/
  @ApiModelProperty(value = "")
  public String getAllowSignatureStamps() {
    return allowSignatureStamps;
  }

  public void setAllowSignatureStamps(String allowSignatureStamps) {
    this.allowSignatureStamps = allowSignatureStamps;
  }

  public AccountSettingsInformation allowSignatureStampsMetadata(SettingsMetadata allowSignatureStampsMetadata) {
    this.allowSignatureStampsMetadata = allowSignatureStampsMetadata;
    return this;
  }

   /**
   * Get allowSignatureStampsMetadata
   * @return allowSignatureStampsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSignatureStampsMetadata() {
    return allowSignatureStampsMetadata;
  }

  public void setAllowSignatureStampsMetadata(SettingsMetadata allowSignatureStampsMetadata) {
    this.allowSignatureStampsMetadata = allowSignatureStampsMetadata;
  }

  public AccountSettingsInformation allowSignDocumentFromHomePage(String allowSignDocumentFromHomePage) {
    this.allowSignDocumentFromHomePage = allowSignDocumentFromHomePage;
    return this;
  }

   /**
   * 
   * @return allowSignDocumentFromHomePage
  **/
  @ApiModelProperty(value = "")
  public String getAllowSignDocumentFromHomePage() {
    return allowSignDocumentFromHomePage;
  }

  public void setAllowSignDocumentFromHomePage(String allowSignDocumentFromHomePage) {
    this.allowSignDocumentFromHomePage = allowSignDocumentFromHomePage;
  }

  public AccountSettingsInformation allowSignDocumentFromHomePageMetadata(SettingsMetadata allowSignDocumentFromHomePageMetadata) {
    this.allowSignDocumentFromHomePageMetadata = allowSignDocumentFromHomePageMetadata;
    return this;
  }

   /**
   * Get allowSignDocumentFromHomePageMetadata
   * @return allowSignDocumentFromHomePageMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSignDocumentFromHomePageMetadata() {
    return allowSignDocumentFromHomePageMetadata;
  }

  public void setAllowSignDocumentFromHomePageMetadata(SettingsMetadata allowSignDocumentFromHomePageMetadata) {
    this.allowSignDocumentFromHomePageMetadata = allowSignDocumentFromHomePageMetadata;
  }

  public AccountSettingsInformation allowSignerReassign(String allowSignerReassign) {
    this.allowSignerReassign = allowSignerReassign;
    return this;
  }

   /**
   * 
   * @return allowSignerReassign
  **/
  @ApiModelProperty(value = "")
  public String getAllowSignerReassign() {
    return allowSignerReassign;
  }

  public void setAllowSignerReassign(String allowSignerReassign) {
    this.allowSignerReassign = allowSignerReassign;
  }

  public AccountSettingsInformation allowSignerReassignMetadata(SettingsMetadata allowSignerReassignMetadata) {
    this.allowSignerReassignMetadata = allowSignerReassignMetadata;
    return this;
  }

   /**
   * Get allowSignerReassignMetadata
   * @return allowSignerReassignMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSignerReassignMetadata() {
    return allowSignerReassignMetadata;
  }

  public void setAllowSignerReassignMetadata(SettingsMetadata allowSignerReassignMetadata) {
    this.allowSignerReassignMetadata = allowSignerReassignMetadata;
  }

  public AccountSettingsInformation allowSignerReassignOverride(String allowSignerReassignOverride) {
    this.allowSignerReassignOverride = allowSignerReassignOverride;
    return this;
  }

   /**
   * 
   * @return allowSignerReassignOverride
  **/
  @ApiModelProperty(value = "")
  public String getAllowSignerReassignOverride() {
    return allowSignerReassignOverride;
  }

  public void setAllowSignerReassignOverride(String allowSignerReassignOverride) {
    this.allowSignerReassignOverride = allowSignerReassignOverride;
  }

  public AccountSettingsInformation allowSignerReassignOverrideMetadata(SettingsMetadata allowSignerReassignOverrideMetadata) {
    this.allowSignerReassignOverrideMetadata = allowSignerReassignOverrideMetadata;
    return this;
  }

   /**
   * Get allowSignerReassignOverrideMetadata
   * @return allowSignerReassignOverrideMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSignerReassignOverrideMetadata() {
    return allowSignerReassignOverrideMetadata;
  }

  public void setAllowSignerReassignOverrideMetadata(SettingsMetadata allowSignerReassignOverrideMetadata) {
    this.allowSignerReassignOverrideMetadata = allowSignerReassignOverrideMetadata;
  }

  public AccountSettingsInformation allowSigningExtensions(String allowSigningExtensions) {
    this.allowSigningExtensions = allowSigningExtensions;
    return this;
  }

   /**
   * 
   * @return allowSigningExtensions
  **/
  @ApiModelProperty(value = "")
  public String getAllowSigningExtensions() {
    return allowSigningExtensions;
  }

  public void setAllowSigningExtensions(String allowSigningExtensions) {
    this.allowSigningExtensions = allowSigningExtensions;
  }

  public AccountSettingsInformation allowSigningExtensionsMetadata(SettingsMetadata allowSigningExtensionsMetadata) {
    this.allowSigningExtensionsMetadata = allowSigningExtensionsMetadata;
    return this;
  }

   /**
   * Get allowSigningExtensionsMetadata
   * @return allowSigningExtensionsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSigningExtensionsMetadata() {
    return allowSigningExtensionsMetadata;
  }

  public void setAllowSigningExtensionsMetadata(SettingsMetadata allowSigningExtensionsMetadata) {
    this.allowSigningExtensionsMetadata = allowSigningExtensionsMetadata;
  }

  public AccountSettingsInformation allowSigningGroups(String allowSigningGroups) {
    this.allowSigningGroups = allowSigningGroups;
    return this;
  }

   /**
   * 
   * @return allowSigningGroups
  **/
  @ApiModelProperty(value = "")
  public String getAllowSigningGroups() {
    return allowSigningGroups;
  }

  public void setAllowSigningGroups(String allowSigningGroups) {
    this.allowSigningGroups = allowSigningGroups;
  }

  public AccountSettingsInformation allowSigningGroupsMetadata(SettingsMetadata allowSigningGroupsMetadata) {
    this.allowSigningGroupsMetadata = allowSigningGroupsMetadata;
    return this;
  }

   /**
   * Get allowSigningGroupsMetadata
   * @return allowSigningGroupsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSigningGroupsMetadata() {
    return allowSigningGroupsMetadata;
  }

  public void setAllowSigningGroupsMetadata(SettingsMetadata allowSigningGroupsMetadata) {
    this.allowSigningGroupsMetadata = allowSigningGroupsMetadata;
  }

  public AccountSettingsInformation allowSigningRadioDeselect(String allowSigningRadioDeselect) {
    this.allowSigningRadioDeselect = allowSigningRadioDeselect;
    return this;
  }

   /**
   * 
   * @return allowSigningRadioDeselect
  **/
  @ApiModelProperty(value = "")
  public String getAllowSigningRadioDeselect() {
    return allowSigningRadioDeselect;
  }

  public void setAllowSigningRadioDeselect(String allowSigningRadioDeselect) {
    this.allowSigningRadioDeselect = allowSigningRadioDeselect;
  }

  public AccountSettingsInformation allowSigningRadioDeselectMetadata(SettingsMetadata allowSigningRadioDeselectMetadata) {
    this.allowSigningRadioDeselectMetadata = allowSigningRadioDeselectMetadata;
    return this;
  }

   /**
   * Get allowSigningRadioDeselectMetadata
   * @return allowSigningRadioDeselectMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSigningRadioDeselectMetadata() {
    return allowSigningRadioDeselectMetadata;
  }

  public void setAllowSigningRadioDeselectMetadata(SettingsMetadata allowSigningRadioDeselectMetadata) {
    this.allowSigningRadioDeselectMetadata = allowSigningRadioDeselectMetadata;
  }

  public AccountSettingsInformation allowSignNow(String allowSignNow) {
    this.allowSignNow = allowSignNow;
    return this;
  }

   /**
   * 
   * @return allowSignNow
  **/
  @ApiModelProperty(value = "")
  public String getAllowSignNow() {
    return allowSignNow;
  }

  public void setAllowSignNow(String allowSignNow) {
    this.allowSignNow = allowSignNow;
  }

  public AccountSettingsInformation allowSignNowMetadata(String allowSignNowMetadata) {
    this.allowSignNowMetadata = allowSignNowMetadata;
    return this;
  }

   /**
   * 
   * @return allowSignNowMetadata
  **/
  @ApiModelProperty(value = "")
  public String getAllowSignNowMetadata() {
    return allowSignNowMetadata;
  }

  public void setAllowSignNowMetadata(String allowSignNowMetadata) {
    this.allowSignNowMetadata = allowSignNowMetadata;
  }

  public AccountSettingsInformation allowSMSDelivery(String allowSMSDelivery) {
    this.allowSMSDelivery = allowSMSDelivery;
    return this;
  }

   /**
   * 
   * @return allowSMSDelivery
  **/
  @ApiModelProperty(value = "")
  public String getAllowSMSDelivery() {
    return allowSMSDelivery;
  }

  public void setAllowSMSDelivery(String allowSMSDelivery) {
    this.allowSMSDelivery = allowSMSDelivery;
  }

  public AccountSettingsInformation allowSMSDeliveryMetadata(SettingsMetadata allowSMSDeliveryMetadata) {
    this.allowSMSDeliveryMetadata = allowSMSDeliveryMetadata;
    return this;
  }

   /**
   * Get allowSMSDeliveryMetadata
   * @return allowSMSDeliveryMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSMSDeliveryMetadata() {
    return allowSMSDeliveryMetadata;
  }

  public void setAllowSMSDeliveryMetadata(SettingsMetadata allowSMSDeliveryMetadata) {
    this.allowSMSDeliveryMetadata = allowSMSDeliveryMetadata;
  }

  public AccountSettingsInformation allowSocialIdLogin(String allowSocialIdLogin) {
    this.allowSocialIdLogin = allowSocialIdLogin;
    return this;
  }

   /**
   * 
   * @return allowSocialIdLogin
  **/
  @ApiModelProperty(value = "")
  public String getAllowSocialIdLogin() {
    return allowSocialIdLogin;
  }

  public void setAllowSocialIdLogin(String allowSocialIdLogin) {
    this.allowSocialIdLogin = allowSocialIdLogin;
  }

  public AccountSettingsInformation allowSocialIdLoginMetadata(SettingsMetadata allowSocialIdLoginMetadata) {
    this.allowSocialIdLoginMetadata = allowSocialIdLoginMetadata;
    return this;
  }

   /**
   * Get allowSocialIdLoginMetadata
   * @return allowSocialIdLoginMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowSocialIdLoginMetadata() {
    return allowSocialIdLoginMetadata;
  }

  public void setAllowSocialIdLoginMetadata(SettingsMetadata allowSocialIdLoginMetadata) {
    this.allowSocialIdLoginMetadata = allowSocialIdLoginMetadata;
  }

  public AccountSettingsInformation allowSupplementalDocuments(String allowSupplementalDocuments) {
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

  public AccountSettingsInformation allowSupplementalDocumentsMetadata(SettingsMetadata allowSupplementalDocumentsMetadata) {
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

  public AccountSettingsInformation allowUsersToAccessDirectory(String allowUsersToAccessDirectory) {
    this.allowUsersToAccessDirectory = allowUsersToAccessDirectory;
    return this;
  }

   /**
   * 
   * @return allowUsersToAccessDirectory
  **/
  @ApiModelProperty(value = "")
  public String getAllowUsersToAccessDirectory() {
    return allowUsersToAccessDirectory;
  }

  public void setAllowUsersToAccessDirectory(String allowUsersToAccessDirectory) {
    this.allowUsersToAccessDirectory = allowUsersToAccessDirectory;
  }

  public AccountSettingsInformation allowUsersToAccessDirectoryMetadata(SettingsMetadata allowUsersToAccessDirectoryMetadata) {
    this.allowUsersToAccessDirectoryMetadata = allowUsersToAccessDirectoryMetadata;
    return this;
  }

   /**
   * Get allowUsersToAccessDirectoryMetadata
   * @return allowUsersToAccessDirectoryMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowUsersToAccessDirectoryMetadata() {
    return allowUsersToAccessDirectoryMetadata;
  }

  public void setAllowUsersToAccessDirectoryMetadata(SettingsMetadata allowUsersToAccessDirectoryMetadata) {
    this.allowUsersToAccessDirectoryMetadata = allowUsersToAccessDirectoryMetadata;
  }

  public AccountSettingsInformation allowValueInsights(String allowValueInsights) {
    this.allowValueInsights = allowValueInsights;
    return this;
  }

   /**
   * 
   * @return allowValueInsights
  **/
  @ApiModelProperty(value = "")
  public String getAllowValueInsights() {
    return allowValueInsights;
  }

  public void setAllowValueInsights(String allowValueInsights) {
    this.allowValueInsights = allowValueInsights;
  }

  public AccountSettingsInformation allowValueInsightsMetadata(SettingsMetadata allowValueInsightsMetadata) {
    this.allowValueInsightsMetadata = allowValueInsightsMetadata;
    return this;
  }

   /**
   * Get allowValueInsightsMetadata
   * @return allowValueInsightsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowValueInsightsMetadata() {
    return allowValueInsightsMetadata;
  }

  public void setAllowValueInsightsMetadata(SettingsMetadata allowValueInsightsMetadata) {
    this.allowValueInsightsMetadata = allowValueInsightsMetadata;
  }

  public AccountSettingsInformation anchorPopulationScope(String anchorPopulationScope) {
    this.anchorPopulationScope = anchorPopulationScope;
    return this;
  }

   /**
   * 
   * @return anchorPopulationScope
  **/
  @ApiModelProperty(value = "")
  public String getAnchorPopulationScope() {
    return anchorPopulationScope;
  }

  public void setAnchorPopulationScope(String anchorPopulationScope) {
    this.anchorPopulationScope = anchorPopulationScope;
  }

  public AccountSettingsInformation anchorPopulationScopeMetadata(SettingsMetadata anchorPopulationScopeMetadata) {
    this.anchorPopulationScopeMetadata = anchorPopulationScopeMetadata;
    return this;
  }

   /**
   * Get anchorPopulationScopeMetadata
   * @return anchorPopulationScopeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAnchorPopulationScopeMetadata() {
    return anchorPopulationScopeMetadata;
  }

  public void setAnchorPopulationScopeMetadata(SettingsMetadata anchorPopulationScopeMetadata) {
    this.anchorPopulationScopeMetadata = anchorPopulationScopeMetadata;
  }

  public AccountSettingsInformation anchorTagVersionedPlacementEnabled(String anchorTagVersionedPlacementEnabled) {
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

  public AccountSettingsInformation anchorTagVersionedPlacementMetadataEnabled(SettingsMetadata anchorTagVersionedPlacementMetadataEnabled) {
    this.anchorTagVersionedPlacementMetadataEnabled = anchorTagVersionedPlacementMetadataEnabled;
    return this;
  }

   /**
   * Get anchorTagVersionedPlacementMetadataEnabled
   * @return anchorTagVersionedPlacementMetadataEnabled
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAnchorTagVersionedPlacementMetadataEnabled() {
    return anchorTagVersionedPlacementMetadataEnabled;
  }

  public void setAnchorTagVersionedPlacementMetadataEnabled(SettingsMetadata anchorTagVersionedPlacementMetadataEnabled) {
    this.anchorTagVersionedPlacementMetadataEnabled = anchorTagVersionedPlacementMetadataEnabled;
  }

  public AccountSettingsInformation attachCompletedEnvelope(String attachCompletedEnvelope) {
    this.attachCompletedEnvelope = attachCompletedEnvelope;
    return this;
  }

   /**
   * 
   * @return attachCompletedEnvelope
  **/
  @ApiModelProperty(value = "")
  public String getAttachCompletedEnvelope() {
    return attachCompletedEnvelope;
  }

  public void setAttachCompletedEnvelope(String attachCompletedEnvelope) {
    this.attachCompletedEnvelope = attachCompletedEnvelope;
  }

  public AccountSettingsInformation attachCompletedEnvelopeMetadata(SettingsMetadata attachCompletedEnvelopeMetadata) {
    this.attachCompletedEnvelopeMetadata = attachCompletedEnvelopeMetadata;
    return this;
  }

   /**
   * Get attachCompletedEnvelopeMetadata
   * @return attachCompletedEnvelopeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAttachCompletedEnvelopeMetadata() {
    return attachCompletedEnvelopeMetadata;
  }

  public void setAttachCompletedEnvelopeMetadata(SettingsMetadata attachCompletedEnvelopeMetadata) {
    this.attachCompletedEnvelopeMetadata = attachCompletedEnvelopeMetadata;
  }

  public AccountSettingsInformation authenticationCheck(String authenticationCheck) {
    this.authenticationCheck = authenticationCheck;
    return this;
  }

   /**
   * 
   * @return authenticationCheck
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationCheck() {
    return authenticationCheck;
  }

  public void setAuthenticationCheck(String authenticationCheck) {
    this.authenticationCheck = authenticationCheck;
  }

  public AccountSettingsInformation authenticationCheckMetadata(SettingsMetadata authenticationCheckMetadata) {
    this.authenticationCheckMetadata = authenticationCheckMetadata;
    return this;
  }

   /**
   * Get authenticationCheckMetadata
   * @return authenticationCheckMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAuthenticationCheckMetadata() {
    return authenticationCheckMetadata;
  }

  public void setAuthenticationCheckMetadata(SettingsMetadata authenticationCheckMetadata) {
    this.authenticationCheckMetadata = authenticationCheckMetadata;
  }

  public AccountSettingsInformation autoNavRule(String autoNavRule) {
    this.autoNavRule = autoNavRule;
    return this;
  }

   /**
   * 
   * @return autoNavRule
  **/
  @ApiModelProperty(value = "")
  public String getAutoNavRule() {
    return autoNavRule;
  }

  public void setAutoNavRule(String autoNavRule) {
    this.autoNavRule = autoNavRule;
  }

  public AccountSettingsInformation autoNavRuleMetadata(SettingsMetadata autoNavRuleMetadata) {
    this.autoNavRuleMetadata = autoNavRuleMetadata;
    return this;
  }

   /**
   * Get autoNavRuleMetadata
   * @return autoNavRuleMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAutoNavRuleMetadata() {
    return autoNavRuleMetadata;
  }

  public void setAutoNavRuleMetadata(SettingsMetadata autoNavRuleMetadata) {
    this.autoNavRuleMetadata = autoNavRuleMetadata;
  }

  public AccountSettingsInformation autoProvisionSignerAccount(String autoProvisionSignerAccount) {
    this.autoProvisionSignerAccount = autoProvisionSignerAccount;
    return this;
  }

   /**
   * 
   * @return autoProvisionSignerAccount
  **/
  @ApiModelProperty(value = "")
  public String getAutoProvisionSignerAccount() {
    return autoProvisionSignerAccount;
  }

  public void setAutoProvisionSignerAccount(String autoProvisionSignerAccount) {
    this.autoProvisionSignerAccount = autoProvisionSignerAccount;
  }

  public AccountSettingsInformation autoProvisionSignerAccountMetadata(SettingsMetadata autoProvisionSignerAccountMetadata) {
    this.autoProvisionSignerAccountMetadata = autoProvisionSignerAccountMetadata;
    return this;
  }

   /**
   * Get autoProvisionSignerAccountMetadata
   * @return autoProvisionSignerAccountMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAutoProvisionSignerAccountMetadata() {
    return autoProvisionSignerAccountMetadata;
  }

  public void setAutoProvisionSignerAccountMetadata(SettingsMetadata autoProvisionSignerAccountMetadata) {
    this.autoProvisionSignerAccountMetadata = autoProvisionSignerAccountMetadata;
  }

  public AccountSettingsInformation bccEmailArchive(String bccEmailArchive) {
    this.bccEmailArchive = bccEmailArchive;
    return this;
  }

   /**
   * 
   * @return bccEmailArchive
  **/
  @ApiModelProperty(value = "")
  public String getBccEmailArchive() {
    return bccEmailArchive;
  }

  public void setBccEmailArchive(String bccEmailArchive) {
    this.bccEmailArchive = bccEmailArchive;
  }

  public AccountSettingsInformation bccEmailArchiveMetadata(SettingsMetadata bccEmailArchiveMetadata) {
    this.bccEmailArchiveMetadata = bccEmailArchiveMetadata;
    return this;
  }

   /**
   * Get bccEmailArchiveMetadata
   * @return bccEmailArchiveMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getBccEmailArchiveMetadata() {
    return bccEmailArchiveMetadata;
  }

  public void setBccEmailArchiveMetadata(SettingsMetadata bccEmailArchiveMetadata) {
    this.bccEmailArchiveMetadata = bccEmailArchiveMetadata;
  }

  public AccountSettingsInformation betaSwitchConfiguration(String betaSwitchConfiguration) {
    this.betaSwitchConfiguration = betaSwitchConfiguration;
    return this;
  }

   /**
   * 
   * @return betaSwitchConfiguration
  **/
  @ApiModelProperty(value = "")
  public String getBetaSwitchConfiguration() {
    return betaSwitchConfiguration;
  }

  public void setBetaSwitchConfiguration(String betaSwitchConfiguration) {
    this.betaSwitchConfiguration = betaSwitchConfiguration;
  }

  public AccountSettingsInformation betaSwitchConfigurationMetadata(SettingsMetadata betaSwitchConfigurationMetadata) {
    this.betaSwitchConfigurationMetadata = betaSwitchConfigurationMetadata;
    return this;
  }

   /**
   * Get betaSwitchConfigurationMetadata
   * @return betaSwitchConfigurationMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getBetaSwitchConfigurationMetadata() {
    return betaSwitchConfigurationMetadata;
  }

  public void setBetaSwitchConfigurationMetadata(SettingsMetadata betaSwitchConfigurationMetadata) {
    this.betaSwitchConfigurationMetadata = betaSwitchConfigurationMetadata;
  }

  public AccountSettingsInformation billingAddress(AddressInformation billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public AddressInformation getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(AddressInformation billingAddress) {
    this.billingAddress = billingAddress;
  }

  public AccountSettingsInformation billingAddressMetadata(SettingsMetadata billingAddressMetadata) {
    this.billingAddressMetadata = billingAddressMetadata;
    return this;
  }

   /**
   * Get billingAddressMetadata
   * @return billingAddressMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getBillingAddressMetadata() {
    return billingAddressMetadata;
  }

  public void setBillingAddressMetadata(SettingsMetadata billingAddressMetadata) {
    this.billingAddressMetadata = billingAddressMetadata;
  }

  public AccountSettingsInformation bulkSend(String bulkSend) {
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

  public AccountSettingsInformation bulkSendMaxCopiesInBatch(String bulkSendMaxCopiesInBatch) {
    this.bulkSendMaxCopiesInBatch = bulkSendMaxCopiesInBatch;
    return this;
  }

   /**
   * 
   * @return bulkSendMaxCopiesInBatch
  **/
  @ApiModelProperty(value = "")
  public String getBulkSendMaxCopiesInBatch() {
    return bulkSendMaxCopiesInBatch;
  }

  public void setBulkSendMaxCopiesInBatch(String bulkSendMaxCopiesInBatch) {
    this.bulkSendMaxCopiesInBatch = bulkSendMaxCopiesInBatch;
  }

  public AccountSettingsInformation bulkSendMaxUnprocessedEnvelopesCount(String bulkSendMaxUnprocessedEnvelopesCount) {
    this.bulkSendMaxUnprocessedEnvelopesCount = bulkSendMaxUnprocessedEnvelopesCount;
    return this;
  }

   /**
   * 
   * @return bulkSendMaxUnprocessedEnvelopesCount
  **/
  @ApiModelProperty(value = "")
  public String getBulkSendMaxUnprocessedEnvelopesCount() {
    return bulkSendMaxUnprocessedEnvelopesCount;
  }

  public void setBulkSendMaxUnprocessedEnvelopesCount(String bulkSendMaxUnprocessedEnvelopesCount) {
    this.bulkSendMaxUnprocessedEnvelopesCount = bulkSendMaxUnprocessedEnvelopesCount;
  }

  public AccountSettingsInformation bulkSendMetadata(SettingsMetadata bulkSendMetadata) {
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

  public AccountSettingsInformation canSelfBrandSend(String canSelfBrandSend) {
    this.canSelfBrandSend = canSelfBrandSend;
    return this;
  }

   /**
   * 
   * @return canSelfBrandSend
  **/
  @ApiModelProperty(value = "")
  public String getCanSelfBrandSend() {
    return canSelfBrandSend;
  }

  public void setCanSelfBrandSend(String canSelfBrandSend) {
    this.canSelfBrandSend = canSelfBrandSend;
  }

  public AccountSettingsInformation canSelfBrandSendMetadata(SettingsMetadata canSelfBrandSendMetadata) {
    this.canSelfBrandSendMetadata = canSelfBrandSendMetadata;
    return this;
  }

   /**
   * Get canSelfBrandSendMetadata
   * @return canSelfBrandSendMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanSelfBrandSendMetadata() {
    return canSelfBrandSendMetadata;
  }

  public void setCanSelfBrandSendMetadata(SettingsMetadata canSelfBrandSendMetadata) {
    this.canSelfBrandSendMetadata = canSelfBrandSendMetadata;
  }

  public AccountSettingsInformation canSelfBrandSign(String canSelfBrandSign) {
    this.canSelfBrandSign = canSelfBrandSign;
    return this;
  }

   /**
   * 
   * @return canSelfBrandSign
  **/
  @ApiModelProperty(value = "")
  public String getCanSelfBrandSign() {
    return canSelfBrandSign;
  }

  public void setCanSelfBrandSign(String canSelfBrandSign) {
    this.canSelfBrandSign = canSelfBrandSign;
  }

  public AccountSettingsInformation canSelfBrandSignMetadata(SettingsMetadata canSelfBrandSignMetadata) {
    this.canSelfBrandSignMetadata = canSelfBrandSignMetadata;
    return this;
  }

   /**
   * Get canSelfBrandSignMetadata
   * @return canSelfBrandSignMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanSelfBrandSignMetadata() {
    return canSelfBrandSignMetadata;
  }

  public void setCanSelfBrandSignMetadata(SettingsMetadata canSelfBrandSignMetadata) {
    this.canSelfBrandSignMetadata = canSelfBrandSignMetadata;
  }

  public AccountSettingsInformation canUseSalesforceOAuth(String canUseSalesforceOAuth) {
    this.canUseSalesforceOAuth = canUseSalesforceOAuth;
    return this;
  }

   /**
   * 
   * @return canUseSalesforceOAuth
  **/
  @ApiModelProperty(value = "")
  public String getCanUseSalesforceOAuth() {
    return canUseSalesforceOAuth;
  }

  public void setCanUseSalesforceOAuth(String canUseSalesforceOAuth) {
    this.canUseSalesforceOAuth = canUseSalesforceOAuth;
  }

  public AccountSettingsInformation canUseSalesforceOAuthMetadata(SettingsMetadata canUseSalesforceOAuthMetadata) {
    this.canUseSalesforceOAuthMetadata = canUseSalesforceOAuthMetadata;
    return this;
  }

   /**
   * Get canUseSalesforceOAuthMetadata
   * @return canUseSalesforceOAuthMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanUseSalesforceOAuthMetadata() {
    return canUseSalesforceOAuthMetadata;
  }

  public void setCanUseSalesforceOAuthMetadata(SettingsMetadata canUseSalesforceOAuthMetadata) {
    this.canUseSalesforceOAuthMetadata = canUseSalesforceOAuthMetadata;
  }

  public AccountSettingsInformation captureVoiceRecording(String captureVoiceRecording) {
    this.captureVoiceRecording = captureVoiceRecording;
    return this;
  }

   /**
   * 
   * @return captureVoiceRecording
  **/
  @ApiModelProperty(value = "")
  public String getCaptureVoiceRecording() {
    return captureVoiceRecording;
  }

  public void setCaptureVoiceRecording(String captureVoiceRecording) {
    this.captureVoiceRecording = captureVoiceRecording;
  }

  public AccountSettingsInformation captureVoiceRecordingMetadata(SettingsMetadata captureVoiceRecordingMetadata) {
    this.captureVoiceRecordingMetadata = captureVoiceRecordingMetadata;
    return this;
  }

   /**
   * Get captureVoiceRecordingMetadata
   * @return captureVoiceRecordingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCaptureVoiceRecordingMetadata() {
    return captureVoiceRecordingMetadata;
  }

  public void setCaptureVoiceRecordingMetadata(SettingsMetadata captureVoiceRecordingMetadata) {
    this.captureVoiceRecordingMetadata = captureVoiceRecordingMetadata;
  }

  public AccountSettingsInformation cfrUseWideImage(String cfrUseWideImage) {
    this.cfrUseWideImage = cfrUseWideImage;
    return this;
  }

   /**
   * 
   * @return cfrUseWideImage
  **/
  @ApiModelProperty(value = "")
  public String getCfrUseWideImage() {
    return cfrUseWideImage;
  }

  public void setCfrUseWideImage(String cfrUseWideImage) {
    this.cfrUseWideImage = cfrUseWideImage;
  }

  public AccountSettingsInformation cfrUseWideImageMetadata(SettingsMetadata cfrUseWideImageMetadata) {
    this.cfrUseWideImageMetadata = cfrUseWideImageMetadata;
    return this;
  }

   /**
   * Get cfrUseWideImageMetadata
   * @return cfrUseWideImageMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCfrUseWideImageMetadata() {
    return cfrUseWideImageMetadata;
  }

  public void setCfrUseWideImageMetadata(SettingsMetadata cfrUseWideImageMetadata) {
    this.cfrUseWideImageMetadata = cfrUseWideImageMetadata;
  }

  public AccountSettingsInformation checkForMultipleAdminsOnAccount(String checkForMultipleAdminsOnAccount) {
    this.checkForMultipleAdminsOnAccount = checkForMultipleAdminsOnAccount;
    return this;
  }

   /**
   * 
   * @return checkForMultipleAdminsOnAccount
  **/
  @ApiModelProperty(value = "")
  public String getCheckForMultipleAdminsOnAccount() {
    return checkForMultipleAdminsOnAccount;
  }

  public void setCheckForMultipleAdminsOnAccount(String checkForMultipleAdminsOnAccount) {
    this.checkForMultipleAdminsOnAccount = checkForMultipleAdminsOnAccount;
  }

  public AccountSettingsInformation checkForMultipleAdminsOnAccountMetadata(SettingsMetadata checkForMultipleAdminsOnAccountMetadata) {
    this.checkForMultipleAdminsOnAccountMetadata = checkForMultipleAdminsOnAccountMetadata;
    return this;
  }

   /**
   * Get checkForMultipleAdminsOnAccountMetadata
   * @return checkForMultipleAdminsOnAccountMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCheckForMultipleAdminsOnAccountMetadata() {
    return checkForMultipleAdminsOnAccountMetadata;
  }

  public void setCheckForMultipleAdminsOnAccountMetadata(SettingsMetadata checkForMultipleAdminsOnAccountMetadata) {
    this.checkForMultipleAdminsOnAccountMetadata = checkForMultipleAdminsOnAccountMetadata;
  }

  public AccountSettingsInformation chromeSignatureEnabled(String chromeSignatureEnabled) {
    this.chromeSignatureEnabled = chromeSignatureEnabled;
    return this;
  }

   /**
   * 
   * @return chromeSignatureEnabled
  **/
  @ApiModelProperty(value = "")
  public String getChromeSignatureEnabled() {
    return chromeSignatureEnabled;
  }

  public void setChromeSignatureEnabled(String chromeSignatureEnabled) {
    this.chromeSignatureEnabled = chromeSignatureEnabled;
  }

  public AccountSettingsInformation chromeSignatureEnabledMetadata(SettingsMetadata chromeSignatureEnabledMetadata) {
    this.chromeSignatureEnabledMetadata = chromeSignatureEnabledMetadata;
    return this;
  }

   /**
   * Get chromeSignatureEnabledMetadata
   * @return chromeSignatureEnabledMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getChromeSignatureEnabledMetadata() {
    return chromeSignatureEnabledMetadata;
  }

  public void setChromeSignatureEnabledMetadata(SettingsMetadata chromeSignatureEnabledMetadata) {
    this.chromeSignatureEnabledMetadata = chromeSignatureEnabledMetadata;
  }

  public AccountSettingsInformation commentEmailShowMessageText(String commentEmailShowMessageText) {
    this.commentEmailShowMessageText = commentEmailShowMessageText;
    return this;
  }

   /**
   * 
   * @return commentEmailShowMessageText
  **/
  @ApiModelProperty(value = "")
  public String getCommentEmailShowMessageText() {
    return commentEmailShowMessageText;
  }

  public void setCommentEmailShowMessageText(String commentEmailShowMessageText) {
    this.commentEmailShowMessageText = commentEmailShowMessageText;
  }

  public AccountSettingsInformation commentEmailShowMessageTextMetadata(SettingsMetadata commentEmailShowMessageTextMetadata) {
    this.commentEmailShowMessageTextMetadata = commentEmailShowMessageTextMetadata;
    return this;
  }

   /**
   * Get commentEmailShowMessageTextMetadata
   * @return commentEmailShowMessageTextMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCommentEmailShowMessageTextMetadata() {
    return commentEmailShowMessageTextMetadata;
  }

  public void setCommentEmailShowMessageTextMetadata(SettingsMetadata commentEmailShowMessageTextMetadata) {
    this.commentEmailShowMessageTextMetadata = commentEmailShowMessageTextMetadata;
  }

  public AccountSettingsInformation commentsAllowEnvelopeOverride(String commentsAllowEnvelopeOverride) {
    this.commentsAllowEnvelopeOverride = commentsAllowEnvelopeOverride;
    return this;
  }

   /**
   * 
   * @return commentsAllowEnvelopeOverride
  **/
  @ApiModelProperty(value = "")
  public String getCommentsAllowEnvelopeOverride() {
    return commentsAllowEnvelopeOverride;
  }

  public void setCommentsAllowEnvelopeOverride(String commentsAllowEnvelopeOverride) {
    this.commentsAllowEnvelopeOverride = commentsAllowEnvelopeOverride;
  }

  public AccountSettingsInformation commentsAllowEnvelopeOverrideMetadata(SettingsMetadata commentsAllowEnvelopeOverrideMetadata) {
    this.commentsAllowEnvelopeOverrideMetadata = commentsAllowEnvelopeOverrideMetadata;
    return this;
  }

   /**
   * Get commentsAllowEnvelopeOverrideMetadata
   * @return commentsAllowEnvelopeOverrideMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCommentsAllowEnvelopeOverrideMetadata() {
    return commentsAllowEnvelopeOverrideMetadata;
  }

  public void setCommentsAllowEnvelopeOverrideMetadata(SettingsMetadata commentsAllowEnvelopeOverrideMetadata) {
    this.commentsAllowEnvelopeOverrideMetadata = commentsAllowEnvelopeOverrideMetadata;
  }

  public AccountSettingsInformation conditionalFieldsEnabled(String conditionalFieldsEnabled) {
    this.conditionalFieldsEnabled = conditionalFieldsEnabled;
    return this;
  }

   /**
   * 
   * @return conditionalFieldsEnabled
  **/
  @ApiModelProperty(value = "")
  public String getConditionalFieldsEnabled() {
    return conditionalFieldsEnabled;
  }

  public void setConditionalFieldsEnabled(String conditionalFieldsEnabled) {
    this.conditionalFieldsEnabled = conditionalFieldsEnabled;
  }

  public AccountSettingsInformation conditionalFieldsEnabledMetadata(SettingsMetadata conditionalFieldsEnabledMetadata) {
    this.conditionalFieldsEnabledMetadata = conditionalFieldsEnabledMetadata;
    return this;
  }

   /**
   * Get conditionalFieldsEnabledMetadata
   * @return conditionalFieldsEnabledMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getConditionalFieldsEnabledMetadata() {
    return conditionalFieldsEnabledMetadata;
  }

  public void setConditionalFieldsEnabledMetadata(SettingsMetadata conditionalFieldsEnabledMetadata) {
    this.conditionalFieldsEnabledMetadata = conditionalFieldsEnabledMetadata;
  }

  public AccountSettingsInformation consumerDisclosureFrequency(String consumerDisclosureFrequency) {
    this.consumerDisclosureFrequency = consumerDisclosureFrequency;
    return this;
  }

   /**
   * 
   * @return consumerDisclosureFrequency
  **/
  @ApiModelProperty(value = "")
  public String getConsumerDisclosureFrequency() {
    return consumerDisclosureFrequency;
  }

  public void setConsumerDisclosureFrequency(String consumerDisclosureFrequency) {
    this.consumerDisclosureFrequency = consumerDisclosureFrequency;
  }

  public AccountSettingsInformation consumerDisclosureFrequencyMetadata(SettingsMetadata consumerDisclosureFrequencyMetadata) {
    this.consumerDisclosureFrequencyMetadata = consumerDisclosureFrequencyMetadata;
    return this;
  }

   /**
   * Get consumerDisclosureFrequencyMetadata
   * @return consumerDisclosureFrequencyMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getConsumerDisclosureFrequencyMetadata() {
    return consumerDisclosureFrequencyMetadata;
  }

  public void setConsumerDisclosureFrequencyMetadata(SettingsMetadata consumerDisclosureFrequencyMetadata) {
    this.consumerDisclosureFrequencyMetadata = consumerDisclosureFrequencyMetadata;
  }

  public AccountSettingsInformation convertPdfFields(String convertPdfFields) {
    this.convertPdfFields = convertPdfFields;
    return this;
  }

   /**
   * 
   * @return convertPdfFields
  **/
  @ApiModelProperty(value = "")
  public String getConvertPdfFields() {
    return convertPdfFields;
  }

  public void setConvertPdfFields(String convertPdfFields) {
    this.convertPdfFields = convertPdfFields;
  }

  public AccountSettingsInformation convertPdfFieldsMetadata(SettingsMetadata convertPdfFieldsMetadata) {
    this.convertPdfFieldsMetadata = convertPdfFieldsMetadata;
    return this;
  }

   /**
   * Get convertPdfFieldsMetadata
   * @return convertPdfFieldsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getConvertPdfFieldsMetadata() {
    return convertPdfFieldsMetadata;
  }

  public void setConvertPdfFieldsMetadata(SettingsMetadata convertPdfFieldsMetadata) {
    this.convertPdfFieldsMetadata = convertPdfFieldsMetadata;
  }

  public AccountSettingsInformation dataPopulationScope(String dataPopulationScope) {
    this.dataPopulationScope = dataPopulationScope;
    return this;
  }

   /**
   * 
   * @return dataPopulationScope
  **/
  @ApiModelProperty(value = "")
  public String getDataPopulationScope() {
    return dataPopulationScope;
  }

  public void setDataPopulationScope(String dataPopulationScope) {
    this.dataPopulationScope = dataPopulationScope;
  }

  public AccountSettingsInformation dataPopulationScopeMetadata(SettingsMetadata dataPopulationScopeMetadata) {
    this.dataPopulationScopeMetadata = dataPopulationScopeMetadata;
    return this;
  }

   /**
   * Get dataPopulationScopeMetadata
   * @return dataPopulationScopeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDataPopulationScopeMetadata() {
    return dataPopulationScopeMetadata;
  }

  public void setDataPopulationScopeMetadata(SettingsMetadata dataPopulationScopeMetadata) {
    this.dataPopulationScopeMetadata = dataPopulationScopeMetadata;
  }

  public AccountSettingsInformation disableMobileApp(String disableMobileApp) {
    this.disableMobileApp = disableMobileApp;
    return this;
  }

   /**
   * 
   * @return disableMobileApp
  **/
  @ApiModelProperty(value = "")
  public String getDisableMobileApp() {
    return disableMobileApp;
  }

  public void setDisableMobileApp(String disableMobileApp) {
    this.disableMobileApp = disableMobileApp;
  }

  public AccountSettingsInformation disableMobileAppMetadata(SettingsMetadata disableMobileAppMetadata) {
    this.disableMobileAppMetadata = disableMobileAppMetadata;
    return this;
  }

   /**
   * Get disableMobileAppMetadata
   * @return disableMobileAppMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisableMobileAppMetadata() {
    return disableMobileAppMetadata;
  }

  public void setDisableMobileAppMetadata(SettingsMetadata disableMobileAppMetadata) {
    this.disableMobileAppMetadata = disableMobileAppMetadata;
  }

  public AccountSettingsInformation disableMobilePushNotifications(String disableMobilePushNotifications) {
    this.disableMobilePushNotifications = disableMobilePushNotifications;
    return this;
  }

   /**
   * 
   * @return disableMobilePushNotifications
  **/
  @ApiModelProperty(value = "")
  public String getDisableMobilePushNotifications() {
    return disableMobilePushNotifications;
  }

  public void setDisableMobilePushNotifications(String disableMobilePushNotifications) {
    this.disableMobilePushNotifications = disableMobilePushNotifications;
  }

  public AccountSettingsInformation disableMobilePushNotificationsMetadata(SettingsMetadata disableMobilePushNotificationsMetadata) {
    this.disableMobilePushNotificationsMetadata = disableMobilePushNotificationsMetadata;
    return this;
  }

   /**
   * Get disableMobilePushNotificationsMetadata
   * @return disableMobilePushNotificationsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisableMobilePushNotificationsMetadata() {
    return disableMobilePushNotificationsMetadata;
  }

  public void setDisableMobilePushNotificationsMetadata(SettingsMetadata disableMobilePushNotificationsMetadata) {
    this.disableMobilePushNotificationsMetadata = disableMobilePushNotificationsMetadata;
  }

  public AccountSettingsInformation disableMobileSending(String disableMobileSending) {
    this.disableMobileSending = disableMobileSending;
    return this;
  }

   /**
   * 
   * @return disableMobileSending
  **/
  @ApiModelProperty(value = "")
  public String getDisableMobileSending() {
    return disableMobileSending;
  }

  public void setDisableMobileSending(String disableMobileSending) {
    this.disableMobileSending = disableMobileSending;
  }

  public AccountSettingsInformation disableMobileSendingMetadata(SettingsMetadata disableMobileSendingMetadata) {
    this.disableMobileSendingMetadata = disableMobileSendingMetadata;
    return this;
  }

   /**
   * Get disableMobileSendingMetadata
   * @return disableMobileSendingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisableMobileSendingMetadata() {
    return disableMobileSendingMetadata;
  }

  public void setDisableMobileSendingMetadata(SettingsMetadata disableMobileSendingMetadata) {
    this.disableMobileSendingMetadata = disableMobileSendingMetadata;
  }

  public AccountSettingsInformation disableMultipleSessions(String disableMultipleSessions) {
    this.disableMultipleSessions = disableMultipleSessions;
    return this;
  }

   /**
   * 
   * @return disableMultipleSessions
  **/
  @ApiModelProperty(value = "")
  public String getDisableMultipleSessions() {
    return disableMultipleSessions;
  }

  public void setDisableMultipleSessions(String disableMultipleSessions) {
    this.disableMultipleSessions = disableMultipleSessions;
  }

  public AccountSettingsInformation disableMultipleSessionsMetadata(SettingsMetadata disableMultipleSessionsMetadata) {
    this.disableMultipleSessionsMetadata = disableMultipleSessionsMetadata;
    return this;
  }

   /**
   * Get disableMultipleSessionsMetadata
   * @return disableMultipleSessionsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisableMultipleSessionsMetadata() {
    return disableMultipleSessionsMetadata;
  }

  public void setDisableMultipleSessionsMetadata(SettingsMetadata disableMultipleSessionsMetadata) {
    this.disableMultipleSessionsMetadata = disableMultipleSessionsMetadata;
  }

  public AccountSettingsInformation disablePurgeNotificationsForSenderMetadata(SettingsMetadata disablePurgeNotificationsForSenderMetadata) {
    this.disablePurgeNotificationsForSenderMetadata = disablePurgeNotificationsForSenderMetadata;
    return this;
  }

   /**
   * Get disablePurgeNotificationsForSenderMetadata
   * @return disablePurgeNotificationsForSenderMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisablePurgeNotificationsForSenderMetadata() {
    return disablePurgeNotificationsForSenderMetadata;
  }

  public void setDisablePurgeNotificationsForSenderMetadata(SettingsMetadata disablePurgeNotificationsForSenderMetadata) {
    this.disablePurgeNotificationsForSenderMetadata = disablePurgeNotificationsForSenderMetadata;
  }

  public AccountSettingsInformation disableSignerCertView(String disableSignerCertView) {
    this.disableSignerCertView = disableSignerCertView;
    return this;
  }

   /**
   * 
   * @return disableSignerCertView
  **/
  @ApiModelProperty(value = "")
  public String getDisableSignerCertView() {
    return disableSignerCertView;
  }

  public void setDisableSignerCertView(String disableSignerCertView) {
    this.disableSignerCertView = disableSignerCertView;
  }

  public AccountSettingsInformation disableSignerCertViewMetadata(SettingsMetadata disableSignerCertViewMetadata) {
    this.disableSignerCertViewMetadata = disableSignerCertViewMetadata;
    return this;
  }

   /**
   * Get disableSignerCertViewMetadata
   * @return disableSignerCertViewMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisableSignerCertViewMetadata() {
    return disableSignerCertViewMetadata;
  }

  public void setDisableSignerCertViewMetadata(SettingsMetadata disableSignerCertViewMetadata) {
    this.disableSignerCertViewMetadata = disableSignerCertViewMetadata;
  }

  public AccountSettingsInformation disableSignerHistoryView(String disableSignerHistoryView) {
    this.disableSignerHistoryView = disableSignerHistoryView;
    return this;
  }

   /**
   * 
   * @return disableSignerHistoryView
  **/
  @ApiModelProperty(value = "")
  public String getDisableSignerHistoryView() {
    return disableSignerHistoryView;
  }

  public void setDisableSignerHistoryView(String disableSignerHistoryView) {
    this.disableSignerHistoryView = disableSignerHistoryView;
  }

  public AccountSettingsInformation disableSignerHistoryViewMetadata(SettingsMetadata disableSignerHistoryViewMetadata) {
    this.disableSignerHistoryViewMetadata = disableSignerHistoryViewMetadata;
    return this;
  }

   /**
   * Get disableSignerHistoryViewMetadata
   * @return disableSignerHistoryViewMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisableSignerHistoryViewMetadata() {
    return disableSignerHistoryViewMetadata;
  }

  public void setDisableSignerHistoryViewMetadata(SettingsMetadata disableSignerHistoryViewMetadata) {
    this.disableSignerHistoryViewMetadata = disableSignerHistoryViewMetadata;
  }

  public AccountSettingsInformation disableStyleSignature(String disableStyleSignature) {
    this.disableStyleSignature = disableStyleSignature;
    return this;
  }

   /**
   * 
   * @return disableStyleSignature
  **/
  @ApiModelProperty(value = "")
  public String getDisableStyleSignature() {
    return disableStyleSignature;
  }

  public void setDisableStyleSignature(String disableStyleSignature) {
    this.disableStyleSignature = disableStyleSignature;
  }

  public AccountSettingsInformation disableStyleSignatureMetadata(SettingsMetadata disableStyleSignatureMetadata) {
    this.disableStyleSignatureMetadata = disableStyleSignatureMetadata;
    return this;
  }

   /**
   * Get disableStyleSignatureMetadata
   * @return disableStyleSignatureMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisableStyleSignatureMetadata() {
    return disableStyleSignatureMetadata;
  }

  public void setDisableStyleSignatureMetadata(SettingsMetadata disableStyleSignatureMetadata) {
    this.disableStyleSignatureMetadata = disableStyleSignatureMetadata;
  }

  public AccountSettingsInformation disableUploadSignature(String disableUploadSignature) {
    this.disableUploadSignature = disableUploadSignature;
    return this;
  }

   /**
   * 
   * @return disableUploadSignature
  **/
  @ApiModelProperty(value = "")
  public String getDisableUploadSignature() {
    return disableUploadSignature;
  }

  public void setDisableUploadSignature(String disableUploadSignature) {
    this.disableUploadSignature = disableUploadSignature;
  }

  public AccountSettingsInformation disableUploadSignatureMetadata(SettingsMetadata disableUploadSignatureMetadata) {
    this.disableUploadSignatureMetadata = disableUploadSignatureMetadata;
    return this;
  }

   /**
   * Get disableUploadSignatureMetadata
   * @return disableUploadSignatureMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisableUploadSignatureMetadata() {
    return disableUploadSignatureMetadata;
  }

  public void setDisableUploadSignatureMetadata(SettingsMetadata disableUploadSignatureMetadata) {
    this.disableUploadSignatureMetadata = disableUploadSignatureMetadata;
  }

  public AccountSettingsInformation disableUserSharing(String disableUserSharing) {
    this.disableUserSharing = disableUserSharing;
    return this;
  }

   /**
   * 
   * @return disableUserSharing
  **/
  @ApiModelProperty(value = "")
  public String getDisableUserSharing() {
    return disableUserSharing;
  }

  public void setDisableUserSharing(String disableUserSharing) {
    this.disableUserSharing = disableUserSharing;
  }

  public AccountSettingsInformation disableUserSharingMetadata(SettingsMetadata disableUserSharingMetadata) {
    this.disableUserSharingMetadata = disableUserSharingMetadata;
    return this;
  }

   /**
   * Get disableUserSharingMetadata
   * @return disableUserSharingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisableUserSharingMetadata() {
    return disableUserSharingMetadata;
  }

  public void setDisableUserSharingMetadata(SettingsMetadata disableUserSharingMetadata) {
    this.disableUserSharingMetadata = disableUserSharingMetadata;
  }

  public AccountSettingsInformation displayBetaSwitch(String displayBetaSwitch) {
    this.displayBetaSwitch = displayBetaSwitch;
    return this;
  }

   /**
   * 
   * @return displayBetaSwitch
  **/
  @ApiModelProperty(value = "")
  public String getDisplayBetaSwitch() {
    return displayBetaSwitch;
  }

  public void setDisplayBetaSwitch(String displayBetaSwitch) {
    this.displayBetaSwitch = displayBetaSwitch;
  }

  public AccountSettingsInformation displayBetaSwitchMetadata(SettingsMetadata displayBetaSwitchMetadata) {
    this.displayBetaSwitchMetadata = displayBetaSwitchMetadata;
    return this;
  }

   /**
   * Get displayBetaSwitchMetadata
   * @return displayBetaSwitchMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDisplayBetaSwitchMetadata() {
    return displayBetaSwitchMetadata;
  }

  public void setDisplayBetaSwitchMetadata(SettingsMetadata displayBetaSwitchMetadata) {
    this.displayBetaSwitchMetadata = displayBetaSwitchMetadata;
  }

  public AccountSettingsInformation documentConversionRestrictions(String documentConversionRestrictions) {
    this.documentConversionRestrictions = documentConversionRestrictions;
    return this;
  }

   /**
   * 
   * @return documentConversionRestrictions
  **/
  @ApiModelProperty(value = "")
  public String getDocumentConversionRestrictions() {
    return documentConversionRestrictions;
  }

  public void setDocumentConversionRestrictions(String documentConversionRestrictions) {
    this.documentConversionRestrictions = documentConversionRestrictions;
  }

  public AccountSettingsInformation documentConversionRestrictionsMetadata(SettingsMetadata documentConversionRestrictionsMetadata) {
    this.documentConversionRestrictionsMetadata = documentConversionRestrictionsMetadata;
    return this;
  }

   /**
   * Get documentConversionRestrictionsMetadata
   * @return documentConversionRestrictionsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDocumentConversionRestrictionsMetadata() {
    return documentConversionRestrictionsMetadata;
  }

  public void setDocumentConversionRestrictionsMetadata(SettingsMetadata documentConversionRestrictionsMetadata) {
    this.documentConversionRestrictionsMetadata = documentConversionRestrictionsMetadata;
  }

  public AccountSettingsInformation documentRetention(String documentRetention) {
    this.documentRetention = documentRetention;
    return this;
  }

   /**
   * 
   * @return documentRetention
  **/
  @ApiModelProperty(value = "")
  public String getDocumentRetention() {
    return documentRetention;
  }

  public void setDocumentRetention(String documentRetention) {
    this.documentRetention = documentRetention;
  }

  public AccountSettingsInformation documentRetentionMetadata(SettingsMetadata documentRetentionMetadata) {
    this.documentRetentionMetadata = documentRetentionMetadata;
    return this;
  }

   /**
   * Get documentRetentionMetadata
   * @return documentRetentionMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDocumentRetentionMetadata() {
    return documentRetentionMetadata;
  }

  public void setDocumentRetentionMetadata(SettingsMetadata documentRetentionMetadata) {
    this.documentRetentionMetadata = documentRetentionMetadata;
  }

  public AccountSettingsInformation documentRetentionPurgeTabs(String documentRetentionPurgeTabs) {
    this.documentRetentionPurgeTabs = documentRetentionPurgeTabs;
    return this;
  }

   /**
   * 
   * @return documentRetentionPurgeTabs
  **/
  @ApiModelProperty(value = "")
  public String getDocumentRetentionPurgeTabs() {
    return documentRetentionPurgeTabs;
  }

  public void setDocumentRetentionPurgeTabs(String documentRetentionPurgeTabs) {
    this.documentRetentionPurgeTabs = documentRetentionPurgeTabs;
  }

  public AccountSettingsInformation documentVisibility(String documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }

   /**
   * 
   * @return documentVisibility
  **/
  @ApiModelProperty(value = "")
  public String getDocumentVisibility() {
    return documentVisibility;
  }

  public void setDocumentVisibility(String documentVisibility) {
    this.documentVisibility = documentVisibility;
  }

  public AccountSettingsInformation documentVisibilityMetadata(SettingsMetadata documentVisibilityMetadata) {
    this.documentVisibilityMetadata = documentVisibilityMetadata;
    return this;
  }

   /**
   * Get documentVisibilityMetadata
   * @return documentVisibilityMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getDocumentVisibilityMetadata() {
    return documentVisibilityMetadata;
  }

  public void setDocumentVisibilityMetadata(SettingsMetadata documentVisibilityMetadata) {
    this.documentVisibilityMetadata = documentVisibilityMetadata;
  }

  public AccountSettingsInformation emailTemplateVersion(String emailTemplateVersion) {
    this.emailTemplateVersion = emailTemplateVersion;
    return this;
  }

   /**
   * 
   * @return emailTemplateVersion
  **/
  @ApiModelProperty(value = "")
  public String getEmailTemplateVersion() {
    return emailTemplateVersion;
  }

  public void setEmailTemplateVersion(String emailTemplateVersion) {
    this.emailTemplateVersion = emailTemplateVersion;
  }

  public AccountSettingsInformation emailTemplateVersionMetadata(SettingsMetadata emailTemplateVersionMetadata) {
    this.emailTemplateVersionMetadata = emailTemplateVersionMetadata;
    return this;
  }

   /**
   * Get emailTemplateVersionMetadata
   * @return emailTemplateVersionMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEmailTemplateVersionMetadata() {
    return emailTemplateVersionMetadata;
  }

  public void setEmailTemplateVersionMetadata(SettingsMetadata emailTemplateVersionMetadata) {
    this.emailTemplateVersionMetadata = emailTemplateVersionMetadata;
  }

  public AccountSettingsInformation enableAccessCodeGenerator(String enableAccessCodeGenerator) {
    this.enableAccessCodeGenerator = enableAccessCodeGenerator;
    return this;
  }

   /**
   * 
   * @return enableAccessCodeGenerator
  **/
  @ApiModelProperty(value = "")
  public String getEnableAccessCodeGenerator() {
    return enableAccessCodeGenerator;
  }

  public void setEnableAccessCodeGenerator(String enableAccessCodeGenerator) {
    this.enableAccessCodeGenerator = enableAccessCodeGenerator;
  }

  public AccountSettingsInformation enableAccessCodeGeneratorMetadata(SettingsMetadata enableAccessCodeGeneratorMetadata) {
    this.enableAccessCodeGeneratorMetadata = enableAccessCodeGeneratorMetadata;
    return this;
  }

   /**
   * Get enableAccessCodeGeneratorMetadata
   * @return enableAccessCodeGeneratorMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableAccessCodeGeneratorMetadata() {
    return enableAccessCodeGeneratorMetadata;
  }

  public void setEnableAccessCodeGeneratorMetadata(SettingsMetadata enableAccessCodeGeneratorMetadata) {
    this.enableAccessCodeGeneratorMetadata = enableAccessCodeGeneratorMetadata;
  }

  public AccountSettingsInformation enableAdvancedPayments(String enableAdvancedPayments) {
    this.enableAdvancedPayments = enableAdvancedPayments;
    return this;
  }

   /**
   * 
   * @return enableAdvancedPayments
  **/
  @ApiModelProperty(value = "")
  public String getEnableAdvancedPayments() {
    return enableAdvancedPayments;
  }

  public void setEnableAdvancedPayments(String enableAdvancedPayments) {
    this.enableAdvancedPayments = enableAdvancedPayments;
  }

  public AccountSettingsInformation enableAdvancedPaymentsMetadata(SettingsMetadata enableAdvancedPaymentsMetadata) {
    this.enableAdvancedPaymentsMetadata = enableAdvancedPaymentsMetadata;
    return this;
  }

   /**
   * Get enableAdvancedPaymentsMetadata
   * @return enableAdvancedPaymentsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableAdvancedPaymentsMetadata() {
    return enableAdvancedPaymentsMetadata;
  }

  public void setEnableAdvancedPaymentsMetadata(SettingsMetadata enableAdvancedPaymentsMetadata) {
    this.enableAdvancedPaymentsMetadata = enableAdvancedPaymentsMetadata;
  }

  public AccountSettingsInformation enableAdvancedPowerForms(String enableAdvancedPowerForms) {
    this.enableAdvancedPowerForms = enableAdvancedPowerForms;
    return this;
  }

   /**
   * 
   * @return enableAdvancedPowerForms
  **/
  @ApiModelProperty(value = "")
  public String getEnableAdvancedPowerForms() {
    return enableAdvancedPowerForms;
  }

  public void setEnableAdvancedPowerForms(String enableAdvancedPowerForms) {
    this.enableAdvancedPowerForms = enableAdvancedPowerForms;
  }

  public AccountSettingsInformation enableAdvancedPowerFormsMetadata(SettingsMetadata enableAdvancedPowerFormsMetadata) {
    this.enableAdvancedPowerFormsMetadata = enableAdvancedPowerFormsMetadata;
    return this;
  }

   /**
   * Get enableAdvancedPowerFormsMetadata
   * @return enableAdvancedPowerFormsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableAdvancedPowerFormsMetadata() {
    return enableAdvancedPowerFormsMetadata;
  }

  public void setEnableAdvancedPowerFormsMetadata(SettingsMetadata enableAdvancedPowerFormsMetadata) {
    this.enableAdvancedPowerFormsMetadata = enableAdvancedPowerFormsMetadata;
  }

  public AccountSettingsInformation enableAutoNav(String enableAutoNav) {
    this.enableAutoNav = enableAutoNav;
    return this;
  }

   /**
   * 
   * @return enableAutoNav
  **/
  @ApiModelProperty(value = "")
  public String getEnableAutoNav() {
    return enableAutoNav;
  }

  public void setEnableAutoNav(String enableAutoNav) {
    this.enableAutoNav = enableAutoNav;
  }

  public AccountSettingsInformation enableAutoNavMetadata(SettingsMetadata enableAutoNavMetadata) {
    this.enableAutoNavMetadata = enableAutoNavMetadata;
    return this;
  }

   /**
   * Get enableAutoNavMetadata
   * @return enableAutoNavMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableAutoNavMetadata() {
    return enableAutoNavMetadata;
  }

  public void setEnableAutoNavMetadata(SettingsMetadata enableAutoNavMetadata) {
    this.enableAutoNavMetadata = enableAutoNavMetadata;
  }

  public AccountSettingsInformation enableCalculatedFields(String enableCalculatedFields) {
    this.enableCalculatedFields = enableCalculatedFields;
    return this;
  }

   /**
   * 
   * @return enableCalculatedFields
  **/
  @ApiModelProperty(value = "")
  public String getEnableCalculatedFields() {
    return enableCalculatedFields;
  }

  public void setEnableCalculatedFields(String enableCalculatedFields) {
    this.enableCalculatedFields = enableCalculatedFields;
  }

  public AccountSettingsInformation enableCalculatedFieldsMetadata(SettingsMetadata enableCalculatedFieldsMetadata) {
    this.enableCalculatedFieldsMetadata = enableCalculatedFieldsMetadata;
    return this;
  }

   /**
   * Get enableCalculatedFieldsMetadata
   * @return enableCalculatedFieldsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableCalculatedFieldsMetadata() {
    return enableCalculatedFieldsMetadata;
  }

  public void setEnableCalculatedFieldsMetadata(SettingsMetadata enableCalculatedFieldsMetadata) {
    this.enableCalculatedFieldsMetadata = enableCalculatedFieldsMetadata;
  }

  public AccountSettingsInformation enableClickwraps(String enableClickwraps) {
    this.enableClickwraps = enableClickwraps;
    return this;
  }

   /**
   * 
   * @return enableClickwraps
  **/
  @ApiModelProperty(value = "")
  public String getEnableClickwraps() {
    return enableClickwraps;
  }

  public void setEnableClickwraps(String enableClickwraps) {
    this.enableClickwraps = enableClickwraps;
  }

  public AccountSettingsInformation enableClickwrapsMetadata(SettingsMetadata enableClickwrapsMetadata) {
    this.enableClickwrapsMetadata = enableClickwrapsMetadata;
    return this;
  }

   /**
   * Get enableClickwrapsMetadata
   * @return enableClickwrapsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableClickwrapsMetadata() {
    return enableClickwrapsMetadata;
  }

  public void setEnableClickwrapsMetadata(SettingsMetadata enableClickwrapsMetadata) {
    this.enableClickwrapsMetadata = enableClickwrapsMetadata;
  }

  public AccountSettingsInformation enableCommentsHistoryDownloadInSigning(String enableCommentsHistoryDownloadInSigning) {
    this.enableCommentsHistoryDownloadInSigning = enableCommentsHistoryDownloadInSigning;
    return this;
  }

   /**
   * 
   * @return enableCommentsHistoryDownloadInSigning
  **/
  @ApiModelProperty(value = "")
  public String getEnableCommentsHistoryDownloadInSigning() {
    return enableCommentsHistoryDownloadInSigning;
  }

  public void setEnableCommentsHistoryDownloadInSigning(String enableCommentsHistoryDownloadInSigning) {
    this.enableCommentsHistoryDownloadInSigning = enableCommentsHistoryDownloadInSigning;
  }

  public AccountSettingsInformation enableCommentsHistoryDownloadInSigningMetadata(SettingsMetadata enableCommentsHistoryDownloadInSigningMetadata) {
    this.enableCommentsHistoryDownloadInSigningMetadata = enableCommentsHistoryDownloadInSigningMetadata;
    return this;
  }

   /**
   * Get enableCommentsHistoryDownloadInSigningMetadata
   * @return enableCommentsHistoryDownloadInSigningMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableCommentsHistoryDownloadInSigningMetadata() {
    return enableCommentsHistoryDownloadInSigningMetadata;
  }

  public void setEnableCommentsHistoryDownloadInSigningMetadata(SettingsMetadata enableCommentsHistoryDownloadInSigningMetadata) {
    this.enableCommentsHistoryDownloadInSigningMetadata = enableCommentsHistoryDownloadInSigningMetadata;
  }

  public AccountSettingsInformation enableCustomerSatisfactionMetricTracking(String enableCustomerSatisfactionMetricTracking) {
    this.enableCustomerSatisfactionMetricTracking = enableCustomerSatisfactionMetricTracking;
    return this;
  }

   /**
   * 
   * @return enableCustomerSatisfactionMetricTracking
  **/
  @ApiModelProperty(value = "")
  public String getEnableCustomerSatisfactionMetricTracking() {
    return enableCustomerSatisfactionMetricTracking;
  }

  public void setEnableCustomerSatisfactionMetricTracking(String enableCustomerSatisfactionMetricTracking) {
    this.enableCustomerSatisfactionMetricTracking = enableCustomerSatisfactionMetricTracking;
  }

  public AccountSettingsInformation enableCustomerSatisfactionMetricTrackingMetadata(SettingsMetadata enableCustomerSatisfactionMetricTrackingMetadata) {
    this.enableCustomerSatisfactionMetricTrackingMetadata = enableCustomerSatisfactionMetricTrackingMetadata;
    return this;
  }

   /**
   * Get enableCustomerSatisfactionMetricTrackingMetadata
   * @return enableCustomerSatisfactionMetricTrackingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableCustomerSatisfactionMetricTrackingMetadata() {
    return enableCustomerSatisfactionMetricTrackingMetadata;
  }

  public void setEnableCustomerSatisfactionMetricTrackingMetadata(SettingsMetadata enableCustomerSatisfactionMetricTrackingMetadata) {
    this.enableCustomerSatisfactionMetricTrackingMetadata = enableCustomerSatisfactionMetricTrackingMetadata;
  }

  public AccountSettingsInformation enableDSPro(String enableDSPro) {
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

  public AccountSettingsInformation enableDSProMetadata(SettingsMetadata enableDSProMetadata) {
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

  public AccountSettingsInformation enableEnvelopeStampingByAccountAdmin(String enableEnvelopeStampingByAccountAdmin) {
    this.enableEnvelopeStampingByAccountAdmin = enableEnvelopeStampingByAccountAdmin;
    return this;
  }

   /**
   * 
   * @return enableEnvelopeStampingByAccountAdmin
  **/
  @ApiModelProperty(value = "")
  public String getEnableEnvelopeStampingByAccountAdmin() {
    return enableEnvelopeStampingByAccountAdmin;
  }

  public void setEnableEnvelopeStampingByAccountAdmin(String enableEnvelopeStampingByAccountAdmin) {
    this.enableEnvelopeStampingByAccountAdmin = enableEnvelopeStampingByAccountAdmin;
  }

  public AccountSettingsInformation enableEnvelopeStampingByAccountAdminMetadata(SettingsMetadata enableEnvelopeStampingByAccountAdminMetadata) {
    this.enableEnvelopeStampingByAccountAdminMetadata = enableEnvelopeStampingByAccountAdminMetadata;
    return this;
  }

   /**
   * Get enableEnvelopeStampingByAccountAdminMetadata
   * @return enableEnvelopeStampingByAccountAdminMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableEnvelopeStampingByAccountAdminMetadata() {
    return enableEnvelopeStampingByAccountAdminMetadata;
  }

  public void setEnableEnvelopeStampingByAccountAdminMetadata(SettingsMetadata enableEnvelopeStampingByAccountAdminMetadata) {
    this.enableEnvelopeStampingByAccountAdminMetadata = enableEnvelopeStampingByAccountAdminMetadata;
  }

  public AccountSettingsInformation enableEnvelopeStampingByDSAdmin(String enableEnvelopeStampingByDSAdmin) {
    this.enableEnvelopeStampingByDSAdmin = enableEnvelopeStampingByDSAdmin;
    return this;
  }

   /**
   * 
   * @return enableEnvelopeStampingByDSAdmin
  **/
  @ApiModelProperty(value = "")
  public String getEnableEnvelopeStampingByDSAdmin() {
    return enableEnvelopeStampingByDSAdmin;
  }

  public void setEnableEnvelopeStampingByDSAdmin(String enableEnvelopeStampingByDSAdmin) {
    this.enableEnvelopeStampingByDSAdmin = enableEnvelopeStampingByDSAdmin;
  }

  public AccountSettingsInformation enableEnvelopeStampingByDSAdminMetadata(SettingsMetadata enableEnvelopeStampingByDSAdminMetadata) {
    this.enableEnvelopeStampingByDSAdminMetadata = enableEnvelopeStampingByDSAdminMetadata;
    return this;
  }

   /**
   * Get enableEnvelopeStampingByDSAdminMetadata
   * @return enableEnvelopeStampingByDSAdminMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableEnvelopeStampingByDSAdminMetadata() {
    return enableEnvelopeStampingByDSAdminMetadata;
  }

  public void setEnableEnvelopeStampingByDSAdminMetadata(SettingsMetadata enableEnvelopeStampingByDSAdminMetadata) {
    this.enableEnvelopeStampingByDSAdminMetadata = enableEnvelopeStampingByDSAdminMetadata;
  }

  public AccountSettingsInformation enableInBrowserEditor(String enableInBrowserEditor) {
    this.enableInBrowserEditor = enableInBrowserEditor;
    return this;
  }

   /**
   * 
   * @return enableInBrowserEditor
  **/
  @ApiModelProperty(value = "")
  public String getEnableInBrowserEditor() {
    return enableInBrowserEditor;
  }

  public void setEnableInBrowserEditor(String enableInBrowserEditor) {
    this.enableInBrowserEditor = enableInBrowserEditor;
  }

  public AccountSettingsInformation enableInBrowserEditorMetadata(SettingsMetadata enableInBrowserEditorMetadata) {
    this.enableInBrowserEditorMetadata = enableInBrowserEditorMetadata;
    return this;
  }

   /**
   * Get enableInBrowserEditorMetadata
   * @return enableInBrowserEditorMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableInBrowserEditorMetadata() {
    return enableInBrowserEditorMetadata;
  }

  public void setEnableInBrowserEditorMetadata(SettingsMetadata enableInBrowserEditorMetadata) {
    this.enableInBrowserEditorMetadata = enableInBrowserEditorMetadata;
  }

  public AccountSettingsInformation enablePaymentProcessing(String enablePaymentProcessing) {
    this.enablePaymentProcessing = enablePaymentProcessing;
    return this;
  }

   /**
   * 
   * @return enablePaymentProcessing
  **/
  @ApiModelProperty(value = "")
  public String getEnablePaymentProcessing() {
    return enablePaymentProcessing;
  }

  public void setEnablePaymentProcessing(String enablePaymentProcessing) {
    this.enablePaymentProcessing = enablePaymentProcessing;
  }

  public AccountSettingsInformation enablePaymentProcessingMetadata(SettingsMetadata enablePaymentProcessingMetadata) {
    this.enablePaymentProcessingMetadata = enablePaymentProcessingMetadata;
    return this;
  }

   /**
   * Get enablePaymentProcessingMetadata
   * @return enablePaymentProcessingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnablePaymentProcessingMetadata() {
    return enablePaymentProcessingMetadata;
  }

  public void setEnablePaymentProcessingMetadata(SettingsMetadata enablePaymentProcessingMetadata) {
    this.enablePaymentProcessingMetadata = enablePaymentProcessingMetadata;
  }

  public AccountSettingsInformation enablePowerForm(String enablePowerForm) {
    this.enablePowerForm = enablePowerForm;
    return this;
  }

   /**
   * 
   * @return enablePowerForm
  **/
  @ApiModelProperty(value = "")
  public String getEnablePowerForm() {
    return enablePowerForm;
  }

  public void setEnablePowerForm(String enablePowerForm) {
    this.enablePowerForm = enablePowerForm;
  }

  public AccountSettingsInformation enablePowerFormDirect(String enablePowerFormDirect) {
    this.enablePowerFormDirect = enablePowerFormDirect;
    return this;
  }

   /**
   * 
   * @return enablePowerFormDirect
  **/
  @ApiModelProperty(value = "")
  public String getEnablePowerFormDirect() {
    return enablePowerFormDirect;
  }

  public void setEnablePowerFormDirect(String enablePowerFormDirect) {
    this.enablePowerFormDirect = enablePowerFormDirect;
  }

  public AccountSettingsInformation enablePowerFormDirectMetadata(SettingsMetadata enablePowerFormDirectMetadata) {
    this.enablePowerFormDirectMetadata = enablePowerFormDirectMetadata;
    return this;
  }

   /**
   * Get enablePowerFormDirectMetadata
   * @return enablePowerFormDirectMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnablePowerFormDirectMetadata() {
    return enablePowerFormDirectMetadata;
  }

  public void setEnablePowerFormDirectMetadata(SettingsMetadata enablePowerFormDirectMetadata) {
    this.enablePowerFormDirectMetadata = enablePowerFormDirectMetadata;
  }

  public AccountSettingsInformation enablePowerFormMetadata(SettingsMetadata enablePowerFormMetadata) {
    this.enablePowerFormMetadata = enablePowerFormMetadata;
    return this;
  }

   /**
   * Get enablePowerFormMetadata
   * @return enablePowerFormMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnablePowerFormMetadata() {
    return enablePowerFormMetadata;
  }

  public void setEnablePowerFormMetadata(SettingsMetadata enablePowerFormMetadata) {
    this.enablePowerFormMetadata = enablePowerFormMetadata;
  }

  public AccountSettingsInformation enableRecipientDomainValidation(String enableRecipientDomainValidation) {
    this.enableRecipientDomainValidation = enableRecipientDomainValidation;
    return this;
  }

   /**
   * 
   * @return enableRecipientDomainValidation
  **/
  @ApiModelProperty(value = "")
  public String getEnableRecipientDomainValidation() {
    return enableRecipientDomainValidation;
  }

  public void setEnableRecipientDomainValidation(String enableRecipientDomainValidation) {
    this.enableRecipientDomainValidation = enableRecipientDomainValidation;
  }

  public AccountSettingsInformation enableRecipientDomainValidationMetadata(SettingsMetadata enableRecipientDomainValidationMetadata) {
    this.enableRecipientDomainValidationMetadata = enableRecipientDomainValidationMetadata;
    return this;
  }

   /**
   * Get enableRecipientDomainValidationMetadata
   * @return enableRecipientDomainValidationMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableRecipientDomainValidationMetadata() {
    return enableRecipientDomainValidationMetadata;
  }

  public void setEnableRecipientDomainValidationMetadata(SettingsMetadata enableRecipientDomainValidationMetadata) {
    this.enableRecipientDomainValidationMetadata = enableRecipientDomainValidationMetadata;
  }

  public AccountSettingsInformation enableReportLinks(String enableReportLinks) {
    this.enableReportLinks = enableReportLinks;
    return this;
  }

   /**
   * 
   * @return enableReportLinks
  **/
  @ApiModelProperty(value = "")
  public String getEnableReportLinks() {
    return enableReportLinks;
  }

  public void setEnableReportLinks(String enableReportLinks) {
    this.enableReportLinks = enableReportLinks;
  }

  public AccountSettingsInformation enableReportLinksMetadata(SettingsMetadata enableReportLinksMetadata) {
    this.enableReportLinksMetadata = enableReportLinksMetadata;
    return this;
  }

   /**
   * Get enableReportLinksMetadata
   * @return enableReportLinksMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableReportLinksMetadata() {
    return enableReportLinksMetadata;
  }

  public void setEnableReportLinksMetadata(SettingsMetadata enableReportLinksMetadata) {
    this.enableReportLinksMetadata = enableReportLinksMetadata;
  }

  public AccountSettingsInformation enableRequireSignOnPaper(String enableRequireSignOnPaper) {
    this.enableRequireSignOnPaper = enableRequireSignOnPaper;
    return this;
  }

   /**
   * 
   * @return enableRequireSignOnPaper
  **/
  @ApiModelProperty(value = "")
  public String getEnableRequireSignOnPaper() {
    return enableRequireSignOnPaper;
  }

  public void setEnableRequireSignOnPaper(String enableRequireSignOnPaper) {
    this.enableRequireSignOnPaper = enableRequireSignOnPaper;
  }

  public AccountSettingsInformation enableRequireSignOnPaperMetadata(SettingsMetadata enableRequireSignOnPaperMetadata) {
    this.enableRequireSignOnPaperMetadata = enableRequireSignOnPaperMetadata;
    return this;
  }

   /**
   * Get enableRequireSignOnPaperMetadata
   * @return enableRequireSignOnPaperMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableRequireSignOnPaperMetadata() {
    return enableRequireSignOnPaperMetadata;
  }

  public void setEnableRequireSignOnPaperMetadata(SettingsMetadata enableRequireSignOnPaperMetadata) {
    this.enableRequireSignOnPaperMetadata = enableRequireSignOnPaperMetadata;
  }

  public AccountSettingsInformation enableReservedDomain(String enableReservedDomain) {
    this.enableReservedDomain = enableReservedDomain;
    return this;
  }

   /**
   * 
   * @return enableReservedDomain
  **/
  @ApiModelProperty(value = "")
  public String getEnableReservedDomain() {
    return enableReservedDomain;
  }

  public void setEnableReservedDomain(String enableReservedDomain) {
    this.enableReservedDomain = enableReservedDomain;
  }

  public AccountSettingsInformation enableReservedDomainMetadata(SettingsMetadata enableReservedDomainMetadata) {
    this.enableReservedDomainMetadata = enableReservedDomainMetadata;
    return this;
  }

   /**
   * Get enableReservedDomainMetadata
   * @return enableReservedDomainMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableReservedDomainMetadata() {
    return enableReservedDomainMetadata;
  }

  public void setEnableReservedDomainMetadata(SettingsMetadata enableReservedDomainMetadata) {
    this.enableReservedDomainMetadata = enableReservedDomainMetadata;
  }

  public AccountSettingsInformation enableResponsiveSigning(String enableResponsiveSigning) {
    this.enableResponsiveSigning = enableResponsiveSigning;
    return this;
  }

   /**
   * 
   * @return enableResponsiveSigning
  **/
  @ApiModelProperty(value = "")
  public String getEnableResponsiveSigning() {
    return enableResponsiveSigning;
  }

  public void setEnableResponsiveSigning(String enableResponsiveSigning) {
    this.enableResponsiveSigning = enableResponsiveSigning;
  }

  public AccountSettingsInformation enableResponsiveSigningMetadata(SettingsMetadata enableResponsiveSigningMetadata) {
    this.enableResponsiveSigningMetadata = enableResponsiveSigningMetadata;
    return this;
  }

   /**
   * Get enableResponsiveSigningMetadata
   * @return enableResponsiveSigningMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableResponsiveSigningMetadata() {
    return enableResponsiveSigningMetadata;
  }

  public void setEnableResponsiveSigningMetadata(SettingsMetadata enableResponsiveSigningMetadata) {
    this.enableResponsiveSigningMetadata = enableResponsiveSigningMetadata;
  }

  public AccountSettingsInformation enableScheduledRelease(String enableScheduledRelease) {
    this.enableScheduledRelease = enableScheduledRelease;
    return this;
  }

   /**
   * 
   * @return enableScheduledRelease
  **/
  @ApiModelProperty(value = "")
  public String getEnableScheduledRelease() {
    return enableScheduledRelease;
  }

  public void setEnableScheduledRelease(String enableScheduledRelease) {
    this.enableScheduledRelease = enableScheduledRelease;
  }

  public AccountSettingsInformation enableScheduledReleaseMetadata(SettingsMetadata enableScheduledReleaseMetadata) {
    this.enableScheduledReleaseMetadata = enableScheduledReleaseMetadata;
    return this;
  }

   /**
   * Get enableScheduledReleaseMetadata
   * @return enableScheduledReleaseMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableScheduledReleaseMetadata() {
    return enableScheduledReleaseMetadata;
  }

  public void setEnableScheduledReleaseMetadata(SettingsMetadata enableScheduledReleaseMetadata) {
    this.enableScheduledReleaseMetadata = enableScheduledReleaseMetadata;
  }

  public AccountSettingsInformation enableSearchUI(String enableSearchUI) {
    this.enableSearchUI = enableSearchUI;
    return this;
  }

   /**
   * 
   * @return enableSearchUI
  **/
  @ApiModelProperty(value = "")
  public String getEnableSearchUI() {
    return enableSearchUI;
  }

  public void setEnableSearchUI(String enableSearchUI) {
    this.enableSearchUI = enableSearchUI;
  }

  public AccountSettingsInformation enableSearchUIMetadata(SettingsMetadata enableSearchUIMetadata) {
    this.enableSearchUIMetadata = enableSearchUIMetadata;
    return this;
  }

   /**
   * Get enableSearchUIMetadata
   * @return enableSearchUIMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSearchUIMetadata() {
    return enableSearchUIMetadata;
  }

  public void setEnableSearchUIMetadata(SettingsMetadata enableSearchUIMetadata) {
    this.enableSearchUIMetadata = enableSearchUIMetadata;
  }

  public AccountSettingsInformation enableSendingTagsFontSettings(String enableSendingTagsFontSettings) {
    this.enableSendingTagsFontSettings = enableSendingTagsFontSettings;
    return this;
  }

   /**
   * 
   * @return enableSendingTagsFontSettings
  **/
  @ApiModelProperty(value = "")
  public String getEnableSendingTagsFontSettings() {
    return enableSendingTagsFontSettings;
  }

  public void setEnableSendingTagsFontSettings(String enableSendingTagsFontSettings) {
    this.enableSendingTagsFontSettings = enableSendingTagsFontSettings;
  }

  public AccountSettingsInformation enableSendingTagsFontSettingsMetadata(SettingsMetadata enableSendingTagsFontSettingsMetadata) {
    this.enableSendingTagsFontSettingsMetadata = enableSendingTagsFontSettingsMetadata;
    return this;
  }

   /**
   * Get enableSendingTagsFontSettingsMetadata
   * @return enableSendingTagsFontSettingsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSendingTagsFontSettingsMetadata() {
    return enableSendingTagsFontSettingsMetadata;
  }

  public void setEnableSendingTagsFontSettingsMetadata(SettingsMetadata enableSendingTagsFontSettingsMetadata) {
    this.enableSendingTagsFontSettingsMetadata = enableSendingTagsFontSettingsMetadata;
  }

  public AccountSettingsInformation enableSendToAgent(String enableSendToAgent) {
    this.enableSendToAgent = enableSendToAgent;
    return this;
  }

   /**
   * 
   * @return enableSendToAgent
  **/
  @ApiModelProperty(value = "")
  public String getEnableSendToAgent() {
    return enableSendToAgent;
  }

  public void setEnableSendToAgent(String enableSendToAgent) {
    this.enableSendToAgent = enableSendToAgent;
  }

  public AccountSettingsInformation enableSendToAgentMetadata(SettingsMetadata enableSendToAgentMetadata) {
    this.enableSendToAgentMetadata = enableSendToAgentMetadata;
    return this;
  }

   /**
   * Get enableSendToAgentMetadata
   * @return enableSendToAgentMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSendToAgentMetadata() {
    return enableSendToAgentMetadata;
  }

  public void setEnableSendToAgentMetadata(SettingsMetadata enableSendToAgentMetadata) {
    this.enableSendToAgentMetadata = enableSendToAgentMetadata;
  }

  public AccountSettingsInformation enableSendToIntermediary(String enableSendToIntermediary) {
    this.enableSendToIntermediary = enableSendToIntermediary;
    return this;
  }

   /**
   * 
   * @return enableSendToIntermediary
  **/
  @ApiModelProperty(value = "")
  public String getEnableSendToIntermediary() {
    return enableSendToIntermediary;
  }

  public void setEnableSendToIntermediary(String enableSendToIntermediary) {
    this.enableSendToIntermediary = enableSendToIntermediary;
  }

  public AccountSettingsInformation enableSendToIntermediaryMetadata(SettingsMetadata enableSendToIntermediaryMetadata) {
    this.enableSendToIntermediaryMetadata = enableSendToIntermediaryMetadata;
    return this;
  }

   /**
   * Get enableSendToIntermediaryMetadata
   * @return enableSendToIntermediaryMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSendToIntermediaryMetadata() {
    return enableSendToIntermediaryMetadata;
  }

  public void setEnableSendToIntermediaryMetadata(SettingsMetadata enableSendToIntermediaryMetadata) {
    this.enableSendToIntermediaryMetadata = enableSendToIntermediaryMetadata;
  }

  public AccountSettingsInformation enableSendToManage(String enableSendToManage) {
    this.enableSendToManage = enableSendToManage;
    return this;
  }

   /**
   * 
   * @return enableSendToManage
  **/
  @ApiModelProperty(value = "")
  public String getEnableSendToManage() {
    return enableSendToManage;
  }

  public void setEnableSendToManage(String enableSendToManage) {
    this.enableSendToManage = enableSendToManage;
  }

  public AccountSettingsInformation enableSendToManageMetadata(SettingsMetadata enableSendToManageMetadata) {
    this.enableSendToManageMetadata = enableSendToManageMetadata;
    return this;
  }

   /**
   * Get enableSendToManageMetadata
   * @return enableSendToManageMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSendToManageMetadata() {
    return enableSendToManageMetadata;
  }

  public void setEnableSendToManageMetadata(SettingsMetadata enableSendToManageMetadata) {
    this.enableSendToManageMetadata = enableSendToManageMetadata;
  }

  public AccountSettingsInformation enableSequentialSigningAPI(String enableSequentialSigningAPI) {
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

  public AccountSettingsInformation enableSequentialSigningAPIMetadata(SettingsMetadata enableSequentialSigningAPIMetadata) {
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

  public AccountSettingsInformation enableSequentialSigningUI(String enableSequentialSigningUI) {
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

  public AccountSettingsInformation enableSequentialSigningUIMetadata(SettingsMetadata enableSequentialSigningUIMetadata) {
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

  public AccountSettingsInformation enableSignerAttachments(String enableSignerAttachments) {
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

  public AccountSettingsInformation enableSignerAttachmentsMetadata(SettingsMetadata enableSignerAttachmentsMetadata) {
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

  public AccountSettingsInformation enableSigningExtensionComments(String enableSigningExtensionComments) {
    this.enableSigningExtensionComments = enableSigningExtensionComments;
    return this;
  }

   /**
   * 
   * @return enableSigningExtensionComments
  **/
  @ApiModelProperty(value = "")
  public String getEnableSigningExtensionComments() {
    return enableSigningExtensionComments;
  }

  public void setEnableSigningExtensionComments(String enableSigningExtensionComments) {
    this.enableSigningExtensionComments = enableSigningExtensionComments;
  }

  public AccountSettingsInformation enableSigningExtensionCommentsMetadata(SettingsMetadata enableSigningExtensionCommentsMetadata) {
    this.enableSigningExtensionCommentsMetadata = enableSigningExtensionCommentsMetadata;
    return this;
  }

   /**
   * Get enableSigningExtensionCommentsMetadata
   * @return enableSigningExtensionCommentsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSigningExtensionCommentsMetadata() {
    return enableSigningExtensionCommentsMetadata;
  }

  public void setEnableSigningExtensionCommentsMetadata(SettingsMetadata enableSigningExtensionCommentsMetadata) {
    this.enableSigningExtensionCommentsMetadata = enableSigningExtensionCommentsMetadata;
  }

  public AccountSettingsInformation enableSigningExtensionConversations(String enableSigningExtensionConversations) {
    this.enableSigningExtensionConversations = enableSigningExtensionConversations;
    return this;
  }

   /**
   * 
   * @return enableSigningExtensionConversations
  **/
  @ApiModelProperty(value = "")
  public String getEnableSigningExtensionConversations() {
    return enableSigningExtensionConversations;
  }

  public void setEnableSigningExtensionConversations(String enableSigningExtensionConversations) {
    this.enableSigningExtensionConversations = enableSigningExtensionConversations;
  }

  public AccountSettingsInformation enableSigningExtensionConversationsMetadata(SettingsMetadata enableSigningExtensionConversationsMetadata) {
    this.enableSigningExtensionConversationsMetadata = enableSigningExtensionConversationsMetadata;
    return this;
  }

   /**
   * Get enableSigningExtensionConversationsMetadata
   * @return enableSigningExtensionConversationsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSigningExtensionConversationsMetadata() {
    return enableSigningExtensionConversationsMetadata;
  }

  public void setEnableSigningExtensionConversationsMetadata(SettingsMetadata enableSigningExtensionConversationsMetadata) {
    this.enableSigningExtensionConversationsMetadata = enableSigningExtensionConversationsMetadata;
  }

  public AccountSettingsInformation enableSigningOrderSettingsForAccount(String enableSigningOrderSettingsForAccount) {
    this.enableSigningOrderSettingsForAccount = enableSigningOrderSettingsForAccount;
    return this;
  }

   /**
   * 
   * @return enableSigningOrderSettingsForAccount
  **/
  @ApiModelProperty(value = "")
  public String getEnableSigningOrderSettingsForAccount() {
    return enableSigningOrderSettingsForAccount;
  }

  public void setEnableSigningOrderSettingsForAccount(String enableSigningOrderSettingsForAccount) {
    this.enableSigningOrderSettingsForAccount = enableSigningOrderSettingsForAccount;
  }

  public AccountSettingsInformation enableSigningOrderSettingsForAccountMetadata(SettingsMetadata enableSigningOrderSettingsForAccountMetadata) {
    this.enableSigningOrderSettingsForAccountMetadata = enableSigningOrderSettingsForAccountMetadata;
    return this;
  }

   /**
   * Get enableSigningOrderSettingsForAccountMetadata
   * @return enableSigningOrderSettingsForAccountMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSigningOrderSettingsForAccountMetadata() {
    return enableSigningOrderSettingsForAccountMetadata;
  }

  public void setEnableSigningOrderSettingsForAccountMetadata(SettingsMetadata enableSigningOrderSettingsForAccountMetadata) {
    this.enableSigningOrderSettingsForAccountMetadata = enableSigningOrderSettingsForAccountMetadata;
  }

  public AccountSettingsInformation enableSignOnPaper(String enableSignOnPaper) {
    this.enableSignOnPaper = enableSignOnPaper;
    return this;
  }

   /**
   * 
   * @return enableSignOnPaper
  **/
  @ApiModelProperty(value = "")
  public String getEnableSignOnPaper() {
    return enableSignOnPaper;
  }

  public void setEnableSignOnPaper(String enableSignOnPaper) {
    this.enableSignOnPaper = enableSignOnPaper;
  }

  public AccountSettingsInformation enableSignOnPaperMetadata(SettingsMetadata enableSignOnPaperMetadata) {
    this.enableSignOnPaperMetadata = enableSignOnPaperMetadata;
    return this;
  }

   /**
   * Get enableSignOnPaperMetadata
   * @return enableSignOnPaperMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSignOnPaperMetadata() {
    return enableSignOnPaperMetadata;
  }

  public void setEnableSignOnPaperMetadata(SettingsMetadata enableSignOnPaperMetadata) {
    this.enableSignOnPaperMetadata = enableSignOnPaperMetadata;
  }

  public AccountSettingsInformation enableSignOnPaperOverride(String enableSignOnPaperOverride) {
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

  public AccountSettingsInformation enableSignOnPaperOverrideMetadata(SettingsMetadata enableSignOnPaperOverrideMetadata) {
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

  public AccountSettingsInformation enableSignWithNotary(String enableSignWithNotary) {
    this.enableSignWithNotary = enableSignWithNotary;
    return this;
  }

   /**
   * 
   * @return enableSignWithNotary
  **/
  @ApiModelProperty(value = "")
  public String getEnableSignWithNotary() {
    return enableSignWithNotary;
  }

  public void setEnableSignWithNotary(String enableSignWithNotary) {
    this.enableSignWithNotary = enableSignWithNotary;
  }

  public AccountSettingsInformation enableSignWithNotaryMetadata(SettingsMetadata enableSignWithNotaryMetadata) {
    this.enableSignWithNotaryMetadata = enableSignWithNotaryMetadata;
    return this;
  }

   /**
   * Get enableSignWithNotaryMetadata
   * @return enableSignWithNotaryMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSignWithNotaryMetadata() {
    return enableSignWithNotaryMetadata;
  }

  public void setEnableSignWithNotaryMetadata(SettingsMetadata enableSignWithNotaryMetadata) {
    this.enableSignWithNotaryMetadata = enableSignWithNotaryMetadata;
  }

  public AccountSettingsInformation enableSmartContracts(String enableSmartContracts) {
    this.enableSmartContracts = enableSmartContracts;
    return this;
  }

   /**
   * 
   * @return enableSmartContracts
  **/
  @ApiModelProperty(value = "")
  public String getEnableSmartContracts() {
    return enableSmartContracts;
  }

  public void setEnableSmartContracts(String enableSmartContracts) {
    this.enableSmartContracts = enableSmartContracts;
  }

  public AccountSettingsInformation enableSmartContractsMetadata(SettingsMetadata enableSmartContractsMetadata) {
    this.enableSmartContractsMetadata = enableSmartContractsMetadata;
    return this;
  }

   /**
   * Get enableSmartContractsMetadata
   * @return enableSmartContractsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSmartContractsMetadata() {
    return enableSmartContractsMetadata;
  }

  public void setEnableSmartContractsMetadata(SettingsMetadata enableSmartContractsMetadata) {
    this.enableSmartContractsMetadata = enableSmartContractsMetadata;
  }

  public AccountSettingsInformation enableSMSAuthentication(String enableSMSAuthentication) {
    this.enableSMSAuthentication = enableSMSAuthentication;
    return this;
  }

   /**
   * 
   * @return enableSMSAuthentication
  **/
  @ApiModelProperty(value = "")
  public String getEnableSMSAuthentication() {
    return enableSMSAuthentication;
  }

  public void setEnableSMSAuthentication(String enableSMSAuthentication) {
    this.enableSMSAuthentication = enableSMSAuthentication;
  }

  public AccountSettingsInformation enableSMSAuthenticationMetadata(SettingsMetadata enableSMSAuthenticationMetadata) {
    this.enableSMSAuthenticationMetadata = enableSMSAuthenticationMetadata;
    return this;
  }

   /**
   * Get enableSMSAuthenticationMetadata
   * @return enableSMSAuthenticationMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSMSAuthenticationMetadata() {
    return enableSMSAuthenticationMetadata;
  }

  public void setEnableSMSAuthenticationMetadata(SettingsMetadata enableSMSAuthenticationMetadata) {
    this.enableSMSAuthenticationMetadata = enableSMSAuthenticationMetadata;
  }

  public AccountSettingsInformation enableSocialIdLogin(String enableSocialIdLogin) {
    this.enableSocialIdLogin = enableSocialIdLogin;
    return this;
  }

   /**
   * 
   * @return enableSocialIdLogin
  **/
  @ApiModelProperty(value = "")
  public String getEnableSocialIdLogin() {
    return enableSocialIdLogin;
  }

  public void setEnableSocialIdLogin(String enableSocialIdLogin) {
    this.enableSocialIdLogin = enableSocialIdLogin;
  }

  public AccountSettingsInformation enableSocialIdLoginMetadata(SettingsMetadata enableSocialIdLoginMetadata) {
    this.enableSocialIdLoginMetadata = enableSocialIdLoginMetadata;
    return this;
  }

   /**
   * Get enableSocialIdLoginMetadata
   * @return enableSocialIdLoginMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableSocialIdLoginMetadata() {
    return enableSocialIdLoginMetadata;
  }

  public void setEnableSocialIdLoginMetadata(SettingsMetadata enableSocialIdLoginMetadata) {
    this.enableSocialIdLoginMetadata = enableSocialIdLoginMetadata;
  }

  public AccountSettingsInformation enableStrikeThrough(String enableStrikeThrough) {
    this.enableStrikeThrough = enableStrikeThrough;
    return this;
  }

   /**
   * 
   * @return enableStrikeThrough
  **/
  @ApiModelProperty(value = "")
  public String getEnableStrikeThrough() {
    return enableStrikeThrough;
  }

  public void setEnableStrikeThrough(String enableStrikeThrough) {
    this.enableStrikeThrough = enableStrikeThrough;
  }

  public AccountSettingsInformation enableStrikeThroughMetadata(SettingsMetadata enableStrikeThroughMetadata) {
    this.enableStrikeThroughMetadata = enableStrikeThroughMetadata;
    return this;
  }

   /**
   * Get enableStrikeThroughMetadata
   * @return enableStrikeThroughMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableStrikeThroughMetadata() {
    return enableStrikeThroughMetadata;
  }

  public void setEnableStrikeThroughMetadata(SettingsMetadata enableStrikeThroughMetadata) {
    this.enableStrikeThroughMetadata = enableStrikeThroughMetadata;
  }

  public AccountSettingsInformation enableTransactionPoint(String enableTransactionPoint) {
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

  public AccountSettingsInformation enableTransactionPointMetadata(SettingsMetadata enableTransactionPointMetadata) {
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

  public AccountSettingsInformation enableVaulting(String enableVaulting) {
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

  public AccountSettingsInformation enableVaultingMetadata(SettingsMetadata enableVaultingMetadata) {
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

  public AccountSettingsInformation enableWitnessing(String enableWitnessing) {
    this.enableWitnessing = enableWitnessing;
    return this;
  }

   /**
   * 
   * @return enableWitnessing
  **/
  @ApiModelProperty(value = "")
  public String getEnableWitnessing() {
    return enableWitnessing;
  }

  public void setEnableWitnessing(String enableWitnessing) {
    this.enableWitnessing = enableWitnessing;
  }

  public AccountSettingsInformation enableWitnessingMetadata(SettingsMetadata enableWitnessingMetadata) {
    this.enableWitnessingMetadata = enableWitnessingMetadata;
    return this;
  }

   /**
   * Get enableWitnessingMetadata
   * @return enableWitnessingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnableWitnessingMetadata() {
    return enableWitnessingMetadata;
  }

  public void setEnableWitnessingMetadata(SettingsMetadata enableWitnessingMetadata) {
    this.enableWitnessingMetadata = enableWitnessingMetadata;
  }

  public AccountSettingsInformation enforceTemplateNameUniqueness(String enforceTemplateNameUniqueness) {
    this.enforceTemplateNameUniqueness = enforceTemplateNameUniqueness;
    return this;
  }

   /**
   * 
   * @return enforceTemplateNameUniqueness
  **/
  @ApiModelProperty(value = "")
  public String getEnforceTemplateNameUniqueness() {
    return enforceTemplateNameUniqueness;
  }

  public void setEnforceTemplateNameUniqueness(String enforceTemplateNameUniqueness) {
    this.enforceTemplateNameUniqueness = enforceTemplateNameUniqueness;
  }

  public AccountSettingsInformation enforceTemplateNameUniquenessMetadata(SettingsMetadata enforceTemplateNameUniquenessMetadata) {
    this.enforceTemplateNameUniquenessMetadata = enforceTemplateNameUniquenessMetadata;
    return this;
  }

   /**
   * Get enforceTemplateNameUniquenessMetadata
   * @return enforceTemplateNameUniquenessMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnforceTemplateNameUniquenessMetadata() {
    return enforceTemplateNameUniquenessMetadata;
  }

  public void setEnforceTemplateNameUniquenessMetadata(SettingsMetadata enforceTemplateNameUniquenessMetadata) {
    this.enforceTemplateNameUniquenessMetadata = enforceTemplateNameUniquenessMetadata;
  }

  public AccountSettingsInformation envelopeIntegrationAllowed(String envelopeIntegrationAllowed) {
    this.envelopeIntegrationAllowed = envelopeIntegrationAllowed;
    return this;
  }

   /**
   * 
   * @return envelopeIntegrationAllowed
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeIntegrationAllowed() {
    return envelopeIntegrationAllowed;
  }

  public void setEnvelopeIntegrationAllowed(String envelopeIntegrationAllowed) {
    this.envelopeIntegrationAllowed = envelopeIntegrationAllowed;
  }

  public AccountSettingsInformation envelopeIntegrationAllowedMetadata(SettingsMetadata envelopeIntegrationAllowedMetadata) {
    this.envelopeIntegrationAllowedMetadata = envelopeIntegrationAllowedMetadata;
    return this;
  }

   /**
   * Get envelopeIntegrationAllowedMetadata
   * @return envelopeIntegrationAllowedMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnvelopeIntegrationAllowedMetadata() {
    return envelopeIntegrationAllowedMetadata;
  }

  public void setEnvelopeIntegrationAllowedMetadata(SettingsMetadata envelopeIntegrationAllowedMetadata) {
    this.envelopeIntegrationAllowedMetadata = envelopeIntegrationAllowedMetadata;
  }

  public AccountSettingsInformation envelopeIntegrationEnabled(String envelopeIntegrationEnabled) {
    this.envelopeIntegrationEnabled = envelopeIntegrationEnabled;
    return this;
  }

   /**
   * 
   * @return envelopeIntegrationEnabled
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeIntegrationEnabled() {
    return envelopeIntegrationEnabled;
  }

  public void setEnvelopeIntegrationEnabled(String envelopeIntegrationEnabled) {
    this.envelopeIntegrationEnabled = envelopeIntegrationEnabled;
  }

  public AccountSettingsInformation envelopeIntegrationEnabledMetadata(SettingsMetadata envelopeIntegrationEnabledMetadata) {
    this.envelopeIntegrationEnabledMetadata = envelopeIntegrationEnabledMetadata;
    return this;
  }

   /**
   * Get envelopeIntegrationEnabledMetadata
   * @return envelopeIntegrationEnabledMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnvelopeIntegrationEnabledMetadata() {
    return envelopeIntegrationEnabledMetadata;
  }

  public void setEnvelopeIntegrationEnabledMetadata(SettingsMetadata envelopeIntegrationEnabledMetadata) {
    this.envelopeIntegrationEnabledMetadata = envelopeIntegrationEnabledMetadata;
  }

  public AccountSettingsInformation envelopeStampingDefaultValue(String envelopeStampingDefaultValue) {
    this.envelopeStampingDefaultValue = envelopeStampingDefaultValue;
    return this;
  }

   /**
   * 
   * @return envelopeStampingDefaultValue
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeStampingDefaultValue() {
    return envelopeStampingDefaultValue;
  }

  public void setEnvelopeStampingDefaultValue(String envelopeStampingDefaultValue) {
    this.envelopeStampingDefaultValue = envelopeStampingDefaultValue;
  }

  public AccountSettingsInformation envelopeStampingDefaultValueMetadata(SettingsMetadata envelopeStampingDefaultValueMetadata) {
    this.envelopeStampingDefaultValueMetadata = envelopeStampingDefaultValueMetadata;
    return this;
  }

   /**
   * Get envelopeStampingDefaultValueMetadata
   * @return envelopeStampingDefaultValueMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getEnvelopeStampingDefaultValueMetadata() {
    return envelopeStampingDefaultValueMetadata;
  }

  public void setEnvelopeStampingDefaultValueMetadata(SettingsMetadata envelopeStampingDefaultValueMetadata) {
    this.envelopeStampingDefaultValueMetadata = envelopeStampingDefaultValueMetadata;
  }

  public AccountSettingsInformation expressSend(String expressSend) {
    this.expressSend = expressSend;
    return this;
  }

   /**
   * 
   * @return expressSend
  **/
  @ApiModelProperty(value = "")
  public String getExpressSend() {
    return expressSend;
  }

  public void setExpressSend(String expressSend) {
    this.expressSend = expressSend;
  }

  public AccountSettingsInformation expressSendAllowTabs(String expressSendAllowTabs) {
    this.expressSendAllowTabs = expressSendAllowTabs;
    return this;
  }

   /**
   * 
   * @return expressSendAllowTabs
  **/
  @ApiModelProperty(value = "")
  public String getExpressSendAllowTabs() {
    return expressSendAllowTabs;
  }

  public void setExpressSendAllowTabs(String expressSendAllowTabs) {
    this.expressSendAllowTabs = expressSendAllowTabs;
  }

  public AccountSettingsInformation expressSendAllowTabsMetadata(SettingsMetadata expressSendAllowTabsMetadata) {
    this.expressSendAllowTabsMetadata = expressSendAllowTabsMetadata;
    return this;
  }

   /**
   * Get expressSendAllowTabsMetadata
   * @return expressSendAllowTabsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getExpressSendAllowTabsMetadata() {
    return expressSendAllowTabsMetadata;
  }

  public void setExpressSendAllowTabsMetadata(SettingsMetadata expressSendAllowTabsMetadata) {
    this.expressSendAllowTabsMetadata = expressSendAllowTabsMetadata;
  }

  public AccountSettingsInformation expressSendMetadata(SettingsMetadata expressSendMetadata) {
    this.expressSendMetadata = expressSendMetadata;
    return this;
  }

   /**
   * Get expressSendMetadata
   * @return expressSendMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getExpressSendMetadata() {
    return expressSendMetadata;
  }

  public void setExpressSendMetadata(SettingsMetadata expressSendMetadata) {
    this.expressSendMetadata = expressSendMetadata;
  }

  public AccountSettingsInformation externalDocumentSources(ExternalDocumentSources externalDocumentSources) {
    this.externalDocumentSources = externalDocumentSources;
    return this;
  }

   /**
   * Get externalDocumentSources
   * @return externalDocumentSources
  **/
  @ApiModelProperty(value = "")
  public ExternalDocumentSources getExternalDocumentSources() {
    return externalDocumentSources;
  }

  public void setExternalDocumentSources(ExternalDocumentSources externalDocumentSources) {
    this.externalDocumentSources = externalDocumentSources;
  }

  public AccountSettingsInformation externalSignaturePadType(String externalSignaturePadType) {
    this.externalSignaturePadType = externalSignaturePadType;
    return this;
  }

   /**
   * 
   * @return externalSignaturePadType
  **/
  @ApiModelProperty(value = "")
  public String getExternalSignaturePadType() {
    return externalSignaturePadType;
  }

  public void setExternalSignaturePadType(String externalSignaturePadType) {
    this.externalSignaturePadType = externalSignaturePadType;
  }

  public AccountSettingsInformation externalSignaturePadTypeMetadata(SettingsMetadata externalSignaturePadTypeMetadata) {
    this.externalSignaturePadTypeMetadata = externalSignaturePadTypeMetadata;
    return this;
  }

   /**
   * Get externalSignaturePadTypeMetadata
   * @return externalSignaturePadTypeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getExternalSignaturePadTypeMetadata() {
    return externalSignaturePadTypeMetadata;
  }

  public void setExternalSignaturePadTypeMetadata(SettingsMetadata externalSignaturePadTypeMetadata) {
    this.externalSignaturePadTypeMetadata = externalSignaturePadTypeMetadata;
  }

  public AccountSettingsInformation faxOutEnabled(String faxOutEnabled) {
    this.faxOutEnabled = faxOutEnabled;
    return this;
  }

   /**
   * 
   * @return faxOutEnabled
  **/
  @ApiModelProperty(value = "")
  public String getFaxOutEnabled() {
    return faxOutEnabled;
  }

  public void setFaxOutEnabled(String faxOutEnabled) {
    this.faxOutEnabled = faxOutEnabled;
  }

  public AccountSettingsInformation faxOutEnabledMetadata(SettingsMetadata faxOutEnabledMetadata) {
    this.faxOutEnabledMetadata = faxOutEnabledMetadata;
    return this;
  }

   /**
   * Get faxOutEnabledMetadata
   * @return faxOutEnabledMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getFaxOutEnabledMetadata() {
    return faxOutEnabledMetadata;
  }

  public void setFaxOutEnabledMetadata(SettingsMetadata faxOutEnabledMetadata) {
    this.faxOutEnabledMetadata = faxOutEnabledMetadata;
  }

  public AccountSettingsInformation guidedFormsHtmlAllowed(String guidedFormsHtmlAllowed) {
    this.guidedFormsHtmlAllowed = guidedFormsHtmlAllowed;
    return this;
  }

   /**
   * 
   * @return guidedFormsHtmlAllowed
  **/
  @ApiModelProperty(value = "")
  public String getGuidedFormsHtmlAllowed() {
    return guidedFormsHtmlAllowed;
  }

  public void setGuidedFormsHtmlAllowed(String guidedFormsHtmlAllowed) {
    this.guidedFormsHtmlAllowed = guidedFormsHtmlAllowed;
  }

  public AccountSettingsInformation guidedFormsHtmlAllowedMetadata(SettingsMetadata guidedFormsHtmlAllowedMetadata) {
    this.guidedFormsHtmlAllowedMetadata = guidedFormsHtmlAllowedMetadata;
    return this;
  }

   /**
   * Get guidedFormsHtmlAllowedMetadata
   * @return guidedFormsHtmlAllowedMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getGuidedFormsHtmlAllowedMetadata() {
    return guidedFormsHtmlAllowedMetadata;
  }

  public void setGuidedFormsHtmlAllowedMetadata(SettingsMetadata guidedFormsHtmlAllowedMetadata) {
    this.guidedFormsHtmlAllowedMetadata = guidedFormsHtmlAllowedMetadata;
  }

  public AccountSettingsInformation hideAccountAddressInCoC(String hideAccountAddressInCoC) {
    this.hideAccountAddressInCoC = hideAccountAddressInCoC;
    return this;
  }

   /**
   * 
   * @return hideAccountAddressInCoC
  **/
  @ApiModelProperty(value = "")
  public String getHideAccountAddressInCoC() {
    return hideAccountAddressInCoC;
  }

  public void setHideAccountAddressInCoC(String hideAccountAddressInCoC) {
    this.hideAccountAddressInCoC = hideAccountAddressInCoC;
  }

  public AccountSettingsInformation hideAccountAddressInCoCMetadata(SettingsMetadata hideAccountAddressInCoCMetadata) {
    this.hideAccountAddressInCoCMetadata = hideAccountAddressInCoCMetadata;
    return this;
  }

   /**
   * Get hideAccountAddressInCoCMetadata
   * @return hideAccountAddressInCoCMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getHideAccountAddressInCoCMetadata() {
    return hideAccountAddressInCoCMetadata;
  }

  public void setHideAccountAddressInCoCMetadata(SettingsMetadata hideAccountAddressInCoCMetadata) {
    this.hideAccountAddressInCoCMetadata = hideAccountAddressInCoCMetadata;
  }

  public AccountSettingsInformation hidePricing(String hidePricing) {
    this.hidePricing = hidePricing;
    return this;
  }

   /**
   * 
   * @return hidePricing
  **/
  @ApiModelProperty(value = "")
  public String getHidePricing() {
    return hidePricing;
  }

  public void setHidePricing(String hidePricing) {
    this.hidePricing = hidePricing;
  }

  public AccountSettingsInformation hidePricingMetadata(SettingsMetadata hidePricingMetadata) {
    this.hidePricingMetadata = hidePricingMetadata;
    return this;
  }

   /**
   * Get hidePricingMetadata
   * @return hidePricingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getHidePricingMetadata() {
    return hidePricingMetadata;
  }

  public void setHidePricingMetadata(SettingsMetadata hidePricingMetadata) {
    this.hidePricingMetadata = hidePricingMetadata;
  }

  public AccountSettingsInformation idCheckConfigurations(java.util.List<IdCheckConfiguration> idCheckConfigurations) {
    this.idCheckConfigurations = idCheckConfigurations;
    return this;
  }

  public AccountSettingsInformation addIdCheckConfigurationsItem(IdCheckConfiguration idCheckConfigurationsItem) {
    if (this.idCheckConfigurations == null) {
      this.idCheckConfigurations = new java.util.ArrayList<IdCheckConfiguration>();
    }
    this.idCheckConfigurations.add(idCheckConfigurationsItem);
    return this;
  }

   /**
   * 
   * @return idCheckConfigurations
  **/
  @ApiModelProperty(value = "")
  public java.util.List<IdCheckConfiguration> getIdCheckConfigurations() {
    return idCheckConfigurations;
  }

  public void setIdCheckConfigurations(java.util.List<IdCheckConfiguration> idCheckConfigurations) {
    this.idCheckConfigurations = idCheckConfigurations;
  }

  public AccountSettingsInformation idCheckExpire(String idCheckExpire) {
    this.idCheckExpire = idCheckExpire;
    return this;
  }

   /**
   * 
   * @return idCheckExpire
  **/
  @ApiModelProperty(value = "")
  public String getIdCheckExpire() {
    return idCheckExpire;
  }

  public void setIdCheckExpire(String idCheckExpire) {
    this.idCheckExpire = idCheckExpire;
  }

  public AccountSettingsInformation idCheckExpireDays(String idCheckExpireDays) {
    this.idCheckExpireDays = idCheckExpireDays;
    return this;
  }

   /**
   * 
   * @return idCheckExpireDays
  **/
  @ApiModelProperty(value = "")
  public String getIdCheckExpireDays() {
    return idCheckExpireDays;
  }

  public void setIdCheckExpireDays(String idCheckExpireDays) {
    this.idCheckExpireDays = idCheckExpireDays;
  }

  public AccountSettingsInformation idCheckExpireDaysMetadata(SettingsMetadata idCheckExpireDaysMetadata) {
    this.idCheckExpireDaysMetadata = idCheckExpireDaysMetadata;
    return this;
  }

   /**
   * Get idCheckExpireDaysMetadata
   * @return idCheckExpireDaysMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getIdCheckExpireDaysMetadata() {
    return idCheckExpireDaysMetadata;
  }

  public void setIdCheckExpireDaysMetadata(SettingsMetadata idCheckExpireDaysMetadata) {
    this.idCheckExpireDaysMetadata = idCheckExpireDaysMetadata;
  }

  public AccountSettingsInformation idCheckExpireMetadata(SettingsMetadata idCheckExpireMetadata) {
    this.idCheckExpireMetadata = idCheckExpireMetadata;
    return this;
  }

   /**
   * Get idCheckExpireMetadata
   * @return idCheckExpireMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getIdCheckExpireMetadata() {
    return idCheckExpireMetadata;
  }

  public void setIdCheckExpireMetadata(SettingsMetadata idCheckExpireMetadata) {
    this.idCheckExpireMetadata = idCheckExpireMetadata;
  }

  public AccountSettingsInformation idCheckExpireMinutes(String idCheckExpireMinutes) {
    this.idCheckExpireMinutes = idCheckExpireMinutes;
    return this;
  }

   /**
   * 
   * @return idCheckExpireMinutes
  **/
  @ApiModelProperty(value = "")
  public String getIdCheckExpireMinutes() {
    return idCheckExpireMinutes;
  }

  public void setIdCheckExpireMinutes(String idCheckExpireMinutes) {
    this.idCheckExpireMinutes = idCheckExpireMinutes;
  }

  public AccountSettingsInformation idCheckExpireMinutesMetadata(SettingsMetadata idCheckExpireMinutesMetadata) {
    this.idCheckExpireMinutesMetadata = idCheckExpireMinutesMetadata;
    return this;
  }

   /**
   * Get idCheckExpireMinutesMetadata
   * @return idCheckExpireMinutesMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getIdCheckExpireMinutesMetadata() {
    return idCheckExpireMinutesMetadata;
  }

  public void setIdCheckExpireMinutesMetadata(SettingsMetadata idCheckExpireMinutesMetadata) {
    this.idCheckExpireMinutesMetadata = idCheckExpireMinutesMetadata;
  }

  public AccountSettingsInformation idCheckRequired(String idCheckRequired) {
    this.idCheckRequired = idCheckRequired;
    return this;
  }

   /**
   * 
   * @return idCheckRequired
  **/
  @ApiModelProperty(value = "")
  public String getIdCheckRequired() {
    return idCheckRequired;
  }

  public void setIdCheckRequired(String idCheckRequired) {
    this.idCheckRequired = idCheckRequired;
  }

  public AccountSettingsInformation idCheckRequiredMetadata(SettingsMetadata idCheckRequiredMetadata) {
    this.idCheckRequiredMetadata = idCheckRequiredMetadata;
    return this;
  }

   /**
   * Get idCheckRequiredMetadata
   * @return idCheckRequiredMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getIdCheckRequiredMetadata() {
    return idCheckRequiredMetadata;
  }

  public void setIdCheckRequiredMetadata(SettingsMetadata idCheckRequiredMetadata) {
    this.idCheckRequiredMetadata = idCheckRequiredMetadata;
  }

  public AccountSettingsInformation identityVerification(java.util.List<AccountIdentityVerificationWorkflow> identityVerification) {
    this.identityVerification = identityVerification;
    return this;
  }

  public AccountSettingsInformation addIdentityVerificationItem(AccountIdentityVerificationWorkflow identityVerificationItem) {
    if (this.identityVerification == null) {
      this.identityVerification = new java.util.ArrayList<AccountIdentityVerificationWorkflow>();
    }
    this.identityVerification.add(identityVerificationItem);
    return this;
  }

   /**
   * 
   * @return identityVerification
  **/
  @ApiModelProperty(value = "")
  public java.util.List<AccountIdentityVerificationWorkflow> getIdentityVerification() {
    return identityVerification;
  }

  public void setIdentityVerification(java.util.List<AccountIdentityVerificationWorkflow> identityVerification) {
    this.identityVerification = identityVerification;
  }

  public AccountSettingsInformation identityVerificationMetadata(SettingsMetadata identityVerificationMetadata) {
    this.identityVerificationMetadata = identityVerificationMetadata;
    return this;
  }

   /**
   * Get identityVerificationMetadata
   * @return identityVerificationMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getIdentityVerificationMetadata() {
    return identityVerificationMetadata;
  }

  public void setIdentityVerificationMetadata(SettingsMetadata identityVerificationMetadata) {
    this.identityVerificationMetadata = identityVerificationMetadata;
  }

  public AccountSettingsInformation ignoreErrorIfAnchorTabNotFound(String ignoreErrorIfAnchorTabNotFound) {
    this.ignoreErrorIfAnchorTabNotFound = ignoreErrorIfAnchorTabNotFound;
    return this;
  }

   /**
   * 
   * @return ignoreErrorIfAnchorTabNotFound
  **/
  @ApiModelProperty(value = "")
  public String getIgnoreErrorIfAnchorTabNotFound() {
    return ignoreErrorIfAnchorTabNotFound;
  }

  public void setIgnoreErrorIfAnchorTabNotFound(String ignoreErrorIfAnchorTabNotFound) {
    this.ignoreErrorIfAnchorTabNotFound = ignoreErrorIfAnchorTabNotFound;
  }

  public AccountSettingsInformation ignoreErrorIfAnchorTabNotFoundMetadataEnabled(SettingsMetadata ignoreErrorIfAnchorTabNotFoundMetadataEnabled) {
    this.ignoreErrorIfAnchorTabNotFoundMetadataEnabled = ignoreErrorIfAnchorTabNotFoundMetadataEnabled;
    return this;
  }

   /**
   * Get ignoreErrorIfAnchorTabNotFoundMetadataEnabled
   * @return ignoreErrorIfAnchorTabNotFoundMetadataEnabled
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getIgnoreErrorIfAnchorTabNotFoundMetadataEnabled() {
    return ignoreErrorIfAnchorTabNotFoundMetadataEnabled;
  }

  public void setIgnoreErrorIfAnchorTabNotFoundMetadataEnabled(SettingsMetadata ignoreErrorIfAnchorTabNotFoundMetadataEnabled) {
    this.ignoreErrorIfAnchorTabNotFoundMetadataEnabled = ignoreErrorIfAnchorTabNotFoundMetadataEnabled;
  }

  public AccountSettingsInformation inPersonIDCheckQuestion(String inPersonIDCheckQuestion) {
    this.inPersonIDCheckQuestion = inPersonIDCheckQuestion;
    return this;
  }

   /**
   * 
   * @return inPersonIDCheckQuestion
  **/
  @ApiModelProperty(value = "")
  public String getInPersonIDCheckQuestion() {
    return inPersonIDCheckQuestion;
  }

  public void setInPersonIDCheckQuestion(String inPersonIDCheckQuestion) {
    this.inPersonIDCheckQuestion = inPersonIDCheckQuestion;
  }

  public AccountSettingsInformation inPersonIDCheckQuestionMetadata(SettingsMetadata inPersonIDCheckQuestionMetadata) {
    this.inPersonIDCheckQuestionMetadata = inPersonIDCheckQuestionMetadata;
    return this;
  }

   /**
   * Get inPersonIDCheckQuestionMetadata
   * @return inPersonIDCheckQuestionMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getInPersonIDCheckQuestionMetadata() {
    return inPersonIDCheckQuestionMetadata;
  }

  public void setInPersonIDCheckQuestionMetadata(SettingsMetadata inPersonIDCheckQuestionMetadata) {
    this.inPersonIDCheckQuestionMetadata = inPersonIDCheckQuestionMetadata;
  }

  public AccountSettingsInformation inPersonSigningEnabled(String inPersonSigningEnabled) {
    this.inPersonSigningEnabled = inPersonSigningEnabled;
    return this;
  }

   /**
   * 
   * @return inPersonSigningEnabled
  **/
  @ApiModelProperty(value = "")
  public String getInPersonSigningEnabled() {
    return inPersonSigningEnabled;
  }

  public void setInPersonSigningEnabled(String inPersonSigningEnabled) {
    this.inPersonSigningEnabled = inPersonSigningEnabled;
  }

  public AccountSettingsInformation inPersonSigningEnabledMetadata(SettingsMetadata inPersonSigningEnabledMetadata) {
    this.inPersonSigningEnabledMetadata = inPersonSigningEnabledMetadata;
    return this;
  }

   /**
   * Get inPersonSigningEnabledMetadata
   * @return inPersonSigningEnabledMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getInPersonSigningEnabledMetadata() {
    return inPersonSigningEnabledMetadata;
  }

  public void setInPersonSigningEnabledMetadata(SettingsMetadata inPersonSigningEnabledMetadata) {
    this.inPersonSigningEnabledMetadata = inPersonSigningEnabledMetadata;
  }

  public AccountSettingsInformation inSessionEnabled(String inSessionEnabled) {
    this.inSessionEnabled = inSessionEnabled;
    return this;
  }

   /**
   * 
   * @return inSessionEnabled
  **/
  @ApiModelProperty(value = "")
  public String getInSessionEnabled() {
    return inSessionEnabled;
  }

  public void setInSessionEnabled(String inSessionEnabled) {
    this.inSessionEnabled = inSessionEnabled;
  }

  public AccountSettingsInformation inSessionEnabledMetadata(SettingsMetadata inSessionEnabledMetadata) {
    this.inSessionEnabledMetadata = inSessionEnabledMetadata;
    return this;
  }

   /**
   * Get inSessionEnabledMetadata
   * @return inSessionEnabledMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getInSessionEnabledMetadata() {
    return inSessionEnabledMetadata;
  }

  public void setInSessionEnabledMetadata(SettingsMetadata inSessionEnabledMetadata) {
    this.inSessionEnabledMetadata = inSessionEnabledMetadata;
  }

  public AccountSettingsInformation inSessionSuppressEmails(String inSessionSuppressEmails) {
    this.inSessionSuppressEmails = inSessionSuppressEmails;
    return this;
  }

   /**
   * 
   * @return inSessionSuppressEmails
  **/
  @ApiModelProperty(value = "")
  public String getInSessionSuppressEmails() {
    return inSessionSuppressEmails;
  }

  public void setInSessionSuppressEmails(String inSessionSuppressEmails) {
    this.inSessionSuppressEmails = inSessionSuppressEmails;
  }

  public AccountSettingsInformation inSessionSuppressEmailsMetadata(SettingsMetadata inSessionSuppressEmailsMetadata) {
    this.inSessionSuppressEmailsMetadata = inSessionSuppressEmailsMetadata;
    return this;
  }

   /**
   * Get inSessionSuppressEmailsMetadata
   * @return inSessionSuppressEmailsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getInSessionSuppressEmailsMetadata() {
    return inSessionSuppressEmailsMetadata;
  }

  public void setInSessionSuppressEmailsMetadata(SettingsMetadata inSessionSuppressEmailsMetadata) {
    this.inSessionSuppressEmailsMetadata = inSessionSuppressEmailsMetadata;
  }

  public AccountSettingsInformation maximumSigningGroups(String maximumSigningGroups) {
    this.maximumSigningGroups = maximumSigningGroups;
    return this;
  }

   /**
   * 
   * @return maximumSigningGroups
  **/
  @ApiModelProperty(value = "")
  public String getMaximumSigningGroups() {
    return maximumSigningGroups;
  }

  public void setMaximumSigningGroups(String maximumSigningGroups) {
    this.maximumSigningGroups = maximumSigningGroups;
  }

  public AccountSettingsInformation maximumSigningGroupsMetadata(SettingsMetadata maximumSigningGroupsMetadata) {
    this.maximumSigningGroupsMetadata = maximumSigningGroupsMetadata;
    return this;
  }

   /**
   * Get maximumSigningGroupsMetadata
   * @return maximumSigningGroupsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getMaximumSigningGroupsMetadata() {
    return maximumSigningGroupsMetadata;
  }

  public void setMaximumSigningGroupsMetadata(SettingsMetadata maximumSigningGroupsMetadata) {
    this.maximumSigningGroupsMetadata = maximumSigningGroupsMetadata;
  }

  public AccountSettingsInformation maximumUsersPerSigningGroup(String maximumUsersPerSigningGroup) {
    this.maximumUsersPerSigningGroup = maximumUsersPerSigningGroup;
    return this;
  }

   /**
   * 
   * @return maximumUsersPerSigningGroup
  **/
  @ApiModelProperty(value = "")
  public String getMaximumUsersPerSigningGroup() {
    return maximumUsersPerSigningGroup;
  }

  public void setMaximumUsersPerSigningGroup(String maximumUsersPerSigningGroup) {
    this.maximumUsersPerSigningGroup = maximumUsersPerSigningGroup;
  }

  public AccountSettingsInformation maximumUsersPerSigningGroupMetadata(SettingsMetadata maximumUsersPerSigningGroupMetadata) {
    this.maximumUsersPerSigningGroupMetadata = maximumUsersPerSigningGroupMetadata;
    return this;
  }

   /**
   * Get maximumUsersPerSigningGroupMetadata
   * @return maximumUsersPerSigningGroupMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getMaximumUsersPerSigningGroupMetadata() {
    return maximumUsersPerSigningGroupMetadata;
  }

  public void setMaximumUsersPerSigningGroupMetadata(SettingsMetadata maximumUsersPerSigningGroupMetadata) {
    this.maximumUsersPerSigningGroupMetadata = maximumUsersPerSigningGroupMetadata;
  }

  public AccountSettingsInformation maxNumberOfCustomStamps(String maxNumberOfCustomStamps) {
    this.maxNumberOfCustomStamps = maxNumberOfCustomStamps;
    return this;
  }

   /**
   * 
   * @return maxNumberOfCustomStamps
  **/
  @ApiModelProperty(value = "")
  public String getMaxNumberOfCustomStamps() {
    return maxNumberOfCustomStamps;
  }

  public void setMaxNumberOfCustomStamps(String maxNumberOfCustomStamps) {
    this.maxNumberOfCustomStamps = maxNumberOfCustomStamps;
  }

  public AccountSettingsInformation mobileSessionTimeout(String mobileSessionTimeout) {
    this.mobileSessionTimeout = mobileSessionTimeout;
    return this;
  }

   /**
   * 
   * @return mobileSessionTimeout
  **/
  @ApiModelProperty(value = "")
  public String getMobileSessionTimeout() {
    return mobileSessionTimeout;
  }

  public void setMobileSessionTimeout(String mobileSessionTimeout) {
    this.mobileSessionTimeout = mobileSessionTimeout;
  }

  public AccountSettingsInformation mobileSessionTimeoutMetadata(SettingsMetadata mobileSessionTimeoutMetadata) {
    this.mobileSessionTimeoutMetadata = mobileSessionTimeoutMetadata;
    return this;
  }

   /**
   * Get mobileSessionTimeoutMetadata
   * @return mobileSessionTimeoutMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getMobileSessionTimeoutMetadata() {
    return mobileSessionTimeoutMetadata;
  }

  public void setMobileSessionTimeoutMetadata(SettingsMetadata mobileSessionTimeoutMetadata) {
    this.mobileSessionTimeoutMetadata = mobileSessionTimeoutMetadata;
  }

  public AccountSettingsInformation numberOfActiveCustomStamps(String numberOfActiveCustomStamps) {
    this.numberOfActiveCustomStamps = numberOfActiveCustomStamps;
    return this;
  }

   /**
   * 
   * @return numberOfActiveCustomStamps
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfActiveCustomStamps() {
    return numberOfActiveCustomStamps;
  }

  public void setNumberOfActiveCustomStamps(String numberOfActiveCustomStamps) {
    this.numberOfActiveCustomStamps = numberOfActiveCustomStamps;
  }

  public AccountSettingsInformation optInMobileSigningV02(String optInMobileSigningV02) {
    this.optInMobileSigningV02 = optInMobileSigningV02;
    return this;
  }

   /**
   * 
   * @return optInMobileSigningV02
  **/
  @ApiModelProperty(value = "")
  public String getOptInMobileSigningV02() {
    return optInMobileSigningV02;
  }

  public void setOptInMobileSigningV02(String optInMobileSigningV02) {
    this.optInMobileSigningV02 = optInMobileSigningV02;
  }

  public AccountSettingsInformation optInMobileSigningV02Metadata(SettingsMetadata optInMobileSigningV02Metadata) {
    this.optInMobileSigningV02Metadata = optInMobileSigningV02Metadata;
    return this;
  }

   /**
   * Get optInMobileSigningV02Metadata
   * @return optInMobileSigningV02Metadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getOptInMobileSigningV02Metadata() {
    return optInMobileSigningV02Metadata;
  }

  public void setOptInMobileSigningV02Metadata(SettingsMetadata optInMobileSigningV02Metadata) {
    this.optInMobileSigningV02Metadata = optInMobileSigningV02Metadata;
  }

  public AccountSettingsInformation optOutAutoNavTextAndTabColorUpdates(String optOutAutoNavTextAndTabColorUpdates) {
    this.optOutAutoNavTextAndTabColorUpdates = optOutAutoNavTextAndTabColorUpdates;
    return this;
  }

   /**
   * 
   * @return optOutAutoNavTextAndTabColorUpdates
  **/
  @ApiModelProperty(value = "")
  public String getOptOutAutoNavTextAndTabColorUpdates() {
    return optOutAutoNavTextAndTabColorUpdates;
  }

  public void setOptOutAutoNavTextAndTabColorUpdates(String optOutAutoNavTextAndTabColorUpdates) {
    this.optOutAutoNavTextAndTabColorUpdates = optOutAutoNavTextAndTabColorUpdates;
  }

  public AccountSettingsInformation optOutAutoNavTextAndTabColorUpdatesMetadata(SettingsMetadata optOutAutoNavTextAndTabColorUpdatesMetadata) {
    this.optOutAutoNavTextAndTabColorUpdatesMetadata = optOutAutoNavTextAndTabColorUpdatesMetadata;
    return this;
  }

   /**
   * Get optOutAutoNavTextAndTabColorUpdatesMetadata
   * @return optOutAutoNavTextAndTabColorUpdatesMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getOptOutAutoNavTextAndTabColorUpdatesMetadata() {
    return optOutAutoNavTextAndTabColorUpdatesMetadata;
  }

  public void setOptOutAutoNavTextAndTabColorUpdatesMetadata(SettingsMetadata optOutAutoNavTextAndTabColorUpdatesMetadata) {
    this.optOutAutoNavTextAndTabColorUpdatesMetadata = optOutAutoNavTextAndTabColorUpdatesMetadata;
  }

  public AccountSettingsInformation optOutNewPlatformSeal(String optOutNewPlatformSeal) {
    this.optOutNewPlatformSeal = optOutNewPlatformSeal;
    return this;
  }

   /**
   * 
   * @return optOutNewPlatformSeal
  **/
  @ApiModelProperty(value = "")
  public String getOptOutNewPlatformSeal() {
    return optOutNewPlatformSeal;
  }

  public void setOptOutNewPlatformSeal(String optOutNewPlatformSeal) {
    this.optOutNewPlatformSeal = optOutNewPlatformSeal;
  }

  public AccountSettingsInformation optOutNewPlatformSealPlatformMetadata(SettingsMetadata optOutNewPlatformSealPlatformMetadata) {
    this.optOutNewPlatformSealPlatformMetadata = optOutNewPlatformSealPlatformMetadata;
    return this;
  }

   /**
   * Get optOutNewPlatformSealPlatformMetadata
   * @return optOutNewPlatformSealPlatformMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getOptOutNewPlatformSealPlatformMetadata() {
    return optOutNewPlatformSealPlatformMetadata;
  }

  public void setOptOutNewPlatformSealPlatformMetadata(SettingsMetadata optOutNewPlatformSealPlatformMetadata) {
    this.optOutNewPlatformSealPlatformMetadata = optOutNewPlatformSealPlatformMetadata;
  }

  public AccountSettingsInformation phoneAuthRecipientMayProvidePhoneNumber(String phoneAuthRecipientMayProvidePhoneNumber) {
    this.phoneAuthRecipientMayProvidePhoneNumber = phoneAuthRecipientMayProvidePhoneNumber;
    return this;
  }

   /**
   * 
   * @return phoneAuthRecipientMayProvidePhoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneAuthRecipientMayProvidePhoneNumber() {
    return phoneAuthRecipientMayProvidePhoneNumber;
  }

  public void setPhoneAuthRecipientMayProvidePhoneNumber(String phoneAuthRecipientMayProvidePhoneNumber) {
    this.phoneAuthRecipientMayProvidePhoneNumber = phoneAuthRecipientMayProvidePhoneNumber;
  }

  public AccountSettingsInformation phoneAuthRecipientMayProvidePhoneNumberMetadata(SettingsMetadata phoneAuthRecipientMayProvidePhoneNumberMetadata) {
    this.phoneAuthRecipientMayProvidePhoneNumberMetadata = phoneAuthRecipientMayProvidePhoneNumberMetadata;
    return this;
  }

   /**
   * Get phoneAuthRecipientMayProvidePhoneNumberMetadata
   * @return phoneAuthRecipientMayProvidePhoneNumberMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getPhoneAuthRecipientMayProvidePhoneNumberMetadata() {
    return phoneAuthRecipientMayProvidePhoneNumberMetadata;
  }

  public void setPhoneAuthRecipientMayProvidePhoneNumberMetadata(SettingsMetadata phoneAuthRecipientMayProvidePhoneNumberMetadata) {
    this.phoneAuthRecipientMayProvidePhoneNumberMetadata = phoneAuthRecipientMayProvidePhoneNumberMetadata;
  }

  public AccountSettingsInformation pkiSignDownloadedPDFDocs(String pkiSignDownloadedPDFDocs) {
    this.pkiSignDownloadedPDFDocs = pkiSignDownloadedPDFDocs;
    return this;
  }

   /**
   * 
   * @return pkiSignDownloadedPDFDocs
  **/
  @ApiModelProperty(value = "")
  public String getPkiSignDownloadedPDFDocs() {
    return pkiSignDownloadedPDFDocs;
  }

  public void setPkiSignDownloadedPDFDocs(String pkiSignDownloadedPDFDocs) {
    this.pkiSignDownloadedPDFDocs = pkiSignDownloadedPDFDocs;
  }

  public AccountSettingsInformation pkiSignDownloadedPDFDocsMetadata(SettingsMetadata pkiSignDownloadedPDFDocsMetadata) {
    this.pkiSignDownloadedPDFDocsMetadata = pkiSignDownloadedPDFDocsMetadata;
    return this;
  }

   /**
   * Get pkiSignDownloadedPDFDocsMetadata
   * @return pkiSignDownloadedPDFDocsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getPkiSignDownloadedPDFDocsMetadata() {
    return pkiSignDownloadedPDFDocsMetadata;
  }

  public void setPkiSignDownloadedPDFDocsMetadata(SettingsMetadata pkiSignDownloadedPDFDocsMetadata) {
    this.pkiSignDownloadedPDFDocsMetadata = pkiSignDownloadedPDFDocsMetadata;
  }

  public AccountSettingsInformation recipientsCanSignOffline(String recipientsCanSignOffline) {
    this.recipientsCanSignOffline = recipientsCanSignOffline;
    return this;
  }

   /**
   * 
   * @return recipientsCanSignOffline
  **/
  @ApiModelProperty(value = "")
  public String getRecipientsCanSignOffline() {
    return recipientsCanSignOffline;
  }

  public void setRecipientsCanSignOffline(String recipientsCanSignOffline) {
    this.recipientsCanSignOffline = recipientsCanSignOffline;
  }

  public AccountSettingsInformation recipientsCanSignOfflineMetadata(SettingsMetadata recipientsCanSignOfflineMetadata) {
    this.recipientsCanSignOfflineMetadata = recipientsCanSignOfflineMetadata;
    return this;
  }

   /**
   * Get recipientsCanSignOfflineMetadata
   * @return recipientsCanSignOfflineMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getRecipientsCanSignOfflineMetadata() {
    return recipientsCanSignOfflineMetadata;
  }

  public void setRecipientsCanSignOfflineMetadata(SettingsMetadata recipientsCanSignOfflineMetadata) {
    this.recipientsCanSignOfflineMetadata = recipientsCanSignOfflineMetadata;
  }

  public AccountSettingsInformation recipientSigningAutoNavigationControl(String recipientSigningAutoNavigationControl) {
    this.recipientSigningAutoNavigationControl = recipientSigningAutoNavigationControl;
    return this;
  }

   /**
   * 
   * @return recipientSigningAutoNavigationControl
  **/
  @ApiModelProperty(value = "")
  public String getRecipientSigningAutoNavigationControl() {
    return recipientSigningAutoNavigationControl;
  }

  public void setRecipientSigningAutoNavigationControl(String recipientSigningAutoNavigationControl) {
    this.recipientSigningAutoNavigationControl = recipientSigningAutoNavigationControl;
  }

  public AccountSettingsInformation recipientSigningAutoNavigationControlMetadata(SettingsMetadata recipientSigningAutoNavigationControlMetadata) {
    this.recipientSigningAutoNavigationControlMetadata = recipientSigningAutoNavigationControlMetadata;
    return this;
  }

   /**
   * Get recipientSigningAutoNavigationControlMetadata
   * @return recipientSigningAutoNavigationControlMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getRecipientSigningAutoNavigationControlMetadata() {
    return recipientSigningAutoNavigationControlMetadata;
  }

  public void setRecipientSigningAutoNavigationControlMetadata(SettingsMetadata recipientSigningAutoNavigationControlMetadata) {
    this.recipientSigningAutoNavigationControlMetadata = recipientSigningAutoNavigationControlMetadata;
  }

  public AccountSettingsInformation require21CFRpt11Compliance(String require21CFRpt11Compliance) {
    this.require21CFRpt11Compliance = require21CFRpt11Compliance;
    return this;
  }

   /**
   * 
   * @return require21CFRpt11Compliance
  **/
  @ApiModelProperty(value = "")
  public String getRequire21CFRpt11Compliance() {
    return require21CFRpt11Compliance;
  }

  public void setRequire21CFRpt11Compliance(String require21CFRpt11Compliance) {
    this.require21CFRpt11Compliance = require21CFRpt11Compliance;
  }

  public AccountSettingsInformation require21CFRpt11ComplianceMetadata(SettingsMetadata require21CFRpt11ComplianceMetadata) {
    this.require21CFRpt11ComplianceMetadata = require21CFRpt11ComplianceMetadata;
    return this;
  }

   /**
   * Get require21CFRpt11ComplianceMetadata
   * @return require21CFRpt11ComplianceMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getRequire21CFRpt11ComplianceMetadata() {
    return require21CFRpt11ComplianceMetadata;
  }

  public void setRequire21CFRpt11ComplianceMetadata(SettingsMetadata require21CFRpt11ComplianceMetadata) {
    this.require21CFRpt11ComplianceMetadata = require21CFRpt11ComplianceMetadata;
  }

  public AccountSettingsInformation requireDeclineReason(String requireDeclineReason) {
    this.requireDeclineReason = requireDeclineReason;
    return this;
  }

   /**
   * 
   * @return requireDeclineReason
  **/
  @ApiModelProperty(value = "")
  public String getRequireDeclineReason() {
    return requireDeclineReason;
  }

  public void setRequireDeclineReason(String requireDeclineReason) {
    this.requireDeclineReason = requireDeclineReason;
  }

  public AccountSettingsInformation requireDeclineReasonMetadata(SettingsMetadata requireDeclineReasonMetadata) {
    this.requireDeclineReasonMetadata = requireDeclineReasonMetadata;
    return this;
  }

   /**
   * Get requireDeclineReasonMetadata
   * @return requireDeclineReasonMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getRequireDeclineReasonMetadata() {
    return requireDeclineReasonMetadata;
  }

  public void setRequireDeclineReasonMetadata(SettingsMetadata requireDeclineReasonMetadata) {
    this.requireDeclineReasonMetadata = requireDeclineReasonMetadata;
  }

  public AccountSettingsInformation requireExternalUserManagement(String requireExternalUserManagement) {
    this.requireExternalUserManagement = requireExternalUserManagement;
    return this;
  }

   /**
   * 
   * @return requireExternalUserManagement
  **/
  @ApiModelProperty(value = "")
  public String getRequireExternalUserManagement() {
    return requireExternalUserManagement;
  }

  public void setRequireExternalUserManagement(String requireExternalUserManagement) {
    this.requireExternalUserManagement = requireExternalUserManagement;
  }

  public AccountSettingsInformation requireExternalUserManagementMetadata(SettingsMetadata requireExternalUserManagementMetadata) {
    this.requireExternalUserManagementMetadata = requireExternalUserManagementMetadata;
    return this;
  }

   /**
   * Get requireExternalUserManagementMetadata
   * @return requireExternalUserManagementMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getRequireExternalUserManagementMetadata() {
    return requireExternalUserManagementMetadata;
  }

  public void setRequireExternalUserManagementMetadata(SettingsMetadata requireExternalUserManagementMetadata) {
    this.requireExternalUserManagementMetadata = requireExternalUserManagementMetadata;
  }

  public AccountSettingsInformation requireSignerCertificateType(String requireSignerCertificateType) {
    this.requireSignerCertificateType = requireSignerCertificateType;
    return this;
  }

   /**
   * 
   * @return requireSignerCertificateType
  **/
  @ApiModelProperty(value = "")
  public String getRequireSignerCertificateType() {
    return requireSignerCertificateType;
  }

  public void setRequireSignerCertificateType(String requireSignerCertificateType) {
    this.requireSignerCertificateType = requireSignerCertificateType;
  }

  public AccountSettingsInformation requireSignerCertificateTypeMetadata(SettingsMetadata requireSignerCertificateTypeMetadata) {
    this.requireSignerCertificateTypeMetadata = requireSignerCertificateTypeMetadata;
    return this;
  }

   /**
   * Get requireSignerCertificateTypeMetadata
   * @return requireSignerCertificateTypeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getRequireSignerCertificateTypeMetadata() {
    return requireSignerCertificateTypeMetadata;
  }

  public void setRequireSignerCertificateTypeMetadata(SettingsMetadata requireSignerCertificateTypeMetadata) {
    this.requireSignerCertificateTypeMetadata = requireSignerCertificateTypeMetadata;
  }

  public AccountSettingsInformation rsaVeridAccountName(String rsaVeridAccountName) {
    this.rsaVeridAccountName = rsaVeridAccountName;
    return this;
  }

   /**
   * 
   * @return rsaVeridAccountName
  **/
  @ApiModelProperty(value = "")
  public String getRsaVeridAccountName() {
    return rsaVeridAccountName;
  }

  public void setRsaVeridAccountName(String rsaVeridAccountName) {
    this.rsaVeridAccountName = rsaVeridAccountName;
  }

  public AccountSettingsInformation rsaVeridPassword(String rsaVeridPassword) {
    this.rsaVeridPassword = rsaVeridPassword;
    return this;
  }

   /**
   * 
   * @return rsaVeridPassword
  **/
  @ApiModelProperty(value = "")
  public String getRsaVeridPassword() {
    return rsaVeridPassword;
  }

  public void setRsaVeridPassword(String rsaVeridPassword) {
    this.rsaVeridPassword = rsaVeridPassword;
  }

  public AccountSettingsInformation rsaVeridRuleset(String rsaVeridRuleset) {
    this.rsaVeridRuleset = rsaVeridRuleset;
    return this;
  }

   /**
   * 
   * @return rsaVeridRuleset
  **/
  @ApiModelProperty(value = "")
  public String getRsaVeridRuleset() {
    return rsaVeridRuleset;
  }

  public void setRsaVeridRuleset(String rsaVeridRuleset) {
    this.rsaVeridRuleset = rsaVeridRuleset;
  }

  public AccountSettingsInformation rsaVeridUserId(String rsaVeridUserId) {
    this.rsaVeridUserId = rsaVeridUserId;
    return this;
  }

   /**
   * 
   * @return rsaVeridUserId
  **/
  @ApiModelProperty(value = "")
  public String getRsaVeridUserId() {
    return rsaVeridUserId;
  }

  public void setRsaVeridUserId(String rsaVeridUserId) {
    this.rsaVeridUserId = rsaVeridUserId;
  }

  public AccountSettingsInformation selfSignedRecipientEmailDocument(String selfSignedRecipientEmailDocument) {
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

  public AccountSettingsInformation selfSignedRecipientEmailDocumentMetadata(SettingsMetadata selfSignedRecipientEmailDocumentMetadata) {
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

  public AccountSettingsInformation selfSignedRecipientEmailDocumentUserOverride(String selfSignedRecipientEmailDocumentUserOverride) {
    this.selfSignedRecipientEmailDocumentUserOverride = selfSignedRecipientEmailDocumentUserOverride;
    return this;
  }

   /**
   * 
   * @return selfSignedRecipientEmailDocumentUserOverride
  **/
  @ApiModelProperty(value = "")
  public String getSelfSignedRecipientEmailDocumentUserOverride() {
    return selfSignedRecipientEmailDocumentUserOverride;
  }

  public void setSelfSignedRecipientEmailDocumentUserOverride(String selfSignedRecipientEmailDocumentUserOverride) {
    this.selfSignedRecipientEmailDocumentUserOverride = selfSignedRecipientEmailDocumentUserOverride;
  }

  public AccountSettingsInformation selfSignedRecipientEmailDocumentUserOverrideMetadata(SettingsMetadata selfSignedRecipientEmailDocumentUserOverrideMetadata) {
    this.selfSignedRecipientEmailDocumentUserOverrideMetadata = selfSignedRecipientEmailDocumentUserOverrideMetadata;
    return this;
  }

   /**
   * Get selfSignedRecipientEmailDocumentUserOverrideMetadata
   * @return selfSignedRecipientEmailDocumentUserOverrideMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSelfSignedRecipientEmailDocumentUserOverrideMetadata() {
    return selfSignedRecipientEmailDocumentUserOverrideMetadata;
  }

  public void setSelfSignedRecipientEmailDocumentUserOverrideMetadata(SettingsMetadata selfSignedRecipientEmailDocumentUserOverrideMetadata) {
    this.selfSignedRecipientEmailDocumentUserOverrideMetadata = selfSignedRecipientEmailDocumentUserOverrideMetadata;
  }

  public AccountSettingsInformation senderCanSignInEachLocation(String senderCanSignInEachLocation) {
    this.senderCanSignInEachLocation = senderCanSignInEachLocation;
    return this;
  }

   /**
   * 
   * @return senderCanSignInEachLocation
  **/
  @ApiModelProperty(value = "")
  public String getSenderCanSignInEachLocation() {
    return senderCanSignInEachLocation;
  }

  public void setSenderCanSignInEachLocation(String senderCanSignInEachLocation) {
    this.senderCanSignInEachLocation = senderCanSignInEachLocation;
  }

  public AccountSettingsInformation senderCanSignInEachLocationMetadata(SettingsMetadata senderCanSignInEachLocationMetadata) {
    this.senderCanSignInEachLocationMetadata = senderCanSignInEachLocationMetadata;
    return this;
  }

   /**
   * Get senderCanSignInEachLocationMetadata
   * @return senderCanSignInEachLocationMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSenderCanSignInEachLocationMetadata() {
    return senderCanSignInEachLocationMetadata;
  }

  public void setSenderCanSignInEachLocationMetadata(SettingsMetadata senderCanSignInEachLocationMetadata) {
    this.senderCanSignInEachLocationMetadata = senderCanSignInEachLocationMetadata;
  }

  public AccountSettingsInformation senderMustAuthenticateSigning(String senderMustAuthenticateSigning) {
    this.senderMustAuthenticateSigning = senderMustAuthenticateSigning;
    return this;
  }

   /**
   * 
   * @return senderMustAuthenticateSigning
  **/
  @ApiModelProperty(value = "")
  public String getSenderMustAuthenticateSigning() {
    return senderMustAuthenticateSigning;
  }

  public void setSenderMustAuthenticateSigning(String senderMustAuthenticateSigning) {
    this.senderMustAuthenticateSigning = senderMustAuthenticateSigning;
  }

  public AccountSettingsInformation senderMustAuthenticateSigningMetadata(SettingsMetadata senderMustAuthenticateSigningMetadata) {
    this.senderMustAuthenticateSigningMetadata = senderMustAuthenticateSigningMetadata;
    return this;
  }

   /**
   * Get senderMustAuthenticateSigningMetadata
   * @return senderMustAuthenticateSigningMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSenderMustAuthenticateSigningMetadata() {
    return senderMustAuthenticateSigningMetadata;
  }

  public void setSenderMustAuthenticateSigningMetadata(SettingsMetadata senderMustAuthenticateSigningMetadata) {
    this.senderMustAuthenticateSigningMetadata = senderMustAuthenticateSigningMetadata;
  }

  public AccountSettingsInformation sendingTagsFontColor(String sendingTagsFontColor) {
    this.sendingTagsFontColor = sendingTagsFontColor;
    return this;
  }

   /**
   * 
   * @return sendingTagsFontColor
  **/
  @ApiModelProperty(value = "")
  public String getSendingTagsFontColor() {
    return sendingTagsFontColor;
  }

  public void setSendingTagsFontColor(String sendingTagsFontColor) {
    this.sendingTagsFontColor = sendingTagsFontColor;
  }

  public AccountSettingsInformation sendingTagsFontColorMetadata(SettingsMetadata sendingTagsFontColorMetadata) {
    this.sendingTagsFontColorMetadata = sendingTagsFontColorMetadata;
    return this;
  }

   /**
   * Get sendingTagsFontColorMetadata
   * @return sendingTagsFontColorMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSendingTagsFontColorMetadata() {
    return sendingTagsFontColorMetadata;
  }

  public void setSendingTagsFontColorMetadata(SettingsMetadata sendingTagsFontColorMetadata) {
    this.sendingTagsFontColorMetadata = sendingTagsFontColorMetadata;
  }

  public AccountSettingsInformation sendingTagsFontName(String sendingTagsFontName) {
    this.sendingTagsFontName = sendingTagsFontName;
    return this;
  }

   /**
   * 
   * @return sendingTagsFontName
  **/
  @ApiModelProperty(value = "")
  public String getSendingTagsFontName() {
    return sendingTagsFontName;
  }

  public void setSendingTagsFontName(String sendingTagsFontName) {
    this.sendingTagsFontName = sendingTagsFontName;
  }

  public AccountSettingsInformation sendingTagsFontNameMetadata(SettingsMetadata sendingTagsFontNameMetadata) {
    this.sendingTagsFontNameMetadata = sendingTagsFontNameMetadata;
    return this;
  }

   /**
   * Get sendingTagsFontNameMetadata
   * @return sendingTagsFontNameMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSendingTagsFontNameMetadata() {
    return sendingTagsFontNameMetadata;
  }

  public void setSendingTagsFontNameMetadata(SettingsMetadata sendingTagsFontNameMetadata) {
    this.sendingTagsFontNameMetadata = sendingTagsFontNameMetadata;
  }

  public AccountSettingsInformation sendingTagsFontSize(String sendingTagsFontSize) {
    this.sendingTagsFontSize = sendingTagsFontSize;
    return this;
  }

   /**
   * 
   * @return sendingTagsFontSize
  **/
  @ApiModelProperty(value = "")
  public String getSendingTagsFontSize() {
    return sendingTagsFontSize;
  }

  public void setSendingTagsFontSize(String sendingTagsFontSize) {
    this.sendingTagsFontSize = sendingTagsFontSize;
  }

  public AccountSettingsInformation sendingTagsFontSizeMetadata(SettingsMetadata sendingTagsFontSizeMetadata) {
    this.sendingTagsFontSizeMetadata = sendingTagsFontSizeMetadata;
    return this;
  }

   /**
   * Get sendingTagsFontSizeMetadata
   * @return sendingTagsFontSizeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSendingTagsFontSizeMetadata() {
    return sendingTagsFontSizeMetadata;
  }

  public void setSendingTagsFontSizeMetadata(SettingsMetadata sendingTagsFontSizeMetadata) {
    this.sendingTagsFontSizeMetadata = sendingTagsFontSizeMetadata;
  }

  public AccountSettingsInformation sendToCertifiedDeliveryEnabled(String sendToCertifiedDeliveryEnabled) {
    this.sendToCertifiedDeliveryEnabled = sendToCertifiedDeliveryEnabled;
    return this;
  }

   /**
   * 
   * @return sendToCertifiedDeliveryEnabled
  **/
  @ApiModelProperty(value = "")
  public String getSendToCertifiedDeliveryEnabled() {
    return sendToCertifiedDeliveryEnabled;
  }

  public void setSendToCertifiedDeliveryEnabled(String sendToCertifiedDeliveryEnabled) {
    this.sendToCertifiedDeliveryEnabled = sendToCertifiedDeliveryEnabled;
  }

  public AccountSettingsInformation sendToCertifiedDeliveryEnabledMetadata(SettingsMetadata sendToCertifiedDeliveryEnabledMetadata) {
    this.sendToCertifiedDeliveryEnabledMetadata = sendToCertifiedDeliveryEnabledMetadata;
    return this;
  }

   /**
   * Get sendToCertifiedDeliveryEnabledMetadata
   * @return sendToCertifiedDeliveryEnabledMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSendToCertifiedDeliveryEnabledMetadata() {
    return sendToCertifiedDeliveryEnabledMetadata;
  }

  public void setSendToCertifiedDeliveryEnabledMetadata(SettingsMetadata sendToCertifiedDeliveryEnabledMetadata) {
    this.sendToCertifiedDeliveryEnabledMetadata = sendToCertifiedDeliveryEnabledMetadata;
  }

  public AccountSettingsInformation sessionTimeout(String sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
    return this;
  }

   /**
   * 
   * @return sessionTimeout
  **/
  @ApiModelProperty(value = "")
  public String getSessionTimeout() {
    return sessionTimeout;
  }

  public void setSessionTimeout(String sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }

  public AccountSettingsInformation sessionTimeoutMetadata(SettingsMetadata sessionTimeoutMetadata) {
    this.sessionTimeoutMetadata = sessionTimeoutMetadata;
    return this;
  }

   /**
   * Get sessionTimeoutMetadata
   * @return sessionTimeoutMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSessionTimeoutMetadata() {
    return sessionTimeoutMetadata;
  }

  public void setSessionTimeoutMetadata(SettingsMetadata sessionTimeoutMetadata) {
    this.sessionTimeoutMetadata = sessionTimeoutMetadata;
  }

  public AccountSettingsInformation setRecipEmailLang(String setRecipEmailLang) {
    this.setRecipEmailLang = setRecipEmailLang;
    return this;
  }

   /**
   * 
   * @return setRecipEmailLang
  **/
  @ApiModelProperty(value = "")
  public String getSetRecipEmailLang() {
    return setRecipEmailLang;
  }

  public void setSetRecipEmailLang(String setRecipEmailLang) {
    this.setRecipEmailLang = setRecipEmailLang;
  }

  public AccountSettingsInformation setRecipEmailLangMetadata(SettingsMetadata setRecipEmailLangMetadata) {
    this.setRecipEmailLangMetadata = setRecipEmailLangMetadata;
    return this;
  }

   /**
   * Get setRecipEmailLangMetadata
   * @return setRecipEmailLangMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSetRecipEmailLangMetadata() {
    return setRecipEmailLangMetadata;
  }

  public void setSetRecipEmailLangMetadata(SettingsMetadata setRecipEmailLangMetadata) {
    this.setRecipEmailLangMetadata = setRecipEmailLangMetadata;
  }

  public AccountSettingsInformation setRecipSignLang(String setRecipSignLang) {
    this.setRecipSignLang = setRecipSignLang;
    return this;
  }

   /**
   * 
   * @return setRecipSignLang
  **/
  @ApiModelProperty(value = "")
  public String getSetRecipSignLang() {
    return setRecipSignLang;
  }

  public void setSetRecipSignLang(String setRecipSignLang) {
    this.setRecipSignLang = setRecipSignLang;
  }

  public AccountSettingsInformation setRecipSignLangMetadata(SettingsMetadata setRecipSignLangMetadata) {
    this.setRecipSignLangMetadata = setRecipSignLangMetadata;
    return this;
  }

   /**
   * Get setRecipSignLangMetadata
   * @return setRecipSignLangMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSetRecipSignLangMetadata() {
    return setRecipSignLangMetadata;
  }

  public void setSetRecipSignLangMetadata(SettingsMetadata setRecipSignLangMetadata) {
    this.setRecipSignLangMetadata = setRecipSignLangMetadata;
  }

  public AccountSettingsInformation sharedTemplateFolders(String sharedTemplateFolders) {
    this.sharedTemplateFolders = sharedTemplateFolders;
    return this;
  }

   /**
   * 
   * @return sharedTemplateFolders
  **/
  @ApiModelProperty(value = "")
  public String getSharedTemplateFolders() {
    return sharedTemplateFolders;
  }

  public void setSharedTemplateFolders(String sharedTemplateFolders) {
    this.sharedTemplateFolders = sharedTemplateFolders;
  }

  public AccountSettingsInformation sharedTemplateFoldersMetadata(SettingsMetadata sharedTemplateFoldersMetadata) {
    this.sharedTemplateFoldersMetadata = sharedTemplateFoldersMetadata;
    return this;
  }

   /**
   * Get sharedTemplateFoldersMetadata
   * @return sharedTemplateFoldersMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSharedTemplateFoldersMetadata() {
    return sharedTemplateFoldersMetadata;
  }

  public void setSharedTemplateFoldersMetadata(SettingsMetadata sharedTemplateFoldersMetadata) {
    this.sharedTemplateFoldersMetadata = sharedTemplateFoldersMetadata;
  }

  public AccountSettingsInformation showCompleteDialogInEmbeddedSession(String showCompleteDialogInEmbeddedSession) {
    this.showCompleteDialogInEmbeddedSession = showCompleteDialogInEmbeddedSession;
    return this;
  }

   /**
   * 
   * @return showCompleteDialogInEmbeddedSession
  **/
  @ApiModelProperty(value = "")
  public String getShowCompleteDialogInEmbeddedSession() {
    return showCompleteDialogInEmbeddedSession;
  }

  public void setShowCompleteDialogInEmbeddedSession(String showCompleteDialogInEmbeddedSession) {
    this.showCompleteDialogInEmbeddedSession = showCompleteDialogInEmbeddedSession;
  }

  public AccountSettingsInformation showCompleteDialogInEmbeddedSessionMetadata(SettingsMetadata showCompleteDialogInEmbeddedSessionMetadata) {
    this.showCompleteDialogInEmbeddedSessionMetadata = showCompleteDialogInEmbeddedSessionMetadata;
    return this;
  }

   /**
   * Get showCompleteDialogInEmbeddedSessionMetadata
   * @return showCompleteDialogInEmbeddedSessionMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getShowCompleteDialogInEmbeddedSessionMetadata() {
    return showCompleteDialogInEmbeddedSessionMetadata;
  }

  public void setShowCompleteDialogInEmbeddedSessionMetadata(SettingsMetadata showCompleteDialogInEmbeddedSessionMetadata) {
    this.showCompleteDialogInEmbeddedSessionMetadata = showCompleteDialogInEmbeddedSessionMetadata;
  }

  public AccountSettingsInformation showConditionalRoutingOnSend(String showConditionalRoutingOnSend) {
    this.showConditionalRoutingOnSend = showConditionalRoutingOnSend;
    return this;
  }

   /**
   * 
   * @return showConditionalRoutingOnSend
  **/
  @ApiModelProperty(value = "")
  public String getShowConditionalRoutingOnSend() {
    return showConditionalRoutingOnSend;
  }

  public void setShowConditionalRoutingOnSend(String showConditionalRoutingOnSend) {
    this.showConditionalRoutingOnSend = showConditionalRoutingOnSend;
  }

  public AccountSettingsInformation showConditionalRoutingOnSendMetadata(SettingsMetadata showConditionalRoutingOnSendMetadata) {
    this.showConditionalRoutingOnSendMetadata = showConditionalRoutingOnSendMetadata;
    return this;
  }

   /**
   * Get showConditionalRoutingOnSendMetadata
   * @return showConditionalRoutingOnSendMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getShowConditionalRoutingOnSendMetadata() {
    return showConditionalRoutingOnSendMetadata;
  }

  public void setShowConditionalRoutingOnSendMetadata(SettingsMetadata showConditionalRoutingOnSendMetadata) {
    this.showConditionalRoutingOnSendMetadata = showConditionalRoutingOnSendMetadata;
  }

  public AccountSettingsInformation showInitialConditionalFields(String showInitialConditionalFields) {
    this.showInitialConditionalFields = showInitialConditionalFields;
    return this;
  }

   /**
   * 
   * @return showInitialConditionalFields
  **/
  @ApiModelProperty(value = "")
  public String getShowInitialConditionalFields() {
    return showInitialConditionalFields;
  }

  public void setShowInitialConditionalFields(String showInitialConditionalFields) {
    this.showInitialConditionalFields = showInitialConditionalFields;
  }

  public AccountSettingsInformation showInitialConditionalFieldsMetadata(SettingsMetadata showInitialConditionalFieldsMetadata) {
    this.showInitialConditionalFieldsMetadata = showInitialConditionalFieldsMetadata;
    return this;
  }

   /**
   * Get showInitialConditionalFieldsMetadata
   * @return showInitialConditionalFieldsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getShowInitialConditionalFieldsMetadata() {
    return showInitialConditionalFieldsMetadata;
  }

  public void setShowInitialConditionalFieldsMetadata(SettingsMetadata showInitialConditionalFieldsMetadata) {
    this.showInitialConditionalFieldsMetadata = showInitialConditionalFieldsMetadata;
  }

  public AccountSettingsInformation showLocalizedWatermarks(String showLocalizedWatermarks) {
    this.showLocalizedWatermarks = showLocalizedWatermarks;
    return this;
  }

   /**
   * 
   * @return showLocalizedWatermarks
  **/
  @ApiModelProperty(value = "")
  public String getShowLocalizedWatermarks() {
    return showLocalizedWatermarks;
  }

  public void setShowLocalizedWatermarks(String showLocalizedWatermarks) {
    this.showLocalizedWatermarks = showLocalizedWatermarks;
  }

  public AccountSettingsInformation showLocalizedWatermarksMetadata(SettingsMetadata showLocalizedWatermarksMetadata) {
    this.showLocalizedWatermarksMetadata = showLocalizedWatermarksMetadata;
    return this;
  }

   /**
   * Get showLocalizedWatermarksMetadata
   * @return showLocalizedWatermarksMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getShowLocalizedWatermarksMetadata() {
    return showLocalizedWatermarksMetadata;
  }

  public void setShowLocalizedWatermarksMetadata(SettingsMetadata showLocalizedWatermarksMetadata) {
    this.showLocalizedWatermarksMetadata = showLocalizedWatermarksMetadata;
  }

  public AccountSettingsInformation showTutorials(String showTutorials) {
    this.showTutorials = showTutorials;
    return this;
  }

   /**
   * 
   * @return showTutorials
  **/
  @ApiModelProperty(value = "")
  public String getShowTutorials() {
    return showTutorials;
  }

  public void setShowTutorials(String showTutorials) {
    this.showTutorials = showTutorials;
  }

  public AccountSettingsInformation showTutorialsMetadata(SettingsMetadata showTutorialsMetadata) {
    this.showTutorialsMetadata = showTutorialsMetadata;
    return this;
  }

   /**
   * Get showTutorialsMetadata
   * @return showTutorialsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getShowTutorialsMetadata() {
    return showTutorialsMetadata;
  }

  public void setShowTutorialsMetadata(SettingsMetadata showTutorialsMetadata) {
    this.showTutorialsMetadata = showTutorialsMetadata;
  }

  public AccountSettingsInformation signatureProviders(java.util.List<String> signatureProviders) {
    this.signatureProviders = signatureProviders;
    return this;
  }

  public AccountSettingsInformation addSignatureProvidersItem(String signatureProvidersItem) {
    if (this.signatureProviders == null) {
      this.signatureProviders = new java.util.ArrayList<String>();
    }
    this.signatureProviders.add(signatureProvidersItem);
    return this;
  }

   /**
   * 
   * @return signatureProviders
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getSignatureProviders() {
    return signatureProviders;
  }

  public void setSignatureProviders(java.util.List<String> signatureProviders) {
    this.signatureProviders = signatureProviders;
  }

  public AccountSettingsInformation signatureProvidersMetadata(SettingsMetadata signatureProvidersMetadata) {
    this.signatureProvidersMetadata = signatureProvidersMetadata;
    return this;
  }

   /**
   * Get signatureProvidersMetadata
   * @return signatureProvidersMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignatureProvidersMetadata() {
    return signatureProvidersMetadata;
  }

  public void setSignatureProvidersMetadata(SettingsMetadata signatureProvidersMetadata) {
    this.signatureProvidersMetadata = signatureProvidersMetadata;
  }

  public AccountSettingsInformation signDateFormat(String signDateFormat) {
    this.signDateFormat = signDateFormat;
    return this;
  }

   /**
   * 
   * @return signDateFormat
  **/
  @ApiModelProperty(value = "")
  public String getSignDateFormat() {
    return signDateFormat;
  }

  public void setSignDateFormat(String signDateFormat) {
    this.signDateFormat = signDateFormat;
  }

  public AccountSettingsInformation signDateFormatMetadata(SettingsMetadata signDateFormatMetadata) {
    this.signDateFormatMetadata = signDateFormatMetadata;
    return this;
  }

   /**
   * Get signDateFormatMetadata
   * @return signDateFormatMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignDateFormatMetadata() {
    return signDateFormatMetadata;
  }

  public void setSignDateFormatMetadata(SettingsMetadata signDateFormatMetadata) {
    this.signDateFormatMetadata = signDateFormatMetadata;
  }

  public AccountSettingsInformation signerAttachCertificateToEnvelopePDF(String signerAttachCertificateToEnvelopePDF) {
    this.signerAttachCertificateToEnvelopePDF = signerAttachCertificateToEnvelopePDF;
    return this;
  }

   /**
   * 
   * @return signerAttachCertificateToEnvelopePDF
  **/
  @ApiModelProperty(value = "")
  public String getSignerAttachCertificateToEnvelopePDF() {
    return signerAttachCertificateToEnvelopePDF;
  }

  public void setSignerAttachCertificateToEnvelopePDF(String signerAttachCertificateToEnvelopePDF) {
    this.signerAttachCertificateToEnvelopePDF = signerAttachCertificateToEnvelopePDF;
  }

  public AccountSettingsInformation signerAttachCertificateToEnvelopePDFMetadata(SettingsMetadata signerAttachCertificateToEnvelopePDFMetadata) {
    this.signerAttachCertificateToEnvelopePDFMetadata = signerAttachCertificateToEnvelopePDFMetadata;
    return this;
  }

   /**
   * Get signerAttachCertificateToEnvelopePDFMetadata
   * @return signerAttachCertificateToEnvelopePDFMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignerAttachCertificateToEnvelopePDFMetadata() {
    return signerAttachCertificateToEnvelopePDFMetadata;
  }

  public void setSignerAttachCertificateToEnvelopePDFMetadata(SettingsMetadata signerAttachCertificateToEnvelopePDFMetadata) {
    this.signerAttachCertificateToEnvelopePDFMetadata = signerAttachCertificateToEnvelopePDFMetadata;
  }

  public AccountSettingsInformation signerAttachConcat(String signerAttachConcat) {
    this.signerAttachConcat = signerAttachConcat;
    return this;
  }

   /**
   * 
   * @return signerAttachConcat
  **/
  @ApiModelProperty(value = "")
  public String getSignerAttachConcat() {
    return signerAttachConcat;
  }

  public void setSignerAttachConcat(String signerAttachConcat) {
    this.signerAttachConcat = signerAttachConcat;
  }

  public AccountSettingsInformation signerAttachConcatMetadata(SettingsMetadata signerAttachConcatMetadata) {
    this.signerAttachConcatMetadata = signerAttachConcatMetadata;
    return this;
  }

   /**
   * Get signerAttachConcatMetadata
   * @return signerAttachConcatMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignerAttachConcatMetadata() {
    return signerAttachConcatMetadata;
  }

  public void setSignerAttachConcatMetadata(SettingsMetadata signerAttachConcatMetadata) {
    this.signerAttachConcatMetadata = signerAttachConcatMetadata;
  }

  public AccountSettingsInformation signerCanCreateAccount(String signerCanCreateAccount) {
    this.signerCanCreateAccount = signerCanCreateAccount;
    return this;
  }

   /**
   * 
   * @return signerCanCreateAccount
  **/
  @ApiModelProperty(value = "")
  public String getSignerCanCreateAccount() {
    return signerCanCreateAccount;
  }

  public void setSignerCanCreateAccount(String signerCanCreateAccount) {
    this.signerCanCreateAccount = signerCanCreateAccount;
  }

  public AccountSettingsInformation signerCanCreateAccountMetadata(SettingsMetadata signerCanCreateAccountMetadata) {
    this.signerCanCreateAccountMetadata = signerCanCreateAccountMetadata;
    return this;
  }

   /**
   * Get signerCanCreateAccountMetadata
   * @return signerCanCreateAccountMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignerCanCreateAccountMetadata() {
    return signerCanCreateAccountMetadata;
  }

  public void setSignerCanCreateAccountMetadata(SettingsMetadata signerCanCreateAccountMetadata) {
    this.signerCanCreateAccountMetadata = signerCanCreateAccountMetadata;
  }

  public AccountSettingsInformation signerCanSignOnMobile(String signerCanSignOnMobile) {
    this.signerCanSignOnMobile = signerCanSignOnMobile;
    return this;
  }

   /**
   * 
   * @return signerCanSignOnMobile
  **/
  @ApiModelProperty(value = "")
  public String getSignerCanSignOnMobile() {
    return signerCanSignOnMobile;
  }

  public void setSignerCanSignOnMobile(String signerCanSignOnMobile) {
    this.signerCanSignOnMobile = signerCanSignOnMobile;
  }

  public AccountSettingsInformation signerCanSignOnMobileMetadata(SettingsMetadata signerCanSignOnMobileMetadata) {
    this.signerCanSignOnMobileMetadata = signerCanSignOnMobileMetadata;
    return this;
  }

   /**
   * Get signerCanSignOnMobileMetadata
   * @return signerCanSignOnMobileMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignerCanSignOnMobileMetadata() {
    return signerCanSignOnMobileMetadata;
  }

  public void setSignerCanSignOnMobileMetadata(SettingsMetadata signerCanSignOnMobileMetadata) {
    this.signerCanSignOnMobileMetadata = signerCanSignOnMobileMetadata;
  }

  public AccountSettingsInformation signerInSessionUseEnvelopeCompleteEmail(String signerInSessionUseEnvelopeCompleteEmail) {
    this.signerInSessionUseEnvelopeCompleteEmail = signerInSessionUseEnvelopeCompleteEmail;
    return this;
  }

   /**
   * 
   * @return signerInSessionUseEnvelopeCompleteEmail
  **/
  @ApiModelProperty(value = "")
  public String getSignerInSessionUseEnvelopeCompleteEmail() {
    return signerInSessionUseEnvelopeCompleteEmail;
  }

  public void setSignerInSessionUseEnvelopeCompleteEmail(String signerInSessionUseEnvelopeCompleteEmail) {
    this.signerInSessionUseEnvelopeCompleteEmail = signerInSessionUseEnvelopeCompleteEmail;
  }

  public AccountSettingsInformation signerInSessionUseEnvelopeCompleteEmailMetadata(SettingsMetadata signerInSessionUseEnvelopeCompleteEmailMetadata) {
    this.signerInSessionUseEnvelopeCompleteEmailMetadata = signerInSessionUseEnvelopeCompleteEmailMetadata;
    return this;
  }

   /**
   * Get signerInSessionUseEnvelopeCompleteEmailMetadata
   * @return signerInSessionUseEnvelopeCompleteEmailMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignerInSessionUseEnvelopeCompleteEmailMetadata() {
    return signerInSessionUseEnvelopeCompleteEmailMetadata;
  }

  public void setSignerInSessionUseEnvelopeCompleteEmailMetadata(SettingsMetadata signerInSessionUseEnvelopeCompleteEmailMetadata) {
    this.signerInSessionUseEnvelopeCompleteEmailMetadata = signerInSessionUseEnvelopeCompleteEmailMetadata;
  }

  public AccountSettingsInformation signerLoginRequirements(String signerLoginRequirements) {
    this.signerLoginRequirements = signerLoginRequirements;
    return this;
  }

   /**
   * 
   * @return signerLoginRequirements
  **/
  @ApiModelProperty(value = "")
  public String getSignerLoginRequirements() {
    return signerLoginRequirements;
  }

  public void setSignerLoginRequirements(String signerLoginRequirements) {
    this.signerLoginRequirements = signerLoginRequirements;
  }

  public AccountSettingsInformation signerLoginRequirementsMetadata(SettingsMetadata signerLoginRequirementsMetadata) {
    this.signerLoginRequirementsMetadata = signerLoginRequirementsMetadata;
    return this;
  }

   /**
   * Get signerLoginRequirementsMetadata
   * @return signerLoginRequirementsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignerLoginRequirementsMetadata() {
    return signerLoginRequirementsMetadata;
  }

  public void setSignerLoginRequirementsMetadata(SettingsMetadata signerLoginRequirementsMetadata) {
    this.signerLoginRequirementsMetadata = signerLoginRequirementsMetadata;
  }

  public AccountSettingsInformation signerMustHaveAccount(String signerMustHaveAccount) {
    this.signerMustHaveAccount = signerMustHaveAccount;
    return this;
  }

   /**
   * 
   * @return signerMustHaveAccount
  **/
  @ApiModelProperty(value = "")
  public String getSignerMustHaveAccount() {
    return signerMustHaveAccount;
  }

  public void setSignerMustHaveAccount(String signerMustHaveAccount) {
    this.signerMustHaveAccount = signerMustHaveAccount;
  }

  public AccountSettingsInformation signerMustHaveAccountMetadata(SettingsMetadata signerMustHaveAccountMetadata) {
    this.signerMustHaveAccountMetadata = signerMustHaveAccountMetadata;
    return this;
  }

   /**
   * Get signerMustHaveAccountMetadata
   * @return signerMustHaveAccountMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignerMustHaveAccountMetadata() {
    return signerMustHaveAccountMetadata;
  }

  public void setSignerMustHaveAccountMetadata(SettingsMetadata signerMustHaveAccountMetadata) {
    this.signerMustHaveAccountMetadata = signerMustHaveAccountMetadata;
  }

  public AccountSettingsInformation signerMustLoginToSign(String signerMustLoginToSign) {
    this.signerMustLoginToSign = signerMustLoginToSign;
    return this;
  }

   /**
   * 
   * @return signerMustLoginToSign
  **/
  @ApiModelProperty(value = "")
  public String getSignerMustLoginToSign() {
    return signerMustLoginToSign;
  }

  public void setSignerMustLoginToSign(String signerMustLoginToSign) {
    this.signerMustLoginToSign = signerMustLoginToSign;
  }

  public AccountSettingsInformation signerMustLoginToSignMetadata(SettingsMetadata signerMustLoginToSignMetadata) {
    this.signerMustLoginToSignMetadata = signerMustLoginToSignMetadata;
    return this;
  }

   /**
   * Get signerMustLoginToSignMetadata
   * @return signerMustLoginToSignMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignerMustLoginToSignMetadata() {
    return signerMustLoginToSignMetadata;
  }

  public void setSignerMustLoginToSignMetadata(SettingsMetadata signerMustLoginToSignMetadata) {
    this.signerMustLoginToSignMetadata = signerMustLoginToSignMetadata;
  }

  public AccountSettingsInformation signerShowSecureFieldInitialValues(String signerShowSecureFieldInitialValues) {
    this.signerShowSecureFieldInitialValues = signerShowSecureFieldInitialValues;
    return this;
  }

   /**
   * 
   * @return signerShowSecureFieldInitialValues
  **/
  @ApiModelProperty(value = "")
  public String getSignerShowSecureFieldInitialValues() {
    return signerShowSecureFieldInitialValues;
  }

  public void setSignerShowSecureFieldInitialValues(String signerShowSecureFieldInitialValues) {
    this.signerShowSecureFieldInitialValues = signerShowSecureFieldInitialValues;
  }

  public AccountSettingsInformation signerShowSecureFieldInitialValuesMetadata(SettingsMetadata signerShowSecureFieldInitialValuesMetadata) {
    this.signerShowSecureFieldInitialValuesMetadata = signerShowSecureFieldInitialValuesMetadata;
    return this;
  }

   /**
   * Get signerShowSecureFieldInitialValuesMetadata
   * @return signerShowSecureFieldInitialValuesMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignerShowSecureFieldInitialValuesMetadata() {
    return signerShowSecureFieldInitialValuesMetadata;
  }

  public void setSignerShowSecureFieldInitialValuesMetadata(SettingsMetadata signerShowSecureFieldInitialValuesMetadata) {
    this.signerShowSecureFieldInitialValuesMetadata = signerShowSecureFieldInitialValuesMetadata;
  }

  public AccountSettingsInformation signingSessionTimeout(String signingSessionTimeout) {
    this.signingSessionTimeout = signingSessionTimeout;
    return this;
  }

   /**
   * 
   * @return signingSessionTimeout
  **/
  @ApiModelProperty(value = "")
  public String getSigningSessionTimeout() {
    return signingSessionTimeout;
  }

  public void setSigningSessionTimeout(String signingSessionTimeout) {
    this.signingSessionTimeout = signingSessionTimeout;
  }

  public AccountSettingsInformation signingSessionTimeoutMetadata(SettingsMetadata signingSessionTimeoutMetadata) {
    this.signingSessionTimeoutMetadata = signingSessionTimeoutMetadata;
    return this;
  }

   /**
   * Get signingSessionTimeoutMetadata
   * @return signingSessionTimeoutMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSigningSessionTimeoutMetadata() {
    return signingSessionTimeoutMetadata;
  }

  public void setSigningSessionTimeoutMetadata(SettingsMetadata signingSessionTimeoutMetadata) {
    this.signingSessionTimeoutMetadata = signingSessionTimeoutMetadata;
  }

  public AccountSettingsInformation signingUiVersion(String signingUiVersion) {
    this.signingUiVersion = signingUiVersion;
    return this;
  }

   /**
   * 
   * @return signingUiVersion
  **/
  @ApiModelProperty(value = "")
  public String getSigningUiVersion() {
    return signingUiVersion;
  }

  public void setSigningUiVersion(String signingUiVersion) {
    this.signingUiVersion = signingUiVersion;
  }

  public AccountSettingsInformation signingUiVersionMetadata(SettingsMetadata signingUiVersionMetadata) {
    this.signingUiVersionMetadata = signingUiVersionMetadata;
    return this;
  }

   /**
   * Get signingUiVersionMetadata
   * @return signingUiVersionMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSigningUiVersionMetadata() {
    return signingUiVersionMetadata;
  }

  public void setSigningUiVersionMetadata(SettingsMetadata signingUiVersionMetadata) {
    this.signingUiVersionMetadata = signingUiVersionMetadata;
  }

  public AccountSettingsInformation signTimeFormat(String signTimeFormat) {
    this.signTimeFormat = signTimeFormat;
    return this;
  }

   /**
   * 
   * @return signTimeFormat
  **/
  @ApiModelProperty(value = "")
  public String getSignTimeFormat() {
    return signTimeFormat;
  }

  public void setSignTimeFormat(String signTimeFormat) {
    this.signTimeFormat = signTimeFormat;
  }

  public AccountSettingsInformation signTimeFormatMetadata(SettingsMetadata signTimeFormatMetadata) {
    this.signTimeFormatMetadata = signTimeFormatMetadata;
    return this;
  }

   /**
   * Get signTimeFormatMetadata
   * @return signTimeFormatMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignTimeFormatMetadata() {
    return signTimeFormatMetadata;
  }

  public void setSignTimeFormatMetadata(SettingsMetadata signTimeFormatMetadata) {
    this.signTimeFormatMetadata = signTimeFormatMetadata;
  }

  public AccountSettingsInformation signTimeShowAmPm(String signTimeShowAmPm) {
    this.signTimeShowAmPm = signTimeShowAmPm;
    return this;
  }

   /**
   * 
   * @return signTimeShowAmPm
  **/
  @ApiModelProperty(value = "")
  public String getSignTimeShowAmPm() {
    return signTimeShowAmPm;
  }

  public void setSignTimeShowAmPm(String signTimeShowAmPm) {
    this.signTimeShowAmPm = signTimeShowAmPm;
  }

  public AccountSettingsInformation signTimeShowAmPmMetadata(SettingsMetadata signTimeShowAmPmMetadata) {
    this.signTimeShowAmPmMetadata = signTimeShowAmPmMetadata;
    return this;
  }

   /**
   * Get signTimeShowAmPmMetadata
   * @return signTimeShowAmPmMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSignTimeShowAmPmMetadata() {
    return signTimeShowAmPmMetadata;
  }

  public void setSignTimeShowAmPmMetadata(SettingsMetadata signTimeShowAmPmMetadata) {
    this.signTimeShowAmPmMetadata = signTimeShowAmPmMetadata;
  }

  public AccountSettingsInformation simplifiedSendingEnabled(String simplifiedSendingEnabled) {
    this.simplifiedSendingEnabled = simplifiedSendingEnabled;
    return this;
  }

   /**
   * 
   * @return simplifiedSendingEnabled
  **/
  @ApiModelProperty(value = "")
  public String getSimplifiedSendingEnabled() {
    return simplifiedSendingEnabled;
  }

  public void setSimplifiedSendingEnabled(String simplifiedSendingEnabled) {
    this.simplifiedSendingEnabled = simplifiedSendingEnabled;
  }

  public AccountSettingsInformation simplifiedSendingEnabledMetadata(SettingsMetadata simplifiedSendingEnabledMetadata) {
    this.simplifiedSendingEnabledMetadata = simplifiedSendingEnabledMetadata;
    return this;
  }

   /**
   * Get simplifiedSendingEnabledMetadata
   * @return simplifiedSendingEnabledMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSimplifiedSendingEnabledMetadata() {
    return simplifiedSendingEnabledMetadata;
  }

  public void setSimplifiedSendingEnabledMetadata(SettingsMetadata simplifiedSendingEnabledMetadata) {
    this.simplifiedSendingEnabledMetadata = simplifiedSendingEnabledMetadata;
  }

  public AccountSettingsInformation singleSignOnEnabled(String singleSignOnEnabled) {
    this.singleSignOnEnabled = singleSignOnEnabled;
    return this;
  }

   /**
   * 
   * @return singleSignOnEnabled
  **/
  @ApiModelProperty(value = "")
  public String getSingleSignOnEnabled() {
    return singleSignOnEnabled;
  }

  public void setSingleSignOnEnabled(String singleSignOnEnabled) {
    this.singleSignOnEnabled = singleSignOnEnabled;
  }

  public AccountSettingsInformation singleSignOnEnabledMetadata(SettingsMetadata singleSignOnEnabledMetadata) {
    this.singleSignOnEnabledMetadata = singleSignOnEnabledMetadata;
    return this;
  }

   /**
   * Get singleSignOnEnabledMetadata
   * @return singleSignOnEnabledMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSingleSignOnEnabledMetadata() {
    return singleSignOnEnabledMetadata;
  }

  public void setSingleSignOnEnabledMetadata(SettingsMetadata singleSignOnEnabledMetadata) {
    this.singleSignOnEnabledMetadata = singleSignOnEnabledMetadata;
  }

  public AccountSettingsInformation skipAuthCompletedEnvelopes(String skipAuthCompletedEnvelopes) {
    this.skipAuthCompletedEnvelopes = skipAuthCompletedEnvelopes;
    return this;
  }

   /**
   * 
   * @return skipAuthCompletedEnvelopes
  **/
  @ApiModelProperty(value = "")
  public String getSkipAuthCompletedEnvelopes() {
    return skipAuthCompletedEnvelopes;
  }

  public void setSkipAuthCompletedEnvelopes(String skipAuthCompletedEnvelopes) {
    this.skipAuthCompletedEnvelopes = skipAuthCompletedEnvelopes;
  }

  public AccountSettingsInformation skipAuthCompletedEnvelopesMetadata(SettingsMetadata skipAuthCompletedEnvelopesMetadata) {
    this.skipAuthCompletedEnvelopesMetadata = skipAuthCompletedEnvelopesMetadata;
    return this;
  }

   /**
   * Get skipAuthCompletedEnvelopesMetadata
   * @return skipAuthCompletedEnvelopesMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSkipAuthCompletedEnvelopesMetadata() {
    return skipAuthCompletedEnvelopesMetadata;
  }

  public void setSkipAuthCompletedEnvelopesMetadata(SettingsMetadata skipAuthCompletedEnvelopesMetadata) {
    this.skipAuthCompletedEnvelopesMetadata = skipAuthCompletedEnvelopesMetadata;
  }

  public AccountSettingsInformation socialIdRecipAuth(String socialIdRecipAuth) {
    this.socialIdRecipAuth = socialIdRecipAuth;
    return this;
  }

   /**
   * 
   * @return socialIdRecipAuth
  **/
  @ApiModelProperty(value = "")
  public String getSocialIdRecipAuth() {
    return socialIdRecipAuth;
  }

  public void setSocialIdRecipAuth(String socialIdRecipAuth) {
    this.socialIdRecipAuth = socialIdRecipAuth;
  }

  public AccountSettingsInformation socialIdRecipAuthMetadata(SettingsMetadata socialIdRecipAuthMetadata) {
    this.socialIdRecipAuthMetadata = socialIdRecipAuthMetadata;
    return this;
  }

   /**
   * Get socialIdRecipAuthMetadata
   * @return socialIdRecipAuthMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSocialIdRecipAuthMetadata() {
    return socialIdRecipAuthMetadata;
  }

  public void setSocialIdRecipAuthMetadata(SettingsMetadata socialIdRecipAuthMetadata) {
    this.socialIdRecipAuthMetadata = socialIdRecipAuthMetadata;
  }

  public AccountSettingsInformation specifyDocumentVisibility(String specifyDocumentVisibility) {
    this.specifyDocumentVisibility = specifyDocumentVisibility;
    return this;
  }

   /**
   * 
   * @return specifyDocumentVisibility
  **/
  @ApiModelProperty(value = "")
  public String getSpecifyDocumentVisibility() {
    return specifyDocumentVisibility;
  }

  public void setSpecifyDocumentVisibility(String specifyDocumentVisibility) {
    this.specifyDocumentVisibility = specifyDocumentVisibility;
  }

  public AccountSettingsInformation specifyDocumentVisibilityMetadata(SettingsMetadata specifyDocumentVisibilityMetadata) {
    this.specifyDocumentVisibilityMetadata = specifyDocumentVisibilityMetadata;
    return this;
  }

   /**
   * Get specifyDocumentVisibilityMetadata
   * @return specifyDocumentVisibilityMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSpecifyDocumentVisibilityMetadata() {
    return specifyDocumentVisibilityMetadata;
  }

  public void setSpecifyDocumentVisibilityMetadata(SettingsMetadata specifyDocumentVisibilityMetadata) {
    this.specifyDocumentVisibilityMetadata = specifyDocumentVisibilityMetadata;
  }

  public AccountSettingsInformation startInAdvancedCorrect(String startInAdvancedCorrect) {
    this.startInAdvancedCorrect = startInAdvancedCorrect;
    return this;
  }

   /**
   * 
   * @return startInAdvancedCorrect
  **/
  @ApiModelProperty(value = "")
  public String getStartInAdvancedCorrect() {
    return startInAdvancedCorrect;
  }

  public void setStartInAdvancedCorrect(String startInAdvancedCorrect) {
    this.startInAdvancedCorrect = startInAdvancedCorrect;
  }

  public AccountSettingsInformation startInAdvancedCorrectMetadata(SettingsMetadata startInAdvancedCorrectMetadata) {
    this.startInAdvancedCorrectMetadata = startInAdvancedCorrectMetadata;
    return this;
  }

   /**
   * Get startInAdvancedCorrectMetadata
   * @return startInAdvancedCorrectMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getStartInAdvancedCorrectMetadata() {
    return startInAdvancedCorrectMetadata;
  }

  public void setStartInAdvancedCorrectMetadata(SettingsMetadata startInAdvancedCorrectMetadata) {
    this.startInAdvancedCorrectMetadata = startInAdvancedCorrectMetadata;
  }

  public AccountSettingsInformation supplementalDocumentsMustAccept(String supplementalDocumentsMustAccept) {
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

  public AccountSettingsInformation supplementalDocumentsMustAcceptMetadata(SettingsMetadata supplementalDocumentsMustAcceptMetadata) {
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

  public AccountSettingsInformation supplementalDocumentsMustRead(String supplementalDocumentsMustRead) {
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

  public AccountSettingsInformation supplementalDocumentsMustReadMetadata(SettingsMetadata supplementalDocumentsMustReadMetadata) {
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

  public AccountSettingsInformation supplementalDocumentsMustView(String supplementalDocumentsMustView) {
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

  public AccountSettingsInformation supplementalDocumentsMustViewMetadata(SettingsMetadata supplementalDocumentsMustViewMetadata) {
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

  public AccountSettingsInformation suppressCertificateEnforcement(String suppressCertificateEnforcement) {
    this.suppressCertificateEnforcement = suppressCertificateEnforcement;
    return this;
  }

   /**
   * 
   * @return suppressCertificateEnforcement
  **/
  @ApiModelProperty(value = "")
  public String getSuppressCertificateEnforcement() {
    return suppressCertificateEnforcement;
  }

  public void setSuppressCertificateEnforcement(String suppressCertificateEnforcement) {
    this.suppressCertificateEnforcement = suppressCertificateEnforcement;
  }

  public AccountSettingsInformation suppressCertificateEnforcementMetadata(SettingsMetadata suppressCertificateEnforcementMetadata) {
    this.suppressCertificateEnforcementMetadata = suppressCertificateEnforcementMetadata;
    return this;
  }

   /**
   * Get suppressCertificateEnforcementMetadata
   * @return suppressCertificateEnforcementMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getSuppressCertificateEnforcementMetadata() {
    return suppressCertificateEnforcementMetadata;
  }

  public void setSuppressCertificateEnforcementMetadata(SettingsMetadata suppressCertificateEnforcementMetadata) {
    this.suppressCertificateEnforcementMetadata = suppressCertificateEnforcementMetadata;
  }

  public AccountSettingsInformation tabAccountSettings(TabAccountSettings tabAccountSettings) {
    this.tabAccountSettings = tabAccountSettings;
    return this;
  }

   /**
   * Get tabAccountSettings
   * @return tabAccountSettings
  **/
  @ApiModelProperty(value = "")
  public TabAccountSettings getTabAccountSettings() {
    return tabAccountSettings;
  }

  public void setTabAccountSettings(TabAccountSettings tabAccountSettings) {
    this.tabAccountSettings = tabAccountSettings;
  }

  public AccountSettingsInformation timezoneOffsetAPI(String timezoneOffsetAPI) {
    this.timezoneOffsetAPI = timezoneOffsetAPI;
    return this;
  }

   /**
   * 
   * @return timezoneOffsetAPI
  **/
  @ApiModelProperty(value = "")
  public String getTimezoneOffsetAPI() {
    return timezoneOffsetAPI;
  }

  public void setTimezoneOffsetAPI(String timezoneOffsetAPI) {
    this.timezoneOffsetAPI = timezoneOffsetAPI;
  }

  public AccountSettingsInformation timezoneOffsetAPIMetadata(SettingsMetadata timezoneOffsetAPIMetadata) {
    this.timezoneOffsetAPIMetadata = timezoneOffsetAPIMetadata;
    return this;
  }

   /**
   * Get timezoneOffsetAPIMetadata
   * @return timezoneOffsetAPIMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTimezoneOffsetAPIMetadata() {
    return timezoneOffsetAPIMetadata;
  }

  public void setTimezoneOffsetAPIMetadata(SettingsMetadata timezoneOffsetAPIMetadata) {
    this.timezoneOffsetAPIMetadata = timezoneOffsetAPIMetadata;
  }

  public AccountSettingsInformation timezoneOffsetUI(String timezoneOffsetUI) {
    this.timezoneOffsetUI = timezoneOffsetUI;
    return this;
  }

   /**
   * 
   * @return timezoneOffsetUI
  **/
  @ApiModelProperty(value = "")
  public String getTimezoneOffsetUI() {
    return timezoneOffsetUI;
  }

  public void setTimezoneOffsetUI(String timezoneOffsetUI) {
    this.timezoneOffsetUI = timezoneOffsetUI;
  }

  public AccountSettingsInformation timezoneOffsetUIMetadata(SettingsMetadata timezoneOffsetUIMetadata) {
    this.timezoneOffsetUIMetadata = timezoneOffsetUIMetadata;
    return this;
  }

   /**
   * Get timezoneOffsetUIMetadata
   * @return timezoneOffsetUIMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getTimezoneOffsetUIMetadata() {
    return timezoneOffsetUIMetadata;
  }

  public void setTimezoneOffsetUIMetadata(SettingsMetadata timezoneOffsetUIMetadata) {
    this.timezoneOffsetUIMetadata = timezoneOffsetUIMetadata;
  }

  public AccountSettingsInformation universalSignatureOptIn(String universalSignatureOptIn) {
    this.universalSignatureOptIn = universalSignatureOptIn;
    return this;
  }

   /**
   * 
   * @return universalSignatureOptIn
  **/
  @ApiModelProperty(value = "")
  public String getUniversalSignatureOptIn() {
    return universalSignatureOptIn;
  }

  public void setUniversalSignatureOptIn(String universalSignatureOptIn) {
    this.universalSignatureOptIn = universalSignatureOptIn;
  }

  public AccountSettingsInformation useAccountLevelEmail(String useAccountLevelEmail) {
    this.useAccountLevelEmail = useAccountLevelEmail;
    return this;
  }

   /**
   * 
   * @return useAccountLevelEmail
  **/
  @ApiModelProperty(value = "")
  public String getUseAccountLevelEmail() {
    return useAccountLevelEmail;
  }

  public void setUseAccountLevelEmail(String useAccountLevelEmail) {
    this.useAccountLevelEmail = useAccountLevelEmail;
  }

  public AccountSettingsInformation useAccountLevelEmailMetadata(SettingsMetadata useAccountLevelEmailMetadata) {
    this.useAccountLevelEmailMetadata = useAccountLevelEmailMetadata;
    return this;
  }

   /**
   * Get useAccountLevelEmailMetadata
   * @return useAccountLevelEmailMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getUseAccountLevelEmailMetadata() {
    return useAccountLevelEmailMetadata;
  }

  public void setUseAccountLevelEmailMetadata(SettingsMetadata useAccountLevelEmailMetadata) {
    this.useAccountLevelEmailMetadata = useAccountLevelEmailMetadata;
  }

  public AccountSettingsInformation useConsumerDisclosure(String useConsumerDisclosure) {
    this.useConsumerDisclosure = useConsumerDisclosure;
    return this;
  }

   /**
   * 
   * @return useConsumerDisclosure
  **/
  @ApiModelProperty(value = "")
  public String getUseConsumerDisclosure() {
    return useConsumerDisclosure;
  }

  public void setUseConsumerDisclosure(String useConsumerDisclosure) {
    this.useConsumerDisclosure = useConsumerDisclosure;
  }

  public AccountSettingsInformation useConsumerDisclosureMetadata(SettingsMetadata useConsumerDisclosureMetadata) {
    this.useConsumerDisclosureMetadata = useConsumerDisclosureMetadata;
    return this;
  }

   /**
   * Get useConsumerDisclosureMetadata
   * @return useConsumerDisclosureMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getUseConsumerDisclosureMetadata() {
    return useConsumerDisclosureMetadata;
  }

  public void setUseConsumerDisclosureMetadata(SettingsMetadata useConsumerDisclosureMetadata) {
    this.useConsumerDisclosureMetadata = useConsumerDisclosureMetadata;
  }

  public AccountSettingsInformation useConsumerDisclosureWithinAccount(String useConsumerDisclosureWithinAccount) {
    this.useConsumerDisclosureWithinAccount = useConsumerDisclosureWithinAccount;
    return this;
  }

   /**
   * 
   * @return useConsumerDisclosureWithinAccount
  **/
  @ApiModelProperty(value = "")
  public String getUseConsumerDisclosureWithinAccount() {
    return useConsumerDisclosureWithinAccount;
  }

  public void setUseConsumerDisclosureWithinAccount(String useConsumerDisclosureWithinAccount) {
    this.useConsumerDisclosureWithinAccount = useConsumerDisclosureWithinAccount;
  }

  public AccountSettingsInformation useConsumerDisclosureWithinAccountMetadata(SettingsMetadata useConsumerDisclosureWithinAccountMetadata) {
    this.useConsumerDisclosureWithinAccountMetadata = useConsumerDisclosureWithinAccountMetadata;
    return this;
  }

   /**
   * Get useConsumerDisclosureWithinAccountMetadata
   * @return useConsumerDisclosureWithinAccountMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getUseConsumerDisclosureWithinAccountMetadata() {
    return useConsumerDisclosureWithinAccountMetadata;
  }

  public void setUseConsumerDisclosureWithinAccountMetadata(SettingsMetadata useConsumerDisclosureWithinAccountMetadata) {
    this.useConsumerDisclosureWithinAccountMetadata = useConsumerDisclosureWithinAccountMetadata;
  }

  public AccountSettingsInformation useDerivedKeys(String useDerivedKeys) {
    this.useDerivedKeys = useDerivedKeys;
    return this;
  }

   /**
   * 
   * @return useDerivedKeys
  **/
  @ApiModelProperty(value = "")
  public String getUseDerivedKeys() {
    return useDerivedKeys;
  }

  public void setUseDerivedKeys(String useDerivedKeys) {
    this.useDerivedKeys = useDerivedKeys;
  }

  public AccountSettingsInformation useDerivedKeysMetadata(SettingsMetadata useDerivedKeysMetadata) {
    this.useDerivedKeysMetadata = useDerivedKeysMetadata;
    return this;
  }

   /**
   * Get useDerivedKeysMetadata
   * @return useDerivedKeysMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getUseDerivedKeysMetadata() {
    return useDerivedKeysMetadata;
  }

  public void setUseDerivedKeysMetadata(SettingsMetadata useDerivedKeysMetadata) {
    this.useDerivedKeysMetadata = useDerivedKeysMetadata;
  }

  public AccountSettingsInformation useDocuSignExpressSignerCertificate(String useDocuSignExpressSignerCertificate) {
    this.useDocuSignExpressSignerCertificate = useDocuSignExpressSignerCertificate;
    return this;
  }

   /**
   * 
   * @return useDocuSignExpressSignerCertificate
  **/
  @ApiModelProperty(value = "")
  public String getUseDocuSignExpressSignerCertificate() {
    return useDocuSignExpressSignerCertificate;
  }

  public void setUseDocuSignExpressSignerCertificate(String useDocuSignExpressSignerCertificate) {
    this.useDocuSignExpressSignerCertificate = useDocuSignExpressSignerCertificate;
  }

  public AccountSettingsInformation useDocuSignExpressSignerCertificateMetadata(SettingsMetadata useDocuSignExpressSignerCertificateMetadata) {
    this.useDocuSignExpressSignerCertificateMetadata = useDocuSignExpressSignerCertificateMetadata;
    return this;
  }

   /**
   * Get useDocuSignExpressSignerCertificateMetadata
   * @return useDocuSignExpressSignerCertificateMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getUseDocuSignExpressSignerCertificateMetadata() {
    return useDocuSignExpressSignerCertificateMetadata;
  }

  public void setUseDocuSignExpressSignerCertificateMetadata(SettingsMetadata useDocuSignExpressSignerCertificateMetadata) {
    this.useDocuSignExpressSignerCertificateMetadata = useDocuSignExpressSignerCertificateMetadata;
  }

  public AccountSettingsInformation useMultiAppGroupsData(String useMultiAppGroupsData) {
    this.useMultiAppGroupsData = useMultiAppGroupsData;
    return this;
  }

   /**
   * 
   * @return useMultiAppGroupsData
  **/
  @ApiModelProperty(value = "")
  public String getUseMultiAppGroupsData() {
    return useMultiAppGroupsData;
  }

  public void setUseMultiAppGroupsData(String useMultiAppGroupsData) {
    this.useMultiAppGroupsData = useMultiAppGroupsData;
  }

  public AccountSettingsInformation useMultiAppGroupsDataMetadata(SettingsMetadata useMultiAppGroupsDataMetadata) {
    this.useMultiAppGroupsDataMetadata = useMultiAppGroupsDataMetadata;
    return this;
  }

   /**
   * Get useMultiAppGroupsDataMetadata
   * @return useMultiAppGroupsDataMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getUseMultiAppGroupsDataMetadata() {
    return useMultiAppGroupsDataMetadata;
  }

  public void setUseMultiAppGroupsDataMetadata(SettingsMetadata useMultiAppGroupsDataMetadata) {
    this.useMultiAppGroupsDataMetadata = useMultiAppGroupsDataMetadata;
  }

  public AccountSettingsInformation useNewBlobForPdf(String useNewBlobForPdf) {
    this.useNewBlobForPdf = useNewBlobForPdf;
    return this;
  }

   /**
   * 
   * @return useNewBlobForPdf
  **/
  @ApiModelProperty(value = "")
  public String getUseNewBlobForPdf() {
    return useNewBlobForPdf;
  }

  public void setUseNewBlobForPdf(String useNewBlobForPdf) {
    this.useNewBlobForPdf = useNewBlobForPdf;
  }

  public AccountSettingsInformation useNewBlobForPdfMetadata(SettingsMetadata useNewBlobForPdfMetadata) {
    this.useNewBlobForPdfMetadata = useNewBlobForPdfMetadata;
    return this;
  }

   /**
   * Get useNewBlobForPdfMetadata
   * @return useNewBlobForPdfMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getUseNewBlobForPdfMetadata() {
    return useNewBlobForPdfMetadata;
  }

  public void setUseNewBlobForPdfMetadata(SettingsMetadata useNewBlobForPdfMetadata) {
    this.useNewBlobForPdfMetadata = useNewBlobForPdfMetadata;
  }

  public AccountSettingsInformation useSAFESignerCertificates(String useSAFESignerCertificates) {
    this.useSAFESignerCertificates = useSAFESignerCertificates;
    return this;
  }

   /**
   * 
   * @return useSAFESignerCertificates
  **/
  @ApiModelProperty(value = "")
  public String getUseSAFESignerCertificates() {
    return useSAFESignerCertificates;
  }

  public void setUseSAFESignerCertificates(String useSAFESignerCertificates) {
    this.useSAFESignerCertificates = useSAFESignerCertificates;
  }

  public AccountSettingsInformation useSAFESignerCertificatesMetadata(SettingsMetadata useSAFESignerCertificatesMetadata) {
    this.useSAFESignerCertificatesMetadata = useSAFESignerCertificatesMetadata;
    return this;
  }

   /**
   * Get useSAFESignerCertificatesMetadata
   * @return useSAFESignerCertificatesMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getUseSAFESignerCertificatesMetadata() {
    return useSAFESignerCertificatesMetadata;
  }

  public void setUseSAFESignerCertificatesMetadata(SettingsMetadata useSAFESignerCertificatesMetadata) {
    this.useSAFESignerCertificatesMetadata = useSAFESignerCertificatesMetadata;
  }

  public AccountSettingsInformation usesAPI(String usesAPI) {
    this.usesAPI = usesAPI;
    return this;
  }

   /**
   * 
   * @return usesAPI
  **/
  @ApiModelProperty(value = "")
  public String getUsesAPI() {
    return usesAPI;
  }

  public void setUsesAPI(String usesAPI) {
    this.usesAPI = usesAPI;
  }

  public AccountSettingsInformation usesAPIMetadata(SettingsMetadata usesAPIMetadata) {
    this.usesAPIMetadata = usesAPIMetadata;
    return this;
  }

   /**
   * Get usesAPIMetadata
   * @return usesAPIMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getUsesAPIMetadata() {
    return usesAPIMetadata;
  }

  public void setUsesAPIMetadata(SettingsMetadata usesAPIMetadata) {
    this.usesAPIMetadata = usesAPIMetadata;
  }

  public AccountSettingsInformation useSignatureProviderPlatform(String useSignatureProviderPlatform) {
    this.useSignatureProviderPlatform = useSignatureProviderPlatform;
    return this;
  }

   /**
   * 
   * @return useSignatureProviderPlatform
  **/
  @ApiModelProperty(value = "")
  public String getUseSignatureProviderPlatform() {
    return useSignatureProviderPlatform;
  }

  public void setUseSignatureProviderPlatform(String useSignatureProviderPlatform) {
    this.useSignatureProviderPlatform = useSignatureProviderPlatform;
  }

  public AccountSettingsInformation useSignatureProviderPlatformMetadata(SettingsMetadata useSignatureProviderPlatformMetadata) {
    this.useSignatureProviderPlatformMetadata = useSignatureProviderPlatformMetadata;
    return this;
  }

   /**
   * Get useSignatureProviderPlatformMetadata
   * @return useSignatureProviderPlatformMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getUseSignatureProviderPlatformMetadata() {
    return useSignatureProviderPlatformMetadata;
  }

  public void setUseSignatureProviderPlatformMetadata(SettingsMetadata useSignatureProviderPlatformMetadata) {
    this.useSignatureProviderPlatformMetadata = useSignatureProviderPlatformMetadata;
  }

  public AccountSettingsInformation validationsAllowed(String validationsAllowed) {
    this.validationsAllowed = validationsAllowed;
    return this;
  }

   /**
   * 
   * @return validationsAllowed
  **/
  @ApiModelProperty(value = "")
  public String getValidationsAllowed() {
    return validationsAllowed;
  }

  public void setValidationsAllowed(String validationsAllowed) {
    this.validationsAllowed = validationsAllowed;
  }

  public AccountSettingsInformation validationsAllowedMetadata(SettingsMetadata validationsAllowedMetadata) {
    this.validationsAllowedMetadata = validationsAllowedMetadata;
    return this;
  }

   /**
   * Get validationsAllowedMetadata
   * @return validationsAllowedMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getValidationsAllowedMetadata() {
    return validationsAllowedMetadata;
  }

  public void setValidationsAllowedMetadata(SettingsMetadata validationsAllowedMetadata) {
    this.validationsAllowedMetadata = validationsAllowedMetadata;
  }

  public AccountSettingsInformation validationsBrand(String validationsBrand) {
    this.validationsBrand = validationsBrand;
    return this;
  }

   /**
   * 
   * @return validationsBrand
  **/
  @ApiModelProperty(value = "")
  public String getValidationsBrand() {
    return validationsBrand;
  }

  public void setValidationsBrand(String validationsBrand) {
    this.validationsBrand = validationsBrand;
  }

  public AccountSettingsInformation validationsBrandMetadata(SettingsMetadata validationsBrandMetadata) {
    this.validationsBrandMetadata = validationsBrandMetadata;
    return this;
  }

   /**
   * Get validationsBrandMetadata
   * @return validationsBrandMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getValidationsBrandMetadata() {
    return validationsBrandMetadata;
  }

  public void setValidationsBrandMetadata(SettingsMetadata validationsBrandMetadata) {
    this.validationsBrandMetadata = validationsBrandMetadata;
  }

  public AccountSettingsInformation validationsCadence(String validationsCadence) {
    this.validationsCadence = validationsCadence;
    return this;
  }

   /**
   * 
   * @return validationsCadence
  **/
  @ApiModelProperty(value = "")
  public String getValidationsCadence() {
    return validationsCadence;
  }

  public void setValidationsCadence(String validationsCadence) {
    this.validationsCadence = validationsCadence;
  }

  public AccountSettingsInformation validationsCadenceMetadata(SettingsMetadata validationsCadenceMetadata) {
    this.validationsCadenceMetadata = validationsCadenceMetadata;
    return this;
  }

   /**
   * Get validationsCadenceMetadata
   * @return validationsCadenceMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getValidationsCadenceMetadata() {
    return validationsCadenceMetadata;
  }

  public void setValidationsCadenceMetadata(SettingsMetadata validationsCadenceMetadata) {
    this.validationsCadenceMetadata = validationsCadenceMetadata;
  }

  public AccountSettingsInformation validationsEnabled(String validationsEnabled) {
    this.validationsEnabled = validationsEnabled;
    return this;
  }

   /**
   * 
   * @return validationsEnabled
  **/
  @ApiModelProperty(value = "")
  public String getValidationsEnabled() {
    return validationsEnabled;
  }

  public void setValidationsEnabled(String validationsEnabled) {
    this.validationsEnabled = validationsEnabled;
  }

  public AccountSettingsInformation validationsEnabledMetadata(SettingsMetadata validationsEnabledMetadata) {
    this.validationsEnabledMetadata = validationsEnabledMetadata;
    return this;
  }

   /**
   * Get validationsEnabledMetadata
   * @return validationsEnabledMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getValidationsEnabledMetadata() {
    return validationsEnabledMetadata;
  }

  public void setValidationsEnabledMetadata(SettingsMetadata validationsEnabledMetadata) {
    this.validationsEnabledMetadata = validationsEnabledMetadata;
  }

  public AccountSettingsInformation validationsReport(String validationsReport) {
    this.validationsReport = validationsReport;
    return this;
  }

   /**
   * 
   * @return validationsReport
  **/
  @ApiModelProperty(value = "")
  public String getValidationsReport() {
    return validationsReport;
  }

  public void setValidationsReport(String validationsReport) {
    this.validationsReport = validationsReport;
  }

  public AccountSettingsInformation validationsReportMetadata(SettingsMetadata validationsReportMetadata) {
    this.validationsReportMetadata = validationsReportMetadata;
    return this;
  }

   /**
   * Get validationsReportMetadata
   * @return validationsReportMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getValidationsReportMetadata() {
    return validationsReportMetadata;
  }

  public void setValidationsReportMetadata(SettingsMetadata validationsReportMetadata) {
    this.validationsReportMetadata = validationsReportMetadata;
  }

  public AccountSettingsInformation waterMarkEnabled(String waterMarkEnabled) {
    this.waterMarkEnabled = waterMarkEnabled;
    return this;
  }

   /**
   * 
   * @return waterMarkEnabled
  **/
  @ApiModelProperty(value = "")
  public String getWaterMarkEnabled() {
    return waterMarkEnabled;
  }

  public void setWaterMarkEnabled(String waterMarkEnabled) {
    this.waterMarkEnabled = waterMarkEnabled;
  }

  public AccountSettingsInformation waterMarkEnabledMetadata(SettingsMetadata waterMarkEnabledMetadata) {
    this.waterMarkEnabledMetadata = waterMarkEnabledMetadata;
    return this;
  }

   /**
   * Get waterMarkEnabledMetadata
   * @return waterMarkEnabledMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getWaterMarkEnabledMetadata() {
    return waterMarkEnabledMetadata;
  }

  public void setWaterMarkEnabledMetadata(SettingsMetadata waterMarkEnabledMetadata) {
    this.waterMarkEnabledMetadata = waterMarkEnabledMetadata;
  }

  public AccountSettingsInformation writeReminderToEnvelopeHistory(String writeReminderToEnvelopeHistory) {
    this.writeReminderToEnvelopeHistory = writeReminderToEnvelopeHistory;
    return this;
  }

   /**
   * 
   * @return writeReminderToEnvelopeHistory
  **/
  @ApiModelProperty(value = "")
  public String getWriteReminderToEnvelopeHistory() {
    return writeReminderToEnvelopeHistory;
  }

  public void setWriteReminderToEnvelopeHistory(String writeReminderToEnvelopeHistory) {
    this.writeReminderToEnvelopeHistory = writeReminderToEnvelopeHistory;
  }

  public AccountSettingsInformation writeReminderToEnvelopeHistoryMetadata(SettingsMetadata writeReminderToEnvelopeHistoryMetadata) {
    this.writeReminderToEnvelopeHistoryMetadata = writeReminderToEnvelopeHistoryMetadata;
    return this;
  }

   /**
   * Get writeReminderToEnvelopeHistoryMetadata
   * @return writeReminderToEnvelopeHistoryMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getWriteReminderToEnvelopeHistoryMetadata() {
    return writeReminderToEnvelopeHistoryMetadata;
  }

  public void setWriteReminderToEnvelopeHistoryMetadata(SettingsMetadata writeReminderToEnvelopeHistoryMetadata) {
    this.writeReminderToEnvelopeHistoryMetadata = writeReminderToEnvelopeHistoryMetadata;
  }

  public AccountSettingsInformation wurflMinAllowableScreenSize(String wurflMinAllowableScreenSize) {
    this.wurflMinAllowableScreenSize = wurflMinAllowableScreenSize;
    return this;
  }

   /**
   * 
   * @return wurflMinAllowableScreenSize
  **/
  @ApiModelProperty(value = "")
  public String getWurflMinAllowableScreenSize() {
    return wurflMinAllowableScreenSize;
  }

  public void setWurflMinAllowableScreenSize(String wurflMinAllowableScreenSize) {
    this.wurflMinAllowableScreenSize = wurflMinAllowableScreenSize;
  }

  public AccountSettingsInformation wurflMinAllowableScreenSizeMetadata(SettingsMetadata wurflMinAllowableScreenSizeMetadata) {
    this.wurflMinAllowableScreenSizeMetadata = wurflMinAllowableScreenSizeMetadata;
    return this;
  }

   /**
   * Get wurflMinAllowableScreenSizeMetadata
   * @return wurflMinAllowableScreenSizeMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getWurflMinAllowableScreenSizeMetadata() {
    return wurflMinAllowableScreenSizeMetadata;
  }

  public void setWurflMinAllowableScreenSizeMetadata(SettingsMetadata wurflMinAllowableScreenSizeMetadata) {
    this.wurflMinAllowableScreenSizeMetadata = wurflMinAllowableScreenSizeMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSettingsInformation accountSettingsInformation = (AccountSettingsInformation) o;
    return Objects.equals(this.accessCodeFormat, accountSettingsInformation.accessCodeFormat) &&
        Objects.equals(this.accountDateTimeFormat, accountSettingsInformation.accountDateTimeFormat) &&
        Objects.equals(this.accountDateTimeFormatMetadata, accountSettingsInformation.accountDateTimeFormatMetadata) &&
        Objects.equals(this.accountName, accountSettingsInformation.accountName) &&
        Objects.equals(this.accountNameMetadata, accountSettingsInformation.accountNameMetadata) &&
        Objects.equals(this.accountNotification, accountSettingsInformation.accountNotification) &&
        Objects.equals(this.accountUISettings, accountSettingsInformation.accountUISettings) &&
        Objects.equals(this.adoptSigConfig, accountSettingsInformation.adoptSigConfig) &&
        Objects.equals(this.adoptSigConfigMetadata, accountSettingsInformation.adoptSigConfigMetadata) &&
        Objects.equals(this.advancedCorrect, accountSettingsInformation.advancedCorrect) &&
        Objects.equals(this.advancedCorrectMetadata, accountSettingsInformation.advancedCorrectMetadata) &&
        Objects.equals(this.allowAccessCodeFormat, accountSettingsInformation.allowAccessCodeFormat) &&
        Objects.equals(this.allowAccessCodeFormatMetadata, accountSettingsInformation.allowAccessCodeFormatMetadata) &&
        Objects.equals(this.allowAccountManagementGranular, accountSettingsInformation.allowAccountManagementGranular) &&
        Objects.equals(this.allowAccountManagementGranularMetadata, accountSettingsInformation.allowAccountManagementGranularMetadata) &&
        Objects.equals(this.allowAccountMemberNameChange, accountSettingsInformation.allowAccountMemberNameChange) &&
        Objects.equals(this.allowAccountMemberNameChangeMetadata, accountSettingsInformation.allowAccountMemberNameChangeMetadata) &&
        Objects.equals(this.allowAdvancedRecipientRoutingConditional, accountSettingsInformation.allowAdvancedRecipientRoutingConditional) &&
        Objects.equals(this.allowAdvancedRecipientRoutingConditionalMetadata, accountSettingsInformation.allowAdvancedRecipientRoutingConditionalMetadata) &&
        Objects.equals(this.allowAgentNameEmailEdit, accountSettingsInformation.allowAgentNameEmailEdit) &&
        Objects.equals(this.allowAgentNameEmailEditMetadata, accountSettingsInformation.allowAgentNameEmailEditMetadata) &&
        Objects.equals(this.allowAgreementActions, accountSettingsInformation.allowAgreementActions) &&
        Objects.equals(this.allowAgreementActionsMetadata, accountSettingsInformation.allowAgreementActionsMetadata) &&
        Objects.equals(this.allowAutoNavSettings, accountSettingsInformation.allowAutoNavSettings) &&
        Objects.equals(this.allowAutoNavSettingsMetadata, accountSettingsInformation.allowAutoNavSettingsMetadata) &&
        Objects.equals(this.allowAutoTagging, accountSettingsInformation.allowAutoTagging) &&
        Objects.equals(this.allowAutoTaggingMetadata, accountSettingsInformation.allowAutoTaggingMetadata) &&
        Objects.equals(this.allowBulkSend, accountSettingsInformation.allowBulkSend) &&
        Objects.equals(this.allowBulkSendMetadata, accountSettingsInformation.allowBulkSendMetadata) &&
        Objects.equals(this.allowCDWithdraw, accountSettingsInformation.allowCDWithdraw) &&
        Objects.equals(this.allowCDWithdrawMetadata, accountSettingsInformation.allowCDWithdrawMetadata) &&
        Objects.equals(this.allowConnectHttpListenerConfigs, accountSettingsInformation.allowConnectHttpListenerConfigs) &&
        Objects.equals(this.allowConnectSendFinishLater, accountSettingsInformation.allowConnectSendFinishLater) &&
        Objects.equals(this.allowConnectSendFinishLaterMetadata, accountSettingsInformation.allowConnectSendFinishLaterMetadata) &&
        Objects.equals(this.allowConsumerDisclosureOverride, accountSettingsInformation.allowConsumerDisclosureOverride) &&
        Objects.equals(this.allowConsumerDisclosureOverrideMetadata, accountSettingsInformation.allowConsumerDisclosureOverrideMetadata) &&
        Objects.equals(this.allowDataDownload, accountSettingsInformation.allowDataDownload) &&
        Objects.equals(this.allowDataDownloadMetadata, accountSettingsInformation.allowDataDownloadMetadata) &&
        Objects.equals(this.allowDocumentDisclosures, accountSettingsInformation.allowDocumentDisclosures) &&
        Objects.equals(this.allowDocumentDisclosuresMetadata, accountSettingsInformation.allowDocumentDisclosuresMetadata) &&
        Objects.equals(this.allowDocumentsOnSignedEnvelopes, accountSettingsInformation.allowDocumentsOnSignedEnvelopes) &&
        Objects.equals(this.allowDocumentsOnSignedEnvelopesMetadata, accountSettingsInformation.allowDocumentsOnSignedEnvelopesMetadata) &&
        Objects.equals(this.allowDocumentVisibility, accountSettingsInformation.allowDocumentVisibility) &&
        Objects.equals(this.allowDocumentVisibilityMetadata, accountSettingsInformation.allowDocumentVisibilityMetadata) &&
        Objects.equals(this.allowEHankoStamps, accountSettingsInformation.allowEHankoStamps) &&
        Objects.equals(this.allowEHankoStampsMetadata, accountSettingsInformation.allowEHankoStampsMetadata) &&
        Objects.equals(this.allowENoteEOriginal, accountSettingsInformation.allowENoteEOriginal) &&
        Objects.equals(this.allowENoteEOriginalMetadata, accountSettingsInformation.allowENoteEOriginalMetadata) &&
        Objects.equals(this.allowEnvelopeCorrect, accountSettingsInformation.allowEnvelopeCorrect) &&
        Objects.equals(this.allowEnvelopeCorrectMetadata, accountSettingsInformation.allowEnvelopeCorrectMetadata) &&
        Objects.equals(this.allowEnvelopeCustodyTransfer, accountSettingsInformation.allowEnvelopeCustodyTransfer) &&
        Objects.equals(this.allowEnvelopeCustodyTransferMetadata, accountSettingsInformation.allowEnvelopeCustodyTransferMetadata) &&
        Objects.equals(this.allowEnvelopeCustomFields, accountSettingsInformation.allowEnvelopeCustomFields) &&
        Objects.equals(this.allowEnvelopeCustomFieldsMetadata, accountSettingsInformation.allowEnvelopeCustomFieldsMetadata) &&
        Objects.equals(this.allowEnvelopePublishReporting, accountSettingsInformation.allowEnvelopePublishReporting) &&
        Objects.equals(this.allowEnvelopePublishReportingMetadata, accountSettingsInformation.allowEnvelopePublishReportingMetadata) &&
        Objects.equals(this.allowEnvelopeReporting, accountSettingsInformation.allowEnvelopeReporting) &&
        Objects.equals(this.allowEnvelopeReportingMetadata, accountSettingsInformation.allowEnvelopeReportingMetadata) &&
        Objects.equals(this.allowExpression, accountSettingsInformation.allowExpression) &&
        Objects.equals(this.allowExpressionMetadata, accountSettingsInformation.allowExpressionMetadata) &&
        Objects.equals(this.allowExpressSignerCertificate, accountSettingsInformation.allowExpressSignerCertificate) &&
        Objects.equals(this.allowExpressSignerCertificateMetadata, accountSettingsInformation.allowExpressSignerCertificateMetadata) &&
        Objects.equals(this.allowExtendedSendingResourceFile, accountSettingsInformation.allowExtendedSendingResourceFile) &&
        Objects.equals(this.allowExtendedSendingResourceFileMetadata, accountSettingsInformation.allowExtendedSendingResourceFileMetadata) &&
        Objects.equals(this.allowExternalSignaturePad, accountSettingsInformation.allowExternalSignaturePad) &&
        Objects.equals(this.allowExternalSignaturePadMetadata, accountSettingsInformation.allowExternalSignaturePadMetadata) &&
        Objects.equals(this.allowIDVLevel1, accountSettingsInformation.allowIDVLevel1) &&
        Objects.equals(this.allowIDVLevel1Metadata, accountSettingsInformation.allowIDVLevel1Metadata) &&
        Objects.equals(this.allowIDVPlatform, accountSettingsInformation.allowIDVPlatform) &&
        Objects.equals(this.allowIDVPlatformMetadata, accountSettingsInformation.allowIDVPlatformMetadata) &&
        Objects.equals(this.allowInPerson, accountSettingsInformation.allowInPerson) &&
        Objects.equals(this.allowInPersonMetadata, accountSettingsInformation.allowInPersonMetadata) &&
        Objects.equals(this.allowManagedStamps, accountSettingsInformation.allowManagedStamps) &&
        Objects.equals(this.allowManagedStampsMetadata, accountSettingsInformation.allowManagedStampsMetadata) &&
        Objects.equals(this.allowMarkup, accountSettingsInformation.allowMarkup) &&
        Objects.equals(this.allowMarkupMetadata, accountSettingsInformation.allowMarkupMetadata) &&
        Objects.equals(this.allowMemberTimeZone, accountSettingsInformation.allowMemberTimeZone) &&
        Objects.equals(this.allowMemberTimeZoneMetadata, accountSettingsInformation.allowMemberTimeZoneMetadata) &&
        Objects.equals(this.allowMergeFields, accountSettingsInformation.allowMergeFields) &&
        Objects.equals(this.allowMergeFieldsMetadata, accountSettingsInformation.allowMergeFieldsMetadata) &&
        Objects.equals(this.allowMultipleBrandProfiles, accountSettingsInformation.allowMultipleBrandProfiles) &&
        Objects.equals(this.allowMultipleBrandProfilesMetadata, accountSettingsInformation.allowMultipleBrandProfilesMetadata) &&
        Objects.equals(this.allowMultipleSignerAttachments, accountSettingsInformation.allowMultipleSignerAttachments) &&
        Objects.equals(this.allowMultipleSignerAttachmentsMetadata, accountSettingsInformation.allowMultipleSignerAttachmentsMetadata) &&
        Objects.equals(this.allowNonUSPhoneAuth, accountSettingsInformation.allowNonUSPhoneAuth) &&
        Objects.equals(this.allowNonUSPhoneAuthMetadata, accountSettingsInformation.allowNonUSPhoneAuthMetadata) &&
        Objects.equals(this.allowOcrOfEnvelopeDocuments, accountSettingsInformation.allowOcrOfEnvelopeDocuments) &&
        Objects.equals(this.allowOcrOfEnvelopeDocumentsMetadata, accountSettingsInformation.allowOcrOfEnvelopeDocumentsMetadata) &&
        Objects.equals(this.allowOfflineSigning, accountSettingsInformation.allowOfflineSigning) &&
        Objects.equals(this.allowOfflineSigningMetadata, accountSettingsInformation.allowOfflineSigningMetadata) &&
        Objects.equals(this.allowOpenTrustSignerCertificate, accountSettingsInformation.allowOpenTrustSignerCertificate) &&
        Objects.equals(this.allowOpenTrustSignerCertificateMetadata, accountSettingsInformation.allowOpenTrustSignerCertificateMetadata) &&
        Objects.equals(this.allowOrganizations, accountSettingsInformation.allowOrganizations) &&
        Objects.equals(this.allowOrganizationsMetadata, accountSettingsInformation.allowOrganizationsMetadata) &&
        Objects.equals(this.allowPaymentProcessing, accountSettingsInformation.allowPaymentProcessing) &&
        Objects.equals(this.allowPaymentProcessingMetadata, accountSettingsInformation.allowPaymentProcessingMetadata) &&
        Objects.equals(this.allowPersonalSignerCertificate, accountSettingsInformation.allowPersonalSignerCertificate) &&
        Objects.equals(this.allowPersonalSignerCertificateMetadata, accountSettingsInformation.allowPersonalSignerCertificateMetadata) &&
        Objects.equals(this.allowPhoneAuthentication, accountSettingsInformation.allowPhoneAuthentication) &&
        Objects.equals(this.allowPhoneAuthenticationMetadata, accountSettingsInformation.allowPhoneAuthenticationMetadata) &&
        Objects.equals(this.allowPhoneAuthOverride, accountSettingsInformation.allowPhoneAuthOverride) &&
        Objects.equals(this.allowPhoneAuthOverrideMetadata, accountSettingsInformation.allowPhoneAuthOverrideMetadata) &&
        Objects.equals(this.allowPrivateSigningGroups, accountSettingsInformation.allowPrivateSigningGroups) &&
        Objects.equals(this.allowPrivateSigningGroupsMetadata, accountSettingsInformation.allowPrivateSigningGroupsMetadata) &&
        Objects.equals(this.allowReminders, accountSettingsInformation.allowReminders) &&
        Objects.equals(this.allowRemindersMetadata, accountSettingsInformation.allowRemindersMetadata) &&
        Objects.equals(this.allowResourceFileBranding, accountSettingsInformation.allowResourceFileBranding) &&
        Objects.equals(this.allowResourceFileBrandingMetadata, accountSettingsInformation.allowResourceFileBrandingMetadata) &&
        Objects.equals(this.allowSafeBioPharmaSignerCertificate, accountSettingsInformation.allowSafeBioPharmaSignerCertificate) &&
        Objects.equals(this.allowSafeBioPharmaSignerCertificateMetadata, accountSettingsInformation.allowSafeBioPharmaSignerCertificateMetadata) &&
        Objects.equals(this.allowSecurityAppliance, accountSettingsInformation.allowSecurityAppliance) &&
        Objects.equals(this.allowSecurityApplianceMetadata, accountSettingsInformation.allowSecurityApplianceMetadata) &&
        Objects.equals(this.allowSendToCertifiedDelivery, accountSettingsInformation.allowSendToCertifiedDelivery) &&
        Objects.equals(this.allowSendToCertifiedDeliveryMetadata, accountSettingsInformation.allowSendToCertifiedDeliveryMetadata) &&
        Objects.equals(this.allowSendToIntermediary, accountSettingsInformation.allowSendToIntermediary) &&
        Objects.equals(this.allowSendToIntermediaryMetadata, accountSettingsInformation.allowSendToIntermediaryMetadata) &&
        Objects.equals(this.allowServerTemplates, accountSettingsInformation.allowServerTemplates) &&
        Objects.equals(this.allowServerTemplatesMetadata, accountSettingsInformation.allowServerTemplatesMetadata) &&
        Objects.equals(this.allowSetEmbeddedRecipientStartURL, accountSettingsInformation.allowSetEmbeddedRecipientStartURL) &&
        Objects.equals(this.allowSetEmbeddedRecipientStartURLMetadata, accountSettingsInformation.allowSetEmbeddedRecipientStartURLMetadata) &&
        Objects.equals(this.allowSharedTabs, accountSettingsInformation.allowSharedTabs) &&
        Objects.equals(this.allowSharedTabsMetadata, accountSettingsInformation.allowSharedTabsMetadata) &&
        Objects.equals(this.allowSignatureStamps, accountSettingsInformation.allowSignatureStamps) &&
        Objects.equals(this.allowSignatureStampsMetadata, accountSettingsInformation.allowSignatureStampsMetadata) &&
        Objects.equals(this.allowSignDocumentFromHomePage, accountSettingsInformation.allowSignDocumentFromHomePage) &&
        Objects.equals(this.allowSignDocumentFromHomePageMetadata, accountSettingsInformation.allowSignDocumentFromHomePageMetadata) &&
        Objects.equals(this.allowSignerReassign, accountSettingsInformation.allowSignerReassign) &&
        Objects.equals(this.allowSignerReassignMetadata, accountSettingsInformation.allowSignerReassignMetadata) &&
        Objects.equals(this.allowSignerReassignOverride, accountSettingsInformation.allowSignerReassignOverride) &&
        Objects.equals(this.allowSignerReassignOverrideMetadata, accountSettingsInformation.allowSignerReassignOverrideMetadata) &&
        Objects.equals(this.allowSigningExtensions, accountSettingsInformation.allowSigningExtensions) &&
        Objects.equals(this.allowSigningExtensionsMetadata, accountSettingsInformation.allowSigningExtensionsMetadata) &&
        Objects.equals(this.allowSigningGroups, accountSettingsInformation.allowSigningGroups) &&
        Objects.equals(this.allowSigningGroupsMetadata, accountSettingsInformation.allowSigningGroupsMetadata) &&
        Objects.equals(this.allowSigningRadioDeselect, accountSettingsInformation.allowSigningRadioDeselect) &&
        Objects.equals(this.allowSigningRadioDeselectMetadata, accountSettingsInformation.allowSigningRadioDeselectMetadata) &&
        Objects.equals(this.allowSignNow, accountSettingsInformation.allowSignNow) &&
        Objects.equals(this.allowSignNowMetadata, accountSettingsInformation.allowSignNowMetadata) &&
        Objects.equals(this.allowSMSDelivery, accountSettingsInformation.allowSMSDelivery) &&
        Objects.equals(this.allowSMSDeliveryMetadata, accountSettingsInformation.allowSMSDeliveryMetadata) &&
        Objects.equals(this.allowSocialIdLogin, accountSettingsInformation.allowSocialIdLogin) &&
        Objects.equals(this.allowSocialIdLoginMetadata, accountSettingsInformation.allowSocialIdLoginMetadata) &&
        Objects.equals(this.allowSupplementalDocuments, accountSettingsInformation.allowSupplementalDocuments) &&
        Objects.equals(this.allowSupplementalDocumentsMetadata, accountSettingsInformation.allowSupplementalDocumentsMetadata) &&
        Objects.equals(this.allowUsersToAccessDirectory, accountSettingsInformation.allowUsersToAccessDirectory) &&
        Objects.equals(this.allowUsersToAccessDirectoryMetadata, accountSettingsInformation.allowUsersToAccessDirectoryMetadata) &&
        Objects.equals(this.allowValueInsights, accountSettingsInformation.allowValueInsights) &&
        Objects.equals(this.allowValueInsightsMetadata, accountSettingsInformation.allowValueInsightsMetadata) &&
        Objects.equals(this.anchorPopulationScope, accountSettingsInformation.anchorPopulationScope) &&
        Objects.equals(this.anchorPopulationScopeMetadata, accountSettingsInformation.anchorPopulationScopeMetadata) &&
        Objects.equals(this.anchorTagVersionedPlacementEnabled, accountSettingsInformation.anchorTagVersionedPlacementEnabled) &&
        Objects.equals(this.anchorTagVersionedPlacementMetadataEnabled, accountSettingsInformation.anchorTagVersionedPlacementMetadataEnabled) &&
        Objects.equals(this.attachCompletedEnvelope, accountSettingsInformation.attachCompletedEnvelope) &&
        Objects.equals(this.attachCompletedEnvelopeMetadata, accountSettingsInformation.attachCompletedEnvelopeMetadata) &&
        Objects.equals(this.authenticationCheck, accountSettingsInformation.authenticationCheck) &&
        Objects.equals(this.authenticationCheckMetadata, accountSettingsInformation.authenticationCheckMetadata) &&
        Objects.equals(this.autoNavRule, accountSettingsInformation.autoNavRule) &&
        Objects.equals(this.autoNavRuleMetadata, accountSettingsInformation.autoNavRuleMetadata) &&
        Objects.equals(this.autoProvisionSignerAccount, accountSettingsInformation.autoProvisionSignerAccount) &&
        Objects.equals(this.autoProvisionSignerAccountMetadata, accountSettingsInformation.autoProvisionSignerAccountMetadata) &&
        Objects.equals(this.bccEmailArchive, accountSettingsInformation.bccEmailArchive) &&
        Objects.equals(this.bccEmailArchiveMetadata, accountSettingsInformation.bccEmailArchiveMetadata) &&
        Objects.equals(this.betaSwitchConfiguration, accountSettingsInformation.betaSwitchConfiguration) &&
        Objects.equals(this.betaSwitchConfigurationMetadata, accountSettingsInformation.betaSwitchConfigurationMetadata) &&
        Objects.equals(this.billingAddress, accountSettingsInformation.billingAddress) &&
        Objects.equals(this.billingAddressMetadata, accountSettingsInformation.billingAddressMetadata) &&
        Objects.equals(this.bulkSend, accountSettingsInformation.bulkSend) &&
        Objects.equals(this.bulkSendMaxCopiesInBatch, accountSettingsInformation.bulkSendMaxCopiesInBatch) &&
        Objects.equals(this.bulkSendMaxUnprocessedEnvelopesCount, accountSettingsInformation.bulkSendMaxUnprocessedEnvelopesCount) &&
        Objects.equals(this.bulkSendMetadata, accountSettingsInformation.bulkSendMetadata) &&
        Objects.equals(this.canSelfBrandSend, accountSettingsInformation.canSelfBrandSend) &&
        Objects.equals(this.canSelfBrandSendMetadata, accountSettingsInformation.canSelfBrandSendMetadata) &&
        Objects.equals(this.canSelfBrandSign, accountSettingsInformation.canSelfBrandSign) &&
        Objects.equals(this.canSelfBrandSignMetadata, accountSettingsInformation.canSelfBrandSignMetadata) &&
        Objects.equals(this.canUseSalesforceOAuth, accountSettingsInformation.canUseSalesforceOAuth) &&
        Objects.equals(this.canUseSalesforceOAuthMetadata, accountSettingsInformation.canUseSalesforceOAuthMetadata) &&
        Objects.equals(this.captureVoiceRecording, accountSettingsInformation.captureVoiceRecording) &&
        Objects.equals(this.captureVoiceRecordingMetadata, accountSettingsInformation.captureVoiceRecordingMetadata) &&
        Objects.equals(this.cfrUseWideImage, accountSettingsInformation.cfrUseWideImage) &&
        Objects.equals(this.cfrUseWideImageMetadata, accountSettingsInformation.cfrUseWideImageMetadata) &&
        Objects.equals(this.checkForMultipleAdminsOnAccount, accountSettingsInformation.checkForMultipleAdminsOnAccount) &&
        Objects.equals(this.checkForMultipleAdminsOnAccountMetadata, accountSettingsInformation.checkForMultipleAdminsOnAccountMetadata) &&
        Objects.equals(this.chromeSignatureEnabled, accountSettingsInformation.chromeSignatureEnabled) &&
        Objects.equals(this.chromeSignatureEnabledMetadata, accountSettingsInformation.chromeSignatureEnabledMetadata) &&
        Objects.equals(this.commentEmailShowMessageText, accountSettingsInformation.commentEmailShowMessageText) &&
        Objects.equals(this.commentEmailShowMessageTextMetadata, accountSettingsInformation.commentEmailShowMessageTextMetadata) &&
        Objects.equals(this.commentsAllowEnvelopeOverride, accountSettingsInformation.commentsAllowEnvelopeOverride) &&
        Objects.equals(this.commentsAllowEnvelopeOverrideMetadata, accountSettingsInformation.commentsAllowEnvelopeOverrideMetadata) &&
        Objects.equals(this.conditionalFieldsEnabled, accountSettingsInformation.conditionalFieldsEnabled) &&
        Objects.equals(this.conditionalFieldsEnabledMetadata, accountSettingsInformation.conditionalFieldsEnabledMetadata) &&
        Objects.equals(this.consumerDisclosureFrequency, accountSettingsInformation.consumerDisclosureFrequency) &&
        Objects.equals(this.consumerDisclosureFrequencyMetadata, accountSettingsInformation.consumerDisclosureFrequencyMetadata) &&
        Objects.equals(this.convertPdfFields, accountSettingsInformation.convertPdfFields) &&
        Objects.equals(this.convertPdfFieldsMetadata, accountSettingsInformation.convertPdfFieldsMetadata) &&
        Objects.equals(this.dataPopulationScope, accountSettingsInformation.dataPopulationScope) &&
        Objects.equals(this.dataPopulationScopeMetadata, accountSettingsInformation.dataPopulationScopeMetadata) &&
        Objects.equals(this.disableMobileApp, accountSettingsInformation.disableMobileApp) &&
        Objects.equals(this.disableMobileAppMetadata, accountSettingsInformation.disableMobileAppMetadata) &&
        Objects.equals(this.disableMobilePushNotifications, accountSettingsInformation.disableMobilePushNotifications) &&
        Objects.equals(this.disableMobilePushNotificationsMetadata, accountSettingsInformation.disableMobilePushNotificationsMetadata) &&
        Objects.equals(this.disableMobileSending, accountSettingsInformation.disableMobileSending) &&
        Objects.equals(this.disableMobileSendingMetadata, accountSettingsInformation.disableMobileSendingMetadata) &&
        Objects.equals(this.disableMultipleSessions, accountSettingsInformation.disableMultipleSessions) &&
        Objects.equals(this.disableMultipleSessionsMetadata, accountSettingsInformation.disableMultipleSessionsMetadata) &&
        Objects.equals(this.disablePurgeNotificationsForSenderMetadata, accountSettingsInformation.disablePurgeNotificationsForSenderMetadata) &&
        Objects.equals(this.disableSignerCertView, accountSettingsInformation.disableSignerCertView) &&
        Objects.equals(this.disableSignerCertViewMetadata, accountSettingsInformation.disableSignerCertViewMetadata) &&
        Objects.equals(this.disableSignerHistoryView, accountSettingsInformation.disableSignerHistoryView) &&
        Objects.equals(this.disableSignerHistoryViewMetadata, accountSettingsInformation.disableSignerHistoryViewMetadata) &&
        Objects.equals(this.disableStyleSignature, accountSettingsInformation.disableStyleSignature) &&
        Objects.equals(this.disableStyleSignatureMetadata, accountSettingsInformation.disableStyleSignatureMetadata) &&
        Objects.equals(this.disableUploadSignature, accountSettingsInformation.disableUploadSignature) &&
        Objects.equals(this.disableUploadSignatureMetadata, accountSettingsInformation.disableUploadSignatureMetadata) &&
        Objects.equals(this.disableUserSharing, accountSettingsInformation.disableUserSharing) &&
        Objects.equals(this.disableUserSharingMetadata, accountSettingsInformation.disableUserSharingMetadata) &&
        Objects.equals(this.displayBetaSwitch, accountSettingsInformation.displayBetaSwitch) &&
        Objects.equals(this.displayBetaSwitchMetadata, accountSettingsInformation.displayBetaSwitchMetadata) &&
        Objects.equals(this.documentConversionRestrictions, accountSettingsInformation.documentConversionRestrictions) &&
        Objects.equals(this.documentConversionRestrictionsMetadata, accountSettingsInformation.documentConversionRestrictionsMetadata) &&
        Objects.equals(this.documentRetention, accountSettingsInformation.documentRetention) &&
        Objects.equals(this.documentRetentionMetadata, accountSettingsInformation.documentRetentionMetadata) &&
        Objects.equals(this.documentRetentionPurgeTabs, accountSettingsInformation.documentRetentionPurgeTabs) &&
        Objects.equals(this.documentVisibility, accountSettingsInformation.documentVisibility) &&
        Objects.equals(this.documentVisibilityMetadata, accountSettingsInformation.documentVisibilityMetadata) &&
        Objects.equals(this.emailTemplateVersion, accountSettingsInformation.emailTemplateVersion) &&
        Objects.equals(this.emailTemplateVersionMetadata, accountSettingsInformation.emailTemplateVersionMetadata) &&
        Objects.equals(this.enableAccessCodeGenerator, accountSettingsInformation.enableAccessCodeGenerator) &&
        Objects.equals(this.enableAccessCodeGeneratorMetadata, accountSettingsInformation.enableAccessCodeGeneratorMetadata) &&
        Objects.equals(this.enableAdvancedPayments, accountSettingsInformation.enableAdvancedPayments) &&
        Objects.equals(this.enableAdvancedPaymentsMetadata, accountSettingsInformation.enableAdvancedPaymentsMetadata) &&
        Objects.equals(this.enableAdvancedPowerForms, accountSettingsInformation.enableAdvancedPowerForms) &&
        Objects.equals(this.enableAdvancedPowerFormsMetadata, accountSettingsInformation.enableAdvancedPowerFormsMetadata) &&
        Objects.equals(this.enableAutoNav, accountSettingsInformation.enableAutoNav) &&
        Objects.equals(this.enableAutoNavMetadata, accountSettingsInformation.enableAutoNavMetadata) &&
        Objects.equals(this.enableCalculatedFields, accountSettingsInformation.enableCalculatedFields) &&
        Objects.equals(this.enableCalculatedFieldsMetadata, accountSettingsInformation.enableCalculatedFieldsMetadata) &&
        Objects.equals(this.enableClickwraps, accountSettingsInformation.enableClickwraps) &&
        Objects.equals(this.enableClickwrapsMetadata, accountSettingsInformation.enableClickwrapsMetadata) &&
        Objects.equals(this.enableCommentsHistoryDownloadInSigning, accountSettingsInformation.enableCommentsHistoryDownloadInSigning) &&
        Objects.equals(this.enableCommentsHistoryDownloadInSigningMetadata, accountSettingsInformation.enableCommentsHistoryDownloadInSigningMetadata) &&
        Objects.equals(this.enableCustomerSatisfactionMetricTracking, accountSettingsInformation.enableCustomerSatisfactionMetricTracking) &&
        Objects.equals(this.enableCustomerSatisfactionMetricTrackingMetadata, accountSettingsInformation.enableCustomerSatisfactionMetricTrackingMetadata) &&
        Objects.equals(this.enableDSPro, accountSettingsInformation.enableDSPro) &&
        Objects.equals(this.enableDSProMetadata, accountSettingsInformation.enableDSProMetadata) &&
        Objects.equals(this.enableEnvelopeStampingByAccountAdmin, accountSettingsInformation.enableEnvelopeStampingByAccountAdmin) &&
        Objects.equals(this.enableEnvelopeStampingByAccountAdminMetadata, accountSettingsInformation.enableEnvelopeStampingByAccountAdminMetadata) &&
        Objects.equals(this.enableEnvelopeStampingByDSAdmin, accountSettingsInformation.enableEnvelopeStampingByDSAdmin) &&
        Objects.equals(this.enableEnvelopeStampingByDSAdminMetadata, accountSettingsInformation.enableEnvelopeStampingByDSAdminMetadata) &&
        Objects.equals(this.enableInBrowserEditor, accountSettingsInformation.enableInBrowserEditor) &&
        Objects.equals(this.enableInBrowserEditorMetadata, accountSettingsInformation.enableInBrowserEditorMetadata) &&
        Objects.equals(this.enablePaymentProcessing, accountSettingsInformation.enablePaymentProcessing) &&
        Objects.equals(this.enablePaymentProcessingMetadata, accountSettingsInformation.enablePaymentProcessingMetadata) &&
        Objects.equals(this.enablePowerForm, accountSettingsInformation.enablePowerForm) &&
        Objects.equals(this.enablePowerFormDirect, accountSettingsInformation.enablePowerFormDirect) &&
        Objects.equals(this.enablePowerFormDirectMetadata, accountSettingsInformation.enablePowerFormDirectMetadata) &&
        Objects.equals(this.enablePowerFormMetadata, accountSettingsInformation.enablePowerFormMetadata) &&
        Objects.equals(this.enableRecipientDomainValidation, accountSettingsInformation.enableRecipientDomainValidation) &&
        Objects.equals(this.enableRecipientDomainValidationMetadata, accountSettingsInformation.enableRecipientDomainValidationMetadata) &&
        Objects.equals(this.enableReportLinks, accountSettingsInformation.enableReportLinks) &&
        Objects.equals(this.enableReportLinksMetadata, accountSettingsInformation.enableReportLinksMetadata) &&
        Objects.equals(this.enableRequireSignOnPaper, accountSettingsInformation.enableRequireSignOnPaper) &&
        Objects.equals(this.enableRequireSignOnPaperMetadata, accountSettingsInformation.enableRequireSignOnPaperMetadata) &&
        Objects.equals(this.enableReservedDomain, accountSettingsInformation.enableReservedDomain) &&
        Objects.equals(this.enableReservedDomainMetadata, accountSettingsInformation.enableReservedDomainMetadata) &&
        Objects.equals(this.enableResponsiveSigning, accountSettingsInformation.enableResponsiveSigning) &&
        Objects.equals(this.enableResponsiveSigningMetadata, accountSettingsInformation.enableResponsiveSigningMetadata) &&
        Objects.equals(this.enableScheduledRelease, accountSettingsInformation.enableScheduledRelease) &&
        Objects.equals(this.enableScheduledReleaseMetadata, accountSettingsInformation.enableScheduledReleaseMetadata) &&
        Objects.equals(this.enableSearchUI, accountSettingsInformation.enableSearchUI) &&
        Objects.equals(this.enableSearchUIMetadata, accountSettingsInformation.enableSearchUIMetadata) &&
        Objects.equals(this.enableSendingTagsFontSettings, accountSettingsInformation.enableSendingTagsFontSettings) &&
        Objects.equals(this.enableSendingTagsFontSettingsMetadata, accountSettingsInformation.enableSendingTagsFontSettingsMetadata) &&
        Objects.equals(this.enableSendToAgent, accountSettingsInformation.enableSendToAgent) &&
        Objects.equals(this.enableSendToAgentMetadata, accountSettingsInformation.enableSendToAgentMetadata) &&
        Objects.equals(this.enableSendToIntermediary, accountSettingsInformation.enableSendToIntermediary) &&
        Objects.equals(this.enableSendToIntermediaryMetadata, accountSettingsInformation.enableSendToIntermediaryMetadata) &&
        Objects.equals(this.enableSendToManage, accountSettingsInformation.enableSendToManage) &&
        Objects.equals(this.enableSendToManageMetadata, accountSettingsInformation.enableSendToManageMetadata) &&
        Objects.equals(this.enableSequentialSigningAPI, accountSettingsInformation.enableSequentialSigningAPI) &&
        Objects.equals(this.enableSequentialSigningAPIMetadata, accountSettingsInformation.enableSequentialSigningAPIMetadata) &&
        Objects.equals(this.enableSequentialSigningUI, accountSettingsInformation.enableSequentialSigningUI) &&
        Objects.equals(this.enableSequentialSigningUIMetadata, accountSettingsInformation.enableSequentialSigningUIMetadata) &&
        Objects.equals(this.enableSignerAttachments, accountSettingsInformation.enableSignerAttachments) &&
        Objects.equals(this.enableSignerAttachmentsMetadata, accountSettingsInformation.enableSignerAttachmentsMetadata) &&
        Objects.equals(this.enableSigningExtensionComments, accountSettingsInformation.enableSigningExtensionComments) &&
        Objects.equals(this.enableSigningExtensionCommentsMetadata, accountSettingsInformation.enableSigningExtensionCommentsMetadata) &&
        Objects.equals(this.enableSigningExtensionConversations, accountSettingsInformation.enableSigningExtensionConversations) &&
        Objects.equals(this.enableSigningExtensionConversationsMetadata, accountSettingsInformation.enableSigningExtensionConversationsMetadata) &&
        Objects.equals(this.enableSigningOrderSettingsForAccount, accountSettingsInformation.enableSigningOrderSettingsForAccount) &&
        Objects.equals(this.enableSigningOrderSettingsForAccountMetadata, accountSettingsInformation.enableSigningOrderSettingsForAccountMetadata) &&
        Objects.equals(this.enableSignOnPaper, accountSettingsInformation.enableSignOnPaper) &&
        Objects.equals(this.enableSignOnPaperMetadata, accountSettingsInformation.enableSignOnPaperMetadata) &&
        Objects.equals(this.enableSignOnPaperOverride, accountSettingsInformation.enableSignOnPaperOverride) &&
        Objects.equals(this.enableSignOnPaperOverrideMetadata, accountSettingsInformation.enableSignOnPaperOverrideMetadata) &&
        Objects.equals(this.enableSignWithNotary, accountSettingsInformation.enableSignWithNotary) &&
        Objects.equals(this.enableSignWithNotaryMetadata, accountSettingsInformation.enableSignWithNotaryMetadata) &&
        Objects.equals(this.enableSmartContracts, accountSettingsInformation.enableSmartContracts) &&
        Objects.equals(this.enableSmartContractsMetadata, accountSettingsInformation.enableSmartContractsMetadata) &&
        Objects.equals(this.enableSMSAuthentication, accountSettingsInformation.enableSMSAuthentication) &&
        Objects.equals(this.enableSMSAuthenticationMetadata, accountSettingsInformation.enableSMSAuthenticationMetadata) &&
        Objects.equals(this.enableSocialIdLogin, accountSettingsInformation.enableSocialIdLogin) &&
        Objects.equals(this.enableSocialIdLoginMetadata, accountSettingsInformation.enableSocialIdLoginMetadata) &&
        Objects.equals(this.enableStrikeThrough, accountSettingsInformation.enableStrikeThrough) &&
        Objects.equals(this.enableStrikeThroughMetadata, accountSettingsInformation.enableStrikeThroughMetadata) &&
        Objects.equals(this.enableTransactionPoint, accountSettingsInformation.enableTransactionPoint) &&
        Objects.equals(this.enableTransactionPointMetadata, accountSettingsInformation.enableTransactionPointMetadata) &&
        Objects.equals(this.enableVaulting, accountSettingsInformation.enableVaulting) &&
        Objects.equals(this.enableVaultingMetadata, accountSettingsInformation.enableVaultingMetadata) &&
        Objects.equals(this.enableWitnessing, accountSettingsInformation.enableWitnessing) &&
        Objects.equals(this.enableWitnessingMetadata, accountSettingsInformation.enableWitnessingMetadata) &&
        Objects.equals(this.enforceTemplateNameUniqueness, accountSettingsInformation.enforceTemplateNameUniqueness) &&
        Objects.equals(this.enforceTemplateNameUniquenessMetadata, accountSettingsInformation.enforceTemplateNameUniquenessMetadata) &&
        Objects.equals(this.envelopeIntegrationAllowed, accountSettingsInformation.envelopeIntegrationAllowed) &&
        Objects.equals(this.envelopeIntegrationAllowedMetadata, accountSettingsInformation.envelopeIntegrationAllowedMetadata) &&
        Objects.equals(this.envelopeIntegrationEnabled, accountSettingsInformation.envelopeIntegrationEnabled) &&
        Objects.equals(this.envelopeIntegrationEnabledMetadata, accountSettingsInformation.envelopeIntegrationEnabledMetadata) &&
        Objects.equals(this.envelopeStampingDefaultValue, accountSettingsInformation.envelopeStampingDefaultValue) &&
        Objects.equals(this.envelopeStampingDefaultValueMetadata, accountSettingsInformation.envelopeStampingDefaultValueMetadata) &&
        Objects.equals(this.expressSend, accountSettingsInformation.expressSend) &&
        Objects.equals(this.expressSendAllowTabs, accountSettingsInformation.expressSendAllowTabs) &&
        Objects.equals(this.expressSendAllowTabsMetadata, accountSettingsInformation.expressSendAllowTabsMetadata) &&
        Objects.equals(this.expressSendMetadata, accountSettingsInformation.expressSendMetadata) &&
        Objects.equals(this.externalDocumentSources, accountSettingsInformation.externalDocumentSources) &&
        Objects.equals(this.externalSignaturePadType, accountSettingsInformation.externalSignaturePadType) &&
        Objects.equals(this.externalSignaturePadTypeMetadata, accountSettingsInformation.externalSignaturePadTypeMetadata) &&
        Objects.equals(this.faxOutEnabled, accountSettingsInformation.faxOutEnabled) &&
        Objects.equals(this.faxOutEnabledMetadata, accountSettingsInformation.faxOutEnabledMetadata) &&
        Objects.equals(this.guidedFormsHtmlAllowed, accountSettingsInformation.guidedFormsHtmlAllowed) &&
        Objects.equals(this.guidedFormsHtmlAllowedMetadata, accountSettingsInformation.guidedFormsHtmlAllowedMetadata) &&
        Objects.equals(this.hideAccountAddressInCoC, accountSettingsInformation.hideAccountAddressInCoC) &&
        Objects.equals(this.hideAccountAddressInCoCMetadata, accountSettingsInformation.hideAccountAddressInCoCMetadata) &&
        Objects.equals(this.hidePricing, accountSettingsInformation.hidePricing) &&
        Objects.equals(this.hidePricingMetadata, accountSettingsInformation.hidePricingMetadata) &&
        Objects.equals(this.idCheckConfigurations, accountSettingsInformation.idCheckConfigurations) &&
        Objects.equals(this.idCheckExpire, accountSettingsInformation.idCheckExpire) &&
        Objects.equals(this.idCheckExpireDays, accountSettingsInformation.idCheckExpireDays) &&
        Objects.equals(this.idCheckExpireDaysMetadata, accountSettingsInformation.idCheckExpireDaysMetadata) &&
        Objects.equals(this.idCheckExpireMetadata, accountSettingsInformation.idCheckExpireMetadata) &&
        Objects.equals(this.idCheckExpireMinutes, accountSettingsInformation.idCheckExpireMinutes) &&
        Objects.equals(this.idCheckExpireMinutesMetadata, accountSettingsInformation.idCheckExpireMinutesMetadata) &&
        Objects.equals(this.idCheckRequired, accountSettingsInformation.idCheckRequired) &&
        Objects.equals(this.idCheckRequiredMetadata, accountSettingsInformation.idCheckRequiredMetadata) &&
        Objects.equals(this.identityVerification, accountSettingsInformation.identityVerification) &&
        Objects.equals(this.identityVerificationMetadata, accountSettingsInformation.identityVerificationMetadata) &&
        Objects.equals(this.ignoreErrorIfAnchorTabNotFound, accountSettingsInformation.ignoreErrorIfAnchorTabNotFound) &&
        Objects.equals(this.ignoreErrorIfAnchorTabNotFoundMetadataEnabled, accountSettingsInformation.ignoreErrorIfAnchorTabNotFoundMetadataEnabled) &&
        Objects.equals(this.inPersonIDCheckQuestion, accountSettingsInformation.inPersonIDCheckQuestion) &&
        Objects.equals(this.inPersonIDCheckQuestionMetadata, accountSettingsInformation.inPersonIDCheckQuestionMetadata) &&
        Objects.equals(this.inPersonSigningEnabled, accountSettingsInformation.inPersonSigningEnabled) &&
        Objects.equals(this.inPersonSigningEnabledMetadata, accountSettingsInformation.inPersonSigningEnabledMetadata) &&
        Objects.equals(this.inSessionEnabled, accountSettingsInformation.inSessionEnabled) &&
        Objects.equals(this.inSessionEnabledMetadata, accountSettingsInformation.inSessionEnabledMetadata) &&
        Objects.equals(this.inSessionSuppressEmails, accountSettingsInformation.inSessionSuppressEmails) &&
        Objects.equals(this.inSessionSuppressEmailsMetadata, accountSettingsInformation.inSessionSuppressEmailsMetadata) &&
        Objects.equals(this.maximumSigningGroups, accountSettingsInformation.maximumSigningGroups) &&
        Objects.equals(this.maximumSigningGroupsMetadata, accountSettingsInformation.maximumSigningGroupsMetadata) &&
        Objects.equals(this.maximumUsersPerSigningGroup, accountSettingsInformation.maximumUsersPerSigningGroup) &&
        Objects.equals(this.maximumUsersPerSigningGroupMetadata, accountSettingsInformation.maximumUsersPerSigningGroupMetadata) &&
        Objects.equals(this.maxNumberOfCustomStamps, accountSettingsInformation.maxNumberOfCustomStamps) &&
        Objects.equals(this.mobileSessionTimeout, accountSettingsInformation.mobileSessionTimeout) &&
        Objects.equals(this.mobileSessionTimeoutMetadata, accountSettingsInformation.mobileSessionTimeoutMetadata) &&
        Objects.equals(this.numberOfActiveCustomStamps, accountSettingsInformation.numberOfActiveCustomStamps) &&
        Objects.equals(this.optInMobileSigningV02, accountSettingsInformation.optInMobileSigningV02) &&
        Objects.equals(this.optInMobileSigningV02Metadata, accountSettingsInformation.optInMobileSigningV02Metadata) &&
        Objects.equals(this.optOutAutoNavTextAndTabColorUpdates, accountSettingsInformation.optOutAutoNavTextAndTabColorUpdates) &&
        Objects.equals(this.optOutAutoNavTextAndTabColorUpdatesMetadata, accountSettingsInformation.optOutAutoNavTextAndTabColorUpdatesMetadata) &&
        Objects.equals(this.optOutNewPlatformSeal, accountSettingsInformation.optOutNewPlatformSeal) &&
        Objects.equals(this.optOutNewPlatformSealPlatformMetadata, accountSettingsInformation.optOutNewPlatformSealPlatformMetadata) &&
        Objects.equals(this.phoneAuthRecipientMayProvidePhoneNumber, accountSettingsInformation.phoneAuthRecipientMayProvidePhoneNumber) &&
        Objects.equals(this.phoneAuthRecipientMayProvidePhoneNumberMetadata, accountSettingsInformation.phoneAuthRecipientMayProvidePhoneNumberMetadata) &&
        Objects.equals(this.pkiSignDownloadedPDFDocs, accountSettingsInformation.pkiSignDownloadedPDFDocs) &&
        Objects.equals(this.pkiSignDownloadedPDFDocsMetadata, accountSettingsInformation.pkiSignDownloadedPDFDocsMetadata) &&
        Objects.equals(this.recipientsCanSignOffline, accountSettingsInformation.recipientsCanSignOffline) &&
        Objects.equals(this.recipientsCanSignOfflineMetadata, accountSettingsInformation.recipientsCanSignOfflineMetadata) &&
        Objects.equals(this.recipientSigningAutoNavigationControl, accountSettingsInformation.recipientSigningAutoNavigationControl) &&
        Objects.equals(this.recipientSigningAutoNavigationControlMetadata, accountSettingsInformation.recipientSigningAutoNavigationControlMetadata) &&
        Objects.equals(this.require21CFRpt11Compliance, accountSettingsInformation.require21CFRpt11Compliance) &&
        Objects.equals(this.require21CFRpt11ComplianceMetadata, accountSettingsInformation.require21CFRpt11ComplianceMetadata) &&
        Objects.equals(this.requireDeclineReason, accountSettingsInformation.requireDeclineReason) &&
        Objects.equals(this.requireDeclineReasonMetadata, accountSettingsInformation.requireDeclineReasonMetadata) &&
        Objects.equals(this.requireExternalUserManagement, accountSettingsInformation.requireExternalUserManagement) &&
        Objects.equals(this.requireExternalUserManagementMetadata, accountSettingsInformation.requireExternalUserManagementMetadata) &&
        Objects.equals(this.requireSignerCertificateType, accountSettingsInformation.requireSignerCertificateType) &&
        Objects.equals(this.requireSignerCertificateTypeMetadata, accountSettingsInformation.requireSignerCertificateTypeMetadata) &&
        Objects.equals(this.rsaVeridAccountName, accountSettingsInformation.rsaVeridAccountName) &&
        Objects.equals(this.rsaVeridPassword, accountSettingsInformation.rsaVeridPassword) &&
        Objects.equals(this.rsaVeridRuleset, accountSettingsInformation.rsaVeridRuleset) &&
        Objects.equals(this.rsaVeridUserId, accountSettingsInformation.rsaVeridUserId) &&
        Objects.equals(this.selfSignedRecipientEmailDocument, accountSettingsInformation.selfSignedRecipientEmailDocument) &&
        Objects.equals(this.selfSignedRecipientEmailDocumentMetadata, accountSettingsInformation.selfSignedRecipientEmailDocumentMetadata) &&
        Objects.equals(this.selfSignedRecipientEmailDocumentUserOverride, accountSettingsInformation.selfSignedRecipientEmailDocumentUserOverride) &&
        Objects.equals(this.selfSignedRecipientEmailDocumentUserOverrideMetadata, accountSettingsInformation.selfSignedRecipientEmailDocumentUserOverrideMetadata) &&
        Objects.equals(this.senderCanSignInEachLocation, accountSettingsInformation.senderCanSignInEachLocation) &&
        Objects.equals(this.senderCanSignInEachLocationMetadata, accountSettingsInformation.senderCanSignInEachLocationMetadata) &&
        Objects.equals(this.senderMustAuthenticateSigning, accountSettingsInformation.senderMustAuthenticateSigning) &&
        Objects.equals(this.senderMustAuthenticateSigningMetadata, accountSettingsInformation.senderMustAuthenticateSigningMetadata) &&
        Objects.equals(this.sendingTagsFontColor, accountSettingsInformation.sendingTagsFontColor) &&
        Objects.equals(this.sendingTagsFontColorMetadata, accountSettingsInformation.sendingTagsFontColorMetadata) &&
        Objects.equals(this.sendingTagsFontName, accountSettingsInformation.sendingTagsFontName) &&
        Objects.equals(this.sendingTagsFontNameMetadata, accountSettingsInformation.sendingTagsFontNameMetadata) &&
        Objects.equals(this.sendingTagsFontSize, accountSettingsInformation.sendingTagsFontSize) &&
        Objects.equals(this.sendingTagsFontSizeMetadata, accountSettingsInformation.sendingTagsFontSizeMetadata) &&
        Objects.equals(this.sendToCertifiedDeliveryEnabled, accountSettingsInformation.sendToCertifiedDeliveryEnabled) &&
        Objects.equals(this.sendToCertifiedDeliveryEnabledMetadata, accountSettingsInformation.sendToCertifiedDeliveryEnabledMetadata) &&
        Objects.equals(this.sessionTimeout, accountSettingsInformation.sessionTimeout) &&
        Objects.equals(this.sessionTimeoutMetadata, accountSettingsInformation.sessionTimeoutMetadata) &&
        Objects.equals(this.setRecipEmailLang, accountSettingsInformation.setRecipEmailLang) &&
        Objects.equals(this.setRecipEmailLangMetadata, accountSettingsInformation.setRecipEmailLangMetadata) &&
        Objects.equals(this.setRecipSignLang, accountSettingsInformation.setRecipSignLang) &&
        Objects.equals(this.setRecipSignLangMetadata, accountSettingsInformation.setRecipSignLangMetadata) &&
        Objects.equals(this.sharedTemplateFolders, accountSettingsInformation.sharedTemplateFolders) &&
        Objects.equals(this.sharedTemplateFoldersMetadata, accountSettingsInformation.sharedTemplateFoldersMetadata) &&
        Objects.equals(this.showCompleteDialogInEmbeddedSession, accountSettingsInformation.showCompleteDialogInEmbeddedSession) &&
        Objects.equals(this.showCompleteDialogInEmbeddedSessionMetadata, accountSettingsInformation.showCompleteDialogInEmbeddedSessionMetadata) &&
        Objects.equals(this.showConditionalRoutingOnSend, accountSettingsInformation.showConditionalRoutingOnSend) &&
        Objects.equals(this.showConditionalRoutingOnSendMetadata, accountSettingsInformation.showConditionalRoutingOnSendMetadata) &&
        Objects.equals(this.showInitialConditionalFields, accountSettingsInformation.showInitialConditionalFields) &&
        Objects.equals(this.showInitialConditionalFieldsMetadata, accountSettingsInformation.showInitialConditionalFieldsMetadata) &&
        Objects.equals(this.showLocalizedWatermarks, accountSettingsInformation.showLocalizedWatermarks) &&
        Objects.equals(this.showLocalizedWatermarksMetadata, accountSettingsInformation.showLocalizedWatermarksMetadata) &&
        Objects.equals(this.showTutorials, accountSettingsInformation.showTutorials) &&
        Objects.equals(this.showTutorialsMetadata, accountSettingsInformation.showTutorialsMetadata) &&
        Objects.equals(this.signatureProviders, accountSettingsInformation.signatureProviders) &&
        Objects.equals(this.signatureProvidersMetadata, accountSettingsInformation.signatureProvidersMetadata) &&
        Objects.equals(this.signDateFormat, accountSettingsInformation.signDateFormat) &&
        Objects.equals(this.signDateFormatMetadata, accountSettingsInformation.signDateFormatMetadata) &&
        Objects.equals(this.signerAttachCertificateToEnvelopePDF, accountSettingsInformation.signerAttachCertificateToEnvelopePDF) &&
        Objects.equals(this.signerAttachCertificateToEnvelopePDFMetadata, accountSettingsInformation.signerAttachCertificateToEnvelopePDFMetadata) &&
        Objects.equals(this.signerAttachConcat, accountSettingsInformation.signerAttachConcat) &&
        Objects.equals(this.signerAttachConcatMetadata, accountSettingsInformation.signerAttachConcatMetadata) &&
        Objects.equals(this.signerCanCreateAccount, accountSettingsInformation.signerCanCreateAccount) &&
        Objects.equals(this.signerCanCreateAccountMetadata, accountSettingsInformation.signerCanCreateAccountMetadata) &&
        Objects.equals(this.signerCanSignOnMobile, accountSettingsInformation.signerCanSignOnMobile) &&
        Objects.equals(this.signerCanSignOnMobileMetadata, accountSettingsInformation.signerCanSignOnMobileMetadata) &&
        Objects.equals(this.signerInSessionUseEnvelopeCompleteEmail, accountSettingsInformation.signerInSessionUseEnvelopeCompleteEmail) &&
        Objects.equals(this.signerInSessionUseEnvelopeCompleteEmailMetadata, accountSettingsInformation.signerInSessionUseEnvelopeCompleteEmailMetadata) &&
        Objects.equals(this.signerLoginRequirements, accountSettingsInformation.signerLoginRequirements) &&
        Objects.equals(this.signerLoginRequirementsMetadata, accountSettingsInformation.signerLoginRequirementsMetadata) &&
        Objects.equals(this.signerMustHaveAccount, accountSettingsInformation.signerMustHaveAccount) &&
        Objects.equals(this.signerMustHaveAccountMetadata, accountSettingsInformation.signerMustHaveAccountMetadata) &&
        Objects.equals(this.signerMustLoginToSign, accountSettingsInformation.signerMustLoginToSign) &&
        Objects.equals(this.signerMustLoginToSignMetadata, accountSettingsInformation.signerMustLoginToSignMetadata) &&
        Objects.equals(this.signerShowSecureFieldInitialValues, accountSettingsInformation.signerShowSecureFieldInitialValues) &&
        Objects.equals(this.signerShowSecureFieldInitialValuesMetadata, accountSettingsInformation.signerShowSecureFieldInitialValuesMetadata) &&
        Objects.equals(this.signingSessionTimeout, accountSettingsInformation.signingSessionTimeout) &&
        Objects.equals(this.signingSessionTimeoutMetadata, accountSettingsInformation.signingSessionTimeoutMetadata) &&
        Objects.equals(this.signingUiVersion, accountSettingsInformation.signingUiVersion) &&
        Objects.equals(this.signingUiVersionMetadata, accountSettingsInformation.signingUiVersionMetadata) &&
        Objects.equals(this.signTimeFormat, accountSettingsInformation.signTimeFormat) &&
        Objects.equals(this.signTimeFormatMetadata, accountSettingsInformation.signTimeFormatMetadata) &&
        Objects.equals(this.signTimeShowAmPm, accountSettingsInformation.signTimeShowAmPm) &&
        Objects.equals(this.signTimeShowAmPmMetadata, accountSettingsInformation.signTimeShowAmPmMetadata) &&
        Objects.equals(this.simplifiedSendingEnabled, accountSettingsInformation.simplifiedSendingEnabled) &&
        Objects.equals(this.simplifiedSendingEnabledMetadata, accountSettingsInformation.simplifiedSendingEnabledMetadata) &&
        Objects.equals(this.singleSignOnEnabled, accountSettingsInformation.singleSignOnEnabled) &&
        Objects.equals(this.singleSignOnEnabledMetadata, accountSettingsInformation.singleSignOnEnabledMetadata) &&
        Objects.equals(this.skipAuthCompletedEnvelopes, accountSettingsInformation.skipAuthCompletedEnvelopes) &&
        Objects.equals(this.skipAuthCompletedEnvelopesMetadata, accountSettingsInformation.skipAuthCompletedEnvelopesMetadata) &&
        Objects.equals(this.socialIdRecipAuth, accountSettingsInformation.socialIdRecipAuth) &&
        Objects.equals(this.socialIdRecipAuthMetadata, accountSettingsInformation.socialIdRecipAuthMetadata) &&
        Objects.equals(this.specifyDocumentVisibility, accountSettingsInformation.specifyDocumentVisibility) &&
        Objects.equals(this.specifyDocumentVisibilityMetadata, accountSettingsInformation.specifyDocumentVisibilityMetadata) &&
        Objects.equals(this.startInAdvancedCorrect, accountSettingsInformation.startInAdvancedCorrect) &&
        Objects.equals(this.startInAdvancedCorrectMetadata, accountSettingsInformation.startInAdvancedCorrectMetadata) &&
        Objects.equals(this.supplementalDocumentsMustAccept, accountSettingsInformation.supplementalDocumentsMustAccept) &&
        Objects.equals(this.supplementalDocumentsMustAcceptMetadata, accountSettingsInformation.supplementalDocumentsMustAcceptMetadata) &&
        Objects.equals(this.supplementalDocumentsMustRead, accountSettingsInformation.supplementalDocumentsMustRead) &&
        Objects.equals(this.supplementalDocumentsMustReadMetadata, accountSettingsInformation.supplementalDocumentsMustReadMetadata) &&
        Objects.equals(this.supplementalDocumentsMustView, accountSettingsInformation.supplementalDocumentsMustView) &&
        Objects.equals(this.supplementalDocumentsMustViewMetadata, accountSettingsInformation.supplementalDocumentsMustViewMetadata) &&
        Objects.equals(this.suppressCertificateEnforcement, accountSettingsInformation.suppressCertificateEnforcement) &&
        Objects.equals(this.suppressCertificateEnforcementMetadata, accountSettingsInformation.suppressCertificateEnforcementMetadata) &&
        Objects.equals(this.tabAccountSettings, accountSettingsInformation.tabAccountSettings) &&
        Objects.equals(this.timezoneOffsetAPI, accountSettingsInformation.timezoneOffsetAPI) &&
        Objects.equals(this.timezoneOffsetAPIMetadata, accountSettingsInformation.timezoneOffsetAPIMetadata) &&
        Objects.equals(this.timezoneOffsetUI, accountSettingsInformation.timezoneOffsetUI) &&
        Objects.equals(this.timezoneOffsetUIMetadata, accountSettingsInformation.timezoneOffsetUIMetadata) &&
        Objects.equals(this.universalSignatureOptIn, accountSettingsInformation.universalSignatureOptIn) &&
        Objects.equals(this.useAccountLevelEmail, accountSettingsInformation.useAccountLevelEmail) &&
        Objects.equals(this.useAccountLevelEmailMetadata, accountSettingsInformation.useAccountLevelEmailMetadata) &&
        Objects.equals(this.useConsumerDisclosure, accountSettingsInformation.useConsumerDisclosure) &&
        Objects.equals(this.useConsumerDisclosureMetadata, accountSettingsInformation.useConsumerDisclosureMetadata) &&
        Objects.equals(this.useConsumerDisclosureWithinAccount, accountSettingsInformation.useConsumerDisclosureWithinAccount) &&
        Objects.equals(this.useConsumerDisclosureWithinAccountMetadata, accountSettingsInformation.useConsumerDisclosureWithinAccountMetadata) &&
        Objects.equals(this.useDerivedKeys, accountSettingsInformation.useDerivedKeys) &&
        Objects.equals(this.useDerivedKeysMetadata, accountSettingsInformation.useDerivedKeysMetadata) &&
        Objects.equals(this.useDocuSignExpressSignerCertificate, accountSettingsInformation.useDocuSignExpressSignerCertificate) &&
        Objects.equals(this.useDocuSignExpressSignerCertificateMetadata, accountSettingsInformation.useDocuSignExpressSignerCertificateMetadata) &&
        Objects.equals(this.useMultiAppGroupsData, accountSettingsInformation.useMultiAppGroupsData) &&
        Objects.equals(this.useMultiAppGroupsDataMetadata, accountSettingsInformation.useMultiAppGroupsDataMetadata) &&
        Objects.equals(this.useNewBlobForPdf, accountSettingsInformation.useNewBlobForPdf) &&
        Objects.equals(this.useNewBlobForPdfMetadata, accountSettingsInformation.useNewBlobForPdfMetadata) &&
        Objects.equals(this.useSAFESignerCertificates, accountSettingsInformation.useSAFESignerCertificates) &&
        Objects.equals(this.useSAFESignerCertificatesMetadata, accountSettingsInformation.useSAFESignerCertificatesMetadata) &&
        Objects.equals(this.usesAPI, accountSettingsInformation.usesAPI) &&
        Objects.equals(this.usesAPIMetadata, accountSettingsInformation.usesAPIMetadata) &&
        Objects.equals(this.useSignatureProviderPlatform, accountSettingsInformation.useSignatureProviderPlatform) &&
        Objects.equals(this.useSignatureProviderPlatformMetadata, accountSettingsInformation.useSignatureProviderPlatformMetadata) &&
        Objects.equals(this.validationsAllowed, accountSettingsInformation.validationsAllowed) &&
        Objects.equals(this.validationsAllowedMetadata, accountSettingsInformation.validationsAllowedMetadata) &&
        Objects.equals(this.validationsBrand, accountSettingsInformation.validationsBrand) &&
        Objects.equals(this.validationsBrandMetadata, accountSettingsInformation.validationsBrandMetadata) &&
        Objects.equals(this.validationsCadence, accountSettingsInformation.validationsCadence) &&
        Objects.equals(this.validationsCadenceMetadata, accountSettingsInformation.validationsCadenceMetadata) &&
        Objects.equals(this.validationsEnabled, accountSettingsInformation.validationsEnabled) &&
        Objects.equals(this.validationsEnabledMetadata, accountSettingsInformation.validationsEnabledMetadata) &&
        Objects.equals(this.validationsReport, accountSettingsInformation.validationsReport) &&
        Objects.equals(this.validationsReportMetadata, accountSettingsInformation.validationsReportMetadata) &&
        Objects.equals(this.waterMarkEnabled, accountSettingsInformation.waterMarkEnabled) &&
        Objects.equals(this.waterMarkEnabledMetadata, accountSettingsInformation.waterMarkEnabledMetadata) &&
        Objects.equals(this.writeReminderToEnvelopeHistory, accountSettingsInformation.writeReminderToEnvelopeHistory) &&
        Objects.equals(this.writeReminderToEnvelopeHistoryMetadata, accountSettingsInformation.writeReminderToEnvelopeHistoryMetadata) &&
        Objects.equals(this.wurflMinAllowableScreenSize, accountSettingsInformation.wurflMinAllowableScreenSize) &&
        Objects.equals(this.wurflMinAllowableScreenSizeMetadata, accountSettingsInformation.wurflMinAllowableScreenSizeMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCodeFormat, accountDateTimeFormat, accountDateTimeFormatMetadata, accountName, accountNameMetadata, accountNotification, accountUISettings, adoptSigConfig, adoptSigConfigMetadata, advancedCorrect, advancedCorrectMetadata, allowAccessCodeFormat, allowAccessCodeFormatMetadata, allowAccountManagementGranular, allowAccountManagementGranularMetadata, allowAccountMemberNameChange, allowAccountMemberNameChangeMetadata, allowAdvancedRecipientRoutingConditional, allowAdvancedRecipientRoutingConditionalMetadata, allowAgentNameEmailEdit, allowAgentNameEmailEditMetadata, allowAgreementActions, allowAgreementActionsMetadata, allowAutoNavSettings, allowAutoNavSettingsMetadata, allowAutoTagging, allowAutoTaggingMetadata, allowBulkSend, allowBulkSendMetadata, allowCDWithdraw, allowCDWithdrawMetadata, allowConnectHttpListenerConfigs, allowConnectSendFinishLater, allowConnectSendFinishLaterMetadata, allowConsumerDisclosureOverride, allowConsumerDisclosureOverrideMetadata, allowDataDownload, allowDataDownloadMetadata, allowDocumentDisclosures, allowDocumentDisclosuresMetadata, allowDocumentsOnSignedEnvelopes, allowDocumentsOnSignedEnvelopesMetadata, allowDocumentVisibility, allowDocumentVisibilityMetadata, allowEHankoStamps, allowEHankoStampsMetadata, allowENoteEOriginal, allowENoteEOriginalMetadata, allowEnvelopeCorrect, allowEnvelopeCorrectMetadata, allowEnvelopeCustodyTransfer, allowEnvelopeCustodyTransferMetadata, allowEnvelopeCustomFields, allowEnvelopeCustomFieldsMetadata, allowEnvelopePublishReporting, allowEnvelopePublishReportingMetadata, allowEnvelopeReporting, allowEnvelopeReportingMetadata, allowExpression, allowExpressionMetadata, allowExpressSignerCertificate, allowExpressSignerCertificateMetadata, allowExtendedSendingResourceFile, allowExtendedSendingResourceFileMetadata, allowExternalSignaturePad, allowExternalSignaturePadMetadata, allowIDVLevel1, allowIDVLevel1Metadata, allowIDVPlatform, allowIDVPlatformMetadata, allowInPerson, allowInPersonMetadata, allowManagedStamps, allowManagedStampsMetadata, allowMarkup, allowMarkupMetadata, allowMemberTimeZone, allowMemberTimeZoneMetadata, allowMergeFields, allowMergeFieldsMetadata, allowMultipleBrandProfiles, allowMultipleBrandProfilesMetadata, allowMultipleSignerAttachments, allowMultipleSignerAttachmentsMetadata, allowNonUSPhoneAuth, allowNonUSPhoneAuthMetadata, allowOcrOfEnvelopeDocuments, allowOcrOfEnvelopeDocumentsMetadata, allowOfflineSigning, allowOfflineSigningMetadata, allowOpenTrustSignerCertificate, allowOpenTrustSignerCertificateMetadata, allowOrganizations, allowOrganizationsMetadata, allowPaymentProcessing, allowPaymentProcessingMetadata, allowPersonalSignerCertificate, allowPersonalSignerCertificateMetadata, allowPhoneAuthentication, allowPhoneAuthenticationMetadata, allowPhoneAuthOverride, allowPhoneAuthOverrideMetadata, allowPrivateSigningGroups, allowPrivateSigningGroupsMetadata, allowReminders, allowRemindersMetadata, allowResourceFileBranding, allowResourceFileBrandingMetadata, allowSafeBioPharmaSignerCertificate, allowSafeBioPharmaSignerCertificateMetadata, allowSecurityAppliance, allowSecurityApplianceMetadata, allowSendToCertifiedDelivery, allowSendToCertifiedDeliveryMetadata, allowSendToIntermediary, allowSendToIntermediaryMetadata, allowServerTemplates, allowServerTemplatesMetadata, allowSetEmbeddedRecipientStartURL, allowSetEmbeddedRecipientStartURLMetadata, allowSharedTabs, allowSharedTabsMetadata, allowSignatureStamps, allowSignatureStampsMetadata, allowSignDocumentFromHomePage, allowSignDocumentFromHomePageMetadata, allowSignerReassign, allowSignerReassignMetadata, allowSignerReassignOverride, allowSignerReassignOverrideMetadata, allowSigningExtensions, allowSigningExtensionsMetadata, allowSigningGroups, allowSigningGroupsMetadata, allowSigningRadioDeselect, allowSigningRadioDeselectMetadata, allowSignNow, allowSignNowMetadata, allowSMSDelivery, allowSMSDeliveryMetadata, allowSocialIdLogin, allowSocialIdLoginMetadata, allowSupplementalDocuments, allowSupplementalDocumentsMetadata, allowUsersToAccessDirectory, allowUsersToAccessDirectoryMetadata, allowValueInsights, allowValueInsightsMetadata, anchorPopulationScope, anchorPopulationScopeMetadata, anchorTagVersionedPlacementEnabled, anchorTagVersionedPlacementMetadataEnabled, attachCompletedEnvelope, attachCompletedEnvelopeMetadata, authenticationCheck, authenticationCheckMetadata, autoNavRule, autoNavRuleMetadata, autoProvisionSignerAccount, autoProvisionSignerAccountMetadata, bccEmailArchive, bccEmailArchiveMetadata, betaSwitchConfiguration, betaSwitchConfigurationMetadata, billingAddress, billingAddressMetadata, bulkSend, bulkSendMaxCopiesInBatch, bulkSendMaxUnprocessedEnvelopesCount, bulkSendMetadata, canSelfBrandSend, canSelfBrandSendMetadata, canSelfBrandSign, canSelfBrandSignMetadata, canUseSalesforceOAuth, canUseSalesforceOAuthMetadata, captureVoiceRecording, captureVoiceRecordingMetadata, cfrUseWideImage, cfrUseWideImageMetadata, checkForMultipleAdminsOnAccount, checkForMultipleAdminsOnAccountMetadata, chromeSignatureEnabled, chromeSignatureEnabledMetadata, commentEmailShowMessageText, commentEmailShowMessageTextMetadata, commentsAllowEnvelopeOverride, commentsAllowEnvelopeOverrideMetadata, conditionalFieldsEnabled, conditionalFieldsEnabledMetadata, consumerDisclosureFrequency, consumerDisclosureFrequencyMetadata, convertPdfFields, convertPdfFieldsMetadata, dataPopulationScope, dataPopulationScopeMetadata, disableMobileApp, disableMobileAppMetadata, disableMobilePushNotifications, disableMobilePushNotificationsMetadata, disableMobileSending, disableMobileSendingMetadata, disableMultipleSessions, disableMultipleSessionsMetadata, disablePurgeNotificationsForSenderMetadata, disableSignerCertView, disableSignerCertViewMetadata, disableSignerHistoryView, disableSignerHistoryViewMetadata, disableStyleSignature, disableStyleSignatureMetadata, disableUploadSignature, disableUploadSignatureMetadata, disableUserSharing, disableUserSharingMetadata, displayBetaSwitch, displayBetaSwitchMetadata, documentConversionRestrictions, documentConversionRestrictionsMetadata, documentRetention, documentRetentionMetadata, documentRetentionPurgeTabs, documentVisibility, documentVisibilityMetadata, emailTemplateVersion, emailTemplateVersionMetadata, enableAccessCodeGenerator, enableAccessCodeGeneratorMetadata, enableAdvancedPayments, enableAdvancedPaymentsMetadata, enableAdvancedPowerForms, enableAdvancedPowerFormsMetadata, enableAutoNav, enableAutoNavMetadata, enableCalculatedFields, enableCalculatedFieldsMetadata, enableClickwraps, enableClickwrapsMetadata, enableCommentsHistoryDownloadInSigning, enableCommentsHistoryDownloadInSigningMetadata, enableCustomerSatisfactionMetricTracking, enableCustomerSatisfactionMetricTrackingMetadata, enableDSPro, enableDSProMetadata, enableEnvelopeStampingByAccountAdmin, enableEnvelopeStampingByAccountAdminMetadata, enableEnvelopeStampingByDSAdmin, enableEnvelopeStampingByDSAdminMetadata, enableInBrowserEditor, enableInBrowserEditorMetadata, enablePaymentProcessing, enablePaymentProcessingMetadata, enablePowerForm, enablePowerFormDirect, enablePowerFormDirectMetadata, enablePowerFormMetadata, enableRecipientDomainValidation, enableRecipientDomainValidationMetadata, enableReportLinks, enableReportLinksMetadata, enableRequireSignOnPaper, enableRequireSignOnPaperMetadata, enableReservedDomain, enableReservedDomainMetadata, enableResponsiveSigning, enableResponsiveSigningMetadata, enableScheduledRelease, enableScheduledReleaseMetadata, enableSearchUI, enableSearchUIMetadata, enableSendingTagsFontSettings, enableSendingTagsFontSettingsMetadata, enableSendToAgent, enableSendToAgentMetadata, enableSendToIntermediary, enableSendToIntermediaryMetadata, enableSendToManage, enableSendToManageMetadata, enableSequentialSigningAPI, enableSequentialSigningAPIMetadata, enableSequentialSigningUI, enableSequentialSigningUIMetadata, enableSignerAttachments, enableSignerAttachmentsMetadata, enableSigningExtensionComments, enableSigningExtensionCommentsMetadata, enableSigningExtensionConversations, enableSigningExtensionConversationsMetadata, enableSigningOrderSettingsForAccount, enableSigningOrderSettingsForAccountMetadata, enableSignOnPaper, enableSignOnPaperMetadata, enableSignOnPaperOverride, enableSignOnPaperOverrideMetadata, enableSignWithNotary, enableSignWithNotaryMetadata, enableSmartContracts, enableSmartContractsMetadata, enableSMSAuthentication, enableSMSAuthenticationMetadata, enableSocialIdLogin, enableSocialIdLoginMetadata, enableStrikeThrough, enableStrikeThroughMetadata, enableTransactionPoint, enableTransactionPointMetadata, enableVaulting, enableVaultingMetadata, enableWitnessing, enableWitnessingMetadata, enforceTemplateNameUniqueness, enforceTemplateNameUniquenessMetadata, envelopeIntegrationAllowed, envelopeIntegrationAllowedMetadata, envelopeIntegrationEnabled, envelopeIntegrationEnabledMetadata, envelopeStampingDefaultValue, envelopeStampingDefaultValueMetadata, expressSend, expressSendAllowTabs, expressSendAllowTabsMetadata, expressSendMetadata, externalDocumentSources, externalSignaturePadType, externalSignaturePadTypeMetadata, faxOutEnabled, faxOutEnabledMetadata, guidedFormsHtmlAllowed, guidedFormsHtmlAllowedMetadata, hideAccountAddressInCoC, hideAccountAddressInCoCMetadata, hidePricing, hidePricingMetadata, idCheckConfigurations, idCheckExpire, idCheckExpireDays, idCheckExpireDaysMetadata, idCheckExpireMetadata, idCheckExpireMinutes, idCheckExpireMinutesMetadata, idCheckRequired, idCheckRequiredMetadata, identityVerification, identityVerificationMetadata, ignoreErrorIfAnchorTabNotFound, ignoreErrorIfAnchorTabNotFoundMetadataEnabled, inPersonIDCheckQuestion, inPersonIDCheckQuestionMetadata, inPersonSigningEnabled, inPersonSigningEnabledMetadata, inSessionEnabled, inSessionEnabledMetadata, inSessionSuppressEmails, inSessionSuppressEmailsMetadata, maximumSigningGroups, maximumSigningGroupsMetadata, maximumUsersPerSigningGroup, maximumUsersPerSigningGroupMetadata, maxNumberOfCustomStamps, mobileSessionTimeout, mobileSessionTimeoutMetadata, numberOfActiveCustomStamps, optInMobileSigningV02, optInMobileSigningV02Metadata, optOutAutoNavTextAndTabColorUpdates, optOutAutoNavTextAndTabColorUpdatesMetadata, optOutNewPlatformSeal, optOutNewPlatformSealPlatformMetadata, phoneAuthRecipientMayProvidePhoneNumber, phoneAuthRecipientMayProvidePhoneNumberMetadata, pkiSignDownloadedPDFDocs, pkiSignDownloadedPDFDocsMetadata, recipientsCanSignOffline, recipientsCanSignOfflineMetadata, recipientSigningAutoNavigationControl, recipientSigningAutoNavigationControlMetadata, require21CFRpt11Compliance, require21CFRpt11ComplianceMetadata, requireDeclineReason, requireDeclineReasonMetadata, requireExternalUserManagement, requireExternalUserManagementMetadata, requireSignerCertificateType, requireSignerCertificateTypeMetadata, rsaVeridAccountName, rsaVeridPassword, rsaVeridRuleset, rsaVeridUserId, selfSignedRecipientEmailDocument, selfSignedRecipientEmailDocumentMetadata, selfSignedRecipientEmailDocumentUserOverride, selfSignedRecipientEmailDocumentUserOverrideMetadata, senderCanSignInEachLocation, senderCanSignInEachLocationMetadata, senderMustAuthenticateSigning, senderMustAuthenticateSigningMetadata, sendingTagsFontColor, sendingTagsFontColorMetadata, sendingTagsFontName, sendingTagsFontNameMetadata, sendingTagsFontSize, sendingTagsFontSizeMetadata, sendToCertifiedDeliveryEnabled, sendToCertifiedDeliveryEnabledMetadata, sessionTimeout, sessionTimeoutMetadata, setRecipEmailLang, setRecipEmailLangMetadata, setRecipSignLang, setRecipSignLangMetadata, sharedTemplateFolders, sharedTemplateFoldersMetadata, showCompleteDialogInEmbeddedSession, showCompleteDialogInEmbeddedSessionMetadata, showConditionalRoutingOnSend, showConditionalRoutingOnSendMetadata, showInitialConditionalFields, showInitialConditionalFieldsMetadata, showLocalizedWatermarks, showLocalizedWatermarksMetadata, showTutorials, showTutorialsMetadata, signatureProviders, signatureProvidersMetadata, signDateFormat, signDateFormatMetadata, signerAttachCertificateToEnvelopePDF, signerAttachCertificateToEnvelopePDFMetadata, signerAttachConcat, signerAttachConcatMetadata, signerCanCreateAccount, signerCanCreateAccountMetadata, signerCanSignOnMobile, signerCanSignOnMobileMetadata, signerInSessionUseEnvelopeCompleteEmail, signerInSessionUseEnvelopeCompleteEmailMetadata, signerLoginRequirements, signerLoginRequirementsMetadata, signerMustHaveAccount, signerMustHaveAccountMetadata, signerMustLoginToSign, signerMustLoginToSignMetadata, signerShowSecureFieldInitialValues, signerShowSecureFieldInitialValuesMetadata, signingSessionTimeout, signingSessionTimeoutMetadata, signingUiVersion, signingUiVersionMetadata, signTimeFormat, signTimeFormatMetadata, signTimeShowAmPm, signTimeShowAmPmMetadata, simplifiedSendingEnabled, simplifiedSendingEnabledMetadata, singleSignOnEnabled, singleSignOnEnabledMetadata, skipAuthCompletedEnvelopes, skipAuthCompletedEnvelopesMetadata, socialIdRecipAuth, socialIdRecipAuthMetadata, specifyDocumentVisibility, specifyDocumentVisibilityMetadata, startInAdvancedCorrect, startInAdvancedCorrectMetadata, supplementalDocumentsMustAccept, supplementalDocumentsMustAcceptMetadata, supplementalDocumentsMustRead, supplementalDocumentsMustReadMetadata, supplementalDocumentsMustView, supplementalDocumentsMustViewMetadata, suppressCertificateEnforcement, suppressCertificateEnforcementMetadata, tabAccountSettings, timezoneOffsetAPI, timezoneOffsetAPIMetadata, timezoneOffsetUI, timezoneOffsetUIMetadata, universalSignatureOptIn, useAccountLevelEmail, useAccountLevelEmailMetadata, useConsumerDisclosure, useConsumerDisclosureMetadata, useConsumerDisclosureWithinAccount, useConsumerDisclosureWithinAccountMetadata, useDerivedKeys, useDerivedKeysMetadata, useDocuSignExpressSignerCertificate, useDocuSignExpressSignerCertificateMetadata, useMultiAppGroupsData, useMultiAppGroupsDataMetadata, useNewBlobForPdf, useNewBlobForPdfMetadata, useSAFESignerCertificates, useSAFESignerCertificatesMetadata, usesAPI, usesAPIMetadata, useSignatureProviderPlatform, useSignatureProviderPlatformMetadata, validationsAllowed, validationsAllowedMetadata, validationsBrand, validationsBrandMetadata, validationsCadence, validationsCadenceMetadata, validationsEnabled, validationsEnabledMetadata, validationsReport, validationsReportMetadata, waterMarkEnabled, waterMarkEnabledMetadata, writeReminderToEnvelopeHistory, writeReminderToEnvelopeHistoryMetadata, wurflMinAllowableScreenSize, wurflMinAllowableScreenSizeMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSettingsInformation {\n");
    
    sb.append("    accessCodeFormat: ").append(toIndentedString(accessCodeFormat)).append("\n");
    sb.append("    accountDateTimeFormat: ").append(toIndentedString(accountDateTimeFormat)).append("\n");
    sb.append("    accountDateTimeFormatMetadata: ").append(toIndentedString(accountDateTimeFormatMetadata)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNameMetadata: ").append(toIndentedString(accountNameMetadata)).append("\n");
    sb.append("    accountNotification: ").append(toIndentedString(accountNotification)).append("\n");
    sb.append("    accountUISettings: ").append(toIndentedString(accountUISettings)).append("\n");
    sb.append("    adoptSigConfig: ").append(toIndentedString(adoptSigConfig)).append("\n");
    sb.append("    adoptSigConfigMetadata: ").append(toIndentedString(adoptSigConfigMetadata)).append("\n");
    sb.append("    advancedCorrect: ").append(toIndentedString(advancedCorrect)).append("\n");
    sb.append("    advancedCorrectMetadata: ").append(toIndentedString(advancedCorrectMetadata)).append("\n");
    sb.append("    allowAccessCodeFormat: ").append(toIndentedString(allowAccessCodeFormat)).append("\n");
    sb.append("    allowAccessCodeFormatMetadata: ").append(toIndentedString(allowAccessCodeFormatMetadata)).append("\n");
    sb.append("    allowAccountManagementGranular: ").append(toIndentedString(allowAccountManagementGranular)).append("\n");
    sb.append("    allowAccountManagementGranularMetadata: ").append(toIndentedString(allowAccountManagementGranularMetadata)).append("\n");
    sb.append("    allowAccountMemberNameChange: ").append(toIndentedString(allowAccountMemberNameChange)).append("\n");
    sb.append("    allowAccountMemberNameChangeMetadata: ").append(toIndentedString(allowAccountMemberNameChangeMetadata)).append("\n");
    sb.append("    allowAdvancedRecipientRoutingConditional: ").append(toIndentedString(allowAdvancedRecipientRoutingConditional)).append("\n");
    sb.append("    allowAdvancedRecipientRoutingConditionalMetadata: ").append(toIndentedString(allowAdvancedRecipientRoutingConditionalMetadata)).append("\n");
    sb.append("    allowAgentNameEmailEdit: ").append(toIndentedString(allowAgentNameEmailEdit)).append("\n");
    sb.append("    allowAgentNameEmailEditMetadata: ").append(toIndentedString(allowAgentNameEmailEditMetadata)).append("\n");
    sb.append("    allowAgreementActions: ").append(toIndentedString(allowAgreementActions)).append("\n");
    sb.append("    allowAgreementActionsMetadata: ").append(toIndentedString(allowAgreementActionsMetadata)).append("\n");
    sb.append("    allowAutoNavSettings: ").append(toIndentedString(allowAutoNavSettings)).append("\n");
    sb.append("    allowAutoNavSettingsMetadata: ").append(toIndentedString(allowAutoNavSettingsMetadata)).append("\n");
    sb.append("    allowAutoTagging: ").append(toIndentedString(allowAutoTagging)).append("\n");
    sb.append("    allowAutoTaggingMetadata: ").append(toIndentedString(allowAutoTaggingMetadata)).append("\n");
    sb.append("    allowBulkSend: ").append(toIndentedString(allowBulkSend)).append("\n");
    sb.append("    allowBulkSendMetadata: ").append(toIndentedString(allowBulkSendMetadata)).append("\n");
    sb.append("    allowCDWithdraw: ").append(toIndentedString(allowCDWithdraw)).append("\n");
    sb.append("    allowCDWithdrawMetadata: ").append(toIndentedString(allowCDWithdrawMetadata)).append("\n");
    sb.append("    allowConnectHttpListenerConfigs: ").append(toIndentedString(allowConnectHttpListenerConfigs)).append("\n");
    sb.append("    allowConnectSendFinishLater: ").append(toIndentedString(allowConnectSendFinishLater)).append("\n");
    sb.append("    allowConnectSendFinishLaterMetadata: ").append(toIndentedString(allowConnectSendFinishLaterMetadata)).append("\n");
    sb.append("    allowConsumerDisclosureOverride: ").append(toIndentedString(allowConsumerDisclosureOverride)).append("\n");
    sb.append("    allowConsumerDisclosureOverrideMetadata: ").append(toIndentedString(allowConsumerDisclosureOverrideMetadata)).append("\n");
    sb.append("    allowDataDownload: ").append(toIndentedString(allowDataDownload)).append("\n");
    sb.append("    allowDataDownloadMetadata: ").append(toIndentedString(allowDataDownloadMetadata)).append("\n");
    sb.append("    allowDocumentDisclosures: ").append(toIndentedString(allowDocumentDisclosures)).append("\n");
    sb.append("    allowDocumentDisclosuresMetadata: ").append(toIndentedString(allowDocumentDisclosuresMetadata)).append("\n");
    sb.append("    allowDocumentsOnSignedEnvelopes: ").append(toIndentedString(allowDocumentsOnSignedEnvelopes)).append("\n");
    sb.append("    allowDocumentsOnSignedEnvelopesMetadata: ").append(toIndentedString(allowDocumentsOnSignedEnvelopesMetadata)).append("\n");
    sb.append("    allowDocumentVisibility: ").append(toIndentedString(allowDocumentVisibility)).append("\n");
    sb.append("    allowDocumentVisibilityMetadata: ").append(toIndentedString(allowDocumentVisibilityMetadata)).append("\n");
    sb.append("    allowEHankoStamps: ").append(toIndentedString(allowEHankoStamps)).append("\n");
    sb.append("    allowEHankoStampsMetadata: ").append(toIndentedString(allowEHankoStampsMetadata)).append("\n");
    sb.append("    allowENoteEOriginal: ").append(toIndentedString(allowENoteEOriginal)).append("\n");
    sb.append("    allowENoteEOriginalMetadata: ").append(toIndentedString(allowENoteEOriginalMetadata)).append("\n");
    sb.append("    allowEnvelopeCorrect: ").append(toIndentedString(allowEnvelopeCorrect)).append("\n");
    sb.append("    allowEnvelopeCorrectMetadata: ").append(toIndentedString(allowEnvelopeCorrectMetadata)).append("\n");
    sb.append("    allowEnvelopeCustodyTransfer: ").append(toIndentedString(allowEnvelopeCustodyTransfer)).append("\n");
    sb.append("    allowEnvelopeCustodyTransferMetadata: ").append(toIndentedString(allowEnvelopeCustodyTransferMetadata)).append("\n");
    sb.append("    allowEnvelopeCustomFields: ").append(toIndentedString(allowEnvelopeCustomFields)).append("\n");
    sb.append("    allowEnvelopeCustomFieldsMetadata: ").append(toIndentedString(allowEnvelopeCustomFieldsMetadata)).append("\n");
    sb.append("    allowEnvelopePublishReporting: ").append(toIndentedString(allowEnvelopePublishReporting)).append("\n");
    sb.append("    allowEnvelopePublishReportingMetadata: ").append(toIndentedString(allowEnvelopePublishReportingMetadata)).append("\n");
    sb.append("    allowEnvelopeReporting: ").append(toIndentedString(allowEnvelopeReporting)).append("\n");
    sb.append("    allowEnvelopeReportingMetadata: ").append(toIndentedString(allowEnvelopeReportingMetadata)).append("\n");
    sb.append("    allowExpression: ").append(toIndentedString(allowExpression)).append("\n");
    sb.append("    allowExpressionMetadata: ").append(toIndentedString(allowExpressionMetadata)).append("\n");
    sb.append("    allowExpressSignerCertificate: ").append(toIndentedString(allowExpressSignerCertificate)).append("\n");
    sb.append("    allowExpressSignerCertificateMetadata: ").append(toIndentedString(allowExpressSignerCertificateMetadata)).append("\n");
    sb.append("    allowExtendedSendingResourceFile: ").append(toIndentedString(allowExtendedSendingResourceFile)).append("\n");
    sb.append("    allowExtendedSendingResourceFileMetadata: ").append(toIndentedString(allowExtendedSendingResourceFileMetadata)).append("\n");
    sb.append("    allowExternalSignaturePad: ").append(toIndentedString(allowExternalSignaturePad)).append("\n");
    sb.append("    allowExternalSignaturePadMetadata: ").append(toIndentedString(allowExternalSignaturePadMetadata)).append("\n");
    sb.append("    allowIDVLevel1: ").append(toIndentedString(allowIDVLevel1)).append("\n");
    sb.append("    allowIDVLevel1Metadata: ").append(toIndentedString(allowIDVLevel1Metadata)).append("\n");
    sb.append("    allowIDVPlatform: ").append(toIndentedString(allowIDVPlatform)).append("\n");
    sb.append("    allowIDVPlatformMetadata: ").append(toIndentedString(allowIDVPlatformMetadata)).append("\n");
    sb.append("    allowInPerson: ").append(toIndentedString(allowInPerson)).append("\n");
    sb.append("    allowInPersonMetadata: ").append(toIndentedString(allowInPersonMetadata)).append("\n");
    sb.append("    allowManagedStamps: ").append(toIndentedString(allowManagedStamps)).append("\n");
    sb.append("    allowManagedStampsMetadata: ").append(toIndentedString(allowManagedStampsMetadata)).append("\n");
    sb.append("    allowMarkup: ").append(toIndentedString(allowMarkup)).append("\n");
    sb.append("    allowMarkupMetadata: ").append(toIndentedString(allowMarkupMetadata)).append("\n");
    sb.append("    allowMemberTimeZone: ").append(toIndentedString(allowMemberTimeZone)).append("\n");
    sb.append("    allowMemberTimeZoneMetadata: ").append(toIndentedString(allowMemberTimeZoneMetadata)).append("\n");
    sb.append("    allowMergeFields: ").append(toIndentedString(allowMergeFields)).append("\n");
    sb.append("    allowMergeFieldsMetadata: ").append(toIndentedString(allowMergeFieldsMetadata)).append("\n");
    sb.append("    allowMultipleBrandProfiles: ").append(toIndentedString(allowMultipleBrandProfiles)).append("\n");
    sb.append("    allowMultipleBrandProfilesMetadata: ").append(toIndentedString(allowMultipleBrandProfilesMetadata)).append("\n");
    sb.append("    allowMultipleSignerAttachments: ").append(toIndentedString(allowMultipleSignerAttachments)).append("\n");
    sb.append("    allowMultipleSignerAttachmentsMetadata: ").append(toIndentedString(allowMultipleSignerAttachmentsMetadata)).append("\n");
    sb.append("    allowNonUSPhoneAuth: ").append(toIndentedString(allowNonUSPhoneAuth)).append("\n");
    sb.append("    allowNonUSPhoneAuthMetadata: ").append(toIndentedString(allowNonUSPhoneAuthMetadata)).append("\n");
    sb.append("    allowOcrOfEnvelopeDocuments: ").append(toIndentedString(allowOcrOfEnvelopeDocuments)).append("\n");
    sb.append("    allowOcrOfEnvelopeDocumentsMetadata: ").append(toIndentedString(allowOcrOfEnvelopeDocumentsMetadata)).append("\n");
    sb.append("    allowOfflineSigning: ").append(toIndentedString(allowOfflineSigning)).append("\n");
    sb.append("    allowOfflineSigningMetadata: ").append(toIndentedString(allowOfflineSigningMetadata)).append("\n");
    sb.append("    allowOpenTrustSignerCertificate: ").append(toIndentedString(allowOpenTrustSignerCertificate)).append("\n");
    sb.append("    allowOpenTrustSignerCertificateMetadata: ").append(toIndentedString(allowOpenTrustSignerCertificateMetadata)).append("\n");
    sb.append("    allowOrganizations: ").append(toIndentedString(allowOrganizations)).append("\n");
    sb.append("    allowOrganizationsMetadata: ").append(toIndentedString(allowOrganizationsMetadata)).append("\n");
    sb.append("    allowPaymentProcessing: ").append(toIndentedString(allowPaymentProcessing)).append("\n");
    sb.append("    allowPaymentProcessingMetadata: ").append(toIndentedString(allowPaymentProcessingMetadata)).append("\n");
    sb.append("    allowPersonalSignerCertificate: ").append(toIndentedString(allowPersonalSignerCertificate)).append("\n");
    sb.append("    allowPersonalSignerCertificateMetadata: ").append(toIndentedString(allowPersonalSignerCertificateMetadata)).append("\n");
    sb.append("    allowPhoneAuthentication: ").append(toIndentedString(allowPhoneAuthentication)).append("\n");
    sb.append("    allowPhoneAuthenticationMetadata: ").append(toIndentedString(allowPhoneAuthenticationMetadata)).append("\n");
    sb.append("    allowPhoneAuthOverride: ").append(toIndentedString(allowPhoneAuthOverride)).append("\n");
    sb.append("    allowPhoneAuthOverrideMetadata: ").append(toIndentedString(allowPhoneAuthOverrideMetadata)).append("\n");
    sb.append("    allowPrivateSigningGroups: ").append(toIndentedString(allowPrivateSigningGroups)).append("\n");
    sb.append("    allowPrivateSigningGroupsMetadata: ").append(toIndentedString(allowPrivateSigningGroupsMetadata)).append("\n");
    sb.append("    allowReminders: ").append(toIndentedString(allowReminders)).append("\n");
    sb.append("    allowRemindersMetadata: ").append(toIndentedString(allowRemindersMetadata)).append("\n");
    sb.append("    allowResourceFileBranding: ").append(toIndentedString(allowResourceFileBranding)).append("\n");
    sb.append("    allowResourceFileBrandingMetadata: ").append(toIndentedString(allowResourceFileBrandingMetadata)).append("\n");
    sb.append("    allowSafeBioPharmaSignerCertificate: ").append(toIndentedString(allowSafeBioPharmaSignerCertificate)).append("\n");
    sb.append("    allowSafeBioPharmaSignerCertificateMetadata: ").append(toIndentedString(allowSafeBioPharmaSignerCertificateMetadata)).append("\n");
    sb.append("    allowSecurityAppliance: ").append(toIndentedString(allowSecurityAppliance)).append("\n");
    sb.append("    allowSecurityApplianceMetadata: ").append(toIndentedString(allowSecurityApplianceMetadata)).append("\n");
    sb.append("    allowSendToCertifiedDelivery: ").append(toIndentedString(allowSendToCertifiedDelivery)).append("\n");
    sb.append("    allowSendToCertifiedDeliveryMetadata: ").append(toIndentedString(allowSendToCertifiedDeliveryMetadata)).append("\n");
    sb.append("    allowSendToIntermediary: ").append(toIndentedString(allowSendToIntermediary)).append("\n");
    sb.append("    allowSendToIntermediaryMetadata: ").append(toIndentedString(allowSendToIntermediaryMetadata)).append("\n");
    sb.append("    allowServerTemplates: ").append(toIndentedString(allowServerTemplates)).append("\n");
    sb.append("    allowServerTemplatesMetadata: ").append(toIndentedString(allowServerTemplatesMetadata)).append("\n");
    sb.append("    allowSetEmbeddedRecipientStartURL: ").append(toIndentedString(allowSetEmbeddedRecipientStartURL)).append("\n");
    sb.append("    allowSetEmbeddedRecipientStartURLMetadata: ").append(toIndentedString(allowSetEmbeddedRecipientStartURLMetadata)).append("\n");
    sb.append("    allowSharedTabs: ").append(toIndentedString(allowSharedTabs)).append("\n");
    sb.append("    allowSharedTabsMetadata: ").append(toIndentedString(allowSharedTabsMetadata)).append("\n");
    sb.append("    allowSignatureStamps: ").append(toIndentedString(allowSignatureStamps)).append("\n");
    sb.append("    allowSignatureStampsMetadata: ").append(toIndentedString(allowSignatureStampsMetadata)).append("\n");
    sb.append("    allowSignDocumentFromHomePage: ").append(toIndentedString(allowSignDocumentFromHomePage)).append("\n");
    sb.append("    allowSignDocumentFromHomePageMetadata: ").append(toIndentedString(allowSignDocumentFromHomePageMetadata)).append("\n");
    sb.append("    allowSignerReassign: ").append(toIndentedString(allowSignerReassign)).append("\n");
    sb.append("    allowSignerReassignMetadata: ").append(toIndentedString(allowSignerReassignMetadata)).append("\n");
    sb.append("    allowSignerReassignOverride: ").append(toIndentedString(allowSignerReassignOverride)).append("\n");
    sb.append("    allowSignerReassignOverrideMetadata: ").append(toIndentedString(allowSignerReassignOverrideMetadata)).append("\n");
    sb.append("    allowSigningExtensions: ").append(toIndentedString(allowSigningExtensions)).append("\n");
    sb.append("    allowSigningExtensionsMetadata: ").append(toIndentedString(allowSigningExtensionsMetadata)).append("\n");
    sb.append("    allowSigningGroups: ").append(toIndentedString(allowSigningGroups)).append("\n");
    sb.append("    allowSigningGroupsMetadata: ").append(toIndentedString(allowSigningGroupsMetadata)).append("\n");
    sb.append("    allowSigningRadioDeselect: ").append(toIndentedString(allowSigningRadioDeselect)).append("\n");
    sb.append("    allowSigningRadioDeselectMetadata: ").append(toIndentedString(allowSigningRadioDeselectMetadata)).append("\n");
    sb.append("    allowSignNow: ").append(toIndentedString(allowSignNow)).append("\n");
    sb.append("    allowSignNowMetadata: ").append(toIndentedString(allowSignNowMetadata)).append("\n");
    sb.append("    allowSMSDelivery: ").append(toIndentedString(allowSMSDelivery)).append("\n");
    sb.append("    allowSMSDeliveryMetadata: ").append(toIndentedString(allowSMSDeliveryMetadata)).append("\n");
    sb.append("    allowSocialIdLogin: ").append(toIndentedString(allowSocialIdLogin)).append("\n");
    sb.append("    allowSocialIdLoginMetadata: ").append(toIndentedString(allowSocialIdLoginMetadata)).append("\n");
    sb.append("    allowSupplementalDocuments: ").append(toIndentedString(allowSupplementalDocuments)).append("\n");
    sb.append("    allowSupplementalDocumentsMetadata: ").append(toIndentedString(allowSupplementalDocumentsMetadata)).append("\n");
    sb.append("    allowUsersToAccessDirectory: ").append(toIndentedString(allowUsersToAccessDirectory)).append("\n");
    sb.append("    allowUsersToAccessDirectoryMetadata: ").append(toIndentedString(allowUsersToAccessDirectoryMetadata)).append("\n");
    sb.append("    allowValueInsights: ").append(toIndentedString(allowValueInsights)).append("\n");
    sb.append("    allowValueInsightsMetadata: ").append(toIndentedString(allowValueInsightsMetadata)).append("\n");
    sb.append("    anchorPopulationScope: ").append(toIndentedString(anchorPopulationScope)).append("\n");
    sb.append("    anchorPopulationScopeMetadata: ").append(toIndentedString(anchorPopulationScopeMetadata)).append("\n");
    sb.append("    anchorTagVersionedPlacementEnabled: ").append(toIndentedString(anchorTagVersionedPlacementEnabled)).append("\n");
    sb.append("    anchorTagVersionedPlacementMetadataEnabled: ").append(toIndentedString(anchorTagVersionedPlacementMetadataEnabled)).append("\n");
    sb.append("    attachCompletedEnvelope: ").append(toIndentedString(attachCompletedEnvelope)).append("\n");
    sb.append("    attachCompletedEnvelopeMetadata: ").append(toIndentedString(attachCompletedEnvelopeMetadata)).append("\n");
    sb.append("    authenticationCheck: ").append(toIndentedString(authenticationCheck)).append("\n");
    sb.append("    authenticationCheckMetadata: ").append(toIndentedString(authenticationCheckMetadata)).append("\n");
    sb.append("    autoNavRule: ").append(toIndentedString(autoNavRule)).append("\n");
    sb.append("    autoNavRuleMetadata: ").append(toIndentedString(autoNavRuleMetadata)).append("\n");
    sb.append("    autoProvisionSignerAccount: ").append(toIndentedString(autoProvisionSignerAccount)).append("\n");
    sb.append("    autoProvisionSignerAccountMetadata: ").append(toIndentedString(autoProvisionSignerAccountMetadata)).append("\n");
    sb.append("    bccEmailArchive: ").append(toIndentedString(bccEmailArchive)).append("\n");
    sb.append("    bccEmailArchiveMetadata: ").append(toIndentedString(bccEmailArchiveMetadata)).append("\n");
    sb.append("    betaSwitchConfiguration: ").append(toIndentedString(betaSwitchConfiguration)).append("\n");
    sb.append("    betaSwitchConfigurationMetadata: ").append(toIndentedString(betaSwitchConfigurationMetadata)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    billingAddressMetadata: ").append(toIndentedString(billingAddressMetadata)).append("\n");
    sb.append("    bulkSend: ").append(toIndentedString(bulkSend)).append("\n");
    sb.append("    bulkSendMaxCopiesInBatch: ").append(toIndentedString(bulkSendMaxCopiesInBatch)).append("\n");
    sb.append("    bulkSendMaxUnprocessedEnvelopesCount: ").append(toIndentedString(bulkSendMaxUnprocessedEnvelopesCount)).append("\n");
    sb.append("    bulkSendMetadata: ").append(toIndentedString(bulkSendMetadata)).append("\n");
    sb.append("    canSelfBrandSend: ").append(toIndentedString(canSelfBrandSend)).append("\n");
    sb.append("    canSelfBrandSendMetadata: ").append(toIndentedString(canSelfBrandSendMetadata)).append("\n");
    sb.append("    canSelfBrandSign: ").append(toIndentedString(canSelfBrandSign)).append("\n");
    sb.append("    canSelfBrandSignMetadata: ").append(toIndentedString(canSelfBrandSignMetadata)).append("\n");
    sb.append("    canUseSalesforceOAuth: ").append(toIndentedString(canUseSalesforceOAuth)).append("\n");
    sb.append("    canUseSalesforceOAuthMetadata: ").append(toIndentedString(canUseSalesforceOAuthMetadata)).append("\n");
    sb.append("    captureVoiceRecording: ").append(toIndentedString(captureVoiceRecording)).append("\n");
    sb.append("    captureVoiceRecordingMetadata: ").append(toIndentedString(captureVoiceRecordingMetadata)).append("\n");
    sb.append("    cfrUseWideImage: ").append(toIndentedString(cfrUseWideImage)).append("\n");
    sb.append("    cfrUseWideImageMetadata: ").append(toIndentedString(cfrUseWideImageMetadata)).append("\n");
    sb.append("    checkForMultipleAdminsOnAccount: ").append(toIndentedString(checkForMultipleAdminsOnAccount)).append("\n");
    sb.append("    checkForMultipleAdminsOnAccountMetadata: ").append(toIndentedString(checkForMultipleAdminsOnAccountMetadata)).append("\n");
    sb.append("    chromeSignatureEnabled: ").append(toIndentedString(chromeSignatureEnabled)).append("\n");
    sb.append("    chromeSignatureEnabledMetadata: ").append(toIndentedString(chromeSignatureEnabledMetadata)).append("\n");
    sb.append("    commentEmailShowMessageText: ").append(toIndentedString(commentEmailShowMessageText)).append("\n");
    sb.append("    commentEmailShowMessageTextMetadata: ").append(toIndentedString(commentEmailShowMessageTextMetadata)).append("\n");
    sb.append("    commentsAllowEnvelopeOverride: ").append(toIndentedString(commentsAllowEnvelopeOverride)).append("\n");
    sb.append("    commentsAllowEnvelopeOverrideMetadata: ").append(toIndentedString(commentsAllowEnvelopeOverrideMetadata)).append("\n");
    sb.append("    conditionalFieldsEnabled: ").append(toIndentedString(conditionalFieldsEnabled)).append("\n");
    sb.append("    conditionalFieldsEnabledMetadata: ").append(toIndentedString(conditionalFieldsEnabledMetadata)).append("\n");
    sb.append("    consumerDisclosureFrequency: ").append(toIndentedString(consumerDisclosureFrequency)).append("\n");
    sb.append("    consumerDisclosureFrequencyMetadata: ").append(toIndentedString(consumerDisclosureFrequencyMetadata)).append("\n");
    sb.append("    convertPdfFields: ").append(toIndentedString(convertPdfFields)).append("\n");
    sb.append("    convertPdfFieldsMetadata: ").append(toIndentedString(convertPdfFieldsMetadata)).append("\n");
    sb.append("    dataPopulationScope: ").append(toIndentedString(dataPopulationScope)).append("\n");
    sb.append("    dataPopulationScopeMetadata: ").append(toIndentedString(dataPopulationScopeMetadata)).append("\n");
    sb.append("    disableMobileApp: ").append(toIndentedString(disableMobileApp)).append("\n");
    sb.append("    disableMobileAppMetadata: ").append(toIndentedString(disableMobileAppMetadata)).append("\n");
    sb.append("    disableMobilePushNotifications: ").append(toIndentedString(disableMobilePushNotifications)).append("\n");
    sb.append("    disableMobilePushNotificationsMetadata: ").append(toIndentedString(disableMobilePushNotificationsMetadata)).append("\n");
    sb.append("    disableMobileSending: ").append(toIndentedString(disableMobileSending)).append("\n");
    sb.append("    disableMobileSendingMetadata: ").append(toIndentedString(disableMobileSendingMetadata)).append("\n");
    sb.append("    disableMultipleSessions: ").append(toIndentedString(disableMultipleSessions)).append("\n");
    sb.append("    disableMultipleSessionsMetadata: ").append(toIndentedString(disableMultipleSessionsMetadata)).append("\n");
    sb.append("    disablePurgeNotificationsForSenderMetadata: ").append(toIndentedString(disablePurgeNotificationsForSenderMetadata)).append("\n");
    sb.append("    disableSignerCertView: ").append(toIndentedString(disableSignerCertView)).append("\n");
    sb.append("    disableSignerCertViewMetadata: ").append(toIndentedString(disableSignerCertViewMetadata)).append("\n");
    sb.append("    disableSignerHistoryView: ").append(toIndentedString(disableSignerHistoryView)).append("\n");
    sb.append("    disableSignerHistoryViewMetadata: ").append(toIndentedString(disableSignerHistoryViewMetadata)).append("\n");
    sb.append("    disableStyleSignature: ").append(toIndentedString(disableStyleSignature)).append("\n");
    sb.append("    disableStyleSignatureMetadata: ").append(toIndentedString(disableStyleSignatureMetadata)).append("\n");
    sb.append("    disableUploadSignature: ").append(toIndentedString(disableUploadSignature)).append("\n");
    sb.append("    disableUploadSignatureMetadata: ").append(toIndentedString(disableUploadSignatureMetadata)).append("\n");
    sb.append("    disableUserSharing: ").append(toIndentedString(disableUserSharing)).append("\n");
    sb.append("    disableUserSharingMetadata: ").append(toIndentedString(disableUserSharingMetadata)).append("\n");
    sb.append("    displayBetaSwitch: ").append(toIndentedString(displayBetaSwitch)).append("\n");
    sb.append("    displayBetaSwitchMetadata: ").append(toIndentedString(displayBetaSwitchMetadata)).append("\n");
    sb.append("    documentConversionRestrictions: ").append(toIndentedString(documentConversionRestrictions)).append("\n");
    sb.append("    documentConversionRestrictionsMetadata: ").append(toIndentedString(documentConversionRestrictionsMetadata)).append("\n");
    sb.append("    documentRetention: ").append(toIndentedString(documentRetention)).append("\n");
    sb.append("    documentRetentionMetadata: ").append(toIndentedString(documentRetentionMetadata)).append("\n");
    sb.append("    documentRetentionPurgeTabs: ").append(toIndentedString(documentRetentionPurgeTabs)).append("\n");
    sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
    sb.append("    documentVisibilityMetadata: ").append(toIndentedString(documentVisibilityMetadata)).append("\n");
    sb.append("    emailTemplateVersion: ").append(toIndentedString(emailTemplateVersion)).append("\n");
    sb.append("    emailTemplateVersionMetadata: ").append(toIndentedString(emailTemplateVersionMetadata)).append("\n");
    sb.append("    enableAccessCodeGenerator: ").append(toIndentedString(enableAccessCodeGenerator)).append("\n");
    sb.append("    enableAccessCodeGeneratorMetadata: ").append(toIndentedString(enableAccessCodeGeneratorMetadata)).append("\n");
    sb.append("    enableAdvancedPayments: ").append(toIndentedString(enableAdvancedPayments)).append("\n");
    sb.append("    enableAdvancedPaymentsMetadata: ").append(toIndentedString(enableAdvancedPaymentsMetadata)).append("\n");
    sb.append("    enableAdvancedPowerForms: ").append(toIndentedString(enableAdvancedPowerForms)).append("\n");
    sb.append("    enableAdvancedPowerFormsMetadata: ").append(toIndentedString(enableAdvancedPowerFormsMetadata)).append("\n");
    sb.append("    enableAutoNav: ").append(toIndentedString(enableAutoNav)).append("\n");
    sb.append("    enableAutoNavMetadata: ").append(toIndentedString(enableAutoNavMetadata)).append("\n");
    sb.append("    enableCalculatedFields: ").append(toIndentedString(enableCalculatedFields)).append("\n");
    sb.append("    enableCalculatedFieldsMetadata: ").append(toIndentedString(enableCalculatedFieldsMetadata)).append("\n");
    sb.append("    enableClickwraps: ").append(toIndentedString(enableClickwraps)).append("\n");
    sb.append("    enableClickwrapsMetadata: ").append(toIndentedString(enableClickwrapsMetadata)).append("\n");
    sb.append("    enableCommentsHistoryDownloadInSigning: ").append(toIndentedString(enableCommentsHistoryDownloadInSigning)).append("\n");
    sb.append("    enableCommentsHistoryDownloadInSigningMetadata: ").append(toIndentedString(enableCommentsHistoryDownloadInSigningMetadata)).append("\n");
    sb.append("    enableCustomerSatisfactionMetricTracking: ").append(toIndentedString(enableCustomerSatisfactionMetricTracking)).append("\n");
    sb.append("    enableCustomerSatisfactionMetricTrackingMetadata: ").append(toIndentedString(enableCustomerSatisfactionMetricTrackingMetadata)).append("\n");
    sb.append("    enableDSPro: ").append(toIndentedString(enableDSPro)).append("\n");
    sb.append("    enableDSProMetadata: ").append(toIndentedString(enableDSProMetadata)).append("\n");
    sb.append("    enableEnvelopeStampingByAccountAdmin: ").append(toIndentedString(enableEnvelopeStampingByAccountAdmin)).append("\n");
    sb.append("    enableEnvelopeStampingByAccountAdminMetadata: ").append(toIndentedString(enableEnvelopeStampingByAccountAdminMetadata)).append("\n");
    sb.append("    enableEnvelopeStampingByDSAdmin: ").append(toIndentedString(enableEnvelopeStampingByDSAdmin)).append("\n");
    sb.append("    enableEnvelopeStampingByDSAdminMetadata: ").append(toIndentedString(enableEnvelopeStampingByDSAdminMetadata)).append("\n");
    sb.append("    enableInBrowserEditor: ").append(toIndentedString(enableInBrowserEditor)).append("\n");
    sb.append("    enableInBrowserEditorMetadata: ").append(toIndentedString(enableInBrowserEditorMetadata)).append("\n");
    sb.append("    enablePaymentProcessing: ").append(toIndentedString(enablePaymentProcessing)).append("\n");
    sb.append("    enablePaymentProcessingMetadata: ").append(toIndentedString(enablePaymentProcessingMetadata)).append("\n");
    sb.append("    enablePowerForm: ").append(toIndentedString(enablePowerForm)).append("\n");
    sb.append("    enablePowerFormDirect: ").append(toIndentedString(enablePowerFormDirect)).append("\n");
    sb.append("    enablePowerFormDirectMetadata: ").append(toIndentedString(enablePowerFormDirectMetadata)).append("\n");
    sb.append("    enablePowerFormMetadata: ").append(toIndentedString(enablePowerFormMetadata)).append("\n");
    sb.append("    enableRecipientDomainValidation: ").append(toIndentedString(enableRecipientDomainValidation)).append("\n");
    sb.append("    enableRecipientDomainValidationMetadata: ").append(toIndentedString(enableRecipientDomainValidationMetadata)).append("\n");
    sb.append("    enableReportLinks: ").append(toIndentedString(enableReportLinks)).append("\n");
    sb.append("    enableReportLinksMetadata: ").append(toIndentedString(enableReportLinksMetadata)).append("\n");
    sb.append("    enableRequireSignOnPaper: ").append(toIndentedString(enableRequireSignOnPaper)).append("\n");
    sb.append("    enableRequireSignOnPaperMetadata: ").append(toIndentedString(enableRequireSignOnPaperMetadata)).append("\n");
    sb.append("    enableReservedDomain: ").append(toIndentedString(enableReservedDomain)).append("\n");
    sb.append("    enableReservedDomainMetadata: ").append(toIndentedString(enableReservedDomainMetadata)).append("\n");
    sb.append("    enableResponsiveSigning: ").append(toIndentedString(enableResponsiveSigning)).append("\n");
    sb.append("    enableResponsiveSigningMetadata: ").append(toIndentedString(enableResponsiveSigningMetadata)).append("\n");
    sb.append("    enableScheduledRelease: ").append(toIndentedString(enableScheduledRelease)).append("\n");
    sb.append("    enableScheduledReleaseMetadata: ").append(toIndentedString(enableScheduledReleaseMetadata)).append("\n");
    sb.append("    enableSearchUI: ").append(toIndentedString(enableSearchUI)).append("\n");
    sb.append("    enableSearchUIMetadata: ").append(toIndentedString(enableSearchUIMetadata)).append("\n");
    sb.append("    enableSendingTagsFontSettings: ").append(toIndentedString(enableSendingTagsFontSettings)).append("\n");
    sb.append("    enableSendingTagsFontSettingsMetadata: ").append(toIndentedString(enableSendingTagsFontSettingsMetadata)).append("\n");
    sb.append("    enableSendToAgent: ").append(toIndentedString(enableSendToAgent)).append("\n");
    sb.append("    enableSendToAgentMetadata: ").append(toIndentedString(enableSendToAgentMetadata)).append("\n");
    sb.append("    enableSendToIntermediary: ").append(toIndentedString(enableSendToIntermediary)).append("\n");
    sb.append("    enableSendToIntermediaryMetadata: ").append(toIndentedString(enableSendToIntermediaryMetadata)).append("\n");
    sb.append("    enableSendToManage: ").append(toIndentedString(enableSendToManage)).append("\n");
    sb.append("    enableSendToManageMetadata: ").append(toIndentedString(enableSendToManageMetadata)).append("\n");
    sb.append("    enableSequentialSigningAPI: ").append(toIndentedString(enableSequentialSigningAPI)).append("\n");
    sb.append("    enableSequentialSigningAPIMetadata: ").append(toIndentedString(enableSequentialSigningAPIMetadata)).append("\n");
    sb.append("    enableSequentialSigningUI: ").append(toIndentedString(enableSequentialSigningUI)).append("\n");
    sb.append("    enableSequentialSigningUIMetadata: ").append(toIndentedString(enableSequentialSigningUIMetadata)).append("\n");
    sb.append("    enableSignerAttachments: ").append(toIndentedString(enableSignerAttachments)).append("\n");
    sb.append("    enableSignerAttachmentsMetadata: ").append(toIndentedString(enableSignerAttachmentsMetadata)).append("\n");
    sb.append("    enableSigningExtensionComments: ").append(toIndentedString(enableSigningExtensionComments)).append("\n");
    sb.append("    enableSigningExtensionCommentsMetadata: ").append(toIndentedString(enableSigningExtensionCommentsMetadata)).append("\n");
    sb.append("    enableSigningExtensionConversations: ").append(toIndentedString(enableSigningExtensionConversations)).append("\n");
    sb.append("    enableSigningExtensionConversationsMetadata: ").append(toIndentedString(enableSigningExtensionConversationsMetadata)).append("\n");
    sb.append("    enableSigningOrderSettingsForAccount: ").append(toIndentedString(enableSigningOrderSettingsForAccount)).append("\n");
    sb.append("    enableSigningOrderSettingsForAccountMetadata: ").append(toIndentedString(enableSigningOrderSettingsForAccountMetadata)).append("\n");
    sb.append("    enableSignOnPaper: ").append(toIndentedString(enableSignOnPaper)).append("\n");
    sb.append("    enableSignOnPaperMetadata: ").append(toIndentedString(enableSignOnPaperMetadata)).append("\n");
    sb.append("    enableSignOnPaperOverride: ").append(toIndentedString(enableSignOnPaperOverride)).append("\n");
    sb.append("    enableSignOnPaperOverrideMetadata: ").append(toIndentedString(enableSignOnPaperOverrideMetadata)).append("\n");
    sb.append("    enableSignWithNotary: ").append(toIndentedString(enableSignWithNotary)).append("\n");
    sb.append("    enableSignWithNotaryMetadata: ").append(toIndentedString(enableSignWithNotaryMetadata)).append("\n");
    sb.append("    enableSmartContracts: ").append(toIndentedString(enableSmartContracts)).append("\n");
    sb.append("    enableSmartContractsMetadata: ").append(toIndentedString(enableSmartContractsMetadata)).append("\n");
    sb.append("    enableSMSAuthentication: ").append(toIndentedString(enableSMSAuthentication)).append("\n");
    sb.append("    enableSMSAuthenticationMetadata: ").append(toIndentedString(enableSMSAuthenticationMetadata)).append("\n");
    sb.append("    enableSocialIdLogin: ").append(toIndentedString(enableSocialIdLogin)).append("\n");
    sb.append("    enableSocialIdLoginMetadata: ").append(toIndentedString(enableSocialIdLoginMetadata)).append("\n");
    sb.append("    enableStrikeThrough: ").append(toIndentedString(enableStrikeThrough)).append("\n");
    sb.append("    enableStrikeThroughMetadata: ").append(toIndentedString(enableStrikeThroughMetadata)).append("\n");
    sb.append("    enableTransactionPoint: ").append(toIndentedString(enableTransactionPoint)).append("\n");
    sb.append("    enableTransactionPointMetadata: ").append(toIndentedString(enableTransactionPointMetadata)).append("\n");
    sb.append("    enableVaulting: ").append(toIndentedString(enableVaulting)).append("\n");
    sb.append("    enableVaultingMetadata: ").append(toIndentedString(enableVaultingMetadata)).append("\n");
    sb.append("    enableWitnessing: ").append(toIndentedString(enableWitnessing)).append("\n");
    sb.append("    enableWitnessingMetadata: ").append(toIndentedString(enableWitnessingMetadata)).append("\n");
    sb.append("    enforceTemplateNameUniqueness: ").append(toIndentedString(enforceTemplateNameUniqueness)).append("\n");
    sb.append("    enforceTemplateNameUniquenessMetadata: ").append(toIndentedString(enforceTemplateNameUniquenessMetadata)).append("\n");
    sb.append("    envelopeIntegrationAllowed: ").append(toIndentedString(envelopeIntegrationAllowed)).append("\n");
    sb.append("    envelopeIntegrationAllowedMetadata: ").append(toIndentedString(envelopeIntegrationAllowedMetadata)).append("\n");
    sb.append("    envelopeIntegrationEnabled: ").append(toIndentedString(envelopeIntegrationEnabled)).append("\n");
    sb.append("    envelopeIntegrationEnabledMetadata: ").append(toIndentedString(envelopeIntegrationEnabledMetadata)).append("\n");
    sb.append("    envelopeStampingDefaultValue: ").append(toIndentedString(envelopeStampingDefaultValue)).append("\n");
    sb.append("    envelopeStampingDefaultValueMetadata: ").append(toIndentedString(envelopeStampingDefaultValueMetadata)).append("\n");
    sb.append("    expressSend: ").append(toIndentedString(expressSend)).append("\n");
    sb.append("    expressSendAllowTabs: ").append(toIndentedString(expressSendAllowTabs)).append("\n");
    sb.append("    expressSendAllowTabsMetadata: ").append(toIndentedString(expressSendAllowTabsMetadata)).append("\n");
    sb.append("    expressSendMetadata: ").append(toIndentedString(expressSendMetadata)).append("\n");
    sb.append("    externalDocumentSources: ").append(toIndentedString(externalDocumentSources)).append("\n");
    sb.append("    externalSignaturePadType: ").append(toIndentedString(externalSignaturePadType)).append("\n");
    sb.append("    externalSignaturePadTypeMetadata: ").append(toIndentedString(externalSignaturePadTypeMetadata)).append("\n");
    sb.append("    faxOutEnabled: ").append(toIndentedString(faxOutEnabled)).append("\n");
    sb.append("    faxOutEnabledMetadata: ").append(toIndentedString(faxOutEnabledMetadata)).append("\n");
    sb.append("    guidedFormsHtmlAllowed: ").append(toIndentedString(guidedFormsHtmlAllowed)).append("\n");
    sb.append("    guidedFormsHtmlAllowedMetadata: ").append(toIndentedString(guidedFormsHtmlAllowedMetadata)).append("\n");
    sb.append("    hideAccountAddressInCoC: ").append(toIndentedString(hideAccountAddressInCoC)).append("\n");
    sb.append("    hideAccountAddressInCoCMetadata: ").append(toIndentedString(hideAccountAddressInCoCMetadata)).append("\n");
    sb.append("    hidePricing: ").append(toIndentedString(hidePricing)).append("\n");
    sb.append("    hidePricingMetadata: ").append(toIndentedString(hidePricingMetadata)).append("\n");
    sb.append("    idCheckConfigurations: ").append(toIndentedString(idCheckConfigurations)).append("\n");
    sb.append("    idCheckExpire: ").append(toIndentedString(idCheckExpire)).append("\n");
    sb.append("    idCheckExpireDays: ").append(toIndentedString(idCheckExpireDays)).append("\n");
    sb.append("    idCheckExpireDaysMetadata: ").append(toIndentedString(idCheckExpireDaysMetadata)).append("\n");
    sb.append("    idCheckExpireMetadata: ").append(toIndentedString(idCheckExpireMetadata)).append("\n");
    sb.append("    idCheckExpireMinutes: ").append(toIndentedString(idCheckExpireMinutes)).append("\n");
    sb.append("    idCheckExpireMinutesMetadata: ").append(toIndentedString(idCheckExpireMinutesMetadata)).append("\n");
    sb.append("    idCheckRequired: ").append(toIndentedString(idCheckRequired)).append("\n");
    sb.append("    idCheckRequiredMetadata: ").append(toIndentedString(idCheckRequiredMetadata)).append("\n");
    sb.append("    identityVerification: ").append(toIndentedString(identityVerification)).append("\n");
    sb.append("    identityVerificationMetadata: ").append(toIndentedString(identityVerificationMetadata)).append("\n");
    sb.append("    ignoreErrorIfAnchorTabNotFound: ").append(toIndentedString(ignoreErrorIfAnchorTabNotFound)).append("\n");
    sb.append("    ignoreErrorIfAnchorTabNotFoundMetadataEnabled: ").append(toIndentedString(ignoreErrorIfAnchorTabNotFoundMetadataEnabled)).append("\n");
    sb.append("    inPersonIDCheckQuestion: ").append(toIndentedString(inPersonIDCheckQuestion)).append("\n");
    sb.append("    inPersonIDCheckQuestionMetadata: ").append(toIndentedString(inPersonIDCheckQuestionMetadata)).append("\n");
    sb.append("    inPersonSigningEnabled: ").append(toIndentedString(inPersonSigningEnabled)).append("\n");
    sb.append("    inPersonSigningEnabledMetadata: ").append(toIndentedString(inPersonSigningEnabledMetadata)).append("\n");
    sb.append("    inSessionEnabled: ").append(toIndentedString(inSessionEnabled)).append("\n");
    sb.append("    inSessionEnabledMetadata: ").append(toIndentedString(inSessionEnabledMetadata)).append("\n");
    sb.append("    inSessionSuppressEmails: ").append(toIndentedString(inSessionSuppressEmails)).append("\n");
    sb.append("    inSessionSuppressEmailsMetadata: ").append(toIndentedString(inSessionSuppressEmailsMetadata)).append("\n");
    sb.append("    maximumSigningGroups: ").append(toIndentedString(maximumSigningGroups)).append("\n");
    sb.append("    maximumSigningGroupsMetadata: ").append(toIndentedString(maximumSigningGroupsMetadata)).append("\n");
    sb.append("    maximumUsersPerSigningGroup: ").append(toIndentedString(maximumUsersPerSigningGroup)).append("\n");
    sb.append("    maximumUsersPerSigningGroupMetadata: ").append(toIndentedString(maximumUsersPerSigningGroupMetadata)).append("\n");
    sb.append("    maxNumberOfCustomStamps: ").append(toIndentedString(maxNumberOfCustomStamps)).append("\n");
    sb.append("    mobileSessionTimeout: ").append(toIndentedString(mobileSessionTimeout)).append("\n");
    sb.append("    mobileSessionTimeoutMetadata: ").append(toIndentedString(mobileSessionTimeoutMetadata)).append("\n");
    sb.append("    numberOfActiveCustomStamps: ").append(toIndentedString(numberOfActiveCustomStamps)).append("\n");
    sb.append("    optInMobileSigningV02: ").append(toIndentedString(optInMobileSigningV02)).append("\n");
    sb.append("    optInMobileSigningV02Metadata: ").append(toIndentedString(optInMobileSigningV02Metadata)).append("\n");
    sb.append("    optOutAutoNavTextAndTabColorUpdates: ").append(toIndentedString(optOutAutoNavTextAndTabColorUpdates)).append("\n");
    sb.append("    optOutAutoNavTextAndTabColorUpdatesMetadata: ").append(toIndentedString(optOutAutoNavTextAndTabColorUpdatesMetadata)).append("\n");
    sb.append("    optOutNewPlatformSeal: ").append(toIndentedString(optOutNewPlatformSeal)).append("\n");
    sb.append("    optOutNewPlatformSealPlatformMetadata: ").append(toIndentedString(optOutNewPlatformSealPlatformMetadata)).append("\n");
    sb.append("    phoneAuthRecipientMayProvidePhoneNumber: ").append(toIndentedString(phoneAuthRecipientMayProvidePhoneNumber)).append("\n");
    sb.append("    phoneAuthRecipientMayProvidePhoneNumberMetadata: ").append(toIndentedString(phoneAuthRecipientMayProvidePhoneNumberMetadata)).append("\n");
    sb.append("    pkiSignDownloadedPDFDocs: ").append(toIndentedString(pkiSignDownloadedPDFDocs)).append("\n");
    sb.append("    pkiSignDownloadedPDFDocsMetadata: ").append(toIndentedString(pkiSignDownloadedPDFDocsMetadata)).append("\n");
    sb.append("    recipientsCanSignOffline: ").append(toIndentedString(recipientsCanSignOffline)).append("\n");
    sb.append("    recipientsCanSignOfflineMetadata: ").append(toIndentedString(recipientsCanSignOfflineMetadata)).append("\n");
    sb.append("    recipientSigningAutoNavigationControl: ").append(toIndentedString(recipientSigningAutoNavigationControl)).append("\n");
    sb.append("    recipientSigningAutoNavigationControlMetadata: ").append(toIndentedString(recipientSigningAutoNavigationControlMetadata)).append("\n");
    sb.append("    require21CFRpt11Compliance: ").append(toIndentedString(require21CFRpt11Compliance)).append("\n");
    sb.append("    require21CFRpt11ComplianceMetadata: ").append(toIndentedString(require21CFRpt11ComplianceMetadata)).append("\n");
    sb.append("    requireDeclineReason: ").append(toIndentedString(requireDeclineReason)).append("\n");
    sb.append("    requireDeclineReasonMetadata: ").append(toIndentedString(requireDeclineReasonMetadata)).append("\n");
    sb.append("    requireExternalUserManagement: ").append(toIndentedString(requireExternalUserManagement)).append("\n");
    sb.append("    requireExternalUserManagementMetadata: ").append(toIndentedString(requireExternalUserManagementMetadata)).append("\n");
    sb.append("    requireSignerCertificateType: ").append(toIndentedString(requireSignerCertificateType)).append("\n");
    sb.append("    requireSignerCertificateTypeMetadata: ").append(toIndentedString(requireSignerCertificateTypeMetadata)).append("\n");
    sb.append("    rsaVeridAccountName: ").append(toIndentedString(rsaVeridAccountName)).append("\n");
    sb.append("    rsaVeridPassword: ").append(toIndentedString(rsaVeridPassword)).append("\n");
    sb.append("    rsaVeridRuleset: ").append(toIndentedString(rsaVeridRuleset)).append("\n");
    sb.append("    rsaVeridUserId: ").append(toIndentedString(rsaVeridUserId)).append("\n");
    sb.append("    selfSignedRecipientEmailDocument: ").append(toIndentedString(selfSignedRecipientEmailDocument)).append("\n");
    sb.append("    selfSignedRecipientEmailDocumentMetadata: ").append(toIndentedString(selfSignedRecipientEmailDocumentMetadata)).append("\n");
    sb.append("    selfSignedRecipientEmailDocumentUserOverride: ").append(toIndentedString(selfSignedRecipientEmailDocumentUserOverride)).append("\n");
    sb.append("    selfSignedRecipientEmailDocumentUserOverrideMetadata: ").append(toIndentedString(selfSignedRecipientEmailDocumentUserOverrideMetadata)).append("\n");
    sb.append("    senderCanSignInEachLocation: ").append(toIndentedString(senderCanSignInEachLocation)).append("\n");
    sb.append("    senderCanSignInEachLocationMetadata: ").append(toIndentedString(senderCanSignInEachLocationMetadata)).append("\n");
    sb.append("    senderMustAuthenticateSigning: ").append(toIndentedString(senderMustAuthenticateSigning)).append("\n");
    sb.append("    senderMustAuthenticateSigningMetadata: ").append(toIndentedString(senderMustAuthenticateSigningMetadata)).append("\n");
    sb.append("    sendingTagsFontColor: ").append(toIndentedString(sendingTagsFontColor)).append("\n");
    sb.append("    sendingTagsFontColorMetadata: ").append(toIndentedString(sendingTagsFontColorMetadata)).append("\n");
    sb.append("    sendingTagsFontName: ").append(toIndentedString(sendingTagsFontName)).append("\n");
    sb.append("    sendingTagsFontNameMetadata: ").append(toIndentedString(sendingTagsFontNameMetadata)).append("\n");
    sb.append("    sendingTagsFontSize: ").append(toIndentedString(sendingTagsFontSize)).append("\n");
    sb.append("    sendingTagsFontSizeMetadata: ").append(toIndentedString(sendingTagsFontSizeMetadata)).append("\n");
    sb.append("    sendToCertifiedDeliveryEnabled: ").append(toIndentedString(sendToCertifiedDeliveryEnabled)).append("\n");
    sb.append("    sendToCertifiedDeliveryEnabledMetadata: ").append(toIndentedString(sendToCertifiedDeliveryEnabledMetadata)).append("\n");
    sb.append("    sessionTimeout: ").append(toIndentedString(sessionTimeout)).append("\n");
    sb.append("    sessionTimeoutMetadata: ").append(toIndentedString(sessionTimeoutMetadata)).append("\n");
    sb.append("    setRecipEmailLang: ").append(toIndentedString(setRecipEmailLang)).append("\n");
    sb.append("    setRecipEmailLangMetadata: ").append(toIndentedString(setRecipEmailLangMetadata)).append("\n");
    sb.append("    setRecipSignLang: ").append(toIndentedString(setRecipSignLang)).append("\n");
    sb.append("    setRecipSignLangMetadata: ").append(toIndentedString(setRecipSignLangMetadata)).append("\n");
    sb.append("    sharedTemplateFolders: ").append(toIndentedString(sharedTemplateFolders)).append("\n");
    sb.append("    sharedTemplateFoldersMetadata: ").append(toIndentedString(sharedTemplateFoldersMetadata)).append("\n");
    sb.append("    showCompleteDialogInEmbeddedSession: ").append(toIndentedString(showCompleteDialogInEmbeddedSession)).append("\n");
    sb.append("    showCompleteDialogInEmbeddedSessionMetadata: ").append(toIndentedString(showCompleteDialogInEmbeddedSessionMetadata)).append("\n");
    sb.append("    showConditionalRoutingOnSend: ").append(toIndentedString(showConditionalRoutingOnSend)).append("\n");
    sb.append("    showConditionalRoutingOnSendMetadata: ").append(toIndentedString(showConditionalRoutingOnSendMetadata)).append("\n");
    sb.append("    showInitialConditionalFields: ").append(toIndentedString(showInitialConditionalFields)).append("\n");
    sb.append("    showInitialConditionalFieldsMetadata: ").append(toIndentedString(showInitialConditionalFieldsMetadata)).append("\n");
    sb.append("    showLocalizedWatermarks: ").append(toIndentedString(showLocalizedWatermarks)).append("\n");
    sb.append("    showLocalizedWatermarksMetadata: ").append(toIndentedString(showLocalizedWatermarksMetadata)).append("\n");
    sb.append("    showTutorials: ").append(toIndentedString(showTutorials)).append("\n");
    sb.append("    showTutorialsMetadata: ").append(toIndentedString(showTutorialsMetadata)).append("\n");
    sb.append("    signatureProviders: ").append(toIndentedString(signatureProviders)).append("\n");
    sb.append("    signatureProvidersMetadata: ").append(toIndentedString(signatureProvidersMetadata)).append("\n");
    sb.append("    signDateFormat: ").append(toIndentedString(signDateFormat)).append("\n");
    sb.append("    signDateFormatMetadata: ").append(toIndentedString(signDateFormatMetadata)).append("\n");
    sb.append("    signerAttachCertificateToEnvelopePDF: ").append(toIndentedString(signerAttachCertificateToEnvelopePDF)).append("\n");
    sb.append("    signerAttachCertificateToEnvelopePDFMetadata: ").append(toIndentedString(signerAttachCertificateToEnvelopePDFMetadata)).append("\n");
    sb.append("    signerAttachConcat: ").append(toIndentedString(signerAttachConcat)).append("\n");
    sb.append("    signerAttachConcatMetadata: ").append(toIndentedString(signerAttachConcatMetadata)).append("\n");
    sb.append("    signerCanCreateAccount: ").append(toIndentedString(signerCanCreateAccount)).append("\n");
    sb.append("    signerCanCreateAccountMetadata: ").append(toIndentedString(signerCanCreateAccountMetadata)).append("\n");
    sb.append("    signerCanSignOnMobile: ").append(toIndentedString(signerCanSignOnMobile)).append("\n");
    sb.append("    signerCanSignOnMobileMetadata: ").append(toIndentedString(signerCanSignOnMobileMetadata)).append("\n");
    sb.append("    signerInSessionUseEnvelopeCompleteEmail: ").append(toIndentedString(signerInSessionUseEnvelopeCompleteEmail)).append("\n");
    sb.append("    signerInSessionUseEnvelopeCompleteEmailMetadata: ").append(toIndentedString(signerInSessionUseEnvelopeCompleteEmailMetadata)).append("\n");
    sb.append("    signerLoginRequirements: ").append(toIndentedString(signerLoginRequirements)).append("\n");
    sb.append("    signerLoginRequirementsMetadata: ").append(toIndentedString(signerLoginRequirementsMetadata)).append("\n");
    sb.append("    signerMustHaveAccount: ").append(toIndentedString(signerMustHaveAccount)).append("\n");
    sb.append("    signerMustHaveAccountMetadata: ").append(toIndentedString(signerMustHaveAccountMetadata)).append("\n");
    sb.append("    signerMustLoginToSign: ").append(toIndentedString(signerMustLoginToSign)).append("\n");
    sb.append("    signerMustLoginToSignMetadata: ").append(toIndentedString(signerMustLoginToSignMetadata)).append("\n");
    sb.append("    signerShowSecureFieldInitialValues: ").append(toIndentedString(signerShowSecureFieldInitialValues)).append("\n");
    sb.append("    signerShowSecureFieldInitialValuesMetadata: ").append(toIndentedString(signerShowSecureFieldInitialValuesMetadata)).append("\n");
    sb.append("    signingSessionTimeout: ").append(toIndentedString(signingSessionTimeout)).append("\n");
    sb.append("    signingSessionTimeoutMetadata: ").append(toIndentedString(signingSessionTimeoutMetadata)).append("\n");
    sb.append("    signingUiVersion: ").append(toIndentedString(signingUiVersion)).append("\n");
    sb.append("    signingUiVersionMetadata: ").append(toIndentedString(signingUiVersionMetadata)).append("\n");
    sb.append("    signTimeFormat: ").append(toIndentedString(signTimeFormat)).append("\n");
    sb.append("    signTimeFormatMetadata: ").append(toIndentedString(signTimeFormatMetadata)).append("\n");
    sb.append("    signTimeShowAmPm: ").append(toIndentedString(signTimeShowAmPm)).append("\n");
    sb.append("    signTimeShowAmPmMetadata: ").append(toIndentedString(signTimeShowAmPmMetadata)).append("\n");
    sb.append("    simplifiedSendingEnabled: ").append(toIndentedString(simplifiedSendingEnabled)).append("\n");
    sb.append("    simplifiedSendingEnabledMetadata: ").append(toIndentedString(simplifiedSendingEnabledMetadata)).append("\n");
    sb.append("    singleSignOnEnabled: ").append(toIndentedString(singleSignOnEnabled)).append("\n");
    sb.append("    singleSignOnEnabledMetadata: ").append(toIndentedString(singleSignOnEnabledMetadata)).append("\n");
    sb.append("    skipAuthCompletedEnvelopes: ").append(toIndentedString(skipAuthCompletedEnvelopes)).append("\n");
    sb.append("    skipAuthCompletedEnvelopesMetadata: ").append(toIndentedString(skipAuthCompletedEnvelopesMetadata)).append("\n");
    sb.append("    socialIdRecipAuth: ").append(toIndentedString(socialIdRecipAuth)).append("\n");
    sb.append("    socialIdRecipAuthMetadata: ").append(toIndentedString(socialIdRecipAuthMetadata)).append("\n");
    sb.append("    specifyDocumentVisibility: ").append(toIndentedString(specifyDocumentVisibility)).append("\n");
    sb.append("    specifyDocumentVisibilityMetadata: ").append(toIndentedString(specifyDocumentVisibilityMetadata)).append("\n");
    sb.append("    startInAdvancedCorrect: ").append(toIndentedString(startInAdvancedCorrect)).append("\n");
    sb.append("    startInAdvancedCorrectMetadata: ").append(toIndentedString(startInAdvancedCorrectMetadata)).append("\n");
    sb.append("    supplementalDocumentsMustAccept: ").append(toIndentedString(supplementalDocumentsMustAccept)).append("\n");
    sb.append("    supplementalDocumentsMustAcceptMetadata: ").append(toIndentedString(supplementalDocumentsMustAcceptMetadata)).append("\n");
    sb.append("    supplementalDocumentsMustRead: ").append(toIndentedString(supplementalDocumentsMustRead)).append("\n");
    sb.append("    supplementalDocumentsMustReadMetadata: ").append(toIndentedString(supplementalDocumentsMustReadMetadata)).append("\n");
    sb.append("    supplementalDocumentsMustView: ").append(toIndentedString(supplementalDocumentsMustView)).append("\n");
    sb.append("    supplementalDocumentsMustViewMetadata: ").append(toIndentedString(supplementalDocumentsMustViewMetadata)).append("\n");
    sb.append("    suppressCertificateEnforcement: ").append(toIndentedString(suppressCertificateEnforcement)).append("\n");
    sb.append("    suppressCertificateEnforcementMetadata: ").append(toIndentedString(suppressCertificateEnforcementMetadata)).append("\n");
    sb.append("    tabAccountSettings: ").append(toIndentedString(tabAccountSettings)).append("\n");
    sb.append("    timezoneOffsetAPI: ").append(toIndentedString(timezoneOffsetAPI)).append("\n");
    sb.append("    timezoneOffsetAPIMetadata: ").append(toIndentedString(timezoneOffsetAPIMetadata)).append("\n");
    sb.append("    timezoneOffsetUI: ").append(toIndentedString(timezoneOffsetUI)).append("\n");
    sb.append("    timezoneOffsetUIMetadata: ").append(toIndentedString(timezoneOffsetUIMetadata)).append("\n");
    sb.append("    universalSignatureOptIn: ").append(toIndentedString(universalSignatureOptIn)).append("\n");
    sb.append("    useAccountLevelEmail: ").append(toIndentedString(useAccountLevelEmail)).append("\n");
    sb.append("    useAccountLevelEmailMetadata: ").append(toIndentedString(useAccountLevelEmailMetadata)).append("\n");
    sb.append("    useConsumerDisclosure: ").append(toIndentedString(useConsumerDisclosure)).append("\n");
    sb.append("    useConsumerDisclosureMetadata: ").append(toIndentedString(useConsumerDisclosureMetadata)).append("\n");
    sb.append("    useConsumerDisclosureWithinAccount: ").append(toIndentedString(useConsumerDisclosureWithinAccount)).append("\n");
    sb.append("    useConsumerDisclosureWithinAccountMetadata: ").append(toIndentedString(useConsumerDisclosureWithinAccountMetadata)).append("\n");
    sb.append("    useDerivedKeys: ").append(toIndentedString(useDerivedKeys)).append("\n");
    sb.append("    useDerivedKeysMetadata: ").append(toIndentedString(useDerivedKeysMetadata)).append("\n");
    sb.append("    useDocuSignExpressSignerCertificate: ").append(toIndentedString(useDocuSignExpressSignerCertificate)).append("\n");
    sb.append("    useDocuSignExpressSignerCertificateMetadata: ").append(toIndentedString(useDocuSignExpressSignerCertificateMetadata)).append("\n");
    sb.append("    useMultiAppGroupsData: ").append(toIndentedString(useMultiAppGroupsData)).append("\n");
    sb.append("    useMultiAppGroupsDataMetadata: ").append(toIndentedString(useMultiAppGroupsDataMetadata)).append("\n");
    sb.append("    useNewBlobForPdf: ").append(toIndentedString(useNewBlobForPdf)).append("\n");
    sb.append("    useNewBlobForPdfMetadata: ").append(toIndentedString(useNewBlobForPdfMetadata)).append("\n");
    sb.append("    useSAFESignerCertificates: ").append(toIndentedString(useSAFESignerCertificates)).append("\n");
    sb.append("    useSAFESignerCertificatesMetadata: ").append(toIndentedString(useSAFESignerCertificatesMetadata)).append("\n");
    sb.append("    usesAPI: ").append(toIndentedString(usesAPI)).append("\n");
    sb.append("    usesAPIMetadata: ").append(toIndentedString(usesAPIMetadata)).append("\n");
    sb.append("    useSignatureProviderPlatform: ").append(toIndentedString(useSignatureProviderPlatform)).append("\n");
    sb.append("    useSignatureProviderPlatformMetadata: ").append(toIndentedString(useSignatureProviderPlatformMetadata)).append("\n");
    sb.append("    validationsAllowed: ").append(toIndentedString(validationsAllowed)).append("\n");
    sb.append("    validationsAllowedMetadata: ").append(toIndentedString(validationsAllowedMetadata)).append("\n");
    sb.append("    validationsBrand: ").append(toIndentedString(validationsBrand)).append("\n");
    sb.append("    validationsBrandMetadata: ").append(toIndentedString(validationsBrandMetadata)).append("\n");
    sb.append("    validationsCadence: ").append(toIndentedString(validationsCadence)).append("\n");
    sb.append("    validationsCadenceMetadata: ").append(toIndentedString(validationsCadenceMetadata)).append("\n");
    sb.append("    validationsEnabled: ").append(toIndentedString(validationsEnabled)).append("\n");
    sb.append("    validationsEnabledMetadata: ").append(toIndentedString(validationsEnabledMetadata)).append("\n");
    sb.append("    validationsReport: ").append(toIndentedString(validationsReport)).append("\n");
    sb.append("    validationsReportMetadata: ").append(toIndentedString(validationsReportMetadata)).append("\n");
    sb.append("    waterMarkEnabled: ").append(toIndentedString(waterMarkEnabled)).append("\n");
    sb.append("    waterMarkEnabledMetadata: ").append(toIndentedString(waterMarkEnabledMetadata)).append("\n");
    sb.append("    writeReminderToEnvelopeHistory: ").append(toIndentedString(writeReminderToEnvelopeHistory)).append("\n");
    sb.append("    writeReminderToEnvelopeHistoryMetadata: ").append(toIndentedString(writeReminderToEnvelopeHistoryMetadata)).append("\n");
    sb.append("    wurflMinAllowableScreenSize: ").append(toIndentedString(wurflMinAllowableScreenSize)).append("\n");
    sb.append("    wurflMinAllowableScreenSizeMetadata: ").append(toIndentedString(wurflMinAllowableScreenSizeMetadata)).append("\n");
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

