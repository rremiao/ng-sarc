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

        // newBuilding.setId(building.getId());
        // newBuilding.setName(building.getName());
        // newBuilding.setNumber(building.getNumber());
        // newBuilding.setAddress(createAddressDTO(building.getAddress()));
        // newBuilding.setRooms(getRoomsAsDTO(building.getRooms()));

        return newBuilding;
    }

    public static Building createBuildingEntity(BuildingDTO dto) {
        Building newBuilding = new Building();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(dto, newBuilding);

        // newBuilding.setId(dto.getId());
        // newBuilding.setName(dto.getName());
        // newBuilding.setNumber(dto.getNumber());
        // newBuilding.setAddress(createAddressEntity(dto.getAddress()));
        // newBuilding.setRooms(getRoomsAsEntities(dto.getRooms()));

        return newBuilding;
    }

    public static AddressDTO createAddressDTO(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(address, addressDTO);

        // addressDTO.setId(address.getId());
        // addressDTO.setStreet(address.getStreet());
        // addressDTO.setNumber(address.getNumber());
        // addressDTO.setComplement(address.getComplement());
        // addressDTO.setDistrict(address.getDistrict());
        // addressDTO.setUf(address.getUf());
        // addressDTO.setCep(address.getCep());

        return addressDTO;
    }

    public static Address createAddressEntity(AddressDTO addressDTO) {
        Address address = new Address();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(addressDTO, address);

        // address.setId(addressDTO.getId());
        // address.setStreet(addressDTO.getStreet());
        // address.setNumber(addressDTO.getNumber());
        // address.setComplement(addressDTO.getComplement());
        // address.setDistrict(addressDTO.getDistrict());
        // address.setUf(addressDTO.getUf());
        // address.setCep(addressDTO.getCep());

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

        // newRoomDTO.setId(r.getId());
        // newRoomDTO.setNumber(r.getNumber());
        // newRoomDTO.setCapacity(r.getCapacity());
        // newRoomDTO.setFloor(r.getFloor());
        
        return newRoomDTO;
    }

    public static Room createRoomEntity(RoomDTO r) {
        Room newRoom = new Room();
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.map(r, newRoom);

        // newRoom.setId(r.getId());
        // newRoom.setNumber(r.getNumber());
        // newRoom.setCapacity(r.getCapacity());
        // newRoom.setFloor(r.getFloor());
        
        return newRoom;
    }
}
