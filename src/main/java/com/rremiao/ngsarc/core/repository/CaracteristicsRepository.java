package com.rremiao.ngsarc.core.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rremiao.ngsarc.domain.adapter.CaracteristicsAdapter;
import com.rremiao.ngsarc.domain.entity.Caracteristics;

@Repository
public class CaracteristicsRepository {
    

    @Autowired
    CaracteristicsAdapter caracteristicsAdapter;

    public Caracteristics save(Caracteristics caracteristics) {
        return caracteristicsAdapter.save(caracteristics);
    }
}
