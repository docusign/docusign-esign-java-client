package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.TspHealthCheckStatusDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TspHealthCheckRequest
 */

public class TspHealthCheckRequest {
  @JsonProperty("appVersion")
  private String appVersion = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusDescription")
  private java.util.List<TspHealthCheckStatusDescription> statusDescription = new java.util.ArrayList<TspHealthCheckStatusDescription>();

  public TspHealthCheckRequest appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * 
   * @return appVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public TspHealthCheckRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TspHealthCheckRequest error(String error) {
    this.error = error;
    return this;
  }

   /**
   * 
   * @return error
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public TspHealthCheckRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TspHealthCheckRequest statusDescription(java.util.List<TspHealthCheckStatusDescription> statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

  public TspHealthCheckRequest addStatusDescriptionItem(TspHealthCheckStatusDescription statusDescriptionItem) {
    this.statusDescription.add(statusDescriptionItem);
    return this;
  }

   /**
   * 
   * @return statusDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<TspHealthCheckStatusDescription> getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(java.util.List<TspHealthCheckStatusDescription> statusDescription) {
    this.statusDescription = statusDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TspHealthCheckRequest tspHealthCheckRequest = (TspHealthCheckRequest) o;
    return Objects.equals(this.appVersion, tspHealthCheckRequest.appVersion) &&
        Objects.equals(this.description, tspHealthCheckRequest.description) &&
        Objects.equals(this.error, tspHealthCheckRequest.error) &&
        Objects.equals(this.status, tspHealthCheckRequest.status) &&
        Objects.equals(this.statusDescription, tspHealthCheckRequest.statusDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVersion, description, error, status, statusDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TspHealthCheckRequest {\n");
    
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
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

