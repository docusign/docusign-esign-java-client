package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ConnectLog;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ConnectLogs   {
  
  private java.util.List<ConnectLog> failures = new java.util.ArrayList<ConnectLog>();
  private java.util.List<ConnectLog> logs = new java.util.ArrayList<ConnectLog>();
  private String totalRecords = null;
  private String type = null;

  
  /**
   * An array of containing failure information from the Connect failure log.
   **/
  
  @ApiModelProperty(value = "An array of containing failure information from the Connect failure log.")
  @JsonProperty("failures")
  public java.util.List<ConnectLog> getFailures() {
    return failures;
  }
  public void setFailures(java.util.List<ConnectLog> failures) {
    this.failures = failures;
  }

  
  /**
   * A complex type containing Connect log information. It is divided into two sections, one for regular logs and one for Connect failures.
   **/
  
  @ApiModelProperty(value = "A complex type containing Connect log information. It is divided into two sections, one for regular logs and one for Connect failures.")
  @JsonProperty("logs")
  public java.util.List<ConnectLog> getLogs() {
    return logs;
  }
  public void setLogs(java.util.List<ConnectLog> logs) {
    this.logs = logs;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalRecords")
  public String getTotalRecords() {
    return totalRecords;
  }
  public void setTotalRecords(String totalRecords) {
    this.totalRecords = totalRecords;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
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

    return true && Objects.equals(failures, connectLogs.failures) &&
        Objects.equals(logs, connectLogs.logs) &&
        Objects.equals(totalRecords, connectLogs.totalRecords) &&
        Objects.equals(type, connectLogs.type)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(failures, logs, totalRecords, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectLogs {\n");
    
    if (failures != null)
      sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    if (logs != null)
      sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    if (totalRecords != null)
      sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    if (type != null)
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

