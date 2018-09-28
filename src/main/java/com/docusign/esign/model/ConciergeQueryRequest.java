package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConciergeQueryRequest
 */

public class ConciergeQueryRequest {
  @JsonProperty("accountManagementRepCountry")
  private String accountManagementRepCountry = null;

  @JsonProperty("contractCountry")
  private String contractCountry = null;

  @JsonProperty("planId")
  private String planId = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("shippingCountry")
  private String shippingCountry = null;

  public ConciergeQueryRequest accountManagementRepCountry(String accountManagementRepCountry) {
    this.accountManagementRepCountry = accountManagementRepCountry;
    return this;
  }

   /**
   * 
   * @return accountManagementRepCountry
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAccountManagementRepCountry() {
    return accountManagementRepCountry;
  }

  public void setAccountManagementRepCountry(String accountManagementRepCountry) {
    this.accountManagementRepCountry = accountManagementRepCountry;
  }

  public ConciergeQueryRequest contractCountry(String contractCountry) {
    this.contractCountry = contractCountry;
    return this;
  }

   /**
   * 
   * @return contractCountry
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContractCountry() {
    return contractCountry;
  }

  public void setContractCountry(String contractCountry) {
    this.contractCountry = contractCountry;
  }

  public ConciergeQueryRequest planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * 
   * @return planId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public ConciergeQueryRequest region(String region) {
    this.region = region;
    return this;
  }

   /**
   * 
   * @return region
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ConciergeQueryRequest shippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
    return this;
  }

   /**
   * 
   * @return shippingCountry
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShippingCountry() {
    return shippingCountry;
  }

  public void setShippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConciergeQueryRequest conciergeQueryRequest = (ConciergeQueryRequest) o;
    return Objects.equals(this.accountManagementRepCountry, conciergeQueryRequest.accountManagementRepCountry) &&
        Objects.equals(this.contractCountry, conciergeQueryRequest.contractCountry) &&
        Objects.equals(this.planId, conciergeQueryRequest.planId) &&
        Objects.equals(this.region, conciergeQueryRequest.region) &&
        Objects.equals(this.shippingCountry, conciergeQueryRequest.shippingCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountManagementRepCountry, contractCountry, planId, region, shippingCountry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConciergeQueryRequest {\n");
    
    sb.append("    accountManagementRepCountry: ").append(toIndentedString(accountManagementRepCountry)).append("\n");
    sb.append("    contractCountry: ").append(toIndentedString(contractCountry)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    shippingCountry: ").append(toIndentedString(shippingCountry)).append("\n");
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

