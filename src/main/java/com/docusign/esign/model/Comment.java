package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Comment.
 *
 */

public class Comment {
  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("hmac")
  private String hmac = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("mentions")
  private java.util.List<String> mentions = null;

  @JsonProperty("read")
  private Boolean read = null;

  @JsonProperty("sentByEmail")
  private String sentByEmail = null;

  @JsonProperty("sentByFullName")
  private String sentByFullName = null;

  @JsonProperty("sentByImageId")
  private String sentByImageId = null;

  @JsonProperty("sentByInitials")
  private String sentByInitials = null;

  @JsonProperty("sentByRecipientId")
  private String sentByRecipientId = null;

  @JsonProperty("sentByUserId")
  private String sentByUserId = null;

  @JsonProperty("signingGroupId")
  private String signingGroupId = null;

  @JsonProperty("signingGroupName")
  private String signingGroupName = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("tabId")
  private String tabId = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("threadId")
  private String threadId = null;

  @JsonProperty("threadOriginatorId")
  private String threadOriginatorId = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("timeStampFormatted")
  private String timeStampFormatted = null;

  @JsonProperty("visibleTo")
  private java.util.List<String> visibleTo = null;


  /**
   * envelopeId.
   *
   * @return Comment
   **/
  public Comment envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   * @return envelopeId
   **/
  @Schema(description = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  /**
   * setEnvelopeId.
   **/
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }


  /**
   * hmac.
   *
   * @return Comment
   **/
  public Comment hmac(String hmac) {
    this.hmac = hmac;
    return this;
  }

  /**
   * .
   * @return hmac
   **/
  @Schema(description = "")
  public String getHmac() {
    return hmac;
  }

  /**
   * setHmac.
   **/
  public void setHmac(String hmac) {
    this.hmac = hmac;
  }


  /**
   * id.
   *
   * @return Comment
   **/
  public Comment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * .
   * @return id
   **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(String id) {
    this.id = id;
  }


  /**
   * mentions.
   *
   * @return Comment
   **/
  public Comment mentions(java.util.List<String> mentions) {
    this.mentions = mentions;
    return this;
  }
  
  /**
   * addMentionsItem.
   *
   * @return Comment
   **/
  public Comment addMentionsItem(String mentionsItem) {
    if (this.mentions == null) {
      this.mentions = new java.util.ArrayList<>();
    }
    this.mentions.add(mentionsItem);
    return this;
  }

  /**
   * .
   * @return mentions
   **/
  @Schema(description = "")
  public java.util.List<String> getMentions() {
    return mentions;
  }

  /**
   * setMentions.
   **/
  public void setMentions(java.util.List<String> mentions) {
    this.mentions = mentions;
  }


