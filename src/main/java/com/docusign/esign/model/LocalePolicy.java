package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LocalePolicy
 */

public class LocalePolicy {
  @JsonProperty("addressFormat")
  private String addressFormat = null;

  @JsonProperty("addressFormatMetadata")
  private SettingsMetadata addressFormatMetadata = null;

  @JsonProperty("allowRegion")
  private String allowRegion = null;

  @JsonProperty("calendarType")
  private String calendarType = null;

  @JsonProperty("calendarTypeMetadata")
  private SettingsMetadata calendarTypeMetadata = null;

  @JsonProperty("cultureName")
  private String cultureName = null;

  @JsonProperty("cultureNameMetadata")
  private SettingsMetadata cultureNameMetadata = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("currencyCodeMetadata")
  private SettingsMetadata currencyCodeMetadata = null;

  @JsonProperty("currencyNegativeFormat")
  private String currencyNegativeFormat = null;

  @JsonProperty("currencyNegativeFormatMetadata")
  private SettingsMetadata currencyNegativeFormatMetadata = null;

  @JsonProperty("currencyPositiveFormat")
  private String currencyPositiveFormat = null;

  @JsonProperty("currencyPositiveFormatMetadata")
  private SettingsMetadata currencyPositiveFormatMetadata = null;

  @JsonProperty("customDateFormat")
  private String customDateFormat = null;

  @JsonProperty("customSignDateFormat")
  private String customSignDateFormat = null;

  @JsonProperty("customSignTimeFormat")
  private String customSignTimeFormat = null;

  @JsonProperty("customTimeFormat")
  private String customTimeFormat = null;

  @JsonProperty("dateFormat")
  private String dateFormat = null;

  @JsonProperty("dateFormatMetadata")
  private SettingsMetadata dateFormatMetadata = null;

  @JsonProperty("effectiveAddressFormat")
  private String effectiveAddressFormat = null;

  @JsonProperty("effectiveCalendarType")
  private String effectiveCalendarType = null;

  @JsonProperty("effectiveCurrencyCode")
  private String effectiveCurrencyCode = null;

  @JsonProperty("effectiveCurrencyNegativeFormat")
  private String effectiveCurrencyNegativeFormat = null;

  @JsonProperty("effectiveCurrencyPositiveFormat")
  private String effectiveCurrencyPositiveFormat = null;

  @JsonProperty("effectiveCustomDateFormat")
  private String effectiveCustomDateFormat = null;

  @JsonProperty("effectiveCustomTimeFormat")
  private String effectiveCustomTimeFormat = null;

  @JsonProperty("effectiveDateFormat")
  private String effectiveDateFormat = null;

  @JsonProperty("effectiveInitialFormat")
  private String effectiveInitialFormat = null;

  @JsonProperty("effectiveNameFormat")
  private String effectiveNameFormat = null;

  @JsonProperty("effectiveTimeFormat")
  private String effectiveTimeFormat = null;

  @JsonProperty("effectiveTimeZone")
  private String effectiveTimeZone = null;

  @JsonProperty("initialFormat")
  private String initialFormat = null;

  @JsonProperty("initialFormatMetadata")
  private SettingsMetadata initialFormatMetadata = null;

  @JsonProperty("nameFormat")
  private String nameFormat = null;

  @JsonProperty("nameFormatMetadata")
  private SettingsMetadata nameFormatMetadata = null;

  @JsonProperty("signDateFormat")
  private String signDateFormat = null;

  @JsonProperty("signDateFormatMetadata")
  private SettingsMetadata signDateFormatMetadata = null;

  @JsonProperty("signTimeFormat")
  private String signTimeFormat = null;

  @JsonProperty("signTimeFormatMetadata")
  private SettingsMetadata signTimeFormatMetadata = null;

  @JsonProperty("timeFormat")
  private String timeFormat = null;

  @JsonProperty("timeFormatMetadata")
  private SettingsMetadata timeFormatMetadata = null;

  @JsonProperty("timeZone")
  private String timeZone = null;

  @JsonProperty("timeZoneMetadata")
  private SettingsMetadata timeZoneMetadata = null;

