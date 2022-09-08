package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Deprecated..
 *
 */
@ApiModel(description = "Deprecated.")

public class BrandEmailContent {
  @JsonProperty("content")
  private String content = null;

  @JsonProperty("emailContentType")
  private String emailContentType = null;

  @JsonProperty("emailToLink")
  private String emailToLink = null;

  @JsonProperty("linkText")
  private String linkText = null;


  /**
   * content.
   *
   * @return BrandEmailContent
   **/
  public BrandEmailContent content(String content) {
    this.content = content;
    return this;
  }

  /**
   * .
   * @return content
   **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  /**
   * setContent.
   **/
  public void setContent(String content) {
    this.content = content;
  }


  /**
   * emailContentType.
   *
   * @return BrandEmailContent
   **/
  public BrandEmailContent emailContentType(String emailContentType) {
    this.emailContentType = emailContentType;
    return this;
  }

  /**
   * .
   * @return emailContentType
   **/
  @ApiModelProperty(value = "")
  public String getEmailContentType() {
    return emailContentType;
  }

  /**
   * setEmailContentType.
   **/
  public void setEmailContentType(String emailContentType) {
    this.emailContentType = emailContentType;
  }


  /**
   * emailToLink.
   *
   * @return BrandEmailContent
   **/
  public BrandEmailContent emailToLink(String emailToLink) {
    this.emailToLink = emailToLink;
    return this;
  }

  /**
   * .
   * @return emailToLink
   **/
  @ApiModelProperty(value = "")
  public String getEmailToLink() {
    return emailToLink;
  }

  /**
   * setEmailToLink.
   **/
  public void setEmailToLink(String emailToLink) {
    this.emailToLink = emailToLink;
  }


  /**
   * linkText.
   *
   * @return BrandEmailContent
   **/
  public BrandEmailContent linkText(String linkText) {
    this.linkText = linkText;
    return this;
  }

  /**
   * .
   * @return linkText
   **/
  @ApiModelProperty(value = "")
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
    BrandEmailContent brandEmailContent = (BrandEmailContent) o;
    return Objects.equals(this.content, brandEmailContent.content) &&
        Objects.equals(this.emailContentType, brandEmailContent.emailContentType) &&
        Objects.equals(this.emailToLink, brandEmailContent.emailToLink) &&
        Objects.equals(this.linkText, brandEmailContent.linkText);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(content, emailContentType, emailToLink, linkText);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandEmailContent {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    emailContentType: ").append(toIndentedString(emailContentType)).append("\n");
    sb.append("    emailToLink: ").append(toIndentedString(emailToLink)).append("\n");
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
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

