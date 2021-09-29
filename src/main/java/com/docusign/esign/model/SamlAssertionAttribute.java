package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SamlAssertionAttribute.
 *
 */

public class SamlAssertionAttribute {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("originalValue")
  private String originalValue = null;

  @JsonProperty("value")
  private String value = null;


  /**
   * errorDetails.
   *
   * @return SamlAssertionAttribute
   **/
  public SamlAssertionAttribute errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * name.
   *
   * @return SamlAssertionAttribute
   **/
  public SamlAssertionAttribute name(String name) {
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
   * originalValue.
   *
   * @return SamlAssertionAttribute
   **/
  public SamlAssertionAttribute originalValue(String originalValue) {
    this.originalValue = originalValue;
    return this;
  }

  /**
   * The initial value of the tab when it was sent to the recipient. .
   * @return originalValue
   **/
  @ApiModelProperty(value = "The initial value of the tab when it was sent to the recipient. ")
  public String getOriginalValue() {
    return originalValue;
  }

  /**
   * setOriginalValue.
   **/
  public void setOriginalValue(String originalValue) {
    this.originalValue = originalValue;
  }


  /**
   * value.
   *
   * @return SamlAssertionAttribute
   **/
  public SamlAssertionAttribute value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value associated with the named SAML assertion attribute.
   * @return value
   **/
  @ApiModelProperty(value = "The value associated with the named SAML assertion attribute")
  public String getValue() {
    return value;
  }

  /**
   * setValue.
   **/
  public void setValue(String value) {
    this.value = value;
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
    SamlAssertionAttribute samlAssertionAttribute = (SamlAssertionAttribute) o;
    return Objects.equals(this.errorDetails, samlAssertionAttribute.errorDetails) &&
        Objects.equals(this.name, samlAssertionAttribute.name) &&
        Objects.equals(this.originalValue, samlAssertionAttribute.originalValue) &&
        Objects.equals(this.value, samlAssertionAttribute.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, name, originalValue, value);
  }


  /**
   * Converts the given object to string.
   */
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

