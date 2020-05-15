package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectLog;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectLogs
 */

public class ConnectLogs {
  @JsonProperty("failures")
  private java.util.List<ConnectLog> failures = null;

  @JsonProperty("logs")
  private java.util.List<ConnectLog> logs = null;

  @JsonProperty("totalRecords")
  private String totalRecords = null;

  @JsonProperty("type")
  private String type = null;

  public ConnectLogs failures(java.util.List<ConnectLog> failures) {
    this.failures = failures;
    return this;
  }

  public ConnectLogs addFailuresItem(ConnectLog failuresItem) {
    if (this.failures == null) {
      this.failures = new java.util.ArrayList<ConnectLog>();
    }
    this.failures.add(failuresItem);
    return this;
  }

   /**
   * An array of containing failure information from the Connect failure log.
   * @return failures
  **/
  @ApiModelProperty(value = "An array of containing failure information from the Connect failure log.")
  public java.util.List<ConnectLog> getFailures() {
    return failures;
  }

  public void setFailures(java.util.List<ConnectLog> failures) {
    this.failures = failures;
  }

  public ConnectLogs logs(java.util.List<ConnectLog> logs) {
    this.logs = logs;
    return this;
  }

  public ConnectLogs addLogsItem(ConnectLog logsItem) {
    if (this.logs == null) {
      this.logs = new java.util.ArrayList<ConnectLog>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * A complex type containing Connect log information. It is divided into two sections, one for regular logs and one for Connect failures. 
   * @return logs
  **/
  @ApiModelProperty(value = "A complex type containing Connect log information. It is divided into two sections, one for regular logs and one for Connect failures. ")
  public java.util.List<ConnectLog> getLogs() {
    return logs;
  }

  public void setLogs(java.util.List<ConnectLog> logs) {
    this.logs = logs;
  }

  public ConnectLogs totalRecords(String totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * 
   * @return totalRecords
  **/
  @ApiModelProperty(value = "")
  public String getTotalRecords() {
    return totalRecords;
  }

  public void setTotalRecords(String totalRecords) {
    this.totalRecords = totalRecords;
  }

  public ConnectLogs type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectLogs connectLogs = (ConnectLogs) o;
    return Objects.equals(this.failures, connectLogs.failures) &&
        Objects.equals(this.logs, connectLogs.logs) &&
        Objects.equals(this.totalRecords, connectLogs.totalRecords) &&
        Objects.equals(this.type, connectLogs.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failures, logs, totalRecords, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectLogs {\n");
    
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

