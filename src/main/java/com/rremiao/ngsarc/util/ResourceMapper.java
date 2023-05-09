package com.rremiao.ngsarc.util;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.rremiao.ngsarc.core.dto.CaracteristicsDTO;
import com.rremiao.ngsarc.core.dto.ResourceDTO;
import com.rremiao.ngsarc.core.dto.ResourceTypeDTO;
import com.rremiao.ngsarc.domain.entity.Caracteristics;
import com.rremiao.ngsarc.domain.entity.Resource;
import com.rremiao.ngsarc.domain.entity.ResourceType;

@Component
public class ResourceMapper {
    
    public static ResourceDTO createResourceDTO(Resource resource) { //Fica melhor com modelMapper
        ResourceDTO newResource = new ResourceDTO();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(resource, newResource);

        return newResource;
    }

    public static Resource creatResourceEntity(ResourceDTO dto) {
        Resource newResource = new Resource();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(dto, newResource);

        return newResource;
    }

    public static ResourceTypeDTO createResourceTypeDTO(ResourceType resourceType) {
        ResourceTypeDTO resourceTypeDTO = new ResourceTypeDTO();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(resourceType, resourceTypeDTO);

        return resourceTypeDTO;
    }

    public static ResourceType createResourceTypeEntity(ResourceTypeDTO resourceTypeDTO) {
        ResourceType resourceType = new ResourceType();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(resourceTypeDTO, resourceType);

        return resourceType;
    }

    public static List<CaracteristicsDTO> getCaracteristicsAsDTO(List<Caracteristics> caracteristics) {
        List<CaracteristicsDTO> caracteristicsDTOs = new ArrayList<>();

        for(Caracteristics c : caracteristics) {
            caracteristicsDTOs.add(createCaracteristicsDTO(c));
        }

        return caracteristicsDTOs;
    }

    public static List<Caracteristics> getCaracteristicsAsEntities(List<CaracteristicsDTO> caracteristicsDTOs) {
        List<Caracteristics> caracteristics = new ArrayList<>();

        for(CaracteristicsDTO c : caracteristicsDTOs) {
            caracteristics.add(createCaracteristicsEntity(c));
        }

        return caracteristics;
    }

    public static CaracteristicsDTO createCaracteristicsDTO(Caracteristics caracteristics) {
        CaracteristicsDTO caracteristicsDTO = new CaracteristicsDTO();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(caracteristics, caracteristicsDTO);

        return caracteristicsDTO;
    }

    public static Caracteristics createCaracteristicsEntity(CaracteristicsDTO caracteristicsDTO) {
        Caracteristics caracteristics = new Caracteristics();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(caracteristicsDTO, caracteristics);

        return caracteristics;
    }

}
