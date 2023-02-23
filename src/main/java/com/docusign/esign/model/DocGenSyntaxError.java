package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DocGenSyntaxError.
 *
 */

public class DocGenSyntaxError {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("tagIdentifier")
  private String tagIdentifier = null;

  /**
   * errorCode.
   *
   * @return DocGenSyntaxError
   **/
  public DocGenSyntaxError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * .
   * 
   * @return errorCode
   **/
  @Schema(description = "")
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * setErrorCode.
   **/
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * message.
   *
   * @return DocGenSyntaxError
   **/
  public DocGenSyntaxError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * .
   * 
   * @return message
   **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  /**
   * setMessage.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * tagIdentifier.
   *
   * @return DocGenSyntaxError
   **/
  public DocGenSyntaxError tagIdentifier(String tagIdentifier) {
    this.tagIdentifier = tagIdentifier;
    return this;
  }

  /**
   * .
   * 
   * @return tagIdentifier
   **/
  @Schema(description = "")
  public String getTagIdentifier() {
    return tagIdentifier;
  }

  /**
   * setTagIdentifier.
   **/
  public void setTagIdentifier(String tagIdentifier) {
    this.tagIdentifier = tagIdentifier;
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
    DocGenSyntaxError docGenSyntaxError = (DocGenSyntaxError) o;
    return Objects.equals(this.errorCode, docGenSyntaxError.errorCode) &&
        Objects.equals(this.message, docGenSyntaxError.message) &&
        Objects.equals(this.tagIdentifier, docGenSyntaxError.tagIdentifier);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, tagIdentifier);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocGenSyntaxError {\n");

    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    tagIdentifier: ").append(toIndentedString(tagIdentifier)).append("\n");
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
