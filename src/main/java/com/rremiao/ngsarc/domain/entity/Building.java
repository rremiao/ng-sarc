package com.rremiao.ngsarc.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "building")
public class Building {
    
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "room")
    private int rooms;

    @Column(name = "size")
    private double size;
}
