package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MergeField;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.SmartContractInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InitialHere
 */

public class InitialHere {
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

  @JsonProperty("mergeField")
  private MergeField mergeField = null;

  @JsonProperty("mergeFieldXml")
  private String mergeFieldXml = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameMetadata")
  private PropertyMetadata nameMetadata = null;

  @JsonProperty("optional")
  private String optional = null;

  @JsonProperty("optionalMetadata")
  private PropertyMetadata optionalMetadata = null;

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

  @JsonProperty("scaleValue")
  private String scaleValue = null;

  @JsonProperty("scaleValueMetadata")
  private PropertyMetadata scaleValueMetadata = null;

  @JsonProperty("smartContractInformation")
  private SmartContractInformation smartContractInformation = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusMetadata")
  private PropertyMetadata statusMetadata = null;

  @JsonProperty("tabGroupLabels")
  private java.util.List<String> tabGroupLabels = new java.util.ArrayList<String>();

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

  public InitialHere anchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
    return this;
  }

   /**
   * 
   * @return anchorAllowWhiteSpaceInCharacters
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAnchorAllowWhiteSpaceInCharacters() {
    return anchorAllowWhiteSpaceInCharacters;
  }

  public void setAnchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
  }

  public InitialHere anchorAllowWhiteSpaceInCharactersMetadata(PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
    return this;
  }

   /**
   * Get anchorAllowWhiteSpaceInCharactersMetadata
   * @return anchorAllowWhiteSpaceInCharactersMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAnchorAllowWhiteSpaceInCharactersMetadata() {
    return anchorAllowWhiteSpaceInCharactersMetadata;
  }

  public void setAnchorAllowWhiteSpaceInCharactersMetadata(PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
  }

  public InitialHere anchorCaseSensitive(String anchorCaseSensitive) {
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

  public InitialHere anchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
    return this;
  }

   /**
   * Get anchorCaseSensitiveMetadata
   * @return anchorCaseSensitiveMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAnchorCaseSensitiveMetadata() {
    return anchorCaseSensitiveMetadata;
  }

  public void setAnchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
  }

  public InitialHere anchorHorizontalAlignment(String anchorHorizontalAlignment) {
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

  public InitialHere anchorHorizontalAlignmentMetadata(PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
    return this;
  }

   /**
   * Get anchorHorizontalAlignmentMetadata
   * @return anchorHorizontalAlignmentMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAnchorHorizontalAlignmentMetadata() {
    return anchorHorizontalAlignmentMetadata;
  }

  public void setAnchorHorizontalAlignmentMetadata(PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
  }

  public InitialHere anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
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

  public InitialHere anchorIgnoreIfNotPresentMetadata(PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
    return this;
  }

   /**
   * Get anchorIgnoreIfNotPresentMetadata
   * @return anchorIgnoreIfNotPresentMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAnchorIgnoreIfNotPresentMetadata() {
    return anchorIgnoreIfNotPresentMetadata;
  }

  public void setAnchorIgnoreIfNotPresentMetadata(PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
  }

  public InitialHere anchorMatchWholeWord(String anchorMatchWholeWord) {
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

  public InitialHere anchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
    return this;
  }

   /**
   * Get anchorMatchWholeWordMetadata
   * @return anchorMatchWholeWordMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAnchorMatchWholeWordMetadata() {
    return anchorMatchWholeWordMetadata;
  }

  public void setAnchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
  }

  public InitialHere anchorString(String anchorString) {
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

  public InitialHere anchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
    return this;
  }

   /**
   * Get anchorStringMetadata
   * @return anchorStringMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAnchorStringMetadata() {
    return anchorStringMetadata;
  }

  public void setAnchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
  }

  public InitialHere anchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
    return this;
  }

   /**
   * 
   * @return anchorTabProcessorVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAnchorTabProcessorVersion() {
    return anchorTabProcessorVersion;
  }

  public void setAnchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
  }

  public InitialHere anchorTabProcessorVersionMetadata(PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
    return this;
  }

   /**
   * Get anchorTabProcessorVersionMetadata
   * @return anchorTabProcessorVersionMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAnchorTabProcessorVersionMetadata() {
    return anchorTabProcessorVersionMetadata;
  }

  public void setAnchorTabProcessorVersionMetadata(PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
  }

  public InitialHere anchorUnits(String anchorUnits) {
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

  public InitialHere anchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
    return this;
  }

   /**
   * Get anchorUnitsMetadata
   * @return anchorUnitsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAnchorUnitsMetadata() {
    return anchorUnitsMetadata;
  }

  public void setAnchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
  }

  public InitialHere anchorXOffset(String anchorXOffset) {
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

  public InitialHere anchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
    return this;
  }

   /**
   * Get anchorXOffsetMetadata
   * @return anchorXOffsetMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAnchorXOffsetMetadata() {
    return anchorXOffsetMetadata;
  }

  public void setAnchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
  }

  public InitialHere anchorYOffset(String anchorYOffset) {
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

  public InitialHere anchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
    return this;
  }

   /**
   * Get anchorYOffsetMetadata
   * @return anchorYOffsetMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAnchorYOffsetMetadata() {
    return anchorYOffsetMetadata;
  }

  public void setAnchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
  }

  public InitialHere conditionalParentLabel(String conditionalParentLabel) {
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

  public InitialHere conditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
    return this;
  }

   /**
   * Get conditionalParentLabelMetadata
   * @return conditionalParentLabelMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getConditionalParentLabelMetadata() {
    return conditionalParentLabelMetadata;
  }

  public void setConditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
  }

  public InitialHere conditionalParentValue(String conditionalParentValue) {
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

  public InitialHere conditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
    return this;
  }

   /**
   * Get conditionalParentValueMetadata
   * @return conditionalParentValueMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getConditionalParentValueMetadata() {
    return conditionalParentValueMetadata;
  }

  public void setConditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
  }

  public InitialHere customTabId(String customTabId) {
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

  public InitialHere customTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
    return this;
  }

   /**
   * Get customTabIdMetadata
   * @return customTabIdMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getCustomTabIdMetadata() {
    return customTabIdMetadata;
  }

  public void setCustomTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
  }

  public InitialHere documentId(String documentId) {
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

  public InitialHere documentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
    return this;
  }

   /**
   * Get documentIdMetadata
   * @return documentIdMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getDocumentIdMetadata() {
    return documentIdMetadata;
  }

  public void setDocumentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
  }

  public InitialHere errorDetails(ErrorDetails errorDetails) {
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

  public InitialHere formOrder(String formOrder) {
    this.formOrder = formOrder;
    return this;
  }

   /**
   * 
   * @return formOrder
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFormOrder() {
    return formOrder;
  }

  public void setFormOrder(String formOrder) {
    this.formOrder = formOrder;
  }

  public InitialHere formOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
    return this;
  }

   /**
   * Get formOrderMetadata
   * @return formOrderMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getFormOrderMetadata() {
    return formOrderMetadata;
  }

  public void setFormOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
  }

  public InitialHere formPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
    return this;
  }

   /**
   * 
   * @return formPageLabel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFormPageLabel() {
    return formPageLabel;
  }

  public void setFormPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
  }

  public InitialHere formPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
    return this;
  }

   /**
   * Get formPageLabelMetadata
   * @return formPageLabelMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getFormPageLabelMetadata() {
    return formPageLabelMetadata;
  }

  public void setFormPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
  }

  public InitialHere formPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
    return this;
  }

   /**
   * 
   * @return formPageNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFormPageNumber() {
    return formPageNumber;
  }

  public void setFormPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
  }

  public InitialHere formPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
    return this;
  }

   /**
   * Get formPageNumberMetadata
   * @return formPageNumberMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getFormPageNumberMetadata() {
    return formPageNumberMetadata;
  }

  public void setFormPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
  }

  public InitialHere height(String height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the tab in pixels.
   * @return height
  **/
  @ApiModelProperty(example = "null", value = "Height of the tab in pixels.")
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public InitialHere heightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
    return this;
  }

   /**
   * Get heightMetadata
   * @return heightMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getHeightMetadata() {
    return heightMetadata;
  }

  public void setHeightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
  }

  public InitialHere mergeField(MergeField mergeField) {
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

  public InitialHere mergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
    return this;
  }

   /**
   * 
   * @return mergeFieldXml
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMergeFieldXml() {
    return mergeFieldXml;
  }

  public void setMergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
  }

  public InitialHere name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the tool tip text for the tab.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Specifies the tool tip text for the tab.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InitialHere nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

   /**
   * Get nameMetadata
   * @return nameMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getNameMetadata() {
    return nameMetadata;
  }

  public void setNameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
  }

  public InitialHere optional(String optional) {
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

  public InitialHere optionalMetadata(PropertyMetadata optionalMetadata) {
    this.optionalMetadata = optionalMetadata;
    return this;
  }

   /**
   * Get optionalMetadata
   * @return optionalMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getOptionalMetadata() {
    return optionalMetadata;
  }

  public void setOptionalMetadata(PropertyMetadata optionalMetadata) {
    this.optionalMetadata = optionalMetadata;
  }

  public InitialHere pageNumber(String pageNumber) {
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

  public InitialHere pageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
    return this;
  }

   /**
   * Get pageNumberMetadata
   * @return pageNumberMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getPageNumberMetadata() {
    return pageNumberMetadata;
  }

  public void setPageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
  }

  public InitialHere recipientId(String recipientId) {
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

  public InitialHere recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

   /**
   * 
   * @return recipientIdGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  public InitialHere recipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
    return this;
  }

   /**
   * Get recipientIdGuidMetadata
   * @return recipientIdGuidMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getRecipientIdGuidMetadata() {
    return recipientIdGuidMetadata;
  }

  public void setRecipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
  }

  public InitialHere recipientIdMetadata(PropertyMetadata recipientIdMetadata) {
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

  public InitialHere scaleValue(String scaleValue) {
    this.scaleValue = scaleValue;
    return this;
  }

   /**
   *  Sets the size for the InitialHere tab. It can be value from 0.5 to 1.0, where 1.0 represents full size and 0.5 is 50% size.
   * @return scaleValue
  **/
  @ApiModelProperty(example = "null", value = " Sets the size for the InitialHere tab. It can be value from 0.5 to 1.0, where 1.0 represents full size and 0.5 is 50% size.")
  public String getScaleValue() {
    return scaleValue;
  }

  public void setScaleValue(String scaleValue) {
    this.scaleValue = scaleValue;
  }

  public InitialHere scaleValueMetadata(PropertyMetadata scaleValueMetadata) {
    this.scaleValueMetadata = scaleValueMetadata;
    return this;
  }

   /**
   * Get scaleValueMetadata
   * @return scaleValueMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getScaleValueMetadata() {
    return scaleValueMetadata;
  }

  public void setScaleValueMetadata(PropertyMetadata scaleValueMetadata) {
    this.scaleValueMetadata = scaleValueMetadata;
  }

  public InitialHere smartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
    return this;
  }

   /**
   * Get smartContractInformation
   * @return smartContractInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public SmartContractInformation getSmartContractInformation() {
    return smartContractInformation;
  }

  public void setSmartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
  }

  public InitialHere status(String status) {
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

  public InitialHere statusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
    return this;
  }

   /**
   * Get statusMetadata
   * @return statusMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getStatusMetadata() {
    return statusMetadata;
  }

  public void setStatusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
  }

  public InitialHere tabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
    return this;
  }

  public InitialHere addTabGroupLabelsItem(String tabGroupLabelsItem) {
    this.tabGroupLabels.add(tabGroupLabelsItem);
    return this;
  }

   /**
   * 
   * @return tabGroupLabels
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getTabGroupLabels() {
    return tabGroupLabels;
  }

  public void setTabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
  }

  public InitialHere tabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
    return this;
  }

   /**
   * Get tabGroupLabelsMetadata
   * @return tabGroupLabelsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getTabGroupLabelsMetadata() {
    return tabGroupLabelsMetadata;
  }

  public void setTabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
  }

  public InitialHere tabId(String tabId) {
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

  public InitialHere tabIdMetadata(PropertyMetadata tabIdMetadata) {
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

  public InitialHere tabLabel(String tabLabel) {
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

  public InitialHere tabLabelMetadata(PropertyMetadata tabLabelMetadata) {
    this.tabLabelMetadata = tabLabelMetadata;
    return this;
  }

   /**
   * Get tabLabelMetadata
   * @return tabLabelMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getTabLabelMetadata() {
    return tabLabelMetadata;
  }

  public void setTabLabelMetadata(PropertyMetadata tabLabelMetadata) {
    this.tabLabelMetadata = tabLabelMetadata;
  }

  public InitialHere tabOrder(String tabOrder) {
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

  public InitialHere tabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
    return this;
  }

   /**
   * Get tabOrderMetadata
   * @return tabOrderMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getTabOrderMetadata() {
    return tabOrderMetadata;
  }

  public void setTabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
  }

  public InitialHere tabType(String tabType) {
    this.tabType = tabType;
    return this;
  }

   /**
   * 
   * @return tabType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTabType() {
    return tabType;
  }

  public void setTabType(String tabType) {
    this.tabType = tabType;
  }

  public InitialHere tabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
    return this;
  }

   /**
   * Get tabTypeMetadata
   * @return tabTypeMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getTabTypeMetadata() {
    return tabTypeMetadata;
  }

  public void setTabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
  }

  public InitialHere templateLocked(String templateLocked) {
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

  public InitialHere templateLockedMetadata(PropertyMetadata templateLockedMetadata) {
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

  public InitialHere templateRequired(String templateRequired) {
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

  public InitialHere templateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
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

  public InitialHere tooltip(String tooltip) {
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

  public InitialHere toolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
    return this;
  }

   /**
   * Get toolTipMetadata
   * @return toolTipMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getToolTipMetadata() {
    return toolTipMetadata;
  }

  public void setToolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
  }

  public InitialHere width(String width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the tab in pixels.
   * @return width
  **/
  @ApiModelProperty(example = "null", value = "Width of the tab in pixels.")
  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  public InitialHere widthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
    return this;
  }

   /**
   * Get widthMetadata
   * @return widthMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getWidthMetadata() {
    return widthMetadata;
  }

  public void setWidthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
  }

  public InitialHere xPosition(String xPosition) {
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

  public InitialHere xPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
    return this;
  }

   /**
   * Get xPositionMetadata
   * @return xPositionMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getXPositionMetadata() {
    return xPositionMetadata;
  }

  public void setXPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
  }

  public InitialHere yPosition(String yPosition) {
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

  public InitialHere yPositionMetadata(PropertyMetadata yPositionMetadata) {
    this.yPositionMetadata = yPositionMetadata;
    return this;
  }

   /**
   * Get yPositionMetadata
   * @return yPositionMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
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
    InitialHere initialHere = (InitialHere) o;
    return Objects.equals(this.anchorAllowWhiteSpaceInCharacters, initialHere.anchorAllowWhiteSpaceInCharacters) &&
        Objects.equals(this.anchorAllowWhiteSpaceInCharactersMetadata, initialHere.anchorAllowWhiteSpaceInCharactersMetadata) &&
        Objects.equals(this.anchorCaseSensitive, initialHere.anchorCaseSensitive) &&
        Objects.equals(this.anchorCaseSensitiveMetadata, initialHere.anchorCaseSensitiveMetadata) &&
        Objects.equals(this.anchorHorizontalAlignment, initialHere.anchorHorizontalAlignment) &&
        Objects.equals(this.anchorHorizontalAlignmentMetadata, initialHere.anchorHorizontalAlignmentMetadata) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, initialHere.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorIgnoreIfNotPresentMetadata, initialHere.anchorIgnoreIfNotPresentMetadata) &&
        Objects.equals(this.anchorMatchWholeWord, initialHere.anchorMatchWholeWord) &&
        Objects.equals(this.anchorMatchWholeWordMetadata, initialHere.anchorMatchWholeWordMetadata) &&
        Objects.equals(this.anchorString, initialHere.anchorString) &&
        Objects.equals(this.anchorStringMetadata, initialHere.anchorStringMetadata) &&
        Objects.equals(this.anchorTabProcessorVersion, initialHere.anchorTabProcessorVersion) &&
        Objects.equals(this.anchorTabProcessorVersionMetadata, initialHere.anchorTabProcessorVersionMetadata) &&
        Objects.equals(this.anchorUnits, initialHere.anchorUnits) &&
        Objects.equals(this.anchorUnitsMetadata, initialHere.anchorUnitsMetadata) &&
        Objects.equals(this.anchorXOffset, initialHere.anchorXOffset) &&
        Objects.equals(this.anchorXOffsetMetadata, initialHere.anchorXOffsetMetadata) &&
        Objects.equals(this.anchorYOffset, initialHere.anchorYOffset) &&
        Objects.equals(this.anchorYOffsetMetadata, initialHere.anchorYOffsetMetadata) &&
        Objects.equals(this.conditionalParentLabel, initialHere.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentLabelMetadata, initialHere.conditionalParentLabelMetadata) &&
        Objects.equals(this.conditionalParentValue, initialHere.conditionalParentValue) &&
        Objects.equals(this.conditionalParentValueMetadata, initialHere.conditionalParentValueMetadata) &&
        Objects.equals(this.customTabId, initialHere.customTabId) &&
        Objects.equals(this.customTabIdMetadata, initialHere.customTabIdMetadata) &&
        Objects.equals(this.documentId, initialHere.documentId) &&
        Objects.equals(this.documentIdMetadata, initialHere.documentIdMetadata) &&
        Objects.equals(this.errorDetails, initialHere.errorDetails) &&
        Objects.equals(this.formOrder, initialHere.formOrder) &&
        Objects.equals(this.formOrderMetadata, initialHere.formOrderMetadata) &&
        Objects.equals(this.formPageLabel, initialHere.formPageLabel) &&
        Objects.equals(this.formPageLabelMetadata, initialHere.formPageLabelMetadata) &&
        Objects.equals(this.formPageNumber, initialHere.formPageNumber) &&
        Objects.equals(this.formPageNumberMetadata, initialHere.formPageNumberMetadata) &&
        Objects.equals(this.height, initialHere.height) &&
        Objects.equals(this.heightMetadata, initialHere.heightMetadata) &&
        Objects.equals(this.mergeField, initialHere.mergeField) &&
        Objects.equals(this.mergeFieldXml, initialHere.mergeFieldXml) &&
        Objects.equals(this.name, initialHere.name) &&
        Objects.equals(this.nameMetadata, initialHere.nameMetadata) &&
        Objects.equals(this.optional, initialHere.optional) &&
        Objects.equals(this.optionalMetadata, initialHere.optionalMetadata) &&
        Objects.equals(this.pageNumber, initialHere.pageNumber) &&
        Objects.equals(this.pageNumberMetadata, initialHere.pageNumberMetadata) &&
        Objects.equals(this.recipientId, initialHere.recipientId) &&
        Objects.equals(this.recipientIdGuid, initialHere.recipientIdGuid) &&
        Objects.equals(this.recipientIdGuidMetadata, initialHere.recipientIdGuidMetadata) &&
        Objects.equals(this.recipientIdMetadata, initialHere.recipientIdMetadata) &&
        Objects.equals(this.scaleValue, initialHere.scaleValue) &&
        Objects.equals(this.scaleValueMetadata, initialHere.scaleValueMetadata) &&
        Objects.equals(this.smartContractInformation, initialHere.smartContractInformation) &&
        Objects.equals(this.status, initialHere.status) &&
        Objects.equals(this.statusMetadata, initialHere.statusMetadata) &&
        Objects.equals(this.tabGroupLabels, initialHere.tabGroupLabels) &&
        Objects.equals(this.tabGroupLabelsMetadata, initialHere.tabGroupLabelsMetadata) &&
        Objects.equals(this.tabId, initialHere.tabId) &&
        Objects.equals(this.tabIdMetadata, initialHere.tabIdMetadata) &&
        Objects.equals(this.tabLabel, initialHere.tabLabel) &&
        Objects.equals(this.tabLabelMetadata, initialHere.tabLabelMetadata) &&
        Objects.equals(this.tabOrder, initialHere.tabOrder) &&
        Objects.equals(this.tabOrderMetadata, initialHere.tabOrderMetadata) &&
        Objects.equals(this.tabType, initialHere.tabType) &&
        Objects.equals(this.tabTypeMetadata, initialHere.tabTypeMetadata) &&
        Objects.equals(this.templateLocked, initialHere.templateLocked) &&
        Objects.equals(this.templateLockedMetadata, initialHere.templateLockedMetadata) &&
        Objects.equals(this.templateRequired, initialHere.templateRequired) &&
        Objects.equals(this.templateRequiredMetadata, initialHere.templateRequiredMetadata) &&
        Objects.equals(this.tooltip, initialHere.tooltip) &&
        Objects.equals(this.toolTipMetadata, initialHere.toolTipMetadata) &&
        Objects.equals(this.width, initialHere.width) &&
        Objects.equals(this.widthMetadata, initialHere.widthMetadata) &&
        Objects.equals(this.xPosition, initialHere.xPosition) &&
        Objects.equals(this.xPositionMetadata, initialHere.xPositionMetadata) &&
        Objects.equals(this.yPosition, initialHere.yPosition) &&
        Objects.equals(this.yPositionMetadata, initialHere.yPositionMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorAllowWhiteSpaceInCharacters, anchorAllowWhiteSpaceInCharactersMetadata, anchorCaseSensitive, anchorCaseSensitiveMetadata, anchorHorizontalAlignment, anchorHorizontalAlignmentMetadata, anchorIgnoreIfNotPresent, anchorIgnoreIfNotPresentMetadata, anchorMatchWholeWord, anchorMatchWholeWordMetadata, anchorString, anchorStringMetadata, anchorTabProcessorVersion, anchorTabProcessorVersionMetadata, anchorUnits, anchorUnitsMetadata, anchorXOffset, anchorXOffsetMetadata, anchorYOffset, anchorYOffsetMetadata, conditionalParentLabel, conditionalParentLabelMetadata, conditionalParentValue, conditionalParentValueMetadata, customTabId, customTabIdMetadata, documentId, documentIdMetadata, errorDetails, formOrder, formOrderMetadata, formPageLabel, formPageLabelMetadata, formPageNumber, formPageNumberMetadata, height, heightMetadata, mergeField, mergeFieldXml, name, nameMetadata, optional, optionalMetadata, pageNumber, pageNumberMetadata, recipientId, recipientIdGuid, recipientIdGuidMetadata, recipientIdMetadata, scaleValue, scaleValueMetadata, smartContractInformation, status, statusMetadata, tabGroupLabels, tabGroupLabelsMetadata, tabId, tabIdMetadata, tabLabel, tabLabelMetadata, tabOrder, tabOrderMetadata, tabType, tabTypeMetadata, templateLocked, templateLockedMetadata, templateRequired, templateRequiredMetadata, tooltip, toolTipMetadata, width, widthMetadata, xPosition, xPositionMetadata, yPosition, yPositionMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitialHere {\n");
    
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
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentLabelMetadata: ").append(toIndentedString(conditionalParentLabelMetadata)).append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    conditionalParentValueMetadata: ").append(toIndentedString(conditionalParentValueMetadata)).append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    customTabIdMetadata: ").append(toIndentedString(customTabIdMetadata)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentIdMetadata: ").append(toIndentedString(documentIdMetadata)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    formOrder: ").append(toIndentedString(formOrder)).append("\n");
    sb.append("    formOrderMetadata: ").append(toIndentedString(formOrderMetadata)).append("\n");
    sb.append("    formPageLabel: ").append(toIndentedString(formPageLabel)).append("\n");
    sb.append("    formPageLabelMetadata: ").append(toIndentedString(formPageLabelMetadata)).append("\n");
    sb.append("    formPageNumber: ").append(toIndentedString(formPageNumber)).append("\n");
    sb.append("    formPageNumberMetadata: ").append(toIndentedString(formPageNumberMetadata)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    heightMetadata: ").append(toIndentedString(heightMetadata)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    mergeFieldXml: ").append(toIndentedString(mergeFieldXml)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    optionalMetadata: ").append(toIndentedString(optionalMetadata)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageNumberMetadata: ").append(toIndentedString(pageNumberMetadata)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    recipientIdGuidMetadata: ").append(toIndentedString(recipientIdGuidMetadata)).append("\n");
    sb.append("    recipientIdMetadata: ").append(toIndentedString(recipientIdMetadata)).append("\n");
    sb.append("    scaleValue: ").append(toIndentedString(scaleValue)).append("\n");
    sb.append("    scaleValueMetadata: ").append(toIndentedString(scaleValueMetadata)).append("\n");
    sb.append("    smartContractInformation: ").append(toIndentedString(smartContractInformation)).append("\n");
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

