package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.TabMetadata;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class TabMetadataList   {
  
  private java.util.List<TabMetadata> tabs = new java.util.ArrayList<TabMetadata>();

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tabs")
  public java.util.List<TabMetadata> getTabs() {
    return tabs;
  }
  public void setTabs(java.util.List<TabMetadata> tabs) {
    this.tabs = tabs;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TabMetadataList tabMetadataList = (TabMetadataList) o;
    return Objects.equals(tabs, tabMetadataList.tabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tabs);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabMetadataList {\n");
    
    sb.append("    tabs: ").append(StringUtil.toIndentedString(tabs)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
