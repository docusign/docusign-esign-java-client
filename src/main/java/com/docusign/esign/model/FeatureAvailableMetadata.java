package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FeatureAvailableMetadata
 */

public class FeatureAvailableMetadata {
  @JsonProperty("availabilty")
  private String availabilty = null;

  @JsonProperty("featureName")
  private String featureName = null;

  public FeatureAvailableMetadata availabilty(String availabilty) {
    this.availabilty = availabilty;
    return this;
  }

   /**
   * 
   * @return availabilty
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAvailabilty() {
    return availabilty;
  }

  public void setAvailabilty(String availabilty) {
    this.availabilty = availabilty;
  }

  public FeatureAvailableMetadata featureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

   /**
   * 
   * @return featureName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFeatureName() {
    return featureName;
  }

  public void setFeatureName(String featureName) {
    this.featureName = featureName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureAvailableMetadata featureAvailableMetadata = (FeatureAvailableMetadata) o;
    return Objects.equals(this.availabilty, featureAvailableMetadata.availabilty) &&
        Objects.equals(this.featureName, featureAvailableMetadata.featureName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilty, featureName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureAvailableMetadata {\n");
    
    sb.append("    availabilty: ").append(toIndentedString(availabilty)).append("\n");
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
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

