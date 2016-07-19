package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class ResourceInformation   {
  
  private java.util.List<NameValue> resources = new java.util.ArrayList<NameValue>();

  
  /**
   * 
   **/
  public ResourceInformation resources(java.util.List<NameValue> resources) {
    this.resources = resources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resources")
  public java.util.List<NameValue> getResources() {
    return resources;
  }
  public void setResources(java.util.List<NameValue> resources) {
    this.resources = resources;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceInformation resourceInformation = (ResourceInformation) o;
    return Objects.equals(this.resources, resourceInformation.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceInformation {\n");
    
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

