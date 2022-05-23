package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Contains information about an APP store receipt.. */
@ApiModel(description = "Contains information about an APP store receipt.")
public class AppStoreReceipt {
  @JsonProperty("downgradeProductId")
  private String downgradeProductId = null;

  @JsonProperty("isDowngradeCancellation")
  private String isDowngradeCancellation = null;

  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("receiptData")
  private String receiptData = null;

  /**
   * downgradeProductId.
   *
   * @return AppStoreReceipt
   */
  public AppStoreReceipt downgradeProductId(String downgradeProductId) {
    this.downgradeProductId = downgradeProductId;
    return this;
  }

  /**
   * .
   *
   * @return downgradeProductId
   */
  @ApiModelProperty(value = "")
  public String getDowngradeProductId() {
    return downgradeProductId;
  }

  /** setDowngradeProductId. */
  public void setDowngradeProductId(String downgradeProductId) {
    this.downgradeProductId = downgradeProductId;
  }

  /**
   * isDowngradeCancellation.
   *
   * @return AppStoreReceipt
   */
  public AppStoreReceipt isDowngradeCancellation(String isDowngradeCancellation) {
    this.isDowngradeCancellation = isDowngradeCancellation;
    return this;
  }

  /**
   * .
   *
   * @return isDowngradeCancellation
   */
  @ApiModelProperty(value = "")
  public String getIsDowngradeCancellation() {
    return isDowngradeCancellation;
  }

  /** setIsDowngradeCancellation. */
  public void setIsDowngradeCancellation(String isDowngradeCancellation) {
    this.isDowngradeCancellation = isDowngradeCancellation;
  }

  /**
   * productId.
   *
   * @return AppStoreReceipt
   */
  public AppStoreReceipt productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * .
   *
   * @return productId
   */
  @ApiModelProperty(value = "")
  public String getProductId() {
    return productId;
  }

  /** setProductId. */
  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * receiptData.
   *
   * @return AppStoreReceipt
   */
  public AppStoreReceipt receiptData(String receiptData) {
    this.receiptData = receiptData;
    return this;
  }

  /**
   * Reserved: TBD.
   *
   * @return receiptData
   */
  @ApiModelProperty(value = "Reserved: TBD")
  public String getReceiptData() {
    return receiptData;
  }

  /** setReceiptData. */
  public void setReceiptData(String receiptData) {
    this.receiptData = receiptData;
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
    AppStoreReceipt appStoreReceipt = (AppStoreReceipt) o;
    return Objects.equals(this.downgradeProductId, appStoreReceipt.downgradeProductId)
        && Objects.equals(this.isDowngradeCancellation, appStoreReceipt.isDowngradeCancellation)
        && Objects.equals(this.productId, appStoreReceipt.productId)
        && Objects.equals(this.receiptData, appStoreReceipt.receiptData);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(downgradeProductId, isDowngradeCancellation, productId, receiptData);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreReceipt {\n");

    sb.append("    downgradeProductId: ").append(toIndentedString(downgradeProductId)).append("\n");
    sb.append("    isDowngradeCancellation: ")
        .append(toIndentedString(isDowngradeCancellation))
        .append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    receiptData: ").append(toIndentedString(receiptData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
