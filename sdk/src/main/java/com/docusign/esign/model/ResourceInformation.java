package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.NameValue;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class ResourceInformation   {
  
  private java.util.List<NameValue> resources = new java.util.ArrayList<NameValue>();

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("resources")
  public java.util.List<NameValue> getResources() {
    return resources;
  }
  public void setResources(java.util.List<NameValue> resources) {
    this.resources = resources;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceInformation resourceInformation = (ResourceInformation) o;
    return Objects.equals(resources, resourceInformation.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceInformation {\n");
    
    sb.append("    resources: ").append(StringUtil.toIndentedString(resources)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
