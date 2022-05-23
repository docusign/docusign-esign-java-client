package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Contains information about the method used for authentication.. */
@ApiModel(description = "Contains information about the method used for authentication.")
public class AuthenticationMethod {
  @JsonProperty("authenticationType")
  private String authenticationType = null;

  @JsonProperty("lastProvider")
  private String lastProvider = null;

  @JsonProperty("lastTimestamp")
  private String lastTimestamp = null;

  @JsonProperty("totalCount")
  private String totalCount = null;

  /**
   * authenticationType.
   *
   * @return AuthenticationMethod
   */
  public AuthenticationMethod authenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  /**
   * Indicates the type of authentication. Valid values are: PhoneAuth, STAN, ISCheck, OFAC,
   * AccessCode, AgeVerify, or SSOAuth. .
   *
   * @return authenticationType
   */
  @ApiModelProperty(
      value =
          "Indicates the type of authentication. Valid values are: PhoneAuth, STAN, ISCheck, OFAC, AccessCode, AgeVerify, or SSOAuth. ")
  public String getAuthenticationType() {
    return authenticationType;
  }

  /** setAuthenticationType. */
  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }

  /**
   * lastProvider.
   *
   * @return AuthenticationMethod
   */
  public AuthenticationMethod lastProvider(String lastProvider) {
    this.lastProvider = lastProvider;
    return this;
  }

  /**
   * The last provider that authenticated the user. .
   *
   * @return lastProvider
   */
  @ApiModelProperty(value = "The last provider that authenticated the user. ")
  public String getLastProvider() {
    return lastProvider;
  }

  /** setLastProvider. */
  public void setLastProvider(String lastProvider) {
    this.lastProvider = lastProvider;
  }

  /**
   * lastTimestamp.
   *
   * @return AuthenticationMethod
   */
  public AuthenticationMethod lastTimestamp(String lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return this;
  }

  /**
   * The data and time the user last used the authentication method. .
   *
   * @return lastTimestamp
   */
  @ApiModelProperty(value = " The data and time the user last used the authentication method. ")
  public String getLastTimestamp() {
    return lastTimestamp;
  }

  /** setLastTimestamp. */
  public void setLastTimestamp(String lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }

  /**
   * totalCount.
   *
   * @return AuthenticationMethod
   */
  public AuthenticationMethod totalCount(String totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * The number of times the authentication method was used. .
   *
   * @return totalCount
   */
  @ApiModelProperty(value = "The number of times the authentication method was used. ")
  public String getTotalCount() {
    return totalCount;
  }

  /** setTotalCount. */
  public void setTotalCount(String totalCount) {
    this.totalCount = totalCount;
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
    AuthenticationMethod authenticationMethod = (AuthenticationMethod) o;
    return Objects.equals(this.authenticationType, authenticationMethod.authenticationType)
        && Objects.equals(this.lastProvider, authenticationMethod.lastProvider)
        && Objects.equals(this.lastTimestamp, authenticationMethod.lastTimestamp)
        && Objects.equals(this.totalCount, authenticationMethod.totalCount);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(authenticationType, lastProvider, lastTimestamp, totalCount);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMethod {\n");

    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    lastProvider: ").append(toIndentedString(lastProvider)).append("\n");
    sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
