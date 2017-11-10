package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A workspaceUser representing the user. This property is only returned in response to user specific GET call. 
 */
@ApiModel(description = "A workspaceUser representing the user. This property is only returned in response to user specific GET call. ")

public class WorkspaceUser {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("activeSince")
  private String activeSince = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("createdById")
  private String createdById = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("lastModifiedById")
  private String lastModifiedById = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("workspaceId")
  private String workspaceId = null;

  @JsonProperty("workspaceUserBaseUrl")
  private String workspaceUserBaseUrl = null;

  @JsonProperty("workspaceUserId")
  private String workspaceUserId = null;

  public WorkspaceUser accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID associated with the envelope.
   * @return accountId
  **/
  @ApiModelProperty(example = "null", value = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public WorkspaceUser accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * The name of the account that the workspace user belongs to.
   * @return accountName
  **/
  @ApiModelProperty(example = "null", value = "The name of the account that the workspace user belongs to.")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public WorkspaceUser activeSince(String activeSince) {
    this.activeSince = activeSince;
    return this;
  }

   /**
   * 
   * @return activeSince
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getActiveSince() {
    return activeSince;
  }

  public void setActiveSince(String activeSince) {
    this.activeSince = activeSince;
  }

  public WorkspaceUser created(String created) {
    this.created = created;
    return this;
  }

   /**
   * The UTC DateTime when the workspace user was created.
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "The UTC DateTime when the workspace user was created.")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public WorkspaceUser createdById(String createdById) {
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

  public WorkspaceUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public WorkspaceUser errorDetails(ErrorDetails errorDetails) {
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

  public WorkspaceUser lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Utc date and time the comment was last updated (can only be done by creator.)
   * @return lastModified
  **/
  @ApiModelProperty(example = "null", value = "Utc date and time the comment was last updated (can only be done by creator.)")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public WorkspaceUser lastModifiedById(String lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
    return this;
  }

   /**
   * 
   * @return lastModifiedById
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastModifiedById() {
    return lastModifiedById;
  }

  public void setLastModifiedById(String lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
  }

  public WorkspaceUser status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public WorkspaceUser type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the user. Valid values: type_owner, type_participant.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of the user. Valid values: type_owner, type_participant.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public WorkspaceUser userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public WorkspaceUser userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public WorkspaceUser workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

   /**
   * 
   * @return workspaceId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWorkspaceId() {
    return workspaceId;
  }

  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  public WorkspaceUser workspaceUserBaseUrl(String workspaceUserBaseUrl) {
    this.workspaceUserBaseUrl = workspaceUserBaseUrl;
    return this;
  }

   /**
   * The relative URI that may be used to access a workspace user.
   * @return workspaceUserBaseUrl
  **/
  @ApiModelProperty(example = "null", value = "The relative URI that may be used to access a workspace user.")
  public String getWorkspaceUserBaseUrl() {
    return workspaceUserBaseUrl;
  }

  public void setWorkspaceUserBaseUrl(String workspaceUserBaseUrl) {
    this.workspaceUserBaseUrl = workspaceUserBaseUrl;
  }

  public WorkspaceUser workspaceUserId(String workspaceUserId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceUser workspaceUser = (WorkspaceUser) o;
    return Objects.equals(this.accountId, workspaceUser.accountId) &&
        Objects.equals(this.accountName, workspaceUser.accountName) &&
        Objects.equals(this.activeSince, workspaceUser.activeSince) &&
        Objects.equals(this.created, workspaceUser.created) &&
        Objects.equals(this.createdById, workspaceUser.createdById) &&
        Objects.equals(this.email, workspaceUser.email) &&
        Objects.equals(this.errorDetails, workspaceUser.errorDetails) &&
        Objects.equals(this.lastModified, workspaceUser.lastModified) &&
        Objects.equals(this.lastModifiedById, workspaceUser.lastModifiedById) &&
        Objects.equals(this.status, workspaceUser.status) &&
        Objects.equals(this.type, workspaceUser.type) &&
        Objects.equals(this.userId, workspaceUser.userId) &&
        Objects.equals(this.userName, workspaceUser.userName) &&
        Objects.equals(this.workspaceId, workspaceUser.workspaceId) &&
        Objects.equals(this.workspaceUserBaseUrl, workspaceUser.workspaceUserBaseUrl) &&
        Objects.equals(this.workspaceUserId, workspaceUser.workspaceUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, activeSince, created, createdById, email, errorDetails, lastModified, lastModifiedById, status, type, userId, userName, workspaceId, workspaceUserBaseUrl, workspaceUserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceUser {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    activeSince: ").append(toIndentedString(activeSince)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedById: ").append(toIndentedString(lastModifiedById)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    workspaceUserBaseUrl: ").append(toIndentedString(workspaceUserBaseUrl)).append("\n");
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

