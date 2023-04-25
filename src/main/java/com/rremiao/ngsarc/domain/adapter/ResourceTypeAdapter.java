package com.rremiao.ngsarc.domain.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.rremiao.ngsarc.domain.entity.ResourceType;

@Component
public interface ResourceTypeAdapter extends JpaRepository<ResourceType, Integer> {
    
}
