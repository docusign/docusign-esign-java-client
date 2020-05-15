package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.WorkspaceUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Provides properties that describe a workspace.
 */
@ApiModel(description = "Provides properties that describe a workspace.")

public class Workspace {
  @JsonProperty("billableAccountId")
  private String billableAccountId = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("createdByInformation")
  private WorkspaceUser createdByInformation = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("lastModifiedByInformation")
  private WorkspaceUser lastModifiedByInformation = null;

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

  public Workspace billableAccountId(String billableAccountId) {
    this.billableAccountId = billableAccountId;
    return this;
  }

   /**
   * 
   * @return billableAccountId
  **/
  @ApiModelProperty(value = "")
  public String getBillableAccountId() {
    return billableAccountId;
  }

  public void setBillableAccountId(String billableAccountId) {
    this.billableAccountId = billableAccountId;
  }

  public Workspace created(String created) {
    this.created = created;
    return this;
  }

   /**
   * 
   * @return created
  **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Workspace createdByInformation(WorkspaceUser createdByInformation) {
    this.createdByInformation = createdByInformation;
    return this;
  }

   /**
   * Get createdByInformation
   * @return createdByInformation
  **/
  @ApiModelProperty(value = "")
  public WorkspaceUser getCreatedByInformation() {
    return createdByInformation;
  }

  public void setCreatedByInformation(WorkspaceUser createdByInformation) {
    this.createdByInformation = createdByInformation;
  }

  public Workspace lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Utc date and time the comment was last updated (can only be done by creator.)
   * @return lastModified
  **/
  @ApiModelProperty(value = "Utc date and time the comment was last updated (can only be done by creator.)")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public Workspace lastModifiedByInformation(WorkspaceUser lastModifiedByInformation) {
    this.lastModifiedByInformation = lastModifiedByInformation;
    return this;
  }

   /**
   * Get lastModifiedByInformation
   * @return lastModifiedByInformation
  **/
  @ApiModelProperty(value = "")
  public WorkspaceUser getLastModifiedByInformation() {
    return lastModifiedByInformation;
  }

  public void setLastModifiedByInformation(WorkspaceUser lastModifiedByInformation) {
    this.lastModifiedByInformation = lastModifiedByInformation;
  }

  public Workspace status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Workspace workspaceBaseUrl(String workspaceBaseUrl) {
    this.workspaceBaseUrl = workspaceBaseUrl;
    return this;
  }

   /**
   * The relative URL that may be used to access the workspace.
   * @return workspaceBaseUrl
  **/
  @ApiModelProperty(value = "The relative URL that may be used to access the workspace.")
  public String getWorkspaceBaseUrl() {
    return workspaceBaseUrl;
  }

  public void setWorkspaceBaseUrl(String workspaceBaseUrl) {
    this.workspaceBaseUrl = workspaceBaseUrl;
  }

  public Workspace workspaceDescription(String workspaceDescription) {
    this.workspaceDescription = workspaceDescription;
    return this;
  }

   /**
   * Text describing the purpose of the workspace.
   * @return workspaceDescription
  **/
  @ApiModelProperty(value = "Text describing the purpose of the workspace.")
  public String getWorkspaceDescription() {
    return workspaceDescription;
  }

  public void setWorkspaceDescription(String workspaceDescription) {
    this.workspaceDescription = workspaceDescription;
  }

  public Workspace workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

   /**
   * The id of the workspace, always populated.
   * @return workspaceId
  **/
  @ApiModelProperty(value = "The id of the workspace, always populated.")
  public String getWorkspaceId() {
    return workspaceId;
  }

  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  public Workspace workspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
  }

   /**
   * The name of the workspace.
   * @return workspaceName
  **/
  @ApiModelProperty(value = "The name of the workspace.")
  public String getWorkspaceName() {
    return workspaceName;
  }

  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }

  public Workspace workspaceUri(String workspaceUri) {
    this.workspaceUri = workspaceUri;
    return this;
  }

   /**
   * The relative URI that may be used to access the workspace.
   * @return workspaceUri
  **/
  @ApiModelProperty(value = "The relative URI that may be used to access the workspace.")
  public String getWorkspaceUri() {
    return workspaceUri;
  }

  public void setWorkspaceUri(String workspaceUri) {
    this.workspaceUri = workspaceUri;
  }


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
        Objects.equals(this.created, workspace.created) &&
        Objects.equals(this.createdByInformation, workspace.createdByInformation) &&
        Objects.equals(this.lastModified, workspace.lastModified) &&
        Objects.equals(this.lastModifiedByInformation, workspace.lastModifiedByInformation) &&
        Objects.equals(this.status, workspace.status) &&
        Objects.equals(this.workspaceBaseUrl, workspace.workspaceBaseUrl) &&
        Objects.equals(this.workspaceDescription, workspace.workspaceDescription) &&
        Objects.equals(this.workspaceId, workspace.workspaceId) &&
        Objects.equals(this.workspaceName, workspace.workspaceName) &&
        Objects.equals(this.workspaceUri, workspace.workspaceUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableAccountId, created, createdByInformation, lastModified, lastModifiedByInformation, status, workspaceBaseUrl, workspaceDescription, workspaceId, workspaceName, workspaceUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
    
    sb.append("    billableAccountId: ").append(toIndentedString(billableAccountId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdByInformation: ").append(toIndentedString(createdByInformation)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedByInformation: ").append(toIndentedString(lastModifiedByInformation)).append("\n");
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

