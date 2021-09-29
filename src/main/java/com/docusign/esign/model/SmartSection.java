package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MergeField;
import com.docusign.esign.model.SmartSectionAnchorPosition;
import com.docusign.esign.model.SmartSectionDisplaySettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SmartSection.
 *
 */

public class SmartSection {
  @JsonProperty("anchorCaseSensitive")
  private String anchorCaseSensitive = null;

  @JsonProperty("anchorHorizontalAlignment")
  private String anchorHorizontalAlignment = null;

  @JsonProperty("anchorIgnoreIfNotPresent")
  private String anchorIgnoreIfNotPresent = null;

  @JsonProperty("anchorMatchWholeWord")
  private String anchorMatchWholeWord = null;

  @JsonProperty("anchorString")
  private String anchorString = null;

  @JsonProperty("anchorUnits")
  private String anchorUnits = null;

  @JsonProperty("anchorXOffset")
  private String anchorXOffset = null;

  @JsonProperty("anchorYOffset")
  private String anchorYOffset = null;

  @JsonProperty("caseSensitive")
  private Boolean caseSensitive = null;

  @JsonProperty("conditionalParentLabel")
  private String conditionalParentLabel = null;

  @JsonProperty("conditionalParentValue")
  private String conditionalParentValue = null;

  @JsonProperty("customTabId")
  private String customTabId = null;

  @JsonProperty("displaySettings")
  private SmartSectionDisplaySettings displaySettings = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("endAnchor")
  private String endAnchor = null;

  @JsonProperty("endPosition")
  private SmartSectionAnchorPosition endPosition = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("mergeField")
  private MergeField mergeField = null;

  @JsonProperty("pageNumber")
  private String pageNumber = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("removeEndAnchor")
  private Boolean removeEndAnchor = null;

  @JsonProperty("removeStartAnchor")
  private Boolean removeStartAnchor = null;

  @JsonProperty("startAnchor")
  private String startAnchor = null;

  @JsonProperty("startPosition")
  private SmartSectionAnchorPosition startPosition = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("tabGroupLabels")
  private java.util.List<String> tabGroupLabels = null;

  @JsonProperty("tabId")
  private String tabId = null;

  @JsonProperty("tabOrder")
  private String tabOrder = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("tooltip")
  private String tooltip = null;

  @JsonProperty("xPosition")
  private String xPosition = null;

  @JsonProperty("yPosition")
  private String yPosition = null;


