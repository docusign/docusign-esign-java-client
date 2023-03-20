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
 * Contains the element senderProvidedNumbers which is an Array  of phone numbers the recipient can use for SMS text authentication..
 *
 */
@Schema(description = "Contains the element senderProvidedNumbers which is an Array  of phone numbers the recipient can use for SMS text authentication.")

public class RecipientSMSAuthentication {
  @JsonProperty("senderProvidedNumbers")
  private java.util.List<String> senderProvidedNumbers = null;

  @JsonProperty("senderProvidedNumbersMetadata")
  private PropertyMetadata senderProvidedNumbersMetadata = null;


  /**
   * senderProvidedNumbers.
   *
   * @return RecipientSMSAuthentication
   **/
  public RecipientSMSAuthentication senderProvidedNumbers(java.util.List<String> senderProvidedNumbers) {
    this.senderProvidedNumbers = senderProvidedNumbers;
    return this;
  }
  
  /**
   * addSenderProvidedNumbersItem.
   *
   * @return RecipientSMSAuthentication
   **/
  public RecipientSMSAuthentication addSenderProvidedNumbersItem(String senderProvidedNumbersItem) {
    if (this.senderProvidedNumbers == null) {
      this.senderProvidedNumbers = new java.util.ArrayList<>();
    }
    this.senderProvidedNumbers.add(senderProvidedNumbersItem);
    return this;
  }

  /**
   * An Array containing a list of phone numbers the recipient may use for SMS text authentication. .
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
   * @return RecipientSMSAuthentication
   **/
  public RecipientSMSAuthentication senderProvidedNumbersMetadata(PropertyMetadata senderProvidedNumbersMetadata) {
    this.senderProvidedNumbersMetadata = senderProvidedNumbersMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `senderProvidedNumbers` property can be edited..
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
    RecipientSMSAuthentication recipientSMSAuthentication = (RecipientSMSAuthentication) o;
    return Objects.equals(this.senderProvidedNumbers, recipientSMSAuthentication.senderProvidedNumbers) &&
        Objects.equals(this.senderProvidedNumbersMetadata, recipientSMSAuthentication.senderProvidedNumbersMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(senderProvidedNumbers, senderProvidedNumbersMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSMSAuthentication {\n");
    
    sb.append("    senderProvidedNumbers: ").append(toIndentedString(senderProvidedNumbers)).append("\n");
    sb.append("    senderProvidedNumbersMetadata: ").append(toIndentedString(senderProvidedNumbersMetadata)).append("\n");
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

