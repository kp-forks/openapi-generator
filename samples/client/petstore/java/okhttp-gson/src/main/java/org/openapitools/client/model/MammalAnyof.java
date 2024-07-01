/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
import java.util.Arrays;
import org.openapitools.client.model.Pig;
import org.openapitools.client.model.Whale;
import org.openapitools.client.model.Zebra;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class MammalAnyof extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(MammalAnyof.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MammalAnyof.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MammalAnyof' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Whale> adapterWhale = gson.getDelegateAdapter(this, TypeToken.get(Whale.class));
            final TypeAdapter<Zebra> adapterZebra = gson.getDelegateAdapter(this, TypeToken.get(Zebra.class));
            final TypeAdapter<Pig> adapterPig = gson.getDelegateAdapter(this, TypeToken.get(Pig.class));

            return (TypeAdapter<T>) new TypeAdapter<MammalAnyof>() {
                @Override
                public void write(JsonWriter out, MammalAnyof value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Whale`
                    if (value.getActualInstance() instanceof Whale) {
                        JsonElement element = adapterWhale.toJsonTree((Whale)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Zebra`
                    if (value.getActualInstance() instanceof Zebra) {
                        JsonElement element = adapterZebra.toJsonTree((Zebra)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Pig`
                    if (value.getActualInstance() instanceof Pig) {
                        JsonElement element = adapterPig.toJsonTree((Pig)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: Pig, Whale, Zebra");
                }

                @Override
                public MammalAnyof read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Whale
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Whale.validateJsonElement(jsonElement);
                        actualAdapter = adapterWhale;
                        MammalAnyof ret = new MammalAnyof();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Whale failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Whale'", e);
                    }
                    // deserialize Zebra
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Zebra.validateJsonElement(jsonElement);
                        actualAdapter = adapterZebra;
                        MammalAnyof ret = new MammalAnyof();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Zebra failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Zebra'", e);
                    }
                    // deserialize Pig
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Pig.validateJsonElement(jsonElement);
                        actualAdapter = adapterPig;
                        MammalAnyof ret = new MammalAnyof();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Pig failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Pig'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for MammalAnyof: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public MammalAnyof() {
        super("anyOf", Boolean.FALSE);
    }

    public MammalAnyof(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Whale", Whale.class);
        schemas.put("Zebra", Zebra.class);
        schemas.put("Pig", Pig.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return MammalAnyof.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * Pig, Whale, Zebra
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Whale) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Zebra) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Pig) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Pig, Whale, Zebra");
    }

    /**
     * Get the actual instance, which can be the following:
     * Pig, Whale, Zebra
     *
     * @return The actual instance (Pig, Whale, Zebra)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Whale`. If the actual instance is not `Whale`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Whale`
     * @throws ClassCastException if the instance is not `Whale`
     */
    public Whale getWhale() throws ClassCastException {
        return (Whale)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Zebra`. If the actual instance is not `Zebra`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Zebra`
     * @throws ClassCastException if the instance is not `Zebra`
     */
    public Zebra getZebra() throws ClassCastException {
        return (Zebra)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Pig`. If the actual instance is not `Pig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Pig`
     * @throws ClassCastException if the instance is not `Pig`
     */
    public Pig getPig() throws ClassCastException {
        return (Pig)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to MammalAnyof
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Whale
        try {
            Whale.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Whale failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Zebra
        try {
            Zebra.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Zebra failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Pig
        try {
            Pig.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Pig failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for MammalAnyof with anyOf schemas: Pig, Whale, Zebra. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of MammalAnyof given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MammalAnyof
     * @throws IOException if the JSON string is invalid with respect to MammalAnyof
     */
    public static MammalAnyof fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, MammalAnyof.class);
    }

    /**
     * Convert an instance of MammalAnyof to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

