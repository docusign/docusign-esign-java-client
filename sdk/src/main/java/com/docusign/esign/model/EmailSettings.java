package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.BccEmailAddress;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class EmailSettings   {
  
  private String replyEmailAddressOverride = null;
  private String replyEmailNameOverride = null;
  private java.util.List<BccEmailAddress> bccEmailAddresses = new java.util.ArrayList<BccEmailAddress>();

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("replyEmailAddressOverride")
  public String getReplyEmailAddressOverride() {
    return replyEmailAddressOverride;
  }
  public void setReplyEmailAddressOverride(String replyEmailAddressOverride) {
    this.replyEmailAddressOverride = replyEmailAddressOverride;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("replyEmailNameOverride")
  public String getReplyEmailNameOverride() {
    return replyEmailNameOverride;
  }
  public void setReplyEmailNameOverride(String replyEmailNameOverride) {
    this.replyEmailNameOverride = replyEmailNameOverride;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bccEmailAddresses")
  public java.util.List<BccEmailAddress> getBccEmailAddresses() {
    return bccEmailAddresses;
  }
  public void setBccEmailAddresses(java.util.List<BccEmailAddress> bccEmailAddresses) {
    this.bccEmailAddresses = bccEmailAddresses;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSettings emailSettings = (EmailSettings) o;
    return Objects.equals(replyEmailAddressOverride, emailSettings.replyEmailAddressOverride) &&
        Objects.equals(replyEmailNameOverride, emailSettings.replyEmailNameOverride) &&
        Objects.equals(bccEmailAddresses, emailSettings.bccEmailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replyEmailAddressOverride, replyEmailNameOverride, bccEmailAddresses);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSettings {\n");
    
    sb.append("    replyEmailAddressOverride: ").append(StringUtil.toIndentedString(replyEmailAddressOverride)).append("\n");
    sb.append("    replyEmailNameOverride: ").append(StringUtil.toIndentedString(replyEmailNameOverride)).append("\n");
    sb.append("    bccEmailAddresses: ").append(StringUtil.toIndentedString(bccEmailAddresses)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
