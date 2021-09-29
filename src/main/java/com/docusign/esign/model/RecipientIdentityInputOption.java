package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.RecipientIdentityPhoneNumber;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientIdentityInputOption.
 *
 */

public class RecipientIdentityInputOption {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phoneNumberList")
  private java.util.List<RecipientIdentityPhoneNumber> phoneNumberList = null;

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
  @ApiModelProperty(value = "")
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
      this.phoneNumberList = new java.util.ArrayList<RecipientIdentityPhoneNumber>();
    }
    this.phoneNumberList.add(phoneNumberListItem);
    return this;
  }

  /**
   * .
   * @return phoneNumberList
   **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
        Objects.equals(this.valueType, recipientIdentityInputOption.valueType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, phoneNumberList, valueType);
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

