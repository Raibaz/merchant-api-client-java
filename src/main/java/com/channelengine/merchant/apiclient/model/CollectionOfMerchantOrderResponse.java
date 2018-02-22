/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * OpenAPI spec version: 2.5.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.merchant.apiclient.model.MerchantOrderResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CollectionOfMerchantOrderResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-22T13:02:29.037+01:00")
public class CollectionOfMerchantOrderResponse {
  @SerializedName("Content")
  private List<MerchantOrderResponse> content = null;

  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("ItemsPerPage")
  private Integer itemsPerPage = null;

  @SerializedName("StatusCode")
  private Integer statusCode = null;

  @SerializedName("Success")
  private Boolean success = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("ValidationErrors")
  private Map<String, List<String>> validationErrors = null;

  public CollectionOfMerchantOrderResponse content(List<MerchantOrderResponse> content) {
    this.content = content;
    return this;
  }

  public CollectionOfMerchantOrderResponse addContentItem(MerchantOrderResponse contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<MerchantOrderResponse>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public List<MerchantOrderResponse> getContent() {
    return content;
  }

  public void setContent(List<MerchantOrderResponse> content) {
    this.content = content;
  }

  public CollectionOfMerchantOrderResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of items in the current response
   * @return count
  **/
  @ApiModelProperty(value = "The number of items in the current response")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CollectionOfMerchantOrderResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of items
   * @return totalCount
  **/
  @ApiModelProperty(value = "The total number of items")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public CollectionOfMerchantOrderResponse itemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

   /**
   * The number of items per page
   * @return itemsPerPage
  **/
  @ApiModelProperty(value = "The number of items per page")
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  public CollectionOfMerchantOrderResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public CollectionOfMerchantOrderResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public CollectionOfMerchantOrderResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CollectionOfMerchantOrderResponse validationErrors(Map<String, List<String>> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public CollectionOfMerchantOrderResponse putValidationErrorsItem(String key, List<String> validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new HashMap<String, List<String>>();
    }
    this.validationErrors.put(key, validationErrorsItem);
    return this;
  }

   /**
   * Get validationErrors
   * @return validationErrors
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<String>> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(Map<String, List<String>> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionOfMerchantOrderResponse collectionOfMerchantOrderResponse = (CollectionOfMerchantOrderResponse) o;
    return Objects.equals(this.content, collectionOfMerchantOrderResponse.content) &&
        Objects.equals(this.count, collectionOfMerchantOrderResponse.count) &&
        Objects.equals(this.totalCount, collectionOfMerchantOrderResponse.totalCount) &&
        Objects.equals(this.itemsPerPage, collectionOfMerchantOrderResponse.itemsPerPage) &&
        Objects.equals(this.statusCode, collectionOfMerchantOrderResponse.statusCode) &&
        Objects.equals(this.success, collectionOfMerchantOrderResponse.success) &&
        Objects.equals(this.message, collectionOfMerchantOrderResponse.message) &&
        Objects.equals(this.validationErrors, collectionOfMerchantOrderResponse.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, count, totalCount, itemsPerPage, statusCode, success, message, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionOfMerchantOrderResponse {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

