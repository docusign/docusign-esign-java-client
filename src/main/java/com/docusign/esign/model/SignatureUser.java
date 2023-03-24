package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SignatureUser.
 *
 */

public class SignatureUser {
  @JsonProperty("isDefault")
  private String isDefault = null;

  @JsonProperty("rights")
  private String rights = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;


  /**
   * isDefault.
   *
   * @return SignatureUser
   **/
  public SignatureUser isDefault(String isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * .
   * @return isDefault
   **/
  @Schema(description = "")
  public String getIsDefault() {
    return isDefault;
  }

  /**
   * setIsDefault.
   **/
  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }


  /**
   * rights.
   *
   * @return SignatureUser
   **/
  public SignatureUser rights(String rights) {
    this.rights = rights;
    return this;
  }

  /**
   * .
   * @return rights
   **/
  @Schema(description = "")
  public String getRights() {
    return rights;
  }

  /**
   * setRights.
   **/
  public void setRights(String rights) {
    this.rights = rights;
  }


  /**
   * userId.
   *
   * @return SignatureUser
   **/
  public SignatureUser userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * .
   * @return userId
   **/
  @Schema(description = "")
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
   * userName.
   *
   * @return SignatureUser
   **/
  public SignatureUser userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * .
   * @return userName
   **/
  @Schema(description = "")
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
    SignatureUser signatureUser = (SignatureUser) o;
    return Objects.equals(this.isDefault, signatureUser.isDefault) &&
        Objects.equals(this.rights, signatureUser.rights) &&
        Objects.equals(this.userId, signatureUser.userId) &&
        Objects.equals(this.userName, signatureUser.userName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(isDefault, rights, userId, userName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureUser {\n");
    
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

