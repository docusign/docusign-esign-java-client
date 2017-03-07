package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PageRequest   {
  
  private String password = null;
  private String rotate = null;

  
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageRequest pageRequest = (PageRequest) o;

    return true && Objects.equals(password, pageRequest.password) &&
        Objects.equals(rotate, pageRequest.rotate)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, rotate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageRequest {\n");
    
    if (password != null)
      sb.append("    password: ").append(toIndentedString(password)).append("\n");
    if (rotate != null)
      sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
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

