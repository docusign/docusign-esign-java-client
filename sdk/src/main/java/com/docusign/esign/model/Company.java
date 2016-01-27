package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.MergeField;
import com.docusign.esign.model.ErrorDetails;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class Company   {
  
  private String name = null;
  private String value = null;
  private String originalValue = null;
  private Integer width = null;
  private String required = null;
  private String locked = null;
  private String concealValueOnDocument = null;
  private String disableAutoSize = null;
  private Integer maxLength = null;
  private String tabLabel = null;
  private String font = null;
  private String bold = null;
  private String italic = null;
  private String underline = null;
  private String fontColor = null;
  private String fontSize = null;
  private String documentId = null;
  private String recipientId = null;
  private String pageNumber = null;
  private String xPosition = null;
  private String yPosition = null;
  private String anchorString = null;
  private String anchorXOffset = null;
  private String anchorYOffset = null;
  private String anchorUnits = null;
  private String anchorIgnoreIfNotPresent = null;
  private String anchorCaseSensitive = null;
  private String anchorMatchWholeWord = null;
  private String anchorHorizontalAlignment = null;
  private String tabId = null;
  private String templateLocked = null;
  private String templateRequired = null;
  private String conditionalParentLabel = null;
  private String conditionalParentValue = null;
  private String customTabId = null;
  private MergeField mergeField = null;
  private String status = null;
  private ErrorDetails errorDetails = null;

  
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
   * Specifies the value of the tab.
   **/
  @ApiModelProperty(value = "Specifies the value of the tab.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * The initial value of the tab when it was sent to the recipient.
   **/
  @ApiModelProperty(value = "The initial value of the tab when it was sent to the recipient.")
  @JsonProperty("originalValue")
  public String getOriginalValue() {
    return originalValue;
  }
  public void setOriginalValue(String originalValue) {
    this.originalValue = originalValue;
  }

  
  /**
   * Width of the tab in pixels.
   **/
  @ApiModelProperty(value = "Width of the tab in pixels.")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
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
   * When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.\n\nWhen an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.\n\nThis setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.
   **/
  @ApiModelProperty(value = "When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.\n\nWhen an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.\n\nThis setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.")
  @JsonProperty("concealValueOnDocument")
  public String getConcealValueOnDocument() {
    return concealValueOnDocument;
  }
  public void setConcealValueOnDocument(String concealValueOnDocument) {
    this.concealValueOnDocument = concealValueOnDocument;
  }

  
  /**
   * When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.
   **/
  @ApiModelProperty(value = "When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.")
  @JsonProperty("disableAutoSize")
  public String getDisableAutoSize() {
    return disableAutoSize;
  }
  public void setDisableAutoSize(String disableAutoSize) {
    this.disableAutoSize = disableAutoSize;
  }

  
  /**
   * An optional value that describes the maximum length of the property when the property is a string.
   **/
  @ApiModelProperty(value = "An optional value that describes the maximum length of the property when the property is a string.")
  @JsonProperty("maxLength")
  public Integer getMaxLength() {
    return maxLength;
  }
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
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
   * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.
   **/
  @ApiModelProperty(value = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
  @JsonProperty("font")
  public String getFont() {
    return font;
  }
  public void setFont(String font) {
    this.font = font;
  }

  
  /**
   * When set to **true**, the information in the tab is bold.
   **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is bold.")
  @JsonProperty("bold")
  public String getBold() {
    return bold;
  }
  public void setBold(String bold) {
    this.bold = bold;
  }

  
  /**
   * When set to **true**, the information in the tab is italic.
   **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is italic.")
  @JsonProperty("italic")
  public String getItalic() {
    return italic;
  }
  public void setItalic(String italic) {
    this.italic = italic;
  }

  
  /**
   * When set to **true**, the information in the tab is underlined.
   **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is underlined.")
  @JsonProperty("underline")
  public String getUnderline() {
    return underline;
  }
  public void setUnderline(String underline) {
    this.underline = underline;
  }

  
  /**
   * The font color used for the information in the tab.\n\nPossible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.
   **/
  @ApiModelProperty(value = "The font color used for the information in the tab.\n\nPossible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
  @JsonProperty("fontColor")
  public String getFontColor() {
    return fontColor;
  }
  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  
  /**
   * The font size used for the information in the tab.\n\nPossible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.
   **/
  @ApiModelProperty(value = "The font size used for the information in the tab.\n\nPossible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
  @JsonProperty("fontSize")
  public String getFontSize() {
    return fontSize;
  }
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
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
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("anchorCaseSensitive")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }
  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("anchorMatchWholeWord")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }
  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("anchorHorizontalAlignment")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }
  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
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
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(name, company.name) &&
        Objects.equals(value, company.value) &&
        Objects.equals(originalValue, company.originalValue) &&
        Objects.equals(width, company.width) &&
        Objects.equals(required, company.required) &&
        Objects.equals(locked, company.locked) &&
        Objects.equals(concealValueOnDocument, company.concealValueOnDocument) &&
        Objects.equals(disableAutoSize, company.disableAutoSize) &&
        Objects.equals(maxLength, company.maxLength) &&
        Objects.equals(tabLabel, company.tabLabel) &&
        Objects.equals(font, company.font) &&
        Objects.equals(bold, company.bold) &&
        Objects.equals(italic, company.italic) &&
        Objects.equals(underline, company.underline) &&
        Objects.equals(fontColor, company.fontColor) &&
        Objects.equals(fontSize, company.fontSize) &&
        Objects.equals(documentId, company.documentId) &&
        Objects.equals(recipientId, company.recipientId) &&
        Objects.equals(pageNumber, company.pageNumber) &&
        Objects.equals(xPosition, company.xPosition) &&
        Objects.equals(yPosition, company.yPosition) &&
        Objects.equals(anchorString, company.anchorString) &&
        Objects.equals(anchorXOffset, company.anchorXOffset) &&
        Objects.equals(anchorYOffset, company.anchorYOffset) &&
        Objects.equals(anchorUnits, company.anchorUnits) &&
        Objects.equals(anchorIgnoreIfNotPresent, company.anchorIgnoreIfNotPresent) &&
        Objects.equals(anchorCaseSensitive, company.anchorCaseSensitive) &&
        Objects.equals(anchorMatchWholeWord, company.anchorMatchWholeWord) &&
        Objects.equals(anchorHorizontalAlignment, company.anchorHorizontalAlignment) &&
        Objects.equals(tabId, company.tabId) &&
        Objects.equals(templateLocked, company.templateLocked) &&
        Objects.equals(templateRequired, company.templateRequired) &&
        Objects.equals(conditionalParentLabel, company.conditionalParentLabel) &&
        Objects.equals(conditionalParentValue, company.conditionalParentValue) &&
        Objects.equals(customTabId, company.customTabId) &&
        Objects.equals(mergeField, company.mergeField) &&
        Objects.equals(status, company.status) &&
        Objects.equals(errorDetails, company.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, originalValue, width, required, locked, concealValueOnDocument, disableAutoSize, maxLength, tabLabel, font, bold, italic, underline, fontColor, fontSize, documentId, recipientId, pageNumber, xPosition, yPosition, anchorString, anchorXOffset, anchorYOffset, anchorUnits, anchorIgnoreIfNotPresent, anchorCaseSensitive, anchorMatchWholeWord, anchorHorizontalAlignment, tabId, templateLocked, templateRequired, conditionalParentLabel, conditionalParentValue, customTabId, mergeField, status, errorDetails);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("    originalValue: ").append(StringUtil.toIndentedString(originalValue)).append("\n");
    sb.append("    width: ").append(StringUtil.toIndentedString(width)).append("\n");
    sb.append("    required: ").append(StringUtil.toIndentedString(required)).append("\n");
    sb.append("    locked: ").append(StringUtil.toIndentedString(locked)).append("\n");
    sb.append("    concealValueOnDocument: ").append(StringUtil.toIndentedString(concealValueOnDocument)).append("\n");
    sb.append("    disableAutoSize: ").append(StringUtil.toIndentedString(disableAutoSize)).append("\n");
    sb.append("    maxLength: ").append(StringUtil.toIndentedString(maxLength)).append("\n");
    sb.append("    tabLabel: ").append(StringUtil.toIndentedString(tabLabel)).append("\n");
    sb.append("    font: ").append(StringUtil.toIndentedString(font)).append("\n");
    sb.append("    bold: ").append(StringUtil.toIndentedString(bold)).append("\n");
    sb.append("    italic: ").append(StringUtil.toIndentedString(italic)).append("\n");
    sb.append("    underline: ").append(StringUtil.toIndentedString(underline)).append("\n");
    sb.append("    fontColor: ").append(StringUtil.toIndentedString(fontColor)).append("\n");
    sb.append("    fontSize: ").append(StringUtil.toIndentedString(fontSize)).append("\n");
    sb.append("    documentId: ").append(StringUtil.toIndentedString(documentId)).append("\n");
    sb.append("    recipientId: ").append(StringUtil.toIndentedString(recipientId)).append("\n");
    sb.append("    pageNumber: ").append(StringUtil.toIndentedString(pageNumber)).append("\n");
    sb.append("    xPosition: ").append(StringUtil.toIndentedString(xPosition)).append("\n");
    sb.append("    yPosition: ").append(StringUtil.toIndentedString(yPosition)).append("\n");
    sb.append("    anchorString: ").append(StringUtil.toIndentedString(anchorString)).append("\n");
    sb.append("    anchorXOffset: ").append(StringUtil.toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorYOffset: ").append(StringUtil.toIndentedString(anchorYOffset)).append("\n");
    sb.append("    anchorUnits: ").append(StringUtil.toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(StringUtil.toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    sb.append("    anchorCaseSensitive: ").append(StringUtil.toIndentedString(anchorCaseSensitive)).append("\n");
    sb.append("    anchorMatchWholeWord: ").append(StringUtil.toIndentedString(anchorMatchWholeWord)).append("\n");
    sb.append("    anchorHorizontalAlignment: ").append(StringUtil.toIndentedString(anchorHorizontalAlignment)).append("\n");
    sb.append("    tabId: ").append(StringUtil.toIndentedString(tabId)).append("\n");
    sb.append("    templateLocked: ").append(StringUtil.toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(StringUtil.toIndentedString(templateRequired)).append("\n");
    sb.append("    conditionalParentLabel: ").append(StringUtil.toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentValue: ").append(StringUtil.toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    customTabId: ").append(StringUtil.toIndentedString(customTabId)).append("\n");
    sb.append("    mergeField: ").append(StringUtil.toIndentedString(mergeField)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    errorDetails: ").append(StringUtil.toIndentedString(errorDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
