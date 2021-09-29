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
 * ListCustomField.
 *
 */

public class ListCustomField {
  @JsonProperty("configurationType")
  private String configurationType = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("fieldId")
  private String fieldId = null;

  @JsonProperty("listItems")
  private java.util.List<String> listItems = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("required")
  private String required = null;

  @JsonProperty("show")
  private String show = null;

  @JsonProperty("value")
  private String value = null;


  /**
   * configurationType.
   *
   * @return ListCustomField
   **/
  public ListCustomField configurationType(String configurationType) {
    this.configurationType = configurationType;
    return this;
  }

  /**
   * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**..
   * @return configurationType
   **/
  @ApiModelProperty(value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
  public String getConfigurationType() {
    return configurationType;
  }

  /**
   * setConfigurationType.
   **/
  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }


  /**
   * errorDetails.
   *
   * @return ListCustomField
   **/
  public ListCustomField errorDetails(ErrorDetails errorDetails) {
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
   * fieldId.
   *
   * @return ListCustomField
   **/
  public ListCustomField fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * An ID used to specify a custom field..
   * @return fieldId
   **/
  @ApiModelProperty(value = "An ID used to specify a custom field.")
  public String getFieldId() {
    return fieldId;
  }

  /**
   * setFieldId.
   **/
  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }


  /**
   * listItems.
   *
   * @return ListCustomField
   **/
  public ListCustomField listItems(java.util.List<String> listItems) {
    this.listItems = listItems;
    return this;
  }
  
  /**
   * addListItemsItem.
   *
   * @return ListCustomField
   **/
  public ListCustomField addListItemsItem(String listItemsItem) {
    if (this.listItems == null) {
      this.listItems = new java.util.ArrayList<String>();
    }
    this.listItems.add(listItemsItem);
    return this;
  }

  /**
   * .
   * @return listItems
   **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getListItems() {
    return listItems;
  }

  /**
   * setListItems.
   **/
  public void setListItems(java.util.List<String> listItems) {
    this.listItems = listItems;
  }


  /**
   * name.
   *
   * @return ListCustomField
   **/
  public ListCustomField name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the custom field..
   * @return name
   **/
  @ApiModelProperty(value = "The name of the custom field.")
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
   * required.
   *
   * @return ListCustomField
   **/
  public ListCustomField required(String required) {
    this.required = required;
    return this;
  }

  /**
   * When set to **true**, the signer is required to fill out this tab.
   * @return required
   **/
  @ApiModelProperty(value = "When set to **true**, the signer is required to fill out this tab")
  public String getRequired() {
    return required;
  }

  /**
   * setRequired.
   **/
  public void setRequired(String required) {
    this.required = required;
  }


  /**
   * show.
   *
   * @return ListCustomField
   **/
  public ListCustomField show(String show) {
    this.show = show;
    return this;
  }

  /**
   * A boolean indicating if the value should be displayed..
   * @return show
   **/
  @ApiModelProperty(value = "A boolean indicating if the value should be displayed.")
  public String getShow() {
    return show;
  }

  /**
   * setShow.
   **/
  public void setShow(String show) {
    this.show = show;
  }


  /**
   * value.
   *
   * @return ListCustomField
   **/
  public ListCustomField value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the custom field.  Maximum Length: 100 characters..
   * @return value
   **/
  @ApiModelProperty(value = "The value of the custom field.  Maximum Length: 100 characters.")
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
    ListCustomField listCustomField = (ListCustomField) o;
    return Objects.equals(this.configurationType, listCustomField.configurationType) &&
        Objects.equals(this.errorDetails, listCustomField.errorDetails) &&
        Objects.equals(this.fieldId, listCustomField.fieldId) &&
        Objects.equals(this.listItems, listCustomField.listItems) &&
        Objects.equals(this.name, listCustomField.name) &&
        Objects.equals(this.required, listCustomField.required) &&
        Objects.equals(this.show, listCustomField.show) &&
        Objects.equals(this.value, listCustomField.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(configurationType, errorDetails, fieldId, listItems, name, required, show, value);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCustomField {\n");
    
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    listItems: ").append(toIndentedString(listItems)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
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

