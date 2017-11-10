package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SocialAccountInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserSocialIdResult
 */

public class UserSocialIdResult {
  @JsonProperty("socialAccountInformation")
  private java.util.List<SocialAccountInformation> socialAccountInformation = new java.util.ArrayList<SocialAccountInformation>();

  @JsonProperty("userId")
  private String userId = null;

  public UserSocialIdResult socialAccountInformation(java.util.List<SocialAccountInformation> socialAccountInformation) {
    this.socialAccountInformation = socialAccountInformation;
    return this;
  }

  public UserSocialIdResult addSocialAccountInformationItem(SocialAccountInformation socialAccountInformationItem) {
    this.socialAccountInformation.add(socialAccountInformationItem);
    return this;
  }

   /**
   * Contains properties that map a DocuSign user to a social account (Facebook, Yahoo, etc.)
   * @return socialAccountInformation
  **/
  @ApiModelProperty(example = "null", value = "Contains properties that map a DocuSign user to a social account (Facebook, Yahoo, etc.)")
  public java.util.List<SocialAccountInformation> getSocialAccountInformation() {
    return socialAccountInformation;
  }

  public void setSocialAccountInformation(java.util.List<SocialAccountInformation> socialAccountInformation) {
    this.socialAccountInformation = socialAccountInformation;
  }

  public UserSocialIdResult userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.socialAccountInformation, userSocialIdResult.socialAccountInformation) &&
        Objects.equals(this.userId, userSocialIdResult.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialAccountInformation, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSocialIdResult {\n");
    
    sb.append("    socialAccountInformation: ").append(toIndentedString(socialAccountInformation)).append("\n");
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

