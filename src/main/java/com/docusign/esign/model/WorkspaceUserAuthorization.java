package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.WorkspaceUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Provides properties that describe user authorization to a workspace.
 */
@ApiModel(description = "Provides properties that describe user authorization to a workspace.")

public class WorkspaceUserAuthorization {
  @JsonProperty("canDelete")
  private String canDelete = null;

  @JsonProperty("canMove")
  private String canMove = null;

  @JsonProperty("canTransact")
  private String canTransact = null;

  @JsonProperty("canView")
  private String canView = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("createdById")
  private String createdById = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("modified")
  private String modified = null;

  @JsonProperty("modifiedById")
  private String modifiedById = null;

  @JsonProperty("workspaceUserId")
  private String workspaceUserId = null;

  @JsonProperty("workspaceUserInformation")
  private WorkspaceUser workspaceUserInformation = null;

  public WorkspaceUserAuthorization canDelete(String canDelete) {
    this.canDelete = canDelete;
    return this;
  }

   /**
   * 
   * @return canDelete
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(String canDelete) {
    this.canDelete = canDelete;
  }

  public WorkspaceUserAuthorization canMove(String canMove) {
    this.canMove = canMove;
    return this;
  }

   /**
   * 
   * @return canMove
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCanMove() {
    return canMove;
  }

  public void setCanMove(String canMove) {
    this.canMove = canMove;
  }

  public WorkspaceUserAuthorization canTransact(String canTransact) {
    this.canTransact = canTransact;
    return this;
  }

   /**
   * 
   * @return canTransact
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCanTransact() {
    return canTransact;
  }

  public void setCanTransact(String canTransact) {
    this.canTransact = canTransact;
  }

  public WorkspaceUserAuthorization canView(String canView) {
    this.canView = canView;
    return this;
  }

   /**
   * 
   * @return canView
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCanView() {
    return canView;
  }

  public void setCanView(String canView) {
    this.canView = canView;
  }

  public WorkspaceUserAuthorization created(String created) {
    this.created = created;
    return this;
  }

   /**
   * The UTC DateTime when the workspace user authorization was created.
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "The UTC DateTime when the workspace user authorization was created.")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public WorkspaceUserAuthorization createdById(String createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * 
   * @return createdById
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCreatedById() {
    return createdById;
  }

  public void setCreatedById(String createdById) {
    this.createdById = createdById;
  }

  public WorkspaceUserAuthorization errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public WorkspaceUserAuthorization modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * 
   * @return modified
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public WorkspaceUserAuthorization modifiedById(String modifiedById) {
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * 
   * @return modifiedById
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getModifiedById() {
    return modifiedById;
  }

  public void setModifiedById(String modifiedById) {
    this.modifiedById = modifiedById;
  }

  public WorkspaceUserAuthorization workspaceUserId(String workspaceUserId) {
    this.workspaceUserId = workspaceUserId;
    return this;
  }

   /**
   * 
   * @return workspaceUserId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWorkspaceUserId() {
    return workspaceUserId;
  }

  public void setWorkspaceUserId(String workspaceUserId) {
    this.workspaceUserId = workspaceUserId;
  }

  public WorkspaceUserAuthorization workspaceUserInformation(WorkspaceUser workspaceUserInformation) {
    this.workspaceUserInformation = workspaceUserInformation;
    return this;
  }

   /**
   * Get workspaceUserInformation
   * @return workspaceUserInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public WorkspaceUser getWorkspaceUserInformation() {
    return workspaceUserInformation;
  }

  public void setWorkspaceUserInformation(WorkspaceUser workspaceUserInformation) {
    this.workspaceUserInformation = workspaceUserInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceUserAuthorization workspaceUserAuthorization = (WorkspaceUserAuthorization) o;
    return Objects.equals(this.canDelete, workspaceUserAuthorization.canDelete) &&
        Objects.equals(this.canMove, workspaceUserAuthorization.canMove) &&
        Objects.equals(this.canTransact, workspaceUserAuthorization.canTransact) &&
        Objects.equals(this.canView, workspaceUserAuthorization.canView) &&
        Objects.equals(this.created, workspaceUserAuthorization.created) &&
        Objects.equals(this.createdById, workspaceUserAuthorization.createdById) &&
        Objects.equals(this.errorDetails, workspaceUserAuthorization.errorDetails) &&
        Objects.equals(this.modified, workspaceUserAuthorization.modified) &&
        Objects.equals(this.modifiedById, workspaceUserAuthorization.modifiedById) &&
        Objects.equals(this.workspaceUserId, workspaceUserAuthorization.workspaceUserId) &&
        Objects.equals(this.workspaceUserInformation, workspaceUserAuthorization.workspaceUserInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDelete, canMove, canTransact, canView, created, createdById, errorDetails, modified, modifiedById, workspaceUserId, workspaceUserInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceUserAuthorization {\n");
    
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canMove: ").append(toIndentedString(canMove)).append("\n");
    sb.append("    canTransact: ").append(toIndentedString(canTransact)).append("\n");
    sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    workspaceUserId: ").append(toIndentedString(workspaceUserId)).append("\n");
    sb.append("    workspaceUserInformation: ").append(toIndentedString(workspaceUserInformation)).append("\n");
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

