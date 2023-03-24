package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * NewUsersDefinition.
 *
 */

public class NewUsersDefinition {
  @JsonProperty("newUsers")
  private java.util.List<UserInformation> newUsers = null;


  /**
   * newUsers.
   *
   * @return NewUsersDefinition
   **/
  public NewUsersDefinition newUsers(java.util.List<UserInformation> newUsers) {
    this.newUsers = newUsers;
    return this;
  }
  
  /**
   * addNewUsersItem.
   *
   * @return NewUsersDefinition
   **/
  public NewUsersDefinition addNewUsersItem(UserInformation newUsersItem) {
    if (this.newUsers == null) {
      this.newUsers = new java.util.ArrayList<>();
    }
    this.newUsers.add(newUsersItem);
    return this;
  }

  /**
   * .
   * @return newUsers
   **/
  @Schema(description = "")
  public java.util.List<UserInformation> getNewUsers() {
    return newUsers;
  }

  /**
   * setNewUsers.
   **/
  public void setNewUsers(java.util.List<UserInformation> newUsers) {
    this.newUsers = newUsers;
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
    NewUsersDefinition newUsersDefinition = (NewUsersDefinition) o;
    return Objects.equals(this.newUsers, newUsersDefinition.newUsers);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(newUsers);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUsersDefinition {\n");
    
    sb.append("    newUsers: ").append(toIndentedString(newUsers)).append("\n");
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

