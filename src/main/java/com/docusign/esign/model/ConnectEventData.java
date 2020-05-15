package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectEventData
 */

public class ConnectEventData {
  @JsonProperty("format")
  private String format = null;

  @JsonProperty("includeData")
  private java.util.List<String> includeData = null;

  @JsonProperty("version")
  private String version = null;

  public ConnectEventData format(String format) {
    this.format = format;
    return this;
  }

   /**
   * 
   * @return format
  **/
  @ApiModelProperty(value = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public ConnectEventData includeData(java.util.List<String> includeData) {
    this.includeData = includeData;
    return this;
  }

  public ConnectEventData addIncludeDataItem(String includeDataItem) {
    if (this.includeData == null) {
      this.includeData = new java.util.ArrayList<String>();
    }
    this.includeData.add(includeDataItem);
    return this;
  }

   /**
   * 
   * @return includeData
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getIncludeData() {
    return includeData;
  }

  public void setIncludeData(java.util.List<String> includeData) {
    this.includeData = includeData;
  }

  public ConnectEventData version(String version) {
    this.version = version;
    return this;
  }

   /**
   * 
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectEventData connectEventData = (ConnectEventData) o;
    return Objects.equals(this.format, connectEventData.format) &&
        Objects.equals(this.includeData, connectEventData.includeData) &&
        Objects.equals(this.version, connectEventData.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, includeData, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectEventData {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    includeData: ").append(toIndentedString(includeData)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

