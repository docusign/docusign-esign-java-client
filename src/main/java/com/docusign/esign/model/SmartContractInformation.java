package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SmartContractInformation.
 *
 */

public class SmartContractInformation {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("uri")
  private String uri = null;


  /**
   * code.
   *
   * @return SmartContractInformation
   **/
  public SmartContractInformation code(String code) {
    this.code = code;
    return this;
  }

  /**
   * .
   * @return code
   **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  /**
   * setCode.
   **/
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * uri.
   *
   * @return SmartContractInformation
   **/
  public SmartContractInformation uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  /**
   * setUri.
   **/
  public void setUri(String uri) {
    this.uri = uri;
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
    SmartContractInformation smartContractInformation = (SmartContractInformation) o;
    return Objects.equals(this.code, smartContractInformation.code) &&
        Objects.equals(this.uri, smartContractInformation.uri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(code, uri);
  }


  /**
   * Converts the given object to string.
   */
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

