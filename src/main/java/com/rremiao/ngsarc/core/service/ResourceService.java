package com.rremiao.ngsarc.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rremiao.ngsarc.core.repository.ResourceRepository;

@Service
public class ResourceService {
    
    @Autowired
    ResourceRepository resourceRepository;
}
