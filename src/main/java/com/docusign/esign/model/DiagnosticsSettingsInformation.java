package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DiagnosticsSettingsInformation
 */

public class DiagnosticsSettingsInformation {
  @JsonProperty("apiRequestLogging")
  private String apiRequestLogging = null;

  @JsonProperty("apiRequestLogMaxEntries")
  private String apiRequestLogMaxEntries = null;

  @JsonProperty("apiRequestLogRemainingEntries")
  private String apiRequestLogRemainingEntries = null;

  public DiagnosticsSettingsInformation apiRequestLogging(String apiRequestLogging) {
    this.apiRequestLogging = apiRequestLogging;
    return this;
  }

   /**
   *  When set to **true**, enables API request logging for the user. 
   * @return apiRequestLogging
  **/
  @ApiModelProperty(example = "null", value = " When set to **true**, enables API request logging for the user. ")
  public String getApiRequestLogging() {
    return apiRequestLogging;
  }

  public void setApiRequestLogging(String apiRequestLogging) {
    this.apiRequestLogging = apiRequestLogging;
  }

  public DiagnosticsSettingsInformation apiRequestLogMaxEntries(String apiRequestLogMaxEntries) {
    this.apiRequestLogMaxEntries = apiRequestLogMaxEntries;
    return this;
  }

   /**
   * Specifies the maximum number of API requests to log.
   * @return apiRequestLogMaxEntries
  **/
  @ApiModelProperty(example = "null", value = "Specifies the maximum number of API requests to log.")
  public String getApiRequestLogMaxEntries() {
    return apiRequestLogMaxEntries;
  }

  public void setApiRequestLogMaxEntries(String apiRequestLogMaxEntries) {
    this.apiRequestLogMaxEntries = apiRequestLogMaxEntries;
  }

  public DiagnosticsSettingsInformation apiRequestLogRemainingEntries(String apiRequestLogRemainingEntries) {
    this.apiRequestLogRemainingEntries = apiRequestLogRemainingEntries;
    return this;
  }

   /**
   * Indicates the remaining number of API requests that can be logged.
   * @return apiRequestLogRemainingEntries
  **/
  @ApiModelProperty(example = "null", value = "Indicates the remaining number of API requests that can be logged.")
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
    return Objects.equals(this.apiRequestLogging, diagnosticsSettingsInformation.apiRequestLogging) &&
        Objects.equals(this.apiRequestLogMaxEntries, diagnosticsSettingsInformation.apiRequestLogMaxEntries) &&
        Objects.equals(this.apiRequestLogRemainingEntries, diagnosticsSettingsInformation.apiRequestLogRemainingEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiRequestLogging, apiRequestLogMaxEntries, apiRequestLogRemainingEntries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticsSettingsInformation {\n");
    
    sb.append("    apiRequestLogging: ").append(toIndentedString(apiRequestLogging)).append("\n");
    sb.append("    apiRequestLogMaxEntries: ").append(toIndentedString(apiRequestLogMaxEntries)).append("\n");
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

