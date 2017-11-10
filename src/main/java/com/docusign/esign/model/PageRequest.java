package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PageRequest
 */

public class PageRequest {
  @JsonProperty("password")
  private String password = null;

  @JsonProperty("rotate")
  private String rotate = null;

  public PageRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PageRequest rotate(String rotate) {
    this.rotate = rotate;
    return this;
  }

   /**
   * Sets the direction the page image is rotated. The possible settings are: left or right
   * @return rotate
  **/
  @ApiModelProperty(example = "null", value = "Sets the direction the page image is rotated. The possible settings are: left or right")
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
    return Objects.equals(this.password, pageRequest.password) &&
        Objects.equals(this.rotate, pageRequest.rotate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, rotate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageRequest {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

