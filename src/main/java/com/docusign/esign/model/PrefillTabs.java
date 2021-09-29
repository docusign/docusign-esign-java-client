package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Checkbox;
import com.docusign.esign.model.RadioGroup;
import com.docusign.esign.model.SenderCompany;
import com.docusign.esign.model.SenderName;
import com.docusign.esign.model.TabGroup;
import com.docusign.esign.model.Text;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PrefillTabs.
 *
 */

public class PrefillTabs {
  @JsonProperty("checkboxTabs")
  private java.util.List<Checkbox> checkboxTabs = null;

  @JsonProperty("radioGroupTabs")
  private java.util.List<RadioGroup> radioGroupTabs = null;

  @JsonProperty("senderCompanyTabs")
  private java.util.List<SenderCompany> senderCompanyTabs = null;

  @JsonProperty("senderNameTabs")
  private java.util.List<SenderName> senderNameTabs = null;

  @JsonProperty("tabGroups")
  private java.util.List<TabGroup> tabGroups = null;

  @JsonProperty("textTabs")
  private java.util.List<Text> textTabs = null;


  /**
   * checkboxTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs checkboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
    return this;
  }
  
  /**
   * addCheckboxTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addCheckboxTabsItem(Checkbox checkboxTabsItem) {
    if (this.checkboxTabs == null) {
      this.checkboxTabs = new java.util.ArrayList<Checkbox>();
    }
    this.checkboxTabs.add(checkboxTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document in a location where the recipient can select an option..
   * @return checkboxTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select an option.")
  public java.util.List<Checkbox> getCheckboxTabs() {
    return checkboxTabs;
  }

  /**
   * setCheckboxTabs.
   **/
  public void setCheckboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
  }


  /**
   * radioGroupTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs radioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
    return this;
  }
  
  /**
   * addRadioGroupTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addRadioGroupTabsItem(RadioGroup radioGroupTabsItem) {
    if (this.radioGroupTabs == null) {
      this.radioGroupTabs = new java.util.ArrayList<RadioGroup>();
    }
    this.radioGroupTabs.add(radioGroupTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document..
   * @return radioGroupTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.")
  public java.util.List<RadioGroup> getRadioGroupTabs() {
    return radioGroupTabs;
  }

  /**
   * setRadioGroupTabs.
   **/
  public void setRadioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
  }


  /**
   * senderCompanyTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs senderCompanyTabs(java.util.List<SenderCompany> senderCompanyTabs) {
    this.senderCompanyTabs = senderCompanyTabs;
    return this;
  }
  
  /**
   * addSenderCompanyTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addSenderCompanyTabsItem(SenderCompany senderCompanyTabsItem) {
    if (this.senderCompanyTabs == null) {
      this.senderCompanyTabs = new java.util.ArrayList<SenderCompany>();
    }
    this.senderCompanyTabs.add(senderCompanyTabsItem);
    return this;
  }

  /**
   * .
   * @return senderCompanyTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<SenderCompany> getSenderCompanyTabs() {
    return senderCompanyTabs;
  }

  /**
   * setSenderCompanyTabs.
   **/
  public void setSenderCompanyTabs(java.util.List<SenderCompany> senderCompanyTabs) {
    this.senderCompanyTabs = senderCompanyTabs;
  }


  /**
   * senderNameTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs senderNameTabs(java.util.List<SenderName> senderNameTabs) {
    this.senderNameTabs = senderNameTabs;
    return this;
  }
  
  /**
   * addSenderNameTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addSenderNameTabsItem(SenderName senderNameTabsItem) {
    if (this.senderNameTabs == null) {
      this.senderNameTabs = new java.util.ArrayList<SenderName>();
    }
    this.senderNameTabs.add(senderNameTabsItem);
    return this;
  }

  /**
   * .
   * @return senderNameTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<SenderName> getSenderNameTabs() {
    return senderNameTabs;
  }

  /**
   * setSenderNameTabs.
   **/
  public void setSenderNameTabs(java.util.List<SenderName> senderNameTabs) {
    this.senderNameTabs = senderNameTabs;
  }


  /**
   * tabGroups.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs tabGroups(java.util.List<TabGroup> tabGroups) {
    this.tabGroups = tabGroups;
    return this;
  }
  
  /**
   * addTabGroupsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addTabGroupsItem(TabGroup tabGroupsItem) {
    if (this.tabGroups == null) {
      this.tabGroups = new java.util.ArrayList<TabGroup>();
    }
    this.tabGroups.add(tabGroupsItem);
    return this;
  }

  /**
   * .
   * @return tabGroups
   **/
  @ApiModelProperty(value = "")
  public java.util.List<TabGroup> getTabGroups() {
    return tabGroups;
  }

  /**
   * setTabGroups.
   **/
  public void setTabGroups(java.util.List<TabGroup> tabGroups) {
    this.tabGroups = tabGroups;
  }


  /**
   * textTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs textTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
    return this;
  }
  
  /**
   * addTextTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addTextTabsItem(Text textTabsItem) {
    if (this.textTabs == null) {
      this.textTabs = new java.util.ArrayList<Text>();
    }
    this.textTabs.add(textTabsItem);
    return this;
  }

  /**
   * Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response..
   * @return textTabs
   **/
  @ApiModelProperty(value = "Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Text> getTextTabs() {
    return textTabs;
  }

  /**
   * setTextTabs.
   **/
  public void setTextTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
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
    PrefillTabs prefillTabs = (PrefillTabs) o;
    return Objects.equals(this.checkboxTabs, prefillTabs.checkboxTabs) &&
        Objects.equals(this.radioGroupTabs, prefillTabs.radioGroupTabs) &&
        Objects.equals(this.senderCompanyTabs, prefillTabs.senderCompanyTabs) &&
        Objects.equals(this.senderNameTabs, prefillTabs.senderNameTabs) &&
        Objects.equals(this.tabGroups, prefillTabs.tabGroups) &&
        Objects.equals(this.textTabs, prefillTabs.textTabs);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(checkboxTabs, radioGroupTabs, senderCompanyTabs, senderNameTabs, tabGroups, textTabs);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefillTabs {\n");
    
    sb.append("    checkboxTabs: ").append(toIndentedString(checkboxTabs)).append("\n");
    sb.append("    radioGroupTabs: ").append(toIndentedString(radioGroupTabs)).append("\n");
    sb.append("    senderCompanyTabs: ").append(toIndentedString(senderCompanyTabs)).append("\n");
    sb.append("    senderNameTabs: ").append(toIndentedString(senderNameTabs)).append("\n");
    sb.append("    tabGroups: ").append(toIndentedString(tabGroups)).append("\n");
    sb.append("    textTabs: ").append(toIndentedString(textTabs)).append("\n");
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

