package com.ASSoftwareCompany.RoomFinder.Repository;

import com.ASSoftwareCompany.RoomFinder.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByLocation(String location);

    Room save(Room room);

    List<Room> findByLocationContaining(String location);
}
