package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SmartContractInformation
 */

public class SmartContractInformation {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("uri")
  private String uri = null;

  public SmartContractInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SmartContractInformation uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartContractInformation smartContractInformation = (SmartContractInformation) o;
    return Objects.equals(this.code, smartContractInformation.code) &&
        Objects.equals(this.uri, smartContractInformation.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartContractInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

