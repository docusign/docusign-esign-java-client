package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Checkbox;
import com.docusign.esign.model.RadioGroup;
import com.docusign.esign.model.TabGroup;
import com.docusign.esign.model.Text;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PrefillTabs
 */

public class PrefillTabs {
  @JsonProperty("checkboxTabs")
  private java.util.List<Checkbox> checkboxTabs = null;

  @JsonProperty("radioGroupTabs")
  private java.util.List<RadioGroup> radioGroupTabs = null;

  @JsonProperty("tabGroups")
  private java.util.List<TabGroup> tabGroups = null;

  @JsonProperty("textTabs")
  private java.util.List<Text> textTabs = null;

  public PrefillTabs checkboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
    return this;
  }

  public PrefillTabs addCheckboxTabsItem(Checkbox checkboxTabsItem) {
    if (this.checkboxTabs == null) {
      this.checkboxTabs = new java.util.ArrayList<Checkbox>();
    }
    this.checkboxTabs.add(checkboxTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document in a location where the recipient can select an option.
   * @return checkboxTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select an option.")
  public java.util.List<Checkbox> getCheckboxTabs() {
    return checkboxTabs;
  }

  public void setCheckboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
  }

  public PrefillTabs radioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
    return this;
  }

  public PrefillTabs addRadioGroupTabsItem(RadioGroup radioGroupTabsItem) {
    if (this.radioGroupTabs == null) {
      this.radioGroupTabs = new java.util.ArrayList<RadioGroup>();
    }
    this.radioGroupTabs.add(radioGroupTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.
   * @return radioGroupTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.")
  public java.util.List<RadioGroup> getRadioGroupTabs() {
    return radioGroupTabs;
  }

  public void setRadioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
  }

  public PrefillTabs tabGroups(java.util.List<TabGroup> tabGroups) {
    this.tabGroups = tabGroups;
    return this;
  }

  public PrefillTabs addTabGroupsItem(TabGroup tabGroupsItem) {
    if (this.tabGroups == null) {
      this.tabGroups = new java.util.ArrayList<TabGroup>();
    }
    this.tabGroups.add(tabGroupsItem);
    return this;
  }

   /**
   * 
   * @return tabGroups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<TabGroup> getTabGroups() {
    return tabGroups;
  }

  public void setTabGroups(java.util.List<TabGroup> tabGroups) {
    this.tabGroups = tabGroups;
  }

  public PrefillTabs textTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
    return this;
  }

  public PrefillTabs addTextTabsItem(Text textTabsItem) {
    if (this.textTabs == null) {
      this.textTabs = new java.util.ArrayList<Text>();
    }
    this.textTabs.add(textTabsItem);
    return this;
  }

   /**
   * Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return textTabs
  **/
  @ApiModelProperty(value = "Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Text> getTextTabs() {
    return textTabs;
  }

  public void setTextTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
  }


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
        Objects.equals(this.tabGroups, prefillTabs.tabGroups) &&
        Objects.equals(this.textTabs, prefillTabs.textTabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkboxTabs, radioGroupTabs, tabGroups, textTabs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefillTabs {\n");
    
    sb.append("    checkboxTabs: ").append(toIndentedString(checkboxTabs)).append("\n");
    sb.append("    radioGroupTabs: ").append(toIndentedString(radioGroupTabs)).append("\n");
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

