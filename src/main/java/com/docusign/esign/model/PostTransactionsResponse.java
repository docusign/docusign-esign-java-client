package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PostTransactionsResponse
 */

public class PostTransactionsResponse {
  @JsonProperty("documentData")
  private String documentData = null;

  @JsonProperty("transactionSid")
  private String transactionSid = null;

  public PostTransactionsResponse documentData(String documentData) {
    this.documentData = documentData;
    return this;
  }

   /**
   * 
   * @return documentData
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentData() {
    return documentData;
  }

  public void setDocumentData(String documentData) {
    this.documentData = documentData;
  }

  public PostTransactionsResponse transactionSid(String transactionSid) {
    this.transactionSid = transactionSid;
    return this;
  }

   /**
   * 
   * @return transactionSid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTransactionSid() {
    return transactionSid;
  }

  public void setTransactionSid(String transactionSid) {
    this.transactionSid = transactionSid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTransactionsResponse postTransactionsResponse = (PostTransactionsResponse) o;
    return Objects.equals(this.documentData, postTransactionsResponse.documentData) &&
        Objects.equals(this.transactionSid, postTransactionsResponse.transactionSid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentData, transactionSid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTransactionsResponse {\n");
    
    sb.append("    documentData: ").append(toIndentedString(documentData)).append("\n");
    sb.append("    transactionSid: ").append(toIndentedString(transactionSid)).append("\n");
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

