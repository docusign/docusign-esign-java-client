package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.LocalePolicyTab;
import com.docusign.esign.model.MergeField;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.SmartContractInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeId
 */

public class EnvelopeId {
  @JsonProperty("anchorAllowWhiteSpaceInCharacters")
  private String anchorAllowWhiteSpaceInCharacters = null;

  @JsonProperty("anchorAllowWhiteSpaceInCharactersMetadata")
  private PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata = null;

  @JsonProperty("anchorCaseSensitive")
  private String anchorCaseSensitive = null;

  @JsonProperty("anchorCaseSensitiveMetadata")
  private PropertyMetadata anchorCaseSensitiveMetadata = null;

  @JsonProperty("anchorHorizontalAlignment")
  private String anchorHorizontalAlignment = null;

  @JsonProperty("anchorHorizontalAlignmentMetadata")
  private PropertyMetadata anchorHorizontalAlignmentMetadata = null;

  @JsonProperty("anchorIgnoreIfNotPresent")
  private String anchorIgnoreIfNotPresent = null;

  @JsonProperty("anchorIgnoreIfNotPresentMetadata")
  private PropertyMetadata anchorIgnoreIfNotPresentMetadata = null;

  @JsonProperty("anchorMatchWholeWord")
  private String anchorMatchWholeWord = null;

  @JsonProperty("anchorMatchWholeWordMetadata")
  private PropertyMetadata anchorMatchWholeWordMetadata = null;

  @JsonProperty("anchorString")
  private String anchorString = null;

  @JsonProperty("anchorStringMetadata")
  private PropertyMetadata anchorStringMetadata = null;

  @JsonProperty("anchorTabProcessorVersion")
  private String anchorTabProcessorVersion = null;

  @JsonProperty("anchorTabProcessorVersionMetadata")
  private PropertyMetadata anchorTabProcessorVersionMetadata = null;

  @JsonProperty("anchorUnits")
  private String anchorUnits = null;

  @JsonProperty("anchorUnitsMetadata")
  private PropertyMetadata anchorUnitsMetadata = null;

  @JsonProperty("anchorXOffset")
  private String anchorXOffset = null;

  @JsonProperty("anchorXOffsetMetadata")
  private PropertyMetadata anchorXOffsetMetadata = null;

  @JsonProperty("anchorYOffset")
  private String anchorYOffset = null;

  @JsonProperty("anchorYOffsetMetadata")
  private PropertyMetadata anchorYOffsetMetadata = null;

  @JsonProperty("bold")
  private String bold = null;

  @JsonProperty("boldMetadata")
  private PropertyMetadata boldMetadata = null;

  @JsonProperty("conditionalParentLabel")
  private String conditionalParentLabel = null;

  @JsonProperty("conditionalParentLabelMetadata")
  private PropertyMetadata conditionalParentLabelMetadata = null;

  @JsonProperty("conditionalParentValue")
  private String conditionalParentValue = null;

  @JsonProperty("conditionalParentValueMetadata")
  private PropertyMetadata conditionalParentValueMetadata = null;

  @JsonProperty("customTabId")
  private String customTabId = null;

  @JsonProperty("customTabIdMetadata")
  private PropertyMetadata customTabIdMetadata = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentIdMetadata")
  private PropertyMetadata documentIdMetadata = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("font")
  private String font = null;

  @JsonProperty("fontColor")
  private String fontColor = null;

  @JsonProperty("fontColorMetadata")
  private PropertyMetadata fontColorMetadata = null;

  @JsonProperty("fontMetadata")
  private PropertyMetadata fontMetadata = null;

  @JsonProperty("fontSize")
  private String fontSize = null;

  @JsonProperty("fontSizeMetadata")
  private PropertyMetadata fontSizeMetadata = null;

  @JsonProperty("formOrder")
  private String formOrder = null;

  @JsonProperty("formOrderMetadata")
  private PropertyMetadata formOrderMetadata = null;

  @JsonProperty("formPageLabel")
  private String formPageLabel = null;

  @JsonProperty("formPageLabelMetadata")
  private PropertyMetadata formPageLabelMetadata = null;

  @JsonProperty("formPageNumber")
  private String formPageNumber = null;

  @JsonProperty("formPageNumberMetadata")
  private PropertyMetadata formPageNumberMetadata = null;

  @JsonProperty("height")
  private String height = null;

  @JsonProperty("heightMetadata")
  private PropertyMetadata heightMetadata = null;

  @JsonProperty("italic")
  private String italic = null;

  @JsonProperty("italicMetadata")
  private PropertyMetadata italicMetadata = null;

  @JsonProperty("localePolicy")
  private LocalePolicyTab localePolicy = null;

  @JsonProperty("mergeField")
  private MergeField mergeField = null;

  @JsonProperty("mergeFieldXml")
  private String mergeFieldXml = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameMetadata")
  private PropertyMetadata nameMetadata = null;

  @JsonProperty("pageNumber")
  private String pageNumber = null;

  @JsonProperty("pageNumberMetadata")
  private PropertyMetadata pageNumberMetadata = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdGuid")
  private String recipientIdGuid = null;

