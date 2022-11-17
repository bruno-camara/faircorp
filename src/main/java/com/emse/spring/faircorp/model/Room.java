package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

@Entity()// (1)
@Table(name = "ROOM")// (2)
public class Room {
    @Id// (3)
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Integer floor;
    @Column(nullable = false)// (4)
    private String name;

    @Column(nullable = true)
    private Double currentTemperature;

    @Column(nullable = true)
    private Double targetTemperature;

    @OneToMany(mappedBy = "room")
    private List<Heater> heaters;

    @OneToMany(mappedBy = "room")
    private List<Window> windows;

    @ManyToOne
    private Building building;

    public Room() {
    }

    public Room(String name, Integer floor, Building building) {
        this.floor = floor;
        this.name = name;
        this.building = building;
    }

    public Room(String name, Integer floor, Double currentTemperature, Double targetTemperature) {
        this.floor = floor;
        this.name = name;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
    }

    public Room(String name, Integer floor, Double currentTemperature, Double targetTemperature, Building building){
        this.floor = floor;
        this.name = name;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.building = building;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentTemperature() { return currentTemperature; }

    public void setCurrentTemperature(Double currentTemperature) { this.currentTemperature = currentTemperature; }

    public Double getTargetTemperature() { return targetTemperature; }

    public void setTargetTemperature(Double targetTemperature) { this.targetTemperature = targetTemperature; }

    public Integer getFloor() { return floor; }

    public void setFloor(Integer floor) { this.floor = floor; }

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows){ this.windows = windows; }

    public List<Heater> getHeaters() {
        return heaters;
    }

    public void setHeaters(List<Heater> heaters) { this.heaters = heaters; }

    public Building getBuilding() { return building; }
}
