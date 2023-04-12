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
import com.github.asamoal.nifi_registry.swagger.client.model.Bundle;
import com.github.asamoal.nifi_registry.swagger.client.model.ControllerServiceAPI;
import com.github.asamoal.nifi_registry.swagger.client.model.Position;
import com.github.asamoal.nifi_registry.swagger.client.model.VersionedPropertyDescriptor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * VersionedControllerService
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class VersionedControllerService {
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

  @SerializedName("type")
  private String type = null;

  @SerializedName("bundle")
  private Bundle bundle = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("propertyDescriptors")
  private Map<String, VersionedPropertyDescriptor> propertyDescriptors = null;

  @SerializedName("controllerServiceApis")
  private List<ControllerServiceAPI> controllerServiceApis = null;

  @SerializedName("annotationData")
  private String annotationData = null;

  /**
   * The ScheduledState denoting whether the Controller Service is ENABLED or DISABLED
   */
  @JsonAdapter(ScheduledStateEnum.Adapter.class)
  public enum ScheduledStateEnum {
    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    RUNNING("RUNNING");

    private String value;

    ScheduledStateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ScheduledStateEnum fromValue(String input) {
      for (ScheduledStateEnum b : ScheduledStateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ScheduledStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScheduledStateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ScheduledStateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ScheduledStateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("scheduledState")
  private ScheduledStateEnum scheduledState = null;

  @SerializedName("bulletinLevel")
  private String bulletinLevel = null;

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

  public VersionedControllerService identifier(String identifier) {
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

  public VersionedControllerService instanceIdentifier(String instanceIdentifier) {
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

  public VersionedControllerService name(String name) {
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

  public VersionedControllerService comments(String comments) {
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

  public VersionedControllerService position(Position position) {
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

  public VersionedControllerService type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the extension component
   * @return type
  **/
  @Schema(description = "The type of the extension component")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VersionedControllerService bundle(Bundle bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * Get bundle
   * @return bundle
  **/
  @Schema(description = "")
  public Bundle getBundle() {
    return bundle;
  }

  public void setBundle(Bundle bundle) {
    this.bundle = bundle;
  }

  public VersionedControllerService properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public VersionedControllerService putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties for the component. Properties whose value is not set will only contain the property name.
   * @return properties
  **/
  @Schema(description = "The properties for the component. Properties whose value is not set will only contain the property name.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public VersionedControllerService propertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
    this.propertyDescriptors = propertyDescriptors;
    return this;
  }

  public VersionedControllerService putPropertyDescriptorsItem(String key, VersionedPropertyDescriptor propertyDescriptorsItem) {
    if (this.propertyDescriptors == null) {
      this.propertyDescriptors = new HashMap<String, VersionedPropertyDescriptor>();
    }
    this.propertyDescriptors.put(key, propertyDescriptorsItem);
    return this;
  }

   /**
   * The property descriptors for the component.
   * @return propertyDescriptors
  **/
  @Schema(description = "The property descriptors for the component.")
  public Map<String, VersionedPropertyDescriptor> getPropertyDescriptors() {
    return propertyDescriptors;
  }

  public void setPropertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
    this.propertyDescriptors = propertyDescriptors;
  }

  public VersionedControllerService controllerServiceApis(List<ControllerServiceAPI> controllerServiceApis) {
    this.controllerServiceApis = controllerServiceApis;
    return this;
  }

  public VersionedControllerService addControllerServiceApisItem(ControllerServiceAPI controllerServiceApisItem) {
    if (this.controllerServiceApis == null) {
      this.controllerServiceApis = new ArrayList<ControllerServiceAPI>();
    }
    this.controllerServiceApis.add(controllerServiceApisItem);
    return this;
  }

   /**
   * Lists the APIs this Controller Service implements.
   * @return controllerServiceApis
  **/
  @Schema(description = "Lists the APIs this Controller Service implements.")
  public List<ControllerServiceAPI> getControllerServiceApis() {
    return controllerServiceApis;
  }

  public void setControllerServiceApis(List<ControllerServiceAPI> controllerServiceApis) {
    this.controllerServiceApis = controllerServiceApis;
  }

  public VersionedControllerService annotationData(String annotationData) {
    this.annotationData = annotationData;
    return this;
  }

   /**
   * The annotation for the controller service. This is how the custom UI relays configuration to the controller service.
   * @return annotationData
  **/
  @Schema(description = "The annotation for the controller service. This is how the custom UI relays configuration to the controller service.")
  public String getAnnotationData() {
    return annotationData;
  }

  public void setAnnotationData(String annotationData) {
    this.annotationData = annotationData;
  }

  public VersionedControllerService scheduledState(ScheduledStateEnum scheduledState) {
    this.scheduledState = scheduledState;
    return this;
  }

   /**
   * The ScheduledState denoting whether the Controller Service is ENABLED or DISABLED
   * @return scheduledState
  **/
  @Schema(description = "The ScheduledState denoting whether the Controller Service is ENABLED or DISABLED")
  public ScheduledStateEnum getScheduledState() {
    return scheduledState;
  }

  public void setScheduledState(ScheduledStateEnum scheduledState) {
    this.scheduledState = scheduledState;
  }

  public VersionedControllerService bulletinLevel(String bulletinLevel) {
    this.bulletinLevel = bulletinLevel;
    return this;
  }

   /**
   * The level at which the controller service will report bulletins.
   * @return bulletinLevel
  **/
  @Schema(description = "The level at which the controller service will report bulletins.")
  public String getBulletinLevel() {
    return bulletinLevel;
  }

  public void setBulletinLevel(String bulletinLevel) {
    this.bulletinLevel = bulletinLevel;
  }

  public VersionedControllerService componentType(ComponentTypeEnum componentType) {
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

  public VersionedControllerService groupIdentifier(String groupIdentifier) {
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
    VersionedControllerService versionedControllerService = (VersionedControllerService) o;
    return Objects.equals(this.identifier, versionedControllerService.identifier) &&
        Objects.equals(this.instanceIdentifier, versionedControllerService.instanceIdentifier) &&
        Objects.equals(this.name, versionedControllerService.name) &&
        Objects.equals(this.comments, versionedControllerService.comments) &&
        Objects.equals(this.position, versionedControllerService.position) &&
        Objects.equals(this.type, versionedControllerService.type) &&
        Objects.equals(this.bundle, versionedControllerService.bundle) &&
        Objects.equals(this.properties, versionedControllerService.properties) &&
        Objects.equals(this.propertyDescriptors, versionedControllerService.propertyDescriptors) &&
        Objects.equals(this.controllerServiceApis, versionedControllerService.controllerServiceApis) &&
        Objects.equals(this.annotationData, versionedControllerService.annotationData) &&
        Objects.equals(this.scheduledState, versionedControllerService.scheduledState) &&
        Objects.equals(this.bulletinLevel, versionedControllerService.bulletinLevel) &&
        Objects.equals(this.componentType, versionedControllerService.componentType) &&
        Objects.equals(this.groupIdentifier, versionedControllerService.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, instanceIdentifier, name, comments, position, type, bundle, properties, propertyDescriptors, controllerServiceApis, annotationData, scheduledState, bulletinLevel, componentType, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedControllerService {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    instanceIdentifier: ").append(toIndentedString(instanceIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    propertyDescriptors: ").append(toIndentedString(propertyDescriptors)).append("\n");
    sb.append("    controllerServiceApis: ").append(toIndentedString(controllerServiceApis)).append("\n");
    sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
    sb.append("    scheduledState: ").append(toIndentedString(scheduledState)).append("\n");
    sb.append("    bulletinLevel: ").append(toIndentedString(bulletinLevel)).append("\n");
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
