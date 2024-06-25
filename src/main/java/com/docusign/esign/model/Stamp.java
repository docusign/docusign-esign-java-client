package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DateStampProperties;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Stamp.
 *
 */

public class Stamp implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * adoptedDateTime.
   *
   * @return Stamp
   **/
  public Stamp adoptedDateTime(String adoptedDateTime) {
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
   * @return Stamp
   **/
  public Stamp createdDateTime(String createdDateTime) {
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
   * @return Stamp
   **/
  public Stamp customField(String customField) {
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
   * @return Stamp
   **/
  public Stamp dateStampProperties(DateStampProperties dateStampProperties) {
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
   * @return Stamp
   **/
  public Stamp disallowUserResizeStamp(String disallowUserResizeStamp) {
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
   * @return Stamp
   **/
  public Stamp errorDetails(ErrorDetails errorDetails) {
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
   * @return Stamp
   **/
  public Stamp externalID(String externalID) {
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
   * @return Stamp
   **/
  public Stamp imageBase64(String imageBase64) {
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
   * @return Stamp
   **/
  public Stamp imageType(String imageType) {
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
   * lastModifiedDateTime.
   *
   * @return Stamp
   **/
  public Stamp lastModifiedDateTime(String lastModifiedDateTime) {
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
   * phoneticName.
   *
   * @return Stamp
   **/
  public Stamp phoneticName(String phoneticName) {
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
   * signatureName.
   *
   * @return Stamp
   **/
  public Stamp signatureName(String signatureName) {
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
   * stampFormat.
   *
   * @return Stamp
   **/
  public Stamp stampFormat(String stampFormat) {
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
   * @return Stamp
   **/
  public Stamp stampImageUri(String stampImageUri) {
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
   * @return Stamp
   **/
  public Stamp stampSizeMM(String stampSizeMM) {
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
   * status.
   *
   * @return Stamp
   **/
  public Stamp status(String status) {
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(adoptedDateTime, createdDateTime, customField, dateStampProperties, disallowUserResizeStamp, errorDetails, externalID, imageBase64, imageType, lastModifiedDateTime, phoneticName, signatureName, stampFormat, stampImageUri, stampSizeMM, status);
  }


  /**
   * Converts the given object to string.
   */
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

