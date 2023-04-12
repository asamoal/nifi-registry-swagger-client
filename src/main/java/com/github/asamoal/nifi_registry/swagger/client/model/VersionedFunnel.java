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
import com.github.asamoal.nifi_registry.swagger.client.model.Position;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VersionedFunnel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class VersionedFunnel {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("instanceIdentifier")
  private String instanceIdentifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("position")
  private Position position = null;

  /**
   * Gets or Sets componentType
   */
  @JsonAdapter(ComponentTypeEnum.Adapter.class)
  public enum ComponentTypeEnum {
    CONNECTION("CONNECTION"),
    PROCESSOR("PROCESSOR"),
    PROCESS_GROUP("PROCESS_GROUP"),
    REMOTE_PROCESS_GROUP("REMOTE_PROCESS_GROUP"),
    INPUT_PORT("INPUT_PORT"),
    OUTPUT_PORT("OUTPUT_PORT"),
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),
    FUNNEL("FUNNEL"),
    LABEL("LABEL"),
    CONTROLLER_SERVICE("CONTROLLER_SERVICE"),
    REPORTING_TASK("REPORTING_TASK"),
    PARAMETER_CONTEXT("PARAMETER_CONTEXT"),
    PARAMETER_PROVIDER("PARAMETER_PROVIDER"),
    TEMPLATE("TEMPLATE"),
    FLOW_REGISTRY_CLIENT("FLOW_REGISTRY_CLIENT");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ComponentTypeEnum fromValue(String input) {
      for (ComponentTypeEnum b : ComponentTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ComponentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComponentTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ComponentTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ComponentTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("componentType")
  private ComponentTypeEnum componentType = null;

  @SerializedName("groupIdentifier")
  private String groupIdentifier = null;

  public VersionedFunnel identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The component&#x27;s unique identifier
   * @return identifier
  **/
  @Schema(description = "The component's unique identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public VersionedFunnel instanceIdentifier(String instanceIdentifier) {
    this.instanceIdentifier = instanceIdentifier;
    return this;
  }

   /**
   * The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component
   * @return instanceIdentifier
  **/
  @Schema(description = "The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component")
  public String getInstanceIdentifier() {
    return instanceIdentifier;
  }

  public void setInstanceIdentifier(String instanceIdentifier) {
    this.instanceIdentifier = instanceIdentifier;
  }

  public VersionedFunnel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The component&#x27;s name
   * @return name
  **/
  @Schema(description = "The component's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionedFunnel comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The user-supplied comments for the component
   * @return comments
  **/
  @Schema(description = "The user-supplied comments for the component")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public VersionedFunnel position(Position position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @Schema(description = "")
  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public VersionedFunnel componentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @Schema(description = "")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }

  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }

  public VersionedFunnel groupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
    return this;
  }

   /**
   * The ID of the Process Group that this component belongs to
   * @return groupIdentifier
  **/
  @Schema(description = "The ID of the Process Group that this component belongs to")
  public String getGroupIdentifier() {
    return groupIdentifier;
  }

  public void setGroupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedFunnel versionedFunnel = (VersionedFunnel) o;
    return Objects.equals(this.identifier, versionedFunnel.identifier) &&
        Objects.equals(this.instanceIdentifier, versionedFunnel.instanceIdentifier) &&
        Objects.equals(this.name, versionedFunnel.name) &&
        Objects.equals(this.comments, versionedFunnel.comments) &&
        Objects.equals(this.position, versionedFunnel.position) &&
        Objects.equals(this.componentType, versionedFunnel.componentType) &&
        Objects.equals(this.groupIdentifier, versionedFunnel.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, instanceIdentifier, name, comments, position, componentType, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFunnel {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    instanceIdentifier: ").append(toIndentedString(instanceIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
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