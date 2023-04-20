package com.rremiao.ngsarc.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.rremiao.ngsarc.domain.dto.ResourceDTO;
import com.rremiao.ngsarc.domain.entity.Resource;

@Component
public class ResourceMapper {
    
    public static ResourceDTO createResourceDTO(Resource resource) { //Fica melhor com modelMapper
        ResourceDTO newResource = new ResourceDTO();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(resource, newResource);

        // newBuilding.setId(building.getId());
        // newBuilding.setName(building.getName());
        // newBuilding.setNumber(building.getNumber());
        // newBuilding.setAddress(createAddressDTO(building.getAddress()));
        // newBuilding.setRooms(getRoomsAsDTO(building.getRooms()));

        return newResource;
    }

    public static Resource creatResourceEntity(ResourceDTO dto) {
        Resource newResource = new Resource();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(dto, newResource);

        // newBuilding.setId(dto.getId());
        // newBuilding.setName(dto.getName());
        // newBuilding.setNumber(dto.getNumber());
        // newBuilding.setAddress(createAddressEntity(dto.getAddress()));
        // newBuilding.setRooms(getRoomsAsEntities(dto.getRooms()));

        return newResource;
    }

}
