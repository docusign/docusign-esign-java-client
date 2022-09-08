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
 * This object contains information abut a BCC email archive configuration (a BCC email address used to archive DocuSign-generated emails)..
 *
 */
@ApiModel(description = "This object contains information abut a BCC email archive configuration (a BCC email address used to archive DocuSign-generated emails).")

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


  /**
   * accountId.
   *
   * @return BccEmailArchive
   **/
  public BccEmailArchive accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID associated with the envelope..
   * @return accountId
   **/
  @ApiModelProperty(value = "The account ID associated with the envelope.")
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
   * bccEmailArchiveId.
   *
   * @return BccEmailArchive
   **/
  public BccEmailArchive bccEmailArchiveId(String bccEmailArchiveId) {
    this.bccEmailArchiveId = bccEmailArchiveId;
    return this;
  }

  /**
   * .
   * @return bccEmailArchiveId
   **/
  @ApiModelProperty(value = "")
  public String getBccEmailArchiveId() {
    return bccEmailArchiveId;
  }

  /**
   * setBccEmailArchiveId.
   **/
  public void setBccEmailArchiveId(String bccEmailArchiveId) {
    this.bccEmailArchiveId = bccEmailArchiveId;
  }


  /**
   * created.
   *
   * @return BccEmailArchive
   **/
  public BccEmailArchive created(String created) {
    this.created = created;
    return this;
  }

  /**
   * .
   * @return created
   **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  /**
   * setCreated.
   **/
  public void setCreated(String created) {
    this.created = created;
  }


  /**
   * createdBy.
   *
   * @return BccEmailArchive
   **/
  public BccEmailArchive createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Details about the user who created the BCC email archive configuration..
   * @return createdBy
   **/
  @ApiModelProperty(value = "Details about the user who created the BCC email archive configuration.")
  public UserInfo getCreatedBy() {
    return createdBy;
  }

  /**
   * setCreatedBy.
   **/
  public void setCreatedBy(UserInfo createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * email.
   *
   * @return BccEmailArchive
   **/
  public BccEmailArchive email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @ApiModelProperty(value = "")
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
   * emailNotificationId.
   *
   * @return BccEmailArchive
   **/
  public BccEmailArchive emailNotificationId(String emailNotificationId) {
    this.emailNotificationId = emailNotificationId;
    return this;
  }

  /**
   * .
   * @return emailNotificationId
   **/
  @ApiModelProperty(value = "")
  public String getEmailNotificationId() {
    return emailNotificationId;
  }

  /**
   * setEmailNotificationId.
   **/
  public void setEmailNotificationId(String emailNotificationId) {
    this.emailNotificationId = emailNotificationId;
  }


  /**
   * modified.
   *
   * @return BccEmailArchive
   **/
  public BccEmailArchive modified(String modified) {
    this.modified = modified;
    return this;
  }

  /**
   * .
   * @return modified
   **/
  @ApiModelProperty(value = "")
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
   * @return BccEmailArchive
   **/
  public BccEmailArchive modifiedBy(UserInfo modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * Details about the user who last modified the BCC email archive configuration..
   * @return modifiedBy
   **/
  @ApiModelProperty(value = "Details about the user who last modified the BCC email archive configuration.")
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
   * @return BccEmailArchive
   **/
  public BccEmailArchive status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
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
   * uri.
   *
   * @return BccEmailArchive
   **/
  public BccEmailArchive uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  /**
   * setUri.
   **/
  public void setUri(String uri) {
    this.uri = uri;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, bccEmailArchiveId, created, createdBy, email, emailNotificationId, modified, modifiedBy, status, uri);
  }


  /**
   * Converts the given object to string.
   */
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

