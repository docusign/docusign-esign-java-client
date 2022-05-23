package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EnvelopeIdsRequest. */
public class EnvelopeIdsRequest {
  @JsonProperty("envelopeIds")
  private java.util.List<String> envelopeIds = null;

  @JsonProperty("transactionIds")
  private java.util.List<String> transactionIds = null;

  /**
   * envelopeIds.
   *
   * @return EnvelopeIdsRequest
   */
  public EnvelopeIdsRequest envelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
    return this;
  }

  /**
   * addEnvelopeIdsItem.
   *
   * @return EnvelopeIdsRequest
   */
  public EnvelopeIdsRequest addEnvelopeIdsItem(String envelopeIdsItem) {
    if (this.envelopeIds == null) {
      this.envelopeIds = new java.util.ArrayList<>();
    }
    this.envelopeIds.add(envelopeIdsItem);
    return this;
  }

  /**
   * .
   *
   * @return envelopeIds
   */
  @ApiModelProperty(value = "")
  public java.util.List<String> getEnvelopeIds() {
    return envelopeIds;
  }

  /** setEnvelopeIds. */
  public void setEnvelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

  /**
   * transactionIds.
   *
   * @return EnvelopeIdsRequest
   */
  public EnvelopeIdsRequest transactionIds(java.util.List<String> transactionIds) {
    this.transactionIds = transactionIds;
    return this;
  }

  /**
   * addTransactionIdsItem.
   *
   * @return EnvelopeIdsRequest
   */
  public EnvelopeIdsRequest addTransactionIdsItem(String transactionIdsItem) {
    if (this.transactionIds == null) {
      this.transactionIds = new java.util.ArrayList<>();
    }
    this.transactionIds.add(transactionIdsItem);
    return this;
  }

  /**
   * A list of transaction Id's used to determining the status of envelopes sent asynchronously. See
   * **transactionId** property on envelopes..
   *
   * @return transactionIds
   */
  @ApiModelProperty(
      value =
          " A list of transaction Id's used to determining the status of envelopes sent asynchronously. See **transactionId** property on envelopes.")
  public java.util.List<String> getTransactionIds() {
    return transactionIds;
  }

  /** setTransactionIds. */
  public void setTransactionIds(java.util.List<String> transactionIds) {
    this.transactionIds = transactionIds;
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
    EnvelopeIdsRequest envelopeIdsRequest = (EnvelopeIdsRequest) o;
    return Objects.equals(this.envelopeIds, envelopeIdsRequest.envelopeIds)
        && Objects.equals(this.transactionIds, envelopeIdsRequest.transactionIds);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeIds, transactionIds);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeIdsRequest {\n");

    sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
    sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
