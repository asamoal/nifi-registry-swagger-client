# ResourceDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardinality** | [**CardinalityEnum**](#CardinalityEnum) | The cardinality of the resource definition |  [optional]
**resourceTypes** | [**List&lt;ResourceTypesEnum&gt;**](#List&lt;ResourceTypesEnum&gt;) | The types of resources |  [optional]

<a name="CardinalityEnum"></a>
## Enum: CardinalityEnum
Name | Value
---- | -----
SINGLE | &quot;SINGLE&quot;
MULTIPLE | &quot;MULTIPLE&quot;

<a name="List<ResourceTypesEnum>"></a>
## Enum: List&lt;ResourceTypesEnum&gt;
Name | Value
---- | -----
FILE | &quot;FILE&quot;
DIRECTORY | &quot;DIRECTORY&quot;
TEXT | &quot;TEXT&quot;
URL | &quot;URL&quot;
