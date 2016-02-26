package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MemberSharedItems;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class AccountSharedAccess   {
  
  private String resultSetSize = null;
  private String totalSetSize = null;
  private String startPosition = null;
  private String endPosition = null;
  private String nextUri = null;
  private String previousUri = null;
  private String accountId = null;
  private java.util.List<MemberSharedItems> sharedAccess = new java.util.ArrayList<MemberSharedItems>();
  private ErrorDetails errorDetails = null;

  
  /**
   * The number of results returned in this response.
   **/
  
  @ApiModelProperty(value = "The number of results returned in this response.")
  @JsonProperty("resultSetSize")
  public String getResultSetSize() {
    return resultSetSize;
  }
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  
  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the `resultSetSize` property.
   **/
  
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the `resultSetSize` property.")
  @JsonProperty("totalSetSize")
  public String getTotalSetSize() {
    return totalSetSize;
  }
  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
  }

  
  /**
   * Starting position of the current result set.
   **/
  
  @ApiModelProperty(value = "Starting position of the current result set.")
  @JsonProperty("startPosition")
  public String getStartPosition() {
    return startPosition;
  }
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  
  /**
   * The last position in the result set.
   **/
  
  @ApiModelProperty(value = "The last position in the result set.")
  @JsonProperty("endPosition")
  public String getEndPosition() {
    return endPosition;
  }
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  
  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.
   **/
  
  @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  
  /**
   * The postal code for the billing address.
   **/
  
  @ApiModelProperty(value = "The postal code for the billing address.")
  @JsonProperty("previousUri")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  
  /**
   * The account ID associated with the envelope.
   **/
  
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  
  /**
   * A complex type containing the shared access information to an envelope for the users specified in the request.
   **/
  
  @ApiModelProperty(value = "A complex type containing the shared access information to an envelope for the users specified in the request.")
  @JsonProperty("sharedAccess")
  public java.util.List<MemberSharedItems> getSharedAccess() {
    return sharedAccess;
  }
  public void setSharedAccess(java.util.List<MemberSharedItems> sharedAccess) {
    this.sharedAccess = sharedAccess;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSharedAccess accountSharedAccess = (AccountSharedAccess) o;

    return true && Objects.equals(resultSetSize, accountSharedAccess.resultSetSize) &&
        Objects.equals(totalSetSize, accountSharedAccess.totalSetSize) &&
        Objects.equals(startPosition, accountSharedAccess.startPosition) &&
        Objects.equals(endPosition, accountSharedAccess.endPosition) &&
        Objects.equals(nextUri, accountSharedAccess.nextUri) &&
        Objects.equals(previousUri, accountSharedAccess.previousUri) &&
        Objects.equals(accountId, accountSharedAccess.accountId) &&
        Objects.equals(sharedAccess, accountSharedAccess.sharedAccess) &&
        Objects.equals(errorDetails, accountSharedAccess.errorDetails)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSetSize, totalSetSize, startPosition, endPosition, nextUri, previousUri, accountId, sharedAccess, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSharedAccess {\n");
    
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    sharedAccess: ").append(toIndentedString(sharedAccess)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

