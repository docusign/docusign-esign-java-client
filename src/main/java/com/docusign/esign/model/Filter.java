package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class Filter   {
  
  private String actionRequired = null;
  private String expires = null;
  private String isTemplate = null;
  private String status = null;
  private String fromDateTime = null;
  private String toDateTime = null;
  private String searchTarget = null;
  private String searchText = null;
  private String folderIds = null;
  private String orderBy = null;
  private String order = null;

  
  /**
   * Access token information.
   **/
  public Filter actionRequired(String actionRequired) {
    this.actionRequired = actionRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Access token information.")
  @JsonProperty("actionRequired")
  public String getActionRequired() {
    return actionRequired;
  }
  public void setActionRequired(String actionRequired) {
    this.actionRequired = actionRequired;
  }

  
  /**
   * 
   **/
  public Filter expires(String expires) {
    this.expires = expires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expires")
  public String getExpires() {
    return expires;
  }
  public void setExpires(String expires) {
    this.expires = expires;
  }

  
  /**
   * 
   **/
  public Filter isTemplate(String isTemplate) {
    this.isTemplate = isTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isTemplate")
  public String getIsTemplate() {
    return isTemplate;
  }
  public void setIsTemplate(String isTemplate) {
    this.isTemplate = isTemplate;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  public Filter status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * 
   **/
  public Filter fromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fromDateTime")
  public String getFromDateTime() {
    return fromDateTime;
  }
  public void setFromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
  }

  
  /**
   * Must be set to \"bearer\".
   **/
  public Filter toDateTime(String toDateTime) {
    this.toDateTime = toDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Must be set to \"bearer\".")
  @JsonProperty("toDateTime")
  public String getToDateTime() {
    return toDateTime;
  }
  public void setToDateTime(String toDateTime) {
    this.toDateTime = toDateTime;
  }

  
  /**
   * 
   **/
  public Filter searchTarget(String searchTarget) {
    this.searchTarget = searchTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("searchTarget")
  public String getSearchTarget() {
    return searchTarget;
  }
  public void setSearchTarget(String searchTarget) {
    this.searchTarget = searchTarget;
  }

  
  /**
   * 
   **/
  public Filter searchText(String searchText) {
    this.searchText = searchText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("searchText")
  public String getSearchText() {
    return searchText;
  }
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  
  /**
   * 
   **/
  public Filter folderIds(String folderIds) {
    this.folderIds = folderIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("folderIds")
  public String getFolderIds() {
    return folderIds;
  }
  public void setFolderIds(String folderIds) {
    this.folderIds = folderIds;
  }

  
  /**
   * 
   **/
  public Filter orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderBy")
  public String getOrderBy() {
    return orderBy;
  }
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  
  /**
   * 
   **/
  public Filter order(String order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.actionRequired, filter.actionRequired) &&
        Objects.equals(this.expires, filter.expires) &&
        Objects.equals(this.isTemplate, filter.isTemplate) &&
        Objects.equals(this.status, filter.status) &&
        Objects.equals(this.fromDateTime, filter.fromDateTime) &&
        Objects.equals(this.toDateTime, filter.toDateTime) &&
        Objects.equals(this.searchTarget, filter.searchTarget) &&
        Objects.equals(this.searchText, filter.searchText) &&
        Objects.equals(this.folderIds, filter.folderIds) &&
        Objects.equals(this.orderBy, filter.orderBy) &&
        Objects.equals(this.order, filter.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionRequired, expires, isTemplate, status, fromDateTime, toDateTime, searchTarget, searchText, folderIds, orderBy, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    
    sb.append("    actionRequired: ").append(toIndentedString(actionRequired)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fromDateTime: ").append(toIndentedString(fromDateTime)).append("\n");
    sb.append("    toDateTime: ").append(toIndentedString(toDateTime)).append("\n");
    sb.append("    searchTarget: ").append(toIndentedString(searchTarget)).append("\n");
    sb.append("    searchText: ").append(toIndentedString(searchText)).append("\n");
    sb.append("    folderIds: ").append(toIndentedString(folderIds)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

