package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PolyLine
 */

public class PolyLine {
  @JsonProperty("x1")
  private String x1 = null;

  @JsonProperty("x2")
  private String x2 = null;

  @JsonProperty("y1")
  private String y1 = null;

  @JsonProperty("y2")
  private String y2 = null;

  public PolyLine x1(String x1) {
    this.x1 = x1;
    return this;
  }

   /**
   * 
   * @return x1
  **/
  @ApiModelProperty(value = "")
  public String getX1() {
    return x1;
  }

  public void setX1(String x1) {
    this.x1 = x1;
  }

  public PolyLine x2(String x2) {
    this.x2 = x2;
    return this;
  }

   /**
   * 
   * @return x2
  **/
  @ApiModelProperty(value = "")
  public String getX2() {
    return x2;
  }

  public void setX2(String x2) {
    this.x2 = x2;
  }

  public PolyLine y1(String y1) {
    this.y1 = y1;
    return this;
  }

   /**
   * 
   * @return y1
  **/
  @ApiModelProperty(value = "")
  public String getY1() {
    return y1;
  }

  public void setY1(String y1) {
    this.y1 = y1;
  }

  public PolyLine y2(String y2) {
    this.y2 = y2;
    return this;
  }

   /**
   * 
   * @return y2
  **/
  @ApiModelProperty(value = "")
  public String getY2() {
    return y2;
  }

  public void setY2(String y2) {
    this.y2 = y2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolyLine polyLine = (PolyLine) o;
    return Objects.equals(this.x1, polyLine.x1) &&
        Objects.equals(this.x2, polyLine.x2) &&
        Objects.equals(this.y1, polyLine.y1) &&
        Objects.equals(this.y2, polyLine.y2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x1, x2, y1, y2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolyLine {\n");
    
    sb.append("    x1: ").append(toIndentedString(x1)).append("\n");
    sb.append("    x2: ").append(toIndentedString(x2)).append("\n");
    sb.append("    y1: ").append(toIndentedString(y1)).append("\n");
    sb.append("    y2: ").append(toIndentedString(y2)).append("\n");
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

