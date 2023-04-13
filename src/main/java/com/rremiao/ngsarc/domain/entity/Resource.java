package com.rremiao.ngsarc.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.*;

import lombok.Data;

@Data
@Entity(name = "resource")
public class Resource {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @OneToOne
    @JoinColumn(name = "resource_type", referencedColumnName = "id")
    private ResourceType resourceType;

    @OneToMany()
    @Column(name = "caracteristics")
    private List<Caracteristics> caracteristics;

}
