package com.rremiao.ngsarc.domain.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.rremiao.ngsarc.domain.entity.Resource;

@Component
public interface ResourceAdapter extends JpaRepository<Resource, Integer>{
    
}
