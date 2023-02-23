package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A complex type that Contains the elements: * recipMayProvideNumber - Boolean.
 * When set to **true**, the recipient can use whatever phone number they
 * choose. * senderProvidedNumbers - ArrayOfString. A list of phone numbers the
 * recipient can use. * recordVoicePrint - Reserved. *
 * validateRecipProvidedNumber - Reserved..
 *
 */
@Schema(description = "A complex type that Contains the elements:  * recipMayProvideNumber - Boolean. When set to **true**, the recipient can use whatever phone number they choose. * senderProvidedNumbers - ArrayOfString.  A list of phone numbers the recipient can use. * recordVoicePrint - Reserved. * validateRecipProvidedNumber - Reserved.")

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
  private java.util.List<String> senderProvidedNumbers = null;

  @JsonProperty("senderProvidedNumbersMetadata")
  private PropertyMetadata senderProvidedNumbersMetadata = null;

  @JsonProperty("validateRecipProvidedNumber")
  private String validateRecipProvidedNumber = null;

  @JsonProperty("validateRecipProvidedNumberMetadata")
  private PropertyMetadata validateRecipProvidedNumberMetadata = null;

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
   * Boolean. When set to **true**, the recipient can supply a phone number their
   * choice..
   * 
   * @return recipMayProvideNumber
   **/
  @Schema(description = "Boolean. When set to **true**, the recipient can supply a phone number their choice.")
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
   * recipMayProvideNumberMetadata.
   *
   * @return RecipientPhoneAuthentication
   **/
  public RecipientPhoneAuthentication recipMayProvideNumberMetadata(PropertyMetadata recipMayProvideNumberMetadata) {
    this.recipMayProvideNumberMetadata = recipMayProvideNumberMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `recipMayProvideNumber` property can be
   * edited..
   * 
   * @return recipMayProvideNumberMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `recipMayProvideNumber` property can be edited.")
  public PropertyMetadata getRecipMayProvideNumberMetadata() {
    return recipMayProvideNumberMetadata;
  }

  /**
   * setRecipMayProvideNumberMetadata.
   **/
  public void setRecipMayProvideNumberMetadata(PropertyMetadata recipMayProvideNumberMetadata) {
    this.recipMayProvideNumberMetadata = recipMayProvideNumberMetadata;
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
   * 
   * @return recordVoicePrint
   **/
  @Schema(description = "Reserved.")
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
   * recordVoicePrintMetadata.
   *
   * @return RecipientPhoneAuthentication
   **/
  public RecipientPhoneAuthentication recordVoicePrintMetadata(PropertyMetadata recordVoicePrintMetadata) {
    this.recordVoicePrintMetadata = recordVoicePrintMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * 
   * @return recordVoicePrintMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public PropertyMetadata getRecordVoicePrintMetadata() {
    return recordVoicePrintMetadata;
  }

  /**
   * setRecordVoicePrintMetadata.
   **/
  public void setRecordVoicePrintMetadata(PropertyMetadata recordVoicePrintMetadata) {
    this.recordVoicePrintMetadata = recordVoicePrintMetadata;
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
      this.senderProvidedNumbers = new java.util.ArrayList<>();
    }
    this.senderProvidedNumbers.add(senderProvidedNumbersItem);
    return this;
  }

  /**
   * An Array containing a list of phone numbers the recipient may use for SMS
   * text authentication. .
   * 
   * @return senderProvidedNumbers
   **/
  @Schema(description = "An Array containing a list of phone numbers the recipient may use for SMS text authentication. ")
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
   * senderProvidedNumbersMetadata.
   *
   * @return RecipientPhoneAuthentication
   **/
  public RecipientPhoneAuthentication senderProvidedNumbersMetadata(PropertyMetadata senderProvidedNumbersMetadata) {
    this.senderProvidedNumbersMetadata = senderProvidedNumbersMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `senderProvidedNumbers` property can be
   * edited..
   * 
   * @return senderProvidedNumbersMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `senderProvidedNumbers` property can be edited.")
  public PropertyMetadata getSenderProvidedNumbersMetadata() {
    return senderProvidedNumbersMetadata;
  }

  /**
   * setSenderProvidedNumbersMetadata.
   **/
  public void setSenderProvidedNumbersMetadata(PropertyMetadata senderProvidedNumbersMetadata) {
    this.senderProvidedNumbersMetadata = senderProvidedNumbersMetadata;
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
   * Reserved..
   * 
   * @return validateRecipProvidedNumber
   **/
  @Schema(description = " Reserved.")
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
   * validateRecipProvidedNumberMetadata.
   *
   * @return RecipientPhoneAuthentication
   **/
  public RecipientPhoneAuthentication validateRecipProvidedNumberMetadata(
      PropertyMetadata validateRecipProvidedNumberMetadata) {
    this.validateRecipProvidedNumberMetadata = validateRecipProvidedNumberMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * 
   * @return validateRecipProvidedNumberMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public PropertyMetadata getValidateRecipProvidedNumberMetadata() {
    return validateRecipProvidedNumberMetadata;
  }

  /**
   * setValidateRecipProvidedNumberMetadata.
   **/
  public void setValidateRecipProvidedNumberMetadata(PropertyMetadata validateRecipProvidedNumberMetadata) {
    this.validateRecipProvidedNumberMetadata = validateRecipProvidedNumberMetadata;
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
        Objects.equals(this.recipMayProvideNumberMetadata, recipientPhoneAuthentication.recipMayProvideNumberMetadata)
        &&
        Objects.equals(this.recordVoicePrint, recipientPhoneAuthentication.recordVoicePrint) &&
        Objects.equals(this.recordVoicePrintMetadata, recipientPhoneAuthentication.recordVoicePrintMetadata) &&
        Objects.equals(this.senderProvidedNumbers, recipientPhoneAuthentication.senderProvidedNumbers) &&
        Objects.equals(this.senderProvidedNumbersMetadata, recipientPhoneAuthentication.senderProvidedNumbersMetadata)
        &&
        Objects.equals(this.validateRecipProvidedNumber, recipientPhoneAuthentication.validateRecipProvidedNumber) &&
        Objects.equals(this.validateRecipProvidedNumberMetadata,
            recipientPhoneAuthentication.validateRecipProvidedNumberMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(recipMayProvideNumber, recipMayProvideNumberMetadata, recordVoicePrint,
        recordVoicePrintMetadata, senderProvidedNumbers, senderProvidedNumbersMetadata, validateRecipProvidedNumber,
        validateRecipProvidedNumberMetadata);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientPhoneAuthentication {\n");

    sb.append("    recipMayProvideNumber: ").append(toIndentedString(recipMayProvideNumber)).append("\n");
    sb.append("    recipMayProvideNumberMetadata: ").append(toIndentedString(recipMayProvideNumberMetadata))
        .append("\n");
    sb.append("    recordVoicePrint: ").append(toIndentedString(recordVoicePrint)).append("\n");
    sb.append("    recordVoicePrintMetadata: ").append(toIndentedString(recordVoicePrintMetadata)).append("\n");
    sb.append("    senderProvidedNumbers: ").append(toIndentedString(senderProvidedNumbers)).append("\n");
    sb.append("    senderProvidedNumbersMetadata: ").append(toIndentedString(senderProvidedNumbersMetadata))
        .append("\n");
    sb.append("    validateRecipProvidedNumber: ").append(toIndentedString(validateRecipProvidedNumber)).append("\n");
    sb.append("    validateRecipProvidedNumberMetadata: ").append(toIndentedString(validateRecipProvidedNumberMetadata))
        .append("\n");
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
