package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Reserved for DocuSign use.
 **/

@ApiModel(description = "Reserved for DocuSign use.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class OfflineAttributes   {
  
  private String accountEsignId = null;
  private String deviceModel = null;
  private String deviceName = null;
  private String gpsLatitude = null;
  private String gpsLongitude = null;
  private String offlineSigningHash = null;

  
  /**
   * A GUID identifying the account associated with the consumer disclosure
   **/
  
  @ApiModelProperty(value = "A GUID identifying the account associated with the consumer disclosure")
  @JsonProperty("accountEsignId")
  public String getAccountEsignId() {
    return accountEsignId;
  }
  public void setAccountEsignId(String accountEsignId) {
    this.accountEsignId = accountEsignId;
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

    return true && Objects.equals(accountEsignId, offlineAttributes.accountEsignId) &&
        Objects.equals(deviceModel, offlineAttributes.deviceModel) &&
        Objects.equals(deviceName, offlineAttributes.deviceName) &&
        Objects.equals(gpsLatitude, offlineAttributes.gpsLatitude) &&
        Objects.equals(gpsLongitude, offlineAttributes.gpsLongitude) &&
        Objects.equals(offlineSigningHash, offlineAttributes.offlineSigningHash)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountEsignId, deviceModel, deviceName, gpsLatitude, gpsLongitude, offlineSigningHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineAttributes {\n");
    
    if (accountEsignId != null)
      sb.append("    accountEsignId: ").append(toIndentedString(accountEsignId)).append("\n");
    if (deviceModel != null)
      sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    if (deviceName != null)
      sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    if (gpsLatitude != null)
      sb.append("    gpsLatitude: ").append(toIndentedString(gpsLatitude)).append("\n");
    if (gpsLongitude != null)
      sb.append("    gpsLongitude: ").append(toIndentedString(gpsLongitude)).append("\n");
    if (offlineSigningHash != null)
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

