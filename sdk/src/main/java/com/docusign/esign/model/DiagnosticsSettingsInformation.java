package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class DiagnosticsSettingsInformation   {
  
  private String apiRequestLogging = null;
  private String apiRequestLogMaxEntries = null;
  private String apiRequestLogRemainingEntries = null;

  
  /**
   * When set to **true**, enables API request logging for the user.
   **/
  @ApiModelProperty(value = "When set to **true**, enables API request logging for the user.")
  @JsonProperty("apiRequestLogging")
  public String getApiRequestLogging() {
    return apiRequestLogging;
  }
  public void setApiRequestLogging(String apiRequestLogging) {
    this.apiRequestLogging = apiRequestLogging;
  }

  
  /**
   * Specifies the maximum number of API requests to log.
   **/
  @ApiModelProperty(value = "Specifies the maximum number of API requests to log.")
  @JsonProperty("apiRequestLogMaxEntries")
  public String getApiRequestLogMaxEntries() {
    return apiRequestLogMaxEntries;
  }
  public void setApiRequestLogMaxEntries(String apiRequestLogMaxEntries) {
    this.apiRequestLogMaxEntries = apiRequestLogMaxEntries;
  }

  
  /**
   * Indicates the remaining number of API requests that can be logged.
   **/
  @ApiModelProperty(value = "Indicates the remaining number of API requests that can be logged.")
  @JsonProperty("apiRequestLogRemainingEntries")
  public String getApiRequestLogRemainingEntries() {
    return apiRequestLogRemainingEntries;
  }
  public void setApiRequestLogRemainingEntries(String apiRequestLogRemainingEntries) {
    this.apiRequestLogRemainingEntries = apiRequestLogRemainingEntries;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticsSettingsInformation diagnosticsSettingsInformation = (DiagnosticsSettingsInformation) o;
    return Objects.equals(apiRequestLogging, diagnosticsSettingsInformation.apiRequestLogging) &&
        Objects.equals(apiRequestLogMaxEntries, diagnosticsSettingsInformation.apiRequestLogMaxEntries) &&
        Objects.equals(apiRequestLogRemainingEntries, diagnosticsSettingsInformation.apiRequestLogRemainingEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiRequestLogging, apiRequestLogMaxEntries, apiRequestLogRemainingEntries);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticsSettingsInformation {\n");
    
    sb.append("    apiRequestLogging: ").append(StringUtil.toIndentedString(apiRequestLogging)).append("\n");
    sb.append("    apiRequestLogMaxEntries: ").append(StringUtil.toIndentedString(apiRequestLogMaxEntries)).append("\n");
    sb.append("    apiRequestLogRemainingEntries: ").append(StringUtil.toIndentedString(apiRequestLogRemainingEntries)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
