package com.rremiao.ngsarc.core.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rremiao.ngsarc.domain.adapter.ResourceTypeAdapter;
import com.rremiao.ngsarc.domain.entity.ResourceType;

@Repository
public class ResourceTypeRepository {
    
    @Autowired
    ResourceTypeAdapter resourceTypeAdapter;

    public ResourceType save(ResourceType resourceType) {
        return resourceTypeAdapter.save(resourceType);
    }

}
