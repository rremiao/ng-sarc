package com.rremiao.ngsarc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rremiao.ngsarc.api.BuildingApi;
import com.rremiao.ngsarc.core.service.BuildingService;
import com.rremiao.ngsarc.domain.dto.BuildingDTO;

@RestController
public class BuildingController implements BuildingApi{
    
    @Autowired
    BuildingService buildingService;

    @Override
    public List<BuildingDTO> getAllBuildings() {
        return buildingService.getAllBuildings();
    }

    @Override
    public BuildingDTO getBuilding(@PathVariable("buildingId") int buildingId) {
        return buildingService.getBuilding(buildingId);
    }

    @Override
    public BuildingDTO createBuilding(@RequestBody BuildingDTO buildingDTO) {
        return buildingService.saveBuilding(buildingDTO);
    }

    @Override
    public BuildingDTO putBuilding(@PathVariable("buildingId") int buildingId, @RequestBody BuildingDTO buildingDTO) {
        return buildingService.editBuilding(buildingId, buildingDTO);
    }

    @Override
    public BuildingDTO patchBuilding(@PathVariable("buildingId") int buildingId, @RequestBody BuildingDTO buildingDTO) {
        return buildingService.editBuilding(buildingId, buildingDTO);
    }

    @Override
    public boolean deleteBuilding(@PathVariable("buildingId") int buildingId) {
        return buildingService.deleteBuilding(buildingId);
    }
}
