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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ControllerServiceDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class ControllerServiceDefinition {
  @SerializedName("className")
  private String className = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("artifactId")
  private String artifactId = null;

  @SerializedName("version")
  private String version = null;

  public ControllerServiceDefinition className(String className) {
    this.className = className;
    return this;
  }

   /**
   * The class name of the service API
   * @return className
  **/
  @Schema(description = "The class name of the service API")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public ControllerServiceDefinition groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The group id of the service API
   * @return groupId
  **/
  @Schema(description = "The group id of the service API")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ControllerServiceDefinition artifactId(String artifactId) {
    this.artifactId = artifactId;
    return this;
  }

   /**
   * The artifact id of the service API
   * @return artifactId
  **/
  @Schema(description = "The artifact id of the service API")
  public String getArtifactId() {
    return artifactId;
  }

  public void setArtifactId(String artifactId) {
    this.artifactId = artifactId;
  }

  public ControllerServiceDefinition version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the service API
   * @return version
  **/
  @Schema(description = "The version of the service API")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServiceDefinition controllerServiceDefinition = (ControllerServiceDefinition) o;
    return Objects.equals(this.className, controllerServiceDefinition.className) &&
        Objects.equals(this.groupId, controllerServiceDefinition.groupId) &&
        Objects.equals(this.artifactId, controllerServiceDefinition.artifactId) &&
        Objects.equals(this.version, controllerServiceDefinition.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, groupId, artifactId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServiceDefinition {\n");
    
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
