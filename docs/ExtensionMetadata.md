# ExtensionMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**JaxbLink**](JaxbLink.md) |  |  [optional]
**name** | **String** | The name of the extension |  [optional]
**displayName** | **String** | The display name of the extension |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the extension |  [optional]
**description** | **String** | The description of the extension |  [optional]
**deprecationNotice** | [**DeprecationNotice**](DeprecationNotice.md) |  |  [optional]
**tags** | **List&lt;String&gt;** | The tags of the extension |  [optional]
**restricted** | [**Restricted**](Restricted.md) |  |  [optional]
**providedServiceAPIs** | [**List&lt;ProvidedServiceAPI&gt;**](ProvidedServiceAPI.md) | The service APIs provided by the extension |  [optional]
**bundleInfo** | [**BundleInfo**](BundleInfo.md) |  |  [optional]
**hasAdditionalDetails** | **Boolean** | Whether or not the extension has additional detail documentation |  [optional]
**linkDocs** | [**JaxbLink**](JaxbLink.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;
REPORTING_TASK | &quot;REPORTING_TASK&quot;
