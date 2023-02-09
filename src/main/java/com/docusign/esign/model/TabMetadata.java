package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.LocalePolicyTab;
import com.docusign.esign.model.MergeField;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TabMetadata.
 *
 */

public class TabMetadata {
  @JsonProperty("anchor")
  private String anchor = null;

  @JsonProperty("anchorCaseSensitive")
  private String anchorCaseSensitive = null;

  @JsonProperty("anchorHorizontalAlignment")
  private String anchorHorizontalAlignment = null;

  @JsonProperty("anchorIgnoreIfNotPresent")
  private String anchorIgnoreIfNotPresent = null;

  @JsonProperty("anchorMatchWholeWord")
  private String anchorMatchWholeWord = null;

  @JsonProperty("anchorUnits")
  private String anchorUnits = null;

  @JsonProperty("anchorXOffset")
  private String anchorXOffset = null;

  @JsonProperty("anchorYOffset")
  private String anchorYOffset = null;

  @JsonProperty("bold")
  private String bold = null;

  @JsonProperty("collaborative")
  private String collaborative = null;

  @JsonProperty("concealValueOnDocument")
  private String concealValueOnDocument = null;

  @JsonProperty("createdByDisplayName")
  private String createdByDisplayName = null;

  @JsonProperty("createdByUserId")
  private String createdByUserId = null;

  @JsonProperty("customTabId")
  private String customTabId = null;

  @JsonProperty("disableAutoSize")
  private String disableAutoSize = null;

  @JsonProperty("editable")
  private String editable = null;

  @JsonProperty("font")
  private String font = null;

  @JsonProperty("fontColor")
  private String fontColor = null;

  @JsonProperty("fontSize")
  private String fontSize = null;

  @JsonProperty("height")
  private String height = null;

  @JsonProperty("includedInEmail")
  private String includedInEmail = null;

  @JsonProperty("initialValue")
  private String initialValue = null;

  @JsonProperty("italic")
  private String italic = null;

  @JsonProperty("items")
  private java.util.List<String> items = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("lastModifiedByDisplayName")
  private String lastModifiedByDisplayName = null;

  @JsonProperty("lastModifiedByUserId")
  private String lastModifiedByUserId = null;

  @JsonProperty("localePolicy")
  private LocalePolicyTab localePolicy = null;

  @JsonProperty("locked")
  private String locked = null;

  @JsonProperty("maximumLength")
  private String maximumLength = null;

  @JsonProperty("maxNumericalValue")
  private String maxNumericalValue = null;

  @JsonProperty("mergeField")
  private MergeField mergeField = null;

  @JsonProperty("minNumericalValue")
  private String minNumericalValue = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("numericalValue")
  private String numericalValue = null;

  @JsonProperty("paymentItemCode")
  private String paymentItemCode = null;

  @JsonProperty("paymentItemDescription")
  private String paymentItemDescription = null;

  @JsonProperty("paymentItemName")
  private String paymentItemName = null;

  @JsonProperty("requireAll")
  private String requireAll = null;

  @JsonProperty("required")
  private String required = null;

  @JsonProperty("requireInitialOnSharedChange")
  private String requireInitialOnSharedChange = null;

  @JsonProperty("scaleValue")
  private String scaleValue = null;

  @JsonProperty("selected")
  private String selected = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("signatureProviderId")
  private String signatureProviderId = null;

  @JsonProperty("stampType")
  private String stampType = null;

  @JsonProperty("stampTypeMetadata")
  private PropertyMetadata stampTypeMetadata = null;

  @JsonProperty("tabLabel")
  private String tabLabel = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("underline")
  private String underline = null;

  @JsonProperty("validationMessage")
  private String validationMessage = null;

  @JsonProperty("validationPattern")
  private String validationPattern = null;

  @JsonProperty("validationType")
  private String validationType = null;

  @JsonProperty("width")
  private String width = null;


  /**
   * anchor.
   *
   * @return TabMetadata
   **/
  public TabMetadata anchor(String anchor) {
    this.anchor = anchor;
    return this;
  }

