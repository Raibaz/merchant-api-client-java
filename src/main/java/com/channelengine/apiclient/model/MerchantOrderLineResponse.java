/*
 * ChannelEngine API V2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.apiclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MerchantOrderLineResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-20T12:47:30.980+02:00")
public class MerchantOrderLineResponse {
  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    IN_PROGRESS("IN_PROGRESS"),
    
    SHIPPED("SHIPPED"),
    
    IN_BACKORDER("IN_BACKORDER"),
    
    CANCELED("CANCELED"),
    
    MANCO("MANCO"),
    
    IN_COMBI("IN_COMBI"),
    
    CLOSED("CLOSED"),
    
    NEW("NEW"),
    
    RETURNED("RETURNED"),
    
    REQUIRES_CORRECTION("REQUIRES_CORRECTION");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("IsFulfillmentByMarketplace")
  private Boolean isFulfillmentByMarketplace = null;

  @SerializedName("MerchantProductNo")
  private String merchantProductNo = null;

  @SerializedName("ChannelProductNo")
  private String channelProductNo = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("UnitPriceInclVat")
  private Double unitPriceInclVat = null;

  @SerializedName("FeeFixed")
  private Double feeFixed = null;

  @SerializedName("FeeRate")
  private Double feeRate = null;

  /**
   * The condition of the product, this can be used to indicate that a product is a second-hand product
   */
  @JsonAdapter(ConditionEnum.Adapter.class)
  public enum ConditionEnum {
    NEW("NEW"),
    
    NEW_REFURBISHED("NEW_REFURBISHED"),
    
    USED_AS_NEW("USED_AS_NEW"),
    
    USED_GOOD("USED_GOOD"),
    
    USED_REASONABLE("USED_REASONABLE"),
    
    USED_MEDIOCRE("USED_MEDIOCRE"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConditionEnum fromValue(String text) {
      for (ConditionEnum b : ConditionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConditionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConditionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConditionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConditionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Condition")
  private ConditionEnum condition = null;

  public MerchantOrderLineResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MerchantOrderLineResponse isFulfillmentByMarketplace(Boolean isFulfillmentByMarketplace) {
    this.isFulfillmentByMarketplace = isFulfillmentByMarketplace;
    return this;
  }

   /**
   * Get isFulfillmentByMarketplace
   * @return isFulfillmentByMarketplace
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsFulfillmentByMarketplace() {
    return isFulfillmentByMarketplace;
  }

  public void setIsFulfillmentByMarketplace(Boolean isFulfillmentByMarketplace) {
    this.isFulfillmentByMarketplace = isFulfillmentByMarketplace;
  }

  public MerchantOrderLineResponse merchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * Get merchantProductNo
   * @return merchantProductNo
  **/
  @ApiModelProperty(value = "")
  public String getMerchantProductNo() {
    return merchantProductNo;
  }

  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }

  public MerchantOrderLineResponse channelProductNo(String channelProductNo) {
    this.channelProductNo = channelProductNo;
    return this;
  }

   /**
   * Get channelProductNo
   * @return channelProductNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getChannelProductNo() {
    return channelProductNo;
  }

  public void setChannelProductNo(String channelProductNo) {
    this.channelProductNo = channelProductNo;
  }

  public MerchantOrderLineResponse quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public MerchantOrderLineResponse unitPriceInclVat(Double unitPriceInclVat) {
    this.unitPriceInclVat = unitPriceInclVat;
    return this;
  }

   /**
   * The value of a single unit of the ordered product including VAT  (in the tenant&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return unitPriceInclVat
  **/
  @ApiModelProperty(required = true, value = "The value of a single unit of the ordered product including VAT  (in the tenant's base currency calculated using the exchange rate at the time of ordering).")
  public Double getUnitPriceInclVat() {
    return unitPriceInclVat;
  }

  public void setUnitPriceInclVat(Double unitPriceInclVat) {
    this.unitPriceInclVat = unitPriceInclVat;
  }

  public MerchantOrderLineResponse feeFixed(Double feeFixed) {
    this.feeFixed = feeFixed;
    return this;
  }

   /**
   * A fixed fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable.
   * @return feeFixed
  **/
  @ApiModelProperty(value = "A fixed fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable.")
  public Double getFeeFixed() {
    return feeFixed;
  }

  public void setFeeFixed(Double feeFixed) {
    this.feeFixed = feeFixed;
  }

  public MerchantOrderLineResponse feeRate(Double feeRate) {
    this.feeRate = feeRate;
    return this;
  }

   /**
   * A percentage fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable.
   * @return feeRate
  **/
  @ApiModelProperty(value = "A percentage fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable.")
  public Double getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(Double feeRate) {
    this.feeRate = feeRate;
  }

  public MerchantOrderLineResponse condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The condition of the product, this can be used to indicate that a product is a second-hand product
   * @return condition
  **/
  @ApiModelProperty(value = "The condition of the product, this can be used to indicate that a product is a second-hand product")
  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantOrderLineResponse merchantOrderLineResponse = (MerchantOrderLineResponse) o;
    return Objects.equals(this.status, merchantOrderLineResponse.status) &&
        Objects.equals(this.isFulfillmentByMarketplace, merchantOrderLineResponse.isFulfillmentByMarketplace) &&
        Objects.equals(this.merchantProductNo, merchantOrderLineResponse.merchantProductNo) &&
        Objects.equals(this.channelProductNo, merchantOrderLineResponse.channelProductNo) &&
        Objects.equals(this.quantity, merchantOrderLineResponse.quantity) &&
        Objects.equals(this.unitPriceInclVat, merchantOrderLineResponse.unitPriceInclVat) &&
        Objects.equals(this.feeFixed, merchantOrderLineResponse.feeFixed) &&
        Objects.equals(this.feeRate, merchantOrderLineResponse.feeRate) &&
        Objects.equals(this.condition, merchantOrderLineResponse.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, isFulfillmentByMarketplace, merchantProductNo, channelProductNo, quantity, unitPriceInclVat, feeFixed, feeRate, condition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantOrderLineResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isFulfillmentByMarketplace: ").append(toIndentedString(isFulfillmentByMarketplace)).append("\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    channelProductNo: ").append(toIndentedString(channelProductNo)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPriceInclVat: ").append(toIndentedString(unitPriceInclVat)).append("\n");
    sb.append("    feeFixed: ").append(toIndentedString(feeFixed)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

