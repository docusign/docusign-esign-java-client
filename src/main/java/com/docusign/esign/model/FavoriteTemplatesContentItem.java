package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FavoriteTemplatesContentItem.
 *
 */

public class FavoriteTemplatesContentItem {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("favoritedDate")
  private String favoritedDate = null;

  @JsonProperty("templateId")
  private String templateId = null;


  /**
   * errorDetails.
   *
   * @return FavoriteTemplatesContentItem
   **/
  public FavoriteTemplatesContentItem errorDetails(ErrorDetails errorDetails) {
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
   * favoritedDate.
   *
   * @return FavoriteTemplatesContentItem
   **/
  public FavoriteTemplatesContentItem favoritedDate(String favoritedDate) {
    this.favoritedDate = favoritedDate;
    return this;
  }

  /**
   * .
   * @return favoritedDate
   **/
  @Schema(description = "")
  public String getFavoritedDate() {
    return favoritedDate;
  }

  /**
   * setFavoritedDate.
   **/
  public void setFavoritedDate(String favoritedDate) {
    this.favoritedDate = favoritedDate;
  }


  /**
   * templateId.
   *
   * @return FavoriteTemplatesContentItem
   **/
  public FavoriteTemplatesContentItem templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. .
   * @return templateId
   **/
  @Schema(description = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  /**
   * setTemplateId.
   **/
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
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
    FavoriteTemplatesContentItem favoriteTemplatesContentItem = (FavoriteTemplatesContentItem) o;
    return Objects.equals(this.errorDetails, favoriteTemplatesContentItem.errorDetails) &&
        Objects.equals(this.favoritedDate, favoriteTemplatesContentItem.favoritedDate) &&
        Objects.equals(this.templateId, favoriteTemplatesContentItem.templateId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, favoritedDate, templateId);
  }


  /**
   * Converts the given object to string.
   */
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

