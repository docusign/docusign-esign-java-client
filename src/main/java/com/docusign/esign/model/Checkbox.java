package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectedObjectDetails;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.ExtensionData;
import com.docusign.esign.model.MergeField;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.SmartContractInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * A tab that allows the recipient to select a yes/no (on/off) option. .
 *
 */
@Schema(description = "A tab that allows the recipient to select a yes/no (on/off) option. ")

public class Checkbox implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("agreementAttribute")
  private String agreementAttribute = null;

  @JsonProperty("agreementAttributeLocked")
  private String agreementAttributeLocked = null;

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

  @JsonProperty("conditionalParentLabel")
  private String conditionalParentLabel = null;

  @JsonProperty("conditionalParentLabelMetadata")
  private PropertyMetadata conditionalParentLabelMetadata = null;

  @JsonProperty("conditionalParentValue")
  private String conditionalParentValue = null;

  @JsonProperty("conditionalParentValueMetadata")
  private PropertyMetadata conditionalParentValueMetadata = null;

  @JsonProperty("connectedObjectDetails")
  private ConnectedObjectDetails connectedObjectDetails = null;

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

  @JsonProperty("extensionData")
  private ExtensionData extensionData = null;

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

  @JsonProperty("locked")
  private String locked = null;

  @JsonProperty("lockedMetadata")
  private PropertyMetadata lockedMetadata = null;

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

  @JsonProperty("required")
  private String required = null;

  @JsonProperty("requiredMetadata")
  private PropertyMetadata requiredMetadata = null;

  @JsonProperty("requireInitialOnSharedChange")
  private String requireInitialOnSharedChange = null;

  @JsonProperty("requireInitialOnSharedChangeMetadata")
  private PropertyMetadata requireInitialOnSharedChangeMetadata = null;

  @JsonProperty("selected")
  private String selected = null;

  @JsonProperty("selectedMetadata")
  private PropertyMetadata selectedMetadata = null;

  @JsonProperty("selectedOriginal")
  private String selectedOriginal = null;

  @JsonProperty("selectedOriginalMetadata")
  private PropertyMetadata selectedOriginalMetadata = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("sharedMetadata")
  private PropertyMetadata sharedMetadata = null;

  @JsonProperty("shareToRecipients")
  private String shareToRecipients = null;

  @JsonProperty("shareToRecipientsMetadata")
  private PropertyMetadata shareToRecipientsMetadata = null;

  @JsonProperty("smartContractInformation")
  private SmartContractInformation smartContractInformation = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusMetadata")
  private PropertyMetadata statusMetadata = null;

  @JsonProperty("tabFullyQualifiedPath")
  private String tabFullyQualifiedPath = null;

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

  @JsonProperty("warningDetails")
  private ErrorDetails warningDetails = null;

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
   * agreementAttribute.
   *
   * @return Checkbox
   **/
  public Checkbox agreementAttribute(String agreementAttribute) {
    this.agreementAttribute = agreementAttribute;
    return this;
  }

  /**
   * .
   * @return agreementAttribute
   **/
  @Schema(description = "")
  public String getAgreementAttribute() {
    return agreementAttribute;
  }

  /**
   * setAgreementAttribute.
   **/
  public void setAgreementAttribute(String agreementAttribute) {
    this.agreementAttribute = agreementAttribute;
  }


  /**
   * agreementAttributeLocked.
   *
   * @return Checkbox
   **/
  public Checkbox agreementAttributeLocked(String agreementAttributeLocked) {
    this.agreementAttributeLocked = agreementAttributeLocked;
    return this;
  }

  /**
   * .
   * @return agreementAttributeLocked
   **/
  @Schema(description = "")
  public String getAgreementAttributeLocked() {
    return agreementAttributeLocked;
  }

  /**
   * setAgreementAttributeLocked.
   **/
  public void setAgreementAttributeLocked(String agreementAttributeLocked) {
    this.agreementAttributeLocked = agreementAttributeLocked;
  }


  /**
   * anchorAllowWhiteSpaceInCharacters.
   *
   * @return Checkbox
   **/
  public Checkbox anchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox anchorAllowWhiteSpaceInCharactersMetadata(PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorAllowWhiteSpaceInCharacters` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox anchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
    return this;
  }

  /**
   * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**..
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
   * @return Checkbox
   **/
  public Checkbox anchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorCaseSensitive` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox anchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    return this;
  }

  /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**..
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
   * @return Checkbox
   **/
  public Checkbox anchorHorizontalAlignmentMetadata(PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorHorizontalAlignment` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }

  /**
   * When set to **true**, this tab is ignored if anchorString is not found in the document..
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
   * @return Checkbox
   **/
  public Checkbox anchorIgnoreIfNotPresentMetadata(PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorIgnoreIfNotPresent` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox anchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
    return this;
  }

  /**
   * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**..
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
   * @return Checkbox
   **/
  public Checkbox anchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorMatchWholeWord` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

  /**
   * Anchor text information for a radio button..
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
   * @return Checkbox
   **/
  public Checkbox anchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorString` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox anchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox anchorTabProcessorVersionMetadata(PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
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
   * @return Checkbox
   **/
  public Checkbox anchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }

  /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches..
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
   * @return Checkbox
   **/
  public Checkbox anchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorUnits` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox anchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }

  /**
   * Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString..
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
   * @return Checkbox
   **/
  public Checkbox anchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorXOffset` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox anchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }

  /**
   * Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString..
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
   * @return Checkbox
   **/
  public Checkbox anchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorYOffset` property is editable..
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
   * bold.
   *
   * @return Checkbox
   **/
  public Checkbox bold(String bold) {
    this.bold = bold;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is bold..
   * @return bold
   **/
  @Schema(description = "When set to **true**, the information in the tab is bold.")
  public String getBold() {
    return bold;
  }

  /**
   * setBold.
   **/
  public void setBold(String bold) {
    this.bold = bold;
  }


  /**
   * boldMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox boldMetadata(PropertyMetadata boldMetadata) {
    this.boldMetadata = boldMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `bold` property is editable..
   * @return boldMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `bold` property is editable.")
  public PropertyMetadata getBoldMetadata() {
    return boldMetadata;
  }

  /**
   * setBoldMetadata.
   **/
  public void setBoldMetadata(PropertyMetadata boldMetadata) {
    this.boldMetadata = boldMetadata;
  }


  /**
   * caption.
   *
   * @return Checkbox
   **/
  public Checkbox caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox captionMetadata(PropertyMetadata captionMetadata) {
    this.captionMetadata = captionMetadata;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }

  /**
   * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility..
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
   * @return Checkbox
   **/
  public Checkbox conditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `conditionalParentLabel` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }

  /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. .
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
   * @return Checkbox
   **/
  public Checkbox conditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `conditionalParentValue` property is editable..
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
   * connectedObjectDetails.
   *
   * @return Checkbox
   **/
  public Checkbox connectedObjectDetails(ConnectedObjectDetails connectedObjectDetails) {
    this.connectedObjectDetails = connectedObjectDetails;
    return this;
  }

  /**
   * .
   * @return connectedObjectDetails
   **/
  @Schema(description = "")
  public ConnectedObjectDetails getConnectedObjectDetails() {
    return connectedObjectDetails;
  }

  /**
   * setConnectedObjectDetails.
   **/
  public void setConnectedObjectDetails(ConnectedObjectDetails connectedObjectDetails) {
    this.connectedObjectDetails = connectedObjectDetails;
  }


  /**
   * customTabId.
   *
   * @return Checkbox
   **/
  public Checkbox customTabId(String customTabId) {
    this.customTabId = customTabId;
    return this;
  }

  /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties..
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
   * @return Checkbox
   **/
  public Checkbox customTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `customTabId` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute..
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
   * @return Checkbox
   **/
  public Checkbox documentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `documentId` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
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
   * extensionData.
   *
   * @return Checkbox
   **/
  public Checkbox extensionData(ExtensionData extensionData) {
    this.extensionData = extensionData;
    return this;
  }

  /**
   * .
   * @return extensionData
   **/
  @Schema(description = "")
  public ExtensionData getExtensionData() {
    return extensionData;
  }

  /**
   * setExtensionData.
   **/
  public void setExtensionData(ExtensionData extensionData) {
    this.extensionData = extensionData;
  }


  /**
   * font.
   *
   * @return Checkbox
   **/
  public Checkbox font(String font) {
    this.font = font;
    return this;
  }

  /**
   * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default..
   * @return font
   **/
  @Schema(description = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
  public String getFont() {
    return font;
  }

  /**
   * setFont.
   **/
  public void setFont(String font) {
    this.font = font;
  }


  /**
   * fontColor.
   *
   * @return Checkbox
   **/
  public Checkbox fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

  /**
   * The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White..
   * @return fontColor
   **/
  @Schema(description = "The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
  public String getFontColor() {
    return fontColor;
  }

  /**
   * setFontColor.
   **/
  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }


  /**
   * fontColorMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox fontColorMetadata(PropertyMetadata fontColorMetadata) {
    this.fontColorMetadata = fontColorMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `fontColor` property is editable..
   * @return fontColorMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `fontColor` property is editable.")
  public PropertyMetadata getFontColorMetadata() {
    return fontColorMetadata;
  }

  /**
   * setFontColorMetadata.
   **/
  public void setFontColorMetadata(PropertyMetadata fontColorMetadata) {
    this.fontColorMetadata = fontColorMetadata;
  }


  /**
   * fontMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox fontMetadata(PropertyMetadata fontMetadata) {
    this.fontMetadata = fontMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `font` property is editable..
   * @return fontMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `font` property is editable.")
  public PropertyMetadata getFontMetadata() {
    return fontMetadata;
  }

  /**
   * setFontMetadata.
   **/
  public void setFontMetadata(PropertyMetadata fontMetadata) {
    this.fontMetadata = fontMetadata;
  }


  /**
   * fontSize.
   *
   * @return Checkbox
   **/
  public Checkbox fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72..
   * @return fontSize
   **/
  @Schema(description = "The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
  public String getFontSize() {
    return fontSize;
  }

  /**
   * setFontSize.
   **/
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }


  /**
   * fontSizeMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox fontSizeMetadata(PropertyMetadata fontSizeMetadata) {
    this.fontSizeMetadata = fontSizeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `fontSize` property is editable..
   * @return fontSizeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `fontSize` property is editable.")
  public PropertyMetadata getFontSizeMetadata() {
    return fontSizeMetadata;
  }

  /**
   * setFontSizeMetadata.
   **/
  public void setFontSizeMetadata(PropertyMetadata fontSizeMetadata) {
    this.fontSizeMetadata = fontSizeMetadata;
  }


  /**
   * formOrder.
   *
   * @return Checkbox
   **/
  public Checkbox formOrder(String formOrder) {
    this.formOrder = formOrder;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox formOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `formOrder` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox formPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox formPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `formPageLabel` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox formPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox formPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `fromPageNumber` property is editable..
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
   * height.
   *
   * @return Checkbox
   **/
  public Checkbox height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Height of the tab in pixels..
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
   * @return Checkbox
   **/
  public Checkbox heightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `height` property is editable..
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
   * italic.
   *
   * @return Checkbox
   **/
  public Checkbox italic(String italic) {
    this.italic = italic;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is italic..
   * @return italic
   **/
  @Schema(description = "When set to **true**, the information in the tab is italic.")
  public String getItalic() {
    return italic;
  }

  /**
   * setItalic.
   **/
  public void setItalic(String italic) {
    this.italic = italic;
  }


  /**
   * italicMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox italicMetadata(PropertyMetadata italicMetadata) {
    this.italicMetadata = italicMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `italic` property is editable..
   * @return italicMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `italic` property is editable.")
  public PropertyMetadata getItalicMetadata() {
    return italicMetadata;
  }

  /**
   * setItalicMetadata.
   **/
  public void setItalicMetadata(PropertyMetadata italicMetadata) {
    this.italicMetadata = italicMetadata;
  }


  /**
   * locked.
   *
   * @return Checkbox
   **/
  public Checkbox locked(String locked) {
    this.locked = locked;
    return this;
  }

  /**
   * When set to **true**, the signer cannot change the data of the custom tab..
   * @return locked
   **/
  @Schema(description = "When set to **true**, the signer cannot change the data of the custom tab.")
  public String getLocked() {
    return locked;
  }

  /**
   * setLocked.
   **/
  public void setLocked(String locked) {
    this.locked = locked;
  }


  /**
   * lockedMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox lockedMetadata(PropertyMetadata lockedMetadata) {
    this.lockedMetadata = lockedMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `locked` property is editable..
   * @return lockedMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `locked` property is editable.")
  public PropertyMetadata getLockedMetadata() {
    return lockedMetadata;
  }

  /**
   * setLockedMetadata.
   **/
  public void setLockedMetadata(PropertyMetadata lockedMetadata) {
    this.lockedMetadata = lockedMetadata;
  }


  /**
   * mergeField.
   *
   * @return Checkbox
   **/
  public Checkbox mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }

  /**
   * Contains the information necessary to map the tab to a field in SalesForce..
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
   * @return Checkbox
   **/
  public Checkbox mergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies the tool tip text for the tab..
   * @return name
   **/
  @Schema(description = "Specifies the tool tip text for the tab.")
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
   * @return Checkbox
   **/
  public Checkbox nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `name` property is editable. This property is read-only..
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
   * pageNumber.
   *
   * @return Checkbox
   **/
  public Checkbox pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Specifies the page number on which the tab is located..
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
   * @return Checkbox
   **/
  public Checkbox pageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `pageNumber` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document..
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
   * @return Checkbox
   **/
  public Checkbox recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox recipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `recipientIdGuid` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox recipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `recipientId` property is editable..
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
   * required.
   *
   * @return Checkbox
   **/
  public Checkbox required(String required) {
    this.required = required;
    return this;
  }

  /**
   * When set to **true**, the signer is required to fill out this tab.
   * @return required
   **/
  @Schema(description = "When set to **true**, the signer is required to fill out this tab")
  public String getRequired() {
    return required;
  }

  /**
   * setRequired.
   **/
  public void setRequired(String required) {
    this.required = required;
  }


  /**
   * requiredMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox requiredMetadata(PropertyMetadata requiredMetadata) {
    this.requiredMetadata = requiredMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `required` property is editable..
   * @return requiredMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `required` property is editable.")
  public PropertyMetadata getRequiredMetadata() {
    return requiredMetadata;
  }

  /**
   * setRequiredMetadata.
   **/
  public void setRequiredMetadata(PropertyMetadata requiredMetadata) {
    this.requiredMetadata = requiredMetadata;
  }


  /**
   * requireInitialOnSharedChange.
   *
   * @return Checkbox
   **/
  public Checkbox requireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
    return this;
  }

  /**
   * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field..
   * @return requireInitialOnSharedChange
   **/
  @Schema(description = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
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
   * requireInitialOnSharedChangeMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox requireInitialOnSharedChangeMetadata(PropertyMetadata requireInitialOnSharedChangeMetadata) {
    this.requireInitialOnSharedChangeMetadata = requireInitialOnSharedChangeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `requireInitialOnSharedChange` property is editable..
   * @return requireInitialOnSharedChangeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `requireInitialOnSharedChange` property is editable.")
  public PropertyMetadata getRequireInitialOnSharedChangeMetadata() {
    return requireInitialOnSharedChangeMetadata;
  }

  /**
   * setRequireInitialOnSharedChangeMetadata.
   **/
  public void setRequireInitialOnSharedChangeMetadata(PropertyMetadata requireInitialOnSharedChangeMetadata) {
    this.requireInitialOnSharedChangeMetadata = requireInitialOnSharedChangeMetadata;
  }


  /**
   * selected.
   *
   * @return Checkbox
   **/
  public Checkbox selected(String selected) {
    this.selected = selected;
    return this;
  }

  /**
   * When set to **true**, the checkbox is selected..
   * @return selected
   **/
  @Schema(description = "When set to **true**, the checkbox is selected.")
  public String getSelected() {
    return selected;
  }

  /**
   * setSelected.
   **/
  public void setSelected(String selected) {
    this.selected = selected;
  }


  /**
   * selectedMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox selectedMetadata(PropertyMetadata selectedMetadata) {
    this.selectedMetadata = selectedMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `selected` property is editable..
   * @return selectedMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `selected` property is editable.")
  public PropertyMetadata getSelectedMetadata() {
    return selectedMetadata;
  }

  /**
   * setSelectedMetadata.
   **/
  public void setSelectedMetadata(PropertyMetadata selectedMetadata) {
    this.selectedMetadata = selectedMetadata;
  }


  /**
   * selectedOriginal.
   *
   * @return Checkbox
   **/
  public Checkbox selectedOriginal(String selectedOriginal) {
    this.selectedOriginal = selectedOriginal;
    return this;
  }

  /**
   * .
   * @return selectedOriginal
   **/
  @Schema(description = "")
  public String getSelectedOriginal() {
    return selectedOriginal;
  }

  /**
   * setSelectedOriginal.
   **/
  public void setSelectedOriginal(String selectedOriginal) {
    this.selectedOriginal = selectedOriginal;
  }


  /**
   * selectedOriginalMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox selectedOriginalMetadata(PropertyMetadata selectedOriginalMetadata) {
    this.selectedOriginalMetadata = selectedOriginalMetadata;
    return this;
  }

  /**
   * .
   * @return selectedOriginalMetadata
   **/
  @Schema(description = "")
  public PropertyMetadata getSelectedOriginalMetadata() {
    return selectedOriginalMetadata;
  }

  /**
   * setSelectedOriginalMetadata.
   **/
  public void setSelectedOriginalMetadata(PropertyMetadata selectedOriginalMetadata) {
    this.selectedOriginalMetadata = selectedOriginalMetadata;
  }


  /**
   * shared.
   *
   * @return Checkbox
   **/
  public Checkbox shared(String shared) {
    this.shared = shared;
    return this;
  }

  /**
   * When set to **true**, this custom tab is shared..
   * @return shared
   **/
  @Schema(description = "When set to **true**, this custom tab is shared.")
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
   * sharedMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox sharedMetadata(PropertyMetadata sharedMetadata) {
    this.sharedMetadata = sharedMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `shared` property is editable. .
   * @return sharedMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `shared` property is editable. ")
  public PropertyMetadata getSharedMetadata() {
    return sharedMetadata;
  }

  /**
   * setSharedMetadata.
   **/
  public void setSharedMetadata(PropertyMetadata sharedMetadata) {
    this.sharedMetadata = sharedMetadata;
  }


  /**
   * shareToRecipients.
   *
   * @return Checkbox
   **/
  public Checkbox shareToRecipients(String shareToRecipients) {
    this.shareToRecipients = shareToRecipients;
    return this;
  }

  /**
   * .
   * @return shareToRecipients
   **/
  @Schema(description = "")
  public String getShareToRecipients() {
    return shareToRecipients;
  }

  /**
   * setShareToRecipients.
   **/
  public void setShareToRecipients(String shareToRecipients) {
    this.shareToRecipients = shareToRecipients;
  }


  /**
   * shareToRecipientsMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox shareToRecipientsMetadata(PropertyMetadata shareToRecipientsMetadata) {
    this.shareToRecipientsMetadata = shareToRecipientsMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return shareToRecipientsMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public PropertyMetadata getShareToRecipientsMetadata() {
    return shareToRecipientsMetadata;
  }

  /**
   * setShareToRecipientsMetadata.
   **/
  public void setShareToRecipientsMetadata(PropertyMetadata shareToRecipientsMetadata) {
    this.shareToRecipientsMetadata = shareToRecipientsMetadata;
  }


  /**
   * smartContractInformation.
   *
   * @return Checkbox
   **/
  public Checkbox smartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
    return this;
  }

  /**
   * Reserved for DocuSign..
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
   * @return Checkbox
   **/
  public Checkbox source(String source) {
    this.source = source;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
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
   * @return Checkbox
   **/
  public Checkbox statusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `status` property is editable..
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
   * tabFullyQualifiedPath.
   *
   * @return Checkbox
   **/
  public Checkbox tabFullyQualifiedPath(String tabFullyQualifiedPath) {
    this.tabFullyQualifiedPath = tabFullyQualifiedPath;
    return this;
  }

  /**
   * .
   * @return tabFullyQualifiedPath
   **/
  @Schema(description = "")
  public String getTabFullyQualifiedPath() {
    return tabFullyQualifiedPath;
  }

  /**
   * setTabFullyQualifiedPath.
   **/
  public void setTabFullyQualifiedPath(String tabFullyQualifiedPath) {
    this.tabFullyQualifiedPath = tabFullyQualifiedPath;
  }


  /**
   * tabGroupLabels.
   *
   * @return Checkbox
   **/
  public Checkbox tabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
    return this;
  }
  
  /**
   * addTabGroupLabelsItem.
   *
   * @return Checkbox
   **/
  public Checkbox addTabGroupLabelsItem(String tabGroupLabelsItem) {
    if (this.tabGroupLabels == null) {
      this.tabGroupLabels = new java.util.ArrayList<>();
    }
    this.tabGroupLabels.add(tabGroupLabelsItem);
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox tabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabGroupLabels` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

  /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     .
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
   * @return Checkbox
   **/
  public Checkbox tabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabId` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

  /**
   * The label string associated with the tab..
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
   * @return Checkbox
   **/
  public Checkbox tabLabelMetadata(PropertyMetadata tabLabelMetadata) {
    this.tabLabelMetadata = tabLabelMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabLabel` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox tabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox tabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabOrder` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox tabType(String tabType) {
    this.tabType = tabType;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox tabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabType` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. .
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
   * @return Checkbox
   **/
  public Checkbox templateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `templateLocked` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients..
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
   * @return Checkbox
   **/
  public Checkbox templateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `templateRequired` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  /**
   * .
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
   * @return Checkbox
   **/
  public Checkbox toolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `toolTip` property is editable..
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
   * underline.
   *
   * @return Checkbox
   **/
  public Checkbox underline(String underline) {
    this.underline = underline;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is underlined..
   * @return underline
   **/
  @Schema(description = "When set to **true**, the information in the tab is underlined.")
  public String getUnderline() {
    return underline;
  }

  /**
   * setUnderline.
   **/
  public void setUnderline(String underline) {
    this.underline = underline;
  }


  /**
   * underlineMetadata.
   *
   * @return Checkbox
   **/
  public Checkbox underlineMetadata(PropertyMetadata underlineMetadata) {
    this.underlineMetadata = underlineMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `underline` property is editable..
   * @return underlineMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `underline` property is editable.")
  public PropertyMetadata getUnderlineMetadata() {
    return underlineMetadata;
  }

  /**
   * setUnderlineMetadata.
   **/
  public void setUnderlineMetadata(PropertyMetadata underlineMetadata) {
    this.underlineMetadata = underlineMetadata;
  }


  /**
   * warningDetails.
   *
   * @return Checkbox
   **/
  public Checkbox warningDetails(ErrorDetails warningDetails) {
    this.warningDetails = warningDetails;
    return this;
  }

  /**
   * .
   * @return warningDetails
   **/
  @Schema(description = "")
  public ErrorDetails getWarningDetails() {
    return warningDetails;
  }

  /**
   * setWarningDetails.
   **/
  public void setWarningDetails(ErrorDetails warningDetails) {
    this.warningDetails = warningDetails;
  }


  /**
   * width.
   *
   * @return Checkbox
   **/
  public Checkbox width(String width) {
    this.width = width;
    return this;
  }

  /**
   * Width of the tab in pixels..
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
   * @return Checkbox
   **/
  public Checkbox widthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `width` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

  /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position..
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
   * @return Checkbox
   **/
  public Checkbox xPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `xPosition` property is editable..
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
   * @return Checkbox
   **/
  public Checkbox yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

  /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position..
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
   * @return Checkbox
   **/
  public Checkbox yPositionMetadata(PropertyMetadata yPositionMetadata) {
    this.yPositionMetadata = yPositionMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `yPosition` property is editable..
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
    Checkbox checkbox = (Checkbox) o;
    return Objects.equals(this.agreementAttribute, checkbox.agreementAttribute) &&
        Objects.equals(this.agreementAttributeLocked, checkbox.agreementAttributeLocked) &&
        Objects.equals(this.anchorAllowWhiteSpaceInCharacters, checkbox.anchorAllowWhiteSpaceInCharacters) &&
        Objects.equals(this.anchorAllowWhiteSpaceInCharactersMetadata, checkbox.anchorAllowWhiteSpaceInCharactersMetadata) &&
        Objects.equals(this.anchorCaseSensitive, checkbox.anchorCaseSensitive) &&
        Objects.equals(this.anchorCaseSensitiveMetadata, checkbox.anchorCaseSensitiveMetadata) &&
        Objects.equals(this.anchorHorizontalAlignment, checkbox.anchorHorizontalAlignment) &&
        Objects.equals(this.anchorHorizontalAlignmentMetadata, checkbox.anchorHorizontalAlignmentMetadata) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, checkbox.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorIgnoreIfNotPresentMetadata, checkbox.anchorIgnoreIfNotPresentMetadata) &&
        Objects.equals(this.anchorMatchWholeWord, checkbox.anchorMatchWholeWord) &&
        Objects.equals(this.anchorMatchWholeWordMetadata, checkbox.anchorMatchWholeWordMetadata) &&
        Objects.equals(this.anchorString, checkbox.anchorString) &&
        Objects.equals(this.anchorStringMetadata, checkbox.anchorStringMetadata) &&
        Objects.equals(this.anchorTabProcessorVersion, checkbox.anchorTabProcessorVersion) &&
        Objects.equals(this.anchorTabProcessorVersionMetadata, checkbox.anchorTabProcessorVersionMetadata) &&
        Objects.equals(this.anchorUnits, checkbox.anchorUnits) &&
        Objects.equals(this.anchorUnitsMetadata, checkbox.anchorUnitsMetadata) &&
        Objects.equals(this.anchorXOffset, checkbox.anchorXOffset) &&
        Objects.equals(this.anchorXOffsetMetadata, checkbox.anchorXOffsetMetadata) &&
        Objects.equals(this.anchorYOffset, checkbox.anchorYOffset) &&
        Objects.equals(this.anchorYOffsetMetadata, checkbox.anchorYOffsetMetadata) &&
        Objects.equals(this.bold, checkbox.bold) &&
        Objects.equals(this.boldMetadata, checkbox.boldMetadata) &&
        Objects.equals(this.caption, checkbox.caption) &&
        Objects.equals(this.captionMetadata, checkbox.captionMetadata) &&
        Objects.equals(this.conditionalParentLabel, checkbox.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentLabelMetadata, checkbox.conditionalParentLabelMetadata) &&
        Objects.equals(this.conditionalParentValue, checkbox.conditionalParentValue) &&
        Objects.equals(this.conditionalParentValueMetadata, checkbox.conditionalParentValueMetadata) &&
        Objects.equals(this.connectedObjectDetails, checkbox.connectedObjectDetails) &&
        Objects.equals(this.customTabId, checkbox.customTabId) &&
        Objects.equals(this.customTabIdMetadata, checkbox.customTabIdMetadata) &&
        Objects.equals(this.documentId, checkbox.documentId) &&
        Objects.equals(this.documentIdMetadata, checkbox.documentIdMetadata) &&
        Objects.equals(this.errorDetails, checkbox.errorDetails) &&
        Objects.equals(this.extensionData, checkbox.extensionData) &&
        Objects.equals(this.font, checkbox.font) &&
        Objects.equals(this.fontColor, checkbox.fontColor) &&
        Objects.equals(this.fontColorMetadata, checkbox.fontColorMetadata) &&
        Objects.equals(this.fontMetadata, checkbox.fontMetadata) &&
        Objects.equals(this.fontSize, checkbox.fontSize) &&
        Objects.equals(this.fontSizeMetadata, checkbox.fontSizeMetadata) &&
        Objects.equals(this.formOrder, checkbox.formOrder) &&
        Objects.equals(this.formOrderMetadata, checkbox.formOrderMetadata) &&
        Objects.equals(this.formPageLabel, checkbox.formPageLabel) &&
        Objects.equals(this.formPageLabelMetadata, checkbox.formPageLabelMetadata) &&
        Objects.equals(this.formPageNumber, checkbox.formPageNumber) &&
        Objects.equals(this.formPageNumberMetadata, checkbox.formPageNumberMetadata) &&
        Objects.equals(this.height, checkbox.height) &&
        Objects.equals(this.heightMetadata, checkbox.heightMetadata) &&
        Objects.equals(this.italic, checkbox.italic) &&
        Objects.equals(this.italicMetadata, checkbox.italicMetadata) &&
        Objects.equals(this.locked, checkbox.locked) &&
        Objects.equals(this.lockedMetadata, checkbox.lockedMetadata) &&
        Objects.equals(this.mergeField, checkbox.mergeField) &&
        Objects.equals(this.mergeFieldXml, checkbox.mergeFieldXml) &&
        Objects.equals(this.name, checkbox.name) &&
        Objects.equals(this.nameMetadata, checkbox.nameMetadata) &&
        Objects.equals(this.pageNumber, checkbox.pageNumber) &&
        Objects.equals(this.pageNumberMetadata, checkbox.pageNumberMetadata) &&
        Objects.equals(this.recipientId, checkbox.recipientId) &&
        Objects.equals(this.recipientIdGuid, checkbox.recipientIdGuid) &&
        Objects.equals(this.recipientIdGuidMetadata, checkbox.recipientIdGuidMetadata) &&
        Objects.equals(this.recipientIdMetadata, checkbox.recipientIdMetadata) &&
        Objects.equals(this.required, checkbox.required) &&
        Objects.equals(this.requiredMetadata, checkbox.requiredMetadata) &&
        Objects.equals(this.requireInitialOnSharedChange, checkbox.requireInitialOnSharedChange) &&
        Objects.equals(this.requireInitialOnSharedChangeMetadata, checkbox.requireInitialOnSharedChangeMetadata) &&
        Objects.equals(this.selected, checkbox.selected) &&
        Objects.equals(this.selectedMetadata, checkbox.selectedMetadata) &&
        Objects.equals(this.selectedOriginal, checkbox.selectedOriginal) &&
        Objects.equals(this.selectedOriginalMetadata, checkbox.selectedOriginalMetadata) &&
        Objects.equals(this.shared, checkbox.shared) &&
        Objects.equals(this.sharedMetadata, checkbox.sharedMetadata) &&
        Objects.equals(this.shareToRecipients, checkbox.shareToRecipients) &&
        Objects.equals(this.shareToRecipientsMetadata, checkbox.shareToRecipientsMetadata) &&
        Objects.equals(this.smartContractInformation, checkbox.smartContractInformation) &&
        Objects.equals(this.source, checkbox.source) &&
        Objects.equals(this.status, checkbox.status) &&
        Objects.equals(this.statusMetadata, checkbox.statusMetadata) &&
        Objects.equals(this.tabFullyQualifiedPath, checkbox.tabFullyQualifiedPath) &&
        Objects.equals(this.tabGroupLabels, checkbox.tabGroupLabels) &&
        Objects.equals(this.tabGroupLabelsMetadata, checkbox.tabGroupLabelsMetadata) &&
        Objects.equals(this.tabId, checkbox.tabId) &&
        Objects.equals(this.tabIdMetadata, checkbox.tabIdMetadata) &&
        Objects.equals(this.tabLabel, checkbox.tabLabel) &&
        Objects.equals(this.tabLabelMetadata, checkbox.tabLabelMetadata) &&
        Objects.equals(this.tabOrder, checkbox.tabOrder) &&
        Objects.equals(this.tabOrderMetadata, checkbox.tabOrderMetadata) &&
        Objects.equals(this.tabType, checkbox.tabType) &&
        Objects.equals(this.tabTypeMetadata, checkbox.tabTypeMetadata) &&
        Objects.equals(this.templateLocked, checkbox.templateLocked) &&
        Objects.equals(this.templateLockedMetadata, checkbox.templateLockedMetadata) &&
        Objects.equals(this.templateRequired, checkbox.templateRequired) &&
        Objects.equals(this.templateRequiredMetadata, checkbox.templateRequiredMetadata) &&
        Objects.equals(this.tooltip, checkbox.tooltip) &&
        Objects.equals(this.toolTipMetadata, checkbox.toolTipMetadata) &&
        Objects.equals(this.underline, checkbox.underline) &&
        Objects.equals(this.underlineMetadata, checkbox.underlineMetadata) &&
        Objects.equals(this.warningDetails, checkbox.warningDetails) &&
        Objects.equals(this.width, checkbox.width) &&
        Objects.equals(this.widthMetadata, checkbox.widthMetadata) &&
        Objects.equals(this.xPosition, checkbox.xPosition) &&
        Objects.equals(this.xPositionMetadata, checkbox.xPositionMetadata) &&
        Objects.equals(this.yPosition, checkbox.yPosition) &&
        Objects.equals(this.yPositionMetadata, checkbox.yPositionMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(agreementAttribute, agreementAttributeLocked, anchorAllowWhiteSpaceInCharacters, anchorAllowWhiteSpaceInCharactersMetadata, anchorCaseSensitive, anchorCaseSensitiveMetadata, anchorHorizontalAlignment, anchorHorizontalAlignmentMetadata, anchorIgnoreIfNotPresent, anchorIgnoreIfNotPresentMetadata, anchorMatchWholeWord, anchorMatchWholeWordMetadata, anchorString, anchorStringMetadata, anchorTabProcessorVersion, anchorTabProcessorVersionMetadata, anchorUnits, anchorUnitsMetadata, anchorXOffset, anchorXOffsetMetadata, anchorYOffset, anchorYOffsetMetadata, bold, boldMetadata, caption, captionMetadata, conditionalParentLabel, conditionalParentLabelMetadata, conditionalParentValue, conditionalParentValueMetadata, connectedObjectDetails, customTabId, customTabIdMetadata, documentId, documentIdMetadata, errorDetails, extensionData, font, fontColor, fontColorMetadata, fontMetadata, fontSize, fontSizeMetadata, formOrder, formOrderMetadata, formPageLabel, formPageLabelMetadata, formPageNumber, formPageNumberMetadata, height, heightMetadata, italic, italicMetadata, locked, lockedMetadata, mergeField, mergeFieldXml, name, nameMetadata, pageNumber, pageNumberMetadata, recipientId, recipientIdGuid, recipientIdGuidMetadata, recipientIdMetadata, required, requiredMetadata, requireInitialOnSharedChange, requireInitialOnSharedChangeMetadata, selected, selectedMetadata, selectedOriginal, selectedOriginalMetadata, shared, sharedMetadata, shareToRecipients, shareToRecipientsMetadata, smartContractInformation, source, status, statusMetadata, tabFullyQualifiedPath, tabGroupLabels, tabGroupLabelsMetadata, tabId, tabIdMetadata, tabLabel, tabLabelMetadata, tabOrder, tabOrderMetadata, tabType, tabTypeMetadata, templateLocked, templateLockedMetadata, templateRequired, templateRequiredMetadata, tooltip, toolTipMetadata, underline, underlineMetadata, warningDetails, width, widthMetadata, xPosition, xPositionMetadata, yPosition, yPositionMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Checkbox {\n");
    
    sb.append("    agreementAttribute: ").append(toIndentedString(agreementAttribute)).append("\n");
    sb.append("    agreementAttributeLocked: ").append(toIndentedString(agreementAttributeLocked)).append("\n");
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
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    captionMetadata: ").append(toIndentedString(captionMetadata)).append("\n");
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentLabelMetadata: ").append(toIndentedString(conditionalParentLabelMetadata)).append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    conditionalParentValueMetadata: ").append(toIndentedString(conditionalParentValueMetadata)).append("\n");
    sb.append("    connectedObjectDetails: ").append(toIndentedString(connectedObjectDetails)).append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    customTabIdMetadata: ").append(toIndentedString(customTabIdMetadata)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentIdMetadata: ").append(toIndentedString(documentIdMetadata)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    extensionData: ").append(toIndentedString(extensionData)).append("\n");
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
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    lockedMetadata: ").append(toIndentedString(lockedMetadata)).append("\n");
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
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    requiredMetadata: ").append(toIndentedString(requiredMetadata)).append("\n");
    sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
    sb.append("    requireInitialOnSharedChangeMetadata: ").append(toIndentedString(requireInitialOnSharedChangeMetadata)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    selectedMetadata: ").append(toIndentedString(selectedMetadata)).append("\n");
    sb.append("    selectedOriginal: ").append(toIndentedString(selectedOriginal)).append("\n");
    sb.append("    selectedOriginalMetadata: ").append(toIndentedString(selectedOriginalMetadata)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    sharedMetadata: ").append(toIndentedString(sharedMetadata)).append("\n");
    sb.append("    shareToRecipients: ").append(toIndentedString(shareToRecipients)).append("\n");
    sb.append("    shareToRecipientsMetadata: ").append(toIndentedString(shareToRecipientsMetadata)).append("\n");
    sb.append("    smartContractInformation: ").append(toIndentedString(smartContractInformation)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMetadata: ").append(toIndentedString(statusMetadata)).append("\n");
    sb.append("    tabFullyQualifiedPath: ").append(toIndentedString(tabFullyQualifiedPath)).append("\n");
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
    sb.append("    warningDetails: ").append(toIndentedString(warningDetails)).append("\n");
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

