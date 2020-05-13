package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DateStampProperties;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserSignature
 */

public class UserSignature {
  @JsonProperty("adoptedDateTime")
  private String adoptedDateTime = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("customField")
  private String customField = null;

  @JsonProperty("dateStampProperties")
  private DateStampProperties dateStampProperties = null;

  @JsonProperty("disallowUserResizeStamp")
  private String disallowUserResizeStamp = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("externalID")
  private String externalID = null;

  @JsonProperty("imageBase64")
  private String imageBase64 = null;

  @JsonProperty("imageType")
  private String imageType = null;

  @JsonProperty("initials150ImageId")
  private String initials150ImageId = null;

  @JsonProperty("initialsImageUri")
  private String initialsImageUri = null;

  @JsonProperty("isDefault")
  private String isDefault = null;

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  @JsonProperty("nrdsId")
  private String nrdsId = null;

  @JsonProperty("nrdsLastName")
  private String nrdsLastName = null;

  @JsonProperty("nrdsStatus")
  private String nrdsStatus = null;

  @JsonProperty("phoneticName")
  private String phoneticName = null;

  @JsonProperty("signature150ImageId")
  private String signature150ImageId = null;

  @JsonProperty("signatureFont")
  private String signatureFont = null;

  @JsonProperty("signatureId")
  private String signatureId = null;

  @JsonProperty("signatureImageUri")
  private String signatureImageUri = null;

  @JsonProperty("signatureInitials")
  private String signatureInitials = null;

  @JsonProperty("signatureName")
  private String signatureName = null;

  @JsonProperty("signatureRights")
  private String signatureRights = null;

  @JsonProperty("signatureType")
  private String signatureType = null;

  @JsonProperty("stampFormat")
  private String stampFormat = null;

  @JsonProperty("stampImageUri")
  private String stampImageUri = null;

  @JsonProperty("stampSizeMM")
  private String stampSizeMM = null;

  @JsonProperty("stampType")
  private String stampType = null;

  @JsonProperty("status")
  private String status = null;

  public UserSignature adoptedDateTime(String adoptedDateTime) {
    this.adoptedDateTime = adoptedDateTime;
    return this;
  }

   /**
   * The date and time the user adopted their signature.
   * @return adoptedDateTime
  **/
  @ApiModelProperty(value = "The date and time the user adopted their signature.")
  public String getAdoptedDateTime() {
    return adoptedDateTime;
  }

  public void setAdoptedDateTime(String adoptedDateTime) {
    this.adoptedDateTime = adoptedDateTime;
  }

  public UserSignature createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Indicates the date and time the item was created.
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public UserSignature customField(String customField) {
    this.customField = customField;
    return this;
  }

   /**
   * 
   * @return customField
  **/
  @ApiModelProperty(value = "")
  public String getCustomField() {
    return customField;
  }

  public void setCustomField(String customField) {
    this.customField = customField;
  }

  public UserSignature dateStampProperties(DateStampProperties dateStampProperties) {
    this.dateStampProperties = dateStampProperties;
    return this;
  }

   /**
   * Get dateStampProperties
   * @return dateStampProperties
  **/
  @ApiModelProperty(value = "")
  public DateStampProperties getDateStampProperties() {
    return dateStampProperties;
  }

  public void setDateStampProperties(DateStampProperties dateStampProperties) {
    this.dateStampProperties = dateStampProperties;
  }

  public UserSignature disallowUserResizeStamp(String disallowUserResizeStamp) {
    this.disallowUserResizeStamp = disallowUserResizeStamp;
    return this;
  }

   /**
   * 
   * @return disallowUserResizeStamp
  **/
  @ApiModelProperty(value = "")
  public String getDisallowUserResizeStamp() {
    return disallowUserResizeStamp;
  }

  public void setDisallowUserResizeStamp(String disallowUserResizeStamp) {
    this.disallowUserResizeStamp = disallowUserResizeStamp;
  }

  public UserSignature errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public UserSignature externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

