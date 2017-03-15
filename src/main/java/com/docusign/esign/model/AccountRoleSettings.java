package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AccountRoleSettings   {
  
  private String allowAccountManagement = null;
  private SettingsMetadata allowAccountManagementMetadata = null;
  private String allowApiAccess = null;
  private SettingsMetadata allowApiAccessMetadata = null;
  private String allowApiAccessToAccount = null;
  private SettingsMetadata allowApiAccessToAccountMetadata = null;
  private String allowApiSendingOnBehalfOfOthers = null;
  private SettingsMetadata allowApiSendingOnBehalfOfOthersMetadata = null;
  private String allowApiSequentialSigning = null;
  private SettingsMetadata allowApiSequentialSigningMetadata = null;
  private String allowBulkSending = null;
  private SettingsMetadata allowBulkSendingMetadata = null;
  private String allowDocuSignDesktopClient = null;
  private SettingsMetadata allowDocuSignDesktopClientMetadata = null;
  private String allowedAddressBookAccess = null;
  private SettingsMetadata allowedAddressBookAccessMetadata = null;
  private String allowedTemplateAccess = null;
  private SettingsMetadata allowedTemplateAccessMetadata = null;
  private String allowedToBeEnvelopeTransferRecipient = null;
  private SettingsMetadata allowedToBeEnvelopeTransferRecipientMetadata = null;
  private String allowEnvelopeSending = null;
  private SettingsMetadata allowEnvelopeSendingMetadata = null;
  private String allowSendersToSetRecipientEmailLanguage = null;
  private SettingsMetadata allowSendersToSetRecipientEmailLanguageMetadata = null;
  private String allowSignerAttachments = null;
  private SettingsMetadata allowSignerAttachmentsMetadata = null;
  private String allowSupplementalDocuments = null;
  private SettingsMetadata allowSupplementalDocumentsMetadata = null;
  private String allowTaggingInSendAndCorrect = null;
  private SettingsMetadata allowTaggingInSendAndCorrectMetadata = null;
  private String allowVaulting = null;
  private SettingsMetadata allowVaultingMetadata = null;
  private String allowWetSigningOverride = null;
  private SettingsMetadata allowWetSigningOverrideMetadata = null;
  private String canCreateWorkspaces = null;
  private SettingsMetadata canCreateWorkspacesMetadata = null;
  private String disableDocumentUpload = null;
  private SettingsMetadata disableDocumentUploadMetadata = null;
  private String disableOtherActions = null;
  private SettingsMetadata disableOtherActionsMetadata = null;
  private String enableApiRequestLogging = null;
  private SettingsMetadata enableApiRequestLoggingMetadata = null;
  private String enableRecipientViewingNotifications = null;
  private SettingsMetadata enableRecipientViewingNotificationsMetadata = null;
  private String enableSequentialSigningInterface = null;
  private SettingsMetadata enableSequentialSigningInterfaceMetadata = null;
  private String enableTransactionPointIntegration = null;
  private SettingsMetadata enableTransactionPointIntegrationMetadata = null;
  private String powerFormRole = null;
  private SettingsMetadata powerFormRoleMetadata = null;
  private String receiveCompletedSelfSignedDocumentsAsEmailLinks = null;
  private SettingsMetadata receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata = null;
  private String supplementalDocumentsMustAccept = null;
  private SettingsMetadata supplementalDocumentsMustAcceptMetadata = null;
  private String supplementalDocumentsMustRead = null;
  private SettingsMetadata supplementalDocumentsMustReadMetadata = null;
  private String supplementalDocumentsMustView = null;
  private SettingsMetadata supplementalDocumentsMustViewMetadata = null;
  private String useNewDocuSignExperienceInterface = null;
  private SettingsMetadata useNewDocuSignExperienceInterfaceMetadata = null;
  private String useNewSendingInterface = null;
  private SettingsMetadata useNewSendingInterfaceMetadata = null;
  private String vaultingMode = null;
  private SettingsMetadata vaultingModeMetadata = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowAccountManagement")
  public String getAllowAccountManagement() {
    return allowAccountManagement;
  }
  public void setAllowAccountManagement(String allowAccountManagement) {
    this.allowAccountManagement = allowAccountManagement;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowAccountManagementMetadata")
  public SettingsMetadata getAllowAccountManagementMetadata() {
    return allowAccountManagementMetadata;
  }
  public void setAllowAccountManagementMetadata(SettingsMetadata allowAccountManagementMetadata) {
    this.allowAccountManagementMetadata = allowAccountManagementMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowApiAccess")
  public String getAllowApiAccess() {
    return allowApiAccess;
  }
  public void setAllowApiAccess(String allowApiAccess) {
    this.allowApiAccess = allowApiAccess;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowApiAccessMetadata")
  public SettingsMetadata getAllowApiAccessMetadata() {
    return allowApiAccessMetadata;
  }
  public void setAllowApiAccessMetadata(SettingsMetadata allowApiAccessMetadata) {
    this.allowApiAccessMetadata = allowApiAccessMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowApiAccessToAccount")
  public String getAllowApiAccessToAccount() {
    return allowApiAccessToAccount;
  }
  public void setAllowApiAccessToAccount(String allowApiAccessToAccount) {
    this.allowApiAccessToAccount = allowApiAccessToAccount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowApiAccessToAccountMetadata")
  public SettingsMetadata getAllowApiAccessToAccountMetadata() {
    return allowApiAccessToAccountMetadata;
  }
  public void setAllowApiAccessToAccountMetadata(SettingsMetadata allowApiAccessToAccountMetadata) {
    this.allowApiAccessToAccountMetadata = allowApiAccessToAccountMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowApiSendingOnBehalfOfOthers")
  public String getAllowApiSendingOnBehalfOfOthers() {
    return allowApiSendingOnBehalfOfOthers;
  }
  public void setAllowApiSendingOnBehalfOfOthers(String allowApiSendingOnBehalfOfOthers) {
    this.allowApiSendingOnBehalfOfOthers = allowApiSendingOnBehalfOfOthers;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowApiSendingOnBehalfOfOthersMetadata")
  public SettingsMetadata getAllowApiSendingOnBehalfOfOthersMetadata() {
    return allowApiSendingOnBehalfOfOthersMetadata;
  }
  public void setAllowApiSendingOnBehalfOfOthersMetadata(SettingsMetadata allowApiSendingOnBehalfOfOthersMetadata) {
    this.allowApiSendingOnBehalfOfOthersMetadata = allowApiSendingOnBehalfOfOthersMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowApiSequentialSigning")
  public String getAllowApiSequentialSigning() {
    return allowApiSequentialSigning;
  }
  public void setAllowApiSequentialSigning(String allowApiSequentialSigning) {
    this.allowApiSequentialSigning = allowApiSequentialSigning;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowApiSequentialSigningMetadata")
  public SettingsMetadata getAllowApiSequentialSigningMetadata() {
    return allowApiSequentialSigningMetadata;
  }
  public void setAllowApiSequentialSigningMetadata(SettingsMetadata allowApiSequentialSigningMetadata) {
    this.allowApiSequentialSigningMetadata = allowApiSequentialSigningMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowBulkSending")
  public String getAllowBulkSending() {
    return allowBulkSending;
  }
  public void setAllowBulkSending(String allowBulkSending) {
    this.allowBulkSending = allowBulkSending;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowBulkSendingMetadata")
  public SettingsMetadata getAllowBulkSendingMetadata() {
    return allowBulkSendingMetadata;
  }
  public void setAllowBulkSendingMetadata(SettingsMetadata allowBulkSendingMetadata) {
    this.allowBulkSendingMetadata = allowBulkSendingMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowDocuSignDesktopClient")
  public String getAllowDocuSignDesktopClient() {
    return allowDocuSignDesktopClient;
  }
  public void setAllowDocuSignDesktopClient(String allowDocuSignDesktopClient) {
    this.allowDocuSignDesktopClient = allowDocuSignDesktopClient;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowDocuSignDesktopClientMetadata")
  public SettingsMetadata getAllowDocuSignDesktopClientMetadata() {
    return allowDocuSignDesktopClientMetadata;
  }
  public void setAllowDocuSignDesktopClientMetadata(SettingsMetadata allowDocuSignDesktopClientMetadata) {
    this.allowDocuSignDesktopClientMetadata = allowDocuSignDesktopClientMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowedAddressBookAccess")
  public String getAllowedAddressBookAccess() {
    return allowedAddressBookAccess;
  }
  public void setAllowedAddressBookAccess(String allowedAddressBookAccess) {
    this.allowedAddressBookAccess = allowedAddressBookAccess;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowedAddressBookAccessMetadata")
  public SettingsMetadata getAllowedAddressBookAccessMetadata() {
    return allowedAddressBookAccessMetadata;
  }
  public void setAllowedAddressBookAccessMetadata(SettingsMetadata allowedAddressBookAccessMetadata) {
    this.allowedAddressBookAccessMetadata = allowedAddressBookAccessMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowedTemplateAccess")
  public String getAllowedTemplateAccess() {
    return allowedTemplateAccess;
  }
  public void setAllowedTemplateAccess(String allowedTemplateAccess) {
    this.allowedTemplateAccess = allowedTemplateAccess;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowedTemplateAccessMetadata")
  public SettingsMetadata getAllowedTemplateAccessMetadata() {
    return allowedTemplateAccessMetadata;
  }
  public void setAllowedTemplateAccessMetadata(SettingsMetadata allowedTemplateAccessMetadata) {
    this.allowedTemplateAccessMetadata = allowedTemplateAccessMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowedToBeEnvelopeTransferRecipient")
  public String getAllowedToBeEnvelopeTransferRecipient() {
    return allowedToBeEnvelopeTransferRecipient;
  }
  public void setAllowedToBeEnvelopeTransferRecipient(String allowedToBeEnvelopeTransferRecipient) {
    this.allowedToBeEnvelopeTransferRecipient = allowedToBeEnvelopeTransferRecipient;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowedToBeEnvelopeTransferRecipientMetadata")
  public SettingsMetadata getAllowedToBeEnvelopeTransferRecipientMetadata() {
    return allowedToBeEnvelopeTransferRecipientMetadata;
  }
  public void setAllowedToBeEnvelopeTransferRecipientMetadata(SettingsMetadata allowedToBeEnvelopeTransferRecipientMetadata) {
    this.allowedToBeEnvelopeTransferRecipientMetadata = allowedToBeEnvelopeTransferRecipientMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowEnvelopeSending")
  public String getAllowEnvelopeSending() {
    return allowEnvelopeSending;
  }
  public void setAllowEnvelopeSending(String allowEnvelopeSending) {
    this.allowEnvelopeSending = allowEnvelopeSending;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowEnvelopeSendingMetadata")
  public SettingsMetadata getAllowEnvelopeSendingMetadata() {
    return allowEnvelopeSendingMetadata;
  }
  public void setAllowEnvelopeSendingMetadata(SettingsMetadata allowEnvelopeSendingMetadata) {
    this.allowEnvelopeSendingMetadata = allowEnvelopeSendingMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowSendersToSetRecipientEmailLanguage")
  public String getAllowSendersToSetRecipientEmailLanguage() {
    return allowSendersToSetRecipientEmailLanguage;
  }
  public void setAllowSendersToSetRecipientEmailLanguage(String allowSendersToSetRecipientEmailLanguage) {
    this.allowSendersToSetRecipientEmailLanguage = allowSendersToSetRecipientEmailLanguage;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowSendersToSetRecipientEmailLanguageMetadata")
  public SettingsMetadata getAllowSendersToSetRecipientEmailLanguageMetadata() {
    return allowSendersToSetRecipientEmailLanguageMetadata;
  }
  public void setAllowSendersToSetRecipientEmailLanguageMetadata(SettingsMetadata allowSendersToSetRecipientEmailLanguageMetadata) {
    this.allowSendersToSetRecipientEmailLanguageMetadata = allowSendersToSetRecipientEmailLanguageMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowSignerAttachments")
  public String getAllowSignerAttachments() {
    return allowSignerAttachments;
  }
  public void setAllowSignerAttachments(String allowSignerAttachments) {
    this.allowSignerAttachments = allowSignerAttachments;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowSignerAttachmentsMetadata")
  public SettingsMetadata getAllowSignerAttachmentsMetadata() {
    return allowSignerAttachmentsMetadata;
  }
  public void setAllowSignerAttachmentsMetadata(SettingsMetadata allowSignerAttachmentsMetadata) {
    this.allowSignerAttachmentsMetadata = allowSignerAttachmentsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowSupplementalDocuments")
  public String getAllowSupplementalDocuments() {
    return allowSupplementalDocuments;
  }
  public void setAllowSupplementalDocuments(String allowSupplementalDocuments) {
    this.allowSupplementalDocuments = allowSupplementalDocuments;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowSupplementalDocumentsMetadata")
  public SettingsMetadata getAllowSupplementalDocumentsMetadata() {
    return allowSupplementalDocumentsMetadata;
  }
  public void setAllowSupplementalDocumentsMetadata(SettingsMetadata allowSupplementalDocumentsMetadata) {
    this.allowSupplementalDocumentsMetadata = allowSupplementalDocumentsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowTaggingInSendAndCorrect")
  public String getAllowTaggingInSendAndCorrect() {
    return allowTaggingInSendAndCorrect;
  }
  public void setAllowTaggingInSendAndCorrect(String allowTaggingInSendAndCorrect) {
    this.allowTaggingInSendAndCorrect = allowTaggingInSendAndCorrect;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowTaggingInSendAndCorrectMetadata")
  public SettingsMetadata getAllowTaggingInSendAndCorrectMetadata() {
    return allowTaggingInSendAndCorrectMetadata;
  }
  public void setAllowTaggingInSendAndCorrectMetadata(SettingsMetadata allowTaggingInSendAndCorrectMetadata) {
    this.allowTaggingInSendAndCorrectMetadata = allowTaggingInSendAndCorrectMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowVaulting")
  public String getAllowVaulting() {
    return allowVaulting;
  }
  public void setAllowVaulting(String allowVaulting) {
    this.allowVaulting = allowVaulting;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowVaultingMetadata")
  public SettingsMetadata getAllowVaultingMetadata() {
    return allowVaultingMetadata;
  }
  public void setAllowVaultingMetadata(SettingsMetadata allowVaultingMetadata) {
    this.allowVaultingMetadata = allowVaultingMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowWetSigningOverride")
  public String getAllowWetSigningOverride() {
    return allowWetSigningOverride;
  }
  public void setAllowWetSigningOverride(String allowWetSigningOverride) {
    this.allowWetSigningOverride = allowWetSigningOverride;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowWetSigningOverrideMetadata")
  public SettingsMetadata getAllowWetSigningOverrideMetadata() {
    return allowWetSigningOverrideMetadata;
  }
  public void setAllowWetSigningOverrideMetadata(SettingsMetadata allowWetSigningOverrideMetadata) {
    this.allowWetSigningOverrideMetadata = allowWetSigningOverrideMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canCreateWorkspaces")
  public String getCanCreateWorkspaces() {
    return canCreateWorkspaces;
  }
  public void setCanCreateWorkspaces(String canCreateWorkspaces) {
    this.canCreateWorkspaces = canCreateWorkspaces;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canCreateWorkspacesMetadata")
  public SettingsMetadata getCanCreateWorkspacesMetadata() {
    return canCreateWorkspacesMetadata;
  }
  public void setCanCreateWorkspacesMetadata(SettingsMetadata canCreateWorkspacesMetadata) {
    this.canCreateWorkspacesMetadata = canCreateWorkspacesMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("disableDocumentUpload")
  public String getDisableDocumentUpload() {
    return disableDocumentUpload;
  }
  public void setDisableDocumentUpload(String disableDocumentUpload) {
    this.disableDocumentUpload = disableDocumentUpload;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("disableDocumentUploadMetadata")
  public SettingsMetadata getDisableDocumentUploadMetadata() {
    return disableDocumentUploadMetadata;
  }
  public void setDisableDocumentUploadMetadata(SettingsMetadata disableDocumentUploadMetadata) {
    this.disableDocumentUploadMetadata = disableDocumentUploadMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("disableOtherActions")
  public String getDisableOtherActions() {
    return disableOtherActions;
  }
  public void setDisableOtherActions(String disableOtherActions) {
    this.disableOtherActions = disableOtherActions;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("disableOtherActionsMetadata")
  public SettingsMetadata getDisableOtherActionsMetadata() {
    return disableOtherActionsMetadata;
  }
  public void setDisableOtherActionsMetadata(SettingsMetadata disableOtherActionsMetadata) {
    this.disableOtherActionsMetadata = disableOtherActionsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableApiRequestLogging")
  public String getEnableApiRequestLogging() {
    return enableApiRequestLogging;
  }
  public void setEnableApiRequestLogging(String enableApiRequestLogging) {
    this.enableApiRequestLogging = enableApiRequestLogging;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableApiRequestLoggingMetadata")
  public SettingsMetadata getEnableApiRequestLoggingMetadata() {
    return enableApiRequestLoggingMetadata;
  }
  public void setEnableApiRequestLoggingMetadata(SettingsMetadata enableApiRequestLoggingMetadata) {
    this.enableApiRequestLoggingMetadata = enableApiRequestLoggingMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableRecipientViewingNotifications")
  public String getEnableRecipientViewingNotifications() {
    return enableRecipientViewingNotifications;
  }
  public void setEnableRecipientViewingNotifications(String enableRecipientViewingNotifications) {
    this.enableRecipientViewingNotifications = enableRecipientViewingNotifications;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableRecipientViewingNotificationsMetadata")
  public SettingsMetadata getEnableRecipientViewingNotificationsMetadata() {
    return enableRecipientViewingNotificationsMetadata;
  }
  public void setEnableRecipientViewingNotificationsMetadata(SettingsMetadata enableRecipientViewingNotificationsMetadata) {
    this.enableRecipientViewingNotificationsMetadata = enableRecipientViewingNotificationsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableSequentialSigningInterface")
  public String getEnableSequentialSigningInterface() {
    return enableSequentialSigningInterface;
  }
  public void setEnableSequentialSigningInterface(String enableSequentialSigningInterface) {
    this.enableSequentialSigningInterface = enableSequentialSigningInterface;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableSequentialSigningInterfaceMetadata")
  public SettingsMetadata getEnableSequentialSigningInterfaceMetadata() {
    return enableSequentialSigningInterfaceMetadata;
  }
  public void setEnableSequentialSigningInterfaceMetadata(SettingsMetadata enableSequentialSigningInterfaceMetadata) {
    this.enableSequentialSigningInterfaceMetadata = enableSequentialSigningInterfaceMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableTransactionPointIntegration")
  public String getEnableTransactionPointIntegration() {
    return enableTransactionPointIntegration;
  }
  public void setEnableTransactionPointIntegration(String enableTransactionPointIntegration) {
    this.enableTransactionPointIntegration = enableTransactionPointIntegration;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableTransactionPointIntegrationMetadata")
  public SettingsMetadata getEnableTransactionPointIntegrationMetadata() {
    return enableTransactionPointIntegrationMetadata;
  }
  public void setEnableTransactionPointIntegrationMetadata(SettingsMetadata enableTransactionPointIntegrationMetadata) {
    this.enableTransactionPointIntegrationMetadata = enableTransactionPointIntegrationMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("powerFormRole")
  public String getPowerFormRole() {
    return powerFormRole;
  }
  public void setPowerFormRole(String powerFormRole) {
    this.powerFormRole = powerFormRole;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("powerFormRoleMetadata")
  public SettingsMetadata getPowerFormRoleMetadata() {
    return powerFormRoleMetadata;
  }
  public void setPowerFormRoleMetadata(SettingsMetadata powerFormRoleMetadata) {
    this.powerFormRoleMetadata = powerFormRoleMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("receiveCompletedSelfSignedDocumentsAsEmailLinks")
  public String getReceiveCompletedSelfSignedDocumentsAsEmailLinks() {
    return receiveCompletedSelfSignedDocumentsAsEmailLinks;
  }
  public void setReceiveCompletedSelfSignedDocumentsAsEmailLinks(String receiveCompletedSelfSignedDocumentsAsEmailLinks) {
    this.receiveCompletedSelfSignedDocumentsAsEmailLinks = receiveCompletedSelfSignedDocumentsAsEmailLinks;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata")
  public SettingsMetadata getReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata() {
    return receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata;
  }
  public void setReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata(SettingsMetadata receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata) {
    this.receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata = receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supplementalDocumentsMustAccept")
  public String getSupplementalDocumentsMustAccept() {
    return supplementalDocumentsMustAccept;
  }
  public void setSupplementalDocumentsMustAccept(String supplementalDocumentsMustAccept) {
    this.supplementalDocumentsMustAccept = supplementalDocumentsMustAccept;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supplementalDocumentsMustAcceptMetadata")
  public SettingsMetadata getSupplementalDocumentsMustAcceptMetadata() {
    return supplementalDocumentsMustAcceptMetadata;
  }
  public void setSupplementalDocumentsMustAcceptMetadata(SettingsMetadata supplementalDocumentsMustAcceptMetadata) {
    this.supplementalDocumentsMustAcceptMetadata = supplementalDocumentsMustAcceptMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supplementalDocumentsMustRead")
  public String getSupplementalDocumentsMustRead() {
    return supplementalDocumentsMustRead;
  }
  public void setSupplementalDocumentsMustRead(String supplementalDocumentsMustRead) {
    this.supplementalDocumentsMustRead = supplementalDocumentsMustRead;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supplementalDocumentsMustReadMetadata")
  public SettingsMetadata getSupplementalDocumentsMustReadMetadata() {
    return supplementalDocumentsMustReadMetadata;
  }
  public void setSupplementalDocumentsMustReadMetadata(SettingsMetadata supplementalDocumentsMustReadMetadata) {
    this.supplementalDocumentsMustReadMetadata = supplementalDocumentsMustReadMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supplementalDocumentsMustView")
  public String getSupplementalDocumentsMustView() {
    return supplementalDocumentsMustView;
  }
  public void setSupplementalDocumentsMustView(String supplementalDocumentsMustView) {
    this.supplementalDocumentsMustView = supplementalDocumentsMustView;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supplementalDocumentsMustViewMetadata")
  public SettingsMetadata getSupplementalDocumentsMustViewMetadata() {
    return supplementalDocumentsMustViewMetadata;
  }
  public void setSupplementalDocumentsMustViewMetadata(SettingsMetadata supplementalDocumentsMustViewMetadata) {
    this.supplementalDocumentsMustViewMetadata = supplementalDocumentsMustViewMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("useNewDocuSignExperienceInterface")
  public String getUseNewDocuSignExperienceInterface() {
    return useNewDocuSignExperienceInterface;
  }
  public void setUseNewDocuSignExperienceInterface(String useNewDocuSignExperienceInterface) {
    this.useNewDocuSignExperienceInterface = useNewDocuSignExperienceInterface;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("useNewDocuSignExperienceInterfaceMetadata")
  public SettingsMetadata getUseNewDocuSignExperienceInterfaceMetadata() {
    return useNewDocuSignExperienceInterfaceMetadata;
  }
  public void setUseNewDocuSignExperienceInterfaceMetadata(SettingsMetadata useNewDocuSignExperienceInterfaceMetadata) {
    this.useNewDocuSignExperienceInterfaceMetadata = useNewDocuSignExperienceInterfaceMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("useNewSendingInterface")
  public String getUseNewSendingInterface() {
    return useNewSendingInterface;
  }
  public void setUseNewSendingInterface(String useNewSendingInterface) {
    this.useNewSendingInterface = useNewSendingInterface;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("useNewSendingInterfaceMetadata")
  public SettingsMetadata getUseNewSendingInterfaceMetadata() {
    return useNewSendingInterfaceMetadata;
  }
  public void setUseNewSendingInterfaceMetadata(SettingsMetadata useNewSendingInterfaceMetadata) {
    this.useNewSendingInterfaceMetadata = useNewSendingInterfaceMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vaultingMode")
  public String getVaultingMode() {
    return vaultingMode;
  }
  public void setVaultingMode(String vaultingMode) {
    this.vaultingMode = vaultingMode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vaultingModeMetadata")
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

    return true && Objects.equals(allowAccountManagement, accountRoleSettings.allowAccountManagement) &&
        Objects.equals(allowAccountManagementMetadata, accountRoleSettings.allowAccountManagementMetadata) &&
        Objects.equals(allowApiAccess, accountRoleSettings.allowApiAccess) &&
        Objects.equals(allowApiAccessMetadata, accountRoleSettings.allowApiAccessMetadata) &&
        Objects.equals(allowApiAccessToAccount, accountRoleSettings.allowApiAccessToAccount) &&
        Objects.equals(allowApiAccessToAccountMetadata, accountRoleSettings.allowApiAccessToAccountMetadata) &&
        Objects.equals(allowApiSendingOnBehalfOfOthers, accountRoleSettings.allowApiSendingOnBehalfOfOthers) &&
        Objects.equals(allowApiSendingOnBehalfOfOthersMetadata, accountRoleSettings.allowApiSendingOnBehalfOfOthersMetadata) &&
        Objects.equals(allowApiSequentialSigning, accountRoleSettings.allowApiSequentialSigning) &&
        Objects.equals(allowApiSequentialSigningMetadata, accountRoleSettings.allowApiSequentialSigningMetadata) &&
        Objects.equals(allowBulkSending, accountRoleSettings.allowBulkSending) &&
        Objects.equals(allowBulkSendingMetadata, accountRoleSettings.allowBulkSendingMetadata) &&
        Objects.equals(allowDocuSignDesktopClient, accountRoleSettings.allowDocuSignDesktopClient) &&
        Objects.equals(allowDocuSignDesktopClientMetadata, accountRoleSettings.allowDocuSignDesktopClientMetadata) &&
        Objects.equals(allowedAddressBookAccess, accountRoleSettings.allowedAddressBookAccess) &&
        Objects.equals(allowedAddressBookAccessMetadata, accountRoleSettings.allowedAddressBookAccessMetadata) &&
        Objects.equals(allowedTemplateAccess, accountRoleSettings.allowedTemplateAccess) &&
        Objects.equals(allowedTemplateAccessMetadata, accountRoleSettings.allowedTemplateAccessMetadata) &&
        Objects.equals(allowedToBeEnvelopeTransferRecipient, accountRoleSettings.allowedToBeEnvelopeTransferRecipient) &&
        Objects.equals(allowedToBeEnvelopeTransferRecipientMetadata, accountRoleSettings.allowedToBeEnvelopeTransferRecipientMetadata) &&
        Objects.equals(allowEnvelopeSending, accountRoleSettings.allowEnvelopeSending) &&
        Objects.equals(allowEnvelopeSendingMetadata, accountRoleSettings.allowEnvelopeSendingMetadata) &&
        Objects.equals(allowSendersToSetRecipientEmailLanguage, accountRoleSettings.allowSendersToSetRecipientEmailLanguage) &&
        Objects.equals(allowSendersToSetRecipientEmailLanguageMetadata, accountRoleSettings.allowSendersToSetRecipientEmailLanguageMetadata) &&
        Objects.equals(allowSignerAttachments, accountRoleSettings.allowSignerAttachments) &&
        Objects.equals(allowSignerAttachmentsMetadata, accountRoleSettings.allowSignerAttachmentsMetadata) &&
        Objects.equals(allowSupplementalDocuments, accountRoleSettings.allowSupplementalDocuments) &&
        Objects.equals(allowSupplementalDocumentsMetadata, accountRoleSettings.allowSupplementalDocumentsMetadata) &&
        Objects.equals(allowTaggingInSendAndCorrect, accountRoleSettings.allowTaggingInSendAndCorrect) &&
        Objects.equals(allowTaggingInSendAndCorrectMetadata, accountRoleSettings.allowTaggingInSendAndCorrectMetadata) &&
        Objects.equals(allowVaulting, accountRoleSettings.allowVaulting) &&
        Objects.equals(allowVaultingMetadata, accountRoleSettings.allowVaultingMetadata) &&
        Objects.equals(allowWetSigningOverride, accountRoleSettings.allowWetSigningOverride) &&
        Objects.equals(allowWetSigningOverrideMetadata, accountRoleSettings.allowWetSigningOverrideMetadata) &&
        Objects.equals(canCreateWorkspaces, accountRoleSettings.canCreateWorkspaces) &&
        Objects.equals(canCreateWorkspacesMetadata, accountRoleSettings.canCreateWorkspacesMetadata) &&
        Objects.equals(disableDocumentUpload, accountRoleSettings.disableDocumentUpload) &&
        Objects.equals(disableDocumentUploadMetadata, accountRoleSettings.disableDocumentUploadMetadata) &&
        Objects.equals(disableOtherActions, accountRoleSettings.disableOtherActions) &&
        Objects.equals(disableOtherActionsMetadata, accountRoleSettings.disableOtherActionsMetadata) &&
        Objects.equals(enableApiRequestLogging, accountRoleSettings.enableApiRequestLogging) &&
        Objects.equals(enableApiRequestLoggingMetadata, accountRoleSettings.enableApiRequestLoggingMetadata) &&
        Objects.equals(enableRecipientViewingNotifications, accountRoleSettings.enableRecipientViewingNotifications) &&
        Objects.equals(enableRecipientViewingNotificationsMetadata, accountRoleSettings.enableRecipientViewingNotificationsMetadata) &&
        Objects.equals(enableSequentialSigningInterface, accountRoleSettings.enableSequentialSigningInterface) &&
        Objects.equals(enableSequentialSigningInterfaceMetadata, accountRoleSettings.enableSequentialSigningInterfaceMetadata) &&
        Objects.equals(enableTransactionPointIntegration, accountRoleSettings.enableTransactionPointIntegration) &&
        Objects.equals(enableTransactionPointIntegrationMetadata, accountRoleSettings.enableTransactionPointIntegrationMetadata) &&
        Objects.equals(powerFormRole, accountRoleSettings.powerFormRole) &&
        Objects.equals(powerFormRoleMetadata, accountRoleSettings.powerFormRoleMetadata) &&
        Objects.equals(receiveCompletedSelfSignedDocumentsAsEmailLinks, accountRoleSettings.receiveCompletedSelfSignedDocumentsAsEmailLinks) &&
        Objects.equals(receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata, accountRoleSettings.receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata) &&
        Objects.equals(supplementalDocumentsMustAccept, accountRoleSettings.supplementalDocumentsMustAccept) &&
        Objects.equals(supplementalDocumentsMustAcceptMetadata, accountRoleSettings.supplementalDocumentsMustAcceptMetadata) &&
        Objects.equals(supplementalDocumentsMustRead, accountRoleSettings.supplementalDocumentsMustRead) &&
        Objects.equals(supplementalDocumentsMustReadMetadata, accountRoleSettings.supplementalDocumentsMustReadMetadata) &&
        Objects.equals(supplementalDocumentsMustView, accountRoleSettings.supplementalDocumentsMustView) &&
        Objects.equals(supplementalDocumentsMustViewMetadata, accountRoleSettings.supplementalDocumentsMustViewMetadata) &&
        Objects.equals(useNewDocuSignExperienceInterface, accountRoleSettings.useNewDocuSignExperienceInterface) &&
        Objects.equals(useNewDocuSignExperienceInterfaceMetadata, accountRoleSettings.useNewDocuSignExperienceInterfaceMetadata) &&
        Objects.equals(useNewSendingInterface, accountRoleSettings.useNewSendingInterface) &&
        Objects.equals(useNewSendingInterfaceMetadata, accountRoleSettings.useNewSendingInterfaceMetadata) &&
        Objects.equals(vaultingMode, accountRoleSettings.vaultingMode) &&
        Objects.equals(vaultingModeMetadata, accountRoleSettings.vaultingModeMetadata)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAccountManagement, allowAccountManagementMetadata, allowApiAccess, allowApiAccessMetadata, allowApiAccessToAccount, allowApiAccessToAccountMetadata, allowApiSendingOnBehalfOfOthers, allowApiSendingOnBehalfOfOthersMetadata, allowApiSequentialSigning, allowApiSequentialSigningMetadata, allowBulkSending, allowBulkSendingMetadata, allowDocuSignDesktopClient, allowDocuSignDesktopClientMetadata, allowedAddressBookAccess, allowedAddressBookAccessMetadata, allowedTemplateAccess, allowedTemplateAccessMetadata, allowedToBeEnvelopeTransferRecipient, allowedToBeEnvelopeTransferRecipientMetadata, allowEnvelopeSending, allowEnvelopeSendingMetadata, allowSendersToSetRecipientEmailLanguage, allowSendersToSetRecipientEmailLanguageMetadata, allowSignerAttachments, allowSignerAttachmentsMetadata, allowSupplementalDocuments, allowSupplementalDocumentsMetadata, allowTaggingInSendAndCorrect, allowTaggingInSendAndCorrectMetadata, allowVaulting, allowVaultingMetadata, allowWetSigningOverride, allowWetSigningOverrideMetadata, canCreateWorkspaces, canCreateWorkspacesMetadata, disableDocumentUpload, disableDocumentUploadMetadata, disableOtherActions, disableOtherActionsMetadata, enableApiRequestLogging, enableApiRequestLoggingMetadata, enableRecipientViewingNotifications, enableRecipientViewingNotificationsMetadata, enableSequentialSigningInterface, enableSequentialSigningInterfaceMetadata, enableTransactionPointIntegration, enableTransactionPointIntegrationMetadata, powerFormRole, powerFormRoleMetadata, receiveCompletedSelfSignedDocumentsAsEmailLinks, receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata, supplementalDocumentsMustAccept, supplementalDocumentsMustAcceptMetadata, supplementalDocumentsMustRead, supplementalDocumentsMustReadMetadata, supplementalDocumentsMustView, supplementalDocumentsMustViewMetadata, useNewDocuSignExperienceInterface, useNewDocuSignExperienceInterfaceMetadata, useNewSendingInterface, useNewSendingInterfaceMetadata, vaultingMode, vaultingModeMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRoleSettings {\n");
    
    if (allowAccountManagement != null)
      sb.append("    allowAccountManagement: ").append(toIndentedString(allowAccountManagement)).append("\n");
    if (allowAccountManagementMetadata != null)
      sb.append("    allowAccountManagementMetadata: ").append(toIndentedString(allowAccountManagementMetadata)).append("\n");
    if (allowApiAccess != null)
      sb.append("    allowApiAccess: ").append(toIndentedString(allowApiAccess)).append("\n");
    if (allowApiAccessMetadata != null)
      sb.append("    allowApiAccessMetadata: ").append(toIndentedString(allowApiAccessMetadata)).append("\n");
    if (allowApiAccessToAccount != null)
      sb.append("    allowApiAccessToAccount: ").append(toIndentedString(allowApiAccessToAccount)).append("\n");
    if (allowApiAccessToAccountMetadata != null)
      sb.append("    allowApiAccessToAccountMetadata: ").append(toIndentedString(allowApiAccessToAccountMetadata)).append("\n");
    if (allowApiSendingOnBehalfOfOthers != null)
      sb.append("    allowApiSendingOnBehalfOfOthers: ").append(toIndentedString(allowApiSendingOnBehalfOfOthers)).append("\n");
    if (allowApiSendingOnBehalfOfOthersMetadata != null)
      sb.append("    allowApiSendingOnBehalfOfOthersMetadata: ").append(toIndentedString(allowApiSendingOnBehalfOfOthersMetadata)).append("\n");
    if (allowApiSequentialSigning != null)
      sb.append("    allowApiSequentialSigning: ").append(toIndentedString(allowApiSequentialSigning)).append("\n");
    if (allowApiSequentialSigningMetadata != null)
      sb.append("    allowApiSequentialSigningMetadata: ").append(toIndentedString(allowApiSequentialSigningMetadata)).append("\n");
    if (allowBulkSending != null)
      sb.append("    allowBulkSending: ").append(toIndentedString(allowBulkSending)).append("\n");
    if (allowBulkSendingMetadata != null)
      sb.append("    allowBulkSendingMetadata: ").append(toIndentedString(allowBulkSendingMetadata)).append("\n");
    if (allowDocuSignDesktopClient != null)
      sb.append("    allowDocuSignDesktopClient: ").append(toIndentedString(allowDocuSignDesktopClient)).append("\n");
    if (allowDocuSignDesktopClientMetadata != null)
      sb.append("    allowDocuSignDesktopClientMetadata: ").append(toIndentedString(allowDocuSignDesktopClientMetadata)).append("\n");
    if (allowedAddressBookAccess != null)
      sb.append("    allowedAddressBookAccess: ").append(toIndentedString(allowedAddressBookAccess)).append("\n");
    if (allowedAddressBookAccessMetadata != null)
      sb.append("    allowedAddressBookAccessMetadata: ").append(toIndentedString(allowedAddressBookAccessMetadata)).append("\n");
    if (allowedTemplateAccess != null)
      sb.append("    allowedTemplateAccess: ").append(toIndentedString(allowedTemplateAccess)).append("\n");
    if (allowedTemplateAccessMetadata != null)
      sb.append("    allowedTemplateAccessMetadata: ").append(toIndentedString(allowedTemplateAccessMetadata)).append("\n");
    if (allowedToBeEnvelopeTransferRecipient != null)
      sb.append("    allowedToBeEnvelopeTransferRecipient: ").append(toIndentedString(allowedToBeEnvelopeTransferRecipient)).append("\n");
    if (allowedToBeEnvelopeTransferRecipientMetadata != null)
      sb.append("    allowedToBeEnvelopeTransferRecipientMetadata: ").append(toIndentedString(allowedToBeEnvelopeTransferRecipientMetadata)).append("\n");
    if (allowEnvelopeSending != null)
      sb.append("    allowEnvelopeSending: ").append(toIndentedString(allowEnvelopeSending)).append("\n");
    if (allowEnvelopeSendingMetadata != null)
      sb.append("    allowEnvelopeSendingMetadata: ").append(toIndentedString(allowEnvelopeSendingMetadata)).append("\n");
    if (allowSendersToSetRecipientEmailLanguage != null)
      sb.append("    allowSendersToSetRecipientEmailLanguage: ").append(toIndentedString(allowSendersToSetRecipientEmailLanguage)).append("\n");
    if (allowSendersToSetRecipientEmailLanguageMetadata != null)
      sb.append("    allowSendersToSetRecipientEmailLanguageMetadata: ").append(toIndentedString(allowSendersToSetRecipientEmailLanguageMetadata)).append("\n");
    if (allowSignerAttachments != null)
      sb.append("    allowSignerAttachments: ").append(toIndentedString(allowSignerAttachments)).append("\n");
    if (allowSignerAttachmentsMetadata != null)
      sb.append("    allowSignerAttachmentsMetadata: ").append(toIndentedString(allowSignerAttachmentsMetadata)).append("\n");
    if (allowSupplementalDocuments != null)
      sb.append("    allowSupplementalDocuments: ").append(toIndentedString(allowSupplementalDocuments)).append("\n");
    if (allowSupplementalDocumentsMetadata != null)
      sb.append("    allowSupplementalDocumentsMetadata: ").append(toIndentedString(allowSupplementalDocumentsMetadata)).append("\n");
    if (allowTaggingInSendAndCorrect != null)
      sb.append("    allowTaggingInSendAndCorrect: ").append(toIndentedString(allowTaggingInSendAndCorrect)).append("\n");
    if (allowTaggingInSendAndCorrectMetadata != null)
      sb.append("    allowTaggingInSendAndCorrectMetadata: ").append(toIndentedString(allowTaggingInSendAndCorrectMetadata)).append("\n");
    if (allowVaulting != null)
      sb.append("    allowVaulting: ").append(toIndentedString(allowVaulting)).append("\n");
    if (allowVaultingMetadata != null)
      sb.append("    allowVaultingMetadata: ").append(toIndentedString(allowVaultingMetadata)).append("\n");
    if (allowWetSigningOverride != null)
      sb.append("    allowWetSigningOverride: ").append(toIndentedString(allowWetSigningOverride)).append("\n");
    if (allowWetSigningOverrideMetadata != null)
      sb.append("    allowWetSigningOverrideMetadata: ").append(toIndentedString(allowWetSigningOverrideMetadata)).append("\n");
    if (canCreateWorkspaces != null)
      sb.append("    canCreateWorkspaces: ").append(toIndentedString(canCreateWorkspaces)).append("\n");
    if (canCreateWorkspacesMetadata != null)
      sb.append("    canCreateWorkspacesMetadata: ").append(toIndentedString(canCreateWorkspacesMetadata)).append("\n");
    if (disableDocumentUpload != null)
      sb.append("    disableDocumentUpload: ").append(toIndentedString(disableDocumentUpload)).append("\n");
    if (disableDocumentUploadMetadata != null)
      sb.append("    disableDocumentUploadMetadata: ").append(toIndentedString(disableDocumentUploadMetadata)).append("\n");
    if (disableOtherActions != null)
      sb.append("    disableOtherActions: ").append(toIndentedString(disableOtherActions)).append("\n");
    if (disableOtherActionsMetadata != null)
      sb.append("    disableOtherActionsMetadata: ").append(toIndentedString(disableOtherActionsMetadata)).append("\n");
    if (enableApiRequestLogging != null)
      sb.append("    enableApiRequestLogging: ").append(toIndentedString(enableApiRequestLogging)).append("\n");
    if (enableApiRequestLoggingMetadata != null)
      sb.append("    enableApiRequestLoggingMetadata: ").append(toIndentedString(enableApiRequestLoggingMetadata)).append("\n");
    if (enableRecipientViewingNotifications != null)
      sb.append("    enableRecipientViewingNotifications: ").append(toIndentedString(enableRecipientViewingNotifications)).append("\n");
    if (enableRecipientViewingNotificationsMetadata != null)
      sb.append("    enableRecipientViewingNotificationsMetadata: ").append(toIndentedString(enableRecipientViewingNotificationsMetadata)).append("\n");
    if (enableSequentialSigningInterface != null)
      sb.append("    enableSequentialSigningInterface: ").append(toIndentedString(enableSequentialSigningInterface)).append("\n");
    if (enableSequentialSigningInterfaceMetadata != null)
      sb.append("    enableSequentialSigningInterfaceMetadata: ").append(toIndentedString(enableSequentialSigningInterfaceMetadata)).append("\n");
    if (enableTransactionPointIntegration != null)
      sb.append("    enableTransactionPointIntegration: ").append(toIndentedString(enableTransactionPointIntegration)).append("\n");
    if (enableTransactionPointIntegrationMetadata != null)
      sb.append("    enableTransactionPointIntegrationMetadata: ").append(toIndentedString(enableTransactionPointIntegrationMetadata)).append("\n");
    if (powerFormRole != null)
      sb.append("    powerFormRole: ").append(toIndentedString(powerFormRole)).append("\n");
    if (powerFormRoleMetadata != null)
      sb.append("    powerFormRoleMetadata: ").append(toIndentedString(powerFormRoleMetadata)).append("\n");
    if (receiveCompletedSelfSignedDocumentsAsEmailLinks != null)
      sb.append("    receiveCompletedSelfSignedDocumentsAsEmailLinks: ").append(toIndentedString(receiveCompletedSelfSignedDocumentsAsEmailLinks)).append("\n");
    if (receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata != null)
      sb.append("    receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata: ").append(toIndentedString(receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata)).append("\n");
    if (supplementalDocumentsMustAccept != null)
      sb.append("    supplementalDocumentsMustAccept: ").append(toIndentedString(supplementalDocumentsMustAccept)).append("\n");
    if (supplementalDocumentsMustAcceptMetadata != null)
      sb.append("    supplementalDocumentsMustAcceptMetadata: ").append(toIndentedString(supplementalDocumentsMustAcceptMetadata)).append("\n");
    if (supplementalDocumentsMustRead != null)
      sb.append("    supplementalDocumentsMustRead: ").append(toIndentedString(supplementalDocumentsMustRead)).append("\n");
    if (supplementalDocumentsMustReadMetadata != null)
      sb.append("    supplementalDocumentsMustReadMetadata: ").append(toIndentedString(supplementalDocumentsMustReadMetadata)).append("\n");
    if (supplementalDocumentsMustView != null)
      sb.append("    supplementalDocumentsMustView: ").append(toIndentedString(supplementalDocumentsMustView)).append("\n");
    if (supplementalDocumentsMustViewMetadata != null)
      sb.append("    supplementalDocumentsMustViewMetadata: ").append(toIndentedString(supplementalDocumentsMustViewMetadata)).append("\n");
    if (useNewDocuSignExperienceInterface != null)
      sb.append("    useNewDocuSignExperienceInterface: ").append(toIndentedString(useNewDocuSignExperienceInterface)).append("\n");
    if (useNewDocuSignExperienceInterfaceMetadata != null)
      sb.append("    useNewDocuSignExperienceInterfaceMetadata: ").append(toIndentedString(useNewDocuSignExperienceInterfaceMetadata)).append("\n");
    if (useNewSendingInterface != null)
      sb.append("    useNewSendingInterface: ").append(toIndentedString(useNewSendingInterface)).append("\n");
    if (useNewSendingInterfaceMetadata != null)
      sb.append("    useNewSendingInterfaceMetadata: ").append(toIndentedString(useNewSendingInterfaceMetadata)).append("\n");
    if (vaultingMode != null)
      sb.append("    vaultingMode: ").append(toIndentedString(vaultingMode)).append("\n");
    if (vaultingModeMetadata != null)
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