  /**
   * An optional string that is used to auto-match tabs to strings located in the documents of an envelope..
   * @return anchor
   **/
  @ApiModelProperty(value = "An optional string that is used to auto-match tabs to strings located in the documents of an envelope.")
  public String getAnchor() {
    return anchor;
  }

  /**
   * setAnchor.
   **/
  public void setAnchor(String anchor) {
    this.anchor = anchor;
  }


  /**
   * anchorCaseSensitive.
   *
   * @return TabMetadata
   **/
  public TabMetadata anchorCaseSensitive(String anchorCaseSensitive) {
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
   * @return TabMetadata
   **/
  public TabMetadata anchorHorizontalAlignment(String anchorHorizontalAlignment) {
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
   * @return TabMetadata
   **/
  public TabMetadata anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
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
   * @return TabMetadata
   **/
  public TabMetadata anchorMatchWholeWord(String anchorMatchWholeWord) {
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
   * anchorUnits.
   *
   * @return TabMetadata
   **/
  public TabMetadata anchorUnits(String anchorUnits) {
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
   * @return TabMetadata
   **/
  public TabMetadata anchorXOffset(String anchorXOffset) {
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
   * @return TabMetadata
   **/
  public TabMetadata anchorYOffset(String anchorYOffset) {
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
   * bold.
   *
   * @return TabMetadata
   **/
  public TabMetadata bold(String bold) {
    this.bold = bold;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is bold..
   * @return bold
   **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is bold.")
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
   * collaborative.
   *
   * @return TabMetadata
   **/
  public TabMetadata collaborative(String collaborative) {
    this.collaborative = collaborative;
    return this;
  }

  /**
   * .
   * @return collaborative
   **/
  @ApiModelProperty(value = "")
  public String getCollaborative() {
    return collaborative;
  }

  /**
   * setCollaborative.
   **/
  public void setCollaborative(String collaborative) {
    this.collaborative = collaborative;
  }


  /**
   * concealValueOnDocument.
   *
   * @return TabMetadata
   **/
  public TabMetadata concealValueOnDocument(String concealValueOnDocument) {
    this.concealValueOnDocument = concealValueOnDocument;
    return this;
  }

  /**
   * When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.  When an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.  This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes..
   * @return concealValueOnDocument
   **/
  @ApiModelProperty(value = "When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.  When an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.  This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.")
  public String getConcealValueOnDocument() {
    return concealValueOnDocument;
  }

  /**
   * setConcealValueOnDocument.
   **/
  public void setConcealValueOnDocument(String concealValueOnDocument) {
    this.concealValueOnDocument = concealValueOnDocument;
  }


  /**
   * createdByDisplayName.
   *
   * @return TabMetadata
   **/
  public TabMetadata createdByDisplayName(String createdByDisplayName) {
    this.createdByDisplayName = createdByDisplayName;
    return this;
  }

  /**
   * The user name of the DocuSign user who created this object..
   * @return createdByDisplayName
   **/
  @ApiModelProperty(value = "The user name of the DocuSign user who created this object.")
  public String getCreatedByDisplayName() {
    return createdByDisplayName;
  }

  /**
   * setCreatedByDisplayName.
   **/
  public void setCreatedByDisplayName(String createdByDisplayName) {
    this.createdByDisplayName = createdByDisplayName;
  }


  /**
   * createdByUserId.
   *
   * @return TabMetadata
   **/
  public TabMetadata createdByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

  /**
   * The userId of the DocuSign user who created this object..
   * @return createdByUserId
   **/
  @ApiModelProperty(value = "The userId of the DocuSign user who created this object.")
  public String getCreatedByUserId() {
    return createdByUserId;
  }

  /**
   * setCreatedByUserId.
   **/
  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }


  /**
   * customTabId.
   *
   * @return TabMetadata
   **/
  public TabMetadata customTabId(String customTabId) {
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
   * disableAutoSize.
   *
   * @return TabMetadata
   **/
  public TabMetadata disableAutoSize(String disableAutoSize) {
    this.disableAutoSize = disableAutoSize;
    return this;
  }

  /**
   * When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes..
   * @return disableAutoSize
   **/
  @ApiModelProperty(value = "When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.")
  public String getDisableAutoSize() {
    return disableAutoSize;
  }

  /**
   * setDisableAutoSize.
   **/
  public void setDisableAutoSize(String disableAutoSize) {
    this.disableAutoSize = disableAutoSize;
  }


  /**
   * editable.
   *
   * @return TabMetadata
   **/
  public TabMetadata editable(String editable) {
    this.editable = editable;
    return this;
  }

  /**
   * When set to **true**, the custom tab is editable. Otherwise the custom tab cannot be modified..
   * @return editable
   **/
  @ApiModelProperty(value = "When set to **true**, the custom tab is editable. Otherwise the custom tab cannot be modified.")
  public String getEditable() {
    return editable;
  }

  /**
   * setEditable.
   **/
  public void setEditable(String editable) {
    this.editable = editable;
  }


  /**
   * font.
   *
   * @return TabMetadata
   **/
  public TabMetadata font(String font) {
    this.font = font;
    return this;
  }

  /**
   * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default..
   * @return font
   **/
  @ApiModelProperty(value = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
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
   * @return TabMetadata
   **/
  public TabMetadata fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

  /**
   * The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White..
   * @return fontColor
   **/
  @ApiModelProperty(value = "The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
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
   * fontSize.
   *
   * @return TabMetadata
   **/
  public TabMetadata fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72..
   * @return fontSize
   **/
  @ApiModelProperty(value = "The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
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
   * height.
   *
   * @return TabMetadata
   **/
  public TabMetadata height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Height of the tab in pixels..
   * @return height
   **/
  @ApiModelProperty(value = "Height of the tab in pixels.")
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
   * includedInEmail.
   *
   * @return TabMetadata
   **/
  public TabMetadata includedInEmail(String includedInEmail) {
    this.includedInEmail = includedInEmail;
    return this;
  }

  /**
   * When set to **true**, the tab is included in e-mails related to the envelope on which it exists. This applies to only specific tabs..
   * @return includedInEmail
   **/
  @ApiModelProperty(value = "When set to **true**, the tab is included in e-mails related to the envelope on which it exists. This applies to only specific tabs.")
  public String getIncludedInEmail() {
    return includedInEmail;
  }

  /**
   * setIncludedInEmail.
   **/
  public void setIncludedInEmail(String includedInEmail) {
    this.includedInEmail = includedInEmail;
  }


  /**
   * initialValue.
   *
   * @return TabMetadata
   **/
  public TabMetadata initialValue(String initialValue) {
    this.initialValue = initialValue;
    return this;
  }

  /**
   * The original value of the tab..
   * @return initialValue
   **/
  @ApiModelProperty(value = "The original value of the tab.")
  public String getInitialValue() {
    return initialValue;
  }

  /**
   * setInitialValue.
   **/
  public void setInitialValue(String initialValue) {
    this.initialValue = initialValue;
  }


  /**
   * italic.
   *
   * @return TabMetadata
   **/
  public TabMetadata italic(String italic) {
    this.italic = italic;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is italic..
   * @return italic
   **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is italic.")
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
   * items.
   *
   * @return TabMetadata
   **/
  public TabMetadata items(java.util.List<String> items) {
    this.items = items;
    return this;
  }
  
  /**
   * addItemsItem.
   *
   * @return TabMetadata
   **/
  public TabMetadata addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new java.util.ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * If the tab is a list, this represents the values that are possible for the tab..
   * @return items
   **/
  @ApiModelProperty(value = "If the tab is a list, this represents the values that are possible for the tab.")
  public java.util.List<String> getItems() {
    return items;
  }

  /**
   * setItems.
   **/
  public void setItems(java.util.List<String> items) {
    this.items = items;
  }


  /**
   * lastModified.
   *
   * @return TabMetadata
   **/
  public TabMetadata lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The UTC DateTime this object was last modified. This is in ISO8601 format..
   * @return lastModified
   **/
  @ApiModelProperty(value = "The UTC DateTime this object was last modified. This is in ISO8601 format.")
  public String getLastModified() {
    return lastModified;
  }

  /**
   * setLastModified.
   **/
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  /**
   * lastModifiedByDisplayName.
   *
   * @return TabMetadata
   **/
  public TabMetadata lastModifiedByDisplayName(String lastModifiedByDisplayName) {
    this.lastModifiedByDisplayName = lastModifiedByDisplayName;
    return this;
  }

  /**
   * The User Name of the DocuSign user who last modified this object..
   * @return lastModifiedByDisplayName
   **/
  @ApiModelProperty(value = "The User Name of the DocuSign user who last modified this object.")
  public String getLastModifiedByDisplayName() {
    return lastModifiedByDisplayName;
  }

  /**
   * setLastModifiedByDisplayName.
   **/
  public void setLastModifiedByDisplayName(String lastModifiedByDisplayName) {
    this.lastModifiedByDisplayName = lastModifiedByDisplayName;
  }


  /**
   * lastModifiedByUserId.
   *
   * @return TabMetadata
   **/
  public TabMetadata lastModifiedByUserId(String lastModifiedByUserId) {
    this.lastModifiedByUserId = lastModifiedByUserId;
    return this;
  }

  /**
   * The userId of the DocuSign user who last modified this object..
   * @return lastModifiedByUserId
   **/
  @ApiModelProperty(value = "The userId of the DocuSign user who last modified this object.")
  public String getLastModifiedByUserId() {
    return lastModifiedByUserId;
  }

  /**
   * setLastModifiedByUserId.
   **/
  public void setLastModifiedByUserId(String lastModifiedByUserId) {
    this.lastModifiedByUserId = lastModifiedByUserId;
  }


  /**
   * localePolicy.
   *
   * @return TabMetadata
   **/
  public TabMetadata localePolicy(LocalePolicyTab localePolicy) {
    this.localePolicy = localePolicy;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return localePolicy
   **/
  @ApiModelProperty(value = "Reserved for DocuSign.")
  public LocalePolicyTab getLocalePolicy() {
    return localePolicy;
  }

  /**
   * setLocalePolicy.
   **/
  public void setLocalePolicy(LocalePolicyTab localePolicy) {
    this.localePolicy = localePolicy;
  }


  /**
   * locked.
   *
   * @return TabMetadata
   **/
  public TabMetadata locked(String locked) {
    this.locked = locked;
    return this;
  }

  /**
   * When set to **true**, the signer cannot change the data of the custom tab..
   * @return locked
   **/
  @ApiModelProperty(value = "When set to **true**, the signer cannot change the data of the custom tab.")
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
   * maximumLength.
   *
   * @return TabMetadata
   **/
  public TabMetadata maximumLength(String maximumLength) {
    this.maximumLength = maximumLength;
    return this;
  }

  /**
   * The maximum number of entry characters supported by the custom tab..
   * @return maximumLength
   **/
  @ApiModelProperty(value = "The maximum number of entry characters supported by the custom tab.")
  public String getMaximumLength() {
    return maximumLength;
  }

  /**
   * setMaximumLength.
   **/
  public void setMaximumLength(String maximumLength) {
    this.maximumLength = maximumLength;
  }


  /**
   * maxNumericalValue.
   *
   * @return TabMetadata
   **/
  public TabMetadata maxNumericalValue(String maxNumericalValue) {
    this.maxNumericalValue = maxNumericalValue;
    return this;
  }

  /**
   * .
   * @return maxNumericalValue
   **/
  @ApiModelProperty(value = "")
  public String getMaxNumericalValue() {
    return maxNumericalValue;
  }

  /**
   * setMaxNumericalValue.
   **/
  public void setMaxNumericalValue(String maxNumericalValue) {
    this.maxNumericalValue = maxNumericalValue;
  }


  /**
   * mergeField.
   *
   * @return TabMetadata
   **/
  public TabMetadata mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }

  /**
   * Contains the information necessary to map the tab to a field in SalesForce..
   * @return mergeField
   **/
  @ApiModelProperty(value = "Contains the information necessary to map the tab to a field in SalesForce.")
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
   * minNumericalValue.
   *
   * @return TabMetadata
   **/
  public TabMetadata minNumericalValue(String minNumericalValue) {
    this.minNumericalValue = minNumericalValue;
    return this;
  }

  /**
   * .
   * @return minNumericalValue
   **/
  @ApiModelProperty(value = "")
  public String getMinNumericalValue() {
    return minNumericalValue;
  }

  /**
   * setMinNumericalValue.
   **/
  public void setMinNumericalValue(String minNumericalValue) {
    this.minNumericalValue = minNumericalValue;
  }


  /**
   * name.
   *
   * @return TabMetadata
   **/
  public TabMetadata name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @ApiModelProperty(value = "")
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
   * numericalValue.
   *
   * @return TabMetadata
   **/
  public TabMetadata numericalValue(String numericalValue) {
    this.numericalValue = numericalValue;
    return this;
  }

  /**
   * .
   * @return numericalValue
   **/
  @ApiModelProperty(value = "")
  public String getNumericalValue() {
    return numericalValue;
  }

  /**
   * setNumericalValue.
   **/
  public void setNumericalValue(String numericalValue) {
    this.numericalValue = numericalValue;
  }


  /**
   * paymentItemCode.
   *
   * @return TabMetadata
   **/
  public TabMetadata paymentItemCode(String paymentItemCode) {
    this.paymentItemCode = paymentItemCode;
    return this;
  }

  /**
   * .
   * @return paymentItemCode
   **/
  @ApiModelProperty(value = "")
  public String getPaymentItemCode() {
    return paymentItemCode;
  }

  /**
   * setPaymentItemCode.
   **/
  public void setPaymentItemCode(String paymentItemCode) {
    this.paymentItemCode = paymentItemCode;
  }


  /**
   * paymentItemDescription.
   *
   * @return TabMetadata
   **/
  public TabMetadata paymentItemDescription(String paymentItemDescription) {
    this.paymentItemDescription = paymentItemDescription;
    return this;
  }

  /**
   * .
   * @return paymentItemDescription
   **/
  @ApiModelProperty(value = "")
  public String getPaymentItemDescription() {
    return paymentItemDescription;
  }

  /**
   * setPaymentItemDescription.
   **/
  public void setPaymentItemDescription(String paymentItemDescription) {
    this.paymentItemDescription = paymentItemDescription;
  }


  /**
   * paymentItemName.
   *
   * @return TabMetadata
   **/
  public TabMetadata paymentItemName(String paymentItemName) {
    this.paymentItemName = paymentItemName;
    return this;
  }

  /**
   * .
   * @return paymentItemName
   **/
  @ApiModelProperty(value = "")
  public String getPaymentItemName() {
    return paymentItemName;
  }

  /**
   * setPaymentItemName.
   **/
  public void setPaymentItemName(String paymentItemName) {
    this.paymentItemName = paymentItemName;
  }


  /**
   * requireAll.
   *
   * @return TabMetadata
   **/
  public TabMetadata requireAll(String requireAll) {
    this.requireAll = requireAll;
    return this;
  }

  /**
   * When set to **true** and shared is true, information must be entered in this field to complete the envelope. .
   * @return requireAll
   **/
  @ApiModelProperty(value = "When set to **true** and shared is true, information must be entered in this field to complete the envelope. ")
  public String getRequireAll() {
    return requireAll;
  }

  /**
   * setRequireAll.
   **/
  public void setRequireAll(String requireAll) {
    this.requireAll = requireAll;
  }


  /**
   * required.
   *
   * @return TabMetadata
   **/
  public TabMetadata required(String required) {
    this.required = required;
    return this;
  }

  /**
   * When set to **true**, the signer is required to fill out this tab.
   * @return required
   **/
  @ApiModelProperty(value = "When set to **true**, the signer is required to fill out this tab")
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
   * requireInitialOnSharedChange.
   *
   * @return TabMetadata
   **/
  public TabMetadata requireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
    return this;
  }

  /**
   * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field..
   * @return requireInitialOnSharedChange
   **/
  @ApiModelProperty(value = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
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
   * scaleValue.
   *
   * @return TabMetadata
   **/
  public TabMetadata scaleValue(String scaleValue) {
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
   * selected.
   *
   * @return TabMetadata
   **/
  public TabMetadata selected(String selected) {
    this.selected = selected;
    return this;
  }

  /**
   * .
   * @return selected
   **/
  @ApiModelProperty(value = "")
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
   * shared.
   *
   * @return TabMetadata
   **/
  public TabMetadata shared(String shared) {
    this.shared = shared;
    return this;
  }

  /**
   * When set to **true**, this custom tab is shared..
   * @return shared
   **/
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
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
   * signatureProviderId.
   *
   * @return TabMetadata
   **/
  public TabMetadata signatureProviderId(String signatureProviderId) {
    this.signatureProviderId = signatureProviderId;
    return this;
  }

  /**
   * .
   * @return signatureProviderId
   **/
  @ApiModelProperty(value = "")
  public String getSignatureProviderId() {
    return signatureProviderId;
  }

  /**
   * setSignatureProviderId.
   **/
  public void setSignatureProviderId(String signatureProviderId) {
    this.signatureProviderId = signatureProviderId;
  }


  /**
   * stampType.
   *
   * @return TabMetadata
   **/
  public TabMetadata stampType(String stampType) {
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
   * @return TabMetadata
   **/
  public TabMetadata stampTypeMetadata(PropertyMetadata stampTypeMetadata) {
    this.stampTypeMetadata = stampTypeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `stampType` property is editable..
   * @return stampTypeMetadata
   **/
  @ApiModelProperty(value = "Metadata that indicates whether the `stampType` property is editable.")
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
   * tabLabel.
   *
   * @return TabMetadata
   **/
  public TabMetadata tabLabel(String tabLabel) {
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
   * type.
   *
   * @return TabMetadata
   **/
  public TabMetadata type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of this tab. Values are: Approve, CheckBox, Company, Date, DateSigned, Decline, Email, EmailAddress, EnvelopeId, FirstName, Formula, FullName, InitialHere, InitialHereOptional, LastName, List, Note, Number, Radio, SignerAttachment, SignHere, SignHereOptional, Ssn, Text, Title, Zip5, or Zip5Dash4..
   * @return type
   **/
  @ApiModelProperty(value = "The type of this tab. Values are: Approve, CheckBox, Company, Date, DateSigned, Decline, Email, EmailAddress, EnvelopeId, FirstName, Formula, FullName, InitialHere, InitialHereOptional, LastName, List, Note, Number, Radio, SignerAttachment, SignHere, SignHereOptional, Ssn, Text, Title, Zip5, or Zip5Dash4.")
  public String getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(String type) {
    this.type = type;
  }


  /**
   * underline.
   *
   * @return TabMetadata
   **/
  public TabMetadata underline(String underline) {
    this.underline = underline;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is underlined..
   * @return underline
   **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is underlined.")
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
   * validationMessage.
   *
   * @return TabMetadata
   **/
  public TabMetadata validationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
    return this;
  }

  /**
   * The message displayed if the custom tab fails input validation (either custom of embedded)..
   * @return validationMessage
   **/
  @ApiModelProperty(value = "The message displayed if the custom tab fails input validation (either custom of embedded).")
  public String getValidationMessage() {
    return validationMessage;
  }

  /**
   * setValidationMessage.
   **/
  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }


  /**
   * validationPattern.
   *
   * @return TabMetadata
   **/
  public TabMetadata validationPattern(String validationPattern) {
    this.validationPattern = validationPattern;
    return this;
  }

  /**
   * A regular expression used to validate input for the tab..
   * @return validationPattern
   **/
  @ApiModelProperty(value = "A regular expression used to validate input for the tab.")
  public String getValidationPattern() {
    return validationPattern;
  }

  /**
   * setValidationPattern.
   **/
  public void setValidationPattern(String validationPattern) {
    this.validationPattern = validationPattern;
  }


  /**
   * validationType.
   *
   * @return TabMetadata
   **/
  public TabMetadata validationType(String validationType) {
    this.validationType = validationType;
    return this;
  }

  /**
   * .
   * @return validationType
   **/
  @ApiModelProperty(value = "")
  public String getValidationType() {
    return validationType;
  }

  /**
   * setValidationType.
   **/
  public void setValidationType(String validationType) {
    this.validationType = validationType;
  }


  /**
   * width.
   *
   * @return TabMetadata
   **/
  public TabMetadata width(String width) {
    this.width = width;
    return this;
  }

  /**
   * Width of the tab in pixels..
   * @return width
   **/
  @ApiModelProperty(value = "Width of the tab in pixels.")
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
    TabMetadata tabMetadata = (TabMetadata) o;
    return Objects.equals(this.anchor, tabMetadata.anchor) &&
        Objects.equals(this.anchorCaseSensitive, tabMetadata.anchorCaseSensitive) &&
        Objects.equals(this.anchorHorizontalAlignment, tabMetadata.anchorHorizontalAlignment) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, tabMetadata.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorMatchWholeWord, tabMetadata.anchorMatchWholeWord) &&
        Objects.equals(this.anchorUnits, tabMetadata.anchorUnits) &&
        Objects.equals(this.anchorXOffset, tabMetadata.anchorXOffset) &&
        Objects.equals(this.anchorYOffset, tabMetadata.anchorYOffset) &&
        Objects.equals(this.bold, tabMetadata.bold) &&
        Objects.equals(this.collaborative, tabMetadata.collaborative) &&
        Objects.equals(this.concealValueOnDocument, tabMetadata.concealValueOnDocument) &&
        Objects.equals(this.createdByDisplayName, tabMetadata.createdByDisplayName) &&
        Objects.equals(this.createdByUserId, tabMetadata.createdByUserId) &&
        Objects.equals(this.customTabId, tabMetadata.customTabId) &&
        Objects.equals(this.disableAutoSize, tabMetadata.disableAutoSize) &&
        Objects.equals(this.editable, tabMetadata.editable) &&
        Objects.equals(this.font, tabMetadata.font) &&
        Objects.equals(this.fontColor, tabMetadata.fontColor) &&
        Objects.equals(this.fontSize, tabMetadata.fontSize) &&
        Objects.equals(this.height, tabMetadata.height) &&
        Objects.equals(this.includedInEmail, tabMetadata.includedInEmail) &&
        Objects.equals(this.initialValue, tabMetadata.initialValue) &&
        Objects.equals(this.italic, tabMetadata.italic) &&
        Objects.equals(this.items, tabMetadata.items) &&
        Objects.equals(this.lastModified, tabMetadata.lastModified) &&
        Objects.equals(this.lastModifiedByDisplayName, tabMetadata.lastModifiedByDisplayName) &&
        Objects.equals(this.lastModifiedByUserId, tabMetadata.lastModifiedByUserId) &&
        Objects.equals(this.localePolicy, tabMetadata.localePolicy) &&
        Objects.equals(this.locked, tabMetadata.locked) &&
        Objects.equals(this.maximumLength, tabMetadata.maximumLength) &&
        Objects.equals(this.maxNumericalValue, tabMetadata.maxNumericalValue) &&
        Objects.equals(this.mergeField, tabMetadata.mergeField) &&
        Objects.equals(this.minNumericalValue, tabMetadata.minNumericalValue) &&
        Objects.equals(this.name, tabMetadata.name) &&
        Objects.equals(this.numericalValue, tabMetadata.numericalValue) &&
        Objects.equals(this.paymentItemCode, tabMetadata.paymentItemCode) &&
        Objects.equals(this.paymentItemDescription, tabMetadata.paymentItemDescription) &&
        Objects.equals(this.paymentItemName, tabMetadata.paymentItemName) &&
        Objects.equals(this.requireAll, tabMetadata.requireAll) &&
        Objects.equals(this.required, tabMetadata.required) &&
        Objects.equals(this.requireInitialOnSharedChange, tabMetadata.requireInitialOnSharedChange) &&
        Objects.equals(this.scaleValue, tabMetadata.scaleValue) &&
        Objects.equals(this.selected, tabMetadata.selected) &&
        Objects.equals(this.shared, tabMetadata.shared) &&
        Objects.equals(this.signatureProviderId, tabMetadata.signatureProviderId) &&
        Objects.equals(this.stampType, tabMetadata.stampType) &&
        Objects.equals(this.stampTypeMetadata, tabMetadata.stampTypeMetadata) &&
        Objects.equals(this.tabLabel, tabMetadata.tabLabel) &&
        Objects.equals(this.type, tabMetadata.type) &&
        Objects.equals(this.underline, tabMetadata.underline) &&
        Objects.equals(this.validationMessage, tabMetadata.validationMessage) &&
        Objects.equals(this.validationPattern, tabMetadata.validationPattern) &&
        Objects.equals(this.validationType, tabMetadata.validationType) &&
        Objects.equals(this.width, tabMetadata.width);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(anchor, anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorUnits, anchorXOffset, anchorYOffset, bold, collaborative, concealValueOnDocument, createdByDisplayName, createdByUserId, customTabId, disableAutoSize, editable, font, fontColor, fontSize, height, includedInEmail, initialValue, italic, items, lastModified, lastModifiedByDisplayName, lastModifiedByUserId, localePolicy, locked, maximumLength, maxNumericalValue, mergeField, minNumericalValue, name, numericalValue, paymentItemCode, paymentItemDescription, paymentItemName, requireAll, required, requireInitialOnSharedChange, scaleValue, selected, shared, signatureProviderId, stampType, stampTypeMetadata, tabLabel, type, underline, validationMessage, validationPattern, validationType, width);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabMetadata {\n");
    
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    collaborative: ").append(toIndentedString(collaborative)).append("\n");
    sb.append("    concealValueOnDocument: ").append(toIndentedString(concealValueOnDocument)).append("\n");
    sb.append("    createdByDisplayName: ").append(toIndentedString(createdByDisplayName)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    disableAutoSize: ").append(toIndentedString(disableAutoSize)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    includedInEmail: ").append(toIndentedString(includedInEmail)).append("\n");
    sb.append("    initialValue: ").append(toIndentedString(initialValue)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedByDisplayName: ").append(toIndentedString(lastModifiedByDisplayName)).append("\n");
    sb.append("    lastModifiedByUserId: ").append(toIndentedString(lastModifiedByUserId)).append("\n");
    sb.append("    localePolicy: ").append(toIndentedString(localePolicy)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    maximumLength: ").append(toIndentedString(maximumLength)).append("\n");
    sb.append("    maxNumericalValue: ").append(toIndentedString(maxNumericalValue)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    minNumericalValue: ").append(toIndentedString(minNumericalValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numericalValue: ").append(toIndentedString(numericalValue)).append("\n");
    sb.append("    paymentItemCode: ").append(toIndentedString(paymentItemCode)).append("\n");
    sb.append("    paymentItemDescription: ").append(toIndentedString(paymentItemDescription)).append("\n");
    sb.append("    paymentItemName: ").append(toIndentedString(paymentItemName)).append("\n");
    sb.append("    requireAll: ").append(toIndentedString(requireAll)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
    sb.append("    scaleValue: ").append(toIndentedString(scaleValue)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    signatureProviderId: ").append(toIndentedString(signatureProviderId)).append("\n");
    sb.append("    stampType: ").append(toIndentedString(stampType)).append("\n");
    sb.append("    stampTypeMetadata: ").append(toIndentedString(stampTypeMetadata)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    validationPattern: ").append(toIndentedString(validationPattern)).append("\n");
    sb.append("    validationType: ").append(toIndentedString(validationType)).append("\n");
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

