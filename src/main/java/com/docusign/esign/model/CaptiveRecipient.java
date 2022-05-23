package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** CaptiveRecipient. */
public class CaptiveRecipient {
  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("userName")
  private String userName = null;

  /**
   * clientUserId.
   *
   * @return CaptiveRecipient
   */
  public CaptiveRecipient clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

  /**
   * Specifies whether the recipient is embedded or remote. If the `clientUserId` property is not
   * null then the recipient is embedded. Note that if the `ClientUserId` property is set and either
   * `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to
   * **true**, an error is generated on sending.ng. Maximum length: 100 characters. .
   *
   * @return clientUserId
   */
  @ApiModelProperty(
      value =
          "Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. ")
  public String getClientUserId() {
    return clientUserId;
  }

  /** setClientUserId. */
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  /**
   * email.
   *
   * @return CaptiveRecipient
   */
  public CaptiveRecipient email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Specifies the email address associated with the captive recipient..
   *
   * @return email
   */
  @ApiModelProperty(value = "Specifies the email address associated with the captive recipient.")
  public String getEmail() {
    return email;
  }

  /** setEmail. */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * errorDetails.
   *
   * @return CaptiveRecipient
   */
  public CaptiveRecipient errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   *
   * @return errorDetails
   */
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /** setErrorDetails. */
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  /**
   * userName.
   *
   * @return CaptiveRecipient
   */
  public CaptiveRecipient userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Specifies the user name associated with the captive recipient..
   *
   * @return userName
   */
  @ApiModelProperty(value = "Specifies the user name associated with the captive recipient.")
  public String getUserName() {
    return userName;
  }

  /** setUserName. */
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
    CaptiveRecipient captiveRecipient = (CaptiveRecipient) o;
    return Objects.equals(this.clientUserId, captiveRecipient.clientUserId)
        && Objects.equals(this.email, captiveRecipient.email)
        && Objects.equals(this.errorDetails, captiveRecipient.errorDetails)
        && Objects.equals(this.userName, captiveRecipient.userName);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, email, errorDetails, userName);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptiveRecipient {\n");

    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
