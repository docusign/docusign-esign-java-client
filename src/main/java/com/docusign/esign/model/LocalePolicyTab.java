package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LocalePolicyTab.
 *
 */

public class LocalePolicyTab {
  @JsonProperty("addressFormat")
  private String addressFormat = null;

  @JsonProperty("calendarType")
  private String calendarType = null;

  @JsonProperty("cultureName")
  private String cultureName = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

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

  @JsonProperty("useLongCurrencyFormat")
  private String useLongCurrencyFormat = null;


  /**
   * addressFormat.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab addressFormat(String addressFormat) {
    this.addressFormat = addressFormat;
    return this;
  }

  /**
   * .
   * @return addressFormat
   **/
  @ApiModelProperty(value = "")
  public String getAddressFormat() {
    return addressFormat;
  }

  /**
   * setAddressFormat.
   **/
  public void setAddressFormat(String addressFormat) {
    this.addressFormat = addressFormat;
  }


  /**
   * calendarType.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab calendarType(String calendarType) {
    this.calendarType = calendarType;
    return this;
  }

  /**
   * .
   * @return calendarType
   **/
  @ApiModelProperty(value = "")
  public String getCalendarType() {
    return calendarType;
  }

  /**
   * setCalendarType.
   **/
  public void setCalendarType(String calendarType) {
    this.calendarType = calendarType;
  }


  /**
   * cultureName.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab cultureName(String cultureName) {
    this.cultureName = cultureName;
    return this;
  }

  /**
   * .
   * @return cultureName
   **/
  @ApiModelProperty(value = "")
  public String getCultureName() {
    return cultureName;
  }

  /**
   * setCultureName.
   **/
  public void setCultureName(String cultureName) {
    this.cultureName = cultureName;
  }


  /**
   * currencyCode.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * .
   * @return currencyCode
   **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * setCurrencyCode.
   **/
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  /**
   * currencyNegativeFormat.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab currencyNegativeFormat(String currencyNegativeFormat) {
    this.currencyNegativeFormat = currencyNegativeFormat;
    return this;
  }

  /**
   * .
   * @return currencyNegativeFormat
   **/
  @ApiModelProperty(value = "")
  public String getCurrencyNegativeFormat() {
    return currencyNegativeFormat;
  }

  /**
   * setCurrencyNegativeFormat.
   **/
  public void setCurrencyNegativeFormat(String currencyNegativeFormat) {
    this.currencyNegativeFormat = currencyNegativeFormat;
  }


  /**
   * currencyPositiveFormat.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab currencyPositiveFormat(String currencyPositiveFormat) {
    this.currencyPositiveFormat = currencyPositiveFormat;
    return this;
  }

  /**
   * .
   * @return currencyPositiveFormat
   **/
  @ApiModelProperty(value = "")
  public String getCurrencyPositiveFormat() {
    return currencyPositiveFormat;
  }

  /**
   * setCurrencyPositiveFormat.
   **/
  public void setCurrencyPositiveFormat(String currencyPositiveFormat) {
    this.currencyPositiveFormat = currencyPositiveFormat;
  }


  /**
   * customDateFormat.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab customDateFormat(String customDateFormat) {
    this.customDateFormat = customDateFormat;
    return this;
  }

  /**
   * .
   * @return customDateFormat
   **/
  @ApiModelProperty(value = "")
  public String getCustomDateFormat() {
    return customDateFormat;
  }

  /**
   * setCustomDateFormat.
   **/
  public void setCustomDateFormat(String customDateFormat) {
    this.customDateFormat = customDateFormat;
  }


  /**
   * customTimeFormat.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab customTimeFormat(String customTimeFormat) {
    this.customTimeFormat = customTimeFormat;
    return this;
  }

  /**
   * .
   * @return customTimeFormat
   **/
  @ApiModelProperty(value = "")
  public String getCustomTimeFormat() {
    return customTimeFormat;
  }

  /**
   * setCustomTimeFormat.
   **/
  public void setCustomTimeFormat(String customTimeFormat) {
    this.customTimeFormat = customTimeFormat;
  }


  /**
   * dateFormat.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  /**
   * .
   * @return dateFormat
   **/
  @ApiModelProperty(value = "")
  public String getDateFormat() {
    return dateFormat;
  }

