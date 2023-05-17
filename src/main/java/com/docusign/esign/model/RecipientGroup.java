package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.RecipientOption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Describes a group of recipients..
 *
 */
@Schema(description = "Describes a group of recipients.")

public class RecipientGroup {
  @JsonProperty("groupMessage")
  private String groupMessage = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("recipients")
  private java.util.List<RecipientOption> recipients = null;


  /**
   * groupMessage.
   *
   * @return RecipientGroup
   **/
  public RecipientGroup groupMessage(String groupMessage) {
    this.groupMessage = groupMessage;
    return this;
  }

  /**
   * .
   * @return groupMessage
   **/
  @Schema(description = "")
  public String getGroupMessage() {
    return groupMessage;
  }

  /**
   * setGroupMessage.
   **/
  public void setGroupMessage(String groupMessage) {
    this.groupMessage = groupMessage;
  }


  /**
   * groupName.
   *
   * @return RecipientGroup
   **/
  public RecipientGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * The name of the group..
   * @return groupName
   **/
  @Schema(description = "The name of the group.")
  public String getGroupName() {
    return groupName;
  }

  /**
   * setGroupName.
   **/
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  /**
   * recipients.
   *
   * @return RecipientGroup
   **/
  public RecipientGroup recipients(java.util.List<RecipientOption> recipients) {
    this.recipients = recipients;
    return this;
  }
  
  /**
   * addRecipientsItem.
   *
   * @return RecipientGroup
   **/
  public RecipientGroup addRecipientsItem(RecipientOption recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new java.util.ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * An array of powerform recipients..
   * @return recipients
   **/
  @Schema(description = "An array of powerform recipients.")
  public java.util.List<RecipientOption> getRecipients() {
    return recipients;
  }

  /**
   * setRecipients.
   **/
  public void setRecipients(java.util.List<RecipientOption> recipients) {
    this.recipients = recipients;
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
    RecipientGroup recipientGroup = (RecipientGroup) o;
    return Objects.equals(this.groupMessage, recipientGroup.groupMessage) &&
        Objects.equals(this.groupName, recipientGroup.groupName) &&
        Objects.equals(this.recipients, recipientGroup.recipients);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(groupMessage, groupName, recipients);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientGroup {\n");
    
    sb.append("    groupMessage: ").append(toIndentedString(groupMessage)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

