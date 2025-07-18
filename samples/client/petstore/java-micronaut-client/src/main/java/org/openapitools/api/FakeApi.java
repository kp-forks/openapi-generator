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

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.FileSchemaTestClass;
import java.time.LocalDate;
import org.openapitools.model.ModelClient;
import java.time.OffsetDateTime;
import org.openapitools.model.OuterComposite;
import org.openapitools.model.User;
import org.openapitools.model.XmlItem;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
@Client("${petstore-micronaut-base-path}")
public interface FakeApi {
    /**
     * creates an XmlItem
     * this route creates an XmlItem
     *
     * @param xmlItem XmlItem Body (required)
     */
    @Post(uri="/fake/create_xml_item")
    @Produces({"application/xml", "application/xml; charset=utf-8", "application/xml; charset=utf-16", "text/xml", "text/xml; charset=utf-8", "text/xml; charset=utf-16"})
    Mono<Void> createXmlItem(
        @Body @NotNull @Valid XmlItem xmlItem
    );

    /**
     * Test serialization of outer boolean types
     *
     * @param _body Input boolean as post body (optional)
     * @return Boolean
     */
    @Post(uri="/fake/outer/boolean")
    
    Mono<Boolean> fakeOuterBooleanSerialize(
        @Body @Nullable Boolean _body
    );

    /**
     * Test serialization of object with outer number type
     *
     * @param _body Input composite as post body (optional)
     * @return OuterComposite
     */
    @Post(uri="/fake/outer/composite")
    
    Mono<OuterComposite> fakeOuterCompositeSerialize(
        @Body @Nullable @Valid OuterComposite _body
    );

    /**
     * Test serialization of outer number types
     *
     * @param _body Input number as post body (optional)
     * @return BigDecimal
     */
    @Post(uri="/fake/outer/number")
    
    Mono<BigDecimal> fakeOuterNumberSerialize(
        @Body @Nullable BigDecimal _body
    );

    /**
     * Test serialization of outer string types
     *
     * @param _body Input string as post body (optional)
     * @return String
     */
    @Post(uri="/fake/outer/string")
    
    Mono<String> fakeOuterStringSerialize(
        @Body @Nullable String _body
    );

    /**
     * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
     *
     * @param _body  (required)
     */
    @Put(uri="/fake/body-with-file-schema")
    @Produces({"application/json"})
    Mono<Void> testBodyWithFileSchema(
        @Body @NotNull @Valid FileSchemaTestClass _body
    );

    /**
     * testBodyWithQueryParams
     *
     * @param query  (required)
     * @param _body  (required)
     */
    @Put(uri="/fake/body-with-query-params")
    @Produces({"application/json"})
    Mono<Void> testBodyWithQueryParams(
        @QueryValue(value="query") @NotNull String query, 
        @Body @NotNull @Valid User _body
    );

    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     *
     * @param _body client model (required)
     * @return ModelClient
     */
    @Patch(uri="/fake")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<ModelClient> testClientModel(
        @Body @NotNull @Valid ModelClient _body
    );

    /**
     * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     *
     * @param number None (required)
     * @param _double None (required)
     * @param patternWithoutDelimiter None (required)
     * @param _byte None (required)
     * @param integer None (optional)
     * @param int32 None (optional)
     * @param int64 None (optional)
     * @param _float None (optional)
     * @param string None (optional)
     * @param binary None (optional)
     * @param date None (optional)
     * @param dateTime None (optional)
     * @param password None (optional)
     * @param paramCallback None (optional)
     */
    @Post(uri="/fake")
    @Produces({"application/x-www-form-urlencoded"})
    Mono<Void> testEndpointParameters(
        @NotNull @DecimalMin("32.1") @DecimalMax("543.2") BigDecimal number, 
        @NotNull @DecimalMin("67.8") @DecimalMax("123.4") Double _double, 
        @NotNull @Pattern(regexp="^[A-Z].*") String patternWithoutDelimiter, 
        @NotNull byte[] _byte, 
        @Nullable @Min(10) @Max(100) Integer integer, 
        @Nullable @Min(20) @Max(200) Integer int32, 
        @Nullable Long int64, 
        @Nullable @DecimalMax("987.6") Float _float, 
        @Nullable @Pattern(regexp="/[a-z]/i") String string, 
        @Nullable File binary, 
        @Nullable @Format("yyyy-MM-dd") LocalDate date, 
        @Nullable @Format("yyyy-MM-dd'T'HH:mm:ss.SSSXXXX") OffsetDateTime dateTime, 
        @Nullable @Size(min=10, max=64) String password, 
        @Nullable String paramCallback
    );

