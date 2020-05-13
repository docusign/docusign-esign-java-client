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
 * Stamp
 */

public class Stamp {
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

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  @JsonProperty("phoneticName")
  private String phoneticName = null;

  @JsonProperty("signatureName")
  private String signatureName = null;

  @JsonProperty("stampFormat")
  private String stampFormat = null;

  @JsonProperty("stampImageUri")
  private String stampImageUri = null;

  @JsonProperty("stampSizeMM")
  private String stampSizeMM = null;

  @JsonProperty("status")
  private String status = null;

  public Stamp adoptedDateTime(String adoptedDateTime) {
    this.adoptedDateTime = adoptedDateTime;
    return this;
  }

   /**
   * 
   * @return adoptedDateTime
  **/
  @ApiModelProperty(value = "")
  public String getAdoptedDateTime() {
    return adoptedDateTime;
  }

  public void setAdoptedDateTime(String adoptedDateTime) {
    this.adoptedDateTime = adoptedDateTime;
  }

  public Stamp createdDateTime(String createdDateTime) {
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

  public Stamp customField(String customField) {
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

  public Stamp dateStampProperties(DateStampProperties dateStampProperties) {
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

  public Stamp disallowUserResizeStamp(String disallowUserResizeStamp) {
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

  public Stamp errorDetails(ErrorDetails errorDetails) {
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

  public Stamp externalID(String externalID) {
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

  public Stamp imageBase64(String imageBase64) {
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

  public Stamp imageType(String imageType) {
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

  public Stamp lastModifiedDateTime(String lastModifiedDateTime) {
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

  public Stamp phoneticName(String phoneticName) {
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

  public Stamp signatureName(String signatureName) {
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

  public Stamp stampFormat(String stampFormat) {
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

  public Stamp stampImageUri(String stampImageUri) {
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

  public Stamp stampSizeMM(String stampSizeMM) {
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

  public Stamp status(String status) {
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
    Stamp stamp = (Stamp) o;
    return Objects.equals(this.adoptedDateTime, stamp.adoptedDateTime) &&
        Objects.equals(this.createdDateTime, stamp.createdDateTime) &&
        Objects.equals(this.customField, stamp.customField) &&
        Objects.equals(this.dateStampProperties, stamp.dateStampProperties) &&
        Objects.equals(this.disallowUserResizeStamp, stamp.disallowUserResizeStamp) &&
        Objects.equals(this.errorDetails, stamp.errorDetails) &&
        Objects.equals(this.externalID, stamp.externalID) &&
        Objects.equals(this.imageBase64, stamp.imageBase64) &&
        Objects.equals(this.imageType, stamp.imageType) &&
        Objects.equals(this.lastModifiedDateTime, stamp.lastModifiedDateTime) &&
        Objects.equals(this.phoneticName, stamp.phoneticName) &&
        Objects.equals(this.signatureName, stamp.signatureName) &&
        Objects.equals(this.stampFormat, stamp.stampFormat) &&
        Objects.equals(this.stampImageUri, stamp.stampImageUri) &&
        Objects.equals(this.stampSizeMM, stamp.stampSizeMM) &&
        Objects.equals(this.status, stamp.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adoptedDateTime, createdDateTime, customField, dateStampProperties, disallowUserResizeStamp, errorDetails, externalID, imageBase64, imageType, lastModifiedDateTime, phoneticName, signatureName, stampFormat, stampImageUri, stampSizeMM, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stamp {\n");
    
    sb.append("    adoptedDateTime: ").append(toIndentedString(adoptedDateTime)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    dateStampProperties: ").append(toIndentedString(dateStampProperties)).append("\n");
    sb.append("    disallowUserResizeStamp: ").append(toIndentedString(disallowUserResizeStamp)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    phoneticName: ").append(toIndentedString(phoneticName)).append("\n");
    sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
    sb.append("    stampFormat: ").append(toIndentedString(stampFormat)).append("\n");
    sb.append("    stampImageUri: ").append(toIndentedString(stampImageUri)).append("\n");
    sb.append("    stampSizeMM: ").append(toIndentedString(stampSizeMM)).append("\n");
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

