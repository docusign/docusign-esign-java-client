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
 * EnvelopesShareRequest.
 *
 */

public class EnvelopesShareRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("agentUser")
  private AuthorizationUser agentUser = null;

  @JsonProperty("customMessage")
  private String customMessage = null;

  @JsonProperty("permission")
  private String permission = null;

  @JsonProperty("shareId")
  private String shareId = null;


  /**
   * agentUser.
   *
   * @return EnvelopesShareRequest
   **/
  public EnvelopesShareRequest agentUser(AuthorizationUser agentUser) {
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
   * customMessage.
   *
   * @return EnvelopesShareRequest
   **/
  public EnvelopesShareRequest customMessage(String customMessage) {
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
   * @return EnvelopesShareRequest
   **/
  public EnvelopesShareRequest permission(String permission) {
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
   * shareId.
   *
   * @return EnvelopesShareRequest
   **/
  public EnvelopesShareRequest shareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

  /**
   * .
   * @return shareId
   **/
  @Schema(description = "")
  public String getShareId() {
    return shareId;
  }

  /**
   * setShareId.
   **/
  public void setShareId(String shareId) {
    this.shareId = shareId;
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
    EnvelopesShareRequest envelopesShareRequest = (EnvelopesShareRequest) o;
    return Objects.equals(this.agentUser, envelopesShareRequest.agentUser) &&
        Objects.equals(this.customMessage, envelopesShareRequest.customMessage) &&
        Objects.equals(this.permission, envelopesShareRequest.permission) &&
        Objects.equals(this.shareId, envelopesShareRequest.shareId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(agentUser, customMessage, permission, shareId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopesShareRequest {\n");
    
    sb.append("    agentUser: ").append(toIndentedString(agentUser)).append("\n");
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
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

