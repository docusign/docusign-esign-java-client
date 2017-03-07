package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A complex element consisting of: \n\n* lastSentDateTime – the date and time the user last sent an envelope. \n* lastSignedDateTime – the date and time the user last signed an envelope.\n* sentCount – the number of envelopes the user has sent.\n* signedCount – the number of envelopes the user has signed.
 **/

@ApiModel(description = "A complex element consisting of: \n\n* lastSentDateTime – the date and time the user last sent an envelope. \n* lastSignedDateTime – the date and time the user last signed an envelope.\n* sentCount – the number of envelopes the user has sent.\n* signedCount – the number of envelopes the user has signed.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class UsageHistory   {
  
  private String lastSentDateTime = null;
  private String lastSignedDateTime = null;
  private Integer sentCount = null;
  private Integer signedCount = null;

  
  /**
   * The date and time the user last sent an envelope.
   **/
  
  @ApiModelProperty(value = "The date and time the user last sent an envelope.")
  @JsonProperty("lastSentDateTime")
  public String getLastSentDateTime() {
    return lastSentDateTime;
  }
  public void setLastSentDateTime(String lastSentDateTime) {
    this.lastSentDateTime = lastSentDateTime;
  }

  
  /**
   * The date and time the user last signed an envelope.
   **/
  
  @ApiModelProperty(value = "The date and time the user last signed an envelope.")
  @JsonProperty("lastSignedDateTime")
  public String getLastSignedDateTime() {
    return lastSignedDateTime;
  }
  public void setLastSignedDateTime(String lastSignedDateTime) {
    this.lastSignedDateTime = lastSignedDateTime;
  }

  
  /**
   * The number of envelopes the user has sent.
   **/
  
  @ApiModelProperty(value = "The number of envelopes the user has sent.")
  @JsonProperty("sentCount")
  public Integer getSentCount() {
    return sentCount;
  }
  public void setSentCount(Integer sentCount) {
    this.sentCount = sentCount;
  }

  
  /**
   * The number of envelopes the user has signed.
   **/
  
  @ApiModelProperty(value = "The number of envelopes the user has signed.")
  @JsonProperty("signedCount")
  public Integer getSignedCount() {
    return signedCount;
  }
  public void setSignedCount(Integer signedCount) {
    this.signedCount = signedCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageHistory usageHistory = (UsageHistory) o;

    return true && Objects.equals(lastSentDateTime, usageHistory.lastSentDateTime) &&
        Objects.equals(lastSignedDateTime, usageHistory.lastSignedDateTime) &&
        Objects.equals(sentCount, usageHistory.sentCount) &&
        Objects.equals(signedCount, usageHistory.signedCount)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSentDateTime, lastSignedDateTime, sentCount, signedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageHistory {\n");
    
    if (lastSentDateTime != null)
      sb.append("    lastSentDateTime: ").append(toIndentedString(lastSentDateTime)).append("\n");
    if (lastSignedDateTime != null)
      sb.append("    lastSignedDateTime: ").append(toIndentedString(lastSignedDateTime)).append("\n");
    if (sentCount != null)
      sb.append("    sentCount: ").append(toIndentedString(sentCount)).append("\n");
    if (signedCount != null)
      sb.append("    signedCount: ").append(toIndentedString(signedCount)).append("\n");
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

