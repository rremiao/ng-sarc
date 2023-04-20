package com.rremiao.ngsarc.util;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.rremiao.ngsarc.domain.dto.AddressDTO;
import com.rremiao.ngsarc.domain.dto.BuildingDTO;
import com.rremiao.ngsarc.domain.dto.RoomDTO;
import com.rremiao.ngsarc.domain.entity.Address;
import com.rremiao.ngsarc.domain.entity.Building;
import com.rremiao.ngsarc.domain.entity.Room;

@Component
public class BuildingMapper {

    public static BuildingDTO createBuildingDTO(Building building) { //Fica melhor com modelMapper
        BuildingDTO newBuilding = new BuildingDTO();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(building, newBuilding);

        return newBuilding;
    }

    public static Building createBuildingEntity(BuildingDTO dto) {
        Building newBuilding = new Building();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(dto, newBuilding);

        return newBuilding;
    }

    public static AddressDTO createAddressDTO(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(address, addressDTO);

        return addressDTO;
    }

    public static Address createAddressEntity(AddressDTO addressDTO) {
        Address address = new Address();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(addressDTO, address);

        return address;
    }

    public static List<RoomDTO> getRoomsAsDTO(List<Room> rooms) {
        List<RoomDTO> roomDTOs = new ArrayList<>();

        for(Room r : rooms) {
            roomDTOs.add(createRoomDTO(r));
        }

        return roomDTOs;
    }

    public static List<Room> getRoomsAsEntities(List<RoomDTO> rooms) {
        List<Room> roomEntities = new ArrayList<>();

        for(RoomDTO r : rooms) {
            roomEntities.add(createRoomEntity(r));
        }

        return roomEntities;
    }

    public static RoomDTO createRoomDTO(Room r) {
        RoomDTO newRoomDTO = new RoomDTO();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(r, newRoomDTO);

        return newRoomDTO;
    }

    public static Room createRoomEntity(RoomDTO r) {
        Room newRoom = new Room();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(r, newRoom);
        
        return newRoom;
    }
}
