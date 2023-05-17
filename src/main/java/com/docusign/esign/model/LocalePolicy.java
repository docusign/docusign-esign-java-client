package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * LocalePolicy.
 *
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


  /**
   * addressFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy addressFormat(String addressFormat) {
    this.addressFormat = addressFormat;
    return this;
  }

  /**
   * .
   * @return addressFormat
   **/
  @Schema(description = "")
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
   * addressFormatMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy addressFormatMetadata(SettingsMetadata addressFormatMetadata) {
    this.addressFormatMetadata = addressFormatMetadata;
    return this;
  }

  /**
   * .
   * @return addressFormatMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getAddressFormatMetadata() {
    return addressFormatMetadata;
  }

  /**
   * setAddressFormatMetadata.
   **/
  public void setAddressFormatMetadata(SettingsMetadata addressFormatMetadata) {
    this.addressFormatMetadata = addressFormatMetadata;
  }


  /**
   * allowRegion.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy allowRegion(String allowRegion) {
    this.allowRegion = allowRegion;
    return this;
  }

  /**
   * .
   * @return allowRegion
   **/
  @Schema(description = "")
  public String getAllowRegion() {
    return allowRegion;
  }

  /**
   * setAllowRegion.
   **/
  public void setAllowRegion(String allowRegion) {
    this.allowRegion = allowRegion;
  }


  /**
   * calendarType.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy calendarType(String calendarType) {
    this.calendarType = calendarType;
    return this;
  }

  /**
   * .
   * @return calendarType
   **/
  @Schema(description = "")
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
   * calendarTypeMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy calendarTypeMetadata(SettingsMetadata calendarTypeMetadata) {
    this.calendarTypeMetadata = calendarTypeMetadata;
    return this;
  }

  /**
   * .
   * @return calendarTypeMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCalendarTypeMetadata() {
    return calendarTypeMetadata;
  }

  /**
   * setCalendarTypeMetadata.
   **/
  public void setCalendarTypeMetadata(SettingsMetadata calendarTypeMetadata) {
    this.calendarTypeMetadata = calendarTypeMetadata;
  }


  /**
   * cultureName.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy cultureName(String cultureName) {
    this.cultureName = cultureName;
    return this;
  }

  /**
   * .
   * @return cultureName
   **/
  @Schema(description = "")
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
   * cultureNameMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy cultureNameMetadata(SettingsMetadata cultureNameMetadata) {
    this.cultureNameMetadata = cultureNameMetadata;
    return this;
  }

  /**
   * .
   * @return cultureNameMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCultureNameMetadata() {
    return cultureNameMetadata;
  }

  /**
   * setCultureNameMetadata.
   **/
  public void setCultureNameMetadata(SettingsMetadata cultureNameMetadata) {
    this.cultureNameMetadata = cultureNameMetadata;
  }


  /**
   * currencyCode.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * .
   * @return currencyCode
   **/
  @Schema(description = "")
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
   * currencyCodeMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy currencyCodeMetadata(SettingsMetadata currencyCodeMetadata) {
    this.currencyCodeMetadata = currencyCodeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `currencyCode` property is editable..
   * @return currencyCodeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `currencyCode` property is editable.")
  public SettingsMetadata getCurrencyCodeMetadata() {
    return currencyCodeMetadata;
  }

  /**
   * setCurrencyCodeMetadata.
   **/
  public void setCurrencyCodeMetadata(SettingsMetadata currencyCodeMetadata) {
    this.currencyCodeMetadata = currencyCodeMetadata;
  }


  /**
   * currencyNegativeFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy currencyNegativeFormat(String currencyNegativeFormat) {
    this.currencyNegativeFormat = currencyNegativeFormat;
    return this;
  }

  /**
   * .
   * @return currencyNegativeFormat
   **/
  @Schema(description = "")
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
   * currencyNegativeFormatMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy currencyNegativeFormatMetadata(SettingsMetadata currencyNegativeFormatMetadata) {
    this.currencyNegativeFormatMetadata = currencyNegativeFormatMetadata;
    return this;
  }

  /**
   * .
   * @return currencyNegativeFormatMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCurrencyNegativeFormatMetadata() {
    return currencyNegativeFormatMetadata;
  }

  /**
   * setCurrencyNegativeFormatMetadata.
   **/
  public void setCurrencyNegativeFormatMetadata(SettingsMetadata currencyNegativeFormatMetadata) {
    this.currencyNegativeFormatMetadata = currencyNegativeFormatMetadata;
  }


  /**
   * currencyPositiveFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy currencyPositiveFormat(String currencyPositiveFormat) {
    this.currencyPositiveFormat = currencyPositiveFormat;
    return this;
  }

  /**
   * .
   * @return currencyPositiveFormat
   **/
  @Schema(description = "")
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
   * currencyPositiveFormatMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy currencyPositiveFormatMetadata(SettingsMetadata currencyPositiveFormatMetadata) {
    this.currencyPositiveFormatMetadata = currencyPositiveFormatMetadata;
    return this;
  }

  /**
   * .
   * @return currencyPositiveFormatMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getCurrencyPositiveFormatMetadata() {
    return currencyPositiveFormatMetadata;
  }

  /**
   * setCurrencyPositiveFormatMetadata.
   **/
  public void setCurrencyPositiveFormatMetadata(SettingsMetadata currencyPositiveFormatMetadata) {
    this.currencyPositiveFormatMetadata = currencyPositiveFormatMetadata;
  }


  /**
   * customDateFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy customDateFormat(String customDateFormat) {
    this.customDateFormat = customDateFormat;
    return this;
  }

  /**
   * .
   * @return customDateFormat
   **/
  @Schema(description = "")
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
   * customSignDateFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy customSignDateFormat(String customSignDateFormat) {
    this.customSignDateFormat = customSignDateFormat;
    return this;
  }

  /**
   * .
   * @return customSignDateFormat
   **/
  @Schema(description = "")
  public String getCustomSignDateFormat() {
    return customSignDateFormat;
  }

  /**
   * setCustomSignDateFormat.
   **/
  public void setCustomSignDateFormat(String customSignDateFormat) {
    this.customSignDateFormat = customSignDateFormat;
  }


  /**
   * customSignTimeFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy customSignTimeFormat(String customSignTimeFormat) {
    this.customSignTimeFormat = customSignTimeFormat;
    return this;
  }

  /**
   * .
   * @return customSignTimeFormat
   **/
  @Schema(description = "")
  public String getCustomSignTimeFormat() {
    return customSignTimeFormat;
  }

  /**
   * setCustomSignTimeFormat.
   **/
  public void setCustomSignTimeFormat(String customSignTimeFormat) {
    this.customSignTimeFormat = customSignTimeFormat;
  }


  /**
   * customTimeFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy customTimeFormat(String customTimeFormat) {
    this.customTimeFormat = customTimeFormat;
    return this;
  }

  /**
   * .
   * @return customTimeFormat
   **/
  @Schema(description = "")
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
   * @return LocalePolicy
   **/
  public LocalePolicy dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  /**
   * .
   * @return dateFormat
   **/
  @Schema(description = "")
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
   * dateFormatMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy dateFormatMetadata(SettingsMetadata dateFormatMetadata) {
    this.dateFormatMetadata = dateFormatMetadata;
    return this;
  }

  /**
   * .
   * @return dateFormatMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getDateFormatMetadata() {
    return dateFormatMetadata;
  }

  /**
   * setDateFormatMetadata.
   **/
  public void setDateFormatMetadata(SettingsMetadata dateFormatMetadata) {
    this.dateFormatMetadata = dateFormatMetadata;
  }


  /**
   * effectiveAddressFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveAddressFormat(String effectiveAddressFormat) {
    this.effectiveAddressFormat = effectiveAddressFormat;
    return this;
  }

  /**
   * .
   * @return effectiveAddressFormat
   **/
  @Schema(description = "")
  public String getEffectiveAddressFormat() {
    return effectiveAddressFormat;
  }

  /**
   * setEffectiveAddressFormat.
   **/
  public void setEffectiveAddressFormat(String effectiveAddressFormat) {
    this.effectiveAddressFormat = effectiveAddressFormat;
  }


  /**
   * effectiveCalendarType.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveCalendarType(String effectiveCalendarType) {
    this.effectiveCalendarType = effectiveCalendarType;
    return this;
  }

  /**
   * .
   * @return effectiveCalendarType
   **/
  @Schema(description = "")
  public String getEffectiveCalendarType() {
    return effectiveCalendarType;
  }

  /**
   * setEffectiveCalendarType.
   **/
  public void setEffectiveCalendarType(String effectiveCalendarType) {
    this.effectiveCalendarType = effectiveCalendarType;
  }


  /**
   * effectiveCurrencyCode.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveCurrencyCode(String effectiveCurrencyCode) {
    this.effectiveCurrencyCode = effectiveCurrencyCode;
    return this;
  }

  /**
   * .
   * @return effectiveCurrencyCode
   **/
  @Schema(description = "")
  public String getEffectiveCurrencyCode() {
    return effectiveCurrencyCode;
  }

  /**
   * setEffectiveCurrencyCode.
   **/
  public void setEffectiveCurrencyCode(String effectiveCurrencyCode) {
    this.effectiveCurrencyCode = effectiveCurrencyCode;
  }


  /**
   * effectiveCurrencyNegativeFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveCurrencyNegativeFormat(String effectiveCurrencyNegativeFormat) {
    this.effectiveCurrencyNegativeFormat = effectiveCurrencyNegativeFormat;
    return this;
  }

  /**
   * .
   * @return effectiveCurrencyNegativeFormat
   **/
  @Schema(description = "")
  public String getEffectiveCurrencyNegativeFormat() {
    return effectiveCurrencyNegativeFormat;
  }

  /**
   * setEffectiveCurrencyNegativeFormat.
   **/
  public void setEffectiveCurrencyNegativeFormat(String effectiveCurrencyNegativeFormat) {
    this.effectiveCurrencyNegativeFormat = effectiveCurrencyNegativeFormat;
  }


  /**
   * effectiveCurrencyPositiveFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveCurrencyPositiveFormat(String effectiveCurrencyPositiveFormat) {
    this.effectiveCurrencyPositiveFormat = effectiveCurrencyPositiveFormat;
    return this;
  }

  /**
   * .
   * @return effectiveCurrencyPositiveFormat
   **/
  @Schema(description = "")
  public String getEffectiveCurrencyPositiveFormat() {
    return effectiveCurrencyPositiveFormat;
  }

  /**
   * setEffectiveCurrencyPositiveFormat.
   **/
  public void setEffectiveCurrencyPositiveFormat(String effectiveCurrencyPositiveFormat) {
    this.effectiveCurrencyPositiveFormat = effectiveCurrencyPositiveFormat;
  }


  /**
   * effectiveCustomDateFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveCustomDateFormat(String effectiveCustomDateFormat) {
    this.effectiveCustomDateFormat = effectiveCustomDateFormat;
    return this;
  }

  /**
   * .
   * @return effectiveCustomDateFormat
   **/
  @Schema(description = "")
  public String getEffectiveCustomDateFormat() {
    return effectiveCustomDateFormat;
  }

  /**
   * setEffectiveCustomDateFormat.
   **/
  public void setEffectiveCustomDateFormat(String effectiveCustomDateFormat) {
    this.effectiveCustomDateFormat = effectiveCustomDateFormat;
  }


  /**
   * effectiveCustomTimeFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveCustomTimeFormat(String effectiveCustomTimeFormat) {
    this.effectiveCustomTimeFormat = effectiveCustomTimeFormat;
    return this;
  }

  /**
   * .
   * @return effectiveCustomTimeFormat
   **/
  @Schema(description = "")
  public String getEffectiveCustomTimeFormat() {
    return effectiveCustomTimeFormat;
  }

  /**
   * setEffectiveCustomTimeFormat.
   **/
  public void setEffectiveCustomTimeFormat(String effectiveCustomTimeFormat) {
    this.effectiveCustomTimeFormat = effectiveCustomTimeFormat;
  }


  /**
   * effectiveDateFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveDateFormat(String effectiveDateFormat) {
    this.effectiveDateFormat = effectiveDateFormat;
    return this;
  }

  /**
   * .
   * @return effectiveDateFormat
   **/
  @Schema(description = "")
  public String getEffectiveDateFormat() {
    return effectiveDateFormat;
  }

  /**
   * setEffectiveDateFormat.
   **/
  public void setEffectiveDateFormat(String effectiveDateFormat) {
    this.effectiveDateFormat = effectiveDateFormat;
  }


  /**
   * effectiveInitialFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveInitialFormat(String effectiveInitialFormat) {
    this.effectiveInitialFormat = effectiveInitialFormat;
    return this;
  }

  /**
   * .
   * @return effectiveInitialFormat
   **/
  @Schema(description = "")
  public String getEffectiveInitialFormat() {
    return effectiveInitialFormat;
  }

  /**
   * setEffectiveInitialFormat.
   **/
  public void setEffectiveInitialFormat(String effectiveInitialFormat) {
    this.effectiveInitialFormat = effectiveInitialFormat;
  }


  /**
   * effectiveNameFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveNameFormat(String effectiveNameFormat) {
    this.effectiveNameFormat = effectiveNameFormat;
    return this;
  }

  /**
   * .
   * @return effectiveNameFormat
   **/
  @Schema(description = "")
  public String getEffectiveNameFormat() {
    return effectiveNameFormat;
  }

  /**
   * setEffectiveNameFormat.
   **/
  public void setEffectiveNameFormat(String effectiveNameFormat) {
    this.effectiveNameFormat = effectiveNameFormat;
  }


  /**
   * effectiveTimeFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveTimeFormat(String effectiveTimeFormat) {
    this.effectiveTimeFormat = effectiveTimeFormat;
    return this;
  }

  /**
   * .
   * @return effectiveTimeFormat
   **/
  @Schema(description = "")
  public String getEffectiveTimeFormat() {
    return effectiveTimeFormat;
  }

  /**
   * setEffectiveTimeFormat.
   **/
  public void setEffectiveTimeFormat(String effectiveTimeFormat) {
    this.effectiveTimeFormat = effectiveTimeFormat;
  }


  /**
   * effectiveTimeZone.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy effectiveTimeZone(String effectiveTimeZone) {
    this.effectiveTimeZone = effectiveTimeZone;
    return this;
  }

  /**
   * .
   * @return effectiveTimeZone
   **/
  @Schema(description = "")
  public String getEffectiveTimeZone() {
    return effectiveTimeZone;
  }

  /**
   * setEffectiveTimeZone.
   **/
  public void setEffectiveTimeZone(String effectiveTimeZone) {
    this.effectiveTimeZone = effectiveTimeZone;
  }


  /**
   * initialFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy initialFormat(String initialFormat) {
    this.initialFormat = initialFormat;
    return this;
  }

  /**
   * .
   * @return initialFormat
   **/
  @Schema(description = "")
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
   * initialFormatMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy initialFormatMetadata(SettingsMetadata initialFormatMetadata) {
    this.initialFormatMetadata = initialFormatMetadata;
    return this;
  }

  /**
   * .
   * @return initialFormatMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getInitialFormatMetadata() {
    return initialFormatMetadata;
  }

  /**
   * setInitialFormatMetadata.
   **/
  public void setInitialFormatMetadata(SettingsMetadata initialFormatMetadata) {
    this.initialFormatMetadata = initialFormatMetadata;
  }


  /**
   * nameFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy nameFormat(String nameFormat) {
    this.nameFormat = nameFormat;
    return this;
  }

  /**
   * .
   * @return nameFormat
   **/
  @Schema(description = "")
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
   * nameFormatMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy nameFormatMetadata(SettingsMetadata nameFormatMetadata) {
    this.nameFormatMetadata = nameFormatMetadata;
    return this;
  }

  /**
   * .
   * @return nameFormatMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getNameFormatMetadata() {
    return nameFormatMetadata;
  }

  /**
   * setNameFormatMetadata.
   **/
  public void setNameFormatMetadata(SettingsMetadata nameFormatMetadata) {
    this.nameFormatMetadata = nameFormatMetadata;
  }


  /**
   * signDateFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy signDateFormat(String signDateFormat) {
    this.signDateFormat = signDateFormat;
    return this;
  }

  /**
   * .
   * @return signDateFormat
   **/
  @Schema(description = "")
  public String getSignDateFormat() {
    return signDateFormat;
  }

  /**
   * setSignDateFormat.
   **/
  public void setSignDateFormat(String signDateFormat) {
    this.signDateFormat = signDateFormat;
  }


  /**
   * signDateFormatMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy signDateFormatMetadata(SettingsMetadata signDateFormatMetadata) {
    this.signDateFormatMetadata = signDateFormatMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `signDateFormat` property is editable. .
   * @return signDateFormatMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `signDateFormat` property is editable. ")
  public SettingsMetadata getSignDateFormatMetadata() {
    return signDateFormatMetadata;
  }

  /**
   * setSignDateFormatMetadata.
   **/
  public void setSignDateFormatMetadata(SettingsMetadata signDateFormatMetadata) {
    this.signDateFormatMetadata = signDateFormatMetadata;
  }


  /**
   * signTimeFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy signTimeFormat(String signTimeFormat) {
    this.signTimeFormat = signTimeFormat;
    return this;
  }

  /**
   * .
   * @return signTimeFormat
   **/
  @Schema(description = "")
  public String getSignTimeFormat() {
    return signTimeFormat;
  }

  /**
   * setSignTimeFormat.
   **/
  public void setSignTimeFormat(String signTimeFormat) {
    this.signTimeFormat = signTimeFormat;
  }


  /**
   * signTimeFormatMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy signTimeFormatMetadata(SettingsMetadata signTimeFormatMetadata) {
    this.signTimeFormatMetadata = signTimeFormatMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `signTimeFormat` property is editable. .
   * @return signTimeFormatMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `signTimeFormat` property is editable. ")
  public SettingsMetadata getSignTimeFormatMetadata() {
    return signTimeFormatMetadata;
  }

  /**
   * setSignTimeFormatMetadata.
   **/
  public void setSignTimeFormatMetadata(SettingsMetadata signTimeFormatMetadata) {
    this.signTimeFormatMetadata = signTimeFormatMetadata;
  }


  /**
   * timeFormat.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy timeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
    return this;
  }

  /**
   * .
   * @return timeFormat
   **/
  @Schema(description = "")
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
   * timeFormatMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy timeFormatMetadata(SettingsMetadata timeFormatMetadata) {
    this.timeFormatMetadata = timeFormatMetadata;
    return this;
  }

  /**
   * .
   * @return timeFormatMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getTimeFormatMetadata() {
    return timeFormatMetadata;
  }

  /**
   * setTimeFormatMetadata.
   **/
  public void setTimeFormatMetadata(SettingsMetadata timeFormatMetadata) {
    this.timeFormatMetadata = timeFormatMetadata;
  }


  /**
   * timeZone.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * .
   * @return timeZone
   **/
  @Schema(description = "")
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
   * timeZoneMetadata.
   *
   * @return LocalePolicy
   **/
  public LocalePolicy timeZoneMetadata(SettingsMetadata timeZoneMetadata) {
    this.timeZoneMetadata = timeZoneMetadata;
    return this;
  }

  /**
   * .
   * @return timeZoneMetadata
   **/
  @Schema(description = "")
  public SettingsMetadata getTimeZoneMetadata() {
    return timeZoneMetadata;
  }

  /**
   * setTimeZoneMetadata.
   **/
  public void setTimeZoneMetadata(SettingsMetadata timeZoneMetadata) {
    this.timeZoneMetadata = timeZoneMetadata;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(addressFormat, addressFormatMetadata, allowRegion, calendarType, calendarTypeMetadata, cultureName, cultureNameMetadata, currencyCode, currencyCodeMetadata, currencyNegativeFormat, currencyNegativeFormatMetadata, currencyPositiveFormat, currencyPositiveFormatMetadata, customDateFormat, customSignDateFormat, customSignTimeFormat, customTimeFormat, dateFormat, dateFormatMetadata, effectiveAddressFormat, effectiveCalendarType, effectiveCurrencyCode, effectiveCurrencyNegativeFormat, effectiveCurrencyPositiveFormat, effectiveCustomDateFormat, effectiveCustomTimeFormat, effectiveDateFormat, effectiveInitialFormat, effectiveNameFormat, effectiveTimeFormat, effectiveTimeZone, initialFormat, initialFormatMetadata, nameFormat, nameFormatMetadata, signDateFormat, signDateFormatMetadata, signTimeFormat, signTimeFormatMetadata, timeFormat, timeFormatMetadata, timeZone, timeZoneMetadata);
  }


  /**
   * Converts the given object to string.
   */
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

