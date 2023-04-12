# PoliciesApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessPolicy**](PoliciesApi.md#createAccessPolicy) | **POST** /policies | Create access policy
[**getAccessPolicies**](PoliciesApi.md#getAccessPolicies) | **GET** /policies | Get all access policies
[**getAccessPolicy**](PoliciesApi.md#getAccessPolicy) | **GET** /policies/{id} | Get access policy
[**getAccessPolicyForResource**](PoliciesApi.md#getAccessPolicyForResource) | **GET** /policies/{action}/{resource} | Get access policy for resource
[**getResources**](PoliciesApi.md#getResources) | **GET** /policies/resources | Get available resources
[**removeAccessPolicy**](PoliciesApi.md#removeAccessPolicy) | **DELETE** /policies/{id} | Delete access policy
[**updateAccessPolicy**](PoliciesApi.md#updateAccessPolicy) | **PUT** /policies/{id} | Update access policy

<a name="createAccessPolicy"></a>
# **createAccessPolicy**
> AccessPolicy createAccessPolicy(body)

Create access policy

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PoliciesApi apiInstance = new PoliciesApi();
AccessPolicy body = new AccessPolicy(); // AccessPolicy | The access policy configuration details.
try {
    AccessPolicy result = apiInstance.createAccessPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#createAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessPolicy**](AccessPolicy.md)| The access policy configuration details. |

### Return type

[**AccessPolicy**](AccessPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccessPolicies"></a>
# **getAccessPolicies**
> List&lt;AccessPolicy&gt; getAccessPolicies()

Get all access policies

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PoliciesApi apiInstance = new PoliciesApi();
try {
    List<AccessPolicy> result = apiInstance.getAccessPolicies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#getAccessPolicies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AccessPolicy&gt;**](AccessPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccessPolicy"></a>
# **getAccessPolicy**
> AccessPolicy getAccessPolicy(id)

Get access policy

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | The access policy id.
try {
    AccessPolicy result = apiInstance.getAccessPolicy(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#getAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The access policy id. |

### Return type

[**AccessPolicy**](AccessPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccessPolicyForResource"></a>
# **getAccessPolicyForResource**
> AccessPolicy getAccessPolicyForResource(action, resource)

Get access policy for resource

Gets an access policy for the specified action and resource

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PoliciesApi apiInstance = new PoliciesApi();
String action = "action_example"; // String | The request action.
String resource = "resource_example"; // String | The resource of the policy.
try {
    AccessPolicy result = apiInstance.getAccessPolicyForResource(action, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#getAccessPolicyForResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**| The request action. | [enum: read, write, delete]
 **resource** | **String**| The resource of the policy. |

### Return type

[**AccessPolicy**](AccessPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResources"></a>
# **getResources**
> List&lt;Resource&gt; getResources()

Get available resources

Gets the available resources that support access/authorization policies

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PoliciesApi apiInstance = new PoliciesApi();
try {
    List<Resource> result = apiInstance.getResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#getResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Resource&gt;**](Resource.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeAccessPolicy"></a>
# **removeAccessPolicy**
> AccessPolicy removeAccessPolicy(version, id, clientId)

Delete access policy

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PoliciesApi apiInstance = new PoliciesApi();
String version = "version_example"; // String | The version is used to verify the client is working with the latest version of the entity.
String id = "id_example"; // String | The access policy id.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    AccessPolicy result = apiInstance.removeAccessPolicy(version, id, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#removeAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The version is used to verify the client is working with the latest version of the entity. |
 **id** | **String**| The access policy id. |
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**AccessPolicy**](AccessPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAccessPolicy"></a>
# **updateAccessPolicy**
> AccessPolicy updateAccessPolicy(body, id)

Update access policy

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PoliciesApi apiInstance = new PoliciesApi();
AccessPolicy body = new AccessPolicy(); // AccessPolicy | The access policy configuration details.
String id = "id_example"; // String | The access policy id.
try {
    AccessPolicy result = apiInstance.updateAccessPolicy(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#updateAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessPolicy**](AccessPolicy.md)| The access policy configuration details. |
 **id** | **String**| The access policy id. |

### Return type

[**AccessPolicy**](AccessPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

