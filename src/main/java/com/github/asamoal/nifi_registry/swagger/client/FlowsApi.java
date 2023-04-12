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


import com.github.asamoal.nifi_registry.swagger.client.model.Fields;
import com.github.asamoal.nifi_registry.swagger.client.model.VersionedFlow;
import com.github.asamoal.nifi_registry.swagger.client.model.VersionedFlowSnapshot;
import com.github.asamoal.nifi_registry.swagger.client.model.VersionedFlowSnapshotMetadata;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowsApi {
    private ApiClient apiClient;

    public FlowsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FlowsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAvailableFlowFields
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAvailableFlowFieldsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/flows/fields";

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
    private com.squareup.okhttp.Call getAvailableFlowFieldsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getAvailableFlowFieldsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get flow fields
     * Retrieves the flow field names that can be used for searching or sorting on flows.
     * @return Fields
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Fields getAvailableFlowFields() throws ApiException {
        ApiResponse<Fields> resp = getAvailableFlowFieldsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get flow fields
     * Retrieves the flow field names that can be used for searching or sorting on flows.
     * @return ApiResponse&lt;Fields&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Fields> getAvailableFlowFieldsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAvailableFlowFieldsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<Fields>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get flow fields (asynchronously)
     * Retrieves the flow field names that can be used for searching or sorting on flows.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAvailableFlowFieldsAsync(final ApiCallback<Fields> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAvailableFlowFieldsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Fields>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for globalGetFlow
     * @param flowId The flow identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call globalGetFlowCall(String flowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/flows/{flowId}"
            .replaceAll("\\{" + "flowId" + "\\}", apiClient.escapeString(flowId.toString()));

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
    private com.squareup.okhttp.Call globalGetFlowValidateBeforeCall(String flowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new ApiException("Missing the required parameter 'flowId' when calling globalGetFlow(Async)");
        }
        
        com.squareup.okhttp.Call call = globalGetFlowCall(flowId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get flow
     * Gets a flow by id.
     * @param flowId The flow identifier (required)
     * @return VersionedFlow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VersionedFlow globalGetFlow(String flowId) throws ApiException {
        ApiResponse<VersionedFlow> resp = globalGetFlowWithHttpInfo(flowId);
        return resp.getData();
    }

    /**
     * Get flow
     * Gets a flow by id.
     * @param flowId The flow identifier (required)
     * @return ApiResponse&lt;VersionedFlow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VersionedFlow> globalGetFlowWithHttpInfo(String flowId) throws ApiException {
        com.squareup.okhttp.Call call = globalGetFlowValidateBeforeCall(flowId, null, null);
        Type localVarReturnType = new TypeToken<VersionedFlow>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get flow (asynchronously)
     * Gets a flow by id.
     * @param flowId The flow identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call globalGetFlowAsync(String flowId, final ApiCallback<VersionedFlow> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = globalGetFlowValidateBeforeCall(flowId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VersionedFlow>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for globalGetFlowVersion
     * @param flowId The flow identifier (required)
     * @param versionNumber The version number (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call globalGetFlowVersionCall(String flowId, Integer versionNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/flows/{flowId}/versions/{versionNumber}"
            .replaceAll("\\{" + "flowId" + "\\}", apiClient.escapeString(flowId.toString()))
            .replaceAll("\\{" + "versionNumber" + "\\}", apiClient.escapeString(versionNumber.toString()));

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
    private com.squareup.okhttp.Call globalGetFlowVersionValidateBeforeCall(String flowId, Integer versionNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new ApiException("Missing the required parameter 'flowId' when calling globalGetFlowVersion(Async)");
        }
        // verify the required parameter 'versionNumber' is set
        if (versionNumber == null) {
            throw new ApiException("Missing the required parameter 'versionNumber' when calling globalGetFlowVersion(Async)");
        }
        
        com.squareup.okhttp.Call call = globalGetFlowVersionCall(flowId, versionNumber, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get flow version
     * Gets the given version of a flow, including metadata and flow content.
     * @param flowId The flow identifier (required)
     * @param versionNumber The version number (required)
     * @return VersionedFlowSnapshot
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VersionedFlowSnapshot globalGetFlowVersion(String flowId, Integer versionNumber) throws ApiException {
        ApiResponse<VersionedFlowSnapshot> resp = globalGetFlowVersionWithHttpInfo(flowId, versionNumber);
        return resp.getData();
    }

    /**
     * Get flow version
     * Gets the given version of a flow, including metadata and flow content.
     * @param flowId The flow identifier (required)
     * @param versionNumber The version number (required)
     * @return ApiResponse&lt;VersionedFlowSnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VersionedFlowSnapshot> globalGetFlowVersionWithHttpInfo(String flowId, Integer versionNumber) throws ApiException {
        com.squareup.okhttp.Call call = globalGetFlowVersionValidateBeforeCall(flowId, versionNumber, null, null);
        Type localVarReturnType = new TypeToken<VersionedFlowSnapshot>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get flow version (asynchronously)
     * Gets the given version of a flow, including metadata and flow content.
     * @param flowId The flow identifier (required)
     * @param versionNumber The version number (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call globalGetFlowVersionAsync(String flowId, Integer versionNumber, final ApiCallback<VersionedFlowSnapshot> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = globalGetFlowVersionValidateBeforeCall(flowId, versionNumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VersionedFlowSnapshot>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for globalGetFlowVersions
     * @param flowId The flow identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call globalGetFlowVersionsCall(String flowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/flows/{flowId}/versions"
            .replaceAll("\\{" + "flowId" + "\\}", apiClient.escapeString(flowId.toString()));

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
    private com.squareup.okhttp.Call globalGetFlowVersionsValidateBeforeCall(String flowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new ApiException("Missing the required parameter 'flowId' when calling globalGetFlowVersions(Async)");
        }
        
        com.squareup.okhttp.Call call = globalGetFlowVersionsCall(flowId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get flow versions
     * Gets summary information for all versions of a given flow. Versions are ordered newest-&gt;oldest.
     * @param flowId The flow identifier (required)
     * @return List&lt;VersionedFlowSnapshotMetadata&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<VersionedFlowSnapshotMetadata> globalGetFlowVersions(String flowId) throws ApiException {
        ApiResponse<List<VersionedFlowSnapshotMetadata>> resp = globalGetFlowVersionsWithHttpInfo(flowId);
        return resp.getData();
    }

    /**
     * Get flow versions
     * Gets summary information for all versions of a given flow. Versions are ordered newest-&gt;oldest.
     * @param flowId The flow identifier (required)
     * @return ApiResponse&lt;List&lt;VersionedFlowSnapshotMetadata&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<VersionedFlowSnapshotMetadata>> globalGetFlowVersionsWithHttpInfo(String flowId) throws ApiException {
        com.squareup.okhttp.Call call = globalGetFlowVersionsValidateBeforeCall(flowId, null, null);
        Type localVarReturnType = new TypeToken<List<VersionedFlowSnapshotMetadata>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get flow versions (asynchronously)
     * Gets summary information for all versions of a given flow. Versions are ordered newest-&gt;oldest.
     * @param flowId The flow identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call globalGetFlowVersionsAsync(String flowId, final ApiCallback<List<VersionedFlowSnapshotMetadata>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = globalGetFlowVersionsValidateBeforeCall(flowId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<VersionedFlowSnapshotMetadata>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for globalGetLatestFlowVersion
     * @param flowId The flow identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call globalGetLatestFlowVersionCall(String flowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/flows/{flowId}/versions/latest"
            .replaceAll("\\{" + "flowId" + "\\}", apiClient.escapeString(flowId.toString()));

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
    private com.squareup.okhttp.Call globalGetLatestFlowVersionValidateBeforeCall(String flowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new ApiException("Missing the required parameter 'flowId' when calling globalGetLatestFlowVersion(Async)");
        }
        
        com.squareup.okhttp.Call call = globalGetLatestFlowVersionCall(flowId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get latest flow version
     * Gets the latest version of a flow, including metadata and flow content.
     * @param flowId The flow identifier (required)
     * @return VersionedFlowSnapshot
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VersionedFlowSnapshot globalGetLatestFlowVersion(String flowId) throws ApiException {
        ApiResponse<VersionedFlowSnapshot> resp = globalGetLatestFlowVersionWithHttpInfo(flowId);
        return resp.getData();
    }

    /**
     * Get latest flow version
     * Gets the latest version of a flow, including metadata and flow content.
     * @param flowId The flow identifier (required)
     * @return ApiResponse&lt;VersionedFlowSnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VersionedFlowSnapshot> globalGetLatestFlowVersionWithHttpInfo(String flowId) throws ApiException {
        com.squareup.okhttp.Call call = globalGetLatestFlowVersionValidateBeforeCall(flowId, null, null);
        Type localVarReturnType = new TypeToken<VersionedFlowSnapshot>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get latest flow version (asynchronously)
     * Gets the latest version of a flow, including metadata and flow content.
     * @param flowId The flow identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call globalGetLatestFlowVersionAsync(String flowId, final ApiCallback<VersionedFlowSnapshot> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = globalGetLatestFlowVersionValidateBeforeCall(flowId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VersionedFlowSnapshot>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for globalGetLatestFlowVersionMetadata
     * @param flowId The flow identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call globalGetLatestFlowVersionMetadataCall(String flowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/flows/{flowId}/versions/latest/metadata"
            .replaceAll("\\{" + "flowId" + "\\}", apiClient.escapeString(flowId.toString()));

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
    private com.squareup.okhttp.Call globalGetLatestFlowVersionMetadataValidateBeforeCall(String flowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new ApiException("Missing the required parameter 'flowId' when calling globalGetLatestFlowVersionMetadata(Async)");
        }
        
        com.squareup.okhttp.Call call = globalGetLatestFlowVersionMetadataCall(flowId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get latest flow version metadata
     * Gets the metadata for the latest version of a flow.
     * @param flowId The flow identifier (required)
     * @return VersionedFlowSnapshotMetadata
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VersionedFlowSnapshotMetadata globalGetLatestFlowVersionMetadata(String flowId) throws ApiException {
        ApiResponse<VersionedFlowSnapshotMetadata> resp = globalGetLatestFlowVersionMetadataWithHttpInfo(flowId);
        return resp.getData();
    }

    /**
     * Get latest flow version metadata
     * Gets the metadata for the latest version of a flow.
     * @param flowId The flow identifier (required)
     * @return ApiResponse&lt;VersionedFlowSnapshotMetadata&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VersionedFlowSnapshotMetadata> globalGetLatestFlowVersionMetadataWithHttpInfo(String flowId) throws ApiException {
        com.squareup.okhttp.Call call = globalGetLatestFlowVersionMetadataValidateBeforeCall(flowId, null, null);
        Type localVarReturnType = new TypeToken<VersionedFlowSnapshotMetadata>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get latest flow version metadata (asynchronously)
     * Gets the metadata for the latest version of a flow.
     * @param flowId The flow identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call globalGetLatestFlowVersionMetadataAsync(String flowId, final ApiCallback<VersionedFlowSnapshotMetadata> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = globalGetLatestFlowVersionMetadataValidateBeforeCall(flowId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VersionedFlowSnapshotMetadata>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
