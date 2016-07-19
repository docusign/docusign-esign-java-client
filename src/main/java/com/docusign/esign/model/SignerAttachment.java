package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MergeField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class SignerAttachment   {
  
  private String name = null;
  private String tabLabel = null;
  private Object scaleValue = null;
  private String optional = null;
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
  private String tabOrder = null;

  
  /**
   * 
   **/
  public SignerAttachment name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The label string associated with the tab.
   **/
  public SignerAttachment tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The label string associated with the tab.")
  @JsonProperty("tabLabel")
  public String getTabLabel() {
    return tabLabel;
  }
  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }

  
  /**
   * 
   **/
  public SignerAttachment scaleValue(Object scaleValue) {
    this.scaleValue = scaleValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scaleValue")
  public Object getScaleValue() {
    return scaleValue;
  }
  public void setScaleValue(Object scaleValue) {
    this.scaleValue = scaleValue;
  }

  
  /**
   * 
   **/
  public SignerAttachment optional(String optional) {
    this.optional = optional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("optional")
  public String getOptional() {
    return optional;
  }
  public void setOptional(String optional) {
    this.optional = optional;
  }

  
  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   **/
  public SignerAttachment documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
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
  public SignerAttachment recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
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
  public SignerAttachment pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the page number on which the tab is located.")
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
  public SignerAttachment xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
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
  public SignerAttachment yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
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
  public SignerAttachment anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Anchor text information for a radio button.")
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
  public SignerAttachment anchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the X axis location of the tab, in achorUnits, relative to the anchorString.")
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
  public SignerAttachment anchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the Y axis location of the tab, in achorUnits, relative to the anchorString.")
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
  public SignerAttachment anchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
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
  public SignerAttachment anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
  @JsonProperty("anchorIgnoreIfNotPresent")
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }
  public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }

  
  /**
   * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.
   **/
  public SignerAttachment anchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
  @JsonProperty("anchorCaseSensitive")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }
  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  
  /**
   * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.
   **/
  public SignerAttachment anchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
  @JsonProperty("anchorMatchWholeWord")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }
  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  
  /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.
   **/
  public SignerAttachment anchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
  @JsonProperty("anchorHorizontalAlignment")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }
  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
  }

  
  /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call]. \n\n \n
   **/
  public SignerAttachment tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call]. \n\n \n")
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
  public SignerAttachment templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
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
  public SignerAttachment templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
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
  public SignerAttachment conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  @JsonProperty("conditionalParentLabel")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }
  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  
  /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.\n
   **/
  public SignerAttachment conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.\n")
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
  public SignerAttachment customTabId(String customTabId) {
    this.customTabId = customTabId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
  @JsonProperty("customTabId")
  public String getCustomTabId() {
    return customTabId;
  }
  public void setCustomTabId(String customTabId) {
    this.customTabId = customTabId;
  }

  
  /**
   **/
  public SignerAttachment mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public SignerAttachment status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public SignerAttachment errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * 
   **/
  public SignerAttachment tabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tabOrder")
  public String getTabOrder() {
    return tabOrder;
  }
  public void setTabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
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
    return Objects.equals(this.name, signerAttachment.name) &&
        Objects.equals(this.tabLabel, signerAttachment.tabLabel) &&
        Objects.equals(this.scaleValue, signerAttachment.scaleValue) &&
        Objects.equals(this.optional, signerAttachment.optional) &&
        Objects.equals(this.documentId, signerAttachment.documentId) &&
        Objects.equals(this.recipientId, signerAttachment.recipientId) &&
        Objects.equals(this.pageNumber, signerAttachment.pageNumber) &&
        Objects.equals(this.xPosition, signerAttachment.xPosition) &&
        Objects.equals(this.yPosition, signerAttachment.yPosition) &&
        Objects.equals(this.anchorString, signerAttachment.anchorString) &&
        Objects.equals(this.anchorXOffset, signerAttachment.anchorXOffset) &&
        Objects.equals(this.anchorYOffset, signerAttachment.anchorYOffset) &&
        Objects.equals(this.anchorUnits, signerAttachment.anchorUnits) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, signerAttachment.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorCaseSensitive, signerAttachment.anchorCaseSensitive) &&
        Objects.equals(this.anchorMatchWholeWord, signerAttachment.anchorMatchWholeWord) &&
        Objects.equals(this.anchorHorizontalAlignment, signerAttachment.anchorHorizontalAlignment) &&
        Objects.equals(this.tabId, signerAttachment.tabId) &&
        Objects.equals(this.templateLocked, signerAttachment.templateLocked) &&
        Objects.equals(this.templateRequired, signerAttachment.templateRequired) &&
        Objects.equals(this.conditionalParentLabel, signerAttachment.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentValue, signerAttachment.conditionalParentValue) &&
        Objects.equals(this.customTabId, signerAttachment.customTabId) &&
        Objects.equals(this.mergeField, signerAttachment.mergeField) &&
        Objects.equals(this.status, signerAttachment.status) &&
        Objects.equals(this.errorDetails, signerAttachment.errorDetails) &&
        Objects.equals(this.tabOrder, signerAttachment.tabOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tabLabel, scaleValue, optional, documentId, recipientId, pageNumber, xPosition, yPosition, anchorString, anchorXOffset, anchorYOffset, anchorUnits, anchorIgnoreIfNotPresent, anchorCaseSensitive, anchorMatchWholeWord, anchorHorizontalAlignment, tabId, templateLocked, templateRequired, conditionalParentLabel, conditionalParentValue, customTabId, mergeField, status, errorDetails, tabOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignerAttachment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    sb.append("    scaleValue: ").append(toIndentedString(scaleValue)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
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

