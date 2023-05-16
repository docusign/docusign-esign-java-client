package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResourceInformation.
 *
 */

public class ResourceInformation {
  @JsonProperty("resources")
  private java.util.List<NameValue> resources = null;


  /**
   * resources.
   *
   * @return ResourceInformation
   **/
  public ResourceInformation resources(java.util.List<NameValue> resources) {
    this.resources = resources;
    return this;
  }
  
  /**
   * addResourcesItem.
   *
   * @return ResourceInformation
   **/
  public ResourceInformation addResourcesItem(NameValue resourcesItem) {
    if (this.resources == null) {
      this.resources = new java.util.ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * .
   * @return resources
   **/
  @Schema(description = "")
  public java.util.List<NameValue> getResources() {
    return resources;
  }

  /**
   * setResources.
   **/
  public void setResources(java.util.List<NameValue> resources) {
    this.resources = resources;
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
    ResourceInformation resourceInformation = (ResourceInformation) o;
    return Objects.equals(this.resources, resourceInformation.resources);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }


  /**
   * Converts the given object to string.
   */
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

