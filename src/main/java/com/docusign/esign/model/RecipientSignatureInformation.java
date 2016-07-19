package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class RecipientSignatureInformation   {
  
  private String signatureName = null;
  private String signatureInitials = null;
  private String fontStyle = null;

  
  /**
   * Specifies the user signature name.
   **/
  public RecipientSignatureInformation signatureName(String signatureName) {
    this.signatureName = signatureName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the user signature name.")
  @JsonProperty("signatureName")
  public String getSignatureName() {
    return signatureName;
  }
  public void setSignatureName(String signatureName) {
    this.signatureName = signatureName;
  }

  
  /**
   * 
   **/
  public RecipientSignatureInformation signatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("signatureInitials")
  public String getSignatureInitials() {
    return signatureInitials;
  }
  public void setSignatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
  }

  
  /**
   * 
   **/
  public RecipientSignatureInformation fontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fontStyle")
  public String getFontStyle() {
    return fontStyle;
  }
  public void setFontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
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
    return Objects.equals(this.signatureName, recipientSignatureInformation.signatureName) &&
        Objects.equals(this.signatureInitials, recipientSignatureInformation.signatureInitials) &&
        Objects.equals(this.fontStyle, recipientSignatureInformation.fontStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureName, signatureInitials, fontStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSignatureInformation {\n");
    
    sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
    sb.append("    signatureInitials: ").append(toIndentedString(signatureInitials)).append("\n");
    sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
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

