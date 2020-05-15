package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Filter
 */

public class Filter {
  @JsonProperty("actionRequired")
  private String actionRequired = null;

  @JsonProperty("expires")
  private String expires = null;

  @JsonProperty("folderIds")
  private String folderIds = null;

  @JsonProperty("fromDateTime")
  private String fromDateTime = null;

  @JsonProperty("isTemplate")
  private String isTemplate = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("orderBy")
  private String orderBy = null;

  @JsonProperty("searchTarget")
  private String searchTarget = null;

  @JsonProperty("searchText")
  private String searchText = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("toDateTime")
  private String toDateTime = null;

  public Filter actionRequired(String actionRequired) {
    this.actionRequired = actionRequired;
    return this;
  }

   /**
   * Access token information.
   * @return actionRequired
  **/
  @ApiModelProperty(value = "Access token information.")
  public String getActionRequired() {
    return actionRequired;
  }

  public void setActionRequired(String actionRequired) {
    this.actionRequired = actionRequired;
  }

  public Filter expires(String expires) {
    this.expires = expires;
    return this;
  }

   /**
   * 
   * @return expires
  **/
  @ApiModelProperty(value = "")
  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public Filter folderIds(String folderIds) {
    this.folderIds = folderIds;
    return this;
  }

   /**
   * 
   * @return folderIds
  **/
  @ApiModelProperty(value = "")
  public String getFolderIds() {
    return folderIds;
  }

  public void setFolderIds(String folderIds) {
    this.folderIds = folderIds;
  }

  public Filter fromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
    return this;
  }

   /**
   * 
   * @return fromDateTime
  **/
  @ApiModelProperty(value = "")
  public String getFromDateTime() {
    return fromDateTime;
  }

  public void setFromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
  }

  public Filter isTemplate(String isTemplate) {
    this.isTemplate = isTemplate;
    return this;
  }

   /**
   * 
   * @return isTemplate
  **/
  @ApiModelProperty(value = "")
  public String getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(String isTemplate) {
    this.isTemplate = isTemplate;
  }

  public Filter order(String order) {
    this.order = order;
    return this;
  }

   /**
   * 
   * @return order
  **/
  @ApiModelProperty(value = "")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public Filter orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * 
   * @return orderBy
  **/
  @ApiModelProperty(value = "")
  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  public Filter searchTarget(String searchTarget) {
    this.searchTarget = searchTarget;
    return this;
  }

   /**
   * 
   * @return searchTarget
  **/
  @ApiModelProperty(value = "")
  public String getSearchTarget() {
    return searchTarget;
  }

  public void setSearchTarget(String searchTarget) {
    this.searchTarget = searchTarget;
  }

  public Filter searchText(String searchText) {
    this.searchText = searchText;
    return this;
  }

   /**
   * 
   * @return searchText
  **/
  @ApiModelProperty(value = "")
  public String getSearchText() {
    return searchText;
  }

  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  public Filter status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Filter toDateTime(String toDateTime) {
    this.toDateTime = toDateTime;
    return this;
  }

   /**
   * Must be set to \"bearer\".
   * @return toDateTime
  **/
  @ApiModelProperty(value = "Must be set to \"bearer\".")
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
    return Objects.equals(this.actionRequired, filter.actionRequired) &&
        Objects.equals(this.expires, filter.expires) &&
        Objects.equals(this.folderIds, filter.folderIds) &&
        Objects.equals(this.fromDateTime, filter.fromDateTime) &&
        Objects.equals(this.isTemplate, filter.isTemplate) &&
        Objects.equals(this.order, filter.order) &&
        Objects.equals(this.orderBy, filter.orderBy) &&
        Objects.equals(this.searchTarget, filter.searchTarget) &&
        Objects.equals(this.searchText, filter.searchText) &&
        Objects.equals(this.status, filter.status) &&
        Objects.equals(this.toDateTime, filter.toDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionRequired, expires, folderIds, fromDateTime, isTemplate, order, orderBy, searchTarget, searchText, status, toDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    
    sb.append("    actionRequired: ").append(toIndentedString(actionRequired)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    folderIds: ").append(toIndentedString(folderIds)).append("\n");
    sb.append("    fromDateTime: ").append(toIndentedString(fromDateTime)).append("\n");
    sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    searchTarget: ").append(toIndentedString(searchTarget)).append("\n");
    sb.append("    searchText: ").append(toIndentedString(searchText)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

