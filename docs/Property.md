# Property

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the property |  [optional]
**displayName** | **String** | The display name |  [optional]
**description** | **String** | The description |  [optional]
**defaultValue** | **String** | The default value |  [optional]
**controllerServiceDefinition** | [**ControllerServiceDefinition**](ControllerServiceDefinition.md) |  |  [optional]
**allowableValues** | [**List&lt;AllowableValue&gt;**](AllowableValue.md) | The allowable values for this property |  [optional]
**required** | **Boolean** | Whether or not the property is required |  [optional]
**sensitive** | **Boolean** | Whether or not the property is sensitive |  [optional]
**expressionLanguageSupported** | **Boolean** | Whether or not expression language is supported |  [optional]
**expressionLanguageScope** | [**ExpressionLanguageScopeEnum**](#ExpressionLanguageScopeEnum) | The scope of expression language support |  [optional]
**dynamicallyModifiesClasspath** | **Boolean** | Whether or not the processor dynamically modifies the classpath |  [optional]
**dynamic** | **Boolean** | Whether or not the processor is dynamic |  [optional]
**dependencies** | [**List&lt;Dependency&gt;**](Dependency.md) | The properties that this property depends on |  [optional]
**resourceDefinition** | [**ResourceDefinition**](ResourceDefinition.md) |  |  [optional]

<a name="ExpressionLanguageScopeEnum"></a>
## Enum: ExpressionLanguageScopeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
VARIABLE_REGISTRY | &quot;VARIABLE_REGISTRY&quot;
FLOWFILE_ATTRIBUTES | &quot;FLOWFILE_ATTRIBUTES&quot;
