# BucketBundlesApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExtensionBundleVersion**](BucketBundlesApi.md#createExtensionBundleVersion) | **POST** /buckets/{bucketId}/bundles/{bundleType} | Create extension bundle version
[**getExtensionBundles**](BucketBundlesApi.md#getExtensionBundles) | **GET** /buckets/{bucketId}/bundles | Get extension bundles by bucket

<a name="createExtensionBundleVersion"></a>
# **createExtensionBundleVersion**
> BundleVersion createExtensionBundleVersion(bucketId, bundleType)

Create extension bundle version

Creates a version of an extension bundle by uploading a binary artifact. If an extension bundle already exists in the given bucket with the same group id and artifact id as that of the bundle being uploaded, then it will be added as a new version to the existing bundle. If an extension bundle does not already exist in the given bucket with the same group id and artifact id, then a new extension bundle will be created and this version will be added to the new bundle. Client&#x27;s may optionally supply a SHA-256 in hex format through the multi-part form field &#x27;sha256&#x27;. If supplied, then this value will be compared against the SHA-256 computed by the server, and the bundle will be rejected if the values do not match. If not supplied, the bundle will be accepted, but will be marked to indicate that the client did not supply a SHA-256 during creation.   NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketBundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketBundlesApi apiInstance = new BucketBundlesApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
String bundleType = "bundleType_example"; // String | The type of the bundle
try {
    BundleVersion result = apiInstance.createExtensionBundleVersion(bucketId, bundleType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketBundlesApi#createExtensionBundleVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |
 **bundleType** | **String**| The type of the bundle | [enum: nifi-nar, minifi-cpp]

### Return type

[**BundleVersion**](BundleVersion.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExtensionBundles"></a>
# **getExtensionBundles**
> List&lt;ExtensionBundle&gt; getExtensionBundles(bucketId)

Get extension bundles by bucket

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketBundlesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketBundlesApi apiInstance = new BucketBundlesApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
try {
    List<ExtensionBundle> result = apiInstance.getExtensionBundles(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketBundlesApi#getExtensionBundles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |

### Return type

[**List&lt;ExtensionBundle&gt;**](ExtensionBundle.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

