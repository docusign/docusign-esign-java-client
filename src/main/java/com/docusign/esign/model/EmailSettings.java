package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BccEmailAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A complex element that allows  the sender to override some envelope email setting information. This can be used to override the Reply To email address and name associated with the envelope and to override the BCC email addresses to which an envelope is sent. \n\nWhen the emailSettings information is used for an envelope, it only applies to that envelope. \n\n**IMPORTANT**: The emailSettings information is not returned in the GET for envelope status. Use GET /email_settings to return information about the emailSettings. \n\nEmailSettings consists of: \n\n* replyEmailAddressOverride - The Reply To email used for the envelope. DocuSign will verify that a correct email format is used, but does not verify that the email is active. Maximum Length: 100 characters.\n* replyEmailNameOverride - The name associated with the Reply To email address. Maximum Length: 100 characters.\n* bccEmailAddresses - An array of up to five email addresses to which the envelope is sent to as a BCC email. Only users with canManageAccount setting set to true can use this option. \nDocuSign verifies that the email format is correct, but does not verify that the email is active. Using this overrides the BCC for Email Archive information setting for this envelope. Maximum Length: 100 characters.\n*Example*: if your account has BCC for Email Archive set up for the email address ‘archive@mycompany.com’ and you send an envelope using the BCC Email Override to send a BCC email to ‘salesarchive@mycompany.com’, then a copy of the envelope is only sent to the ‘salesarchive@mycompany.com’ email address.
 **/

@ApiModel(description = "A complex element that allows  the sender to override some envelope email setting information. This can be used to override the Reply To email address and name associated with the envelope and to override the BCC email addresses to which an envelope is sent. \n\nWhen the emailSettings information is used for an envelope, it only applies to that envelope. \n\n**IMPORTANT**: The emailSettings information is not returned in the GET for envelope status. Use GET /email_settings to return information about the emailSettings. \n\nEmailSettings consists of: \n\n* replyEmailAddressOverride - The Reply To email used for the envelope. DocuSign will verify that a correct email format is used, but does not verify that the email is active. Maximum Length: 100 characters.\n* replyEmailNameOverride - The name associated with the Reply To email address. Maximum Length: 100 characters.\n* bccEmailAddresses - An array of up to five email addresses to which the envelope is sent to as a BCC email. Only users with canManageAccount setting set to true can use this option. \nDocuSign verifies that the email format is correct, but does not verify that the email is active. Using this overrides the BCC for Email Archive information setting for this envelope. Maximum Length: 100 characters.\n*Example*: if your account has BCC for Email Archive set up for the email address ‘archive@mycompany.com’ and you send an envelope using the BCC Email Override to send a BCC email to ‘salesarchive@mycompany.com’, then a copy of the envelope is only sent to the ‘salesarchive@mycompany.com’ email address.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EmailSettings   {
  
  private java.util.List<BccEmailAddress> bccEmailAddresses = new java.util.ArrayList<BccEmailAddress>();
  private String replyEmailAddressOverride = null;
  private String replyEmailNameOverride = null;

  
  /**
   * A list of email addresses that receive a copy of all email communications for an envelope. You can use this for archiving purposes.
   **/
  
  @ApiModelProperty(value = "A list of email addresses that receive a copy of all email communications for an envelope. You can use this for archiving purposes.")
  @JsonProperty("bccEmailAddresses")
  public java.util.List<BccEmailAddress> getBccEmailAddresses() {
    return bccEmailAddresses;
  }
  public void setBccEmailAddresses(java.util.List<BccEmailAddress> bccEmailAddresses) {
    this.bccEmailAddresses = bccEmailAddresses;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("replyEmailAddressOverride")
  public String getReplyEmailAddressOverride() {
    return replyEmailAddressOverride;
  }
  public void setReplyEmailAddressOverride(String replyEmailAddressOverride) {
    this.replyEmailAddressOverride = replyEmailAddressOverride;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("replyEmailNameOverride")
  public String getReplyEmailNameOverride() {
    return replyEmailNameOverride;
  }
  public void setReplyEmailNameOverride(String replyEmailNameOverride) {
    this.replyEmailNameOverride = replyEmailNameOverride;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSettings emailSettings = (EmailSettings) o;

    return true && Objects.equals(bccEmailAddresses, emailSettings.bccEmailAddresses) &&
        Objects.equals(replyEmailAddressOverride, emailSettings.replyEmailAddressOverride) &&
        Objects.equals(replyEmailNameOverride, emailSettings.replyEmailNameOverride)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(bccEmailAddresses, replyEmailAddressOverride, replyEmailNameOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSettings {\n");
    
    if (bccEmailAddresses != null)
      sb.append("    bccEmailAddresses: ").append(toIndentedString(bccEmailAddresses)).append("\n");
    if (replyEmailAddressOverride != null)
      sb.append("    replyEmailAddressOverride: ").append(toIndentedString(replyEmailAddressOverride)).append("\n");
    if (replyEmailNameOverride != null)
      sb.append("    replyEmailNameOverride: ").append(toIndentedString(replyEmailNameOverride)).append("\n");
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

