package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ConnectConfigResults. */
public class ConnectConfigResults {
  @JsonProperty("configurations")
  private java.util.List<ConnectCustomConfiguration> configurations = null;

  @JsonProperty("totalRecords")
  private String totalRecords = null;

  /**
   * configurations.
   *
   * @return ConnectConfigResults
   */
  public ConnectConfigResults configurations(
      java.util.List<ConnectCustomConfiguration> configurations) {
    this.configurations = configurations;
    return this;
  }

  /**
   * addConfigurationsItem.
   *
   * @return ConnectConfigResults
   */
  public ConnectConfigResults addConfigurationsItem(ConnectCustomConfiguration configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new java.util.ArrayList<>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

  /**
   * Reserved: TBD.
   *
   * @return configurations
   */
  @ApiModelProperty(value = "Reserved: TBD")
  public java.util.List<ConnectCustomConfiguration> getConfigurations() {
    return configurations;
  }

  /** setConfigurations. */
  public void setConfigurations(java.util.List<ConnectCustomConfiguration> configurations) {
    this.configurations = configurations;
  }

  /**
   * totalRecords.
   *
   * @return ConnectConfigResults
   */
  public ConnectConfigResults totalRecords(String totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

  /**
   * .
   *
   * @return totalRecords
   */
  @ApiModelProperty(value = "")
  public String getTotalRecords() {
    return totalRecords;
  }

  /** setTotalRecords. */
  public void setTotalRecords(String totalRecords) {
    this.totalRecords = totalRecords;
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
    ConnectConfigResults connectConfigResults = (ConnectConfigResults) o;
    return Objects.equals(this.configurations, connectConfigResults.configurations)
        && Objects.equals(this.totalRecords, connectConfigResults.totalRecords);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(configurations, totalRecords);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectConfigResults {\n");

    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
