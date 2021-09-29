package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex type that Contains the elements:  * recipMayProvideNumber - Boolean. When set to **true**, the recipient can use whatever phone number they choose. * senderProvidedNumbers - ArrayOfString.  A list of phone numbers the recipient can use. * recordVoicePrint - Reserved. * validateRecipProvidedNumber - Reserved..
 *
 */
@ApiModel(description = "A complex type that Contains the elements:  * recipMayProvideNumber - Boolean. When set to **true**, the recipient can use whatever phone number they choose. * senderProvidedNumbers - ArrayOfString.  A list of phone numbers the recipient can use. * recordVoicePrint - Reserved. * validateRecipProvidedNumber - Reserved.")

public class RecipientPhoneAuthentication {
  @JsonProperty("recipMayProvideNumber")
  private String recipMayProvideNumber = null;

  @JsonProperty("recordVoicePrint")
  private String recordVoicePrint = null;

  @JsonProperty("senderProvidedNumbers")
  private java.util.List<String> senderProvidedNumbers = null;

  @JsonProperty("validateRecipProvidedNumber")
  private String validateRecipProvidedNumber = null;


  /**
   * recipMayProvideNumber.
   *
   * @return RecipientPhoneAuthentication
   **/
  public RecipientPhoneAuthentication recipMayProvideNumber(String recipMayProvideNumber) {
    this.recipMayProvideNumber = recipMayProvideNumber;
    return this;
  }

  /**
   * Boolean. When set to **true**, the recipient can supply a phone number their choice..
   * @return recipMayProvideNumber
   **/
  @ApiModelProperty(value = "Boolean. When set to **true**, the recipient can supply a phone number their choice.")
  public String getRecipMayProvideNumber() {
    return recipMayProvideNumber;
  }

  /**
   * setRecipMayProvideNumber.
   **/
  public void setRecipMayProvideNumber(String recipMayProvideNumber) {
    this.recipMayProvideNumber = recipMayProvideNumber;
  }


  /**
   * recordVoicePrint.
   *
   * @return RecipientPhoneAuthentication
   **/
  public RecipientPhoneAuthentication recordVoicePrint(String recordVoicePrint) {
    this.recordVoicePrint = recordVoicePrint;
    return this;
  }

  /**
   * Reserved..
   * @return recordVoicePrint
   **/
  @ApiModelProperty(value = "Reserved.")
  public String getRecordVoicePrint() {
    return recordVoicePrint;
  }

  /**
   * setRecordVoicePrint.
   **/
  public void setRecordVoicePrint(String recordVoicePrint) {
    this.recordVoicePrint = recordVoicePrint;
  }


  /**
   * senderProvidedNumbers.
   *
   * @return RecipientPhoneAuthentication
   **/
  public RecipientPhoneAuthentication senderProvidedNumbers(java.util.List<String> senderProvidedNumbers) {
    this.senderProvidedNumbers = senderProvidedNumbers;
    return this;
  }
  
  /**
   * addSenderProvidedNumbersItem.
   *
   * @return RecipientPhoneAuthentication
   **/
  public RecipientPhoneAuthentication addSenderProvidedNumbersItem(String senderProvidedNumbersItem) {
    if (this.senderProvidedNumbers == null) {
      this.senderProvidedNumbers = new java.util.ArrayList<String>();
    }
    this.senderProvidedNumbers.add(senderProvidedNumbersItem);
    return this;
  }

  /**
   * An Array containing a list of phone numbers the recipient may use for SMS text authentication. .
   * @return senderProvidedNumbers
   **/
  @ApiModelProperty(value = "An Array containing a list of phone numbers the recipient may use for SMS text authentication. ")
  public java.util.List<String> getSenderProvidedNumbers() {
    return senderProvidedNumbers;
  }

  /**
   * setSenderProvidedNumbers.
   **/
  public void setSenderProvidedNumbers(java.util.List<String> senderProvidedNumbers) {
    this.senderProvidedNumbers = senderProvidedNumbers;
  }


  /**
   * validateRecipProvidedNumber.
   *
   * @return RecipientPhoneAuthentication
   **/
  public RecipientPhoneAuthentication validateRecipProvidedNumber(String validateRecipProvidedNumber) {
    this.validateRecipProvidedNumber = validateRecipProvidedNumber;
    return this;
  }

  /**
   *  Reserved..
   * @return validateRecipProvidedNumber
   **/
  @ApiModelProperty(value = " Reserved.")
  public String getValidateRecipProvidedNumber() {
    return validateRecipProvidedNumber;
  }

  /**
   * setValidateRecipProvidedNumber.
   **/
  public void setValidateRecipProvidedNumber(String validateRecipProvidedNumber) {
    this.validateRecipProvidedNumber = validateRecipProvidedNumber;
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
    RecipientPhoneAuthentication recipientPhoneAuthentication = (RecipientPhoneAuthentication) o;
    return Objects.equals(this.recipMayProvideNumber, recipientPhoneAuthentication.recipMayProvideNumber) &&
        Objects.equals(this.recordVoicePrint, recipientPhoneAuthentication.recordVoicePrint) &&
        Objects.equals(this.senderProvidedNumbers, recipientPhoneAuthentication.senderProvidedNumbers) &&
        Objects.equals(this.validateRecipProvidedNumber, recipientPhoneAuthentication.validateRecipProvidedNumber);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(recipMayProvideNumber, recordVoicePrint, senderProvidedNumbers, validateRecipProvidedNumber);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientPhoneAuthentication {\n");
    
    sb.append("    recipMayProvideNumber: ").append(toIndentedString(recipMayProvideNumber)).append("\n");
    sb.append("    recordVoicePrint: ").append(toIndentedString(recordVoicePrint)).append("\n");
    sb.append("    senderProvidedNumbers: ").append(toIndentedString(senderProvidedNumbers)).append("\n");
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

