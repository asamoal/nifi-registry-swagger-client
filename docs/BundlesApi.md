# BundlesApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBundleVersionExtensionAdditionalDetailsDocs**](BundlesApi.md#getBundleVersionExtensionAdditionalDetailsDocs) | **GET** /bundles/{bundleId}/versions/{version}/extensions/{name}/docs/additional-details | Get bundle version extension docs details
[**getBundleVersionExtensionDocs**](BundlesApi.md#getBundleVersionExtensionDocs) | **GET** /bundles/{bundleId}/versions/{version}/extensions/{name}/docs | Get bundle version extension docs
[**getBundleVersions**](BundlesApi.md#getBundleVersions) | **GET** /bundles/versions | Get all bundle versions
[**getBundles**](BundlesApi.md#getBundles) | **GET** /bundles | Get all bundles
[**globalDeleteBundleVersion**](BundlesApi.md#globalDeleteBundleVersion) | **DELETE** /bundles/{bundleId}/versions/{version} | Delete bundle version
[**globalDeleteExtensionBundle**](BundlesApi.md#globalDeleteExtensionBundle) | **DELETE** /bundles/{bundleId} | Delete bundle
[**globalGetBundleVersion**](BundlesApi.md#globalGetBundleVersion) | **GET** /bundles/{bundleId}/versions/{version} | Get bundle version
[**globalGetBundleVersionContent**](BundlesApi.md#globalGetBundleVersionContent) | **GET** /bundles/{bundleId}/versions/{version}/content | Get bundle version content
[**globalGetBundleVersionExtension**](BundlesApi.md#globalGetBundleVersionExtension) | **GET** /bundles/{bundleId}/versions/{version}/extensions/{name} | Get bundle version extension
[**globalGetBundleVersionExtensions**](BundlesApi.md#globalGetBundleVersionExtensions) | **GET** /bundles/{bundleId}/versions/{version}/extensions | Get bundle version extensions
[**globalGetBundleVersions**](BundlesApi.md#globalGetBundleVersions) | **GET** /bundles/{bundleId}/versions | Get bundle versions
[**globalGetExtensionBundle**](BundlesApi.md#globalGetExtensionBundle) | **GET** /bundles/{bundleId} | Get bundle

<a name="getBundleVersionExtensionAdditionalDetailsDocs"></a>
# **getBundleVersionExtensionAdditionalDetailsDocs**
> String getBundleVersionExtensionAdditionalDetailsDocs(bundleId, version, name)

Get bundle version extension docs details

Gets the additional details documentation for the given extension in the given extension bundle version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String bundleId = "bundleId_example"; // String | The extension bundle identifier
String version = "version_example"; // String | The version of the bundle
String name = "name_example"; // String | The fully qualified name of the extension
try {
    String result = apiInstance.getBundleVersionExtensionAdditionalDetailsDocs(bundleId, version, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#getBundleVersionExtensionAdditionalDetailsDocs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**| The extension bundle identifier |
 **version** | **String**| The version of the bundle |
 **name** | **String**| The fully qualified name of the extension |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="getBundleVersionExtensionDocs"></a>
# **getBundleVersionExtensionDocs**
> String getBundleVersionExtensionDocs(bundleId, version, name)

Get bundle version extension docs

Gets the documentation for the given extension in the given extension bundle version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String bundleId = "bundleId_example"; // String | The extension bundle identifier
String version = "version_example"; // String | The version of the bundle
String name = "name_example"; // String | The fully qualified name of the extension
try {
    String result = apiInstance.getBundleVersionExtensionDocs(bundleId, version, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#getBundleVersionExtensionDocs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**| The extension bundle identifier |
 **version** | **String**| The version of the bundle |
 **name** | **String**| The fully qualified name of the extension |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="getBundleVersions"></a>
# **getBundleVersions**
> List&lt;BundleVersionMetadata&gt; getBundleVersions(groupId, artifactId, version)

Get all bundle versions

Gets the metadata about extension bundle versions across all authorized buckets with optional filters applied. If the user is not authorized to any buckets, an empty list will be returned.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String groupId = "groupId_example"; // String | Optional groupId to filter results. The value may be an exact match, or a wildcard, such as 'com.%' to select all bundle versions where the groupId starts with 'com.'.
String artifactId = "artifactId_example"; // String | Optional artifactId to filter results. The value may be an exact match, or a wildcard, such as 'nifi-%' to select all bundle versions where the artifactId starts with 'nifi-'.
String version = "version_example"; // String | Optional version to filter results. The value maye be an exact match, or a wildcard, such as '1.0.%' to select all bundle versions where the version starts with '1.0.'.
try {
    List<BundleVersionMetadata> result = apiInstance.getBundleVersions(groupId, artifactId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#getBundleVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| Optional groupId to filter results. The value may be an exact match, or a wildcard, such as &#x27;com.%&#x27; to select all bundle versions where the groupId starts with &#x27;com.&#x27;. | [optional]
 **artifactId** | **String**| Optional artifactId to filter results. The value may be an exact match, or a wildcard, such as &#x27;nifi-%&#x27; to select all bundle versions where the artifactId starts with &#x27;nifi-&#x27;. | [optional]
 **version** | **String**| Optional version to filter results. The value maye be an exact match, or a wildcard, such as &#x27;1.0.%&#x27; to select all bundle versions where the version starts with &#x27;1.0.&#x27;. | [optional]

### Return type

[**List&lt;BundleVersionMetadata&gt;**](BundleVersionMetadata.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBundles"></a>
# **getBundles**
> List&lt;ExtensionBundle&gt; getBundles(bucketName, groupId, artifactId)

Get all bundles

Gets the metadata for all bundles across all authorized buckets with optional filters applied. The returned results will include only items from buckets for which the user is authorized. If the user is not authorized to any buckets, an empty list will be returned.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String bucketName = "bucketName_example"; // String | Optional bucket name to filter results. The value may be an exact match, or a wildcard, such as 'My Bucket%' to select all bundles where the bucket name starts with 'My Bucket'.
String groupId = "groupId_example"; // String | Optional groupId to filter results. The value may be an exact match, or a wildcard, such as 'com.%' to select all bundles where the groupId starts with 'com.'.
String artifactId = "artifactId_example"; // String | Optional artifactId to filter results. The value may be an exact match, or a wildcard, such as 'nifi-%' to select all bundles where the artifactId starts with 'nifi-'.
try {
    List<ExtensionBundle> result = apiInstance.getBundles(bucketName, groupId, artifactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#getBundles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| Optional bucket name to filter results. The value may be an exact match, or a wildcard, such as &#x27;My Bucket%&#x27; to select all bundles where the bucket name starts with &#x27;My Bucket&#x27;. | [optional]
 **groupId** | **String**| Optional groupId to filter results. The value may be an exact match, or a wildcard, such as &#x27;com.%&#x27; to select all bundles where the groupId starts with &#x27;com.&#x27;. | [optional]
 **artifactId** | **String**| Optional artifactId to filter results. The value may be an exact match, or a wildcard, such as &#x27;nifi-%&#x27; to select all bundles where the artifactId starts with &#x27;nifi-&#x27;. | [optional]

### Return type

[**List&lt;ExtensionBundle&gt;**](ExtensionBundle.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalDeleteBundleVersion"></a>
# **globalDeleteBundleVersion**
> BundleVersion globalDeleteBundleVersion(bundleId, version)

Delete bundle version

Deletes the given extension bundle version and it&#x27;s associated binary content.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String bundleId = "bundleId_example"; // String | The extension bundle identifier
String version = "version_example"; // String | The version of the bundle
try {
    BundleVersion result = apiInstance.globalDeleteBundleVersion(bundleId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#globalDeleteBundleVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**| The extension bundle identifier |
 **version** | **String**| The version of the bundle |

### Return type

[**BundleVersion**](BundleVersion.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalDeleteExtensionBundle"></a>
# **globalDeleteExtensionBundle**
> ExtensionBundle globalDeleteExtensionBundle(bundleId)

Delete bundle

Deletes the given extension bundle and all of it&#x27;s versions.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String bundleId = "bundleId_example"; // String | The extension bundle identifier
try {
    ExtensionBundle result = apiInstance.globalDeleteExtensionBundle(bundleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#globalDeleteExtensionBundle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**| The extension bundle identifier |

### Return type

[**ExtensionBundle**](ExtensionBundle.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalGetBundleVersion"></a>
# **globalGetBundleVersion**
> BundleVersion globalGetBundleVersion(bundleId, version)

Get bundle version

Gets the descriptor for the given version of the given extension bundle.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String bundleId = "bundleId_example"; // String | The extension bundle identifier
String version = "version_example"; // String | The version of the bundle
try {
    BundleVersion result = apiInstance.globalGetBundleVersion(bundleId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#globalGetBundleVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**| The extension bundle identifier |
 **version** | **String**| The version of the bundle |

### Return type

[**BundleVersion**](BundleVersion.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalGetBundleVersionContent"></a>
# **globalGetBundleVersionContent**
> List&lt;byte[]&gt; globalGetBundleVersionContent(bundleId, version)

Get bundle version content

Gets the binary content for the given version of the given extension bundle.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String bundleId = "bundleId_example"; // String | The extension bundle identifier
String version = "version_example"; // String | The version of the bundle
try {
    List<byte[]> result = apiInstance.globalGetBundleVersionContent(bundleId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#globalGetBundleVersionContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**| The extension bundle identifier |
 **version** | **String**| The version of the bundle |

### Return type

**List&lt;byte[]&gt;**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="globalGetBundleVersionExtension"></a>
# **globalGetBundleVersionExtension**
> List&lt;Extension&gt; globalGetBundleVersionExtension(bundleId, version, name)

Get bundle version extension

Gets the metadata about the extension with the given name in the given extension bundle version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String bundleId = "bundleId_example"; // String | The extension bundle identifier
String version = "version_example"; // String | The version of the bundle
String name = "name_example"; // String | The fully qualified name of the extension
try {
    List<Extension> result = apiInstance.globalGetBundleVersionExtension(bundleId, version, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#globalGetBundleVersionExtension");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**| The extension bundle identifier |
 **version** | **String**| The version of the bundle |
 **name** | **String**| The fully qualified name of the extension |

### Return type

[**List&lt;Extension&gt;**](Extension.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalGetBundleVersionExtensions"></a>
# **globalGetBundleVersionExtensions**
> List&lt;ExtensionMetadata&gt; globalGetBundleVersionExtensions(bundleId, version)

Get bundle version extensions

Gets the metadata about the extensions in the given extension bundle version.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String bundleId = "bundleId_example"; // String | The extension bundle identifier
String version = "version_example"; // String | The version of the bundle
try {
    List<ExtensionMetadata> result = apiInstance.globalGetBundleVersionExtensions(bundleId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#globalGetBundleVersionExtensions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**| The extension bundle identifier |
 **version** | **String**| The version of the bundle |

### Return type

[**List&lt;ExtensionMetadata&gt;**](ExtensionMetadata.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalGetBundleVersions"></a>
# **globalGetBundleVersions**
> List&lt;BundleVersionMetadata&gt; globalGetBundleVersions(bundleId)

Get bundle versions

Gets the metadata for the versions of the given extension bundle.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String bundleId = "bundleId_example"; // String | The extension bundle identifier
try {
    List<BundleVersionMetadata> result = apiInstance.globalGetBundleVersions(bundleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#globalGetBundleVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**| The extension bundle identifier |

### Return type

[**List&lt;BundleVersionMetadata&gt;**](BundleVersionMetadata.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="globalGetExtensionBundle"></a>
# **globalGetExtensionBundle**
> ExtensionBundle globalGetExtensionBundle(bundleId)

Get bundle

Gets the metadata about an extension bundle.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BundlesApi apiInstance = new BundlesApi();
String bundleId = "bundleId_example"; // String | The extension bundle identifier
try {
    ExtensionBundle result = apiInstance.globalGetExtensionBundle(bundleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundlesApi#globalGetExtensionBundle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **String**| The extension bundle identifier |

### Return type

[**ExtensionBundle**](ExtensionBundle.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

