package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ReturnUrlRequest. */
public class ReturnUrlRequest {
  @JsonProperty("returnUrl")
  private String returnUrl = null;

  /**
   * returnUrl.
   *
   * @return ReturnUrlRequest
   */
  public ReturnUrlRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

  /**
   * Identifies the return point after sending the envelope. DocuSign returns to the URL and
   * includes an event parameter that can be used to redirect the recipient to another location. The
   * possible event parameters returned are: * send (user sends the envelope) * save (user saves the
   * envelope) * cancel (user cancels the sending transaction. No envelopeId is returned in this
   * case.) * error (there is an error when performing the send) * sessionEnd (the sending session
   * ends before the user completes another action)..
   *
   * @return returnUrl
   */
  @ApiModelProperty(
      value =
          "Identifies the return point after sending the envelope. DocuSign returns to the URL and includes an event parameter that can be used to redirect the recipient to another location. The possible event parameters returned are:   * send (user sends the envelope) * save (user saves the envelope) * cancel (user cancels the sending transaction. No envelopeId is returned in this case.) * error (there is an error when performing the send) * sessionEnd (the sending session ends before the user completes another action).")
  public String getReturnUrl() {
    return returnUrl;
  }

  /** setReturnUrl. */
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
    ReturnUrlRequest returnUrlRequest = (ReturnUrlRequest) o;
    return Objects.equals(this.returnUrl, returnUrlRequest.returnUrl);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(returnUrl);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnUrlRequest {\n");

    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
