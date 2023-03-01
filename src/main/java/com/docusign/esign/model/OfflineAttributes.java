package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Reserved for DocuSign use..
 *
 */
@Schema(description = "Reserved for DocuSign use.")

public class OfflineAttributes {
  @JsonProperty("accountEsignId")
  private String accountEsignId = null;

  @JsonProperty("deviceModel")
  private String deviceModel = null;

  @JsonProperty("deviceName")
  private String deviceName = null;

  @JsonProperty("gpsLatitude")
  private String gpsLatitude = null;

  @JsonProperty("gpsLongitude")
  private String gpsLongitude = null;

  @JsonProperty("offlineSigningHash")
  private String offlineSigningHash = null;

  /**
   * accountEsignId.
   *
   * @return OfflineAttributes
   **/
  public OfflineAttributes accountEsignId(String accountEsignId) {
    this.accountEsignId = accountEsignId;
    return this;
  }

  /**
   * A GUID identifying the account associated with the consumer disclosure.
   * 
   * @return accountEsignId
   **/
  @Schema(description = "A GUID identifying the account associated with the consumer disclosure")
  public String getAccountEsignId() {
    return accountEsignId;
  }

  /**
   * setAccountEsignId.
   **/
  public void setAccountEsignId(String accountEsignId) {
    this.accountEsignId = accountEsignId;
  }

  /**
   * deviceModel.
   *
   * @return OfflineAttributes
   **/
  public OfflineAttributes deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

  /**
   * A string containing information about the model of the device used for
   * offline signing..
   * 
   * @return deviceModel
   **/
  @Schema(description = "A string containing information about the model of the device used for offline signing.")
  public String getDeviceModel() {
    return deviceModel;
  }

  /**
   * setDeviceModel.
   **/
  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  /**
   * deviceName.
   *
   * @return OfflineAttributes
   **/
  public OfflineAttributes deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * A string containing information about the type of device used for offline
   * signing..
   * 
   * @return deviceName
   **/
  @Schema(description = "A string containing information about the type of device used for offline signing.")
  public String getDeviceName() {
    return deviceName;
  }

  /**
   * setDeviceName.
   **/
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  /**
   * gpsLatitude.
   *
   * @return OfflineAttributes
   **/
  public OfflineAttributes gpsLatitude(String gpsLatitude) {
    this.gpsLatitude = gpsLatitude;
    return this;
  }

  /**
   * A string containing the latitude of the device location at the time of
   * signing..
   * 
   * @return gpsLatitude
   **/
  @Schema(description = "A string containing the latitude of the device location at the time of signing.")
  public String getGpsLatitude() {
    return gpsLatitude;
  }

  /**
   * setGpsLatitude.
   **/
  public void setGpsLatitude(String gpsLatitude) {
    this.gpsLatitude = gpsLatitude;
  }

  /**
   * gpsLongitude.
   *
   * @return OfflineAttributes
   **/
  public OfflineAttributes gpsLongitude(String gpsLongitude) {
    this.gpsLongitude = gpsLongitude;
    return this;
  }

  /**
   * A string containing the longitude of the device location at the time of
   * signing..
   * 
   * @return gpsLongitude
   **/
  @Schema(description = "A string containing the longitude of the device location at the time of signing.")
  public String getGpsLongitude() {
    return gpsLongitude;
  }

  /**
   * setGpsLongitude.
   **/
  public void setGpsLongitude(String gpsLongitude) {
    this.gpsLongitude = gpsLongitude;
  }

  /**
   * offlineSigningHash.
   *
   * @return OfflineAttributes
   **/
  public OfflineAttributes offlineSigningHash(String offlineSigningHash) {
    this.offlineSigningHash = offlineSigningHash;
    return this;
  }

  /**
   * .
   * 
   * @return offlineSigningHash
   **/
  @Schema(description = "")
  public String getOfflineSigningHash() {
    return offlineSigningHash;
  }

  /**
   * setOfflineSigningHash.
   **/
  public void setOfflineSigningHash(String offlineSigningHash) {
    this.offlineSigningHash = offlineSigningHash;
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
    OfflineAttributes offlineAttributes = (OfflineAttributes) o;
    return Objects.equals(this.accountEsignId, offlineAttributes.accountEsignId) &&
        Objects.equals(this.deviceModel, offlineAttributes.deviceModel) &&
        Objects.equals(this.deviceName, offlineAttributes.deviceName) &&
        Objects.equals(this.gpsLatitude, offlineAttributes.gpsLatitude) &&
        Objects.equals(this.gpsLongitude, offlineAttributes.gpsLongitude) &&
        Objects.equals(this.offlineSigningHash, offlineAttributes.offlineSigningHash);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountEsignId, deviceModel, deviceName, gpsLatitude, gpsLongitude, offlineSigningHash);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineAttributes {\n");

    sb.append("    accountEsignId: ").append(toIndentedString(accountEsignId)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    gpsLatitude: ").append(toIndentedString(gpsLatitude)).append("\n");
    sb.append("    gpsLongitude: ").append(toIndentedString(gpsLongitude)).append("\n");
    sb.append("    offlineSigningHash: ").append(toIndentedString(offlineSigningHash)).append("\n");
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