  /**
   * read.
   *
   * @return Comment
   **/
  public Comment read(Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * .
   * @return read
   **/
  @Schema(description = "")
  public Boolean isRead() {
    return read;
  }

  /**
   * setRead.
   **/
  public void setRead(Boolean read) {
    this.read = read;
  }


  /**
   * sentByEmail.
   *
   * @return Comment
   **/
  public Comment sentByEmail(String sentByEmail) {
    this.sentByEmail = sentByEmail;
    return this;
  }

  /**
   * .
   * @return sentByEmail
   **/
  @Schema(description = "")
  public String getSentByEmail() {
    return sentByEmail;
  }

  /**
   * setSentByEmail.
   **/
  public void setSentByEmail(String sentByEmail) {
    this.sentByEmail = sentByEmail;
  }


  /**
   * sentByFullName.
   *
   * @return Comment
   **/
  public Comment sentByFullName(String sentByFullName) {
    this.sentByFullName = sentByFullName;
    return this;
  }

  /**
   * .
   * @return sentByFullName
   **/
  @Schema(description = "")
  public String getSentByFullName() {
    return sentByFullName;
  }

  /**
   * setSentByFullName.
   **/
  public void setSentByFullName(String sentByFullName) {
    this.sentByFullName = sentByFullName;
  }


  /**
   * sentByImageId.
   *
   * @return Comment
   **/
  public Comment sentByImageId(String sentByImageId) {
    this.sentByImageId = sentByImageId;
    return this;
  }

  /**
   * .
   * @return sentByImageId
   **/
  @Schema(description = "")
  public String getSentByImageId() {
    return sentByImageId;
  }

  /**
   * setSentByImageId.
   **/
  public void setSentByImageId(String sentByImageId) {
    this.sentByImageId = sentByImageId;
  }


  /**
   * sentByInitials.
   *
   * @return Comment
   **/
  public Comment sentByInitials(String sentByInitials) {
    this.sentByInitials = sentByInitials;
    return this;
  }

  /**
   * .
   * @return sentByInitials
   **/
  @Schema(description = "")
  public String getSentByInitials() {
    return sentByInitials;
  }

  /**
   * setSentByInitials.
   **/
  public void setSentByInitials(String sentByInitials) {
    this.sentByInitials = sentByInitials;
  }


  /**
   * sentByRecipientId.
   *
   * @return Comment
   **/
  public Comment sentByRecipientId(String sentByRecipientId) {
    this.sentByRecipientId = sentByRecipientId;
    return this;
  }

  /**
   * .
   * @return sentByRecipientId
   **/
  @Schema(description = "")
  public String getSentByRecipientId() {
    return sentByRecipientId;
  }

  /**
   * setSentByRecipientId.
   **/
  public void setSentByRecipientId(String sentByRecipientId) {
    this.sentByRecipientId = sentByRecipientId;
  }


  /**
   * sentByUserId.
   *
   * @return Comment
   **/
  public Comment sentByUserId(String sentByUserId) {
    this.sentByUserId = sentByUserId;
    return this;
  }

  /**
   * .
   * @return sentByUserId
   **/
  @Schema(description = "")
  public String getSentByUserId() {
    return sentByUserId;
  }

  /**
   * setSentByUserId.
   **/
  public void setSentByUserId(String sentByUserId) {
    this.sentByUserId = sentByUserId;
  }


  /**
   * signingGroupId.
   *
   * @return Comment
   **/
  public Comment signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once)..
   * @return signingGroupId
   **/
  @Schema(description = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  /**
   * setSigningGroupId.
   **/
  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }


