package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This object contains details about a Connect failure result..
 *
 */
@Schema(description = "This object contains details about a Connect failure result.")

public class ConnectFailureResult {
  @JsonProperty("configId")
  private String configId = null;

  @JsonProperty("configUrl")
  private String configUrl = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusMessage")
  private String statusMessage = null;

  /**
   * configId.
   *
   * @return ConnectFailureResult
   **/
  public ConnectFailureResult configId(String configId) {
    this.configId = configId;
    return this;
  }

  /**
   * Reserved: TBD.
   * 
   * @return configId
   **/
  @Schema(description = "Reserved: TBD")
  public String getConfigId() {
    return configId;
  }

  /**
   * setConfigId.
   **/
  public void setConfigId(String configId) {
    this.configId = configId;
  }

  /**
   * configUrl.
   *
   * @return ConnectFailureResult
   **/
  public ConnectFailureResult configUrl(String configUrl) {
    this.configUrl = configUrl;
    return this;
  }

  /**
   * Reserved: TBD.
   * 
   * @return configUrl
   **/
  @Schema(description = "Reserved: TBD")
  public String getConfigUrl() {
    return configUrl;
  }

  /**
   * setConfigUrl.
   **/
  public void setConfigUrl(String configUrl) {
    this.configUrl = configUrl;
  }

  /**
   * envelopeId.
   *
   * @return ConnectFailureResult
   **/
  public ConnectFailureResult envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   * 
   * @return envelopeId
   **/
  @Schema(description = "The envelope ID of the envelope status that failed to post.")
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
   * @return ConnectFailureResult
   **/
  public ConnectFailureResult status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are: * sent - The envelope is
   * sent to the recipients. * created - The envelope is saved as a draft and can
   * be modified and sent later..
   * 
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
   * statusMessage.
   *
   * @return ConnectFailureResult
   **/
  public ConnectFailureResult statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * .
   * 
   * @return statusMessage
   **/
  @Schema(description = "")
  public String getStatusMessage() {
    return statusMessage;
  }

  /**
   * setStatusMessage.
   **/
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
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
    ConnectFailureResult connectFailureResult = (ConnectFailureResult) o;
    return Objects.equals(this.configId, connectFailureResult.configId) &&
        Objects.equals(this.configUrl, connectFailureResult.configUrl) &&
        Objects.equals(this.envelopeId, connectFailureResult.envelopeId) &&
        Objects.equals(this.status, connectFailureResult.status) &&
        Objects.equals(this.statusMessage, connectFailureResult.statusMessage);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(configId, configUrl, envelopeId, status, statusMessage);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectFailureResult {\n");

    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    configUrl: ").append(toIndentedString(configUrl)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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
