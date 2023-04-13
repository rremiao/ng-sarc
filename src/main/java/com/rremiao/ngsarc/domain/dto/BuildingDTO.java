package com.rremiao.ngsarc.domain.dto;

import lombok.Data;
import java.util.List;

@Data
public class BuildingDTO {
    
    private int id;
    private String name;
    private int number;
    private AddressDTO address;
    private List<RoomDTO> rooms;
}
