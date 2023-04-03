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
import org.springframework.web.client.HttpClientErrorException.Forbidden;
import org.springframework.web.client.HttpClientErrorException.NotFound;

import com.rremiao.ngsarc.domain.dto.BuildingDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
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
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = NotFound.class))})   
    })
    @GetMapping(value="/{building_id}")
    BuildingDTO getBuilding(@RequestParam int buildingId);

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
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = NotFound.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Forbidden.class))})   
    })
    @PostMapping(value="")
    BuildingDTO createBuilding(@RequestBody BuildingDTO buildingId);
    
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
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = NotFound.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Forbidden.class))})   
    })
    @PutMapping(value="/{building_id}")
    BuildingDTO putBuilding(@RequestParam int buildingId, @RequestBody BuildingDTO buildingDTO);
    
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
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = NotFound.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Forbidden.class))})   
    })
    @PatchMapping(value="/{building_id}")
    BuildingDTO patchBuilding(@RequestParam int buildingId, @RequestBody BuildingDTO buildingDTO);
   
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
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = NotFound.class))}),
        @ApiResponse(responseCode = "403", description = "Forbidden", 
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Forbidden.class))})   
    })
    @DeleteMapping(value="/{building_id}")
    BuildingDTO deleteBuilding(@RequestParam int buildingId);
}
