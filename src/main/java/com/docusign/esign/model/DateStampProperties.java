package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DateStampProperties
 */

public class DateStampProperties {
  @JsonProperty("dateAreaHeight")
  private String dateAreaHeight = null;

  @JsonProperty("dateAreaWidth")
  private String dateAreaWidth = null;

  @JsonProperty("dateAreaX")
  private String dateAreaX = null;

  @JsonProperty("dateAreaY")
  private String dateAreaY = null;

  public DateStampProperties dateAreaHeight(String dateAreaHeight) {
    this.dateAreaHeight = dateAreaHeight;
    return this;
  }

   /**
   * 
   * @return dateAreaHeight
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDateAreaHeight() {
    return dateAreaHeight;
  }

  public void setDateAreaHeight(String dateAreaHeight) {
    this.dateAreaHeight = dateAreaHeight;
  }

  public DateStampProperties dateAreaWidth(String dateAreaWidth) {
    this.dateAreaWidth = dateAreaWidth;
    return this;
  }

   /**
   * 
   * @return dateAreaWidth
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDateAreaWidth() {
    return dateAreaWidth;
  }

  public void setDateAreaWidth(String dateAreaWidth) {
    this.dateAreaWidth = dateAreaWidth;
  }

  public DateStampProperties dateAreaX(String dateAreaX) {
    this.dateAreaX = dateAreaX;
    return this;
  }

   /**
   * 
   * @return dateAreaX
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDateAreaX() {
    return dateAreaX;
  }

  public void setDateAreaX(String dateAreaX) {
    this.dateAreaX = dateAreaX;
  }

  public DateStampProperties dateAreaY(String dateAreaY) {
    this.dateAreaY = dateAreaY;
    return this;
  }

   /**
   * 
   * @return dateAreaY
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDateAreaY() {
    return dateAreaY;
  }

  public void setDateAreaY(String dateAreaY) {
    this.dateAreaY = dateAreaY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateStampProperties dateStampProperties = (DateStampProperties) o;
    return Objects.equals(this.dateAreaHeight, dateStampProperties.dateAreaHeight) &&
        Objects.equals(this.dateAreaWidth, dateStampProperties.dateAreaWidth) &&
        Objects.equals(this.dateAreaX, dateStampProperties.dateAreaX) &&
        Objects.equals(this.dateAreaY, dateStampProperties.dateAreaY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAreaHeight, dateAreaWidth, dateAreaX, dateAreaY);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateStampProperties {\n");
    
    sb.append("    dateAreaHeight: ").append(toIndentedString(dateAreaHeight)).append("\n");
    sb.append("    dateAreaWidth: ").append(toIndentedString(dateAreaWidth)).append("\n");
    sb.append("    dateAreaX: ").append(toIndentedString(dateAreaX)).append("\n");
    sb.append("    dateAreaY: ").append(toIndentedString(dateAreaY)).append("\n");
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

