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
 * DynamicProperty
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T14:23:29.468928+02:00[Europe/Berlin]")
public class DynamicProperty {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("description")
  private String description = null;

  /**
   * The scope of the expression language support
   */
  @JsonAdapter(ExpressionLanguageScopeEnum.Adapter.class)
  public enum ExpressionLanguageScopeEnum {
    NONE("NONE"),
    VARIABLE_REGISTRY("VARIABLE_REGISTRY"),
    FLOWFILE_ATTRIBUTES("FLOWFILE_ATTRIBUTES");

    private String value;

    ExpressionLanguageScopeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ExpressionLanguageScopeEnum fromValue(String input) {
      for (ExpressionLanguageScopeEnum b : ExpressionLanguageScopeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ExpressionLanguageScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExpressionLanguageScopeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ExpressionLanguageScopeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ExpressionLanguageScopeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("expressionLanguageScope")
  private ExpressionLanguageScopeEnum expressionLanguageScope = null;

  @SerializedName("expressionLanguageSupported")
  private Boolean expressionLanguageSupported = null;

  public DynamicProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The description of the dynamic property name
   * @return name
  **/
  @Schema(description = "The description of the dynamic property name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DynamicProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The description of the dynamic property value
   * @return value
  **/
  @Schema(description = "The description of the dynamic property value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DynamicProperty description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the dynamic property
   * @return description
  **/
  @Schema(description = "The description of the dynamic property")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DynamicProperty expressionLanguageScope(ExpressionLanguageScopeEnum expressionLanguageScope) {
    this.expressionLanguageScope = expressionLanguageScope;
    return this;
  }

   /**
   * The scope of the expression language support
   * @return expressionLanguageScope
  **/
  @Schema(description = "The scope of the expression language support")
  public ExpressionLanguageScopeEnum getExpressionLanguageScope() {
    return expressionLanguageScope;
  }

  public void setExpressionLanguageScope(ExpressionLanguageScopeEnum expressionLanguageScope) {
    this.expressionLanguageScope = expressionLanguageScope;
  }

  public DynamicProperty expressionLanguageSupported(Boolean expressionLanguageSupported) {
    this.expressionLanguageSupported = expressionLanguageSupported;
    return this;
  }

   /**
   * Whether or not expression language is supported
   * @return expressionLanguageSupported
  **/
  @Schema(description = "Whether or not expression language is supported")
  public Boolean isExpressionLanguageSupported() {
    return expressionLanguageSupported;
  }

  public void setExpressionLanguageSupported(Boolean expressionLanguageSupported) {
    this.expressionLanguageSupported = expressionLanguageSupported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicProperty dynamicProperty = (DynamicProperty) o;
    return Objects.equals(this.name, dynamicProperty.name) &&
        Objects.equals(this.value, dynamicProperty.value) &&
        Objects.equals(this.description, dynamicProperty.description) &&
        Objects.equals(this.expressionLanguageScope, dynamicProperty.expressionLanguageScope) &&
        Objects.equals(this.expressionLanguageSupported, dynamicProperty.expressionLanguageSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, description, expressionLanguageScope, expressionLanguageSupported);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicProperty {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expressionLanguageScope: ").append(toIndentedString(expressionLanguageScope)).append("\n");
    sb.append("    expressionLanguageSupported: ").append(toIndentedString(expressionLanguageSupported)).append("\n");
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
