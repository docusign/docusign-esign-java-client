package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EventResult   {
  
  private String eventTimestamp = null;
  private String failureDescription = null;
  private String status = null;
  private String vendorFailureStatusCode = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eventTimestamp")
  public String getEventTimestamp() {
    return eventTimestamp;
  }
  public void setEventTimestamp(String eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("failureDescription")
  public String getFailureDescription() {
    return failureDescription;
  }
  public void setFailureDescription(String failureDescription) {
    this.failureDescription = failureDescription;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vendorFailureStatusCode")
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

    return true && Objects.equals(eventTimestamp, eventResult.eventTimestamp) &&
        Objects.equals(failureDescription, eventResult.failureDescription) &&
        Objects.equals(status, eventResult.status) &&
        Objects.equals(vendorFailureStatusCode, eventResult.vendorFailureStatusCode)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTimestamp, failureDescription, status, vendorFailureStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResult {\n");
    
    if (eventTimestamp != null)
      sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
    if (failureDescription != null)
      sb.append("    failureDescription: ").append(toIndentedString(failureDescription)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (vendorFailureStatusCode != null)
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

