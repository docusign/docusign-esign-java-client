package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AddressInformationInput;
import com.docusign.esign.model.DobInformationInput;
import com.docusign.esign.model.Ssn4InformationInput;
import com.docusign.esign.model.Ssn9InformationInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A complex element that contains input information related to a recipient ID
 * check. It can include the following information. addressInformationInput:
 * Used to set recipient address information and consists of: *
 * addressInformation: consists of six elements, with stree2 and zipPlus4 being
 * optional. The elements are: street1, street2, city, state, zip, zipPlus4. The
 * maximum length of each element is: street1/street2 &#x3D; 150 characters,
 * city &#x3D; 50 characters, state &#x3D; 2 characters, and zip/zipPlus4 &#x3D;
 * 20 characters. * displayLevelCode: Specifies the display level for the
 * recipient. Values are: ReadOnly, Editable, or DoNotDisplay. *
 * receiveInResponse: A Boolean element that specifies if the information needs
 * to be returned in the response. dobInformationInput: Used to set recipient
 * date of birth information and consists of: * dateOfBirth: Specifies the
 * recipient&#39;s date, month and year of birth. * displayLevelCode: Specifies
 * the display level for the recipient. Values are: ReadOnly, Editable, or
 * DoNotDisplay. * receiveInResponse: A Boolean element that specifies if the
 * information needs to be returned in the response. ssn4InformationInput: Used
 * to set the last four digits of the recipient&#39;s SSN information and
 * consists of: * ssn4: Specifies the last four digits of the recipient&#39;s
 * SSN. * displayLevelCode: Specifies the display level for the recipient.
 * Values are: ReadOnly, Editable, or DoNotDisplay. * receiveInResponse: A
 * Boolean element that specifies if the information needs to be returned in the
 * response. ssn9InformationInput: Used to set the recipient&#39;s SSN
 * information. Note that the ssn9 information can never be returned in the
 * response. The ssn9 input consists of: * ssn9: Specifies the recipient&#39;s
 * SSN. * displayLevelCode: Specifies the display level for the recipient.
 * Values are: ReadOnly, Editable, or DoNotDisplay..
 *
 */
@Schema(description = "A complex element that contains input information related to a recipient ID check. It can include the following information.  addressInformationInput: Used to set recipient address information and consists of:  * addressInformation: consists of six elements, with stree2 and zipPlus4 being optional. The elements are: street1, street2, city, state, zip, zipPlus4. The maximum length of each element is: street1/street2 = 150 characters, city = 50 characters, state = 2 characters, and zip/zipPlus4 = 20 characters. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay. * receiveInResponse: A Boolean element that specifies if the information needs to be returned in the response.  dobInformationInput: Used to set recipient date of birth information and consists of:  * dateOfBirth: Specifies the recipient's date, month and year of birth. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay. * receiveInResponse: A Boolean element that specifies if the information needs to be returned in the response.  ssn4InformationInput: Used to set the last four digits of the recipient's SSN information and consists of:  * ssn4: Specifies the last four digits of the recipient's SSN. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay. * receiveInResponse: A Boolean element that specifies if the information needs to be returned in the response.  ssn9InformationInput: Used to set the recipient's SSN information. Note that the ssn9 information can never be returned in the response. The ssn9 input consists of:  * ssn9: Specifies the recipient's SSN. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay.")

public class IdCheckInformationInput {
  @JsonProperty("addressInformationInput")
  private AddressInformationInput addressInformationInput = null;

  @JsonProperty("dobInformationInput")
  private DobInformationInput dobInformationInput = null;

  @JsonProperty("ssn4InformationInput")
  private Ssn4InformationInput ssn4InformationInput = null;

  @JsonProperty("ssn9InformationInput")
  private Ssn9InformationInput ssn9InformationInput = null;

  /**
   * addressInformationInput.
   *
   * @return IdCheckInformationInput
   **/
  public IdCheckInformationInput addressInformationInput(AddressInformationInput addressInformationInput) {
    this.addressInformationInput = addressInformationInput;
    return this;
  }

  /**
   * An object that specifies recipient address information and how it is
   * displayed..
   * 
   * @return addressInformationInput
   **/
  @Schema(description = "An object that specifies recipient address information and how it is displayed.")
  public AddressInformationInput getAddressInformationInput() {
    return addressInformationInput;
  }

  /**
   * setAddressInformationInput.
   **/
  public void setAddressInformationInput(AddressInformationInput addressInformationInput) {
    this.addressInformationInput = addressInformationInput;
  }

  /**
   * dobInformationInput.
   *
   * @return IdCheckInformationInput
   **/
  public IdCheckInformationInput dobInformationInput(DobInformationInput dobInformationInput) {
    this.dobInformationInput = dobInformationInput;
    return this;
  }

  /**
   * An object that specifies recipient date of birth information and how it is
   * displayed..
   * 
   * @return dobInformationInput
   **/
  @Schema(description = "An object that specifies recipient date of birth information and how it is displayed.")
  public DobInformationInput getDobInformationInput() {
    return dobInformationInput;
  }

  /**
   * setDobInformationInput.
   **/
  public void setDobInformationInput(DobInformationInput dobInformationInput) {
    this.dobInformationInput = dobInformationInput;
  }

  /**
   * ssn4InformationInput.
   *
   * @return IdCheckInformationInput
   **/
  public IdCheckInformationInput ssn4InformationInput(Ssn4InformationInput ssn4InformationInput) {
    this.ssn4InformationInput = ssn4InformationInput;
    return this;
  }

  /**
   * An object that specifies the last four digits of the recipient's Social
   * Security Number (SSN)..
   * 
   * @return ssn4InformationInput
   **/
  @Schema(description = "An object that specifies the last four digits of the recipient's Social Security Number (SSN).")
  public Ssn4InformationInput getSsn4InformationInput() {
    return ssn4InformationInput;
  }

  /**
   * setSsn4InformationInput.
   **/
  public void setSsn4InformationInput(Ssn4InformationInput ssn4InformationInput) {
    this.ssn4InformationInput = ssn4InformationInput;
  }

  /**
   * ssn9InformationInput.
   *
   * @return IdCheckInformationInput
   **/
  public IdCheckInformationInput ssn9InformationInput(Ssn9InformationInput ssn9InformationInput) {
    this.ssn9InformationInput = ssn9InformationInput;
    return this;
  }

  /**
   * An object that specifies the recipient's Social Security Number (SSN)
   * information. Note that ssn9 information cannot be returned in a response..
   * 
   * @return ssn9InformationInput
   **/
  @Schema(description = "An object that specifies the recipient's Social Security Number (SSN) information. Note that ssn9 information cannot be returned in a response.")
  public Ssn9InformationInput getSsn9InformationInput() {
    return ssn9InformationInput;
  }

  /**
   * setSsn9InformationInput.
   **/
  public void setSsn9InformationInput(Ssn9InformationInput ssn9InformationInput) {
    this.ssn9InformationInput = ssn9InformationInput;
  }

  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(addressInformationInput, dobInformationInput, ssn4InformationInput, ssn9InformationInput);
  }

  /**
   * Converts the given object to string.
   */
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
