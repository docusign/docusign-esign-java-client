package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Contains API request log information..
 *
 */
@Schema(description = "Contains API request log information.")

public class ApiRequestLog implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("requestLogId")
  private String requestLogId = null;

  @JsonProperty("status")
  private String status = null;


  /**
   * createdDateTime.
   *
   * @return ApiRequestLog
   **/
  public ApiRequestLog createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Indicates the date and time the item was created..
   * @return createdDateTime
   **/
  @Schema(description = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  /**
   * setCreatedDateTime.
   **/
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  /**
   * description.
   *
   * @return ApiRequestLog
   **/
  public ApiRequestLog description(String description) {
    this.description = description;
    return this;
  }

  /**
   * .
   * @return description
   **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  /**
   * setDescription.
   **/
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * requestLogId.
   *
   * @return ApiRequestLog
   **/
  public ApiRequestLog requestLogId(String requestLogId) {
    this.requestLogId = requestLogId;
    return this;
  }

  /**
   * .
   * @return requestLogId
   **/
  @Schema(description = "")
  public String getRequestLogId() {
    return requestLogId;
  }

  /**
   * setRequestLogId.
   **/
  public void setRequestLogId(String requestLogId) {
    this.requestLogId = requestLogId;
  }


  /**
   * status.
   *
   * @return ApiRequestLog
   **/
  public ApiRequestLog status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @Schema(description = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
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
    ApiRequestLog apiRequestLog = (ApiRequestLog) o;
    return Objects.equals(this.createdDateTime, apiRequestLog.createdDateTime) &&
        Objects.equals(this.description, apiRequestLog.description) &&
        Objects.equals(this.requestLogId, apiRequestLog.requestLogId) &&
        Objects.equals(this.status, apiRequestLog.status);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(createdDateTime, description, requestLogId, status);
  }


  /**
   * Converts the given object to string.
   */
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

