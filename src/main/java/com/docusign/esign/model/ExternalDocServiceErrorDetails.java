package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ExternalDocServiceErrorDetails   {
  
  private String authenticationUrl = null;
  private String errorCode = null;
  private String message = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("authenticationUrl")
  public String getAuthenticationUrl() {
    return authenticationUrl;
  }
  public void setAuthenticationUrl(String authenticationUrl) {
    this.authenticationUrl = authenticationUrl;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
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

    return true && Objects.equals(authenticationUrl, externalDocServiceErrorDetails.authenticationUrl) &&
        Objects.equals(errorCode, externalDocServiceErrorDetails.errorCode) &&
        Objects.equals(message, externalDocServiceErrorDetails.message)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationUrl, errorCode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDocServiceErrorDetails {\n");
    
    if (authenticationUrl != null)
      sb.append("    authenticationUrl: ").append(toIndentedString(authenticationUrl)).append("\n");
    if (errorCode != null)
      sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    if (message != null)
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

