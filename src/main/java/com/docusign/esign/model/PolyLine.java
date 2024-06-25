package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * PolyLine.
 *
 */

public class PolyLine implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("x1")
  private String x1 = null;

  @JsonProperty("x2")
  private String x2 = null;

  @JsonProperty("y1")
  private String y1 = null;

  @JsonProperty("y2")
  private String y2 = null;


  /**
   * x1.
   *
   * @return PolyLine
   **/
  public PolyLine x1(String x1) {
    this.x1 = x1;
    return this;
  }

  /**
   * .
   * @return x1
   **/
  @Schema(description = "")
  public String getX1() {
    return x1;
  }

  /**
   * setX1.
   **/
  public void setX1(String x1) {
    this.x1 = x1;
  }


  /**
   * x2.
   *
   * @return PolyLine
   **/
  public PolyLine x2(String x2) {
    this.x2 = x2;
    return this;
  }

  /**
   * .
   * @return x2
   **/
  @Schema(description = "")
  public String getX2() {
    return x2;
  }

  /**
   * setX2.
   **/
  public void setX2(String x2) {
    this.x2 = x2;
  }


  /**
   * y1.
   *
   * @return PolyLine
   **/
  public PolyLine y1(String y1) {
    this.y1 = y1;
    return this;
  }

  /**
   * .
   * @return y1
   **/
  @Schema(description = "")
  public String getY1() {
    return y1;
  }

  /**
   * setY1.
   **/
  public void setY1(String y1) {
    this.y1 = y1;
  }


  /**
   * y2.
   *
   * @return PolyLine
   **/
  public PolyLine y2(String y2) {
    this.y2 = y2;
    return this;
  }

  /**
   * .
   * @return y2
   **/
  @Schema(description = "")
  public String getY2() {
    return y2;
  }

  /**
   * setY2.
   **/
  public void setY2(String y2) {
    this.y2 = y2;
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
    PolyLine polyLine = (PolyLine) o;
    return Objects.equals(this.x1, polyLine.x1) &&
        Objects.equals(this.x2, polyLine.x2) &&
        Objects.equals(this.y1, polyLine.y1) &&
        Objects.equals(this.y2, polyLine.y2);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(x1, x2, y1, y2);
  }


  /**
   * Converts the given object to string.
   */
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

