package com.rremiao.ngsarc.core.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rremiao.ngsarc.domain.adapter.BuildingAdapter;
import com.rremiao.ngsarc.domain.entity.Building;

@Repository
public class BuildingRepository {
    
    @Autowired
    BuildingAdapter buildingAdapter;

    public List<Building> findAll() {
        return buildingAdapter.findAll();
    }

    public Building findById(int id) {
        if(buildingAdapter.findById(id).isPresent()) {
            return buildingAdapter.findById(id).get();
        }

        return null;
    }

    public Building save(Building entity) {
        return buildingAdapter.save(entity);
    }

    public void delete(int id) {
        buildingAdapter.deleteById(id);
    }
}
