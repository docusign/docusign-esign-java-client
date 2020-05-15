package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AdminMessage
 */

public class AdminMessage {
  @JsonProperty("baseMessage")
  private String baseMessage = null;

  @JsonProperty("moreInformation")
  private String moreInformation = null;

  public AdminMessage baseMessage(String baseMessage) {
    this.baseMessage = baseMessage;
    return this;
  }

   /**
   * 
   * @return baseMessage
  **/
  @ApiModelProperty(value = "")
  public String getBaseMessage() {
    return baseMessage;
  }

  public void setBaseMessage(String baseMessage) {
    this.baseMessage = baseMessage;
  }

  public AdminMessage moreInformation(String moreInformation) {
    this.moreInformation = moreInformation;
    return this;
  }

   /**
   * 
   * @return moreInformation
  **/
  @ApiModelProperty(value = "")
  public String getMoreInformation() {
    return moreInformation;
  }

  public void setMoreInformation(String moreInformation) {
    this.moreInformation = moreInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminMessage adminMessage = (AdminMessage) o;
    return Objects.equals(this.baseMessage, adminMessage.baseMessage) &&
        Objects.equals(this.moreInformation, adminMessage.moreInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseMessage, moreInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminMessage {\n");
    
    sb.append("    baseMessage: ").append(toIndentedString(baseMessage)).append("\n");
    sb.append("    moreInformation: ").append(toIndentedString(moreInformation)).append("\n");
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

