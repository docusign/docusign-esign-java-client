package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PermissionProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PermissionProfileInformation.
 *
 */

public class PermissionProfileInformation {
  @JsonProperty("permissionProfiles")
  private java.util.List<PermissionProfile> permissionProfiles = null;


  /**
   * permissionProfiles.
   *
   * @return PermissionProfileInformation
   **/
  public PermissionProfileInformation permissionProfiles(java.util.List<PermissionProfile> permissionProfiles) {
    this.permissionProfiles = permissionProfiles;
    return this;
  }
  
  /**
   * addPermissionProfilesItem.
   *
   * @return PermissionProfileInformation
   **/
  public PermissionProfileInformation addPermissionProfilesItem(PermissionProfile permissionProfilesItem) {
    if (this.permissionProfiles == null) {
      this.permissionProfiles = new java.util.ArrayList<PermissionProfile>();
    }
    this.permissionProfiles.add(permissionProfilesItem);
    return this;
  }

  /**
   * A complex type containing a collection of permission profiles..
   * @return permissionProfiles
   **/
  @ApiModelProperty(value = "A complex type containing a collection of permission profiles.")
  public java.util.List<PermissionProfile> getPermissionProfiles() {
    return permissionProfiles;
  }

  /**
   * setPermissionProfiles.
   **/
  public void setPermissionProfiles(java.util.List<PermissionProfile> permissionProfiles) {
    this.permissionProfiles = permissionProfiles;
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
    PermissionProfileInformation permissionProfileInformation = (PermissionProfileInformation) o;
    return Objects.equals(this.permissionProfiles, permissionProfileInformation.permissionProfiles);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(permissionProfiles);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionProfileInformation {\n");
    
    sb.append("    permissionProfiles: ").append(toIndentedString(permissionProfiles)).append("\n");
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

