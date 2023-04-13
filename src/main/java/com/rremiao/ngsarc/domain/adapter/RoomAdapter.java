package com.rremiao.ngsarc.domain.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rremiao.ngsarc.domain.entity.Room;

@Repository
public interface RoomAdapter extends JpaRepository<Room,Integer>{
    
}
