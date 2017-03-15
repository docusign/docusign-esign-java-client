package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.WorkspaceUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Provides properties that describe a workspace.
 **/

@ApiModel(description = "Provides properties that describe a workspace.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Workspace   {
  
  private String billableAccountId = null;
  private String created = null;
  private WorkspaceUser createdByInformation = null;
  private String lastModified = null;
  private WorkspaceUser lastModifiedByInformation = null;
  private String status = null;
  private String workspaceBaseUrl = null;
  private String workspaceDescription = null;
  private String workspaceId = null;
  private String workspaceName = null;
  private String workspaceUri = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableAccountId")
  public String getBillableAccountId() {
    return billableAccountId;
  }
  public void setBillableAccountId(String billableAccountId) {
    this.billableAccountId = billableAccountId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdByInformation")
  public WorkspaceUser getCreatedByInformation() {
    return createdByInformation;
  }
  public void setCreatedByInformation(WorkspaceUser createdByInformation) {
    this.createdByInformation = createdByInformation;
  }

  
  /**
   * Utc date and time the comment was last updated (can only be done by creator.)
   **/
  
  @ApiModelProperty(value = "Utc date and time the comment was last updated (can only be done by creator.)")
  @JsonProperty("lastModified")
  public String getLastModified() {
    return lastModified;
  }
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastModifiedByInformation")
  public WorkspaceUser getLastModifiedByInformation() {
    return lastModifiedByInformation;
  }
  public void setLastModifiedByInformation(WorkspaceUser lastModifiedByInformation) {
    this.lastModifiedByInformation = lastModifiedByInformation;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * The relative URL that may be used to access the workspace.
   **/
  
  @ApiModelProperty(value = "The relative URL that may be used to access the workspace.")
  @JsonProperty("workspaceBaseUrl")
  public String getWorkspaceBaseUrl() {
    return workspaceBaseUrl;
  }
  public void setWorkspaceBaseUrl(String workspaceBaseUrl) {
    this.workspaceBaseUrl = workspaceBaseUrl;
  }

  
  /**
   * Text describing the purpose of the workspace.
   **/
  
  @ApiModelProperty(value = "Text describing the purpose of the workspace.")
  @JsonProperty("workspaceDescription")
  public String getWorkspaceDescription() {
    return workspaceDescription;
  }
  public void setWorkspaceDescription(String workspaceDescription) {
    this.workspaceDescription = workspaceDescription;
  }

  
  /**
   * The id of the workspace, always populated.
   **/
  
  @ApiModelProperty(value = "The id of the workspace, always populated.")
  @JsonProperty("workspaceId")
  public String getWorkspaceId() {
    return workspaceId;
  }
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  
  /**
   * The name of the workspace.
   **/
  
  @ApiModelProperty(value = "The name of the workspace.")
  @JsonProperty("workspaceName")
  public String getWorkspaceName() {
    return workspaceName;
  }
  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }

  
  /**
   * The relative URI that may be used to access the workspace.
   **/
  
  @ApiModelProperty(value = "The relative URI that may be used to access the workspace.")
  @JsonProperty("workspaceUri")
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

    return true && Objects.equals(billableAccountId, workspace.billableAccountId) &&
        Objects.equals(created, workspace.created) &&
        Objects.equals(createdByInformation, workspace.createdByInformation) &&
        Objects.equals(lastModified, workspace.lastModified) &&
        Objects.equals(lastModifiedByInformation, workspace.lastModifiedByInformation) &&
        Objects.equals(status, workspace.status) &&
        Objects.equals(workspaceBaseUrl, workspace.workspaceBaseUrl) &&
        Objects.equals(workspaceDescription, workspace.workspaceDescription) &&
        Objects.equals(workspaceId, workspace.workspaceId) &&
        Objects.equals(workspaceName, workspace.workspaceName) &&
        Objects.equals(workspaceUri, workspace.workspaceUri)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableAccountId, created, createdByInformation, lastModified, lastModifiedByInformation, status, workspaceBaseUrl, workspaceDescription, workspaceId, workspaceName, workspaceUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
    
    if (billableAccountId != null)
      sb.append("    billableAccountId: ").append(toIndentedString(billableAccountId)).append("\n");
    if (created != null)
      sb.append("    created: ").append(toIndentedString(created)).append("\n");
    if (createdByInformation != null)
      sb.append("    createdByInformation: ").append(toIndentedString(createdByInformation)).append("\n");
    if (lastModified != null)
      sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    if (lastModifiedByInformation != null)
      sb.append("    lastModifiedByInformation: ").append(toIndentedString(lastModifiedByInformation)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (workspaceBaseUrl != null)
      sb.append("    workspaceBaseUrl: ").append(toIndentedString(workspaceBaseUrl)).append("\n");
    if (workspaceDescription != null)
      sb.append("    workspaceDescription: ").append(toIndentedString(workspaceDescription)).append("\n");
    if (workspaceId != null)
      sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    if (workspaceName != null)
      sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    if (workspaceUri != null)
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

