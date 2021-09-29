package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SocialAccountInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserSocialIdResult.
 *
 */

public class UserSocialIdResult {
  @JsonProperty("socialAccountInformation")
  private java.util.List<SocialAccountInformation> socialAccountInformation = null;

  @JsonProperty("userId")
  private String userId = null;


  /**
   * socialAccountInformation.
   *
   * @return UserSocialIdResult
   **/
  public UserSocialIdResult socialAccountInformation(java.util.List<SocialAccountInformation> socialAccountInformation) {
    this.socialAccountInformation = socialAccountInformation;
    return this;
  }
  
  /**
   * addSocialAccountInformationItem.
   *
   * @return UserSocialIdResult
   **/
  public UserSocialIdResult addSocialAccountInformationItem(SocialAccountInformation socialAccountInformationItem) {
    if (this.socialAccountInformation == null) {
      this.socialAccountInformation = new java.util.ArrayList<SocialAccountInformation>();
    }
    this.socialAccountInformation.add(socialAccountInformationItem);
    return this;
  }

  /**
   * Contains properties that map a DocuSign user to a social account (Facebook, Yahoo, etc.).
   * @return socialAccountInformation
   **/
  @ApiModelProperty(value = "Contains properties that map a DocuSign user to a social account (Facebook, Yahoo, etc.)")
  public java.util.List<SocialAccountInformation> getSocialAccountInformation() {
    return socialAccountInformation;
  }

  /**
   * setSocialAccountInformation.
   **/
  public void setSocialAccountInformation(java.util.List<SocialAccountInformation> socialAccountInformation) {
    this.socialAccountInformation = socialAccountInformation;
  }


  /**
   * userId.
   *
   * @return UserSocialIdResult
   **/
  public UserSocialIdResult userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * .
   * @return userId
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
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
    UserSocialIdResult userSocialIdResult = (UserSocialIdResult) o;
    return Objects.equals(this.socialAccountInformation, userSocialIdResult.socialAccountInformation) &&
        Objects.equals(this.userId, userSocialIdResult.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(socialAccountInformation, userId);
  }


  /**
   * Converts the given object to string.
   */
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

