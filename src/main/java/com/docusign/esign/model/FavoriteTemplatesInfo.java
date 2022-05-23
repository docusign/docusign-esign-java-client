package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** FavoriteTemplatesInfo. */
public class FavoriteTemplatesInfo {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("favoriteTemplates")
  private java.util.List<FavoriteTemplatesContentItem> favoriteTemplates = null;

  @JsonProperty("templatesUpdatedCount")
  private Integer templatesUpdatedCount = null;

  /**
   * errorDetails.
   *
   * @return FavoriteTemplatesInfo
   */
  public FavoriteTemplatesInfo errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   *
   * @return errorDetails
   */
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /** setErrorDetails. */
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  /**
   * favoriteTemplates.
   *
   * @return FavoriteTemplatesInfo
   */
  public FavoriteTemplatesInfo favoriteTemplates(
      java.util.List<FavoriteTemplatesContentItem> favoriteTemplates) {
    this.favoriteTemplates = favoriteTemplates;
    return this;
  }

  /**
   * addFavoriteTemplatesItem.
   *
   * @return FavoriteTemplatesInfo
   */
  public FavoriteTemplatesInfo addFavoriteTemplatesItem(
      FavoriteTemplatesContentItem favoriteTemplatesItem) {
    if (this.favoriteTemplates == null) {
      this.favoriteTemplates = new java.util.ArrayList<>();
    }
    this.favoriteTemplates.add(favoriteTemplatesItem);
    return this;
  }

  /**
   * .
   *
   * @return favoriteTemplates
   */
  @ApiModelProperty(value = "")
  public java.util.List<FavoriteTemplatesContentItem> getFavoriteTemplates() {
    return favoriteTemplates;
  }

  /** setFavoriteTemplates. */
  public void setFavoriteTemplates(java.util.List<FavoriteTemplatesContentItem> favoriteTemplates) {
    this.favoriteTemplates = favoriteTemplates;
  }

  /**
   * templatesUpdatedCount.
   *
   * @return FavoriteTemplatesInfo
   */
  public FavoriteTemplatesInfo templatesUpdatedCount(Integer templatesUpdatedCount) {
    this.templatesUpdatedCount = templatesUpdatedCount;
    return this;
  }

  /**
   * .
   *
   * @return templatesUpdatedCount
   */
  @ApiModelProperty(value = "")
  public Integer getTemplatesUpdatedCount() {
    return templatesUpdatedCount;
  }

  /** setTemplatesUpdatedCount. */
  public void setTemplatesUpdatedCount(Integer templatesUpdatedCount) {
    this.templatesUpdatedCount = templatesUpdatedCount;
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
    FavoriteTemplatesInfo favoriteTemplatesInfo = (FavoriteTemplatesInfo) o;
    return Objects.equals(this.errorDetails, favoriteTemplatesInfo.errorDetails)
        && Objects.equals(this.favoriteTemplates, favoriteTemplatesInfo.favoriteTemplates)
        && Objects.equals(this.templatesUpdatedCount, favoriteTemplatesInfo.templatesUpdatedCount);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, favoriteTemplates, templatesUpdatedCount);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoriteTemplatesInfo {\n");

    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    favoriteTemplates: ").append(toIndentedString(favoriteTemplates)).append("\n");
    sb.append("    templatesUpdatedCount: ")
        .append(toIndentedString(templatesUpdatedCount))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
