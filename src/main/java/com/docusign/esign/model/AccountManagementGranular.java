package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * AccountManagementGranular.
 *
 */

public class AccountManagementGranular implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("allowManageAccountSecuritySettings")
  private String allowManageAccountSecuritySettings = null;

  @JsonProperty("allowManageAccountSecuritySettingsMetadata")
  private SettingsMetadata allowManageAccountSecuritySettingsMetadata = null;

  @JsonProperty("allowManageAccountSettings")
  private String allowManageAccountSettings = null;

  @JsonProperty("allowManageAccountSettingsMetadata")
  private SettingsMetadata allowManageAccountSettingsMetadata = null;

  @JsonProperty("allowManageAdmins")
  private String allowManageAdmins = null;

  @JsonProperty("allowManageAdminsMetadata")
  private SettingsMetadata allowManageAdminsMetadata = null;

  @JsonProperty("allowManageConnect")
  private String allowManageConnect = null;

  @JsonProperty("allowManageConnectMetadata")
  private SettingsMetadata allowManageConnectMetadata = null;

  @JsonProperty("allowManageDocumentRetention")
  private String allowManageDocumentRetention = null;

  @JsonProperty("allowManageDocumentRetentionMetadata")
  private SettingsMetadata allowManageDocumentRetentionMetadata = null;

  @JsonProperty("allowManageEnvelopeTransfer")
  private String allowManageEnvelopeTransfer = null;

  @JsonProperty("allowManageEnvelopeTransferMetadata")
  private SettingsMetadata allowManageEnvelopeTransferMetadata = null;

  @JsonProperty("allowManageGroupsButNotUsers")
  private String allowManageGroupsButNotUsers = null;

  @JsonProperty("allowManageGroupsButNotUsersMetadata")
  private SettingsMetadata allowManageGroupsButNotUsersMetadata = null;

  @JsonProperty("allowManageJointAgreements")
  private String allowManageJointAgreements = null;

  @JsonProperty("allowManageJointAgreementsMetadata")
  private SettingsMetadata allowManageJointAgreementsMetadata = null;

  @JsonProperty("allowManageReporting")
  private String allowManageReporting = null;

  @JsonProperty("allowManageReportingMetadata")
  private SettingsMetadata allowManageReportingMetadata = null;

  @JsonProperty("allowManageSharing")
  private String allowManageSharing = null;

  @JsonProperty("allowManageSharingMetadata")
  private SettingsMetadata allowManageSharingMetadata = null;

  @JsonProperty("allowManageSigningGroups")
  private String allowManageSigningGroups = null;

  @JsonProperty("allowManageSigningGroupsMetadata")
  private SettingsMetadata allowManageSigningGroupsMetadata = null;

  @JsonProperty("allowManageStamps")
  private String allowManageStamps = null;

  @JsonProperty("allowManageStampsMetadata")
  private SettingsMetadata allowManageStampsMetadata = null;

  @JsonProperty("allowManageUsers")
  private String allowManageUsers = null;

  @JsonProperty("allowManageUsersMetadata")
  private SettingsMetadata allowManageUsersMetadata = null;

  @JsonProperty("allowViewUsers")
  private String allowViewUsers = null;


  /**
   * allowManageAccountSecuritySettings.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageAccountSecuritySettings(String allowManageAccountSecuritySettings) {
    this.allowManageAccountSecuritySettings = allowManageAccountSecuritySettings;
    return this;
  }

  /**
   * .
   * @return allowManageAccountSecuritySettings
   **/
  @Schema(description = "")
  public String getAllowManageAccountSecuritySettings() {
    return allowManageAccountSecuritySettings;
  }

  /**
   * setAllowManageAccountSecuritySettings.
   **/
  public void setAllowManageAccountSecuritySettings(String allowManageAccountSecuritySettings) {
    this.allowManageAccountSecuritySettings = allowManageAccountSecuritySettings;
  }


  /**
   * allowManageAccountSecuritySettingsMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageAccountSecuritySettingsMetadata(SettingsMetadata allowManageAccountSecuritySettingsMetadata) {
    this.allowManageAccountSecuritySettingsMetadata = allowManageAccountSecuritySettingsMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageAccountSecuritySettingsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageAccountSecuritySettingsMetadata() {
    return allowManageAccountSecuritySettingsMetadata;
  }

  /**
   * setAllowManageAccountSecuritySettingsMetadata.
   **/
  public void setAllowManageAccountSecuritySettingsMetadata(SettingsMetadata allowManageAccountSecuritySettingsMetadata) {
    this.allowManageAccountSecuritySettingsMetadata = allowManageAccountSecuritySettingsMetadata;
  }


  /**
   * allowManageAccountSettings.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageAccountSettings(String allowManageAccountSettings) {
    this.allowManageAccountSettings = allowManageAccountSettings;
    return this;
  }

  /**
   * .
   * @return allowManageAccountSettings
   **/
  @Schema(description = "")
  public String getAllowManageAccountSettings() {
    return allowManageAccountSettings;
  }

  /**
   * setAllowManageAccountSettings.
   **/
  public void setAllowManageAccountSettings(String allowManageAccountSettings) {
    this.allowManageAccountSettings = allowManageAccountSettings;
  }


  /**
   * allowManageAccountSettingsMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageAccountSettingsMetadata(SettingsMetadata allowManageAccountSettingsMetadata) {
    this.allowManageAccountSettingsMetadata = allowManageAccountSettingsMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageAccountSettingsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageAccountSettingsMetadata() {
    return allowManageAccountSettingsMetadata;
  }

  /**
   * setAllowManageAccountSettingsMetadata.
   **/
  public void setAllowManageAccountSettingsMetadata(SettingsMetadata allowManageAccountSettingsMetadata) {
    this.allowManageAccountSettingsMetadata = allowManageAccountSettingsMetadata;
  }


  /**
   * allowManageAdmins.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageAdmins(String allowManageAdmins) {
    this.allowManageAdmins = allowManageAdmins;
    return this;
  }

  /**
   * .
   * @return allowManageAdmins
   **/
  @Schema(description = "")
  public String getAllowManageAdmins() {
    return allowManageAdmins;
  }

  /**
   * setAllowManageAdmins.
   **/
  public void setAllowManageAdmins(String allowManageAdmins) {
    this.allowManageAdmins = allowManageAdmins;
  }


  /**
   * allowManageAdminsMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageAdminsMetadata(SettingsMetadata allowManageAdminsMetadata) {
    this.allowManageAdminsMetadata = allowManageAdminsMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageAdminsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageAdminsMetadata() {
    return allowManageAdminsMetadata;
  }

  /**
   * setAllowManageAdminsMetadata.
   **/
  public void setAllowManageAdminsMetadata(SettingsMetadata allowManageAdminsMetadata) {
    this.allowManageAdminsMetadata = allowManageAdminsMetadata;
  }


  /**
   * allowManageConnect.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageConnect(String allowManageConnect) {
    this.allowManageConnect = allowManageConnect;
    return this;
  }

  /**
   * .
   * @return allowManageConnect
   **/
  @Schema(description = "")
  public String getAllowManageConnect() {
    return allowManageConnect;
  }

  /**
   * setAllowManageConnect.
   **/
  public void setAllowManageConnect(String allowManageConnect) {
    this.allowManageConnect = allowManageConnect;
  }


  /**
   * allowManageConnectMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageConnectMetadata(SettingsMetadata allowManageConnectMetadata) {
    this.allowManageConnectMetadata = allowManageConnectMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageConnectMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageConnectMetadata() {
    return allowManageConnectMetadata;
  }

  /**
   * setAllowManageConnectMetadata.
   **/
  public void setAllowManageConnectMetadata(SettingsMetadata allowManageConnectMetadata) {
    this.allowManageConnectMetadata = allowManageConnectMetadata;
  }


  /**
   * allowManageDocumentRetention.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageDocumentRetention(String allowManageDocumentRetention) {
    this.allowManageDocumentRetention = allowManageDocumentRetention;
    return this;
  }

  /**
   * .
   * @return allowManageDocumentRetention
   **/
  @Schema(description = "")
  public String getAllowManageDocumentRetention() {
    return allowManageDocumentRetention;
  }

  /**
   * setAllowManageDocumentRetention.
   **/
  public void setAllowManageDocumentRetention(String allowManageDocumentRetention) {
    this.allowManageDocumentRetention = allowManageDocumentRetention;
  }


  /**
   * allowManageDocumentRetentionMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageDocumentRetentionMetadata(SettingsMetadata allowManageDocumentRetentionMetadata) {
    this.allowManageDocumentRetentionMetadata = allowManageDocumentRetentionMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageDocumentRetentionMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageDocumentRetentionMetadata() {
    return allowManageDocumentRetentionMetadata;
  }

  /**
   * setAllowManageDocumentRetentionMetadata.
   **/
  public void setAllowManageDocumentRetentionMetadata(SettingsMetadata allowManageDocumentRetentionMetadata) {
    this.allowManageDocumentRetentionMetadata = allowManageDocumentRetentionMetadata;
  }


  /**
   * allowManageEnvelopeTransfer.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageEnvelopeTransfer(String allowManageEnvelopeTransfer) {
    this.allowManageEnvelopeTransfer = allowManageEnvelopeTransfer;
    return this;
  }

  /**
   * .
   * @return allowManageEnvelopeTransfer
   **/
  @Schema(description = "")
  public String getAllowManageEnvelopeTransfer() {
    return allowManageEnvelopeTransfer;
  }

  /**
   * setAllowManageEnvelopeTransfer.
   **/
  public void setAllowManageEnvelopeTransfer(String allowManageEnvelopeTransfer) {
    this.allowManageEnvelopeTransfer = allowManageEnvelopeTransfer;
  }


  /**
   * allowManageEnvelopeTransferMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageEnvelopeTransferMetadata(SettingsMetadata allowManageEnvelopeTransferMetadata) {
    this.allowManageEnvelopeTransferMetadata = allowManageEnvelopeTransferMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageEnvelopeTransferMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageEnvelopeTransferMetadata() {
    return allowManageEnvelopeTransferMetadata;
  }

  /**
   * setAllowManageEnvelopeTransferMetadata.
   **/
  public void setAllowManageEnvelopeTransferMetadata(SettingsMetadata allowManageEnvelopeTransferMetadata) {
    this.allowManageEnvelopeTransferMetadata = allowManageEnvelopeTransferMetadata;
  }


  /**
   * allowManageGroupsButNotUsers.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageGroupsButNotUsers(String allowManageGroupsButNotUsers) {
    this.allowManageGroupsButNotUsers = allowManageGroupsButNotUsers;
    return this;
  }

  /**
   * .
   * @return allowManageGroupsButNotUsers
   **/
  @Schema(description = "")
  public String getAllowManageGroupsButNotUsers() {
    return allowManageGroupsButNotUsers;
  }

  /**
   * setAllowManageGroupsButNotUsers.
   **/
  public void setAllowManageGroupsButNotUsers(String allowManageGroupsButNotUsers) {
    this.allowManageGroupsButNotUsers = allowManageGroupsButNotUsers;
  }


  /**
   * allowManageGroupsButNotUsersMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageGroupsButNotUsersMetadata(SettingsMetadata allowManageGroupsButNotUsersMetadata) {
    this.allowManageGroupsButNotUsersMetadata = allowManageGroupsButNotUsersMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageGroupsButNotUsersMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageGroupsButNotUsersMetadata() {
    return allowManageGroupsButNotUsersMetadata;
  }

  /**
   * setAllowManageGroupsButNotUsersMetadata.
   **/
  public void setAllowManageGroupsButNotUsersMetadata(SettingsMetadata allowManageGroupsButNotUsersMetadata) {
    this.allowManageGroupsButNotUsersMetadata = allowManageGroupsButNotUsersMetadata;
  }


  /**
   * allowManageJointAgreements.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageJointAgreements(String allowManageJointAgreements) {
    this.allowManageJointAgreements = allowManageJointAgreements;
    return this;
  }

  /**
   * .
   * @return allowManageJointAgreements
   **/
  @Schema(description = "")
  public String getAllowManageJointAgreements() {
    return allowManageJointAgreements;
  }

  /**
   * setAllowManageJointAgreements.
   **/
  public void setAllowManageJointAgreements(String allowManageJointAgreements) {
    this.allowManageJointAgreements = allowManageJointAgreements;
  }


  /**
   * allowManageJointAgreementsMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageJointAgreementsMetadata(SettingsMetadata allowManageJointAgreementsMetadata) {
    this.allowManageJointAgreementsMetadata = allowManageJointAgreementsMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageJointAgreementsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageJointAgreementsMetadata() {
    return allowManageJointAgreementsMetadata;
  }

  /**
   * setAllowManageJointAgreementsMetadata.
   **/
  public void setAllowManageJointAgreementsMetadata(SettingsMetadata allowManageJointAgreementsMetadata) {
    this.allowManageJointAgreementsMetadata = allowManageJointAgreementsMetadata;
  }


  /**
   * allowManageReporting.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageReporting(String allowManageReporting) {
    this.allowManageReporting = allowManageReporting;
    return this;
  }

  /**
   * .
   * @return allowManageReporting
   **/
  @Schema(description = "")
  public String getAllowManageReporting() {
    return allowManageReporting;
  }

  /**
   * setAllowManageReporting.
   **/
  public void setAllowManageReporting(String allowManageReporting) {
    this.allowManageReporting = allowManageReporting;
  }


  /**
   * allowManageReportingMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageReportingMetadata(SettingsMetadata allowManageReportingMetadata) {
    this.allowManageReportingMetadata = allowManageReportingMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageReportingMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageReportingMetadata() {
    return allowManageReportingMetadata;
  }

  /**
   * setAllowManageReportingMetadata.
   **/
  public void setAllowManageReportingMetadata(SettingsMetadata allowManageReportingMetadata) {
    this.allowManageReportingMetadata = allowManageReportingMetadata;
  }


  /**
   * allowManageSharing.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageSharing(String allowManageSharing) {
    this.allowManageSharing = allowManageSharing;
    return this;
  }

  /**
   * .
   * @return allowManageSharing
   **/
  @Schema(description = "")
  public String getAllowManageSharing() {
    return allowManageSharing;
  }

  /**
   * setAllowManageSharing.
   **/
  public void setAllowManageSharing(String allowManageSharing) {
    this.allowManageSharing = allowManageSharing;
  }


  /**
   * allowManageSharingMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageSharingMetadata(SettingsMetadata allowManageSharingMetadata) {
    this.allowManageSharingMetadata = allowManageSharingMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageSharingMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageSharingMetadata() {
    return allowManageSharingMetadata;
  }

  /**
   * setAllowManageSharingMetadata.
   **/
  public void setAllowManageSharingMetadata(SettingsMetadata allowManageSharingMetadata) {
    this.allowManageSharingMetadata = allowManageSharingMetadata;
  }


  /**
   * allowManageSigningGroups.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageSigningGroups(String allowManageSigningGroups) {
    this.allowManageSigningGroups = allowManageSigningGroups;
    return this;
  }

  /**
   * .
   * @return allowManageSigningGroups
   **/
  @Schema(description = "")
  public String getAllowManageSigningGroups() {
    return allowManageSigningGroups;
  }

  /**
   * setAllowManageSigningGroups.
   **/
  public void setAllowManageSigningGroups(String allowManageSigningGroups) {
    this.allowManageSigningGroups = allowManageSigningGroups;
  }


  /**
   * allowManageSigningGroupsMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageSigningGroupsMetadata(SettingsMetadata allowManageSigningGroupsMetadata) {
    this.allowManageSigningGroupsMetadata = allowManageSigningGroupsMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageSigningGroupsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageSigningGroupsMetadata() {
    return allowManageSigningGroupsMetadata;
  }

  /**
   * setAllowManageSigningGroupsMetadata.
   **/
  public void setAllowManageSigningGroupsMetadata(SettingsMetadata allowManageSigningGroupsMetadata) {
    this.allowManageSigningGroupsMetadata = allowManageSigningGroupsMetadata;
  }


  /**
   * allowManageStamps.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageStamps(String allowManageStamps) {
    this.allowManageStamps = allowManageStamps;
    return this;
  }

  /**
   * .
   * @return allowManageStamps
   **/
  @Schema(description = "")
  public String getAllowManageStamps() {
    return allowManageStamps;
  }

  /**
   * setAllowManageStamps.
   **/
  public void setAllowManageStamps(String allowManageStamps) {
    this.allowManageStamps = allowManageStamps;
  }


  /**
   * allowManageStampsMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageStampsMetadata(SettingsMetadata allowManageStampsMetadata) {
    this.allowManageStampsMetadata = allowManageStampsMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageStampsMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageStampsMetadata() {
    return allowManageStampsMetadata;
  }

  /**
   * setAllowManageStampsMetadata.
   **/
  public void setAllowManageStampsMetadata(SettingsMetadata allowManageStampsMetadata) {
    this.allowManageStampsMetadata = allowManageStampsMetadata;
  }


  /**
   * allowManageUsers.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageUsers(String allowManageUsers) {
    this.allowManageUsers = allowManageUsers;
    return this;
  }

  /**
   * .
   * @return allowManageUsers
   **/
  @Schema(description = "")
  public String getAllowManageUsers() {
    return allowManageUsers;
  }

  /**
   * setAllowManageUsers.
   **/
  public void setAllowManageUsers(String allowManageUsers) {
    this.allowManageUsers = allowManageUsers;
  }


  /**
   * allowManageUsersMetadata.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowManageUsersMetadata(SettingsMetadata allowManageUsersMetadata) {
    this.allowManageUsersMetadata = allowManageUsersMetadata;
    return this;
  }

  /**
   * .
   * @return allowManageUsersMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAllowManageUsersMetadata() {
    return allowManageUsersMetadata;
  }

  /**
   * setAllowManageUsersMetadata.
   **/
  public void setAllowManageUsersMetadata(SettingsMetadata allowManageUsersMetadata) {
    this.allowManageUsersMetadata = allowManageUsersMetadata;
  }


  /**
   * allowViewUsers.
   *
   * @return AccountManagementGranular
   **/
  public AccountManagementGranular allowViewUsers(String allowViewUsers) {
    this.allowViewUsers = allowViewUsers;
    return this;
  }

  /**
   * .
   * @return allowViewUsers
   **/
  @Schema(description = "")
  public String getAllowViewUsers() {
    return allowViewUsers;
  }

  /**
   * setAllowViewUsers.
   **/
  public void setAllowViewUsers(String allowViewUsers) {
    this.allowViewUsers = allowViewUsers;
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
    AccountManagementGranular accountManagementGranular = (AccountManagementGranular) o;
    return Objects.equals(this.allowManageAccountSecuritySettings, accountManagementGranular.allowManageAccountSecuritySettings) &&
        Objects.equals(this.allowManageAccountSecuritySettingsMetadata, accountManagementGranular.allowManageAccountSecuritySettingsMetadata) &&
        Objects.equals(this.allowManageAccountSettings, accountManagementGranular.allowManageAccountSettings) &&
        Objects.equals(this.allowManageAccountSettingsMetadata, accountManagementGranular.allowManageAccountSettingsMetadata) &&
        Objects.equals(this.allowManageAdmins, accountManagementGranular.allowManageAdmins) &&
        Objects.equals(this.allowManageAdminsMetadata, accountManagementGranular.allowManageAdminsMetadata) &&
        Objects.equals(this.allowManageConnect, accountManagementGranular.allowManageConnect) &&
        Objects.equals(this.allowManageConnectMetadata, accountManagementGranular.allowManageConnectMetadata) &&
        Objects.equals(this.allowManageDocumentRetention, accountManagementGranular.allowManageDocumentRetention) &&
        Objects.equals(this.allowManageDocumentRetentionMetadata, accountManagementGranular.allowManageDocumentRetentionMetadata) &&
        Objects.equals(this.allowManageEnvelopeTransfer, accountManagementGranular.allowManageEnvelopeTransfer) &&
        Objects.equals(this.allowManageEnvelopeTransferMetadata, accountManagementGranular.allowManageEnvelopeTransferMetadata) &&
        Objects.equals(this.allowManageGroupsButNotUsers, accountManagementGranular.allowManageGroupsButNotUsers) &&
        Objects.equals(this.allowManageGroupsButNotUsersMetadata, accountManagementGranular.allowManageGroupsButNotUsersMetadata) &&
        Objects.equals(this.allowManageJointAgreements, accountManagementGranular.allowManageJointAgreements) &&
        Objects.equals(this.allowManageJointAgreementsMetadata, accountManagementGranular.allowManageJointAgreementsMetadata) &&
        Objects.equals(this.allowManageReporting, accountManagementGranular.allowManageReporting) &&
        Objects.equals(this.allowManageReportingMetadata, accountManagementGranular.allowManageReportingMetadata) &&
        Objects.equals(this.allowManageSharing, accountManagementGranular.allowManageSharing) &&
        Objects.equals(this.allowManageSharingMetadata, accountManagementGranular.allowManageSharingMetadata) &&
        Objects.equals(this.allowManageSigningGroups, accountManagementGranular.allowManageSigningGroups) &&
        Objects.equals(this.allowManageSigningGroupsMetadata, accountManagementGranular.allowManageSigningGroupsMetadata) &&
        Objects.equals(this.allowManageStamps, accountManagementGranular.allowManageStamps) &&
        Objects.equals(this.allowManageStampsMetadata, accountManagementGranular.allowManageStampsMetadata) &&
        Objects.equals(this.allowManageUsers, accountManagementGranular.allowManageUsers) &&
        Objects.equals(this.allowManageUsersMetadata, accountManagementGranular.allowManageUsersMetadata) &&
        Objects.equals(this.allowViewUsers, accountManagementGranular.allowViewUsers);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(allowManageAccountSecuritySettings, allowManageAccountSecuritySettingsMetadata, allowManageAccountSettings, allowManageAccountSettingsMetadata, allowManageAdmins, allowManageAdminsMetadata, allowManageConnect, allowManageConnectMetadata, allowManageDocumentRetention, allowManageDocumentRetentionMetadata, allowManageEnvelopeTransfer, allowManageEnvelopeTransferMetadata, allowManageGroupsButNotUsers, allowManageGroupsButNotUsersMetadata, allowManageJointAgreements, allowManageJointAgreementsMetadata, allowManageReporting, allowManageReportingMetadata, allowManageSharing, allowManageSharingMetadata, allowManageSigningGroups, allowManageSigningGroupsMetadata, allowManageStamps, allowManageStampsMetadata, allowManageUsers, allowManageUsersMetadata, allowViewUsers);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagementGranular {\n");
    
    sb.append("    allowManageAccountSecuritySettings: ").append(toIndentedString(allowManageAccountSecuritySettings)).append("\n");
    sb.append("    allowManageAccountSecuritySettingsMetadata: ").append(toIndentedString(allowManageAccountSecuritySettingsMetadata)).append("\n");
    sb.append("    allowManageAccountSettings: ").append(toIndentedString(allowManageAccountSettings)).append("\n");
    sb.append("    allowManageAccountSettingsMetadata: ").append(toIndentedString(allowManageAccountSettingsMetadata)).append("\n");
    sb.append("    allowManageAdmins: ").append(toIndentedString(allowManageAdmins)).append("\n");
    sb.append("    allowManageAdminsMetadata: ").append(toIndentedString(allowManageAdminsMetadata)).append("\n");
    sb.append("    allowManageConnect: ").append(toIndentedString(allowManageConnect)).append("\n");
    sb.append("    allowManageConnectMetadata: ").append(toIndentedString(allowManageConnectMetadata)).append("\n");
    sb.append("    allowManageDocumentRetention: ").append(toIndentedString(allowManageDocumentRetention)).append("\n");
    sb.append("    allowManageDocumentRetentionMetadata: ").append(toIndentedString(allowManageDocumentRetentionMetadata)).append("\n");
    sb.append("    allowManageEnvelopeTransfer: ").append(toIndentedString(allowManageEnvelopeTransfer)).append("\n");
    sb.append("    allowManageEnvelopeTransferMetadata: ").append(toIndentedString(allowManageEnvelopeTransferMetadata)).append("\n");
    sb.append("    allowManageGroupsButNotUsers: ").append(toIndentedString(allowManageGroupsButNotUsers)).append("\n");
    sb.append("    allowManageGroupsButNotUsersMetadata: ").append(toIndentedString(allowManageGroupsButNotUsersMetadata)).append("\n");
    sb.append("    allowManageJointAgreements: ").append(toIndentedString(allowManageJointAgreements)).append("\n");
    sb.append("    allowManageJointAgreementsMetadata: ").append(toIndentedString(allowManageJointAgreementsMetadata)).append("\n");
    sb.append("    allowManageReporting: ").append(toIndentedString(allowManageReporting)).append("\n");
    sb.append("    allowManageReportingMetadata: ").append(toIndentedString(allowManageReportingMetadata)).append("\n");
    sb.append("    allowManageSharing: ").append(toIndentedString(allowManageSharing)).append("\n");
    sb.append("    allowManageSharingMetadata: ").append(toIndentedString(allowManageSharingMetadata)).append("\n");
    sb.append("    allowManageSigningGroups: ").append(toIndentedString(allowManageSigningGroups)).append("\n");
    sb.append("    allowManageSigningGroupsMetadata: ").append(toIndentedString(allowManageSigningGroupsMetadata)).append("\n");
    sb.append("    allowManageStamps: ").append(toIndentedString(allowManageStamps)).append("\n");
    sb.append("    allowManageStampsMetadata: ").append(toIndentedString(allowManageStampsMetadata)).append("\n");
    sb.append("    allowManageUsers: ").append(toIndentedString(allowManageUsers)).append("\n");
    sb.append("    allowManageUsersMetadata: ").append(toIndentedString(allowManageUsersMetadata)).append("\n");
    sb.append("    allowViewUsers: ").append(toIndentedString(allowViewUsers)).append("\n");
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

