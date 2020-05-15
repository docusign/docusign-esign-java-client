package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Notary
 */

public class Notary {
  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("enabled")
  private String enabled = null;

  @JsonProperty("searchable")
  private String searchable = null;

  @JsonProperty("userInfo")
  private UserInformation userInfo = null;

  public Notary createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * 
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public Notary enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * 
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public Notary searchable(String searchable) {
    this.searchable = searchable;
    return this;
  }

   /**
   * 
   * @return searchable
  **/
  @ApiModelProperty(value = "")
  public String getSearchable() {
    return searchable;
  }

  public void setSearchable(String searchable) {
    this.searchable = searchable;
  }

  public Notary userInfo(UserInformation userInfo) {
    this.userInfo = userInfo;
    return this;
  }

   /**
   * Get userInfo
   * @return userInfo
  **/
  @ApiModelProperty(value = "")
  public UserInformation getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(UserInformation userInfo) {
    this.userInfo = userInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notary notary = (Notary) o;
    return Objects.equals(this.createdDate, notary.createdDate) &&
        Objects.equals(this.enabled, notary.enabled) &&
        Objects.equals(this.searchable, notary.searchable) &&
        Objects.equals(this.userInfo, notary.userInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, enabled, searchable, userInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notary {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
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

