package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DateStampProperties;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.SignatureGroup;
import com.docusign.esign.model.SignatureUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AccountSignature.
 *
 */

public class AccountSignature {
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

  @JsonProperty("signatureGroups")
  private java.util.List<SignatureGroup> signatureGroups = null;

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

  @JsonProperty("signatureUsers")
  private java.util.List<SignatureUser> signatureUsers = null;

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


  /**
   * adoptedDateTime.
   *
   * @return AccountSignature
   **/
  public AccountSignature adoptedDateTime(String adoptedDateTime) {
    this.adoptedDateTime = adoptedDateTime;
    return this;
  }

  /**
   * .
   * @return adoptedDateTime
   **/
  @Schema(description = "")
  public String getAdoptedDateTime() {
    return adoptedDateTime;
  }

  /**
   * setAdoptedDateTime.
   **/
  public void setAdoptedDateTime(String adoptedDateTime) {
    this.adoptedDateTime = adoptedDateTime;
  }


  /**
   * createdDateTime.
   *
   * @return AccountSignature
   **/
  public AccountSignature createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Indicates the date and time the item was created..
   * @return createdDateTime
   **/
  @Schema(description = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  /**
   * setCreatedDateTime.
   **/
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  /**
   * customField.
   *
   * @return AccountSignature
   **/
  public AccountSignature customField(String customField) {
    this.customField = customField;
    return this;
  }

  /**
   * .
   * @return customField
   **/
  @Schema(description = "")
  public String getCustomField() {
    return customField;
  }

  /**
   * setCustomField.
   **/
  public void setCustomField(String customField) {
    this.customField = customField;
  }


  /**
   * dateStampProperties.
   *
   * @return AccountSignature
   **/
  public AccountSignature dateStampProperties(DateStampProperties dateStampProperties) {
    this.dateStampProperties = dateStampProperties;
    return this;
  }

  /**
   * Specifies the area in which a date stamp is placed. This parameter uses pixel positioning to draw a rectangle at the center of the stamp area. The stamp is superimposed on top of this central area.  This property contains the following information about the central rectangle:  - `DateAreaX`: The X axis position of the top-left corner. - `DateAreaY`: The Y axis position of the top-left corner. - `DateAreaWidth`: The width of the rectangle. - `DateAreaHeight`: The height of the rectangle..
   * @return dateStampProperties
   **/
  @Schema(description = "Specifies the area in which a date stamp is placed. This parameter uses pixel positioning to draw a rectangle at the center of the stamp area. The stamp is superimposed on top of this central area.  This property contains the following information about the central rectangle:  - `DateAreaX`: The X axis position of the top-left corner. - `DateAreaY`: The Y axis position of the top-left corner. - `DateAreaWidth`: The width of the rectangle. - `DateAreaHeight`: The height of the rectangle.")
  public DateStampProperties getDateStampProperties() {
    return dateStampProperties;
  }

  /**
   * setDateStampProperties.
   **/
  public void setDateStampProperties(DateStampProperties dateStampProperties) {
    this.dateStampProperties = dateStampProperties;
  }


  /**
   * disallowUserResizeStamp.
   *
   * @return AccountSignature
   **/
  public AccountSignature disallowUserResizeStamp(String disallowUserResizeStamp) {
    this.disallowUserResizeStamp = disallowUserResizeStamp;
    return this;
  }

  /**
   * .
   * @return disallowUserResizeStamp
   **/
  @Schema(description = "")
  public String getDisallowUserResizeStamp() {
    return disallowUserResizeStamp;
  }

  /**
   * setDisallowUserResizeStamp.
   **/
  public void setDisallowUserResizeStamp(String disallowUserResizeStamp) {
    this.disallowUserResizeStamp = disallowUserResizeStamp;
  }


  /**
   * errorDetails.
   *
   * @return AccountSignature
   **/
  public AccountSignature errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * externalID.
   *
   * @return AccountSignature
   **/
  public AccountSignature externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

  /**
   * .
   * @return externalID
   **/
  @Schema(description = "")
  public String getExternalID() {
    return externalID;
  }

  /**
   * setExternalID.
   **/
  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }


