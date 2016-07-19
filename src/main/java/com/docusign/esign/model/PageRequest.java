package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class PageRequest   {
  
  private String rotate = null;
  private String password = null;

  
  /**
   * Sets the direction the page image is rotated. The possible settings are: left or right
   **/
  public PageRequest rotate(String rotate) {
    this.rotate = rotate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sets the direction the page image is rotated. The possible settings are: left or right")
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
  public PageRequest password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageRequest pageRequest = (PageRequest) o;
    return Objects.equals(this.rotate, pageRequest.rotate) &&
        Objects.equals(this.password, pageRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rotate, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageRequest {\n");
    
    sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

