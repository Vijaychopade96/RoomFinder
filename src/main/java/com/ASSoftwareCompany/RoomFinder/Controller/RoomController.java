package com.ASSoftwareCompany.RoomFinder.Controller;

import com.ASSoftwareCompany.RoomFinder.Model.Inquiry;
import com.ASSoftwareCompany.RoomFinder.Model.Room;
import com.ASSoftwareCompany.RoomFinder.Model.RoomOwner;
import com.ASSoftwareCompany.RoomFinder.Repository.InquiryRepository;
import com.ASSoftwareCompany.RoomFinder.Repository.RoomOwnerRepository;
import com.ASSoftwareCompany.RoomFinder.Repository.RoomRepository;
import com.ASSoftwareCompany.RoomFinder.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private RoomService roomService;

    private RoomOwnerRepository roomOwnerRepository;

    @Autowired
    private InquiryRepository inquiryRepository;

    @GetMapping("/search")
    public List<Room> searchRooms(@RequestParam String location) {
        return roomService.searchRoomsByLocation(location);
    }

    @PostMapping("/{roomId}/inquire")
    public Inquiry createInquiry(@PathVariable Long roomId, @RequestBody Inquiry inquiry) {
        inquiry.setRoom(roomRepository.findById(roomId).orElseThrow(() -> new RuntimeException("Room not found")));
        return inquiryRepository.save(inquiry);
    }

    @PostMapping("/registerOwnerWithRooms")
    public ResponseEntity<?> registerOwnerWithRooms(@RequestBody RoomOwner roomOwner) {
        System.out.println("Received RoomOwner: " + roomOwner);
        if (roomOwner.getRooms() == null) {
            return ResponseEntity.badRequest().body("Rooms cannot be null");
        }

        // Proceed with processing
        return ResponseEntity.ok("Success");
    }


}
