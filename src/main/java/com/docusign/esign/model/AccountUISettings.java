package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AdminMessage;
import com.docusign.esign.model.AskAnAdmin;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * An object that defines the options that are available to non-administrators in the UI..
 *
 */
@Schema(description = "An object that defines the options that are available to non-administrators in the UI.")

public class AccountUISettings implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("adminMessage")
  private AdminMessage adminMessage = null;

  @JsonProperty("allowUsersToEditSharedAccess")
  private String allowUsersToEditSharedAccess = null;

  @JsonProperty("allowUsersToEditSharedAccessMetadata")
  private SettingsMetadata allowUsersToEditSharedAccessMetadata = null;

  @JsonProperty("askAnAdmin")
  private AskAnAdmin askAnAdmin = null;

  @JsonProperty("clickwrapSchemaVersion")
  private String clickwrapSchemaVersion = null;

  @JsonProperty("clickwrapSchemaVersionMetadata")
  private SettingsMetadata clickwrapSchemaVersionMetadata = null;

  @JsonProperty("disableWebAppAccess")
  private String disableWebAppAccess = null;

  @JsonProperty("disableWebAppAccessMetadata")
  private SettingsMetadata disableWebAppAccessMetadata = null;

  @JsonProperty("enableAdminMessage")
  private String enableAdminMessage = null;

  @JsonProperty("enableAdminMessageMetadata")
  private SettingsMetadata enableAdminMessageMetadata = null;

  @JsonProperty("enableEasySignCanUseMultiTemplateApply")
  private String enableEasySignCanUseMultiTemplateApply = null;

  @JsonProperty("enableEasySignCanUseMultiTemplateApplyMetadata")
  private SettingsMetadata enableEasySignCanUseMultiTemplateApplyMetadata = null;

  @JsonProperty("enableEasySignTemplateUpload")
  private String enableEasySignTemplateUpload = null;

  @JsonProperty("enableEasySignTemplateUploadMetadata")
  private SettingsMetadata enableEasySignTemplateUploadMetadata = null;

  @JsonProperty("enableEnvelopeCopyWithData")
  private String enableEnvelopeCopyWithData = null;

  @JsonProperty("enableEnvelopeCopyWithDataMetadata")
  private SettingsMetadata enableEnvelopeCopyWithDataMetadata = null;

  @JsonProperty("enableEnvelopeTypes")
  private String enableEnvelopeTypes = null;

  @JsonProperty("enableEnvelopeTypesMetadata")
  private SettingsMetadata enableEnvelopeTypesMetadata = null;

  @JsonProperty("enableLegacySendflowLink")
  private String enableLegacySendflowLink = null;

  @JsonProperty("enableLegacySendflowLinkMetadata")
  private SettingsMetadata enableLegacySendflowLinkMetadata = null;

  @JsonProperty("hasExternalLinkedAccounts")
  private String hasExternalLinkedAccounts = null;

  @JsonProperty("hasExternalLinkedAccountsMetadata")
  private SettingsMetadata hasExternalLinkedAccountsMetadata = null;

  @JsonProperty("hideSendAnEnvelope")
  private String hideSendAnEnvelope = null;

  @JsonProperty("hideSendAnEnvelopeMetadata")
  private SettingsMetadata hideSendAnEnvelopeMetadata = null;

  @JsonProperty("hideUseATemplate")
  private String hideUseATemplate = null;

  @JsonProperty("hideUseATemplateInPrepare")
  private String hideUseATemplateInPrepare = null;

  @JsonProperty("hideUseATemplateInPrepareMetadata")
  private SettingsMetadata hideUseATemplateInPrepareMetadata = null;

  @JsonProperty("hideUseATemplateMetadata")
  private SettingsMetadata hideUseATemplateMetadata = null;

  @JsonProperty("orderBasedRecipientIdGeneration")
  private String orderBasedRecipientIdGeneration = null;

  @JsonProperty("orderBasedRecipientIdGenerationMetadata")
  private SettingsMetadata orderBasedRecipientIdGenerationMetadata = null;

  @JsonProperty("removeEnvelopeForwarding")
  private String removeEnvelopeForwarding = null;

  @JsonProperty("removeEnvelopeForwardingMetadata")
  private SettingsMetadata removeEnvelopeForwardingMetadata = null;

  @JsonProperty("shouldRedactAccessCode")
  private String shouldRedactAccessCode = null;

  @JsonProperty("shouldRedactAccessCodeMetadata")
  private SettingsMetadata shouldRedactAccessCodeMetadata = null;

  @JsonProperty("uploadNewImageToSignOrInitial")
  private String uploadNewImageToSignOrInitial = null;

  @JsonProperty("uploadNewImageToSignOrInitialMetadata")
  private SettingsMetadata uploadNewImageToSignOrInitialMetadata = null;


  /**
   * adminMessage.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings adminMessage(AdminMessage adminMessage) {
    this.adminMessage = adminMessage;
    return this;
  }

  /**
   * .
   * @return adminMessage
   **/
  @Schema(description = "")
  public AdminMessage getAdminMessage() {
    return adminMessage;
  }

  /**
   * setAdminMessage.
   **/
  public void setAdminMessage(AdminMessage adminMessage) {
    this.adminMessage = adminMessage;
  }


  /**
   * allowUsersToEditSharedAccess.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings allowUsersToEditSharedAccess(String allowUsersToEditSharedAccess) {
    this.allowUsersToEditSharedAccess = allowUsersToEditSharedAccess;
    return this;
  }

  /**
   * .
   * @return allowUsersToEditSharedAccess
   **/
  @Schema(description = "")
  public String getAllowUsersToEditSharedAccess() {
    return allowUsersToEditSharedAccess;
  }

  /**
   * setAllowUsersToEditSharedAccess.
   **/
  public void setAllowUsersToEditSharedAccess(String allowUsersToEditSharedAccess) {
    this.allowUsersToEditSharedAccess = allowUsersToEditSharedAccess;
  }


  /**
   * allowUsersToEditSharedAccessMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings allowUsersToEditSharedAccessMetadata(SettingsMetadata allowUsersToEditSharedAccessMetadata) {
    this.allowUsersToEditSharedAccessMetadata = allowUsersToEditSharedAccessMetadata;
    return this;
  }

  /**
   * .
   * @return allowUsersToEditSharedAccessMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowUsersToEditSharedAccessMetadata() {
    return allowUsersToEditSharedAccessMetadata;
  }

  /**
   * setAllowUsersToEditSharedAccessMetadata.
   **/
  public void setAllowUsersToEditSharedAccessMetadata(SettingsMetadata allowUsersToEditSharedAccessMetadata) {
    this.allowUsersToEditSharedAccessMetadata = allowUsersToEditSharedAccessMetadata;
  }


  /**
   * askAnAdmin.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings askAnAdmin(AskAnAdmin askAnAdmin) {
    this.askAnAdmin = askAnAdmin;
    return this;
  }

  /**
   * .
   * @return askAnAdmin
   **/
  @Schema(description = "")
  public AskAnAdmin getAskAnAdmin() {
    return askAnAdmin;
  }

  /**
   * setAskAnAdmin.
   **/
  public void setAskAnAdmin(AskAnAdmin askAnAdmin) {
    this.askAnAdmin = askAnAdmin;
  }


  /**
   * clickwrapSchemaVersion.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings clickwrapSchemaVersion(String clickwrapSchemaVersion) {
    this.clickwrapSchemaVersion = clickwrapSchemaVersion;
    return this;
  }

  /**
   * .
   * @return clickwrapSchemaVersion
   **/
  @Schema(description = "")
  public String getClickwrapSchemaVersion() {
    return clickwrapSchemaVersion;
  }

  /**
   * setClickwrapSchemaVersion.
   **/
  public void setClickwrapSchemaVersion(String clickwrapSchemaVersion) {
    this.clickwrapSchemaVersion = clickwrapSchemaVersion;
  }


  /**
   * clickwrapSchemaVersionMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings clickwrapSchemaVersionMetadata(SettingsMetadata clickwrapSchemaVersionMetadata) {
    this.clickwrapSchemaVersionMetadata = clickwrapSchemaVersionMetadata;
    return this;
  }

  /**
   * .
   * @return clickwrapSchemaVersionMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getClickwrapSchemaVersionMetadata() {
    return clickwrapSchemaVersionMetadata;
  }

  /**
   * setClickwrapSchemaVersionMetadata.
   **/
  public void setClickwrapSchemaVersionMetadata(SettingsMetadata clickwrapSchemaVersionMetadata) {
    this.clickwrapSchemaVersionMetadata = clickwrapSchemaVersionMetadata;
  }


  /**
   * disableWebAppAccess.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings disableWebAppAccess(String disableWebAppAccess) {
    this.disableWebAppAccess = disableWebAppAccess;
    return this;
  }

  /**
   * .
   * @return disableWebAppAccess
   **/
  @Schema(description = "")
  public String getDisableWebAppAccess() {
    return disableWebAppAccess;
  }

  /**
   * setDisableWebAppAccess.
   **/
  public void setDisableWebAppAccess(String disableWebAppAccess) {
    this.disableWebAppAccess = disableWebAppAccess;
  }


  /**
   * disableWebAppAccessMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings disableWebAppAccessMetadata(SettingsMetadata disableWebAppAccessMetadata) {
    this.disableWebAppAccessMetadata = disableWebAppAccessMetadata;
    return this;
  }

  /**
   * .
   * @return disableWebAppAccessMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getDisableWebAppAccessMetadata() {
    return disableWebAppAccessMetadata;
  }

  /**
   * setDisableWebAppAccessMetadata.
   **/
  public void setDisableWebAppAccessMetadata(SettingsMetadata disableWebAppAccessMetadata) {
    this.disableWebAppAccessMetadata = disableWebAppAccessMetadata;
  }


  /**
   * enableAdminMessage.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableAdminMessage(String enableAdminMessage) {
    this.enableAdminMessage = enableAdminMessage;
    return this;
  }

  /**
   * .
   * @return enableAdminMessage
   **/
  @Schema(description = "")
  public String getEnableAdminMessage() {
    return enableAdminMessage;
  }

  /**
   * setEnableAdminMessage.
   **/
  public void setEnableAdminMessage(String enableAdminMessage) {
    this.enableAdminMessage = enableAdminMessage;
  }


  /**
   * enableAdminMessageMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableAdminMessageMetadata(SettingsMetadata enableAdminMessageMetadata) {
    this.enableAdminMessageMetadata = enableAdminMessageMetadata;
    return this;
  }

  /**
   * .
   * @return enableAdminMessageMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getEnableAdminMessageMetadata() {
    return enableAdminMessageMetadata;
  }

  /**
   * setEnableAdminMessageMetadata.
   **/
  public void setEnableAdminMessageMetadata(SettingsMetadata enableAdminMessageMetadata) {
    this.enableAdminMessageMetadata = enableAdminMessageMetadata;
  }


  /**
   * enableEasySignCanUseMultiTemplateApply.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableEasySignCanUseMultiTemplateApply(String enableEasySignCanUseMultiTemplateApply) {
    this.enableEasySignCanUseMultiTemplateApply = enableEasySignCanUseMultiTemplateApply;
    return this;
  }

  /**
   * .
   * @return enableEasySignCanUseMultiTemplateApply
   **/
  @Schema(description = "")
  public String getEnableEasySignCanUseMultiTemplateApply() {
    return enableEasySignCanUseMultiTemplateApply;
  }

  /**
   * setEnableEasySignCanUseMultiTemplateApply.
   **/
  public void setEnableEasySignCanUseMultiTemplateApply(String enableEasySignCanUseMultiTemplateApply) {
    this.enableEasySignCanUseMultiTemplateApply = enableEasySignCanUseMultiTemplateApply;
  }


  /**
   * enableEasySignCanUseMultiTemplateApplyMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableEasySignCanUseMultiTemplateApplyMetadata(SettingsMetadata enableEasySignCanUseMultiTemplateApplyMetadata) {
    this.enableEasySignCanUseMultiTemplateApplyMetadata = enableEasySignCanUseMultiTemplateApplyMetadata;
    return this;
  }

  /**
   * .
   * @return enableEasySignCanUseMultiTemplateApplyMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getEnableEasySignCanUseMultiTemplateApplyMetadata() {
    return enableEasySignCanUseMultiTemplateApplyMetadata;
  }

  /**
   * setEnableEasySignCanUseMultiTemplateApplyMetadata.
   **/
  public void setEnableEasySignCanUseMultiTemplateApplyMetadata(SettingsMetadata enableEasySignCanUseMultiTemplateApplyMetadata) {
    this.enableEasySignCanUseMultiTemplateApplyMetadata = enableEasySignCanUseMultiTemplateApplyMetadata;
  }


  /**
   * enableEasySignTemplateUpload.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableEasySignTemplateUpload(String enableEasySignTemplateUpload) {
    this.enableEasySignTemplateUpload = enableEasySignTemplateUpload;
    return this;
  }

  /**
   * .
   * @return enableEasySignTemplateUpload
   **/
  @Schema(description = "")
  public String getEnableEasySignTemplateUpload() {
    return enableEasySignTemplateUpload;
  }

  /**
   * setEnableEasySignTemplateUpload.
   **/
  public void setEnableEasySignTemplateUpload(String enableEasySignTemplateUpload) {
    this.enableEasySignTemplateUpload = enableEasySignTemplateUpload;
  }


  /**
   * enableEasySignTemplateUploadMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableEasySignTemplateUploadMetadata(SettingsMetadata enableEasySignTemplateUploadMetadata) {
    this.enableEasySignTemplateUploadMetadata = enableEasySignTemplateUploadMetadata;
    return this;
  }

  /**
   * .
   * @return enableEasySignTemplateUploadMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getEnableEasySignTemplateUploadMetadata() {
    return enableEasySignTemplateUploadMetadata;
  }

  /**
   * setEnableEasySignTemplateUploadMetadata.
   **/
  public void setEnableEasySignTemplateUploadMetadata(SettingsMetadata enableEasySignTemplateUploadMetadata) {
    this.enableEasySignTemplateUploadMetadata = enableEasySignTemplateUploadMetadata;
  }


  /**
   * enableEnvelopeCopyWithData.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableEnvelopeCopyWithData(String enableEnvelopeCopyWithData) {
    this.enableEnvelopeCopyWithData = enableEnvelopeCopyWithData;
    return this;
  }

  /**
   * .
   * @return enableEnvelopeCopyWithData
   **/
  @Schema(description = "")
  public String getEnableEnvelopeCopyWithData() {
    return enableEnvelopeCopyWithData;
  }

  /**
   * setEnableEnvelopeCopyWithData.
   **/
  public void setEnableEnvelopeCopyWithData(String enableEnvelopeCopyWithData) {
    this.enableEnvelopeCopyWithData = enableEnvelopeCopyWithData;
  }


  /**
   * enableEnvelopeCopyWithDataMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableEnvelopeCopyWithDataMetadata(SettingsMetadata enableEnvelopeCopyWithDataMetadata) {
    this.enableEnvelopeCopyWithDataMetadata = enableEnvelopeCopyWithDataMetadata;
    return this;
  }

  /**
   * .
   * @return enableEnvelopeCopyWithDataMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getEnableEnvelopeCopyWithDataMetadata() {
    return enableEnvelopeCopyWithDataMetadata;
  }

  /**
   * setEnableEnvelopeCopyWithDataMetadata.
   **/
  public void setEnableEnvelopeCopyWithDataMetadata(SettingsMetadata enableEnvelopeCopyWithDataMetadata) {
    this.enableEnvelopeCopyWithDataMetadata = enableEnvelopeCopyWithDataMetadata;
  }


  /**
   * enableEnvelopeTypes.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableEnvelopeTypes(String enableEnvelopeTypes) {
    this.enableEnvelopeTypes = enableEnvelopeTypes;
    return this;
  }

  /**
   * .
   * @return enableEnvelopeTypes
   **/
  @Schema(description = "")
  public String getEnableEnvelopeTypes() {
    return enableEnvelopeTypes;
  }

  /**
   * setEnableEnvelopeTypes.
   **/
  public void setEnableEnvelopeTypes(String enableEnvelopeTypes) {
    this.enableEnvelopeTypes = enableEnvelopeTypes;
  }


  /**
   * enableEnvelopeTypesMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableEnvelopeTypesMetadata(SettingsMetadata enableEnvelopeTypesMetadata) {
    this.enableEnvelopeTypesMetadata = enableEnvelopeTypesMetadata;
    return this;
  }

  /**
   * .
   * @return enableEnvelopeTypesMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getEnableEnvelopeTypesMetadata() {
    return enableEnvelopeTypesMetadata;
  }

  /**
   * setEnableEnvelopeTypesMetadata.
   **/
  public void setEnableEnvelopeTypesMetadata(SettingsMetadata enableEnvelopeTypesMetadata) {
    this.enableEnvelopeTypesMetadata = enableEnvelopeTypesMetadata;
  }


  /**
   * enableLegacySendflowLink.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableLegacySendflowLink(String enableLegacySendflowLink) {
    this.enableLegacySendflowLink = enableLegacySendflowLink;
    return this;
  }

  /**
   * .
   * @return enableLegacySendflowLink
   **/
  @Schema(description = "")
  public String getEnableLegacySendflowLink() {
    return enableLegacySendflowLink;
  }

  /**
   * setEnableLegacySendflowLink.
   **/
  public void setEnableLegacySendflowLink(String enableLegacySendflowLink) {
    this.enableLegacySendflowLink = enableLegacySendflowLink;
  }


  /**
   * enableLegacySendflowLinkMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings enableLegacySendflowLinkMetadata(SettingsMetadata enableLegacySendflowLinkMetadata) {
    this.enableLegacySendflowLinkMetadata = enableLegacySendflowLinkMetadata;
    return this;
  }

  /**
   * .
   * @return enableLegacySendflowLinkMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getEnableLegacySendflowLinkMetadata() {
    return enableLegacySendflowLinkMetadata;
  }

  /**
   * setEnableLegacySendflowLinkMetadata.
   **/
  public void setEnableLegacySendflowLinkMetadata(SettingsMetadata enableLegacySendflowLinkMetadata) {
    this.enableLegacySendflowLinkMetadata = enableLegacySendflowLinkMetadata;
  }


  /**
   * hasExternalLinkedAccounts.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings hasExternalLinkedAccounts(String hasExternalLinkedAccounts) {
    this.hasExternalLinkedAccounts = hasExternalLinkedAccounts;
    return this;
  }

  /**
   * .
   * @return hasExternalLinkedAccounts
   **/
  @Schema(description = "")
  public String getHasExternalLinkedAccounts() {
    return hasExternalLinkedAccounts;
  }

  /**
   * setHasExternalLinkedAccounts.
   **/
  public void setHasExternalLinkedAccounts(String hasExternalLinkedAccounts) {
    this.hasExternalLinkedAccounts = hasExternalLinkedAccounts;
  }


  /**
   * hasExternalLinkedAccountsMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings hasExternalLinkedAccountsMetadata(SettingsMetadata hasExternalLinkedAccountsMetadata) {
    this.hasExternalLinkedAccountsMetadata = hasExternalLinkedAccountsMetadata;
    return this;
  }

  /**
   * .
   * @return hasExternalLinkedAccountsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getHasExternalLinkedAccountsMetadata() {
    return hasExternalLinkedAccountsMetadata;
  }

  /**
   * setHasExternalLinkedAccountsMetadata.
   **/
  public void setHasExternalLinkedAccountsMetadata(SettingsMetadata hasExternalLinkedAccountsMetadata) {
    this.hasExternalLinkedAccountsMetadata = hasExternalLinkedAccountsMetadata;
  }


  /**
   * hideSendAnEnvelope.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings hideSendAnEnvelope(String hideSendAnEnvelope) {
    this.hideSendAnEnvelope = hideSendAnEnvelope;
    return this;
  }

  /**
   * .
   * @return hideSendAnEnvelope
   **/
  @Schema(description = "")
  public String getHideSendAnEnvelope() {
    return hideSendAnEnvelope;
  }

  /**
   * setHideSendAnEnvelope.
   **/
  public void setHideSendAnEnvelope(String hideSendAnEnvelope) {
    this.hideSendAnEnvelope = hideSendAnEnvelope;
  }


  /**
   * hideSendAnEnvelopeMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings hideSendAnEnvelopeMetadata(SettingsMetadata hideSendAnEnvelopeMetadata) {
    this.hideSendAnEnvelopeMetadata = hideSendAnEnvelopeMetadata;
    return this;
  }

  /**
   * .
   * @return hideSendAnEnvelopeMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getHideSendAnEnvelopeMetadata() {
    return hideSendAnEnvelopeMetadata;
  }

  /**
   * setHideSendAnEnvelopeMetadata.
   **/
  public void setHideSendAnEnvelopeMetadata(SettingsMetadata hideSendAnEnvelopeMetadata) {
    this.hideSendAnEnvelopeMetadata = hideSendAnEnvelopeMetadata;
  }


  /**
   * hideUseATemplate.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings hideUseATemplate(String hideUseATemplate) {
    this.hideUseATemplate = hideUseATemplate;
    return this;
  }

  /**
   * .
   * @return hideUseATemplate
   **/
  @Schema(description = "")
  public String getHideUseATemplate() {
    return hideUseATemplate;
  }

  /**
   * setHideUseATemplate.
   **/
  public void setHideUseATemplate(String hideUseATemplate) {
    this.hideUseATemplate = hideUseATemplate;
  }


  /**
   * hideUseATemplateInPrepare.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings hideUseATemplateInPrepare(String hideUseATemplateInPrepare) {
    this.hideUseATemplateInPrepare = hideUseATemplateInPrepare;
    return this;
  }

  /**
   * .
   * @return hideUseATemplateInPrepare
   **/
  @Schema(description = "")
  public String getHideUseATemplateInPrepare() {
    return hideUseATemplateInPrepare;
  }

  /**
   * setHideUseATemplateInPrepare.
   **/
  public void setHideUseATemplateInPrepare(String hideUseATemplateInPrepare) {
    this.hideUseATemplateInPrepare = hideUseATemplateInPrepare;
  }


  /**
   * hideUseATemplateInPrepareMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings hideUseATemplateInPrepareMetadata(SettingsMetadata hideUseATemplateInPrepareMetadata) {
    this.hideUseATemplateInPrepareMetadata = hideUseATemplateInPrepareMetadata;
    return this;
  }

  /**
   * .
   * @return hideUseATemplateInPrepareMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getHideUseATemplateInPrepareMetadata() {
    return hideUseATemplateInPrepareMetadata;
  }

  /**
   * setHideUseATemplateInPrepareMetadata.
   **/
  public void setHideUseATemplateInPrepareMetadata(SettingsMetadata hideUseATemplateInPrepareMetadata) {
    this.hideUseATemplateInPrepareMetadata = hideUseATemplateInPrepareMetadata;
  }


  /**
   * hideUseATemplateMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings hideUseATemplateMetadata(SettingsMetadata hideUseATemplateMetadata) {
    this.hideUseATemplateMetadata = hideUseATemplateMetadata;
    return this;
  }

  /**
   * .
   * @return hideUseATemplateMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getHideUseATemplateMetadata() {
    return hideUseATemplateMetadata;
  }

  /**
   * setHideUseATemplateMetadata.
   **/
  public void setHideUseATemplateMetadata(SettingsMetadata hideUseATemplateMetadata) {
    this.hideUseATemplateMetadata = hideUseATemplateMetadata;
  }


  /**
   * orderBasedRecipientIdGeneration.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings orderBasedRecipientIdGeneration(String orderBasedRecipientIdGeneration) {
    this.orderBasedRecipientIdGeneration = orderBasedRecipientIdGeneration;
    return this;
  }

  /**
   * .
   * @return orderBasedRecipientIdGeneration
   **/
  @Schema(description = "")
  public String getOrderBasedRecipientIdGeneration() {
    return orderBasedRecipientIdGeneration;
  }

  /**
   * setOrderBasedRecipientIdGeneration.
   **/
  public void setOrderBasedRecipientIdGeneration(String orderBasedRecipientIdGeneration) {
    this.orderBasedRecipientIdGeneration = orderBasedRecipientIdGeneration;
  }


  /**
   * orderBasedRecipientIdGenerationMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings orderBasedRecipientIdGenerationMetadata(SettingsMetadata orderBasedRecipientIdGenerationMetadata) {
    this.orderBasedRecipientIdGenerationMetadata = orderBasedRecipientIdGenerationMetadata;
    return this;
  }

  /**
   * .
   * @return orderBasedRecipientIdGenerationMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getOrderBasedRecipientIdGenerationMetadata() {
    return orderBasedRecipientIdGenerationMetadata;
  }

  /**
   * setOrderBasedRecipientIdGenerationMetadata.
   **/
  public void setOrderBasedRecipientIdGenerationMetadata(SettingsMetadata orderBasedRecipientIdGenerationMetadata) {
    this.orderBasedRecipientIdGenerationMetadata = orderBasedRecipientIdGenerationMetadata;
  }


  /**
   * removeEnvelopeForwarding.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings removeEnvelopeForwarding(String removeEnvelopeForwarding) {
    this.removeEnvelopeForwarding = removeEnvelopeForwarding;
    return this;
  }

  /**
   * .
   * @return removeEnvelopeForwarding
   **/
  @Schema(description = "")
  public String getRemoveEnvelopeForwarding() {
    return removeEnvelopeForwarding;
  }

  /**
   * setRemoveEnvelopeForwarding.
   **/
  public void setRemoveEnvelopeForwarding(String removeEnvelopeForwarding) {
    this.removeEnvelopeForwarding = removeEnvelopeForwarding;
  }


  /**
   * removeEnvelopeForwardingMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings removeEnvelopeForwardingMetadata(SettingsMetadata removeEnvelopeForwardingMetadata) {
    this.removeEnvelopeForwardingMetadata = removeEnvelopeForwardingMetadata;
    return this;
  }

  /**
   * .
   * @return removeEnvelopeForwardingMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getRemoveEnvelopeForwardingMetadata() {
    return removeEnvelopeForwardingMetadata;
  }

  /**
   * setRemoveEnvelopeForwardingMetadata.
   **/
  public void setRemoveEnvelopeForwardingMetadata(SettingsMetadata removeEnvelopeForwardingMetadata) {
    this.removeEnvelopeForwardingMetadata = removeEnvelopeForwardingMetadata;
  }


  /**
   * shouldRedactAccessCode.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings shouldRedactAccessCode(String shouldRedactAccessCode) {
    this.shouldRedactAccessCode = shouldRedactAccessCode;
    return this;
  }

  /**
   * .
   * @return shouldRedactAccessCode
   **/
  @Schema(description = "")
  public String getShouldRedactAccessCode() {
    return shouldRedactAccessCode;
  }

  /**
   * setShouldRedactAccessCode.
   **/
  public void setShouldRedactAccessCode(String shouldRedactAccessCode) {
    this.shouldRedactAccessCode = shouldRedactAccessCode;
  }


  /**
   * shouldRedactAccessCodeMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings shouldRedactAccessCodeMetadata(SettingsMetadata shouldRedactAccessCodeMetadata) {
    this.shouldRedactAccessCodeMetadata = shouldRedactAccessCodeMetadata;
    return this;
  }

  /**
   * .
   * @return shouldRedactAccessCodeMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getShouldRedactAccessCodeMetadata() {
    return shouldRedactAccessCodeMetadata;
  }

  /**
   * setShouldRedactAccessCodeMetadata.
   **/
  public void setShouldRedactAccessCodeMetadata(SettingsMetadata shouldRedactAccessCodeMetadata) {
    this.shouldRedactAccessCodeMetadata = shouldRedactAccessCodeMetadata;
  }


  /**
   * uploadNewImageToSignOrInitial.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings uploadNewImageToSignOrInitial(String uploadNewImageToSignOrInitial) {
    this.uploadNewImageToSignOrInitial = uploadNewImageToSignOrInitial;
    return this;
  }

  /**
   * .
   * @return uploadNewImageToSignOrInitial
   **/
  @Schema(description = "")
  public String getUploadNewImageToSignOrInitial() {
    return uploadNewImageToSignOrInitial;
  }

  /**
   * setUploadNewImageToSignOrInitial.
   **/
  public void setUploadNewImageToSignOrInitial(String uploadNewImageToSignOrInitial) {
    this.uploadNewImageToSignOrInitial = uploadNewImageToSignOrInitial;
  }


  /**
   * uploadNewImageToSignOrInitialMetadata.
   *
   * @return AccountUISettings
   **/
  public AccountUISettings uploadNewImageToSignOrInitialMetadata(SettingsMetadata uploadNewImageToSignOrInitialMetadata) {
    this.uploadNewImageToSignOrInitialMetadata = uploadNewImageToSignOrInitialMetadata;
    return this;
  }

  /**
   * .
   * @return uploadNewImageToSignOrInitialMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getUploadNewImageToSignOrInitialMetadata() {
    return uploadNewImageToSignOrInitialMetadata;
  }

  /**
   * setUploadNewImageToSignOrInitialMetadata.
   **/
  public void setUploadNewImageToSignOrInitialMetadata(SettingsMetadata uploadNewImageToSignOrInitialMetadata) {
    this.uploadNewImageToSignOrInitialMetadata = uploadNewImageToSignOrInitialMetadata;
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
    AccountUISettings accountUISettings = (AccountUISettings) o;
    return Objects.equals(this.adminMessage, accountUISettings.adminMessage) &&
        Objects.equals(this.allowUsersToEditSharedAccess, accountUISettings.allowUsersToEditSharedAccess) &&
        Objects.equals(this.allowUsersToEditSharedAccessMetadata, accountUISettings.allowUsersToEditSharedAccessMetadata) &&
        Objects.equals(this.askAnAdmin, accountUISettings.askAnAdmin) &&
        Objects.equals(this.clickwrapSchemaVersion, accountUISettings.clickwrapSchemaVersion) &&
        Objects.equals(this.clickwrapSchemaVersionMetadata, accountUISettings.clickwrapSchemaVersionMetadata) &&
        Objects.equals(this.disableWebAppAccess, accountUISettings.disableWebAppAccess) &&
        Objects.equals(this.disableWebAppAccessMetadata, accountUISettings.disableWebAppAccessMetadata) &&
        Objects.equals(this.enableAdminMessage, accountUISettings.enableAdminMessage) &&
        Objects.equals(this.enableAdminMessageMetadata, accountUISettings.enableAdminMessageMetadata) &&
        Objects.equals(this.enableEasySignCanUseMultiTemplateApply, accountUISettings.enableEasySignCanUseMultiTemplateApply) &&
        Objects.equals(this.enableEasySignCanUseMultiTemplateApplyMetadata, accountUISettings.enableEasySignCanUseMultiTemplateApplyMetadata) &&
        Objects.equals(this.enableEasySignTemplateUpload, accountUISettings.enableEasySignTemplateUpload) &&
        Objects.equals(this.enableEasySignTemplateUploadMetadata, accountUISettings.enableEasySignTemplateUploadMetadata) &&
        Objects.equals(this.enableEnvelopeCopyWithData, accountUISettings.enableEnvelopeCopyWithData) &&
        Objects.equals(this.enableEnvelopeCopyWithDataMetadata, accountUISettings.enableEnvelopeCopyWithDataMetadata) &&
        Objects.equals(this.enableEnvelopeTypes, accountUISettings.enableEnvelopeTypes) &&
        Objects.equals(this.enableEnvelopeTypesMetadata, accountUISettings.enableEnvelopeTypesMetadata) &&
        Objects.equals(this.enableLegacySendflowLink, accountUISettings.enableLegacySendflowLink) &&
        Objects.equals(this.enableLegacySendflowLinkMetadata, accountUISettings.enableLegacySendflowLinkMetadata) &&
        Objects.equals(this.hasExternalLinkedAccounts, accountUISettings.hasExternalLinkedAccounts) &&
        Objects.equals(this.hasExternalLinkedAccountsMetadata, accountUISettings.hasExternalLinkedAccountsMetadata) &&
        Objects.equals(this.hideSendAnEnvelope, accountUISettings.hideSendAnEnvelope) &&
        Objects.equals(this.hideSendAnEnvelopeMetadata, accountUISettings.hideSendAnEnvelopeMetadata) &&
        Objects.equals(this.hideUseATemplate, accountUISettings.hideUseATemplate) &&
        Objects.equals(this.hideUseATemplateInPrepare, accountUISettings.hideUseATemplateInPrepare) &&
        Objects.equals(this.hideUseATemplateInPrepareMetadata, accountUISettings.hideUseATemplateInPrepareMetadata) &&
        Objects.equals(this.hideUseATemplateMetadata, accountUISettings.hideUseATemplateMetadata) &&
        Objects.equals(this.orderBasedRecipientIdGeneration, accountUISettings.orderBasedRecipientIdGeneration) &&
        Objects.equals(this.orderBasedRecipientIdGenerationMetadata, accountUISettings.orderBasedRecipientIdGenerationMetadata) &&
        Objects.equals(this.removeEnvelopeForwarding, accountUISettings.removeEnvelopeForwarding) &&
        Objects.equals(this.removeEnvelopeForwardingMetadata, accountUISettings.removeEnvelopeForwardingMetadata) &&
        Objects.equals(this.shouldRedactAccessCode, accountUISettings.shouldRedactAccessCode) &&
        Objects.equals(this.shouldRedactAccessCodeMetadata, accountUISettings.shouldRedactAccessCodeMetadata) &&
        Objects.equals(this.uploadNewImageToSignOrInitial, accountUISettings.uploadNewImageToSignOrInitial) &&
        Objects.equals(this.uploadNewImageToSignOrInitialMetadata, accountUISettings.uploadNewImageToSignOrInitialMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(adminMessage, allowUsersToEditSharedAccess, allowUsersToEditSharedAccessMetadata, askAnAdmin, clickwrapSchemaVersion, clickwrapSchemaVersionMetadata, disableWebAppAccess, disableWebAppAccessMetadata, enableAdminMessage, enableAdminMessageMetadata, enableEasySignCanUseMultiTemplateApply, enableEasySignCanUseMultiTemplateApplyMetadata, enableEasySignTemplateUpload, enableEasySignTemplateUploadMetadata, enableEnvelopeCopyWithData, enableEnvelopeCopyWithDataMetadata, enableEnvelopeTypes, enableEnvelopeTypesMetadata, enableLegacySendflowLink, enableLegacySendflowLinkMetadata, hasExternalLinkedAccounts, hasExternalLinkedAccountsMetadata, hideSendAnEnvelope, hideSendAnEnvelopeMetadata, hideUseATemplate, hideUseATemplateInPrepare, hideUseATemplateInPrepareMetadata, hideUseATemplateMetadata, orderBasedRecipientIdGeneration, orderBasedRecipientIdGenerationMetadata, removeEnvelopeForwarding, removeEnvelopeForwardingMetadata, shouldRedactAccessCode, shouldRedactAccessCodeMetadata, uploadNewImageToSignOrInitial, uploadNewImageToSignOrInitialMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUISettings {\n");
    
    sb.append("    adminMessage: ").append(toIndentedString(adminMessage)).append("\n");
    sb.append("    allowUsersToEditSharedAccess: ").append(toIndentedString(allowUsersToEditSharedAccess)).append("\n");
    sb.append("    allowUsersToEditSharedAccessMetadata: ").append(toIndentedString(allowUsersToEditSharedAccessMetadata)).append("\n");
    sb.append("    askAnAdmin: ").append(toIndentedString(askAnAdmin)).append("\n");
    sb.append("    clickwrapSchemaVersion: ").append(toIndentedString(clickwrapSchemaVersion)).append("\n");
    sb.append("    clickwrapSchemaVersionMetadata: ").append(toIndentedString(clickwrapSchemaVersionMetadata)).append("\n");
    sb.append("    disableWebAppAccess: ").append(toIndentedString(disableWebAppAccess)).append("\n");
    sb.append("    disableWebAppAccessMetadata: ").append(toIndentedString(disableWebAppAccessMetadata)).append("\n");
    sb.append("    enableAdminMessage: ").append(toIndentedString(enableAdminMessage)).append("\n");
    sb.append("    enableAdminMessageMetadata: ").append(toIndentedString(enableAdminMessageMetadata)).append("\n");
    sb.append("    enableEasySignCanUseMultiTemplateApply: ").append(toIndentedString(enableEasySignCanUseMultiTemplateApply)).append("\n");
    sb.append("    enableEasySignCanUseMultiTemplateApplyMetadata: ").append(toIndentedString(enableEasySignCanUseMultiTemplateApplyMetadata)).append("\n");
    sb.append("    enableEasySignTemplateUpload: ").append(toIndentedString(enableEasySignTemplateUpload)).append("\n");
    sb.append("    enableEasySignTemplateUploadMetadata: ").append(toIndentedString(enableEasySignTemplateUploadMetadata)).append("\n");
    sb.append("    enableEnvelopeCopyWithData: ").append(toIndentedString(enableEnvelopeCopyWithData)).append("\n");
    sb.append("    enableEnvelopeCopyWithDataMetadata: ").append(toIndentedString(enableEnvelopeCopyWithDataMetadata)).append("\n");
    sb.append("    enableEnvelopeTypes: ").append(toIndentedString(enableEnvelopeTypes)).append("\n");
    sb.append("    enableEnvelopeTypesMetadata: ").append(toIndentedString(enableEnvelopeTypesMetadata)).append("\n");
    sb.append("    enableLegacySendflowLink: ").append(toIndentedString(enableLegacySendflowLink)).append("\n");
    sb.append("    enableLegacySendflowLinkMetadata: ").append(toIndentedString(enableLegacySendflowLinkMetadata)).append("\n");
    sb.append("    hasExternalLinkedAccounts: ").append(toIndentedString(hasExternalLinkedAccounts)).append("\n");
    sb.append("    hasExternalLinkedAccountsMetadata: ").append(toIndentedString(hasExternalLinkedAccountsMetadata)).append("\n");
    sb.append("    hideSendAnEnvelope: ").append(toIndentedString(hideSendAnEnvelope)).append("\n");
    sb.append("    hideSendAnEnvelopeMetadata: ").append(toIndentedString(hideSendAnEnvelopeMetadata)).append("\n");
    sb.append("    hideUseATemplate: ").append(toIndentedString(hideUseATemplate)).append("\n");
    sb.append("    hideUseATemplateInPrepare: ").append(toIndentedString(hideUseATemplateInPrepare)).append("\n");
    sb.append("    hideUseATemplateInPrepareMetadata: ").append(toIndentedString(hideUseATemplateInPrepareMetadata)).append("\n");
    sb.append("    hideUseATemplateMetadata: ").append(toIndentedString(hideUseATemplateMetadata)).append("\n");
    sb.append("    orderBasedRecipientIdGeneration: ").append(toIndentedString(orderBasedRecipientIdGeneration)).append("\n");
    sb.append("    orderBasedRecipientIdGenerationMetadata: ").append(toIndentedString(orderBasedRecipientIdGenerationMetadata)).append("\n");
    sb.append("    removeEnvelopeForwarding: ").append(toIndentedString(removeEnvelopeForwarding)).append("\n");
    sb.append("    removeEnvelopeForwardingMetadata: ").append(toIndentedString(removeEnvelopeForwardingMetadata)).append("\n");
    sb.append("    shouldRedactAccessCode: ").append(toIndentedString(shouldRedactAccessCode)).append("\n");
    sb.append("    shouldRedactAccessCodeMetadata: ").append(toIndentedString(shouldRedactAccessCodeMetadata)).append("\n");
    sb.append("    uploadNewImageToSignOrInitial: ").append(toIndentedString(uploadNewImageToSignOrInitial)).append("\n");
    sb.append("    uploadNewImageToSignOrInitialMetadata: ").append(toIndentedString(uploadNewImageToSignOrInitialMetadata)).append("\n");
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

