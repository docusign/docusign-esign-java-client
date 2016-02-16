package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class ListCustomField   {
  
  private java.util.List<String> listItems = new java.util.ArrayList<String>();
  private String fieldId = null;
  private String name = null;
  private String show = null;
  private String required = null;
  private String value = null;
  private String configurationType = null;
  private ErrorDetails errorDetails = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("listItems")
  public java.util.List<String> getListItems() {
    return listItems;
  }
  public void setListItems(java.util.List<String> listItems) {
    this.listItems = listItems;
  }

  
  /**
   * An ID used to specify a custom field.
   **/
  
  @ApiModelProperty(value = "An ID used to specify a custom field.")
  @JsonProperty("fieldId")
  public String getFieldId() {
    return fieldId;
  }
  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  
  /**
   * The name of the custom field.
   **/
  
  @ApiModelProperty(value = "The name of the custom field.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A boolean indicating if the value should be displayed.
   **/
  
  @ApiModelProperty(value = "A boolean indicating if the value should be displayed.")
  @JsonProperty("show")
  public String getShow() {
    return show;
  }
  public void setShow(String show) {
    this.show = show;
  }

  
  /**
   * When set to **true**, the signer is required to fill out this tab
   **/
  
  @ApiModelProperty(value = "When set to **true**, the signer is required to fill out this tab")
  @JsonProperty("required")
  public String getRequired() {
    return required;
  }
  public void setRequired(String required) {
    this.required = required;
  }

  
  /**
   * The value of the custom field.\n\nMaximum Length: 100 characters.
   **/
  
  @ApiModelProperty(value = "The value of the custom field.\n\nMaximum Length: 100 characters.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * If mergeField's are being used, specifies the type of the mergeFied. Currently, only **salesforce** is supported.
   **/
  
  @ApiModelProperty(value = "If mergeField's are being used, specifies the type of the mergeFied. Currently, only **salesforce** is supported.")
  @JsonProperty("configurationType")
  public String getConfigurationType() {
    return configurationType;
  }
  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCustomField listCustomField = (ListCustomField) o;

    return true && Objects.equals(listItems, listCustomField.listItems) &&
        Objects.equals(fieldId, listCustomField.fieldId) &&
        Objects.equals(name, listCustomField.name) &&
        Objects.equals(show, listCustomField.show) &&
        Objects.equals(required, listCustomField.required) &&
        Objects.equals(value, listCustomField.value) &&
        Objects.equals(configurationType, listCustomField.configurationType) &&
        Objects.equals(errorDetails, listCustomField.errorDetails)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(listItems, fieldId, name, show, required, value, configurationType, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCustomField {\n");
    
    sb.append("    listItems: ").append(toIndentedString(listItems)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

