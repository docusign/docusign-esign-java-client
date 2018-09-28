package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TabGroup
 */

public class TabGroup {
  @JsonProperty("childTabLabels")
  private java.util.List<String> childTabLabels = new java.util.ArrayList<String>();

  @JsonProperty("childTabLabelsMetadata")
  private PropertyMetadata childTabLabelsMetadata = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("groupLabel")
  private String groupLabel = null;

  @JsonProperty("groupLabelMetadata")
  private PropertyMetadata groupLabelMetadata = null;

  @JsonProperty("groupRule")
  private String groupRule = null;

  @JsonProperty("groupRuleMetadata")
  private PropertyMetadata groupRuleMetadata = null;

  @JsonProperty("maximumAllowed")
  private String maximumAllowed = null;

  @JsonProperty("maximumAllowedMetadata")
  private PropertyMetadata maximumAllowedMetadata = null;

  @JsonProperty("minimumRequired")
  private String minimumRequired = null;

  @JsonProperty("minimumRequiredMetadata")
  private PropertyMetadata minimumRequiredMetadata = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdMetadata")
  private PropertyMetadata recipientIdMetadata = null;

  @JsonProperty("tabId")
  private String tabId = null;

  @JsonProperty("tabIdMetadata")
  private PropertyMetadata tabIdMetadata = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateLockedMetadata")
  private PropertyMetadata templateLockedMetadata = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("templateRequiredMetadata")
  private PropertyMetadata templateRequiredMetadata = null;

  @JsonProperty("validationMessage")
  private String validationMessage = null;

  @JsonProperty("validationMessageMetadata")
  private PropertyMetadata validationMessageMetadata = null;

  public TabGroup childTabLabels(java.util.List<String> childTabLabels) {
    this.childTabLabels = childTabLabels;
    return this;
  }

  public TabGroup addChildTabLabelsItem(String childTabLabelsItem) {
    this.childTabLabels.add(childTabLabelsItem);
    return this;
  }

