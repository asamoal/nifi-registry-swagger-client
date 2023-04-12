# Extension

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the extension |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the extension |  [optional]
**deprecationNotice** | [**DeprecationNotice**](DeprecationNotice.md) |  |  [optional]
**description** | **String** | The description of the extension |  [optional]
**tags** | **List&lt;String&gt;** | The tags of the extension |  [optional]
**properties** | [**List&lt;Property&gt;**](Property.md) | The properties of the extension |  [optional]
**dynamicProperties** | [**List&lt;DynamicProperty&gt;**](DynamicProperty.md) | The dynamic properties of the extension |  [optional]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | The relationships of the extension |  [optional]
**dynamicRelationship** | [**DynamicRelationship**](DynamicRelationship.md) |  |  [optional]
**readsAttributes** | [**List&lt;Attribute&gt;**](Attribute.md) | The attributes read from flow files by the extension |  [optional]
**writesAttributes** | [**List&lt;Attribute&gt;**](Attribute.md) | The attributes written to flow files by the extension |  [optional]
**stateful** | [**Stateful**](Stateful.md) |  |  [optional]
**restricted** | [**Restricted**](Restricted.md) |  |  [optional]
**inputRequirement** | [**InputRequirementEnum**](#InputRequirementEnum) | The input requirement of the extension |  [optional]
**systemResourceConsiderations** | [**List&lt;SystemResourceConsideration&gt;**](SystemResourceConsideration.md) | The resource considerations of the extension |  [optional]
**seeAlso** | **List&lt;String&gt;** | The names of other extensions to see |  [optional]
**providedServiceAPIs** | [**List&lt;ProvidedServiceAPI&gt;**](ProvidedServiceAPI.md) | The service APIs provided by this extension |  [optional]
**defaultSettings** | [**DefaultSettings**](DefaultSettings.md) |  |  [optional]
**defaultSchedule** | [**DefaultSchedule**](DefaultSchedule.md) |  |  [optional]
**triggerSerially** | **Boolean** | Indicates that a processor should be triggered serially |  [optional]
**triggerWhenEmpty** | **Boolean** | Indicates that a processor should be triggered when the incoming queues are empty |  [optional]
**triggerWhenAnyDestinationAvailable** | **Boolean** | Indicates that a processor should be triggered when any destinations have space for flow files |  [optional]
**supportsBatching** | **Boolean** | Indicates that a processor supports batching |  [optional]
**eventDriven** | **Boolean** | Indicates that a processor supports event driven scheduling |  [optional]
**primaryNodeOnly** | **Boolean** | Indicates that a processor should be scheduled only on the primary node |  [optional]
**sideEffectFree** | **Boolean** | Indicates that a processor is side effect free |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;
REPORTING_TASK | &quot;REPORTING_TASK&quot;

<a name="InputRequirementEnum"></a>
## Enum: InputRequirementEnum
Name | Value
---- | -----
REQUIRED | &quot;INPUT_REQUIRED&quot;
ALLOWED | &quot;INPUT_ALLOWED&quot;
FORBIDDEN | &quot;INPUT_FORBIDDEN&quot;
