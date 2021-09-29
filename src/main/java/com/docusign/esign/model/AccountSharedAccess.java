package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MemberSharedItems;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains shared access information..
 *
 */
@ApiModel(description = "Contains shared access information.")

public class AccountSharedAccess {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("sharedAccess")
  private java.util.List<MemberSharedItems> sharedAccess = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;


  /**
   * accountId.
   *
   * @return AccountSharedAccess
   **/
  public AccountSharedAccess accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID associated with the envelope..
   * @return accountId
   **/
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * endPosition.
   *
   * @return AccountSharedAccess
   **/
  public AccountSharedAccess endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * The last position in the result set. .
   * @return endPosition
   **/
  @ApiModelProperty(value = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  /**
   * setEndPosition.
   **/
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }


  /**
   * errorDetails.
   *
   * @return AccountSharedAccess
   **/
  public AccountSharedAccess errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * nextUri.
   *
   * @return AccountSharedAccess
   **/
  public AccountSharedAccess nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. .
   * @return nextUri
   **/
  @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  /**
   * setNextUri.
   **/
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   * previousUri.
   *
   * @return AccountSharedAccess
   **/
  public AccountSharedAccess previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

  /**
   * The postal code for the billing address..
   * @return previousUri
   **/
  @ApiModelProperty(value = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  /**
   * setPreviousUri.
   **/
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }


  /**
   * resultSetSize.
   *
   * @return AccountSharedAccess
   **/
  public AccountSharedAccess resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * The number of results returned in this response. .
   * @return resultSetSize
   **/
  @ApiModelProperty(value = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * sharedAccess.
   *
   * @return AccountSharedAccess
   **/
  public AccountSharedAccess sharedAccess(java.util.List<MemberSharedItems> sharedAccess) {
    this.sharedAccess = sharedAccess;
    return this;
  }
  
  /**
   * addSharedAccessItem.
   *
   * @return AccountSharedAccess
   **/
  public AccountSharedAccess addSharedAccessItem(MemberSharedItems sharedAccessItem) {
    if (this.sharedAccess == null) {
      this.sharedAccess = new java.util.ArrayList<MemberSharedItems>();
    }
    this.sharedAccess.add(sharedAccessItem);
    return this;
  }

  /**
   * A complex type containing the shared access information to an envelope for the users specified in the request..
   * @return sharedAccess
   **/
  @ApiModelProperty(value = "A complex type containing the shared access information to an envelope for the users specified in the request.")
  public java.util.List<MemberSharedItems> getSharedAccess() {
    return sharedAccess;
  }

  /**
   * setSharedAccess.
   **/
  public void setSharedAccess(java.util.List<MemberSharedItems> sharedAccess) {
    this.sharedAccess = sharedAccess;
  }


  /**
   * startPosition.
   *
   * @return AccountSharedAccess
   **/
  public AccountSharedAccess startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   * @return startPosition
   **/
  @ApiModelProperty(value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }


  /**
   * totalSetSize.
   *
   * @return AccountSharedAccess
   **/
  public AccountSharedAccess totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response..
   * @return totalSetSize
   **/
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public String getTotalSetSize() {
    return totalSetSize;
  }

  /**
   * setTotalSetSize.
   **/
  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
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
    AccountSharedAccess accountSharedAccess = (AccountSharedAccess) o;
    return Objects.equals(this.accountId, accountSharedAccess.accountId) &&
        Objects.equals(this.endPosition, accountSharedAccess.endPosition) &&
        Objects.equals(this.errorDetails, accountSharedAccess.errorDetails) &&
        Objects.equals(this.nextUri, accountSharedAccess.nextUri) &&
        Objects.equals(this.previousUri, accountSharedAccess.previousUri) &&
        Objects.equals(this.resultSetSize, accountSharedAccess.resultSetSize) &&
        Objects.equals(this.sharedAccess, accountSharedAccess.sharedAccess) &&
        Objects.equals(this.startPosition, accountSharedAccess.startPosition) &&
        Objects.equals(this.totalSetSize, accountSharedAccess.totalSetSize);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, endPosition, errorDetails, nextUri, previousUri, resultSetSize, sharedAccess, startPosition, totalSetSize);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSharedAccess {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    sharedAccess: ").append(toIndentedString(sharedAccess)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
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

