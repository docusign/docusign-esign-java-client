package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkEnvelopeStatus;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.ListCustomField;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.RecipientUpdateResponse;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.TextCustomField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TemplateUpdateSummary
 */

public class TemplateUpdateSummary {
  @JsonProperty("bulkEnvelopeStatus")
  private BulkEnvelopeStatus bulkEnvelopeStatus = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("listCustomFieldUpdateResults")
  private java.util.List<ListCustomField> listCustomFieldUpdateResults = null;

  @JsonProperty("lockInformation")
  private LockInformation lockInformation = null;

  @JsonProperty("recipientUpdateResults")
  private java.util.List<RecipientUpdateResponse> recipientUpdateResults = null;

  @JsonProperty("tabUpdateResults")
  private Tabs tabUpdateResults = null;

  @JsonProperty("textCustomFieldUpdateResults")
  private java.util.List<TextCustomField> textCustomFieldUpdateResults = null;

  public TemplateUpdateSummary bulkEnvelopeStatus(BulkEnvelopeStatus bulkEnvelopeStatus) {
    this.bulkEnvelopeStatus = bulkEnvelopeStatus;
    return this;
  }

   /**
   * Get bulkEnvelopeStatus
   * @return bulkEnvelopeStatus
  **/
  @ApiModelProperty(value = "")
  public BulkEnvelopeStatus getBulkEnvelopeStatus() {
    return bulkEnvelopeStatus;
  }

  public void setBulkEnvelopeStatus(BulkEnvelopeStatus bulkEnvelopeStatus) {
    this.bulkEnvelopeStatus = bulkEnvelopeStatus;
  }

  public TemplateUpdateSummary envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public TemplateUpdateSummary errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public TemplateUpdateSummary listCustomFieldUpdateResults(java.util.List<ListCustomField> listCustomFieldUpdateResults) {
    this.listCustomFieldUpdateResults = listCustomFieldUpdateResults;
    return this;
  }

  public TemplateUpdateSummary addListCustomFieldUpdateResultsItem(ListCustomField listCustomFieldUpdateResultsItem) {
    if (this.listCustomFieldUpdateResults == null) {
      this.listCustomFieldUpdateResults = new java.util.ArrayList<ListCustomField>();
    }
    this.listCustomFieldUpdateResults.add(listCustomFieldUpdateResultsItem);
    return this;
  }

   /**
   * 
   * @return listCustomFieldUpdateResults
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ListCustomField> getListCustomFieldUpdateResults() {
    return listCustomFieldUpdateResults;
  }

  public void setListCustomFieldUpdateResults(java.util.List<ListCustomField> listCustomFieldUpdateResults) {
    this.listCustomFieldUpdateResults = listCustomFieldUpdateResults;
  }

  public TemplateUpdateSummary lockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
    return this;
  }

   /**
   * Get lockInformation
   * @return lockInformation
  **/
  @ApiModelProperty(value = "")
  public LockInformation getLockInformation() {
    return lockInformation;
  }

  public void setLockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
  }

  public TemplateUpdateSummary recipientUpdateResults(java.util.List<RecipientUpdateResponse> recipientUpdateResults) {
    this.recipientUpdateResults = recipientUpdateResults;
    return this;
  }

  public TemplateUpdateSummary addRecipientUpdateResultsItem(RecipientUpdateResponse recipientUpdateResultsItem) {
    if (this.recipientUpdateResults == null) {
      this.recipientUpdateResults = new java.util.ArrayList<RecipientUpdateResponse>();
    }
    this.recipientUpdateResults.add(recipientUpdateResultsItem);
    return this;
  }

   /**
   * 
   * @return recipientUpdateResults
  **/
  @ApiModelProperty(value = "")
  public java.util.List<RecipientUpdateResponse> getRecipientUpdateResults() {
    return recipientUpdateResults;
  }

  public void setRecipientUpdateResults(java.util.List<RecipientUpdateResponse> recipientUpdateResults) {
    this.recipientUpdateResults = recipientUpdateResults;
  }

  public TemplateUpdateSummary tabUpdateResults(Tabs tabUpdateResults) {
    this.tabUpdateResults = tabUpdateResults;
    return this;
  }

   /**
   * Get tabUpdateResults
   * @return tabUpdateResults
  **/
  @ApiModelProperty(value = "")
  public Tabs getTabUpdateResults() {
    return tabUpdateResults;
  }

  public void setTabUpdateResults(Tabs tabUpdateResults) {
    this.tabUpdateResults = tabUpdateResults;
  }

  public TemplateUpdateSummary textCustomFieldUpdateResults(java.util.List<TextCustomField> textCustomFieldUpdateResults) {
    this.textCustomFieldUpdateResults = textCustomFieldUpdateResults;
    return this;
  }

  public TemplateUpdateSummary addTextCustomFieldUpdateResultsItem(TextCustomField textCustomFieldUpdateResultsItem) {
    if (this.textCustomFieldUpdateResults == null) {
      this.textCustomFieldUpdateResults = new java.util.ArrayList<TextCustomField>();
    }
    this.textCustomFieldUpdateResults.add(textCustomFieldUpdateResultsItem);
    return this;
  }

   /**
   * 
   * @return textCustomFieldUpdateResults
  **/
  @ApiModelProperty(value = "")
  public java.util.List<TextCustomField> getTextCustomFieldUpdateResults() {
    return textCustomFieldUpdateResults;
  }

  public void setTextCustomFieldUpdateResults(java.util.List<TextCustomField> textCustomFieldUpdateResults) {
    this.textCustomFieldUpdateResults = textCustomFieldUpdateResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateUpdateSummary templateUpdateSummary = (TemplateUpdateSummary) o;
    return Objects.equals(this.bulkEnvelopeStatus, templateUpdateSummary.bulkEnvelopeStatus) &&
        Objects.equals(this.envelopeId, templateUpdateSummary.envelopeId) &&
        Objects.equals(this.errorDetails, templateUpdateSummary.errorDetails) &&
        Objects.equals(this.listCustomFieldUpdateResults, templateUpdateSummary.listCustomFieldUpdateResults) &&
        Objects.equals(this.lockInformation, templateUpdateSummary.lockInformation) &&
        Objects.equals(this.recipientUpdateResults, templateUpdateSummary.recipientUpdateResults) &&
        Objects.equals(this.tabUpdateResults, templateUpdateSummary.tabUpdateResults) &&
        Objects.equals(this.textCustomFieldUpdateResults, templateUpdateSummary.textCustomFieldUpdateResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkEnvelopeStatus, envelopeId, errorDetails, listCustomFieldUpdateResults, lockInformation, recipientUpdateResults, tabUpdateResults, textCustomFieldUpdateResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateUpdateSummary {\n");
    
    sb.append("    bulkEnvelopeStatus: ").append(toIndentedString(bulkEnvelopeStatus)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    listCustomFieldUpdateResults: ").append(toIndentedString(listCustomFieldUpdateResults)).append("\n");
    sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
    sb.append("    recipientUpdateResults: ").append(toIndentedString(recipientUpdateResults)).append("\n");
    sb.append("    tabUpdateResults: ").append(toIndentedString(tabUpdateResults)).append("\n");
    sb.append("    textCustomFieldUpdateResults: ").append(toIndentedString(textCustomFieldUpdateResults)).append("\n");
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

