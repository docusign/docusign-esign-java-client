package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class SocialAccountInformation   {
  
  private String email = null;
  private ErrorDetails errorDetails = null;
  private String provider = null;
  private String socialId = null;
  private String userName = null;

  
  /**
   * The users email address.
   **/
  
  @ApiModelProperty(value = "The users email address.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * The social account provider (Facebook, Yahoo, etc.)
   **/
  
  @ApiModelProperty(value = "The social account provider (Facebook, Yahoo, etc.)")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   * The ID provided by the Socal Account.
   **/
  
  @ApiModelProperty(value = "The ID provided by the Socal Account.")
  @JsonProperty("socialId")
  public String getSocialId() {
    return socialId;
  }
  public void setSocialId(String socialId) {
    this.socialId = socialId;
  }

  
  /**
   * The full user name for the account.
   **/
  
  @ApiModelProperty(value = "The full user name for the account.")
  @JsonProperty("userName")
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

    return true && Objects.equals(email, socialAccountInformation.email) &&
        Objects.equals(errorDetails, socialAccountInformation.errorDetails) &&
        Objects.equals(provider, socialAccountInformation.provider) &&
        Objects.equals(socialId, socialAccountInformation.socialId) &&
        Objects.equals(userName, socialAccountInformation.userName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, errorDetails, provider, socialId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialAccountInformation {\n");
    
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (provider != null)
      sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    if (socialId != null)
      sb.append("    socialId: ").append(toIndentedString(socialId)).append("\n");
    if (userName != null)
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

