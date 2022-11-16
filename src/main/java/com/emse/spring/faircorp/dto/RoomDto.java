package com.emse.spring.faircorp.dto;

import com.emse.spring.faircorp.model.Building;
import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Room;
import com.emse.spring.faircorp.model.Window;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class RoomDto {

    private Long id;
    private Integer floor;
    private String name;
    private Double currentTemperature;
    private Double targetTemperature;
    private List<HeaterDto> heaters;
    private List<WindowDto> windows;
    private Long buildingId;

    public RoomDto(){
    }

    public RoomDto(Room room) {
        this.id = room.getId();
        this.floor = room.getFloor();
        this.name = room.getName();
        this.currentTemperature = room.getCurrentTemperature();
        this.targetTemperature = room.getTargetTemperature();
//        this.heaters = room.getHeaters();
//        this.windows = room.getWindows();
        this.buildingId = room.getBuilding().getId();
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Integer getFloor() { return floor; }

    public void setFloor(Integer floor) { this.floor = floor; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Double getCurrentTemperature() { return currentTemperature; }

    public void setCurrentTemperature(Double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public Double getTargetTemperature() { return targetTemperature; }

    public void setTargetTemperature(Double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public List<HeaterDto> getHeaters() { return heaters; }

    public void setHeaters(List<HeaterDto> heaters) { this.heaters = heaters; }

    public List<WindowDto> getWindows() { return windows; }

    public void setWindows(List<WindowDto> windows) { this.windows = windows; }

}
