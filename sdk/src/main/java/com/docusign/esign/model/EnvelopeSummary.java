package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-18T16:25:36.433-08:00")
public class EnvelopeSummary   {
  
  private String envelopeId = null;
  private String uri = null;
  private String statusDateTime = null;
  private String status = null;

  
  /**
   * The envelope ID of the envelope status that failed to post.
   **/
  
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  @JsonProperty("envelopeId")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * The DateTime that the envelope changed status (i.e. was created or sent.)
   **/
  
  @ApiModelProperty(value = "The DateTime that the envelope changed status (i.e. was created or sent.)")
  @JsonProperty("statusDateTime")
  public String getStatusDateTime() {
    return statusDateTime;
  }
  public void setStatusDateTime(String statusDateTime) {
    this.statusDateTime = statusDateTime;
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeSummary envelopeSummary = (EnvelopeSummary) o;

    return true && Objects.equals(envelopeId, envelopeSummary.envelopeId) &&
        Objects.equals(uri, envelopeSummary.uri) &&
        Objects.equals(statusDateTime, envelopeSummary.statusDateTime) &&
        Objects.equals(status, envelopeSummary.status)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, uri, statusDateTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeSummary {\n");
    
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    statusDateTime: ").append(toIndentedString(statusDateTime)).append("\n");
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

