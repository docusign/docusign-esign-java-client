package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountPasswordStrengthTypeOption
 */

public class AccountPasswordStrengthTypeOption {
  @JsonProperty("minimumLength")
  private String minimumLength = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("passwordIncludeDigit")
  private String passwordIncludeDigit = null;

  @JsonProperty("passwordIncludeDigitOrSpecialCharacter")
  private String passwordIncludeDigitOrSpecialCharacter = null;

  @JsonProperty("passwordIncludeLowerCase")
  private String passwordIncludeLowerCase = null;

  @JsonProperty("passwordIncludeSpecialCharacter")
  private String passwordIncludeSpecialCharacter = null;

  @JsonProperty("passwordIncludeUpperCase")
  private String passwordIncludeUpperCase = null;

  public AccountPasswordStrengthTypeOption minimumLength(String minimumLength) {
    this.minimumLength = minimumLength;
    return this;
  }

   /**
   * 
   * @return minimumLength
  **/
  @ApiModelProperty(value = "")
  public String getMinimumLength() {
    return minimumLength;
  }

  public void setMinimumLength(String minimumLength) {
    this.minimumLength = minimumLength;
  }

  public AccountPasswordStrengthTypeOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountPasswordStrengthTypeOption passwordIncludeDigit(String passwordIncludeDigit) {
    this.passwordIncludeDigit = passwordIncludeDigit;
    return this;
  }

   /**
   * 
   * @return passwordIncludeDigit
  **/
  @ApiModelProperty(value = "")
  public String getPasswordIncludeDigit() {
    return passwordIncludeDigit;
  }

  public void setPasswordIncludeDigit(String passwordIncludeDigit) {
    this.passwordIncludeDigit = passwordIncludeDigit;
  }

  public AccountPasswordStrengthTypeOption passwordIncludeDigitOrSpecialCharacter(String passwordIncludeDigitOrSpecialCharacter) {
    this.passwordIncludeDigitOrSpecialCharacter = passwordIncludeDigitOrSpecialCharacter;
    return this;
  }

   /**
   * 
   * @return passwordIncludeDigitOrSpecialCharacter
  **/
  @ApiModelProperty(value = "")
  public String getPasswordIncludeDigitOrSpecialCharacter() {
    return passwordIncludeDigitOrSpecialCharacter;
  }

  public void setPasswordIncludeDigitOrSpecialCharacter(String passwordIncludeDigitOrSpecialCharacter) {
    this.passwordIncludeDigitOrSpecialCharacter = passwordIncludeDigitOrSpecialCharacter;
  }

  public AccountPasswordStrengthTypeOption passwordIncludeLowerCase(String passwordIncludeLowerCase) {
    this.passwordIncludeLowerCase = passwordIncludeLowerCase;
    return this;
  }

   /**
   * 
   * @return passwordIncludeLowerCase
  **/
  @ApiModelProperty(value = "")
  public String getPasswordIncludeLowerCase() {
    return passwordIncludeLowerCase;
  }

  public void setPasswordIncludeLowerCase(String passwordIncludeLowerCase) {
    this.passwordIncludeLowerCase = passwordIncludeLowerCase;
  }

  public AccountPasswordStrengthTypeOption passwordIncludeSpecialCharacter(String passwordIncludeSpecialCharacter) {
    this.passwordIncludeSpecialCharacter = passwordIncludeSpecialCharacter;
    return this;
  }

   /**
   * 
   * @return passwordIncludeSpecialCharacter
  **/
  @ApiModelProperty(value = "")
  public String getPasswordIncludeSpecialCharacter() {
    return passwordIncludeSpecialCharacter;
  }

  public void setPasswordIncludeSpecialCharacter(String passwordIncludeSpecialCharacter) {
    this.passwordIncludeSpecialCharacter = passwordIncludeSpecialCharacter;
  }

  public AccountPasswordStrengthTypeOption passwordIncludeUpperCase(String passwordIncludeUpperCase) {
    this.passwordIncludeUpperCase = passwordIncludeUpperCase;
    return this;
  }

   /**
   * 
   * @return passwordIncludeUpperCase
  **/
  @ApiModelProperty(value = "")
  public String getPasswordIncludeUpperCase() {
    return passwordIncludeUpperCase;
  }

  public void setPasswordIncludeUpperCase(String passwordIncludeUpperCase) {
    this.passwordIncludeUpperCase = passwordIncludeUpperCase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPasswordStrengthTypeOption accountPasswordStrengthTypeOption = (AccountPasswordStrengthTypeOption) o;
    return Objects.equals(this.minimumLength, accountPasswordStrengthTypeOption.minimumLength) &&
        Objects.equals(this.name, accountPasswordStrengthTypeOption.name) &&
        Objects.equals(this.passwordIncludeDigit, accountPasswordStrengthTypeOption.passwordIncludeDigit) &&
        Objects.equals(this.passwordIncludeDigitOrSpecialCharacter, accountPasswordStrengthTypeOption.passwordIncludeDigitOrSpecialCharacter) &&
        Objects.equals(this.passwordIncludeLowerCase, accountPasswordStrengthTypeOption.passwordIncludeLowerCase) &&
        Objects.equals(this.passwordIncludeSpecialCharacter, accountPasswordStrengthTypeOption.passwordIncludeSpecialCharacter) &&
        Objects.equals(this.passwordIncludeUpperCase, accountPasswordStrengthTypeOption.passwordIncludeUpperCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumLength, name, passwordIncludeDigit, passwordIncludeDigitOrSpecialCharacter, passwordIncludeLowerCase, passwordIncludeSpecialCharacter, passwordIncludeUpperCase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPasswordStrengthTypeOption {\n");
    
    sb.append("    minimumLength: ").append(toIndentedString(minimumLength)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passwordIncludeDigit: ").append(toIndentedString(passwordIncludeDigit)).append("\n");
    sb.append("    passwordIncludeDigitOrSpecialCharacter: ").append(toIndentedString(passwordIncludeDigitOrSpecialCharacter)).append("\n");
    sb.append("    passwordIncludeLowerCase: ").append(toIndentedString(passwordIncludeLowerCase)).append("\n");
    sb.append("    passwordIncludeSpecialCharacter: ").append(toIndentedString(passwordIncludeSpecialCharacter)).append("\n");
    sb.append("    passwordIncludeUpperCase: ").append(toIndentedString(passwordIncludeUpperCase)).append("\n");
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

