package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A workspaceUser representing the user. This property is only returned in response to user specific GET call.
 **/

@ApiModel(description = "A workspaceUser representing the user. This property is only returned in response to user specific GET call.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class WorkspaceUser   {
  
  private String accountId = null;
  private String accountName = null;
  private String activeSince = null;
  private String created = null;
  private String createdById = null;
  private String email = null;
  private ErrorDetails errorDetails = null;
  private String lastModified = null;
  private String lastModifiedById = null;
  private String status = null;
  private String type = null;
  private String userId = null;
  private String userName = null;
  private String workspaceId = null;
  private String workspaceUserBaseUrl = null;
  private String workspaceUserId = null;

  
  /**
   * The account ID associated with the envelope.
   **/
  
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  
  /**
   * The name of the account that the workspace user belongs to.
   **/
  
  @ApiModelProperty(value = "The name of the account that the workspace user belongs to.")
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("activeSince")
  public String getActiveSince() {
    return activeSince;
  }
  public void setActiveSince(String activeSince) {
    this.activeSince = activeSince;
  }

  
  /**
   * The UTC DateTime when the workspace user was created.
   **/
  
  @ApiModelProperty(value = "The UTC DateTime when the workspace user was created.")
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastModifiedById")
  public String getLastModifiedById() {
    return lastModifiedById;
  }
  public void setLastModifiedById(String lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
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
   * Type of the user. Valid values: type_owner, type_participant.
   **/
  
  @ApiModelProperty(value = "Type of the user. Valid values: type_owner, type_participant.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("workspaceId")
  public String getWorkspaceId() {
    return workspaceId;
  }
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  
  /**
   * The relative URI that may be used to access a workspace user.
   **/
  
  @ApiModelProperty(value = "The relative URI that may be used to access a workspace user.")
  @JsonProperty("workspaceUserBaseUrl")
  public String getWorkspaceUserBaseUrl() {
    return workspaceUserBaseUrl;
  }
  public void setWorkspaceUserBaseUrl(String workspaceUserBaseUrl) {
    this.workspaceUserBaseUrl = workspaceUserBaseUrl;
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceUser workspaceUser = (WorkspaceUser) o;

    return true && Objects.equals(accountId, workspaceUser.accountId) &&
        Objects.equals(accountName, workspaceUser.accountName) &&
        Objects.equals(activeSince, workspaceUser.activeSince) &&
        Objects.equals(created, workspaceUser.created) &&
        Objects.equals(createdById, workspaceUser.createdById) &&
        Objects.equals(email, workspaceUser.email) &&
        Objects.equals(errorDetails, workspaceUser.errorDetails) &&
        Objects.equals(lastModified, workspaceUser.lastModified) &&
        Objects.equals(lastModifiedById, workspaceUser.lastModifiedById) &&
        Objects.equals(status, workspaceUser.status) &&
        Objects.equals(type, workspaceUser.type) &&
        Objects.equals(userId, workspaceUser.userId) &&
        Objects.equals(userName, workspaceUser.userName) &&
        Objects.equals(workspaceId, workspaceUser.workspaceId) &&
        Objects.equals(workspaceUserBaseUrl, workspaceUser.workspaceUserBaseUrl) &&
        Objects.equals(workspaceUserId, workspaceUser.workspaceUserId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, activeSince, created, createdById, email, errorDetails, lastModified, lastModifiedById, status, type, userId, userName, workspaceId, workspaceUserBaseUrl, workspaceUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceUser {\n");
    
    if (accountId != null)
      sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    if (accountName != null)
      sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    if (activeSince != null)
      sb.append("    activeSince: ").append(toIndentedString(activeSince)).append("\n");
    if (created != null)
      sb.append("    created: ").append(toIndentedString(created)).append("\n");
    if (createdById != null)
      sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (lastModified != null)
      sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    if (lastModifiedById != null)
      sb.append("    lastModifiedById: ").append(toIndentedString(lastModifiedById)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (type != null)
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (userId != null)
      sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    if (userName != null)
      sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    if (workspaceId != null)
      sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    if (workspaceUserBaseUrl != null)
      sb.append("    workspaceUserBaseUrl: ").append(toIndentedString(workspaceUserBaseUrl)).append("\n");
    if (workspaceUserId != null)
      sb.append("    workspaceUserId: ").append(toIndentedString(workspaceUserId)).append("\n");
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

