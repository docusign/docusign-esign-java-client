package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BrandLink
 */

public class BrandLink {
  @JsonProperty("linkText")
  private String linkText = null;

  @JsonProperty("linkType")
  private String linkType = null;

  @JsonProperty("showLink")
  private String showLink = null;

  @JsonProperty("urlOrMailTo")
  private String urlOrMailTo = null;

  public BrandLink linkText(String linkText) {
    this.linkText = linkText;
    return this;
  }

   /**
   * 
   * @return linkText
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLinkText() {
    return linkText;
  }

  public void setLinkText(String linkText) {
    this.linkText = linkText;
  }

  public BrandLink linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * 
   * @return linkType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  public BrandLink showLink(String showLink) {
    this.showLink = showLink;
    return this;
  }

   /**
   * 
   * @return showLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShowLink() {
    return showLink;
  }

  public void setShowLink(String showLink) {
    this.showLink = showLink;
  }

  public BrandLink urlOrMailTo(String urlOrMailTo) {
    this.urlOrMailTo = urlOrMailTo;
    return this;
  }

   /**
   * 
   * @return urlOrMailTo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrlOrMailTo() {
    return urlOrMailTo;
  }

  public void setUrlOrMailTo(String urlOrMailTo) {
    this.urlOrMailTo = urlOrMailTo;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(linkText, linkType, showLink, urlOrMailTo);
  }


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

