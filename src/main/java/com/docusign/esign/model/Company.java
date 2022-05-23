package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Company. */
public class Company {
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

  @JsonProperty("caption")
  private String caption = null;

  @JsonProperty("captionMetadata")
  private PropertyMetadata captionMetadata = null;

  @JsonProperty("concealValueOnDocument")
  private String concealValueOnDocument = null;

  @JsonProperty("concealValueOnDocumentMetadata")
  private PropertyMetadata concealValueOnDocumentMetadata = null;

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

  @JsonProperty("disableAutoSize")
  private String disableAutoSize = null;

  @JsonProperty("disableAutoSizeMetadata")
  private PropertyMetadata disableAutoSizeMetadata = null;

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

  @JsonProperty("locked")
  private String locked = null;

  @JsonProperty("lockedMetadata")
  private PropertyMetadata lockedMetadata = null;

  @JsonProperty("maxLength")
  private String maxLength = null;

  @JsonProperty("maxLengthMetadata")
  private PropertyMetadata maxLengthMetadata = null;

  @JsonProperty("mergeField")
  private MergeField mergeField = null;

  @JsonProperty("mergeFieldXml")
  private String mergeFieldXml = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameMetadata")
  private PropertyMetadata nameMetadata = null;

  @JsonProperty("originalValue")
  private String originalValue = null;

  @JsonProperty("originalValueMetadata")
  private PropertyMetadata originalValueMetadata = null;

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

  @JsonProperty("required")
  private String required = null;

  @JsonProperty("requiredMetadata")
  private PropertyMetadata requiredMetadata = null;

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

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valueMetadata")
  private PropertyMetadata valueMetadata = null;

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

