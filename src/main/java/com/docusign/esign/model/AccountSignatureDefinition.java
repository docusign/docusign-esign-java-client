package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DateStampProperties;
import com.docusign.esign.model.SignatureGroupDef;
import com.docusign.esign.model.SignatureUserDef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountSignatureDefinition
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

  public AccountSignatureDefinition dateStampProperties(DateStampProperties dateStampProperties) {
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

  public AccountSignatureDefinition disallowUserResizeStamp(String disallowUserResizeStamp) {
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

  public AccountSignatureDefinition externalID(String externalID) {
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

  public AccountSignatureDefinition imageType(String imageType) {
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

  public AccountSignatureDefinition isDefault(String isDefault) {
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

  public AccountSignatureDefinition nrdsId(String nrdsId) {
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

  public AccountSignatureDefinition nrdsLastName(String nrdsLastName) {
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

  public AccountSignatureDefinition phoneticName(String phoneticName) {
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

  public AccountSignatureDefinition signatureFont(String signatureFont) {
    this.signatureFont = signatureFont;
    return this;
  }

   /**
   * 
   * @return signatureFont
  **/
  @ApiModelProperty(value = "")
  public String getSignatureFont() {
    return signatureFont;
  }

  public void setSignatureFont(String signatureFont) {
    this.signatureFont = signatureFont;
  }

  public AccountSignatureDefinition signatureGroups(java.util.List<SignatureGroupDef> signatureGroups) {
    this.signatureGroups = signatureGroups;
    return this;
  }

  public AccountSignatureDefinition addSignatureGroupsItem(SignatureGroupDef signatureGroupsItem) {
    if (this.signatureGroups == null) {
      this.signatureGroups = new java.util.ArrayList<SignatureGroupDef>();
    }
    this.signatureGroups.add(signatureGroupsItem);
    return this;
  }

   /**
   * 
   * @return signatureGroups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SignatureGroupDef> getSignatureGroups() {
    return signatureGroups;
  }

  public void setSignatureGroups(java.util.List<SignatureGroupDef> signatureGroups) {
    this.signatureGroups = signatureGroups;
  }

  public AccountSignatureDefinition signatureId(String signatureId) {
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

  public AccountSignatureDefinition signatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
    return this;
  }

   /**
   * 
   * @return signatureInitials
  **/
  @ApiModelProperty(value = "")
  public String getSignatureInitials() {
    return signatureInitials;
  }

  public void setSignatureInitials(String signatureInitials) {
    this.signatureInitials = signatureInitials;
  }

  public AccountSignatureDefinition signatureName(String signatureName) {
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

  public AccountSignatureDefinition signatureType(String signatureType) {
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

  public AccountSignatureDefinition signatureUsers(java.util.List<SignatureUserDef> signatureUsers) {
    this.signatureUsers = signatureUsers;
    return this;
  }

  public AccountSignatureDefinition addSignatureUsersItem(SignatureUserDef signatureUsersItem) {
    if (this.signatureUsers == null) {
      this.signatureUsers = new java.util.ArrayList<SignatureUserDef>();
    }
    this.signatureUsers.add(signatureUsersItem);
    return this;
  }

   /**
   * 
   * @return signatureUsers
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SignatureUserDef> getSignatureUsers() {
    return signatureUsers;
  }

  public void setSignatureUsers(java.util.List<SignatureUserDef> signatureUsers) {
    this.signatureUsers = signatureUsers;
  }

  public AccountSignatureDefinition stampFormat(String stampFormat) {
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

  public AccountSignatureDefinition stampSizeMM(String stampSizeMM) {
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

  @Override
  public int hashCode() {
    return Objects.hash(dateStampProperties, disallowUserResizeStamp, externalID, imageType, isDefault, nrdsId, nrdsLastName, phoneticName, signatureFont, signatureGroups, signatureId, signatureInitials, signatureName, signatureType, signatureUsers, stampFormat, stampSizeMM);
  }


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

