package com.ASSoftwareCompany.RoomFinder.Service;

import com.ASSoftwareCompany.RoomFinder.Model.Room;
import com.ASSoftwareCompany.RoomFinder.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> searchRooms(String location) {
        return roomRepository.findByLocation(location);
    }

    public Room addRoom(Room room) {
        return roomRepository.save(room);
    }
}
