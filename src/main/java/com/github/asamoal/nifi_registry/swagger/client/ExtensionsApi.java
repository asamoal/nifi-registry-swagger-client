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


import com.github.asamoal.nifi_registry.swagger.client.model.ExtensionMetadataContainer;
import com.github.asamoal.nifi_registry.swagger.client.model.TagCount;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtensionsApi {
    private ApiClient apiClient;

    public ExtensionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExtensionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getExtensions
     * @param bundleType The type of bundles to return (optional)
     * @param extensionType The type of extensions to return (optional)
     * @param tag The tags to filter on, will be used in an OR statement (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getExtensionsCall(String bundleType, String extensionType, List<String> tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/extensions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (bundleType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("bundleType", bundleType));
        if (extensionType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("extensionType", extensionType));
        if (tag != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "tag", tag));

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
    private com.squareup.okhttp.Call getExtensionsValidateBeforeCall(String bundleType, String extensionType, List<String> tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getExtensionsCall(bundleType, extensionType, tag, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all extensions
     * Gets the metadata for all extensions that match the filter params and are part of bundles located in buckets the current user is authorized for. If the user is not authorized to any buckets, an empty result set will be returned.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     * @param bundleType The type of bundles to return (optional)
     * @param extensionType The type of extensions to return (optional)
     * @param tag The tags to filter on, will be used in an OR statement (optional)
     * @return ExtensionMetadataContainer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExtensionMetadataContainer getExtensions(String bundleType, String extensionType, List<String> tag) throws ApiException {
        ApiResponse<ExtensionMetadataContainer> resp = getExtensionsWithHttpInfo(bundleType, extensionType, tag);
        return resp.getData();
    }

    /**
     * Get all extensions
     * Gets the metadata for all extensions that match the filter params and are part of bundles located in buckets the current user is authorized for. If the user is not authorized to any buckets, an empty result set will be returned.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     * @param bundleType The type of bundles to return (optional)
     * @param extensionType The type of extensions to return (optional)
     * @param tag The tags to filter on, will be used in an OR statement (optional)
     * @return ApiResponse&lt;ExtensionMetadataContainer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExtensionMetadataContainer> getExtensionsWithHttpInfo(String bundleType, String extensionType, List<String> tag) throws ApiException {
        com.squareup.okhttp.Call call = getExtensionsValidateBeforeCall(bundleType, extensionType, tag, null, null);
        Type localVarReturnType = new TypeToken<ExtensionMetadataContainer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all extensions (asynchronously)
     * Gets the metadata for all extensions that match the filter params and are part of bundles located in buckets the current user is authorized for. If the user is not authorized to any buckets, an empty result set will be returned.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     * @param bundleType The type of bundles to return (optional)
     * @param extensionType The type of extensions to return (optional)
     * @param tag The tags to filter on, will be used in an OR statement (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getExtensionsAsync(String bundleType, String extensionType, List<String> tag, final ApiCallback<ExtensionMetadataContainer> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getExtensionsValidateBeforeCall(bundleType, extensionType, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExtensionMetadataContainer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getExtensionsProvidingServiceAPI
     * @param className The name of the service API class (required)
     * @param groupId The groupId of the bundle containing the service API class (required)
     * @param artifactId The artifactId of the bundle containing the service API class (required)
     * @param version The version of the bundle containing the service API class (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getExtensionsProvidingServiceAPICall(String className, String groupId, String artifactId, String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/extensions/provided-service-api";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (className != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("className", className));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("groupId", groupId));
        if (artifactId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("artifactId", artifactId));
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("version", version));

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
    private com.squareup.okhttp.Call getExtensionsProvidingServiceAPIValidateBeforeCall(String className, String groupId, String artifactId, String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new ApiException("Missing the required parameter 'className' when calling getExtensionsProvidingServiceAPI(Async)");
        }
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getExtensionsProvidingServiceAPI(Async)");
        }
        // verify the required parameter 'artifactId' is set
        if (artifactId == null) {
            throw new ApiException("Missing the required parameter 'artifactId' when calling getExtensionsProvidingServiceAPI(Async)");
        }
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getExtensionsProvidingServiceAPI(Async)");
        }
        
        com.squareup.okhttp.Call call = getExtensionsProvidingServiceAPICall(className, groupId, artifactId, version, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get extensions providing service API
     * Gets the metadata for extensions that provide the specified API and are part of bundles located in buckets the current user is authorized for. If the user is not authorized to any buckets, an empty result set will be returned.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     * @param className The name of the service API class (required)
     * @param groupId The groupId of the bundle containing the service API class (required)
     * @param artifactId The artifactId of the bundle containing the service API class (required)
     * @param version The version of the bundle containing the service API class (required)
     * @return ExtensionMetadataContainer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExtensionMetadataContainer getExtensionsProvidingServiceAPI(String className, String groupId, String artifactId, String version) throws ApiException {
        ApiResponse<ExtensionMetadataContainer> resp = getExtensionsProvidingServiceAPIWithHttpInfo(className, groupId, artifactId, version);
        return resp.getData();
    }

    /**
     * Get extensions providing service API
     * Gets the metadata for extensions that provide the specified API and are part of bundles located in buckets the current user is authorized for. If the user is not authorized to any buckets, an empty result set will be returned.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     * @param className The name of the service API class (required)
     * @param groupId The groupId of the bundle containing the service API class (required)
     * @param artifactId The artifactId of the bundle containing the service API class (required)
     * @param version The version of the bundle containing the service API class (required)
     * @return ApiResponse&lt;ExtensionMetadataContainer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExtensionMetadataContainer> getExtensionsProvidingServiceAPIWithHttpInfo(String className, String groupId, String artifactId, String version) throws ApiException {
        com.squareup.okhttp.Call call = getExtensionsProvidingServiceAPIValidateBeforeCall(className, groupId, artifactId, version, null, null);
        Type localVarReturnType = new TypeToken<ExtensionMetadataContainer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get extensions providing service API (asynchronously)
     * Gets the metadata for extensions that provide the specified API and are part of bundles located in buckets the current user is authorized for. If the user is not authorized to any buckets, an empty result set will be returned.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     * @param className The name of the service API class (required)
     * @param groupId The groupId of the bundle containing the service API class (required)
     * @param artifactId The artifactId of the bundle containing the service API class (required)
     * @param version The version of the bundle containing the service API class (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getExtensionsProvidingServiceAPIAsync(String className, String groupId, String artifactId, String version, final ApiCallback<ExtensionMetadataContainer> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getExtensionsProvidingServiceAPIValidateBeforeCall(className, groupId, artifactId, version, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExtensionMetadataContainer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTags
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTagsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/extensions/tags";

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
    private com.squareup.okhttp.Call getTagsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getTagsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get extension tags
     * Gets all the extension tags known to this NiFi Registry instance, along with the number of extensions that have the given tag.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     * @return List&lt;TagCount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TagCount> getTags() throws ApiException {
        ApiResponse<List<TagCount>> resp = getTagsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get extension tags
     * Gets all the extension tags known to this NiFi Registry instance, along with the number of extensions that have the given tag.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     * @return ApiResponse&lt;List&lt;TagCount&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TagCount>> getTagsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getTagsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<TagCount>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get extension tags (asynchronously)
     * Gets all the extension tags known to this NiFi Registry instance, along with the number of extensions that have the given tag.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTagsAsync(final ApiCallback<List<TagCount>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTagsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TagCount>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}