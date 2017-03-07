package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BrandResources;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BrandResourcesList   {
  
  private java.util.List<BrandResources> resourcesContentTypes = new java.util.ArrayList<BrandResources>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("resourcesContentTypes")
  public java.util.List<BrandResources> getResourcesContentTypes() {
    return resourcesContentTypes;
  }
  public void setResourcesContentTypes(java.util.List<BrandResources> resourcesContentTypes) {
    this.resourcesContentTypes = resourcesContentTypes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandResourcesList brandResourcesList = (BrandResourcesList) o;

    return true && Objects.equals(resourcesContentTypes, brandResourcesList.resourcesContentTypes)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourcesContentTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandResourcesList {\n");
    
    if (resourcesContentTypes != null)
      sb.append("    resourcesContentTypes: ").append(toIndentedString(resourcesContentTypes)).append("\n");
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

