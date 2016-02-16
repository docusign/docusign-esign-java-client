package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BccEmailAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
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
   * The list of email addresses that will receve a copy of all email communcations about an envelope, for archiving purposes.
   **/
  
  @ApiModelProperty(value = "The list of email addresses that will receve a copy of all email communcations about an envelope, for archiving purposes.")
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

    return true && Objects.equals(replyEmailAddressOverride, emailSettings.replyEmailAddressOverride) &&
        Objects.equals(replyEmailNameOverride, emailSettings.replyEmailNameOverride) &&
        Objects.equals(bccEmailAddresses, emailSettings.bccEmailAddresses)
    ;
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

