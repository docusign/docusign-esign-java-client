package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PostTransactionsRequest   {
  
  private String documentData = null;
  private String dptName = null;
  private String transactionName = null;
  private String transactionTypeName = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documentData")
  public String getDocumentData() {
    return documentData;
  }
  public void setDocumentData(String documentData) {
    this.documentData = documentData;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dptName")
  public String getDptName() {
    return dptName;
  }
  public void setDptName(String dptName) {
    this.dptName = dptName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionName")
  public String getTransactionName() {
    return transactionName;
  }
  public void setTransactionName(String transactionName) {
    this.transactionName = transactionName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionTypeName")
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

    return true && Objects.equals(documentData, postTransactionsRequest.documentData) &&
        Objects.equals(dptName, postTransactionsRequest.dptName) &&
        Objects.equals(transactionName, postTransactionsRequest.transactionName) &&
        Objects.equals(transactionTypeName, postTransactionsRequest.transactionTypeName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentData, dptName, transactionName, transactionTypeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTransactionsRequest {\n");
    
    if (documentData != null)
      sb.append("    documentData: ").append(toIndentedString(documentData)).append("\n");
    if (dptName != null)
      sb.append("    dptName: ").append(toIndentedString(dptName)).append("\n");
    if (transactionName != null)
      sb.append("    transactionName: ").append(toIndentedString(transactionName)).append("\n");
    if (transactionTypeName != null)
      sb.append("    transactionTypeName: ").append(toIndentedString(transactionTypeName)).append("\n");
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

