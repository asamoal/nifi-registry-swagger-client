# TenantsApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](TenantsApi.md#createUser) | **POST** /tenants/users | Create user
[**createUserGroup**](TenantsApi.md#createUserGroup) | **POST** /tenants/user-groups | Create user group
[**getUser**](TenantsApi.md#getUser) | **GET** /tenants/users/{id} | Get user
[**getUserGroup**](TenantsApi.md#getUserGroup) | **GET** /tenants/user-groups/{id} | Get user group
[**getUserGroups**](TenantsApi.md#getUserGroups) | **GET** /tenants/user-groups | Get user groups
[**getUsers**](TenantsApi.md#getUsers) | **GET** /tenants/users | Get all users
[**removeUser**](TenantsApi.md#removeUser) | **DELETE** /tenants/users/{id} | Delete user
[**removeUserGroup**](TenantsApi.md#removeUserGroup) | **DELETE** /tenants/user-groups/{id} | Delete user group
[**updateUser**](TenantsApi.md#updateUser) | **PUT** /tenants/users/{id} | Update user
[**updateUserGroup**](TenantsApi.md#updateUserGroup) | **PUT** /tenants/user-groups/{id} | Update user group

<a name="createUser"></a>
# **createUser**
> User createUser(body)

Create user

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TenantsApi apiInstance = new TenantsApi();
User body = new User(); // User | The user configuration details.
try {
    User result = apiInstance.createUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| The user configuration details. |

### Return type

[**User**](User.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUserGroup"></a>
# **createUserGroup**
> UserGroup createUserGroup(body)

Create user group

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TenantsApi apiInstance = new TenantsApi();
UserGroup body = new UserGroup(); // UserGroup | The user group configuration details.
try {
    UserGroup result = apiInstance.createUserGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#createUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserGroup**](UserGroup.md)| The user group configuration details. |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> User getUser(id)

Get user

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TenantsApi apiInstance = new TenantsApi();
String id = "id_example"; // String | The user id.
try {
    User result = apiInstance.getUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user id. |

### Return type

[**User**](User.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserGroup"></a>
# **getUserGroup**
> UserGroup getUserGroup(id)

Get user group

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TenantsApi apiInstance = new TenantsApi();
String id = "id_example"; // String | The user group id.
try {
    UserGroup result = apiInstance.getUserGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#getUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The user group id. |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserGroups"></a>
# **getUserGroups**
> List&lt;UserGroup&gt; getUserGroups()

Get user groups

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TenantsApi apiInstance = new TenantsApi();
try {
    List<UserGroup> result = apiInstance.getUserGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#getUserGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserGroup&gt;**](UserGroup.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> List&lt;User&gt; getUsers()

Get all users

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TenantsApi apiInstance = new TenantsApi();
try {
    List<User> result = apiInstance.getUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#getUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeUser"></a>
# **removeUser**
> User removeUser(version, id, clientId)

Delete user

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TenantsApi apiInstance = new TenantsApi();
String version = "version_example"; // String | The version is used to verify the client is working with the latest version of the entity.
String id = "id_example"; // String | The user id.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    User result = apiInstance.removeUser(version, id, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#removeUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The version is used to verify the client is working with the latest version of the entity. |
 **id** | **String**| The user id. |
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**User**](User.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeUserGroup"></a>
# **removeUserGroup**
> UserGroup removeUserGroup(version, id, clientId)

Delete user group

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TenantsApi apiInstance = new TenantsApi();
String version = "version_example"; // String | The version is used to verify the client is working with the latest version of the entity.
String id = "id_example"; // String | The user group id.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
try {
    UserGroup result = apiInstance.removeUserGroup(version, id, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#removeUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The version is used to verify the client is working with the latest version of the entity. |
 **id** | **String**| The user group id. |
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> User updateUser(body, id)

Update user

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TenantsApi apiInstance = new TenantsApi();
User body = new User(); // User | The user configuration details.
String id = "id_example"; // String | The user id.
try {
    User result = apiInstance.updateUser(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| The user configuration details. |
 **id** | **String**| The user id. |

### Return type

[**User**](User.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserGroup"></a>
# **updateUserGroup**
> UserGroup updateUserGroup(body, id)

Update user group

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TenantsApi apiInstance = new TenantsApi();
UserGroup body = new UserGroup(); // UserGroup | The user group configuration details.
String id = "id_example"; // String | The user group id.
try {
    UserGroup result = apiInstance.updateUserGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#updateUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserGroup**](UserGroup.md)| The user group configuration details. |
 **id** | **String**| The user group id. |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

