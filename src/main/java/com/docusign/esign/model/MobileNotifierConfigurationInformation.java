package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.MobileNotifierConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class MobileNotifierConfigurationInformation   {
  
  private java.util.List<MobileNotifierConfiguration> mobileNotifierConfigurations = new java.util.ArrayList<MobileNotifierConfiguration>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mobileNotifierConfigurations")
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

    return true && Objects.equals(mobileNotifierConfigurations, mobileNotifierConfigurationInformation.mobileNotifierConfigurations)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileNotifierConfigurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileNotifierConfigurationInformation {\n");
    
    if (mobileNotifierConfigurations != null)
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

