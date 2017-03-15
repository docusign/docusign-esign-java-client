package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MergeField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Checkbox   {
  
  private String anchorCaseSensitive = null;
  private String anchorHorizontalAlignment = null;
  private String anchorIgnoreIfNotPresent = null;
  private String anchorMatchWholeWord = null;
  private String anchorString = null;
  private String anchorUnits = null;
  private String anchorXOffset = null;
  private String anchorYOffset = null;
  private String conditionalParentLabel = null;
  private String conditionalParentValue = null;
  private String customTabId = null;
  private String documentId = null;
  private ErrorDetails errorDetails = null;
  private String locked = null;
  private MergeField mergeField = null;
  private String name = null;
  private String pageNumber = null;
  private String recipientId = null;
  private String required = null;
  private String requireInitialOnSharedChange = null;
  private String selected = null;
  private String shared = null;
  private String status = null;
  private String tabId = null;
  private String tabLabel = null;
  private String tabOrder = null;
  private String templateLocked = null;
  private String templateRequired = null;
  private String xPosition = null;
  private String yPosition = null;

  
  /**
   * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
  @JsonProperty("anchorCaseSensitive")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }
  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  
  /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.
   **/
  
  @ApiModelProperty(value = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
  @JsonProperty("anchorHorizontalAlignment")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }
  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
  }

  
  /**
   * When set to **true**, this tab is ignored if anchorString is not found in the document.
   **/
  
  @ApiModelProperty(value = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
  @JsonProperty("anchorIgnoreIfNotPresent")
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }
  public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }

  
  /**
   * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
  @JsonProperty("anchorMatchWholeWord")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }
  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  
  /**
   * Anchor text information for a radio button.
   **/
  
  @ApiModelProperty(value = "Anchor text information for a radio button.")
  @JsonProperty("anchorString")
  public String getAnchorString() {
    return anchorString;
  }
  public void setAnchorString(String anchorString) {
    this.anchorString = anchorString;
  }

  
  /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.
   **/
  
  @ApiModelProperty(value = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
  @JsonProperty("anchorUnits")
  public String getAnchorUnits() {
    return anchorUnits;
  }
  public void setAnchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
  }

  
  /**
   * Specifies the X axis location of the tab, in achorUnits, relative to the anchorString.
   **/
  
  @ApiModelProperty(value = "Specifies the X axis location of the tab, in achorUnits, relative to the anchorString.")
  @JsonProperty("anchorXOffset")
  public String getAnchorXOffset() {
    return anchorXOffset;
  }
  public void setAnchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
  }

  
  /**
   * Specifies the Y axis location of the tab, in achorUnits, relative to the anchorString.
   **/
  
  @ApiModelProperty(value = "Specifies the Y axis location of the tab, in achorUnits, relative to the anchorString.")
  @JsonProperty("anchorYOffset")
  public String getAnchorYOffset() {
    return anchorYOffset;
  }
  public void setAnchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
  }

  
  /**
   * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.
   **/
  
  @ApiModelProperty(value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  @JsonProperty("conditionalParentLabel")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }
  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  
  /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.
   **/
  
  @ApiModelProperty(value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.")
  @JsonProperty("conditionalParentValue")
  public String getConditionalParentValue() {
    return conditionalParentValue;
  }
  public void setConditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
  }

  
  /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.
   **/
  
  @ApiModelProperty(value = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
  @JsonProperty("customTabId")
  public String getCustomTabId() {
    return customTabId;
  }
  public void setCustomTabId(String customTabId) {
    this.customTabId = customTabId;
  }

  
  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   **/
  
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * When set to **true**, the signer cannot change the data of the custom tab.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the signer cannot change the data of the custom tab.")
  @JsonProperty("locked")
  public String getLocked() {
    return locked;
  }
  public void setLocked(String locked) {
    this.locked = locked;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mergeField")
  public MergeField getMergeField() {
    return mergeField;
  }
  public void setMergeField(MergeField mergeField) {
    this.mergeField = mergeField;
  }

  
  /**
   * Specifies the tool tip text for the tab.
   **/
  
  @ApiModelProperty(value = "Specifies the tool tip text for the tab.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Specifies the page number on which the tab is located.
   **/
  
  @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
  @JsonProperty("pageNumber")
  public String getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   **/
  
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  @JsonProperty("recipientId")
  public String getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  
  /**
   * When set to **true**, the signer is required to fill out this tab
   **/
  
  @ApiModelProperty(value = "When set to **true**, the signer is required to fill out this tab")
  @JsonProperty("required")
  public String getRequired() {
    return required;
  }
  public void setRequired(String required) {
    this.required = required;
  }

  
  /**
   * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.
   **/
  
  @ApiModelProperty(value = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
  @JsonProperty("requireInitialOnSharedChange")
  public String getRequireInitialOnSharedChange() {
    return requireInitialOnSharedChange;
  }
  public void setRequireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
  }

  
  /**
   * When set to **true**, the checkbox is selected.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the checkbox is selected.")
  @JsonProperty("selected")
  public String getSelected() {
    return selected;
  }
  public void setSelected(String selected) {
    this.selected = selected;
  }

  
  /**
   * When set to **true**, this custom tab is shared.
   **/
  
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  @JsonProperty("shared")
  public String getShared() {
    return shared;
  }
  public void setShared(String shared) {
    this.shared = shared;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].
   **/
  
  @ApiModelProperty(value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].")
  @JsonProperty("tabId")
  public String getTabId() {
    return tabId;
  }
  public void setTabId(String tabId) {
    this.tabId = tabId;
  }

  
  /**
   * The label string associated with the tab.
   **/
  
  @ApiModelProperty(value = "The label string associated with the tab.")
  @JsonProperty("tabLabel")
  public String getTabLabel() {
    return tabLabel;
  }
  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabOrder")
  public String getTabOrder() {
    return tabOrder;
  }
  public void setTabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
  }

  
  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.")
  @JsonProperty("templateLocked")
  public String getTemplateLocked() {
    return templateLocked;
  }
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  
  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  @JsonProperty("templateRequired")
  public String getTemplateRequired() {
    return templateRequired;
  }
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  
  /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
   **/
  
  @ApiModelProperty(value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  @JsonProperty("xPosition")
  public String getXPosition() {
    return xPosition;
  }
  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }

  
  /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
   **/
  
  @ApiModelProperty(value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  @JsonProperty("yPosition")
  public String getYPosition() {
    return yPosition;
  }
  public void setYPosition(String yPosition) {
    this.yPosition = yPosition;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Checkbox checkbox = (Checkbox) o;

    return true && Objects.equals(anchorCaseSensitive, checkbox.anchorCaseSensitive) &&
        Objects.equals(anchorHorizontalAlignment, checkbox.anchorHorizontalAlignment) &&
        Objects.equals(anchorIgnoreIfNotPresent, checkbox.anchorIgnoreIfNotPresent) &&
        Objects.equals(anchorMatchWholeWord, checkbox.anchorMatchWholeWord) &&
        Objects.equals(anchorString, checkbox.anchorString) &&
        Objects.equals(anchorUnits, checkbox.anchorUnits) &&
        Objects.equals(anchorXOffset, checkbox.anchorXOffset) &&
        Objects.equals(anchorYOffset, checkbox.anchorYOffset) &&
        Objects.equals(conditionalParentLabel, checkbox.conditionalParentLabel) &&
        Objects.equals(conditionalParentValue, checkbox.conditionalParentValue) &&
        Objects.equals(customTabId, checkbox.customTabId) &&
        Objects.equals(documentId, checkbox.documentId) &&
        Objects.equals(errorDetails, checkbox.errorDetails) &&
        Objects.equals(locked, checkbox.locked) &&
        Objects.equals(mergeField, checkbox.mergeField) &&
        Objects.equals(name, checkbox.name) &&
        Objects.equals(pageNumber, checkbox.pageNumber) &&
        Objects.equals(recipientId, checkbox.recipientId) &&
        Objects.equals(required, checkbox.required) &&
        Objects.equals(requireInitialOnSharedChange, checkbox.requireInitialOnSharedChange) &&
        Objects.equals(selected, checkbox.selected) &&
        Objects.equals(shared, checkbox.shared) &&
        Objects.equals(status, checkbox.status) &&
        Objects.equals(tabId, checkbox.tabId) &&
        Objects.equals(tabLabel, checkbox.tabLabel) &&
        Objects.equals(tabOrder, checkbox.tabOrder) &&
        Objects.equals(templateLocked, checkbox.templateLocked) &&
        Objects.equals(templateRequired, checkbox.templateRequired) &&
        Objects.equals(xPosition, checkbox.xPosition) &&
        Objects.equals(yPosition, checkbox.yPosition)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorString, anchorUnits, anchorXOffset, anchorYOffset, conditionalParentLabel, conditionalParentValue, customTabId, documentId, errorDetails, locked, mergeField, name, pageNumber, recipientId, required, requireInitialOnSharedChange, selected, shared, status, tabId, tabLabel, tabOrder, templateLocked, templateRequired, xPosition, yPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Checkbox {\n");
    
    if (anchorCaseSensitive != null)
      sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    if (anchorHorizontalAlignment != null)
      sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    if (anchorIgnoreIfNotPresent != null)
      sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    if (anchorMatchWholeWord != null)
      sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    if (anchorString != null)
      sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    if (anchorUnits != null)
      sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    if (anchorXOffset != null)
      sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    if (anchorYOffset != null)
      sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    if (conditionalParentLabel != null)
      sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    if (conditionalParentValue != null)
      sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    if (customTabId != null)
      sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    if (documentId != null)
      sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (locked != null)
      sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    if (mergeField != null)
      sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (pageNumber != null)
      sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    if (recipientId != null)
      sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    if (required != null)
      sb.append("    required: ").append(toIndentedString(required)).append("\n");
    if (requireInitialOnSharedChange != null)
      sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
    if (selected != null)
      sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    if (shared != null)
      sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (tabId != null)
      sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    if (tabLabel != null)
      sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    if (tabOrder != null)
      sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
    if (templateLocked != null)
      sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    if (templateRequired != null)
      sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    if (xPosition != null)
      sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    if (yPosition != null)
      sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
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

