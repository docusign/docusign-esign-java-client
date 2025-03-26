package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.RecipientIdentityPhoneNumber;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * RecipientIdentityInputOption.
 *
 */

public class RecipientIdentityInputOption implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phoneNumberList")
  private java.util.List<RecipientIdentityPhoneNumber> phoneNumberList = null;

  @JsonProperty("stringValue")
  private String stringValue = null;

  @JsonProperty("valueType")
  private String valueType = null;


  /**
   * name.
   *
   * @return RecipientIdentityInputOption
   **/
  public RecipientIdentityInputOption name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * phoneNumberList.
   *
   * @return RecipientIdentityInputOption
   **/
  public RecipientIdentityInputOption phoneNumberList(java.util.List<RecipientIdentityPhoneNumber> phoneNumberList) {
    this.phoneNumberList = phoneNumberList;
    return this;
  }
  
  /**
   * addPhoneNumberListItem.
   *
   * @return RecipientIdentityInputOption
   **/
  public RecipientIdentityInputOption addPhoneNumberListItem(RecipientIdentityPhoneNumber phoneNumberListItem) {
    if (this.phoneNumberList == null) {
      this.phoneNumberList = new java.util.ArrayList<>();
    }
    this.phoneNumberList.add(phoneNumberListItem);
    return this;
  }

  /**
   * .
   * @return phoneNumberList
   **/
  @Schema(description = "")
  public java.util.List<RecipientIdentityPhoneNumber> getPhoneNumberList() {
    return phoneNumberList;
  }

  /**
   * setPhoneNumberList.
   **/
  public void setPhoneNumberList(java.util.List<RecipientIdentityPhoneNumber> phoneNumberList) {
    this.phoneNumberList = phoneNumberList;
  }


  /**
   * stringValue.
   *
   * @return RecipientIdentityInputOption
   **/
  public RecipientIdentityInputOption stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  /**
   * .
   * @return stringValue
   **/
  @Schema(description = "")
  public String getStringValue() {
    return stringValue;
  }

  /**
   * setStringValue.
   **/
  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }


  /**
   * valueType.
   *
   * @return RecipientIdentityInputOption
   **/
  public RecipientIdentityInputOption valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * .
   * @return valueType
   **/
  @Schema(description = "")
  public String getValueType() {
    return valueType;
  }

  /**
   * setValueType.
   **/
  public void setValueType(String valueType) {
    this.valueType = valueType;
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
    RecipientIdentityInputOption recipientIdentityInputOption = (RecipientIdentityInputOption) o;
    return Objects.equals(this.name, recipientIdentityInputOption.name) &&
        Objects.equals(this.phoneNumberList, recipientIdentityInputOption.phoneNumberList) &&
        Objects.equals(this.stringValue, recipientIdentityInputOption.stringValue) &&
        Objects.equals(this.valueType, recipientIdentityInputOption.valueType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, phoneNumberList, stringValue, valueType);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientIdentityInputOption {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumberList: ").append(toIndentedString(phoneNumberList)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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

