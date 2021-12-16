package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BillingEntityInformationResponse.
 *
 */

public class BillingEntityInformationResponse {
  @JsonProperty("billingProfile")
  private String billingProfile = null;

  @JsonProperty("entityName")
  private String entityName = null;

  @JsonProperty("externalEntityId")
  private String externalEntityId = null;

  @JsonProperty("isExternallyBilled")
  private String isExternallyBilled = null;


  /**
   * billingProfile.
   *
   * @return BillingEntityInformationResponse
   **/
  public BillingEntityInformationResponse billingProfile(String billingProfile) {
    this.billingProfile = billingProfile;
    return this;
  }

  /**
   * .
   * @return billingProfile
   **/
  @ApiModelProperty(value = "")
  public String getBillingProfile() {
    return billingProfile;
  }

  /**
   * setBillingProfile.
   **/
  public void setBillingProfile(String billingProfile) {
    this.billingProfile = billingProfile;
  }


  /**
   * entityName.
   *
   * @return BillingEntityInformationResponse
   **/
  public BillingEntityInformationResponse entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * .
   * @return entityName
   **/
  @ApiModelProperty(value = "")
  public String getEntityName() {
    return entityName;
  }

  /**
   * setEntityName.
   **/
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  /**
   * externalEntityId.
   *
   * @return BillingEntityInformationResponse
   **/
  public BillingEntityInformationResponse externalEntityId(String externalEntityId) {
    this.externalEntityId = externalEntityId;
    return this;
  }

  /**
   * .
   * @return externalEntityId
   **/
  @ApiModelProperty(value = "")
  public String getExternalEntityId() {
    return externalEntityId;
  }

  /**
   * setExternalEntityId.
   **/
  public void setExternalEntityId(String externalEntityId) {
    this.externalEntityId = externalEntityId;
  }


  /**
   * isExternallyBilled.
   *
   * @return BillingEntityInformationResponse
   **/
  public BillingEntityInformationResponse isExternallyBilled(String isExternallyBilled) {
    this.isExternallyBilled = isExternallyBilled;
    return this;
  }

  /**
   * .
   * @return isExternallyBilled
   **/
  @ApiModelProperty(value = "")
  public String getIsExternallyBilled() {
    return isExternallyBilled;
  }

  /**
   * setIsExternallyBilled.
   **/
  public void setIsExternallyBilled(String isExternallyBilled) {
    this.isExternallyBilled = isExternallyBilled;
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
    BillingEntityInformationResponse billingEntityInformationResponse = (BillingEntityInformationResponse) o;
    return Objects.equals(this.billingProfile, billingEntityInformationResponse.billingProfile) &&
        Objects.equals(this.entityName, billingEntityInformationResponse.entityName) &&
        Objects.equals(this.externalEntityId, billingEntityInformationResponse.externalEntityId) &&
        Objects.equals(this.isExternallyBilled, billingEntityInformationResponse.isExternallyBilled);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(billingProfile, entityName, externalEntityId, isExternallyBilled);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingEntityInformationResponse {\n");
    
    sb.append("    billingProfile: ").append(toIndentedString(billingProfile)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    externalEntityId: ").append(toIndentedString(externalEntityId)).append("\n");
    sb.append("    isExternallyBilled: ").append(toIndentedString(isExternallyBilled)).append("\n");
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

