package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.MobileNotifierConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MobileNotifierConfigurationInformation
 */

public class MobileNotifierConfigurationInformation {
  @JsonProperty("mobileNotifierConfigurations")
  private java.util.List<MobileNotifierConfiguration> mobileNotifierConfigurations = new java.util.ArrayList<MobileNotifierConfiguration>();

  public MobileNotifierConfigurationInformation mobileNotifierConfigurations(java.util.List<MobileNotifierConfiguration> mobileNotifierConfigurations) {
    this.mobileNotifierConfigurations = mobileNotifierConfigurations;
    return this;
  }

  public MobileNotifierConfigurationInformation addMobileNotifierConfigurationsItem(MobileNotifierConfiguration mobileNotifierConfigurationsItem) {
    this.mobileNotifierConfigurations.add(mobileNotifierConfigurationsItem);
    return this;
  }

   /**
   * 
   * @return mobileNotifierConfigurations
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<MobileNotifierConfiguration> getMobileNotifierConfigurations() {
    return mobileNotifierConfigurations;
  }

  public void setMobileNotifierConfigurations(java.util.List<MobileNotifierConfiguration> mobileNotifierConfigurations) {
    this.mobileNotifierConfigurations = mobileNotifierConfigurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileNotifierConfigurationInformation mobileNotifierConfigurationInformation = (MobileNotifierConfigurationInformation) o;
    return Objects.equals(this.mobileNotifierConfigurations, mobileNotifierConfigurationInformation.mobileNotifierConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileNotifierConfigurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileNotifierConfigurationInformation {\n");
    
    sb.append("    mobileNotifierConfigurations: ").append(toIndentedString(mobileNotifierConfigurations)).append("\n");
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

