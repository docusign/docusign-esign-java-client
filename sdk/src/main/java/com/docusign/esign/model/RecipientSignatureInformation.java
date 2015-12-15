package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class RecipientSignatureInformation   {
  
  private String signatureName = null;
  private String signatureInitials = null;
  private String fontStyle = null;

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientSignatureInformation recipientSignatureInformation = (RecipientSignatureInformation) o;
    return Objects.equals(signatureName, recipientSignatureInformation.signatureName) &&
        Objects.equals(signatureInitials, recipientSignatureInformation.signatureInitials) &&
        Objects.equals(fontStyle, recipientSignatureInformation.fontStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureName, signatureInitials, fontStyle);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSignatureInformation {\n");
    
    sb.append("    signatureName: ").append(StringUtil.toIndentedString(signatureName)).append("\n");
    sb.append("    signatureInitials: ").append(StringUtil.toIndentedString(signatureInitials)).append("\n");
    sb.append("    fontStyle: ").append(StringUtil.toIndentedString(fontStyle)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
