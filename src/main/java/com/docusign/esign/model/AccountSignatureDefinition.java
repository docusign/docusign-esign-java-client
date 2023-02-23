package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DateStampProperties;
import com.docusign.esign.model.SignatureGroupDef;
import com.docusign.esign.model.SignatureUserDef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AccountSignatureDefinition.
 *
 */

public class AccountSignatureDefinition {
  @JsonProperty("dateStampProperties")
  private DateStampProperties dateStampProperties = null;

  @JsonProperty("disallowUserResizeStamp")
  private String disallowUserResizeStamp = null;

  @JsonProperty("externalID")
  private String externalID = null;

  @JsonProperty("imageType")
  private String imageType = null;

  @JsonProperty("isDefault")
  private String isDefault = null;

  @JsonProperty("nrdsId")
  private String nrdsId = null;

  @JsonProperty("nrdsLastName")
  private String nrdsLastName = null;

  @JsonProperty("phoneticName")
  private String phoneticName = null;

  @JsonProperty("signatureFont")
  private String signatureFont = null;

  @JsonProperty("signatureGroups")
  private java.util.List<SignatureGroupDef> signatureGroups = null;

  @JsonProperty("signatureId")
  private String signatureId = null;

  @JsonProperty("signatureInitials")
  private String signatureInitials = null;

  @JsonProperty("signatureName")
  private String signatureName = null;

  @JsonProperty("signatureType")
  private String signatureType = null;

  @JsonProperty("signatureUsers")
  private java.util.List<SignatureUserDef> signatureUsers = null;

  @JsonProperty("stampFormat")
  private String stampFormat = null;

  @JsonProperty("stampSizeMM")
  private String stampSizeMM = null;

  /**
   * dateStampProperties.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition dateStampProperties(DateStampProperties dateStampProperties) {
    this.dateStampProperties = dateStampProperties;
    return this;
  }

  /**
   * Specifies the area in which a date stamp is placed. This parameter uses pixel
   * positioning to draw a rectangle at the center of the stamp area. The stamp is
   * superimposed on top of this central area. This property contains the
   * following information about the central rectangle: - `DateAreaX`: The X axis
   * position of the top-left corner. - `DateAreaY`: The Y axis position of the
   * top-left corner. - `DateAreaWidth`: The width of the rectangle. -
   * `DateAreaHeight`: The height of the rectangle..
   * 
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
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition disallowUserResizeStamp(String disallowUserResizeStamp) {
    this.disallowUserResizeStamp = disallowUserResizeStamp;
    return this;
  }

  /**
   * .
   * 
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
   * externalID.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

  /**
   * .
   * 
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
   * imageType.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * .
   * 
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
   * isDefault.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition isDefault(String isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * .
   * 
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
   * nrdsId.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition nrdsId(String nrdsId) {
    this.nrdsId = nrdsId;
    return this;
  }

  /**
   * .
   * 
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
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition nrdsLastName(String nrdsLastName) {
    this.nrdsLastName = nrdsLastName;
    return this;
  }

  /**
   * .
   * 
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
   * phoneticName.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition phoneticName(String phoneticName) {
    this.phoneticName = phoneticName;
    return this;
  }

  /**
   * .
   * 
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
   * signatureFont.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition signatureFont(String signatureFont) {
    this.signatureFont = signatureFont;
    return this;
  }

  /**
   * .
   * 
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
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition signatureGroups(java.util.List<SignatureGroupDef> signatureGroups) {
    this.signatureGroups = signatureGroups;
    return this;
  }

  /**
   * addSignatureGroupsItem.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition addSignatureGroupsItem(SignatureGroupDef signatureGroupsItem) {
    if (this.signatureGroups == null) {
      this.signatureGroups = new java.util.ArrayList<>();
    }
    this.signatureGroups.add(signatureGroupsItem);
    return this;
  }

  /**
   * .
   * 
   * @return signatureGroups
   **/
  @Schema(description = "")
  public java.util.List<SignatureGroupDef> getSignatureGroups() {
    return signatureGroups;
  }

  /**
   * setSignatureGroups.
   **/
  public void setSignatureGroups(java.util.List<SignatureGroupDef> signatureGroups) {
    this.signatureGroups = signatureGroups;
  }

