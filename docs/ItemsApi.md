# ItemsApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailableBucketItemFields**](ItemsApi.md#getAvailableBucketItemFields) | **GET** /items/fields | Get item fields
[**getItems**](ItemsApi.md#getItems) | **GET** /items | Get all items
[**getItemsInBucket**](ItemsApi.md#getItemsInBucket) | **GET** /items/{bucketId} | Get bucket items

<a name="getAvailableBucketItemFields"></a>
# **getAvailableBucketItemFields**
> Fields getAvailableBucketItemFields()

Get item fields

Retrieves the item field names for searching or sorting on bucket items.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ItemsApi apiInstance = new ItemsApi();
try {
    Fields result = apiInstance.getAvailableBucketItemFields();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getAvailableBucketItemFields");
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

<a name="getItems"></a>
# **getItems**
> List&lt;BucketItem&gt; getItems()

Get all items

Get items across all buckets. The returned items will include only items from buckets for which the user is authorized. If the user is not authorized to any buckets, an empty list will be returned.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ItemsApi apiInstance = new ItemsApi();
try {
    List<BucketItem> result = apiInstance.getItems();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getItems");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BucketItem&gt;**](BucketItem.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemsInBucket"></a>
# **getItemsInBucket**
> List&lt;BucketItem&gt; getItemsInBucket(bucketId)

Get bucket items

Gets the items located in the given bucket.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ItemsApi apiInstance = new ItemsApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
try {
    List<BucketItem> result = apiInstance.getItemsInBucket(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getItemsInBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |

### Return type

[**List&lt;BucketItem&gt;**](BucketItem.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

