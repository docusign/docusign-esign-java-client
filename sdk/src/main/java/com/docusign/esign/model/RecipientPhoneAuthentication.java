package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class RecipientPhoneAuthentication   {
  
  private String recipMayProvideNumber = null;
  private String validateRecipProvidedNumber = null;
  private String recordVoicePrint = null;
  private java.util.List<String> senderProvidedNumbers = new java.util.ArrayList<String>();

  
  /**
   * Boolean. When set to **true**, the recipient can supply a phone number their choice.
   **/
  @ApiModelProperty(value = "Boolean. When set to **true**, the recipient can supply a phone number their choice.")
  @JsonProperty("recipMayProvideNumber")
  public String getRecipMayProvideNumber() {
    return recipMayProvideNumber;
  }
  public void setRecipMayProvideNumber(String recipMayProvideNumber) {
    this.recipMayProvideNumber = recipMayProvideNumber;
  }

  
  /**
   * Reserved.
   **/
  @ApiModelProperty(value = "Reserved.")
  @JsonProperty("validateRecipProvidedNumber")
  public String getValidateRecipProvidedNumber() {
    return validateRecipProvidedNumber;
  }
  public void setValidateRecipProvidedNumber(String validateRecipProvidedNumber) {
    this.validateRecipProvidedNumber = validateRecipProvidedNumber;
  }

  
  /**
   * Reserved.
   **/
  @ApiModelProperty(value = "Reserved.")
  @JsonProperty("recordVoicePrint")
  public String getRecordVoicePrint() {
    return recordVoicePrint;
  }
  public void setRecordVoicePrint(String recordVoicePrint) {
    this.recordVoicePrint = recordVoicePrint;
  }

  
  /**
   * An Array containing a list of phone numbers the recipient may use for SMS text authentication.
   **/
  @ApiModelProperty(value = "An Array containing a list of phone numbers the recipient may use for SMS text authentication.")
  @JsonProperty("senderProvidedNumbers")
  public java.util.List<String> getSenderProvidedNumbers() {
    return senderProvidedNumbers;
  }
  public void setSenderProvidedNumbers(java.util.List<String> senderProvidedNumbers) {
    this.senderProvidedNumbers = senderProvidedNumbers;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientPhoneAuthentication recipientPhoneAuthentication = (RecipientPhoneAuthentication) o;
    return Objects.equals(recipMayProvideNumber, recipientPhoneAuthentication.recipMayProvideNumber) &&
        Objects.equals(validateRecipProvidedNumber, recipientPhoneAuthentication.validateRecipProvidedNumber) &&
        Objects.equals(recordVoicePrint, recipientPhoneAuthentication.recordVoicePrint) &&
        Objects.equals(senderProvidedNumbers, recipientPhoneAuthentication.senderProvidedNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipMayProvideNumber, validateRecipProvidedNumber, recordVoicePrint, senderProvidedNumbers);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientPhoneAuthentication {\n");
    
    sb.append("    recipMayProvideNumber: ").append(StringUtil.toIndentedString(recipMayProvideNumber)).append("\n");
    sb.append("    validateRecipProvidedNumber: ").append(StringUtil.toIndentedString(validateRecipProvidedNumber)).append("\n");
    sb.append("    recordVoicePrint: ").append(StringUtil.toIndentedString(recordVoicePrint)).append("\n");
    sb.append("    senderProvidedNumbers: ").append(StringUtil.toIndentedString(senderProvidedNumbers)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
