package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.FavoriteTemplatesContentItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FavoriteTemplatesInfo
 */

public class FavoriteTemplatesInfo {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("favoriteTemplates")
  private java.util.List<FavoriteTemplatesContentItem> favoriteTemplates = new java.util.ArrayList<FavoriteTemplatesContentItem>();

  @JsonProperty("templatesUpdatedCount")
  private Integer templatesUpdatedCount = null;

  public FavoriteTemplatesInfo errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public FavoriteTemplatesInfo favoriteTemplates(java.util.List<FavoriteTemplatesContentItem> favoriteTemplates) {
    this.favoriteTemplates = favoriteTemplates;
    return this;
  }

  public FavoriteTemplatesInfo addFavoriteTemplatesItem(FavoriteTemplatesContentItem favoriteTemplatesItem) {
    this.favoriteTemplates.add(favoriteTemplatesItem);
    return this;
  }

   /**
   * 
   * @return favoriteTemplates
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<FavoriteTemplatesContentItem> getFavoriteTemplates() {
    return favoriteTemplates;
  }

  public void setFavoriteTemplates(java.util.List<FavoriteTemplatesContentItem> favoriteTemplates) {
    this.favoriteTemplates = favoriteTemplates;
  }

  public FavoriteTemplatesInfo templatesUpdatedCount(Integer templatesUpdatedCount) {
    this.templatesUpdatedCount = templatesUpdatedCount;
    return this;
  }

   /**
   * 
   * @return templatesUpdatedCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTemplatesUpdatedCount() {
    return templatesUpdatedCount;
  }

  public void setTemplatesUpdatedCount(Integer templatesUpdatedCount) {
    this.templatesUpdatedCount = templatesUpdatedCount;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, favoriteTemplates, templatesUpdatedCount);
  }


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

