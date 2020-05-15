package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientNamesResponse
 */

public class RecipientNamesResponse {
  @JsonProperty("multipleUsers")
  private String multipleUsers = null;

  @JsonProperty("recipientNames")
  private java.util.List<String> recipientNames = null;

  @JsonProperty("reservedRecipientEmail")
  private String reservedRecipientEmail = null;

  public RecipientNamesResponse multipleUsers(String multipleUsers) {
    this.multipleUsers = multipleUsers;
    return this;
  }

   /**
   * Indicates whether email address is used by more than one user.
   * @return multipleUsers
  **/
  @ApiModelProperty(value = "Indicates whether email address is used by more than one user.")
  public String getMultipleUsers() {
    return multipleUsers;
  }

  public void setMultipleUsers(String multipleUsers) {
    this.multipleUsers = multipleUsers;
  }

  public RecipientNamesResponse recipientNames(java.util.List<String> recipientNames) {
    this.recipientNames = recipientNames;
    return this;
  }

  public RecipientNamesResponse addRecipientNamesItem(String recipientNamesItem) {
    if (this.recipientNames == null) {
      this.recipientNames = new java.util.ArrayList<String>();
    }
    this.recipientNames.add(recipientNamesItem);
    return this;
  }

   /**
   * 
   * @return recipientNames
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getRecipientNames() {
    return recipientNames;
  }

  public void setRecipientNames(java.util.List<String> recipientNames) {
    this.recipientNames = recipientNames;
  }

  public RecipientNamesResponse reservedRecipientEmail(String reservedRecipientEmail) {
    this.reservedRecipientEmail = reservedRecipientEmail;
    return this;
  }

   /**
   * 
   * @return reservedRecipientEmail
  **/
  @ApiModelProperty(value = "")
  public String getReservedRecipientEmail() {
    return reservedRecipientEmail;
  }

  public void setReservedRecipientEmail(String reservedRecipientEmail) {
    this.reservedRecipientEmail = reservedRecipientEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientNamesResponse recipientNamesResponse = (RecipientNamesResponse) o;
    return Objects.equals(this.multipleUsers, recipientNamesResponse.multipleUsers) &&
        Objects.equals(this.recipientNames, recipientNamesResponse.recipientNames) &&
        Objects.equals(this.reservedRecipientEmail, recipientNamesResponse.reservedRecipientEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleUsers, recipientNames, reservedRecipientEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientNamesResponse {\n");
    
    sb.append("    multipleUsers: ").append(toIndentedString(multipleUsers)).append("\n");
    sb.append("    recipientNames: ").append(toIndentedString(recipientNames)).append("\n");
    sb.append("    reservedRecipientEmail: ").append(toIndentedString(reservedRecipientEmail)).append("\n");
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

