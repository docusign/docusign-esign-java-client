package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkSendBatchError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * BulkProcessResult.
 *
 */

public class BulkProcessResult {
  @JsonProperty("errors")
  private java.util.List<BulkSendBatchError> errors = null;

  @JsonProperty("listId")
  private String listId = null;

  @JsonProperty("success")
  private String success = null;

  /**
   * errors.
   *
   * @return BulkProcessResult
   **/
  public BulkProcessResult errors(java.util.List<BulkSendBatchError> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * addErrorsItem.
   *
   * @return BulkProcessResult
   **/
  public BulkProcessResult addErrorsItem(BulkSendBatchError errorsItem) {
    if (this.errors == null) {
      this.errors = new java.util.ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * .
   * 
   * @return errors
   **/
  @Schema(description = "")
  public java.util.List<BulkSendBatchError> getErrors() {
    return errors;
  }

  /**
   * setErrors.
   **/
  public void setErrors(java.util.List<BulkSendBatchError> errors) {
    this.errors = errors;
  }

  /**
   * listId.
   *
   * @return BulkProcessResult
   **/
  public BulkProcessResult listId(String listId) {
    this.listId = listId;
    return this;
  }

  /**
   * .
   * 
   * @return listId
   **/
  @Schema(description = "")
  public String getListId() {
    return listId;
  }

  /**
   * setListId.
   **/
  public void setListId(String listId) {
    this.listId = listId;
  }

  /**
   * success.
   *
   * @return BulkProcessResult
   **/
  public BulkProcessResult success(String success) {
    this.success = success;
    return this;
  }

  /**
   * .
   * 
   * @return success
   **/
  @Schema(description = "")
  public String getSuccess() {
    return success;
  }

  /**
   * setSuccess.
   **/
  public void setSuccess(String success) {
    this.success = success;
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
    BulkProcessResult bulkProcessResult = (BulkProcessResult) o;
    return Objects.equals(this.errors, bulkProcessResult.errors) &&
        Objects.equals(this.listId, bulkProcessResult.listId) &&
        Objects.equals(this.success, bulkProcessResult.success);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errors, listId, success);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkProcessResult {\n");

    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
