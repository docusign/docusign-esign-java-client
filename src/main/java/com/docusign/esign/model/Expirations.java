package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex element that specifies the expiration settings for the envelope.
 */
@ApiModel(description = "A complex element that specifies the expiration settings for the envelope.")

public class Expirations {
  @JsonProperty("expireAfter")
  private String expireAfter = null;

  @JsonProperty("expireEnabled")
  private String expireEnabled = null;

  @JsonProperty("expireWarn")
  private String expireWarn = null;

  public Expirations expireAfter(String expireAfter) {
    this.expireAfter = expireAfter;
    return this;
  }

   /**
   * An integer that sets the number of days the envelope is active.
   * @return expireAfter
  **/
  @ApiModelProperty(example = "null", value = "An integer that sets the number of days the envelope is active.")
  public String getExpireAfter() {
    return expireAfter;
  }

  public void setExpireAfter(String expireAfter) {
    this.expireAfter = expireAfter;
  }

  public Expirations expireEnabled(String expireEnabled) {
    this.expireEnabled = expireEnabled;
    return this;
  }

   /**
   * When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.
   * @return expireEnabled
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.")
  public String getExpireEnabled() {
    return expireEnabled;
  }

  public void setExpireEnabled(String expireEnabled) {
    this.expireEnabled = expireEnabled;
  }

  public Expirations expireWarn(String expireWarn) {
    this.expireWarn = expireWarn;
    return this;
  }

   /**
   * An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.
   * @return expireWarn
  **/
  @ApiModelProperty(example = "null", value = "An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.")
  public String getExpireWarn() {
    return expireWarn;
  }

  public void setExpireWarn(String expireWarn) {
    this.expireWarn = expireWarn;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(expireAfter, expireEnabled, expireWarn);
  }


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

