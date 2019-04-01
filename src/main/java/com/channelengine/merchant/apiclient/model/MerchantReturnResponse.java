/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.merchant.apiclient.model.MerchantReturnLineResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * MerchantReturnResponse
 */

public class MerchantReturnResponse {
  @SerializedName("MerchantOrderNo")
  private String merchantOrderNo = null;

  @SerializedName("Lines")
  private List<MerchantReturnLineResponse> lines = null;

  @SerializedName("CreatedAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("UpdatedAt")
  private OffsetDateTime updatedAt = null;

  @SerializedName("Id")
  private Integer id = null;

  /**
   * The reason code of the return
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    PRODUCT_DEFECT("PRODUCT_DEFECT"),
    
    PRODUCT_UNSATISFACTORY("PRODUCT_UNSATISFACTORY"),
    
    WRONG_PRODUCT("WRONG_PRODUCT"),
    
    TOO_MANY_PRODUCTS("TOO_MANY_PRODUCTS"),
    
    REFUSED("REFUSED"),
    
    REFUSED_DAMAGED("REFUSED_DAMAGED"),
    
    WRONG_ADDRESS("WRONG_ADDRESS"),
    
    NOT_COLLECTED("NOT_COLLECTED"),
    
    WRONG_SIZE("WRONG_SIZE"),
    
    OTHER("OTHER");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Reason")
  private ReasonEnum reason = null;

  @SerializedName("CustomerComment")
  private String customerComment = null;

  @SerializedName("MerchantComment")
  private String merchantComment = null;

  @SerializedName("RefundInclVat")
  private BigDecimal refundInclVat = null;

  @SerializedName("RefundExclVat")
  private BigDecimal refundExclVat = null;

  public MerchantReturnResponse merchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * The unique order reference used by the Merchant
   * @return merchantOrderNo
  **/
  @ApiModelProperty(value = "The unique order reference used by the Merchant")
  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }

  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }

  public MerchantReturnResponse lines(List<MerchantReturnLineResponse> lines) {
    this.lines = lines;
    return this;
  }

  public MerchantReturnResponse addLinesItem(MerchantReturnLineResponse linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<MerchantReturnLineResponse>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(value = "")
  public List<MerchantReturnLineResponse> getLines() {
    return lines;
  }

  public void setLines(List<MerchantReturnLineResponse> lines) {
    this.lines = lines;
  }

  public MerchantReturnResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date at which the return was created in ChannelEngine
   * @return createdAt
  **/
  @ApiModelProperty(value = "The date at which the return was created in ChannelEngine")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public MerchantReturnResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date at which the return was last modified in ChannelEngine
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The date at which the return was last modified in ChannelEngine")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public MerchantReturnResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique return reference used by ChannelEngine
   * @return id
  **/
  @ApiModelProperty(value = "The unique return reference used by ChannelEngine")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MerchantReturnResponse reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason code of the return
   * @return reason
  **/
  @ApiModelProperty(value = "The reason code of the return")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public MerchantReturnResponse customerComment(String customerComment) {
    this.customerComment = customerComment;
    return this;
  }

   /**
   * Optional. Comment of customer on the (reason of) the return
   * @return customerComment
  **/
  @ApiModelProperty(value = "Optional. Comment of customer on the (reason of) the return")
  public String getCustomerComment() {
    return customerComment;
  }

  public void setCustomerComment(String customerComment) {
    this.customerComment = customerComment;
  }

  public MerchantReturnResponse merchantComment(String merchantComment) {
    this.merchantComment = merchantComment;
    return this;
  }

   /**
   * Optional. Comment of merchant on the return.
   * @return merchantComment
  **/
  @ApiModelProperty(value = "Optional. Comment of merchant on the return.")
  public String getMerchantComment() {
    return merchantComment;
  }

  public void setMerchantComment(String merchantComment) {
    this.merchantComment = merchantComment;
  }

  public MerchantReturnResponse refundInclVat(BigDecimal refundInclVat) {
    this.refundInclVat = refundInclVat;
    return this;
  }

   /**
   * Refund amount incl. VAT
   * @return refundInclVat
  **/
  @ApiModelProperty(value = "Refund amount incl. VAT")
  public BigDecimal getRefundInclVat() {
    return refundInclVat;
  }

  public void setRefundInclVat(BigDecimal refundInclVat) {
    this.refundInclVat = refundInclVat;
  }

  public MerchantReturnResponse refundExclVat(BigDecimal refundExclVat) {
    this.refundExclVat = refundExclVat;
    return this;
  }

   /**
   * Refund amount excl. VAT
   * @return refundExclVat
  **/
  @ApiModelProperty(value = "Refund amount excl. VAT")
  public BigDecimal getRefundExclVat() {
    return refundExclVat;
  }

  public void setRefundExclVat(BigDecimal refundExclVat) {
    this.refundExclVat = refundExclVat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantReturnResponse merchantReturnResponse = (MerchantReturnResponse) o;
    return Objects.equals(this.merchantOrderNo, merchantReturnResponse.merchantOrderNo) &&
        Objects.equals(this.lines, merchantReturnResponse.lines) &&
        Objects.equals(this.createdAt, merchantReturnResponse.createdAt) &&
        Objects.equals(this.updatedAt, merchantReturnResponse.updatedAt) &&
        Objects.equals(this.id, merchantReturnResponse.id) &&
        Objects.equals(this.reason, merchantReturnResponse.reason) &&
        Objects.equals(this.customerComment, merchantReturnResponse.customerComment) &&
        Objects.equals(this.merchantComment, merchantReturnResponse.merchantComment) &&
        Objects.equals(this.refundInclVat, merchantReturnResponse.refundInclVat) &&
        Objects.equals(this.refundExclVat, merchantReturnResponse.refundExclVat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantOrderNo, lines, createdAt, updatedAt, id, reason, customerComment, merchantComment, refundInclVat, refundExclVat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantReturnResponse {\n");
    
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    customerComment: ").append(toIndentedString(customerComment)).append("\n");
    sb.append("    merchantComment: ").append(toIndentedString(merchantComment)).append("\n");
    sb.append("    refundInclVat: ").append(toIndentedString(refundInclVat)).append("\n");
    sb.append("    refundExclVat: ").append(toIndentedString(refundExclVat)).append("\n");
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

