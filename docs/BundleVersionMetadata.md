# BundleVersionMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**JaxbLink**](JaxbLink.md) |  |  [optional]
**id** | **String** | The id of this version of the extension bundle |  [optional]
**bundleId** | **String** | The id of the extension bundle this version is for |  [optional]
**bucketId** | **String** | The id of the bucket the extension bundle belongs to | 
**groupId** | **String** |  |  [optional]
**artifactId** | **String** |  |  [optional]
**version** | **String** | The version of the extension bundle |  [optional]
**timestamp** | **Long** | The timestamp of the create date of this version |  [optional]
**author** | **String** | The identity that created this version |  [optional]
**description** | **String** | The description for this version |  [optional]
**sha256** | **String** | The hex representation of the SHA-256 digest of the binary content for this version |  [optional]
**sha256Supplied** | **Boolean** | Whether or not the client supplied a SHA-256 when uploading the bundle | 
**contentSize** | **Long** | The size of the binary content for this version in bytes | 
**systemApiVersion** | **String** | The version of the system API that this bundle version was built against |  [optional]
**buildInfo** | [**BuildInfo**](BuildInfo.md) |  | 
