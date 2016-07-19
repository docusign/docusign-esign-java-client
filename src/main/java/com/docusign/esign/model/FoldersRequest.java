package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class FoldersRequest   {
  
  private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();
  private String fromFolderId = null;

  
  /**
   * 
   **/
  public FoldersRequest envelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("envelopeIds")
  public java.util.List<String> getEnvelopeIds() {
    return envelopeIds;
  }
  public void setEnvelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

  
  /**
   *  The folder ID the envelope is being moved from.
   **/
  public FoldersRequest fromFolderId(String fromFolderId) {
    this.fromFolderId = fromFolderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " The folder ID the envelope is being moved from.")
  @JsonProperty("fromFolderId")
  public String getFromFolderId() {
    return fromFolderId;
  }
  public void setFromFolderId(String fromFolderId) {
    this.fromFolderId = fromFolderId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoldersRequest foldersRequest = (FoldersRequest) o;
    return Objects.equals(this.envelopeIds, foldersRequest.envelopeIds) &&
        Objects.equals(this.fromFolderId, foldersRequest.fromFolderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeIds, fromFolderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoldersRequest {\n");
    
    sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
    sb.append("    fromFolderId: ").append(toIndentedString(fromFolderId)).append("\n");
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

