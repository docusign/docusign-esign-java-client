package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ConnectDebugLog.
 *
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


  /**
   * connectConfig.
   *
   * @return ConnectDebugLog
   **/
  public ConnectDebugLog connectConfig(String connectConfig) {
    this.connectConfig = connectConfig;
    return this;
  }

  /**
   * .
   * @return connectConfig
   **/
  @Schema(description = "")
  public String getConnectConfig() {
    return connectConfig;
  }

  /**
   * setConnectConfig.
   **/
  public void setConnectConfig(String connectConfig) {
    this.connectConfig = connectConfig;
  }


  /**
   * errorDetails.
   *
   * @return ConnectDebugLog
   **/
  public ConnectDebugLog errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * eventDateTime.
   *
   * @return ConnectDebugLog
   **/
  public ConnectDebugLog eventDateTime(String eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }

  /**
   * .
   * @return eventDateTime
   **/
  @Schema(description = "")
  public String getEventDateTime() {
    return eventDateTime;
  }

  /**
   * setEventDateTime.
   **/
  public void setEventDateTime(String eventDateTime) {
    this.eventDateTime = eventDateTime;
  }


  /**
   * eventDescription.
   *
   * @return ConnectDebugLog
   **/
  public ConnectDebugLog eventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
    return this;
  }

  /**
   * .
   * @return eventDescription
   **/
  @Schema(description = "")
  public String getEventDescription() {
    return eventDescription;
  }

  /**
   * setEventDescription.
   **/
  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }


  /**
   * payload.
   *
   * @return ConnectDebugLog
   **/
  public ConnectDebugLog payload(String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * .
   * @return payload
   **/
  @Schema(description = "")
  public String getPayload() {
    return payload;
  }

  /**
   * setPayload.
   **/
  public void setPayload(String payload) {
    this.payload = payload;
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
    ConnectDebugLog connectDebugLog = (ConnectDebugLog) o;
    return Objects.equals(this.connectConfig, connectDebugLog.connectConfig) &&
        Objects.equals(this.errorDetails, connectDebugLog.errorDetails) &&
        Objects.equals(this.eventDateTime, connectDebugLog.eventDateTime) &&
        Objects.equals(this.eventDescription, connectDebugLog.eventDescription) &&
        Objects.equals(this.payload, connectDebugLog.payload);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(connectConfig, errorDetails, eventDateTime, eventDescription, payload);
  }


  /**
   * Converts the given object to string.
   */
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

