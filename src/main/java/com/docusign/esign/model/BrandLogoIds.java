package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * BrandLogoIds.
 *
 */

public class BrandLogoIds implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("emailLogoId")
  private String emailLogoId = null;

  @JsonProperty("primaryLogoId")
  private String primaryLogoId = null;

  @JsonProperty("secondaryLogoId")
  private String secondaryLogoId = null;


  /**
   * emailLogoId.
   *
   * @return BrandLogoIds
   **/
  public BrandLogoIds emailLogoId(String emailLogoId) {
    this.emailLogoId = emailLogoId;
    return this;
  }

  /**
   * .
   * @return emailLogoId
   **/
  @Schema(description = "")
  public String getEmailLogoId() {
    return emailLogoId;
  }

  /**
   * setEmailLogoId.
   **/
  public void setEmailLogoId(String emailLogoId) {
    this.emailLogoId = emailLogoId;
  }


  /**
   * primaryLogoId.
   *
   * @return BrandLogoIds
   **/
  public BrandLogoIds primaryLogoId(String primaryLogoId) {
    this.primaryLogoId = primaryLogoId;
    return this;
  }

  /**
   * .
   * @return primaryLogoId
   **/
  @Schema(description = "")
  public String getPrimaryLogoId() {
    return primaryLogoId;
  }

  /**
   * setPrimaryLogoId.
   **/
  public void setPrimaryLogoId(String primaryLogoId) {
    this.primaryLogoId = primaryLogoId;
  }


  /**
   * secondaryLogoId.
   *
   * @return BrandLogoIds
   **/
  public BrandLogoIds secondaryLogoId(String secondaryLogoId) {
    this.secondaryLogoId = secondaryLogoId;
    return this;
  }

  /**
   * .
   * @return secondaryLogoId
   **/
  @Schema(description = "")
  public String getSecondaryLogoId() {
    return secondaryLogoId;
  }

  /**
   * setSecondaryLogoId.
   **/
  public void setSecondaryLogoId(String secondaryLogoId) {
    this.secondaryLogoId = secondaryLogoId;
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
    BrandLogoIds brandLogoIds = (BrandLogoIds) o;
    return Objects.equals(this.emailLogoId, brandLogoIds.emailLogoId) &&
        Objects.equals(this.primaryLogoId, brandLogoIds.primaryLogoId) &&
        Objects.equals(this.secondaryLogoId, brandLogoIds.secondaryLogoId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(emailLogoId, primaryLogoId, secondaryLogoId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandLogoIds {\n");
    
    sb.append("    emailLogoId: ").append(toIndentedString(emailLogoId)).append("\n");
    sb.append("    primaryLogoId: ").append(toIndentedString(primaryLogoId)).append("\n");
    sb.append("    secondaryLogoId: ").append(toIndentedString(secondaryLogoId)).append("\n");
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

