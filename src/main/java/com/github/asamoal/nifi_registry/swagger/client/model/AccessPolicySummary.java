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
import com.github.asamoal.nifi_registry.swagger.client.model.RevisionInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AccessPolicySummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class AccessPolicySummary {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("resource")
  private String resource = null;

  /**
   * The action associated with this access policy.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    READ("read"),
    WRITE("write"),
    DELETE("delete");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ActionEnum fromValue(String input) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ActionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("configurable")
  private Boolean configurable = null;

  @SerializedName("revision")
  private RevisionInfo revision = null;

   /**
   * The id of the policy. Set by server at creation time.
   * @return identifier
  **/
  @Schema(description = "The id of the policy. Set by server at creation time.")
  public String getIdentifier() {
    return identifier;
  }

  public AccessPolicySummary resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * The resource for this access policy.
   * @return resource
  **/
  @Schema(required = true, description = "The resource for this access policy.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public AccessPolicySummary action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * The action associated with this access policy.
   * @return action
  **/
  @Schema(required = true, description = "The action associated with this access policy.")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

   /**
   * Indicates if this access policy is configurable, based on which Authorizer has been configured to manage it.
   * @return configurable
  **/
  @Schema(description = "Indicates if this access policy is configurable, based on which Authorizer has been configured to manage it.")
  public Boolean isConfigurable() {
    return configurable;
  }

  public AccessPolicySummary revision(RevisionInfo revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @Schema(description = "")
  public RevisionInfo getRevision() {
    return revision;
  }

  public void setRevision(RevisionInfo revision) {
    this.revision = revision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPolicySummary accessPolicySummary = (AccessPolicySummary) o;
    return Objects.equals(this.identifier, accessPolicySummary.identifier) &&
        Objects.equals(this.resource, accessPolicySummary.resource) &&
        Objects.equals(this.action, accessPolicySummary.action) &&
        Objects.equals(this.configurable, accessPolicySummary.configurable) &&
        Objects.equals(this.revision, accessPolicySummary.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, resource, action, configurable, revision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPolicySummary {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
