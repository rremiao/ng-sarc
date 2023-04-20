package com.rremiao.ngsarc.core.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rremiao.ngsarc.domain.adapter.AddressAdapter;
import com.rremiao.ngsarc.domain.entity.Address;

@Repository
public class AddressRepository {
    
    @Autowired
    AddressAdapter addressAdapter;

    public Address save(Address address) {
        return addressAdapter.save(address);
    }
}
