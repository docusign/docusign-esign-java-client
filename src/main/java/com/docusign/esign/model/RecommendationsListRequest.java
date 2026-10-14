package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.RecommendationInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * RecommendationsListRequest.
 *
 */

public class RecommendationsListRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("recommendations")
  private java.util.List<RecommendationInfo> recommendations = null;


  /**
   * recommendations.
   *
   * @return RecommendationsListRequest
   **/
  public RecommendationsListRequest recommendations(java.util.List<RecommendationInfo> recommendations) {
    this.recommendations = recommendations;
    return this;
  }
  
  /**
   * addRecommendationsItem.
   *
   * @return RecommendationsListRequest
   **/
  public RecommendationsListRequest addRecommendationsItem(RecommendationInfo recommendationsItem) {
    if (this.recommendations == null) {
      this.recommendations = new java.util.ArrayList<>();
    }
    this.recommendations.add(recommendationsItem);
    return this;
  }

  /**
   * .
   * @return recommendations
   **/
  @Schema(description = "")
  public java.util.List<RecommendationInfo> getRecommendations() {
    return recommendations;
  }

  /**
   * setRecommendations.
   **/
  public void setRecommendations(java.util.List<RecommendationInfo> recommendations) {
    this.recommendations = recommendations;
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
    RecommendationsListRequest recommendationsListRequest = (RecommendationsListRequest) o;
    return Objects.equals(this.recommendations, recommendationsListRequest.recommendations);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(recommendations);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationsListRequest {\n");
    
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
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

