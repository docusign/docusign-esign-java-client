package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** RecipientsUpdateSummary. */
public class RecipientsUpdateSummary {
  @JsonProperty("recipientUpdateResults")
  private java.util.List<RecipientUpdateResponse> recipientUpdateResults = null;

  /**
   * recipientUpdateResults.
   *
   * @return RecipientsUpdateSummary
   */
  public RecipientsUpdateSummary recipientUpdateResults(
      java.util.List<RecipientUpdateResponse> recipientUpdateResults) {
    this.recipientUpdateResults = recipientUpdateResults;
    return this;
  }

  /**
   * addRecipientUpdateResultsItem.
   *
   * @return RecipientsUpdateSummary
   */
  public RecipientsUpdateSummary addRecipientUpdateResultsItem(
      RecipientUpdateResponse recipientUpdateResultsItem) {
    if (this.recipientUpdateResults == null) {
      this.recipientUpdateResults = new java.util.ArrayList<>();
    }
    this.recipientUpdateResults.add(recipientUpdateResultsItem);
    return this;
  }

  /**
   * .
   *
   * @return recipientUpdateResults
   */
  @ApiModelProperty(value = "")
  public java.util.List<RecipientUpdateResponse> getRecipientUpdateResults() {
    return recipientUpdateResults;
  }

  /** setRecipientUpdateResults. */
  public void setRecipientUpdateResults(
      java.util.List<RecipientUpdateResponse> recipientUpdateResults) {
    this.recipientUpdateResults = recipientUpdateResults;
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
    RecipientsUpdateSummary recipientsUpdateSummary = (RecipientsUpdateSummary) o;
    return Objects.equals(
        this.recipientUpdateResults, recipientsUpdateSummary.recipientUpdateResults);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(recipientUpdateResults);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientsUpdateSummary {\n");

    sb.append("    recipientUpdateResults: ")
        .append(toIndentedString(recipientUpdateResults))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
