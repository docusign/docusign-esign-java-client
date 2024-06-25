package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.FavoriteTemplatesContentItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * FavoriteTemplatesInfo.
 *
 */

public class FavoriteTemplatesInfo implements Serializable {
  private static final long serialVersionUID = 1L;

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
   **/
  public FavoriteTemplatesInfo errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * favoriteTemplates.
   *
   * @return FavoriteTemplatesInfo
   **/
  public FavoriteTemplatesInfo favoriteTemplates(java.util.List<FavoriteTemplatesContentItem> favoriteTemplates) {
    this.favoriteTemplates = favoriteTemplates;
    return this;
  }
  
  /**
   * addFavoriteTemplatesItem.
   *
   * @return FavoriteTemplatesInfo
   **/
  public FavoriteTemplatesInfo addFavoriteTemplatesItem(FavoriteTemplatesContentItem favoriteTemplatesItem) {
    if (this.favoriteTemplates == null) {
      this.favoriteTemplates = new java.util.ArrayList<>();
    }
    this.favoriteTemplates.add(favoriteTemplatesItem);
    return this;
  }

  /**
   * .
   * @return favoriteTemplates
   **/
  @Schema(description = "")
  public java.util.List<FavoriteTemplatesContentItem> getFavoriteTemplates() {
    return favoriteTemplates;
  }

  /**
   * setFavoriteTemplates.
   **/
  public void setFavoriteTemplates(java.util.List<FavoriteTemplatesContentItem> favoriteTemplates) {
    this.favoriteTemplates = favoriteTemplates;
  }


  /**
   * templatesUpdatedCount.
   *
   * @return FavoriteTemplatesInfo
   **/
  public FavoriteTemplatesInfo templatesUpdatedCount(Integer templatesUpdatedCount) {
    this.templatesUpdatedCount = templatesUpdatedCount;
    return this;
  }

  /**
   * .
   * @return templatesUpdatedCount
   **/
  @Schema(description = "")
  public Integer getTemplatesUpdatedCount() {
    return templatesUpdatedCount;
  }

  /**
   * setTemplatesUpdatedCount.
   **/
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
    return Objects.equals(this.errorDetails, favoriteTemplatesInfo.errorDetails) &&
        Objects.equals(this.favoriteTemplates, favoriteTemplatesInfo.favoriteTemplates) &&
        Objects.equals(this.templatesUpdatedCount, favoriteTemplatesInfo.templatesUpdatedCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, favoriteTemplates, templatesUpdatedCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoriteTemplatesInfo {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    favoriteTemplates: ").append(toIndentedString(favoriteTemplates)).append("\n");
    sb.append("    templatesUpdatedCount: ").append(toIndentedString(templatesUpdatedCount)).append("\n");
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

