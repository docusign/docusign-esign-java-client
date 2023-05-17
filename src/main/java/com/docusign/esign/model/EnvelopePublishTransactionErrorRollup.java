package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * EnvelopePublishTransactionErrorRollup.
 *
 */

public class EnvelopePublishTransactionErrorRollup {
  @JsonProperty("count")
  private String count = null;

  @JsonProperty("errorType")
  private String errorType = null;


  /**
   * count.
   *
   * @return EnvelopePublishTransactionErrorRollup
   **/
  public EnvelopePublishTransactionErrorRollup count(String count) {
    this.count = count;
    return this;
  }

  /**
   * .
   * @return count
   **/
  @Schema(description = "")
  public String getCount() {
    return count;
  }

  /**
   * setCount.
   **/
  public void setCount(String count) {
    this.count = count;
  }


  /**
   * errorType.
   *
   * @return EnvelopePublishTransactionErrorRollup
   **/
  public EnvelopePublishTransactionErrorRollup errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * .
   * @return errorType
   **/
  @Schema(description = "")
  public String getErrorType() {
    return errorType;
  }

  /**
   * setErrorType.
   **/
  public void setErrorType(String errorType) {
    this.errorType = errorType;
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
    EnvelopePublishTransactionErrorRollup envelopePublishTransactionErrorRollup = (EnvelopePublishTransactionErrorRollup) o;
    return Objects.equals(this.count, envelopePublishTransactionErrorRollup.count) &&
        Objects.equals(this.errorType, envelopePublishTransactionErrorRollup.errorType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(count, errorType);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopePublishTransactionErrorRollup {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
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

