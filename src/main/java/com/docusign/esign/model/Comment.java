package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Comment
 */

public class Comment {
  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("hmac")
  private String hmac = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("mentions")
  private java.util.List<String> mentions = new java.util.ArrayList<String>();

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
  private java.util.List<String> visibleTo = new java.util.ArrayList<String>();

  public Comment envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(example = "null", value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public Comment hmac(String hmac) {
    this.hmac = hmac;
    return this;
  }

   /**
   * 
   * @return hmac
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHmac() {
    return hmac;
  }

  public void setHmac(String hmac) {
    this.hmac = hmac;
  }

  public Comment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Comment mentions(java.util.List<String> mentions) {
    this.mentions = mentions;
    return this;
  }

  public Comment addMentionsItem(String mentionsItem) {
    this.mentions.add(mentionsItem);
    return this;
  }

   /**
   * 
   * @return mentions
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getMentions() {
    return mentions;
  }

  public void setMentions(java.util.List<String> mentions) {
    this.mentions = mentions;
  }

  public Comment read(Boolean read) {
    this.read = read;
    return this;
  }

   /**
   * 
   * @return read
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public Comment sentByEmail(String sentByEmail) {
    this.sentByEmail = sentByEmail;
    return this;
  }

   /**
   * 
   * @return sentByEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSentByEmail() {
    return sentByEmail;
  }

  public void setSentByEmail(String sentByEmail) {
    this.sentByEmail = sentByEmail;
  }

  public Comment sentByFullName(String sentByFullName) {
    this.sentByFullName = sentByFullName;
    return this;
  }

   /**
   * 
   * @return sentByFullName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSentByFullName() {
    return sentByFullName;
  }

  public void setSentByFullName(String sentByFullName) {
    this.sentByFullName = sentByFullName;
  }

  public Comment sentByImageId(String sentByImageId) {
    this.sentByImageId = sentByImageId;
    return this;
  }

   /**
   * 
   * @return sentByImageId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSentByImageId() {
    return sentByImageId;
  }

  public void setSentByImageId(String sentByImageId) {
    this.sentByImageId = sentByImageId;
  }

  public Comment sentByInitials(String sentByInitials) {
    this.sentByInitials = sentByInitials;
    return this;
  }

   /**
   * 
   * @return sentByInitials
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSentByInitials() {
    return sentByInitials;
  }

  public void setSentByInitials(String sentByInitials) {
    this.sentByInitials = sentByInitials;
  }

  public Comment sentByRecipientId(String sentByRecipientId) {
    this.sentByRecipientId = sentByRecipientId;
    return this;
  }

   /**
   * 
   * @return sentByRecipientId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSentByRecipientId() {
    return sentByRecipientId;
  }

  public void setSentByRecipientId(String sentByRecipientId) {
    this.sentByRecipientId = sentByRecipientId;
  }

  public Comment sentByUserId(String sentByUserId) {
    this.sentByUserId = sentByUserId;
    return this;
  }

   /**
   * 
   * @return sentByUserId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSentByUserId() {
    return sentByUserId;
  }

  public void setSentByUserId(String sentByUserId) {
    this.sentByUserId = sentByUserId;
  }

  public Comment signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

   /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   * @return signingGroupId
  **/
  @ApiModelProperty(example = "null", value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }

  public Comment signingGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
    return this;
  }

   /**
   * The display name for the signing group.   Maximum Length: 100 characters. 
   * @return signingGroupName
  **/
  @ApiModelProperty(example = "null", value = "The display name for the signing group.   Maximum Length: 100 characters. ")
  public String getSigningGroupName() {
    return signingGroupName;
  }

  public void setSigningGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
  }

  public Comment subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * 
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Comment tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

   /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     
   * @return tabId
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  public void setTabId(String tabId) {
    this.tabId = tabId;
  }

  public Comment text(String text) {
    this.text = text;
    return this;
  }

   /**
   * 
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Comment threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * 
   * @return threadId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public Comment threadOriginatorId(String threadOriginatorId) {
    this.threadOriginatorId = threadOriginatorId;
    return this;
  }

   /**
   * 
   * @return threadOriginatorId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThreadOriginatorId() {
    return threadOriginatorId;
  }

  public void setThreadOriginatorId(String threadOriginatorId) {
    this.threadOriginatorId = threadOriginatorId;
  }

  public Comment timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * 
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Comment timeStampFormatted(String timeStampFormatted) {
    this.timeStampFormatted = timeStampFormatted;
    return this;
  }

   /**
   * 
   * @return timeStampFormatted
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimeStampFormatted() {
    return timeStampFormatted;
  }

  public void setTimeStampFormatted(String timeStampFormatted) {
    this.timeStampFormatted = timeStampFormatted;
  }

  public Comment visibleTo(java.util.List<String> visibleTo) {
    this.visibleTo = visibleTo;
    return this;
  }

  public Comment addVisibleToItem(String visibleToItem) {
    this.visibleTo.add(visibleToItem);
    return this;
  }

   /**
   * 
   * @return visibleTo
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getVisibleTo() {
    return visibleTo;
  }

  public void setVisibleTo(java.util.List<String> visibleTo) {
    this.visibleTo = visibleTo;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, hmac, id, mentions, read, sentByEmail, sentByFullName, sentByImageId, sentByInitials, sentByRecipientId, sentByUserId, signingGroupId, signingGroupName, subject, tabId, text, threadId, threadOriginatorId, timestamp, timeStampFormatted, visibleTo);
  }


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

