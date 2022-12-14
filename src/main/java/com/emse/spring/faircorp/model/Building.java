package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BUILDING")
public class Building {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "building")
    private List<Room> rooms;

    public Building(){}

    public Building(String name){
        this.name = name;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName(){ return name; }

    public void setName(String name) { this.name = name; }

    public List<Room> getRooms(){ return rooms; }

    public void setRooms(List<Room> rooms) { this.rooms = rooms; }

}