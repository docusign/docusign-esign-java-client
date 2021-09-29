package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeSummary.
 *
 */

public class EnvelopeSummary {
  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusDateTime")
  private String statusDateTime = null;

  @JsonProperty("uri")
  private String uri = null;


  /**
   * envelopeId.
   *
   * @return EnvelopeSummary
   **/
  public EnvelopeSummary envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   * @return envelopeId
   **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  /**
   * setEnvelopeId.
   **/
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }


  /**
   * status.
   *
   * @return EnvelopeSummary
   **/
  public EnvelopeSummary status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
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
   * statusDateTime.
   *
   * @return EnvelopeSummary
   **/
  public EnvelopeSummary statusDateTime(String statusDateTime) {
    this.statusDateTime = statusDateTime;
    return this;
  }

  /**
   * The DateTime that the envelope changed status (i.e. was created or sent.).
   * @return statusDateTime
   **/
  @ApiModelProperty(value = "The DateTime that the envelope changed status (i.e. was created or sent.)")
  public String getStatusDateTime() {
    return statusDateTime;
  }

  /**
   * setStatusDateTime.
   **/
  public void setStatusDateTime(String statusDateTime) {
    this.statusDateTime = statusDateTime;
  }


  /**
   * uri.
   *
   * @return EnvelopeSummary
   **/
  public EnvelopeSummary uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  /**
   * setUri.
   **/
  public void setUri(String uri) {
    this.uri = uri;
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
    EnvelopeSummary envelopeSummary = (EnvelopeSummary) o;
    return Objects.equals(this.envelopeId, envelopeSummary.envelopeId) &&
        Objects.equals(this.status, envelopeSummary.status) &&
        Objects.equals(this.statusDateTime, envelopeSummary.statusDateTime) &&
        Objects.equals(this.uri, envelopeSummary.uri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, status, statusDateTime, uri);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeSummary {\n");
    
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDateTime: ").append(toIndentedString(statusDateTime)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

