package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AuthorizationUser;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * EnvelopesShareResponse.
 *
 */

public class EnvelopesShareResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("agentUser")
  private AuthorizationUser agentUser = null;

  @JsonProperty("createdTimestamp")
  private String createdTimestamp = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("modifiedTimestamp")
  private String modifiedTimestamp = null;

  @JsonProperty("permission")
  private String permission = null;

  @JsonProperty("senderInfo")
  private AuthorizationUser senderInfo = null;

  @JsonProperty("shareId")
  private String shareId = null;

  @JsonProperty("subject")
  private String subject = null;


  /**
   * agentUser.
   *
   * @return EnvelopesShareResponse
   **/
  public EnvelopesShareResponse agentUser(AuthorizationUser agentUser) {
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
   * createdTimestamp.
   *
   * @return EnvelopesShareResponse
   **/
  public EnvelopesShareResponse createdTimestamp(String createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  /**
   * .
   * @return createdTimestamp
   **/
  @Schema(description = "")
  public String getCreatedTimestamp() {
    return createdTimestamp;
  }

  /**
   * setCreatedTimestamp.
   **/
  public void setCreatedTimestamp(String createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  /**
   * envelopeId.
   *
   * @return EnvelopesShareResponse
   **/
  public EnvelopesShareResponse envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   * @return envelopeId
   **/
  @Schema(description = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  /**
   * setEnvelopeId.
   **/
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }


  /**
   * errorDetails.
   *
   * @return EnvelopesShareResponse
   **/
  public EnvelopesShareResponse errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * modifiedTimestamp.
   *
   * @return EnvelopesShareResponse
   **/
  public EnvelopesShareResponse modifiedTimestamp(String modifiedTimestamp) {
    this.modifiedTimestamp = modifiedTimestamp;
    return this;
  }

  /**
   * .
   * @return modifiedTimestamp
   **/
  @Schema(description = "")
  public String getModifiedTimestamp() {
    return modifiedTimestamp;
  }

  /**
   * setModifiedTimestamp.
   **/
  public void setModifiedTimestamp(String modifiedTimestamp) {
    this.modifiedTimestamp = modifiedTimestamp;
  }


  /**
   * permission.
   *
   * @return EnvelopesShareResponse
   **/
  public EnvelopesShareResponse permission(String permission) {
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
   * senderInfo.
   *
   * @return EnvelopesShareResponse
   **/
  public EnvelopesShareResponse senderInfo(AuthorizationUser senderInfo) {
    this.senderInfo = senderInfo;
    return this;
  }

  /**
   * .
   * @return senderInfo
   **/
  @Schema(description = "")
  public AuthorizationUser getSenderInfo() {
    return senderInfo;
  }

  /**
   * setSenderInfo.
   **/
  public void setSenderInfo(AuthorizationUser senderInfo) {
    this.senderInfo = senderInfo;
  }


  /**
   * shareId.
   *
   * @return EnvelopesShareResponse
   **/
  public EnvelopesShareResponse shareId(String shareId) {
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
   * subject.
   *
   * @return EnvelopesShareResponse
   **/
  public EnvelopesShareResponse subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * .
   * @return subject
   **/
  @Schema(description = "")
  public String getSubject() {
    return subject;
  }

  /**
   * setSubject.
   **/
  public void setSubject(String subject) {
    this.subject = subject;
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
    EnvelopesShareResponse envelopesShareResponse = (EnvelopesShareResponse) o;
    return Objects.equals(this.agentUser, envelopesShareResponse.agentUser) &&
        Objects.equals(this.createdTimestamp, envelopesShareResponse.createdTimestamp) &&
        Objects.equals(this.envelopeId, envelopesShareResponse.envelopeId) &&
        Objects.equals(this.errorDetails, envelopesShareResponse.errorDetails) &&
        Objects.equals(this.modifiedTimestamp, envelopesShareResponse.modifiedTimestamp) &&
        Objects.equals(this.permission, envelopesShareResponse.permission) &&
        Objects.equals(this.senderInfo, envelopesShareResponse.senderInfo) &&
        Objects.equals(this.shareId, envelopesShareResponse.shareId) &&
        Objects.equals(this.subject, envelopesShareResponse.subject);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(agentUser, createdTimestamp, envelopeId, errorDetails, modifiedTimestamp, permission, senderInfo, shareId, subject);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopesShareResponse {\n");
    
    sb.append("    agentUser: ").append(toIndentedString(agentUser)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    modifiedTimestamp: ").append(toIndentedString(modifiedTimestamp)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    senderInfo: ").append(toIndentedString(senderInfo)).append("\n");
    sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

