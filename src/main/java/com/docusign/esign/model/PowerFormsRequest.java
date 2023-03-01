package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PowerForm;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PowerFormsRequest.
 *
 */

public class PowerFormsRequest {
  @JsonProperty("powerForms")
  private java.util.List<PowerForm> powerForms = null;

  /**
   * powerForms.
   *
   * @return PowerFormsRequest
   **/
  public PowerFormsRequest powerForms(java.util.List<PowerForm> powerForms) {
    this.powerForms = powerForms;
    return this;
  }

  /**
   * addPowerFormsItem.
   *
   * @return PowerFormsRequest
   **/
  public PowerFormsRequest addPowerFormsItem(PowerForm powerFormsItem) {
    if (this.powerForms == null) {
      this.powerForms = new java.util.ArrayList<>();
    }
    this.powerForms.add(powerFormsItem);
    return this;
  }

  /**
   * .
   * 
   * @return powerForms
   **/
  @Schema(description = "")
  public java.util.List<PowerForm> getPowerForms() {
    return powerForms;
  }

  /**
   * setPowerForms.
   **/
  public void setPowerForms(java.util.List<PowerForm> powerForms) {
    this.powerForms = powerForms;
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
    PowerFormsRequest powerFormsRequest = (PowerFormsRequest) o;
    return Objects.equals(this.powerForms, powerFormsRequest.powerForms);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(powerForms);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormsRequest {\n");

    sb.append("    powerForms: ").append(toIndentedString(powerForms)).append("\n");
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
