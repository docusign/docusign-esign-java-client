package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class ViewLinkRequest   {
  
  private String returnUrl = null;
  private String email = null;

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("returnUrl")
  public String getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewLinkRequest viewLinkRequest = (ViewLinkRequest) o;
    return Objects.equals(returnUrl, viewLinkRequest.returnUrl) &&
        Objects.equals(email, viewLinkRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnUrl, email);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewLinkRequest {\n");
    
    sb.append("    returnUrl: ").append(StringUtil.toIndentedString(returnUrl)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
