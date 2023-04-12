# ExtensionFilterParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bundleType** | [**BundleTypeEnum**](#BundleTypeEnum) | The type of bundle |  [optional]
**extensionType** | [**ExtensionTypeEnum**](#ExtensionTypeEnum) | The type of extension |  [optional]
**tags** | **List&lt;String&gt;** | The tags |  [optional]

<a name="BundleTypeEnum"></a>
## Enum: BundleTypeEnum
Name | Value
---- | -----
NIFI_NAR | &quot;NIFI_NAR&quot;
MINIFI_CPP | &quot;MINIFI_CPP&quot;

<a name="ExtensionTypeEnum"></a>
## Enum: ExtensionTypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;
REPORTING_TASK | &quot;REPORTING_TASK&quot;
