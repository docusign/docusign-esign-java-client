package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Group;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MemberGroupSharedItem
 */

public class MemberGroupSharedItem {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("group")
  private Group group = null;

  @JsonProperty("shared")
  private String shared = null;

  public MemberGroupSharedItem errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public MemberGroupSharedItem group(Group group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(example = "null", value = "")
  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public MemberGroupSharedItem shared(String shared) {
    this.shared = shared;
    return this;
  }

   /**
   * When set to **true**, this custom tab is shared.
   * @return shared
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  public void setShared(String shared) {
    this.shared = shared;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberGroupSharedItem memberGroupSharedItem = (MemberGroupSharedItem) o;
    return Objects.equals(this.errorDetails, memberGroupSharedItem.errorDetails) &&
        Objects.equals(this.group, memberGroupSharedItem.group) &&
        Objects.equals(this.shared, memberGroupSharedItem.shared);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, group, shared);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberGroupSharedItem {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
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

