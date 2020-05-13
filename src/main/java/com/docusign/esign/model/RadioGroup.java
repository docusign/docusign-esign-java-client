package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.Radio;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RadioGroup
 */

public class RadioGroup {
  @JsonProperty("conditionalParentLabel")
  private String conditionalParentLabel = null;

  @JsonProperty("conditionalParentLabelMetadata")
  private PropertyMetadata conditionalParentLabelMetadata = null;

  @JsonProperty("conditionalParentValue")
  private String conditionalParentValue = null;

  @JsonProperty("conditionalParentValueMetadata")
  private PropertyMetadata conditionalParentValueMetadata = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentIdMetadata")
  private PropertyMetadata documentIdMetadata = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("groupNameMetadata")
  private PropertyMetadata groupNameMetadata = null;

  @JsonProperty("radios")
  private java.util.List<Radio> radios = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdGuid")
  private String recipientIdGuid = null;

  @JsonProperty("recipientIdGuidMetadata")
  private PropertyMetadata recipientIdGuidMetadata = null;

  @JsonProperty("recipientIdMetadata")
  private PropertyMetadata recipientIdMetadata = null;

  @JsonProperty("requireAll")
  private String requireAll = null;

  @JsonProperty("requireAllMetadata")
  private PropertyMetadata requireAllMetadata = null;

  @JsonProperty("requireInitialOnSharedChange")
  private String requireInitialOnSharedChange = null;

  @JsonProperty("requireInitialOnSharedChangeMetadata")
  private PropertyMetadata requireInitialOnSharedChangeMetadata = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("sharedMetadata")
  private PropertyMetadata sharedMetadata = null;

  @JsonProperty("tabType")
  private String tabType = null;

  @JsonProperty("tabTypeMetadata")
  private PropertyMetadata tabTypeMetadata = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateLockedMetadata")
  private PropertyMetadata templateLockedMetadata = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("templateRequiredMetadata")
  private PropertyMetadata templateRequiredMetadata = null;

  @JsonProperty("tooltip")
  private String tooltip = null;

  @JsonProperty("tooltipMetadata")
  private PropertyMetadata tooltipMetadata = null;

