package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TspHealthCheckStatusDescription */
public class TspHealthCheckStatusDescription {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("hostname")
  private String hostname = null;

  @JsonProperty("responseSeconds")
  private String responseSeconds = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private String type = null;

  public TspHealthCheckStatusDescription description(String description) {
    this.description = description;
    return this;
  }

  /** @return description */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TspHealthCheckStatusDescription error(String error) {
    this.error = error;
    return this;
  }

  /** @return error */
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public TspHealthCheckStatusDescription hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /** @return hostname */
  @ApiModelProperty(value = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public TspHealthCheckStatusDescription responseSeconds(String responseSeconds) {
    this.responseSeconds = responseSeconds;
    return this;
  }

  /** @return responseSeconds */
  @ApiModelProperty(value = "")
  public String getResponseSeconds() {
    return responseSeconds;
  }

  public void setResponseSeconds(String responseSeconds) {
    this.responseSeconds = responseSeconds;
  }

  public TspHealthCheckStatusDescription status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are: * sent - The envelope is sent to the
   * recipients. * created - The envelope is saved as a draft and can be modified and sent later.
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TspHealthCheckStatusDescription type(String type) {
    this.type = type;
    return this;
  }

  /** @return type */
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
    TspHealthCheckStatusDescription tspHealthCheckStatusDescription =
        (TspHealthCheckStatusDescription) o;
    return Objects.equals(this.description, tspHealthCheckStatusDescription.description)
        && Objects.equals(this.error, tspHealthCheckStatusDescription.error)
        && Objects.equals(this.hostname, tspHealthCheckStatusDescription.hostname)
        && Objects.equals(this.responseSeconds, tspHealthCheckStatusDescription.responseSeconds)
        && Objects.equals(this.status, tspHealthCheckStatusDescription.status)
        && Objects.equals(this.type, tspHealthCheckStatusDescription.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, error, hostname, responseSeconds, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TspHealthCheckStatusDescription {\n");

    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    responseSeconds: ").append(toIndentedString(responseSeconds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
