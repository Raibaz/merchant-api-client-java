/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.api;

import com.channelengine.merchant.apiclient.ApiCallback;
import com.channelengine.merchant.apiclient.ApiClient;
import com.channelengine.merchant.apiclient.ApiException;
import com.channelengine.merchant.apiclient.ApiResponse;
import com.channelengine.merchant.apiclient.Configuration;
import com.channelengine.merchant.apiclient.Pair;
import com.channelengine.merchant.apiclient.ProgressRequestBody;
import com.channelengine.merchant.apiclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.channelengine.merchant.apiclient.model.CollectionOfMerchantOfferGetStockResponse;
import com.channelengine.merchant.apiclient.model.MerchantStockPriceUpdateRequest;
import com.channelengine.merchant.apiclient.model.SingleOfDictionaryOfStringAndListOfString;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfferApi {
    private ApiClient localVarApiClient;

    public OfferApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OfferApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for offerGetStock
     * @param skus List of your products&#39; sku&#39;s. (required)
     * @param stockLocationIds The ChannelEngine id of the stock location(s). (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call offerGetStockCall(List<String> skus, List<Integer> stockLocationIds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/offer/stock";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (skus != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "skus", skus));
        }

        if (stockLocationIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "stockLocationIds", stockLocationIds));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call offerGetStockValidateBeforeCall(List<String> skus, List<Integer> stockLocationIds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'skus' is set
        if (skus == null) {
            throw new ApiException("Missing the required parameter 'skus' when calling offerGetStock(Async)");
        }
        
        // verify the required parameter 'stockLocationIds' is set
        if (stockLocationIds == null) {
            throw new ApiException("Missing the required parameter 'stockLocationIds' when calling offerGetStock(Async)");
        }
        

        okhttp3.Call localVarCall = offerGetStockCall(skus, stockLocationIds, _callback);
        return localVarCall;

    }

    /**
     * Get stock for products.
     * Get stock of products at stock location(s).
     * @param skus List of your products&#39; sku&#39;s. (required)
     * @param stockLocationIds The ChannelEngine id of the stock location(s). (required)
     * @return CollectionOfMerchantOfferGetStockResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CollectionOfMerchantOfferGetStockResponse offerGetStock(List<String> skus, List<Integer> stockLocationIds) throws ApiException {
        ApiResponse<CollectionOfMerchantOfferGetStockResponse> localVarResp = offerGetStockWithHttpInfo(skus, stockLocationIds);
        return localVarResp.getData();
    }

    /**
     * Get stock for products.
     * Get stock of products at stock location(s).
     * @param skus List of your products&#39; sku&#39;s. (required)
     * @param stockLocationIds The ChannelEngine id of the stock location(s). (required)
     * @return ApiResponse&lt;CollectionOfMerchantOfferGetStockResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CollectionOfMerchantOfferGetStockResponse> offerGetStockWithHttpInfo(List<String> skus, List<Integer> stockLocationIds) throws ApiException {
        okhttp3.Call localVarCall = offerGetStockValidateBeforeCall(skus, stockLocationIds, null);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantOfferGetStockResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get stock for products. (asynchronously)
     * Get stock of products at stock location(s).
     * @param skus List of your products&#39; sku&#39;s. (required)
     * @param stockLocationIds The ChannelEngine id of the stock location(s). (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call offerGetStockAsync(List<String> skus, List<Integer> stockLocationIds, final ApiCallback<CollectionOfMerchantOfferGetStockResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = offerGetStockValidateBeforeCall(skus, stockLocationIds, _callback);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantOfferGetStockResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for offerStockPriceUpdate
     * @param merchantStockPriceUpdateRequest References to the products that should be updated, and the new values&lt;br /&gt;for the stock or price fields. It is possible to supply only one of the two fields&lt;br /&gt;or both. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call offerStockPriceUpdateCall(List<MerchantStockPriceUpdateRequest> merchantStockPriceUpdateRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = merchantStockPriceUpdateRequest;

        // create path and map variables
        String localVarPath = "/v2/offer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call offerStockPriceUpdateValidateBeforeCall(List<MerchantStockPriceUpdateRequest> merchantStockPriceUpdateRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = offerStockPriceUpdateCall(merchantStockPriceUpdateRequest, _callback);
        return localVarCall;

    }

    /**
     * Update stock or price.
     * 
     * @param merchantStockPriceUpdateRequest References to the products that should be updated, and the new values&lt;br /&gt;for the stock or price fields. It is possible to supply only one of the two fields&lt;br /&gt;or both. (optional)
     * @return SingleOfDictionaryOfStringAndListOfString
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public SingleOfDictionaryOfStringAndListOfString offerStockPriceUpdate(List<MerchantStockPriceUpdateRequest> merchantStockPriceUpdateRequest) throws ApiException {
        ApiResponse<SingleOfDictionaryOfStringAndListOfString> localVarResp = offerStockPriceUpdateWithHttpInfo(merchantStockPriceUpdateRequest);
        return localVarResp.getData();
    }

    /**
     * Update stock or price.
     * 
     * @param merchantStockPriceUpdateRequest References to the products that should be updated, and the new values&lt;br /&gt;for the stock or price fields. It is possible to supply only one of the two fields&lt;br /&gt;or both. (optional)
     * @return ApiResponse&lt;SingleOfDictionaryOfStringAndListOfString&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SingleOfDictionaryOfStringAndListOfString> offerStockPriceUpdateWithHttpInfo(List<MerchantStockPriceUpdateRequest> merchantStockPriceUpdateRequest) throws ApiException {
        okhttp3.Call localVarCall = offerStockPriceUpdateValidateBeforeCall(merchantStockPriceUpdateRequest, null);
        Type localVarReturnType = new TypeToken<SingleOfDictionaryOfStringAndListOfString>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update stock or price. (asynchronously)
     * 
     * @param merchantStockPriceUpdateRequest References to the products that should be updated, and the new values&lt;br /&gt;for the stock or price fields. It is possible to supply only one of the two fields&lt;br /&gt;or both. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call offerStockPriceUpdateAsync(List<MerchantStockPriceUpdateRequest> merchantStockPriceUpdateRequest, final ApiCallback<SingleOfDictionaryOfStringAndListOfString> _callback) throws ApiException {

        okhttp3.Call localVarCall = offerStockPriceUpdateValidateBeforeCall(merchantStockPriceUpdateRequest, _callback);
        Type localVarReturnType = new TypeToken<SingleOfDictionaryOfStringAndListOfString>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
