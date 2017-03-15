package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ConnectFailureResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ConnectFailureResults   {
  
  private java.util.List<ConnectFailureResult> retryQueue = new java.util.ArrayList<ConnectFailureResult>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retryQueue")
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

    return true && Objects.equals(retryQueue, connectFailureResults.retryQueue)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(retryQueue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectFailureResults {\n");
    
    if (retryQueue != null)
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

