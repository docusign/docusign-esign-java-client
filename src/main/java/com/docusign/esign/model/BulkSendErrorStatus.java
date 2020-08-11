package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendErrorStatus
 */

public class BulkSendErrorStatus {
  @JsonProperty("created")
  private String created = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("recipientEmails")
  private java.util.List<String> recipientEmails = null;

  public BulkSendErrorStatus created(String created) {
    this.created = created;
    return this;
  }

   /**
   * 
   * @return created
  **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public BulkSendErrorStatus errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public BulkSendErrorStatus recipientEmails(java.util.List<String> recipientEmails) {
    this.recipientEmails = recipientEmails;
    return this;
  }

  public BulkSendErrorStatus addRecipientEmailsItem(String recipientEmailsItem) {
    if (this.recipientEmails == null) {
      this.recipientEmails = new java.util.ArrayList<String>();
    }
    this.recipientEmails.add(recipientEmailsItem);
    return this;
  }

   /**
   * 
   * @return recipientEmails
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getRecipientEmails() {
    return recipientEmails;
  }

  public void setRecipientEmails(java.util.List<String> recipientEmails) {
    this.recipientEmails = recipientEmails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendErrorStatus bulkSendErrorStatus = (BulkSendErrorStatus) o;
    return Objects.equals(this.created, bulkSendErrorStatus.created) &&
        Objects.equals(this.errorMessage, bulkSendErrorStatus.errorMessage) &&
        Objects.equals(this.recipientEmails, bulkSendErrorStatus.recipientEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, errorMessage, recipientEmails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendErrorStatus {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    recipientEmails: ").append(toIndentedString(recipientEmails)).append("\n");
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

