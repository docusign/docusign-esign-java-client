package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountIdentityInputOption
 */

public class AccountIdentityInputOption {
  @JsonProperty("isRequired")
  private Boolean isRequired = null;

  @JsonProperty("optionName")
  private String optionName = null;

  @JsonProperty("valueType")
  private String valueType = null;

  public AccountIdentityInputOption isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * 
   * @return isRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public AccountIdentityInputOption optionName(String optionName) {
    this.optionName = optionName;
    return this;
  }

   /**
   * 
   * @return optionName
  **/
  @ApiModelProperty(value = "")
  public String getOptionName() {
    return optionName;
  }

  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }

  public AccountIdentityInputOption valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * 
   * @return valueType
  **/
  @ApiModelProperty(value = "")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountIdentityInputOption accountIdentityInputOption = (AccountIdentityInputOption) o;
    return Objects.equals(this.isRequired, accountIdentityInputOption.isRequired) &&
        Objects.equals(this.optionName, accountIdentityInputOption.optionName) &&
        Objects.equals(this.valueType, accountIdentityInputOption.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRequired, optionName, valueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIdentityInputOption {\n");
    
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    optionName: ").append(toIndentedString(optionName)).append("\n");
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

