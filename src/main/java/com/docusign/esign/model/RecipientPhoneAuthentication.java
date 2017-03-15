package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A complex type that Contains the elements:\n\n* recipMayProvideNumber - Boolean. When set to **true**, the recipient can use whatever phone number they choose.\n* senderProvidedNumbers - ArrayOfString.  A list of phone numbers the recipient can use.\n* recordVoicePrint - Reserved.\n* validateRecipProvidedNumber - Reserved.
 **/

@ApiModel(description = "A complex type that Contains the elements:\n\n* recipMayProvideNumber - Boolean. When set to **true**, the recipient can use whatever phone number they choose.\n* senderProvidedNumbers - ArrayOfString.  A list of phone numbers the recipient can use.\n* recordVoicePrint - Reserved.\n* validateRecipProvidedNumber - Reserved.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class RecipientPhoneAuthentication   {
  
  private String recipMayProvideNumber = null;
  private String recordVoicePrint = null;
  private java.util.List<String> senderProvidedNumbers = new java.util.ArrayList<String>();
  private String validateRecipProvidedNumber = null;

  
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientPhoneAuthentication recipientPhoneAuthentication = (RecipientPhoneAuthentication) o;

    return true && Objects.equals(recipMayProvideNumber, recipientPhoneAuthentication.recipMayProvideNumber) &&
        Objects.equals(recordVoicePrint, recipientPhoneAuthentication.recordVoicePrint) &&
        Objects.equals(senderProvidedNumbers, recipientPhoneAuthentication.senderProvidedNumbers) &&
        Objects.equals(validateRecipProvidedNumber, recipientPhoneAuthentication.validateRecipProvidedNumber)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipMayProvideNumber, recordVoicePrint, senderProvidedNumbers, validateRecipProvidedNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientPhoneAuthentication {\n");
    
    if (recipMayProvideNumber != null)
      sb.append("    recipMayProvideNumber: ").append(toIndentedString(recipMayProvideNumber)).append("\n");
    if (recordVoicePrint != null)
      sb.append("    recordVoicePrint: ").append(toIndentedString(recordVoicePrint)).append("\n");
    if (senderProvidedNumbers != null)
      sb.append("    senderProvidedNumbers: ").append(toIndentedString(senderProvidedNumbers)).append("\n");
    if (validateRecipProvidedNumber != null)
      sb.append("    validateRecipProvidedNumber: ").append(toIndentedString(validateRecipProvidedNumber)).append("\n");
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

