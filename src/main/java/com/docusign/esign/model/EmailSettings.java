package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BccEmailAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A complex element that allows  the sender to override some envelope email setting information. This can be used to override the Reply To email address and name associated with the envelope and to override the BCC email addresses to which an envelope is sent.   When the emailSettings information is used for an envelope, it only applies to that envelope.   **IMPORTANT**: The emailSettings information is not returned in the GET for envelope status. Use GET /email_settings to return information about the emailSettings.   EmailSettings consists of:   * replyEmailAddressOverride - The Reply To email used for the envelope. DocuSign will verify that a correct email format is used, but does not verify that the email is active. Maximum Length: 100 characters. * replyEmailNameOverride - The name associated with the Reply To email address. Maximum Length: 100 characters. * bccEmailAddresses - An array of up to five email addresses to which the envelope is sent to as a BCC email. Only users with canManageAccount setting set to true can use this option.  DocuSign verifies that the email format is correct, but does not verify that the email is active. Using this overrides the BCC for Email Archive information setting for this envelope. Maximum Length: 100 characters. *Example*: if your account has BCC for Email Archive set up for the email address &#39;archive@mycompany.com&#39; and you send an envelope using the BCC Email Override to send a BCC email to &#39;salesarchive@mycompany.com&#39;, then a copy of the envelope is only sent to the &#39;salesarchive@mycompany.com&#39; email address..
 *
 */
@Schema(description = "A complex element that allows  the sender to override some envelope email setting information. This can be used to override the Reply To email address and name associated with the envelope and to override the BCC email addresses to which an envelope is sent.   When the emailSettings information is used for an envelope, it only applies to that envelope.   **IMPORTANT**: The emailSettings information is not returned in the GET for envelope status. Use GET /email_settings to return information about the emailSettings.   EmailSettings consists of:   * replyEmailAddressOverride - The Reply To email used for the envelope. DocuSign will verify that a correct email format is used, but does not verify that the email is active. Maximum Length: 100 characters. * replyEmailNameOverride - The name associated with the Reply To email address. Maximum Length: 100 characters. * bccEmailAddresses - An array of up to five email addresses to which the envelope is sent to as a BCC email. Only users with canManageAccount setting set to true can use this option.  DocuSign verifies that the email format is correct, but does not verify that the email is active. Using this overrides the BCC for Email Archive information setting for this envelope. Maximum Length: 100 characters. *Example*: if your account has BCC for Email Archive set up for the email address 'archive@mycompany.com' and you send an envelope using the BCC Email Override to send a BCC email to 'salesarchive@mycompany.com', then a copy of the envelope is only sent to the 'salesarchive@mycompany.com' email address.")

public class EmailSettings {
  @JsonProperty("bccEmailAddresses")
  private java.util.List<BccEmailAddress> bccEmailAddresses = null;

  @JsonProperty("replyEmailAddressOverride")
  private String replyEmailAddressOverride = null;

  @JsonProperty("replyEmailNameOverride")
  private String replyEmailNameOverride = null;


  /**
   * bccEmailAddresses.
   *
   * @return EmailSettings
   **/
  public EmailSettings bccEmailAddresses(java.util.List<BccEmailAddress> bccEmailAddresses) {
    this.bccEmailAddresses = bccEmailAddresses;
    return this;
  }
  
  /**
   * addBccEmailAddressesItem.
   *
   * @return EmailSettings
   **/
  public EmailSettings addBccEmailAddressesItem(BccEmailAddress bccEmailAddressesItem) {
    if (this.bccEmailAddresses == null) {
      this.bccEmailAddresses = new java.util.ArrayList<>();
    }
    this.bccEmailAddresses.add(bccEmailAddressesItem);
    return this;
  }

  /**
   * A list of email addresses that receive a copy of all email communications for an envelope. You can use this for archiving purposes..
   * @return bccEmailAddresses
   **/
  @Schema(description = "A list of email addresses that receive a copy of all email communications for an envelope. You can use this for archiving purposes.")
  public java.util.List<BccEmailAddress> getBccEmailAddresses() {
    return bccEmailAddresses;
  }

  /**
   * setBccEmailAddresses.
   **/
  public void setBccEmailAddresses(java.util.List<BccEmailAddress> bccEmailAddresses) {
    this.bccEmailAddresses = bccEmailAddresses;
  }


  /**
   * replyEmailAddressOverride.
   *
   * @return EmailSettings
   **/
  public EmailSettings replyEmailAddressOverride(String replyEmailAddressOverride) {
    this.replyEmailAddressOverride = replyEmailAddressOverride;
    return this;
  }

  /**
   * .
   * @return replyEmailAddressOverride
   **/
  @Schema(description = "")
  public String getReplyEmailAddressOverride() {
    return replyEmailAddressOverride;
  }

  /**
   * setReplyEmailAddressOverride.
   **/
  public void setReplyEmailAddressOverride(String replyEmailAddressOverride) {
    this.replyEmailAddressOverride = replyEmailAddressOverride;
  }


  /**
   * replyEmailNameOverride.
   *
   * @return EmailSettings
   **/
  public EmailSettings replyEmailNameOverride(String replyEmailNameOverride) {
    this.replyEmailNameOverride = replyEmailNameOverride;
    return this;
  }

  /**
   * .
   * @return replyEmailNameOverride
   **/
  @Schema(description = "")
  public String getReplyEmailNameOverride() {
    return replyEmailNameOverride;
  }

  /**
   * setReplyEmailNameOverride.
   **/
  public void setReplyEmailNameOverride(String replyEmailNameOverride) {
    this.replyEmailNameOverride = replyEmailNameOverride;
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
    EmailSettings emailSettings = (EmailSettings) o;
    return Objects.equals(this.bccEmailAddresses, emailSettings.bccEmailAddresses) &&
        Objects.equals(this.replyEmailAddressOverride, emailSettings.replyEmailAddressOverride) &&
        Objects.equals(this.replyEmailNameOverride, emailSettings.replyEmailNameOverride);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bccEmailAddresses, replyEmailAddressOverride, replyEmailNameOverride);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSettings {\n");
    
    sb.append("    bccEmailAddresses: ").append(toIndentedString(bccEmailAddresses)).append("\n");
    sb.append("    replyEmailAddressOverride: ").append(toIndentedString(replyEmailAddressOverride)).append("\n");
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

