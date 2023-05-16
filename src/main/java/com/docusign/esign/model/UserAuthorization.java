package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AuthorizationUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserAuthorization.
 *
 */

public class UserAuthorization {
  @JsonProperty("agentUser")
  private AuthorizationUser agentUser = null;

  @JsonProperty("authorizationId")
  private String authorizationId = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("modified")
  private String modified = null;

  @JsonProperty("modifiedBy")
  private String modifiedBy = null;

  @JsonProperty("permission")
  private String permission = null;

  @JsonProperty("principalUser")
  private AuthorizationUser principalUser = null;

  @JsonProperty("startDate")
  private String startDate = null;


  /**
   * agentUser.
   *
   * @return UserAuthorization
   **/
  public UserAuthorization agentUser(AuthorizationUser agentUser) {
    this.agentUser = agentUser;
    return this;
  }

  /**
   * .
   * @return agentUser
   **/
  @Schema(description = "")
  public AuthorizationUser getAgentUser() {
    return agentUser;
  }

  /**
   * setAgentUser.
   **/
  public void setAgentUser(AuthorizationUser agentUser) {
    this.agentUser = agentUser;
  }


  /**
   * authorizationId.
   *
   * @return UserAuthorization
   **/
  public UserAuthorization authorizationId(String authorizationId) {
    this.authorizationId = authorizationId;
    return this;
  }

  /**
   * .
   * @return authorizationId
   **/
  @Schema(description = "")
  public String getAuthorizationId() {
    return authorizationId;
  }

  /**
   * setAuthorizationId.
   **/
  public void setAuthorizationId(String authorizationId) {
    this.authorizationId = authorizationId;
  }


  /**
   * created.
   *
   * @return UserAuthorization
   **/
  public UserAuthorization created(String created) {
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
   * createdBy.
   *
   * @return UserAuthorization
   **/
  public UserAuthorization createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * .
   * @return createdBy
   **/
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * setCreatedBy.
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * endDate.
   *
   * @return UserAuthorization
   **/
  public UserAuthorization endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * .
   * @return endDate
   **/
  @Schema(description = "")
  public String getEndDate() {
    return endDate;
  }

  /**
   * setEndDate.
   **/
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  /**
   * modified.
   *
   * @return UserAuthorization
   **/
  public UserAuthorization modified(String modified) {
    this.modified = modified;
    return this;
  }

  /**
   * .
   * @return modified
   **/
  @Schema(description = "")
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
   * modifiedBy.
   *
   * @return UserAuthorization
   **/
  public UserAuthorization modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * .
   * @return modifiedBy
   **/
  @Schema(description = "")
  public String getModifiedBy() {
    return modifiedBy;
  }

  /**
   * setModifiedBy.
   **/
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * permission.
   *
   * @return UserAuthorization
   **/
  public UserAuthorization permission(String permission) {
    this.permission = permission;
    return this;
  }

  /**
   * .
   * @return permission
   **/
  @Schema(description = "")
  public String getPermission() {
    return permission;
  }

  /**
   * setPermission.
   **/
  public void setPermission(String permission) {
    this.permission = permission;
  }


  /**
   * principalUser.
   *
   * @return UserAuthorization
   **/
  public UserAuthorization principalUser(AuthorizationUser principalUser) {
    this.principalUser = principalUser;
    return this;
  }

  /**
   * .
   * @return principalUser
   **/
  @Schema(description = "")
  public AuthorizationUser getPrincipalUser() {
    return principalUser;
  }

  /**
   * setPrincipalUser.
   **/
  public void setPrincipalUser(AuthorizationUser principalUser) {
    this.principalUser = principalUser;
  }


  /**
   * startDate.
   *
   * @return UserAuthorization
   **/
  public UserAuthorization startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * .
   * @return startDate
   **/
  @Schema(description = "")
  public String getStartDate() {
    return startDate;
  }

  /**
   * setStartDate.
   **/
  public void setStartDate(String startDate) {
    this.startDate = startDate;
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
    UserAuthorization userAuthorization = (UserAuthorization) o;
    return Objects.equals(this.agentUser, userAuthorization.agentUser) &&
        Objects.equals(this.authorizationId, userAuthorization.authorizationId) &&
        Objects.equals(this.created, userAuthorization.created) &&
        Objects.equals(this.createdBy, userAuthorization.createdBy) &&
        Objects.equals(this.endDate, userAuthorization.endDate) &&
        Objects.equals(this.modified, userAuthorization.modified) &&
        Objects.equals(this.modifiedBy, userAuthorization.modifiedBy) &&
        Objects.equals(this.permission, userAuthorization.permission) &&
        Objects.equals(this.principalUser, userAuthorization.principalUser) &&
        Objects.equals(this.startDate, userAuthorization.startDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(agentUser, authorizationId, created, createdBy, endDate, modified, modifiedBy, permission, principalUser, startDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorization {\n");
    
    sb.append("    agentUser: ").append(toIndentedString(agentUser)).append("\n");
    sb.append("    authorizationId: ").append(toIndentedString(authorizationId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    principalUser: ").append(toIndentedString(principalUser)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

