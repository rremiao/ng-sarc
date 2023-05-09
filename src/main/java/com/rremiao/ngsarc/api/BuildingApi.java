package com.rremiao.ngsarc.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rremiao.ngsarc.core.dto.BuildingDTO;
import com.rremiao.ngsarc.core.dto.ExceptionDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RequestMapping("/building")
@CrossOrigin
public interface BuildingApi {
    
    @Operation(summary = "Returns all registered buildings")
    @ApiResponse(responseCode = "200", description = "Returns a list of buildings", 
                content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    array = @ArraySchema(schema = @Schema(implementation = BuildingDTO.class)))})
    @GetMapping(value="")
    List<BuildingDTO> getAllBuildings();

    /*
     * 
     * 
     * 
     */

    @Operation(summary = "Returns a registered building that has the informed ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Returns a building", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = BuildingDTO.class))}),
        @ApiResponse(responseCode = "404", description = "Not found", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))})   
    })
    @GetMapping(value="/{building_id}")
    BuildingDTO getBuilding(@PathVariable("buildingId") int buildingId);

    /*
     * 
     * 
     * 
     */

    @Operation(summary = "Create a building")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Returns a building", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = BuildingDTO.class))}),
        @ApiResponse(responseCode = "404", description = "Not found", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))})   
    })
    @PostMapping(value="")
    BuildingDTO createBuilding(@RequestBody BuildingDTO buildingDTO);
    
    /*
     * 
     * 
     * 
     */

    @Operation(summary = "Put a building")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Returns a building", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = BuildingDTO.class))}),
        @ApiResponse(responseCode = "404", description = "Not found", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))})   
    })
    @PutMapping(value="/{building_id}")
    BuildingDTO putBuilding(@PathVariable("buildingId") int buildingId, @RequestBody BuildingDTO buildingDTO);
    
    /*
     * 
     * 
     * 
     */

    @Operation(summary = "Patch a building")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Returns a building", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = BuildingDTO.class))}),
        @ApiResponse(responseCode = "404", description = "Not found", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))})   
    })
    @PatchMapping(value="/{building_id}")
    BuildingDTO patchBuilding(@PathVariable int buildingId, @RequestBody BuildingDTO buildingDTO);
   
    /*
     * 
     * 
     * 
     */

    @Operation(summary = "Delete a building")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Returns a building", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = BuildingDTO.class))}),
        @ApiResponse(responseCode = "404", description = "Not found", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ExceptionDTO.class))})   
    })
    @DeleteMapping(value="/{building_id}")
    boolean deleteBuilding(@PathVariable("buildingId") int buildingId);
}
