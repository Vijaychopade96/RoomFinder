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

    public List<Room> searchRoomsByLocation(String location) {
        return roomRepository.findByLocationContaining(location);
    }

//    public String findRoomOwner(){
//        return roomRepository.findAll();
//    }
}
