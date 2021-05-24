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
 * FormDataItem
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

  public FormDataItem errorDetails(ErrorDetails errorDetails) {
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

  public FormDataItem listSelectedValue(String listSelectedValue) {
    this.listSelectedValue = listSelectedValue;
    return this;
  }

   /**
   * 
   * @return listSelectedValue
  **/
  @ApiModelProperty(value = "")
  public String getListSelectedValue() {
    return listSelectedValue;
  }

  public void setListSelectedValue(String listSelectedValue) {
    this.listSelectedValue = listSelectedValue;
  }

  public FormDataItem name(String name) {
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

  public FormDataItem numericalValue(String numericalValue) {
    this.numericalValue = numericalValue;
    return this;
  }

   /**
   * 
   * @return numericalValue
  **/
  @ApiModelProperty(value = "")
  public String getNumericalValue() {
    return numericalValue;
  }

  public void setNumericalValue(String numericalValue) {
    this.numericalValue = numericalValue;
  }

  public FormDataItem originalValue(String originalValue) {
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

  public FormDataItem value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Specifies the value of the tab. 
   * @return value
  **/
  @ApiModelProperty(value = "Specifies the value of the tab. ")
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
    FormDataItem formDataItem = (FormDataItem) o;
    return Objects.equals(this.errorDetails, formDataItem.errorDetails) &&
        Objects.equals(this.listSelectedValue, formDataItem.listSelectedValue) &&
        Objects.equals(this.name, formDataItem.name) &&
        Objects.equals(this.numericalValue, formDataItem.numericalValue) &&
        Objects.equals(this.originalValue, formDataItem.originalValue) &&
        Objects.equals(this.value, formDataItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, listSelectedValue, name, numericalValue, originalValue, value);
  }


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

