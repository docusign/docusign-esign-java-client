package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * The request object for the [EnvelopeViews: createConsole](/docs/esign-rest-api/reference/envelopes/envelopeviews/createconsole/) method..
 *
 */
@Schema(description = "The request object for the [EnvelopeViews: createConsole](/docs/esign-rest-api/reference/envelopes/envelopeviews/createconsole/) method.")

public class ConsoleViewRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("returnUrl")
  private String returnUrl = null;


  /**
   * envelopeId.
   *
   * @return ConsoleViewRequest
   **/
  public ConsoleViewRequest envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
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
   * returnUrl.
   *
   * @return ConsoleViewRequest
   **/
  public ConsoleViewRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

  /**
   * The URL to be redirected to after the console view session has ended..
   * @return returnUrl
   **/
  @Schema(description = "The URL to be redirected to after the console view session has ended.")
  public String getReturnUrl() {
    return returnUrl;
  }

  /**
   * setReturnUrl.
   **/
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
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
    ConsoleViewRequest consoleViewRequest = (ConsoleViewRequest) o;
    return Objects.equals(this.envelopeId, consoleViewRequest.envelopeId) &&
        Objects.equals(this.returnUrl, consoleViewRequest.returnUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, returnUrl);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsoleViewRequest {\n");
    
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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

