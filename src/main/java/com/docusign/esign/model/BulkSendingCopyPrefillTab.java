package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * BulkSendingCopyPrefillTab.
 *
 */

public class BulkSendingCopyPrefillTab implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("initialValue")
  private String initialValue = null;

  @JsonProperty("tabLabel")
  private String tabLabel = null;


  /**
   * initialValue.
   *
   * @return BulkSendingCopyPrefillTab
   **/
  public BulkSendingCopyPrefillTab initialValue(String initialValue) {
    this.initialValue = initialValue;
    return this;
  }

  /**
   * The original value of the tab..
   * @return initialValue
   **/
  @Schema(description = "The original value of the tab.")
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
   * tabLabel.
   *
   * @return BulkSendingCopyPrefillTab
   **/
  public BulkSendingCopyPrefillTab tabLabel(String tabLabel) {
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
    BulkSendingCopyPrefillTab bulkSendingCopyPrefillTab = (BulkSendingCopyPrefillTab) o;
    return Objects.equals(this.initialValue, bulkSendingCopyPrefillTab.initialValue) &&
        Objects.equals(this.tabLabel, bulkSendingCopyPrefillTab.tabLabel);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(initialValue, tabLabel);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendingCopyPrefillTab {\n");
    
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

