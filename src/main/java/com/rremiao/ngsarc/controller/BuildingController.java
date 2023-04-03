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
        return null;
    }

    @Override
    public BuildingDTO getBuilding(int buildingId) {
        throw new UnsupportedOperationException("Unimplemented method 'getBuilding'");
    }

    @Override
    public BuildingDTO createBuilding(BuildingDTO buildingId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createBuilding'");
    }

    @Override
    public BuildingDTO putBuilding(int buildingId, BuildingDTO buildingDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putBuilding'");
    }

    @Override
    public BuildingDTO patchBuilding(int buildingId, BuildingDTO buildingDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'patchBuilding'");
    }

    @Override
    public BuildingDTO deleteBuilding(int buildingId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBuilding'");
    }
}
