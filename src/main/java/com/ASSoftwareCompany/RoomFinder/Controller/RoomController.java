package com.ASSoftwareCompany.RoomFinder.Controller;

import com.ASSoftwareCompany.RoomFinder.Model.Room;
import com.ASSoftwareCompany.RoomFinder.Service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/search")
    public List<Room> searchRooms(@RequestParam String location) {
        return roomService.searchRooms(location);
    }

    @PostMapping("/add")
    public Room addRoom(@RequestBody Room room) {
        return roomService.addRoom(room);
    }
}
