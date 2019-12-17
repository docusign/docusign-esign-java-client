package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendingCopyTab
 */

public class BulkSendingCopyTab {
  @JsonProperty("initialValue")
  private String initialValue = null;

  @JsonProperty("tabLabel")
  private String tabLabel = null;

  public BulkSendingCopyTab initialValue(String initialValue) {
    this.initialValue = initialValue;
    return this;
  }

   /**
   * The original value of the tab.
   * @return initialValue
  **/
  @ApiModelProperty(example = "null", value = "The original value of the tab.")
  public String getInitialValue() {
    return initialValue;
  }

  public void setInitialValue(String initialValue) {
    this.initialValue = initialValue;
  }

  public BulkSendingCopyTab tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

   /**
   * The label string associated with the tab.
   * @return tabLabel
  **/
  @ApiModelProperty(example = "null", value = "The label string associated with the tab.")
  public String getTabLabel() {
    return tabLabel;
  }

  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendingCopyTab bulkSendingCopyTab = (BulkSendingCopyTab) o;
    return Objects.equals(this.initialValue, bulkSendingCopyTab.initialValue) &&
        Objects.equals(this.tabLabel, bulkSendingCopyTab.tabLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialValue, tabLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendingCopyTab {\n");
    
    sb.append("    initialValue: ").append(toIndentedString(initialValue)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
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