  /**
   * anchorAllowWhiteSpaceInCharacters.
   *
   * @return Company
   */
  public Company anchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
    return this;
  }

  /**
   * .
   *
   * @return anchorAllowWhiteSpaceInCharacters
   */
  @ApiModelProperty(value = "")
  public String getAnchorAllowWhiteSpaceInCharacters() {
    return anchorAllowWhiteSpaceInCharacters;
  }

  /** setAnchorAllowWhiteSpaceInCharacters. */
  public void setAnchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
  }

  /**
   * anchorAllowWhiteSpaceInCharactersMetadata.
   *
   * @return Company
   */
  public Company anchorAllowWhiteSpaceInCharactersMetadata(
      PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
    return this;
  }

  /**
   * Get anchorAllowWhiteSpaceInCharactersMetadata.
   *
   * @return anchorAllowWhiteSpaceInCharactersMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorAllowWhiteSpaceInCharactersMetadata() {
    return anchorAllowWhiteSpaceInCharactersMetadata;
  }

  /** setAnchorAllowWhiteSpaceInCharactersMetadata. */
  public void setAnchorAllowWhiteSpaceInCharactersMetadata(
      PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
  }

  /**
   * anchorCaseSensitive.
   *
   * @return Company
   */
  public Company anchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
    return this;
  }

  /**
   * When set to **true**, the anchor string does not consider case when matching strings in the
   * document. The default value is **true**..
   *
   * @return anchorCaseSensitive
   */
  @ApiModelProperty(
      value =
          "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }

  /** setAnchorCaseSensitive. */
  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  /**
   * anchorCaseSensitiveMetadata.
   *
   * @return Company
   */
  public Company anchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
    return this;
  }

  /**
   * Get anchorCaseSensitiveMetadata.
   *
   * @return anchorCaseSensitiveMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorCaseSensitiveMetadata() {
    return anchorCaseSensitiveMetadata;
  }

  /** setAnchorCaseSensitiveMetadata. */
  public void setAnchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
  }

  /**
   * anchorHorizontalAlignment.
   *
   * @return Company
   */
  public Company anchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    return this;
  }

  /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or
   * **right**. The default value is **left**..
   *
   * @return anchorHorizontalAlignment
   */
  @ApiModelProperty(
      value =
          "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }

  /** setAnchorHorizontalAlignment. */
  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
  }

  /**
   * anchorHorizontalAlignmentMetadata.
   *
   * @return Company
   */
  public Company anchorHorizontalAlignmentMetadata(
      PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
    return this;
  }

  /**
   * Get anchorHorizontalAlignmentMetadata.
   *
   * @return anchorHorizontalAlignmentMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorHorizontalAlignmentMetadata() {
    return anchorHorizontalAlignmentMetadata;
  }

  /** setAnchorHorizontalAlignmentMetadata. */
  public void setAnchorHorizontalAlignmentMetadata(
      PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
  }

  /**
   * anchorIgnoreIfNotPresent.
   *
   * @return Company
   */
  public Company anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }

  /**
   * When set to **true**, this tab is ignored if anchorString is not found in the document..
   *
   * @return anchorIgnoreIfNotPresent
   */
  @ApiModelProperty(
      value =
          "When set to **true**, this tab is ignored if anchorString is not found in the document.")
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }

  /** setAnchorIgnoreIfNotPresent. */
  public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }

  /**
   * anchorIgnoreIfNotPresentMetadata.
   *
   * @return Company
   */
  public Company anchorIgnoreIfNotPresentMetadata(
      PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
    return this;
  }

  /**
   * Get anchorIgnoreIfNotPresentMetadata.
   *
   * @return anchorIgnoreIfNotPresentMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorIgnoreIfNotPresentMetadata() {
    return anchorIgnoreIfNotPresentMetadata;
  }

  /** setAnchorIgnoreIfNotPresentMetadata. */
  public void setAnchorIgnoreIfNotPresentMetadata(
      PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
  }

  /**
   * anchorMatchWholeWord.
   *
   * @return Company
   */
  public Company anchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
    return this;
  }

  /**
   * When set to **true**, the anchor string in this tab matches whole words only (strings embedded
   * in other strings are ignored.) The default value is **true**..
   *
   * @return anchorMatchWholeWord
   */
  @ApiModelProperty(
      value =
          "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }

  /** setAnchorMatchWholeWord. */
  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  /**
   * anchorMatchWholeWordMetadata.
   *
   * @return Company
   */
  public Company anchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
    return this;
  }

  /**
   * Get anchorMatchWholeWordMetadata.
   *
   * @return anchorMatchWholeWordMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorMatchWholeWordMetadata() {
    return anchorMatchWholeWordMetadata;
  }

  /** setAnchorMatchWholeWordMetadata. */
  public void setAnchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
  }

  /**
   * anchorString.
   *
   * @return Company
   */
  public Company anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

  /**
   * Anchor text information for a radio button..
   *
   * @return anchorString
   */
  @ApiModelProperty(value = "Anchor text information for a radio button.")
  public String getAnchorString() {
    return anchorString;
  }

  /** setAnchorString. */
  public void setAnchorString(String anchorString) {
    this.anchorString = anchorString;
  }

  /**
   * anchorStringMetadata.
   *
   * @return Company
   */
  public Company anchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
    return this;
  }

  /**
   * Get anchorStringMetadata.
   *
   * @return anchorStringMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorStringMetadata() {
    return anchorStringMetadata;
  }

  /** setAnchorStringMetadata. */
  public void setAnchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
  }

  /**
   * anchorTabProcessorVersion.
   *
   * @return Company
   */
  public Company anchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
    return this;
  }

  /**
   * .
   *
   * @return anchorTabProcessorVersion
   */
  @ApiModelProperty(value = "")
  public String getAnchorTabProcessorVersion() {
    return anchorTabProcessorVersion;
  }

  /** setAnchorTabProcessorVersion. */
  public void setAnchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
  }

  /**
   * anchorTabProcessorVersionMetadata.
   *
   * @return Company
   */
  public Company anchorTabProcessorVersionMetadata(
      PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
    return this;
  }

  /**
   * Get anchorTabProcessorVersionMetadata.
   *
   * @return anchorTabProcessorVersionMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorTabProcessorVersionMetadata() {
    return anchorTabProcessorVersionMetadata;
  }

  /** setAnchorTabProcessorVersionMetadata. */
  public void setAnchorTabProcessorVersionMetadata(
      PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
  }

  /**
   * anchorUnits.
   *
   * @return Company
   */
  public Company anchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }

  /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or
   * inches..
   *
   * @return anchorUnits
   */
  @ApiModelProperty(
      value =
          "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
  public String getAnchorUnits() {
    return anchorUnits;
  }

  /** setAnchorUnits. */
  public void setAnchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
  }

  /**
   * anchorUnitsMetadata.
   *
   * @return Company
   */
  public Company anchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
    return this;
  }

  /**
   * Get anchorUnitsMetadata.
   *
   * @return anchorUnitsMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorUnitsMetadata() {
    return anchorUnitsMetadata;
  }

  /** setAnchorUnitsMetadata. */
  public void setAnchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
  }

  /**
   * anchorXOffset.
   *
   * @return Company
   */
  public Company anchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }

  /**
   * Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString..
   *
   * @return anchorXOffset
   */
  @ApiModelProperty(
      value =
          "Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorXOffset() {
    return anchorXOffset;
  }

  /** setAnchorXOffset. */
  public void setAnchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
  }

  /**
   * anchorXOffsetMetadata.
   *
   * @return Company
   */
  public Company anchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
    return this;
  }

  /**
   * Get anchorXOffsetMetadata.
   *
   * @return anchorXOffsetMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorXOffsetMetadata() {
    return anchorXOffsetMetadata;
  }

  /** setAnchorXOffsetMetadata. */
  public void setAnchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
  }

  /**
   * anchorYOffset.
   *
   * @return Company
   */
  public Company anchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }

  /**
   * Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString..
   *
   * @return anchorYOffset
   */
  @ApiModelProperty(
      value =
          "Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorYOffset() {
    return anchorYOffset;
  }

  /** setAnchorYOffset. */
  public void setAnchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
  }

  /**
   * anchorYOffsetMetadata.
   *
   * @return Company
   */
  public Company anchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
    return this;
  }

  /**
   * Get anchorYOffsetMetadata.
   *
   * @return anchorYOffsetMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getAnchorYOffsetMetadata() {
    return anchorYOffsetMetadata;
  }

  /** setAnchorYOffsetMetadata. */
  public void setAnchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
  }

  /**
   * bold.
   *
   * @return Company
   */
  public Company bold(String bold) {
    this.bold = bold;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is bold..
   *
   * @return bold
   */
  @ApiModelProperty(value = "When set to **true**, the information in the tab is bold.")
  public String getBold() {
    return bold;
  }

  /** setBold. */
  public void setBold(String bold) {
    this.bold = bold;
  }

  /**
   * boldMetadata.
   *
   * @return Company
   */
  public Company boldMetadata(PropertyMetadata boldMetadata) {
    this.boldMetadata = boldMetadata;
    return this;
  }

  /**
   * Get boldMetadata.
   *
   * @return boldMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getBoldMetadata() {
    return boldMetadata;
  }

  /** setBoldMetadata. */
  public void setBoldMetadata(PropertyMetadata boldMetadata) {
    this.boldMetadata = boldMetadata;
  }

  /**
   * caption.
   *
   * @return Company
   */
  public Company caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * .
   *
   * @return caption
   */
  @ApiModelProperty(value = "")
  public String getCaption() {
    return caption;
  }

  /** setCaption. */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * captionMetadata.
   *
   * @return Company
   */
  public Company captionMetadata(PropertyMetadata captionMetadata) {
    this.captionMetadata = captionMetadata;
    return this;
  }

  /**
   * Get captionMetadata.
   *
   * @return captionMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getCaptionMetadata() {
    return captionMetadata;
  }

  /** setCaptionMetadata. */
  public void setCaptionMetadata(PropertyMetadata captionMetadata) {
    this.captionMetadata = captionMetadata;
  }

  /**
   * concealValueOnDocument.
   *
   * @return Company
   */
  public Company concealValueOnDocument(String concealValueOnDocument) {
    this.concealValueOnDocument = concealValueOnDocument;
    return this;
  }

  /**
   * When set to **true**, the field appears normally while the recipient is adding or modifying the
   * information in the field, but the data is not visible (the characters are hidden by asterisks)
   * to any other signer or the sender. When an envelope is completed the information is available
   * to the sender through the Form Data link in the DocuSign Console. This setting applies only to
   * text boxes and does not affect list boxes, radio buttons, or check boxes..
   *
   * @return concealValueOnDocument
   */
  @ApiModelProperty(
      value =
          "When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.  When an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.  This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.")
  public String getConcealValueOnDocument() {
    return concealValueOnDocument;
  }

  /** setConcealValueOnDocument. */
  public void setConcealValueOnDocument(String concealValueOnDocument) {
    this.concealValueOnDocument = concealValueOnDocument;
  }

  /**
   * concealValueOnDocumentMetadata.
   *
   * @return Company
   */
  public Company concealValueOnDocumentMetadata(PropertyMetadata concealValueOnDocumentMetadata) {
    this.concealValueOnDocumentMetadata = concealValueOnDocumentMetadata;
    return this;
  }

  /**
   * Get concealValueOnDocumentMetadata.
   *
   * @return concealValueOnDocumentMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getConcealValueOnDocumentMetadata() {
    return concealValueOnDocumentMetadata;
  }

  /** setConcealValueOnDocumentMetadata. */
  public void setConcealValueOnDocumentMetadata(PropertyMetadata concealValueOnDocumentMetadata) {
    this.concealValueOnDocumentMetadata = concealValueOnDocumentMetadata;
  }

  /**
   * conditionalParentLabel.
   *
   * @return Company
   */
  public Company conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }

  /**
   * For conditional fields this is the TabLabel of the parent tab that controls this tab's
   * visibility..
   *
   * @return conditionalParentLabel
   */
  @ApiModelProperty(
      value =
          "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }

  /** setConditionalParentLabel. */
  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  /**
   * conditionalParentLabelMetadata.
   *
   * @return Company
   */
  public Company conditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
    return this;
  }

  /**
   * Get conditionalParentLabelMetadata.
   *
   * @return conditionalParentLabelMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getConditionalParentLabelMetadata() {
    return conditionalParentLabelMetadata;
  }

  /** setConditionalParentLabelMetadata. */
  public void setConditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
  }

  /**
   * conditionalParentValue.
   *
   * @return Company
   */
  public Company conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }

  /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.
   * If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use
   * \"on\" as the value to show that the parent tab is active. .
   *
   * @return conditionalParentValue
   */
  @ApiModelProperty(
      value =
          "For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. ")
  public String getConditionalParentValue() {
    return conditionalParentValue;
  }

  /** setConditionalParentValue. */
  public void setConditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
  }

  /**
   * conditionalParentValueMetadata.
   *
   * @return Company
   */
  public Company conditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
    return this;
  }

  /**
   * Get conditionalParentValueMetadata.
   *
   * @return conditionalParentValueMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getConditionalParentValueMetadata() {
    return conditionalParentValueMetadata;
  }

  /** setConditionalParentValueMetadata. */
  public void setConditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
  }

  /**
   * customTabId.
   *
   * @return Company
   */
  public Company customTabId(String customTabId) {
    this.customTabId = customTabId;
    return this;
  }

  /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used
   * when adding new tabs for a recipient. When used, the new tab inherits all the custom tab
   * properties..
   *
   * @return customTabId
   */
  @ApiModelProperty(
      value =
          "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
  public String getCustomTabId() {
    return customTabId;
  }

  /** setCustomTabId. */
  public void setCustomTabId(String customTabId) {
    this.customTabId = customTabId;
  }

  /**
   * customTabIdMetadata.
   *
   * @return Company
   */
  public Company customTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
    return this;
  }

  /**
   * Get customTabIdMetadata.
   *
   * @return customTabIdMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getCustomTabIdMetadata() {
    return customTabIdMetadata;
  }

  /** setCustomTabIdMetadata. */
  public void setCustomTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
  }

  /**
   * disableAutoSize.
   *
   * @return Company
   */
  public Company disableAutoSize(String disableAutoSize) {
    this.disableAutoSize = disableAutoSize;
    return this;
  }

  /**
   * When set to **true**, disables the auto sizing of single line text boxes in the signing screen
   * when the signer enters data. If disabled users will only be able enter as much data as the text
   * box can hold. By default this is false. This property only affects single line text boxes..
   *
   * @return disableAutoSize
   */
  @ApiModelProperty(
      value =
          "When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.")
  public String getDisableAutoSize() {
    return disableAutoSize;
  }

  /** setDisableAutoSize. */
  public void setDisableAutoSize(String disableAutoSize) {
    this.disableAutoSize = disableAutoSize;
  }

  /**
   * disableAutoSizeMetadata.
   *
   * @return Company
   */
  public Company disableAutoSizeMetadata(PropertyMetadata disableAutoSizeMetadata) {
    this.disableAutoSizeMetadata = disableAutoSizeMetadata;
    return this;
  }

  /**
   * Get disableAutoSizeMetadata.
   *
   * @return disableAutoSizeMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getDisableAutoSizeMetadata() {
    return disableAutoSizeMetadata;
  }

  /** setDisableAutoSizeMetadata. */
  public void setDisableAutoSizeMetadata(PropertyMetadata disableAutoSizeMetadata) {
    this.disableAutoSizeMetadata = disableAutoSizeMetadata;
  }

  /**
   * documentId.
   *
   * @return Company
   */
  public Company documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing
   * Document's ID attribute..
   *
   * @return documentId
   */
  @ApiModelProperty(
      value =
          "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  /** setDocumentId. */
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  /**
   * documentIdMetadata.
   *
   * @return Company
   */
  public Company documentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
    return this;
  }

  /**
   * Get documentIdMetadata.
   *
   * @return documentIdMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getDocumentIdMetadata() {
    return documentIdMetadata;
  }

  /** setDocumentIdMetadata. */
  public void setDocumentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
  }

  /**
   * errorDetails.
   *
   * @return Company
   */
  public Company errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   *
   * @return errorDetails
   */
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /** setErrorDetails. */
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  /**
   * font.
   *
   * @return Company
   */
  public Company font(String font) {
    this.font = font;
    return this;
  }

  /**
   * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri,
   * CourierNew, Garamond, Georgia, Helvetica, LucidaConsole, Tahoma, TimesNewRoman, Trebuchet,
   * Verdana, MSGothic, MSMincho, Default..
   *
   * @return font
   */
  @ApiModelProperty(
      value =
          "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
  public String getFont() {
    return font;
  }

  /** setFont. */
  public void setFont(String font) {
    this.font = font;
  }

  /**
   * fontColor.
   *
   * @return Company
   */
  public Company fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

  /**
   * The font color used for the information in the tab. Possible values are: Black, BrightBlue,
   * BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White..
   *
   * @return fontColor
   */
  @ApiModelProperty(
      value =
          "The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
  public String getFontColor() {
    return fontColor;
  }

  /** setFontColor. */
  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  /**
   * fontColorMetadata.
   *
   * @return Company
   */
  public Company fontColorMetadata(PropertyMetadata fontColorMetadata) {
    this.fontColorMetadata = fontColorMetadata;
    return this;
  }

  /**
   * Get fontColorMetadata.
   *
   * @return fontColorMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getFontColorMetadata() {
    return fontColorMetadata;
  }

  /** setFontColorMetadata. */
  public void setFontColorMetadata(PropertyMetadata fontColorMetadata) {
    this.fontColorMetadata = fontColorMetadata;
  }

  /**
   * fontMetadata.
   *
   * @return Company
   */
  public Company fontMetadata(PropertyMetadata fontMetadata) {
    this.fontMetadata = fontMetadata;
    return this;
  }

  /**
   * Get fontMetadata.
   *
   * @return fontMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getFontMetadata() {
    return fontMetadata;
  }

  /** setFontMetadata. */
  public void setFontMetadata(PropertyMetadata fontMetadata) {
    this.fontMetadata = fontMetadata;
  }

  /**
   * fontSize.
   *
   * @return Company
   */
  public Company fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * The font size used for the information in the tab. Possible values are: Size7, Size8, Size9,
   * Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36,
   * Size48, or Size72..
   *
   * @return fontSize
   */
  @ApiModelProperty(
      value =
          "The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
  public String getFontSize() {
    return fontSize;
  }

  /** setFontSize. */
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  /**
   * fontSizeMetadata.
   *
   * @return Company
   */
  public Company fontSizeMetadata(PropertyMetadata fontSizeMetadata) {
    this.fontSizeMetadata = fontSizeMetadata;
    return this;
  }

  /**
   * Get fontSizeMetadata.
   *
   * @return fontSizeMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getFontSizeMetadata() {
    return fontSizeMetadata;
  }

  /** setFontSizeMetadata. */
  public void setFontSizeMetadata(PropertyMetadata fontSizeMetadata) {
    this.fontSizeMetadata = fontSizeMetadata;
  }

  /**
   * formOrder.
   *
   * @return Company
   */
  public Company formOrder(String formOrder) {
    this.formOrder = formOrder;
    return this;
  }

  /**
   * .
   *
   * @return formOrder
   */
  @ApiModelProperty(value = "")
  public String getFormOrder() {
    return formOrder;
  }

  /** setFormOrder. */
  public void setFormOrder(String formOrder) {
    this.formOrder = formOrder;
  }

  /**
   * formOrderMetadata.
   *
   * @return Company
   */
  public Company formOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
    return this;
  }

  /**
   * Get formOrderMetadata.
   *
   * @return formOrderMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getFormOrderMetadata() {
    return formOrderMetadata;
  }

  /** setFormOrderMetadata. */
  public void setFormOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
  }

  /**
   * formPageLabel.
   *
   * @return Company
   */
  public Company formPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
    return this;
  }

  /**
   * .
   *
   * @return formPageLabel
   */
  @ApiModelProperty(value = "")
  public String getFormPageLabel() {
    return formPageLabel;
  }

  /** setFormPageLabel. */
  public void setFormPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
  }

  /**
   * formPageLabelMetadata.
   *
   * @return Company
   */
  public Company formPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
    return this;
  }

  /**
   * Get formPageLabelMetadata.
   *
   * @return formPageLabelMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getFormPageLabelMetadata() {
    return formPageLabelMetadata;
  }

  /** setFormPageLabelMetadata. */
  public void setFormPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
  }

  /**
   * formPageNumber.
   *
   * @return Company
   */
  public Company formPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
    return this;
  }

  /**
   * .
   *
   * @return formPageNumber
   */
  @ApiModelProperty(value = "")
  public String getFormPageNumber() {
    return formPageNumber;
  }

  /** setFormPageNumber. */
  public void setFormPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
  }

  /**
   * formPageNumberMetadata.
   *
   * @return Company
   */
  public Company formPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
    return this;
  }

  /**
   * Get formPageNumberMetadata.
   *
   * @return formPageNumberMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getFormPageNumberMetadata() {
    return formPageNumberMetadata;
  }

  /** setFormPageNumberMetadata. */
  public void setFormPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
  }

  /**
   * height.
   *
   * @return Company
   */
  public Company height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Height of the tab in pixels..
   *
   * @return height
   */
  @ApiModelProperty(value = "Height of the tab in pixels.")
  public String getHeight() {
    return height;
  }

  /** setHeight. */
  public void setHeight(String height) {
    this.height = height;
  }

  /**
   * heightMetadata.
   *
   * @return Company
   */
  public Company heightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
    return this;
  }

  /**
   * Get heightMetadata.
   *
   * @return heightMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getHeightMetadata() {
    return heightMetadata;
  }

  /** setHeightMetadata. */
  public void setHeightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
  }

  /**
   * italic.
   *
   * @return Company
   */
  public Company italic(String italic) {
    this.italic = italic;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is italic..
   *
   * @return italic
   */
  @ApiModelProperty(value = "When set to **true**, the information in the tab is italic.")
  public String getItalic() {
    return italic;
  }

  /** setItalic. */
  public void setItalic(String italic) {
    this.italic = italic;
  }

  /**
   * italicMetadata.
   *
   * @return Company
   */
  public Company italicMetadata(PropertyMetadata italicMetadata) {
    this.italicMetadata = italicMetadata;
    return this;
  }

  /**
   * Get italicMetadata.
   *
   * @return italicMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getItalicMetadata() {
    return italicMetadata;
  }

  /** setItalicMetadata. */
  public void setItalicMetadata(PropertyMetadata italicMetadata) {
    this.italicMetadata = italicMetadata;
  }

  /**
   * localePolicy.
   *
   * @return Company
   */
  public Company localePolicy(LocalePolicyTab localePolicy) {
    this.localePolicy = localePolicy;
    return this;
  }

  /**
   * Get localePolicy.
   *
   * @return localePolicy
   */
  @ApiModelProperty(value = "")
  public LocalePolicyTab getLocalePolicy() {
    return localePolicy;
  }

  /** setLocalePolicy. */
  public void setLocalePolicy(LocalePolicyTab localePolicy) {
    this.localePolicy = localePolicy;
  }

  /**
   * locked.
   *
   * @return Company
   */
  public Company locked(String locked) {
    this.locked = locked;
    return this;
  }

  /**
   * When set to **true**, the signer cannot change the data of the custom tab..
   *
   * @return locked
   */
  @ApiModelProperty(
      value = "When set to **true**, the signer cannot change the data of the custom tab.")
  public String getLocked() {
    return locked;
  }

  /** setLocked. */
  public void setLocked(String locked) {
    this.locked = locked;
  }

  /**
   * lockedMetadata.
   *
   * @return Company
   */
  public Company lockedMetadata(PropertyMetadata lockedMetadata) {
    this.lockedMetadata = lockedMetadata;
    return this;
  }

  /**
   * Get lockedMetadata.
   *
   * @return lockedMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getLockedMetadata() {
    return lockedMetadata;
  }

  /** setLockedMetadata. */
  public void setLockedMetadata(PropertyMetadata lockedMetadata) {
    this.lockedMetadata = lockedMetadata;
  }

  /**
   * maxLength.
   *
   * @return Company
   */
  public Company maxLength(String maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * An optional value that describes the maximum length of the property when the property is a
   * string..
   *
   * @return maxLength
   */
  @ApiModelProperty(
      value =
          "An optional value that describes the maximum length of the property when the property is a string.")
  public String getMaxLength() {
    return maxLength;
  }

  /** setMaxLength. */
  public void setMaxLength(String maxLength) {
    this.maxLength = maxLength;
  }

  /**
   * maxLengthMetadata.
   *
   * @return Company
   */
  public Company maxLengthMetadata(PropertyMetadata maxLengthMetadata) {
    this.maxLengthMetadata = maxLengthMetadata;
    return this;
  }

  /**
   * Get maxLengthMetadata.
   *
   * @return maxLengthMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getMaxLengthMetadata() {
    return maxLengthMetadata;
  }

  /** setMaxLengthMetadata. */
  public void setMaxLengthMetadata(PropertyMetadata maxLengthMetadata) {
    this.maxLengthMetadata = maxLengthMetadata;
  }

  /**
   * mergeField.
   *
   * @return Company
   */
  public Company mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }

  /**
   * Get mergeField.
   *
   * @return mergeField
   */
  @ApiModelProperty(value = "")
  public MergeField getMergeField() {
    return mergeField;
  }

  /** setMergeField. */
  public void setMergeField(MergeField mergeField) {
    this.mergeField = mergeField;
  }

  /**
   * mergeFieldXml.
   *
   * @return Company
   */
  public Company mergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
    return this;
  }

  /**
   * .
   *
   * @return mergeFieldXml
   */
  @ApiModelProperty(value = "")
  public String getMergeFieldXml() {
    return mergeFieldXml;
  }

  /** setMergeFieldXml. */
  public void setMergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
  }

  /**
   * name.
   *
   * @return Company
   */
  public Company name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies the tool tip text for the tab..
   *
   * @return name
   */
  @ApiModelProperty(value = "Specifies the tool tip text for the tab.")
  public String getName() {
    return name;
  }

  /** setName. */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * nameMetadata.
   *
   * @return Company
   */
  public Company nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

  /**
   * Get nameMetadata.
   *
   * @return nameMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getNameMetadata() {
    return nameMetadata;
  }

  /** setNameMetadata. */
  public void setNameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
  }

  /**
   * originalValue.
   *
   * @return Company
   */
  public Company originalValue(String originalValue) {
    this.originalValue = originalValue;
    return this;
  }

  /**
   * The initial value of the tab when it was sent to the recipient. .
   *
   * @return originalValue
   */
  @ApiModelProperty(value = "The initial value of the tab when it was sent to the recipient. ")
  public String getOriginalValue() {
    return originalValue;
  }

  /** setOriginalValue. */
  public void setOriginalValue(String originalValue) {
    this.originalValue = originalValue;
  }

  /**
   * originalValueMetadata.
   *
   * @return Company
   */
  public Company originalValueMetadata(PropertyMetadata originalValueMetadata) {
    this.originalValueMetadata = originalValueMetadata;
    return this;
  }

  /**
   * Get originalValueMetadata.
   *
   * @return originalValueMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getOriginalValueMetadata() {
    return originalValueMetadata;
  }

  /** setOriginalValueMetadata. */
  public void setOriginalValueMetadata(PropertyMetadata originalValueMetadata) {
    this.originalValueMetadata = originalValueMetadata;
  }

  /**
   * pageNumber.
   *
   * @return Company
   */
  public Company pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Specifies the page number on which the tab is located..
   *
   * @return pageNumber
   */
  @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
  public String getPageNumber() {
    return pageNumber;
  }

  /** setPageNumber. */
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  /**
   * pageNumberMetadata.
   *
   * @return Company
   */
  public Company pageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
    return this;
  }

  /**
   * Get pageNumberMetadata.
   *
   * @return pageNumberMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getPageNumberMetadata() {
    return pageNumberMetadata;
  }

  /** setPageNumberMetadata. */
  public void setPageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
  }

  /**
   * recipientId.
   *
   * @return Company
   */
  public Company recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign
   * the Document..
   *
   * @return recipientId
   */
  @ApiModelProperty(
      value =
          "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  /** setRecipientId. */
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  /**
   * recipientIdGuid.
   *
   * @return Company
   */
  public Company recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

  /**
   * .
   *
   * @return recipientIdGuid
   */
  @ApiModelProperty(value = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  /** setRecipientIdGuid. */
  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  /**
   * recipientIdGuidMetadata.
   *
   * @return Company
   */
  public Company recipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
    return this;
  }

  /**
   * Get recipientIdGuidMetadata.
   *
   * @return recipientIdGuidMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getRecipientIdGuidMetadata() {
    return recipientIdGuidMetadata;
  }

  /** setRecipientIdGuidMetadata. */
  public void setRecipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
  }

  /**
   * recipientIdMetadata.
   *
   * @return Company
   */
  public Company recipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
    return this;
  }

  /**
   * Get recipientIdMetadata.
   *
   * @return recipientIdMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getRecipientIdMetadata() {
    return recipientIdMetadata;
  }

  /** setRecipientIdMetadata. */
  public void setRecipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
  }

  /**
   * required.
   *
   * @return Company
   */
  public Company required(String required) {
    this.required = required;
    return this;
  }

  /**
   * When set to **true**, the signer is required to fill out this tab.
   *
   * @return required
   */
  @ApiModelProperty(value = "When set to **true**, the signer is required to fill out this tab")
  public String getRequired() {
    return required;
  }

  /** setRequired. */
  public void setRequired(String required) {
    this.required = required;
  }

  /**
   * requiredMetadata.
   *
   * @return Company
   */
  public Company requiredMetadata(PropertyMetadata requiredMetadata) {
    this.requiredMetadata = requiredMetadata;
    return this;
  }

  /**
   * Get requiredMetadata.
   *
   * @return requiredMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getRequiredMetadata() {
    return requiredMetadata;
  }

  /** setRequiredMetadata. */
  public void setRequiredMetadata(PropertyMetadata requiredMetadata) {
    this.requiredMetadata = requiredMetadata;
  }

  /**
   * smartContractInformation.
   *
   * @return Company
   */
  public Company smartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
    return this;
  }

  /**
   * Get smartContractInformation.
   *
   * @return smartContractInformation
   */
  @ApiModelProperty(value = "")
  public SmartContractInformation getSmartContractInformation() {
    return smartContractInformation;
  }

  /** setSmartContractInformation. */
  public void setSmartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
  }

  /**
   * source.
   *
   * @return Company
   */
  public Company source(String source) {
    this.source = source;
    return this;
  }

  /**
   * .
   *
   * @return source
   */
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  /** setSource. */
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * status.
   *
   * @return Company
   */
  public Company status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are: * sent - The envelope is sent to the
   * recipients. * created - The envelope is saved as a draft and can be modified and sent later..
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /** setStatus. */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * statusMetadata.
   *
   * @return Company
   */
  public Company statusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
    return this;
  }

  /**
   * Get statusMetadata.
   *
   * @return statusMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getStatusMetadata() {
    return statusMetadata;
  }

  /** setStatusMetadata. */
  public void setStatusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
  }

  /**
   * tabGroupLabels.
   *
   * @return Company
   */
  public Company tabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
    return this;
  }

  /**
   * addTabGroupLabelsItem.
   *
   * @return Company
   */
  public Company addTabGroupLabelsItem(String tabGroupLabelsItem) {
    if (this.tabGroupLabels == null) {
      this.tabGroupLabels = new java.util.ArrayList<>();
    }
    this.tabGroupLabels.add(tabGroupLabelsItem);
    return this;
  }

  /**
   * .
   *
   * @return tabGroupLabels
   */
  @ApiModelProperty(value = "")
  public java.util.List<String> getTabGroupLabels() {
    return tabGroupLabels;
  }

  /** setTabGroupLabels. */
  public void setTabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
  }

  /**
   * tabGroupLabelsMetadata.
   *
   * @return Company
   */
  public Company tabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
    return this;
  }

  /**
   * Get tabGroupLabelsMetadata.
   *
   * @return tabGroupLabelsMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabGroupLabelsMetadata() {
    return tabGroupLabelsMetadata;
  }

  /** setTabGroupLabelsMetadata. */
  public void setTabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
  }

  /**
   * tabId.
   *
   * @return Company
   */
  public Company tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

  /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call]. .
   *
   * @return tabId
   */
  @ApiModelProperty(
      value =
          "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  /** setTabId. */
  public void setTabId(String tabId) {
    this.tabId = tabId;
  }

  /**
   * tabIdMetadata.
   *
   * @return Company
   */
  public Company tabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
    return this;
  }

  /**
   * Get tabIdMetadata.
   *
   * @return tabIdMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabIdMetadata() {
    return tabIdMetadata;
  }

  /** setTabIdMetadata. */
  public void setTabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
  }

  /**
   * tabLabel.
   *
   * @return Company
   */
  public Company tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

  /**
   * The label string associated with the tab..
   *
   * @return tabLabel
   */
  @ApiModelProperty(value = "The label string associated with the tab.")
  public String getTabLabel() {
    return tabLabel;
  }

  /** setTabLabel. */
  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }

  /**
   * tabLabelMetadata.
   *
   * @return Company
   */
  public Company tabLabelMetadata(PropertyMetadata tabLabelMetadata) {
    this.tabLabelMetadata = tabLabelMetadata;
    return this;
  }

  /**
   * Get tabLabelMetadata.
   *
   * @return tabLabelMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabLabelMetadata() {
    return tabLabelMetadata;
  }

  /** setTabLabelMetadata. */
  public void setTabLabelMetadata(PropertyMetadata tabLabelMetadata) {
    this.tabLabelMetadata = tabLabelMetadata;
  }

  /**
   * tabOrder.
   *
   * @return Company
   */
  public Company tabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
    return this;
  }

  /**
   * .
   *
   * @return tabOrder
   */
  @ApiModelProperty(value = "")
  public String getTabOrder() {
    return tabOrder;
  }

  /** setTabOrder. */
  public void setTabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
  }

  /**
   * tabOrderMetadata.
   *
   * @return Company
   */
  public Company tabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
    return this;
  }

  /**
   * Get tabOrderMetadata.
   *
   * @return tabOrderMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabOrderMetadata() {
    return tabOrderMetadata;
  }

  /** setTabOrderMetadata. */
  public void setTabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
  }

  /**
   * tabType.
   *
   * @return Company
   */
  public Company tabType(String tabType) {
    this.tabType = tabType;
    return this;
  }

  /**
   * .
   *
   * @return tabType
   */
  @ApiModelProperty(value = "")
  public String getTabType() {
    return tabType;
  }

  /** setTabType. */
  public void setTabType(String tabType) {
    this.tabType = tabType;
  }

  /**
   * tabTypeMetadata.
   *
   * @return Company
   */
  public Company tabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
    return this;
  }

  /**
   * Get tabTypeMetadata.
   *
   * @return tabTypeMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTabTypeMetadata() {
    return tabTypeMetadata;
  }

  /** setTabTypeMetadata. */
  public void setTabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
  }

  /**
   * templateLocked.
   *
   * @return Company
   */
  public Company templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when
   * working with template recipients. .
   *
   * @return templateLocked
   */
  @ApiModelProperty(
      value =
          "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  /** setTemplateLocked. */
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  /**
   * templateLockedMetadata.
   *
   * @return Company
   */
  public Company templateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
    return this;
  }

  /**
   * Get templateLockedMetadata.
   *
   * @return templateLockedMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTemplateLockedMetadata() {
    return templateLockedMetadata;
  }

  /** setTemplateLockedMetadata. */
  public void setTemplateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
  }

  /**
   * templateRequired.
   *
   * @return Company
   */
  public Company templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with
   * template recipients..
   *
   * @return templateRequired
   */
  @ApiModelProperty(
      value =
          "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  /** setTemplateRequired. */
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  /**
   * templateRequiredMetadata.
   *
   * @return Company
   */
  public Company templateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
    return this;
  }

  /**
   * Get templateRequiredMetadata.
   *
   * @return templateRequiredMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getTemplateRequiredMetadata() {
    return templateRequiredMetadata;
  }

  /** setTemplateRequiredMetadata. */
  public void setTemplateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
  }

  /**
   * tooltip.
   *
   * @return Company
   */
  public Company tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  /**
   * .
   *
   * @return tooltip
   */
  @ApiModelProperty(value = "")
  public String getTooltip() {
    return tooltip;
  }

  /** setTooltip. */
  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  /**
   * toolTipMetadata.
   *
   * @return Company
   */
  public Company toolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
    return this;
  }

  /**
   * Get toolTipMetadata.
   *
   * @return toolTipMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getToolTipMetadata() {
    return toolTipMetadata;
  }

  /** setToolTipMetadata. */
  public void setToolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
  }

  /**
   * underline.
   *
   * @return Company
   */
  public Company underline(String underline) {
    this.underline = underline;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is underlined..
   *
   * @return underline
   */
  @ApiModelProperty(value = "When set to **true**, the information in the tab is underlined.")
  public String getUnderline() {
    return underline;
  }

  /** setUnderline. */
  public void setUnderline(String underline) {
    this.underline = underline;
  }

  /**
   * underlineMetadata.
   *
   * @return Company
   */
  public Company underlineMetadata(PropertyMetadata underlineMetadata) {
    this.underlineMetadata = underlineMetadata;
    return this;
  }

  /**
   * Get underlineMetadata.
   *
   * @return underlineMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getUnderlineMetadata() {
    return underlineMetadata;
  }

  /** setUnderlineMetadata. */
  public void setUnderlineMetadata(PropertyMetadata underlineMetadata) {
    this.underlineMetadata = underlineMetadata;
  }

  /**
   * value.
   *
   * @return Company
   */
  public Company value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value of the tab. .
   *
   * @return value
   */
  @ApiModelProperty(value = "Specifies the value of the tab. ")
  public String getValue() {
    return value;
  }

  /** setValue. */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * valueMetadata.
   *
   * @return Company
   */
  public Company valueMetadata(PropertyMetadata valueMetadata) {
    this.valueMetadata = valueMetadata;
    return this;
  }

  /**
   * Get valueMetadata.
   *
   * @return valueMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getValueMetadata() {
    return valueMetadata;
  }

  /** setValueMetadata. */
  public void setValueMetadata(PropertyMetadata valueMetadata) {
    this.valueMetadata = valueMetadata;
  }

  /**
   * width.
   *
   * @return Company
   */
  public Company width(String width) {
    this.width = width;
    return this;
  }

  /**
   * Width of the tab in pixels..
   *
   * @return width
   */
  @ApiModelProperty(value = "Width of the tab in pixels.")
  public String getWidth() {
    return width;
  }

  /** setWidth. */
  public void setWidth(String width) {
    this.width = width;
  }

  /**
   * widthMetadata.
   *
   * @return Company
   */
  public Company widthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
    return this;
  }

  /**
   * Get widthMetadata.
   *
   * @return widthMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getWidthMetadata() {
    return widthMetadata;
  }

  /** setWidthMetadata. */
  public void setWidthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
  }

  /**
   * xPosition.
   *
   * @return Company
   */
  public Company xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

  /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when
   * determining position..
   *
   * @return xPosition
   */
  @ApiModelProperty(
      value =
          "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getXPosition() {
    return xPosition;
  }

  /** setXPosition. */
  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }

  /**
   * xPositionMetadata.
   *
   * @return Company
   */
  public Company xPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
    return this;
  }

  /**
   * Get xPositionMetadata.
   *
   * @return xPositionMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getXPositionMetadata() {
    return xPositionMetadata;
  }

  /** setXPositionMetadata. */
  public void setXPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
  }

  /**
   * yPosition.
   *
   * @return Company
   */
  public Company yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

  /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when
   * determining position..
   *
   * @return yPosition
   */
  @ApiModelProperty(
      value =
          "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getYPosition() {
    return yPosition;
  }

  /** setYPosition. */
  public void setYPosition(String yPosition) {
    this.yPosition = yPosition;
  }

  /**
   * yPositionMetadata.
   *
   * @return Company
   */
  public Company yPositionMetadata(PropertyMetadata yPositionMetadata) {
    this.yPositionMetadata = yPositionMetadata;
    return this;
  }

  /**
   * Get yPositionMetadata.
   *
   * @return yPositionMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getYPositionMetadata() {
    return yPositionMetadata;
  }

  /** setYPositionMetadata. */
  public void setYPositionMetadata(PropertyMetadata yPositionMetadata) {
    this.yPositionMetadata = yPositionMetadata;
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
    Company company = (Company) o;
    return Objects.equals(
            this.anchorAllowWhiteSpaceInCharacters, company.anchorAllowWhiteSpaceInCharacters)
        && Objects.equals(
            this.anchorAllowWhiteSpaceInCharactersMetadata,
            company.anchorAllowWhiteSpaceInCharactersMetadata)
        && Objects.equals(this.anchorCaseSensitive, company.anchorCaseSensitive)
        && Objects.equals(this.anchorCaseSensitiveMetadata, company.anchorCaseSensitiveMetadata)
        && Objects.equals(this.anchorHorizontalAlignment, company.anchorHorizontalAlignment)
        && Objects.equals(
            this.anchorHorizontalAlignmentMetadata, company.anchorHorizontalAlignmentMetadata)
        && Objects.equals(this.anchorIgnoreIfNotPresent, company.anchorIgnoreIfNotPresent)
        && Objects.equals(
            this.anchorIgnoreIfNotPresentMetadata, company.anchorIgnoreIfNotPresentMetadata)
        && Objects.equals(this.anchorMatchWholeWord, company.anchorMatchWholeWord)
        && Objects.equals(this.anchorMatchWholeWordMetadata, company.anchorMatchWholeWordMetadata)
        && Objects.equals(this.anchorString, company.anchorString)
        && Objects.equals(this.anchorStringMetadata, company.anchorStringMetadata)
        && Objects.equals(this.anchorTabProcessorVersion, company.anchorTabProcessorVersion)
        && Objects.equals(
            this.anchorTabProcessorVersionMetadata, company.anchorTabProcessorVersionMetadata)
        && Objects.equals(this.anchorUnits, company.anchorUnits)
        && Objects.equals(this.anchorUnitsMetadata, company.anchorUnitsMetadata)
        && Objects.equals(this.anchorXOffset, company.anchorXOffset)
        && Objects.equals(this.anchorXOffsetMetadata, company.anchorXOffsetMetadata)
        && Objects.equals(this.anchorYOffset, company.anchorYOffset)
        && Objects.equals(this.anchorYOffsetMetadata, company.anchorYOffsetMetadata)
        && Objects.equals(this.bold, company.bold)
        && Objects.equals(this.boldMetadata, company.boldMetadata)
        && Objects.equals(this.caption, company.caption)
        && Objects.equals(this.captionMetadata, company.captionMetadata)
        && Objects.equals(this.concealValueOnDocument, company.concealValueOnDocument)
        && Objects.equals(
            this.concealValueOnDocumentMetadata, company.concealValueOnDocumentMetadata)
        && Objects.equals(this.conditionalParentLabel, company.conditionalParentLabel)
        && Objects.equals(
            this.conditionalParentLabelMetadata, company.conditionalParentLabelMetadata)
        && Objects.equals(this.conditionalParentValue, company.conditionalParentValue)
        && Objects.equals(
            this.conditionalParentValueMetadata, company.conditionalParentValueMetadata)
        && Objects.equals(this.customTabId, company.customTabId)
        && Objects.equals(this.customTabIdMetadata, company.customTabIdMetadata)
        && Objects.equals(this.disableAutoSize, company.disableAutoSize)
        && Objects.equals(this.disableAutoSizeMetadata, company.disableAutoSizeMetadata)
        && Objects.equals(this.documentId, company.documentId)
        && Objects.equals(this.documentIdMetadata, company.documentIdMetadata)
        && Objects.equals(this.errorDetails, company.errorDetails)
        && Objects.equals(this.font, company.font)
        && Objects.equals(this.fontColor, company.fontColor)
        && Objects.equals(this.fontColorMetadata, company.fontColorMetadata)
        && Objects.equals(this.fontMetadata, company.fontMetadata)
        && Objects.equals(this.fontSize, company.fontSize)
        && Objects.equals(this.fontSizeMetadata, company.fontSizeMetadata)
        && Objects.equals(this.formOrder, company.formOrder)
        && Objects.equals(this.formOrderMetadata, company.formOrderMetadata)
        && Objects.equals(this.formPageLabel, company.formPageLabel)
        && Objects.equals(this.formPageLabelMetadata, company.formPageLabelMetadata)
        && Objects.equals(this.formPageNumber, company.formPageNumber)
        && Objects.equals(this.formPageNumberMetadata, company.formPageNumberMetadata)
        && Objects.equals(this.height, company.height)
        && Objects.equals(this.heightMetadata, company.heightMetadata)
        && Objects.equals(this.italic, company.italic)
        && Objects.equals(this.italicMetadata, company.italicMetadata)
        && Objects.equals(this.localePolicy, company.localePolicy)
        && Objects.equals(this.locked, company.locked)
        && Objects.equals(this.lockedMetadata, company.lockedMetadata)
        && Objects.equals(this.maxLength, company.maxLength)
        && Objects.equals(this.maxLengthMetadata, company.maxLengthMetadata)
        && Objects.equals(this.mergeField, company.mergeField)
        && Objects.equals(this.mergeFieldXml, company.mergeFieldXml)
        && Objects.equals(this.name, company.name)
        && Objects.equals(this.nameMetadata, company.nameMetadata)
        && Objects.equals(this.originalValue, company.originalValue)
        && Objects.equals(this.originalValueMetadata, company.originalValueMetadata)
        && Objects.equals(this.pageNumber, company.pageNumber)
        && Objects.equals(this.pageNumberMetadata, company.pageNumberMetadata)
        && Objects.equals(this.recipientId, company.recipientId)
        && Objects.equals(this.recipientIdGuid, company.recipientIdGuid)
        && Objects.equals(this.recipientIdGuidMetadata, company.recipientIdGuidMetadata)
        && Objects.equals(this.recipientIdMetadata, company.recipientIdMetadata)
        && Objects.equals(this.required, company.required)
        && Objects.equals(this.requiredMetadata, company.requiredMetadata)
        && Objects.equals(this.smartContractInformation, company.smartContractInformation)
        && Objects.equals(this.source, company.source)
        && Objects.equals(this.status, company.status)
        && Objects.equals(this.statusMetadata, company.statusMetadata)
        && Objects.equals(this.tabGroupLabels, company.tabGroupLabels)
        && Objects.equals(this.tabGroupLabelsMetadata, company.tabGroupLabelsMetadata)
        && Objects.equals(this.tabId, company.tabId)
        && Objects.equals(this.tabIdMetadata, company.tabIdMetadata)
        && Objects.equals(this.tabLabel, company.tabLabel)
        && Objects.equals(this.tabLabelMetadata, company.tabLabelMetadata)
        && Objects.equals(this.tabOrder, company.tabOrder)
        && Objects.equals(this.tabOrderMetadata, company.tabOrderMetadata)
        && Objects.equals(this.tabType, company.tabType)
        && Objects.equals(this.tabTypeMetadata, company.tabTypeMetadata)
        && Objects.equals(this.templateLocked, company.templateLocked)
        && Objects.equals(this.templateLockedMetadata, company.templateLockedMetadata)
        && Objects.equals(this.templateRequired, company.templateRequired)
        && Objects.equals(this.templateRequiredMetadata, company.templateRequiredMetadata)
        && Objects.equals(this.tooltip, company.tooltip)
        && Objects.equals(this.toolTipMetadata, company.toolTipMetadata)
        && Objects.equals(this.underline, company.underline)
        && Objects.equals(this.underlineMetadata, company.underlineMetadata)
        && Objects.equals(this.value, company.value)
        && Objects.equals(this.valueMetadata, company.valueMetadata)
        && Objects.equals(this.width, company.width)
        && Objects.equals(this.widthMetadata, company.widthMetadata)
        && Objects.equals(this.xPosition, company.xPosition)
        && Objects.equals(this.xPositionMetadata, company.xPositionMetadata)
        && Objects.equals(this.yPosition, company.yPosition)
        && Objects.equals(this.yPositionMetadata, company.yPositionMetadata);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        anchorAllowWhiteSpaceInCharacters,
        anchorAllowWhiteSpaceInCharactersMetadata,
        anchorCaseSensitive,
        anchorCaseSensitiveMetadata,
        anchorHorizontalAlignment,
        anchorHorizontalAlignmentMetadata,
        anchorIgnoreIfNotPresent,
        anchorIgnoreIfNotPresentMetadata,
        anchorMatchWholeWord,
        anchorMatchWholeWordMetadata,
        anchorString,
        anchorStringMetadata,
        anchorTabProcessorVersion,
        anchorTabProcessorVersionMetadata,
        anchorUnits,
        anchorUnitsMetadata,
        anchorXOffset,
        anchorXOffsetMetadata,
        anchorYOffset,
        anchorYOffsetMetadata,
        bold,
        boldMetadata,
        caption,
        captionMetadata,
        concealValueOnDocument,
        concealValueOnDocumentMetadata,
        conditionalParentLabel,
        conditionalParentLabelMetadata,
        conditionalParentValue,
        conditionalParentValueMetadata,
        customTabId,
        customTabIdMetadata,
        disableAutoSize,
        disableAutoSizeMetadata,
        documentId,
        documentIdMetadata,
        errorDetails,
        font,
        fontColor,
        fontColorMetadata,
        fontMetadata,
        fontSize,
        fontSizeMetadata,
        formOrder,
        formOrderMetadata,
        formPageLabel,
        formPageLabelMetadata,
        formPageNumber,
        formPageNumberMetadata,
        height,
        heightMetadata,
        italic,
        italicMetadata,
        localePolicy,
        locked,
        lockedMetadata,
        maxLength,
        maxLengthMetadata,
        mergeField,
        mergeFieldXml,
        name,
        nameMetadata,
        originalValue,
        originalValueMetadata,
        pageNumber,
        pageNumberMetadata,
        recipientId,
        recipientIdGuid,
        recipientIdGuidMetadata,
        recipientIdMetadata,
        required,
        requiredMetadata,
        smartContractInformation,
        source,
        status,
        statusMetadata,
        tabGroupLabels,
        tabGroupLabelsMetadata,
        tabId,
        tabIdMetadata,
        tabLabel,
        tabLabelMetadata,
        tabOrder,
        tabOrderMetadata,
        tabType,
        tabTypeMetadata,
        templateLocked,
        templateLockedMetadata,
        templateRequired,
        templateRequiredMetadata,
        tooltip,
        toolTipMetadata,
        underline,
        underlineMetadata,
        value,
        valueMetadata,
        width,
        widthMetadata,
        xPosition,
        xPositionMetadata,
        yPosition,
        yPositionMetadata);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");

    sb.append("    anchorAllowWhiteSpaceInCharacters: ")
        .append(toIndentedString(anchorAllowWhiteSpaceInCharacters))
        .append("\n");
    sb.append("    anchorAllowWhiteSpaceInCharactersMetadata: ")
        .append(toIndentedString(anchorAllowWhiteSpaceInCharactersMetadata))
        .append("\n");
    sb.append("    anchorCaseSensitive: ")
        .append(toIndentedString(anchorCaseSensitive))
        .append("\n");
    sb.append("    anchorCaseSensitiveMetadata: ")
        .append(toIndentedString(anchorCaseSensitiveMetadata))
        .append("\n");
    sb.append("    anchorHorizontalAlignment: ")
        .append(toIndentedString(anchorHorizontalAlignment))
        .append("\n");
    sb.append("    anchorHorizontalAlignmentMetadata: ")
        .append(toIndentedString(anchorHorizontalAlignmentMetadata))
        .append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ")
        .append(toIndentedString(anchorIgnoreIfNotPresent))
        .append("\n");
    sb.append("    anchorIgnoreIfNotPresentMetadata: ")
        .append(toIndentedString(anchorIgnoreIfNotPresentMetadata))
        .append("\n");
    sb.append("    anchorMatchWholeWord: ")
        .append(toIndentedString(anchorMatchWholeWord))
        .append("\n");
    sb.append("    anchorMatchWholeWordMetadata: ")
        .append(toIndentedString(anchorMatchWholeWordMetadata))
        .append("\n");
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    anchorStringMetadata: ")
        .append(toIndentedString(anchorStringMetadata))
        .append("\n");
    sb.append("    anchorTabProcessorVersion: ")
        .append(toIndentedString(anchorTabProcessorVersion))
        .append("\n");
    sb.append("    anchorTabProcessorVersionMetadata: ")
        .append(toIndentedString(anchorTabProcessorVersionMetadata))
        .append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorUnitsMetadata: ")
        .append(toIndentedString(anchorUnitsMetadata))
        .append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorXOffsetMetadata: ")
        .append(toIndentedString(anchorXOffsetMetadata))
        .append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    anchorYOffsetMetadata: ")
        .append(toIndentedString(anchorYOffsetMetadata))
        .append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    boldMetadata: ").append(toIndentedString(boldMetadata)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    captionMetadata: ").append(toIndentedString(captionMetadata)).append("\n");
    sb.append("    concealValueOnDocument: ")
        .append(toIndentedString(concealValueOnDocument))
        .append("\n");
    sb.append("    concealValueOnDocumentMetadata: ")
        .append(toIndentedString(concealValueOnDocumentMetadata))
        .append("\n");
    sb.append("    conditionalParentLabel: ")
        .append(toIndentedString(conditionalParentLabel))
        .append("\n");
    sb.append("    conditionalParentLabelMetadata: ")
        .append(toIndentedString(conditionalParentLabelMetadata))
        .append("\n");
    sb.append("    conditionalParentValue: ")
        .append(toIndentedString(conditionalParentValue))
        .append("\n");
    sb.append("    conditionalParentValueMetadata: ")
        .append(toIndentedString(conditionalParentValueMetadata))
        .append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    customTabIdMetadata: ")
        .append(toIndentedString(customTabIdMetadata))
        .append("\n");
    sb.append("    disableAutoSize: ").append(toIndentedString(disableAutoSize)).append("\n");
    sb.append("    disableAutoSizeMetadata: ")
        .append(toIndentedString(disableAutoSizeMetadata))
        .append("\n");
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
    sb.append("    formPageLabelMetadata: ")
        .append(toIndentedString(formPageLabelMetadata))
        .append("\n");
    sb.append("    formPageNumber: ").append(toIndentedString(formPageNumber)).append("\n");
    sb.append("    formPageNumberMetadata: ")
        .append(toIndentedString(formPageNumberMetadata))
        .append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    heightMetadata: ").append(toIndentedString(heightMetadata)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    italicMetadata: ").append(toIndentedString(italicMetadata)).append("\n");
    sb.append("    localePolicy: ").append(toIndentedString(localePolicy)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    lockedMetadata: ").append(toIndentedString(lockedMetadata)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxLengthMetadata: ").append(toIndentedString(maxLengthMetadata)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    mergeFieldXml: ").append(toIndentedString(mergeFieldXml)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    sb.append("    originalValueMetadata: ")
        .append(toIndentedString(originalValueMetadata))
        .append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageNumberMetadata: ").append(toIndentedString(pageNumberMetadata)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    recipientIdGuidMetadata: ")
        .append(toIndentedString(recipientIdGuidMetadata))
        .append("\n");
    sb.append("    recipientIdMetadata: ")
        .append(toIndentedString(recipientIdMetadata))
        .append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    requiredMetadata: ").append(toIndentedString(requiredMetadata)).append("\n");
    sb.append("    smartContractInformation: ")
        .append(toIndentedString(smartContractInformation))
        .append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMetadata: ").append(toIndentedString(statusMetadata)).append("\n");
    sb.append("    tabGroupLabels: ").append(toIndentedString(tabGroupLabels)).append("\n");
    sb.append("    tabGroupLabelsMetadata: ")
        .append(toIndentedString(tabGroupLabelsMetadata))
        .append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    tabIdMetadata: ").append(toIndentedString(tabIdMetadata)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    sb.append("    tabLabelMetadata: ").append(toIndentedString(tabLabelMetadata)).append("\n");
    sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
    sb.append("    tabOrderMetadata: ").append(toIndentedString(tabOrderMetadata)).append("\n");
    sb.append("    tabType: ").append(toIndentedString(tabType)).append("\n");
    sb.append("    tabTypeMetadata: ").append(toIndentedString(tabTypeMetadata)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateLockedMetadata: ")
        .append(toIndentedString(templateLockedMetadata))
        .append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    templateRequiredMetadata: ")
        .append(toIndentedString(templateRequiredMetadata))
        .append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    toolTipMetadata: ").append(toIndentedString(toolTipMetadata)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    underlineMetadata: ").append(toIndentedString(underlineMetadata)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueMetadata: ").append(toIndentedString(valueMetadata)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
