package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulksendingCopyDocGenFormField.
 *
 */

public class BulksendingCopyDocGenFormField {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("value")
  private String value = null;


  /**
   * label.
   *
   * @return BulksendingCopyDocGenFormField
   **/
  public BulksendingCopyDocGenFormField label(String label) {
    this.label = label;
    return this;
  }

  /**
   * .
   * @return label
   **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  /**
   * setLabel.
   **/
  public void setLabel(String label) {
    this.label = label;
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
  @ApiModelProperty(value = "Specifies the value of the tab. ")
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
    return Objects.equals(this.label, bulksendingCopyDocGenFormField.label) &&
        Objects.equals(this.value, bulksendingCopyDocGenFormField.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(label, value);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulksendingCopyDocGenFormField {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

