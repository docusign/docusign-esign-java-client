package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SocialAccountInformation
 */

public class SocialAccountInformation {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("provider")
  private String provider = null;

  @JsonProperty("socialId")
  private String socialId = null;

  @JsonProperty("userName")
  private String userName = null;

  public SocialAccountInformation email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The users email address.
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "The users email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SocialAccountInformation errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public SocialAccountInformation provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * The social account provider (Facebook, Yahoo, etc.)
   * @return provider
  **/
  @ApiModelProperty(example = "null", value = "The social account provider (Facebook, Yahoo, etc.)")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public SocialAccountInformation socialId(String socialId) {
    this.socialId = socialId;
    return this;
  }

   /**
   * The ID provided by the Socal Account.
   * @return socialId
  **/
  @ApiModelProperty(example = "null", value = "The ID provided by the Socal Account.")
  public String getSocialId() {
    return socialId;
  }

  public void setSocialId(String socialId) {
    this.socialId = socialId;
  }

  public SocialAccountInformation userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The full user name for the account.
   * @return userName
  **/
  @ApiModelProperty(example = "null", value = "The full user name for the account.")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialAccountInformation socialAccountInformation = (SocialAccountInformation) o;
    return Objects.equals(this.email, socialAccountInformation.email) &&
        Objects.equals(this.errorDetails, socialAccountInformation.errorDetails) &&
        Objects.equals(this.provider, socialAccountInformation.provider) &&
        Objects.equals(this.socialId, socialAccountInformation.socialId) &&
        Objects.equals(this.userName, socialAccountInformation.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, errorDetails, provider, socialId, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialAccountInformation {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    socialId: ").append(toIndentedString(socialId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

