package com.rremiao.ngsarc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.rremiao.ngsarc.api.ResourceApi;
import com.rremiao.ngsarc.core.service.ResourceService;
import com.rremiao.ngsarc.domain.dto.ResourceDTO;

@RestController
public class ResourceController implements ResourceApi {
    
    @Autowired
    ResourceService resourceService;

    @Override
    public List<ResourceDTO> getAllResources() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllResources'");
    }

    @Override
    public ResourceDTO getResource(int resourceId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResource'");
    }

    @Override
    public ResourceDTO createResource(ResourceDTO resourceId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createResource'");
    }

    @Override
    public ResourceDTO putResource(int resourceId, ResourceDTO resourceDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putResource'");
    }

    @Override
    public ResourceDTO patchResource(int resourceId, ResourceDTO resourceDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'patchResource'");
    }

    @Override
    public ResourceDTO deleteResource(int resourceId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteResource'");
    }
}
