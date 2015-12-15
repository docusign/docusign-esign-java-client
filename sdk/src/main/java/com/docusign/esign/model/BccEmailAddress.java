package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BccEmailAddress bccEmailAddress = (BccEmailAddress) o;
    return Objects.equals(bccEmailAddressId, bccEmailAddress.bccEmailAddressId) &&
        Objects.equals(email, bccEmailAddress.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bccEmailAddressId, email);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BccEmailAddress {\n");
    
    sb.append("    bccEmailAddressId: ").append(StringUtil.toIndentedString(bccEmailAddressId)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
