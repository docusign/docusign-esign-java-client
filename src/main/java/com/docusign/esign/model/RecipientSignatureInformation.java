package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Allows the sender to pre-specify the signature name, signature initials and signature font used in the signature stamp for the recipient.\n\nUsed only with recipient types In Person Signers and Signers.
 **/

@ApiModel(description = "Allows the sender to pre-specify the signature name, signature initials and signature font used in the signature stamp for the recipient.\n\nUsed only with recipient types In Person Signers and Signers.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class RecipientSignatureInformation   {
  
  private String fontStyle = null;
  private String signatureInitials = null;
  private String signatureName = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fontStyle")
  public String getFontStyle() {
    return fontStyle;
  }
  public void setFontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
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
    RecipientSignatureInformation recipientSignatureInformation = (RecipientSignatureInformation) o;

    return true && Objects.equals(fontStyle, recipientSignatureInformation.fontStyle) &&
        Objects.equals(signatureInitials, recipientSignatureInformation.signatureInitials) &&
        Objects.equals(signatureName, recipientSignatureInformation.signatureName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontStyle, signatureInitials, signatureName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSignatureInformation {\n");
    
    if (fontStyle != null)
      sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
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

