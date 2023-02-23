package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains information about the BCC email address..
 *
 */
@Schema(description = "Contains information about the BCC email address.")

public class BccEmailAddress {
  @JsonProperty("bccEmailAddressId")
  private String bccEmailAddressId = null;

  @JsonProperty("email")
  private String email = null;

  /**
   * bccEmailAddressId.
   *
   * @return BccEmailAddress
   **/
  public BccEmailAddress bccEmailAddressId(String bccEmailAddressId) {
    this.bccEmailAddressId = bccEmailAddressId;
    return this;
  }

  /**
   * Only users with canManageAccount setting can use this option. An array of up
   * to 5 email addresses the envelope is sent to as a BCC email. Example: If your
   * account has BCC for Email Archive set up for the email address
   * 'archive@mycompany.com' and you send an envelope using the BCC Email Override
   * to send a BCC email to 'salesarchive@mycompany.com', then a copy of the
   * envelope is only sent to the 'salesarchive@mycompany.com' email address..
   * 
   * @return bccEmailAddressId
   **/
  @Schema(description = "Only users with canManageAccount setting can use this option. An array of up to 5 email addresses the envelope is sent to as a BCC email.    Example: If your account has BCC for Email Archive set up for the email address 'archive@mycompany.com' and you send an envelope using the BCC Email Override to send a BCC email to 'salesarchive@mycompany.com', then a copy of the envelope is only sent to the 'salesarchive@mycompany.com' email address.")
  public String getBccEmailAddressId() {
    return bccEmailAddressId;
  }

  /**
   * setBccEmailAddressId.
   **/
  public void setBccEmailAddressId(String bccEmailAddressId) {
    this.bccEmailAddressId = bccEmailAddressId;
  }

  /**
   * email.
   *
   * @return BccEmailAddress
   **/
  public BccEmailAddress email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Specifies the BCC email address. DocuSign verifies that the email format is
   * correct, but does not verify that the email is active.Using this overrides
   * the BCC for Email Archive information setting for this envelope. Maximum of
   * length: 100 characters. .
   * 
   * @return email
   **/
  @Schema(description = "Specifies the BCC email address. DocuSign verifies that the email format is correct, but does not verify that the email is active.Using this overrides the BCC for Email Archive information setting for this envelope.  Maximum of length: 100 characters. ")
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
    BccEmailAddress bccEmailAddress = (BccEmailAddress) o;
    return Objects.equals(this.bccEmailAddressId, bccEmailAddress.bccEmailAddressId) &&
        Objects.equals(this.email, bccEmailAddress.email);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bccEmailAddressId, email);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BccEmailAddress {\n");

    sb.append("    bccEmailAddressId: ").append(toIndentedString(bccEmailAddressId)).append("\n");
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
