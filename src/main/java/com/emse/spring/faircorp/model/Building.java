package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BUILDING")
public class Building {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "building")
    private List<Room> rooms;

    public Building(){}

    public Long getId() { return id; }

}
