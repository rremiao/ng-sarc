package com.rremiao.ngsarc.core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rremiao.ngsarc.core.dto.RoomDTO;
import com.rremiao.ngsarc.core.repository.RoomRepository;
import com.rremiao.ngsarc.domain.entity.Room;
import com.rremiao.ngsarc.util.BuildingMapper;

@Service
public class RoomService {
    
    @Autowired
    RoomRepository roomRepository;

    public List<RoomDTO> saveRoom(List<RoomDTO> roomDTOs) {
        List<Room> rooms = new ArrayList<>();
        
        for(RoomDTO r : roomDTOs) {
            Room room = BuildingMapper.createRoomEntity(r);
            rooms.add(roomRepository.save(room));            
        }
        
        return rooms.stream()
                    .map(BuildingMapper::createRoomDTO)
                    .collect(Collectors.toList());
    }
}
