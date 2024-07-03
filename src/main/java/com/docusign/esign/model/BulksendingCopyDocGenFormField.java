package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkSendingCopyDocGenFormFieldRowValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * BulksendingCopyDocGenFormField.
 *
 */

public class BulksendingCopyDocGenFormField implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rowValues")
  private java.util.List<BulkSendingCopyDocGenFormFieldRowValue> rowValues = null;

  @JsonProperty("value")
  private String value = null;


  /**
   * name.
   *
   * @return BulksendingCopyDocGenFormField
   **/
  public BulksendingCopyDocGenFormField name(String name) {
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
   * rowValues.
   *
   * @return BulksendingCopyDocGenFormField
   **/
  public BulksendingCopyDocGenFormField rowValues(java.util.List<BulkSendingCopyDocGenFormFieldRowValue> rowValues) {
    this.rowValues = rowValues;
    return this;
  }
  
  /**
   * addRowValuesItem.
   *
   * @return BulksendingCopyDocGenFormField
   **/
  public BulksendingCopyDocGenFormField addRowValuesItem(BulkSendingCopyDocGenFormFieldRowValue rowValuesItem) {
    if (this.rowValues == null) {
      this.rowValues = new java.util.ArrayList<>();
    }
    this.rowValues.add(rowValuesItem);
    return this;
  }

  /**
   * .
   * @return rowValues
   **/
  @Schema(description = "")
  public java.util.List<BulkSendingCopyDocGenFormFieldRowValue> getRowValues() {
    return rowValues;
  }

  /**
   * setRowValues.
   **/
  public void setRowValues(java.util.List<BulkSendingCopyDocGenFormFieldRowValue> rowValues) {
    this.rowValues = rowValues;
  }


  /**
   * value.
   *
   * @return BulksendingCopyDocGenFormField
   **/
  public BulksendingCopyDocGenFormField value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value of the tab. .
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
    BulksendingCopyDocGenFormField bulksendingCopyDocGenFormField = (BulksendingCopyDocGenFormField) o;
    return Objects.equals(this.name, bulksendingCopyDocGenFormField.name) &&
        Objects.equals(this.rowValues, bulksendingCopyDocGenFormField.rowValues) &&
        Objects.equals(this.value, bulksendingCopyDocGenFormField.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, rowValues, value);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulksendingCopyDocGenFormField {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rowValues: ").append(toIndentedString(rowValues)).append("\n");
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

