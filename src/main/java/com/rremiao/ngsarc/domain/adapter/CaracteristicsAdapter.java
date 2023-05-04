package com.rremiao.ngsarc.domain.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rremiao.ngsarc.domain.entity.Caracteristics;

@Repository
public interface CaracteristicsAdapter extends JpaRepository<Caracteristics, Integer>{
    
}
