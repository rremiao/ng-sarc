package com.rremiao.ngsarc.core.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rremiao.ngsarc.core.repository.BuildingRepository;
import com.rremiao.ngsarc.domain.dto.BuildingDTO;
import com.rremiao.ngsarc.domain.entity.Building;
import com.rremiao.ngsarc.util.BuildingMapper;

@Service
public class BuildingService {
    
    @Autowired
    BuildingRepository buildingRepository;

    public List<BuildingDTO> getAllBuildings() {
        return buildingRepository.findAll()
                                .stream()
                                .map(BuildingMapper::createBuildingDTO)
                                .collect(Collectors.toList());

    }

    public BuildingDTO getBuilding(int buildingId) {
        return BuildingMapper.createBuildingDTO(buildingRepository.findById(buildingId));
    }

    public BuildingDTO saveBuilding(BuildingDTO dto) {
        return BuildingMapper.createBuildingDTO(
                            buildingRepository.save(
                                BuildingMapper.createBuildingEntity(dto)));
    }

    public BuildingDTO editBuilding(int buildingId, BuildingDTO dto) {
        Building newBuilding = BuildingMapper.createBuildingEntity(dto);
        Building oldBuilding = buildingRepository.findById(buildingId);
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(newBuilding, oldBuilding);

        return BuildingMapper.createBuildingDTO(buildingRepository.save(oldBuilding));        
    }

    public boolean deleteBuilding(int buildingId) {
        buildingRepository.delete(buildingId); 
        return true;
    }
}
