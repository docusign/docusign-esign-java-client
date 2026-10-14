package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * EnvelopesSharePermissionResponse.
 *
 */

public class EnvelopesSharePermissionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("permission")
  private String permission = null;


  /**
   * permission.
   *
   * @return EnvelopesSharePermissionResponse
   **/
  public EnvelopesSharePermissionResponse permission(String permission) {
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
    EnvelopesSharePermissionResponse envelopesSharePermissionResponse = (EnvelopesSharePermissionResponse) o;
    return Objects.equals(this.permission, envelopesSharePermissionResponse.permission);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(permission);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopesSharePermissionResponse {\n");
    
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