    /**
     * To test enum parameters
     * To test enum parameters
     *
     * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
     * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
     * @param enumQueryStringArray Query parameter enum test (string array) (optional)
     * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
     * @param enumQueryInteger Query parameter enum test (double) (optional)
     * @param enumQueryDouble Query parameter enum test (double) (optional)
     * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
     * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
     */
    @Get(uri="/fake")
    @Produces({"application/x-www-form-urlencoded"})
    Mono<Void> testEnumParameters(
        @Header(name="enum_header_string_array") @Nullable List<String> enumHeaderStringArray, 
        @Header(name="enum_header_string", defaultValue="-efg") @Nullable String enumHeaderString, 
        @QueryValue(value="enum_query_string_array") @Nullable List<String> enumQueryStringArray, 
        @QueryValue(value="enum_query_string", defaultValue="-efg") @Nullable String enumQueryString, 
        @QueryValue(value="enum_query_integer") @Nullable Integer enumQueryInteger, 
        @QueryValue(value="enum_query_double") @Nullable Double enumQueryDouble, 
        @Nullable List<String> enumFormStringArray, 
        @Nullable String enumFormString
    );

    /**
     * Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     *
     * @param requiredStringGroup Required String in group parameters (required)
     * @param requiredBooleanGroup Required Boolean in group parameters (required)
     * @param requiredInt64Group Required Integer in group parameters (required)
     * @param stringGroup String in group parameters (optional)
     * @param booleanGroup Boolean in group parameters (optional)
     * @param int64Group Integer in group parameters (optional)
     */
    @Delete(uri="/fake")
    Mono<Void> testGroupParameters(
        @QueryValue(value="required_string_group") @NotNull Integer requiredStringGroup, 
        @Header(name="required_boolean_group") @NotNull Boolean requiredBooleanGroup, 
        @QueryValue(value="required_int64_group") @NotNull Long requiredInt64Group, 
        @QueryValue(value="string_group") @Nullable Integer stringGroup, 
        @Header(name="boolean_group") @Nullable Boolean booleanGroup, 
        @QueryValue(value="int64_group") @Nullable Long int64Group
    );

    /**
     * test inline additionalProperties
     *
     * @param param request body (required)
     */
    @Post(uri="/fake/inline-additionalProperties")
    @Produces({"application/json"})
    Mono<Void> testInlineAdditionalProperties(
        @Body @NotNull Map<String, String> param
    );

    /**
     * test json serialization of form data
     *
     * @param param field1 (required)
     * @param param2 field2 (required)
     */
    @Get(uri="/fake/jsonFormData")
    @Produces({"application/x-www-form-urlencoded"})
    Mono<Void> testJsonFormData(
        @NotNull String param, 
        @NotNull String param2
    );

    /**
     * To test the collection format in query parameters
     *
     * @param pipe  (required)
     * @param ioutil  (required)
     * @param http  (required)
     * @param url  (required)
     * @param context  (required)
     */
    @Put(uri="/fake/test-query-parameters")
    Mono<Void> testQueryParameterCollectionFormat(
        @QueryValue(value="pipe") @NotNull List<String> pipe, 
        @QueryValue(value="ioutil") @NotNull List<String> ioutil, 
        @QueryValue(value="http") @NotNull List<String> http, 
        @QueryValue(value="url") @NotNull List<String> url, 
        @QueryValue(value="context") @NotNull List<String> context
    );

}
