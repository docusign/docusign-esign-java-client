package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.ApiRequestLog;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class ApiRequestLogsResult   {
  
  private java.util.List<ApiRequestLog> apiRequestLogs = new java.util.ArrayList<ApiRequestLog>();

  
  /**
   * Reserved: TBD
   **/
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("apiRequestLogs")
  public java.util.List<ApiRequestLog> getApiRequestLogs() {
    return apiRequestLogs;
  }
  public void setApiRequestLogs(java.util.List<ApiRequestLog> apiRequestLogs) {
    this.apiRequestLogs = apiRequestLogs;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequestLogsResult apiRequestLogsResult = (ApiRequestLogsResult) o;
    return Objects.equals(apiRequestLogs, apiRequestLogsResult.apiRequestLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiRequestLogs);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestLogsResult {\n");
    
    sb.append("    apiRequestLogs: ").append(StringUtil.toIndentedString(apiRequestLogs)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
