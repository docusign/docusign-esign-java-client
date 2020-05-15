package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AddressInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentProcessorInformation
 */

public class PaymentProcessorInformation {
  @JsonProperty("address")
  private AddressInformation address = null;

  @JsonProperty("billingAgreementId")
  private String billingAgreementId = null;

  @JsonProperty("email")
  private String email = null;

  public PaymentProcessorInformation address(AddressInformation address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public AddressInformation getAddress() {
    return address;
  }

  public void setAddress(AddressInformation address) {
    this.address = address;
  }

  public PaymentProcessorInformation billingAgreementId(String billingAgreementId) {
    this.billingAgreementId = billingAgreementId;
    return this;
  }

   /**
   * 
   * @return billingAgreementId
  **/
  @ApiModelProperty(value = "")
  public String getBillingAgreementId() {
    return billingAgreementId;
  }

  public void setBillingAgreementId(String billingAgreementId) {
    this.billingAgreementId = billingAgreementId;
  }

  public PaymentProcessorInformation email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProcessorInformation paymentProcessorInformation = (PaymentProcessorInformation) o;
    return Objects.equals(this.address, paymentProcessorInformation.address) &&
        Objects.equals(this.billingAgreementId, paymentProcessorInformation.billingAgreementId) &&
        Objects.equals(this.email, paymentProcessorInformation.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, billingAgreementId, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProcessorInformation {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    billingAgreementId: ").append(toIndentedString(billingAgreementId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

