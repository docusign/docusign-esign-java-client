package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MergeField;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.SmartContractInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A tab that allows the recipient to attach supporting documents to an
 * envelope. .
 *
 */
@Schema(description = "A tab that allows the recipient to attach supporting documents to an envelope. ")

public class SignerAttachment {
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

  @JsonProperty("caption")
  private String caption = null;

  @JsonProperty("captionMetadata")
  private PropertyMetadata captionMetadata = null;

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

  @JsonProperty("handDrawRequired")
  private String handDrawRequired = null;

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
   * @return SignerAttachment
   **/
  public SignerAttachment anchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
    return this;
  }

  /**
   * .
   * 
   * @return anchorAllowWhiteSpaceInCharacters
   **/
  @Schema(description = "")
  public String getAnchorAllowWhiteSpaceInCharacters() {
    return anchorAllowWhiteSpaceInCharacters;
  }

  /**
   * setAnchorAllowWhiteSpaceInCharacters.
   **/
  public void setAnchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
  }

  /**
   * anchorAllowWhiteSpaceInCharactersMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorAllowWhiteSpaceInCharactersMetadata(
      PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorAllowWhiteSpaceInCharacters`
   * property is editable..
   * 
   * @return anchorAllowWhiteSpaceInCharactersMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorAllowWhiteSpaceInCharacters` property is editable.")
  public PropertyMetadata getAnchorAllowWhiteSpaceInCharactersMetadata() {
    return anchorAllowWhiteSpaceInCharactersMetadata;
  }

  /**
   * setAnchorAllowWhiteSpaceInCharactersMetadata.
   **/
  public void setAnchorAllowWhiteSpaceInCharactersMetadata(PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
  }

  /**
   * anchorCaseSensitive.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
    return this;
  }

  /**
   * When set to **true**, the anchor string does not consider case when matching
   * strings in the document. The default value is **true**..
   * 
   * @return anchorCaseSensitive
   **/
  @Schema(description = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
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
   * anchorCaseSensitiveMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorCaseSensitive` property is
   * editable..
   * 
   * @return anchorCaseSensitiveMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorCaseSensitive` property is editable.")
  public PropertyMetadata getAnchorCaseSensitiveMetadata() {
    return anchorCaseSensitiveMetadata;
  }

  /**
   * setAnchorCaseSensitiveMetadata.
   **/
  public void setAnchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
  }

  /**
   * anchorHorizontalAlignment.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    return this;
  }

  /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values
   * are **left** or **right**. The default value is **left**..
   * 
   * @return anchorHorizontalAlignment
   **/
  @Schema(description = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
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
   * anchorHorizontalAlignmentMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorHorizontalAlignmentMetadata(PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorHorizontalAlignment` property is
   * editable..
   * 
   * @return anchorHorizontalAlignmentMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorHorizontalAlignment` property is editable.")
  public PropertyMetadata getAnchorHorizontalAlignmentMetadata() {
    return anchorHorizontalAlignmentMetadata;
  }

  /**
   * setAnchorHorizontalAlignmentMetadata.
   **/
  public void setAnchorHorizontalAlignmentMetadata(PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
  }

  /**
   * anchorIgnoreIfNotPresent.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }

  /**
   * When set to **true**, this tab is ignored if anchorString is not found in the
   * document..
   * 
   * @return anchorIgnoreIfNotPresent
   **/
  @Schema(description = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
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
   * anchorIgnoreIfNotPresentMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorIgnoreIfNotPresentMetadata(PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorIgnoreIfNotPresent` property is
   * editable..
   * 
   * @return anchorIgnoreIfNotPresentMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorIgnoreIfNotPresent` property is editable.")
  public PropertyMetadata getAnchorIgnoreIfNotPresentMetadata() {
    return anchorIgnoreIfNotPresentMetadata;
  }

  /**
   * setAnchorIgnoreIfNotPresentMetadata.
   **/
  public void setAnchorIgnoreIfNotPresentMetadata(PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
  }

  /**
   * anchorMatchWholeWord.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
    return this;
  }

  /**
   * When set to **true**, the anchor string in this tab matches whole words only
   * (strings embedded in other strings are ignored.) The default value is
   * **true**..
   * 
   * @return anchorMatchWholeWord
   **/
  @Schema(description = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
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
   * anchorMatchWholeWordMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorMatchWholeWord` property is
   * editable..
   * 
   * @return anchorMatchWholeWordMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorMatchWholeWord` property is editable.")
  public PropertyMetadata getAnchorMatchWholeWordMetadata() {
    return anchorMatchWholeWordMetadata;
  }

  /**
   * setAnchorMatchWholeWordMetadata.
   **/
  public void setAnchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
  }

  /**
   * anchorString.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

  /**
   * Anchor text information for a radio button..
   * 
   * @return anchorString
   **/
  @Schema(description = "Anchor text information for a radio button.")
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
   * anchorStringMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorString` property is editable..
   * 
   * @return anchorStringMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorString` property is editable.")
  public PropertyMetadata getAnchorStringMetadata() {
    return anchorStringMetadata;
  }

  /**
   * setAnchorStringMetadata.
   **/
  public void setAnchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
  }

  /**
   * anchorTabProcessorVersion.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
    return this;
  }

  /**
   * .
   * 
   * @return anchorTabProcessorVersion
   **/
  @Schema(description = "")
  public String getAnchorTabProcessorVersion() {
    return anchorTabProcessorVersion;
  }

  /**
   * setAnchorTabProcessorVersion.
   **/
  public void setAnchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
  }

  /**
   * anchorTabProcessorVersionMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorTabProcessorVersionMetadata(PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * 
   * @return anchorTabProcessorVersionMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public PropertyMetadata getAnchorTabProcessorVersionMetadata() {
    return anchorTabProcessorVersionMetadata;
  }

  /**
   * setAnchorTabProcessorVersionMetadata.
   **/
  public void setAnchorTabProcessorVersionMetadata(PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
  }

  /**
   * anchorUnits.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }

  /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters,
   * centimeters, or inches..
   * 
   * @return anchorUnits
   **/
  @Schema(description = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
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
   * anchorUnitsMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorUnits` property is editable..
   * 
   * @return anchorUnitsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorUnits` property is editable.")
  public PropertyMetadata getAnchorUnitsMetadata() {
    return anchorUnitsMetadata;
  }

  /**
   * setAnchorUnitsMetadata.
   **/
  public void setAnchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
  }

  /**
   * anchorXOffset.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }

  /**
   * Specifies the X axis location of the tab, in anchorUnits, relative to the
   * anchorString..
   * 
   * @return anchorXOffset
   **/
  @Schema(description = "Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.")
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
   * anchorXOffsetMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorXOffset` property is editable..
   * 
   * @return anchorXOffsetMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorXOffset` property is editable.")
  public PropertyMetadata getAnchorXOffsetMetadata() {
    return anchorXOffsetMetadata;
  }

  /**
   * setAnchorXOffsetMetadata.
   **/
  public void setAnchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
  }

  /**
   * anchorYOffset.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }

  /**
   * Specifies the Y axis location of the tab, in anchorUnits, relative to the
   * anchorString..
   * 
   * @return anchorYOffset
   **/
  @Schema(description = "Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.")
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
   * anchorYOffsetMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment anchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorYOffset` property is editable..
   * 
   * @return anchorYOffsetMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorYOffset` property is editable.")
  public PropertyMetadata getAnchorYOffsetMetadata() {
    return anchorYOffsetMetadata;
  }

  /**
   * setAnchorYOffsetMetadata.
   **/
  public void setAnchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
  }

  /**
   * caption.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * .
   * 
   * @return caption
   **/
  @Schema(description = "")
  public String getCaption() {
    return caption;
  }

  /**
   * setCaption.
   **/
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * captionMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment captionMetadata(PropertyMetadata captionMetadata) {
    this.captionMetadata = captionMetadata;
    return this;
  }

  /**
   * Get captionMetadata.
   * 
   * @return captionMetadata
   **/
  @Schema(description = "")
  public PropertyMetadata getCaptionMetadata() {
    return captionMetadata;
  }

  /**
   * setCaptionMetadata.
   **/
  public void setCaptionMetadata(PropertyMetadata captionMetadata) {
    this.captionMetadata = captionMetadata;
  }

  /**
   * conditionalParentLabel.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }

  /**
   * For conditional fields this is the TabLabel of the parent tab that controls
   * this tab's visibility..
   * 
   * @return conditionalParentLabel
   **/
  @Schema(description = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
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
   * conditionalParentLabelMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment conditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `conditionalParentLabel` property is
   * editable..
   * 
   * @return conditionalParentLabelMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `conditionalParentLabel` property is editable.")
  public PropertyMetadata getConditionalParentLabelMetadata() {
    return conditionalParentLabelMetadata;
  }

  /**
   * setConditionalParentLabelMetadata.
   **/
  public void setConditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
  }

  /**
   * conditionalParentValue.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }

  /**
   * For conditional fields, this is the value of the parent tab that controls the
   * tab's visibility. If the parent tab is a Checkbox, Radio button, Optional
   * Signature, or Optional Initial use \"on\" as the value to show that the
   * parent tab is active. .
   * 
   * @return conditionalParentValue
   **/
  @Schema(description = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. ")
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
   * conditionalParentValueMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment conditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `conditionalParentValue` property is
   * editable..
   * 
   * @return conditionalParentValueMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `conditionalParentValue` property is editable.")
  public PropertyMetadata getConditionalParentValueMetadata() {
    return conditionalParentValueMetadata;
  }

  /**
   * setConditionalParentValueMetadata.
   **/
  public void setConditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
  }

  /**
   * customTabId.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment customTabId(String customTabId) {
    this.customTabId = customTabId;
    return this;
  }

  /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This
   * can only be used when adding new tabs for a recipient. When used, the new tab
   * inherits all the custom tab properties..
   * 
   * @return customTabId
   **/
  @Schema(description = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
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
   * customTabIdMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment customTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `customTabId` property is editable..
   * 
   * @return customTabIdMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `customTabId` property is editable.")
  public PropertyMetadata getCustomTabIdMetadata() {
    return customTabIdMetadata;
  }

  /**
   * setCustomTabIdMetadata.
   **/
  public void setCustomTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
  }

  /**
   * documentId.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer
   * to an existing Document's ID attribute..
   * 
   * @return documentId
   **/
  @Schema(description = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
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
   * documentIdMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment documentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `documentId` property is editable..
   * 
   * @return documentIdMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `documentId` property is editable.")
  public PropertyMetadata getDocumentIdMetadata() {
    return documentIdMetadata;
  }

  /**
   * setDocumentIdMetadata.
   **/
  public void setDocumentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
  }

  /**
   * errorDetails.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * This object describes errors that occur. It is only valid for responses and
   * ignored in requests..
   * 
   * @return errorDetails
   **/
  @Schema(description = "This object describes errors that occur. It is only valid for responses and ignored in requests.")
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
   * formOrder.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment formOrder(String formOrder) {
    this.formOrder = formOrder;
    return this;
  }

  /**
   * .
   * 
   * @return formOrder
   **/
  @Schema(description = "")
  public String getFormOrder() {
    return formOrder;
  }

  /**
   * setFormOrder.
   **/
  public void setFormOrder(String formOrder) {
    this.formOrder = formOrder;
  }

  /**
   * formOrderMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment formOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `formOrder` property is editable..
   * 
   * @return formOrderMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `formOrder` property is editable.")
  public PropertyMetadata getFormOrderMetadata() {
    return formOrderMetadata;
  }

  /**
   * setFormOrderMetadata.
   **/
  public void setFormOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
  }

  /**
   * formPageLabel.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment formPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
    return this;
  }

  /**
   * .
   * 
   * @return formPageLabel
   **/
  @Schema(description = "")
  public String getFormPageLabel() {
    return formPageLabel;
  }

  /**
   * setFormPageLabel.
   **/
  public void setFormPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
  }

  /**
   * formPageLabelMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment formPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `formPageLabel` property is editable..
   * 
   * @return formPageLabelMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `formPageLabel` property is editable.")
  public PropertyMetadata getFormPageLabelMetadata() {
    return formPageLabelMetadata;
  }

  /**
   * setFormPageLabelMetadata.
   **/
  public void setFormPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
  }

  /**
   * formPageNumber.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment formPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
    return this;
  }

  /**
   * .
   * 
   * @return formPageNumber
   **/
  @Schema(description = "")
  public String getFormPageNumber() {
    return formPageNumber;
  }

  /**
   * setFormPageNumber.
   **/
  public void setFormPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
  }

  /**
   * formPageNumberMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment formPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `fromPageNumber` property is editable..
   * 
   * @return formPageNumberMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `fromPageNumber` property is editable.")
  public PropertyMetadata getFormPageNumberMetadata() {
    return formPageNumberMetadata;
  }

  /**
   * setFormPageNumberMetadata.
   **/
  public void setFormPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
  }

  /**
   * handDrawRequired.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment handDrawRequired(String handDrawRequired) {
    this.handDrawRequired = handDrawRequired;
    return this;
  }

  /**
   * .
   * 
   * @return handDrawRequired
   **/
  @Schema(description = "")
  public String getHandDrawRequired() {
    return handDrawRequired;
  }

  /**
   * setHandDrawRequired.
   **/
  public void setHandDrawRequired(String handDrawRequired) {
    this.handDrawRequired = handDrawRequired;
  }

  /**
   * height.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Height of the tab in pixels..
   * 
   * @return height
   **/
  @Schema(description = "Height of the tab in pixels.")
  public String getHeight() {
    return height;
  }

  /**
   * setHeight.
   **/
  public void setHeight(String height) {
    this.height = height;
  }

  /**
   * heightMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment heightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `height` property is editable..
   * 
   * @return heightMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `height` property is editable.")
  public PropertyMetadata getHeightMetadata() {
    return heightMetadata;
  }

  /**
   * setHeightMetadata.
   **/
  public void setHeightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
  }

  /**
   * mergeField.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }

  /**
   * Contains the information necessary to map the tab to a field in SalesForce..
   * 
   * @return mergeField
   **/
  @Schema(description = "Contains the information necessary to map the tab to a field in SalesForce.")
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
   * mergeFieldXml.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment mergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
    return this;
  }

  /**
   * .
   * 
   * @return mergeFieldXml
   **/
  @Schema(description = "")
  public String getMergeFieldXml() {
    return mergeFieldXml;
  }

  /**
   * setMergeFieldXml.
   **/
  public void setMergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
  }

  /**
   * name.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * 
   * @return name
   **/
  @Schema(description = "")
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
   * nameMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `name` property is editable. This
   * property is read-only..
   * 
   * @return nameMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `name` property is editable. This property is read-only.")
  public PropertyMetadata getNameMetadata() {
    return nameMetadata;
  }

  /**
   * setNameMetadata.
   **/
  public void setNameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
  }

  /**
   * optional.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment optional(String optional) {
    this.optional = optional;
    return this;
  }

  /**
   * .
   * 
   * @return optional
   **/
  @Schema(description = "")
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
   * optionalMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment optionalMetadata(PropertyMetadata optionalMetadata) {
    this.optionalMetadata = optionalMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `optional` property is editable..
   * 
   * @return optionalMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `optional` property is editable.")
  public PropertyMetadata getOptionalMetadata() {
    return optionalMetadata;
  }

  /**
   * setOptionalMetadata.
   **/
  public void setOptionalMetadata(PropertyMetadata optionalMetadata) {
    this.optionalMetadata = optionalMetadata;
  }

  /**
   * pageNumber.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Specifies the page number on which the tab is located..
   * 
   * @return pageNumber
   **/
  @Schema(description = "Specifies the page number on which the tab is located.")
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
   * pageNumberMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment pageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `pageNumber` property is editable..
   * 
   * @return pageNumberMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `pageNumber` property is editable.")
  public PropertyMetadata getPageNumberMetadata() {
    return pageNumberMetadata;
  }

  /**
   * setPageNumberMetadata.
   **/
  public void setPageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
  }

  /**
   * recipientId.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which
   * recipient is to sign the Document..
   * 
   * @return recipientId
   **/
  @Schema(description = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
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
   * recipientIdGuid.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

  /**
   * .
   * 
   * @return recipientIdGuid
   **/
  @Schema(description = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  /**
   * setRecipientIdGuid.
   **/
  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  /**
   * recipientIdGuidMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment recipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `recipientIdGuid` property is editable..
   * 
   * @return recipientIdGuidMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `recipientIdGuid` property is editable.")
  public PropertyMetadata getRecipientIdGuidMetadata() {
    return recipientIdGuidMetadata;
  }

  /**
   * setRecipientIdGuidMetadata.
   **/
  public void setRecipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
  }

  /**
   * recipientIdMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment recipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `recipientId` property is editable..
   * 
   * @return recipientIdMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `recipientId` property is editable.")
  public PropertyMetadata getRecipientIdMetadata() {
    return recipientIdMetadata;
  }

  /**
   * setRecipientIdMetadata.
   **/
  public void setRecipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
  }

  /**
   * scaleValue.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment scaleValue(String scaleValue) {
    this.scaleValue = scaleValue;
    return this;
  }

  /**
   * .
   * 
   * @return scaleValue
   **/
  @Schema(description = "")
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
   * scaleValueMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment scaleValueMetadata(PropertyMetadata scaleValueMetadata) {
    this.scaleValueMetadata = scaleValueMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `scaleValue` property is editable..
   * 
   * @return scaleValueMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `scaleValue` property is editable.")
  public PropertyMetadata getScaleValueMetadata() {
    return scaleValueMetadata;
  }

  /**
   * setScaleValueMetadata.
   **/
  public void setScaleValueMetadata(PropertyMetadata scaleValueMetadata) {
    this.scaleValueMetadata = scaleValueMetadata;
  }

  /**
   * smartContractInformation.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment smartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * 
   * @return smartContractInformation
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SmartContractInformation getSmartContractInformation() {
    return smartContractInformation;
  }

  /**
   * setSmartContractInformation.
   **/
  public void setSmartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
  }

  /**
   * source.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment source(String source) {
    this.source = source;
    return this;
  }

  /**
   * .
   * 
   * @return source
   **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  /**
   * setSource.
   **/
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * status.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are: * sent - The envelope is
   * sent to the recipients. * created - The envelope is saved as a draft and can
   * be modified and sent later..
   * 
   * @return status
   **/
  @Schema(description = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
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
   * statusMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment statusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `status` property is editable..
   * 
   * @return statusMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `status` property is editable.")
  public PropertyMetadata getStatusMetadata() {
    return statusMetadata;
  }

  /**
   * setStatusMetadata.
   **/
  public void setStatusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
  }

  /**
   * tabGroupLabels.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment tabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
    return this;
  }

  /**
   * addTabGroupLabelsItem.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment addTabGroupLabelsItem(String tabGroupLabelsItem) {
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
   **/
  @Schema(description = "")
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
   * tabGroupLabelsMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment tabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabGroupLabels` property is editable..
   * 
   * @return tabGroupLabelsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabGroupLabels` property is editable.")
  public PropertyMetadata getTabGroupLabelsMetadata() {
    return tabGroupLabelsMetadata;
  }

  /**
   * setTabGroupLabelsMetadata.
   **/
  public void setTabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
  }

  /**
   * tabId.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

  /**
   * The unique identifier for the tab. The tabid can be retrieved with the
   * [ML:GET call]. .
   * 
   * @return tabId
   **/
  @Schema(description = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
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
   * tabIdMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment tabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabId` property is editable..
   * 
   * @return tabIdMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabId` property is editable.")
  public PropertyMetadata getTabIdMetadata() {
    return tabIdMetadata;
  }

  /**
   * setTabIdMetadata.
   **/
  public void setTabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
  }

  /**
   * tabLabel.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

  /**
   * The label string associated with the tab..
   * 
   * @return tabLabel
   **/
  @Schema(description = "The label string associated with the tab.")
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
   * tabLabelMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment tabLabelMetadata(PropertyMetadata tabLabelMetadata) {
    this.tabLabelMetadata = tabLabelMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabLabel` property is editable..
   * 
   * @return tabLabelMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabLabel` property is editable.")
  public PropertyMetadata getTabLabelMetadata() {
    return tabLabelMetadata;
  }

  /**
   * setTabLabelMetadata.
   **/
  public void setTabLabelMetadata(PropertyMetadata tabLabelMetadata) {
    this.tabLabelMetadata = tabLabelMetadata;
  }

  /**
   * tabOrder.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment tabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
    return this;
  }

  /**
   * .
   * 
   * @return tabOrder
   **/
  @Schema(description = "")
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
   * tabOrderMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment tabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabOrder` property is editable..
   * 
   * @return tabOrderMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabOrder` property is editable.")
  public PropertyMetadata getTabOrderMetadata() {
    return tabOrderMetadata;
  }

  /**
   * setTabOrderMetadata.
   **/
  public void setTabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
  }

  /**
   * tabType.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment tabType(String tabType) {
    this.tabType = tabType;
    return this;
  }

  /**
   * .
   * 
   * @return tabType
   **/
  @Schema(description = "")
  public String getTabType() {
    return tabType;
  }

  /**
   * setTabType.
   **/
  public void setTabType(String tabType) {
    this.tabType = tabType;
  }

  /**
   * tabTypeMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment tabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabType` property is editable..
   * 
   * @return tabTypeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabType` property is editable.")
  public PropertyMetadata getTabTypeMetadata() {
    return tabTypeMetadata;
  }

  /**
   * setTabTypeMetadata.
   **/
  public void setTabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
  }

  /**
   * templateLocked.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * When set to **true**, the sender cannot change any attributes of the
   * recipient. Used only when working with template recipients. .
   * 
   * @return templateLocked
   **/
  @Schema(description = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
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
   * templateLockedMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment templateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `templateLocked` property is editable..
   * 
   * @return templateLockedMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `templateLocked` property is editable.")
  public PropertyMetadata getTemplateLockedMetadata() {
    return templateLockedMetadata;
  }

  /**
   * setTemplateLockedMetadata.
   **/
  public void setTemplateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
  }

  /**
   * templateRequired.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * When set to **true**, the sender may not remove the recipient. Used only when
   * working with template recipients..
   * 
   * @return templateRequired
   **/
  @Schema(description = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
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
   * templateRequiredMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment templateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `templateRequired` property is editable..
   * 
   * @return templateRequiredMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `templateRequired` property is editable.")
  public PropertyMetadata getTemplateRequiredMetadata() {
    return templateRequiredMetadata;
  }

  /**
   * setTemplateRequiredMetadata.
   **/
  public void setTemplateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
  }

  /**
   * tooltip.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  /**
   * .
   * 
   * @return tooltip
   **/
  @Schema(description = "")
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
   * toolTipMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment toolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `toolTip` property is editable..
   * 
   * @return toolTipMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `toolTip` property is editable.")
  public PropertyMetadata getToolTipMetadata() {
    return toolTipMetadata;
  }

  /**
   * setToolTipMetadata.
   **/
  public void setToolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
  }

  /**
   * width.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment width(String width) {
    this.width = width;
    return this;
  }

  /**
   * Width of the tab in pixels..
   * 
   * @return width
   **/
  @Schema(description = "Width of the tab in pixels.")
  public String getWidth() {
    return width;
  }

  /**
   * setWidth.
   **/
  public void setWidth(String width) {
    this.width = width;
  }

  /**
   * widthMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment widthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `width` property is editable..
   * 
   * @return widthMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `width` property is editable.")
  public PropertyMetadata getWidthMetadata() {
    return widthMetadata;
  }

  /**
   * setWidthMetadata.
   **/
  public void setWidthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
  }

  /**
   * xPosition.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

  /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses
   * 72 DPI when determining position..
   * 
   * @return xPosition
   **/
  @Schema(description = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
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
   * xPositionMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment xPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `xPosition` property is editable..
   * 
   * @return xPositionMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `xPosition` property is editable.")
  public PropertyMetadata getXPositionMetadata() {
    return xPositionMetadata;
  }

  /**
   * setXPositionMetadata.
   **/
  public void setXPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
  }

  /**
   * yPosition.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

  /**
   * This indicates the vertical offset of the object on the page. DocuSign uses
   * 72 DPI when determining position..
   * 
   * @return yPosition
   **/
  @Schema(description = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
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
   * yPositionMetadata.
   *
   * @return SignerAttachment
   **/
  public SignerAttachment yPositionMetadata(PropertyMetadata yPositionMetadata) {
    this.yPositionMetadata = yPositionMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `yPosition` property is editable..
   * 
   * @return yPositionMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `yPosition` property is editable.")
  public PropertyMetadata getYPositionMetadata() {
    return yPositionMetadata;
  }

  /**
   * setYPositionMetadata.
   **/
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
    SignerAttachment signerAttachment = (SignerAttachment) o;
    return Objects.equals(this.anchorAllowWhiteSpaceInCharacters, signerAttachment.anchorAllowWhiteSpaceInCharacters) &&
        Objects.equals(this.anchorAllowWhiteSpaceInCharactersMetadata,
            signerAttachment.anchorAllowWhiteSpaceInCharactersMetadata)
        &&
        Objects.equals(this.anchorCaseSensitive, signerAttachment.anchorCaseSensitive) &&
        Objects.equals(this.anchorCaseSensitiveMetadata, signerAttachment.anchorCaseSensitiveMetadata) &&
        Objects.equals(this.anchorHorizontalAlignment, signerAttachment.anchorHorizontalAlignment) &&
        Objects.equals(this.anchorHorizontalAlignmentMetadata, signerAttachment.anchorHorizontalAlignmentMetadata) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, signerAttachment.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorIgnoreIfNotPresentMetadata, signerAttachment.anchorIgnoreIfNotPresentMetadata) &&
        Objects.equals(this.anchorMatchWholeWord, signerAttachment.anchorMatchWholeWord) &&
        Objects.equals(this.anchorMatchWholeWordMetadata, signerAttachment.anchorMatchWholeWordMetadata) &&
        Objects.equals(this.anchorString, signerAttachment.anchorString) &&
        Objects.equals(this.anchorStringMetadata, signerAttachment.anchorStringMetadata) &&
        Objects.equals(this.anchorTabProcessorVersion, signerAttachment.anchorTabProcessorVersion) &&
        Objects.equals(this.anchorTabProcessorVersionMetadata, signerAttachment.anchorTabProcessorVersionMetadata) &&
        Objects.equals(this.anchorUnits, signerAttachment.anchorUnits) &&
        Objects.equals(this.anchorUnitsMetadata, signerAttachment.anchorUnitsMetadata) &&
        Objects.equals(this.anchorXOffset, signerAttachment.anchorXOffset) &&
        Objects.equals(this.anchorXOffsetMetadata, signerAttachment.anchorXOffsetMetadata) &&
        Objects.equals(this.anchorYOffset, signerAttachment.anchorYOffset) &&
        Objects.equals(this.anchorYOffsetMetadata, signerAttachment.anchorYOffsetMetadata) &&
        Objects.equals(this.caption, signerAttachment.caption) &&
        Objects.equals(this.captionMetadata, signerAttachment.captionMetadata) &&
        Objects.equals(this.conditionalParentLabel, signerAttachment.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentLabelMetadata, signerAttachment.conditionalParentLabelMetadata) &&
        Objects.equals(this.conditionalParentValue, signerAttachment.conditionalParentValue) &&
        Objects.equals(this.conditionalParentValueMetadata, signerAttachment.conditionalParentValueMetadata) &&
        Objects.equals(this.customTabId, signerAttachment.customTabId) &&
        Objects.equals(this.customTabIdMetadata, signerAttachment.customTabIdMetadata) &&
        Objects.equals(this.documentId, signerAttachment.documentId) &&
        Objects.equals(this.documentIdMetadata, signerAttachment.documentIdMetadata) &&
        Objects.equals(this.errorDetails, signerAttachment.errorDetails) &&
        Objects.equals(this.formOrder, signerAttachment.formOrder) &&
        Objects.equals(this.formOrderMetadata, signerAttachment.formOrderMetadata) &&
        Objects.equals(this.formPageLabel, signerAttachment.formPageLabel) &&
        Objects.equals(this.formPageLabelMetadata, signerAttachment.formPageLabelMetadata) &&
        Objects.equals(this.formPageNumber, signerAttachment.formPageNumber) &&
        Objects.equals(this.formPageNumberMetadata, signerAttachment.formPageNumberMetadata) &&
        Objects.equals(this.handDrawRequired, signerAttachment.handDrawRequired) &&
        Objects.equals(this.height, signerAttachment.height) &&
        Objects.equals(this.heightMetadata, signerAttachment.heightMetadata) &&
        Objects.equals(this.mergeField, signerAttachment.mergeField) &&
        Objects.equals(this.mergeFieldXml, signerAttachment.mergeFieldXml) &&
        Objects.equals(this.name, signerAttachment.name) &&
        Objects.equals(this.nameMetadata, signerAttachment.nameMetadata) &&
        Objects.equals(this.optional, signerAttachment.optional) &&
        Objects.equals(this.optionalMetadata, signerAttachment.optionalMetadata) &&
        Objects.equals(this.pageNumber, signerAttachment.pageNumber) &&
        Objects.equals(this.pageNumberMetadata, signerAttachment.pageNumberMetadata) &&
        Objects.equals(this.recipientId, signerAttachment.recipientId) &&
        Objects.equals(this.recipientIdGuid, signerAttachment.recipientIdGuid) &&
        Objects.equals(this.recipientIdGuidMetadata, signerAttachment.recipientIdGuidMetadata) &&
        Objects.equals(this.recipientIdMetadata, signerAttachment.recipientIdMetadata) &&
        Objects.equals(this.scaleValue, signerAttachment.scaleValue) &&
        Objects.equals(this.scaleValueMetadata, signerAttachment.scaleValueMetadata) &&
        Objects.equals(this.smartContractInformation, signerAttachment.smartContractInformation) &&
        Objects.equals(this.source, signerAttachment.source) &&
        Objects.equals(this.status, signerAttachment.status) &&
        Objects.equals(this.statusMetadata, signerAttachment.statusMetadata) &&
        Objects.equals(this.tabGroupLabels, signerAttachment.tabGroupLabels) &&
        Objects.equals(this.tabGroupLabelsMetadata, signerAttachment.tabGroupLabelsMetadata) &&
        Objects.equals(this.tabId, signerAttachment.tabId) &&
        Objects.equals(this.tabIdMetadata, signerAttachment.tabIdMetadata) &&
        Objects.equals(this.tabLabel, signerAttachment.tabLabel) &&
        Objects.equals(this.tabLabelMetadata, signerAttachment.tabLabelMetadata) &&
        Objects.equals(this.tabOrder, signerAttachment.tabOrder) &&
        Objects.equals(this.tabOrderMetadata, signerAttachment.tabOrderMetadata) &&
        Objects.equals(this.tabType, signerAttachment.tabType) &&
        Objects.equals(this.tabTypeMetadata, signerAttachment.tabTypeMetadata) &&
        Objects.equals(this.templateLocked, signerAttachment.templateLocked) &&
        Objects.equals(this.templateLockedMetadata, signerAttachment.templateLockedMetadata) &&
        Objects.equals(this.templateRequired, signerAttachment.templateRequired) &&
        Objects.equals(this.templateRequiredMetadata, signerAttachment.templateRequiredMetadata) &&
        Objects.equals(this.tooltip, signerAttachment.tooltip) &&
        Objects.equals(this.toolTipMetadata, signerAttachment.toolTipMetadata) &&
        Objects.equals(this.width, signerAttachment.width) &&
        Objects.equals(this.widthMetadata, signerAttachment.widthMetadata) &&
        Objects.equals(this.xPosition, signerAttachment.xPosition) &&
        Objects.equals(this.xPositionMetadata, signerAttachment.xPositionMetadata) &&
        Objects.equals(this.yPosition, signerAttachment.yPosition) &&
        Objects.equals(this.yPositionMetadata, signerAttachment.yPositionMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(anchorAllowWhiteSpaceInCharacters, anchorAllowWhiteSpaceInCharactersMetadata,
        anchorCaseSensitive, anchorCaseSensitiveMetadata, anchorHorizontalAlignment, anchorHorizontalAlignmentMetadata,
        anchorIgnoreIfNotPresent, anchorIgnoreIfNotPresentMetadata, anchorMatchWholeWord, anchorMatchWholeWordMetadata,
        anchorString, anchorStringMetadata, anchorTabProcessorVersion, anchorTabProcessorVersionMetadata, anchorUnits,
        anchorUnitsMetadata, anchorXOffset, anchorXOffsetMetadata, anchorYOffset, anchorYOffsetMetadata, caption,
        captionMetadata, conditionalParentLabel, conditionalParentLabelMetadata, conditionalParentValue,
        conditionalParentValueMetadata, customTabId, customTabIdMetadata, documentId, documentIdMetadata, errorDetails,
        formOrder, formOrderMetadata, formPageLabel, formPageLabelMetadata, formPageNumber, formPageNumberMetadata,
        handDrawRequired, height, heightMetadata, mergeField, mergeFieldXml, name, nameMetadata, optional,
        optionalMetadata, pageNumber, pageNumberMetadata, recipientId, recipientIdGuid, recipientIdGuidMetadata,
        recipientIdMetadata, scaleValue, scaleValueMetadata, smartContractInformation, source, status, statusMetadata,
        tabGroupLabels, tabGroupLabelsMetadata, tabId, tabIdMetadata, tabLabel, tabLabelMetadata, tabOrder,
        tabOrderMetadata, tabType, tabTypeMetadata, templateLocked, templateLockedMetadata, templateRequired,
        templateRequiredMetadata, tooltip, toolTipMetadata, width, widthMetadata, xPosition, xPositionMetadata,
        yPosition, yPositionMetadata);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignerAttachment {\n");

    sb.append("    anchorAllowWhiteSpaceInCharacters: ").append(toIndentedString(anchorAllowWhiteSpaceInCharacters))
        .append("\n");
    sb.append("    anchorAllowWhiteSpaceInCharactersMetadata: ")
        .append(toIndentedString(anchorAllowWhiteSpaceInCharactersMetadata)).append("\n");
    sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    sb.append("    anchorCaseSensitiveMetadata: ").append(toIndentedString(anchorCaseSensitiveMetadata)).append("\n");
    sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    sb.append("    anchorHorizontalAlignmentMetadata: ").append(toIndentedString(anchorHorizontalAlignmentMetadata))
        .append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    sb.append("    anchorIgnoreIfNotPresentMetadata: ").append(toIndentedString(anchorIgnoreIfNotPresentMetadata))
        .append("\n");
    sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    sb.append("    anchorMatchWholeWordMetadata: ").append(toIndentedString(anchorMatchWholeWordMetadata)).append("\n");
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    anchorStringMetadata: ").append(toIndentedString(anchorStringMetadata)).append("\n");
    sb.append("    anchorTabProcessorVersion: ").append(toIndentedString(anchorTabProcessorVersion)).append("\n");
    sb.append("    anchorTabProcessorVersionMetadata: ").append(toIndentedString(anchorTabProcessorVersionMetadata))
        .append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorUnitsMetadata: ").append(toIndentedString(anchorUnitsMetadata)).append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorXOffsetMetadata: ").append(toIndentedString(anchorXOffsetMetadata)).append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    anchorYOffsetMetadata: ").append(toIndentedString(anchorYOffsetMetadata)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    captionMetadata: ").append(toIndentedString(captionMetadata)).append("\n");
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentLabelMetadata: ").append(toIndentedString(conditionalParentLabelMetadata))
        .append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    conditionalParentValueMetadata: ").append(toIndentedString(conditionalParentValueMetadata))
        .append("\n");
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
    sb.append("    handDrawRequired: ").append(toIndentedString(handDrawRequired)).append("\n");
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
