package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientSignatureProviderOptions.
 *
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


  /**
   * cpfNumber.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions cpfNumber(String cpfNumber) {
    this.cpfNumber = cpfNumber;
    return this;
  }

  /**
   * .
   * @return cpfNumber
   **/
  @ApiModelProperty(value = "")
  public String getCpfNumber() {
    return cpfNumber;
  }

  /**
   * setCpfNumber.
   **/
  public void setCpfNumber(String cpfNumber) {
    this.cpfNumber = cpfNumber;
  }


  /**
   * oneTimePassword.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions oneTimePassword(String oneTimePassword) {
    this.oneTimePassword = oneTimePassword;
    return this;
  }

  /**
   * .
   * @return oneTimePassword
   **/
  @ApiModelProperty(value = "")
  public String getOneTimePassword() {
    return oneTimePassword;
  }

  /**
   * setOneTimePassword.
   **/
  public void setOneTimePassword(String oneTimePassword) {
    this.oneTimePassword = oneTimePassword;
  }


  /**
   * signerRole.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions signerRole(String signerRole) {
    this.signerRole = signerRole;
    return this;
  }

  /**
   * .
   * @return signerRole
   **/
  @ApiModelProperty(value = "")
  public String getSignerRole() {
    return signerRole;
  }

  /**
   * setSignerRole.
   **/
  public void setSignerRole(String signerRole) {
    this.signerRole = signerRole;
  }


  /**
   * sms.
   *
   * @return RecipientSignatureProviderOptions
   **/
  public RecipientSignatureProviderOptions sms(String sms) {
    this.sms = sms;
    return this;
  }

  /**
   * .
   * @return sms
   **/
  @ApiModelProperty(value = "")
  public String getSms() {
    return sms;
  }

  /**
   * setSms.
   **/
  public void setSms(String sms) {
    this.sms = sms;
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
    RecipientSignatureProviderOptions recipientSignatureProviderOptions = (RecipientSignatureProviderOptions) o;
    return Objects.equals(this.cpfNumber, recipientSignatureProviderOptions.cpfNumber) &&
        Objects.equals(this.oneTimePassword, recipientSignatureProviderOptions.oneTimePassword) &&
        Objects.equals(this.signerRole, recipientSignatureProviderOptions.signerRole) &&
        Objects.equals(this.sms, recipientSignatureProviderOptions.sms);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(cpfNumber, oneTimePassword, signerRole, sms);
  }


  /**
   * Converts the given object to string.
   */
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

