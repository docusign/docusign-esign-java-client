package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** SamlAssertionAttribute */
public class SamlAssertionAttribute {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("originalValue")
  private String originalValue = null;

  @JsonProperty("value")
  private String value = null;

  public SamlAssertionAttribute errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails
   *
   * @return errorDetails
   */
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public SamlAssertionAttribute name(String name) {
    this.name = name;
    return this;
  }

  /** @return name */
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SamlAssertionAttribute originalValue(String originalValue) {
    this.originalValue = originalValue;
    return this;
  }

  /**
   * The initial value of the tab when it was sent to the recipient.
   *
   * @return originalValue
   */
  @ApiModelProperty(
      example = "null",
      value = "The initial value of the tab when it was sent to the recipient. ")
  public String getOriginalValue() {
    return originalValue;
  }

  public void setOriginalValue(String originalValue) {
    this.originalValue = originalValue;
  }

  public SamlAssertionAttribute value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value associated with the named SAML assertion attribute
   *
   * @return value
   */
  @ApiModelProperty(
      example = "null",
      value = "The value associated with the named SAML assertion attribute")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlAssertionAttribute samlAssertionAttribute = (SamlAssertionAttribute) o;
    return Objects.equals(this.errorDetails, samlAssertionAttribute.errorDetails)
        && Objects.equals(this.name, samlAssertionAttribute.name)
        && Objects.equals(this.originalValue, samlAssertionAttribute.originalValue)
        && Objects.equals(this.value, samlAssertionAttribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, name, originalValue, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlAssertionAttribute {\n");

    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
