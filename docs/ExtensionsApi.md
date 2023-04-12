# ExtensionsApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExtensions**](ExtensionsApi.md#getExtensions) | **GET** /extensions | Get all extensions
[**getExtensionsProvidingServiceAPI**](ExtensionsApi.md#getExtensionsProvidingServiceAPI) | **GET** /extensions/provided-service-api | Get extensions providing service API
[**getTags**](ExtensionsApi.md#getTags) | **GET** /extensions/tags | Get extension tags

<a name="getExtensions"></a>
# **getExtensions**
> ExtensionMetadataContainer getExtensions(bundleType, extensionType, tag)

Get all extensions

Gets the metadata for all extensions that match the filter params and are part of bundles located in buckets the current user is authorized for. If the user is not authorized to any buckets, an empty result set will be returned.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionsApi apiInstance = new ExtensionsApi();
String bundleType = "bundleType_example"; // String | The type of bundles to return
String extensionType = "extensionType_example"; // String | The type of extensions to return
List<String> tag = Arrays.asList("tag_example"); // List<String> | The tags to filter on, will be used in an OR statement
try {
    ExtensionMetadataContainer result = apiInstance.getExtensions(bundleType, extensionType, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionsApi#getExtensions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleType** | **String**| The type of bundles to return | [optional] [enum: nifi-nar, minifi-cpp]
 **extensionType** | **String**| The type of extensions to return | [optional] [enum: PROCESSOR, CONTROLLER_SERVICE, REPORTING_TASK]
 **tag** | [**List&lt;String&gt;**](String.md)| The tags to filter on, will be used in an OR statement | [optional]

### Return type

[**ExtensionMetadataContainer**](ExtensionMetadataContainer.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExtensionsProvidingServiceAPI"></a>
# **getExtensionsProvidingServiceAPI**
> ExtensionMetadataContainer getExtensionsProvidingServiceAPI(className, groupId, artifactId, version)

Get extensions providing service API

Gets the metadata for extensions that provide the specified API and are part of bundles located in buckets the current user is authorized for. If the user is not authorized to any buckets, an empty result set will be returned.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionsApi apiInstance = new ExtensionsApi();
String className = "className_example"; // String | The name of the service API class
String groupId = "groupId_example"; // String | The groupId of the bundle containing the service API class
String artifactId = "artifactId_example"; // String | The artifactId of the bundle containing the service API class
String version = "version_example"; // String | The version of the bundle containing the service API class
try {
    ExtensionMetadataContainer result = apiInstance.getExtensionsProvidingServiceAPI(className, groupId, artifactId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionsApi#getExtensionsProvidingServiceAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**| The name of the service API class |
 **groupId** | **String**| The groupId of the bundle containing the service API class |
 **artifactId** | **String**| The artifactId of the bundle containing the service API class |
 **version** | **String**| The version of the bundle containing the service API class |

### Return type

[**ExtensionMetadataContainer**](ExtensionMetadataContainer.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTags"></a>
# **getTags**
> List&lt;TagCount&gt; getTags()

Get extension tags

Gets all the extension tags known to this NiFi Registry instance, along with the number of extensions that have the given tag.  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ExtensionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ExtensionsApi apiInstance = new ExtensionsApi();
try {
    List<TagCount> result = apiInstance.getTags();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtensionsApi#getTags");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TagCount&gt;**](TagCount.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

