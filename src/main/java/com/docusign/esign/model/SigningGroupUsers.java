package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SigningGroupUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SigningGroupUsers
 */

public class SigningGroupUsers {
  @JsonProperty("users")
  private java.util.List<SigningGroupUser> users = null;

  public SigningGroupUsers users(java.util.List<SigningGroupUser> users) {
    this.users = users;
    return this;
  }

  public SigningGroupUsers addUsersItem(SigningGroupUser usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<SigningGroupUser>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * 
   * @return users
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SigningGroupUser> getUsers() {
    return users;
  }

  public void setUsers(java.util.List<SigningGroupUser> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningGroupUsers signingGroupUsers = (SigningGroupUsers) o;
    return Objects.equals(this.users, signingGroupUsers.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningGroupUsers {\n");
    
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

