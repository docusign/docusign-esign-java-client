package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SignatureUserDef.
 *
 */

public class SignatureUserDef {
  @JsonProperty("isDefault")
  private String isDefault = null;

  @JsonProperty("rights")
  private String rights = null;

  @JsonProperty("userId")
  private String userId = null;

  /**
   * isDefault.
   *
   * @return SignatureUserDef
   **/
  public SignatureUserDef isDefault(String isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * .
   * 
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
   * @return SignatureUserDef
   **/
  public SignatureUserDef rights(String rights) {
    this.rights = rights;
    return this;
  }

  /**
   * .
   * 
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
   * @return SignatureUserDef
   **/
  public SignatureUserDef userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * .
   * 
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
    SignatureUserDef signatureUserDef = (SignatureUserDef) o;
    return Objects.equals(this.isDefault, signatureUserDef.isDefault) &&
        Objects.equals(this.rights, signatureUserDef.rights) &&
        Objects.equals(this.userId, signatureUserDef.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(isDefault, rights, userId);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureUserDef {\n");

    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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
