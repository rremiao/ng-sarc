package com.rremiao.ngsarc.core.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rremiao.ngsarc.core.dto.CaracteristicsDTO;
import com.rremiao.ngsarc.core.dto.ExceptionDTO;
import com.rremiao.ngsarc.core.dto.ResourceDTO;
import com.rremiao.ngsarc.core.dto.ResourceTypeDTO;
import com.rremiao.ngsarc.core.repository.ResourceRepository;
import com.rremiao.ngsarc.domain.entity.Resource;
import com.rremiao.ngsarc.util.ResourceMapper;

@Service
public class ResourceService {
    
    @Autowired
    ResourceRepository resourceRepository;

    @Autowired
    ResourceTypeService resourceTypeService;

    @Autowired
    CaracteristicsService caracteristicServce;
    
    public List<ResourceDTO> findAll() {
        return resourceRepository.findAll()
                                 .stream()
                                 .map(ResourceMapper::createResourceDTO)
                                 .collect(Collectors.toList());
    }

    public ResourceDTO getResource(int resourceId) {
        return ResourceMapper.createResourceDTO(resourceRepository.findById(resourceId));
    }

    public ResourceDTO saveResource(ResourceDTO dto) {
        Resource newResource = new Resource();
        ModelMapper modelMapper = new ModelMapper();

        ResourceTypeDTO resourceTypeDTO = resourceTypeService.saveResourceType(dto.getResourceType());
        List<CaracteristicsDTO> caracteristicsDTOs = caracteristicServce.saveCaracteristics(dto.getCaracteristics());

        modelMapper.map(dto, newResource);

        newResource.setResourceType(ResourceMapper.createResourceTypeEntity(resourceTypeDTO));
        newResource.setCaracteristics(ResourceMapper.getCaracteristicsAsEntities(caracteristicsDTOs));

        return ResourceMapper.createResourceDTO(resourceRepository.save(newResource));
    }

    public ResourceDTO editBuilding(int resourceId, ResourceDTO dto) {
        Resource resource = resourceRepository.findById(resourceId);

        try {
            if(resource != null) {
                return saveResource(dto);
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

    public boolean deleteBuilding(int resourceId) {
        resourceRepository.delete(resourceId); 
        return true;
    }
}
