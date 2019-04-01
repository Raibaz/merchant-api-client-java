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


import com.channelengine.merchant.apiclient.model.CollectionOfMerchantStockLocationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockLocationApi {
    private ApiClient apiClient;

    public StockLocationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StockLocationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for stockLocationIndex
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call stockLocationIndexCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/stocklocations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call stockLocationIndexValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = stockLocationIndexCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get the stock locations (or virtual warehouses)
     * Get the different stock locations (or virtual warehouses) that are in use.  This may include stock locations for &#39;fulfillment by ... (Amazon/bol/CDiscount)&#39; (FBA/LVB/FBC) solutions.  You can use the id&#39;s to get to stock of products in specific stock location, e.g. the FBA stock for the products.
     * @return CollectionOfMerchantStockLocationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionOfMerchantStockLocationResponse stockLocationIndex() throws ApiException {
        ApiResponse<CollectionOfMerchantStockLocationResponse> resp = stockLocationIndexWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get the stock locations (or virtual warehouses)
     * Get the different stock locations (or virtual warehouses) that are in use.  This may include stock locations for &#39;fulfillment by ... (Amazon/bol/CDiscount)&#39; (FBA/LVB/FBC) solutions.  You can use the id&#39;s to get to stock of products in specific stock location, e.g. the FBA stock for the products.
     * @return ApiResponse&lt;CollectionOfMerchantStockLocationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CollectionOfMerchantStockLocationResponse> stockLocationIndexWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = stockLocationIndexValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantStockLocationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the stock locations (or virtual warehouses) (asynchronously)
     * Get the different stock locations (or virtual warehouses) that are in use.  This may include stock locations for &#39;fulfillment by ... (Amazon/bol/CDiscount)&#39; (FBA/LVB/FBC) solutions.  You can use the id&#39;s to get to stock of products in specific stock location, e.g. the FBA stock for the products.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call stockLocationIndexAsync(final ApiCallback<CollectionOfMerchantStockLocationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = stockLocationIndexValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantStockLocationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
