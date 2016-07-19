package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class CorrectViewRequest   {
  
  private String suppressNavigation = null;
  private String returnUrl = null;

  
  /**
   * Specifies whether the window is displayed with or without dressing.
   **/
  public CorrectViewRequest suppressNavigation(String suppressNavigation) {
    this.suppressNavigation = suppressNavigation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies whether the window is displayed with or without dressing.")
  @JsonProperty("suppressNavigation")
  public String getSuppressNavigation() {
    return suppressNavigation;
  }
  public void setSuppressNavigation(String suppressNavigation) {
    this.suppressNavigation = suppressNavigation;
  }

  
  /**
   * The url used after correct/send view session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your app. The event parameters returned are: \n\n* send (user corrected and sent the envelope)\n* save (user saved the envelope)\n* cancel (user canceled the transaction.)\n* error (there was an error when performing the correct or send)\n* sessionEnd (the session ended before the user completed a different action)\n\n###### Note: Include https:// in the URL or the redirect might not succeed on some browsers. 
   **/
  public CorrectViewRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url used after correct/send view session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your app. The event parameters returned are: \n\n* send (user corrected and sent the envelope)\n* save (user saved the envelope)\n* cancel (user canceled the transaction.)\n* error (there was an error when performing the correct or send)\n* sessionEnd (the session ended before the user completed a different action)\n\n###### Note: Include https:// in the URL or the redirect might not succeed on some browsers. ")
  @JsonProperty("returnUrl")
  public String getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
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
    return Objects.equals(this.suppressNavigation, correctViewRequest.suppressNavigation) &&
        Objects.equals(this.returnUrl, correctViewRequest.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppressNavigation, returnUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectViewRequest {\n");
    
    sb.append("    suppressNavigation: ").append(toIndentedString(suppressNavigation)).append("\n");
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

