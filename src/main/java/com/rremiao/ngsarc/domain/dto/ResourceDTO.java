package com.rremiao.ngsarc.domain.dto;

import java.util.*;

import lombok.Data;

@Data
public class ResourceDTO {
    
    private int id;
    private String description;
    private String status;
    private ResourceTypeDTO resourceType;
    private List<CaracteristicsDTO> caracteristics;
}
