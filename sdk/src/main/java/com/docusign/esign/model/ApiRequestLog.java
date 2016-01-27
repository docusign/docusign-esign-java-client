package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class ApiRequestLog   {
  
  private String status = null;
  private String description = null;
  private String createdDateTime = null;
  private String requestLogId = null;

  
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
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Indicates the date and time the item was created.
   **/
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  @JsonProperty("createdDateTime")
  public String getCreatedDateTime() {
    return createdDateTime;
  }
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("requestLogId")
  public String getRequestLogId() {
    return requestLogId;
  }
  public void setRequestLogId(String requestLogId) {
    this.requestLogId = requestLogId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequestLog apiRequestLog = (ApiRequestLog) o;
    return Objects.equals(status, apiRequestLog.status) &&
        Objects.equals(description, apiRequestLog.description) &&
        Objects.equals(createdDateTime, apiRequestLog.createdDateTime) &&
        Objects.equals(requestLogId, apiRequestLog.requestLogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, description, createdDateTime, requestLogId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestLog {\n");
    
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    createdDateTime: ").append(StringUtil.toIndentedString(createdDateTime)).append("\n");
    sb.append("    requestLogId: ").append(StringUtil.toIndentedString(requestLogId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
