package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectDebugLog
 */

public class ConnectDebugLog {
  @JsonProperty("connectConfig")
  private String connectConfig = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("eventDateTime")
  private String eventDateTime = null;

  @JsonProperty("eventDescription")
  private String eventDescription = null;

  @JsonProperty("payload")
  private String payload = null;

  public ConnectDebugLog connectConfig(String connectConfig) {
    this.connectConfig = connectConfig;
    return this;
  }

   /**
   * 
   * @return connectConfig
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConnectConfig() {
    return connectConfig;
  }

  public void setConnectConfig(String connectConfig) {
    this.connectConfig = connectConfig;
  }

  public ConnectDebugLog errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public ConnectDebugLog eventDateTime(String eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }

   /**
   * 
   * @return eventDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEventDateTime() {
    return eventDateTime;
  }

  public void setEventDateTime(String eventDateTime) {
    this.eventDateTime = eventDateTime;
  }

  public ConnectDebugLog eventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
    return this;
  }

   /**
   * 
   * @return eventDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEventDescription() {
    return eventDescription;
  }

  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  public ConnectDebugLog payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * 
   * @return payload
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectDebugLog connectDebugLog = (ConnectDebugLog) o;
    return Objects.equals(this.connectConfig, connectDebugLog.connectConfig) &&
        Objects.equals(this.errorDetails, connectDebugLog.errorDetails) &&
        Objects.equals(this.eventDateTime, connectDebugLog.eventDateTime) &&
        Objects.equals(this.eventDescription, connectDebugLog.eventDescription) &&
        Objects.equals(this.payload, connectDebugLog.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectConfig, errorDetails, eventDateTime, eventDescription, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectDebugLog {\n");
    
    sb.append("    connectConfig: ").append(toIndentedString(connectConfig)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

