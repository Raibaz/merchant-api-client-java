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
import com.channelengine.apiclient.model.ChannelCancellationLineResponse;
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
 * ChannelCancellationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T09:29:25.527+02:00")
public class ChannelCancellationResponse {
  @SerializedName("ChannelOrderNo")
  private String channelOrderNo = null;

  @SerializedName("Lines")
  private List<ChannelCancellationLineResponse> lines = new ArrayList<ChannelCancellationLineResponse>();

  @SerializedName("Reason")
  private String reason = null;

  public ChannelCancellationResponse channelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
    return this;
  }

   /**
   * Get channelOrderNo
   * @return channelOrderNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getChannelOrderNo() {
    return channelOrderNo;
  }

  public void setChannelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
  }

  public ChannelCancellationResponse lines(List<ChannelCancellationLineResponse> lines) {
    this.lines = lines;
    return this;
  }

  public ChannelCancellationResponse addLinesItem(ChannelCancellationLineResponse linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ChannelCancellationLineResponse> getLines() {
    return lines;
  }

  public void setLines(List<ChannelCancellationLineResponse> lines) {
    this.lines = lines;
  }

  public ChannelCancellationResponse reason(String reason) {
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
    ChannelCancellationResponse channelCancellationResponse = (ChannelCancellationResponse) o;
    return Objects.equals(this.channelOrderNo, channelCancellationResponse.channelOrderNo) &&
        Objects.equals(this.lines, channelCancellationResponse.lines) &&
        Objects.equals(this.reason, channelCancellationResponse.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelOrderNo, lines, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCancellationResponse {\n");
    
    sb.append("    channelOrderNo: ").append(toIndentedString(channelOrderNo)).append("\n");
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

