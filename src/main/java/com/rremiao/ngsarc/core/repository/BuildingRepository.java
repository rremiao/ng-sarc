package com.rremiao.ngsarc.core.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rremiao.ngsarc.domain.adapter.BuildingAdapter;

@Repository
public class BuildingRepository {
    
    @Autowired
    BuildingAdapter buildingAdapter;
}
