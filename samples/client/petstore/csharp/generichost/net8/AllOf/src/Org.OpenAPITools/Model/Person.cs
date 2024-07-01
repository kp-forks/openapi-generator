// <auto-generated>
/*
 * Example
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Person
    /// </summary>
    public partial class Person : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Person" /> class.
        /// </summary>
        /// <param name="firstName">firstName</param>
        /// <param name="lastName">lastName</param>
        [JsonConstructor]
        public Person(Option<string?> firstName = default, Option<string?> lastName = default)
        {
            FirstNameOption = firstName;
            LastNameOption = lastName;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Used to track the state of FirstName
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<string?> FirstNameOption { get; private set; }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [JsonPropertyName("firstName")]
        public string? FirstName { get { return this.FirstNameOption; } set { this.FirstNameOption = new(value); } }

        /// <summary>
        /// Used to track the state of LastName
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<string?> LastNameOption { get; private set; }

        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        [JsonPropertyName("lastName")]
        public string? LastName { get { return this.LastNameOption; } set { this.LastNameOption = new(value); } }

        /// <summary>
        /// The discriminator
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public string Type { get; } = "Person";

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public Dictionary<string, JsonElement> AdditionalProperties { get; } = new Dictionary<string, JsonElement>();

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Person {\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            return this.BaseValidate(validationContext);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        protected IEnumerable<ValidationResult> BaseValidate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="Person" />
    /// </summary>
    public class PersonJsonConverter : JsonConverter<Person>
    {
        /// <summary>
        /// Deserializes json to <see cref="Person" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override Person Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            Option<string?> firstName = default;
            Option<string?> lastName = default;
            Option<string?> type = default;

            string? discriminator = ClientUtils.GetDiscriminator(utf8JsonReader, "$_type");

            if (discriminator != null && discriminator.Equals("Adult"))
                return JsonSerializer.Deserialize<Adult>(ref utf8JsonReader, jsonSerializerOptions) ?? throw new JsonException("The result was an unexpected value.");

            if (discriminator != null && discriminator.Equals("Child"))
                return JsonSerializer.Deserialize<Child>(ref utf8JsonReader, jsonSerializerOptions) ?? throw new JsonException("The result was an unexpected value.");

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? localVarJsonPropertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (localVarJsonPropertyName)
                    {
                        case "firstName":
                            firstName = new Option<string?>(utf8JsonReader.GetString()!);
                            break;
                        case "lastName":
                            lastName = new Option<string?>(utf8JsonReader.GetString()!);
                            break;
                        case "$_type":
                            type = new Option<string?>(utf8JsonReader.GetString()!);
                            break;
                        default:
                            break;
                    }
                }
            }

            if (firstName.IsSet && firstName.Value == null)
                throw new ArgumentNullException(nameof(firstName), "Property is not nullable for class Person.");

            if (lastName.IsSet && lastName.Value == null)
                throw new ArgumentNullException(nameof(lastName), "Property is not nullable for class Person.");

            if (type.IsSet && type.Value == null)
                throw new ArgumentNullException(nameof(type), "Property is not nullable for class Person.");

            return new Person(firstName, lastName);
        }

        /// <summary>
        /// Serializes a <see cref="Person" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="person"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, Person person, JsonSerializerOptions jsonSerializerOptions)
        {
            if (person is Adult adult){
                JsonSerializer.Serialize<Adult>(writer, adult, jsonSerializerOptions);
                return;
            }

            if (person is Child child){
                JsonSerializer.Serialize<Child>(writer, child, jsonSerializerOptions);
                return;
            }

            writer.WriteStartObject();

            WriteProperties(writer, person, jsonSerializerOptions);
            writer.WriteEndObject();
        }

        /// <summary>
        /// Serializes the properties of <see cref="Person" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="person"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void WriteProperties(Utf8JsonWriter writer, Person person, JsonSerializerOptions jsonSerializerOptions)
        {
            if (person.FirstNameOption.IsSet && person.FirstName == null)
                throw new ArgumentNullException(nameof(person.FirstName), "Property is required for class Person.");

            if (person.LastNameOption.IsSet && person.LastName == null)
                throw new ArgumentNullException(nameof(person.LastName), "Property is required for class Person.");

            if (person.FirstNameOption.IsSet)
                writer.WriteString("firstName", person.FirstName);

            if (person.LastNameOption.IsSet)
                writer.WriteString("lastName", person.LastName);

            writer.WriteString("$_type", person.Type);
        }
    }
}