  /**
   * signingGroupName.
   *
   * @return Comment
   **/
  public Comment signingGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
    return this;
  }

  /**
   * The display name for the signing group.   Maximum Length: 100 characters. .
   * @return signingGroupName
   **/
  @Schema(description = "The display name for the signing group.   Maximum Length: 100 characters. ")
  public String getSigningGroupName() {
    return signingGroupName;
  }

  /**
   * setSigningGroupName.
   **/
  public void setSigningGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
  }


  /**
   * subject.
   *
   * @return Comment
   **/
  public Comment subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * .
   * @return subject
   **/
  @Schema(description = "")
  public String getSubject() {
    return subject;
  }

  /**
   * setSubject.
   **/
  public void setSubject(String subject) {
    this.subject = subject;
  }


  /**
   * tabId.
   *
   * @return Comment
   **/
  public Comment tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

  /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     .
   * @return tabId
   **/
  @Schema(description = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  /**
   * setTabId.
   **/
  public void setTabId(String tabId) {
    this.tabId = tabId;
  }


  /**
   * text.
   *
   * @return Comment
   **/
  public Comment text(String text) {
    this.text = text;
    return this;
  }

  /**
   * .
   * @return text
   **/
  @Schema(description = "")
  public String getText() {
    return text;
  }

  /**
   * setText.
   **/
  public void setText(String text) {
    this.text = text;
  }


  /**
   * threadId.
   *
   * @return Comment
   **/
  public Comment threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  /**
   * .
   * @return threadId
   **/
  @Schema(description = "")
  public String getThreadId() {
    return threadId;
  }

  /**
   * setThreadId.
   **/
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  /**
   * threadOriginatorId.
   *
   * @return Comment
   **/
  public Comment threadOriginatorId(String threadOriginatorId) {
    this.threadOriginatorId = threadOriginatorId;
    return this;
  }

  /**
   * .
   * @return threadOriginatorId
   **/
  @Schema(description = "")
  public String getThreadOriginatorId() {
    return threadOriginatorId;
  }

  /**
   * setThreadOriginatorId.
   **/
  public void setThreadOriginatorId(String threadOriginatorId) {
    this.threadOriginatorId = threadOriginatorId;
  }


  /**
   * timestamp.
   *
   * @return Comment
   **/
  public Comment timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * .
   * @return timestamp
   **/
  @Schema(description = "")
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * setTimestamp.
   **/
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * timeStampFormatted.
   *
   * @return Comment
   **/
  public Comment timeStampFormatted(String timeStampFormatted) {
    this.timeStampFormatted = timeStampFormatted;
    return this;
  }

  /**
   * .
   * @return timeStampFormatted
   **/
  @Schema(description = "")
  public String getTimeStampFormatted() {
    return timeStampFormatted;
  }

  /**
   * setTimeStampFormatted.
   **/
  public void setTimeStampFormatted(String timeStampFormatted) {
    this.timeStampFormatted = timeStampFormatted;
  }


  /**
   * visibleTo.
   *
   * @return Comment
   **/
  public Comment visibleTo(java.util.List<String> visibleTo) {
    this.visibleTo = visibleTo;
    return this;
  }
  
  /**
   * addVisibleToItem.
   *
   * @return Comment
   **/
  public Comment addVisibleToItem(String visibleToItem) {
    if (this.visibleTo == null) {
      this.visibleTo = new java.util.ArrayList<>();
    }
    this.visibleTo.add(visibleToItem);
    return this;
  }

  /**
   * .
   * @return visibleTo
   **/
  @Schema(description = "")
  public java.util.List<String> getVisibleTo() {
    return visibleTo;
  }

  /**
   * setVisibleTo.
   **/
  public void setVisibleTo(java.util.List<String> visibleTo) {
    this.visibleTo = visibleTo;
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
    Comment comment = (Comment) o;
    return Objects.equals(this.envelopeId, comment.envelopeId) &&
        Objects.equals(this.hmac, comment.hmac) &&
        Objects.equals(this.id, comment.id) &&
        Objects.equals(this.mentions, comment.mentions) &&
        Objects.equals(this.read, comment.read) &&
        Objects.equals(this.sentByEmail, comment.sentByEmail) &&
        Objects.equals(this.sentByFullName, comment.sentByFullName) &&
        Objects.equals(this.sentByImageId, comment.sentByImageId) &&
        Objects.equals(this.sentByInitials, comment.sentByInitials) &&
        Objects.equals(this.sentByRecipientId, comment.sentByRecipientId) &&
        Objects.equals(this.sentByUserId, comment.sentByUserId) &&
        Objects.equals(this.signingGroupId, comment.signingGroupId) &&
        Objects.equals(this.signingGroupName, comment.signingGroupName) &&
        Objects.equals(this.subject, comment.subject) &&
        Objects.equals(this.tabId, comment.tabId) &&
        Objects.equals(this.text, comment.text) &&
        Objects.equals(this.threadId, comment.threadId) &&
        Objects.equals(this.threadOriginatorId, comment.threadOriginatorId) &&
        Objects.equals(this.timestamp, comment.timestamp) &&
        Objects.equals(this.timeStampFormatted, comment.timeStampFormatted) &&
        Objects.equals(this.visibleTo, comment.visibleTo);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, hmac, id, mentions, read, sentByEmail, sentByFullName, sentByImageId, sentByInitials, sentByRecipientId, sentByUserId, signingGroupId, signingGroupName, subject, tabId, text, threadId, threadOriginatorId, timestamp, timeStampFormatted, visibleTo);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    hmac: ").append(toIndentedString(hmac)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    sentByEmail: ").append(toIndentedString(sentByEmail)).append("\n");
    sb.append("    sentByFullName: ").append(toIndentedString(sentByFullName)).append("\n");
    sb.append("    sentByImageId: ").append(toIndentedString(sentByImageId)).append("\n");
    sb.append("    sentByInitials: ").append(toIndentedString(sentByInitials)).append("\n");
    sb.append("    sentByRecipientId: ").append(toIndentedString(sentByRecipientId)).append("\n");
    sb.append("    sentByUserId: ").append(toIndentedString(sentByUserId)).append("\n");
    sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
    sb.append("    signingGroupName: ").append(toIndentedString(signingGroupName)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    threadOriginatorId: ").append(toIndentedString(threadOriginatorId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timeStampFormatted: ").append(toIndentedString(timeStampFormatted)).append("\n");
    sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
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

