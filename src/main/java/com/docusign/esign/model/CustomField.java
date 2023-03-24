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
 * This object provides details about a custom field..
 *
 */
@Schema(description = "This object provides details about a custom field.")

public class CustomField {
  @JsonProperty("customFieldType")
  private String customFieldType = null;

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
   * customFieldType.
   *
   * @return CustomField
   **/
  public CustomField customFieldType(String customFieldType) {
    this.customFieldType = customFieldType;
    return this;
  }

  /**
   * .
   * @return customFieldType
   **/
  @Schema(description = "")
  public String getCustomFieldType() {
    return customFieldType;
  }

  /**
   * setCustomFieldType.
   **/
  public void setCustomFieldType(String customFieldType) {
    this.customFieldType = customFieldType;
  }


  /**
   * errorDetails.
   *
   * @return CustomField
   **/
  public CustomField errorDetails(ErrorDetails errorDetails) {
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
   * fieldId.
   *
   * @return CustomField
   **/
  public CustomField fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * .
   * @return fieldId
   **/
  @Schema(description = "")
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
   * @return CustomField
   **/
  public CustomField listItems(java.util.List<String> listItems) {
    this.listItems = listItems;
    return this;
  }
  
  /**
   * addListItemsItem.
   *
   * @return CustomField
   **/
  public CustomField addListItemsItem(String listItemsItem) {
    if (this.listItems == null) {
      this.listItems = new java.util.ArrayList<>();
    }
    this.listItems.add(listItemsItem);
    return this;
  }

  /**
   * .
   * @return listItems
   **/
  @Schema(description = "")
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
   * @return CustomField
   **/
  public CustomField name(String name) {
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
   * required.
   *
   * @return CustomField
   **/
  public CustomField required(String required) {
    this.required = required;
    return this;
  }

  /**
   * When set to **true**, the signer is required to fill out this tab.
   * @return required
   **/
  @Schema(description = "When set to **true**, the signer is required to fill out this tab")
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
   * @return CustomField
   **/
  public CustomField show(String show) {
    this.show = show;
    return this;
  }

  /**
   * .
   * @return show
   **/
  @Schema(description = "")
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
   * @return CustomField
   **/
  public CustomField value(String value) {
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
    CustomField customField = (CustomField) o;
    return Objects.equals(this.customFieldType, customField.customFieldType) &&
        Objects.equals(this.errorDetails, customField.errorDetails) &&
        Objects.equals(this.fieldId, customField.fieldId) &&
        Objects.equals(this.listItems, customField.listItems) &&
        Objects.equals(this.name, customField.name) &&
        Objects.equals(this.required, customField.required) &&
        Objects.equals(this.show, customField.show) &&
        Objects.equals(this.value, customField.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(customFieldType, errorDetails, fieldId, listItems, name, required, show, value);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomField {\n");
    
    sb.append("    customFieldType: ").append(toIndentedString(customFieldType)).append("\n");
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

