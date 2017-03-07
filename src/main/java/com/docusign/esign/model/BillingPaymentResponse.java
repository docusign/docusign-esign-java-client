package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingPayment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Defines an billing payment response object.
 **/

@ApiModel(description = "Defines an billing payment response object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingPaymentResponse   {
  
  private java.util.List<BillingPayment> billingPayments = new java.util.ArrayList<BillingPayment>();

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("billingPayments")
  public java.util.List<BillingPayment> getBillingPayments() {
    return billingPayments;
  }
  public void setBillingPayments(java.util.List<BillingPayment> billingPayments) {
    this.billingPayments = billingPayments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPaymentResponse billingPaymentResponse = (BillingPaymentResponse) o;

    return true && Objects.equals(billingPayments, billingPaymentResponse.billingPayments)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPaymentResponse {\n");
    
    if (billingPayments != null)
      sb.append("    billingPayments: ").append(toIndentedString(billingPayments)).append("\n");
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

