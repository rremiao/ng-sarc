package com.rremiao.ngsarc.core.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rremiao.ngsarc.domain.adapter.RoomAdapter;
import com.rremiao.ngsarc.domain.entity.Room;

@Repository
public class RoomRepository {
    
    @Autowired
    RoomAdapter roomAdapter;

    public Room save(Room room) {
        return roomAdapter.save(room);
    }
}
