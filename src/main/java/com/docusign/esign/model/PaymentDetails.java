package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Money;
import com.docusign.esign.model.PaymentLineItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PaymentDetails   {
  
  private String currencyCode = null;
  private String gatewayAccountId = null;
  private java.util.List<PaymentLineItem> lineItems = new java.util.ArrayList<PaymentLineItem>();
  private String status = null;
  private Money total = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gatewayAccountId")
  public String getGatewayAccountId() {
    return gatewayAccountId;
  }
  public void setGatewayAccountId(String gatewayAccountId) {
    this.gatewayAccountId = gatewayAccountId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lineItems")
  public java.util.List<PaymentLineItem> getLineItems() {
    return lineItems;
  }
  public void setLineItems(java.util.List<PaymentLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("total")
  public Money getTotal() {
    return total;
  }
  public void setTotal(Money total) {
    this.total = total;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetails paymentDetails = (PaymentDetails) o;

    return true && Objects.equals(currencyCode, paymentDetails.currencyCode) &&
        Objects.equals(gatewayAccountId, paymentDetails.gatewayAccountId) &&
        Objects.equals(lineItems, paymentDetails.lineItems) &&
        Objects.equals(status, paymentDetails.status) &&
        Objects.equals(total, paymentDetails.total)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, gatewayAccountId, lineItems, status, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetails {\n");
    
    if (currencyCode != null)
      sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    if (gatewayAccountId != null)
      sb.append("    gatewayAccountId: ").append(toIndentedString(gatewayAccountId)).append("\n");
    if (lineItems != null)
      sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (total != null)
      sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

