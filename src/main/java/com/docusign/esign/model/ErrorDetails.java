package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * This object describes errors that occur. It is only valid for responses, and ignored in requests.
 **/

@ApiModel(description = "This object describes errors that occur. It is only valid for responses, and ignored in requests.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetails errorDetails = (ErrorDetails) o;

    return true && Objects.equals(errorCode, errorDetails.errorCode) &&
        Objects.equals(message, errorDetails.message)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
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

