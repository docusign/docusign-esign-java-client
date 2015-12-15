package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class SocialAuthentication   {
  
  private String authentication = null;

  
  /**
   * Reserved: TBD
   **/
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("authentication")
  public String getAuthentication() {
    return authentication;
  }
  public void setAuthentication(String authentication) {
    this.authentication = authentication;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialAuthentication socialAuthentication = (SocialAuthentication) o;
    return Objects.equals(authentication, socialAuthentication.authentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialAuthentication {\n");
    
    sb.append("    authentication: ").append(StringUtil.toIndentedString(authentication)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
