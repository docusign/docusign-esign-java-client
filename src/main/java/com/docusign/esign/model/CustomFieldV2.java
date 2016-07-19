package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class CustomFieldV2   {
  
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
  public CustomFieldV2 fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fieldId")
  public String getFieldId() {
    return fieldId;
  }
  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  
  /**
   * 
   **/
  public CustomFieldV2 name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 
   **/
  public CustomFieldV2 show(String show) {
    this.show = show;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public CustomFieldV2 required(String required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the signer is required to fill out this tab")
  @JsonProperty("required")
  public String getRequired() {
    return required;
  }
  public void setRequired(String required) {
    this.required = required;
  }

  
  /**
   * The value of the custom field.
   **/
  public CustomFieldV2 value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of the custom field.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.
   **/
  public CustomFieldV2 configurationType(String configurationType) {
    this.configurationType = configurationType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
  @JsonProperty("configurationType")
  public String getConfigurationType() {
    return configurationType;
  }
  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }

  
  /**
   **/
  public CustomFieldV2 errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    CustomFieldV2 customFieldV2 = (CustomFieldV2) o;
    return Objects.equals(this.fieldId, customFieldV2.fieldId) &&
        Objects.equals(this.name, customFieldV2.name) &&
        Objects.equals(this.show, customFieldV2.show) &&
        Objects.equals(this.required, customFieldV2.required) &&
        Objects.equals(this.value, customFieldV2.value) &&
        Objects.equals(this.configurationType, customFieldV2.configurationType) &&
        Objects.equals(this.errorDetails, customFieldV2.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, name, show, required, value, configurationType, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldV2 {\n");
    
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

