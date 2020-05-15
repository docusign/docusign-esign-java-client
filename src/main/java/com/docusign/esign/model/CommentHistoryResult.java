package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Comment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CommentHistoryResult
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

  public CommentHistoryResult comments(java.util.List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  public CommentHistoryResult addCommentsItem(Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new java.util.ArrayList<Comment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * 
   * @return comments
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Comment> getComments() {
    return comments;
  }

  public void setComments(java.util.List<Comment> comments) {
    this.comments = comments;
  }

  public CommentHistoryResult count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * 
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CommentHistoryResult endTimetoken(String endTimetoken) {
    this.endTimetoken = endTimetoken;
    return this;
  }

   /**
   * 
   * @return endTimetoken
  **/
  @ApiModelProperty(value = "")
  public String getEndTimetoken() {
    return endTimetoken;
  }

  public void setEndTimetoken(String endTimetoken) {
    this.endTimetoken = endTimetoken;
  }

  public CommentHistoryResult startTimetoken(String startTimetoken) {
    this.startTimetoken = startTimetoken;
    return this;
  }

   /**
   * 
   * @return startTimetoken
  **/
  @ApiModelProperty(value = "")
  public String getStartTimetoken() {
    return startTimetoken;
  }

  public void setStartTimetoken(String startTimetoken) {
    this.startTimetoken = startTimetoken;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(comments, count, endTimetoken, startTimetoken);
  }


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

