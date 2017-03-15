package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about the BCC email address.
 **/

@ApiModel(description = "Contains information about the BCC email address.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BccEmailAddress   {
  
  private String bccEmailAddressId = null;
  private String email = null;

  
  /**
   * Only users with canManageAccount setting can use this option. An array of up to 5 email addresses the envelope is sent to as a BCC email. \n \nExample: If your account has BCC for Email Archive set up for the email address 'archive@mycompany.com' and you send an envelope using the BCC Email Override to send a BCC email to 'salesarchive@mycompany.com', then a copy of the envelope is only sent to the 'salesarchive@mycompany.com' email address.
   **/
  
  @ApiModelProperty(value = "Only users with canManageAccount setting can use this option. An array of up to 5 email addresses the envelope is sent to as a BCC email. \n \nExample: If your account has BCC for Email Archive set up for the email address 'archive@mycompany.com' and you send an envelope using the BCC Email Override to send a BCC email to 'salesarchive@mycompany.com', then a copy of the envelope is only sent to the 'salesarchive@mycompany.com' email address.")
  @JsonProperty("bccEmailAddressId")
  public String getBccEmailAddressId() {
    return bccEmailAddressId;
  }
  public void setBccEmailAddressId(String bccEmailAddressId) {
    this.bccEmailAddressId = bccEmailAddressId;
  }

  
  /**
   * Specifies the BCC email address. DocuSign verifies that the email format is correct, but does not verify that the email is active.Using this overrides the BCC for Email Archive information setting for this envelope.\n\nMaximum of length: 100 characters.
   **/
  
  @ApiModelProperty(value = "Specifies the BCC email address. DocuSign verifies that the email format is correct, but does not verify that the email is active.Using this overrides the BCC for Email Archive information setting for this envelope.\n\nMaximum of length: 100 characters.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BccEmailAddress bccEmailAddress = (BccEmailAddress) o;

    return true && Objects.equals(bccEmailAddressId, bccEmailAddress.bccEmailAddressId) &&
        Objects.equals(email, bccEmailAddress.email)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(bccEmailAddressId, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BccEmailAddress {\n");
    
    if (bccEmailAddressId != null)
      sb.append("    bccEmailAddressId: ").append(toIndentedString(bccEmailAddressId)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

