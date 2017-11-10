package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CorrectViewRequest
 */

public class CorrectViewRequest {
  @JsonProperty("returnUrl")
  private String returnUrl = null;

  @JsonProperty("suppressNavigation")
  private String suppressNavigation = null;

  public CorrectViewRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * The url used after correct/send view session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your app. The event parameters returned are:   * send (user corrected and sent the envelope) * save (user saved the envelope) * cancel (user canceled the transaction.) * error (there was an error when performing the correct or send) * sessionEnd (the session ended before the user completed a different action)  ###### Note: Include https:// in the URL or the redirect might not succeed on some browsers. 
   * @return returnUrl
  **/
  @ApiModelProperty(example = "null", value = "The url used after correct/send view session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your app. The event parameters returned are:   * send (user corrected and sent the envelope) * save (user saved the envelope) * cancel (user canceled the transaction.) * error (there was an error when performing the correct or send) * sessionEnd (the session ended before the user completed a different action)  ###### Note: Include https:// in the URL or the redirect might not succeed on some browsers. ")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public CorrectViewRequest suppressNavigation(String suppressNavigation) {
    this.suppressNavigation = suppressNavigation;
    return this;
  }

   /**
   * Specifies whether the window is displayed with or without dressing.
   * @return suppressNavigation
  **/
  @ApiModelProperty(example = "null", value = "Specifies whether the window is displayed with or without dressing.")
  public String getSuppressNavigation() {
    return suppressNavigation;
  }

  public void setSuppressNavigation(String suppressNavigation) {
    this.suppressNavigation = suppressNavigation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrectViewRequest correctViewRequest = (CorrectViewRequest) o;
    return Objects.equals(this.returnUrl, correctViewRequest.returnUrl) &&
        Objects.equals(this.suppressNavigation, correctViewRequest.suppressNavigation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnUrl, suppressNavigation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectViewRequest {\n");
    
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    suppressNavigation: ").append(toIndentedString(suppressNavigation)).append("\n");
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

