package com.rremiao.ngsarc.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rremiao.ngsarc.core.repository.BuildingRepository;

@Service
public class BuildingService {
    
    @Autowired
    BuildingRepository buildingRepository;
}
