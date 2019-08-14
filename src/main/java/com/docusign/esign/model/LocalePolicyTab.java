package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LocalePolicyTab
 */

public class LocalePolicyTab {
  @JsonProperty("addressFormat")
  private String addressFormat = null;

  @JsonProperty("calendarType")
  private String calendarType = null;

  @JsonProperty("cultureName")
  private String cultureName = null;

  @JsonProperty("currencyNegativeFormat")
  private String currencyNegativeFormat = null;

  @JsonProperty("currencyPositiveFormat")
  private String currencyPositiveFormat = null;

  @JsonProperty("customDateFormat")
  private String customDateFormat = null;

  @JsonProperty("customTimeFormat")
  private String customTimeFormat = null;

  @JsonProperty("dateFormat")
  private String dateFormat = null;

  @JsonProperty("initialFormat")
  private String initialFormat = null;

  @JsonProperty("nameFormat")
  private String nameFormat = null;

  @JsonProperty("timeFormat")
  private String timeFormat = null;

  @JsonProperty("timeZone")
  private String timeZone = null;

  public LocalePolicyTab addressFormat(String addressFormat) {
    this.addressFormat = addressFormat;
    return this;
  }

   /**
   * 
   * @return addressFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAddressFormat() {
    return addressFormat;
  }

  public void setAddressFormat(String addressFormat) {
    this.addressFormat = addressFormat;
  }

  public LocalePolicyTab calendarType(String calendarType) {
    this.calendarType = calendarType;
    return this;
  }

   /**
   * 
   * @return calendarType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCalendarType() {
    return calendarType;
  }

  public void setCalendarType(String calendarType) {
    this.calendarType = calendarType;
  }

  public LocalePolicyTab cultureName(String cultureName) {
    this.cultureName = cultureName;
    return this;
  }

   /**
   * 
   * @return cultureName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCultureName() {
    return cultureName;
  }

  public void setCultureName(String cultureName) {
    this.cultureName = cultureName;
  }

  public LocalePolicyTab currencyNegativeFormat(String currencyNegativeFormat) {
    this.currencyNegativeFormat = currencyNegativeFormat;
    return this;
  }

   /**
   * 
   * @return currencyNegativeFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrencyNegativeFormat() {
    return currencyNegativeFormat;
  }

  public void setCurrencyNegativeFormat(String currencyNegativeFormat) {
    this.currencyNegativeFormat = currencyNegativeFormat;
  }

  public LocalePolicyTab currencyPositiveFormat(String currencyPositiveFormat) {
    this.currencyPositiveFormat = currencyPositiveFormat;
    return this;
  }

   /**
   * 
   * @return currencyPositiveFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrencyPositiveFormat() {
    return currencyPositiveFormat;
  }

  public void setCurrencyPositiveFormat(String currencyPositiveFormat) {
    this.currencyPositiveFormat = currencyPositiveFormat;
  }

  public LocalePolicyTab customDateFormat(String customDateFormat) {
    this.customDateFormat = customDateFormat;
    return this;
  }

   /**
   * 
   * @return customDateFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomDateFormat() {
    return customDateFormat;
  }

  public void setCustomDateFormat(String customDateFormat) {
    this.customDateFormat = customDateFormat;
  }

  public LocalePolicyTab customTimeFormat(String customTimeFormat) {
    this.customTimeFormat = customTimeFormat;
    return this;
  }

   /**
   * 
   * @return customTimeFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomTimeFormat() {
    return customTimeFormat;
  }

  public void setCustomTimeFormat(String customTimeFormat) {
    this.customTimeFormat = customTimeFormat;
  }

  public LocalePolicyTab dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * 
   * @return dateFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public LocalePolicyTab initialFormat(String initialFormat) {
    this.initialFormat = initialFormat;
    return this;
  }

   /**
   * 
   * @return initialFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInitialFormat() {
    return initialFormat;
  }

  public void setInitialFormat(String initialFormat) {
    this.initialFormat = initialFormat;
  }

  public LocalePolicyTab nameFormat(String nameFormat) {
    this.nameFormat = nameFormat;
    return this;
  }

   /**
   * 
   * @return nameFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNameFormat() {
    return nameFormat;
  }

  public void setNameFormat(String nameFormat) {
    this.nameFormat = nameFormat;
  }

  public LocalePolicyTab timeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
    return this;
  }

   /**
   * 
   * @return timeFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimeFormat() {
    return timeFormat;
  }

  public void setTimeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
  }

  public LocalePolicyTab timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * 
   * @return timeZone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalePolicyTab localePolicyTab = (LocalePolicyTab) o;
    return Objects.equals(this.addressFormat, localePolicyTab.addressFormat) &&
        Objects.equals(this.calendarType, localePolicyTab.calendarType) &&
        Objects.equals(this.cultureName, localePolicyTab.cultureName) &&
        Objects.equals(this.currencyNegativeFormat, localePolicyTab.currencyNegativeFormat) &&
        Objects.equals(this.currencyPositiveFormat, localePolicyTab.currencyPositiveFormat) &&
        Objects.equals(this.customDateFormat, localePolicyTab.customDateFormat) &&
        Objects.equals(this.customTimeFormat, localePolicyTab.customTimeFormat) &&
        Objects.equals(this.dateFormat, localePolicyTab.dateFormat) &&
        Objects.equals(this.initialFormat, localePolicyTab.initialFormat) &&
        Objects.equals(this.nameFormat, localePolicyTab.nameFormat) &&
        Objects.equals(this.timeFormat, localePolicyTab.timeFormat) &&
        Objects.equals(this.timeZone, localePolicyTab.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressFormat, calendarType, cultureName, currencyNegativeFormat, currencyPositiveFormat, customDateFormat, customTimeFormat, dateFormat, initialFormat, nameFormat, timeFormat, timeZone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalePolicyTab {\n");
    
    sb.append("    addressFormat: ").append(toIndentedString(addressFormat)).append("\n");
    sb.append("    calendarType: ").append(toIndentedString(calendarType)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    currencyNegativeFormat: ").append(toIndentedString(currencyNegativeFormat)).append("\n");
    sb.append("    currencyPositiveFormat: ").append(toIndentedString(currencyPositiveFormat)).append("\n");
    sb.append("    customDateFormat: ").append(toIndentedString(customDateFormat)).append("\n");
    sb.append("    customTimeFormat: ").append(toIndentedString(customTimeFormat)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    initialFormat: ").append(toIndentedString(initialFormat)).append("\n");
    sb.append("    nameFormat: ").append(toIndentedString(nameFormat)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

