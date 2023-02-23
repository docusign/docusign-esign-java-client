package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** ExternalClaim */
public class ExternalClaim {
  @JsonProperty("acquiredTime")
  private String acquiredTime = null;

  @JsonProperty("claimName")
  private String claimName = null;

  @JsonProperty("provider")
  private String provider = null;

  @JsonProperty("value")
  private String value = null;

  public ExternalClaim acquiredTime(String acquiredTime) {
    this.acquiredTime = acquiredTime;
    return this;
  }

  /** @return acquiredTime */
  @Schema(description = "")
  public String getAcquiredTime() {
    return acquiredTime;
  }

  public void setAcquiredTime(String acquiredTime) {
    this.acquiredTime = acquiredTime;
  }

  public ExternalClaim claimName(String claimName) {
    this.claimName = claimName;
    return this;
  }

  /** @return claimName */
  @Schema(description = "")
  public String getClaimName() {
    return claimName;
  }

  public void setClaimName(String claimName) {
    this.claimName = claimName;
  }

  public ExternalClaim provider(String provider) {
    this.provider = provider;
    return this;
  }

  /** @return provider */
  @Schema(description = "")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public ExternalClaim value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value of the tab.
   *
   * @return value
   */
  @Schema(description = "Specifies the value of the tab. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalClaim externalClaim = (ExternalClaim) o;
    return Objects.equals(this.acquiredTime, externalClaim.acquiredTime)
        && Objects.equals(this.claimName, externalClaim.claimName)
        && Objects.equals(this.provider, externalClaim.provider)
        && Objects.equals(this.value, externalClaim.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquiredTime, claimName, provider, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalClaim {\n");

    sb.append("    acquiredTime: ").append(toIndentedString(acquiredTime)).append("\n");
    sb.append("    claimName: ").append(toIndentedString(claimName)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
