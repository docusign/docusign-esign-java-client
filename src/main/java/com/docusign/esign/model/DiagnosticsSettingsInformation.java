package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticsSettingsInformation diagnosticsSettingsInformation = (DiagnosticsSettingsInformation) o;

    return true && Objects.equals(apiRequestLogging, diagnosticsSettingsInformation.apiRequestLogging) &&
        Objects.equals(apiRequestLogMaxEntries, diagnosticsSettingsInformation.apiRequestLogMaxEntries) &&
        Objects.equals(apiRequestLogRemainingEntries, diagnosticsSettingsInformation.apiRequestLogRemainingEntries)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiRequestLogging, apiRequestLogMaxEntries, apiRequestLogRemainingEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticsSettingsInformation {\n");
    
    if (apiRequestLogging != null)
      sb.append("    apiRequestLogging: ").append(toIndentedString(apiRequestLogging)).append("\n");
    if (apiRequestLogMaxEntries != null)
      sb.append("    apiRequestLogMaxEntries: ").append(toIndentedString(apiRequestLogMaxEntries)).append("\n");
    if (apiRequestLogRemainingEntries != null)
      sb.append("    apiRequestLogRemainingEntries: ").append(toIndentedString(apiRequestLogRemainingEntries)).append("\n");
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

