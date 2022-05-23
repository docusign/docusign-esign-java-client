package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TabMetadataList. */
public class TabMetadataList {
  @JsonProperty("tabs")
  private java.util.List<TabMetadata> tabs = null;

  /**
   * tabs.
   *
   * @return TabMetadataList
   */
  public TabMetadataList tabs(java.util.List<TabMetadata> tabs) {
    this.tabs = tabs;
    return this;
  }

  /**
   * addTabsItem.
   *
   * @return TabMetadataList
   */
  public TabMetadataList addTabsItem(TabMetadata tabsItem) {
    if (this.tabs == null) {
      this.tabs = new java.util.ArrayList<>();
    }
    this.tabs.add(tabsItem);
    return this;
  }

  /**
   * .
   *
   * @return tabs
   */
  @ApiModelProperty(value = "")
  public java.util.List<TabMetadata> getTabs() {
    return tabs;
  }

  /** setTabs. */
  public void setTabs(java.util.List<TabMetadata> tabs) {
    this.tabs = tabs;
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
    TabMetadataList tabMetadataList = (TabMetadataList) o;
    return Objects.equals(this.tabs, tabMetadataList.tabs);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(tabs);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabMetadataList {\n");

    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
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
