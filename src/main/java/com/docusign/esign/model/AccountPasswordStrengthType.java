package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AccountPasswordStrengthType. */
public class AccountPasswordStrengthType {
  @JsonProperty("options")
  private java.util.List<AccountPasswordStrengthTypeOption> options = null;

  /**
   * options.
   *
   * @return AccountPasswordStrengthType
   */
  public AccountPasswordStrengthType options(
      java.util.List<AccountPasswordStrengthTypeOption> options) {
    this.options = options;
    return this;
  }

  /**
   * addOptionsItem.
   *
   * @return AccountPasswordStrengthType
   */
  public AccountPasswordStrengthType addOptionsItem(AccountPasswordStrengthTypeOption optionsItem) {
    if (this.options == null) {
      this.options = new java.util.ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * .
   *
   * @return options
   */
  @ApiModelProperty(value = "")
  public java.util.List<AccountPasswordStrengthTypeOption> getOptions() {
    return options;
  }

  /** setOptions. */
  public void setOptions(java.util.List<AccountPasswordStrengthTypeOption> options) {
    this.options = options;
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
    AccountPasswordStrengthType accountPasswordStrengthType = (AccountPasswordStrengthType) o;
    return Objects.equals(this.options, accountPasswordStrengthType.options);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(options);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPasswordStrengthType {\n");

    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
