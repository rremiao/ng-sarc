package com.rremiao.ngsarc.core.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rremiao.ngsarc.core.repository.ResourceRepository;
import com.rremiao.ngsarc.domain.dto.ResourceDTO;
import com.rremiao.ngsarc.domain.entity.Resource;
import com.rremiao.ngsarc.util.ResourceMapper;

@Service
public class ResourceService {
    
    @Autowired
    ResourceRepository resourceRepository;

    @Autowired
    ResourceMapper resourceMapper;

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
        return ResourceMapper.createResourceDTO(
                            resourceRepository.save(
                                ResourceMapper.creatResourceEntity(dto)));
    }

    public ResourceDTO editBuilding(int resourceId, ResourceDTO dto) {
        Resource newResource = ResourceMapper.creatResourceEntity(dto);
        Resource oldResource = resourceRepository.findById(resourceId);
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(newResource, oldResource);

        return ResourceMapper.createResourceDTO(resourceRepository.save(oldResource));        
    }

    public boolean deleteBuilding(int resourceId) {
        resourceRepository.delete(resourceId); 
        return true;
    }
}
