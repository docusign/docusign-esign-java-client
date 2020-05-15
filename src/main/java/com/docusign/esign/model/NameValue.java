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
 * NameValue
 */

public class NameValue {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("originalValue")
  private String originalValue = null;

  @JsonProperty("value")
  private String value = null;

  public NameValue errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public NameValue name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name or key of a name/value pair.
   * @return name
  **/
  @ApiModelProperty(value = "The name or key of a name/value pair.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NameValue originalValue(String originalValue) {
    this.originalValue = originalValue;
    return this;
  }

   /**
   * The initial value of the tab when it was sent to the recipient. 
   * @return originalValue
  **/
  @ApiModelProperty(value = "The initial value of the tab when it was sent to the recipient. ")
  public String getOriginalValue() {
    return originalValue;
  }

  public void setOriginalValue(String originalValue) {
    this.originalValue = originalValue;
  }

  public NameValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value field of a name/value pair.
   * @return value
  **/
  @ApiModelProperty(value = "The value field of a name/value pair.")
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
    NameValue nameValue = (NameValue) o;
    return Objects.equals(this.errorDetails, nameValue.errorDetails) &&
        Objects.equals(this.name, nameValue.name) &&
        Objects.equals(this.originalValue, nameValue.originalValue) &&
        Objects.equals(this.value, nameValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, name, originalValue, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameValue {\n");
    
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

