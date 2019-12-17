package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BccEmailArchive
 */

public class BccEmailArchive {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("bccEmailArchiveId")
  private String bccEmailArchiveId = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("createdBy")
  private UserInfo createdBy = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("emailNotificationId")
  private String emailNotificationId = null;

  @JsonProperty("modified")
  private String modified = null;

  @JsonProperty("modifiedBy")
  private UserInfo modifiedBy = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("uri")
  private String uri = null;

  public BccEmailArchive accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID associated with the envelope.
   * @return accountId
  **/
  @ApiModelProperty(example = "null", value = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public BccEmailArchive bccEmailArchiveId(String bccEmailArchiveId) {
    this.bccEmailArchiveId = bccEmailArchiveId;
    return this;
  }

   /**
   * 
   * @return bccEmailArchiveId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBccEmailArchiveId() {
    return bccEmailArchiveId;
  }

  public void setBccEmailArchiveId(String bccEmailArchiveId) {
    this.bccEmailArchiveId = bccEmailArchiveId;
  }

  public BccEmailArchive created(String created) {
    this.created = created;
    return this;
  }

   /**
   * 
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public BccEmailArchive createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserInfo getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserInfo createdBy) {
    this.createdBy = createdBy;
  }

  public BccEmailArchive email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BccEmailArchive emailNotificationId(String emailNotificationId) {
    this.emailNotificationId = emailNotificationId;
    return this;
  }

   /**
   * 
   * @return emailNotificationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmailNotificationId() {
    return emailNotificationId;
  }

  public void setEmailNotificationId(String emailNotificationId) {
    this.emailNotificationId = emailNotificationId;
  }

  public BccEmailArchive modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * 
   * @return modified
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public BccEmailArchive modifiedBy(UserInfo modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserInfo getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(UserInfo modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public BccEmailArchive status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BccEmailArchive uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BccEmailArchive bccEmailArchive = (BccEmailArchive) o;
    return Objects.equals(this.accountId, bccEmailArchive.accountId) &&
        Objects.equals(this.bccEmailArchiveId, bccEmailArchive.bccEmailArchiveId) &&
        Objects.equals(this.created, bccEmailArchive.created) &&
        Objects.equals(this.createdBy, bccEmailArchive.createdBy) &&
        Objects.equals(this.email, bccEmailArchive.email) &&
        Objects.equals(this.emailNotificationId, bccEmailArchive.emailNotificationId) &&
        Objects.equals(this.modified, bccEmailArchive.modified) &&
        Objects.equals(this.modifiedBy, bccEmailArchive.modifiedBy) &&
        Objects.equals(this.status, bccEmailArchive.status) &&
        Objects.equals(this.uri, bccEmailArchive.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bccEmailArchiveId, created, createdBy, email, emailNotificationId, modified, modifiedBy, status, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BccEmailArchive {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bccEmailArchiveId: ").append(toIndentedString(bccEmailArchiveId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailNotificationId: ").append(toIndentedString(emailNotificationId)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

