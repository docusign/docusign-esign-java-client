package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A complex element that specifies the expiration settings for the envelope..
 *
 */
@Schema(description = "A complex element that specifies the expiration settings for the envelope.")

public class Expirations {
  @JsonProperty("expireAfter")
  private String expireAfter = null;

  @JsonProperty("expireEnabled")
  private String expireEnabled = null;

  @JsonProperty("expireWarn")
  private String expireWarn = null;


  /**
   * expireAfter.
   *
   * @return Expirations
   **/
  public Expirations expireAfter(String expireAfter) {
    this.expireAfter = expireAfter;
    return this;
  }

  /**
   * An integer that sets the number of days the envelope is active..
   * @return expireAfter
   **/
  @Schema(description = "An integer that sets the number of days the envelope is active.")
  public String getExpireAfter() {
    return expireAfter;
  }

  /**
   * setExpireAfter.
   **/
  public void setExpireAfter(String expireAfter) {
    this.expireAfter = expireAfter;
  }


  /**
   * expireEnabled.
   *
   * @return Expirations
   **/
  public Expirations expireEnabled(String expireEnabled) {
    this.expireEnabled = expireEnabled;
    return this;
  }

  /**
   * When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used..
   * @return expireEnabled
   **/
  @Schema(description = "When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.")
  public String getExpireEnabled() {
    return expireEnabled;
  }

  /**
   * setExpireEnabled.
   **/
  public void setExpireEnabled(String expireEnabled) {
    this.expireEnabled = expireEnabled;
  }


  /**
   * expireWarn.
   *
   * @return Expirations
   **/
  public Expirations expireWarn(String expireWarn) {
    this.expireWarn = expireWarn;
    return this;
  }

  /**
   * An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent..
   * @return expireWarn
   **/
  @Schema(description = "An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.")
  public String getExpireWarn() {
    return expireWarn;
  }

  /**
   * setExpireWarn.
   **/
  public void setExpireWarn(String expireWarn) {
    this.expireWarn = expireWarn;
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
    Expirations expirations = (Expirations) o;
    return Objects.equals(this.expireAfter, expirations.expireAfter) &&
        Objects.equals(this.expireEnabled, expirations.expireEnabled) &&
        Objects.equals(this.expireWarn, expirations.expireWarn);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(expireAfter, expireEnabled, expireWarn);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expirations {\n");
    
    sb.append("    expireAfter: ").append(toIndentedString(expireAfter)).append("\n");
    sb.append("    expireEnabled: ").append(toIndentedString(expireEnabled)).append("\n");
    sb.append("    expireWarn: ").append(toIndentedString(expireWarn)).append("\n");
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

