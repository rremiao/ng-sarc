package com.rremiao.ngsarc.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rremiao.ngsarc.core.dto.ResourceTypeDTO;
import com.rremiao.ngsarc.core.repository.ResourceTypeRepository;
import com.rremiao.ngsarc.domain.entity.ResourceType;
import com.rremiao.ngsarc.util.ResourceMapper;

@Service
public class ResourceTypeService {

    @Autowired
    ResourceTypeRepository resourceTypeRepository;
    
    public ResourceTypeDTO saveResourceType(ResourceTypeDTO resourceTypeDTO) {
        ResourceType resourceType = ResourceMapper.createResourceTypeEntity(resourceTypeDTO);
        
        return ResourceMapper.createResourceTypeDTO(resourceTypeRepository.save(resourceType));
    }
}
