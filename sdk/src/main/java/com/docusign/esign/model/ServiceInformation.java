package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.ServiceVersion;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class ServiceInformation   {
  
  private java.util.List<ServiceVersion> serviceVersions = new java.util.ArrayList<ServiceVersion>();
  private String buildVersion = null;
  private String buildBranch = null;
  private String buildSHA = null;
  private String buildBranchDeployedDateTime = null;
  private java.util.List<String> linkedSites = new java.util.ArrayList<String>();

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("serviceVersions")
  public java.util.List<ServiceVersion> getServiceVersions() {
    return serviceVersions;
  }
  public void setServiceVersions(java.util.List<ServiceVersion> serviceVersions) {
    this.serviceVersions = serviceVersions;
  }

  
  /**
   * Reserved: TBD
   **/
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("buildVersion")
  public String getBuildVersion() {
    return buildVersion;
  }
  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }

  
  /**
   * Reserved: TBD
   **/
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("buildBranch")
  public String getBuildBranch() {
    return buildBranch;
  }
  public void setBuildBranch(String buildBranch) {
    this.buildBranch = buildBranch;
  }

  
  /**
   * Reserved: TBD
   **/
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("buildSHA")
  public String getBuildSHA() {
    return buildSHA;
  }
  public void setBuildSHA(String buildSHA) {
    this.buildSHA = buildSHA;
  }

  
  /**
   * Reserved: TBD
   **/
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("buildBranchDeployedDateTime")
  public String getBuildBranchDeployedDateTime() {
    return buildBranchDeployedDateTime;
  }
  public void setBuildBranchDeployedDateTime(String buildBranchDeployedDateTime) {
    this.buildBranchDeployedDateTime = buildBranchDeployedDateTime;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("linkedSites")
  public java.util.List<String> getLinkedSites() {
    return linkedSites;
  }
  public void setLinkedSites(java.util.List<String> linkedSites) {
    this.linkedSites = linkedSites;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInformation serviceInformation = (ServiceInformation) o;
    return Objects.equals(serviceVersions, serviceInformation.serviceVersions) &&
        Objects.equals(buildVersion, serviceInformation.buildVersion) &&
        Objects.equals(buildBranch, serviceInformation.buildBranch) &&
        Objects.equals(buildSHA, serviceInformation.buildSHA) &&
        Objects.equals(buildBranchDeployedDateTime, serviceInformation.buildBranchDeployedDateTime) &&
        Objects.equals(linkedSites, serviceInformation.linkedSites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceVersions, buildVersion, buildBranch, buildSHA, buildBranchDeployedDateTime, linkedSites);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInformation {\n");
    
    sb.append("    serviceVersions: ").append(StringUtil.toIndentedString(serviceVersions)).append("\n");
    sb.append("    buildVersion: ").append(StringUtil.toIndentedString(buildVersion)).append("\n");
    sb.append("    buildBranch: ").append(StringUtil.toIndentedString(buildBranch)).append("\n");
    sb.append("    buildSHA: ").append(StringUtil.toIndentedString(buildSHA)).append("\n");
    sb.append("    buildBranchDeployedDateTime: ").append(StringUtil.toIndentedString(buildBranchDeployedDateTime)).append("\n");
    sb.append("    linkedSites: ").append(StringUtil.toIndentedString(linkedSites)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
