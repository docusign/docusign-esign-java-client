package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains details about the history of the BCC email archive configuration..
 *
 */
@Schema(description = "Contains details about the history of the BCC email archive configuration.")

public class BccEmailArchiveHistory {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("modified")
  private String modified = null;

  @JsonProperty("modifiedBy")
  private UserInfo modifiedBy = null;

  @JsonProperty("status")
  private String status = null;


  /**
   * accountId.
   *
   * @return BccEmailArchiveHistory
   **/
  public BccEmailArchiveHistory accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID associated with the envelope..
   * @return accountId
   **/
  @Schema(description = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * action.
   *
   * @return BccEmailArchiveHistory
   **/
  public BccEmailArchiveHistory action(String action) {
    this.action = action;
    return this;
  }

  /**
   * .
   * @return action
   **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  /**
   * setAction.
   **/
  public void setAction(String action) {
    this.action = action;
  }


  /**
   * email.
   *
   * @return BccEmailArchiveHistory
   **/
  public BccEmailArchiveHistory email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * modified.
   *
   * @return BccEmailArchiveHistory
   **/
  public BccEmailArchiveHistory modified(String modified) {
    this.modified = modified;
    return this;
  }

  /**
   * .
   * @return modified
   **/
  @Schema(description = "")
  public String getModified() {
    return modified;
  }

  /**
   * setModified.
   **/
  public void setModified(String modified) {
    this.modified = modified;
  }


  /**
   * modifiedBy.
   *
   * @return BccEmailArchiveHistory
   **/
  public BccEmailArchiveHistory modifiedBy(UserInfo modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * Details about the user who last modified the BCC email archive configuration..
   * @return modifiedBy
   **/
  @Schema(description = "Details about the user who last modified the BCC email archive configuration.")
  public UserInfo getModifiedBy() {
    return modifiedBy;
  }

  /**
   * setModifiedBy.
   **/
  public void setModifiedBy(UserInfo modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * status.
   *
   * @return BccEmailArchiveHistory
   **/
  public BccEmailArchiveHistory status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @Schema(description = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
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
    BccEmailArchiveHistory bccEmailArchiveHistory = (BccEmailArchiveHistory) o;
    return Objects.equals(this.accountId, bccEmailArchiveHistory.accountId) &&
        Objects.equals(this.action, bccEmailArchiveHistory.action) &&
        Objects.equals(this.email, bccEmailArchiveHistory.email) &&
        Objects.equals(this.modified, bccEmailArchiveHistory.modified) &&
        Objects.equals(this.modifiedBy, bccEmailArchiveHistory.modifiedBy) &&
        Objects.equals(this.status, bccEmailArchiveHistory.status);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, action, email, modified, modifiedBy, status);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BccEmailArchiveHistory {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

