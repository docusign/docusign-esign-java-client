package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.MergeField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class TabMetadata   {
  
  private String anchor = null;
  private String anchorCaseSensitive = null;
  private String anchorHorizontalAlignment = null;
  private String anchorIgnoreIfNotPresent = null;
  private String anchorMatchWholeWord = null;
  private String anchorUnits = null;
  private String anchorXOffset = null;
  private String anchorYOffset = null;
  private String bold = null;
  private String concealValueOnDocument = null;
  private String createdByDisplayName = null;
  private String createdByUserId = null;
  private String customTabId = null;
  private String disableAutoSize = null;
  private String editable = null;
  private String font = null;
  private String fontColor = null;
  private String fontSize = null;
  private String height = null;
  private String includedInEmail = null;
  private String initialValue = null;
  private String italic = null;
  private java.util.List<String> items = new java.util.ArrayList<String>();
  private String lastModified = null;
  private String lastModifiedByDisplayName = null;
  private String lastModifiedByUserId = null;
  private String locked = null;
  private String maximumLength = null;
  private MergeField mergeField = null;
  private String name = null;
  private String required = null;
  private String scaleValue = null;
  private String shared = null;
  private String tabLabel = null;
  private String type = null;
  private String underline = null;
  private String validationMessage = null;
  private String validationPattern = null;
  private String width = null;

  
  /**
   * An optional string that is used to auto-match tabs to strings located in the documents of an envelope.
   **/
  
  @ApiModelProperty(value = "An optional string that is used to auto-match tabs to strings located in the documents of an envelope.")
  @JsonProperty("anchor")
  public String getAnchor() {
    return anchor;
  }
  public void setAnchor(String anchor) {
    this.anchor = anchor;
  }

  
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
   * The user name of the DocuSign user who created this object.
   **/
  
  @ApiModelProperty(value = "The user name of the DocuSign user who created this object.")
  @JsonProperty("createdByDisplayName")
  public String getCreatedByDisplayName() {
    return createdByDisplayName;
  }
  public void setCreatedByDisplayName(String createdByDisplayName) {
    this.createdByDisplayName = createdByDisplayName;
  }

  
  /**
   * The userId of the DocuSign user who created this object.
   **/
  
  @ApiModelProperty(value = "The userId of the DocuSign user who created this object.")
  @JsonProperty("createdByUserId")
  public String getCreatedByUserId() {
    return createdByUserId;
  }
  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
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
   * When set to **true**, the custom tab is editable. Otherwise the custom tab cannot be modified.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the custom tab is editable. Otherwise the custom tab cannot be modified.")
  @JsonProperty("editable")
  public String getEditable() {
    return editable;
  }
  public void setEditable(String editable) {
    this.editable = editable;
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
   * Height of the tab in pixels.
   **/
  
  @ApiModelProperty(value = "Height of the tab in pixels.")
  @JsonProperty("height")
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }

  
  /**
   * When set to **true**, the tab is included in e-mails related to the envelope on which it exists. This applies to only specific tabs.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the tab is included in e-mails related to the envelope on which it exists. This applies to only specific tabs.")
  @JsonProperty("includedInEmail")
  public String getIncludedInEmail() {
    return includedInEmail;
  }
  public void setIncludedInEmail(String includedInEmail) {
    this.includedInEmail = includedInEmail;
  }

  
  /**
   * The original value of the tab.
   **/
  
  @ApiModelProperty(value = "The original value of the tab.")
  @JsonProperty("initialValue")
  public String getInitialValue() {
    return initialValue;
  }
  public void setInitialValue(String initialValue) {
    this.initialValue = initialValue;
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
   * If the tab is a list, this represents the values that are possible for the tab.
   **/
  
  @ApiModelProperty(value = "If the tab is a list, this represents the values that are possible for the tab.")
  @JsonProperty("items")
  public java.util.List<String> getItems() {
    return items;
  }
  public void setItems(java.util.List<String> items) {
    this.items = items;
  }

  
  /**
   * The UTC DateTime this object was last modified. This is in ISO8601 format.
   **/
  
  @ApiModelProperty(value = "The UTC DateTime this object was last modified. This is in ISO8601 format.")
  @JsonProperty("lastModified")
  public String getLastModified() {
    return lastModified;
  }
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * The User Name of the DocuSign user who last modified this object.
   **/
  
  @ApiModelProperty(value = "The User Name of the DocuSign user who last modified this object.")
  @JsonProperty("lastModifiedByDisplayName")
  public String getLastModifiedByDisplayName() {
    return lastModifiedByDisplayName;
  }
  public void setLastModifiedByDisplayName(String lastModifiedByDisplayName) {
    this.lastModifiedByDisplayName = lastModifiedByDisplayName;
  }

  
  /**
   * The userId of the DocuSign user who last modified this object.
   **/
  
  @ApiModelProperty(value = "The userId of the DocuSign user who last modified this object.")
  @JsonProperty("lastModifiedByUserId")
  public String getLastModifiedByUserId() {
    return lastModifiedByUserId;
  }
  public void setLastModifiedByUserId(String lastModifiedByUserId) {
    this.lastModifiedByUserId = lastModifiedByUserId;
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
   * The maximum number of entry characters supported by the custom tab.
   **/
  
  @ApiModelProperty(value = "The maximum number of entry characters supported by the custom tab.")
  @JsonProperty("maximumLength")
  public String getMaximumLength() {
    return maximumLength;
  }
  public void setMaximumLength(String maximumLength) {
    this.maximumLength = maximumLength;
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scaleValue")
  public String getScaleValue() {
    return scaleValue;
  }
  public void setScaleValue(String scaleValue) {
    this.scaleValue = scaleValue;
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
   * The type of this tab. Values are: Approve, CheckBox, Company, Date, DateSigned,	Decline, Email,	EmailAddress, EnvelopeId, FirstName, Formula, FullName,	InitialHere, InitialHereOptional, LastName, List, Note, Number,	Radio, SignerAttachment, SignHere, SignHereOptional, Ssn, Text, Title, Zip5, or Zip5Dash4.
   **/
  
  @ApiModelProperty(value = "The type of this tab. Values are: Approve, CheckBox, Company, Date, DateSigned,	Decline, Email,	EmailAddress, EnvelopeId, FirstName, Formula, FullName,	InitialHere, InitialHereOptional, LastName, List, Note, Number,	Radio, SignerAttachment, SignHere, SignHereOptional, Ssn, Text, Title, Zip5, or Zip5Dash4.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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
   * The message displayed if the custom tab fails input validation (either custom of embedded).
   **/
  
  @ApiModelProperty(value = "The message displayed if the custom tab fails input validation (either custom of embedded).")
  @JsonProperty("validationMessage")
  public String getValidationMessage() {
    return validationMessage;
  }
  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }

  
  /**
   * A regular expressionn used to validate input for the tab.
   **/
  
  @ApiModelProperty(value = "A regular expressionn used to validate input for the tab.")
  @JsonProperty("validationPattern")
  public String getValidationPattern() {
    return validationPattern;
  }
  public void setValidationPattern(String validationPattern) {
    this.validationPattern = validationPattern;
  }

  
  /**
   * Width of the tab in pixels.
   **/
  
  @ApiModelProperty(value = "Width of the tab in pixels.")
  @JsonProperty("width")
  public String getWidth() {
    return width;
  }
  public void setWidth(String width) {
    this.width = width;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TabMetadata tabMetadata = (TabMetadata) o;

    return true && Objects.equals(anchor, tabMetadata.anchor) &&
        Objects.equals(anchorCaseSensitive, tabMetadata.anchorCaseSensitive) &&
        Objects.equals(anchorHorizontalAlignment, tabMetadata.anchorHorizontalAlignment) &&
        Objects.equals(anchorIgnoreIfNotPresent, tabMetadata.anchorIgnoreIfNotPresent) &&
        Objects.equals(anchorMatchWholeWord, tabMetadata.anchorMatchWholeWord) &&
        Objects.equals(anchorUnits, tabMetadata.anchorUnits) &&
        Objects.equals(anchorXOffset, tabMetadata.anchorXOffset) &&
        Objects.equals(anchorYOffset, tabMetadata.anchorYOffset) &&
        Objects.equals(bold, tabMetadata.bold) &&
        Objects.equals(concealValueOnDocument, tabMetadata.concealValueOnDocument) &&
        Objects.equals(createdByDisplayName, tabMetadata.createdByDisplayName) &&
        Objects.equals(createdByUserId, tabMetadata.createdByUserId) &&
        Objects.equals(customTabId, tabMetadata.customTabId) &&
        Objects.equals(disableAutoSize, tabMetadata.disableAutoSize) &&
        Objects.equals(editable, tabMetadata.editable) &&
        Objects.equals(font, tabMetadata.font) &&
        Objects.equals(fontColor, tabMetadata.fontColor) &&
        Objects.equals(fontSize, tabMetadata.fontSize) &&
        Objects.equals(height, tabMetadata.height) &&
        Objects.equals(includedInEmail, tabMetadata.includedInEmail) &&
        Objects.equals(initialValue, tabMetadata.initialValue) &&
        Objects.equals(italic, tabMetadata.italic) &&
        Objects.equals(items, tabMetadata.items) &&
        Objects.equals(lastModified, tabMetadata.lastModified) &&
        Objects.equals(lastModifiedByDisplayName, tabMetadata.lastModifiedByDisplayName) &&
        Objects.equals(lastModifiedByUserId, tabMetadata.lastModifiedByUserId) &&
        Objects.equals(locked, tabMetadata.locked) &&
        Objects.equals(maximumLength, tabMetadata.maximumLength) &&
        Objects.equals(mergeField, tabMetadata.mergeField) &&
        Objects.equals(name, tabMetadata.name) &&
        Objects.equals(required, tabMetadata.required) &&
        Objects.equals(scaleValue, tabMetadata.scaleValue) &&
        Objects.equals(shared, tabMetadata.shared) &&
        Objects.equals(tabLabel, tabMetadata.tabLabel) &&
        Objects.equals(type, tabMetadata.type) &&
        Objects.equals(underline, tabMetadata.underline) &&
        Objects.equals(validationMessage, tabMetadata.validationMessage) &&
        Objects.equals(validationPattern, tabMetadata.validationPattern) &&
        Objects.equals(width, tabMetadata.width)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchor, anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorUnits, anchorXOffset, anchorYOffset, bold, concealValueOnDocument, createdByDisplayName, createdByUserId, customTabId, disableAutoSize, editable, font, fontColor, fontSize, height, includedInEmail, initialValue, italic, items, lastModified, lastModifiedByDisplayName, lastModifiedByUserId, locked, maximumLength, mergeField, name, required, scaleValue, shared, tabLabel, type, underline, validationMessage, validationPattern, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabMetadata {\n");
    
    if (anchor != null)
      sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    if (anchorCaseSensitive != null)
      sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    if (anchorHorizontalAlignment != null)
      sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    if (anchorIgnoreIfNotPresent != null)
      sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    if (anchorMatchWholeWord != null)
      sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    if (anchorUnits != null)
      sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    if (anchorXOffset != null)
      sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    if (anchorYOffset != null)
      sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    if (bold != null)
      sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    if (concealValueOnDocument != null)
      sb.append("    concealValueOnDocument: ").append(toIndentedString(concealValueOnDocument)).append("\n");
    if (createdByDisplayName != null)
      sb.append("    createdByDisplayName: ").append(toIndentedString(createdByDisplayName)).append("\n");
    if (createdByUserId != null)
      sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    if (customTabId != null)
      sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    if (disableAutoSize != null)
      sb.append("    disableAutoSize: ").append(toIndentedString(disableAutoSize)).append("\n");
    if (editable != null)
      sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    if (font != null)
      sb.append("    font: ").append(toIndentedString(font)).append("\n");
    if (fontColor != null)
      sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    if (fontSize != null)
      sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    if (height != null)
      sb.append("    height: ").append(toIndentedString(height)).append("\n");
    if (includedInEmail != null)
      sb.append("    includedInEmail: ").append(toIndentedString(includedInEmail)).append("\n");
    if (initialValue != null)
      sb.append("    initialValue: ").append(toIndentedString(initialValue)).append("\n");
    if (italic != null)
      sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    if (items != null)
      sb.append("    items: ").append(toIndentedString(items)).append("\n");
    if (lastModified != null)
      sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    if (lastModifiedByDisplayName != null)
      sb.append("    lastModifiedByDisplayName: ").append(toIndentedString(lastModifiedByDisplayName)).append("\n");
    if (lastModifiedByUserId != null)
      sb.append("    lastModifiedByUserId: ").append(toIndentedString(lastModifiedByUserId)).append("\n");
    if (locked != null)
      sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    if (maximumLength != null)
      sb.append("    maximumLength: ").append(toIndentedString(maximumLength)).append("\n");
    if (mergeField != null)
      sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (required != null)
      sb.append("    required: ").append(toIndentedString(required)).append("\n");
    if (scaleValue != null)
      sb.append("    scaleValue: ").append(toIndentedString(scaleValue)).append("\n");
    if (shared != null)
      sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    if (tabLabel != null)
      sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    if (type != null)
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (underline != null)
      sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    if (validationMessage != null)
      sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    if (validationPattern != null)
      sb.append("    validationPattern: ").append(toIndentedString(validationPattern)).append("\n");
    if (width != null)
      sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

