package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BrandLink   {
  
  private String linkText = null;
  private String linkType = null;
  private String showLink = null;
  private String urlOrMailTo = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("linkText")
  public String getLinkText() {
    return linkText;
  }
  public void setLinkText(String linkText) {
    this.linkText = linkText;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("linkType")
  public String getLinkType() {
    return linkType;
  }
  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("showLink")
  public String getShowLink() {
    return showLink;
  }
  public void setShowLink(String showLink) {
    this.showLink = showLink;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("urlOrMailTo")
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

    return true && Objects.equals(linkText, brandLink.linkText) &&
        Objects.equals(linkType, brandLink.linkType) &&
        Objects.equals(showLink, brandLink.showLink) &&
        Objects.equals(urlOrMailTo, brandLink.urlOrMailTo)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkText, linkType, showLink, urlOrMailTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandLink {\n");
    
    if (linkText != null)
      sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
    if (linkType != null)
      sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    if (showLink != null)
      sb.append("    showLink: ").append(toIndentedString(showLink)).append("\n");
    if (urlOrMailTo != null)
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

