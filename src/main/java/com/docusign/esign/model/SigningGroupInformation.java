package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SigningGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SigningGroupInformation.
 *
 */

public class SigningGroupInformation {
  @JsonProperty("groups")
  private java.util.List<SigningGroup> groups = null;


  /**
   * groups.
   *
   * @return SigningGroupInformation
   **/
  public SigningGroupInformation groups(java.util.List<SigningGroup> groups) {
    this.groups = groups;
    return this;
  }
  
  /**
   * addGroupsItem.
   *
   * @return SigningGroupInformation
   **/
  public SigningGroupInformation addGroupsItem(SigningGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * A collection group objects containing information about the groups returned..
   * @return groups
   **/
  @ApiModelProperty(value = "A collection group objects containing information about the groups returned.")
  public java.util.List<SigningGroup> getGroups() {
    return groups;
  }

  /**
   * setGroups.
   **/
  public void setGroups(java.util.List<SigningGroup> groups) {
    this.groups = groups;
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
    SigningGroupInformation signingGroupInformation = (SigningGroupInformation) o;
    return Objects.equals(this.groups, signingGroupInformation.groups);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningGroupInformation {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

