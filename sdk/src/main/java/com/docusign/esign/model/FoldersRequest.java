package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class FoldersRequest   {
  
  private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();
  private String fromFolderId = null;

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("envelopeIds")
  public java.util.List<String> getEnvelopeIds() {
    return envelopeIds;
  }
  public void setEnvelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

  
  /**
   * The folder ID the envelope is being moved from.
   **/
  @ApiModelProperty(value = "The folder ID the envelope is being moved from.")
  @JsonProperty("fromFolderId")
  public String getFromFolderId() {
    return fromFolderId;
  }
  public void setFromFolderId(String fromFolderId) {
    this.fromFolderId = fromFolderId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoldersRequest foldersRequest = (FoldersRequest) o;
    return Objects.equals(envelopeIds, foldersRequest.envelopeIds) &&
        Objects.equals(fromFolderId, foldersRequest.fromFolderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeIds, fromFolderId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoldersRequest {\n");
    
    sb.append("    envelopeIds: ").append(StringUtil.toIndentedString(envelopeIds)).append("\n");
    sb.append("    fromFolderId: ").append(StringUtil.toIndentedString(fromFolderId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
