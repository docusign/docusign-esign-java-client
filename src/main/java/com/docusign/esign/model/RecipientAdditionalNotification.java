package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.RecipientPhoneNumber;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientAdditionalNotification.
 *
 */

public class RecipientAdditionalNotification {
  @JsonProperty("phoneNumber")
  private RecipientPhoneNumber phoneNumber = null;

  @JsonProperty("secondaryDeliveryMethod")
  private String secondaryDeliveryMethod = null;

  @JsonProperty("secondaryDeliveryMethodMetadata")
  private PropertyMetadata secondaryDeliveryMethodMetadata = null;

  @JsonProperty("secondaryDeliveryStatus")
  private String secondaryDeliveryStatus = null;


  /**
   * phoneNumber.
   *
   * @return RecipientAdditionalNotification
   **/
  public RecipientAdditionalNotification phoneNumber(RecipientPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber.
   * @return phoneNumber
   **/
  @ApiModelProperty(value = "")
  public RecipientPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * setPhoneNumber.
   **/
  public void setPhoneNumber(RecipientPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * secondaryDeliveryMethod.
   *
   * @return RecipientAdditionalNotification
   **/
  public RecipientAdditionalNotification secondaryDeliveryMethod(String secondaryDeliveryMethod) {
    this.secondaryDeliveryMethod = secondaryDeliveryMethod;
    return this;
  }

  /**
   * .
   * @return secondaryDeliveryMethod
   **/
  @ApiModelProperty(value = "")
  public String getSecondaryDeliveryMethod() {
    return secondaryDeliveryMethod;
  }

  /**
   * setSecondaryDeliveryMethod.
   **/
  public void setSecondaryDeliveryMethod(String secondaryDeliveryMethod) {
    this.secondaryDeliveryMethod = secondaryDeliveryMethod;
  }


  /**
   * secondaryDeliveryMethodMetadata.
   *
   * @return RecipientAdditionalNotification
   **/
  public RecipientAdditionalNotification secondaryDeliveryMethodMetadata(PropertyMetadata secondaryDeliveryMethodMetadata) {
    this.secondaryDeliveryMethodMetadata = secondaryDeliveryMethodMetadata;
    return this;
  }

  /**
   * Get secondaryDeliveryMethodMetadata.
   * @return secondaryDeliveryMethodMetadata
   **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getSecondaryDeliveryMethodMetadata() {
    return secondaryDeliveryMethodMetadata;
  }

  /**
   * setSecondaryDeliveryMethodMetadata.
   **/
  public void setSecondaryDeliveryMethodMetadata(PropertyMetadata secondaryDeliveryMethodMetadata) {
    this.secondaryDeliveryMethodMetadata = secondaryDeliveryMethodMetadata;
  }


  /**
   * secondaryDeliveryStatus.
   *
   * @return RecipientAdditionalNotification
   **/
  public RecipientAdditionalNotification secondaryDeliveryStatus(String secondaryDeliveryStatus) {
    this.secondaryDeliveryStatus = secondaryDeliveryStatus;
    return this;
  }

  /**
   * .
   * @return secondaryDeliveryStatus
   **/
  @ApiModelProperty(value = "")
  public String getSecondaryDeliveryStatus() {
    return secondaryDeliveryStatus;
  }

  /**
   * setSecondaryDeliveryStatus.
   **/
  public void setSecondaryDeliveryStatus(String secondaryDeliveryStatus) {
    this.secondaryDeliveryStatus = secondaryDeliveryStatus;
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
    RecipientAdditionalNotification recipientAdditionalNotification = (RecipientAdditionalNotification) o;
    return Objects.equals(this.phoneNumber, recipientAdditionalNotification.phoneNumber) &&
        Objects.equals(this.secondaryDeliveryMethod, recipientAdditionalNotification.secondaryDeliveryMethod) &&
        Objects.equals(this.secondaryDeliveryMethodMetadata, recipientAdditionalNotification.secondaryDeliveryMethodMetadata) &&
        Objects.equals(this.secondaryDeliveryStatus, recipientAdditionalNotification.secondaryDeliveryStatus);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, secondaryDeliveryMethod, secondaryDeliveryMethodMetadata, secondaryDeliveryStatus);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientAdditionalNotification {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    secondaryDeliveryMethod: ").append(toIndentedString(secondaryDeliveryMethod)).append("\n");
    sb.append("    secondaryDeliveryMethodMetadata: ").append(toIndentedString(secondaryDeliveryMethodMetadata)).append("\n");
    sb.append("    secondaryDeliveryStatus: ").append(toIndentedString(secondaryDeliveryStatus)).append("\n");
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

