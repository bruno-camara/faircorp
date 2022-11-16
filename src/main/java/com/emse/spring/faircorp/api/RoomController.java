package com.emse.spring.faircorp.api;

import com.emse.spring.faircorp.dao.HeaterDao;
import com.emse.spring.faircorp.dao.RoomDao;
import com.emse.spring.faircorp.dao.WindowDao;
import com.emse.spring.faircorp.dto.RoomDto;
import com.emse.spring.faircorp.dto.WindowDto;
import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Room;
import com.emse.spring.faircorp.model.Window;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController // (1)
@RequestMapping("/api/rooms") // (2)
@Transactional // (3)
public class RoomController {

    private final RoomDao roomDao;
    private final WindowDao windowDao;
    private final HeaterDao heaterDao;

    public RoomController(RoomDao roomDao, WindowDao windowDao, HeaterDao heaterDao) { // (4)
        this.roomDao = roomDao;
        this.windowDao = windowDao;
        this.heaterDao = heaterDao;
    }

    @GetMapping // (5)
    public List<RoomDto> findAll() {
        return roomDao.findAll().stream().map(RoomDto::new).collect(Collectors.toList());  // (6)
    }

    @GetMapping(path = "/{id}")
    public RoomDto findById(@PathVariable Long id) {
        return roomDao.findById(id).map(RoomDto::new).orElse(null); // (7)
    }

    // Create Room
    @PostMapping // (8)
    public RoomDto create(@RequestBody RoomDto dto) {
        Room room = null;
        // On creation id is not defined
        if (dto.getId() == null) {
            room = roomDao.save(new Room(dto.getName(), dto.getFloor(), dto.getCurrentTemperature(), dto.getTargetTemperature()));
        }
        else {
            room = roomDao.getReferenceById(dto.getId());  // (9)
            room.setName(dto.getName());
            room.setFloor(dto.getFloor());
            room.setCurrentTemperature(dto.getCurrentTemperature());
            room.setTargetTemperature(dto.getTargetTemperature());
        }
        return new RoomDto(room);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        windowDao.deleteWindowsByRoom(id);
        heaterDao.deleteHeaterByRoom(id);
        roomDao.deleteById(id);
    }
    
}
