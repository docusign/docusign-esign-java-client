package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.SamlAssertionAttribute;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class RecipientSAMLAuthentication   {
  
  private java.util.List<SamlAssertionAttribute> samlAssertionAttributes = new java.util.ArrayList<SamlAssertionAttribute>();

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("samlAssertionAttributes")
  public java.util.List<SamlAssertionAttribute> getSamlAssertionAttributes() {
    return samlAssertionAttributes;
  }
  public void setSamlAssertionAttributes(java.util.List<SamlAssertionAttribute> samlAssertionAttributes) {
    this.samlAssertionAttributes = samlAssertionAttributes;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientSAMLAuthentication recipientSAMLAuthentication = (RecipientSAMLAuthentication) o;
    return Objects.equals(samlAssertionAttributes, recipientSAMLAuthentication.samlAssertionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(samlAssertionAttributes);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSAMLAuthentication {\n");
    
    sb.append("    samlAssertionAttributes: ").append(StringUtil.toIndentedString(samlAssertionAttributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
