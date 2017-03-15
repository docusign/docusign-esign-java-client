package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BrandEmailContent   {
  
  private String content = null;
  private String emailContentType = null;
  private String emailToLink = null;
  private String linkText = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailContentType")
  public String getEmailContentType() {
    return emailContentType;
  }
  public void setEmailContentType(String emailContentType) {
    this.emailContentType = emailContentType;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailToLink")
  public String getEmailToLink() {
    return emailToLink;
  }
  public void setEmailToLink(String emailToLink) {
    this.emailToLink = emailToLink;
  }

  
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandEmailContent brandEmailContent = (BrandEmailContent) o;

    return true && Objects.equals(content, brandEmailContent.content) &&
        Objects.equals(emailContentType, brandEmailContent.emailContentType) &&
        Objects.equals(emailToLink, brandEmailContent.emailToLink) &&
        Objects.equals(linkText, brandEmailContent.linkText)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, emailContentType, emailToLink, linkText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandEmailContent {\n");
    
    if (content != null)
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
    if (emailContentType != null)
      sb.append("    emailContentType: ").append(toIndentedString(emailContentType)).append("\n");
    if (emailToLink != null)
      sb.append("    emailToLink: ").append(toIndentedString(emailToLink)).append("\n");
    if (linkText != null)
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

