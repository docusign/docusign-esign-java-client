package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceVersion serviceVersion = (ServiceVersion) o;

    return true && Objects.equals(version, serviceVersion.version) &&
        Objects.equals(versionUrl, serviceVersion.versionUrl)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, versionUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceVersion {\n");
    
    if (version != null)
      sb.append("    version: ").append(toIndentedString(version)).append("\n");
    if (versionUrl != null)
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