   /**
   * 
   * @return childTabLabels
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getChildTabLabels() {
    return childTabLabels;
  }

  public void setChildTabLabels(java.util.List<String> childTabLabels) {
    this.childTabLabels = childTabLabels;
  }

  public TabGroup childTabLabelsMetadata(PropertyMetadata childTabLabelsMetadata) {
    this.childTabLabelsMetadata = childTabLabelsMetadata;
    return this;
  }

   /**
   * Get childTabLabelsMetadata
   * @return childTabLabelsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getChildTabLabelsMetadata() {
    return childTabLabelsMetadata;
  }

  public void setChildTabLabelsMetadata(PropertyMetadata childTabLabelsMetadata) {
    this.childTabLabelsMetadata = childTabLabelsMetadata;
  }

  public TabGroup errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public TabGroup groupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
    return this;
  }

   /**
   * 
   * @return groupLabel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupLabel() {
    return groupLabel;
  }

  public void setGroupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
  }

  public TabGroup groupLabelMetadata(PropertyMetadata groupLabelMetadata) {
    this.groupLabelMetadata = groupLabelMetadata;
    return this;
  }

   /**
   * Get groupLabelMetadata
   * @return groupLabelMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getGroupLabelMetadata() {
    return groupLabelMetadata;
  }

  public void setGroupLabelMetadata(PropertyMetadata groupLabelMetadata) {
    this.groupLabelMetadata = groupLabelMetadata;
  }

  public TabGroup groupRule(String groupRule) {
    this.groupRule = groupRule;
    return this;
  }

   /**
   * 
   * @return groupRule
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupRule() {
    return groupRule;
  }

  public void setGroupRule(String groupRule) {
    this.groupRule = groupRule;
  }

  public TabGroup groupRuleMetadata(PropertyMetadata groupRuleMetadata) {
    this.groupRuleMetadata = groupRuleMetadata;
    return this;
  }

   /**
   * Get groupRuleMetadata
   * @return groupRuleMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getGroupRuleMetadata() {
    return groupRuleMetadata;
  }

  public void setGroupRuleMetadata(PropertyMetadata groupRuleMetadata) {
    this.groupRuleMetadata = groupRuleMetadata;
  }

  public TabGroup maximumAllowed(String maximumAllowed) {
    this.maximumAllowed = maximumAllowed;
    return this;
  }

   /**
   * 
   * @return maximumAllowed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaximumAllowed() {
    return maximumAllowed;
  }

  public void setMaximumAllowed(String maximumAllowed) {
    this.maximumAllowed = maximumAllowed;
  }

  public TabGroup maximumAllowedMetadata(PropertyMetadata maximumAllowedMetadata) {
    this.maximumAllowedMetadata = maximumAllowedMetadata;
    return this;
  }

   /**
   * Get maximumAllowedMetadata
   * @return maximumAllowedMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getMaximumAllowedMetadata() {
    return maximumAllowedMetadata;
  }

  public void setMaximumAllowedMetadata(PropertyMetadata maximumAllowedMetadata) {
    this.maximumAllowedMetadata = maximumAllowedMetadata;
  }

  public TabGroup minimumRequired(String minimumRequired) {
    this.minimumRequired = minimumRequired;
    return this;
  }

   /**
   * 
   * @return minimumRequired
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMinimumRequired() {
    return minimumRequired;
  }

  public void setMinimumRequired(String minimumRequired) {
    this.minimumRequired = minimumRequired;
  }

  public TabGroup minimumRequiredMetadata(PropertyMetadata minimumRequiredMetadata) {
    this.minimumRequiredMetadata = minimumRequiredMetadata;
    return this;
  }

   /**
   * Get minimumRequiredMetadata
   * @return minimumRequiredMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getMinimumRequiredMetadata() {
    return minimumRequiredMetadata;
  }

  public void setMinimumRequiredMetadata(PropertyMetadata minimumRequiredMetadata) {
    this.minimumRequiredMetadata = minimumRequiredMetadata;
  }

  public TabGroup recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public TabGroup recipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
    return this;
  }

   /**
   * Get recipientIdMetadata
   * @return recipientIdMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getRecipientIdMetadata() {
    return recipientIdMetadata;
  }

  public void setRecipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
  }

  public TabGroup tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

   /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     
   * @return tabId
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  public void setTabId(String tabId) {
    this.tabId = tabId;
  }

  public TabGroup tabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
    return this;
  }

   /**
   * Get tabIdMetadata
   * @return tabIdMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getTabIdMetadata() {
    return tabIdMetadata;
  }

  public void setTabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
  }

  public TabGroup templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

   /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. 
   * @return templateLocked
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  public TabGroup templateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
    return this;
  }

   /**
   * Get templateLockedMetadata
   * @return templateLockedMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getTemplateLockedMetadata() {
    return templateLockedMetadata;
  }

  public void setTemplateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
  }

  public TabGroup templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

   /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   * @return templateRequired
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  public TabGroup templateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
    return this;
  }

   /**
   * Get templateRequiredMetadata
   * @return templateRequiredMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getTemplateRequiredMetadata() {
    return templateRequiredMetadata;
  }

  public void setTemplateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
  }

  public TabGroup validationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
    return this;
  }

   /**
   * The message displayed if the custom tab fails input validation (either custom of embedded).
   * @return validationMessage
  **/
  @ApiModelProperty(example = "null", value = "The message displayed if the custom tab fails input validation (either custom of embedded).")
  public String getValidationMessage() {
    return validationMessage;
  }

  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }

  public TabGroup validationMessageMetadata(PropertyMetadata validationMessageMetadata) {
    this.validationMessageMetadata = validationMessageMetadata;
    return this;
  }

   /**
   * Get validationMessageMetadata
   * @return validationMessageMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getValidationMessageMetadata() {
    return validationMessageMetadata;
  }

  public void setValidationMessageMetadata(PropertyMetadata validationMessageMetadata) {
    this.validationMessageMetadata = validationMessageMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TabGroup tabGroup = (TabGroup) o;
    return Objects.equals(this.childTabLabels, tabGroup.childTabLabels) &&
        Objects.equals(this.childTabLabelsMetadata, tabGroup.childTabLabelsMetadata) &&
        Objects.equals(this.errorDetails, tabGroup.errorDetails) &&
        Objects.equals(this.groupLabel, tabGroup.groupLabel) &&
        Objects.equals(this.groupLabelMetadata, tabGroup.groupLabelMetadata) &&
        Objects.equals(this.groupRule, tabGroup.groupRule) &&
        Objects.equals(this.groupRuleMetadata, tabGroup.groupRuleMetadata) &&
        Objects.equals(this.maximumAllowed, tabGroup.maximumAllowed) &&
        Objects.equals(this.maximumAllowedMetadata, tabGroup.maximumAllowedMetadata) &&
        Objects.equals(this.minimumRequired, tabGroup.minimumRequired) &&
        Objects.equals(this.minimumRequiredMetadata, tabGroup.minimumRequiredMetadata) &&
        Objects.equals(this.recipientId, tabGroup.recipientId) &&
        Objects.equals(this.recipientIdMetadata, tabGroup.recipientIdMetadata) &&
        Objects.equals(this.tabId, tabGroup.tabId) &&
        Objects.equals(this.tabIdMetadata, tabGroup.tabIdMetadata) &&
        Objects.equals(this.templateLocked, tabGroup.templateLocked) &&
        Objects.equals(this.templateLockedMetadata, tabGroup.templateLockedMetadata) &&
        Objects.equals(this.templateRequired, tabGroup.templateRequired) &&
        Objects.equals(this.templateRequiredMetadata, tabGroup.templateRequiredMetadata) &&
        Objects.equals(this.validationMessage, tabGroup.validationMessage) &&
        Objects.equals(this.validationMessageMetadata, tabGroup.validationMessageMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childTabLabels, childTabLabelsMetadata, errorDetails, groupLabel, groupLabelMetadata, groupRule, groupRuleMetadata, maximumAllowed, maximumAllowedMetadata, minimumRequired, minimumRequiredMetadata, recipientId, recipientIdMetadata, tabId, tabIdMetadata, templateLocked, templateLockedMetadata, templateRequired, templateRequiredMetadata, validationMessage, validationMessageMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabGroup {\n");
    
    sb.append("    childTabLabels: ").append(toIndentedString(childTabLabels)).append("\n");
    sb.append("    childTabLabelsMetadata: ").append(toIndentedString(childTabLabelsMetadata)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    groupLabel: ").append(toIndentedString(groupLabel)).append("\n");
    sb.append("    groupLabelMetadata: ").append(toIndentedString(groupLabelMetadata)).append("\n");
    sb.append("    groupRule: ").append(toIndentedString(groupRule)).append("\n");
    sb.append("    groupRuleMetadata: ").append(toIndentedString(groupRuleMetadata)).append("\n");
    sb.append("    maximumAllowed: ").append(toIndentedString(maximumAllowed)).append("\n");
    sb.append("    maximumAllowedMetadata: ").append(toIndentedString(maximumAllowedMetadata)).append("\n");
    sb.append("    minimumRequired: ").append(toIndentedString(minimumRequired)).append("\n");
    sb.append("    minimumRequiredMetadata: ").append(toIndentedString(minimumRequiredMetadata)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdMetadata: ").append(toIndentedString(recipientIdMetadata)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    tabIdMetadata: ").append(toIndentedString(tabIdMetadata)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateLockedMetadata: ").append(toIndentedString(templateLockedMetadata)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    templateRequiredMetadata: ").append(toIndentedString(templateRequiredMetadata)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    validationMessageMetadata: ").append(toIndentedString(validationMessageMetadata)).append("\n");
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

