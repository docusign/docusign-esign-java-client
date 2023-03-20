package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * JurisdictionSummary.
 *
 */

public class JurisdictionSummary {
  @JsonProperty("authorizedForIPen")
  private String authorizedForIPen = null;

  @JsonProperty("authorizedForRon")
  private String authorizedForRon = null;

  @JsonProperty("jurisdictionId")
  private String jurisdictionId = null;

  @JsonProperty("jurisdictionName")
  private String jurisdictionName = null;


  /**
   * authorizedForIPen.
   *
   * @return JurisdictionSummary
   **/
  public JurisdictionSummary authorizedForIPen(String authorizedForIPen) {
    this.authorizedForIPen = authorizedForIPen;
    return this;
  }

  /**
   * .
   * @return authorizedForIPen
   **/
  @Schema(description = "")
  public String getAuthorizedForIPen() {
    return authorizedForIPen;
  }

  /**
   * setAuthorizedForIPen.
   **/
  public void setAuthorizedForIPen(String authorizedForIPen) {
    this.authorizedForIPen = authorizedForIPen;
  }


  /**
   * authorizedForRon.
   *
   * @return JurisdictionSummary
   **/
  public JurisdictionSummary authorizedForRon(String authorizedForRon) {
    this.authorizedForRon = authorizedForRon;
    return this;
  }

  /**
   * .
   * @return authorizedForRon
   **/
  @Schema(description = "")
  public String getAuthorizedForRon() {
    return authorizedForRon;
  }

  /**
   * setAuthorizedForRon.
   **/
  public void setAuthorizedForRon(String authorizedForRon) {
    this.authorizedForRon = authorizedForRon;
  }


  /**
   * jurisdictionId.
   *
   * @return JurisdictionSummary
   **/
  public JurisdictionSummary jurisdictionId(String jurisdictionId) {
    this.jurisdictionId = jurisdictionId;
    return this;
  }

  /**
   * .
   * @return jurisdictionId
   **/
  @Schema(description = "")
  public String getJurisdictionId() {
    return jurisdictionId;
  }

  /**
   * setJurisdictionId.
   **/
  public void setJurisdictionId(String jurisdictionId) {
    this.jurisdictionId = jurisdictionId;
  }


  /**
   * jurisdictionName.
   *
   * @return JurisdictionSummary
   **/
  public JurisdictionSummary jurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
    return this;
  }

  /**
   * .
   * @return jurisdictionName
   **/
  @Schema(description = "")
  public String getJurisdictionName() {
    return jurisdictionName;
  }

  /**
   * setJurisdictionName.
   **/
  public void setJurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
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
    JurisdictionSummary jurisdictionSummary = (JurisdictionSummary) o;
    return Objects.equals(this.authorizedForIPen, jurisdictionSummary.authorizedForIPen) &&
        Objects.equals(this.authorizedForRon, jurisdictionSummary.authorizedForRon) &&
        Objects.equals(this.jurisdictionId, jurisdictionSummary.jurisdictionId) &&
        Objects.equals(this.jurisdictionName, jurisdictionSummary.jurisdictionName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(authorizedForIPen, authorizedForRon, jurisdictionId, jurisdictionName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JurisdictionSummary {\n");
    
    sb.append("    authorizedForIPen: ").append(toIndentedString(authorizedForIPen)).append("\n");
    sb.append("    authorizedForRon: ").append(toIndentedString(authorizedForRon)).append("\n");
    sb.append("    jurisdictionId: ").append(toIndentedString(jurisdictionId)).append("\n");
    sb.append("    jurisdictionName: ").append(toIndentedString(jurisdictionName)).append("\n");
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

