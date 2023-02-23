package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** PostTransactionsRequest */
public class PostTransactionsRequest {
  @JsonProperty("documentData")
  private String documentData = null;

  @JsonProperty("dptName")
  private String dptName = null;

  @JsonProperty("transactionName")
  private String transactionName = null;

  @JsonProperty("transactionTypeName")
  private String transactionTypeName = null;

  public PostTransactionsRequest documentData(String documentData) {
    this.documentData = documentData;
    return this;
  }

  /** @return documentData */
  @Schema(example = "null", description = "")
  public String getDocumentData() {
    return documentData;
  }

  public void setDocumentData(String documentData) {
    this.documentData = documentData;
  }

  public PostTransactionsRequest dptName(String dptName) {
    this.dptName = dptName;
    return this;
  }

  /** @return dptName */
  @Schema(example = "null", description = "")
  public String getDptName() {
    return dptName;
  }

  public void setDptName(String dptName) {
    this.dptName = dptName;
  }

  public PostTransactionsRequest transactionName(String transactionName) {
    this.transactionName = transactionName;
    return this;
  }

  /** @return transactionName */
  @Schema(example = "null", description = "")
  public String getTransactionName() {
    return transactionName;
  }

  public void setTransactionName(String transactionName) {
    this.transactionName = transactionName;
  }

  public PostTransactionsRequest transactionTypeName(String transactionTypeName) {
    this.transactionTypeName = transactionTypeName;
    return this;
  }

  /** @return transactionTypeName */
  @Schema(example = "null", description = "")
  public String getTransactionTypeName() {
    return transactionTypeName;
  }

  public void setTransactionTypeName(String transactionTypeName) {
    this.transactionTypeName = transactionTypeName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTransactionsRequest postTransactionsRequest = (PostTransactionsRequest) o;
    return Objects.equals(this.documentData, postTransactionsRequest.documentData)
        && Objects.equals(this.dptName, postTransactionsRequest.dptName)
        && Objects.equals(this.transactionName, postTransactionsRequest.transactionName)
        && Objects.equals(this.transactionTypeName, postTransactionsRequest.transactionTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentData, dptName, transactionName, transactionTypeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTransactionsRequest {\n");

    sb.append("    documentData: ").append(toIndentedString(documentData)).append("\n");
    sb.append("    dptName: ").append(toIndentedString(dptName)).append("\n");
    sb.append("    transactionName: ").append(toIndentedString(transactionName)).append("\n");
    sb.append("    transactionTypeName: ")
        .append(toIndentedString(transactionTypeName))
        .append("\n");
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
