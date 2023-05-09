package com.rremiao.ngsarc.core.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rremiao.ngsarc.core.dto.AddressDTO;
import com.rremiao.ngsarc.core.dto.BuildingDTO;
import com.rremiao.ngsarc.core.dto.ExceptionDTO;
import com.rremiao.ngsarc.core.dto.RoomDTO;
import com.rremiao.ngsarc.core.repository.BuildingRepository;
import com.rremiao.ngsarc.domain.entity.Building;
import com.rremiao.ngsarc.util.BuildingMapper;

@Service
public class BuildingService {
    
    @Autowired
    BuildingRepository buildingRepository;

    @Autowired
    AddressService addressService;

    @Autowired
    RoomService roomService;

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
        Building building = new Building();
        ModelMapper modelMapper = new ModelMapper();

        AddressDTO address = addressService.saveAddress(dto.getAddress());
        List<RoomDTO> rooms = roomService.saveRoom(dto.getRooms());
        
        modelMapper.map(dto, building);
        building.setAddress(BuildingMapper.createAddressEntity(address));
        building.setRooms(rooms.stream().map(BuildingMapper::createRoomEntity).collect(Collectors.toList()));

        return BuildingMapper.createBuildingDTO(buildingRepository.save(building));
    }

    public BuildingDTO editBuilding(int buildingId, BuildingDTO dto) {
        Building building = buildingRepository.findById(buildingId);

        try {
            if(building != null) {
                return saveBuilding(dto);
            }
            else {
                throw new ExceptionDTO("Building not found");
            }
        }
        catch(ExceptionDTO e) {
            e.printStackTrace();
            return null;
        }
        
    }

    public boolean deleteBuilding(int buildingId) {
        buildingRepository.delete(buildingId); 
        return true;
    }
}
