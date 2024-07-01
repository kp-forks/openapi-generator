/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// MapTest
    /// </summary>
    [DataContract(Name = "MapTest")]
    public partial class MapTest : IEquatable<MapTest>, IValidatableObject
    {
        /// <summary>
        /// Defines Inner
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum InnerEnum
        {
            /// <summary>
            /// Enum UPPER for value: UPPER
            /// </summary>
            [EnumMember(Value = "UPPER")]
            UPPER = 1,

            /// <summary>
            /// Enum Lower for value: lower
            /// </summary>
            [EnumMember(Value = "lower")]
            Lower = 2
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MapTest" /> class.
        /// </summary>
        /// <param name="mapMapOfString">mapMapOfString.</param>
        /// <param name="mapOfEnumString">mapOfEnumString.</param>
        /// <param name="directMap">directMap.</param>
        /// <param name="indirectMap">indirectMap.</param>
        public MapTest(Dictionary<string, Dictionary<string, string>> mapMapOfString = default(Dictionary<string, Dictionary<string, string>>), Dictionary<string, InnerEnum> mapOfEnumString = default(Dictionary<string, InnerEnum>), Dictionary<string, bool> directMap = default(Dictionary<string, bool>), Dictionary<string, bool> indirectMap = default(Dictionary<string, bool>))
        {
            this._MapMapOfString = mapMapOfString;
            if (this.MapMapOfString != null)
            {
                this._flagMapMapOfString = true;
            }
            this._MapOfEnumString = mapOfEnumString;
            if (this.MapOfEnumString != null)
            {
                this._flagMapOfEnumString = true;
            }
            this._DirectMap = directMap;
            if (this.DirectMap != null)
            {
                this._flagDirectMap = true;
            }
            this._IndirectMap = indirectMap;
            if (this.IndirectMap != null)
            {
                this._flagIndirectMap = true;
            }
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets MapMapOfString
        /// </summary>
        [DataMember(Name = "map_map_of_string", EmitDefaultValue = false)]
        public Dictionary<string, Dictionary<string, string>> MapMapOfString
        {
            get{ return _MapMapOfString;}
            set
            {
                _MapMapOfString = value;
                _flagMapMapOfString = true;
            }
        }
        private Dictionary<string, Dictionary<string, string>> _MapMapOfString;
        private bool _flagMapMapOfString;

        /// <summary>
        /// Returns false as MapMapOfString should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeMapMapOfString()
        {
            return _flagMapMapOfString;
        }
        /// <summary>
        /// Gets or Sets MapOfEnumString
        /// </summary>
        [DataMember(Name = "map_of_enum_string", EmitDefaultValue = false)]
        public Dictionary<string, MapTest.InnerEnum> MapOfEnumString
        {
            get{ return _MapOfEnumString;}
            set
            {
                _MapOfEnumString = value;
                _flagMapOfEnumString = true;
            }
        }
        private Dictionary<string, MapTest.InnerEnum> _MapOfEnumString;
        private bool _flagMapOfEnumString;

        /// <summary>
        /// Returns false as MapOfEnumString should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeMapOfEnumString()
        {
            return _flagMapOfEnumString;
        }
        /// <summary>
        /// Gets or Sets DirectMap
        /// </summary>
        [DataMember(Name = "direct_map", EmitDefaultValue = false)]
        public Dictionary<string, bool> DirectMap
        {
            get{ return _DirectMap;}
            set
            {
                _DirectMap = value;
                _flagDirectMap = true;
            }
        }
        private Dictionary<string, bool> _DirectMap;
        private bool _flagDirectMap;

        /// <summary>
        /// Returns false as DirectMap should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeDirectMap()
        {
            return _flagDirectMap;
        }
        /// <summary>
        /// Gets or Sets IndirectMap
        /// </summary>
        [DataMember(Name = "indirect_map", EmitDefaultValue = false)]
        public Dictionary<string, bool> IndirectMap
        {
            get{ return _IndirectMap;}
            set
            {
                _IndirectMap = value;
                _flagIndirectMap = true;
            }
        }
        private Dictionary<string, bool> _IndirectMap;
        private bool _flagIndirectMap;

        /// <summary>
        /// Returns false as IndirectMap should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeIndirectMap()
        {
            return _flagIndirectMap;
        }
        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MapTest {\n");
            sb.Append("  MapMapOfString: ").Append(MapMapOfString).Append("\n");
            sb.Append("  MapOfEnumString: ").Append(MapOfEnumString).Append("\n");
            sb.Append("  DirectMap: ").Append(DirectMap).Append("\n");
            sb.Append("  IndirectMap: ").Append(IndirectMap).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input as MapTest).AreEqual;
        }

        /// <summary>
        /// Returns true if MapTest instances are equal
        /// </summary>
        /// <param name="input">Instance of MapTest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MapTest input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input).AreEqual;
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.MapMapOfString != null)
                {
                    hashCode = (hashCode * 59) + this.MapMapOfString.GetHashCode();
                }
                if (this.MapOfEnumString != null)
                {
                    hashCode = (hashCode * 59) + this.MapOfEnumString.GetHashCode();
                }
                if (this.DirectMap != null)
                {
                    hashCode = (hashCode * 59) + this.DirectMap.GetHashCode();
                }
                if (this.IndirectMap != null)
                {
                    hashCode = (hashCode * 59) + this.IndirectMap.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
