package com.rremiao.ngsarc.core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rremiao.ngsarc.core.dto.CaracteristicsDTO;
import com.rremiao.ngsarc.core.repository.CaracteristicsRepository;
import com.rremiao.ngsarc.domain.entity.Caracteristics;
import com.rremiao.ngsarc.util.ResourceMapper;

@Service
public class CaracteristicsService {
    
    @Autowired
    CaracteristicsRepository caracteristicsRepository;

    public List<CaracteristicsDTO> saveCaracteristics(List<CaracteristicsDTO> caracteristicsDTO) {
        List<Caracteristics> caracteristics = new ArrayList<>();
        
        for(CaracteristicsDTO c : caracteristicsDTO) {
            Caracteristics caracteristic = ResourceMapper.createCaracteristicsEntity(c);
            caracteristics.add(caracteristicsRepository.save(caracteristic));            
        }
        
        return caracteristics.stream()
                    .map(ResourceMapper::createCaracteristicsDTO)
                    .collect(Collectors.toList());
    }
}
