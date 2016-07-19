package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BccEmailAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class EmailSettings   {
  
  private String replyEmailAddressOverride = null;
  private String replyEmailNameOverride = null;
  private java.util.List<BccEmailAddress> bccEmailAddresses = new java.util.ArrayList<BccEmailAddress>();

  
  /**
   * 
   **/
  public EmailSettings replyEmailAddressOverride(String replyEmailAddressOverride) {
    this.replyEmailAddressOverride = replyEmailAddressOverride;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public EmailSettings replyEmailNameOverride(String replyEmailNameOverride) {
    this.replyEmailNameOverride = replyEmailNameOverride;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("replyEmailNameOverride")
  public String getReplyEmailNameOverride() {
    return replyEmailNameOverride;
  }
  public void setReplyEmailNameOverride(String replyEmailNameOverride) {
    this.replyEmailNameOverride = replyEmailNameOverride;
  }

  
  /**
   * A list of email addresses that receive a copy of all email communications for an envelope. You can use this for archiving purposes.
   **/
  public EmailSettings bccEmailAddresses(java.util.List<BccEmailAddress> bccEmailAddresses) {
    this.bccEmailAddresses = bccEmailAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of email addresses that receive a copy of all email communications for an envelope. You can use this for archiving purposes.")
  @JsonProperty("bccEmailAddresses")
  public java.util.List<BccEmailAddress> getBccEmailAddresses() {
    return bccEmailAddresses;
  }
  public void setBccEmailAddresses(java.util.List<BccEmailAddress> bccEmailAddresses) {
    this.bccEmailAddresses = bccEmailAddresses;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSettings emailSettings = (EmailSettings) o;
    return Objects.equals(this.replyEmailAddressOverride, emailSettings.replyEmailAddressOverride) &&
        Objects.equals(this.replyEmailNameOverride, emailSettings.replyEmailNameOverride) &&
        Objects.equals(this.bccEmailAddresses, emailSettings.bccEmailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replyEmailAddressOverride, replyEmailNameOverride, bccEmailAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSettings {\n");
    
    sb.append("    replyEmailAddressOverride: ").append(toIndentedString(replyEmailAddressOverride)).append("\n");
    sb.append("    replyEmailNameOverride: ").append(toIndentedString(replyEmailNameOverride)).append("\n");
    sb.append("    bccEmailAddresses: ").append(toIndentedString(bccEmailAddresses)).append("\n");
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