  /**
   * signatureId.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition signatureId(String signatureId) {
    this.signatureId = signatureId;
    return this;
  }

  /**
   * Specifies the signature ID associated with the signature name. You can use
   * the signature ID in the URI in place of the signature name, and the value
   * stored in the `signatureName` property in the body is used. This allows the
   * use of special characters (such as \"&\", \"<\", \">\") in a the signature
   * name. Note that with each update to signatures, the returned signature ID
   * might change, so the caller will need to trigger off the signature name to
   * get the new signature ID..
   * 
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
   * signatureInitials.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition signatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
    return this;
  }

  /**
   * .
   * 
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
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition signatureName(String signatureName) {
    this.signatureName = signatureName;
    return this;
  }

  /**
   * Specifies the user signature name..
   * 
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
   * signatureType.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition signatureType(String signatureType) {
    this.signatureType = signatureType;
    return this;
  }

  /**
   * .
   * 
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
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition signatureUsers(java.util.List<SignatureUserDef> signatureUsers) {
    this.signatureUsers = signatureUsers;
    return this;
  }

  /**
   * addSignatureUsersItem.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition addSignatureUsersItem(SignatureUserDef signatureUsersItem) {
    if (this.signatureUsers == null) {
      this.signatureUsers = new java.util.ArrayList<>();
    }
    this.signatureUsers.add(signatureUsersItem);
    return this;
  }

  /**
   * .
   * 
   * @return signatureUsers
   **/
  @Schema(description = "")
  public java.util.List<SignatureUserDef> getSignatureUsers() {
    return signatureUsers;
  }

  /**
   * setSignatureUsers.
   **/
  public void setSignatureUsers(java.util.List<SignatureUserDef> signatureUsers) {
    this.signatureUsers = signatureUsers;
  }

  /**
   * stampFormat.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition stampFormat(String stampFormat) {
    this.stampFormat = stampFormat;
    return this;
  }

  /**
   * .
   * 
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
   * stampSizeMM.
   *
   * @return AccountSignatureDefinition
   **/
  public AccountSignatureDefinition stampSizeMM(String stampSizeMM) {
    this.stampSizeMM = stampSizeMM;
    return this;
  }

  /**
   * .
   * 
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
    AccountSignatureDefinition accountSignatureDefinition = (AccountSignatureDefinition) o;
    return Objects.equals(this.dateStampProperties, accountSignatureDefinition.dateStampProperties) &&
        Objects.equals(this.disallowUserResizeStamp, accountSignatureDefinition.disallowUserResizeStamp) &&
        Objects.equals(this.externalID, accountSignatureDefinition.externalID) &&
        Objects.equals(this.imageType, accountSignatureDefinition.imageType) &&
        Objects.equals(this.isDefault, accountSignatureDefinition.isDefault) &&
        Objects.equals(this.nrdsId, accountSignatureDefinition.nrdsId) &&
        Objects.equals(this.nrdsLastName, accountSignatureDefinition.nrdsLastName) &&
        Objects.equals(this.phoneticName, accountSignatureDefinition.phoneticName) &&
        Objects.equals(this.signatureFont, accountSignatureDefinition.signatureFont) &&
        Objects.equals(this.signatureGroups, accountSignatureDefinition.signatureGroups) &&
        Objects.equals(this.signatureId, accountSignatureDefinition.signatureId) &&
        Objects.equals(this.signatureInitials, accountSignatureDefinition.signatureInitials) &&
        Objects.equals(this.signatureName, accountSignatureDefinition.signatureName) &&
        Objects.equals(this.signatureType, accountSignatureDefinition.signatureType) &&
        Objects.equals(this.signatureUsers, accountSignatureDefinition.signatureUsers) &&
        Objects.equals(this.stampFormat, accountSignatureDefinition.stampFormat) &&
        Objects.equals(this.stampSizeMM, accountSignatureDefinition.stampSizeMM);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(dateStampProperties, disallowUserResizeStamp, externalID, imageType, isDefault, nrdsId,
        nrdsLastName, phoneticName, signatureFont, signatureGroups, signatureId, signatureInitials, signatureName,
        signatureType, signatureUsers, stampFormat, stampSizeMM);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSignatureDefinition {\n");

    sb.append("    dateStampProperties: ").append(toIndentedString(dateStampProperties)).append("\n");
    sb.append("    disallowUserResizeStamp: ").append(toIndentedString(disallowUserResizeStamp)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    nrdsId: ").append(toIndentedString(nrdsId)).append("\n");
    sb.append("    nrdsLastName: ").append(toIndentedString(nrdsLastName)).append("\n");
    sb.append("    phoneticName: ").append(toIndentedString(phoneticName)).append("\n");
    sb.append("    signatureFont: ").append(toIndentedString(signatureFont)).append("\n");
    sb.append("    signatureGroups: ").append(toIndentedString(signatureGroups)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    sb.append("    signatureInitials: ").append(toIndentedString(signatureInitials)).append("\n");
    sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    signatureUsers: ").append(toIndentedString(signatureUsers)).append("\n");
    sb.append("    stampFormat: ").append(toIndentedString(stampFormat)).append("\n");
    sb.append("    stampSizeMM: ").append(toIndentedString(stampSizeMM)).append("\n");
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
