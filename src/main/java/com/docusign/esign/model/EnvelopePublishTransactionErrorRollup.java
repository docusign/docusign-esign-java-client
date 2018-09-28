package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopePublishTransactionErrorRollup
 */

public class EnvelopePublishTransactionErrorRollup {
  @JsonProperty("count")
  private String count = null;

  @JsonProperty("errorType")
  private String errorType = null;

  public EnvelopePublishTransactionErrorRollup count(String count) {
    this.count = count;
    return this;
  }

   /**
   * 
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public EnvelopePublishTransactionErrorRollup errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

   /**
   * 
   * @return errorType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(count, errorType);
  }


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

