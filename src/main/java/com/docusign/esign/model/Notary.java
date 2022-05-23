package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Notary. */
public class Notary {
  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("enabled")
  private String enabled = null;

  @JsonProperty("searchable")
  private String searchable = null;

  @JsonProperty("userInfo")
  private UserInformation userInfo = null;

  /**
   * createdDate.
   *
   * @return Notary
   */
  public Notary createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * .
   *
   * @return createdDate
   */
  @ApiModelProperty(value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  /** setCreatedDate. */
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * enabled.
   *
   * @return Notary
   */
  public Notary enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * .
   *
   * @return enabled
   */
  @ApiModelProperty(value = "")
  public String getEnabled() {
    return enabled;
  }

  /** setEnabled. */
  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  /**
   * searchable.
   *
   * @return Notary
   */
  public Notary searchable(String searchable) {
    this.searchable = searchable;
    return this;
  }

  /**
   * .
   *
   * @return searchable
   */
  @ApiModelProperty(value = "")
  public String getSearchable() {
    return searchable;
  }

  /** setSearchable. */
  public void setSearchable(String searchable) {
    this.searchable = searchable;
  }

  /**
   * userInfo.
   *
   * @return Notary
   */
  public Notary userInfo(UserInformation userInfo) {
    this.userInfo = userInfo;
    return this;
  }

  /**
   * Get userInfo.
   *
   * @return userInfo
   */
  @ApiModelProperty(value = "")
  public UserInformation getUserInfo() {
    return userInfo;
  }

  /** setUserInfo. */
  public void setUserInfo(UserInformation userInfo) {
    this.userInfo = userInfo;
  }

  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notary notary = (Notary) o;
    return Objects.equals(this.createdDate, notary.createdDate)
        && Objects.equals(this.enabled, notary.enabled)
        && Objects.equals(this.searchable, notary.searchable)
        && Objects.equals(this.userInfo, notary.userInfo);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(createdDate, enabled, searchable, userInfo);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
