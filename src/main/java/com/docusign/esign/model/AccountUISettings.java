package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountUISettings
 */

public class AccountUISettings {
  @JsonProperty("enableEasySignCanUseMultiTemplateApply")
  private String enableEasySignCanUseMultiTemplateApply = null;

  @JsonProperty("enableEasySignCanUseMultiTemplateApplyMetadata")
  private SettingsMetadata enableEasySignCanUseMultiTemplateApplyMetadata = null;

  @JsonProperty("enableEasySignTemplateUpload")
  private String enableEasySignTemplateUpload = null;

  @JsonProperty("enableEasySignTemplateUploadMetadata")
  private SettingsMetadata enableEasySignTemplateUploadMetadata = null;

  @JsonProperty("hideSendAnEnvelope")
  private String hideSendAnEnvelope = null;

  @JsonProperty("hideSendAnEnvelopeMetadata")
  private SettingsMetadata hideSendAnEnvelopeMetadata = null;

  @JsonProperty("hideUseATemplate")
  private String hideUseATemplate = null;

  @JsonProperty("hideUseATemplateInPrepare")
  private String hideUseATemplateInPrepare = null;

  @JsonProperty("hideUseATemplateInPrepareMetadata")
  private SettingsMetadata hideUseATemplateInPrepareMetadata = null;

  @JsonProperty("hideUseATemplateMetadata")
  private SettingsMetadata hideUseATemplateMetadata = null;

  @JsonProperty("orderBasedRecipientIdGeneration")
  private String orderBasedRecipientIdGeneration = null;

  @JsonProperty("orderBasedRecipientIdGenerationMetadata")
  private SettingsMetadata orderBasedRecipientIdGenerationMetadata = null;

  @JsonProperty("removeEnvelopeForwarding")
  private String removeEnvelopeForwarding = null;

  @JsonProperty("removeEnvelopeForwardingMetadata")
  private SettingsMetadata removeEnvelopeForwardingMetadata = null;

  @JsonProperty("shouldRedactAccessCode")
  private String shouldRedactAccessCode = null;

  @JsonProperty("shouldRedactAccessCodeMetadata")
  private SettingsMetadata shouldRedactAccessCodeMetadata = null;

  public AccountUISettings enableEasySignCanUseMultiTemplateApply(String enableEasySignCanUseMultiTemplateApply) {
    this.enableEasySignCanUseMultiTemplateApply = enableEasySignCanUseMultiTemplateApply;
    return this;
  }

