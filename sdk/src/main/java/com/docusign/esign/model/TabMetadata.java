package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.MergeField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-18T16:25:36.433-08:00")
public class TabMetadata   {
  
  private String font = null;
  private String bold = null;
  private String italic = null;
  private String underline = null;
  private String fontColor = null;
  private String fontSize = null;
  private String height = null;
  private String width = null;
  private String customTabId = null;
  private String initialValue = null;
  private String includedInEmail = null;
  private String disableAutoSize = null;
  private String concealValueOnDocument = null;
  private String locked = null;
  private String required = null;
  private String shared = null;
  private java.util.List<String> items = new java.util.ArrayList<String>();
  private String tabLabel = null;
  private String maximumLength = null;
  private String anchor = null;
  private String anchorXOffset = null;
  private String anchorYOffset = null;
  private String anchorUnits = null;
  private String anchorIgnoreIfNotPresent = null;
  private String anchorMatchWholeWord = null;
  private String anchorCaseSensitive = null;
  private String anchorHorizontalAlignment = null;
  private String name = null;
  private String type = null;
  private String validationMessage = null;
  private String validationPattern = null;
  private String lastModifiedByUserId = null;
  private String lastModifiedByDisplayName = null;
  private String lastModified = null;
  private String createdByUserId = null;
  private String createdByDisplayName = null;
  private String editable = null;
  private MergeField mergeField = null;

  
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
   * When set to **true**, the anchor string in this tab will match whole words only, not strings embedded in other strings. The default is **true**.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the anchor string in this tab will match whole words only, not strings embedded in other strings. The default is **true**.")
  @JsonProperty("anchorMatchWholeWord")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }
  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  
  /**
   * if **true**, the anchor string does not consider case when matich strings in the document. The default is **true**.
   **/
  
  @ApiModelProperty(value = "if **true**, the anchor string does not consider case when matich strings in the document. The default is **true**.")
  @JsonProperty("anchorCaseSensitive")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }
  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  
  /**
   * Determines the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default is **left**.
   **/
  
  @ApiModelProperty(value = "Determines the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default is **left**.")
  @JsonProperty("anchorHorizontalAlignment")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }
  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mergeField")
  public MergeField getMergeField() {
    return mergeField;
  }
  public void setMergeField(MergeField mergeField) {
    this.mergeField = mergeField;
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

    return true && Objects.equals(font, tabMetadata.font) &&
        Objects.equals(bold, tabMetadata.bold) &&
        Objects.equals(italic, tabMetadata.italic) &&
        Objects.equals(underline, tabMetadata.underline) &&
        Objects.equals(fontColor, tabMetadata.fontColor) &&
        Objects.equals(fontSize, tabMetadata.fontSize) &&
        Objects.equals(height, tabMetadata.height) &&
        Objects.equals(width, tabMetadata.width) &&
        Objects.equals(customTabId, tabMetadata.customTabId) &&
        Objects.equals(initialValue, tabMetadata.initialValue) &&
        Objects.equals(includedInEmail, tabMetadata.includedInEmail) &&
        Objects.equals(disableAutoSize, tabMetadata.disableAutoSize) &&
        Objects.equals(concealValueOnDocument, tabMetadata.concealValueOnDocument) &&
        Objects.equals(locked, tabMetadata.locked) &&
        Objects.equals(required, tabMetadata.required) &&
        Objects.equals(shared, tabMetadata.shared) &&
        Objects.equals(items, tabMetadata.items) &&
        Objects.equals(tabLabel, tabMetadata.tabLabel) &&
        Objects.equals(maximumLength, tabMetadata.maximumLength) &&
        Objects.equals(anchor, tabMetadata.anchor) &&
        Objects.equals(anchorXOffset, tabMetadata.anchorXOffset) &&
        Objects.equals(anchorYOffset, tabMetadata.anchorYOffset) &&
        Objects.equals(anchorUnits, tabMetadata.anchorUnits) &&
        Objects.equals(anchorIgnoreIfNotPresent, tabMetadata.anchorIgnoreIfNotPresent) &&
        Objects.equals(anchorMatchWholeWord, tabMetadata.anchorMatchWholeWord) &&
        Objects.equals(anchorCaseSensitive, tabMetadata.anchorCaseSensitive) &&
        Objects.equals(anchorHorizontalAlignment, tabMetadata.anchorHorizontalAlignment) &&
        Objects.equals(name, tabMetadata.name) &&
        Objects.equals(type, tabMetadata.type) &&
        Objects.equals(validationMessage, tabMetadata.validationMessage) &&
        Objects.equals(validationPattern, tabMetadata.validationPattern) &&
        Objects.equals(lastModifiedByUserId, tabMetadata.lastModifiedByUserId) &&
        Objects.equals(lastModifiedByDisplayName, tabMetadata.lastModifiedByDisplayName) &&
        Objects.equals(lastModified, tabMetadata.lastModified) &&
        Objects.equals(createdByUserId, tabMetadata.createdByUserId) &&
        Objects.equals(createdByDisplayName, tabMetadata.createdByDisplayName) &&
        Objects.equals(editable, tabMetadata.editable) &&
        Objects.equals(mergeField, tabMetadata.mergeField)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(font, bold, italic, underline, fontColor, fontSize, height, width, customTabId, initialValue, includedInEmail, disableAutoSize, concealValueOnDocument, locked, required, shared, items, tabLabel, maximumLength, anchor, anchorXOffset, anchorYOffset, anchorUnits, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorCaseSensitive, anchorHorizontalAlignment, name, type, validationMessage, validationPattern, lastModifiedByUserId, lastModifiedByDisplayName, lastModified, createdByUserId, createdByDisplayName, editable, mergeField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabMetadata {\n");
    
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    initialValue: ").append(toIndentedString(initialValue)).append("\n");
    sb.append("    includedInEmail: ").append(toIndentedString(includedInEmail)).append("\n");
    sb.append("    disableAutoSize: ").append(toIndentedString(disableAutoSize)).append("\n");
    sb.append("    concealValueOnDocument: ").append(toIndentedString(concealValueOnDocument)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    sb.append("    maximumLength: ").append(toIndentedString(maximumLength)).append("\n");
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    validationPattern: ").append(toIndentedString(validationPattern)).append("\n");
    sb.append("    lastModifiedByUserId: ").append(toIndentedString(lastModifiedByUserId)).append("\n");
    sb.append("    lastModifiedByDisplayName: ").append(toIndentedString(lastModifiedByDisplayName)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    createdByDisplayName: ").append(toIndentedString(createdByDisplayName)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
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

