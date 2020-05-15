package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientSignatureProviderOptions
 */

public class RecipientSignatureProviderOptions {
  @JsonProperty("cpfNumber")
  private String cpfNumber = null;

  @JsonProperty("oneTimePassword")
  private String oneTimePassword = null;

  @JsonProperty("signerRole")
  private String signerRole = null;

  @JsonProperty("sms")
  private String sms = null;

  public RecipientSignatureProviderOptions cpfNumber(String cpfNumber) {
    this.cpfNumber = cpfNumber;
    return this;
  }

   /**
   * 
   * @return cpfNumber
  **/
  @ApiModelProperty(value = "")
  public String getCpfNumber() {
    return cpfNumber;
  }

  public void setCpfNumber(String cpfNumber) {
    this.cpfNumber = cpfNumber;
  }

  public RecipientSignatureProviderOptions oneTimePassword(String oneTimePassword) {
    this.oneTimePassword = oneTimePassword;
    return this;
  }

   /**
   * 
   * @return oneTimePassword
  **/
  @ApiModelProperty(value = "")
  public String getOneTimePassword() {
    return oneTimePassword;
  }

  public void setOneTimePassword(String oneTimePassword) {
    this.oneTimePassword = oneTimePassword;
  }

  public RecipientSignatureProviderOptions signerRole(String signerRole) {
    this.signerRole = signerRole;
    return this;
  }

   /**
   * 
   * @return signerRole
  **/
  @ApiModelProperty(value = "")
  public String getSignerRole() {
    return signerRole;
  }

  public void setSignerRole(String signerRole) {
    this.signerRole = signerRole;
  }

  public RecipientSignatureProviderOptions sms(String sms) {
    this.sms = sms;
    return this;
  }

   /**
   * 
   * @return sms
  **/
  @ApiModelProperty(value = "")
  public String getSms() {
    return sms;
  }

  public void setSms(String sms) {
    this.sms = sms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientSignatureProviderOptions recipientSignatureProviderOptions = (RecipientSignatureProviderOptions) o;
    return Objects.equals(this.cpfNumber, recipientSignatureProviderOptions.cpfNumber) &&
        Objects.equals(this.oneTimePassword, recipientSignatureProviderOptions.oneTimePassword) &&
        Objects.equals(this.signerRole, recipientSignatureProviderOptions.signerRole) &&
        Objects.equals(this.sms, recipientSignatureProviderOptions.sms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfNumber, oneTimePassword, signerRole, sms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSignatureProviderOptions {\n");
    
    sb.append("    cpfNumber: ").append(toIndentedString(cpfNumber)).append("\n");
    sb.append("    oneTimePassword: ").append(toIndentedString(oneTimePassword)).append("\n");
    sb.append("    signerRole: ").append(toIndentedString(signerRole)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
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

