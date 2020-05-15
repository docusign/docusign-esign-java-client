package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectFailureResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectFailureResults
 */

public class ConnectFailureResults {
  @JsonProperty("retryQueue")
  private java.util.List<ConnectFailureResult> retryQueue = null;

  public ConnectFailureResults retryQueue(java.util.List<ConnectFailureResult> retryQueue) {
    this.retryQueue = retryQueue;
    return this;
  }

  public ConnectFailureResults addRetryQueueItem(ConnectFailureResult retryQueueItem) {
    if (this.retryQueue == null) {
      this.retryQueue = new java.util.ArrayList<ConnectFailureResult>();
    }
    this.retryQueue.add(retryQueueItem);
    return this;
  }

   /**
   * 
   * @return retryQueue
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ConnectFailureResult> getRetryQueue() {
    return retryQueue;
  }

  public void setRetryQueue(java.util.List<ConnectFailureResult> retryQueue) {
    this.retryQueue = retryQueue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectFailureResults connectFailureResults = (ConnectFailureResults) o;
    return Objects.equals(this.retryQueue, connectFailureResults.retryQueue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retryQueue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectFailureResults {\n");
    
    sb.append("    retryQueue: ").append(toIndentedString(retryQueue)).append("\n");
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

