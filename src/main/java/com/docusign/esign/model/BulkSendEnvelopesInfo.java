package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendEnvelopesInfo.
 *
 */

public class BulkSendEnvelopesInfo {
  @JsonProperty("completed")
  private String completed = null;

  @JsonProperty("declined")
  private String declined = null;

  @JsonProperty("voided")
  private String voided = null;


  /**
   * completed.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo completed(String completed) {
    this.completed = completed;
    return this;
  }

  /**
   * .
   * @return completed
   **/
  @ApiModelProperty(value = "")
  public String getCompleted() {
    return completed;
  }

  /**
   * setCompleted.
   **/
  public void setCompleted(String completed) {
    this.completed = completed;
  }


  /**
   * declined.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo declined(String declined) {
    this.declined = declined;
    return this;
  }

  /**
   * .
   * @return declined
   **/
  @ApiModelProperty(value = "")
  public String getDeclined() {
    return declined;
  }

  /**
   * setDeclined.
   **/
  public void setDeclined(String declined) {
    this.declined = declined;
  }


  /**
   * voided.
   *
   * @return BulkSendEnvelopesInfo
   **/
  public BulkSendEnvelopesInfo voided(String voided) {
    this.voided = voided;
    return this;
  }

  /**
   * .
   * @return voided
   **/
  @ApiModelProperty(value = "")
  public String getVoided() {
    return voided;
  }

  /**
   * setVoided.
   **/
  public void setVoided(String voided) {
    this.voided = voided;
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
    BulkSendEnvelopesInfo bulkSendEnvelopesInfo = (BulkSendEnvelopesInfo) o;
    return Objects.equals(this.completed, bulkSendEnvelopesInfo.completed) &&
        Objects.equals(this.declined, bulkSendEnvelopesInfo.declined) &&
        Objects.equals(this.voided, bulkSendEnvelopesInfo.voided);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(completed, declined, voided);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendEnvelopesInfo {\n");
    
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    declined: ").append(toIndentedString(declined)).append("\n");
    sb.append("    voided: ").append(toIndentedString(voided)).append("\n");
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

