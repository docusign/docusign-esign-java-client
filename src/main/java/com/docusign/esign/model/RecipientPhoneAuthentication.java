package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex type that Contains the elements:  * recipMayProvideNumber - Boolean. When set to **true**, the recipient can use whatever phone number they choose. * senderProvidedNumbers - ArrayOfString.  A list of phone numbers the recipient can use. * recordVoicePrint - Reserved. * validateRecipProvidedNumber - Reserved.
 */
@ApiModel(description = "A complex type that Contains the elements:  * recipMayProvideNumber - Boolean. When set to **true**, the recipient can use whatever phone number they choose. * senderProvidedNumbers - ArrayOfString.  A list of phone numbers the recipient can use. * recordVoicePrint - Reserved. * validateRecipProvidedNumber - Reserved.")

public class RecipientPhoneAuthentication {
  @JsonProperty("recipMayProvideNumber")
  private String recipMayProvideNumber = null;

  @JsonProperty("recipMayProvideNumberMetadata")
  private PropertyMetadata recipMayProvideNumberMetadata = null;

  @JsonProperty("recordVoicePrint")
  private String recordVoicePrint = null;

  @JsonProperty("recordVoicePrintMetadata")
  private PropertyMetadata recordVoicePrintMetadata = null;

  @JsonProperty("senderProvidedNumbers")
  private java.util.List<String> senderProvidedNumbers = new java.util.ArrayList<String>();

  @JsonProperty("senderProvidedNumbersMetadata")
  private PropertyMetadata senderProvidedNumbersMetadata = null;

  @JsonProperty("validateRecipProvidedNumber")
  private String validateRecipProvidedNumber = null;

  @JsonProperty("validateRecipProvidedNumberMetadata")
  private PropertyMetadata validateRecipProvidedNumberMetadata = null;

  public RecipientPhoneAuthentication recipMayProvideNumber(String recipMayProvideNumber) {
    this.recipMayProvideNumber = recipMayProvideNumber;
    return this;
  }

   /**
   * Boolean. When set to **true**, the recipient can supply a phone number their choice.
   * @return recipMayProvideNumber
  **/
  @ApiModelProperty(example = "null", value = "Boolean. When set to **true**, the recipient can supply a phone number their choice.")
  public String getRecipMayProvideNumber() {
    return recipMayProvideNumber;
  }

  public void setRecipMayProvideNumber(String recipMayProvideNumber) {
    this.recipMayProvideNumber = recipMayProvideNumber;
  }

  public RecipientPhoneAuthentication recipMayProvideNumberMetadata(PropertyMetadata recipMayProvideNumberMetadata) {
    this.recipMayProvideNumberMetadata = recipMayProvideNumberMetadata;
    return this;
  }

   /**
   * Get recipMayProvideNumberMetadata
   * @return recipMayProvideNumberMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getRecipMayProvideNumberMetadata() {
    return recipMayProvideNumberMetadata;
  }

  public void setRecipMayProvideNumberMetadata(PropertyMetadata recipMayProvideNumberMetadata) {
    this.recipMayProvideNumberMetadata = recipMayProvideNumberMetadata;
  }

  public RecipientPhoneAuthentication recordVoicePrint(String recordVoicePrint) {
    this.recordVoicePrint = recordVoicePrint;
    return this;
  }

   /**
   * Reserved.
   * @return recordVoicePrint
  **/
  @ApiModelProperty(example = "null", value = "Reserved.")
  public String getRecordVoicePrint() {
    return recordVoicePrint;
  }

  public void setRecordVoicePrint(String recordVoicePrint) {
    this.recordVoicePrint = recordVoicePrint;
  }

  public RecipientPhoneAuthentication recordVoicePrintMetadata(PropertyMetadata recordVoicePrintMetadata) {
    this.recordVoicePrintMetadata = recordVoicePrintMetadata;
    return this;
  }

   /**
   * Get recordVoicePrintMetadata
   * @return recordVoicePrintMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getRecordVoicePrintMetadata() {
    return recordVoicePrintMetadata;
  }

  public void setRecordVoicePrintMetadata(PropertyMetadata recordVoicePrintMetadata) {
    this.recordVoicePrintMetadata = recordVoicePrintMetadata;
  }

  public RecipientPhoneAuthentication senderProvidedNumbers(java.util.List<String> senderProvidedNumbers) {
    this.senderProvidedNumbers = senderProvidedNumbers;
    return this;
  }

  public RecipientPhoneAuthentication addSenderProvidedNumbersItem(String senderProvidedNumbersItem) {
    this.senderProvidedNumbers.add(senderProvidedNumbersItem);
    return this;
  }

   /**
   * An Array containing a list of phone numbers the recipient may use for SMS text authentication. 
   * @return senderProvidedNumbers
  **/
  @ApiModelProperty(example = "null", value = "An Array containing a list of phone numbers the recipient may use for SMS text authentication. ")
  public java.util.List<String> getSenderProvidedNumbers() {
    return senderProvidedNumbers;
  }

