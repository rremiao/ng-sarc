package com.rremiao.ngsarc.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rremiao.ngsarc.core.dto.AddressDTO;
import com.rremiao.ngsarc.core.repository.AddressRepository;
import com.rremiao.ngsarc.domain.entity.Address;
import com.rremiao.ngsarc.util.BuildingMapper;

@Service
public class AddressService {
    
    @Autowired
    AddressRepository addressRepository;

    public AddressDTO saveAddress(AddressDTO addressDTO) {
        Address address = BuildingMapper.createAddressEntity(addressDTO);
        
        return BuildingMapper.createAddressDTO(addressRepository.save(address));
    }
}
