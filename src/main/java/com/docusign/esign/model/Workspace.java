package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.WorkspaceSettings;
import com.docusign.esign.model.WorkspaceUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Provides properties that describe a workspace..
 *
 */
@Schema(description = "Provides properties that describe a workspace.")

public class Workspace implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("billableAccountId")
  private String billableAccountId = null;

  @JsonProperty("callerInformation")
  private WorkspaceUser callerInformation = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("createdByInformation")
  private WorkspaceUser createdByInformation = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("lastModifiedByInformation")
  private WorkspaceUser lastModifiedByInformation = null;

  @JsonProperty("settings")
  private WorkspaceSettings settings = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("workspaceBaseUrl")
  private String workspaceBaseUrl = null;

  @JsonProperty("workspaceDescription")
  private String workspaceDescription = null;

  @JsonProperty("workspaceId")
  private String workspaceId = null;

  @JsonProperty("workspaceName")
  private String workspaceName = null;

  @JsonProperty("workspaceUri")
  private String workspaceUri = null;


  /**
   * billableAccountId.
   *
   * @return Workspace
   **/
  public Workspace billableAccountId(String billableAccountId) {
    this.billableAccountId = billableAccountId;
    return this;
  }

  /**
   * .
   * @return billableAccountId
   **/
  @Schema(description = "")
  public String getBillableAccountId() {
    return billableAccountId;
  }

  /**
   * setBillableAccountId.
   **/
  public void setBillableAccountId(String billableAccountId) {
    this.billableAccountId = billableAccountId;
  }


  /**
   * callerInformation.
   *
   * @return Workspace
   **/
  public Workspace callerInformation(WorkspaceUser callerInformation) {
    this.callerInformation = callerInformation;
    return this;
  }

  /**
   * .
   * @return callerInformation
   **/
  @Schema(description = "")
  public WorkspaceUser getCallerInformation() {
    return callerInformation;
  }

  /**
   * setCallerInformation.
   **/
  public void setCallerInformation(WorkspaceUser callerInformation) {
    this.callerInformation = callerInformation;
  }


  /**
   * created.
   *
   * @return Workspace
   **/
  public Workspace created(String created) {
    this.created = created;
    return this;
  }

  /**
   * .
   * @return created
   **/
  @Schema(description = "")
  public String getCreated() {
    return created;
  }

  /**
   * setCreated.
   **/
  public void setCreated(String created) {
    this.created = created;
  }


  /**
   * createdByInformation.
   *
   * @return Workspace
   **/
  public Workspace createdByInformation(WorkspaceUser createdByInformation) {
    this.createdByInformation = createdByInformation;
    return this;
  }

  /**
   * Details about the user who created the workspace..
   * @return createdByInformation
   **/
  @Schema(description = "Details about the user who created the workspace.")
  public WorkspaceUser getCreatedByInformation() {
    return createdByInformation;
  }

  /**
   * setCreatedByInformation.
   **/
  public void setCreatedByInformation(WorkspaceUser createdByInformation) {
    this.createdByInformation = createdByInformation;
  }


  /**
   * lastModified.
   *
   * @return Workspace
   **/
  public Workspace lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Utc date and time the comment was last updated (can only be done by creator.).
   * @return lastModified
   **/
  @Schema(description = "Utc date and time the comment was last updated (can only be done by creator.)")
  public String getLastModified() {
    return lastModified;
  }

  /**
   * setLastModified.
   **/
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  /**
   * lastModifiedByInformation.
   *
   * @return Workspace
   **/
  public Workspace lastModifiedByInformation(WorkspaceUser lastModifiedByInformation) {
    this.lastModifiedByInformation = lastModifiedByInformation;
    return this;
  }

  /**
   * Details about the user who last modified the workspace..
   * @return lastModifiedByInformation
   **/
  @Schema(description = "Details about the user who last modified the workspace.")
  public WorkspaceUser getLastModifiedByInformation() {
    return lastModifiedByInformation;
  }

  /**
   * setLastModifiedByInformation.
   **/
  public void setLastModifiedByInformation(WorkspaceUser lastModifiedByInformation) {
    this.lastModifiedByInformation = lastModifiedByInformation;
  }


  /**
   * settings.
   *
   * @return Workspace
   **/
  public Workspace settings(WorkspaceSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Information about the settings for the workspace..
   * @return settings
   **/
  @Schema(description = "Information about the settings for the workspace.")
  public WorkspaceSettings getSettings() {
    return settings;
  }

  /**
   * setSettings.
   **/
  public void setSettings(WorkspaceSettings settings) {
    this.settings = settings;
  }


  /**
   * status.
   *
   * @return Workspace
   **/
  public Workspace status(String status) {
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
   * workspaceBaseUrl.
   *
   * @return Workspace
   **/
  public Workspace workspaceBaseUrl(String workspaceBaseUrl) {
    this.workspaceBaseUrl = workspaceBaseUrl;
    return this;
  }

  /**
   * The relative URL that may be used to access the workspace..
   * @return workspaceBaseUrl
   **/
  @Schema(description = "The relative URL that may be used to access the workspace.")
  public String getWorkspaceBaseUrl() {
    return workspaceBaseUrl;
  }

  /**
   * setWorkspaceBaseUrl.
   **/
  public void setWorkspaceBaseUrl(String workspaceBaseUrl) {
    this.workspaceBaseUrl = workspaceBaseUrl;
  }


  /**
   * workspaceDescription.
   *
   * @return Workspace
   **/
  public Workspace workspaceDescription(String workspaceDescription) {
    this.workspaceDescription = workspaceDescription;
    return this;
  }

  /**
   * Text describing the purpose of the workspace..
   * @return workspaceDescription
   **/
  @Schema(description = "Text describing the purpose of the workspace.")
  public String getWorkspaceDescription() {
    return workspaceDescription;
  }

  /**
   * setWorkspaceDescription.
   **/
  public void setWorkspaceDescription(String workspaceDescription) {
    this.workspaceDescription = workspaceDescription;
  }


  /**
   * workspaceId.
   *
   * @return Workspace
   **/
  public Workspace workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * The id of the workspace, always populated..
   * @return workspaceId
   **/
  @Schema(description = "The id of the workspace, always populated.")
  public String getWorkspaceId() {
    return workspaceId;
  }

  /**
   * setWorkspaceId.
   **/
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }


  /**
   * workspaceName.
   *
   * @return Workspace
   **/
  public Workspace workspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
  }

  /**
   * The name of the workspace..
   * @return workspaceName
   **/
  @Schema(description = "The name of the workspace.")
  public String getWorkspaceName() {
    return workspaceName;
  }

  /**
   * setWorkspaceName.
   **/
  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }


  /**
   * workspaceUri.
   *
   * @return Workspace
   **/
  public Workspace workspaceUri(String workspaceUri) {
    this.workspaceUri = workspaceUri;
    return this;
  }

  /**
   * The relative URI that may be used to access the workspace..
   * @return workspaceUri
   **/
  @Schema(description = "The relative URI that may be used to access the workspace.")
  public String getWorkspaceUri() {
    return workspaceUri;
  }

  /**
   * setWorkspaceUri.
   **/
  public void setWorkspaceUri(String workspaceUri) {
    this.workspaceUri = workspaceUri;
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
    Workspace workspace = (Workspace) o;
    return Objects.equals(this.billableAccountId, workspace.billableAccountId) &&
        Objects.equals(this.callerInformation, workspace.callerInformation) &&
        Objects.equals(this.created, workspace.created) &&
        Objects.equals(this.createdByInformation, workspace.createdByInformation) &&
        Objects.equals(this.lastModified, workspace.lastModified) &&
        Objects.equals(this.lastModifiedByInformation, workspace.lastModifiedByInformation) &&
        Objects.equals(this.settings, workspace.settings) &&
        Objects.equals(this.status, workspace.status) &&
        Objects.equals(this.workspaceBaseUrl, workspace.workspaceBaseUrl) &&
        Objects.equals(this.workspaceDescription, workspace.workspaceDescription) &&
        Objects.equals(this.workspaceId, workspace.workspaceId) &&
        Objects.equals(this.workspaceName, workspace.workspaceName) &&
        Objects.equals(this.workspaceUri, workspace.workspaceUri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(billableAccountId, callerInformation, created, createdByInformation, lastModified, lastModifiedByInformation, settings, status, workspaceBaseUrl, workspaceDescription, workspaceId, workspaceName, workspaceUri);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
    
    sb.append("    billableAccountId: ").append(toIndentedString(billableAccountId)).append("\n");
    sb.append("    callerInformation: ").append(toIndentedString(callerInformation)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdByInformation: ").append(toIndentedString(createdByInformation)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedByInformation: ").append(toIndentedString(lastModifiedByInformation)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workspaceBaseUrl: ").append(toIndentedString(workspaceBaseUrl)).append("\n");
    sb.append("    workspaceDescription: ").append(toIndentedString(workspaceDescription)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    sb.append("    workspaceUri: ").append(toIndentedString(workspaceUri)).append("\n");
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

