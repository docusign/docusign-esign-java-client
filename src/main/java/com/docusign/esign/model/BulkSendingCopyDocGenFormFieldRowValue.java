package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulksendingCopyDocGenFormField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * BulkSendingCopyDocGenFormFieldRowValue.
 *
 */

public class BulkSendingCopyDocGenFormFieldRowValue implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("docGenFormFieldList")
  private java.util.List<BulksendingCopyDocGenFormField> docGenFormFieldList = null;


  /**
   * docGenFormFieldList.
   *
   * @return BulkSendingCopyDocGenFormFieldRowValue
   **/
  public BulkSendingCopyDocGenFormFieldRowValue docGenFormFieldList(java.util.List<BulksendingCopyDocGenFormField> docGenFormFieldList) {
    this.docGenFormFieldList = docGenFormFieldList;
    return this;
  }
  
  /**
   * addDocGenFormFieldListItem.
   *
   * @return BulkSendingCopyDocGenFormFieldRowValue
   **/
  public BulkSendingCopyDocGenFormFieldRowValue addDocGenFormFieldListItem(BulksendingCopyDocGenFormField docGenFormFieldListItem) {
    if (this.docGenFormFieldList == null) {
      this.docGenFormFieldList = new java.util.ArrayList<>();
    }
    this.docGenFormFieldList.add(docGenFormFieldListItem);
    return this;
  }

  /**
   * .
   * @return docGenFormFieldList
   **/
  @Schema(description = "")
  public java.util.List<BulksendingCopyDocGenFormField> getDocGenFormFieldList() {
    return docGenFormFieldList;
  }

  /**
   * setDocGenFormFieldList.
   **/
  public void setDocGenFormFieldList(java.util.List<BulksendingCopyDocGenFormField> docGenFormFieldList) {
    this.docGenFormFieldList = docGenFormFieldList;
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
    BulkSendingCopyDocGenFormFieldRowValue bulkSendingCopyDocGenFormFieldRowValue = (BulkSendingCopyDocGenFormFieldRowValue) o;
    return Objects.equals(this.docGenFormFieldList, bulkSendingCopyDocGenFormFieldRowValue.docGenFormFieldList);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(docGenFormFieldList);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendingCopyDocGenFormFieldRowValue {\n");
    
    sb.append("    docGenFormFieldList: ").append(toIndentedString(docGenFormFieldList)).append("\n");
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

