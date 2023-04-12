# ExtensionBundle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**JaxbLink**](JaxbLink.md) |  |  [optional]
**identifier** | **String** | An ID to uniquely identify this object. |  [optional]
**name** | **String** | The name of the item. | 
**description** | **String** | A description of the item. |  [optional]
**bucketIdentifier** | **String** | The identifier of the bucket this items belongs to. This cannot be changed after the item is created. | 
**bucketName** | **String** | The name of the bucket this items belongs to. |  [optional]
**createdTimestamp** | **Long** | The timestamp of when the item was created, as milliseconds since epoch. |  [optional]
**modifiedTimestamp** | **Long** | The timestamp of when the item was last modified, as milliseconds since epoch. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of item. | 
**permissions** | [**Permissions**](Permissions.md) |  |  [optional]
**bundleType** | [**BundleTypeEnum**](#BundleTypeEnum) | The type of the extension bundle | 
**groupId** | **String** | The group id of the extension bundle |  [optional]
**artifactId** | **String** | The artifact id of the extension bundle |  [optional]
**versionCount** | **Long** | The number of versions of this extension bundle. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FLOW | &quot;Flow&quot;
BUNDLE | &quot;Bundle&quot;

<a name="BundleTypeEnum"></a>
## Enum: BundleTypeEnum
Name | Value
---- | -----
NIFI_NAR | &quot;NIFI_NAR&quot;
MINIFI_CPP | &quot;MINIFI_CPP&quot;
