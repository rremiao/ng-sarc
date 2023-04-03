package com.rremiao.ngsarc.domain.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rremiao.ngsarc.domain.entity.Resource;

@Repository
public interface ResourceAdapter extends JpaRepository<Resource, Integer>{
    
}
