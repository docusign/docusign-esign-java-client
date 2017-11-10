package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex element consisting of:   * lastSentDateTime – the date and time the user last sent an envelope.  * lastSignedDateTime – the date and time the user last signed an envelope. * sentCount – the number of envelopes the user has sent. * signedCount – the number of envelopes the user has signed.
 */
@ApiModel(description = "A complex element consisting of:   * lastSentDateTime – the date and time the user last sent an envelope.  * lastSignedDateTime – the date and time the user last signed an envelope. * sentCount – the number of envelopes the user has sent. * signedCount – the number of envelopes the user has signed.")

public class UsageHistory {
  @JsonProperty("lastSentDateTime")
  private String lastSentDateTime = null;

  @JsonProperty("lastSignedDateTime")
  private String lastSignedDateTime = null;

  @JsonProperty("sentCount")
  private Integer sentCount = null;

  @JsonProperty("signedCount")
  private Integer signedCount = null;

  public UsageHistory lastSentDateTime(String lastSentDateTime) {
    this.lastSentDateTime = lastSentDateTime;
    return this;
  }

   /**
   * The date and time the user last sent an envelope. 
   * @return lastSentDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the user last sent an envelope. ")
  public String getLastSentDateTime() {
    return lastSentDateTime;
  }

  public void setLastSentDateTime(String lastSentDateTime) {
    this.lastSentDateTime = lastSentDateTime;
  }

  public UsageHistory lastSignedDateTime(String lastSignedDateTime) {
    this.lastSignedDateTime = lastSignedDateTime;
    return this;
  }

   /**
   * The date and time the user last signed an envelope.
   * @return lastSignedDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the user last signed an envelope.")
  public String getLastSignedDateTime() {
    return lastSignedDateTime;
  }

  public void setLastSignedDateTime(String lastSignedDateTime) {
    this.lastSignedDateTime = lastSignedDateTime;
  }

  public UsageHistory sentCount(Integer sentCount) {
    this.sentCount = sentCount;
    return this;
  }

   /**
   * The number of envelopes the user has sent. 
   * @return sentCount
  **/
  @ApiModelProperty(example = "null", value = "The number of envelopes the user has sent. ")
  public Integer getSentCount() {
    return sentCount;
  }

  public void setSentCount(Integer sentCount) {
    this.sentCount = sentCount;
  }

  public UsageHistory signedCount(Integer signedCount) {
    this.signedCount = signedCount;
    return this;
  }

   /**
   * The number of envelopes the user has signed. 
   * @return signedCount
  **/
  @ApiModelProperty(example = "null", value = "The number of envelopes the user has signed. ")
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
    return Objects.equals(this.lastSentDateTime, usageHistory.lastSentDateTime) &&
        Objects.equals(this.lastSignedDateTime, usageHistory.lastSignedDateTime) &&
        Objects.equals(this.sentCount, usageHistory.sentCount) &&
        Objects.equals(this.signedCount, usageHistory.signedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSentDateTime, lastSignedDateTime, sentCount, signedCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageHistory {\n");
    
    sb.append("    lastSentDateTime: ").append(toIndentedString(lastSentDateTime)).append("\n");
    sb.append("    lastSignedDateTime: ").append(toIndentedString(lastSignedDateTime)).append("\n");
    sb.append("    sentCount: ").append(toIndentedString(sentCount)).append("\n");
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

