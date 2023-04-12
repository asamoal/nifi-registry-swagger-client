/*
 * Apache NiFi Registry REST API
 * The REST API provides an interface to a registry with operations for saving, versioning, reading NiFi flows and components.
 *
 * OpenAPI spec version: 1.19.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.asamoal.nifi_registry.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.asamoal.nifi_registry.swagger.client.model.VersionedResourceDefinition;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VersionedPropertyDescriptor
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class VersionedPropertyDescriptor {
  @SerializedName("name")
  private String name = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("identifiesControllerService")
  private Boolean identifiesControllerService = null;

  @SerializedName("sensitive")
  private Boolean sensitive = null;

  @SerializedName("resourceDefinition")
  private VersionedResourceDefinition resourceDefinition = null;

  public VersionedPropertyDescriptor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the property
   * @return name
  **/
  @Schema(description = "The name of the property")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionedPropertyDescriptor displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the property
   * @return displayName
  **/
  @Schema(description = "The display name of the property")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public VersionedPropertyDescriptor identifiesControllerService(Boolean identifiesControllerService) {
    this.identifiesControllerService = identifiesControllerService;
    return this;
  }

   /**
   * Whether or not the property provides the identifier of a Controller Service
   * @return identifiesControllerService
  **/
  @Schema(description = "Whether or not the property provides the identifier of a Controller Service")
  public Boolean isIdentifiesControllerService() {
    return identifiesControllerService;
  }

  public void setIdentifiesControllerService(Boolean identifiesControllerService) {
    this.identifiesControllerService = identifiesControllerService;
  }

  public VersionedPropertyDescriptor sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

   /**
   * Whether or not the property is considered sensitive
   * @return sensitive
  **/
  @Schema(description = "Whether or not the property is considered sensitive")
  public Boolean isSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public VersionedPropertyDescriptor resourceDefinition(VersionedResourceDefinition resourceDefinition) {
    this.resourceDefinition = resourceDefinition;
    return this;
  }

   /**
   * Get resourceDefinition
   * @return resourceDefinition
  **/
  @Schema(description = "")
  public VersionedResourceDefinition getResourceDefinition() {
    return resourceDefinition;
  }

  public void setResourceDefinition(VersionedResourceDefinition resourceDefinition) {
    this.resourceDefinition = resourceDefinition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedPropertyDescriptor versionedPropertyDescriptor = (VersionedPropertyDescriptor) o;
    return Objects.equals(this.name, versionedPropertyDescriptor.name) &&
        Objects.equals(this.displayName, versionedPropertyDescriptor.displayName) &&
        Objects.equals(this.identifiesControllerService, versionedPropertyDescriptor.identifiesControllerService) &&
        Objects.equals(this.sensitive, versionedPropertyDescriptor.sensitive) &&
        Objects.equals(this.resourceDefinition, versionedPropertyDescriptor.resourceDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, identifiesControllerService, sensitive, resourceDefinition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedPropertyDescriptor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    identifiesControllerService: ").append(toIndentedString(identifiesControllerService)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    resourceDefinition: ").append(toIndentedString(resourceDefinition)).append("\n");
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