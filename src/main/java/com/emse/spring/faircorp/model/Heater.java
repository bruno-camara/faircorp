package com.emse.spring.faircorp.model;

import javax.persistence.*;

@Entity()// (1)
@Table(name = "HEATER")// (2)
public class Heater {
    @Id// (3)
    @GeneratedValue
    private Long id;

    @Column(nullable = false)// (4)
    private String name;

    @Column(nullable = true)
    private Long power;

    @ManyToOne
    private Room room;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private HeaterStatus heaterStatus;

    public Heater() {
    }

    public Heater(String name, HeaterStatus status, Room room) {
        this.heaterStatus = status;
        this.name = name;
        this.room = room;
    }

    public Heater(String name, HeaterStatus status, Long power, Room room){
        this.heaterStatus = status;
        this.name = name;
        this.room = room;
        this.power = power;
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

    public HeaterStatus getHeaterStatus() {
        return heaterStatus;
    }

    public void setHeaterStatus(HeaterStatus heaterStatus) {
        this.heaterStatus = heaterStatus;
    }

    public Long getPower() { return this.power; }

    public Room getRoom() { return this.room; }
}
