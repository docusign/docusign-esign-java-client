package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class Expirations   {
  
  private String expireEnabled = null;
  private String expireAfter = null;
  private String expireWarn = null;

  
  /**
   * When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.
   **/
  @ApiModelProperty(value = "When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.")
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
  @ApiModelProperty(value = "An integer that sets the number of days the envelope is active.")
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
  @ApiModelProperty(value = "An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.")
  @JsonProperty("expireWarn")
  public String getExpireWarn() {
    return expireWarn;
  }
  public void setExpireWarn(String expireWarn) {
    this.expireWarn = expireWarn;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expirations expirations = (Expirations) o;
    return Objects.equals(expireEnabled, expirations.expireEnabled) &&
        Objects.equals(expireAfter, expirations.expireAfter) &&
        Objects.equals(expireWarn, expirations.expireWarn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireEnabled, expireAfter, expireWarn);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expirations {\n");
    
    sb.append("    expireEnabled: ").append(StringUtil.toIndentedString(expireEnabled)).append("\n");
    sb.append("    expireAfter: ").append(StringUtil.toIndentedString(expireAfter)).append("\n");
    sb.append("    expireWarn: ").append(StringUtil.toIndentedString(expireWarn)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
