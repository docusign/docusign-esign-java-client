package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EventResult
 */

public class EventResult {
  @JsonProperty("eventTimestamp")
  private String eventTimestamp = null;

  @JsonProperty("failureDescription")
  private String failureDescription = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("vendorFailureStatusCode")
  private String vendorFailureStatusCode = null;

  public EventResult eventTimestamp(String eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
    return this;
  }

   /**
   * 
   * @return eventTimestamp
  **/
  @ApiModelProperty(value = "")
  public String getEventTimestamp() {
    return eventTimestamp;
  }

  public void setEventTimestamp(String eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  public EventResult failureDescription(String failureDescription) {
    this.failureDescription = failureDescription;
    return this;
  }

   /**
   * 
   * @return failureDescription
  **/
  @ApiModelProperty(value = "")
  public String getFailureDescription() {
    return failureDescription;
  }

  public void setFailureDescription(String failureDescription) {
    this.failureDescription = failureDescription;
  }

  public EventResult status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public EventResult vendorFailureStatusCode(String vendorFailureStatusCode) {
    this.vendorFailureStatusCode = vendorFailureStatusCode;
    return this;
  }

   /**
   * 
   * @return vendorFailureStatusCode
  **/
  @ApiModelProperty(value = "")
  public String getVendorFailureStatusCode() {
    return vendorFailureStatusCode;
  }

  public void setVendorFailureStatusCode(String vendorFailureStatusCode) {
    this.vendorFailureStatusCode = vendorFailureStatusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventResult eventResult = (EventResult) o;
    return Objects.equals(this.eventTimestamp, eventResult.eventTimestamp) &&
        Objects.equals(this.failureDescription, eventResult.failureDescription) &&
        Objects.equals(this.status, eventResult.status) &&
        Objects.equals(this.vendorFailureStatusCode, eventResult.vendorFailureStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTimestamp, failureDescription, status, vendorFailureStatusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResult {\n");
    
    sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
    sb.append("    failureDescription: ").append(toIndentedString(failureDescription)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vendorFailureStatusCode: ").append(toIndentedString(vendorFailureStatusCode)).append("\n");
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

