package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Credential;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * User
 */

public class User {
  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("credentials")
  private java.util.List<Credential> credentials = new java.util.ArrayList<Credential>();

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("email")
  private String email = null;

  public User countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public User credentials(java.util.List<Credential> credentials) {
    this.credentials = credentials;
    return this;
  }

  public User addCredentialsItem(Credential credentialsItem) {
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * 
   * @return credentials
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<Credential> getCredentials() {
    return credentials;
  }

  public void setCredentials(java.util.List<Credential> credentials) {
    this.credentials = credentials;
  }

  public User displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * 
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.countryCode, user.countryCode) &&
        Objects.equals(this.credentials, user.credentials) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.email, user.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, credentials, displayName, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

