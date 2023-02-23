package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Brands use resource files to style the following experiences: - Email -
 * Sending - Signing - Captive (embedded) signing You can modify these resource
 * files to customize these experiences..
 *
 */
@Schema(description = "Brands use resource files to style the following experiences:   - Email - Sending - Signing - Captive (embedded) signing   You can modify these resource files to customize these experiences.")

public class BrandResourceUrls {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("sending")
  private String sending = null;

  @JsonProperty("signing")
  private String signing = null;

  @JsonProperty("signingCaptive")
  private String signingCaptive = null;

  /**
   * email.
   *
   * @return BrandResourceUrls
   **/
  public BrandResourceUrls email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * 
   * @return email
   **/
  @Schema(description = "")
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
   * sending.
   *
   * @return BrandResourceUrls
   **/
  public BrandResourceUrls sending(String sending) {
    this.sending = sending;
    return this;
  }

  /**
   * .
   * 
   * @return sending
   **/
  @Schema(description = "")
  public String getSending() {
    return sending;
  }

  /**
   * setSending.
   **/
  public void setSending(String sending) {
    this.sending = sending;
  }

  /**
   * signing.
   *
   * @return BrandResourceUrls
   **/
  public BrandResourceUrls signing(String signing) {
    this.signing = signing;
    return this;
  }

  /**
   * .
   * 
   * @return signing
   **/
  @Schema(description = "")
  public String getSigning() {
    return signing;
  }

  /**
   * setSigning.
   **/
  public void setSigning(String signing) {
    this.signing = signing;
  }

  /**
   * signingCaptive.
   *
   * @return BrandResourceUrls
   **/
  public BrandResourceUrls signingCaptive(String signingCaptive) {
    this.signingCaptive = signingCaptive;
    return this;
  }

  /**
   * .
   * 
   * @return signingCaptive
   **/
  @Schema(description = "")
  public String getSigningCaptive() {
    return signingCaptive;
  }

  /**
   * setSigningCaptive.
   **/
  public void setSigningCaptive(String signingCaptive) {
    this.signingCaptive = signingCaptive;
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
    BrandResourceUrls brandResourceUrls = (BrandResourceUrls) o;
    return Objects.equals(this.email, brandResourceUrls.email) &&
        Objects.equals(this.sending, brandResourceUrls.sending) &&
        Objects.equals(this.signing, brandResourceUrls.signing) &&
        Objects.equals(this.signingCaptive, brandResourceUrls.signingCaptive);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(email, sending, signing, signingCaptive);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandResourceUrls {\n");

    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sending: ").append(toIndentedString(sending)).append("\n");
    sb.append("    signing: ").append(toIndentedString(signing)).append("\n");
    sb.append("    signingCaptive: ").append(toIndentedString(signingCaptive)).append("\n");
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
