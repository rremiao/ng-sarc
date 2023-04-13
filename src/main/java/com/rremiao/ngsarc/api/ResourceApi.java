package com.rremiao.ngsarc.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rremiao.ngsarc.domain.dto.ExceptionDTO;
import com.rremiao.ngsarc.domain.dto.ResourceDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RequestMapping("/resource")
@CrossOrigin
@RestController
public interface ResourceApi {
    @Operation(summary = "Returns all registered resources")
    @ApiResponse(responseCode = "200", description = "Returns a list of resources", 
                content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    array = @ArraySchema(schema = @Schema(implementation = ResourceDTO.class)))})
    @GetMapping(value="")
    List<ResourceDTO> getAllResources();

    /*
     * 
     * 
     * 
     */

    @Operation(summary = "Returns a registered resource that has the informed ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Returns a resource", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ResourceDTO.class))}),
        @ApiResponse(responseCode = "404", description = "Not found", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))})   
    })
    @GetMapping(value="/{resource_id}")
    ResourceDTO getResource(@RequestParam int resourceId);

    /*
     * 
     * 
     * 
     */

    @Operation(summary = "Create a resource")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Returns a resource", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ResourceDTO.class))}),
        @ApiResponse(responseCode = "404", description = "Not found", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))})   
    })
    @PostMapping(value="")
    ResourceDTO createResource(@RequestBody ResourceDTO resourceId);

    /*
     * 
     * 
     * 
     */

    @Operation(summary = "Put a resource")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Returns a resource", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ResourceDTO.class))}),
        @ApiResponse(responseCode = "404", description = "Not found", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))})   
    })
    @PutMapping(value="/{building_id}")
    ResourceDTO putResource(@RequestParam int resourceId, @RequestBody ResourceDTO resourceDTO);

    /*
     * 
     * 
     * 
     */

    @Operation(summary = "Patch a resource")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Returns a resource", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ResourceDTO.class))}),
        @ApiResponse(responseCode = "404", description = "Not found", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))})   
    })
    @PatchMapping(value="/{resource_id}")
    ResourceDTO patchResource(@RequestParam int resourceId, @RequestBody ResourceDTO resourceDTO);

    /*
     * 
     * 
     * 
     */

    @Operation(summary = "Delete a resource")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Returns a resource", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ResourceDTO.class))}),
        @ApiResponse(responseCode = "404", description = "Not found", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))})   
    })
    @DeleteMapping(value="/{resource_id}")
    ResourceDTO deleteResource(@RequestParam int resourceId);
}
