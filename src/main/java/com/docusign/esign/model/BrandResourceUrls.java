package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BrandResourceUrls
 */

public class BrandResourceUrls {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("sending")
  private String sending = null;

  @JsonProperty("signing")
  private String signing = null;

  @JsonProperty("signingCaptive")
  private String signingCaptive = null;

  public BrandResourceUrls email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BrandResourceUrls sending(String sending) {
    this.sending = sending;
    return this;
  }

   /**
   * 
   * @return sending
  **/
  @ApiModelProperty(value = "")
  public String getSending() {
    return sending;
  }

  public void setSending(String sending) {
    this.sending = sending;
  }

  public BrandResourceUrls signing(String signing) {
    this.signing = signing;
    return this;
  }

   /**
   * 
   * @return signing
  **/
  @ApiModelProperty(value = "")
  public String getSigning() {
    return signing;
  }

  public void setSigning(String signing) {
    this.signing = signing;
  }

  public BrandResourceUrls signingCaptive(String signingCaptive) {
    this.signingCaptive = signingCaptive;
    return this;
  }

   /**
   * 
   * @return signingCaptive
  **/
  @ApiModelProperty(value = "")
  public String getSigningCaptive() {
    return signingCaptive;
  }

  public void setSigningCaptive(String signingCaptive) {
    this.signingCaptive = signingCaptive;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(email, sending, signing, signingCaptive);
  }


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

