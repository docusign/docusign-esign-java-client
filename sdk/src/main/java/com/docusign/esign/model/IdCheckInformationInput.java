package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.AddressInformationInput;
import com.docusign.esign.model.DobInformationInput;
import com.docusign.esign.model.Ssn9InformationInput;
import com.docusign.esign.model.Ssn4InformationInput;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class IdCheckInformationInput   {
  
  private AddressInformationInput addressInformationInput = null;
  private DobInformationInput dobInformationInput = null;
  private Ssn4InformationInput ssn4InformationInput = null;
  private Ssn9InformationInput ssn9InformationInput = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("addressInformationInput")
  public AddressInformationInput getAddressInformationInput() {
    return addressInformationInput;
  }
  public void setAddressInformationInput(AddressInformationInput addressInformationInput) {
    this.addressInformationInput = addressInformationInput;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dobInformationInput")
  public DobInformationInput getDobInformationInput() {
    return dobInformationInput;
  }
  public void setDobInformationInput(DobInformationInput dobInformationInput) {
    this.dobInformationInput = dobInformationInput;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ssn4InformationInput")
  public Ssn4InformationInput getSsn4InformationInput() {
    return ssn4InformationInput;
  }
  public void setSsn4InformationInput(Ssn4InformationInput ssn4InformationInput) {
    this.ssn4InformationInput = ssn4InformationInput;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ssn9InformationInput")
  public Ssn9InformationInput getSsn9InformationInput() {
    return ssn9InformationInput;
  }
  public void setSsn9InformationInput(Ssn9InformationInput ssn9InformationInput) {
    this.ssn9InformationInput = ssn9InformationInput;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdCheckInformationInput idCheckInformationInput = (IdCheckInformationInput) o;
    return Objects.equals(addressInformationInput, idCheckInformationInput.addressInformationInput) &&
        Objects.equals(dobInformationInput, idCheckInformationInput.dobInformationInput) &&
        Objects.equals(ssn4InformationInput, idCheckInformationInput.ssn4InformationInput) &&
        Objects.equals(ssn9InformationInput, idCheckInformationInput.ssn9InformationInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInformationInput, dobInformationInput, ssn4InformationInput, ssn9InformationInput);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdCheckInformationInput {\n");
    
    sb.append("    addressInformationInput: ").append(StringUtil.toIndentedString(addressInformationInput)).append("\n");
    sb.append("    dobInformationInput: ").append(StringUtil.toIndentedString(dobInformationInput)).append("\n");
    sb.append("    ssn4InformationInput: ").append(StringUtil.toIndentedString(ssn4InformationInput)).append("\n");
    sb.append("    ssn9InformationInput: ").append(StringUtil.toIndentedString(ssn9InformationInput)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
