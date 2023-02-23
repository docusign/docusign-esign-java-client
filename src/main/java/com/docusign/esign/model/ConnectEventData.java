package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This object lets you choose the data format of your Connect response. For
 * more information about using this object, see [Connect webhooks with JSON
 * notifications](https://www.docusign.com/blog/developers/connect-webhooks-json-notifications).
 * .
 *
 */
@Schema(description = "This object lets you choose the data format of your Connect response. For  more information about using this object, see [Connect webhooks with JSON notifications](https://www.docusign.com/blog/developers/connect-webhooks-json-notifications). ")

public class ConnectEventData {
  @JsonProperty("format")
  private String format = null;

  @JsonProperty("includeData")
  private java.util.List<String> includeData = null;

  @JsonProperty("version")
  private String version = null;

  /**
   * format.
   *
   * @return ConnectEventData
   **/
  public ConnectEventData format(String format) {
    this.format = format;
    return this;
  }

  /**
   * .
   * 
   * @return format
   **/
  @Schema(description = "")
  public String getFormat() {
    return format;
  }

  /**
   * setFormat.
   **/
  public void setFormat(String format) {
    this.format = format;
  }

  /**
   * includeData.
   *
   * @return ConnectEventData
   **/
  public ConnectEventData includeData(java.util.List<String> includeData) {
    this.includeData = includeData;
    return this;
  }

  /**
   * addIncludeDataItem.
   *
   * @return ConnectEventData
   **/
  public ConnectEventData addIncludeDataItem(String includeDataItem) {
    if (this.includeData == null) {
      this.includeData = new java.util.ArrayList<>();
    }
    this.includeData.add(includeDataItem);
    return this;
  }

  /**
   * .
   * 
   * @return includeData
   **/
  @Schema(description = "")
  public java.util.List<String> getIncludeData() {
    return includeData;
  }

  /**
   * setIncludeData.
   **/
  public void setIncludeData(java.util.List<String> includeData) {
    this.includeData = includeData;
  }

  /**
   * version.
   *
   * @return ConnectEventData
   **/
  public ConnectEventData version(String version) {
    this.version = version;
    return this;
  }

  /**
   * .
   * 
   * @return version
   **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  /**
   * setVersion.
   **/
  public void setVersion(String version) {
    this.version = version;
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
    ConnectEventData connectEventData = (ConnectEventData) o;
    return Objects.equals(this.format, connectEventData.format) &&
        Objects.equals(this.includeData, connectEventData.includeData) &&
        Objects.equals(this.version, connectEventData.version);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(format, includeData, version);
  }

  /**
   * Converts the given object to string.
   */
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
