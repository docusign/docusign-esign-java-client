package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Notification;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendBatchActionRequest.
 *
 */

public class BulkSendBatchActionRequest {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("notification")
  private Notification notification = null;

  @JsonProperty("voidReason")
  private String voidReason = null;


  /**
   * action.
   *
   * @return BulkSendBatchActionRequest
   **/
  public BulkSendBatchActionRequest action(String action) {
    this.action = action;
    return this;
  }

  /**
   * .
   * @return action
   **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }

  /**
   * setAction.
   **/
  public void setAction(String action) {
    this.action = action;
  }


  /**
   * notification.
   *
   * @return BulkSendBatchActionRequest
   **/
  public BulkSendBatchActionRequest notification(Notification notification) {
    this.notification = notification;
    return this;
  }

  /**
   * Get notification.
   * @return notification
   **/
  @ApiModelProperty(value = "")
  public Notification getNotification() {
    return notification;
  }

  /**
   * setNotification.
   **/
  public void setNotification(Notification notification) {
    this.notification = notification;
  }


  /**
   * voidReason.
   *
   * @return BulkSendBatchActionRequest
   **/
  public BulkSendBatchActionRequest voidReason(String voidReason) {
    this.voidReason = voidReason;
    return this;
  }

  /**
   * .
   * @return voidReason
   **/
  @ApiModelProperty(value = "")
  public String getVoidReason() {
    return voidReason;
  }

  /**
   * setVoidReason.
   **/
  public void setVoidReason(String voidReason) {
    this.voidReason = voidReason;
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
    BulkSendBatchActionRequest bulkSendBatchActionRequest = (BulkSendBatchActionRequest) o;
    return Objects.equals(this.action, bulkSendBatchActionRequest.action) &&
        Objects.equals(this.notification, bulkSendBatchActionRequest.notification) &&
        Objects.equals(this.voidReason, bulkSendBatchActionRequest.voidReason);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(action, notification, voidReason);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendBatchActionRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    voidReason: ").append(toIndentedString(voidReason)).append("\n");
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

