package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** User */
public class User {
  @JsonProperty("cellPhoneNumber")
  private String cellPhoneNumber = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("credentials")
  private java.util.List<Credential> credentials = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("externalClaims")
  private java.util.List<ExternalClaim> externalClaims = null;

  public User cellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
    return this;
  }

  /** @return cellPhoneNumber */
  @ApiModelProperty(value = "")
  public String getCellPhoneNumber() {
    return cellPhoneNumber;
  }

  public void setCellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
  }

  public User countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /** @return countryCode */
  @ApiModelProperty(value = "")
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
    if (this.credentials == null) {
      this.credentials = new java.util.ArrayList<Credential>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

  /** @return credentials */
  @ApiModelProperty(value = "")
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

  /** @return displayName */
  @ApiModelProperty(value = "")
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

  /** @return email */
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User externalClaims(java.util.List<ExternalClaim> externalClaims) {
    this.externalClaims = externalClaims;
    return this;
  }

  public User addExternalClaimsItem(ExternalClaim externalClaimsItem) {
    if (this.externalClaims == null) {
      this.externalClaims = new java.util.ArrayList<ExternalClaim>();
    }
    this.externalClaims.add(externalClaimsItem);
    return this;
  }

  /** @return externalClaims */
  @ApiModelProperty(value = "")
  public java.util.List<ExternalClaim> getExternalClaims() {
    return externalClaims;
  }

  public void setExternalClaims(java.util.List<ExternalClaim> externalClaims) {
    this.externalClaims = externalClaims;
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
    return Objects.equals(this.cellPhoneNumber, user.cellPhoneNumber)
        && Objects.equals(this.countryCode, user.countryCode)
        && Objects.equals(this.credentials, user.credentials)
        && Objects.equals(this.displayName, user.displayName)
        && Objects.equals(this.email, user.email)
        && Objects.equals(this.externalClaims, user.externalClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cellPhoneNumber, countryCode, credentials, displayName, email, externalClaims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");

    sb.append("    cellPhoneNumber: ").append(toIndentedString(cellPhoneNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalClaims: ").append(toIndentedString(externalClaims)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
