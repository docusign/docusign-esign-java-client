package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AddressInformationInput;
import com.docusign.esign.model.DobInformationInput;
import com.docusign.esign.model.Ssn4InformationInput;
import com.docusign.esign.model.Ssn9InformationInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class IdCheckInformationInput   {
  
  private AddressInformationInput addressInformationInput = null;
  private DobInformationInput dobInformationInput = null;
  private Ssn4InformationInput ssn4InformationInput = null;
  private Ssn9InformationInput ssn9InformationInput = null;

  
  /**
   **/
  public IdCheckInformationInput addressInformationInput(AddressInformationInput addressInformationInput) {
    this.addressInformationInput = addressInformationInput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressInformationInput")
  public AddressInformationInput getAddressInformationInput() {
    return addressInformationInput;
  }
  public void setAddressInformationInput(AddressInformationInput addressInformationInput) {
    this.addressInformationInput = addressInformationInput;
  }

  
  /**
   **/
  public IdCheckInformationInput dobInformationInput(DobInformationInput dobInformationInput) {
    this.dobInformationInput = dobInformationInput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dobInformationInput")
  public DobInformationInput getDobInformationInput() {
    return dobInformationInput;
  }
  public void setDobInformationInput(DobInformationInput dobInformationInput) {
    this.dobInformationInput = dobInformationInput;
  }

  
  /**
   **/
  public IdCheckInformationInput ssn4InformationInput(Ssn4InformationInput ssn4InformationInput) {
    this.ssn4InformationInput = ssn4InformationInput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ssn4InformationInput")
  public Ssn4InformationInput getSsn4InformationInput() {
    return ssn4InformationInput;
  }
  public void setSsn4InformationInput(Ssn4InformationInput ssn4InformationInput) {
    this.ssn4InformationInput = ssn4InformationInput;
  }

  
  /**
   **/
  public IdCheckInformationInput ssn9InformationInput(Ssn9InformationInput ssn9InformationInput) {
    this.ssn9InformationInput = ssn9InformationInput;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ssn9InformationInput")
  public Ssn9InformationInput getSsn9InformationInput() {
    return ssn9InformationInput;
  }
  public void setSsn9InformationInput(Ssn9InformationInput ssn9InformationInput) {
    this.ssn9InformationInput = ssn9InformationInput;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdCheckInformationInput idCheckInformationInput = (IdCheckInformationInput) o;
    return Objects.equals(this.addressInformationInput, idCheckInformationInput.addressInformationInput) &&
        Objects.equals(this.dobInformationInput, idCheckInformationInput.dobInformationInput) &&
        Objects.equals(this.ssn4InformationInput, idCheckInformationInput.ssn4InformationInput) &&
        Objects.equals(this.ssn9InformationInput, idCheckInformationInput.ssn9InformationInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInformationInput, dobInformationInput, ssn4InformationInput, ssn9InformationInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdCheckInformationInput {\n");
    
    sb.append("    addressInformationInput: ").append(toIndentedString(addressInformationInput)).append("\n");
    sb.append("    dobInformationInput: ").append(toIndentedString(dobInformationInput)).append("\n");
    sb.append("    ssn4InformationInput: ").append(toIndentedString(ssn4InformationInput)).append("\n");
    sb.append("    ssn9InformationInput: ").append(toIndentedString(ssn9InformationInput)).append("\n");
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

