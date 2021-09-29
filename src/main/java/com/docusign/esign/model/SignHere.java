package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MergeField;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignHere.
 *
 */

public class SignHere {
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

  @JsonProperty("conditionalParentLabel")
  private String conditionalParentLabel = null;

  @JsonProperty("conditionalParentValue")
  private String conditionalParentValue = null;

  @JsonProperty("customTabId")
  private String customTabId = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("mergeField")
  private MergeField mergeField = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("optional")
  private String optional = null;

  @JsonProperty("pageNumber")
  private String pageNumber = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("scaleValue")
  private String scaleValue = null;

  @JsonProperty("stampType")
  private String stampType = null;

  @JsonProperty("stampTypeMetadata")
  private PropertyMetadata stampTypeMetadata = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("tabGroupLabels")
  private java.util.List<String> tabGroupLabels = null;

  @JsonProperty("tabId")
  private String tabId = null;

  @JsonProperty("tabLabel")
  private String tabLabel = null;

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
   * @return SignHere
   **/
  public SignHere anchorCaseSensitive(String anchorCaseSensitive) {
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
   * @return SignHere
   **/
  public SignHere anchorHorizontalAlignment(String anchorHorizontalAlignment) {
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
   * @return SignHere
   **/
  public SignHere anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
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
   * @return SignHere
   **/
  public SignHere anchorMatchWholeWord(String anchorMatchWholeWord) {
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
   * @return SignHere
   **/
  public SignHere anchorString(String anchorString) {
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
   * @return SignHere
   **/
  public SignHere anchorUnits(String anchorUnits) {
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
   * @return SignHere
   **/
  public SignHere anchorXOffset(String anchorXOffset) {
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
   * @return SignHere
   **/
  public SignHere anchorYOffset(String anchorYOffset) {
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
   * conditionalParentLabel.
   *
   * @return SignHere
   **/
  public SignHere conditionalParentLabel(String conditionalParentLabel) {
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
   * @return SignHere
   **/
  public SignHere conditionalParentValue(String conditionalParentValue) {
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
   * @return SignHere
   **/
  public SignHere customTabId(String customTabId) {
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
   * documentId.
   *
   * @return SignHere
   **/
  public SignHere documentId(String documentId) {
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
   * errorDetails.
   *
   * @return SignHere
   **/
  public SignHere errorDetails(ErrorDetails errorDetails) {
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
   * @return SignHere
   **/
  public SignHere mergeField(MergeField mergeField) {
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
   * name.
   *
   * @return SignHere
   **/
  public SignHere name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies the tool tip text for the tab..
   * @return name
   **/
  @ApiModelProperty(value = "Specifies the tool tip text for the tab.")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * optional.
   *
   * @return SignHere
   **/
  public SignHere optional(String optional) {
    this.optional = optional;
    return this;
  }

  /**
   * .
   * @return optional
   **/
  @ApiModelProperty(value = "")
  public String getOptional() {
    return optional;
  }

  /**
   * setOptional.
   **/
  public void setOptional(String optional) {
    this.optional = optional;
  }


  /**
   * pageNumber.
   *
   * @return SignHere
   **/
  public SignHere pageNumber(String pageNumber) {
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
   * @return SignHere
   **/
  public SignHere recipientId(String recipientId) {
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
   * scaleValue.
   *
   * @return SignHere
   **/
  public SignHere scaleValue(String scaleValue) {
    this.scaleValue = scaleValue;
    return this;
  }

  /**
   * .
   * @return scaleValue
   **/
  @ApiModelProperty(value = "")
  public String getScaleValue() {
    return scaleValue;
  }

  /**
   * setScaleValue.
   **/
  public void setScaleValue(String scaleValue) {
    this.scaleValue = scaleValue;
  }


  /**
   * stampType.
   *
   * @return SignHere
   **/
  public SignHere stampType(String stampType) {
    this.stampType = stampType;
    return this;
  }

  /**
   * .
   * @return stampType
   **/
  @ApiModelProperty(value = "")
  public String getStampType() {
    return stampType;
  }

  /**
   * setStampType.
   **/
  public void setStampType(String stampType) {
    this.stampType = stampType;
  }


  /**
   * stampTypeMetadata.
   *
   * @return SignHere
   **/
  public SignHere stampTypeMetadata(PropertyMetadata stampTypeMetadata) {
    this.stampTypeMetadata = stampTypeMetadata;
    return this;
  }

  /**
   * Get stampTypeMetadata.
   * @return stampTypeMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getStampTypeMetadata() {
    return stampTypeMetadata;
  }

  /**
   * setStampTypeMetadata.
   **/
  public void setStampTypeMetadata(PropertyMetadata stampTypeMetadata) {
    this.stampTypeMetadata = stampTypeMetadata;
  }


  /**
   * status.
   *
   * @return SignHere
   **/
  public SignHere status(String status) {
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
   * @return SignHere
   **/
  public SignHere tabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
    return this;
  }
  
  /**
   * addTabGroupLabelsItem.
   *
   * @return SignHere
   **/
  public SignHere addTabGroupLabelsItem(String tabGroupLabelsItem) {
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
   * @return SignHere
   **/
  public SignHere tabId(String tabId) {
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
   * tabLabel.
   *
   * @return SignHere
   **/
  public SignHere tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

  /**
   * The label string associated with the tab..
   * @return tabLabel
   **/
  @ApiModelProperty(value = "The label string associated with the tab.")
  public String getTabLabel() {
    return tabLabel;
  }

  /**
   * setTabLabel.
   **/
  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }


  /**
   * tabOrder.
   *
   * @return SignHere
   **/
  public SignHere tabOrder(String tabOrder) {
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
   * @return SignHere
   **/
  public SignHere templateLocked(String templateLocked) {
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
   * @return SignHere
   **/
  public SignHere templateRequired(String templateRequired) {
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
   * @return SignHere
   **/
  public SignHere tooltip(String tooltip) {
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
   * @return SignHere
   **/
  public SignHere xPosition(String xPosition) {
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
   * @return SignHere
   **/
  public SignHere yPosition(String yPosition) {
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
    SignHere signHere = (SignHere) o;
    return Objects.equals(this.anchorCaseSensitive, signHere.anchorCaseSensitive) &&
        Objects.equals(this.anchorHorizontalAlignment, signHere.anchorHorizontalAlignment) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, signHere.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorMatchWholeWord, signHere.anchorMatchWholeWord) &&
        Objects.equals(this.anchorString, signHere.anchorString) &&
        Objects.equals(this.anchorUnits, signHere.anchorUnits) &&
        Objects.equals(this.anchorXOffset, signHere.anchorXOffset) &&
        Objects.equals(this.anchorYOffset, signHere.anchorYOffset) &&
        Objects.equals(this.conditionalParentLabel, signHere.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentValue, signHere.conditionalParentValue) &&
        Objects.equals(this.customTabId, signHere.customTabId) &&
        Objects.equals(this.documentId, signHere.documentId) &&
        Objects.equals(this.errorDetails, signHere.errorDetails) &&
        Objects.equals(this.mergeField, signHere.mergeField) &&
        Objects.equals(this.name, signHere.name) &&
        Objects.equals(this.optional, signHere.optional) &&
        Objects.equals(this.pageNumber, signHere.pageNumber) &&
        Objects.equals(this.recipientId, signHere.recipientId) &&
        Objects.equals(this.scaleValue, signHere.scaleValue) &&
        Objects.equals(this.stampType, signHere.stampType) &&
        Objects.equals(this.stampTypeMetadata, signHere.stampTypeMetadata) &&
        Objects.equals(this.status, signHere.status) &&
        Objects.equals(this.tabGroupLabels, signHere.tabGroupLabels) &&
        Objects.equals(this.tabId, signHere.tabId) &&
        Objects.equals(this.tabLabel, signHere.tabLabel) &&
        Objects.equals(this.tabOrder, signHere.tabOrder) &&
        Objects.equals(this.templateLocked, signHere.templateLocked) &&
        Objects.equals(this.templateRequired, signHere.templateRequired) &&
        Objects.equals(this.tooltip, signHere.tooltip) &&
        Objects.equals(this.xPosition, signHere.xPosition) &&
        Objects.equals(this.yPosition, signHere.yPosition);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorString, anchorUnits, anchorXOffset, anchorYOffset, conditionalParentLabel, conditionalParentValue, customTabId, documentId, errorDetails, mergeField, name, optional, pageNumber, recipientId, scaleValue, stampType, stampTypeMetadata, status, tabGroupLabels, tabId, tabLabel, tabOrder, templateLocked, templateRequired, tooltip, xPosition, yPosition);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignHere {\n");
    
    sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    scaleValue: ").append(toIndentedString(scaleValue)).append("\n");
    sb.append("    stampType: ").append(toIndentedString(stampType)).append("\n");
    sb.append("    stampTypeMetadata: ").append(toIndentedString(stampTypeMetadata)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tabGroupLabels: ").append(toIndentedString(tabGroupLabels)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
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

