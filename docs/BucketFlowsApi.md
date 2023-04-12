# BucketFlowsApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFlow**](BucketFlowsApi.md#createFlow) | **POST** /buckets/{bucketId}/flows | Create flow
[**createFlowVersion**](BucketFlowsApi.md#createFlowVersion) | **POST** /buckets/{bucketId}/flows/{flowId}/versions | Create flow version
[**deleteFlow**](BucketFlowsApi.md#deleteFlow) | **DELETE** /buckets/{bucketId}/flows/{flowId} | Delete bucket flow
[**exportVersionedFlow**](BucketFlowsApi.md#exportVersionedFlow) | **GET** /buckets/{bucketId}/flows/{flowId}/versions/{versionNumber}/export | Exports specified bucket flow version content
[**getFlow**](BucketFlowsApi.md#getFlow) | **GET** /buckets/{bucketId}/flows/{flowId} | Get bucket flow
[**getFlowDiff**](BucketFlowsApi.md#getFlowDiff) | **GET** /buckets/{bucketId}/flows/{flowId}/diff/{versionA}/{versionB} | Get bucket flow diff
[**getFlowVersion**](BucketFlowsApi.md#getFlowVersion) | **GET** /buckets/{bucketId}/flows/{flowId}/versions/{versionNumber} | Get bucket flow version
[**getFlowVersions**](BucketFlowsApi.md#getFlowVersions) | **GET** /buckets/{bucketId}/flows/{flowId}/versions | Get bucket flow versions
[**getFlows**](BucketFlowsApi.md#getFlows) | **GET** /buckets/{bucketId}/flows | Get bucket flows
[**getLatestFlowVersion**](BucketFlowsApi.md#getLatestFlowVersion) | **GET** /buckets/{bucketId}/flows/{flowId}/versions/latest | Get latest bucket flow version content
[**getLatestFlowVersionMetadata**](BucketFlowsApi.md#getLatestFlowVersionMetadata) | **GET** /buckets/{bucketId}/flows/{flowId}/versions/latest/metadata | Get latest bucket flow version metadata
[**importVersionedFlow**](BucketFlowsApi.md#importVersionedFlow) | **POST** /buckets/{bucketId}/flows/{flowId}/versions/import | Import flow version
[**updateFlow**](BucketFlowsApi.md#updateFlow) | **PUT** /buckets/{bucketId}/flows/{flowId} | Update bucket flow

<a name="createFlow"></a>
# **createFlow**
> VersionedFlow createFlow(body, bucketId)

Create flow

Creates a flow in the given bucket. The flow id is created by the server and populated in the returned entity.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
VersionedFlow body = new VersionedFlow(); // VersionedFlow | The details of the flow to create.
String bucketId = "bucketId_example"; // String | The bucket identifier
try {
    VersionedFlow result = apiInstance.createFlow(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#createFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VersionedFlow**](VersionedFlow.md)| The details of the flow to create. |
 **bucketId** | **String**| The bucket identifier |

### Return type

[**VersionedFlow**](VersionedFlow.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFlowVersion"></a>
# **createFlowVersion**
> VersionedFlowSnapshot createFlowVersion(body, bucketId, flowId)

Create flow version

Creates the next version of a flow. The version number of the object being created must be the next available version integer. Flow versions are immutable after they are created.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
VersionedFlowSnapshot body = new VersionedFlowSnapshot(); // VersionedFlowSnapshot | The new versioned flow snapshot.
String bucketId = "bucketId_example"; // String | The bucket identifier
String flowId = "flowId_example"; // String | The flow identifier
try {
    VersionedFlowSnapshot result = apiInstance.createFlowVersion(body, bucketId, flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#createFlowVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VersionedFlowSnapshot**](VersionedFlowSnapshot.md)| The new versioned flow snapshot. |
 **bucketId** | **String**| The bucket identifier |
 **flowId** | **String**| The flow identifier |

### Return type

[**VersionedFlowSnapshot**](VersionedFlowSnapshot.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="deleteFlow"></a>
# **deleteFlow**
> VersionedFlow deleteFlow(version, bucketId, flowId, clientId)

Delete bucket flow

Deletes a flow, including all saved versions of that flow.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
String version = "version_example"; // String | The version is used to verify the client is working with the latest version of the entity.
String bucketId = "bucketId_example"; // String | The bucket identifier
String flowId = "flowId_example"; // String | The flow identifier
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    VersionedFlow result = apiInstance.deleteFlow(version, bucketId, flowId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#deleteFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The version is used to verify the client is working with the latest version of the entity. |
 **bucketId** | **String**| The bucket identifier |
 **flowId** | **String**| The flow identifier |
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**VersionedFlow**](VersionedFlow.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="exportVersionedFlow"></a>
# **exportVersionedFlow**
> VersionedFlowSnapshot exportVersionedFlow(bucketId, flowId, versionNumber)

Exports specified bucket flow version content

Exports the specified version of a flow, including the metadata and content of the flow.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
String flowId = "flowId_example"; // String | The flow identifier
Integer versionNumber = 56; // Integer | The version number
try {
    VersionedFlowSnapshot result = apiInstance.exportVersionedFlow(bucketId, flowId, versionNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#exportVersionedFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |
 **flowId** | **String**| The flow identifier |
 **versionNumber** | **Integer**| The version number |

### Return type

[**VersionedFlowSnapshot**](VersionedFlowSnapshot.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlow"></a>
# **getFlow**
> VersionedFlow getFlow(bucketId, flowId)

Get bucket flow

Retrieves the flow with the given id in the given bucket.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
String flowId = "flowId_example"; // String | The flow identifier
try {
    VersionedFlow result = apiInstance.getFlow(bucketId, flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#getFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |
 **flowId** | **String**| The flow identifier |

### Return type

[**VersionedFlow**](VersionedFlow.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowDiff"></a>
# **getFlowDiff**
> VersionedFlowDifference getFlowDiff(bucketId, flowId, versionA, versionB)

Get bucket flow diff

Computes the differences between two given versions of a flow.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
String flowId = "flowId_example"; // String | The flow identifier
Integer versionA = 56; // Integer | The first version number
Integer versionB = 56; // Integer | The second version number
try {
    VersionedFlowDifference result = apiInstance.getFlowDiff(bucketId, flowId, versionA, versionB);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#getFlowDiff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |
 **flowId** | **String**| The flow identifier |
 **versionA** | **Integer**| The first version number |
 **versionB** | **Integer**| The second version number |

### Return type

[**VersionedFlowDifference**](VersionedFlowDifference.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowVersion"></a>
# **getFlowVersion**
> VersionedFlowSnapshot getFlowVersion(bucketId, flowId, versionNumber)

Get bucket flow version

Gets the given version of a flow, including the metadata and content for the version.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
String flowId = "flowId_example"; // String | The flow identifier
Integer versionNumber = 56; // Integer | The version number
try {
    VersionedFlowSnapshot result = apiInstance.getFlowVersion(bucketId, flowId, versionNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#getFlowVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |
 **flowId** | **String**| The flow identifier |
 **versionNumber** | **Integer**| The version number |

### Return type

[**VersionedFlowSnapshot**](VersionedFlowSnapshot.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowVersions"></a>
# **getFlowVersions**
> List&lt;VersionedFlowSnapshotMetadata&gt; getFlowVersions(bucketId, flowId)

Get bucket flow versions

Gets summary information for all versions of a flow. Versions are ordered newest-&gt;oldest.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
String flowId = "flowId_example"; // String | The flow identifier
try {
    List<VersionedFlowSnapshotMetadata> result = apiInstance.getFlowVersions(bucketId, flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#getFlowVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |
 **flowId** | **String**| The flow identifier |

### Return type

[**List&lt;VersionedFlowSnapshotMetadata&gt;**](VersionedFlowSnapshotMetadata.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlows"></a>
# **getFlows**
> List&lt;VersionedFlow&gt; getFlows(bucketId)

Get bucket flows

Retrieves all flows in the given bucket.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
try {
    List<VersionedFlow> result = apiInstance.getFlows(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#getFlows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |

### Return type

[**List&lt;VersionedFlow&gt;**](VersionedFlow.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLatestFlowVersion"></a>
# **getLatestFlowVersion**
> VersionedFlowSnapshot getLatestFlowVersion(bucketId, flowId)

Get latest bucket flow version content

Gets the latest version of a flow, including the metadata and content of the flow.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
String flowId = "flowId_example"; // String | The flow identifier
try {
    VersionedFlowSnapshot result = apiInstance.getLatestFlowVersion(bucketId, flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#getLatestFlowVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |
 **flowId** | **String**| The flow identifier |

### Return type

[**VersionedFlowSnapshot**](VersionedFlowSnapshot.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLatestFlowVersionMetadata"></a>
# **getLatestFlowVersionMetadata**
> VersionedFlowSnapshotMetadata getLatestFlowVersionMetadata(bucketId, flowId)

Get latest bucket flow version metadata

Gets the metadata for the latest version of a flow.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
String flowId = "flowId_example"; // String | The flow identifier
try {
    VersionedFlowSnapshotMetadata result = apiInstance.getLatestFlowVersionMetadata(bucketId, flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#getLatestFlowVersionMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |
 **flowId** | **String**| The flow identifier |

### Return type

[**VersionedFlowSnapshotMetadata**](VersionedFlowSnapshotMetadata.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importVersionedFlow"></a>
# **importVersionedFlow**
> VersionedFlowSnapshot importVersionedFlow(bucketId, flowId, body, comments)

Import flow version

Import the next version of a flow. The version number of the object being created will be the next available version integer. Flow versions are immutable after they are created.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
String flowId = "flowId_example"; // String | The flow identifier
VersionedFlowSnapshot body = new VersionedFlowSnapshot(); // VersionedFlowSnapshot | file
String comments = "comments_example"; // String | 
try {
    VersionedFlowSnapshot result = apiInstance.importVersionedFlow(bucketId, flowId, body, comments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#importVersionedFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |
 **flowId** | **String**| The flow identifier |
 **body** | [**VersionedFlowSnapshot**](VersionedFlowSnapshot.md)| file | [optional]
 **comments** | **String**|  | [optional]

### Return type

[**VersionedFlowSnapshot**](VersionedFlowSnapshot.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFlow"></a>
# **updateFlow**
> VersionedFlow updateFlow(body, bucketId, flowId)

Update bucket flow

Updates the flow with the given id in the given bucket.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketFlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketFlowsApi apiInstance = new BucketFlowsApi();
VersionedFlow body = new VersionedFlow(); // VersionedFlow | The updated flow
String bucketId = "bucketId_example"; // String | The bucket identifier
String flowId = "flowId_example"; // String | The flow identifier
try {
    VersionedFlow result = apiInstance.updateFlow(body, bucketId, flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketFlowsApi#updateFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VersionedFlow**](VersionedFlow.md)| The updated flow |
 **bucketId** | **String**| The bucket identifier |
 **flowId** | **String**| The flow identifier |

### Return type

[**VersionedFlow**](VersionedFlow.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