  /**
   * setDateFormat.
   **/
  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  /**
   * initialFormat.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab initialFormat(String initialFormat) {
    this.initialFormat = initialFormat;
    return this;
  }

  /**
   * .
   * @return initialFormat
   **/
  @ApiModelProperty(value = "")
  public String getInitialFormat() {
    return initialFormat;
  }

  /**
   * setInitialFormat.
   **/
  public void setInitialFormat(String initialFormat) {
    this.initialFormat = initialFormat;
  }


  /**
   * nameFormat.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab nameFormat(String nameFormat) {
    this.nameFormat = nameFormat;
    return this;
  }

  /**
   * .
   * @return nameFormat
   **/
  @ApiModelProperty(value = "")
  public String getNameFormat() {
    return nameFormat;
  }

  /**
   * setNameFormat.
   **/
  public void setNameFormat(String nameFormat) {
    this.nameFormat = nameFormat;
  }


  /**
   * timeFormat.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab timeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
    return this;
  }

  /**
   * .
   * @return timeFormat
   **/
  @ApiModelProperty(value = "")
  public String getTimeFormat() {
    return timeFormat;
  }

  /**
   * setTimeFormat.
   **/
  public void setTimeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
  }


  /**
   * timeZone.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * .
   * @return timeZone
   **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  /**
   * setTimeZone.
   **/
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  /**
   * useLongCurrencyFormat.
   *
   * @return LocalePolicyTab
   **/
  public LocalePolicyTab useLongCurrencyFormat(String useLongCurrencyFormat) {
    this.useLongCurrencyFormat = useLongCurrencyFormat;
    return this;
  }

  /**
   * .
   * @return useLongCurrencyFormat
   **/
  @ApiModelProperty(value = "")
  public String getUseLongCurrencyFormat() {
    return useLongCurrencyFormat;
  }

  /**
   * setUseLongCurrencyFormat.
   **/
  public void setUseLongCurrencyFormat(String useLongCurrencyFormat) {
    this.useLongCurrencyFormat = useLongCurrencyFormat;
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
    LocalePolicyTab localePolicyTab = (LocalePolicyTab) o;
    return Objects.equals(this.addressFormat, localePolicyTab.addressFormat) &&
        Objects.equals(this.calendarType, localePolicyTab.calendarType) &&
        Objects.equals(this.cultureName, localePolicyTab.cultureName) &&
        Objects.equals(this.currencyCode, localePolicyTab.currencyCode) &&
        Objects.equals(this.currencyNegativeFormat, localePolicyTab.currencyNegativeFormat) &&
        Objects.equals(this.currencyPositiveFormat, localePolicyTab.currencyPositiveFormat) &&
        Objects.equals(this.customDateFormat, localePolicyTab.customDateFormat) &&
        Objects.equals(this.customTimeFormat, localePolicyTab.customTimeFormat) &&
        Objects.equals(this.dateFormat, localePolicyTab.dateFormat) &&
        Objects.equals(this.initialFormat, localePolicyTab.initialFormat) &&
        Objects.equals(this.nameFormat, localePolicyTab.nameFormat) &&
        Objects.equals(this.timeFormat, localePolicyTab.timeFormat) &&
        Objects.equals(this.timeZone, localePolicyTab.timeZone) &&
        Objects.equals(this.useLongCurrencyFormat, localePolicyTab.useLongCurrencyFormat);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(addressFormat, calendarType, cultureName, currencyCode, currencyNegativeFormat, currencyPositiveFormat, customDateFormat, customTimeFormat, dateFormat, initialFormat, nameFormat, timeFormat, timeZone, useLongCurrencyFormat);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalePolicyTab {\n");
    
    sb.append("    addressFormat: ").append(toIndentedString(addressFormat)).append("\n");
    sb.append("    calendarType: ").append(toIndentedString(calendarType)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyNegativeFormat: ").append(toIndentedString(currencyNegativeFormat)).append("\n");
    sb.append("    currencyPositiveFormat: ").append(toIndentedString(currencyPositiveFormat)).append("\n");
    sb.append("    customDateFormat: ").append(toIndentedString(customDateFormat)).append("\n");
    sb.append("    customTimeFormat: ").append(toIndentedString(customTimeFormat)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    initialFormat: ").append(toIndentedString(initialFormat)).append("\n");
    sb.append("    nameFormat: ").append(toIndentedString(nameFormat)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    useLongCurrencyFormat: ").append(toIndentedString(useLongCurrencyFormat)).append("\n");
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

