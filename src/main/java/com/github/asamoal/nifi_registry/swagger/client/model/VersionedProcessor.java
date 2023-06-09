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
 * VersionedProcessor
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class VersionedProcessor {
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

  @SerializedName("style")
  private Map<String, String> style = null;

  @SerializedName("annotationData")
  private String annotationData = null;

  @SerializedName("schedulingPeriod")
  private String schedulingPeriod = null;

  @SerializedName("schedulingStrategy")
  private String schedulingStrategy = null;

  @SerializedName("executionNode")
  private String executionNode = null;

  @SerializedName("penaltyDuration")
  private String penaltyDuration = null;

  @SerializedName("yieldDuration")
  private String yieldDuration = null;

  @SerializedName("bulletinLevel")
  private String bulletinLevel = null;

  @SerializedName("runDurationMillis")
  private Long runDurationMillis = null;

  @SerializedName("concurrentlySchedulableTaskCount")
  private Integer concurrentlySchedulableTaskCount = null;

  @SerializedName("autoTerminatedRelationships")
  private List<String> autoTerminatedRelationships = null;

  /**
   * The scheduled state of the component
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

  @SerializedName("retryCount")
  private Integer retryCount = null;

  @SerializedName("retriedRelationships")
  private List<String> retriedRelationships = null;

  /**
   * Determines whether the FlowFile should be penalized or the processor should be yielded between retries.
   */
  @JsonAdapter(BackoffMechanismEnum.Adapter.class)
  public enum BackoffMechanismEnum {
    PENALIZE_FLOWFILE("PENALIZE_FLOWFILE"),
    YIELD_PROCESSOR("YIELD_PROCESSOR");

    private String value;

    BackoffMechanismEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BackoffMechanismEnum fromValue(String input) {
      for (BackoffMechanismEnum b : BackoffMechanismEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BackoffMechanismEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackoffMechanismEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public BackoffMechanismEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return BackoffMechanismEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("backoffMechanism")
  private BackoffMechanismEnum backoffMechanism = null;

  @SerializedName("maxBackoffPeriod")
  private String maxBackoffPeriod = null;

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

  public VersionedProcessor identifier(String identifier) {
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

  public VersionedProcessor instanceIdentifier(String instanceIdentifier) {
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

  public VersionedProcessor name(String name) {
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

  public VersionedProcessor comments(String comments) {
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

  public VersionedProcessor position(Position position) {
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

  public VersionedProcessor type(String type) {
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

  public VersionedProcessor bundle(Bundle bundle) {
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

  public VersionedProcessor properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public VersionedProcessor putPropertiesItem(String key, String propertiesItem) {
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

  public VersionedProcessor propertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
    this.propertyDescriptors = propertyDescriptors;
    return this;
  }

  public VersionedProcessor putPropertyDescriptorsItem(String key, VersionedPropertyDescriptor propertyDescriptorsItem) {
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

  public VersionedProcessor style(Map<String, String> style) {
    this.style = style;
    return this;
  }

  public VersionedProcessor putStyleItem(String key, String styleItem) {
    if (this.style == null) {
      this.style = new HashMap<String, String>();
    }
    this.style.put(key, styleItem);
    return this;
  }

   /**
   * Stylistic data for rendering in a UI
   * @return style
  **/
  @Schema(description = "Stylistic data for rendering in a UI")
  public Map<String, String> getStyle() {
    return style;
  }

  public void setStyle(Map<String, String> style) {
    this.style = style;
  }

  public VersionedProcessor annotationData(String annotationData) {
    this.annotationData = annotationData;
    return this;
  }

   /**
   * The annotation data for the processor used to relay configuration between a custom UI and the procesosr.
   * @return annotationData
  **/
  @Schema(description = "The annotation data for the processor used to relay configuration between a custom UI and the procesosr.")
  public String getAnnotationData() {
    return annotationData;
  }

  public void setAnnotationData(String annotationData) {
    this.annotationData = annotationData;
  }

  public VersionedProcessor schedulingPeriod(String schedulingPeriod) {
    this.schedulingPeriod = schedulingPeriod;
    return this;
  }

   /**
   * The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy.
   * @return schedulingPeriod
  **/
  @Schema(description = "The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy.")
  public String getSchedulingPeriod() {
    return schedulingPeriod;
  }

  public void setSchedulingPeriod(String schedulingPeriod) {
    this.schedulingPeriod = schedulingPeriod;
  }

  public VersionedProcessor schedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
    return this;
  }

   /**
   * Indicates whether the processor should be scheduled to run in event or timer driven mode.
   * @return schedulingStrategy
  **/
  @Schema(description = "Indicates whether the processor should be scheduled to run in event or timer driven mode.")
  public String getSchedulingStrategy() {
    return schedulingStrategy;
  }

  public void setSchedulingStrategy(String schedulingStrategy) {
    this.schedulingStrategy = schedulingStrategy;
  }

  public VersionedProcessor executionNode(String executionNode) {
    this.executionNode = executionNode;
    return this;
  }

   /**
   * Indicates the node where the process will execute.
   * @return executionNode
  **/
  @Schema(description = "Indicates the node where the process will execute.")
  public String getExecutionNode() {
    return executionNode;
  }

  public void setExecutionNode(String executionNode) {
    this.executionNode = executionNode;
  }

  public VersionedProcessor penaltyDuration(String penaltyDuration) {
    this.penaltyDuration = penaltyDuration;
    return this;
  }

   /**
   * The amout of time that is used when the process penalizes a flowfile.
   * @return penaltyDuration
  **/
  @Schema(description = "The amout of time that is used when the process penalizes a flowfile.")
  public String getPenaltyDuration() {
    return penaltyDuration;
  }

  public void setPenaltyDuration(String penaltyDuration) {
    this.penaltyDuration = penaltyDuration;
  }

  public VersionedProcessor yieldDuration(String yieldDuration) {
    this.yieldDuration = yieldDuration;
    return this;
  }

   /**
   * The amount of time that must elapse before this processor is scheduled again after yielding.
   * @return yieldDuration
  **/
  @Schema(description = "The amount of time that must elapse before this processor is scheduled again after yielding.")
  public String getYieldDuration() {
    return yieldDuration;
  }

  public void setYieldDuration(String yieldDuration) {
    this.yieldDuration = yieldDuration;
  }

  public VersionedProcessor bulletinLevel(String bulletinLevel) {
    this.bulletinLevel = bulletinLevel;
    return this;
  }

   /**
   * The level at which the processor will report bulletins.
   * @return bulletinLevel
  **/
  @Schema(description = "The level at which the processor will report bulletins.")
  public String getBulletinLevel() {
    return bulletinLevel;
  }

  public void setBulletinLevel(String bulletinLevel) {
    this.bulletinLevel = bulletinLevel;
  }

  public VersionedProcessor runDurationMillis(Long runDurationMillis) {
    this.runDurationMillis = runDurationMillis;
    return this;
  }

   /**
   * The run duration for the processor in milliseconds.
   * @return runDurationMillis
  **/
  @Schema(description = "The run duration for the processor in milliseconds.")
  public Long getRunDurationMillis() {
    return runDurationMillis;
  }

  public void setRunDurationMillis(Long runDurationMillis) {
    this.runDurationMillis = runDurationMillis;
  }

  public VersionedProcessor concurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
    return this;
  }

   /**
   * The number of tasks that should be concurrently schedule for the processor. If the processor doesn&#x27;t allow parallol processing then any positive input will be ignored.
   * @return concurrentlySchedulableTaskCount
  **/
  @Schema(description = "The number of tasks that should be concurrently schedule for the processor. If the processor doesn't allow parallol processing then any positive input will be ignored.")
  public Integer getConcurrentlySchedulableTaskCount() {
    return concurrentlySchedulableTaskCount;
  }

  public void setConcurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
  }

  public VersionedProcessor autoTerminatedRelationships(List<String> autoTerminatedRelationships) {
    this.autoTerminatedRelationships = autoTerminatedRelationships;
    return this;
  }

  public VersionedProcessor addAutoTerminatedRelationshipsItem(String autoTerminatedRelationshipsItem) {
    if (this.autoTerminatedRelationships == null) {
      this.autoTerminatedRelationships = new ArrayList<String>();
    }
    this.autoTerminatedRelationships.add(autoTerminatedRelationshipsItem);
    return this;
  }

   /**
   * The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the &#x27;isAutoTerminate&#x27; property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated.
   * @return autoTerminatedRelationships
  **/
  @Schema(description = "The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the 'isAutoTerminate' property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated.")
  public List<String> getAutoTerminatedRelationships() {
    return autoTerminatedRelationships;
  }

  public void setAutoTerminatedRelationships(List<String> autoTerminatedRelationships) {
    this.autoTerminatedRelationships = autoTerminatedRelationships;
  }

  public VersionedProcessor scheduledState(ScheduledStateEnum scheduledState) {
    this.scheduledState = scheduledState;
    return this;
  }

   /**
   * The scheduled state of the component
   * @return scheduledState
  **/
  @Schema(description = "The scheduled state of the component")
  public ScheduledStateEnum getScheduledState() {
    return scheduledState;
  }

  public void setScheduledState(ScheduledStateEnum scheduledState) {
    this.scheduledState = scheduledState;
  }

  public VersionedProcessor retryCount(Integer retryCount) {
    this.retryCount = retryCount;
    return this;
  }

   /**
   * Overall number of retries.
   * @return retryCount
  **/
  @Schema(description = "Overall number of retries.")
  public Integer getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(Integer retryCount) {
    this.retryCount = retryCount;
  }

  public VersionedProcessor retriedRelationships(List<String> retriedRelationships) {
    this.retriedRelationships = retriedRelationships;
    return this;
  }

  public VersionedProcessor addRetriedRelationshipsItem(String retriedRelationshipsItem) {
    if (this.retriedRelationships == null) {
      this.retriedRelationships = new ArrayList<String>();
    }
    this.retriedRelationships.add(retriedRelationshipsItem);
    return this;
  }

   /**
   * All the relationships should be retried.
   * @return retriedRelationships
  **/
  @Schema(description = "All the relationships should be retried.")
  public List<String> getRetriedRelationships() {
    return retriedRelationships;
  }

  public void setRetriedRelationships(List<String> retriedRelationships) {
    this.retriedRelationships = retriedRelationships;
  }

  public VersionedProcessor backoffMechanism(BackoffMechanismEnum backoffMechanism) {
    this.backoffMechanism = backoffMechanism;
    return this;
  }

   /**
   * Determines whether the FlowFile should be penalized or the processor should be yielded between retries.
   * @return backoffMechanism
  **/
  @Schema(description = "Determines whether the FlowFile should be penalized or the processor should be yielded between retries.")
  public BackoffMechanismEnum getBackoffMechanism() {
    return backoffMechanism;
  }

  public void setBackoffMechanism(BackoffMechanismEnum backoffMechanism) {
    this.backoffMechanism = backoffMechanism;
  }

  public VersionedProcessor maxBackoffPeriod(String maxBackoffPeriod) {
    this.maxBackoffPeriod = maxBackoffPeriod;
    return this;
  }

   /**
   * Maximum amount of time to be waited during a retry period.
   * @return maxBackoffPeriod
  **/
  @Schema(description = "Maximum amount of time to be waited during a retry period.")
  public String getMaxBackoffPeriod() {
    return maxBackoffPeriod;
  }

  public void setMaxBackoffPeriod(String maxBackoffPeriod) {
    this.maxBackoffPeriod = maxBackoffPeriod;
  }

  public VersionedProcessor componentType(ComponentTypeEnum componentType) {
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

  public VersionedProcessor groupIdentifier(String groupIdentifier) {
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
    VersionedProcessor versionedProcessor = (VersionedProcessor) o;
    return Objects.equals(this.identifier, versionedProcessor.identifier) &&
        Objects.equals(this.instanceIdentifier, versionedProcessor.instanceIdentifier) &&
        Objects.equals(this.name, versionedProcessor.name) &&
        Objects.equals(this.comments, versionedProcessor.comments) &&
        Objects.equals(this.position, versionedProcessor.position) &&
        Objects.equals(this.type, versionedProcessor.type) &&
        Objects.equals(this.bundle, versionedProcessor.bundle) &&
        Objects.equals(this.properties, versionedProcessor.properties) &&
        Objects.equals(this.propertyDescriptors, versionedProcessor.propertyDescriptors) &&
        Objects.equals(this.style, versionedProcessor.style) &&
        Objects.equals(this.annotationData, versionedProcessor.annotationData) &&
        Objects.equals(this.schedulingPeriod, versionedProcessor.schedulingPeriod) &&
        Objects.equals(this.schedulingStrategy, versionedProcessor.schedulingStrategy) &&
        Objects.equals(this.executionNode, versionedProcessor.executionNode) &&
        Objects.equals(this.penaltyDuration, versionedProcessor.penaltyDuration) &&
        Objects.equals(this.yieldDuration, versionedProcessor.yieldDuration) &&
        Objects.equals(this.bulletinLevel, versionedProcessor.bulletinLevel) &&
        Objects.equals(this.runDurationMillis, versionedProcessor.runDurationMillis) &&
        Objects.equals(this.concurrentlySchedulableTaskCount, versionedProcessor.concurrentlySchedulableTaskCount) &&
        Objects.equals(this.autoTerminatedRelationships, versionedProcessor.autoTerminatedRelationships) &&
        Objects.equals(this.scheduledState, versionedProcessor.scheduledState) &&
        Objects.equals(this.retryCount, versionedProcessor.retryCount) &&
        Objects.equals(this.retriedRelationships, versionedProcessor.retriedRelationships) &&
        Objects.equals(this.backoffMechanism, versionedProcessor.backoffMechanism) &&
        Objects.equals(this.maxBackoffPeriod, versionedProcessor.maxBackoffPeriod) &&
        Objects.equals(this.componentType, versionedProcessor.componentType) &&
        Objects.equals(this.groupIdentifier, versionedProcessor.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, instanceIdentifier, name, comments, position, type, bundle, properties, propertyDescriptors, style, annotationData, schedulingPeriod, schedulingStrategy, executionNode, penaltyDuration, yieldDuration, bulletinLevel, runDurationMillis, concurrentlySchedulableTaskCount, autoTerminatedRelationships, scheduledState, retryCount, retriedRelationships, backoffMechanism, maxBackoffPeriod, componentType, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedProcessor {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    instanceIdentifier: ").append(toIndentedString(instanceIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    propertyDescriptors: ").append(toIndentedString(propertyDescriptors)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
    sb.append("    schedulingPeriod: ").append(toIndentedString(schedulingPeriod)).append("\n");
    sb.append("    schedulingStrategy: ").append(toIndentedString(schedulingStrategy)).append("\n");
    sb.append("    executionNode: ").append(toIndentedString(executionNode)).append("\n");
    sb.append("    penaltyDuration: ").append(toIndentedString(penaltyDuration)).append("\n");
    sb.append("    yieldDuration: ").append(toIndentedString(yieldDuration)).append("\n");
    sb.append("    bulletinLevel: ").append(toIndentedString(bulletinLevel)).append("\n");
    sb.append("    runDurationMillis: ").append(toIndentedString(runDurationMillis)).append("\n");
    sb.append("    concurrentlySchedulableTaskCount: ").append(toIndentedString(concurrentlySchedulableTaskCount)).append("\n");
    sb.append("    autoTerminatedRelationships: ").append(toIndentedString(autoTerminatedRelationships)).append("\n");
    sb.append("    scheduledState: ").append(toIndentedString(scheduledState)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    retriedRelationships: ").append(toIndentedString(retriedRelationships)).append("\n");
    sb.append("    backoffMechanism: ").append(toIndentedString(backoffMechanism)).append("\n");
    sb.append("    maxBackoffPeriod: ").append(toIndentedString(maxBackoffPeriod)).append("\n");
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
