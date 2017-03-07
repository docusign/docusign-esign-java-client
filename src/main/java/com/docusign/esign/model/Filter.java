package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Filter   {
  
  private String actionRequired = null;
  private String expires = null;
  private String folderIds = null;
  private String fromDateTime = null;
  private String isTemplate = null;
  private String order = null;
  private String orderBy = null;
  private String searchTarget = null;
  private String searchText = null;
  private String status = null;
  private String toDateTime = null;

  
  /**
   * Access token information.
   **/
  
  @ApiModelProperty(value = "Access token information.")
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
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("fromDateTime")
  public String getFromDateTime() {
    return fromDateTime;
  }
  public void setFromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isTemplate")
  public String getIsTemplate() {
    return isTemplate;
  }
  public void setIsTemplate(String isTemplate) {
    this.isTemplate = isTemplate;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("searchText")
  public String getSearchText() {
    return searchText;
  }
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Must be set to \"bearer\".
   **/
  
  @ApiModelProperty(value = "Must be set to \"bearer\".")
  @JsonProperty("toDateTime")
  public String getToDateTime() {
    return toDateTime;
  }
  public void setToDateTime(String toDateTime) {
    this.toDateTime = toDateTime;
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

    return true && Objects.equals(actionRequired, filter.actionRequired) &&
        Objects.equals(expires, filter.expires) &&
        Objects.equals(folderIds, filter.folderIds) &&
        Objects.equals(fromDateTime, filter.fromDateTime) &&
        Objects.equals(isTemplate, filter.isTemplate) &&
        Objects.equals(order, filter.order) &&
        Objects.equals(orderBy, filter.orderBy) &&
        Objects.equals(searchTarget, filter.searchTarget) &&
        Objects.equals(searchText, filter.searchText) &&
        Objects.equals(status, filter.status) &&
        Objects.equals(toDateTime, filter.toDateTime)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionRequired, expires, folderIds, fromDateTime, isTemplate, order, orderBy, searchTarget, searchText, status, toDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    
    if (actionRequired != null)
      sb.append("    actionRequired: ").append(toIndentedString(actionRequired)).append("\n");
    if (expires != null)
      sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    if (folderIds != null)
      sb.append("    folderIds: ").append(toIndentedString(folderIds)).append("\n");
    if (fromDateTime != null)
      sb.append("    fromDateTime: ").append(toIndentedString(fromDateTime)).append("\n");
    if (isTemplate != null)
      sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
    if (order != null)
      sb.append("    order: ").append(toIndentedString(order)).append("\n");
    if (orderBy != null)
      sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    if (searchTarget != null)
      sb.append("    searchTarget: ").append(toIndentedString(searchTarget)).append("\n");
    if (searchText != null)
      sb.append("    searchText: ").append(toIndentedString(searchText)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (toDateTime != null)
      sb.append("    toDateTime: ").append(toIndentedString(toDateTime)).append("\n");
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

