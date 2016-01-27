package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-18T16:25:36.433-08:00")
public class OfflineAttributes   {
  
  private String deviceName = null;
  private String deviceModel = null;
  private String gpsLatitude = null;
  private String gpsLongitude = null;
  private String accountEsignId = null;
  private String offlineSigningHash = null;

  
  /**
   * A string containing information about the type of device used for offline signing.
   **/
  
  @ApiModelProperty(value = "A string containing information about the type of device used for offline signing.")
  @JsonProperty("deviceName")
  public String getDeviceName() {
    return deviceName;
  }
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  
  /**
   * A string containing information about the model of the device used for offline signing.
   **/
  
  @ApiModelProperty(value = "A string containing information about the model of the device used for offline signing.")
  @JsonProperty("deviceModel")
  public String getDeviceModel() {
    return deviceModel;
  }
  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  
  /**
   * A string containing the latitude of the device location at the time of signing.
   **/
  
  @ApiModelProperty(value = "A string containing the latitude of the device location at the time of signing.")
  @JsonProperty("gpsLatitude")
  public String getGpsLatitude() {
    return gpsLatitude;
  }
  public void setGpsLatitude(String gpsLatitude) {
    this.gpsLatitude = gpsLatitude;
  }

  
  /**
   * A string containing the longitude of the device location at the time of signing.
   **/
  
  @ApiModelProperty(value = "A string containing the longitude of the device location at the time of signing.")
  @JsonProperty("gpsLongitude")
  public String getGpsLongitude() {
    return gpsLongitude;
  }
  public void setGpsLongitude(String gpsLongitude) {
    this.gpsLongitude = gpsLongitude;
  }

  
  /**
   * A string with GUID of the account. This can be retrieved with the [ML:Get Disclosure] call.
   **/
  
  @ApiModelProperty(value = "A string with GUID of the account. This can be retrieved with the [ML:Get Disclosure] call.")
  @JsonProperty("accountEsignId")
  public String getAccountEsignId() {
    return accountEsignId;
  }
  public void setAccountEsignId(String accountEsignId) {
    this.accountEsignId = accountEsignId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offlineSigningHash")
  public String getOfflineSigningHash() {
    return offlineSigningHash;
  }
  public void setOfflineSigningHash(String offlineSigningHash) {
    this.offlineSigningHash = offlineSigningHash;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineAttributes offlineAttributes = (OfflineAttributes) o;

    return true && Objects.equals(deviceName, offlineAttributes.deviceName) &&
        Objects.equals(deviceModel, offlineAttributes.deviceModel) &&
        Objects.equals(gpsLatitude, offlineAttributes.gpsLatitude) &&
        Objects.equals(gpsLongitude, offlineAttributes.gpsLongitude) &&
        Objects.equals(accountEsignId, offlineAttributes.accountEsignId) &&
        Objects.equals(offlineSigningHash, offlineAttributes.offlineSigningHash)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceName, deviceModel, gpsLatitude, gpsLongitude, accountEsignId, offlineSigningHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineAttributes {\n");
    
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    gpsLatitude: ").append(toIndentedString(gpsLatitude)).append("\n");
    sb.append("    gpsLongitude: ").append(toIndentedString(gpsLongitude)).append("\n");
    sb.append("    accountEsignId: ").append(toIndentedString(accountEsignId)).append("\n");
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

