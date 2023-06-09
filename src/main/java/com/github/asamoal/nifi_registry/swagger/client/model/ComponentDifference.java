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
 * ComponentDifference
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class ComponentDifference {
  @SerializedName("valueA")
  private String valueA = null;

  @SerializedName("valueB")
  private String valueB = null;

  @SerializedName("changeDescription")
  private String changeDescription = null;

  @SerializedName("differenceType")
  private String differenceType = null;

  @SerializedName("differenceTypeDescription")
  private String differenceTypeDescription = null;

  public ComponentDifference valueA(String valueA) {
    this.valueA = valueA;
    return this;
  }

   /**
   * The earlier value from the difference.
   * @return valueA
  **/
  @Schema(description = "The earlier value from the difference.")
  public String getValueA() {
    return valueA;
  }

  public void setValueA(String valueA) {
    this.valueA = valueA;
  }

  public ComponentDifference valueB(String valueB) {
    this.valueB = valueB;
    return this;
  }

   /**
   * The newer value from the difference.
   * @return valueB
  **/
  @Schema(description = "The newer value from the difference.")
  public String getValueB() {
    return valueB;
  }

  public void setValueB(String valueB) {
    this.valueB = valueB;
  }

  public ComponentDifference changeDescription(String changeDescription) {
    this.changeDescription = changeDescription;
    return this;
  }

   /**
   * The description of the change.
   * @return changeDescription
  **/
  @Schema(description = "The description of the change.")
  public String getChangeDescription() {
    return changeDescription;
  }

  public void setChangeDescription(String changeDescription) {
    this.changeDescription = changeDescription;
  }

  public ComponentDifference differenceType(String differenceType) {
    this.differenceType = differenceType;
    return this;
  }

   /**
   * The key to the difference.
   * @return differenceType
  **/
  @Schema(description = "The key to the difference.")
  public String getDifferenceType() {
    return differenceType;
  }

  public void setDifferenceType(String differenceType) {
    this.differenceType = differenceType;
  }

  public ComponentDifference differenceTypeDescription(String differenceTypeDescription) {
    this.differenceTypeDescription = differenceTypeDescription;
    return this;
  }

   /**
   * The description of the change type.
   * @return differenceTypeDescription
  **/
  @Schema(description = "The description of the change type.")
  public String getDifferenceTypeDescription() {
    return differenceTypeDescription;
  }

  public void setDifferenceTypeDescription(String differenceTypeDescription) {
    this.differenceTypeDescription = differenceTypeDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentDifference componentDifference = (ComponentDifference) o;
    return Objects.equals(this.valueA, componentDifference.valueA) &&
        Objects.equals(this.valueB, componentDifference.valueB) &&
        Objects.equals(this.changeDescription, componentDifference.changeDescription) &&
        Objects.equals(this.differenceType, componentDifference.differenceType) &&
        Objects.equals(this.differenceTypeDescription, componentDifference.differenceTypeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueA, valueB, changeDescription, differenceType, differenceTypeDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentDifference {\n");
    
    sb.append("    valueA: ").append(toIndentedString(valueA)).append("\n");
    sb.append("    valueB: ").append(toIndentedString(valueB)).append("\n");
    sb.append("    changeDescription: ").append(toIndentedString(changeDescription)).append("\n");
    sb.append("    differenceType: ").append(toIndentedString(differenceType)).append("\n");
    sb.append("    differenceTypeDescription: ").append(toIndentedString(differenceTypeDescription)).append("\n");
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
