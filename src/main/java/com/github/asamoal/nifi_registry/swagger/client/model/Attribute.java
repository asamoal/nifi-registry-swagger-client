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
 * Attribute
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class Attribute {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  public Attribute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the attribute
   * @return name
  **/
  @Schema(description = "The name of the attribute")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Attribute description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the attribute
   * @return description
  **/
  @Schema(description = "The description of the attribute")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attribute attribute = (Attribute) o;
    return Objects.equals(this.name, attribute.name) &&
        Objects.equals(this.description, attribute.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attribute {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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