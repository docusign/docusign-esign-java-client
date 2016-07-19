package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MemberSharedItems;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains shared access information.
 **/

@ApiModel(description = "Contains shared access information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
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
  public AccountSharedAccess resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of results returned in this response. ")
  @JsonProperty("resultSetSize")
  public String getResultSetSize() {
    return resultSetSize;
  }
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  
  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   **/
  public AccountSharedAccess totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
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
  public AccountSharedAccess startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Starting position of the current result set.")
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
  public AccountSharedAccess endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last position in the result set. ")
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
  public AccountSharedAccess nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
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
  public AccountSharedAccess previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The postal code for the billing address.")
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
  public AccountSharedAccess accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The account ID associated with the envelope.")
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
  public AccountSharedAccess sharedAccess(java.util.List<MemberSharedItems> sharedAccess) {
    this.sharedAccess = sharedAccess;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A complex type containing the shared access information to an envelope for the users specified in the request.")
  @JsonProperty("sharedAccess")
  public java.util.List<MemberSharedItems> getSharedAccess() {
    return sharedAccess;
  }
  public void setSharedAccess(java.util.List<MemberSharedItems> sharedAccess) {
    this.sharedAccess = sharedAccess;
  }

  
  /**
   **/
  public AccountSharedAccess errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.resultSetSize, accountSharedAccess.resultSetSize) &&
        Objects.equals(this.totalSetSize, accountSharedAccess.totalSetSize) &&
        Objects.equals(this.startPosition, accountSharedAccess.startPosition) &&
        Objects.equals(this.endPosition, accountSharedAccess.endPosition) &&
        Objects.equals(this.nextUri, accountSharedAccess.nextUri) &&
        Objects.equals(this.previousUri, accountSharedAccess.previousUri) &&
        Objects.equals(this.accountId, accountSharedAccess.accountId) &&
        Objects.equals(this.sharedAccess, accountSharedAccess.sharedAccess) &&
        Objects.equals(this.errorDetails, accountSharedAccess.errorDetails);
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

