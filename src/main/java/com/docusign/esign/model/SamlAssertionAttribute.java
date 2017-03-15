package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class SamlAssertionAttribute   {
  
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
   * 
   **/
  
  @ApiModelProperty(value = "")
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
   * The value associated with the named SAML assertion attribute
   **/
  
  @ApiModelProperty(value = "The value associated with the named SAML assertion attribute")
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
    SamlAssertionAttribute samlAssertionAttribute = (SamlAssertionAttribute) o;

    return true && Objects.equals(errorDetails, samlAssertionAttribute.errorDetails) &&
        Objects.equals(name, samlAssertionAttribute.name) &&
        Objects.equals(originalValue, samlAssertionAttribute.originalValue) &&
        Objects.equals(value, samlAssertionAttribute.value)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, name, originalValue, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlAssertionAttribute {\n");
    
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

