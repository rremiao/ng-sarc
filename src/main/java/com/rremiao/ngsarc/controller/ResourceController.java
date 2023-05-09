package com.rremiao.ngsarc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.rremiao.ngsarc.api.ResourceApi;
import com.rremiao.ngsarc.core.dto.ResourceDTO;
import com.rremiao.ngsarc.core.service.ResourceService;

@RestController
public class ResourceController implements ResourceApi {
    
    @Autowired
    ResourceService resourceService;

    @Override
    public List<ResourceDTO> getAllResources() {
        return resourceService.findAll();
    }

    @Override
    public ResourceDTO getResource(int resourceId) {
        return resourceService.getResource(resourceId);
    }

    @Override
    public ResourceDTO createResource(ResourceDTO resourceDTO) {
        return resourceService.saveResource(resourceDTO);
    }

    @Override
    public ResourceDTO putResource(int resourceId, ResourceDTO resourceDTO) {
        return resourceService.editBuilding(resourceId, resourceDTO);
    }

    @Override
    public ResourceDTO patchResource(int resourceId, ResourceDTO resourceDTO) {
        return resourceService.editBuilding(resourceId, resourceDTO);

    }

    @Override
    public boolean deleteResource(int resourceId) {
        return resourceService.deleteBuilding(resourceId);
    }
}
