package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MobileNotifierConfiguration.
 *
 */

public class MobileNotifierConfiguration {
  @JsonProperty("deviceId")
  private String deviceId = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("platform")
  private String platform = null;


  /**
   * deviceId.
   *
   * @return MobileNotifierConfiguration
   **/
  public MobileNotifierConfiguration deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * .
   * @return deviceId
   **/
  @ApiModelProperty(value = "")
  public String getDeviceId() {
    return deviceId;
  }

  /**
   * setDeviceId.
   **/
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  /**
   * errorDetails.
   *
   * @return MobileNotifierConfiguration
   **/
  public MobileNotifierConfiguration errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @ApiModelProperty(value = "")
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
   * platform.
   *
   * @return MobileNotifierConfiguration
   **/
  public MobileNotifierConfiguration platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * .
   * @return platform
   **/
  @ApiModelProperty(value = "")
  public String getPlatform() {
    return platform;
  }

  /**
   * setPlatform.
   **/
  public void setPlatform(String platform) {
    this.platform = platform;
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
    MobileNotifierConfiguration mobileNotifierConfiguration = (MobileNotifierConfiguration) o;
    return Objects.equals(this.deviceId, mobileNotifierConfiguration.deviceId) &&
        Objects.equals(this.errorDetails, mobileNotifierConfiguration.errorDetails) &&
        Objects.equals(this.platform, mobileNotifierConfiguration.platform);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(deviceId, errorDetails, platform);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileNotifierConfiguration {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

