package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingInvoice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Defines a billing invoice response object.
 **/

@ApiModel(description = "Defines a billing invoice response object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingInvoicesResponse   {
  
  private java.util.List<BillingInvoice> billingInvoices = new java.util.ArrayList<BillingInvoice>();
  private String nextUri = null;
  private String previousUri = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("billingInvoices")
  public java.util.List<BillingInvoice> getBillingInvoices() {
    return billingInvoices;
  }
  public void setBillingInvoices(java.util.List<BillingInvoice> billingInvoices) {
    this.billingInvoices = billingInvoices;
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
    BillingInvoicesResponse billingInvoicesResponse = (BillingInvoicesResponse) o;

    return true && Objects.equals(billingInvoices, billingInvoicesResponse.billingInvoices) &&
        Objects.equals(nextUri, billingInvoicesResponse.nextUri) &&
        Objects.equals(previousUri, billingInvoicesResponse.previousUri)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingInvoices, nextUri, previousUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoicesResponse {\n");
    
    if (billingInvoices != null)
      sb.append("    billingInvoices: ").append(toIndentedString(billingInvoices)).append("\n");
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

