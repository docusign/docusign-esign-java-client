package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FormDataItem.
 *
 */

public class FormDataItem {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("listSelectedValue")
  private String listSelectedValue = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("numericalValue")
  private String numericalValue = null;

  @JsonProperty("originalValue")
  private String originalValue = null;

  @JsonProperty("value")
  private String value = null;

  /**
   * errorDetails.
   *
   * @return FormDataItem
   **/
  public FormDataItem errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * This object describes errors that occur. It is only valid for responses and
   * ignored in requests..
   * 
   * @return errorDetails
   **/
  @Schema(description = "This object describes errors that occur. It is only valid for responses and ignored in requests.")
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
   * listSelectedValue.
   *
   * @return FormDataItem
   **/
  public FormDataItem listSelectedValue(String listSelectedValue) {
    this.listSelectedValue = listSelectedValue;
    return this;
  }

  /**
   * .
   * 
   * @return listSelectedValue
   **/
  @Schema(description = "")
  public String getListSelectedValue() {
    return listSelectedValue;
  }

  /**
   * setListSelectedValue.
   **/
  public void setListSelectedValue(String listSelectedValue) {
    this.listSelectedValue = listSelectedValue;
  }

  /**
   * name.
   *
   * @return FormDataItem
   **/
  public FormDataItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * 
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
   * numericalValue.
   *
   * @return FormDataItem
   **/
  public FormDataItem numericalValue(String numericalValue) {
    this.numericalValue = numericalValue;
    return this;
  }

  /**
   * .
   * 
   * @return numericalValue
   **/
  @Schema(description = "")
  public String getNumericalValue() {
    return numericalValue;
  }

  /**
   * setNumericalValue.
   **/
  public void setNumericalValue(String numericalValue) {
    this.numericalValue = numericalValue;
  }

  /**
   * originalValue.
   *
   * @return FormDataItem
   **/
  public FormDataItem originalValue(String originalValue) {
    this.originalValue = originalValue;
    return this;
  }

  /**
   * The initial value of the tab when it was sent to the recipient. .
   * 
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
   * @return FormDataItem
   **/
  public FormDataItem value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value of the tab. .
   * 
   * @return value
   **/
  @Schema(description = "Specifies the value of the tab. ")
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
    FormDataItem formDataItem = (FormDataItem) o;
    return Objects.equals(this.errorDetails, formDataItem.errorDetails) &&
        Objects.equals(this.listSelectedValue, formDataItem.listSelectedValue) &&
        Objects.equals(this.name, formDataItem.name) &&
        Objects.equals(this.numericalValue, formDataItem.numericalValue) &&
        Objects.equals(this.originalValue, formDataItem.originalValue) &&
        Objects.equals(this.value, formDataItem.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, listSelectedValue, name, numericalValue, originalValue, value);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDataItem {\n");

    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    listSelectedValue: ").append(toIndentedString(listSelectedValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numericalValue: ").append(toIndentedString(numericalValue)).append("\n");
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
