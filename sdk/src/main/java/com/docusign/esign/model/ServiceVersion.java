package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class ServiceVersion   {
  
  private String version = null;
  private String versionUrl = null;

  
  /**
   * The version of the rest API.
   **/
  @ApiModelProperty(value = "The version of the rest API.")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("versionUrl")
  public String getVersionUrl() {
    return versionUrl;
  }
  public void setVersionUrl(String versionUrl) {
    this.versionUrl = versionUrl;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceVersion serviceVersion = (ServiceVersion) o;
    return Objects.equals(version, serviceVersion.version) &&
        Objects.equals(versionUrl, serviceVersion.versionUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, versionUrl);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceVersion {\n");
    
    sb.append("    version: ").append(StringUtil.toIndentedString(version)).append("\n");
    sb.append("    versionUrl: ").append(StringUtil.toIndentedString(versionUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
