package com.rremiao.ngsarc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
    public BuildingDTO getBuilding(int buildingId) {
        return buildingService.getBuilding(buildingId);
    }

    @Override
    public BuildingDTO createBuilding(BuildingDTO buildingDTO) {
        return buildingService.saveBuilding(buildingDTO);
    }

    @Override
    public BuildingDTO putBuilding(int buildingId, BuildingDTO buildingDTO) {
        return buildingService.editBuilding(buildingId, buildingDTO);
    }

    @Override
    public BuildingDTO patchBuilding(int buildingId, BuildingDTO buildingDTO) {
        return buildingService.editBuilding(buildingId, buildingDTO);
    }

    @Override
    public boolean deleteBuilding(int buildingId) {
        return buildingService.deleteBuilding(buildingId);
    }
}
