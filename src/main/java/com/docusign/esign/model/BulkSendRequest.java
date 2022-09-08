package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This object contains information about the envelope or template that you want to send in bulk..
 *
 */
@ApiModel(description = "This object contains information about the envelope or template that you want to send in bulk.")

public class BulkSendRequest {
  @JsonProperty("batchName")
  private String batchName = null;

  @JsonProperty("envelopeOrTemplateId")
  private String envelopeOrTemplateId = null;


  /**
   * batchName.
   *
   * @return BulkSendRequest
   **/
  public BulkSendRequest batchName(String batchName) {
    this.batchName = batchName;
    return this;
  }

  /**
   * .
   * @return batchName
   **/
  @ApiModelProperty(value = "")
  public String getBatchName() {
    return batchName;
  }

  /**
   * setBatchName.
   **/
  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }


  /**
   * envelopeOrTemplateId.
   *
   * @return BulkSendRequest
   **/
  public BulkSendRequest envelopeOrTemplateId(String envelopeOrTemplateId) {
    this.envelopeOrTemplateId = envelopeOrTemplateId;
    return this;
  }

  /**
   * .
   * @return envelopeOrTemplateId
   **/
  @ApiModelProperty(value = "")
  public String getEnvelopeOrTemplateId() {
    return envelopeOrTemplateId;
  }

  /**
   * setEnvelopeOrTemplateId.
   **/
  public void setEnvelopeOrTemplateId(String envelopeOrTemplateId) {
    this.envelopeOrTemplateId = envelopeOrTemplateId;
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
    BulkSendRequest bulkSendRequest = (BulkSendRequest) o;
    return Objects.equals(this.batchName, bulkSendRequest.batchName) &&
        Objects.equals(this.envelopeOrTemplateId, bulkSendRequest.envelopeOrTemplateId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(batchName, envelopeOrTemplateId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendRequest {\n");
    
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
    sb.append("    envelopeOrTemplateId: ").append(toIndentedString(envelopeOrTemplateId)).append("\n");
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

