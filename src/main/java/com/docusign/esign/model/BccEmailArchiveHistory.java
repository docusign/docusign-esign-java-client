package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BccEmailArchiveHistory
 */

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

  public BccEmailArchiveHistory accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID associated with the envelope.
   * @return accountId
  **/
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public BccEmailArchiveHistory action(String action) {
    this.action = action;
    return this;
  }

   /**
   * 
   * @return action
  **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public BccEmailArchiveHistory email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BccEmailArchiveHistory modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * 
   * @return modified
  **/
  @ApiModelProperty(value = "")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public BccEmailArchiveHistory modifiedBy(UserInfo modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @ApiModelProperty(value = "")
  public UserInfo getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(UserInfo modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public BccEmailArchiveHistory status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(accountId, action, email, modified, modifiedBy, status);
  }


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

