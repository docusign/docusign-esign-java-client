package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AddOn;
import com.docusign.esign.model.FeatureSet;
import com.docusign.esign.model.RecipientDomain;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An object used to identify the features and attributes of the account being created.
 **/

@ApiModel(description = "An object used to identify the features and attributes of the account being created.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PlanInformation   {
  
  private java.util.List<AddOn> addOns = new java.util.ArrayList<AddOn>();
  private String currencyCode = null;
  private String freeTrialDaysOverride = null;
  private java.util.List<FeatureSet> planFeatureSets = new java.util.ArrayList<FeatureSet>();
  private String planId = null;
  private java.util.List<RecipientDomain> recipientDomains = new java.util.ArrayList<RecipientDomain>();

  
  /**
   * Reserved:
   **/
  
  @ApiModelProperty(value = "Reserved:")
  @JsonProperty("addOns")
  public java.util.List<AddOn> getAddOns() {
    return addOns;
  }
  public void setAddOns(java.util.List<AddOn> addOns) {
    this.addOns = addOns;
  }

  
  /**
   * Specifies the ISO currency code for the account.
   **/
  
  @ApiModelProperty(value = "Specifies the ISO currency code for the account.")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   * Reserved for DocuSign use only.
   **/
  
  @ApiModelProperty(value = "Reserved for DocuSign use only.")
  @JsonProperty("freeTrialDaysOverride")
  public String getFreeTrialDaysOverride() {
    return freeTrialDaysOverride;
  }
  public void setFreeTrialDaysOverride(String freeTrialDaysOverride) {
    this.freeTrialDaysOverride = freeTrialDaysOverride;
  }

  
  /**
   * A complex type that sets the feature sets for the account.
   **/
  
  @ApiModelProperty(value = "A complex type that sets the feature sets for the account.")
  @JsonProperty("planFeatureSets")
  public java.util.List<FeatureSet> getPlanFeatureSets() {
    return planFeatureSets;
  }
  public void setPlanFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
    this.planFeatureSets = planFeatureSets;
  }

  
  /**
   * The DocuSign Plan ID for the account.
   **/
  
  @ApiModelProperty(value = "The DocuSign Plan ID for the account.")
  @JsonProperty("planId")
  public String getPlanId() {
    return planId;
  }
  public void setPlanId(String planId) {
    this.planId = planId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipientDomains")
  public java.util.List<RecipientDomain> getRecipientDomains() {
    return recipientDomains;
  }
  public void setRecipientDomains(java.util.List<RecipientDomain> recipientDomains) {
    this.recipientDomains = recipientDomains;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanInformation planInformation = (PlanInformation) o;

    return true && Objects.equals(addOns, planInformation.addOns) &&
        Objects.equals(currencyCode, planInformation.currencyCode) &&
        Objects.equals(freeTrialDaysOverride, planInformation.freeTrialDaysOverride) &&
        Objects.equals(planFeatureSets, planInformation.planFeatureSets) &&
        Objects.equals(planId, planInformation.planId) &&
        Objects.equals(recipientDomains, planInformation.recipientDomains)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOns, currencyCode, freeTrialDaysOverride, planFeatureSets, planId, recipientDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanInformation {\n");
    
    if (addOns != null)
      sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    if (currencyCode != null)
      sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    if (freeTrialDaysOverride != null)
      sb.append("    freeTrialDaysOverride: ").append(toIndentedString(freeTrialDaysOverride)).append("\n");
    if (planFeatureSets != null)
      sb.append("    planFeatureSets: ").append(toIndentedString(planFeatureSets)).append("\n");
    if (planId != null)
      sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    if (recipientDomains != null)
      sb.append("    recipientDomains: ").append(toIndentedString(recipientDomains)).append("\n");
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

