/*
 * Apache NiFi Registry REST API
 * The REST API provides an interface to a registry with operations for saving, versioning, reading NiFi flows and components.
 *
 * OpenAPI spec version: 1.19.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.asamoal.nifi_registry.swagger.client;

import com.github.asamoal.nifi_registry.swagger.ApiCallback;
import com.github.asamoal.nifi_registry.swagger.ApiClient;
import com.github.asamoal.nifi_registry.swagger.ApiException;
import com.github.asamoal.nifi_registry.swagger.ApiResponse;
import com.github.asamoal.nifi_registry.swagger.Configuration;
import com.github.asamoal.nifi_registry.swagger.Pair;
import com.github.asamoal.nifi_registry.swagger.ProgressRequestBody;
import com.github.asamoal.nifi_registry.swagger.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.asamoal.nifi_registry.swagger.client.model.RegistryConfiguration;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigApi {
    private ApiClient apiClient;

    public ConfigApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConfigApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getConfiguration
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getConfigurationCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/config";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getConfigurationValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getConfigurationCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get configration
     * Gets the NiFi Registry configurations.
     * @return RegistryConfiguration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RegistryConfiguration getConfiguration() throws ApiException {
        ApiResponse<RegistryConfiguration> resp = getConfigurationWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get configration
     * Gets the NiFi Registry configurations.
     * @return ApiResponse&lt;RegistryConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RegistryConfiguration> getConfigurationWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getConfigurationValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<RegistryConfiguration>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get configration (asynchronously)
     * Gets the NiFi Registry configurations.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getConfigurationAsync(final ApiCallback<RegistryConfiguration> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getConfigurationValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RegistryConfiguration>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
