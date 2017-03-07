package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class UserSignatureDefinition   {
  
  private String signatureFont = null;
  private String signatureId = null;
  private String signatureInitials = null;
  private String signatureName = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureFont")
  public String getSignatureFont() {
    return signatureFont;
  }
  public void setSignatureFont(String signatureFont) {
    this.signatureFont = signatureFont;
  }

  
  /**
   * Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name, and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as \"&\", \"<\", \">\") in a the signature name. Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.
   **/
  
  @ApiModelProperty(value = "Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name, and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as \"&\", \"<\", \">\") in a the signature name. Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.")
  @JsonProperty("signatureId")
  public String getSignatureId() {
    return signatureId;
  }
  public void setSignatureId(String signatureId) {
    this.signatureId = signatureId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureInitials")
  public String getSignatureInitials() {
    return signatureInitials;
  }
  public void setSignatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
  }

  
  /**
   * Specifies the user signature name.
   **/
  
  @ApiModelProperty(value = "Specifies the user signature name.")
  @JsonProperty("signatureName")
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

    return true && Objects.equals(signatureFont, userSignatureDefinition.signatureFont) &&
        Objects.equals(signatureId, userSignatureDefinition.signatureId) &&
        Objects.equals(signatureInitials, userSignatureDefinition.signatureInitials) &&
        Objects.equals(signatureName, userSignatureDefinition.signatureName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureFont, signatureId, signatureInitials, signatureName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSignatureDefinition {\n");
    
    if (signatureFont != null)
      sb.append("    signatureFont: ").append(toIndentedString(signatureFont)).append("\n");
    if (signatureId != null)
      sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    if (signatureInitials != null)
      sb.append("    signatureInitials: ").append(toIndentedString(signatureInitials)).append("\n");
    if (signatureName != null)
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

