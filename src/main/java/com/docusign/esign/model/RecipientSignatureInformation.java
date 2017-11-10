package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Allows the sender to pre-specify the signature name, signature initials and signature font used in the signature stamp for the recipient.  Used only with recipient types In Person Signers and Signers.
 */
@ApiModel(description = "Allows the sender to pre-specify the signature name, signature initials and signature font used in the signature stamp for the recipient.  Used only with recipient types In Person Signers and Signers.")

public class RecipientSignatureInformation {
  @JsonProperty("fontStyle")
  private String fontStyle = null;

  @JsonProperty("signatureInitials")
  private String signatureInitials = null;

  @JsonProperty("signatureName")
  private String signatureName = null;

  public RecipientSignatureInformation fontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
    return this;
  }

   /**
   * 
   * @return fontStyle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFontStyle() {
    return fontStyle;
  }

  public void setFontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
  }

  public RecipientSignatureInformation signatureInitials(String signatureInitials) {
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

  public RecipientSignatureInformation signatureName(String signatureName) {
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
    RecipientSignatureInformation recipientSignatureInformation = (RecipientSignatureInformation) o;
    return Objects.equals(this.fontStyle, recipientSignatureInformation.fontStyle) &&
        Objects.equals(this.signatureInitials, recipientSignatureInformation.signatureInitials) &&
        Objects.equals(this.signatureName, recipientSignatureInformation.signatureName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontStyle, signatureInitials, signatureName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSignatureInformation {\n");
    
    sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
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

