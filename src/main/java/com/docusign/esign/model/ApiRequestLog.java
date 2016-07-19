package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains API request log information.
 **/

@ApiModel(description = "Contains API request log information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class ApiRequestLog   {
  
  private String status = null;
  private String description = null;
  private String createdDateTime = null;
  private String requestLogId = null;

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  public ApiRequestLog status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
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
  public ApiRequestLog description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public ApiRequestLog createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the date and time the item was created.")
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
  public ApiRequestLog requestLogId(String requestLogId) {
    this.requestLogId = requestLogId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestLogId")
  public String getRequestLogId() {
    return requestLogId;
  }
  public void setRequestLogId(String requestLogId) {
    this.requestLogId = requestLogId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequestLog apiRequestLog = (ApiRequestLog) o;
    return Objects.equals(this.status, apiRequestLog.status) &&
        Objects.equals(this.description, apiRequestLog.description) &&
        Objects.equals(this.createdDateTime, apiRequestLog.createdDateTime) &&
        Objects.equals(this.requestLogId, apiRequestLog.requestLogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, description, createdDateTime, requestLogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestLog {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    requestLogId: ").append(toIndentedString(requestLogId)).append("\n");
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

