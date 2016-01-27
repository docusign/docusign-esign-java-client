package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineAttributes offlineAttributes = (OfflineAttributes) o;
    return Objects.equals(deviceName, offlineAttributes.deviceName) &&
        Objects.equals(deviceModel, offlineAttributes.deviceModel) &&
        Objects.equals(gpsLatitude, offlineAttributes.gpsLatitude) &&
        Objects.equals(gpsLongitude, offlineAttributes.gpsLongitude) &&
        Objects.equals(accountEsignId, offlineAttributes.accountEsignId) &&
        Objects.equals(offlineSigningHash, offlineAttributes.offlineSigningHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceName, deviceModel, gpsLatitude, gpsLongitude, accountEsignId, offlineSigningHash);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineAttributes {\n");
    
    sb.append("    deviceName: ").append(StringUtil.toIndentedString(deviceName)).append("\n");
    sb.append("    deviceModel: ").append(StringUtil.toIndentedString(deviceModel)).append("\n");
    sb.append("    gpsLatitude: ").append(StringUtil.toIndentedString(gpsLatitude)).append("\n");
    sb.append("    gpsLongitude: ").append(StringUtil.toIndentedString(gpsLongitude)).append("\n");
    sb.append("    accountEsignId: ").append(StringUtil.toIndentedString(accountEsignId)).append("\n");
    sb.append("    offlineSigningHash: ").append(StringUtil.toIndentedString(offlineSigningHash)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
