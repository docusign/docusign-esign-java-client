package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.CreditCardTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CurrencyPlanPrice.
 *
 */

public class CurrencyPlanPrice {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("currencySymbol")
  private String currencySymbol = null;

  @JsonProperty("perSeatPrice")
  private String perSeatPrice = null;

  @JsonProperty("supportedCardTypes")
  private CreditCardTypes supportedCardTypes = null;

  @JsonProperty("supportIncidentFee")
  private String supportIncidentFee = null;

  @JsonProperty("supportPlanFee")
  private String supportPlanFee = null;


  /**
   * currencyCode.
   *
   * @return CurrencyPlanPrice
   **/
  public CurrencyPlanPrice currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Specifies the ISO currency code for the account..
   * @return currencyCode
   **/
  @Schema(description = "Specifies the ISO currency code for the account.")
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
   * currencySymbol.
   *
   * @return CurrencyPlanPrice
   **/
  public CurrencyPlanPrice currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

  /**
   * Specifies the currency symbol for the account..
   * @return currencySymbol
   **/
  @Schema(description = "Specifies the currency symbol for the account.")
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  /**
   * setCurrencySymbol.
   **/
  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }


  /**
   * perSeatPrice.
   *
   * @return CurrencyPlanPrice
   **/
  public CurrencyPlanPrice perSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
    return this;
  }

  /**
   * .
   * @return perSeatPrice
   **/
  @Schema(description = "")
  public String getPerSeatPrice() {
    return perSeatPrice;
  }

  /**
   * setPerSeatPrice.
   **/
  public void setPerSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
  }


  /**
   * supportedCardTypes.
   *
   * @return CurrencyPlanPrice
   **/
  public CurrencyPlanPrice supportedCardTypes(CreditCardTypes supportedCardTypes) {
    this.supportedCardTypes = supportedCardTypes;
    return this;
  }

  /**
   * A simple type enumeration of the language used. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Bahasa Indonesia (id), Bahasa Melayu (ms) Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro),Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi)..
   * @return supportedCardTypes
   **/
  @Schema(description = "A simple type enumeration of the language used. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Bahasa Indonesia (id), Bahasa Melayu (ms) Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro),Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi).")
  public CreditCardTypes getSupportedCardTypes() {
    return supportedCardTypes;
  }

  /**
   * setSupportedCardTypes.
   **/
  public void setSupportedCardTypes(CreditCardTypes supportedCardTypes) {
    this.supportedCardTypes = supportedCardTypes;
  }


  /**
   * supportIncidentFee.
   *
   * @return CurrencyPlanPrice
   **/
  public CurrencyPlanPrice supportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
    return this;
  }

  /**
   * The support incident fee charged for each support incident..
   * @return supportIncidentFee
   **/
  @Schema(description = "The support incident fee charged for each support incident.")
  public String getSupportIncidentFee() {
    return supportIncidentFee;
  }

  /**
   * setSupportIncidentFee.
   **/
  public void setSupportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
  }


  /**
   * supportPlanFee.
   *
   * @return CurrencyPlanPrice
   **/
  public CurrencyPlanPrice supportPlanFee(String supportPlanFee) {
    this.supportPlanFee = supportPlanFee;
    return this;
  }

  /**
   * The support plan fee charged for this plan..
   * @return supportPlanFee
   **/
  @Schema(description = "The support plan fee charged for this plan.")
  public String getSupportPlanFee() {
    return supportPlanFee;
  }

  /**
   * setSupportPlanFee.
   **/
  public void setSupportPlanFee(String supportPlanFee) {
    this.supportPlanFee = supportPlanFee;
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
    CurrencyPlanPrice currencyPlanPrice = (CurrencyPlanPrice) o;
    return Objects.equals(this.currencyCode, currencyPlanPrice.currencyCode) &&
        Objects.equals(this.currencySymbol, currencyPlanPrice.currencySymbol) &&
        Objects.equals(this.perSeatPrice, currencyPlanPrice.perSeatPrice) &&
        Objects.equals(this.supportedCardTypes, currencyPlanPrice.supportedCardTypes) &&
        Objects.equals(this.supportIncidentFee, currencyPlanPrice.supportIncidentFee) &&
        Objects.equals(this.supportPlanFee, currencyPlanPrice.supportPlanFee);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencySymbol, perSeatPrice, supportedCardTypes, supportIncidentFee, supportPlanFee);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyPlanPrice {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    perSeatPrice: ").append(toIndentedString(perSeatPrice)).append("\n");
    sb.append("    supportedCardTypes: ").append(toIndentedString(supportedCardTypes)).append("\n");
    sb.append("    supportIncidentFee: ").append(toIndentedString(supportIncidentFee)).append("\n");
    sb.append("    supportPlanFee: ").append(toIndentedString(supportPlanFee)).append("\n");
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