  public void setSenderProvidedNumbers(java.util.List<String> senderProvidedNumbers) {
    this.senderProvidedNumbers = senderProvidedNumbers;
  }

  public RecipientPhoneAuthentication senderProvidedNumbersMetadata(PropertyMetadata senderProvidedNumbersMetadata) {
    this.senderProvidedNumbersMetadata = senderProvidedNumbersMetadata;
    return this;
  }

   /**
   * Get senderProvidedNumbersMetadata
   * @return senderProvidedNumbersMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getSenderProvidedNumbersMetadata() {
    return senderProvidedNumbersMetadata;
  }

  public void setSenderProvidedNumbersMetadata(PropertyMetadata senderProvidedNumbersMetadata) {
    this.senderProvidedNumbersMetadata = senderProvidedNumbersMetadata;
  }

  public RecipientPhoneAuthentication validateRecipProvidedNumber(String validateRecipProvidedNumber) {
    this.validateRecipProvidedNumber = validateRecipProvidedNumber;
    return this;
  }

   /**
   *  Reserved.
   * @return validateRecipProvidedNumber
  **/
  @ApiModelProperty(example = "null", value = " Reserved.")
  public String getValidateRecipProvidedNumber() {
    return validateRecipProvidedNumber;
  }

  public void setValidateRecipProvidedNumber(String validateRecipProvidedNumber) {
    this.validateRecipProvidedNumber = validateRecipProvidedNumber;
  }

  public RecipientPhoneAuthentication validateRecipProvidedNumberMetadata(PropertyMetadata validateRecipProvidedNumberMetadata) {
    this.validateRecipProvidedNumberMetadata = validateRecipProvidedNumberMetadata;
    return this;
  }

   /**
   * Get validateRecipProvidedNumberMetadata
   * @return validateRecipProvidedNumberMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getValidateRecipProvidedNumberMetadata() {
    return validateRecipProvidedNumberMetadata;
  }

  public void setValidateRecipProvidedNumberMetadata(PropertyMetadata validateRecipProvidedNumberMetadata) {
    this.validateRecipProvidedNumberMetadata = validateRecipProvidedNumberMetadata;
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
        Objects.equals(this.recipMayProvideNumberMetadata, recipientPhoneAuthentication.recipMayProvideNumberMetadata) &&
        Objects.equals(this.recordVoicePrint, recipientPhoneAuthentication.recordVoicePrint) &&
        Objects.equals(this.recordVoicePrintMetadata, recipientPhoneAuthentication.recordVoicePrintMetadata) &&
        Objects.equals(this.senderProvidedNumbers, recipientPhoneAuthentication.senderProvidedNumbers) &&
        Objects.equals(this.senderProvidedNumbersMetadata, recipientPhoneAuthentication.senderProvidedNumbersMetadata) &&
        Objects.equals(this.validateRecipProvidedNumber, recipientPhoneAuthentication.validateRecipProvidedNumber) &&
        Objects.equals(this.validateRecipProvidedNumberMetadata, recipientPhoneAuthentication.validateRecipProvidedNumberMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipMayProvideNumber, recipMayProvideNumberMetadata, recordVoicePrint, recordVoicePrintMetadata, senderProvidedNumbers, senderProvidedNumbersMetadata, validateRecipProvidedNumber, validateRecipProvidedNumberMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientPhoneAuthentication {\n");
    
    sb.append("    recipMayProvideNumber: ").append(toIndentedString(recipMayProvideNumber)).append("\n");
    sb.append("    recipMayProvideNumberMetadata: ").append(toIndentedString(recipMayProvideNumberMetadata)).append("\n");
    sb.append("    recordVoicePrint: ").append(toIndentedString(recordVoicePrint)).append("\n");
    sb.append("    recordVoicePrintMetadata: ").append(toIndentedString(recordVoicePrintMetadata)).append("\n");
    sb.append("    senderProvidedNumbers: ").append(toIndentedString(senderProvidedNumbers)).append("\n");
    sb.append("    senderProvidedNumbersMetadata: ").append(toIndentedString(senderProvidedNumbersMetadata)).append("\n");
    sb.append("    validateRecipProvidedNumber: ").append(toIndentedString(validateRecipProvidedNumber)).append("\n");
    sb.append("    validateRecipProvidedNumberMetadata: ").append(toIndentedString(validateRecipProvidedNumberMetadata)).append("\n");
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

