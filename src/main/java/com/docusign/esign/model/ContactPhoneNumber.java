package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ContactPhoneNumber
 */

public class ContactPhoneNumber {
  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("phoneType")
  private String phoneType = null;

  public ContactPhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ContactPhoneNumber phoneType(String phoneType) {
    this.phoneType = phoneType;
    return this;
  }

   /**
   * 
   * @return phoneType
  **/
  @ApiModelProperty(value = "")
  public String getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactPhoneNumber contactPhoneNumber = (ContactPhoneNumber) o;
    return Objects.equals(this.phoneNumber, contactPhoneNumber.phoneNumber) &&
        Objects.equals(this.phoneType, contactPhoneNumber.phoneType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, phoneType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPhoneNumber {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
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

