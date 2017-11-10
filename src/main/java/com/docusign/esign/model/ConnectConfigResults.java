package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ConnectCustomConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectConfigResults
 */

public class ConnectConfigResults {
  @JsonProperty("configurations")
  private java.util.List<ConnectCustomConfiguration> configurations = new java.util.ArrayList<ConnectCustomConfiguration>();

  @JsonProperty("totalRecords")
  private String totalRecords = null;

  public ConnectConfigResults configurations(java.util.List<ConnectCustomConfiguration> configurations) {
    this.configurations = configurations;
    return this;
  }

  public ConnectConfigResults addConfigurationsItem(ConnectCustomConfiguration configurationsItem) {
    this.configurations.add(configurationsItem);
    return this;
  }

   /**
   * Reserved: TBD
   * @return configurations
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public java.util.List<ConnectCustomConfiguration> getConfigurations() {
    return configurations;
  }

  public void setConfigurations(java.util.List<ConnectCustomConfiguration> configurations) {
    this.configurations = configurations;
  }

  public ConnectConfigResults totalRecords(String totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * 
   * @return totalRecords
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTotalRecords() {
    return totalRecords;
  }

  public void setTotalRecords(String totalRecords) {
    this.totalRecords = totalRecords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectConfigResults connectConfigResults = (ConnectConfigResults) o;
    return Objects.equals(this.configurations, connectConfigResults.configurations) &&
        Objects.equals(this.totalRecords, connectConfigResults.totalRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurations, totalRecords);
  }


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