  /**
   * anchorCaseSensitive.
   *
   * @return SmartSection
   **/
  public SmartSection anchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
    return this;
  }

  /**
   * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**..
   * @return anchorCaseSensitive
   **/
  @ApiModelProperty(value = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }

  /**
   * setAnchorCaseSensitive.
   **/
  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }


  /**
   * anchorHorizontalAlignment.
   *
   * @return SmartSection
   **/
  public SmartSection anchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    return this;
  }

  /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**..
   * @return anchorHorizontalAlignment
   **/
  @ApiModelProperty(value = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }

  /**
   * setAnchorHorizontalAlignment.
   **/
  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
  }


  /**
   * anchorIgnoreIfNotPresent.
   *
   * @return SmartSection
   **/
  public SmartSection anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }

  /**
   * When set to **true**, this tab is ignored if anchorString is not found in the document..
   * @return anchorIgnoreIfNotPresent
   **/
  @ApiModelProperty(value = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }

  /**
   * setAnchorIgnoreIfNotPresent.
   **/
  public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }


  /**
   * anchorMatchWholeWord.
   *
   * @return SmartSection
   **/
  public SmartSection anchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
    return this;
  }

  /**
   * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**..
   * @return anchorMatchWholeWord
   **/
  @ApiModelProperty(value = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }

  /**
   * setAnchorMatchWholeWord.
   **/
  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }


  /**
   * anchorString.
   *
   * @return SmartSection
   **/
  public SmartSection anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

  /**
   * Anchor text information for a radio button..
   * @return anchorString
   **/
  @ApiModelProperty(value = "Anchor text information for a radio button.")
  public String getAnchorString() {
    return anchorString;
  }

  /**
   * setAnchorString.
   **/
  public void setAnchorString(String anchorString) {
    this.anchorString = anchorString;
  }


  /**
   * anchorUnits.
   *
   * @return SmartSection
   **/
  public SmartSection anchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }

  /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches..
   * @return anchorUnits
   **/
  @ApiModelProperty(value = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
  public String getAnchorUnits() {
    return anchorUnits;
  }

  /**
   * setAnchorUnits.
   **/
  public void setAnchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
  }


  /**
   * anchorXOffset.
   *
   * @return SmartSection
   **/
  public SmartSection anchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }

  /**
   * Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString..
   * @return anchorXOffset
   **/
  @ApiModelProperty(value = "Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorXOffset() {
    return anchorXOffset;
  }

  /**
   * setAnchorXOffset.
   **/
  public void setAnchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
  }


  /**
   * anchorYOffset.
   *
   * @return SmartSection
   **/
  public SmartSection anchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }

  /**
   * Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString..
   * @return anchorYOffset
   **/
  @ApiModelProperty(value = "Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorYOffset() {
    return anchorYOffset;
  }

  /**
   * setAnchorYOffset.
   **/
  public void setAnchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
  }


  /**
   * caseSensitive.
   *
   * @return SmartSection
   **/
  public SmartSection caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  /**
   * .
   * @return caseSensitive
   **/
  @ApiModelProperty(value = "")
  public Boolean isCaseSensitive() {
    return caseSensitive;
  }

  /**
   * setCaseSensitive.
   **/
  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  /**
   * conditionalParentLabel.
   *
   * @return SmartSection
   **/
  public SmartSection conditionalParentLabel(String conditionalParentLabel) {
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
   * @return SmartSection
   **/
  public SmartSection conditionalParentValue(String conditionalParentValue) {
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
   * customTabId.
   *
   * @return SmartSection
   **/
  public SmartSection customTabId(String customTabId) {
    this.customTabId = customTabId;
    return this;
  }

  /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties..
   * @return customTabId
   **/
  @ApiModelProperty(value = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
  public String getCustomTabId() {
    return customTabId;
  }

  /**
   * setCustomTabId.
   **/
  public void setCustomTabId(String customTabId) {
    this.customTabId = customTabId;
  }


  /**
   * displaySettings.
   *
   * @return SmartSection
   **/
  public SmartSection displaySettings(SmartSectionDisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
    return this;
  }

  /**
   * Get displaySettings.
   * @return displaySettings
   **/
  @ApiModelProperty(value = "")
  public SmartSectionDisplaySettings getDisplaySettings() {
    return displaySettings;
  }

  /**
   * setDisplaySettings.
   **/
  public void setDisplaySettings(SmartSectionDisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
  }


  /**
   * documentId.
   *
   * @return SmartSection
   **/
  public SmartSection documentId(String documentId) {
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
   * endAnchor.
   *
   * @return SmartSection
   **/
  public SmartSection endAnchor(String endAnchor) {
    this.endAnchor = endAnchor;
    return this;
  }

  /**
   * .
   * @return endAnchor
   **/
  @ApiModelProperty(value = "")
  public String getEndAnchor() {
    return endAnchor;
  }

  /**
   * setEndAnchor.
   **/
  public void setEndAnchor(String endAnchor) {
    this.endAnchor = endAnchor;
  }


  /**
   * endPosition.
   *
   * @return SmartSection
   **/
  public SmartSection endPosition(SmartSectionAnchorPosition endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * Get endPosition.
   * @return endPosition
   **/
  @ApiModelProperty(value = "")
  public SmartSectionAnchorPosition getEndPosition() {
    return endPosition;
  }

  /**
   * setEndPosition.
   **/
  public void setEndPosition(SmartSectionAnchorPosition endPosition) {
    this.endPosition = endPosition;
  }


  /**
   * errorDetails.
   *
   * @return SmartSection
   **/
  public SmartSection errorDetails(ErrorDetails errorDetails) {
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
   * mergeField.
   *
   * @return SmartSection
   **/
  public SmartSection mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }

  /**
   * Get mergeField.
   * @return mergeField
   **/
  @ApiModelProperty(value = "")
  public MergeField getMergeField() {
    return mergeField;
  }

  /**
   * setMergeField.
   **/
  public void setMergeField(MergeField mergeField) {
    this.mergeField = mergeField;
  }


  /**
   * pageNumber.
   *
   * @return SmartSection
   **/
  public SmartSection pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Specifies the page number on which the tab is located..
   * @return pageNumber
   **/
  @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
  public String getPageNumber() {
    return pageNumber;
  }

  /**
   * setPageNumber.
   **/
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   * recipientId.
   *
   * @return SmartSection
   **/
  public SmartSection recipientId(String recipientId) {
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
   * removeEndAnchor.
   *
   * @return SmartSection
   **/
  public SmartSection removeEndAnchor(Boolean removeEndAnchor) {
    this.removeEndAnchor = removeEndAnchor;
    return this;
  }

  /**
   * .
   * @return removeEndAnchor
   **/
  @ApiModelProperty(value = "")
  public Boolean isRemoveEndAnchor() {
    return removeEndAnchor;
  }

  /**
   * setRemoveEndAnchor.
   **/
  public void setRemoveEndAnchor(Boolean removeEndAnchor) {
    this.removeEndAnchor = removeEndAnchor;
  }


  /**
   * removeStartAnchor.
   *
   * @return SmartSection
   **/
  public SmartSection removeStartAnchor(Boolean removeStartAnchor) {
    this.removeStartAnchor = removeStartAnchor;
    return this;
  }

  /**
   * .
   * @return removeStartAnchor
   **/
  @ApiModelProperty(value = "")
  public Boolean isRemoveStartAnchor() {
    return removeStartAnchor;
  }

  /**
   * setRemoveStartAnchor.
   **/
  public void setRemoveStartAnchor(Boolean removeStartAnchor) {
    this.removeStartAnchor = removeStartAnchor;
  }


  /**
   * startAnchor.
   *
   * @return SmartSection
   **/
  public SmartSection startAnchor(String startAnchor) {
    this.startAnchor = startAnchor;
    return this;
  }

  /**
   * .
   * @return startAnchor
   **/
  @ApiModelProperty(value = "")
  public String getStartAnchor() {
    return startAnchor;
  }

  /**
   * setStartAnchor.
   **/
  public void setStartAnchor(String startAnchor) {
    this.startAnchor = startAnchor;
  }


  /**
   * startPosition.
   *
   * @return SmartSection
   **/
  public SmartSection startPosition(SmartSectionAnchorPosition startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Get startPosition.
   * @return startPosition
   **/
  @ApiModelProperty(value = "")
  public SmartSectionAnchorPosition getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(SmartSectionAnchorPosition startPosition) {
    this.startPosition = startPosition;
  }


  /**
   * status.
   *
   * @return SmartSection
   **/
  public SmartSection status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * tabGroupLabels.
   *
   * @return SmartSection
   **/
  public SmartSection tabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
    return this;
  }
  
  /**
   * addTabGroupLabelsItem.
   *
   * @return SmartSection
   **/
  public SmartSection addTabGroupLabelsItem(String tabGroupLabelsItem) {
    if (this.tabGroupLabels == null) {
      this.tabGroupLabels = new java.util.ArrayList<String>();
    }
    this.tabGroupLabels.add(tabGroupLabelsItem);
    return this;
  }

  /**
   * .
   * @return tabGroupLabels
   **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getTabGroupLabels() {
    return tabGroupLabels;
  }

  /**
   * setTabGroupLabels.
   **/
  public void setTabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
  }


  /**
   * tabId.
   *
   * @return SmartSection
   **/
  public SmartSection tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

  /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     .
   * @return tabId
   **/
  @ApiModelProperty(value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  /**
   * setTabId.
   **/
  public void setTabId(String tabId) {
    this.tabId = tabId;
  }


  /**
   * tabOrder.
   *
   * @return SmartSection
   **/
  public SmartSection tabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
    return this;
  }

  /**
   * .
   * @return tabOrder
   **/
  @ApiModelProperty(value = "")
  public String getTabOrder() {
    return tabOrder;
  }

  /**
   * setTabOrder.
   **/
  public void setTabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
  }


  /**
   * templateLocked.
   *
   * @return SmartSection
   **/
  public SmartSection templateLocked(String templateLocked) {
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
   * @return SmartSection
   **/
  public SmartSection templateRequired(String templateRequired) {
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
   * @return SmartSection
   **/
  public SmartSection tooltip(String tooltip) {
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
   * xPosition.
   *
   * @return SmartSection
   **/
  public SmartSection xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

  /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position..
   * @return xPosition
   **/
  @ApiModelProperty(value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getXPosition() {
    return xPosition;
  }

  /**
   * setXPosition.
   **/
  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }


  /**
   * yPosition.
   *
   * @return SmartSection
   **/
  public SmartSection yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

  /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position..
   * @return yPosition
   **/
  @ApiModelProperty(value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getYPosition() {
    return yPosition;
  }

  /**
   * setYPosition.
   **/
  public void setYPosition(String yPosition) {
    this.yPosition = yPosition;
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
    SmartSection smartSection = (SmartSection) o;
    return Objects.equals(this.anchorCaseSensitive, smartSection.anchorCaseSensitive) &&
        Objects.equals(this.anchorHorizontalAlignment, smartSection.anchorHorizontalAlignment) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, smartSection.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorMatchWholeWord, smartSection.anchorMatchWholeWord) &&
        Objects.equals(this.anchorString, smartSection.anchorString) &&
        Objects.equals(this.anchorUnits, smartSection.anchorUnits) &&
        Objects.equals(this.anchorXOffset, smartSection.anchorXOffset) &&
        Objects.equals(this.anchorYOffset, smartSection.anchorYOffset) &&
        Objects.equals(this.caseSensitive, smartSection.caseSensitive) &&
        Objects.equals(this.conditionalParentLabel, smartSection.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentValue, smartSection.conditionalParentValue) &&
        Objects.equals(this.customTabId, smartSection.customTabId) &&
        Objects.equals(this.displaySettings, smartSection.displaySettings) &&
        Objects.equals(this.documentId, smartSection.documentId) &&
        Objects.equals(this.endAnchor, smartSection.endAnchor) &&
        Objects.equals(this.endPosition, smartSection.endPosition) &&
        Objects.equals(this.errorDetails, smartSection.errorDetails) &&
        Objects.equals(this.mergeField, smartSection.mergeField) &&
        Objects.equals(this.pageNumber, smartSection.pageNumber) &&
        Objects.equals(this.recipientId, smartSection.recipientId) &&
        Objects.equals(this.removeEndAnchor, smartSection.removeEndAnchor) &&
        Objects.equals(this.removeStartAnchor, smartSection.removeStartAnchor) &&
        Objects.equals(this.startAnchor, smartSection.startAnchor) &&
        Objects.equals(this.startPosition, smartSection.startPosition) &&
        Objects.equals(this.status, smartSection.status) &&
        Objects.equals(this.tabGroupLabels, smartSection.tabGroupLabels) &&
        Objects.equals(this.tabId, smartSection.tabId) &&
        Objects.equals(this.tabOrder, smartSection.tabOrder) &&
        Objects.equals(this.templateLocked, smartSection.templateLocked) &&
        Objects.equals(this.templateRequired, smartSection.templateRequired) &&
        Objects.equals(this.tooltip, smartSection.tooltip) &&
        Objects.equals(this.xPosition, smartSection.xPosition) &&
        Objects.equals(this.yPosition, smartSection.yPosition);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorString, anchorUnits, anchorXOffset, anchorYOffset, caseSensitive, conditionalParentLabel, conditionalParentValue, customTabId, displaySettings, documentId, endAnchor, endPosition, errorDetails, mergeField, pageNumber, recipientId, removeEndAnchor, removeStartAnchor, startAnchor, startPosition, status, tabGroupLabels, tabId, tabOrder, templateLocked, templateRequired, tooltip, xPosition, yPosition);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartSection {\n");
    
    sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    displaySettings: ").append(toIndentedString(displaySettings)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    endAnchor: ").append(toIndentedString(endAnchor)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    removeEndAnchor: ").append(toIndentedString(removeEndAnchor)).append("\n");
    sb.append("    removeStartAnchor: ").append(toIndentedString(removeStartAnchor)).append("\n");
    sb.append("    startAnchor: ").append(toIndentedString(startAnchor)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tabGroupLabels: ").append(toIndentedString(tabGroupLabels)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
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

