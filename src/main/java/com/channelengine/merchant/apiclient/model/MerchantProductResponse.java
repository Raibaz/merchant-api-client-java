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
import com.channelengine.merchant.apiclient.model.ExtraDataItem;
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

/**
 * MerchantProductResponse
 */

public class MerchantProductResponse {
  @SerializedName("IsActive")
  private Boolean isActive = null;

  @SerializedName("MerchantProductNo")
  private String merchantProductNo = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Brand")
  private String brand = null;

  @SerializedName("Size")
  private String size = null;

  @SerializedName("Color")
  private String color = null;

  @SerializedName("Ean")
  private String ean = null;

  @SerializedName("ManufacturerProductNumber")
  private String manufacturerProductNumber = null;

  @SerializedName("Stock")
  private Integer stock = null;

  @SerializedName("Price")
  private BigDecimal price = null;

  @SerializedName("MSRP")
  private BigDecimal MSRP = null;

  @SerializedName("PurchasePrice")
  private BigDecimal purchasePrice = null;

  /**
   * The type of VAT which applies to this product.  See: http://ec.europa.eu/taxation_customs/taxation/vat/topics/rates_en.htm
   */
  @JsonAdapter(VatRateTypeEnum.Adapter.class)
  public enum VatRateTypeEnum {
    STANDARD("STANDARD"),
    
    REDUCED("REDUCED"),
    
    SUPER_REDUCED("SUPER_REDUCED");

    private String value;

    VatRateTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VatRateTypeEnum fromValue(String text) {
      for (VatRateTypeEnum b : VatRateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VatRateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VatRateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VatRateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VatRateTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("VatRateType")
  private VatRateTypeEnum vatRateType = null;

  @SerializedName("ShippingCost")
  private BigDecimal shippingCost = null;

  @SerializedName("ShippingTime")
  private String shippingTime = null;

  @SerializedName("Url")
  private String url = null;

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  @SerializedName("ExtraImageUrl1")
  private String extraImageUrl1 = null;

  @SerializedName("ExtraImageUrl2")
  private String extraImageUrl2 = null;

  @SerializedName("ExtraImageUrl3")
  private String extraImageUrl3 = null;

  @SerializedName("ExtraImageUrl4")
  private String extraImageUrl4 = null;

  @SerializedName("ExtraImageUrl5")
  private String extraImageUrl5 = null;

  @SerializedName("ExtraImageUrl6")
  private String extraImageUrl6 = null;

  @SerializedName("ExtraImageUrl7")
  private String extraImageUrl7 = null;

  @SerializedName("ExtraImageUrl8")
  private String extraImageUrl8 = null;

  @SerializedName("ExtraImageUrl9")
  private String extraImageUrl9 = null;

  @SerializedName("CategoryTrail")
  private String categoryTrail = null;

  @SerializedName("ExtraData")
  private List<ExtraDataItem> extraData = null;

  public MerchantProductResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Is the product active for the Merchant?
   * @return isActive
  **/
  @ApiModelProperty(value = "Is the product active for the Merchant?")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public MerchantProductResponse merchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * A unique identifier of the product. (sku)
   * @return merchantProductNo
  **/
  @ApiModelProperty(value = "A unique identifier of the product. (sku)")
  public String getMerchantProductNo() {
    return merchantProductNo;
  }

  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }

  public MerchantProductResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the product
   * @return name
  **/
  @ApiModelProperty(value = "The name of the product")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MerchantProductResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the product
   * @return description
  **/
  @ApiModelProperty(value = "A description of the product")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MerchantProductResponse brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the product
   * @return brand
  **/
  @ApiModelProperty(value = "The brand of the product")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public MerchantProductResponse size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Optional. The size of the product (variant). E.g. fashion size (S-XL, 46-56, etc), width of the watch, etc..
   * @return size
  **/
  @ApiModelProperty(value = "Optional. The size of the product (variant). E.g. fashion size (S-XL, 46-56, etc), width of the watch, etc..")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public MerchantProductResponse color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Optional. The color of the product (variant).
   * @return color
  **/
  @ApiModelProperty(value = "Optional. The color of the product (variant).")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public MerchantProductResponse ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * The EAN of GTIN of the product
   * @return ean
  **/
  @ApiModelProperty(value = "The EAN of GTIN of the product")
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public MerchantProductResponse manufacturerProductNumber(String manufacturerProductNumber) {
    this.manufacturerProductNumber = manufacturerProductNumber;
    return this;
  }

   /**
   * The unique product reference used by the manufacturer/vendor of the product
   * @return manufacturerProductNumber
  **/
  @ApiModelProperty(value = "The unique product reference used by the manufacturer/vendor of the product")
  public String getManufacturerProductNumber() {
    return manufacturerProductNumber;
  }

  public void setManufacturerProductNumber(String manufacturerProductNumber) {
    this.manufacturerProductNumber = manufacturerProductNumber;
  }

  public MerchantProductResponse stock(Integer stock) {
    this.stock = stock;
    return this;
  }

   /**
   * The number of items in stock
   * @return stock
  **/
  @ApiModelProperty(value = "The number of items in stock")
  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public MerchantProductResponse price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Price, including VAT.
   * @return price
  **/
  @ApiModelProperty(value = "Price, including VAT.")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public MerchantProductResponse MSRP(BigDecimal MSRP) {
    this.MSRP = MSRP;
    return this;
  }

   /**
   * Manufacturer&#39;s suggested retail price
   * @return MSRP
  **/
  @ApiModelProperty(value = "Manufacturer's suggested retail price")
  public BigDecimal getMSRP() {
    return MSRP;
  }

  public void setMSRP(BigDecimal MSRP) {
    this.MSRP = MSRP;
  }

  public MerchantProductResponse purchasePrice(BigDecimal purchasePrice) {
    this.purchasePrice = purchasePrice;
    return this;
  }

   /**
   * Optional. The purchase price of the product. Useful for repricing.
   * @return purchasePrice
  **/
  @ApiModelProperty(value = "Optional. The purchase price of the product. Useful for repricing.")
  public BigDecimal getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(BigDecimal purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public MerchantProductResponse vatRateType(VatRateTypeEnum vatRateType) {
    this.vatRateType = vatRateType;
    return this;
  }

   /**
   * The type of VAT which applies to this product.  See: http://ec.europa.eu/taxation_customs/taxation/vat/topics/rates_en.htm
   * @return vatRateType
  **/
  @ApiModelProperty(value = "The type of VAT which applies to this product.  See: http://ec.europa.eu/taxation_customs/taxation/vat/topics/rates_en.htm")
  public VatRateTypeEnum getVatRateType() {
    return vatRateType;
  }

  public void setVatRateType(VatRateTypeEnum vatRateType) {
    this.vatRateType = vatRateType;
  }

  public MerchantProductResponse shippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

   /**
   * Shipping cost of the product.
   * @return shippingCost
  **/
  @ApiModelProperty(value = "Shipping cost of the product.")
  public BigDecimal getShippingCost() {
    return shippingCost;
  }

  public void setShippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
  }

  public MerchantProductResponse shippingTime(String shippingTime) {
    this.shippingTime = shippingTime;
    return this;
  }

   /**
   * A textual representation of the shippingtime.  For example, in Dutch: &#39;Op werkdagen voor 22:00 uur besteld, morgen in huis&#39;
   * @return shippingTime
  **/
  @ApiModelProperty(value = "A textual representation of the shippingtime.  For example, in Dutch: 'Op werkdagen voor 22:00 uur besteld, morgen in huis'")
  public String getShippingTime() {
    return shippingTime;
  }

  public void setShippingTime(String shippingTime) {
    this.shippingTime = shippingTime;
  }

  public MerchantProductResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A URL pointing to the merchant&#39;s webpage  which displays this product.
   * @return url
  **/
  @ApiModelProperty(value = "A URL pointing to the merchant's webpage  which displays this product.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public MerchantProductResponse imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * A URL at which an image of this product  can be found.
   * @return imageUrl
  **/
  @ApiModelProperty(value = "A URL at which an image of this product  can be found.")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public MerchantProductResponse extraImageUrl1(String extraImageUrl1) {
    this.extraImageUrl1 = extraImageUrl1;
    return this;
  }

   /**
   * Url to an additional image of product (1)
   * @return extraImageUrl1
  **/
  @ApiModelProperty(value = "Url to an additional image of product (1)")
  public String getExtraImageUrl1() {
    return extraImageUrl1;
  }

  public void setExtraImageUrl1(String extraImageUrl1) {
    this.extraImageUrl1 = extraImageUrl1;
  }

  public MerchantProductResponse extraImageUrl2(String extraImageUrl2) {
    this.extraImageUrl2 = extraImageUrl2;
    return this;
  }

   /**
   * Url to an additional image of product (2)
   * @return extraImageUrl2
  **/
  @ApiModelProperty(value = "Url to an additional image of product (2)")
  public String getExtraImageUrl2() {
    return extraImageUrl2;
  }

  public void setExtraImageUrl2(String extraImageUrl2) {
    this.extraImageUrl2 = extraImageUrl2;
  }

  public MerchantProductResponse extraImageUrl3(String extraImageUrl3) {
    this.extraImageUrl3 = extraImageUrl3;
    return this;
  }

   /**
   * Url to an additional image of product (3)
   * @return extraImageUrl3
  **/
  @ApiModelProperty(value = "Url to an additional image of product (3)")
  public String getExtraImageUrl3() {
    return extraImageUrl3;
  }

  public void setExtraImageUrl3(String extraImageUrl3) {
    this.extraImageUrl3 = extraImageUrl3;
  }

  public MerchantProductResponse extraImageUrl4(String extraImageUrl4) {
    this.extraImageUrl4 = extraImageUrl4;
    return this;
  }

   /**
   * Url to an additional image of product (4)
   * @return extraImageUrl4
  **/
  @ApiModelProperty(value = "Url to an additional image of product (4)")
  public String getExtraImageUrl4() {
    return extraImageUrl4;
  }

  public void setExtraImageUrl4(String extraImageUrl4) {
    this.extraImageUrl4 = extraImageUrl4;
  }

  public MerchantProductResponse extraImageUrl5(String extraImageUrl5) {
    this.extraImageUrl5 = extraImageUrl5;
    return this;
  }

   /**
   * Url to an additional image of product (5)
   * @return extraImageUrl5
  **/
  @ApiModelProperty(value = "Url to an additional image of product (5)")
  public String getExtraImageUrl5() {
    return extraImageUrl5;
  }

  public void setExtraImageUrl5(String extraImageUrl5) {
    this.extraImageUrl5 = extraImageUrl5;
  }

  public MerchantProductResponse extraImageUrl6(String extraImageUrl6) {
    this.extraImageUrl6 = extraImageUrl6;
    return this;
  }

   /**
   * Url to an additional image of product (6)
   * @return extraImageUrl6
  **/
  @ApiModelProperty(value = "Url to an additional image of product (6)")
  public String getExtraImageUrl6() {
    return extraImageUrl6;
  }

  public void setExtraImageUrl6(String extraImageUrl6) {
    this.extraImageUrl6 = extraImageUrl6;
  }

  public MerchantProductResponse extraImageUrl7(String extraImageUrl7) {
    this.extraImageUrl7 = extraImageUrl7;
    return this;
  }

   /**
   * Url to an additional image of product (7)
   * @return extraImageUrl7
  **/
  @ApiModelProperty(value = "Url to an additional image of product (7)")
  public String getExtraImageUrl7() {
    return extraImageUrl7;
  }

  public void setExtraImageUrl7(String extraImageUrl7) {
    this.extraImageUrl7 = extraImageUrl7;
  }

  public MerchantProductResponse extraImageUrl8(String extraImageUrl8) {
    this.extraImageUrl8 = extraImageUrl8;
    return this;
  }

   /**
   * Url to an additional image of product (8)
   * @return extraImageUrl8
  **/
  @ApiModelProperty(value = "Url to an additional image of product (8)")
  public String getExtraImageUrl8() {
    return extraImageUrl8;
  }

  public void setExtraImageUrl8(String extraImageUrl8) {
    this.extraImageUrl8 = extraImageUrl8;
  }

  public MerchantProductResponse extraImageUrl9(String extraImageUrl9) {
    this.extraImageUrl9 = extraImageUrl9;
    return this;
  }

   /**
   * Url to an additional image of product (9)
   * @return extraImageUrl9
  **/
  @ApiModelProperty(value = "Url to an additional image of product (9)")
  public String getExtraImageUrl9() {
    return extraImageUrl9;
  }

  public void setExtraImageUrl9(String extraImageUrl9) {
    this.extraImageUrl9 = extraImageUrl9;
  }

  public MerchantProductResponse categoryTrail(String categoryTrail) {
    this.categoryTrail = categoryTrail;
    return this;
  }

   /**
   * The category to which this product belongs.  Please supply this field in the following format:  &#39;maincategory &amp;gt; category &amp;gt; subcategory&#39;  For example:  &#39;vehicles &amp;gt; bikes &amp;gt; mountainbike&#39;
   * @return categoryTrail
  **/
  @ApiModelProperty(value = "The category to which this product belongs.  Please supply this field in the following format:  'maincategory &gt; category &gt; subcategory'  For example:  'vehicles &gt; bikes &gt; mountainbike'")
  public String getCategoryTrail() {
    return categoryTrail;
  }

  public void setCategoryTrail(String categoryTrail) {
    this.categoryTrail = categoryTrail;
  }

  public MerchantProductResponse extraData(List<ExtraDataItem> extraData) {
    this.extraData = extraData;
    return this;
  }

  public MerchantProductResponse addExtraDataItem(ExtraDataItem extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new ArrayList<ExtraDataItem>();
    }
    this.extraData.add(extraDataItem);
    return this;
  }

   /**
   * An optional list of key-value pairs containing  extra data about this product. This data can be  sent to channels or used for filtering products.
   * @return extraData
  **/
  @ApiModelProperty(value = "An optional list of key-value pairs containing  extra data about this product. This data can be  sent to channels or used for filtering products.")
  public List<ExtraDataItem> getExtraData() {
    return extraData;
  }

  public void setExtraData(List<ExtraDataItem> extraData) {
    this.extraData = extraData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantProductResponse merchantProductResponse = (MerchantProductResponse) o;
    return Objects.equals(this.isActive, merchantProductResponse.isActive) &&
        Objects.equals(this.merchantProductNo, merchantProductResponse.merchantProductNo) &&
        Objects.equals(this.name, merchantProductResponse.name) &&
        Objects.equals(this.description, merchantProductResponse.description) &&
        Objects.equals(this.brand, merchantProductResponse.brand) &&
        Objects.equals(this.size, merchantProductResponse.size) &&
        Objects.equals(this.color, merchantProductResponse.color) &&
        Objects.equals(this.ean, merchantProductResponse.ean) &&
        Objects.equals(this.manufacturerProductNumber, merchantProductResponse.manufacturerProductNumber) &&
        Objects.equals(this.stock, merchantProductResponse.stock) &&
        Objects.equals(this.price, merchantProductResponse.price) &&
        Objects.equals(this.MSRP, merchantProductResponse.MSRP) &&
        Objects.equals(this.purchasePrice, merchantProductResponse.purchasePrice) &&
        Objects.equals(this.vatRateType, merchantProductResponse.vatRateType) &&
        Objects.equals(this.shippingCost, merchantProductResponse.shippingCost) &&
        Objects.equals(this.shippingTime, merchantProductResponse.shippingTime) &&
        Objects.equals(this.url, merchantProductResponse.url) &&
        Objects.equals(this.imageUrl, merchantProductResponse.imageUrl) &&
        Objects.equals(this.extraImageUrl1, merchantProductResponse.extraImageUrl1) &&
        Objects.equals(this.extraImageUrl2, merchantProductResponse.extraImageUrl2) &&
        Objects.equals(this.extraImageUrl3, merchantProductResponse.extraImageUrl3) &&
        Objects.equals(this.extraImageUrl4, merchantProductResponse.extraImageUrl4) &&
        Objects.equals(this.extraImageUrl5, merchantProductResponse.extraImageUrl5) &&
        Objects.equals(this.extraImageUrl6, merchantProductResponse.extraImageUrl6) &&
        Objects.equals(this.extraImageUrl7, merchantProductResponse.extraImageUrl7) &&
        Objects.equals(this.extraImageUrl8, merchantProductResponse.extraImageUrl8) &&
        Objects.equals(this.extraImageUrl9, merchantProductResponse.extraImageUrl9) &&
        Objects.equals(this.categoryTrail, merchantProductResponse.categoryTrail) &&
        Objects.equals(this.extraData, merchantProductResponse.extraData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, merchantProductNo, name, description, brand, size, color, ean, manufacturerProductNumber, stock, price, MSRP, purchasePrice, vatRateType, shippingCost, shippingTime, url, imageUrl, extraImageUrl1, extraImageUrl2, extraImageUrl3, extraImageUrl4, extraImageUrl5, extraImageUrl6, extraImageUrl7, extraImageUrl8, extraImageUrl9, categoryTrail, extraData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProductResponse {\n");
    
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    manufacturerProductNumber: ").append(toIndentedString(manufacturerProductNumber)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    MSRP: ").append(toIndentedString(MSRP)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    vatRateType: ").append(toIndentedString(vatRateType)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    shippingTime: ").append(toIndentedString(shippingTime)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    extraImageUrl1: ").append(toIndentedString(extraImageUrl1)).append("\n");
    sb.append("    extraImageUrl2: ").append(toIndentedString(extraImageUrl2)).append("\n");
    sb.append("    extraImageUrl3: ").append(toIndentedString(extraImageUrl3)).append("\n");
    sb.append("    extraImageUrl4: ").append(toIndentedString(extraImageUrl4)).append("\n");
    sb.append("    extraImageUrl5: ").append(toIndentedString(extraImageUrl5)).append("\n");
    sb.append("    extraImageUrl6: ").append(toIndentedString(extraImageUrl6)).append("\n");
    sb.append("    extraImageUrl7: ").append(toIndentedString(extraImageUrl7)).append("\n");
    sb.append("    extraImageUrl8: ").append(toIndentedString(extraImageUrl8)).append("\n");
    sb.append("    extraImageUrl9: ").append(toIndentedString(extraImageUrl9)).append("\n");
    sb.append("    categoryTrail: ").append(toIndentedString(categoryTrail)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
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

