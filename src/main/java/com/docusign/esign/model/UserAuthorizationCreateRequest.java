package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AuthorizationUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * UserAuthorizationCreateRequest.
 *
 */

public class UserAuthorizationCreateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("agentUser")
  private AuthorizationUser agentUser = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("permission")
  private String permission = null;

  @JsonProperty("startDate")
  private String startDate = null;


  /**
   * agentUser.
   *
   * @return UserAuthorizationCreateRequest
   **/
  public UserAuthorizationCreateRequest agentUser(AuthorizationUser agentUser) {
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
   * endDate.
   *
   * @return UserAuthorizationCreateRequest
   **/
  public UserAuthorizationCreateRequest endDate(String endDate) {
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
   * permission.
   *
   * @return UserAuthorizationCreateRequest
   **/
  public UserAuthorizationCreateRequest permission(String permission) {
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
   * startDate.
   *
   * @return UserAuthorizationCreateRequest
   **/
  public UserAuthorizationCreateRequest startDate(String startDate) {
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
    UserAuthorizationCreateRequest userAuthorizationCreateRequest = (UserAuthorizationCreateRequest) o;
    return Objects.equals(this.agentUser, userAuthorizationCreateRequest.agentUser) &&
        Objects.equals(this.endDate, userAuthorizationCreateRequest.endDate) &&
        Objects.equals(this.permission, userAuthorizationCreateRequest.permission) &&
        Objects.equals(this.startDate, userAuthorizationCreateRequest.startDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(agentUser, endDate, permission, startDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorizationCreateRequest {\n");
    
    sb.append("    agentUser: ").append(toIndentedString(agentUser)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

