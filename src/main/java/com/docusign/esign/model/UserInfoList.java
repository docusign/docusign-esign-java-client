package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * UserInfoList.
 *
 */

public class UserInfoList implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("users")
  private java.util.List<UserInfo> users = null;


  /**
   * users.
   *
   * @return UserInfoList
   **/
  public UserInfoList users(java.util.List<UserInfo> users) {
    this.users = users;
    return this;
  }
  
  /**
   * addUsersItem.
   *
   * @return UserInfoList
   **/
  public UserInfoList addUsersItem(UserInfo usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * .
   * @return users
   **/
  @Schema(description = "")
  public java.util.List<UserInfo> getUsers() {
    return users;
  }

  /**
   * setUsers.
   **/
  public void setUsers(java.util.List<UserInfo> users) {
    this.users = users;
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
    UserInfoList userInfoList = (UserInfoList) o;
    return Objects.equals(this.users, userInfoList.users);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(users);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoList {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

