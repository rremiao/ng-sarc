package com.rremiao.ngsarc.domain.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rremiao.ngsarc.domain.entity.Address;

@Repository
public interface AddressAdapter extends JpaRepository<Address, Integer> {
    
}
