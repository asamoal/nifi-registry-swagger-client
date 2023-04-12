# AccessPolicySummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | The id of the policy. Set by server at creation time. |  [optional]
**resource** | **String** | The resource for this access policy. | 
**action** | [**ActionEnum**](#ActionEnum) | The action associated with this access policy. | 
**configurable** | **Boolean** | Indicates if this access policy is configurable, based on which Authorizer has been configured to manage it. |  [optional]
**revision** | [**RevisionInfo**](RevisionInfo.md) |  |  [optional]

<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
READ | &quot;read&quot;
WRITE | &quot;write&quot;
DELETE | &quot;delete&quot;
