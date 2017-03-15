package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingPaymentItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Defines a billing payments response object.
 **/

@ApiModel(description = "Defines a billing payments response object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingPaymentsResponse   {
  
  private java.util.List<BillingPaymentItem> billingPayments = new java.util.ArrayList<BillingPaymentItem>();
  private String nextUri = null;
  private String previousUri = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("billingPayments")
  public java.util.List<BillingPaymentItem> getBillingPayments() {
    return billingPayments;
  }
  public void setBillingPayments(java.util.List<BillingPaymentItem> billingPayments) {
    this.billingPayments = billingPayments;
  }

  
  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.
   **/
  
  @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  
  /**
   * The postal code for the billing address.
   **/
  
  @ApiModelProperty(value = "The postal code for the billing address.")
  @JsonProperty("previousUri")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPaymentsResponse billingPaymentsResponse = (BillingPaymentsResponse) o;

    return true && Objects.equals(billingPayments, billingPaymentsResponse.billingPayments) &&
        Objects.equals(nextUri, billingPaymentsResponse.nextUri) &&
        Objects.equals(previousUri, billingPaymentsResponse.previousUri)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPayments, nextUri, previousUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPaymentsResponse {\n");
    
    if (billingPayments != null)
      sb.append("    billingPayments: ").append(toIndentedString(billingPayments)).append("\n");
    if (nextUri != null)
      sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    if (previousUri != null)
      sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
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

