package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ConnectCustomConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ConnectConfigResults   {
  
  private java.util.List<ConnectCustomConfiguration> configurations = new java.util.ArrayList<ConnectCustomConfiguration>();
  private String totalRecords = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("configurations")
  public java.util.List<ConnectCustomConfiguration> getConfigurations() {
    return configurations;
  }
  public void setConfigurations(java.util.List<ConnectCustomConfiguration> configurations) {
    this.configurations = configurations;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalRecords")
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

    return true && Objects.equals(configurations, connectConfigResults.configurations) &&
        Objects.equals(totalRecords, connectConfigResults.totalRecords)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurations, totalRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectConfigResults {\n");
    
    if (configurations != null)
      sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
    if (totalRecords != null)
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

