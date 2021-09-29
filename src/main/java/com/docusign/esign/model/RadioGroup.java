package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Radio;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RadioGroup.
 *
 */

public class RadioGroup {
  @JsonProperty("conditionalParentLabel")
  private String conditionalParentLabel = null;

  @JsonProperty("conditionalParentValue")
  private String conditionalParentValue = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("radios")
  private java.util.List<Radio> radios = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("requireAll")
  private String requireAll = null;

  @JsonProperty("requireInitialOnSharedChange")
  private String requireInitialOnSharedChange = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("tooltip")
  private String tooltip = null;


  /**
   * conditionalParentLabel.
   *
   * @return RadioGroup
   **/
  public RadioGroup conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }

  /**
   * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility..
   * @return conditionalParentLabel
   **/
  @ApiModelProperty(value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }

  /**
   * setConditionalParentLabel.
   **/
  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }


  /**
   * conditionalParentValue.
   *
   * @return RadioGroup
   **/
  public RadioGroup conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }

  /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. .
   * @return conditionalParentValue
   **/
  @ApiModelProperty(value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. ")
  public String getConditionalParentValue() {
    return conditionalParentValue;
  }

  /**
   * setConditionalParentValue.
   **/
  public void setConditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
  }


  /**
   * documentId.
   *
   * @return RadioGroup
   **/
  public RadioGroup documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute..
   * @return documentId
   **/
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  /**
   * setDocumentId.
   **/
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  /**
   * groupName.
   *
   * @return RadioGroup
   **/
  public RadioGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * The name of the group..
   * @return groupName
   **/
  @ApiModelProperty(value = "The name of the group.")
  public String getGroupName() {
    return groupName;
  }

  /**
   * setGroupName.
   **/
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  /**
   * radios.
   *
   * @return RadioGroup
   **/
  public RadioGroup radios(java.util.List<Radio> radios) {
    this.radios = radios;
    return this;
  }
  
  /**
   * addRadiosItem.
   *
   * @return RadioGroup
   **/
  public RadioGroup addRadiosItem(Radio radiosItem) {
    if (this.radios == null) {
      this.radios = new java.util.ArrayList<Radio>();
    }
    this.radios.add(radiosItem);
    return this;
  }

  /**
   * Specifies the locations and status for radio buttons that are grouped together..
   * @return radios
   **/
  @ApiModelProperty(value = "Specifies the locations and status for radio buttons that are grouped together.")
  public java.util.List<Radio> getRadios() {
    return radios;
  }

  /**
   * setRadios.
   **/
  public void setRadios(java.util.List<Radio> radios) {
    this.radios = radios;
  }


  /**
   * recipientId.
   *
   * @return RadioGroup
   **/
  public RadioGroup recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document..
   * @return recipientId
   **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  /**
   * setRecipientId.
   **/
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  /**
   * requireAll.
   *
   * @return RadioGroup
   **/
  public RadioGroup requireAll(String requireAll) {
    this.requireAll = requireAll;
    return this;
  }

  /**
   * When set to **true** and shared is true, information must be entered in this field to complete the envelope. .
   * @return requireAll
   **/
  @ApiModelProperty(value = "When set to **true** and shared is true, information must be entered in this field to complete the envelope. ")
  public String getRequireAll() {
    return requireAll;
  }

  /**
   * setRequireAll.
   **/
  public void setRequireAll(String requireAll) {
    this.requireAll = requireAll;
  }


  /**
   * requireInitialOnSharedChange.
   *
   * @return RadioGroup
   **/
  public RadioGroup requireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
    return this;
  }

  /**
   * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field..
   * @return requireInitialOnSharedChange
   **/
  @ApiModelProperty(value = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
  public String getRequireInitialOnSharedChange() {
    return requireInitialOnSharedChange;
  }

  /**
   * setRequireInitialOnSharedChange.
   **/
  public void setRequireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
  }


  /**
   * shared.
   *
   * @return RadioGroup
   **/
  public RadioGroup shared(String shared) {
    this.shared = shared;
    return this;
  }

  /**
   * When set to **true**, this custom tab is shared..
   * @return shared
   **/
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  /**
   * setShared.
   **/
  public void setShared(String shared) {
    this.shared = shared;
  }


  /**
   * templateLocked.
   *
   * @return RadioGroup
   **/
  public RadioGroup templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. .
   * @return templateLocked
   **/
  @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  /**
   * setTemplateLocked.
   **/
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }


  /**
   * templateRequired.
   *
   * @return RadioGroup
   **/
  public RadioGroup templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients..
   * @return templateRequired
   **/
  @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  /**
   * setTemplateRequired.
   **/
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }


  /**
   * tooltip.
   *
   * @return RadioGroup
   **/
  public RadioGroup tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  /**
   * .
   * @return tooltip
   **/
  @ApiModelProperty(value = "")
  public String getTooltip() {
    return tooltip;
  }

  /**
   * setTooltip.
   **/
  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
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
    RadioGroup radioGroup = (RadioGroup) o;
    return Objects.equals(this.conditionalParentLabel, radioGroup.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentValue, radioGroup.conditionalParentValue) &&
        Objects.equals(this.documentId, radioGroup.documentId) &&
        Objects.equals(this.groupName, radioGroup.groupName) &&
        Objects.equals(this.radios, radioGroup.radios) &&
        Objects.equals(this.recipientId, radioGroup.recipientId) &&
        Objects.equals(this.requireAll, radioGroup.requireAll) &&
        Objects.equals(this.requireInitialOnSharedChange, radioGroup.requireInitialOnSharedChange) &&
        Objects.equals(this.shared, radioGroup.shared) &&
        Objects.equals(this.templateLocked, radioGroup.templateLocked) &&
        Objects.equals(this.templateRequired, radioGroup.templateRequired) &&
        Objects.equals(this.tooltip, radioGroup.tooltip);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(conditionalParentLabel, conditionalParentValue, documentId, groupName, radios, recipientId, requireAll, requireInitialOnSharedChange, shared, templateLocked, templateRequired, tooltip);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadioGroup {\n");
    
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    radios: ").append(toIndentedString(radios)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    requireAll: ").append(toIndentedString(requireAll)).append("\n");
    sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
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

