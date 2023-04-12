# FlowsApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailableFlowFields**](FlowsApi.md#getAvailableFlowFields) | **GET** /flows/fields | Get flow fields
[**globalGetFlow**](FlowsApi.md#globalGetFlow) | **GET** /flows/{flowId} | Get flow
[**globalGetFlowVersion**](FlowsApi.md#globalGetFlowVersion) | **GET** /flows/{flowId}/versions/{versionNumber} | Get flow version
[**globalGetFlowVersions**](FlowsApi.md#globalGetFlowVersions) | **GET** /flows/{flowId}/versions | Get flow versions
[**globalGetLatestFlowVersion**](FlowsApi.md#globalGetLatestFlowVersion) | **GET** /flows/{flowId}/versions/latest | Get latest flow version
[**globalGetLatestFlowVersionMetadata**](FlowsApi.md#globalGetLatestFlowVersionMetadata) | **GET** /flows/{flowId}/versions/latest/metadata | Get latest flow version metadata

<a name="getAvailableFlowFields"></a>
# **getAvailableFlowFields**
> Fields getAvailableFlowFields()

Get flow fields

Retrieves the flow field names that can be used for searching or sorting on flows.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
try {
    Fields result = apiInstance.getAvailableFlowFields();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getAvailableFlowFields");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Fields**](Fields.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalGetFlow"></a>
# **globalGetFlow**
> VersionedFlow globalGetFlow(flowId)

Get flow

Gets a flow by id.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String flowId = "flowId_example"; // String | The flow identifier
try {
    VersionedFlow result = apiInstance.globalGetFlow(flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#globalGetFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| The flow identifier |

### Return type

[**VersionedFlow**](VersionedFlow.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalGetFlowVersion"></a>
# **globalGetFlowVersion**
> VersionedFlowSnapshot globalGetFlowVersion(flowId, versionNumber)

Get flow version

Gets the given version of a flow, including metadata and flow content.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String flowId = "flowId_example"; // String | The flow identifier
Integer versionNumber = 56; // Integer | The version number
try {
    VersionedFlowSnapshot result = apiInstance.globalGetFlowVersion(flowId, versionNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#globalGetFlowVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| The flow identifier |
 **versionNumber** | **Integer**| The version number |

### Return type

[**VersionedFlowSnapshot**](VersionedFlowSnapshot.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalGetFlowVersions"></a>
# **globalGetFlowVersions**
> List&lt;VersionedFlowSnapshotMetadata&gt; globalGetFlowVersions(flowId)

Get flow versions

Gets summary information for all versions of a given flow. Versions are ordered newest-&gt;oldest.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String flowId = "flowId_example"; // String | The flow identifier
try {
    List<VersionedFlowSnapshotMetadata> result = apiInstance.globalGetFlowVersions(flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#globalGetFlowVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| The flow identifier |

### Return type

[**List&lt;VersionedFlowSnapshotMetadata&gt;**](VersionedFlowSnapshotMetadata.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalGetLatestFlowVersion"></a>
# **globalGetLatestFlowVersion**
> VersionedFlowSnapshot globalGetLatestFlowVersion(flowId)

Get latest flow version

Gets the latest version of a flow, including metadata and flow content.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String flowId = "flowId_example"; // String | The flow identifier
try {
    VersionedFlowSnapshot result = apiInstance.globalGetLatestFlowVersion(flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#globalGetLatestFlowVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| The flow identifier |

### Return type

[**VersionedFlowSnapshot**](VersionedFlowSnapshot.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalGetLatestFlowVersionMetadata"></a>
# **globalGetLatestFlowVersionMetadata**
> VersionedFlowSnapshotMetadata globalGetLatestFlowVersionMetadata(flowId)

Get latest flow version metadata

Gets the metadata for the latest version of a flow.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String flowId = "flowId_example"; // String | The flow identifier
try {
    VersionedFlowSnapshotMetadata result = apiInstance.globalGetLatestFlowVersionMetadata(flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#globalGetLatestFlowVersionMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | **String**| The flow identifier |

### Return type

[**VersionedFlowSnapshotMetadata**](VersionedFlowSnapshotMetadata.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

