package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SigningGroupUser.
 *
 */

public class SigningGroupUser {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("userName")
  private String userName = null;


  /**
   * email.
   *
   * @return SigningGroupUser
   **/
  public SigningGroupUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @ApiModelProperty(value = "")
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
   * @return SigningGroupUser
   **/
  public SigningGroupUser errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @ApiModelProperty(value = "")
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
   * userName.
   *
   * @return SigningGroupUser
   **/
  public SigningGroupUser userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The name of the group member.   Maximum Length: 100 characters. .
   * @return userName
   **/
  @ApiModelProperty(value = "The name of the group member.   Maximum Length: 100 characters. ")
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
    SigningGroupUser signingGroupUser = (SigningGroupUser) o;
    return Objects.equals(this.email, signingGroupUser.email) &&
        Objects.equals(this.errorDetails, signingGroupUser.errorDetails) &&
        Objects.equals(this.userName, signingGroupUser.userName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(email, errorDetails, userName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningGroupUser {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

