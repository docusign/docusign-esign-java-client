package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MergeField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignerAttachment
 */

public class SignerAttachment {
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

  @JsonProperty("status")
  private String status = null;

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

  public SignerAttachment anchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
    return this;
  }

   /**
   * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.
   * @return anchorCaseSensitive
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }

  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  public SignerAttachment anchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    return this;
  }

   /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.
   * @return anchorHorizontalAlignment
  **/
  @ApiModelProperty(example = "null", value = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }

  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
  }

  public SignerAttachment anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }

   /**
   * When set to **true**, this tab is ignored if anchorString is not found in the document.
   * @return anchorIgnoreIfNotPresent
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }

  public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }

  public SignerAttachment anchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
    return this;
  }

   /**
   * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.
   * @return anchorMatchWholeWord
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }

  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  public SignerAttachment anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

   /**
   * Anchor text information for a radio button.
   * @return anchorString
  **/
  @ApiModelProperty(example = "null", value = "Anchor text information for a radio button.")
  public String getAnchorString() {
    return anchorString;
  }

  public void setAnchorString(String anchorString) {
    this.anchorString = anchorString;
  }

  public SignerAttachment anchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }

   /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.
   * @return anchorUnits
  **/
  @ApiModelProperty(example = "null", value = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
  public String getAnchorUnits() {
    return anchorUnits;
  }

  public void setAnchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
  }

  public SignerAttachment anchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }

   /**
   * Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.
   * @return anchorXOffset
  **/
  @ApiModelProperty(example = "null", value = "Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorXOffset() {
    return anchorXOffset;
  }

  public void setAnchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
  }

  public SignerAttachment anchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }

   /**
   * Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.
   * @return anchorYOffset
  **/
  @ApiModelProperty(example = "null", value = "Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorYOffset() {
    return anchorYOffset;
  }

  public void setAnchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
  }

  public SignerAttachment conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }

   /**
   * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.
   * @return conditionalParentLabel
  **/
  @ApiModelProperty(example = "null", value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }

  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  public SignerAttachment conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }

   /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. 
   * @return conditionalParentValue
  **/
  @ApiModelProperty(example = "null", value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. ")
  public String getConditionalParentValue() {
    return conditionalParentValue;
  }

  public void setConditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
  }

  public SignerAttachment customTabId(String customTabId) {
    this.customTabId = customTabId;
    return this;
  }

   /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.
   * @return customTabId
  **/
  @ApiModelProperty(example = "null", value = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
  public String getCustomTabId() {
    return customTabId;
  }

  public void setCustomTabId(String customTabId) {
    this.customTabId = customTabId;
  }

  public SignerAttachment documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public SignerAttachment errorDetails(ErrorDetails errorDetails) {
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

  public SignerAttachment mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }

   /**
   * Get mergeField
   * @return mergeField
  **/
  @ApiModelProperty(example = "null", value = "")
  public MergeField getMergeField() {
    return mergeField;
  }

  public void setMergeField(MergeField mergeField) {
    this.mergeField = mergeField;
  }

  public SignerAttachment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SignerAttachment optional(String optional) {
    this.optional = optional;
    return this;
  }

   /**
   * 
   * @return optional
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOptional() {
    return optional;
  }

  public void setOptional(String optional) {
    this.optional = optional;
  }

  public SignerAttachment pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Specifies the page number on which the tab is located.
   * @return pageNumber
  **/
  @ApiModelProperty(example = "null", value = "Specifies the page number on which the tab is located.")
  public String getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  public SignerAttachment recipientId(String recipientId) {
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

  public SignerAttachment scaleValue(String scaleValue) {
    this.scaleValue = scaleValue;
    return this;
  }

   /**
   * 
   * @return scaleValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getScaleValue() {
    return scaleValue;
  }

  public void setScaleValue(String scaleValue) {
    this.scaleValue = scaleValue;
  }

  public SignerAttachment status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SignerAttachment tabId(String tabId) {
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

  public SignerAttachment tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

   /**
   * The label string associated with the tab.
   * @return tabLabel
  **/
  @ApiModelProperty(example = "null", value = "The label string associated with the tab.")
  public String getTabLabel() {
    return tabLabel;
  }

  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }

  public SignerAttachment tabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
    return this;
  }

   /**
   * 
   * @return tabOrder
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTabOrder() {
    return tabOrder;
  }

  public void setTabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
  }

  public SignerAttachment templateLocked(String templateLocked) {
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

  public SignerAttachment templateRequired(String templateRequired) {
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

  public SignerAttachment tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

   /**
   * 
   * @return tooltip
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public SignerAttachment xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

   /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return xPosition
  **/
  @ApiModelProperty(example = "null", value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getXPosition() {
    return xPosition;
  }

  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }

  public SignerAttachment yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

   /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return yPosition
  **/
  @ApiModelProperty(example = "null", value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
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
    SignerAttachment signerAttachment = (SignerAttachment) o;
    return Objects.equals(this.anchorCaseSensitive, signerAttachment.anchorCaseSensitive) &&
        Objects.equals(this.anchorHorizontalAlignment, signerAttachment.anchorHorizontalAlignment) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, signerAttachment.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorMatchWholeWord, signerAttachment.anchorMatchWholeWord) &&
        Objects.equals(this.anchorString, signerAttachment.anchorString) &&
        Objects.equals(this.anchorUnits, signerAttachment.anchorUnits) &&
        Objects.equals(this.anchorXOffset, signerAttachment.anchorXOffset) &&
        Objects.equals(this.anchorYOffset, signerAttachment.anchorYOffset) &&
        Objects.equals(this.conditionalParentLabel, signerAttachment.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentValue, signerAttachment.conditionalParentValue) &&
        Objects.equals(this.customTabId, signerAttachment.customTabId) &&
        Objects.equals(this.documentId, signerAttachment.documentId) &&
        Objects.equals(this.errorDetails, signerAttachment.errorDetails) &&
        Objects.equals(this.mergeField, signerAttachment.mergeField) &&
        Objects.equals(this.name, signerAttachment.name) &&
        Objects.equals(this.optional, signerAttachment.optional) &&
        Objects.equals(this.pageNumber, signerAttachment.pageNumber) &&
        Objects.equals(this.recipientId, signerAttachment.recipientId) &&
        Objects.equals(this.scaleValue, signerAttachment.scaleValue) &&
        Objects.equals(this.status, signerAttachment.status) &&
        Objects.equals(this.tabId, signerAttachment.tabId) &&
        Objects.equals(this.tabLabel, signerAttachment.tabLabel) &&
        Objects.equals(this.tabOrder, signerAttachment.tabOrder) &&
        Objects.equals(this.templateLocked, signerAttachment.templateLocked) &&
        Objects.equals(this.templateRequired, signerAttachment.templateRequired) &&
        Objects.equals(this.tooltip, signerAttachment.tooltip) &&
        Objects.equals(this.xPosition, signerAttachment.xPosition) &&
        Objects.equals(this.yPosition, signerAttachment.yPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorString, anchorUnits, anchorXOffset, anchorYOffset, conditionalParentLabel, conditionalParentValue, customTabId, documentId, errorDetails, mergeField, name, optional, pageNumber, recipientId, scaleValue, status, tabId, tabLabel, tabOrder, templateLocked, templateRequired, tooltip, xPosition, yPosition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignerAttachment {\n");
    
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
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

