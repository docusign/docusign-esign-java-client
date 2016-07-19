package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class RecipientPhoneAuthentication   {
  
  private String recipMayProvideNumber = null;
  private String validateRecipProvidedNumber = null;
  private String recordVoicePrint = null;
  private java.util.List<String> senderProvidedNumbers = new java.util.ArrayList<String>();

  
  /**
   * Boolean. When set to **true**, the recipient can supply a phone number their choice.
   **/
  public RecipientPhoneAuthentication recipMayProvideNumber(String recipMayProvideNumber) {
    this.recipMayProvideNumber = recipMayProvideNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean. When set to **true**, the recipient can supply a phone number their choice.")
  @JsonProperty("recipMayProvideNumber")
  public String getRecipMayProvideNumber() {
    return recipMayProvideNumber;
  }
  public void setRecipMayProvideNumber(String recipMayProvideNumber) {
    this.recipMayProvideNumber = recipMayProvideNumber;
  }

  
  /**
   *  Reserved.
   **/
  public RecipientPhoneAuthentication validateRecipProvidedNumber(String validateRecipProvidedNumber) {
    this.validateRecipProvidedNumber = validateRecipProvidedNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " Reserved.")
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
  public RecipientPhoneAuthentication recordVoicePrint(String recordVoicePrint) {
    this.recordVoicePrint = recordVoicePrint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved.")
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
  public RecipientPhoneAuthentication senderProvidedNumbers(java.util.List<String> senderProvidedNumbers) {
    this.senderProvidedNumbers = senderProvidedNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An Array containing a list of phone numbers the recipient may use for SMS text authentication. ")
  @JsonProperty("senderProvidedNumbers")
  public java.util.List<String> getSenderProvidedNumbers() {
    return senderProvidedNumbers;
  }
  public void setSenderProvidedNumbers(java.util.List<String> senderProvidedNumbers) {
    this.senderProvidedNumbers = senderProvidedNumbers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientPhoneAuthentication recipientPhoneAuthentication = (RecipientPhoneAuthentication) o;
    return Objects.equals(this.recipMayProvideNumber, recipientPhoneAuthentication.recipMayProvideNumber) &&
        Objects.equals(this.validateRecipProvidedNumber, recipientPhoneAuthentication.validateRecipProvidedNumber) &&
        Objects.equals(this.recordVoicePrint, recipientPhoneAuthentication.recordVoicePrint) &&
        Objects.equals(this.senderProvidedNumbers, recipientPhoneAuthentication.senderProvidedNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipMayProvideNumber, validateRecipProvidedNumber, recordVoicePrint, senderProvidedNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientPhoneAuthentication {\n");
    
    sb.append("    recipMayProvideNumber: ").append(toIndentedString(recipMayProvideNumber)).append("\n");
    sb.append("    validateRecipProvidedNumber: ").append(toIndentedString(validateRecipProvidedNumber)).append("\n");
    sb.append("    recordVoicePrint: ").append(toIndentedString(recordVoicePrint)).append("\n");
    sb.append("    senderProvidedNumbers: ").append(toIndentedString(senderProvidedNumbers)).append("\n");
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