  @JsonProperty("recipientIdGuidMetadata")
  private PropertyMetadata recipientIdGuidMetadata = null;

  @JsonProperty("recipientIdMetadata")
  private PropertyMetadata recipientIdMetadata = null;

  @JsonProperty("smartContractInformation")
  private SmartContractInformation smartContractInformation = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusMetadata")
  private PropertyMetadata statusMetadata = null;

  @JsonProperty("tabGroupLabels")
  private java.util.List<String> tabGroupLabels = null;

  @JsonProperty("tabGroupLabelsMetadata")
  private PropertyMetadata tabGroupLabelsMetadata = null;

  @JsonProperty("tabId")
  private String tabId = null;

  @JsonProperty("tabIdMetadata")
  private PropertyMetadata tabIdMetadata = null;

  @JsonProperty("tabLabel")
  private String tabLabel = null;

  @JsonProperty("tabLabelMetadata")
  private PropertyMetadata tabLabelMetadata = null;

  @JsonProperty("tabOrder")
  private String tabOrder = null;

  @JsonProperty("tabOrderMetadata")
  private PropertyMetadata tabOrderMetadata = null;

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

  @JsonProperty("toolTipMetadata")
  private PropertyMetadata toolTipMetadata = null;

  @JsonProperty("underline")
  private String underline = null;

  @JsonProperty("underlineMetadata")
  private PropertyMetadata underlineMetadata = null;

  @JsonProperty("width")
  private String width = null;

  @JsonProperty("widthMetadata")
  private PropertyMetadata widthMetadata = null;

  @JsonProperty("xPosition")
  private String xPosition = null;

  @JsonProperty("xPositionMetadata")
  private PropertyMetadata xPositionMetadata = null;

  @JsonProperty("yPosition")
  private String yPosition = null;

  @JsonProperty("yPositionMetadata")
  private PropertyMetadata yPositionMetadata = null;

