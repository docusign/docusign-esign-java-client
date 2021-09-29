package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.WorkspaceUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Provides properties that describe user authorization to a workspace..
 *
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


  /**
   * canDelete.
   *
   * @return WorkspaceUserAuthorization
   **/
  public WorkspaceUserAuthorization canDelete(String canDelete) {
    this.canDelete = canDelete;
    return this;
  }

  /**
   * .
   * @return canDelete
   **/
  @ApiModelProperty(value = "")
  public String getCanDelete() {
    return canDelete;
  }

  /**
   * setCanDelete.
   **/
  public void setCanDelete(String canDelete) {
    this.canDelete = canDelete;
  }


  /**
   * canMove.
   *
   * @return WorkspaceUserAuthorization
   **/
  public WorkspaceUserAuthorization canMove(String canMove) {
    this.canMove = canMove;
    return this;
  }

  /**
   * .
   * @return canMove
   **/
  @ApiModelProperty(value = "")
  public String getCanMove() {
    return canMove;
  }

  /**
   * setCanMove.
   **/
  public void setCanMove(String canMove) {
    this.canMove = canMove;
  }


  /**
   * canTransact.
   *
   * @return WorkspaceUserAuthorization
   **/
  public WorkspaceUserAuthorization canTransact(String canTransact) {
    this.canTransact = canTransact;
    return this;
  }

  /**
   * .
   * @return canTransact
   **/
  @ApiModelProperty(value = "")
  public String getCanTransact() {
    return canTransact;
  }

  /**
   * setCanTransact.
   **/
  public void setCanTransact(String canTransact) {
    this.canTransact = canTransact;
  }


  /**
   * canView.
   *
   * @return WorkspaceUserAuthorization
   **/
  public WorkspaceUserAuthorization canView(String canView) {
    this.canView = canView;
    return this;
  }

  /**
   * .
   * @return canView
   **/
  @ApiModelProperty(value = "")
  public String getCanView() {
    return canView;
  }

  /**
   * setCanView.
   **/
  public void setCanView(String canView) {
    this.canView = canView;
  }


  /**
   * created.
   *
   * @return WorkspaceUserAuthorization
   **/
  public WorkspaceUserAuthorization created(String created) {
    this.created = created;
    return this;
  }

  /**
   * The UTC DateTime when the workspace user authorization was created..
   * @return created
   **/
  @ApiModelProperty(value = "The UTC DateTime when the workspace user authorization was created.")
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
   * createdById.
   *
   * @return WorkspaceUserAuthorization
   **/
  public WorkspaceUserAuthorization createdById(String createdById) {
    this.createdById = createdById;
    return this;
  }

  /**
   * .
   * @return createdById
   **/
  @ApiModelProperty(value = "")
  public String getCreatedById() {
    return createdById;
  }

  /**
   * setCreatedById.
   **/
  public void setCreatedById(String createdById) {
    this.createdById = createdById;
  }


  /**
   * errorDetails.
   *
   * @return WorkspaceUserAuthorization
   **/
  public WorkspaceUserAuthorization errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * modified.
   *
   * @return WorkspaceUserAuthorization
   **/
  public WorkspaceUserAuthorization modified(String modified) {
    this.modified = modified;
    return this;
  }

  /**
   * .
   * @return modified
   **/
  @ApiModelProperty(value = "")
  public String getModified() {
    return modified;
  }

  /**
   * setModified.
   **/
  public void setModified(String modified) {
    this.modified = modified;
  }


  /**
   * modifiedById.
   *
   * @return WorkspaceUserAuthorization
   **/
  public WorkspaceUserAuthorization modifiedById(String modifiedById) {
    this.modifiedById = modifiedById;
    return this;
  }

  /**
   * .
   * @return modifiedById
   **/
  @ApiModelProperty(value = "")
  public String getModifiedById() {
    return modifiedById;
  }

  /**
   * setModifiedById.
   **/
  public void setModifiedById(String modifiedById) {
    this.modifiedById = modifiedById;
  }


  /**
   * workspaceUserId.
   *
   * @return WorkspaceUserAuthorization
   **/
  public WorkspaceUserAuthorization workspaceUserId(String workspaceUserId) {
    this.workspaceUserId = workspaceUserId;
    return this;
  }

  /**
   * .
   * @return workspaceUserId
   **/
  @ApiModelProperty(value = "")
  public String getWorkspaceUserId() {
    return workspaceUserId;
  }

  /**
   * setWorkspaceUserId.
   **/
  public void setWorkspaceUserId(String workspaceUserId) {
    this.workspaceUserId = workspaceUserId;
  }


  /**
   * workspaceUserInformation.
   *
   * @return WorkspaceUserAuthorization
   **/
  public WorkspaceUserAuthorization workspaceUserInformation(WorkspaceUser workspaceUserInformation) {
    this.workspaceUserInformation = workspaceUserInformation;
    return this;
  }

  /**
   * Get workspaceUserInformation.
   * @return workspaceUserInformation
   **/
  @ApiModelProperty(value = "")
  public WorkspaceUser getWorkspaceUserInformation() {
    return workspaceUserInformation;
  }

  /**
   * setWorkspaceUserInformation.
   **/
  public void setWorkspaceUserInformation(WorkspaceUser workspaceUserInformation) {
    this.workspaceUserInformation = workspaceUserInformation;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(canDelete, canMove, canTransact, canView, created, createdById, errorDetails, modified, modifiedById, workspaceUserId, workspaceUserInformation);
  }


  /**
   * Converts the given object to string.
   */
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

