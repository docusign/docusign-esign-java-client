package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class RecipientNamesResponse   {
  
  private String multipleUsers = null;
  private java.util.List<String> recipientNames = new java.util.ArrayList<String>();
  private String reservedRecipientEmail = null;

  
  /**
   * Indicates whether email address is used by more than one user.
   **/
  
  @ApiModelProperty(value = "Indicates whether email address is used by more than one user.")
  @JsonProperty("multipleUsers")
  public String getMultipleUsers() {
    return multipleUsers;
  }
  public void setMultipleUsers(String multipleUsers) {
    this.multipleUsers = multipleUsers;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipientNames")
  public java.util.List<String> getRecipientNames() {
    return recipientNames;
  }
  public void setRecipientNames(java.util.List<String> recipientNames) {
    this.recipientNames = recipientNames;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reservedRecipientEmail")
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

    return true && Objects.equals(multipleUsers, recipientNamesResponse.multipleUsers) &&
        Objects.equals(recipientNames, recipientNamesResponse.recipientNames) &&
        Objects.equals(reservedRecipientEmail, recipientNamesResponse.reservedRecipientEmail)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleUsers, recipientNames, reservedRecipientEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientNamesResponse {\n");
    
    if (multipleUsers != null)
      sb.append("    multipleUsers: ").append(toIndentedString(multipleUsers)).append("\n");
    if (recipientNames != null)
      sb.append("    recipientNames: ").append(toIndentedString(recipientNames)).append("\n");
    if (reservedRecipientEmail != null)
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

