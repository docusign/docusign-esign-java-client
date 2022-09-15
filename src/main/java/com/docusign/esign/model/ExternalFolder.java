package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ExternalDocServiceErrorDetails;
import com.docusign.esign.model.ExternalFile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExternalFolder.
 *
 */

public class ExternalFolder {
  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("errorDetails")
  private ExternalDocServiceErrorDetails errorDetails = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("items")
  private java.util.List<ExternalFile> items = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;


  /**
   * endPosition.
   *
   * @return ExternalFolder
   **/
  public ExternalFolder endPosition(String endPosition) {
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
   * @return ExternalFolder
   **/
  public ExternalFolder errorDetails(ExternalDocServiceErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * This object describes errors that occur. It is only valid for responses and ignored in requests..
   * @return errorDetails
   **/
  @ApiModelProperty(value = "This object describes errors that occur. It is only valid for responses and ignored in requests.")
  public ExternalDocServiceErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ExternalDocServiceErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * id.
   *
   * @return ExternalFolder
   **/
  public ExternalFolder id(String id) {
    this.id = id;
    return this;
  }

  /**
   * .
   * @return id
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(String id) {
    this.id = id;
  }


  /**
   * items.
   *
   * @return ExternalFolder
   **/
  public ExternalFolder items(java.util.List<ExternalFile> items) {
    this.items = items;
    return this;
  }
  
  /**
   * addItemsItem.
   *
   * @return ExternalFolder
   **/
  public ExternalFolder addItemsItem(ExternalFile itemsItem) {
    if (this.items == null) {
      this.items = new java.util.ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * .
   * @return items
   **/
  @ApiModelProperty(value = "")
  public java.util.List<ExternalFile> getItems() {
    return items;
  }

  /**
   * setItems.
   **/
  public void setItems(java.util.List<ExternalFile> items) {
    this.items = items;
  }


  /**
   * name.
   *
   * @return ExternalFolder
   **/
  public ExternalFolder name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * nextUri.
   *
   * @return ExternalFolder
   **/
  public ExternalFolder nextUri(String nextUri) {
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
   * @return ExternalFolder
   **/
  public ExternalFolder previousUri(String previousUri) {
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
   * @return ExternalFolder
   **/
  public ExternalFolder resultSetSize(String resultSetSize) {
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
   * startPosition.
   *
   * @return ExternalFolder
   **/
  public ExternalFolder startPosition(String startPosition) {
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
   * @return ExternalFolder
   **/
  public ExternalFolder totalSetSize(String totalSetSize) {
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
    ExternalFolder externalFolder = (ExternalFolder) o;
    return Objects.equals(this.endPosition, externalFolder.endPosition) &&
        Objects.equals(this.errorDetails, externalFolder.errorDetails) &&
        Objects.equals(this.id, externalFolder.id) &&
        Objects.equals(this.items, externalFolder.items) &&
        Objects.equals(this.name, externalFolder.name) &&
        Objects.equals(this.nextUri, externalFolder.nextUri) &&
        Objects.equals(this.previousUri, externalFolder.previousUri) &&
        Objects.equals(this.resultSetSize, externalFolder.resultSetSize) &&
        Objects.equals(this.startPosition, externalFolder.startPosition) &&
        Objects.equals(this.totalSetSize, externalFolder.totalSetSize);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(endPosition, errorDetails, id, items, name, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalFolder {\n");
    
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
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

