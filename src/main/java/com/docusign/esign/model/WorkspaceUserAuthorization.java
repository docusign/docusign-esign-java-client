package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.WorkspaceUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Provides properties that describe user authorization to a workspace.
 **/

@ApiModel(description = "Provides properties that describe user authorization to a workspace.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-02T23:49:11.300-08:00")
public class WorkspaceUserAuthorization   {
  
  private String canDelete = null;
  private String canMove = null;
  private String canTransact = null;
  private String canView = null;
  private String created = null;
  private String createdById = null;
  private ErrorDetails errorDetails = null;
  private String modified = null;
  private String modifiedById = null;
  private String workspaceUserId = null;
  private WorkspaceUser workspaceUserInformation = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canDelete")
  public String getCanDelete() {
    return canDelete;
  }
  public void setCanDelete(String canDelete) {
    this.canDelete = canDelete;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canMove")
  public String getCanMove() {
    return canMove;
  }
  public void setCanMove(String canMove) {
    this.canMove = canMove;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canTransact")
  public String getCanTransact() {
    return canTransact;
  }
  public void setCanTransact(String canTransact) {
    this.canTransact = canTransact;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canView")
  public String getCanView() {
    return canView;
  }
  public void setCanView(String canView) {
    this.canView = canView;
  }

  
  /**
   * The UTC DateTime when the workspace user authorization was created.
   **/
  
  @ApiModelProperty(value = "The UTC DateTime when the workspace user authorization was created.")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdById")
  public String getCreatedById() {
    return createdById;
  }
  public void setCreatedById(String createdById) {
    this.createdById = createdById;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modified")
  public String getModified() {
    return modified;
  }
  public void setModified(String modified) {
    this.modified = modified;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifiedById")
  public String getModifiedById() {
    return modifiedById;
  }
  public void setModifiedById(String modifiedById) {
    this.modifiedById = modifiedById;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("workspaceUserId")
  public String getWorkspaceUserId() {
    return workspaceUserId;
  }
  public void setWorkspaceUserId(String workspaceUserId) {
    this.workspaceUserId = workspaceUserId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("workspaceUserInformation")
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

    return true && Objects.equals(canDelete, workspaceUserAuthorization.canDelete) &&
        Objects.equals(canMove, workspaceUserAuthorization.canMove) &&
        Objects.equals(canTransact, workspaceUserAuthorization.canTransact) &&
        Objects.equals(canView, workspaceUserAuthorization.canView) &&
        Objects.equals(created, workspaceUserAuthorization.created) &&
        Objects.equals(createdById, workspaceUserAuthorization.createdById) &&
        Objects.equals(errorDetails, workspaceUserAuthorization.errorDetails) &&
        Objects.equals(modified, workspaceUserAuthorization.modified) &&
        Objects.equals(modifiedById, workspaceUserAuthorization.modifiedById) &&
        Objects.equals(workspaceUserId, workspaceUserAuthorization.workspaceUserId) &&
        Objects.equals(workspaceUserInformation, workspaceUserAuthorization.workspaceUserInformation)
    ;
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

