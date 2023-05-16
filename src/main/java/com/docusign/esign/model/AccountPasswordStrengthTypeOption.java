package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AccountPasswordStrengthTypeOption.
 *
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


  /**
   * minimumLength.
   *
   * @return AccountPasswordStrengthTypeOption
   **/
  public AccountPasswordStrengthTypeOption minimumLength(String minimumLength) {
    this.minimumLength = minimumLength;
    return this;
  }

  /**
   * .
   * @return minimumLength
   **/
  @Schema(description = "")
  public String getMinimumLength() {
    return minimumLength;
  }

  /**
   * setMinimumLength.
   **/
  public void setMinimumLength(String minimumLength) {
    this.minimumLength = minimumLength;
  }


  /**
   * name.
   *
   * @return AccountPasswordStrengthTypeOption
   **/
  public AccountPasswordStrengthTypeOption name(String name) {
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
   * passwordIncludeDigit.
   *
   * @return AccountPasswordStrengthTypeOption
   **/
  public AccountPasswordStrengthTypeOption passwordIncludeDigit(String passwordIncludeDigit) {
    this.passwordIncludeDigit = passwordIncludeDigit;
    return this;
  }

  /**
   * .
   * @return passwordIncludeDigit
   **/
  @Schema(description = "")
  public String getPasswordIncludeDigit() {
    return passwordIncludeDigit;
  }

  /**
   * setPasswordIncludeDigit.
   **/
  public void setPasswordIncludeDigit(String passwordIncludeDigit) {
    this.passwordIncludeDigit = passwordIncludeDigit;
  }


  /**
   * passwordIncludeDigitOrSpecialCharacter.
   *
   * @return AccountPasswordStrengthTypeOption
   **/
  public AccountPasswordStrengthTypeOption passwordIncludeDigitOrSpecialCharacter(String passwordIncludeDigitOrSpecialCharacter) {
    this.passwordIncludeDigitOrSpecialCharacter = passwordIncludeDigitOrSpecialCharacter;
    return this;
  }

  /**
   * .
   * @return passwordIncludeDigitOrSpecialCharacter
   **/
  @Schema(description = "")
  public String getPasswordIncludeDigitOrSpecialCharacter() {
    return passwordIncludeDigitOrSpecialCharacter;
  }

  /**
   * setPasswordIncludeDigitOrSpecialCharacter.
   **/
  public void setPasswordIncludeDigitOrSpecialCharacter(String passwordIncludeDigitOrSpecialCharacter) {
    this.passwordIncludeDigitOrSpecialCharacter = passwordIncludeDigitOrSpecialCharacter;
  }


  /**
   * passwordIncludeLowerCase.
   *
   * @return AccountPasswordStrengthTypeOption
   **/
  public AccountPasswordStrengthTypeOption passwordIncludeLowerCase(String passwordIncludeLowerCase) {
    this.passwordIncludeLowerCase = passwordIncludeLowerCase;
    return this;
  }

  /**
   * .
   * @return passwordIncludeLowerCase
   **/
  @Schema(description = "")
  public String getPasswordIncludeLowerCase() {
    return passwordIncludeLowerCase;
  }

  /**
   * setPasswordIncludeLowerCase.
   **/
  public void setPasswordIncludeLowerCase(String passwordIncludeLowerCase) {
    this.passwordIncludeLowerCase = passwordIncludeLowerCase;
  }


  /**
   * passwordIncludeSpecialCharacter.
   *
   * @return AccountPasswordStrengthTypeOption
   **/
  public AccountPasswordStrengthTypeOption passwordIncludeSpecialCharacter(String passwordIncludeSpecialCharacter) {
    this.passwordIncludeSpecialCharacter = passwordIncludeSpecialCharacter;
    return this;
  }

  /**
   * .
   * @return passwordIncludeSpecialCharacter
   **/
  @Schema(description = "")
  public String getPasswordIncludeSpecialCharacter() {
    return passwordIncludeSpecialCharacter;
  }

  /**
   * setPasswordIncludeSpecialCharacter.
   **/
  public void setPasswordIncludeSpecialCharacter(String passwordIncludeSpecialCharacter) {
    this.passwordIncludeSpecialCharacter = passwordIncludeSpecialCharacter;
  }


  /**
   * passwordIncludeUpperCase.
   *
   * @return AccountPasswordStrengthTypeOption
   **/
  public AccountPasswordStrengthTypeOption passwordIncludeUpperCase(String passwordIncludeUpperCase) {
    this.passwordIncludeUpperCase = passwordIncludeUpperCase;
    return this;
  }

  /**
   * .
   * @return passwordIncludeUpperCase
   **/
  @Schema(description = "")
  public String getPasswordIncludeUpperCase() {
    return passwordIncludeUpperCase;
  }

  /**
   * setPasswordIncludeUpperCase.
   **/
  public void setPasswordIncludeUpperCase(String passwordIncludeUpperCase) {
    this.passwordIncludeUpperCase = passwordIncludeUpperCase;
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
    AccountPasswordStrengthTypeOption accountPasswordStrengthTypeOption = (AccountPasswordStrengthTypeOption) o;
    return Objects.equals(this.minimumLength, accountPasswordStrengthTypeOption.minimumLength) &&
        Objects.equals(this.name, accountPasswordStrengthTypeOption.name) &&
        Objects.equals(this.passwordIncludeDigit, accountPasswordStrengthTypeOption.passwordIncludeDigit) &&
        Objects.equals(this.passwordIncludeDigitOrSpecialCharacter, accountPasswordStrengthTypeOption.passwordIncludeDigitOrSpecialCharacter) &&
        Objects.equals(this.passwordIncludeLowerCase, accountPasswordStrengthTypeOption.passwordIncludeLowerCase) &&
        Objects.equals(this.passwordIncludeSpecialCharacter, accountPasswordStrengthTypeOption.passwordIncludeSpecialCharacter) &&
        Objects.equals(this.passwordIncludeUpperCase, accountPasswordStrengthTypeOption.passwordIncludeUpperCase);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(minimumLength, name, passwordIncludeDigit, passwordIncludeDigitOrSpecialCharacter, passwordIncludeLowerCase, passwordIncludeSpecialCharacter, passwordIncludeUpperCase);
  }


  /**
   * Converts the given object to string.
   */
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

