package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A tab associated with the bulk send recipient. In a bulk send request, each recipient tab must match a recipient tab on the envelope or template that you want to send. To match up, the &#x60;tabLabel&#x60; for this tab and the &#x60;tabLabel&#x60; for the corresponding tab on the envelope or template must be the same.  For example, if the envelope has a placeholder text tab with the &#x60;tabLabel&#x60; &#x60;childName&#x60;, you must assign the same &#x60;tabLabel&#x60; &#x60;childName&#x60; to the tab here that you are populating with that information..
 *
 */
@ApiModel(description = "A tab associated with the bulk send recipient. In a bulk send request, each recipient tab must match a recipient tab on the envelope or template that you want to send. To match up, the `tabLabel` for this tab and the `tabLabel` for the corresponding tab on the envelope or template must be the same.  For example, if the envelope has a placeholder text tab with the `tabLabel` `childName`, you must assign the same `tabLabel` `childName` to the tab here that you are populating with that information.")

public class BulkSendingCopyTab {
  @JsonProperty("initialValue")
  private String initialValue = null;

  @JsonProperty("tabLabel")
  private String tabLabel = null;


  /**
   * initialValue.
   *
   * @return BulkSendingCopyTab
   **/
  public BulkSendingCopyTab initialValue(String initialValue) {
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
   * tabLabel.
   *
   * @return BulkSendingCopyTab
   **/
  public BulkSendingCopyTab tabLabel(String tabLabel) {
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
    BulkSendingCopyTab bulkSendingCopyTab = (BulkSendingCopyTab) o;
    return Objects.equals(this.initialValue, bulkSendingCopyTab.initialValue) &&
        Objects.equals(this.tabLabel, bulkSendingCopyTab.tabLabel);
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

