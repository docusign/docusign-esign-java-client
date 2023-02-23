package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SocialAccountInformation.
 *
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

  /**
   * email.
   *
   * @return SocialAccountInformation
   **/
  public SocialAccountInformation email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The users email address..
   * 
   * @return email
   **/
  @Schema(description = "The users email address.")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * errorDetails.
   *
   * @return SocialAccountInformation
   **/
  public SocialAccountInformation errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * This object describes errors that occur. It is only valid for responses and
   * ignored in requests..
   * 
   * @return errorDetails
   **/
  @Schema(description = "This object describes errors that occur. It is only valid for responses and ignored in requests.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  /**
   * provider.
   *
   * @return SocialAccountInformation
   **/
  public SocialAccountInformation provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * The social account provider (Facebook, Yahoo, etc.).
   * 
   * @return provider
   **/
  @Schema(description = "The social account provider (Facebook, Yahoo, etc.)")
  public String getProvider() {
    return provider;
  }

  /**
   * setProvider.
   **/
  public void setProvider(String provider) {
    this.provider = provider;
  }

  /**
   * socialId.
   *
   * @return SocialAccountInformation
   **/
  public SocialAccountInformation socialId(String socialId) {
    this.socialId = socialId;
    return this;
  }

  /**
   * The ID provided by the Socal Account..
   * 
   * @return socialId
   **/
  @Schema(description = "The ID provided by the Socal Account.")
  public String getSocialId() {
    return socialId;
  }

  /**
   * setSocialId.
   **/
  public void setSocialId(String socialId) {
    this.socialId = socialId;
  }

  /**
   * userName.
   *
   * @return SocialAccountInformation
   **/
  public SocialAccountInformation userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The full user name for the account..
   * 
   * @return userName
   **/
  @Schema(description = "The full user name for the account.")
  public String getUserName() {
    return userName;
  }

  /**
   * setUserName.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
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
    SocialAccountInformation socialAccountInformation = (SocialAccountInformation) o;
    return Objects.equals(this.email, socialAccountInformation.email) &&
        Objects.equals(this.errorDetails, socialAccountInformation.errorDetails) &&
        Objects.equals(this.provider, socialAccountInformation.provider) &&
        Objects.equals(this.socialId, socialAccountInformation.socialId) &&
        Objects.equals(this.userName, socialAccountInformation.userName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(email, errorDetails, provider, socialId, userName);
  }

  /**
   * Converts the given object to string.
   */
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
