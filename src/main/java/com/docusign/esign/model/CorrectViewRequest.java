package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The request body for the [EnvelopeViews: createCorrect](/docs/esign-rest-api/reference/envelopes/envelopeviews/createcorrect/) method..
 *
 */
@ApiModel(description = "The request body for the [EnvelopeViews: createCorrect](/docs/esign-rest-api/reference/envelopes/envelopeviews/createcorrect/) method.")

public class CorrectViewRequest {
  @JsonProperty("beginOnTagger")
  private String beginOnTagger = null;

  @JsonProperty("returnUrl")
  private String returnUrl = null;

  @JsonProperty("suppressNavigation")
  private String suppressNavigation = null;

  @JsonProperty("viewUrl")
  private String viewUrl = null;


  /**
   * beginOnTagger.
   *
   * @return CorrectViewRequest
   **/
  public CorrectViewRequest beginOnTagger(String beginOnTagger) {
    this.beginOnTagger = beginOnTagger;
    return this;
  }

  /**
   * .
   * @return beginOnTagger
   **/
  @ApiModelProperty(value = "")
  public String getBeginOnTagger() {
    return beginOnTagger;
  }

  /**
   * setBeginOnTagger.
   **/
  public void setBeginOnTagger(String beginOnTagger) {
    this.beginOnTagger = beginOnTagger;
  }


  /**
   * returnUrl.
   *
   * @return CorrectViewRequest
   **/
  public CorrectViewRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

  /**
   * The url used after correct/send view session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your app. The event parameters returned are:   * send (user corrected and sent the envelope) * save (user saved the envelope) * cancel (user canceled the transaction.) * error (there was an error when performing the correct or send) * sessionEnd (the session ended before the user completed a different action)  ###### Note: Include https:// in the URL or the redirect might not succeed on some browsers. .
   * @return returnUrl
   **/
  @ApiModelProperty(value = "The url used after correct/send view session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your app. The event parameters returned are:   * send (user corrected and sent the envelope) * save (user saved the envelope) * cancel (user canceled the transaction.) * error (there was an error when performing the correct or send) * sessionEnd (the session ended before the user completed a different action)  ###### Note: Include https:// in the URL or the redirect might not succeed on some browsers. ")
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
   * suppressNavigation.
   *
   * @return CorrectViewRequest
   **/
  public CorrectViewRequest suppressNavigation(String suppressNavigation) {
    this.suppressNavigation = suppressNavigation;
    return this;
  }

  /**
   * Specifies whether the window is displayed with or without dressing..
   * @return suppressNavigation
   **/
  @ApiModelProperty(value = "Specifies whether the window is displayed with or without dressing.")
  public String getSuppressNavigation() {
    return suppressNavigation;
  }

  /**
   * setSuppressNavigation.
   **/
  public void setSuppressNavigation(String suppressNavigation) {
    this.suppressNavigation = suppressNavigation;
  }


  /**
   * viewUrl.
   *
   * @return CorrectViewRequest
   **/
  public CorrectViewRequest viewUrl(String viewUrl) {
    this.viewUrl = viewUrl;
    return this;
  }

  /**
   * .
   * @return viewUrl
   **/
  @ApiModelProperty(value = "")
  public String getViewUrl() {
    return viewUrl;
  }

  /**
   * setViewUrl.
   **/
  public void setViewUrl(String viewUrl) {
    this.viewUrl = viewUrl;
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
    CorrectViewRequest correctViewRequest = (CorrectViewRequest) o;
    return Objects.equals(this.beginOnTagger, correctViewRequest.beginOnTagger) &&
        Objects.equals(this.returnUrl, correctViewRequest.returnUrl) &&
        Objects.equals(this.suppressNavigation, correctViewRequest.suppressNavigation) &&
        Objects.equals(this.viewUrl, correctViewRequest.viewUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(beginOnTagger, returnUrl, suppressNavigation, viewUrl);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectViewRequest {\n");
    
    sb.append("    beginOnTagger: ").append(toIndentedString(beginOnTagger)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    suppressNavigation: ").append(toIndentedString(suppressNavigation)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
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