   /**
   * 
   * @return enableEasySignCanUseMultiTemplateApply
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnableEasySignCanUseMultiTemplateApply() {
    return enableEasySignCanUseMultiTemplateApply;
  }

  public void setEnableEasySignCanUseMultiTemplateApply(String enableEasySignCanUseMultiTemplateApply) {
    this.enableEasySignCanUseMultiTemplateApply = enableEasySignCanUseMultiTemplateApply;
  }

  public AccountUISettings enableEasySignCanUseMultiTemplateApplyMetadata(SettingsMetadata enableEasySignCanUseMultiTemplateApplyMetadata) {
    this.enableEasySignCanUseMultiTemplateApplyMetadata = enableEasySignCanUseMultiTemplateApplyMetadata;
    return this;
  }

   /**
   * Get enableEasySignCanUseMultiTemplateApplyMetadata
   * @return enableEasySignCanUseMultiTemplateApplyMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getEnableEasySignCanUseMultiTemplateApplyMetadata() {
    return enableEasySignCanUseMultiTemplateApplyMetadata;
  }

  public void setEnableEasySignCanUseMultiTemplateApplyMetadata(SettingsMetadata enableEasySignCanUseMultiTemplateApplyMetadata) {
    this.enableEasySignCanUseMultiTemplateApplyMetadata = enableEasySignCanUseMultiTemplateApplyMetadata;
  }

  public AccountUISettings enableEasySignTemplateUpload(String enableEasySignTemplateUpload) {
    this.enableEasySignTemplateUpload = enableEasySignTemplateUpload;
    return this;
  }

   /**
   * 
   * @return enableEasySignTemplateUpload
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnableEasySignTemplateUpload() {
    return enableEasySignTemplateUpload;
  }

  public void setEnableEasySignTemplateUpload(String enableEasySignTemplateUpload) {
    this.enableEasySignTemplateUpload = enableEasySignTemplateUpload;
  }

  public AccountUISettings enableEasySignTemplateUploadMetadata(SettingsMetadata enableEasySignTemplateUploadMetadata) {
    this.enableEasySignTemplateUploadMetadata = enableEasySignTemplateUploadMetadata;
    return this;
  }

   /**
   * Get enableEasySignTemplateUploadMetadata
   * @return enableEasySignTemplateUploadMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getEnableEasySignTemplateUploadMetadata() {
    return enableEasySignTemplateUploadMetadata;
  }

  public void setEnableEasySignTemplateUploadMetadata(SettingsMetadata enableEasySignTemplateUploadMetadata) {
    this.enableEasySignTemplateUploadMetadata = enableEasySignTemplateUploadMetadata;
  }

  public AccountUISettings hideSendAnEnvelope(String hideSendAnEnvelope) {
    this.hideSendAnEnvelope = hideSendAnEnvelope;
    return this;
  }

   /**
   * 
   * @return hideSendAnEnvelope
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHideSendAnEnvelope() {
    return hideSendAnEnvelope;
  }

  public void setHideSendAnEnvelope(String hideSendAnEnvelope) {
    this.hideSendAnEnvelope = hideSendAnEnvelope;
  }

  public AccountUISettings hideSendAnEnvelopeMetadata(SettingsMetadata hideSendAnEnvelopeMetadata) {
    this.hideSendAnEnvelopeMetadata = hideSendAnEnvelopeMetadata;
    return this;
  }

   /**
   * Get hideSendAnEnvelopeMetadata
   * @return hideSendAnEnvelopeMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getHideSendAnEnvelopeMetadata() {
    return hideSendAnEnvelopeMetadata;
  }

  public void setHideSendAnEnvelopeMetadata(SettingsMetadata hideSendAnEnvelopeMetadata) {
    this.hideSendAnEnvelopeMetadata = hideSendAnEnvelopeMetadata;
  }

  public AccountUISettings hideUseATemplate(String hideUseATemplate) {
    this.hideUseATemplate = hideUseATemplate;
    return this;
  }

   /**
   * 
   * @return hideUseATemplate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHideUseATemplate() {
    return hideUseATemplate;
  }

  public void setHideUseATemplate(String hideUseATemplate) {
    this.hideUseATemplate = hideUseATemplate;
  }

  public AccountUISettings hideUseATemplateInPrepare(String hideUseATemplateInPrepare) {
    this.hideUseATemplateInPrepare = hideUseATemplateInPrepare;
    return this;
  }

   /**
   * 
   * @return hideUseATemplateInPrepare
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHideUseATemplateInPrepare() {
    return hideUseATemplateInPrepare;
  }

  public void setHideUseATemplateInPrepare(String hideUseATemplateInPrepare) {
    this.hideUseATemplateInPrepare = hideUseATemplateInPrepare;
  }

  public AccountUISettings hideUseATemplateInPrepareMetadata(SettingsMetadata hideUseATemplateInPrepareMetadata) {
    this.hideUseATemplateInPrepareMetadata = hideUseATemplateInPrepareMetadata;
    return this;
  }

   /**
   * Get hideUseATemplateInPrepareMetadata
   * @return hideUseATemplateInPrepareMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getHideUseATemplateInPrepareMetadata() {
    return hideUseATemplateInPrepareMetadata;
  }

  public void setHideUseATemplateInPrepareMetadata(SettingsMetadata hideUseATemplateInPrepareMetadata) {
    this.hideUseATemplateInPrepareMetadata = hideUseATemplateInPrepareMetadata;
  }

  public AccountUISettings hideUseATemplateMetadata(SettingsMetadata hideUseATemplateMetadata) {
    this.hideUseATemplateMetadata = hideUseATemplateMetadata;
    return this;
  }

   /**
   * Get hideUseATemplateMetadata
   * @return hideUseATemplateMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getHideUseATemplateMetadata() {
    return hideUseATemplateMetadata;
  }

  public void setHideUseATemplateMetadata(SettingsMetadata hideUseATemplateMetadata) {
    this.hideUseATemplateMetadata = hideUseATemplateMetadata;
  }

  public AccountUISettings orderBasedRecipientIdGeneration(String orderBasedRecipientIdGeneration) {
    this.orderBasedRecipientIdGeneration = orderBasedRecipientIdGeneration;
    return this;
  }

   /**
   * 
   * @return orderBasedRecipientIdGeneration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrderBasedRecipientIdGeneration() {
    return orderBasedRecipientIdGeneration;
  }

  public void setOrderBasedRecipientIdGeneration(String orderBasedRecipientIdGeneration) {
    this.orderBasedRecipientIdGeneration = orderBasedRecipientIdGeneration;
  }

  public AccountUISettings orderBasedRecipientIdGenerationMetadata(SettingsMetadata orderBasedRecipientIdGenerationMetadata) {
    this.orderBasedRecipientIdGenerationMetadata = orderBasedRecipientIdGenerationMetadata;
    return this;
  }

   /**
   * Get orderBasedRecipientIdGenerationMetadata
   * @return orderBasedRecipientIdGenerationMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getOrderBasedRecipientIdGenerationMetadata() {
    return orderBasedRecipientIdGenerationMetadata;
  }

  public void setOrderBasedRecipientIdGenerationMetadata(SettingsMetadata orderBasedRecipientIdGenerationMetadata) {
    this.orderBasedRecipientIdGenerationMetadata = orderBasedRecipientIdGenerationMetadata;
  }

  public AccountUISettings removeEnvelopeForwarding(String removeEnvelopeForwarding) {
    this.removeEnvelopeForwarding = removeEnvelopeForwarding;
    return this;
  }

   /**
   * 
   * @return removeEnvelopeForwarding
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRemoveEnvelopeForwarding() {
    return removeEnvelopeForwarding;
  }

  public void setRemoveEnvelopeForwarding(String removeEnvelopeForwarding) {
    this.removeEnvelopeForwarding = removeEnvelopeForwarding;
  }

  public AccountUISettings removeEnvelopeForwardingMetadata(SettingsMetadata removeEnvelopeForwardingMetadata) {
    this.removeEnvelopeForwardingMetadata = removeEnvelopeForwardingMetadata;
    return this;
  }

   /**
   * Get removeEnvelopeForwardingMetadata
   * @return removeEnvelopeForwardingMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getRemoveEnvelopeForwardingMetadata() {
    return removeEnvelopeForwardingMetadata;
  }

  public void setRemoveEnvelopeForwardingMetadata(SettingsMetadata removeEnvelopeForwardingMetadata) {
    this.removeEnvelopeForwardingMetadata = removeEnvelopeForwardingMetadata;
  }

  public AccountUISettings shouldRedactAccessCode(String shouldRedactAccessCode) {
    this.shouldRedactAccessCode = shouldRedactAccessCode;
    return this;
  }

   /**
   * 
   * @return shouldRedactAccessCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShouldRedactAccessCode() {
    return shouldRedactAccessCode;
  }

  public void setShouldRedactAccessCode(String shouldRedactAccessCode) {
    this.shouldRedactAccessCode = shouldRedactAccessCode;
  }

  public AccountUISettings shouldRedactAccessCodeMetadata(SettingsMetadata shouldRedactAccessCodeMetadata) {
    this.shouldRedactAccessCodeMetadata = shouldRedactAccessCodeMetadata;
    return this;
  }

   /**
   * Get shouldRedactAccessCodeMetadata
   * @return shouldRedactAccessCodeMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getShouldRedactAccessCodeMetadata() {
    return shouldRedactAccessCodeMetadata;
  }

  public void setShouldRedactAccessCodeMetadata(SettingsMetadata shouldRedactAccessCodeMetadata) {
    this.shouldRedactAccessCodeMetadata = shouldRedactAccessCodeMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUISettings accountUISettings = (AccountUISettings) o;
    return Objects.equals(this.enableEasySignCanUseMultiTemplateApply, accountUISettings.enableEasySignCanUseMultiTemplateApply) &&
        Objects.equals(this.enableEasySignCanUseMultiTemplateApplyMetadata, accountUISettings.enableEasySignCanUseMultiTemplateApplyMetadata) &&
        Objects.equals(this.enableEasySignTemplateUpload, accountUISettings.enableEasySignTemplateUpload) &&
        Objects.equals(this.enableEasySignTemplateUploadMetadata, accountUISettings.enableEasySignTemplateUploadMetadata) &&
        Objects.equals(this.hideSendAnEnvelope, accountUISettings.hideSendAnEnvelope) &&
        Objects.equals(this.hideSendAnEnvelopeMetadata, accountUISettings.hideSendAnEnvelopeMetadata) &&
        Objects.equals(this.hideUseATemplate, accountUISettings.hideUseATemplate) &&
        Objects.equals(this.hideUseATemplateInPrepare, accountUISettings.hideUseATemplateInPrepare) &&
        Objects.equals(this.hideUseATemplateInPrepareMetadata, accountUISettings.hideUseATemplateInPrepareMetadata) &&
        Objects.equals(this.hideUseATemplateMetadata, accountUISettings.hideUseATemplateMetadata) &&
        Objects.equals(this.orderBasedRecipientIdGeneration, accountUISettings.orderBasedRecipientIdGeneration) &&
        Objects.equals(this.orderBasedRecipientIdGenerationMetadata, accountUISettings.orderBasedRecipientIdGenerationMetadata) &&
        Objects.equals(this.removeEnvelopeForwarding, accountUISettings.removeEnvelopeForwarding) &&
        Objects.equals(this.removeEnvelopeForwardingMetadata, accountUISettings.removeEnvelopeForwardingMetadata) &&
        Objects.equals(this.shouldRedactAccessCode, accountUISettings.shouldRedactAccessCode) &&
        Objects.equals(this.shouldRedactAccessCodeMetadata, accountUISettings.shouldRedactAccessCodeMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableEasySignCanUseMultiTemplateApply, enableEasySignCanUseMultiTemplateApplyMetadata, enableEasySignTemplateUpload, enableEasySignTemplateUploadMetadata, hideSendAnEnvelope, hideSendAnEnvelopeMetadata, hideUseATemplate, hideUseATemplateInPrepare, hideUseATemplateInPrepareMetadata, hideUseATemplateMetadata, orderBasedRecipientIdGeneration, orderBasedRecipientIdGenerationMetadata, removeEnvelopeForwarding, removeEnvelopeForwardingMetadata, shouldRedactAccessCode, shouldRedactAccessCodeMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUISettings {\n");
    
    sb.append("    enableEasySignCanUseMultiTemplateApply: ").append(toIndentedString(enableEasySignCanUseMultiTemplateApply)).append("\n");
    sb.append("    enableEasySignCanUseMultiTemplateApplyMetadata: ").append(toIndentedString(enableEasySignCanUseMultiTemplateApplyMetadata)).append("\n");
    sb.append("    enableEasySignTemplateUpload: ").append(toIndentedString(enableEasySignTemplateUpload)).append("\n");
    sb.append("    enableEasySignTemplateUploadMetadata: ").append(toIndentedString(enableEasySignTemplateUploadMetadata)).append("\n");
    sb.append("    hideSendAnEnvelope: ").append(toIndentedString(hideSendAnEnvelope)).append("\n");
    sb.append("    hideSendAnEnvelopeMetadata: ").append(toIndentedString(hideSendAnEnvelopeMetadata)).append("\n");
    sb.append("    hideUseATemplate: ").append(toIndentedString(hideUseATemplate)).append("\n");
    sb.append("    hideUseATemplateInPrepare: ").append(toIndentedString(hideUseATemplateInPrepare)).append("\n");
    sb.append("    hideUseATemplateInPrepareMetadata: ").append(toIndentedString(hideUseATemplateInPrepareMetadata)).append("\n");
    sb.append("    hideUseATemplateMetadata: ").append(toIndentedString(hideUseATemplateMetadata)).append("\n");
    sb.append("    orderBasedRecipientIdGeneration: ").append(toIndentedString(orderBasedRecipientIdGeneration)).append("\n");
    sb.append("    orderBasedRecipientIdGenerationMetadata: ").append(toIndentedString(orderBasedRecipientIdGenerationMetadata)).append("\n");
    sb.append("    removeEnvelopeForwarding: ").append(toIndentedString(removeEnvelopeForwarding)).append("\n");
    sb.append("    removeEnvelopeForwardingMetadata: ").append(toIndentedString(removeEnvelopeForwardingMetadata)).append("\n");
    sb.append("    shouldRedactAccessCode: ").append(toIndentedString(shouldRedactAccessCode)).append("\n");
    sb.append("    shouldRedactAccessCodeMetadata: ").append(toIndentedString(shouldRedactAccessCodeMetadata)).append("\n");
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

