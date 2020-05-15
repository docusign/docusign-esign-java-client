package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FavoriteTemplatesContentItem
 */

public class FavoriteTemplatesContentItem {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("favoritedDate")
  private String favoritedDate = null;

  @JsonProperty("templateId")
  private String templateId = null;

  public FavoriteTemplatesContentItem errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public FavoriteTemplatesContentItem favoritedDate(String favoritedDate) {
    this.favoritedDate = favoritedDate;
    return this;
  }

   /**
   * 
   * @return favoritedDate
  **/
  @ApiModelProperty(value = "")
  public String getFavoritedDate() {
    return favoritedDate;
  }

  public void setFavoritedDate(String favoritedDate) {
    this.favoritedDate = favoritedDate;
  }

  public FavoriteTemplatesContentItem templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   * @return templateId
  **/
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoriteTemplatesContentItem favoriteTemplatesContentItem = (FavoriteTemplatesContentItem) o;
    return Objects.equals(this.errorDetails, favoriteTemplatesContentItem.errorDetails) &&
        Objects.equals(this.favoritedDate, favoriteTemplatesContentItem.favoritedDate) &&
        Objects.equals(this.templateId, favoriteTemplatesContentItem.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, favoritedDate, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoriteTemplatesContentItem {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    favoritedDate: ").append(toIndentedString(favoritedDate)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

