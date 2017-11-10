package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ServiceVersion
 */

public class ServiceVersion {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("versionUrl")
  private String versionUrl = null;

  public ServiceVersion version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the rest API.
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "The version of the rest API.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ServiceVersion versionUrl(String versionUrl) {
    this.versionUrl = versionUrl;
    return this;
  }

   /**
   * 
   * @return versionUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVersionUrl() {
    return versionUrl;
  }

  public void setVersionUrl(String versionUrl) {
    this.versionUrl = versionUrl;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(version, versionUrl);
  }


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

