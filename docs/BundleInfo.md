# BundleInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | The id of the bucket where the bundle is located |  [optional]
**bucketName** | **String** | The name of the bucket where the bundle is located |  [optional]
**bundleId** | **String** | The id of the bundle |  [optional]
**bundleType** | [**BundleTypeEnum**](#BundleTypeEnum) | The type of bundle (i.e. a NiFi NAR vs MiNiFi CPP) |  [optional]
**groupId** | **String** | The group id of the bundle |  [optional]
**artifactId** | **String** | The artifact id of the bundle |  [optional]
**version** | **String** | The version of the bundle |  [optional]
**systemApiVersion** | **String** | The version of the system API the bundle was built against |  [optional]

<a name="BundleTypeEnum"></a>
## Enum: BundleTypeEnum
Name | Value
---- | -----
NIFI_NAR | &quot;NIFI_NAR&quot;
MINIFI_CPP | &quot;MINIFI_CPP&quot;
