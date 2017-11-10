package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectFailureFilter
 */

public class ConnectFailureFilter {
  @JsonProperty("envelopeIds")
  private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();

  @JsonProperty("synchronous")
  private String synchronous = null;

  public ConnectFailureFilter envelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
    return this;
  }

  public ConnectFailureFilter addEnvelopeIdsItem(String envelopeIdsItem) {
    this.envelopeIds.add(envelopeIdsItem);
    return this;
  }

   /**
   * 
   * @return envelopeIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getEnvelopeIds() {
    return envelopeIds;
  }

  public void setEnvelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

  public ConnectFailureFilter synchronous(String synchronous) {
    this.synchronous = synchronous;
    return this;
  }

   /**
   * 
   * @return synchronous
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSynchronous() {
    return synchronous;
  }

  public void setSynchronous(String synchronous) {
    this.synchronous = synchronous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectFailureFilter connectFailureFilter = (ConnectFailureFilter) o;
    return Objects.equals(this.envelopeIds, connectFailureFilter.envelopeIds) &&
        Objects.equals(this.synchronous, connectFailureFilter.synchronous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeIds, synchronous);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectFailureFilter {\n");
    
    sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
    sb.append("    synchronous: ").append(toIndentedString(synchronous)).append("\n");
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

