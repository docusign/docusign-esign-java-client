package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserSignature;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserSignaturesInformation
 */

public class UserSignaturesInformation {
  @JsonProperty("userSignatures")
  private java.util.List<UserSignature> userSignatures = null;

  public UserSignaturesInformation userSignatures(java.util.List<UserSignature> userSignatures) {
    this.userSignatures = userSignatures;
    return this;
  }

  public UserSignaturesInformation addUserSignaturesItem(UserSignature userSignaturesItem) {
    if (this.userSignatures == null) {
      this.userSignatures = new java.util.ArrayList<UserSignature>();
    }
    this.userSignatures.add(userSignaturesItem);
    return this;
  }

   /**
   * 
   * @return userSignatures
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UserSignature> getUserSignatures() {
    return userSignatures;
  }

  public void setUserSignatures(java.util.List<UserSignature> userSignatures) {
    this.userSignatures = userSignatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSignaturesInformation userSignaturesInformation = (UserSignaturesInformation) o;
    return Objects.equals(this.userSignatures, userSignaturesInformation.userSignatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userSignatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSignaturesInformation {\n");
    
    sb.append("    userSignatures: ").append(toIndentedString(userSignatures)).append("\n");
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

