package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DisplayApplianceEnvelope */
public class DisplayApplianceEnvelope {
  @JsonProperty("addDemoStamp")
  private Boolean addDemoStamp = null;

  @JsonProperty("allowMultipleAttachments")
  private Boolean allowMultipleAttachments = null;

  @JsonProperty("burnDefaultTabData")
  private Boolean burnDefaultTabData = null;

  @JsonProperty("convertPdfFields")
  private Boolean convertPdfFields = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("envelopeType")
  private String envelopeType = null;

  @JsonProperty("includeSigsBeforeComplete")
  private Boolean includeSigsBeforeComplete = null;

  @JsonProperty("isConcatMode")
  private Boolean isConcatMode = null;

  @JsonProperty("isEnvelopeIDStampingEnabled")
  private Boolean isEnvelopeIDStampingEnabled = null;

  @JsonProperty("pdfFormConversionFontScale100")
  private Boolean pdfFormConversionFontScale100 = null;

  @JsonProperty("shouldFlatten")
  private Boolean shouldFlatten = null;

  @JsonProperty("showEnvelopeChanges")
  private Boolean showEnvelopeChanges = null;

  @JsonProperty("signOnline")
  private Boolean signOnline = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("userId")
  private String userId = null;

  public DisplayApplianceEnvelope addDemoStamp(Boolean addDemoStamp) {
    this.addDemoStamp = addDemoStamp;
    return this;
  }

  /** @return addDemoStamp */
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAddDemoStamp() {
    return addDemoStamp;
  }

  public void setAddDemoStamp(Boolean addDemoStamp) {
    this.addDemoStamp = addDemoStamp;
  }

  public DisplayApplianceEnvelope allowMultipleAttachments(Boolean allowMultipleAttachments) {
    this.allowMultipleAttachments = allowMultipleAttachments;
    return this;
  }

  /** @return allowMultipleAttachments */
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowMultipleAttachments() {
    return allowMultipleAttachments;
  }

  public void setAllowMultipleAttachments(Boolean allowMultipleAttachments) {
    this.allowMultipleAttachments = allowMultipleAttachments;
  }

  public DisplayApplianceEnvelope burnDefaultTabData(Boolean burnDefaultTabData) {
    this.burnDefaultTabData = burnDefaultTabData;
    return this;
  }

  /** @return burnDefaultTabData */
  @ApiModelProperty(example = "null", value = "")
  public Boolean getBurnDefaultTabData() {
    return burnDefaultTabData;
  }

  public void setBurnDefaultTabData(Boolean burnDefaultTabData) {
    this.burnDefaultTabData = burnDefaultTabData;
  }

  public DisplayApplianceEnvelope convertPdfFields(Boolean convertPdfFields) {
    this.convertPdfFields = convertPdfFields;
    return this;
  }

  /** @return convertPdfFields */
  @ApiModelProperty(example = "null", value = "")
  public Boolean getConvertPdfFields() {
    return convertPdfFields;
  }

  public void setConvertPdfFields(Boolean convertPdfFields) {
    this.convertPdfFields = convertPdfFields;
  }

