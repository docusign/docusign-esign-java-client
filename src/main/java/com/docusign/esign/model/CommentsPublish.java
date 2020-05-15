package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.CommentPublish;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CommentsPublish
 */

public class CommentsPublish {
  @JsonProperty("commentsToPublish")
  private java.util.List<CommentPublish> commentsToPublish = null;

  public CommentsPublish commentsToPublish(java.util.List<CommentPublish> commentsToPublish) {
    this.commentsToPublish = commentsToPublish;
    return this;
  }

  public CommentsPublish addCommentsToPublishItem(CommentPublish commentsToPublishItem) {
    if (this.commentsToPublish == null) {
      this.commentsToPublish = new java.util.ArrayList<CommentPublish>();
    }
    this.commentsToPublish.add(commentsToPublishItem);
    return this;
  }

   /**
   * 
   * @return commentsToPublish
  **/
  @ApiModelProperty(value = "")
  public java.util.List<CommentPublish> getCommentsToPublish() {
    return commentsToPublish;
  }

  public void setCommentsToPublish(java.util.List<CommentPublish> commentsToPublish) {
    this.commentsToPublish = commentsToPublish;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentsPublish commentsPublish = (CommentsPublish) o;
    return Objects.equals(this.commentsToPublish, commentsPublish.commentsToPublish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentsToPublish);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentsPublish {\n");
    
    sb.append("    commentsToPublish: ").append(toIndentedString(commentsToPublish)).append("\n");
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