  public LocalePolicy addressFormat(String addressFormat) {
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

  public LocalePolicy addressFormatMetadata(SettingsMetadata addressFormatMetadata) {
    this.addressFormatMetadata = addressFormatMetadata;
    return this;
  }

   /**
   * Get addressFormatMetadata
   * @return addressFormatMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getAddressFormatMetadata() {
    return addressFormatMetadata;
  }

  public void setAddressFormatMetadata(SettingsMetadata addressFormatMetadata) {
    this.addressFormatMetadata = addressFormatMetadata;
  }

  public LocalePolicy allowRegion(String allowRegion) {
    this.allowRegion = allowRegion;
    return this;
  }

   /**
   * 
   * @return allowRegion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowRegion() {
    return allowRegion;
  }

  public void setAllowRegion(String allowRegion) {
    this.allowRegion = allowRegion;
  }

  public LocalePolicy calendarType(String calendarType) {
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

  public LocalePolicy calendarTypeMetadata(SettingsMetadata calendarTypeMetadata) {
    this.calendarTypeMetadata = calendarTypeMetadata;
    return this;
  }

   /**
   * Get calendarTypeMetadata
   * @return calendarTypeMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getCalendarTypeMetadata() {
    return calendarTypeMetadata;
  }

  public void setCalendarTypeMetadata(SettingsMetadata calendarTypeMetadata) {
    this.calendarTypeMetadata = calendarTypeMetadata;
  }

  public LocalePolicy cultureName(String cultureName) {
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

  public LocalePolicy cultureNameMetadata(SettingsMetadata cultureNameMetadata) {
    this.cultureNameMetadata = cultureNameMetadata;
    return this;
  }

   /**
   * Get cultureNameMetadata
   * @return cultureNameMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getCultureNameMetadata() {
    return cultureNameMetadata;
  }

  public void setCultureNameMetadata(SettingsMetadata cultureNameMetadata) {
    this.cultureNameMetadata = cultureNameMetadata;
  }

  public LocalePolicy currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * 
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public LocalePolicy currencyCodeMetadata(SettingsMetadata currencyCodeMetadata) {
    this.currencyCodeMetadata = currencyCodeMetadata;
    return this;
  }

   /**
   * Get currencyCodeMetadata
   * @return currencyCodeMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getCurrencyCodeMetadata() {
    return currencyCodeMetadata;
  }

  public void setCurrencyCodeMetadata(SettingsMetadata currencyCodeMetadata) {
    this.currencyCodeMetadata = currencyCodeMetadata;
  }

  public LocalePolicy currencyNegativeFormat(String currencyNegativeFormat) {
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

  public LocalePolicy currencyNegativeFormatMetadata(SettingsMetadata currencyNegativeFormatMetadata) {
    this.currencyNegativeFormatMetadata = currencyNegativeFormatMetadata;
    return this;
  }

   /**
   * Get currencyNegativeFormatMetadata
   * @return currencyNegativeFormatMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getCurrencyNegativeFormatMetadata() {
    return currencyNegativeFormatMetadata;
  }

  public void setCurrencyNegativeFormatMetadata(SettingsMetadata currencyNegativeFormatMetadata) {
    this.currencyNegativeFormatMetadata = currencyNegativeFormatMetadata;
  }

  public LocalePolicy currencyPositiveFormat(String currencyPositiveFormat) {
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

  public LocalePolicy currencyPositiveFormatMetadata(SettingsMetadata currencyPositiveFormatMetadata) {
    this.currencyPositiveFormatMetadata = currencyPositiveFormatMetadata;
    return this;
  }

   /**
   * Get currencyPositiveFormatMetadata
   * @return currencyPositiveFormatMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getCurrencyPositiveFormatMetadata() {
    return currencyPositiveFormatMetadata;
  }

  public void setCurrencyPositiveFormatMetadata(SettingsMetadata currencyPositiveFormatMetadata) {
    this.currencyPositiveFormatMetadata = currencyPositiveFormatMetadata;
  }

  public LocalePolicy customDateFormat(String customDateFormat) {
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

  public LocalePolicy customSignDateFormat(String customSignDateFormat) {
    this.customSignDateFormat = customSignDateFormat;
    return this;
  }

   /**
   * 
   * @return customSignDateFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomSignDateFormat() {
    return customSignDateFormat;
  }

  public void setCustomSignDateFormat(String customSignDateFormat) {
    this.customSignDateFormat = customSignDateFormat;
  }

  public LocalePolicy customSignTimeFormat(String customSignTimeFormat) {
    this.customSignTimeFormat = customSignTimeFormat;
    return this;
  }

   /**
   * 
   * @return customSignTimeFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomSignTimeFormat() {
    return customSignTimeFormat;
  }

  public void setCustomSignTimeFormat(String customSignTimeFormat) {
    this.customSignTimeFormat = customSignTimeFormat;
  }

  public LocalePolicy customTimeFormat(String customTimeFormat) {
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

  public LocalePolicy dateFormat(String dateFormat) {
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

  public LocalePolicy dateFormatMetadata(SettingsMetadata dateFormatMetadata) {
    this.dateFormatMetadata = dateFormatMetadata;
    return this;
  }

   /**
   * Get dateFormatMetadata
   * @return dateFormatMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getDateFormatMetadata() {
    return dateFormatMetadata;
  }

  public void setDateFormatMetadata(SettingsMetadata dateFormatMetadata) {
    this.dateFormatMetadata = dateFormatMetadata;
  }

  public LocalePolicy effectiveAddressFormat(String effectiveAddressFormat) {
    this.effectiveAddressFormat = effectiveAddressFormat;
    return this;
  }

   /**
   * 
   * @return effectiveAddressFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveAddressFormat() {
    return effectiveAddressFormat;
  }

  public void setEffectiveAddressFormat(String effectiveAddressFormat) {
    this.effectiveAddressFormat = effectiveAddressFormat;
  }

  public LocalePolicy effectiveCalendarType(String effectiveCalendarType) {
    this.effectiveCalendarType = effectiveCalendarType;
    return this;
  }

   /**
   * 
   * @return effectiveCalendarType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveCalendarType() {
    return effectiveCalendarType;
  }

  public void setEffectiveCalendarType(String effectiveCalendarType) {
    this.effectiveCalendarType = effectiveCalendarType;
  }

  public LocalePolicy effectiveCurrencyCode(String effectiveCurrencyCode) {
    this.effectiveCurrencyCode = effectiveCurrencyCode;
    return this;
  }

   /**
   * 
   * @return effectiveCurrencyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveCurrencyCode() {
    return effectiveCurrencyCode;
  }

  public void setEffectiveCurrencyCode(String effectiveCurrencyCode) {
    this.effectiveCurrencyCode = effectiveCurrencyCode;
  }

  public LocalePolicy effectiveCurrencyNegativeFormat(String effectiveCurrencyNegativeFormat) {
    this.effectiveCurrencyNegativeFormat = effectiveCurrencyNegativeFormat;
    return this;
  }

   /**
   * 
   * @return effectiveCurrencyNegativeFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveCurrencyNegativeFormat() {
    return effectiveCurrencyNegativeFormat;
  }

  public void setEffectiveCurrencyNegativeFormat(String effectiveCurrencyNegativeFormat) {
    this.effectiveCurrencyNegativeFormat = effectiveCurrencyNegativeFormat;
  }

  public LocalePolicy effectiveCurrencyPositiveFormat(String effectiveCurrencyPositiveFormat) {
    this.effectiveCurrencyPositiveFormat = effectiveCurrencyPositiveFormat;
    return this;
  }

   /**
   * 
   * @return effectiveCurrencyPositiveFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveCurrencyPositiveFormat() {
    return effectiveCurrencyPositiveFormat;
  }

  public void setEffectiveCurrencyPositiveFormat(String effectiveCurrencyPositiveFormat) {
    this.effectiveCurrencyPositiveFormat = effectiveCurrencyPositiveFormat;
  }

  public LocalePolicy effectiveCustomDateFormat(String effectiveCustomDateFormat) {
    this.effectiveCustomDateFormat = effectiveCustomDateFormat;
    return this;
  }

   /**
   * 
   * @return effectiveCustomDateFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveCustomDateFormat() {
    return effectiveCustomDateFormat;
  }

  public void setEffectiveCustomDateFormat(String effectiveCustomDateFormat) {
    this.effectiveCustomDateFormat = effectiveCustomDateFormat;
  }

  public LocalePolicy effectiveCustomTimeFormat(String effectiveCustomTimeFormat) {
    this.effectiveCustomTimeFormat = effectiveCustomTimeFormat;
    return this;
  }

   /**
   * 
   * @return effectiveCustomTimeFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveCustomTimeFormat() {
    return effectiveCustomTimeFormat;
  }

  public void setEffectiveCustomTimeFormat(String effectiveCustomTimeFormat) {
    this.effectiveCustomTimeFormat = effectiveCustomTimeFormat;
  }

  public LocalePolicy effectiveDateFormat(String effectiveDateFormat) {
    this.effectiveDateFormat = effectiveDateFormat;
    return this;
  }

   /**
   * 
   * @return effectiveDateFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveDateFormat() {
    return effectiveDateFormat;
  }

  public void setEffectiveDateFormat(String effectiveDateFormat) {
    this.effectiveDateFormat = effectiveDateFormat;
  }

  public LocalePolicy effectiveInitialFormat(String effectiveInitialFormat) {
    this.effectiveInitialFormat = effectiveInitialFormat;
    return this;
  }

   /**
   * 
   * @return effectiveInitialFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveInitialFormat() {
    return effectiveInitialFormat;
  }

  public void setEffectiveInitialFormat(String effectiveInitialFormat) {
    this.effectiveInitialFormat = effectiveInitialFormat;
  }

  public LocalePolicy effectiveNameFormat(String effectiveNameFormat) {
    this.effectiveNameFormat = effectiveNameFormat;
    return this;
  }

   /**
   * 
   * @return effectiveNameFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveNameFormat() {
    return effectiveNameFormat;
  }

  public void setEffectiveNameFormat(String effectiveNameFormat) {
    this.effectiveNameFormat = effectiveNameFormat;
  }

  public LocalePolicy effectiveTimeFormat(String effectiveTimeFormat) {
    this.effectiveTimeFormat = effectiveTimeFormat;
    return this;
  }

   /**
   * 
   * @return effectiveTimeFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveTimeFormat() {
    return effectiveTimeFormat;
  }

  public void setEffectiveTimeFormat(String effectiveTimeFormat) {
    this.effectiveTimeFormat = effectiveTimeFormat;
  }

  public LocalePolicy effectiveTimeZone(String effectiveTimeZone) {
    this.effectiveTimeZone = effectiveTimeZone;
    return this;
  }

   /**
   * 
   * @return effectiveTimeZone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveTimeZone() {
    return effectiveTimeZone;
  }

  public void setEffectiveTimeZone(String effectiveTimeZone) {
    this.effectiveTimeZone = effectiveTimeZone;
  }

  public LocalePolicy initialFormat(String initialFormat) {
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

  public LocalePolicy initialFormatMetadata(SettingsMetadata initialFormatMetadata) {
    this.initialFormatMetadata = initialFormatMetadata;
    return this;
  }

   /**
   * Get initialFormatMetadata
   * @return initialFormatMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getInitialFormatMetadata() {
    return initialFormatMetadata;
  }

  public void setInitialFormatMetadata(SettingsMetadata initialFormatMetadata) {
    this.initialFormatMetadata = initialFormatMetadata;
  }

  public LocalePolicy nameFormat(String nameFormat) {
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

  public LocalePolicy nameFormatMetadata(SettingsMetadata nameFormatMetadata) {
    this.nameFormatMetadata = nameFormatMetadata;
    return this;
  }

   /**
   * Get nameFormatMetadata
   * @return nameFormatMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getNameFormatMetadata() {
    return nameFormatMetadata;
  }

  public void setNameFormatMetadata(SettingsMetadata nameFormatMetadata) {
    this.nameFormatMetadata = nameFormatMetadata;
  }

  public LocalePolicy signDateFormat(String signDateFormat) {
    this.signDateFormat = signDateFormat;
    return this;
  }

   /**
   * 
   * @return signDateFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignDateFormat() {
    return signDateFormat;
  }

  public void setSignDateFormat(String signDateFormat) {
    this.signDateFormat = signDateFormat;
  }

  public LocalePolicy signDateFormatMetadata(SettingsMetadata signDateFormatMetadata) {
    this.signDateFormatMetadata = signDateFormatMetadata;
    return this;
  }

   /**
   * Get signDateFormatMetadata
   * @return signDateFormatMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getSignDateFormatMetadata() {
    return signDateFormatMetadata;
  }

  public void setSignDateFormatMetadata(SettingsMetadata signDateFormatMetadata) {
    this.signDateFormatMetadata = signDateFormatMetadata;
  }

  public LocalePolicy signTimeFormat(String signTimeFormat) {
    this.signTimeFormat = signTimeFormat;
    return this;
  }

   /**
   * 
   * @return signTimeFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignTimeFormat() {
    return signTimeFormat;
  }

  public void setSignTimeFormat(String signTimeFormat) {
    this.signTimeFormat = signTimeFormat;
  }

  public LocalePolicy signTimeFormatMetadata(SettingsMetadata signTimeFormatMetadata) {
    this.signTimeFormatMetadata = signTimeFormatMetadata;
    return this;
  }

   /**
   * Get signTimeFormatMetadata
   * @return signTimeFormatMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getSignTimeFormatMetadata() {
    return signTimeFormatMetadata;
  }

  public void setSignTimeFormatMetadata(SettingsMetadata signTimeFormatMetadata) {
    this.signTimeFormatMetadata = signTimeFormatMetadata;
  }

  public LocalePolicy timeFormat(String timeFormat) {
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

  public LocalePolicy timeFormatMetadata(SettingsMetadata timeFormatMetadata) {
    this.timeFormatMetadata = timeFormatMetadata;
    return this;
  }

   /**
   * Get timeFormatMetadata
   * @return timeFormatMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getTimeFormatMetadata() {
    return timeFormatMetadata;
  }

  public void setTimeFormatMetadata(SettingsMetadata timeFormatMetadata) {
    this.timeFormatMetadata = timeFormatMetadata;
  }

  public LocalePolicy timeZone(String timeZone) {
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

  public LocalePolicy timeZoneMetadata(SettingsMetadata timeZoneMetadata) {
    this.timeZoneMetadata = timeZoneMetadata;
    return this;
  }

   /**
   * Get timeZoneMetadata
   * @return timeZoneMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getTimeZoneMetadata() {
    return timeZoneMetadata;
  }

  public void setTimeZoneMetadata(SettingsMetadata timeZoneMetadata) {
    this.timeZoneMetadata = timeZoneMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalePolicy localePolicy = (LocalePolicy) o;
    return Objects.equals(this.addressFormat, localePolicy.addressFormat) &&
        Objects.equals(this.addressFormatMetadata, localePolicy.addressFormatMetadata) &&
        Objects.equals(this.allowRegion, localePolicy.allowRegion) &&
        Objects.equals(this.calendarType, localePolicy.calendarType) &&
        Objects.equals(this.calendarTypeMetadata, localePolicy.calendarTypeMetadata) &&
        Objects.equals(this.cultureName, localePolicy.cultureName) &&
        Objects.equals(this.cultureNameMetadata, localePolicy.cultureNameMetadata) &&
        Objects.equals(this.currencyCode, localePolicy.currencyCode) &&
        Objects.equals(this.currencyCodeMetadata, localePolicy.currencyCodeMetadata) &&
        Objects.equals(this.currencyNegativeFormat, localePolicy.currencyNegativeFormat) &&
        Objects.equals(this.currencyNegativeFormatMetadata, localePolicy.currencyNegativeFormatMetadata) &&
        Objects.equals(this.currencyPositiveFormat, localePolicy.currencyPositiveFormat) &&
        Objects.equals(this.currencyPositiveFormatMetadata, localePolicy.currencyPositiveFormatMetadata) &&
        Objects.equals(this.customDateFormat, localePolicy.customDateFormat) &&
        Objects.equals(this.customSignDateFormat, localePolicy.customSignDateFormat) &&
        Objects.equals(this.customSignTimeFormat, localePolicy.customSignTimeFormat) &&
        Objects.equals(this.customTimeFormat, localePolicy.customTimeFormat) &&
        Objects.equals(this.dateFormat, localePolicy.dateFormat) &&
        Objects.equals(this.dateFormatMetadata, localePolicy.dateFormatMetadata) &&
        Objects.equals(this.effectiveAddressFormat, localePolicy.effectiveAddressFormat) &&
        Objects.equals(this.effectiveCalendarType, localePolicy.effectiveCalendarType) &&
        Objects.equals(this.effectiveCurrencyCode, localePolicy.effectiveCurrencyCode) &&
        Objects.equals(this.effectiveCurrencyNegativeFormat, localePolicy.effectiveCurrencyNegativeFormat) &&
        Objects.equals(this.effectiveCurrencyPositiveFormat, localePolicy.effectiveCurrencyPositiveFormat) &&
        Objects.equals(this.effectiveCustomDateFormat, localePolicy.effectiveCustomDateFormat) &&
        Objects.equals(this.effectiveCustomTimeFormat, localePolicy.effectiveCustomTimeFormat) &&
        Objects.equals(this.effectiveDateFormat, localePolicy.effectiveDateFormat) &&
        Objects.equals(this.effectiveInitialFormat, localePolicy.effectiveInitialFormat) &&
        Objects.equals(this.effectiveNameFormat, localePolicy.effectiveNameFormat) &&
        Objects.equals(this.effectiveTimeFormat, localePolicy.effectiveTimeFormat) &&
        Objects.equals(this.effectiveTimeZone, localePolicy.effectiveTimeZone) &&
        Objects.equals(this.initialFormat, localePolicy.initialFormat) &&
        Objects.equals(this.initialFormatMetadata, localePolicy.initialFormatMetadata) &&
        Objects.equals(this.nameFormat, localePolicy.nameFormat) &&
        Objects.equals(this.nameFormatMetadata, localePolicy.nameFormatMetadata) &&
        Objects.equals(this.signDateFormat, localePolicy.signDateFormat) &&
        Objects.equals(this.signDateFormatMetadata, localePolicy.signDateFormatMetadata) &&
        Objects.equals(this.signTimeFormat, localePolicy.signTimeFormat) &&
        Objects.equals(this.signTimeFormatMetadata, localePolicy.signTimeFormatMetadata) &&
        Objects.equals(this.timeFormat, localePolicy.timeFormat) &&
        Objects.equals(this.timeFormatMetadata, localePolicy.timeFormatMetadata) &&
        Objects.equals(this.timeZone, localePolicy.timeZone) &&
        Objects.equals(this.timeZoneMetadata, localePolicy.timeZoneMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressFormat, addressFormatMetadata, allowRegion, calendarType, calendarTypeMetadata, cultureName, cultureNameMetadata, currencyCode, currencyCodeMetadata, currencyNegativeFormat, currencyNegativeFormatMetadata, currencyPositiveFormat, currencyPositiveFormatMetadata, customDateFormat, customSignDateFormat, customSignTimeFormat, customTimeFormat, dateFormat, dateFormatMetadata, effectiveAddressFormat, effectiveCalendarType, effectiveCurrencyCode, effectiveCurrencyNegativeFormat, effectiveCurrencyPositiveFormat, effectiveCustomDateFormat, effectiveCustomTimeFormat, effectiveDateFormat, effectiveInitialFormat, effectiveNameFormat, effectiveTimeFormat, effectiveTimeZone, initialFormat, initialFormatMetadata, nameFormat, nameFormatMetadata, signDateFormat, signDateFormatMetadata, signTimeFormat, signTimeFormatMetadata, timeFormat, timeFormatMetadata, timeZone, timeZoneMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalePolicy {\n");
    
    sb.append("    addressFormat: ").append(toIndentedString(addressFormat)).append("\n");
    sb.append("    addressFormatMetadata: ").append(toIndentedString(addressFormatMetadata)).append("\n");
    sb.append("    allowRegion: ").append(toIndentedString(allowRegion)).append("\n");
    sb.append("    calendarType: ").append(toIndentedString(calendarType)).append("\n");
    sb.append("    calendarTypeMetadata: ").append(toIndentedString(calendarTypeMetadata)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    cultureNameMetadata: ").append(toIndentedString(cultureNameMetadata)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyCodeMetadata: ").append(toIndentedString(currencyCodeMetadata)).append("\n");
    sb.append("    currencyNegativeFormat: ").append(toIndentedString(currencyNegativeFormat)).append("\n");
    sb.append("    currencyNegativeFormatMetadata: ").append(toIndentedString(currencyNegativeFormatMetadata)).append("\n");
    sb.append("    currencyPositiveFormat: ").append(toIndentedString(currencyPositiveFormat)).append("\n");
    sb.append("    currencyPositiveFormatMetadata: ").append(toIndentedString(currencyPositiveFormatMetadata)).append("\n");
    sb.append("    customDateFormat: ").append(toIndentedString(customDateFormat)).append("\n");
    sb.append("    customSignDateFormat: ").append(toIndentedString(customSignDateFormat)).append("\n");
    sb.append("    customSignTimeFormat: ").append(toIndentedString(customSignTimeFormat)).append("\n");
    sb.append("    customTimeFormat: ").append(toIndentedString(customTimeFormat)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    dateFormatMetadata: ").append(toIndentedString(dateFormatMetadata)).append("\n");
    sb.append("    effectiveAddressFormat: ").append(toIndentedString(effectiveAddressFormat)).append("\n");
    sb.append("    effectiveCalendarType: ").append(toIndentedString(effectiveCalendarType)).append("\n");
    sb.append("    effectiveCurrencyCode: ").append(toIndentedString(effectiveCurrencyCode)).append("\n");
    sb.append("    effectiveCurrencyNegativeFormat: ").append(toIndentedString(effectiveCurrencyNegativeFormat)).append("\n");
    sb.append("    effectiveCurrencyPositiveFormat: ").append(toIndentedString(effectiveCurrencyPositiveFormat)).append("\n");
    sb.append("    effectiveCustomDateFormat: ").append(toIndentedString(effectiveCustomDateFormat)).append("\n");
    sb.append("    effectiveCustomTimeFormat: ").append(toIndentedString(effectiveCustomTimeFormat)).append("\n");
    sb.append("    effectiveDateFormat: ").append(toIndentedString(effectiveDateFormat)).append("\n");
    sb.append("    effectiveInitialFormat: ").append(toIndentedString(effectiveInitialFormat)).append("\n");
    sb.append("    effectiveNameFormat: ").append(toIndentedString(effectiveNameFormat)).append("\n");
    sb.append("    effectiveTimeFormat: ").append(toIndentedString(effectiveTimeFormat)).append("\n");
    sb.append("    effectiveTimeZone: ").append(toIndentedString(effectiveTimeZone)).append("\n");
    sb.append("    initialFormat: ").append(toIndentedString(initialFormat)).append("\n");
    sb.append("    initialFormatMetadata: ").append(toIndentedString(initialFormatMetadata)).append("\n");
    sb.append("    nameFormat: ").append(toIndentedString(nameFormat)).append("\n");
    sb.append("    nameFormatMetadata: ").append(toIndentedString(nameFormatMetadata)).append("\n");
    sb.append("    signDateFormat: ").append(toIndentedString(signDateFormat)).append("\n");
    sb.append("    signDateFormatMetadata: ").append(toIndentedString(signDateFormatMetadata)).append("\n");
    sb.append("    signTimeFormat: ").append(toIndentedString(signTimeFormat)).append("\n");
    sb.append("    signTimeFormatMetadata: ").append(toIndentedString(signTimeFormatMetadata)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    timeFormatMetadata: ").append(toIndentedString(timeFormatMetadata)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    timeZoneMetadata: ").append(toIndentedString(timeZoneMetadata)).append("\n");
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

