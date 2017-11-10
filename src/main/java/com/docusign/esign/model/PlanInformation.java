package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AddOn;
import com.docusign.esign.model.FeatureSet;
import com.docusign.esign.model.RecipientDomain;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An object used to identify the features and attributes of the account being created.
 */
@ApiModel(description = "An object used to identify the features and attributes of the account being created.")

public class PlanInformation {
  @JsonProperty("addOns")
  private java.util.List<AddOn> addOns = new java.util.ArrayList<AddOn>();

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("freeTrialDaysOverride")
  private String freeTrialDaysOverride = null;

  @JsonProperty("planFeatureSets")
  private java.util.List<FeatureSet> planFeatureSets = new java.util.ArrayList<FeatureSet>();

  @JsonProperty("planId")
  private String planId = null;

  @JsonProperty("recipientDomains")
  private java.util.List<RecipientDomain> recipientDomains = new java.util.ArrayList<RecipientDomain>();

  public PlanInformation addOns(java.util.List<AddOn> addOns) {
    this.addOns = addOns;
    return this;
  }

  public PlanInformation addAddOnsItem(AddOn addOnsItem) {
    this.addOns.add(addOnsItem);
    return this;
  }

   /**
   * Reserved:
   * @return addOns
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public java.util.List<AddOn> getAddOns() {
    return addOns;
  }

  public void setAddOns(java.util.List<AddOn> addOns) {
    this.addOns = addOns;
  }

  public PlanInformation currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Specifies the ISO currency code for the account.
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "Specifies the ISO currency code for the account.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PlanInformation freeTrialDaysOverride(String freeTrialDaysOverride) {
    this.freeTrialDaysOverride = freeTrialDaysOverride;
    return this;
  }

   /**
   * Reserved for DocuSign use only.
   * @return freeTrialDaysOverride
  **/
  @ApiModelProperty(example = "null", value = "Reserved for DocuSign use only.")
  public String getFreeTrialDaysOverride() {
    return freeTrialDaysOverride;
  }

  public void setFreeTrialDaysOverride(String freeTrialDaysOverride) {
    this.freeTrialDaysOverride = freeTrialDaysOverride;
  }

  public PlanInformation planFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
    this.planFeatureSets = planFeatureSets;
    return this;
  }

  public PlanInformation addPlanFeatureSetsItem(FeatureSet planFeatureSetsItem) {
    this.planFeatureSets.add(planFeatureSetsItem);
    return this;
  }

   /**
   * A complex type that sets the feature sets for the account.
   * @return planFeatureSets
  **/
  @ApiModelProperty(example = "null", value = "A complex type that sets the feature sets for the account.")
  public java.util.List<FeatureSet> getPlanFeatureSets() {
    return planFeatureSets;
  }

  public void setPlanFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
    this.planFeatureSets = planFeatureSets;
  }

  public PlanInformation planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * The DocuSign Plan ID for the account.
   * @return planId
  **/
  @ApiModelProperty(example = "null", value = "The DocuSign Plan ID for the account.")
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public PlanInformation recipientDomains(java.util.List<RecipientDomain> recipientDomains) {
    this.recipientDomains = recipientDomains;
    return this;
  }

  public PlanInformation addRecipientDomainsItem(RecipientDomain recipientDomainsItem) {
    this.recipientDomains.add(recipientDomainsItem);
    return this;
  }

   /**
   * 
   * @return recipientDomains
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.addOns, planInformation.addOns) &&
        Objects.equals(this.currencyCode, planInformation.currencyCode) &&
        Objects.equals(this.freeTrialDaysOverride, planInformation.freeTrialDaysOverride) &&
        Objects.equals(this.planFeatureSets, planInformation.planFeatureSets) &&
        Objects.equals(this.planId, planInformation.planId) &&
        Objects.equals(this.recipientDomains, planInformation.recipientDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOns, currencyCode, freeTrialDaysOverride, planFeatureSets, planId, recipientDomains);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanInformation {\n");
    
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    freeTrialDaysOverride: ").append(toIndentedString(freeTrialDaysOverride)).append("\n");
    sb.append("    planFeatureSets: ").append(toIndentedString(planFeatureSets)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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

