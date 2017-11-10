package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains API request log information.
 */
@ApiModel(description = "Contains API request log information.")

public class ApiRequestLog {
  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("requestLogId")
  private String requestLogId = null;

  @JsonProperty("status")
  private String status = null;

  public ApiRequestLog createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Indicates the date and time the item was created.
   * @return createdDateTime
  **/
  @ApiModelProperty(example = "null", value = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public ApiRequestLog description(String description) {
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

  public ApiRequestLog requestLogId(String requestLogId) {
    this.requestLogId = requestLogId;
    return this;
  }

   /**
   * 
   * @return requestLogId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRequestLogId() {
    return requestLogId;
  }

  public void setRequestLogId(String requestLogId) {
    this.requestLogId = requestLogId;
  }

  public ApiRequestLog status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequestLog apiRequestLog = (ApiRequestLog) o;
    return Objects.equals(this.createdDateTime, apiRequestLog.createdDateTime) &&
        Objects.equals(this.description, apiRequestLog.description) &&
        Objects.equals(this.requestLogId, apiRequestLog.requestLogId) &&
        Objects.equals(this.status, apiRequestLog.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDateTime, description, requestLogId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestLog {\n");
    
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    requestLogId: ").append(toIndentedString(requestLogId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