  public DisplayApplianceEnvelope envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post.
   *
   * @return envelopeId
   */
  @ApiModelProperty(
      example = "null",
      value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public DisplayApplianceEnvelope envelopeType(String envelopeType) {
    this.envelopeType = envelopeType;
    return this;
  }

  /** @return envelopeType */
  @ApiModelProperty(example = "null", value = "")
  public String getEnvelopeType() {
    return envelopeType;
  }

  public void setEnvelopeType(String envelopeType) {
    this.envelopeType = envelopeType;
  }

  public DisplayApplianceEnvelope includeSigsBeforeComplete(Boolean includeSigsBeforeComplete) {
    this.includeSigsBeforeComplete = includeSigsBeforeComplete;
    return this;
  }

  /** @return includeSigsBeforeComplete */
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIncludeSigsBeforeComplete() {
    return includeSigsBeforeComplete;
  }

  public void setIncludeSigsBeforeComplete(Boolean includeSigsBeforeComplete) {
    this.includeSigsBeforeComplete = includeSigsBeforeComplete;
  }

  public DisplayApplianceEnvelope isConcatMode(Boolean isConcatMode) {
    this.isConcatMode = isConcatMode;
    return this;
  }

  /** @return isConcatMode */
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsConcatMode() {
    return isConcatMode;
  }

  public void setIsConcatMode(Boolean isConcatMode) {
    this.isConcatMode = isConcatMode;
  }

  public DisplayApplianceEnvelope isEnvelopeIDStampingEnabled(Boolean isEnvelopeIDStampingEnabled) {
    this.isEnvelopeIDStampingEnabled = isEnvelopeIDStampingEnabled;
    return this;
  }

  /** @return isEnvelopeIDStampingEnabled */
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsEnvelopeIDStampingEnabled() {
    return isEnvelopeIDStampingEnabled;
  }

  public void setIsEnvelopeIDStampingEnabled(Boolean isEnvelopeIDStampingEnabled) {
    this.isEnvelopeIDStampingEnabled = isEnvelopeIDStampingEnabled;
  }

  public DisplayApplianceEnvelope pdfFormConversionFontScale100(
      Boolean pdfFormConversionFontScale100) {
    this.pdfFormConversionFontScale100 = pdfFormConversionFontScale100;
    return this;
  }

  /** @return pdfFormConversionFontScale100 */
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPdfFormConversionFontScale100() {
    return pdfFormConversionFontScale100;
  }

  public void setPdfFormConversionFontScale100(Boolean pdfFormConversionFontScale100) {
    this.pdfFormConversionFontScale100 = pdfFormConversionFontScale100;
  }

  public DisplayApplianceEnvelope shouldFlatten(Boolean shouldFlatten) {
    this.shouldFlatten = shouldFlatten;
    return this;
  }

  /** @return shouldFlatten */
  @ApiModelProperty(example = "null", value = "")
  public Boolean getShouldFlatten() {
    return shouldFlatten;
  }

  public void setShouldFlatten(Boolean shouldFlatten) {
    this.shouldFlatten = shouldFlatten;
  }

  public DisplayApplianceEnvelope showEnvelopeChanges(Boolean showEnvelopeChanges) {
    this.showEnvelopeChanges = showEnvelopeChanges;
    return this;
  }

  /** @return showEnvelopeChanges */
  @ApiModelProperty(example = "null", value = "")
  public Boolean getShowEnvelopeChanges() {
    return showEnvelopeChanges;
  }

  public void setShowEnvelopeChanges(Boolean showEnvelopeChanges) {
    this.showEnvelopeChanges = showEnvelopeChanges;
  }

  public DisplayApplianceEnvelope signOnline(Boolean signOnline) {
    this.signOnline = signOnline;
    return this;
  }

  /** @return signOnline */
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSignOnline() {
    return signOnline;
  }

  public void setSignOnline(Boolean signOnline) {
    this.signOnline = signOnline;
  }

  public DisplayApplianceEnvelope status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are: * sent - The envelope is sent to the
   * recipients. * created - The envelope is saved as a draft and can be modified and sent later.
   *
   * @return status
   */
  @ApiModelProperty(
      example = "null",
      value =
          "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DisplayApplianceEnvelope userId(String userId) {
    this.userId = userId;
    return this;
  }

  /** @return userId */
  @ApiModelProperty(example = "null", value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayApplianceEnvelope displayApplianceEnvelope = (DisplayApplianceEnvelope) o;
    return Objects.equals(this.addDemoStamp, displayApplianceEnvelope.addDemoStamp)
        && Objects.equals(
            this.allowMultipleAttachments, displayApplianceEnvelope.allowMultipleAttachments)
        && Objects.equals(this.burnDefaultTabData, displayApplianceEnvelope.burnDefaultTabData)
        && Objects.equals(this.convertPdfFields, displayApplianceEnvelope.convertPdfFields)
        && Objects.equals(this.envelopeId, displayApplianceEnvelope.envelopeId)
        && Objects.equals(this.envelopeType, displayApplianceEnvelope.envelopeType)
        && Objects.equals(
            this.includeSigsBeforeComplete, displayApplianceEnvelope.includeSigsBeforeComplete)
        && Objects.equals(this.isConcatMode, displayApplianceEnvelope.isConcatMode)
        && Objects.equals(
            this.isEnvelopeIDStampingEnabled, displayApplianceEnvelope.isEnvelopeIDStampingEnabled)
        && Objects.equals(
            this.pdfFormConversionFontScale100,
            displayApplianceEnvelope.pdfFormConversionFontScale100)
        && Objects.equals(this.shouldFlatten, displayApplianceEnvelope.shouldFlatten)
        && Objects.equals(this.showEnvelopeChanges, displayApplianceEnvelope.showEnvelopeChanges)
        && Objects.equals(this.signOnline, displayApplianceEnvelope.signOnline)
        && Objects.equals(this.status, displayApplianceEnvelope.status)
        && Objects.equals(this.userId, displayApplianceEnvelope.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        addDemoStamp,
        allowMultipleAttachments,
        burnDefaultTabData,
        convertPdfFields,
        envelopeId,
        envelopeType,
        includeSigsBeforeComplete,
        isConcatMode,
        isEnvelopeIDStampingEnabled,
        pdfFormConversionFontScale100,
        shouldFlatten,
        showEnvelopeChanges,
        signOnline,
        status,
        userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayApplianceEnvelope {\n");

    sb.append("    addDemoStamp: ").append(toIndentedString(addDemoStamp)).append("\n");
    sb.append("    allowMultipleAttachments: ")
        .append(toIndentedString(allowMultipleAttachments))
        .append("\n");
    sb.append("    burnDefaultTabData: ").append(toIndentedString(burnDefaultTabData)).append("\n");
    sb.append("    convertPdfFields: ").append(toIndentedString(convertPdfFields)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeType: ").append(toIndentedString(envelopeType)).append("\n");
    sb.append("    includeSigsBeforeComplete: ")
        .append(toIndentedString(includeSigsBeforeComplete))
        .append("\n");
    sb.append("    isConcatMode: ").append(toIndentedString(isConcatMode)).append("\n");
    sb.append("    isEnvelopeIDStampingEnabled: ")
        .append(toIndentedString(isEnvelopeIDStampingEnabled))
        .append("\n");
    sb.append("    pdfFormConversionFontScale100: ")
        .append(toIndentedString(pdfFormConversionFontScale100))
        .append("\n");
    sb.append("    shouldFlatten: ").append(toIndentedString(shouldFlatten)).append("\n");
    sb.append("    showEnvelopeChanges: ")
        .append(toIndentedString(showEnvelopeChanges))
        .append("\n");
    sb.append("    signOnline: ").append(toIndentedString(signOnline)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
