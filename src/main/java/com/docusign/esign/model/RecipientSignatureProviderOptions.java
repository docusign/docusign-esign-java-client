package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientSignatureProviderOptions
 */

public class RecipientSignatureProviderOptions {
  @JsonProperty("cpfNumber")
  private String cpfNumber = null;

  @JsonProperty("cpfNumberMetadata")
  private PropertyMetadata cpfNumberMetadata = null;

  @JsonProperty("oneTimePassword")
  private String oneTimePassword = null;

  @JsonProperty("oneTimePasswordMetadata")
  private PropertyMetadata oneTimePasswordMetadata = null;

  @JsonProperty("signerRole")
  private String signerRole = null;

  @JsonProperty("signerRoleMetadata")
  private PropertyMetadata signerRoleMetadata = null;

  @JsonProperty("sms")
  private String sms = null;

  @JsonProperty("smsMetadata")
  private PropertyMetadata smsMetadata = null;

  public RecipientSignatureProviderOptions cpfNumber(String cpfNumber) {
    this.cpfNumber = cpfNumber;
    return this;
  }

   /**
   * 
   * @return cpfNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCpfNumber() {
    return cpfNumber;
  }

  public void setCpfNumber(String cpfNumber) {
    this.cpfNumber = cpfNumber;
  }

  public RecipientSignatureProviderOptions cpfNumberMetadata(PropertyMetadata cpfNumberMetadata) {
    this.cpfNumberMetadata = cpfNumberMetadata;
    return this;
  }

   /**
   * Get cpfNumberMetadata
   * @return cpfNumberMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getCpfNumberMetadata() {
    return cpfNumberMetadata;
  }

  public void setCpfNumberMetadata(PropertyMetadata cpfNumberMetadata) {
    this.cpfNumberMetadata = cpfNumberMetadata;
  }

  public RecipientSignatureProviderOptions oneTimePassword(String oneTimePassword) {
    this.oneTimePassword = oneTimePassword;
    return this;
  }

   /**
   * 
   * @return oneTimePassword
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOneTimePassword() {
    return oneTimePassword;
  }

  public void setOneTimePassword(String oneTimePassword) {
    this.oneTimePassword = oneTimePassword;
  }

  public RecipientSignatureProviderOptions oneTimePasswordMetadata(PropertyMetadata oneTimePasswordMetadata) {
    this.oneTimePasswordMetadata = oneTimePasswordMetadata;
    return this;
  }

   /**
   * Get oneTimePasswordMetadata
   * @return oneTimePasswordMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getOneTimePasswordMetadata() {
    return oneTimePasswordMetadata;
  }

  public void setOneTimePasswordMetadata(PropertyMetadata oneTimePasswordMetadata) {
    this.oneTimePasswordMetadata = oneTimePasswordMetadata;
  }

  public RecipientSignatureProviderOptions signerRole(String signerRole) {
    this.signerRole = signerRole;
    return this;
  }

   /**
   * 
   * @return signerRole
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignerRole() {
    return signerRole;
  }

  public void setSignerRole(String signerRole) {
    this.signerRole = signerRole;
  }

  public RecipientSignatureProviderOptions signerRoleMetadata(PropertyMetadata signerRoleMetadata) {
    this.signerRoleMetadata = signerRoleMetadata;
    return this;
  }

   /**
   * Get signerRoleMetadata
   * @return signerRoleMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getSignerRoleMetadata() {
    return signerRoleMetadata;
  }

  public void setSignerRoleMetadata(PropertyMetadata signerRoleMetadata) {
    this.signerRoleMetadata = signerRoleMetadata;
  }

  public RecipientSignatureProviderOptions sms(String sms) {
    this.sms = sms;
    return this;
  }

   /**
   * 
   * @return sms
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSms() {
    return sms;
  }

  public void setSms(String sms) {
    this.sms = sms;
  }

  public RecipientSignatureProviderOptions smsMetadata(PropertyMetadata smsMetadata) {
    this.smsMetadata = smsMetadata;
    return this;
  }

   /**
   * Get smsMetadata
   * @return smsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getSmsMetadata() {
    return smsMetadata;
  }

  public void setSmsMetadata(PropertyMetadata smsMetadata) {
    this.smsMetadata = smsMetadata;
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
        Objects.equals(this.cpfNumberMetadata, recipientSignatureProviderOptions.cpfNumberMetadata) &&
        Objects.equals(this.oneTimePassword, recipientSignatureProviderOptions.oneTimePassword) &&
        Objects.equals(this.oneTimePasswordMetadata, recipientSignatureProviderOptions.oneTimePasswordMetadata) &&
        Objects.equals(this.signerRole, recipientSignatureProviderOptions.signerRole) &&
        Objects.equals(this.signerRoleMetadata, recipientSignatureProviderOptions.signerRoleMetadata) &&
        Objects.equals(this.sms, recipientSignatureProviderOptions.sms) &&
        Objects.equals(this.smsMetadata, recipientSignatureProviderOptions.smsMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfNumber, cpfNumberMetadata, oneTimePassword, oneTimePasswordMetadata, signerRole, signerRoleMetadata, sms, smsMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSignatureProviderOptions {\n");
    
    sb.append("    cpfNumber: ").append(toIndentedString(cpfNumber)).append("\n");
    sb.append("    cpfNumberMetadata: ").append(toIndentedString(cpfNumberMetadata)).append("\n");
    sb.append("    oneTimePassword: ").append(toIndentedString(oneTimePassword)).append("\n");
    sb.append("    oneTimePasswordMetadata: ").append(toIndentedString(oneTimePasswordMetadata)).append("\n");
    sb.append("    signerRole: ").append(toIndentedString(signerRole)).append("\n");
    sb.append("    signerRoleMetadata: ").append(toIndentedString(signerRoleMetadata)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    smsMetadata: ").append(toIndentedString(smsMetadata)).append("\n");
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

