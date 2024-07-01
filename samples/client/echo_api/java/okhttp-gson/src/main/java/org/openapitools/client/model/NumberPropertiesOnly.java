/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * NumberPropertiesOnly
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class NumberPropertiesOnly {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private BigDecimal number;

  public static final String SERIALIZED_NAME_FLOAT = "float";
  @SerializedName(SERIALIZED_NAME_FLOAT)
  private Float _float;

  public static final String SERIALIZED_NAME_DOUBLE = "double";
  @SerializedName(SERIALIZED_NAME_DOUBLE)
  private Double _double;

  public NumberPropertiesOnly() {
  }

  public NumberPropertiesOnly number(BigDecimal number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   */
  @javax.annotation.Nullable
  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }


  public NumberPropertiesOnly _float(Float _float) {
    this._float = _float;
    return this;
  }

  /**
   * Get _float
   * @return _float
   */
  @javax.annotation.Nullable
  public Float getFloat() {
    return _float;
  }

  public void setFloat(Float _float) {
    this._float = _float;
  }


  public NumberPropertiesOnly _double(Double _double) {
    this._double = _double;
    return this;
  }

  /**
   * Get _double
   * minimum: 0.8
   * maximum: 50.2
   * @return _double
   */
  @javax.annotation.Nullable
  public Double getDouble() {
    return _double;
  }

  public void setDouble(Double _double) {
    this._double = _double;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberPropertiesOnly numberPropertiesOnly = (NumberPropertiesOnly) o;
    return Objects.equals(this.number, numberPropertiesOnly.number) &&
        Objects.equals(this._float, numberPropertiesOnly._float) &&
        Objects.equals(this._double, numberPropertiesOnly._double);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, _float, _double);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberPropertiesOnly {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("number");
    openapiFields.add("float");
    openapiFields.add("double");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NumberPropertiesOnly
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NumberPropertiesOnly.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NumberPropertiesOnly is not found in the empty JSON string", NumberPropertiesOnly.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NumberPropertiesOnly.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NumberPropertiesOnly` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NumberPropertiesOnly.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NumberPropertiesOnly' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NumberPropertiesOnly> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NumberPropertiesOnly.class));

       return (TypeAdapter<T>) new TypeAdapter<NumberPropertiesOnly>() {
           @Override
           public void write(JsonWriter out, NumberPropertiesOnly value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NumberPropertiesOnly read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NumberPropertiesOnly given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NumberPropertiesOnly
   * @throws IOException if the JSON string is invalid with respect to NumberPropertiesOnly
   */
  public static NumberPropertiesOnly fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NumberPropertiesOnly.class);
  }

  /**
   * Convert an instance of NumberPropertiesOnly to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

