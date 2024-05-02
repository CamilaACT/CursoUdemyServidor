/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.55).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.InvoiceRequest;
import io.swagger.model.InvoiceResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-01T18:52:06.421435096Z[GMT]")
@Validated
public interface BillingApi {

    @Operation(summary = "delete", description = "", security = {
        @SecurityRequirement(name = "JWT")    }, tags={ "Billing API" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = Object.class))),
        
        @ApiResponse(responseCode = "204", description = "No Content"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "403", description = "Forbidden") })
    @RequestMapping(value = "/billing/{id}",
        produces = { "*/*" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Object> deleteUsingDELETE(@Parameter(in = ParameterIn.PATH, description = "id", required=true, schema=@Schema()) @PathVariable("id") String id
);


    @Operation(summary = "get", description = "", security = {
        @SecurityRequirement(name = "JWT")    }, tags={ "Billing API" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = InvoiceResponse.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "403", description = "Forbidden"),
        
        @ApiResponse(responseCode = "404", description = "Not Found") })
    @RequestMapping(value = "/billing/{id}",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<InvoiceResponse> getUsingGET(@Parameter(in = ParameterIn.PATH, description = "id", required=true, schema=@Schema()) @PathVariable("id") String id
);


    @Operation(summary = "Return all transaction bundled into Response", description = "Return 204 if no data found", security = {
        @SecurityRequirement(name = "JWT")    }, tags={ "Billing API" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = InvoiceResponse.class)))),
        
        @ApiResponse(responseCode = "204", description = "There are not transactions"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "403", description = "Forbidden"),
        
        @ApiResponse(responseCode = "404", description = "Not Found"),
        
        @ApiResponse(responseCode = "500", description = "Internal error") })
    @RequestMapping(value = "/billing",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<InvoiceResponse>> listUsingGET();


    @Operation(summary = "post", description = "", security = {
        @SecurityRequirement(name = "JWT")    }, tags={ "Billing API" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = Object.class))),
        
        @ApiResponse(responseCode = "201", description = "Created"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "403", description = "Forbidden"),
        
        @ApiResponse(responseCode = "404", description = "Not Found") })
    @RequestMapping(value = "/billing",
        produces = { "*/*" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Object> postUsingPOST(@Parameter(in = ParameterIn.DEFAULT, description = "input", required=true, schema=@Schema()) @Valid @RequestBody InvoiceRequest body
);


    @Operation(summary = "put", description = "", security = {
        @SecurityRequirement(name = "JWT")    }, tags={ "Billing API" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = Object.class))),
        
        @ApiResponse(responseCode = "201", description = "Created"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized"),
        
        @ApiResponse(responseCode = "403", description = "Forbidden"),
        
        @ApiResponse(responseCode = "404", description = "Not Found") })
    @RequestMapping(value = "/billing/{id}",
        produces = { "*/*" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Object> putUsingPUT(@Parameter(in = ParameterIn.PATH, description = "id", required=true, schema=@Schema()) @PathVariable("id") String id
, @Parameter(in = ParameterIn.DEFAULT, description = "input", required=true, schema=@Schema()) @Valid @RequestBody InvoiceRequest body
);

}

