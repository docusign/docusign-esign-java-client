package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DocumentSecurityStore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TimeStampField
 */

public class TimeStampField {
  @JsonProperty("documentSecurityStore")
  private DocumentSecurityStore documentSecurityStore = null;

  @JsonProperty("maxTimeStampSignatureLength")
  private String maxTimeStampSignatureLength = null;

  @JsonProperty("timeStampFieldName")
  private String timeStampFieldName = null;

  public TimeStampField documentSecurityStore(DocumentSecurityStore documentSecurityStore) {
    this.documentSecurityStore = documentSecurityStore;
    return this;
  }

   /**
   * Get documentSecurityStore
   * @return documentSecurityStore
  **/
  @ApiModelProperty(value = "")
  public DocumentSecurityStore getDocumentSecurityStore() {
    return documentSecurityStore;
  }

  public void setDocumentSecurityStore(DocumentSecurityStore documentSecurityStore) {
    this.documentSecurityStore = documentSecurityStore;
  }

  public TimeStampField maxTimeStampSignatureLength(String maxTimeStampSignatureLength) {
    this.maxTimeStampSignatureLength = maxTimeStampSignatureLength;
    return this;
  }

   /**
   * 
   * @return maxTimeStampSignatureLength
  **/
  @ApiModelProperty(value = "")
  public String getMaxTimeStampSignatureLength() {
    return maxTimeStampSignatureLength;
  }

  public void setMaxTimeStampSignatureLength(String maxTimeStampSignatureLength) {
    this.maxTimeStampSignatureLength = maxTimeStampSignatureLength;
  }

  public TimeStampField timeStampFieldName(String timeStampFieldName) {
    this.timeStampFieldName = timeStampFieldName;
    return this;
  }

   /**
   * 
   * @return timeStampFieldName
  **/
  @ApiModelProperty(value = "")
  public String getTimeStampFieldName() {
    return timeStampFieldName;
  }

  public void setTimeStampFieldName(String timeStampFieldName) {
    this.timeStampFieldName = timeStampFieldName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeStampField timeStampField = (TimeStampField) o;
    return Objects.equals(this.documentSecurityStore, timeStampField.documentSecurityStore) &&
        Objects.equals(this.maxTimeStampSignatureLength, timeStampField.maxTimeStampSignatureLength) &&
        Objects.equals(this.timeStampFieldName, timeStampField.timeStampFieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentSecurityStore, maxTimeStampSignatureLength, timeStampFieldName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeStampField {\n");
    
    sb.append("    documentSecurityStore: ").append(toIndentedString(documentSecurityStore)).append("\n");
    sb.append("    maxTimeStampSignatureLength: ").append(toIndentedString(maxTimeStampSignatureLength)).append("\n");
    sb.append("    timeStampFieldName: ").append(toIndentedString(timeStampFieldName)).append("\n");
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

