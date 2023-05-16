package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AccountIdentityInputOption.
 *
 */

public class AccountIdentityInputOption {
  @JsonProperty("isRequired")
  private Boolean isRequired = null;

  @JsonProperty("optionName")
  private String optionName = null;

  @JsonProperty("valueType")
  private String valueType = null;


  /**
   * isRequired.
   *
   * @return AccountIdentityInputOption
   **/
  public AccountIdentityInputOption isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * .
   * @return isRequired
   **/
  @Schema(description = "")
  public Boolean isIsRequired() {
    return isRequired;
  }

  /**
   * setIsRequired.
   **/
  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  /**
   * optionName.
   *
   * @return AccountIdentityInputOption
   **/
  public AccountIdentityInputOption optionName(String optionName) {
    this.optionName = optionName;
    return this;
  }

  /**
   * .
   * @return optionName
   **/
  @Schema(description = "")
  public String getOptionName() {
    return optionName;
  }

  /**
   * setOptionName.
   **/
  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }


  /**
   * valueType.
   *
   * @return AccountIdentityInputOption
   **/
  public AccountIdentityInputOption valueType(String valueType) {
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
    AccountIdentityInputOption accountIdentityInputOption = (AccountIdentityInputOption) o;
    return Objects.equals(this.isRequired, accountIdentityInputOption.isRequired) &&
        Objects.equals(this.optionName, accountIdentityInputOption.optionName) &&
        Objects.equals(this.valueType, accountIdentityInputOption.valueType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(isRequired, optionName, valueType);
  }


  /**
   * Converts the given object to string.
   */
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

