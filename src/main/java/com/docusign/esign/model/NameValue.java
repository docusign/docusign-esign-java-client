package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class NameValue   {
  
  private ErrorDetails errorDetails = null;
  private String name = null;
  private String originalValue = null;
  private String value = null;

  
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

  
  /**
   * The name or key of a name/value pair.
   **/
  
  @ApiModelProperty(value = "The name or key of a name/value pair.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The initial value of the tab when it was sent to the recipient.
   **/
  
  @ApiModelProperty(value = "The initial value of the tab when it was sent to the recipient.")
  @JsonProperty("originalValue")
  public String getOriginalValue() {
    return originalValue;
  }
  public void setOriginalValue(String originalValue) {
    this.originalValue = originalValue;
  }

  
  /**
   * The value field of a name/value pair.
   **/
  
  @ApiModelProperty(value = "The value field of a name/value pair.")
  @JsonProperty("value")
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

    return true && Objects.equals(errorDetails, nameValue.errorDetails) &&
        Objects.equals(name, nameValue.name) &&
        Objects.equals(originalValue, nameValue.originalValue) &&
        Objects.equals(value, nameValue.value)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, name, originalValue, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameValue {\n");
    
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (originalValue != null)
      sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    if (value != null)
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

