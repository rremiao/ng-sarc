package com.rremiao.ngsarc.core.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rremiao.ngsarc.domain.adapter.ResourceAdapter;
import com.rremiao.ngsarc.domain.entity.Resource;

@Repository
public class ResourceRepository {
    
    @Autowired
    ResourceAdapter resourceAdapter;

    public List<Resource> findAll() {
        return resourceAdapter.findAll();
    }

    public Resource findById(int id) {
        if(resourceAdapter.findById(id).isPresent()) {
            return resourceAdapter.findById(id).get();
        }

        return null;
    }

    public Resource save(Resource entity) {
        return resourceAdapter.save(entity);
    }

    public void delete(int id) {
        resourceAdapter.deleteById(id);
    }
}
