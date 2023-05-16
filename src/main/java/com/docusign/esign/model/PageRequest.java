package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PageRequest.
 *
 */

public class PageRequest {
  @JsonProperty("password")
  private String password = null;

  @JsonProperty("rotate")
  private String rotate = null;


  /**
   * password.
   *
   * @return PageRequest
   **/
  public PageRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * .
   * @return password
   **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  /**
   * setPassword.
   **/
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * rotate.
   *
   * @return PageRequest
   **/
  public PageRequest rotate(String rotate) {
    this.rotate = rotate;
    return this;
  }

  /**
   * Sets the direction the page image is rotated. The possible settings are: left or right.
   * @return rotate
   **/
  @Schema(description = "Sets the direction the page image is rotated. The possible settings are: left or right")
  public String getRotate() {
    return rotate;
  }

  /**
   * setRotate.
   **/
  public void setRotate(String rotate) {
    this.rotate = rotate;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(password, rotate);
  }


  /**
   * Converts the given object to string.
   */
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