  /**
   * imageBase64.
   *
   * @return AccountSignature
   **/
  public AccountSignature imageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
    return this;
  }

  /**
   * .
   * @return imageBase64
   **/
  @Schema(description = "")
  public String getImageBase64() {
    return imageBase64;
  }

  /**
   * setImageBase64.
   **/
  public void setImageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
  }


  /**
   * imageType.
   *
   * @return AccountSignature
   **/
  public AccountSignature imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * .
   * @return imageType
   **/
  @Schema(description = "")
  public String getImageType() {
    return imageType;
  }

  /**
   * setImageType.
   **/
  public void setImageType(String imageType) {
    this.imageType = imageType;
  }


  /**
   * initials150ImageId.
   *
   * @return AccountSignature
   **/
  public AccountSignature initials150ImageId(String initials150ImageId) {
    this.initials150ImageId = initials150ImageId;
    return this;
  }

  /**
   * .
   * @return initials150ImageId
   **/
  @Schema(description = "")
  public String getInitials150ImageId() {
    return initials150ImageId;
  }

  /**
   * setInitials150ImageId.
   **/
  public void setInitials150ImageId(String initials150ImageId) {
    this.initials150ImageId = initials150ImageId;
  }


  /**
   * initialsImageUri.
   *
   * @return AccountSignature
   **/
  public AccountSignature initialsImageUri(String initialsImageUri) {
    this.initialsImageUri = initialsImageUri;
    return this;
  }

  /**
   * Contains the URI for an endpoint that you can use to retrieve the initials image..
   * @return initialsImageUri
   **/
  @Schema(description = "Contains the URI for an endpoint that you can use to retrieve the initials image.")
  public String getInitialsImageUri() {
    return initialsImageUri;
  }

  /**
   * setInitialsImageUri.
   **/
  public void setInitialsImageUri(String initialsImageUri) {
    this.initialsImageUri = initialsImageUri;
  }


  /**
   * isDefault.
   *
   * @return AccountSignature
   **/
  public AccountSignature isDefault(String isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * .
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
   * lastModifiedDateTime.
   *
   * @return AccountSignature
   **/
  public AccountSignature lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

  /**
   * The date and time the item was last modified..
   * @return lastModifiedDateTime
   **/
  @Schema(description = "The date and time the item was last modified.")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  /**
   * setLastModifiedDateTime.
   **/
  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }


  /**
   * nrdsId.
   *
   * @return AccountSignature
   **/
  public AccountSignature nrdsId(String nrdsId) {
    this.nrdsId = nrdsId;
    return this;
  }

  /**
   * .
   * @return nrdsId
   **/
  @Schema(description = "")
  public String getNrdsId() {
    return nrdsId;
  }

  /**
   * setNrdsId.
   **/
  public void setNrdsId(String nrdsId) {
    this.nrdsId = nrdsId;
  }


  /**
   * nrdsLastName.
   *
   * @return AccountSignature
   **/
  public AccountSignature nrdsLastName(String nrdsLastName) {
    this.nrdsLastName = nrdsLastName;
    return this;
  }

  /**
   * .
   * @return nrdsLastName
   **/
  @Schema(description = "")
  public String getNrdsLastName() {
    return nrdsLastName;
  }

  /**
   * setNrdsLastName.
   **/
  public void setNrdsLastName(String nrdsLastName) {
    this.nrdsLastName = nrdsLastName;
  }


  /**
   * nrdsStatus.
   *
   * @return AccountSignature
   **/
  public AccountSignature nrdsStatus(String nrdsStatus) {
    this.nrdsStatus = nrdsStatus;
    return this;
  }

  /**
   * .
   * @return nrdsStatus
   **/
  @Schema(description = "")
  public String getNrdsStatus() {
    return nrdsStatus;
  }

  /**
   * setNrdsStatus.
   **/
  public void setNrdsStatus(String nrdsStatus) {
    this.nrdsStatus = nrdsStatus;
  }


  /**
   * phoneticName.
   *
   * @return AccountSignature
   **/
  public AccountSignature phoneticName(String phoneticName) {
    this.phoneticName = phoneticName;
    return this;
  }

  /**
   * .
   * @return phoneticName
   **/
  @Schema(description = "")
  public String getPhoneticName() {
    return phoneticName;
  }

  /**
   * setPhoneticName.
   **/
  public void setPhoneticName(String phoneticName) {
    this.phoneticName = phoneticName;
  }


  /**
   * signature150ImageId.
   *
   * @return AccountSignature
   **/
  public AccountSignature signature150ImageId(String signature150ImageId) {
    this.signature150ImageId = signature150ImageId;
    return this;
  }

  /**
   * .
   * @return signature150ImageId
   **/
  @Schema(description = "")
  public String getSignature150ImageId() {
    return signature150ImageId;
  }

  /**
   * setSignature150ImageId.
   **/
  public void setSignature150ImageId(String signature150ImageId) {
    this.signature150ImageId = signature150ImageId;
  }


  /**
   * signatureFont.
   *
   * @return AccountSignature
   **/
  public AccountSignature signatureFont(String signatureFont) {
    this.signatureFont = signatureFont;
    return this;
  }

  /**
   * .
   * @return signatureFont
   **/
  @Schema(description = "")
  public String getSignatureFont() {
    return signatureFont;
  }

  /**
   * setSignatureFont.
   **/
  public void setSignatureFont(String signatureFont) {
    this.signatureFont = signatureFont;
  }


  /**
   * signatureGroups.
   *
   * @return AccountSignature
   **/
  public AccountSignature signatureGroups(java.util.List<SignatureGroup> signatureGroups) {
    this.signatureGroups = signatureGroups;
    return this;
  }
  
  /**
   * addSignatureGroupsItem.
   *
   * @return AccountSignature
   **/
  public AccountSignature addSignatureGroupsItem(SignatureGroup signatureGroupsItem) {
    if (this.signatureGroups == null) {
      this.signatureGroups = new java.util.ArrayList<>();
    }
    this.signatureGroups.add(signatureGroupsItem);
    return this;
  }

  /**
   * .
   * @return signatureGroups
   **/
  @Schema(description = "")
  public java.util.List<SignatureGroup> getSignatureGroups() {
    return signatureGroups;
  }

  /**
   * setSignatureGroups.
   **/
  public void setSignatureGroups(java.util.List<SignatureGroup> signatureGroups) {
    this.signatureGroups = signatureGroups;
  }


  /**
   * signatureId.
   *
   * @return AccountSignature
   **/
  public AccountSignature signatureId(String signatureId) {
    this.signatureId = signatureId;
    return this;
  }

  /**
   * Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name, and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as \"&\", \"<\", \">\") in a the signature name. Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID..
   * @return signatureId
   **/
  @Schema(description = "Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name, and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as \"&\", \"<\", \">\") in a the signature name. Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.")
  public String getSignatureId() {
    return signatureId;
  }

  /**
   * setSignatureId.
   **/
  public void setSignatureId(String signatureId) {
    this.signatureId = signatureId;
  }


  /**
   * signatureImageUri.
   *
   * @return AccountSignature
   **/
  public AccountSignature signatureImageUri(String signatureImageUri) {
    this.signatureImageUri = signatureImageUri;
    return this;
  }

  /**
   * Contains the URI for an endpoint that you can use to retrieve the signature image..
   * @return signatureImageUri
   **/
  @Schema(description = "Contains the URI for an endpoint that you can use to retrieve the signature image.")
  public String getSignatureImageUri() {
    return signatureImageUri;
  }

  /**
   * setSignatureImageUri.
   **/
  public void setSignatureImageUri(String signatureImageUri) {
    this.signatureImageUri = signatureImageUri;
  }


  /**
   * signatureInitials.
   *
   * @return AccountSignature
   **/
  public AccountSignature signatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
    return this;
  }

  /**
   * .
   * @return signatureInitials
   **/
  @Schema(description = "")
  public String getSignatureInitials() {
    return signatureInitials;
  }

  /**
   * setSignatureInitials.
   **/
  public void setSignatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
  }


  /**
   * signatureName.
   *
   * @return AccountSignature
   **/
  public AccountSignature signatureName(String signatureName) {
    this.signatureName = signatureName;
    return this;
  }

  /**
   * Specifies the user signature name..
   * @return signatureName
   **/
  @Schema(description = "Specifies the user signature name.")
  public String getSignatureName() {
    return signatureName;
  }

  /**
   * setSignatureName.
   **/
  public void setSignatureName(String signatureName) {
    this.signatureName = signatureName;
  }


  /**
   * signatureRights.
   *
   * @return AccountSignature
   **/
  public AccountSignature signatureRights(String signatureRights) {
    this.signatureRights = signatureRights;
    return this;
  }

  /**
   * .
   * @return signatureRights
   **/
  @Schema(description = "")
  public String getSignatureRights() {
    return signatureRights;
  }

  /**
   * setSignatureRights.
   **/
  public void setSignatureRights(String signatureRights) {
    this.signatureRights = signatureRights;
  }


  /**
   * signatureType.
   *
   * @return AccountSignature
   **/
  public AccountSignature signatureType(String signatureType) {
    this.signatureType = signatureType;
    return this;
  }

  /**
   * .
   * @return signatureType
   **/
  @Schema(description = "")
  public String getSignatureType() {
    return signatureType;
  }

  /**
   * setSignatureType.
   **/
  public void setSignatureType(String signatureType) {
    this.signatureType = signatureType;
  }


  /**
   * signatureUsers.
   *
   * @return AccountSignature
   **/
  public AccountSignature signatureUsers(java.util.List<SignatureUser> signatureUsers) {
    this.signatureUsers = signatureUsers;
    return this;
  }
  
  /**
   * addSignatureUsersItem.
   *
   * @return AccountSignature
   **/
  public AccountSignature addSignatureUsersItem(SignatureUser signatureUsersItem) {
    if (this.signatureUsers == null) {
      this.signatureUsers = new java.util.ArrayList<>();
    }
    this.signatureUsers.add(signatureUsersItem);
    return this;
  }

  /**
   * .
   * @return signatureUsers
   **/
  @Schema(description = "")
  public java.util.List<SignatureUser> getSignatureUsers() {
    return signatureUsers;
  }

  /**
   * setSignatureUsers.
   **/
  public void setSignatureUsers(java.util.List<SignatureUser> signatureUsers) {
    this.signatureUsers = signatureUsers;
  }


  /**
   * stampFormat.
   *
   * @return AccountSignature
   **/
  public AccountSignature stampFormat(String stampFormat) {
    this.stampFormat = stampFormat;
    return this;
  }

  /**
   * .
   * @return stampFormat
   **/
  @Schema(description = "")
  public String getStampFormat() {
    return stampFormat;
  }

  /**
   * setStampFormat.
   **/
  public void setStampFormat(String stampFormat) {
    this.stampFormat = stampFormat;
  }


  /**
   * stampImageUri.
   *
   * @return AccountSignature
   **/
  public AccountSignature stampImageUri(String stampImageUri) {
    this.stampImageUri = stampImageUri;
    return this;
  }

  /**
   * .
   * @return stampImageUri
   **/
  @Schema(description = "")
  public String getStampImageUri() {
    return stampImageUri;
  }

  /**
   * setStampImageUri.
   **/
  public void setStampImageUri(String stampImageUri) {
    this.stampImageUri = stampImageUri;
  }


  /**
   * stampSizeMM.
   *
   * @return AccountSignature
   **/
  public AccountSignature stampSizeMM(String stampSizeMM) {
    this.stampSizeMM = stampSizeMM;
    return this;
  }

  /**
   * .
   * @return stampSizeMM
   **/
  @Schema(description = "")
  public String getStampSizeMM() {
    return stampSizeMM;
  }

  /**
   * setStampSizeMM.
   **/
  public void setStampSizeMM(String stampSizeMM) {
    this.stampSizeMM = stampSizeMM;
  }


  /**
   * stampType.
   *
   * @return AccountSignature
   **/
  public AccountSignature stampType(String stampType) {
    this.stampType = stampType;
    return this;
  }

  /**
   * .
   * @return stampType
   **/
  @Schema(description = "")
  public String getStampType() {
    return stampType;
  }

  /**
   * setStampType.
   **/
  public void setStampType(String stampType) {
    this.stampType = stampType;
  }


  /**
   * status.
   *
   * @return AccountSignature
   **/
  public AccountSignature status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @Schema(description = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
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
    AccountSignature accountSignature = (AccountSignature) o;
    return Objects.equals(this.adoptedDateTime, accountSignature.adoptedDateTime) &&
        Objects.equals(this.createdDateTime, accountSignature.createdDateTime) &&
        Objects.equals(this.customField, accountSignature.customField) &&
        Objects.equals(this.dateStampProperties, accountSignature.dateStampProperties) &&
        Objects.equals(this.disallowUserResizeStamp, accountSignature.disallowUserResizeStamp) &&
        Objects.equals(this.errorDetails, accountSignature.errorDetails) &&
        Objects.equals(this.externalID, accountSignature.externalID) &&
        Objects.equals(this.imageBase64, accountSignature.imageBase64) &&
        Objects.equals(this.imageType, accountSignature.imageType) &&
        Objects.equals(this.initials150ImageId, accountSignature.initials150ImageId) &&
        Objects.equals(this.initialsImageUri, accountSignature.initialsImageUri) &&
        Objects.equals(this.isDefault, accountSignature.isDefault) &&
        Objects.equals(this.lastModifiedDateTime, accountSignature.lastModifiedDateTime) &&
        Objects.equals(this.nrdsId, accountSignature.nrdsId) &&
        Objects.equals(this.nrdsLastName, accountSignature.nrdsLastName) &&
        Objects.equals(this.nrdsStatus, accountSignature.nrdsStatus) &&
        Objects.equals(this.phoneticName, accountSignature.phoneticName) &&
        Objects.equals(this.signature150ImageId, accountSignature.signature150ImageId) &&
        Objects.equals(this.signatureFont, accountSignature.signatureFont) &&
        Objects.equals(this.signatureGroups, accountSignature.signatureGroups) &&
        Objects.equals(this.signatureId, accountSignature.signatureId) &&
        Objects.equals(this.signatureImageUri, accountSignature.signatureImageUri) &&
        Objects.equals(this.signatureInitials, accountSignature.signatureInitials) &&
        Objects.equals(this.signatureName, accountSignature.signatureName) &&
        Objects.equals(this.signatureRights, accountSignature.signatureRights) &&
        Objects.equals(this.signatureType, accountSignature.signatureType) &&
        Objects.equals(this.signatureUsers, accountSignature.signatureUsers) &&
        Objects.equals(this.stampFormat, accountSignature.stampFormat) &&
        Objects.equals(this.stampImageUri, accountSignature.stampImageUri) &&
        Objects.equals(this.stampSizeMM, accountSignature.stampSizeMM) &&
        Objects.equals(this.stampType, accountSignature.stampType) &&
        Objects.equals(this.status, accountSignature.status);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(adoptedDateTime, createdDateTime, customField, dateStampProperties, disallowUserResizeStamp, errorDetails, externalID, imageBase64, imageType, initials150ImageId, initialsImageUri, isDefault, lastModifiedDateTime, nrdsId, nrdsLastName, nrdsStatus, phoneticName, signature150ImageId, signatureFont, signatureGroups, signatureId, signatureImageUri, signatureInitials, signatureName, signatureRights, signatureType, signatureUsers, stampFormat, stampImageUri, stampSizeMM, stampType, status);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSignature {\n");
    
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
    sb.append("    signatureGroups: ").append(toIndentedString(signatureGroups)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    sb.append("    signatureImageUri: ").append(toIndentedString(signatureImageUri)).append("\n");
    sb.append("    signatureInitials: ").append(toIndentedString(signatureInitials)).append("\n");
    sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
    sb.append("    signatureRights: ").append(toIndentedString(signatureRights)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    signatureUsers: ").append(toIndentedString(signatureUsers)).append("\n");
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