  public RadioGroup conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }

   /**
   * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.
   * @return conditionalParentLabel
  **/
  @ApiModelProperty(value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }

  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  public RadioGroup conditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
    return this;
  }

   /**
   * Get conditionalParentLabelMetadata
   * @return conditionalParentLabelMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getConditionalParentLabelMetadata() {
    return conditionalParentLabelMetadata;
  }

  public void setConditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
  }

  public RadioGroup conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }

   /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. 
   * @return conditionalParentValue
  **/
  @ApiModelProperty(value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. ")
  public String getConditionalParentValue() {
    return conditionalParentValue;
  }

  public void setConditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
  }

  public RadioGroup conditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
    return this;
  }

   /**
   * Get conditionalParentValueMetadata
   * @return conditionalParentValueMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getConditionalParentValueMetadata() {
    return conditionalParentValueMetadata;
  }

  public void setConditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
  }

  public RadioGroup documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   * @return documentId
  **/
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public RadioGroup documentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
    return this;
  }

   /**
   * Get documentIdMetadata
   * @return documentIdMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getDocumentIdMetadata() {
    return documentIdMetadata;
  }

  public void setDocumentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
  }

  public RadioGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * The name of the group.
   * @return groupName
  **/
  @ApiModelProperty(value = "The name of the group.")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public RadioGroup groupNameMetadata(PropertyMetadata groupNameMetadata) {
    this.groupNameMetadata = groupNameMetadata;
    return this;
  }

   /**
   * Get groupNameMetadata
   * @return groupNameMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getGroupNameMetadata() {
    return groupNameMetadata;
  }

  public void setGroupNameMetadata(PropertyMetadata groupNameMetadata) {
    this.groupNameMetadata = groupNameMetadata;
  }

  public RadioGroup radios(java.util.List<Radio> radios) {
    this.radios = radios;
    return this;
  }

  public RadioGroup addRadiosItem(Radio radiosItem) {
    if (this.radios == null) {
      this.radios = new java.util.ArrayList<Radio>();
    }
    this.radios.add(radiosItem);
    return this;
  }

   /**
   * Specifies the locations and status for radio buttons that are grouped together.
   * @return radios
  **/
  @ApiModelProperty(value = "Specifies the locations and status for radio buttons that are grouped together.")
  public java.util.List<Radio> getRadios() {
    return radios;
  }

  public void setRadios(java.util.List<Radio> radios) {
    this.radios = radios;
  }

  public RadioGroup recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public RadioGroup recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

   /**
   * 
   * @return recipientIdGuid
  **/
  @ApiModelProperty(value = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  public RadioGroup recipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
    return this;
  }

   /**
   * Get recipientIdGuidMetadata
   * @return recipientIdGuidMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getRecipientIdGuidMetadata() {
    return recipientIdGuidMetadata;
  }

  public void setRecipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
  }

  public RadioGroup recipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
    return this;
  }

   /**
   * Get recipientIdMetadata
   * @return recipientIdMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getRecipientIdMetadata() {
    return recipientIdMetadata;
  }

  public void setRecipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
  }

  public RadioGroup requireAll(String requireAll) {
    this.requireAll = requireAll;
    return this;
  }

   /**
   * When set to **true** and shared is true, information must be entered in this field to complete the envelope. 
   * @return requireAll
  **/
  @ApiModelProperty(value = "When set to **true** and shared is true, information must be entered in this field to complete the envelope. ")
  public String getRequireAll() {
    return requireAll;
  }

  public void setRequireAll(String requireAll) {
    this.requireAll = requireAll;
  }

  public RadioGroup requireAllMetadata(PropertyMetadata requireAllMetadata) {
    this.requireAllMetadata = requireAllMetadata;
    return this;
  }

   /**
   * Get requireAllMetadata
   * @return requireAllMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getRequireAllMetadata() {
    return requireAllMetadata;
  }

  public void setRequireAllMetadata(PropertyMetadata requireAllMetadata) {
    this.requireAllMetadata = requireAllMetadata;
  }

  public RadioGroup requireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
    return this;
  }

   /**
   * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.
   * @return requireInitialOnSharedChange
  **/
  @ApiModelProperty(value = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
  public String getRequireInitialOnSharedChange() {
    return requireInitialOnSharedChange;
  }

  public void setRequireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
  }

  public RadioGroup requireInitialOnSharedChangeMetadata(PropertyMetadata requireInitialOnSharedChangeMetadata) {
    this.requireInitialOnSharedChangeMetadata = requireInitialOnSharedChangeMetadata;
    return this;
  }

   /**
   * Get requireInitialOnSharedChangeMetadata
   * @return requireInitialOnSharedChangeMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getRequireInitialOnSharedChangeMetadata() {
    return requireInitialOnSharedChangeMetadata;
  }

  public void setRequireInitialOnSharedChangeMetadata(PropertyMetadata requireInitialOnSharedChangeMetadata) {
    this.requireInitialOnSharedChangeMetadata = requireInitialOnSharedChangeMetadata;
  }

  public RadioGroup shared(String shared) {
    this.shared = shared;
    return this;
  }

   /**
   * When set to **true**, this custom tab is shared.
   * @return shared
  **/
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  public void setShared(String shared) {
    this.shared = shared;
  }

  public RadioGroup sharedMetadata(PropertyMetadata sharedMetadata) {
    this.sharedMetadata = sharedMetadata;
    return this;
  }

   /**
   * Get sharedMetadata
   * @return sharedMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getSharedMetadata() {
    return sharedMetadata;
  }

  public void setSharedMetadata(PropertyMetadata sharedMetadata) {
    this.sharedMetadata = sharedMetadata;
  }

  public RadioGroup tabType(String tabType) {
    this.tabType = tabType;
    return this;
  }

   /**
   * 
   * @return tabType
  **/
  @ApiModelProperty(value = "")
  public String getTabType() {
    return tabType;
  }

  public void setTabType(String tabType) {
    this.tabType = tabType;
  }

  public RadioGroup tabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
    return this;
  }

   /**
   * Get tabTypeMetadata
   * @return tabTypeMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabTypeMetadata() {
    return tabTypeMetadata;
  }

  public void setTabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
  }

  public RadioGroup templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

   /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. 
   * @return templateLocked
  **/
  @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  public RadioGroup templateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
    return this;
  }

   /**
   * Get templateLockedMetadata
   * @return templateLockedMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getTemplateLockedMetadata() {
    return templateLockedMetadata;
  }

  public void setTemplateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
  }

  public RadioGroup templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

   /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   * @return templateRequired
  **/
  @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  public RadioGroup templateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
    return this;
  }

   /**
   * Get templateRequiredMetadata
   * @return templateRequiredMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getTemplateRequiredMetadata() {
    return templateRequiredMetadata;
  }

  public void setTemplateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
  }

  public RadioGroup tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

   /**
   * 
   * @return tooltip
  **/
  @ApiModelProperty(value = "")
  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public RadioGroup tooltipMetadata(PropertyMetadata tooltipMetadata) {
    this.tooltipMetadata = tooltipMetadata;
    return this;
  }

   /**
   * Get tooltipMetadata
   * @return tooltipMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getTooltipMetadata() {
    return tooltipMetadata;
  }

  public void setTooltipMetadata(PropertyMetadata tooltipMetadata) {
    this.tooltipMetadata = tooltipMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadioGroup radioGroup = (RadioGroup) o;
    return Objects.equals(this.conditionalParentLabel, radioGroup.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentLabelMetadata, radioGroup.conditionalParentLabelMetadata) &&
        Objects.equals(this.conditionalParentValue, radioGroup.conditionalParentValue) &&
        Objects.equals(this.conditionalParentValueMetadata, radioGroup.conditionalParentValueMetadata) &&
        Objects.equals(this.documentId, radioGroup.documentId) &&
        Objects.equals(this.documentIdMetadata, radioGroup.documentIdMetadata) &&
        Objects.equals(this.groupName, radioGroup.groupName) &&
        Objects.equals(this.groupNameMetadata, radioGroup.groupNameMetadata) &&
        Objects.equals(this.radios, radioGroup.radios) &&
        Objects.equals(this.recipientId, radioGroup.recipientId) &&
        Objects.equals(this.recipientIdGuid, radioGroup.recipientIdGuid) &&
        Objects.equals(this.recipientIdGuidMetadata, radioGroup.recipientIdGuidMetadata) &&
        Objects.equals(this.recipientIdMetadata, radioGroup.recipientIdMetadata) &&
        Objects.equals(this.requireAll, radioGroup.requireAll) &&
        Objects.equals(this.requireAllMetadata, radioGroup.requireAllMetadata) &&
        Objects.equals(this.requireInitialOnSharedChange, radioGroup.requireInitialOnSharedChange) &&
        Objects.equals(this.requireInitialOnSharedChangeMetadata, radioGroup.requireInitialOnSharedChangeMetadata) &&
        Objects.equals(this.shared, radioGroup.shared) &&
        Objects.equals(this.sharedMetadata, radioGroup.sharedMetadata) &&
        Objects.equals(this.tabType, radioGroup.tabType) &&
        Objects.equals(this.tabTypeMetadata, radioGroup.tabTypeMetadata) &&
        Objects.equals(this.templateLocked, radioGroup.templateLocked) &&
        Objects.equals(this.templateLockedMetadata, radioGroup.templateLockedMetadata) &&
        Objects.equals(this.templateRequired, radioGroup.templateRequired) &&
        Objects.equals(this.templateRequiredMetadata, radioGroup.templateRequiredMetadata) &&
        Objects.equals(this.tooltip, radioGroup.tooltip) &&
        Objects.equals(this.tooltipMetadata, radioGroup.tooltipMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalParentLabel, conditionalParentLabelMetadata, conditionalParentValue, conditionalParentValueMetadata, documentId, documentIdMetadata, groupName, groupNameMetadata, radios, recipientId, recipientIdGuid, recipientIdGuidMetadata, recipientIdMetadata, requireAll, requireAllMetadata, requireInitialOnSharedChange, requireInitialOnSharedChangeMetadata, shared, sharedMetadata, tabType, tabTypeMetadata, templateLocked, templateLockedMetadata, templateRequired, templateRequiredMetadata, tooltip, tooltipMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadioGroup {\n");
    
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentLabelMetadata: ").append(toIndentedString(conditionalParentLabelMetadata)).append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    conditionalParentValueMetadata: ").append(toIndentedString(conditionalParentValueMetadata)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentIdMetadata: ").append(toIndentedString(documentIdMetadata)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupNameMetadata: ").append(toIndentedString(groupNameMetadata)).append("\n");
    sb.append("    radios: ").append(toIndentedString(radios)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    recipientIdGuidMetadata: ").append(toIndentedString(recipientIdGuidMetadata)).append("\n");
    sb.append("    recipientIdMetadata: ").append(toIndentedString(recipientIdMetadata)).append("\n");
    sb.append("    requireAll: ").append(toIndentedString(requireAll)).append("\n");
    sb.append("    requireAllMetadata: ").append(toIndentedString(requireAllMetadata)).append("\n");
    sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
    sb.append("    requireInitialOnSharedChangeMetadata: ").append(toIndentedString(requireInitialOnSharedChangeMetadata)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    sharedMetadata: ").append(toIndentedString(sharedMetadata)).append("\n");
    sb.append("    tabType: ").append(toIndentedString(tabType)).append("\n");
    sb.append("    tabTypeMetadata: ").append(toIndentedString(tabTypeMetadata)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateLockedMetadata: ").append(toIndentedString(templateLockedMetadata)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    templateRequiredMetadata: ").append(toIndentedString(templateRequiredMetadata)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    tooltipMetadata: ").append(toIndentedString(tooltipMetadata)).append("\n");
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