   /**
   * 
   * @return externalID
  **/
  @ApiModelProperty(value = "")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }

  public UserSignature imageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
    return this;
  }

   /**
   * 
   * @return imageBase64
  **/
  @ApiModelProperty(value = "")
  public String getImageBase64() {
    return imageBase64;
  }

  public void setImageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
  }

  public UserSignature imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }

   /**
   * 
   * @return imageType
  **/
  @ApiModelProperty(value = "")
  public String getImageType() {
    return imageType;
  }

  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  public UserSignature initials150ImageId(String initials150ImageId) {
    this.initials150ImageId = initials150ImageId;
    return this;
  }

   /**
   * 
   * @return initials150ImageId
  **/
  @ApiModelProperty(value = "")
  public String getInitials150ImageId() {
    return initials150ImageId;
  }

  public void setInitials150ImageId(String initials150ImageId) {
    this.initials150ImageId = initials150ImageId;
  }

  public UserSignature initialsImageUri(String initialsImageUri) {
    this.initialsImageUri = initialsImageUri;
    return this;
  }

   /**
   * Contains the URI for an endpoint that you can use to retrieve the initials image.
   * @return initialsImageUri
  **/
  @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the initials image.")
  public String getInitialsImageUri() {
    return initialsImageUri;
  }

  public void setInitialsImageUri(String initialsImageUri) {
    this.initialsImageUri = initialsImageUri;
  }

  public UserSignature isDefault(String isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * 
   * @return isDefault
  **/
  @ApiModelProperty(value = "")
  public String getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }

  public UserSignature lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * The date and time the item was last modified.
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "The date and time the item was last modified.")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public UserSignature nrdsId(String nrdsId) {
    this.nrdsId = nrdsId;
    return this;
  }

   /**
   * 
   * @return nrdsId
  **/
  @ApiModelProperty(value = "")
  public String getNrdsId() {
    return nrdsId;
  }

  public void setNrdsId(String nrdsId) {
    this.nrdsId = nrdsId;
  }

  public UserSignature nrdsLastName(String nrdsLastName) {
    this.nrdsLastName = nrdsLastName;
    return this;
  }

   /**
   * 
   * @return nrdsLastName
  **/
  @ApiModelProperty(value = "")
  public String getNrdsLastName() {
    return nrdsLastName;
  }

  public void setNrdsLastName(String nrdsLastName) {
    this.nrdsLastName = nrdsLastName;
  }

  public UserSignature nrdsStatus(String nrdsStatus) {
    this.nrdsStatus = nrdsStatus;
    return this;
  }

   /**
   * 
   * @return nrdsStatus
  **/
  @ApiModelProperty(value = "")
  public String getNrdsStatus() {
    return nrdsStatus;
  }

  public void setNrdsStatus(String nrdsStatus) {
    this.nrdsStatus = nrdsStatus;
  }

  public UserSignature phoneticName(String phoneticName) {
    this.phoneticName = phoneticName;
    return this;
  }

   /**
   * 
   * @return phoneticName
  **/
  @ApiModelProperty(value = "")
  public String getPhoneticName() {
    return phoneticName;
  }

  public void setPhoneticName(String phoneticName) {
    this.phoneticName = phoneticName;
  }

  public UserSignature signature150ImageId(String signature150ImageId) {
    this.signature150ImageId = signature150ImageId;
    return this;
  }

   /**
   * 
   * @return signature150ImageId
  **/
  @ApiModelProperty(value = "")
  public String getSignature150ImageId() {
    return signature150ImageId;
  }

  public void setSignature150ImageId(String signature150ImageId) {
    this.signature150ImageId = signature150ImageId;
  }

  public UserSignature signatureFont(String signatureFont) {
    this.signatureFont = signatureFont;
    return this;
  }

   /**
   * The font type for the signature, if the signature is not drawn. The supported font types are:  \"7_DocuSign\", \"1_DocuSign\", \"6_DocuSign\", \"8_DocuSign\", \"3_DocuSign\", \"Mistral\", \"4_DocuSign\", \"2_DocuSign\", \"5_DocuSign\", \"Rage Italic\" 
   * @return signatureFont
  **/
  @ApiModelProperty(value = "The font type for the signature, if the signature is not drawn. The supported font types are:  \"7_DocuSign\", \"1_DocuSign\", \"6_DocuSign\", \"8_DocuSign\", \"3_DocuSign\", \"Mistral\", \"4_DocuSign\", \"2_DocuSign\", \"5_DocuSign\", \"Rage Italic\" ")
  public String getSignatureFont() {
    return signatureFont;
  }

  public void setSignatureFont(String signatureFont) {
    this.signatureFont = signatureFont;
  }

  public UserSignature signatureId(String signatureId) {
    this.signatureId = signatureId;
    return this;
  }

   /**
   * Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name, and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as \"&\", \"<\", \">\") in a the signature name. Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.
   * @return signatureId
  **/
  @ApiModelProperty(value = "Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name, and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as \"&\", \"<\", \">\") in a the signature name. Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.")
  public String getSignatureId() {
    return signatureId;
  }

  public void setSignatureId(String signatureId) {
    this.signatureId = signatureId;
  }

  public UserSignature signatureImageUri(String signatureImageUri) {
    this.signatureImageUri = signatureImageUri;
    return this;
  }

   /**
   * Contains the URI for an endpoint that you can use to retrieve the signature image.
   * @return signatureImageUri
  **/
  @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the signature image.")
  public String getSignatureImageUri() {
    return signatureImageUri;
  }

  public void setSignatureImageUri(String signatureImageUri) {
    this.signatureImageUri = signatureImageUri;
  }

  public UserSignature signatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
    return this;
  }

   /**
   *  The initials associated with the signature.
   * @return signatureInitials
  **/
  @ApiModelProperty(value = " The initials associated with the signature.")
  public String getSignatureInitials() {
    return signatureInitials;
  }

  public void setSignatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
  }

  public UserSignature signatureName(String signatureName) {
    this.signatureName = signatureName;
    return this;
  }

   /**
   * Specifies the user signature name.
   * @return signatureName
  **/
  @ApiModelProperty(value = "Specifies the user signature name.")
  public String getSignatureName() {
    return signatureName;
  }

  public void setSignatureName(String signatureName) {
    this.signatureName = signatureName;
  }

  public UserSignature signatureRights(String signatureRights) {
    this.signatureRights = signatureRights;
    return this;
  }

   /**
   * 
   * @return signatureRights
  **/
  @ApiModelProperty(value = "")
  public String getSignatureRights() {
    return signatureRights;
  }

  public void setSignatureRights(String signatureRights) {
    this.signatureRights = signatureRights;
  }

  public UserSignature signatureType(String signatureType) {
    this.signatureType = signatureType;
    return this;
  }

   /**
   * 
   * @return signatureType
  **/
  @ApiModelProperty(value = "")
  public String getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(String signatureType) {
    this.signatureType = signatureType;
  }

  public UserSignature stampFormat(String stampFormat) {
    this.stampFormat = stampFormat;
    return this;
  }

   /**
   * 
   * @return stampFormat
  **/
  @ApiModelProperty(value = "")
  public String getStampFormat() {
    return stampFormat;
  }

  public void setStampFormat(String stampFormat) {
    this.stampFormat = stampFormat;
  }

  public UserSignature stampImageUri(String stampImageUri) {
    this.stampImageUri = stampImageUri;
    return this;
  }

   /**
   * 
   * @return stampImageUri
  **/
  @ApiModelProperty(value = "")
  public String getStampImageUri() {
    return stampImageUri;
  }

  public void setStampImageUri(String stampImageUri) {
    this.stampImageUri = stampImageUri;
  }

  public UserSignature stampSizeMM(String stampSizeMM) {
    this.stampSizeMM = stampSizeMM;
    return this;
  }

   /**
   * 
   * @return stampSizeMM
  **/
  @ApiModelProperty(value = "")
  public String getStampSizeMM() {
    return stampSizeMM;
  }

  public void setStampSizeMM(String stampSizeMM) {
    this.stampSizeMM = stampSizeMM;
  }

  public UserSignature stampType(String stampType) {
    this.stampType = stampType;
    return this;
  }

   /**
   * 
   * @return stampType
  **/
  @ApiModelProperty(value = "")
  public String getStampType() {
    return stampType;
  }

  public void setStampType(String stampType) {
    this.stampType = stampType;
  }

  public UserSignature status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
    return Objects.equals(this.adoptedDateTime, userSignature.adoptedDateTime) &&
        Objects.equals(this.createdDateTime, userSignature.createdDateTime) &&
        Objects.equals(this.customField, userSignature.customField) &&
        Objects.equals(this.dateStampProperties, userSignature.dateStampProperties) &&
        Objects.equals(this.disallowUserResizeStamp, userSignature.disallowUserResizeStamp) &&
        Objects.equals(this.errorDetails, userSignature.errorDetails) &&
        Objects.equals(this.externalID, userSignature.externalID) &&
        Objects.equals(this.imageBase64, userSignature.imageBase64) &&
        Objects.equals(this.imageType, userSignature.imageType) &&
        Objects.equals(this.initials150ImageId, userSignature.initials150ImageId) &&
        Objects.equals(this.initialsImageUri, userSignature.initialsImageUri) &&
        Objects.equals(this.isDefault, userSignature.isDefault) &&
        Objects.equals(this.lastModifiedDateTime, userSignature.lastModifiedDateTime) &&
        Objects.equals(this.nrdsId, userSignature.nrdsId) &&
        Objects.equals(this.nrdsLastName, userSignature.nrdsLastName) &&
        Objects.equals(this.nrdsStatus, userSignature.nrdsStatus) &&
        Objects.equals(this.phoneticName, userSignature.phoneticName) &&
        Objects.equals(this.signature150ImageId, userSignature.signature150ImageId) &&
        Objects.equals(this.signatureFont, userSignature.signatureFont) &&
        Objects.equals(this.signatureId, userSignature.signatureId) &&
        Objects.equals(this.signatureImageUri, userSignature.signatureImageUri) &&
        Objects.equals(this.signatureInitials, userSignature.signatureInitials) &&
        Objects.equals(this.signatureName, userSignature.signatureName) &&
        Objects.equals(this.signatureRights, userSignature.signatureRights) &&
        Objects.equals(this.signatureType, userSignature.signatureType) &&
        Objects.equals(this.stampFormat, userSignature.stampFormat) &&
        Objects.equals(this.stampImageUri, userSignature.stampImageUri) &&
        Objects.equals(this.stampSizeMM, userSignature.stampSizeMM) &&
        Objects.equals(this.stampType, userSignature.stampType) &&
        Objects.equals(this.status, userSignature.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adoptedDateTime, createdDateTime, customField, dateStampProperties, disallowUserResizeStamp, errorDetails, externalID, imageBase64, imageType, initials150ImageId, initialsImageUri, isDefault, lastModifiedDateTime, nrdsId, nrdsLastName, nrdsStatus, phoneticName, signature150ImageId, signatureFont, signatureId, signatureImageUri, signatureInitials, signatureName, signatureRights, signatureType, stampFormat, stampImageUri, stampSizeMM, stampType, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSignature {\n");
    
    sb.append("    adoptedDateTime: ").append(toIndentedString(adoptedDateTime)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    dateStampProperties: ").append(toIndentedString(dateStampProperties)).append("\n");
    sb.append("    disallowUserResizeStamp: ").append(toIndentedString(disallowUserResizeStamp)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    initials150ImageId: ").append(toIndentedString(initials150ImageId)).append("\n");
    sb.append("    initialsImageUri: ").append(toIndentedString(initialsImageUri)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    nrdsId: ").append(toIndentedString(nrdsId)).append("\n");
    sb.append("    nrdsLastName: ").append(toIndentedString(nrdsLastName)).append("\n");
    sb.append("    nrdsStatus: ").append(toIndentedString(nrdsStatus)).append("\n");
    sb.append("    phoneticName: ").append(toIndentedString(phoneticName)).append("\n");
    sb.append("    signature150ImageId: ").append(toIndentedString(signature150ImageId)).append("\n");
    sb.append("    signatureFont: ").append(toIndentedString(signatureFont)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    sb.append("    signatureImageUri: ").append(toIndentedString(signatureImageUri)).append("\n");
    sb.append("    signatureInitials: ").append(toIndentedString(signatureInitials)).append("\n");
    sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
    sb.append("    signatureRights: ").append(toIndentedString(signatureRights)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    stampFormat: ").append(toIndentedString(stampFormat)).append("\n");
    sb.append("    stampImageUri: ").append(toIndentedString(stampImageUri)).append("\n");
    sb.append("    stampSizeMM: ").append(toIndentedString(stampSizeMM)).append("\n");
    sb.append("    stampType: ").append(toIndentedString(stampType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

