package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ProvisioningInformation   {
  
  private String defaultConnectionId = null;
  private String defaultPlanId = null;
  private String distributorCode = null;
  private String distributorPassword = null;
  private String passwordRuleText = null;
  private String planPromotionText = null;
  private String purchaseOrderOrPromAllowed = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultConnectionId")
  public String getDefaultConnectionId() {
    return defaultConnectionId;
  }
  public void setDefaultConnectionId(String defaultConnectionId) {
    this.defaultConnectionId = defaultConnectionId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultPlanId")
  public String getDefaultPlanId() {
    return defaultPlanId;
  }
  public void setDefaultPlanId(String defaultPlanId) {
    this.defaultPlanId = defaultPlanId;
  }

  
  /**
   * The code that identifies the billing plan groups and plans for the new account.
   **/
  
  @ApiModelProperty(value = "The code that identifies the billing plan groups and plans for the new account.")
  @JsonProperty("distributorCode")
  public String getDistributorCode() {
    return distributorCode;
  }
  public void setDistributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
  }

  
  /**
   * The password for the distributorCode.
   **/
  
  @ApiModelProperty(value = "The password for the distributorCode.")
  @JsonProperty("distributorPassword")
  public String getDistributorPassword() {
    return distributorPassword;
  }
  public void setDistributorPassword(String distributorPassword) {
    this.distributorPassword = distributorPassword;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("passwordRuleText")
  public String getPasswordRuleText() {
    return passwordRuleText;
  }
  public void setPasswordRuleText(String passwordRuleText) {
    this.passwordRuleText = passwordRuleText;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("planPromotionText")
  public String getPlanPromotionText() {
    return planPromotionText;
  }
  public void setPlanPromotionText(String planPromotionText) {
    this.planPromotionText = planPromotionText;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purchaseOrderOrPromAllowed")
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

    return true && Objects.equals(defaultConnectionId, provisioningInformation.defaultConnectionId) &&
        Objects.equals(defaultPlanId, provisioningInformation.defaultPlanId) &&
        Objects.equals(distributorCode, provisioningInformation.distributorCode) &&
        Objects.equals(distributorPassword, provisioningInformation.distributorPassword) &&
        Objects.equals(passwordRuleText, provisioningInformation.passwordRuleText) &&
        Objects.equals(planPromotionText, provisioningInformation.planPromotionText) &&
        Objects.equals(purchaseOrderOrPromAllowed, provisioningInformation.purchaseOrderOrPromAllowed)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultConnectionId, defaultPlanId, distributorCode, distributorPassword, passwordRuleText, planPromotionText, purchaseOrderOrPromAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisioningInformation {\n");
    
    if (defaultConnectionId != null)
      sb.append("    defaultConnectionId: ").append(toIndentedString(defaultConnectionId)).append("\n");
    if (defaultPlanId != null)
      sb.append("    defaultPlanId: ").append(toIndentedString(defaultPlanId)).append("\n");
    if (distributorCode != null)
      sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
    if (distributorPassword != null)
      sb.append("    distributorPassword: ").append(toIndentedString(distributorPassword)).append("\n");
    if (passwordRuleText != null)
      sb.append("    passwordRuleText: ").append(toIndentedString(passwordRuleText)).append("\n");
    if (planPromotionText != null)
      sb.append("    planPromotionText: ").append(toIndentedString(planPromotionText)).append("\n");
    if (purchaseOrderOrPromAllowed != null)
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

