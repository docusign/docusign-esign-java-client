package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Information about a link that a brand uses..
 *
 */
@Schema(description = "Information about a link that a brand uses.")

public class BrandLink implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("linkText")
  private String linkText = null;

  @JsonProperty("linkType")
  private String linkType = null;

  @JsonProperty("showLink")
  private String showLink = null;

  @JsonProperty("urlOrMailTo")
  private String urlOrMailTo = null;


  /**
   * linkText.
   *
   * @return BrandLink
   **/
  public BrandLink linkText(String linkText) {
    this.linkText = linkText;
    return this;
  }

  /**
   * .
   * @return linkText
   **/
  @Schema(description = "")
  public String getLinkText() {
    return linkText;
  }

  /**
   * setLinkText.
   **/
  public void setLinkText(String linkText) {
    this.linkText = linkText;
  }


  /**
   * linkType.
   *
   * @return BrandLink
   **/
  public BrandLink linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

  /**
   * .
   * @return linkType
   **/
  @Schema(description = "")
  public String getLinkType() {
    return linkType;
  }

  /**
   * setLinkType.
   **/
  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }


  /**
   * showLink.
   *
   * @return BrandLink
   **/
  public BrandLink showLink(String showLink) {
    this.showLink = showLink;
    return this;
  }

  /**
   * .
   * @return showLink
   **/
  @Schema(description = "")
  public String getShowLink() {
    return showLink;
  }

  /**
   * setShowLink.
   **/
  public void setShowLink(String showLink) {
    this.showLink = showLink;
  }


  /**
   * urlOrMailTo.
   *
   * @return BrandLink
   **/
  public BrandLink urlOrMailTo(String urlOrMailTo) {
    this.urlOrMailTo = urlOrMailTo;
    return this;
  }

  /**
   * .
   * @return urlOrMailTo
   **/
  @Schema(description = "")
  public String getUrlOrMailTo() {
    return urlOrMailTo;
  }

  /**
   * setUrlOrMailTo.
   **/
  public void setUrlOrMailTo(String urlOrMailTo) {
    this.urlOrMailTo = urlOrMailTo;
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
    BrandLink brandLink = (BrandLink) o;
    return Objects.equals(this.linkText, brandLink.linkText) &&
        Objects.equals(this.linkType, brandLink.linkType) &&
        Objects.equals(this.showLink, brandLink.showLink) &&
        Objects.equals(this.urlOrMailTo, brandLink.urlOrMailTo);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(linkText, linkType, showLink, urlOrMailTo);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandLink {\n");
    
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    showLink: ").append(toIndentedString(showLink)).append("\n");
    sb.append("    urlOrMailTo: ").append(toIndentedString(urlOrMailTo)).append("\n");
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

