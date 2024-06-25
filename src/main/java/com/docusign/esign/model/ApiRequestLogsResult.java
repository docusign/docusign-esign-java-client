package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ApiRequestLog;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Contains information about mutiple API request logs..
 *
 */
@Schema(description = "Contains information about mutiple API request logs.")

public class ApiRequestLogsResult implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("apiRequestLogs")
  private java.util.List<ApiRequestLog> apiRequestLogs = null;


  /**
   * apiRequestLogs.
   *
   * @return ApiRequestLogsResult
   **/
  public ApiRequestLogsResult apiRequestLogs(java.util.List<ApiRequestLog> apiRequestLogs) {
    this.apiRequestLogs = apiRequestLogs;
    return this;
  }
  
  /**
   * addApiRequestLogsItem.
   *
   * @return ApiRequestLogsResult
   **/
  public ApiRequestLogsResult addApiRequestLogsItem(ApiRequestLog apiRequestLogsItem) {
    if (this.apiRequestLogs == null) {
      this.apiRequestLogs = new java.util.ArrayList<>();
    }
    this.apiRequestLogs.add(apiRequestLogsItem);
    return this;
  }

  /**
   * Reserved: TBD.
   * @return apiRequestLogs
   **/
  @Schema(description = "Reserved: TBD")
  public java.util.List<ApiRequestLog> getApiRequestLogs() {
    return apiRequestLogs;
  }

  /**
   * setApiRequestLogs.
   **/
  public void setApiRequestLogs(java.util.List<ApiRequestLog> apiRequestLogs) {
    this.apiRequestLogs = apiRequestLogs;
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
    ApiRequestLogsResult apiRequestLogsResult = (ApiRequestLogsResult) o;
    return Objects.equals(this.apiRequestLogs, apiRequestLogsResult.apiRequestLogs);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(apiRequestLogs);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestLogsResult {\n");
    
    sb.append("    apiRequestLogs: ").append(toIndentedString(apiRequestLogs)).append("\n");
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

