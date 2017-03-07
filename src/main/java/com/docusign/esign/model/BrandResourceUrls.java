package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BrandResourceUrls   {
  
  private String email = null;
  private String sending = null;
  private String signing = null;
  private String signingCaptive = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sending")
  public String getSending() {
    return sending;
  }
  public void setSending(String sending) {
    this.sending = sending;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signing")
  public String getSigning() {
    return signing;
  }
  public void setSigning(String signing) {
    this.signing = signing;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signingCaptive")
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

    return true && Objects.equals(email, brandResourceUrls.email) &&
        Objects.equals(sending, brandResourceUrls.sending) &&
        Objects.equals(signing, brandResourceUrls.signing) &&
        Objects.equals(signingCaptive, brandResourceUrls.signingCaptive)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, sending, signing, signingCaptive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandResourceUrls {\n");
    
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (sending != null)
      sb.append("    sending: ").append(toIndentedString(sending)).append("\n");
    if (signing != null)
      sb.append("    signing: ").append(toIndentedString(signing)).append("\n");
    if (signingCaptive != null)
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

