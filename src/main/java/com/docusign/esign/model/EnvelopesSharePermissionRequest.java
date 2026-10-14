package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * EnvelopesSharePermissionRequest.
 *
 */

public class EnvelopesSharePermissionRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("customMessage")
  private String customMessage = null;

  @JsonProperty("permission")
  private String permission = null;


  /**
   * customMessage.
   *
   * @return EnvelopesSharePermissionRequest
   **/
  public EnvelopesSharePermissionRequest customMessage(String customMessage) {
    this.customMessage = customMessage;
    return this;
  }

  /**
   * .
   * @return customMessage
   **/
  @Schema(description = "")
  public String getCustomMessage() {
    return customMessage;
  }

  /**
   * setCustomMessage.
   **/
  public void setCustomMessage(String customMessage) {
    this.customMessage = customMessage;
  }


  /**
   * permission.
   *
   * @return EnvelopesSharePermissionRequest
   **/
  public EnvelopesSharePermissionRequest permission(String permission) {
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
    EnvelopesSharePermissionRequest envelopesSharePermissionRequest = (EnvelopesSharePermissionRequest) o;
    return Objects.equals(this.customMessage, envelopesSharePermissionRequest.customMessage) &&
        Objects.equals(this.permission, envelopesSharePermissionRequest.permission);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(customMessage, permission);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopesSharePermissionRequest {\n");
    
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
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

