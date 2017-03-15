package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class UserSignature   {
  
  private String adoptedDateTime = null;
  private String createdDateTime = null;
  private ErrorDetails errorDetails = null;
  private String initials150ImageId = null;
  private String initialsImageUri = null;
  private String isDefault = null;
  private String signature150ImageId = null;
  private String signatureFont = null;
  private String signatureId = null;
  private String signatureImageUri = null;
  private String signatureInitials = null;
  private String signatureName = null;
  private String signatureType = null;

  
  /**
   * The date and time the user adopted their signature.
   **/
  
  @ApiModelProperty(value = "The date and time the user adopted their signature.")
  @JsonProperty("adoptedDateTime")
  public String getAdoptedDateTime() {
    return adoptedDateTime;
  }
  public void setAdoptedDateTime(String adoptedDateTime) {
    this.adoptedDateTime = adoptedDateTime;
  }

  
  /**
   * Indicates the date and time the item was created.
   **/
  
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  @JsonProperty("createdDateTime")
  public String getCreatedDateTime() {
    return createdDateTime;
  }
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("initials150ImageId")
  public String getInitials150ImageId() {
    return initials150ImageId;
  }
  public void setInitials150ImageId(String initials150ImageId) {
    this.initials150ImageId = initials150ImageId;
  }

  
  /**
   * Contains the URI for an endpoint that you can use to retrieve the initials image.
   **/
  
  @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the initials image.")
  @JsonProperty("initialsImageUri")
  public String getInitialsImageUri() {
    return initialsImageUri;
  }
  public void setInitialsImageUri(String initialsImageUri) {
    this.initialsImageUri = initialsImageUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isDefault")
  public String getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signature150ImageId")
  public String getSignature150ImageId() {
    return signature150ImageId;
  }
  public void setSignature150ImageId(String signature150ImageId) {
    this.signature150ImageId = signature150ImageId;
  }

  
  /**
   * The font type for the signature, if the signature is not drawn. The supported font types are:\n\n\"7_DocuSign\", \"1_DocuSign\", \"6_DocuSign\", \"8_DocuSign\", \"3_DocuSign\", \"Mistral\", \"4_DocuSign\", \"2_DocuSign\", \"5_DocuSign\", \"Rage Italic\"
   **/
  
  @ApiModelProperty(value = "The font type for the signature, if the signature is not drawn. The supported font types are:\n\n\"7_DocuSign\", \"1_DocuSign\", \"6_DocuSign\", \"8_DocuSign\", \"3_DocuSign\", \"Mistral\", \"4_DocuSign\", \"2_DocuSign\", \"5_DocuSign\", \"Rage Italic\"")
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
   * Contains the URI for an endpoint that you can use to retrieve the signature image.
   **/
  
  @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the signature image.")
  @JsonProperty("signatureImageUri")
  public String getSignatureImageUri() {
    return signatureImageUri;
  }
  public void setSignatureImageUri(String signatureImageUri) {
    this.signatureImageUri = signatureImageUri;
  }

  
  /**
   * The initials associated with the signature.
   **/
  
  @ApiModelProperty(value = "The initials associated with the signature.")
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

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureType")
  public String getSignatureType() {
    return signatureType;
  }
  public void setSignatureType(String signatureType) {
    this.signatureType = signatureType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSignature userSignature = (UserSignature) o;

    return true && Objects.equals(adoptedDateTime, userSignature.adoptedDateTime) &&
        Objects.equals(createdDateTime, userSignature.createdDateTime) &&
        Objects.equals(errorDetails, userSignature.errorDetails) &&
        Objects.equals(initials150ImageId, userSignature.initials150ImageId) &&
        Objects.equals(initialsImageUri, userSignature.initialsImageUri) &&
        Objects.equals(isDefault, userSignature.isDefault) &&
        Objects.equals(signature150ImageId, userSignature.signature150ImageId) &&
        Objects.equals(signatureFont, userSignature.signatureFont) &&
        Objects.equals(signatureId, userSignature.signatureId) &&
        Objects.equals(signatureImageUri, userSignature.signatureImageUri) &&
        Objects.equals(signatureInitials, userSignature.signatureInitials) &&
        Objects.equals(signatureName, userSignature.signatureName) &&
        Objects.equals(signatureType, userSignature.signatureType)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(adoptedDateTime, createdDateTime, errorDetails, initials150ImageId, initialsImageUri, isDefault, signature150ImageId, signatureFont, signatureId, signatureImageUri, signatureInitials, signatureName, signatureType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSignature {\n");
    
    if (adoptedDateTime != null)
      sb.append("    adoptedDateTime: ").append(toIndentedString(adoptedDateTime)).append("\n");
    if (createdDateTime != null)
      sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (initials150ImageId != null)
      sb.append("    initials150ImageId: ").append(toIndentedString(initials150ImageId)).append("\n");
    if (initialsImageUri != null)
      sb.append("    initialsImageUri: ").append(toIndentedString(initialsImageUri)).append("\n");
    if (isDefault != null)
      sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    if (signature150ImageId != null)
      sb.append("    signature150ImageId: ").append(toIndentedString(signature150ImageId)).append("\n");
    if (signatureFont != null)
      sb.append("    signatureFont: ").append(toIndentedString(signatureFont)).append("\n");
    if (signatureId != null)
      sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    if (signatureImageUri != null)
      sb.append("    signatureImageUri: ").append(toIndentedString(signatureImageUri)).append("\n");
    if (signatureInitials != null)
      sb.append("    signatureInitials: ").append(toIndentedString(signatureInitials)).append("\n");
    if (signatureName != null)
      sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
    if (signatureType != null)
      sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
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

