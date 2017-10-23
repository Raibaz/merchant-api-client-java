/*
 * ChannelEngine API V2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.4.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.apiclient.model;

import java.util.Objects;
import com.channelengine.apiclient.model.MerchantCancellationLineRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MerchantCancellationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T09:35:24.367+02:00")
public class MerchantCancellationRequest {
  @SerializedName("MerchantCancellationNo")
  private String merchantCancellationNo = null;

  @SerializedName("MerchantOrderNo")
  private String merchantOrderNo = null;

  @SerializedName("Lines")
  private List<MerchantCancellationLineRequest> lines = new ArrayList<MerchantCancellationLineRequest>();

  @SerializedName("Reason")
  private String reason = null;

  public MerchantCancellationRequest merchantCancellationNo(String merchantCancellationNo) {
    this.merchantCancellationNo = merchantCancellationNo;
    return this;
  }

   /**
   * Get merchantCancellationNo
   * @return merchantCancellationNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMerchantCancellationNo() {
    return merchantCancellationNo;
  }

  public void setMerchantCancellationNo(String merchantCancellationNo) {
    this.merchantCancellationNo = merchantCancellationNo;
  }

  public MerchantCancellationRequest merchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * Get merchantOrderNo
   * @return merchantOrderNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }

  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }

  public MerchantCancellationRequest lines(List<MerchantCancellationLineRequest> lines) {
    this.lines = lines;
    return this;
  }

  public MerchantCancellationRequest addLinesItem(MerchantCancellationLineRequest linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "")
  public List<MerchantCancellationLineRequest> getLines() {
    return lines;
  }

  public void setLines(List<MerchantCancellationLineRequest> lines) {
    this.lines = lines;
  }

  public MerchantCancellationRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantCancellationRequest merchantCancellationRequest = (MerchantCancellationRequest) o;
    return Objects.equals(this.merchantCancellationNo, merchantCancellationRequest.merchantCancellationNo) &&
        Objects.equals(this.merchantOrderNo, merchantCancellationRequest.merchantOrderNo) &&
        Objects.equals(this.lines, merchantCancellationRequest.lines) &&
        Objects.equals(this.reason, merchantCancellationRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantCancellationNo, merchantOrderNo, lines, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantCancellationRequest {\n");
    
    sb.append("    merchantCancellationNo: ").append(toIndentedString(merchantCancellationNo)).append("\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

