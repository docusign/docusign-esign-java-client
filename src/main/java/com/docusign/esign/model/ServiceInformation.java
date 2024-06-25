package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ServiceVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ServiceInformation.
 *
 */

public class ServiceInformation implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * buildBranch.
   *
   * @return ServiceInformation
   **/
  public ServiceInformation buildBranch(String buildBranch) {
    this.buildBranch = buildBranch;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return buildBranch
   **/
  @Schema(description = "Reserved: TBD")
  public String getBuildBranch() {
    return buildBranch;
  }

  /**
   * setBuildBranch.
   **/
  public void setBuildBranch(String buildBranch) {
    this.buildBranch = buildBranch;
  }


  /**
   * buildBranchDeployedDateTime.
   *
   * @return ServiceInformation
   **/
  public ServiceInformation buildBranchDeployedDateTime(String buildBranchDeployedDateTime) {
    this.buildBranchDeployedDateTime = buildBranchDeployedDateTime;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return buildBranchDeployedDateTime
   **/
  @Schema(description = "Reserved: TBD")
  public String getBuildBranchDeployedDateTime() {
    return buildBranchDeployedDateTime;
  }

  /**
   * setBuildBranchDeployedDateTime.
   **/
  public void setBuildBranchDeployedDateTime(String buildBranchDeployedDateTime) {
    this.buildBranchDeployedDateTime = buildBranchDeployedDateTime;
  }


  /**
   * buildSHA.
   *
   * @return ServiceInformation
   **/
  public ServiceInformation buildSHA(String buildSHA) {
    this.buildSHA = buildSHA;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return buildSHA
   **/
  @Schema(description = "Reserved: TBD")
  public String getBuildSHA() {
    return buildSHA;
  }

  /**
   * setBuildSHA.
   **/
  public void setBuildSHA(String buildSHA) {
    this.buildSHA = buildSHA;
  }


  /**
   * buildVersion.
   *
   * @return ServiceInformation
   **/
  public ServiceInformation buildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return buildVersion
   **/
  @Schema(description = "Reserved: TBD")
  public String getBuildVersion() {
    return buildVersion;
  }

  /**
   * setBuildVersion.
   **/
  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }


  /**
   * linkedSites.
   *
   * @return ServiceInformation
   **/
  public ServiceInformation linkedSites(java.util.List<String> linkedSites) {
    this.linkedSites = linkedSites;
    return this;
  }
  
  /**
   * addLinkedSitesItem.
   *
   * @return ServiceInformation
   **/
  public ServiceInformation addLinkedSitesItem(String linkedSitesItem) {
    if (this.linkedSites == null) {
      this.linkedSites = new java.util.ArrayList<>();
    }
    this.linkedSites.add(linkedSitesItem);
    return this;
  }

  /**
   * .
   * @return linkedSites
   **/
  @Schema(description = "")
  public java.util.List<String> getLinkedSites() {
    return linkedSites;
  }

  /**
   * setLinkedSites.
   **/
  public void setLinkedSites(java.util.List<String> linkedSites) {
    this.linkedSites = linkedSites;
  }


  /**
   * serviceVersions.
   *
   * @return ServiceInformation
   **/
  public ServiceInformation serviceVersions(java.util.List<ServiceVersion> serviceVersions) {
    this.serviceVersions = serviceVersions;
    return this;
  }
  
  /**
   * addServiceVersionsItem.
   *
   * @return ServiceInformation
   **/
  public ServiceInformation addServiceVersionsItem(ServiceVersion serviceVersionsItem) {
    if (this.serviceVersions == null) {
      this.serviceVersions = new java.util.ArrayList<>();
    }
    this.serviceVersions.add(serviceVersionsItem);
    return this;
  }

  /**
   * .
   * @return serviceVersions
   **/
  @Schema(description = "")
  public java.util.List<ServiceVersion> getServiceVersions() {
    return serviceVersions;
  }

  /**
   * setServiceVersions.
   **/
  public void setServiceVersions(java.util.List<ServiceVersion> serviceVersions) {
    this.serviceVersions = serviceVersions;
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
    ServiceInformation serviceInformation = (ServiceInformation) o;
    return Objects.equals(this.buildBranch, serviceInformation.buildBranch) &&
        Objects.equals(this.buildBranchDeployedDateTime, serviceInformation.buildBranchDeployedDateTime) &&
        Objects.equals(this.buildSHA, serviceInformation.buildSHA) &&
        Objects.equals(this.buildVersion, serviceInformation.buildVersion) &&
        Objects.equals(this.linkedSites, serviceInformation.linkedSites) &&
        Objects.equals(this.serviceVersions, serviceInformation.serviceVersions);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(buildBranch, buildBranchDeployedDateTime, buildSHA, buildVersion, linkedSites, serviceVersions);
  }


  /**
   * Converts the given object to string.
   */
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

