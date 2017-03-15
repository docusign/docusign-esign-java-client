package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ConnectDebugLog   {
  
  private String connectConfig = null;
  private ErrorDetails errorDetails = null;
  private String eventDateTime = null;
  private String eventDescription = null;
  private String payload = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectConfig")
  public String getConnectConfig() {
    return connectConfig;
  }
  public void setConnectConfig(String connectConfig) {
    this.connectConfig = connectConfig;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eventDateTime")
  public String getEventDateTime() {
    return eventDateTime;
  }
  public void setEventDateTime(String eventDateTime) {
    this.eventDateTime = eventDateTime;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eventDescription")
  public String getEventDescription() {
    return eventDescription;
  }
  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("payload")
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

    return true && Objects.equals(connectConfig, connectDebugLog.connectConfig) &&
        Objects.equals(errorDetails, connectDebugLog.errorDetails) &&
        Objects.equals(eventDateTime, connectDebugLog.eventDateTime) &&
        Objects.equals(eventDescription, connectDebugLog.eventDescription) &&
        Objects.equals(payload, connectDebugLog.payload)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectConfig, errorDetails, eventDateTime, eventDescription, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectDebugLog {\n");
    
    if (connectConfig != null)
      sb.append("    connectConfig: ").append(toIndentedString(connectConfig)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (eventDateTime != null)
      sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    if (eventDescription != null)
      sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    if (payload != null)
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

