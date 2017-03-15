package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class RecipientSignatureProviderOptions   {
  
  private String cpfNumber = null;
  private String oneTimePassword = null;
  private String signerRole = null;
  private String sms = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cpfNumber")
  public String getCpfNumber() {
    return cpfNumber;
  }
  public void setCpfNumber(String cpfNumber) {
    this.cpfNumber = cpfNumber;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oneTimePassword")
  public String getOneTimePassword() {
    return oneTimePassword;
  }
  public void setOneTimePassword(String oneTimePassword) {
    this.oneTimePassword = oneTimePassword;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signerRole")
  public String getSignerRole() {
    return signerRole;
  }
  public void setSignerRole(String signerRole) {
    this.signerRole = signerRole;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sms")
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

    return true && Objects.equals(cpfNumber, recipientSignatureProviderOptions.cpfNumber) &&
        Objects.equals(oneTimePassword, recipientSignatureProviderOptions.oneTimePassword) &&
        Objects.equals(signerRole, recipientSignatureProviderOptions.signerRole) &&
        Objects.equals(sms, recipientSignatureProviderOptions.sms)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfNumber, oneTimePassword, signerRole, sms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSignatureProviderOptions {\n");
    
    if (cpfNumber != null)
      sb.append("    cpfNumber: ").append(toIndentedString(cpfNumber)).append("\n");
    if (oneTimePassword != null)
      sb.append("    oneTimePassword: ").append(toIndentedString(oneTimePassword)).append("\n");
    if (signerRole != null)
      sb.append("    signerRole: ").append(toIndentedString(signerRole)).append("\n");
    if (sms != null)
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

