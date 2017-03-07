package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SocialAccountInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class UserSocialIdResult   {
  
  private java.util.List<SocialAccountInformation> socialAccountInformation = new java.util.ArrayList<SocialAccountInformation>();
  private String userId = null;

  
  /**
   * Contains properties that map a DocuSign user to a social account (Facebook, Yahoo, etc.)
   **/
  
  @ApiModelProperty(value = "Contains properties that map a DocuSign user to a social account (Facebook, Yahoo, etc.)")
  @JsonProperty("socialAccountInformation")
  public java.util.List<SocialAccountInformation> getSocialAccountInformation() {
    return socialAccountInformation;
  }
  public void setSocialAccountInformation(java.util.List<SocialAccountInformation> socialAccountInformation) {
    this.socialAccountInformation = socialAccountInformation;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSocialIdResult userSocialIdResult = (UserSocialIdResult) o;

    return true && Objects.equals(socialAccountInformation, userSocialIdResult.socialAccountInformation) &&
        Objects.equals(userId, userSocialIdResult.userId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialAccountInformation, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSocialIdResult {\n");
    
    if (socialAccountInformation != null)
      sb.append("    socialAccountInformation: ").append(toIndentedString(socialAccountInformation)).append("\n");
    if (userId != null)
      sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