  public EnvelopeId anchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
    return this;
  }

   /**
   * 
   * @return anchorAllowWhiteSpaceInCharacters
  **/
  @ApiModelProperty(value = "")
  public String getAnchorAllowWhiteSpaceInCharacters() {
    return anchorAllowWhiteSpaceInCharacters;
  }

  public void setAnchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
  }

  public EnvelopeId anchorAllowWhiteSpaceInCharactersMetadata(PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
    return this;
  }

   /**
   * Get anchorAllowWhiteSpaceInCharactersMetadata
   * @return anchorAllowWhiteSpaceInCharactersMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorAllowWhiteSpaceInCharactersMetadata() {
    return anchorAllowWhiteSpaceInCharactersMetadata;
  }

  public void setAnchorAllowWhiteSpaceInCharactersMetadata(PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
  }

  public EnvelopeId anchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
    return this;
  }

   /**
   * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.
   * @return anchorCaseSensitive
  **/
  @ApiModelProperty(value = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }

  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  public EnvelopeId anchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
    return this;
  }

   /**
   * Get anchorCaseSensitiveMetadata
   * @return anchorCaseSensitiveMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorCaseSensitiveMetadata() {
    return anchorCaseSensitiveMetadata;
  }

  public void setAnchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
  }

  public EnvelopeId anchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    return this;
  }

   /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.
   * @return anchorHorizontalAlignment
  **/
  @ApiModelProperty(value = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }

  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
  }

  public EnvelopeId anchorHorizontalAlignmentMetadata(PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
    return this;
  }

   /**
   * Get anchorHorizontalAlignmentMetadata
   * @return anchorHorizontalAlignmentMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorHorizontalAlignmentMetadata() {
    return anchorHorizontalAlignmentMetadata;
  }

  public void setAnchorHorizontalAlignmentMetadata(PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
  }

  public EnvelopeId anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }

   /**
   * When set to **true**, this tab is ignored if anchorString is not found in the document.
   * @return anchorIgnoreIfNotPresent
  **/
  @ApiModelProperty(value = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }

  public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }

  public EnvelopeId anchorIgnoreIfNotPresentMetadata(PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
    return this;
  }

   /**
   * Get anchorIgnoreIfNotPresentMetadata
   * @return anchorIgnoreIfNotPresentMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorIgnoreIfNotPresentMetadata() {
    return anchorIgnoreIfNotPresentMetadata;
  }

  public void setAnchorIgnoreIfNotPresentMetadata(PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
  }

  public EnvelopeId anchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
    return this;
  }

   /**
   * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.
   * @return anchorMatchWholeWord
  **/
  @ApiModelProperty(value = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }

  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  public EnvelopeId anchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
    return this;
  }

   /**
   * Get anchorMatchWholeWordMetadata
   * @return anchorMatchWholeWordMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorMatchWholeWordMetadata() {
    return anchorMatchWholeWordMetadata;
  }

  public void setAnchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
  }

  public EnvelopeId anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

   /**
   * Anchor text information for a radio button.
   * @return anchorString
  **/
  @ApiModelProperty(value = "Anchor text information for a radio button.")
  public String getAnchorString() {
    return anchorString;
  }

  public void setAnchorString(String anchorString) {
    this.anchorString = anchorString;
  }

  public EnvelopeId anchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
    return this;
  }

   /**
   * Get anchorStringMetadata
   * @return anchorStringMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorStringMetadata() {
    return anchorStringMetadata;
  }

  public void setAnchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
  }

  public EnvelopeId anchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
    return this;
  }

   /**
   * 
   * @return anchorTabProcessorVersion
  **/
  @ApiModelProperty(value = "")
  public String getAnchorTabProcessorVersion() {
    return anchorTabProcessorVersion;
  }

  public void setAnchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
  }

  public EnvelopeId anchorTabProcessorVersionMetadata(PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
    return this;
  }

   /**
   * Get anchorTabProcessorVersionMetadata
   * @return anchorTabProcessorVersionMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorTabProcessorVersionMetadata() {
    return anchorTabProcessorVersionMetadata;
  }

  public void setAnchorTabProcessorVersionMetadata(PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
  }

  public EnvelopeId anchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }

   /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.
   * @return anchorUnits
  **/
  @ApiModelProperty(value = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
  public String getAnchorUnits() {
    return anchorUnits;
  }

  public void setAnchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
  }

  public EnvelopeId anchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
    return this;
  }

   /**
   * Get anchorUnitsMetadata
   * @return anchorUnitsMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorUnitsMetadata() {
    return anchorUnitsMetadata;
  }

  public void setAnchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
  }

  public EnvelopeId anchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }

   /**
   * Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.
   * @return anchorXOffset
  **/
  @ApiModelProperty(value = "Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorXOffset() {
    return anchorXOffset;
  }

  public void setAnchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
  }

  public EnvelopeId anchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
    return this;
  }

   /**
   * Get anchorXOffsetMetadata
   * @return anchorXOffsetMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorXOffsetMetadata() {
    return anchorXOffsetMetadata;
  }

  public void setAnchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
  }

  public EnvelopeId anchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }

   /**
   * Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.
   * @return anchorYOffset
  **/
  @ApiModelProperty(value = "Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorYOffset() {
    return anchorYOffset;
  }

  public void setAnchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
  }

  public EnvelopeId anchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
    return this;
  }

   /**
   * Get anchorYOffsetMetadata
   * @return anchorYOffsetMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorYOffsetMetadata() {
    return anchorYOffsetMetadata;
  }

  public void setAnchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
  }

  public EnvelopeId bold(String bold) {
    this.bold = bold;
    return this;
  }

   /**
   * When set to **true**, the information in the tab is bold.
   * @return bold
  **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is bold.")
  public String getBold() {
    return bold;
  }

  public void setBold(String bold) {
    this.bold = bold;
  }

  public EnvelopeId boldMetadata(PropertyMetadata boldMetadata) {
    this.boldMetadata = boldMetadata;
    return this;
  }

   /**
   * Get boldMetadata
   * @return boldMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getBoldMetadata() {
    return boldMetadata;
  }

  public void setBoldMetadata(PropertyMetadata boldMetadata) {
    this.boldMetadata = boldMetadata;
  }

  public EnvelopeId conditionalParentLabel(String conditionalParentLabel) {
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

  public EnvelopeId conditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
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

  public EnvelopeId conditionalParentValue(String conditionalParentValue) {
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

  public EnvelopeId conditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
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

  public EnvelopeId customTabId(String customTabId) {
    this.customTabId = customTabId;
    return this;
  }

   /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.
   * @return customTabId
  **/
  @ApiModelProperty(value = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
  public String getCustomTabId() {
    return customTabId;
  }

  public void setCustomTabId(String customTabId) {
    this.customTabId = customTabId;
  }

  public EnvelopeId customTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
    return this;
  }

   /**
   * Get customTabIdMetadata
   * @return customTabIdMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getCustomTabIdMetadata() {
    return customTabIdMetadata;
  }

  public void setCustomTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
  }

  public EnvelopeId documentId(String documentId) {
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

  public EnvelopeId documentIdMetadata(PropertyMetadata documentIdMetadata) {
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

  public EnvelopeId errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public EnvelopeId font(String font) {
    this.font = font;
    return this;
  }

   /**
   * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.
   * @return font
  **/
  @ApiModelProperty(value = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
  public String getFont() {
    return font;
  }

  public void setFont(String font) {
    this.font = font;
  }

  public EnvelopeId fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

   /**
   * The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.
   * @return fontColor
  **/
  @ApiModelProperty(value = "The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public EnvelopeId fontColorMetadata(PropertyMetadata fontColorMetadata) {
    this.fontColorMetadata = fontColorMetadata;
    return this;
  }

   /**
   * Get fontColorMetadata
   * @return fontColorMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getFontColorMetadata() {
    return fontColorMetadata;
  }

  public void setFontColorMetadata(PropertyMetadata fontColorMetadata) {
    this.fontColorMetadata = fontColorMetadata;
  }

  public EnvelopeId fontMetadata(PropertyMetadata fontMetadata) {
    this.fontMetadata = fontMetadata;
    return this;
  }

   /**
   * Get fontMetadata
   * @return fontMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getFontMetadata() {
    return fontMetadata;
  }

  public void setFontMetadata(PropertyMetadata fontMetadata) {
    this.fontMetadata = fontMetadata;
  }

  public EnvelopeId fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.
   * @return fontSize
  **/
  @ApiModelProperty(value = "The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
  public String getFontSize() {
    return fontSize;
  }

  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  public EnvelopeId fontSizeMetadata(PropertyMetadata fontSizeMetadata) {
    this.fontSizeMetadata = fontSizeMetadata;
    return this;
  }

   /**
   * Get fontSizeMetadata
   * @return fontSizeMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getFontSizeMetadata() {
    return fontSizeMetadata;
  }

  public void setFontSizeMetadata(PropertyMetadata fontSizeMetadata) {
    this.fontSizeMetadata = fontSizeMetadata;
  }

  public EnvelopeId formOrder(String formOrder) {
    this.formOrder = formOrder;
    return this;
  }

   /**
   * 
   * @return formOrder
  **/
  @ApiModelProperty(value = "")
  public String getFormOrder() {
    return formOrder;
  }

  public void setFormOrder(String formOrder) {
    this.formOrder = formOrder;
  }

  public EnvelopeId formOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
    return this;
  }

   /**
   * Get formOrderMetadata
   * @return formOrderMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getFormOrderMetadata() {
    return formOrderMetadata;
  }

  public void setFormOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
  }

  public EnvelopeId formPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
    return this;
  }

   /**
   * 
   * @return formPageLabel
  **/
  @ApiModelProperty(value = "")
  public String getFormPageLabel() {
    return formPageLabel;
  }

  public void setFormPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
  }

  public EnvelopeId formPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
    return this;
  }

   /**
   * Get formPageLabelMetadata
   * @return formPageLabelMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getFormPageLabelMetadata() {
    return formPageLabelMetadata;
  }

  public void setFormPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
  }

  public EnvelopeId formPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
    return this;
  }

   /**
   * 
   * @return formPageNumber
  **/
  @ApiModelProperty(value = "")
  public String getFormPageNumber() {
    return formPageNumber;
  }

  public void setFormPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
  }

  public EnvelopeId formPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
    return this;
  }

   /**
   * Get formPageNumberMetadata
   * @return formPageNumberMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getFormPageNumberMetadata() {
    return formPageNumberMetadata;
  }

  public void setFormPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
  }

  public EnvelopeId height(String height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the tab in pixels.
   * @return height
  **/
  @ApiModelProperty(value = "Height of the tab in pixels.")
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public EnvelopeId heightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
    return this;
  }

   /**
   * Get heightMetadata
   * @return heightMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getHeightMetadata() {
    return heightMetadata;
  }

  public void setHeightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
  }

  public EnvelopeId italic(String italic) {
    this.italic = italic;
    return this;
  }

   /**
   * When set to **true**, the information in the tab is italic.
   * @return italic
  **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is italic.")
  public String getItalic() {
    return italic;
  }

  public void setItalic(String italic) {
    this.italic = italic;
  }

  public EnvelopeId italicMetadata(PropertyMetadata italicMetadata) {
    this.italicMetadata = italicMetadata;
    return this;
  }

   /**
   * Get italicMetadata
   * @return italicMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getItalicMetadata() {
    return italicMetadata;
  }

  public void setItalicMetadata(PropertyMetadata italicMetadata) {
    this.italicMetadata = italicMetadata;
  }

  public EnvelopeId localePolicy(LocalePolicyTab localePolicy) {
    this.localePolicy = localePolicy;
    return this;
  }

   /**
   * Get localePolicy
   * @return localePolicy
  **/
  @ApiModelProperty(value = "")
  public LocalePolicyTab getLocalePolicy() {
    return localePolicy;
  }

  public void setLocalePolicy(LocalePolicyTab localePolicy) {
    this.localePolicy = localePolicy;
  }

  public EnvelopeId mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }

   /**
   * Get mergeField
   * @return mergeField
  **/
  @ApiModelProperty(value = "")
  public MergeField getMergeField() {
    return mergeField;
  }

  public void setMergeField(MergeField mergeField) {
    this.mergeField = mergeField;
  }

  public EnvelopeId mergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
    return this;
  }

   /**
   * 
   * @return mergeFieldXml
  **/
  @ApiModelProperty(value = "")
  public String getMergeFieldXml() {
    return mergeFieldXml;
  }

  public void setMergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
  }

  public EnvelopeId name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnvelopeId nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

   /**
   * Get nameMetadata
   * @return nameMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getNameMetadata() {
    return nameMetadata;
  }

  public void setNameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
  }

  public EnvelopeId pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Specifies the page number on which the tab is located.
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
  public String getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  public EnvelopeId pageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
    return this;
  }

   /**
   * Get pageNumberMetadata
   * @return pageNumberMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getPageNumberMetadata() {
    return pageNumberMetadata;
  }

  public void setPageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
  }

  public EnvelopeId recipientId(String recipientId) {
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

  public EnvelopeId recipientIdGuid(String recipientIdGuid) {
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

  public EnvelopeId recipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
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

  public EnvelopeId recipientIdMetadata(PropertyMetadata recipientIdMetadata) {
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

  public EnvelopeId smartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
    return this;
  }

   /**
   * Get smartContractInformation
   * @return smartContractInformation
  **/
  @ApiModelProperty(value = "")
  public SmartContractInformation getSmartContractInformation() {
    return smartContractInformation;
  }

  public void setSmartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
  }

  public EnvelopeId source(String source) {
    this.source = source;
    return this;
  }

   /**
   * 
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public EnvelopeId status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public EnvelopeId statusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
    return this;
  }

   /**
   * Get statusMetadata
   * @return statusMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getStatusMetadata() {
    return statusMetadata;
  }

  public void setStatusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
  }

  public EnvelopeId tabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
    return this;
  }

  public EnvelopeId addTabGroupLabelsItem(String tabGroupLabelsItem) {
    if (this.tabGroupLabels == null) {
      this.tabGroupLabels = new java.util.ArrayList<String>();
    }
    this.tabGroupLabels.add(tabGroupLabelsItem);
    return this;
  }

   /**
   * 
   * @return tabGroupLabels
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getTabGroupLabels() {
    return tabGroupLabels;
  }

  public void setTabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
  }

  public EnvelopeId tabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
    return this;
  }

   /**
   * Get tabGroupLabelsMetadata
   * @return tabGroupLabelsMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabGroupLabelsMetadata() {
    return tabGroupLabelsMetadata;
  }

  public void setTabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
  }

  public EnvelopeId tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

   /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     
   * @return tabId
  **/
  @ApiModelProperty(value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  public void setTabId(String tabId) {
    this.tabId = tabId;
  }

  public EnvelopeId tabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
    return this;
  }

   /**
   * Get tabIdMetadata
   * @return tabIdMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabIdMetadata() {
    return tabIdMetadata;
  }

  public void setTabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
  }

  public EnvelopeId tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

   /**
   * The label string associated with the tab.
   * @return tabLabel
  **/
  @ApiModelProperty(value = "The label string associated with the tab.")
  public String getTabLabel() {
    return tabLabel;
  }

  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }

  public EnvelopeId tabLabelMetadata(PropertyMetadata tabLabelMetadata) {
    this.tabLabelMetadata = tabLabelMetadata;
    return this;
  }

   /**
   * Get tabLabelMetadata
   * @return tabLabelMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabLabelMetadata() {
    return tabLabelMetadata;
  }

  public void setTabLabelMetadata(PropertyMetadata tabLabelMetadata) {
    this.tabLabelMetadata = tabLabelMetadata;
  }

  public EnvelopeId tabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
    return this;
  }

   /**
   * 
   * @return tabOrder
  **/
  @ApiModelProperty(value = "")
  public String getTabOrder() {
    return tabOrder;
  }

  public void setTabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
  }

  public EnvelopeId tabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
    return this;
  }

   /**
   * Get tabOrderMetadata
   * @return tabOrderMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabOrderMetadata() {
    return tabOrderMetadata;
  }

  public void setTabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
  }

  public EnvelopeId tabType(String tabType) {
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

  public EnvelopeId tabTypeMetadata(PropertyMetadata tabTypeMetadata) {
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

  public EnvelopeId templateLocked(String templateLocked) {
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

  public EnvelopeId templateLockedMetadata(PropertyMetadata templateLockedMetadata) {
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

  public EnvelopeId templateRequired(String templateRequired) {
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

  public EnvelopeId templateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
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

  public EnvelopeId tooltip(String tooltip) {
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

  public EnvelopeId toolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
    return this;
  }

   /**
   * Get toolTipMetadata
   * @return toolTipMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getToolTipMetadata() {
    return toolTipMetadata;
  }

  public void setToolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
  }

  public EnvelopeId underline(String underline) {
    this.underline = underline;
    return this;
  }

   /**
   * When set to **true**, the information in the tab is underlined.
   * @return underline
  **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is underlined.")
  public String getUnderline() {
    return underline;
  }

  public void setUnderline(String underline) {
    this.underline = underline;
  }

  public EnvelopeId underlineMetadata(PropertyMetadata underlineMetadata) {
    this.underlineMetadata = underlineMetadata;
    return this;
  }

   /**
   * Get underlineMetadata
   * @return underlineMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getUnderlineMetadata() {
    return underlineMetadata;
  }

  public void setUnderlineMetadata(PropertyMetadata underlineMetadata) {
    this.underlineMetadata = underlineMetadata;
  }

  public EnvelopeId width(String width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the tab in pixels.
   * @return width
  **/
  @ApiModelProperty(value = "Width of the tab in pixels.")
  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  public EnvelopeId widthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
    return this;
  }

   /**
   * Get widthMetadata
   * @return widthMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getWidthMetadata() {
    return widthMetadata;
  }

  public void setWidthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
  }

  public EnvelopeId xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

   /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return xPosition
  **/
  @ApiModelProperty(value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getXPosition() {
    return xPosition;
  }

  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }

  public EnvelopeId xPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
    return this;
  }

   /**
   * Get xPositionMetadata
   * @return xPositionMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getXPositionMetadata() {
    return xPositionMetadata;
  }

  public void setXPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
  }

  public EnvelopeId yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

   /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return yPosition
  **/
  @ApiModelProperty(value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getYPosition() {
    return yPosition;
  }

  public void setYPosition(String yPosition) {
    this.yPosition = yPosition;
  }

  public EnvelopeId yPositionMetadata(PropertyMetadata yPositionMetadata) {
    this.yPositionMetadata = yPositionMetadata;
    return this;
  }

   /**
   * Get yPositionMetadata
   * @return yPositionMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getYPositionMetadata() {
    return yPositionMetadata;
  }

  public void setYPositionMetadata(PropertyMetadata yPositionMetadata) {
    this.yPositionMetadata = yPositionMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeId envelopeId = (EnvelopeId) o;
    return Objects.equals(this.anchorAllowWhiteSpaceInCharacters, envelopeId.anchorAllowWhiteSpaceInCharacters) &&
        Objects.equals(this.anchorAllowWhiteSpaceInCharactersMetadata, envelopeId.anchorAllowWhiteSpaceInCharactersMetadata) &&
        Objects.equals(this.anchorCaseSensitive, envelopeId.anchorCaseSensitive) &&
        Objects.equals(this.anchorCaseSensitiveMetadata, envelopeId.anchorCaseSensitiveMetadata) &&
        Objects.equals(this.anchorHorizontalAlignment, envelopeId.anchorHorizontalAlignment) &&
        Objects.equals(this.anchorHorizontalAlignmentMetadata, envelopeId.anchorHorizontalAlignmentMetadata) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, envelopeId.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorIgnoreIfNotPresentMetadata, envelopeId.anchorIgnoreIfNotPresentMetadata) &&
        Objects.equals(this.anchorMatchWholeWord, envelopeId.anchorMatchWholeWord) &&
        Objects.equals(this.anchorMatchWholeWordMetadata, envelopeId.anchorMatchWholeWordMetadata) &&
        Objects.equals(this.anchorString, envelopeId.anchorString) &&
        Objects.equals(this.anchorStringMetadata, envelopeId.anchorStringMetadata) &&
        Objects.equals(this.anchorTabProcessorVersion, envelopeId.anchorTabProcessorVersion) &&
        Objects.equals(this.anchorTabProcessorVersionMetadata, envelopeId.anchorTabProcessorVersionMetadata) &&
        Objects.equals(this.anchorUnits, envelopeId.anchorUnits) &&
        Objects.equals(this.anchorUnitsMetadata, envelopeId.anchorUnitsMetadata) &&
        Objects.equals(this.anchorXOffset, envelopeId.anchorXOffset) &&
        Objects.equals(this.anchorXOffsetMetadata, envelopeId.anchorXOffsetMetadata) &&
        Objects.equals(this.anchorYOffset, envelopeId.anchorYOffset) &&
        Objects.equals(this.anchorYOffsetMetadata, envelopeId.anchorYOffsetMetadata) &&
        Objects.equals(this.bold, envelopeId.bold) &&
        Objects.equals(this.boldMetadata, envelopeId.boldMetadata) &&
        Objects.equals(this.conditionalParentLabel, envelopeId.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentLabelMetadata, envelopeId.conditionalParentLabelMetadata) &&
        Objects.equals(this.conditionalParentValue, envelopeId.conditionalParentValue) &&
        Objects.equals(this.conditionalParentValueMetadata, envelopeId.conditionalParentValueMetadata) &&
        Objects.equals(this.customTabId, envelopeId.customTabId) &&
        Objects.equals(this.customTabIdMetadata, envelopeId.customTabIdMetadata) &&
        Objects.equals(this.documentId, envelopeId.documentId) &&
        Objects.equals(this.documentIdMetadata, envelopeId.documentIdMetadata) &&
        Objects.equals(this.errorDetails, envelopeId.errorDetails) &&
        Objects.equals(this.font, envelopeId.font) &&
        Objects.equals(this.fontColor, envelopeId.fontColor) &&
        Objects.equals(this.fontColorMetadata, envelopeId.fontColorMetadata) &&
        Objects.equals(this.fontMetadata, envelopeId.fontMetadata) &&
        Objects.equals(this.fontSize, envelopeId.fontSize) &&
        Objects.equals(this.fontSizeMetadata, envelopeId.fontSizeMetadata) &&
        Objects.equals(this.formOrder, envelopeId.formOrder) &&
        Objects.equals(this.formOrderMetadata, envelopeId.formOrderMetadata) &&
        Objects.equals(this.formPageLabel, envelopeId.formPageLabel) &&
        Objects.equals(this.formPageLabelMetadata, envelopeId.formPageLabelMetadata) &&
        Objects.equals(this.formPageNumber, envelopeId.formPageNumber) &&
        Objects.equals(this.formPageNumberMetadata, envelopeId.formPageNumberMetadata) &&
        Objects.equals(this.height, envelopeId.height) &&
        Objects.equals(this.heightMetadata, envelopeId.heightMetadata) &&
        Objects.equals(this.italic, envelopeId.italic) &&
        Objects.equals(this.italicMetadata, envelopeId.italicMetadata) &&
        Objects.equals(this.localePolicy, envelopeId.localePolicy) &&
        Objects.equals(this.mergeField, envelopeId.mergeField) &&
        Objects.equals(this.mergeFieldXml, envelopeId.mergeFieldXml) &&
        Objects.equals(this.name, envelopeId.name) &&
        Objects.equals(this.nameMetadata, envelopeId.nameMetadata) &&
        Objects.equals(this.pageNumber, envelopeId.pageNumber) &&
        Objects.equals(this.pageNumberMetadata, envelopeId.pageNumberMetadata) &&
        Objects.equals(this.recipientId, envelopeId.recipientId) &&
        Objects.equals(this.recipientIdGuid, envelopeId.recipientIdGuid) &&
        Objects.equals(this.recipientIdGuidMetadata, envelopeId.recipientIdGuidMetadata) &&
        Objects.equals(this.recipientIdMetadata, envelopeId.recipientIdMetadata) &&
        Objects.equals(this.smartContractInformation, envelopeId.smartContractInformation) &&
        Objects.equals(this.source, envelopeId.source) &&
        Objects.equals(this.status, envelopeId.status) &&
        Objects.equals(this.statusMetadata, envelopeId.statusMetadata) &&
        Objects.equals(this.tabGroupLabels, envelopeId.tabGroupLabels) &&
        Objects.equals(this.tabGroupLabelsMetadata, envelopeId.tabGroupLabelsMetadata) &&
        Objects.equals(this.tabId, envelopeId.tabId) &&
        Objects.equals(this.tabIdMetadata, envelopeId.tabIdMetadata) &&
        Objects.equals(this.tabLabel, envelopeId.tabLabel) &&
        Objects.equals(this.tabLabelMetadata, envelopeId.tabLabelMetadata) &&
        Objects.equals(this.tabOrder, envelopeId.tabOrder) &&
        Objects.equals(this.tabOrderMetadata, envelopeId.tabOrderMetadata) &&
        Objects.equals(this.tabType, envelopeId.tabType) &&
        Objects.equals(this.tabTypeMetadata, envelopeId.tabTypeMetadata) &&
        Objects.equals(this.templateLocked, envelopeId.templateLocked) &&
        Objects.equals(this.templateLockedMetadata, envelopeId.templateLockedMetadata) &&
        Objects.equals(this.templateRequired, envelopeId.templateRequired) &&
        Objects.equals(this.templateRequiredMetadata, envelopeId.templateRequiredMetadata) &&
        Objects.equals(this.tooltip, envelopeId.tooltip) &&
        Objects.equals(this.toolTipMetadata, envelopeId.toolTipMetadata) &&
        Objects.equals(this.underline, envelopeId.underline) &&
        Objects.equals(this.underlineMetadata, envelopeId.underlineMetadata) &&
        Objects.equals(this.width, envelopeId.width) &&
        Objects.equals(this.widthMetadata, envelopeId.widthMetadata) &&
        Objects.equals(this.xPosition, envelopeId.xPosition) &&
        Objects.equals(this.xPositionMetadata, envelopeId.xPositionMetadata) &&
        Objects.equals(this.yPosition, envelopeId.yPosition) &&
        Objects.equals(this.yPositionMetadata, envelopeId.yPositionMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorAllowWhiteSpaceInCharacters, anchorAllowWhiteSpaceInCharactersMetadata, anchorCaseSensitive, anchorCaseSensitiveMetadata, anchorHorizontalAlignment, anchorHorizontalAlignmentMetadata, anchorIgnoreIfNotPresent, anchorIgnoreIfNotPresentMetadata, anchorMatchWholeWord, anchorMatchWholeWordMetadata, anchorString, anchorStringMetadata, anchorTabProcessorVersion, anchorTabProcessorVersionMetadata, anchorUnits, anchorUnitsMetadata, anchorXOffset, anchorXOffsetMetadata, anchorYOffset, anchorYOffsetMetadata, bold, boldMetadata, conditionalParentLabel, conditionalParentLabelMetadata, conditionalParentValue, conditionalParentValueMetadata, customTabId, customTabIdMetadata, documentId, documentIdMetadata, errorDetails, font, fontColor, fontColorMetadata, fontMetadata, fontSize, fontSizeMetadata, formOrder, formOrderMetadata, formPageLabel, formPageLabelMetadata, formPageNumber, formPageNumberMetadata, height, heightMetadata, italic, italicMetadata, localePolicy, mergeField, mergeFieldXml, name, nameMetadata, pageNumber, pageNumberMetadata, recipientId, recipientIdGuid, recipientIdGuidMetadata, recipientIdMetadata, smartContractInformation, source, status, statusMetadata, tabGroupLabels, tabGroupLabelsMetadata, tabId, tabIdMetadata, tabLabel, tabLabelMetadata, tabOrder, tabOrderMetadata, tabType, tabTypeMetadata, templateLocked, templateLockedMetadata, templateRequired, templateRequiredMetadata, tooltip, toolTipMetadata, underline, underlineMetadata, width, widthMetadata, xPosition, xPositionMetadata, yPosition, yPositionMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeId {\n");
    
    sb.append("    anchorAllowWhiteSpaceInCharacters: ").append(toIndentedString(anchorAllowWhiteSpaceInCharacters)).append("\n");
    sb.append("    anchorAllowWhiteSpaceInCharactersMetadata: ").append(toIndentedString(anchorAllowWhiteSpaceInCharactersMetadata)).append("\n");
    sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    sb.append("    anchorCaseSensitiveMetadata: ").append(toIndentedString(anchorCaseSensitiveMetadata)).append("\n");
    sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    sb.append("    anchorHorizontalAlignmentMetadata: ").append(toIndentedString(anchorHorizontalAlignmentMetadata)).append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    sb.append("    anchorIgnoreIfNotPresentMetadata: ").append(toIndentedString(anchorIgnoreIfNotPresentMetadata)).append("\n");
    sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    sb.append("    anchorMatchWholeWordMetadata: ").append(toIndentedString(anchorMatchWholeWordMetadata)).append("\n");
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    anchorStringMetadata: ").append(toIndentedString(anchorStringMetadata)).append("\n");
    sb.append("    anchorTabProcessorVersion: ").append(toIndentedString(anchorTabProcessorVersion)).append("\n");
    sb.append("    anchorTabProcessorVersionMetadata: ").append(toIndentedString(anchorTabProcessorVersionMetadata)).append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorUnitsMetadata: ").append(toIndentedString(anchorUnitsMetadata)).append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorXOffsetMetadata: ").append(toIndentedString(anchorXOffsetMetadata)).append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    anchorYOffsetMetadata: ").append(toIndentedString(anchorYOffsetMetadata)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    boldMetadata: ").append(toIndentedString(boldMetadata)).append("\n");
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentLabelMetadata: ").append(toIndentedString(conditionalParentLabelMetadata)).append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    conditionalParentValueMetadata: ").append(toIndentedString(conditionalParentValueMetadata)).append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    customTabIdMetadata: ").append(toIndentedString(customTabIdMetadata)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentIdMetadata: ").append(toIndentedString(documentIdMetadata)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    fontColorMetadata: ").append(toIndentedString(fontColorMetadata)).append("\n");
    sb.append("    fontMetadata: ").append(toIndentedString(fontMetadata)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontSizeMetadata: ").append(toIndentedString(fontSizeMetadata)).append("\n");
    sb.append("    formOrder: ").append(toIndentedString(formOrder)).append("\n");
    sb.append("    formOrderMetadata: ").append(toIndentedString(formOrderMetadata)).append("\n");
    sb.append("    formPageLabel: ").append(toIndentedString(formPageLabel)).append("\n");
    sb.append("    formPageLabelMetadata: ").append(toIndentedString(formPageLabelMetadata)).append("\n");
    sb.append("    formPageNumber: ").append(toIndentedString(formPageNumber)).append("\n");
    sb.append("    formPageNumberMetadata: ").append(toIndentedString(formPageNumberMetadata)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    heightMetadata: ").append(toIndentedString(heightMetadata)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    italicMetadata: ").append(toIndentedString(italicMetadata)).append("\n");
    sb.append("    localePolicy: ").append(toIndentedString(localePolicy)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    mergeFieldXml: ").append(toIndentedString(mergeFieldXml)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageNumberMetadata: ").append(toIndentedString(pageNumberMetadata)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    recipientIdGuidMetadata: ").append(toIndentedString(recipientIdGuidMetadata)).append("\n");
    sb.append("    recipientIdMetadata: ").append(toIndentedString(recipientIdMetadata)).append("\n");
    sb.append("    smartContractInformation: ").append(toIndentedString(smartContractInformation)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMetadata: ").append(toIndentedString(statusMetadata)).append("\n");
    sb.append("    tabGroupLabels: ").append(toIndentedString(tabGroupLabels)).append("\n");
    sb.append("    tabGroupLabelsMetadata: ").append(toIndentedString(tabGroupLabelsMetadata)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    tabIdMetadata: ").append(toIndentedString(tabIdMetadata)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    sb.append("    tabLabelMetadata: ").append(toIndentedString(tabLabelMetadata)).append("\n");
    sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
    sb.append("    tabOrderMetadata: ").append(toIndentedString(tabOrderMetadata)).append("\n");
    sb.append("    tabType: ").append(toIndentedString(tabType)).append("\n");
    sb.append("    tabTypeMetadata: ").append(toIndentedString(tabTypeMetadata)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateLockedMetadata: ").append(toIndentedString(templateLockedMetadata)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    templateRequiredMetadata: ").append(toIndentedString(templateRequiredMetadata)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    toolTipMetadata: ").append(toIndentedString(toolTipMetadata)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    underlineMetadata: ").append(toIndentedString(underlineMetadata)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    widthMetadata: ").append(toIndentedString(widthMetadata)).append("\n");
    sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    sb.append("    xPositionMetadata: ").append(toIndentedString(xPositionMetadata)).append("\n");
    sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
    sb.append("    yPositionMetadata: ").append(toIndentedString(yPositionMetadata)).append("\n");
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

