package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * RecommendationInfo.
 *
 */

public class RecommendationInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("recommendationId")
  private String recommendationId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("title")
  private String title = null;


  /**
   * description.
   *
   * @return RecommendationInfo
   **/
  public RecommendationInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * .
   * @return description
   **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  /**
   * setDescription.
   **/
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * priority.
   *
   * @return RecommendationInfo
   **/
  public RecommendationInfo priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * .
   * @return priority
   **/
  @Schema(description = "")
  public String getPriority() {
    return priority;
  }

  /**
   * setPriority.
   **/
  public void setPriority(String priority) {
    this.priority = priority;
  }


  /**
   * recommendationId.
   *
   * @return RecommendationInfo
   **/
  public RecommendationInfo recommendationId(String recommendationId) {
    this.recommendationId = recommendationId;
    return this;
  }

  /**
   * .
   * @return recommendationId
   **/
  @Schema(description = "")
  public String getRecommendationId() {
    return recommendationId;
  }

  /**
   * setRecommendationId.
   **/
  public void setRecommendationId(String recommendationId) {
    this.recommendationId = recommendationId;
  }


  /**
   * status.
   *
   * @return RecommendationInfo
   **/
  public RecommendationInfo status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @Schema(description = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * title.
   *
   * @return RecommendationInfo
   **/
  public RecommendationInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * .
   * @return title
   **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  /**
   * setTitle.
   **/
  public void setTitle(String title) {
    this.title = title;
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
    RecommendationInfo recommendationInfo = (RecommendationInfo) o;
    return Objects.equals(this.description, recommendationInfo.description) &&
        Objects.equals(this.priority, recommendationInfo.priority) &&
        Objects.equals(this.recommendationId, recommendationInfo.recommendationId) &&
        Objects.equals(this.status, recommendationInfo.status) &&
        Objects.equals(this.title, recommendationInfo.title);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(description, priority, recommendationId, status, title);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationInfo {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

