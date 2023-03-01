package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BrandResources;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * BrandResourcesList.
 *
 */

public class BrandResourcesList {
  @JsonProperty("resourcesContentTypes")
  private java.util.List<BrandResources> resourcesContentTypes = null;

  /**
   * resourcesContentTypes.
   *
   * @return BrandResourcesList
   **/
  public BrandResourcesList resourcesContentTypes(java.util.List<BrandResources> resourcesContentTypes) {
    this.resourcesContentTypes = resourcesContentTypes;
    return this;
  }

  /**
   * addResourcesContentTypesItem.
   *
   * @return BrandResourcesList
   **/
  public BrandResourcesList addResourcesContentTypesItem(BrandResources resourcesContentTypesItem) {
    if (this.resourcesContentTypes == null) {
      this.resourcesContentTypes = new java.util.ArrayList<>();
    }
    this.resourcesContentTypes.add(resourcesContentTypesItem);
    return this;
  }

  /**
   * .
   * 
   * @return resourcesContentTypes
   **/
  @Schema(description = "")
  public java.util.List<BrandResources> getResourcesContentTypes() {
    return resourcesContentTypes;
  }

  /**
   * setResourcesContentTypes.
   **/
  public void setResourcesContentTypes(java.util.List<BrandResources> resourcesContentTypes) {
    this.resourcesContentTypes = resourcesContentTypes;
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
    BrandResourcesList brandResourcesList = (BrandResourcesList) o;
    return Objects.equals(this.resourcesContentTypes, brandResourcesList.resourcesContentTypes);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(resourcesContentTypes);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandResourcesList {\n");

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
