package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class CorrectViewRequest   {
  
  private String suppressNavigation = null;
  private String returnUrl = null;

  
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

  
  /**
   * Specifies the return point after correcting the envelope. DocuSign returns to the URL and includes an event parameter that can be used to redirect the recipient to another location. The possible event parameters returned are: \n\n* send (user corrects and sends the envelope)\n* save (user saves the envelope)\n* cancel (user cancels the transaction.)\n* error (there is an error when performing the correct or send)\n* sessionEnd (the session ends before the user completes another action)\n\n## Important: You must include HTTPS:// in the URL or the redirect might be blocked by some browsers.
   **/
  @ApiModelProperty(value = "Specifies the return point after correcting the envelope. DocuSign returns to the URL and includes an event parameter that can be used to redirect the recipient to another location. The possible event parameters returned are: \n\n* send (user corrects and sends the envelope)\n* save (user saves the envelope)\n* cancel (user cancels the transaction.)\n* error (there is an error when performing the correct or send)\n* sessionEnd (the session ends before the user completes another action)\n\n## Important: You must include HTTPS:// in the URL or the redirect might be blocked by some browsers.")
  @JsonProperty("returnUrl")
  public String getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrectViewRequest correctViewRequest = (CorrectViewRequest) o;
    return Objects.equals(suppressNavigation, correctViewRequest.suppressNavigation) &&
        Objects.equals(returnUrl, correctViewRequest.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppressNavigation, returnUrl);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectViewRequest {\n");
    
    sb.append("    suppressNavigation: ").append(StringUtil.toIndentedString(suppressNavigation)).append("\n");
    sb.append("    returnUrl: ").append(StringUtil.toIndentedString(returnUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
