package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class PageRequest   {
  
  private String rotate = null;
  private String password = null;

  
  /**
   * Sets the direction the page image is rotated. The possible settings are: left or right
   **/
  @ApiModelProperty(value = "Sets the direction the page image is rotated. The possible settings are: left or right")
  @JsonProperty("rotate")
  public String getRotate() {
    return rotate;
  }
  public void setRotate(String rotate) {
    this.rotate = rotate;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageRequest pageRequest = (PageRequest) o;
    return Objects.equals(rotate, pageRequest.rotate) &&
        Objects.equals(password, pageRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rotate, password);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageRequest {\n");
    
    sb.append("    rotate: ").append(StringUtil.toIndentedString(rotate)).append("\n");
    sb.append("    password: ").append(StringUtil.toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
