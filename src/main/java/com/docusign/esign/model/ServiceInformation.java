package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ServiceVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
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
  public ServiceInformation serviceVersions(java.util.List<ServiceVersion> serviceVersions) {
    this.serviceVersions = serviceVersions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public ServiceInformation buildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
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
  public ServiceInformation buildBranch(String buildBranch) {
    this.buildBranch = buildBranch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
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
  public ServiceInformation buildSHA(String buildSHA) {
    this.buildSHA = buildSHA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
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
  public ServiceInformation buildBranchDeployedDateTime(String buildBranchDeployedDateTime) {
    this.buildBranchDeployedDateTime = buildBranchDeployedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
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
  public ServiceInformation linkedSites(java.util.List<String> linkedSites) {
    this.linkedSites = linkedSites;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("linkedSites")
  public java.util.List<String> getLinkedSites() {
    return linkedSites;
  }
  public void setLinkedSites(java.util.List<String> linkedSites) {
    this.linkedSites = linkedSites;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInformation serviceInformation = (ServiceInformation) o;
    return Objects.equals(this.serviceVersions, serviceInformation.serviceVersions) &&
        Objects.equals(this.buildVersion, serviceInformation.buildVersion) &&
        Objects.equals(this.buildBranch, serviceInformation.buildBranch) &&
        Objects.equals(this.buildSHA, serviceInformation.buildSHA) &&
        Objects.equals(this.buildBranchDeployedDateTime, serviceInformation.buildBranchDeployedDateTime) &&
        Objects.equals(this.linkedSites, serviceInformation.linkedSites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceVersions, buildVersion, buildBranch, buildSHA, buildBranchDeployedDateTime, linkedSites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInformation {\n");
    
    sb.append("    serviceVersions: ").append(toIndentedString(serviceVersions)).append("\n");
    sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
    sb.append("    buildBranch: ").append(toIndentedString(buildBranch)).append("\n");
    sb.append("    buildSHA: ").append(toIndentedString(buildSHA)).append("\n");
    sb.append("    buildBranchDeployedDateTime: ").append(toIndentedString(buildBranchDeployedDateTime)).append("\n");
    sb.append("    linkedSites: ").append(toIndentedString(linkedSites)).append("\n");
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

