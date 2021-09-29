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
 * TemplateUpdateSummary.
 *
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

  @JsonProperty("purgeState")
  private String purgeState = null;

  @JsonProperty("recipientUpdateResults")
  private java.util.List<RecipientUpdateResponse> recipientUpdateResults = null;

  @JsonProperty("tabUpdateResults")
  private Tabs tabUpdateResults = null;

  @JsonProperty("textCustomFieldUpdateResults")
  private java.util.List<TextCustomField> textCustomFieldUpdateResults = null;


  /**
   * bulkEnvelopeStatus.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary bulkEnvelopeStatus(BulkEnvelopeStatus bulkEnvelopeStatus) {
    this.bulkEnvelopeStatus = bulkEnvelopeStatus;
    return this;
  }

  /**
   * Get bulkEnvelopeStatus.
   * @return bulkEnvelopeStatus
   **/
  @ApiModelProperty(value = "")
  public BulkEnvelopeStatus getBulkEnvelopeStatus() {
    return bulkEnvelopeStatus;
  }

  /**
   * setBulkEnvelopeStatus.
   **/
  public void setBulkEnvelopeStatus(BulkEnvelopeStatus bulkEnvelopeStatus) {
    this.bulkEnvelopeStatus = bulkEnvelopeStatus;
  }


  /**
   * envelopeId.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   * @return envelopeId
   **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  /**
   * setEnvelopeId.
   **/
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }


  /**
   * errorDetails.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary errorDetails(ErrorDetails errorDetails) {
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
   * listCustomFieldUpdateResults.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary listCustomFieldUpdateResults(java.util.List<ListCustomField> listCustomFieldUpdateResults) {
    this.listCustomFieldUpdateResults = listCustomFieldUpdateResults;
    return this;
  }
  
  /**
   * addListCustomFieldUpdateResultsItem.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary addListCustomFieldUpdateResultsItem(ListCustomField listCustomFieldUpdateResultsItem) {
    if (this.listCustomFieldUpdateResults == null) {
      this.listCustomFieldUpdateResults = new java.util.ArrayList<ListCustomField>();
    }
    this.listCustomFieldUpdateResults.add(listCustomFieldUpdateResultsItem);
    return this;
  }

  /**
   * .
   * @return listCustomFieldUpdateResults
   **/
  @ApiModelProperty(value = "")
  public java.util.List<ListCustomField> getListCustomFieldUpdateResults() {
    return listCustomFieldUpdateResults;
  }

  /**
   * setListCustomFieldUpdateResults.
   **/
  public void setListCustomFieldUpdateResults(java.util.List<ListCustomField> listCustomFieldUpdateResults) {
    this.listCustomFieldUpdateResults = listCustomFieldUpdateResults;
  }


  /**
   * lockInformation.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary lockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
    return this;
  }

  /**
   * Get lockInformation.
   * @return lockInformation
   **/
  @ApiModelProperty(value = "")
  public LockInformation getLockInformation() {
    return lockInformation;
  }

  /**
   * setLockInformation.
   **/
  public void setLockInformation(LockInformation lockInformation) {
    this.lockInformation = lockInformation;
  }


  /**
   * purgeState.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary purgeState(String purgeState) {
    this.purgeState = purgeState;
    return this;
  }

  /**
   * .
   * @return purgeState
   **/
  @ApiModelProperty(value = "")
  public String getPurgeState() {
    return purgeState;
  }

  /**
   * setPurgeState.
   **/
  public void setPurgeState(String purgeState) {
    this.purgeState = purgeState;
  }


  /**
   * recipientUpdateResults.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary recipientUpdateResults(java.util.List<RecipientUpdateResponse> recipientUpdateResults) {
    this.recipientUpdateResults = recipientUpdateResults;
    return this;
  }
  
  /**
   * addRecipientUpdateResultsItem.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary addRecipientUpdateResultsItem(RecipientUpdateResponse recipientUpdateResultsItem) {
    if (this.recipientUpdateResults == null) {
      this.recipientUpdateResults = new java.util.ArrayList<RecipientUpdateResponse>();
    }
    this.recipientUpdateResults.add(recipientUpdateResultsItem);
    return this;
  }

  /**
   * .
   * @return recipientUpdateResults
   **/
  @ApiModelProperty(value = "")
  public java.util.List<RecipientUpdateResponse> getRecipientUpdateResults() {
    return recipientUpdateResults;
  }

  /**
   * setRecipientUpdateResults.
   **/
  public void setRecipientUpdateResults(java.util.List<RecipientUpdateResponse> recipientUpdateResults) {
    this.recipientUpdateResults = recipientUpdateResults;
  }


  /**
   * tabUpdateResults.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary tabUpdateResults(Tabs tabUpdateResults) {
    this.tabUpdateResults = tabUpdateResults;
    return this;
  }

  /**
   * Get tabUpdateResults.
   * @return tabUpdateResults
   **/
  @ApiModelProperty(value = "")
  public Tabs getTabUpdateResults() {
    return tabUpdateResults;
  }

  /**
   * setTabUpdateResults.
   **/
  public void setTabUpdateResults(Tabs tabUpdateResults) {
    this.tabUpdateResults = tabUpdateResults;
  }


  /**
   * textCustomFieldUpdateResults.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary textCustomFieldUpdateResults(java.util.List<TextCustomField> textCustomFieldUpdateResults) {
    this.textCustomFieldUpdateResults = textCustomFieldUpdateResults;
    return this;
  }
  
  /**
   * addTextCustomFieldUpdateResultsItem.
   *
   * @return TemplateUpdateSummary
   **/
  public TemplateUpdateSummary addTextCustomFieldUpdateResultsItem(TextCustomField textCustomFieldUpdateResultsItem) {
    if (this.textCustomFieldUpdateResults == null) {
      this.textCustomFieldUpdateResults = new java.util.ArrayList<TextCustomField>();
    }
    this.textCustomFieldUpdateResults.add(textCustomFieldUpdateResultsItem);
    return this;
  }

  /**
   * .
   * @return textCustomFieldUpdateResults
   **/
  @ApiModelProperty(value = "")
  public java.util.List<TextCustomField> getTextCustomFieldUpdateResults() {
    return textCustomFieldUpdateResults;
  }

  /**
   * setTextCustomFieldUpdateResults.
   **/
  public void setTextCustomFieldUpdateResults(java.util.List<TextCustomField> textCustomFieldUpdateResults) {
    this.textCustomFieldUpdateResults = textCustomFieldUpdateResults;
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
    TemplateUpdateSummary templateUpdateSummary = (TemplateUpdateSummary) o;
    return Objects.equals(this.bulkEnvelopeStatus, templateUpdateSummary.bulkEnvelopeStatus) &&
        Objects.equals(this.envelopeId, templateUpdateSummary.envelopeId) &&
        Objects.equals(this.errorDetails, templateUpdateSummary.errorDetails) &&
        Objects.equals(this.listCustomFieldUpdateResults, templateUpdateSummary.listCustomFieldUpdateResults) &&
        Objects.equals(this.lockInformation, templateUpdateSummary.lockInformation) &&
        Objects.equals(this.purgeState, templateUpdateSummary.purgeState) &&
        Objects.equals(this.recipientUpdateResults, templateUpdateSummary.recipientUpdateResults) &&
        Objects.equals(this.tabUpdateResults, templateUpdateSummary.tabUpdateResults) &&
        Objects.equals(this.textCustomFieldUpdateResults, templateUpdateSummary.textCustomFieldUpdateResults);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bulkEnvelopeStatus, envelopeId, errorDetails, listCustomFieldUpdateResults, lockInformation, purgeState, recipientUpdateResults, tabUpdateResults, textCustomFieldUpdateResults);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateUpdateSummary {\n");
    
    sb.append("    bulkEnvelopeStatus: ").append(toIndentedString(bulkEnvelopeStatus)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    listCustomFieldUpdateResults: ").append(toIndentedString(listCustomFieldUpdateResults)).append("\n");
    sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
    sb.append("    purgeState: ").append(toIndentedString(purgeState)).append("\n");
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

