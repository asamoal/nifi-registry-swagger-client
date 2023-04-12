# BucketsApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBucket**](BucketsApi.md#createBucket) | **POST** /buckets | Create bucket
[**deleteBucket**](BucketsApi.md#deleteBucket) | **DELETE** /buckets/{bucketId} | Delete bucket
[**getAvailableBucketFields**](BucketsApi.md#getAvailableBucketFields) | **GET** /buckets/fields | Get bucket fields
[**getBucket**](BucketsApi.md#getBucket) | **GET** /buckets/{bucketId} | Get bucket
[**getBuckets**](BucketsApi.md#getBuckets) | **GET** /buckets | Get all buckets
[**updateBucket**](BucketsApi.md#updateBucket) | **PUT** /buckets/{bucketId} | Update bucket

<a name="createBucket"></a>
# **createBucket**
> Bucket createBucket(body)

Create bucket

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketsApi apiInstance = new BucketsApi();
Bucket body = new Bucket(); // Bucket | The bucket to create
try {
    Bucket result = apiInstance.createBucket(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketsApi#createBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Bucket**](Bucket.md)| The bucket to create |

### Return type

[**Bucket**](Bucket.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBucket"></a>
# **deleteBucket**
> Bucket deleteBucket(version, bucketId, clientId)

Delete bucket

Deletes the bucket with the given id, along with all objects stored in the bucket

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketsApi apiInstance = new BucketsApi();
String version = "version_example"; // String | The version is used to verify the client is working with the latest version of the entity.
String bucketId = "bucketId_example"; // String | The bucket identifier
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    Bucket result = apiInstance.deleteBucket(version, bucketId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketsApi#deleteBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The version is used to verify the client is working with the latest version of the entity. |
 **bucketId** | **String**| The bucket identifier |
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**Bucket**](Bucket.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAvailableBucketFields"></a>
# **getAvailableBucketFields**
> Fields getAvailableBucketFields()

Get bucket fields

Retrieves bucket field names for searching or sorting on buckets.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketsApi apiInstance = new BucketsApi();
try {
    Fields result = apiInstance.getAvailableBucketFields();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketsApi#getAvailableBucketFields");
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

<a name="getBucket"></a>
# **getBucket**
> Bucket getBucket(bucketId)

Get bucket

Gets the bucket with the given id.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketsApi apiInstance = new BucketsApi();
String bucketId = "bucketId_example"; // String | The bucket identifier
try {
    Bucket result = apiInstance.getBucket(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketsApi#getBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **String**| The bucket identifier |

### Return type

[**Bucket**](Bucket.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuckets"></a>
# **getBuckets**
> List&lt;Bucket&gt; getBuckets()

Get all buckets

The returned list will include only buckets for which the user is authorized.If the user is not authorized for any buckets, this returns an empty list.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketsApi apiInstance = new BucketsApi();
try {
    List<Bucket> result = apiInstance.getBuckets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketsApi#getBuckets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Bucket&gt;**](Bucket.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBucket"></a>
# **updateBucket**
> Bucket updateBucket(body, bucketId)

Update bucket

Updates the bucket with the given id.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.BucketsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BucketsApi apiInstance = new BucketsApi();
Bucket body = new Bucket(); // Bucket | The updated bucket
String bucketId = "bucketId_example"; // String | The bucket identifier
try {
    Bucket result = apiInstance.updateBucket(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketsApi#updateBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Bucket**](Bucket.md)| The updated bucket |
 **bucketId** | **String**| The bucket identifier |

### Return type

[**Bucket**](Bucket.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

