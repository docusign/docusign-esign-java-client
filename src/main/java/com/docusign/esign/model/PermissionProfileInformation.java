package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.PermissionProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PermissionProfileInformation   {
  
  private java.util.List<PermissionProfile> permissionProfiles = new java.util.ArrayList<PermissionProfile>();

  
  /**
   * A complex type containing a collection of permission profiles.
   **/
  
  @ApiModelProperty(value = "A complex type containing a collection of permission profiles.")
  @JsonProperty("permissionProfiles")
  public java.util.List<PermissionProfile> getPermissionProfiles() {
    return permissionProfiles;
  }
  public void setPermissionProfiles(java.util.List<PermissionProfile> permissionProfiles) {
    this.permissionProfiles = permissionProfiles;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionProfileInformation permissionProfileInformation = (PermissionProfileInformation) o;

    return true && Objects.equals(permissionProfiles, permissionProfileInformation.permissionProfiles)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionProfiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionProfileInformation {\n");
    
    if (permissionProfiles != null)
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

