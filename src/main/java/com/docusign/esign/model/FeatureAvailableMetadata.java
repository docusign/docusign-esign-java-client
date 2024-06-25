package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * FeatureAvailableMetadata.
 *
 */

public class FeatureAvailableMetadata implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("availabilty")
  private String availabilty = null;

  @JsonProperty("featureName")
  private String featureName = null;


  /**
   * availabilty.
   *
   * @return FeatureAvailableMetadata
   **/
  public FeatureAvailableMetadata availabilty(String availabilty) {
    this.availabilty = availabilty;
    return this;
  }

  /**
   * .
   * @return availabilty
   **/
  @Schema(description = "")
  public String getAvailabilty() {
    return availabilty;
  }

  /**
   * setAvailabilty.
   **/
  public void setAvailabilty(String availabilty) {
    this.availabilty = availabilty;
  }


  /**
   * featureName.
   *
   * @return FeatureAvailableMetadata
   **/
  public FeatureAvailableMetadata featureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  /**
   * .
   * @return featureName
   **/
  @Schema(description = "")
  public String getFeatureName() {
    return featureName;
  }

  /**
   * setFeatureName.
   **/
  public void setFeatureName(String featureName) {
    this.featureName = featureName;
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
    FeatureAvailableMetadata featureAvailableMetadata = (FeatureAvailableMetadata) o;
    return Objects.equals(this.availabilty, featureAvailableMetadata.availabilty) &&
        Objects.equals(this.featureName, featureAvailableMetadata.featureName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(availabilty, featureName);
  }


  /**
   * Converts the given object to string.
   */
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

