package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class ErrorDetails   {
  
  private String errorCode = null;
  private String message = null;

  
  /**
   * An error code associated with the error.
   **/
  @ApiModelProperty(value = "An error code associated with the error.")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  
  /**
   * A short error message.
   **/
  @ApiModelProperty(value = "A short error message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(errorCode, errorDetails.errorCode) &&
        Objects.equals(message, errorDetails.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
    sb.append("    errorCode: ").append(StringUtil.toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
