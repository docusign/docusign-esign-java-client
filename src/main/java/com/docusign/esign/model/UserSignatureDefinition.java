package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserSignatureDefinition
 */

public class UserSignatureDefinition {
  @JsonProperty("signatureFont")
  private String signatureFont = null;

  @JsonProperty("signatureId")
  private String signatureId = null;

  @JsonProperty("signatureInitials")
  private String signatureInitials = null;

  @JsonProperty("signatureName")
  private String signatureName = null;

  public UserSignatureDefinition signatureFont(String signatureFont) {
    this.signatureFont = signatureFont;
    return this;
  }

   /**
   * 
   * @return signatureFont
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignatureFont() {
    return signatureFont;
  }

  public void setSignatureFont(String signatureFont) {
    this.signatureFont = signatureFont;
  }

  public UserSignatureDefinition signatureId(String signatureId) {
    this.signatureId = signatureId;
    return this;
  }

   /**
   * Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name, and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as \"&\", \"<\", \">\") in a the signature name. Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.
   * @return signatureId
  **/
  @ApiModelProperty(example = "null", value = "Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name, and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as \"&\", \"<\", \">\") in a the signature name. Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.")
  public String getSignatureId() {
    return signatureId;
  }

  public void setSignatureId(String signatureId) {
    this.signatureId = signatureId;
  }

  public UserSignatureDefinition signatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
    return this;
  }

   /**
   * 
   * @return signatureInitials
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignatureInitials() {
    return signatureInitials;
  }

  public void setSignatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
  }

  public UserSignatureDefinition signatureName(String signatureName) {
    this.signatureName = signatureName;
    return this;
  }

   /**
   * Specifies the user signature name.
   * @return signatureName
  **/
  @ApiModelProperty(example = "null", value = "Specifies the user signature name.")
  public String getSignatureName() {
    return signatureName;
  }

  public void setSignatureName(String signatureName) {
    this.signatureName = signatureName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSignatureDefinition userSignatureDefinition = (UserSignatureDefinition) o;
    return Objects.equals(this.signatureFont, userSignatureDefinition.signatureFont) &&
        Objects.equals(this.signatureId, userSignatureDefinition.signatureId) &&
        Objects.equals(this.signatureInitials, userSignatureDefinition.signatureInitials) &&
        Objects.equals(this.signatureName, userSignatureDefinition.signatureName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureFont, signatureId, signatureInitials, signatureName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSignatureDefinition {\n");
    
    sb.append("    signatureFont: ").append(toIndentedString(signatureFont)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    sb.append("    signatureInitials: ").append(toIndentedString(signatureInitials)).append("\n");
    sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
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

