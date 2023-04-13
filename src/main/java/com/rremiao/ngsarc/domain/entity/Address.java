package com.rremiao.ngsarc.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "address")
public class Address {
    
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "street")
    private String street;

    @Column(name = "number")
    private int number;

    @Column(name = "complement")
    private String complement;
    
    @Column(name = "district")
    private String district;

    @Column(name = "city")
    private String city;

    @Column(name = "uf")
    private String uf;

    @Column(name = "cep")
    private String cep;
}
