package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * A name-value pair that describes an item and provides a value for the item..
 *
 */
@Schema(description = "A name-value pair that describes an item and provides a value for the item.")

public class NameValue implements Serializable {
  private static final long serialVersionUID = 1L;

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
   * @return NameValue
   **/
  public NameValue errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
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
   * @return NameValue
   **/
  public NameValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name or key of a name/value pair..
   * @return name
   **/
  @Schema(description = "The name or key of a name/value pair.")
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
   * @return NameValue
   **/
  public NameValue originalValue(String originalValue) {
    this.originalValue = originalValue;
    return this;
  }

  /**
   * The initial value of the tab when it was sent to the recipient. .
   * @return originalValue
   **/
  @Schema(description = "The initial value of the tab when it was sent to the recipient. ")
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
   * @return NameValue
   **/
  public NameValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value field of a name/value pair..
   * @return value
   **/
  @Schema(description = "The value field of a name/value pair.")
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
    NameValue nameValue = (NameValue) o;
    return Objects.equals(this.errorDetails, nameValue.errorDetails) &&
        Objects.equals(this.name, nameValue.name) &&
        Objects.equals(this.originalValue, nameValue.originalValue) &&
        Objects.equals(this.value, nameValue.value);
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

