package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Comment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CommentHistoryResult.
 *
 */

public class CommentHistoryResult {
  @JsonProperty("comments")
  private java.util.List<Comment> comments = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("endTimetoken")
  private String endTimetoken = null;

  @JsonProperty("startTimetoken")
  private String startTimetoken = null;

  /**
   * comments.
   *
   * @return CommentHistoryResult
   **/
  public CommentHistoryResult comments(java.util.List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  /**
   * addCommentsItem.
   *
   * @return CommentHistoryResult
   **/
  public CommentHistoryResult addCommentsItem(Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new java.util.ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * .
   * 
   * @return comments
   **/
  @Schema(description = "")
  public java.util.List<Comment> getComments() {
    return comments;
  }

  /**
   * setComments.
   **/
  public void setComments(java.util.List<Comment> comments) {
    this.comments = comments;
  }

  /**
   * count.
   *
   * @return CommentHistoryResult
   **/
  public CommentHistoryResult count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * .
   * 
   * @return count
   **/
  @Schema(description = "")
  public Integer getCount() {
    return count;
  }

  /**
   * setCount.
   **/
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * endTimetoken.
   *
   * @return CommentHistoryResult
   **/
  public CommentHistoryResult endTimetoken(String endTimetoken) {
    this.endTimetoken = endTimetoken;
    return this;
  }

  /**
   * .
   * 
   * @return endTimetoken
   **/
  @Schema(description = "")
  public String getEndTimetoken() {
    return endTimetoken;
  }

  /**
   * setEndTimetoken.
   **/
  public void setEndTimetoken(String endTimetoken) {
    this.endTimetoken = endTimetoken;
  }

  /**
   * startTimetoken.
   *
   * @return CommentHistoryResult
   **/
  public CommentHistoryResult startTimetoken(String startTimetoken) {
    this.startTimetoken = startTimetoken;
    return this;
  }

  /**
   * .
   * 
   * @return startTimetoken
   **/
  @Schema(description = "")
  public String getStartTimetoken() {
    return startTimetoken;
  }

  /**
   * setStartTimetoken.
   **/
  public void setStartTimetoken(String startTimetoken) {
    this.startTimetoken = startTimetoken;
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
    CommentHistoryResult commentHistoryResult = (CommentHistoryResult) o;
    return Objects.equals(this.comments, commentHistoryResult.comments) &&
        Objects.equals(this.count, commentHistoryResult.count) &&
        Objects.equals(this.endTimetoken, commentHistoryResult.endTimetoken) &&
        Objects.equals(this.startTimetoken, commentHistoryResult.startTimetoken);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(comments, count, endTimetoken, startTimetoken);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentHistoryResult {\n");

    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    endTimetoken: ").append(toIndentedString(endTimetoken)).append("\n");
    sb.append("    startTimetoken: ").append(toIndentedString(startTimetoken)).append("\n");
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
