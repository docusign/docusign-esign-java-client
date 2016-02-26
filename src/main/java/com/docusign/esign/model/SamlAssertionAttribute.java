package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class SamlAssertionAttribute   {
  
  private String name = null;
  private String value = null;
  private ErrorDetails errorDetails = null;

  
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
    SamlAssertionAttribute samlAssertionAttribute = (SamlAssertionAttribute) o;

    return true && Objects.equals(name, samlAssertionAttribute.name) &&
        Objects.equals(value, samlAssertionAttribute.value) &&
        Objects.equals(errorDetails, samlAssertionAttribute.errorDetails)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlAssertionAttribute {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

