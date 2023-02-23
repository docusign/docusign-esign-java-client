package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NewUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Object representing a summary of data for new users..
 *
 */
@Schema(description = "Object representing a summary of data for new users.")

public class NewUsersSummary {
  @JsonProperty("newUsers")
  private java.util.List<NewUser> newUsers = null;

  /**
   * newUsers.
   *
   * @return NewUsersSummary
   **/
  public NewUsersSummary newUsers(java.util.List<NewUser> newUsers) {
    this.newUsers = newUsers;
    return this;
  }

  /**
   * addNewUsersItem.
   *
   * @return NewUsersSummary
   **/
  public NewUsersSummary addNewUsersItem(NewUser newUsersItem) {
    if (this.newUsers == null) {
      this.newUsers = new java.util.ArrayList<>();
    }
    this.newUsers.add(newUsersItem);
    return this;
  }

  /**
   * .
   * 
   * @return newUsers
   **/
  @Schema(description = "")
  public java.util.List<NewUser> getNewUsers() {
    return newUsers;
  }

  /**
   * setNewUsers.
   **/
  public void setNewUsers(java.util.List<NewUser> newUsers) {
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
    NewUsersSummary newUsersSummary = (NewUsersSummary) o;
    return Objects.equals(this.newUsers, newUsersSummary.newUsers);
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
    sb.append("class NewUsersSummary {\n");

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
