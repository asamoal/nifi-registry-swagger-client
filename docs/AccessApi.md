# AccessApi

All URIs are relative to */nifi-registry-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessTokenByTryingAllProviders**](AccessApi.md#createAccessTokenByTryingAllProviders) | **POST** /access/token | Create token trying all providers
[**createAccessTokenUsingBasicAuthCredentials**](AccessApi.md#createAccessTokenUsingBasicAuthCredentials) | **POST** /access/token/login | Create token using basic auth
[**createAccessTokenUsingIdentityProviderCredentials**](AccessApi.md#createAccessTokenUsingIdentityProviderCredentials) | **POST** /access/token/identity-provider | Create token using identity provider
[**createAccessTokenUsingKerberosTicket**](AccessApi.md#createAccessTokenUsingKerberosTicket) | **POST** /access/token/kerberos | Create token using kerberos
[**getAccessStatus**](AccessApi.md#getAccessStatus) | **GET** /access | Get access status
[**getIdentityProviderUsageInstructions**](AccessApi.md#getIdentityProviderUsageInstructions) | **GET** /access/token/identity-provider/usage | Get identity provider usage
[**logout**](AccessApi.md#logout) | **DELETE** /access/logout | Performs a logout for other providers that have been issued a JWT.
[**logoutComplete**](AccessApi.md#logoutComplete) | **GET** /access/logout/complete | Completes the logout sequence.
[**oidcCallback**](AccessApi.md#oidcCallback) | **GET** /access/oidc/callback | Redirect/callback URI for processing the result of the OpenId Connect login sequence.
[**oidcExchange**](AccessApi.md#oidcExchange) | **POST** /access/oidc/exchange | Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.
[**oidcLogout**](AccessApi.md#oidcLogout) | **GET** /access/oidc/logout | Performs a logout in the OpenId Provider.
[**oidcLogoutCallback**](AccessApi.md#oidcLogoutCallback) | **GET** /access/oidc/logout/callback | Redirect/callback URI for processing the result of the OpenId Connect logout sequence.
[**oidcRequest**](AccessApi.md#oidcRequest) | **GET** /access/oidc/request | Initiates a request to authenticate through the configured OpenId Connect provider.
[**testIdentityProviderRecognizesCredentialsFormat**](AccessApi.md#testIdentityProviderRecognizesCredentialsFormat) | **POST** /access/token/identity-provider/test | Test identity provider

<a name="createAccessTokenByTryingAllProviders"></a>
# **createAccessTokenByTryingAllProviders**
> String createAccessTokenByTryingAllProviders()

Create token trying all providers

Creates a token for accessing the REST API via auto-detected method of verifying client identity claim credentials. The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#x27;Authorization: Bearer &lt;token&gt;&#x27;.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.createAccessTokenByTryingAllProviders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createAccessTokenByTryingAllProviders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="createAccessTokenUsingBasicAuthCredentials"></a>
# **createAccessTokenUsingBasicAuthCredentials**
> String createAccessTokenUsingBasicAuthCredentials()

Create token using basic auth

Creates a token for accessing the REST API via username/password. The user credentials must be passed in standard HTTP Basic Auth format. That is: &#x27;Authorization: Basic &lt;credentials&gt;&#x27;, where &lt;credentials&gt; is the base64 encoded value of &#x27;&lt;username&gt;:&lt;password&gt;&#x27;. The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#x27;Authorization: Bearer &lt;token&gt;&#x27;.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.createAccessTokenUsingBasicAuthCredentials();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createAccessTokenUsingBasicAuthCredentials");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="createAccessTokenUsingIdentityProviderCredentials"></a>
# **createAccessTokenUsingIdentityProviderCredentials**
> String createAccessTokenUsingIdentityProviderCredentials()

Create token using identity provider

Creates a token for accessing the REST API via a custom identity provider. The user credentials must be passed in a format understood by the custom identity provider, e.g., a third-party auth token in an HTTP header. The exact format of the user credentials expected by the custom identity provider can be discovered by &#x27;GET /access/token/identity-provider/usage&#x27;. The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#x27;Authorization: Bearer &lt;token&gt;&#x27;.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.createAccessTokenUsingIdentityProviderCredentials();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createAccessTokenUsingIdentityProviderCredentials");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="createAccessTokenUsingKerberosTicket"></a>
# **createAccessTokenUsingKerberosTicket**
> String createAccessTokenUsingKerberosTicket()

Create token using kerberos

Creates a token for accessing the REST API via Kerberos Service Tickets or SPNEGO Tokens (which includes Kerberos Service Tickets). The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#x27;Authorization: Bearer &lt;token&gt;&#x27;.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.createAccessTokenUsingKerberosTicket();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#createAccessTokenUsingKerberosTicket");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getAccessStatus"></a>
# **getAccessStatus**
> CurrentUser getAccessStatus()

Get access status

Returns the current client&#x27;s authenticated identity and permissions to top-level resources

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiClient;
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.Configuration;
//import com.github.asamoal.nifi_registry.swagger.auth.*;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AccessApi apiInstance = new AccessApi();
try {
    CurrentUser result = apiInstance.getAccessStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#getAccessStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrentUser**](CurrentUser.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIdentityProviderUsageInstructions"></a>
# **getIdentityProviderUsageInstructions**
> String getIdentityProviderUsageInstructions()

Get identity provider usage

Provides a description of how the currently configured identity provider expects credentials to be passed to POST /access/token/identity-provider

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.getIdentityProviderUsageInstructions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#getIdentityProviderUsageInstructions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="logout"></a>
# **logout**
> logout()

Performs a logout for other providers that have been issued a JWT.

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.logout();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#logout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="logoutComplete"></a>
# **logoutComplete**
> logoutComplete()

Completes the logout sequence.

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.logoutComplete();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#logoutComplete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="oidcCallback"></a>
# **oidcCallback**
> oidcCallback()

Redirect/callback URI for processing the result of the OpenId Connect login sequence.

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.oidcCallback();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcCallback");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="oidcExchange"></a>
# **oidcExchange**
> String oidcExchange()

Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.oidcExchange();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcExchange");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="oidcLogout"></a>
# **oidcLogout**
> oidcLogout()

Performs a logout in the OpenId Provider.

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.oidcLogout();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcLogout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="oidcLogoutCallback"></a>
# **oidcLogoutCallback**
> oidcLogoutCallback()

Redirect/callback URI for processing the result of the OpenId Connect logout sequence.

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.oidcLogoutCallback();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcLogoutCallback");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="oidcRequest"></a>
# **oidcRequest**
> oidcRequest()

Initiates a request to authenticate through the configured OpenId Connect provider.

  NOTE: This endpoint is subject to change as NiFi Registry and its REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    apiInstance.oidcRequest();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#oidcRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="testIdentityProviderRecognizesCredentialsFormat"></a>
# **testIdentityProviderRecognizesCredentialsFormat**
> String testIdentityProviderRecognizesCredentialsFormat()

Test identity provider

Tests the format of the credentials against this identity provider without preforming authentication on the credentials to validate them. The user credentials should be passed in a format understood by the custom identity provider as defined by &#x27;GET /access/token/identity-provider/usage&#x27;.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi_registry.swagger.ApiException;
//import com.github.asamoal.nifi_registry.swagger.client.AccessApi;


AccessApi apiInstance = new AccessApi();
try {
    String result = apiInstance.testIdentityProviderRecognizesCredentialsFormat();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApi#testIdentityProviderRecognizesCredentialsFormat");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

