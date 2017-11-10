package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ApiRequestLog;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about mutiple API request logs.
 */
@ApiModel(description = "Contains information about mutiple API request logs.")

public class ApiRequestLogsResult {
  @JsonProperty("apiRequestLogs")
  private java.util.List<ApiRequestLog> apiRequestLogs = new java.util.ArrayList<ApiRequestLog>();

  public ApiRequestLogsResult apiRequestLogs(java.util.List<ApiRequestLog> apiRequestLogs) {
    this.apiRequestLogs = apiRequestLogs;
    return this;
  }

  public ApiRequestLogsResult addApiRequestLogsItem(ApiRequestLog apiRequestLogsItem) {
    this.apiRequestLogs.add(apiRequestLogsItem);
    return this;
  }

   /**
   * Reserved: TBD
   * @return apiRequestLogs
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public java.util.List<ApiRequestLog> getApiRequestLogs() {
    return apiRequestLogs;
  }

  public void setApiRequestLogs(java.util.List<ApiRequestLog> apiRequestLogs) {
    this.apiRequestLogs = apiRequestLogs;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(apiRequestLogs);
  }


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

