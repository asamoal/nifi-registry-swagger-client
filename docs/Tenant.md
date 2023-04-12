# Tenant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | The computer-generated identifier of the tenant. |  [optional]
**identity** | **String** | The human-facing identity of the tenant. This can only be changed if the tenant is configurable. | 
**configurable** | **Boolean** | Indicates if this tenant is configurable, based on which UserGroupProvider has been configured to manage it. |  [optional]
**resourcePermissions** | [**ResourcePermissions**](ResourcePermissions.md) |  |  [optional]
**accessPolicies** | [**List&lt;AccessPolicySummary&gt;**](AccessPolicySummary.md) | The access policies granted to this tenant. |  [optional]
**revision** | [**RevisionInfo**](RevisionInfo.md) |  |  [optional]
