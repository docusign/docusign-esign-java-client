package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class CorrectViewRequest   {
  
  private String returnUrl = null;
  private String suppressNavigation = null;

  
  /**
   * The url used after correct/send view session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your app. The event parameters returned are: \n\n* send (user corrected and sent the envelope)\n* save (user saved the envelope)\n* cancel (user canceled the transaction.)\n* error (there was an error when performing the correct or send)\n* sessionEnd (the session ended before the user completed a different action)\n\n###### Note: Include https:// in the URL or the redirect might not succeed on some browsers.
   **/
  
  @ApiModelProperty(value = "The url used after correct/send view session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your app. The event parameters returned are: \n\n* send (user corrected and sent the envelope)\n* save (user saved the envelope)\n* cancel (user canceled the transaction.)\n* error (there was an error when performing the correct or send)\n* sessionEnd (the session ended before the user completed a different action)\n\n###### Note: Include https:// in the URL or the redirect might not succeed on some browsers.")
  @JsonProperty("returnUrl")
  public String getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  
  /**
   * Specifies whether the window is displayed with or without dressing.
   **/
  
  @ApiModelProperty(value = "Specifies whether the window is displayed with or without dressing.")
  @JsonProperty("suppressNavigation")
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

    return true && Objects.equals(returnUrl, correctViewRequest.returnUrl) &&
        Objects.equals(suppressNavigation, correctViewRequest.suppressNavigation)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnUrl, suppressNavigation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectViewRequest {\n");
    
    if (returnUrl != null)
      sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    if (suppressNavigation != null)
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

