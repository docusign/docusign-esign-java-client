package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExternalDocServiceErrorDetails
 */

public class ExternalDocServiceErrorDetails {
  @JsonProperty("authenticationUrl")
  private String authenticationUrl = null;

  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("message")
  private String message = null;

  public ExternalDocServiceErrorDetails authenticationUrl(String authenticationUrl) {
    this.authenticationUrl = authenticationUrl;
    return this;
  }

   /**
   * Reserved: TBD
   * @return authenticationUrl
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public String getAuthenticationUrl() {
    return authenticationUrl;
  }

  public void setAuthenticationUrl(String authenticationUrl) {
    this.authenticationUrl = authenticationUrl;
  }

  public ExternalDocServiceErrorDetails errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ExternalDocServiceErrorDetails message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDocServiceErrorDetails externalDocServiceErrorDetails = (ExternalDocServiceErrorDetails) o;
    return Objects.equals(this.authenticationUrl, externalDocServiceErrorDetails.authenticationUrl) &&
        Objects.equals(this.errorCode, externalDocServiceErrorDetails.errorCode) &&
        Objects.equals(this.message, externalDocServiceErrorDetails.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationUrl, errorCode, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDocServiceErrorDetails {\n");
    
    sb.append("    authenticationUrl: ").append(toIndentedString(authenticationUrl)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

