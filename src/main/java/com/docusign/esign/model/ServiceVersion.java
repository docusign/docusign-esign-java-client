package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ServiceVersion.
 *
 */

public class ServiceVersion implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("versionUrl")
  private String versionUrl = null;


  /**
   * version.
   *
   * @return ServiceVersion
   **/
  public ServiceVersion version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the rest API..
   * @return version
   **/
  @Schema(description = "The version of the rest API.")
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
   * versionUrl.
   *
   * @return ServiceVersion
   **/
  public ServiceVersion versionUrl(String versionUrl) {
    this.versionUrl = versionUrl;
    return this;
  }

  /**
   * .
   * @return versionUrl
   **/
  @Schema(description = "")
  public String getVersionUrl() {
    return versionUrl;
  }

  /**
   * setVersionUrl.
   **/
  public void setVersionUrl(String versionUrl) {
    this.versionUrl = versionUrl;
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
    ServiceVersion serviceVersion = (ServiceVersion) o;
    return Objects.equals(this.version, serviceVersion.version) &&
        Objects.equals(this.versionUrl, serviceVersion.versionUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(version, versionUrl);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceVersion {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionUrl: ").append(toIndentedString(versionUrl)).append("\n");
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

