package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProvisioningInformation
 */

public class ProvisioningInformation {
  @JsonProperty("defaultConnectionId")
  private String defaultConnectionId = null;

  @JsonProperty("defaultPlanId")
  private String defaultPlanId = null;

  @JsonProperty("distributorCode")
  private String distributorCode = null;

  @JsonProperty("distributorPassword")
  private String distributorPassword = null;

  @JsonProperty("passwordRuleText")
  private String passwordRuleText = null;

  @JsonProperty("planPromotionText")
  private String planPromotionText = null;

  @JsonProperty("purchaseOrderOrPromAllowed")
  private String purchaseOrderOrPromAllowed = null;

  public ProvisioningInformation defaultConnectionId(String defaultConnectionId) {
    this.defaultConnectionId = defaultConnectionId;
    return this;
  }

   /**
   * 
   * @return defaultConnectionId
  **/
  @ApiModelProperty(value = "")
  public String getDefaultConnectionId() {
    return defaultConnectionId;
  }

  public void setDefaultConnectionId(String defaultConnectionId) {
    this.defaultConnectionId = defaultConnectionId;
  }

  public ProvisioningInformation defaultPlanId(String defaultPlanId) {
    this.defaultPlanId = defaultPlanId;
    return this;
  }

   /**
   * 
   * @return defaultPlanId
  **/
  @ApiModelProperty(value = "")
  public String getDefaultPlanId() {
    return defaultPlanId;
  }

  public void setDefaultPlanId(String defaultPlanId) {
    this.defaultPlanId = defaultPlanId;
  }

  public ProvisioningInformation distributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
    return this;
  }

   /**
   * The code that identifies the billing plan groups and plans for the new account.
   * @return distributorCode
  **/
  @ApiModelProperty(value = "The code that identifies the billing plan groups and plans for the new account.")
  public String getDistributorCode() {
    return distributorCode;
  }

  public void setDistributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
  }

  public ProvisioningInformation distributorPassword(String distributorPassword) {
    this.distributorPassword = distributorPassword;
    return this;
  }

   /**
   * The password for the distributorCode.
   * @return distributorPassword
  **/
  @ApiModelProperty(value = "The password for the distributorCode.")
  public String getDistributorPassword() {
    return distributorPassword;
  }

  public void setDistributorPassword(String distributorPassword) {
    this.distributorPassword = distributorPassword;
  }

  public ProvisioningInformation passwordRuleText(String passwordRuleText) {
    this.passwordRuleText = passwordRuleText;
    return this;
  }

   /**
   * 
   * @return passwordRuleText
  **/
  @ApiModelProperty(value = "")
  public String getPasswordRuleText() {
    return passwordRuleText;
  }

  public void setPasswordRuleText(String passwordRuleText) {
    this.passwordRuleText = passwordRuleText;
  }

  public ProvisioningInformation planPromotionText(String planPromotionText) {
    this.planPromotionText = planPromotionText;
    return this;
  }

   /**
   * 
   * @return planPromotionText
  **/
  @ApiModelProperty(value = "")
  public String getPlanPromotionText() {
    return planPromotionText;
  }

  public void setPlanPromotionText(String planPromotionText) {
    this.planPromotionText = planPromotionText;
  }

  public ProvisioningInformation purchaseOrderOrPromAllowed(String purchaseOrderOrPromAllowed) {
    this.purchaseOrderOrPromAllowed = purchaseOrderOrPromAllowed;
    return this;
  }

   /**
   * 
   * @return purchaseOrderOrPromAllowed
  **/
  @ApiModelProperty(value = "")
  public String getPurchaseOrderOrPromAllowed() {
    return purchaseOrderOrPromAllowed;
  }

  public void setPurchaseOrderOrPromAllowed(String purchaseOrderOrPromAllowed) {
    this.purchaseOrderOrPromAllowed = purchaseOrderOrPromAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisioningInformation provisioningInformation = (ProvisioningInformation) o;
    return Objects.equals(this.defaultConnectionId, provisioningInformation.defaultConnectionId) &&
        Objects.equals(this.defaultPlanId, provisioningInformation.defaultPlanId) &&
        Objects.equals(this.distributorCode, provisioningInformation.distributorCode) &&
        Objects.equals(this.distributorPassword, provisioningInformation.distributorPassword) &&
        Objects.equals(this.passwordRuleText, provisioningInformation.passwordRuleText) &&
        Objects.equals(this.planPromotionText, provisioningInformation.planPromotionText) &&
        Objects.equals(this.purchaseOrderOrPromAllowed, provisioningInformation.purchaseOrderOrPromAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultConnectionId, defaultPlanId, distributorCode, distributorPassword, passwordRuleText, planPromotionText, purchaseOrderOrPromAllowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisioningInformation {\n");
    
    sb.append("    defaultConnectionId: ").append(toIndentedString(defaultConnectionId)).append("\n");
    sb.append("    defaultPlanId: ").append(toIndentedString(defaultPlanId)).append("\n");
    sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
    sb.append("    distributorPassword: ").append(toIndentedString(distributorPassword)).append("\n");
    sb.append("    passwordRuleText: ").append(toIndentedString(passwordRuleText)).append("\n");
    sb.append("    planPromotionText: ").append(toIndentedString(planPromotionText)).append("\n");
    sb.append("    purchaseOrderOrPromAllowed: ").append(toIndentedString(purchaseOrderOrPromAllowed)).append("\n");
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

