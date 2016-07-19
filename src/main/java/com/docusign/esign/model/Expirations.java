package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class Expirations   {
  
  private String expireEnabled = null;
  private String expireAfter = null;
  private String expireWarn = null;

  
  /**
   * When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.
   **/
  public Expirations expireEnabled(String expireEnabled) {
    this.expireEnabled = expireEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.")
  @JsonProperty("expireEnabled")
  public String getExpireEnabled() {
    return expireEnabled;
  }
  public void setExpireEnabled(String expireEnabled) {
    this.expireEnabled = expireEnabled;
  }

  
  /**
   * An integer that sets the number of days the envelope is active.
   **/
  public Expirations expireAfter(String expireAfter) {
    this.expireAfter = expireAfter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An integer that sets the number of days the envelope is active.")
  @JsonProperty("expireAfter")
  public String getExpireAfter() {
    return expireAfter;
  }
  public void setExpireAfter(String expireAfter) {
    this.expireAfter = expireAfter;
  }

  
  /**
   * An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.
   **/
  public Expirations expireWarn(String expireWarn) {
    this.expireWarn = expireWarn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.")
  @JsonProperty("expireWarn")
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
    return Objects.equals(this.expireEnabled, expirations.expireEnabled) &&
        Objects.equals(this.expireAfter, expirations.expireAfter) &&
        Objects.equals(this.expireWarn, expirations.expireWarn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireEnabled, expireAfter, expireWarn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expirations {\n");
    
    sb.append("    expireEnabled: ").append(toIndentedString(expireEnabled)).append("\n");
    sb.append("    expireAfter: ").append(toIndentedString(expireAfter)).append("\n");
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

