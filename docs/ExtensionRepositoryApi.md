# ExtensionRepositoryApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExtensionRepoArtifacts**](ExtensionRepositoryApi.md#getExtensionRepoArtifacts) | **GET** /extension-repository/{bucketName}/{groupId} | Get extension repo artifacts
[**getExtensionRepoBuckets**](ExtensionRepositoryApi.md#getExtensionRepoBuckets) | **GET** /extension-repository | Get extension repo buckets
[**getExtensionRepoGroups**](ExtensionRepositoryApi.md#getExtensionRepoGroups) | **GET** /extension-repository/{bucketName} | Get extension repo groups
[**getExtensionRepoVersion**](ExtensionRepositoryApi.md#getExtensionRepoVersion) | **GET** /extension-repository/{bucketName}/{groupId}/{artifactId}/{version} | Get extension repo version
[**getExtensionRepoVersionContent**](ExtensionRepositoryApi.md#getExtensionRepoVersionContent) | **GET** /extension-repository/{bucketName}/{groupId}/{artifactId}/{version}/content | Get extension repo version content
[**getExtensionRepoVersionExtension**](ExtensionRepositoryApi.md#getExtensionRepoVersionExtension) | **GET** /extension-repository/{bucketName}/{groupId}/{artifactId}/{version}/extensions/{name} | Get extension repo extension
[**getExtensionRepoVersionExtensionAdditionalDetailsDocs**](ExtensionRepositoryApi.md#getExtensionRepoVersionExtensionAdditionalDetailsDocs) | **GET** /extension-repository/{bucketName}/{groupId}/{artifactId}/{version}/extensions/{name}/docs/additional-details | Get extension repo extension details
[**getExtensionRepoVersionExtensionDocs**](ExtensionRepositoryApi.md#getExtensionRepoVersionExtensionDocs) | **GET** /extension-repository/{bucketName}/{groupId}/{artifactId}/{version}/extensions/{name}/docs | Get extension repo extension docs
[**getExtensionRepoVersionExtensions**](ExtensionRepositoryApi.md#getExtensionRepoVersionExtensions) | **GET** /extension-repository/{bucketName}/{groupId}/{artifactId}/{version}/extensions | Get extension repo extensions
[**getExtensionRepoVersionSha256**](ExtensionRepositoryApi.md#getExtensionRepoVersionSha256) | **GET** /extension-repository/{bucketName}/{groupId}/{artifactId}/{version}/sha256 | Get extension repo version checksum
[**getExtensionRepoVersions**](ExtensionRepositoryApi.md#getExtensionRepoVersions) | **GET** /extension-repository/{bucketName}/{groupId}/{artifactId} | Get extension repo versions
[**getGlobalExtensionRepoVersionSha256**](ExtensionRepositoryApi.md#getGlobalExtensionRepoVersionSha256) | **GET** /extension-repository/{groupId}/{artifactId}/{version}/sha256 | Get global extension repo version checksum

<a name="getExtensionRepoArtifacts"></a>
# **getExtensionRepoArtifacts**
> List&lt;ExtensionRepoArtifact&gt; getExtensionRepoArtifacts(bucketName, groupId)

Get extension repo artifacts

Gets the artifacts in the extension repository in the given bucket and group.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
String bucketName = "bucketName_example"; // String | The bucket name
String groupId = "groupId_example"; // String | The group id
try {
    List<ExtensionRepoArtifact> result = apiInstance.getExtensionRepoArtifacts(bucketName, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getExtensionRepoArtifacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| The bucket name |
 **groupId** | **String**| The group id |

### Return type

[**List&lt;ExtensionRepoArtifact&gt;**](ExtensionRepoArtifact.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExtensionRepoBuckets"></a>
# **getExtensionRepoBuckets**
> List&lt;ExtensionRepoBucket&gt; getExtensionRepoBuckets()

Get extension repo buckets

Gets the names of the buckets the current user is authorized for in order to browse the repo by bucket.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
try {
    List<ExtensionRepoBucket> result = apiInstance.getExtensionRepoBuckets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getExtensionRepoBuckets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ExtensionRepoBucket&gt;**](ExtensionRepoBucket.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExtensionRepoGroups"></a>
# **getExtensionRepoGroups**
> List&lt;ExtensionRepoGroup&gt; getExtensionRepoGroups(bucketName)

Get extension repo groups

Gets the groups in the extension repository in the given bucket.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
String bucketName = "bucketName_example"; // String | The bucket name
try {
    List<ExtensionRepoGroup> result = apiInstance.getExtensionRepoGroups(bucketName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getExtensionRepoGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| The bucket name |

### Return type

[**List&lt;ExtensionRepoGroup&gt;**](ExtensionRepoGroup.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExtensionRepoVersion"></a>
# **getExtensionRepoVersion**
> ExtensionRepoVersion getExtensionRepoVersion(bucketName, groupId, artifactId, version)

Get extension repo version

Gets information about the version in the given bucket, group, and artifact.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
String bucketName = "bucketName_example"; // String | The bucket name
String groupId = "groupId_example"; // String | The group identifier
String artifactId = "artifactId_example"; // String | The artifact identifier
String version = "version_example"; // String | The version
try {
    ExtensionRepoVersion result = apiInstance.getExtensionRepoVersion(bucketName, groupId, artifactId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getExtensionRepoVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| The bucket name |
 **groupId** | **String**| The group identifier |
 **artifactId** | **String**| The artifact identifier |
 **version** | **String**| The version |

### Return type

[**ExtensionRepoVersion**](ExtensionRepoVersion.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExtensionRepoVersionContent"></a>
# **getExtensionRepoVersionContent**
> List&lt;byte[]&gt; getExtensionRepoVersionContent(bucketName, groupId, artifactId, version)

Get extension repo version content

Gets the binary content of the bundle with the given bucket, group, artifact, and version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
String bucketName = "bucketName_example"; // String | The bucket name
String groupId = "groupId_example"; // String | The group identifier
String artifactId = "artifactId_example"; // String | The artifact identifier
String version = "version_example"; // String | The version
try {
    List<byte[]> result = apiInstance.getExtensionRepoVersionContent(bucketName, groupId, artifactId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getExtensionRepoVersionContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| The bucket name |
 **groupId** | **String**| The group identifier |
 **artifactId** | **String**| The artifact identifier |
 **version** | **String**| The version |

### Return type

**List&lt;byte[]&gt;**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getExtensionRepoVersionExtension"></a>
# **getExtensionRepoVersionExtension**
> Extension getExtensionRepoVersionExtension(bucketName, groupId, artifactId, version, name)

Get extension repo extension

Gets information about the extension with the given name in the given bucket, group, artifact, and version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
String bucketName = "bucketName_example"; // String | The bucket name
String groupId = "groupId_example"; // String | The group identifier
String artifactId = "artifactId_example"; // String | The artifact identifier
String version = "version_example"; // String | The version
String name = "name_example"; // String | The fully qualified name of the extension
try {
    Extension result = apiInstance.getExtensionRepoVersionExtension(bucketName, groupId, artifactId, version, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getExtensionRepoVersionExtension");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| The bucket name |
 **groupId** | **String**| The group identifier |
 **artifactId** | **String**| The artifact identifier |
 **version** | **String**| The version |
 **name** | **String**| The fully qualified name of the extension |

### Return type

[**Extension**](Extension.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExtensionRepoVersionExtensionAdditionalDetailsDocs"></a>
# **getExtensionRepoVersionExtensionAdditionalDetailsDocs**
> String getExtensionRepoVersionExtensionAdditionalDetailsDocs(bucketName, groupId, artifactId, version, name)

Get extension repo extension details

Gets the additional details documentation for the extension with the given name in the given bucket, group, artifact, and version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
String bucketName = "bucketName_example"; // String | The bucket name
String groupId = "groupId_example"; // String | The group identifier
String artifactId = "artifactId_example"; // String | The artifact identifier
String version = "version_example"; // String | The version
String name = "name_example"; // String | The fully qualified name of the extension
try {
    String result = apiInstance.getExtensionRepoVersionExtensionAdditionalDetailsDocs(bucketName, groupId, artifactId, version, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getExtensionRepoVersionExtensionAdditionalDetailsDocs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| The bucket name |
 **groupId** | **String**| The group identifier |
 **artifactId** | **String**| The artifact identifier |
 **version** | **String**| The version |
 **name** | **String**| The fully qualified name of the extension |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="getExtensionRepoVersionExtensionDocs"></a>
# **getExtensionRepoVersionExtensionDocs**
> String getExtensionRepoVersionExtensionDocs(bucketName, groupId, artifactId, version, name)

Get extension repo extension docs

Gets the documentation for the extension with the given name in the given bucket, group, artifact, and version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
String bucketName = "bucketName_example"; // String | The bucket name
String groupId = "groupId_example"; // String | The group identifier
String artifactId = "artifactId_example"; // String | The artifact identifier
String version = "version_example"; // String | The version
String name = "name_example"; // String | The fully qualified name of the extension
try {
    String result = apiInstance.getExtensionRepoVersionExtensionDocs(bucketName, groupId, artifactId, version, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getExtensionRepoVersionExtensionDocs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| The bucket name |
 **groupId** | **String**| The group identifier |
 **artifactId** | **String**| The artifact identifier |
 **version** | **String**| The version |
 **name** | **String**| The fully qualified name of the extension |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="getExtensionRepoVersionExtensions"></a>
# **getExtensionRepoVersionExtensions**
> List&lt;ExtensionMetadata&gt; getExtensionRepoVersionExtensions(bucketName, groupId, artifactId, version)

Get extension repo extensions

Gets information about the extensions in the given bucket, group, artifact, and version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
String bucketName = "bucketName_example"; // String | The bucket name
String groupId = "groupId_example"; // String | The group identifier
String artifactId = "artifactId_example"; // String | The artifact identifier
String version = "version_example"; // String | The version
try {
    List<ExtensionMetadata> result = apiInstance.getExtensionRepoVersionExtensions(bucketName, groupId, artifactId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getExtensionRepoVersionExtensions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| The bucket name |
 **groupId** | **String**| The group identifier |
 **artifactId** | **String**| The artifact identifier |
 **version** | **String**| The version |

### Return type

[**List&lt;ExtensionMetadata&gt;**](ExtensionMetadata.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExtensionRepoVersionSha256"></a>
# **getExtensionRepoVersionSha256**
> String getExtensionRepoVersionSha256(bucketName, groupId, artifactId, version)

Get extension repo version checksum

Gets the hex representation of the SHA-256 digest for the binary content of the bundle with the given bucket, group, artifact, and version.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
String bucketName = "bucketName_example"; // String | The bucket name
String groupId = "groupId_example"; // String | The group identifier
String artifactId = "artifactId_example"; // String | The artifact identifier
String version = "version_example"; // String | The version
try {
    String result = apiInstance.getExtensionRepoVersionSha256(bucketName, groupId, artifactId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getExtensionRepoVersionSha256");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| The bucket name |
 **groupId** | **String**| The group identifier |
 **artifactId** | **String**| The artifact identifier |
 **version** | **String**| The version |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getExtensionRepoVersions"></a>
# **getExtensionRepoVersions**
> List&lt;ExtensionRepoVersionSummary&gt; getExtensionRepoVersions(bucketName, groupId, artifactId)

Get extension repo versions

Gets the versions in the extension repository for the given bucket, group, and artifact.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
String bucketName = "bucketName_example"; // String | The bucket name
String groupId = "groupId_example"; // String | The group identifier
String artifactId = "artifactId_example"; // String | The artifact identifier
try {
    List<ExtensionRepoVersionSummary> result = apiInstance.getExtensionRepoVersions(bucketName, groupId, artifactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getExtensionRepoVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| The bucket name |
 **groupId** | **String**| The group identifier |
 **artifactId** | **String**| The artifact identifier |

### Return type

[**List&lt;ExtensionRepoVersionSummary&gt;**](ExtensionRepoVersionSummary.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGlobalExtensionRepoVersionSha256"></a>
# **getGlobalExtensionRepoVersionSha256**
> String getGlobalExtensionRepoVersionSha256(groupId, artifactId, version)

Get global extension repo version checksum

Gets the hex representation of the SHA-256 digest for the binary content with the given bucket, group, artifact, and version. Since the same group-artifact-version can exist in multiple buckets, this will return the checksum of the first one returned. This will be consistent since the checksum must be the same when existing in multiple buckets.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionRepositoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionRepositoryApi apiInstance = new ExtensionRepositoryApi();
String groupId = "groupId_example"; // String | The group identifier
String artifactId = "artifactId_example"; // String | The artifact identifier
String version = "version_example"; // String | The version
try {
    String result = apiInstance.getGlobalExtensionRepoVersionSha256(groupId, artifactId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionRepositoryApi#getGlobalExtensionRepoVersionSha256");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The group identifier |
 **artifactId** | **String**| The artifact identifier |
 **version** | **String**| The version |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

