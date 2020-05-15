package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ServiceVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ServiceInformation
 */

public class ServiceInformation {
  @JsonProperty("buildBranch")
  private String buildBranch = null;

  @JsonProperty("buildBranchDeployedDateTime")
  private String buildBranchDeployedDateTime = null;

  @JsonProperty("buildSHA")
  private String buildSHA = null;

  @JsonProperty("buildVersion")
  private String buildVersion = null;

  @JsonProperty("linkedSites")
  private java.util.List<String> linkedSites = null;

  @JsonProperty("serviceVersions")
  private java.util.List<ServiceVersion> serviceVersions = null;

  public ServiceInformation buildBranch(String buildBranch) {
    this.buildBranch = buildBranch;
    return this;
  }

   /**
   * Reserved: TBD
   * @return buildBranch
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public String getBuildBranch() {
    return buildBranch;
  }

  public void setBuildBranch(String buildBranch) {
    this.buildBranch = buildBranch;
  }

  public ServiceInformation buildBranchDeployedDateTime(String buildBranchDeployedDateTime) {
    this.buildBranchDeployedDateTime = buildBranchDeployedDateTime;
    return this;
  }

   /**
   * Reserved: TBD
   * @return buildBranchDeployedDateTime
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public String getBuildBranchDeployedDateTime() {
    return buildBranchDeployedDateTime;
  }

  public void setBuildBranchDeployedDateTime(String buildBranchDeployedDateTime) {
    this.buildBranchDeployedDateTime = buildBranchDeployedDateTime;
  }

  public ServiceInformation buildSHA(String buildSHA) {
    this.buildSHA = buildSHA;
    return this;
  }

   /**
   * Reserved: TBD
   * @return buildSHA
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public String getBuildSHA() {
    return buildSHA;
  }

  public void setBuildSHA(String buildSHA) {
    this.buildSHA = buildSHA;
  }

  public ServiceInformation buildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
    return this;
  }

   /**
   * Reserved: TBD
   * @return buildVersion
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public String getBuildVersion() {
    return buildVersion;
  }

  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }

  public ServiceInformation linkedSites(java.util.List<String> linkedSites) {
    this.linkedSites = linkedSites;
    return this;
  }

  public ServiceInformation addLinkedSitesItem(String linkedSitesItem) {
    if (this.linkedSites == null) {
      this.linkedSites = new java.util.ArrayList<String>();
    }
    this.linkedSites.add(linkedSitesItem);
    return this;
  }

   /**
   * 
   * @return linkedSites
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getLinkedSites() {
    return linkedSites;
  }

  public void setLinkedSites(java.util.List<String> linkedSites) {
    this.linkedSites = linkedSites;
  }

  public ServiceInformation serviceVersions(java.util.List<ServiceVersion> serviceVersions) {
    this.serviceVersions = serviceVersions;
    return this;
  }

  public ServiceInformation addServiceVersionsItem(ServiceVersion serviceVersionsItem) {
    if (this.serviceVersions == null) {
      this.serviceVersions = new java.util.ArrayList<ServiceVersion>();
    }
    this.serviceVersions.add(serviceVersionsItem);
    return this;
  }

   /**
   * 
   * @return serviceVersions
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ServiceVersion> getServiceVersions() {
    return serviceVersions;
  }

  public void setServiceVersions(java.util.List<ServiceVersion> serviceVersions) {
    this.serviceVersions = serviceVersions;
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
    return Objects.equals(this.buildBranch, serviceInformation.buildBranch) &&
        Objects.equals(this.buildBranchDeployedDateTime, serviceInformation.buildBranchDeployedDateTime) &&
        Objects.equals(this.buildSHA, serviceInformation.buildSHA) &&
        Objects.equals(this.buildVersion, serviceInformation.buildVersion) &&
        Objects.equals(this.linkedSites, serviceInformation.linkedSites) &&
        Objects.equals(this.serviceVersions, serviceInformation.serviceVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildBranch, buildBranchDeployedDateTime, buildSHA, buildVersion, linkedSites, serviceVersions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInformation {\n");
    
    sb.append("    buildBranch: ").append(toIndentedString(buildBranch)).append("\n");
    sb.append("    buildBranchDeployedDateTime: ").append(toIndentedString(buildBranchDeployedDateTime)).append("\n");
    sb.append("    buildSHA: ").append(toIndentedString(buildSHA)).append("\n");
    sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
    sb.append("    linkedSites: ").append(toIndentedString(linkedSites)).append("\n");
    sb.append("    serviceVersions: ").append(toIndentedString(serviceVersions)).append("\n");
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

