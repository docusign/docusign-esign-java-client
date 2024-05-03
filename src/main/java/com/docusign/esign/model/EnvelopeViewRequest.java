package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopeViewSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * EnvelopeViewRequest.
 *
 */

public class EnvelopeViewRequest {
  @JsonProperty("returnUrl")
  private String returnUrl = null;

  @JsonProperty("settings")
  private EnvelopeViewSettings settings = null;

  @JsonProperty("viewAccess")
  private String viewAccess = null;


  /**
   * returnUrl.
   *
   * @return EnvelopeViewRequest
   **/
  public EnvelopeViewRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

  /**
   * .
   * @return returnUrl
   **/
  @Schema(description = "")
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
   * settings.
   *
   * @return EnvelopeViewRequest
   **/
  public EnvelopeViewRequest settings(EnvelopeViewSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * .
   * @return settings
   **/
  @Schema(description = "")
  public EnvelopeViewSettings getSettings() {
    return settings;
  }

  /**
   * setSettings.
   **/
  public void setSettings(EnvelopeViewSettings settings) {
    this.settings = settings;
  }


  /**
   * viewAccess.
   *
   * @return EnvelopeViewRequest
   **/
  public EnvelopeViewRequest viewAccess(String viewAccess) {
    this.viewAccess = viewAccess;
    return this;
  }

  /**
   * .
   * @return viewAccess
   **/
  @Schema(description = "")
  public String getViewAccess() {
    return viewAccess;
  }

  /**
   * setViewAccess.
   **/
  public void setViewAccess(String viewAccess) {
    this.viewAccess = viewAccess;
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
    EnvelopeViewRequest envelopeViewRequest = (EnvelopeViewRequest) o;
    return Objects.equals(this.returnUrl, envelopeViewRequest.returnUrl) &&
        Objects.equals(this.settings, envelopeViewRequest.settings) &&
        Objects.equals(this.viewAccess, envelopeViewRequest.viewAccess);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(returnUrl, settings, viewAccess);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeViewRequest {\n");
    
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    viewAccess: ").append(toIndentedString(viewAccess)).append("\n");
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

