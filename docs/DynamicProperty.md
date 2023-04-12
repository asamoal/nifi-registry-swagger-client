# DynamicProperty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The description of the dynamic property name |  [optional]
**value** | **String** | The description of the dynamic property value |  [optional]
**description** | **String** | The description of the dynamic property |  [optional]
**expressionLanguageScope** | [**ExpressionLanguageScopeEnum**](#ExpressionLanguageScopeEnum) | The scope of the expression language support |  [optional]
**expressionLanguageSupported** | **Boolean** | Whether or not expression language is supported |  [optional]

<a name="ExpressionLanguageScopeEnum"></a>
## Enum: ExpressionLanguageScopeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
VARIABLE_REGISTRY | &quot;VARIABLE_REGISTRY&quot;
FLOWFILE_ATTRIBUTES | &quot;FLOWFILE_ATTRIBUTES&quot;
