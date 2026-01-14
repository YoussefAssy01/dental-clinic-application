package com.example.dentalclinicspringboot.controller;
import com.example.dentalclinicspringboot.model.Room;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    List<Room> rooms = new ArrayList<>();

    public RoomController(){
        rooms.add(new Room(1));
        rooms.add(new Room(2));
    }
    @GetMapping
    public List<Room> getRooms(){
        return this.rooms;
    }

    @GetMapping("{id}")
    public Room getRoomById(@PathVariable int id){
        for (Room room : rooms) {
            if (room.getId() == id)
                return room;
        }
        return new Room(0);
    }

    @DeleteMapping("{id}")
    public void delRoomById(@PathVariable int id){
        rooms.removeIf(room -> room.getId() == id);
    }

    @PostMapping
    public void addRoom(@RequestBody Room room){
        rooms.add(room);
    }
}
