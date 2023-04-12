/*
 * Apache NiFi Registry REST API
 * The REST API provides an interface to a registry with operations for saving, versioning, reading NiFi flows and components.
 *
 * OpenAPI spec version: 1.20.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.asamoal.nifi_registry.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.asamoal.nifi_registry.swagger.client.model.ExtensionFilterParams;
import com.github.asamoal.nifi_registry.swagger.client.model.ExtensionMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ExtensionMetadataContainer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T16:35:44.644520+02:00[Europe/Berlin]")
public class ExtensionMetadataContainer {
  @SerializedName("numResults")
  private Integer numResults = null;

  @SerializedName("filterParams")
  private ExtensionFilterParams filterParams = null;

  @SerializedName("extensions")
  private List<ExtensionMetadata> extensions = null;

  public ExtensionMetadataContainer numResults(Integer numResults) {
    this.numResults = numResults;
    return this;
  }

   /**
   * The number of extensions in the response
   * @return numResults
  **/
  @Schema(description = "The number of extensions in the response")
  public Integer getNumResults() {
    return numResults;
  }

  public void setNumResults(Integer numResults) {
    this.numResults = numResults;
  }

  public ExtensionMetadataContainer filterParams(ExtensionFilterParams filterParams) {
    this.filterParams = filterParams;
    return this;
  }

   /**
   * Get filterParams
   * @return filterParams
  **/
  @Schema(description = "")
  public ExtensionFilterParams getFilterParams() {
    return filterParams;
  }

  public void setFilterParams(ExtensionFilterParams filterParams) {
    this.filterParams = filterParams;
  }

  public ExtensionMetadataContainer extensions(List<ExtensionMetadata> extensions) {
    this.extensions = extensions;
    return this;
  }

  public ExtensionMetadataContainer addExtensionsItem(ExtensionMetadata extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<ExtensionMetadata>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * The metadata for the extensions
   * @return extensions
  **/
  @Schema(description = "The metadata for the extensions")
  public List<ExtensionMetadata> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<ExtensionMetadata> extensions) {
    this.extensions = extensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionMetadataContainer extensionMetadataContainer = (ExtensionMetadataContainer) o;
    return Objects.equals(this.numResults, extensionMetadataContainer.numResults) &&
        Objects.equals(this.filterParams, extensionMetadataContainer.filterParams) &&
        Objects.equals(this.extensions, extensionMetadataContainer.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numResults, filterParams, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionMetadataContainer {\n");
    
    sb.append("    numResults: ").append(toIndentedString(numResults)).append("\n");
    sb.append("    filterParams: ").append(toIndentedString(filterParams)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
